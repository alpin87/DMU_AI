use dmuservice;

SET @tables = NULL;
SELECT GROUP_CONCAT(table_schema, '.', table_name) INTO @tables
  FROM information_schema.tables
  WHERE table_schema = 'dmuservice'; -- specify DB name here.

SET @tables = CONCAT('DROP TABLE ', @tables);
PREPARE stmt FROM @tables;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;

select * from dmu_member;

select * from Division;

 -- 유저와 권한확인

SET foreign_key_checks = 0;

SET foreign_key_checks = 1;
 -- 건들지말것


DROP TABLE  if exists mainrantal;
DROP TABLE  if exists rantal;
DROP TABLE  if exists mainrental;
DROP TABLE  if exists Auth;
DROP TABLE  if exists announcement;
DROP TABLE  if exists DMU_Member;
DROP TABLE  if exists dmu_member;



CREATE TABLE Department (
    dept_id  varchar(15),
    dept_name varchar(20),
    primary key(dept_id),
    foreign key(Division) references Division(div_id)
);

create table Division(
	div_id varchar(20),
    div_name varchar(20),
    primary key(div_id)
);

insert into Division values('컴퓨터소프트웨어공학과');

CREATE TABLE dmu_member (
	membercode long,
	MemberGrade	CHAR(10)	NOT NULL default 'Student',			-- 권한
	Email	VARCHAR(20)	NOT NULL, 			-- 이름
	MemberPassword	VARCHAR(60)	NOT NULL,   -- 비밀번호
	Department	VARCHAR(20), 		-- 학과
    primary key(membercode),
    foreign key(Department) references Department(dept_id) 
);

-- 학부에 학과컬럼 외래키



CREATE TABLE mainrental (
	MemberGrade	CHAR(10)	NOT NULL,
	contect	VARCHAR(255)	NULL,
	img	VARCHAR(255)	NULL,
	good	VARCHAR(255)	NULL
);

CREATE TABLE rantal (
	MemberGrade	CHAR(10)	NOT NULL,
	Post	VARCHAR(255)	NULL,
	Product	VARCHAR(255)	NULL,
	Price	VARCHAR(255)	NULL,
	Type	VARCHAR(255)	
);

CREATE TABLE Auth (
	MemberGrade	CHAR(10)	NOT NULL,
	admin	VARCHAR(255)	NULL,
	sup		VARCHAR(255)	NULL,
	prid	VARCHAR(255)	NULL,
	nomal	VARCHAR(255)	NULL,
	steff	VARCHAR(255)	NULL
);

CREATE TABLE announcement (
	MemberGrade		CHAR(10)	NOT NULL,
	mainfield	VARCHAR(255)	NULL,
	file		VARCHAR(255)	NULL,
	img			VARCHAR(255)	NULL
);



select Host,User,plugin,authentication_string FROM mysql.user;
