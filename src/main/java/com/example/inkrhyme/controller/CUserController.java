package com.example.inkrhyme.controller;

import com.example.inkrhyme.model.CPoems;
import com.example.inkrhyme.repositories.IPoems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/")

public class CUserController {
    @Autowired
    private IPoems iPoems;

    @GetMapping("/")
    public List list (Model model){
        return iPoems.findAll();
    }
    @GetMapping ("/form")
    public CPoems add(Model model){
        return new CPoems();

    }
    @GetMapping("/save")
    public CPoems save(CPoems poems, Model model){
        return iPoems.save(poems);
    }

    @DeleteMapping("/update/{id}")
    public void update(@PathVariable("id") int id, Model model){
        iPoems.deleteById(id);
    }
}
