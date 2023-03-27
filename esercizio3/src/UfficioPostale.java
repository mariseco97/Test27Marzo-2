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


    @Override
    public String toString() {
        return "UfficioPostale{" +
                "lettere=" + Arrays.toString(lettere) +
                '}';
    }
}
