package p328x6;

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
import p313w6.C9985a;
import p313w6.EnumC9986b;
import p328x6.AbstractC10109e;
import p328x6.AbstractC10118i;
import p328x6.AbstractC10138q;

public abstract class AbstractC10128o<T extends IInterface> implements AbstractC10138q {
    public final Context f32820a;
    public final Handler f32821b;
    public T f32822c;
    public ArrayList<AbstractC10138q.AbstractC10139a> f32823d;
    public ArrayList<AbstractC10138q.AbstractC10140b> f32826g;
    public ServiceConnection f32829j;
    public final ArrayList<AbstractC10138q.AbstractC10139a> f32824e = new ArrayList<>();
    public boolean f32825f = false;
    public boolean f32827h = false;
    public final ArrayList<AbstractC10131c<?>> f32828i = new ArrayList<>();
    public boolean f32830k = false;

    public static class C10129a {
        public static final int[] f32831a;

        static {
            int[] iArr = new int[EnumC9986b.values().length];
            f32831a = iArr;
            try {
                iArr[EnumC9986b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public final class HandlerC10130b extends Handler {
        public HandlerC10130b() {
        }

        @Override
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 3) {
                AbstractC10128o.this.m5968i((EnumC9986b) message.obj);
            } else if (i == 4) {
                synchronized (AbstractC10128o.this.f32823d) {
                    if (AbstractC10128o.this.f32830k && AbstractC10128o.this.m5958t() && AbstractC10128o.this.f32823d.contains(message.obj)) {
                        ((AbstractC10138q.AbstractC10139a) message.obj).mo5909a();
                    }
                }
            } else if (i != 2 || AbstractC10128o.this.m5958t()) {
                int i2 = message.what;
                if (i2 == 2 || i2 == 1) {
                    ((AbstractC10131c) message.obj).m5953a();
                }
            }
        }
    }

    public abstract class AbstractC10131c<TListener> {
        public TListener f32833a;

        public AbstractC10131c(TListener tlistener) {
            this.f32833a = tlistener;
            synchronized (AbstractC10128o.this.f32828i) {
                AbstractC10128o.this.f32828i.add(this);
            }
        }

        public final void m5953a() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f32833a;
            }
            mo5951b(tlistener);
        }

        public abstract void mo5951b(TListener tlistener);

        public final void m5952c() {
            synchronized (this) {
                this.f32833a = null;
            }
        }
    }

    public final class C10132d extends AbstractC10131c<Boolean> {
        public final EnumC9986b f32835c;
        public final IBinder f32836d;

        public C10132d(String str, IBinder iBinder) {
            super(Boolean.TRUE);
            this.f32835c = AbstractC10128o.m5965m(str);
            this.f32836d = iBinder;
        }

        @Override
        public final void mo5951b(Boolean bool) {
            if (bool == null) {
                return;
            }
            if (C10129a.f32831a[this.f32835c.ordinal()] != 1) {
                AbstractC10128o.this.m5968i(this.f32835c);
                return;
            }
            try {
                if (AbstractC10128o.this.mo5966k().equals(this.f32836d.getInterfaceDescriptor())) {
                    AbstractC10128o oVar = AbstractC10128o.this;
                    oVar.f32822c = oVar.mo5973c(this.f32836d);
                    if (AbstractC10128o.this.f32822c != null) {
                        AbstractC10128o.this.m5957u();
                        return;
                    }
                }
            } catch (RemoteException unused) {
            }
            AbstractC10128o.this.m5969h();
            AbstractC10128o.this.m5968i(EnumC9986b.INTERNAL_ERROR);
        }
    }

    public final class BinderC10133e extends AbstractC10109e.AbstractBinderC10110a {
        public BinderC10133e() {
        }

        @Override
        public final void mo5950V0(String str, IBinder iBinder) {
            AbstractC10128o oVar = AbstractC10128o.this;
            Handler handler = oVar.f32821b;
            handler.sendMessage(handler.obtainMessage(1, new C10132d(str, iBinder)));
        }
    }

    public final class ServiceConnectionC10134f implements ServiceConnection {
        public ServiceConnectionC10134f() {
        }

        @Override
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            AbstractC10128o.this.m5964n(iBinder);
        }

