package ru.nimv.pp2_1_3.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.nimv.pp2_1_3.spring_boot.model.User;
import ru.nimv.pp2_1_3.spring_boot.service.UserService;

@SpringBootApplication
public class Pp312SpringBootApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Pp312SpringBootApplication.class, args);
        UserService userService = context.getBean(UserService.class);

        // Создание пользователей и добавление их в БД
        User user1 = new User("Иван", "Иванов");
        User user2 = new User("Петр", "Петров");
        User user3 = new User("Сидор", "Сидоров");
        User user4 = new User("Алексей", "Алексеев");
        User user5 = new User("Максим", "Максимов");

        userService.saveUser(user1);
        userService.saveUser(user2);
        userService.saveUser(user3);
        userService.saveUser(user4);
        userService.saveUser(user5);
    }
}