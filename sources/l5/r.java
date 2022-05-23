package l5;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import j5.c;
import k5.a;
import k5.a.b;
import n6.m;

public abstract class r<A extends a.b, ResultT> {
    public final c[] f16214a;
    public final boolean f16215b;
    public final int f16216c;

    public static class a<A extends a.b, ResultT> {
        public o<A, m<ResultT>> f16217a;
        public c[] f16219c;
        public boolean f16218b = true;
        public int f16220d = 0;

        public a(c2 c2Var) {
        }

        @RecentlyNonNull
        public r<A, ResultT> a() {
            m5.r.b(this.f16217a != null, "execute parameter required");
            return new d2(this, this.f16219c, this.f16218b, this.f16220d);
        }

        @RecentlyNonNull
        public a<A, ResultT> b(@RecentlyNonNull o<A, m<ResultT>> oVar) {
            this.f16217a = oVar;
            return this;
        }

        @RecentlyNonNull
        public a<A, ResultT> c(boolean z10) {
            this.f16218b = z10;
            return this;
        }

        @RecentlyNonNull
        public a<A, ResultT> d(@RecentlyNonNull c... cVarArr) {
            this.f16219c = cVarArr;
            return this;
        }

        @RecentlyNonNull
        public a<A, ResultT> e(int i10) {
            this.f16220d = i10;
            return this;
        }
    }

    public r(c[] cVarArr, boolean z10, int i10) {
        this.f16214a = cVarArr;
        boolean z11 = false;
        if (cVarArr != null && z10) {
            z11 = true;
        }
        this.f16215b = z11;
        this.f16216c = i10;
    }

    @RecentlyNonNull
    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>(null);
    }

    public abstract void b(@RecentlyNonNull A a10, @RecentlyNonNull m<ResultT> mVar);

    public boolean c() {
        return this.f16215b;
    }

    @RecentlyNullable
    public final c[] d() {
        return this.f16214a;
    }

    public final int e() {
        return this.f16216c;
    }
}
