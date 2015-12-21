package vn.nks.loclt.demoandroid;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.textView);
        txt.setText(getString(R.string.large_text));
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);


        // thực hienj chuyển đổi ngôn ngủ
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
      `      @Override
            public void onClick(View view) {
                // cọi loại ngôn ngủ cần chuyển đổi
                Locale locale = new Locale("en_ldltr");
                // set mac định cho
                // set mặc định ngon ngủ cho ứng dụng
                Locale.setDefault(locale);
                //
                Configuration configuration = new Configuration();
                // t
                configuration.locale = locale;
                // thưc hiện cập nhật
                getApplicationContext().getResources().updateConfiguration(configuration, null);
                txt.setText(getString(R.string.large_text));
            }
        });
    }

}
