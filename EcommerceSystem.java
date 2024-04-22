package project1;

import java.util.Scanner;

public class EcommerceSystem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ElectronicProduct phone = new ElectronicProduct("smartphone", 11, (float)599.9 , "Samsung", 1);
        ClothingProduct shirt = new ClothingProduct("T-shirt", 22, (float)19.99, "Medium", "Cotton");
        BookProduct book = new BookProduct("OOP", 33, (float)39.9, "O\'Reilly", "XPublications");

        Customer customer1 = new Customer();
//        Product p = new Product();

        System.out.println("Welcome to the E-commerce System !\n");

        System.out.println("please enter your id");
        customer1.setCustomerId(in.nextInt());

        System.out.println("please enter your name ");
        customer1.setName(in.next());

        System.out.println("please enter your address");
        customer1.setAddress(in.next());
        
        System.out.println("How many products you want to add to your cart  ?");
        Cart cart1 = new Cart(customer1.getCustomerId(), in.nextInt());
        takeOrder(cart1, phone, shirt, book, in);
        TakeDecision(cart1, phone, shirt, book, in);
      
    }

    public static void TakeDecision(Cart product0, ElectronicProduct product1, ClothingProduct product2, BookProduct product3, Scanner in) {
        System.out.println("Would you like to place the order ? 1-Yes  2-No");
        int dec1 = in.nextInt();
        if (dec1 == 1) {
            product0.placeOrder();
        } else if (dec1 == 2) {
            EcommerceSystem.deleteFromOrder(product0, product1, product2, product3, in);
            product0.placeOrder();

        }
    }

    public static void takeOrder(Cart cart, ElectronicProduct product1, ClothingProduct product2, BookProduct product3, Scanner in) {
        for (int i = 0; i < cart.getnProducts(); i++) {
            System.out.println("Which product would you like to add ?  1-smartphone   2- T-shirt   3- OOP ");
            switch (in.nextInt()) {
                case 1:
                    cart.addProduct(product1);
                    break;
                case 2:
                    cart.addProduct(product2);
                    break;
                case 3:
                    cart.addProduct(product3);
                    break;
            }
        }
        System.out.println("Your total is " + cart.calculatePrice());

    }

    public static void deleteFromOrder(Cart cart, ElectronicProduct product1, ClothingProduct product2, BookProduct product3, Scanner in) {
        System.out.println("Which product would you like to delete ?  1-smartphone   2- T-shirt   3- OOP ");
        switch (in.nextInt()) {
            case 1:
                cart.deleteProduct(product1);
                break;
            case 2:
                cart.deleteProduct(product2);
                break;
            case 3:
                cart.deleteProduct(product3);
                break;
        }

        System.out.println("Your total is " + cart.calculatePrice());

    }
}
//for (int i = 0; i < cart1.getnProducts(); i++) {
//            System.out.println("Which product would you like to add ?  1-smartphone   2- T-shirt   3- OOP ");
//            switch (in.nextInt()) {
//                case 1:
//                    cart1.addProduct(phone);
//                    break;
//                case 2:
//                    cart1.addProduct(shirt);
//                    break;
//                case 3:
//                    cart1.addProduct(book);
//                    break;
//            }
//        }
//        System.out.println("Would you like to place the order ? 1-Yes");
////        cart1.placeOrder();