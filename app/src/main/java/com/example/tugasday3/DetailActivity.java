package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import androidx.core.content.FileProvider;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView ivIphonee;
    private TextView tvIphonee, tvIphoneeprice, tvDescriptionIphonee;

    private Button btnShare;

    public static final String KEY_DATA = "key_data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivIphonee = findViewById(R.id.ivIphonee);
        tvIphonee = findViewById(R.id.tvIphonee);
        tvIphoneeprice = findViewById(R.id.tvIphoneeprice);
        tvDescriptionIphonee = findViewById(R.id.tvDescriptionIphonee);
        btnShare = findViewById(R.id.btnShare);

        Detail detail;

        if (Build.VERSION.SDK_INT >= 33) {
            detail = getIntent().getParcelableExtra(KEY_DATA, Detail.class);

        } else {
            detail = getIntent().getParcelableExtra(KEY_DATA);
        }
        String sourceGambar = detail.getGambar();
        int sourceGambarID = getResources().getIdentifier(sourceGambar, "drawable", getPackageName());
        ivIphonee.setImageResource(sourceGambarID);

        String Kapasitas = detail.getKapasitas();
        String Ram = detail.getRam();
        String Chipset = detail.getChipset();
        String Ukuran = detail.getUkuran();
        String Tahun_produksi = detail.getTahun_produksi();
        String Batrei = detail.getBatrei();
        String Gabungan = Kapasitas + Ram + Chipset + Ukuran + Batrei + Tahun_produksi;

        tvDescriptionIphonee.setText(Gabungan);
        tvIphonee.setText(detail.getNama_barang());
        tvIphoneeprice.setText(detail.getHarga());
        btnShare.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
            Bitmap bitmap = ((BitmapDrawable) ivIphonee.getDrawable()).getBitmap();


            String path = MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, "Image Description", null);
            Uri imageUri = Uri.parse(path);


            String text = tvDescriptionIphonee.getText().toString();
            String text2 = tvIphonee.getText().toString();
            String text3 = tvIphoneeprice.getText().toString();

            // Combine the text
            String shareText = text2 + "\n" + text + "\n" + text3;


            Intent shareIntent = new Intent(Intent.ACTION_SEND);


            shareIntent.setType("image/*");

            shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);


            Intent chooserIntent = Intent.createChooser(shareIntent, "Share with");


            if (shareIntent.resolveActivity(getPackageManager()) != null) {

                startActivity(chooserIntent);
        }

    }
}
