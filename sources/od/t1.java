package od;

import a5.v;
import ae.j;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import ce.j0;
import d5.b0;
import gd.w;
import java.io.IOException;
import java.util.List;
import m3.c2;
import m3.o;
import m3.o2;
import m3.o3;
import m3.q1;
import m3.r2;
import m3.s2;
import m3.t3;
import m3.u2;
import m3.y1;
import me.vkryl.android.widget.FrameLayoutFix;
import n3.c;
import o4.k;
import o4.r0;
import o4.s;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p3.e;
import p3.h;
import zd.o6;
import zd.z;

public class t1 implements s2.d, z.a, Runnable {
    public static final int f19852n0 = 24;
    public View M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public final ViewGroup R;
    public final int S;
    public qd.b T;
    public kb.b U;
    public AlertDialog V;
    public s W;
    public s Z;
    public final Context f19853a;
    public boolean f19854a0;
    public boolean f19856b0;
    public m3.s f19857c;
    public qd.b f19858c0;
    public long f19859d0;
    public boolean f19860e0;
    public o f19861f0;
    public c f19863h0;
    public long f19864i0;
    public boolean f19865j0;
    public boolean f19866k0;
    public boolean f19867l0;
    public boolean f19868m0;
    public long X = -1;
    public long Y = -1;
    public boolean f19862g0 = true;
    public final d f19855b = new d();

    public class a implements n3.c {
        public a() {
        }

        @Override
        public void A(c.a aVar, boolean z10) {
            n3.b.d0(this, aVar, z10);
        }

        @Override
        public void B(c.a aVar, int i10, int i11) {
            n3.b.e0(this, aVar, i10, i11);
        }

        @Override
        public void C(c.a aVar, t3 t3Var) {
            n3.b.h0(this, aVar, t3Var);
        }

        @Override
        public void D(c.a aVar, e eVar) {
            n3.b.f(this, aVar, eVar);
        }

        @Override
        public void E(c.a aVar, List list) {
            n3.b.o(this, aVar, list);
        }

        @Override
        public void F(c.a aVar, long j10, int i10) {
            n3.b.o0(this, aVar, j10, i10);
        }

        @Override
        public void G(c.a aVar, Exception exc) {
            n3.b.b(this, aVar, exc);
        }

        @Override
        public void H(c.a aVar) {
            n3.b.a0(this, aVar);
        }

        @Override
        public void I(c.a aVar, int i10, int i11, int i12, float f10) {
            n3.b.r0(this, aVar, i10, i11, i12, f10);
        }

        @Override
        public void J(c.a aVar, int i10, long j10, long j11) {
            n3.b.l(this, aVar, i10, j10, j11);
        }

        @Override
        public void K(c.a aVar, y1 y1Var, int i10) {
            n3.b.M(this, aVar, y1Var, i10);
        }

        @Override
        public void L(c.a aVar, q1 q1Var, h hVar) {
            n3.b.q0(this, aVar, q1Var, hVar);
        }

        @Override
        public void M(c.a aVar, int i10) {
            n3.b.f0(this, aVar, i10);
        }

        @Override
        public void N(c.a aVar, int i10, e eVar) {
            n3.b.p(this, aVar, i10, eVar);
        }

        @Override
        public void O(c.a aVar, s2.e eVar, s2.e eVar2, int i10) {
            n3.b.Y(this, aVar, eVar, eVar2, i10);
        }

        @Override
        public void P(c.a aVar, c2 c2Var) {
            n3.b.N(this, aVar, c2Var);
        }

        @Override
        public void Q(c.a aVar) {
            n3.b.w(this, aVar);
        }

        @Override
        public void R(c.a aVar, f4.a aVar2) {
            n3.b.O(this, aVar, aVar2);
        }

        @Override
        public void S(c.a aVar, int i10) {
            n3.b.Z(this, aVar, i10);
        }

        @Override
        public void T(c.a aVar, boolean z10) {
            n3.b.G(this, aVar, z10);
        }

        @Override
        public void U(c.a aVar, e eVar) {
            n3.b.g(this, aVar, eVar);
        }

        @Override
        public void V(c.a aVar, o oVar) {
            n3.b.t(this, aVar, oVar);
        }

        @Override
        public void W(c.a aVar) {
            n3.b.V(this, aVar);
        }

        @Override
        public void X(c.a aVar, o4.o oVar) {
            n3.b.v(this, aVar, oVar);
        }

