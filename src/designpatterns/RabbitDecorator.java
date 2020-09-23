package designpatterns;

public class RabbitDecorator implements Drawing {
	
	Drawing drawing;
	
	public RabbitDecorator(Drawing drawing) {
		this.drawing=drawing;
	}

	@Override
	public void printDrawing() {
		this.drawing.printDrawing();
	}
	
	@Override
	public String getName() {
		return this.drawing.getName();
	}
}
