
package examen;

public class Examen {

    public static void main(String[] args) {
   int miInicial [][]= {{10, 20, 30, 40}, {1, 2, 3, 4}, {20, 21, 22, 23}};
   int Mcopia [][] = new int[3][4];
   int fila =2;
   int col = 3;
   
        for (int i = 0; i <miInicial.length; i++) {
            for (int j = 0; j < miInicial[0].length; j++) {
               Mcopia[fila][col] = miInicial[i][j];   
             col--;   
            }
            fila--;
            col =3;
        }
         for (int i = 0; i <miInicial.length; i++) {
            for (int j = 0; j < miInicial[0].length; j++) {
                System.out.print(Mcopia [i][j] + "|");
            }
             System.out.println("");
    }
    
    }
}