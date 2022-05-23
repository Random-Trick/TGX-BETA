package hd;

import ae.j;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.p0;
import ce.y;
import ie.t;
import je.d;
import je.g;
import ld.b;
import ld.v;
import ob.e;
import org.drinkless.td.libcore.telegram.TdApi;
import ud.v4;
import zd.hj;

public class o1 extends a1 {
    public final boolean W;
    public final hj.q X;
    public final a[][] Y;
    public int Z;

    public class a {
        public static Rect a(a aVar) {
            throw null;
        }

        public static TdApi.PageBlockTableCell b(a aVar) {
            throw null;
        }

        public static d c(a aVar) {
            throw null;
        }

        public static int d(a aVar) {
            throw null;
        }

        public static g e(a aVar) {
            throw null;
        }
    }

    public o1(v4<?> v4Var, TdApi.PageBlockTable pageBlockTable, boolean z10, hj.q qVar) {
        super(v4Var, pageBlockTable);
        this.W = z10;
        this.X = qVar;
        this.Y = new a[pageBlockTable.cells.length];
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean B(View view, MotionEvent motionEvent) {
        a[][] aVarArr;
        for (a[] aVarArr2 : this.Y) {
            for (a aVar : aVarArr2) {
                g.c cVar = null;
                if (a.e(null) != null) {
                    g e10 = a.e(null);
                    v4<?> v4Var = this.f12692a;
                    if (v4Var instanceof g.c) {
                        cVar = (g.c) v4Var;
                    }
                    if (e10.V0(view, motionEvent, cVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void Q(b bVar) {
        a[][] aVarArr;
        int i10 = 0;
        for (a[] aVarArr2 : this.Y) {
            for (a aVar : aVarArr2) {
                if (a.e(null) != null) {
                    a.e(null).f1(bVar, i10);
                } else if (a.c(null) != null) {
                    d.c(a.c(null).f15361b, bVar, i10);
                }
                i10 += a.d(null);
            }
        }
        bVar.g(i10);
    }

    @Override
    public int g(View view, int i10) {
        a0.i(12.0f);
        q();
        a0.i(6.0f);
        return 0;
    }

    @Override
    public <T extends View & t> void j(T t10, Canvas canvas, v vVar, v vVar2, b bVar) {
        a[][] aVarArr;
        TdApi.PageBlockTable pageBlockTable = (TdApi.PageBlockTable) this.f12693b;
        for (a[] aVarArr2 : this.Y) {
            for (a aVar : aVarArr2) {
                if (a.b(null).isHeader) {
                    canvas.drawRect(a.a(null), y.g(j.b()));
                } else if (pageBlockTable.isStriped) {
                    throw null;
                }
                if (pageBlockTable.isBordered) {
                    canvas.drawRect(a.a(null), y.D0(j.M0()));
                }
                if (a.e(null) != null) {
                    p0.O(canvas);
                    canvas.clipRect(a.a(null));
                    int constructor = a.b(null).valign.getConstructor();
                    if (constructor == -2123096587) {
                        a.a(null).centerY();
                        int height = (a.e(null).getHeight() - a.e(null).d0()) / 2;
                        a.e(null);
                        int i10 = a.a(null).left;
                        throw null;
                    } else if (constructor == 195500454) {
                        int i11 = a.a(null).top;
                        throw null;
                    } else if (constructor != 2092531158) {
                        throw null;
                    } else {
                        int i12 = a.a(null).bottom;
                        throw null;
                    }
                } else {
                    a.d(null);
                }
            }
        }
    }

    @Override
    public int p() {
        return this.Z;
    }

    @Override
    public int q() {
        return a0.i(e.d1(((TdApi.PageBlockTable) this.f12693b).caption) ? 6.0f : 2.0f);
    }

    @Override
    public int y() {
        return 111;
    }
}
