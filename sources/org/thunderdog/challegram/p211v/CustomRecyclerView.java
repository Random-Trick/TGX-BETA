package org.thunderdog.challegram.p211v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p051db.AbstractC3937c;

public class CustomRecyclerView extends RecyclerView implements AbstractC3937c {
    public int f25721A1;
    public int f25722B1;
    public Runnable f25723C1;
    public int f25724D1 = -1;
    public int f25725E1;
    public AbstractC7921b f25726u1;
    public boolean f25727v1;
    public boolean f25728w1;
    public boolean f25729x1;
    public boolean f25730y1;
    public AbstractC7920a f25731z1;

    public interface AbstractC7920a {
        void mo14158a(CustomRecyclerView customRecyclerView, int i, int i2, int i3, int i4);
    }

    public interface AbstractC7921b {
        boolean mo14157a(CustomRecyclerView customRecyclerView, float f, float f2);
    }

    public CustomRecyclerView(Context context) {
        super(context);
    }

    public void m14163G1() {
        RecyclerView.AbstractC0902p layoutManager = getLayoutManager();
        if (layoutManager != null && (layoutManager instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int a2 = linearLayoutManager.m39549a2();
            for (int X1 = linearLayoutManager.m39552X1(); X1 <= a2; X1++) {
                View C = layoutManager.mo39265C(X1);
                if (C != null) {
                    C.invalidate();
                }
            }
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                childAt.invalidate();
            }
        }
    }

    public void m14162H1(int i) {
        View C = getLayoutManager().mo39265C(i);
        if (C != null) {
            C.invalidate();
        } else {
            getAdapter().m39315I(i);
        }
    }

    public void m14161I1() {
        if (this.f25724D1 != -1) {
            RecyclerView.AbstractC0902p layoutManager = getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).m39525z2(this.f25724D1, this.f25725E1);
            }
            this.f25724D1 = -1;
            this.f25725E1 = 0;
        }
    }

    public void m14160J1() {
        RecyclerView.AbstractC0902p layoutManager = getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            this.f25724D1 = -1;
            return;
        }
        int X1 = ((LinearLayoutManager) layoutManager).m39552X1();
        this.f25724D1 = X1;
        View C = layoutManager.mo39265C(X1);
        this.f25725E1 = C != null ? layoutManager.m39234U(C) : 0;
    }

    public void m14159K1(boolean z, boolean z2) {
        this.f25729x1 = z;
        this.f25730y1 = z2;
    }

    @Override
    public void mo8061R(View view, Runnable runnable) {
        this.f25723C1 = runnable;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f25729x1) {
            return this.f25730y1;
        }
        if (this.f25728w1) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    return false;
                }
                this.f25728w1 = false;
            }
            return true;
        } else if (this.f25726u1 == null || motionEvent.getAction() != 0 || this.f25726u1.mo14157a(this, motionEvent.getX(), motionEvent.getY())) {
            return super.onInterceptTouchEvent(motionEvent);
        } else {
            this.f25727v1 = true;
            return true;
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Runnable runnable = this.f25723C1;
        if (runnable != null) {
            runnable.run();
            this.f25723C1 = null;
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i3 = this.f25721A1;
        if (i3 != measuredWidth || this.f25722B1 != measuredHeight) {
            int i4 = this.f25722B1;
            this.f25721A1 = measuredWidth;
            this.f25722B1 = measuredHeight;
            AbstractC7920a aVar = this.f25731z1;
            if (aVar != null) {
                aVar.mo14158a(this, i3, i4, measuredWidth, measuredHeight);
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f25729x1) {
            return false;
        }
        if (this.f25728w1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f25728w1 = false;
            } else if (action != 1) {
                return false;
            } else {
                this.f25728w1 = false;
                return true;
            }
        }
        if (!this.f25727v1) {
            return super.onTouchEvent(motionEvent);
        }
        this.f25727v1 = false;
        return false;
    }

    public void setMeasureListener(AbstractC7920a aVar) {
        this.f25731z1 = aVar;
    }

    public void setScrollDisabled(boolean z) {
        this.f25729x1 = z;
        this.f25730y1 = true;
    }

    public void setTouchInterceptor(AbstractC7921b bVar) {
        this.f25726u1 = bVar;
    }

    public CustomRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
