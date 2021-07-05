

create database todos_db;
use todos_db;


create table todos(

	id int primary key auto_increment,
	title varchar(256),
	completed boolean

)

