
create table users(
id int not null auto_increment,
username varchar(45) not null,
password varchar(45) not null,
enable int not null,
primary key(id)
);


create table authorities(
id int not null auto_increment,
username varchar(45) not null,
authority varchar(45) not null,
primary key(id)
);

insert into users values(null,'happy','12345','1');
insert into authorities values(null,'happy','write');
