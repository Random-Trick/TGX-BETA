package sc;

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
import be.C1357a0;
import be.C1362c;
import be.C1410y;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p037cb.C2065g;
import p082fd.C4403w;
import p108hb.C5064d;
import p364zd.C11524j;

public class GestureDetector$OnGestureListenerC8768h extends FrameLayoutFix implements GestureDetector.OnGestureListener {
    public C8770b[] f28286M;
    public int f28287N;
    public AbstractC8771c f28288O;
    public final int f28289P;
    public final int f28290Q;
    public int f28292S;
    public int f28293T;
    public float f28294U;
    public int f28295V;
    public int f28296W;
    public int f28297a0;
    public float f28298b0;
    public final GestureDetector f28299c0;
    public float f28300d0;
    public float f28301e0;
    public boolean f28304h0;
    public C8770b f28305i0;
    public C8770b f28306j0;
    public float f28307k0;
    public float f28308l0;
    public float f28309m0;
    public int f28310n0;
    public int f28311o0;
    public int f28302f0 = -1;
    public int f28303g0 = -1;
    public final int f28291R = C1357a0.m37541i(10.0f);

    public class C8769a extends AnimatorListenerAdapter {
        public final int f28312a;

        public C8769a(int i) {
            this.f28312a = i;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            GestureDetector$OnGestureListenerC8768h.this.f28307k0 = 0.0f;
            GestureDetector$OnGestureListenerC8768h.this.f28287N = this.f28312a;
            if (GestureDetector$OnGestureListenerC8768h.this.f28288O != null) {
                GestureDetector$OnGestureListenerC8768h.this.f28288O.mo11124n(this.f28312a);
            }
            GestureDetector$OnGestureListenerC8768h.this.f28304h0 = false;
        }
    }

    public interface AbstractC8771c {
        void mo11185E(float f);

        void mo11134i1(int i);

        boolean mo11128l0(int i, int i2);

        void mo11124n(int i);
    }

    public class C8772d extends Drawable {
        public Paint f28321a;
        public int f28322b;

        public C8772d() {
        }

