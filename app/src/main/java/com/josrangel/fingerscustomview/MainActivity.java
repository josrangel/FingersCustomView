package com.josrangel.fingerscustomview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private FingerSelectionView fingerSelectionView;

    private Switch sF1;
    private Switch sF2;
    private Switch sF3;
    private Switch sF4;
    private Switch sF5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fingerSelectionView = findViewById(R.id.fsv_hand_1);
        fingerSelectionView.setFinger1Status(false);
        fingerSelectionView.setFinger2Status(false);

        sF1 = findViewById(R.id.s_f1);
        sF2 = findViewById(R.id.s_f2);
        sF3 = findViewById(R.id.s_f3);
        sF4 = findViewById(R.id.s_f4);
        sF5 = findViewById(R.id.s_f5);

        sF1.setOnCheckedChangeListener((compoundButton, b) -> fingerSelectionView.setFinger1Status(b));
        sF2.setOnCheckedChangeListener((compoundButton, b) -> fingerSelectionView.setFinger2Status(b));
        sF3.setOnCheckedChangeListener((compoundButton, b) -> fingerSelectionView.setFinger3Status(b));
        sF4.setOnCheckedChangeListener((compoundButton, b) -> fingerSelectionView.setFinger4Status(b));
        sF5.setOnCheckedChangeListener((compoundButton, b) -> fingerSelectionView.setFinger5Status(b));
    }
}