package vc;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ce.j0;
import db.g;
import hd.s4;
import kb.c;
import org.thunderdog.challegram.Log;
import ud.v4;
import vc.v2;

@TargetApi(16)
public class h1 extends ViewGroup implements c, ne.a, v2.g {
    public p0 M;
    public float N;
    public float O;
    public final Rect P = new Rect();
    public g1 f24992a;
    public v2 f24993b;
    public z3 f24994c;

    public static class a extends Drawable {
        public final g1 f24995a;

        public a(g1 g1Var) {
            this.f24995a = g1Var;
        }

        @Override
        public void draw(Canvas canvas) {
            s4 message = this.f24995a.getMessage();
            if (message != null) {
                message.U0(this.f24995a, canvas);
            }
        }

        @Override
        public int getOpacity() {
            return 0;
        }

        @Override
        public void setAlpha(int i10) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public h1(Context context) {
        super(context);
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
    }

    @Override
    public void Q2() {
        this.f24992a.Q2();
        this.f24994c.Q2();
    }

    public void a(g1 g1Var, v2 v2Var, v4<?> v4Var) {
        this.f24992a = g1Var;
        g1Var.setCustomMeasureDisabled(true);
        g1Var.setParentMessageViewGroup(this);
        g1Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(g1Var);
        this.f24993b = v2Var;
        g.d(this, new a(g1Var));
        z3 z3Var = new z3(getContext());
        this.f24994c = z3Var;
        yd.g.h(z3Var, g1Var, true);
        addView(this.f24994c);
        p0 a10 = new p0(getContext()).a(g1Var);
        this.M = a10;
        a10.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        yd.g.h(this.M, this.f24994c, true);
        addView(this.M);
        if (v4Var != null) {
            v4Var.t8(this.M);
        }
    }

    @Override
    public void b() {
        this.f24992a.B0();
        this.f24994c.b();
    }

    public void c(s4 s4Var) {
        d(s4Var);
    }

    public final void d(s4 s4Var) {
        this.f24994c.A1(s4Var);
    }

    @Override
    public void e() {
        this.f24992a.y0();
        this.f24994c.e();
    }

    public final void f() {
        this.f24994c.setTranslationX(this.N + this.O);
        s4 message = this.f24992a.getMessage();
        j0.r(getContext()).a1().i1(message.I2(), message.K3());
    }

    @Override
    public s4 getMessage() {
        return this.f24992a.getMessage();
    }

    public g1 getMessageView() {
        return this.f24992a;
    }

    public p0 getOverlayView() {
        return this.M;
    }

    public ViewGroup getVideoPlayerView() {
        return this.f24994c;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int childCount = getChildCount();
        s4 message = this.f24992a.getMessage();
        if (message != null) {
            i15 = message.K2();
            i14 = message.L2();
            i17 = message.M2();
            i16 = message.J2();
        } else {
            i16 = 0;
            i15 = 0;
            i14 = 0;
            i17 = 0;
        }
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int i19 = layoutParams.width == -2 ? i15 : 0;
                int i20 = layoutParams.height == -2 ? i14 : 0;
                childAt.layout(i19, i20, childAt.getMeasuredWidth() + i19, childAt.getMeasuredHeight() + i20);
            }
        }
        Rect rect = this.P;
        if (!(rect.left == i15 && rect.top == i14 && rect.right == i17 && rect.bottom == i16)) {
            rect.set(i15, i14, i17, i16);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        if (size == 0) {
            measureChildren(i10, i11);
            return;
        }
        s4 message = this.f24992a.getMessage();
        if (message != null) {
            message.h0(size);
        }
        setMeasuredDimension(i10, View.MeasureSpec.makeMeasureSpec(this.f24992a.getCurrentHeight(), Log.TAG_TDLIB_OPTIONS));
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int i13 = layoutParams.width;
                if (i13 == -2) {
                    i13 = message != null ? message.M2() : 0;
                } else if (i13 == -1) {
                    i13 = getMeasuredWidth();
                }
                int i14 = layoutParams.height;
                if (i14 == -2) {
                    i14 = message != null ? message.J2() : 0;
                } else if (i14 == -1) {
                    i14 = getMeasuredHeight();
                }
                childAt.getMeasuredWidth();
                childAt.getMeasuredHeight();
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i13, Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(i14, Log.TAG_TDLIB_OPTIONS));
            }
        }
    }

    public void setMessage(s4 s4Var) {
        this.f24992a.setMessage(s4Var);
        this.M.setMessage(s4Var);
        d(s4Var);
        if (getMeasuredHeight() != this.f24992a.getCurrentHeight()) {
            requestLayout();
        }
    }

    public final void setSelectableTranslation(float f10) {
        if (this.O != f10 && this.f24993b.x3()) {
            this.O = f10;
            f();
        }
    }

    public void setSwipeTranslation(float f10) {
        if (this.N != f10) {
            this.N = f10;
            f();
        }
    }
}
