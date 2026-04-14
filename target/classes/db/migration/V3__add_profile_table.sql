create table public.profile
(
    id             bigserial primary key,
    user_id        bigint not null
        constraint profile_users_fk
            references public.users,
    bio            varchar(255),
    phone_number   bigint,
    date_of_birth  date,
    loyalty_points integer
);