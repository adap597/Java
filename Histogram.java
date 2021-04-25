/* A program tht takes an integner "n" and two integers "left and right" and uses
StdDraw to plot a histogram of the count of the numbers that fall in each of the n intervals
defined by dividing (left,right) into n equal-sized intervals*/

import java.util.Arrays;
import java.StdDraw
import java.StdIn

//open class
public class Histogram {

    public static void main(String[] args) {//open main

        // read input values
        int N = StdIn.readInt();
        int left = StdIn.readInt();
        int right = StdIn.readInt();

        // make array of double values through standard input 
		//every item in the array is between left and right
        double[] samples = make_samples(left, right);


        /* make a array intervals[] include N entry. Intervals[i] is the ith interval between (l, r)
        every time value indicate number of intervals that fall in this interval*/
        int[] intervals = fillSamplesInIntervals(samples, N, left, right);

        // draw histogram
        draw_histogram(intervals, samples);
    }

    public static double[] make_samples(int left, int right) {//create double array make_samples
        String allstr = "";
        while(!StdIn.isEmpty()) {
            String str = StdIn.readString();//read string 
            double n = Double.parseDouble(str);
            if (n >= left && n <= right) {
                allstr = allstr + str + " ";
            }
        }

        String[] str_array = allstr.split(" ");//split string
        int len = str_array.length;

        double[] double_array = new double[len];

        for (int i = 0; i < len; i++) {
            double_array[i] = Double.parseDouble(str_array[i]);
        }

        return double_array;
    }

    public static int[] fillSamplesInIntervals(double[] samples, int N, double left, double right) {
        int[] result = new int[N];
        int p;

        for (int i = 0; i < samples.length; i++) {
            p = findIntervalIndex(samples[i], N, left, right);
            result[p] += 1;
        }

        return result;
    }

    public static int findIntervalIndex(double sample, int N, double left, double right) {

        int k = 0;
        double avg = (right - left) / N;

        for (int i = 0; i < N; i++) {
            if (sample >= avg * i && sample < avg * (i + 1)) {
                k = i;
                break;
            }
        }

        // edge condition
        if (sample == right) {
            k = N - 1;
        }

        return k;
    }

    public static void draw_histogram(int[] intervals, double[] samples) {

        StdDraw.setPenRadius(.006);//display histogram using standard draw
        StdDraw.line(0, 0, 1, 0);
        StdDraw.line(0, 0, 0, 1);

        int n = intervals.length;
        int total = samples.length;
        double interval_width = 1.0 / n;
        double x, y;
        double halfWidth = interval_width / 2;

        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.setPenRadius();
        for (int i = 0; i < n; i++) {
            x = i * interval_width + halfWidth;
            y = (double)intervals[i] / total / 2;
            StdDraw.rectangle(x, y, halfWidth, y);
        }

    }//close main
	
}//close class
