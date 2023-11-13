package com.mycompany.musiclibraryalternative;
import java.util.*;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;


public class MusicListAlternative {
    Scanner sc = new Scanner(System.in);
    boolean repeat = true;
    SongLyrics sL = new SongLyrics();
    String lyricsPath;
    public void MusicList(String musicLocation, char choice){
    try{
    File musicFile = new File(musicLocation);
    AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicFile);
    Clip musicClip = AudioSystem.getClip();
    musicClip.open(audioInput);
    if(musicFile.exists() && choice == 'P' || choice == 'p'){
    musicClip.start();
     }
    else{
    System.out.println("File not Found");

    }
    do{
    System.out.println("P = Play || S = Stop || R = Reset || B = Back || V = View Lyrics with Music");
    System.out.print("Choose an option: ");
    choice = sc.next().charAt(0);
    if(choice == 'S' || choice == 's'){
    musicClip.stop();
    repeat = true;
    }
    else if(choice == 'P' || choice == 'p'){
    musicClip.start();
    repeat = true;
    }
    else if(choice == 'R' || choice == 'r'){
    musicClip.setMicrosecondPosition(0);
    repeat = true;
    }
    else if(choice == 'B' || choice == 'b'){
    musicClip.stop();
    repeat = false;
    }
    else if(choice == 'V' || choice == 'v'){
    musicClip.setMicrosecondPosition(0);
    musicClip.start();
    lyricsPath = musicLocation;
    sL.songLyricsList(lyricsPath);
    }
    else if(choice != 'S' || choice != 'R' || choice != 'P' || choice != 'V' || choice != 's' || choice != 'r' || choice != 'p' || choice != 'v'){
        musicClip.stop();
        System.out.println("Invalid Input");
        repeat = true;
    }
    }while(repeat == true);
    }
    catch(IOException | LineUnavailableException | UnsupportedAudioFileException e){
    System.out.print(e);
    }
    }
}
