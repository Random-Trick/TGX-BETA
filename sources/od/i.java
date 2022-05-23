package od;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.p0;
import ce.y;
import db.b;
import eb.k;
import nb.c;
import org.thunderdog.challegram.R;

public class i extends View implements k.b {
    public static final c f19520e0 = new c(-1, -10236163);
    public int M;
    public Bitmap N;
    public Canvas O;
    public boolean P;
    public float Q;
    public k R;
    public boolean S;
    public k T;
    public int U;
    public float V;
    public Drawable W;
    public int f19521a;
    public float f19522a0;
    public boolean f19523b;
    public float f19524b0;
    public Drawable f19525c;
    public boolean f19526c0;
    public k f19527d0;

    public i(Context context) {
        super(context);
        setBackgroundResource(R.drawable.bg_btn_header_light);
    }

    private void setActiveFactor(float f10) {
        if (this.f19524b0 != f10) {
            this.f19524b0 = f10;
            if (this.M == R.drawable.baseline_volume_up_24) {
                d();
            }
            invalidate();
        }
    }

    private void setEditedFactor(float f10) {
        if (this.Q != f10) {
            this.Q = f10;
            invalidate();
        }
    }

    private void setIconFactor(float f10) {
        int i10;
        if (this.V != f10) {
            this.V = f10;
            if (f10 >= 0.5f && (i10 = this.U) != 0) {
                setIconInternal(i10);
                this.U = 0;
            }
            invalidate();
        }
    }

    private void setIconInternal(int i10) {
        Drawable g10 = ce.c.g(getResources(), i10);
        this.f19525c = g10;
        this.M = i10;
        boolean z10 = this.f19523b;
        this.f19526c0 = z10;
        this.f19524b0 = z10 ? 1.0f : 0.0f;
        if (g10 != null && i10 == R.drawable.baseline_volume_up_24) {
            Bitmap bitmap = this.N;
            if (!(bitmap == null || (bitmap.getWidth() == this.f19525c.getMinimumWidth() && this.N.getHeight() == this.f19525c.getMinimumHeight()))) {
                this.N = null;
            }
            Bitmap bitmap2 = this.N;
            if (bitmap2 == null || bitmap2.isRecycled()) {
                this.N = Bitmap.createBitmap(this.f19525c.getMinimumWidth(), this.f19525c.getMinimumHeight(), Bitmap.Config.ARGB_8888);
                this.O = new Canvas(this.N);
            }
            d();
        }
    }

    public final void a(float f10) {
        if (this.f19527d0 == null) {
            this.f19527d0 = new k(0, this, b.f7287b, 180L, this.f19524b0);
        }
        this.f19527d0.i(f10);
    }

    public final void b(float f10) {
        if (this.R == null) {
            this.R = new k(2, this, b.f7287b, 110L, this.Q);
        }
        this.R.i(f10);
    }

    public final void c() {
        k kVar = this.T;
        if (kVar == null) {
            this.T = new k(1, this, b.f7290e, this.P ? 180L : 380L);
        } else if (kVar.o() >= 0.5f) {
            k kVar2 = this.T;
            kVar2.l(kVar2.o() == 1.0f ? 0.0f : this.T.o() - 0.5f);
        }
        this.U = this.f19521a;
        this.T.i(1.0f);
    }

    public final void d() {
        Canvas canvas = this.O;
        this.N.eraseColor(0);
        ce.c.b(canvas, this.f19525c, 0.0f, 0.0f, y.W(-1));
        if (this.f19524b0 != 0.0f) {
            int i10 = a0.i(2.0f);
            int i11 = a0.i(24.0f);
            int minimumWidth = this.f19525c.getMinimumWidth() / 2;
            int i12 = a0.i(0.5f);
            canvas.save();
            canvas.rotate(-45.0f, this.f19525c.getMinimumWidth() / 2, this.f19525c.getMinimumHeight() / 2);
            float f10 = minimumWidth;
            float f11 = i12;
            float f12 = i11;
            canvas.drawRect(f10, f11, minimumWidth + i10, ((int) (this.f19524b0 * f12)) + i12, y.D());
            canvas.drawRect(minimumWidth - i10, f11, f10, i12 + ((int) (f12 * this.f19524b0)), y.g(-1));
            canvas.restore();
        }
    }

    public final void e(float f10) {
        k kVar = this.f19527d0;
        if (kVar != null) {
            kVar.l(f10);
        }
        setActiveFactor(f10);
    }

    public final void f(float f10) {
        k kVar = this.R;
        if (kVar != null) {
            kVar.l(f10);
        }
        setEditedFactor(f10);
    }

    public final void g() {
        k kVar = this.T;
        if (kVar != null) {
            kVar.l(0.0f);
        }
        this.U = 0;
        setIconInternal(this.f19521a);
        invalidate();
    }

    public boolean h() {
        return this.f19526c0;
    }

    public void i(boolean z10, boolean z11) {
        if (this.f19526c0 != z10) {
            this.f19526c0 = z10;
            float f10 = 1.0f;
            if (z11) {
                if (!z10) {
                    f10 = 0.0f;
                }
                a(f10);
                return;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            e(f10);
        }
    }

    public void j(boolean z10, boolean z11) {
        if (this.S != z10) {
            this.S = z10;
            float f10 = 1.0f;
            if (z11) {
                if (!z10) {
                    f10 = 0.0f;
                }
                b(f10);
                return;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            f(f10);
        }
    }

    public void k(int i10, boolean z10, boolean z11) {
        if (this.f19521a != i10) {
            this.f19521a = i10;
            this.f19523b = z11;
            if (z10) {
                c();
            } else {
                g();
            }
        } else {
            i(z11, z10);
        }
    }

    public void l() {
        this.P = true;
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            setActiveFactor(f10);
        } else if (i10 == 1) {
            setIconFactor(f10);
        } else if (i10 == 2) {
            setEditedFactor(f10);
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: od.i.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return p0.z(this) && getAlpha() == 1.0f && super.onTouchEvent(motionEvent);
    }

    public void setSecondFactor(float f10) {
        if (this.f19522a0 != f10) {
            this.f19522a0 = f10;
            invalidate();
        }
    }

    public void setSecondIcon(int i10) {
        this.W = ce.c.g(getResources(), i10);
    }
}
