package com.hz.ssm.dao;

import com.hz.ssm.pojo.SetUserRole;
import com.hz.ssm.pojo.SetUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetUserRoleMapper {
    int countByExample(SetUserRoleExample example);

    int deleteByExample(SetUserRoleExample example);

    int insert(SetUserRole record);

    int insertSelective(SetUserRole record);

    List<SetUserRole> selectByExample(SetUserRoleExample example);

    int updateByExampleSelective(@Param("record") SetUserRole record, @Param("example") SetUserRoleExample example);

    int updateByExample(@Param("record") SetUserRole record, @Param("example") SetUserRoleExample example);
}