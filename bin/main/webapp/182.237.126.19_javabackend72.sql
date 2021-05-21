select userid,password,name,email from userinfo where userid = 'test1';
select userid,password,name,email from userinfo where userid = 'test2';
select userid,password,name,email from userinfo where userid = 'test3';
select userid,password,name,email from userinfo;
UPDATE userinfo SET name='테스형' WHERE userid='aaa';
SELECT count(*) cnt FROM userinfo WHERE userid='aaa';

COMMIT;