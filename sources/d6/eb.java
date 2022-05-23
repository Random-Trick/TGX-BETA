package d6;

import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import m5.p;
import m5.v;
import m5.w;
import m5.x;
import m5.y;
import n6.g;

public final class eb {
    public final x f6484a;
    public final AtomicLong f6485b = new AtomicLong(-1);

    public eb(Context context, String str) {
        this.f6484a = w.b(context, y.c().b("mlkit:vision").a());
    }

    public static eb a(Context context) {
        return new eb(context, "mlkit:vision");
    }

    public final void b(long j10, Exception exc) {
        this.f6485b.set(j10);
    }

    public final synchronized void c(int i10, int i11, long j10, long j11) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f6485b.get() != -1 && elapsedRealtime - this.f6485b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f6484a.a(new v(0, Arrays.asList(new p(i10, i11, 0, j10, j11, null, null, 0)))).e(new g() {
            @Override
            public final void c(Exception exc) {
                eb.this.b(elapsedRealtime, exc);
            }
        });
    }
}
