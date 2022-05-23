package vd;

import ae.j;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bd.a;
import ce.a0;
import ce.j0;
import ce.y;
import de.rh;
import eb.k;
import hd.i6;
import hd.t2;
import he.i;
import ld.h;
import m3.o2;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.d0;
import ne.p1;
import ne.p2;
import o4.s;
import ob.e;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import ud.d1;
import ud.v4;
import vc.h1;
import vc.p0;
import zd.h9;
import zd.o6;
import zd.ya;

@TargetApi(16)
public class g0 extends vd.d implements a.h, h9.c, k.b {
    public boolean A0;
    public boolean C0;
    public float D0;
    public float G0;
    public boolean H0;
    public h1 I0;
    public boolean J0;
    public rh K0;
    public h1 L0;
    public final org.thunderdog.challegram.a M;
    public float M0;
    public float N0;
    public o6 O;
    public boolean O0;
    public TdApi.File P;
    public s Q;
    public h R;
    public boolean S;
    public p2 T;
    public d0 U;
    public View V;
    public e0 W;
    public p1 X;
    public m3.s Y;
    public c Z;
    public d0 f25457a0;
    public TextureView f25458b0;
    public e0 f25459c0;
    public p1 f25460d0;
    public boolean f25461e0;
    public b f25462f0;
    public k f25466j0;
    public boolean f25468l0;
    public k f25469m0;
    public boolean f25470n0;
    public float f25471o0;
    public boolean f25472p0;
    public float f25473q0;
    public float f25474r0;
    public boolean f25475s0;
    public float f25476t0;
    public k f25477u0;
    public boolean f25478v0;
    public boolean f25479w0;
    public Bitmap f25480x0;
    public Bitmap f25481y0;
    public boolean f25482z0;
    public int f25463g0 = 0;
    public boolean f25464h0 = true;
    public float f25465i0 = 1.0f;
    public boolean f25467k0 = true;
    public float B0 = 1.0f;
    public long E0 = -1;
    public long F0 = -1;
    public final d N = new d(this);

    public class a implements k.b {
        public final float M;
        public final float N;
        public final b f25483a;
        public final float f25484b;
        public final int f25485c;

        public a(b bVar, float f10, int i10, float f11, float f12) {
            this.f25483a = bVar;
            this.f25484b = f10;
            this.f25485c = i10;
            this.M = f11;
            this.N = f12;
        }

        @Override
        public void n4(int i10, float f10, float f11, k kVar) {
            this.f25483a.setAlpha(this.f25484b * f10);
            int i11 = this.f25485c;
            if (i11 == 1) {
                float f12 = (f10 * 0.32f) + 0.68f;
                this.f25483a.setScaleX(f12);
                this.f25483a.setScaleY(f12);
            } else if (i11 == 2) {
                float f13 = (f10 * 0.9f) + 0.1f;
                this.f25483a.setScaleX(f13);
                this.f25483a.setScaleY(f13);
            } else if (i11 == 3 || i11 == 4) {
                float f14 = (0.110000014f * f10) + 0.89f;
                this.f25483a.setScaleY(f14);
                this.f25483a.setScaleY(f14);
                b bVar = this.f25483a;
                float f15 = this.M;
                bVar.setTranslationX(f15 + ((this.N - f15) * (1.0f - f10)));
            }
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
            if (this.f25483a != g0.this.f25462f0) {
                g0.this.Z.removeView(this.f25483a);
            }
        }
    }

    public static class b extends d0 {
        public k R;
        public float S;
        public Bitmap T;
        public float U;
        public float V;

        public b(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public void A1(Bitmap bitmap) {
            this.T = bitmap;
            invalidate();
        }

        public void B1(float f10) {
            if (this.U != f10) {
                this.U = f10;
                invalidate();
            }
        }

        public void C1(k kVar, float f10) {
            this.R = kVar;
            this.S = f10;
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i10;
            ce.b.w(this, canvas, this.T);
            if (this.U != 0.0f) {
                RectF a02 = y.a0();
                float i11 = a0.i(1.5f);
                a02.set(i11, i11, getMeasuredWidth() - i10, getMeasuredHeight() - i10);
                canvas.drawArc(a02, -90.0f, (360.0f - this.V) * this.U, false, y.E0());
            }
        }

        @Override
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            k kVar = this.R;
            if (kVar != null) {
                kVar.i(this.S);
                this.R = null;
            }
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            this.V = (y.E0().getStrokeWidth() / ((int) ((getMeasuredWidth() / 2) * 6.283185307179586d))) * 360.0f;
        }
    }

    public static class c extends FrameLayoutFix implements k.b, a.AbstractC0060a {
        public bd.a M;
        public k N;
        public float O;
        public float P;
        public float Q;
        public float R;
        public int S;
        public float T = -1.0f;
        public float U = -1.0f;
        public boolean V;
        public g0 W;
        public float f25486a0;
        public float f25487b0;
        public float f25488c0;
        public float f25489d0;
        public boolean f25490e0;

