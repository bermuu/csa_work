import com.mu.dao.UserDaoSqlimpl;
import com.mu.dao.UserDaoimpl;
import com.mu.servse.UserService;
import com.mu.servse.UserServiceilpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceilpl();
        ((UserServiceilpl) userService).setUserDao(new UserDaoSqlimpl());
        userService.getUser();

        ((UserServiceilpl) userService).setUserDao(new UserDaoimpl());

        userService.getUser();

        //获取ApplicationContext
       /* ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceilpl userServiceilpl = (UserServiceilpl) context.getBean("serviceImpl");
        userServiceilpl.getUser();*/
    }
}
