package p133j5;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.AbstractC3487a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import p118i5.C5220d;
import p133j5.C5850a;
import p134j6.AbstractC5891f;
import p134j6.C5886a;
import p134j6.C5890e;
import p143k0.C6024a;
import p148k5.AbstractC6101e;
import p148k5.AbstractC6134l;
import p148k5.C6111g;
import p148k5.C6119h2;
import p148k5.C6156q0;
import p148k5.C6163r2;
import p148k5.C6195z2;
import p163l5.C6331c0;
import p163l5.C6336e;
import p163l5.C6378r;

@Deprecated
public abstract class AbstractC5867f {
    @GuardedBy("sAllClients")
    public static final Set<AbstractC5867f> f18742a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public static final class C5868a {
        public Account f18743a;
        public int f18746d;
        public View f18747e;
        public String f18748f;
        public String f18749g;
        public final Context f18751i;
        public C6111g f18753k;
        public AbstractC5870c f18755m;
        public Looper f18756n;
        public final Set<Scope> f18744b = new HashSet();
        public final Set<Scope> f18745c = new HashSet();
        public final Map<C5850a<?>, C6331c0> f18750h = new C6024a();
        public final Map<C5850a<?>, C5850a.AbstractC5854d> f18752j = new C6024a();
        public int f18754l = -1;
        public C5220d f18757o = C5220d.m23605p();
        public C5850a.AbstractC5851a<? extends AbstractC5891f, C5886a> f18758p = C5890e.f18775c;
        public final ArrayList<AbstractC5869b> f18759q = new ArrayList<>();
        public final ArrayList<AbstractC5870c> f18760r = new ArrayList<>();

        public C5868a(@RecentlyNonNull Context context) {
            this.f18751i = context;
            this.f18756n = context.getMainLooper();
            this.f18748f = context.getPackageName();
            this.f18749g = context.getClass().getName();
        }

        @RecentlyNonNull
        public C5868a m21906a(@RecentlyNonNull C5850a<Object> aVar) {
            C6378r.m20506l(aVar, "Api must not be null");
            this.f18752j.put(aVar, null);
            List<Scope> a = ((C5850a.AbstractC5858e) C6378r.m20506l(aVar.m21938a(), "Base client builder must not be null")).m21932a(null);
            this.f18745c.addAll(a);
            this.f18744b.addAll(a);
            return this;
        }

        @RecentlyNonNull
        public C5868a m21905b(@RecentlyNonNull AbstractC5870c cVar) {
            C6378r.m20506l(cVar, "Listener must not be null");
            this.f18760r.add(cVar);
            return this;
        }

        @RecentlyNonNull
        public AbstractC5867f m21904c() {
            C6378r.m20516b(!this.f18752j.isEmpty(), "must call addApi() to add at least one API");
            C6336e d = m21903d();
            Map<C5850a<?>, C6331c0> f = d.m20604f();
            C6024a aVar = new C6024a();
            C6024a aVar2 = new C6024a();
            ArrayList arrayList = new ArrayList();
            C5850a<?> aVar3 = null;
            boolean z = false;
            for (C5850a<?> aVar4 : this.f18752j.keySet()) {
                C5850a.AbstractC5854d dVar = this.f18752j.get(aVar4);
                boolean z2 = f.get(aVar4) != null;
                aVar.put(aVar4, Boolean.valueOf(z2));
                C6195z2 z2Var = new C6195z2(aVar4, z2);
                arrayList.add(z2Var);
                C5850a.AbstractC5851a aVar5 = (C5850a.AbstractC5851a) C6378r.m20507k(aVar4.m21937b());
                C5850a.AbstractC5859f c = aVar5.mo21894c(this.f18751i, this.f18756n, d, dVar, z2Var, z2Var);
                aVar2.put(aVar4.m21936c(), c);
                if (aVar5.m21931b() == 1) {
                    z = dVar != null;
                }
                if (c.mo21250b()) {
                    if (aVar3 == null) {
                        aVar3 = aVar4;
                    } else {
                        String d2 = aVar4.m21935d();
                        String d3 = aVar3.m21935d();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(d2).length() + 21 + String.valueOf(d3).length());
                        sb2.append(d2);
                        sb2.append(" cannot be used with ");
                        sb2.append(d3);
                        throw new IllegalStateException(sb2.toString());
                    }
                }
            }
            if (aVar3 != null) {
                if (!z) {
                    C6378r.m20503o(this.f18743a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar3.m21935d());
                    C6378r.m20503o(this.f18744b.equals(this.f18745c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar3.m21935d());
                } else {
                    String d4 = aVar3.m21935d();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(d4).length() + 82);
                    sb3.append("With using ");
                    sb3.append(d4);
                    sb3.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb3.toString());
                }
            }
            C6156q0 q0Var = new C6156q0(this.f18751i, new ReentrantLock(), this.f18756n, d, this.f18757o, this.f18758p, aVar, this.f18759q, this.f18760r, aVar2, this.f18754l, C6156q0.m21166s(aVar2.values(), true), arrayList);
            synchronized (AbstractC5867f.f18742a) {
                AbstractC5867f.f18742a.add(q0Var);
            }
            if (this.f18754l >= 0) {
                C6163r2.m21141k(this.f18753k).m21140l(this.f18754l, q0Var, this.f18755m);
            }
            return q0Var;
        }

        @RecentlyNonNull
        public C6336e m21903d() {
            C5886a aVar = C5886a.f18763k;
            Map<C5850a<?>, C5850a.AbstractC5854d> map = this.f18752j;
            C5850a<C5886a> aVar2 = C5890e.f18779g;
            if (map.containsKey(aVar2)) {
                aVar = (C5886a) this.f18752j.get(aVar2);
            }
            return new C6336e(this.f18743a, this.f18744b, this.f18750h, this.f18746d, this.f18747e, this.f18748f, this.f18749g, aVar, false);
        }
    }

    @Deprecated
    public interface AbstractC5869b extends AbstractC6101e {
    }

    @Deprecated
    public interface AbstractC5870c extends AbstractC6134l {
    }

    public abstract void mo21090d();

    public abstract void mo21089e();

    @RecentlyNonNull
    public <A extends C5850a.AbstractC5852b, R extends AbstractC5876k, T extends AbstractC3487a<R, A>> T mo21176f(@RecentlyNonNull T t) {
        throw new UnsupportedOperationException();
    }

    @RecentlyNonNull
    public <A extends C5850a.AbstractC5852b, T extends AbstractC3487a<? extends AbstractC5876k, A>> T mo21175g(@RecentlyNonNull T t) {
        throw new UnsupportedOperationException();
    }

    public <C extends C5850a.AbstractC5859f> C mo21174h(@RecentlyNonNull C5850a.C5853c<C> cVar) {
        throw new UnsupportedOperationException();
    }

    @RecentlyNonNull
    public Context mo21173i() {
        throw new UnsupportedOperationException();
    }

    @RecentlyNonNull
    public Looper mo21172j() {
        throw new UnsupportedOperationException();
    }

    public abstract void mo21088k(@RecentlyNonNull AbstractC5870c cVar);

    public abstract void mo21087l(@RecentlyNonNull AbstractC5870c cVar);

    public void mo21171m(C6119h2 h2Var) {
        throw new UnsupportedOperationException();
    }
}
