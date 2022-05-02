package p292ud;

import ad.GestureDetector$OnGestureListenerC0256a;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import be.C1357a0;
import be.C1359b;
import be.C1379j0;
import be.C1410y;
import gd.C4665i6;
import gd.C4779t2;
import ge.C4868i;
import me.C6858d0;
import me.C6993p1;
import me.C6994p2;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p038ce.View$OnClickListenerC2971rh;
import p051db.C3950k;
import p108hb.C5069h;
import p156kd.C6246h;
import p174m3.AbstractC6689s;
import p174m3.C6591e2;
import p187n4.AbstractC7230t;
import p193nb.C7321e;
import p291uc.C9565i1;
import p291uc.C9634q0;
import p350yd.C10536ab;
import p350yd.C10756j9;
import p350yd.C10930q6;
import p364zd.C11524j;
import td.AbstractC9323v4;
import td.View$OnClickListenerC9170d1;

@TargetApi(16)
public class C9746h0 extends AbstractC9732d implements AbstractView$OnTouchListenerC7889a.AbstractC7897h, C10756j9.AbstractC10759c, C3950k.AbstractC3952b {
    public boolean f31714A0;
    public boolean f31716C0;
    public float f31717D0;
    public float f31720G0;
    public boolean f31721H0;
    public C9565i1 f31722I0;
    public boolean f31723J0;
    public View$OnClickListenerC2971rh f31724K0;
    public C9565i1 f31725L0;
    public final AbstractView$OnTouchListenerC7889a f31726M;
    public float f31727M0;
    public float f31729N0;
    public C10930q6 f31730O;
    public boolean f31731O0;
    public TdApi.File f31732P;
    public AbstractC7230t f31733Q;
    public C6246h f31734R;
    public boolean f31735S;
    public C6994p2 f31736T;
    public C6858d0 f31737U;
    public View f31738V;
    public C9742f0 f31739W;
    public C6993p1 f31740X;
    public AbstractC6689s f31741Y;
    public C9749c f31742Z;
    public C6858d0 f31743a0;
    public TextureView f31744b0;
    public C9742f0 f31745c0;
    public C6993p1 f31746d0;
    public boolean f31747e0;
    public C9748b f31748f0;
    public C3950k f31752j0;
    public boolean f31754l0;
    public C3950k f31755m0;
    public boolean f31756n0;
    public float f31757o0;
    public boolean f31758p0;
    public float f31759q0;
    public float f31760r0;
    public boolean f31761s0;
    public float f31762t0;
    public C3950k f31763u0;
    public boolean f31764v0;
    public boolean f31765w0;
    public Bitmap f31766x0;
    public Bitmap f31767y0;
    public boolean f31768z0;
    public int f31749g0 = 0;
    public boolean f31750h0 = true;
    public float f31751i0 = 1.0f;
    public boolean f31753k0 = true;
    public float f31715B0 = 1.0f;
    public long f31718E0 = -1;
    public long f31719F0 = -1;
    public final HandlerC9750d f31728N = new HandlerC9750d(this);

    public class C9747a implements C3950k.AbstractC3952b {
        public final float f31769M;
        public final float f31770N;
        public final C9748b f31772a;
        public final float f31773b;
        public final int f31774c;

        public C9747a(C9748b bVar, float f, int i, float f2, float f3) {
            this.f31772a = bVar;
            this.f31773b = f;
            this.f31774c = i;
            this.f31769M = f2;
            this.f31770N = f3;
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            this.f31772a.setAlpha(this.f31773b * f);
            int i2 = this.f31774c;
            if (i2 == 1) {
                float f3 = (f * 0.32f) + 0.68f;
                this.f31772a.setScaleX(f3);
                this.f31772a.setScaleY(f3);
            } else if (i2 == 2) {
                float f4 = (f * 0.9f) + 0.1f;
                this.f31772a.setScaleX(f4);
                this.f31772a.setScaleY(f4);
            } else if (i2 == 3 || i2 == 4) {
                float f5 = (0.110000014f * f) + 0.89f;
                this.f31772a.setScaleY(f5);
                this.f31772a.setScaleY(f5);
                C9748b bVar = this.f31772a;
                float f6 = this.f31769M;
                bVar.setTranslationX(f6 + ((this.f31770N - f6) * (1.0f - f)));
            }
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
            if (this.f31772a != C9746h0.this.f31748f0) {
                C9746h0.this.f31742Z.removeView(this.f31772a);
            }
        }
    }

    public static class C9748b extends C6858d0 {
        public C3950k f31775R;
        public float f31776S;
        public Bitmap f31777T;
        public float f31778U;
        public float f31779V;

