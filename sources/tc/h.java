package tc;

import ae.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import ce.a0;
import ce.y;
import db.g;
import gd.w;
import me.vkryl.android.widget.FrameLayoutFix;
import oc.v0;
import org.thunderdog.challegram.R;

public class h extends FrameLayoutFix implements GestureDetector.OnGestureListener {
    public b[] M;
    public int N;
    public c O;
    public final int P;
    public final int Q;
    public int S;
    public int T;
    public float U;
    public int V;
    public int W;
    public int f23164a0;
    public float f23165b0;
    public final GestureDetector f23166c0;
    public float f23167d0;
    public float f23168e0;
    public boolean f23171h0;
    public b f23172i0;
    public b f23173j0;
    public float f23174k0;
    public float f23175l0;
    public float f23176m0;
    public int f23177n0;
    public int f23178o0;
    public int f23169f0 = -1;
    public int f23170g0 = -1;
    public final int R = a0.i(10.0f);

    public class a extends AnimatorListenerAdapter {
        public final int f23179a;

        public a(int i10) {
            this.f23179a = i10;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            h.this.f23174k0 = 0.0f;
            h.this.N = this.f23179a;
            if (h.this.O != null) {
                h.this.O.p(this.f23179a);
            }
            h.this.f23171h0 = false;
        }
    }

    public interface c {
        void E(float f10);

        void f1(int i10);

        void p(int i10);

        boolean p0(int i10, int i11);
    }

    public class d extends Drawable {
        public Paint f23188a;
        public int f23189b;

        public d() {
        }

        @Override
        public void draw(Canvas canvas) {
            int i10;
            h.this.m2();
            int measuredWidth = h.this.getMeasuredWidth();
            if (h.this.M != null && h.this.M.length != 0 && measuredWidth != 0) {
                int i11 = measuredWidth / 2;
                int i12 = h.this.P / 2;
                float f10 = 0.0f;
                float f11 = 1.0f;
                if (h.this.f23175l0 != 1.0f) {
                    int L = j.L(h.this.M[h.this.N].f23183c);
                    if (h.this.f23174k0 == 0.0f) {
                        canvas.drawRect(0.0f, 0.0f, measuredWidth, h.this.P, y.g(L));
                    } else {
                        int L2 = j.L(h.this.f23173j0.f23183c);
                        canvas.drawRect(0.0f, 0.0f, measuredWidth, h.this.P, y.g(ib.d.c(L, ib.d.a(h.this.f23174k0, L2))));
                        float f12 = h.this.f23170g0;
                        float f13 = i12 - ((int) ((h.this.R - h.this.f23172i0.f23184d) * h.this.f23174k0));
                        canvas.drawCircle(f12 + ((i11 - f12) * h.this.f23174k0), f13 + ((i12 - f13) * h.this.f23174k0), h.this.f23165b0 * h.this.f23174k0, y.g(L2));
                    }
                    int i13 = h.this.f23164a0;
                    b[] bVarArr = h.this.M;
                    int length = bVarArr.length;
                    int i14 = 0;
                    while (i14 < length) {
                        b bVar = bVarArr[i14];
                        int round = h.this.V + Math.round(h.this.W * bVar.f23187g);
                        int i15 = (round / 2) + i13;
                        int i16 = bVar.f23187g == f10 ? i12 : i12 - ((int) ((h.this.R - bVar.f23184d) * bVar.f23187g));
                        int i17 = 255;
                        if (bVar.f23187g != f11) {
                            i17 = 255 - ((int) (63.75f * (f11 - bVar.f23187g)));
                        }
                        int L3 = j.L(R.id.theme_color_attachText);
                        Paint paint = this.f23188a;
                        bVarArr = bVarArr;
                        if (paint == null || this.f23189b != L3) {
                            this.f23189b = L3;
                            paint = y.c(paint, L3);
                            this.f23188a = paint;
                        }
                        paint.setAlpha(i17);
                        if (bVar.f23186f != null) {
                            i10 = length;
                            ce.c.b(canvas, bVar.f23186f, i15 - (bVar.f23186f.getMinimumWidth() / 2), i16 - ((int) (bVar.f23186f.getMinimumHeight() * 0.5f)), paint);
                        } else {
                            i10 = length;
                            canvas.drawCircle(i15, i16, a0.i(12.0f), y.g(-1));
                        }
                        if (bVar.f23187g == 1.0f) {
                            canvas.drawText(bVar.f23182b, i15 - ((int) (bVar.f23185e * 0.5f)), h.this.Q, y.c0(14.0f, L3));
                        } else if (bVar.f23187g >= 0.55f) {
                            canvas.save();
                            canvas.translate(i15, h.this.Q);
                            float f14 = (bVar.f23187g * 0.2f) + 0.8f;
                            canvas.scale(f14, f14);
                            canvas.drawText(bVar.f23182b, -((int) (bVar.f23185e * 0.5f)), 0.0f, y.c0(14.0f, ib.d.a((bVar.f23187g - 0.55f) / 0.45f, L3)));
                            canvas.restore();
                        }
                        i13 += round;
                        i14++;
                        length = i10;
                        f10 = 0.0f;
                        f11 = 1.0f;
                    }
                }
                if (h.this.f23175l0 != 0.0f) {
                    int u10 = j.u();
                    if (h.this.f23175l0 != 1.0f) {
                        canvas.drawCircle(h.this.f23177n0 + ((i11 - h.this.f23177n0) * h.this.f23175l0), h.this.f23178o0 + ((i12 - h.this.f23178o0) * h.this.f23175l0), h.this.f23176m0 * h.this.f23175l0, y.g(u10));
                        canvas.drawRect(0.0f, 0.0f, measuredWidth, h.this.P, y.g(ib.d.b((int) (h.this.f23175l0 * 255.0f), u10)));
                        return;
                    }
                    canvas.drawRect(0.0f, 0.0f, measuredWidth, h.this.P, y.g(u10));
                }
            }
        }

