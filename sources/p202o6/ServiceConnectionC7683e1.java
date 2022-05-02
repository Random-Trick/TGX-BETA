package p202o6;

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
import p262s6.C8646a;
import p262s6.C8683s0;

public final class ServiceConnectionC7683e1 implements ServiceConnection {
    public ExtractionForegroundService f24613M;
    public Notification f24614N;
    public final C8646a f24615a = new C8646a("ExtractionForegroundServiceConnection");
    public final List f24616b = new ArrayList();
    public final Context f24617c;

    public ServiceConnectionC7683e1(Context context) {
        this.f24617c = context;
    }

    public final void m15265a(Notification notification) {
        this.f24614N = notification;
    }

    public final void m15264b() {
        this.f24615a.m11817a("Stopping foreground installation service.", new Object[0]);
        this.f24617c.unbindService(this);
        ExtractionForegroundService extractionForegroundService = this.f24613M;
        if (extractionForegroundService != null) {
            extractionForegroundService.m30296a();
        }
        m15262d();
    }

    public final void m15263c(C8683s0 s0Var) {
        synchronized (this.f24616b) {
            this.f24616b.add(s0Var);
        }
    }

    public final void m15262d() {
        ArrayList arrayList;
        synchronized (this.f24616b) {
            arrayList = new ArrayList(this.f24616b);
            this.f24616b.clear();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C8683s0) arrayList.get(i)).m11739z(new Bundle(), new Bundle());
            } catch (RemoteException unused) {
                this.f24615a.m11816b("Could not resolve Play Store service state update callback.", new Object[0]);
            }
        }
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f24615a.m11817a("Starting foreground installation service.", new Object[0]);
        ExtractionForegroundService extractionForegroundService = ((BinderC7677d1) iBinder).f24600a;
        this.f24613M = extractionForegroundService;
        extractionForegroundService.startForeground(-1883842196, this.f24614N);
        m15262d();
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