        public C9748b(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public void m7216D1(Bitmap bitmap) {
            this.f31777T = bitmap;
            invalidate();
        }

        public void m7215E1(float f) {
            if (this.f31778U != f) {
                this.f31778U = f;
                invalidate();
            }
        }

        public void m7214F1(C3950k kVar, float f) {
            this.f31775R = kVar;
            this.f31776S = f;
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i;
            C1359b.m37499w(this, canvas, this.f31777T);
            if (this.f31778U != 0.0f) {
                RectF a0 = C1410y.m37053a0();
                float i2 = C1357a0.m37544i(1.5f);
                a0.set(i2, i2, getMeasuredWidth() - i, getMeasuredHeight() - i);
                canvas.drawArc(a0, -90.0f, (360.0f - this.f31779V) * this.f31778U, false, C1410y.m37076F0());
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            C3950k kVar = this.f31775R;
            if (kVar != null) {
                kVar.m29546i(this.f31776S);
                this.f31775R = null;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            this.f31779V = (C1410y.m37076F0().getStrokeWidth() / ((int) ((getMeasuredWidth() / 2) * 6.283185307179586d))) * 360.0f;
        }
    }

    public static class C9749c extends FrameLayoutFix implements C3950k.AbstractC3952b, GestureDetector$OnGestureListenerC0256a.AbstractC0257a {
        public GestureDetector$OnGestureListenerC0256a f31780M;
        public C3950k f31781N;
        public float f31782O;
        public float f31783P;
        public float f31784Q;
        public float f31785R;
        public int f31786S;
        public float f31787T = -1.0f;
        public float f31788U = -1.0f;
        public boolean f31789V;
        public C9746h0 f31790W;
        public float f31791a0;
        public float f31792b0;
        public float f31793c0;
        public float f31794d0;
        public boolean f31795e0;

        public C9749c(Context context) {
            super(context);
            this.f31780M = new GestureDetector$OnGestureListenerC0256a(context, this);
        }

        public final void m7213C1(int i, float f) {
            int i2;
            float f2;
            C6858d0 d0Var = this.f31790W.f31743a0;
            if (d0Var != null) {
                this.f31786S = i;
                C3950k kVar = this.f31781N;
                if (kVar == null) {
                    this.f31781N = new C3950k(0, this, C2057b.f7280b, 180L, 0.0f);
                } else {
                    kVar.m29543l(0.0f);
                }
                this.f31782O = d0Var.getTranslationX();
                this.f31783P = d0Var.getTranslationY();
                ViewGroup viewGroup = (ViewGroup) d0Var.getParent();
                int measuredWidth = viewGroup.getMeasuredWidth();
                int measuredHeight = viewGroup.getMeasuredHeight();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d0Var.getLayoutParams();
                if (C9746h0.m7287F0(i)) {
                    i2 = (measuredWidth - C9746h0.m7293B0()) - layoutParams.rightMargin;
                } else {
                    i2 = layoutParams.leftMargin;
                }
                float f3 = i2;
                if (C9746h0.m7289E0(i)) {
                    f2 = (measuredHeight - C9746h0.m7293B0()) - layoutParams.bottomMargin;
                } else {
                    f2 = layoutParams.topMargin;
                }
                this.f31784Q = f3 - d0Var.getLeft();
                this.f31785R = f2 - d0Var.getTop();
                this.f31781N.m29546i(1.0f);
            }
        }

        public int m7212D1() {
            C6858d0 d0Var = this.f31790W.f31743a0;
            if (d0Var == null) {
                return 53;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d0Var.getLayoutParams();
            if (d0Var.getParent() == null) {
                return layoutParams.gravity;
            }
            float left = d0Var.getLeft() + d0Var.getTranslationX() + (d0Var.getMeasuredWidth() / 2);
            float top = d0Var.getTop() + d0Var.getTranslationY() + (d0Var.getMeasuredHeight() / 2);
            ViewGroup viewGroup = (ViewGroup) d0Var.getParent();
            int i = left < ((float) (viewGroup.getMeasuredWidth() / 2)) ? 3 : 5;
            int A0 = layoutParams.topMargin - C9746h0.m7295A0();
            return top < ((float) (A0 + ((viewGroup.getMeasuredHeight() - A0) / 2))) ? i | 48 : i | 80;
        }

        public void m7211E1(boolean r4, boolean r5) {
            throw new UnsupportedOperationException("Method not decompiled: p292ud.C9746h0.C9749c.m7211E1(boolean, boolean):void");
        }

        public final C6858d0 m7210F1(float f, float f2) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if ((childAt instanceof C6858d0) && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f) {
                    float left = childAt.getLeft() + childAt.getTranslationX();
                    float top = childAt.getTop() + childAt.getTranslationY();
                    if (f >= left && f <= left + childAt.getMeasuredWidth() && f2 >= top && f2 <= top + childAt.getMeasuredHeight()) {
                        C3950k kVar = this.f31781N;
                        if (kVar != null && kVar.m29533v()) {
                            this.f31781N.m29544k();
                        }
                        return (C6858d0) childAt;
                    }
                }
            }
            return null;
        }

        public void m7209G1() {
            if (this.f31790W.f31743a0 != null) {
                m7207J1(false, false, false);
                C3950k kVar = this.f31781N;
                if (kVar == null || !kVar.m29533v()) {
                    this.f31790W.m7259Z(m7212D1());
                    return;
                }
                this.f31781N.m29544k();
                this.f31790W.m7259Z(this.f31786S);
            }
        }

        public void m7208I1(C9746h0 h0Var) {
            this.f31790W = h0Var;
        }

        public final void m7207J1(boolean z, boolean z2, boolean z3) {
            if (this.f31789V != z) {
                this.f31789V = z;
                if (!z) {
                    m7211E1(z2, z3);
                }
            }
        }

        public final void m7206L1(float f, float f2) {
            this.f31790W.m7251e1(f, f2);
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            if (i == 0) {
                float f3 = this.f31782O;
                float f4 = f3 + ((this.f31784Q - f3) * f);
                float f5 = this.f31783P;
                m7206L1(f4, f5 + ((this.f31785R - f5) * f));
            }
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
            if (i == 0) {
                this.f31790W.m7259Z(this.f31786S);
            }
        }

        @Override
        public boolean mo7205o7(float r18, float r19) {
            throw new UnsupportedOperationException("Method not decompiled: p292ud.C9746h0.C9749c.mo7205o7(float, float):boolean");
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            boolean z = true;
            if (action == 0) {
                this.f31787T = motionEvent.getX();
                float y = motionEvent.getY();
                this.f31788U = y;
                if (m7210F1(this.f31787T, y) == null) {
                    z = false;
                }
                this.f31795e0 = z;
                this.f31780M.m41997a(motionEvent);
                return false;
            } else if (action != 1) {
                if (action == 2) {
                    float x = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    if (this.f31795e0 && this.f31790W.f31743a0 != null && !this.f31789V && Math.max(Math.abs(x - this.f31787T), Math.abs(y2 - this.f31788U)) > C1357a0.m37537p()) {
                        this.f31791a0 = x;
                        this.f31792b0 = y2;
                        this.f31793c0 = this.f31790W.f31743a0.getTranslationX();
                        this.f31794d0 = this.f31790W.f31743a0.getTranslationY();
                        m7207J1(true, false, false);
                        return true;
                    }
                } else if (action == 3) {
                    m7207J1(false, true, false);
                    this.f31780M.m41997a(motionEvent);
                    return false;
                }
                return this.f31789V;
            } else {
                m7207J1(false, true, true);
                this.f31780M.m41997a(motionEvent);
                return false;
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 1) {
                this.f31780M.m41997a(motionEvent);
                m7207J1(false, true, true);
            } else if (action != 2) {
                if (action == 3) {
                    this.f31780M.m41997a(motionEvent);
                    m7207J1(false, true, false);
                }
            } else if (this.f31789V && this.f31795e0) {
                this.f31780M.m41997a(motionEvent);
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                m7206L1(this.f31793c0 + (x - this.f31791a0), this.f31794d0 + (y - this.f31792b0));
            }
            return false;
        }
    }

    public static class HandlerC9750d extends Handler {
        public final C9746h0 f31796a;

        public HandlerC9750d(C9746h0 h0Var) {
            super(Looper.getMainLooper());
            this.f31796a = h0Var;
        }

        @Override
        public void handleMessage(Message message) {
            this.f31796a.m7270Q0(message);
        }
    }

    public C9746h0(AbstractView$OnTouchListenerC7889a aVar) {
        this.f31726M = aVar;
        C10536ab.m4667o1().m4636w2().m7030p(this);
    }

    public static int m7295A0() {
        return C1357a0.m37544i(11.0f);
    }

    public static int m7293B0() {
        return C1357a0.m37544i(111.0f);
    }

    public static boolean m7289E0(int i) {
        return (i & 112) == 80;
    }

    public static boolean m7287F0(int i) {
        return (i & 7) == 5;
    }

    public void m7285G0(View view) {
        if (this.f31654c != null) {
            C10536ab.m4667o1().m4636w2().m7105H0(this.f31653b, this.f31654c, null);
        }
    }

    public static void m7266T0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(C1357a0.m37544i(1.0f));
            view.setTranslationZ(C1357a0.m37544i(1.0f));
        }
    }

