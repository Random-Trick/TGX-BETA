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
    public final int f29655a;
    public ArrayList<C2964ra> f29656b;
    public C2964ra[] f29657c;
    public AbstractC9323v4.AbstractC9343r f29658d;
    public AbstractC9323v4.AbstractC9344s f29659e;
    public AbstractC9323v4.AbstractC9337n f29660f;
    public int f29661g;
    public int f29663i;
    public String[] f29664j;
    public C6924j2.AbstractC6930f f29672r;
    public C9180e2.AbstractC9181a f29673s;
    public AbstractC9190b f29674t;
    public boolean f29675u;
    public boolean f29676v;
    public AbstractC10664f9 f29677w;
    public AbstractC9189a f29678x;
    public int f29662h = R.string.MaxSize;
    public boolean f29665k = true;
    public boolean f29666l = false;
    public String f29667m = C4403w.m27871i1(R.string.Save);
    public int f29668n = R.id.theme_color_textNeutral;
    public String f29669o = C4403w.m27871i1(R.string.Cancel);
    public int f29670p = R.id.theme_color_textNeutral;
    public boolean f29671q = true;

    public interface AbstractC9189a {
        void mo9986a(C2964ra raVar, C9256o0 o0Var, C7025s3 s3Var, boolean z);
    }

    public interface AbstractC9190b {
        void mo4253a(C2964ra raVar, C9137c cVar, boolean z);
    }

    public C9188f2(int i) {
        this.f29655a = i;
    }

    public C9188f2 m10011a(C2964ra raVar) {
        if (raVar != null) {
            if (this.f29656b == null) {
                this.f29656b = new ArrayList<>();
            }
            this.f29656b.add(raVar);
        }
        return this;
    }

    public C9188f2 m10010b(CharSequence charSequence) {
        if (charSequence != null) {
            m10011a(new C2964ra(28, 0, 0, charSequence, false));
        }
        return this;
    }

    public C9188f2 m10009c(boolean z) {
        this.f29671q = z;
        return this;
    }

    public C9188f2 m10008d(int i) {
        return m10007e(C4403w.m27871i1(i));
    }

    public C9188f2 m10007e(String str) {
        this.f29669o = str;
        return this;
    }

    public C9188f2 m10006f(boolean z) {
        this.f29675u = z;
        return this;
    }

    public C9188f2 m10005g(C6924j2.AbstractC6930f fVar) {
        this.f29672r = fVar;
        return this;
    }

    public C9188f2 m10004h(AbstractC9189a aVar) {
        this.f29678x = aVar;
        return this;
    }

    @Deprecated
    public C9188f2 m10003i(C2964ra raVar) {
        if (raVar != null) {
            ArrayList<C2964ra> arrayList = this.f29656b;
            if (arrayList == null) {
                this.f29656b = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            this.f29656b.add(raVar);
        }
        return this;
    }

    public C9188f2 m10002j(AbstractC9323v4.AbstractC9343r rVar) {
        this.f29658d = rVar;
        return this;
    }

    public C9188f2 m10001k(boolean z) {
        this.f29666l = z;
        return this;
    }

    public C9188f2 m10000l(boolean z) {
        this.f29665k = z;
        return this;
    }

    public C9188f2 m9999m(C9180e2.AbstractC9181a aVar) {
        this.f29673s = aVar;
        return this;
    }

    public C9188f2 m9998n(AbstractC9323v4.AbstractC9337n nVar) {
        this.f29660f = nVar;
        return this;
    }

    public C9188f2 m9997o(List<C2964ra> list) {
        C2964ra[] raVarArr = new C2964ra[list.size()];
        this.f29657c = raVarArr;
        list.toArray(raVarArr);
        return this;
    }

    public C9188f2 m9996p(C2964ra[] raVarArr) {
        this.f29657c = raVarArr;
        return this;
    }

    public C9188f2 m9995q(int i) {
        this.f29668n = i;
        return this;
    }

    public C9188f2 m9994r(int i) {
        return m9993s(C4403w.m27871i1(i));
    }

    public C9188f2 m9993s(String str) {
        this.f29667m = str;
        return this;
    }

    public C9188f2 m9992t(AbstractC9190b bVar) {
        this.f29674t = bVar;
        return this;
    }

    public C9188f2 m9991u(int i) {
        this.f29661g = i;
        return this;
    }

    public C9188f2 m9990v(int i) {
        this.f29663i = i;
        return this;
    }

    public C9188f2 m9989w(String[] strArr) {
        this.f29664j = strArr;
        return this;
    }

    public C9188f2 m9988x(AbstractC9323v4.AbstractC9344s sVar) {
        this.f29659e = sVar;
        return this;
    }

    public C9188f2 m9987y(AbstractC10664f9 f9Var) {
        this.f29677w = f9Var;
        return this;
    }
}
