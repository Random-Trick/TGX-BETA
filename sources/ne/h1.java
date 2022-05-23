package ne;

import ae.j;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.y;
import java.util.ArrayList;
import java.util.Iterator;
import org.thunderdog.challegram.R;
import ud.v4;

public class h1 extends RecyclerView.o {
    public final ArrayList<int[]> f18075a = new ArrayList<>();
    public int f18076b = R.id.theme_color_filling;
    public int f18077c = -1;
    public int f18078d = -1;

    public h1(RecyclerView recyclerView, v4<?> v4Var) {
        if (v4Var != null) {
            v4Var.t8(recyclerView);
        }
    }

    @Override
    public final void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        View view;
        boolean z10;
        int i10;
        int i11;
        int i12;
        View view2;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int X1 = linearLayoutManager.X1();
        int a22 = linearLayoutManager.a2();
        int i13 = -1;
        if (X1 != -1 && a22 != -1) {
            boolean z11 = (this.f18077c == -1 || this.f18078d == -1) ? false : true;
            View view3 = null;
            boolean z12 = false;
            int i14 = 0;
            int i15 = 0;
            int i16 = -1;
            int i17 = -1;
            while (i14 <= a22) {
                View C = linearLayoutManager.C(i14);
                int p10 = C != null ? p(i14, C) : 0;
                if (p10 == 0 && C == null && z11 && i14 < this.f18078d && !z12) {
                    p10 = j.L(this.f18076b);
                }
                if (!z11 || p10 == 0 || C == null || C.getId() != this.f18077c) {
                    z10 = z12;
                    i10 = p10;
                } else {
                    i10 = 0;
                    z10 = true;
                }
                if (i10 != i15) {
                    if (i15 != 0) {
                        i12 = i10;
                        view2 = C;
                        i11 = i14;
                        o(canvas, recyclerView, C, i16, i17, i15);
                    } else {
                        i12 = i10;
                        view2 = C;
                        i11 = i14;
                    }
                    if (i12 != 0) {
                        i16 = view2 != null ? (int) (linearLayoutManager.U(view2) + view2.getTranslationY()) : i17;
                    }
                    i15 = i12;
                } else {
                    i12 = i10;
                    view2 = C;
                    i11 = i14;
                }
                if (i12 != 0) {
                    i17 = view2 != null ? (int) (linearLayoutManager.O(view2) + view2.getTranslationY()) : recyclerView.getMeasuredHeight();
                }
                i14 = i11 + 1;
                view3 = view2;
                z12 = z10;
            }
            if (i15 != 0) {
                o(canvas, recyclerView, view3, i16, i17, i15);
            }
            if (r()) {
                int i18 = 0;
                while (i18 < recyclerView.getChildCount()) {
                    View childAt = recyclerView.getChildAt(i18);
                    int k02 = childAt != null ? recyclerView.k0(childAt) : -1;
                    if (childAt != null && k02 == i13) {
                        int p11 = p(k02, childAt);
                        if (p11 != 0) {
                            view = childAt;
                            o(canvas, recyclerView, childAt, linearLayoutManager.U(childAt) + ((int) childAt.getTranslationY()), linearLayoutManager.O(childAt) + ((int) childAt.getTranslationY()), p11);
                        } else {
                            view = childAt;
                        }
                        n(canvas, recyclerView, zVar, view);
                    }
                    i18++;
                    i13 = -1;
                }
                while (X1 <= a22) {
                    View C2 = linearLayoutManager.C(X1);
                    if (C2 != null) {
                        n(canvas, recyclerView, zVar, C2);
                    }
                    X1++;
                }
            }
        }
    }

    public h1 l(int i10, int i11) {
        this.f18077c = i10;
        this.f18078d = i11;
        return this;
    }

    public h1 m(int i10, int i11) {
        this.f18075a.add(new int[]{i10, i11});
        return this;
    }

    public void n(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar, View view) {
    }

    public final void o(Canvas canvas, RecyclerView recyclerView, View view, int i10, int i11, int i12) {
        if (view instanceof f3) {
            i11 += ((f3) view).getShadowTop();
        }
        canvas.drawRect(0.0f, Math.max(0, i10), recyclerView.getMeasuredWidth(), Math.min(recyclerView.getMeasuredHeight(), i11), y.g(i12));
    }

    public int p(int i10, View view) {
        Iterator<int[]> it = this.f18075a.iterator();
        while (it.hasNext()) {
            int[] next = it.next();
            if (i10 >= next[0] && i10 < next[1]) {
                return j.L(this.f18076b);
            }
        }
        return 0;
    }

    public int[] q() {
        ArrayList<int[]> arrayList = this.f18075a;
        return arrayList.get(arrayList.size() - 1);
    }

    public boolean r() {
        return false;
    }

    public int[] s(int i10) {
        return this.f18075a.get(i10);
    }

    public int[] t() {
        ArrayList<int[]> arrayList = this.f18075a;
        return arrayList.remove(arrayList.size() - 1);
    }
}
