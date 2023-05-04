package topswork;

class shape{
	  
		    public void printShape() {
		        System.out.println("This is shape");
		    }
		}

		class Rectangleeo extends shape {
		    public void printShape() {
		        System.out.println("This is rectangular shape");
		    }
		}

		class Circle extends shape {
		    public void printShape() {
		        System.out.println("This is circular shape");
		    }
		}

		class Squareeo extends Rectangleeo {
		    public void printSquare() {
		        System.out.println("Square is a rectangle");
		    }
		
		}
 public class shapede {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Squareeo square = new Squareeo();
	        Rectangleeo  rt=new  Rectangleeo();
	        rt.printShape();
	        Circle cr=new Circle();
	        cr.printShape();
	        square.printShape();
	        square.printSquare();
	}
}

