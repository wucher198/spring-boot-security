insert into USER_PROFILE values (1, 'ADMIN');
insert into USER_PROFILE values (2, 'USER');

insert into USER (id, username, password) values (1, 'admin', '$2a$10$49FxFyGhPjsrHu4YSTGXt.4ej74SDv2sKSLV6hWN3zgVfDbfK/YW2');
insert into USER (id, username, password) values (2, 'user', '$2a$10$49FxFyGhPjsrHu4YSTGXt.4ej74SDv2sKSLV6hWN3zgVfDbfK/YW2');

insert into USER_TO_USER_PROFILE (user_id, user_profile_id) values (1, 1);
insert into USER_TO_USER_PROFILE (user_id, user_profile_id) values (1, 2);
insert into USER_TO_USER_PROFILE (user_id, user_profile_id) values (2, 2);