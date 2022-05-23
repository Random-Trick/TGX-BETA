package vc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import ce.a0;
import ce.h;
import ce.j0;
import ce.y;
import gb.b;
import gb.c;
import id.d;
import id.i;

public class r extends View implements c.a {
    public View.OnClickListener M;
    public String N;
    public String O;
    public String[] P;
    public String Q;
    public int R;
    public i S;
    public ViewParent T;
    public final c f25192a = new c(this);
    public final q f25193b;
    public boolean f25194c;

    public r(Context context, q qVar) {
        super(context);
        this.f25193b = qVar;
    }

    private void setDrawable(i iVar) {
        if (this.S != iVar) {
            this.S = iVar;
            invalidate();
        }
    }

    private void setInLongPress(boolean z10) {
        if (z10) {
            setPressed(false);
            this.f25194c = false;
            this.T = getParent();
        }
        ViewParent viewParent = this.T;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    @Override
    public boolean B(float f10, float f11) {
        q qVar;
        return (this.R == 0 || (qVar = this.f25193b) == null || !qVar.d()) ? false : true;
    }

    @Override
    public void C(View view, float f10, float f11) {
        View.OnClickListener onClickListener = this.M;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override
    public boolean E4() {
        return b.a(this);
    }

    @Override
    public void G(View view, float f10, float f11) {
        setInLongPress(false);
        this.f25193b.j(view);
    }

    @Override
    public void U2(View view, float f10, float f11) {
        b.e(this, view, f10, f11);
    }

    @Override
    public void U4(View view, float f10, float f11) {
        b.f(this, view, f10, f11);
    }

    @Override
    public boolean X6(float f10, float f11) {
        return b.c(this, f10, f11);
    }

    public boolean a(String str, String str2, String[] strArr) {
        if (!ib.i.c(this.N, str)) {
            return false;
        }
        d(str, str2, strArr);
        return true;
    }

    public void b() {
        String g10 = this.f25193b.g();
        String i10 = this.f25193b.i();
        String[] h10 = this.f25193b.h();
        if (this.f25193b.m()) {
            if (this.f25193b.n()) {
                he.i.c2().u2(64L);
            }
            d.z().R(i10);
        } else {
            d.z().Q(g10, i10, h10);
            View.OnClickListener onClickListener = this.M;
            if (onClickListener != null) {
                onClickListener.onClick(this);
            }
        }
        setInLongPress(false);
        this.f25193b.j(this);
    }

    public void c(String str, int i10) {
        if (!ib.i.c(this.N, str)) {
            this.N = str;
            this.R = i10;
            String[] strArr = null;
            this.O = i10 != 0 ? d.z().U(str) : null;
            if (i10 == 2) {
                strArr = d.z().F(str);
            }
            this.P = strArr;
            d(str, this.O, strArr);
        }
    }

    public final void d(String str, String str2, String[] strArr) {
        String d10 = h.i().d(str, str2, strArr);
        if (!ib.i.c(this.Q, d10)) {
            this.Q = d10;
            this.O = str2;
            this.P = strArr;
            setDrawable(d.z().q(d10));
        }
    }

    public String getEmojiColored() {
        return this.Q;
    }

    @Override
    public long getLongPressDuration() {
        return b.b(this);
    }

    public String getRawEmoji() {
        return this.N;
    }

    @Override
    public boolean m0(View view, float f10, float f11) {
        return this.M != null;
    }

    @Override
    public void o(View view, float f10, float f11) {
        if (view == this) {
            b();
            return;
        }
        throw new AssertionError();
    }

    @Override
    public void o2(View view, float f10, float f11) {
        b.g(this, view, f10, f11);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.S != null) {
            int i10 = measuredWidth / 2;
            int i11 = measuredHeight / 2;
            int min = Math.min(measuredWidth, measuredHeight) - a0.i(16.0f);
            Rect Z = y.Z();
            int i12 = min / 2;
            int i13 = i10 - i12;
            Z.left = i13;
            int i14 = i11 - i12;
            Z.top = i14;
            Z.right = i13 + min;
            Z.bottom = i14 + min;
            d.z().k(canvas, this.S, Z);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i10);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f25194c = super.onTouchEvent(motionEvent);
        } else if (this.f25194c) {
            super.onTouchEvent(motionEvent);
        }
        return isEnabled() && this.f25192a.e(this, motionEvent);
    }

    @Override
    public boolean s4(View view, float f10, float f11) {
        if (this.R == 0) {
            return false;
        }
        j0.k(view, false);
        setInLongPress(true);
        return this.f25193b.p(view, f10, f11, this.N, this.R, this.O, this.P);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.M = onClickListener;
    }

    @Override
    public void z6(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        this.f25193b.r(view, motionEvent, f10, f11);
    }
}
