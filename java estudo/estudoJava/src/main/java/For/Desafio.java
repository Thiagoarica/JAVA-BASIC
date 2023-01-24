package For;

public class Desafio {
    public static void main(String[] args) {
        for (String hashtag = "#"; !hashtag.equals("######"); hashtag += "#") {
//foi utilizado o .equals para fazer o comparativo entra as strings
            System.out.println(hashtag);
        }

    }
}