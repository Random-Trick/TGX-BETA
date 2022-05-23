package l5;

import androidx.annotation.RecentlyNonNull;
import j5.c;
import k5.a;
import k5.a.b;
import l5.i;
import m5.r;
import n6.m;

public class n<A extends a.b, L> {
    @RecentlyNonNull
    public final m<A, L> f16161a;
    @RecentlyNonNull
    public final t<A, L> f16162b;
    @RecentlyNonNull
    public final Runnable f16163c;

    public static class a<A extends a.b, L> {
        public o<A, m<Void>> f16164a;
        public o<A, m<Boolean>> f16165b;
        public i<L> f16167d;
        public c[] f16168e;
        public int f16170g;
        public Runnable f16166c = u1.f16254a;
        public boolean f16169f = true;

        public a(t1 t1Var) {
        }

        @RecentlyNonNull
        public n<A, L> a() {
            boolean z10 = true;
            r.b(this.f16164a != null, "Must set register function");
            r.b(this.f16165b != null, "Must set unregister function");
            if (this.f16167d == null) {
                z10 = false;
            }
            r.b(z10, "Must set holder");
            return new n<>(new v1(this, this.f16167d, this.f16168e, this.f16169f, this.f16170g), new w1(this, (i.a) r.l(this.f16167d.b(), "Key must not be null")), this.f16166c, null);
        }

        @RecentlyNonNull
        public a<A, L> b(@RecentlyNonNull o<A, m<Void>> oVar) {
            this.f16164a = oVar;
            return this;
        }

        @RecentlyNonNull
        public a<A, L> c(int i10) {
            this.f16170g = i10;
            return this;
        }

        @RecentlyNonNull
        public a<A, L> d(@RecentlyNonNull o<A, m<Boolean>> oVar) {
            this.f16165b = oVar;
            return this;
        }

        @RecentlyNonNull
        public a<A, L> e(@RecentlyNonNull i<L> iVar) {
            this.f16167d = iVar;
            return this;
        }
    }

    public n(m mVar, t tVar, Runnable runnable, t1 t1Var) {
        this.f16161a = mVar;
        this.f16162b = tVar;
        this.f16163c = runnable;
    }

    @RecentlyNonNull
    public static <A extends a.b, L> a<A, L> a() {
        return new a<>(null);
    }
}
