package p262s6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public final class C8669l0 extends C8653d0 implements AbstractC8673n0 {
    public C8669l0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    @Override
    public final void mo11771N(String str, Bundle bundle, Bundle bundle2, AbstractC8677p0 p0Var) {
        Parcel q = m11805q();
        q.writeString(str);
        C8657f0.m11802b(q, bundle);
        C8657f0.m11802b(q, bundle2);
        C8657f0.m11801c(q, p0Var);
        m11804s(9, q);
    }

    @Override
    public final void mo11770Y0(String str, Bundle bundle, Bundle bundle2, AbstractC8677p0 p0Var) {
        Parcel q = m11805q();
        q.writeString(str);
        C8657f0.m11802b(q, bundle);
        C8657f0.m11802b(q, bundle2);
        C8657f0.m11801c(q, p0Var);
        m11804s(11, q);
    }

    @Override
    public final void mo11769j1(String str, Bundle bundle, AbstractC8677p0 p0Var) {
        Parcel q = m11805q();
        q.writeString(str);
        C8657f0.m11802b(q, bundle);
        C8657f0.m11801c(q, p0Var);
        m11804s(10, q);
    }

    @Override
    public final void mo11768q1(String str, Bundle bundle, Bundle bundle2, AbstractC8677p0 p0Var) {
        Parcel q = m11805q();
        q.writeString(str);
        C8657f0.m11802b(q, bundle);
        C8657f0.m11802b(q, bundle2);
        C8657f0.m11801c(q, p0Var);
        m11804s(6, q);
    }

    @Override
    public final void mo11767u(String str, Bundle bundle, Bundle bundle2, AbstractC8677p0 p0Var) {
        Parcel q = m11805q();
        q.writeString(str);
        C8657f0.m11802b(q, bundle);
        C8657f0.m11802b(q, bundle2);
        C8657f0.m11801c(q, p0Var);
        m11804s(7, q);
    }

    @Override
    public final void mo11766u1(String str, List list, Bundle bundle, AbstractC8677p0 p0Var) {
        Parcel q = m11805q();
        q.writeString(str);
        q.writeTypedList(list);
        C8657f0.m11802b(q, bundle);
        C8657f0.m11801c(q, p0Var);
        m11804s(14, q);
    }

    @Override
    public final void mo11765y1(String str, Bundle bundle, AbstractC8677p0 p0Var) {
        Parcel q = m11805q();
        q.writeString(str);
        C8657f0.m11802b(q, bundle);
        C8657f0.m11801c(q, p0Var);
        m11804s(5, q);
    }
}
