package com.example.thimodule4.model;

import jakarta.persistence.*;

@Entity
public class Giaodich {
    @Id
    @GeneratedValue
    private Integer id;
    private String maGiaoDich;
    private String ngayGiaoDich;
    private Double donGia;
    private Double dienTich;
    private Integer loaiDichVu;
    @ManyToOne
    @JoinColumn(name = "id_khachhang")
    private Khachhang khachhang;

    public Giaodich() {
    }

    public Giaodich(Integer id, String maGiaoDich, String ngayGiaoDich, Double donGia, Double dienTich, Integer loaiDichVu, Khachhang khachhang) {
        this.id = id;
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
        this.loaiDichVu = loaiDichVu;
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

    public Integer getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(Integer loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }
}
