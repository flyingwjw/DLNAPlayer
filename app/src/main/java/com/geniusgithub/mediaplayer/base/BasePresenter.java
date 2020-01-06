package com.geniusgithub.mediaplayer.base;

public interface BasePresenter <T extends BaseView> {
    void bindView(T view);

    void unBindView();
}
