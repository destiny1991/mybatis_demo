CREATE TABLE mybatis.tb_role (
  id int(11) not null auto_increment,
  role_name VARCHAR(60) not null,
  create_date DATETIME not null DEFAULT CURRENT_TIMESTAMP,
  note VARCHAR(512) DEFAULT null,
  PRIMARY KEY (id)
 );

create table mybatis.tb_user (
  id int(11) not null AUTO_INCREMENT,
  user_name VARCHAR(60) not null,
  birthday date not null,
  sex VARCHAR(2) not null,
  mobile VARCHAR(20) not null,
  email VARCHAR(60) DEFAULT null,
  note VARCHAR(512) DEFAULT null,
  PRIMARY KEY (id)
);

insert into tb_role VALUES (1, "xiaoming", now(), "hahahah")

show tables;
