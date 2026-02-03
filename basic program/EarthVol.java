public class EarthVol{
	public static void main(String[] args){
		float rKm = 6378;
		double pi = 3.141;
		
		double volKm = (4.0/3)*pi*rKm*rKm*rKm;
		double rMiles = rKm*0.6213;
		
		double volMiles = (4.0/3)*pi*rMiles*rMiles*rMiles;
		System.out.println("Volume Of Earth in km is " +volKm);
		System.out.println("Volume Of Earth in miles is " +volMiles);
	}
}