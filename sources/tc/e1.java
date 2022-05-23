package tc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import java.util.ArrayList;
import java.util.Iterator;
import ld.h;
import oc.v0;
import org.thunderdog.challegram.R;
import tc.g1;

public class e1 extends RecyclerView.h<b> implements View.OnClickListener, View.OnLongClickListener, f, g1.a {
    public final Context M;
    public final RecyclerView N;
    public final GridLayoutManager O;
    public final a P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public boolean U;
    public boolean V;
    public ArrayList<h> W;
    public final ArrayList<h> X;
    public ArrayList<h> Y;

    public interface a {
        boolean R4(h hVar);

        void S6(h hVar);

        void V4();

        void p0(int i10, h hVar, int i11);
    }

    public static class b extends RecyclerView.c0 {
        public b(View view) {
            super(view);
        }

        public static b P(Context context, int i10, g1.a aVar, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
            if (i10 == 1) {
                g1 g1Var = new g1(context);
                g1Var.setClickListener(aVar);
                g1Var.setOnLongClickListener(onLongClickListener);
                return new b(g1Var);
            } else if (i10 == 2) {
                f1 f1Var = new f1(context);
                f1Var.setOnClickListener(onClickListener);
                f1Var.setOnLongClickListener(onLongClickListener);
                b bVar = new b(f1Var);
                bVar.I(false);
                return bVar;
            } else {
                throw new IllegalArgumentException("viewType == " + i10);
            }
        }

        public final void O() {
            int n10 = n();
            if (n10 == 1) {
                ((g1) this.f2982a).c();
            } else if (n10 == 2) {
                ((f1) this.f2982a).e();
            }
        }

        public final void Q() {
            int n10 = n();
            if (n10 == 1) {
                ((g1) this.f2982a).d();
            } else if (n10 == 2) {
                ((f1) this.f2982a).b();
            }
        }

        public void R(boolean z10) {
            ((g1) this.f2982a).setAnimationsDisabled(z10);
        }

        public void S(int i10) {
        }

        public void T(h hVar, int i10, boolean z10, boolean z11) {
            ((g1) this.f2982a).h(hVar, i10, z10);
            ((g1) this.f2982a).i(!z11, false);
        }
    }

    public e1(Context context, RecyclerView recyclerView, GridLayoutManager gridLayoutManager, a aVar, int i10) {
        this.M = context;
        this.N = recyclerView;
        this.O = gridLayoutManager;
        this.P = aVar;
        boolean z10 = true;
        boolean z11 = (i10 & 1) != 0;
        this.Q = z11;
        this.R = z11 && (i10 & 2) != 0;
        this.S = (i10 & 4) == 0 ? false : z10;
        this.T = false;
        this.V = false;
        this.X = new ArrayList<>();
    }

    @Override
    public int D() {
        ArrayList<h> arrayList = this.W;
        return ((arrayList == null || arrayList.isEmpty()) ? 0 : this.W.size() + (this.S ? 1 : 0)) + (this.V ? 1 : 0);
    }

    @Override
    public int F(int i10) {
        if (this.V) {
            i10--;
            if (i10 == 0) {
                return 2;
            }
        }
        return i10 == this.W.size() ? 4 : 1;
    }

    public void a0(GridLayoutManager gridLayoutManager) {
        ArrayList<h> arrayList = this.W;
        if (!(arrayList == null || arrayList.isEmpty())) {
            this.X.clear();
            int X1 = gridLayoutManager.X1();
            int a22 = gridLayoutManager.a2();
            for (int i10 = X1; i10 <= a22; i10++) {
                View C = gridLayoutManager.C(i10);
                if (C != null && (C instanceof g1)) {
                    ((g1) C).f(-1, true);
                }
            }
            if (X1 > 0) {
                L(0, X1);
            }
            boolean z10 = this.V;
            int size = (z10 ? 1 : 0) + this.W.size();
            if (a22 < size) {
                L(a22, size - a22);
            }
        }
    }

