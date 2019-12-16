package com.hz.ssm.service;

import java.util.List;

import com.hz.ssm.pojo.Rights;
import com.hz.ssm.pojo.Role;
import com.hz.ssm.pojo.Users;

public interface UserService {

	Users checkLogin(String username, String userPwd);

	List<Role> findRoleInfoByUserId(String userid);

	List<Rights> findRightsInfoByUserId(String userid);

}
