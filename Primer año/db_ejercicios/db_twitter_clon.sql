DROP DATABASE IF EXISTS twitter_db;
CREATE DATABASE twitter_db;
USE twitter_db;

DROP TABLE IF EXISTS users;
CREATE TABLE users (
	user_id INT NOT NULL AUTO_INCREMENT,
    user_handle VARCHAR(50) NOT NULL UNIQUE,
    email_address VARCHAR(50) NOT NULL UNIQUE,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    phonenumber VARCHAR(50) UNIQUE,
    created_at TIMESTAMP NOT NULL DEFAULT (NOW()),
    PRIMARY KEY(user_id)
    );
INSERT INTO users(user_handle,email_address,first_name,last_name,phonenumber)
VALUES
('midudev','midudev@gmail.com','Miguel','Angel','21891298'),
('braiandev','braiandev@mail.com','Braian','Axel','1231235'),
('rogerdev','rogerdev@mail.com','Roger','Javier','2213213'),
('lautidev','lautarodev@mail.com','Lautaro','Emir','2213243213'),
('miadev','miadev@mail.com','Mia','Geraldine','22130903');

DROP TABLE IF EXISTS followers;
CREATE TABLE followers(
follower_id INT NOT NULL,
following_id INT NOT NULL,
FOREIGN KEY(follower_id) REFERENCES users(user_id),
FOREIGN KEY(following_id) REFERENCES users(user_id),
PRIMARY KEY(follower_id, following_id)
);
-- Desde la version 8 de mySQL
-- Se pueden añadir contrains para hacer checks
ALTER TABLE followers
ADD CONSTRAINT check_followers_id
CHECK (follower_id != following_id);

INSERT INTO followers(follower_id, following_id)
VALUES
(1, 2),
(2, 3),
(1, 3),
(1, 4);

-- Creando consultas sencillas
/*
SELECT follower_id, following_id FROM followers;
SELECT following_id FROM followers WHERE follower_id = 1;
SELECT COUNT(follower_id) AS followers FROM followers WHERE following_id = 1;
*/
-- Top 3 usuarios pero haciendo JOIN
/*
SELECT users.user_id, users.user_handle, users.first_name, following_id, COUNT(follower_id) AS followers
from followers -- Seria la table primaria
JOIN users ON users.user_id = followers.following_id
GROUP BY following_id
ORDER BY followers DESC
LIMIT 3;
*/
DROP TABLE IF EXISTS tweets;
CREATE TABLE tweets(
tweet_id INT NOT NULL AUTO_INCREMENT,
user_id INT NOT NULL,
tweet_text VARCHAR (280) NOT NULL,
num_likes INT DEFAULT 0,
num_comments INT DEFAULT 0,
created_at TIMESTAMP NOT NULL DEFAULT (NOW()),
FOREIGN KEY(user_id) REFERENCES users(user_id),
PRIMARY KEY(tweet_id)
);
INSERT INTO tweets(user_id, tweet_text)
VALUES
(1, 'Hola soy midu dev! ¿Qué tal?'),
(2,'Entrando a twitter, ¡Que genial!'),
(3,'Este es mi primer tweet, ¡Estoy feliz!'),
(4,'Hoy dicen que va hacer mucho calor'),
(5, 'Estoy tomando un café escuchando música, si que la paso bien');

-- Obtener los tweets de todos los usuarios que tienen mas de 2 seguidores
/*
SELECT tweet_id, tweet_text, user_id
FROM tweets
WHERE user_id IN(
	SELECT following_id
    FROM followers
    GROUP BY following_id
    HAVING COUNT(*) > 1
    );
*/    
-- DELETE
-- SET SQL_SAFE_UPDATES = 0;
/*DELETE FROM tweets WHERE tweet_id = 1;
DELETE FROM tweets WHERE user_id = 1;*/
-- Este campo borraria todos los tweets que tengan un valor en el campo igual a "hoy"
-- DELETE FROM tweets WHERE tweet_text LIKE '%Hoy%';
-- Para poder borrarla hay que habilitar el sql_safe_updates

-- UPDATE
/*UPDATE tweets SET  num_comments = num_comments + 1 WHERE tweet_id = 2;
UPDATE tweets SET num_likes = num_likes + 1 WHERE tweet_id = 2;
SELECT * FROM tweets WHERE tweet_id = 2;*/
-- REEMPLAZAR TEXTO
/*UPDATE tweets SET tweet_text = REPLACE(tweet_text, 'twitter', 'threads')
WHERE tweet_text LIKE '%twitter%';
SELECT * FROM tweets;
*/

DROP TABLE IF EXISTS tweet_likes;
CREATE TABLE tweet_likes(
	user_id INT NOT NULL,
    tweet_id INT NOT NULL,
    FOREIGN KEY(user_id) REFERENCES users(user_id),
    FOREIGN KEY(tweet_id) REFERENCES tweets(tweet_id),
    PRIMARY KEY (user_id, tweet_id)
);

INSERT INTO tweet_likes (user_id, tweet_id) VALUES
(1,2),
(2,1),
(1,1),
(3,1),
(4,1),
(3,2);

-- Obtener el número de likes de cada tweet
SELECT tweet_id, COUNT(*) AS like_count
FROM tweet_likes
GROUP BY tweet_id
ORDER BY like_count DESC;

-- TIGGRER
DELIMITER $$;
CREATE TRIGGER increment_follower_count
 AFTER INSERT ON followers
 FOR EACH ROW
 BEGIN
	UPDATE users SET follower_count = follower_count + 1
    WHERE user_id = NEW.following_id;
END$$
DELIMITER ;
DELIMITER $$;
CREATE TRIGGER decrement_follower_count
 AFTER DELETE ON followers
 FOR EACH ROW
 BEGIN
	UPDATE users SET follower_count = follower_count - 1
    WHERE user_id = NEW.following_id;
END$$
DELIMITER ;

