package by.tms.HW37;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(BeanDefinition.SCOPE_SINGLETON)
@Component("beanPlayer")
public class Player {
    private String name = "Misha";
    private int age = 25;
    private int rating = 257;
    private Game game;


    @Autowired
    public Player (Game game) {
        this.game = game;
    }

    @PostConstruct
    public void init() {
        System.out.println("Method after Construct");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Method before Destroy");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
