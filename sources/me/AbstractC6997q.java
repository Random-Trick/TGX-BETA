package me;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import p082fd.C4403w;

public abstract class AbstractC6997q extends RecyclerView.AbstractC0901o {
    @Override
    public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
        int l = mo18128l();
        int k0 = recyclerView.m39421k0(view);
        if (l == 0 || k0 == -1) {
            rect.right = 0;
            rect.left = 0;
            return;
        }
        int measuredWidth = recyclerView.getMeasuredWidth() - (C1357a0.m37541i(72.0f) * l);
        if (measuredWidth <= 0) {
            rect.right = 0;
            rect.left = 0;
            return;
        }
        int i = measuredWidth / (l + 2);
        if (k0 == 0) {
            i += i / 2;
        }
        if (C4403w.m27984G2()) {
            rect.right = i;
            rect.left = 0;
            return;
        }
        rect.left = i;
        rect.right = 0;
    }

    public abstract int mo18128l();
}
