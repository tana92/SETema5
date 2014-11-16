package main;

import Clase.AbstractFactory;
import Clase.FactoryProducer;
import interfaces.Continut;


/**
 * Created by Tanasescu on 11/16/2014.
 */
public class Main {

    public static void main(String args[])
    {
        //alegem tipul de factory(Continut)
        AbstractFactory sticlafact  = FactoryProducer.getFactory("Continut");

        /**
         * am ales interfata acum selectam obiecte de tip Continut si testam majoritatea variantelor
         */

        Continut sticla1 = sticlafact.CreareTipSticla("Cola","suc",2);
        sticla1.inauntru();

        Continut sticla2 = sticlafact.CreareTipSticla("J&B","whiskey",1);
        sticla2.inauntru();

    }
}
