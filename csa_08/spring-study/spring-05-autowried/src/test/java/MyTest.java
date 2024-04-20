import com.mu.pojo.people;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        people people = context.getBean("people", people.class);
        people.getPetdog().shout();
        people.getPetcat().shout();
    }
}
