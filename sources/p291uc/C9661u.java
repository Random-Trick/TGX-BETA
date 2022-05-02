package p291uc;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1389o;
import be.C1399s0;
import be.C1410y;
import cd.C2099j;
import gd.AbstractC4718o;
import gd.C4575a0;
import gd.C4729p;
import gd.C4801u;
import gd.C4847z;
import java.util.ArrayList;
import me.C6847b2;
import me.C6879f3;
import me.View$OnClickListenerC6902i;
import nc.C7389v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p319wc.C10036a;
import p334xc.C10185a;
import p335xd.C10189d;
import p350yd.C10930q6;
import p364zd.C11524j;
import p364zd.C11537v;

public class C9661u extends RecyclerView.AbstractC0890h<C9663b> {
    public final Context f31377M;
    public final View$OnClickListenerC9694y f31378N;
    public final ArrayList<AbstractC4718o<?>> f31379O = new ArrayList<>();
    public final C11537v f31380P;
    public C10930q6 f31381Q;
    public boolean f31382R;

    public interface AbstractC9662a {
        int mo7565L();
    }

    public static class C9663b extends RecyclerView.AbstractC0886d0 {

        public class C9664a extends C6879f3 {
            public final AbstractC9662a f31383Q;

            public C9664a(Context context, AbstractC9662a aVar) {
                super(context);
                this.f31383Q = aVar;
            }

            @Override
            public void onMeasure(int i, int i2) {
                setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.MeasureSpec.makeMeasureSpec(this.f31383Q.mo7565L(), Log.TAG_TDLIB_OPTIONS));
            }
        }

        public class C9665b extends C6847b2 {
            public C9665b(Context context) {
                super(context);
            }

