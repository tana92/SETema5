package Clase;

import interfaces.Continut;

/**
 *
 * in aceasta clasa suprascriem metoda din abstract factory si diferentiem bauturile
 *
 * Created by Tanasescu on 11/16/2014.
 */
public class SticlaFactory extends AbstractFactory {

    @Override
    public Continut CreareTipSticla(String NumeProdus, String NumeBautura, Integer cantitate) {


        {
            if (NumeBautura == "whiskey") {
                return new Whiskey(NumeProdus, NumeBautura, cantitate);
            } else if (NumeBautura == "suc" && cantitate == 2) {
                return new Cola(NumeProdus, "Cola", 2);
            } else if (NumeBautura == "suc" && cantitate != 2) {
                return new Granini(NumeProdus, NumeBautura, cantitate);
            } else {
                return null;
            }

        }
    }
}
