package ie;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import be.C1379j0;
import ie.RunnableC5390g;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p051db.C3955n;
import p051db.C3962o;
import p080fb.AbstractC4345j;
import p080fb.C4341g;
import p108hb.C5063c;
import p156kd.C6238b;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import td.AbstractC9323v4;

public class C5459x0 implements C3955n.AbstractC3959d {
    public final String f17909M;
    public final C5457w0 f17910N;
    public final AbstractC5408k f17911O;
    public AbstractC5411l0[] f17912P;
    public boolean f17913Q;
    public int f17914R;
    public int f17915S;
    public RunnableC5390g.AbstractC5397g f17916T;
    public C4341g f17917U;
    public AbstractC4345j f17918V;
    public RunnableC5390g.AbstractC5393c f17919W;
    public final int[] f17920a;
    public final int[] f17921b;
    public final RunnableC5390g[] f17922c;

    public C5459x0(String str, C5457w0 w0Var, AbstractC5408k kVar) {
        this.f17920a = new int[2];
        this.f17922c = new RunnableC5390g[2];
        this.f17921b = new int[2];
        this.f17909M = str;
        this.f17910N = w0Var;
        this.f17911O = kVar;
        this.f17914R = -1;
    }

    public static C5459x0 m22612z(AbstractC9323v4<?> v4Var, RunnableC5390g.AbstractC5393c cVar, TdApi.RichText richText, C5457w0 w0Var, AbstractC5408k kVar, HandlerC10770jj.C10788q qVar) {
        C5384d a = C5384d.m23011a(v4Var, richText, qVar);
        return new C5459x0(a.f17708a, w0Var, kVar, a.f17709b).m22635a(8).m22640D(cVar);
    }

    public boolean m22643A(View view) {
        RunnableC5390g l = m22626l();
        return l != null && l.m22963W0(view);
    }

    public RunnableC5390g m22642B(int i) {
        this.f17913Q = C1379j0.m37351Q();
        return m22627k(i);
    }

    public void m22641C(C6238b bVar) {
        RunnableC5390g l = m22626l();
        if (l != null) {
            l.m22940f1(bVar, -1);
        } else {
            C5384d.m23009c(this.f17912P, bVar, -1);
        }
    }

    public C5459x0 m22640D(RunnableC5390g.AbstractC5393c cVar) {
        this.f17919W = cVar;
        return this;
    }

    public C5459x0 m22639E(int i) {
        this.f17914R = i;
        return this;
    }

    public C5459x0 m22638F(int i, boolean z) {
        return m22637G(C5063c.m24138h(this.f17915S, i, z));
    }

    public final C5459x0 m22637G(int i) {
        RunnableC5390g[] gVarArr;
        if (this.f17915S != i) {
            this.f17915S = i;
            for (RunnableC5390g gVar : this.f17922c) {
                if (gVar != null) {
                    gVar.m22917n1(i);
                }
            }
        }
        return this;
    }

    public C5459x0 m22636H(AbstractC4345j jVar) {
        this.f17918V = jVar;
        RunnableC5390g[] gVarArr = this.f17922c;
        if (gVarArr[0] != null) {
            gVarArr[0].m22914o1(jVar);
        }
        RunnableC5390g[] gVarArr2 = this.f17922c;
        if (gVarArr2[1] != null) {
            gVarArr2[1].m22914o1(jVar);
        }
        return this;
    }

    public C5459x0 m22635a(int i) {
        return m22637G(i | this.f17915S);
    }

    public void m22634b(View view) {
        if (this.f17917U == null) {
            this.f17917U = new C4341g();
        }
        this.f17917U.m28241j(view);
        m22636H(this.f17917U);
    }

    public void m22633c(View view) {
        C4341g gVar = this.f17917U;
        if (gVar != null) {
            gVar.m28239l(view);
        }
    }

    @Override
    public int mo7991d(boolean z) {
        return C3962o.m29470a(this, z);
    }

    public final void m22632e(Canvas canvas, int i, int i2) {
        m22628j(canvas, i, i2, null, 1.0f);
    }

    public final void m22631f(Canvas canvas, int i, int i2, int i3, int i4) {
        m22630h(canvas, i, i2, i3, i4, null, 1.0f);
    }

    @Override
    public int mo7990g(boolean z) {
        return C3962o.m29469b(this, z);
    }

