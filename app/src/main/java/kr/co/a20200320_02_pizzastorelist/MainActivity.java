package kr.co.a20200320_02_pizzastorelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kr.co.a20200320_02_pizzastorelist.databinding.ActivityMainBinding;

public class MainActivity extends baseActivity {
    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        setupEvents();
        setValues();
    }


    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }
}
