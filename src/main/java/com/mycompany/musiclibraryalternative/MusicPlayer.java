package com.mycompany.musiclibraryalternative;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MusicPlayer {
    public void musicPlayerOutput() {
        Scanner sc = new Scanner(System.in);
        MusicListAlternative mL = new MusicListAlternative();
        
        char choice = '\0';
        boolean repeat = true; 
        do{
        System.out.println("1.Say That You're Mine - Valentine");                                                  
        System.out.println("2.White Toyota - Sunkissed Lola");
        System.out.println("3.Give Me Your Forever - Zack Tabudlo");
        System.out.println("Press 0 to Exit");
        System.out.print("Choose a song: ");
            if(!sc.hasNextInt() ){    
                while(!sc.hasNextInt()){
               System.out.print("Invalid! Try agian.\nChoose a song: ");
               sc.nextLine();
                }
         }
            int choosesong = sc.nextInt();
        switch(choosesong){
            case 1:
                boolean loop = true;
                do{
                System.out.println("Song :Say That You're Mine - Valentine"); 
                System.out.println("P = Play || X = Back");
                System.out.print("Choose an option: ");
                choice = sc.next().charAt(0);
                if(choice == 'X'){
                loop = false;
                }
                else if(choice == 'P'){
                System.out.println("Song: Valentine - Say That You're Mine.wav");
                System.out.println("Currently Playing...");
                String musicPathOne = "Valentine - Say That You're Mine.wav";
                mL.MusicList(musicPathOne, choice);
                }
                else if(choice != 'X' || choice != 'P' || choice != 'x' || choice != 'p'){
                System.out.println("Invalid!Please try again");
                }
                }while(loop == true);
                
                
                break;
            case 2:
                loop = true;
                do{
                System.out.println("Song: White Toyota - Sunkissed Lola");
                System.out.println("P = Play ||  X = Back");
                System.out.print("Choose an option: ");
                choice = sc.next().charAt(0);
                if(choice == 'X'){
                loop = false;
                }
                 else if(choice == 'P'){
                System.out.println("Song: SunKissed Lola - White Toyota.wav");
                System.out.println("Currently Playing...");
                String musicPathTwo = "SunKissed Lola - White Toyota.wav";
                mL.MusicList(musicPathTwo, choice);
                }
                else if(choice != 'X' || choice != 'P' || choice != 'x' || choice != 'p'){
                System.out.println("Invalid!Please try again");
                }
                }while(loop == true);
                
                break;
                
            case 3:
                loop = true;
                do{
                System.out.println("Song: Give Me Your Forever - Zack Tabudlo");
                System.out.println("P = Play || X = Back");
                System.out.print("Choose an option: ");
                choice = sc.next().charAt(0);
                if(choice == 'X'){
                loop = false;
                }
                else if(choice == 'P'){
                System.out.println("Song: Zack Tabudlo - Give Me Your Forever.wav");
                System.out.println("Currently Playing...");
                String musicPathThree = "Zack Tabudlo - Give Me Your Forever.wav";
                mL.MusicList(musicPathThree, choice);
                 }
                else if(choice != 'X' || choice != 'P' || choice != 'x' || choice != 'p'){
                    System.out.println("Invalid!Please try again");
                }
                }while(loop == true);
                
                break;
            case 0:
                return;
            
            default:
                System.out.println("Not in the selection!");
        }
        }while(repeat == true);
        }
}
