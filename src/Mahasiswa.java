public class Mahasiswa{
    private int jumlah_mahasiswa;       
    private String[] nama_mahasiswa = new String[1000];
    private long[] nim = new long[1000];
    private double[] jumlahPutaran = new double[1000];
    private double[] jumlahWaktu = new double[1000];
    private double[] jarak = new double[1000];
	/*private double[] kecepatan = new double[1000];*/
    private double[] waktuTercepat = new double[1000];
    private double cekWaktu;
    
    public Mahasiswa(String[] nama, long[] nim, double[] putaran, double[] waktu){
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
	/*public void kecepatan(){
		for(int i=0; i<nim.length; i++){
            kecepatan[i] = jarak[i]/jumlahWaktu[i];
        }
	}*/
    public void waktuTercepat(){
        for(int i=0; i<nim.length; i++){
            waktuTercepat[i] = jumlahWaktu[i]/jumlahPutaran[i];
        }
    }
    public String pemenang(){
        cekWaktu = waktuTercepat[0];
		String cek = "";
        for(int i=0; i<nim.length; i++){
            if(waktuTercepat[i]<cekWaktu){
                cekWaktu = waktuTercepat[i];
                if(waktuTercepat[i]==cekWaktu){
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
        System.out.println("pemenang         : "+pemenang()+" "+cekWaktu+" menit/putaran");
    }
	
}
