import com.mu.mapper.UserMapper;
import com.mu.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MyTest {
    public static void main(String[] args) throws IOException {
        ApplicationContext contest = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserMapper userMapper = contest.getBean("userMapper",UserMapper.class);
        for(User user : userMapper.selectUser()){
            System.out.println("[打印]"+user);
        }
        /*Integer i = 2;
        userMapper.deleteUser(i);*/
    }
}