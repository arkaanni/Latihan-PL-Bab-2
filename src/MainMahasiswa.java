import java.util.Scanner;
	
public class MainMahasiswa{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Mahasiswa mahasiswa1 = new Mahasiswa();
		System.out.print("jumlah mahasiswa : ");
		mahasiswa1.setJumlahMahasiswa(in.nextInt());
		in.nextLine();
		System.out.print("nama mahasiswa   : ");
		mahasiswa1.setNama(in.nextLine());
	}
}