package com.kirabium.gegemail.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.kirabium.gegemail.DI.DI;
import com.kirabium.gegemail.databinding.ActivityMainBinding;
import com.kirabium.gegemail.model.Mail;
import com.kirabium.gegemail.service.MailApiService;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;
    private List<Mail> mMailArrayList;
    private MailApiService mMailApiService = DI.getMailApiService();

    private void initUI() {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        setButton();
        initData();
    }

    private void initData() {
        mMailArrayList = mMailApiService.getMails();
    }

    private void setButton() {
        binding.startAddActivity.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initUI();
    }


    @Override
    public void onClick(View view) {
        if (view == binding.startAddActivity) {
            startActivity(new Intent(this, AddMailActivity.class));
        }
    }
}