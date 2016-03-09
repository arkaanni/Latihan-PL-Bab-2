import java.util.Scanner;
	
public class MainMahasiswa{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("jumlah mahasiswa : ");
		int jm = in.nextInt();
		System.out.print("panjang lapangan : ");
		Lapangan.setPanjang(in.nextInt());
		System.out.print("lebar lapangan   : ");
		Lapangan.setLebar(in.nextInt());
		Mahasiswa[] mhs = new Mahasiswa[jm];
		in.nextLine();
		System.out.println("input ");
		for(int i=0; i<jm; i++){
			mhs[i] = new Mahasiswa();
			System.out.print("nim              : ");
			mhs[i].setNim(in.nextLong());
			in.nextLine();
			System.out.print("nama mahasiswa   : ");
			mhs[i].setNama(in.nextLine());
			System.out.print("jumlah putaran   : ");
			mhs[i].setJumlahPutaran(in.nextInt());
			System.out.print("jumlah waktu     : ");
			mhs[i].setJumlahWaktu(in.nextInt());
			in.nextLine();
			mhs[i].displayData();
		}
	}
}