    @Override
    public void mo7294B(C10930q6 q6Var, TdApi.Message message, boolean z, boolean z2, C10930q6 q6Var2, int i) {
        float f;
        if (this.f31735S) {
            this.f31766x0.eraseColor(0);
            m7291D0();
            f = this.f31720G0;
        } else {
            f = 0.0f;
        }
        m7234p1(null, false, false);
        m7272P0();
        this.f31714A0 = true;
        m7233q0();
        m7261X0(q6Var, C4779t2.m25495j1(message));
        m7244j1(((TdApi.MessageVideoNote) message.content).videoNote);
        m7222w0(z, z2, f);
        m7235p0();
        m7253d1(false);
    }

    public float m7292C0() {
        return this.f31720G0;
    }

    public final void m7291D0() {
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        Bitmap bitmap3 = (!this.f31765w0 || (bitmap = this.f31766x0) == null || bitmap.isRecycled()) ? null : this.f31766x0;
        C6993p1 p1Var = this.f31740X;
        if (!this.f31754l0) {
            bitmap2 = bitmap3;
        }
        p1Var.setOverlayBitmap(bitmap2);
    }

    public final boolean m7283H0() {
        throw new UnsupportedOperationException("Method not decompiled: p292ud.C9746h0.m7283H0():boolean");
    }

    public final FrameLayout.LayoutParams m7281I0() {
        int B0 = m7293B0();
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(B0, B0, C4868i.m24727c2().m24576v1());
        t1.topMargin = View$OnClickListenerC9170d1.m10065c3(true) + View$OnClickListenerC9170d1.getPlayerSize() + m7295A0();
        int A0 = m7295A0();
        t1.leftMargin = A0;
        t1.bottomMargin = A0;
        t1.rightMargin = A0;
        return t1;
    }

    public void m7279J0(long j, long j2) {
        TdApi.Message message = this.f31654c;
        if (message != null && message.chatId == j && message.f25409id == j2 && this.f31722I0 != null) {
            m7283H0();
        }
    }

    public void m7278K0() {
        if (this.f31654c != null && this.f31722I0 != null) {
            m7249g0(true, false);
        }
    }

    public final void m7277L0() {
        AbstractC6689s sVar = this.f31741Y;
        if (sVar != null) {
            long g = sVar.mo19268g();
            long Q = this.f31741Y.mo19293Q();
            if (!(g == -9223372036854775807L || Q == -9223372036854775807L)) {
                m7246h1(g != 0 ? C5069h.m24090d(((float) Q) / ((float) g)) : 0.0f, Q, g);
            }
        }
        if (this.f31716C0) {
            long u = C7389v0.m16578u(this.f31754l0 ? m7293B0() : C4665i6.m26601ca(), this.f31719F0);
            HandlerC9750d dVar = this.f31728N;
            dVar.sendMessageDelayed(Message.obtain(dVar, 1), u);
        }
    }

