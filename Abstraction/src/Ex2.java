abstract class Shape{
	abstract void Draw();
}
class Rectangle extends Shape{
	void Draw(){
		System.out.println("rectangle");
	}
	
}
class Circle extends Shape{
	void Draw() {
		System.out.println("circle");
	}
}
public class Ex2 {

	public static void main(String[] args) {
	Circle c=new Circle();

	c.Draw();

	}

}
