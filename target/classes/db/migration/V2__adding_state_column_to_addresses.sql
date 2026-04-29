alter table addresses
    add state varchar(255) not null;

alter table addresses
drop constraint addresses_pk;

alter table addresses
    add constraint addresses_pk
        primary key (id);