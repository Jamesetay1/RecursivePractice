package recursivePractice;

public class Chk1pt2 {

	public static void main(String[] args)
	  {
	 
	  }
	public static int getPyramidCount(int height){
		int count =0;
		int n = height;
		if (height == 1){
			return count=1;
		}
		else{
			count = (n*n) + getPyramidCount(n-1);
			return count;
		}
		
	}
}
//Each level in the pyramid is a square, so if there are n 
//levels, the bottom level has n * n balls, and the total number of balls is just
//
//(n * n) + (number of balls in a pyramid of height n - 1).
//
//There is just one ball in a pyramid of height 1. Write a 
//static recursive method getPyramidCount that takes a 
//single int argument representing the number of levels 
//in a pyramid, and returns the total number of balls.