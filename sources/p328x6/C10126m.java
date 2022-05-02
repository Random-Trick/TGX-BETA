package p328x6;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import p328x6.AbstractC10121j;
import p328x6.AbstractC10128o;
import p328x6.AbstractC10138q;

public final class C10126m extends AbstractC10128o<AbstractC10121j> implements AbstractC10108d {
    public final String f32816l;
    public final String f32817m;
    public final String f32818n;
    public boolean f32819o;

    public C10126m(Context context, String str, String str2, String str3, AbstractC10138q.AbstractC10139a aVar, AbstractC10138q.AbstractC10140b bVar) {
        super(context, aVar, bVar);
        this.f32816l = (String) C10106b.m6017a(str);
        this.f32817m = C10106b.m6015c(str2, "callingPackage cannot be null or empty");
        this.f32818n = C10106b.m6015c(str3, "callingAppVersion cannot be null or empty");
    }

    @Override
    public final IBinder mo5976a() {
        m5974y();
        try {
            return m5954x().mo5981a();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public final AbstractC10121j mo5973c(IBinder iBinder) {
        return AbstractC10121j.AbstractBinderC10122a.m5982q(iBinder);
    }

    @Override
    public final void mo5975d(boolean z) {
        if (m5958t()) {
            try {
                m5954x().mo5980d(z);
            } catch (RemoteException unused) {
            }
            this.f32819o = true;
        }
    }

    @Override
    public final void mo5967j(AbstractC10118i iVar, AbstractC10128o.BinderC10133e eVar) {
        iVar.mo5983y(eVar, 1202, this.f32817m, this.f32818n, this.f32816l, null);
    }

    @Override
    public final String mo5966k() {
        return "com.google.android.youtube.player.internal.IYouTubeService";
    }

    @Override
    public final void mo5910l() {
        if (!this.f32819o) {
            mo5975d(true);
        }
        super.mo5910l();
    }

    @Override
    public final String mo5962p() {
        return "com.google.android.youtube.api.service.START";
    }

    public final void m5974y() {
        m5955w();
        if (this.f32819o) {
            throw new IllegalStateException("Connection client has been released");
        }
    }
}
