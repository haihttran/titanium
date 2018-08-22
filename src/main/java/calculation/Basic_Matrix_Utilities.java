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
public class Basic_Matrix_Utilities {
    public double[][] matrix;
    
    public Basic_Matrix_Utilities(double[][] matrix){
        this.matrix = matrix;
    }
    
    public Basic_Matrix_Utilities(int[][] matrix){
        this.matrix = convert(matrix);
    }
    
    public double[][] matrix_addition(double[][] m){        
        double[][] temp = new double[matrix.length][matrix[0].length];
        if(matrix.length == m.length){
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[0].length; j++){
                   temp[i][j] = matrix[i][j] + m[i][j];
                }
            }
        }
        else {
            System.out.println("Unable to do matrix addition.");
        }
        return temp;
    }
    
    public double[][] matrix_addition(int[][] m){        
        double[][] temp = new double[matrix.length][matrix[0].length];
        if(matrix.length == m.length){
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[0].length; j++){
                   temp[i][j] = matrix[i][j] + m[i][j];
                }
            }
        }
        else {
            System.out.println("Unable to do matrix addition.");
        }
        return temp;
    }
    
    public double[][] matrix_subtraction(double[][] m){        
        double[][] temp = new double[matrix.length][matrix[0].length];
        if(matrix.length == m.length){
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[0].length; j++){
                   temp[i][j] = matrix[i][j] - m[i][j];
                }
            }
        }
        else {
            System.out.println("Unable to do matrix addition.");
        }
        return temp;
    }
    
    public double[][] matrix_subtraction(int[][] m){        
        double[][] temp = new double[matrix.length][matrix[0].length];
        if(matrix.length == m.length){
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[0].length; j++){
                   temp[i][j] = matrix[i][j] - m[i][j];
                }
            }
        }
        else {
            System.out.println("Unable to do matrix addition.");
        }
        return temp;
    }
    
    private double[][] convert(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        double[][] temp = new double[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                temp[i][j] = matrix[i][j]*1.0;
            }
        }
        return temp;
    }
}
