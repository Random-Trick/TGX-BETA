package l5;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import j5.c;
import k5.a;
import k5.a.b;
import l5.i;

public abstract class m<A extends a.b, L> {
    public final i<L> f16151a;
    public final c[] f16152b;
    public final boolean f16153c;
    public final int f16154d;

    public m(@RecentlyNonNull i<L> iVar, c[] cVarArr, boolean z10, int i10) {
        this.f16151a = iVar;
        this.f16152b = cVarArr;
        this.f16153c = z10;
        this.f16154d = i10;
    }

    public void a() {
        this.f16151a.a();
    }

    @RecentlyNullable
    public i.a<L> b() {
        return this.f16151a.b();
    }

    @RecentlyNullable
    public c[] c() {
        return this.f16152b;
    }

    public abstract void d(@RecentlyNonNull A a10, @RecentlyNonNull n6.m<Void> mVar);

    public final boolean e() {
        return this.f16153c;
    }

    public final int f() {
        return this.f16154d;
    }
}
