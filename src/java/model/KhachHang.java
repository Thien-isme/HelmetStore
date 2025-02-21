package model;

import java.sql.Date;

public class KhachHang {

    private String maKhachHang;
    private String tenDangNhap;
    private String matKhau;
    private String hoVaTen;
    private String gioiTinh;
    private Date ngaySinh;
    private String soDienThoai;
    private String email;
    private String quocTich;
    private String diaChiKhachHang;
    private String diaChiNhanHang;
    private boolean dangKyNhanBangTin;
    private String maXacThuc;
    private Date thoiGianHieuLucMaXacThuc;
    private boolean trangThaiXacThuc;
    private String hinhAvatar;

    public KhachHang(String maKhachHang, String tenDangNhap, String matKhau, String email) {
        this.maKhachHang = maKhachHang;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.email = email;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public String getDiaChiKhachHang() {
        return diaChiKhachHang;
    }

    public void setDiaChiKhachHang(String diaChiKhachHang) {
        this.diaChiKhachHang = diaChiKhachHang;
    }

    public String getDiaChiNhanHang() {
        return diaChiNhanHang;
    }

    public void setDiaChiNhanHang(String diaChiNhanHang) {
        this.diaChiNhanHang = diaChiNhanHang;
    }

    public boolean isDangKyNhanBangTin() {
        return dangKyNhanBangTin;
    }

    public void setDangKyNhanBangTin(boolean dangKyNhanBangTin) {
        this.dangKyNhanBangTin = dangKyNhanBangTin;
    }

    public String getMaXacThuc() {
        return maXacThuc;
    }

    public void setMaXacThuc(String maXacThuc) {
        this.maXacThuc = maXacThuc;
    }

    public Date getThoiGianHieuLucMaXacThuc() {
        return thoiGianHieuLucMaXacThuc;
    }

    public void setThoiGianHieuLucMaXacThuc(Date thoiGianHieuLucMaXacThuc) {
        this.thoiGianHieuLucMaXacThuc = thoiGianHieuLucMaXacThuc;
    }

    public boolean isTrangThaiXacThuc() {
        return trangThaiXacThuc;
    }

    public void setTrangThaiXacThuc(boolean trangThaiXacThuc) {
        this.trangThaiXacThuc = trangThaiXacThuc;
    }

    public String getHinhAvatar() {
        return hinhAvatar;
    }

    public void setHinhAvatar(String hinhAvatar) {
        this.hinhAvatar = hinhAvatar;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKhachHang=" + maKhachHang + ", tenDangNhap=" + tenDangNhap + ", matKhau=" + matKhau + ", hoVaTen=" + hoVaTen + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", soDienThoai=" + soDienThoai + ", email=" + email + ", quocTich=" + quocTich + ", diaChiKhachHang=" + diaChiKhachHang + ", diaChiNhanHang=" + diaChiNhanHang + ", dangKyNhanBangTin=" + dangKyNhanBangTin + ", maXacThuc=" + maXacThuc + ", thoiGianHieuLucMaXacThuc=" + thoiGianHieuLucMaXacThuc + ", trangThaiXacThuc=" + trangThaiXacThuc + ", hinhAvatar=" + hinhAvatar + '}';
    }

    
    
    
    
    

}
