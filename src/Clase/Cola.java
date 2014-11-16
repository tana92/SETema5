package Clase;

import interfaces.Continut;

/**
 * Created by Tanasescu on 11/16/2014.
 */
public class Cola implements Continut {

    private String NumeProdus;
    private String NumeBautura;
    private Integer cantitate;

    public Cola(String numeProdus, String numeBautura, Integer cantitate) {
        NumeProdus = numeProdus;
        NumeBautura = numeBautura;
        this.cantitate = cantitate;
    }

    public String getNumeProdus() {
        return NumeProdus;
    }

    public void setNumeProdus(String numeProdus) {
        NumeProdus = numeProdus;
    }

    public String getNumeBautura() {
        return NumeBautura;
    }

    public void setNumeBautura(String numeBautura) {
        NumeBautura = numeBautura;
    }

    public Integer getCantitate() {
        return cantitate;
    }

    public void setCantitate(Integer cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public void inauntru() {
        System.out.println("Suc-Acidulat\n.Aceasta este o sticla de : "+NumeBautura+" marca : "+NumeProdus+" in cantitatea de : "+cantitate);

    }
}
