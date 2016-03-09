public class Mahasiswa{
	private int jumlah_mahasiswa;
	private String[] nama_mahasiswa = new String[1000];
	private long[] nim = new long[1000];
	private int[] jumlahPutaran = new int[1000];
	private int[] jumlahWaktu = new int[1000];
    private final int[] jarak = new int[1000];
    private final int[] kecepatan = new int[1000];
	private int cekWaktu;
	private int cekKecepatan;
	
	public Mahasiswa(String[] nama, long[] nim, int[] putaran, int[] waktu){
        nama_mahasiswa = nama;
        this.nim = nim;
        jumlahPutaran = putaran;
		jumlahWaktu = waktu;
	}
	public void Jarak(){
		for(int i=0; i<nim.length; i++){
			jarak[i] = Lapangan.getKeliling()*jumlahPutaran[i];
		}
	}
	public void Kecepatan(){
		for(int i=0; i<nim.length; i++){
                kecepatan[i] = jarak[i]/(jumlahWaktu[i]*60);
			}
	}
	public String waktuTercepat(){
		cekWaktu = jumlahWaktu[0];
		String cek = "";
        for(int i=0; i<nim.length; i++){
			if(jumlahWaktu[i]<cekWaktu){
				cekWaktu = jumlahWaktu[i];
                if(jumlahWaktu[i]==cekWaktu){
					cek = nama_mahasiswa[i]; 
				}
            }
		}
		return cek;
	}
	public String pemenang(){
		cekKecepatan = kecepatan[0];
        String cek = "";
        for(int i=0; i<nim.length; i++){
			if(kecepatan[i]>cekKecepatan){
                cekKecepatan = kecepatan[i];
                if(kecepatan[i]==cekKecepatan){
					cek = nama_mahasiswa[i];
                }
            }
        }
        return cek;
    }
	public void displayData(){
        for(int i=0; i<nim.length; i++){
			System.out.println("nama             : "+nama_mahasiswa[i]);
            System.out.println("jarak            : "+jarak[i]+" m");
        }
        System.out.println("waktu tercepat   : "+waktuTercepat()+" "+cekWaktu+" menit");
		System.out.println("pemenang         : "+pemenang()+" "+cekKecepatan+" m/s");
	}
	
}