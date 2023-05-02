package oo.composicao;

public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno1=new Aluno("PEDRO");
        Aluno aluno2=new Aluno("CAIO");
        Aluno aluno3=new Aluno("THIAGO");



        Aluno aluno4=new Aluno("rodrigo");
        Aluno aluno5=new Aluno("PEDRO");
        Aluno aluno6=new Aluno("PEDRO");



        Curso curso1 = new Curso ("java basico");
        Curso curso2 = new Curso ("java intermwediario");
        Curso curso3 = new Curso ("java avancado ");



        // relacionamento//
        curso1.getAluno(aluno1);
        curso2.getAluno(aluno3);
        curso3.getAluno(aluno2);
        curso1.getAluno(aluno4);
        curso1.getAluno(aluno5);



        for(Aluno aluno:curso1.alunos){
            System.out.println("estou matriculado no curso 1");
            System.out.println("meu nome é " + aluno.nome);
        }


    }
}
