package com.geniusgithub.mediaplayer.browse;

import com.geniusgithub.mediaplayer.base.BasePresenter;
import com.geniusgithub.mediaplayer.base.BaseView;
import com.geniusgithub.mediaplayer.dlna.control.model.MediaItem;

import org.cybergarage.upnp.Device;

import java.util.List;

public class BrowseContract {
    public interface IView extends BaseView<IPresenter> {
        void showProgress(boolean bShow);
        void showDeviceList(boolean bShow);
        void showItemList(boolean bShow);
        void showDeviceDetail(Device device);
        void updateDeviceList(List<Device> devices);
        void updateItemList(List<MediaItem> contentItem);
        void updateToolTitle(String title);
    }

    public interface IPresenter extends BasePresenter<IView> {
        void enterDevice(Device device);
        void browseItem(int index, MediaItem item);
        void cancelTask();
    }
}
