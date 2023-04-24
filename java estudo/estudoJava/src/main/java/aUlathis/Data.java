package aUlathis;

public class Data {

    int dia;
    int mes;
    int ano;
Data(){
    dia=1;
    mes=4;
    ano =1991;

}
Data(int dia, int mes,int ano){
    dia =this.dia;
    mes= this.mes;
    ano = this.ano;
}
 String obterDataFormatada(){
    return String.format("%d %d %d", dia,mes, ano);


 }
 void imprimirDataFormatada(){
     System.out.println(obterDataFormatada());
 }
}
