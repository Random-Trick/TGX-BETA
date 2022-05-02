package p133j5;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.AbstractC3487a;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p133j5.C5850a;
import p133j5.C5850a.AbstractC5854d;
import p148k5.AbstractC6155q;
import p148k5.AbstractC6159r;
import p148k5.BinderC6088b2;
import p148k5.C6080a;
import p148k5.C6085b;
import p148k5.C6093c1;
import p148k5.C6106f;
import p148k5.C6113g1;
import p148k5.C6120i;
import p148k5.C6142n;
import p148k5.ServiceConnectionC6130k;
import p163l5.AbstractC6325c;
import p163l5.C6336e;
import p163l5.C6378r;
import p177m6.AbstractC6775l;
import p177m6.C6777m;
import p232q5.C8251k;

public abstract class AbstractC5864e<O extends C5850a.AbstractC5854d> {
    public final Context f18727a;
    public final String f18728b;
    public final C5850a<O> f18729c;
    public final O f18730d;
    public final C6085b<O> f18731e;
    public final Looper f18732f;
    public final int f18733g;
    @NotOnlyInitialized
    public final AbstractC5867f f18734h;
    public final AbstractC6155q f18735i;
    @RecentlyNonNull
    public final C6106f f18736j;

    public static class C5865a {
        @RecentlyNonNull
        public static final C5865a f18737c = new C5866a().m21908a();
        @RecentlyNonNull
        public final AbstractC6155q f18738a;
        @RecentlyNonNull
        public final Looper f18739b;

        public static class C5866a {
            public AbstractC6155q f18740a;
            public Looper f18741b;

            @RecentlyNonNull
            public C5865a m21908a() {
                if (this.f18740a == null) {
                    this.f18740a = new C6080a();
                }
                if (this.f18741b == null) {
                    this.f18741b = Looper.getMainLooper();
                }
                return new C5865a(this.f18740a, this.f18741b);
            }

            @RecentlyNonNull
            public C5866a m21907b(@RecentlyNonNull AbstractC6155q qVar) {
                C6378r.m20505l(qVar, "StatusExceptionMapper must not be null.");
                this.f18740a = qVar;
                return this;
            }
        }

        public C5865a(AbstractC6155q qVar, Account account, Looper looper) {
            this.f18738a = qVar;
            this.f18739b = looper;
        }
    }

