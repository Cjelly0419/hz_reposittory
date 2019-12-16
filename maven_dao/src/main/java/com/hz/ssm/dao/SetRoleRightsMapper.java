package com.hz.ssm.dao;

import com.hz.ssm.pojo.SetRoleRights;
import com.hz.ssm.pojo.SetRoleRightsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetRoleRightsMapper {
    int countByExample(SetRoleRightsExample example);

    int deleteByExample(SetRoleRightsExample example);

    int insert(SetRoleRights record);

    int insertSelective(SetRoleRights record);

    List<SetRoleRights> selectByExample(SetRoleRightsExample example);

    int updateByExampleSelective(@Param("record") SetRoleRights record, @Param("example") SetRoleRightsExample example);

    int updateByExample(@Param("record") SetRoleRights record, @Param("example") SetRoleRightsExample example);
}