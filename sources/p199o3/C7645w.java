package p199o3;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import p020b5.C1186a;
import p020b5.C1216l0;

public final class C7645w {
    public long f24482A;
    public long f24483B;
    public long f24484C;
    public boolean f24485D;
    public long f24486E;
    public long f24487F;
    public final AbstractC7646a f24488a;
    public final long[] f24489b;
    public AudioTrack f24490c;
    public int f24491d;
    public int f24492e;
    public C7643v f24493f;
    public int f24494g;
    public boolean f24495h;
    public long f24496i;
    public float f24497j;
    public boolean f24498k;
    public long f24499l;
    public long f24500m;
    public Method f24501n;
    public long f24502o;
    public boolean f24503p;
    public boolean f24504q;
    public long f24505r;
    public long f24506s;
    public long f24507t;
    public long f24508u;
    public int f24509v;
    public int f24510w;
    public long f24511x;
    public long f24512y;
    public long f24513z;

    public interface AbstractC7646a {
        void mo15319a(int i, long j);

        void mo15318b(long j);

        void mo15317c(long j);

        void mo15316d(long j, long j2, long j3, long j4);

        void mo15315e(long j, long j2, long j3, long j4);
    }

    public C7645w(AbstractC7646a aVar) {
        this.f24488a = (AbstractC7646a) C1186a.m38188e(aVar);
        if (C1216l0.f4526a >= 18) {
            try {
                this.f24501n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f24489b = new long[10];
    }

    public static boolean m15326p(int i) {
        return C1216l0.f4526a < 23 && (i == 5 || i == 6);
    }

    public final boolean m15341a() {
        return this.f24495h && ((AudioTrack) C1186a.m38188e(this.f24490c)).getPlayState() == 2 && m15336f() == 0;
    }

    public final long m15340b(long j) {
        return (j * 1000000) / this.f24494g;
    }

    public int m15339c(long j) {
        return this.f24492e - ((int) (j - (m15336f() * this.f24491d)));
    }

    public long m15338d(boolean z) {
        long j;
        if (((AudioTrack) C1186a.m38188e(this.f24490c)).getPlayState() == 3) {
            m15328n();
        }
        long nanoTime = System.nanoTime() / 1000;
        C7643v vVar = (C7643v) C1186a.m38188e(this.f24493f);
        boolean d = vVar.m15349d();
        if (d) {
            j = m15340b(vVar.m15351b()) + C1216l0.m37997S(nanoTime - vVar.m15350c(), this.f24497j);
        } else {
            if (this.f24510w == 0) {
                j = m15335g();
            } else {
                j = this.f24499l + nanoTime;
            }
            if (!z) {
                j = Math.max(0L, j - this.f24502o);
            }
        }
        if (this.f24485D != d) {
            this.f24487F = this.f24484C;
            this.f24486E = this.f24483B;
        }
        long j2 = nanoTime - this.f24487F;
        if (j2 < 1000000) {
            long j3 = (j2 * 1000) / 1000000;
            j = ((j * j3) + ((1000 - j3) * (this.f24486E + C1216l0.m37997S(j2, this.f24497j)))) / 1000;
        }
        if (!this.f24498k) {
            long j4 = this.f24483B;
            if (j > j4) {
                this.f24498k = true;
                this.f24488a.mo15318b(System.currentTimeMillis() - C1216l0.m38009H0(C1216l0.m37992X(C1216l0.m38009H0(j - j4), this.f24497j)));
            }
        }
        this.f24484C = nanoTime;
        this.f24483B = j;
        this.f24485D = d;
        return j;
    }

    public long m15337e(long j) {
        return C1216l0.m38009H0(m15340b(j - m15336f()));
    }

    public final long m15336f() {
        AudioTrack audioTrack = (AudioTrack) C1186a.m38188e(this.f24490c);
        if (this.f24511x != -9223372036854775807L) {
            return Math.min(this.f24482A, this.f24513z + ((((SystemClock.elapsedRealtime() * 1000) - this.f24511x) * this.f24494g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & audioTrack.getPlaybackHeadPosition();
        if (this.f24495h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f24508u = this.f24506s;
            }
            playbackHeadPosition += this.f24508u;
        }
        if (C1216l0.f4526a <= 29) {
            if (playbackHeadPosition == 0 && this.f24506s > 0 && playState == 3) {
                if (this.f24512y == -9223372036854775807L) {
                    this.f24512y = SystemClock.elapsedRealtime();
                }
                return this.f24506s;
            }
            this.f24512y = -9223372036854775807L;
        }
        if (this.f24506s > playbackHeadPosition) {
            this.f24507t++;
        }
        this.f24506s = playbackHeadPosition;
        return playbackHeadPosition + (this.f24507t << 32);
    }

    public final long m15335g() {
        return m15340b(m15336f());
    }

    public void m15334h(long j) {
        this.f24513z = m15336f();
        this.f24511x = SystemClock.elapsedRealtime() * 1000;
        this.f24482A = j;
    }

    public boolean m15333i(long j) {
        return j > m15336f() || m15341a();
    }

    public boolean m15332j() {
        return ((AudioTrack) C1186a.m38188e(this.f24490c)).getPlayState() == 3;
    }

    public boolean m15331k(long j) {
        return this.f24512y != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f24512y >= 200;
    }

    public boolean m15330l(long j) {
        int playState = ((AudioTrack) C1186a.m38188e(this.f24490c)).getPlayState();
        if (this.f24495h) {
            if (playState == 2) {
                this.f24503p = false;
                return false;
            } else if (playState == 1 && m15336f() == 0) {
                return false;
            }
        }
        boolean z = this.f24503p;
        boolean i = m15333i(j);
        this.f24503p = i;
        if (z && !i && playState != 1) {
            this.f24488a.mo15319a(this.f24492e, C1216l0.m38009H0(this.f24496i));
        }
        return true;
    }

    public final void m15329m(long j, long j2) {
        C7643v vVar = (C7643v) C1186a.m38188e(this.f24493f);
        if (vVar.m15348e(j)) {
            long c = vVar.m15350c();
            long b = vVar.m15351b();
            if (Math.abs(c - j) > 5000000) {
                this.f24488a.mo15315e(b, c, j, j2);
                vVar.m15347f();
            } else if (Math.abs(m15340b(b) - j2) > 5000000) {
                this.f24488a.mo15316d(b, c, j, j2);
                vVar.m15347f();
            } else {
                vVar.m15352a();
            }
        }
    }

    public final void m15328n() {
        long g = m15335g();
        if (g != 0) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.f24500m >= 30000) {
                long[] jArr = this.f24489b;
                int i = this.f24509v;
                jArr[i] = g - nanoTime;
                this.f24509v = (i + 1) % 10;
                int i2 = this.f24510w;
                if (i2 < 10) {
                    this.f24510w = i2 + 1;
                }
                this.f24500m = nanoTime;
                this.f24499l = 0L;
                int i3 = 0;
                while (true) {
                    int i4 = this.f24510w;
                    if (i3 >= i4) {
                        break;
                    }
                    this.f24499l += this.f24489b[i3] / i4;
                    i3++;
                }
            }
            if (!this.f24495h) {
                m15329m(nanoTime, g);
                m15327o(nanoTime);
            }
        }
    }

    public final void m15327o(long j) {
        Method method;
        if (this.f24504q && (method = this.f24501n) != null && j - this.f24505r >= 500000) {
            try {
                long intValue = (((Integer) C1216l0.m37971j((Integer) method.invoke(C1186a.m38188e(this.f24490c), new Object[0]))).intValue() * 1000) - this.f24496i;
                this.f24502o = intValue;
                long max = Math.max(intValue, 0L);
                this.f24502o = max;
                if (max > 5000000) {
                    this.f24488a.mo15317c(max);
                    this.f24502o = 0L;
                }
            } catch (Exception unused) {
                this.f24501n = null;
            }
            this.f24505r = j;
        }
    }

    public boolean m15325q() {
        m15323s();
        if (this.f24511x != -9223372036854775807L) {
            return false;
        }
        ((C7643v) C1186a.m38188e(this.f24493f)).m15346g();
        return true;
    }

    public void m15324r() {
        m15323s();
        this.f24490c = null;
        this.f24493f = null;
    }

    public final void m15323s() {
        this.f24499l = 0L;
        this.f24510w = 0;
        this.f24509v = 0;
        this.f24500m = 0L;
        this.f24484C = 0L;
        this.f24487F = 0L;
        this.f24498k = false;
    }

    public void m15322t(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.f24490c = audioTrack;
        this.f24491d = i2;
        this.f24492e = i3;
        this.f24493f = new C7643v(audioTrack);
        this.f24494g = audioTrack.getSampleRate();
        this.f24495h = z && m15326p(i);
        boolean i0 = C1216l0.m37972i0(i);
        this.f24504q = i0;
        this.f24496i = i0 ? m15340b(i3 / i2) : -9223372036854775807L;
        this.f24506s = 0L;
        this.f24507t = 0L;
        this.f24508u = 0L;
        this.f24503p = false;
        this.f24511x = -9223372036854775807L;
        this.f24512y = -9223372036854775807L;
        this.f24505r = 0L;
        this.f24502o = 0L;
        this.f24497j = 1.0f;
    }

    public void m15321u(float f) {
        this.f24497j = f;
        C7643v vVar = this.f24493f;
        if (vVar != null) {
            vVar.m15346g();
        }
    }

    public void m15320v() {
        ((C7643v) C1186a.m38188e(this.f24493f)).m15346g();
    }
}
