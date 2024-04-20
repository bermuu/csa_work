import com.mu.config.muconfig2;
import com.mu.pojo.User;
import com.sun.tools.javac.Main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(muconfig2.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user.toString());
    }
}
