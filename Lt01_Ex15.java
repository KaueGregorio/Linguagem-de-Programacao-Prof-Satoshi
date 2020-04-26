/*
Objetivo: 15.	Receba os valores de 2 catetos de um triangulo retangulo. Calcule e mostre a hipotenusa.
Programador: Kauê Valentim Gregório
Data: 02/02/2020
*/
import javax.swing.JOptionPane;
public class Lt01_Ex15{
    public static void main (String args []){
    //declaração de variaveis
    Integer catop, catad, hipo, somacat1, somacat2; 
    double resultado; 
    
    //mensagem ao usuário e entrada de dados
    catop = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do primeiro cateto oposto:"));
    catad = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do segundo cateto adjacente:"));
   
    //calculo e saida de dados
   somacat1 = (catop * catop); 
   somacat2 = (catad * catad);
   hipo = (somacat1 + somacat2);
   resultado = Math.sqrt(hipo); 
       System.out.println("O valor da Hipotenusa é:"+resultado );
       
}//fim do void 
}//fim do class
