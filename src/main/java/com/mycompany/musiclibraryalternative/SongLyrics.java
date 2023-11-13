
package com.mycompany.musiclibraryalternative;


public class SongLyrics {
    SayThatYoureMineLyrics sTYML = new SayThatYoureMineLyrics();
    GiveMeYourForeverLyrics gMYFL = new GiveMeYourForeverLyrics();
    WhiteToyotaLyrics wTL = new WhiteToyotaLyrics();
    boolean repeat = true;
    public void songLyricsList(String songLocation){
   do{
    if( null != songLocation)switch (songLocation) {
            case "Valentine - Say That You're Mine.wav":
                sTYML.displayLyrics();
                repeat = false;
                break;
            case "SunKissed Lola - White Toyota.wav":
                wTL.displayLyrics();
                repeat = false;
                break;
            case "Zack Tabudlo - Give Me Your Forever.wav":
                gMYFL.displayLyrics();
                repeat = false;
                break;
            default:
                break;
        }
   }while(repeat == true);
    }
}
