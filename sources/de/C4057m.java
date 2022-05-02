package de;

import android.content.Context;
import android.view.View;
import p108hb.C5064d;

public class C4057m extends View {
    public float f13679a = 1.0f;

    public C4057m(Context context) {
        super(context);
        setBackgroundColor(C5064d.m24130b(178, 0));
    }

    public void setFadeFactor(float f) {
        if (this.f13679a != f) {
            this.f13679a = f;
            setAlpha(f);
        }
    }
}
