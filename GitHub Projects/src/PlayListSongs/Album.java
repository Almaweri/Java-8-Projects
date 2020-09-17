package PlayListSongs;

import java.util.ArrayList;
import java.util.LinkedList;



public class Album {

	private String name;
	private String artist;
	private ArrayList<Song> listSongs;
	
	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.listSongs = new ArrayList<>();
	}


	// 1- checking for the song if it exist first, so we do not add it in the addSong method
	private Song findSong (String songName) {
				for (Song checkSong : listSongs) {	// for each [][][][][][][][][][][][][][][][][][
					if(checkSong.getTitle().equals(songName)) { 
						return checkSong;
					}

				}
				return null;
			}
	
	public Song findSong (int trackNumber) {
		int index = trackNumber - 1;
		if((index >= 0) && (index < listSongs.size())) {
		//listSongs.add(index);
		}
		return null;
	}
	
	// 2- making sure that the song is not duplicated
	public boolean addSong (String title, double duration) {
		if(findSong(title) == null) { //  checking if the song is not found --> then add the new song
			this.listSongs.add(new Song(title, duration));
			return true;
		} else {
			return false;
		}
	}
	
	// add song by the track number to a playList
	public boolean addToPlayList (int trackNumber, LinkedList<Song> playList) {
		trackNumber = trackNumber -1; // made it = -1 because the Arraylist starts from 0
		if ((trackNumber >= 0) && (trackNumber <= listSongs.size())) {
			playList.add(listSongs.get(trackNumber)); // adding to the linkedList the index of a song from the Arraylist
			return true;
		}
		System.out.println("This album does not have a track" + trackNumber);
		return false;
	}
	
	public boolean addToPlayList (String title, LinkedList<Song> playList) {
		Song checkedSong = findSong(title);
		if(checkedSong != null) {
			playList.add(checkedSong);
			return true;
		} else {
			System.out.println(" The song " + title + " is not in this album ");
			return false;
		}
	}
	
	
	 	
//	private static boolean addNewSong (LinkedList<String> linkedList, String newSong) {
//		ListIterator<String> songsIterator  = linkedList.listIterator();
//		
//		while (songsIterator.hasNext()) {
//		int comparison = songsIterator.next().compareTo(newSong); // .next() is taking you to the first record
//		
//		if (comparison == 0) { // Equal, do not add
//			System.out.println(newSong + " song is already in file");
//			return false;
//		} else if (comparison > 0) {// song should be added
//			songsIterator.previous(); // because the iterator will compare and go to the next one, so we need to go back and add the song first
//			songsIterator.add(newSong);
//			return true;
//		} else if (comparison < 0) {
//			
//		}
//		}
//		songsIterator.add(newSong);
//		return true;
//	}
	
	
	
	
	/*
	 * private boolean createAnAlbum (String albumName, String songName) { if
	 * ListIterator<String> albumsIterator = albums.listIterator();
	 * if(albumsIterator.hasNext())
	 * 
	 * 
	 * }
	 */
	
}
