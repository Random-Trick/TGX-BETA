package o6;

import android.app.PendingIntent;
import android.os.Bundle;
import t6.a;
import w6.p;

public final class t extends r {
    public final String f19252d;
    public final u f19253e;

    public t(u uVar, p pVar, String str) {
        super(uVar, new a("OnRequestInstallCallback"), pVar);
        this.f19253e = uVar;
        this.f19252d = str;
    }

    @Override
    public final void n(Bundle bundle) {
        int i10;
        a i11;
        int i12;
        super.n(bundle);
        i10 = bundle.getInt("error.code", -2);
        if (i10 != 0) {
            p pVar = this.f19250b;
            i12 = bundle.getInt("error.code", -2);
            pVar.d(new com.google.android.play.core.install.a(i12));
            return;
        }
        p pVar2 = this.f19250b;
        i11 = a.i(this.f19252d, bundle.getInt("version.code", -1), bundle.getInt("update.availability"), bundle.getInt("install.status", 0), r22.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness")), bundle.getInt("in.app.update.priority", 0), bundle.getLong("bytes.downloaded"), bundle.getLong("total.bytes.to.download"), bundle.getLong("additional.size.required"), this.f19253e.f19259d.a(), (PendingIntent) bundle.getParcelable("blocking.intent"), (PendingIntent) bundle.getParcelable("nonblocking.intent"), (PendingIntent) bundle.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent"));
        pVar2.e(i11);
    }
}
