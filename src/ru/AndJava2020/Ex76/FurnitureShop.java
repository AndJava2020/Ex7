package ru.AndJava2020.Ex76;

import ru.AndJava2020.Ex76.Furniture;

import java.io.IOException;
import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList<Furniture> warehouse;
    private int val;

    public FurnitureShop() {
        this.warehouse = new ArrayList<>();
        val=0;
    }

    public void sell(Furniture a){
        if (warehouse.contains(a)){
            System.out.println("selling " + a);
            warehouse.remove(a);
            System.out.println("success");
        }
        else{
            System.out.println("all sold");
        }

    }

    public void addWarehouse(Furniture...a){
        for (Furniture obj:a
        ) {
            warehouse.add(obj);
            val++;
        }
    }

    void showAssortment(){
        System.out.println("in storage");
        for(int i=0; i<warehouse.size(); i++)
            System.out.println(warehouse.get(i));
    }

}
