package je;

import android.text.TextPaint;
import android.view.View;
import ce.j0;
import ce.o;
import java.util.ArrayList;
import java.util.List;
import je.g;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import ud.v4;
import zd.hj;
import zd.o6;

public abstract class l0 {
    public final o6 f15423a;
    public final hj.q f15424b;
    public final boolean f15425c;
    public final int f15426d;
    public final int f15427e;
    public Object f15428f;

    public l0(o6 o6Var, int i10, int i11, boolean z10, hj.q qVar) {
        this.f15423a = o6Var;
        this.f15424b = qVar;
        this.f15425c = z10;
        this.f15426d = i10;
        this.f15427e = i11;
    }

    public static int C(o6 o6Var, String str, TdApi.TextEntity[] textEntityArr, hj.q qVar, List<TdApi.TextEntity> list, int i10, List<l0> list2) {
        int i11;
        TdApi.TextEntity textEntity = textEntityArr[i10];
        List<TdApi.TextEntity> list3 = list;
        int i12 = i10;
        int i13 = textEntity.offset;
        while (true) {
            int i14 = i12 + 1;
            if (i14 >= textEntityArr.length || (i11 = textEntityArr[i14].offset) >= textEntity.offset + textEntity.length) {
                break;
            }
            if (i13 < i11) {
                list2.add(new r0(o6Var, str, i13, i11, textEntity, list3, qVar));
            }
            ArrayList arrayList = list3 == null ? new ArrayList() : list3;
            arrayList.add(textEntity);
            textEntity = textEntity;
            i12 += C(o6Var, str, textEntityArr, qVar, arrayList, i14, list2);
            arrayList.remove(arrayList.size() - 1);
            i13 = list2.get(list2.size() - 1).f15427e;
            list3 = arrayList;
        }
        TdApi.TextEntity textEntity2 = textEntity;
        int i15 = textEntity2.offset;
        int i16 = textEntity2.length;
        if (i13 < i15 + i16) {
            list2.add(new r0(o6Var, str, i13, i15 + i16, textEntity2, list3, qVar));
        }
        return (i12 - i10) + 1;
    }

    public static l0 D(o6 o6Var, String str, TdApi.TextEntity textEntity, hj.q qVar) {
        return new r0(o6Var, str, textEntity, qVar);
    }

    public static l0[] E(o6 o6Var, String str, TdApi.TextEntity[] textEntityArr, hj.q qVar) {
        if (textEntityArr == null || textEntityArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < textEntityArr.length) {
            i10 += C(o6Var, str, textEntityArr, qVar, null, i10, arrayList);
        }
        for (int i11 = 1; i11 < arrayList.size(); i11++) {
            if (((l0) arrayList.get(i11 - 1)).f15427e > ((l0) arrayList.get(i11)).f15426d) {
                Log.e("Error processing entities, textLength: %d, entities: %s", Integer.valueOf(str.length()), textEntityArr);
                return null;
            }
        }
        return (l0[]) arrayList.toArray(new l0[0]);
    }

    public static l0[] F(o6 o6Var, TdApi.FormattedText formattedText, hj.q qVar) {
        return E(o6Var, formattedText.text, formattedText.entities, qVar);
    }

    public static boolean b(l0 l0Var, l0 l0Var2, int i10, String str) {
        return (l0Var == null && l0Var2 == null) || (l0Var != null && l0Var2 != null && l0Var.l() == l0Var2.l() && l0Var.a(l0Var2, i10, str));
    }

    public abstract boolean A(View view, g gVar, v0 v0Var, boolean z10, g.c cVar);

    public l0 B(Object obj) {
        this.f15428f = obj;
        return this;
    }

    public abstract boolean a(l0 l0Var, int i10, String str);

    public final v4<?> c(View view) {
        if (view == null) {
            return null;
        }
        v4<?> q92 = v4.q9(view);
        return q92 != null ? q92 : j0.r(view.getContext()).Q1().F();
    }

    public float d() {
        return 0.0f;
    }

    public final int e() {
        return this.f15427e;
    }

    public s0 f() {
        return null;
    }

    public abstract k g(k kVar);

    public abstract TdApi.TextEntity h();

    public final int i() {
        return this.f15426d;
    }

    public Object j() {
        return this.f15428f;
    }

    public final TextPaint k(w0 w0Var, boolean z10) {
        TextPaint textPaint;
        boolean z11 = z10 || n();
        boolean s10 = s();
        boolean t10 = t();
        boolean w10 = w();
        boolean v10 = v();
        o.a g10 = w0Var.g();
        if (t10) {
            g10 = g10.e();
        }
        if (w10) {
            g10 = g10.h();
        }
        if (v10) {
            g10 = g10.g();
        }
        if (z11 && s10) {
            textPaint = g10.a();
        } else if (s10) {
            textPaint = g10.d();
        } else if (z11) {
            textPaint = this.f15425c ? g10.c() : g10.b();
        } else {
            textPaint = g10.f();
        }
        w0Var.k(textPaint);
        if (u()) {
            textPaint.setTextSize(textPaint.getTextSize() * 0.75f);
        }
        return textPaint;
    }

    public abstract int l();

    public abstract boolean m(String str);

    public abstract boolean n();

    public abstract boolean o();

    public abstract boolean p();

    public abstract boolean q();

    public abstract boolean r();

    public abstract boolean s();

    public abstract boolean t();

    public abstract boolean u();

    public abstract boolean v();

    public abstract boolean w();

    public hj.q x(hj.q qVar, g.c cVar, String str) {
        if (cVar == null) {
            return qVar;
        }
        hj.q qVar2 = new hj.q(qVar);
        if (cVar.l2(str)) {
            qVar2.i();
        }
        TdApi.WebPage J2 = cVar.J2(str);
        if (J2 != null) {
            qVar2.r(J2);
        }
        return qVar2;
    }

    public final hj.q y(View view, g gVar, v0 v0Var) {
        hj.q qVar = this.f15424b;
        if (qVar != null && qVar.f27707g != null) {
            return qVar;
        }
        return new hj.q(this.f15424b).s(v0Var.E(view));
    }

    public abstract void z(View view, g gVar, v0 v0Var, g.c cVar);
}
