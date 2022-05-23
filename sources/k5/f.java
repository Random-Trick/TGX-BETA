package k5;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Scope;
import j5.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import k5.a;
import k6.e;
import l5.h2;
import l5.l;
import l5.q0;
import l5.r2;
import l5.z2;
import m5.c0;
import m5.r;

@Deprecated
public abstract class f {
    @GuardedBy("sAllClients")
    public static final Set<f> f15679a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public static final class a {
        public Account f15680a;
        public int f15683d;
        public View f15684e;
        public String f15685f;
        public String f15686g;
        public final Context f15688i;
        public c f15691l;
        public Looper f15692m;
        public final Set<Scope> f15681b = new HashSet();
        public final Set<Scope> f15682c = new HashSet();
        public final Map<k5.a<?>, c0> f15687h = new k0.a();
        public final Map<k5.a<?>, a.d> f15689j = new k0.a();
        public int f15690k = -1;
        public d f15693n = d.p();
        public a.AbstractC0141a<? extends k6.f, k6.a> f15694o = e.f15711c;
        public final ArrayList<b> f15695p = new ArrayList<>();
        public final ArrayList<c> f15696q = new ArrayList<>();

        public a(@RecentlyNonNull Context context) {
            this.f15688i = context;
            this.f15692m = context.getMainLooper();
            this.f15685f = context.getPackageName();
            this.f15686g = context.getClass().getName();
        }

        @RecentlyNonNull
        public a a(@RecentlyNonNull k5.a<Object> aVar) {
            r.l(aVar, "Api must not be null");
            this.f15689j.put(aVar, null);
            List<Scope> a10 = ((a.e) r.l(aVar.a(), "Base client builder must not be null")).a(null);
            this.f15682c.addAll(a10);
            this.f15681b.addAll(a10);
            return this;
        }

        @RecentlyNonNull
        public a b(@RecentlyNonNull c cVar) {
            r.l(cVar, "Listener must not be null");
            this.f15696q.add(cVar);
            return this;
        }

        @RecentlyNonNull
        public f c() {
            r.b(!this.f15689j.isEmpty(), "must call addApi() to add at least one API");
            m5.e d10 = d();
            Map<k5.a<?>, c0> f10 = d10.f();
            k0.a aVar = new k0.a();
            k0.a aVar2 = new k0.a();
            ArrayList arrayList = new ArrayList();
            k5.a<?> aVar3 = null;
            boolean z10 = false;
            for (k5.a<?> aVar4 : this.f15689j.keySet()) {
                a.d dVar = this.f15689j.get(aVar4);
                boolean z11 = f10.get(aVar4) != null;
                aVar.put(aVar4, Boolean.valueOf(z11));
                z2 z2Var = new z2(aVar4, z11);
                arrayList.add(z2Var);
                a.AbstractC0141a aVar5 = (a.AbstractC0141a) r.k(aVar4.b());
                a.f c10 = aVar5.c(this.f15688i, this.f15692m, d10, dVar, z2Var, z2Var);
                aVar2.put(aVar4.c(), c10);
                if (aVar5.b() == 1) {
                    z10 = dVar != null;
                }
                if (c10.b()) {
                    if (aVar3 == null) {
                        aVar3 = aVar4;
                    } else {
                        String d11 = aVar4.d();
                        String d12 = aVar3.d();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(d11).length() + 21 + String.valueOf(d12).length());
                        sb2.append(d11);
                        sb2.append(" cannot be used with ");
                        sb2.append(d12);
                        throw new IllegalStateException(sb2.toString());
                    }
                }
            }
            if (aVar3 != null) {
                if (!z10) {
                    r.o(this.f15680a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar3.d());
                    r.o(this.f15681b.equals(this.f15682c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar3.d());
                } else {
                    String d13 = aVar3.d();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(d13).length() + 82);
                    sb3.append("With using ");
                    sb3.append(d13);
                    sb3.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb3.toString());
                }
            }
            q0 q0Var = new q0(this.f15688i, new ReentrantLock(), this.f15692m, d10, this.f15693n, this.f15694o, aVar, this.f15695p, this.f15696q, aVar2, this.f15690k, q0.s(aVar2.values(), true), arrayList);
            synchronized (f.f15679a) {
                f.f15679a.add(q0Var);
            }
            if (this.f15690k >= 0) {
                r2.k(null).l(this.f15690k, q0Var, this.f15691l);
            }
            return q0Var;
        }

        @RecentlyNonNull
        public m5.e d() {
            k6.a aVar = k6.a.f15699k;
            Map<k5.a<?>, a.d> map = this.f15689j;
            k5.a<k6.a> aVar2 = e.f15715g;
            if (map.containsKey(aVar2)) {
                aVar = (k6.a) this.f15689j.get(aVar2);
            }
            return new m5.e(this.f15680a, this.f15681b, this.f15687h, this.f15683d, this.f15684e, this.f15685f, this.f15686g, aVar, false);
        }
    }

    @Deprecated
    public interface b extends l5.e {
    }

    @Deprecated
    public interface c extends l {
    }

    public abstract void d();

    public abstract void e();

    @RecentlyNonNull
    public <A extends a.b, R extends k, T extends com.google.android.gms.common.api.internal.a<R, A>> T f(@RecentlyNonNull T t10) {
        throw new UnsupportedOperationException();
    }

    @RecentlyNonNull
    public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends k, A>> T g(@RecentlyNonNull T t10) {
        throw new UnsupportedOperationException();
    }

    public <C extends a.f> C h(@RecentlyNonNull a.c<C> cVar) {
        throw new UnsupportedOperationException();
    }

    @RecentlyNonNull
    public Context i() {
        throw new UnsupportedOperationException();
    }

    @RecentlyNonNull
    public Looper j() {
        throw new UnsupportedOperationException();
    }

    public abstract void k(@RecentlyNonNull c cVar);

    public abstract void l(@RecentlyNonNull c cVar);

    public void m(h2 h2Var) {
        throw new UnsupportedOperationException();
    }
}
