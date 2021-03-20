package Session2_FacadePattern;

public class FacadePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeMaker sm = new ShapeMaker();
		
		sm.drawCircle();
		sm.drawRectangle();
		sm.drawSquare();
	}

}
