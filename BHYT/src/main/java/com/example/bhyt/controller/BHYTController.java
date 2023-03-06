package com.example.bhyt.controller;

import com.example.bhyt.service.BHYTService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/bhyt")
public class BHYTController {
    private final BHYTService bhytService;
    // http://localhost:8082/bhyt
    @GetMapping
    public boolean TestApi() {
        return true;
    }

}
