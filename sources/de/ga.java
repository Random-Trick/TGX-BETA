package de;

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
import ce.a0;
import ce.c0;
import ce.j0;
import ce.o;
import ce.v;
import ce.y;
import de.ga;
import eb.k;
import gd.w;
import ie.g0;
import ie.h0;
import ie.u0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.opengles.GL10;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ne.j2;
import ne.m2;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.MainActivity;
import org.thunderdog.challegram.N;
import org.thunderdog.challegram.R;
import ud.d1;
import ud.v4;
import zd.k0;
import zd.l0;
import zd.o6;
import zd.r0;
import zd.rb;
import zd.s0;
import zd.sb;
import zd.w6;
import zd.y8;
import zd.ya;

public class ga extends v4<Void> implements GLSurfaceView.EGLConfigChooser, GLSurfaceView.Renderer, ViewPager.i, Runnable, View.OnClickListener, View.OnLongClickListener, sb, l0, s0 {
    public static boolean Q0 = false;
    public static int R0 = -1;
    public eb.f A0;
    public boolean B0;
    public kb.b C0;
    public int H0;
    public int I0;
    public float J0;
    public boolean P0;
    public View f8051n0;
    public l f8052o0;
    public boolean f8053p0;
    public i f8054q0;
    public boolean f8055r0;
    public j f8056s0;
    public j f8057t0;
    public j f8058u0;
    public j f8059v0;
    public TextView f8060w0;
    public TextView f8061x0;
    public m2 f8062y0;
    public eb.f f8063z0;
    public int D0 = -1;
    public int E0 = -1;
    public CharSequence[] F0 = new CharSequence[6];
    public final String[] G0 = new String[6];
    public final k0.h<Bitmap> K0 = new k0.h<>(23);
    public final k0.h<Bitmap> L0 = new k0.h<>(2);
    public int[] M0 = new int[1];
    public long N0 = System.currentTimeMillis() - 1000;
    public int[] O0 = new int[1];

    public class a extends kb.b {
        public final i M;

        public a(i iVar) {
            this.M = iVar;
        }

        @Override
        public void b() {
            if (!this.M.f8071c && !ga.this.Sa() && !this.M.e(1)) {
                j2 Zf = ga.this.Zf(this.M);
                if (Zf != null) {
                    this.M.g(Zf, 1);
                } else {
                    this.M.f8074f = true;
                }
            }
        }
    }

    public class b extends GLSurfaceView {
        public b(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            int size = View.MeasureSpec.getSize(i10);
            int size2 = View.MeasureSpec.getSize(i11);
            if (size >= size2) {
                size /= 2;
            } else {
                size2 = Math.min(size, size2 / 2);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(size2, Log.TAG_TDLIB_OPTIONS));
            requestRender();
        }
    }

    public class c extends FrameLayoutFix {
        public c(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            int size = View.MeasureSpec.getSize(i10);
            int size2 = View.MeasureSpec.getSize(i11);
            if (size >= size2) {
                size /= 2;
                ga.this.f8052o0.m(true);
            } else {
                size2 -= Math.min(size, size2 / 2);
                ga.this.f8052o0.m(false);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(size2, Log.TAG_TDLIB_OPTIONS));
        }
    }

    public class d extends b2 {
        public d(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            ga.this.f8062y0.c(canvas);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (getLayout() != null && getLayout().getLineCount() > 0) {
                int i12 = a0.i(24.0f);
                int measuredWidth = (getMeasuredWidth() / 2) + (((int) getLayout().getLineWidth(0)) / 2) + a0.i(16.0f);
                int measuredHeight = getMeasuredHeight() / 2;
                int i13 = i12 / 2;
                ga.this.f8062y0.p(measuredWidth - i13, measuredHeight - i13, measuredWidth + i13, measuredHeight + i13);
            }
        }
    }

    public class e implements k.b {
        public e() {
        }

        @Override
        public void n4(int i10, float f10, float f11, eb.k kVar) {
            ga.this.f8062y0.o(f10);
        }

        @Override
        public void o4(int i10, float f10, eb.k kVar) {
        }
    }

    public class f implements k.b {
        public f() {
        }

        @Override
        public void n4(int i10, float f10, float f11, eb.k kVar) {
            ga.this.f8061x0.setTranslationY((a0.i(48.0f) + a0.i(16.0f)) * (1.0f - f10));
            ga.this.f8060w0.setTranslationY((-a0.i(48.0f)) * f10);
            ga.this.f8052o0.n(f10);
        }

        @Override
        public void o4(int i10, float f10, eb.k kVar) {
        }
    }

    public class g extends kb.b {
        public g() {
        }

        @Override
        public void b() {
            ga.this.cg();
        }
    }

    public static class h extends e2.a {
        public FrameLayoutFix[] M = new FrameLayoutFix[e()];
        public final Context f8068c;

        public h(Context context) {
            this.f8068c = context;
        }

        @Override
        public void b(ViewGroup viewGroup, int i10, Object obj) {
            viewGroup.removeView((ViewGroup) obj);
        }

        @Override
        public int e() {
            return 6;
        }

        @Override
        public Object j(ViewGroup viewGroup, int i10) {
            FrameLayoutFix[] frameLayoutFixArr = this.M;
            if (frameLayoutFixArr[i10] == null) {
                frameLayoutFixArr[i10] = new FrameLayoutFix(this.f8068c);
                this.M[i10].setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            }
            viewGroup.addView(this.M[i10]);
            return this.M[i10];
        }

        @Override
        public boolean k(View view, Object obj) {
            return view == obj;
        }
    }

    public static class i {
        public final j f8069a;
        public boolean f8070b;
        public boolean f8071c;
        public j2 f8072d;
        public kb.b f8073e;
        public boolean f8074f;

        public i(j jVar) {
            this.f8069a = jVar;
        }

        public void b() {
            if (!this.f8071c) {
                this.f8071c = true;
                c();
                f(null);
                this.f8074f = false;
            }
        }

        public void c() {
            g(null, 0);
        }

        public final k d() {
            j2 j2Var = this.f8072d;
            if (j2Var == null || j2Var.u2() || this.f8072d.getBoundView() == null || !(this.f8072d.getBoundView().getTag() instanceof k)) {
                return null;
            }
            return (k) this.f8072d.getBoundView().getTag();
        }

