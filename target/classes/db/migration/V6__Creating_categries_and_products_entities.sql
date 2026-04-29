create table public.categories
(
    id   smallint     not null
        constraint categories_pk
            primary key,
    name varchar(255) not null
);

create table public.products
(
    id          bigserial      not null
        constraint products_pk
            primary key,
    name        varchar(255)   not null,
    price       decimal(10, 2) not null,
    category_id smallint       not null
        constraint products_categories_id_fk
        foreign key (category_id) references public.categories;
);

