drop database if exists userdb;
create database if not exists userdb;
use userdb;

create table users(
    uid int primary key auto_increment,
    uname varchar(20) not null unique,
    pwd varchar(6) not null,
    email varchar(40),
    name varchar(20),
    sex int,
    telephone varchar(11)
);


