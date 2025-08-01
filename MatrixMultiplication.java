public class MatrixMultiplication{

    int[][] matrix1 = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    public void printMatrix(){
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        
    }


    public static void main(String[] args){
        MatrixMultiplication multiMat = new MatrixMultiplication();
        multiMat.printMatrix();
    }
}