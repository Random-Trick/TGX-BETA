package d5;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import c5.l0;
import c5.s;

public final class n {
    public final g f6287a = new g();
    public final b f6288b;
    public final e f6289c;
    public boolean f6290d;
    public Surface f6291e;
    public float f6292f;
    public float f6293g;
    public float f6294h;
    public float f6295i;
    public int f6296j;
    public long f6297k;
    public long f6298l;
    public long f6299m;
    public long f6300n;
    public long f6301o;
    public long f6302p;
    public long f6303q;

    public static final class a {
        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                s.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    public interface b {

        public interface a {
            void a(Display display);
        }

        void a(a aVar);

        void b();
    }

    public static final class c implements b {
        public final WindowManager f6304a;

        public c(WindowManager windowManager) {
            this.f6304a = windowManager;
        }

        public static b c(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        @Override
        public void a(b.a aVar) {
            aVar.a(this.f6304a.getDefaultDisplay());
        }

        @Override
        public void b() {
        }
    }

    public static final class d implements b, DisplayManager.DisplayListener {
        public final DisplayManager f6305a;
        public b.a f6306b;

        public d(DisplayManager displayManager) {
            this.f6305a = displayManager;
        }

        public static b d(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        @Override
        public void a(b.a aVar) {
            this.f6306b = aVar;
            this.f6305a.registerDisplayListener(this, l0.u());
            aVar.a(c());
        }

        @Override
        public void b() {
            this.f6305a.unregisterDisplayListener(this);
            this.f6306b = null;
        }

        public final Display c() {
            return this.f6305a.getDisplay(0);
        }

        @Override
        public void onDisplayAdded(int i10) {
        }

        @Override
        public void onDisplayChanged(int i10) {
            b.a aVar = this.f6306b;
            if (aVar != null && i10 == 0) {
                aVar.a(c());
            }
        }

        @Override
        public void onDisplayRemoved(int i10) {
        }
    }

    public static final class e implements Choreographer.FrameCallback, Handler.Callback {
        public static final e O = new e();
        public Choreographer M;
        public int N;
        public volatile long f6307a = -9223372036854775807L;
        public final Handler f6308b;
        public final HandlerThread f6309c;

        public e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f6309c = handlerThread;
            handlerThread.start();
            Handler t10 = l0.t(handlerThread.getLooper(), this);
            this.f6308b = t10;
            t10.sendEmptyMessage(0);
        }

        public static e d() {
            return O;
        }

        public void a() {
            this.f6308b.sendEmptyMessage(1);
        }

        public final void b() {
            Choreographer choreographer = this.M;
            if (choreographer != null) {
                int i10 = this.N + 1;
                this.N = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        public final void c() {
            try {
                this.M = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                s.j("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }

        @Override
        public void doFrame(long j10) {
            this.f6307a = j10;
            ((Choreographer) c5.a.e(this.M)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f6308b.sendEmptyMessage(2);
        }

        public final void f() {
            Choreographer choreographer = this.M;
            if (choreographer != null) {
                int i10 = this.N - 1;
                this.N = i10;
                if (i10 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f6307a = -9223372036854775807L;
                }
            }
        }

        @Override
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c();
                return true;
            } else if (i10 == 1) {
                b();
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                f();
                return true;
            }
        }
    }

    public n(Context context) {
        b f10 = f(context);
        this.f6288b = f10;
        this.f6289c = f10 != null ? e.d() : null;
        this.f6297k = -9223372036854775807L;
        this.f6298l = -9223372036854775807L;
        this.f6292f = -1.0f;
        this.f6295i = 1.0f;
        this.f6296j = 0;
    }

    public static boolean c(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    public static long e(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            j14 = j12 + j14;
            j13 = j14;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    public static b f(Context context) {
        b bVar = null;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (l0.f4841a >= 17) {
            bVar = d.d(applicationContext);
        }
        return bVar == null ? c.c(applicationContext) : bVar;
    }

    public long b(long j10) {
        long j11;
        e eVar;
        if (this.f6302p != -1 && this.f6287a.e()) {
            long a10 = this.f6303q + (((float) (this.f6287a.a() * (this.f6299m - this.f6302p))) / this.f6295i);
            if (c(j10, a10)) {
                j11 = a10;
                this.f6300n = this.f6299m;
                this.f6301o = j11;
                eVar = this.f6289c;
                if (eVar != null || this.f6297k == -9223372036854775807L) {
                    return j11;
                }
                long j12 = eVar.f6307a;
                return j12 == -9223372036854775807L ? j11 : e(j11, j12, this.f6297k) - this.f6298l;
            }
            n();
        }
        j11 = j10;
        this.f6300n = this.f6299m;
        this.f6301o = j11;
        eVar = this.f6289c;
        if (eVar != null) {
        }
        return j11;
    }

    public final void d() {
        Surface surface;
        if (l0.f4841a >= 30 && (surface = this.f6291e) != null && this.f6296j != Integer.MIN_VALUE && this.f6294h != 0.0f) {
            this.f6294h = 0.0f;
            a.a(surface, 0.0f);
        }
    }

    public void g(float f10) {
        this.f6292f = f10;
        this.f6287a.g();
        q();
    }

    public void h(long j10) {
        long j11 = this.f6300n;
        if (j11 != -1) {
            this.f6302p = j11;
            this.f6303q = this.f6301o;
        }
        this.f6299m++;
        this.f6287a.f(j10 * 1000);
        q();
    }

    public void i(float f10) {
        this.f6295i = f10;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f6290d = true;
        n();
        if (this.f6288b != null) {
            ((e) c5.a.e(this.f6289c)).a();
            this.f6288b.a(new b.a() {
                @Override
                public final void a(Display display) {
                    n.this.p(display);
                }
            });
        }
        r(false);
    }

    public void l() {
        this.f6290d = false;
        b bVar = this.f6288b;
        if (bVar != null) {
            bVar.b();
            ((e) c5.a.e(this.f6289c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (surface instanceof f) {
            surface = null;
        }
        if (this.f6291e != surface) {
            d();
            this.f6291e = surface;
            r(true);
        }
    }

    public final void n() {
        this.f6299m = 0L;
        this.f6302p = -1L;
        this.f6300n = -1L;
    }

    public void o(int i10) {
        if (this.f6296j != i10) {
            this.f6296j = i10;
            r(true);
        }
    }

    public final void p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f6297k = refreshRate;
            this.f6298l = (refreshRate * 80) / 100;
            return;
        }
        s.i("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f6297k = -9223372036854775807L;
        this.f6298l = -9223372036854775807L;
    }

    public final void q() {
        throw new UnsupportedOperationException("Method not decompiled: d5.n.q():void");
    }

    public final void r(boolean z10) {
        Surface surface;
        if (l0.f4841a >= 30 && (surface = this.f6291e) != null && this.f6296j != Integer.MIN_VALUE) {
            float f10 = 0.0f;
            if (this.f6290d) {
                float f11 = this.f6293g;
                if (f11 != -1.0f) {
                    f10 = this.f6295i * f11;
                }
            }
            if (z10 || this.f6294h != f10) {
                this.f6294h = f10;
                a.a(surface, f10);
            }
        }
    }
}
