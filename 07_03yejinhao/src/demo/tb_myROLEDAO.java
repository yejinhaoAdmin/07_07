package demo;

import java.util.List;

public interface tb_myROLEDAO {
  
	//ʹ��SQL����ѯ��ɫ����Ϊ��super����Ա�����û�id������
	public List<tb_myROLE> selectidandname(tb_myROLE myROLE);
	//ʹ��SQL����ѯ��ɫidΪ��3�����û�����������ʵ����
	public List<tb_myROLE> selectid(tb_myROLE myROLE);
	//ʹ��SQL����ѯ��ɫid��Ϊ��3�����û�����������ʵ����
	public List<tb_myROLE> selectnotid(tb_myROLE myROLE);
	//��ѯӵ�н�ɫ���û�����
    public 	int  selectcount();
    //��ѯӵ�н�ɫ�����������û���Ϣ
    public List<tb_myROLE> select(tb_myROLE myROLE);
}
