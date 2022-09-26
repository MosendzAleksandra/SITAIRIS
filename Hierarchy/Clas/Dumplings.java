package Hierarchy.Clas;

import Hierarchy.Inter.BuyFlour;
import Hierarchy.Inter.BuyMeat;
import Hierarchy.Inter.BuySemis;

public class Dumplings implements BuyFlour, BuyMeat, BuySemis {

    private int weight;
    private String view;
    private String mark;
    
    public Dumplings()
    {
        weight = 400;
        view = "Свинина";
        mark = "Бабушка аня";
    } 
    public Dumplings(int w)
    {
        weight = w;
        view = "Свинина";
        mark = "Бабушка аня";
    } 

    public Dumplings find_dump(Dumplings[] dump, int count )
    {
        for(int i=0;i<count;i++)
        {
            if(dump[i].getWeight() == weight & dump[i].getView().equals(view))
            {
                return dump[i];
            }
        }
        return null;
        
    }

    public int getWeight() {
        return weight;
    }
    public String getView() {
        return view;
    }
    public String getMark() {
        return mark;
    }

    @Override
    public int print_date(String date) {
        System.out.println("Купить пельмени нужно " + date);
        return 0;
    }

    @Override
    public int print_time(int hour, int minute) {
        System.out.println("В "+hour+":"+minute);
        return 0;
    }

    @Override
    public int print_place() {
        System.out.println("Пельмени можно купить в отделе с замороженной продукцией, обычно рядом еще рыба, масло или мороженное");
        return 0;
    }

    @Override
    public String print_name(String name) {
        System.out.println("Название пельменей:"+ name);
        mark = name;
        return null;
    }

    @Override
    public int print_count(int weight, int percent) {
        System.out.println("В пельменях должно быть либо "+ weight+"грамм, либо"+percent+"% мяса");
        return 0;
    }

    @Override
    public int print_view(String view) {
        System.out.println("Вид мяса который должен быть в пельменях: "+view);
        this.view = view;
        return 0;
    }

    @Override
    public void print_characteristic(String charact) {
        System.out.println("Характеристики теста у пельменей: "+charact);
        
    }
    
    
}
