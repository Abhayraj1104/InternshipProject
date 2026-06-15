package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Owner;
import com.example.service.OwnerCreateService;
import com.example.service.OwnerDeleteService;
import com.example.service.OwnerFetchAllService;
import com.example.service.OwnerFetchService;
import com.example.service.OwnerUpdateService;

@RestController
@RequestMapping("/owner")
@CrossOrigin("*")
public class OwnerController {

    @Autowired
    private OwnerCreateService ownerCreateService;

    @Autowired
    private OwnerDeleteService ownerDeleteService;

    @Autowired
    private OwnerUpdateService ownerUpdateService;

    @Autowired
    private OwnerFetchService ownerFetchService;

    @Autowired
    private OwnerFetchAllService ownerFetchAllService;

    @PostMapping("/save")
    public Owner saveOwner(@RequestBody Owner owner) {
        return ownerCreateService.addData(owner);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOwner(@PathVariable Long id) {
        ownerDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<Owner> fetchAllOwner() {
        return ownerFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public Owner fetchOwner(@PathVariable Long id) {
        return ownerFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public Owner updateOwner(@RequestBody Owner owner,
                             @PathVariable Long id) {

        return ownerUpdateService.updateData(owner, id);
    }
}