        public boolean e(int i10) {
            k d10 = d();
            return d10 != null && d10.f8082b == i10;
        }

        public void f(kb.b bVar) {
            kb.b bVar2 = this.f8073e;
            if (bVar2 != null) {
                bVar2.c();
            }
            this.f8073e = bVar;
        }

        public void g(j2 j2Var, int i10) {
            j2 j2Var2 = this.f8072d;
            if (j2Var2 != null && !j2Var2.u2()) {
                j2 j2Var3 = this.f8072d;
                j2Var3.s2(j0.r(j2Var3.getContext()).L0() == 0);
            }
            this.f8072d = j2Var;
            if (j2Var != null) {
                j2Var.getBoundView().setTag(new k(this, i10));
            }
        }
    }

    public static class j {
        public final TdApi.LanguagePackInfo f8075a;
        public int f8076b;
        public o6 f8077c;
        public o6 f8078d;
        public List<kb.i> f8079e;
        public List<Runnable> f8080f;

        public j(TdApi.LanguagePackInfo languagePackInfo, int i10) {
            this.f8075a = languagePackInfo;
            this.f8076b = i10;
        }

        public void j(o6 o6Var, boolean z10) {
            o6 o6Var2 = this.f8077c;
            if (o6Var2 == o6Var || z10) {
                if (o6Var2 == o6Var) {
                    this.f8077c = null;
                }
                if (z10) {
                    q();
                }
                p(z10);
            }
        }

        public void k(final o6 o6Var, final boolean z10) {
            if (!z10) {
                Log.e("Failed to load language from intro", new Object[0]);
            }
            o6Var.hd().post(new Runnable() {
                @Override
                public final void run() {
                    ga.j.this.j(o6Var, z10);
                }
            });
        }

        public void l(o6 o6Var, boolean z10) {
            o6 o6Var2 = this.f8078d;
            if (o6Var2 == o6Var || z10) {
                if (o6Var2 == o6Var) {
                    this.f8078d = null;
                }
                if (z10) {
                    q();
                }
            }
        }

        public void m(final o6 o6Var, Map map) {
            final boolean z10 = map != null;
            if (!z10) {
                Log.e("Failed to load intro strings", new Object[0]);
            }
            o6Var.hd().post(new Runnable() {
                @Override
                public final void run() {
                    ga.j.this.l(o6Var, z10);
                }
            });
        }

        public void e(Runnable runnable) {
            if (i()) {
                runnable.run();
                return;
            }
            if (this.f8080f == null) {
                this.f8080f = new ArrayList();
            }
            if (!this.f8080f.contains(runnable)) {
                this.f8080f.add(runnable);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof j) && ((j) obj).g().equals(g());
        }

        public void f(kb.i iVar) {
            if (h()) {
                iVar.a(true);
                return;
            }
            if (this.f8079e == null) {
                this.f8079e = new ArrayList();
            }
            this.f8079e.add(iVar);
        }

        public String g() {
            return this.f8075a.f19945id;
        }

        public boolean h() {
            return this.f8076b == 2;
        }

        public boolean i() {
            int i10 = this.f8076b;
            return i10 == 2 || i10 == 1;
        }

        public void n(final o6 o6Var) {
            if (this.f8077c != o6Var && !h()) {
                this.f8077c = o6Var;
                o6Var.Nc(this.f8075a, new kb.i() {
                    @Override
                    public final void a(boolean z10) {
                        ga.j.this.k(o6Var, z10);
                    }
                });
            }
        }

        public void o(final o6 o6Var) {
            if (this.f8077c != o6Var && this.f8078d != o6Var && !i()) {
                this.f8078d = o6Var;
                o6Var.g6(this.f8075a, w.A0(ga.wf()), new kb.j() {
                    @Override
                    public final void a(Object obj) {
                        ga.j.this.m(o6Var, (Map) obj);
                    }
                });
            }
        }

        public final void p(boolean z10) {
            if (z10 && this.f8076b != 2) {
                this.f8076b = 2;
            }
            List<kb.i> list = this.f8079e;
            this.f8079e = null;
            if (list != null) {
                for (kb.i iVar : list) {
                    iVar.a(z10);
                }
            }
        }

        public final void q() {
            if (this.f8076b == 0) {
                this.f8076b = 1;
            }
            List<Runnable> list = this.f8080f;
            this.f8080f = null;
            if (list != null) {
                for (Runnable runnable : list) {
                    runnable.run();
                }
            }
        }
    }

    public static class k {
        public final i f8081a;
        public final int f8082b;

        public k(i iVar, int i10) {
            this.f8081a = iVar;
            this.f8082b = i10;
        }
    }

    public static class l extends View {
        public boolean P;
        public float Q;
        public String S;
        public float T;
        public CharSequence U;
        public String W;
        public Paint f8083a;
        public float f8084a0;
        public TextPaint f8085b;
        public CharSequence f8086b0;
        public int f8089d0;
        public float f8090e0;
        public float f8091f0;
        public int f8092g0;
        public float f8093h0;
        public int R = -1;
        public int V = -1;
        public StaticLayout[] f8088c0 = new StaticLayout[6];
        public final float[] M = new float[6];
        public int N = a0.i(16.0f);
        public int O = a0.i(42.0f);
        public int f8087c = a0.i(22.0f);

        public l(Context context) {
            super(context);
            Paint paint = new Paint(5);
            this.f8083a = paint;
            paint.setTextSize(a0.i(24.0f));
            this.f8083a.setTypeface(o.i());
            this.f8083a.setColor(ae.j.P0());
            TextPaint textPaint = new TextPaint(5);
            this.f8085b = textPaint;
            textPaint.setTextSize(a0.i(16.0f));
            this.f8085b.setTypeface(o.k());
            this.f8085b.setColor(ae.j.P0());
        }

        public static int d() {
            return a0.i(3.0f);
        }

