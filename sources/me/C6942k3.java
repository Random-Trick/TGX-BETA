package me;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1379j0;
import be.C1410y;
import nc.C7389v0;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.R;
import p108hb.C5069h;
import p139jb.AbstractC5911c;
import p194nd.C7484p1;
import p194nd.C7486q;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class C6942k3 extends LinearLayout implements C7484p1.AbstractC7485a, AbstractC5911c, AbstractC6828a, AbstractView$OnTouchListenerC7889a.AbstractC7899j {
    public C7484p1 f21924M;
    public float f21925N;
    public String[] f21926O;
    public int f21927P;
    public float f21928Q;
    public AbstractC6944b f21929R;
    public AbstractC6945c f21930S;
    public C7486q f21931a;
    public C6943a f21932b;
    public C6943a f21933c;

    public static class C6943a extends ImageView implements AbstractC5911c {
        public static final DecelerateInterpolator f21934N = new DecelerateInterpolator(2.0f);
        public int f21935M;
        public float f21936a;
        public Bitmap f21937b;
        public Canvas f21938c;

        public C6943a(Context context) {
            super(context);
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.baseline_brightness_5_24);
            setColorFilter(C11524j.m159q0());
        }

        public final void m18391a() {
            int width;
            if (this.f21937b == null) {
                m18390b();
            }
            this.f21937b.eraseColor(0);
            float width2 = this.f21937b.getWidth() / 2;
            int q0 = C11524j.m159q0();
            this.f21935M = q0;
            this.f21938c.drawCircle(width2, width2, C1357a0.m37544i(4.0f), C1410y.m37042g(q0));
            this.f21938c.drawCircle(width + ((int) (C1357a0.m37544i(4.0f) * 2.0f * this.f21936a)), width2, C1357a0.m37544i(4.0f), C1410y.m37081D());
        }

        @Override
        public void mo4501a3() {
            Bitmap bitmap = this.f21937b;
            if (bitmap != null) {
                bitmap.recycle();
                this.f21937b = null;
            }
            this.f21938c = null;
        }

        public final void m18390b() {
            if (this.f21937b == null) {
                int i = (C1357a0.m37544i(4.0f) * 2) + C1357a0.m37544i(2.0f);
                this.f21937b = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                this.f21938c = new Canvas(this.f21937b);
            }
        }

        public void m18389c(float f) {
            if (f > 0.0f && f < 1.0f) {
                f = f21934N.getInterpolation(f);
            }
            float f2 = this.f21936a;
            if (f2 != f) {
                this.f21936a = f;
                float i = C1357a0.m37544i(4.0f) * 2.0f;
                int i2 = (int) (f * i);
                if (((int) (f2 * i)) != i2) {
                    if (i2 > 0 && i2 < ((int) i)) {
                        m18391a();
                    }
                    invalidate();
                }
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            float i = C1357a0.m37544i(4.0f);
            int i2 = (int) (2.0f * i);
            int i3 = (int) (i2 * this.f21936a);
            if (i3 == i2) {
                canvas.drawCircle(measuredWidth, measuredHeight, i, C1410y.m37042g(C11524j.m159q0()));
            } else if (i3 > 0) {
                if (this.f21937b == null || C11524j.m159q0() != this.f21935M) {
                    m18391a();
                }
                int width = this.f21937b.getWidth() / 2;
                canvas.drawBitmap(this.f21937b, measuredWidth - width, measuredHeight - width, C1410y.m37036j());
            }
        }
    }

    public interface AbstractC6944b {
        void mo18388h(C6942k3 k3Var, int i);
    }

    public interface AbstractC6945c {
        void mo18387M3(C6942k3 k3Var, float f, float f2, int i, boolean z);
    }

    public C6942k3(Context context) {
        super(context);
        C7484p1 p1Var = new C7484p1(context);
        this.f21924M = p1Var;
        p1Var.setAnchorMode(0);
        this.f21924M.m15841h(true, false);
        this.f21924M.setListener(this);
        this.f21924M.m15842g(R.id.theme_color_sliderActive, false);
        this.f21924M.setForceBackgroundColorId(R.id.theme_color_sliderInactive);
        setOrientation(0);
        setLayoutParams(new RecyclerView.LayoutParams(-1, C1357a0.m37544i(56.0f)));
    }

    @Override
    public void mo15839U0(C7484p1 p1Var, float f) {
        int d = m18398d(f);
        if (this.f21927P != d) {
            this.f21927P = d;
            C7486q qVar = this.f21931a;
            if (qVar != null) {
                String[] strArr = this.f21926O;
                qVar.setValue(strArr != null ? strArr[d] : Integer.toString(d));
            }
            AbstractC6944b bVar = this.f21929R;
            if (bVar != null) {
                bVar.mo18388h(this, this.f21927P);
            }
        }
        m18395h(f, false);
    }

    @Override
    public void mo14405a(float f) {
        if (this.f21932b != null) {
            C7484p1 p1Var = this.f21924M;
            float f2 = this.f21928Q;
            float f3 = 0.0f;
            if (f2 != 0.0f) {
                f3 = C5069h.m24090d(f / f2);
            }
            p1Var.m15840i(f3, true);
        }
    }

    @Override
    public void mo4501a3() {
        C6943a aVar = this.f21932b;
        if (aVar != null) {
            aVar.mo4501a3();
            C1379j0.m37310r(getContext()).m14422w2(this);
        }
    }

    @Override
    public void mo8229b() {
        if (this.f21932b != null) {
            C1379j0.m37310r(getContext()).m14422w2(this);
        }
    }

    public void m18399c(AbstractC9323v4<?> v4Var) {
        if (v4Var != null) {
            C7486q qVar = this.f21931a;
            if (qVar != null) {
                qVar.m15836C1(v4Var);
            }
            C6943a aVar = this.f21932b;
            if (aVar != null) {
                v4Var.m9184q8(aVar, R.id.theme_color_icon);
            }
            C6943a aVar2 = this.f21933c;
            if (aVar2 != null) {
                v4Var.m9184q8(aVar2, R.id.theme_color_icon);
            }
            v4Var.m9163t8(this.f21924M);
        }
    }

    public final int m18398d(float f) {
        String[] strArr = this.f21926O;
        if (strArr != null) {
            return Math.round(f * (strArr.length - 1));
        }
        return 0;
    }

    public void m18397e() {
        C6943a aVar = new C6943a(getContext());
        this.f21932b = aVar;
        aVar.setLayoutParams(new ViewGroup.LayoutParams(C1357a0.m37544i(56.0f), -1));
        addView(this.f21932b);
        this.f21924M.setPadding(C1357a0.m37544i(16.0f), 0, C1357a0.m37544i(16.0f), 0);
        this.f21924M.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
        addView(this.f21924M);
        C6943a aVar2 = new C6943a(getContext());
        this.f21933c = aVar2;
        aVar2.m18389c(1.0f);
        this.f21933c.setLayoutParams(new ViewGroup.LayoutParams(C1357a0.m37544i(56.0f), -1));
        addView(this.f21933c);
    }

    @Override
    public void mo8225f() {
        if (this.f21932b != null) {
            AbstractView$OnTouchListenerC7889a r = C1379j0.m37310r(getContext());
            C7484p1 p1Var = this.f21924M;
            float f = 0.0f;
            if (this.f21928Q != 0.0f) {
                f = C5069h.m24090d(r.m14540S0() / this.f21928Q);
            }
            p1Var.m15840i(f, false);
            r.m14533U(this);
        }
    }

    public void m18396g() {
        C7486q qVar = new C7486q(getContext());
        this.f21931a = qVar;
        qVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        this.f21931a.setPadding(C1357a0.m37544i(16.0f), 0, 0, 0);
        this.f21931a.m15835D1(R.id.theme_color_text, R.id.theme_color_textNeutral);
        addView(this.f21931a);
        this.f21924M.setPadding(C1357a0.m37544i(16.0f), C1357a0.m37544i(1.0f), C1357a0.m37544i(16.0f), 0);
        this.f21924M.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.f21924M);
    }

    public final void m18395h(float f, boolean z) {
        if (this.f21925N != f || z) {
            this.f21925N = f;
            C6943a aVar = this.f21932b;
            if (aVar != null) {
                aVar.m18389c(f);
            }
            AbstractC6945c cVar = this.f21930S;
            if (cVar != null) {
                cVar.mo18387M3(this, this.f21925N, this.f21926O != null ? 1.0f : this.f21928Q, this.f21927P, z);
            }
        }
    }

    public void m18394i(float f, float f2) {
        this.f21928Q = f2;
        float d = C5069h.m24090d(f / f2);
        this.f21925N = d;
        C6943a aVar = this.f21932b;
        if (aVar != null) {
            aVar.m18389c(d);
        }
        this.f21924M.setValue(this.f21925N);
    }

    public void m18393j(CharSequence charSequence, String[] strArr, int i) {
        this.f21926O = strArr;
        C7486q qVar = this.f21931a;
        if (qVar != null) {
            qVar.setName(charSequence);
            this.f21931a.setValue(strArr[i]);
            float f = 0.0f;
            for (String str : strArr) {
                f = Math.max(f, C7389v0.m16680T1(str, C1410y.m37051b0(13.0f)));
            }
            this.f21931a.setValueMaxWidth(f);
        }
        float k = m18392k(i);
        this.f21925N = k;
        C6943a aVar = this.f21932b;
        if (aVar != null) {
            aVar.m18389c(k);
        }
        this.f21927P = i;
        this.f21924M.setValue(this.f21925N);
        this.f21924M.setValueCount(strArr.length);
    }

    public final float m18392k(int i) {
        String[] strArr = this.f21926O;
        if (strArr != null) {
            return i * (1.0f / (strArr.length - 1));
        }
        return 0.0f;
    }

    @Override
    public void mo15838q2(C7484p1 p1Var, boolean z) {
        C7486q qVar = this.f21931a;
        if (qVar != null) {
            qVar.m15834E1(z, true);
        }
        if (!z) {
            float f = this.f21925N;
            if (this.f21926O != null) {
                f = m18392k(this.f21927P);
                this.f21924M.m15847b(f);
            }
            m18395h(f, true);
        }
    }

    @Override
    public boolean mo15837s0(C7484p1 p1Var) {
        return this.f21926O != null || this.f21928Q > 0.0f;
    }

    public void setCallback(AbstractC6944b bVar) {
        this.f21929R = bVar;
    }

    public void setRealTimeChangeListener(AbstractC6945c cVar) {
        this.f21930S = cVar;
    }

    public void setShowOnlyValue(boolean z) {
        C7486q qVar = this.f21931a;
        if (qVar != null) {
            qVar.setAlwaysDragging(z);
        }
    }
}
