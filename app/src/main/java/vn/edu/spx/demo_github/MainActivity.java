package vn.edu.spx.demo_github;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Đây là phần thêm", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Thien da them dong nay", Toast.LENGTH_SHORT).show();
    }
}