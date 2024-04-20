# Spring-01-spring介绍

## Spring介绍

在spring出现之前，程序员使用EJB开发JAVAEE应用，但是EJB开发过程十分低效和枯燥，Spring出现的初衷就是为了解决类似的这些问题。。Spring的一个最大的目的就是使JAVA EE开发更加容易。
## Spring的优势
- 非侵入式：基于Spring开发的应用中的对象可以不依赖于Spring的API
- 控制反转：IOC——Inversion of Control，指的是将对象的创建权交给 Spring 去创建。使用 Spring 之前，对象的创建都是由我们自己在代码中new创建。而使用 Spring 之后。对象的创建都是给了 Spring 框架。
- 依赖注入：DI——Dependency Injection，是指依赖的对象不需要手动调用 setXX 方法去设置，而是通过配置赋值。
- 面向切面编程：Aspect Oriented Programming——AOP

- Spring 的 web 框架是一个设计良好的 web MVC 框架，它为比如 Structs 或者其他工程上的或者不怎么受欢迎的 web 框架提供了一个很好的供替代的选择。MVC 模式导致应用程序的不同方面(输入逻辑，业务逻辑和UI逻辑)分离，同时提供这些元素之间的松散耦合。模型(Model)封装了应用程序数据，通常它们将由 POJO 类组成。视图(View)负责渲染模型数据，一般来说它生成客户端浏览器可以解释 HTML 输出。控制器(Controller)负责处理用户请求并构建适当的模型，并将其传递给视图进行渲染。
- Spring 对 JavaEE 开发中非常难用的一些 API（JDBC、JavaMail、远程调用等），都提供了封装，使这些API应用难度大大降低。
## Spring有哪些组件?

![img](D:\Typora\Spring组件)

1. ### Core Container（Spring的核心容器）
   Spring 的核心容器是其他模块建立的基础，由 Beans 模块、Core 核心模块、Context 上下文模块和 SpEL 表达式语言模块组成，没有这些核心容器，也不可能有 AOP、Web 等上层的功能。具体介绍如下。
    - Beans 模块：提供了框架的基础部分，包括控制反转和依赖注入。
    - Core 核心模块：封装了 Spring 框架的底层部分，包括资源访问、类型转换及一些常用工具类。
    - Context 上下文模块：建立在 Core 和 Beans 模块的基础之上，集成 Beans 模块功能并添加资源绑定、数据验证、国际化、Java EE 支持、容器生命周期、事件传播等。ApplicationContext 接口是上下文模块的焦点。
    - SpEL 模块：提供了强大的表达式语言支持，支持访问和修改属性值，方法调用，支持访问及修改数组、容器和索引器，命名变量，支持算数和逻辑运算，支持从 Spring 容器获取 Bean，它也支持列表投影、选择和一般的列表聚合等。



2. ### Data Access/Integration（数据访问／集成）

   数据访问／集成层包括 JDBC、ORM、OXM、JMS 和 Transactions 模块，具体介绍如下。

    - **JDBC 模块**：提供了一个 JDBC 的样例模板，使用这些模板能消除传统冗长的 JDBC 编码还有必须的事务控制，而且能享受到 Spring 管理事务的好处。
    - **ORM 模块**：提供与流行的“对象-关系”映射框架无缝集成的 API，包括 JPA、JDO、Hibernate 和 MyBatis 等。而且还可以使用 Spring 事务管理，无需额外控制事务。
    - **OXM 模块**：提供了一个支持 Object /XML 映射的抽象层实现，如 JAXB、Castor、XMLBeans、JiBX 和 XStream。将 Java 对象映射成 XML 数据，或者将XML 数据映射成 Java 对象。
    - **JMS 模块**：指 Java 消息服务，提供一套 “消息生产者、消息消费者”模板用于更加简单的使用 JMS，JMS 用于用于在两个应用程序之间，或分布式系统中发送消息，进行异步通信。
    - **Transactions 事务模块**：支持编程和声明式事务管理。

