package m3;

import a5.b0;
import a5.c0;
import a5.v;
import a7.q;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import c5.d0;
import c5.g;
import c5.n;
import c5.r;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import d5.k;
import d5.o;
import d5.z;
import f4.a;
import f4.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import m3.b;
import m3.b1;
import m3.d;
import m3.j2;
import m3.j3;
import m3.m1;
import m3.o3;
import m3.s;
import m3.s2;
import m3.w2;
import n3.p1;
import o3.e;
import o3.h;
import o4.l0;
import o4.r0;
import o4.s;
import q4.l;

public final class b1 extends m3.e implements s {
    public final m3.d A;
    public final j3 B;
    public final u3 C;
    public final v3 D;
    public final long E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public int K;
    public g3 L;
    public l0 M;
    public boolean N;
    public s2.b O;
    public c2 P;
    public c2 Q;
    public q1 R;
    public q1 S;
    public AudioTrack T;
    public Object U;
    public Surface V;
    public SurfaceHolder W;
    public SphericalGLSurfaceView X;
    public boolean Y;
    public TextureView Z;
    public int f16493a0;
    public final c0 f16494b;
    public int f16495b0;
    public final s2.b f16496c;
    public int f16497c0;
    public final g f16498d;
    public int f16499d0;
    public final Context f16500e;
    public p3.e f16501e0;
    public final s2 f16502f;
    public p3.e f16503f0;
    public final b3[] f16504g;
    public int f16505g0;
    public final b0 f16506h;
    public o3.e f16507h0;
    public final n f16508i;
    public float f16509i0;
    public final m1.f f16510j;
    public boolean f16511j0;
    public final m1 f16512k;
    public List<q4.b> f16513k0;
    public final r<s2.d> f16514l;
    public boolean f16515l0;
    public final CopyOnWriteArraySet<s.a> f16516m;
    public boolean f16517m0;
    public final o3.b f16518n;
    public d0 f16519n0;
    public final List<e> f16520o;
    public boolean f16521o0;
    public final boolean f16522p;
    public boolean f16523p0;
    public final s.a f16524q;
    public o f16525q0;
    public final n3.a f16526r;
    public d5.b0 f16527r0;
    public final Looper f16528s;
    public c2 f16529s0;
    public final b5.e f16530t;
    public p2 f16531t0;
    public final long f16532u;
    public int f16533u0;
    public final long f16534v;
    public int f16535v0;
    public final c5.d f16536w;
    public long f16537w0;
    public final c f16538x;
    public final d f16539y;
    public final m3.b f16540z;

    public static final class b {
        public static p1 a() {
            return new p1(LogSessionId.LOG_SESSION_ID_NONE);
        }
    }

    public final class c implements z, o3.s, l, f, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.b, d.b, b.AbstractC0152b, j3.b, s.a {
        public c() {
        }

        public void P(s2.d dVar) {
            dVar.V(b1.this.P);
        }

        @Override
        public void A(float f10) {
            b1.this.d2();
        }

        @Override
        public void B(int i10) {
            boolean k10 = b1.this.k();
            b1.this.m2(k10, i10, b1.p1(k10, i10));
        }

        @Override
        public void C(Surface surface) {
            b1.this.i2(null);
        }

        @Override
        public void D(q1 q1Var) {
            h.a(this, q1Var);
        }

        @Override
        public void E(Surface surface) {
            b1.this.i2(surface);
        }

        @Override
        public void F(final int i10, final boolean z10) {
            b1.this.f16514l.l(30, new r.a() {
                @Override
                public final void a(Object obj) {
                    ((s2.d) obj).T(i10, z10);
                }
            });
        }

        @Override
        public void G(boolean z10) {
            r.a(this, z10);
        }

        @Override
        public void a(int i10) {
            final o g12 = b1.g1(b1.this.B);
            if (!g12.equals(b1.this.f16525q0)) {
                b1.this.f16525q0 = g12;
                b1.this.f16514l.l(29, new r.a() {
                    @Override
                    public final void a(Object obj) {
                        ((s2.d) obj).n0(o.this);
                    }
                });
            }
        }

        @Override
        public void b(final boolean z10) {
            if (b1.this.f16511j0 != z10) {
                b1.this.f16511j0 = z10;
                b1.this.f16514l.l(23, new r.a() {
                    @Override
                    public final void a(Object obj) {
                        ((s2.d) obj).b(z10);
                    }
                });
            }
        }

        @Override
        public void c(Exception exc) {
            b1.this.f16526r.c(exc);
        }

        @Override
        public void d(p3.e eVar) {
            b1.this.f16501e0 = eVar;
            b1.this.f16526r.d(eVar);
        }

        @Override
        public void e(String str) {
            b1.this.f16526r.e(str);
        }

        @Override
        public void f(String str, long j10, long j11) {
            b1.this.f16526r.f(str, j10, j11);
        }

        @Override
        public void g() {
            b1.this.m2(false, -1, 3);
        }

        @Override
        public void h(String str) {
            b1.this.f16526r.h(str);
        }

        @Override
        public void i(String str, long j10, long j11) {
            b1.this.f16526r.i(str, j10, j11);
        }

        @Override
        public void j(p3.e eVar) {
            b1.this.f16526r.j(eVar);
            b1.this.S = null;
            b1.this.f16503f0 = null;
        }

        @Override
        public void k(q1 q1Var, p3.h hVar) {
            b1.this.S = q1Var;
            b1.this.f16526r.k(q1Var, hVar);
        }

        @Override
        public void l(p3.e eVar) {
            b1.this.f16526r.l(eVar);
            b1.this.R = null;
            b1.this.f16501e0 = null;
        }

        @Override
        public void m(int i10, long j10) {
            b1.this.f16526r.m(i10, j10);
        }

        @Override
        public void n(q1 q1Var, p3.h hVar) {
            b1.this.R = q1Var;
            b1.this.f16526r.n(q1Var, hVar);
        }

        @Override
        public void o(final f4.a aVar) {
            b1 b1Var = b1.this;
            b1Var.f16529s0 = b1Var.f16529s0.b().J(aVar).G();
            c2 e12 = b1.this.e1();
            if (!e12.equals(b1.this.P)) {
                b1.this.P = e12;
                b1.this.f16514l.i(14, new r.a() {
                    @Override
                    public final void a(Object obj) {
                        b1.c.this.P((s2.d) obj);
                    }
                });
            }
            b1.this.f16514l.i(28, new r.a() {
                @Override
                public final void a(Object obj) {
                    ((s2.d) obj).o(a.this);
                }
            });
            b1.this.f16514l.f();
        }

        @Override
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            b1.this.h2(surfaceTexture);
            b1.this.X1(i10, i11);
        }

