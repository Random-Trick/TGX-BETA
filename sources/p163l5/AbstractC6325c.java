package p163l5;

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
import p118i5.C5217a;
import p118i5.C5219c;
import p118i5.C5221e;
import p133j5.C5863d;

public abstract class AbstractC6325c<T extends IInterface> {
    public int f19864M;
    public long f19865N;
    public C6383s1 f19867P;
    public final Context f19868Q;
    public final Looper f19869R;
    public final AbstractC6349i f19870S;
    public final C5221e f19871T;
    public final Handler f19872U;
    @GuardedBy("mServiceBrokerLock")
    public AbstractC6365n f19875X;
    @RecentlyNonNull
    public AbstractC6328c f19876Y;
    @GuardedBy("mLock")
    public T f19877Z;
    public int f19878a;
    public long f19880b;
    @GuardedBy("mLock")
    public ServiceConnectionC6339e1 f19881b0;
    public long f19882c;
    public final AbstractC6326a f19884d0;
    public final AbstractC6327b f19885e0;
    public final int f19886f0;
    public final String f19887g0;
    public volatile String f19888h0;
    public static final C5219c[] f19863n0 = new C5219c[0];
    @RecentlyNonNull
    public static final String[] f19862m0 = {"service_esmobile", "service_googleme"};
    public volatile String f19866O = null;
    public final Object f19873V = new Object();
    public final Object f19874W = new Object();
    public final ArrayList<AbstractC6332c1<?>> f19879a0 = new ArrayList<>();
    @GuardedBy("mLock")
    public int f19883c0 = 1;
    public C5217a f19889i0 = null;
    public boolean f19890j0 = false;
    public volatile C6348h1 f19891k0 = null;
    @RecentlyNonNull
    public AtomicInteger f19892l0 = new AtomicInteger(0);

    public interface AbstractC6326a {
        void mo20579q(int i);

        void mo20578t(Bundle bundle);
    }

    public interface AbstractC6327b {
        void mo20574s(@RecentlyNonNull C5217a aVar);
    }

    public interface AbstractC6328c {
        void mo20623b(@RecentlyNonNull C5217a aVar);
    }

    public class C6329d implements AbstractC6328c {
        public C6329d() {
        }

        @Override
        public final void mo20623b(@RecentlyNonNull C5217a aVar) {
            if (aVar.m23612f()) {
                AbstractC6325c cVar = AbstractC6325c.this;
                cVar.m20632n(null, cVar.mo20584F());
            } else if (AbstractC6325c.this.f19885e0 != null) {
                AbstractC6325c.this.f19885e0.mo20574s(aVar);
            }
        }
    }

    public interface AbstractC6330e {
        void mo20622a();
    }

    public AbstractC6325c(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull AbstractC6349i iVar, @RecentlyNonNull C5221e eVar, int i, AbstractC6326a aVar, AbstractC6327b bVar, String str) {
        C6378r.m20506l(context, "Context must not be null");
        this.f19868Q = context;
        C6378r.m20506l(looper, "Looper must not be null");
        this.f19869R = looper;
        C6378r.m20506l(iVar, "Supervisor must not be null");
        this.f19870S = iVar;
        C6378r.m20506l(eVar, "API availability must not be null");
        this.f19871T = eVar;
        this.f19872U = new HandlerC6324b1(this, looper);
        this.f19886f0 = i;
        this.f19884d0 = aVar;
        this.f19885e0 = bVar;
        this.f19887g0 = str;
    }

