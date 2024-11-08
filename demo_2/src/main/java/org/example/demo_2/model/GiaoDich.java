package org.example.demo_2.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class GiaoDich {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer maGiaoDich;

    private LocalDate ngayGiaoDich;
    private String loaiDichVu;

    private String donGia;
    private String dienTich;
    @ManyToOne
    @JoinColumn(name = "ma_khach_hang")
    private KhachHang khachHang;

    public GiaoDich() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(Integer maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public LocalDate getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
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
}
