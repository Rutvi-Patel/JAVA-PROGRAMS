
public class SodaCan {
	public double height;
	public double radius;

	public double setHeight(double height) {
		this.height = height;
		return height;
	}

	public double setRadius(double radius) {
		this.radius = radius;
		return radius;
	}

	public void getSurfaceArea() {
		double surfaceArea = 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
		System.out.println(surfaceArea);
	}

	public void getVolume() {
		double Volume = Math.PI * Math.pow(radius, 2) * height;
		System.out.println(Volume);
	}

}