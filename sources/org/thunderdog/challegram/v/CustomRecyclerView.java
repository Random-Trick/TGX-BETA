package org.thunderdog.challegram.v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import eb.c;

public class CustomRecyclerView extends RecyclerView implements c {
    public int A1;
    public Runnable B1;
    public int C1 = -1;
    public int D1;
    public b f20150t1;
    public boolean f20151u1;
    public boolean f20152v1;
    public boolean f20153w1;
    public boolean f20154x1;
    public a f20155y1;
    public int f20156z1;

    public interface a {
        void a(CustomRecyclerView customRecyclerView, int i10, int i11, int i12, int i13);
    }

    public interface b {
        boolean a(CustomRecyclerView customRecyclerView, float f10, float f11);
    }

    public CustomRecyclerView(Context context) {
        super(context);
    }

    public void F1() {
        RecyclerView.p layoutManager = getLayoutManager();
        if (layoutManager != null && (layoutManager instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int a22 = linearLayoutManager.a2();
            for (int X1 = linearLayoutManager.X1(); X1 <= a22; X1++) {
                View C = layoutManager.C(X1);
                if (C != null) {
                    C.invalidate();
                }
            }
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null) {
                childAt.invalidate();
            }
        }
    }

    public void G1(int i10) {
        View C = getLayoutManager().C(i10);
        if (C != null) {
            C.invalidate();
        } else {
            getAdapter().I(i10);
        }
    }

    public void H1() {
        if (this.C1 != -1) {
            RecyclerView.p layoutManager = getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).z2(this.C1, this.D1);
            }
            this.C1 = -1;
            this.D1 = 0;
        }
    }

    public void I1() {
        RecyclerView.p layoutManager = getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            this.C1 = -1;
            return;
        }
        int X1 = ((LinearLayoutManager) layoutManager).X1();
        this.C1 = X1;
        View C = layoutManager.C(X1);
        this.D1 = C != null ? layoutManager.U(C) : 0;
    }

    public void J1(boolean z10, boolean z11) {
        this.f20153w1 = z10;
        this.f20154x1 = z11;
    }

    @Override
    public void S(View view, Runnable runnable) {
        this.B1 = runnable;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f20153w1) {
            return this.f20154x1;
        }
        if (this.f20152v1) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    return false;
                }
                this.f20152v1 = false;
            }
            return true;
        } else if (this.f20150t1 == null || motionEvent.getAction() != 0 || this.f20150t1.a(this, motionEvent.getX(), motionEvent.getY())) {
            return super.onInterceptTouchEvent(motionEvent);
        } else {
            this.f20151u1 = true;
            return true;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Runnable runnable = this.B1;
        if (runnable != null) {
            runnable.run();
            this.B1 = null;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i12 = this.f20156z1;
        if (i12 != measuredWidth || this.A1 != measuredHeight) {
            int i13 = this.A1;
            this.f20156z1 = measuredWidth;
            this.A1 = measuredHeight;
            a aVar = this.f20155y1;
            if (aVar != null) {
                aVar.a(this, i12, i13, measuredWidth, measuredHeight);
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f20153w1) {
            return false;
        }
        if (this.f20152v1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f20152v1 = false;
            } else if (action != 1) {
                return false;
            } else {
                this.f20152v1 = false;
                return true;
            }
        }
        if (!this.f20151u1) {
            return super.onTouchEvent(motionEvent);
        }
        this.f20151u1 = false;
        return false;
    }

    public void setMeasureListener(a aVar) {
        this.f20155y1 = aVar;
    }

    public void setScrollDisabled(boolean z10) {
        this.f20153w1 = z10;
        this.f20154x1 = true;
    }

    public void setTouchInterceptor(b bVar) {
        this.f20150t1 = bVar;
    }

    public CustomRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
