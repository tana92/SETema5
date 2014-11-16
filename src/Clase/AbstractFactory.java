package Clase;

import interfaces.Continut;

/**
 * Created by Tanasescu on 11/16/2014.
 */
public abstract class AbstractFactory {

    /**
     * clasa abstracta cu care luam tipul de sticla de bauturi
     */
    public abstract Continut CreareTipSticla(String NumeProdus,String NumeBautura,Integer cantitate);
    /**
     * metoda abstracta
     */
}
