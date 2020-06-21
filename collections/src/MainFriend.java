import domain.User;
import util.UserUtil;

public class MainFriend {
    public static void main(String[] args) {

        User user1 = UserUtil.generateUserWithFriend(3);
        User user2 = UserUtil.generateUserWithFriend(3);
        User user3 = UserUtil.generateUserWithFriend(3);
        User user4 = UserUtil.generateUserWithFriend(3);
        User user5 = UserUtil.generateUserWithFriend(3);
        User user6 = UserUtil.generateUserWithFriend(3);
        User user7 = UserUtil.generateUserWithFriend(3);
        User user8 = UserUtil.generateUserWithFriend(3);
        User user9 = UserUtil.generateUserWithFriend(3);

        UserUtil.addFriend(user1, user2);// 1
        UserUtil.addFriend(user2, user3);// 2
        UserUtil.addFriend(user3, user4);// 3
        UserUtil.addFriend(user4, user5);// 4
        UserUtil.addFriend(user6, user7);// 5
        UserUtil.addFriend(user7, user8);// 6
        UserUtil.addFriend(user8, user9);// 7

        System.out.println("friends of the user of the specified nesting level");
        UserUtil.showFriendsNestingLevel(user1,5);
//
//        System.out.println();
//        System.out.println("all friends of the user of the all(1-7) nesting level");
//        UserUtil.showAllFriends(user1);
    }
}
