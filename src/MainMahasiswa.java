import java.util.Scanner;
	
public class MainMahasiswa{
    public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
<<<<<<< HEAD
	System.out.print("jumlah mahasiswa     : ");
	int jm = in.nextInt();
	System.out.print("panjang lapangan (m) : ");
	Lapangan.setPanjang(in.nextInt());
	System.out.print("lebar lapangan (m)   : ");
=======
	System.out.print("jumlah mahasiswa : ");
	int jm = in.nextInt();
	System.out.print("panjang lapangan : ");
	Lapangan.setPanjang(in.nextInt());
	System.out.print("lebar lapangan   : ");
>>>>>>> 8ad04bca624a7c9d5d0246be0e42f95657db7afc
	Lapangan.setLebar(in.nextInt());
	in.nextLine();
        String[] nama = new String[jm];
        long[] nim = new long[jm];
        int[] jumlahputaran = new int[jm], jumlahwaktu = new int[jm];
<<<<<<< HEAD
	System.out.println("\ninput ");
=======
	System.out.println("input ");
>>>>>>> 8ad04bca624a7c9d5d0246be0e42f95657db7afc
	for(int i=0; i<jm; i++){
            System.out.print("nim              : ");
            nim[i] = in.nextLong();
            in.nextLine();
            System.out.print("nama mahasiswa   : ");
            nama[i] = in.nextLine();
            System.out.print("jumlah putaran   : ");
            jumlahputaran[i] = in.nextInt();
<<<<<<< HEAD
            System.out.print("jumlah waktu (m) : ");
=======
            System.out.print("jumlah waktu     : ");
>>>>>>> 8ad04bca624a7c9d5d0246be0e42f95657db7afc
            jumlahwaktu[i] = in.nextInt();
            in.nextLine();	
	}
	Mahasiswa mhs = new Mahasiswa(nama, nim, jumlahputaran, jumlahwaktu);
        mhs.Jarak();
        mhs.Kecepatan();
<<<<<<< HEAD
        System.out.println("\noutput ");
        mhs.displayData();
    }
}
=======
        System.out.println("output ");
        mhs.displayData();
    }
}
>>>>>>> 8ad04bca624a7c9d5d0246be0e42f95657db7afc
