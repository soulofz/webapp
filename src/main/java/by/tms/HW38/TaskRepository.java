package by.tms.HW38;

import org.springframework.stereotype.Component;

@Component
public class TaskRepository {
    @ShowWorkTime
    void showTask(){
        System.out.println("showTask repository");
    }
}
