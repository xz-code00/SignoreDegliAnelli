public class Uomo extends Razza{

    public Uomo(int esperienzaDiCombattimento){
        super(esperienzaDiCombattimento);
    }

    public int calcolaForzadiCombattimento(){
        return 30 + 6*(esperienzaDiCombattimento);
    }
}
