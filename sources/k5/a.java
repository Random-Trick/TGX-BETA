package k5;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import k5.a.d;
import k5.f;
import l5.l;
import m5.c;
import m5.k;
import m5.r;

public final class a<O extends d> {
    public final AbstractC0141a<?, O> f15658a;
    public final g<?> f15659b;
    public final String f15660c;

    public static abstract class AbstractC0141a<T extends f, O> extends e<T, O> {
        @RecentlyNonNull
        @Deprecated
        public T c(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull m5.e eVar, @RecentlyNonNull O o10, @RecentlyNonNull f.b bVar, @RecentlyNonNull f.c cVar) {
            return d(context, looper, eVar, o10, bVar, cVar);
        }

        @RecentlyNonNull
        public T d(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull m5.e eVar, @RecentlyNonNull O o10, @RecentlyNonNull l5.e eVar2, @RecentlyNonNull l lVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {
        @RecentlyNonNull
        public static final c f15661a = new c(null);

        public interface AbstractC0142a extends d {
            @RecentlyNonNull
            Account b();
        }

        public interface b extends d {
            @RecentlyNullable
            GoogleSignInAccount a();
        }

        public static final class c implements d {
            public c() {
            }

            public c(q qVar) {
            }
        }
    }

    public static abstract class e<T extends b, O> {
        @RecentlyNonNull
        public List<Scope> a(O o10) {
            return Collections.emptyList();
        }

        public int b() {
            return Integer.MAX_VALUE;
        }
    }

    public interface f extends b {
        boolean a();

        boolean b();

        Set<Scope> d();

        void f(@RecentlyNonNull String str);

        void g(k kVar, Set<Scope> set);

        boolean h();

        @RecentlyNonNull
        String i();

        void k();

        void m(@RecentlyNonNull String str, FileDescriptor fileDescriptor, @RecentlyNonNull PrintWriter printWriter, String[] strArr);

        boolean n();

        void o(@RecentlyNonNull c.e eVar);

        int p();

        @RecentlyNonNull
        j5.c[] q();

        void r(@RecentlyNonNull c.AbstractC0154c cVar);

        @RecentlyNullable
        String s();

        @RecentlyNonNull
        Intent t();

        boolean u();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> a(@RecentlyNonNull String str, @RecentlyNonNull AbstractC0141a<C, O> aVar, @RecentlyNonNull g<C> gVar) {
        r.l(aVar, "Cannot construct an Api with a null ClientBuilder");
        r.l(gVar, "Cannot construct an Api with a null ClientKey");
        this.f15660c = str;
        this.f15658a = aVar;
        this.f15659b = gVar;
    }

    @RecentlyNonNull
    public final e<?, O> a() {
        return this.f15658a;
    }

    @RecentlyNonNull
    public final AbstractC0141a<?, O> b() {
        return this.f15658a;
    }

    @RecentlyNonNull
    public final c<?> c() {
        return this.f15659b;
    }

    @RecentlyNonNull
    public final String d() {
        return this.f15660c;
    }
}
