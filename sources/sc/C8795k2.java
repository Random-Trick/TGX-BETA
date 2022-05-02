package sc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import be.C1357a0;
import be.C1359b;
import be.C1362c;
import be.C1389o;
import be.C1399s0;
import be.C1410y;
import gd.C4587b;
import ie.C5386e;
import me.AbstractC6828a;
import me.C6840b0;
import me.C6847b2;
import me.C7025s3;
import me.RunnableC6969m2;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p082fd.C4403w;
import p108hb.C5063c;
import p108hb.C5064d;
import p108hb.C5070i;
import p139jb.AbstractC5911c;
import p156kd.C6246h;
import p156kd.C6257p;
import p335xd.C10189d;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class C8795k2 extends FrameLayoutFix implements AbstractC6828a, AbstractC5911c, C3950k.AbstractC3952b, C7025s3.AbstractC7026a {
    public C8862z1 f28388M;
    public TextView f28389N;
    public TextView f28390O;
    public C6257p f28391P;
    public C6840b0 f28392Q;
    public C7025s3 f28393R;
    public int f28396U;
    public AbstractC9323v4<?> f28397V;
    public C5386e f28399a0;
    public float f28400b0;
    public C4587b f28401c0;
    public Runnable f28402d0;
    public C3940f f28403e0;
    public RunnableC6969m2 f28404f0;
    public long f28405g0;
    public int f28398W = R.id.theme_color_fileAttach;
    public final Drawable f28394S = C1362c.m37485g(getResources(), R.drawable.baseline_location_on_18);
    public final Drawable f28395T = C1362c.m37485g(getResources(), R.drawable.baseline_location_on_24);

    public C8795k2(Context context) {
        super(context);
    }

    private void setIsRed(boolean z) {
        int h = C5063c.m24139h(this.f28396U, 1, z);
        if (this.f28396U != h) {
            this.f28396U = h;
            AbstractC9323v4<?> v4Var = this.f28397V;
            if (v4Var != null) {
                v4Var.m9180qd(this.f28389N);
            }
            int i = z ? R.id.theme_color_textNegative : R.id.theme_color_text;
            this.f28389N.setTextColor(C11524j.m228N(i));
            AbstractC9323v4<?> v4Var2 = this.f28397V;
            if (v4Var2 != null) {
                v4Var2.m9119z8(this.f28389N, i);
            }
        }
    }

    public final void m11345C1() {
        int i = this.f28396U & (-5);
        this.f28396U = i;
        this.f28396U = i & (-9);
        m11343E1(null, -1L);
        setIsRed(false);
    }

    public void m11344D1(AbstractC9323v4<?> v4Var, boolean z) {
        Context context = getContext();
        this.f28397V = v4Var;
        int i = C1357a0.m37544i(20.0f);
        int i2 = C1357a0.m37544i(8.0f) + (z ? C1357a0.m37544i(4.0f) : 0);
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-1, -2, 16);
        t1.bottomMargin = C1357a0.m37544i(10.0f);
        int i3 = i * 2;
        int i4 = i3 + i3;
        t1.leftMargin = i4;
        t1.rightMargin = i;
        C6847b2 b2Var = new C6847b2(context);
        this.f28389N = b2Var;
        b2Var.setTypeface(C1389o.m37263i());
        this.f28389N.setTextSize(1, 16.0f);
        this.f28389N.setTextColor(C11524j.m217S0());
        if (v4Var != null) {
            v4Var.m9126y8(this.f28389N);
        }
        this.f28389N.setSingleLine();
        this.f28389N.setLayoutParams(t1);
        this.f28389N.setEllipsize(TextUtils.TruncateAt.END);
        addView(this.f28389N);
        FrameLayout.LayoutParams t12 = FrameLayoutFix.m18007t1(-1, -2, 16);
        t12.topMargin = C1357a0.m37544i(10.0f);
        t12.leftMargin = i4;
        t12.rightMargin = i;
        C6847b2 b2Var2 = new C6847b2(context);
        this.f28390O = b2Var2;
        b2Var2.setTypeface(C1389o.m37261k());
        this.f28390O.setTextSize(1, 13.0f);
        this.f28390O.setTextColor(C11524j.m213U0());
        if (v4Var != null) {
            v4Var.m9480A8(this.f28390O);
        }
        this.f28390O.setSingleLine();
        this.f28390O.setLayoutParams(t12);
        this.f28390O.setEllipsize(TextUtils.TruncateAt.END);
        addView(this.f28390O);
        FrameLayout.LayoutParams t13 = FrameLayoutFix.m18007t1(C1357a0.m37544i(26.0f), C1357a0.m37544i(26.0f), 21);
        t13.rightMargin = C1357a0.m37544i(10.0f);
        C7025s3 s3Var = new C7025s3(context);
        this.f28393R = s3Var;
        s3Var.setListener(this);
        this.f28393R.setTextColor(C11524j.m239H0());
        if (v4Var != null) {
            v4Var.m9119z8(this.f28393R, R.id.theme_color_progress);
        }
        this.f28393R.setLayoutParams(t13);
        addView(this.f28393R);
        FrameLayout.LayoutParams t14 = FrameLayoutFix.m18007t1((C1357a0.m37544i(1.0f) * 2) + i3, (C1357a0.m37544i(1.0f) * 2) + i3, 51);
        t14.leftMargin = i - C1357a0.m37544i(1.0f);
        t14.topMargin = i2 - C1357a0.m37544i(1.0f);
        C6840b0 b0Var = new C6840b0(context);
        this.f28392Q = b0Var;
        b0Var.m18809m(4);
        if (v4Var != null) {
            v4Var.m9163t8(this.f28392Q);
        }
        this.f28392Q.setLayoutParams(t14);
        addView(this.f28392Q);
        C6257p pVar = new C6257p(this, 0);
        this.f28391P = pVar;
        pVar.mo20257K0(i + 0, i2 + 0, (i + i3) - 0, (i2 + i3) - 0);
        setWillNotDraw(false);
        setLayoutParams(new ViewGroup.LayoutParams(-1, C1357a0.m37544i(z ? 64.0f : 56.0f)));
        C1399s0.m37196a0(this);
        C10189d.m5796h(this, v4Var);
    }

    public void m11343E1(Runnable runnable, long j) {
        Runnable runnable2 = this.f28402d0;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.f28402d0 = runnable;
        if (runnable != null) {
            postDelayed(runnable, j);
        }
    }

    public void m11342F1(boolean z, boolean z2) {
        if (z2) {
            this.f28392Q.setChecked(z);
        } else {
            this.f28392Q.m18811k(z);
        }
    }

    public void m11341G1(boolean z, boolean z2) {
        C3940f fVar = this.f28403e0;
        if ((fVar != null && fVar.m29585h()) != z) {
            if (this.f28403e0 == null) {
                this.f28403e0 = new C3940f(0, this, C2057b.f7280b, 180L);
            }
            if (this.f28404f0 == null) {
                this.f28404f0 = RunnableC6969m2.m18290F(this, 5.0f, this.f28391P.getLeft(), this.f28391P.getTop(), this.f28391P.getWidth(), this.f28391P.getHeight());
            }
            this.f28403e0.m29577p(z, z2);
        }
    }

    public void m11340I1(String str, String str2, boolean z, boolean z2, boolean z3, int i, long j) {
        this.f28396U = C5063c.m24139h(C5063c.m24139h(C5063c.m24139h(this.f28396U, 8, z2), 2, z3), 4, true);
        this.f28402d0 = null;
        this.f28399a0 = null;
        setIsRed(z);
        setIsFaded(z3);
        this.f28393R.m18071c(i, j);
        this.f28389N.setText(str);
        this.f28390O.setText(str2);
        this.f28391P.m20820G(null);
        this.f28392Q.m18811k(false);
        this.f28391P.invalidate();
    }

    public void m11339J1(String str, String str2, int i, C5386e eVar, boolean z, int i2, long j) {
        boolean z2;
        m11345C1();
        setIsFaded(z);
        this.f28393R.m18071c(i2, j);
        this.f28389N.setText(str);
        this.f28390O.setText(str2);
        boolean z3 = true;
        if (this.f28398W != i) {
            this.f28398W = i;
            z2 = true;
        } else {
            z2 = false;
        }
        C5386e eVar2 = this.f28399a0;
        String str3 = null;
        String str4 = eVar2 != null ? eVar2.f17711a : null;
        if (eVar != null) {
            str3 = eVar.f17711a;
        }
        if (!C5070i.m24068c(str4, str3)) {
            this.f28399a0 = eVar;
            this.f28400b0 = C1410y.m37011v0(eVar, 17.0f);
        } else {
            z3 = z2;
        }
        if (z3) {
            this.f28391P.invalidate();
        }
    }

    public void m11338L1(C8862z1 z1Var, boolean z) {
        m11345C1();
        C8862z1 z1Var2 = this.f28388M;
        if (z1Var2 == null || !z1Var2.equals(z1Var)) {
            this.f28388M = z1Var;
            this.f28391P.m20820G(z1Var.m11085c());
            this.f28389N.setText(z1Var.m11082f());
            this.f28390O.setText(z1Var.m11086b());
        }
        this.f28392Q.m18811k(z);
    }

    public void m11337M1(CharSequence charSequence) {
        this.f28390O.setText(charSequence);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        this.f28404f0.m18275o(f);
        invalidate();
    }

    @Override
    public void mo11336T0(C7025s3 s3Var, boolean z) {
        int i = C1357a0.m37544i(20.0f) + (this.f28393R.m18073a() ? C1357a0.m37544i(26.0f) : 0);
        C1399s0.m37176k0(this.f28389N, i);
        C1399s0.m37176k0(this.f28390O, i);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    @Override
    public void mo4501a3() {
        this.f28391P.mo20250Z();
    }

    @Override
    public void mo8229b() {
        this.f28391P.mo20248b();
    }

    @Override
    public void mo8225f() {
        this.f28391P.mo20246f();
    }

    public C8862z1 getLocation() {
        return this.f28388M;
    }

    public Runnable getSubtitleUpdater() {
        return this.f28402d0;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        int m = this.f28391P.m20804m();
        int n = this.f28391P.m20803n();
        int i = this.f28396U;
        float f = (i & 2) != 0 ? 0.6f : 1.0f;
        if ((i & 4) != 0) {
            C3940f fVar = this.f28403e0;
            float g = fVar != null ? fVar.m29586g() : 0.0f;
            float f2 = m;
            float f3 = n;
            canvas.drawCircle(f2, f3, C1357a0.m37544i(20.0f), C1410y.m37042g(C5064d.m24132a(f, C11524j.m228N(R.id.theme_color_fileRed))));
            if (g < 1.0f) {
                Paint W = C1410y.m37058W(-1);
                int i2 = (int) ((1.0f - g) * 255.0f * f);
                W.setAlpha(i2);
                C1362c.m37490b(canvas, this.f28394S, m - (drawable2.getMinimumWidth() / 2), n - (this.f28394S.getMinimumHeight() / 2), W);
                W.setAlpha(255);
                if ((this.f28396U & 8) != 0) {
                    long B = C1359b.m37525B(canvas, f2, f3, C5064d.m24131b(i2, 16777215), false, this.f28405g0);
                    if (B != -1) {
                        this.f28405g0 = SystemClock.uptimeMillis() + B;
                        postInvalidateDelayed(B, this.f28391P.getLeft(), this.f28391P.getTop(), this.f28391P.getRight(), this.f28391P.getBottom());
                    }
                }
            }
            RunnableC6969m2 m2Var = this.f28404f0;
            if (m2Var != null) {
                m2Var.m18287c(canvas);
                return;
            }
            return;
        }
        C4587b bVar = this.f28401c0;
        if (bVar != null) {
            bVar.m27217a(canvas, m, n);
            return;
        }
        float f4 = m;
        canvas.drawCircle(f4, n, C1357a0.m37544i(20.0f), C1410y.m37042g(C5064d.m24132a(f, C11524j.m228N(this.f28398W))));
        C5386e eVar = this.f28399a0;
        if (eVar != null) {
            C1410y.m37046e(canvas, eVar, f4 - (this.f28400b0 / 2.0f), C1357a0.m37544i(6.0f) + n, 17.0f, f);
        }
        if (this.f28399a0 == null || this.f28391P.m20799r() != null) {
            if (this.f28391P.mo20247c0()) {
                Paint W2 = C1410y.m37058W(-1);
                W2.setAlpha((int) ((f - this.f28391P.m20798s()) * 255.0f));
                C1362c.m37490b(canvas, this.f28395T, m - (drawable.getMinimumWidth() / 2), n - (this.f28395T.getMinimumHeight() / 2), W2);
                W2.setAlpha(255);
            }
            int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            if (i3 != 0) {
                this.f28391P.mo20251U(f);
            }
            this.f28391P.draw(canvas);
            if (i3 != 0) {
                this.f28391P.mo20254P();
            }
        }
    }

    public void setDefaultLiveLocation(boolean z) {
        m11340I1(C4403w.m27871i1(R.string.ShareLiveLocation), C4403w.m27871i1(R.string.SendLiveLocationInfo), false, z, false, 0, 0L);
    }

    public void setIsFaded(boolean z) {
        int h = C5063c.m24139h(this.f28396U, 2, z);
        if (this.f28396U != h) {
            this.f28396U = h;
            float f = z ? 0.6f : 1.0f;
            this.f28389N.setAlpha(f);
            this.f28390O.setAlpha(f);
            this.f28391P.invalidate();
        }
    }

    public void setLocationImage(C6246h hVar) {
        this.f28391P.mo20260D0(0);
        this.f28391P.m20820G(hVar);
    }

    public void setPlaceholder(C4587b.C4588a aVar) {
        this.f28391P.clear();
        this.f28401c0 = new C4587b(20.0f, aVar, null);
    }

    public void setRoundedLocationImage(C6246h hVar) {
        this.f28391P.mo20260D0(C1357a0.m37544i(20.0f));
        this.f28391P.m20820G(hVar);
    }
}
