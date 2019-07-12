package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class Secondary extends AppCompatActivity{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondary);
        TextView textview = findViewById(R.id.secondarytext);
        String position = "点击了第"+getIntent().getStringExtra("position")+"个控件";
        textview.setText(position);
    }
}
