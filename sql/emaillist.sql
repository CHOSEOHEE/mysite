

drop table email_log;
drop table email;
desc email_log;

-- select * from email_log;

-- insert
insert into email_log values (current_date(),1);

-- update
update email_log set count = count + 1 where reg_date = current_date();
update email_log set count = count - 1 where reg_date = current_date ('');