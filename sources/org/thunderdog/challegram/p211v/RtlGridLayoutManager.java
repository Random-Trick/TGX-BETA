package org.thunderdog.challegram.p211v;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import p082fd.C4403w;

public class RtlGridLayoutManager extends GridLayoutManager {
    public boolean f25766R;

    public RtlGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public RtlGridLayoutManager m14124g3(boolean z) {
        this.f25766R = z;
        return this;
    }

    @Override
    public final boolean mo14123n2() {
        return !this.f25766R && C4403w.m27984G2();
    }

    public RtlGridLayoutManager(Context context, int i) {
        super(context, i);
    }
}
