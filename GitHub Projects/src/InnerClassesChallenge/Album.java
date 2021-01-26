package InnerClassesChallenge;

import java.util.ArrayList;
import java.util.LinkedList;



public class Album {

	private String name;
	private String artist;
	private SongList songs;
	
	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.songs = new SongList();
	};



	// 2- making sure that the song is not duplicated
	public boolean addSong (String title, double duration) {
			return this.songs.addSongs(new Song(title, duration));
	}
	
	// add song by the track number to a playList
	public boolean addToPlayList (int trackNumber, LinkedList<Song> playList) {
		Song checkedSong = this.songs.findSong(trackNumber);
		if(checkedSong != null) {
			playList.add(checkedSong);
			return true;
		}
		System.out.println("This album does not have a track" + trackNumber);
		return false;
	}
	
	public boolean addToPlayList (String title, LinkedList<Song> playList) {
		Song checkedSong = songs.findSong(title);
		if(checkedSong != null) {
			playList.add(checkedSong);
			return true;
		} else {
			System.out.println(" The song " + title + " is not in this album ");
			return false;
		}
	}
	
	// InnerClass
	private class SongList {
		
		private ArrayList<Song> songs;
		
		// constructor:
		public SongList() {
			this.songs = new ArrayList<Song>();
		}
		
	private boolean addSongs (Song song) {
		if(songs.contains(song)) {
			return false;
		} else {
			this.songs.add(song);
			return true;
		}
		
		
		
	}
		
	// 1- checking for the song if it exist first, so we do not add it in the addSong method
		private Song findSong (String songName) {
					for (Song checkSong : songs) {	// for each [][][][][][][][][][][][][][][][][][
						if(checkSong.getTitle().equals(songName)) { 
							return checkSong;
						}

					}
					return null;
				}
		
		public Song findSong(int trackNumber) {
			int index = trackNumber -1;
			if((index >= 0) && ( index < songs.size())) {
				return songs.get(index);
			}
			return null;
		}
		
	 }
	
}
