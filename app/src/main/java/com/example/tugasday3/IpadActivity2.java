package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class IpadActivity2 extends AppCompatActivity implements View.OnClickListener {

    private ImageView ivIpadMini;
    private TextView tvIpadMini, tvIpadMiniprice, tvDescriptionIpadMini;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipad2);

        ImageView ivIpadMini = findViewById(R.id.ivIpadMini);
        ImageView ivIpadAir = findViewById(R.id.ivIpadAir);
        ImageView ivIpadM1 = findViewById(R.id.ivIpadM1);
        ImageView ivIpadM2 = findViewById(R.id.ivIpadM2);
        ImageView ivIpadPro = findViewById(R.id.ivIpadPro);

        ivIpadMini.setOnClickListener(this);
        ivIpadAir.setOnClickListener(this);
        ivIpadM1.setOnClickListener(this);
        ivIpadM2.setOnClickListener(this);
        ivIpadPro.setOnClickListener(this);

    }

    Detail detail = new Detail();
    Intent intent;

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.ivIpadMini ){
            detail.setNama_barang("NAMA BARANG : Ipad Mini\n");
            detail.setKapasitas("KAPASITAS : 64GB\n");
            detail.setRam("RAM : 4GB\n");
            detail.setChipset("CHIPSET : A 14 Bionic\n");
            detail.setUkuran("UKURAN :8.3 Inci\n");
            detail.setBatrei("Batrei : 7678 mAh\n");
            detail.setTahun_produksi("TAHUN PRODUKSI : 2020\n");
            detail.setGambar("ipadmini");
            detail.setHarga("Rp 5.789.000\n");
            intent = new Intent(IpadActivity2.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,detail);
            startActivity(intent);

        } else if (v.getId()==R.id.ivIpadAir ) {
            detail.setNama_barang("NAMA BARANG : Ipad Air\n");
            detail.setKapasitas("KAPASITAS : 128GB\n");
            detail.setRam("RAM : 4GB\n");
            detail.setChipset("CHIPSET : A 15 Bionic\n");
            detail.setUkuran("UKURAN :10.86Inci\n");
            detail.setBatrei("Batrei : 8678 mAh\n");
            detail.setTahun_produksi("TAHUN PRODUKSI : 2021\n");
            detail.setGambar("ipadair");
            detail.setHarga("Rp 7.999.000\n");
            intent = new Intent(IpadActivity2.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);

        }else if(v.getId()==R.id.ivIpadM1 ) {
            detail.setNama_barang("NAMA BARANG : Ipad M1\n");
            detail.setKapasitas("KAPASITAS : 128GB\n");
            detail.setRam("RAM : 8GB\n");
            detail.setChipset("CHIPSET : A 16 Bionic\n");
            detail.setUkuran("UKURAN :12.9 Inci\n");
            detail.setBatrei("Batrei : 9678 mAh\n");
            detail.setTahun_produksi("TAHUN PRODUKSI : 2022\n");
            detail.setGambar("ipadm1");
            detail.setHarga("Rp 10.999.000\n");
            intent = new Intent(IpadActivity2.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);

        }else if(v.getId()==R.id.ivIpadM2 ) {
            detail.setNama_barang("NAMA BARANG : Ipad M2\n");
            detail.setKapasitas("KAPASITAS : 256GB\n");
            detail.setRam("RAM : 8GB\n");
            detail.setChipset("CHIPSET : A 16 Bionic\n");
            detail.setUkuran("UKURAN :13 Inci\n");
            detail.setBatrei("Batrei : 10678 mAh\n");
            detail.setTahun_produksi("TAHUN PRODUKSI : 2023\n");
            detail.setGambar("ipadm2");
            detail.setHarga("Rp 12.999.000\n");
            intent = new Intent(IpadActivity2.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);

        }else if (v.getId()==R.id.ivIpadPro ) {
            detail.setNama_barang("NAMA BARANG : Ipad Pro\n");
            detail.setKapasitas("KAPASITAS : 256GB\n");
            detail.setRam("RAM : 16GB\n");
            detail.setChipset("CHIPSET : A 16 Bionic\n");
            detail.setUkuran("UKURAN :12.9 Inci\n");
            detail.setBatrei("Batrei : 10878 mAh\n");
            detail.setTahun_produksi("TAHUN PRODUKSI : 2023\n");
            detail.setGambar("ipadpro");
            detail.setHarga("Rp 14.999.000\n");
            intent = new Intent(IpadActivity2.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }
    }
}