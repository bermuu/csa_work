import com.mu.pojo.Student;
import com.mu.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student)context.getBean("student");
        System.out.println(student.toString());
        ApplicationContext context1 = new ClassPathXmlApplicationContext("userBean.xml");
        User user = context1.getBean("user1", User.class);
        System.out.println(user);
    }
}
