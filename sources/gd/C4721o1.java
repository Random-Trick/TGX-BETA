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
        public static Rect m26319a(C4722a aVar) {
            throw null;
        }

        public static TdApi.PageBlockTableCell m26318b(C4722a aVar) {
            throw null;
        }

        public static C5384d m26317c(C4722a aVar) {
            throw null;
        }

        public static int m26316d(C4722a aVar) {
            throw null;
        }

        public static RunnableC5390g m26315e(C4722a aVar) {
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
    public boolean mo26326C(View view, MotionEvent motionEvent) {
        C4722a[][] aVarArr;
        for (C4722a[] aVarArr2 : this.f15909Y) {
            for (C4722a aVar : aVarArr2) {
                if (C4722a.m26315e(aVar) != null) {
                    RunnableC5390g e = C4722a.m26315e(aVar);
                    AbstractC9323v4<?> v4Var = this.f15036a;
                    if (e.m22966V0(view, motionEvent, v4Var instanceof RunnableC5390g.AbstractC5393c ? (RunnableC5390g.AbstractC5393c) v4Var : null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void mo26325R(C6238b bVar) {
        C4722a[][] aVarArr;
        int i = 0;
        for (C4722a[] aVarArr2 : this.f15909Y) {
            for (C4722a aVar : aVarArr2) {
                if (C4722a.m26315e(aVar) != null) {
                    C4722a.m26315e(aVar).m22941f1(bVar, i);
                } else if (C4722a.m26317c(aVar) != null) {
                    C5384d.m23010c(C4722a.m26317c(aVar).f17709b, bVar, i);
                }
                i += C4722a.m26316d(aVar);
            }
        }
        bVar.m20997g(i);
    }

    @Override
    public int mo26324f(View view, int i) {
        C1357a0.m37544i(12.0f);
        mo26321q();
        C1357a0.m37544i(6.0f);
        return 0;
    }

    @Override
    public <T extends View & AbstractC5143t> void mo26323i(T t, Canvas canvas, AbstractC6264v vVar, AbstractC6264v vVar2, C6238b bVar) {
        C4722a[][] aVarArr;
        TdApi.PageBlockTable pageBlockTable = (TdApi.PageBlockTable) this.f15037b;
        for (C4722a[] aVarArr2 : this.f15909Y) {
            for (C4722a aVar : aVarArr2) {
                if (C4722a.m26318b(aVar).isHeader) {
                    canvas.drawRect(C4722a.m26319a(aVar), C1410y.m37042g(C11524j.m199b()));
                } else if (pageBlockTable.isStriped) {
                    throw null;
                }
                if (pageBlockTable.isBordered) {
                    canvas.drawRect(C4722a.m26319a(aVar), C1410y.m37078E0(C11524j.m223P0()));
                }
                if (C4722a.m26315e(aVar) != null) {
                    C1399s0.m37202V(canvas);
                    canvas.clipRect(C4722a.m26319a(aVar));
                    int constructor = C4722a.m26318b(aVar).valign.getConstructor();
                    if (constructor == -2123096587) {
                        C4722a.m26319a(aVar).centerY();
                        int height = (C4722a.m26315e(aVar).getHeight() - C4722a.m26315e(aVar).m22948d0()) / 2;
                        C4722a.m26315e(aVar);
                        int i = C4722a.m26319a(aVar).left;
                        throw null;
                    } else if (constructor == 195500454) {
                        int i2 = C4722a.m26319a(aVar).top;
                        throw null;
                    } else if (constructor != 2092531158) {
                        throw null;
                    } else {
                        int i3 = C4722a.m26319a(aVar).bottom;
                        throw null;
                    }
                } else {
                    C4722a.m26316d(aVar);
                }
            }
        }
    }

    @Override
    public int mo26322p() {
        return this.f15910Z;
    }

    @Override
    public int mo26321q() {
        return C1357a0.m37544i(C7321e.m16962b1(((TdApi.PageBlockTable) this.f15037b).caption) ? 6.0f : 2.0f);
    }

    @Override
    public int mo26320z() {
        return 111;
    }
}
