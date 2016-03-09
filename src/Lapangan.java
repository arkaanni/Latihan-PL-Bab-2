public class Lapangan{
	private static double panjang_lapangan;
	private static double lebar_lapangan;
	
	public void setPanjang(double panjang){
		panjang_lapangan = panjang;
	}
	public void setLebar(double lebar){
		lebar_lapangan = lebar;
	}
	public static double getKeliling(){
		return 2*(panjang_lapangan+lebar_lapangan);
	}
}