    public final void m7276M0() {
        Log.m14716v((int) Log.TAG_VIDEO, "onTargetFound, awaitingCurrentView: %b", Boolean.valueOf(this.f31721H0));
        if (this.f31721H0) {
            m7235p0();
            this.f31721H0 = false;
            return;
        }
        m7258Z0(false, true);
    }

    public final void m7275N0() {
        Log.m14716v((int) Log.TAG_VIDEO, "onTargetLost", new Object[0]);
        m7258Z0(true, true);
    }

    @Override
    public void mo6985N2(int i) {
        AbstractC6689s sVar = this.f31741Y;
        if (sVar != null) {
            sVar.mo19276d(C9773p0.m7047i0(false, i));
        }
    }

    @Override
    public void mo6938O0(int i, boolean z) {
    }

    public final void m7272P0() {
        if (!this.f31735S) {
            if (this.f31766x0 == null) {
                this.f31766x0 = Bitmap.createBitmap(C1357a0.m37543j(200.0f, 2.0f), C1357a0.m37543j(200.0f, 2.0f), Bitmap.Config.ARGB_8888);
                this.f31767y0 = Bitmap.createBitmap(C1357a0.m37543j(111.0f, 2.0f), C1357a0.m37543j(111.0f, 2.0f), Bitmap.Config.ARGB_8888);
            }
            if (this.f31736T == null) {
                this.f31736T = new C6994p2(this.f31726M);
                FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-1, -1);
                s1.topMargin = View$OnClickListenerC9170d1.m10065c3(true);
                this.f31736T.setLayoutParams(s1);
                this.f31726M.addToNavigation(this.f31736T);
            }
            if (this.f31737U == null) {
                int ca2 = C4665i6.m26601ca();
                C6858d0 d0Var = new C6858d0(this.f31726M);
                this.f31737U = d0Var;
                d0Var.setAlpha(this.f31762t0);
                this.f31737U.setLayoutParams(FrameLayoutFix.m18008s1(ca2, ca2));
                TextureView textureView = new TextureView(this.f31726M);
                this.f31738V = textureView;
                textureView.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
                this.f31737U.addView(this.f31738V);
                C6993p1 p1Var = new C6993p1(this.f31726M);
                this.f31740X = p1Var;
                p1Var.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
                this.f31737U.addView(this.f31740X);
                C9742f0 f0Var = new C9742f0(this.f31726M);
                this.f31739W = f0Var;
                f0Var.m7300b(this);
                this.f31739W.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
                this.f31737U.addView(this.f31739W);
                this.f31736T.addView(this.f31737U);
            }
            if (this.f31742Z == null) {
                C9749c cVar = new C9749c(this.f31726M);
                this.f31742Z = cVar;
                cVar.m7208I1(this);
                this.f31742Z.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
            }
            if (this.f31743a0 == null) {
                C6858d0 d0Var2 = new C6858d0(this.f31726M);
                this.f31743a0 = d0Var2;
                d0Var2.setLayoutParams(m7281I0());
                m7227s1();
                this.f31743a0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        C9746h0.this.m7285G0(view);
                    }
                });
                this.f31743a0.setBackgroundColor(C11524j.m148w());
                this.f31743a0.setTransparentOutline(false);
                m7266T0(this.f31743a0);
                TextureView textureView2 = new TextureView(this.f31726M);
                this.f31744b0 = textureView2;
                textureView2.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
                this.f31743a0.addView(this.f31744b0);
                C6993p1 p1Var2 = new C6993p1(this.f31726M);
                this.f31746d0 = p1Var2;
                p1Var2.setOverlayBitmap(this.f31766x0);
                this.f31746d0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
                this.f31743a0.addView(this.f31746d0);
                C9742f0 f0Var2 = new C9742f0(this.f31726M);
                this.f31745c0 = f0Var2;
                f0Var2.m7300b(this);
                this.f31745c0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
                this.f31743a0.addView(this.f31745c0);
                this.f31742Z.addView(this.f31743a0);
            }
            if (this.f31742Z.getParent() == null) {
                this.f31726M.m14517Z(this.f31742Z, false);
            }
            if (this.f31741Y == null) {
                this.f31741Y = C7389v0.m16659Z1(this.f31726M, true);
                m7262W0();
                this.f31741Y.mo19295P(this);
                this.f31741Y.mo19361f(this.f31715B0);
                View view = this.f31738V;
                if (view instanceof SurfaceView) {
                    this.f31741Y.mo19351o((SurfaceView) view);
                } else {
                    this.f31741Y.mo19376O((TextureView) view);
                }
            }
            this.f31735S = true;
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            m7232q1(f);
        } else if (i == 1) {
            m7242k1(f);
        } else if (i == 2) {
            m7250f1(f);
        } else if (i == 3) {
            m7257a1(f);
        }
    }

    public final void m7270Q0(Message message) {
        int i = message.what;
        if (i == 0) {
            Object[] objArr = (Object[]) message.obj;
            mo3954R2((C10930q6) objArr[0], message.arg1, message.arg2, (TdApi.File) objArr[1]);
        } else if (i == 1) {
            m7277L0();
        } else if (i == 2) {
            mo3953V0((TdApi.File) message.obj);
        }
    }

    @Override
    public void mo3954R2(C10930q6 q6Var, int i, int i2, TdApi.File file) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HandlerC9750d dVar = this.f31728N;
            dVar.sendMessage(Message.obtain(dVar, 0, i, i2, new Object[]{q6Var, file}));
            return;
        }
        TdApi.File file2 = this.f31732P;
        if (file2 == null || file2.f25376id != i || this.f31653b != q6Var) {
            return;
        }
        if (i2 == 0) {
            C10536ab.m4667o1().m4636w2().m7061d1(false);
        } else if (i2 == 2 && file != null) {
            C7321e.m16907u(file, file2);
            m7236o1(q6Var, file.f25376id);
            m7240m1(false);
            C10536ab.m4667o1().m4636w2().m7103I0(q6Var, this.f31654c, false);
        }
    }

    public void m7268S0(C9565i1 i1Var, View$OnClickListenerC2971rh rhVar) {
        this.f31724K0 = rhVar;
        m7234p1(i1Var, true, false);
    }

    @Override
    public void mo6929S4() {
        m7345m();
    }

    public final void m7264U0(boolean z) {
        if (this.f31765w0 != z) {
            this.f31765w0 = z;
            m7291D0();
            m7230r0();
        }
    }

    @Override
    public void mo3953V0(TdApi.File file) {
        TdApi.File file2;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HandlerC9750d dVar = this.f31728N;
            dVar.sendMessage(Message.obtain(dVar, 2, file));
        } else if (file != null && (file2 = this.f31732P) != null && file2.f25376id == file.f25376id) {
            C7321e.m16907u(file, file2);
            this.f31745c0.m7299c(C4779t2.m25432s1(file));
        }
    }

    public final void m7262W0() {
        if (this.f31741Y != null) {
            C10536ab.m4667o1().m4636w2().m7093N0().m7309i(this.f31741Y, 3);
        }
    }

    @Override
    public void mo6984X(C10930q6 q6Var, TdApi.Message message) {
        if (m7350j(q6Var, message)) {
            m7262W0();
        }
    }

    public final void m7261X0(C10930q6 q6Var, TdApi.File file) {
        TdApi.File file2 = this.f31732P;
        if (file2 != null || file != null) {
            boolean z = this.f31730O == q6Var;
            int L0 = C7321e.m16996L0(file2);
            int L02 = C7321e.m16996L0(file);
            if (!z || L0 != L02) {
                if (L0 != 0) {
                    this.f31730O.m2413i5().m4030D0(L0, this);
                }
                this.f31730O = q6Var;
                this.f31732P = file;
                if (L02 != 0) {
                    q6Var.m2413i5().m4034B0(file, this);
                }
                if (file == null) {
                    m7236o1(null, -1);
                    m7240m1(false);
                } else if (C4779t2.m25599T2(file)) {
                    m7236o1(q6Var, file.f25376id);
                    m7240m1(false);
                } else {
                    m7236o1(null, -1);
                    m7240m1(true);
                    q6Var.m2413i5().m3975p(file);
                }
            } else if (C4779t2.m25599T2(file)) {
                this.f31741Y.mo19780c(0L);
                this.f31741Y.mo19341v(this.f31714A0);
                long j = this.f31719F0;
                m7246h1(0.0f, j, j);
                m7228s0();
            } else {
                q6Var.m2413i5().m3975p(file);
            }
        }
    }

    public final void m7260Y(int i, float f) {
        C9748b bVar;
        int i2;
        Bitmap x0 = m7221x0(this.f31764v0, this.f31767y0);
        if (x0 != null) {
            C9748b bVar2 = this.f31748f0;
            if (bVar2 == null) {
                bVar = new C9748b(this.f31726M);
                this.f31748f0 = bVar;
            } else if (bVar2.getAlpha() == 0.0f) {
                bVar = this.f31748f0;
            } else {
                bVar = new C9748b(this.f31726M);
            }
            C9748b bVar3 = bVar;
            float alpha = this.f31743a0.getAlpha();
            bVar3.setAlpha(alpha);
            bVar3.setScaleX(this.f31743a0.getScaleX());
            bVar3.setScaleY(this.f31743a0.getScaleY());
            bVar3.setLayoutParams(FrameLayoutFix.m18008s1(m7293B0(), m7293B0()));
            m7266T0(bVar3);
            float left = this.f31743a0.getLeft() + this.f31743a0.getTranslationX();
            float top = this.f31743a0.getTop() + this.f31743a0.getTranslationY();
            if (m7287F0(this.f31742Z.m7212D1())) {
                i2 = this.f31742Z.getMeasuredWidth() + m7295A0();
            } else {
                i2 = (-m7293B0()) - m7295A0();
            }
            bVar3.setTranslationX(left);
            bVar3.setTranslationY(top);
            bVar3.m7216D1(x0);
            bVar3.m7215E1(f);
            C3950k kVar = new C3950k(0, new C9747a(bVar3, alpha, i, left, i2), C2057b.f7280b, i == 3 ? 120L : 180L, 1.0f);
            if (bVar3.getParent() == null) {
                bVar3.m7214F1(kVar, 0.0f);
                this.f31742Z.addView(bVar3, 0);
                return;
            }
            kVar.m29546i(0.0f);
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public final void m7259Z(int i) {
        C6858d0 d0Var = this.f31743a0;
        if (d0Var != null) {
            this.f31759q0 = 0.0f;
            this.f31760r0 = 0.0f;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d0Var.getLayoutParams();
            if (!(m7287F0(layoutParams.gravity) == m7287F0(i) && m7289E0(layoutParams.gravity) == m7289E0(i))) {
                layoutParams.gravity = i;
                this.f31743a0.setLayoutParams(layoutParams);
                C4868i.m24727c2().m24612q5(i);
            }
            m7227s1();
        }
    }

    public final void m7258Z0(boolean z, boolean z2) {
        if (this.f31754l0 != z) {
            this.f31754l0 = z;
            Log.m14721i((int) Log.TAG_VIDEO, "inPipMode -> %b, animated: %b", Boolean.valueOf(z), Boolean.valueOf(z2));
            m7233q0();
            m7243k0(z2);
            if (this.f31735S) {
                m7238n0(z2);
            }
        }
    }

    public final void m7257a1(float f) {
        if (this.f31762t0 != f) {
            this.f31762t0 = f;
            if (this.f31735S) {
                this.f31737U.setAlpha(f);
            }
        }
    }

    public final void m7256b1(int i, int i2) {
        this.f31736T.m18135F1(i, i2);
    }

    public final void m7255c1(C9565i1 i1Var) {
        C9565i1 i1Var2 = this.f31725L0;
        if (i1Var2 != i1Var) {
            Object[] objArr = new Object[2];
            String str = "null";
            objArr[0] = i1Var2 != null ? i1Var2.getClass().getSimpleName() : str;
            if (i1Var != null) {
                str = i1Var.getClass().getSimpleName();
            }
            objArr[1] = str;
            Log.m14721i((int) Log.TAG_VIDEO, "ownedOverlay %s -> %s", objArr);
            C9565i1 i1Var3 = this.f31725L0;
            if (i1Var3 != null) {
                m7225u0(i1Var3);
            }
            this.f31725L0 = i1Var;
            if (i1Var != null) {
                m7254d0(i1Var);
            }
        }
    }

    public final void m7254d0(C9565i1 i1Var) {
        C9634q0 overlayView = i1Var.getOverlayView();
        i1Var.removeView(overlayView);
        this.f31736T.addView(overlayView);
        overlayView.setTranslationX(this.f31727M0);
        overlayView.setTranslationY(this.f31729N0);
    }

    public final void m7253d1(boolean z) {
        if (this.f31758p0 != z) {
            this.f31758p0 = z;
            m7238n0(!z);
        }
    }

    @Override
    public void mo6904d6() {
        if (this.f31714A0) {
            this.f31731O0 = true;
            mo7218z(false);
        }
    }

    @Override
    public void mo7252e() {
        Log.m14721i((int) Log.TAG_VIDEO, "onRenderedFirstFrame", new Object[0]);
        this.f31768z0 = true;
        m7237n1(true, true);
    }

    public final void m7251e1(float f, float f2) {
        if (this.f31743a0 == null) {
            return;
        }
        if (this.f31759q0 != f || this.f31760r0 != f2) {
            this.f31759q0 = f;
            this.f31760r0 = f2;
            m7227s1();
        }
    }

    public final void m7250f1(float f) {
        if (this.f31757o0 != f) {
            this.f31757o0 = f;
            m7227s1();
        }
    }

    public final void m7249g0(boolean z, boolean z2) {
        AbstractC9323v4<?> v4Var = this.f31724K0;
        C9565i1 i1Var = null;
        if (v4Var == null) {
            v4Var = this.f31726M.m14551P1() != null ? this.f31726M.m14551P1().m9762F() : null;
        }
        boolean z3 = this.f31722I0 != null && v4Var != null && (v4Var instanceof View$OnClickListenerC2971rh) && v4Var.mo9464C9() == this.f31654c.chatId && m7283H0();
        if (this.f31723J0 != z3 || z2) {
            this.f31723J0 = z3;
            if (!(!z3 || this.f31654c == null || this.f31736T == null)) {
                i1Var = this.f31722I0;
            }
            m7255c1(i1Var);
            Log.m14721i((int) Log.TAG_VIDEO, "currentViewVisible -> %b, callListeners: %b", Boolean.valueOf(z3), Boolean.valueOf(z));
            m7243k0(true);
            if (!z) {
                return;
            }
            if (z3) {
                m7276M0();
            } else {
                m7275N0();
            }
        }
    }

    public final void m7248g1(boolean z, boolean z2) {
        if (this.f31756n0 != z || !z2) {
            this.f31756n0 = z;
            float f = z ? 1.0f : 0.0f;
            if (z2) {
                if (this.f31755m0 == null) {
                    float f2 = this.f31757o0;
                    if (f2 != f) {
                        this.f31755m0 = new C3950k(2, this, C2057b.f7280b, 180L, f2);
                    } else {
                        return;
                    }
                }
                this.f31755m0.m29546i(f);
                return;
            }
            C3950k kVar = this.f31755m0;
            if (kVar != null) {
                kVar.m29543l(f);
            }
            m7250f1(f);
        }
    }

    public void m7247h0() {
        if (this.f31654c != null && this.f31722I0 != null) {
            m7249g0(true, false);
        }
    }

    public final void m7246h1(float f, long j, long j2) {
        if (this.f31717D0 != f || this.f31718E0 != j || this.f31719F0 != j2) {
            this.f31717D0 = f;
            this.f31719F0 = j2;
            if (this.f31718E0 != j) {
                this.f31718E0 = j;
                if (this.f31654c != null) {
                    C9773p0 w2 = C10536ab.m4667o1().m4636w2();
                    C10930q6 q6Var = this.f31653b;
                    TdApi.Message message = this.f31654c;
                    w2.m7073X0(q6Var, message.chatId, message.f25409id, C4779t2.m25460o1(message), f, j, j2, false);
                }
            }
            m7232q1(C5069h.m24090d(f));
        }
    }

    public final void m7245i1(boolean z) {
        if (this.f31764v0 != z) {
            this.f31764v0 = z;
            if (this.f31735S) {
                if (this.f31714A0) {
                    m7221x0(!z, this.f31766x0);
                }
                m7237n1(false, true);
                Object obj = z ? this.f31744b0 : this.f31738V;
                if (obj instanceof SurfaceView) {
                    this.f31741Y.mo19351o((SurfaceView) obj);
                } else {
                    this.f31741Y.mo19376O((TextureView) obj);
                }
            }
        }
    }

    public final void m7244j1(TdApi.VideoNote videoNote) {
        TdApi.Thumbnail thumbnail;
        C6246h hVar = this.f31734R;
        int i = 0;
        int s = hVar != null ? hVar.mo20826s() : 0;
        if (!(videoNote == null || (thumbnail = videoNote.thumbnail) == null)) {
            i = thumbnail.file.f25376id;
        }
        if (s != i) {
            this.f31734R = C4665i6.m26600da(this.f31653b, videoNote);
            if (this.f31735S) {
                this.f31746d0.getReceiver().m20820G(this.f31734R);
            }
        }
    }

    public final void m7243k0(boolean z) {
        if (this.f31735S) {
            boolean z2 = this.f31723J0 && !this.f31754l0 && this.f31747e0;
            if (this.f31761s0 != z2) {
                this.f31761s0 = z2;
                Log.m14721i((int) Log.TAG_VIDEO, "isMainVisible -> %b", Boolean.valueOf(z2));
                float f = z2 ? 1.0f : 0.0f;
                if (!z || this.f31722I0 == null) {
                    C3950k kVar = this.f31763u0;
                    if (kVar != null) {
                        kVar.m29543l(f);
                    }
                    m7257a1(f);
                    return;
                }
                if (this.f31763u0 == null) {
                    float f2 = this.f31762t0;
                    if (f2 != f) {
                        this.f31763u0 = new C3950k(3, this, C2057b.f7280b, 138L, f2);
                    } else {
                        return;
                    }
                }
                this.f31763u0.m29546i(f);
            }
        }
    }

    public final void m7242k1(float f) {
        if (this.f31751i0 != f) {
            this.f31751i0 = f;
            this.f31746d0.setAlpha(f);
        }
    }

    public final void m7241l1(boolean z) {
        if (this.f31750h0 != z) {
            this.f31750h0 = z;
            m7230r0();
        }
    }

    public final void m7240m1(boolean z) {
        C9742f0 f0Var = this.f31745c0;
        if (f0Var != null) {
            f0Var.m7297e(z);
        }
    }

    @Override
    public void mo7239n(C6591e2 e2Var) {
        C1379j0.m37295y0(C7389v0.m16556z1(e2Var) ? R.string.VideoPlaybackUnsupported : R.string.RoundVideoPlaybackError, 0);
    }

    public final void m7238n0(boolean z) {
        m7248g1(this.f31754l0 && !this.f31758p0, z);
    }

    public final void m7237n1(boolean z, boolean z2) {
        if (this.f31747e0 != z) {
            this.f31747e0 = z;
            if (this.f31735S) {
                m7243k0(z2);
                m7241l1(!z);
            }
        }
    }

    public final void m7236o1(C10930q6 q6Var, int i) {
        this.f31733Q = i < 0 ? null : C7389v0.m16635f2(q6Var.m2188w6(), i);
        this.f31768z0 = false;
        m7237n1(false, false);
        AbstractC7230t tVar = this.f31733Q;
        if (tVar != null) {
            this.f31741Y.mo19379M(tVar);
            this.f31741Y.mo19280b();
        }
        m7246h1(0.0f, -1L, -1L);
    }

    @Override
    public void mo6871o6() {
        if (this.f31731O0) {
            this.f31731O0 = false;
            mo7218z(true);
        }
    }

    public final void m7235p0() {
        if (this.f31735S) {
            this.f31741Y.mo19341v(this.f31714A0 && (this.f31722I0 != null || !this.f31721H0));
            m7228s0();
        }
    }

    public final void m7234p1(C9565i1 i1Var, boolean z, boolean z2) {
        if (this.f31654c != null) {
            C9565i1 i1Var2 = this.f31722I0;
            if (i1Var2 != i1Var) {
                Object[] objArr = new Object[2];
                String str = "null";
                objArr[0] = i1Var2 != null ? i1Var2.getClass().getName() : str;
                if (i1Var != null) {
                    str = i1Var.getClass().getName();
                }
                objArr[1] = str;
                Log.m14721i((int) Log.TAG_VIDEO, "targetView %s -> %s", objArr);
                this.f31722I0 = i1Var;
            }
            m7249g0(z, z2);
        }
    }

    public final void m7233q0() {
        if (this.f31714A0) {
            m7264U0(false);
            m7245i1(this.f31754l0);
            return;
        }
        boolean z = this.f31764v0;
        if (z == this.f31754l0 || !this.f31735S) {
            m7264U0(false);
        } else if (!this.f31765w0) {
            m7264U0(m7221x0(z, this.f31766x0) != null);
            m7291D0();
            if (!this.f31765w0) {
                Log.m14721i((int) Log.TAG_VIDEO, "Warning: forcely switching output view", new Object[0]);
                m7245i1(this.f31754l0);
            }
        }
    }

    public final void m7232q1(float f) {
        if (this.f31720G0 != f) {
            this.f31720G0 = f;
            if (this.f31735S) {
                this.f31745c0.invalidate();
                this.f31739W.invalidate();
            }
        }
    }

    @Override
    public void mo7231r(C10930q6 q6Var, TdApi.Message message, boolean z) {
        m7226t0(1);
    }

    public final void m7230r0() {
        boolean z = this.f31750h0 || this.f31765w0;
        if (this.f31753k0 != z) {
            this.f31753k0 = z;
            float f = z ? 1.0f : 0.0f;
            if (z || this.f31757o0 == 0.0f) {
                C3950k kVar = this.f31752j0;
                if (kVar != null) {
                    kVar.m29543l(f);
                }
                m7242k1(f);
                return;
            }
            if (this.f31752j0 == null) {
                this.f31752j0 = new C3950k(1, this, C2057b.f7280b, 180L, this.f31751i0);
            }
            this.f31752j0.m29546i(f);
        }
    }

    public final void m7229r1(float f) {
        if (this.f31715B0 != f) {
            this.f31715B0 = f;
            AbstractC6689s sVar = this.f31741Y;
            if (sVar != null) {
                sVar.mo19361f(f);
            }
        }
    }

    public final void m7228s0() {
        boolean z = this.f31741Y != null && this.f31714A0;
        if (this.f31716C0 != z) {
            this.f31716C0 = z;
            Log.m14721i((int) Log.TAG_VIDEO, "progressTimerStarted -> %b", Boolean.valueOf(z));
            this.f31728N.removeMessages(1);
            m7277L0();
        }
    }

    public final void m7227s1() {
        float f;
        float f2;
        if (this.f31743a0 != null) {
            float y0 = m7219y0();
            if (this.f31757o0 != 1.0f) {
                float A0 = m7295A0() + m7293B0();
                if (!m7287F0(((FrameLayout.LayoutParams) this.f31743a0.getLayoutParams()).gravity)) {
                    A0 *= -1.0f;
                }
                f2 = A0 * (1.0f - this.f31757o0);
                f = 0.0f;
            } else {
                f2 = this.f31759q0;
                f = this.f31760r0;
            }
            this.f31743a0.setTranslationX(f2);
            this.f31743a0.setTranslationY(f);
            m7229r1(y0);
            this.f31743a0.setAlpha(this.f31757o0 * y0);
        }
    }

    public final void m7226t0(int i) {
        int i2;
        if (this.f31735S) {
            if (!(i == 0 || (i2 = this.f31749g0) == 0)) {
                this.f31749g0 = 0;
                i = i2;
            }
            m7255c1(null);
            Log.m14721i((int) Log.TAG_VIDEO, "closePlayer, mode: %d", Integer.valueOf(i));
            if (this.f31754l0) {
                if (i != 0) {
                    m7260Y(i, this.f31720G0);
                    this.f31742Z.m7209G1();
                }
                m7258Z0(false, false);
            }
            this.f31735S = false;
            this.f31726M.removeFromNavigation(this.f31736T);
            this.f31736T = null;
            this.f31737U = null;
            this.f31738V = null;
            this.f31739W = null;
            this.f31742Z.removeView(this.f31743a0);
            this.f31746d0.mo4501a3();
            m7241l1(true);
            this.f31746d0.getReceiver().m20820G(null);
            this.f31743a0 = null;
            m7261X0(null, null);
            AbstractC6689s sVar = this.f31741Y;
            if (sVar != null) {
                sVar.mo19282a();
                this.f31741Y = null;
            }
            m7228s0();
            this.f31765w0 = false;
        }
    }

    public final void m7225u0(C9565i1 i1Var) {
        C9634q0 overlayView = i1Var.getOverlayView();
        ((ViewGroup) overlayView.getParent()).removeView(overlayView);
        overlayView.setTranslationY(0.0f);
        overlayView.setTranslationX(0.0f);
        i1Var.addView(overlayView);
    }

    public final void m7224v0() {
        this.f31749g0 = 3;
        C10536ab.m4667o1().m4636w2().m7105H0(null, null, null);
    }

    @Override
    public void mo7223w(int i) {
        if (i == 4 && this.f31714A0 && this.f31733Q != null) {
            C10536ab.m4667o1().m4636w2().m7113D0();
        }
    }

    public final void m7222w0(boolean r12, boolean r13, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: p292ud.C9746h0.m7222w0(boolean, boolean, float):void");
    }

    public final Bitmap m7221x0(boolean z, Bitmap bitmap) {
        try {
            Object obj = z ? this.f31744b0 : this.f31738V;
            bitmap.eraseColor(0);
            if (obj instanceof SurfaceView) {
                return null;
            }
            if (this.f31768z0 || bitmap == this.f31767y0) {
                bitmap = ((TextureView) obj).getBitmap(bitmap);
            }
            m7291D0();
            return bitmap;
        } catch (OutOfMemoryError unused) {
            Log.m14711w((int) Log.TAG_VIDEO, "Not enough memory to allocate placeholder", new Object[0]);
            return null;
        }
    }

    @Override
    public boolean mo7220y(TdApi.Message message) {
        return message.content.getConstructor() == 963323014;
    }

    public final float m7219y0() {
        float min;
        float left = this.f31743a0.getLeft() + this.f31759q0;
        int measuredWidth = this.f31743a0.getMeasuredWidth();
        int measuredWidth2 = this.f31742Z.getMeasuredWidth();
        float f = measuredWidth;
        float f2 = 0.8f * f;
        if (left < 0.0f) {
            min = Math.min(1.0f, (-left) / f2);
        } else {
            float f3 = left + f;
            float f4 = measuredWidth2;
            if (f3 <= f4) {
                return 1.0f;
            }
            min = Math.min(1.0f, (f3 - f4) / f2);
        }
        return 1.0f - min;
    }

    @Override
    public void mo7218z(boolean z) {
        if (this.f31714A0 != z) {
            this.f31714A0 = z;
            AbstractC6689s sVar = this.f31741Y;
            if (sVar != null) {
                sVar.mo19341v(z);
            }
            m7233q0();
            m7228s0();
        }
    }

    public FrameLayoutFix m7217z0() {
        if (this.f31654c != null) {
            return this.f31742Z;
        }
        return null;
    }
}
