package me;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1410y;
import java.util.ArrayList;
import java.util.Iterator;
import org.thunderdog.challegram.R;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class C6897h1 extends RecyclerView.AbstractC0901o {
    public final ArrayList<int[]> f21790a = new ArrayList<>();
    public int f21791b = R.id.theme_color_filling;
    public int f21792c = -1;
    public int f21793d = -1;

    public C6897h1(RecyclerView recyclerView, AbstractC9323v4<?> v4Var) {
        if (v4Var != null) {
            v4Var.m9163t8(recyclerView);
        }
    }

    @Override
    public final void mo8191i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
        View view;
        boolean z;
        int i;
        int i2;
        int i3;
        View view2;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int X1 = linearLayoutManager.m39549X1();
        int a2 = linearLayoutManager.m39546a2();
        int i4 = -1;
        if (X1 != -1 && a2 != -1) {
            boolean z2 = (this.f21792c == -1 || this.f21793d == -1) ? false : true;
            View view3 = null;
            boolean z3 = false;
            int i5 = 0;
            int i6 = 0;
            int i7 = -1;
            int i8 = -1;
            while (i5 <= a2) {
                View C = linearLayoutManager.mo39262C(i5);
                int p = C != null ? mo18528p(i5, C) : 0;
                if (p == 0 && C == null && z2 && i5 < this.f21793d && !z3) {
                    p = C11524j.m228N(this.f21791b);
                }
                if (!z2 || p == 0 || C == null || C.getId() != this.f21792c) {
                    z = z3;
                    i = p;
                } else {
                    i = 0;
                    z = true;
                }
                if (i != i6) {
                    if (i6 != 0) {
                        i3 = i;
                        view2 = C;
                        i2 = i5;
                        m18529o(canvas, recyclerView, C, i7, i8, i6);
                    } else {
                        i3 = i;
                        view2 = C;
                        i2 = i5;
                    }
                    if (i3 != 0) {
                        i7 = view2 != null ? (int) (linearLayoutManager.m39231U(view2) + view2.getTranslationY()) : i8;
                    }
                    i6 = i3;
                } else {
                    i3 = i;
                    view2 = C;
                    i2 = i5;
                }
                if (i3 != 0) {
                    i8 = view2 != null ? (int) (linearLayoutManager.m39241O(view2) + view2.getTranslationY()) : recyclerView.getMeasuredHeight();
                }
                i5 = i2 + 1;
                view3 = view2;
                z3 = z;
            }
            if (i6 != 0) {
                m18529o(canvas, recyclerView, view3, i7, i8, i6);
            }
            if (mo18526r()) {
                int i9 = 0;
                while (i9 < recyclerView.getChildCount()) {
                    View childAt = recyclerView.getChildAt(i9);
                    int k0 = childAt != null ? recyclerView.m39421k0(childAt) : -1;
                    if (childAt != null && k0 == i4) {
                        int p2 = mo18528p(k0, childAt);
                        if (p2 != 0) {
                            view = childAt;
                            m18529o(canvas, recyclerView, childAt, linearLayoutManager.m39231U(childAt) + ((int) childAt.getTranslationY()), linearLayoutManager.m39241O(childAt) + ((int) childAt.getTranslationY()), p2);
                        } else {
                            view = childAt;
                        }
                        mo18530n(canvas, recyclerView, a0Var, view);
                    }
                    i9++;
                    i4 = -1;
                }
                while (X1 <= a2) {
                    View C2 = linearLayoutManager.mo39262C(X1);
                    if (C2 != null) {
                        mo18530n(canvas, recyclerView, a0Var, C2);
                    }
                    X1++;
                }
            }
        }
    }

    public C6897h1 m18532l(int i, int i2) {
        this.f21792c = i;
        this.f21793d = i2;
        return this;
    }

    public C6897h1 m18531m(int i, int i2) {
        this.f21790a.add(new int[]{i, i2});
        return this;
    }

    public void mo18530n(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var, View view) {
    }

    public final void m18529o(Canvas canvas, RecyclerView recyclerView, View view, int i, int i2, int i3) {
        if (view instanceof C6879f3) {
            i2 += ((C6879f3) view).getShadowTop();
        }
        canvas.drawRect(0.0f, Math.max(0, i), recyclerView.getMeasuredWidth(), Math.min(recyclerView.getMeasuredHeight(), i2), C1410y.m37039g(i3));
    }

    public int mo18528p(int i, View view) {
        Iterator<int[]> it = this.f21790a.iterator();
        while (it.hasNext()) {
            int[] next = it.next();
            if (i >= next[0] && i < next[1]) {
                return C11524j.m228N(this.f21791b);
            }
        }
        return 0;
    }

    public int[] m18527q() {
        ArrayList<int[]> arrayList = this.f21790a;
        return arrayList.get(arrayList.size() - 1);
    }

    public boolean mo18526r() {
        return false;
    }

    public int[] m18525s(int i) {
        return this.f21790a.get(i);
    }

    public int[] m18524t() {
        ArrayList<int[]> arrayList = this.f21790a;
        return arrayList.remove(arrayList.size() - 1);
    }
}
