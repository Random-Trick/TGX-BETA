package p032c5;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import p020b5.C1186a;
import p020b5.C1216l0;
import p020b5.C1230s;

public final class C1624n {
    public final C1614g f6009a = new C1614g();
    public final AbstractC1626b f6010b;
    public final Choreographer$FrameCallbackC1630e f6011c;
    public boolean f6012d;
    public Surface f6013e;
    public float f6014f;
    public float f6015g;
    public float f6016h;
    public float f6017i;
    public int f6018j;
    public long f6019k;
    public long f6020l;
    public long f6021m;
    public long f6022n;
    public long f6023o;
    public long f6024p;
    public long f6025q;

    public static final class C1625a {
        public static void m36168a(Surface surface, float f) {
            try {
                surface.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e) {
                C1230s.m37889d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    public interface AbstractC1626b {

        public interface AbstractC1627a {
            void mo36167a(Display display);
        }

        void mo36165a(AbstractC1627a aVar);

        void mo36164b();
    }

    public static final class C1628c implements AbstractC1626b {
        public final WindowManager f6026a;

        public C1628c(WindowManager windowManager) {
            this.f6026a = windowManager;
        }

        public static AbstractC1626b m36166c(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new C1628c(windowManager);
            }
            return null;
        }

        @Override
        public void mo36165a(AbstractC1626b.AbstractC1627a aVar) {
            aVar.mo36167a(this.f6026a.getDefaultDisplay());
        }

        @Override
        public void mo36164b() {
        }
    }

    public static final class C1629d implements AbstractC1626b, DisplayManager.DisplayListener {
        public final DisplayManager f6027a;
        public AbstractC1626b.AbstractC1627a f6028b;

        public C1629d(DisplayManager displayManager) {
            this.f6027a = displayManager;
        }

        public static AbstractC1626b m36162d(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new C1629d(displayManager);
            }
            return null;
        }

        @Override
        public void mo36165a(AbstractC1626b.AbstractC1627a aVar) {
            this.f6028b = aVar;
            this.f6027a.registerDisplayListener(this, C1216l0.m37949u());
            aVar.mo36167a(m36163c());
        }

        @Override
        public void mo36164b() {
            this.f6027a.unregisterDisplayListener(this);
            this.f6028b = null;
        }

        public final Display m36163c() {
            return this.f6027a.getDisplay(0);
        }

        @Override
        public void onDisplayAdded(int i) {
        }

        @Override
        public void onDisplayChanged(int i) {
            AbstractC1626b.AbstractC1627a aVar = this.f6028b;
            if (aVar != null && i == 0) {
                aVar.mo36167a(m36163c());
            }
        }

        @Override
        public void onDisplayRemoved(int i) {
        }
    }

    public static final class Choreographer$FrameCallbackC1630e implements Choreographer.FrameCallback, Handler.Callback {
        public static final Choreographer$FrameCallbackC1630e f6029O = new Choreographer$FrameCallbackC1630e();
        public Choreographer f6030M;
        public int f6031N;
        public volatile long f6032a = -9223372036854775807L;
        public final Handler f6033b;
        public final HandlerThread f6034c;

        public Choreographer$FrameCallbackC1630e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f6034c = handlerThread;
            handlerThread.start();
            Handler t = C1216l0.m37951t(handlerThread.getLooper(), this);
            this.f6033b = t;
            t.sendEmptyMessage(0);
        }

        public static Choreographer$FrameCallbackC1630e m36158d() {
            return f6029O;
        }

        public void m36161a() {
            this.f6033b.sendEmptyMessage(1);
        }

        public final void m36160b() {
            int i = this.f6031N + 1;
            this.f6031N = i;
            if (i == 1) {
                ((Choreographer) C1186a.m38188e(this.f6030M)).postFrameCallback(this);
            }
        }

        public final void m36159c() {
            this.f6030M = Choreographer.getInstance();
        }

        @Override
        public void doFrame(long j) {
            this.f6032a = j;
            ((Choreographer) C1186a.m38188e(this.f6030M)).postFrameCallbackDelayed(this, 500L);
        }

        public void m36157e() {
            this.f6033b.sendEmptyMessage(2);
        }

        public final void m36156f() {
            int i = this.f6031N - 1;
            this.f6031N = i;
            if (i == 0) {
                ((Choreographer) C1186a.m38188e(this.f6030M)).removeFrameCallback(this);
                this.f6032a = -9223372036854775807L;
            }
        }

