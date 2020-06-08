package adpDP;

public class MP3 implements Advanced{
	   @Override
	   public void playMP3(String fileName) {
	      System.out.println("Playing vlc file. Name: "+ fileName);		
	   }

	   @Override
	   public void playMp4(String fileName) {
	      //do nothing
	   }
	}
//concrete class