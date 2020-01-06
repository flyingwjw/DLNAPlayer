package com.geniusgithub.mediaplayer.player.photo;

import com.geniusgithub.mediaplayer.base.BasePresenter;
import com.geniusgithub.mediaplayer.base.BaseView;
import com.geniusgithub.mediaplayer.dlna.control.model.MediaItem;

import java.util.List;

public class PhotoBrowseContact {
    public interface IView extends BaseView<IPresenter> {
        void onPlayNext();
        void initBrowseData(List<MediaItem> data, int curIndex);
    }

    public interface IPresenter extends BasePresenter<IView> {

    }
}
