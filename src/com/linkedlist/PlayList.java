package com.linkedlist;

import java.util.ArrayList;

public class PlayList {
	
	private String playListName;
	private ArrayList<Album> albumsList;
	public PlayList(String playListName) {
		this.playListName = playListName;
		this.albumsList= new ArrayList<Album>();
	}
	
	public String getPlayListName() {
		return playListName;
	}

	public ArrayList<Album> getAlbumsList() {
		return albumsList;
	}

	public void addAlbum(String albumName){
		int index=findAlbum(albumName);
		if(index>=0){
			System.out.println(albumName + "-> Album already exists");
		}else{
			albumsList.add(new Album(albumName));
			System.out.println("Album :" +albumName + " added successfully!");
		}
		
	}
	
	public Album getAlbum(String albumName){
		int index=findAlbum(albumName);
		if(index>=0){
			return albumsList.get(index);
		}else{
			return null;
		}
	}
	private int findAlbum(String albumName){
		for (Album album : albumsList) {
			if(album.getAlbumName().equalsIgnoreCase(albumName)){
				//System.out.println(albumName + " found!");
				return albumsList.indexOf(album);
			}
		}
		System.out.println(albumName + " not found!");
		return -1;
	}
	
	public void showAlbums(){
		System.out.println("Album Names");
		for (Album album : albumsList) {
			 System.out.println("\t" + album.getAlbumName());
		}
	}
}
