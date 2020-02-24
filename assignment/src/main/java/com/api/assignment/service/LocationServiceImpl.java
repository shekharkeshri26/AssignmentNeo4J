package com.api.assignment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.assignment.node.Location;
import com.api.assignment.repository.LocationRepository;

/**
 * Location Servive Implementation
 * @author shekhar
 *
 */
@Service
@Transactional
public class LocationServiceImpl implements LocationService {

	@Autowired
	LocationRepository locationRepository;

	/**
	 * Get Location by city name
	 * @param city name
	 * @return Location detail
	 */
	@Override
	public Location getLocationByCity(String city) {
		Optional<Location> optional = locationRepository.getLocationByCity(city);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			throw new RuntimeException();
		}
	}

	/**
	 * add new location
	 * @param Location
	 * @return Location detail
	 */
	@Override
	public Location addLocation(Location location) {
		locationRepository.save(location);
		return location;
	}
}