        @Override
        public void Y(c.a aVar, String str, long j10, long j11) {
            n3.b.k0(this, aVar, str, j10, j11);
        }

        @Override
        public void Z(c.a aVar) {
            n3.b.b0(this, aVar);
        }

        @Override
        public void a(c.a aVar, o2 o2Var) {
            n3.b.U(this, aVar, o2Var);
        }

        @Override
        public void a0(c.a aVar, Exception exc) {
            n3.b.i0(this, aVar, exc);
        }

        @Override
        public void b(c.a aVar, int i10) {
            n3.b.X(this, aVar, i10);
        }

        @Override
        public void b0(c.a aVar, k kVar, o4.o oVar) {
            n3.b.K(this, aVar, kVar, oVar);
        }

        @Override
        public void c(c.a aVar, e eVar) {
            n3.b.n0(this, aVar, eVar);
        }

        @Override
        public void c0(c.a aVar, int i10) {
            n3.b.A(this, aVar, i10);
        }

        @Override
        public void d(c.a aVar, boolean z10) {
            n3.b.L(this, aVar, z10);
        }

        @Override
        public void d0(c.a aVar, Exception exc) {
            n3.b.B(this, aVar, exc);
        }

        @Override
        public void e(c.a aVar, k kVar, o4.o oVar) {
            n3.b.H(this, aVar, kVar, oVar);
        }

        @Override
        public void e0(c.a aVar) {
            n3.b.z(this, aVar);
        }

        @Override
        public void f(c.a aVar, boolean z10, int i10) {
            n3.b.W(this, aVar, z10, i10);
        }

        @Override
        public void f0(c.a aVar, int i10) {
            n3.b.R(this, aVar, i10);
        }

        @Override
        public void g(c.a aVar, int i10) {
            n3.b.S(this, aVar, i10);
        }

        @Override
        public void g0(c.a aVar, int i10, boolean z10) {
            n3.b.u(this, aVar, i10, z10);
        }

        @Override
        public void h(c.a aVar, String str) {
            n3.b.l0(this, aVar, str);
        }

        @Override
        public void h0(c.a aVar, Exception exc) {
            n3.b.k(this, aVar, exc);
        }

        @Override
        public void i(c.a aVar, boolean z10) {
            n3.b.F(this, aVar, z10);
        }

        @Override
        public void i0(c.a aVar, k kVar, o4.o oVar, IOException iOException, boolean z10) {
            n3.b.J(this, aVar, kVar, oVar, iOException, z10);
        }

        @Override
        public void j(c.a aVar) {
            n3.b.y(this, aVar);
        }

        @Override
        public void j0(c.a aVar, String str) {
            n3.b.e(this, aVar, str);
        }

        @Override
        public void k(c.a aVar, int i10, String str, long j10) {
            n3.b.r(this, aVar, i10, str, j10);
        }

        @Override
        public void k0(c.a aVar, e eVar) {
            n3.b.m0(this, aVar, eVar);
        }

        @Override
        public void l(c.a aVar, Object obj, long j10) {
            t1.this.E0(false);
        }

        @Override
        public void l0(c.a aVar, k kVar, o4.o oVar) {
            n3.b.I(this, aVar, kVar, oVar);
        }

        @Override
        public void m(c.a aVar, int i10, e eVar) {
            n3.b.q(this, aVar, i10, eVar);
        }

        @Override
        public void m0(c.a aVar, boolean z10) {
            n3.b.c0(this, aVar, z10);
        }

        @Override
        public void n(c.a aVar, String str, long j10) {
            n3.b.j0(this, aVar, str, j10);
        }

        @Override
        public void n0(c.a aVar) {
            n3.b.x(this, aVar);
        }

        @Override
        public void o(c.a aVar, s2.b bVar) {
            n3.b.m(this, aVar, bVar);
        }

        @Override
        public void o0(c.a aVar, q1 q1Var) {
            n3.b.h(this, aVar, q1Var);
        }

        @Override
        public void p(c.a aVar, String str, long j10, long j11) {
            n3.b.d(this, aVar, str, j10, j11);
        }

        @Override
        public void p0(c.a aVar, long j10) {
            n3.b.j(this, aVar, j10);
        }

        @Override
        public void q(s2 s2Var, c.b bVar) {
            n3.b.E(this, s2Var, bVar);
        }

        @Override
        public void q0(c.a aVar, float f10) {
            n3.b.t0(this, aVar, f10);
        }

