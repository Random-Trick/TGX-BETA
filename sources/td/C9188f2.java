package td;

import java.util.ArrayList;
import java.util.List;
import me.C6924j2;
import me.C7025s3;
import org.thunderdog.challegram.R;
import p038ce.C2964ra;
import p082fd.C4403w;
import p350yd.AbstractC10664f9;
import tc.C9137c;
import td.AbstractC9323v4;
import td.C9180e2;

public class C9188f2 {
    public final int f29652a;
    public ArrayList<C2964ra> f29653b;
    public C2964ra[] f29654c;
    public AbstractC9323v4.AbstractC9343r f29655d;
    public AbstractC9323v4.AbstractC9344s f29656e;
    public AbstractC9323v4.AbstractC9337n f29657f;
    public int f29658g;
    public int f29660i;
    public String[] f29661j;
    public C6924j2.AbstractC6930f f29669r;
    public C9180e2.AbstractC9181a f29670s;
    public AbstractC9190b f29671t;
    public boolean f29672u;
    public boolean f29673v;
    public AbstractC10664f9 f29674w;
    public AbstractC9189a f29675x;
    public int f29659h = R.string.MaxSize;
    public boolean f29662k = true;
    public boolean f29663l = false;
    public String f29664m = C4403w.m27869i1(R.string.Save);
    public int f29665n = R.id.theme_color_textNeutral;
    public String f29666o = C4403w.m27869i1(R.string.Cancel);
    public int f29667p = R.id.theme_color_textNeutral;
    public boolean f29668q = true;

    public interface AbstractC9189a {
        void mo9987a(C2964ra raVar, C9256o0 o0Var, C7025s3 s3Var, boolean z);
    }

    public interface AbstractC9190b {
        void mo4253a(C2964ra raVar, C9137c cVar, boolean z);
    }

    public C9188f2(int i) {
        this.f29652a = i;
    }

    public C9188f2 m10012a(C2964ra raVar) {
        if (raVar != null) {
            if (this.f29653b == null) {
                this.f29653b = new ArrayList<>();
            }
            this.f29653b.add(raVar);
        }
        return this;
    }

    public C9188f2 m10011b(CharSequence charSequence) {
        if (charSequence != null) {
            m10012a(new C2964ra(28, 0, 0, charSequence, false));
        }
        return this;
    }

    public C9188f2 m10010c(boolean z) {
        this.f29668q = z;
        return this;
    }

    public C9188f2 m10009d(int i) {
        return m10008e(C4403w.m27869i1(i));
    }

    public C9188f2 m10008e(String str) {
        this.f29666o = str;
        return this;
    }

    public C9188f2 m10007f(boolean z) {
        this.f29672u = z;
        return this;
    }

    public C9188f2 m10006g(C6924j2.AbstractC6930f fVar) {
        this.f29669r = fVar;
        return this;
    }

    public C9188f2 m10005h(AbstractC9189a aVar) {
        this.f29675x = aVar;
        return this;
    }

    @Deprecated
    public C9188f2 m10004i(C2964ra raVar) {
        if (raVar != null) {
            ArrayList<C2964ra> arrayList = this.f29653b;
            if (arrayList == null) {
                this.f29653b = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            this.f29653b.add(raVar);
        }
        return this;
    }

    public C9188f2 m10003j(AbstractC9323v4.AbstractC9343r rVar) {
        this.f29655d = rVar;
        return this;
    }

    public C9188f2 m10002k(boolean z) {
        this.f29663l = z;
        return this;
    }

    public C9188f2 m10001l(boolean z) {
        this.f29662k = z;
        return this;
    }

    public C9188f2 m10000m(C9180e2.AbstractC9181a aVar) {
        this.f29670s = aVar;
        return this;
    }

    public C9188f2 m9999n(AbstractC9323v4.AbstractC9337n nVar) {
        this.f29657f = nVar;
        return this;
    }

    public C9188f2 m9998o(List<C2964ra> list) {
        C2964ra[] raVarArr = new C2964ra[list.size()];
        this.f29654c = raVarArr;
        list.toArray(raVarArr);
        return this;
    }

    public C9188f2 m9997p(C2964ra[] raVarArr) {
        this.f29654c = raVarArr;
        return this;
    }

    public C9188f2 m9996q(int i) {
        this.f29665n = i;
        return this;
    }

    public C9188f2 m9995r(int i) {
        return m9994s(C4403w.m27869i1(i));
    }

    public C9188f2 m9994s(String str) {
        this.f29664m = str;
        return this;
    }

    public C9188f2 m9993t(AbstractC9190b bVar) {
        this.f29671t = bVar;
        return this;
    }

    public C9188f2 m9992u(int i) {
        this.f29658g = i;
        return this;
    }

    public C9188f2 m9991v(int i) {
        this.f29660i = i;
        return this;
    }

    public C9188f2 m9990w(String[] strArr) {
        this.f29661j = strArr;
        return this;
    }

    public C9188f2 m9989x(AbstractC9323v4.AbstractC9344s sVar) {
        this.f29656e = sVar;
        return this;
    }

    public C9188f2 m9988y(AbstractC10664f9 f9Var) {
        this.f29674w = f9Var;
        return this;
    }
}
