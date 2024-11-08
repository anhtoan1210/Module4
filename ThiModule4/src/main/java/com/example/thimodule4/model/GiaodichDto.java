package com.example.thimodule4.model;

import  jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class GiaodichDto implements Validator {
    private Integer id;
    @NotBlank(message = "Mã giao dịch không được để trống")
    @Pattern(regexp = "^MGD-\\d{4}$", message = "Mã giao dịch phải theo định dạng MGD-XXXX")
    private String maGiaoDich;
    @NotNull
    @Future(message = "Ngày giao dịch phải sau ngày hiện tại")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String ngayGiaoDich;
    @NotBlank(message = "Loại dịch vụ không được để trống")
    @Pattern(regexp = "0|1", message = "Loại dịch vụ phải là 0 hoặc 1")
    private Integer loaiDichVu;
    @NotBlank(message = "Đơn giá không được để trống")
    @Min(value = 500000, message = "Đơn giá phải lớn hơn 50000")
    private Double donGia;
    @NotBlank(message = "Diện tích không được để trống")
    @Min(value = 20, message = "Diện tích phải lớn hơn 20")
    private Double dienTich;
    @NotNull(message = "Vui lòng chọn  khách hàng")
    private Khachhang khachhang;

    public GiaodichDto() {
    }

    public GiaodichDto(Integer id, String maGiaoDich, String ngayGiaoDich, Integer loaiDichVu, Double donGia, Double dienTich, Khachhang khachhang) {
        this.id = id;
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.loaiDichVu = loaiDichVu;
        this.donGia = donGia;
        this.dienTich = dienTich;
        this.khachhang = khachhang;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public Double getDienTich() {
        return dienTich;
    }

    public void setDienTich(Double dienTich) {
        this.dienTich = dienTich;
    }

    public Khachhang getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(Khachhang khachhang) {
        this.khachhang = khachhang;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public @NotBlank(message = "Loại dịch vụ không được để trống") Integer getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(@NotBlank(message = "Loại dịch vụ không được để trống") Integer loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
       GiaodichDto giaodichDto = (GiaodichDto) target;
    }
}
