package designpatterns;

public class HeaderBar extends RabbitDecorator {
	
	public HeaderBar(Drawing drawing) {
		super(drawing);
	}
	
	public void printDrawing()
	{
		System.out.println("Printing Header Bar \n");
		super.printDrawing();
		
	}

}
