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
    public int f28673M;
    public int f28677Q;
    public int f28678R;
    public Paint f28679S;
    public Bitmap f28680T;
    public AbstractC8873a f28681U;
    public C4336c f28682V;
    public float f28683W;
    public float f28685a0;
    public C8867c f28686b;
    public float f28687b0;
    public int f28688c;
    public float f28689c0;
    public ViewParent f28690d0;
    public boolean f28691e0;
    public boolean f28692f0;
    public boolean f28693g0;
    public boolean f28694h0;
    public boolean f28695i0;
    public float f28684a = -1.0f;
    public final float[] f28674N = new float[3];
    public float f28675O = -1.0f;
    public float f28676P = -1.0f;

    public interface AbstractC8873a {
        void mo11045j(C8872e eVar, float f, float f2, boolean z);

        void mo11044k(C8872e eVar, boolean z);
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
        if (!this.f28691e0) {
            m11051c();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            float f3 = f - paddingLeft;
            float measuredWidth = f3 / ((getMeasuredWidth() - paddingLeft) - getPaddingRight());
            float measuredHeight = 1.0f - ((f2 - paddingTop) / ((getMeasuredHeight() - paddingTop) - getPaddingBottom()));
            if (this.f28675O != measuredWidth || this.f28676P != measuredHeight) {
                this.f28675O = measuredWidth;
                this.f28676P = measuredHeight;
                this.f28681U.mo11045j(this, measuredWidth, measuredHeight, true);
                m11046h(true);
                invalidate();
            }
        }
    }

    @Override
    public void mo7427F(View view, float f, float f2) {
        C4335b.m28254h(this, view, f, f2);
    }

    @Override
    public boolean mo7426K4() {
        return C4335b.m28261a(this);
    }

    @Override
    public boolean mo7425W6(float f, float f2) {
        return C4335b.m28259c(this, f, f2);
    }

    @Override
    public void mo7424Z4(View view, float f, float f2) {
        C4335b.m28256f(this, view, f, f2);
    }

    public final float m11053a() {
        int paddingLeft = getPaddingLeft();
        return paddingLeft + (((getMeasuredWidth() - paddingLeft) - getPaddingRight()) * this.f28675O);
    }

    public final float m11052b() {
        int paddingTop = getPaddingTop();
        return paddingTop + (((getMeasuredHeight() - paddingTop) - getPaddingBottom()) * (1.0f - this.f28676P));
    }

    public final void m11051c() {
        this.f28691e0 = false;
        this.f28693g0 = false;
        ViewParent viewParent = this.f28690d0;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
            this.f28690d0 = null;
        }
        if (this.f28695i0) {
            AbstractC8873a aVar = this.f28681U;
            if (aVar != null) {
                aVar.mo11045j(this, this.f28675O, this.f28676P, true);
            }
            this.f28695i0 = false;
        }
        AbstractC8873a aVar2 = this.f28681U;
        if (aVar2 != null) {
            aVar2.mo11044k(this, false);
        }
    }

    public final boolean m11050d(float f, float f2) {
        float a = m11053a();
        float b = m11052b();
        float i = C1357a0.m37541i(32.0f);
        return f >= a - i && f < a + i && f2 >= b - i && f2 < b + i;
    }

    public void m11049e(int i, float[] fArr) {
        int b = C5064d.m24130b(255, i);
        float f = fArr[0] / 360.0f;
        if (this.f28684a != f) {
            this.f28678R = b;
            this.f28684a = f;
            m11048f();
            this.f28675O = fArr[1];
            this.f28676P = fArr[2];
            m11046h(false);
            invalidate();
        } else if (this.f28678R != b || this.f28675O != fArr[1] || this.f28676P != fArr[2]) {
            this.f28678R = b;
            this.f28675O = fArr[1];
            this.f28676P = fArr[2];
            m11046h(false);
            invalidate();
        }
    }

    public final void m11048f() {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingLeft()) - getPaddingRight();
        if (this.f28684a != -1.0f && measuredWidth > 0 && measuredHeight > 0) {
            float min = Math.min(measuredWidth, measuredHeight);
            int max = (int) (min * Math.max(30.0f / min, Math.min(0.05f, 100.0f / min)));
            Bitmap bitmap = this.f28680T;
            if (bitmap == null || bitmap.isRecycled() || this.f28680T.getWidth() != max || this.f28680T.getHeight() != max) {
                Bitmap bitmap2 = this.f28680T;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    this.f28680T.recycle();
                }
                this.f28680T = Bitmap.createBitmap(max, max, Bitmap.Config.ARGB_8888);
            }
            float[] fArr = this.f28674N;
            fArr[0] = this.f28684a * 360.0f;
            fArr[2] = 1.0f;
            fArr[1] = 1.0f;
            int HSVToColor = Color.HSVToColor(fArr);
            for (int i = 0; i < max; i++) {
                float f = max;
                int d = C5064d.m24128d(-1, HSVToColor, i / f);
                for (int i2 = 0; i2 < max; i2++) {
                    this.f28680T.setPixel(i, i2, C5064d.m24128d(d, -16777216, i2 / f));
                }
            }
            Paint paint = this.f28679S;
            if (paint != null) {
                Bitmap bitmap3 = this.f28680T;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap3, tileMode, tileMode));
            }
        }
    }

    @Override
    public void mo7419f3(View view, float f, float f2) {
        C4335b.m28257e(this, view, f, f2);
    }

    public final void m11047g(float f, float f2, boolean z) {
        if (this.f28690d0 == null) {
            ViewParent parent = getParent();
            this.f28690d0 = parent;
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
        this.f28683W = f;
        this.f28685a0 = f2;
        this.f28693g0 = false;
        this.f28691e0 = true;
        this.f28687b0 = this.f28675O;
        this.f28689c0 = this.f28676P;
        this.f28694h0 = z;
        AbstractC8873a aVar = this.f28681U;
        if (aVar != null) {
            aVar.mo11044k(this, true);
        }
    }

    @Override
    public long getLongPressDuration() {
        return C4335b.m28260b(this);
    }

    public final void m11046h(boolean z) {
        float[] fArr = this.f28674N;
        fArr[0] = this.f28684a * 360.0f;
        fArr[1] = this.f28675O;
        fArr[2] = this.f28676P;
        if (z) {
            this.f28678R = Color.HSVToColor(fArr);
        }
        this.f28677Q = (Color.red(this.f28678R) <= 154 || Color.green(this.f28678R) <= 154 || Color.blue(this.f28678R) <= 154) ? -1 : -16777216;
    }

    @Override
    public boolean mo7418n0(View view, float f, float f2) {
        return f >= ((float) getPaddingLeft()) && f < ((float) (getMeasuredWidth() - getPaddingRight())) && f2 >= ((float) getPaddingTop()) && f2 < ((float) (getMeasuredHeight() - getPaddingBottom()));
    }

    @Override
    public void mo7417o2(View view, float f, float f2) {
        C4335b.m28255g(this, view, f, f2);
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
        if (this.f28684a != -1.0f && (bitmap = this.f28680T) != null && !bitmap.isRecycled()) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = (measuredWidth - paddingLeft) - getPaddingRight();
            int paddingBottom = (measuredHeight - paddingTop) - getPaddingBottom();
            int i3 = C1357a0.m37541i(3.0f);
            RectF a0 = C1410y.m37050a0();
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
                canvas.drawBitmap(this.f28680T, (Rect) null, a0, C1410y.m37033j());
                i = paddingTop;
                f2 = f5;
                f = f6;
            } else {
                f4 = f8;
                i2 = paddingLeft;
                f3 = f7;
                canvas.save();
                canvas.translate(f5, f6);
                a0.set(0.0f, 0.0f, this.f28680T.getWidth(), this.f28680T.getHeight());
                float f9 = paddingRight / a0.right;
                f2 = f5;
                float f10 = paddingBottom / a0.bottom;
                canvas.scale(f9, f10, 0.0f, 0.0f);
                if (this.f28679S == null) {
                    Paint paint = new Paint(5);
                    this.f28679S = paint;
                    f = f6;
                    Bitmap bitmap2 = this.f28680T;
                    i = paddingTop;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
                } else {
                    i = paddingTop;
                    f = f6;
                }
                float f11 = i3;
                canvas.drawRoundRect(a0, f11 / f9, f11 / f10, this.f28679S);
                canvas.restore();
            }
            if (this.f28675O != -1.0f && this.f28676P != -1.0f) {
                boolean z = (paddingRight == measuredWidth && paddingBottom == measuredHeight) ? false : true;
                if (z) {
                    canvas.save();
                    canvas.clipRect(i2, i, i4, i5);
                }
                int i6 = C1357a0.m37541i(8.0f);
                float a = m11053a();
                float b = m11052b();
                float f12 = i6;
                canvas.drawCircle(a, b, f12, C1410y.m37039g(this.f28678R));
                canvas.drawCircle(a, b, f12, C1410y.m37077D0(this.f28677Q));
                if (z) {
                    canvas.restore();
                    a0.set(f2, f, f3, f4);
                    float f13 = i3;
                    canvas.drawRoundRect(a0, f13, f13, C1410y.m37075E0(C11524j.m223P0()));
                }
            }
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f28688c != measuredWidth || this.f28673M != measuredHeight) {
            this.f28688c = measuredWidth;
            this.f28673M = measuredHeight;
            m11048f();
            C8867c cVar = this.f28686b;
            if (cVar != null) {
                cVar.m11060h(measuredWidth, measuredHeight);
            }
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: sd.C8872e.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void mo7416p(View view, float f, float f2) {
        C4335b.m28253i(this, view, f, f2);
    }

    public void setHue(float f) {
        if (this.f28684a != f) {
            this.f28684a = f;
            m11048f();
            invalidate();
        }
    }

    public void setListener(AbstractC8873a aVar) {
        if (this.f28681U != aVar) {
            this.f28681U = aVar;
            if (this.f28682V == null) {
                this.f28682V = new C4336c(this);
            }
        }
    }

    public void setPreview(C8867c cVar) {
        this.f28686b = cVar;
    }

    @Override
    public boolean mo7415z4(View view, float f, float f2) {
        if (this.f28691e0) {
            return false;
        }
        C1379j0.m37321k(this, true);
        this.f28692f0 = true;
        this.f28693g0 = true;
        if (this.f28690d0 == null) {
            ViewParent parent = getParent();
            this.f28690d0 = parent;
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
        AbstractC8873a aVar = this.f28681U;
        if (aVar != null) {
            aVar.mo11044k(this, true);
        }
        return true;
    }

    @Override
    public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        C4335b.m28252j(this, view, motionEvent, f, f2, f3, f4);
    }
}
