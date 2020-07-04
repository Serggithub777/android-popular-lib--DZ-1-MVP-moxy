package com.example.mvpwithmoxy.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvpwithmoxy.R;
import com.example.mvpwithmoxy.presenter.Presenter;

import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;
import moxy.presenter.ProvidePresenter;

public class MainActivity extends MvpAppCompatActivity implements MainView {

    private static final String TAG = "MainActivity";
    private EditText enteredText;
    private TextView textAdded;
    private Button buttonAddText;
    private String str;

    @InjectPresenter
    Presenter presenter;

//    @ProvidePresenter
//    public Presenter providePresenter() {
//        return new Presenter();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        enteredText = findViewById(R.id.enteredText);
        textAdded = findViewById(R.id.textViewAdded);
        buttonAddText = findViewById(R.id.buttonAdd);
    }

    public void buttonClick(View view) {
        str = enteredText.getText().toString();
        presenter.onButtonClick(str);
    }

    @Override
    public void setAddedText(String text) {
        textAdded.setText(text);
    }
}
