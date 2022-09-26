package shop;

import Hierarchy.Clas.*;
import java.io.*;

public class Receipt {

    protected Cabbage cabbage;
    protected Potato potato;
    protected int[] price;
    protected Cashier cashier;
    protected String data;
    protected String time;  // Времясоздания чека

    public Receipt()
    {
        cabbage = new Cabbage();
        potato = new Potato();
        price  = new int[2];
        price[0]=13;
        price[1]=23;
        cashier = new Cashier();
        data = "26.09.2022";
        time = "12.12";

    }

    public void  saveReceipt()
    {

        try(FileWriter writer = new FileWriter("receipt.txt", false))
        {
           
            writer.write("<<<<ЧЕК>>>>\n");
            writer.write("1) Картофель     "+price[0]*potato.getWeight()+"\n");
            writer.write("2) Капуста       "+price[1]*cabbage.getWeight()+"\n");
            writer.write("\nИтого     "+(price[0]*potato.getWeight()+price[1]*cabbage.getWeight())+"\n");
            writer.write("Дата            "+data+"\n");
            writer.write("Время           "+time+"\n");
            writer.write("Кассир          "+"\n");
            writer.write("Фио             "+cashier.getFio()+"\n");
            writer.write("номер кассы     "+cashier.getNumberCash()+"\n");

            System.out.println("Данные сохранены");

            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    }

    public void printReceipt()
    {
        System.out.println("<<<<ЧЕК>>>>");
        System.out.println("1) Картофель     "+price[0]*potato.getWeight());
        System.out.println("2) Капуста       "+price[1]*cabbage.getWeight());
        System.out.println("\nИтого     "+(price[0]*potato.getWeight()+price[1]*cabbage.getWeight()));
        System.out.println("Дата            "+data);
        System.out.println("Время           "+time);
        System.out.println("Кассир          ");
        System.out.println("Фио             "+cashier.getFio());
        System.out.println("номер кассы     "+cashier.getNumberCash());

    }
    
}
