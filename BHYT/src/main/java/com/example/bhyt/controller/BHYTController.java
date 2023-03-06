package com.example.bhyt.controller;

import com.example.bhyt.model.BHYT;
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

//    @PostMapping("/findByListCCCD")
//    public List<BHYT> findByCCCD(@RequestBody List<String> listCCCD) {
//        try {
//            return bhytService.findByCCCD(listCCCD);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return null;
//    }

    @PostMapping("/findByCCCD")
    public BHYT findByCCCD(@RequestParam(name = "cccd") String CCCD) {
        try {
            return bhytService.findByCCCD(CCCD);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @PostMapping("/update_BHYT")
    public BHYT updateBHYT(@RequestBody BHYT bhyt) {
        BHYT response = bhytService.updateBHYT(bhyt);
        return response;
    }

    @PostMapping("/insert_BHYT")
    public boolean updateBHYT(@RequestBody List<BHYT> bhyts) {
        boolean response = bhytService.insertBHYT(bhyts);
        return response;
    }
    @PostMapping("/delete_BHYT")
    public boolean deleteBHYT(@RequestParam(name = "cccd") List<String> listCCCD){
        boolean response = bhytService.deleteBHYT(listCCCD);
        return response;
    }
}
