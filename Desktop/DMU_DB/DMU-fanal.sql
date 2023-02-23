
use dmu_f;


select * from dmu_Member;

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



CREATE TABLE DMU_Member (
	MemberGrade	CHAR(10)	NOT NULL default 'Student',			-- 권한
	MemberName	VARCHAR(20)	NOT NULL, 			-- 이름
	MemberPassword	VARCHAR(32)	NOT NULL,   -- 비밀번호
	Phone	CHAR(11)	NULL, 			-- 핸드폰 번호
	Email	VARCHAR(30)	NULL, 			-- 이메일
	StudentId	VARCHAR(8)	NOT NULL, 	-- 학번
	Department	VARCHAR(20)	NULL, 		-- 학과
	Division	VARCHAR(15)	NULL, 		-- 학부
    primary key(StudentId)
);

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
	division	VARCHAR(255)	NULL,
	mainfield	VARCHAR(255)	NULL,
	file		VARCHAR(255)	NULL,
	img			VARCHAR(255)	NULL
);



select Host,User,plugin,authentication_string FROM mysql.user;
