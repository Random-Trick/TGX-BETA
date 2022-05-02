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
    public static final C6812c f23436e0 = new C6812c(-1, -10236163);
    public int f23437M;
    public Bitmap f23438N;
    public Canvas f23439O;
    public boolean f23440P;
    public float f23441Q;
    public C3950k f23442R;
    public boolean f23443S;
    public C3950k f23444T;
    public int f23445U;
    public float f23446V;
    public Drawable f23447W;
    public int f23448a;
    public float f23449a0;
    public boolean f23450b;
    public float f23451b0;
    public Drawable f23452c;
    public boolean f23453c0;
    public C3950k f23454d0;

    public C7425i(Context context) {
        super(context);
        setBackgroundResource(R.drawable.bg_btn_header_light);
    }

    private void setActiveFactor(float f) {
        if (this.f23451b0 != f) {
            this.f23451b0 = f;
            if (this.f23437M == R.drawable.baseline_volume_up_24) {
                m16496d();
            }
            invalidate();
        }
    }

    private void setEditedFactor(float f) {
        if (this.f23441Q != f) {
            this.f23441Q = f;
            invalidate();
        }
    }

    private void setIconFactor(float f) {
        int i;
        if (this.f23446V != f) {
            this.f23446V = f;
            if (f >= 0.5f && (i = this.f23445U) != 0) {
                setIconInternal(i);
                this.f23445U = 0;
            }
            invalidate();
        }
    }

    private void setIconInternal(int i) {
        Drawable g = C1362c.m37485g(getResources(), i);
        this.f23452c = g;
        this.f23437M = i;
        boolean z = this.f23450b;
        this.f23453c0 = z;
        this.f23451b0 = z ? 1.0f : 0.0f;
        if (g != null && i == R.drawable.baseline_volume_up_24) {
            Bitmap bitmap = this.f23438N;
            if (!(bitmap == null || (bitmap.getWidth() == this.f23452c.getMinimumWidth() && this.f23438N.getHeight() == this.f23452c.getMinimumHeight()))) {
                this.f23438N = null;
            }
            Bitmap bitmap2 = this.f23438N;
            if (bitmap2 == null || bitmap2.isRecycled()) {
                this.f23438N = Bitmap.createBitmap(this.f23452c.getMinimumWidth(), this.f23452c.getMinimumHeight(), Bitmap.Config.ARGB_8888);
                this.f23439O = new Canvas(this.f23438N);
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
        if (this.f23454d0 == null) {
            this.f23454d0 = new C3950k(0, this, C2057b.f7280b, 180L, this.f23451b0);
        }
        this.f23454d0.m29546i(f);
    }

    public final void m16498b(float f) {
        if (this.f23442R == null) {
            this.f23442R = new C3950k(2, this, C2057b.f7280b, 110L, this.f23441Q);
        }
        this.f23442R.m29546i(f);
    }

    public final void m16497c() {
        C3950k kVar = this.f23444T;
        if (kVar == null) {
            this.f23444T = new C3950k(1, this, C2057b.f7283e, this.f23440P ? 180L : 380L);
        } else if (kVar.m29540o() >= 0.5f) {
            C3950k kVar2 = this.f23444T;
            kVar2.m29543l(kVar2.m29540o() == 1.0f ? 0.0f : this.f23444T.m29540o() - 0.5f);
        }
        this.f23445U = this.f23448a;
        this.f23444T.m29546i(1.0f);
    }

    public final void m16496d() {
        Canvas canvas = this.f23439O;
        this.f23438N.eraseColor(0);
        C1362c.m37490b(canvas, this.f23452c, 0.0f, 0.0f, C1410y.m37058W(-1));
        if (this.f23451b0 != 0.0f) {
            int i = C1357a0.m37544i(2.0f);
            int i2 = C1357a0.m37544i(24.0f);
            int minimumWidth = this.f23452c.getMinimumWidth() / 2;
            int i3 = C1357a0.m37544i(0.5f);
            canvas.save();
            canvas.rotate(-45.0f, this.f23452c.getMinimumWidth() / 2, this.f23452c.getMinimumHeight() / 2);
            float f = minimumWidth;
            float f2 = i3;
            float f3 = i2;
            canvas.drawRect(f, f2, minimumWidth + i, ((int) (this.f23451b0 * f3)) + i3, C1410y.m37081D());
            canvas.drawRect(minimumWidth - i, f2, f, i3 + ((int) (f3 * this.f23451b0)), C1410y.m37042g(-1));
            canvas.restore();
        }
    }

    public final void m16495e(float f) {
        C3950k kVar = this.f23454d0;
        if (kVar != null) {
            kVar.m29543l(f);
        }
        setActiveFactor(f);
    }

    public final void m16494f(float f) {
        C3950k kVar = this.f23442R;
        if (kVar != null) {
            kVar.m29543l(f);
        }
        setEditedFactor(f);
    }

    public final void m16493g() {
        C3950k kVar = this.f23444T;
        if (kVar != null) {
            kVar.m29543l(0.0f);
        }
        this.f23445U = 0;
        setIconInternal(this.f23448a);
        invalidate();
    }

    public boolean m16492h() {
        return this.f23453c0;
    }

    public void m16491i(boolean z, boolean z2) {
        if (this.f23453c0 != z) {
            this.f23453c0 = z;
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
        if (this.f23443S != z) {
            this.f23443S = z;
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
        if (this.f23448a != i) {
            this.f23448a = i;
            this.f23450b = z2;
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
        this.f23440P = true;
    }

    @Override
    public void onDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.C7425i.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return C1399s0.m37221C(this) && getAlpha() == 1.0f && super.onTouchEvent(motionEvent);
    }

    public void setSecondFactor(float f) {
        if (this.f23449a0 != f) {
            this.f23449a0 = f;
            invalidate();
        }
    }

    public void setSecondIcon(int i) {
        this.f23447W = C1362c.m37485g(getResources(), i);
    }
}
