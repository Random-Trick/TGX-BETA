package p6;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import java.util.ArrayList;
import java.util.List;
import t6.a;
import t6.s0;

public final class e1 implements ServiceConnection {
    public ExtractionForegroundService M;
    public Notification N;
    public final a f20586a = new a("ExtractionForegroundServiceConnection");
    public final List f20587b = new ArrayList();
    public final Context f20588c;

    public e1(Context context) {
        this.f20588c = context;
    }

    public final void a(Notification notification) {
        this.N = notification;
    }

    public final void b() {
        this.f20586a.a("Stopping foreground installation service.", new Object[0]);
        this.f20588c.unbindService(this);
        ExtractionForegroundService extractionForegroundService = this.M;
        if (extractionForegroundService != null) {
            extractionForegroundService.a();
        }
        d();
    }

    public final void c(s0 s0Var) {
        synchronized (this.f20587b) {
            this.f20587b.add(s0Var);
        }
    }

    public final void d() {
        ArrayList arrayList;
        synchronized (this.f20587b) {
            arrayList = new ArrayList(this.f20587b);
            this.f20587b.clear();
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((s0) arrayList.get(i10)).y(new Bundle(), new Bundle());
            } catch (RemoteException unused) {
                this.f20586a.b("Could not resolve Play Store service state update callback.", new Object[0]);
            }
        }
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f20586a.a("Starting foreground installation service.", new Object[0]);
        ExtractionForegroundService extractionForegroundService = ((d1) iBinder).f20574a;
        this.M = extractionForegroundService;
        extractionForegroundService.startForeground(-1883842196, this.N);
        d();
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
