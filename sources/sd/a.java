package sd;

import ae.j;
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
import ce.a0;
import ce.j0;
import ce.y;
import gb.b;
import gb.c;
import ib.d;
import ib.h;
import ie.x;

public class a extends View implements c.a {
    public x N;
    public final c O;
    public boolean P;
    public final float[] Q;
    public int R;
    public int S;
    public ViewParent T;
    public float U;
    public float V;
    public float W;
    public boolean f22706a0;
    public final Paint f22707b;
    public boolean f22708b0;
    public boolean f22710c0;
    public int f22709c = -16777216;
    public float M = -1.0f;
    public final Paint f22705a = new Paint(5);

    public a(Context context, boolean z10) {
        super(context);
        if (z10) {
            this.f22707b = new Paint(5);
            this.Q = null;
        } else {
            this.f22707b = null;
            this.Q = r4;
            float[] fArr = {-1.0f, 1.0f, 1.0f};
        }
        this.O = new c(this);
    }

    @Override
    public boolean B(float f10, float f11) {
        return true;
    }

    @Override
    public void C(View view, float f10, float f11) {
        if (!this.f22708b0) {
            b(a(f10), true, true);
        } else {
            c();
        }
    }

    @Override
    public boolean E4() {
        return b.a(this);
    }

    @Override
    public void G(View view, float f10, float f11) {
        b.h(this, view, f10, f11);
    }

    @Override
    public void U2(View view, float f10, float f11) {
        b.e(this, view, f10, f11);
    }

    @Override
    public void U4(View view, float f10, float f11) {
        b.f(this, view, f10, f11);
    }

    @Override
    public boolean X6(float f10, float f11) {
        return b.c(this, f10, f11);
    }

    public final float a(float f10) {
        return f10 / (getMeasuredWidth() - (getPaddingLeft() + getPaddingRight()));
    }

    public final void b(float f10, boolean z10, boolean z11) {
        float d10 = h.d(f10);
        if (this.M != d10) {
            this.M = d10;
            float[] fArr = this.Q;
            if (fArr != null) {
                fArr[0] = 360.0f * d10;
                this.f22709c = Color.HSVToColor(fArr);
            }
            this.P = !z10;
            x xVar = this.N;
            if (xVar != null) {
                xVar.n(this, d10, z10);
            }
            invalidate();
        } else if (z11 || (z10 && this.P)) {
            this.P = false;
            x xVar2 = this.N;
            if (xVar2 != null) {
                xVar2.n(this, d10, true);
            }
        }
    }

    public final void c() {
        if (this.f22708b0) {
            b(this.M, true, false);
        }
        ViewParent viewParent = this.T;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
            this.T = null;
        }
        this.f22708b0 = false;
        this.f22710c0 = false;
        this.f22706a0 = false;
        x xVar = this.N;
        if (xVar != null) {
            xVar.p(this, false);
        }
    }

    public final boolean d(float f10, boolean z10) {
        if (this.f22708b0) {
            return false;
        }
        this.f22706a0 = false;
        this.f22708b0 = true;
        this.U = f10;
        this.V = this.M;
        if (z10) {
            j0.k(this, true);
        }
        ViewParent parent = getParent();
        this.T = parent;
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        x xVar = this.N;
        if (xVar != null) {
            xVar.p(this, true);
        }
        return true;
    }

    public final void e() {
        int max = Math.max(0, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        int max2 = Math.max(0, (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        if (max != 0 && max2 != 0) {
            Paint paint = this.f22707b;
            if (paint != null) {
                if (paint.getShader() == null) {
                    int i10 = max2 / 4;
                    int i11 = i10 * 2;
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i11, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    float f10 = i10;
                    float f11 = i11;
                    canvas.drawRect(f10, 0.0f, f11, f10, y.g(-3355444));
                    canvas.drawRect(0.0f, f10, f10, f11, y.g(-3355444));
                    Paint paint2 = this.f22707b;
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                }
                float f12 = max2 / 2;
                this.f22705a.setShader(new LinearGradient(0.0f, f12, max, f12, 0, this.f22709c, Shader.TileMode.CLAMP));
                return;
            }
            float f13 = max2 / 2;
            this.f22705a.setShader(new LinearGradient(f13, 0.0f, max, f13, ce.b.f5224a, (float[]) null, Shader.TileMode.MIRROR));
        }
    }

    @Override
    public long getLongPressDuration() {
        return b.b(this);
    }

    @Override
    public boolean m0(View view, float f10, float f11) {
        return true;
    }

    @Override
    public void o(View view, float f10, float f11) {
        b.i(this, view, f10, f11);
    }

    @Override
    public void o2(View view, float f10, float f11) {
        b.g(this, view, f10, f11);
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
        RectF a02 = y.a0();
        a02.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        int i10 = a0.i(3.0f);
        Paint paint = this.f22707b;
        if (paint != null) {
            float f10 = i10;
            canvas.drawRoundRect(a02, f10, f10, paint);
        }
        float f11 = i10;
        canvas.drawRoundRect(a02, f11, f11, this.f22705a);
        if (this.f22707b != null) {
            canvas.drawRoundRect(a02, f11, f11, y.D0(j.M0()));
        }
        if (this.M != -1.0f) {
            int i11 = a0.i(2.0f);
            int i12 = a0.i(7.0f);
            float f12 = i11;
            float f13 = (((measuredWidth - (i11 * 2)) - i12) * this.M) + f12;
            a02.set(f13, f12, i12 + f13, i11 + ((measuredHeight - i11) - i11));
            int i13 = a0.i(2.5f);
            if (this.f22707b != null) {
                float f14 = i13;
                canvas.drawRoundRect(a02, f14, f14, y.D0(-3355444));
            }
            float f15 = i13;
            canvas.drawRoundRect(a02, f15, f15, y.g(-1));
            float i14 = a0.i(1.5f);
            a02.left += i14;
            a02.top += i14;
            a02.right -= i14;
            a02.bottom -= i14;
            canvas.drawRoundRect(a02, f15, f15, y.g(this.f22709c));
        }
        if (paddingLeft != 0 || paddingTop != 0) {
            canvas.restore();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int max = Math.max(0, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        int max2 = Math.max(0, (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        if (this.R != max || this.S != max2) {
            this.R = max;
            this.S = max2;
            e();
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: sd.a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean s4(View view, float f10, float f11) {
        if (!d(f10, true)) {
            return false;
        }
        this.f22710c0 = true;
        return true;
    }

    public void setHue(float f10) {
        float[] fArr = this.Q;
        if (fArr == null) {
            throw new IllegalStateException();
        } else if (fArr[0] != f10) {
            this.M = f10 / 360.0f;
            fArr[0] = f10;
            this.f22709c = Color.HSVToColor(fArr);
            invalidate();
        }
    }

    public void setTransparentColor(int i10) {
        if (this.f22707b != null) {
            float alpha = Color.alpha(i10) / 255.0f;
            int b10 = d.b(255, i10);
            if (this.f22709c != b10) {
                this.f22709c = b10;
                this.M = alpha;
                e();
                invalidate();
            } else if (this.M != alpha) {
                this.M = alpha;
                invalidate();
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public void setValueListener(x xVar) {
        this.N = xVar;
    }

    @Override
    public void z6(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        b.j(this, view, motionEvent, f10, f11, f12, f13);
    }
}
