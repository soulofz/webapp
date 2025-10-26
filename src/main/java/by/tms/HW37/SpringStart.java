package by.tms.HW37;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("by.tms/HW37")
public class SpringStart {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringStart.class);

        Player player = (Player) context.getBean("beanPlayer");
        System.out.println(player.getName());
        System.out.println(player.getGame());
        Student student = (Student) context.getBean("beanStudent");
        System.out.println(student.getName());

        ((AnnotationConfigApplicationContext)context).close();
    }
    @Bean
    public static Student beanStudent(){
        return new Student();
    }
}
