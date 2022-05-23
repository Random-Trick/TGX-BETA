package o3;

import android.media.AudioTrack;
import android.os.SystemClock;
import c5.l0;
import java.lang.reflect.Method;

public final class w {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;
    public final a f18914a;
    public final long[] f18915b;
    public AudioTrack f18916c;
    public int f18917d;
    public int f18918e;
    public v f18919f;
    public int f18920g;
    public boolean f18921h;
    public long f18922i;
    public float f18923j;
    public boolean f18924k;
    public long f18925l;
    public long f18926m;
    public Method f18927n;
    public long f18928o;
    public boolean f18929p;
    public boolean f18930q;
    public long f18931r;
    public long f18932s;
    public long f18933t;
    public long f18934u;
    public int f18935v;
    public int f18936w;
    public long f18937x;
    public long f18938y;
    public long f18939z;

    public interface a {
        void a(long j10);

        void b(int i10, long j10);

        void c(long j10);

        void d(long j10, long j11, long j12, long j13);

        void e(long j10, long j11, long j12, long j13);
    }

    public w(a aVar) {
        this.f18914a = (a) c5.a.e(aVar);
        if (l0.f4841a >= 18) {
            try {
                this.f18927n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f18915b = new long[10];
    }

    public static boolean p(int i10) {
        return l0.f4841a < 23 && (i10 == 5 || i10 == 6);
    }

    public final boolean a() {
        return this.f18921h && ((AudioTrack) c5.a.e(this.f18916c)).getPlayState() == 2 && f() == 0;
    }

    public final long b(long j10) {
        return (j10 * 1000000) / this.f18920g;
    }

    public int c(long j10) {
        return this.f18918e - ((int) (j10 - (f() * this.f18917d)));
    }

    public long d(boolean z10) {
        long j10;
        if (((AudioTrack) c5.a.e(this.f18916c)).getPlayState() == 3) {
            n();
        }
        long nanoTime = System.nanoTime() / 1000;
        v vVar = (v) c5.a.e(this.f18919f);
        boolean d10 = vVar.d();
        if (d10) {
            j10 = b(vVar.b()) + l0.T(nanoTime - vVar.c(), this.f18923j);
        } else {
            if (this.f18936w == 0) {
                j10 = g();
            } else {
                j10 = this.f18925l + nanoTime;
            }
            if (!z10) {
                j10 = Math.max(0L, j10 - this.f18928o);
            }
        }
        if (this.D != d10) {
            this.F = this.C;
            this.E = this.B;
        }
        long j11 = nanoTime - this.F;
        if (j11 < 1000000) {
            long j12 = (j11 * 1000) / 1000000;
            j10 = ((j10 * j12) + ((1000 - j12) * (this.E + l0.T(j11, this.f18923j)))) / 1000;
        }
        if (!this.f18924k) {
            long j13 = this.B;
            if (j10 > j13) {
                this.f18924k = true;
                this.f18914a.a(System.currentTimeMillis() - l0.I0(l0.Y(l0.I0(j10 - j13), this.f18923j)));
            }
        }
        this.C = nanoTime;
        this.B = j10;
        this.D = d10;
        return j10;
    }

    public long e(long j10) {
        return l0.I0(b(j10 - f()));
    }

    public final long f() {
        AudioTrack audioTrack = (AudioTrack) c5.a.e(this.f18916c);
        if (this.f18937x != -9223372036854775807L) {
            return Math.min(this.A, this.f18939z + ((((SystemClock.elapsedRealtime() * 1000) - this.f18937x) * this.f18920g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & audioTrack.getPlaybackHeadPosition();
        if (this.f18921h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f18934u = this.f18932s;
            }
            playbackHeadPosition += this.f18934u;
        }
        if (l0.f4841a <= 29) {
            if (playbackHeadPosition == 0 && this.f18932s > 0 && playState == 3) {
                if (this.f18938y == -9223372036854775807L) {
                    this.f18938y = SystemClock.elapsedRealtime();
                }
                return this.f18932s;
            }
            this.f18938y = -9223372036854775807L;
        }
        if (this.f18932s > playbackHeadPosition) {
            this.f18933t++;
        }
        this.f18932s = playbackHeadPosition;
        return playbackHeadPosition + (this.f18933t << 32);
    }

    public final long g() {
        return b(f());
    }

    public void h(long j10) {
        this.f18939z = f();
        this.f18937x = SystemClock.elapsedRealtime() * 1000;
        this.A = j10;
    }

    public boolean i(long j10) {
        return j10 > f() || a();
    }

    public boolean j() {
        return ((AudioTrack) c5.a.e(this.f18916c)).getPlayState() == 3;
    }

    public boolean k(long j10) {
        return this.f18938y != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.f18938y >= 200;
    }

    public boolean l(long j10) {
        int playState = ((AudioTrack) c5.a.e(this.f18916c)).getPlayState();
        if (this.f18921h) {
            if (playState == 2) {
                this.f18929p = false;
                return false;
            } else if (playState == 1 && f() == 0) {
                return false;
            }
        }
        boolean z10 = this.f18929p;
        boolean i10 = i(j10);
        this.f18929p = i10;
        if (z10 && !i10 && playState != 1) {
            this.f18914a.b(this.f18918e, l0.I0(this.f18922i));
        }
        return true;
    }

    public final void m(long j10, long j11) {
        v vVar = (v) c5.a.e(this.f18919f);
        if (vVar.e(j10)) {
            long c10 = vVar.c();
            long b10 = vVar.b();
            if (Math.abs(c10 - j10) > 5000000) {
                this.f18914a.e(b10, c10, j10, j11);
                vVar.f();
            } else if (Math.abs(b(b10) - j11) > 5000000) {
                this.f18914a.d(b10, c10, j10, j11);
                vVar.f();
            } else {
                vVar.a();
            }
        }
    }

    public final void n() {
        long g10 = g();
        if (g10 != 0) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.f18926m >= 30000) {
                long[] jArr = this.f18915b;
                int i10 = this.f18935v;
                jArr[i10] = g10 - nanoTime;
                this.f18935v = (i10 + 1) % 10;
                int i11 = this.f18936w;
                if (i11 < 10) {
                    this.f18936w = i11 + 1;
                }
                this.f18926m = nanoTime;
                this.f18925l = 0L;
                int i12 = 0;
                while (true) {
                    int i13 = this.f18936w;
                    if (i12 >= i13) {
                        break;
                    }
                    this.f18925l += this.f18915b[i12] / i13;
                    i12++;
                }
            }
            if (!this.f18921h) {
                m(nanoTime, g10);
                o(nanoTime);
            }
        }
    }

    public final void o(long j10) {
        Method method;
        if (this.f18930q && (method = this.f18927n) != null && j10 - this.f18931r >= 500000) {
            try {
                long intValue = (((Integer) l0.j((Integer) method.invoke(c5.a.e(this.f18916c), new Object[0]))).intValue() * 1000) - this.f18922i;
                this.f18928o = intValue;
                long max = Math.max(intValue, 0L);
                this.f18928o = max;
                if (max > 5000000) {
                    this.f18914a.c(max);
                    this.f18928o = 0L;
                }
            } catch (Exception unused) {
                this.f18927n = null;
            }
            this.f18931r = j10;
        }
    }

    public boolean q() {
        s();
        if (this.f18937x != -9223372036854775807L) {
            return false;
        }
        ((v) c5.a.e(this.f18919f)).g();
        return true;
    }

    public void r() {
        s();
        this.f18916c = null;
        this.f18919f = null;
    }

    public final void s() {
        this.f18925l = 0L;
        this.f18936w = 0;
        this.f18935v = 0;
        this.f18926m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f18924k = false;
    }

    public void t(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f18916c = audioTrack;
        this.f18917d = i11;
        this.f18918e = i12;
        this.f18919f = new v(audioTrack);
        this.f18920g = audioTrack.getSampleRate();
        this.f18921h = z10 && p(i10);
        boolean j02 = l0.j0(i10);
        this.f18930q = j02;
        this.f18922i = j02 ? b(i12 / i11) : -9223372036854775807L;
        this.f18932s = 0L;
        this.f18933t = 0L;
        this.f18934u = 0L;
        this.f18929p = false;
        this.f18937x = -9223372036854775807L;
        this.f18938y = -9223372036854775807L;
        this.f18931r = 0L;
        this.f18928o = 0L;
        this.f18923j = 1.0f;
    }

    public void u(float f10) {
        this.f18923j = f10;
        v vVar = this.f18919f;
        if (vVar != null) {
            vVar.g();
        }
    }

    public void v() {
        ((v) c5.a.e(this.f18919f)).g();
    }
}
