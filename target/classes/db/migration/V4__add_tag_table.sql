create table public.tag
(
    id   bigserial primary key,
    name varchar(255) not null
);

create table public.user_tags
(
    user_id bigint not null
        constraint user_tags_user_fk
            references users on delete cascade,

    tag_id  bigint not null
        constraint user_tags_tag_fk
            references tag on delete cascade,

    primary key (user_id, tag_id)
);