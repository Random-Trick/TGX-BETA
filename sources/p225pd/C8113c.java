package p225pd;

import java.util.ArrayList;
import java.util.Iterator;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import p156kd.C6246h;
import p156kd.C6253l;
import p194nd.AbstractC7515z;
import p350yd.C10930q6;

public class C8113c {
    public final AbstractView$OnTouchListenerC7889a f26393a;
    public final C10930q6 f26394b;
    public int f26395c = -1;
    public ArrayList<C8112b> f26396d;
    public int f26397e;
    public int f26398f;
    public AbstractC7515z f26399g;

    public C8113c(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var) {
        this.f26393a = aVar;
        this.f26394b = q6Var;
    }

    public void m13466a() {
        this.f26395c++;
        m13448s(false);
    }

    public void m13465b() {
        this.f26395c--;
        m13448s(false);
    }

    public C8112b m13464c() {
        ArrayList<C8112b> arrayList = this.f26396d;
        if (arrayList != null) {
            return arrayList.get(0);
        }
        return null;
    }

    public void m13463d(int i) {
        if (this.f26395c != i) {
            this.f26395c = i;
            m13448s(false);
        }
    }

    public C8112b m13462e(int i) {
        if (i < 0 || i >= this.f26396d.size()) {
            return null;
        }
        return this.f26396d.get(i);
    }

    public ArrayList<C8112b> m13461f() {
        return this.f26396d;
    }

    public C8112b m13460g() {
        int i;
        ArrayList<C8112b> arrayList = this.f26396d;
        if (arrayList == null || (i = this.f26395c) == -1) {
            return null;
        }
        return arrayList.get(i);
    }

    public int m13459h() {
        return this.f26395c;
    }

    public int m13458i() {
        ArrayList<C8112b> arrayList = this.f26396d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public int m13457j() {
        return this.f26395c + this.f26397e;
    }

    public int m13456k() {
        return m13458i() + this.f26397e + this.f26398f;
    }

    public C8112b m13455l() {
        if (m13453n()) {
            return this.f26396d.get(this.f26395c + 1);
        }
        return null;
    }

    public C8112b m13454m() {
        if (m13452o()) {
            return this.f26396d.get(this.f26395c - 1);
        }
        return null;
    }

    public boolean m13453n() {
        return this.f26395c < m13458i() - 1;
    }

    public boolean m13452o() {
        return this.f26395c > 0;
    }

    public int m13451p(C6246h hVar) {
        Iterator<C8112b> it = this.f26396d.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().m13549K() == hVar) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void m13450q(ArrayList<C8112b> arrayList, boolean z) {
        if (z) {
            this.f26396d.addAll(0, arrayList);
            this.f26395c += arrayList.size();
            int size = this.f26397e - arrayList.size();
            this.f26397e = size;
            if (size < 0) {
                this.f26397e = 0;
            }
        } else {
            this.f26396d.addAll(arrayList);
            int size2 = this.f26398f - arrayList.size();
            this.f26398f = size2;
            if (size2 < 0) {
                this.f26398f = 0;
            }
        }
        m13448s(true);
    }

    public C8112b m13449r() {
        ArrayList<C8112b> arrayList = this.f26396d;
        if (arrayList != null) {
            return arrayList.get(arrayList.size() - 1);
        }
        return null;
    }

    public final void m13448s(boolean z) {
        AbstractC7515z zVar = this.f26399g;
        if (zVar != null) {
            zVar.mo15757a6(this.f26397e + this.f26395c, m13456k(), this.f26396d.get(this.f26395c), z);
        }
    }

    public void m13447t(int i, ArrayList<C8112b> arrayList) {
        this.f26395c = i;
        this.f26396d = arrayList;
    }

    public void m13446u(C6246h hVar, ArrayList<C6246h> arrayList) {
        this.f26396d = new ArrayList<>(arrayList.size());
        Iterator<C6246h> it = arrayList.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            C6246h next = it.next();
            if (next == hVar) {
                i2 = i;
            }
            if (next instanceof C6253l) {
                this.f26396d.add(new C8112b(this.f26393a, this.f26394b, (C6253l) next));
                i++;
            }
        }
        if (i2 != -1) {
            this.f26395c = i2;
            return;
        }
        throw new IllegalArgumentException("not found target image in the correspoding list");
    }

    public void m13445v(C8112b bVar) {
        this.f26395c = 0;
        ArrayList<C8112b> arrayList = new ArrayList<>();
        this.f26396d = arrayList;
        arrayList.add(bVar);
    }

    public void m13444w(AbstractC7515z zVar) {
        this.f26399g = zVar;
    }

    public void m13443x(int i, int i2) {
        if (this.f26397e != i || this.f26398f != i2) {
            this.f26397e = i;
            this.f26398f = i2;
        }
    }
}
