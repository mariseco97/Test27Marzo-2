import java.util.ArrayList;
import java.util.Arrays;

public class UfficioPostale {

    private Lettera [] lettere = new Lettera[1000];


    public UfficioPostale (){

    }
    public void aggiungiLettera (Lettera nuovaLettera){ //primo metedo

        for (int i=0; i<lettere.length;i++)
            if(lettere[i] == null) {
                lettere[i] = nuovaLettera;
                break;
            }
    }

    public Lettera getProssimaLettera() {
        Lettera primaLettera = null;
        for (int i = 0; i < lettere.length; i++) {
            if (lettere[i] != null) {
                primaLettera = lettere[i];
                lettere[i] = null;
                break;
            }
        }
        return primaLettera;
    }

    public int contaLetterePerDestinatario(String nomeDestinatario, String cognomeDestinatario) {
        int conteggio = 0;
        for (Lettera l : lettere) {
            if (l != null && l.getNomeDestinatario().equals(nomeDestinatario)
                    && l.getCognomeDestinatario().equals(cognomeDestinatario)) {
                conteggio++;
            }
        }
        return conteggio;
    }


    @Override
    public String toString() {
        return "UfficioPostale{" +
                "lettere=" + Arrays.toString(lettere) +
                '}';
    }
}
