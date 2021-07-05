

create database todos_db;
use todos_db;


create table users(
	id int primary key auto_increment,
	name varchar(256)
)

create table todos(
	id int primary key auto_increment,
	title varchar(256),
	completed boolean,
	user_id int references users,
);





