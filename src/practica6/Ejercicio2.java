package practica6;

/**
 * @author Marcos Khabie
 * @version 1.0
 */
public class Ejercicio2 {

    public boolean isSymetrical(int[][] squareMatrix){
      boolean result=false;
        for (int i = 0; i < squareMatrix.length; i++) {
          for (int j=0;j< squareMatrix[i].length;j++){
              if (squareMatrix[i][j]==squareMatrix[j][i]){
                  result=true;
              }
              else result=false;
            }
        }
        return result;
    }

    public boolean isDiagonallyDominant(int[][] squareMatrix){
        boolean result=false;

        for (int i = 0; i < squareMatrix.length; i++) {
            int sumNonDiagonal=0;
            for (int j=0;j< squareMatrix[i].length;j++){
                if (i!=j){
                    sumNonDiagonal+=squareMatrix[i][j];
                }
            }
            if (squareMatrix[i][i]>sumNonDiagonal){
                result=true;
            }
            else result=false;

        }
        return result;
    }

}
