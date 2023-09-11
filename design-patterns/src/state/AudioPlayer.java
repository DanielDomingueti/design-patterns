package state;

import state.implementations.StoppedState;

public class AudioPlayer {
    private static State currentState;

    public AudioPlayer() {
        currentState = new StoppedState();
    }

    public void pressPlay() {
        currentState.pressPlay();
    }

    public void pressPause() {
        currentState.pressPause();
    }

    public void pressStop() {
        currentState.pressStop();
    }

    public static void setCurrentState(State state) {
        currentState = state;
    }
}
