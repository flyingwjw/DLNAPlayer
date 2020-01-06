package com.geniusgithub.mediaplayer.player.base;

public interface PlayStateCallback {
    void onTrackPlay();
    void onTrackStop();
    void onTrackPause();
    void onTrackPrepareSync();
    void onTrackPrepareComplete();
    void onTrackStreamError();
//    public void onTrackPlayComplete();
}