        @Override
        public void r(c.a aVar) {
            n3.b.C(this, aVar);
        }

        @Override
        public void r0(c.a aVar, int i10, long j10, long j11) {
            n3.b.n(this, aVar, i10, j10, j11);
        }

        @Override
        public void s(c.a aVar, o2 o2Var) {
            n3.b.T(this, aVar, o2Var);
        }

        @Override
        public void s0(c.a aVar, q1 q1Var) {
            n3.b.p0(this, aVar, q1Var);
        }

        @Override
        public void t(c.a aVar, String str, long j10) {
            n3.b.c(this, aVar, str, j10);
        }

        @Override
        public void t0(c.a aVar, q1 q1Var, h hVar) {
            n3.b.i(this, aVar, q1Var, hVar);
        }

        @Override
        public void u(c.a aVar, boolean z10, int i10) {
            n3.b.P(this, aVar, z10, i10);
        }

        @Override
        public void u0(c.a aVar, o3.e eVar) {
            n3.b.a(this, aVar, eVar);
        }

        @Override
        public void v(c.a aVar, int i10, q1 q1Var) {
            n3.b.s(this, aVar, i10, q1Var);
        }

        @Override
        public void w(c.a aVar, b0 b0Var) {
            n3.b.s0(this, aVar, b0Var);
        }

        @Override
        public void x(c.a aVar, int i10, long j10) {
            n3.b.D(this, aVar, i10, j10);
        }

        @Override
        public void y(c.a aVar, r2 r2Var) {
            n3.b.Q(this, aVar, r2Var);
        }

        @Override
        public void z(c.a aVar, r0 r0Var, v vVar) {
            n3.b.g0(this, aVar, r0Var, vVar);
        }
    }

    public class b extends kb.b {
        public b() {
        }

        @Override
        public void b() {
            if (j0.r(t1.this.f19853a).C0().T6()) {
                t1.this.M0();
            }
        }
    }

    public interface c {
        void c(boolean z10);

        void h();

        void j(boolean z10);

        void p(long j10, long j11);

        void q();
    }

    public static class d extends Handler {
        public d() {
        }

        @Override
        public void handleMessage(Message message) {
            ((t1) message.obj).N0();
        }
    }

    public t1(Context context, ViewGroup viewGroup, int i10) {
        this.f19853a = context;
        this.R = viewGroup;
        this.S = i10;
    }

    public void r0(DialogInterface dialogInterface, int i10) {
        this.V = null;
        dialogInterface.dismiss();
    }

    public void s0(DialogInterface dialogInterface) {
        this.V = null;
    }

    public void A0(c cVar) {
        this.f19863h0 = cVar;
    }

    @Override
    public void B(boolean z10) {
        u2.i(this, z10);
    }

    public final void B0(s sVar) {
        s sVar2;
        m3.s sVar3 = this.f19857c;
        if (sVar3 != null && (sVar2 = this.Z) != sVar) {
            if (sVar2 != null) {
                boolean z10 = sVar2 instanceof o4.d;
            }
            this.Z = sVar;
            sVar3.w(sVar);
            this.f19857c.b();
        }
    }

    public final void C0(boolean z10) {
        if (this.f19867l0 != z10) {
            this.f19867l0 = z10;
            Z();
        }
    }

    @Override
    public void D(int i10) {
    }

    public void D0() {
        this.Q = true;
    }

    public final void E0(boolean z10) {
        if (z10) {
            if (this.U == null) {
                b bVar = new b();
                this.U = bVar;
                j0.e0(bVar, 5000L);
            }
        } else if (this.U != null) {
            AlertDialog alertDialog = this.V;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            this.U.c();
            this.U = null;
            this.V = null;
        }
    }

    public final void F0(boolean z10) {
        this.O = z10;
    }

    @Override
    public void F4(o6 o6Var, TdApi.Call call) {
        C0(call != null);
    }

    public void G0(boolean z10) {
        if (this.f19866k0 != z10) {
            this.f19866k0 = z10;
            Z();
        }
    }

    @Override
    public void H(boolean z10) {
        u2.g(this, z10);
    }

    public void H0(boolean z10) {
        this.N = z10;
    }

    @Override
    public void I() {
    }

