select userid,password,name,email from userinfo where userid = 'test1';
select userid,password,name,email from userinfo where userid = 'test2';
select userid,password,name,email from userinfo where userid = 'test3';
select userid,password,name,email from userinfo;
UPDATE userinfo SET name='테스형' WHERE userid='aaa';
SELECT count(*) cnt FROM userinfo WHERE userid='aaa';

select count(*) as p_count from cart c join userinfo u on c.userid = u.userid where u.userid = 'test1' and c.p_no = 1;

insert into cart(cart_no,userid,p_no,cart_qty) values(cart_cart_no_SEQ.nextval,'test1',1,1);

update cart set cart_qty = cart_qty+1 where userid = 'test1' and p_no = 1;

select * from cart c join userinfo u on c.userid = u.userid join product p on p.p_no = c.p_no where u.userid = 'test1';

COMMIT;