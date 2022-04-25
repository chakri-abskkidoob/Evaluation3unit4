package com.evaluation3;
import java.util.Scanner;

public class Song {
	String movieName;
	String songName;
	
	void play() {
		System.out.println(songName+" of "+movieName+" is playing...!");
	}
	public static void main(String[] args) {
		Song s1 = new Song();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Movie Name");
		String movieName = sc.next();
		System.out.println("Enter Song Name");
		String songName = sc.next();
		s1.setMovieName(movieName);
		s1.setSongName(songName);
		s1.play();
		Song s2 = new Song();
		System.out.println("Enter Movie Name");
		String movieName1 = sc.next();
		System.out.println("Enter Song Name");
		String songName1 = sc.next();
		s2.setMovieName(movieName1);
		s2.setSongName(songName1);
		s2.play();
		Song s3 = new Song();
		System.out.println("Enter Movie Name");
		String movieName2 = sc.next();
		System.out.println("Enter Song Name");
		String songName2 = sc.next();
		s3.setMovieName(movieName2);
		s3.setSongName(songName2);
		s3.play();
		Song s4 = new Song();
		System.out.println("Enter Movie Name");
		String movieName4 = sc.next();
		System.out.println("Enter Song Name");
		String songName4 = sc.next();
		s4.setMovieName(movieName4);
		s4.setSongName(songName4);
		s4.play();
		sc.close();
		
		
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
}
