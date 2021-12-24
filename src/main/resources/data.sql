create table person
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);

insert into person (id,name, location,birth_date)
values(100001,'Juan', 'Mexico', sysdate()),
(100002,'Jaime', 'Mexico', sysdate()),
(100003,'Jose', 'Mexico', sysdate()),
(100004,'Jeronimo', 'Mexico', sysdate());