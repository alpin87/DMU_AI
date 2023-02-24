use dmuservice;


 -- 테이블 전체 드롭 주의 --------------------------------------------
SET @tables = NULL;
SELECT GROUP_CONCAT(table_schema, '.', table_name) INTO @tables
  FROM information_schema.tables
  WHERE table_schema = 'dmuservice'; -- specify DB name here.

SET @tables = CONCAT('DROP TABLE ', @tables);
PREPARE stmt FROM @tables;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;
 -- -------------------------------------------------------------


 -- 테이블 조회 --------------
select * from dmu_member;
select * from division;



-- 건들지말것 --------------------
SET foreign_key_checks = 0;
SET foreign_key_checks = 1;
 -- --------------------------


DROP TABLE  if exists mainrantal;
DROP TABLE  if exists rantal;
DROP TABLE  if exists mainrental;
DROP TABLE  if exists auth;
DROP TABLE  if exists announcement;
DROP TABLE  if exists DMU_Member;
DROP TABLE  if exists dmu_member;
DROP TABLE  if exists department;
DROP TABLE  if exists division;
DROP TABLE  if exists notice;


CREATE TABLE mainrental (
	Member_grade_id	bigint	NOT NULL,
	contect	VARCHAR(255)	NULL,
	img	VARCHAR(255)	NULL,
	good	VARCHAR(255)	NULL
);

CREATE TABLE rantal (
	Member_grade_id	bigint	NOT NULL,
	Post	VARCHAR(255)	NULL,
	Product	VARCHAR(255)	NULL,
	Price	VARCHAR(255)	NULL,
	Type	VARCHAR(255)	
);

CREATE TABLE member_grade (
	member_grade_id	bigint	NOT NULL AUTO_INCREMENT,
	member_grade_name varchar(10),
    primary key(Member_grade_id)
);

CREATE TABLE announcement (
	member_grade_id	bigint	NOT NULL,
	mainfield	VARCHAR(255)	NULL,
	file		VARCHAR(255)	NULL,
	img			VARCHAR(255)	NULL
);

create table division(
	div_id bigint AUTO_INCREMENT,
    div_name varchar(15),
    primary key(div_id)
	
);


CREATE TABLE department (
    dept_id  bigint AUTO_INCREMENT,
    dept_name varchar(15),
    div_id bigint,
    primary key(dept_id),
    foreign key(div_id) references division(div_id)
);

CREATE TABLE dmu_member (
	member_code bigint AUTO_INCREMENT,
	member_grade_id	bigint ,			-- 권한
	email	VARCHAR(40)	NOT NULL, 			-- 이름
	member_password	VARCHAR(60)	NOT NULL,   -- 비밀번호
	dept_id	bigint, 		-- 학과
    primary key(member_code),
    foreign key(dept_id) references department(dept_id),
    foreign key(member_grade_id) references member_grade(member_grade_id)
);


CREATE TABLE notice (
	notice_id	    Long	        NOT NULL,
	notice_title	    VARCHAR(20)		NULL,
	notice_author	VARCHAR(20)		NULL,
	notice_content	TEXT			NULL,
	notice_date      DATE NOT NULL
);


 -- 유저와 권한확인 
select Host,User,plugin,authentication_string FROM mysql.user;
