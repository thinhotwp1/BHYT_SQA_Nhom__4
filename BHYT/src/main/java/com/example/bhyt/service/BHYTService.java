package com.example.bhyt.service;

import com.example.bhyt.model.BHYT;
import com.example.bhyt.repository.BHYTRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class BHYTService {
    private final BHYTRepo bhytRepo;

//    public List<BHYT> findByCCCD(List<String> ListCCCD){
//        log.info("started");
//        return bhytRepo.findByCCCD(ListCCCD);
//    }

    public BHYT updateBHYT(BHYT bhyt) {
        BHYT bhyt1 = bhytRepo.findByCccd(bhyt.getCccd());
        bhytRepo.delete(bhyt1);
        return bhytRepo.save(bhyt);
    }

    public boolean insertBHYT(List<BHYT> bhyts) {
        try {
            for (BHYT bh : bhyts) {
                bhytRepo.save(bh);
            }
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public BHYT findByCCCD(String cccd) {
        return bhytRepo.findByCccd(cccd);
    }

    public boolean deleteBHYT(List<String> CCCDs) {
        try {
            for (String CCCD : CCCDs) {
                BHYT bhyt = bhytRepo.findByCccd(CCCD);
                bhytRepo.delete(bhyt);
            }
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
