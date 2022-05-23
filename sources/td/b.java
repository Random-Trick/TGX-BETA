package td;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ce.a0;
import ce.y;
import db.g;
import eb.f;
import eb.k;
import ib.d;
import ib.h;
import ne.f3;

public class b extends View implements k.b {
    public f3 M;
    public td.a N;
    public int O;
    public int P;
    public boolean Q;
    public f R;
    public float S;
    public boolean T;
    public boolean V;
    public boolean W;
    public boolean f23387a0;
    public c f23388b;
    public float f23389b0;
    public e f23390c;
    public float f23391c0;
    public float f23392d0;
    public kb.b f23393e0;
    public boolean f23394f0;
    public f f23395g0;
    public float f23398j0;
    public float f23399k0;
    public float f23400l0;
    public boolean f23401m0;
    public f f23402n0;
    public AbstractC0218b f23403o0;
    public float f23404p0;
    public k f23405q0;
    public boolean f23407s0;
    public float U = -a0.i(72.0f);
    public final float[] f23396h0 = new float[3];
    public final float[] f23397i0 = new float[3];
    public final float[] f23406r0 = new float[3];
    public final Paint f23386a = new Paint(5);

    public class a extends kb.b {
        public a() {
        }

        @Override
        public void b() {
            if (b.this.f23393e0 == this) {
                b.this.f();
            }
        }
    }

    public interface AbstractC0218b {
        void a(b bVar, boolean z10);

        void b(b bVar, boolean z10);
    }

    public b(Context context) {
        super(context);
    }

    private void setCaught(boolean z10) {
        if (this.Q != z10) {
            this.Q = z10;
            c();
            if (z10) {
                this.T = true;
                i(-a0.i(72.0f), false);
                d();
            } else {
                setInLongTap(false);
                setPickingTone(false);
            }
            if (this.R == null) {
                this.R = new f(0, this, db.b.f7287b, 180L);
            }
            this.R.p(z10, true);
        }
    }

    private void setColorFactor(float f10) {
        this.f23407s0 = false;
        this.f23388b.setHue(f10);
    }

    private void setDesireFactor(float f10) {
        if (this.f23398j0 != f10) {
            this.f23398j0 = f10;
            l();
        }
    }

    private void setInLongTap(boolean z10) {
        if (this.f23394f0 != z10) {
            this.f23394f0 = z10;
            if (z10) {
                this.f23390c.setHue(this.f23388b.getHue());
                this.f23388b.b(this.f23396h0);
                this.f23388b.b(this.f23397i0);
                float[] fArr = this.f23397i0;
                this.f23399k0 = fArr[1];
                this.f23400l0 = fArr[2];
            }
            if (this.f23395g0 == null) {
                this.f23395g0 = new f(1, this, db.b.f7287b, 180L);
            }
            this.f23395g0.p(z10, true);
            AbstractC0218b bVar = this.f23403o0;
            if (bVar != null) {
                bVar.a(this, z10);
            }
        }
    }

    private void setPickingTone(boolean z10) {
        if (this.f23401m0 != z10) {
            this.f23401m0 = z10;
            if (this.f23402n0 == null) {
                this.f23402n0 = new f(3, this, db.b.f7287b, 180L);
            }
            if (z10) {
                this.f23402n0.p(true, true);
            } else {
                float[] fArr = this.f23396h0;
                float[] fArr2 = this.f23397i0;
                float f10 = fArr2[2];
                fArr[2] = f10;
                this.f23400l0 = f10;
                float f11 = fArr2[1];
                fArr[1] = f11;
                this.f23399k0 = f11;
                this.f23402n0.p(false, false);
            }
            AbstractC0218b bVar = this.f23403o0;
            if (bVar != null) {
                bVar.b(this, z10);
            }
        }
    }

    private void setTapFactor(float f10) {
        c cVar = this.f23388b;
        float[] fArr = this.f23406r0;
        cVar.f(d.e(f10, fArr[1], fArr[2]), f10);
    }

    private void setToneFactor(float f10) {
        if (this.f23404p0 != f10) {
            this.f23404p0 = f10;
            this.f23390c.setAlpha(f10);
            this.M.setAlpha(f10);
            this.f23388b.setInToneFactor(f10);
            this.N.setFactor(f10);
        }
    }

    public final void c() {
        kb.b bVar = this.f23393e0;
        if (bVar != null) {
            bVar.c();
            this.f23393e0 = null;
        }
    }

    public final void d() {
        k kVar = this.f23405q0;
        if (kVar != null) {
            kVar.k();
        }
    }

    public boolean e() {
        return this.f23394f0;
    }

    public final void f() {
        if (this.Q && !this.V && !this.W) {
            performHapticFeedback(0);
            setInLongTap(true);
        }
    }