        public final StaticLayout a(int i10, CharSequence charSequence) {
            StaticLayout[] staticLayoutArr;
            int measuredWidth = getMeasuredWidth();
            if (i10 == -1 || charSequence == null || measuredWidth == 0) {
                return null;
            }
            int i11 = this.f8089d0;
            if (i11 != measuredWidth) {
                if (i11 != 0) {
                    int i12 = 0;
                    for (StaticLayout staticLayout : this.f8088c0) {
                        i12++;
                        this.f8088c0[i12] = null;
                    }
                }
                this.f8089d0 = measuredWidth;
            }
            StaticLayout[] staticLayoutArr2 = this.f8088c0;
            if (staticLayoutArr2[i10] != null) {
                return staticLayoutArr2[i10];
            }
            TextPaint textPaint = this.f8085b;
            if (measuredWidth - (a0.i(16.0f) * 2) >= 0) {
                measuredWidth -= a0.i(16.0f) * 2;
            }
            StaticLayout staticLayout2 = new StaticLayout(charSequence, textPaint, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, d(), false);
            this.f8088c0[i10] = staticLayout2;
            return staticLayout2;
        }

        public final float b(int i10, String str) {
            float[] fArr = this.M;
            if (fArr[i10] != 0.0f) {
                return fArr[i10];
            }
            float T1 = v0.T1(str, this.f8083a);
            fArr[i10] = T1;
            return T1;
        }

        public void c(ga gaVar) {
            gaVar.Ba().g(this.f8083a, R.id.theme_color_text, 5);
            gaVar.Ba().g(this.f8085b, R.id.theme_color_text, 5);
        }

        public void e(int i10, CharSequence... charSequenceArr) {
            StaticLayout[] staticLayoutArr;
            this.f8089d0 = i10;
            int i11 = 0;
            for (StaticLayout staticLayout : this.f8088c0) {
                this.f8088c0[i11] = new StaticLayout(charSequenceArr[i11], this.f8085b, i10 - (a0.i(16.0f) * 2) < 0 ? i10 : i10 - (a0.i(16.0f) * 2), Layout.Alignment.ALIGN_CENTER, 1.0f, d(), false);
                i11++;
            }
        }

        public void f(String... strArr) {
            float[] fArr;
            int i10 = 0;
            for (float f10 : this.M) {
                this.M[i10] = v0.T1(strArr[i10], this.f8083a);
                i10++;
            }
        }

        public void g() {
            ib.b.h(this.f8088c0);
        }

        public void h() {
            int i10 = 0;
            while (true) {
                float[] fArr = this.M;
                if (i10 < fArr.length) {
                    fArr[i10] = 0.0f;
                    i10++;
                } else {
                    return;
                }
            }
        }

        public void i(int i10, String str, CharSequence charSequence) {
            this.R = i10;
            this.S = str;
            this.T = b(i10, str);
            this.U = charSequence;
        }

        public void j(float f10, float f11) {
            if (this.f8090e0 != f10 || this.f8091f0 != f11) {
                this.f8090e0 = f10;
                this.f8091f0 = f11;
                if (f11 == 0.0f) {
                    this.f8093h0 = 0.0f;
                }
                invalidate();
            }
        }

        public void k(int i10, float f10) {
            if (this.f8092g0 != i10 || this.f8091f0 != f10) {
                this.f8092g0 = i10;
                this.f8091f0 = f10;
                this.f8093h0 = f10;
                invalidate();
            }
        }

        public void l(int i10, String str, CharSequence charSequence) {
            this.V = i10;
            if (i10 == -1) {
                this.W = null;
                this.f8084a0 = 0.0f;
                this.f8086b0 = null;
                return;
            }
            this.W = str;
            this.f8084a0 = b(i10, str);
            this.f8086b0 = charSequence;
        }

        public void m(boolean z10) {
            this.P = z10;
        }

        public void n(float f10) {
            if (this.Q != f10) {
                this.Q = f10;
                invalidate();
            }
        }

        @Override
        public void onDraw(android.graphics.Canvas r12) {
            throw new UnsupportedOperationException("Method not decompiled: de.ga.l.onDraw(android.graphics.Canvas):void");
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            a(this.R, this.U);
            a(this.V, this.f8086b0);
        }
    }

    public ga(Context context) {
        super(context, null);
    }

    public static int Af(int i10, boolean z10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? z10 ? R.string.Page1Message : R.string.Page1Title : z10 ? R.string.Page6Message : R.string.Page6Title : z10 ? R.string.Page5Message : R.string.Page5Title : z10 ? R.string.Page4Message : R.string.Page4Title : z10 ? R.string.Page3Message : R.string.Page3Title : z10 ? R.string.Page2Message : R.string.Page2Title : z10 ? R.string.Page1Message : R.string.Page1Title;
    }

    public static boolean Df() {
        if (!he.i.c2().g2()) {
            return false;
        }
        Log.w("Not showing intro controller, because it has failed once", new Object[0]);
        return true;
    }

    public void Ef() {
        if (!Sa()) {
            Rf(this.f8054q0);
        }
    }

    public boolean Ff(View view, int i10) {
        if (i10 == R.id.btn_log_files) {
            ac(new vr(this.f24493a, xf()));
        } else if (i10 == R.id.btn_proxy) {
            xf().hd().x7(new y8(this.f24493a, xf()), true);
        } else if (i10 == R.id.btn_test && !j0.J()) {
            j0.f5280g = 2;
            Sf(true);
        }
        return true;
    }

    public void Gf() {
        if (!this.f8053p0) {
            this.f8051n0.setVisibility(0);
            Vf();
        }
    }

    public void Hf(String str, TdApi.LanguagePackInfo languagePackInfo) {
        if (!Sa()) {
            Xf(str, languagePackInfo);
            mf();
        }
    }

    public void If(i iVar, boolean z10) {
        if (z10) {
            Rf(iVar);
            return;
        }
        Log.e("Unexpected server error. Proceeding in English.", new Object[0]);
        Uf(true);
    }

