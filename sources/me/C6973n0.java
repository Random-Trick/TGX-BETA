package me;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import be.C1379j0;
import be.C1389o;
import gd.C4779t2;
import ie.AbstractC5408k;
import ie.AbstractC5411l0;
import ie.AbstractC5414n;
import ie.C5402h;
import ie.C5406j;
import ie.C5412m;
import ie.C5417o0;
import ie.C5455v0;
import ie.C5457w0;
import ie.RunnableC5390g;
import java.util.Iterator;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3955n;
import p051db.C3965r;
import p080fb.C4343h;
import p082fd.C4383l;
import p082fd.C4403w;
import p108hb.C5070i;
import p139jb.AbstractC5911c;
import p156kd.C6238b;
import p350yd.C10930q6;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p350yd.HandlerC10770jj;
import p364zd.AbstractC11531p;
import td.AbstractC9165c2;

public class C6973n0 extends View implements C11052v1.AbstractC11053a, AbstractC9165c2, AbstractC5414n, AbstractC6828a, AbstractC5911c {
    public AbstractC11531p f22076M;
    public final C10930q6 f22080Q;
    public String f22081R;
    public AbstractC5411l0[] f22082S;
    public int f22085V;
    public long f22088a0;
    public int f22090b0;
    public AbstractC6975b f22092c0;
    public AbstractC5408k f22093d0;
    public int f22087a = R.id.theme_color_text;
    public int f22089b = R.id.theme_color_textLink;
    public int f22091c = R.id.theme_color_textLinkPressHighlight;
    public final RunnableC5390g.AbstractC5393c f22077N = new C6974a();
    public int f22078O = 0;
    public int f22079P = -1;
    public final C3965r<RunnableC5390g> f22083T = new C3965r<>(new C3965r.AbstractC3966a() {
        @Override
        public final void mo7848a(C3965r rVar) {
            C6973n0.this.m18251q(rVar);
        }
    }, C2057b.f7280b, 180);
    public final C6238b f22086W = new C6238b(this);
    public C5457w0 f22084U = new C5457w0(new C1389o.C1390a(C1389o.m37258k(), C1389o.m37260i(), C1389o.m37261h(), null, C1389o.m37259j(), 0)).m22655m(15.0f);

    public class C6974a implements RunnableC5390g.AbstractC5393c {
        public C6974a() {
        }

        @Override
        public boolean mo18245A(String str) {
            return C5402h.m22840i(this, str);
        }

        @Override
        public boolean mo18244H5(String str) {
            return C5402h.m22836m(this, str);
        }

        @Override
        public boolean mo18243I3(String str) {
            return C5402h.m22841h(this, str);
        }

        @Override
        public boolean mo18242M(View view, RunnableC5390g gVar, C5455v0 v0Var, String str, boolean z) {
            return C5402h.m22843f(this, view, gVar, v0Var, str, z);
        }

        @Override
        public boolean mo18241P3(long j) {
            return C5402h.m22837l(this, j);
        }

        @Override
        public boolean mo18240S6(View view, String str) {
            return C5402h.m22845d(this, view, str);
        }

        @Override
        public TdApi.WebPage mo18239U2(String str) {
            return C5402h.m22848a(this, str);
        }

        @Override
        public boolean mo18238V4(String str) {
            return C5402h.m22842g(this, str);
        }

        @Override
        public AbstractC11531p mo18237W4(View view, RunnableC5390g gVar) {
            return C6973n0.this.f22076M;
        }

        @Override
        public boolean mo18236f5(String str) {
            return C5402h.m22844e(this, str);
        }

        @Override
        public boolean mo18235g0(View view, String str, boolean z, HandlerC10770jj.C10788q qVar) {
            return C5402h.m22838k(this, view, str, z, qVar);
        }

        @Override
        public boolean mo18234i0(View view, String str, String str2, HandlerC10770jj.C10788q qVar) {
            return C5402h.m22839j(this, view, str, str2, qVar);
        }

        @Override
        public boolean mo18233m2(String str) {
            return C5402h.m22847b(this, str);
        }
    }

    public interface AbstractC6975b {
        void mo18232a(C6973n0 n0Var, int i);
    }

    public C6973n0(Context context, C10930q6 q6Var) {
        super(context);
        this.f22080Q = q6Var;
        C11052v1.m1768b().m1769a(this);
    }

    private int getCurrentHeight() {
        if (this.f22083T == null) {
            return getPaddingTop() + getPaddingBottom();
        }
        int i = getLayoutParams() != null ? getLayoutParams().height : -2;
        if (i == -2) {
            return getPaddingTop() + Math.round(this.f22083T.m29465r().m29476j()) + getPaddingBottom();
        }
        return this.f22083T != null ? Math.max(getPaddingTop() + Math.round(this.f22083T.m29465r().m29476j()) + getPaddingBottom(), i) : i;
    }