    public AbstractC5864e(@RecentlyNonNull Context context, @RecentlyNonNull C5850a<O> aVar, @RecentlyNonNull O o, @RecentlyNonNull C5865a aVar2) {
        C6378r.m20505l(context, "Null context is not permitted.");
        C6378r.m20505l(aVar, "Api must not be null.");
        C6378r.m20505l(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        this.f18727a = applicationContext;
        String s = m21909s(context);
        this.f18728b = s;
        this.f18729c = aVar;
        this.f18730d = o;
        this.f18732f = aVar2.f18739b;
        this.f18731e = C6085b.m21387a(aVar, o, s);
        this.f18734h = new C6113g1(this);
        C6106f m = C6106f.m21296m(applicationContext);
        this.f18736j = m;
        this.f18733g = m.m21295n();
        this.f18735i = aVar2.f18738a;
        m.m21294o(this);
    }

    public static String m21909s(Object obj) {
        if (!C8251k.m13030i()) {
            return null;
        }
        try {
            return (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @RecentlyNonNull
    public C6336e.C6337a m21926b() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount a;
        C6336e.C6337a aVar = new C6336e.C6337a();
        O o = this.f18730d;
        if (!(o instanceof C5850a.AbstractC5854d.AbstractC5856b) || (a = ((C5850a.AbstractC5854d.AbstractC5856b) o).m21932a()) == null) {
            O o2 = this.f18730d;
            account = o2 instanceof C5850a.AbstractC5854d.AbstractC5855a ? ((C5850a.AbstractC5854d.AbstractC5855a) o2).m21933b() : null;
        } else {
            account = a.m30414b();
        }
        aVar.m20596c(account);
        O o3 = this.f18730d;
        if (o3 instanceof C5850a.AbstractC5854d.AbstractC5856b) {
            GoogleSignInAccount a2 = ((C5850a.AbstractC5854d.AbstractC5856b) o3).m21932a();
            if (a2 == null) {
                set = Collections.emptySet();
            } else {
                set = a2.m30406j();
            }
        } else {
            set = Collections.emptySet();
        }
        aVar.m20595d(set);
        aVar.m20594e(this.f18727a.getClass().getName());
        aVar.m20597b(this.f18727a.getPackageName());
        return aVar;
    }

    @RecentlyNonNull
    public <TResult, A extends C5850a.AbstractC5852b> AbstractC6775l<TResult> m21925c(@RecentlyNonNull AbstractC6159r<A, TResult> rVar) {
        return m21910r(2, rVar);
    }

    @RecentlyNonNull
    public <A extends C5850a.AbstractC5852b, T extends AbstractC3487a<? extends AbstractC5876k, A>> T m21924d(@RecentlyNonNull T t) {
        m21911q(0, t);
        return t;
    }

    @RecentlyNonNull
    public <TResult, A extends C5850a.AbstractC5852b> AbstractC6775l<TResult> m21923e(@RecentlyNonNull AbstractC6159r<A, TResult> rVar) {
        return m21910r(0, rVar);
    }

    @RecentlyNonNull
    public <A extends C5850a.AbstractC5852b> AbstractC6775l<Void> m21922f(@RecentlyNonNull C6142n<A, ?> nVar) {
        C6378r.m20506k(nVar);
        C6378r.m20505l(nVar.f19474a.m21202b(), "Listener has already been released.");
        C6378r.m20505l(nVar.f19475b.m21130a(), "Listener has already been released.");
        return this.f18736j.m21288u(this, nVar.f19474a, nVar.f19475b, nVar.f19476c);
    }

    @RecentlyNonNull
    public AbstractC6775l<Boolean> m21921g(@RecentlyNonNull C6120i.C6121a<?> aVar) {
        return m21920h(aVar, 0);
    }

    @RecentlyNonNull
    public AbstractC6775l<Boolean> m21920h(@RecentlyNonNull C6120i.C6121a<?> aVar, int i) {
        C6378r.m20505l(aVar, "Listener key cannot be null.");
        return this.f18736j.m21287v(this, aVar, i);
    }

    @RecentlyNonNull
    public <A extends C5850a.AbstractC5852b, T extends AbstractC3487a<? extends AbstractC5876k, A>> T m21919i(@RecentlyNonNull T t) {
        m21911q(1, t);
        return t;
    }

    @RecentlyNonNull
    public final C6085b<O> m21918j() {
        return this.f18731e;
    }

    @RecentlyNonNull
    public Context m21917k() {
        return this.f18727a;
    }

    @RecentlyNullable
    public String m21916l() {
        return this.f18728b;
    }

    @RecentlyNonNull
    public Looper m21915m() {
        return this.f18732f;
    }

    public final C5850a.AbstractC5859f m21914n(Looper looper, C6093c1<O> c1Var) {
        C5850a.AbstractC5859f c = ((C5850a.AbstractC5851a) C6378r.m20506k(this.f18729c.m21936b())).mo21893c(this.f18727a, looper, m21926b().m20598a(), this.f18730d, c1Var, c1Var);
        String l = m21916l();
        if (l != null && (c instanceof AbstractC6325c)) {
            ((AbstractC6325c) c).m20656S(l);
        }
        if (l != null && (c instanceof ServiceConnectionC6130k)) {
            ((ServiceConnectionC6130k) c).m21236v(l);
        }
        return c;
    }

    public final int m21913o() {
        return this.f18733g;
    }

    public final BinderC6088b2 m21912p(Context context, Handler handler) {
        return new BinderC6088b2(context, handler, m21926b().m20598a());
    }

    public final <A extends C5850a.AbstractC5852b, T extends AbstractC3487a<? extends AbstractC5876k, A>> T m21911q(int i, T t) {
        t.m30382m();
        this.f18736j.m21291r(this, i, t);
        return t;
    }

    public final <TResult, A extends C5850a.AbstractC5852b> AbstractC6775l<TResult> m21910r(int i, AbstractC6159r<A, TResult> rVar) {
        C6777m mVar = new C6777m();
        this.f18736j.m21290s(this, i, rVar, mVar, this.f18735i);
        return mVar.m19086a();
    }

    @java.lang.Deprecated
    public AbstractC5864e(@androidx.annotation.RecentlyNonNull android.content.Context r2, @androidx.annotation.RecentlyNonNull p133j5.C5850a<O> r3, @androidx.annotation.RecentlyNonNull O r4, @androidx.annotation.RecentlyNonNull p148k5.AbstractC6155q r5) {
        throw new UnsupportedOperationException("Method not decompiled: p133j5.AbstractC5864e.<init>(android.content.Context, j5.a, j5.a$d, k5.q):void");
    }
}
