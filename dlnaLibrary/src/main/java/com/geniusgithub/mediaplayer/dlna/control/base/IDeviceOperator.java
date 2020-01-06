package com.geniusgithub.mediaplayer.dlna.control.base;

import org.cybergarage.upnp.Device;

import java.util.List;

public interface IDeviceOperator {

	void  addDevice(Device d);
	void removeDevice(Device d);
	void clearDevice();
	
	interface IDMSDeviceOperator{
		List<Device> getDMSDeviceList();
		Device getDMSSelectedDevice();
		void setDMSSelectedDevice(Device selectedDevice);

	}

	interface IDMRDeviceOperator{
		List<Device> getDMRDeviceList();
		Device getDMRSelectedDevice1();
		void setDMRSelectedDevice(Device selectedDevice);
	}
	
}
