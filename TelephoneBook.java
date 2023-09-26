import java.util.ArrayList;
import java.util.HashMap; // подключил класс HashMap для его применения в коде
import java.util.List;
import java.util.Map;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader; // подключил класс читает текст из потока ввода символов, буферизуя прочитанные символы
import java.io.BufferedWriter; // класс записывает буферизированные символы в поток данных
import java.io.File;

public class TelephoneBook {
    private static HashMap<String, String> TelephoneBook = new HashMap<String, String>(); //для того чтобы писать числа используем класс Integer, фамилию добавляем в String, с помощью оператора New пишем новую конструкцию и создали пустую коллекцию
    private static void addPB(String phone, String name) { // с помощью функции: addPB - вводим номер телефона и фамилию
        TelephoneBook.put(phone, name); // метод: put - помещает в коллекцию новый объект с ключом k и значением v
    }
    private static void delPB(String phone) { //функция: delPB - удаляем запись по номеру телефона
        TelephoneBook.remove(phone);
    }
    private static void savePB() throws IOException { //savePB - сохраняет список в текстовом файле TelephoneBook.txt
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("TelephoneBook.txt")));
        for(Map.Entry<String,String> k: TelephoneBook.entrySet()){
            writer.write(k.getKey() + " " + k.getValue() + System.lineSeparator());
        }
        writer.close();
    }
    public static void printBook(HashMap<String, String> TelephoneBook){  // Метод, который печатает список контактов
        for (var item : TelephoneBook.entrySet()) {
            String phones = (" ");
    }
    }
    public static void printBook(String[] args) {
    Map<String, ArrayList<Integer>> TelephoneBook = new HashMap<>();
    TelephoneBook(TelephoneBook);
    }
    private static void TelephoneBook(Map<String, ArrayList<Integer>> TelephoneBook) {
    }
    public static void loadPB() throws IOException { // Метод: loadPB - загружает список контактов из файла TelephoneBook.txt
        File file = new File("TelephoneBook.txt");
        if (file.exists()){
        BufferedReader reader = new BufferedReader(new FileReader(new File("TelephoneBook.txt")));
        String act;
        while ((act = reader.readLine()) != null) {
            String[] dat = act.split(" "); // Указываем чтобы был разделитель - пробел
            TelephoneBook.put(dat[0], dat[1]);
            }
            reader.close();
        }
    }
        public static void PrintTelephoneBook(){ // Метод - выводит список контактов
        System.out.println("Консольное приложение - Телефонный справочник: ");
        for(Map.Entry<String,String> k: TelephoneBook.entrySet()){
            System.out.println(k.getValue() + ": " + k.getKey());
        }
    }
    public static String FindSearchName(String number){ // FindSurname - производит поиск фамилии по номеру телефона заданому в качестве аргумента
        String result = TelephoneBook.get(number);  // Возвраи строки с номером телефона
        if (result == null) return "Контакт с данным номером телефона не обнаружен!";
        return result;
    }
    public static String[] FindNumberPhone(String surname){     // Производится поиск списка номеров по фамилии заданой в качестве аргумента

        List <String> result = new ArrayList<String>();  // Осуществляется возврат массива данных
        for (Map.Entry entry : TelephoneBook.entrySet()) {
            if (surname.equalsIgnoreCase((String)entry.getValue())){
                result.add((String)entry.getKey());
            }
        }
        if (result.size() == 0) result.add("Контакт с данной фамилией не обнаружен!");
        return result.toArray(new String[0]);
    }
    public static void main(String[] args) throws IOException {
        String act; // Функция описывает вызываемое действие
        loadPB(); // осуществляем загрузку списка контактов
        PrintTelephoneBook(); // выводим список контактов       
        System.out.println("Со следующим достумным списком команд:"); // выводится список возможных команд для пользователя
        System.out.println("1. ADD - ввести данные;");
        System.out.println("2. GET - получить список всех номеров по фамилии;");
        System.out.println("3. REMOVE - удалить данные;");
        System.out.println("4. SEARCH - поиск фамилии по номеру;");
        System.out.println("5. SAVE - сохраненеие;");
        System.out.println("6. EXIT - выход.");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        act = bf.readLine();
        while(!act.equals("EXIT")){
        if(act.equals("ADD")){ //функция добавлеяет запись
            System.out.println("Введите фамилию:");
            String name = bf.readLine();
            System.out.println("Введите номер телефона:");
            String phone = bf.readLine();
            addPB(phone, name);
            continue;
        } else {
        if(act.equals("REMOVE")){ //функция удаляет запись
            System.out.println("Введите номер телефон:");
            String phone = bf.readLine();
            delPB(phone);
        } else {
        if (act.equals("GET")){ // осуществляется поиск номеров по фамилии
            System.out.println("Введите фамилию:");
            String surname = bf.readLine();
            String[] numbers = FindNumberPhone(surname);
            for (String number : numbers) {
            System.out.println(number);
            }
            } else {
            if (act.equals("SEARCH")) { // осуществляется поиск фамилии по номеру
            System.out.println("Введите номер телефона:");
            String number = bf.readLine();
            System.out.println(FindSearchName(number));
            } else {
            if(act.equals("SAVE")){ //осуществляется сохранение списка контактов в файл
            savePB();
            }
            }
            }
            System.out.println("Выберите нужную команду:");
            System.out.println("1. ADD - ввести данные;");
            System.out.println("2. GET - получить список всех номеров по фамилии;");
            System.out.println("3. REMOVE - удалить данные;");
            System.out.println("4. SEARCH - поиск фамилии по номеру;");
            System.out.println("5. SAVE - сохраненеие;");
            System.out.println("6. EXIT - выход.");
            act=bf.readLine();
            }
        }
    }
}
}













    