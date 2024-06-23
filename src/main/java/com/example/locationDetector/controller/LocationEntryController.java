package com.example.locationDetector.controller;

import com.example.locationDetector.entity.LocationEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/location")
public class LocationEntryController {

    private Map<Long, LocationEntry> locationEntryMap = new HashMap<>();

    @GetMapping
    public List<LocationEntry> getLocationEntries() {
        return new ArrayList<>(locationEntryMap.values());
    }

    @PostMapping
    public void createLocationEntry(@RequestBody LocationEntry locationEntry) {
        locationEntryMap.put(locationEntry.getId(), locationEntry);

    }

}
