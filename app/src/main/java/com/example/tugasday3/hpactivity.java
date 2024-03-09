package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class hpactivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvIphone13, tvIphone13price, tvDescriptionIphone13;
    private ImageView ivIphone13;

    public static final String EXTRA_NAME = "EXTRA NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hpactivity);

       /* int imageResourceId = getIntent().getIntExtra("IMAGE_RESOURCE_ID", 0);
        ImageView iphone = findViewById(R.id.ivIphone13);
        iphone.setImageResource(imageResourceId);*/

        ImageView ivIphone13 = findViewById(R.id.ivIphone13);
        ImageView ivIphone14 = findViewById(R.id.ivIphone14);
        ImageView ivIphone15 = findViewById(R.id.ivIphone15);
        ImageView ivIphone15pro = findViewById(R.id.ivIphone15pro);
        ImageView ivIphone15promax = findViewById(R.id.ivIphone15promax);

        ivIphone13.setOnClickListener(this);
        ivIphone14.setOnClickListener(this);
        ivIphone15.setOnClickListener(this);
        ivIphone15pro.setOnClickListener(this);
        ivIphone15promax.setOnClickListener(this);

    }
Detail detail = new Detail();
    Intent intent;
    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.ivIphone13 ){
            detail.setNama_barang("Iphone 13\n");
            detail.setKapasitas("KAPASITAS : 256GB\n");
            detail.setRam("RAM : 4GB\n");
            detail.setChipset("CHIPSET : A 15 Bionic\n");
            detail.setUkuran("UKURAN :6.1 Inci\n");
            detail.setBatrei("BATREI : 3095 mAh\n");
            detail.setTahun_produksi("TAHUN PRODUKSI : 2021\n");
            detail.setGambar("iphone13");
            detail.setHarga("Rp 9.999.000\n");
            intent = new Intent(hpactivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,detail);
            startActivity(intent);

        } else if (v.getId()==R.id.ivIphone14 ) {
            detail.setNama_barang("Iphone 14\n");
            detail.setKapasitas("KAPASITAS : 128GB\n");
            detail.setRam("RAM : 4GB\n");
            detail.setChipset("CHIPSET : A 16 Bionic\n");
            detail.setUkuran("UKURAN :6.1 Inci\n");
            detail.setBatrei("BATREI : 3279 mAh\n");
            detail.setTahun_produksi("TAHUN PRODUKSI : 2022\n");
            detail.setGambar("iphone14");
            detail.setHarga("Rp 12.999.000\n");
            intent = new Intent(hpactivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);

        }else if(v.getId()==R.id.ivIphone15 ) {
            detail.setNama_barang("Iphone 15\n");
            detail.setKapasitas("KAPASITAS : 128GB\n");
            detail.setRam("RAM : 4GB\n");
            detail.setChipset("CHIPSET : A 17 Bionic\n");
            detail.setUkuran("UKURAN :6.1 Inci\n");
            detail.setBatrei("BATREI : 3395 mAh\n");
            detail.setTahun_produksi("TAHUN PRODUKSI : 2023\n");
            detail.setGambar("iphone15");
            detail.setHarga("Rp 14.999.000\n");
            intent = new Intent(hpactivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);

        }else if(v.getId()==R.id.ivIphone15pro ) {
            detail.setNama_barang("15pro\n");
            detail.setKapasitas("KAPASITAS : 512GB\n");
            detail.setRam("RAM : 8GB\n");
            detail.setChipset("CHIPSET : A 17 Bionic\n");
            detail.setUkuran("UKURAN :6.1 Inci\n");
            detail.setBatrei("BATREI : 3696 mAh\n");
            detail.setTahun_produksi("TAHUN PRODUKSI : 2023\n");
            detail.setGambar("iphone15pro");
            detail.setHarga("Rp 19.999.000\n");
            intent = new Intent(hpactivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);

        }else if (v.getId()==R.id.ivIphone15promax ) {
            detail.setNama_barang("Iphone 15promax\n");
            detail.setKapasitas("KAPASITAS : 512GB\n");
            detail.setRam("RAM : 8GB\n");
            detail.setChipset("CHIPSET : A 17 Bionic\n");
            detail.setUkuran("UKURAN :6.6 Inci\n");
            detail.setBatrei("BATREI : 4441 mAh\n");
            detail.setTahun_produksi("TAHUN PRODUKSI : 2023\n");
            detail.setGambar("iphone15promaxx");
            detail.setHarga("Rp 25.999.000\n");
            intent = new Intent(hpactivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }

        }
}