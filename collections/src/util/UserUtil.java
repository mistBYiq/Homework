package util;

import com.sun.source.tree.Tree;
import domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class UserUtil {
    static final String[] arrayName = {"Артём", "Арсений", "Борис", "Владислав", "Григорий", "Дмитрий", "Евгений",
            "Захар", "Сергей", "Алиса", "Виктория", "Галина", "Даша", "Лиза", "Маша", "Катя", "Юля", "Рита", "Bob",
            "Alex", "Sophie", "Mia", "Olivia", "Ruby", "Lily", "Jack", "Harry", "Oscar","James", "Oliver", "William"};

    static final String[] arraySurname = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson",
            "Taylor", "Anderson", "White", "King", "Morgan", "Baker", "Hill"};

    static Long id = 0L;

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

    public static Set<User> generateUsersSet(Set<User> users, int count) {
        for (int i = 0; i < count; i++) {
            users.add(generateUser());
        }
        return users;
    }

    public static Map<Long, User> generateUsersMap(int count) {
        Map<Long, User> userMap = new TreeMap<>();
        for (int i = 0; i < count; i++) {
            User user = generateUserWithFriend(5);
            userMap.put(user.getId(), user);
        }
        return userMap;
    }

    public static void addFriend(User user, User friend) {
        user.getFriends().add(friend);
    }

    public static void addMap(Map<Long, User> userMap, User user) {
        userMap.put(user.getId(), user);
    }

    public static void showUser(User user) {
        System.out.println(user);
    }

    public static void showMapUser(Map<Long, User> users) {
        for (Map.Entry<Long, User> user : users.entrySet()) {
            Long key = user.getKey();
            User value = user.getValue();
            System.out.println(key + " : " + value );
        }
    }
}
