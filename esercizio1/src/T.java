public class T {

    private int ore;
    private int minuti;
    private int secondi;

    public T (){
    }

    public T(int ore, int minuti, int secondi) {
        this.ore = ore;
        this.minuti = minuti;
        this.secondi = secondi;
    }
    public int getOre() {
        return ore;
    }

    public void setOre(int ore) {
        this.ore = ore;
    }

    public int getMinuti() {
        return minuti;
    }

    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    public int getSecondi() {
        return secondi;
    }

    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }



    @Override
    public String toString() {
        return "T{" +
                "ore=" + ore +
                ", minuti=" + minuti +
                ", secondi=" + secondi +
                '}';
    }

    // TODO : aggiungi a setOrario i try catch perché deve essere un orario sensato
    public void setOrario(int ore, int  minuti, int secondi){

        this.ore = ore;
        this.minuti = minuti;
        this.secondi = secondi;
    }


    public void addOra(int ore, int minuti, int secondi) {
        this.secondi += secondi;
        this.minuti += minuti;
        this.ore += ore;
        if (this.secondi >= 60) {
            this.secondi -= 60;
            this.minuti += 1;
        }
        if (this.minuti >= 60) {
            this.minuti -= 60;
            this.ore += 1;
        }
        if (this.ore >=24){
            this.ore -= 24;
        }




    }


    public void subOra(int ore, int minuti, int secondi) {
        // convertiamo l'ora corrente in secondi
        int oraSecondi = this.ore * 3600 + this.minuti * 60 + this.secondi;

        // convertiamo l'ora da sottrarre in secondi
        int sottrazioneSecondi = ore * 3600 + minuti * 60 + secondi;

        // sottraiamo i secondi dell'ora da sottrarre dall'ora corrente
        oraSecondi -= sottrazioneSecondi;

        // se il tempo risultante è negativo, aggiungiamo 24 ore per ottenere l'ora corretta
        if (oraSecondi < 0) {
            oraSecondi += 24 * 3600;
        }

        // convertiamo i secondi risultanti in ore, minuti e secondi
        this.ore = oraSecondi / 3600;
        oraSecondi %= 3600;
        this.minuti = oraSecondi / 60;
        this.secondi = oraSecondi % 60;
    }



}
