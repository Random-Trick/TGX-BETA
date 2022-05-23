package m5;

import android.accounts.Account;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import k0.b;

public final class e {
    @Nullable
    public final Account f17175a;
    public final Set<Scope> f17176b;
    public final Set<Scope> f17177c;
    public final Map<k5.a<?>, c0> f17178d;
    public final int f17179e;
    @Nullable
    public final View f17180f;
    public final String f17181g;
    public final String f17182h;
    public final k6.a f17183i;
    public Integer f17184j;

    public static final class a {
        @Nullable
        public Account f17185a;
        public b<Scope> f17186b;
        public String f17187c;
        public String f17188d;
        public k6.a f17189e = k6.a.f15699k;

        @RecentlyNonNull
        public e a() {
            return new e(this.f17185a, this.f17186b, null, 0, null, this.f17187c, this.f17188d, this.f17189e, false);
        }

        @RecentlyNonNull
        public a b(@RecentlyNonNull String str) {
            this.f17187c = str;
            return this;
        }

        @RecentlyNonNull
        public final a c(@Nullable Account account) {
            this.f17185a = account;
            return this;
        }

        @RecentlyNonNull
        public final a d(@RecentlyNonNull Collection<Scope> collection) {
            if (this.f17186b == null) {
                this.f17186b = new b<>();
            }
            this.f17186b.addAll(collection);
            return this;
        }

        @RecentlyNonNull
        public final a e(@RecentlyNonNull String str) {
            this.f17188d = str;
            return this;
        }
    }

    public e(@Nullable Account account, @RecentlyNonNull Set<Scope> set, @RecentlyNonNull Map<k5.a<?>, c0> map, int i10, @Nullable View view, @RecentlyNonNull String str, @RecentlyNonNull String str2, @Nullable k6.a aVar, boolean z10) {
        this.f17175a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f17176b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f17178d = map;
        this.f17180f = view;
        this.f17179e = i10;
        this.f17181g = str;
        this.f17182h = str2;
        this.f17183i = aVar == null ? k6.a.f15699k : aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (c0 c0Var : map.values()) {
            hashSet.addAll(c0Var.f17165a);
        }
        this.f17177c = Collections.unmodifiableSet(hashSet);
    }

    @RecentlyNullable
    public Account a() {
        return this.f17175a;
    }

    @RecentlyNonNull
    public Account b() {
        Account account = this.f17175a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    @RecentlyNonNull
    public Set<Scope> c() {
        return this.f17177c;
    }

    @RecentlyNonNull
    public String d() {
        return this.f17181g;
    }

    @RecentlyNonNull
    public Set<Scope> e() {
        return this.f17176b;
    }

    @RecentlyNonNull
    public final Map<k5.a<?>, c0> f() {
        return this.f17178d;
    }

    @RecentlyNullable
    public final String g() {
        return this.f17182h;
    }

    @RecentlyNonNull
    public final k6.a h() {
        return this.f17183i;
    }

    @RecentlyNullable
    public final Integer i() {
        return this.f17184j;
    }

    public final void j(@RecentlyNonNull Integer num) {
        this.f17184j = num;
    }
}
