package p038ce;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import be.C1389o;
import be.C1405v;
import be.C1410y;
import ge.C4868i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.opengles.GL10;
import me.C6847b2;
import me.C6924j2;
import me.RunnableC6969m2;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.C7888N;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.MainActivity;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p038ce.RunnableC2425ga;
import p051db.C3940f;
import p051db.C3950k;
import p057e2.AbstractC4117a;
import p080fb.C4343h;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5146u0;
import p124ib.C5320c;
import p139jb.AbstractC5917i;
import p139jb.AbstractC5918j;
import p139jb.AbstractRunnableC5910b;
import p143k0.C6038h;
import p335xd.C10189d;
import p335xd.C10192g;
import p350yd.AbstractC10861n0;
import p350yd.AbstractC11030u0;
import p350yd.AbstractC11041ub;
import p350yd.C10534a9;
import p350yd.C10536ab;
import p350yd.C10838m0;
import p350yd.C10930q6;
import p350yd.C11008t0;
import p350yd.C11020tb;
import p350yd.C11131y6;
import p364zd.C11510b;
import p364zd.C11524j;
import td.AbstractC9162c;
import td.AbstractC9323v4;
import td.View$OnClickListenerC9170d1;

public class RunnableC2425ga extends AbstractC9323v4<Void> implements GLSurfaceView.EGLConfigChooser, GLSurfaceView.Renderer, ViewPager.AbstractC1054i, Runnable, View.OnClickListener, View.OnLongClickListener, AbstractC11041ub, AbstractC10861n0, AbstractC11030u0 {
    public static boolean f8316Q0 = false;
    public static int f8317R0 = -1;
    public C3940f f8318A0;
    public boolean f8319B0;
    public AbstractRunnableC5910b f8320C0;
    public int f8325H0;
    public int f8326I0;
    public float f8327J0;
    public boolean f8333P0;
    public View f8334n0;
    public C2437l f8335o0;
    public boolean f8336p0;
    public C2434i f8337q0;
    public boolean f8338r0;
    public C2435j f8339s0;
    public C2435j f8340t0;
    public C2435j f8341u0;
    public C2435j f8342v0;
    public TextView f8343w0;
    public TextView f8344x0;
    public RunnableC6969m2 f8345y0;
    public C3940f f8346z0;
    public int f8321D0 = -1;
    public int f8322E0 = -1;
    public CharSequence[] f8323F0 = new CharSequence[6];
    public final String[] f8324G0 = new String[6];
    public final C6038h<Bitmap> f8328K0 = new C6038h<>(23);
    public final C6038h<Bitmap> f8329L0 = new C6038h<>(2);
    public int[] f8330M0 = new int[1];
    public long f8331N0 = System.currentTimeMillis() - 1000;
    public int[] f8332O0 = new int[1];

    public class C2426a extends AbstractRunnableC5910b {
        public final C2434i f8347M;

        public C2426a(C2434i iVar) {
            this.f8347M = iVar;
        }

        @Override
        public void mo1364b() {
            if (!this.f8347M.f8359c && !RunnableC2425ga.this.m9347Sa() && !this.f8347M.m34547e(1)) {
                C6924j2 Zf = RunnableC2425ga.this.m34584Zf(this.f8347M);
                if (Zf != null) {
                    this.f8347M.m34545g(Zf, 1);
                } else {
                    this.f8347M.f8362f = true;
                }
            }
        }
    }

    public class C2427b extends GLSurfaceView {
        public C2427b(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            if (size >= size2) {
                size /= 2;
            } else {
                size2 = Math.min(size, size2 / 2);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(size2, Log.TAG_TDLIB_OPTIONS));
            requestRender();
        }
    }

    public class C2428c extends FrameLayoutFix {
        public C2428c(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            if (size >= size2) {
                size /= 2;
                RunnableC2425ga.this.f8335o0.m34515m(true);
            } else {
                size2 -= Math.min(size, size2 / 2);
                RunnableC2425ga.this.f8335o0.m34515m(false);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(size2, Log.TAG_TDLIB_OPTIONS));
        }
    }

    public class C2429d extends C6847b2 {
        public C2429d(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            RunnableC2425ga.this.f8345y0.m18287c(canvas);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (getLayout() != null && getLayout().getLineCount() > 0) {
                int i3 = C1357a0.m37541i(24.0f);
                int measuredWidth = (getMeasuredWidth() / 2) + (((int) getLayout().getLineWidth(0)) / 2) + C1357a0.m37541i(16.0f);
                int measuredHeight = getMeasuredHeight() / 2;
                int i4 = i3 / 2;
                RunnableC2425ga.this.f8345y0.m18274p(measuredWidth - i4, measuredHeight - i4, measuredWidth + i4, measuredHeight + i4);
            }
        }
    }

    public class C2430e implements C3950k.AbstractC3952b {
        public C2430e() {
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            RunnableC2425ga.this.f8345y0.m18275o(f);
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
        }
    }

    public class C2431f implements C3950k.AbstractC3952b {
        public C2431f() {
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            RunnableC2425ga.this.f8344x0.setTranslationY((C1357a0.m37541i(48.0f) + C1357a0.m37541i(16.0f)) * (1.0f - f));
            RunnableC2425ga.this.f8343w0.setTranslationY((-C1357a0.m37541i(48.0f)) * f);
            RunnableC2425ga.this.f8335o0.m34514n(f);
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
        }
    }

    public class C2432g extends AbstractRunnableC5910b {
        public C2432g() {
        }

        @Override
        public void mo1364b() {
            RunnableC2425ga.this.m34578cg();
        }
    }

    public static class C2433h extends AbstractC4117a {
        public FrameLayoutFix[] f8355M = new FrameLayoutFix[mo8825e()];
        public final Context f8356c;

        public C2433h(Context context) {
            this.f8356c = context;
        }

        @Override
        public void mo8826b(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((ViewGroup) obj);
        }

        @Override
        public int mo8825e() {
            return 6;
        }

        @Override
        public Object mo8823j(ViewGroup viewGroup, int i) {
            FrameLayoutFix[] frameLayoutFixArr = this.f8355M;
            if (frameLayoutFixArr[i] == null) {
                frameLayoutFixArr[i] = new FrameLayoutFix(this.f8356c);
                this.f8355M[i].setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            }
            viewGroup.addView(this.f8355M[i]);
            return this.f8355M[i];
        }

        @Override
        public boolean mo8822k(View view, Object obj) {
            return view == obj;
        }
    }

    public static class C2434i {
        public final C2435j f8357a;
        public boolean f8358b;
        public boolean f8359c;
        public C6924j2 f8360d;
        public AbstractRunnableC5910b f8361e;
        public boolean f8362f;

        public C2434i(C2435j jVar) {
            this.f8357a = jVar;
        }

        public void m34550b() {
            if (!this.f8359c) {
                this.f8359c = true;
                m34549c();
                m34546f(null);
                this.f8362f = false;
            }
        }

        public void m34549c() {
            m34545g(null, 0);
        }

        public final C2436k m34548d() {
            C6924j2 j2Var = this.f8360d;
            if (j2Var == null || j2Var.m18446A2() || this.f8360d.getBoundView() == null || !(this.f8360d.getBoundView().getTag() instanceof C2436k)) {
                return null;
            }
            return (C2436k) this.f8360d.getBoundView().getTag();
        }

