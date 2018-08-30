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
    
    public Basic_Matrix_Operations(double[][] matrix){
        this.matrix = matrix;
    }
    
    public Basic_Matrix_Operations(int[][] matrix){
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
        return this.matrix_addition(this.convert(m));
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
        return this.matrix_subtraction(this.convert(m));
    }
    
    public double[][] matrix_transpose(){
        double[][] m = this.matrix;
        double[][] temp = new double[m.length][m[0].length];
        for (int i=0; i<m.length; i++){
            for(int j=0;j<m[0].length; j++)                
                temp[j][i] = m[i][j];
        }
        return temp;
    }
    
    public double[][] matrix_multiplication(double[][] m){
        double[][] t = this.matrix;
        double[][] temp = new double[t.length][m[0].length];
        if(t[0].length == m.length){
            for(int i=0; i < t.length; i++){
                for(int j=0; j < m[0].length; j++){
                    for(int k=0; k < m.length; k++){
                        temp[i][j] += t[i][k]*m[k][j];
                    }
                }
            }
        } else {
            System.out.println("Unable to do matrix multiplication.");
        }            
        return temp;
    }
    
    public double[][] matrix_multiplication(int[][] m){
        return this.matrix_multiplication(this.convert(m));
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
