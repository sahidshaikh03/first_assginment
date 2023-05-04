package topswork;

public class number_char {
	  public void print(int n, char c) {
	        System.out.println(n + "  " + c);
	    }
	    
	    public void print(char c, int n) {
	        System.out.println(c + "  " + n);
	    }
	    


public static void main(String[] args) {
	number_char p = new number_char();
	p.print(10, 'A'); // prints "10 A"
	p.print('B', 20); // prints "B 20"

}
}



