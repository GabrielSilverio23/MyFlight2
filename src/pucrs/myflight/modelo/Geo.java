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

	public static double distancia(Geo loc1, Geo loc2){
		double lat1 = loc1.getLatitude();
		double long1 = loc1.getLongitude();
		double lat2 = loc2.getLatitude();
		double long2 = loc2.getLongitude();
		double raioT = 6371;

		double d = 2*raioT*Math.sqrt(Math.asin(Math.pow(Math.sin((Math.toRadians(lat2)-Math.toRadians(lat1))/2),2) +
				Math.pow(Math.sin((Math.toRadians(long2)-Math.toRadians(long1))/2),2)*
						Math.cos(Math.toRadians(lat2))*Math.cos(Math.toRadians(lat1))));
		return d;
	}

	public double distancia(Geo loc1){

		return Geo.distancia(this, loc1);
	}

	@Override
	public String toString() {
		return String.format("%2f %2f",
				latitude,
				longitude);
	}
}
