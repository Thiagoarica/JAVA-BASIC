package bancoT;

public class Conta {

    private String nome;

    private int cpf;

    private String email;



    public Conta(String nome, int cpf, String email){
        this.nome= nome;
        this.cpf= cpf;
        this.email= email;

    }

    public String getNome() {
        return nome;
    }




    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




}
