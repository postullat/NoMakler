package ua.lviv;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TestBean bean = context.getBean("testBean", TestBean.class);
        System.out.println(bean.getMessage());

        bean.setMessage("Hello nomakler");

        TestBean bean2 = context.getBean("testBean", TestBean.class);
        System.out.println(bean2.getMessage());
    }
}
