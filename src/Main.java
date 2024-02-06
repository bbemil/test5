import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Random random = new Random();
        int guess = 1;
        int attempts = 0;
        while (attempts < 10) {
            int secretNumber = random.nextInt(100) + 1; // Загадываем число от 1 до 100
            System.out.println("Я загадал число от 1 до 100. Угадай его!");
            attempts++; // Увеличиваем количество попыток
            Scanner scanner = new Scanner(System.in); // Создаем объект класса Scanner для считывания ввода пользователя
            System.out.print("Попытка №" + attempts + " введите число: ");
            String input = scanner.nextLine(); // Считываем строку ввода пользователя
// Проверяем, ввел ли пользователь число или текст
            if (input.matches("\\d+")) { // Если введенная строка является числом
                guess = Integer.parseInt(input); // Преобразуем строку в число
            } else {
                System.out.println("Пожалуйста, введите число!");
            }
            if (guess < secretNumber) {
                System.out.println("Я сам в шоке, но загаданное число больше, брат");
            } else if (guess > secretNumber) {
                System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат");
            } else { // Если число угадано
                System.out.printf("Загаданное число: %d. Попыток: %d%n", secretNumber, attempts);
                break; // Выход из цикла

            }
        }
    }
}