package org.example.demo_thi.dto;

import jakarta.validation.constraints.NotBlank;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.time.LocalDate;

public class DuAnDto implements Validator {

    private String maDuAn;
    @NotBlank(message = "khong duoc de trong")
    private String tenDuAn;
    @NotBlank(message = "khong duoc de trong")
    private String doanhNghiepDangKiDuAn;

    private double kinhPhiYeuCau;
    @NotBlank(message = "khong duoc de trong")
    private String thoiGian;


    private LocalDate ngay;


    public DuAnDto() {
    }

    public String getMaDuAn() {
        return maDuAn;
    }

    public void setMaDuAn(String maDuAn) {
        this.maDuAn = maDuAn;
    }

    public String getTenDuAn() {
        return tenDuAn;
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

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public LocalDate getNgay() {
        return ngay;
    }

    public void setNgay(LocalDate ngay) {
        this.ngay = ngay;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
