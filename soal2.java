/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspert4;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class soal2 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int batasAwal = scanner.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = scanner.nextInt();
        System.out.println("");

        System.out.println("Bilangan prima " + batasAwal + " sd " + batasAkhir + " adalah:");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (prima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Bilangan komposit " + batasAwal + " sd " + batasAkhir + " adalah:");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (!prima(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Fungsi untuk memeriksa apakah sebuah bilangan adalah prima
    public static boolean prima(int bilangan) {
        if (bilangan <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(bilangan); i++) {
            if (bilangan % i == 0) {
                return false;
            }
        }
        return true;
    }
}
