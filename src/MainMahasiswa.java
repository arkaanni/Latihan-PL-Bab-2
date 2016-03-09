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
	in.nextLine();
        String[] nama = new String[jm];
        long[] nim = new long[jm];
        int[] jumlahputaran = new int[jm], jumlahwaktu = new int[jm];
	System.out.println("input ");
	for(int i=0; i<jm; i++){
            System.out.print("nim              : ");
            nim[i] = in.nextLong();
            in.nextLine();
            System.out.print("nama mahasiswa   : ");
            nama[i] = in.nextLine();
            System.out.print("jumlah putaran   : ");
            jumlahputaran[i] = in.nextInt();
            System.out.print("jumlah waktu     : ");
            jumlahwaktu[i] = in.nextInt();
            in.nextLine();	
	}
	Mahasiswa mhs = new Mahasiswa(nama, nim, jumlahputaran, jumlahwaktu);
        mhs.Jarak();
        mhs.Kecepatan();
        System.out.println("output ");
        mhs.displayData();
    }
}
