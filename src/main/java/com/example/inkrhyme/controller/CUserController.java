package com.example.inkrhyme.controller;

import com.example.inkrhyme.model.CPoems;
import com.example.inkrhyme.repositories.IPoems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/vi/poems")
@CrossOrigin("*")
public class CUserController {
    @Autowired
    private IPoems iPoems;

    @GetMapping
    public List<CPoems> getPoems (Model model){
        return iPoems.findAll();
    }
    @GetMapping("/{id}")
    public CPoems getPoemBy(@PathVariable int id) {
        return iPoems.findById(id).orElseThrow(RuntimeException::new);
    }

    @PostMapping("/save")
    public ResponseEntity<CPoems> save(@RequestBody CPoems poems)throws URISyntaxException{
        CPoems savedPoem = iPoems.save(poems);
        return ResponseEntity.created(new URI("/clients/" + savedPoem.getId())).body(savedPoem);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<CPoems> update(@PathVariable int id, @RequestBody CPoems poem){
        CPoems currentPoem = iPoems.findById(id).orElseThrow(RuntimeException::new);
        currentPoem.setTitle(poem.getTitle());
        currentPoem.setGenre(poem.getGenre());
        currentPoem.setAuthor(poem.getAuthor());
        currentPoem.setPoem(poem.getPoem());
        currentPoem.setUrl(poem.getUrl());
        currentPoem = iPoems.save(poem);
        return ResponseEntity.ok(currentPoem);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int id){
         iPoems.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