        public c(Context context) {
            super(context);
            this.M = new bd.a(context, this);
        }

        public int A1() {
            d0 d0Var = this.W.f25457a0;
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
            int i10 = left < ((float) (viewGroup.getMeasuredWidth() / 2)) ? 3 : 5;
            int Z0 = layoutParams.topMargin - g0.Z0();
            return top < ((float) (Z0 + ((viewGroup.getMeasuredHeight() - Z0) / 2))) ? i10 | 48 : i10 | 80;
        }

        public void B1(boolean r4, boolean r5) {
            throw new UnsupportedOperationException("Method not decompiled: vd.g0.c.B1(boolean, boolean):void");
        }

        public final d0 C1(float f10, float f11) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if ((childAt instanceof d0) && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f) {
                    float left = childAt.getLeft() + childAt.getTranslationX();
                    float top = childAt.getTop() + childAt.getTranslationY();
                    if (f10 >= left && f10 <= left + childAt.getMeasuredWidth() && f11 >= top && f11 <= top + childAt.getMeasuredHeight()) {
                        k kVar = this.N;
                        if (kVar != null && kVar.v()) {
                            this.N.k();
                        }
                        return (d0) childAt;
                    }
                }
            }
            return null;
        }

        public void D1() {
            if (this.W.f25457a0 != null) {
                G1(false, false, false);
                k kVar = this.N;
                if (kVar == null || !kVar.v()) {
                    this.W.F0(A1());
                    return;
                }
                this.N.k();
                this.W.F0(this.S);
            }
        }

        public void E1(g0 g0Var) {
            this.W = g0Var;
        }

        public final void G1(boolean z10, boolean z11, boolean z12) {
            if (this.V != z10) {
                this.V = z10;
                if (!z10) {
                    B1(z11, z12);
                }
            }
        }

        public final void H1(float f10, float f11) {
            this.W.A1(f10, f11);
        }

        @Override
        public void n4(int i10, float f10, float f11, k kVar) {
            if (i10 == 0) {
                float f12 = this.O;
                float f13 = f12 + ((this.Q - f12) * f10);
                float f14 = this.P;
                H1(f13, f14 + ((this.R - f14) * f10));
            }
        }

        @Override
        public boolean n7(float r18, float r19) {
            throw new UnsupportedOperationException("Method not decompiled: vd.g0.c.n7(float, float):boolean");
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
            if (i10 == 0) {
                this.W.F0(this.S);
            }
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            boolean z10 = true;
            if (action == 0) {
                this.T = motionEvent.getX();
                float y10 = motionEvent.getY();
                this.U = y10;
                if (C1(this.T, y10) == null) {
                    z10 = false;
                }
                this.f25490e0 = z10;
                this.M.a(motionEvent);
                return false;
            } else if (action != 1) {
                if (action == 2) {
                    float x10 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    if (this.f25490e0 && this.W.f25457a0 != null && !this.V && Math.max(Math.abs(x10 - this.T), Math.abs(y11 - this.U)) > a0.p()) {
                        this.f25486a0 = x10;
                        this.f25487b0 = y11;
                        this.f25488c0 = this.W.f25457a0.getTranslationX();
                        this.f25489d0 = this.W.f25457a0.getTranslationY();
                        G1(true, false, false);
                        return true;
                    }
                } else if (action == 3) {
                    G1(false, true, false);
                    this.M.a(motionEvent);
                    return false;
                }
                return this.V;
            } else {
                G1(false, true, true);
                this.M.a(motionEvent);
                return false;
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 1) {
                this.M.a(motionEvent);
                G1(false, true, true);
            } else if (action != 2) {
                if (action == 3) {
                    this.M.a(motionEvent);
                    G1(false, true, false);
                }
            } else if (this.V && this.f25490e0) {
                this.M.a(motionEvent);
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                H1(this.f25488c0 + (x10 - this.f25486a0), this.f25489d0 + (y10 - this.f25487b0));
            }
            return false;
        }

        public final void z1(int i10, float f10) {
            int i11;
            float f11;
            d0 d0Var = this.W.f25457a0;
            if (d0Var != null) {
                this.S = i10;
                k kVar = this.N;
                if (kVar == null) {
                    this.N = new k(0, this, db.b.f7287b, 180L, 0.0f);
                } else {
                    kVar.l(0.0f);
                }
                this.O = d0Var.getTranslationX();
                this.P = d0Var.getTranslationY();
                ViewGroup viewGroup = (ViewGroup) d0Var.getParent();
                int measuredWidth = viewGroup.getMeasuredWidth();
                int measuredHeight = viewGroup.getMeasuredHeight();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d0Var.getLayoutParams();
                if (g0.e1(i10)) {
                    i11 = (measuredWidth - g0.a1()) - layoutParams.rightMargin;
                } else {
                    i11 = layoutParams.leftMargin;
                }
                float f12 = i11;
                if (g0.d1(i10)) {
                    f11 = (measuredHeight - g0.a1()) - layoutParams.bottomMargin;
                } else {
                    f11 = layoutParams.topMargin;
                }
                this.Q = f12 - d0Var.getLeft();
                this.R = f11 - d0Var.getTop();
                this.N.i(1.0f);
            }
        }
    }

    public static class d extends Handler {
        public final g0 f25491a;

        public d(g0 g0Var) {
            super(Looper.getMainLooper());
            this.f25491a = g0Var;
        }

        @Override
        public void handleMessage(Message message) {
            this.f25491a.p1(message);
        }
    }

    public g0(org.thunderdog.challegram.a aVar) {
        this.M = aVar;
        ya.o1().w2().p(this);
    }

    public static int Z0() {
        return a0.i(11.0f);
    }

    public static int a1() {
        return a0.i(111.0f);
    }

    public static boolean d1(int i10) {
        return (i10 & 112) == 80;
    }

    public static boolean e1(int i10) {
        return (i10 & 7) == 5;
    }

    public void f1(View view) {
        if (this.f25442c != null) {
            ya.o1().w2().H0(this.f25441b, this.f25442c, null);
        }
    }

    public static void r1(View view) {
        view.setElevation(a0.i(1.0f));
        view.setTranslationZ(a0.i(1.0f));
    }

    public final void A1(float f10, float f11) {
        if (this.f25457a0 == null) {
            return;
        }
        if (this.f25473q0 != f10 || this.f25474r0 != f11) {
            this.f25473q0 = f10;
            this.f25474r0 = f11;
            Q1();
        }
    }

    public final void B1(float f10) {
        if (this.f25471o0 != f10) {
            this.f25471o0 = f10;
            Q1();
        }
    }

    public final void C1(boolean z10, boolean z11) {
        if (this.f25470n0 != z10 || !z11) {
            this.f25470n0 = z10;
            float f10 = z10 ? 1.0f : 0.0f;
            if (z11) {
                if (this.f25469m0 == null) {
                    float f11 = this.f25471o0;
                    if (f11 != f10) {
                        this.f25469m0 = new k(2, this, db.b.f7287b, 180L, f11);
                    } else {
                        return;
                    }
                }
                this.f25469m0.i(f10);
                return;
            }
            k kVar = this.f25469m0;
            if (kVar != null) {
                kVar.l(f10);
            }
            B1(f10);
        }
    }

    public final void D1(float f10, long j10, long j11) {
        if (this.D0 != f10 || this.E0 != j10 || this.F0 != j11) {
            this.D0 = f10;
            this.F0 = j11;
            if (this.E0 != j10) {
                this.E0 = j10;
                if (this.f25442c != null) {
                    o0 w22 = ya.o1().w2();
                    o6 o6Var = this.f25441b;
                    TdApi.Message message = this.f25442c;
                    w22.X0(o6Var, message.chatId, message.f19946id, t2.o1(message), f10, j10, j11, false);
                }
            }
            N1(ib.h.d(f10));
        }
    }

    public final void E0(int i10, float f10) {
        b bVar;
        int i11;
        Bitmap W0 = W0(this.f25478v0, this.f25481y0);
        if (W0 != null) {
            b bVar2 = this.f25462f0;
            if (bVar2 == null) {
                bVar = new b(this.M);
                this.f25462f0 = bVar;
            } else if (bVar2.getAlpha() == 0.0f) {
                bVar = this.f25462f0;
            } else {
                bVar = new b(this.M);
            }
            b bVar3 = bVar;
            float alpha = this.f25457a0.getAlpha();
            bVar3.setAlpha(alpha);
            bVar3.setScaleX(this.f25457a0.getScaleX());
            bVar3.setScaleY(this.f25457a0.getScaleY());
            bVar3.setLayoutParams(FrameLayoutFix.q1(a1(), a1()));
            r1(bVar3);
            float left = this.f25457a0.getLeft() + this.f25457a0.getTranslationX();
            float top = this.f25457a0.getTop() + this.f25457a0.getTranslationY();
            if (e1(this.Z.A1())) {
                i11 = this.Z.getMeasuredWidth() + Z0();
            } else {
                i11 = (-a1()) - Z0();
            }
            bVar3.setTranslationX(left);
            bVar3.setTranslationY(top);
            bVar3.A1(W0);
            bVar3.B1(f10);
            k kVar = new k(0, new a(bVar3, alpha, i10, left, i11), db.b.f7287b, i10 == 3 ? 120L : 180L, 1.0f);
            if (bVar3.getParent() == null) {
                bVar3.C1(kVar, 0.0f);
                this.Z.addView(bVar3, 0);
                return;
            }
            kVar.i(0.0f);
        }
    }

    public final void E1(boolean z10) {
        if (this.f25478v0 != z10) {
            this.f25478v0 = z10;
            if (this.S) {
                if (this.A0) {
                    W0(!z10, this.f25480x0);
                }
                J1(false, true);
                Object obj = z10 ? this.f25458b0 : this.V;
                if (obj instanceof SurfaceView) {
                    this.Y.p((SurfaceView) obj);
                } else {
                    this.Y.T((TextureView) obj);
                }
            }
        }
    }

    @Override
    public void E2(int i10) {
        m3.s sVar = this.Y;
        if (sVar != null) {
            sVar.d(o0.i0(false, i10));
        }
    }

    public final void F0(int i10) {
        d0 d0Var = this.f25457a0;
        if (d0Var != null) {
            this.f25473q0 = 0.0f;
            this.f25474r0 = 0.0f;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d0Var.getLayoutParams();
            if (!(e1(layoutParams.gravity) == e1(i10) && d1(layoutParams.gravity) == d1(i10))) {
                layoutParams.gravity = i10;
                this.f25457a0.setLayoutParams(layoutParams);
                i.c2().q5(i10);
            }
            Q1();
        }
    }

    public final void F1(TdApi.VideoNote videoNote) {
        TdApi.Thumbnail thumbnail;
        h hVar = this.R;
        int i10 = 0;
        int s10 = hVar != null ? hVar.s() : 0;
        if (!(videoNote == null || (thumbnail = videoNote.thumbnail) == null)) {
            i10 = thumbnail.file.f19913id;
        }
        if (s10 != i10) {
            this.R = i6.da(this.f25441b, videoNote);
            if (this.S) {
                this.f25460d0.getReceiver().G(this.R);
            }
        }
    }

    @Override
    public void G(o2 o2Var) {
        j0.y0(v0.z1(o2Var) ? R.string.VideoPlaybackUnsupported : R.string.RoundVideoPlaybackError, 0);
    }

    public final void G0(h1 h1Var) {
        p0 overlayView = h1Var.getOverlayView();
        h1Var.removeView(overlayView);
        this.T.addView(overlayView);
        overlayView.setTranslationX(this.M0);
        overlayView.setTranslationY(this.N0);
    }

    public final void G1(float f10) {
        if (this.f25465i0 != f10) {
            this.f25465i0 = f10;
            this.f25460d0.setAlpha(f10);
        }
    }

    public final void H0(boolean z10, boolean z11) {
        v4<?> v4Var = this.K0;
        h1 h1Var = null;
        if (v4Var == null) {
            v4Var = this.M.Q1() != null ? this.M.Q1().F() : null;
        }
        boolean z12 = this.I0 != null && v4Var != null && (v4Var instanceof rh) && v4Var.C9() == this.f25442c.chatId && g1();
        if (this.J0 != z12 || z11) {
            this.J0 = z12;
            if (!(!z12 || this.f25442c == null || this.T == null)) {
                h1Var = this.I0;
            }
            y1(h1Var);
            Log.i((int) Log.TAG_VIDEO, "currentViewVisible -> %b, callListeners: %b", Boolean.valueOf(z12), Boolean.valueOf(z10));
            J0(true);
            if (!z10) {
                return;
            }
            if (z12) {
                m1();
            } else {
                n1();
            }
        }
    }

    public final void H1(boolean z10) {
        if (this.f25464h0 != z10) {
            this.f25464h0 = z10;
            O0();
        }
    }

    public void I0() {
        if (this.f25442c != null && this.I0 != null) {
            H0(true, false);
        }
    }

    public final void I1(boolean z10) {
        e0 e0Var = this.f25459c0;
        if (e0Var != null) {
            e0Var.e(z10);
        }
    }

    @Override
    public void J(o6 o6Var, TdApi.Message message, boolean z10) {
        R0(1);
    }

    public final void J0(boolean z10) {
        if (this.S) {
            boolean z11 = this.J0 && !this.f25468l0 && this.f25461e0;
            if (this.f25475s0 != z11) {
                this.f25475s0 = z11;
                Log.i((int) Log.TAG_VIDEO, "isMainVisible -> %b", Boolean.valueOf(z11));
                float f10 = z11 ? 1.0f : 0.0f;
                if (!z10 || this.I0 == null) {
                    k kVar = this.f25477u0;
                    if (kVar != null) {
                        kVar.l(f10);
                    }
                    w1(f10);
                    return;
                }
                if (this.f25477u0 == null) {
                    float f11 = this.f25476t0;
                    if (f11 != f10) {
                        this.f25477u0 = new k(3, this, db.b.f7287b, 138L, f11);
                    } else {
                        return;
                    }
                }
                this.f25477u0.i(f10);
            }
        }
    }

    public final void J1(boolean z10, boolean z11) {
        if (this.f25461e0 != z10) {
            this.f25461e0 = z10;
            if (this.S) {
                J0(z11);
                H1(!z10);
            }
        }
    }

    @Override
    public void K0(o6 o6Var, int i10, int i11, TdApi.File file) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            d dVar = this.N;
            dVar.sendMessage(Message.obtain(dVar, 0, i10, i11, new Object[]{o6Var, file}));
            return;
        }
        TdApi.File file2 = this.P;
        if (file2 == null || file2.f19913id != i10 || this.f25441b != o6Var) {
            return;
        }
        if (i11 == 0) {
            ya.o1().w2().d1(false);
        } else if (i11 == 2 && file != null) {
            e.v(file, file2);
            L1(o6Var, file.f19913id);
            I1(false);
            ya.o1().w2().I0(o6Var, this.f25442c, false);
        }
    }

    public final void L0(boolean z10) {
        C1(this.f25468l0 && !this.f25472p0, z10);
    }

    public final void L1(o6 o6Var, int i10) {
        this.Q = i10 < 0 ? null : v0.f2(o6Var.A6(), i10);
        this.f25482z0 = false;
        J1(false, false);
        s sVar = this.Q;
        if (sVar != null) {
            this.Y.w(sVar);
            this.Y.b();
        }
        D1(0.0f, -1L, -1L);
    }

    public final void M0() {
        if (this.S) {
            this.Y.x(this.A0 && (this.I0 != null || !this.H0));
            P0();
        }
    }

    public final void M1(h1 h1Var, boolean z10, boolean z11) {
        if (this.f25442c != null) {
            h1 h1Var2 = this.I0;
            if (h1Var2 != h1Var) {
                Object[] objArr = new Object[2];
                String str = "null";
                objArr[0] = h1Var2 != null ? h1Var2.getClass().getName() : str;
                if (h1Var != null) {
                    str = h1Var.getClass().getName();
                }
                objArr[1] = str;
                Log.i((int) Log.TAG_VIDEO, "targetView %s -> %s", objArr);
                this.I0 = h1Var;
            }
            H0(z10, z11);
        }
    }

    @Override
    public void M4() {
        F();
    }

    @Override
    public void N(int i10) {
        if (i10 == 4 && this.A0 && this.Q != null) {
            ya.o1().w2().D0();
        }
    }

    public final void N0() {
        if (this.A0) {
            s1(false);
            E1(this.f25468l0);
            return;
        }
        boolean z10 = this.f25478v0;
        if (z10 == this.f25468l0 || !this.S) {
            s1(false);
        } else if (!this.f25479w0) {
            s1(W0(z10, this.f25480x0) != null);
            c1();
            if (!this.f25479w0) {
                Log.i((int) Log.TAG_VIDEO, "Warning: forcely switching output view", new Object[0]);
                E1(this.f25468l0);
            }
        }
    }

    public final void N1(float f10) {
        if (this.G0 != f10) {
            this.G0 = f10;
            if (this.S) {
                this.f25459c0.invalidate();
                this.W.invalidate();
            }
        }
    }

    public final void O0() {
        boolean z10 = this.f25464h0 || this.f25479w0;
        if (this.f25467k0 != z10) {
            this.f25467k0 = z10;
            float f10 = z10 ? 1.0f : 0.0f;
            if (z10 || this.f25471o0 == 0.0f) {
                k kVar = this.f25466j0;
                if (kVar != null) {
                    kVar.l(f10);
                }
                G1(f10);
                return;
            }
            if (this.f25466j0 == null) {
                this.f25466j0 = new k(1, this, db.b.f7287b, 180L, this.f25465i0);
            }
            this.f25466j0.i(f10);
        }
    }

    public final void O1(float f10) {
        if (this.B0 != f10) {
            this.B0 = f10;
            m3.s sVar = this.Y;
            if (sVar != null) {
                sVar.f(f10);
            }
        }
    }

    public final void P0() {
        boolean z10 = this.Y != null && this.A0;
        if (this.C0 != z10) {
            this.C0 = z10;
            Log.i((int) Log.TAG_VIDEO, "progressTimerStarted -> %b", Boolean.valueOf(z10));
            this.N.removeMessages(1);
            l1();
        }
    }

    @Override
    public void Q0(int i10, boolean z10) {
    }

    public final void Q1() {
        float f10;
        float f11;
        if (this.f25457a0 != null) {
            float X0 = X0();
            if (this.f25471o0 != 1.0f) {
                float Z0 = Z0() + a1();
                if (!e1(((FrameLayout.LayoutParams) this.f25457a0.getLayoutParams()).gravity)) {
                    Z0 *= -1.0f;
                }
                f11 = Z0 * (1.0f - this.f25471o0);
                f10 = 0.0f;
            } else {
                f11 = this.f25473q0;
                f10 = this.f25474r0;
            }
            this.f25457a0.setTranslationX(f11);
            this.f25457a0.setTranslationY(f10);
            O1(X0);
            this.f25457a0.setAlpha(this.f25471o0 * X0);
        }
    }

    public final void R0(int i10) {
        int i11;
        if (this.S) {
            if (!(i10 == 0 || (i11 = this.f25463g0) == 0)) {
                this.f25463g0 = 0;
                i10 = i11;
            }
            y1(null);
            Log.i((int) Log.TAG_VIDEO, "closePlayer, mode: %d", Integer.valueOf(i10));
            if (this.f25468l0) {
                if (i10 != 0) {
                    E0(i10, this.G0);
                    this.Z.D1();
                }
                v1(false, false);
            }
            this.S = false;
            this.M.removeFromNavigation(this.T);
            this.T = null;
            this.U = null;
            this.V = null;
            this.W = null;
            this.Z.removeView(this.f25457a0);
            this.f25460d0.Q2();
            H1(true);
            this.f25460d0.getReceiver().G(null);
            this.f25457a0 = null;
            u1(null, null);
            m3.s sVar = this.Y;
            if (sVar != null) {
                sVar.a();
                this.Y = null;
            }
            P0();
            this.f25479w0 = false;
        }
    }

    public final void S0(h1 h1Var) {
        p0 overlayView = h1Var.getOverlayView();
        ((ViewGroup) overlayView.getParent()).removeView(overlayView);
        overlayView.setTranslationY(0.0f);
        overlayView.setTranslationX(0.0f);
        h1Var.addView(overlayView);
    }

    public final void T0() {
        this.f25463g0 = 3;
        ya.o1().w2().H0(null, null, null);
    }

    @Override
    public void U0(TdApi.File file) {
        TdApi.File file2;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            d dVar = this.N;
            dVar.sendMessage(Message.obtain(dVar, 2, file));
        } else if (file != null && (file2 = this.P) != null && file2.f19913id == file.f19913id) {
            e.v(file, file2);
            this.f25459c0.c(t2.s1(file));
        }
    }

    public final void V0(boolean r12, boolean r13, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: vd.g0.V0(boolean, boolean, float):void");
    }

    public final Bitmap W0(boolean z10, Bitmap bitmap) {
        try {
            Object obj = z10 ? this.f25458b0 : this.V;
            bitmap.eraseColor(0);
            if (obj instanceof SurfaceView) {
                return null;
            }
            if (this.f25482z0 || bitmap == this.f25481y0) {
                bitmap = ((TextureView) obj).getBitmap(bitmap);
            }
            c1();
            return bitmap;
        } catch (OutOfMemoryError unused) {
            Log.w((int) Log.TAG_VIDEO, "Not enough memory to allocate placeholder", new Object[0]);
            return null;
        }
    }

    public final float X0() {
        float min;
        float left = this.f25457a0.getLeft() + this.f25473q0;
        int measuredWidth = this.f25457a0.getMeasuredWidth();
        int measuredWidth2 = this.Z.getMeasuredWidth();
        float f10 = measuredWidth;
        float f11 = 0.8f * f10;
        if (left < 0.0f) {
            min = Math.min(1.0f, (-left) / f11);
        } else {
            float f12 = left + f10;
            float f13 = measuredWidth2;
            if (f12 <= f13) {
                return 1.0f;
            }
            min = Math.min(1.0f, (f12 - f13) / f11);
        }
        return 1.0f - min;
    }

    public FrameLayoutFix Y0() {
        if (this.f25442c != null) {
            return this.Z;
        }
        return null;
    }

    @Override
    public boolean a0(TdApi.Message message) {
        return message.content.getConstructor() == 963323014;
    }

    @Override
    public void b0(boolean z10) {
        if (this.A0 != z10) {
            this.A0 = z10;
            m3.s sVar = this.Y;
            if (sVar != null) {
                sVar.x(z10);
            }
            N0();
            P0();
        }
    }

    public float b1() {
        return this.G0;
    }

    public final void c1() {
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        Bitmap bitmap3 = (!this.f25479w0 || (bitmap = this.f25480x0) == null || bitmap.isRecycled()) ? null : this.f25480x0;
        p1 p1Var = this.X;
        if (!this.f25468l0) {
            bitmap2 = bitmap3;
        }
        p1Var.setOverlayBitmap(bitmap2);
    }

    @Override
    public void c6() {
        if (this.A0) {
            this.O0 = true;
            b0(false);
        }
    }

    @Override
    public void g0(o6 o6Var, TdApi.Message message) {
        if (E(o6Var, message)) {
            t1();
        }
    }

    public final boolean g1() {
        throw new UnsupportedOperationException("Method not decompiled: vd.g0.g1():boolean");
    }

    public final FrameLayout.LayoutParams h1() {
        int a12 = a1();
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(a12, a12, i.c2().v1());
        r12.topMargin = d1.a3(true) + d1.getPlayerSize() + Z0();
        int Z0 = Z0();
        r12.leftMargin = Z0;
        r12.bottomMargin = Z0;
        r12.rightMargin = Z0;
        return r12;
    }

    public void i1(long j10, long j11) {
        TdApi.Message message = this.f25442c;
        if (message != null && message.chatId == j10 && message.f19946id == j11 && this.I0 != null) {
            g1();
        }
    }

    public void k1() {
        if (this.f25442c != null && this.I0 != null) {
            H0(true, false);
        }
    }

    @Override
    public void l0(o6 o6Var, TdApi.Message message, boolean z10, boolean z11, o6 o6Var2, int i10) {
        float f10;
        if (this.S) {
            this.f25480x0.eraseColor(0);
            c1();
            f10 = this.G0;
        } else {
            f10 = 0.0f;
        }
        M1(null, false, false);
        o1();
        this.A0 = true;
        N0();
        u1(o6Var, t2.j1(message));
        F1(((TdApi.MessageVideoNote) message.content).videoNote);
        V0(z10, z11, f10);
        M0();
        z1(false);
    }

    public final void l1() {
        m3.s sVar = this.Y;
        if (sVar != null) {
            long g10 = sVar.g();
            long V = this.Y.V();
            if (!(g10 == -9223372036854775807L || V == -9223372036854775807L)) {
                D1(g10 != 0 ? ib.h.d(((float) V) / ((float) g10)) : 0.0f, V, g10);
            }
        }
        if (this.C0) {
            long u10 = v0.u(this.f25468l0 ? a1() : i6.ca(), this.F0);
            d dVar = this.N;
            dVar.sendMessageDelayed(Message.obtain(dVar, 1), u10);
        }
    }

    public final void m1() {
        Log.v((int) Log.TAG_VIDEO, "onTargetFound, awaitingCurrentView: %b", Boolean.valueOf(this.H0));
        if (this.H0) {
            M0();
            this.H0 = false;
            return;
        }
        v1(false, true);
    }

    public final void n1() {
        Log.v((int) Log.TAG_VIDEO, "onTargetLost", new Object[0]);
        v1(true, true);
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            N1(f10);
        } else if (i10 == 1) {
            G1(f10);
        } else if (i10 == 2) {
            B1(f10);
        } else if (i10 == 3) {
            w1(f10);
        }
    }

    public final void o1() {
        if (!this.S) {
            if (this.f25480x0 == null) {
                this.f25480x0 = Bitmap.createBitmap(a0.j(200.0f, 2.0f), a0.j(200.0f, 2.0f), Bitmap.Config.ARGB_8888);
                this.f25481y0 = Bitmap.createBitmap(a0.j(111.0f, 2.0f), a0.j(111.0f, 2.0f), Bitmap.Config.ARGB_8888);
            }
            if (this.T == null) {
                this.T = new p2(this.M);
                FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(-1, -1);
                q12.topMargin = d1.a3(true);
                this.T.setLayoutParams(q12);
                this.M.addToNavigation(this.T);
            }
            if (this.U == null) {
                int ca2 = i6.ca();
                d0 d0Var = new d0(this.M);
                this.U = d0Var;
                d0Var.setAlpha(this.f25476t0);
                this.U.setLayoutParams(FrameLayoutFix.q1(ca2, ca2));
                TextureView textureView = new TextureView(this.M);
                this.V = textureView;
                textureView.setLayoutParams(FrameLayoutFix.q1(-1, -1));
                this.U.addView(this.V);
                p1 p1Var = new p1(this.M);
                this.X = p1Var;
                p1Var.setLayoutParams(FrameLayoutFix.q1(-1, -1));
                this.U.addView(this.X);
                e0 e0Var = new e0(this.M);
                this.W = e0Var;
                e0Var.b(this);
                this.W.setLayoutParams(FrameLayoutFix.q1(-1, -1));
                this.U.addView(this.W);
                this.T.addView(this.U);
            }
            if (this.Z == null) {
                c cVar = new c(this.M);
                this.Z = cVar;
                cVar.E1(this);
                this.Z.setLayoutParams(FrameLayoutFix.q1(-1, -1));
            }
            if (this.f25457a0 == null) {
                d0 d0Var2 = new d0(this.M);
                this.f25457a0 = d0Var2;
                d0Var2.setLayoutParams(h1());
                Q1();
                this.f25457a0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        g0.this.f1(view);
                    }
                });
                this.f25457a0.setBackgroundColor(j.u());
                this.f25457a0.setTransparentOutline(false);
                r1(this.f25457a0);
                TextureView textureView2 = new TextureView(this.M);
                this.f25458b0 = textureView2;
                textureView2.setLayoutParams(FrameLayoutFix.q1(-1, -1));
                this.f25457a0.addView(this.f25458b0);
                p1 p1Var2 = new p1(this.M);
                this.f25460d0 = p1Var2;
                p1Var2.setOverlayBitmap(this.f25480x0);
                this.f25460d0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
                this.f25457a0.addView(this.f25460d0);
                e0 e0Var2 = new e0(this.M);
                this.f25459c0 = e0Var2;
                e0Var2.b(this);
                this.f25459c0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
                this.f25457a0.addView(this.f25459c0);
                this.Z.addView(this.f25457a0);
            }
            if (this.Z.getParent() == null) {
                this.M.a0(this.Z, false);
            }
            if (this.Y == null) {
                this.Y = v0.Z1(this.M, true);
                t1();
                this.Y.U(this);
                this.Y.f(this.B0);
                View view = this.V;
                if (view instanceof SurfaceView) {
                    this.Y.p((SurfaceView) view);
                } else {
                    this.Y.T((TextureView) view);
                }
            }
            this.S = true;
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void o6() {
        if (this.O0) {
            this.O0 = false;
            b0(true);
        }
    }

    public final void p1(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            Object[] objArr = (Object[]) message.obj;
            K0((o6) objArr[0], message.arg1, message.arg2, (TdApi.File) objArr[1]);
        } else if (i10 == 1) {
            l1();
        } else if (i10 == 2) {
            U0((TdApi.File) message.obj);
        }
    }

    @Override
    public void q() {
        Log.i((int) Log.TAG_VIDEO, "onRenderedFirstFrame", new Object[0]);
        this.f25482z0 = true;
        J1(true, true);
    }

    public void q1(h1 h1Var, rh rhVar) {
        this.K0 = rhVar;
        M1(h1Var, true, false);
    }

    public final void s1(boolean z10) {
        if (this.f25479w0 != z10) {
            this.f25479w0 = z10;
            c1();
            O0();
        }
    }

    public final void t1() {
        if (this.Y != null) {
            ya.o1().w2().N0().i(this.Y, 3);
        }
    }

    public final void u1(o6 o6Var, TdApi.File file) {
        TdApi.File file2 = this.P;
        if (file2 != null || file != null) {
            boolean z10 = this.O == o6Var;
            int N0 = e.N0(file2);
            int N02 = e.N0(file);
            if (!z10 || N0 != N02) {
                if (N0 != 0) {
                    this.O.m5().D0(N0, this);
                }
                this.O = o6Var;
                this.P = file;
                if (N02 != 0) {
                    o6Var.m5().B0(file, this);
                }
                if (file == null) {
                    L1(null, -1);
                    I1(false);
                } else if (t2.T2(file)) {
                    L1(o6Var, file.f19913id);
                    I1(false);
                } else {
                    L1(null, -1);
                    I1(true);
                    o6Var.m5().p(file);
                }
            } else if (t2.T2(file)) {
                this.Y.c(0L);
                this.Y.x(this.A0);
                long j10 = this.F0;
                D1(0.0f, j10, j10);
                P0();
            } else {
                o6Var.m5().p(file);
            }
        }
    }

    public final void v1(boolean z10, boolean z11) {
        if (this.f25468l0 != z10) {
            this.f25468l0 = z10;
            Log.i((int) Log.TAG_VIDEO, "inPipMode -> %b, animated: %b", Boolean.valueOf(z10), Boolean.valueOf(z11));
            N0();
            J0(z11);
            if (this.S) {
                L0(z11);
            }
        }
    }

    public final void w1(float f10) {
        if (this.f25476t0 != f10) {
            this.f25476t0 = f10;
            if (this.S) {
                this.U.setAlpha(f10);
            }
        }
    }

    public final void x1(int i10, int i11) {
        this.T.C1(i10, i11);
    }

    public final void y1(h1 h1Var) {
        h1 h1Var2 = this.L0;
        if (h1Var2 != h1Var) {
            Object[] objArr = new Object[2];
            String str = "null";
            objArr[0] = h1Var2 != null ? h1Var2.getClass().getSimpleName() : str;
            if (h1Var != null) {
                str = h1Var.getClass().getSimpleName();
            }
            objArr[1] = str;
            Log.i((int) Log.TAG_VIDEO, "ownedOverlay %s -> %s", objArr);
            h1 h1Var3 = this.L0;
            if (h1Var3 != null) {
                S0(h1Var3);
            }
            this.L0 = h1Var;
            if (h1Var != null) {
                G0(h1Var);
            }
        }
    }

    public final void z1(boolean z10) {
        if (this.f25472p0 != z10) {
            this.f25472p0 = z10;
            L0(!z10);
        }
    }
}