        @Override
        public int getOpacity() {
            return 0;
        }

        @Override
        public void setAlpha(int i10) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public h(Context context) {
        super(context);
        this.f23166c0 = new GestureDetector(context, this);
        int barHeight = getBarHeight();
        this.P = barHeight;
        this.Q = barHeight - a0.i(9.0f);
        setWillNotDraw(false);
        g.d(this, new d());
        setLayoutParams(FrameLayoutFix.r1(-1, barHeight, 80));
    }

    public static int getBarHeight() {
        return a0.i(56.0f);
    }

    public void h2(ValueAnimator valueAnimator) {
        setFactor(db.b.a(valueAnimator));
    }

    private void setFactor(float f10) {
        if (this.f23174k0 != f10) {
            this.f23174k0 = f10;
            this.f23172i0.f23187g = 1.0f - f10;
            this.f23173j0.f23187g = f10;
            invalidate();
            c cVar = this.O;
            if (cVar != null) {
                cVar.E(f10);
            }
        }
    }

    public final int d2(int i10) {
        b[] bVarArr = this.M;
        if (!(bVarArr == null || bVarArr.length == 0)) {
            int i11 = this.f23164a0;
            int i12 = 0;
            for (b bVar : bVarArr) {
                int i13 = this.V + ((int) (this.W * bVar.f23187g));
                if (i12 == i10) {
                    return i11 + (i13 / 2);
                }
                i12++;
                i11 += i13;
            }
        }
        return -1;
    }

    public final int f2(float f10) {
        b[] bVarArr = this.M;
        if (!(bVarArr == null || bVarArr.length == 0)) {
            int i10 = this.f23164a0;
            int i11 = 0;
            for (b bVar : bVarArr) {
                int i12 = this.V + ((int) (this.W * bVar.f23187g));
                if (f10 >= i10 && f10 < i10 + i12) {
                    return i11;
                }
                i11++;
                i10 += i12;
            }
        }
        return -1;
    }

    public final boolean g2(boolean z10) {
        b[] bVarArr = this.M;
        if (bVarArr == null || bVarArr.length == 0 || this.f23175l0 != 0.0f) {
            return false;
        }
        int max = z10 ? Math.max(0, this.N - 1) : Math.min(this.N + 1, bVarArr.length - 1);
        return max != this.N && l2(max);
    }

    public int getCurrentBarWidth() {
        int g10 = a0.g();
        int i10 = a0.i(168.0f);
        b[] bVarArr = this.M;
        return g10 / bVarArr.length > i10 ? bVarArr.length * i10 : g10;
    }

    public int getCurrentColor() {
        int L = j.L(this.M[this.N].f23183c);
        if (this.f23174k0 == 0.0f) {
            return L;
        }
        return ib.d.c(L, ib.d.a(this.f23174k0, j.L(this.f23173j0.f23183c)));
    }

    public int getCurrentIndex() {
        return this.N;
    }

