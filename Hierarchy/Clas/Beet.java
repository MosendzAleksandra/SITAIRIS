package Hierarchy.Clas;

public class Beet extends RootVeg {

    private int length;
    private int width;
    
    public Beet()
    {
        super();
        length = 10;
        width = 3;
    }
    public Beet(boolean b, int l, int w)
    {
        super(b);
        length = l;
        width = w;
    }

    @Override
    public int print_how_many(int count, int kilo) {
        System.out.println("Купить нужно либо "+count +"штук"+", либо "+kilo+"килограмм");
        return 0;
    }

    @Override
    public int print_date(String date) {
        System.out.println("За свеклой нужно сходить "+date);
        return 0;
    }

    @Override
    public int print_time(int hour, int minute) {
        System.out.println("В "+hour+":"+minute);
        return 0;
    }

    @Override
    public int print_place() {
        System.out.println("Свекла продается в овощном отделе");
        return 0;
    }
    @Override
    public void print_inf() {
        System.out.println("Длина морковки "+ length);
        System.out.println("Диаметр "+width);
        
    }
    
}
