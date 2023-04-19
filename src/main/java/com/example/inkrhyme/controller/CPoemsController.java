package com.example.inkrhyme.controller;

import com.example.inkrhyme.model.CPoems;
import com.example.inkrhyme.service.CService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
   public List<CPoems> readPoems(){
        return cService.readPoems();

    }
    @GetMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
   public Optional<CPoems> readPoemsId(@PathVariable("id") Long id){
        return cService.readPoemsId(id);

    }

    @PostMapping("")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public void createPoems(@RequestBody CPoems poems){
        cService.createPoems(poems);

    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void updatePoems(@RequestBody CPoems poems,@PathVariable("id")Long id){
        cService.updatePoems(poems,id);

    }


    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deletePoems(@PathVariable("id")Long id){
        cService.deletePoems(id);


    }



}


