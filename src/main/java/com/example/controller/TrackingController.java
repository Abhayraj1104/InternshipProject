package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Tracking;
import com.example.service.TrackingCreateService;
import com.example.service.TrackingDeleteService;
import com.example.service.TrackingFetchAllService;
import com.example.service.TrackingFetchService;
import com.example.service.TrackingUpdateService;

@RestController
@RequestMapping("/tracking")
public class TrackingController {

    @Autowired
    private TrackingCreateService trackingCreateService;

    @Autowired
    private TrackingDeleteService trackingDeleteService;

    @Autowired
    private TrackingUpdateService trackingUpdateService;

    @Autowired
    private TrackingFetchService trackingFetchService;

    @Autowired
    private TrackingFetchAllService trackingFetchAllService;

    @PostMapping("/save")
    public Tracking saveTracking(@RequestBody Tracking tracking) {
        return trackingCreateService.addData(tracking);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTracking(@PathVariable Long id) {
        trackingDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<Tracking> fetchAllTracking() {
        return trackingFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public Tracking fetchTracking(@PathVariable Long id) {
        return trackingFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public Tracking updateTracking(@RequestBody Tracking tracking,
                                   @PathVariable Long id) {
        return trackingUpdateService.updateData(tracking, id);
    }
}
