package com.example.inkrhyme.controller;

import com.example.inkrhyme.model.CPoems;
import com.example.inkrhyme.service.CService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/poems")
@CrossOrigin("*")
public class CPoemsController {
    @Autowired
    CService cService;

    @GetMapping("")
    private List<CPoems> readPoems(){
        return cService.readPoems();

    }
    @GetMapping("/{id}")
    private Optional<CPoems> readPoemsId(@PathVariable("id") Long id){
        return cService.readPoemsId(id);

    }

    @PostMapping("")
    private void createPoems(@RequestBody CPoems poems){
        cService.createPoems(poems);

    }

    @PutMapping("/{id}")
    private void updatePoems(@RequestBody CPoems poems,@PathVariable("id")Long id){
        cService.updatePoems(poems,id);

    }


    @DeleteMapping("/{id}")
    private void deletePoems(@PathVariable("id")Long id){
        cService.deletePoems(id);


    }



}


