package com.week.ssm.mapper;

import com.week.ssm.po.User;

/**
 * @author week
 * @Title: UserDao
 * @ProjectName mavenmybatis
 * @Description: dao接口，用户管理
 * @date 2019/1/138:42
 */
public interface UserMapper {
    /**
    * @Description: 根据id查询用户信息
    * @date 2019/1/13 8:51
    */
    public User  findUserById(int id) throws Exception;

}