        @Override
        public void draw(Canvas canvas) {
            int i;
            GestureDetector$OnGestureListenerC8768h.this.m11440r2();
            int measuredWidth = GestureDetector$OnGestureListenerC8768h.this.getMeasuredWidth();
            if (GestureDetector$OnGestureListenerC8768h.this.f28286M != null && GestureDetector$OnGestureListenerC8768h.this.f28286M.length != 0 && measuredWidth != 0) {
                int i2 = measuredWidth / 2;
                int i3 = GestureDetector$OnGestureListenerC8768h.this.f28289P / 2;
                float f = 0.0f;
                float f2 = 1.0f;
                if (GestureDetector$OnGestureListenerC8768h.this.f28308l0 != 1.0f) {
                    int N = C11524j.m228N(GestureDetector$OnGestureListenerC8768h.this.f28286M[GestureDetector$OnGestureListenerC8768h.this.f28287N].f28316c);
                    if (GestureDetector$OnGestureListenerC8768h.this.f28307k0 == 0.0f) {
                        canvas.drawRect(0.0f, 0.0f, measuredWidth, GestureDetector$OnGestureListenerC8768h.this.f28289P, C1410y.m37039g(N));
                    } else {
                        int N2 = C11524j.m228N(GestureDetector$OnGestureListenerC8768h.this.f28306j0.f28316c);
                        canvas.drawRect(0.0f, 0.0f, measuredWidth, GestureDetector$OnGestureListenerC8768h.this.f28289P, C1410y.m37039g(C5064d.m24129c(N, C5064d.m24131a(GestureDetector$OnGestureListenerC8768h.this.f28307k0, N2))));
                        float f3 = GestureDetector$OnGestureListenerC8768h.this.f28303g0;
                        float f4 = i3 - ((int) ((GestureDetector$OnGestureListenerC8768h.this.f28291R - GestureDetector$OnGestureListenerC8768h.this.f28305i0.f28317d) * GestureDetector$OnGestureListenerC8768h.this.f28307k0));
                        canvas.drawCircle(f3 + ((i2 - f3) * GestureDetector$OnGestureListenerC8768h.this.f28307k0), f4 + ((i3 - f4) * GestureDetector$OnGestureListenerC8768h.this.f28307k0), GestureDetector$OnGestureListenerC8768h.this.f28298b0 * GestureDetector$OnGestureListenerC8768h.this.f28307k0, C1410y.m37039g(N2));
                    }
                    int i4 = GestureDetector$OnGestureListenerC8768h.this.f28297a0;
                    C8770b[] bVarArr = GestureDetector$OnGestureListenerC8768h.this.f28286M;
                    int length = bVarArr.length;
                    int i5 = 0;
                    while (i5 < length) {
                        C8770b bVar = bVarArr[i5];
                        int round = GestureDetector$OnGestureListenerC8768h.this.f28295V + Math.round(GestureDetector$OnGestureListenerC8768h.this.f28296W * bVar.f28320g);
                        int i6 = (round / 2) + i4;
                        int i7 = bVar.f28320g == f ? i3 : i3 - ((int) ((GestureDetector$OnGestureListenerC8768h.this.f28291R - bVar.f28317d) * bVar.f28320g));
                        int i8 = 255;
                        if (bVar.f28320g != f2) {
                            i8 = 255 - ((int) (63.75f * (f2 - bVar.f28320g)));
                        }
                        int N3 = C11524j.m228N(R.id.theme_color_attachText);
                        Paint paint = this.f28321a;
                        bVarArr = bVarArr;
                        if (paint == null || this.f28322b != N3) {
                            this.f28322b = N3;
                            paint = C1410y.m37047c(paint, N3);
                            this.f28321a = paint;
                        }
                        paint.setAlpha(i8);
                        if (bVar.f28319f != null) {
                            i = length;
                            C1362c.m37487b(canvas, bVar.f28319f, i6 - (bVar.f28319f.getMinimumWidth() / 2), i7 - ((int) (bVar.f28319f.getMinimumHeight() * 0.5f)), paint);
                        } else {
                            i = length;
                            canvas.drawCircle(i6, i7, C1357a0.m37541i(12.0f), C1410y.m37039g(-1));
                        }
                        if (bVar.f28320g == 1.0f) {
                            canvas.drawText(bVar.f28315b, i6 - ((int) (bVar.f28318e * 0.5f)), GestureDetector$OnGestureListenerC8768h.this.f28290Q, C1410y.m37046c0(14.0f, N3));
                        } else if (bVar.f28320g >= 0.55f) {
                            canvas.save();
                            canvas.translate(i6, GestureDetector$OnGestureListenerC8768h.this.f28290Q);
                            float f5 = (bVar.f28320g * 0.2f) + 0.8f;
                            canvas.scale(f5, f5);
                            canvas.drawText(bVar.f28315b, -((int) (bVar.f28318e * 0.5f)), 0.0f, C1410y.m37046c0(14.0f, C5064d.m24131a((bVar.f28320g - 0.55f) / 0.45f, N3)));
                            canvas.restore();
                        }
                        i4 += round;
                        i5++;
                        length = i;
                        f = 0.0f;
                        f2 = 1.0f;
                    }
                }
                if (GestureDetector$OnGestureListenerC8768h.this.f28308l0 != 0.0f) {
                    int w = C11524j.m148w();
                    if (GestureDetector$OnGestureListenerC8768h.this.f28308l0 != 1.0f) {
                        canvas.drawCircle(GestureDetector$OnGestureListenerC8768h.this.f28310n0 + ((i2 - GestureDetector$OnGestureListenerC8768h.this.f28310n0) * GestureDetector$OnGestureListenerC8768h.this.f28308l0), GestureDetector$OnGestureListenerC8768h.this.f28311o0 + ((i3 - GestureDetector$OnGestureListenerC8768h.this.f28311o0) * GestureDetector$OnGestureListenerC8768h.this.f28308l0), GestureDetector$OnGestureListenerC8768h.this.f28309m0 * GestureDetector$OnGestureListenerC8768h.this.f28308l0, C1410y.m37039g(w));
                        canvas.drawRect(0.0f, 0.0f, measuredWidth, GestureDetector$OnGestureListenerC8768h.this.f28289P, C1410y.m37039g(C5064d.m24130b((int) (GestureDetector$OnGestureListenerC8768h.this.f28308l0 * 255.0f), w)));
                        return;
                    }
                    canvas.drawRect(0.0f, 0.0f, measuredWidth, GestureDetector$OnGestureListenerC8768h.this.f28289P, C1410y.m37039g(w));
                }
            }
        }

