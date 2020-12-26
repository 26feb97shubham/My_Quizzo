package com.example.my_quizzo.widgets;

import android.content.Context;
import android.util.AttributeSet;

public class GothamButtonView extends GothamTextView {
    private Object object;
    public GothamButtonView(Context context) {
        super(context);
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public GothamButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);
//		init();
    }

    public GothamButtonView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
//		init();
    }
}
