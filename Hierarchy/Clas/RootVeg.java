package Hierarchy.Clas;

import Hierarchy.Inter.BuyVegetables;

public abstract class RootVeg implements BuyVegetables {

    protected boolean washed;

    public RootVeg()
    {
        washed = false;
    }

    public RootVeg(boolean w)
    {
        washed = w;
    }

    public abstract void print_inf();
    
}
