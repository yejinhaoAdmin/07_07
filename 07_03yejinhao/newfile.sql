--�ֱ��û������ţ����������룬��ʵ����
create table tb_myuser(
id number primary key,
username varchar2(10) not null,
pwd number not null,
realname varchar2(10) not null
)   

insert  into tb_myuser values(1,'admin','123','����')
insert  into tb_myuser values(2,'xiaoming','321','С��')
insert  into tb_myuser values(3,'liudehua','222','���»�')


--USERID,ROLEID�ֱ����T_USER�û���Ĺ����ֶΣ�T_ROLE��ɫ��Ĺ����ֶ�
create table t_user_role (
userid number  not null,
roleid number not null,
 foreign key (userid) references tb_myuser (id),
 foreign key (roleid) references tb_myROLE (t_id)
) 

insert into t_user_role values(1,1)
insert into t_user_role values(2,1)
insert into t_user_role values(3,2)



--ID,ROLENAME,DEMO�ֱ�����ɫ��ţ���ɫ���ƣ���ɫ����
create table  tb_myROLE(
t_id number primary key,
t_rolename  varchar2(100) not null,
t_demo  varchar2(100) not null
)     
insert  into tb_myROLE values(1,'super����Ա','��ɫ����') 
insert  into tb_myROLE values(2,'Ա��','��ɫ����') 
insert  into tb_myROLE values(3,'����','��ɫ����') 


--(1) ʹ��SQL����ѯ��ɫ����Ϊ��super����Ա�����û�id��������
  select 
            * 
        from 
            tb_myuser p
        inner join  
            t_user_role m
        on
            p.id=m.userid
        inner join
            tb_myROLE a
        on
            m.userid=a.t_id
		where a.t_rolename='super����Ա'
--(2) ʹ��SQL����ѯ��ɫidΪ��3�����û�����������ʵ����;
  select 
            * 
        from 
            tb_myuser p
        inner join  
            t_user_role m
        on
            p.id=m.userid
        inner join
            tb_myROLE a
        on
            m.userid=a.t_id
		where a.t_id='1'
--(3) ʹ��SQL����ѯ��ɫid��Ϊ��3�����û�����������ʵ����;

  select 
            * 
        from 
            tb_myuser p
        inner join  
            t_user_role m
        on
            p.id=m.userid
        inner join
            tb_myROLE a
        on
            m.userid=a.t_id
		where a.t_id!='3'
--(4) ��ѯӵ�н�ɫ���û�����
 SELECT
   count(*)
  FROM tb_myuser
  WHERE id in (
   SELECT userid
   FROM t_user_role
  )
 -- ��ѯӵ�н�ɫ�����������û���Ϣ
  SELECT
   t1.*
  FROM tb_myuser t1
  WHERE id in (
   SELECT userid
   FROM t_user_role
   WHERE (
    SELECT count(*)
    FROM t_user_role 
    GROUP BY userid
   )>2
  ) 
  

  










