package org.thunderdog.challegram.p211v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p051db.AbstractC3937c;

public class CustomRecyclerView extends RecyclerView implements AbstractC3937c {
    public int f25718A1;
    public int f25719B1;
    public Runnable f25720C1;
    public int f25721D1 = -1;
    public int f25722E1;
    public AbstractC7921b f25723u1;
    public boolean f25724v1;
    public boolean f25725w1;
    public boolean f25726x1;
    public boolean f25727y1;
    public AbstractC7920a f25728z1;

    public interface AbstractC7920a {
        void mo14159a(CustomRecyclerView customRecyclerView, int i, int i2, int i3, int i4);
    }

    public interface AbstractC7921b {
        boolean mo14158a(CustomRecyclerView customRecyclerView, float f, float f2);
    }

    public CustomRecyclerView(Context context) {
        super(context);
    }

    public void m14164G1() {
        RecyclerView.AbstractC0902p layoutManager = getLayoutManager();
        if (layoutManager != null && (layoutManager instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int a2 = linearLayoutManager.m39546a2();
            for (int X1 = linearLayoutManager.m39549X1(); X1 <= a2; X1++) {
                View C = layoutManager.mo39262C(X1);
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

    public void m14163H1(int i) {
        View C = getLayoutManager().mo39262C(i);
        if (C != null) {
            C.invalidate();
        } else {
            getAdapter().m39312I(i);
        }
    }

    public void m14162I1() {
        if (this.f25721D1 != -1) {
            RecyclerView.AbstractC0902p layoutManager = getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).m39522z2(this.f25721D1, this.f25722E1);
            }
            this.f25721D1 = -1;
            this.f25722E1 = 0;
        }
    }

    public void m14161J1() {
        RecyclerView.AbstractC0902p layoutManager = getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            this.f25721D1 = -1;
            return;
        }
        int X1 = ((LinearLayoutManager) layoutManager).m39549X1();
        this.f25721D1 = X1;
        View C = layoutManager.mo39262C(X1);
        this.f25722E1 = C != null ? layoutManager.m39231U(C) : 0;
    }

    public void m14160K1(boolean z, boolean z2) {
        this.f25726x1 = z;
        this.f25727y1 = z2;
    }

    @Override
    public void mo8061R(View view, Runnable runnable) {
        this.f25720C1 = runnable;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f25726x1) {
            return this.f25727y1;
        }
        if (this.f25725w1) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    return false;
                }
                this.f25725w1 = false;
            }
            return true;
        } else if (this.f25723u1 == null || motionEvent.getAction() != 0 || this.f25723u1.mo14158a(this, motionEvent.getX(), motionEvent.getY())) {
            return super.onInterceptTouchEvent(motionEvent);
        } else {
            this.f25724v1 = true;
            return true;
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Runnable runnable = this.f25720C1;
        if (runnable != null) {
            runnable.run();
            this.f25720C1 = null;
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i3 = this.f25718A1;
        if (i3 != measuredWidth || this.f25719B1 != measuredHeight) {
            int i4 = this.f25719B1;
            this.f25718A1 = measuredWidth;
            this.f25719B1 = measuredHeight;
            AbstractC7920a aVar = this.f25728z1;
            if (aVar != null) {
                aVar.mo14159a(this, i3, i4, measuredWidth, measuredHeight);
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f25726x1) {
            return false;
        }
        if (this.f25725w1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f25725w1 = false;
            } else if (action != 1) {
                return false;
            } else {
                this.f25725w1 = false;
                return true;
            }
        }
        if (!this.f25724v1) {
            return super.onTouchEvent(motionEvent);
        }
        this.f25724v1 = false;
        return false;
    }

    public void setMeasureListener(AbstractC7920a aVar) {
        this.f25728z1 = aVar;
    }

    public void setScrollDisabled(boolean z) {
        this.f25726x1 = z;
        this.f25727y1 = true;
    }

    public void setTouchInterceptor(AbstractC7921b bVar) {
        this.f25723u1 = bVar;
    }

    public CustomRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
