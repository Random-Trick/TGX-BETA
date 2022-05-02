package p254rd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import be.C1357a0;
import be.C1359b;
import be.C1379j0;
import be.C1410y;
import p080fb.C4335b;
import p080fb.C4336c;
import p108hb.C5064d;
import p108hb.C5069h;
import p111he.AbstractC5152x;
import p364zd.C11524j;

public class C8426a extends View implements C4336c.AbstractC4337a {
    public AbstractC5152x f27339N;
    public final C4336c f27340O;
    public boolean f27341P;
    public final float[] f27342Q;
    public int f27343R;
    public int f27344S;
    public ViewParent f27345T;
    public float f27346U;
    public float f27347V;
    public float f27348W;
    public boolean f27350a0;
    public final Paint f27351b;
    public boolean f27352b0;
    public boolean f27354c0;
    public int f27353c = -16777216;
    public float f27338M = -1.0f;
    public final Paint f27349a = new Paint(5);

    public C8426a(Context context, boolean z) {
        super(context);
        if (z) {
            this.f27351b = new Paint(5);
            this.f27342Q = null;
        } else {
            this.f27351b = null;
            this.f27342Q = r4;
            float[] fArr = {-1.0f, 1.0f, 1.0f};
        }
        this.f27340O = new C4336c(this);
    }

    @Override
    public boolean mo7429B(float f, float f2) {
        return true;
    }

    @Override
    public void mo7428C(View view, float f, float f2) {
        if (!this.f27352b0) {
            m12523b(m12524a(f), true, true);
        } else {
            m12522c();
        }
    }

    @Override
    public void mo7427F(View view, float f, float f2) {
        C4335b.m28256h(this, view, f, f2);
    }

    @Override
    public boolean mo7426K4() {
        return C4335b.m28263a(this);
    }

    @Override
    public boolean mo7425W6(float f, float f2) {
        return C4335b.m28261c(this, f, f2);
    }

    @Override
    public void mo7424Z4(View view, float f, float f2) {
        C4335b.m28258f(this, view, f, f2);
    }

    public final float m12524a(float f) {
        return f / (getMeasuredWidth() - (getPaddingLeft() + getPaddingRight()));
    }

    public final void m12523b(float f, boolean z, boolean z2) {
        float d = C5069h.m24090d(f);
        if (this.f27338M != d) {
            this.f27338M = d;
            float[] fArr = this.f27342Q;
            if (fArr != null) {
                fArr[0] = 360.0f * d;
                this.f27353c = Color.HSVToColor(fArr);
            }
            this.f27341P = !z;
            AbstractC5152x xVar = this.f27339N;
            if (xVar != null) {
                xVar.mo23800m(this, d, z);
            }
            invalidate();
        } else if (z2 || (z && this.f27341P)) {
            this.f27341P = false;
            AbstractC5152x xVar2 = this.f27339N;
            if (xVar2 != null) {
                xVar2.mo23800m(this, d, true);
            }
        }
    }

