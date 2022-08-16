import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static final int MIN_NUMBER_OF_GUESTS = 2;

    public static void main(String[] args) {
        // ваш код начнется здесь
        // вы не должны ограничиваться только классом Main и можете создавать свои классы по необходимости
        System.out.println("введите количество человек, на которое следует разделить счет:");
        Scanner scanner = new Scanner(System.in);
        int quantityOfGuests = getInputQuantity(scanner);

        System.out.println("количество гостей: " + quantityOfGuests);





    }

    public static int getInputQuantity(Scanner scanner){
        int inputQuantity;
        while (true) {
            try {
                inputQuantity = scanner.nextInt();
                if (inputQuantity<MIN_NUMBER_OF_GUESTS){
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

}