    public final void g(float f10) {
        float d10 = h.d((f10 - getPaddingLeft()) / ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()));
        k kVar = this.f23405q0;
        if (kVar == null) {
            this.f23405q0 = new k(4, this, db.b.f7287b, 120L, this.f23388b.getHue());
        } else {
            kVar.l(this.f23388b.getHue());
        }
        if (this.f23407s0) {
            d.h(this.f23388b.getBrushColor(), this.f23406r0);
        } else {
            float[] fArr = this.f23406r0;
            fArr[1] = 0.82f;
            fArr[2] = 0.54f;
        }
        this.f23405q0.i(d10);
        g.c(this);
    }

    public c getPreview() {
        return this.f23388b;
    }

    public final void h() {
        c();
        if (this.f23390c != null) {
            a aVar = new a();
            this.f23393e0 = aVar;
            postDelayed(aVar, ViewConfiguration.getLongPressTimeout() * 2);
        }
    }

    public final void i(float f10, boolean z10) {
        float max = Math.max(-a0.i(216.0f), Math.min(f10, -a0.i(72.0f)));
        if (this.U != max) {
            this.U = max;
            this.f23388b.setBaseY(this.S * max);
            if (z10) {
                this.f23388b.setRadiusFactor((max + a0.i(72.0f)) / (-(a0.i(216.0f) - a0.i(72.0f))));
                this.T = false;
            }
        }
    }

    public final void j(float f10, float f11) {
        if (this.f23399k0 != f10 || this.f23400l0 != f11) {
            this.f23399k0 = f10;
            this.f23400l0 = f11;
            if (this.f23398j0 > 0.0f) {
                l();
            }
        }
    }

    public void k(e eVar, f3 f3Var) {
        this.f23390c = eVar;
        this.M = f3Var;
    }

    public final void l() {
        float[] fArr = this.f23397i0;
        float[] fArr2 = this.f23396h0;
        fArr[0] = fArr2[0];
        float f10 = fArr2[1];
        float f11 = this.f23399k0 - fArr2[1];
        float f12 = this.f23398j0;
        fArr[1] = f10 + (f11 * f12);
        fArr[2] = fArr2[2] + ((this.f23400l0 - fArr2[2]) * f12);
        this.f23407s0 = true;
        this.f23388b.e(fArr[0], fArr[1], fArr[2]);
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            setCaught(f10);
        } else if (i10 == 1) {
            setToneFactor(f10);
        } else if (i10 == 3) {
            setDesireFactor(f10);
        } else if (i10 == 4) {
            setTapFactor(f10);
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = (measuredWidth - paddingLeft) - getPaddingRight();
        int paddingBottom = (measuredHeight - paddingTop) - getPaddingBottom();
        boolean z10 = (paddingLeft == 0 && paddingTop == 0) ? false : true;
        if (z10) {
            canvas.save();
            canvas.translate(paddingLeft, paddingTop);
        }
        RectF a02 = y.a0();
        a02.set(0.0f, 0.0f, paddingRight, paddingBottom);
        canvas.drawRoundRect(a02, a0.i(6.0f), a0.i(6.0f), this.f23386a);
        if (z10) {
            canvas.restore();
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        td.a aVar = this.N;
        if (aVar != null) {
            aVar.setPickerLeft(i10 + getPaddingLeft());
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        if (!(this.O == measuredWidth && this.P == measuredHeight)) {
            this.O = measuredWidth;
            this.P = measuredHeight;
            float f10 = measuredHeight / 2;
            this.f23386a.setShader(new LinearGradient(f10, 0.0f, measuredWidth, f10, ce.b.f5224a, (float[]) null, Shader.TileMode.MIRROR));
        }
        c cVar = this.f23388b;
        if (cVar != null) {
            cVar.setTargetWidth(measuredWidth);
        }
        td.a aVar = this.N;
        if (aVar != null) {
            aVar.setPickerWidth((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f23388b == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float measuredWidth = (getMeasuredWidth() - paddingLeft) - getPaddingRight();
        float measuredHeight = (getMeasuredHeight() - paddingTop) - getPaddingBottom();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                setCaught(false);
                if (this.f23387a0) {
                    g(motionEvent.getX());
                }
            } else if (action != 2) {
                if (action == 3) {
                    setCaught(false);
                }
            } else if (this.Q) {
                if (!this.W && this.f23391c0 - y10 > a0.p() * 1.5d) {
                    this.W = true;
                    c();
                    this.f23391c0 = y10;
                }
                if (!this.V && !this.W && Math.abs(this.f23389b0 - x10) > a0.p()) {
                    this.V = true;
                    c();
                    this.f23389b0 = x10;
                }
                if (this.f23394f0) {
                    float d10 = h.d((x10 + getLeft()) / this.f23390c.getMeasuredWidth());
                    float d11 = h.d(y10 < 0.0f ? (-y10) / this.f23390c.getMeasuredHeight() : 0.0f);
                    j(d10, d11);
                    if (!this.f23401m0 && d11 != 0.0f) {
                        setPickingTone(true);
                    }
                } else {
                    if (this.W) {
                        i((-a0.i(72.0f)) + (y10 - this.f23391c0), true);
                    }
                    if (this.V) {
                        setColorFactor(h.d(this.f23392d0 + ((x10 - this.f23389b0) / measuredWidth)));
                    }
                }
            }
            return true;
        }
        float f10 = paddingTop + (measuredHeight / 2.0f);
        this.f23389b0 = x10;
        this.f23391c0 = y10;
        this.f23392d0 = this.f23388b.getHue();
        this.V = false;
        this.W = false;
        this.f23387a0 = false;
        c();
        float i10 = a0.i(24.0f);
        boolean z10 = Math.abs(x10 - ((this.f23388b.getHue() * measuredWidth) + paddingLeft)) <= i10;
        boolean z11 = Math.abs(y10 - f10) < i10;
        boolean z12 = z10 && z11;
        setCaught(z12);
        if (z12) {
            h();
        } else if (z11 && x10 >= paddingLeft && x10 <= paddingLeft + measuredWidth) {
            this.f23387a0 = true;
        }
        return z12 || this.f23387a0;
    }

    public void setDirection(td.a aVar) {
        this.N = aVar;
    }

    public void setPreview(c cVar) {
        this.f23388b = cVar;
    }

    public void setToneEventListener(AbstractC0218b bVar) {
        this.f23403o0 = bVar;
    }

    private void setCaught(float f10) {
        if (this.S != f10) {
            this.S = f10;
            if (this.T) {
                this.f23388b.g(f10, false);
            }
            this.f23388b.setBaseY(this.U * f10);
            this.f23388b.setScaleFactor(f10);
        }
    }
}
