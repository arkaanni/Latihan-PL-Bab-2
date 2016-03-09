public class Mahasiswa{
	private int jumlah_mahasiswa;
	private String nama_mahasiswa;
	private long nim;
	private int jumlahPutaran;
	private int jumlahWaktu;
	
	public void setJumlahMahasiswa(int jumlahmhs){
		jumlah_mahasiswa = jumlahmhs;
	}
	public void setNama(String nama){
		nama_mahasiswa = nama;
	}
	public void setNim(Long nim){
		this.nim = nim;
	}
	public void setJumlahPutaran(int putaran){
		jumlahPutaran = putaran;
	}
	public void setJumlahWaktu(int waktu){
		jumlahWaktu = waktu;
	}
	public double getJarak(){
		return Lapangan.getKeliling()*jumlahPutaran;
	}
}