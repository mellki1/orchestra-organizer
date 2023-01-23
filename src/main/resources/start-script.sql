insert into music (name,composer, isHarp, lastDayPlayed) values ('Vendavais', 'Shirley Carvalhaes', false, '2022-01-15');
insert into music (name,composer, isHarp, lastDayPlayed) values ('115', 'Harpa Crista', true, '2022-01-15');
insert into music (name,composer, isHarp, lastDayPlayed) values ('192', 'Harpa Crista', true, '2022-01-15');
insert into singer (name) values ('Vanessa Barros');
insert into singer (name) values ('Kellen Lima');
insert into singer (name) values ('Josiane');
insert into singer (name) values ('Sarah');
insert into singer (name) values ('Suelen');
insert into singer (name) values ('Janaina');

-- KELLEN E VANESSA CANTA VENDAVAIS (A PRINCIPIO É SÓ A VANESSA A KELLEN SÓ AJUDA)
insert into singer_music (singers_id, musics_id) values (1, 1);
insert into singer_music (singers_id, musics_id) values (2, 1);

-- HINOS DA HARPA
insert into singer_music (singers_id, musics_id) values (4, 2);
insert into singer_music (singers_id, musics_id) values (5, 2);
insert into singer_music (singers_id, musics_id) values (6, 2);
insert into singer_music (singers_id, musics_id) values (4, 3);
insert into singer_music (singers_id, musics_id) values (5, 3);
insert into singer_music (singers_id, musics_id) values (6, 3);