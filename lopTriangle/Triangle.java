package lopTriangle;

public class Triangle {
	private Point a, b, c;

	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public boolean valid() {
		float ar = a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY())
				+ c.getX() * (a.getY() - b.getY());
		if (ar == 0)
			return false;
		return true;
	}

	public float getPerimeter() {
		float p = a.tinhKC(b) + b.tinhKC(c) + c.tinhKC(a);
		return (float) (Math.round(p * 1000) / 1000.0);
	}
}
