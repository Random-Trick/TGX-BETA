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
    public int f28199a;
    public int f28200b;
    public boolean f28201c;
    public boolean f28202d;
    public boolean f28203e;
    public boolean f28204f;
    public int f28205g;
    public int f28206h;
    public GridLayoutManager.AbstractC0873b f28207i;

    public C8743e(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.f28199a = i;
        this.f28200b = i2;
        this.f28201c = z;
        this.f28202d = z2;
        this.f28203e = z3;
    }

    @Override
    public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
        int i;
        int i2;
        int k0 = recyclerView.m39421k0(view);
        int D = recyclerView.getAdapter().mo6153D();
        GridLayoutManager.AbstractC0873b bVar = this.f28207i;
        if (bVar != null) {
            if (bVar.mo7528f(k0) == 1) {
                i2 = this.f28207i.mo39577e(k0, this.f28199a);
                int i3 = k0 - 1;
                i = k0;
                while (i3 >= 0) {
                    int i4 = i3 + 1;
                    if (this.f28207i.mo7528f(i3) == 1) {
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
            i2 = k0 % this.f28199a;
            i = k0;
        }
        if (this.f28203e && C4403w.m27984G2()) {
            i2 = (this.f28199a - i2) - 1;
        }
        int i5 = 0;
        if (this.f28201c) {
            int i6 = this.f28200b;
            int i7 = this.f28199a;
            rect.left = i6 - ((i2 * i6) / i7);
            rect.right = ((i2 + 1) * i6) / i7;
            if (this.f28202d) {
                if (i < i7) {
                    rect.top = i6;
                }
                rect.bottom = i6;
            } else if (this.f28207i != null) {
                rect.top = 0;
                int D2 = recyclerView.getAdapter().mo6153D();
                if (k0 < D2 - this.f28199a) {
                    rect.bottom = 0;
                    return;
                }
                int i8 = D2 - 1;
                while (i8 > D2 - this.f28199a && this.f28207i.mo7528f(i8) == 0) {
                    i8--;
                }
                if (k0 >= i8) {
                    i5 = this.f28200b;
                }
                rect.bottom = i5;
            }
        } else {
            int i9 = this.f28200b;
            int i10 = this.f28199a;
            rect.left = (i2 * i9) / i10;
            rect.right = i9 - (((i2 + 1) * i9) / i10);
            if (this.f28202d) {
                if (i >= i10 || this.f28207i != null) {
                    rect.top = i9;
                }
                GridLayoutManager.AbstractC0873b bVar2 = this.f28207i;
                if (bVar2 == null) {
                    return;
                }
                if (bVar2.mo7528f(Math.min(D - 1, k0 + (i10 - i2))) != 1) {
                    rect.bottom = this.f28200b;
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
        if (this.f28204f) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int X1 = linearLayoutManager.m39549X1();
            int a2 = linearLayoutManager.m39546a2();
            if (X1 != -1 && a2 != -1) {
                int N = C11524j.m228N(this.f28206h);
                int measuredWidth = recyclerView.getMeasuredWidth();
                View view = null;
                int i = 0;
                boolean z = false;
                int i2 = 0;
                float f = 0.0f;
                while (X1 <= a2) {
                    view = linearLayoutManager.mo39262C(X1);
                    RecyclerView.AbstractC0886d0 l0 = recyclerView.m39418l0(view);
                    if (l0 != null) {
                        if (l0.m39332n() == this.f28205g) {
                            if (!z) {
                                i2 = view.getTop() - linearLayoutManager.m39192n0(view);
                                z = true;
                            }
                            f = Math.max(view.getAlpha(), f);
                        } else if (z) {
                            if (i2 != view.getTop() && f > 0.0f) {
                                canvas.drawRect(0.0f, i2, measuredWidth, view.getTop(), C1410y.m37039g(C5064d.m24130b((int) (Color.alpha(N) * f), N)));
                            }
                            z = false;
                            i2 = 0;
                            f = 0.0f;
                        }
                    }
                    X1++;
                }
                if (view != null) {
                    i = view.getTop() + view.getMeasuredHeight() + linearLayoutManager.m39254H(view);
                }
                if (z && i2 != i && f != 0.0f) {
                    canvas.drawRect(0.0f, i2, measuredWidth, i, C1410y.m37039g(C5064d.m24130b((int) (Color.alpha(N) * f), N)));
                }
            }
        }
    }

    public void m11614l(int i) {
        this.f28206h = i;
    }

    public void m11613m(boolean z, int i) {
        this.f28204f = z;
        this.f28205g = i;
    }

    public void m11612n(int i) {
        if (this.f28199a != i) {
            this.f28199a = i;
        }
    }

    public void m11611o(GridLayoutManager.AbstractC0873b bVar) {
        this.f28207i = bVar;
    }
}
