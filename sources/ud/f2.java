package ud;

import de.ra;
import gd.w;
import java.util.ArrayList;
import java.util.List;
import ne.j2;
import ne.r3;
import org.thunderdog.challegram.R;
import uc.c;
import ud.e2;
import ud.v4;
import zd.d9;

public class f2 {
    public final int f24149a;
    public ArrayList<ra> f24150b;
    public ra[] f24151c;
    public v4.r f24152d;
    public v4.s f24153e;
    public v4.n f24154f;
    public int f24155g;
    public int f24157i;
    public String[] f24158j;
    public j2.f f24166r;
    public e2.a f24167s;
    public b f24168t;
    public boolean f24169u;
    public boolean f24170v;
    public d9 f24171w;
    public a f24172x;
    public int f24156h = R.string.MaxSize;
    public boolean f24159k = true;
    public boolean f24160l = false;
    public String f24161m = w.i1(R.string.Save);
    public int f24162n = R.id.theme_color_textNeutral;
    public String f24163o = w.i1(R.string.Cancel);
    public int f24164p = R.id.theme_color_textNeutral;
    public boolean f24165q = true;

    public interface a {
        void a(ra raVar, o0 o0Var, r3 r3Var, boolean z10);
    }

    public interface b {
        void a(ra raVar, c cVar, boolean z10);
    }

    public f2(int i10) {
        this.f24149a = i10;
    }

    public f2 a(ra raVar) {
        if (raVar != null) {
            if (this.f24150b == null) {
                this.f24150b = new ArrayList<>();
            }
            this.f24150b.add(raVar);
        }
        return this;
    }

    public f2 b(CharSequence charSequence) {
        if (charSequence != null) {
            a(new ra(28, 0, 0, charSequence, false));
        }
        return this;
    }

    public f2 c(boolean z10) {
        this.f24165q = z10;
        return this;
    }

    public f2 d(int i10) {
        return e(w.i1(i10));
    }

    public f2 e(String str) {
        this.f24163o = str;
        return this;
    }

    public f2 f(boolean z10) {
        this.f24169u = z10;
        return this;
    }

    public f2 g(j2.f fVar) {
        this.f24166r = fVar;
        return this;
    }

    public f2 h(a aVar) {
        this.f24172x = aVar;
        return this;
    }

    @Deprecated
    public f2 i(ra raVar) {
        if (raVar != null) {
            ArrayList<ra> arrayList = this.f24150b;
            if (arrayList == null) {
                this.f24150b = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            this.f24150b.add(raVar);
        }
        return this;
    }

    public f2 j(v4.r rVar) {
        this.f24152d = rVar;
        return this;
    }

    public f2 k(boolean z10) {
        this.f24160l = z10;
        return this;
    }

    public f2 l(boolean z10) {
        this.f24159k = z10;
        return this;
    }

    public f2 m(e2.a aVar) {
        this.f24167s = aVar;
        return this;
    }

    public f2 n(v4.n nVar) {
        this.f24154f = nVar;
        return this;
    }

    public f2 o(List<ra> list) {
        ra[] raVarArr = new ra[list.size()];
        this.f24151c = raVarArr;
        list.toArray(raVarArr);
        return this;
    }

    public f2 p(ra[] raVarArr) {
        this.f24151c = raVarArr;
        return this;
    }

    public f2 q(int i10) {
        this.f24162n = i10;
        return this;
    }

    public f2 r(int i10) {
        return s(w.i1(i10));
    }

    public f2 s(String str) {
        this.f24161m = str;
        return this;
    }

    public f2 t(b bVar) {
        this.f24168t = bVar;
        return this;
    }

    public f2 u(int i10) {
        this.f24155g = i10;
        return this;
    }

    public f2 v(int i10) {
        this.f24157i = i10;
        return this;
    }

    public f2 w(String[] strArr) {
        this.f24158j = strArr;
        return this;
    }

    public f2 x(v4.s sVar) {
        this.f24153e = sVar;
        return this;
    }

    public f2 y(d9 d9Var) {
        this.f24171w = d9Var;
        return this;
    }
}
