package domain;

import java.util.Collections;
import java.util.List;

public class User extends Person {

    private Person user;

    private List<User> friends;

    public User() {
    }

    public User(Person user, List<User> friends) {
        this.user = user;
        this.friends = friends;
    }

    public User(Person user, User friend) {
        this.user = user;
        assert false;
        this.friends.add(friend);
    }

    public User(String gender, String name, String lastName, String patronymic, Integer dateBirth, Person user, List<User> friends) {
        super(gender, name, lastName, patronymic, dateBirth);
        this.user = user;
        this.friends = friends;
    }

    public Person getUser() {
        return user;
    }

    public void setUser(Person user) {
        this.user = user;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        if (!super.equals(o)) return false;

        User user1 = (User) o;

        if (getUser() != null ? !getUser().equals(user1.getUser()) : user1.getUser() != null) return false;
        return getFriends() != null ? getFriends().equals(user1.getFriends()) : user1.getFriends() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getUser() != null ? getUser().hashCode() : 0);
        result = 31 * result + (getFriends() != null ? getFriends().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "user=" + user +
                ", friends=" + friends +
                "} " + super.toString();
    }
}
