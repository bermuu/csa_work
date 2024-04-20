# 常用依赖
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context.xsd">

    <!--指定要扫描的包-->
   <context:component-scan base-package="com.mu.pojo"/>
   <context:annotation-config/>


</beans>
```
## 注解说明
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



