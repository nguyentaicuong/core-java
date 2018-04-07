package datetime;

import java.time.LocalTime;

public class bai14 {
	 public static void main(String[] args)
	    {
	        LocalTime time = LocalTime.now();
	        System.out.println();
	        // in hour, minutes, seconds, nano seconds
	        System.out.println("Local time now : " + time);
	        System.out.println();
	    }
}
