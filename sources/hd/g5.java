package hd;

import ae.j;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.y;
import hd.f0;
import ib.i;
import je.g;
import je.l0;
import je.x0;
import ld.c;
import ld.p;
import ld.v;
import md.m;
import ob.e;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.a;
import vc.g1;
import vc.v2;
import zd.o6;

public class g5 extends s4 implements f0.a {
    public final TdApi.Game U2;
    public x0 V2;
    public TdApi.FormattedText W2;
    public x0 X2;
    public f0 Y2;

    public g5(v2 v2Var, TdApi.Message message, TdApi.Game game) {
        super(v2Var, message);
        this.U2 = game;
        ka();
    }

    public static int ha() {
        return a0.i(12.0f);
    }

    public static int ia() {
        return a0.i(7.0f);
    }

    @Override
    public void I8(m mVar) {
        this.Y2.l0(mVar);
    }

    @Override
    public void J8(p pVar) {
        this.Y2.m0(pVar);
    }

    @Override
    public boolean L9(TdApi.Message message, TdApi.MessageContent messageContent, boolean z10) {
        TdApi.Game game = ((TdApi.MessageGame) messageContent).game;
        TdApi.Game game2 = this.U2;
        game2.text = game.text;
        game2.title = game.title;
        game2.description = game.description;
        if (!ka()) {
            return false;
        }
        z8();
        return true;
    }

    @Override
    public void M8(c cVar) {
        this.Y2.n0(cVar);
    }

    @Override
    public int O3(boolean z10) {
        return a0.i(j.V());
    }

    @Override
    public void R7(g1 g1Var, boolean z10) {
        f0 f0Var = this.Y2;
        if (f0Var != null) {
            f0Var.G().R();
        }
    }

    @Override
    public int W2() {
        return this.Y2.x() + la();
    }

    @Override
    public int Y1() {
        return s4.f13429g2 + s4.f13430h2;
    }

    @Override
    public void Z(TdApi.ChatType chatType) {
        f0 f0Var = this.Y2;
        if (f0Var != null) {
            f0Var.G().m(chatType);
        }
    }

    @Override
    public void Z7(long j10, long j11, boolean z10) {
        f0 f0Var = this.Y2;
        if (f0Var != null) {
            f0Var.I0(j10, j11, z10);
        }
    }

    @Override
    public int a3() {
        int ha2 = ha();
        x0 x0Var = this.X2;
        return ha2 + Math.max(x0Var != null ? x0Var.getWidth() : 0, this.Y2.B());
    }

    @Override
    public void b0(int i10) {
        int ga2 = ga();
        int i11 = ga2 * 2;
        x0 x0Var = this.V2;
        if (x0Var != null) {
            x0Var.B(ga2);
        }
        x0 x0Var2 = this.X2;
        if (x0Var2 != null) {
            x0Var2.B(ga2);
        }
        ca(ga2, i11);
    }

    @Override
    public void c1(g1 g1Var, Canvas canvas, int i10, int i11, int i12, v vVar, v vVar2) {
        this.Y2.s(g1Var, canvas, ea(), fa(), vVar, vVar2, 1.0f);
        da(canvas, i10, i11, i12);
    }

    public final void ca(int i10, int i11) {
        if (this.Y2 == null) {
            if (this.U2.animation != null) {
                a t10 = t();
                o6 o6Var = this.O0;
                TdApi.Animation animation = this.U2.animation;
                TdApi.Message message = this.f13449a;
                this.Y2 = new f0(t10, o6Var, animation, message.chatId, message.f19946id, (s4) this, false);
            } else {
                a t11 = t();
                o6 o6Var2 = this.O0;
                TdApi.Photo photo = this.U2.photo;
                TdApi.Message message2 = this.f13449a;
                this.Y2 = new f0(t11, o6Var2, photo, message2.chatId, message2.f19946id, (s4) this, false);
            }
            this.Y2.C0(this.P0);
            this.Y2.t0(this);
        }
        float F = this.Y2.F();
        float E = this.Y2.E();
        float min = Math.min(i10 / F, i11 / E);
        this.Y2.j((int) (F * min), (int) (min * E));
    }

    public final void da(Canvas canvas, int i10, int i11, int i12) {
        RectF a02 = y.a0();
        int i13 = a0.i(3.0f);
        a02.set(i10, i11, i10 + i13, W2() + i11);
        float f10 = i13 / 2;
        canvas.drawRoundRect(a02, f10, f10, y.g(V4()));
        int ha2 = i10 + ha();
        int i14 = 0;
        if (this.V2 != null) {
            int ja2 = ja() + 0;
            this.V2.j(canvas, ha2, i11 + ja2, null, 1.0f);
            i14 = this.V2.getHeight() + ja2;
        }
        if (this.X2 != null) {
            this.X2.j(canvas, ha2, i11 + i14 + (i14 != 0 ? a0.i(4.0f) : ja()), null, 1.0f);
        }
    }

    public final int ea() {
        return b3() + ha();
    }

    @Override
    public boolean f(View view, f0 f0Var) {
        c4 c4Var = this.U;
        if (c4Var == null || c4Var.v()) {
            return false;
        }
        this.U.x(view);
        return true;
    }

    @Override
    public boolean f8(g1 g1Var, MotionEvent motionEvent) {
        if (super.f8(g1Var, motionEvent) || this.Y2.i0(g1Var, motionEvent)) {
            return true;
        }
        if (this.V2 != null) {
            ja();
            this.V2.getHeight();
            a0.i(4.0f);
        } else {
            ja();
        }
        x0 x0Var = this.X2;
        return x0Var != null && x0Var.x(g1Var, motionEvent);
    }

    public final int fa() {
        return c3() + la();
    }

    public final int ga() {
        return G4() - ha();
    }

    public final int ja() {
        if (this.X2 == null && this.V2 == null) {
            return 0;
        }
        return a0.i(2.0f);
    }

    public final boolean ka() {
        boolean z10;
        TdApi.FormattedText formattedText;
        x0 x0Var;
        if (i.i(this.U2.title) || ((x0Var = this.X2) != null && x0Var.v().equals(this.U2.title))) {
            z10 = false;
        } else {
            this.V2 = new x0(this.U2.title, s4.L4(), F2(), null).a(4).D(F0());
            z10 = true;
        }
        if (!e.c1(this.U2.text)) {
            formattedText = this.U2.text;
        } else {
            String str = this.U2.description;
            formattedText = new TdApi.FormattedText(str, g.G(str, 1));
        }
        if (!e.c1(formattedText)) {
            TdApi.FormattedText formattedText2 = this.W2;
            if (formattedText2 == null || !e.O(formattedText2, formattedText)) {
                this.W2 = formattedText;
                this.X2 = new x0(formattedText.text, s4.L4(), K4(), l0.F(this.O0, formattedText, h8())).D(F0());
                return true;
            }
        } else if (this.W2 != null) {
            this.X2 = null;
            this.W2 = null;
            return true;
        }
        return z10;
    }

    public final int la() {
        int i10 = 0;
        if (this.V2 != null) {
            i10 = 0 + ja() + this.V2.getHeight();
        }
        if (this.X2 != null) {
            i10 += (i10 != 0 ? a0.i(4.0f) : ja()) + this.X2.getHeight();
        }
        return i10 > 0 ? i10 + ia() : i10;
    }

    @Override
    public boolean m7() {
        return this.Y2.Q() != null;
    }

    @Override
    public boolean m8(View view, float f10, float f11) {
        return this.Y2.j0(view) || super.m8(view, f10, f11);
    }

    @Override
    public boolean q7() {
        return true;
    }
}
