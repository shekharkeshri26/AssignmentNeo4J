package com.api.assignment.service;

import com.api.assignment.node.Location;

/**
 * Location Servive Interface
 * @author shekhar
 *
 */
public interface LocationService {

	/**
	 * Get Location by city name
	 * @param city name
	 * @return Location detail
	 */
	Location getLocationByCity(String city);

	/**
	 * add new location
	 * @param Location
	 * @return Location detail
	 */
	Location addLocation(Location location);

}
