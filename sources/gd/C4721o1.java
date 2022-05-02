package gd;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1399s0;
import be.C1410y;
import ie.C5384d;
import ie.RunnableC5390g;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p111he.AbstractC5143t;
import p156kd.AbstractC6264v;
import p156kd.C6238b;
import p193nb.C7321e;
import p350yd.HandlerC10770jj;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class C4721o1 extends AbstractC4576a1 {
    public final boolean f15907W;
    public final HandlerC10770jj.C10788q f15908X;
    public final C4722a[][] f15909Y;
    public int f15910Z;

    public class C4722a {
        public static Rect m26318a(C4722a aVar) {
            throw null;
        }

        public static TdApi.PageBlockTableCell m26317b(C4722a aVar) {
            throw null;
        }

        public static C5384d m26316c(C4722a aVar) {
            throw null;
        }

        public static int m26315d(C4722a aVar) {
            throw null;
        }

        public static RunnableC5390g m26314e(C4722a aVar) {
            throw null;
        }
    }

    public C4721o1(AbstractC9323v4<?> v4Var, TdApi.PageBlockTable pageBlockTable, boolean z, HandlerC10770jj.C10788q qVar) {
        super(v4Var, pageBlockTable);
        this.f15907W = z;
        this.f15908X = qVar;
        this.f15909Y = new C4722a[pageBlockTable.cells.length];
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean mo26325C(View view, MotionEvent motionEvent) {
        C4722a[][] aVarArr;
        for (C4722a[] aVarArr2 : this.f15909Y) {
            for (C4722a aVar : aVarArr2) {
                if (C4722a.m26314e(aVar) != null) {
                    RunnableC5390g e = C4722a.m26314e(aVar);
                    AbstractC9323v4<?> v4Var = this.f15036a;
                    if (e.m22965V0(view, motionEvent, v4Var instanceof RunnableC5390g.AbstractC5393c ? (RunnableC5390g.AbstractC5393c) v4Var : null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void mo26324R(C6238b bVar) {
        C4722a[][] aVarArr;
        int i = 0;
        for (C4722a[] aVarArr2 : this.f15909Y) {
            for (C4722a aVar : aVarArr2) {
                if (C4722a.m26314e(aVar) != null) {
                    C4722a.m26314e(aVar).m22940f1(bVar, i);
                } else if (C4722a.m26316c(aVar) != null) {
                    C5384d.m23009c(C4722a.m26316c(aVar).f17709b, bVar, i);
                }
                i += C4722a.m26315d(aVar);
            }
        }
        bVar.m20996g(i);
    }

    @Override
    public int mo26323f(View view, int i) {
        C1357a0.m37541i(12.0f);
        mo26320q();
        C1357a0.m37541i(6.0f);
        return 0;
    }

    @Override
    public <T extends View & AbstractC5143t> void mo26322i(T t, Canvas canvas, AbstractC6264v vVar, AbstractC6264v vVar2, C6238b bVar) {
        C4722a[][] aVarArr;
        TdApi.PageBlockTable pageBlockTable = (TdApi.PageBlockTable) this.f15037b;
        for (C4722a[] aVarArr2 : this.f15909Y) {
            for (C4722a aVar : aVarArr2) {
                if (C4722a.m26317b(aVar).isHeader) {
                    canvas.drawRect(C4722a.m26318a(aVar), C1410y.m37039g(C11524j.m199b()));
                } else if (pageBlockTable.isStriped) {
                    throw null;
                }
                if (pageBlockTable.isBordered) {
                    canvas.drawRect(C4722a.m26318a(aVar), C1410y.m37075E0(C11524j.m223P0()));
                }
                if (C4722a.m26314e(aVar) != null) {
                    C1399s0.m37199V(canvas);
                    canvas.clipRect(C4722a.m26318a(aVar));
                    int constructor = C4722a.m26317b(aVar).valign.getConstructor();
                    if (constructor == -2123096587) {
                        C4722a.m26318a(aVar).centerY();
                        int height = (C4722a.m26314e(aVar).getHeight() - C4722a.m26314e(aVar).m22947d0()) / 2;
                        C4722a.m26314e(aVar);
                        int i = C4722a.m26318a(aVar).left;
                        throw null;
                    } else if (constructor == 195500454) {
                        int i2 = C4722a.m26318a(aVar).top;
                        throw null;
                    } else if (constructor != 2092531158) {
                        throw null;
                    } else {
                        int i3 = C4722a.m26318a(aVar).bottom;
                        throw null;
                    }
                } else {
                    C4722a.m26315d(aVar);
                }
            }
        }
    }

    @Override
    public int mo26321p() {
        return this.f15910Z;
    }

    @Override
    public int mo26320q() {
        return C1357a0.m37541i(C7321e.m16962b1(((TdApi.PageBlockTable) this.f15037b).caption) ? 6.0f : 2.0f);
    }

    @Override
    public int mo26319z() {
        return 111;
    }
}