    public boolean Jf(TdApi.LanguagePackInfo languagePackInfo, View view, int i10) {
        String str;
        if (i10 == R.id.btn_help) {
            TdApi.NetworkType ia2 = xf().ia();
            if (ia2 != null) {
                switch (ia2.getConstructor()) {
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
            if (xf().T6()) {
                str = str + ", " + w.k1(languagePackInfo, R.string.Connected);
            }
            v.L(w.u1(R.string.email_SmsHelp, new Object[0]), w.k1(languagePackInfo, R.string.email_LoginTooLong_subject), w.l1(languagePackInfo, R.string.email_LoginTooLong_text, "0.24.8.1519-arm64-v8a", languagePackInfo.f19945id, w.v0((int) (xf().dd() / 1000)) + " (" + str + ")", ya.P0(), ya.Q0()), w.k1(languagePackInfo, R.string.HelpEmailError));
        } else if (i10 == R.id.btn_proxy) {
            xf().hd().x7(new y8(this.f24493a, xf()), true);
        }
        return true;
    }

    public void Kf(View view) {
        if (!Sa()) {
            view.setVisibility(0);
        }
    }

    public boolean Lf(i iVar, boolean z10) {
        if (this.f8054q0 != iVar) {
            return false;
        }
        kf();
        return false;
    }

    public static boolean Mf(View view, int i10) {
        if (i10 != R.id.btn_settings) {
            return true;
        }
        if (v0.d1()) {
            v.m();
            return true;
        }
        v.G();
        return true;
    }

    public boolean Nf(i iVar, boolean z10) {
        if (this.f8054q0 != iVar) {
            return false;
        }
        kf();
        return false;
    }

    public static void Yf(boolean z10) {
        if (Q0 != z10) {
            Q0 = z10;
            he.i.c2().P4(z10);
        }
    }

    public static boolean m3if(int i10) {
        switch (i10) {
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

    public static int[] wf() {
        return new int[]{R.string.StartMessaging, R.string.Page1Title, R.string.Page1Message, R.string.Page2Title, R.string.Page2Message, R.string.Page3Title, R.string.Page3Message, R.string.Page4Title, R.string.Page4Message, R.string.Page5Title, R.string.Page5Message, R.string.Page6Title, R.string.Page6Message};
    }

    @Override
    public void Ac() {
        super.Ac();
        View view = this.f8051n0;
        if (view != null && view.getVisibility() != 0) {
            this.f8053p0 = false;
            j0.e0(new Runnable() {
                @Override
                public final void run() {
                    ga.this.Gf();
                }
            }, 50L);
        }
    }

    @Override
    public boolean B8() {
        return false;
    }

    public final void Bf() {
        TdApi.LanguagePackInfo f02 = w.f0();
        TdApi.LanguagePackInfo Y = w.Y();
        this.f8057t0 = new j(Y, 2);
        if (f02.f19945id.equals(Y.f19945id)) {
            this.f8058u0 = this.f8057t0;
        } else {
            this.f8058u0 = new j(f02, 1);
        }
        this.f8056s0 = this.f8058u0;
        Xf(xf().Hc(), xf().Ic());
    }

    public final void Cf(GL10 gl10) {
        N.setIcTextures(Of(gl10, R.drawable.intro_ic_bubble_dot), Of(gl10, R.drawable.intro_ic_bubble), Of(gl10, R.drawable.intro_ic_cam_lens), Of(gl10, R.drawable.intro_ic_cam), Of(gl10, R.drawable.intro_ic_pencil), Of(gl10, R.drawable.intro_ic_pin), Of(gl10, R.drawable.intro_ic_smile_eye), Of(gl10, R.drawable.intro_ic_smile), Of(gl10, R.drawable.intro_ic_videocam));
        N.setTelegramTextures(Pf(gl10, uf()), Of(gl10, R.drawable.intro_tg_plane));
        N.setPowerfulTextures(Of(gl10, R.drawable.intro_powerful_mask), Of(gl10, R.drawable.intro_powerful_star), Of(gl10, R.drawable.intro_powerful_infinity), Of(gl10, R.drawable.intro_powerful_infinity_white));
        N.setPrivateTextures(Of(gl10, R.drawable.intro_private_door), Of(gl10, R.drawable.intro_private_screw));
        N.setFastTextures(Of(gl10, R.drawable.intro_fast_body), Of(gl10, R.drawable.intro_fast_spiral), Of(gl10, R.drawable.intro_fast_arrow), Of(gl10, R.drawable.intro_fast_arrow_shadow));
        N.setFreeTextures(Of(gl10, R.drawable.intro_knot_up), Of(gl10, R.drawable.intro_knot_down));
        hf(ae.j.u());
        N.onSurfaceCreated();
    }

    @Override
    public void D4(w6 w6Var, boolean z10, boolean z11) {
        r0.b(this, w6Var, z10, z11);
    }

    @Override
    public void G0(boolean z10) {
        rb.a(this, z10);
    }

    @Override
    public void G2(TdApi.SuggestedAction[] suggestedActionArr, TdApi.SuggestedAction[] suggestedActionArr2) {
        rb.d(this, suggestedActionArr, suggestedActionArr2);
    }

    @Override
    public boolean Ie() {
        return false;
    }

    @Override
    public boolean Me() {
        return true;
    }

    @Override
    public void N6(w6 w6Var, int i10) {
        r0.f(this, w6Var, i10);
    }

    public final int Of(GL10 gl10, int i10) {
        return Pf(gl10, yf(i10));
    }

    public final int Pf(GL10 gl10, Bitmap bitmap) {
        this.M0[0] = 0;
        int[] iArr = this.O0;
        iArr[0] = 0;
        if (gl10 != null) {
            gl10.glGenTextures(1, iArr, 0);
            gl10.glBindTexture(3553, this.O0[0]);
            gl10.glTexParameterf(3553, 10241, 9729.0f);
            gl10.glTexParameterf(3553, 10240, 9729.0f);
            gl10.glTexParameterf(3553, 10242, 33071.0f);
            gl10.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        } else {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, this.O0[0]);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        }
        return this.O0[0];
    }

    @Override
    public void Q5(int i10, int i11) {
        if (!this.f8055r0) {
            super.Q5(i10, i11);
            if (i10 == 0) {
                TextView textView = this.f8060w0;
                if (textView != null) {
                    textView.setText(vf(R.string.StartMessaging));
                }
                if (this.f8052o0 != null) {
                    eg();
                }
            } else if (i10 == 2) {
                TextView textView2 = this.f8060w0;
                if (textView2 != null && i11 == R.string.StartMessaging) {
                    textView2.setText(vf(R.string.StartMessaging));
                }
                if (this.f8052o0 != null && m3if(i11)) {
                    eg();
                }
            }
        }
    }

    public final boolean Qf() {
        return !Sa() && xf().C7();
    }

    @Override
    public int R9() {
        return R.id.controller_intro;
    }

    public final void Rf(final i iVar) {
        if (iVar != null && !iVar.f8071c) {
            this.f8054q0 = iVar;
            iVar.f(null);
            iVar.f8074f = false;
            if (Qf()) {
                if (!iVar.e(0)) {
                    j2 ag = ag(iVar);
                    if (ag != null) {
                        nf();
                        iVar.g(ag, 0);
                        return;
                    }
                    iVar.f8074f = true;
                    iVar.c();
                }
            } else if (!iVar.f8069a.h()) {
                if (!iVar.e(1)) {
                    iVar.c();
                }
                nf();
                if (!iVar.f8070b) {
                    iVar.f8070b = true;
                    iVar.f8069a.f(new kb.i() {
                        @Override
                        public final void a(boolean z10) {
                            ga.this.If(iVar, z10);
                        }
                    });
                }
                iVar.f8069a.n(xf());
                a aVar = new a(iVar);
                iVar.f(aVar);
                xf().hd().postDelayed(aVar, xf().f2(4000L));
            } else {
                iVar.c();
                this.f8055r0 = true;
                w.s(iVar.f8069a.f8075a);
                this.f8054q0 = null;
                nf();
                ac(new fk(this.f24493a, xf()));
            }
        }
    }

    @Override
    public void S(w6 w6Var, int i10) {
        r0.d(this, w6Var, i10);
    }

    public final void Sf(boolean z10) {
        if (xf().A1().G() != z10) {
            ((MainActivity) this.f24493a).u4(z10);
        }
        Uf(false);
    }

    public final void Tf() {
        xf().O9().V(this);
        xf().O9().r0(this);
        ya.o1().b1().x(this);
    }

    @Override
    public void U3(int i10) {
        if (i10 == 0) {
            dg();
        } else if (i10 == 1 || i10 == 2) {
            bg();
        }
    }

    public final void Uf(boolean z10) {
        j jVar = z10 ? this.f8057t0 : this.f8056s0;
        i iVar = this.f8054q0;
        if (iVar == null || !iVar.f8069a.equals(jVar)) {
            kf();
            Rf(new i(jVar));
        }
    }

    @Override
    public void V1(w6 w6Var, TdApi.User user, int i10, w6 w6Var2) {
        r0.c(this, w6Var, user, i10, w6Var2);
    }

    public final void Vf() {
        View view = this.f8051n0;
        if (view != null) {
            ((GLSurfaceView) view).requestRender();
        }
    }

    public final void Wf(int i10, int i11) {
        N.onSurfaceChanged(i10, i11, a0.h(), 0);
    }

    public final void Xf(String str, TdApi.LanguagePackInfo languagePackInfo) {
        if (ib.i.i(str)) {
            this.f8059v0 = null;
        } else if (str.equals(this.f8057t0.g())) {
            this.f8059v0 = this.f8057t0;
        } else if (str.equals(this.f8058u0.g())) {
            this.f8059v0 = this.f8058u0;
        } else if (languagePackInfo != null) {
            this.f8059v0 = new j(languagePackInfo, 0);
        } else {
            this.f8059v0 = null;
        }
    }

    @Override
    public void Z8() {
        super.Z8();
        kf();
        cg();
        qf();
        pf(false);
        Tf();
    }

    public final j2 Zf(final i iVar) {
        final View findViewById;
        jb.c cVar = new jb.c(2);
        jb.c cVar2 = new jb.c(2);
        u0 u0Var = new u0(2);
        final TdApi.LanguagePackInfo languagePackInfo = iVar.f8069a.f8075a;
        cVar.a(R.id.btn_proxy);
        u0Var.b(w.k1(languagePackInfo, he.i.c2().X1() ? R.string.ProxySettings : R.string.ProxyAdd));
        cVar2.a(R.drawable.baseline_security_24);
        cVar.a(R.id.btn_help);
        u0Var.b(w.k1(languagePackInfo, R.string.Help));
        cVar2.a(R.drawable.baseline_help_24);
        long f22 = xf().f2(12000L);
        j2 ee2 = ee(c0.l(new y8(this.f24493a, xf()), w.k1(languagePackInfo, R.string.LoginErrorLongConnecting), null), cVar.e(), u0Var.d(), null, cVar2.e(), new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean Jf;
                Jf = ga.this.Jf(languagePackInfo, view, i10);
                return Jf;
            }
        });
        if (ee2 != null) {
            if (f22 > 0 && (findViewById = ee2.getBoundView().findViewById(R.id.btn_help)) != null) {
                findViewById.setVisibility(8);
                xf().hd().postDelayed(new Runnable() {
                    @Override
                    public final void run() {
                        ga.this.Kf(findViewById);
                    }
                }, f22);
            }
            ee2.setDisableCancelOnTouchDown(true);
            ee2.setBackListener(new ud.c() {
                @Override
                public final boolean j0(boolean z10) {
                    boolean Lf;
                    Lf = ga.this.Lf(iVar, z10);
                    return Lf;
                }
            });
        }
        return ee2;
    }

    @Override
    public int aa() {
        return ae.j.u();
    }

    public final j2 ag(final i iVar) {
        TdApi.LanguagePackInfo languagePackInfo = iVar.f8069a.f8075a;
        boolean d12 = v0.d1();
        jb.c cVar = new jb.c(1);
        jb.c cVar2 = new jb.c(1);
        u0 u0Var = new u0(1);
        CharSequence l10 = c0.l(new y8(this.f24493a, xf()), w.k1(languagePackInfo, d12 ? R.string.LoginErrorAirplane : R.string.LoginErrorOffline), null);
        cVar.a(R.id.btn_settings);
        u0Var.b(w.k1(languagePackInfo, R.string.Settings));
        cVar2.a(R.drawable.baseline_settings_24);
        j2 ee2 = ee(l10, cVar.e(), u0Var.d(), null, cVar2.e(), y9.f10159a);
        if (ee2 != null) {
            ee2.setDisableCancelOnTouchDown(true);
            ee2.setBackListener(new ud.c() {
                @Override
                public final boolean j0(boolean z10) {
                    boolean Nf;
                    Nf = ga.this.Nf(iVar, z10);
                    return Nf;
                }
            });
        }
        return ee2;
    }

    public final void bg() {
        lf();
        if (!this.B0) {
            this.B0 = true;
            j0.e0(this, 17L);
        }
    }

    @Override
    public void c6() {
        super.c6();
        View view = this.f8051n0;
        if (view != null) {
            ((GLSurfaceView) view).onPause();
        }
        cg();
    }

    @Override
    public boolean cd(boolean z10) {
        return true;
    }

    public final void cg() {
        lf();
        if (this.B0) {
            this.B0 = false;
            j0.f0(this);
        }
    }

    @Override
    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr;
        int i10 = 0;
        this.M0[0] = 0;
        int[] iArr = this.O0;
        iArr[0] = 0;
        int[] iArr2 = {12324, 5, 12323, 6, 12322, 5, 12325, 16, 12352, 4, 12338, 1, 12337, 2, 12326, 1, 12344};
        if (egl10.eglChooseConfig(eGLDisplay, iArr2, null, 0, iArr)) {
            int[] iArr3 = this.O0;
            int i11 = iArr3[0];
            if (i11 <= 0) {
                iArr2 = new int[]{12324, 5, 12323, 6, 12322, 5, 12325, 16, 12352, 4, 12512, 1, 12513, 2, 12326, 1, 12344};
                if (!egl10.eglChooseConfig(eGLDisplay, iArr2, null, 0, iArr3)) {
                    Log.e(16, "2nd eglChooseConfig failed", new Object[0]);
                }
                int[] iArr4 = this.O0;
                i11 = iArr4[0];
                if (i11 <= 0) {
                    iArr2 = new int[]{12324, 5, 12323, 6, 12322, 5, 12325, 16, 12352, 4, 12326, 1, 12344};
                    if (!egl10.eglChooseConfig(eGLDisplay, iArr2, null, 0, iArr4)) {
                        Log.e(16, "3rd eglChooseConfig failed", new Object[0]);
                    }
                    i11 = this.O0[0];
                    if (i11 <= 0) {
                        Log.e(16, "No configs match configSpec", new Object[0]);
                    }
                } else {
                    this.P0 = true;
                }
            }
            int i12 = i11;
            EGLConfig[] eGLConfigArr2 = new EGLConfig[i12];
            if (!egl10.eglChooseConfig(eGLDisplay, iArr2, eGLConfigArr2, i12, this.O0)) {
                Log.e(16, "data eglChooseConfig failed", new Object[0]);
            }
            int i13 = 0;
            while (true) {
                if (i13 >= i12) {
                    eGLConfigArr = eGLConfigArr2;
                    i13 = -1;
                    break;
                }
                eGLConfigArr = eGLConfigArr2;
                if (sf(egl10, eGLDisplay, eGLConfigArr2[i13], 12324, 0) == 5) {
                    break;
                }
                i13++;
                eGLConfigArr2 = eGLConfigArr;
            }
            if (i13 == -1) {
                Log.w(16, "Did not find sane config, using first", new Object[0]);
            } else {
                i10 = i13;
            }
            EGLConfig eGLConfig = i12 > 0 ? eGLConfigArr[i10] : null;
            if (eGLConfig != null) {
                return eGLConfig;
            }
            throw new IllegalArgumentException("No config chosen");
        }
        throw new IllegalArgumentException("eglChooseConfig failed");
    }

