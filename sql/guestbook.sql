select id, 
			name, 
			message, 
			date_format(reg_date, '%Y-%m-%d %h:%i:%s') as regDate
			from guestbook 
			order by reg_date desc;
            
select * from user;