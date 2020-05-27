package nomes;
public class Eleitor {
    private int id;
    private String nome;
    private boolean jaVotou;

    public Eleitor() {
    }

    public Eleitor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public Eleitor(int id, String nome, boolean jaVotou) {
        this.id = id;
        this.nome = nome;
        this.jaVotou = jaVotou;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isJaVotou() {
        return jaVotou;
    }

    public void setJaVotou(boolean jaVotou) {
        this.jaVotou = jaVotou;
    }   
}