        public boolean m34547e(int i) {
            C2436k d = m34548d();
            return d != null && d.f8370b == i;
        }

        public void m34546f(AbstractRunnableC5910b bVar) {
            AbstractRunnableC5910b bVar2 = this.f8361e;
            if (bVar2 != null) {
                bVar2.m21857c();
            }
            this.f8361e = bVar;
        }

        public void m34545g(C6924j2 j2Var, int i) {
            C6924j2 j2Var2 = this.f8360d;
            if (j2Var2 != null && !j2Var2.m18446A2()) {
                C6924j2 j2Var3 = this.f8360d;
                j2Var3.m18408y2(C1379j0.m37307r(j2Var3.getContext()).m14582I0() == 0);
            }
            this.f8360d = j2Var;
            if (j2Var != null) {
                j2Var.getBoundView().setTag(new C2436k(this, i));
            }
        }
    }

    public static class C2435j {
        public final TdApi.LanguagePackInfo f8363a;
        public int f8364b;
        public C10930q6 f8365c;
        public C10930q6 f8366d;
        public List<AbstractC5917i> f8367e;
        public List<Runnable> f8368f;

        public C2435j(TdApi.LanguagePackInfo languagePackInfo, int i) {
            this.f8363a = languagePackInfo;
            this.f8364b = i;
        }

        public void m34535j(C10930q6 q6Var, boolean z) {
            C10930q6 q6Var2 = this.f8365c;
            if (q6Var2 == q6Var || z) {
                if (q6Var2 == q6Var) {
                    this.f8365c = null;
                }
                if (z) {
                    m34528q();
                }
                m34529p(z);
            }
        }

