package com.example.my_quizzo.widgets;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.my_quizzo.QuizApp;

public class QuizAppMenuItem extends LinearLayout implements View.OnClickListener {

    private int id;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    private QuizApp quizApp;
    private Context mContext;

    // # Background Attributes
    private int mDefaultBackgroundColor 		= Color.BLACK;
    private int mFocusBackgroundColor 			= 0;

    // # Text Attributes
    private int mDefaultTextColor 				= Color.BLACK;

    private int mDefaultTextSize 				= 15;
    private String mText 						= null;

    // # Icon Attributes
    private Drawable mIconResource 				= null;
    private int  mFontIconSize 					= 15;
    private String mFontIcon 					= null;
    private int mIconPosition 					= 1;

    private int mBorderColor 					= Color.TRANSPARENT;
    private int mBorderWidth 					= 0;

    private int mRadius 						= 0;

    private Typeface mTextTypeFace = null;

    /**
     * Tags to identify the position of the icon
     */
    public static final int POSITION_LEFT  		= 1;
    public static final int POSITION_RIGHT  	= 2;
    public static final int POSITION_TOP  		= 3;
    public static final int POSITION_BOTTOM  	= 4;

    private String mDefaultTextFont = "gothambold1.ttf";

    private ImageView mIconView;
    private  TextView mFontIconView;
    private TextView mTextView;

    private TextView mDirtyTextView;

    private CharSequence isDirtyText = null;

   /* public QuizAppMenuItem(QuizApp quizApp, int id , int iconDrawable , String text) {
        this(quizApp , id, iconDrawable, text, quizApp.getConfig().getAThemeColor());
    }*/

    public QuizAppMenuItem(QuizApp quizApp, int id , int iconDrawable , String text , int bgColor) {
        super(quizApp.getContext());
        this.quizApp = quizApp;
        mContext =quizApp.getContext();
        setOnClickListener(this);
        init(id, text, bgColor);
    }


    public QuizAppMenuItem(Context context, int id , Integer backgroundColor , int iconDrawable , String text) {
        super(context);
        mContext =context;
        this.id = id;
        init(id, text, backgroundColor);

    }

    private void init(int id ,String text , int backgroundColor){
        this.id = id;
        //setText(text);
        setBackgroundColor(backgroundColor);
        //setFocusBackgroundColor(Color.parseColor("#bfe156"));
        //setTextSize(12);
        //setRadius(5);
        LayoutParams lParams = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        lParams.setMargins(5, 5, 5, 5);
        lParams.gravity = Gravity.CENTER_VERTICAL;
        this.setLayoutParams(lParams);
    }

    @Override
    public void onClick(View v) {

    }
}
