package studio7;

public class Rectangle {
	public static void main(String args[]) {
		Rectangle r = new Rectangle(3,4);
		Rectangle r2 = new Rectangle(5,7);
		r.comparison(r2);
		System.out.println(r.comparison(r2));
		
	}
	
	double height;
	double width;
	
	public Rectangle(double h,double w) {
		this.height = h;
		this.width = w;
	}
	boolean comparison(Rectangle r2) {
		double r2Area = r2.height * r2.width;
		double rArea = this.height * this.width;
		if(rArea > r2Area) {
			return true;
		}
		else {
			return false;
		}
	}
}
