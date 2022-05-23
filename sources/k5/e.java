package k5;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import k5.a;
import k5.a.d;
import l5.b;
import l5.b2;
import l5.c1;
import l5.f;
import l5.g1;
import l5.i;
import l5.n;
import l5.q;
import m5.c;
import m5.e;
import m5.r;
import n6.l;
import n6.m;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import r5.k;

public abstract class e<O extends a.d> {
    public final Context f15664a;
    public final String f15665b;
    public final k5.a<O> f15666c;
    public final O f15667d;
    public final b<O> f15668e;
    public final Looper f15669f;
    public final int f15670g;
    @NotOnlyInitialized
    public final f f15671h;
    public final q f15672i;
    @RecentlyNonNull
    public final f f15673j;

    public static class a {
        @RecentlyNonNull
        public static final a f15674c = new C0143a().a();
        @RecentlyNonNull
        public final q f15675a;
        @RecentlyNonNull
        public final Looper f15676b;

        public static class C0143a {
            public q f15677a;
            public Looper f15678b;

            @RecentlyNonNull
            public a a() {
                if (this.f15677a == null) {
                    this.f15677a = new l5.a();
                }
                if (this.f15678b == null) {
                    this.f15678b = Looper.getMainLooper();
                }
                return new a(this.f15677a, this.f15678b);
            }

            @RecentlyNonNull
            public C0143a b(@RecentlyNonNull q qVar) {
                r.l(qVar, "StatusExceptionMapper must not be null.");
                this.f15677a = qVar;
                return this;
            }
        }

        public a(q qVar, Account account, Looper looper) {
            this.f15675a = qVar;
            this.f15676b = looper;
        }
    }

    public e(@RecentlyNonNull Context context, @RecentlyNonNull k5.a<O> aVar, @RecentlyNonNull O o10, @RecentlyNonNull a aVar2) {
        r.l(context, "Null context is not permitted.");
        r.l(aVar, "Api must not be null.");
        r.l(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        this.f15664a = applicationContext;
        String s10 = s(context);
        this.f15665b = s10;
        this.f15666c = aVar;
        this.f15667d = o10;
        this.f15669f = aVar2.f15676b;
        this.f15668e = b.a(aVar, o10, s10);
        this.f15671h = new g1(this);
        f m10 = f.m(applicationContext);
        this.f15673j = m10;
        this.f15670g = m10.n();
        this.f15672i = aVar2.f15675a;
        m10.o(this);
    }

    public static String s(Object obj) {
        if (!k.i()) {
            return null;
        }
        try {
            return (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @RecentlyNonNull
    public e.a b() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount a10;
        e.a aVar = new e.a();
        O o10 = this.f15667d;
        if (!(o10 instanceof a.d.b) || (a10 = ((a.d.b) o10).a()) == null) {
            O o11 = this.f15667d;
            account = o11 instanceof a.d.AbstractC0142a ? ((a.d.AbstractC0142a) o11).b() : null;
        } else {
            account = a10.b();
        }
        aVar.c(account);
        O o12 = this.f15667d;
        if (o12 instanceof a.d.b) {
            GoogleSignInAccount a11 = ((a.d.b) o12).a();
            if (a11 == null) {
                set = Collections.emptySet();
            } else {
                set = a11.j();
            }
        } else {
            set = Collections.emptySet();
        }
        aVar.d(set);
        aVar.e(this.f15664a.getClass().getName());
        aVar.b(this.f15664a.getPackageName());
        return aVar;
    }

    @RecentlyNonNull
    public <TResult, A extends a.b> l<TResult> c(@RecentlyNonNull l5.r<A, TResult> rVar) {
        return r(2, rVar);
    }

    @RecentlyNonNull
    public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends k, A>> T d(@RecentlyNonNull T t10) {
        q(0, t10);
        return t10;
    }

    @RecentlyNonNull
    public <TResult, A extends a.b> l<TResult> e(@RecentlyNonNull l5.r<A, TResult> rVar) {
        return r(0, rVar);
    }

    @RecentlyNonNull
    public <A extends a.b> l<Void> f(@RecentlyNonNull n<A, ?> nVar) {
        r.k(nVar);
        r.l(nVar.f16161a.b(), "Listener has already been released.");
        r.l(nVar.f16162b.a(), "Listener has already been released.");
        return this.f15673j.u(this, nVar.f16161a, nVar.f16162b, nVar.f16163c);
    }

    @RecentlyNonNull
    public l<Boolean> g(@RecentlyNonNull i.a<?> aVar) {
        return h(aVar, 0);
    }

    @RecentlyNonNull
    public l<Boolean> h(@RecentlyNonNull i.a<?> aVar, int i10) {
        r.l(aVar, "Listener key cannot be null.");
        return this.f15673j.v(this, aVar, i10);
    }

    @RecentlyNonNull
    public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends k, A>> T i(@RecentlyNonNull T t10) {
        q(1, t10);
        return t10;
    }

    @RecentlyNonNull
    public final b<O> j() {
        return this.f15668e;
    }

    @RecentlyNonNull
    public Context k() {
        return this.f15664a;
    }

    @RecentlyNullable
    public String l() {
        return this.f15665b;
    }

    @RecentlyNonNull
    public Looper m() {
        return this.f15669f;
    }

    public final a.f n(Looper looper, c1<O> c1Var) {
        a.f c10 = ((a.AbstractC0141a) r.k(this.f15666c.b())).c(this.f15664a, looper, b().a(), this.f15667d, c1Var, c1Var);
        String l10 = l();
        if (l10 != null && (c10 instanceof c)) {
            ((c) c10).S(l10);
        }
        if (l10 != null && (c10 instanceof l5.k)) {
            ((l5.k) c10).v(l10);
        }
        return c10;
    }

    public final int o() {
        return this.f15670g;
    }

    public final b2 p(Context context, Handler handler) {
        return new b2(context, handler, b().a());
    }

    public final <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends k, A>> T q(int i10, T t10) {
        t10.m();
        this.f15673j.r(this, i10, t10);
        return t10;
    }

    public final <TResult, A extends a.b> l<TResult> r(int i10, l5.r<A, TResult> rVar) {
        m mVar = new m();
        this.f15673j.s(this, i10, rVar, mVar, this.f15672i);
        return mVar.a();
    }

    @java.lang.Deprecated
    public e(@androidx.annotation.RecentlyNonNull android.content.Context r2, @androidx.annotation.RecentlyNonNull k5.a<O> r3, @androidx.annotation.RecentlyNonNull O r4, @androidx.annotation.RecentlyNonNull l5.q r5) {
        throw new UnsupportedOperationException("Method not decompiled: k5.e.<init>(android.content.Context, k5.a, k5.a$d, l5.q):void");
    }
}
