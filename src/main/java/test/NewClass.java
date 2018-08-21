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
        double array[] = {3.2, 2.2, 2.2, 2.1, 4.9, 5.1, 4.3, 2.2, 3.1, 9.0, 7.6, 5.1};
        //int array[] = {1, 3, 5, 1, 7, 8, 5, 9, 3, 10, 2, 2, 6, 4, 5, 11, 8};
        Calculation_Utilities c = new Calculation_Utilities();
        System.out.printf("The mean of the dataset: %f\n", c.get_mean(array));
        System.out.printf("The median of the dataset: %f\n", c.get_median(array));
        System.out.printf("The mode of the dataset: %f\n", c.get_mode(array));
        System.out.printf("The variance of the dataset: %f\n",
                c.get_variance(array));
        System.out.printf("The standard deviation of the dataset: %f\n",
                c.get_standard_deviation(array));
    }
    
}
