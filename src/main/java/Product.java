import com.github.javafaker.Faker;

import java.util.Scanner;

public class Product {

    Faker faker = new Faker();

    public void returnProducts(int num) {
        if (1 <= num && num <= 6) {
            switch (num) {
                case 1:
                    for (int i = 0; i <= 10; i++){System.out.println(faker.food().dish());}
                case 2:
                    for (int i = 0; i <= 10; i++){System.out.println(faker.food().sushi());}
                case 3:
                    for (int i = 0; i <= 10; i++){System.out.println(faker.food().ingredient());}
                case 4:
                    for (int i = 0; i <= 10; i++){System.out.println(faker.food().fruit());}
                case 5:
                    for (int i = 0; i <= 10; i++){System.out.println(faker.food().spice());}
                case 6:
                    for (int i = 0; i <= 10; i++){System.out.println(faker.food().vegetable());}
            }
        } else {
            System.out.println("This category does not exist! Please, select an available category.");
//          Пока придётся перезапускать программу для того, чтобы выбрать корректную категорию
        }

    }

//    генерация price
    public static void GenPrice(int num) {

    }
}
