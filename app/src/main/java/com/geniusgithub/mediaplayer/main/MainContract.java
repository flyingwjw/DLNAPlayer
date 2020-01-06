package com.geniusgithub.mediaplayer.main;

import com.geniusgithub.mediaplayer.base.BasePresenter;
import com.geniusgithub.mediaplayer.base.BaseView;


public class MainContract {
    public interface IView extends BaseView<IPresenter> {
        void updateLocalAddress(String value);
        void toggleDrawLayout();
        boolean onBackPressed();
    }

    public interface IPresenter extends BasePresenter<IView> {
        void onStart();
        void onRestart();
        void onStop();
        void onExit();
    }
}
