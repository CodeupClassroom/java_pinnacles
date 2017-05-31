package contacts;

import java.io.IOException;

/*
 * How do you handle:
 * - the same person having multiple phone numbers?
 * - deleting a contact (by name, number, multiple records at once?)
 * - searching through contacts
 */
class ContactsManagerApplication {
    private static Contacts contactsDao = new TextFileContacts();

    public static void showContacts() {
        System.out.println();
        System.out.println(" Name | Number ");
        System.out.println("---------------");
        for(Contact contact : contactsDao.findAll()) {
            System.out.printf(
                "%s | %s\n",
                contact.getName(),
                contact.getNumber()
            );
        }
        System.out.println();
    }

    public static void addContact() {
        Contact newContact = new Contact(
            Input.getString("name: "),
            Input.getString("number: ")
        );

        try {
            contactsDao.add(newContact);
            System.out.println("Contact added!");
        } catch (IOException e) {
            System.out.println("Error adding a new contact!");
            e.printStackTrace();
        }
    }

    public static void searchByName() {

    }

    public static void searchByNumber() {

    }

    public static void removeContact() {
        String name = Input.getString("Enter the name of the contact to remove: ");
        Contact toRemove = contactsDao.findByName(name);
        if (toRemove == null) {
            System.out.println("Sorry, no contact with that name was found.");
            return;
        }
        contactsDao.delete(toRemove);
        System.out.println("Contact removed!");
    }

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        System.out.println(" > Welcome to the contacts manager!");
        System.out.println("--------------------------------------------------");

        while (true) {
            System.out.println("What would you like to do?");

            System.out.println("0 - Exit");
            System.out.println("1 - View Contacts");
            System.out.println("2 - Add a new Contact");
            System.out.println("3 - Search by Number");
            System.out.println("4 - Search by Name");
            System.out.println("5 - Remove an existing Contact");

            int choice = Input.getInt("Please make a selection: ");
            switch(choice) {
                case 0:
                    System.out.println("Have a great day!");
                    return;
                case 1:
                    showContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    searchByName();
                    break;
                case 4:
                    searchByNumber();
                    break;
                case 5:
                    removeContact();
                    break;
                default:
                    System.out.println("Unknown selection, " + choice + ".");
                    break;
            }
        }
    }
}