        @Override
        public final void onServiceDisconnected(ComponentName componentName) {
            AbstractC10128o.this.f32822c = null;
            AbstractC10128o.this.m5956v();
        }
    }

    public AbstractC10128o(Context context, AbstractC10138q.AbstractC10139a aVar, AbstractC10138q.AbstractC10140b bVar) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.f32820a = (Context) C10106b.m6017a(context);
            ArrayList<AbstractC10138q.AbstractC10139a> arrayList = new ArrayList<>();
            this.f32823d = arrayList;
            arrayList.add(C10106b.m6017a(aVar));
            ArrayList<AbstractC10138q.AbstractC10140b> arrayList2 = new ArrayList<>();
            this.f32826g = arrayList2;
            arrayList2.add(C10106b.m6017a(bVar));
            this.f32821b = new HandlerC10130b();
            return;
        }
        throw new IllegalStateException("Clients must be created on the UI thread.");
    }

    public static EnumC9986b m5965m(String str) {
        try {
            return EnumC9986b.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return EnumC9986b.UNKNOWN_ERROR;
        } catch (NullPointerException unused2) {
            return EnumC9986b.UNKNOWN_ERROR;
        }
    }

    @Override
    public final void mo5911b() {
        this.f32830k = true;
        EnumC9986b b = C9985a.m6308b(this.f32820a);
        if (b != EnumC9986b.SUCCESS) {
            Handler handler = this.f32821b;
            handler.sendMessage(handler.obtainMessage(3, b));
            return;
        }
        Intent intent = new Intent(mo5962p()).setPackage(C10149w.m5896a(this.f32820a));
        if (this.f32829j != null) {
            Log.e("YouTubeClient", "Calling connect() while still connected, missing disconnect().");
            m5969h();
        }
        ServiceConnectionC10134f fVar = new ServiceConnectionC10134f();
        this.f32829j = fVar;
        if (!this.f32820a.bindService(intent, fVar, 129)) {
            Handler handler2 = this.f32821b;
            handler2.sendMessage(handler2.obtainMessage(3, EnumC9986b.ERROR_CONNECTING_TO_SERVICE));
        }
    }

    public abstract T mo5973c(IBinder iBinder);

    public final void m5969h() {
        ServiceConnection serviceConnection = this.f32829j;
        if (serviceConnection != null) {
            try {
                this.f32820a.unbindService(serviceConnection);
            } catch (IllegalArgumentException e) {
                Log.w("YouTubeClient", "Unexpected error from unbindService()", e);
            }
        }
        this.f32822c = null;
        this.f32829j = null;
    }

    public final void m5968i(EnumC9986b bVar) {
        this.f32821b.removeMessages(4);
        synchronized (this.f32826g) {
            this.f32827h = true;
            ArrayList<AbstractC10138q.AbstractC10140b> arrayList = this.f32826g;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (this.f32830k) {
                    if (this.f32826g.contains(arrayList.get(i))) {
                        arrayList.get(i).mo5907a(bVar);
                    }
                } else {
                    return;
                }
            }
            this.f32827h = false;
        }
    }

    public abstract void mo5967j(AbstractC10118i iVar, BinderC10133e eVar);

    public abstract String mo5966k();

    @Override
    public void mo5910l() {
        m5956v();
        this.f32830k = false;
        synchronized (this.f32828i) {
            int size = this.f32828i.size();
            for (int i = 0; i < size; i++) {
                this.f32828i.get(i).m5952c();
            }
            this.f32828i.clear();
        }
        m5969h();
    }

    public final void m5964n(IBinder iBinder) {
        try {
            mo5967j(AbstractC10118i.AbstractBinderC10119a.m5984q(iBinder), new BinderC10133e());
        } catch (RemoteException unused) {
            Log.w("YouTubeClient", "service died");
        }
    }

    public abstract String mo5962p();

    public final boolean m5958t() {
        return this.f32822c != null;
    }

    public final void m5957u() {
        synchronized (this.f32823d) {
            boolean z = true;
            C10106b.m6014d(!this.f32825f);
            this.f32821b.removeMessages(4);
            this.f32825f = true;
            if (this.f32824e.size() != 0) {
                z = false;
            }
            C10106b.m6014d(z);
            ArrayList<AbstractC10138q.AbstractC10139a> arrayList = this.f32823d;
            int size = arrayList.size();
            for (int i = 0; i < size && this.f32830k && m5958t(); i++) {
                if (!this.f32824e.contains(arrayList.get(i))) {
                    arrayList.get(i).mo5909a();
                }
            }
            this.f32824e.clear();
            this.f32825f = false;
        }
    }

    public final void m5956v() {
        this.f32821b.removeMessages(4);
        synchronized (this.f32823d) {
            this.f32825f = true;
            ArrayList<AbstractC10138q.AbstractC10139a> arrayList = this.f32823d;
            int size = arrayList.size();
            for (int i = 0; i < size && this.f32830k; i++) {
                if (this.f32823d.contains(arrayList.get(i))) {
                    arrayList.get(i).mo5908b();
                }
            }
            this.f32825f = false;
        }
    }

    public final void m5955w() {
        if (!m5958t()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final T m5954x() {
        m5955w();
        return this.f32822c;
    }
}