    public static void m20653X(AbstractC6325c cVar, int i) {
        int i2;
        int i3;
        synchronized (cVar.f19873V) {
            i2 = cVar.f19883c0;
        }
        if (i2 == 3) {
            cVar.f19890j0 = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = cVar.f19872U;
        handler.sendMessage(handler.obtainMessage(i3, cVar.f19892l0.get(), 16));
    }

    public static boolean m20647b0(p163l5.AbstractC6325c r2) {
        throw new UnsupportedOperationException("Method not decompiled: p163l5.AbstractC6325c.m20647b0(l5.c):boolean");
    }

    public static boolean m20640g0(AbstractC6325c cVar, int i, int i2, IInterface iInterface) {
        synchronized (cVar.f19873V) {
            if (cVar.f19883c0 != i) {
                return false;
            }
            cVar.m20634k0(i2, iInterface);
            return true;
        }
    }

    public static void m20635j0(AbstractC6325c cVar, C6348h1 h1Var) {
        cVar.f19891k0 = h1Var;
        if (cVar.mo906U()) {
            C6340f fVar = h1Var.f19953M;
            C6381s.m20498b().m20497c(fVar == null ? null : fVar.m20589g());
        }
    }

    @RecentlyNullable
    public Bundle m20670A() {
        return null;
    }

    @RecentlyNonNull
    public final Context m20669B() {
        return this.f19868Q;
    }

    public int m20668C() {
        return this.f19886f0;
    }

    @RecentlyNonNull
    public Bundle mo943D() {
        return new Bundle();
    }

    @RecentlyNullable
    public String m20667E() {
        return null;
    }

    @RecentlyNonNull
    public Set<Scope> mo20584F() {
        return Collections.emptySet();
    }

    @RecentlyNonNull
    public final T m20666G() {
        T t;
        synchronized (this.f19873V) {
            if (this.f19883c0 != 5) {
                m20625v();
                t = this.f19877Z;
                C6378r.m20506l(t, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    public abstract String mo942H();

    public abstract String mo941I();

    @RecentlyNonNull
    public String m20665J() {
        return "com.google.android.gms";
    }

    @RecentlyNullable
    public C6340f m20664K() {
        C6348h1 h1Var = this.f19891k0;
        if (h1Var == null) {
            return null;
        }
        return h1Var.f19953M;
    }

    public boolean mo17208L() {
        return false;
    }

    public boolean m20663M() {
        return this.f19891k0 != null;
    }

    public void m20662N(@RecentlyNonNull T t) {
        this.f19882c = System.currentTimeMillis();
    }

    public void m20661O(@RecentlyNonNull C5217a aVar) {
        this.f19864M = aVar.m23616b();
        this.f19865N = System.currentTimeMillis();
    }

    public void m20660P(int i) {
        this.f19878a = i;
        this.f19880b = System.currentTimeMillis();
    }

    public void m20659Q(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f19872U;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C6342f1(this, i, iBinder, bundle)));
    }

    public boolean m20658R() {
        return false;
    }

    public void m20657S(@RecentlyNonNull String str) {
        this.f19888h0 = str;
    }

    public void m20656T(int i) {
        Handler handler = this.f19872U;
        handler.sendMessage(handler.obtainMessage(6, this.f19892l0.get(), i));
    }

    public boolean mo906U() {
        return false;
    }

    @RecentlyNonNull
    public final String m20655V() {
        String str = this.f19887g0;
        return str == null ? this.f19868Q.getClass().getName() : str;
    }

    public final void m20654W(int i, Bundle bundle, int i2) {
        Handler handler = this.f19872U;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C6345g1(this, i, null)));
    }

    public boolean m20650a() {
        boolean z;
        synchronized (this.f19873V) {
            z = this.f19883c0 == 4;
        }
        return z;
    }

    public boolean m20648b() {
        return false;
    }

    public void m20644e(@RecentlyNonNull String str) {
        this.f19866O = str;
        mo905j();
    }

    public boolean m20641g() {
        boolean z;
        synchronized (this.f19873V) {
            int i = this.f19883c0;
            z = true;
            if (!(i == 2 || i == 3)) {
                z = false;
            }
        }
        return z;
    }

    @RecentlyNonNull
    public String m20639h() {
        C6383s1 s1Var;
        if (m20650a() && (s1Var = this.f19867P) != null) {
            return s1Var.m20495b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public void m20637i(@RecentlyNonNull AbstractC6328c cVar) {
        C6378r.m20506l(cVar, "Connection progress callbacks cannot be null.");
        this.f19876Y = cVar;
        m20634k0(2, null);
    }

    public void mo905j() {
        this.f19892l0.incrementAndGet();
        synchronized (this.f19879a0) {
            int size = this.f19879a0.size();
            for (int i = 0; i < size; i++) {
                this.f19879a0.get(i).m20619e();
            }
            this.f19879a0.clear();
        }
        synchronized (this.f19874W) {
            this.f19875X = null;
        }
        m20634k0(1, null);
    }

    public final void m20634k0(int i, T t) {
        C6383s1 s1Var;
        C6383s1 s1Var2;
        boolean z = false;
        if ((i == 4) == (t != null)) {
            z = true;
        }
        C6378r.m20517a(z);
        synchronized (this.f19873V) {
            this.f19883c0 = i;
            this.f19877Z = t;
            if (i == 1) {
                ServiceConnectionC6339e1 e1Var = this.f19881b0;
                if (e1Var != null) {
                    AbstractC6349i iVar = this.f19870S;
                    String a = this.f19867P.m20496a();
                    C6378r.m20507k(a);
                    iVar.m20575c(a, this.f19867P.m20495b(), this.f19867P.m20494c(), e1Var, m20655V(), this.f19867P.m20493d());
                    this.f19881b0 = null;
                }
            } else if (i == 2 || i == 3) {
                ServiceConnectionC6339e1 e1Var2 = this.f19881b0;
                if (!(e1Var2 == null || (s1Var2 = this.f19867P) == null)) {
                    String a2 = s1Var2.m20496a();
                    String b = this.f19867P.m20495b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 70 + String.valueOf(b).length());
                    sb2.append("Calling connect() while still connected, missing disconnect() for ");
                    sb2.append(a2);
                    sb2.append(" on ");
                    sb2.append(b);
                    Log.e("GmsClient", sb2.toString());
                    AbstractC6349i iVar2 = this.f19870S;
                    String a3 = this.f19867P.m20496a();
                    C6378r.m20507k(a3);
                    iVar2.m20575c(a3, this.f19867P.m20495b(), this.f19867P.m20494c(), e1Var2, m20655V(), this.f19867P.m20493d());
                    this.f19892l0.incrementAndGet();
                }
                ServiceConnectionC6339e1 e1Var3 = new ServiceConnectionC6339e1(this, this.f19892l0.get());
                this.f19881b0 = e1Var3;
                if (this.f19883c0 != 3 || m20667E() == null) {
                    s1Var = new C6383s1(m20665J(), mo941I(), false, AbstractC6349i.m20577a(), mo17208L());
                } else {
                    s1Var = new C6383s1(m20669B().getPackageName(), m20667E(), true, AbstractC6349i.m20577a(), false);
                }
                this.f19867P = s1Var;
                if (!s1Var.m20493d() || mo939p() >= 17895000) {
                    AbstractC6349i iVar3 = this.f19870S;
                    String a4 = this.f19867P.m20496a();
                    C6378r.m20507k(a4);
                    if (!iVar3.mo20532d(new C6361l1(a4, this.f19867P.m20495b(), this.f19867P.m20494c(), this.f19867P.m20493d()), e1Var3, m20655V())) {
                        String a5 = this.f19867P.m20496a();
                        String b2 = this.f19867P.m20495b();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(a5).length() + 34 + String.valueOf(b2).length());
                        sb3.append("unable to connect to service: ");
                        sb3.append(a5);
                        sb3.append(" on ");
                        sb3.append(b2);
                        Log.e("GmsClient", sb3.toString());
                        m20654W(16, null, this.f19892l0.get());
                    }
                } else {
                    String valueOf = String.valueOf(this.f19867P.m20496a());
                    throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
            } else if (i == 4) {
                C6378r.m20507k(t);
                m20662N(t);
            }
        }
    }

    public void m20633m(@RecentlyNonNull String str, @RecentlyNonNull FileDescriptor fileDescriptor, @RecentlyNonNull PrintWriter printWriter, @RecentlyNonNull String[] strArr) {
        int i;
        T t;
        AbstractC6365n nVar;
        synchronized (this.f19873V) {
            i = this.f19883c0;
            t = this.f19877Z;
        }
        synchronized (this.f19874W) {
            nVar = this.f19875X;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) mo942H()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (nVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(nVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f19882c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.f19882c;
            String format = simpleDateFormat.format(new Date(j));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format).length() + 21);
            sb2.append(j);
            sb2.append(" ");
            sb2.append(format);
            append.println(sb2.toString());
        }
        if (this.f19880b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.f19878a;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append((CharSequence) String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f19880b;
            String format2 = simpleDateFormat.format(new Date(j2));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb3.append(j2);
            sb3.append(" ");
            sb3.append(format2);
            append2.println(sb3.toString());
        }
        if (this.f19865N > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) C5863d.m21928a(this.f19864M));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f19865N;
            String format3 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb4 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb4.append(j3);
            sb4.append(" ");
            sb4.append(format3);
            append3.println(sb4.toString());
        }
    }

