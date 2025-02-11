import java.util.ArrayList;
import java.util.Scanner;

class User {
    int userID;
    String name;
    int age;
    ArrayList<Integer> friends;
    User next;

    public User(int userID, String name, int age) {
        this.userID = userID;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
        this.next = null;
    }
}

class SocialMediaNetwork {
    private User head;

    // Add a new user to the network
    public void addUser(int userID, String name, int age) {
        User newUser = new User(userID, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    // Find a user by User ID
    public User findUserByID(int userID) {
        User temp = head;
        while (temp != null) {
            if (temp.userID == userID) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Find a user by Name
    public User findUserByName(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Add a friend connection between two users
    public void addFriend(int userID1, int userID2) {
        User user1 = findUserByID(userID1);
        User user2 = findUserByID(userID2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        if (!user1.friends.contains(userID2)) {
            user1.friends.add(userID2);
        }
        if (!user2.friends.contains(userID1)) {
            user2.friends.add(userID1);
        }

        System.out.println(user1.name + " and " + user2.name + " are now friends!");
    }

    // Display all friends of a specific user
    public void displayFriends(int userID) {
        User user = findUserByID(userID);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println(user.name + "'s Friends:");
        if (user.friends.isEmpty()) {
            System.out.println("No friends found.");
        } else {
            for (int friendID : user.friends) {
                User friend = findUserByID(friendID);
                if (friend != null) {
                    System.out.println("- " + friend.name + " (ID: " + friendID + ")");
                }
            }
        }
    }

    // Find mutual friends between two users
    public void findMutualFriends(int userID1, int userID2) {
        User user1 = findUserByID(userID1);
        User user2 = findUserByID(userID2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        ArrayList<Integer> mutualFriends = new ArrayList<>();
        for (int friendID : user1.friends) {
            if (user2.friends.contains(friendID)) {
                mutualFriends.add(friendID);
            }
        }

        System.out.println("Mutual Friends between " + user1.name + " and " + user2.name + ":");
        if (mutualFriends.isEmpty()) {
            System.out.println("No mutual friends found.");
        } else {
            for (int friendID : mutualFriends) {
                User friend = findUserByID(friendID);
                if (friend != null) {
                    System.out.println("- " + friend.name + " (ID: " + friendID + ")");
                }
            }
        }
    }

    // Count the number of friends for each user
    public void countFriends() {
        User temp = head;
        System.out.println("\nFriend Counts:");
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friends.size() + " friend(s).");
            temp = temp.next;
        }
    }

    // Display all users in the network
    public void displayUsers() {
        if (head == null) {
            System.out.println("No users found.");
            return;
        }

        System.out.println("\nUser List:");
        User temp = head;
        while (temp != null) {
            System.out.println("User ID: " + temp.userID + ", Name: " + temp.name + ", Age: " + temp.age);
            temp = temp.next;
        }
    }
}

public class SocialMediaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SocialMediaNetwork network = new SocialMediaNetwork();

        // Adding some users
        network.addUser(1, "Alice", 25);
        network.addUser(2, "Bob", 27);
        network.addUser(3, "Charlie", 22);
        network.addUser(4, "David", 30);
        network.addUser(5, "Emma", 24);

        // Display users
        network.displayUsers();

        // Adding friend connections
        network.addFriend(1, 2);
        network.addFriend(1, 3);
        network.addFriend(2, 4);
        network.addFriend(3, 4);
        network.addFriend(4, 5);

        // Displaying friends of each user
        network.displayFriends(1);
        network.displayFriends(2);
        network.displayFriends(4);

        // Finding mutual friends
        network.findMutualFriends(1, 4);
        network.findMutualFriends(2, 3);

        // Counting the number of friends for each user
        network.countFriends();

        scanner.close();
    }
}
