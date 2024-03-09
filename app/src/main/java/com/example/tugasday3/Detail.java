package com.example.tugasday3;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Detail implements Parcelable {

    public String  nama_barang;
    public String ukuran;
    public String chipset;
    public String kapasitas;
    public String ram;
    public String tahun_produksi;
    public String batrei;
    public String gambar;
    public String harga;



    public Detail() {
    }

    public Detail(String nama_barang, String ukuran, String chipset, String kapasitas,
                  String ram, String tahun_produksi, String batrei, String gambar, String harga) {
        this.nama_barang = nama_barang;
        this.ukuran = ukuran;
        this.chipset = chipset;
        this.kapasitas = kapasitas;
        this.ram = ram;
        this.tahun_produksi = tahun_produksi;
        this.batrei = batrei;
        this.gambar = gambar;
        this.harga = harga;

    }
    protected Detail(Parcel in) {
        nama_barang = in.readString();
        ukuran = in.readString();
        chipset = in.readString();
        kapasitas = in.readString();
        ram = in.readString();
        tahun_produksi = in.readString();
        batrei = in.readString();
        gambar = in.readString();
        harga = in.readString();
    }

    public static final Creator<Detail> CREATOR = new Creator<Detail>() {
        @Override
        public Detail createFromParcel(Parcel in) {
            return new Detail(in);
        }

        @Override
        public Detail[] newArray(int size) {
            return new Detail[size];
        }
    };

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getTahun_produksi() {
        return tahun_produksi;
    }

    public void setTahun_produksi(String tahun_produksi) {
        this.tahun_produksi = tahun_produksi;
    }

    public String getBatrei() {
        return batrei;
    }

    public void setBatrei(String batrei) {
        this.batrei = batrei;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {this.gambar = gambar;}

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {this.harga = harga;}

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(nama_barang);
        dest.writeString(ukuran);
        dest.writeString(chipset);
        dest.writeString(kapasitas);
        dest.writeString(ram);
        dest.writeString(tahun_produksi);
        dest.writeString(batrei);
        dest.writeString(gambar);
        dest.writeString(harga);

    }
}
