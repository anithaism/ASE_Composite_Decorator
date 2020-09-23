package designpatterns;

public class RabbitDrawing implements Drawing {
String name;

public RabbitDrawing(String name) {
	this.name=name;
}

@Override
public void printDrawing() {
	System.out.println("Print drawing here for : " +this.name +"\n");
}

@Override
public String getName() {
	return this.name;
}

}
