package koan.dao.impl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import koan.dao.IUsersDAO;
import koan.pojo.Users;
@Repository
public class UsersDAOImpl extends SqlSessionDaoSupport implements IUsersDAO {
	
	/**
	 * ��Բ���ע�빤�������⣺
	 * ����Ϊmybatis-spring��jar������1.2֮��Ϊ�˼��ݸ��������Դ����ʵ������һЩ������ȡ�����Զ�ע��(if (!this.externalSqlSession)����жϾ�����������õ�)
	 * �������취��
	 * 1.spring�趨Ĭ��װ�䷽ʽ��app.xml�����ã�;
	 * 2.app.xml�ļ���ͨ��bean��ǩ������dao����;
	 * 3.��daoʵ�����У���дsetSqlSessionFactory����������
	 * 
	 */
	/*@Resource
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}*/

	public Users findUsersByNameAndName(Users users) {
		
		return super.getSqlSession().selectOne("koan.pojo.Users.findUserByNameAndPwd", users);
	}

}
