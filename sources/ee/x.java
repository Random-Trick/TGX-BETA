package ee;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import ce.a0;
import ce.j0;
import ce.y;
import db.b;
import eb.f;
import eb.k;
import ib.d;
import ib.h;
import oc.v0;

public class x extends View implements k.b {
    public boolean M;
    public Runnable N;
    public Bitmap O;
    public int P;
    public Bitmap Q;
    public int R;
    public a S;
    public float T;
    public k U;
    public f V;
    public boolean f11746a = true;
    public float f11747b = 1.0f;
    public k f11748c;

    public interface a {
        void K5();

        void o5();
    }

    public x(Context context) {
        super(context);
    }

    private void setFlashFactor(float f10) {
        if (this.T != f10) {
            this.T = f10;
            invalidate();
        }
    }

    private void setOverlayFactor(float f10) {
        if (this.f11747b != f10) {
            this.f11747b = f10;
            invalidate();
        }
    }

    public final void a(float f10) {
        k kVar = this.f11748c;
        if (kVar != null) {
            kVar.l(f10);
        }
        setOverlayFactor(f10);
    }

    public void b() {
        k kVar = this.U;
        if (kVar == null) {
            this.U = new k(1, this, b.f7287b, 280L, this.T);
        } else {
            kVar.y(280L);
            this.U.F(0L);
        }
        this.U.i(1.0f);
    }

    public void c(boolean z10) {
        k kVar = this.U;
        if (kVar != null) {
            kVar.F(z10 ? 1000L : 0L);
            this.U.y(120L);
            this.U.i(0.0f);
        }
    }

    public void d() {
        this.f11746a = true;
        if (v0.A1(this.Q)) {
            this.O = this.Q;
            this.P = this.R;
        } else {
            this.O = null;
        }
        this.Q = null;
        a(1.0f);
        invalidate();
    }

    public void e(boolean z10, boolean z11) {
        if (this.V == null) {
            this.V = new f(2, this, b.f7287b, 120L);
        }
        this.V.p(z10, z11);
    }

    public void f(boolean z10, boolean z11, Runnable runnable) {
        if (this.f11746a != z10) {
            this.f11746a = z10;
            float f10 = z10 ? 1.0f : 0.0f;
            if (z11) {
                this.N = runnable;
                if (this.f11748c == null) {
                    this.f11748c = new k(0, this, b.f7287b, 140L, this.f11747b);
                }
                this.f11748c.y(((!this.M || this.Q != null) && !z10) ? 290L : 180L);
                this.f11748c.i(f10);
                return;
            }
            this.N = null;
            k kVar = this.f11748c;
            if (kVar != null) {
                kVar.l(f10);
            }
            this.f11747b = f10;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void g(Bitmap bitmap, int i10) {
        this.Q = bitmap;
        this.R = i10;
        invalidate();
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            setOverlayFactor(f10);
        } else if (i10 == 1) {
            setFlashFactor(f10);
        } else if (i10 == 2) {
            invalidate();
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (i10 == 0) {
            Runnable runnable = this.N;
            if (runnable != null) {
                runnable.run();
                this.N = null;
            }
        } else if (i10 == 1) {
            a aVar = this.S;
            if (aVar != null) {
                if (f10 == 1.0f) {
                    aVar.o5();
                } else if (f10 == 0.0f) {
                    aVar.K5();
                }
            } else if (f10 == 1.0f) {
                c(true);
            }
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10;
        int i11;
        Bitmap bitmap;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i12 = (int) (this.f11747b * 255.0f);
        int i13 = 0;
        if (i12 > 0) {
            Bitmap bitmap2 = this.Q;
            if (bitmap2 == null || bitmap2.isRecycled()) {
                canvas.drawColor(d.b(i12, 0));
            } else {
                Paint j10 = y.j();
                if (i12 != 255) {
                    j10.setAlpha(i12);
                }
                int l10 = h.l(this.R - j0.r(getContext()).c1(), 360);
                if (l10 == 180) {
                    l10 = 0;
                }
                if (v0.x1(l10)) {
                    i11 = this.Q.getHeight();
                    i10 = this.Q.getWidth();
                } else {
                    i11 = this.Q.getWidth();
                    i10 = this.Q.getHeight();
                }
                float f10 = measuredWidth;
                float f11 = measuredHeight;
                float max = Math.max(f10 / i11, f11 / i10);
                int i14 = (max > 1.0f ? 1 : (max == 1.0f ? 0 : -1));
                boolean z10 = (i14 == 0 && l10 == 0) ? false : true;
                if (z10) {
                    canvas.save();
                    if (i14 != 0) {
                        canvas.scale(max, max, f10 / 2.0f, f11 / 2.0f);
                    }
                    if (l10 != 0) {
                        canvas.rotate(l10, f10 / 2.0f, f11 / 2.0f);
                    }
                }
                canvas.drawBitmap(this.Q, (f10 / 2.0f) - (bitmap.getWidth() / 2.0f), (f11 / 2.0f) - (this.Q.getHeight() / 2.0f), j10);
                if (z10) {
                    canvas.restore();
                }
                if (i12 != 255) {
                    j10.setAlpha(255);
                }
            }
        }
        f fVar = this.V;
        if ((fVar != null ? fVar.g() : 0.0f) > 0.0f) {
            int i15 = measuredWidth / 3;
            int i16 = measuredHeight / 3;
            int i17 = 0;
            int i18 = 0;
            while (i18 < 2) {
                int i19 = i13 + i15;
                int i20 = i17 + i16;
                float f12 = i19;
                canvas.drawLine(f12, 0.0f, f12, measuredHeight, y.Y(1258291199, a0.i(1.0f)));
                float f13 = i20;
                canvas.drawLine(0.0f, f13, measuredWidth, f13, y.Y(1258291199, a0.i(1.0f)));
                i18++;
                i13 = i19;
                i17 = i20;
            }
        }
        int i21 = (int) (this.T * 255.0f * 1.0f);
        if (i21 > 0) {
            canvas.drawColor(d.b(i21, 16574674));
        }
    }

    public void setFlashListener(a aVar) {
        this.S = aVar;
    }

    public void setNeedFastAnimations(boolean z10) {
        if (this.M != z10) {
            this.M = z10;
            if (z10) {
                if (v0.A1(this.O) && this.O.getPixel(0, 0) != 0) {
                    this.Q = this.O;
                    this.R = this.P;
                }
                invalidate();
            }
        }
    }
}
