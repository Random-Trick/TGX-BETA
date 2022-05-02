package sc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import java.util.ArrayList;
import java.util.Iterator;
import nc.C7389v0;
import org.thunderdog.challegram.R;
import p156kd.C6246h;
import sc.C8765g1;

public class View$OnClickListenerC8745e1 extends RecyclerView.AbstractC0890h<C8747b> implements View.OnClickListener, View.OnLongClickListener, AbstractC8749f, C8765g1.AbstractC8766a {
    public final Context f28209M;
    public final RecyclerView f28210N;
    public final GridLayoutManager f28211O;
    public final AbstractC8746a f28212P;
    public final boolean f28213Q;
    public final boolean f28214R;
    public final boolean f28215S;
    public final boolean f28216T;
    public boolean f28217U;
    public boolean f28218V;
    public ArrayList<C6246h> f28219W;
    public final ArrayList<C6246h> f28220X;
    public ArrayList<C6246h> f28221Y;

    public interface AbstractC8746a {
        void mo11223a5();

        boolean mo11219c0(C6246h hVar);

        void mo11202p2(C6246h hVar);

        void mo11194y6(int i, C6246h hVar, int i2);
    }

    public static class C8747b extends RecyclerView.AbstractC0886d0 {
        public C8747b(View view) {
            super(view);
        }

        public static C8747b m11593P(Context context, int i, C8765g1.AbstractC8766a aVar, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
            if (i == 1) {
                C8765g1 g1Var = new C8765g1(context);
                g1Var.setClickListener(aVar);
                g1Var.setOnLongClickListener(onLongClickListener);
                return new C8747b(g1Var);
            } else if (i == 2) {
                TextureView$SurfaceTextureListenerC8761f1 f1Var = new TextureView$SurfaceTextureListenerC8761f1(context);
                f1Var.setOnClickListener(onClickListener);
                f1Var.setOnLongClickListener(onLongClickListener);
                C8747b bVar = new C8747b(f1Var);
                bVar.m39351I(false);
                return bVar;
            } else {
                throw new IllegalArgumentException("viewType == " + i);
            }
        }

        public final void m11594O() {
            int n = m39332n();
            if (n == 1) {
                ((C8765g1) this.f3479a).m11481c();
            } else if (n == 2) {
                ((TextureView$SurfaceTextureListenerC8761f1) this.f3479a).m11485f();
            }
        }

        public final void m11592Q() {
            int n = m39332n();
            if (n == 1) {
                ((C8765g1) this.f3479a).m11480d();
            } else if (n == 2) {
                ((TextureView$SurfaceTextureListenerC8761f1) this.f3479a).m11486b();
            }
        }

        public void m11591R(boolean z) {
            ((C8765g1) this.f3479a).setAnimationsDisabled(z);
        }

        public void m11590S(int i) {
        }

        public void m11589T(C6246h hVar, int i, boolean z, boolean z2) {
            ((C8765g1) this.f3479a).m11476h(hVar, i, z);
            ((C8765g1) this.f3479a).m11475i(!z2, false);
        }
    }

    public View$OnClickListenerC8745e1(Context context, RecyclerView recyclerView, GridLayoutManager gridLayoutManager, AbstractC8746a aVar, int i) {
        this.f28209M = context;
        this.f28210N = recyclerView;
        this.f28211O = gridLayoutManager;
        this.f28212P = aVar;
        boolean z = true;
        boolean z2 = (i & 1) != 0;
        this.f28213Q = z2;
        this.f28214R = z2 && (i & 2) != 0;
        this.f28215S = (i & 4) == 0 ? false : z;
        this.f28216T = false;
        this.f28218V = false;
        this.f28220X = new ArrayList<>();
    }

    @Override
    public int mo6153D() {
        ArrayList<C6246h> arrayList = this.f28219W;
        return ((arrayList == null || arrayList.isEmpty()) ? 0 : this.f28219W.size() + (this.f28215S ? 1 : 0)) + (this.f28218V ? 1 : 0);
    }

    @Override
    public int mo6150F(int i) {
        if (this.f28218V) {
            i--;
            if (i == 0) {
                return 2;
            }
        }
        return i == this.f28219W.size() ? 4 : 1;
    }

    public void m11610a0(GridLayoutManager gridLayoutManager) {
        ArrayList<C6246h> arrayList = this.f28219W;
        if (!(arrayList == null || arrayList.isEmpty())) {
            this.f28220X.clear();
            int X1 = gridLayoutManager.m39549X1();
            int a2 = gridLayoutManager.m39546a2();
            for (int i = X1; i <= a2; i++) {
                View C = gridLayoutManager.mo39262C(i);
                if (C != null && (C instanceof C8765g1)) {
                    ((C8765g1) C).m11478f(-1, true);
                }
            }
            if (X1 > 0) {
                m39309L(0, X1);
            }
            boolean z = this.f28218V;
            int size = (z ? 1 : 0) + this.f28219W.size();
            if (a2 < size) {
                m39309L(a2, size - a2);
            }
        }
    }