3. ### Web模块

   Spring 的 Web 层包括 Web、Servlet、WebSocket 和 Webflux 组件，具体介绍如下。

    - **Web 模块**：提供了基本的 Web 开发集成特性，例如多文件上传功能、使用的 Servlet 监听器的 IOC 容器初始化以及 Web 应用上下文。

    - **Servlet 模块**：提供了一个 Spring MVC Web 框架实现。Spring MVC 框架提供了基于注解的请求资源注入、更简单的数据绑定、数据验证等及一套非常易用的 JSP 标签，完全无缝与 Spring 其他技术协作。

    - **WebSocket 模块**：提供了简单的接口，用户只要实现响应的接口就可以快速的搭建 WebSocket Server，从而实现双向通讯。

    - **Webflux 模块**： Spring WebFlux 是 Spring Framework 5.x中引入的新的响应式web框架。与Spring MVC不同，它不需要Servlet API，是完全异步且非阻塞的，并且通过Reactor项目实现了Reactive Streams规范。Spring WebFlux 用于创建基于事件循环执行模型的完全异步且非阻塞的应用程序。

    - **Portlet 模块**：提供了在 Portlet 环境中使用 MVC 实现，类似 Web-Servlet 模块的功能。



4. ### AOP、Aspects、Instrumentation和Messaging

    - **AOP 模块**：提供了面向切面编程实现，提供比如日志记录、权限控制、性能统计等通用功能和业务逻辑分离的技术，并且能动态的把这些功能添加到需要的代码中，这样各司其职，降低业务逻辑和通用功能的耦合。
    - **Aspects 模块**：提供与 AspectJ 的集成，是一个功能强大且成熟的面向切面编程（AOP）框架。

5. Test 模块

   Test 模块：Spring 支持 Junit 和 TestNG 测试框架，而且还额外提供了一些基于 Spring 的测试功能，比如在测试 Web 框架时，模拟 Http 请求的功能。

   包含Mock Objects, TestContext Framework, Spring MVC Test, WebTestClient。



# Spring-02-Ioc设计思想

## 引例

<img src="C:\Users\穆博\AppData\Roaming\Typora\typora-user-images\image-20240405160512233.png" alt="image-20240405160512233" style="zoom: 80%;" />

由图可见，我们创建了一个Maven的项目，按照三层架构的思想，dao层存放数据，dao层有两个实现类，Daoimpl来访问用户消息，Sqlimpl来访问数据库信息，二者提供了访问数据的方法，在servse层中，有一个Serviceimpl实现类，目的是实现访问用户信息和数据库信息。
``` java
public class UserServiceilpl implements UserService{
    //根据用户需求的不同，需要手动更改服务层的代码
    private UserDao userDao = new UserDaoSqlimpl();
    public void getUser(){userDao.getUser();} 
}
```

完成对数据库信息的访问，但是如果想要访问用户信息，那得要在这个Serviceimpl实现类中更改代码，new一个访问用户信息的dao类。传统应用程序都是由我们在类内部主动创建依赖对象，从而导致类与类之间高耦合，难于测试。我们可以将更改服务的代码放到测试类之中，在测试类中实现不同服务的切换。

 ``` java
 public class UserServiceilpl implements UserService{
     //利用set进行动态数值注入
     private UserDao userDao;
     public void setUserDao(UserDao userDao) {
         this.userDao = userDao;
     }
     public void getUser(){userDao.getUser();}
 }
 ```

``` java
public class MyTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceilpl();
        ((UserServiceilpl) userService).setUserDao(new UserDaoSqlimpl());
        userService.getUser();

        ((UserServiceilpl) userService).setUserDao(new UserDaoimpl());
        userService.getUser();
    }
}
```

利用set进行动态数值注入,在测试类中写上不同服务的名称，便可以切换不同的服务。Ioc意味着将你设计好的对象交给容器控制，而不是传统的在你的对象内部直接控制。

## IOC的优点

传统应用程序都是由我们在类内部主动创建依赖对象，从而导致类与类之间高耦合，难于测试；有了IoC容器后，**把创建和查找依赖对象的控制权交给了容器，由容器进行注入组合对象，所以对象与对象之间是 松散耦合，这样也方便测试，利于功能复用，更重要的是使得程序的整个体系结构变得非常灵活**。

其实IoC对编程带来的最大改变不是从代码上，而是从思想上，发生了“主从换位”的变化。应用程序原本是老大，要获取什么资源都是主动出击，但是在IoC/DI思想中，应用程序就变成被动的了，被动的等待IoC容器来创建并注入它所需要的资源了。

IoC很好的体现了面向对象设计法则之一—— **好莱坞法则：“别找我们，我们找你”**；即由IoC容器帮对象找相应的依赖对象并注入，而不是由对象主动去找。

