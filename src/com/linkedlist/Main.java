package com.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static LinkedList<PlayList> playLinkedList;

	public static void main(String[] args) {
		boolean quit = false;
		playLinkedList = new LinkedList<PlayList>();
		playLinkedList.add(new PlayList("BollywoodSongs"));
		playLinkedList.add(new PlayList("TollywoodSongs"));

		addToPlayList("BollywoodSongs", "Ra.One", new Song("Chammak Challo", 3));
		addToPlayList("BollywoodSongs", "Ra.One", new Song("Criminal", 5));

		addToPlayList("TollywoodSongs", "Jalsa", new Song("Gallo Thelina", 4.51));
		addToPlayList("TollywoodSongs", "Jalsa", new Song("MyHeart", 4.58));

		ListIterator<PlayList> i = playLinkedList.listIterator();
		while (i.hasNext()) {
			System.out.println(i.next().getAlbumsList());
		}
		showMenu();
		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			switch (action) {
			case 0:
				quit = true;
				System.out.println("Exiting the music system!");
				break;
			case 1:
				showMenu();
				break;
			case 2:
				showPlayList();
				break;
			case 3:
				playSongs();
				break;
			case 4:
				showAlbums();
				break;
			default:
				break;
			}
		}

	}

	private static void showMenu() {
		System.out.println("Choose \n" + "0 - quit the menu \n" + "1 - Show the menu \n" + "2 - Show playlist \n"
				+ "3 - Play Songs \n" + "4 - show Albums \n");
	}

	private static void showAlbums() {
		ListIterator<PlayList> iterator = (ListIterator<PlayList>) playLinkedList.iterator();
		PlayList playList;
		while (iterator.hasNext()) {
			iterator.next().showAlbums();
		}
	}

	private static void showPlayList() {
		System.out.println("PlayLists :");
		for (PlayList playList : playLinkedList) {
			System.out.println("\t" + playList.getPlayListName());
		}
	}

	private static void playSongs() {

		ListIterator<PlayList> iterator = (ListIterator<PlayList>) playLinkedList.iterator();
		PlayList playList;
		while (iterator.hasNext()) {
			playList = iterator.next();
			System.out.println("Playing Songs from :" + playList.getPlayListName());
			ArrayList<Album> albums = playList.getAlbumsList();
			for (Album album : albums) {
				album.showSongs();
			}
		}
	}

	private static int findPlayList(String playListName) {
		ListIterator<PlayList> iterator = (ListIterator<PlayList>) playLinkedList.iterator();
		PlayList playList;
		while (iterator.hasNext()) {
			playList = iterator.next();
			int comparison = playList.getPlayListName().compareTo(playListName);
			if (comparison == 0) {
				return iterator.nextIndex() - 1;
			}
		}
		System.out.println(playListName + " not found!");
		return -1;
	}

	private static int findAlbum(String albumName) {
		ArrayList<Album> albumList = playLinkedList.get(0).getAlbumsList();
		for (Album album : albumList) {
			if (album.getAlbumName().equalsIgnoreCase(albumName)) {
				return albumList.indexOf(album);
			}
		}
		System.out.println("Album " + albumName + " not found");
		return -1;
	}

	private static void addToPlayList(String playListName, String albumName, Song s) {
		int index = findPlayList(playListName);
		playLinkedList.get(index).addAlbum(albumName);
		playLinkedList.get(index).getAlbum(albumName).addSong(s);

	}
}
