package com.linkedlist;

import java.util.ArrayList;

public class Album {
	private ArrayList<Song> songsList;
	private String albumName;

	public Album(String albumName) {
		this.songsList = new ArrayList<Song>();
		this.albumName = albumName;
	}

	public String getAlbumName() {
		return albumName;
	}

	public ArrayList<Song> getSongsList() {
		return songsList;
	}
	
	public void addSong(Song song){
		if(!findSong(song)){
			songsList.add(song);
		}else{
			System.out.println(song.getTitle() + " song already exists");
		}
		
	}

	private boolean findSong(Song sng) {
		for (Song song : songsList) {
			if(song.getTitle().equalsIgnoreCase(sng.getTitle())){
				return true;
			}
		}
		return false;
	}

	public void showSongs(){
		System.out.println(albumName);
		if(!songsList.isEmpty()){
			for (Song song : songsList) {
				System.out.println("\t" +song.getTitle() + " Duration -> " + song.getDuration());
			}
		}else{
			System.out.println("There are no songs added in this album " + albumName);
		}
		
	}
}
