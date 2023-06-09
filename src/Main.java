import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.ListIterator;

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
        if(album1.findSong("KGF"))
            System.out.println("KGF is Present");
        else System.out.println("KGF is Not present");
        // Add song by index
        LinkedList<Song> myPlayList = new LinkedList<>();


        play(myPlayList);
    }
    public static void play(LinkedList<Song>playList){
        ListIterator<Song> itr = playList.listIterator();
        // if list is empty
        if(!itr.hasNext()){
            System.out.println("Your playList is Empty");
        }
        System.out.println("NOw Playing ");
        System.out.println((itr.next()));
    }
}