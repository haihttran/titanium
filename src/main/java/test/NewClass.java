/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import calculation.*;
/**
 *
 * @author tranh
 */
public class NewClass {
    public static void main(String[] args) throws Exception{
        double array[] = {3.2, 2.2, 2.2, 2.1, 4.9, 5.1, 
                            4.3, 2.2, 3.1, 9.0, 7.6, 5.1};
        //int array[] = {1, 3, 5, 1, 7, 8, 5, 9, 3, 10, 2, 2, 6, 4, 5, 11, 8};
//        Basic_Stats_Operations c = new Basic_Stats_Operations(array);
//        System.out.printf("The mean of the dataset: %.4f\n", c.get_mean());
//        System.out.printf("The median of the dataset: %.4f\n", c.get_median());
//        System.out.printf("The mode of the dataset: %.4f\n", c.get_mode());
//        System.out.printf("The variance of the dataset: %.4f\n",
//                c.get_variance());
//        System.out.printf("The standard deviation of the dataset: %.4f\n",
//                c.get_standard_deviation());
//        double[] z = c.get_z_score();        
//        for (int i = 0; i < z.length; i++){
//            System.out.printf("The z score of the point %.4f the dataset: %.4f\n",
//                    array[i], z[i]);
//        }
//        System.out.printf("The z score of the point %.4f the dataset: %.4f\n",
//                    4.62, c.get_z_score(4.62));

        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{9,8,7},{6,5,4},{3,2,1}};
        double[][] matrix3 ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        Basic_Matrix_Operations m = new Basic_Matrix_Operations(matrix1);
        Basic_Matrix_Operations m2 = new Basic_Matrix_Operations(matrix2);
        double temp[][] = m.matrix_addition(matrix2);
        double temp2[][] = m2.matrix_subtraction(matrix1);
        print_matrix(temp);
        print_matrix(temp2);
//        print_matrix(matrix1);
//        print_matrix(m.matrix_transpose());
//        print_matrix(matrix2);
//        print_matrix(m2.matrix_transpose());
//        print_matrix(m2.matrix_multiplication(matrix1));
//        print_matrix(m2.matrix_multiplication(matrix3));
    }   

    public static void print_matrix(double[][] matrix){
        System.out.println("============================");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.printf("%.2f\t", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("============================");
    }
}
