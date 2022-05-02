package p148k5;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import p118i5.C5219c;
import p133j5.C5850a;
import p133j5.C5850a.AbstractC5852b;
import p163l5.C6378r;
import p177m6.C6777m;

public abstract class AbstractC6159r<A extends C5850a.AbstractC5852b, ResultT> {
    public final C5219c[] f19527a;
    public final boolean f19528b;
    public final int f19529c;

    public static class C6160a<A extends C5850a.AbstractC5852b, ResultT> {
        public AbstractC6147o<A, C6777m<ResultT>> f19530a;
        public C5219c[] f19532c;
        public boolean f19531b = true;
        public int f19533d = 0;

        public C6160a(C6094c2 c2Var) {
        }

        @RecentlyNonNull
        public AbstractC6159r<A, ResultT> m21154a() {
            C6378r.m20515b(this.f19530a != null, "execute parameter required");
            return new C6099d2(this, this.f19532c, this.f19531b, this.f19533d);
        }

        @RecentlyNonNull
        public C6160a<A, ResultT> m21153b(@RecentlyNonNull AbstractC6147o<A, C6777m<ResultT>> oVar) {
            this.f19530a = oVar;
            return this;
        }

        @RecentlyNonNull
        public C6160a<A, ResultT> m21152c(boolean z) {
            this.f19531b = z;
            return this;
        }

        @RecentlyNonNull
        public C6160a<A, ResultT> m21151d(@RecentlyNonNull C5219c... cVarArr) {
            this.f19532c = cVarArr;
            return this;
        }

        @RecentlyNonNull
        public C6160a<A, ResultT> m21150e(int i) {
            this.f19533d = i;
            return this;
        }
    }

    public AbstractC6159r(C5219c[] cVarArr, boolean z, int i) {
        this.f19527a = cVarArr;
        boolean z2 = false;
        if (cVarArr != null && z) {
            z2 = true;
        }
        this.f19528b = z2;
        this.f19529c = i;
    }

    @RecentlyNonNull
    public static <A extends C5850a.AbstractC5852b, ResultT> C6160a<A, ResultT> m21159a() {
        return new C6160a<>(null);
    }

    public abstract void mo21158b(@RecentlyNonNull A a, @RecentlyNonNull C6777m<ResultT> mVar);

    public boolean m21157c() {
        return this.f19528b;
    }

    @RecentlyNullable
    public final C5219c[] m21156d() {
        return this.f19527a;
    }

    public final int m21155e() {
        return this.f19529c;
    }
}
