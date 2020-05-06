package Day2;

public class Rectangle {
	private static int length;
	private static int breadth;
	private static int perimeter;

	public static int getBreadth() {
		return breadth;
	}

	public static void setBreadth(int breadth) {
		Rectangle.breadth = breadth;
	}

	public static int getLength() {
		return length;
	}

	public static void setLength(int length) {
		Rectangle.length = length;
	}

	public int calculatePerimeter(int l,int b) {
		perimeter = 2 * (l + b);
		return (perimeter);
	}
}
