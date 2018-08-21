/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation;

import java.math.RoundingMode;
import java.util.HashMap;

/**
 *
 * @author tranh
 */
public final class Calculation_Utilities {

    //calculate mean of a set
    public Calculation_Utilities() {

    }

    public double get_mean(double[] array) {
        double accumulation = 0;
        for (double d : array) {
            accumulation += d;
        }
        return accumulation / array.length;
    }

    //calculate median of a set
    public double get_median(double[] array) {
        int n = array.length;
        return n % 2 == 0 ? (array[n / 2] + array[(n / 2 - 1)]) / 2 : array[(int) Math.floor(n / 2)];
    }

    //calculate the mode of a set
    public double get_mode(double[] array) {
        HashMap map = new HashMap();
        int max_occurence = 1;
        double mode = array[0];
        //loop through the set and find the mode value of the set
        for (double d : array) {
            double current_index_val = d;
            if (map.containsKey(current_index_val)) {
                int curr_occ_num = (Integer) map.get(current_index_val);
                curr_occ_num++;
                map.put(d, curr_occ_num);
                if (curr_occ_num >= max_occurence) {
                    mode = current_index_val;
                    max_occurence = curr_occ_num;
                }
            } else {
                map.put(d, 1);
            }

        }
        return mode;
    }
    /*For integer set */
    public double get_mean(int[] array) {
        double accumulation = 0;
        for (int i : array) {
            accumulation += i;
        }
        return accumulation / array.length;
    }

    //calculate median of a set
    public double get_median(int[] array) {
        int n = array.length;
        return n % 2 == 0 ? (array[n / 2] + array[(n / 2 - 1)]) / 2 : array[(int) Math.floor(n / 2)];
    }

    //Calculate the mode of a set
    public double get_mode(int[] array) {
        HashMap map = new HashMap();
        int max_occurence = 1;
        double mode = array[0];
        //loop through the set and find the mode value of the set
        for (double d : array) {
            double current_index_val = d;
            if (map.containsKey(current_index_val)) {
                int curr_occ_num = (Integer) map.get(current_index_val);
                curr_occ_num++;
                map.put(d, curr_occ_num);
                if (curr_occ_num >= max_occurence) {
                    mode = current_index_val;
                    max_occurence = curr_occ_num;
                }
            } else {
                map.put(d, 1);
            }

        }
        return mode;
    }
    
    //Calculate the standard deviation of the set
    public double get_variance(double[] array){
        double accumulation = 0;
        double mean = get_mean(array);
        for (double d : array){
            accumulation += Math.pow(d - mean, 2);            
        }
        return accumulation/(array.length-1);
    }
    
    public double get_variance(int[] array){
        double accumulation = 0;
        double mean = get_mean(array);
        for (double d : array){
            accumulation += Math.pow(d - mean, 2);            
        }        
        return accumulation/(array.length-1);
    }
    
    public double get_standard_deviation(double[] array){
        return Math.sqrt(get_variance(array));
    }
    
    public double get_standard_deviation(int[] array){
        return Math.sqrt(get_variance(array));
    }
}