    public void m18253o(long j, RunnableC5390g gVar, int i, boolean z) {
        if (this.f22088a0 == j) {
            m18249u(gVar, i, z);
        }
    }

    public void m18252p(String str, final int i, C5457w0 w0Var, int i2, int i3, AbstractC5411l0[] l0VarArr, final long j, final boolean z) {
        final RunnableC5390g gVar = new RunnableC5390g(str, i, w0Var, this, i2, (C4403w.m27984G2() ? Log.TAG_CRASH : 0) | 524376, RunnableC5390g.m22991I0(str, i3, l0VarArr, this.f22080Q, null));
        C1379j0.m37334d0(new Runnable() {
            @Override
            public final void run() {
                C6973n0.this.m18253o(j, gVar, i, z);
            }
        });
    }

    public void m18251q(C3965r rVar) {
        if (getMeasuredHeight() != getCurrentHeight()) {
            requestLayout();
        }
        invalidate();
    }

    @Override
    public int mo8941I() {
        return this.f22091c;
    }

    @Override
    public int mo8940N0() {
        return C5412m.m22768m(this);
    }

    @Override
    public int mo7858Q() {
        return C5406j.m22807d(this);
    }

    @Override
    public long mo7857X0(boolean z) {
        return C5406j.m22808c(this, z);
    }

    @Override
    public int mo8938Z0() {
        return C5412m.m22772i(this);
    }

    @Override
    public void mo4501a3() {
        this.f22086W.mo4501a3();
    }

    @Override
    public void mo8229b() {
        this.f22086W.m20994i();
    }

    @Override
    public int mo7856b1() {
        return C5412m.m22773h(this);
    }

    @Override
    public int mo7855c() {
        return C5412m.m22775f(this);
    }

    @Override
    public int mo7854e(boolean z) {
        return C5412m.m22779b(this, z);
    }

    @Override
    public void mo8225f() {
        this.f22086W.m21001b();
    }

    @Override
    public int mo7853g(boolean z) {
        return C5412m.m22770k(this, z);
    }

    @Override
    public void mo452g2() {
        invalidate();
    }

    public String getText() {
        return this.f22081R;
    }

