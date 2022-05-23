package od;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import gd.w;
import java.util.ArrayList;
import java.util.Iterator;
import oc.v0;
import od.b;
import od.g;
import od.o1;
import org.thunderdog.challegram.R;

public class r extends RecyclerView.h<b> implements g.a, o1.a, b.a {
    public final Context M;
    public final RecyclerView.p N;
    public final ArrayList<c> O;
    public qd.a P;
    public c Q;
    public c R;
    public a S;

    public interface a {
        boolean m4();

        void n6(int i10);
    }

    public static class b extends RecyclerView.c0 {
        public b(View view) {
            super(view);
        }
    }

    public static class c {
        public int f19840a;
        public int f19841b;
        public int f19842c;
        public int f19843d = R.id.theme_color_white;

        public c(int i10, int i11, int i12) {
            this.f19840a = i10;
            this.f19841b = i11;
            this.f19842c = i12;
        }

        public int a() {
            return this.f19843d;
        }

        public int b() {
            return this.f19841b;
        }

        public String c() {
            int i10 = this.f19842c;
            return i10 != 0 ? w.i1(i10) : "";
        }

        public int d() {
            return this.f19840a;
        }

        public boolean e(int i10) {
            if (this.f19843d == i10) {
                return false;
            }
            this.f19843d = i10;
            return true;
        }
    }

    public r(Context context, RecyclerView.p pVar) {
        this.M = context;
        this.N = pVar;
        ArrayList<c> arrayList = new ArrayList<>();
        this.O = arrayList;
        arrayList.add(new c(0, 0, R.string.Enhance));
        arrayList.add(new c(0, 1, R.string.Exposure));
        arrayList.add(new c(0, 2, R.string.Contrast));
        arrayList.add(new c(0, 3, R.string.Warmth));
        arrayList.add(new c(0, 4, R.string.Saturation));
        c cVar = new c(1, 11, R.string.Shadows);
        this.Q = cVar;
        arrayList.add(cVar);
        arrayList.add(new c(0, 10, 0));
        c cVar2 = new c(1, 13, R.string.Highlights);
        this.R = cVar2;
        arrayList.add(cVar2);
        arrayList.add(new c(0, 12, 0));
        arrayList.add(new c(0, 5, R.string.Fade));
        arrayList.add(new c(0, 6, R.string.Vignette));
        arrayList.add(new c(0, 7, R.string.Grain));
        arrayList.add(new c(0, 8, R.string.Sharpen));
    }

    @Override
    public int D() {
        if (this.P != null) {
            return this.O.size();
        }
        return 0;
    }

    @Override
    public int F(int i10) {
        return this.O.get(i10).d();
    }

    public int a0(int i10) {
        Iterator<c> it = this.O.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (it.next().b() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Override
    public void b(o1 o1Var) {
    }

    public void Q(b bVar, int i10) {
        c cVar = this.O.get(i10);
        bVar.f2982a.setTag(cVar);
        int n10 = bVar.n();
        if (n10 == 0) {
            String c10 = cVar.c();
            int b10 = cVar.b();
            int j10 = this.P.j(b10);
            ((o1) bVar.f2982a).z1(c10, j10, j10 / 100.0f, qd.a.a(b10) ? 1 : 0, cVar.a(), true);
        } else if (n10 == 1) {
            String c11 = cVar.c();
            int b11 = cVar.b();
            ((g) bVar.f2982a).z1(c11, b11 == 12 ? qd.a.f21533j : qd.a.f21532i, this.P.j(b11));
        } else if (n10 == 2) {
            ((od.b) bVar.f2982a).setData(this.P.j(cVar.b()));
        }
    }

    public b S(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            o1 o1Var = new o1(this.M);
            o1Var.setCallback(this);
            return new b(o1Var);
        } else if (i10 == 1) {
            g gVar = new g(this.M);
            gVar.setListener(this);
            return new b(gVar);
        } else if (i10 == 2) {
            od.b bVar = new od.b(this.M);
            bVar.setListener(this);
            return new b(bVar);
        } else {
            throw new RuntimeException("viewType == " + i10);
        }
    }

    @Override
    public boolean d() {
        a aVar = this.S;
        return aVar == null || aVar.m4();
    }

    public void d0(a aVar) {
        this.S = aVar;
    }

    public void e0(qd.a aVar) {
        int D = D();
        this.P = aVar;
        int j10 = aVar.j(13);
        c cVar = this.R;
        int i10 = R.id.theme_color_white;
        if (j10 == 0) {
            j10 = R.id.theme_color_white;
        }
        cVar.e(j10);
        int j11 = aVar.j(11);
        c cVar2 = this.Q;
        if (j11 != 0) {
            i10 = j11;
        }
        cVar2.e(i10);
        v0.k2(this, D);
    }

    @Override
    public boolean f() {
        a aVar = this.S;
        return aVar == null || aVar.m4();
    }

    @Override
    public void g(o1 o1Var, int i10) {
        a aVar;
        c cVar = (c) o1Var.getTag();
        if (this.P.o(cVar.b(), i10) && (aVar = this.S) != null) {
            aVar.n6(cVar.b());
        }
    }

    @Override
    public void k(o1 o1Var) {
    }

    @Override
    public void l(od.b bVar, int i10) {
    }

    @Override
    public void w(g gVar, int i10) {
        a aVar;
        c cVar = (c) gVar.getTag();
        int a02 = a0(cVar.b());
        if (a02 != -1) {
            int i11 = a02 + 1;
            View C = this.N.C(i11);
            if (C != null) {
                ((o1) C).setColorId(i10 == 0 ? R.id.theme_color_white : i10);
            } else {
                I(i11);
            }
        }
        if (this.P.o(cVar.b(), i10) && (aVar = this.S) != null) {
            aVar.n6(cVar.b());
        }
    }

    @Override
    public boolean x() {
        a aVar = this.S;
        return aVar == null || aVar.m4();
    }
}
