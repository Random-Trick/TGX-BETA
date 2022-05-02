package sd;

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
import be.C1357a0;
import be.C1379j0;
import be.C1410y;
import p080fb.C4335b;
import p080fb.C4336c;
import p108hb.C5064d;
import p364zd.C11524j;

public class C8872e extends View implements C4336c.AbstractC4337a {
    public int f28676M;
    public int f28680Q;
    public int f28681R;
    public Paint f28682S;
    public Bitmap f28683T;
    public AbstractC8873a f28684U;
    public C4336c f28685V;
    public float f28686W;
    public float f28688a0;
    public C8867c f28689b;
    public float f28690b0;
    public int f28691c;
    public float f28692c0;
    public ViewParent f28693d0;
    public boolean f28694e0;
    public boolean f28695f0;
    public boolean f28696g0;
    public boolean f28697h0;
    public boolean f28698i0;
    public float f28687a = -1.0f;
    public final float[] f28677N = new float[3];
    public float f28678O = -1.0f;
    public float f28679P = -1.0f;

    public interface AbstractC8873a {
        void mo11044j(C8872e eVar, float f, float f2, boolean z);

        void mo11043k(C8872e eVar, boolean z);
    }

    public C8872e(Context context) {
        super(context);
    }

    @Override
    public boolean mo7429B(float f, float f2) {
        return mo7418n0(this, f, f2);
    }

