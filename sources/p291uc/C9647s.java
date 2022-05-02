package p291uc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import be.C1357a0;
import be.C1374h;
import be.C1379j0;
import be.C1410y;
import ge.C4868i;
import p080fb.C4335b;
import p080fb.C4336c;
import p108hb.C5070i;
import p110hd.C5078d;
import p110hd.C5088i;

public class C9647s extends View implements C4336c.AbstractC4337a {
    public View.OnClickListener f31292M;
    public String f31293N;
    public String f31294O;
    public String[] f31295P;
    public String f31296Q;
    public int f31297R;
    public C5088i f31298S;
    public ViewParent f31299T;
    public final C4336c f31300a = new C4336c(this);
    public final C9639r f31301b;
    public boolean f31302c;

    public C9647s(Context context, C9639r rVar) {
        super(context);
        this.f31301b = rVar;
    }

    private void setDrawable(C5088i iVar) {
        if (this.f31298S != iVar) {
            this.f31298S = iVar;
            invalidate();
        }
    }

    private void setInLongPress(boolean z) {
        if (z) {
            setPressed(false);
            this.f31302c = false;
            this.f31299T = getParent();
        }
        ViewParent viewParent = this.f31299T;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override
    public boolean mo7429B(float f, float f2) {
        C9639r rVar;
        return (this.f31297R == 0 || (rVar = this.f31301b) == null || !rVar.m7948d()) ? false : true;
    }

    @Override
    public void mo7428C(View view, float f, float f2) {
        View.OnClickListener onClickListener = this.f31292M;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override
    public void mo7427F(View view, float f, float f2) {
        setInLongPress(false);
        this.f31301b.m7942j(view);
    }

    @Override
    public boolean mo7426K4() {
        return C4335b.m28261a(this);
    }

    @Override
    public boolean mo7425W6(float f, float f2) {
        return C4335b.m28259c(this, f, f2);
    }

    @Override
    public void mo7424Z4(View view, float f, float f2) {
        C4335b.m28256f(this, view, f, f2);
    }

    public boolean m7916a(String str, String str2, String[] strArr) {
        if (!C5070i.m24067c(this.f31293N, str)) {
            return false;
        }
        m7913d(str, str2, strArr);
        return true;
    }

    public void m7915b() {
        String g = this.f31301b.m7945g();
        String i = this.f31301b.m7943i();
        String[] h = this.f31301b.m7944h();
        if (this.f31301b.m7939m()) {
            if (this.f31301b.m7938n()) {
                C4868i.m24726c2().m24582u2(64L);
            }
            C5078d.m23986z().m24015R(i);
        } else {
            C5078d.m23986z().m24016Q(g, i, h);
            View.OnClickListener onClickListener = this.f31292M;
            if (onClickListener != null) {
                onClickListener.onClick(this);
            }
        }
        setInLongPress(false);
        this.f31301b.m7942j(this);
    }

    public void m7914c(String str, int i) {
        if (!C5070i.m24067c(this.f31293N, str)) {
            this.f31293N = str;
            this.f31297R = i;
            String[] strArr = null;
            this.f31294O = i != 0 ? C5078d.m23986z().m24012U(str) : null;
            if (i == 2) {
                strArr = C5078d.m23986z().m24027F(str);
            }
            this.f31295P = strArr;
            m7913d(str, this.f31294O, strArr);
        }
    }

    public final void m7913d(String str, String str2, String[] strArr) {
        String d = C1374h.m37380i().m37385d(str, str2, strArr);
        if (!C5070i.m24067c(this.f31296Q, d)) {
            this.f31296Q = d;
            this.f31294O = str2;
            this.f31295P = strArr;
            setDrawable(C5078d.m23986z().m23995q(d));
        }
    }

    @Override
    public void mo7419f3(View view, float f, float f2) {
        C4335b.m28257e(this, view, f, f2);
    }

    public String getEmojiColored() {
        return this.f31296Q;
    }

    @Override
    public long getLongPressDuration() {
        return C4335b.m28260b(this);
    }

    public String getRawEmoji() {
        return this.f31293N;
    }

    @Override
    public boolean mo7418n0(View view, float f, float f2) {
        return this.f31292M != null;
    }

    @Override
    public void mo7417o2(View view, float f, float f2) {
        C4335b.m28255g(this, view, f, f2);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f31298S != null) {
            int i = measuredWidth / 2;
            int i2 = measuredHeight / 2;
            int min = Math.min(measuredWidth, measuredHeight) - C1357a0.m37541i(16.0f);
            Rect Z = C1410y.m37052Z();
            int i3 = min / 2;
            int i4 = i - i3;
            Z.left = i4;
            int i5 = i2 - i3;
            Z.top = i5;
            Z.right = i4 + min;
            Z.bottom = i5 + min;
            C5078d.m23986z().m24001k(canvas, this.f31298S, Z);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f31302c = super.onTouchEvent(motionEvent);
        } else if (this.f31302c) {
            super.onTouchEvent(motionEvent);
        }
        return isEnabled() && this.f31300a.m28246e(this, motionEvent);
    }

    @Override
    public void mo7416p(View view, float f, float f2) {
        if (view == this) {
            m7915b();
            return;
        }
        throw new AssertionError();
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f31292M = onClickListener;
    }

    @Override
    public boolean mo7415z4(View view, float f, float f2) {
        if (this.f31297R == 0) {
            return false;
        }
        C1379j0.m37321k(view, false);
        setInLongPress(true);
        return this.f31301b.m7936p(view, f, f2, this.f31293N, this.f31297R, this.f31294O, this.f31295P);
    }

    @Override
    public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        this.f31301b.m7934r(view, motionEvent, f, f2);
    }
}
