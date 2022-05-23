package i5;

import android.os.Bundle;
import android.util.Log;
import n6.m;

public abstract class u<T> {
    public final int f14032a;
    public final m<T> f14033b = new m<>();
    public final int f14034c;
    public final Bundle f14035d;

    public u(int i10, int i11, Bundle bundle) {
        this.f14032a = i10;
        this.f14034c = i11;
        this.f14035d = bundle;
    }

    public abstract void a(Bundle bundle);

    public final void b(t tVar) {
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
        this.f14033b.b(tVar);
    }

    public final void c(T t10) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb2.append("Finishing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f14033b.c(t10);
    }

    public abstract boolean d();

    public String toString() {
        int i10 = this.f14034c;
        int i11 = this.f14032a;
        boolean d10 = d();
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(i10);
        sb2.append(" id=");
        sb2.append(i11);
        sb2.append(" oneWay=");
        sb2.append(d10);
        sb2.append("}");
        return sb2.toString();
    }
}
