-- ONE-TO-ONE
CREATE TABLE Users
(
    user_id  int primary key,
    username varchar(50)  NOT NULL,
    email    VARCHAR(100) NOT NULL

);
CREATE TABLE UserProfiles
(
    profile_id int primary key,
    user_id    int unique,
    first_name varchar(50),
    last_name  varchar(50),
    birth_date DATE,
    FOREIGN KEY (user_id) REFERENCES Users (user_id)
);

INSERT INTO Users (user_id, username, email)
VALUES (1, 'john_doe', 'john@example.com'),
       (2, 'jane_smith', 'jane@example.com');

INSERT INTO UserProfiles (profile_id, user_id, first_name, last_name, birth_date)
VALUES (1, 1, 'John', 'Doe', '1980-01-01'),
       (2, 2, 'Jane', 'Smith', '1990-02-02');


SELECT Users.user_id,
       Users.username,
       Users.email,
       UserProfiles.profile_id,
       UserProfiles.first_name,
       UserProfiles.last_name,
       UserProfiles.birth_date
FROM Users
         INNER JOIN UserProfiles ON Users.user_id = UserProfiles.user_id;


CREATE TABLE authors(
                        author_id int primary key,
                        author_name varchar(100)
);

CREATE TABLE books
(
    book_id    int primary key,
    book_title varchar(200),
    author_id  int
        FOREIGN KEY (author_id) REFERENCES authors(author_id)
);

