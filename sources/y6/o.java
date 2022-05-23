package y6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import y6.e;
import y6.i;
import y6.q;

public abstract class o<T extends IInterface> implements q {
    public final Context f26604a;
    public final Handler f26605b;
    public T f26606c;
    public ArrayList<q.a> f26607d;
    public ArrayList<q.b> f26610g;
    public ServiceConnection f26613j;
    public final ArrayList<q.a> f26608e = new ArrayList<>();
    public boolean f26609f = false;
    public boolean f26611h = false;
    public final ArrayList<c<?>> f26612i = new ArrayList<>();
    public boolean f26614k = false;

    public static class a {
        public static final int[] f26615a;

        static {
            int[] iArr = new int[x6.b.values().length];
            f26615a = iArr;
            try {
                iArr[x6.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public final class b extends Handler {
        public b() {
        }

        @Override
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 3) {
                o.this.i((x6.b) message.obj);
            } else if (i10 == 4) {
                synchronized (o.this.f26607d) {
                    if (o.this.f26614k && o.this.t() && o.this.f26607d.contains(message.obj)) {
                        ((q.a) message.obj).a();
                    }
                }
            } else if (i10 != 2 || o.this.t()) {
                int i11 = message.what;
                if (i11 == 2 || i11 == 1) {
                    ((c) message.obj).a();
                }
            }
        }
    }

    public abstract class c<TListener> {
        public TListener f26617a;

        public c(TListener tlistener) {
            this.f26617a = tlistener;
            synchronized (o.this.f26612i) {
                o.this.f26612i.add(this);
            }
        }

        public final void a() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f26617a;
            }
            b(tlistener);
        }

        public abstract void b(TListener tlistener);

        public final void c() {
            synchronized (this) {
                this.f26617a = null;
            }
        }
    }

    public final class d extends c<Boolean> {
        public final x6.b f26619c;
        public final IBinder f26620d;

        public d(String str, IBinder iBinder) {
            super(Boolean.TRUE);
            this.f26619c = o.m(str);
            this.f26620d = iBinder;
        }

        @Override
        public final void b(Boolean bool) {
            if (bool == null) {
                return;
            }
            if (a.f26615a[this.f26619c.ordinal()] != 1) {
                o.this.i(this.f26619c);
                return;
            }
            try {
                if (o.this.k().equals(this.f26620d.getInterfaceDescriptor())) {
                    o oVar = o.this;
                    oVar.f26606c = oVar.c(this.f26620d);
                    if (o.this.f26606c != null) {
                        o.this.u();
                        return;
                    }
                }
            } catch (RemoteException unused) {
            }
            o.this.h();
            o.this.i(x6.b.INTERNAL_ERROR);
        }
    }

    public final class e extends e.a {
        public e() {
        }

        @Override
        public final void U0(String str, IBinder iBinder) {
            o oVar = o.this;
            Handler handler = oVar.f26605b;
            handler.sendMessage(handler.obtainMessage(1, new d(str, iBinder)));
        }
    }

    public final class f implements ServiceConnection {
        public f() {
        }

        @Override
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            o.this.n(iBinder);
        }

        @Override
        public final void onServiceDisconnected(ComponentName componentName) {
            o.this.f26606c = null;
            o.this.v();
        }
    }

    public o(Context context, q.a aVar, q.b bVar) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.f26604a = (Context) y6.b.a(context);
            ArrayList<q.a> arrayList = new ArrayList<>();
            this.f26607d = arrayList;
            arrayList.add(y6.b.a(aVar));
            ArrayList<q.b> arrayList2 = new ArrayList<>();
            this.f26610g = arrayList2;
            arrayList2.add(y6.b.a(bVar));
            this.f26605b = new b();
            return;
        }
        throw new IllegalStateException("Clients must be created on the UI thread.");
    }

    public static x6.b m(String str) {
        try {
            return x6.b.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return x6.b.UNKNOWN_ERROR;
        } catch (NullPointerException unused2) {
            return x6.b.UNKNOWN_ERROR;
        }
    }

    @Override
    public final void b() {
        this.f26614k = true;
        x6.b b10 = x6.a.b(this.f26604a);
        if (b10 != x6.b.SUCCESS) {
            Handler handler = this.f26605b;
            handler.sendMessage(handler.obtainMessage(3, b10));
            return;
        }
        Intent intent = new Intent(p()).setPackage(w.a(this.f26604a));
        if (this.f26613j != null) {
            Log.e("YouTubeClient", "Calling connect() while still connected, missing disconnect().");
            h();
        }
        f fVar = new f();
        this.f26613j = fVar;
        if (!this.f26604a.bindService(intent, fVar, 129)) {
            Handler handler2 = this.f26605b;
            handler2.sendMessage(handler2.obtainMessage(3, x6.b.ERROR_CONNECTING_TO_SERVICE));
        }
    }

    public abstract T c(IBinder iBinder);

    public final void h() {
        ServiceConnection serviceConnection = this.f26613j;
        if (serviceConnection != null) {
            try {
                this.f26604a.unbindService(serviceConnection);
            } catch (IllegalArgumentException e10) {
                Log.w("YouTubeClient", "Unexpected error from unbindService()", e10);
            }
        }
        this.f26606c = null;
        this.f26613j = null;
    }

    public final void i(x6.b bVar) {
        this.f26605b.removeMessages(4);
        synchronized (this.f26610g) {
            this.f26611h = true;
            ArrayList<q.b> arrayList = this.f26610g;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f26614k) {
                    if (this.f26610g.contains(arrayList.get(i10))) {
                        arrayList.get(i10).a(bVar);
                    }
                } else {
                    return;
                }
            }
            this.f26611h = false;
        }
    }

    public abstract void j(i iVar, e eVar);

    public abstract String k();

    @Override
    public void l() {
        v();
        this.f26614k = false;
        synchronized (this.f26612i) {
            int size = this.f26612i.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f26612i.get(i10).c();
            }
            this.f26612i.clear();
        }
        h();
    }

    public final void n(IBinder iBinder) {
        try {
            j(i.a.q(iBinder), new e());
        } catch (RemoteException unused) {
            Log.w("YouTubeClient", "service died");
        }
    }

    public abstract String p();

    public final boolean t() {
        return this.f26606c != null;
    }

    public final void u() {
        synchronized (this.f26607d) {
            boolean z10 = true;
            y6.b.d(!this.f26609f);
            this.f26605b.removeMessages(4);
            this.f26609f = true;
            if (this.f26608e.size() != 0) {
                z10 = false;
            }
            y6.b.d(z10);
            ArrayList<q.a> arrayList = this.f26607d;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size && this.f26614k && t(); i10++) {
                if (!this.f26608e.contains(arrayList.get(i10))) {
                    arrayList.get(i10).a();
                }
            }
            this.f26608e.clear();
            this.f26609f = false;
        }
    }

    public final void v() {
        this.f26605b.removeMessages(4);
        synchronized (this.f26607d) {
            this.f26609f = true;
            ArrayList<q.a> arrayList = this.f26607d;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size && this.f26614k; i10++) {
                if (this.f26607d.contains(arrayList.get(i10))) {
                    arrayList.get(i10).b();
                }
            }
            this.f26609f = false;
        }
    }

    public final void w() {
        if (!t()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final T x() {
        w();
        return this.f26606c;
    }
}
