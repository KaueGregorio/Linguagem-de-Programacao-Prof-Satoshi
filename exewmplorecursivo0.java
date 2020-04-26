/*
programador: Kauê Gregório
exemplo recursividade
 */
import javax.swing.JOptionPane;
public class exewmplorecursivo0 {
    public static void main(String args []){
//variaveis
int num;
num = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor para o calculo do fatorial:"));
System.out.println( ffat(num));        

}//fecha void    

public static int ffat(int n){
int fat;
if (n > 1)
   {
    fat=n * ffat (n - 1);
    return fat;
   }
else
  {
    return n;
  }//fecha if
}//fecha main
}//fecha class