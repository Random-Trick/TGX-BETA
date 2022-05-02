package p102h5;

import android.os.Bundle;
import android.util.Log;
import p177m6.C6777m;

public abstract class AbstractC4981u<T> {
    public final int f16921a;
    public final C6777m<T> f16922b = new C6777m<>();
    public final int f16923c;
    public final Bundle f16924d;

    public AbstractC4981u(int i, int i2, Bundle bundle) {
        this.f16921a = i;
        this.f16923c = i2;
        this.f16924d = bundle;
    }

    public abstract void mo24341a(Bundle bundle);

    public final void m24346b(C4980t tVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(tVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb2.append("Failing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f16922b.m19085b(tVar);
    }

    public final void m24345c(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb2.append("Finishing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f16922b.m19084c(t);
    }

    public abstract boolean mo24340d();

    public String toString() {
        int i = this.f16923c;
        int i2 = this.f16921a;
        boolean d = mo24340d();
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(i);
        sb2.append(" id=");
        sb2.append(i2);
        sb2.append(" oneWay=");
        sb2.append(d);
        sb2.append("}");
        return sb2.toString();
    }
}
