package Hierarchy.Clas;

import Hierarchy.Inter.BuyVegetables;
import Hierarchy.Inter.BuySemis;

public class Potato implements BuyVegetables, BuySemis{

    private String type; // свежая и замороженная
    private int weight;

    public int getWeight() {
        return weight;
    }

    public Potato()
    {
        type = "свежая";
        weight = 10;
    }

    public Potato(String t, int w)
    {
        type = t;
        weight = w;
    }

    public void print_inf()
    {
        System.out.println("У вас в руках картошка "+type);
        System.out.println("Ее вес "+weight);
    }
    
    @Override
    public int print_date(String date) {
        System.out.println("Купить картошку нужно " + date);
        return 0;
    }

    @Override
    public int print_time(int hour, int minute) {
        System.out.println("В "+hour+":"+minute);
        return 0;
    }

    @Override
    public int print_place() {
        System.out.println("Картошку можно купить либо в овощном отделе,\n"+
         "либо в отделе с полуфабрикатами(где продают замороженные овощи)");
        return 0;
    }

    @Override
    public String print_name(String name) {
        System.out.println("Тип картошки:");
        type = name;
        return null;
    }

    @Override
    public int print_how_many(int count, int kilo) {
        System.out.println("Купить нужно либо "+count +"штук"+", либо "+kilo+"килограмм");
        return 0;
    }
    
}