        @Override
        public int getOpacity() {
            return 0;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public GestureDetector$OnGestureListenerC8768h(Context context) {
        super(context);
        this.f28299c0 = new GestureDetector(context, this);
        int barHeight = getBarHeight();
        this.f28289P = barHeight;
        this.f28290Q = barHeight - C1357a0.m37541i(9.0f);
        setWillNotDraw(false);
        C2065g.m35718d(this, new C8772d());
        setLayoutParams(FrameLayoutFix.m18007t1(-1, barHeight, 80));
    }

    public static int getBarHeight() {
        return C1357a0.m37541i(56.0f);
    }

    public void m11445k2(ValueAnimator valueAnimator) {
        setFactor(C2057b.m35735a(valueAnimator));
    }

    private void setFactor(float f) {
        if (this.f28307k0 != f) {
            this.f28307k0 = f;
            this.f28305i0.f28320g = 1.0f - f;
            this.f28306j0.f28320g = f;
            invalidate();
            AbstractC8771c cVar = this.f28288O;
            if (cVar != null) {
                cVar.mo11185E(f);
            }
        }
    }

    public final int m11448f2(int i) {
        C8770b[] bVarArr = this.f28286M;
        if (!(bVarArr == null || bVarArr.length == 0)) {
            int i2 = this.f28297a0;
            int i3 = 0;
            for (C8770b bVar : bVarArr) {
                int i4 = this.f28295V + ((int) (this.f28296W * bVar.f28320g));
                if (i3 == i) {
                    return i2 + (i4 / 2);
                }
                i3++;
                i2 += i4;
            }
        }
        return -1;
    }

    public int getCurrentBarWidth() {
        int g = C1357a0.m37543g();
        int i = C1357a0.m37541i(168.0f);
        C8770b[] bVarArr = this.f28286M;
        return g / bVarArr.length > i ? bVarArr.length * i : g;
    }

    public int getCurrentColor() {
        int N = C11524j.m228N(this.f28286M[this.f28287N].f28316c);
        if (this.f28307k0 == 0.0f) {
            return N;
        }
        return C5064d.m24129c(N, C5064d.m24131a(this.f28307k0, C11524j.m228N(this.f28306j0.f28316c)));
    }

    public int getCurrentIndex() {
        return this.f28287N;
    }

    public final int m11447h2(float f) {
        C8770b[] bVarArr = this.f28286M;
        if (!(bVarArr == null || bVarArr.length == 0)) {
            int i = this.f28297a0;
            int i2 = 0;
            for (C8770b bVar : bVarArr) {
                int i3 = this.f28295V + ((int) (this.f28296W * bVar.f28320g));
                if (f >= i && f < i + i3) {
                    return i2;
                }
                i2++;
                i += i3;
            }
        }
        return -1;
    }

    public final boolean m11446i2(boolean z) {
        C8770b[] bVarArr = this.f28286M;
        if (bVarArr == null || bVarArr.length == 0 || this.f28308l0 != 0.0f) {
            return false;
        }
        int max = z ? Math.max(0, this.f28287N - 1) : Math.min(this.f28287N + 1, bVarArr.length - 1);
        return max != this.f28287N && m11441p2(max);
    }

    public final boolean m11444l2(int i) {
        if (this.f28304h0) {
            return false;
        }
        C2065g.m35719c(this);
        AbstractC8771c cVar = this.f28288O;
        if (cVar != null) {
            int i2 = this.f28287N;
            if (i2 == i) {
                cVar.mo11134i1(i);
            } else if (!cVar.mo11128l0(i2, i)) {
                return false;
            }
        }
        int i3 = this.f28287N;
        if (i3 == i) {
            return false;
        }
        this.f28304h0 = true;
        C8770b[] bVarArr = this.f28286M;
        this.f28305i0 = bVarArr[i3];
        this.f28306j0 = bVarArr[i];
        ValueAnimator b = C2057b.m35734b();
        b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                GestureDetector$OnGestureListenerC8768h.this.m11445k2(valueAnimator);
            }
        });
        b.addListener(new C8769a(i));
        b.setDuration(240L);
        b.setInterpolator(C2057b.f7280b);
        b.start();
        return true;
    }

    public void m11443m2() {
        this.f28310n0 = this.f28297a0;
        this.f28311o0 = (this.f28289P / 2) - ((int) ((this.f28291R - this.f28286M[this.f28287N].f28317d) * this.f28307k0));
        int measuredWidth = getMeasuredWidth() * getMeasuredWidth();
        int i = this.f28289P;
        this.f28309m0 = ((float) Math.sqrt(measuredWidth + (i * i))) * 0.5f;
        int i2 = this.f28297a0;
        int i3 = 0;
        for (C8770b bVar : this.f28286M) {
            int round = this.f28295V + Math.round(this.f28296W * bVar.f28320g);
            if (i3 == this.f28287N) {
                this.f28310n0 = i2 + (round / 2);
                return;
            }
            i2 += round;
            i3++;
        }
    }

    public void m11442n2(C8770b[] bVarArr, int i) {
        float f = 0.0f;
        int i2 = 0;
        for (C8770b bVar : bVarArr) {
            if (bVar.f28315b == null || bVar.f28315b.isEmpty()) {
                throw new IllegalArgumentException("item.itemIconResource == 0 || item.itemName == null || item.itemName.isEmpty()");
            }
            bVar.f28318e = C7389v0.m16680T1(bVar.f28315b, C1410y.m37048b0(14.0f));
            if (bVar.f28318e > f) {
                f = bVar.f28318e;
            }
            bVar.f28319f = bVar.f28314a == 0 ? null : C1362c.m37482g(getResources(), bVar.f28314a);
            if (i2 == i) {
                bVar.f28320g = 1.0f;
            }
            i2++;
        }
        this.f28287N = i;
        this.f28294U = f;
        this.f28286M = bVarArr;
        this.f28292S = 0;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (Math.abs(f) > C1357a0.m37540j(250.0f, 1.0f)) {
            if (m11446i2(f >= 0.0f)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m11440r2();
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
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
        this.f28299c0.onTouchEvent(motionEvent);
        C8770b[] bVarArr = this.f28286M;
        if (bVarArr != null && bVarArr.length != 0 && this.f28308l0 == 0.0f) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f28302f0 = -1;
                this.f28303g0 = -1;
                this.f28300d0 = x;
                this.f28301e0 = y;
                int i = this.f28297a0;
                C8770b[] bVarArr2 = this.f28286M;
                int length = bVarArr2.length;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    int i4 = this.f28295V + ((int) (this.f28296W * bVarArr2[i2].f28320g));
                    if (x >= i && x < i + i4) {
                        this.f28302f0 = i3;
                        this.f28303g0 = i + ((int) (i4 * 0.5f));
                        break;
                    }
                    i3++;
                    i += i4;
                    i2++;
                }
            } else {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 3) {
                            this.f28302f0 = -1;
                            return true;
                        }
                    } else if (this.f28302f0 != -1 && Math.max(Math.abs(this.f28300d0 - x), Math.abs(this.f28301e0 - y)) > C1357a0.m37533q()) {
                        this.f28302f0 = -1;
                    }
                } else if (this.f28302f0 != -1) {
                    int h2 = m11447h2(x);
                    int i5 = this.f28302f0;
                    if (h2 == i5) {
                        m11444l2(i5);
                    }
                }
                return true;
            }
        }
        return true;
    }

    public boolean m11441p2(int i) {
        int f2 = m11448f2(i);
        if (f2 == -1) {
            return false;
        }
        this.f28303g0 = f2;
        this.f28302f0 = i;
        return m11444l2(i);
    }

    public final void m11440r2() {
        int i;
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth > 0) {
            if (this.f28292S != measuredWidth || this.f28293T != C1357a0.m37544f()) {
                this.f28292S = measuredWidth;
                this.f28293T = C1357a0.m37544f();
                int i2 = C1357a0.m37541i(168.0f);
                C8770b[] bVarArr = this.f28286M;
                int length = measuredWidth / bVarArr.length;
                if (length > i2) {
                    this.f28297a0 = ((bVarArr.length * i2) - measuredWidth) / 2;
                    i = bVarArr.length * i2;
                } else {
                    this.f28297a0 = 0;
                    i = measuredWidth;
                    i2 = length;
                }
                int max = Math.max(i2, (int) (this.f28294U + C1357a0.m37541i(40.0f)));
                int length2 = (i - max) / (this.f28286M.length - 1);
                this.f28295V = length2;
                this.f28296W = max - length2;
                int i3 = this.f28289P;
                this.f28298b0 = ((float) Math.sqrt((measuredWidth * measuredWidth) + (i3 * i3))) * 0.5f;
            }
        }
    }

    public void setCallback(AbstractC8771c cVar) {
        this.f28288O = cVar;
    }

    public void setOverlayFactor(float f) {
        if (this.f28308l0 != f) {
            this.f28308l0 = f;
            invalidate();
        }
    }

    public static class C8770b {
        public final int f28314a;
        public final String f28315b;
        public final int f28316c;
        public final int f28317d;
        public float f28318e;
        public Drawable f28319f;
        public float f28320g;

        public C8770b(int i, int i2, int i3) {
            this.f28314a = i;
            this.f28315b = C4403w.m27869i1(i2);
            this.f28316c = i3;
            this.f28317d = 0;
        }

        public C8770b(int i, int i2, int i3, int i4) {
            this.f28314a = i;
            this.f28315b = C4403w.m27869i1(i2);
            this.f28316c = i3;
            this.f28317d = i4;
        }
    }
}
