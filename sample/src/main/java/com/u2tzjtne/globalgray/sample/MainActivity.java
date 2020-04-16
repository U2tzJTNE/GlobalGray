package com.u2tzjtne.globalgray.sample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;

import com.u2tzjtne.globalgray.sample.util.AppUtils;
import com.u2tzjtne.globalgray.sample.util.SPUtils;

/**
 * @author u2tzjtne
 * Date 2020/4/16
 * Email u2tzjtne@gmail.com
 */
public class MainActivity extends AppCompatActivity {

    private SwitchCompat mSwitchCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mSwitchCompat = findViewById(R.id.sw_enable_gray);
        Button mBtnShowDialog = findViewById(R.id.btn_show_dialog);

        mBtnShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });

        mSwitchCompat.setChecked(SPUtils.getBoolean("enable_gray", false));

        mSwitchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                SPUtils.putBoolean("enable_gray", mSwitchCompat.isChecked());
                //需要延迟启动，否则可能还没有写入SP应用进程就被杀死了
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        AppUtils.restartApp(MainActivity.this);
                    }
                }, 300);
            }
        });
    }

    private void showDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.app_name)
                .setIcon(R.mipmap.ic_launcher)
                .setMessage("this is a dialog!")
                .setNegativeButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setCancelable(true)
                .show();
    }
}
