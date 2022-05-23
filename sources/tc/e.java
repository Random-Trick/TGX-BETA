package tc;

import ae.j;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.y;
import gd.w;
import ib.d;

public class e extends RecyclerView.o {
    public int f23119a;
    public int f23120b;
    public boolean f23121c;
    public boolean f23122d;
    public boolean f23123e;
    public boolean f23124f;
    public int f23125g;
    public int f23126h;
    public GridLayoutManager.b f23127i;

    public e(int i10, int i11, boolean z10, boolean z11, boolean z12) {
        this.f23119a = i10;
        this.f23120b = i11;
        this.f23121c = z10;
        this.f23122d = z11;
        this.f23123e = z12;
    }

    @Override
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        int i10;
        int i11;
        int k02 = recyclerView.k0(view);
        int D = recyclerView.getAdapter().D();
        GridLayoutManager.b bVar = this.f23127i;
        if (bVar != null) {
            if (bVar.f(k02) == 1) {
                i11 = this.f23127i.e(k02, this.f23119a);
                int i12 = k02 - 1;
                i10 = k02;
                while (i12 >= 0) {
                    int i13 = i12 + 1;
                    if (this.f23127i.f(i12) == 1) {
                        break;
                    }
                    i10--;
                    if (i10 < 0 || i13 == D) {
                        rect.setEmpty();
                        return;
                    }
                    i12 = i13;
                }
            } else {
                rect.setEmpty();
                return;
            }
        } else {
            i11 = k02 % this.f23119a;
            i10 = k02;
        }
        if (this.f23123e && w.G2()) {
            i11 = (this.f23119a - i11) - 1;
        }
        int i14 = 0;
        if (this.f23121c) {
            int i15 = this.f23120b;
            int i16 = this.f23119a;
            rect.left = i15 - ((i11 * i15) / i16);
            rect.right = ((i11 + 1) * i15) / i16;
            if (this.f23122d) {
                if (i10 < i16) {
                    rect.top = i15;
                }
                rect.bottom = i15;
            } else if (this.f23127i != null) {
                rect.top = 0;
                int D2 = recyclerView.getAdapter().D();
                if (k02 < D2 - this.f23119a) {
                    rect.bottom = 0;
                    return;
                }
                int i17 = D2 - 1;
                while (i17 > D2 - this.f23119a && this.f23127i.f(i17) == 0) {
                    i17--;
                }
                if (k02 >= i17) {
                    i14 = this.f23120b;
                }
                rect.bottom = i14;
            }
        } else {
            int i18 = this.f23120b;
            int i19 = this.f23119a;
            rect.left = (i11 * i18) / i19;
            rect.right = i18 - (((i11 + 1) * i18) / i19);
            if (this.f23122d) {
                if (i10 >= i19 || this.f23127i != null) {
                    rect.top = i18;
                }
                GridLayoutManager.b bVar2 = this.f23127i;
                if (bVar2 == null) {
                    return;
                }
                if (bVar2.f(Math.min(D - 1, k02 + (i19 - i11))) != 1) {
                    rect.bottom = this.f23120b;
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
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        if (this.f23124f) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int X1 = linearLayoutManager.X1();
            int a22 = linearLayoutManager.a2();
            if (X1 != -1 && a22 != -1) {
                int L = j.L(this.f23126h);
                int measuredWidth = recyclerView.getMeasuredWidth();
                View view = null;
                int i10 = 0;
                boolean z10 = false;
                int i11 = 0;
                float f10 = 0.0f;
                while (X1 <= a22) {
                    view = linearLayoutManager.C(X1);
                    RecyclerView.c0 l02 = recyclerView.l0(view);
                    if (l02 != null) {
                        if (l02.n() == this.f23125g) {
                            if (!z10) {
                                i11 = view.getTop() - linearLayoutManager.n0(view);
                                z10 = true;
                            }
                            f10 = Math.max(view.getAlpha(), f10);
                        } else if (z10) {
                            if (i11 != view.getTop() && f10 > 0.0f) {
                                canvas.drawRect(0.0f, i11, measuredWidth, view.getTop(), y.g(d.b((int) (Color.alpha(L) * f10), L)));
                            }
                            z10 = false;
                            i11 = 0;
                            f10 = 0.0f;
                        }
                    }
                    X1++;
                }
                if (view != null) {
                    i10 = view.getTop() + view.getMeasuredHeight() + linearLayoutManager.H(view);
                }
                if (z10 && i11 != i10 && f10 != 0.0f) {
                    canvas.drawRect(0.0f, i11, measuredWidth, i10, y.g(d.b((int) (Color.alpha(L) * f10), L)));
                }
            }
        }
    }

    public void l(int i10) {
        this.f23126h = i10;
    }

    public void m(boolean z10, int i10) {
        this.f23124f = z10;
        this.f23125g = i10;
    }

    public void n(int i10) {
        if (this.f23119a != i10) {
            this.f23119a = i10;
        }
    }

    public void o(GridLayoutManager.b bVar) {
        this.f23127i = bVar;
    }
}
