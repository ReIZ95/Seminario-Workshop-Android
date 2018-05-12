package perfil.android.workshop.workshopandroid;

public class Companhia {

    private String nome;
    private String telefone;
    private String email;
    private String morada;
    private String path;


    public Companhia(String nome, String telefone, String email, String morada, String path) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.morada = morada;
        this.path = path;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
