package p019b4;

import p020b5.C1186a;
import p020b5.C1189b0;
import p174m3.C6556a2;
import p270t3.AbstractC8959g;
import p270t3.C8962i;

public final class C1177f {
    public int f4431a;
    public int f4432b;
    public long f4433c;
    public long f4434d;
    public long f4435e;
    public long f4436f;
    public int f4437g;
    public int f4438h;
    public int f4439i;
    public final int[] f4440j = new int[255];
    public final C1189b0 f4441k = new C1189b0(255);

    public boolean m38216a(AbstractC8959g gVar, boolean z) {
        m38215b();
        this.f4441k.m38148L(27);
        if (!C8962i.m10831b(gVar, this.f4441k.m38139d(), 0, 27, z) || this.f4441k.m38154F() != 1332176723) {
            return false;
        }
        int D = this.f4441k.m38156D();
        this.f4431a = D;
        if (D == 0) {
            this.f4432b = this.f4441k.m38156D();
            this.f4433c = this.f4441k.m38125r();
            this.f4434d = this.f4441k.m38123t();
            this.f4435e = this.f4441k.m38123t();
            this.f4436f = this.f4441k.m38123t();
            int D2 = this.f4441k.m38156D();
            this.f4437g = D2;
            this.f4438h = D2 + 27;
            this.f4441k.m38148L(D2);
            if (!C8962i.m10831b(gVar, this.f4441k.m38139d(), 0, this.f4437g, z)) {
                return false;
            }
            for (int i = 0; i < this.f4437g; i++) {
                this.f4440j[i] = this.f4441k.m38156D();
                this.f4439i += this.f4440j[i];
            }
            return true;
        } else if (z) {
            return false;
        } else {
            throw C6556a2.m20110c("unsupported bit stream revision");
        }
    }

    public void m38215b() {
        this.f4431a = 0;
        this.f4432b = 0;
        this.f4433c = 0L;
        this.f4434d = 0L;
        this.f4435e = 0L;
        this.f4436f = 0L;
        this.f4437g = 0;
        this.f4438h = 0;
        this.f4439i = 0;
    }

    public boolean m38214c(AbstractC8959g gVar) {
        return m38213d(gVar, -1L);
    }

    public boolean m38213d(AbstractC8959g gVar, long j) {
        int i;
        C1186a.m38189a(gVar.mo6043r() == gVar.mo6045f());
        this.f4441k.m38148L(4);
        while (true) {
            i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
            if ((i == 0 || gVar.mo6043r() + 4 < j) && C8962i.m10831b(gVar, this.f4441k.m38139d(), 0, 4, true)) {
                this.f4441k.m38144P(0);
                if (this.f4441k.m38154F() == 1332176723) {
                    gVar.mo10809m();
                    return true;
                }
                gVar.mo10808n(1);
            }
        }
        do {
            if (i != 0 && gVar.mo6043r() >= j) {
                break;
            }
        } while (gVar.mo10811i(1) != -1);
        return false;
    }
}