    @Override
    public void mo7428C(View view, float f, float f2) {
        if (!this.f28694e0) {
            m11050c();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            float f3 = f - paddingLeft;
            float measuredWidth = f3 / ((getMeasuredWidth() - paddingLeft) - getPaddingRight());
            float measuredHeight = 1.0f - ((f2 - paddingTop) / ((getMeasuredHeight() - paddingTop) - getPaddingBottom()));
            if (this.f28678O != measuredWidth || this.f28679P != measuredHeight) {
                this.f28678O = measuredWidth;
                this.f28679P = measuredHeight;
                this.f28684U.mo11044j(this, measuredWidth, measuredHeight, true);
                m11045h(true);
                invalidate();
            }
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

    public final float m11052a() {
        int paddingLeft = getPaddingLeft();
        return paddingLeft + (((getMeasuredWidth() - paddingLeft) - getPaddingRight()) * this.f28678O);
    }

    public final float m11051b() {
        int paddingTop = getPaddingTop();
        return paddingTop + (((getMeasuredHeight() - paddingTop) - getPaddingBottom()) * (1.0f - this.f28679P));
    }

    public final void m11050c() {
        this.f28694e0 = false;
        this.f28696g0 = false;
        ViewParent viewParent = this.f28693d0;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
            this.f28693d0 = null;
        }
        if (this.f28698i0) {
            AbstractC8873a aVar = this.f28684U;
            if (aVar != null) {
                aVar.mo11044j(this, this.f28678O, this.f28679P, true);
            }
            this.f28698i0 = false;
        }
        AbstractC8873a aVar2 = this.f28684U;
        if (aVar2 != null) {
            aVar2.mo11043k(this, false);
        }
    }

    public final boolean m11049d(float f, float f2) {
        float a = m11052a();
        float b = m11051b();
        float i = C1357a0.m37544i(32.0f);
        return f >= a - i && f < a + i && f2 >= b - i && f2 < b + i;
    }

    public void m11048e(int i, float[] fArr) {
        int b = C5064d.m24131b(255, i);
        float f = fArr[0] / 360.0f;
        if (this.f28687a != f) {
            this.f28681R = b;
            this.f28687a = f;
            m11047f();
            this.f28678O = fArr[1];
            this.f28679P = fArr[2];
            m11045h(false);
            invalidate();
        } else if (this.f28681R != b || this.f28678O != fArr[1] || this.f28679P != fArr[2]) {
            this.f28681R = b;
            this.f28678O = fArr[1];
            this.f28679P = fArr[2];
            m11045h(false);
            invalidate();
        }
    }

    public final void m11047f() {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingLeft()) - getPaddingRight();
        if (this.f28687a != -1.0f && measuredWidth > 0 && measuredHeight > 0) {
            float min = Math.min(measuredWidth, measuredHeight);
            int max = (int) (min * Math.max(30.0f / min, Math.min(0.05f, 100.0f / min)));
            Bitmap bitmap = this.f28683T;
            if (bitmap == null || bitmap.isRecycled() || this.f28683T.getWidth() != max || this.f28683T.getHeight() != max) {
                Bitmap bitmap2 = this.f28683T;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    this.f28683T.recycle();
                }
                this.f28683T = Bitmap.createBitmap(max, max, Bitmap.Config.ARGB_8888);
            }
            float[] fArr = this.f28677N;
            fArr[0] = this.f28687a * 360.0f;
            fArr[2] = 1.0f;
            fArr[1] = 1.0f;
            int HSVToColor = Color.HSVToColor(fArr);
            for (int i = 0; i < max; i++) {
                float f = max;
                int d = C5064d.m24129d(-1, HSVToColor, i / f);
                for (int i2 = 0; i2 < max; i2++) {
                    this.f28683T.setPixel(i, i2, C5064d.m24129d(d, -16777216, i2 / f));
                }
            }
            Paint paint = this.f28682S;
            if (paint != null) {
                Bitmap bitmap3 = this.f28683T;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap3, tileMode, tileMode));
            }
        }
    }

    @Override
    public void mo7419f3(View view, float f, float f2) {
        C4335b.m28259e(this, view, f, f2);
    }

    public final void m11046g(float f, float f2, boolean z) {
        if (this.f28693d0 == null) {
            ViewParent parent = getParent();
            this.f28693d0 = parent;
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
        this.f28686W = f;
        this.f28688a0 = f2;
        this.f28696g0 = false;
        this.f28694e0 = true;
        this.f28690b0 = this.f28678O;
        this.f28692c0 = this.f28679P;
        this.f28697h0 = z;
        AbstractC8873a aVar = this.f28684U;
        if (aVar != null) {
            aVar.mo11043k(this, true);
        }
    }

    @Override
    public long getLongPressDuration() {
        return C4335b.m28262b(this);
    }

    public final void m11045h(boolean z) {
        float[] fArr = this.f28677N;
        fArr[0] = this.f28687a * 360.0f;
        fArr[1] = this.f28678O;
        fArr[2] = this.f28679P;
        if (z) {
            this.f28681R = Color.HSVToColor(fArr);
        }
        this.f28680Q = (Color.red(this.f28681R) <= 154 || Color.green(this.f28681R) <= 154 || Color.blue(this.f28681R) <= 154) ? -1 : -16777216;
    }

    @Override
    public boolean mo7418n0(View view, float f, float f2) {
        return f >= ((float) getPaddingLeft()) && f < ((float) (getMeasuredWidth() - getPaddingRight())) && f2 >= ((float) getPaddingTop()) && f2 < ((float) (getMeasuredHeight() - getPaddingBottom()));
    }

    @Override
    public void mo7417o2(View view, float f, float f2) {
        C4335b.m28257g(this, view, f, f2);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Bitmap bitmap;
        int i;
        float f;
        float f2;
        int i2;
        float f3;
        float f4;
        if (this.f28687a != -1.0f && (bitmap = this.f28683T) != null && !bitmap.isRecycled()) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = (measuredWidth - paddingLeft) - getPaddingRight();
            int paddingBottom = (measuredHeight - paddingTop) - getPaddingBottom();
            int i3 = C1357a0.m37544i(3.0f);
            RectF a0 = C1410y.m37053a0();
            float f5 = paddingLeft;
            float f6 = paddingTop;
            int i4 = paddingLeft + paddingRight;
            float f7 = i4;
            int i5 = paddingTop + paddingBottom;
            float f8 = i5;
            a0.set(f5, f6, f7, f8);
            if (paddingRight == measuredWidth && paddingBottom == measuredHeight) {
                f4 = f8;
                f3 = f7;
                i2 = paddingLeft;
                canvas.drawBitmap(this.f28683T, (Rect) null, a0, C1410y.m37036j());
                i = paddingTop;
                f2 = f5;
                f = f6;
            } else {
                f4 = f8;
                i2 = paddingLeft;
                f3 = f7;
                canvas.save();
                canvas.translate(f5, f6);
                a0.set(0.0f, 0.0f, this.f28683T.getWidth(), this.f28683T.getHeight());
                float f9 = paddingRight / a0.right;
                f2 = f5;
                float f10 = paddingBottom / a0.bottom;
                canvas.scale(f9, f10, 0.0f, 0.0f);
                if (this.f28682S == null) {
                    Paint paint = new Paint(5);
                    this.f28682S = paint;
                    f = f6;
                    Bitmap bitmap2 = this.f28683T;
                    i = paddingTop;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
                } else {
                    i = paddingTop;
                    f = f6;
                }
                float f11 = i3;
                canvas.drawRoundRect(a0, f11 / f9, f11 / f10, this.f28682S);
                canvas.restore();
            }
            if (this.f28678O != -1.0f && this.f28679P != -1.0f) {
                boolean z = (paddingRight == measuredWidth && paddingBottom == measuredHeight) ? false : true;
                if (z) {
                    canvas.save();
                    canvas.clipRect(i2, i, i4, i5);
                }
                int i6 = C1357a0.m37544i(8.0f);
                float a = m11052a();
                float b = m11051b();
                float f12 = i6;
                canvas.drawCircle(a, b, f12, C1410y.m37042g(this.f28681R));
                canvas.drawCircle(a, b, f12, C1410y.m37080D0(this.f28680Q));
                if (z) {
                    canvas.restore();
                    a0.set(f2, f, f3, f4);
                    float f13 = i3;
                    canvas.drawRoundRect(a0, f13, f13, C1410y.m37078E0(C11524j.m223P0()));
                }
            }
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f28691c != measuredWidth || this.f28676M != measuredHeight) {
            this.f28691c = measuredWidth;
            this.f28676M = measuredHeight;
            m11047f();
            C8867c cVar = this.f28689b;
            if (cVar != null) {
                cVar.m11059h(measuredWidth, measuredHeight);
            }
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: sd.C8872e.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void mo7416p(View view, float f, float f2) {
        C4335b.m28255i(this, view, f, f2);
    }

    public void setHue(float f) {
        if (this.f28687a != f) {
            this.f28687a = f;
            m11047f();
            invalidate();
        }
    }

    public void setListener(AbstractC8873a aVar) {
        if (this.f28684U != aVar) {
            this.f28684U = aVar;
            if (this.f28685V == null) {
                this.f28685V = new C4336c(this);
            }
        }
    }

    public void setPreview(C8867c cVar) {
        this.f28689b = cVar;
    }

    @Override
    public boolean mo7415z4(View view, float f, float f2) {
        if (this.f28694e0) {
            return false;
        }
        C1379j0.m37324k(this, true);
        this.f28695f0 = true;
        this.f28696g0 = true;
        if (this.f28693d0 == null) {
            ViewParent parent = getParent();
            this.f28693d0 = parent;
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
        AbstractC8873a aVar = this.f28684U;
        if (aVar != null) {
            aVar.mo11043k(this, true);
        }
        return true;
    }

    @Override
    public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        C4335b.m28254j(this, view, motionEvent, f, f2, f3, f4);
    }
}
