package sd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import be.C1357a0;
import be.C1359b;
import be.C1410y;
import me.C6879f3;
import p037cb.C2057b;
import p037cb.C2065g;
import p051db.C3940f;
import p051db.C3950k;
import p108hb.C5064d;
import p108hb.C5069h;
import p139jb.AbstractRunnableC5910b;

public class C8864b extends View implements C3950k.AbstractC3952b {
    public C6879f3 f28623M;
    public C8863a f28624N;
    public int f28625O;
    public int f28626P;
    public boolean f28627Q;
    public C3940f f28628R;
    public float f28629S;
    public boolean f28630T;
    public boolean f28632V;
    public boolean f28633W;
    public boolean f28635a0;
    public C8867c f28636b;
    public float f28637b0;
    public C8872e f28638c;
    public float f28639c0;
    public float f28640d0;
    public AbstractRunnableC5910b f28641e0;
    public boolean f28642f0;
    public C3940f f28643g0;
    public float f28646j0;
    public float f28647k0;
    public float f28648l0;
    public boolean f28649m0;
    public C3940f f28650n0;
    public AbstractC8866b f28651o0;
    public float f28652p0;
    public C3950k f28653q0;
    public boolean f28655s0;
    public float f28631U = -C1357a0.m37544i(72.0f);
    public final float[] f28644h0 = new float[3];
    public final float[] f28645i0 = new float[3];
    public final float[] f28654r0 = new float[3];
    public final Paint f28634a = new Paint(5);

    public class C8865a extends AbstractRunnableC5910b {
        public C8865a() {
        }

        @Override
        public void mo1364b() {
            if (C8864b.this.f28641e0 == this) {
                C8864b.this.m11075f();
            }
        }
    }

    public interface AbstractC8866b {
        void mo11068a(C8864b bVar, boolean z);

        void mo11067b(C8864b bVar, boolean z);
    }

    public C8864b(Context context) {
        super(context);
    }

    private void setCaught(boolean z) {
        if (this.f28627Q != z) {
            this.f28627Q = z;
            m11078c();
            if (z) {
                this.f28630T = true;
                m11072i(-C1357a0.m37544i(72.0f), false);
                m11077d();
            } else {
                setInLongTap(false);
                setPickingTone(false);
            }
            if (this.f28628R == null) {
                this.f28628R = new C3940f(0, this, C2057b.f7280b, 180L);
            }
            this.f28628R.m29577p(z, true);
        }
    }

    private void setColorFactor(float f) {
        this.f28655s0 = false;
        this.f28636b.setHue(f);
    }

    private void setDesireFactor(float f) {
        if (this.f28646j0 != f) {
            this.f28646j0 = f;
            m11069l();
        }
    }

    private void setInLongTap(boolean z) {
        if (this.f28642f0 != z) {
            this.f28642f0 = z;
            if (z) {
                this.f28638c.setHue(this.f28636b.getHue());
                this.f28636b.m11065b(this.f28644h0);
                this.f28636b.m11065b(this.f28645i0);
                float[] fArr = this.f28645i0;
                this.f28647k0 = fArr[1];
                this.f28648l0 = fArr[2];
            }
            if (this.f28643g0 == null) {
                this.f28643g0 = new C3940f(1, this, C2057b.f7280b, 180L);
            }
            this.f28643g0.m29577p(z, true);
            AbstractC8866b bVar = this.f28651o0;
            if (bVar != null) {
                bVar.mo11068a(this, z);
            }
        }
    }

    private void setPickingTone(boolean z) {
        if (this.f28649m0 != z) {
            this.f28649m0 = z;
            if (this.f28650n0 == null) {
                this.f28650n0 = new C3940f(3, this, C2057b.f7280b, 180L);
            }
            if (z) {
                this.f28650n0.m29577p(true, true);
            } else {
                float[] fArr = this.f28644h0;
                float[] fArr2 = this.f28645i0;
                float f = fArr2[2];
                fArr[2] = f;
                this.f28648l0 = f;
                float f2 = fArr2[1];
                fArr[1] = f2;
                this.f28647k0 = f2;
                this.f28650n0.m29577p(false, false);
            }
            AbstractC8866b bVar = this.f28651o0;
            if (bVar != null) {
                bVar.mo11067b(this, z);
            }
        }
    }

