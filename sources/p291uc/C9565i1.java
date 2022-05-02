package p291uc;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import be.C1379j0;
import gd.AbstractC4761s4;
import me.AbstractC6828a;
import org.thunderdog.challegram.Log;
import p037cb.C2065g;
import p139jb.AbstractC5911c;
import p291uc.C9678w2;
import p335xd.C10192g;
import td.AbstractC9323v4;

@TargetApi(16)
public class C9565i1 extends ViewGroup implements AbstractC5911c, AbstractC6828a, C9678w2.AbstractC9685g {
    public C9634q0 f31012M;
    public float f31013N;
    public float f31014O;
    public final Rect f31015P = new Rect();
    public C9552h1 f31016a;
    public C9678w2 f31017b;
    public C9500a4 f31018c;

    public static class C9566a extends Drawable {
        public final C9552h1 f31019a;

        public C9566a(C9552h1 h1Var) {
            this.f31019a = h1Var;
        }

        @Override
        public void draw(Canvas canvas) {
            AbstractC4761s4 message = this.f31019a.getMessage();
            if (message != null) {
                message.m26044U0(this.f31019a, canvas);
            }
        }

        @Override
        public int getOpacity() {
            return 0;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public C9565i1(Context context) {
        super(context);
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
    }

    public void m8230a(C9552h1 h1Var, C9678w2 w2Var, AbstractC9323v4<?> v4Var) {
        this.f31016a = h1Var;
        h1Var.setCustomMeasureDisabled(true);
        h1Var.setParentMessageViewGroup(this);
        h1Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(h1Var);
        this.f31017b = w2Var;
        C2065g.m35718d(this, new C9566a(h1Var));
        C9500a4 a4Var = new C9500a4(getContext());
        this.f31018c = a4Var;
        C10192g.m5783h(a4Var, h1Var, true);
        addView(this.f31018c);
        C9634q0 a = new C9634q0(getContext()).m7952a(h1Var);
        this.f31012M = a;
        a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        C10192g.m5783h(this.f31012M, this.f31018c, true);
        addView(this.f31012M);
        if (v4Var != null) {
            v4Var.m9163t8(this.f31012M);
        }
    }

    @Override
    public void mo4501a3() {
        this.f31016a.mo4501a3();
        this.f31018c.mo4501a3();
    }

    @Override
    public void mo8229b() {
        this.f31016a.m8321x0();
        this.f31018c.mo8229b();
    }

    public void m8228c(AbstractC4761s4 s4Var) {
        m8227d(s4Var);
    }

    public final void m8227d(AbstractC4761s4 s4Var) {
        this.f31018c.m8465D1(s4Var);
    }

    public final void m8226e() {
        this.f31018c.setTranslationX(this.f31013N + this.f31014O);
        AbstractC4761s4 message = this.f31016a.getMessage();
        C1379j0.m37307r(getContext()).m14523X0().m7279J0(message.m26145K2(), message.m26115N3());
    }

    @Override
    public void mo8225f() {
        this.f31016a.m8323w0();
        this.f31018c.mo8225f();
    }

    @Override
    public AbstractC4761s4 getMessage() {
        return this.f31016a.getMessage();
    }

    public C9552h1 getMessageView() {
        return this.f31016a;
    }

    public C9634q0 getOverlayView() {
        return this.f31012M;
    }

    public ViewGroup getVideoPlayerView() {
        return this.f31018c;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int childCount = getChildCount();
        AbstractC4761s4 message = this.f31016a.getMessage();
        if (message != null) {
            i6 = message.m26127M2();
            i5 = message.m26116N2();
            i8 = message.m26105O2();
            i7 = message.m26136L2();
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i8 = 0;
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int i10 = layoutParams.width == -2 ? i6 : 0;
                int i11 = layoutParams.height == -2 ? i5 : 0;
                childAt.layout(i10, i11, childAt.getMeasuredWidth() + i10, childAt.getMeasuredHeight() + i11);
            }
        }
        Rect rect = this.f31015P;
        if (!(rect.left == i6 && rect.top == i5 && rect.right == i8 && rect.bottom == i7)) {
            rect.set(i6, i5, i8, i7);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size == 0) {
            measureChildren(i, i2);
            return;
        }
        AbstractC4761s4 message = this.f31016a.getMessage();
        if (message != null) {
            message.m25934g0(size);
        }
        setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(this.f31016a.getCurrentHeight(), Log.TAG_TDLIB_OPTIONS));
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int i4 = layoutParams.width;
                if (i4 == -2) {
                    i4 = message != null ? message.m26105O2() : 0;
                } else if (i4 == -1) {
                    i4 = getMeasuredWidth();
                }
                int i5 = layoutParams.height;
                if (i5 == -2) {
                    i5 = message != null ? message.m26136L2() : 0;
                } else if (i5 == -1) {
                    i5 = getMeasuredHeight();
                }
                childAt.getMeasuredWidth();
                childAt.getMeasuredHeight();
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(i5, Log.TAG_TDLIB_OPTIONS));
            }
        }
    }

    public void setMessage(AbstractC4761s4 s4Var) {
        this.f31016a.setMessage(s4Var);
        this.f31012M.setMessage(s4Var);
        m8227d(s4Var);
        if (getMeasuredHeight() != this.f31016a.getCurrentHeight()) {
            requestLayout();
        }
    }

    public final void setSelectableTranslation(float f) {
        if (this.f31014O != f && this.f31017b.m7615x3()) {
            this.f31014O = f;
            m8226e();
        }
    }

    public void setSwipeTranslation(float f) {
        if (this.f31013N != f) {
            this.f31013N = f;
            m8226e();
        }
    }
}
