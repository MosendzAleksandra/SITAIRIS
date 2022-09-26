package Hierarchy.Clas;

import Hierarchy.Inter.BuyFlour;
import Hierarchy.Inter.BuySemis;

public class PancackesWithJam implements BuySemis, BuyFlour{

    public int count;
    public int weight;
    public String filling; // начинка

    public PancackesWithJam()
    {
        count = 4;
        weight = 300;
        filling = "клубника";
    }

    public PancackesWithJam(int c, int w, String f)
    {
        count = c;
        weight = w;
        filling = f;
    }

    public void print_inf()
    {
        System.out.println("У вас в руках бличики с "+filling);
        System.out.println("Количество штук в упаковке "+count);
        System.out.println("Итоговый вес "+weight);
    }

    @Override
    public int print_date(String date) {
        System.out.println("Купить блинчики нужно " + date);
        return 0;
    }

    @Override
    public int print_time(int hour, int minute) {
        System.out.println("В "+hour+":"+minute);
        return 0;
    }

    @Override
    public int print_place() {
        System.out.println("Блинчики можно купить в отделе с замороженной продукцией, обычно рядом еще пельмени, масло или мороженное");
        return 0;
    }

    @Override
    public void print_characteristic(String charact) {
        System.out.println("Характеристики теста для блинчиков: "+charact);
        
    }

    @Override
    public String print_name(String name) {
        System.out.println("Название блинчиков:"+name);
        return null;
    }
    
}