    public View m11609c0(C6246h hVar, LinearLayoutManager linearLayoutManager) {
        int g0 = m11605g0(hVar);
        if (g0 != -1) {
            return linearLayoutManager.mo39262C(g0 + (this.f28218V ? 1 : 0));
        }
        return null;
    }

    public int m11608d0() {
        return this.f28220X.size();
    }

    public ArrayList<C6246h> m11607e0(boolean z) {
        if (this.f28220X.size() == 0) {
            return null;
        }
        if (!z) {
            return this.f28220X;
        }
        ArrayList<C6246h> arrayList = new ArrayList<>(this.f28220X.size());
        arrayList.addAll(this.f28220X);
        return arrayList;
    }

    public int m11606f0(C6246h hVar) {
        if (!this.f28213Q || this.f28220X.size() <= 0) {
            return -1;
        }
        return this.f28220X.indexOf(hVar);
    }

    public final int m11605g0(C6246h hVar) {
        ArrayList<C6246h> arrayList = this.f28219W;
        if (arrayList == null) {
            return -1;
        }
        int i = 0;
        Iterator<C6246h> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next() == hVar) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean m11604h0(C6246h hVar) {
        ArrayList<C6246h> arrayList = this.f28221Y;
        if (arrayList == null || arrayList.isEmpty()) {
            return true;
        }
        Iterator<C6246h> it = this.f28221Y.iterator();
        while (it.hasNext()) {
            if (it.next() == hVar) {
                return false;
            }
        }
        return true;
    }

    public void mo6146Q(C8747b bVar, int i) {
        int n = bVar.m39332n();
        if (n == 1) {
            ArrayList<C6246h> arrayList = this.f28219W;
            if (this.f28218V) {
                i--;
            }
            C6246h hVar = arrayList.get(i);
            bVar.m11589T(hVar, m11606f0(hVar), this.f28213Q, m11604h0(hVar));
            bVar.m11591R(!this.f28217U);
        } else if (n == 4) {
            bVar.m11590S(this.f28219W.size());
        }
    }

    public C8747b mo6145S(ViewGroup viewGroup, int i) {
        return C8747b.m11593P(this.f28209M, i, this, this, this.f28213Q ? this : null);
    }

    public void mo6144V(C8747b bVar) {
        bVar.m11594O();
    }

    public void mo6143W(C8747b bVar) {
        bVar.m11592Q();
    }

    public void m11599m0(boolean z, LinearLayoutManager linearLayoutManager) {
        if (this.f28217U != z) {
            this.f28217U = true;
            int X1 = linearLayoutManager.m39549X1();
            int a2 = linearLayoutManager.m39546a2();
            for (int i = X1; i <= a2; i++) {
                View C = linearLayoutManager.mo39262C(i);
                if (C != null && (C instanceof C8765g1)) {
                    ((C8765g1) C).setAnimationsDisabled(!z);
                }
            }
            ?? r7 = this.f28218V;
            if (X1 > r7) {
                m39309L(r7 == true ? 1 : 0, X1);
            }
            int D = mo6153D() - 1;
            if (a2 < D) {
                m39309L(a2 + 1, D - a2);
            }
        }
    }

