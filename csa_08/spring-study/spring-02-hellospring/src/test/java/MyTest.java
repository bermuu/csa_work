import com.mu.pojo.hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        //获取speing上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //对象全部在spring中管理
        hello helloBean =(hello) context.getBean("hello");
        System.out.println(helloBean.toString());
        //结果是hello{str='Spring'}
    }
}
