import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        boolean running = true;
        while (running) {
            System.out.println("\nAddress Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("\n--- Add New Contact ---");
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter City: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter State: ");
                    String state = scanner.nextLine();
                    System.out.print("Enter Zip: ");
                    String zip = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    Contact contact = new Contact(firstName, lastName, address, city,
                            state, zip, phoneNumber, email);
                    addressBook.addContact(contact);
                    break;
                case 2:
                    System.out.println("\n--- Edit Contact ---");
                    System.out.print("Enter First Name of contact to edit: ");
                    String editFirstName = scanner.nextLine();
                    System.out.print("Enter Last Name of contact to edit: ");
                    String editLastName = scanner.nextLine();
                    Contact contactToEdit = addressBook.findContact(editFirstName, editLastName);
                    if (contactToEdit != null) {
                        System.out.println("Contact found: " + contactToEdit);
                        System.out.println("\nWhat would you like to edit?");
                        System.out.println("1. Address");
                        System.out.println("2. City");
                        System.out.println("3. State");
                        System.out.println("4. Zip");
                        System.out.println("5. Phone Number");
                        System.out.println("6. Email");
                        System.out.print("Choose an option: ");
                        int editChoice = scanner.nextInt();
                        scanner.nextLine();
                        switch (editChoice) {
                            case 1:
                                System.out.print("Enter new Address: ");
                                contactToEdit.setAddress(scanner.nextLine());
                                System.out.println("Address updated successfully!");
                                break;
                            case 2:
                                System.out.print("Enter new City: ");
                                contactToEdit.setCity(scanner.nextLine());
                                System.out.println("City updated successfully!");
                                break;
                            case 3:
                                System.out.print("Enter new State: ");
                                contactToEdit.setState(scanner.nextLine());
                                System.out.println("State updated successfully!");
                                break;
                            case 4:
                                System.out.print("Enter new Zip: ");
                                contactToEdit.setZip(scanner.nextLine());
                                System.out.println("Zip updated successfully!");
                                break;
                            case 5:
                                System.out.print("Enter new Phone Number: ");
                                contactToEdit.setPhoneNumber(scanner.nextLine());
                                System.out.println("Phone Number updated successfully!");
                                break;
                            case 6:
                                System.out.print("Enter new Email: ");
                                contactToEdit.setEmail(scanner.nextLine());
                                System.out.println("Email updated successfully!");
                                break;
                            default:
                                System.out.println("Invalid option. Please try again.");
                        }
                    } else {
                        System.out.println("Contact not found!");
                    }
                    break;
                case 3:
                    System.out.println("\n--- Delete Contact ---");
                    System.out.print("Enter First Name of contact to delete: ");
                    String deleteFirstName = scanner.nextLine();
                    System.out.print("Enter Last Name of contact to delete: ");
                    String deleteLastName = scanner.nextLine();
                    addressBook.deleteContact(deleteFirstName, deleteLastName);
                    break;
                case 4:
                    addressBook.displayAllContacts();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting Address Book. Thank you!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}