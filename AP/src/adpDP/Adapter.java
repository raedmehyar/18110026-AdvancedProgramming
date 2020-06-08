package adpDP;

public class Adapter implements Typical {

	   Advanced advancedMusicPlayer;

	   public Adapter(String audioType){
	   
	      if(audioType.equalsIgnoreCase("vlc") ){
	         advancedMusicPlayer = new MP3();			
	         
	      }else if (audioType.equalsIgnoreCase("mp4")){
	         advancedMusicPlayer = new MP4();
	      }	
	   }

	   @Override
	   public void play(String audioType, String fileName) {
	   
	      if(audioType.equalsIgnoreCase("vlc")){
	         advancedMusicPlayer.playMP3(fileName);
	      }
	      else if(audioType.equalsIgnoreCase("mp4")){
	         advancedMusicPlayer.playMp4(fileName);
	      }
	   }
	}
//adapter