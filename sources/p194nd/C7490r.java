package p194nd;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import nc.C7389v0;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p194nd.C7478o1;
import p194nd.View$OnClickListenerC7399b;
import p194nd.View$OnClickListenerC7418g;
import p225pd.C8111a;

public class C7490r extends RecyclerView.AbstractC0890h<C7492b> implements View$OnClickListenerC7418g.AbstractC7419a, C7478o1.AbstractC7479a, View$OnClickListenerC7399b.AbstractC7400a {
    public final Context f23975M;
    public final RecyclerView.AbstractC0902p f23976N;
    public final ArrayList<C7493c> f23977O;
    public C8111a f23978P;
    public C7493c f23979Q;
    public C7493c f23980R;
    public AbstractC7491a f23981S;

    public interface AbstractC7491a {
        void mo15809n6(int i);

        boolean mo15808u4();
    }

    public static class C7492b extends RecyclerView.AbstractC0886d0 {
        public C7492b(View view) {
            super(view);
        }
    }

    public static class C7493c {
        public int f23982a;
        public int f23983b;
        public int f23984c;
        public int f23985d = R.id.theme_color_white;

        public C7493c(int i, int i2, int i3) {
            this.f23982a = i;
            this.f23983b = i2;
            this.f23984c = i3;
        }

        public int m15807a() {
            return this.f23985d;
        }

        public int m15806b() {
            return this.f23983b;
        }

        public String m15805c() {
            int i = this.f23984c;
            return i != 0 ? C4403w.m27871i1(i) : "";
        }

        public int m15804d() {
            return this.f23982a;
        }

        public boolean m15803e(int i) {
            if (this.f23985d == i) {
                return false;
            }
            this.f23985d = i;
            return true;
        }
    }

    public C7490r(Context context, RecyclerView.AbstractC0902p pVar) {
        this.f23975M = context;
        this.f23976N = pVar;
        ArrayList<C7493c> arrayList = new ArrayList<>();
        this.f23977O = arrayList;
        arrayList.add(new C7493c(0, 0, R.string.Enhance));
        arrayList.add(new C7493c(0, 1, R.string.Exposure));
        arrayList.add(new C7493c(0, 2, R.string.Contrast));
        arrayList.add(new C7493c(0, 3, R.string.Warmth));
        arrayList.add(new C7493c(0, 4, R.string.Saturation));
        C7493c cVar = new C7493c(1, 11, R.string.Shadows);
        this.f23979Q = cVar;
        arrayList.add(cVar);
        arrayList.add(new C7493c(0, 10, 0));
        C7493c cVar2 = new C7493c(1, 13, R.string.Highlights);
        this.f23980R = cVar2;
        arrayList.add(cVar2);
        arrayList.add(new C7493c(0, 12, 0));
        arrayList.add(new C7493c(0, 5, R.string.Fade));
        arrayList.add(new C7493c(0, 6, R.string.Vignette));
        arrayList.add(new C7493c(0, 7, R.string.Grain));
        arrayList.add(new C7493c(0, 8, R.string.Sharpen));
    }

    @Override
    public int mo6153D() {
        if (this.f23978P != null) {
            return this.f23977O.size();
        }
        return 0;
    }

    @Override
    public int mo6150F(int i) {
        return this.f23977O.get(i).m15804d();
    }

    @Override
    public void mo15822a(View$OnClickListenerC7418g gVar, int i) {
        AbstractC7491a aVar;
        C7493c cVar = (C7493c) gVar.getTag();
        int a0 = m15821a0(cVar.m15806b());
        if (a0 != -1) {
            int i2 = a0 + 1;
            View C = this.f23976N.mo39265C(i2);
            if (C != null) {
                ((C7478o1) C).setColorId(i == 0 ? R.id.theme_color_white : i);
            } else {
                m39315I(i2);
            }
        }
        if (this.f23978P.m13570o(cVar.m15806b(), i) && (aVar = this.f23981S) != null) {
            aVar.mo15809n6(cVar.m15806b());
        }
    }

    public int m15821a0(int i) {
        Iterator<C7493c> it = this.f23977O.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().m15806b() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override
    public boolean mo15820c() {
        AbstractC7491a aVar = this.f23981S;
        return aVar == null || aVar.mo15808u4();
    }

    public void mo6146Q(C7492b bVar, int i) {
        C7493c cVar = this.f23977O.get(i);
        bVar.f3479a.setTag(cVar);
        int n = bVar.m39335n();
        if (n == 0) {
            String c = cVar.m15805c();
            int b = cVar.m15806b();
            int j = this.f23978P.m13575j(b);
            ((C7478o1) bVar.f3479a).m15886C1(c, j, j / 100.0f, C8111a.m13584a(b) ? 1 : 0, cVar.m15807a(), true);
        } else if (n == 1) {
            String c2 = cVar.m15805c();
            int b2 = cVar.m15806b();
            ((View$OnClickListenerC7418g) bVar.f3479a).m16500C1(c2, b2 == 12 ? C8111a.f26350j : C8111a.f26349i, this.f23978P.m13575j(b2));
        } else if (n == 2) {
            ((View$OnClickListenerC7399b) bVar.f3479a).setData(this.f23978P.m13575j(cVar.m15806b()));
        }
    }

    @Override
    public void mo15818d(C7478o1 o1Var) {
    }

    public C7492b mo6145S(ViewGroup viewGroup, int i) {
        if (i == 0) {
            C7478o1 o1Var = new C7478o1(this.f23975M);
            o1Var.setCallback(this);
            return new C7492b(o1Var);
        } else if (i == 1) {
            View$OnClickListenerC7418g gVar = new View$OnClickListenerC7418g(this.f23975M);
            gVar.setListener(this);
            return new C7492b(gVar);
        } else if (i == 2) {
            View$OnClickListenerC7399b bVar = new View$OnClickListenerC7399b(this.f23975M);
            bVar.setListener(this);
            return new C7492b(bVar);
        } else {
            throw new RuntimeException("viewType == " + i);
        }
    }

    public void m15816e0(AbstractC7491a aVar) {
        this.f23981S = aVar;
    }

    @Override
    public boolean mo15815f() {
        AbstractC7491a aVar = this.f23981S;
        return aVar == null || aVar.mo15808u4();
    }

    public void m15814f0(C8111a aVar) {
        int D = mo6153D();
        this.f23978P = aVar;
        int j = aVar.m13575j(13);
        C7493c cVar = this.f23980R;
        int i = R.id.theme_color_white;
        if (j == 0) {
            j = R.id.theme_color_white;
        }
        cVar.m15803e(j);
        int j2 = aVar.m13575j(11);
        C7493c cVar2 = this.f23979Q;
        if (j2 != 0) {
            i = j2;
        }
        cVar2.m15803e(i);
        C7389v0.m16615k2(this, D);
    }

    @Override
    public void mo15813p(View$OnClickListenerC7399b bVar, int i) {
    }

    @Override
    public void mo15812u(C7478o1 o1Var) {
    }

    @Override
    public boolean mo15811w() {
        AbstractC7491a aVar = this.f23981S;
        return aVar == null || aVar.mo15808u4();
    }

    @Override
    public void mo15810y(C7478o1 o1Var, int i) {
        AbstractC7491a aVar;
        C7493c cVar = (C7493c) o1Var.getTag();
        if (this.f23978P.m13570o(cVar.m15806b(), i) && (aVar = this.f23981S) != null) {
            aVar.mo15809n6(cVar.m15806b());
        }
    }
}
