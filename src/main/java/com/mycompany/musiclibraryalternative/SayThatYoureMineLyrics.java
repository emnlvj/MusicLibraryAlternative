
package com.mycompany.musiclibraryalternative;


public class SayThatYoureMineLyrics {
    public void displayLyrics(){
    String [] songLyrics = {
            "...",
            "...",
            "...",
            "...",
            "...",
            "...",
    "I never thought you'd be the one",
    "...",
    "To hold my heart",
     "...",
    "I never knew I'd think of you",
    "...",
    "Each time that we're apart",
    
    "Each Day",
    "...",
    "I'll be the one missing your face",
    
    "And all that you are",
    
    "Save me",
    
    "I promise I'd stay here by your side",
    
    "And I know from the start",
    "...",
    "When I look into your eyes",
     "...",
    "I know that I'm mesmerized",
    
    "Baby",
    "Just hold me",
    "When you're here I realized",
    "I'll be the one to testify",
    "Baby",
    "Say that you're mine tonight",
            "...",
            "...",
            "...",
            "...",
            "...",
            "...",
            "...",
            "...",
            "...",
            
    "Oh every time you come around",
    "...",
    "You keep my troubles far",
    "...",
    "A picture worth a thousand words",
    "I'd stare beneath the stars",
    "Each Day",
    "...",
    "...",
    "I'll be the one missing your face",
    "And all that you are",
    "Save me (Save me)",
    "...",
    "I promise I'd stay here by your side",
    "And I know from the start",
    "When I look into your eyes",
    "I know that I'm mesmerized",
    "Baby",
    "Just hold me",
    "When you're here I realized",
    "I'll be the one to testify",
    "Baby",
    "Say that you're mine tonight",
    "When I look into your eyes",
    "I know that I'm mesmerized",
    "Baby",
    "Just hold me (Hold me)",
    "When you're here I realized",
    "I'll be the one to testify",
    "Baby",
    "Say that you're mine tonight"
    };
                int characterTime = 35;
                int lineTime = 1850;
                
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
