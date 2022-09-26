package Hierarchy.Clas;

import Hierarchy.Inter.BuyVegetables;

public class Cabbage implements BuyVegetables {

    private int weight;

    private int diameter;

    public Cabbage()
    {
        weight = 1;
        diameter = 10;
    }

    public Cabbage(int w, int d)
    {
        weight = w;
        diameter = d;
    }

    public int getWeight() {
        return weight;
    }

    public int getDiameter() {
        return diameter;
    }
    
    public static Cabbage find_max(Cabbage[]ca, int count )
    {
        Cabbage buf = ca[0];
        for(int i = 1;i<count;i++)
        {
            if(ca[i].getDiameter()>buf.getDiameter())
            {
                buf = ca[i];
            }
        }
        return buf;

    }

    @Override
    public int print_date(String date) {
        System.out.println("Купить капусту нужно " + date);
        return 0;
    }

    @Override
    public int print_time(int hour, int minute) {
        System.out.println("В "+hour+":"+minute);
        return 0;
    }

    @Override
    public int print_place() {
        System.out.println("В овощном отделе");
        return 0;
    }

    @Override
    public int print_how_many(int count, int kilo) {
        System.out.println("Либо "+count+" штук, либо "+ kilo+"килограмм");
        return 0;
    }
    
}
