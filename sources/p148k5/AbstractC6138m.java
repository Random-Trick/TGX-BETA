package p148k5;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import p118i5.C5219c;
import p133j5.C5850a;
import p133j5.C5850a.AbstractC5852b;
import p148k5.C6120i;
import p177m6.C6777m;

public abstract class AbstractC6138m<A extends C5850a.AbstractC5852b, L> {
    public final C6120i<L> f19464a;
    public final C5219c[] f19465b;
    public final boolean f19466c;
    public final int f19467d;

    public AbstractC6138m(@RecentlyNonNull C6120i<L> iVar, C5219c[] cVarArr, boolean z, int i) {
        this.f19464a = iVar;
        this.f19465b = cVarArr;
        this.f19466c = z;
        this.f19467d = i;
    }

    public void m21204a() {
        this.f19464a.m21262a();
    }

    @RecentlyNullable
    public C6120i.C6121a<L> m21203b() {
        return this.f19464a.m21261b();
    }

    @RecentlyNullable
    public C5219c[] m21202c() {
        return this.f19465b;
    }

    public abstract void mo21103d(@RecentlyNonNull A a, @RecentlyNonNull C6777m<Void> mVar);

    public final boolean m21201e() {
        return this.f19466c;
    }

    public final int m21200f() {
        return this.f19467d;
    }
}