    public final void I0(boolean z10) {
        if (this.f19865j0 != z10) {
            this.f19865j0 = z10;
            if (z10) {
                N0();
            } else {
                this.f19855b.removeMessages(0);
            }
            m3.s sVar = this.f19857c;
            if (sVar != null) {
                sVar.x(z10);
            }
            c cVar = this.f19863h0;
            if (cVar != null) {
                cVar.j(z10);
            }
            j0.r(this.f19853a).s3(2, z10);
        }
    }

    public void J0(float f10) {
        m3.s sVar = this.f19857c;
        if (sVar != null) {
            sVar.c((long) (sVar.g() * f10));
            N0();
        }
    }

    @Override
    public void K(t3 t3Var) {
        u2.D(this, t3Var);
    }

    public boolean K0(long j10, long j11) {
        if (this.X == j10 && this.Y == j11) {
            return false;
        }
        this.X = j10;
        this.Y = j11;
        if (j10 == -1 || j11 == -1) {
            B0(this.W);
            return true;
        }
        B0(new o4.d(this.W, j10, j11));
        return true;
    }

    @Override
    public void L(s2.e eVar, s2.e eVar2, int i10) {
        u2.u(this, eVar, eVar2, i10);
    }

    public void L0(qd.b r9) {
        throw new UnsupportedOperationException("Method not decompiled: od.t1.L0(qd.b):void");
    }

    @Override
    public void M(float f10) {
        u2.F(this, f10);
    }