    public void m20632n(AbstractC6355k kVar, @RecentlyNonNull Set<Scope> set) {
        Throwable e;
        Bundle D = mo943D();
        C6343g gVar = new C6343g(this.f19886f0, this.f19888h0);
        gVar.f19934M = this.f19868Q.getPackageName();
        gVar.f19937P = D;
        if (set != null) {
            gVar.f19936O = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo20627t()) {
            Account y = mo20580y();
            if (y == null) {
                y = new Account("<<default account>>", "com.google");
            }
            gVar.f19938Q = y;
            if (kVar != null) {
                gVar.f19935N = kVar.asBinder();
            }
        } else if (m20658R()) {
            gVar.f19938Q = mo20580y();
        }
        gVar.f19939R = f19863n0;
        gVar.f19940S = mo937z();
        if (mo906U()) {
            gVar.f19943V = true;
        }
        try {
            synchronized (this.f19874W) {
                AbstractC6365n nVar = this.f19875X;
                if (nVar != null) {
                    nVar.mo20474e1(new BinderC6335d1(this, this.f19892l0.get()), gVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            m20656T(3);
        } catch (RemoteException e3) {
            e = e3;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m20659Q(8, null, null, this.f19892l0.get());
        } catch (SecurityException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m20659Q(8, null, null, this.f19892l0.get());
        }
    }

    public boolean m20631o() {
        return true;
    }

    public int mo939p() {
        return C5221e.f17368a;
    }

    @RecentlyNullable
    public final C5219c[] m20630q() {
        C6348h1 h1Var = this.f19891k0;
        if (h1Var == null) {
            return null;
        }
        return h1Var.f19955b;
    }

    @RecentlyNullable
    public String m20629r() {
        return this.f19866O;
    }

    @RecentlyNonNull
    public Intent m20628s() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public boolean mo20627t() {
        return false;
    }

    public void m20626u(@RecentlyNonNull AbstractC6330e eVar) {
        eVar.mo20622a();
    }

    public final void m20625v() {
        if (!m20650a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    @RecentlyNullable
    public abstract T mo938w(@RecentlyNonNull IBinder iBinder);

    public boolean m20624x() {
        return false;
    }

    @RecentlyNullable
    public Account mo20580y() {
        return null;
    }

    @RecentlyNonNull
    public C5219c[] mo937z() {
        return f19863n0;
    }
}
