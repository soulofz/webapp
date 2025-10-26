package by.tms.HW38;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserRepository {
    private TaskRepository taskRepository;

    @Autowired
    public UserRepository(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @ShowWorkTime
    public String getUserById(int id) {
        System.out.println("Looking for user with id: " + id +" ...");
        //taskRepository.showTask();
        return "User founded";
    }
}
