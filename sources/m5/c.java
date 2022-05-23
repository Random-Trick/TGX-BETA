package m5;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

public abstract class c<T extends IInterface> {
    public int M;
    public long N;
    public s1 P;
    public final Context Q;
    public final Looper R;
    public final i S;
    public final j5.e T;
    public final Handler U;
    @GuardedBy("mServiceBrokerLock")
    public n X;
    @RecentlyNonNull
    public AbstractC0154c Y;
    @GuardedBy("mLock")
    public T Z;
    public int f17149a;
    public long f17151b;
    @GuardedBy("mLock")
    public e1 f17152b0;
    public long f17153c;
    public final a f17155d0;
    public final b f17156e0;
    public final int f17157f0;
    public final String f17158g0;
    public volatile String f17159h0;
    public static final j5.c[] f17148n0 = new j5.c[0];
    @RecentlyNonNull
    public static final String[] f17147m0 = {"service_esmobile", "service_googleme"};
    public volatile String O = null;
    public final Object V = new Object();
    public final Object W = new Object();
    public final ArrayList<c1<?>> f17150a0 = new ArrayList<>();
    @GuardedBy("mLock")
    public int f17154c0 = 1;
    public j5.a f17160i0 = null;
    public boolean f17161j0 = false;
    public volatile h1 f17162k0 = null;
    @RecentlyNonNull
    public AtomicInteger f17163l0 = new AtomicInteger(0);

    public interface a {
        void q(int i10);

        void t(Bundle bundle);
    }

    public interface b {
        void r(@RecentlyNonNull j5.a aVar);
    }

    public interface AbstractC0154c {
        void c(@RecentlyNonNull j5.a aVar);
    }

    public class d implements AbstractC0154c {
        public d() {
        }

        @Override
        public final void c(@RecentlyNonNull j5.a aVar) {
            if (aVar.f()) {
                c cVar = c.this;
                cVar.g(null, cVar.F());
            } else if (c.this.f17156e0 != null) {
                c.this.f17156e0.r(aVar);
            }
        }
    }

    public interface e {
        void a();
    }

    public c(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull i iVar, @RecentlyNonNull j5.e eVar, int i10, a aVar, b bVar, String str) {
        r.l(context, "Context must not be null");
        this.Q = context;
        r.l(looper, "Looper must not be null");
        this.R = looper;
        r.l(iVar, "Supervisor must not be null");
        this.S = iVar;
        r.l(eVar, "API availability must not be null");
        this.T = eVar;
        this.U = new b1(this, looper);
        this.f17157f0 = i10;
        this.f17155d0 = aVar;
        this.f17156e0 = bVar;
        this.f17158g0 = str;
    }

    public static void X(c cVar, int i10) {
        int i11;
        int i12;
        synchronized (cVar.V) {
            i11 = cVar.f17154c0;
        }
        if (i11 == 3) {
            cVar.f17161j0 = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = cVar.U;
        handler.sendMessage(handler.obtainMessage(i12, cVar.f17163l0.get(), 16));
    }

    public static boolean b0(m5.c r2) {
        throw new UnsupportedOperationException("Method not decompiled: m5.c.b0(m5.c):boolean");
    }

    public static boolean g0(c cVar, int i10, int i11, IInterface iInterface) {
        synchronized (cVar.V) {
            if (cVar.f17154c0 != i10) {
                return false;
            }
            cVar.k0(i11, iInterface);
            return true;
        }
    }

    public static void j0(c cVar, h1 h1Var) {
        cVar.f17162k0 = h1Var;
        if (cVar.U()) {
            f fVar = h1Var.M;
            s.b().c(fVar == null ? null : fVar.g());
        }
    }

    @RecentlyNullable
    public Bundle A() {
        return null;
    }

    @RecentlyNonNull
    public final Context B() {
        return this.Q;
    }

    public int C() {
        return this.f17157f0;
    }

    @RecentlyNonNull
    public Bundle D() {
        return new Bundle();
    }

    @RecentlyNullable
    public String E() {
        return null;
    }

    @RecentlyNonNull
    public Set<Scope> F() {
        return Collections.emptySet();
    }

    @RecentlyNonNull
    public final T G() {
        T t10;
        synchronized (this.V) {
            if (this.f17154c0 != 5) {
                v();
                t10 = this.Z;
                r.l(t10, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t10;
    }

    public abstract String H();

    public abstract String I();

    @RecentlyNonNull
    public String J() {
        return "com.google.android.gms";
    }

    @RecentlyNullable
    public f K() {
        h1 h1Var = this.f17162k0;
        if (h1Var == null) {
            return null;
        }
        return h1Var.M;
    }

    public boolean L() {
        return false;
    }

    public boolean M() {
        return this.f17162k0 != null;
    }

    public void N(@RecentlyNonNull T t10) {
        this.f17153c = System.currentTimeMillis();
    }

    public void O(@RecentlyNonNull j5.a aVar) {
        this.M = aVar.b();
        this.N = System.currentTimeMillis();
    }

    public void P(int i10) {
        this.f17149a = i10;
        this.f17151b = System.currentTimeMillis();
    }

    public void Q(int i10, IBinder iBinder, Bundle bundle, int i11) {
        Handler handler = this.U;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, new f1(this, i10, iBinder, bundle)));
    }

    public boolean R() {
        return false;
    }

    public void S(@RecentlyNonNull String str) {
        this.f17159h0 = str;
    }

    public void T(int i10) {
        Handler handler = this.U;
        handler.sendMessage(handler.obtainMessage(6, this.f17163l0.get(), i10));
    }

    public boolean U() {
        return false;
    }

    @RecentlyNonNull
    public final String V() {
        String str = this.f17158g0;
        return str == null ? this.Q.getClass().getName() : str;
    }

    public final void W(int i10, Bundle bundle, int i11) {
        Handler handler = this.U;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, new g1(this, i10, null)));
    }