    public View b0(h hVar, LinearLayoutManager linearLayoutManager) {
        int f02 = f0(hVar);
        if (f02 != -1) {
            return linearLayoutManager.C(f02 + (this.V ? 1 : 0));
        }
        return null;
    }

    public int c0() {
        return this.X.size();
    }

    public ArrayList<h> d0(boolean z10) {
        if (this.X.size() == 0) {
            return null;
        }
        if (!z10) {
            return this.X;
        }
        ArrayList<h> arrayList = new ArrayList<>(this.X.size());
        arrayList.addAll(this.X);
        return arrayList;
    }

    public int e0(h hVar) {
        if (!this.Q || this.X.size() <= 0) {
            return -1;
        }
        return this.X.indexOf(hVar);
    }

    public final int f0(h hVar) {
        ArrayList<h> arrayList = this.W;
        if (arrayList == null) {
            return -1;
        }
        int i10 = 0;
        Iterator<h> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next() == hVar) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final boolean g0(h hVar) {
        ArrayList<h> arrayList = this.Y;
        if (arrayList == null || arrayList.isEmpty()) {
            return true;
        }
        Iterator<h> it = this.Y.iterator();
        while (it.hasNext()) {
            if (it.next() == hVar) {
                return false;
            }
        }
        return true;
    }

    public void Q(b bVar, int i10) {
        int n10 = bVar.n();
        if (n10 == 1) {
            ArrayList<h> arrayList = this.W;
            if (this.V) {
                i10--;
            }
            h hVar = arrayList.get(i10);
            bVar.T(hVar, e0(hVar), this.Q, g0(hVar));
            bVar.R(!this.U);
        } else if (n10 == 4) {
            bVar.S(this.W.size());
        }
    }

    public b S(ViewGroup viewGroup, int i10) {
        return b.P(this.M, i10, this, this, this.Q ? this : null);
    }

    public void V(b bVar) {
        bVar.O();
    }

    public void W(b bVar) {
        bVar.Q();
    }

    public void l0(boolean z10, LinearLayoutManager linearLayoutManager) {
        if (this.U != z10) {
            this.U = true;
            int X1 = linearLayoutManager.X1();
            int a22 = linearLayoutManager.a2();
            for (int i10 = X1; i10 <= a22; i10++) {
                View C = linearLayoutManager.C(i10);
                if (C != null && (C instanceof g1)) {
                    ((g1) C).setAnimationsDisabled(!z10);
                }
            }
            ?? r72 = this.V;
            if (X1 > r72) {
                L(r72 == true ? 1 : 0, X1);
            }
            int D = D() - 1;
            if (a22 < D) {
                L(a22 + 1, D - a22);
            }
        }
    }

