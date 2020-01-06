package com.geniusgithub.mediaplayer.dlna.control.rendercontrol;

import org.cybergarage.upnp.Device;

public interface IRemotePlayback {

    boolean play(Device device, String path);

    boolean play(Device device);

    boolean pause(Device device);

    boolean stop(Device device);

    boolean getProgress(Device device);

    boolean getDuration(Device device);

    boolean getTransportState(Device device);

    boolean seekTo(Device device, int progress);

    void registerCallback(Callback callback);

    void unregisterCallback();

    interface Callback{
        void onRePlayComplete(boolean isSuccess);
        void onPlayComplete(boolean isSuccess);
        void onPauseComplete(boolean isSuccess);
        void onStopComplete(boolean isSuccess);
        void onGetProgressComplete(boolean isSuccess, int progress);
        void onGetDurationComplete(boolean isSuccess, int duration);
        void onGetTransportComplete(boolean isSuccess, int state);
        void onSeekComplete(boolean isSuccess);
    }


}