    private void setTapFactor(float f) {
        C8867c cVar = this.f28636b;
        float[] fArr = this.f28654r0;
        cVar.m11061f(C5064d.m24128e(f, fArr[1], fArr[2]), f);
    }

    private void setToneFactor(float f) {
        if (this.f28652p0 != f) {
            this.f28652p0 = f;
            this.f28638c.setAlpha(f);
            this.f28623M.setAlpha(f);
            this.f28636b.setInToneFactor(f);
            this.f28624N.setFactor(f);
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            setCaught(f);
        } else if (i == 1) {
            setToneFactor(f);
        } else if (i == 3) {
            setDesireFactor(f);
        } else if (i == 4) {
            setTapFactor(f);
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public final void m11078c() {
        AbstractRunnableC5910b bVar = this.f28641e0;
        if (bVar != null) {
            bVar.m21858c();
            this.f28641e0 = null;
        }
    }

    public final void m11077d() {
        C3950k kVar = this.f28653q0;
        if (kVar != null) {
            kVar.m29544k();
        }
    }

    public boolean m11076e() {
        return this.f28642f0;
    }

    public final void m11075f() {
        if (this.f28627Q && !this.f28632V && !this.f28633W) {
            performHapticFeedback(0);
            setInLongTap(true);
        }
    }

    public final void m11074g(float f) {
        float d = C5069h.m24090d((f - getPaddingLeft()) / ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()));
        C3950k kVar = this.f28653q0;
        if (kVar == null) {
            this.f28653q0 = new C3950k(4, this, C2057b.f7280b, 120L, this.f28636b.getHue());
        } else {
            kVar.m29543l(this.f28636b.getHue());
        }
        if (this.f28655s0) {
            C5064d.m24125h(this.f28636b.getBrushColor(), this.f28654r0);
        } else {
            float[] fArr = this.f28654r0;
            fArr[1] = 0.82f;
            fArr[2] = 0.54f;
        }
        this.f28653q0.m29546i(d);
        C2065g.m35722c(this);
    }

    public C8867c getPreview() {
        return this.f28636b;
    }

    public final void m11073h() {
        m11078c();
        if (this.f28638c != null) {
            C8865a aVar = new C8865a();
            this.f28641e0 = aVar;
            postDelayed(aVar, ViewConfiguration.getLongPressTimeout() * 2);
        }
    }

    public final void m11072i(float f, boolean z) {
        float max = Math.max(-C1357a0.m37544i(216.0f), Math.min(f, -C1357a0.m37544i(72.0f)));
        if (this.f28631U != max) {
            this.f28631U = max;
            this.f28636b.setBaseY(this.f28629S * max);
            if (z) {
                this.f28636b.setRadiusFactor((max + C1357a0.m37544i(72.0f)) / (-(C1357a0.m37544i(216.0f) - C1357a0.m37544i(72.0f))));
                this.f28630T = false;
            }
        }
    }

    public final void m11071j(float f, float f2) {
        if (this.f28647k0 != f || this.f28648l0 != f2) {
            this.f28647k0 = f;
            this.f28648l0 = f2;
            if (this.f28646j0 > 0.0f) {
                m11069l();
            }
        }
    }

    public void m11070k(C8872e eVar, C6879f3 f3Var) {
        this.f28638c = eVar;
        this.f28623M = f3Var;
    }

    public final void m11069l() {
        float[] fArr = this.f28645i0;
        float[] fArr2 = this.f28644h0;
        fArr[0] = fArr2[0];
        float f = fArr2[1];
        float f2 = this.f28647k0 - fArr2[1];
        float f3 = this.f28646j0;
        fArr[1] = f + (f2 * f3);
        fArr[2] = fArr2[2] + ((this.f28648l0 - fArr2[2]) * f3);
        this.f28655s0 = true;
        this.f28636b.m11062e(fArr[0], fArr[1], fArr[2]);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = (measuredWidth - paddingLeft) - getPaddingRight();
        int paddingBottom = (measuredHeight - paddingTop) - getPaddingBottom();
        boolean z = (paddingLeft == 0 && paddingTop == 0) ? false : true;
        if (z) {
            canvas.save();
            canvas.translate(paddingLeft, paddingTop);
        }
        RectF a0 = C1410y.m37053a0();
        a0.set(0.0f, 0.0f, paddingRight, paddingBottom);
        canvas.drawRoundRect(a0, C1357a0.m37544i(6.0f), C1357a0.m37544i(6.0f), this.f28634a);
        if (z) {
            canvas.restore();
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C8863a aVar = this.f28624N;
        if (aVar != null) {
            aVar.setPickerLeft(i + getPaddingLeft());
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        if (!(this.f28625O == measuredWidth && this.f28626P == measuredHeight)) {
            this.f28625O = measuredWidth;
            this.f28626P = measuredHeight;
            float f = measuredHeight / 2;
            this.f28634a.setShader(new LinearGradient(f, 0.0f, measuredWidth, f, C1359b.f4957a, (float[]) null, Shader.TileMode.MIRROR));
        }
        C8867c cVar = this.f28636b;
        if (cVar != null) {
            cVar.setTargetWidth(measuredWidth);
        }
        C8863a aVar = this.f28624N;
        if (aVar != null) {
            aVar.setPickerWidth((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f28636b == null) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float measuredWidth = (getMeasuredWidth() - paddingLeft) - getPaddingRight();
        float measuredHeight = (getMeasuredHeight() - paddingTop) - getPaddingBottom();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                setCaught(false);
                if (this.f28635a0) {
                    m11074g(motionEvent.getX());
                }
            } else if (action != 2) {
                if (action == 3) {
                    setCaught(false);
                }
            } else if (this.f28627Q) {
                if (!this.f28633W && this.f28639c0 - y > C1357a0.m37537p() * 1.5d) {
                    this.f28633W = true;
                    m11078c();
                    this.f28639c0 = y;
                }
                if (!this.f28632V && !this.f28633W && Math.abs(this.f28637b0 - x) > C1357a0.m37537p()) {
                    this.f28632V = true;
                    m11078c();
                    this.f28637b0 = x;
                }
                if (this.f28642f0) {
                    float d = C5069h.m24090d((x + getLeft()) / this.f28638c.getMeasuredWidth());
                    float d2 = C5069h.m24090d(y < 0.0f ? (-y) / this.f28638c.getMeasuredHeight() : 0.0f);
                    m11071j(d, d2);
                    if (!this.f28649m0 && d2 != 0.0f) {
                        setPickingTone(true);
                    }
                } else {
                    if (this.f28633W) {
                        m11072i((-C1357a0.m37544i(72.0f)) + (y - this.f28639c0), true);
                    }
                    if (this.f28632V) {
                        setColorFactor(C5069h.m24090d(this.f28640d0 + ((x - this.f28637b0) / measuredWidth)));
                    }
                }
            }
            return true;
        }
        float f = paddingTop + (measuredHeight / 2.0f);
        this.f28637b0 = x;
        this.f28639c0 = y;
        this.f28640d0 = this.f28636b.getHue();
        this.f28632V = false;
        this.f28633W = false;
        this.f28635a0 = false;
        m11078c();
        float i = C1357a0.m37544i(24.0f);
        boolean z = Math.abs(x - ((this.f28636b.getHue() * measuredWidth) + paddingLeft)) <= i;
        boolean z2 = Math.abs(y - f) < i;
        boolean z3 = z && z2;
        setCaught(z3);
        if (z3) {
            m11073h();
        } else if (z2 && x >= paddingLeft && x <= paddingLeft + measuredWidth) {
            this.f28635a0 = true;
        }
        return z3 || this.f28635a0;
    }

    public void setDirection(C8863a aVar) {
        this.f28624N = aVar;
    }

    public void setPreview(C8867c cVar) {
        this.f28636b = cVar;
    }

    public void setToneEventListener(AbstractC8866b bVar) {
        this.f28651o0 = bVar;
    }

    private void setCaught(float f) {
        if (this.f28629S != f) {
            this.f28629S = f;
            if (this.f28630T) {
                this.f28636b.m11060g(f, false);
            }
            this.f28636b.setBaseY(this.f28631U * f);
            this.f28636b.setScaleFactor(f);
        }
    }
}
