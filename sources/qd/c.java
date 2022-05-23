package qd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ld.h;
import ld.l;
import od.z;
import org.thunderdog.challegram.a;
import zd.o6;

public class c {
    public final a f21563a;
    public final o6 f21564b;
    public int f21565c = -1;
    public ArrayList<b> f21566d;
    public int f21567e;
    public int f21568f;
    public z f21569g;

    public c(a aVar, o6 o6Var) {
        this.f21563a = aVar;
        this.f21564b = o6Var;
    }

    public void a() {
        this.f21565c++;
        s(false);
    }

    public void b() {
        this.f21565c--;
        s(false);
    }

    public b c() {
        ArrayList<b> arrayList = this.f21566d;
        if (arrayList != null) {
            return arrayList.get(0);
        }
        return null;
    }

    public void d(int i10) {
        if (this.f21565c != i10) {
            this.f21565c = i10;
            s(false);
        }
    }

    public b e(int i10) {
        if (i10 < 0 || i10 >= this.f21566d.size()) {
            return null;
        }
        return this.f21566d.get(i10);
    }

    public ArrayList<b> f() {
        return this.f21566d;
    }

    public b g() {
        int i10;
        ArrayList<b> arrayList = this.f21566d;
        if (arrayList == null || (i10 = this.f21565c) == -1) {
            return null;
        }
        return arrayList.get(i10);
    }

    public int h() {
        return this.f21565c;
    }

    public int i() {
        ArrayList<b> arrayList = this.f21566d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public int j() {
        return this.f21565c + this.f21567e;
    }

    public int k() {
        return i() + this.f21567e + this.f21568f;
    }

    public b l() {
        if (n()) {
            return this.f21566d.get(this.f21565c + 1);
        }
        return null;
    }

    public b m() {
        if (o()) {
            return this.f21566d.get(this.f21565c - 1);
        }
        return null;
    }

    public boolean n() {
        return this.f21565c < i() - 1;
    }

    public boolean o() {
        return this.f21565c > 0;
    }

    public int p(h hVar) {
        Iterator<b> it = this.f21566d.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().K() == hVar) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public void q(ArrayList<b> arrayList, boolean z10) {
        if (z10) {
            this.f21566d.addAll(0, arrayList);
            this.f21565c += arrayList.size();
            int size = this.f21567e - arrayList.size();
            this.f21567e = size;
            if (size < 0) {
                this.f21567e = 0;
            }
        } else {
            this.f21566d.addAll(arrayList);
            int size2 = this.f21568f - arrayList.size();
            this.f21568f = size2;
            if (size2 < 0) {
                this.f21568f = 0;
            }
        }
        s(true);
    }

    public b r() {
        ArrayList<b> arrayList = this.f21566d;
        if (arrayList != null) {
            return arrayList.get(arrayList.size() - 1);
        }
        return null;
    }

    public final void s(boolean z10) {
        z zVar = this.f21569g;
        if (zVar != null) {
            zVar.i7(this.f21567e + this.f21565c, k(), this.f21566d.get(this.f21565c), z10);
        }
    }

    public void t(int i10, ArrayList<b> arrayList) {
        this.f21565c = i10;
        this.f21566d = arrayList;
    }

    public void u(h hVar, List<h> list) {
        this.f21566d = new ArrayList<>(list.size());
        int i10 = 0;
        int i11 = -1;
        for (h hVar2 : list) {
            if (hVar2 == hVar) {
                i11 = i10;
            }
            if (hVar2 instanceof l) {
                this.f21566d.add(new b(this.f21563a, this.f21564b, (l) hVar2));
                i10++;
            }
        }
        if (i11 != -1) {
            this.f21565c = i11;
            return;
        }
        throw new IllegalArgumentException("not found target image in the correspoding list");
    }

    public void v(b bVar) {
        this.f21565c = 0;
        ArrayList<b> arrayList = new ArrayList<>();
        this.f21566d = arrayList;
        arrayList.add(bVar);
    }

    public void w(z zVar) {
        this.f21569g = zVar;
    }

    public void x(int i10, int i11) {
        if (this.f21567e != i10 || this.f21568f != i11) {
            this.f21567e = i10;
            this.f21568f = i11;
        }
    }
}
