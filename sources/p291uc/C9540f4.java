package p291uc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import be.C1357a0;
import be.C1362c;
import be.C1379j0;
import be.C1410y;
import ge.C4868i;
import ge.C4895m;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p037cb.C2065g;
import p051db.C3940f;
import p051db.C3950k;
import p139jb.AbstractC5911c;
import p139jb.AbstractRunnableC5910b;
import p364zd.C11524j;
import td.C9357x2;

public class C9540f4 extends View implements C3950k.AbstractC3952b, C4868i.AbstractC4890u, AbstractC5911c, C9357x2.AbstractC9363f {
    public final C3940f f30902O;
    public final C3940f f30903P;
    public float f30904Q;
    public Paint f30905R;
    public float f30906S;
    public float f30907T;
    public boolean f30908U;
    public boolean f30909V;
    public boolean f30910W;
    public boolean f30911a;
    public boolean f30912a0;
    public AbstractRunnableC5910b f30914b0;
    public boolean f30916c0;
    public final Drawable f30913b = C1362c.m37482g(getResources(), R.drawable.deproko_baseline_send_24);
    public final Drawable f30915c = C1362c.m37482g(getResources(), R.drawable.deproko_baseline_msg_voice_24);
    public final Drawable f30900M = C1362c.m37482g(getResources(), R.drawable.deproko_baseline_msg_video_24);
    public final Drawable f30901N = C1362c.m37482g(getResources(), R.drawable.baseline_search_24);

    public class C9541a extends AbstractRunnableC5910b {
        public C9541a() {
        }

        @Override
        public void mo1364b() {
            if (C9540f4.this.f30914b0 == this) {
                C9540f4.this.m8389j(true, false);
                C9540f4.this.f30914b0 = null;
            }
        }
    }

    public C9540f4(Context context) {
        super(context);
        DecelerateInterpolator decelerateInterpolator = C2057b.f7280b;
        this.f30902O = new C3940f(0, this, decelerateInterpolator, 120L);
        this.f30903P = new C3940f(1, this, decelerateInterpolator, 180L);
        m8388k(C4868i.m24726c2().m24629o3(), false);
    }

    private Paint getIconPaint() {
        int N = C11524j.m228N(R.id.theme_color_circleButtonRegularIcon);
        Paint paint = this.f30905R;
        if (paint == null || paint.getColor() != N) {
            this.f30905R = C1410y.m37047c(this.f30905R, N);
        }
        return this.f30905R;
    }

    private void setIsDown(boolean z) {
        if (this.f30912a0 != z) {
            this.f30912a0 = z;
            if (z) {
                m8390i();
            } else {
                m8393e();
            }
        }
    }

