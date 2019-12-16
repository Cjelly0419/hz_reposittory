package com.hz.ssm.dao;

import com.hz.ssm.pojo.Rights;
import com.hz.ssm.pojo.Role;
import com.hz.ssm.pojo.Users;
import com.hz.ssm.pojo.UsersExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
    int countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(String userid);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    
    /**
     * 根据用户Id查询对应的角色信息
     * @return
     */
    List<Role>  findRoleInfoByUserId(String userid);
    
    
    /**
     * 根据用户Id查询对应的权限信息
     * @param userid
     * @return
     */
    List<Rights>  findRightsInfoByUserId(String userid);
    
    
}