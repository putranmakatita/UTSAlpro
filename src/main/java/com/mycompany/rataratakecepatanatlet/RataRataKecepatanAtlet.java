/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rataratakecepatanatlet;

import java.util.Scanner;

/**
 *
 * @author Putra Nurhuda Makatita
 */
public class RataRataKecepatanAtlet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahAtlet = 0;

        // Meminta input jumlah atlet dengan penanganan kesalahan
        while (true) {
            try {
                System.out.print("Masukkan jumlah atlet: ");
                jumlahAtlet = Integer.parseInt(scanner.nextLine());
                if (jumlahAtlet <= 0) {
                    System.out.println("Jumlah atlet harus lebih dari 0. Ulangi input.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Masukkan angka yang benar.");
            }
        }

        double totalKecepatan = 0;

        // Meminta input kecepatan masing-masing atlet
        for (int i = 1; i <= jumlahAtlet; i++) {
            while (true) {
                try {
                    System.out.print("Masukkan kecepatan atlet ke-" + i + " (km/jam): ");
                    double kecepatan = Double.parseDouble(scanner.nextLine());
                    if (kecepatan < 0) {
                        System.out.println("Kecepatan tidak boleh negatif. Ulangi input.");
                    } else {
                        totalKecepatan += kecepatan;
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid. Masukkan angka desimal yang benar.");
                }
            }
        }

        // Menghitung rata-rata kecepatan
        double rataRataKecepatan = totalKecepatan / jumlahAtlet;

        // Menampilkan hasil
        System.out.printf("Rata-rata kecepatan lari: %.2f km/jam%n", rataRataKecepatan);

        // Menentukan pesan berdasarkan rata-rata kecepatan
        if (rataRataKecepatan > 20) {
            System.out.println("Tim Atlet Sangat Cepat");
        }
    }
}
