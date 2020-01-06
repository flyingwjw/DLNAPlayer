package com.geniusgithub.mediaplayer.dlna.control.base;

import com.geniusgithub.mediaplayer.dlna.control.ControlPointImpl;

public interface IControlOperator {
    int getControlStatus();
    void setControlStauts(int stauts);
    void setControlPoint(ControlPointImpl controlPoint);

}
