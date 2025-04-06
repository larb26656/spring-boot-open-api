package com.example.api_docs;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/test")
public class TestController {
    @PostMapping
    public Long create(@RequestBody CreateTestDto req) {
        return 1L;
    }

    @GetMapping
    public List<String> get() {
        return List.of("test1", "test2");
    }

    @GetMapping("{id}")
    public String get(@PathVariable Long id) {
        return "test1";
    }

    @PutMapping
    public void edit(@RequestBody CreateTestDto req) {

    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {

    }

}
