public class Matriz {

    public static void main(String[] args) {

        int [][] A = {
           {1, 2, 3},
           {4, 5, 6},
        };

        int [][] B = {
            {1, 2},
            {3, 4},
            {5, 6},
        };
        int[][] C = new int[2][2];

        C[0][0] = A[0][0]*B[0][0] + A[0][1]*B[1][0] + A[0][2]*B[2][0]
        C[0][1] = A[0][0]*B[0][1] + A[0][1]*B[1][1] + A[0][2]*B[2][1]

        C[1][0] = A[1][0]*B[0][0] + A[1][1]*B[1][0] + A[1][2]*B[2][0]
        C[1][1] = A[1][0]*B[0][1] + A[1][1]*B[1][1] + A[1][2]*B[2][1]

        //Teste de push

        System.out.println(C[0][0]) + C[0][1]);
        System.out.println(C[1][0]) + C[1][1]);
    }
}