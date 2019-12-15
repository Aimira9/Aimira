package CarInventory;

import java.util.ArrayList;

import static CarInventory.Song.*;

public class Playlist {

    public static void main(String[] args) {
        
        Song song=new Song();

        ArrayList<Song> playList=new ArrayList<>();

        playList.add(song1);
        playList.add(song2);

        Playlist methods=new Playlist();

        System.out.println(methods.findSong(playList,"Black and White").getTitle());
        System.out.println(methods.addSong(playList,song3));
        System.out.println(methods.removeSong(playList,"KiraS"));
        methods.play(playList);
    }
    public Song findSong(ArrayList <Song> list, String title){
        for(Song s:list){
            if(title.equalsIgnoreCase(s.getTitle())){
                return s;
            }
        }
        return null;
    }
    public boolean addSong(ArrayList<Song>list, Song newSong){
        double totalDuration=0;
        for(int i=0;i<list.size();i++){
            totalDuration+=list.get(i).getDuration();
            if(newSong.getTitle().equals(list.get(i).getTitle()) && list.size()>5 && totalDuration > 20){
                return false;
            }
        }
        list.add(newSong);
        return true;
    }
    public boolean removeSong(ArrayList<Song>list, String title){
        for(int i=0;i<list.size();i++){
            if(title.equalsIgnoreCase(list.get(i).getTitle())){
                list.remove(i);
                return true;
            }
        }
        return false;
    }
    public void play(ArrayList<Song>list){
        for (Song song : list) {
            System.out.println(song.getTitle() + " is playing. Duration is " + song.getDuration());
        }
    }
}
