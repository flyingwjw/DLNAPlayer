package com.geniusgithub.mediaplayer;

import java.util.HashMap;

public interface ItatisticsEvent {

	void onEvent(String eventID);
	void onEvent(String eventID, HashMap<String, String> map);
}
