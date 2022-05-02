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
    public C8770b[] f28289M;
    public int f28290N;
    public AbstractC8771c f28291O;
    public final int f28292P;
    public final int f28293Q;
    public int f28295S;
    public int f28296T;
    public float f28297U;
    public int f28298V;
    public int f28299W;
    public int f28300a0;
    public float f28301b0;
    public final GestureDetector f28302c0;
    public float f28303d0;
    public float f28304e0;
    public boolean f28307h0;
    public C8770b f28308i0;
    public C8770b f28309j0;
    public float f28310k0;
    public float f28311l0;
    public float f28312m0;
    public int f28313n0;
    public int f28314o0;
    public int f28305f0 = -1;
    public int f28306g0 = -1;
    public final int f28294R = C1357a0.m37544i(10.0f);

    public class C8769a extends AnimatorListenerAdapter {
        public final int f28315a;

        public C8769a(int i) {
            this.f28315a = i;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            GestureDetector$OnGestureListenerC8768h.this.f28310k0 = 0.0f;
            GestureDetector$OnGestureListenerC8768h.this.f28290N = this.f28315a;
            if (GestureDetector$OnGestureListenerC8768h.this.f28291O != null) {
                GestureDetector$OnGestureListenerC8768h.this.f28291O.mo11123n(this.f28315a);
            }
            GestureDetector$OnGestureListenerC8768h.this.f28307h0 = false;
        }
    }

    public interface AbstractC8771c {
        void mo11184E(float f);

        void mo11133i1(int i);

        boolean mo11127l0(int i, int i2);

        void mo11123n(int i);
    }

    public class C8772d extends Drawable {
        public Paint f28324a;
        public int f28325b;

        public C8772d() {
        }

        @Override
        public void draw(Canvas canvas) {
            int i;
            GestureDetector$OnGestureListenerC8768h.this.m11439r2();
            int measuredWidth = GestureDetector$OnGestureListenerC8768h.this.getMeasuredWidth();
            if (GestureDetector$OnGestureListenerC8768h.this.f28289M != null && GestureDetector$OnGestureListenerC8768h.this.f28289M.length != 0 && measuredWidth != 0) {
                int i2 = measuredWidth / 2;
                int i3 = GestureDetector$OnGestureListenerC8768h.this.f28292P / 2;
                float f = 0.0f;
                float f2 = 1.0f;
                if (GestureDetector$OnGestureListenerC8768h.this.f28311l0 != 1.0f) {
                    int N = C11524j.m228N(GestureDetector$OnGestureListenerC8768h.this.f28289M[GestureDetector$OnGestureListenerC8768h.this.f28290N].f28319c);
                    if (GestureDetector$OnGestureListenerC8768h.this.f28310k0 == 0.0f) {
                        canvas.drawRect(0.0f, 0.0f, measuredWidth, GestureDetector$OnGestureListenerC8768h.this.f28292P, C1410y.m37042g(N));
                    } else {
                        int N2 = C11524j.m228N(GestureDetector$OnGestureListenerC8768h.this.f28309j0.f28319c);
                        canvas.drawRect(0.0f, 0.0f, measuredWidth, GestureDetector$OnGestureListenerC8768h.this.f28292P, C1410y.m37042g(C5064d.m24130c(N, C5064d.m24132a(GestureDetector$OnGestureListenerC8768h.this.f28310k0, N2))));
                        float f3 = GestureDetector$OnGestureListenerC8768h.this.f28306g0;
                        float f4 = i3 - ((int) ((GestureDetector$OnGestureListenerC8768h.this.f28294R - GestureDetector$OnGestureListenerC8768h.this.f28308i0.f28320d) * GestureDetector$OnGestureListenerC8768h.this.f28310k0));
                        canvas.drawCircle(f3 + ((i2 - f3) * GestureDetector$OnGestureListenerC8768h.this.f28310k0), f4 + ((i3 - f4) * GestureDetector$OnGestureListenerC8768h.this.f28310k0), GestureDetector$OnGestureListenerC8768h.this.f28301b0 * GestureDetector$OnGestureListenerC8768h.this.f28310k0, C1410y.m37042g(N2));
                    }
                    int i4 = GestureDetector$OnGestureListenerC8768h.this.f28300a0;
                    C8770b[] bVarArr = GestureDetector$OnGestureListenerC8768h.this.f28289M;
                    int length = bVarArr.length;
                    int i5 = 0;
                    while (i5 < length) {
                        C8770b bVar = bVarArr[i5];
                        int round = GestureDetector$OnGestureListenerC8768h.this.f28298V + Math.round(GestureDetector$OnGestureListenerC8768h.this.f28299W * bVar.f28323g);
                        int i6 = (round / 2) + i4;
                        int i7 = bVar.f28323g == f ? i3 : i3 - ((int) ((GestureDetector$OnGestureListenerC8768h.this.f28294R - bVar.f28320d) * bVar.f28323g));
                        int i8 = 255;
                        if (bVar.f28323g != f2) {
                            i8 = 255 - ((int) (63.75f * (f2 - bVar.f28323g)));
                        }
                        int N3 = C11524j.m228N(R.id.theme_color_attachText);
                        Paint paint = this.f28324a;
                        bVarArr = bVarArr;
                        if (paint == null || this.f28325b != N3) {
                            this.f28325b = N3;
                            paint = C1410y.m37050c(paint, N3);
                            this.f28324a = paint;
                        }
                        paint.setAlpha(i8);
                        if (bVar.f28322f != null) {
                            i = length;
                            C1362c.m37490b(canvas, bVar.f28322f, i6 - (bVar.f28322f.getMinimumWidth() / 2), i7 - ((int) (bVar.f28322f.getMinimumHeight() * 0.5f)), paint);
                        } else {
                            i = length;
                            canvas.drawCircle(i6, i7, C1357a0.m37544i(12.0f), C1410y.m37042g(-1));
                        }
                        if (bVar.f28323g == 1.0f) {
                            canvas.drawText(bVar.f28318b, i6 - ((int) (bVar.f28321e * 0.5f)), GestureDetector$OnGestureListenerC8768h.this.f28293Q, C1410y.m37049c0(14.0f, N3));
                        } else if (bVar.f28323g >= 0.55f) {
                            canvas.save();
                            canvas.translate(i6, GestureDetector$OnGestureListenerC8768h.this.f28293Q);
                            float f5 = (bVar.f28323g * 0.2f) + 0.8f;
                            canvas.scale(f5, f5);
                            canvas.drawText(bVar.f28318b, -((int) (bVar.f28321e * 0.5f)), 0.0f, C1410y.m37049c0(14.0f, C5064d.m24132a((bVar.f28323g - 0.55f) / 0.45f, N3)));
                            canvas.restore();
                        }
                        i4 += round;
                        i5++;
                        length = i;
                        f = 0.0f;
                        f2 = 1.0f;
                    }
                }
                if (GestureDetector$OnGestureListenerC8768h.this.f28311l0 != 0.0f) {
                    int w = C11524j.m148w();
                    if (GestureDetector$OnGestureListenerC8768h.this.f28311l0 != 1.0f) {
                        canvas.drawCircle(GestureDetector$OnGestureListenerC8768h.this.f28313n0 + ((i2 - GestureDetector$OnGestureListenerC8768h.this.f28313n0) * GestureDetector$OnGestureListenerC8768h.this.f28311l0), GestureDetector$OnGestureListenerC8768h.this.f28314o0 + ((i3 - GestureDetector$OnGestureListenerC8768h.this.f28314o0) * GestureDetector$OnGestureListenerC8768h.this.f28311l0), GestureDetector$OnGestureListenerC8768h.this.f28312m0 * GestureDetector$OnGestureListenerC8768h.this.f28311l0, C1410y.m37042g(w));
                        canvas.drawRect(0.0f, 0.0f, measuredWidth, GestureDetector$OnGestureListenerC8768h.this.f28292P, C1410y.m37042g(C5064d.m24131b((int) (GestureDetector$OnGestureListenerC8768h.this.f28311l0 * 255.0f), w)));
                        return;
                    }
                    canvas.drawRect(0.0f, 0.0f, measuredWidth, GestureDetector$OnGestureListenerC8768h.this.f28292P, C1410y.m37042g(w));
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
        this.f28302c0 = new GestureDetector(context, this);
        int barHeight = getBarHeight();
        this.f28292P = barHeight;
        this.f28293Q = barHeight - C1357a0.m37544i(9.0f);
        setWillNotDraw(false);
        C2065g.m35721d(this, new C8772d());
        setLayoutParams(FrameLayoutFix.m18007t1(-1, barHeight, 80));
    }

    public static int getBarHeight() {
        return C1357a0.m37544i(56.0f);
    }

    public void m11444k2(ValueAnimator valueAnimator) {
        setFactor(C2057b.m35738a(valueAnimator));
    }

    private void setFactor(float f) {
        if (this.f28310k0 != f) {
            this.f28310k0 = f;
            this.f28308i0.f28323g = 1.0f - f;
            this.f28309j0.f28323g = f;
            invalidate();
            AbstractC8771c cVar = this.f28291O;
            if (cVar != null) {
                cVar.mo11184E(f);
            }
        }
    }

    public final int m11447f2(int i) {
        C8770b[] bVarArr = this.f28289M;
        if (!(bVarArr == null || bVarArr.length == 0)) {
            int i2 = this.f28300a0;
            int i3 = 0;
            for (C8770b bVar : bVarArr) {
                int i4 = this.f28298V + ((int) (this.f28299W * bVar.f28323g));
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
        int g = C1357a0.m37546g();
        int i = C1357a0.m37544i(168.0f);
        C8770b[] bVarArr = this.f28289M;
        return g / bVarArr.length > i ? bVarArr.length * i : g;
    }

    public int getCurrentColor() {
        int N = C11524j.m228N(this.f28289M[this.f28290N].f28319c);
        if (this.f28310k0 == 0.0f) {
            return N;
        }
        return C5064d.m24130c(N, C5064d.m24132a(this.f28310k0, C11524j.m228N(this.f28309j0.f28319c)));
    }

    public int getCurrentIndex() {
        return this.f28290N;
    }

    public final int m11446h2(float f) {
        C8770b[] bVarArr = this.f28289M;
        if (!(bVarArr == null || bVarArr.length == 0)) {
            int i = this.f28300a0;
            int i2 = 0;
            for (C8770b bVar : bVarArr) {
                int i3 = this.f28298V + ((int) (this.f28299W * bVar.f28323g));
                if (f >= i && f < i + i3) {
                    return i2;
                }
                i2++;
                i += i3;
            }
        }
        return -1;
    }

    public final boolean m11445i2(boolean z) {
        C8770b[] bVarArr = this.f28289M;
        if (bVarArr == null || bVarArr.length == 0 || this.f28311l0 != 0.0f) {
            return false;
        }
        int max = z ? Math.max(0, this.f28290N - 1) : Math.min(this.f28290N + 1, bVarArr.length - 1);
        return max != this.f28290N && m11440p2(max);
    }

    public final boolean m11443l2(int i) {
        if (this.f28307h0) {
            return false;
        }
        C2065g.m35722c(this);
        AbstractC8771c cVar = this.f28291O;
        if (cVar != null) {
            int i2 = this.f28290N;
            if (i2 == i) {
                cVar.mo11133i1(i);
            } else if (!cVar.mo11127l0(i2, i)) {
                return false;
            }
        }
        int i3 = this.f28290N;
        if (i3 == i) {
            return false;
        }
        this.f28307h0 = true;
        C8770b[] bVarArr = this.f28289M;
        this.f28308i0 = bVarArr[i3];
        this.f28309j0 = bVarArr[i];
        ValueAnimator b = C2057b.m35737b();
        b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                GestureDetector$OnGestureListenerC8768h.this.m11444k2(valueAnimator);
            }
        });
        b.addListener(new C8769a(i));
        b.setDuration(240L);
        b.setInterpolator(C2057b.f7280b);
        b.start();
        return true;
    }

    public void m11442m2() {
        this.f28313n0 = this.f28300a0;
        this.f28314o0 = (this.f28292P / 2) - ((int) ((this.f28294R - this.f28289M[this.f28290N].f28320d) * this.f28310k0));
        int measuredWidth = getMeasuredWidth() * getMeasuredWidth();
        int i = this.f28292P;
        this.f28312m0 = ((float) Math.sqrt(measuredWidth + (i * i))) * 0.5f;
        int i2 = this.f28300a0;
        int i3 = 0;
        for (C8770b bVar : this.f28289M) {
            int round = this.f28298V + Math.round(this.f28299W * bVar.f28323g);
            if (i3 == this.f28290N) {
                this.f28313n0 = i2 + (round / 2);
                return;
            }
            i2 += round;
            i3++;
        }
    }

    public void m11441n2(C8770b[] bVarArr, int i) {
        float f = 0.0f;
        int i2 = 0;
        for (C8770b bVar : bVarArr) {
            if (bVar.f28318b == null || bVar.f28318b.isEmpty()) {
                throw new IllegalArgumentException("item.itemIconResource == 0 || item.itemName == null || item.itemName.isEmpty()");
            }
            bVar.f28321e = C7389v0.m16680T1(bVar.f28318b, C1410y.m37051b0(14.0f));
            if (bVar.f28321e > f) {
                f = bVar.f28321e;
            }
            bVar.f28322f = bVar.f28317a == 0 ? null : C1362c.m37485g(getResources(), bVar.f28317a);
            if (i2 == i) {
                bVar.f28323g = 1.0f;
            }
            i2++;
        }
        this.f28290N = i;
        this.f28297U = f;
        this.f28289M = bVarArr;
        this.f28295S = 0;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (Math.abs(f) > C1357a0.m37543j(250.0f, 1.0f)) {
            if (m11445i2(f >= 0.0f)) {
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
        m11439r2();
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
        this.f28302c0.onTouchEvent(motionEvent);
        C8770b[] bVarArr = this.f28289M;
        if (bVarArr != null && bVarArr.length != 0 && this.f28311l0 == 0.0f) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f28305f0 = -1;
                this.f28306g0 = -1;
                this.f28303d0 = x;
                this.f28304e0 = y;
                int i = this.f28300a0;
                C8770b[] bVarArr2 = this.f28289M;
                int length = bVarArr2.length;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    int i4 = this.f28298V + ((int) (this.f28299W * bVarArr2[i2].f28323g));
                    if (x >= i && x < i + i4) {
                        this.f28305f0 = i3;
                        this.f28306g0 = i + ((int) (i4 * 0.5f));
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
                            this.f28305f0 = -1;
                            return true;
                        }
                    } else if (this.f28305f0 != -1 && Math.max(Math.abs(this.f28303d0 - x), Math.abs(this.f28304e0 - y)) > C1357a0.m37536q()) {
                        this.f28305f0 = -1;
                    }
                } else if (this.f28305f0 != -1) {
                    int h2 = m11446h2(x);
                    int i5 = this.f28305f0;
                    if (h2 == i5) {
                        m11443l2(i5);
                    }
                }
                return true;
            }
        }
        return true;
    }

    public boolean m11440p2(int i) {
        int f2 = m11447f2(i);
        if (f2 == -1) {
            return false;
        }
        this.f28306g0 = f2;
        this.f28305f0 = i;
        return m11443l2(i);
    }

    public final void m11439r2() {
        int i;
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth > 0) {
            if (this.f28295S != measuredWidth || this.f28296T != C1357a0.m37547f()) {
                this.f28295S = measuredWidth;
                this.f28296T = C1357a0.m37547f();
                int i2 = C1357a0.m37544i(168.0f);
                C8770b[] bVarArr = this.f28289M;
                int length = measuredWidth / bVarArr.length;
                if (length > i2) {
                    this.f28300a0 = ((bVarArr.length * i2) - measuredWidth) / 2;
                    i = bVarArr.length * i2;
                } else {
                    this.f28300a0 = 0;
                    i = measuredWidth;
                    i2 = length;
                }
                int max = Math.max(i2, (int) (this.f28297U + C1357a0.m37544i(40.0f)));
                int length2 = (i - max) / (this.f28289M.length - 1);
                this.f28298V = length2;
                this.f28299W = max - length2;
                int i3 = this.f28292P;
                this.f28301b0 = ((float) Math.sqrt((measuredWidth * measuredWidth) + (i3 * i3))) * 0.5f;
            }
        }
    }

    public void setCallback(AbstractC8771c cVar) {
        this.f28291O = cVar;
    }

    public void setOverlayFactor(float f) {
        if (this.f28311l0 != f) {
            this.f28311l0 = f;
            invalidate();
        }
    }

    public static class C8770b {
        public final int f28317a;
        public final String f28318b;
        public final int f28319c;
        public final int f28320d;
        public float f28321e;
        public Drawable f28322f;
        public float f28323g;

        public C8770b(int i, int i2, int i3) {
            this.f28317a = i;
            this.f28318b = C4403w.m27871i1(i2);
            this.f28319c = i3;
            this.f28320d = 0;
        }

        public C8770b(int i, int i2, int i3, int i4) {
            this.f28317a = i;
            this.f28318b = C4403w.m27871i1(i2);
            this.f28319c = i3;
            this.f28320d = i4;
        }
    }
}