## IOC和DI的关系

其实它们是同一个概念的不同角度描述，由于控制反转概念比较含糊（可能只是理解为容器控制对象这一个层面，很难让人想到谁来维护对象关系），所以2004年大师级人物Martin Fowler又给出了一个新的名字：“依赖注入”，相对IoC 而言，“依赖注入”明确描述了“被注入对象依赖IoC容器配置依赖对象”。通俗来说就是**IoC是设计思想，DI是实现方式**。

### 补充：

### 1.  Spring DI的配置方式

#### 基于XML的配置方式

``` xm
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd http://www.springframework.org/schema/context https://www.springframework.org/schema/context/spring-context.xsd">
    <bean id="student" class="com.mu.pojo.Student">
        <!--1.普通注入，value-->
        <property name="name" value="卡卡西"/>
        <!--2.bean注入，ref-->
        <property name="address" ref="address"/>
        <!--3.数组注入，ref-->
        <property name="books">
            <array>
                <value>红楼梦</value>
                <value>西游记</value>
                <value>三国</value>
            </array>
        </property>
        <!--4.List注入，ref-->
        <property name="hobbys">
            <list>
                <value>唱</value>
                <value>跳</value>
                <value>rap</value>
            </list>
        </property>
        <!--5.Map注入，ref-->
        <property name="card">
            <map>
               <entry key="身份证" value="123456"/>
                <entry key="id" value="123456"/>
            </map>
        </property>
        <!--5.Set注入，ref-->
        <property name="games">
            <set>
                <value>mc</value>
                <value>cs</value>
            </set>
        </property>
        <!--6.null-->
        <property name="wife">
            <null></null>
        </property>
        <!--properties-->
        <property name="info">
            <props>
                <prop key="学号">20220406</prop>
                <prop key="性别">男</prop>
            </props>
        </property>
    </bean>
    <bean id="address" class="com.mu.pojo.Address">
        <property name="address" value="木叶村"/>
    </bean>
</beans>
```

#### 		基于Java的配置方式

​	将类的创建交给我们配置的JavcConfig类来完成，Spring只负责维护和管理，采用纯Java创建方式。其本质上就是把在XML上的配置声明转移到Java配置类中

``` java
package com.mu.config;
import com.mu.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//类似于bean
@Configuration//会被spring托管
public class muconfig {
    @Bean//注册的一个bean,这个方法的名字相当于id属性,返回值相当于class属性
    public User getUser(){
        return new User();
    }
}

```

#### 注解配置

- @Autowried：自动装配通过类型和名字，如果不能唯一装配，则用@Qualifier(value="XXX")
- @Nullable 字段标记了这个注解，这个注解可以是null
- @Resource 自动装配通过名字和类型，两个均没有则会报错
- @Component 组件,放在类上,说明这个类已经由一个对象，对象名为类名的小写

  ### Component的衍生注解

  在Web开发中，常常用注解开发

    - dao    [@Repository]
    - service    [@Service]
    - controller    [@Controller]

      作用都是一样，将类注入到Spring容器中

作用域
```java
@Scope("singleton")//单例模式
@Scope("prototype")//原型模式
```

``` java
/*
* @Component组件
* 等价于
* <bean id="User" class="com.mu.pojo.User"/>
* 创建的对象名字是类名的小写
* */
@Component
public class User {
    public String name = "卡卡西";
}
```

# Spring-03-代理模式

SpringAop和SpringMVC

## 代理模式介绍

代理模式的分类

- 静态代理

  角色分析：

    - 抽象角色：使用接口或者抽象类解决
    - 真实角色：被代理的角色
    - 代理角色：代理真实角色
    - 客户：访问代理对象的人

- 动态代理

代理模式好处

- 真实角色的操作更加纯粹
- 公共交给代理角色
- 公共业务发生拓展的时候，方便集中管理

缺点

- 一个真实角色会产生一个代理角色，代码量会翻倍

步骤

1. 接口

   ``` java
   package com.mu.pojo;
   //租房
   public interface Rent {
   }
   ```



2. 真实角色

   ``` java
   package com.mu.pojo;
   
   public class Host {
       public void rent(){
           System.out.println("房东要出租房子");
       }
   }
   
   ```



