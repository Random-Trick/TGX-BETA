package e6;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class u6 implements Closeable {
    public static final Map<String, u6> Q = new HashMap();
    public long M;
    public long N;
    public long O;
    public long P;
    public final String f11130a;
    public int f11131b;
    public double f11132c;

    public u6(String str) {
        this.O = 2147483647L;
        this.P = -2147483648L;
        this.f11130a = str;
    }

    public static long A0() {
        return SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public static u6 B0(String str) {
        t6 t6Var;
        t7.a();
        if (!t7.b()) {
            t6Var = t6.R;
            return t6Var;
        }
        Map<String, u6> map = Q;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new u6("detectorTaskWithResource#run"));
        }
        return map.get("detectorTaskWithResource#run");
    }

    @Override
    public void close() {
        long j10 = this.M;
        if (j10 != 0) {
            z0(j10);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }

    public final void m() {
        this.f11131b = 0;
        this.f11132c = 0.0d;
        this.M = 0L;
        this.O = 2147483647L;
        this.P = -2147483648L;
    }

    public u6 s() {
        this.M = A0();
        return this;
    }

    public void y0(long j10) {
        long A0 = A0();
        long j11 = this.N;
        if (j11 != 0 && A0 - j11 >= 1000000) {
            m();
        }
        this.N = A0;
        this.f11131b++;
        this.f11132c += j10;
        this.O = Math.min(this.O, j10);
        this.P = Math.max(this.P, j10);
        if (this.f11131b % 50 == 0) {
            String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", this.f11130a, Long.valueOf(j10), Integer.valueOf(this.f11131b), Long.valueOf(this.O), Long.valueOf(this.P), Integer.valueOf((int) (this.f11132c / this.f11131b)));
            t7.a();
        }
        if (this.f11131b % 500 == 0) {
            m();
        }
    }

    public void z0(long j10) {
        y0(A0() - j10);
    }
}
