package vc;

import ae.j;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import ce.a0;
import ce.p0;
import ce.y;
import eb.f;
import eb.k;
import eb.l;
import ie.o0;
import je.g;
import je.t;
import ne.i;
import org.thunderdog.challegram.R;
import zd.o6;

public class d extends i {
    public Drawable f24877k0;
    public C0232d f24878l0;
    public final f f24879m0 = new f(0, new k.b() {
        @Override
        public final void n4(int i10, float f10, float f11, k kVar) {
            d.this.V0(i10, f10, f11, kVar);
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
            l.a(this, i10, f10, kVar);
        }
    }, db.b.f7287b, 180);
    public float f24880n0;

    public class a extends o0 {
        public a() {
        }

        @Override
        public void draw(Canvas canvas) {
            RectF P0 = d.this.P0();
            int Q0 = d.this.Q0();
            int d10 = ib.d.d(j.u(), j.L(R.id.theme_color_circleButtonChat), d.this.f24880n0);
            if (Q0 == 0) {
                canvas.drawRect(P0.left, P0.top, P0.right, P0.bottom, y.g(d10));
                return;
            }
            float f10 = Q0;
            canvas.drawRoundRect(P0, f10, f10, y.g(d10));
        }
    }

    public class b extends o0 {
        public b() {
        }

        @Override
        public void draw(Canvas canvas) {
            RectF P0 = d.this.P0();
            int Q0 = d.this.Q0();
            int L = j.L(R.id.theme_color_fillingPressed);
            if (Q0 == 0) {
                canvas.drawRect(P0.left, P0.top, P0.right, P0.bottom, y.g(L));
                return;
            }
            float f10 = Q0;
            canvas.drawRoundRect(P0, f10, f10, y.g(L));
        }
    }

    public class c extends ViewOutlineProvider {
        public c() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            RectF P0 = d.this.P0();
            int Q0 = d.this.Q0();
            if (Q0 == 0) {
                outline.setRect((int) P0.left, (int) P0.top, (int) P0.right, (int) P0.bottom);
            } else {
                outline.setRoundRect((int) P0.left, (int) P0.top, (int) P0.right, (int) P0.bottom, Q0);
            }
        }
    }

    public static class C0232d {
        public String f24884a;
        public int f24885b;
        public float f24886c;
        public C0232d f24887d;
        public Drawable f24888e;
        public g f24889f;

        public C0232d(String str, int i10) {
            this.f24884a = str;
            this.f24885b = i10;
            this.f24888e = ce.c.f(i10);
        }

        public void e(Canvas canvas, View view, float f10, float f11) {
            int i10;
            int paddingLeft = view.getPaddingLeft() + (((view.getMeasuredWidth() - view.getPaddingRight()) - view.getPaddingLeft()) / 2);
            int paddingTop = view.getPaddingTop() + (((view.getMeasuredHeight() - view.getPaddingBottom()) - view.getPaddingTop()) / 2);
            if (this.f24887d != null) {
                canvas.save();
                float f12 = 1.0f - this.f24886c;
                float f13 = (f12 * 0.19999999f) + 0.8f;
                canvas.scale(f13, f13, paddingLeft, paddingTop);
                this.f24887d.e(canvas, view, f10, f12);
                canvas.restore();
            }
            float f14 = f11 * this.f24886c;
            boolean z10 = f14 != 1.0f;
            if (z10) {
                int O = p0.O(canvas);
                float f15 = (0.19999999f * f14) + 0.8f;
                canvas.scale(f15, f15, paddingLeft, paddingTop);
                i10 = O;
            } else {
                i10 = -1;
            }
            g gVar = this.f24889f;
            if (gVar != null && f10 < 1.0f) {
                gVar.z(canvas, paddingLeft - (gVar.getWidth() / 2), paddingTop - (this.f24889f.getHeight() / 2), null, f14 * (1.0f - f10));
            }
            if (f10 > 0.0f && this.f24888e != null) {
                Paint W = y.W(j.L(R.id.theme_color_circleButtonChatIcon));
                int alpha = W.getAlpha();
                W.setAlpha((int) (alpha * f14 * f10));
                Drawable drawable = this.f24888e;
                ce.c.b(canvas, drawable, paddingLeft - (drawable.getMinimumWidth() / 2), paddingTop - (this.f24888e.getMinimumHeight() / 2), W);
                W.setAlpha(alpha);
            }
            if (z10) {
                p0.N(canvas, i10);
            }
        }

        public void f(int i10) {
            int i11 = i10 - (a0.i(8.0f) * 2);
            this.f24889f = i11 > 0 ? new g.b(this.f24884a.toUpperCase(), i11 - a0.i(8.0f), y.A0(16.0f), t.d.H).b().v().f() : null;
        }
    }

    public d(Context context, o6 o6Var) {
        super(context, o6Var);
        p0.T(this);
        Drawable s10 = j.s(new a(), new b());
        this.f24877k0 = s10;
        db.g.d(this, s10);
        setOutlineProvider(new c());
        p0.i0(this);
    }

    public void V0(int i10, float f10, float f11, k kVar) {
        C0232d dVar = this.f24878l0;
        if (dVar != null) {
            dVar.f24886c = f10;
            if (f10 == 1.0f) {
                this.f24878l0.f24887d = null;
            }
            invalidate();
        }
    }

    public final RectF P0() {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = getPaddingLeft() + (measuredWidth / 2);
        int paddingTop = getPaddingTop() + (measuredHeight / 2);
        int i10 = a0.i(48.0f);
        float f10 = this.f24880n0;
        int i11 = measuredHeight + ((int) ((i10 - measuredHeight) * f10));
        RectF a02 = y.a0();
        int i12 = (measuredWidth + ((int) ((i10 - measuredWidth) * f10))) / 2;
        int i13 = i11 / 2;
        a02.set(paddingLeft - i12, paddingTop - i13, paddingLeft + i12, paddingTop + i13);
        return a02;
    }

    public final int Q0() {
        return (int) ((a0.i(48.0f) / 2.0f) * this.f24880n0);
    }

    public void Y0(int i10, String str, int i11, boolean z10) {
        C0232d dVar;
        C0232d dVar2 = this.f24878l0;
        if (dVar2 == null || !dVar2.f24884a.equals(str) || this.f24878l0.f24885b != i11) {
            setId(i10);
            C0232d dVar3 = new C0232d(str, i11);
            dVar3.f(getMeasuredWidth());
            if (!z10 || (dVar = this.f24878l0) == null) {
                this.f24879m0.p(false, false);
                this.f24878l0 = dVar3;
                dVar3.f24886c = 1.0f;
                invalidate();
                return;
            }
            this.f24878l0 = null;
            this.f24879m0.p(false, false);
            dVar3.f24887d = dVar;
            this.f24878l0 = dVar3;
            this.f24879m0.p(true, true);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f24878l0 != null) {
            RectF P0 = P0();
            canvas.save();
            canvas.clipRect(P0.left, P0.top, P0.right, P0.bottom);
            this.f24878l0.e(canvas, this, this.f24880n0, 1.0f);
            canvas.restore();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        C0232d dVar = this.f24878l0;
        if (dVar != null) {
            dVar.f(getMeasuredWidth());
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            RectF P0 = P0();
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (x10 < P0.left || x10 > P0.right || y10 < P0.top || y10 > P0.bottom) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCollapseFactor(float f10) {
        if (this.f24880n0 != f10) {
            this.f24880n0 = f10;
            invalidateOutline();
            this.f24877k0.invalidateSelf();
            invalidate();
        }
    }
}