            @Override
            public void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                canvas.drawRect(0.0f, getMeasuredHeight() - Math.max(1, C1357a0.m37541i(0.5f)), getMeasuredWidth(), getMeasuredHeight(), C1410y.m37039g(C11524j.m223P0()));
            }
        }

        public C9663b(View view) {
            super(view);
        }

        public static C9663b m7830O(Context context, C10930q6 q6Var, int i, boolean z, View$OnClickListenerC6902i.AbstractC6906d dVar, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, C2099j.AbstractC2102c cVar, AbstractC9662a aVar, C11537v vVar) {
            if (i == 0) {
                C9664a aVar2 = new C9664a(context, aVar);
                aVar2.setSimpleTopShadow(false);
                aVar2.m18696l();
                if (vVar != null && !z) {
                    vVar.m74f(aVar2);
                }
                return new C9663b(aVar2);
            } else if (i == 1) {
                View aVar3 = new C10185a(context);
                aVar3.setId(R.id.result);
                aVar3.setOnClickListener(onClickListener);
                aVar3.setOnLongClickListener(onLongClickListener);
                aVar3.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                if (vVar != null && !z) {
                    vVar.m74f(aVar3);
                }
                return new C9663b(aVar3);
            } else if (i == 2) {
                C9665b bVar = new C9665b(context);
                bVar.setId(R.id.btn_switchPmButton);
                bVar.setGravity(17);
                bVar.setOnClickListener(onClickListener);
                bVar.setPadding(C1357a0.m37541i(16.0f), 0, C1357a0.m37541i(16.0f), C1357a0.m37541i(1.0f));
                bVar.setTypeface(C1389o.m37260i());
                bVar.setTextSize(1, 15.0f);
                bVar.setTextColor(z ? C11524j.m226O(R.id.theme_color_textNeutral, 2) : C11524j.m228N(R.id.theme_color_textNeutral));
                if (vVar != null && !z) {
                    vVar.m77c(bVar, R.id.theme_color_textNeutral);
                    vVar.m74f(bVar);
                }
                C1399s0.m37193a0(bVar);
                C10189d.m5794j(bVar);
                bVar.setLayoutParams(new RecyclerView.LayoutParams(-1, C1357a0.m37541i(36.0f) + C1357a0.m37541i(1.0f)));
                return new C9663b(bVar);
            } else if (i == 3) {
                C2099j jVar = new C2099j(context);
                jVar.m35602j(q6Var);
                jVar.setId(R.id.result);
                jVar.m35591u();
                jVar.setStickerMovementCallback(cVar);
                return new C9663b(jVar);
            } else if (i == 4) {
                C10036a aVar4 = new C10036a(context);
                aVar4.setCustomControllerProvider(dVar);
                aVar4.setId(R.id.result);
                aVar4.setOnClickListener(onClickListener);
                return new C9663b(aVar4);
            } else if (i == 5) {
                C9628p pVar = new C9628p(context);
                pVar.setCustomControllerProvider(dVar);
                pVar.setId(R.id.result);
                pVar.setOnClickListener(onClickListener);
                return new C9663b(pVar);
            } else {
                throw new RuntimeException("viewType == " + i);
            }
        }
    }

    public C9661u(Context context, View$OnClickListenerC9694y yVar, C11537v vVar) {
        this.f31377M = context;
        this.f31378N = yVar;
        this.f31380P = vVar;
    }

    @Override
    public int mo6153D() {
        return this.f31379O.size() + 1;
    }

    @Override
    public int mo6150F(int i) {
        int i2 = i - 1;
        if (i == 0) {
            return 0;
        }
        int v = this.f31379O.get(i2).m26330v();
        if (v == 6) {
            return 4;
        }
        if (v == 15) {
            return 2;
        }
        if (v != 10) {
            return v != 11 ? 1 : 3;
        }
        return 5;
    }

    public void m7840a0(ArrayList<AbstractC4718o<?>> arrayList) {
        int D = mo6153D();
        this.f31379O.addAll(arrayList);
        m39308M(D, arrayList.size());
    }

    public void mo6146Q(C9663b bVar, int i) {
        int n = bVar.m39332n();
        if (n != 0) {
            if (n == 1) {
                AbstractC4718o<?> oVar = this.f31379O.get(i - 1);
                ((C10185a) bVar.f3479a).setInlineResult(oVar);
                bVar.f3479a.setTag(oVar);
            } else if (n == 2) {
                C4729p pVar = (C4729p) this.f31379O.get(i - 1);
                ((TextView) bVar.f3479a).setText(pVar.m26312a0().toUpperCase());
                bVar.f3479a.setTag(pVar);
            } else if (n == 3) {
                AbstractC4718o<?> oVar2 = this.f31379O.get(i - 1);
                ((C2099j) bVar.f3479a).setSticker(((C4575a0) oVar2).m27298Z());
                bVar.f3479a.setTag(oVar2);
            } else if (n == 4) {
                AbstractC4718o<?> oVar3 = this.f31379O.get(i - 1);
                ((C10036a) bVar.f3479a).setGif(((C4801u) oVar3).m25224Z());
                bVar.f3479a.setTag(oVar3);
            } else if (n == 5) {
                C4847z zVar = (C4847z) this.f31379O.get(i - 1);
                ((C9628p) bVar.f3479a).m7960B0(zVar.m25050a0(), zVar.m25049b0(), zVar.m25051Z());
                bVar.f3479a.setTag(zVar);
            }
        } else if (bVar.f3479a.getMeasuredHeight() != this.f31378N.mo7565L()) {
            bVar.f3479a.requestLayout();
        }
    }

    public C9663b mo6145S(ViewGroup viewGroup, int i) {
        Context context = this.f31377M;
        C10930q6 q6Var = this.f31381Q;
        boolean z = this.f31382R;
        View$OnClickListenerC9694y yVar = this.f31378N;
        return C9663b.m7830O(context, q6Var, i, z, yVar, yVar, yVar, yVar, yVar, this.f31380P);
    }

    public void mo6144V(C9663b bVar) {
        int n = bVar.m39332n();
        if (n == 1) {
            ((C10185a) bVar.f3479a).m5810f();
        } else if (n == 3) {
            ((C2099j) bVar.f3479a).m35608d();
        } else if (n == 4) {
            ((C10036a) bVar.f3479a).m6169f();
        } else if (n == 5) {
            ((C9628p) bVar.f3479a).m7958f();
        }
    }

    public void mo6143W(C9663b bVar) {
        int n = bVar.m39332n();
        if (n == 1) {
            ((C10185a) bVar.f3479a).m5811b();
        } else if (n == 3) {
            ((C2099j) bVar.f3479a).m35603i();
        } else if (n == 4) {
            ((C10036a) bVar.f3479a).m6170b();
        } else if (n == 5) {
            ((C9628p) bVar.f3479a).m7959b();
        }
    }

    public void m7835g0(int i) {
        this.f31379O.remove(i);
        m39306O(i + 1);
    }

    public void m7834h0(ArrayList<AbstractC4718o<?>> arrayList) {
        int D = mo6153D();
        this.f31379O.clear();
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f31379O.addAll(arrayList);
        }
        C7389v0.m16615k2(this, D);
    }

    public void m7833i0(C10930q6 q6Var) {
        this.f31381Q = q6Var;
    }

    public void m7832j0(boolean z) {
        this.f31382R = z;
    }

    public boolean m7831k0() {
        return this.f31382R;
    }
}
