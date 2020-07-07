package demo;

import java.util.List;
/*--ID,ROLENAME,DEMO分别代表角色编号，角色名称，角色描述
create table  tb_myROLE(
t_id number primary key,
t_rolename  varchar2(100) not null,
t_demo  varchar2(100) not null
)   
 * 
 * */
public class tb_myROLE {
private int t_id;
private String t_rolename;
private String t_demo;
private List<tb_myuser> myusers;
public tb_myROLE() {
	super();
	// TODO Auto-generated constructor stub
}
public int getT_id() {
	return t_id;
}
public void setT_id(int t_id) {
	this.t_id = t_id;
}
public String getT_rolename() {
	return t_rolename;
}
public void setT_rolename(String t_rolename) {
	this.t_rolename = t_rolename;
}
public String getT_demo() {
	return t_demo;
}
public void setT_demo(String t_demo) {
	this.t_demo = t_demo;
}
public List<tb_myuser> getMyusers() {
	return myusers;
}
public void setMyusers(List<tb_myuser> myusers) {
	this.myusers = myusers;
}
@Override
public String toString() {
	return "tb_myROLE [t_id=" + t_id + ", t_rolename=" + t_rolename
			+ ", t_demo=" + t_demo + ", myusers=" + myusers + "]";
}

}
