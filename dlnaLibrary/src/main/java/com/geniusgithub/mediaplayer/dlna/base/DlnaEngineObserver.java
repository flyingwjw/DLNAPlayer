package com.geniusgithub.mediaplayer.dlna.base;

public interface DlnaEngineObserver {
    void initEngine();
    boolean startEngine();
    boolean stopEngine();
    boolean restartEngine();

}
