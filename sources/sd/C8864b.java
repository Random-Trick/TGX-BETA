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
    public C6879f3 f28620M;
    public C8863a f28621N;
    public int f28622O;
    public int f28623P;
    public boolean f28624Q;
    public C3940f f28625R;
    public float f28626S;
    public boolean f28627T;
    public boolean f28629V;
    public boolean f28630W;
    public boolean f28632a0;
    public C8867c f28633b;
    public float f28634b0;
    public C8872e f28635c;
    public float f28636c0;
    public float f28637d0;
    public AbstractRunnableC5910b f28638e0;
    public boolean f28639f0;
    public C3940f f28640g0;
    public float f28643j0;
    public float f28644k0;
    public float f28645l0;
    public boolean f28646m0;
    public C3940f f28647n0;
    public AbstractC8866b f28648o0;
    public float f28649p0;
    public C3950k f28650q0;
    public boolean f28652s0;
    public float f28628U = -C1357a0.m37541i(72.0f);
    public final float[] f28641h0 = new float[3];
    public final float[] f28642i0 = new float[3];
    public final float[] f28651r0 = new float[3];
    public final Paint f28631a = new Paint(5);

    public class C8865a extends AbstractRunnableC5910b {
        public C8865a() {
        }

        @Override
        public void mo1364b() {
            if (C8864b.this.f28638e0 == this) {
                C8864b.this.m11076f();
            }
        }
    }

    public interface AbstractC8866b {
        void mo11069a(C8864b bVar, boolean z);

        void mo11068b(C8864b bVar, boolean z);
    }

    public C8864b(Context context) {
        super(context);
    }

    private void setCaught(boolean z) {
        if (this.f28624Q != z) {
            this.f28624Q = z;
            m11079c();
            if (z) {
                this.f28627T = true;
                m11073i(-C1357a0.m37541i(72.0f), false);
                m11078d();
            } else {
                setInLongTap(false);
                setPickingTone(false);
            }
            if (this.f28625R == null) {
                this.f28625R = new C3940f(0, this, C2057b.f7280b, 180L);
            }
            this.f28625R.m29575p(z, true);
        }
    }

    private void setColorFactor(float f) {
        this.f28652s0 = false;
        this.f28633b.setHue(f);
    }

    private void setDesireFactor(float f) {
        if (this.f28643j0 != f) {
            this.f28643j0 = f;
            m11070l();
        }
    }

    private void setInLongTap(boolean z) {
        if (this.f28639f0 != z) {
            this.f28639f0 = z;
            if (z) {
                this.f28635c.setHue(this.f28633b.getHue());
                this.f28633b.m11066b(this.f28641h0);
                this.f28633b.m11066b(this.f28642i0);
                float[] fArr = this.f28642i0;
                this.f28644k0 = fArr[1];
                this.f28645l0 = fArr[2];
            }
            if (this.f28640g0 == null) {
                this.f28640g0 = new C3940f(1, this, C2057b.f7280b, 180L);
            }
            this.f28640g0.m29575p(z, true);
            AbstractC8866b bVar = this.f28648o0;
            if (bVar != null) {
                bVar.mo11069a(this, z);
            }
        }
    }

    private void setPickingTone(boolean z) {
        if (this.f28646m0 != z) {
            this.f28646m0 = z;
            if (this.f28647n0 == null) {
                this.f28647n0 = new C3940f(3, this, C2057b.f7280b, 180L);
            }
            if (z) {
                this.f28647n0.m29575p(true, true);
            } else {
                float[] fArr = this.f28641h0;
                float[] fArr2 = this.f28642i0;
                float f = fArr2[2];
                fArr[2] = f;
                this.f28645l0 = f;
                float f2 = fArr2[1];
                fArr[1] = f2;
                this.f28644k0 = f2;
                this.f28647n0.m29575p(false, false);
            }
            AbstractC8866b bVar = this.f28648o0;
            if (bVar != null) {
                bVar.mo11068b(this, z);
            }
        }
    }

    private void setTapFactor(float f) {
        C8867c cVar = this.f28633b;
        float[] fArr = this.f28651r0;
        cVar.m11062f(C5064d.m24127e(f, fArr[1], fArr[2]), f);
    }

    private void setToneFactor(float f) {
        if (this.f28649p0 != f) {
            this.f28649p0 = f;
            this.f28635c.setAlpha(f);
            this.f28620M.setAlpha(f);
            this.f28633b.setInToneFactor(f);
            this.f28621N.setFactor(f);
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

    public final void m11079c() {
        AbstractRunnableC5910b bVar = this.f28638e0;
        if (bVar != null) {
            bVar.m21857c();
            this.f28638e0 = null;
        }
    }

    public final void m11078d() {
        C3950k kVar = this.f28650q0;
        if (kVar != null) {
            kVar.m29542k();
        }
    }

    public boolean m11077e() {
        return this.f28639f0;
    }

    public final void m11076f() {
        if (this.f28624Q && !this.f28629V && !this.f28630W) {
            performHapticFeedback(0);
            setInLongTap(true);
        }
    }

    public final void m11075g(float f) {
        float d = C5069h.m24089d((f - getPaddingLeft()) / ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()));
        C3950k kVar = this.f28650q0;
        if (kVar == null) {
            this.f28650q0 = new C3950k(4, this, C2057b.f7280b, 120L, this.f28633b.getHue());
        } else {
            kVar.m29541l(this.f28633b.getHue());
        }
        if (this.f28652s0) {
            C5064d.m24124h(this.f28633b.getBrushColor(), this.f28651r0);
        } else {
            float[] fArr = this.f28651r0;
            fArr[1] = 0.82f;
            fArr[2] = 0.54f;
        }
        this.f28650q0.m29544i(d);
        C2065g.m35719c(this);
    }

    public C8867c getPreview() {
        return this.f28633b;
    }

    public final void m11074h() {
        m11079c();
        if (this.f28635c != null) {
            C8865a aVar = new C8865a();
            this.f28638e0 = aVar;
            postDelayed(aVar, ViewConfiguration.getLongPressTimeout() * 2);
        }
    }

    public final void m11073i(float f, boolean z) {
        float max = Math.max(-C1357a0.m37541i(216.0f), Math.min(f, -C1357a0.m37541i(72.0f)));
        if (this.f28628U != max) {
            this.f28628U = max;
            this.f28633b.setBaseY(this.f28626S * max);
            if (z) {
                this.f28633b.setRadiusFactor((max + C1357a0.m37541i(72.0f)) / (-(C1357a0.m37541i(216.0f) - C1357a0.m37541i(72.0f))));
                this.f28627T = false;
            }
        }
    }

    public final void m11072j(float f, float f2) {
        if (this.f28644k0 != f || this.f28645l0 != f2) {
            this.f28644k0 = f;
            this.f28645l0 = f2;
            if (this.f28643j0 > 0.0f) {
                m11070l();
            }
        }
    }

    public void m11071k(C8872e eVar, C6879f3 f3Var) {
        this.f28635c = eVar;
        this.f28620M = f3Var;
    }

    public final void m11070l() {
        float[] fArr = this.f28642i0;
        float[] fArr2 = this.f28641h0;
        fArr[0] = fArr2[0];
        float f = fArr2[1];
        float f2 = this.f28644k0 - fArr2[1];
        float f3 = this.f28643j0;
        fArr[1] = f + (f2 * f3);
        fArr[2] = fArr2[2] + ((this.f28645l0 - fArr2[2]) * f3);
        this.f28652s0 = true;
        this.f28633b.m11063e(fArr[0], fArr[1], fArr[2]);
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
        RectF a0 = C1410y.m37050a0();
        a0.set(0.0f, 0.0f, paddingRight, paddingBottom);
        canvas.drawRoundRect(a0, C1357a0.m37541i(6.0f), C1357a0.m37541i(6.0f), this.f28631a);
        if (z) {
            canvas.restore();
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C8863a aVar = this.f28621N;
        if (aVar != null) {
            aVar.setPickerLeft(i + getPaddingLeft());
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        if (!(this.f28622O == measuredWidth && this.f28623P == measuredHeight)) {
            this.f28622O = measuredWidth;
            this.f28623P = measuredHeight;
            float f = measuredHeight / 2;
            this.f28631a.setShader(new LinearGradient(f, 0.0f, measuredWidth, f, C1359b.f4957a, (float[]) null, Shader.TileMode.MIRROR));
        }
        C8867c cVar = this.f28633b;
        if (cVar != null) {
            cVar.setTargetWidth(measuredWidth);
        }
        C8863a aVar = this.f28621N;
        if (aVar != null) {
            aVar.setPickerWidth((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f28633b == null) {
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
                if (this.f28632a0) {
                    m11075g(motionEvent.getX());
                }
            } else if (action != 2) {
                if (action == 3) {
                    setCaught(false);
                }
            } else if (this.f28624Q) {
                if (!this.f28630W && this.f28636c0 - y > C1357a0.m37534p() * 1.5d) {
                    this.f28630W = true;
                    m11079c();
                    this.f28636c0 = y;
                }
                if (!this.f28629V && !this.f28630W && Math.abs(this.f28634b0 - x) > C1357a0.m37534p()) {
                    this.f28629V = true;
                    m11079c();
                    this.f28634b0 = x;
                }
                if (this.f28639f0) {
                    float d = C5069h.m24089d((x + getLeft()) / this.f28635c.getMeasuredWidth());
                    float d2 = C5069h.m24089d(y < 0.0f ? (-y) / this.f28635c.getMeasuredHeight() : 0.0f);
                    m11072j(d, d2);
                    if (!this.f28646m0 && d2 != 0.0f) {
                        setPickingTone(true);
                    }
                } else {
                    if (this.f28630W) {
                        m11073i((-C1357a0.m37541i(72.0f)) + (y - this.f28636c0), true);
                    }
                    if (this.f28629V) {
                        setColorFactor(C5069h.m24089d(this.f28637d0 + ((x - this.f28634b0) / measuredWidth)));
                    }
                }
            }
            return true;
        }
        float f = paddingTop + (measuredHeight / 2.0f);
        this.f28634b0 = x;
        this.f28636c0 = y;
        this.f28637d0 = this.f28633b.getHue();
        this.f28629V = false;
        this.f28630W = false;
        this.f28632a0 = false;
        m11079c();
        float i = C1357a0.m37541i(24.0f);
        boolean z = Math.abs(x - ((this.f28633b.getHue() * measuredWidth) + paddingLeft)) <= i;
        boolean z2 = Math.abs(y - f) < i;
        boolean z3 = z && z2;
        setCaught(z3);
        if (z3) {
            m11074h();
        } else if (z2 && x >= paddingLeft && x <= paddingLeft + measuredWidth) {
            this.f28632a0 = true;
        }
        return z3 || this.f28632a0;
    }

    public void setDirection(C8863a aVar) {
        this.f28621N = aVar;
    }

    public void setPreview(C8867c cVar) {
        this.f28633b = cVar;
    }

    public void setToneEventListener(AbstractC8866b bVar) {
        this.f28648o0 = bVar;
    }

    private void setCaught(float f) {
        if (this.f28626S != f) {
            this.f28626S = f;
            if (this.f28627T) {
                this.f28633b.m11061g(f, false);
            }
            this.f28633b.setBaseY(this.f28628U * f);
            this.f28633b.setScaleFactor(f);
        }
    }
}
