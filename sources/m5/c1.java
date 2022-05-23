package m5;

import android.util.Log;
import java.util.ArrayList;

public abstract class c1<TListener> {
    public TListener f17166a;
    public boolean f17167b = false;
    public final c f17168c;

    public c1(c cVar, TListener tlistener) {
        this.f17168c = cVar;
        this.f17166a = tlistener;
    }

    public abstract void a();

    public abstract void b(TListener tlistener);

    public final void c() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.f17166a;
            if (this.f17167b) {
                String valueOf = String.valueOf(this);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 47);
                sb2.append("Callback proxy ");
                sb2.append(valueOf);
                sb2.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb2.toString());
            }
        }
        if (tlistener != null) {
            try {
                b(tlistener);
            } catch (RuntimeException e10) {
                throw e10;
            }
        }
        synchronized (this) {
            this.f17167b = true;
        }
        d();
    }

    public final void d() {
        ArrayList arrayList;
        ArrayList arrayList2;
        e();
        arrayList = this.f17168c.f17150a0;
        synchronized (arrayList) {
            arrayList2 = this.f17168c.f17150a0;
            arrayList2.remove(this);
        }
    }

    public final void e() {
        synchronized (this) {
            this.f17166a = null;
        }
    }
}
