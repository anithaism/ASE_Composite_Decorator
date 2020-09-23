package designpatterns;

import java.util.ArrayList;

public class BigPictureBox implements Drawing{
	String name;
	ArrayList <Drawing> drawinglist=new ArrayList<Drawing>();
	
	public BigPictureBox(String name) {
		this.name=name;
	}

	@Override
	public void printDrawing() {
		for(int i=0;i<drawinglist.size();i++) {
			drawinglist.get(i).printDrawing();
		}
	}
	
	public void addDrawing(Drawing drawing) {
		drawinglist.add(drawing);
	}
	
	public String getName() {
		return this.name;
	}
}
