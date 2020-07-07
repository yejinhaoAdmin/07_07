package demo;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class tb_myROLEDAOimpl implements tb_myROLEDAO {
	
	
	//使用SQL语句查询角色名称为’super管理员’的用户id和姓名
	@Override
	public List<tb_myROLE> selectidandname(tb_myROLE myROLE) {
		List<tb_myROLE> list=null;
		try {
			SqlSession session=MybatisUtil.getSqlSession();
			tb_myROLEDAO dao=	session.getMapper(tb_myROLEDAO.class);
			list=dao.selectidandname(myROLE);
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<tb_myROLE> selectid(tb_myROLE myROLE) {
		List<tb_myROLE> list=null;
		try {
			SqlSession session=MybatisUtil.getSqlSession();
			tb_myROLEDAO dao=	session.getMapper(tb_myROLEDAO.class);
			list=dao.selectid(myROLE);
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<tb_myROLE> selectnotid(tb_myROLE myROLE){
		List<tb_myROLE> list=null;
		try {
			SqlSession session=MybatisUtil.getSqlSession();
			tb_myROLEDAO dao=	session.getMapper(tb_myROLEDAO.class);
			list=dao.selectnotid(myROLE);
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int selectcount() {
		int  count =0;
		try {
			SqlSession session=MybatisUtil.getSqlSession();
			tb_myROLEDAO dao=	session.getMapper(tb_myROLEDAO.class);
			count=dao.selectcount();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public List<tb_myROLE> select(tb_myROLE myROLE) {
		List<tb_myROLE> list=null;
		try {
			SqlSession session=MybatisUtil.getSqlSession();
			tb_myROLEDAO dao=	session.getMapper(tb_myROLEDAO.class);
			list=dao.select(myROLE);
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
