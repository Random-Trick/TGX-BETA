package p148k5;

import androidx.annotation.RecentlyNonNull;
import p118i5.C5219c;
import p133j5.C5850a;
import p133j5.C5850a.AbstractC5852b;
import p148k5.C6120i;
import p163l5.C6378r;
import p177m6.C6777m;

public class C6142n<A extends C5850a.AbstractC5852b, L> {
    @RecentlyNonNull
    public final AbstractC6138m<A, L> f19474a;
    @RecentlyNonNull
    public final AbstractC6168t<A, L> f19475b;
    @RecentlyNonNull
    public final Runnable f19476c;

    public static class C6143a<A extends C5850a.AbstractC5852b, L> {
        public AbstractC6147o<A, C6777m<Void>> f19477a;
        public AbstractC6147o<A, C6777m<Boolean>> f19478b;
        public C6120i<L> f19480d;
        public C5219c[] f19481e;
        public int f19483g;
        public Runnable f19479c = RunnableC6174u1.f19568a;
        public boolean f19482f = true;

        public C6143a(C6170t1 t1Var) {
        }

        @RecentlyNonNull
        public C6142n<A, L> m21196a() {
            boolean z = true;
            C6378r.m20516b(this.f19477a != null, "Must set register function");
            C6378r.m20516b(this.f19478b != null, "Must set unregister function");
            if (this.f19480d == null) {
                z = false;
            }
            C6378r.m20516b(z, "Must set holder");
            return new C6142n<>(new C6178v1(this, this.f19480d, this.f19481e, this.f19482f, this.f19483g), new C6182w1(this, (C6120i.C6121a) C6378r.m20506l(this.f19480d.m21261b(), "Key must not be null")), this.f19479c, null);
        }

        @RecentlyNonNull
        public C6143a<A, L> m21195b(@RecentlyNonNull AbstractC6147o<A, C6777m<Void>> oVar) {
            this.f19477a = oVar;
            return this;
        }

        @RecentlyNonNull
        public C6143a<A, L> m21194c(int i) {
            this.f19483g = i;
            return this;
        }

        @RecentlyNonNull
        public C6143a<A, L> m21193d(@RecentlyNonNull AbstractC6147o<A, C6777m<Boolean>> oVar) {
            this.f19478b = oVar;
            return this;
        }

        @RecentlyNonNull
        public C6143a<A, L> m21192e(@RecentlyNonNull C6120i<L> iVar) {
            this.f19480d = iVar;
            return this;
        }
    }

    public C6142n(AbstractC6138m mVar, AbstractC6168t tVar, Runnable runnable, C6170t1 t1Var) {
        this.f19474a = mVar;
        this.f19475b = tVar;
        this.f19476c = runnable;
    }

    @RecentlyNonNull
    public static <A extends C5850a.AbstractC5852b, L> C6143a<A, L> m21197a() {
        return new C6143a<>(null);
    }
}
