import java.util.Scanner;
	
public class MainMahasiswa{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
	    System.out.print("jumlah mahasiswa     : ");
	    int jm = in.nextInt();
	    System.out.print("panjang lapangan (m) : ");
	    Lapangan.setPanjang(in.nextInt());
	    System.out.print("lebar lapangan (m)   : ");
	    Lapangan.setLebar(in.nextInt());
	    in.nextLine();
        String[] nama = new String[jm];
        long[] nim = new long[jm];
        double[] jumlahputaran = new double[jm], jumlahwaktu = new double[jm];
    	System.out.println("\ninput ");
	    for(int i=0; i<jm; i++){
            System.out.print("nim              : ");
            nim[i] = in.nextLong();
            in.nextLine();
            System.out.print("nama mahasiswa   : ");
            nama[i] = in.nextLine();
            System.out.print("jumlah putaran   : ");
            jumlahputaran[i] = in.nextDouble();
            System.out.print("jumlah waktu (m) : ");
            jumlahwaktu[i] = in.nextDouble();
            in.nextLine();	
        }
	    Mahasiswa mhs = new Mahasiswa(nama, nim, jumlahputaran, jumlahwaktu);
        mhs.hitungJarak();
        mhs.hitungWaktuTercepat();
        System.out.println("\noutput ");
        mhs.displayData();
    }
}