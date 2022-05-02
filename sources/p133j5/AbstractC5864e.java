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
        public static final C5865a f18737c = new C5866a().m21909a();
        @RecentlyNonNull
        public final AbstractC6155q f18738a;
        @RecentlyNonNull
        public final Looper f18739b;

        public static class C5866a {
            public AbstractC6155q f18740a;
            public Looper f18741b;

            @RecentlyNonNull
            public C5865a m21909a() {
                if (this.f18740a == null) {
                    this.f18740a = new C6080a();
                }
                if (this.f18741b == null) {
                    this.f18741b = Looper.getMainLooper();
                }
                return new C5865a(this.f18740a, this.f18741b);
            }

            @RecentlyNonNull
            public C5866a m21908b(@RecentlyNonNull AbstractC6155q qVar) {
                C6378r.m20506l(qVar, "StatusExceptionMapper must not be null.");
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
        C6378r.m20506l(context, "Null context is not permitted.");
        C6378r.m20506l(aVar, "Api must not be null.");
        C6378r.m20506l(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        this.f18727a = applicationContext;
        String s = m21910s(context);
        this.f18728b = s;
        this.f18729c = aVar;
        this.f18730d = o;
        this.f18732f = aVar2.f18739b;
        this.f18731e = C6085b.m21388a(aVar, o, s);
        this.f18734h = new C6113g1(this);
        C6106f m = C6106f.m21297m(applicationContext);
        this.f18736j = m;
        this.f18733g = m.m21296n();
        this.f18735i = aVar2.f18738a;
        m.m21295o(this);
    }

    public static String m21910s(Object obj) {
        if (!C8251k.m13029i()) {
            return null;
        }
        try {
            return (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @RecentlyNonNull
    public C6336e.C6337a m21927b() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount a;
        C6336e.C6337a aVar = new C6336e.C6337a();
        O o = this.f18730d;
        if (!(o instanceof C5850a.AbstractC5854d.AbstractC5856b) || (a = ((C5850a.AbstractC5854d.AbstractC5856b) o).m21933a()) == null) {
            O o2 = this.f18730d;
            account = o2 instanceof C5850a.AbstractC5854d.AbstractC5855a ? ((C5850a.AbstractC5854d.AbstractC5855a) o2).m21934b() : null;
        } else {
            account = a.m30416b();
        }
        aVar.m20597c(account);
        O o3 = this.f18730d;
        if (o3 instanceof C5850a.AbstractC5854d.AbstractC5856b) {
            GoogleSignInAccount a2 = ((C5850a.AbstractC5854d.AbstractC5856b) o3).m21933a();
            if (a2 == null) {
                set = Collections.emptySet();
            } else {
                set = a2.m30408j();
            }
        } else {
            set = Collections.emptySet();
        }
        aVar.m20596d(set);
        aVar.m20595e(this.f18727a.getClass().getName());
        aVar.m20598b(this.f18727a.getPackageName());
        return aVar;
    }

    @RecentlyNonNull
    public <TResult, A extends C5850a.AbstractC5852b> AbstractC6775l<TResult> m21926c(@RecentlyNonNull AbstractC6159r<A, TResult> rVar) {
        return m21911r(2, rVar);
    }

    @RecentlyNonNull
    public <A extends C5850a.AbstractC5852b, T extends AbstractC3487a<? extends AbstractC5876k, A>> T m21925d(@RecentlyNonNull T t) {
        m21912q(0, t);
        return t;
    }

    @RecentlyNonNull
    public <TResult, A extends C5850a.AbstractC5852b> AbstractC6775l<TResult> m21924e(@RecentlyNonNull AbstractC6159r<A, TResult> rVar) {
        return m21911r(0, rVar);
    }

    @RecentlyNonNull
    public <A extends C5850a.AbstractC5852b> AbstractC6775l<Void> m21923f(@RecentlyNonNull C6142n<A, ?> nVar) {
        C6378r.m20507k(nVar);
        C6378r.m20506l(nVar.f19474a.m21203b(), "Listener has already been released.");
        C6378r.m20506l(nVar.f19475b.m21131a(), "Listener has already been released.");
        return this.f18736j.m21289u(this, nVar.f19474a, nVar.f19475b, nVar.f19476c);
    }

    @RecentlyNonNull
    public AbstractC6775l<Boolean> m21922g(@RecentlyNonNull C6120i.C6121a<?> aVar) {
        return m21921h(aVar, 0);
    }

    @RecentlyNonNull
    public AbstractC6775l<Boolean> m21921h(@RecentlyNonNull C6120i.C6121a<?> aVar, int i) {
        C6378r.m20506l(aVar, "Listener key cannot be null.");
        return this.f18736j.m21288v(this, aVar, i);
    }

    @RecentlyNonNull
    public <A extends C5850a.AbstractC5852b, T extends AbstractC3487a<? extends AbstractC5876k, A>> T m21920i(@RecentlyNonNull T t) {
        m21912q(1, t);
        return t;
    }

    @RecentlyNonNull
    public final C6085b<O> m21919j() {
        return this.f18731e;
    }

    @RecentlyNonNull
    public Context m21918k() {
        return this.f18727a;
    }

    @RecentlyNullable
    public String m21917l() {
        return this.f18728b;
    }

    @RecentlyNonNull
    public Looper m21916m() {
        return this.f18732f;
    }

    public final C5850a.AbstractC5859f m21915n(Looper looper, C6093c1<O> c1Var) {
        C5850a.AbstractC5859f c = ((C5850a.AbstractC5851a) C6378r.m20507k(this.f18729c.m21937b())).mo21894c(this.f18727a, looper, m21927b().m20599a(), this.f18730d, c1Var, c1Var);
        String l = m21917l();
        if (l != null && (c instanceof AbstractC6325c)) {
            ((AbstractC6325c) c).m20657S(l);
        }
        if (l != null && (c instanceof ServiceConnectionC6130k)) {
            ((ServiceConnectionC6130k) c).m21237v(l);
        }
        return c;
    }

    public final int m21914o() {
        return this.f18733g;
    }

    public final BinderC6088b2 m21913p(Context context, Handler handler) {
        return new BinderC6088b2(context, handler, m21927b().m20599a());
    }

    public final <A extends C5850a.AbstractC5852b, T extends AbstractC3487a<? extends AbstractC5876k, A>> T m21912q(int i, T t) {
        t.m30384m();
        this.f18736j.m21292r(this, i, t);
        return t;
    }

    public final <TResult, A extends C5850a.AbstractC5852b> AbstractC6775l<TResult> m21911r(int i, AbstractC6159r<A, TResult> rVar) {
        C6777m mVar = new C6777m();
        this.f18736j.m21291s(this, i, rVar, mVar, this.f18735i);
        return mVar.m19087a();
    }

    @java.lang.Deprecated
    public AbstractC5864e(@androidx.annotation.RecentlyNonNull android.content.Context r2, @androidx.annotation.RecentlyNonNull p133j5.C5850a<O> r3, @androidx.annotation.RecentlyNonNull O r4, @androidx.annotation.RecentlyNonNull p148k5.AbstractC6155q r5) {
        throw new UnsupportedOperationException("Method not decompiled: p133j5.AbstractC5864e.<init>(android.content.Context, j5.a, j5.a$d, k5.q):void");
    }
}
