package pl.comarch.strumienie;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App2 {
    public static void main(String[] args) {
        Optional<User> userBox = findUser("mateusz");
        /*if(userBox.isPresent()) {
            System.out.println(userBox.get().getLogin());
            System.out.println(userBox.get().getPassword());
        } else {
            System.out.println("Nie znaleziono usera");
        }*/

        /*User user = userBox.orElseGet(() -> new User("default", "default"));
        System.out.println(user.getLogin());
        System.out.println(user.getPassword());*/

        //userBox.orElse(new User("default", "default"));
        userBox.ifPresent(x -> {
            System.out.println(x.getLogin());
            System.out.println(x.getPassword());
        });
    }

    public static Optional<User> findUser(String login) {
        List<User> users = new ArrayList<>();
        users.add(new User("admin", "admin"));
        users.add(new User("mateusz", "mateusz"));
        users.add(new User("karol", "karol"));
        users.add(new User("janusz", "janusz"));

        for(User user : users) {
            if(user.getLogin().equals(login)) {
                return Optional.of(user);
            }
        }

        return Optional.empty();
    }
}
