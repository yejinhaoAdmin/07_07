package demo;

import java.util.List;

public interface tb_myROLEDAO {
  
	//使用SQL语句查询角色名称为’super管理员’的用户id和姓名
	public List<tb_myROLE> selectidandname(tb_myROLE myROLE);
	//使用SQL语句查询角色id为’3’的用户姓名和其真实姓名
	public List<tb_myROLE> selectid(tb_myROLE myROLE);
	//使用SQL语句查询角色id不为’3’的用户姓名和其真实姓名
	public List<tb_myROLE> selectnotid(tb_myROLE myROLE);
	//查询拥有角色的用户人数
    public 	int  selectcount();
    //查询拥有角色超过两个的用户信息
    public List<tb_myROLE> select(tb_myROLE myROLE);
}
