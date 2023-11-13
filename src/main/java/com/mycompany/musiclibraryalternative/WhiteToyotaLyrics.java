
package com.mycompany.musiclibraryalternative;

public class WhiteToyotaLyrics {
    public void displayLyrics(){
        String [] songLyrics = {
            "...",
            "...",
            "...",
            "...",
            "...",
            "...",
            "...",
            "...",
            "...",
            "...",
           
        "White Toyota and an iota",
        "Of travel plans we need to fill",
        "I called Mona, her full name's Ramona",
        "To give us all at least a thrill",
        "When I see the sun setting",
        "When our bodies done getting",
        "Tired of all the days",
        "And I think that I need a raise",
        "I've been trying to reach you lately",
        "I've been trying to find you",
        "Have been running in my mind lately",
        "Let's just go on a road trip",
        "Go on a road trip",
        "...",
        "Sun-kissed Lola, stuck in Iowa",
        "Would you wanna to take a ride with us?",
        "Drink Corona while listenin' to My Sharona",
        "I couldn't pay another bill, ooh",
        "When I see the sun setting",
        "When our bodies done getting",
        "Tired of all the days",
        "And I think that I need a raise",
        "I've been trying to reach you lately",
        "I've been trying to find you",
        "Have been running in my mind lately",
        "Let's just get out of here ",
        "......",
        "Let's just get out of here", 
        "...",
        "...",
        "...",
        "...",
        "...",
        "...",
        "...",
        "...",
        "...",
        "I've been trying to reach you lately",
        "I've been trying to find you",
        "Have been running in my mind lately",
        "Let's just get out of here",
        "Let's just go on a road trip"
        };
        
                int characterTime = 99;
                int lineTime = 2000;
                
                lyricsTiming(songLyrics, characterTime, lineTime);
    }
        private void lyricsTiming(String[] songLyrics, int characterTime, int lineTime){
                try{
                    for(String lyrics: songLyrics){
                    System.out.println("\n");
                        for(char character: lyrics.toCharArray()){
                        System.out.print(character);
                        Thread.sleep(characterTime);
                        }
                        Thread.sleep(lineTime);
                        System.out.println();
                    }  
                }catch(Exception e){
                    e.printStackTrace();
                }
    }
        
        
    
    }
