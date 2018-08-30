/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation;

/**
 *
 * @author haitht
 */
public class Basic_Matrix_Operations {

    public double[][] matrix;

    public Basic_Matrix_Operations(double[][] matrix) {
        this.matrix = matrix;
    }

    public Basic_Matrix_Operations(int[][] matrix) {
        this.matrix = convert(matrix);
    }

    public double[][] matrix_addition(double[][] m) {
        double[][] temp = new double[matrix.length][matrix[0].length];
        if (matrix.length == m.length) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    temp[i][j] = matrix[i][j] + m[i][j];
                }
            }
        } else {
            System.out.println("Unable to do matrix addition.");
        }
        return temp;
    }

    public double[][] matrix_addition(int[][] m) {
        return this.matrix_addition(this.convert(m));
    }

    public double[][] matrix_subtraction(double[][] m) {
        double[][] temp = new double[matrix.length][matrix[0].length];
        if (matrix.length == m.length) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    temp[i][j] = matrix[i][j] - m[i][j];
                }
            }
        } else {
            System.out.println("Unable to do matrix addition.");
        }
        return temp;
    }

    public double[][] matrix_subtraction(int[][] m) {
        return this.matrix_subtraction(this.convert(m));
    }

    public double[][] matrix_transpose() {
        double[][] m = this.matrix;
        double[][] temp = new double[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                temp[j][i] = m[i][j];
            }
        }
        return temp;
    }

    public double[][] matrix_multiplication(double[][] m) {
        double[][] t = this.matrix;
        double[][] temp = new double[t.length][m[0].length];
        if (t[0].length == m.length) {
            for (int i = 0; i < t.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    for (int k = 0; k < m.length; k++) {
                        temp[i][j] += t[i][k] * m[k][j];
                    }
                }
            }
        } else {
            System.out.println("Unable to do matrix multiplication.");
        }
        return temp;
    }

    public double[][] matrix_multiplication(int[][] m) {
        return this.matrix_multiplication(this.convert(m));
    }

    public double[][] scalar_multiplication(double number) {
        double[][] m = this.matrix;
        double[][] temp = new double[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                temp[i][j] = number * m[i][j];
            }
        }
        return temp;
    }

    public double[][] scalar_multiplication(int number) {
        return this.scalar_multiplication(number * 1.0);
    }

    /*Calculate the mean*/
    public double mean() {
        // Calculate the sum
        double[][] a = this.matrix;
        double mean;
        int n = this.matrix.length;
        if (this.is_squared_matrix(a)) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sum += a[i][j];
                }
            }
            // Returning mean
            return mean = sum / (n * n);
        } else {
            System.out.println("Not a squared matrix. Cannot find mean.");
            return mean = 0.0;
        }

    }

    // Calculate the variance
    public double variance() {
        double[][] a = this.matrix;

        int n = this.matrix.length;
        int sum = 0;
        if (this.is_squared_matrix(a)) {
            double m = this.mean();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    // subtracting mean
                    // from elements
                    a[i][j] -= m;

                    // a[i][j] = fabs(a[i][j]);
                    // squaring each terms
                    a[i][j] *= a[i][j];
                }
            }
            // taking sum
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sum += a[i][j];
                }
            }

            return sum / (n * n);
        } else {
            System.out.println("Not a squared matrix. Cannot find variance");
            return 0.0;
        }
    }

    /*Calculate the standard deviation of the squared matrix*/
    public double standard_deviation() {
        return Math.sqrt(this.variance());
    }

    /*Matrix standardization*/
    public void matrix_standardize() {
        int rows = this.matrix.length;
        int cols;
        if (this.is_squared_matrix(this.matrix)) {
            cols = rows;
            double mu = this.mean();
            double sig = this.standard_deviation();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    this.matrix[i][j] = (this.matrix[i][j] - mu) / sig;
                }
            }
        } else {
            System.out.println("Not a squared matrix. "
                    + "Cannot standardize the matrix.");
        }
    }

    private double[][] convert(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        double[][] temp = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                temp[i][j] = matrix[i][j] * 1.0;
            }
        }
        return temp;
    }

    private boolean is_squared_matrix(double[][] m) {
        return (m.length == m[0].length) ? true : false;
    }
}