    @Override
    public int getHeight() {
        RunnableC5390g l = m22626l();
        if (l == null) {
            return 0;
        }
        return l.getHeight();
    }

    @Override
    public int getWidth() {
        RunnableC5390g l = m22626l();
        if (l == null) {
            return 0;
        }
        return l.getWidth();
    }

    public final void m22630h(Canvas canvas, int i, int i2, int i3, int i4, AbstractC5408k kVar, float f) {
        m22629i(canvas, i, i2, i3, i4, kVar, f, null);
    }

    public final void m22629i(Canvas canvas, int i, int i2, int i3, int i4, AbstractC5408k kVar, float f, C6238b bVar) {
        RunnableC5390g l = m22626l();
        if (l != null) {
            l.m22897w(canvas, i, i2, i3, i4, kVar, f, bVar);
        }
    }

    public final void m22628j(Canvas canvas, int i, int i2, AbstractC5408k kVar, float f) {
        RunnableC5390g l = m22626l();
        if (l != null) {
            l.m22899v(canvas, i, i, 0, i2, kVar, f);
        }
    }

    public RunnableC5390g m22627k(int i) {
        return m22624n(!this.f17913Q ? 1 : 0, i);
    }

    public RunnableC5390g m22626l() {
        RunnableC5390g[] gVarArr = this.f17922c;
        boolean z = this.f17913Q;
        RunnableC5390g gVar = gVarArr[!z ? 1 : 0];
        if (gVar != null) {
            return gVar;
        }
        RunnableC5390g gVar2 = gVarArr[z ? 1 : 0];
        if (gVar2 == null || gVar2.m22962X() != 1 || gVar2.m22892y0()) {
            return null;
        }
        return gVar2;
    }

    public AbstractC5411l0[] m22625m() {
        return this.f17912P;
    }

    public final ie.RunnableC5390g m22624n(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ie.C5459x0.m22624n(int, int):ie.g");
    }

    public boolean m22623o() {
        RunnableC5390g l = m22626l();
        return l != null && l.m22968U();
    }

    public int m22622p() {
        RunnableC5390g l = m22626l();
        if (l == null) {
            return -1;
        }
        return l.m22966V();
    }

    public int m22621q() {
        RunnableC5390g l = m22626l();
        if (l == null) {
            return 0;
        }
        return l.m22964W();
    }

    public int m22620r() {
        RunnableC5390g l = m22626l();
        if (l == null) {
            return 0;
        }
        return l.m22962X();
    }

    public int m22619s() {
        RunnableC5390g l = m22626l();
        if (l == null) {
            return 0;
        }
        return l.m22960Y();
    }

    public int m22618t(int i) {
        RunnableC5390g l = m22626l();
        if (l == null) {
            return -1;
        }
        return l.m22941f0(i);
    }

    public int m22617u() {
        return this.f17914R;
    }

    public String m22616v() {
        return this.f17909M;
    }

    public AbstractC5408k m22615w() {
        return this.f17911O;
    }

    public boolean m22614x(View view, MotionEvent motionEvent) {
        return m22613y(view, motionEvent, null);
    }

    public boolean m22613y(View view, MotionEvent motionEvent, RunnableC5390g.AbstractC5393c cVar) {
        RunnableC5390g l = m22626l();
        if (l != null) {
            if (cVar == null) {
                cVar = this.f17919W;
            }
            if (l.m22965V0(view, motionEvent, cVar)) {
                return true;
            }
        }
        return false;
    }

    public C5459x0(String str, C5457w0 w0Var, AbstractC5408k kVar, AbstractC5411l0[] l0VarArr) {
        this(str, w0Var, kVar);
        this.f17912P = l0VarArr;
    }

    public C5459x0(C10930q6 q6Var, String str, C5457w0 w0Var, AbstractC5408k kVar, int i, HandlerC10770jj.C10788q qVar) {
        this(str, w0Var, kVar);
        this.f17912P = RunnableC5390g.m22991I0(str, i, this.f17912P, q6Var, qVar);
    }

    public C5459x0(C10930q6 q6Var, String str, C5457w0 w0Var, AbstractC5408k kVar, int i, HandlerC10770jj.C10788q qVar, int i2) {
        this(str, w0Var, kVar);
        this.f17912P = RunnableC5390g.m22991I0(str, i, null, q6Var, qVar);
        this.f17914R = i2;
    }
}
