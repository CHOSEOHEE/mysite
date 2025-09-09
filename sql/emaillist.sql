

drop table email_log;
drop table email;
desc email_log;

-- select * from email_log;

-- insert
insert into email_log values (current_date(),1);

-- update
update email_log set count = count + 1 where reg_date = current_date();
update email_log set count = count - 1 where reg_date = current_date ('');

select * from user;

alter table user add column rolr enum('USER', 'ADMIN') default 'USER' NOT NULL;
desc user;

insert into user values(null, '관리자', 'admin@mysite.com', password('1234'),  