    public void m0(h hVar, boolean z10, RecyclerView.p pVar) {
        if (z10 != g0(hVar)) {
            if (z10) {
                int size = this.Y.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    } else if (this.Y.get(i10) == hVar) {
                        this.Y.remove(i10);
                        break;
                    } else {
                        i10++;
                    }
                }
            } else {
                if (this.Y == null) {
                    this.Y = new ArrayList<>();
                }
                this.Y.add(hVar);
            }
            int f02 = f0(hVar);
            if (f02 != -1) {
                int i11 = f02 + (this.V ? 1 : 0);
                View C = pVar.C(i11);
                if (C != null) {
                    ((g1) C).i(!z10, true);
                } else {
                    I(i11);
                }
            }
        }
    }

    public void n0(ArrayList<h> arrayList, boolean z10) {
        int D = D();
        this.W = arrayList;
        boolean z11 = this.V;
        int i10 = 1;
        boolean z12 = this.T && z10;
        this.V = z12;
        if (!z12 || !z11) {
            i10 = 0;
        }
        v0.l2(this, D, i10);
    }

    public void o0(h hVar, boolean z10) {
        int i10;
        int i11;
        if (z10) {
            i10 = this.X.size();
            this.X.add(hVar);
            i11 = -1;
        } else {
            int indexOf = this.X.indexOf(hVar);
            if (indexOf != -1) {
                this.X.remove(indexOf);
            }
            i11 = indexOf;
            i10 = -1;
        }
        a aVar = this.P;
        if (aVar != null) {
            aVar.p0(this.X.size(), hVar, i10);
        }
        int f02 = f0(hVar);
        if (f02 != -1) {
            int i12 = f02 + (this.V ? 1 : 0);
            View C = this.O.C(i12);
            if (C != null) {
                ((g1) C).f(i10, false);
            } else {
                I(i12);
            }
        }
        p0(i11);
    }

    @Override
    public void onClick(View view) {
        a aVar;
        if (view.getId() == R.id.btn_camera && (aVar = this.P) != null) {
            aVar.V4();
        }
    }

    @Override
    public boolean onLongClick(View view) {
        if (view.getId() == R.id.btn_camera) {
            return false;
        }
        g1 g1Var = (g1) view;
        h image = g1Var.getImage();
        int e02 = e0(image);
        int i10 = -1;
        if (e02 >= 0) {
            this.X.remove(e02);
        } else {
            i10 = this.X.size();
            this.X.add(image);
            e02 = -1;
        }
        g1Var.f(i10, true);
        a aVar = this.P;
        if (aVar != null) {
            aVar.p0(this.X.size(), image, i10);
        }
        p0(e02);
        return true;
    }

    public final void p0(int i10) {
        View C;
        int size = this.X.size();
        if (i10 >= 0 && i10 < size) {
            int X1 = this.O.X1();
            int a22 = this.O.a2();
            while (i10 < size) {
                int f02 = f0(this.X.get(i10));
                if (f02 != -1) {
                    if (this.V) {
                        f02++;
                    }
                    if (X1 == -1 || a22 == -1 || f02 < X1 || f02 > a22 || (C = this.O.C(f02)) == null) {
                        I(f02);
                    } else {
                        ((g1) C).setSelectionIndex(i10);
                    }
                }
                i10++;
            }
        }
    }

    @Override
    public int s(int i10) {
        int i11 = a0.i(4.0f);
        int V2 = this.O.V2();
        int measuredWidth = (this.N.getMeasuredWidth() - ((this.O.V2() + 1) * i11)) / V2;
        GridLayoutManager gridLayoutManager = this.O;
        View C = gridLayoutManager.C(gridLayoutManager.X1());
        if (C != null) {
            measuredWidth = C.getMeasuredWidth();
        }
        return ((measuredWidth + i11) * ((int) Math.floor(i10 / V2))) + i11;
    }

    @Override
    public int v(int i10) {
        int i11 = a0.i(4.0f);
        int measuredWidth = ((((this.N.getMeasuredWidth() - ((this.O.V2() + 1) * i11)) / this.O.V2()) + i11) * ((int) Math.ceil(D() / this.O.V2()))) + i11;
        return i10 < 0 ? measuredWidth : Math.min(i10, measuredWidth);
    }

    @Override
    public void y(View view, boolean z10) {
        g1 g1Var = (g1) view;
        h image = g1Var.getImage();
        if (z10 || !this.P.R4(image)) {
            boolean z11 = this.R || this.X.size() > 0;
            int e02 = e0(image);
            int i10 = -1;
            if (e02 >= 0) {
                this.X.remove(e02);
                i10 = e02;
                e02 = -1;
            } else if (z11) {
                e02 = this.X.size();
                this.X.add(image);
            }
            if (z11) {
                g1Var.f(e02, true);
                a aVar = this.P;
                if (aVar != null) {
                    aVar.p0(this.X.size(), image, e02);
                }
            } else {
                a aVar2 = this.P;
                if (aVar2 != null) {
                    aVar2.S6(image);
                }
            }
            p0(i10);
        }
    }
}