    public boolean a() {
        boolean z10;
        synchronized (this.V) {
            z10 = this.f17154c0 == 4;
        }
        return z10;
    }

    public boolean b() {
        return false;
    }

    public void f(@RecentlyNonNull String str) {
        this.O = str;
        k();
    }

    public void g(k kVar, @RecentlyNonNull Set<Scope> set) {
        Throwable e10;
        Bundle D = D();
        g gVar = new g(this.f17157f0, this.f17159h0);
        gVar.M = this.Q.getPackageName();
        gVar.P = D;
        if (set != null) {
            gVar.O = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (u()) {
            Account y10 = y();
            if (y10 == null) {
                y10 = new Account("<<default account>>", "com.google");
            }
            gVar.Q = y10;
            if (kVar != null) {
                gVar.N = kVar.asBinder();
            }
        } else if (R()) {
            gVar.Q = y();
        }
        gVar.R = f17148n0;
        gVar.S = z();
        if (U()) {
            gVar.V = true;
        }
        try {
            synchronized (this.W) {
                n nVar = this.X;
                if (nVar != null) {
                    nVar.C(new d1(this, this.f17163l0.get()), gVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e11) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e11);
            T(3);
        } catch (RemoteException e12) {
            e10 = e12;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            Q(8, null, null, this.f17163l0.get());
        } catch (SecurityException e13) {
            throw e13;
        } catch (RuntimeException e14) {
            e10 = e14;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            Q(8, null, null, this.f17163l0.get());
        }
    }

    public boolean h() {
        boolean z10;
        synchronized (this.V) {
            int i10 = this.f17154c0;
            z10 = true;
            if (!(i10 == 2 || i10 == 3)) {
                z10 = false;
            }
        }
        return z10;
    }

    @RecentlyNonNull
    public String i() {
        s1 s1Var;
        if (a() && (s1Var = this.P) != null) {
            return s1Var.b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public void k() {
        this.f17163l0.incrementAndGet();
        synchronized (this.f17150a0) {
            int size = this.f17150a0.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f17150a0.get(i10).e();
            }
            this.f17150a0.clear();
        }
        synchronized (this.W) {
            this.X = null;
        }
        k0(1, null);
    }

    public final void k0(int i10, T t10) {
        s1 s1Var;
        s1 s1Var2;
        boolean z10 = false;
        if ((i10 == 4) == (t10 != null)) {
            z10 = true;
        }
        r.a(z10);
        synchronized (this.V) {
            this.f17154c0 = i10;
            this.Z = t10;
            if (i10 == 1) {
                e1 e1Var = this.f17152b0;
                if (e1Var != null) {
                    i iVar = this.S;
                    String a10 = this.P.a();
                    r.k(a10);
                    iVar.c(a10, this.P.b(), this.P.c(), e1Var, V(), this.P.d());
                    this.f17152b0 = null;
                }
            } else if (i10 == 2 || i10 == 3) {
                e1 e1Var2 = this.f17152b0;
                if (!(e1Var2 == null || (s1Var2 = this.P) == null)) {
                    String a11 = s1Var2.a();
                    String b10 = this.P.b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a11).length() + 70 + String.valueOf(b10).length());
                    sb2.append("Calling connect() while still connected, missing disconnect() for ");
                    sb2.append(a11);
                    sb2.append(" on ");
                    sb2.append(b10);
                    Log.e("GmsClient", sb2.toString());
                    i iVar2 = this.S;
                    String a12 = this.P.a();
                    r.k(a12);
                    iVar2.c(a12, this.P.b(), this.P.c(), e1Var2, V(), this.P.d());
                    this.f17163l0.incrementAndGet();
                }
                e1 e1Var3 = new e1(this, this.f17163l0.get());
                this.f17152b0 = e1Var3;
                if (this.f17154c0 != 3 || E() == null) {
                    s1Var = new s1(J(), I(), false, i.a(), L());
                } else {
                    s1Var = new s1(B().getPackageName(), E(), true, i.a(), false);
                }
                this.P = s1Var;
                if (!s1Var.d() || p() >= 17895000) {
                    i iVar3 = this.S;
                    String a13 = this.P.a();
                    r.k(a13);
                    if (!iVar3.d(new l1(a13, this.P.b(), this.P.c(), this.P.d()), e1Var3, V())) {
                        String a14 = this.P.a();
                        String b11 = this.P.b();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(a14).length() + 34 + String.valueOf(b11).length());
                        sb3.append("unable to connect to service: ");
                        sb3.append(a14);
                        sb3.append(" on ");
                        sb3.append(b11);
                        Log.e("GmsClient", sb3.toString());
                        W(16, null, this.f17163l0.get());
                    }
                } else {
                    String valueOf = String.valueOf(this.P.a());
                    throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
            } else if (i10 == 4) {
                r.k(t10);
                N(t10);
            }
        }
    }

    public void m(@RecentlyNonNull String str, @RecentlyNonNull FileDescriptor fileDescriptor, @RecentlyNonNull PrintWriter printWriter, @RecentlyNonNull String[] strArr) {
        int i10;
        T t10;
        n nVar;
        synchronized (this.V) {
            i10 = this.f17154c0;
            t10 = this.Z;
        }
        synchronized (this.W) {
            nVar = this.X;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i10 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i10 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i10 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i10 == 4) {
            printWriter.print("CONNECTED");
        } else if (i10 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (t10 == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) H()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(t10.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (nVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(nVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f17153c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.f17153c;
            String format = simpleDateFormat.format(new Date(j10));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format).length() + 21);
            sb2.append(j10);
            sb2.append(" ");
            sb2.append(format);
            append.println(sb2.toString());
        }
        if (this.f17151b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.f17149a;
            if (i11 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i11 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i11 != 3) {
                printWriter.append((CharSequence) String.valueOf(i11));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.f17151b;
            String format2 = simpleDateFormat.format(new Date(j11));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb3.append(j11);
            sb3.append(" ");
            sb3.append(format2);
            append2.println(sb3.toString());
        }
        if (this.N > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) k5.d.a(this.M));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.N;
            String format3 = simpleDateFormat.format(new Date(j12));
            StringBuilder sb4 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb4.append(j12);
            sb4.append(" ");
            sb4.append(format3);
            append3.println(sb4.toString());
        }
    }

    public boolean n() {
        return true;
    }

    public void o(@RecentlyNonNull e eVar) {
        eVar.a();
    }

    public int p() {
        return j5.e.f15074a;
    }

    @RecentlyNullable
    public final j5.c[] q() {
        h1 h1Var = this.f17162k0;
        if (h1Var == null) {
            return null;
        }
        return h1Var.f17211b;
    }

    public void r(@RecentlyNonNull AbstractC0154c cVar) {
        r.l(cVar, "Connection progress callbacks cannot be null.");
        this.Y = cVar;
        k0(2, null);
    }

    @RecentlyNullable
    public String s() {
        return this.O;
    }

    @RecentlyNonNull
    public Intent t() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public boolean u() {
        return false;
    }

    public final void v() {
        if (!a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    @RecentlyNullable
    public abstract T w(@RecentlyNonNull IBinder iBinder);

    public boolean x() {
        return false;
    }

    @RecentlyNullable
    public Account y() {
        return null;
    }

    @RecentlyNonNull
    public j5.c[] z() {
        return f17148n0;
    }
}
