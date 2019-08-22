package lavi.com.muslimid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_doa;
    private  Button btn_sholat;
    private Button btn_produk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_doa=(Button) findViewById(R.id.btndoa);
        btn_doa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(MainActivity.this, DoaHarian.class);
                startActivity(intent);
            }
        });

        btn_sholat=(Button) findViewById(R.id.btnsholat);
        btn_sholat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(MainActivity.this, JadwalSholat.class);
                startActivity(intent);
            }
        });

        btn_produk = (Button) findViewById(R.id.btnproduk);
        btn_produk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(MainActivity.this, HalalApp.class);
                startActivity(intent);
            }
        });
    }
}
