import java.util.ArrayList;

public class AddressBook {

private static ArrayList<BuddyInfo> buddyCollect = new ArrayList<BuddyInfo>();

public void addBuddy(BuddyInfo buddy) {
    buddyCollect.add(buddy);
}

public static void removeBuddy(BuddyInfo buddy) {
    buddyCollect.remove(buddy);
}

public static void main(String[] args) {
    System.out.println("Address Book");
}

}
