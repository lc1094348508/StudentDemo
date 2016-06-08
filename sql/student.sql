SHOW DATABASES ;
DROP DATABASE IF EXISTS student;

CREATE DATABASE student;

# table admin
DROP TABLE IF EXISTS student.admin;
CREATE TABLE student.admin (
id       INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY
COMMENT 'PK',
username VARCHAR(255) NOT NULL UNIQUE
COMMENT '姓名',
password VARCHAR(255) NOT NULL
COMMENT '密码'
)
COMMENT '管理员表';
INSERT INTO student.admin VALUES (NULL ,'admin','13do3DeGj6b8Nxf0l3J/ER05/yQzbHHPkaIhb4m01fp0nj14OrJEIts4K2qZ3m');

#-------------------------------------------

# table class
DROP TABLE IF EXISTS student.class;
CREATE TABLE student.class (
  id       INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY
  COMMENT 'PK',
  title VARCHAR(255) NOT NULL UNIQUE
  COMMENT '班级名称',
  email VARCHAR(255) NOT NULL
  COMMENT '班级邮箱',
  post VARCHAR(2048)
  COMMENT '班级公告'
)
  COMMENT '班级表';

#-------------------------------------------
# table student
DROP TABLE IF EXISTS student.student;
CREATE TABLE student.student (
  id       INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY
  COMMENT 'PK',
  username VARCHAR(255) NOT NULL UNIQUE
  COMMENT '用户名唯一',
  password VARCHAR(255) NOT NULL
  COMMENT '密码',
  name VARCHAR(255)
  COMMENT '姓名',
  gender CHAR(1)
  COMMENT '性别 m-male,f-female',
  age INT(3)
  COMMENT '年龄',
  email VARCHAR(255)
  COMMENT '个人邮箱',
  phone VARCHAR(255)
  COMMENT '联系电话',
  hobby VARCHAR(255)
  COMMENT '爱好',
  information VARCHAR(2048)
  COMMENT '个人简介',
  classId INT UNSIGNED
  COMMENT 'PK'
)
  COMMENT '学院表';
#-------------------------------------------

# table teacher
DROP TABLE IF EXISTS student.teacher;
CREATE TABLE student.teacher (
  id       INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY
  COMMENT 'PK',
  username VARCHAR(255) NOT NULL UNIQUE
  COMMENT '用户名唯一',
  password VARCHAR(255) NOT NULL
  COMMENT '密码',
  name VARCHAR(255)
  COMMENT '姓名',
  gender CHAR(1)
  COMMENT '性别 m-male,f-female',
  age INT(3)
  COMMENT '年龄',
  email VARCHAR(255)
  COMMENT '个人邮箱',
  phone VARCHAR(255)
  COMMENT '联系电话',
  course VARCHAR(255)
  COMMENT '授课内容',
  information VARCHAR(2048)
  COMMENT '教师简介',
  classId INT UNSIGNED
  COMMENT 'PK'
)
  COMMENT '学院表';

ALTER TABLE student.student
ADD CONSTRAINT
  fk_student_classId
FOREIGN KEY (classId)
REFERENCES student.class (id);

ALTER TABLE student.teacher
ADD CONSTRAINT
  fk_teacher_classId
FOREIGN KEY (classId)
REFERENCES student.class (id);