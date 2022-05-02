package org.thunderdog.challegram.p211v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MediaRecyclerView extends RecyclerView {
    public AbstractC7925b f25732u1;
    public boolean f25733v1;

    public class C7924a extends RecyclerView.AbstractC0910t {
        public C7924a() {
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            MediaRecyclerView.this.setScrollbarsVisible(((LinearLayoutManager) MediaRecyclerView.this.getLayoutManager()).m39549X1() != 0);
        }
    }

    public interface AbstractC7925b {
        void mo14148a(MediaRecyclerView mediaRecyclerView, int i, int i2);
    }

    public MediaRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m14149H1();
    }

    public void setScrollbarsVisible(boolean z) {
        if (this.f25733v1 != z) {
            this.f25733v1 = z;
            setVerticalScrollBarEnabled(z);
            if (z) {
                awakenScrollBars();
            }
        }
    }

    public final void m14149H1() {
        setVerticalScrollBarEnabled(false);
        m39422k(new C7924a());
    }

    @Override
    public int getVerticalScrollbarPosition() {
        View C;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        if (linearLayoutManager.m39553T1() != 0 || (C = linearLayoutManager.mo39262C(0)) == null) {
            return super.getVerticalScrollbarPosition();
        }
        return Math.max(super.getVerticalScrollbarPosition(), C.getTop());
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f25732u1 != null && Math.max(getMeasuredWidth(), getMeasuredHeight()) > 0) {
            this.f25732u1.mo14148a(this, getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setMeasureCallback(AbstractC7925b bVar) {
        this.f25732u1 = bVar;
    }

    public MediaRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m14149H1();
    }
}
