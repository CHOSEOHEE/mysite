--
-- user
--

desc user;

-- findAll
SELECT id FROM user WHERE id = 1;

-- 회원리스트
 select * from user;

-- 회원가입
insert into user(name, email, password, gender, join_date) values ('둘리', 'dooly@gmail.com', password('1234'), 'male', current_date());

-- 삭제
 delete from user where id = 1;
 
 -- 추가
 INSERT INTO user(name, email, password, gender, join_date) 
VALUES ('둘리', 'dooly@gmail.com', PASSWORD('1234'), 'male', CURRENT_DATE());

--
-- board
--

desc board;

alter table board modify id int not null auto_increment;

-- findAll
 select * from board order by id desc;
ALTER TABLE board 
MODIFY reg_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP;
ALTER TABLE board
MODIFY COLUMN g_no INT NOT NULL;

-- deleteByIdDepthGroupAndUser
delete from board where id = 3 and depth = 0 and g_no =0 and user_id = 1;

-- insert
INSERT INTO board (title, contents, hit, g_no, o_no, depth, user_id)
VALUES ('제목', '내용', 0, 1, 1, 0, 2);