    public final void M0() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f19853a, j.t());
        builder.setTitle(w.i1(R.string.Warning));
        builder.setMessage(w.i1(R.string.LongStreamingPreloadAlert));
        builder.setPositiveButton(w.i1(R.string.LongStreamingPreloadAlertClose), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                t1.this.r0(dialogInterface, i10);
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                t1.this.s0(dialogInterface);
            }
        });
        this.V = j0.r(this.f19853a).x3(builder);
    }

    @Override
    public void N(int i10) {
        m3.s sVar;
        c cVar = this.f19863h0;
        if (cVar != null) {
            if (i10 == 3) {
                cVar.q();
            }
            this.f19863h0.c(i10 == 2);
        }
        if (i10 == 4) {
            if (!this.O || (sVar = this.f19857c) == null) {
                x0();
            } else {
                sVar.c(0L);
            }
        }
    }

    public final void N0() {
        m3.s sVar;
        if (!(this.f19863h0 == null || (sVar = this.f19857c) == null || sVar.g() == -9223372036854775807L)) {
            this.f19864i0 = this.f19857c.V();
            this.f19863h0.p(this.f19857c.g(), this.f19864i0);
        }
        if (this.f19865j0 && !this.f19868m0 && !this.N) {
            d dVar = this.f19855b;
            dVar.sendMessageDelayed(Message.obtain(dVar, 0, this), f19852n0);
        }
    }

    public void O() {
        if (this.f19856b0) {
            boolean z10 = false;
            this.f19856b0 = false;
            qd.b bVar = this.f19858c0;
            if (bVar != null) {
                z10 = true;
            }
            this.f19860e0 = z10;
            L0(bVar);
            this.f19858c0 = null;
        }
    }

    @Override
    public void Q(boolean z10) {
    }

    @Override
    public void S(o3 o3Var, int i10) {
        u2.B(this, o3Var, i10);
    }

    @Override
    public void T(int i10, boolean z10) {
        u2.e(this, i10, z10);
    }

    @Override
    public void U(boolean z10, int i10) {
        u2.s(this, z10, i10);
    }

    @Override
    public void V(c2 c2Var) {
        u2.k(this, c2Var);
    }

    @Override
    public void X(int i10) {
        u2.w(this, i10);
    }

    @Override
    public void Y(o3.e eVar) {
        u2.a(this, eVar);
    }

    public final void Z() {
        boolean z10 = this.f19866k0 || this.f19867l0;
        m3.s sVar = this.f19857c;
        if (sVar != null) {
            sVar.f(z10 ? 0.0f : 1.0f);
        }
    }

    public boolean a0() {
        qd.b bVar = this.T;
        if (bVar == null || this.f19856b0) {
            return false;
        }
        if (bVar.q0()) {
            return K0(this.T.W(), this.T.V());
        }
        return K0(-1L, -1L);
    }

    @Override
    public void b(boolean z10) {
        u2.z(this, z10);
    }

    public void b0() {
        this.f19854a0 = true;
        L0(null);
    }

    @Override
    public void c0(boolean z10, int i10) {
        u2.m(this, z10, i10);
    }

    @Override
    public void d0(y1 y1Var, int i10) {
        u2.j(this, y1Var, i10);
    }

    @Override
    public void e0(s2 s2Var, s2.c cVar) {
        u2.f(this, s2Var, cVar);
    }

    @Override
    public void g(r2 r2Var) {
        u2.n(this, r2Var);
    }

    public void g0() {
        if (!this.f19856b0) {
            this.f19858c0 = this.T;
            this.f19859d0 = this.f19864i0;
            m3.s sVar = this.f19857c;
            if (sVar != null) {
                sVar.x(false);
            }
            I0(false);
            L0(null);
            this.f19856b0 = true;
        }
    }

    @Override
    public void h0(o2 o2Var) {
        boolean z10;
        boolean z11 = true;
        if (!v0.u1(o2Var) || !(z10 = this.f19862g0)) {
            Log.e(Log.TAG_VIDEO, "Unable to play video", o2Var, new Object[0]);
            qd.b bVar = this.T;
            if (bVar == null || !bVar.e0()) {
                z11 = false;
            }
            j0.y0(v0.z1(o2Var) ? z11 ? R.string.GifPlaybackUnsupported : R.string.VideoPlaybackUnsupported : z11 ? R.string.GifPlaybackError : R.string.VideoPlaybackError, 0);
            L0(null);
            c cVar = this.f19863h0;
            if (cVar != null) {
                cVar.h();
                return;
            }
            return;
        }
        Log.w(Log.TAG_VIDEO, "Unable to play video, but trying to retry, preferExtensions:%b", o2Var, Boolean.valueOf(z10));
        this.f19862g0 = !this.f19862g0;
        boolean z12 = this.f19865j0;
        qd.b bVar2 = this.T;
        L0(null);
        L0(bVar2);
        I0(z12);
    }

    @Override
    public void i0(int i10, int i11) {
        u2.A(this, i10, i11);
    }

    @Override
    public void j0(r0 r0Var, v vVar) {
        u2.C(this, r0Var, vVar);
    }

    public void k0(boolean z10) {
        this.P = z10;
    }

    public View l0() {
        return this.M;
    }

    @Override
    public void m0(s2.b bVar) {
        u2.b(this, bVar);
    }

    @Override
    public void n0(o oVar) {
        u2.d(this, oVar);
    }

    @Override
    public void o(f4.a aVar) {
        u2.l(this, aVar);
    }

    @Override
    public void o0(o2 o2Var) {
        u2.r(this, o2Var);
    }

    @Override
    public void p0(boolean z10) {
        u2.h(this, z10);
    }

    @Override
    public void q() {
        u2.v(this);
    }

    public boolean q0() {
        return this.f19865j0;
    }

    @Override
    public void r(List list) {
        u2.c(this, list);
    }

    @Override
    public void run() {
    }

    public void t0() {
        boolean z10 = this.f19865j0 && this.f19857c != null;
        this.f19868m0 = z10;
        if (z10) {
            this.f19857c.x(false);
        }
    }

    public void u0() {
        I0(!this.f19865j0);
    }

    public View v0(boolean z10) {
        if (this.M == null) {
            TextureView textureView = new TextureView(this.f19853a);
            this.M = textureView;
            textureView.setLayoutParams(FrameLayoutFix.q1(-2, -2));
        }
        return this.M;
    }

    public void w0() {
        View view = this.M;
        if (view != null) {
            view.requestLayout();
        }
    }

    @Override
    public void x(b0 b0Var) {
        qd.b bVar;
        int i10;
        int i11;
        View view;
        if (this.f19857c != null && (bVar = this.T) != null && (i10 = b0Var.f6207a) != 0 && (i11 = b0Var.f6208b) != 0 && bVar.z0(i10, i11) && (view = this.M) != null) {
            view.requestLayout();
        }
    }

    public final void x0() {
        I0(false);
        m3.s sVar = this.f19857c;
        if (sVar != null) {
            sVar.c(0L);
        }
        N0();
    }

    public void y0(float f10) {
        m3.s sVar = this.f19857c;
        if (sVar != null) {
            sVar.c((long) (sVar.g() * f10));
            if (this.f19868m0) {
                this.f19868m0 = false;
                this.f19857c.x(true);
            }
            N0();
        }
    }

    @Override
    public void z(int i10) {
        u2.p(this, i10);
    }

    public void z0(o oVar) {
        this.f19861f0 = oVar;
    }
}
