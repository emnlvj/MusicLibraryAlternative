package com.mycompany.musiclibraryalternative;

import java.util.*;
import javax.swing.JOptionPane;

public class MusicLibraryAlternative {

    public static void main(String[] args) {
       MusicPlayer mP = new MusicPlayer();
       boolean repeat = true;
       Scanner sc = new Scanner(System.in);
       
       do{
   System.out.println("Press S to start");
   System.out.println("Press X to exit");
   System.out.print("Select an option: ");
   char selectopt = sc.next().charAt(0);
   if(selectopt == 'S' || selectopt == 's'){
      mP.musicPlayerOutput();
   }
   else if(selectopt == 'X' || selectopt == 'x'){
      repeat = false;
   }
   else if(selectopt != 'S' || selectopt != 's' || selectopt != 'X' || selectopt != 'x'){    
               System.out.print("Invalid! Try agian!");
   }
   }while(repeat == true);
   
   if(repeat == false){
   sc.close();
   System.out.println("Thank you for using VMix");
   
   return;
   
   }

        
    }
}
