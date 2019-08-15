package koan.dao;

import koan.pojo.Users;

public interface IUsersDAO {

	public Users findUsersByNameAndName(Users users);
}
