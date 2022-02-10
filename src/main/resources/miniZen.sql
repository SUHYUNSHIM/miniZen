SELECT * FROM minizen.manager;

select @rownum:= @rownum+1 code, m.name  담당자명, m.phone 연락처, m.email 이메일주소, m.company 소속회사
from (select @rownum:=0) r, manager m
order by code;

select m.name, m.phone, m.email, m.company, @curRow := @curRow +1 code
from manager m
join (select @curRow := 0) r;

# alter table manager drop code;
alter table manager add code int(5) primary key auto_increment first;
alter table manager modify code int(5) not null;

desc manager;

delete from manager where name like '%길동';

insert into manager values('왕길동','010-1515-1515','wkd@gmail.com','GS네오텍');
insert into manager values('황길동','010-1234-4321','hwkd@gmail.com','GS네오텍');
insert into manager values('탁길동','010-0000-0001','tkkd@gmail.com','GS네오텍');
insert into manager values('노길동','010-1313-3232','nkd@gmail.com','GS네오텍');

select * from manager;

select m.code, m.name  담당자명, m.phone 연락처, m.email 이메일주소, m.company 소속회사
from manager m;

select last_insert_id();

ALTER TABLE manager AUTO_INCREMENT=1;
SET @COUNT = 0;
UPDATE manager SET code = @COUNT:=@COUNT+1;


# 회원 가입 테이블 만들기
create table user(
    user_name varchar(20),
    user_email varchar(40),
    user_pw varchar(20),
    primary key (user_email)
)
select * from user;



