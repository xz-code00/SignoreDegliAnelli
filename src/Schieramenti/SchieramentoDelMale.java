package Schieramenti;

import Personaggio.Eroe;
import Personaggio.Razza.Razza;

public class SchieramentoDelMale {

    private Nodo head;

    public void aggiungiInTesta(Object info){
        if (((info instanceof Razza) && (((Razza)info).getFazione().equals("male")) || ((info instanceof Eroe) && (((Eroe)info).getFazione().equals("male")))))
            head = new Nodo(info, head);
        else
            System.out.println("Questo personaggio non può far parte della categoria male");
    }

    public void rimuoviInTesta(){
        head = head.getLink();
    }

    public int calcolaForzaTot(){
        int forzaTot = 0;
        for (Nodo p = head; p != null; p = p.getLink()){
            if (p.getInfo() instanceof Razza)
                 forzaTot += (((Razza)p.getInfo()).getForzaDiCombattimento());
            if (p.getInfo() instanceof Eroe)
                forzaTot += (((Eroe)p.getInfo()).getForzaDiCombattimento());
        }

        return forzaTot;
    }

}
