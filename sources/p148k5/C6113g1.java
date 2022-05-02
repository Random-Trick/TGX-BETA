package p148k5;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.internal.AbstractC3487a;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p133j5.AbstractC5864e;
import p133j5.AbstractC5876k;
import p133j5.C5850a;
import p133j5.C5850a.AbstractC5854d;

public final class C6113g1<O extends C5850a.AbstractC5854d> extends C6184x {
    @NotOnlyInitialized
    public final AbstractC5864e<O> f19401c;

    public C6113g1(AbstractC5864e<O> eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f19401c = eVar;
    }

    @Override
    public final <A extends C5850a.AbstractC5852b, R extends AbstractC5876k, T extends AbstractC3487a<R, A>> T mo21176f(T t) {
        return (T) this.f19401c.m21925d(t);
    }

    @Override
    public final <A extends C5850a.AbstractC5852b, T extends AbstractC3487a<? extends AbstractC5876k, A>> T mo21175g(T t) {
        return (T) this.f19401c.m21920i(t);
    }

    @Override
    public final Context mo21173i() {
        return this.f19401c.m21918k();
    }

    @Override
    public final Looper mo21172j() {
        return this.f19401c.m21916m();
    }

    @Override
    public final void mo21171m(C6119h2 h2Var) {
    }
}
