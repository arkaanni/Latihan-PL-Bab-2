public class Mahasiswa{
	private int jumlah_mahasiswa;
	private String[] nama_mahasiswa = new String[1000];
	private long[] nim = new long[1000];
	private int[] jumlahPutaran = new int[1000];
	private int[] jumlahWaktu = new int[1000];
    private final int[] jarak = new int[1000];
	private final int[] kecepatan = new int[1000];
	
	public void setJumlahMahasiswa(int jumlahmhs){
		jumlah_mahasiswa = jumlahmhs;
	}
	public void setNama(String[] nama){
        nama_mahasiswa = nama;
	}
	public void setNim(long[] nim){
        this.nim = nim;
	}
	public void setJumlahPutaran(int[] putaran){
        jumlahPutaran = putaran;
	}
	public void setJumlahWaktu(int[] waktu){
        jumlahWaktu = waktu;
	}
	public void Jarak(){
        for(int i=0; i<nim.length; i++){
            jarak[i] = Lapangan.getKeliling()*jumlahPutaran[i];
        }
	}
    public void Kecepatan(){
        for(int i=0; i<nim.length; i++){
			kecepatan[i] = jarak[i]/jumlahWaktu[i];
		}
	}
	public void displayData(){
		for(int i=0; i<nim.length; i++){
			System.out.println("nama            : "+nama_mahasiswa[i]);
            System.out.println("jarak           : "+jarak[i]);
            System.out.println("kecepatan       : "+kecepatan[i]);
		}
	}
		
}