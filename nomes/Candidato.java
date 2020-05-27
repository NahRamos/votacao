package nomes;

public class Candidato {
    private String nome;
    private String categoria;
    private int id;
    private int numeroVotos;

    public Candidato() {
    }
    
    public Candidato(String nome, String categoria, int id, int numeroVotos) {
        this.nome = nome;
        this.categoria = categoria;
        this.id = id;
        this.numeroVotos = numeroVotos;
    }

    public Candidato(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public Candidato(String nome) {
        this.nome = nome;
    }

    public Candidato(int id, String nome, int numeroVotos) {
        this.id = id;
        this.nome = nome;
        this.numeroVotos = numeroVotos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroVotos() {
        return numeroVotos;
    }

    public void setNumeroVotos(int numeroVotos) {
        this.numeroVotos = numeroVotos;
    }
}



/*
package nomes;

public class Candidato {
    private String nome;
    private int idCategoria;
    private int id;
    private int numeroVotos;

    public Candidato() {
    }

    public Candidato(int idCategoria, String nome) {
        this.idCategoria = idCategoria;
        this.nome = nome;
    }

    public Candidato(int id, String nome, int idCategoria, int numeroVotos) {
        this.nome = nome;
        this.idCategoria = idCategoria;
        this.id = id;
        this.numeroVotos = numeroVotos;
    }
    
    public Candidato(int id, String nome, int numeroVotos) {
        this.nome = nome;
        this.id = id;
        this.numeroVotos = numeroVotos;
    }
    
    public Candidato(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroVotos() {
        return numeroVotos;
    }

    public void setNumeroVotos(int numeroVotos) {
        this.numeroVotos = numeroVotos;
    }
}
*/