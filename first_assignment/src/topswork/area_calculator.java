package topswork;

public class area_calculator {
	   public void calculateArea(int length, int breadth) {
	        int area = length * breadth;
	        System.out.println("Area of rectangle: " + area);
	    }
	    
	    // Method to calculate area of a square
	    public void calculateArea(int side) {
	        int area = side * side;
	        System.out.println("Area of square: " + area);
	    }
	    
	    // Main method to test the class
	    public static void main(String[] args) {
	        area_calculator ac = new area_calculator();
	        ac.calculateArea(15, 10); // calls method to calculate area of rectangle
	        ac.calculateArea(9); // calls method to calculate area of square
	    }
}

