package com.example.bhyt.repository;

import com.example.bhyt.model.BHYT;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BHYTRepo extends JpaRepository<BHYT, Long> {
//    List<BHYT> findByCCCD(List<String> CCCD);

    BHYT findByCccd(String cccd);

}
