package state;

public class StateExecution {

    //use case: when an object might have different behaviors and states and will be changed frequently
    //behavioral design pattern

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.pressPlay();
        audioPlayer.pressPause();
        audioPlayer.pressPlay();
        audioPlayer.pressStop();
    }

}
