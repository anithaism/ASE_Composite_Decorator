package designpatterns;

public class Client {
	
	public static void main(String args[]) {
		
		Drawing outer = new SolidBorder(new HeaderBar(new RabbitDrawing("BigPictureBox")));
				
	    BigPictureBox Bigpicturebox = new BigPictureBox("");
		
		Drawing RabbitTextBox_decor2=new HeaderBar(new SolidBorder(new RabbitDrawing("RabbitTextBox")));
		
		Drawing RabbitPictureBox_decor1=new HeaderBar(new SolidBorder(new RabbitDrawing("RabbitPictureBox")));

		Drawing EmptyBox_decor3=new HeaderBar(new SolidBorder(new RabbitDrawing("EmptyTextBox")));		
		
		Bigpicturebox.addDrawing(outer);
		Bigpicturebox.addDrawing(RabbitTextBox_decor2);
		Bigpicturebox.addDrawing(RabbitPictureBox_decor1);
		Bigpicturebox.addDrawing(EmptyBox_decor3);
		
		Bigpicturebox.printDrawing();
		
		
		
	}

}
