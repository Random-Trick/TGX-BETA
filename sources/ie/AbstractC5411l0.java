package ie;

import android.text.TextPaint;
import android.view.View;
import be.C1379j0;
import be.C1389o;
import ie.RunnableC5390g;
import java.util.ArrayList;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import td.AbstractC9323v4;

public abstract class AbstractC5411l0 {
    public final C10930q6 f17793a;
    public final HandlerC10770jj.C10788q f17794b;
    public final boolean f17795c;
    public final int f17796d;
    public final int f17797e;
    public Object f17798f;

    public AbstractC5411l0(C10930q6 q6Var, int i, int i2, boolean z, HandlerC10770jj.C10788q qVar) {
        this.f17793a = q6Var;
        this.f17794b = qVar;
        this.f17795c = z;
        this.f17796d = i;
        this.f17797e = i2;
    }

    public static int m22792C(C10930q6 q6Var, String str, TdApi.TextEntity[] textEntityArr, HandlerC10770jj.C10788q qVar, List<TdApi.TextEntity> list, int i, List<AbstractC5411l0> list2) {
        int i2;
        TdApi.TextEntity textEntity = textEntityArr[i];
        List<TdApi.TextEntity> list3 = list;
        int i3 = i;
        int i4 = textEntity.offset;
        while (true) {
            int i5 = i3 + 1;
            if (i5 >= textEntityArr.length || (i2 = textEntityArr[i5].offset) >= textEntity.offset + textEntity.length) {
                break;
            }
            if (i4 < i2) {
                list2.add(new C5424r0(q6Var, str, i4, i2, textEntity, list3, qVar));
            }
            ArrayList arrayList = list3 == null ? new ArrayList() : list3;
            arrayList.add(textEntity);
            textEntity = textEntity;
            i3 += m22792C(q6Var, str, textEntityArr, qVar, arrayList, i5, list2);
            arrayList.remove(arrayList.size() - 1);
            i4 = list2.get(list2.size() - 1).f17797e;
            list3 = arrayList;
        }
        TdApi.TextEntity textEntity2 = textEntity;
        int i6 = textEntity2.offset;
        int i7 = textEntity2.length;
        if (i4 < i6 + i7) {
            list2.add(new C5424r0(q6Var, str, i4, i6 + i7, textEntity2, list3, qVar));
        }
        return (i3 - i) + 1;
    }

    public static AbstractC5411l0 m22791D(C10930q6 q6Var, String str, TdApi.TextEntity textEntity, HandlerC10770jj.C10788q qVar) {
        return new C5424r0(q6Var, str, textEntity, qVar);
    }

    public static AbstractC5411l0[] m22790E(C10930q6 q6Var, String str, TdApi.TextEntity[] textEntityArr, HandlerC10770jj.C10788q qVar) {
        if (textEntityArr == null || textEntityArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < textEntityArr.length) {
            i += m22792C(q6Var, str, textEntityArr, qVar, null, i, arrayList);
        }
        for (int i2 = 1; i2 < arrayList.size(); i2++) {
            if (((AbstractC5411l0) arrayList.get(i2 - 1)).f17797e > ((AbstractC5411l0) arrayList.get(i2)).f17796d) {
                Log.m14724e("Error processing entities, textLength: %d, entities: %s", Integer.valueOf(str.length()), textEntityArr);
                return null;
            }
        }
        return (AbstractC5411l0[]) arrayList.toArray(new AbstractC5411l0[0]);
    }

    public static AbstractC5411l0[] m22789F(C10930q6 q6Var, TdApi.FormattedText formattedText, HandlerC10770jj.C10788q qVar) {
        return m22790E(q6Var, formattedText.text, formattedText.entities, qVar);
    }

    public static boolean m22788b(AbstractC5411l0 l0Var, AbstractC5411l0 l0Var2, int i, String str) {
        return (l0Var == null && l0Var2 == null) || (l0Var != null && l0Var2 != null && l0Var.mo22741l() == l0Var2.mo22741l() && l0Var.mo22744a(l0Var2, i, str));
    }

    public abstract boolean mo22755A(View view, RunnableC5390g gVar, C5455v0 v0Var, boolean z, RunnableC5390g.AbstractC5393c cVar);

    public AbstractC5411l0 m22793B(Object obj) {
        this.f17798f = obj;
        return this;
    }

    public abstract boolean mo22744a(AbstractC5411l0 l0Var, int i, String str);

    public final AbstractC9323v4<?> m22787c(View view) {
        if (view == null) {
            return null;
        }
        AbstractC9323v4<?> q9 = AbstractC9323v4.m9183q9(view);
        return q9 != null ? q9 : C1379j0.m37307r(view.getContext()).m14552P1().m9763F();
    }

    public float mo22757d() {
        return 0.0f;
    }

    public final int m22786e() {
        return this.f17797e;
    }

    public C5427s0 mo22756f() {
        return null;
    }

    public abstract AbstractC5408k mo22743g(AbstractC5408k kVar);

    public abstract TdApi.TextEntity mo22742h();

    public final int m22785i() {
        return this.f17796d;
    }

    public Object m22784j() {
        return this.f17798f;
    }

    public final TextPaint m22783k(C5457w0 w0Var, boolean z) {
        TextPaint textPaint;
        boolean z2 = z || mo22739n();
        boolean s = mo22734s();
        boolean t = mo22733t();
        boolean w = mo22730w();
        boolean v = mo22731v();
        C1389o.C1390a g = w0Var.m22661g();
        if (t) {
            g = g.m37240e();
        }
        if (w) {
            g = g.m37237h();
        }
        if (v) {
            g = g.m37238g();
        }
        if (z2 && s) {
            textPaint = g.m37244a();
        } else if (s) {
            textPaint = g.m37241d();
        } else if (z2) {
            textPaint = this.f17795c ? g.m37242c() : g.m37243b();
        } else {
            textPaint = g.m37239f();
        }
        w0Var.m22657k(textPaint);
        if (mo22732u()) {
            textPaint.setTextSize(textPaint.getTextSize() * 0.75f);
        }
        return textPaint;
    }

    public abstract int mo22741l();

    public abstract boolean mo22740m(String str);

    public abstract boolean mo22739n();

    public abstract boolean mo22738o();

    public abstract boolean mo22737p();

    public abstract boolean mo22736q();

    public abstract boolean mo22735r();

    public abstract boolean mo22734s();

    public abstract boolean mo22733t();

    public abstract boolean mo22732u();

    public abstract boolean mo22731v();

    public abstract boolean mo22730w();

    public HandlerC10770jj.C10788q m22782x(HandlerC10770jj.C10788q qVar, RunnableC5390g.AbstractC5393c cVar, String str) {
        if (cVar == null) {
            return qVar;
        }
        HandlerC10770jj.C10788q qVar2 = new HandlerC10770jj.C10788q(qVar);
        if (cVar.mo18233m2(str)) {
            qVar2.m3322i();
        }
        TdApi.WebPage U2 = cVar.mo18239U2(str);
        if (U2 != null) {
            qVar2.m3313r(U2);
        }
        return qVar2;
    }

    public final HandlerC10770jj.C10788q m22781y(View view, RunnableC5390g gVar, C5455v0 v0Var) {
        HandlerC10770jj.C10788q qVar = this.f17794b;
        if (qVar != null && qVar.f34541g != null) {
            return qVar;
        }
        return new HandlerC10770jj.C10788q(this.f17794b).m3312s(v0Var.m22707E(view));
    }

    public abstract void mo22729z(View view, RunnableC5390g gVar, C5455v0 v0Var, RunnableC5390g.AbstractC5393c cVar);
}
