public class lab2 {
    public static void main(String[] args) {
        final float[][] firstMatrix = {
                {1, 2, 3, 6},
                {5, 6, 0, 3},
                {7, 5, 6, 7}
        };

        final float[][] secondMatrix = {
                {6, 5, 4, 1},
                {7, 6, 3, 9},
                {3, 5, 4, 1}
        };

        final int firstColumns = firstMatrix.length;
        final int secondColumns = secondMatrix.length;

        int firstRows = firstMatrix[0].length;
        int secondRows = secondMatrix[0].length;
        int rows;

        for (int i = 0; i < firstColumns; i++) {
            rows = firstMatrix[i].length;
            if (rows > firstRows) {
                firstRows = rows;
            }
        }

        for (int i = 0; i < secondColumns; i++) {
            rows = secondMatrix[i].length;
            if (rows > secondRows) {
                secondRows = rows;
            }
        }

        final int n = firstColumns + secondColumns;
        final int m = firstRows + secondRows;

        float[][] thirdMatrix = new float[n][m];
        for (int i = 0; i < firstColumns; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++){
                thirdMatrix[i][j] = firstMatrix[i][j];
            }
        }

        for (int i = 0; i < secondColumns; i++) {
            for (int j = 0; j < secondMatrix[i].length; j++) {
                thirdMatrix[i + firstColumns][j + firstRows] = secondMatrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(thirdMatrix[i][j]  + "\t");
            }
            System.out.println();
        }

        float sum = 0;
        for (int i = 0; i < n; i++) {
            float max = thirdMatrix[0][i];
            for (int j = 1; j < thirdMatrix[i].length; j++) {
                if (thirdMatrix[i][j] > max) {
                    max = thirdMatrix[i][j];
                }
            }
            sum += max;
        }

        System.out.println("\nSum of the largest elements of the row: " + sum);
    }
}