        @Override
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            b1.this.i2(null);
            b1.this.X1(0, 0);
            return true;
        }

        @Override
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            b1.this.X1(i10, i11);
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override
        public void p(Object obj, long j10) {
            b1.this.f16526r.p(obj, j10);
            if (b1.this.U == obj) {
                b1.this.f16514l.l(26, j1.f16715a);
            }
        }

        @Override
        public void q(boolean z10) {
            b1.this.p2();
        }

        @Override
        public void r(final List<q4.b> list) {
            b1.this.f16513k0 = list;
            b1.this.f16514l.l(27, new r.a() {
                @Override
                public final void a(Object obj) {
                    ((s2.d) obj).r(list);
                }
            });
        }

        @Override
        public void s(long j10) {
            b1.this.f16526r.s(j10);
        }

        @Override
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            b1.this.X1(i11, i12);
        }

        @Override
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (b1.this.Y) {
                b1.this.i2(surfaceHolder.getSurface());
            }
        }

        @Override
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (b1.this.Y) {
                b1.this.i2(null);
            }
            b1.this.X1(0, 0);
        }

        @Override
        public void t(Exception exc) {
            b1.this.f16526r.t(exc);
        }

        @Override
        public void u(Exception exc) {
            b1.this.f16526r.u(exc);
        }

        @Override
        public void v(p3.e eVar) {
            b1.this.f16503f0 = eVar;
            b1.this.f16526r.v(eVar);
        }

        @Override
        public void w(int i10, long j10, long j11) {
            b1.this.f16526r.w(i10, j10, j11);
        }

        @Override
        public void x(final d5.b0 b0Var) {
            b1.this.f16527r0 = b0Var;
            b1.this.f16514l.l(25, new r.a() {
                @Override
                public final void a(Object obj) {
                    ((s2.d) obj).x(d5.b0.this);
                }
            });
        }

        @Override
        public void y(long j10, int i10) {
            b1.this.f16526r.y(j10, i10);
        }

        @Override
        public void z(q1 q1Var) {
            o.a(this, q1Var);
        }
    }

    public static final class d implements d5.l, e5.a, w2.b {
        public e5.a M;
        public d5.l f16542a;
        public e5.a f16543b;
        public d5.l f16544c;

        public d() {
        }

        @Override
        public void a(long j10, float[] fArr) {
            e5.a aVar = this.M;
            if (aVar != null) {
                aVar.a(j10, fArr);
            }
            e5.a aVar2 = this.f16543b;
            if (aVar2 != null) {
                aVar2.a(j10, fArr);
            }
        }

        @Override
        public void d() {
            e5.a aVar = this.M;
            if (aVar != null) {
                aVar.d();
            }
            e5.a aVar2 = this.f16543b;
            if (aVar2 != null) {
                aVar2.d();
            }
        }

        @Override
        public void g(long j10, long j11, q1 q1Var, MediaFormat mediaFormat) {
            d5.l lVar = this.f16544c;
            if (lVar != null) {
                lVar.g(j10, j11, q1Var, mediaFormat);
            }
            d5.l lVar2 = this.f16542a;
            if (lVar2 != null) {
                lVar2.g(j10, j11, q1Var, mediaFormat);
            }
        }

        @Override
        public void t(int i10, Object obj) {
            if (i10 == 7) {
                this.f16542a = (d5.l) obj;
            } else if (i10 == 8) {
                this.f16543b = (e5.a) obj;
            } else if (i10 == 10000) {
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
                if (sphericalGLSurfaceView == null) {
                    this.f16544c = null;
                    this.M = null;
                    return;
                }
                this.f16544c = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.M = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }
    }

    public static final class e implements h2 {
        public final Object f16545a;
        public o3 f16546b;

        public e(Object obj, o3 o3Var) {
            this.f16545a = obj;
            this.f16546b = o3Var;
        }

        @Override
        public Object a() {
            return this.f16545a;
        }

        @Override
        public o3 b() {
            return this.f16546b;
        }
    }

    static {
        n1.a("goog.exo.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public b1(s.b bVar, s2 s2Var) {
        g gVar = new g();
        this.f16498d = gVar;
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = c5.l0.f4845e;
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
            sb2.append("Init ");
            sb2.append(hexString);
            sb2.append(" [");
            sb2.append("ExoPlayerLib/2.17.1");
            sb2.append("] [");
            sb2.append(str);
            sb2.append("]");
            c5.s.f("ExoPlayerImpl", sb2.toString());
            Context applicationContext = bVar.f16952a.getApplicationContext();
            this.f16500e = applicationContext;
            n3.a apply = bVar.f16960i.apply(bVar.f16953b);
            this.f16526r = apply;
            this.f16519n0 = bVar.f16962k;
            this.f16507h0 = bVar.f16963l;
            this.f16493a0 = bVar.f16968q;
            this.f16495b0 = bVar.f16969r;
            this.f16511j0 = bVar.f16967p;
            this.E = bVar.f16976y;
            c cVar = new c();
            this.f16538x = cVar;
            d dVar = new d();
            this.f16539y = dVar;
            Handler handler = new Handler(bVar.f16961j);
            b3[] a10 = bVar.f16955d.get().a(handler, cVar, cVar, cVar, cVar);
            this.f16504g = a10;
            c5.a.f(a10.length > 0);
            b0 b0Var = bVar.f16957f.get();
            this.f16506h = b0Var;
            this.f16524q = bVar.f16956e.get();
            b5.e eVar = bVar.f16959h.get();
            this.f16530t = eVar;
            this.f16522p = bVar.f16970s;
            this.L = bVar.f16971t;
            this.f16532u = bVar.f16972u;
            this.f16534v = bVar.f16973v;
            this.N = bVar.f16977z;
            Looper looper = bVar.f16961j;
            this.f16528s = looper;
            c5.d dVar2 = bVar.f16953b;
            this.f16536w = dVar2;
            b1 b1Var = s2Var == null ? this : s2Var;
            this.f16502f = b1Var;
            this.f16514l = new r<>(looper, dVar2, new r.b() {
                @Override
                public final void a(Object obj, c5.l lVar) {
                    b1.this.x1((s2.d) obj, lVar);
                }
            });
            this.f16516m = new CopyOnWriteArraySet<>();
            this.f16520o = new ArrayList();
            this.M = new l0.a(0);
            c0 c0Var = new c0(new e3[a10.length], new a5.r[a10.length], t3.f16996b, null);
            this.f16494b = c0Var;
            this.f16518n = new o3.b();
            s2.b e10 = new s2.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).d(29, b0Var.c()).e();
            this.f16496c = e10;
            this.O = new s2.b.a().b(e10).a(4).a(10).e();
            this.f16508i = dVar2.b(looper, null);
            m1.f s0Var = new m1.f() {
                @Override
                public final void a(m1.e eVar2) {
                    b1.this.z1(eVar2);
                }
            };
            this.f16510j = s0Var;
            this.f16531t0 = p2.k(c0Var);
            apply.R(b1Var, looper);
            int i10 = c5.l0.f4841a;
            o3.e eVar2 = null;
            m1 m1Var = new m1(a10, b0Var, c0Var, bVar.f16958g.get(), eVar, this.F, this.G, apply, this.L, bVar.f16974w, bVar.f16975x, this.N, looper, dVar2, s0Var, i10 < 31 ? new p1() : b.a());
            this.f16512k = m1Var;
            this.f16509i0 = 1.0f;
            this.F = 0;
            c2 c2Var = c2.f16553q0;
            this.P = c2Var;
            this.Q = c2Var;
            this.f16529s0 = c2Var;
            this.f16533u0 = -1;
            if (i10 < 21) {
                this.f16505g0 = u1(0);
            } else {
                this.f16505g0 = c5.l0.C(applicationContext);
            }
            this.f16513k0 = q.D();
            this.f16515l0 = true;
            U(apply);
            eVar.a(new Handler(looper), apply);
            c1(cVar);
            long j10 = bVar.f16954c;
            if (j10 > 0) {
                m1Var.t(j10);
            }
            m3.b bVar2 = new m3.b(bVar.f16952a, handler, cVar);
            this.f16540z = bVar2;
            bVar2.b(bVar.f16966o);
            m3.d dVar3 = new m3.d(bVar.f16952a, handler, cVar);
            this.A = dVar3;
            if (bVar.f16964m) {
                eVar2 = this.f16507h0;
            }
            dVar3.m(eVar2);
            j3 j3Var = new j3(bVar.f16952a, handler, cVar);
            this.B = j3Var;
            j3Var.h(c5.l0.Z(this.f16507h0.f18766c));
            u3 u3Var = new u3(bVar.f16952a);
            this.C = u3Var;
            u3Var.a(bVar.f16965n != 0);
            v3 v3Var = new v3(bVar.f16952a);
            this.D = v3Var;
            v3Var.a(bVar.f16965n == 2);
            this.f16525q0 = g1(j3Var);
            this.f16527r0 = d5.b0.N;
            c2(1, 10, Integer.valueOf(this.f16505g0));
            c2(2, 10, Integer.valueOf(this.f16505g0));
            c2(1, 3, this.f16507h0);
            c2(2, 4, Integer.valueOf(this.f16493a0));
            c2(2, 5, Integer.valueOf(this.f16495b0));
            c2(1, 9, Boolean.valueOf(this.f16511j0));
            c2(2, 7, dVar);
            c2(6, 8, dVar);
            gVar.e();
        } catch (Throwable th) {
            this.f16498d.e();
            throw th;
        }
    }

    public static void A1(s2.d dVar) {
        dVar.h0(q.j(new o1(1), 1003));
    }

    public void F1(s2.d dVar) {
        dVar.m0(this.O);
    }

    public static void G1(p2 p2Var, int i10, s2.d dVar) {
        dVar.S(p2Var.f16875a, i10);
    }

    public static void H1(int i10, s2.e eVar, s2.e eVar2, s2.d dVar) {
        dVar.D(i10);
        dVar.L(eVar, eVar2, i10);
    }

    public static void J1(p2 p2Var, s2.d dVar) {
        dVar.o0(p2Var.f16880f);
    }

    public static void K1(p2 p2Var, s2.d dVar) {
        dVar.h0(p2Var.f16880f);
    }

    public static void L1(p2 p2Var, v vVar, s2.d dVar) {
        dVar.j0(p2Var.f16882h, vVar);
    }

    public static void M1(p2 p2Var, s2.d dVar) {
        dVar.K(p2Var.f16883i.f476d);
    }

    public static void O1(p2 p2Var, s2.d dVar) {
        dVar.B(p2Var.f16881g);
        dVar.H(p2Var.f16881g);
    }

    public static void P1(p2 p2Var, s2.d dVar) {
        dVar.U(p2Var.f16886l, p2Var.f16879e);
    }

    public static void Q1(p2 p2Var, s2.d dVar) {
        dVar.N(p2Var.f16879e);
    }

    public static void R1(p2 p2Var, int i10, s2.d dVar) {
        dVar.c0(p2Var.f16886l, i10);
    }

    public static void S1(p2 p2Var, s2.d dVar) {
        dVar.z(p2Var.f16887m);
    }

    public static void T1(p2 p2Var, s2.d dVar) {
        dVar.p0(v1(p2Var));
    }

    public static void U1(p2 p2Var, s2.d dVar) {
        dVar.g(p2Var.f16888n);
    }

    public static o g1(j3 j3Var) {
        return new o(0, j3Var.d(), j3Var.c());
    }

    public static int p1(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    public static long s1(p2 p2Var) {
        o3.d dVar = new o3.d();
        o3.b bVar = new o3.b();
        p2Var.f16875a.l(p2Var.f16876b.f19169a, bVar);
        if (p2Var.f16877c == -9223372036854775807L) {
            return p2Var.f16875a.r(bVar.f16862c, dVar).e();
        }
        return bVar.q() + p2Var.f16877c;
    }

    public static boolean v1(p2 p2Var) {
        return p2Var.f16879e == 3 && p2Var.f16886l && p2Var.f16887m == 0;
    }

    public void x1(s2.d dVar, c5.l lVar) {
        dVar.e0(this.f16502f, new s2.c(lVar));
    }

    public void z1(final m1.e eVar) {
        this.f16508i.c(new Runnable() {
            @Override
            public final void run() {
                b1.this.y1(eVar);
            }
        });
    }

    @Override
    public void A(int i10, o4.s sVar) {
        q2();
        e(i10, Collections.singletonList(sVar));
    }

    @Override
    public long B() {
        q2();
        if (!h()) {
            return V();
        }
        p2 p2Var = this.f16531t0;
        p2Var.f16875a.l(p2Var.f16876b.f19169a, this.f16518n);
        p2 p2Var2 = this.f16531t0;
        if (p2Var2.f16877c == -9223372036854775807L) {
            return p2Var2.f16875a.r(I(), this.f16628a).d();
        }
        return this.f16518n.p() + c5.l0.I0(this.f16531t0.f16877c);
    }

    @Override
    public int E() {
        q2();
        return this.f16531t0.f16879e;
    }

    @Override
    public void G(final o3.e eVar, boolean z10) {
        q2();
        if (!this.f16523p0) {
            if (!c5.l0.c(this.f16507h0, eVar)) {
                this.f16507h0 = eVar;
                c2(1, 3, eVar);
                this.B.h(c5.l0.Z(eVar.f18766c));
                this.f16514l.i(20, new r.a() {
                    @Override
                    public final void a(Object obj) {
                        ((s2.d) obj).Y(e.this);
                    }
                });
            }
            m3.d dVar = this.A;
            if (!z10) {
                eVar = null;
            }
            dVar.m(eVar);
            boolean k10 = k();
            int p10 = this.A.p(k10, E());
            m2(k10, p10, p1(k10, p10));
            this.f16514l.f();
        }
    }

    @Override
    public int H() {
        q2();
        if (h()) {
            return this.f16531t0.f16876b.f19170b;
        }
        return -1;
    }

    @Override
    public int I() {
        q2();
        int n12 = n1();
        if (n12 == -1) {
            return 0;
        }
        return n12;
    }

    @Override
    public void J(final int i10) {
        q2();
        if (this.F != i10) {
            this.F = i10;
            this.f16512k.U0(i10);
            this.f16514l.i(8, new r.a() {
                @Override
                public final void a(Object obj) {
                    ((s2.d) obj).X(i10);
                }
            });
            l2();
            this.f16514l.f();
        }
    }

    @Override
    public void M(int i10, int i11, int i12) {
        q2();
        c5.a.a(i10 >= 0 && i10 <= i11 && i11 <= this.f16520o.size() && i12 >= 0);
        o3 R = R();
        this.H++;
        int min = Math.min(i12, this.f16520o.size() - (i11 - i10));
        c5.l0.q0(this.f16520o, i10, i11, min);
        o3 h12 = h1();
        p2 V1 = V1(this.f16531t0, h12, o1(R, h12));
        this.f16512k.e0(i10, i11, min, this.M);
        n2(V1, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override
    public void O(s2.d dVar) {
        c5.a.e(dVar);
        this.f16514l.k(dVar);
    }

    @Override
    public r0 P() {
        q2();
        return this.f16531t0.f16882h;
    }

    @Override
    public int Q() {
        q2();
        return this.F;
    }

    @Override
    public o3 R() {
        q2();
        return this.f16531t0.f16875a;
    }

    @Override
    public boolean S() {
        q2();
        return this.G;
    }

    @Override
    public void T(TextureView textureView) {
        q2();
        if (textureView == null) {
            f1();
            return;
        }
        b2();
        this.Z = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            c5.s.i("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f16538x);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            i2(null);
            X1(0, 0);
            return;
        }
        h2(surfaceTexture);
        X1(textureView.getWidth(), textureView.getHeight());
    }

    @Override
    public void U(s2.d dVar) {
        c5.a.e(dVar);
        this.f16514l.c(dVar);
    }

    @Override
    public long V() {
        q2();
        return c5.l0.I0(m1(this.f16531t0));
    }

    public final p2 V1(p2 p2Var, o3 o3Var, Pair<Object, Long> pair) {
        int i10;
        long j10;
        c5.a.a(o3Var.u() || pair != null);
        o3 o3Var2 = p2Var.f16875a;
        p2 j11 = p2Var.j(o3Var);
        if (o3Var.u()) {
            s.b l10 = p2.l();
            long r02 = c5.l0.r0(this.f16537w0);
            p2 b10 = j11.c(l10, r02, r02, r02, 0L, r0.M, this.f16494b, q.D()).b(l10);
            b10.f16891q = b10.f16893s;
            return b10;
        }
        Object obj = j11.f16876b.f19169a;
        boolean z10 = !obj.equals(((Pair) c5.l0.j(pair)).first);
        s.b bVar = z10 ? new s.b(pair.first) : j11.f16876b;
        long longValue = ((Long) pair.second).longValue();
        long r03 = c5.l0.r0(B());
        if (!o3Var2.u()) {
            r03 -= o3Var2.l(obj, this.f16518n).q();
        }
        if (z10 || longValue < r03) {
            c5.a.f(!bVar.b());
            p2 b11 = j11.c(bVar, longValue, longValue, longValue, 0L, z10 ? r0.M : j11.f16882h, z10 ? this.f16494b : j11.f16883i, z10 ? q.D() : j11.f16884j).b(bVar);
            b11.f16891q = longValue;
            return b11;
        }
        if (i10 == 0) {
            int f10 = o3Var.f(j11.f16885k.f19169a);
            if (f10 == -1 || o3Var.j(f10, this.f16518n).f16862c != o3Var.l(bVar.f19169a, this.f16518n).f16862c) {
                o3Var.l(bVar.f19169a, this.f16518n);
                if (bVar.b()) {
                    j10 = this.f16518n.e(bVar.f19170b, bVar.f19171c);
                } else {
                    j10 = this.f16518n.M;
                }
                j11 = j11.c(bVar, j11.f16893s, j11.f16893s, j11.f16878d, j10 - j11.f16893s, j11.f16882h, j11.f16883i, j11.f16884j).b(bVar);
                j11.f16891q = j10;
            }
        } else {
            c5.a.f(!bVar.b());
            long max = Math.max(0L, j11.f16892r - (longValue - r03));
            long j12 = j11.f16891q;
            if (j11.f16885k.equals(j11.f16876b)) {
                j12 = longValue + max;
            }
            j11 = j11.c(bVar, longValue, longValue, longValue, max, j11.f16882h, j11.f16883i, j11.f16884j);
            j11.f16891q = j12;
        }
        return j11;
    }

    public final Pair<Object, Long> W1(o3 o3Var, int i10, long j10) {
        if (o3Var.u()) {
            this.f16533u0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f16537w0 = j10;
            this.f16535v0 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= o3Var.t()) {
            i10 = o3Var.e(this.G);
            j10 = o3Var.r(i10, this.f16628a).d();
        }
        return o3Var.n(this.f16628a, this.f16518n, i10, c5.l0.r0(j10));
    }

    public final void X1(final int i10, final int i11) {
        if (i10 != this.f16497c0 || i11 != this.f16499d0) {
            this.f16497c0 = i10;
            this.f16499d0 = i11;
            this.f16514l.l(24, new r.a() {
                @Override
                public final void a(Object obj) {
                    ((s2.d) obj).i0(i10, i11);
                }
            });
        }
    }

    public final long Y1(o3 o3Var, s.b bVar, long j10) {
        o3Var.l(bVar.f19169a, this.f16518n);
        return j10 + this.f16518n.q();
    }

    public final p2 Z1(int i10, int i11) {
        boolean z10 = false;
        c5.a.a(i10 >= 0 && i11 >= i10 && i11 <= this.f16520o.size());
        int I = I();
        o3 R = R();
        int size = this.f16520o.size();
        this.H++;
        a2(i10, i11);
        o3 h12 = h1();
        p2 V1 = V1(this.f16531t0, h12, o1(R, h12));
        int i12 = V1.f16879e;
        if (i12 != 1 && i12 != 4 && i10 < i11 && i11 == size && I >= V1.f16875a.t()) {
            z10 = true;
        }
        if (z10) {
            V1 = V1.h(4);
        }
        this.f16512k.o0(i10, i11, this.M);
        return V1;
    }

    @Override
    public void a() {
        AudioTrack audioTrack;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = c5.l0.f4845e;
        String b10 = n1.b();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 36 + String.valueOf(str).length() + String.valueOf(b10).length());
        sb2.append("Release ");
        sb2.append(hexString);
        sb2.append(" [");
        sb2.append("ExoPlayerLib/2.17.1");
        sb2.append("] [");
        sb2.append(str);
        sb2.append("] [");
        sb2.append(b10);
        sb2.append("]");
        c5.s.f("ExoPlayerImpl", sb2.toString());
        q2();
        if (c5.l0.f4841a < 21 && (audioTrack = this.T) != null) {
            audioTrack.release();
            this.T = null;
        }
        this.f16540z.b(false);
        this.B.g();
        this.C.b(false);
        this.D.b(false);
        this.A.i();
        if (!this.f16512k.l0()) {
            this.f16514l.l(10, o0.f16853a);
        }
        this.f16514l.j();
        this.f16508i.k(null);
        this.f16530t.b(this.f16526r);
        p2 h10 = this.f16531t0.h(1);
        this.f16531t0 = h10;
        p2 b11 = h10.b(h10.f16876b);
        this.f16531t0 = b11;
        b11.f16891q = b11.f16893s;
        this.f16531t0.f16892r = 0L;
        this.f16526r.a();
        b2();
        Surface surface = this.V;
        if (surface != null) {
            surface.release();
            this.V = null;
        }
        if (this.f16521o0) {
            ((d0) c5.a.e(this.f16519n0)).b(0);
            this.f16521o0 = false;
        }
        this.f16513k0 = q.D();
        this.f16523p0 = true;
    }

    public final void a2(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f16520o.remove(i12);
        }
        this.M = this.M.b(i10, i11);
    }

    @Override
    public void b() {
        q2();
        boolean k10 = k();
        int i10 = 2;
        int p10 = this.A.p(k10, 2);
        m2(k10, p10, p1(k10, p10));
        p2 p2Var = this.f16531t0;
        if (p2Var.f16879e == 1) {
            p2 f10 = p2Var.f(null);
            if (f10.f16875a.u()) {
                i10 = 4;
            }
            p2 h10 = f10.h(i10);
            this.H++;
            this.f16512k.j0();
            n2(h10, 1, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    public final void b2() {
        if (this.X != null) {
            i1(this.f16539y).n(10000).m(null).l();
            this.X.i(this.f16538x);
            this.X = null;
        }
        TextureView textureView = this.Z;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f16538x) {
                c5.s.i("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.Z.setSurfaceTextureListener(null);
            }
            this.Z = null;
        }
        SurfaceHolder surfaceHolder = this.W;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f16538x);
            this.W = null;
        }
    }

    public void c1(s.a aVar) {
        this.f16516m.add(aVar);
    }

    public final void c2(int i10, int i11, Object obj) {
        b3[] b3VarArr;
        for (b3 b3Var : this.f16504g) {
            if (b3Var.k() == i10) {
                i1(b3Var).n(i11).m(obj).l();
            }
        }
    }

    @Override
    public void d(r2 r2Var) {
        q2();
        if (r2Var == null) {
            r2Var = r2.M;
        }
        if (!this.f16531t0.f16888n.equals(r2Var)) {
            p2 g10 = this.f16531t0.g(r2Var);
            this.H++;
            this.f16512k.S0(r2Var);
            n2(g10, 0, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    public final List<j2.c> d1(int i10, List<o4.s> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            j2.c cVar = new j2.c(list.get(i11), this.f16522p);
            arrayList.add(cVar);
            this.f16520o.add(i11 + i10, new e(cVar.f16735b, cVar.f16734a.L()));
        }
        this.M = this.M.f(i10, arrayList.size());
        return arrayList;
    }

    public final void d2() {
        c2(1, 2, Float.valueOf(this.f16509i0 * this.A.g()));
    }

    @Override
    public void e(int i10, List<o4.s> list) {
        q2();
        c5.a.a(i10 >= 0);
        o3 R = R();
        this.H++;
        List<j2.c> d12 = d1(i10, list);
        o3 h12 = h1();
        p2 V1 = V1(this.f16531t0, h12, o1(R, h12));
        this.f16512k.k(i10, d12, this.M);
        n2(V1, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public final c2 e1() {
        o3 R = R();
        if (R.u()) {
            return this.f16529s0;
        }
        return this.f16529s0.b().I(R.r(I(), this.f16628a).f16870c.N).G();
    }

    public void e2(List<o4.s> list, boolean z10) {
        q2();
        f2(list, -1, -9223372036854775807L, z10);
    }

    @Override
    public void f(float f10) {
        q2();
        final float o10 = c5.l0.o(f10, 0.0f, 1.0f);
        if (this.f16509i0 != o10) {
            this.f16509i0 = o10;
            d2();
            this.f16514l.l(22, new r.a() {
                @Override
                public final void a(Object obj) {
                    ((s2.d) obj).M(o10);
                }
            });
        }
    }

    public void f1() {
        q2();
        b2();
        i2(null);
        X1(0, 0);
    }

    public final void f2(List<o4.s> list, int i10, long j10, boolean z10) {
        int i11;
        long j11;
        int n12 = n1();
        long V = V();
        boolean z11 = true;
        this.H++;
        if (!this.f16520o.isEmpty()) {
            a2(0, this.f16520o.size());
        }
        List<j2.c> d12 = d1(0, list);
        o3 h12 = h1();
        if (h12.u() || i10 < h12.t()) {
            if (z10) {
                i11 = h12.e(this.G);
                j11 = -9223372036854775807L;
            } else if (i10 == -1) {
                i11 = n12;
                j11 = V;
            } else {
                i11 = i10;
                j11 = j10;
            }
            p2 V1 = V1(this.f16531t0, h12, W1(h12, i11, j11));
            int i12 = V1.f16879e;
            if (!(i11 == -1 || i12 == 1)) {
                i12 = (h12.u() || i11 >= h12.t()) ? 4 : 2;
            }
            p2 h10 = V1.h(i12);
            this.f16512k.N0(d12, i11, c5.l0.r0(j11), this.M);
            if (this.f16531t0.f16876b.f19169a.equals(h10.f16876b.f19169a) || this.f16531t0.f16875a.u()) {
                z11 = false;
            }
            n2(h10, 0, 1, false, z11, 4, m1(h10), -1);
            return;
        }
        throw new u1(h12, i10, j10);
    }

    @Override
    public long g() {
        q2();
        if (!h()) {
            return X();
        }
        p2 p2Var = this.f16531t0;
        s.b bVar = p2Var.f16876b;
        p2Var.f16875a.l(bVar.f19169a, this.f16518n);
        return c5.l0.I0(this.f16518n.e(bVar.f19170b, bVar.f19171c));
    }

    public final void g2(SurfaceHolder surfaceHolder) {
        this.Y = false;
        this.W = surfaceHolder;
        surfaceHolder.addCallback(this.f16538x);
        Surface surface = this.W.getSurface();
        if (surface == null || !surface.isValid()) {
            X1(0, 0);
            return;
        }
        Rect surfaceFrame = this.W.getSurfaceFrame();
        X1(surfaceFrame.width(), surfaceFrame.height());
    }

    @Override
    public boolean h() {
        q2();
        return this.f16531t0.f16876b.b();
    }

    public final o3 h1() {
        return new x2(this.f16520o, this.M);
    }

    public final void h2(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        i2(surface);
        this.V = surface;
    }

    @Override
    public long i() {
        q2();
        return c5.l0.I0(this.f16531t0.f16892r);
    }

    public final w2 i1(w2.b bVar) {
        int n12 = n1();
        m1 m1Var = this.f16512k;
        return new w2(m1Var, bVar, this.f16531t0.f16875a, n12 == -1 ? 0 : n12, this.f16536w, m1Var.A());
    }

    public final void i2(Object obj) {
        boolean z10;
        ArrayList<w2> arrayList = new ArrayList();
        b3[] b3VarArr = this.f16504g;
        int length = b3VarArr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= length) {
                break;
            }
            b3 b3Var = b3VarArr[i10];
            if (b3Var.k() == 2) {
                arrayList.add(i1(b3Var).n(1).m(obj).l());
            }
            i10++;
        }
        Object obj2 = this.U;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                for (w2 w2Var : arrayList) {
                    w2Var.a(this.E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.U;
            Surface surface = this.V;
            if (obj3 == surface) {
                surface.release();
                this.V = null;
            }
        }
        this.U = obj;
        if (z10) {
            k2(false, q.j(new o1(3), 1003));
        }
    }

    @Override
    public void j(int i10, long j10) {
        q2();
        this.f16526r.P();
        o3 o3Var = this.f16531t0.f16875a;
        if (i10 < 0 || (!o3Var.u() && i10 >= o3Var.t())) {
            throw new u1(o3Var, i10, j10);
        }
        int i11 = 1;
        this.H++;
        if (h()) {
            c5.s.i("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            m1.e eVar = new m1.e(this.f16531t0);
            eVar.b(1);
            this.f16510j.a(eVar);
            return;
        }
        if (E() != 1) {
            i11 = 2;
        }
        int I = I();
        p2 V1 = V1(this.f16531t0.h(i11), o3Var, W1(o3Var, i10, j10));
        this.f16512k.B0(o3Var, i10, c5.l0.r0(j10));
        n2(V1, 0, 1, true, true, 1, m1(V1), I);
    }

    public final Pair<Boolean, Integer> j1(p2 p2Var, p2 p2Var2, boolean z10, int i10, boolean z11) {
        o3 o3Var = p2Var2.f16875a;
        o3 o3Var2 = p2Var.f16875a;
        if (o3Var2.u() && o3Var.u()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (o3Var2.u() != o3Var.u()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (!o3Var.r(o3Var.l(p2Var2.f16876b.f19169a, this.f16518n).f16862c, this.f16628a).f16868a.equals(o3Var2.r(o3Var2.l(p2Var.f16876b.f19169a, this.f16518n).f16862c, this.f16628a).f16868a)) {
            if (z10 && i10 == 0) {
                i11 = 1;
            } else if (z10 && i10 == 1) {
                i11 = 2;
            } else if (!z11) {
                throw new IllegalStateException();
            }
            return new Pair<>(Boolean.TRUE, Integer.valueOf(i11));
        } else if (!z10 || i10 != 0 || p2Var2.f16876b.f19172d >= p2Var.f16876b.f19172d) {
            return new Pair<>(Boolean.FALSE, -1);
        } else {
            return new Pair<>(Boolean.TRUE, 0);
        }
    }

    public void j2(SurfaceHolder surfaceHolder) {
        q2();
        if (surfaceHolder == null) {
            f1();
            return;
        }
        b2();
        this.Y = true;
        this.W = surfaceHolder;
        surfaceHolder.addCallback(this.f16538x);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            i2(null);
            X1(0, 0);
            return;
        }
        i2(surface);
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        X1(surfaceFrame.width(), surfaceFrame.height());
    }

    @Override
    public boolean k() {
        q2();
        return this.f16531t0.f16886l;
    }

    public boolean k1() {
        q2();
        return this.f16531t0.f16890p;
    }

    public final void k2(boolean z10, q qVar) {
        p2 p2Var;
        if (z10) {
            p2Var = Z1(0, this.f16520o.size()).f(null);
        } else {
            p2 p2Var2 = this.f16531t0;
            p2Var = p2Var2.b(p2Var2.f16876b);
            p2Var.f16891q = p2Var.f16893s;
            p2Var.f16892r = 0L;
        }
        p2 h10 = p2Var.h(1);
        if (qVar != null) {
            h10 = h10.f(qVar);
        }
        p2 p2Var3 = h10;
        this.H++;
        this.f16512k.h1();
        n2(p2Var3, 0, 1, false, p2Var3.f16875a.u() && !this.f16531t0.f16875a.u(), 4, m1(p2Var3), -1);
    }

    @Override
    public void l(final boolean z10) {
        q2();
        if (this.G != z10) {
            this.G = z10;
            this.f16512k.X0(z10);
            this.f16514l.i(9, new r.a() {
                @Override
                public final void a(Object obj) {
                    ((s2.d) obj).Q(z10);
                }
            });
            l2();
            this.f16514l.f();
        }
    }

    public Looper l1() {
        return this.f16528s;
    }

    public final void l2() {
        s2.b bVar = this.O;
        s2.b E = c5.l0.E(this.f16502f, this.f16496c);
        this.O = E;
        if (!E.equals(bVar)) {
            this.f16514l.i(13, new r.a() {
                @Override
                public final void a(Object obj) {
                    b1.this.F1((s2.d) obj);
                }
            });
        }
    }

    @Override
    public int m() {
        q2();
        if (this.f16531t0.f16875a.u()) {
            return this.f16535v0;
        }
        p2 p2Var = this.f16531t0;
        return p2Var.f16875a.f(p2Var.f16876b.f19169a);
    }

    public final long m1(p2 p2Var) {
        if (p2Var.f16875a.u()) {
            return c5.l0.r0(this.f16537w0);
        }
        if (p2Var.f16876b.b()) {
            return p2Var.f16893s;
        }
        return Y1(p2Var.f16875a, p2Var.f16876b, p2Var.f16893s);
    }

    public final void m2(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        p2 p2Var = this.f16531t0;
        if (p2Var.f16886l != z11 || p2Var.f16887m != i12) {
            this.H++;
            p2 e10 = p2Var.e(z11, i12);
            this.f16512k.Q0(z11, i12);
            n2(e10, 0, i11, false, false, 5, -9223372036854775807L, -1);
        }
    }

    public final int n1() {
        if (this.f16531t0.f16875a.u()) {
            return this.f16533u0;
        }
        p2 p2Var = this.f16531t0;
        return p2Var.f16875a.l(p2Var.f16876b.f19169a, this.f16518n).f16862c;
    }

    public final void n2(final p2 p2Var, final int i10, final int i11, boolean z10, boolean z11, final int i12, long j10, int i13) {
        p2 p2Var2 = this.f16531t0;
        this.f16531t0 = p2Var;
        Pair<Boolean, Integer> j12 = j1(p2Var, p2Var2, z11, i12, !p2Var2.f16875a.equals(p2Var.f16875a));
        boolean booleanValue = ((Boolean) j12.first).booleanValue();
        final int intValue = ((Integer) j12.second).intValue();
        c2 c2Var = this.P;
        final y1 y1Var = null;
        if (booleanValue) {
            if (!p2Var.f16875a.u()) {
                y1Var = p2Var.f16875a.r(p2Var.f16875a.l(p2Var.f16876b.f19169a, this.f16518n).f16862c, this.f16628a).f16870c;
            }
            this.f16529s0 = c2.f16553q0;
        }
        if (booleanValue || !p2Var2.f16884j.equals(p2Var.f16884j)) {
            this.f16529s0 = this.f16529s0.b().K(p2Var.f16884j).G();
            c2Var = e1();
        }
        boolean z12 = !c2Var.equals(this.P);
        this.P = c2Var;
        boolean z13 = p2Var2.f16886l != p2Var.f16886l;
        boolean z14 = p2Var2.f16879e != p2Var.f16879e;
        if (z14 || z13) {
            p2();
        }
        boolean z15 = p2Var2.f16881g;
        boolean z16 = p2Var.f16881g;
        boolean z17 = z15 != z16;
        if (z17) {
            o2(z16);
        }
        if (!p2Var2.f16875a.equals(p2Var.f16875a)) {
            this.f16514l.i(0, new r.a() {
                @Override
                public final void a(Object obj) {
                    b1.G1(p2.this, i10, (s2.d) obj);
                }
            });
        }
        if (z11) {
            final s2.e r12 = r1(i12, p2Var2, i13);
            final s2.e q12 = q1(j10);
            this.f16514l.i(11, new r.a() {
                @Override
                public final void a(Object obj) {
                    b1.H1(i12, r12, q12, (s2.d) obj);
                }
            });
        }
        if (booleanValue) {
            this.f16514l.i(1, new r.a() {
                @Override
                public final void a(Object obj) {
                    ((s2.d) obj).d0(y1.this, intValue);
                }
            });
        }
        if (p2Var2.f16880f != p2Var.f16880f) {
            this.f16514l.i(10, new r.a() {
                @Override
                public final void a(Object obj) {
                    b1.J1(p2.this, (s2.d) obj);
                }
            });
            if (p2Var.f16880f != null) {
                this.f16514l.i(10, new r.a() {
                    @Override
                    public final void a(Object obj) {
                        b1.K1(p2.this, (s2.d) obj);
                    }
                });
            }
        }
        c0 c0Var = p2Var2.f16883i;
        c0 c0Var2 = p2Var.f16883i;
        if (c0Var != c0Var2) {
            this.f16506h.d(c0Var2.f477e);
            final v vVar = new v(p2Var.f16883i.f475c);
            this.f16514l.i(2, new r.a() {
                @Override
                public final void a(Object obj) {
                    b1.L1(p2.this, vVar, (s2.d) obj);
                }
            });
            this.f16514l.i(2, new r.a() {
                @Override
                public final void a(Object obj) {
                    b1.M1(p2.this, (s2.d) obj);
                }
            });
        }
        if (z12) {
            final c2 c2Var2 = this.P;
            this.f16514l.i(14, new r.a() {
                @Override
                public final void a(Object obj) {
                    ((s2.d) obj).V(c2.this);
                }
            });
        }
        if (z17) {
            this.f16514l.i(3, new r.a() {
                @Override
                public final void a(Object obj) {
                    b1.O1(p2.this, (s2.d) obj);
                }
            });
        }
        if (z14 || z13) {
            this.f16514l.i(-1, new r.a() {
                @Override
                public final void a(Object obj) {
                    b1.P1(p2.this, (s2.d) obj);
                }
            });
        }
        if (z14) {
            this.f16514l.i(4, new r.a() {
                @Override
                public final void a(Object obj) {
                    b1.Q1(p2.this, (s2.d) obj);
                }
            });
        }
        if (z13) {
            this.f16514l.i(5, new r.a() {
                @Override
                public final void a(Object obj) {
                    b1.R1(p2.this, i11, (s2.d) obj);
                }
            });
        }
        if (p2Var2.f16887m != p2Var.f16887m) {
            this.f16514l.i(6, new r.a() {
                @Override
                public final void a(Object obj) {
                    b1.S1(p2.this, (s2.d) obj);
                }
            });
        }
        if (v1(p2Var2) != v1(p2Var)) {
            this.f16514l.i(7, new r.a() {
                @Override
                public final void a(Object obj) {
                    b1.T1(p2.this, (s2.d) obj);
                }
            });
        }
        if (!p2Var2.f16888n.equals(p2Var.f16888n)) {
            this.f16514l.i(12, new r.a() {
                @Override
                public final void a(Object obj) {
                    b1.U1(p2.this, (s2.d) obj);
                }
            });
        }
        if (z10) {
            this.f16514l.i(-1, p0.f16872a);
        }
        l2();
        this.f16514l.f();
        if (p2Var2.f16889o != p2Var.f16889o) {
            Iterator<s.a> it = this.f16516m.iterator();
            while (it.hasNext()) {
                it.next().G(p2Var.f16889o);
            }
        }
        if (p2Var2.f16890p != p2Var.f16890p) {
            Iterator<s.a> it2 = this.f16516m.iterator();
            while (it2.hasNext()) {
                it2.next().q(p2Var.f16890p);
            }
        }
    }

    @Override
    public int o() {
        q2();
        if (h()) {
            return this.f16531t0.f16876b.f19171c;
        }
        return -1;
    }

    public final Pair<Object, Long> o1(o3 o3Var, o3 o3Var2) {
        long B = B();
        int i10 = -1;
        if (o3Var.u() || o3Var2.u()) {
            boolean z10 = !o3Var.u() && o3Var2.u();
            if (!z10) {
                i10 = n1();
            }
            if (z10) {
                B = -9223372036854775807L;
            }
            return W1(o3Var2, i10, B);
        }
        Pair<Object, Long> n10 = o3Var.n(this.f16628a, this.f16518n, I(), c5.l0.r0(B));
        Object obj = ((Pair) c5.l0.j(n10)).first;
        if (o3Var2.f(obj) != -1) {
            return n10;
        }
        Object z02 = m1.z0(this.f16628a, this.f16518n, this.F, this.G, obj, o3Var, o3Var2);
        if (z02 == null) {
            return W1(o3Var2, -1, -9223372036854775807L);
        }
        o3Var2.l(z02, this.f16518n);
        int i11 = this.f16518n.f16862c;
        return W1(o3Var2, i11, o3Var2.r(i11, this.f16628a).d());
    }

    public final void o2(boolean z10) {
        d0 d0Var = this.f16519n0;
        if (d0Var == null) {
            return;
        }
        if (z10 && !this.f16521o0) {
            d0Var.a(0);
            this.f16521o0 = true;
        } else if (!z10 && this.f16521o0) {
            d0Var.b(0);
            this.f16521o0 = false;
        }
    }

    @Override
    public void p(SurfaceView surfaceView) {
        q2();
        if (surfaceView instanceof k) {
            b2();
            i2(surfaceView);
            g2(surfaceView.getHolder());
        } else if (surfaceView instanceof SphericalGLSurfaceView) {
            b2();
            this.X = (SphericalGLSurfaceView) surfaceView;
            i1(this.f16539y).n(10000).m(this.X).l();
            this.X.d(this.f16538x);
            i2(this.X.getVideoSurface());
            g2(surfaceView.getHolder());
        } else {
            j2(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    public final void p2() {
        int E = E();
        boolean z10 = true;
        if (E != 1) {
            if (E == 2 || E == 3) {
                boolean k12 = k1();
                u3 u3Var = this.C;
                if (!k() || k12) {
                    z10 = false;
                }
                u3Var.b(z10);
                this.D.b(k());
                return;
            } else if (E != 4) {
                throw new IllegalStateException();
            }
        }
        this.C.b(false);
        this.D.b(false);
    }

    @Override
    public void q(List<o4.s> list) {
        q2();
        e(this.f16520o.size(), list);
    }

    public final s2.e q1(long j10) {
        int i10;
        Object obj;
        y1 y1Var;
        int I = I();
        Object obj2 = null;
        if (!this.f16531t0.f16875a.u()) {
            p2 p2Var = this.f16531t0;
            Object obj3 = p2Var.f16876b.f19169a;
            p2Var.f16875a.l(obj3, this.f16518n);
            i10 = this.f16531t0.f16875a.f(obj3);
            obj2 = this.f16531t0.f16875a.r(I, this.f16628a).f16868a;
            y1Var = this.f16628a.f16870c;
            obj = obj3;
        } else {
            y1Var = null;
            obj = null;
            i10 = -1;
        }
        long I0 = c5.l0.I0(j10);
        long I02 = this.f16531t0.f16876b.b() ? c5.l0.I0(s1(this.f16531t0)) : I0;
        s.b bVar = this.f16531t0.f16876b;
        return new s2.e(obj2, I, y1Var, obj, i10, I0, I02, bVar.f19170b, bVar.f19171c);
    }

    public final void q2() {
        this.f16498d.b();
        if (Thread.currentThread() != l1().getThread()) {
            String z10 = c5.l0.z("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), l1().getThread().getName());
            if (!this.f16515l0) {
                c5.s.j("ExoPlayerImpl", z10, this.f16517m0 ? null : new IllegalStateException());
                this.f16517m0 = true;
                return;
            }
            throw new IllegalStateException(z10);
        }
    }

    public final s2.e r1(int i10, p2 p2Var, int i11) {
        int i12;
        Object obj;
        y1 y1Var;
        int i13;
        long j10;
        long j11;
        o3.b bVar = new o3.b();
        Object obj2 = null;
        if (!p2Var.f16875a.u()) {
            Object obj3 = p2Var.f16876b.f19169a;
            p2Var.f16875a.l(obj3, bVar);
            int i14 = bVar.f16862c;
            i12 = p2Var.f16875a.f(obj3);
            obj2 = p2Var.f16875a.r(i14, this.f16628a).f16868a;
            y1Var = this.f16628a.f16870c;
            i13 = i14;
            obj = obj3;
        } else {
            i13 = i11;
            y1Var = null;
            obj = null;
            i12 = -1;
        }
        if (i10 == 0) {
            if (p2Var.f16876b.b()) {
                s.b bVar2 = p2Var.f16876b;
                j11 = bVar.e(bVar2.f19170b, bVar2.f19171c);
                j10 = s1(p2Var);
            } else {
                if (p2Var.f16876b.f19173e != -1) {
                    j11 = s1(this.f16531t0);
                } else {
                    j11 = bVar.N + bVar.M;
                }
                j10 = j11;
            }
        } else if (p2Var.f16876b.b()) {
            j11 = p2Var.f16893s;
            j10 = s1(p2Var);
        } else {
            j11 = bVar.N + p2Var.f16893s;
            j10 = j11;
        }
        long I0 = c5.l0.I0(j11);
        long I02 = c5.l0.I0(j10);
        s.b bVar3 = p2Var.f16876b;
        return new s2.e(obj2, i13, y1Var, obj, i12, I0, I02, bVar3.f19170b, bVar3.f19171c);
    }

    @Override
    public void t(List<o4.s> list) {
        q2();
        e2(list, true);
    }

    public final void y1(m1.e eVar) {
        long j10;
        boolean z10;
        long j11;
        int i10 = this.H - eVar.f16826c;
        this.H = i10;
        boolean z11 = true;
        if (eVar.f16827d) {
            this.I = eVar.f16828e;
            this.J = true;
        }
        if (eVar.f16829f) {
            this.K = eVar.f16830g;
        }
        if (i10 == 0) {
            o3 o3Var = eVar.f16825b.f16875a;
            if (!this.f16531t0.f16875a.u() && o3Var.u()) {
                this.f16533u0 = -1;
                this.f16537w0 = 0L;
                this.f16535v0 = 0;
            }
            if (!o3Var.u()) {
                List<o3> J = ((x2) o3Var).J();
                c5.a.f(J.size() == this.f16520o.size());
                for (int i11 = 0; i11 < J.size(); i11++) {
                    this.f16520o.get(i11).f16546b = J.get(i11);
                }
            }
            if (this.J) {
                if (eVar.f16825b.f16876b.equals(this.f16531t0.f16876b) && eVar.f16825b.f16878d == this.f16531t0.f16893s) {
                    z11 = false;
                }
                if (z11) {
                    if (o3Var.u() || eVar.f16825b.f16876b.b()) {
                        j11 = eVar.f16825b.f16878d;
                    } else {
                        p2 p2Var = eVar.f16825b;
                        j11 = Y1(o3Var, p2Var.f16876b, p2Var.f16878d);
                    }
                    j10 = j11;
                } else {
                    j10 = -9223372036854775807L;
                }
                z10 = z11;
            } else {
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.J = false;
            n2(eVar.f16825b, 1, this.K, false, z10, this.I, j10, -1);
        }
    }

    @Override
    public void u(int i10, int i11) {
        q2();
        p2 Z1 = Z1(i10, Math.min(i11, this.f16520o.size()));
        n2(Z1, 0, 1, false, !Z1.f16876b.f19169a.equals(this.f16531t0.f16876b.f19169a), 4, m1(Z1), -1);
    }

    public final int u1(int i10) {
        AudioTrack audioTrack = this.T;
        if (!(audioTrack == null || audioTrack.getAudioSessionId() == i10)) {
            this.T.release();
            this.T = null;
        }
        if (this.T == null) {
            this.T = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.T.getAudioSessionId();
    }

    @Override
    public void w(o4.s sVar) {
        q2();
        t(Collections.singletonList(sVar));
    }

    @Override
    public void x(boolean z10) {
        q2();
        int p10 = this.A.p(z10, E());
        m2(z10, p10, p1(z10, p10));
    }

    @Override
    public void z(n3.c cVar) {
        c5.a.e(cVar);
        this.f16526r.f0(cVar);
    }
}
