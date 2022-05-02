package org.thunderdog.challegram.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import p111he.AbstractC5143t;
import p111he.C5141s;
import p143k0.C6038h;

public abstract class SparseDrawableViewGroup extends ViewGroup implements AbstractC5143t {
    public SparseDrawableViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override
    public Drawable mo14041X(int i, int i2) {
        return C5141s.m23834a(this, i, i2);
    }

    @Override
    public C6038h<Drawable> getSparseDrawableHolder() {
        return null;
    }

    @Override
    public Resources getSparseDrawableResources() {
        return null;
    }

    public SparseDrawableViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
