package adpDP;

public class MP4 implements Advanced {

	@Override
	public void playMP3(String fileName) {
		// do nothing
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: " + fileName);

	}
}
//concrete  class