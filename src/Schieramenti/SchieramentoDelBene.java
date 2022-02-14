package Schieramenti;

import Personaggio.Eroe;
import Personaggio.Razza.Razza;

public class SchieramentoDelBene {

    private Nodo head;

    public void aggiungiInTesta(Object info){
        if ((((Razza)info).getFazione().equals("bene")) || ((info instanceof Eroe) && (((Eroe)info).getFazione().equals("bene"))))
            head = new Nodo(info, head);
        else
            System.out.println("Questo personaggio non può far parte della categoria bene");
    }

    public void rimuoviInTesta(){
        head = head.getLink();
    }

}
