package p189n6;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.play.core.install.C3505a;
import p262s6.C8646a;
import p300v6.C9865p;

public final class BinderC7272t extends BinderC7270r {
    public final String f23117d;
    public final C7273u f23118e;

    public BinderC7272t(C7273u uVar, C9865p pVar, String str) {
        super(uVar, new C8646a("OnRequestInstallCallback"), pVar);
        this.f23118e = uVar;
        this.f23117d = str;
    }

    @Override
    public final void mo11794n(Bundle bundle) {
        int i;
        C7248a i2;
        int i3;
        super.mo11794n(bundle);
        i = bundle.getInt("error.code", -2);
        if (i != 0) {
            C9865p pVar = this.f23115b;
            i3 = bundle.getInt("error.code", -2);
            pVar.m6732d(new C3505a(i3));
            return;
        }
        C9865p pVar2 = this.f23115b;
        i2 = C7248a.m17199i(this.f23117d, bundle.getInt("version.code", -1), bundle.getInt("update.availability"), bundle.getInt("install.status", 0), r22.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness")), bundle.getInt("in.app.update.priority", 0), bundle.getLong("bytes.downloaded"), bundle.getLong("total.bytes.to.download"), bundle.getLong("additional.size.required"), this.f23118e.f23124d.m17168a(), (PendingIntent) bundle.getParcelable("blocking.intent"), (PendingIntent) bundle.getParcelable("nonblocking.intent"), (PendingIntent) bundle.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent"));
        pVar2.m6731e(i2);
    }
}
