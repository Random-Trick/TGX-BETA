package p274t7;

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
import p143k0.C6024a;
import p177m6.AbstractC6775l;
import p177m6.C6777m;
import p177m6.C6781o;
import p190n7.AbstractC7289g;

public class C9034p0 {
    public static final long f28987j = TimeUnit.HOURS.toSeconds(8);
    public final Context f28988a;
    public final C9010e0 f28989b;
    public final C9002a0 f28990c;
    public final FirebaseMessaging f28991d;
    public final AbstractC7289g f28992e;
    public final ScheduledExecutorService f28994g;
    public final C9030n0 f28996i;
    public final Map<String, ArrayDeque<C6777m<Void>>> f28993f = new C6024a();
    public boolean f28995h = false;

    public C9034p0(FirebaseMessaging firebaseMessaging, AbstractC7289g gVar, C9010e0 e0Var, C9030n0 n0Var, C9002a0 a0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f28991d = firebaseMessaging;
        this.f28992e = gVar;
        this.f28989b = e0Var;
        this.f28996i = n0Var;
        this.f28990c = a0Var;
        this.f28988a = context;
        this.f28994g = scheduledExecutorService;
    }

    public static <T> T m10643a(AbstractC6775l<T> lVar) {
        Throwable e;
        try {
            return (T) C6781o.m19054b(lVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e3);
            }
        } catch (TimeoutException e4) {
            e = e4;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public static AbstractC6775l<C9034p0> m10640d(final FirebaseMessaging firebaseMessaging, final AbstractC7289g gVar, final C9010e0 e0Var, final C9002a0 a0Var, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return C6781o.m19053c(scheduledExecutorService, new Callable(context, scheduledExecutorService, firebaseMessaging, gVar, e0Var, a0Var) {
            public final Context f28980a;
            public final ScheduledExecutorService f28981b;
            public final FirebaseMessaging f28982c;
            public final AbstractC7289g f28983d;
            public final C9010e0 f28984e;
            public final C9002a0 f28985f;

            {
                this.f28980a = context;
                this.f28981b = scheduledExecutorService;
                this.f28982c = firebaseMessaging;
                this.f28983d = gVar;
                this.f28984e = e0Var;
                this.f28985f = a0Var;
            }

            @Override
            public Object call() {
                return C9034p0.m10636h(this.f28980a, this.f28981b, this.f28982c, this.f28983d, this.f28984e, this.f28985f);
            }
        });
    }

    public static boolean m10638f() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public static final C9034p0 m10636h(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, AbstractC7289g gVar, C9010e0 e0Var, C9002a0 a0Var) {
        return new C9034p0(firebaseMessaging, gVar, e0Var, C9030n0.m10654a(context, scheduledExecutorService), a0Var, context, scheduledExecutorService);
    }

    public final void m10642b(String str) {
        m10643a(this.f28990c.m10722j((String) m10643a(this.f28992e.mo17134a()), this.f28991d.m30232c(), str));
    }

    public final void m10641c(String str) {
        m10643a(this.f28990c.m10721k((String) m10643a(this.f28992e.mo17134a()), this.f28991d.m30232c(), str));
    }

    public boolean m10639e() {
        return this.f28996i.m10653b() != null;
    }

    public synchronized boolean m10637g() {
        return this.f28995h;
    }

    public final void m10635i(C9028m0 m0Var) {
        synchronized (this.f28993f) {
            String e = m0Var.m10663e();
            if (this.f28993f.containsKey(e)) {
                ArrayDeque<C6777m<Void>> arrayDeque = this.f28993f.get(e);
                C6777m<Void> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.m19085c(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f28993f.remove(e);
                }
            }
        }
    }

    public boolean m10634j(p274t7.C9028m0 r7) {
        throw new UnsupportedOperationException("Method not decompiled: p274t7.C9034p0.m10634j(t7.m0):boolean");
    }

    public void m10633k(Runnable runnable, long j) {
        this.f28994g.schedule(runnable, j, TimeUnit.SECONDS);
    }

    public synchronized void m10632l(boolean z) {
        this.f28995h = z;
    }

    public final void m10631m() {
        if (!m10637g()) {
            m10628p(0L);
        }
    }

    public void m10630n() {
        if (m10639e()) {
            m10631m();
        }
    }

    public boolean m10629o() {
        throw new UnsupportedOperationException("Method not decompiled: p274t7.C9034p0.m10629o():boolean");
    }

    public void m10628p(long j) {
        m10633k(new RunnableC9036q0(this, this.f28988a, this.f28989b, Math.min(Math.max(30L, j + j), f28987j)), j);
        m10632l(true);
    }
}
