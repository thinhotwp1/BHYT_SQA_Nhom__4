package com.example.bhyt.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_BHYT")
public class BHYT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String hoTen;
    private String CCCD;
    private String ngaySinh;
    private String tinhThanh;
    private String huyen;
    private String ngayThamGia;
    private String ngayHetHan;
    private String nguoiDong;

}
