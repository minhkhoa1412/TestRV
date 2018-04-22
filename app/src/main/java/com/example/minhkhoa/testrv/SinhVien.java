package com.example.minhkhoa.testrv;

public class SinhVien {
    private int maSo;
    private String hoTen;

    public SinhVien() {
    }

    public SinhVien(int maSo, String hoTen) {
        this.maSo = maSo;
        this.hoTen = hoTen;
    }

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
}
