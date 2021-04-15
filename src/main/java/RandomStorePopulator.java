import com.github.javafaker.Faker;


public class RandomStorePopulator {

    public static void GeneratorProducts(int num){
        Faker faker = new Faker();
        String[] arrayOfCategoryProducts = new String[10];
//        Если выбрана категория dish -> генерирует 10 позиций продуктов
        for (int i = 0; i <= arrayOfCategoryProducts.length; i++) {
            arrayOfCategoryProducts[i] = faker.food().dish();
            System.out.println(arrayOfCategoryProducts[i]);

        }

    }

}