3. 代理角色

   ``` java
   package com.mu.pojo;
   
   public class Proxy implements Rent{
       private Host host;
   
       public Proxy() {
       }
   
       public Proxy(Host host) {
           this.host = host;
       }
   
       public void rent(){
           seeHouse();
           host.rent();
           heto();
           fare();
       }
   
       public void seeHouse(){
           System.out.println("中介带你看房");
       }
   
       public void fare(){
           System.out.println("收中介费");
       }
   
       public void heto(){
           System.out.println("签合同");
       }
   
   }
   
   ```



4. 客户端访问代理角色

   ``` java
   package com.mu.pojo;
   
   public class Client {
       public static void main(String[] args) {
           Host host = new Host();
           //代理
           Proxy proxy = new Proxy(host);
           proxy.rent();
           //直接接触代理，不用接触原类
       }
   }
   
   ```

   ##  



## 加深理解

![image-20240407170517843](C:\Users\穆博\AppData\Roaming\Typora\typora-user-images\image-20240407170517843.png)

​

## 动态代理

- 动态代理和静态代理角色一样

- 动态代理的代理类是动态生成的

- 动态代理分为两大类：基于接口和基于类

    * 基于接口JDK动态代理
    * 基于类cglib
    * java字节码

  需要了解两个类：Proxy,InvocationHandler(调用处理程序)

  InvocationHandler

  # Spring-04-AOP

  需要导入的Meavn坐标

  ``` xml
  <dependency>
              <groupId>org.aspectj</groupId>
              <artifactId>aspectjweaver</artifactId>
              <version>1.9.4</version>
  </dependency>
  ```

    1. 使用spring接口实现AOP

       ``` xml
       <?xml version="1.0" encoding="UTF-8"?>
       <beans xmlns="http://www.springframework.org/schema/beans"
              xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
              xmlns:aop="http://www.springframework.org/schema/aop"
              xsi:schemaLocation="http://www.springframework.org/schema/beans
               http://www.springframework.org/schema/beans/spring-beans.xsd
               http://www.springframework.org/schema/aop
               https://www.springframework.org/schema/aop/spring-aop.xsd">
           <!--注册-->
           <bean id = "userService" class = "com.mu.pojo.UserServiceImpl"/>
           <bean id = "log" class = "com.mu.log.Log"/>
           <bean id = "afterLog" class = "com.mu.log.AfterLog"/>
           <!--配置aop，需要aop的约束-->
           <aop:config>
               <!--切入点:expression表达式  execution 要执行的位置! (*(修饰词) *(返回值) *(类名) *(方法名) *(参数))-->
               <aop:pointcut id="pointcut" expression="execution(* com.mu.pojo.UserServiceImpl.*(..))"/>
               <!-- 执行环绕增加 -->
               <aop:advisor advice-ref="log" pointcut-ref="pointcut"/>
               <aop:advisor advice-ref="afterLog" pointcut-ref="pointcut"/>
           </aop:config>
       </beans>
       ```



2. 自定义类实现AOP[主要是切面定义]

   ``` xml
   <?xml version="1.0" encoding="UTF-8"?>
   <beans xmlns="http://www.springframework.org/schema/beans"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xmlns:aop="http://www.springframework.org/schema/aop"
          xsi:schemaLocation="http://www.springframework.org/schema/beans
           http://www.springframework.org/schema/beans/spring-beans.xsd
           http://www.springframework.org/schema/aop
           http://www.springframework.org/schema/aop/spring-aop.xsd">
       <!--方式二-->
       <bean id="diy" class="com.mu.diy.diyPoint"/>
       <aop:config >
           <!--自定义切面,ref要引用的类-->
           <aop:aspect ref="diy">
               <!--切入点-->
               <aop:pointcut id="point" expression="execution(* com.mu.pojo.UserServiceImpl.*(..))"/>
               <!--通知-->
               <aop:before method="before" pointcut-ref="point"/>
               <aop:after method="after" pointcut-ref="point"/>
           </aop:aspect>
       </aop:config>
   
   </beans>
   ```



# Spring-04-整合Mybatis

