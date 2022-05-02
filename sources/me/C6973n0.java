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
    public AbstractC11531p f22079M;
    public final C10930q6 f22083Q;
    public String f22084R;
    public AbstractC5411l0[] f22085S;
    public int f22088V;
    public long f22091a0;
    public int f22093b0;
    public AbstractC6975b f22095c0;
    public AbstractC5408k f22096d0;
    public int f22090a = R.id.theme_color_text;
    public int f22092b = R.id.theme_color_textLink;
    public int f22094c = R.id.theme_color_textLinkPressHighlight;
    public final RunnableC5390g.AbstractC5393c f22080N = new C6974a();
    public int f22081O = 0;
    public int f22082P = -1;
    public final C3965r<RunnableC5390g> f22086T = new C3965r<>(new C3965r.AbstractC3966a() {
        @Override
        public final void mo7848a(C3965r rVar) {
            C6973n0.this.m18251q(rVar);
        }
    }, C2057b.f7280b, 180);
    public final C6238b f22089W = new C6238b(this);
    public C5457w0 f22087U = new C5457w0(new C1389o.C1390a(C1389o.m37261k(), C1389o.m37263i(), C1389o.m37264h(), null, C1389o.m37262j(), 0)).m22656m(15.0f);

    public class C6974a implements RunnableC5390g.AbstractC5393c {
        public C6974a() {
        }

        @Override
        public boolean mo18245A(String str) {
            return C5402h.m22841i(this, str);
        }

        @Override
        public boolean mo18244H5(String str) {
            return C5402h.m22837m(this, str);
        }

        @Override
        public boolean mo18243I3(String str) {
            return C5402h.m22842h(this, str);
        }

        @Override
        public boolean mo18242M(View view, RunnableC5390g gVar, C5455v0 v0Var, String str, boolean z) {
            return C5402h.m22844f(this, view, gVar, v0Var, str, z);
        }

        @Override
        public boolean mo18241P3(long j) {
            return C5402h.m22838l(this, j);
        }

        @Override
        public boolean mo18240S6(View view, String str) {
            return C5402h.m22846d(this, view, str);
        }

        @Override
        public TdApi.WebPage mo18239U2(String str) {
            return C5402h.m22849a(this, str);
        }

        @Override
        public boolean mo18238V4(String str) {
            return C5402h.m22843g(this, str);
        }

        @Override
        public AbstractC11531p mo18237W4(View view, RunnableC5390g gVar) {
            return C6973n0.this.f22079M;
        }

        @Override
        public boolean mo18236f5(String str) {
            return C5402h.m22845e(this, str);
        }

        @Override
        public boolean mo18235g0(View view, String str, boolean z, HandlerC10770jj.C10788q qVar) {
            return C5402h.m22839k(this, view, str, z, qVar);
        }

        @Override
        public boolean mo18234i0(View view, String str, String str2, HandlerC10770jj.C10788q qVar) {
            return C5402h.m22840j(this, view, str, str2, qVar);
        }

        @Override
        public boolean mo18233m2(String str) {
            return C5402h.m22848b(this, str);
        }
    }

    public interface AbstractC6975b {
        void mo18232a(C6973n0 n0Var, int i);
    }

    public C6973n0(Context context, C10930q6 q6Var) {
        super(context);
        this.f22083Q = q6Var;
        C11052v1.m1768b().m1769a(this);
    }

    private int getCurrentHeight() {
        if (this.f22086T == null) {
            return getPaddingTop() + getPaddingBottom();
        }
        int i = getLayoutParams() != null ? getLayoutParams().height : -2;
        if (i == -2) {
            return getPaddingTop() + Math.round(this.f22086T.m29467r().m29478j()) + getPaddingBottom();
        }
        return this.f22086T != null ? Math.max(getPaddingTop() + Math.round(this.f22086T.m29467r().m29478j()) + getPaddingBottom(), i) : i;
    }

    public void m18253o(long j, RunnableC5390g gVar, int i, boolean z) {
        if (this.f22091a0 == j) {
            m18249u(gVar, i, z);
        }
    }

    public void m18252p(String str, final int i, C5457w0 w0Var, int i2, int i3, AbstractC5411l0[] l0VarArr, final long j, final boolean z) {
        final RunnableC5390g gVar = new RunnableC5390g(str, i, w0Var, this, i2, (C4403w.m27986G2() ? Log.TAG_CRASH : 0) | 524376, RunnableC5390g.m22992I0(str, i3, l0VarArr, this.f22083Q, null));
        C1379j0.m37337d0(new Runnable() {
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
        return this.f22094c;
    }

    @Override
    public int mo8940N0() {
        return C5412m.m22769m(this);
    }

    @Override
    public int mo7858Q() {
        return C5406j.m22808d(this);
    }

    @Override
    public long mo7857X0(boolean z) {
        return C5406j.m22809c(this, z);
    }

    @Override
    public int mo8938Z0() {
        return C5412m.m22773i(this);
    }

    @Override
    public void mo4501a3() {
        this.f22089W.mo4501a3();
    }

    @Override
    public void mo8229b() {
        this.f22089W.m20995i();
    }

    @Override
    public int mo7856b1() {
        return C5412m.m22774h(this);
    }

    @Override
    public int mo7855c() {
        return C5412m.m22776f(this);
    }

    @Override
    public int mo7854e(boolean z) {
        return C5412m.m22780b(this, z);
    }

    @Override
    public void mo8225f() {
        this.f22089W.m21002b();
    }

    @Override
    public int mo7853g(boolean z) {
        return C5412m.m22771k(this, z);
    }

    @Override
    public void mo452g2() {
        invalidate();
    }

    public String getText() {
        return this.f22084R;
    }

    public final int m18257j() {
        return Math.max((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 0);
    }

    @Override
    public AbstractC11531p mo8937j1() {
        return C5412m.m22777e(this);
    }

    public final void m18256l() {
        long j = this.f22091a0;
        if (j == Long.MAX_VALUE) {
            this.f22091a0 = 0L;
        } else {
            this.f22091a0 = j + 1;
        }
    }

    public final void m18255m(final String str, final int i, final boolean z, final C5457w0 w0Var, final int i2, final int i3, final AbstractC5411l0[] l0VarArr) {
        final long j = this.f22091a0;
        C4383l.m28061a().m28060b(new Runnable() {
            @Override
            public final void run() {
                C6973n0.this.m18252p(str, i, w0Var, i2, i3, l0VarArr, j, z);
            }
        });
    }

    public int m18254n(int i) {
        if (this.f22086T.isEmpty() || getMeasuredWidth() == 0) {
            m18250t(i, false, true, false);
        }
        return getCurrentHeight();
    }

    @Override
    public int mo7852o0(boolean z) {
        return C5412m.m22779c(this, z);
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Iterator<C3955n.C3958c<RunnableC5390g>> it = this.f22086T.iterator();
        while (it.hasNext()) {
            C3955n.C3958c<RunnableC5390g> next = it.next();
            next.f13320a.m22898w(canvas, getPaddingLeft(), getMeasuredWidth() - getPaddingRight(), 0, getPaddingTop(), this.f22096d0, next.m29493s(), this.f22089W);
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
        if (this.f22093b0 != measuredHeight) {
            this.f22093b0 = measuredHeight;
            AbstractC6975b bVar = this.f22095c0;
            if (bVar != null) {
                bVar.mo18232a(this, measuredHeight);
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        RunnableC5390g w = this.f22086T.m29462w();
        if (w == null || (this.f22081O == 0 && this.f22085S == null)) {
            return super.onTouchEvent(motionEvent);
        }
        return w.m22966V0(this, motionEvent, this.f22080N);
    }

    @Override
    public int mo7851p0(boolean z) {
        return C5412m.m22781a(this, z);
    }

    @Override
    public int mo8934r(boolean z) {
        return this.f22092b;
    }

    @Override
    public int mo7850r0(boolean z) {
        return C5412m.m22772j(this, z);
    }

    @Override
    public void mo8255s() {
        invalidate();
    }

    public void setForcedTheme(AbstractC11531p pVar) {
        this.f22079M = pVar;
    }

    public void setHeightChangeListener(AbstractC6975b bVar) {
        this.f22095c0 = bVar;
    }

    public void setLinkFlags(int i) {
        this.f22081O = i;
    }

    public void setMaxLineCount(int i) {
        this.f22082P = i;
    }

    public void setTextColorId(int i) {
        if (this.f22090a != i) {
            this.f22090a = i;
            invalidate();
        }
    }

    public void setTextColorSet(AbstractC5408k kVar) {
        if (this.f22096d0 != kVar) {
            this.f22096d0 = kVar;
            invalidate();
        }
    }

    public void setTextSize(float f) {
        if (this.f22087U.m22661h() != f) {
            this.f22087U.m22656m(f);
            int i = this.f22088V;
            if (i > 0 && this.f22086T != null) {
                m18250t(i, false, false, false);
            }
        }
    }

    public void setTextStyleProvider(C5457w0 w0Var) {
        if (w0Var != null) {
            this.f22087U = w0Var;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void m18250t(int i, boolean z, boolean z2, boolean z3) {
        if (i != this.f22088V || !z2) {
            RunnableC5390g w = this.f22086T.m29462w();
            this.f22088V = i;
            if (w != null) {
                w.m22914p();
            }
            if (C5070i.m24062i(this.f22084R)) {
                this.f22086T.m29468m(z);
            } else if (i > 0) {
                int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
                int measuredHeight = getMeasuredHeight();
                int i2 = 0;
                boolean z4 = !z2 && z3;
                m18256l();
                if (z4) {
                    m18255m(this.f22084R, paddingLeft, z, this.f22087U, this.f22082P, this.f22081O, this.f22085S);
                } else {
                    String str = this.f22084R;
                    C5457w0 w0Var = this.f22087U;
                    int i3 = this.f22082P;
                    if (C4403w.m27986G2()) {
                        i2 = Log.TAG_CRASH;
                    }
                    RunnableC5390g gVar = new RunnableC5390g(str, paddingLeft, w0Var, this, i3, i2 | 524376, RunnableC5390g.m22992I0(this.f22084R, this.f22081O, this.f22085S, this.f22083Q, null));
                    gVar.m22915o1(new C4343h(this));
                    this.f22086T.m29464u(gVar, z);
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
            RunnableC5390g w = this.f22086T.m29462w();
            if (w != null) {
                w.m22914p();
            }
            this.f22086T.m29464u(gVar, z);
            gVar.m22915o1(new C4343h(this));
            if (getMeasuredHeight() != getCurrentHeight()) {
                requestLayout();
            }
            invalidate();
            return;
        }
        m18250t(getMeasuredWidth(), z, false, false);
    }

    public void m18248v(CharSequence charSequence, AbstractC5411l0[] l0VarArr, boolean z) {
        m18246y(charSequence, new AbstractC5411l0[]{new C5417o0(null, this.f22083Q, charSequence.toString(), 0, charSequence.length(), 1, null)}, z);
    }

    @Override
    public int mo8933w() {
        return this.f22090a;
    }

    public void m18247x(int i, int i2) {
        this.f22092b = i;
        this.f22094c = i2;
    }

    public void m18246y(CharSequence charSequence, AbstractC5411l0[] l0VarArr, boolean z) {
        String charSequence2 = charSequence != null ? charSequence.toString() : null;
        if ((charSequence instanceof Spannable) && (l0VarArr == null || l0VarArr.length == 0)) {
            l0VarArr = C4779t2.m25572Y(null, this.f22083Q, charSequence, false, null);
        }
        String str = this.f22084R;
        if ((str == null && charSequence2 != null) || (str != null && !str.equals(charSequence2))) {
            this.f22084R = charSequence2;
            this.f22085S = l0VarArr;
            m18256l();
            int i = this.f22088V;
            if (i > 0) {
                m18250t(i, z, false, true);
            }
            invalidate();
        }
    }

    @Override
    public AbstractC11531p mo8932z() {
        return this.f22079M;
    }
}
