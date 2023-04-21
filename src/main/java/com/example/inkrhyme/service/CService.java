package com.example.inkrhyme.service;
import com.example.inkrhyme.model.CPoems;
import com.example.inkrhyme.repositories.IPoems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CService {
    @Autowired
    private IPoems iPoems;

    public void createPoems(CPoems poems) {
        iPoems.save(poems);

    }

    public List<CPoems> readPoems() {
        List<CPoems> poems = new ArrayList<CPoems>(iPoems.findAll());
        return poems;

    }

    public Optional<CPoems> readPoemsId(Long id) {
        Optional<CPoems> poems = iPoems.findById(id);
        return poems;
    }

    public void updatePoems(CPoems poems, Long id) {
        poems.setId(id);
        iPoems.save(poems);

    }

    public void deletePoems(Long id) {
        iPoems.deleteById(id);


    }


}