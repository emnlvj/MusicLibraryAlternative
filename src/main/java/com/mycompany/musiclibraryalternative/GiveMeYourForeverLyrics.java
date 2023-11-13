
package com.mycompany.musiclibraryalternative;

public class GiveMeYourForeverLyrics {
    public void displayLyrics(){
    String [] songLyrics = {
        "(...........)",
        "(...)",
        "(...)",
        "(...)",
        "(...)",
        "(...)",
        "(...)",
        "(...)",
        "(...)",
        "(...)",
    "Do you remember",
    "When we were young",
    "You were always with your friends",
    "Wanted to grab your hand", 
    "And run away from them",
    "I knew that it was time to tell you",
    "How I feel",
    "So I made a move", 
    "I took your hand",
    
    "My heart was beating loud", 
    "Like I've never felt before",
    "You were smiling at me",
    "Like you wanted more",
    "I think you're the one", 
    "I've never seen before",
    "(...)",
    
    "I want you to know",
    "I love you the most",
    "I'll always be there right by your side",
    "(...)",
    "'Cause baby, you're always in my mind",
    "(...)",
    "Just give me your forever",
    "(Give me your forever)",
    "I want you to know",
    "That you'll be the one",
    "And I'll be the guy who'll be on his knees",
    "(...)",
    "(...)",
    "To say I love you",
    "And I need you",
    "And say I'd die for you ",
    "(just give me your forever)",
    "I never knew",
    "It would be possible",
    "For you to be with me",
    "'Cause you loved someone else back in '73",
    "I was so jealous seeing you with him",
    "(...)",
    "(...)",
    "(...)",
    "(...)",
    "Oh baby",
    "I know",
    "That I can treat you better back",
    "In those nights",
    "Oh, you wouldn't cry from his stupid lies",
    "Oh baby, I was there watching wishing you to be mine",
    "(...)",
    "(...)",
    "I want you to know",
    "I love you the most",
    "I'll always be there right by your side",
    "(...)",
    "'Cause baby, you're always in my mind",
    "(...)",
    "Just give me your forever (give me your forever)",
    "(...)",
    "I want you to know",
    "That you'll be the one",
    "And I'll be the guy who'll be on his knees",
    "(...)",
    "(...)",
    "To say I love you",
    "And I need you",
    "And say I'd die for you (just give me your forever)",
    "(...)",
    "(...)",
    "Do you remember",
    "I was on the aisle",
    "Waiting for you, babe",
    "Saw you in your gown",
    "I was crying all my tears",
    "I told myself that you are the one",
    "(You are the one)",
    "I want you to know",
    "I love you the most",
    "I'll always be there right by your side",
    "'Cause baby, you're always in my mind",
    "(You're always in mind)",
    "Just give me your forever (just give me your forever)",
    "I want you to know",
    "That you'll be the one",
    "And I'll be the guy who'll be on his knees",
    "To say I love you (just give me your forever)",
    "And I need you",
    "And say I'd die for you (just give me your forever)",
    "Just give me your forever",
    "Just give me your forever"
    };
                int characterTime = 50 ;
                int lineTime = 1080;
                
                lyricsTiming(songLyrics, characterTime, lineTime);
    }
    private void lyricsTiming(String[] songLyrics, int characterTime, int lineTime){
                try{
                    for(String lyrics: songLyrics){
                    System.out.print("\n");
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
