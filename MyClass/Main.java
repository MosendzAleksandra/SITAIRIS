package MyClass;

import shop.Receipt;

public class Main {

    public static void main(String[] args) {
        Receipt receipt = new Receipt();

        receipt.saveReceipt();
        receipt.printReceipt();

    } 
    
}