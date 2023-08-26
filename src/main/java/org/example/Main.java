//1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
//3)Создать класс Basket, содержащий массив купленных товаров.
//4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
//5)Вывести на консоль каталог продуктов. (все продукты магазина)
//6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)

package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Shop shop = new Shop();

        Category category1 = new Category("Электроника");
        category1.addProduct(new Product("Телевизор", 500.0, 4));
        category1.addProduct(new Product("Смартфон", 1000.0, 5));

        Category category2 = new Category("Одежда");
        category2.addProduct(new Product("Футболка", 20.0, 3));
        category2.addProduct(new Product("Джинсы", 50.0, 4));

        shop.addCategory(category1);
        shop.addCategory(category2);

        shop.printCatalog();

        User user1 = new User("user1","password1");
        User user2 = new User("user2","password2");

        user1.getBasket().addProduct(category1.getProducts().get(0));
        user2.getBasket().addProduct(category2.getProducts().get(1));

        category1.getProducts().remove(0);
        category2.getProducts().remove(1);

        System.out.println(user1.getLogin()+" - Покупки");
        ArrayList<Product> user1Products = user1.getBasket().getProducts();
        for (Product product : user1Products){
            System.out.println("-" + product.getName() + "-" + product.getPrice() + "-" + product.getRating());

        }
        System.out.println(user2.getLogin() + "- Покупки");
        ArrayList<Product> user2Products = user2.getBasket().getProducts();
        for (Product product : user2Products)  {
            System.out.println("-" + product.getName() + "-" + product.getPrice() + "-" + product.getRating());
        }
    }
}