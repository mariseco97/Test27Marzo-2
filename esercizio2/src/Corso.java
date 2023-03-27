import java.util.ArrayList;

public class Corso {

    private ArrayList<Esame> listaEsami;
    public Corso(ArrayList<Esame> listaEsami) {
        this.listaEsami = listaEsami;
    }

    public int votoMinimo(){
        int i;
        Esame tmp = listaEsami.get(0);

        for (Esame esame: listaEsami
             ) {
            if( esame.getVoto() < tmp.getVoto() ){
                tmp = esame;
            }

        }
        return tmp.getVoto();
    }
    public void studentiPeggiori(){
        ArrayList<String> listaCognomiPeggiori = null;
        for (Esame esame: listaEsami) {
            if(esame.getVoto() == votoMinimo()){
                System.out.println(esame.getCognome());
            }
        }

    }

}
