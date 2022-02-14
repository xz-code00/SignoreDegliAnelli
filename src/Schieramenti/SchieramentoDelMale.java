package Schieramenti;

import Personaggio.Eroe;
import Personaggio.Razza.Razza;

public class SchieramentoDelMale {

    private Nodo head;

    public void aggiungiInTesta(Object info){
        if ((((Razza)info).getFazione().equals("male")) || ((info instanceof Eroe) && (((Eroe)info).getFazione().equals("male"))))
            head = new Nodo(info, head);
        else
            System.out.println("Questo personaggio non può far parte della categoria male");
    }

    public void rimuoviInTesta(){
        head = head.getLink();
    }



}
