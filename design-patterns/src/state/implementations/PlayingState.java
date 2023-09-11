package state.implementations;

import state.AudioPlayer;
import state.State;

public class PlayingState implements State {
    @Override
    public void pressPlay() {
        System.out.println("Audio is already playing");
    }

    @Override
    public void pressPause() {
        System.out.println("Audio paused.");
        AudioPlayer.setCurrentState(new PausedState());
    }

    @Override
    public void pressStop() {
        System.out.println("Audio stopped.");
        AudioPlayer.setCurrentState(new StoppedState());
    }
}