    public void m11598n0(C6246h hVar, boolean z, RecyclerView.AbstractC0902p pVar) {
        if (z != m11604h0(hVar)) {
            if (z) {
                int size = this.f28221Y.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (this.f28221Y.get(i) == hVar) {
                        this.f28221Y.remove(i);
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                if (this.f28221Y == null) {
                    this.f28221Y = new ArrayList<>();
                }
                this.f28221Y.add(hVar);
            }
            int g0 = m11605g0(hVar);
            if (g0 != -1) {
                int i2 = g0 + (this.f28218V ? 1 : 0);
                View C = pVar.mo39262C(i2);
                if (C != null) {
                    ((C8765g1) C).m11475i(!z, true);
                } else {
                    m39312I(i2);
                }
            }
        }
    }

    public void m11597o0(ArrayList<C6246h> arrayList, boolean z) {
        int D = mo6153D();
        this.f28219W = arrayList;
        boolean z2 = this.f28218V;
        int i = 1;
        boolean z3 = this.f28216T && z;
        this.f28218V = z3;
        if (!z3 || !z2) {
            i = 0;
        }
        C7389v0.m16611l2(this, D, i);
    }

    @Override
    public void onClick(View view) {
        AbstractC8746a aVar;
        if (view.getId() == R.id.btn_camera && (aVar = this.f28212P) != null) {
            aVar.mo11223a5();
        }
    }

    @Override
    public boolean onLongClick(View view) {
        if (view.getId() == R.id.btn_camera) {
            return false;
        }
        C8765g1 g1Var = (C8765g1) view;
        C6246h image = g1Var.getImage();
        int f0 = m11606f0(image);
        int i = -1;
        if (f0 >= 0) {
            this.f28220X.remove(f0);
        } else {
            i = this.f28220X.size();
            this.f28220X.add(image);
            f0 = -1;
        }
        g1Var.m11478f(i, true);
        AbstractC8746a aVar = this.f28212P;
        if (aVar != null) {
            aVar.mo11194y6(this.f28220X.size(), image, i);
        }
        m11595q0(f0);
        return true;
    }

    public void m11596p0(C6246h hVar, boolean z) {
        int i;
        int i2;
        if (z) {
            i = this.f28220X.size();
            this.f28220X.add(hVar);
            i2 = -1;
        } else {
            int indexOf = this.f28220X.indexOf(hVar);
            if (indexOf != -1) {
                this.f28220X.remove(indexOf);
            }
            i2 = indexOf;
            i = -1;
        }
        AbstractC8746a aVar = this.f28212P;
        if (aVar != null) {
            aVar.mo11194y6(this.f28220X.size(), hVar, i);
        }
        int g0 = m11605g0(hVar);
        if (g0 != -1) {
            int i3 = g0 + (this.f28218V ? 1 : 0);
            View C = this.f28211O.mo39262C(i3);
            if (C != null) {
                ((C8765g1) C).m11478f(i, false);
            } else {
                m39312I(i3);
            }
        }
        m11595q0(i2);
    }

    public final void m11595q0(int i) {
        View C;
        int size = this.f28220X.size();
        if (i >= 0 && i < size) {
            int X1 = this.f28211O.m39549X1();
            int a2 = this.f28211O.m39546a2();
            while (i < size) {
                int g0 = m11605g0(this.f28220X.get(i));
                if (g0 != -1) {
                    if (this.f28218V) {
                        g0++;
                    }
                    if (X1 == -1 || a2 == -1 || g0 < X1 || g0 > a2 || (C = this.f28211O.mo39262C(g0)) == null) {
                        m39312I(g0);
                    } else {
                        ((C8765g1) C).setSelectionIndex(i);
                    }
                }
                i++;
            }
        }
    }

    @Override
    public int mo11422r(int i) {
        int i2 = C1357a0.m37541i(4.0f);
        int V2 = this.f28211O.m39594V2();
        int measuredWidth = (this.f28210N.getMeasuredWidth() - ((this.f28211O.m39594V2() + 1) * i2)) / V2;
        GridLayoutManager gridLayoutManager = this.f28211O;
        View C = gridLayoutManager.mo39262C(gridLayoutManager.m39549X1());
        if (C != null) {
            measuredWidth = C.getMeasuredWidth();
        }
        return ((measuredWidth + i2) * ((int) Math.floor(i / V2))) + i2;
    }

    @Override
    public int mo11421v(int i) {
        int i2 = C1357a0.m37541i(4.0f);
        int measuredWidth = ((((this.f28210N.getMeasuredWidth() - ((this.f28211O.m39594V2() + 1) * i2)) / this.f28211O.m39594V2()) + i2) * ((int) Math.ceil(mo6153D() / this.f28211O.m39594V2()))) + i2;
        return i < 0 ? measuredWidth : Math.min(i, measuredWidth);
    }

    @Override
    public void mo11473x(View view, boolean z) {
        C8765g1 g1Var = (C8765g1) view;
        C6246h image = g1Var.getImage();
        if (z || !this.f28212P.mo11219c0(image)) {
            boolean z2 = this.f28214R || this.f28220X.size() > 0;
            int f0 = m11606f0(image);
            int i = -1;
            if (f0 >= 0) {
                this.f28220X.remove(f0);
                i = f0;
                f0 = -1;
            } else if (z2) {
                f0 = this.f28220X.size();
                this.f28220X.add(image);
            }
            if (z2) {
                g1Var.m11478f(f0, true);
                AbstractC8746a aVar = this.f28212P;
                if (aVar != null) {
                    aVar.mo11194y6(this.f28220X.size(), image, f0);
                }
            } else {
                AbstractC8746a aVar2 = this.f28212P;
                if (aVar2 != null) {
                    aVar2.mo11202p2(image);
                }
            }
            m11595q0(i);
        }
    }
}
