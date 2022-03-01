package com.example.HelloWorld03.chapter1;

import java.util.Scanner;

public class ConditionalDemo {
    public static class Mahasiswa {
        String name;
        String campus;
        String class_;
        String course;
        int score;
        char grade;
    }
    public static void main(String[] args) {
        var mahasiswa = new ConditionalDemo.Mahasiswa();
        var input = new Scanner(System.in);

        System.out.println("Masukan nama");
        mahasiswa.name = input.nextLine();

        System.out.println("Masukan kampus");
        mahasiswa.campus = input.nextLine();

        System.out.println("Masukan kelas");
        mahasiswa.class_ = input.nextLine();

        System.out.println("Masukan matkul");
        mahasiswa.course = input.nextLine();

        System.out.println("Masukan nilai");
        mahasiswa.score = Integer.parseInt(input.nextLine());

        if (mahasiswa.score < 60) {
            mahasiswa.grade = 'D';
        } else if (mahasiswa.score < 75) {
            mahasiswa.grade = 'C';
        } else if (mahasiswa.score == 75) {
            mahasiswa.grade = 'B';
        } else {
            mahasiswa.grade = 'A';
        }

        System.out.println("Nama : " + mahasiswa.name);
        System.out.println("Kampus : " + mahasiswa.campus);
        System.out.println("Kelas : " + mahasiswa.class_);
        System.out.println("Matkul : " + mahasiswa.course + " dengan grade " + mahasiswa.score);
    }
}
