package td;

import ae.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
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

public class e extends View implements c.a {
    public int M;
    public int Q;
    public int R;
    public Paint S;
    public Bitmap T;
    public a U;
    public c V;
    public float W;
    public float f23417a0;
    public c f23418b;
    public float f23419b0;
    public int f23420c;
    public float f23421c0;
    public ViewParent f23422d0;
    public boolean f23423e0;
    public boolean f23424f0;
    public boolean f23425g0;
    public boolean f23426h0;
    public boolean f23427i0;
    public float f23416a = -1.0f;
    public final float[] N = new float[3];
    public float O = -1.0f;
    public float P = -1.0f;

    public interface a {
        void j(e eVar, boolean z10);

        void m(e eVar, float f10, float f11, boolean z10);
    }

    public e(Context context) {
        super(context);
    }

    @Override
    public boolean B(float f10, float f11) {
        return m0(this, f10, f11);
    }

    @Override
    public void C(View view, float f10, float f11) {
        if (!this.f23423e0) {
            c();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            float f12 = f10 - paddingLeft;
            float measuredWidth = f12 / ((getMeasuredWidth() - paddingLeft) - getPaddingRight());
            float measuredHeight = 1.0f - ((f11 - paddingTop) / ((getMeasuredHeight() - paddingTop) - getPaddingBottom()));
            if (this.O != measuredWidth || this.P != measuredHeight) {
                this.O = measuredWidth;
                this.P = measuredHeight;
                this.U.m(this, measuredWidth, measuredHeight, true);
                h(true);
                invalidate();
            }
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

    public final float a() {
        int paddingLeft = getPaddingLeft();
        return paddingLeft + (((getMeasuredWidth() - paddingLeft) - getPaddingRight()) * this.O);
    }

    public final float b() {
        int paddingTop = getPaddingTop();
        return paddingTop + (((getMeasuredHeight() - paddingTop) - getPaddingBottom()) * (1.0f - this.P));
    }

    public final void c() {
        this.f23423e0 = false;
        this.f23425g0 = false;
        ViewParent viewParent = this.f23422d0;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
            this.f23422d0 = null;
        }
        if (this.f23427i0) {
            a aVar = this.U;
            if (aVar != null) {
                aVar.m(this, this.O, this.P, true);
            }
            this.f23427i0 = false;
        }
        a aVar2 = this.U;
        if (aVar2 != null) {
            aVar2.j(this, false);
        }
    }

    public final boolean d(float f10, float f11) {
        float a10 = a();
        float b10 = b();
        float i10 = a0.i(32.0f);
        return f10 >= a10 - i10 && f10 < a10 + i10 && f11 >= b10 - i10 && f11 < b10 + i10;
    }

    public void e(int i10, float[] fArr) {
        int b10 = d.b(255, i10);
        float f10 = fArr[0] / 360.0f;
        if (this.f23416a != f10) {
            this.R = b10;
            this.f23416a = f10;
            f();
            this.O = fArr[1];
            this.P = fArr[2];
            h(false);
            invalidate();
        } else if (this.R != b10 || this.O != fArr[1] || this.P != fArr[2]) {
            this.R = b10;
            this.O = fArr[1];
            this.P = fArr[2];
            h(false);
            invalidate();
        }
    }

    public final void f() {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingLeft()) - getPaddingRight();
        if (this.f23416a != -1.0f && measuredWidth > 0 && measuredHeight > 0) {
            float min = Math.min(measuredWidth, measuredHeight);
            int max = (int) (min * Math.max(30.0f / min, Math.min(0.05f, 100.0f / min)));
            Bitmap bitmap = this.T;
            if (bitmap == null || bitmap.isRecycled() || this.T.getWidth() != max || this.T.getHeight() != max) {
                Bitmap bitmap2 = this.T;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    this.T.recycle();
                }
                this.T = Bitmap.createBitmap(max, max, Bitmap.Config.ARGB_8888);
            }
            float[] fArr = this.N;
            fArr[0] = this.f23416a * 360.0f;
            fArr[2] = 1.0f;
            fArr[1] = 1.0f;
            int HSVToColor = Color.HSVToColor(fArr);
            for (int i10 = 0; i10 < max; i10++) {
                float f10 = max;
                int d10 = d.d(-1, HSVToColor, i10 / f10);
                for (int i11 = 0; i11 < max; i11++) {
                    this.T.setPixel(i10, i11, d.d(d10, -16777216, i11 / f10));
                }
            }
            Paint paint = this.S;
            if (paint != null) {
                Bitmap bitmap3 = this.T;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap3, tileMode, tileMode));
            }
        }
    }

    public final void g(float f10, float f11, boolean z10) {
        if (this.f23422d0 == null) {
            ViewParent parent = getParent();
            this.f23422d0 = parent;
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
        this.W = f10;
        this.f23417a0 = f11;
        this.f23425g0 = false;
        this.f23423e0 = true;
        this.f23419b0 = this.O;
        this.f23421c0 = this.P;
        this.f23426h0 = z10;
        a aVar = this.U;
        if (aVar != null) {
            aVar.j(this, true);
        }
    }

    @Override
    public long getLongPressDuration() {
        return b.b(this);
    }

    public final void h(boolean z10) {
        float[] fArr = this.N;
        fArr[0] = this.f23416a * 360.0f;
        fArr[1] = this.O;
        fArr[2] = this.P;
        if (z10) {
            this.R = Color.HSVToColor(fArr);
        }
        this.Q = (Color.red(this.R) <= 154 || Color.green(this.R) <= 154 || Color.blue(this.R) <= 154) ? -1 : -16777216;
    }

    @Override
    public boolean m0(View view, float f10, float f11) {
        return f10 >= ((float) getPaddingLeft()) && f10 < ((float) (getMeasuredWidth() - getPaddingRight())) && f11 >= ((float) getPaddingTop()) && f11 < ((float) (getMeasuredHeight() - getPaddingBottom()));
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
        Bitmap bitmap;
        int i10;
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        if (this.f23416a != -1.0f && (bitmap = this.T) != null && !bitmap.isRecycled()) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = (measuredWidth - paddingLeft) - getPaddingRight();
            int paddingBottom = (measuredHeight - paddingTop) - getPaddingBottom();
            int i12 = a0.i(3.0f);
            RectF a02 = y.a0();
            float f14 = paddingLeft;
            float f15 = paddingTop;
            int i13 = paddingLeft + paddingRight;
            float f16 = i13;
            int i14 = paddingTop + paddingBottom;
            float f17 = i14;
            a02.set(f14, f15, f16, f17);
            if (paddingRight == measuredWidth && paddingBottom == measuredHeight) {
                f13 = f17;
                f12 = f16;
                i11 = paddingLeft;
                canvas.drawBitmap(this.T, (Rect) null, a02, y.j());
                i10 = paddingTop;
                f11 = f14;
                f10 = f15;
            } else {
                f13 = f17;
                i11 = paddingLeft;
                f12 = f16;
                canvas.save();
                canvas.translate(f14, f15);
                a02.set(0.0f, 0.0f, this.T.getWidth(), this.T.getHeight());
                float f18 = paddingRight / a02.right;
                f11 = f14;
                float f19 = paddingBottom / a02.bottom;
                canvas.scale(f18, f19, 0.0f, 0.0f);
                if (this.S == null) {
                    Paint paint = new Paint(5);
                    this.S = paint;
                    f10 = f15;
                    Bitmap bitmap2 = this.T;
                    i10 = paddingTop;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
                } else {
                    i10 = paddingTop;
                    f10 = f15;
                }
                float f20 = i12;
                canvas.drawRoundRect(a02, f20 / f18, f20 / f19, this.S);
                canvas.restore();
            }
            if (this.O != -1.0f && this.P != -1.0f) {
                boolean z10 = (paddingRight == measuredWidth && paddingBottom == measuredHeight) ? false : true;
                if (z10) {
                    canvas.save();
                    canvas.clipRect(i11, i10, i13, i14);
                }
                int i15 = a0.i(8.0f);
                float a10 = a();
                float b10 = b();
                float f21 = i15;
                canvas.drawCircle(a10, b10, f21, y.g(this.R));
                canvas.drawCircle(a10, b10, f21, y.C0(this.Q));
                if (z10) {
                    canvas.restore();
                    a02.set(f11, f10, f12, f13);
                    float f22 = i12;
                    canvas.drawRoundRect(a02, f22, f22, y.D0(j.M0()));
                }
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f23420c != measuredWidth || this.M != measuredHeight) {
            this.f23420c = measuredWidth;
            this.M = measuredHeight;
            f();
            c cVar = this.f23418b;
            if (cVar != null) {
                cVar.h(measuredWidth, measuredHeight);
            }
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: td.e.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean s4(View view, float f10, float f11) {
        if (this.f23423e0) {
            return false;
        }
        j0.k(this, true);
        this.f23424f0 = true;
        this.f23425g0 = true;
        if (this.f23422d0 == null) {
            ViewParent parent = getParent();
            this.f23422d0 = parent;
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
        a aVar = this.U;
        if (aVar != null) {
            aVar.j(this, true);
        }
        return true;
    }

    public void setHue(float f10) {
        if (this.f23416a != f10) {
            this.f23416a = f10;
            f();
            invalidate();
        }
    }

    public void setListener(a aVar) {
        if (this.U != aVar) {
            this.U = aVar;
            if (this.V == null) {
                this.V = new c(this);
            }
        }
    }

    public void setPreview(c cVar) {
        this.f23418b = cVar;
    }

    @Override
    public void z6(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        b.j(this, view, motionEvent, f10, f11, f12, f13);
    }
}
