package p194nd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1362c;
import be.C1399s0;
import be.C1410y;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3950k;
import p181mb.C6812c;

public class C7425i extends View implements C3950k.AbstractC3952b {
    public static final C6812c f23433e0 = new C6812c(-1, -10236163);
    public int f23434M;
    public Bitmap f23435N;
    public Canvas f23436O;
    public boolean f23437P;
    public float f23438Q;
    public C3950k f23439R;
    public boolean f23440S;
    public C3950k f23441T;
    public int f23442U;
    public float f23443V;
    public Drawable f23444W;
    public int f23445a;
    public float f23446a0;
    public boolean f23447b;
    public float f23448b0;
    public Drawable f23449c;
    public boolean f23450c0;
    public C3950k f23451d0;

    public C7425i(Context context) {
        super(context);
        setBackgroundResource(R.drawable.bg_btn_header_light);
    }

    private void setActiveFactor(float f) {
        if (this.f23448b0 != f) {
            this.f23448b0 = f;
            if (this.f23434M == R.drawable.baseline_volume_up_24) {
                m16496d();
            }
            invalidate();
        }
    }

    private void setEditedFactor(float f) {
        if (this.f23438Q != f) {
            this.f23438Q = f;
            invalidate();
        }
    }

    private void setIconFactor(float f) {
        int i;
        if (this.f23443V != f) {
            this.f23443V = f;
            if (f >= 0.5f && (i = this.f23442U) != 0) {
                setIconInternal(i);
                this.f23442U = 0;
            }
            invalidate();
        }
    }

    private void setIconInternal(int i) {
        Drawable g = C1362c.m37482g(getResources(), i);
        this.f23449c = g;
        this.f23434M = i;
        boolean z = this.f23447b;
        this.f23450c0 = z;
        this.f23448b0 = z ? 1.0f : 0.0f;
        if (g != null && i == R.drawable.baseline_volume_up_24) {
            Bitmap bitmap = this.f23435N;
            if (!(bitmap == null || (bitmap.getWidth() == this.f23449c.getMinimumWidth() && this.f23435N.getHeight() == this.f23449c.getMinimumHeight()))) {
                this.f23435N = null;
            }
            Bitmap bitmap2 = this.f23435N;
            if (bitmap2 == null || bitmap2.isRecycled()) {
                this.f23435N = Bitmap.createBitmap(this.f23449c.getMinimumWidth(), this.f23449c.getMinimumHeight(), Bitmap.Config.ARGB_8888);
                this.f23436O = new Canvas(this.f23435N);
            }
            m16496d();
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            setActiveFactor(f);
        } else if (i == 1) {
            setIconFactor(f);
        } else if (i == 2) {
            setEditedFactor(f);
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public final void m16499a(float f) {
        if (this.f23451d0 == null) {
            this.f23451d0 = new C3950k(0, this, C2057b.f7280b, 180L, this.f23448b0);
        }
        this.f23451d0.m29544i(f);
    }

    public final void m16498b(float f) {
        if (this.f23439R == null) {
            this.f23439R = new C3950k(2, this, C2057b.f7280b, 110L, this.f23438Q);
        }
        this.f23439R.m29544i(f);
    }

    public final void m16497c() {
        C3950k kVar = this.f23441T;
        if (kVar == null) {
            this.f23441T = new C3950k(1, this, C2057b.f7283e, this.f23437P ? 180L : 380L);
        } else if (kVar.m29538o() >= 0.5f) {
            C3950k kVar2 = this.f23441T;
            kVar2.m29541l(kVar2.m29538o() == 1.0f ? 0.0f : this.f23441T.m29538o() - 0.5f);
        }
        this.f23442U = this.f23445a;
        this.f23441T.m29544i(1.0f);
    }

    public final void m16496d() {
        Canvas canvas = this.f23436O;
        this.f23435N.eraseColor(0);
        C1362c.m37487b(canvas, this.f23449c, 0.0f, 0.0f, C1410y.m37055W(-1));
        if (this.f23448b0 != 0.0f) {
            int i = C1357a0.m37541i(2.0f);
            int i2 = C1357a0.m37541i(24.0f);
            int minimumWidth = this.f23449c.getMinimumWidth() / 2;
            int i3 = C1357a0.m37541i(0.5f);
            canvas.save();
            canvas.rotate(-45.0f, this.f23449c.getMinimumWidth() / 2, this.f23449c.getMinimumHeight() / 2);
            float f = minimumWidth;
            float f2 = i3;
            float f3 = i2;
            canvas.drawRect(f, f2, minimumWidth + i, ((int) (this.f23448b0 * f3)) + i3, C1410y.m37078D());
            canvas.drawRect(minimumWidth - i, f2, f, i3 + ((int) (f3 * this.f23448b0)), C1410y.m37039g(-1));
            canvas.restore();
        }
    }

    public final void m16495e(float f) {
        C3950k kVar = this.f23451d0;
        if (kVar != null) {
            kVar.m29541l(f);
        }
        setActiveFactor(f);
    }

    public final void m16494f(float f) {
        C3950k kVar = this.f23439R;
        if (kVar != null) {
            kVar.m29541l(f);
        }
        setEditedFactor(f);
    }

    public final void m16493g() {
        C3950k kVar = this.f23441T;
        if (kVar != null) {
            kVar.m29541l(0.0f);
        }
        this.f23442U = 0;
        setIconInternal(this.f23445a);
        invalidate();
    }

    public boolean m16492h() {
        return this.f23450c0;
    }

    public void m16491i(boolean z, boolean z2) {
        if (this.f23450c0 != z) {
            this.f23450c0 = z;
            float f = 1.0f;
            if (z2) {
                if (!z) {
                    f = 0.0f;
                }
                m16499a(f);
                return;
            }
            if (!z) {
                f = 0.0f;
            }
            m16495e(f);
        }
    }

    public void m16490j(boolean z, boolean z2) {
        if (this.f23440S != z) {
            this.f23440S = z;
            float f = 1.0f;
            if (z2) {
                if (!z) {
                    f = 0.0f;
                }
                m16498b(f);
                return;
            }
            if (!z) {
                f = 0.0f;
            }
            m16494f(f);
        }
    }

    public void m16489k(int i, boolean z, boolean z2) {
        if (this.f23445a != i) {
            this.f23445a = i;
            this.f23447b = z2;
            if (z) {
                m16497c();
            } else {
                m16493g();
            }
        } else {
            m16491i(z2, z);
        }
    }

    public void m16488l() {
        this.f23437P = true;
    }

    @Override
    public void onDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.C7425i.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return C1399s0.m37218C(this) && getAlpha() == 1.0f && super.onTouchEvent(motionEvent);
    }

    public void setSecondFactor(float f) {
        if (this.f23446a0 != f) {
            this.f23446a0 = f;
            invalidate();
        }
    }

    public void setSecondIcon(int i) {
        this.f23444W = C1362c.m37482g(getResources(), i);
    }
}
