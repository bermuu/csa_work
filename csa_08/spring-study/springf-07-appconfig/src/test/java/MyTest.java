import com.mu.config.muconfig;
import com.mu.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //如果完全使用配置类方式做，那只能用AnnotationConfigApplicationContext来联系，获取容器
        ApplicationContext context = new AnnotationConfigApplicationContext(muconfig.class);
        User getuser = context.getBean("getUser", User.class);
        System.out.println(getuser.toString());
    }
}
