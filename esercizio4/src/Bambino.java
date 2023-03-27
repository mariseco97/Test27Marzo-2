public class Bambino implements Comparabile{
    private String nome;
    private int eta;

    public Bambino(){

    }

    public Bambino(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Bambino{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }



    @Override
    public boolean maggioreDi(Object x) {
        Bambino b=(Bambino) x;
        return this.eta>b.eta;
    }
}