        @Override
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m36159c();
                return true;
            } else if (i == 1) {
                m36160b();
                return true;
            } else if (i != 2) {
                return false;
            } else {
                m36156f();
                return true;
            }
        }
    }

    public C1624n(Context context) {
        AbstractC1626b f = m36183f(context);
        this.f6010b = f;
        this.f6011c = f != null ? Choreographer$FrameCallbackC1630e.m36158d() : null;
        this.f6019k = -9223372036854775807L;
        this.f6020l = -9223372036854775807L;
        this.f6014f = -1.0f;
        this.f6017i = 1.0f;
        this.f6018j = 0;
    }

    public static boolean m36186c(long j, long j2) {
        return Math.abs(j - j2) <= 20000000;
    }

    public static long m36184e(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j5 = j3 + j5;
            j4 = j5;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    public static AbstractC1626b m36183f(Context context) {
        AbstractC1626b bVar = null;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (C1216l0.f4526a >= 17) {
            bVar = C1629d.m36162d(applicationContext);
        }
        return bVar == null ? C1628c.m36166c(applicationContext) : bVar;
    }

    public long m36187b(long j) {
        long j2;
        Choreographer$FrameCallbackC1630e eVar;
        if (this.f6024p != -1 && this.f6009a.m36241e()) {
            long a = this.f6025q + (((float) (this.f6009a.m36245a() * (this.f6021m - this.f6024p))) / this.f6017i);
            if (m36186c(j, a)) {
                j2 = a;
                this.f6022n = this.f6021m;
                this.f6023o = j2;
                eVar = this.f6011c;
                if (eVar != null || this.f6019k == -9223372036854775807L) {
                    return j2;
                }
                long j3 = eVar.f6032a;
                return j3 == -9223372036854775807L ? j2 : m36184e(j2, j3, this.f6019k) - this.f6020l;
            }
            m36173p();
        }
        j2 = j;
        this.f6022n = this.f6021m;
        this.f6023o = j2;
        eVar = this.f6011c;
        if (eVar != null) {
        }
        return j2;
    }

    public final void m36185d() {
        Surface surface;
        if (C1216l0.f4526a >= 30 && (surface = this.f6013e) != null && this.f6018j != Integer.MIN_VALUE && this.f6016h != 0.0f) {
            this.f6016h = 0.0f;
            C1625a.m36168a(surface, 0.0f);
        }
    }

    public void m36182g() {
        AbstractC1626b bVar = this.f6010b;
        if (bVar != null) {
            bVar.mo36164b();
            ((Choreographer$FrameCallbackC1630e) C1186a.m38188e(this.f6011c)).m36157e();
        }
    }

    public void m36181h() {
        if (this.f6010b != null) {
            ((Choreographer$FrameCallbackC1630e) C1186a.m38188e(this.f6011c)).m36161a();
            this.f6010b.mo36165a(new AbstractC1626b.AbstractC1627a() {
                @Override
                public final void mo36167a(Display display) {
                    C1624n.this.m36171r(display);
                }
            });
        }
    }

    public void m36180i(float f) {
        this.f6014f = f;
        this.f6009a.m36239g();
        m36170s();
    }

    public void m36179j(long j) {
        long j2 = this.f6022n;
        if (j2 != -1) {
            this.f6024p = j2;
            this.f6025q = this.f6023o;
        }
        this.f6021m++;
        this.f6009a.m36240f(j * 1000);
        m36170s();
    }

    public void m36178k(float f) {
        this.f6017i = f;
        m36173p();
        m36169t(false);
    }

    public void m36177l() {
        m36173p();
    }

    public void m36176m() {
        this.f6012d = true;
        m36173p();
        m36169t(false);
    }

    public void m36175n() {
        this.f6012d = false;
        m36185d();
    }

    public void m36174o(Surface surface) {
        if (surface instanceof C1611f) {
            surface = null;
        }
        if (this.f6013e != surface) {
            m36185d();
            this.f6013e = surface;
            m36169t(true);
        }
    }

    public final void m36173p() {
        this.f6021m = 0L;
        this.f6024p = -1L;
        this.f6022n = -1L;
    }

    public void m36172q(int i) {
        if (this.f6018j != i) {
            this.f6018j = i;
            m36169t(true);
        }
    }

    public final void m36171r(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f6019k = refreshRate;
            this.f6020l = (refreshRate * 80) / 100;
            return;
        }
        C1230s.m37884i("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f6019k = -9223372036854775807L;
        this.f6020l = -9223372036854775807L;
    }

    public final void m36170s() {
        throw new UnsupportedOperationException("Method not decompiled: p032c5.C1624n.m36170s():void");
    }

    public final void m36169t(boolean z) {
        Surface surface;
        if (C1216l0.f4526a >= 30 && (surface = this.f6013e) != null && this.f6018j != Integer.MIN_VALUE) {
            float f = 0.0f;
            if (this.f6012d) {
                float f2 = this.f6015g;
                if (f2 != -1.0f) {
                    f = this.f6017i * f2;
                }
            }
            if (z || this.f6016h != f) {
                this.f6016h = f;
                C1625a.m36168a(surface, f);
            }
        }
    }
}
