package kr.ac.yeonsung.seoj.mobile1project_0905_02;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText editDeg;
    ImageView imgv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editDeg = findViewById(R.id.edit_deg);
        imgv = findViewById(R.id.imgv);
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.imgmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.item_rotation:
                //입력받은 각도가 회전되게 시킴
                int degree = Integer.parseInt(editDeg.getText().toString());
                //그림에 회전이 가능하게 시킴
                imgv.setRotation(degree);

                return true;
            case R.id.item_hanra:
                imgv.setImageResource(R.drawable.mountain);
                item.setChecked(true);
                return true;

            case R.id.item_chuja:
                imgv.setImageResource(R.drawable.chujado);
                item.setChecked(true);
                return true;

            case R.id.item_bum:
                imgv.setImageResource(R.drawable.bum_island);
                item.setChecked(true);
                return true;
        }
        return false;
    }
}