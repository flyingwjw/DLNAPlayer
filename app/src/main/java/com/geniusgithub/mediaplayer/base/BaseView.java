package com.geniusgithub.mediaplayer.base;

import android.view.View;

public interface BaseView  <T extends BasePresenter>{
    void bindPresenter(T presenter);
    void setupView(View rootView);
}
