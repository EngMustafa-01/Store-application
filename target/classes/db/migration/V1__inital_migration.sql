create table users
(
    id       bigserial
        constraint user_pk
            primary key,
    name     varchar(255) not null,
    email    varchar(255) not null,
    password varchar(255) not null
);

create table addresses
(
    id      bigserial
        constraint addresses_pk
            primary key,
    street  varchar(255) not null,
    city    varchar(255) not null,
    zip     varchar(255),
    user_id bigint
        constraint addresses_users_id_fk
            references users
);


