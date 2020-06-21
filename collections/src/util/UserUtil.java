package util;

import domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserUtil {
    static final String[] arrayName = {"Артём", "Арсений", "Борис", "Владислав", "Григорий", "Дмитрий", "Евгений",
            "Захар", "Сергей", "Алиса", "Виктория", "Галина", "Даша", "Лиза", "Маша", "Катя", "Юля", "Рита", "Bob",
            "Alex", "Sophie", "Mia", "Olivia", "Ruby", "Lily", "Jack", "Harry", "Oscar","James", "Oliver", "William"};

    static final String[] arraySurname = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson",
            "Taylor", "Anderson", "White", "King", "Morgan", "Baker", "Hill"};

    static Long id = 1L;

    public static User generateUser() {
        User user = new User();

        user.setId(generateId());
        user.setName(generateName());
        user.setSurname(generateSurname());
        user.setFriends(new ArrayList<>());
        return user;
    }

    public static User generateUserWithFriend(int countFriend) {
        User user = new User();

        user.setId(generateId());
        user.setName(generateName());
        user.setSurname(generateSurname());
        user.setFriends(generateFriendList(countFriend));
        return user;
    }

    public static Long generateId() {
        return id++;
    }

    public static String generateName() {
        int length = arrayName.length;
        int index = (int) (Math.random() * length);
        return arrayName[index];
    }

    public static String generateSurname() {
        int length = arraySurname.length;
        int index = (int) (Math.random() * length);
        return arraySurname[index];
    }

    public static List<User> generateFriendList(int countFriends) {
        List<User> friends = new ArrayList<>();
        for (int i = 0; i < countFriends; i++) {
            friends.add(generateUser());
        }

        return friends;
    }

    public static void addFriend(User user, User friend) {
        user.getFriends().add(friend);
    }

    public static void showUser(User user) {
        System.out.println(user);

    }

    // recursive method. displays all friends of all levels of nesting
    public static void showAllFriends(User user) {
        System.out.println(user.getName() );
        System.out.print("\t" + user.getName() + " friends  = ");
        System.out.print("{ ");
        for (int i = 0; i < user.getFriends().size(); i++) {
            System.out.print("\t" + user.getFriends().get(i).getName());
        }

        System.out.println(" }");
        for (int i = 0; i < user.getFriends().size(); i++) {
            showAllFriends(user.getFriends().get(i));
        }
    }

    // The recursive method displays user friends depending on the level of nesting.
    // at the first level displays only friends (1) of the user
    // on the second friends (1) user and friends (2) friends (1) user
    // on the third friends (1) user, friends (2) friends (1) user and friends (3) friends (2) and so on
    public static void showFriendsNestingLevel(User user, int nestingLevel) {
        System.out.println("id" + user.getId() + " " + user.getName() + " " + user.getSurname());
        System.out.print("\t" + "id" + user.getId() + " " + user.getName() + " friends  = ");
        System.out.print("{ ");
        for (int i = 0; i < user.getFriends().size(); i++) {
            System.out.print("\t" + "id" + user.getFriends().get(i).getId() + " " + user.getFriends().get(i).getName()
                    + " " + user.getFriends().get(i).getSurname() + ", ");
        }
        System.out.println(" }");
        if (nestingLevel > 1) {
            nestingLevel--;
            for (int i = 0; i < user.getFriends().size(); i++) {
                // recursion
                showFriendsNestingLevel(user.getFriends().get(i), nestingLevel);
            }
        }
    }

}
