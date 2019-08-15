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
	 * 针对不能注入工厂的问题：
	 * 是因为mybatis-spring的jar包，在1.2之后，为了兼容更多的数据源，对实现做了一些调整，取消了自动注入(if (!this.externalSqlSession)这个判断就是起这个作用的)
	 * 这里，解决办法：
	 * 1.spring设定默认装配方式（app.xml中设置）;
	 * 2.app.xml文件中通过bean标签来创建dao对象;
	 * 3.在dao实现类中，重写setSqlSessionFactory方法，如下
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
