import com.mu.mapper.UserMapper;
import com.mu.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.apache.ibatis.io.Resources.getResourceAsStream;

public class MyTest {
    public static void main(String[] args) throws IOException {
        ApplicationContext contest = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserMapper userMapper = contest.getBean("userMapper2",UserMapper.class);
        for(User user : userMapper.selectUser()){
            System.out.println("[打印]"+user);
        }
    }
}
