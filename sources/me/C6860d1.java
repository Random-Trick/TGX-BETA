package me;

import android.content.Context;
import be.C1389o;
import p364zd.C11524j;

public class C6860d1 extends C6847b2 {
    public int f21552a;

    public C6860d1(Context context) {
        super(context);
        setTextColor(C11524j.m215T0());
        setTypeface(C1389o.m37261k());
        setTextSize(1, 16.0f);
        setGravity(17);
    }

    @Override
    public void setTextColor(int i) {
        this.f21552a = i;
        super.setTextColor(i);
    }

    public void setTextColorIfNeeded(int i) {
        if (this.f21552a != i) {
            this.f21552a = i;
            super.setTextColor(i);
        }
    }
}
