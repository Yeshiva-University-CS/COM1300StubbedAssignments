package edu.yu.intro;

/** Program description here.
 *
 * @author yourname
 */

public class BasicStatistics {
  
    /* Add a number to the dataset.  
     */
    public void enter(double num) {
    }

    /* Add a set of number to the dataset.  
     */
    public void enter(double[] data) {
    }
  
    /* Return the number of items that have been entered into the dataset.
     */
    public int getNDatums() {
	return -1;
    }

    /** Return the sum of all the numbers that have been entered.
     */
    public double getSum() {
	return -1.0;
    }
  
    /** Return the average of all the items that have been entered.  The return
     * value is Double.NaN if no numbers have been entered.
     */
    public double getMean() {
	return -1.0;
    }

    /** Return the standard deviation of all the items that have been entered.
     * The return value is Double.NaN if no numbers have been entered.
     */
    public double getStandardDeviation() {
	return -1.0;
    }

    /** Return the smallest item that has been entered.  The return value will be
     * infinity if no numbers have been entered.
     */
    public double getMin() {
	return -1.0;
    }

    /** Return the largest item that has been entered.  The return value will be
     * -infinity if no numbers have been entered.
     */
    public double getMax() {
	return -1.0;
    }
  
    /** Step 1: Enter the numbers 22.3, 872.1, 39.8, 47.6
     *
     * Step 2: Invoke all of the "getters" and print the results.
     */
    public static void main (final String[] args) {
    }

}