    public final void m12522c() {
        if (this.f27352b0) {
            m12523b(this.f27338M, true, false);
        }
        ViewParent viewParent = this.f27345T;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
            this.f27345T = null;
        }
        this.f27352b0 = false;
        this.f27354c0 = false;
        this.f27350a0 = false;
        AbstractC5152x xVar = this.f27339N;
        if (xVar != null) {
            xVar.mo23799o(this, false);
        }
    }

    public final boolean m12521d(float f, boolean z) {
        if (this.f27352b0) {
            return false;
        }
        this.f27350a0 = false;
        this.f27352b0 = true;
        this.f27346U = f;
        this.f27347V = this.f27338M;
        if (z) {
            C1379j0.m37324k(this, true);
        }
        ViewParent parent = getParent();
        this.f27345T = parent;
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        AbstractC5152x xVar = this.f27339N;
        if (xVar != null) {
            xVar.mo23799o(this, true);
        }
        return true;
    }

    public final void m12520e() {
        int max = Math.max(0, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        int max2 = Math.max(0, (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        if (max != 0 && max2 != 0) {
            Paint paint = this.f27351b;
            if (paint != null) {
                if (paint.getShader() == null) {
                    int i = max2 / 4;
                    int i2 = i * 2;
                    Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    float f = i;
                    float f2 = i2;
                    canvas.drawRect(f, 0.0f, f2, f, C1410y.m37042g(-3355444));
                    canvas.drawRect(0.0f, f, f, f2, C1410y.m37042g(-3355444));
                    Paint paint2 = this.f27351b;
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                }
                float f3 = max2 / 2;
                this.f27349a.setShader(new LinearGradient(0.0f, f3, max, f3, 0, this.f27353c, Shader.TileMode.CLAMP));
                return;
            }
            float f4 = max2 / 2;
            this.f27349a.setShader(new LinearGradient(f4, 0.0f, max, f4, C1359b.f4957a, (float[]) null, Shader.TileMode.MIRROR));
        }
    }

    @Override
    public void mo7419f3(View view, float f, float f2) {
        C4335b.m28259e(this, view, f, f2);
    }

    @Override
    public long getLongPressDuration() {
        return C4335b.m28262b(this);
    }

    @Override
    public boolean mo7418n0(View view, float f, float f2) {
        return true;
    }

    @Override
    public void mo7417o2(View view, float f, float f2) {
        C4335b.m28257g(this, view, f, f2);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = (getMeasuredWidth() - paddingLeft) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - paddingTop) - getPaddingBottom();
        if (!(paddingLeft == 0 && paddingTop == 0)) {
            canvas.save();
            canvas.translate(paddingLeft, paddingTop);
        }
        RectF a0 = C1410y.m37053a0();
        a0.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        int i = C1357a0.m37544i(3.0f);
        Paint paint = this.f27351b;
        if (paint != null) {
            float f = i;
            canvas.drawRoundRect(a0, f, f, paint);
        }
        float f2 = i;
        canvas.drawRoundRect(a0, f2, f2, this.f27349a);
        if (this.f27351b != null) {
            canvas.drawRoundRect(a0, f2, f2, C1410y.m37078E0(C11524j.m223P0()));
        }
        if (this.f27338M != -1.0f) {
            int i2 = C1357a0.m37544i(2.0f);
            int i3 = C1357a0.m37544i(7.0f);
            float f3 = i2;
            float f4 = (((measuredWidth - (i2 * 2)) - i3) * this.f27338M) + f3;
            a0.set(f4, f3, i3 + f4, i2 + ((measuredHeight - i2) - i2));
            int i4 = C1357a0.m37544i(2.5f);
            if (this.f27351b != null) {
                float f5 = i4;
                canvas.drawRoundRect(a0, f5, f5, C1410y.m37078E0(-3355444));
            }
            float f6 = i4;
            canvas.drawRoundRect(a0, f6, f6, C1410y.m37042g(-1));
            float i5 = C1357a0.m37544i(1.5f);
            a0.left += i5;
            a0.top += i5;
            a0.right -= i5;
            a0.bottom -= i5;
            canvas.drawRoundRect(a0, f6, f6, C1410y.m37042g(this.f27353c));
        }
        if (paddingLeft != 0 || paddingTop != 0) {
            canvas.restore();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int max = Math.max(0, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        int max2 = Math.max(0, (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        if (this.f27343R != max || this.f27344S != max2) {
            this.f27343R = max;
            this.f27344S = max2;
            m12520e();
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: p254rd.C8426a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void mo7416p(View view, float f, float f2) {
        C4335b.m28255i(this, view, f, f2);
    }

    public void setHue(float f) {
        float[] fArr = this.f27342Q;
        if (fArr == null) {
            throw new IllegalStateException();
        } else if (fArr[0] != f) {
            this.f27338M = f / 360.0f;
            fArr[0] = f;
            this.f27353c = Color.HSVToColor(fArr);
            invalidate();
        }
    }

    public void setTransparentColor(int i) {
        if (this.f27351b != null) {
            float alpha = Color.alpha(i) / 255.0f;
            int b = C5064d.m24131b(255, i);
            if (this.f27353c != b) {
                this.f27353c = b;
                this.f27338M = alpha;
                m12520e();
                invalidate();
            } else if (this.f27338M != alpha) {
                this.f27338M = alpha;
                invalidate();
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public void setValueListener(AbstractC5152x xVar) {
        this.f27339N = xVar;
    }

    @Override
    public boolean mo7415z4(View view, float f, float f2) {
        if (!m12521d(f, true)) {
            return false;
        }
        this.f27354c0 = true;
        return true;
    }

    @Override
    public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        C4335b.m28254j(this, view, motionEvent, f, f2, f3, f4);
    }
}
