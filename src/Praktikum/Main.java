package Praktikum;
/*
 *   @Rymaxxx
 *   Fuck Everyone Else !
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------KEGIATAN1---------");
        ArrayList<String> namaMahasiswa = new ArrayList<>();
        namaMahasiswa.add("lala");
        namaMahasiswa.add("Shani");
        namaMahasiswa.add("Gracia");
        namaMahasiswa.add("Kyla");
        namaMahasiswa.add("Gio");
        System.out.println("\nMembuat Arraylist String : ");
        System.out.println(namaMahasiswa);
        namaMahasiswa.add(0, "Jamal");
        namaMahasiswa.add(3, "Ageng");
        System.out.println("\n1. Menyisipkan Element Baru Pada Index 0 dan 3 : ");
        System.out.println(namaMahasiswa);
        namaMahasiswa.remove(2);
        namaMahasiswa.remove(4);
        System.out.println("\n2. Hapus Element Pada Index 2 dan 4 : ");
        System.out.println(namaMahasiswa);
        System.out.println("\n3. Cari Posisi Lala dan Gracia : ");
        System.out.println(namaMahasiswa.get(1) + "Ada di index ke " + namaMahasiswa.indexOf("Lala"));
        System.out.println(namaMahasiswa.get(3) + "Ada di index ke -" + namaMahasiswa.indexOf("Gracia"));

        System.out.println("---------->>>>>>>>>>>>>>>>>>>O<<<<<<<<<<<<<<<<<----------");

        System.out.println("---------KEGIATAN2---------");
        LinkedList list = new LinkedList();
        System.out.println("List Awal : ");
        list.insert(30);
        list.insert(50);
        list.display();
        System.out.println("Menambahkan 10 , 90 dan 40 beserta shorting dari Terkecil : ");
        list.insert(10);
        list.insert(90);
        list.insert(40);
        list.display();

    }
}
