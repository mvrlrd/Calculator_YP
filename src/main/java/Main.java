import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static final int MIN_NUMBER_OF_GUESTS = 2;
    public static final String FINISH_COMMAND = "завершить";

    public static void main(String[] args) {
        // ваш код начнется здесь
        // вы не должны ограничиваться только классом Main и можете создавать свои классы по необходимости
        System.out.println("введите количество человек, на которое следует разделить счет:");
        Scanner scanner = new Scanner(System.in);
        int quantityOfGuests = getInputQuantity(scanner);


        getItem(scanner);
        System.out.println("количество гостей: " + quantityOfGuests);
    }

    public static int getInputQuantity(Scanner scanner) {
        int inputQuantity;
        while (true) {
            try {
                inputQuantity = scanner.nextInt();
                if (inputQuantity < MIN_NUMBER_OF_GUESTS) {
                    throw new InputMismatchException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("вы ввели некорректное колчество людей, попробуйте снова:");
                scanner.nextLine();
            }
        }
        return inputQuantity;
    }

    public static void getItem(Scanner scanner) {
        List<Item> items = new ArrayList<>();
        String command = "";

        while (!command.equalsIgnoreCase(FINISH_COMMAND)) {
            System.out.println("введите название:");
            Item item = new Item();
            item.setName(scanner.next());
            System.out.println("введите стоимость:");
            try {
                item.setPrice(scanner.nextDouble());
                items.add(item);
                System.out.println("товар добавлен:");
                System.out.println("для завершения напишите ЗАВЕРШИТЬ/ для продолжения any key");
                command = scanner.next();
            } catch (InputMismatchException e) {
                System.out.println("некорректная цена, повторите:");
                scanner.nextLine();
            }
        }
        System.out.println("all items:");
        System.out.println(items);

    }

}
