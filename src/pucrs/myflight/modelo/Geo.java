package pucrs.myflight.modelo;

public class Geo {
	private double latitude;
	private double longitude;

	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	/*public static double distancia(Geo loc1, Geo loc2){
		double lat1 = loc1.getLatitude();
		double long1 = loc1.getLongitude();
		double lat2 = loc2.getLatitude();
		double long2 = loc2.getLongitude();

		double d = 2*6371 *
				Math.asin((Math.pow(Math.exp(Math.sin((Math.toRadians(lat1) - Math.toRadians(lat2))/2)) , 2))
						+(Math.pow(Math.exp(Math.sin((Math.toRadians(long1) - Math.toRadians(long2))/2)) , 2))
						*Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)));
		return d;
	}

	public double distanciaX(Geo loc1){
		double lat1 = loc1.getLatitude();
		double long1 = loc1.getLongitude();
		return distancia(loc1,);
	}*/
	@Override
	public String toString() {
		return String.format("%2f %2f",
				latitude,
				longitude);
	}
}