    @Override
    public void d3(TdApi.NetworkType networkType) {
        k0.b(this, networkType);
    }

    @Override
    public boolean db() {
        return true;
    }

    public final void dg() {
        lf();
        g gVar = new g();
        this.C0 = gVar;
        gVar.e(j0.o());
        int i10 = this.H0;
        long j10 = 6000;
        j10 = 4000;
        if (i10 == 0) {
            j10 = 0;
        } else if (i10 == 1) {
            j10 = 3000;
        } else if (i10 != 2 && i10 != 4) {
            if (i10 == 5) {
                j10 = 1000;
            }
        }
        j0.e0(this.C0, j10 + 8000);
    }

    @Override
    public void e(final String str, final TdApi.LanguagePackInfo languagePackInfo) {
        xf().hd().post(new Runnable() {
            @Override
            public final void run() {
                ga.this.Hf(str, languagePackInfo);
            }
        });
    }

    @Override
    public void e0(int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 == 4 || i10 == 4) {
            xf().hd().post(new Runnable() {
                @Override
                public final void run() {
                    ga.this.Ef();
                }
            });
        }
    }

    public final void eg() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = this.G0;
            if (i11 < strArr.length) {
                strArr[i11] = null;
                i11++;
            }
        }
        while (true) {
            CharSequence[] charSequenceArr = this.F0;
            if (i10 < charSequenceArr.length) {
                charSequenceArr[i10] = null;
                i10++;
            } else {
                this.f8052o0.h();
                fg(true);
                this.f8052o0.invalidate();
                return;
            }
        }
    }

    @Override
    public void f3(boolean z10) {
        rb.b(this, z10);
    }

    public final void fg(boolean z10) {
        if (z10) {
            this.f8052o0.g();
        }
        int i10 = this.D0;
        int i11 = this.I0;
        if (i10 != i11 || z10) {
            this.D0 = i11;
            this.f8052o0.i(i11, zf(i11), tf(this.D0));
        }
        int i12 = this.I0;
        int i13 = i12 + 1 > 5 ? -1 : i12 + 1;
        if (this.E0 != i13 || z10) {
            this.E0 = i13;
            if (i13 == -1) {
                this.f8052o0.l(-1, null, null);
            } else {
                this.f8052o0.l(i13, zf(i13), tf(this.E0));
            }
        }
    }

    public final void hf(int i10) {
        if (R0 != i10) {
            R0 = i10;
            N.setColor(Color.red(i10) / 255.0f, Color.green(i10) / 255.0f, Color.blue(i10) / 255.0f);
            Vf();
        }
    }

    @Override
    public void j6(boolean z10, ae.b bVar) {
        super.j6(z10, bVar);
        of();
        pf(true);
        fg(true);
        this.f8052o0.invalidate();
        hf(ae.j.u());
        Vf();
    }

    @Override
    public boolean jd() {
        return true;
    }

    public final float jf(int i10) {
        int i11 = this.H0;
        if (i10 != i11) {
            if (i10 == i11 + 1) {
                return this.J0 + 1.0f;
            }
            if (i10 == i11 - 1) {
                return this.J0 - 1.0f;
            }
        }
        return this.J0;
    }

    @Override
    public void k4(boolean z10) {
        rb.c(this, z10);
    }

    public final void kf() {
        i iVar = this.f8054q0;
        if (iVar != null) {
            iVar.b();
            this.f8054q0 = null;
            nf();
        }
    }

    @Override
    public void l(w6 w6Var, TdApi.AuthorizationState authorizationState, int i10) {
        r0.g(this, w6Var, authorizationState, i10);
    }

    @Override
    public void lc() {
        super.lc();
        View view = this.f8051n0;
        if (view != null) {
            view.setVisibility(8);
            this.f8053p0 = true;
        }
    }

    public final void lf() {
        kb.b bVar = this.C0;
        if (bVar != null) {
            bVar.c();
            this.C0 = null;
        }
    }

    @Override
    public void mc(Configuration configuration) {
        super.mc(configuration);
        TdApi.LanguagePackInfo f02 = w.f0();
        TdApi.LanguagePackInfo Y = w.Y();
        if (!Y.f19945id.equals(this.f8057t0.g())) {
            this.f8057t0 = new j(Y, 2);
        }
        if (!f02.f19945id.equals(this.f8058u0.g())) {
            if (f02.f19945id.equals(this.f8057t0.g())) {
                this.f8058u0 = this.f8057t0;
            } else {
                this.f8058u0 = new j(f02, 1);
            }
        }
        mf();
    }

    public final void mf() {
        j jVar;
        if (!this.f8057t0.equals(this.f8058u0)) {
            jVar = this.f8058u0;
        } else {
            j jVar2 = this.f8059v0;
            if (jVar2 == null) {
                jVar = this.f8057t0;
            } else if (jVar2.i()) {
                jVar = this.f8059v0;
            } else {
                this.f8059v0.e(new Runnable() {
                    @Override
                    public final void run() {
                        ga.this.mf();
                    }
                });
                this.f8059v0.o(xf());
                jVar = this.f8057t0;
            }
        }
        if (!this.f8056s0.equals(jVar)) {
            this.f8056s0 = jVar;
            Q5(0, 0);
            this.f8061x0.setText(w.k1(this.f8057t0.f8075a, R.string.language_continueInLanguage));
            this.A0.p(!this.f8057t0.equals(this.f8056s0), Ta());
        }
        if (!this.f8056s0.h()) {
            this.f8056s0.n(xf());
        }
    }

    public final void nf() {
        if (this.f8063z0 != null && !Sa()) {
            eb.f fVar = this.f8063z0;
            i iVar = this.f8054q0;
            fVar.p(iVar != null && !iVar.f8071c, Ta());
        }
    }

    @Override
    public void o6() {
        super.o6();
        View view = this.f8051n0;
        if (view != null) {
            ((GLSurfaceView) view).onResume();
        }
    }

    @Override
    public View oc(Context context) {
        Yf(true);
        Bf();
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        yd.g.i(frameLayoutFix, R.id.theme_color_filling, this);
        frameLayoutFix.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-2, -2, 51);
        r12.topMargin = d1.getTopOffset();
        b bVar = new b(context);
        bVar.setEGLContextClientVersion(2);
        bVar.setRenderer(this);
        bVar.setRenderMode(0);
        bVar.setLayoutParams(r12);
        frameLayoutFix.addView(bVar);
        this.f8051n0 = bVar;
        org.thunderdog.challegram.widget.ViewPager viewPager = new org.thunderdog.challegram.widget.ViewPager(context);
        viewPager.setAdapter(new h(context));
        viewPager.setOverScrollMode(2);
        viewPager.c(this);
        viewPager.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        frameLayoutFix.addView(viewPager);
        FrameLayout.LayoutParams r13 = FrameLayoutFix.r1(-2, -2, 85);
        c cVar = new c(context);
        cVar.setLayoutParams(r13);
        l lVar = new l(context);
        this.f8052o0 = lVar;
        lVar.c(this);
        this.f8052o0.f(zf(0), zf(1), zf(2), zf(3), zf(4), zf(5));
        this.f8052o0.e(a0.g(), tf(0), tf(1), tf(2), tf(3), tf(4), tf(5));
        this.f8052o0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        cVar.addView(this.f8052o0);
        FrameLayout.LayoutParams r14 = FrameLayoutFix.r1(-1, a0.i(48.0f), 80);
        int i10 = a0.i(16.0f);
        r14.rightMargin = i10;
        r14.leftMargin = i10;
        r14.bottomMargin = i10;
        this.f8060w0 = new d(context);
        m2 m2Var = new m2(j0.r(context), a0.i(3.5f));
        this.f8062y0 = m2Var;
        m2Var.o(0.0f);
        this.f8062y0.E(new gb.h(this.f8060w0));
        this.f8060w0.setId(R.id.btn_done);
        this.f8060w0.setPadding(0, 0, 0, a0.i(1.0f));
        this.f8060w0.setTypeface(o.i());
        this.f8060w0.setTextSize(1, 17.0f);
        this.f8060w0.setGravity(17);
        this.f8060w0.setText(vf(R.string.StartMessaging));
        this.f8060w0.setOnClickListener(this);
        this.f8060w0.setOnLongClickListener(this);
        this.f8060w0.setLayoutParams(r14);
        this.f8060w0.setTextColor(ae.j.L(R.id.theme_color_textNeutral));
        z8(this.f8060w0, R.id.theme_color_textNeutral);
        yd.d.g(this.f8060w0);
        cVar.addView(this.f8060w0);
        e eVar = new e();
        DecelerateInterpolator decelerateInterpolator = db.b.f7287b;
        this.f8063z0 = new eb.f(0, eVar, decelerateInterpolator, 180L);
        FrameLayout.LayoutParams r15 = FrameLayoutFix.r1(-2, a0.i(48.0f), 81);
        r15.bottomMargin = a0.i(16.0f);
        b2 b2Var = new b2(context);
        this.f8061x0 = b2Var;
        b2Var.setId(R.id.btn_cancel);
        this.f8061x0.setTypeface(o.k());
        this.f8061x0.setTextSize(1, 17.0f);
        this.f8061x0.setGravity(17);
        this.f8061x0.setLayoutParams(r15);
        this.f8061x0.setOnClickListener(this);
        this.f8061x0.setPadding(a0.i(16.0f), 0, a0.i(16.0f), a0.i(1.0f));
        this.f8061x0.setTextColor(ae.j.L(R.id.theme_color_textNeutral));
        this.f8061x0.setTranslationY(a0.i(48.0f) + a0.i(16.0f));
        z8(this.f8061x0, R.id.theme_color_textNeutral);
        cVar.addView(this.f8061x0);
        this.A0 = new eb.f(0, new f(), decelerateInterpolator, 180L);
        frameLayoutFix.addView(cVar);
        xf().O9().n(this);
        xf().O9().e0(this);
        ya.o1().b1().a(this);
        if (!this.f8057t0.equals(this.f8056s0)) {
            this.f8061x0.setText(w.k1(this.f8057t0.f8075a, R.string.language_continueInLanguage));
            this.A0.p(true, false);
        }
        mf();
        return frameLayoutFix;
    }

    public final void of() {
        synchronized (this.K0) {
            int n10 = this.L0.n();
            for (int i10 = 0; i10 < n10; i10++) {
                this.L0.o(i10).recycle();
            }
            this.L0.b();
        }
    }

    @Override
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.btn_cancel) {
            Uf(true);
        } else if (id2 == R.id.btn_done) {
            Uf(false);
        }
    }

    @Override
    public void onDrawFrame(GL10 gl10) {
        rf();
    }

    @Override
    public boolean onLongClick(View view) {
        jb.c cVar = new jb.c(2);
        u0 u0Var = new u0(2);
        jb.c cVar2 = new jb.c(2);
        cVar.a(R.id.btn_proxy);
        cVar2.a(R.drawable.baseline_security_24);
        u0Var.b(vf(he.i.c2().X1() ? R.string.ProxySettings : R.string.ProxyAdd));
        cVar.a(R.id.btn_log_files);
        cVar2.a(R.drawable.baseline_bug_report_24);
        u0Var.b("Log Settings");
        ee(null, cVar.e(), u0Var.d(), null, cVar2.e(), new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view2, int i10) {
                boolean Ff;
                Ff = ga.this.Ff(view2, i10);
                return Ff;
            }
        });
        return true;
    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        Wf(i10, i11);
        Vf();
    }

    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Cf(gl10);
    }

    public final void pf(boolean z10) {
        if (!z10) {
            ib.b.h(this.G0);
        }
        ib.b.h(this.F0);
    }

    @Override
    public void q7(boolean z10) {
        rb.f(this, z10);
    }

    public final void qf() {
        synchronized (this.K0) {
            int n10 = this.K0.n();
            for (int i10 = 0; i10 < n10; i10++) {
                this.K0.o(i10).recycle();
            }
            this.K0.b();
        }
        of();
    }

    @Override
    public void r4(int i10) {
        if (this.H0 != i10) {
            this.H0 = i10;
            this.f8052o0.k(i10, jf(this.I0));
            N.setPage(i10);
        }
    }

    public final void rf() {
        N.setDate(((float) (System.currentTimeMillis() - this.N0)) / 1000.0f);
        N.onDrawFrame();
        Yf(false);
    }

    @Override
    public void run() {
        Vf();
        if (this.B0) {
            j0.e0(this, 17L);
        }
    }

    @Override
    public void sc() {
        super.sc();
        if (j0.J()) {
            Sf(true);
            return;
        }
        i iVar = this.f8054q0;
        if (iVar != null && iVar.f8074f) {
            Rf(iVar);
        }
    }

    public final int sf(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10, int i11) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i10, this.O0) ? this.O0[0] : i11;
    }

    public final CharSequence tf(int i10) {
        CharSequence[] charSequenceArr = this.F0;
        if (charSequenceArr[i10] != null) {
            return charSequenceArr[i10];
        }
        String vf = vf(Af(i10, true));
        CharSequence[] charSequenceArr2 = this.F0;
        CharSequence Z = c0.Z(vf, R.id.theme_color_text);
        charSequenceArr2[i10] = Z;
        return Z;
    }

    public final Bitmap uf() {
        Bitmap e10;
        synchronized (this.K0) {
            e10 = this.L0.e(0);
        }
        if (e10 != null) {
            return e10;
        }
        int i10 = a0.i(220.0f);
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawCircle(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2, createBitmap.getWidth() / 2, y.g(-13261090));
        v0.v2(canvas);
        synchronized (this.K0) {
            this.L0.j(0, createBitmap);
        }
        return createBitmap;
    }

    @Override
    public void v0(w6 w6Var, TdApi.User user, boolean z10, boolean z11) {
        r0.a(this, w6Var, user, z10, z11);
    }

    public String vf(int i10) {
        return w.k1(this.f8056s0.f8075a, i10);
    }

    @Override
    public void x(int i10, float f10, int i11) {
        this.I0 = i10;
        this.J0 = f10;
        fg(false);
        float jf = jf(i10);
        this.f8052o0.j(f10, jf);
        N.setScrollOffset(jf);
        Vf();
    }

    public final o6 xf() {
        return this.f24493a.C0();
    }

    public final Bitmap yf(int i10) {
        Bitmap e10;
        synchronized (this.K0) {
            e10 = this.K0.e(i10);
            if (e10 == null || e10.isRecycled()) {
                e10 = BitmapFactory.decodeResource(j0.B(), i10);
                this.K0.j(i10, e10);
            }
        }
        return e10;
    }

    @Override
    public void z(o6 o6Var, boolean z10) {
        r0.h(this, o6Var, z10);
    }

    @Override
    public void z5(w6 w6Var, int i10, int i11) {
        r0.e(this, w6Var, i10, i11);
    }

    public final String zf(int i10) {
        String[] strArr = this.G0;
        if (strArr[i10] != null) {
            return strArr[i10];
        }
        String vf = vf(Af(i10, false));
        strArr[i10] = vf;
        return vf;
    }
}