- Mybatis

  Mybatis通过将配置信息写在配置文件里，并且设置接口，将操作的数据通过xml文件来传给接口的实现类的方式实现数据的增删改查，我们在学习spring后，我们同时可以在beans中管理那些数据库的管理对象。

  在 [spring-dao.xml](F:\Program Files (x86)\IDEA_Save_Code\spring-study\spring-10-mybatis\src\main\resources\spring-dao.xml) 文件中，我们通过bean配置的方式，将DataSource，sqlSessionFactory，SqlSessionTemplate在beans中托管。

  ``` xml
  <?xml version="1.0" encoding="UTF-8"?>
  <beans xmlns="http://www.springframework.org/schema/beans"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xmlns:aop="http://www.springframework.org/schema/aop"
         xsi:schemaLocation="http://www.springframework.org/schema/beans
          http://www.springframework.org/schema/beans/spring-beans.xsd
          http://www.springframework.org/schema/aop
          http://www.springframework.org/schema/aop/spring-aop.xsd">
      <!--DataSource:使用Spring的数据源代替Mybatis的配置-->
      <bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
          <property name="driverClassName" value="com.mysql.jdbc.Driver"/>
          <property name="url" value="jdbc:mysql://localhost:3306/mybatis?useSSL=false&amp;characterEncoding=UTF-8"/>
          <property name="username" value="root"/>
          <property name="password" value="1234"/>
      </bean>
      <!--SqlSessionFactoryBean-->
      <bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
          <!-- 数据源配置 -->
          <property name="dataSource" ref="dataSource"/>
          <!-- 绑定mybatis配置文件 -->
          <property name="configLocation" value="classpath:mybatis-config.xml"/>
          <!-- Mapper 文件位置 -->
          <property name="mapperLocations" value="classpath*:mapper/*.xml"/>
      </bean>
      <!--SqlSessionTemplate-->
      <bean id="sqlSession" class="org.mybatis.spring.SqlSessionTemplate">
          <constructor-arg index="0" ref="sqlSessionFactory"/>
      </bean>
  </beans>
  ```

  同时，在 [ApplicationContext.xml](F:\Program Files (x86)\IDEA_Save_Code\spring-study\spring-10-mybatis\src\main\resources\ApplicationContext.xml) 中，我们托管了负责数据操作的对象，实现了将数据连接和操作的分层

  ``` xml
  <?xml version="1.0" encoding="UTF-8"?>
  <beans xmlns="http://www.springframework.org/schema/beans"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xmlns:aop="http://www.springframework.org/schema/aop"
         xsi:schemaLocation="http://www.springframework.org/schema/beans
          http://www.springframework.org/schema/beans/spring-beans.xsd
          http://www.springframework.org/schema/aop
          http://www.springframework.org/schema/aop/spring-aop.xsd">
      <import resource="spring-dao.xml" />
      <bean id="userMapper" class="com.mu.mapper.UserMapperImpl">
          <property name="sqlSession" ref="sqlSession"/>
      </bean>
  </beans>
  ```

  在接口实现类中，我们要使用MyBatis 框架中的一个类SqlSessionTemplate，将结果映射在对象之中

  ``` java
  public class UserMapperImpl implements UserMapper {
      private SqlSessionTemplate sqlSession;
      public void setSqlSession(SqlSessionTemplate sqlSession) {
          this.sqlSession = sqlSession;
      }
      public List<User> selectUser(){
          UserMapper mapper = sqlSession.getMapper(UserMapper.class);
          return mapper.selectUser();
      }
  }
  ```

  同样，我们可以让实现类继承SqlSessionDaoSupport来简化

  ``` java
  public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{
      public List<User> selectUser(){
          return getSqlSession().getMapper(UserMapper.class).selectUser();
      }
  }
  ```

  xml需要传入SqlSessionFactory

  ``` xml
  <bean id="userMapper2" class="com.mu.mapper.UserMapperImpl2">
          <property name="sqlSessionFactory" ref="sqlSessionFactory"/>
      </bean>
  ```

  Spring的事务

  ``` xml
  <!--配置声明式事务-->
      <tx:advice id="txAdvice" transaction-manager="transactionManger">
          <!--给方法配置事务-->
          <tx:attributes>
              <tx:method name="selectUser"/>
              <tx:method name="deleteUser"/>
          </tx:attributes>
      </tx:advice>
  <!--配置事务切入-->
      <aop:config>
          <aop:pointcut id="txPointCut" expression="execution(* com.mu.mapper.*.*(..))"/>
          <aop:advisor advice-ref="txAdvice" pointcut-ref="txPointCut"/>
      </aop:config>
  ```
    
    

  
