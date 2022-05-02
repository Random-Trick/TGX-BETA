package p163l5;

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
import p133j5.C5850a;
import p134j6.C5886a;
import p143k0.C6031b;

public final class C6336e {
    @Nullable
    public final Account f19904a;
    public final Set<Scope> f19905b;
    public final Set<Scope> f19906c;
    public final Map<C5850a<?>, C6331c0> f19907d;
    public final int f19908e;
    @Nullable
    public final View f19909f;
    public final String f19910g;
    public final String f19911h;
    public final C5886a f19912i;
    public Integer f19913j;

    public static final class C6337a {
        @Nullable
        public Account f19914a;
        public C6031b<Scope> f19915b;
        public String f19916c;
        public String f19917d;
        public C5886a f19918e = C5886a.f18763k;

        @RecentlyNonNull
        public C6336e m20599a() {
            return new C6336e(this.f19914a, this.f19915b, null, 0, null, this.f19916c, this.f19917d, this.f19918e, false);
        }

        @RecentlyNonNull
        public C6337a m20598b(@RecentlyNonNull String str) {
            this.f19916c = str;
            return this;
        }

        @RecentlyNonNull
        public final C6337a m20597c(@Nullable Account account) {
            this.f19914a = account;
            return this;
        }

        @RecentlyNonNull
        public final C6337a m20596d(@RecentlyNonNull Collection<Scope> collection) {
            if (this.f19915b == null) {
                this.f19915b = new C6031b<>();
            }
            this.f19915b.addAll(collection);
            return this;
        }

        @RecentlyNonNull
        public final C6337a m20595e(@RecentlyNonNull String str) {
            this.f19917d = str;
            return this;
        }
    }

    public C6336e(@Nullable Account account, @RecentlyNonNull Set<Scope> set, @RecentlyNonNull Map<C5850a<?>, C6331c0> map, int i, @Nullable View view, @RecentlyNonNull String str, @RecentlyNonNull String str2, @Nullable C5886a aVar, boolean z) {
        this.f19904a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f19905b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f19907d = map;
        this.f19909f = view;
        this.f19908e = i;
        this.f19910g = str;
        this.f19911h = str2;
        this.f19912i = aVar == null ? C5886a.f18763k : aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (C6331c0 c0Var : map.values()) {
            hashSet.addAll(c0Var.f19894a);
        }
        this.f19906c = Collections.unmodifiableSet(hashSet);
    }

    @RecentlyNullable
    public Account m20609a() {
        return this.f19904a;
    }

    @RecentlyNonNull
    public Account m20608b() {
        Account account = this.f19904a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    @RecentlyNonNull
    public Set<Scope> m20607c() {
        return this.f19906c;
    }

    @RecentlyNonNull
    public String m20606d() {
        return this.f19910g;
    }

    @RecentlyNonNull
    public Set<Scope> m20605e() {
        return this.f19905b;
    }

    @RecentlyNonNull
    public final Map<C5850a<?>, C6331c0> m20604f() {
        return this.f19907d;
    }

    @RecentlyNullable
    public final String m20603g() {
        return this.f19911h;
    }

    @RecentlyNonNull
    public final C5886a m20602h() {
        return this.f19912i;
    }

    @RecentlyNullable
    public final Integer m20601i() {
        return this.f19913j;
    }

    public final void m20600j(@RecentlyNonNull Integer num) {
        this.f19913j = num;
    }
}
