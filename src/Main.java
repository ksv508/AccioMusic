import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Album album1 = new Album("KGF","Armaan Malik");
        Album album2 = new Album("Doorie", "Atif Aslam");
        album1.addSong("Butta Bomma", 4.5);
        album1.addSong("Srivalli",5.6);
        album2.addSong("kuch is Tarh", 5.6);
        album2.addSong("hii ye song", 5.4);
        album2.addSong("jhdf",7.5);

        //Find Song
        if(album1.findSong("abc"))
            System.out.println("abc is Present");
        else System.out.println("abc is Not present");
        if(album1.findSong("Srivalli"))
            System.out.println("Srivalli is Present");
        else System.out.println("Srivalli is Not present");

        // Add song by index
        LinkedList<Song> myPlayList = new LinkedList<>();
        album1.addToPlayListAlbum(1,myPlayList);
        album1.addToPlayListAlbum(2,myPlayList);
        album2.addToPlayListAlbum(1,myPlayList);
        album2.addToPlayListAlbum(65,myPlayList);
        play(myPlayList);
    }
    public static void play(LinkedList<Song>playList){
        ListIterator<Song> itr = playList.listIterator();
        // if list is empty
        if(!itr.hasNext()){
            System.out.println("Your playList is Empty");
        }
        System.out.println("Now Playing ");
        System.out.println((itr.next()));
        printMenu();
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while(true){
            System.out.println("Please enter your option");
            int opt = sc.nextInt();
            switch (opt){
                case 1:
                    if(itr.hasNext()){
                        System.out.println("Now Playing");
                        System.out.println(itr.next());
                    }
                    else{
                        System.out.println("You have reached to end of the playList");
                    }
                    break;
                case 2:
                    if(itr.hasPrevious()){
                        System.out.println("Now Playing");
                        System.out.println(itr.previous());
                    }
                    else{
                        System.out.println("You have reached to starting of the playList");
                    }
                    break;
                case 3:
                    System.out.println("Now Playing");
                    break;
                case 4:
                    printSong(playList);
                    break;
                case 5:

                    break;
                case 6:
                    printMenu();
                    break;
                case 7:
                    exit(0);
            }
        }
    }
    public static void printMenu(){
        System.out.println("1. Play next Song");
        System.out.println("2. Play previous Song");
        System.out.println("3. Repeat current song");
        System.out.println("4. Show all songs in playList");
        System.out.println("5. delete the current song");
        System.out.println("6. Show the menu again");
        System.out.println("7. Exit");
    }
    public static void printSong(LinkedList<Song>playList){
        for(Song s : playList){
            System.out.println(s);
        }
        return;
    }
}