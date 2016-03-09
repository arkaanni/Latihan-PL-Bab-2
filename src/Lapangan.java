public class Lapangan{
	private static int panjang_lapangan;
	private static int lebar_lapangan;
	
	public static void setPanjang(int panjang){
		panjang_lapangan = panjang;
	}
	public static void setLebar(int lebar){
		lebar_lapangan = lebar;
	}
	public static int getKeliling(){
		return 2*(panjang_lapangan+lebar_lapangan);
	}
}