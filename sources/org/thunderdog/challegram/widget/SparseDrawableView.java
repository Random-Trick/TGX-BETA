package org.thunderdog.challegram.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import ie.s;
import ie.t;
import k0.h;

public class SparseDrawableView extends View implements t {
    public h<Drawable> f20218a;

    public SparseDrawableView(Context context) {
        super(context);
    }

    @Override
    public Drawable Z(int i10, int i11) {
        return s.a(this, i10, i11);
    }

    @Override
    public final h<Drawable> getSparseDrawableHolder() {
        h<Drawable> hVar = this.f20218a;
        if (hVar != null) {
            return hVar;
        }
        h<Drawable> hVar2 = new h<>();
        this.f20218a = hVar2;
        return hVar2;
    }

    @Override
    public final Resources getSparseDrawableResources() {
        return getResources();
    }

    public SparseDrawableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SparseDrawableView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
