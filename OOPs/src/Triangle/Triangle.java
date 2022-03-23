package Triangle;

public class Triangle {
	int side1;
	int side2;
	int side3;
	int angle1;
	int angle2;
	int angle3;
	
	void trianglePerimeter()
	{
		int area=side1*side2*side3;
		System.out.println("Perimeter="+area);
	}
	void triangleArea()
	{
		float p=((side1*side2*side3)/2);
		double a= Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		System.out.println("Area="+a);
	}
	

}
