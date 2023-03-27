public class Lettera {
    public String getNomeMittente() {
        return nomeMittente;
    }

    public void setNomeMittente(String nomeMittente) {
        this.nomeMittente = nomeMittente;
    }

    public String getCognomeMittente() {
        return cognomeMittente;
    }

    public void setCognomeMittente(String cognomeMittente) {
        this.cognomeMittente = cognomeMittente;
    }

    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }

    public String getCognomeDestinatario() {
        return cognomeDestinatario;
    }

    public void setCognomeDestinatario(String cognomeDestinatario) {
        this.cognomeDestinatario = cognomeDestinatario;
    }

    private String nomeMittente;
    private String cognomeMittente;
    private String nomeDestinatario;
    private String cognomeDestinatario;

    public Lettera(String nomeMittente, String cognomeMittente, String nomeDestinatario, String cognomeDestinatario) {
        this.nomeMittente = nomeMittente;
        this.cognomeMittente = cognomeMittente;
        this.nomeDestinatario = nomeDestinatario;
        this.cognomeDestinatario = cognomeDestinatario;
    }

    public Lettera(String nomeMittente) {
        this.nomeMittente = nomeMittente;
    }
    public Lettera (){

    }

    @Override
    public String toString() {
        return "Lettera{" +
                "nomeMittente='" + nomeMittente + '\'' +
                ", cognomeMittente='" + cognomeMittente + '\'' +
                ", nomeDestinatario='" + nomeDestinatario + '\'' +
                ", cognomeDestinatario='" + cognomeDestinatario + '\'' +
                '}';
    }
}
