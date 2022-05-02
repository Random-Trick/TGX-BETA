package p349yc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1362c;
import be.C1379j0;
import be.C1410y;
import ge.C4862d;
import ge.C4868i;
import java.util.ArrayList;
import java.util.Iterator;
import nc.C7389v0;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p082fd.C4403w;
import p108hb.C5064d;
import p111he.C5119i0;
import p364zd.C11524j;
import td.View$OnClickListenerC9170d1;

public class C10503c extends View {
    public int f33666M;
    public String f33667N;
    public AbstractC10505b f33668O;
    public float f33669P;
    public float f33670Q;
    public float f33671R;
    public float f33672S;
    public float f33673T;
    public float f33674U;
    public Drawable f33675V;
    public float f33676W;
    public boolean f33677a;
    public float f33678a0;
    public int f33679b = C1379j0.m37294z();
    public ArrayList<C10509g> f33680b0;
    public int f33681c;
    public C10507e[] f33682c0;
    public float f33683d0;
    public C10509g f33684e0;
    public C5119i0 f33685f0;
    public float f33686g0;
    public boolean f33687h0;
    public C10516l f33688i0;

    public class C10504a extends AnimatorListenerAdapter {
        public C10504a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            C10503c.this.m4918e(false);
            C10509g.m4877l(1.0f);
            C10503c.this.f33687h0 = false;
            C10503c.this.invalidate();
        }
    }

    public interface AbstractC10505b {
        boolean mo4902H2();

        void mo4901R();

        String mo4900X2();

        void mo4899j5(C5119i0 i0Var);
    }

    public C10503c(Context context) {
        super(context);
    }

    private float getTextLeft() {
        float measuredWidth = getMeasuredWidth() * 0.5f;
        int i = this.f33666M;
        if ((i == 1 || i == 3 || i == 4 || i == 5) && this.f33679b == 2) {
            measuredWidth *= 0.5f;
        }
        return measuredWidth - (this.f33671R * 0.5f);
    }

    private float getTextTop() {
        float k;
        int paddingTop;
        int i = this.f33666M;
        if (i == 1) {
            k = C1357a0.m37542k(91.0f);
            paddingTop = getPaddingTop();
        } else if (i == 2) {
            k = C1357a0.m37542k(123.0f);
            paddingTop = getPaddingTop();
        } else if (i != 3) {
            if (i != 4 && i != 5) {
                return 0.0f;
            }
            if (this.f33679b == 1) {
                k = C1357a0.m37542k(83.0f);
                paddingTop = getPaddingTop();
            } else {
                k = ((C1357a0.m37548e() - View$OnClickListenerC9170d1.m10065c3(false)) - getPaddingTop()) * 0.5f;
                paddingTop = getPaddingTop();
            }
        } else if (this.f33679b == 1) {
            k = C1357a0.m37542k(147.0f);
            paddingTop = getPaddingTop();
        } else {
            k = ((C1357a0.m37548e() - View$OnClickListenerC9170d1.m10065c3(false)) - getPaddingTop()) * 0.5f;
            paddingTop = getPaddingTop();
        }
        return k + paddingTop;
    }

    public void m4914i(ValueAnimator valueAnimator) {
        setPatternFactor(C2057b.m35738a(valueAnimator));
    }

    public final void m4920c(int i, boolean z) {
        C5119i0 i0Var = this.f33685f0;
        if (i0Var != null) {
            if (!z && i0Var.m23929e() > 0) {
                C10507e eVar = this.f33682c0[this.f33685f0.m23930d()];
                C10507e eVar2 = this.f33682c0[i];
                m4907p(eVar.m4895d() + ((eVar2.m4895d() - eVar.m4895d()) * 0.5f), eVar.m4894e() + ((eVar2.m4894e() - eVar.m4894e()) * 0.5f), true);
                C10509g gVar = new C10509g(eVar.m4895d(), eVar.m4894e(), this.f33684e0.m4880i(), this.f33684e0.m4879j());
                gVar.m4873p(this);
                gVar.m4871r(eVar2.m4895d(), eVar2.m4894e());
                this.f33680b0.add(gVar);
            }
            this.f33685f0.m23933a(i);
        }
    }

    public final void m4919d() {
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth != 0) {
            this.f33669P = getTextLeft();
            m4911l();
            m4912k();
            m4913j(measuredWidth, getMeasuredHeight());
        }
    }

    public void m4918e(boolean z) {
        this.f33677a = false;
        if (!z) {
            C5119i0 i0Var = this.f33685f0;
            if (i0Var != null) {
                i0Var.m23932b();
                this.f33680b0.clear();
                for (C10507e eVar : this.f33682c0) {
                    eVar.m4890i(false);
                }
                return;
            }
            return;
        }
        this.f33686g0 = 0.0f;
        this.f33687h0 = true;
        ValueAnimator b = C2057b.m35737b();
        b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C10503c.this.m4914i(valueAnimator);
            }
        });
        b.setInterpolator(C2057b.f7280b);
        b.setDuration(160L);
        b.addListener(new C10504a());
        b.start();
    }

    public final void m4917f(Canvas canvas) {
        for (C10507e eVar : this.f33682c0) {
            eVar.m4897b(canvas);
        }
        if (this.f33668O.mo4902H2()) {
            Iterator<C10509g> it = this.f33680b0.iterator();
            while (it.hasNext()) {
                it.next().m4881h(canvas);
            }
            if (this.f33677a || this.f33687h0) {
                this.f33684e0.m4881h(canvas);
            }
        }
    }

    public final void m4916g(Canvas canvas) {
        this.f33688i0.m4851l(canvas);
    }

    public AbstractC10505b getCallback() {
        return this.f33668O;
    }

    public C10516l getPincodeOutput() {
        return this.f33688i0;
    }

    public int getState() {
        return this.f33681c;
    }

    public String getText() {
        return this.f33667N;
    }

    public boolean m4915h() {
        return this.f33677a;
    }

    public final void m4913j(int i, int i2) {
        int i3 = this.f33666M;
        if (i3 == 1) {
            m4909n();
        } else if (i3 == 3) {
            m4910m(i, i2);
        }
    }

    public void m4912k() {
        Drawable drawable = this.f33675V;
        if (drawable != null) {
            this.f33676W = (this.f33669P + (this.f33671R * 0.5f)) - (drawable.getMinimumWidth() * 0.5f);
            this.f33678a0 = Math.max((this.f33670Q * 0.5f) - (this.f33675V.getMinimumHeight() * 0.5f), C1357a0.m37544i(40.0f));
        }
    }

    public final void m4911l() {
        int i = this.f33666M;
        if (i == 1) {
            this.f33672S = C1379j0.m37357N() ? C1357a0.m37542k(20.0f) : (C1357a0.m37546g() - (C1357a0.m37544i(106.0f) * 3)) / 2;
            this.f33673T = C1357a0.m37542k(148.0f);
        } else if (i != 2) {
            this.f33673T = -1.0f;
        } else {
            this.f33672S = C1357a0.m37542k(44.0f);
            this.f33673T = C1357a0.m37542k(170.0f);
        }
        float f = this.f33673T;
        if (f != -1.0f) {
            this.f33673T = f + getPaddingTop();
            this.f33674U = ((this.f33666M == 1 && this.f33679b == 2) ? getMeasuredWidth() * 0.5f : getMeasuredWidth()) - this.f33672S;
        }
    }

    public final void m4910m(int i, int i2) {
        float f;
        float f2;
        if (this.f33682c0 == null) {
            this.f33685f0 = new C5119i0();
            this.f33684e0 = new C10509g(0.0f, 0.0f, 0.0f, 0.0f);
            this.f33680b0 = new ArrayList<>();
            this.f33682c0 = new C10507e[]{new C10507e(this), new C10507e(this), new C10507e(this), new C10507e(this), new C10507e(this), new C10507e(this), new C10507e(this), new C10507e(this), new C10507e(this)};
        }
        float k = C1357a0.m37542k(102.0f);
        float k2 = C1357a0.m37542k(72.0f);
        if (this.f33679b == 2) {
            f2 = C1357a0.m37544i(12.0f);
            f = f2;
        } else {
            f2 = C1357a0.m37542k(206.0f);
            f = C1357a0.m37542k(88.0f);
        }
        this.f33683d0 = C1357a0.m37542k(26.0f);
        float f3 = k * 2.0f;
        float f4 = (k2 * 2.0f) + f3;
        float f5 = f3 + f2 + f;
        float f6 = i;
        float f7 = f4 != f6 ? f6 / f4 : 1.0f;
        float f8 = i2;
        if (f5 != f8) {
            f7 = Math.min(f7, f8 / f5);
        }
        if (f7 != 1.0f) {
            if (f7 < 1.0f) {
                k *= f7;
                this.f33683d0 = Math.max(C1357a0.m37542k(12.0f), this.f33683d0 * f7);
                f3 = k * 2.0f;
                f2 *= f7;
            }
            if (this.f33679b == 1) {
                k2 = (f6 - f3) * 0.5f;
            } else {
                f2 = (f8 - f3) * 0.5f;
            }
        }
        if (this.f33679b == 2) {
            k2 = (f6 - f3) - k2;
        } else {
            f2 += getPaddingTop();
        }
        float f9 = k2;
        int i3 = 0;
        for (C10507e eVar : this.f33682c0) {
            eVar.m4889j(f9, f2);
            i3++;
            if (i3 % 3 == 0) {
                f2 += k;
                f9 = k2;
            } else {
                f9 += k;
            }
        }
    }

    public final void m4909n() {
        if (this.f33688i0 == null) {
            C10516l lVar = new C10516l();
            this.f33688i0 = lVar;
            lVar.m4840w(this);
        }
        this.f33688i0.m4839x(this.f33672S, (this.f33673T - C1357a0.m37544i(52.0f)) - 1.0f, this.f33674U, this.f33673T - 1.0f);
    }

    public final boolean m4908o(MotionEvent motionEvent) {
        if (this.f33687h0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f33684e0.m4872q(x, y);
            m4918e(false);
            if (m4907p(x, y, false)) {
                this.f33677a = true;
                return true;
            }
        } else if (action != 1) {
            if (action == 2 && this.f33677a) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                this.f33684e0.m4872q(x2, y2);
                if (!m4907p(x2, y2, false)) {
                    invalidate();
                }
                return true;
            }
        } else if (this.f33677a) {
            AbstractC10505b bVar = this.f33668O;
            if (bVar != null) {
                bVar.mo4899j5(new C5119i0(this.f33685f0));
            }
            m4918e(true);
            invalidate();
            return true;
        }
        return false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f = this.f33673T;
        if (f != -1.0f) {
            canvas.drawRect(this.f33672S, f, this.f33674U, f + C1357a0.m37544i(1.0f), C1410y.m37042g(C5064d.m24132a(0.3f, C11524j.m228N(R.id.theme_color_passcodeText))));
        }
        int i = this.f33666M;
        if (i == 1) {
            m4916g(canvas);
        } else if (i == 3) {
            m4917f(canvas);
        }
        String str = this.f33667N;
        if (str != null) {
            canvas.drawText(str, this.f33669P, this.f33670Q, C1410y.m37049c0(13.0f, C11524j.m243F0()));
        }
        Drawable drawable = this.f33675V;
        if (drawable != null) {
            C1362c.m37490b(canvas, drawable, this.f33676W, this.f33678a0, C1410y.m37062S());
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m4919d();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f33666M != 3) {
            return super.onTouchEvent(motionEvent);
        }
        return m4908o(motionEvent);
    }

    public final boolean m4907p(float f, float f2, boolean z) {
        C10507e[] eVarArr;
        int i = 0;
        for (C10507e eVar : this.f33682c0) {
            if (eVar.m4893f(f, f2, this.f33683d0)) {
                eVar.m4890i(true);
                m4920c(i, z);
                if (!z) {
                    this.f33684e0.m4875n(f, f2);
                    this.f33684e0.m4874o(eVar.m4895d(), eVar.m4894e());
                }
                return true;
            }
            i++;
        }
        return false;
    }

    public void m4906q() {
        this.f33675V = C1362c.m37482j(R.drawable.deproko_logo_telegram_passcode_56);
    }

    public void m4905r(int i, int i2) {
        if (this.f33666M != i) {
            this.f33681c = i2;
            setMode(i);
            return;
        }
        setState(i2);
    }

    public final void m4904s() {
        int t1 = C4868i.m24727c2().m24592t1(this.f33668O.mo4900X2());
        if (t1 > 0) {
            this.f33667N = C4403w.m27867j1(R.string.format_PasscodeTooManyAttempts, C4403w.m27846o2(R.string.TryAgainSeconds, t1));
        } else {
            this.f33667N = C4862d.m24944n(this.f33666M, this.f33681c);
        }
        if (this.f33667N != null) {
            if (this.f33681c == 3 && C4862d.m24954c(this.f33666M) && !this.f33668O.mo4902H2()) {
                this.f33667N = C4403w.m27867j1(R.string.passcode_confirm_invisible, this.f33667N);
            }
            this.f33671R = C7389v0.m16680T1(this.f33667N, C1410y.m37051b0(13.0f));
            this.f33670Q = getTextTop();
            this.f33669P = getTextLeft();
        }
    }

    public void setCallback(AbstractC10505b bVar) {
        this.f33668O = bVar;
    }

    public void setMode(int i) {
        if (this.f33666M != i) {
            this.f33666M = i;
            m4904s();
            m4911l();
            m4919d();
            invalidate();
        }
    }

    public void setOrientation(int i) {
        this.f33679b = i;
        int i2 = this.f33666M;
        if (i2 == 1) {
            m4909n();
        } else if (i2 == 3) {
            this.f33670Q = getTextTop();
            m4918e(false);
        } else if (i2 == 4 || i2 == 5) {
            this.f33670Q = getTextTop();
        }
    }

    public void setPatternFactor(float f) {
        if (this.f33686g0 != f) {
            this.f33686g0 = f;
            C10509g.m4877l(1.0f - f);
            invalidate();
        }
    }

    public void setState(int i) {
        if (this.f33681c != i) {
            this.f33681c = i;
            m4904s();
            invalidate();
            if (i == 3) {
                this.f33668O.mo4901R();
            }
        }
    }

    public void m4903t() {
        m4904s();
        invalidate();
    }
}
