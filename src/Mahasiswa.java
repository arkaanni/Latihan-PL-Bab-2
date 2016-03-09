public class Mahasiswa{
	private int jumlah_mahasiswa;
	private String[] nama_mahasiswa = new String[1000];
	private long[] nim = new long[1000];
	private int[] jumlahPutaran = new int[1000];
	private int[] jumlahWaktu = new int[1000];
        private final int[] jarak = new int[1000];
        private final int[] kecepatan = new int[1000];
	
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
                kecepatan[i] = jarak[i]/jumlahWaktu[i];
            }
        }
        public String waktuTercepat(){
            int cek = jumlahWaktu[0];
            String cek2 = "";
            for(int i=0; i<nim.length; i++){
                if(jumlahWaktu[i]<cek){
                    cek = jumlahWaktu[i];
                    if(jumlahWaktu[i]==cek){
                       cek2 = nama_mahasiswa[i]; 
                    }
                }
            }
            return cek2;
        }
        public String pemenang(){
            int cek = kecepatan[0];
            String cek2 = "";
            for(int i=0; i<nim.length; i++){
                if(kecepatan[i]>cek){
                    cek = kecepatan[i];
                    if(kecepatan[i]==cek){
                        cek2 = nama_mahasiswa[1];
                    }
                }
            }
            return cek2;
        }
	public void displayData(){
            for(int i=0; i<nim.length; i++){
                System.out.println("nama            : "+nama_mahasiswa[i]);
                System.out.println("jarak           : "+jarak[i]);
            }
            System.out.println("waktu tercepat  : "+waktuTercepat());
            System.out.println("pemenang        : "+pemenang());
	}
		
}
