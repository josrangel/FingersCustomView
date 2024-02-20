package com.josrangel.fingerscustomview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

public class FingerSelectionView  extends ConstraintLayout {

    private ImageView ivFinger1;
    private ImageView ivFinger2;
    private ImageView ivFinger3;
    private ImageView ivFinger4;
    private ImageView ivFinger5;

    public FingerSelectionView(@NonNull Context context) {
        super(context);
        this.initView();
    }

    public FingerSelectionView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.initView();
    }

    public void initView() {
        LayoutInflater.from(getContext())
                .inflate(R.layout.widget_finger_selection_view, this, true);
        ivFinger1 = findViewById(R.id.iv_finger_1);
        ivFinger2 = findViewById(R.id.iv_finger_2);
        ivFinger3 = findViewById(R.id.iv_finger_3);
        ivFinger4 = findViewById(R.id.iv_finger_4);
        ivFinger5 = findViewById(R.id.iv_finger_5);
        setFinger1Status(false);
        setFinger2Status(false);
        setFinger3Status(false);
        setFinger4Status(false);
        setFinger5Status(false);
    }

    public void setFinger1Status(boolean isEnable) {
        ivFinger1.setVisibility(isEnable ? VISIBLE : INVISIBLE);
        refreshView();
    }

    public void setFinger2Status(boolean isEnable) {
        ivFinger2.setVisibility(isEnable ? VISIBLE : INVISIBLE);
        refreshView();
    }

    public void setFinger3Status(boolean isEnable) {
        ivFinger3.setVisibility(isEnable ? VISIBLE : INVISIBLE);
        refreshView();
    }

    public void setFinger4Status(boolean isEnable) {
        ivFinger4.setVisibility(isEnable ? VISIBLE : INVISIBLE);
        refreshView();
    }

    public void setFinger5Status(boolean isEnable) {
        ivFinger5.setVisibility(isEnable ? VISIBLE : INVISIBLE);
        refreshView();
    }
    public void refreshView() {
        invalidate();
        requestLayout();
    }
}
