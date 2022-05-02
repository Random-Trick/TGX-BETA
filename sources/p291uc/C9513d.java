package p291uc;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import be.C1357a0;
import be.C1362c;
import be.C1399s0;
import be.C1410y;
import ie.C5428t;
import ie.RunnableC5390g;
import me.View$OnClickListenerC6902i;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p037cb.C2065g;
import p051db.C3940f;
import p051db.C3950k;
import p051db.C3953l;
import p108hb.C5064d;
import p111he.AbstractC5134o0;
import p350yd.C10930q6;
import p364zd.C11524j;

public class C9513d extends View$OnClickListenerC6902i {
    public Drawable f30788k0;
    public C9517d f30789l0;
    public final C3940f f30790m0 = new C3940f(0, new C3950k.AbstractC3952b() {
        @Override
        public final void mo45P5(int i, float f, float f2, C3950k kVar) {
            C9513d.this.m8452Q0(i, f, f2, kVar);
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
            C3953l.m29526a(this, i, f, kVar);
        }
    }, C2057b.f7280b, 180);
    public float f30791n0;

    public class C9514a extends AbstractC5134o0 {
        public C9514a() {
        }

        @Override
        public void draw(Canvas canvas) {
            RectF M0 = C9513d.this.m8454M0();
            int O0 = C9513d.this.m8453O0();
            int d = C5064d.m24128d(C11524j.m148w(), C11524j.m228N(R.id.theme_color_circleButtonChat), C9513d.this.f30791n0);
            if (O0 == 0) {
                canvas.drawRect(M0.left, M0.top, M0.right, M0.bottom, C1410y.m37039g(d));
                return;
            }
            float f = O0;
            canvas.drawRoundRect(M0, f, f, C1410y.m37039g(d));
        }
    }

    public class C9515b extends AbstractC5134o0 {
        public C9515b() {
        }

        @Override
        public void draw(Canvas canvas) {
            RectF M0 = C9513d.this.m8454M0();
            int O0 = C9513d.this.m8453O0();
            int N = C11524j.m228N(R.id.theme_color_fillingPressed);
            if (O0 == 0) {
                canvas.drawRect(M0.left, M0.top, M0.right, M0.bottom, C1410y.m37039g(N));
                return;
            }
            float f = O0;
            canvas.drawRoundRect(M0, f, f, C1410y.m37039g(N));
        }
    }

