package state.implementations;

import state.AudioPlayer;
import state.State;

public class StoppedState implements State {
    @Override
    public void pressPlay() {
        System.out.println("Audio played");
        AudioPlayer.setCurrentState(new PlayingState());
    }

    @Override
    public void pressPause() {
        System.out.println("Audio is already stopped. It can't be paused.");
    }

    @Override
    public void pressStop() {
        System.out.println("Audio is already stopped.");
    }
}