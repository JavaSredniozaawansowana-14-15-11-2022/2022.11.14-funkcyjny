package pl.comarch.strumienie;

import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("admin", "admin"));
        users.add(new User("mateusz", "mateusz"));
        users.add(new User("karol", "karol"));
        users.add(new User("janusz", "janusz"));

        for(User user : users) {
            if(user.getLogin().endsWith("z")) {
                user.setPassword(user.getPassword().toUpperCase());
            }
        }
        users.stream()
                .filter(u -> u.getLogin().endsWith("z"))
                .forEach(u -> u.setPassword(u.getPassword().toUpperCase()));

        for(User user : users) {
            System.out.println("Login: " + user.getLogin()
                    + " Pass: " + user.getPassword());
        }
    }
}
