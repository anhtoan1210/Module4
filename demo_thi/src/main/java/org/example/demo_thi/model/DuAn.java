package org.example.demo_thi.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class DuAn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String maDuAn;
    private String tenDuAn;
    private String doanhNghiepDangKiDuAn;
    private double kinhPhiYeuCau;
    private String moTa;
    private String thoiGian;
    private LocalDate ngay;


    public LocalDate getNgay() {
        return ngay;
    }

    public void setNgay(LocalDate ngay) {
        this.ngay = ngay;
    }

    @ManyToOne
    @JoinColumn(name = "id_doanh_nghiep")
    private DoanhNghiep doanhNghiep;

    public DuAn() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenDuAn() {
        return tenDuAn;
    }

    public String getMaDuAn() {
        return maDuAn;
    }

    public void setMaDuAn(String maDuAn) {
        this.maDuAn = maDuAn;
    }

    public DoanhNghiep getDoanhNghiep() {
        return doanhNghiep;
    }

    public void setDoanhNghiep(DoanhNghiep doanhNghiep) {
        this.doanhNghiep = doanhNghiep;
    }

    public void setTenDuAn(String tenDuAn) {
        this.tenDuAn = tenDuAn;
    }

    public String getDoanhNghiepDangKiDuAn() {
        return doanhNghiepDangKiDuAn;
    }

    public void setDoanhNghiepDangKiDuAn(String doanhNghiepDangKiDuAn) {
        this.doanhNghiepDangKiDuAn = doanhNghiepDangKiDuAn;
    }

    public double getKinhPhiYeuCau() {
        return kinhPhiYeuCau;
    }

    public void setKinhPhiYeuCau(double kinhPhiYeuCau) {
        this.kinhPhiYeuCau = kinhPhiYeuCau;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }
}
