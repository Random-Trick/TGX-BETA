package p148k5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import p118i5.C5217a;
import p118i5.C5219c;
import p133j5.C5850a;
import p163l5.AbstractC6325c;
import p163l5.AbstractC6349i;
import p163l5.AbstractC6355k;
import p163l5.C6378r;

public final class ServiceConnectionC6130k implements C5850a.AbstractC5859f, ServiceConnection {
    public static final String f19427U = ServiceConnectionC6130k.class.getSimpleName();
    public final Context f19428M;
    public final AbstractC6101e f19429N;
    public final Handler f19430O;
    public final AbstractC6134l f19431P;
    public IBinder f19432Q;
    public boolean f19433R;
    public String f19434S;
    public String f19435T;
    public final String f19436a;
    public final String f19437b;
    public final ComponentName f19438c;

    @Override
    public final boolean mo21251a() {
        m21249c();
        return this.f19432Q != null;
    }

    @Override
    public final boolean mo21250b() {
        return false;
    }

    public final void m21249c() {
        if (Thread.currentThread() != this.f19430O.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    @Override
    public final Set<Scope> mo20583d() {
        return Collections.emptySet();
    }

    @Override
    public final void mo21248e(@RecentlyNonNull String str) {
        m21249c();
        this.f19434S = str;
        mo905j();
    }

    @Override
    public final boolean mo21247g() {
        m21249c();
        return this.f19433R;
    }

    @Override
    @RecentlyNonNull
    public final String mo21246h() {
        String str = this.f19436a;
        if (str != null) {
            return str;
        }
        C6378r.m20507k(this.f19438c);
        return this.f19438c.getPackageName();
    }

    @Override
    public final void mo21245i(@RecentlyNonNull AbstractC6325c.AbstractC6328c cVar) {
        m21249c();
        m21234y("Connect started.");
        if (mo21251a()) {
            try {
                mo21248e("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f19438c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f19436a).setAction(this.f19437b);
            }
            boolean bindService = this.f19428M.bindService(intent, this, AbstractC6349i.m20577a());
            this.f19433R = bindService;
            if (!bindService) {
                this.f19432Q = null;
                this.f19431P.mo11483s(new C5217a(16));
            }
            m21234y("Finished connect.");
        } catch (SecurityException e) {
            this.f19433R = false;
            this.f19432Q = null;
            throw e;
        }
    }

    @Override
    public final void mo905j() {
        m21249c();
        m21234y("Disconnect called.");
        try {
            this.f19428M.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f19433R = false;
        this.f19432Q = null;
    }

    @Override
    public final void mo21244m(@RecentlyNonNull String str, FileDescriptor fileDescriptor, @RecentlyNonNull PrintWriter printWriter, String[] strArr) {
    }

    @Override
    public final void mo21243n(AbstractC6355k kVar, Set<Scope> set) {
    }

    @Override
    public final boolean mo21242o() {
        return false;
    }

    @Override
    public final void onServiceConnected(@RecentlyNonNull ComponentName componentName, @RecentlyNonNull final IBinder iBinder) {
        this.f19430O.post(new Runnable(this, iBinder) {
            public final ServiceConnectionC6130k f19493a;
            public final IBinder f19494b;

            {
                this.f19493a = this;
                this.f19494b = iBinder;
            }

            @Override
            public final void run() {
                this.f19493a.m21235x(this.f19494b);
            }
        });
    }

    @Override
    public final void onServiceDisconnected(@RecentlyNonNull ComponentName componentName) {
        this.f19430O.post(new Runnable(this) {
            public final ServiceConnectionC6130k f19522a;

            {
                this.f19522a = this;
            }

            @Override
            public final void run() {
                this.f19522a.m21236w();
            }
        });
    }

    @Override
    public final int mo939p() {
        return 0;
    }

    @Override
    @RecentlyNonNull
    public final C5219c[] mo21241q() {
        return new C5219c[0];
    }

    @Override
    @RecentlyNullable
    public final String mo21240r() {
        return this.f19434S;
    }

    @Override
    @RecentlyNonNull
    public final Intent mo21239s() {
        return new Intent();
    }

    @Override
    public final boolean mo20627t() {
        return false;
    }

    @Override
    public final void mo21238u(@RecentlyNonNull AbstractC6325c.AbstractC6330e eVar) {
    }

    public final void m21237v(String str) {
        this.f19435T = str;
    }

    public final void m21236w() {
        this.f19433R = false;
        this.f19432Q = null;
        m21234y("Disconnected.");
        this.f19429N.mo21081q(1);
    }

    public final void m21235x(IBinder iBinder) {
        this.f19433R = false;
        this.f19432Q = iBinder;
        m21234y("Connected.");
        this.f19429N.mo21080t(new Bundle());
    }

    public final void m21234y(String str) {
        String.valueOf(this.f19432Q);
        str.length();
    }
}
