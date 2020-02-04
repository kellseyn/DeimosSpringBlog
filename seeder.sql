drop database if exists springblog_db;

create database springblog_db;

use springblog_db;

show tables;

describe posts;
describe post_details;

Select * from posts;



insert into posts (title, body, user_id) values
  ('This is Pocky', 'He is heckin big chonker.', 1),
  ('This is Rocky', 'He is the old man in the fam and predecessor to Pocky.', 1),
  ('This is not a cat', 'What is this?', 1);



insert into post_details (is_awesome, history_of_post, topic_description) values
  (true, 'Post 1 history', 'Topic for 1'),
  (true, 'Post 2 history', 'Topic for 2'),
  (false, 'Post 3 history', 'Topic for 3');



insert into  post_images (image_title, url, post_id) values
  ('Pocky', 'https://cdn.discordapp.com/attachments/557291312404103194/625856327071170570/20190923_182814.jpg', 1),
  ('Rocky', 'https://cdn.discordapp.com/attachments/557291312404103194/586599939866361876/20190606_200438.jpg', 1),
  ('Hammy', 'https://cdn.discordapp.com/attachments/235063126314319872/637658501736300594/IMG_20191025_215551.jpg', 3);

insert into users (email, password, username) VALUES
  ('admin@gmail.com', 'admin', 'admin');



