package MyClass;

import shop.Receipt;

public class Main {

    public static void main(String[] args) {
        Receipt receipt = new Receipt();

        receipt.saveReceipt();
        receipt.printReceipt();


        System.out.println("вношу изменения");
        System.out.println("изменения в мастере");
        System.out.println("создала ветку");

    } 
    
}
