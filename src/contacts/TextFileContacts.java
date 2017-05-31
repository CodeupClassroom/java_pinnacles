package contacts;

import java.nio.file.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class TextFileContacts implements Contacts {
    private final String delimeter = "-";
    private final String filename = "data/contacts.txt";
    private Path filepath;

    public TextFileContacts() {
        this.filepath = Paths.get(filename);
    }

    private Contact createContactFromLine(String line) {
        String[] parts = line.split("-");
        String name = parts[0];
        String number = parts[1];
        return new Contact(name, number);
    }

    private String convertContactToLine(Contact contact) {
        return contact.getName() + delimeter + contact.getNumber();
    }

    private void save(List<Contact> contacts) throws IOException {
        List<String> lines = new ArrayList<>();
        for(Contact contact : contacts) {
            String line = convertContactToLine(contact);
            lines.add(line);
        }
        Files.write(filepath, lines);
    }

    public List<Contact> findAll() {
        List<Contact> contacts = new ArrayList<>();
        List<String> lines;
        try {
            lines = Files.readAllLines(filepath);
            for (String line : lines) {
                Contact contact = createContactFromLine(line);
                contacts.add(contact);
            }
            return contacts;
        } catch (IOException e) {
            throw new RuntimeException("Error reading contacts!", e);
        }
    }

    public Contact findByName(String name) {
        for (Contact contact : findAll()) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public Contact findByNumber(String number) {
        for (Contact contact : findAll()) {
            if (contact.getNumber().equals(number)) {
                return contact;
            }
        }
        return null;
    }

    public void add(Contact contact) throws IOException {
        List<Contact> contacts = findAll();
        contacts.add(contact);
        save(contacts);
    }

    public void delete(Contact contactToRemove) {
        List<Contact> filteredContacts = new ArrayList<>();
        for (Contact contact : findAll()) {
            boolean namesMatch = contact.getName().equals(contactToRemove.getName());
            boolean numbersMatch = contact.getNumber().equals(contactToRemove.getNumber());
            if (namesMatch && numbersMatch) {
                continue;
            }
            filteredContacts.add(contact);
        }
        try {
            save(filteredContacts);
        } catch (IOException e) {
            System.out.println("Error trying to remove a contact!");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
