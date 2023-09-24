import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Map;

public class TelephoneDirectoryX {
    private static final HashMap<String, List<String>> TelephoneDirectoryX = null;
    private static HashMap<String, List<String>> contactList;

    public TelephoneDirectoryX() {
        contactList = new HashMap <> ();
    }
/*
    public void addContact(String name, String phoneNumber) {
        if (contactList.containsKey(name)) {
            String existingNumbers = contactList.get(name);
            contactList.put(name, existingNumbers + ", " + phoneNumber);
        } else {
            contactList.put(name, phoneNumber);
        }
    }
*/
    public void addContact(String lastName, String phoneNumber) {
        if (contactList.containsKey(lastName)) {
            List<String> numbers = contactList.get(lastName);
            numbers.add(phoneNumber);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            contactList.put(lastName, numbers);
        }
    }   
    public List<String> getPhoneNumbers(String lastName) {
        return contactList.get(lastName);
        }
        

    public void searchContact(String name) { // Находим контакт в телефонной книге по ключу "Имя", то есть именно по фамилии, которую мы ранее добавили в справочник
        if (contactList.containsKey(name)) {
            List<String> phoneNumber = contactList.get(name); // Команда вызова из тел.книги по фамилии - ключу "Имя"
            System.out.println("Номер(а) телефона для " + name + ": " + phoneNumber); // Выводится строка в терминале с искомой фамилией и принадлежащими номерами телефонов
        } else { // иначе
            System.out.println("Не найден контакт для " + name); // Выводится строка в терминал если не был найден контакт
        }
    }

    public static void main(String[] args) {
        TelephoneDirectoryX phoneBook = new TelephoneDirectoryX();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите вариант:");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Поиск контакта");
            System.out.println("3. Выход");

            int option = scanner.nextInt();
            scanner.nextLine(); // Запускается использование символа новой строки

            switch (option) {
                case 1:
                    System.out.println("Введите имя:");
                    String name = scanner.nextLine();
                    System.out.println("Введите номер телефона:");
                    String phoneNumber = scanner.nextLine();
                    phoneBook.addContact(name, phoneNumber);
                    System.out.println("Контакт добавлен в телефонный справочник");
                } String command;
                if (startsWith("GET")) {
                    String[] parts = split(" ");
                if (parts.length != 2) {
                    System.out.println("Неизвестный формат команды GET");
                continue;
                }
                    String lastName = parts[1];
                    List < String> numbers = TelephoneDirectoryX.get(lastName);
                if (numbers != null) {
                for (String number : numbers) {
                    System.out.println(number);
                    }
                } else {
                    System.out.println("Номера: " + numbers);
                }       
                } else if (startsWith("REMOVE")) {
                String[] parts = split(" ");
                if (parts.length != 2) {
                System.out.println("Неизвестный формат команды REMOVE");
                continue;
                 }
                String lastName = parts[1];
                TelephoneDirectoryX.remove(lastName);
                System.out.println("Контакт удален из телефонного справочника");
                } else if (command.equals("LIST")) {
                    (TelephoneDirectoryX).list();
                } else {
                System.out.println("EXIT!");
                continue;
                }
                System.out.println("Вы ввели неверную команду!");
                }       
            }
    private static boolean startsWith(String string) {
        return false;
    }
    private static String[] split(String string) {
        return null;
    }
        }

