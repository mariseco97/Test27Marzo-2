import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Esame> listaEsami = new ArrayList<Esame>();
        listaEsami.add(new Esame(1, "conti", 20));
        listaEsami.add(new Esame(2, "secondo", 30));
        listaEsami.add(new Esame(3, "iazzetta", 29));
        Corso corso = new Corso(listaEsami);
        System.out.println(corso.votoMinimo());





    }
}