        public void m34534k(final C10930q6 q6Var, final boolean z) {
            if (!z) {
                Log.m14724e("Failed to load language from intro", new Object[0]);
            }
            q6Var.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    RunnableC2425ga.C2435j.this.m34535j(q6Var, z);
                }
            });
        }

        public void m34533l(C10930q6 q6Var, boolean z) {
            C10930q6 q6Var2 = this.f8366d;
            if (q6Var2 == q6Var || z) {
                if (q6Var2 == q6Var) {
                    this.f8366d = null;
                }
                if (z) {
                    m34528q();
                }
            }
        }

        public void m34532m(final C10930q6 q6Var, Map map) {
            final boolean z = map != null;
            if (!z) {
                Log.m14724e("Failed to load intro strings", new Object[0]);
            }
            q6Var.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    RunnableC2425ga.C2435j.this.m34533l(q6Var, z);
                }
            });
        }

        public void m34540e(Runnable runnable) {
            if (m34536i()) {
                runnable.run();
                return;
            }
            if (this.f8368f == null) {
                this.f8368f = new ArrayList();
            }
            if (!this.f8368f.contains(runnable)) {
                this.f8368f.add(runnable);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof C2435j) && ((C2435j) obj).m34538g().equals(m34538g());
        }

        public void m34539f(AbstractC5917i iVar) {
            if (m34537h()) {
                iVar.mo1322a(true);
                return;
            }
            if (this.f8367e == null) {
                this.f8367e = new ArrayList();
            }
            this.f8367e.add(iVar);
        }

        public String m34538g() {
            return this.f8363a.f25405id;
        }

        public boolean m34537h() {
            return this.f8364b == 2;
        }

        public boolean m34536i() {
            int i = this.f8364b;
            return i == 2 || i == 1;
        }

        public void m34531n(final C10930q6 q6Var) {
            if (this.f8365c != q6Var && !m34537h()) {
                this.f8365c = q6Var;
                q6Var.m2794Jc(this.f8363a, new AbstractC5917i() {
                    @Override
                    public final void mo1322a(boolean z) {
                        RunnableC2425ga.C2435j.this.m34534k(q6Var, z);
                    }
                });
            }
        }

        public void m34530o(final C10930q6 q6Var) {
            if (this.f8365c != q6Var && this.f8366d != q6Var && !m34536i()) {
                this.f8366d = q6Var;
                q6Var.m2508c6(this.f8363a, C4403w.m28010A0(RunnableC2425ga.m34555wf()), new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        RunnableC2425ga.C2435j.this.m34532m(q6Var, (Map) obj);
                    }
                });
            }
        }

        public final void m34529p(boolean z) {
            if (z && this.f8364b != 2) {
                this.f8364b = 2;
            }
            List<AbstractC5917i> list = this.f8367e;
            this.f8367e = null;
            if (list != null) {
                for (AbstractC5917i iVar : list) {
                    iVar.mo1322a(z);
                }
            }
        }

        public final void m34528q() {
            if (this.f8364b == 0) {
                this.f8364b = 1;
            }
            List<Runnable> list = this.f8368f;
            this.f8368f = null;
            if (list != null) {
                for (Runnable runnable : list) {
                    runnable.run();
                }
            }
        }
    }

    public static class C2436k {
        public final C2434i f8369a;
        public final int f8370b;

        public C2436k(C2434i iVar, int i) {
            this.f8369a = iVar;
            this.f8370b = i;
        }
    }

    public static class C2437l extends View {
        public boolean f8374P;
        public float f8375Q;
        public String f8377S;
        public float f8378T;
        public CharSequence f8379U;
        public String f8381W;
        public Paint f8382a;
        public float f8383a0;
        public TextPaint f8384b;
        public CharSequence f8385b0;
        public int f8388d0;
        public float f8389e0;
        public float f8390f0;
        public int f8391g0;
        public float f8392h0;
        public int f8376R = -1;
        public int f8380V = -1;
        public StaticLayout[] f8387c0 = new StaticLayout[6];
        public final float[] f8371M = new float[6];
        public int f8372N = C1357a0.m37541i(16.0f);
        public int f8373O = C1357a0.m37541i(42.0f);
        public int f8386c = C1357a0.m37541i(22.0f);

        public C2437l(Context context) {
            super(context);
            Paint paint = new Paint(5);
            this.f8382a = paint;
            paint.setTextSize(C1357a0.m37541i(24.0f));
            this.f8382a.setTypeface(C1389o.m37260i());
            this.f8382a.setColor(C11524j.m217S0());
            TextPaint textPaint = new TextPaint(5);
            this.f8384b = textPaint;
            textPaint.setTextSize(C1357a0.m37541i(16.0f));
            this.f8384b.setTypeface(C1389o.m37258k());
            this.f8384b.setColor(C11524j.m217S0());
        }

        public static int m34524d() {
            return C1357a0.m37541i(3.0f);
        }

        public final StaticLayout m34527a(int i, CharSequence charSequence) {
            StaticLayout[] staticLayoutArr;
            int measuredWidth = getMeasuredWidth();
            if (i == -1 || charSequence == null || measuredWidth == 0) {
                return null;
            }
            int i2 = this.f8388d0;
            if (i2 != measuredWidth) {
                if (i2 != 0) {
                    int i3 = 0;
                    for (StaticLayout staticLayout : this.f8387c0) {
                        i3++;
                        this.f8387c0[i3] = null;
                    }
                }
                this.f8388d0 = measuredWidth;
            }
            StaticLayout[] staticLayoutArr2 = this.f8387c0;
            if (staticLayoutArr2[i] != null) {
                return staticLayoutArr2[i];
            }
            TextPaint textPaint = this.f8384b;
            if (measuredWidth - (C1357a0.m37541i(16.0f) * 2) >= 0) {
                measuredWidth -= C1357a0.m37541i(16.0f) * 2;
            }
            StaticLayout staticLayout2 = new StaticLayout(charSequence, textPaint, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, m34524d(), false);
            this.f8387c0[i] = staticLayout2;
            return staticLayout2;
        }

        public final float m34526b(int i, String str) {
            float[] fArr = this.f8371M;
            if (fArr[i] != 0.0f) {
                return fArr[i];
            }
            float T1 = C7389v0.m16680T1(str, this.f8382a);
            fArr[i] = T1;
            return T1;
        }

        public void m34525c(RunnableC2425ga gaVar) {
            gaVar.m9471Ba().m73g(this.f8382a, R.id.theme_color_text, 5);
            gaVar.m9471Ba().m73g(this.f8384b, R.id.theme_color_text, 5);
        }

        public void m34523e(int i, CharSequence... charSequenceArr) {
            StaticLayout[] staticLayoutArr;
            this.f8388d0 = i;
            int i2 = 0;
            for (StaticLayout staticLayout : this.f8387c0) {
                this.f8387c0[i2] = new StaticLayout(charSequenceArr[i2], this.f8384b, i - (C1357a0.m37541i(16.0f) * 2) < 0 ? i : i - (C1357a0.m37541i(16.0f) * 2), Layout.Alignment.ALIGN_CENTER, 1.0f, m34524d(), false);
                i2++;
            }
        }

        public void m34522f(String... strArr) {
            float[] fArr;
            int i = 0;
            for (float f : this.f8371M) {
                this.f8371M[i] = C7389v0.m16680T1(strArr[i], this.f8382a);
                i++;
            }
        }

        public void m34521g() {
            C5062b.m24164h(this.f8387c0);
        }

        public void m34520h() {
            int i = 0;
            while (true) {
                float[] fArr = this.f8371M;
                if (i < fArr.length) {
                    fArr[i] = 0.0f;
                    i++;
                } else {
                    return;
                }
            }
        }

        public void m34519i(int i, String str, CharSequence charSequence) {
            this.f8376R = i;
            this.f8377S = str;
            this.f8378T = m34526b(i, str);
            this.f8379U = charSequence;
        }

        public void m34518j(float f, float f2) {
            if (this.f8389e0 != f || this.f8390f0 != f2) {
                this.f8389e0 = f;
                this.f8390f0 = f2;
                if (f2 == 0.0f) {
                    this.f8392h0 = 0.0f;
                }
                invalidate();
            }
        }

        public void m34517k(int i, float f) {
            if (this.f8391g0 != i || this.f8390f0 != f) {
                this.f8391g0 = i;
                this.f8390f0 = f;
                this.f8392h0 = f;
                invalidate();
            }
        }

        public void m34516l(int i, String str, CharSequence charSequence) {
            this.f8380V = i;
            if (i == -1) {
                this.f8381W = null;
                this.f8383a0 = 0.0f;
                this.f8385b0 = null;
                return;
            }
            this.f8381W = str;
            this.f8383a0 = m34526b(i, str);
            this.f8385b0 = charSequence;
        }

        public void m34515m(boolean z) {
            this.f8374P = z;
        }

        public void m34514n(float f) {
            if (this.f8375Q != f) {
                this.f8375Q = f;
                invalidate();
            }
        }

        @Override
        public void onDraw(android.graphics.Canvas r12) {
            throw new UnsupportedOperationException("Method not decompiled: p038ce.RunnableC2425ga.C2437l.onDraw(android.graphics.Canvas):void");
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            m34527a(this.f8376R, this.f8379U);
            m34527a(this.f8380V, this.f8385b0);
        }
    }

    public RunnableC2425ga(Context context) {
        super(context, null);
    }

    public static int m34620Af(int i, boolean z) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? z ? R.string.Page1Message : R.string.Page1Title : z ? R.string.Page6Message : R.string.Page6Title : z ? R.string.Page5Message : R.string.Page5Title : z ? R.string.Page4Message : R.string.Page4Title : z ? R.string.Page3Message : R.string.Page3Title : z ? R.string.Page2Message : R.string.Page2Title : z ? R.string.Page1Message : R.string.Page1Title;
    }

    public static boolean m34617Df() {
        if (!C4868i.m24726c2().m24694g2()) {
            return false;
        }
        Log.m14709w("Not showing intro controller, because it has failed once", new Object[0]);
        return true;
    }

    public void m34616Ef() {
        if (!m9347Sa()) {
            m34600Rf(this.f8337q0);
        }
    }

    public boolean m34615Ff(View view, int i) {
        if (i == R.id.btn_log_files) {
            m9291ac(new View$OnClickListenerC3209vr(this.f30165a, m34554xf()));
        } else if (i == R.id.btn_proxy) {
            m34554xf().m2485dd().m3409x7(new C10534a9(this.f30165a, m34554xf()), true);
        } else if (i == R.id.btn_test && !C1379j0.m37358J()) {
            C1379j0.f5013g = 2;
            m34598Sf(true);
        }
        return true;
    }

    public void m34614Gf() {
        if (!this.f8336p0) {
            this.f8334n0.setVisibility(0);
            m34592Vf();
        }
    }

    public void m34613Hf(String str, TdApi.LanguagePackInfo languagePackInfo) {
        if (!m9347Sa()) {
            m34588Xf(str, languagePackInfo);
            m34565mf();
        }
    }

    public void m34612If(C2434i iVar, boolean z) {
        if (z) {
            m34600Rf(iVar);
            return;
        }
        Log.m14724e("Unexpected server error. Proceeding in English.", new Object[0]);
        m34594Uf(true);
    }

    public boolean m34611Jf(TdApi.LanguagePackInfo languagePackInfo, View view, int i) {
        String str;
        if (i == R.id.btn_help) {
            TdApi.NetworkType ea = m34554xf().m2472ea();
            if (ea != null) {
                switch (ea.getConstructor()) {
                    case TdApi.NetworkTypeMobileRoaming.CONSTRUCTOR:
                        str = "Roaming";
                        break;
                    case TdApi.NetworkTypeWiFi.CONSTRUCTOR:
                        str = "Wifi";
                        break;
                    case TdApi.NetworkTypeMobile.CONSTRUCTOR:
                        str = "Mobile";
                        break;
                    case TdApi.NetworkTypeOther.CONSTRUCTOR:
                        str = "Other";
                        break;
                    default:
                        str = "None";
                        break;
                }
            } else {
                str = "Unknown";
            }
            if (m34554xf().m2704P6()) {
                str = str + ", " + C4403w.m27861k1(languagePackInfo, R.string.Connected);
            }
            C1405v.m37130M(C4403w.m27821u1(R.string.email_SmsHelp, new Object[0]), C4403w.m27861k1(languagePackInfo, R.string.email_LoginTooLong_subject), C4403w.m27857l1(languagePackInfo, R.string.email_LoginTooLong_text, "0.24.6.1506-arm64-v8a", languagePackInfo.f25405id, C4403w.m27818v0((int) (m34554xf().m2547Zc() / 1000)) + " (" + str + ")", C10536ab.m4764P0(), C10536ab.m4760Q0()), C4403w.m27861k1(languagePackInfo, R.string.HelpEmailError));
        } else if (i == R.id.btn_proxy) {
            m34554xf().m2485dd().m3409x7(new C10534a9(this.f30165a, m34554xf()), true);
        }
        return true;
    }

    public void m34610Kf(View view) {
        if (!m9347Sa()) {
            view.setVisibility(0);
        }
    }

    public boolean m34609Lf(C2434i iVar, boolean z) {
        if (this.f8337q0 != iVar) {
            return false;
        }
        m34567kf();
        return false;
    }

    public static boolean m34608Mf(View view, int i) {
        if (i != R.id.btn_settings) {
            return true;
        }
        if (C7389v0.m16644d1()) {
            C1405v.m37108m();
            return true;
        }
        C1405v.m37136G();
        return true;
    }

    public boolean m34607Nf(C2434i iVar, boolean z) {
        if (this.f8337q0 != iVar) {
            return false;
        }
        m34567kf();
        return false;
    }

    public static void m34586Yf(boolean z) {
        if (f8316Q0 != z) {
            f8316Q0 = z;
            C4868i.m24726c2().m24817P4(z);
        }
    }

    public static boolean m34569if(int i) {
        switch (i) {
            case R.string.Page1Message:
            case R.string.Page1Title:
            case R.string.Page2Message:
            case R.string.Page2Title:
            case R.string.Page3Message:
            case R.string.Page3Title:
            case R.string.Page4Message:
            case R.string.Page4Title:
            case R.string.Page5Message:
            case R.string.Page5Title:
            case R.string.Page6Message:
            case R.string.Page6Title:
                return true;
            default:
                return false;
        }
    }

    public static int[] m34555wf() {
        return new int[]{R.string.StartMessaging, R.string.Page1Title, R.string.Page1Message, R.string.Page2Title, R.string.Page2Message, R.string.Page3Title, R.string.Page3Message, R.string.Page4Title, R.string.Page4Message, R.string.Page5Title, R.string.Page5Message, R.string.Page6Title, R.string.Page6Message};
    }

    @Override
    public void mo9477Ac() {
        super.mo9477Ac();
        View view = this.f8334n0;
        if (view != null && view.getVisibility() != 0) {
            this.f8336p0 = false;
            C1379j0.m37332e0(new Runnable() {
                @Override
                public final void run() {
                    RunnableC2425ga.this.m34614Gf();
                }
            }, 50L);
        }
    }

    @Override
    public boolean mo9473B8() {
        return false;
    }

    public final void m34619Bf() {
        TdApi.LanguagePackInfo f0 = C4403w.m27882f0();
        TdApi.LanguagePackInfo Y = C4403w.m27915Y();
        this.f8340t0 = new C2435j(Y, 2);
        if (f0.f25405id.equals(Y.f25405id)) {
            this.f8341u0 = this.f8340t0;
        } else {
            this.f8341u0 = new C2435j(f0, 1);
        }
        this.f8339s0 = this.f8341u0;
        m34588Xf(m34554xf().m2890Dc(), m34554xf().m2874Ec());
    }

    @Override
    public void mo61C4(C11131y6 y6Var, int i, int i2) {
        C11008t0.m1997e(this, y6Var, i, i2);
    }

    public final void m34618Cf(GL10 gl10) {
        C7888N.setIcTextures(m34606Of(gl10, R.drawable.intro_ic_bubble_dot), m34606Of(gl10, R.drawable.intro_ic_bubble), m34606Of(gl10, R.drawable.intro_ic_cam_lens), m34606Of(gl10, R.drawable.intro_ic_cam), m34606Of(gl10, R.drawable.intro_ic_pencil), m34606Of(gl10, R.drawable.intro_ic_pin), m34606Of(gl10, R.drawable.intro_ic_smile_eye), m34606Of(gl10, R.drawable.intro_ic_smile), m34606Of(gl10, R.drawable.intro_ic_videocam));
        C7888N.setTelegramTextures(m34604Pf(gl10, m34557uf()), m34606Of(gl10, R.drawable.intro_tg_plane));
        C7888N.setPowerfulTextures(m34606Of(gl10, R.drawable.intro_powerful_mask), m34606Of(gl10, R.drawable.intro_powerful_star), m34606Of(gl10, R.drawable.intro_powerful_infinity), m34606Of(gl10, R.drawable.intro_powerful_infinity_white));
        C7888N.setPrivateTextures(m34606Of(gl10, R.drawable.intro_private_door), m34606Of(gl10, R.drawable.intro_private_screw));
        C7888N.setFastTextures(m34606Of(gl10, R.drawable.intro_fast_body), m34606Of(gl10, R.drawable.intro_fast_spiral), m34606Of(gl10, R.drawable.intro_fast_arrow), m34606Of(gl10, R.drawable.intro_fast_arrow_shadow));
        C7888N.setFreeTextures(m34606Of(gl10, R.drawable.intro_knot_up), m34606Of(gl10, R.drawable.intro_knot_down));
        m34570hf(C11524j.m148w());
        C7888N.onSurfaceCreated();
    }

    @Override
    public void mo1779G0(boolean z) {
        C11020tb.m1988a(this, z);
    }

    @Override
    public void mo56G2(C11131y6 y6Var, TdApi.AuthorizationState authorizationState, int i) {
        C11008t0.m1995g(this, y6Var, authorizationState, i);
    }

    @Override
    public boolean mo9416Ie() {
        return false;
    }

    @Override
    public boolean mo9386Me() {
        return true;
    }

    @Override
    public void mo48O(C11131y6 y6Var, boolean z, boolean z2) {
        C11008t0.m2000b(this, y6Var, z, z2);
    }

    @Override
    public void mo47O6(C10930q6 q6Var, boolean z) {
        C11008t0.m1994h(this, q6Var, z);
    }

    public final int m34606Of(GL10 gl10, int i) {
        return m34604Pf(gl10, m34553yf(i));
    }

    public final int m34604Pf(GL10 gl10, Bitmap bitmap) {
        this.f8330M0[0] = 0;
        int[] iArr = this.f8332O0;
        iArr[0] = 0;
        if (gl10 != null) {
            gl10.glGenTextures(1, iArr, 0);
            gl10.glBindTexture(3553, this.f8332O0[0]);
            gl10.glTexParameterf(3553, 10241, 9729.0f);
            gl10.glTexParameterf(3553, 10240, 9729.0f);
            gl10.glTexParameterf(3553, 10242, 33071.0f);
            gl10.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        } else {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, this.f8332O0[0]);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        }
        return this.f8332O0[0];
    }

    @Override
    public void mo1778Q2(TdApi.SuggestedAction[] suggestedActionArr, TdApi.SuggestedAction[] suggestedActionArr2) {
        C11020tb.m1985d(this, suggestedActionArr, suggestedActionArr2);
    }

    public final boolean m34602Qf() {
        return !m9347Sa() && m34554xf().m2155y7();
    }

    @Override
    public int mo407R9() {
        return R.id.controller_intro;
    }

    public final void m34600Rf(final C2434i iVar) {
        if (iVar != null && !iVar.f8359c) {
            this.f8337q0 = iVar;
            iVar.m34546f(null);
            iVar.f8362f = false;
            if (m34602Qf()) {
                if (!iVar.m34547e(0)) {
                    C6924j2 ag = m34582ag(iVar);
                    if (ag != null) {
                        m34564nf();
                        iVar.m34545g(ag, 0);
                        return;
                    }
                    iVar.f8362f = true;
                    iVar.m34549c();
                }
            } else if (!iVar.f8357a.m34537h()) {
                if (!iVar.m34547e(1)) {
                    iVar.m34549c();
                }
                m34564nf();
                if (!iVar.f8358b) {
                    iVar.f8358b = true;
                    iVar.f8357a.m34539f(new AbstractC5917i() {
                        @Override
                        public final void mo1322a(boolean z) {
                            RunnableC2425ga.this.m34612If(iVar, z);
                        }
                    });
                }
                iVar.f8357a.m34531n(m34554xf());
                C2426a aVar = new C2426a(iVar);
                iVar.m34546f(aVar);
                m34554xf().m2485dd().postDelayed(aVar, m34554xf().m2464f2(4000L));
            } else {
                iVar.m34549c();
                this.f8338r0 = true;
                C4403w.m27831s(iVar.f8357a.f8363a);
                this.f8337q0 = null;
                m34564nf();
                m9291ac(new View$OnClickListenerC2393fk(this.f30165a, m34554xf()));
            }
        }
    }

    public final void m34598Sf(boolean z) {
        if (m34554xf().m2949A1().m1504G() != z) {
            ((MainActivity) this.f30165a).m14632r4(z);
        }
        m34594Uf(false);
    }

    @Override
    public void mo9343T5(int i, int i2) {
        if (!this.f8338r0) {
            super.mo9343T5(i, i2);
            if (i == 0) {
                TextView textView = this.f8343w0;
                if (textView != null) {
                    textView.setText(m34556vf(R.string.StartMessaging));
                }
                if (this.f8335o0 != null) {
                    m34574eg();
                }
            } else if (i == 2) {
                TextView textView2 = this.f8343w0;
                if (textView2 != null && i2 == R.string.StartMessaging) {
                    textView2.setText(m34556vf(R.string.StartMessaging));
                }
                if (this.f8335o0 != null && m34569if(i2)) {
                    m34574eg();
                }
            }
        }
    }

    public final void m34596Tf() {
        m34554xf().m2781K9().m1898V(this);
        m34554xf().m2781K9().m1814r0(this);
        C10536ab.m4667o1().m4716b1().m1531x(this);
    }

    public final void m34594Uf(boolean z) {
        C2435j jVar = z ? this.f8340t0 : this.f8339s0;
        C2434i iVar = this.f8337q0;
        if (iVar == null || !iVar.f8357a.equals(jVar)) {
            m34567kf();
            m34600Rf(new C2434i(jVar));
        }
    }

    public final void m34592Vf() {
        View view = this.f8334n0;
        if (view != null) {
            ((GLSurfaceView) view).requestRender();
        }
    }

    public final void m34590Wf(int i, int i2) {
        C7888N.onSurfaceChanged(i, i2, C1357a0.m37542h(), 0);
    }

    public final void m34588Xf(String str, TdApi.LanguagePackInfo languagePackInfo) {
        if (C5070i.m24061i(str)) {
            this.f8342v0 = null;
        } else if (str.equals(this.f8340t0.m34538g())) {
            this.f8342v0 = this.f8340t0;
        } else if (str.equals(this.f8341u0.m34538g())) {
            this.f8342v0 = this.f8341u0;
        } else if (languagePackInfo != null) {
            this.f8342v0 = new C2435j(languagePackInfo, 0);
        } else {
            this.f8342v0 = null;
        }
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        m34567kf();
        m34578cg();
        m34561qf();
        m34562pf(false);
        m34596Tf();
    }

    public final C6924j2 m34584Zf(final C2434i iVar) {
        final View findViewById;
        C5320c cVar = new C5320c(2);
        C5320c cVar2 = new C5320c(2);
        C5146u0 u0Var = new C5146u0(2);
        final TdApi.LanguagePackInfo languagePackInfo = iVar.f8357a.f8363a;
        cVar.m23284a(R.id.btn_proxy);
        u0Var.m23815b(C4403w.m27861k1(languagePackInfo, C4868i.m24726c2().m24764X1() ? R.string.ProxySettings : R.string.ProxyAdd));
        cVar2.m23284a(R.drawable.baseline_security_24);
        cVar.m23284a(R.id.btn_help);
        u0Var.m23815b(C4403w.m27861k1(languagePackInfo, R.string.Help));
        cVar2.m23284a(R.drawable.baseline_help_24);
        long f2 = m34554xf().m2464f2(12000L);
        C6924j2 ee2 = m9261ee(C1363c0.m37425l(new C10534a9(this.f30165a, m34554xf()), C4403w.m27861k1(languagePackInfo, R.string.LoginErrorLongConnecting), null), cVar.m23280e(), u0Var.m23813d(), null, cVar2.m23280e(), new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean Jf;
                Jf = RunnableC2425ga.this.m34611Jf(languagePackInfo, view, i);
                return Jf;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23935a(this);
            }

            @Override
            public Object mo491b2(int i) {
                return C5115g0.m23934b(this, i);
            }
        });
        if (ee2 != null) {
            if (f2 > 0 && (findViewById = ee2.getBoundView().findViewById(R.id.btn_help)) != null) {
                findViewById.setVisibility(8);
                m34554xf().m2485dd().postDelayed(new Runnable() {
                    @Override
                    public final void run() {
                        RunnableC2425ga.this.m34610Kf(findViewById);
                    }
                }, f2);
            }
            ee2.setDisableCancelOnTouchDown(true);
            ee2.setBackListener(new AbstractC9162c() {
                @Override
                public final boolean mo10135g0(boolean z) {
                    boolean Lf;
                    Lf = RunnableC2425ga.this.m34609Lf(iVar, z);
                    return Lf;
                }
            });
        }
        return ee2;
    }

    @Override
    public int mo9293aa() {
        return C11524j.m148w();
    }

    public final C6924j2 m34582ag(final C2434i iVar) {
        TdApi.LanguagePackInfo languagePackInfo = iVar.f8357a.f8363a;
        boolean d1 = C7389v0.m16644d1();
        C5320c cVar = new C5320c(1);
        C5320c cVar2 = new C5320c(1);
        C5146u0 u0Var = new C5146u0(1);
        CharSequence l = C1363c0.m37425l(new C10534a9(this.f30165a, m34554xf()), C4403w.m27861k1(languagePackInfo, d1 ? R.string.LoginErrorAirplane : R.string.LoginErrorOffline), null);
        cVar.m23284a(R.id.btn_settings);
        u0Var.m23815b(C4403w.m27861k1(languagePackInfo, R.string.Settings));
        cVar2.m23284a(R.drawable.baseline_settings_24);
        C6924j2 ee2 = m9261ee(l, cVar.m23280e(), u0Var.m23813d(), null, cVar2.m23280e(), C3342y9.f11113a);
        if (ee2 != null) {
            ee2.setDisableCancelOnTouchDown(true);
            ee2.setBackListener(new AbstractC9162c() {
                @Override
                public final boolean mo10135g0(boolean z) {
                    boolean Nf;
                    Nf = RunnableC2425ga.this.m34607Nf(iVar, z);
                    return Nf;
                }
            });
        }
        return ee2;
    }

    @Override
    public void mo29b1(C11131y6 y6Var, int i) {
        C11008t0.m1996f(this, y6Var, i);
    }

    public final void m34580bg() {
        m34566lf();
        if (!this.f8319B0) {
            this.f8319B0 = true;
            C1379j0.m37332e0(this, 17L);
        }
    }

    @Override
    public boolean mo9276cd(boolean z) {
        return true;
    }

    public final void m34578cg() {
        m34566lf();
        if (this.f8319B0) {
            this.f8319B0 = false;
            C1379j0.m37330f0(this);
        }
    }

    @Override
    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr;
        int i = 0;
        this.f8330M0[0] = 0;
        int[] iArr = this.f8332O0;
        iArr[0] = 0;
        int[] iArr2 = {12324, 5, 12323, 6, 12322, 5, 12325, 16, 12352, 4, 12338, 1, 12337, 2, 12326, 1, 12344};
        if (egl10.eglChooseConfig(eGLDisplay, iArr2, null, 0, iArr)) {
            int[] iArr3 = this.f8332O0;
            int i2 = iArr3[0];
            if (i2 <= 0) {
                iArr2 = new int[]{12324, 5, 12323, 6, 12322, 5, 12325, 16, 12352, 4, 12512, 1, 12513, 2, 12326, 1, 12344};
                if (!egl10.eglChooseConfig(eGLDisplay, iArr2, null, 0, iArr3)) {
                    Log.m14727e(16, "2nd eglChooseConfig failed", new Object[0]);
                }
                int[] iArr4 = this.f8332O0;
                i2 = iArr4[0];
                if (i2 <= 0) {
                    iArr2 = new int[]{12324, 5, 12323, 6, 12322, 5, 12325, 16, 12352, 4, 12326, 1, 12344};
                    if (!egl10.eglChooseConfig(eGLDisplay, iArr2, null, 0, iArr4)) {
                        Log.m14727e(16, "3rd eglChooseConfig failed", new Object[0]);
                    }
                    i2 = this.f8332O0[0];
                    if (i2 <= 0) {
                        Log.m14727e(16, "No configs match configSpec", new Object[0]);
                    }
                } else {
                    this.f8333P0 = true;
                }
            }
            int i3 = i2;
            EGLConfig[] eGLConfigArr2 = new EGLConfig[i3];
            if (!egl10.eglChooseConfig(eGLDisplay, iArr2, eGLConfigArr2, i3, this.f8332O0)) {
                Log.m14727e(16, "data eglChooseConfig failed", new Object[0]);
            }
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    eGLConfigArr = eGLConfigArr2;
                    i4 = -1;
                    break;
                }
                eGLConfigArr = eGLConfigArr2;
                if (m34559sf(egl10, eGLDisplay, eGLConfigArr2[i4], 12324, 0) == 5) {
                    break;
                }
                i4++;
                eGLConfigArr2 = eGLConfigArr;
            }
            if (i4 == -1) {
                Log.m14711w(16, "Did not find sane config, using first", new Object[0]);
            } else {
                i = i4;
            }
            EGLConfig eGLConfig = i3 > 0 ? eGLConfigArr[i] : null;
            if (eGLConfig != null) {
                return eGLConfig;
            }
            throw new IllegalArgumentException("No config chosen");
        }
        throw new IllegalArgumentException("eglChooseConfig failed");
    }

    @Override
    public void mo6904d6() {
        super.mo6904d6();
        View view = this.f8334n0;
        if (view != null) {
            ((GLSurfaceView) view).onPause();
        }
        m34578cg();
    }

    @Override
    public boolean mo9271db() {
        return true;
    }

    public final void m34576dg() {
        m34566lf();
        C2432g gVar = new C2432g();
        this.f8320C0 = gVar;
        gVar.m21855e(C1379j0.m37313o());
        int i = this.f8325H0;
        long j = 6000;
        j = 4000;
        if (i == 0) {
            j = 0;
        } else if (i == 1) {
            j = 3000;
        } else if (i != 2 && i != 4) {
            if (i == 5) {
                j = 1000;
            }
        }
        C1379j0.m37332e0(this.f8320C0, j + 8000);
    }

    @Override
    public void mo2996e0(int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 == 4 || i == 4) {
            m34554xf().m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    RunnableC2425ga.this.m34616Ef();
                }
            });
        }
    }

    public final void m34574eg() {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.f8324G0;
            if (i2 < strArr.length) {
                strArr[i2] = null;
                i2++;
            }
        }
        while (true) {
            CharSequence[] charSequenceArr = this.f8323F0;
            if (i < charSequenceArr.length) {
                charSequenceArr[i] = null;
                i++;
            } else {
                this.f8335o0.m34520h();
                m34572fg(true);
                this.f8335o0.invalidate();
                return;
            }
        }
    }

    public final void m34572fg(boolean z) {
        if (z) {
            this.f8335o0.m34521g();
        }
        int i = this.f8321D0;
        int i2 = this.f8326I0;
        if (i != i2 || z) {
            this.f8321D0 = i2;
            this.f8335o0.m34519i(i2, m34552zf(i2), m34558tf(this.f8321D0));
        }
        int i3 = this.f8326I0;
        int i4 = i3 + 1 > 5 ? -1 : i3 + 1;
        if (this.f8322E0 != i4 || z) {
            this.f8322E0 = i4;
            if (i4 == -1) {
                this.f8335o0.m34516l(-1, null, null);
            } else {
                this.f8335o0.m34516l(i4, m34552zf(i4), m34558tf(this.f8322E0));
            }
        }
    }

    @Override
    public void mo1777g(final String str, final TdApi.LanguagePackInfo languagePackInfo) {
        m34554xf().m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                RunnableC2425ga.this.m34613Hf(str, languagePackInfo);
            }
        });
    }

    @Override
    public void mo8853h4(int i) {
        if (i == 0) {
            m34576dg();
        } else if (i == 1 || i == 2) {
            m34580bg();
        }
    }

    public final void m34570hf(int i) {
        if (f8317R0 != i) {
            f8317R0 = i;
            C7888N.setColor(Color.red(i) / 255.0f, Color.green(i) / 255.0f, Color.blue(i) / 255.0f);
            m34592Vf();
        }
    }

    @Override
    public boolean mo9228jd() {
        return true;
    }

    public final float m34568jf(int i) {
        int i2 = this.f8325H0;
        if (i != i2) {
            if (i == i2 + 1) {
                return this.f8327J0 + 1.0f;
            }
            if (i == i2 - 1) {
                return this.f8327J0 - 1.0f;
            }
        }
        return this.f8327J0;
    }

    public final void m34567kf() {
        C2434i iVar = this.f8337q0;
        if (iVar != null) {
            iVar.m34550b();
            this.f8337q0 = null;
            m34564nf();
        }
    }

    @Override
    public void mo9216lc() {
        super.mo9216lc();
        View view = this.f8334n0;
        if (view != null) {
            view.setVisibility(8);
            this.f8336p0 = true;
        }
    }

    public final void m34566lf() {
        AbstractRunnableC5910b bVar = this.f8320C0;
        if (bVar != null) {
            bVar.m21857c();
            this.f8320C0 = null;
        }
    }

    @Override
    public void mo2995m3(TdApi.NetworkType networkType) {
        C10838m0.m3048b(this, networkType);
    }

    @Override
    public void mo134m7(boolean z, C11510b bVar) {
        super.mo134m7(z, bVar);
        m34563of();
        m34562pf(true);
        m34572fg(true);
        this.f8335o0.invalidate();
        m34570hf(C11524j.m148w());
        m34592Vf();
    }

    @Override
    public void mo9208mc(Configuration configuration) {
        super.mo9208mc(configuration);
        TdApi.LanguagePackInfo f0 = C4403w.m27882f0();
        TdApi.LanguagePackInfo Y = C4403w.m27915Y();
        if (!Y.f25405id.equals(this.f8340t0.m34538g())) {
            this.f8340t0 = new C2435j(Y, 2);
        }
        if (!f0.f25405id.equals(this.f8341u0.m34538g())) {
            if (f0.f25405id.equals(this.f8340t0.m34538g())) {
                this.f8341u0 = this.f8340t0;
            } else {
                this.f8341u0 = new C2435j(f0, 1);
            }
        }
        m34565mf();
    }

    public final void m34565mf() {
        C2435j jVar;
        if (!this.f8340t0.equals(this.f8341u0)) {
            jVar = this.f8341u0;
        } else {
            C2435j jVar2 = this.f8342v0;
            if (jVar2 == null) {
                jVar = this.f8340t0;
            } else if (jVar2.m34536i()) {
                jVar = this.f8342v0;
            } else {
                this.f8342v0.m34540e(new Runnable() {
                    @Override
                    public final void run() {
                        RunnableC2425ga.this.m34565mf();
                    }
                });
                this.f8342v0.m34530o(m34554xf());
                jVar = this.f8340t0;
            }
        }
        if (!this.f8339s0.equals(jVar)) {
            this.f8339s0 = jVar;
            mo9343T5(0, 0);
            this.f8344x0.setText(C4403w.m27861k1(this.f8340t0.f8363a, R.string.language_continueInLanguage));
            this.f8318A0.m29575p(!this.f8340t0.equals(this.f8339s0), m9339Ta());
        }
        if (!this.f8339s0.m34537h()) {
            this.f8339s0.m34531n(m34554xf());
        }
    }

    public final void m34564nf() {
        if (this.f8346z0 != null && !m9347Sa()) {
            C3940f fVar = this.f8346z0;
            C2434i iVar = this.f8337q0;
            fVar.m29575p(iVar != null && !iVar.f8359c, m9339Ta());
        }
    }

    @Override
    public void mo6871o6() {
        super.mo6871o6();
        View view = this.f8334n0;
        if (view != null) {
            ((GLSurfaceView) view).onResume();
        }
    }

    @Override
    public View mo403oc(Context context) {
        m34586Yf(true);
        m34619Bf();
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        C10192g.m5782i(frameLayoutFix, R.id.theme_color_filling, this);
        frameLayoutFix.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-2, -2, 51);
        t1.topMargin = View$OnClickListenerC9170d1.getTopOffset();
        C2427b bVar = new C2427b(context);
        bVar.setEGLContextClientVersion(2);
        bVar.setRenderer(this);
        bVar.setRenderMode(0);
        bVar.setLayoutParams(t1);
        frameLayoutFix.addView(bVar);
        this.f8334n0 = bVar;
        org.thunderdog.challegram.widget.ViewPager viewPager = new org.thunderdog.challegram.widget.ViewPager(context);
        viewPager.setAdapter(new C2433h(context));
        viewPager.setOverScrollMode(2);
        viewPager.mo18020c(this);
        viewPager.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        frameLayoutFix.addView(viewPager);
        FrameLayout.LayoutParams t12 = FrameLayoutFix.m18007t1(-2, -2, 85);
        C2428c cVar = new C2428c(context);
        cVar.setLayoutParams(t12);
        C2437l lVar = new C2437l(context);
        this.f8335o0 = lVar;
        lVar.m34525c(this);
        this.f8335o0.m34522f(m34552zf(0), m34552zf(1), m34552zf(2), m34552zf(3), m34552zf(4), m34552zf(5));
        this.f8335o0.m34523e(C1357a0.m37543g(), m34558tf(0), m34558tf(1), m34558tf(2), m34558tf(3), m34558tf(4), m34558tf(5));
        this.f8335o0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        cVar.addView(this.f8335o0);
        FrameLayout.LayoutParams t13 = FrameLayoutFix.m18007t1(-1, C1357a0.m37541i(48.0f), 80);
        int i = C1357a0.m37541i(16.0f);
        t13.rightMargin = i;
        t13.leftMargin = i;
        t13.bottomMargin = i;
        this.f8343w0 = new C2429d(context);
        RunnableC6969m2 m2Var = new RunnableC6969m2(C1379j0.m37307r(context), C1357a0.m37541i(3.5f));
        this.f8345y0 = m2Var;
        m2Var.m18275o(0.0f);
        this.f8345y0.m18291E(new C4343h(this.f8343w0));
        this.f8343w0.setId(R.id.btn_done);
        this.f8343w0.setPadding(0, 0, 0, C1357a0.m37541i(1.0f));
        this.f8343w0.setTypeface(C1389o.m37260i());
        this.f8343w0.setTextSize(1, 17.0f);
        this.f8343w0.setGravity(17);
        this.f8343w0.setText(m34556vf(R.string.StartMessaging));
        this.f8343w0.setOnClickListener(this);
        this.f8343w0.setOnLongClickListener(this);
        this.f8343w0.setLayoutParams(t13);
        this.f8343w0.setTextColor(C11524j.m228N(R.id.theme_color_textNeutral));
        m9119z8(this.f8343w0, R.id.theme_color_textNeutral);
        C10189d.m5797g(this.f8343w0);
        cVar.addView(this.f8343w0);
        C2430e eVar = new C2430e();
        DecelerateInterpolator decelerateInterpolator = C2057b.f7280b;
        this.f8346z0 = new C3940f(0, eVar, decelerateInterpolator, 180L);
        FrameLayout.LayoutParams t14 = FrameLayoutFix.m18007t1(-2, C1357a0.m37541i(48.0f), 81);
        t14.bottomMargin = C1357a0.m37541i(16.0f);
        C6847b2 b2Var = new C6847b2(context);
        this.f8344x0 = b2Var;
        b2Var.setId(R.id.btn_cancel);
        this.f8344x0.setTypeface(C1389o.m37258k());
        this.f8344x0.setTextSize(1, 17.0f);
        this.f8344x0.setGravity(17);
        this.f8344x0.setLayoutParams(t14);
        this.f8344x0.setOnClickListener(this);
        this.f8344x0.setPadding(C1357a0.m37541i(16.0f), 0, C1357a0.m37541i(16.0f), C1357a0.m37541i(1.0f));
        this.f8344x0.setTextColor(C11524j.m228N(R.id.theme_color_textNeutral));
        this.f8344x0.setTranslationY(C1357a0.m37541i(48.0f) + C1357a0.m37541i(16.0f));
        m9119z8(this.f8344x0, R.id.theme_color_textNeutral);
        cVar.addView(this.f8344x0);
        this.f8318A0 = new C3940f(0, new C2431f(), decelerateInterpolator, 180L);
        frameLayoutFix.addView(cVar);
        m34554xf().m2781K9().m1831n(this);
        m34554xf().m2781K9().m1866e0(this);
        C10536ab.m4667o1().m4716b1().m1554a(this);
        if (!this.f8340t0.equals(this.f8339s0)) {
            this.f8344x0.setText(C4403w.m27861k1(this.f8340t0.f8363a, R.string.language_continueInLanguage));
            this.f8318A0.m29575p(true, false);
        }
        m34565mf();
        return frameLayoutFix;
    }

    public final void m34563of() {
        synchronized (this.f8328K0) {
            int n = this.f8329L0.m21463n();
            for (int i = 0; i < n; i++) {
                this.f8329L0.m21462o(i).recycle();
            }
            this.f8329L0.m21474b();
        }
    }

    @Override
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.btn_cancel) {
            m34594Uf(true);
        } else if (id2 == R.id.btn_done) {
            m34594Uf(false);
        }
    }

    @Override
    public void onDrawFrame(GL10 gl10) {
        m34560rf();
    }

    @Override
    public boolean onLongClick(View view) {
        C5320c cVar = new C5320c(2);
        C5146u0 u0Var = new C5146u0(2);
        C5320c cVar2 = new C5320c(2);
        cVar.m23284a(R.id.btn_proxy);
        cVar2.m23284a(R.drawable.baseline_security_24);
        u0Var.m23815b(m34556vf(C4868i.m24726c2().m24764X1() ? R.string.ProxySettings : R.string.ProxyAdd));
        cVar.m23284a(R.id.btn_log_files);
        cVar2.m23284a(R.drawable.baseline_bug_report_24);
        u0Var.m23815b("Log Settings");
        m9261ee(null, cVar.m23280e(), u0Var.m23813d(), null, cVar2.m23280e(), new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view2, int i) {
                boolean Ff;
                Ff = RunnableC2425ga.this.m34615Ff(view2, i);
                return Ff;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23935a(this);
            }

            @Override
            public Object mo491b2(int i) {
                return C5115g0.m23934b(this, i);
            }
        });
        return true;
    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        m34590Wf(i, i2);
        m34592Vf();
    }

    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        m34618Cf(gl10);
    }

    @Override
    public void mo12p4(C11131y6 y6Var, TdApi.User user, boolean z, boolean z2) {
        C11008t0.m2001a(this, y6Var, user, z, z2);
    }

    @Override
    public void mo11p6(C11131y6 y6Var, int i) {
        C11008t0.m1998d(this, y6Var, i);
    }

    public final void m34562pf(boolean z) {
        if (!z) {
            C5062b.m24164h(this.f8324G0);
        }
        C5062b.m24164h(this.f8323F0);
    }

    @Override
    public void mo1776q3(boolean z) {
        C11020tb.m1987b(this, z);
    }

    public final void m34561qf() {
        synchronized (this.f8328K0) {
            int n = this.f8328K0.m21463n();
            for (int i = 0; i < n; i++) {
                this.f8328K0.m21462o(i).recycle();
            }
            this.f8328K0.m21474b();
        }
        m34563of();
    }

    @Override
    public void mo1775r7(boolean z) {
        C11020tb.m1983f(this, z);
    }

    public final void m34560rf() {
        C7888N.setDate(((float) (System.currentTimeMillis() - this.f8331N0)) / 1000.0f);
        C7888N.onDrawFrame();
        m34586Yf(false);
    }

    @Override
    public void run() {
        m34592Vf();
        if (this.f8319B0) {
            C1379j0.m37332e0(this, 17L);
        }
    }

    @Override
    public void mo9166sc() {
        super.mo9166sc();
        if (C1379j0.m37358J()) {
            m34598Sf(true);
            return;
        }
        C2434i iVar = this.f8337q0;
        if (iVar != null && iVar.f8362f) {
            m34600Rf(iVar);
        }
    }

    public final int m34559sf(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f8332O0) ? this.f8332O0[0] : i2;
    }

    @Override
    public void mo1774t4(boolean z) {
        C11020tb.m1986c(this, z);
    }

    public final CharSequence m34558tf(int i) {
        CharSequence[] charSequenceArr = this.f8323F0;
        if (charSequenceArr[i] != null) {
            return charSequenceArr[i];
        }
        String vf = m34556vf(m34620Af(i, true));
        CharSequence[] charSequenceArr2 = this.f8323F0;
        CharSequence Z = C1363c0.m37448Z(vf, R.id.theme_color_text);
        charSequenceArr2[i] = Z;
        return Z;
    }

    public final Bitmap m34557uf() {
        Bitmap e;
        synchronized (this.f8328K0) {
            e = this.f8329L0.m21471e(0);
        }
        if (e != null) {
            return e;
        }
        int i = C1357a0.m37541i(220.0f);
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawCircle(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2, createBitmap.getWidth() / 2, C1410y.m37039g(-13261090));
        C7389v0.m16571v2(canvas);
        synchronized (this.f8328K0) {
            this.f8329L0.m21466j(0, createBitmap);
        }
        return createBitmap;
    }

    @Override
    public void mo4v4(C11131y6 y6Var, TdApi.User user, int i, C11131y6 y6Var2) {
        C11008t0.m1999c(this, y6Var, user, i, y6Var2);
    }

    public String m34556vf(int i) {
        return C4403w.m27861k1(this.f8339s0.f8363a, i);
    }

    @Override
    public void mo8833x(int i, float f, int i2) {
        this.f8326I0 = i;
        this.f8327J0 = f;
        m34572fg(false);
        float jf = m34568jf(i);
        this.f8335o0.m34518j(f, jf);
        C7888N.setScrollOffset(jf);
        m34592Vf();
    }

    @Override
    public void mo8832x4(int i) {
        if (this.f8325H0 != i) {
            this.f8325H0 = i;
            this.f8335o0.m34517k(i, m34568jf(this.f8326I0));
            C7888N.setPage(i);
        }
    }

    public final C10930q6 m34554xf() {
        return this.f30165a.m14410z0();
    }

    public final Bitmap m34553yf(int i) {
        Bitmap e;
        synchronized (this.f8328K0) {
            e = this.f8328K0.m21471e(i);
            if (e == null || e.isRecycled()) {
                e = BitmapFactory.decodeResource(C1379j0.m37372B(), i);
                this.f8328K0.m21466j(i, e);
            }
        }
        return e;
    }

    public final String m34552zf(int i) {
        String[] strArr = this.f8324G0;
        if (strArr[i] != null) {
            return strArr[i];
        }
        String vf = m34556vf(m34620Af(i, false));
        strArr[i] = vf;
        return vf;
    }
}
