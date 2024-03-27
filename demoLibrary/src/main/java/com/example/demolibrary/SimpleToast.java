package com.example.demolibrary;

import android.content.Context;
import android.widget.Toast;

public class SimpleToast {

    public void shortToast(Context c, String s){
        Toast.makeText(c, s, Toast.LENGTH_SHORT).show();
    }

    public void longToast(Context c, String s){
        Toast.makeText(c, s, Toast.LENGTH_LONG).show();
    }

}
