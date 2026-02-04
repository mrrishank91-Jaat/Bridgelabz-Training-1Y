public class TriangleArea{
	public static void main(String[] args){
			float baseCm = 15;
			float heightCm = 10;
			
			double areaCm = 0.5*baseCm*heightCm;
			
			double baseIn = baseCm/2.54;
			double heightIn = heightCm/2.54;
			
			double areaIn = 0.5*baseIn*heightIn;
			
			System.out.println("The area of the triangle in sq in is" + areaIn + " and sq cm is" + areaCm);
	}
}