import java.util.Scanner;

public class ConsoleApp {


    public static void consoleApp(int[] args, Category category, Product product) {
        System.out.println("Please, select a category number: ");
//        напишу штучки для того, чтобы пользователь вводил номер желаемой категории товаров

//        Здесь должен выводится список из категорий(это к классу -> Category)

//        Вывод перечня категорий, после чего юзер выбирает number
        category.categorySelection();
        Scanner scanner = new Scanner(System.in);
//        принимает на вход число
        int selectedCategory = scanner.nextInt();
        product.returnProducts(selectedCategory);
//        Здесь должен быть перечень продуктов, которые юзер может положить в корзину

        }
}