    public final int m18257j() {
        return Math.max((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 0);
    }

    @Override
    public AbstractC11531p mo8937j1() {
        return C5412m.m22776e(this);
    }

    public final void m18256l() {
        long j = this.f22088a0;
        if (j == Long.MAX_VALUE) {
            this.f22088a0 = 0L;
        } else {
            this.f22088a0 = j + 1;
        }
    }

    public final void m18255m(final String str, final int i, final boolean z, final C5457w0 w0Var, final int i2, final int i3, final AbstractC5411l0[] l0VarArr) {
        final long j = this.f22088a0;
        C4383l.m28059a().m28058b(new Runnable() {
            @Override
            public final void run() {
                C6973n0.this.m18252p(str, i, w0Var, i2, i3, l0VarArr, j, z);
            }
        });
    }

    public int m18254n(int i) {
        if (this.f22083T.isEmpty() || getMeasuredWidth() == 0) {
            m18250t(i, false, true, false);
        }
        return getCurrentHeight();
    }

    @Override
    public int mo7852o0(boolean z) {
        return C5412m.m22778c(this, z);
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Iterator<C3955n.C3958c<RunnableC5390g>> it = this.f22083T.iterator();
        while (it.hasNext()) {
            C3955n.C3958c<RunnableC5390g> next = it.next();
            next.f13320a.m22897w(canvas, getPaddingLeft(), getMeasuredWidth() - getPaddingRight(), 0, getPaddingTop(), this.f22093d0, next.m29491s(), this.f22086W);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size <= 0 || getVisibility() == 8) {
            super.onMeasure(i, i2);
        } else {
            m18250t(size, false, true, false);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getCurrentHeight(), Log.TAG_TDLIB_OPTIONS));
        }
        int measuredHeight = getMeasuredHeight();
        if (this.f22090b0 != measuredHeight) {
            this.f22090b0 = measuredHeight;
            AbstractC6975b bVar = this.f22092c0;
            if (bVar != null) {
                bVar.mo18232a(this, measuredHeight);
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        RunnableC5390g w = this.f22083T.m29460w();
        if (w == null || (this.f22078O == 0 && this.f22082S == null)) {
            return super.onTouchEvent(motionEvent);
        }
        return w.m22965V0(this, motionEvent, this.f22077N);
    }

    @Override
    public int mo7851p0(boolean z) {
        return C5412m.m22780a(this, z);
    }

    @Override
    public int mo8934r(boolean z) {
        return this.f22089b;
    }

    @Override
    public int mo7850r0(boolean z) {
        return C5412m.m22771j(this, z);
    }

    @Override
    public void mo8255s() {
        invalidate();
    }

    public void setForcedTheme(AbstractC11531p pVar) {
        this.f22076M = pVar;
    }

    public void setHeightChangeListener(AbstractC6975b bVar) {
        this.f22092c0 = bVar;
    }

    public void setLinkFlags(int i) {
        this.f22078O = i;
    }

    public void setMaxLineCount(int i) {
        this.f22079P = i;
    }

    public void setTextColorId(int i) {
        if (this.f22087a != i) {
            this.f22087a = i;
            invalidate();
        }
    }

    public void setTextColorSet(AbstractC5408k kVar) {
        if (this.f22093d0 != kVar) {
            this.f22093d0 = kVar;
            invalidate();
        }
    }

    public void setTextSize(float f) {
        if (this.f22084U.m22660h() != f) {
            this.f22084U.m22655m(f);
            int i = this.f22085V;
            if (i > 0 && this.f22083T != null) {
                m18250t(i, false, false, false);
            }
        }
    }

    public void setTextStyleProvider(C5457w0 w0Var) {
        if (w0Var != null) {
            this.f22084U = w0Var;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void m18250t(int i, boolean z, boolean z2, boolean z3) {
        if (i != this.f22085V || !z2) {
            RunnableC5390g w = this.f22083T.m29460w();
            this.f22085V = i;
            if (w != null) {
                w.m22913p();
            }
            if (C5070i.m24061i(this.f22081R)) {
                this.f22083T.m29466m(z);
            } else if (i > 0) {
                int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
                int measuredHeight = getMeasuredHeight();
                int i2 = 0;
                boolean z4 = !z2 && z3;
                m18256l();
                if (z4) {
                    m18255m(this.f22081R, paddingLeft, z, this.f22084U, this.f22079P, this.f22078O, this.f22082S);
                } else {
                    String str = this.f22081R;
                    C5457w0 w0Var = this.f22084U;
                    int i3 = this.f22079P;
                    if (C4403w.m27984G2()) {
                        i2 = Log.TAG_CRASH;
                    }
                    RunnableC5390g gVar = new RunnableC5390g(str, paddingLeft, w0Var, this, i3, i2 | 524376, RunnableC5390g.m22991I0(this.f22081R, this.f22078O, this.f22082S, this.f22080Q, null));
                    gVar.m22914o1(new C4343h(this));
                    this.f22083T.m29462u(gVar, z);
                }
                if (!z2) {
                    if (!(measuredHeight == 0 || measuredHeight == getCurrentHeight())) {
                        requestLayout();
                    }
                    invalidate();
                }
            }
        }
    }

    public final void m18249u(RunnableC5390g gVar, int i, boolean z) {
        if (m18257j() == i) {
            RunnableC5390g w = this.f22083T.m29460w();
            if (w != null) {
                w.m22913p();
            }
            this.f22083T.m29462u(gVar, z);
            gVar.m22914o1(new C4343h(this));
            if (getMeasuredHeight() != getCurrentHeight()) {
                requestLayout();
            }
            invalidate();
            return;
        }
        m18250t(getMeasuredWidth(), z, false, false);
    }

    public void m18248v(CharSequence charSequence, AbstractC5411l0[] l0VarArr, boolean z) {
        m18246y(charSequence, new AbstractC5411l0[]{new C5417o0(null, this.f22080Q, charSequence.toString(), 0, charSequence.length(), 1, null)}, z);
    }

    @Override
    public int mo8933w() {
        return this.f22087a;
    }

    public void m18247x(int i, int i2) {
        this.f22089b = i;
        this.f22091c = i2;
    }

    public void m18246y(CharSequence charSequence, AbstractC5411l0[] l0VarArr, boolean z) {
        String charSequence2 = charSequence != null ? charSequence.toString() : null;
        if ((charSequence instanceof Spannable) && (l0VarArr == null || l0VarArr.length == 0)) {
            l0VarArr = C4779t2.m25571Y(null, this.f22080Q, charSequence, false, null);
        }
        String str = this.f22081R;
        if ((str == null && charSequence2 != null) || (str != null && !str.equals(charSequence2))) {
            this.f22081R = charSequence2;
            this.f22082S = l0VarArr;
            m18256l();
            int i = this.f22085V;
            if (i > 0) {
                m18250t(i, z, false, true);
            }
            invalidate();
        }
    }

    @Override
    public AbstractC11531p mo8932z() {
        return this.f22076M;
    }
}