    @Override
    public void mo6954G4(boolean z) {
        C4895m.m24483a(this, z);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        invalidate();
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    @Override
    public void mo4501a3() {
        C4868i.m24726c2().m24811Q3(this);
    }

    public final void m8393e() {
        AbstractRunnableC5910b bVar = this.f30914b0;
        if (bVar != null) {
            bVar.m21857c();
            this.f30914b0 = null;
        }
    }

    @Override
    public void mo8098f1(View view, Rect rect) {
        rect.top += C1357a0.m37541i(8.0f);
        rect.bottom -= C1357a0.m37541i(8.0f);
    }

    public final void m8392g() {
        C1379j0.m37307r(getContext()).m14529V0().m6932R0(this.f30909V && this.f30912a0);
    }

    public final void m8391h() {
        C2065g.m35719c(this);
        C4868i.m24726c2().m24587t5(!this.f30902O.m29583h());
    }

    public final void m8390i() {
        m8393e();
        C9541a aVar = new C9541a();
        this.f30914b0 = aVar;
        postDelayed(aVar, 120L);
    }

    public final void m8389j(boolean z, boolean z2) {
        boolean z3;
        if (this.f30908U != z) {
            if (z) {
                z3 = C1379j0.m37307r(getContext()).m14529V0().m6884k1(this, false);
            } else {
                if (!this.f30916c0) {
                    C1379j0.m37307r(getContext()).m14529V0().m6926U(z2);
                }
                z3 = true;
            }
            if (z3) {
                this.f30908U = z;
            } else if (z) {
                setIsDown(false);
            }
        }
    }

    public void m8388k(boolean z, boolean z2) {
        this.f30902O.m29575p(z, z2);
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int paddingLeft = getPaddingLeft() + (((measuredWidth - getPaddingLeft()) - getPaddingRight()) / 2);
        int i = measuredHeight / 2;
        float g = this.f30902O.m29584g();
        float g2 = this.f30903P.m29584g();
        Paint J = this.f30911a ? C1410y.m37068J() : getIconPaint();
        int alpha = J.getAlpha();
        float f2 = 1.0f - this.f30904Q;
        if (f2 > 0.0f) {
            float f3 = 1.0f - g2;
            float f4 = f2 * f3;
            if (f4 > 0.0f) {
                float f5 = (f3 * 0.6f) + 0.4f;
                int i2 = (f5 > 1.0f ? 1 : (f5 == 1.0f ? 0 : -1));
                if (i2 != 0) {
                    canvas.save();
                    canvas.scale(f5, f5, paddingLeft, i);
                }
                float f6 = i;
                float f7 = alpha;
                J.setAlpha((int) (f7 * (1.0f - g) * f4));
                float f8 = paddingLeft;
                C1362c.m37486c(canvas, this.f30915c, f8, (int) ((((this.f30900M.getMinimumHeight() / 2) + i) * g) + f6), J);
                J.setAlpha((int) (f7 * g * f4));
                C1362c.m37486c(canvas, this.f30900M, f8, (int) (f6 - (((this.f30900M.getMinimumHeight() / 2) + i) * f)), J);
                if (i2 != 0) {
                    canvas.restore();
                }
            }
            float f9 = f2 * g2;
            if (f9 > 0.0f) {
                float f10 = (g2 * 0.6f) + 0.4f;
                int i3 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i3 != 0) {
                    canvas.save();
                    canvas.scale(f10, f10, paddingLeft, i);
                }
                J.setAlpha((int) (alpha * f9));
                C1362c.m37486c(canvas, this.f30901N, paddingLeft, i, J);
                if (i3 != 0) {
                    canvas.restore();
                }
            }
        }
        J.setAlpha((int) (alpha * this.f30904Q));
        C1362c.m37486c(canvas, this.f30913b, paddingLeft, i, J);
        J.setAlpha(alpha);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!this.f30911a) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f30906S = motionEvent.getX();
            this.f30907T = motionEvent.getY();
            this.f30909V = false;
            this.f30910W = false;
            this.f30916c0 = false;
            setIsDown(true);
        } else if (action != 1) {
            if (action != 2) {
                if (action == 3 && this.f30912a0) {
                    m8389j(false, true);
                    setIsDown(false);
                }
            } else if (this.f30912a0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (this.f30908U && !this.f30916c0) {
                    boolean z2 = !C1379j0.m37307r(getContext()).m14529V0().m6909c0();
                    this.f30916c0 = z2;
                    if (!z2) {
                        float f = 0.0f;
                        float max = Math.max(0.0f, this.f30906S - x);
                        float max2 = Math.max(0.0f, this.f30907T - y);
                        boolean z3 = max2 >= C1357a0.m37534p() && max2 >= max - C1357a0.m37534p();
                        if (max >= C1357a0.m37534p() && !z3) {
                            z = true;
                        }
                        if (!z && !z3) {
                            z = this.f30910W;
                            z3 = this.f30909V;
                        }
                        if (z || z3) {
                            if (this.f30910W || this.f30909V) {
                                f = max;
                            } else {
                                this.f30906S = x;
                                this.f30907T = y;
                                max2 = 0.0f;
                            }
                            this.f30910W = z;
                            this.f30909V = z3;
                            m8392g();
                            if (!C1379j0.m37307r(getContext()).m14529V0().m6892h1(-f, -max2)) {
                                this.f30916c0 = true;
                            }
                        }
                    }
                }
                this.f30906S = x;
                this.f30907T = y;
            }
        } else if (this.f30912a0) {
            if (this.f30908U) {
                m8389j(false, false);
            } else {
                m8391h();
            }
            setIsDown(false);
        }
        return true;
    }

    @Override
    public void mo6863r1(boolean z) {
        m8388k(z, this.f30911a);
    }

    public void setHasTouchControls(boolean z) {
        if (this.f30911a != z) {
            this.f30911a = z;
            if (z) {
                C4868i.m24726c2().m24593t(this);
            } else {
                C4868i.m24726c2().m24811Q3(this);
            }
            invalidate();
        }
    }

    public void setSendFactor(float f) {
        if (this.f30904Q != f) {
            this.f30904Q = f;
            invalidate();
        }
    }
}
