package com.example.mvponly.presenter;

import android.util.Log;

import com.example.mvponly.model.Model;
import com.example.mvponly.view.MainActivity;
import com.example.mvponly.view.MainView;

public class MainPresenter {
    private static final String TAG = "MainPresenter";
    private Model model;
    private MainView mainView;

    public MainPresenter(MainView mainView) {
        Log.d(TAG, "MainPresenter: ");
        this.mainView = mainView;
        model = new Model();
    }

    private String appendStr(String text, String str) {
        return text + str;
    }

    public void onButtonClick(String str) {
        String text = model.getText();
        String newText = appendStr(text, str);
        model.setText(newText);
        mainView.setAddedText(newText);
    }
}
