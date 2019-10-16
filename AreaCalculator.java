package classANDoop;
import java.util.*;

public class AreaCalculator {
	 public int calculateRectangle(int length , int height ){
	      if (length<0){
	      throw new IllegalArgumentException ("Length should be a positive number");
	      }
	      if (height<0){
	         throw new IllegalArgumentException("Height should be a positive number");
	      }
	      int area = length*height;
	      return area;
	   }
}
