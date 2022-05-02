package p163l5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import p118i5.C5217a;
import p163l5.AbstractC6325c;

public final class C6342f1 extends AbstractC6391v0 {
    public final IBinder f19932g;
    public final AbstractC6325c f19933h;

    public C6342f1(AbstractC6325c cVar, int i, IBinder iBinder, Bundle bundle) {
        super(cVar, i, bundle);
        this.f19933h = cVar;
        this.f19932g = iBinder;
    }

    @Override
    public final boolean mo20480f() {
        AbstractC6325c.AbstractC6326a aVar;
        AbstractC6325c.AbstractC6326a aVar2;
        try {
            IBinder iBinder = this.f19932g;
            C6378r.m20507k(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f19933h.mo942H().equals(interfaceDescriptor)) {
                String H = this.f19933h.mo942H();
                StringBuilder sb2 = new StringBuilder(String.valueOf(H).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb2.append("service descriptor mismatch: ");
                sb2.append(H);
                sb2.append(" vs. ");
                sb2.append(interfaceDescriptor);
                Log.e("GmsClient", sb2.toString());
                return false;
            }
            IInterface w = this.f19933h.mo938w(this.f19932g);
            if (w == null || (!AbstractC6325c.m20640g0(this.f19933h, 2, 4, w) && !AbstractC6325c.m20640g0(this.f19933h, 3, 4, w))) {
                return false;
            }
            this.f19933h.f19889i0 = null;
            Bundle A = this.f19933h.m20670A();
            aVar = this.f19933h.f19884d0;
            if (aVar == null) {
                return true;
            }
            aVar2 = this.f19933h.f19884d0;
            aVar2.mo20578t(A);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override
    public final void mo20479g(C5217a aVar) {
        if (this.f19933h.f19885e0 != null) {
            this.f19933h.f19885e0.mo20574s(aVar);
        }
        this.f19933h.m20661O(aVar);
    }
}
