package p046d6;

import android.os.Build;
import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class C3812u6 implements Closeable {
    public static final Map<String, C3812u6> f12884Q = new HashMap();
    public long f12885M;
    public long f12886N;
    public long f12887O;
    public long f12888P;
    public final String f12889a;
    public int f12890b;
    public double f12891c;

    public C3812u6(String str) {
        this.f12887O = 2147483647L;
        this.f12888P = -2147483648L;
        this.f12889a = str;
    }

    public static long m29744A0() {
        if (Build.VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos() / 1000;
        }
        return SystemClock.elapsedRealtime() * 1000;
    }

    public static C3812u6 m29743B0(String str) {
        C3803t6 t6Var;
        C3804t7.m29746a();
        if (!C3804t7.m29745b()) {
            t6Var = C3803t6.f12865R;
            return t6Var;
        }
        Map<String, C3812u6> map = f12884Q;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new C3812u6("detectorTaskWithResource#run"));
        }
        return map.get("detectorTaskWithResource#run");
    }

    @Override
    public void close() {
        long j = this.f12885M;
        if (j != 0) {
            mo29739z0(j);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }

    public final void m29742m() {
        this.f12890b = 0;
        this.f12891c = 0.0d;
        this.f12885M = 0L;
        this.f12887O = 2147483647L;
        this.f12888P = -2147483648L;
    }

    public C3812u6 mo29741t() {
        this.f12885M = m29744A0();
        return this;
    }

    public void mo29740y0(long j) {
        long A0 = m29744A0();
        long j2 = this.f12886N;
        if (j2 != 0 && A0 - j2 >= 1000000) {
            m29742m();
        }
        this.f12886N = A0;
        this.f12890b++;
        this.f12891c += j;
        this.f12887O = Math.min(this.f12887O, j);
        this.f12888P = Math.max(this.f12888P, j);
        if (this.f12890b % 50 == 0) {
            String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", this.f12889a, Long.valueOf(j), Integer.valueOf(this.f12890b), Long.valueOf(this.f12887O), Long.valueOf(this.f12888P), Integer.valueOf((int) (this.f12891c / this.f12890b)));
            C3804t7.m29746a();
        }
        if (this.f12890b % 500 == 0) {
            m29742m();
        }
    }

    public void mo29739z0(long j) {
        mo29740y0(m29744A0() - j);
    }
}
