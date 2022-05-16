
package exercicios;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String dataNascimento;
        String meses[] = {"Janeiro" , "Fevereiro", "Março" , "Abril" , "Maio" , "Junho" , "Julho" , "Agosto" , "Setembro" , "Outubro" , "Novembro" , "Dezembro"};
       
        System.out.println("Informe a data de nascimento: ");
        dataNascimento = sc.nextLine();
        
        String stringDia = dataNascimento.substring(0, 2);
        String stringAno = dataNascimento.substring(6);
        String stringMes = dataNascimento.substring(3, 5);
        
        int mes = Integer.parseInt(stringMes);
        
        if(mes > 0 && mes <= 12){
            System.out.println("Você nasceu em " + stringDia + " de " + meses[mes-1] + " de " + stringAno);
        } else{
            System.out.println("Data invalida");
        }
    }
}
