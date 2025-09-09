desc email_log;

select * from email;
select * from email_log;

delete from email;
delete from email_log;

insert into email_log values(current_date(), 1);

update email_log set count = count + 1 where reg_date = current_date();


select * from board where g_no = 3;