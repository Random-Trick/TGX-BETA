package vc;

import ae.j;
import ae.v;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.p0;
import ce.y;
import dd.j;
import hd.o;
import hd.p;
import hd.u;
import hd.z;
import java.util.ArrayList;
import ne.b2;
import ne.f3;
import ne.i;
import oc.v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import yd.d;
import zd.o6;

public class t extends RecyclerView.h<b> {
    public final Context M;
    public final x N;
    public final ArrayList<o<?>> O = new ArrayList<>();
    public final v P;
    public o6 Q;
    public boolean R;

    public interface a {
        int L();
    }

    public static class b extends RecyclerView.c0 {

        public class a extends f3 {
            public final a Q;

            public a(Context context, a aVar) {
                super(context);
                this.Q = aVar;
            }

            @Override
            public void onMeasure(int i10, int i11) {
                setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i10), View.MeasureSpec.makeMeasureSpec(this.Q.L(), Log.TAG_TDLIB_OPTIONS));
            }
        }

        public class C0233b extends b2 {
            public C0233b(Context context) {
                super(context);
            }

            @Override
            public void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                canvas.drawRect(0.0f, getMeasuredHeight() - Math.max(1, a0.i(0.5f)), getMeasuredWidth(), getMeasuredHeight(), y.g(j.M0()));
            }
        }

        public b(View view) {
            super(view);
        }

        public static b O(Context context, o6 o6Var, int i10, boolean z10, i.d dVar, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, j.c cVar, a aVar, v vVar) {
            if (i10 == 0) {
                a aVar2 = new a(context, aVar);
                aVar2.setSimpleTopShadow(false);
                aVar2.l();
                if (vVar != null && !z10) {
                    vVar.f(aVar2);
                }
                return new b(aVar2);
            } else if (i10 == 1) {
                View aVar3 = new yc.a(context);
                aVar3.setId(R.id.result);
                aVar3.setOnClickListener(onClickListener);
                aVar3.setOnLongClickListener(onLongClickListener);
                aVar3.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                if (vVar != null && !z10) {
                    vVar.f(aVar3);
                }
                return new b(aVar3);
            } else if (i10 == 2) {
                C0233b bVar = new C0233b(context);
                bVar.setId(R.id.btn_switchPmButton);
                bVar.setGravity(17);
                bVar.setOnClickListener(onClickListener);
                bVar.setPadding(a0.i(16.0f), 0, a0.i(16.0f), a0.i(1.0f));
                bVar.setTypeface(ce.o.i());
                bVar.setTextSize(1, 15.0f);
                bVar.setTextColor(z10 ? ae.j.M(R.id.theme_color_textNeutral, 2) : ae.j.L(R.id.theme_color_textNeutral));
                if (vVar != null && !z10) {
                    vVar.c(bVar, R.id.theme_color_textNeutral);
                    vVar.f(bVar);
                }
                p0.T(bVar);
                d.j(bVar);
                bVar.setLayoutParams(new RecyclerView.LayoutParams(-1, a0.i(36.0f) + a0.i(1.0f)));
                return new b(bVar);
            } else if (i10 == 3) {
                dd.j jVar = new dd.j(context);
                jVar.j(o6Var);
                jVar.setId(R.id.result);
                jVar.u();
                jVar.setStickerMovementCallback(cVar);
                return new b(jVar);
            } else if (i10 == 4) {
                xc.a aVar4 = new xc.a(context);
                aVar4.setCustomControllerProvider(dVar);
                aVar4.setId(R.id.result);
                aVar4.setOnClickListener(onClickListener);
                return new b(aVar4);
            } else if (i10 == 5) {
                o oVar = new o(context);
                oVar.setCustomControllerProvider(dVar);
                oVar.setId(R.id.result);
                oVar.setOnClickListener(onClickListener);
                return new b(oVar);
            } else {
                throw new RuntimeException("viewType == " + i10);
            }
        }
    }

    public t(Context context, x xVar, v vVar) {
        this.M = context;
        this.N = xVar;
        this.P = vVar;
    }

    @Override
    public int D() {
        return this.O.size() + 1;
    }

    @Override
    public int F(int i10) {
        int i11 = i10 - 1;
        if (i10 == 0) {
            return 0;
        }
        int v10 = this.O.get(i11).v();
        if (v10 == 6) {
            return 4;
        }
        if (v10 == 15) {
            return 2;
        }
        if (v10 != 10) {
            return v10 != 11 ? 1 : 3;
        }
        return 5;
    }

    public void a0(ArrayList<o<?>> arrayList) {
        int D = D();
        this.O.addAll(arrayList);
        M(D, arrayList.size());
    }

    public void Q(b bVar, int i10) {
        int n10 = bVar.n();
        if (n10 != 0) {
            if (n10 == 1) {
                o<?> oVar = this.O.get(i10 - 1);
                ((yc.a) bVar.f2982a).setInlineResult(oVar);
                bVar.f2982a.setTag(oVar);
            } else if (n10 == 2) {
                p pVar = (p) this.O.get(i10 - 1);
                ((TextView) bVar.f2982a).setText(pVar.a0().toUpperCase());
                bVar.f2982a.setTag(pVar);
            } else if (n10 == 3) {
                o<?> oVar2 = this.O.get(i10 - 1);
                ((dd.j) bVar.f2982a).setSticker(((hd.a0) oVar2).Z());
                bVar.f2982a.setTag(oVar2);
            } else if (n10 == 4) {
                o<?> oVar3 = this.O.get(i10 - 1);
                ((xc.a) bVar.f2982a).setGif(((u) oVar3).Z());
                bVar.f2982a.setTag(oVar3);
            } else if (n10 == 5) {
                z zVar = (z) this.O.get(i10 - 1);
                ((o) bVar.f2982a).C0(zVar.a0(), zVar.b0(), zVar.Z());
                bVar.f2982a.setTag(zVar);
            }
        } else if (bVar.f2982a.getMeasuredHeight() != this.N.L()) {
            bVar.f2982a.requestLayout();
        }
    }

    public b S(ViewGroup viewGroup, int i10) {
        Context context = this.M;
        o6 o6Var = this.Q;
        boolean z10 = this.R;
        x xVar = this.N;
        return b.O(context, o6Var, i10, z10, xVar, xVar, xVar, xVar, xVar, this.P);
    }

    public void V(b bVar) {
        int n10 = bVar.n();
        if (n10 == 1) {
            ((yc.a) bVar.f2982a).e();
        } else if (n10 == 3) {
            ((dd.j) bVar.f2982a).d();
        } else if (n10 == 4) {
            ((xc.a) bVar.f2982a).e();
        } else if (n10 == 5) {
            ((o) bVar.f2982a).e();
        }
    }

    public void W(b bVar) {
        int n10 = bVar.n();
        if (n10 == 1) {
            ((yc.a) bVar.f2982a).b();
        } else if (n10 == 3) {
            ((dd.j) bVar.f2982a).i();
        } else if (n10 == 4) {
            ((xc.a) bVar.f2982a).b();
        } else if (n10 == 5) {
            ((o) bVar.f2982a).b();
        }
    }

    public void f0(int i10) {
        this.O.remove(i10);
        O(i10 + 1);
    }

    public void g0(ArrayList<o<?>> arrayList) {
        int D = D();
        this.O.clear();
        if (arrayList != null && !arrayList.isEmpty()) {
            this.O.addAll(arrayList);
        }
        v0.k2(this, D);
    }

    public void h0(o6 o6Var) {
        this.Q = o6Var;
    }

    public void i0(boolean z10) {
        this.R = z10;
    }

    public boolean j0() {
        return this.R;
    }
}
