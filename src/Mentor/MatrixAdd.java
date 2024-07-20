package Mentor;

public class MatrixAdd {
    public static void main(String[] args) {
        int[][] matrixA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrixB = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] sumMatrix = new int[matrixA.length][matrixB.length];
        int[][] multiplyMatrix = new int[matrixA.length][matrixB.length];
        int[][] transpose = new int[matrixA.length][matrixB.length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                multiplyMatrix[i][j] += matrixA[i][j] * matrixB[i][j];
                transpose[i][j] = matrixA[j][i];
            }
        }
        System.out.println("Addition: ");
        sum(sumMatrix);
        System.out.println("Multiplication: ");
        multiply(multiplyMatrix);
        System.out.println("Transpose: ");

        for (int[] tp : transpose) {
            for (int n : tp) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    public static void sum(int[][] sumMatrix) {

        for (int[] numbs : sumMatrix) {
            for (int n : numbs) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

    }

    public static void multiply(int[][] multiplyMatrix) {
        for (int[] numbs : multiplyMatrix) {
            for (int n : numbs) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
