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

    public static C5459x0 m22613z(AbstractC9323v4<?> v4Var, RunnableC5390g.AbstractC5393c cVar, TdApi.RichText richText, C5457w0 w0Var, AbstractC5408k kVar, HandlerC10770jj.C10788q qVar) {
        C5384d a = C5384d.m23012a(v4Var, richText, qVar);
        return new C5459x0(a.f17708a, w0Var, kVar, a.f17709b).m22636a(8).m22641D(cVar);
    }

    public boolean m22644A(View view) {
        RunnableC5390g l = m22627l();
        return l != null && l.m22964W0(view);
    }

    public RunnableC5390g m22643B(int i) {
        this.f17913Q = C1379j0.m37354Q();
        return m22628k(i);
    }

    public void m22642C(C6238b bVar) {
        RunnableC5390g l = m22627l();
        if (l != null) {
            l.m22941f1(bVar, -1);
        } else {
            C5384d.m23010c(this.f17912P, bVar, -1);
        }
    }

    public C5459x0 m22641D(RunnableC5390g.AbstractC5393c cVar) {
        this.f17919W = cVar;
        return this;
    }

    public C5459x0 m22640E(int i) {
        this.f17914R = i;
        return this;
    }

    public C5459x0 m22639F(int i, boolean z) {
        return m22638G(C5063c.m24139h(this.f17915S, i, z));
    }

    public final C5459x0 m22638G(int i) {
        RunnableC5390g[] gVarArr;
        if (this.f17915S != i) {
            this.f17915S = i;
            for (RunnableC5390g gVar : this.f17922c) {
                if (gVar != null) {
                    gVar.m22918n1(i);
                }
            }
        }
        return this;
    }

    public C5459x0 m22637H(AbstractC4345j jVar) {
        this.f17918V = jVar;
        RunnableC5390g[] gVarArr = this.f17922c;
        if (gVarArr[0] != null) {
            gVarArr[0].m22915o1(jVar);
        }
        RunnableC5390g[] gVarArr2 = this.f17922c;
        if (gVarArr2[1] != null) {
            gVarArr2[1].m22915o1(jVar);
        }
        return this;
    }

    public C5459x0 m22636a(int i) {
        return m22638G(i | this.f17915S);
    }

    public void m22635b(View view) {
        if (this.f17917U == null) {
            this.f17917U = new C4341g();
        }
        this.f17917U.m28243j(view);
        m22637H(this.f17917U);
    }

    public void m22634c(View view) {
        C4341g gVar = this.f17917U;
        if (gVar != null) {
            gVar.m28241l(view);
        }
    }

    @Override
    public int mo7991d(boolean z) {
        return C3962o.m29472a(this, z);
    }

    public final void m22633e(Canvas canvas, int i, int i2) {
        m22629j(canvas, i, i2, null, 1.0f);
    }

    public final void m22632f(Canvas canvas, int i, int i2, int i3, int i4) {
        m22631h(canvas, i, i2, i3, i4, null, 1.0f);
    }

    @Override
    public int mo7990g(boolean z) {
        return C3962o.m29471b(this, z);
    }

    @Override
    public int getHeight() {
        RunnableC5390g l = m22627l();
        if (l == null) {
            return 0;
        }
        return l.getHeight();
    }

    @Override
    public int getWidth() {
        RunnableC5390g l = m22627l();
        if (l == null) {
            return 0;
        }
        return l.getWidth();
    }

    public final void m22631h(Canvas canvas, int i, int i2, int i3, int i4, AbstractC5408k kVar, float f) {
        m22630i(canvas, i, i2, i3, i4, kVar, f, null);
    }

    public final void m22630i(Canvas canvas, int i, int i2, int i3, int i4, AbstractC5408k kVar, float f, C6238b bVar) {
        RunnableC5390g l = m22627l();
        if (l != null) {
            l.m22898w(canvas, i, i2, i3, i4, kVar, f, bVar);
        }
    }

    public final void m22629j(Canvas canvas, int i, int i2, AbstractC5408k kVar, float f) {
        RunnableC5390g l = m22627l();
        if (l != null) {
            l.m22900v(canvas, i, i, 0, i2, kVar, f);
        }
    }

    public RunnableC5390g m22628k(int i) {
        return m22625n(!this.f17913Q ? 1 : 0, i);
    }

    public RunnableC5390g m22627l() {
        RunnableC5390g[] gVarArr = this.f17922c;
        boolean z = this.f17913Q;
        RunnableC5390g gVar = gVarArr[!z ? 1 : 0];
        if (gVar != null) {
            return gVar;
        }
        RunnableC5390g gVar2 = gVarArr[z ? 1 : 0];
        if (gVar2 == null || gVar2.m22963X() != 1 || gVar2.m22893y0()) {
            return null;
        }
        return gVar2;
    }

    public AbstractC5411l0[] m22626m() {
        return this.f17912P;
    }

    public final ie.RunnableC5390g m22625n(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ie.C5459x0.m22625n(int, int):ie.g");
    }

    public boolean m22624o() {
        RunnableC5390g l = m22627l();
        return l != null && l.m22969U();
    }

    public int m22623p() {
        RunnableC5390g l = m22627l();
        if (l == null) {
            return -1;
        }
        return l.m22967V();
    }

    public int m22622q() {
        RunnableC5390g l = m22627l();
        if (l == null) {
            return 0;
        }
        return l.m22965W();
    }

    public int m22621r() {
        RunnableC5390g l = m22627l();
        if (l == null) {
            return 0;
        }
        return l.m22963X();
    }

    public int m22620s() {
        RunnableC5390g l = m22627l();
        if (l == null) {
            return 0;
        }
        return l.m22961Y();
    }

    public int m22619t(int i) {
        RunnableC5390g l = m22627l();
        if (l == null) {
            return -1;
        }
        return l.m22942f0(i);
    }

    public int m22618u() {
        return this.f17914R;
    }

    public String m22617v() {
        return this.f17909M;
    }

    public AbstractC5408k m22616w() {
        return this.f17911O;
    }

    public boolean m22615x(View view, MotionEvent motionEvent) {
        return m22614y(view, motionEvent, null);
    }

    public boolean m22614y(View view, MotionEvent motionEvent, RunnableC5390g.AbstractC5393c cVar) {
        RunnableC5390g l = m22627l();
        if (l != null) {
            if (cVar == null) {
                cVar = this.f17919W;
            }
            if (l.m22966V0(view, motionEvent, cVar)) {
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
        this.f17912P = RunnableC5390g.m22992I0(str, i, this.f17912P, q6Var, qVar);
    }

    public C5459x0(C10930q6 q6Var, String str, C5457w0 w0Var, AbstractC5408k kVar, int i, HandlerC10770jj.C10788q qVar, int i2) {
        this(str, w0Var, kVar);
        this.f17912P = RunnableC5390g.m22992I0(str, i, null, q6Var, qVar);
        this.f17914R = i2;
    }
}
