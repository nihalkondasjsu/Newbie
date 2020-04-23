package com.gkv.newbie.ui.textview;

import android.content.Context;
import android.util.AttributeSet;

public class StylishText extends TypefaceTextView{

    private static final String FONT_NAME = "ralewaym.ttf" ;

    public StylishText(Context context) {
        super(context, FONT_NAME);
    }

    public StylishText(Context context, AttributeSet attrs) {
        super(context, attrs, FONT_NAME);
    }

    public StylishText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle, FONT_NAME);
    }
}