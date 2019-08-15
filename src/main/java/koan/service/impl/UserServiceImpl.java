package koan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import koan.dao.IUsersDAO;
import koan.pojo.Users;
import koan.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUsersDAO userdao;
	
	public Users islogin(Users users) {
		if (users==null) {
			return null;
		}
		if (users.getLoginname()==null||users.getLoginpwd()==null){
			return null;
		}
		return userdao.findUsersByNameAndName(users);
	}

}
