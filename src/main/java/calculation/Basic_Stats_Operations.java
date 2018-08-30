/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation;

import java.util.HashMap;

/**
 *
 * @author tranh
 */
public final class Basic_Stats_Operations {

    //sample set
    public double[] array;
    
    //calculate mean of a set
    public Basic_Stats_Operations(double[] array) {
        this.array = array;
    }
    
    public Basic_Stats_Operations(int[] array){
        this.array = convert(array);
    }

    public double get_mean() {
        double accumulation = 0;
        for (double d : array) {
            accumulation += d;
        }
        return accumulation / array.length;
    }

    //calculate median of a set
    public double get_median() {
        int n = array.length;
        return n % 2 == 0 ? (array[n / 2] + array[(n / 2 - 1)]) / 2 : array[(int) Math.floor(n / 2)];
    }

    //calculate the mode of a set
    public double get_mode() {
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
    public double get_variance(){
        double accumulation = 0;
        double mean = get_mean();
        for (double d : array){
            accumulation += Math.pow(d - mean, 2);            
        }
        return accumulation/(array.length-1);
    }
    
    public double get_standard_deviation(){
        return Math.sqrt(get_variance());
    }
        
    public double get_std_err(){
        return get_standard_deviation()/Math.sqrt(array.length);
    }    
    
    public double[] get_z_score(){
        double[] temp = new double[array.length];
        int counter = 0;
        for (double d : array){
            temp[counter] = (d - get_mean())/get_standard_deviation();
            counter++;
        }
        return temp;
    }
    
    public double get_z_score(double point){
        return (point - get_mean())/get_standard_deviation();
    }
    
    public double get_z_score(int point){
        return this.get_z_score(point*1.0);
    }
    
    //Convert set of integers to equivalent floats
    private double[] convert(int[] array){
        double[] temp = new double[array.length];
        int counter = 0;
        for (int i : array){
            temp[counter] = i*1.0;
            counter++;
        }
        return temp;
    }
            
}
