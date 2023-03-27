public class Main {
    public static void main(String[] args) {

        Lettera lettera1 = new Lettera("gino","pallino", "ciccio", "ciccia");
        Lettera lettera2 = new Lettera("ciro","espo", "carlo", "conti");
        Lettera lettera3 = new Lettera("paolo","brosio", "pippo", "baudo");

        UfficioPostale ufficioPostale = new UfficioPostale();
        ufficioPostale.aggiungiLettera(lettera1);
        ufficioPostale.aggiungiLettera(lettera2);
        ufficioPostale.aggiungiLettera(lettera3);
        System.out.println(ufficioPostale.toString());
        System.out.println("-----------------------------2 esercizio------------------------------------");


    }
}