--分别用户代表编号，姓名，密码，真实姓名
create table tb_myuser(
id number primary key,
username varchar2(10) not null,
pwd number not null,
realname varchar2(10) not null
)   

insert  into tb_myuser values(1,'admin','123','张三')
insert  into tb_myuser values(2,'xiaoming','321','小明')
insert  into tb_myuser values(3,'liudehua','222','刘德华')


--USERID,ROLEID分别代表T_USER用户表的关联字段，T_ROLE角色表的关联字段
create table t_user_role (
userid number  not null,
roleid number not null,
 foreign key (userid) references tb_myuser (id),
 foreign key (roleid) references tb_myROLE (t_id)
) 

insert into t_user_role values(1,1)
insert into t_user_role values(2,1)
insert into t_user_role values(3,2)



--ID,ROLENAME,DEMO分别代表角色编号，角色名称，角色描述
create table  tb_myROLE(
t_id number primary key,
t_rolename  varchar2(100) not null,
t_demo  varchar2(100) not null
)     
insert  into tb_myROLE values(1,'super管理员','角色描述') 
insert  into tb_myROLE values(2,'员工','角色描述') 
insert  into tb_myROLE values(3,'经理','角色描述') 


--(1) 使用SQL语句查询角色名称为’super管理员’的用户id和姓名；
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
		where a.t_rolename='super管理员'
--(2) 使用SQL语句查询角色id为’3’的用户姓名和其真实姓名;
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
--(3) 使用SQL语句查询角色id不为’3’的用户姓名和其真实姓名;

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
--(4) 查询拥有角色的用户人数
 SELECT
   count(*)
  FROM tb_myuser
  WHERE id in (
   SELECT userid
   FROM t_user_role
  )
 -- 查询拥有角色超过两个的用户信息
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
  

  










