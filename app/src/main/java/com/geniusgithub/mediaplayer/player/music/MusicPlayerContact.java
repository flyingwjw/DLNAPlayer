package com.geniusgithub.mediaplayer.player.music;

import android.widget.SeekBar;

import com.geniusgithub.mediaplayer.base.BasePresenter;
import com.geniusgithub.mediaplayer.base.BaseView;
import com.geniusgithub.mediaplayer.dlna.control.model.MediaItem;
import com.geniusgithub.mediaplayer.player.base.PlayMode;

import java.util.List;

public class MusicPlayerContact {

    public interface IView extends BaseView<IPresenter> {
        void updatePlayList(List<MediaItem> list);
        void showPrepareLoadView(boolean bShow);
        void showLRCView(boolean bShow);
        void showPlay(boolean bShow);
        void showPlayErrorTip();

        void setSeekbarProgress(int pos);
        void setSeekbarSecondProgress(int max);
        void setSeekbarMax(int max);
        void setTotalTime(int totalTime);
        void setcurTime(int curTime);
        void setSpeed(float speed);


        void refreshLyrc(int pos);
        void updateLyricView(MediaItem itemInfo);
        void updateMediaInfoView(MediaItem itemInfo, int pos);
        void startRotateAnimation(boolean rotate);
        void updatePlayMode(PlayMode playMode);
    }

    public interface IPresenter extends BasePresenter<IView> {
        void onMusicPlay();
        void onMusicPause();
        void onPlayPre();
        void onPlayNext();
        void onToggleMode();
        void onSeekStopTrackingTouch(SeekBar seekBar);
        void onPlayItemClick(MediaItem data, int position);
    }
}
