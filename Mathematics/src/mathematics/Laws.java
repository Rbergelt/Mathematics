package mathematics;
//This uses the law of cosines to find an angle or a side of a non-right triangle 
// and also the law of sines to find an angle or side of a non-right triangle
public class Laws {
	public static double Angle(double side1,double side2,double side3)
	{
		double angle3 = (Math.pow(side3, 2)-(Math.pow(side2, 2) + Math.pow(side1, 2)))/ (-2 * side2 *side1);
		angle3 = Math.acos(angle3);
		angle3 = Math.toDegrees(angle3);
	return angle3;	
	}
	public static double Side(double side1, double side2, double angle1)
	{
		angle1 = Math.toRadians(angle1);
		double side3 = Math.pow(side1,2)+Math.pow(side2,2) - 2*side1*side2*(Math.cos(angle1));
		side3 = Math.sqrt(side3);
		return side3;
	}
	public static double SineAngle(double side1, double side2, double angle1)
	{
		//converts to Radians then finds the sin of the angle in radians
		double angle2 = Math.sin(Math.toRadians(angle1));
		angle2 = (angle2 /side1)*side2;
		//Inverse sine
		angle2 = Math.asin(angle2);
		//Conversion to Degrees from radians
		angle2 = Math.toDegrees(angle2);
		return angle2;
	}
	public static double SineSide(double side1,double angle1,double angle2)
	{
		double side2;
		side2 = side1/Math.sin(Math.toRadians(angle1)) * Math.sin(Math.toRadians(angle2));
		return side2;
	}
}