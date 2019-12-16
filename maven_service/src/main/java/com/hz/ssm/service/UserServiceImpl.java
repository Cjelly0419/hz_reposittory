package com.hz.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hz.ssm.dao.UsersMapper;
import com.hz.ssm.pojo.Rights;
import com.hz.ssm.pojo.Role;
import com.hz.ssm.pojo.Users;
import com.hz.ssm.pojo.UsersExample;
import com.hz.ssm.pojo.UsersExample.Criteria;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
	private UsersMapper usersMapper;
    /**
     * 验证登录
     */
	@Override
	public Users checkLogin(String username, String userPwd) {
		
		UsersExample example = new UsersExample();
		Criteria criteria = example.createCriteria();
		
		criteria.andUsernameEqualTo(username);
		criteria.andUserpwdEqualTo(userPwd);
		//去数据库验证用户是否存在
		List<Users> list = usersMapper.selectByExample(example );
		
		if (list != null && list.size()>0) {
			return list.get(0);
		}
		
		return null;
	}
	@Override
	public List<Role> findRoleInfoByUserId(String userid) {
		List<Role> list = usersMapper.findRoleInfoByUserId(userid);
		
		System.out.println("roleList=="+list);
		return list;
	}
	@Override
	public List<Rights> findRightsInfoByUserId(String userid) {
		// TODO Auto-generated method stub
		return usersMapper.findRightsInfoByUserId(userid);
	}
}
