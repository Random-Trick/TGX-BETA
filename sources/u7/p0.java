package u7;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k0.a;
import n6.l;
import n6.m;
import n6.o;
import o7.g;

public class p0 {
    public static final long f23672j = TimeUnit.HOURS.toSeconds(8);
    public final Context f23673a;
    public final e0 f23674b;
    public final a0 f23675c;
    public final FirebaseMessaging f23676d;
    public final g f23677e;
    public final ScheduledExecutorService f23679g;
    public final n0 f23681i;
    public final Map<String, ArrayDeque<m<Void>>> f23678f = new a();
    public boolean f23680h = false;

    public p0(FirebaseMessaging firebaseMessaging, g gVar, e0 e0Var, n0 n0Var, a0 a0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f23676d = firebaseMessaging;
        this.f23677e = gVar;
        this.f23674b = e0Var;
        this.f23681i = n0Var;
        this.f23675c = a0Var;
        this.f23673a = context;
        this.f23679g = scheduledExecutorService;
    }

    public static <T> T a(l<T> lVar) {
        Throwable e10;
        try {
            return (T) o.b(lVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e11) {
            e10 = e11;
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        } catch (ExecutionException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e12);
            }
        } catch (TimeoutException e13) {
            e10 = e13;
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        }
    }

    public static l<p0> d(final FirebaseMessaging firebaseMessaging, final g gVar, final e0 e0Var, final a0 a0Var, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return o.c(scheduledExecutorService, new Callable(context, scheduledExecutorService, firebaseMessaging, gVar, e0Var, a0Var) {
            public final Context f23665a;
            public final ScheduledExecutorService f23666b;
            public final FirebaseMessaging f23667c;
            public final g f23668d;
            public final e0 f23669e;
            public final a0 f23670f;

            {
                this.f23665a = context;
                this.f23666b = scheduledExecutorService;
                this.f23667c = firebaseMessaging;
                this.f23668d = gVar;
                this.f23669e = e0Var;
                this.f23670f = a0Var;
            }

            @Override
            public Object call() {
                return p0.h(this.f23665a, this.f23666b, this.f23667c, this.f23668d, this.f23669e, this.f23670f);
            }
        });
    }

    public static boolean f() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public static final p0 h(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, g gVar, e0 e0Var, a0 a0Var) {
        return new p0(firebaseMessaging, gVar, e0Var, n0.a(context, scheduledExecutorService), a0Var, context, scheduledExecutorService);
    }

    public final void b(String str) {
        a(this.f23675c.j((String) a(this.f23677e.a()), this.f23676d.c(), str));
    }

    public final void c(String str) {
        a(this.f23675c.k((String) a(this.f23677e.a()), this.f23676d.c(), str));
    }

    public boolean e() {
        return this.f23681i.b() != null;
    }

    public synchronized boolean g() {
        return this.f23680h;
    }

    public final void i(m0 m0Var) {
        synchronized (this.f23678f) {
            String e10 = m0Var.e();
            if (this.f23678f.containsKey(e10)) {
                ArrayDeque<m<Void>> arrayDeque = this.f23678f.get(e10);
                m<Void> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.c(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f23678f.remove(e10);
                }
            }
        }
    }

    public boolean j(u7.m0 r7) {
        throw new UnsupportedOperationException("Method not decompiled: u7.p0.j(u7.m0):boolean");
    }

    public void k(Runnable runnable, long j10) {
        this.f23679g.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    public synchronized void l(boolean z10) {
        this.f23680h = z10;
    }

    public final void m() {
        if (!g()) {
            p(0L);
        }
    }

    public void n() {
        if (e()) {
            m();
        }
    }

    public boolean o() {
        throw new UnsupportedOperationException("Method not decompiled: u7.p0.o():boolean");
    }

    public void p(long j10) {
        k(new q0(this, this.f23673a, this.f23674b, Math.min(Math.max(30L, j10 + j10), f23672j)), j10);
        l(true);
    }
}
