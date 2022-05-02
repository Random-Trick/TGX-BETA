package p225pd;

import java.util.ArrayList;
import java.util.Iterator;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import p156kd.C6246h;
import p156kd.C6253l;
import p194nd.AbstractC7515z;
import p350yd.C10930q6;

public class C8113c {
    public final AbstractView$OnTouchListenerC7889a f26390a;
    public final C10930q6 f26391b;
    public int f26392c = -1;
    public ArrayList<C8112b> f26393d;
    public int f26394e;
    public int f26395f;
    public AbstractC7515z f26396g;

    public C8113c(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var) {
        this.f26390a = aVar;
        this.f26391b = q6Var;
    }

    public void m13467a() {
        this.f26392c++;
        m13449s(false);
    }

    public void m13466b() {
        this.f26392c--;
        m13449s(false);
    }

    public C8112b m13465c() {
        ArrayList<C8112b> arrayList = this.f26393d;
        if (arrayList != null) {
            return arrayList.get(0);
        }
        return null;
    }

    public void m13464d(int i) {
        if (this.f26392c != i) {
            this.f26392c = i;
            m13449s(false);
        }
    }

    public C8112b m13463e(int i) {
        if (i < 0 || i >= this.f26393d.size()) {
            return null;
        }
        return this.f26393d.get(i);
    }

    public ArrayList<C8112b> m13462f() {
        return this.f26393d;
    }

    public C8112b m13461g() {
        int i;
        ArrayList<C8112b> arrayList = this.f26393d;
        if (arrayList == null || (i = this.f26392c) == -1) {
            return null;
        }
        return arrayList.get(i);
    }

    public int m13460h() {
        return this.f26392c;
    }

    public int m13459i() {
        ArrayList<C8112b> arrayList = this.f26393d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public int m13458j() {
        return this.f26392c + this.f26394e;
    }

    public int m13457k() {
        return m13459i() + this.f26394e + this.f26395f;
    }

    public C8112b m13456l() {
        if (m13454n()) {
            return this.f26393d.get(this.f26392c + 1);
        }
        return null;
    }

    public C8112b m13455m() {
        if (m13453o()) {
            return this.f26393d.get(this.f26392c - 1);
        }
        return null;
    }

    public boolean m13454n() {
        return this.f26392c < m13459i() - 1;
    }

    public boolean m13453o() {
        return this.f26392c > 0;
    }

    public int m13452p(C6246h hVar) {
        Iterator<C8112b> it = this.f26393d.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().m13550K() == hVar) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void m13451q(ArrayList<C8112b> arrayList, boolean z) {
        if (z) {
            this.f26393d.addAll(0, arrayList);
            this.f26392c += arrayList.size();
            int size = this.f26394e - arrayList.size();
            this.f26394e = size;
            if (size < 0) {
                this.f26394e = 0;
            }
        } else {
            this.f26393d.addAll(arrayList);
            int size2 = this.f26395f - arrayList.size();
            this.f26395f = size2;
            if (size2 < 0) {
                this.f26395f = 0;
            }
        }
        m13449s(true);
    }

    public C8112b m13450r() {
        ArrayList<C8112b> arrayList = this.f26393d;
        if (arrayList != null) {
            return arrayList.get(arrayList.size() - 1);
        }
        return null;
    }

    public final void m13449s(boolean z) {
        AbstractC7515z zVar = this.f26396g;
        if (zVar != null) {
            zVar.mo15757a6(this.f26394e + this.f26392c, m13457k(), this.f26393d.get(this.f26392c), z);
        }
    }

    public void m13448t(int i, ArrayList<C8112b> arrayList) {
        this.f26392c = i;
        this.f26393d = arrayList;
    }

    public void m13447u(C6246h hVar, ArrayList<C6246h> arrayList) {
        this.f26393d = new ArrayList<>(arrayList.size());
        Iterator<C6246h> it = arrayList.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            C6246h next = it.next();
            if (next == hVar) {
                i2 = i;
            }
            if (next instanceof C6253l) {
                this.f26393d.add(new C8112b(this.f26390a, this.f26391b, (C6253l) next));
                i++;
            }
        }
        if (i2 != -1) {
            this.f26392c = i2;
            return;
        }
        throw new IllegalArgumentException("not found target image in the correspoding list");
    }

    public void m13446v(C8112b bVar) {
        this.f26392c = 0;
        ArrayList<C8112b> arrayList = new ArrayList<>();
        this.f26393d = arrayList;
        arrayList.add(bVar);
    }

    public void m13445w(AbstractC7515z zVar) {
        this.f26396g = zVar;
    }

    public void m13444x(int i, int i2) {
        if (this.f26394e != i || this.f26395f != i2) {
            this.f26394e = i;
            this.f26395f = i2;
        }
    }
}
