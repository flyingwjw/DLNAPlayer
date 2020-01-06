package org.cybergarage.upnp;


/**
 * @author Stefano "Kismet" Lenzi - kismet-sl@users.sourceforge.net  <br> 
 * 		Copyright (c) 2005
 *
 */
public interface RootDescription {

	String ROOT_ELEMENT = "root";
	String ROOT_ELEMENT_NAMESPACE = "urn:schemas-upnp-org:device-1-0";
		
	
	String SPECVERSION_ELEMENT = "specVersion";
	String MAJOR_ELEMENT = "major";
	String MINOR_ELEMENT = "minor";
	String SERVICE_LIST_ELEMENT = "serviceList";
}
