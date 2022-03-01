package com.example.HelloWorld03.chapter1;

import java.util.Scanner;

public class ScannerDemo {

    public static class Mahasiswa {
        String name;
        String hobby;
        int age;
        int semester;
        int height;
    }
    public static void main(String[] args) {
        var mahasiswa = new Mahasiswa();
        var input = new Scanner(System.in);

        System.out.println("Masukan nama");
        mahasiswa.name = input.nextLine();

        System.out.println("Masukan hobi");
        mahasiswa.hobby = input.nextLine();

        System.out.println("Masukan umur");
        mahasiswa.age = Integer.parseInt(input.nextLine());

        System.out.println("Masukan semester");
        mahasiswa.semester = Integer.parseInt(input.nextLine());

        System.out.println("Masukan tinggi");
        mahasiswa.height = Integer.parseInt(input.nextLine());

        System.out.println("Nama = " + mahasiswa.name + "\n" +
                "Hobi = " + mahasiswa.hobby + "\n" +
                "Umur = " + mahasiswa.age + "\n" +
                "Semester = " + mahasiswa.semester + "\n" +
                "Tinggi = " + mahasiswa.height
        );
    }
}
