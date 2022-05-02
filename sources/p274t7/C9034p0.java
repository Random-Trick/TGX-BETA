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
    public static final long f28984j = TimeUnit.HOURS.toSeconds(8);
    public final Context f28985a;
    public final C9010e0 f28986b;
    public final C9002a0 f28987c;
    public final FirebaseMessaging f28988d;
    public final AbstractC7289g f28989e;
    public final ScheduledExecutorService f28991g;
    public final C9030n0 f28993i;
    public final Map<String, ArrayDeque<C6777m<Void>>> f28990f = new C6024a();
    public boolean f28992h = false;

    public C9034p0(FirebaseMessaging firebaseMessaging, AbstractC7289g gVar, C9010e0 e0Var, C9030n0 n0Var, C9002a0 a0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f28988d = firebaseMessaging;
        this.f28989e = gVar;
        this.f28986b = e0Var;
        this.f28993i = n0Var;
        this.f28987c = a0Var;
        this.f28985a = context;
        this.f28991g = scheduledExecutorService;
    }

    public static <T> T m10644a(AbstractC6775l<T> lVar) {
        Throwable e;
        try {
            return (T) C6781o.m19053b(lVar, 30L, TimeUnit.SECONDS);
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

    public static AbstractC6775l<C9034p0> m10641d(final FirebaseMessaging firebaseMessaging, final AbstractC7289g gVar, final C9010e0 e0Var, final C9002a0 a0Var, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return C6781o.m19052c(scheduledExecutorService, new Callable(context, scheduledExecutorService, firebaseMessaging, gVar, e0Var, a0Var) {
            public final Context f28977a;
            public final ScheduledExecutorService f28978b;
            public final FirebaseMessaging f28979c;
            public final AbstractC7289g f28980d;
            public final C9010e0 f28981e;
            public final C9002a0 f28982f;

            {
                this.f28977a = context;
                this.f28978b = scheduledExecutorService;
                this.f28979c = firebaseMessaging;
                this.f28980d = gVar;
                this.f28981e = e0Var;
                this.f28982f = a0Var;
            }

            @Override
            public Object call() {
                return C9034p0.m10637h(this.f28977a, this.f28978b, this.f28979c, this.f28980d, this.f28981e, this.f28982f);
            }
        });
    }

    public static boolean m10639f() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public static final C9034p0 m10637h(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, AbstractC7289g gVar, C9010e0 e0Var, C9002a0 a0Var) {
        return new C9034p0(firebaseMessaging, gVar, e0Var, C9030n0.m10655a(context, scheduledExecutorService), a0Var, context, scheduledExecutorService);
    }

    public final void m10643b(String str) {
        m10644a(this.f28987c.m10723j((String) m10644a(this.f28989e.mo17134a()), this.f28988d.m30230c(), str));
    }

    public final void m10642c(String str) {
        m10644a(this.f28987c.m10722k((String) m10644a(this.f28989e.mo17134a()), this.f28988d.m30230c(), str));
    }

    public boolean m10640e() {
        return this.f28993i.m10654b() != null;
    }

    public synchronized boolean m10638g() {
        return this.f28992h;
    }

    public final void m10636i(C9028m0 m0Var) {
        synchronized (this.f28990f) {
            String e = m0Var.m10664e();
            if (this.f28990f.containsKey(e)) {
                ArrayDeque<C6777m<Void>> arrayDeque = this.f28990f.get(e);
                C6777m<Void> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.m19084c(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f28990f.remove(e);
                }
            }
        }
    }

    public boolean m10635j(p274t7.C9028m0 r7) {
        throw new UnsupportedOperationException("Method not decompiled: p274t7.C9034p0.m10635j(t7.m0):boolean");
    }

    public void m10634k(Runnable runnable, long j) {
        this.f28991g.schedule(runnable, j, TimeUnit.SECONDS);
    }

    public synchronized void m10633l(boolean z) {
        this.f28992h = z;
    }

    public final void m10632m() {
        if (!m10638g()) {
            m10629p(0L);
        }
    }

    public void m10631n() {
        if (m10640e()) {
            m10632m();
        }
    }

    public boolean m10630o() {
        throw new UnsupportedOperationException("Method not decompiled: p274t7.C9034p0.m10630o():boolean");
    }

    public void m10629p(long j) {
        m10634k(new RunnableC9036q0(this, this.f28985a, this.f28986b, Math.min(Math.max(30L, j + j), f28984j)), j);
        m10633l(true);
    }
}
