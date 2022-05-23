package m5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import j5.a;
import m5.c;

public final class f1 extends v0 {
    public final IBinder f17200g;
    public final c f17201h;

    public f1(c cVar, int i10, IBinder iBinder, Bundle bundle) {
        super(cVar, i10, bundle);
        this.f17201h = cVar;
        this.f17200g = iBinder;
    }

    @Override
    public final boolean f() {
        c.a aVar;
        c.a aVar2;
        try {
            IBinder iBinder = this.f17200g;
            r.k(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f17201h.H().equals(interfaceDescriptor)) {
                String H = this.f17201h.H();
                StringBuilder sb2 = new StringBuilder(String.valueOf(H).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb2.append("service descriptor mismatch: ");
                sb2.append(H);
                sb2.append(" vs. ");
                sb2.append(interfaceDescriptor);
                Log.e("GmsClient", sb2.toString());
                return false;
            }
            IInterface w10 = this.f17201h.w(this.f17200g);
            if (w10 == null || (!c.g0(this.f17201h, 2, 4, w10) && !c.g0(this.f17201h, 3, 4, w10))) {
                return false;
            }
            this.f17201h.f17160i0 = null;
            Bundle A = this.f17201h.A();
            aVar = this.f17201h.f17155d0;
            if (aVar == null) {
                return true;
            }
            aVar2 = this.f17201h.f17155d0;
            aVar2.t(A);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override
    public final void g(a aVar) {
        if (this.f17201h.f17156e0 != null) {
            this.f17201h.f17156e0.r(aVar);
        }
        this.f17201h.O(aVar);
    }
}
