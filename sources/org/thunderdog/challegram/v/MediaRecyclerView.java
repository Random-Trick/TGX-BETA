package org.thunderdog.challegram.v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MediaRecyclerView extends RecyclerView {
    public b f20160t1;
    public boolean f20161u1;

    public class a extends RecyclerView.t {
        public a() {
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            MediaRecyclerView.this.setScrollbarsVisible(((LinearLayoutManager) MediaRecyclerView.this.getLayoutManager()).X1() != 0);
        }
    }

    public interface b {
        void a(MediaRecyclerView mediaRecyclerView, int i10, int i11);
    }

    public MediaRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        G1();
    }

    public void setScrollbarsVisible(boolean z10) {
        if (this.f20161u1 != z10) {
            this.f20161u1 = z10;
            setVerticalScrollBarEnabled(z10);
            if (z10) {
                awakenScrollBars();
            }
        }
    }

    public final void G1() {
        setVerticalScrollBarEnabled(false);
        k(new a());
    }

    @Override
    public int getVerticalScrollbarPosition() {
        View C;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        if (linearLayoutManager.T1() != 0 || (C = linearLayoutManager.C(0)) == null) {
            return super.getVerticalScrollbarPosition();
        }
        return Math.max(super.getVerticalScrollbarPosition(), C.getTop());
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f20160t1 != null && Math.max(getMeasuredWidth(), getMeasuredHeight()) > 0) {
            this.f20160t1.a(this, getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setMeasureCallback(b bVar) {
        this.f20160t1 = bVar;
    }

    public MediaRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        G1();
    }
}
