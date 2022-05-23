package l5;

import android.content.Context;
import android.os.Looper;
import k5.a;
import k5.a.d;
import k5.e;
import k5.k;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public final class g1<O extends a.d> extends x {
    @NotOnlyInitialized
    public final e<O> f16098c;

    public g1(e<O> eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f16098c = eVar;
    }

    @Override
    public final <A extends a.b, R extends k, T extends com.google.android.gms.common.api.internal.a<R, A>> T f(T t10) {
        return (T) this.f16098c.d(t10);
    }

    @Override
    public final <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends k, A>> T g(T t10) {
        return (T) this.f16098c.i(t10);
    }

    @Override
    public final Context i() {
        return this.f16098c.k();
    }

    @Override
    public final Looper j() {
        return this.f16098c.m();
    }

    @Override
    public final void m(h2 h2Var) {
    }
}
