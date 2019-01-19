package com.week.ssm.dao;

import com.week.ssm.po.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;


/**
 * @author week
 * @Title: UserDaoImpl
 * @ProjectName mavenmybatis
 * @Description: 接口实现类
 * @date 2019/1/138:54
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{
    @Override
    public User findUserById(int id) throws Exception {
        //继承了sqlseesionDaosupport，就可以通过spring来注入，然后通过这个方法拿到sqlsession
        SqlSession sqlSeesion=this.getSqlSession();
        User user= sqlSeesion.selectOne("test.findUserById",id);
        //方法自动释放资源

        return user;
    }


}
