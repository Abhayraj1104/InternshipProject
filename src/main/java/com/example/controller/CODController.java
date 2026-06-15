package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.COD;
import com.example.service.CODCreateService;
import com.example.service.CODDeleteService;
import com.example.service.CODFetchAllService;
import com.example.service.CODFetchService;
import com.example.service.CODUpdateService;

@RestController
@RequestMapping("/cod")
@CrossOrigin("*")
public class CODController {

    @Autowired
    private CODCreateService codCreateService;

    @Autowired
    private CODDeleteService codDeleteService;

    @Autowired
    private CODUpdateService codUpdateService;

    @Autowired
    private CODFetchService codFetchService;

    @Autowired
    private CODFetchAllService codFetchAllService;

    @PostMapping("/save")
    public COD saveCOD(@RequestBody COD cod) {
        return codCreateService.addData(cod);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCOD(@PathVariable Long id) {
        codDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<COD> fetchAllCOD() {
        return codFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public COD fetchCOD(@PathVariable Long id) {
        return codFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public COD updateCOD(@RequestBody COD cod,
                         @PathVariable Long id) {
        return codUpdateService.updateData(cod, id);
    }
}
