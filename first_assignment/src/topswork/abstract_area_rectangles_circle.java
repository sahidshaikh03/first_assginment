package topswork;


	abstract class Shape {
	    abstract void RectangleArea(int length, int breadth);
	    abstract void SquareArea(int side);
	    abstract void CircleArea(int radius);
	}

	class Area extends Shape {
	    void RectangleArea(int length, int breadth) {
	        int area = length * breadth;
	        System.out.println("Area of Rectangle: " + area);
	    }

	    void SquareArea(int side) {
	        int area = side * side;
	        System.out.println("Area of Square: " + area);
	    }

	    void CircleArea(int radius) {
	        double area = Math.PI * radius * radius;
	        System.out.println("Area of Circle: " + area);
	    }
	}

	public class abstract_area_rectangles_circle {


	    public static void main(String[] args) {
	        Area a = new Area();
	        a.RectangleArea(5, 10);
	        a.SquareArea(7);
	        a.CircleArea(4);
	    }
	}



