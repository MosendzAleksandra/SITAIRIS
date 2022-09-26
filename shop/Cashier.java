package shop;

public class Cashier
{
    protected String fio;
    protected int numberCash;

    public int getNumberCash() {
        return numberCash;
    }

    public String getFio() {
        return fio;
    }


    public Cashier()
    {
        fio = "Мосендз Александра Викторовна";
        numberCash = 1;
    }


}