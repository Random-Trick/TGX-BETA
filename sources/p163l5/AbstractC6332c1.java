package p163l5;

import android.util.Log;
import java.util.ArrayList;

public abstract class AbstractC6332c1<TListener> {
    public TListener f19895a;
    public boolean f19896b = false;
    public final AbstractC6325c f19897c;

    public AbstractC6332c1(AbstractC6325c cVar, TListener tlistener) {
        this.f19897c = cVar;
        this.f19895a = tlistener;
    }

    public abstract void mo20481a();

    public abstract void mo20480b(TListener tlistener);

    public final void m20620c() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.f19895a;
            if (this.f19896b) {
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
                mo20480b(tlistener);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.f19896b = true;
        }
        m20619d();
    }

    public final void m20619d() {
        ArrayList arrayList;
        ArrayList arrayList2;
        m20618e();
        arrayList = this.f19897c.f19879a0;
        synchronized (arrayList) {
            arrayList2 = this.f19897c.f19879a0;
            arrayList2.remove(this);
        }
    }

    public final void m20618e() {
        synchronized (this) {
            this.f19895a = null;
        }
    }
}