    public class C9516c extends ViewOutlineProvider {
        public C9516c() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            RectF M0 = C9513d.this.m8454M0();
            int O0 = C9513d.this.m8453O0();
            if (O0 == 0) {
                outline.setRect((int) M0.left, (int) M0.top, (int) M0.right, (int) M0.bottom);
            } else {
                outline.setRoundRect((int) M0.left, (int) M0.top, (int) M0.right, (int) M0.bottom, O0);
            }
        }
    }

    public static class C9517d {
        public String f30795a;
        public int f30796b;
        public float f30797c;
        public C9517d f30798d;
        public Drawable f30799e;
        public RunnableC5390g f30800f;

        public C9517d(String str, int i) {
            this.f30795a = str;
            this.f30796b = i;
            this.f30799e = C1362c.m37483f(i);
        }

        public void m8446e(Canvas canvas, View view, float f, float f2) {
            int i;
            int paddingLeft = view.getPaddingLeft() + (((view.getMeasuredWidth() - view.getPaddingRight()) - view.getPaddingLeft()) / 2);
            int paddingTop = view.getPaddingTop() + (((view.getMeasuredHeight() - view.getPaddingBottom()) - view.getPaddingTop()) / 2);
            if (this.f30798d != null) {
                canvas.save();
                float f3 = 1.0f - this.f30797c;
                float f4 = (f3 * 0.19999999f) + 0.8f;
                canvas.scale(f4, f4, paddingLeft, paddingTop);
                this.f30798d.m8446e(canvas, view, f, f3);
                canvas.restore();
            }
            float f5 = f2 * this.f30797c;
            boolean z = f5 != 1.0f;
            if (z) {
                int V = C1399s0.m37199V(canvas);
                float f6 = (0.19999999f * f5) + 0.8f;
                canvas.scale(f6, f6, paddingLeft, paddingTop);
                i = V;
            } else {
                i = -1;
            }
            RunnableC5390g gVar = this.f30800f;
            if (gVar != null && f < 1.0f) {
                gVar.m22891z(canvas, paddingLeft - (gVar.getWidth() / 2), paddingTop - (this.f30800f.getHeight() / 2), null, f5 * (1.0f - f));
            }
            if (f > 0.0f && this.f30799e != null) {
                Paint W = C1410y.m37055W(C11524j.m228N(R.id.theme_color_circleButtonChatIcon));
                int alpha = W.getAlpha();
                W.setAlpha((int) (alpha * f5 * f));
                Drawable drawable = this.f30799e;
                C1362c.m37487b(canvas, drawable, paddingLeft - (drawable.getMinimumWidth() / 2), paddingTop - (this.f30799e.getMinimumHeight() / 2), W);
                W.setAlpha(alpha);
            }
            if (z) {
                C1399s0.m37201T(canvas, i);
            }
        }

        public void m8445f(int i) {
            int i2 = i - (C1357a0.m37541i(8.0f) * 2);
            this.f30800f = i2 > 0 ? new RunnableC5390g.C5392b(this.f30795a.toUpperCase(), i2 - C1357a0.m37541i(8.0f), C1410y.m37083A0(16.0f), C5428t.AbstractC5441d.f17877H).m22888b().m22868v().m22884f() : null;
        }
    }

    public C9513d(Context context, C10930q6 q6Var) {
        super(context, q6Var);
        C1399s0.m37193a0(this);
        Drawable t = C11524j.m154t(new C9514a(), new C9515b());
        this.f30788k0 = t;
        C2065g.m35718d(this, t);
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C9516c());
            C1399s0.m37163p0(this);
        }
    }

    public void m8452Q0(int i, float f, float f2, C3950k kVar) {
        C9517d dVar = this.f30789l0;
        if (dVar != null) {
            dVar.f30797c = f;
            if (f == 1.0f) {
                this.f30789l0.f30798d = null;
            }
            invalidate();
        }
    }

    public final RectF m8454M0() {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = getPaddingLeft() + (measuredWidth / 2);
        int paddingTop = getPaddingTop() + (measuredHeight / 2);
        int i = C1357a0.m37541i(48.0f);
        float f = this.f30791n0;
        int i2 = measuredHeight + ((int) ((i - measuredHeight) * f));
        RectF a0 = C1410y.m37050a0();
        int i3 = (measuredWidth + ((int) ((i - measuredWidth) * f))) / 2;
        int i4 = i2 / 2;
        a0.set(paddingLeft - i3, paddingTop - i4, paddingLeft + i3, paddingTop + i4);
        return a0;
    }

    public final int m8453O0() {
        return (int) ((C1357a0.m37541i(48.0f) / 2.0f) * this.f30791n0);
    }

    public void m8451U0(int i, String str, int i2, boolean z) {
        C9517d dVar;
        C9517d dVar2 = this.f30789l0;
        if (dVar2 == null || !dVar2.f30795a.equals(str) || this.f30789l0.f30796b != i2) {
            setId(i);
            C9517d dVar3 = new C9517d(str, i2);
            dVar3.m8445f(getMeasuredWidth());
            if (!z || (dVar = this.f30789l0) == null) {
                this.f30790m0.m29575p(false, false);
                this.f30789l0 = dVar3;
                dVar3.f30797c = 1.0f;
                invalidate();
                return;
            }
            this.f30789l0 = null;
            this.f30790m0.m29575p(false, false);
            dVar3.f30798d = dVar;
            this.f30789l0 = dVar3;
            this.f30790m0.m29575p(true, true);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f30789l0 != null) {
            RectF M0 = m8454M0();
            canvas.save();
            canvas.clipRect(M0.left, M0.top, M0.right, M0.bottom);
            this.f30789l0.m8446e(canvas, this, this.f30791n0, 1.0f);
            canvas.restore();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C9517d dVar = this.f30789l0;
        if (dVar != null) {
            dVar.m8445f(getMeasuredWidth());
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            RectF M0 = m8454M0();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x < M0.left || x > M0.right || y < M0.top || y > M0.bottom) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCollapseFactor(float f) {
        if (this.f30791n0 != f) {
            this.f30791n0 = f;
            if (Build.VERSION.SDK_INT >= 21) {
                invalidateOutline();
            }
            this.f30788k0.invalidateSelf();
            invalidate();
        }
    }
}
