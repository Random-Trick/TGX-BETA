package y6;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import y6.j;
import y6.o;
import y6.q;

public final class m extends o<j> implements d {
    public final String f26600l;
    public final String f26601m;
    public final String f26602n;
    public boolean f26603o;

    public m(Context context, String str, String str2, String str3, q.a aVar, q.b bVar) {
        super(context, aVar, bVar);
        this.f26600l = (String) b.a(str);
        this.f26601m = b.c(str2, "callingPackage cannot be null or empty");
        this.f26602n = b.c(str3, "callingAppVersion cannot be null or empty");
    }

    @Override
    public final IBinder a() {
        y();
        try {
            return x().a();
        } catch (RemoteException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override
    public final j c(IBinder iBinder) {
        return j.a.q(iBinder);
    }

    @Override
    public final void d(boolean z10) {
        if (t()) {
            try {
                x().d(z10);
            } catch (RemoteException unused) {
            }
            this.f26603o = true;
        }
    }

    @Override
    public final void j(i iVar, o.e eVar) {
        iVar.G(eVar, 1202, this.f26601m, this.f26602n, this.f26600l, null);
    }

    @Override
    public final String k() {
        return "com.google.android.youtube.player.internal.IYouTubeService";
    }

    @Override
    public final void l() {
        if (!this.f26603o) {
            d(true);
        }
        super.l();
    }

    @Override
    public final String p() {
        return "com.google.android.youtube.api.service.START";
    }

    public final void y() {
        w();
        if (this.f26603o) {
            throw new IllegalStateException("Connection client has been released");
        }
    }
}
