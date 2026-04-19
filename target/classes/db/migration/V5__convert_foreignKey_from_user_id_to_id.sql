alter table profile
    add constraint profile_profile_id_fk
        foreign key (id) references profile;
