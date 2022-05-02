package org.thunderdog.challegram.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import p111he.AbstractC5143t;
import p111he.C5141s;
import p143k0.C6038h;

public class SparseDrawableView extends View implements AbstractC5143t {
    public C6038h<Drawable> f25813a;

    public SparseDrawableView(Context context) {
        super(context);
    }

    @Override
    public Drawable mo14041X(int i, int i2) {
        return C5141s.m23834a(this, i, i2);
    }

    @Override
    public final C6038h<Drawable> getSparseDrawableHolder() {
        C6038h<Drawable> hVar = this.f25813a;
        if (hVar != null) {
            return hVar;
        }
        C6038h<Drawable> hVar2 = new C6038h<>();
        this.f25813a = hVar2;
        return hVar2;
    }

    @Override
    public final Resources getSparseDrawableResources() {
        return getResources();
    }

    public SparseDrawableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SparseDrawableView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
