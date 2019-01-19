import com.week.ssm.dao.UserDao;
import com.week.ssm.dao.UserDaoImpl;
import com.week.ssm.mapper.UserMapper;
import com.week.ssm.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;

/**
 * @author week
 * @Title: UserDaoImplTest
 * @ProjectName mavenmybatis
 * @Description: 测试用例
 * @date 2019/1/139:11
 */
public class UserMapperTest {
    private ApplicationContext applicationContext;
    /**
     * @Description: 现在是spring管理，所以要在setUp方法里得到spring的容器
     * @date 2019/1/19 13:50
     */
    @Before
    public void setUp() throws Exception{
        applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }
    @Test
    public void testFindUserById() throws Exception {


    }
}
