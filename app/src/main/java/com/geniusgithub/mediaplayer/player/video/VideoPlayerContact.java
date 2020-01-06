package com.geniusgithub.mediaplayer.player.video;

import android.view.SurfaceHolder;
import android.widget.SeekBar;

import com.geniusgithub.mediaplayer.base.BasePresenter;
import com.geniusgithub.mediaplayer.base.BaseView;
import com.geniusgithub.mediaplayer.dlna.control.model.MediaItem;

public class VideoPlayerContact {


    public interface IView extends BaseView<IPresenter> {
        void showPlay(boolean bShow);
        void showPrepareLoadView(boolean bShow);
        void showControlView(boolean bShow);
        void showLoadView(boolean bShow);
        void showPlayErrorTip();

        void setSeekbarMax(int max);
        void setSeekbarSecondProgress(int max);
        void setSeekbarProgress(int pos);
        void setSpeed(float speed);
        void setcurTime(int curTime);
        void setTotalTime(int totalTime);

        boolean isControlViewShow();
        SurfaceHolder getSurfaceHolder();
        boolean isSurfaceCreate();
        void updateMediaInfoView(MediaItem mediaInfo);
    }

    public interface IPresenter extends BasePresenter<IView> {
        void onVideoRePlay(SurfaceHolder holder);
        void onVideoPlay();
        void onVideoPause();
        void onVideoStop();
        void onPlayPre();
        void onPlayNext();
        void onSeekStopTrackingTouch(SeekBar seekBar);
    }
}
