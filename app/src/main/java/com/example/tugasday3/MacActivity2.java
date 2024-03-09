package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MacActivity2 extends AppCompatActivity implements View.OnClickListener {

    private ImageView ivMacm1;
    private TextView tvMacM1, tvMacM1price, tvDescriptionMacM1;

    public static final String EXTRA_NAME = "EXTRA NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mac2);

        ImageView ivMacM1 = findViewById(R.id.ivMacM1);
        ImageView ivMacM1pro = findViewById(R.id.ivMacM1pro);
        ImageView ivMacM2 = findViewById(R.id.ivMacM2);
        ImageView ivMacM2pro = findViewById(R.id.ivMacM2pro);
        ImageView ivMacM3 = findViewById(R.id.ivMacM3);

        ivMacM1.setOnClickListener(this);
        ivMacM1pro.setOnClickListener(this);
        ivMacM2.setOnClickListener(this);
        ivMacM2pro.setOnClickListener(this);
        ivMacM3.setOnClickListener(this);

    }

    Detail detail = new Detail();
    Intent intent;

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.ivMacM1 ){
            detail.setNama_barang("MacBook Air M1\n");
            detail.setKapasitas("KAPASITAS : 256GB\n");
            detail.setRam("RAM : 8GB\n");
            detail.setChipset("CHIPSET : A 15 Bionic\n");
            detail.setUkuran("UKURAN :13.3 Inci\n");
            detail.setBatrei("Batrei : 18 jam\n");
            detail.setTahun_produksi("TAHUN PRODUKSI : 2021\n");
            detail.setGambar("macm1");
            detail.setHarga("Rp 12.499.000\n");
            intent = new Intent(MacActivity2.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,detail);
            startActivity(intent);

        } else if (v.getId()==R.id.ivMacM1pro ) {
            detail.setNama_barang("MacBook Air M1 Pro\n");
            detail.setKapasitas("KAPASITAS : 512GB\n");
            detail.setRam("RAM : 8Gb\n");
            detail.setChipset("CHIPSET : A 16 Bionic\n");
            detail.setUkuran("UKURAN :13 Inci\n");
            detail.setBatrei("Batrei : 22 jam\n");
            detail.setTahun_produksi("TAHUN PRODUKSI : 2022\n");
            detail.setGambar("macm1pro");
            detail.setHarga("Rp 16.499.000\n");
            intent = new Intent(MacActivity2.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);

        }else if(v.getId()==R.id.ivMacM2 ) {
            detail.setNama_barang("MacBook Air M2\n");
            detail.setKapasitas("KAPASITAS : 256GB\n");
            detail.setRam("RAM : 8GB\n");
            detail.setChipset("CHIPSET : A 17 Bionic\n");
            detail.setUkuran("UKURAN :13.6 Inci\n");
            detail.setBatrei("Batrei : 19 jam\n");
            detail.setTahun_produksi("TAHUN PRODUKSI : 2023\n");
            detail.setGambar("macm2");
            detail.setHarga("Rp 18.999.000\n");
            intent = new Intent(MacActivity2.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);

        }else if(v.getId()==R.id.ivMacM2pro ) {
            detail.setNama_barang("MacBook Air M2\n");
            detail.setKapasitas("KAPASITAS : 512GB\n");
            detail.setRam("RAM : 16GB\n");
            detail.setChipset("CHIPSET : A 17 Bionic\n");
            detail.setUkuran("UKURAN :13 Inci\n");
            detail.setBatrei("Batrei : 22 jam\n");
            detail.setTahun_produksi("TAHUN PRODUKSI : 2022\n");
            detail.setGambar("macm2pro");
            detail.setHarga("Rp 21.999.000\n");
            intent = new Intent(MacActivity2.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);

        }else if (v.getId()==R.id.ivMacM3 ) {
            detail.setNama_barang("MacBook Air M3 \n");
            detail.setKapasitas("KAPASITAS : 512GB\n");
            detail.setRam("RAM : 16GB\n");
            detail.setChipset("CHIPSET : A 17 Bionic\n");
            detail.setUkuran("UKURAN :13 Inci\n");
            detail.setBatrei("Batrei : 24 jam\n");
            detail.setTahun_produksi("TAHUN PRODUKSI : 2023\n");
            detail.setGambar("macm3");
            detail.setHarga("Rp 25.999.000\n");
            intent = new Intent(MacActivity2.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }

    }
}
