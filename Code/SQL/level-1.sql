

create database chaplin_theaters;
-- drop database chaplin_theaters;

use chaplin_theaters;

create table movies(
id int primary key,
title varchar(50),
genre varchar(15),
duration int 
);

-- drop table movies;

alter table movies add column ratings int;
alter table movies drop column ratings;



insert into movies(id,title,genre,duration) values (1,'Metropolis','Sci-Fi',153);
insert into movies values (2,'Nosferatu','Horror',94);
insert into movies values (3,'The Kid','Comedy',68);
insert into movies values (4,'The Gold Rush','Adventure',95);
insert into movies values (5,'The Circus','Comedy',71);
insert into movies(id,title,duration) values (6,'The Fly',71);


select title from movies;
select title,genre from movies;
select id,title,genre,duration from movies;
select * from movies;


select title from movies where id=2;
select * from movies where title='The Kid';

select title from movies order by duration;
select title from movies order by duration desc;

select * from movies where duration=100;
select * from movies where duration>100;

select * from movies where genre <> 'Horror';


delete from movies where id=6;

-- delete from movies;


update movies set genre='Romance' where id=5;









