package state.implementations;

import state.AudioPlayer;
import state.State;

public class PausedState implements State {
    @Override
    public void pressPlay() {
        System.out.println("Audio played");
        AudioPlayer.setCurrentState(new PlayingState());
    }

    @Override
    public void pressPause() {
        System.out.println("Audio is already paused");
    }

    @Override
    public void pressStop() {
        System.out.println("Audio stopped");
        AudioPlayer.setCurrentState(new StoppedState());
    }
}