    public final boolean i2(int i10) {
        if (this.f23171h0) {
            return false;
        }
        g.c(this);
        c cVar = this.O;
        if (cVar != null) {
            int i11 = this.N;
            if (i11 == i10) {
                cVar.f1(i10);
            } else if (!cVar.p0(i11, i10)) {
                return false;
            }
        }
        int i12 = this.N;
        if (i12 == i10) {
            return false;
        }
        this.f23171h0 = true;
        b[] bVarArr = this.M;
        this.f23172i0 = bVarArr[i12];
        this.f23173j0 = bVarArr[i10];
        ValueAnimator b10 = db.b.b();
        b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.this.h2(valueAnimator);
            }
        });
        b10.addListener(new a(i10));
        b10.setDuration(240L);
        b10.setInterpolator(db.b.f7287b);
        b10.start();
        return true;
    }

    public void j2() {
        this.f23177n0 = this.f23164a0;
        this.f23178o0 = (this.P / 2) - ((int) ((this.R - this.M[this.N].f23184d) * this.f23174k0));
        int measuredWidth = getMeasuredWidth() * getMeasuredWidth();
        int i10 = this.P;
        this.f23176m0 = ((float) Math.sqrt(measuredWidth + (i10 * i10))) * 0.5f;
        int i11 = this.f23164a0;
        int i12 = 0;
        for (b bVar : this.M) {
            int round = this.V + Math.round(this.W * bVar.f23187g);
            if (i12 == this.N) {
                this.f23177n0 = i11 + (round / 2);
                return;
            }
            i11 += round;
            i12++;
        }
    }

    public void k2(b[] bVarArr, int i10) {
        float f10 = 0.0f;
        int i11 = 0;
        for (b bVar : bVarArr) {
            if (bVar.f23182b == null || bVar.f23182b.isEmpty()) {
                throw new IllegalArgumentException("item.itemIconResource == 0 || item.itemName == null || item.itemName.isEmpty()");
            }
            bVar.f23185e = v0.T1(bVar.f23182b, y.b0(14.0f));
            if (bVar.f23185e > f10) {
                f10 = bVar.f23185e;
            }
            bVar.f23186f = bVar.f23181a == 0 ? null : ce.c.g(getResources(), bVar.f23181a);
            if (i11 == i10) {
                bVar.f23187g = 1.0f;
            }
            i11++;
        }
        this.N = i10;
        this.U = f10;
        this.M = bVarArr;
        this.S = 0;
    }

    public boolean l2(int i10) {
        int d22 = d2(i10);
        if (d22 == -1) {
            return false;
        }
        this.f23170g0 = d22;
        this.f23169f0 = i10;
        return i2(i10);
    }

    public final void m2() {
        int i10;
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth > 0) {
            if (this.S != measuredWidth || this.T != a0.f()) {
                this.S = measuredWidth;
                this.T = a0.f();
                int i11 = a0.i(168.0f);
                b[] bVarArr = this.M;
                int length = measuredWidth / bVarArr.length;
                if (length > i11) {
                    this.f23164a0 = ((bVarArr.length * i11) - measuredWidth) / 2;
                    i10 = bVarArr.length * i11;
                } else {
                    this.f23164a0 = 0;
                    i10 = measuredWidth;
                    i11 = length;
                }
                int max = Math.max(i11, (int) (this.U + a0.i(40.0f)));
                int length2 = (i10 - max) / (this.M.length - 1);
                this.V = length2;
                this.W = max - length2;
                int i12 = this.P;
                this.f23165b0 = ((float) Math.sqrt((measuredWidth * measuredWidth) + (i12 * i12))) * 0.5f;
            }
        }
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        if (Math.abs(f10) > a0.j(250.0f, 1.0f)) {
            if (g2(f10 >= 0.0f)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        m2();
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f23166c0.onTouchEvent(motionEvent);
        b[] bVarArr = this.M;
        if (bVarArr != null && bVarArr.length != 0 && this.f23175l0 == 0.0f) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f23169f0 = -1;
                this.f23170g0 = -1;
                this.f23167d0 = x10;
                this.f23168e0 = y10;
                int i10 = this.f23164a0;
                b[] bVarArr2 = this.M;
                int length = bVarArr2.length;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    int i13 = this.V + ((int) (this.W * bVarArr2[i11].f23187g));
                    if (x10 >= i10 && x10 < i10 + i13) {
                        this.f23169f0 = i12;
                        this.f23170g0 = i10 + ((int) (i13 * 0.5f));
                        break;
                    }
                    i12++;
                    i10 += i13;
                    i11++;
                }
            } else {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 3) {
                            this.f23169f0 = -1;
                            return true;
                        }
                    } else if (this.f23169f0 != -1 && Math.max(Math.abs(this.f23167d0 - x10), Math.abs(this.f23168e0 - y10)) > a0.q()) {
                        this.f23169f0 = -1;
                    }
                } else if (this.f23169f0 != -1) {
                    int f22 = f2(x10);
                    int i14 = this.f23169f0;
                    if (f22 == i14) {
                        i2(i14);
                    }
                }
                return true;
            }
        }
        return true;
    }

    public void setCallback(c cVar) {
        this.O = cVar;
    }

    public void setOverlayFactor(float f10) {
        if (this.f23175l0 != f10) {
            this.f23175l0 = f10;
            invalidate();
        }
    }

    public static class b {
        public final int f23181a;
        public final String f23182b;
        public final int f23183c;
        public final int f23184d;
        public float f23185e;
        public Drawable f23186f;
        public float f23187g;

        public b(int i10, int i11, int i12) {
            this.f23181a = i10;
            this.f23182b = w.i1(i11);
            this.f23183c = i12;
            this.f23184d = 0;
        }

        public b(int i10, int i11, int i12, int i13) {
            this.f23181a = i10;
            this.f23182b = w.i1(i11);
            this.f23183c = i12;
            this.f23184d = i13;
        }
    }
}
