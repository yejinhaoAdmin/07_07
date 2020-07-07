package demo;

import java.util.List;



/*
 * --分别用户代表编号，姓名，密码，真实姓名
create table tb_myuser(
id number primary key,
username varchar2(10) not null,
pwd number not null,
realname varchar2(10) not null
)   

 * */
public class tb_myuser {
private int id;
private String username;
private int pwd;
private String realname;
private List<tb_myROLE> myROLEs;
public tb_myuser() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getPwd() {
	return pwd;
}
public void setPwd(int pwd) {
	this.pwd = pwd;
}
public String getRealname() {
	return realname;
}
public void setRealname(String realname) {
	this.realname = realname;
}
public List<tb_myROLE> getMyROLEs() {
	return myROLEs;
}
public void setMyROLEs(List<tb_myROLE> myROLEs) {
	this.myROLEs = myROLEs;
}
@Override
public String toString() {
	return "tb_myuser [id=" + id + ", username=" + username + ", pwd=" + pwd
			+ ", realname=" + realname + ", myROLEs=" + myROLEs + "]";
}

}
