package demo;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//��װSqlSession����������
public class MybatisUtil {
	static SqlSessionFactory sessionFactory = null;
	static{
		try {
			InputStream is = 
					Resources.getResourceAsStream("mybatis-config.xml");
					//ʵ��������Builder
					SqlSessionFactoryBuilder builder = 
							new SqlSessionFactoryBuilder();
					sessionFactory = builder.build(is);//����MyBatis���õ�����
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static SqlSession getSqlSession() {
		System.out.println("��ȡSqlSession");
		return sessionFactory.openSession();
	}
	
	public static void closeSqlSession(SqlSession session) {
		System.out.println("�ر�SqlSession");
		 if (session != null) {
			session.close();
		}
	}
}
