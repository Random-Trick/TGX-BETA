package org.thunderdog.challegram.v;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import gd.w;

public class RtlGridLayoutManager extends GridLayoutManager {
    public boolean Q;

    public RtlGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public RtlGridLayoutManager g3(boolean z10) {
        this.Q = z10;
        return this;
    }

    @Override
    public final boolean n2() {
        return !this.Q && w.G2();
    }

    public RtlGridLayoutManager(Context context, int i10) {
        super(context, i10);
    }
}
