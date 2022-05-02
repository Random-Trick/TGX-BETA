package p199o3;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import p020b5.C1186a;
import p020b5.C1216l0;

public final class C7645w {
    public long f24479A;
    public long f24480B;
    public long f24481C;
    public boolean f24482D;
    public long f24483E;
    public long f24484F;
    public final AbstractC7646a f24485a;
    public final long[] f24486b;
    public AudioTrack f24487c;
    public int f24488d;
    public int f24489e;
    public C7643v f24490f;
    public int f24491g;
    public boolean f24492h;
    public long f24493i;
    public float f24494j;
    public boolean f24495k;
    public long f24496l;
    public long f24497m;
    public Method f24498n;
    public long f24499o;
    public boolean f24500p;
    public boolean f24501q;
    public long f24502r;
    public long f24503s;
    public long f24504t;
    public long f24505u;
    public int f24506v;
    public int f24507w;
    public long f24508x;
    public long f24509y;
    public long f24510z;

    public interface AbstractC7646a {
        void mo15319a(int i, long j);

        void mo15318b(long j);

        void mo15317c(long j);

        void mo15316d(long j, long j2, long j3, long j4);

        void mo15315e(long j, long j2, long j3, long j4);
    }

    public C7645w(AbstractC7646a aVar) {
        this.f24485a = (AbstractC7646a) C1186a.m38185e(aVar);
        if (C1216l0.f4526a >= 18) {
            try {
                this.f24498n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f24486b = new long[10];
    }

    public static boolean m15326p(int i) {
        return C1216l0.f4526a < 23 && (i == 5 || i == 6);
    }

    public final boolean m15341a() {
        return this.f24492h && ((AudioTrack) C1186a.m38185e(this.f24487c)).getPlayState() == 2 && m15336f() == 0;
    }

    public final long m15340b(long j) {
        return (j * 1000000) / this.f24491g;
    }

    public int m15339c(long j) {
        return this.f24489e - ((int) (j - (m15336f() * this.f24488d)));
    }

    public long m15338d(boolean z) {
        long j;
        if (((AudioTrack) C1186a.m38185e(this.f24487c)).getPlayState() == 3) {
            m15328n();
        }
        long nanoTime = System.nanoTime() / 1000;
        C7643v vVar = (C7643v) C1186a.m38185e(this.f24490f);
        boolean d = vVar.m15349d();
        if (d) {
            j = m15340b(vVar.m15351b()) + C1216l0.m37994S(nanoTime - vVar.m15350c(), this.f24494j);
        } else {
            if (this.f24507w == 0) {
                j = m15335g();
            } else {
                j = this.f24496l + nanoTime;
            }
            if (!z) {
                j = Math.max(0L, j - this.f24499o);
            }
        }
        if (this.f24482D != d) {
            this.f24484F = this.f24481C;
            this.f24483E = this.f24480B;
        }
        long j2 = nanoTime - this.f24484F;
        if (j2 < 1000000) {
            long j3 = (j2 * 1000) / 1000000;
            j = ((j * j3) + ((1000 - j3) * (this.f24483E + C1216l0.m37994S(j2, this.f24494j)))) / 1000;
        }
        if (!this.f24495k) {
            long j4 = this.f24480B;
            if (j > j4) {
                this.f24495k = true;
                this.f24485a.mo15318b(System.currentTimeMillis() - C1216l0.m38006H0(C1216l0.m37989X(C1216l0.m38006H0(j - j4), this.f24494j)));
            }
        }
        this.f24481C = nanoTime;
        this.f24480B = j;
        this.f24482D = d;
        return j;
    }

    public long m15337e(long j) {
        return C1216l0.m38006H0(m15340b(j - m15336f()));
    }

    public final long m15336f() {
        AudioTrack audioTrack = (AudioTrack) C1186a.m38185e(this.f24487c);
        if (this.f24508x != -9223372036854775807L) {
            return Math.min(this.f24479A, this.f24510z + ((((SystemClock.elapsedRealtime() * 1000) - this.f24508x) * this.f24491g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & audioTrack.getPlaybackHeadPosition();
        if (this.f24492h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f24505u = this.f24503s;
            }
            playbackHeadPosition += this.f24505u;
        }
        if (C1216l0.f4526a <= 29) {
            if (playbackHeadPosition == 0 && this.f24503s > 0 && playState == 3) {
                if (this.f24509y == -9223372036854775807L) {
                    this.f24509y = SystemClock.elapsedRealtime();
                }
                return this.f24503s;
            }
            this.f24509y = -9223372036854775807L;
        }
        if (this.f24503s > playbackHeadPosition) {
            this.f24504t++;
        }
        this.f24503s = playbackHeadPosition;
        return playbackHeadPosition + (this.f24504t << 32);
    }

    public final long m15335g() {
        return m15340b(m15336f());
    }

    public void m15334h(long j) {
        this.f24510z = m15336f();
        this.f24508x = SystemClock.elapsedRealtime() * 1000;
        this.f24479A = j;
    }

    public boolean m15333i(long j) {
        return j > m15336f() || m15341a();
    }

    public boolean m15332j() {
        return ((AudioTrack) C1186a.m38185e(this.f24487c)).getPlayState() == 3;
    }

    public boolean m15331k(long j) {
        return this.f24509y != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f24509y >= 200;
    }

    public boolean m15330l(long j) {
        int playState = ((AudioTrack) C1186a.m38185e(this.f24487c)).getPlayState();
        if (this.f24492h) {
            if (playState == 2) {
                this.f24500p = false;
                return false;
            } else if (playState == 1 && m15336f() == 0) {
                return false;
            }
        }
        boolean z = this.f24500p;
        boolean i = m15333i(j);
        this.f24500p = i;
        if (z && !i && playState != 1) {
            this.f24485a.mo15319a(this.f24489e, C1216l0.m38006H0(this.f24493i));
        }
        return true;
    }

    public final void m15329m(long j, long j2) {
        C7643v vVar = (C7643v) C1186a.m38185e(this.f24490f);
        if (vVar.m15348e(j)) {
            long c = vVar.m15350c();
            long b = vVar.m15351b();
            if (Math.abs(c - j) > 5000000) {
                this.f24485a.mo15315e(b, c, j, j2);
                vVar.m15347f();
            } else if (Math.abs(m15340b(b) - j2) > 5000000) {
                this.f24485a.mo15316d(b, c, j, j2);
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
            if (nanoTime - this.f24497m >= 30000) {
                long[] jArr = this.f24486b;
                int i = this.f24506v;
                jArr[i] = g - nanoTime;
                this.f24506v = (i + 1) % 10;
                int i2 = this.f24507w;
                if (i2 < 10) {
                    this.f24507w = i2 + 1;
                }
                this.f24497m = nanoTime;
                this.f24496l = 0L;
                int i3 = 0;
                while (true) {
                    int i4 = this.f24507w;
                    if (i3 >= i4) {
                        break;
                    }
                    this.f24496l += this.f24486b[i3] / i4;
                    i3++;
                }
            }
            if (!this.f24492h) {
                m15329m(nanoTime, g);
                m15327o(nanoTime);
            }
        }
    }

    public final void m15327o(long j) {
        Method method;
        if (this.f24501q && (method = this.f24498n) != null && j - this.f24502r >= 500000) {
            try {
                long intValue = (((Integer) C1216l0.m37968j((Integer) method.invoke(C1186a.m38185e(this.f24487c), new Object[0]))).intValue() * 1000) - this.f24493i;
                this.f24499o = intValue;
                long max = Math.max(intValue, 0L);
                this.f24499o = max;
                if (max > 5000000) {
                    this.f24485a.mo15317c(max);
                    this.f24499o = 0L;
                }
            } catch (Exception unused) {
                this.f24498n = null;
            }
            this.f24502r = j;
        }
    }

    public boolean m15325q() {
        m15323s();
        if (this.f24508x != -9223372036854775807L) {
            return false;
        }
        ((C7643v) C1186a.m38185e(this.f24490f)).m15346g();
        return true;
    }

    public void m15324r() {
        m15323s();
        this.f24487c = null;
        this.f24490f = null;
    }

    public final void m15323s() {
        this.f24496l = 0L;
        this.f24507w = 0;
        this.f24506v = 0;
        this.f24497m = 0L;
        this.f24481C = 0L;
        this.f24484F = 0L;
        this.f24495k = false;
    }

    public void m15322t(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.f24487c = audioTrack;
        this.f24488d = i2;
        this.f24489e = i3;
        this.f24490f = new C7643v(audioTrack);
        this.f24491g = audioTrack.getSampleRate();
        this.f24492h = z && m15326p(i);
        boolean i0 = C1216l0.m37969i0(i);
        this.f24501q = i0;
        this.f24493i = i0 ? m15340b(i3 / i2) : -9223372036854775807L;
        this.f24503s = 0L;
        this.f24504t = 0L;
        this.f24505u = 0L;
        this.f24500p = false;
        this.f24508x = -9223372036854775807L;
        this.f24509y = -9223372036854775807L;
        this.f24502r = 0L;
        this.f24499o = 0L;
        this.f24494j = 1.0f;
    }

    public void m15321u(float f) {
        this.f24494j = f;
        C7643v vVar = this.f24490f;
        if (vVar != null) {
            vVar.m15346g();
        }
    }

    public void m15320v() {
        ((C7643v) C1186a.m38185e(this.f24490f)).m15346g();
    }
}
