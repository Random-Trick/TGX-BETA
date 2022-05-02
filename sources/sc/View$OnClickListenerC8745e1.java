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
    public final Context f28212M;
    public final RecyclerView f28213N;
    public final GridLayoutManager f28214O;
    public final AbstractC8746a f28215P;
    public final boolean f28216Q;
    public final boolean f28217R;
    public final boolean f28218S;
    public final boolean f28219T;
    public boolean f28220U;
    public boolean f28221V;
    public ArrayList<C6246h> f28222W;
    public final ArrayList<C6246h> f28223X;
    public ArrayList<C6246h> f28224Y;

    public interface AbstractC8746a {
        void mo11222a5();

        boolean mo11218c0(C6246h hVar);

        void mo11201p2(C6246h hVar);

        void mo11193y6(int i, C6246h hVar, int i2);
    }

    public static class C8747b extends RecyclerView.AbstractC0886d0 {
        public C8747b(View view) {
            super(view);
        }

        public static C8747b m11592P(Context context, int i, C8765g1.AbstractC8766a aVar, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
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
                bVar.m39354I(false);
                return bVar;
            } else {
                throw new IllegalArgumentException("viewType == " + i);
            }
        }

        public final void m11593O() {
            int n = m39335n();
            if (n == 1) {
                ((C8765g1) this.f3479a).m11480c();
            } else if (n == 2) {
                ((TextureView$SurfaceTextureListenerC8761f1) this.f3479a).m11484f();
            }
        }

        public final void m11591Q() {
            int n = m39335n();
            if (n == 1) {
                ((C8765g1) this.f3479a).m11479d();
            } else if (n == 2) {
                ((TextureView$SurfaceTextureListenerC8761f1) this.f3479a).m11485b();
            }
        }

        public void m11590R(boolean z) {
            ((C8765g1) this.f3479a).setAnimationsDisabled(z);
        }

        public void m11589S(int i) {
        }

        public void m11588T(C6246h hVar, int i, boolean z, boolean z2) {
            ((C8765g1) this.f3479a).m11475h(hVar, i, z);
            ((C8765g1) this.f3479a).m11474i(!z2, false);
        }
    }

    public View$OnClickListenerC8745e1(Context context, RecyclerView recyclerView, GridLayoutManager gridLayoutManager, AbstractC8746a aVar, int i) {
        this.f28212M = context;
        this.f28213N = recyclerView;
        this.f28214O = gridLayoutManager;
        this.f28215P = aVar;
        boolean z = true;
        boolean z2 = (i & 1) != 0;
        this.f28216Q = z2;
        this.f28217R = z2 && (i & 2) != 0;
        this.f28218S = (i & 4) == 0 ? false : z;
        this.f28219T = false;
        this.f28221V = false;
        this.f28223X = new ArrayList<>();
    }

    @Override
    public int mo6153D() {
        ArrayList<C6246h> arrayList = this.f28222W;
        return ((arrayList == null || arrayList.isEmpty()) ? 0 : this.f28222W.size() + (this.f28218S ? 1 : 0)) + (this.f28221V ? 1 : 0);
    }

    @Override
    public int mo6150F(int i) {
        if (this.f28221V) {
            i--;
            if (i == 0) {
                return 2;
            }
        }
        return i == this.f28222W.size() ? 4 : 1;
    }

    public void m11609a0(GridLayoutManager gridLayoutManager) {
        ArrayList<C6246h> arrayList = this.f28222W;
        if (!(arrayList == null || arrayList.isEmpty())) {
            this.f28223X.clear();
            int X1 = gridLayoutManager.m39552X1();
            int a2 = gridLayoutManager.m39549a2();
            for (int i = X1; i <= a2; i++) {
                View C = gridLayoutManager.mo39265C(i);
                if (C != null && (C instanceof C8765g1)) {
                    ((C8765g1) C).m11477f(-1, true);
                }
            }
            if (X1 > 0) {
                m39312L(0, X1);
            }
            boolean z = this.f28221V;
            int size = (z ? 1 : 0) + this.f28222W.size();
            if (a2 < size) {
                m39312L(a2, size - a2);
            }
        }
    }

    public View m11608c0(C6246h hVar, LinearLayoutManager linearLayoutManager) {
        int g0 = m11604g0(hVar);
        if (g0 != -1) {
            return linearLayoutManager.mo39265C(g0 + (this.f28221V ? 1 : 0));
        }
        return null;
    }

    public int m11607d0() {
        return this.f28223X.size();
    }

    public ArrayList<C6246h> m11606e0(boolean z) {
        if (this.f28223X.size() == 0) {
            return null;
        }
        if (!z) {
            return this.f28223X;
        }
        ArrayList<C6246h> arrayList = new ArrayList<>(this.f28223X.size());
        arrayList.addAll(this.f28223X);
        return arrayList;
    }

    public int m11605f0(C6246h hVar) {
        if (!this.f28216Q || this.f28223X.size() <= 0) {
            return -1;
        }
        return this.f28223X.indexOf(hVar);
    }

    public final int m11604g0(C6246h hVar) {
        ArrayList<C6246h> arrayList = this.f28222W;
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

    public final boolean m11603h0(C6246h hVar) {
        ArrayList<C6246h> arrayList = this.f28224Y;
        if (arrayList == null || arrayList.isEmpty()) {
            return true;
        }
        Iterator<C6246h> it = this.f28224Y.iterator();
        while (it.hasNext()) {
            if (it.next() == hVar) {
                return false;
            }
        }
        return true;
    }

    public void mo6146Q(C8747b bVar, int i) {
        int n = bVar.m39335n();
        if (n == 1) {
            ArrayList<C6246h> arrayList = this.f28222W;
            if (this.f28221V) {
                i--;
            }
            C6246h hVar = arrayList.get(i);
            bVar.m11588T(hVar, m11605f0(hVar), this.f28216Q, m11603h0(hVar));
            bVar.m11590R(!this.f28220U);
        } else if (n == 4) {
            bVar.m11589S(this.f28222W.size());
        }
    }

    public C8747b mo6145S(ViewGroup viewGroup, int i) {
        return C8747b.m11592P(this.f28212M, i, this, this, this.f28216Q ? this : null);
    }

    public void mo6144V(C8747b bVar) {
        bVar.m11593O();
    }

    public void mo6143W(C8747b bVar) {
        bVar.m11591Q();
    }

    public void m11598m0(boolean z, LinearLayoutManager linearLayoutManager) {
        if (this.f28220U != z) {
            this.f28220U = true;
            int X1 = linearLayoutManager.m39552X1();
            int a2 = linearLayoutManager.m39549a2();
            for (int i = X1; i <= a2; i++) {
                View C = linearLayoutManager.mo39265C(i);
                if (C != null && (C instanceof C8765g1)) {
                    ((C8765g1) C).setAnimationsDisabled(!z);
                }
            }
            ?? r7 = this.f28221V;
            if (X1 > r7) {
                m39312L(r7 == true ? 1 : 0, X1);
            }
            int D = mo6153D() - 1;
            if (a2 < D) {
                m39312L(a2 + 1, D - a2);
            }
        }
    }

    public void m11597n0(C6246h hVar, boolean z, RecyclerView.AbstractC0902p pVar) {
        if (z != m11603h0(hVar)) {
            if (z) {
                int size = this.f28224Y.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (this.f28224Y.get(i) == hVar) {
                        this.f28224Y.remove(i);
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                if (this.f28224Y == null) {
                    this.f28224Y = new ArrayList<>();
                }
                this.f28224Y.add(hVar);
            }
            int g0 = m11604g0(hVar);
            if (g0 != -1) {
                int i2 = g0 + (this.f28221V ? 1 : 0);
                View C = pVar.mo39265C(i2);
                if (C != null) {
                    ((C8765g1) C).m11474i(!z, true);
                } else {
                    m39315I(i2);
                }
            }
        }
    }

    public void m11596o0(ArrayList<C6246h> arrayList, boolean z) {
        int D = mo6153D();
        this.f28222W = arrayList;
        boolean z2 = this.f28221V;
        int i = 1;
        boolean z3 = this.f28219T && z;
        this.f28221V = z3;
        if (!z3 || !z2) {
            i = 0;
        }
        C7389v0.m16611l2(this, D, i);
    }

    @Override
    public void onClick(View view) {
        AbstractC8746a aVar;
        if (view.getId() == R.id.btn_camera && (aVar = this.f28215P) != null) {
            aVar.mo11222a5();
        }
    }

    @Override
    public boolean onLongClick(View view) {
        if (view.getId() == R.id.btn_camera) {
            return false;
        }
        C8765g1 g1Var = (C8765g1) view;
        C6246h image = g1Var.getImage();
        int f0 = m11605f0(image);
        int i = -1;
        if (f0 >= 0) {
            this.f28223X.remove(f0);
        } else {
            i = this.f28223X.size();
            this.f28223X.add(image);
            f0 = -1;
        }
        g1Var.m11477f(i, true);
        AbstractC8746a aVar = this.f28215P;
        if (aVar != null) {
            aVar.mo11193y6(this.f28223X.size(), image, i);
        }
        m11594q0(f0);
        return true;
    }

    public void m11595p0(C6246h hVar, boolean z) {
        int i;
        int i2;
        if (z) {
            i = this.f28223X.size();
            this.f28223X.add(hVar);
            i2 = -1;
        } else {
            int indexOf = this.f28223X.indexOf(hVar);
            if (indexOf != -1) {
                this.f28223X.remove(indexOf);
            }
            i2 = indexOf;
            i = -1;
        }
        AbstractC8746a aVar = this.f28215P;
        if (aVar != null) {
            aVar.mo11193y6(this.f28223X.size(), hVar, i);
        }
        int g0 = m11604g0(hVar);
        if (g0 != -1) {
            int i3 = g0 + (this.f28221V ? 1 : 0);
            View C = this.f28214O.mo39265C(i3);
            if (C != null) {
                ((C8765g1) C).m11477f(i, false);
            } else {
                m39315I(i3);
            }
        }
        m11594q0(i2);
    }

    public final void m11594q0(int i) {
        View C;
        int size = this.f28223X.size();
        if (i >= 0 && i < size) {
            int X1 = this.f28214O.m39552X1();
            int a2 = this.f28214O.m39549a2();
            while (i < size) {
                int g0 = m11604g0(this.f28223X.get(i));
                if (g0 != -1) {
                    if (this.f28221V) {
                        g0++;
                    }
                    if (X1 == -1 || a2 == -1 || g0 < X1 || g0 > a2 || (C = this.f28214O.mo39265C(g0)) == null) {
                        m39315I(g0);
                    } else {
                        ((C8765g1) C).setSelectionIndex(i);
                    }
                }
                i++;
            }
        }
    }

    @Override
    public int mo11421r(int i) {
        int i2 = C1357a0.m37544i(4.0f);
        int V2 = this.f28214O.m39597V2();
        int measuredWidth = (this.f28213N.getMeasuredWidth() - ((this.f28214O.m39597V2() + 1) * i2)) / V2;
        GridLayoutManager gridLayoutManager = this.f28214O;
        View C = gridLayoutManager.mo39265C(gridLayoutManager.m39552X1());
        if (C != null) {
            measuredWidth = C.getMeasuredWidth();
        }
        return ((measuredWidth + i2) * ((int) Math.floor(i / V2))) + i2;
    }

    @Override
    public int mo11420v(int i) {
        int i2 = C1357a0.m37544i(4.0f);
        int measuredWidth = ((((this.f28213N.getMeasuredWidth() - ((this.f28214O.m39597V2() + 1) * i2)) / this.f28214O.m39597V2()) + i2) * ((int) Math.ceil(mo6153D() / this.f28214O.m39597V2()))) + i2;
        return i < 0 ? measuredWidth : Math.min(i, measuredWidth);
    }

    @Override
    public void mo11472x(View view, boolean z) {
        C8765g1 g1Var = (C8765g1) view;
        C6246h image = g1Var.getImage();
        if (z || !this.f28215P.mo11218c0(image)) {
            boolean z2 = this.f28217R || this.f28223X.size() > 0;
            int f0 = m11605f0(image);
            int i = -1;
            if (f0 >= 0) {
                this.f28223X.remove(f0);
                i = f0;
                f0 = -1;
            } else if (z2) {
                f0 = this.f28223X.size();
                this.f28223X.add(image);
            }
            if (z2) {
                g1Var.m11477f(f0, true);
                AbstractC8746a aVar = this.f28215P;
                if (aVar != null) {
                    aVar.mo11193y6(this.f28223X.size(), image, f0);
                }
            } else {
                AbstractC8746a aVar2 = this.f28215P;
                if (aVar2 != null) {
                    aVar2.mo11201p2(image);
                }
            }
            m11594q0(i);
        }
    }
}
