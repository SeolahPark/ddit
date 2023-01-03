package homework.work07.shape;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];

		// 다형성 연습. (Shape)가 생략되어있음.
		shapes[0] = (Shape) new Circle(1.0);
		shapes[1] = new Triangle(2.0);
		shapes[2] = new Rectangle(2.0, 3.0);

		// 배열 or 프레임워크가 들어오는 자리. shapes에서 하나씩 빼와서 shape에 넣어 출력
		// 단점 : 내가 몇번째 출력중인지 모름
		for (Shape shape : shapes) {
			System.out.println(shape);
		}

	}
}