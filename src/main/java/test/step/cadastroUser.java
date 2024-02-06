package test.step;

public class cadastroUser {

    private String nome;
    private String profissao;

    public cadastroUser() {
    }

    public cadastroUser(String nome, String profissao) {
        super();
        this.nome = nome;
        this.profissao = profissao;
    }


    public String getnome() {
        return nome;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public String getprofissao() {
        return profissao;
    }
    public void setprofissao(String senha) {
        this.profissao = senha;
    }

    @Override
    public String toString() {
        return "User [nome=" + nome + ", profissao=" + profissao +"]";
    }
}
