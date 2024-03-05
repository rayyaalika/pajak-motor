import java.util.Scanner;

public class PajakMotor{
    private static int pilihan;

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        //Menentukan jenis motor
        System.out.println("\nApakah motor anda baru?\n");
        System.out.println("1. Iya");
        System.out.println("2. Tidak");

        System.out.print("\nMasukkan pilihan anda : ");
        int baruBekas = in.nextInt();
        switch(baruBekas){
            case 1:
            Baru();break;
            case 2:
            Bekas();break;
        }
        in.close();
    }

    //Jika motor bekas
    private static void Bekas() {
        Scanner inp = new Scanner (System.in);
        int swdkllj = 35000, biayaAdminTNKB = 100000, penerbitanSTNK = 50000, biayaAdmin = 50000, pengeSTNK = 25000;

        do{System.out.println("\nPILIHAN MENU\n");
           System.out.println("1. Pajak Tahun Pertama");
           System.out.println("2. Pajak Tahunan");
           System.out.println("3. Pajak Lima Tahunan");
           
                      System.out.print("\nMasukkan pilihan anda : ");
           int pilihan = inp.nextInt(); 
        
        System.out.print("Masukkan nilai jual kendaraan bermotor anda : ");
        Double njkb = inp.nextDouble();
        Double pkb = njkb * 0.02;
        

        switch (pilihan) {
            case 1:
            double bbnkb = njkb*0.01;
            double pajakTH1 = (bbnkb + pkb + swdkllj + biayaAdmin + penerbitanSTNK + biayaAdminTNKB);
            System.out.println("TOTAL PAJAK YANG HARUS DIBAYAR : Rp." + pajakTH1);break;
            case 2:
            double pajakTH2 = (pkb + swdkllj + biayaAdmin);
            System.out.println("TOTAL PAJAK YANG HARUS DIBAYAR : Rp." + pajakTH2);break;
            case 3:
            double pajak_th2 = (pkb + swdkllj + biayaAdmin);
            double pajakLimaTH = (pajak_th2 + biayaAdmin + penerbitanSTNK + pengeSTNK + biayaAdminTNKB);
            System.out.println("TOTAL PAJAK YANG HARUS DIBAYAR : Rp." + pajakLimaTH);break;
            default:
            System.out.println("SILAHKAN BELI MOTOR TERLEBIH DAHULU!!!");
            }
        } while (pilihan == 3);
        inp.close();
    }
    
    //Jika motor baru
    private static void Baru() {
        Scanner inp = new Scanner (System.in);
        int swdkllj = 35000, biayaAdminTNKB = 100000, penerbitanSTNK = 50000, biayaAdmin = 50000, pengeSTNK = 25000;

        do{System.out.println("\nPILIHAN MENU\n");
           System.out.println("1. Pajak Tahun Pertama");
           System.out.println("2. Pajak Tahunan");
           System.out.println("3. Pajak Lima Tahunan");
           
                      System.out.print("\nMasukkan pilihan anda : ");
           int pilihan = inp.nextInt(); 
        
        System.out.print("Masukkan nilai jual kendaraan bermotor anda : ");
        Double njkb = inp.nextDouble();
        Double pkb = njkb * 0.02;
        

        switch (pilihan) {
            case 1:
            double bbnkb = njkb*0.1;
            double pajakTH1 = (bbnkb + pkb + swdkllj + biayaAdmin + penerbitanSTNK + biayaAdminTNKB);
            System.out.println("TOTAL PAJAK YANG HARUS DIBAYAR : Rp." + pajakTH1);break;
            case 2:
            double pajakTH2 = (pkb + swdkllj + biayaAdmin);
            System.out.println("TOTAL PAJAK YANG HARUS DIBAYAR : Rp." + pajakTH2);break;
            case 3:
            double pajak_th2 = (pkb + swdkllj + biayaAdmin);
            double pajakLimaTH = (pajak_th2 + biayaAdmin + penerbitanSTNK + pengeSTNK + biayaAdminTNKB);
            System.out.println("TOTAL PAJAK YANG HARUS DIBAYAR : Rp." + pajakLimaTH);break;
            default:
            System.out.println("SILAHKAN BELI MOTOR TERLEBIH DAHULU!!!");
            }
        } while (pilihan == 3);
        inp.close();
    } 
}