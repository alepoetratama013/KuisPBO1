/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapbo7;
import java.util.Scanner;
public class Main {
    public static Scanner in;
    

    public static void main(String[] args) {
        in = new Scanner (system.in);
        int menu;
        int umur;
        double konten,visual,designthink;
        double struktur,relev,problem;
        String nama;
        
        System.out.println(" +---------------------------------+ ");
        System.out.println(" | Pendaftaran Beasiswa PT. Benang |");
        System.out.println(" +---------------------------------+ ");
        System.out.println(" Terdapat 2 program beasiswa yang dibuka;  ");
        System.out.println(" 1. Beasiswa Pelajar             ");
        System.out.println(" 2. Beasiswa Mahasiswa           ");
        System.out.print("Pilih beasiswa yang didaftar : ");
        menu = in.nextInt();
        
        if (menu == 1) {
            System.out.println(" Form Pendaftaran ");
            System.out.print("Nama Lengkap   : ");
            nama = in.next();
            
            System.out.print("Umur   : ");
            umur = in.nextint();
            do {
                System.out.println("  Form Penilaian  ");
                System.out.println("Keterangan: Nilai yang valid berada diantara 0 - 100");
                System.out.print("Nilai Struktur dan Konten Esai   : ");
                konten = in.nextDouble();
                System.out.print("Nilai Teknik Visualisasi         : ");
                visual = in.nextDouble();
                System.out.print("Nilai Kemampuan Design Thinking   : ");
                designthink = in.nextDouble();
            } while (konten > 100 || konten < 0 || visual > 100 || visual < 0 || designthink < 0 || designthink > 100);
            do {
      
                System.out.println("+++ Menu +++");
                System.out.println(" 1. Tampil Hasil ");
                System.out.println(" 2. Ubah Nilai   ");
                System.out.println(" 3. Keluar   ");
                System.out.print("Pilih : ");
                menu = in.nextInt();
                if (menu == 1) {
                    double hasil;
                    beasiswapelajar pa;
                    pa = new beasiswapelajar (konten,visual,designthink);
                    hasil = pa.hasil();
                    System.out.println("Nilai Akhir : " + hasil);
                    if (hasil < 87.5) {
                        System.out.println("Keterangan : Tidak DITERIMA");
                        System.out.println("mohon maaf " + nama + umur + "tahun" + "dinyatakan tidak diterima pada program BEASISWA PELAJAR karena belum mencapai nilai yang diharapkan pada tahap seleksi");
                    }
                    else if (hasil >= 87.5) {
                        System.out.println("Keterangan : DITERIMA");
                        System.out.println("Selamat" + nama + umur + "tahun" + " dinyatakan diterima pada pada program BEASISWA PELAJAR karena berhasil mencapai nilai yang diharapkan pada tahap seleksi ");
                    }
                }
                else if (menu == 2) {
                    do {
                        System.out.println("  Form Penilaian  ");
                        System.out.println("Keterangan: Nilai yang valid berada diantara 0 - 100");
                        System.out.print("Nilai Struktur dan Konten Esai   : ");
                        konten = in.nextDouble();
                        System.out.print("Nilai Teknik Visualisasi        : ");
                        visual = in.nextDouble();
                        System.out.print("Nilai Kemampuan Design Thinking   : ");
                        designthink = in.nextDouble();
                  
                    } while (konten > 100 || konten < 0 || visual > 100 || visual < 0 || designthink > 100 || designthink < 0 );
                }
            } while (menu != 3);
            
        }
        
        else if (menu == 2) {
            System.out.println(" Form Pendaftaran ");
            System.out.print("Masukan Nama   : ");
            nama = in.next();
            System.out.print("Asal Sekolah   : ");
            umur = in.nextint();
            
            do {
                System.out.println("  Form Penilaian  ");
                System.out.println("Keterangan: Nilai yang valid berada diantara 0 - 100");
                System.out.print("Nilai Struktur dan Konten Jurnal : ");
                struktur = in.nextDouble();
                System.out.print("Nilai Relevansi Data             : ");
                relev = in.nextDouble();
                System.out.print("Nilai Kemampuan Problem Solving  : ");
                problem = in.nextDouble();
            
            } while (struktur > 100 || struktur < 0 || relev > 100 || relev < 0 ||  problem > 100 || problem <0 );
            
             do {
              
                System.out.println("   Menu   ");
                System.out.println(" 1. Tampil ");
                System.out.println(" 2. Edit   ");
                System.out.println(" 3. Exit   ");
                System.out.print("Pilih : ");
                menu = in.nextInt();
                if (menu == 1) {
                    double hasil;
                    beasiswamahasiswa ps;
                    ps = new beasiswamahasiswa (struktur,relev,problem);
                    hasil = ps.hasil();
                    System.out.println("Nilai Akhir : " + hasil);
                    if (hasil < 87.5) {
                        System.out.println("Keterangan : TIDAK DITERIMA");
                        System.out.println("mohon maaf" + nama + umur + "tahun" + "dinyatakan tidak diterima pada program BEASISWA MAHASISWA karena belum mencapai nilai yang diharapkan pada tahap seleksi");
                    }
                    else if (hasil >= 87.5) {
                        System.out.println("Keterangan : BERHASIL");
                        System.out.println("Selamat " + nama + umur + "tahun" + "dinyatakan diterima pada program BEASISWA BEASISWA karena sudah mencapai nilai yang diharapkan pada tahap seleksi");
                    }
                }
                else if (menu == 2) {
                    do {
                        System.out.println("|  Form Penilaian  |");
                        System.out.println("Ket: Nilai dari 1-100");
                        System.out.print("Nilai Struktur                : ");
                        struktur = in.nextDouble();
                        System.out.print("Nilai Isi                     : ");
                        relev = in.nextDouble();
                        System.out.print("Nilai Kreativitas             : ");
                        problem = in.nextDouble();
                      
                    } while (struktur > 100 || struktur < 0 || relev > 100 || relev < 0 ||  problem > 100 || problem <0);
                 }
             }while (menu != 3);
        }
    }
}