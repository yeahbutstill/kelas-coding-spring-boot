create table person (
    id integer not null,
    name varchar(255) not null,
    location varchar(255),
    birth_date timestamp,
    primary key(id)
);

insert into person(ID, NAME, LOCATION, BIRTH_DATE)
values(1001, 'Dani', 'Depok, Indonesia', sysdate());
insert into person(ID, NAME, LOCATION, BIRTH_DATE)
values(1002, 'Maya', 'Depok, Indonesia', sysdate());
insert into person(ID, NAME, LOCATION, BIRTH_DATE)
values(1003, 'Winda', 'Citayam, Indonesia', sysdate());