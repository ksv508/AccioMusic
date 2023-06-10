import java.util.*;

public class Album {
    private String name;
    private String artist;
    private List<Song> songs;

    public Album(String name,String artist) {
        this.artist = artist;
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public boolean findSong(String title){
        for(Song s: this.songs) {
            if (s.getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }

    public boolean addSong(String title, double duration){
        if(!findSong(title)){
            Song s = new Song(title,duration);
            this.songs.add(s);
            System.out.println("Song has been added");
            return true;
        }
        System.out.println("Song is already present");
        return false;
    }
    public boolean addToPlayListAlbum(String title, LinkedList<Song> myplayList){
        if(findSong(title)){
            for(Song s: this.songs){
                if(s.getTitle().equals(title)){
                    myplayList.add(s);
                    System.out.println("Congrats !! your song has been added to your playList");
                }
            }
        }
        System.out.println("Sorry the song is not present");
        return false;
    }
    public boolean addToPlayListAlbum(int index, LinkedList<Song>myplayList){
        index -= 1;
        if(index >= 0 && index < this.songs.size()){
            myplayList.add(this.songs.get(index));
            System.out.println("Your song has been added to playList");
            return true;
        }
        System.out.println("Invalid Song number !!");
        return false;
    }
}
