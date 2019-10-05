package id.ac.poliban.dts.agil.latihan00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menghubungkan view dengan object button
        //dalam source code kita
        Button btFirst = findViewById(R.id.btFirst);
        Button btSecond = findViewById(R.id.btSecond);
        Button btthird = findViewById(R.id.btThird);
        Button btForth = findViewById(R.id.btForth);

        //interfaces onClickListener merupakan interfaces yang ada di kelas View
        //hanya berisi satu method onClick(View view)

        //berikut kode pemasangan event listener onClick pada object button
        btFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hei anda telah menekan tombol pertama", Toast.LENGTH_SHORT).show();
            }
        });
        btSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hei anda telah menekan tombol kedua", Toast.LENGTH_SHORT).show();
            }
        });
        btthird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hei anda telah menekan tombol ketiga", Toast.LENGTH_SHORT).show();
            }
        });
        btForth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hei anda telah menekan tombol ke empat", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
