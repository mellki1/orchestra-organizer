INSERT INTO music (id, composer, isharp, lastdayplayed, name) VALUES (1, 'Shirley Carvalhaes', false, '2022-01-15 03:00:00', 'Vendavais');
INSERT INTO music (id, composer, isharp, lastdayplayed, name) VALUES (2, 'Harpa Crista', true, '2022-01-15 03:00:00', '115');
INSERT INTO music (id, composer, isharp, lastdayplayed, name) VALUES (4, 'Cassiane', false, '2022-01-22 03:00:00', 'Vou seguir');
INSERT INTO music (id, composer, isharp, lastdayplayed, name) VALUES (5, 'Harpa Crista', true, '2022-01-22 03:00:00', '442');
INSERT INTO music (id, composer, isharp, lastdayplayed, name) VALUES (9, 'Harpa Cristã', true, '2022-01-29 03:00:00', '525');
INSERT INTO music (id, composer, isharp, lastdayplayed, name) VALUES (12, 'Harpa Cristã', true, '2022-02-04 03:00:00', '39');
INSERT INTO music (id, composer, isharp, lastdayplayed, name) VALUES (15, 'Harpa Cristã', true, '2022-02-05 03:00:00', '200');
INSERT INTO music (id, composer, isharp, lastdayplayed, name) VALUES (6, 'Harpa Crista', true, '2022-01-22 00:00:00', '432');
INSERT INTO music (id, composer, isharp, lastdayplayed, name) VALUES (3, 'Harpa Crista', true, '2022-01-15 00:00:00', '192');
INSERT INTO music (id, composer, isharp, lastdayplayed, name) VALUES (14, 'Harpa Cristã', true, '2022-02-05 00:00:00', '304');
INSERT INTO music (id, composer, isharp, lastdayplayed, name) VALUES (10, 'Vanessa Carvalho', false, '2022-02-04 00:00:00', 'Cicatrizes');
INSERT INTO music (id, composer, isharp, lastdayplayed, name) VALUES (8, 'Harpa Cristã', true, '2022-01-29 00:00:00', '243');
INSERT INTO music (id, composer, isharp, lastdayplayed, name) VALUES (13, 'Harpa Cristã', true, '2022-02-04 00:00:00', '301');
INSERT INTO music (id, composer, isharp, lastdayplayed, name) VALUES (11, 'Sergio Lopes', false, '2022-02-19 03:00:00', 'Entre nós outra vez');
INSERT INTO music (id, composer, isharp, lastdayplayed, name) VALUES (16, 'Harpa Cristã', true, '2022-02-19 03:00:00', '545');
INSERT INTO music (id, composer, isharp, lastdayplayed, name) VALUES (7, 'Shirley Cavalhares', false, '2022-02-19 03:00:00', 'Ditosa Cidade');
INSERT INTO music (id, composer, isharp, lastdayplayed, name) VALUES (17, 'Harpa Cristã', true, '2022-02-19 03:00:00', '547');

INSERT INTO singer (id, name) VALUES (1, 'Vanessa Barros');
INSERT INTO singer (id, name) VALUES (2, 'Kellen Lima');
INSERT INTO singer (id, name) VALUES (3, 'Josiane');
INSERT INTO singer (id, name) VALUES (4, 'Sarah');
INSERT INTO singer (id, name) VALUES (5, 'Suelen');
INSERT INTO singer (id, name) VALUES (6, 'Janaina');
INSERT INTO singer (id, name) VALUES (7, 'Thiago');
INSERT INTO singer (id, name) VALUES (8, 'Jalkh');
INSERT INTO singer (id, name) VALUES (9, 'Daniel');

--
-- Data for Name: singer_music; Type: TABLE DATA; Schema: public; Owner: devUser
--

INSERT INTO singer_music (singers_id, musics_id) VALUES (6, 7);
INSERT INTO singer_music (singers_id, musics_id) VALUES (6, 5);
INSERT INTO singer_music (singers_id, musics_id) VALUES (6, 4);
INSERT INTO singer_music (singers_id, musics_id) VALUES (6, 6);
INSERT INTO singer_music (singers_id, musics_id) VALUES (3, 7);
INSERT INTO singer_music (singers_id, musics_id) VALUES (3, 5);
INSERT INTO singer_music (singers_id, musics_id) VALUES (3, 4);
INSERT INTO singer_music (singers_id, musics_id) VALUES (3, 6);
INSERT INTO singer_music (singers_id, musics_id) VALUES (14, 5);
INSERT INTO singer_music (singers_id, musics_id) VALUES (14, 4);
INSERT INTO singer_music (singers_id, musics_id) VALUES (14, 7);
INSERT INTO singer_music (singers_id, musics_id) VALUES (14, 6);
INSERT INTO singer_music (singers_id, musics_id) VALUES (10, 3);
INSERT INTO singer_music (singers_id, musics_id) VALUES (8, 4);
INSERT INTO singer_music (singers_id, musics_id) VALUES (8, 5);
INSERT INTO singer_music (singers_id, musics_id) VALUES (8, 6);
INSERT INTO singer_music (singers_id, musics_id) VALUES (8, 7);
INSERT INTO singer_music (singers_id, musics_id) VALUES (13, 5);