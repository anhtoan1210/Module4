package org.example.demo_2.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import org.example.demo_2.model.KhachHang;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.time.LocalDate;

public class GiaoDichDto implements Validator {

    private Integer maGiaoDich;

    @NotBlank(message = "aaaaaaa")
    private String loaiDichVu;
    @Future(message = "ngay giao dich phai sau ngay hien tai")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate ngayGiaoDich;
    @NotBlank(message = "aaaaaaa")
    private String donGia;
    @NotBlank(message = "aaaaaaa")
    private String dienTich;
    private KhachHang khachHang;

    public GiaoDichDto() {
    }

    public Integer getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(Integer maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    public LocalDate getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    public String getDienTich() {
        return dienTich;
    }

    public void setDienTich(String dienTich) {
        this.dienTich = dienTich;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        GiaoDichDto giaoDichDto = (GiaoDichDto) target;

      }
}
