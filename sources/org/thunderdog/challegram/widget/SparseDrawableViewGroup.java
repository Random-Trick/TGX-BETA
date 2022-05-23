package org.thunderdog.challegram.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import ie.s;
import ie.t;
import k0.h;

public abstract class SparseDrawableViewGroup extends ViewGroup implements t {
    public SparseDrawableViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override
    public Drawable Z(int i10, int i11) {
        return s.a(this, i10, i11);
    }

    @Override
    public h<Drawable> getSparseDrawableHolder() {
        return null;
    }

    @Override
    public Resources getSparseDrawableResources() {
        return null;
    }

    public SparseDrawableViewGroup(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
