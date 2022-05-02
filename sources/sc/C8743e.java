package sc;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1410y;
import p082fd.C4403w;
import p108hb.C5064d;
import p364zd.C11524j;

public class C8743e extends RecyclerView.AbstractC0901o {
    public int f28202a;
    public int f28203b;
    public boolean f28204c;
    public boolean f28205d;
    public boolean f28206e;
    public boolean f28207f;
    public int f28208g;
    public int f28209h;
    public GridLayoutManager.AbstractC0873b f28210i;

    public C8743e(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.f28202a = i;
        this.f28203b = i2;
        this.f28204c = z;
        this.f28205d = z2;
        this.f28206e = z3;
    }

    @Override
    public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
        int i;
        int i2;
        int k0 = recyclerView.m39424k0(view);
        int D = recyclerView.getAdapter().mo6153D();
        GridLayoutManager.AbstractC0873b bVar = this.f28210i;
        if (bVar != null) {
            if (bVar.mo7528f(k0) == 1) {
                i2 = this.f28210i.mo39580e(k0, this.f28202a);
                int i3 = k0 - 1;
                i = k0;
                while (i3 >= 0) {
                    int i4 = i3 + 1;
                    if (this.f28210i.mo7528f(i3) == 1) {
                        break;
                    }
                    i--;
                    if (i < 0 || i4 == D) {
                        rect.setEmpty();
                        return;
                    }
                    i3 = i4;
                }
            } else {
                rect.setEmpty();
                return;
            }
        } else {
            i2 = k0 % this.f28202a;
            i = k0;
        }
        if (this.f28206e && C4403w.m27986G2()) {
            i2 = (this.f28202a - i2) - 1;
        }
        int i5 = 0;
        if (this.f28204c) {
            int i6 = this.f28203b;
            int i7 = this.f28202a;
            rect.left = i6 - ((i2 * i6) / i7);
            rect.right = ((i2 + 1) * i6) / i7;
            if (this.f28205d) {
                if (i < i7) {
                    rect.top = i6;
                }
                rect.bottom = i6;
            } else if (this.f28210i != null) {
                rect.top = 0;
                int D2 = recyclerView.getAdapter().mo6153D();
                if (k0 < D2 - this.f28202a) {
                    rect.bottom = 0;
                    return;
                }
                int i8 = D2 - 1;
                while (i8 > D2 - this.f28202a && this.f28210i.mo7528f(i8) == 0) {
                    i8--;
                }
                if (k0 >= i8) {
                    i5 = this.f28203b;
                }
                rect.bottom = i5;
            }
        } else {
            int i9 = this.f28203b;
            int i10 = this.f28202a;
            rect.left = (i2 * i9) / i10;
            rect.right = i9 - (((i2 + 1) * i9) / i10);
            if (this.f28205d) {
                if (i >= i10 || this.f28210i != null) {
                    rect.top = i9;
                }
                GridLayoutManager.AbstractC0873b bVar2 = this.f28210i;
                if (bVar2 == null) {
                    return;
                }
                if (bVar2.mo7528f(Math.min(D - 1, k0 + (i10 - i2))) != 1) {
                    rect.bottom = this.f28203b;
                } else {
                    rect.bottom = 0;
                }
            } else {
                rect.bottom = 0;
                rect.top = 0;
            }
        }
    }

    @Override
    public void mo8191i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
        if (this.f28207f) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int X1 = linearLayoutManager.m39552X1();
            int a2 = linearLayoutManager.m39549a2();
            if (X1 != -1 && a2 != -1) {
                int N = C11524j.m228N(this.f28209h);
                int measuredWidth = recyclerView.getMeasuredWidth();
                View view = null;
                int i = 0;
                boolean z = false;
                int i2 = 0;
                float f = 0.0f;
                while (X1 <= a2) {
                    view = linearLayoutManager.mo39265C(X1);
                    RecyclerView.AbstractC0886d0 l0 = recyclerView.m39421l0(view);
                    if (l0 != null) {
                        if (l0.m39335n() == this.f28208g) {
                            if (!z) {
                                i2 = view.getTop() - linearLayoutManager.m39195n0(view);
                                z = true;
                            }
                            f = Math.max(view.getAlpha(), f);
                        } else if (z) {
                            if (i2 != view.getTop() && f > 0.0f) {
                                canvas.drawRect(0.0f, i2, measuredWidth, view.getTop(), C1410y.m37042g(C5064d.m24131b((int) (Color.alpha(N) * f), N)));
                            }
                            z = false;
                            i2 = 0;
                            f = 0.0f;
                        }
                    }
                    X1++;
                }
                if (view != null) {
                    i = view.getTop() + view.getMeasuredHeight() + linearLayoutManager.m39257H(view);
                }
                if (z && i2 != i && f != 0.0f) {
                    canvas.drawRect(0.0f, i2, measuredWidth, i, C1410y.m37042g(C5064d.m24131b((int) (Color.alpha(N) * f), N)));
                }
            }
        }
    }

    public void m11613l(int i) {
        this.f28209h = i;
    }

    public void m11612m(boolean z, int i) {
        this.f28207f = z;
        this.f28208g = i;
    }

    public void m11611n(int i) {
        if (this.f28202a != i) {
            this.f28202a = i;
        }
    }

    public void m11610o(GridLayoutManager.AbstractC0873b bVar) {
        this.f28210i = bVar;
    }
}
