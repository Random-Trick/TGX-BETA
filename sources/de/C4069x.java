package de;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import be.C1357a0;
import be.C1379j0;
import be.C1410y;
import nc.C7389v0;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p108hb.C5064d;
import p108hb.C5069h;

public class C4069x extends View implements C3950k.AbstractC3952b {
    public boolean f13732M;
    public Runnable f13733N;
    public Bitmap f13734O;
    public int f13735P;
    public Bitmap f13736Q;
    public int f13737R;
    public AbstractC4070a f13738S;
    public float f13739T;
    public C3950k f13740U;
    public C3940f f13741V;
    public boolean f13742a = true;
    public float f13743b = 1.0f;
    public C3950k f13744c;

    public interface AbstractC4070a {
        void mo29046N5();

        void mo29045t5();
    }

    public C4069x(Context context) {
        super(context);
    }

    private void setFlashFactor(float f) {
        if (this.f13739T != f) {
            this.f13739T = f;
            invalidate();
        }
    }

    private void setOverlayFactor(float f) {
        if (this.f13743b != f) {
            this.f13743b = f;
            invalidate();
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            setOverlayFactor(f);
        } else if (i == 1) {
            setFlashFactor(f);
        } else if (i == 2) {
            invalidate();
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 0) {
            Runnable runnable = this.f13733N;
            if (runnable != null) {
                runnable.run();
                this.f13733N = null;
            }
        } else if (i == 1) {
            AbstractC4070a aVar = this.f13738S;
            if (aVar != null) {
                if (f == 1.0f) {
                    aVar.mo29045t5();
                } else if (f == 0.0f) {
                    aVar.mo29046N5();
                }
            } else if (f == 1.0f) {
                m29051c(true);
            }
        }
    }

    public final void m29053a(float f) {
        C3950k kVar = this.f13744c;
        if (kVar != null) {
            kVar.m29543l(f);
        }
        setOverlayFactor(f);
    }

    public void m29052b() {
        C3950k kVar = this.f13740U;
        if (kVar == null) {
            this.f13740U = new C3950k(1, this, C2057b.f7280b, 280L, this.f13739T);
        } else {
            kVar.m29530y(280L);
            this.f13740U.m29555F(0L);
        }
        this.f13740U.m29546i(1.0f);
    }

    public void m29051c(boolean z) {
        C3950k kVar = this.f13740U;
        if (kVar != null) {
            kVar.m29555F(z ? 1000L : 0L);
            this.f13740U.m29530y(120L);
            this.f13740U.m29546i(0.0f);
        }
    }

    public void m29050d() {
        this.f13742a = true;
        if (C7389v0.m16756A1(this.f13736Q)) {
            this.f13734O = this.f13736Q;
            this.f13735P = this.f13737R;
        } else {
            this.f13734O = null;
        }
        this.f13736Q = null;
        m29053a(1.0f);
        invalidate();
    }

    public void m29049e(boolean z, boolean z2) {
        if (this.f13741V == null) {
            this.f13741V = new C3940f(2, this, C2057b.f7280b, 120L);
        }
        this.f13741V.m29577p(z, z2);
    }

    public void m29048f(boolean z, boolean z2, Runnable runnable) {
        if (this.f13742a != z) {
            this.f13742a = z;
            float f = z ? 1.0f : 0.0f;
            if (z2) {
                this.f13733N = runnable;
                if (this.f13744c == null) {
                    this.f13744c = new C3950k(0, this, C2057b.f7280b, 140L, this.f13743b);
                }
                this.f13744c.m29530y(((!this.f13732M || this.f13736Q != null) && !z) ? 290L : 180L);
                this.f13744c.m29546i(f);
                return;
            }
            this.f13733N = null;
            C3950k kVar = this.f13744c;
            if (kVar != null) {
                kVar.m29543l(f);
            }
            this.f13743b = f;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void m29047g(Bitmap bitmap, int i) {
        this.f13736Q = bitmap;
        this.f13737R = i;
        invalidate();
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        Bitmap bitmap;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i3 = (int) (this.f13743b * 255.0f);
        int i4 = 0;
        if (i3 > 0) {
            Bitmap bitmap2 = this.f13736Q;
            if (bitmap2 == null || bitmap2.isRecycled()) {
                canvas.drawColor(C5064d.m24131b(i3, 0));
            } else {
                Paint j = C1410y.m37036j();
                if (i3 != 255) {
                    j.setAlpha(i3);
                }
                int l = C5069h.m24082l(this.f13737R - C1379j0.m37310r(getContext()).m14512a1(), 360);
                if (l == 180) {
                    l = 0;
                }
                if (C7389v0.m16564x1(l)) {
                    i2 = this.f13736Q.getHeight();
                    i = this.f13736Q.getWidth();
                } else {
                    i2 = this.f13736Q.getWidth();
                    i = this.f13736Q.getHeight();
                }
                float f = measuredWidth;
                float f2 = measuredHeight;
                float max = Math.max(f / i2, f2 / i);
                int i5 = (max > 1.0f ? 1 : (max == 1.0f ? 0 : -1));
                boolean z = (i5 == 0 && l == 0) ? false : true;
                if (z) {
                    canvas.save();
                    if (i5 != 0) {
                        canvas.scale(max, max, f / 2.0f, f2 / 2.0f);
                    }
                    if (l != 0) {
                        canvas.rotate(l, f / 2.0f, f2 / 2.0f);
                    }
                }
                canvas.drawBitmap(this.f13736Q, (f / 2.0f) - (bitmap.getWidth() / 2.0f), (f2 / 2.0f) - (this.f13736Q.getHeight() / 2.0f), j);
                if (z) {
                    canvas.restore();
                }
                if (i3 != 255) {
                    j.setAlpha(255);
                }
            }
        }
        C3940f fVar = this.f13741V;
        if ((fVar != null ? fVar.m29586g() : 0.0f) > 0.0f) {
            int i6 = measuredWidth / 3;
            int i7 = measuredHeight / 3;
            int i8 = 0;
            int i9 = 0;
            while (i9 < 2) {
                int i10 = i4 + i6;
                int i11 = i8 + i7;
                float f3 = i10;
                canvas.drawLine(f3, 0.0f, f3, measuredHeight, C1410y.m37056Y(1258291199, C1357a0.m37544i(1.0f)));
                float f4 = i11;
                canvas.drawLine(0.0f, f4, measuredWidth, f4, C1410y.m37056Y(1258291199, C1357a0.m37544i(1.0f)));
                i9++;
                i4 = i10;
                i8 = i11;
            }
        }
        int i12 = (int) (this.f13739T * 255.0f * 1.0f);
        if (i12 > 0) {
            canvas.drawColor(C5064d.m24131b(i12, 16574674));
        }
    }

    public void setFlashListener(AbstractC4070a aVar) {
        this.f13738S = aVar;
    }

    public void setNeedFastAnimations(boolean z) {
        if (this.f13732M != z) {
            this.f13732M = z;
            if (z) {
                if (C7389v0.m16756A1(this.f13734O) && this.f13734O.getPixel(0, 0) != 0) {
                    this.f13736Q = this.f13734O;
                    this.f13737R = this.f13735P;
                }
                invalidate();
            }
        }
    }
}
