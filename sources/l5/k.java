package l5;

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
import k5.a;
import m5.c;
import m5.i;
import m5.r;

public final class k implements a.f, ServiceConnection {
    public static final String U = k.class.getSimpleName();
    public final Context M;
    public final e N;
    public final Handler O;
    public final l P;
    public IBinder Q;
    public boolean R;
    public String S;
    public String T;
    public final String f16123a;
    public final String f16124b;
    public final ComponentName f16125c;

    @Override
    public final boolean a() {
        c();
        return this.Q != null;
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final void c() {
        if (Thread.currentThread() != this.O.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    @Override
    public final Set<Scope> d() {
        return Collections.emptySet();
    }

    @Override
    public final void f(@RecentlyNonNull String str) {
        c();
        this.S = str;
        k();
    }

    @Override
    public final void g(m5.k kVar, Set<Scope> set) {
    }

    @Override
    public final boolean h() {
        c();
        return this.R;
    }

    @Override
    @RecentlyNonNull
    public final String i() {
        String str = this.f16123a;
        if (str != null) {
            return str;
        }
        r.k(this.f16125c);
        return this.f16125c.getPackageName();
    }

    @Override
    public final void k() {
        c();
        y("Disconnect called.");
        try {
            this.M.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.R = false;
        this.Q = null;
    }

    @Override
    public final void m(@RecentlyNonNull String str, FileDescriptor fileDescriptor, @RecentlyNonNull PrintWriter printWriter, String[] strArr) {
    }

    @Override
    public final boolean n() {
        return false;
    }

    @Override
    public final void o(@RecentlyNonNull c.e eVar) {
    }

    @Override
    public final void onServiceConnected(@RecentlyNonNull ComponentName componentName, @RecentlyNonNull final IBinder iBinder) {
        this.O.post(new Runnable(this, iBinder) {
            public final k f16180a;
            public final IBinder f16181b;

            {
                this.f16180a = this;
                this.f16181b = iBinder;
            }

            @Override
            public final void run() {
                this.f16180a.x(this.f16181b);
            }
        });
    }

    @Override
    public final void onServiceDisconnected(@RecentlyNonNull ComponentName componentName) {
        this.O.post(new Runnable(this) {
            public final k f16209a;

            {
                this.f16209a = this;
            }

            @Override
            public final void run() {
                this.f16209a.w();
            }
        });
    }

    @Override
    public final int p() {
        return 0;
    }

    @Override
    @RecentlyNonNull
    public final j5.c[] q() {
        return new j5.c[0];
    }

    @Override
    public final void r(@RecentlyNonNull c.AbstractC0154c cVar) {
        c();
        y("Connect started.");
        if (a()) {
            try {
                f("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f16125c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f16123a).setAction(this.f16124b);
            }
            boolean bindService = this.M.bindService(intent, this, i.a());
            this.R = bindService;
            if (!bindService) {
                this.Q = null;
                this.P.r(new j5.a(16));
            }
            y("Finished connect.");
        } catch (SecurityException e10) {
            this.R = false;
            this.Q = null;
            throw e10;
        }
    }

    @Override
    @RecentlyNullable
    public final String s() {
        return this.S;
    }

    @Override
    @RecentlyNonNull
    public final Intent t() {
        return new Intent();
    }

    @Override
    public final boolean u() {
        return false;
    }

    public final void v(String str) {
        this.T = str;
    }

    public final void w() {
        this.R = false;
        this.Q = null;
        y("Disconnected.");
        this.N.q(1);
    }

    public final void x(IBinder iBinder) {
        this.R = false;
        this.Q = iBinder;
        y("Connected.");
        this.N.t(new Bundle());
    }

    public final void y(String str) {
        String.valueOf(this.Q);
        str.length();
    }
}
