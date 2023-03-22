package com.example.inkrhyme.repositories;

import com.example.inkrhyme.model.CPoems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPoems extends JpaRepository <CPoems, Integer>{
}
