package designpatterns;

public class SolidBorder extends RabbitDecorator {
	
	public SolidBorder(Drawing drawing) {
		super(drawing);
	}
	
	public void printDrawing()
	{
		System.out.println("Printing Solid Border \n");
		super.printDrawing();
		
	}

}
