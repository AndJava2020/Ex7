package ru.AndJava2020.Ex76;

import ru.AndJava2020.Ex76.Armchair;
import ru.AndJava2020.Ex76.Furniture;
import ru.AndJava2020.Ex76.Table;

public class Main {

    public static void main(String[] args) {
        FurnitureShop Zurab=new FurnitureShop();

        Furniture A=new Armchair("spruce",100,"dark brown",8000);
        Furniture B=new Table("oak",100,50, 100,"brown",7000);
        Zurab.addWarehouse(A, B);
        Zurab.showAssortment();
        Zurab.sell(A);
        Zurab.showAssortment();
        Furniture C=new Armchair("birch", 100, "white",6000);
        Zurab.addWarehouse(C);
        Zurab.showAssortment();
    }
}
