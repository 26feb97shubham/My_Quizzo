package com.example.my_quizzo.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class GothamTextView extends androidx.appcompat.widget.AppCompatTextView {
    public GothamTextView(Context context) {
        super(context);
        init();
    }

    public GothamTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public GothamTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }


    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/gotham-medium.ttf");
            setTypeface(tf);
        }
    }
}
