package vc;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import ce.a0;
import ce.j0;
import ce.y;
import db.g;
import eb.f;
import eb.k;
import he.i;
import he.m;
import kb.b;
import kb.c;
import org.thunderdog.challegram.R;
import ud.x2;

public class e4 extends View implements k.b, i.u, c, x2.f {
    public final f O;
    public final f P;
    public float Q;
    public Paint R;
    public float S;
    public float T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean f24929a;
    public boolean f24930a0;
    public b f24932b0;
    public boolean f24934c0;
    public final Drawable f24931b = ce.c.g(getResources(), R.drawable.deproko_baseline_send_24);
    public final Drawable f24933c = ce.c.g(getResources(), R.drawable.deproko_baseline_msg_voice_24);
    public final Drawable M = ce.c.g(getResources(), R.drawable.deproko_baseline_msg_video_24);
    public final Drawable N = ce.c.g(getResources(), R.drawable.baseline_search_24);

    public class a extends b {
        public a() {
        }

        @Override
        public void b() {
            if (e4.this.f24932b0 == this) {
                e4.this.j(true, false);
                e4.this.f24932b0 = null;
            }
        }
    }

    public e4(Context context) {
        super(context);
        DecelerateInterpolator decelerateInterpolator = db.b.f7287b;
        this.O = new f(0, this, decelerateInterpolator, 120L);
        this.P = new f(1, this, decelerateInterpolator, 180L);
        k(i.c2().o3(), false);
    }

    private Paint getIconPaint() {
        int L = j.L(R.id.theme_color_circleButtonRegularIcon);
        Paint paint = this.R;
        if (paint == null || paint.getColor() != L) {
            this.R = y.c(this.R, L);
        }
        return this.R;
    }

    private void setIsDown(boolean z10) {
        if (this.f24930a0 != z10) {
            this.f24930a0 = z10;
            if (z10) {
                i();
            } else {
                f();
            }
        }
    }

    @Override
    public void Q2() {
        i.c2().Q3(this);
    }

    @Override
    public void d1(View view, Rect rect) {
        rect.top += a0.i(8.0f);
        rect.bottom -= a0.i(8.0f);
    }

    public final void f() {
        b bVar = this.f24932b0;
        if (bVar != null) {
            bVar.c();
            this.f24932b0 = null;
        }
    }

    public final void g() {
        j0.r(getContext()).Z0().R0(this.V && this.f24930a0);
    }

    public final void h() {
        g.c(this);
        i.c2().t5(!this.O.h());
    }

    public final void i() {
        f();
        a aVar = new a();
        this.f24932b0 = aVar;
        postDelayed(aVar, 120L);
    }

    public final void j(boolean z10, boolean z11) {
        boolean z12;
        if (this.U != z10) {
            if (z10) {
                z12 = j0.r(getContext()).Z0().j1(this, false);
            } else {
                if (!this.f24934c0) {
                    j0.r(getContext()).Z0().U(z11);
                }
                z12 = true;
            }
            if (z12) {
                this.U = z10;
            } else if (z10) {
                setIsDown(false);
            }
        }
    }

    public void k(boolean z10, boolean z11) {
        this.O.p(z10, z11);
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        invalidate();
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int paddingLeft = getPaddingLeft() + (((measuredWidth - getPaddingLeft()) - getPaddingRight()) / 2);
        int i10 = measuredHeight / 2;
        float g10 = this.O.g();
        float g11 = this.P.g();
        Paint J = this.f24929a ? y.J() : getIconPaint();
        int alpha = J.getAlpha();
        float f11 = 1.0f - this.Q;
        if (f11 > 0.0f) {
            float f12 = 1.0f - g11;
            float f13 = f11 * f12;
            if (f13 > 0.0f) {
                float f14 = (f12 * 0.6f) + 0.4f;
                int i11 = (f14 > 1.0f ? 1 : (f14 == 1.0f ? 0 : -1));
                if (i11 != 0) {
                    canvas.save();
                    canvas.scale(f14, f14, paddingLeft, i10);
                }
                float f15 = i10;
                float f16 = alpha;
                J.setAlpha((int) (f16 * (1.0f - g10) * f13));
                float f17 = paddingLeft;
                ce.c.c(canvas, this.f24933c, f17, (int) ((((this.M.getMinimumHeight() / 2) + i10) * g10) + f15), J);
                J.setAlpha((int) (f16 * g10 * f13));
                ce.c.c(canvas, this.M, f17, (int) (f15 - (((this.M.getMinimumHeight() / 2) + i10) * f10)), J);
                if (i11 != 0) {
                    canvas.restore();
                }
            }
            float f18 = f11 * g11;
            if (f18 > 0.0f) {
                float f19 = (g11 * 0.6f) + 0.4f;
                int i12 = (f19 > 1.0f ? 1 : (f19 == 1.0f ? 0 : -1));
                if (i12 != 0) {
                    canvas.save();
                    canvas.scale(f19, f19, paddingLeft, i10);
                }
                J.setAlpha((int) (alpha * f18));
                ce.c.c(canvas, this.N, paddingLeft, i10, J);
                if (i12 != 0) {
                    canvas.restore();
                }
            }
        }
        J.setAlpha((int) (alpha * this.Q));
        ce.c.c(canvas, this.f24931b, paddingLeft, i10, J);
        J.setAlpha(alpha);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        if (!this.f24929a) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.S = motionEvent.getX();
            this.T = motionEvent.getY();
            this.V = false;
            this.W = false;
            this.f24934c0 = false;
            setIsDown(true);
        } else if (action != 1) {
            if (action != 2) {
                if (action == 3 && this.f24930a0) {
                    j(false, true);
                    setIsDown(false);
                }
            } else if (this.f24930a0) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (this.U && !this.f24934c0) {
                    boolean z11 = !j0.r(getContext()).Z0().c0();
                    this.f24934c0 = z11;
                    if (!z11) {
                        float f10 = 0.0f;
                        float max = Math.max(0.0f, this.S - x10);
                        float max2 = Math.max(0.0f, this.T - y10);
                        boolean z12 = max2 >= a0.p() && max2 >= max - a0.p();
                        if (max >= a0.p() && !z12) {
                            z10 = true;
                        }
                        if (!z10 && !z12) {
                            z10 = this.W;
                            z12 = this.V;
                        }
                        if (z10 || z12) {
                            if (this.W || this.V) {
                                f10 = max;
                            } else {
                                this.S = x10;
                                this.T = y10;
                                max2 = 0.0f;
                            }
                            this.W = z10;
                            this.V = z12;
                            g();
                            if (!j0.r(getContext()).Z0().g1(-f10, -max2)) {
                                this.f24934c0 = true;
                            }
                        }
                    }
                }
                this.S = x10;
                this.T = y10;
            }
        } else if (this.f24930a0) {
            if (this.U) {
                j(false, false);
            } else {
                h();
            }
            setIsDown(false);
        }
        return true;
    }

    @Override
    public void p1(boolean z10) {
        k(z10, this.f24929a);
    }

    public void setHasTouchControls(boolean z10) {
        if (this.f24929a != z10) {
            this.f24929a = z10;
            if (z10) {
                i.c2().t(this);
            } else {
                i.c2().Q3(this);
            }
            invalidate();
        }
    }

    public void setSendFactor(float f10) {
        if (this.Q != f10) {
            this.Q = f10;
            invalidate();
        }
    }

    @Override
    public void y4(boolean z10) {
        m.a(this, z10);
    }
}
