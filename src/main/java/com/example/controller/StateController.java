package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.State;
import com.example.service.StateCreateService;
import com.example.service.StateDeleteService;
import com.example.service.StateFetchAllService;
import com.example.service.StateFetchService;
import com.example.service.StateUpdateService;

@RestController
@RequestMapping("/state")
public class StateController {

    @Autowired
    private StateCreateService stateCreateService;

    @Autowired
    private StateDeleteService stateDeleteService;

    @Autowired
    private StateUpdateService stateUpdateService;

    @Autowired
    private StateFetchService stateFetchService;

    @Autowired
    private StateFetchAllService stateFetchAllService;

    @PostMapping("/save")
    public State saveState(@RequestBody State state) {
        return stateCreateService.addData(state);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteState(@PathVariable Long id) {
        stateDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<State> fetchAllState() {
        return stateFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public State fetchState(@PathVariable Long id) {
        return stateFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public State updateState(@RequestBody State state,
                             @PathVariable Long id) {
        return stateUpdateService.updateData(state, id);
    }
}