package hd;

import ae.j;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import ce.a0;
import ce.c0;
import ce.j0;
import ce.y;
import je.e;
import je.g;
import ld.h;
import ld.p;
import ld.v;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import vc.g1;
import vc.v2;
import zd.t7;
import zd.w7;

public class c5 extends s4 implements t7.i {
    public static int f12887k3;
    public static int f12888l3;
    public static int f12889m3;
    public static int f12890n3;
    public static int f12891o3;
    public static int f12892p3;
    public static int f12893q3;
    public String U2;
    public boolean V2;
    public String W2;
    public long X2;
    public TdApi.User Y2;
    public h Z2;
    public int f12894a3;
    public e f12895b3;
    public String f12896c3;
    public String f12897d3;
    public int f12898e3;
    public int f12899f3;
    public int f12900g3;
    public int f12901h3;
    public float f12902i3;
    public float f12903j3;

    public c5(v2 v2Var, TdApi.Message message, TdApi.MessageContact messageContact) {
        super(v2Var, message);
        if (f12887k3 == 0) {
            s5();
        }
        TdApi.Contact contact = messageContact.contact;
        String q22 = t2.q2(contact.firstName, contact.lastName);
        this.U2 = q22;
        this.V2 = g.M0(q22);
        this.f12895b3 = t2.C1(contact.firstName, contact.lastName);
        this.W2 = c0.y(contact.phoneNumber, contact.userId != 0, true);
        long j10 = contact.userId;
        this.X2 = j10;
        if (j10 != 0) {
            this.Y2 = this.O0.e2().u2(contact.userId);
            this.O0.e2().L(contact.userId, this);
        }
    }

    public void fa(TdApi.User user) {
        if (!U5()) {
            this.Y2 = user;
            da();
            a();
            u5();
        }
    }

    public static void s5() {
        f12890n3 = a0.i(57.0f);
        f12887k3 = a0.i(43.0f);
        int i10 = a0.i(20.5f);
        f12888l3 = i10;
        f12889m3 = i10 * 2;
        f12891o3 = a0.i(16.0f);
        f12892p3 = a0.i(36.0f);
        f12893q3 = a0.i(26.0f);
    }

    @Override
    public void J8(p pVar) {
        pVar.G(this.Z2);
    }

    @Override
    public void M1(final TdApi.User user) {
        this.O0.hd().post(new Runnable() {
            @Override
            public final void run() {
                c5.this.fa(user);
            }
        });
    }

    @Override
    public int O3(boolean z10) {
        return f12888l3;
    }

    @Override
    public int R1() {
        return a0.i(1.0f) + f12889m3 + a0.i(6.0f) + this.f12899f3;
    }

    @Override
    public void V7() {
        if (this.X2 != 0) {
            this.O0.e2().N1(this.X2, this);
        }
    }

    @Override
    public int W2() {
        return f12887k3;
    }

    @Override
    public int a3() {
        return (R9() ? 0 : a0.i(10.0f)) + f12889m3 + a0.i(12.0f) + Math.max(this.f12898e3, this.f12899f3);
    }

    @Override
    public void b0(int i10) {
        da();
        this.f12900g3 = y.v0(this.f12895b3, 16.0f);
        this.f12901h3 = i10 - f12890n3;
        ea();
    }

    @Override
    public void c1(g1 g1Var, Canvas canvas, int i10, int i11, int i12, v vVar, v vVar2) {
        int i13;
        int i14;
        if (!R9()) {
            canvas.drawRect(i10, i11, a0.i(3.0f) + i10, f12887k3 + i11, y.g(j.k()));
            i10 += a0.i(10.0f);
        }
        int i15 = i11 + a0.i(1.0f);
        if (this.Z2 == null) {
            canvas.drawCircle(i10 + i14, i15 + i14, f12888l3, y.g(j.L(this.f12894a3)));
            y.d(canvas, this.f12895b3, (f12888l3 + i10) - ((int) (this.f12900g3 / 2.0f)), f12893q3 + i15, 16.0f);
        } else {
            int i16 = f12889m3;
            vVar2.K0(i10, i15, i10 + i16, i16 + i15);
            if (vVar2.e0()) {
                canvas.drawCircle(i10 + i13, i15 + i13, f12888l3, y.U());
            }
            vVar2.draw(canvas);
        }
        float i17 = i10 + f12889m3 + a0.i(6.0f);
        canvas.drawText(this.f12896c3, i17, f12891o3 + i15, y.p(this.V2, D2()));
        canvas.drawText(this.f12897d3, i17, i15 + f12892p3, y.c0(15.0f, j3()));
    }

    public final void da() {
        TdApi.User user = this.Y2;
        if (user == null || t2.u3(user.profilePhoto)) {
            this.Z2 = null;
            this.f12894a3 = t2.H0(t2.I3(this.Y2) ? -1L : this.X2, this.O0.fa());
            return;
        }
        h hVar = new h(this.O0, this.Y2.profilePhoto.small);
        this.Z2 = hVar;
        hVar.t0(f12889m3);
    }

    public final void ea() {
        if (this.f12901h3 > 0) {
            String charSequence = TextUtils.ellipsize(this.U2, y.o(this.V2), this.f12901h3, TextUtils.TruncateAt.END).toString();
            this.f12896c3 = charSequence;
            this.f12898e3 = (int) v0.T1(charSequence, y.o(this.V2));
            String charSequence2 = TextUtils.ellipsize(this.W2, y.h0(), this.f12901h3, TextUtils.TruncateAt.END).toString();
            this.f12897d3 = charSequence2;
            this.f12899f3 = (int) v0.T1(charSequence2, y.h0());
        }
    }

    @Override
    public boolean f8(g1 g1Var, MotionEvent motionEvent) {
        if (super.f8(g1Var, motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int b32 = b3() + a0.i(10.0f);
            if (x10 < b32 || x10 > b32 + f12889m3 + a0.i(6.0f) + Math.max(this.f12898e3, this.f12899f3) || y10 < c3() + a0.i(1.0f) || y10 > c3() + a0.i(1.0f) + f12889m3) {
                this.f12902i3 = 0.0f;
                this.f12903j3 = 0.0f;
                return false;
            }
            this.f12902i3 = x10;
            this.f12903j3 = y10;
            return true;
        } else if (action != 1) {
            if (action != 3) {
                return false;
            }
            this.f12902i3 = 0.0f;
            this.f12903j3 = 0.0f;
            return false;
        } else if (this.f12902i3 == 0.0f || this.f12903j3 == 0.0f) {
            return false;
        } else {
            if (Math.abs(motionEvent.getX() - this.f12902i3) >= a0.p() || Math.abs(motionEvent.getY() - this.f12903j3) >= a0.p()) {
                this.f12902i3 = 0.0f;
                this.f12903j3 = 0.0f;
                return false;
            }
            if (this.X2 != 0) {
                this.O0.hd().v7(Q0(), this.X2, h8());
            } else {
                j0.b0(this.W2);
            }
            return true;
        }
    }

    @Override
    public boolean q7() {
        return true;
    }

    @Override
    public void u7(long j10, TdApi.UserFullInfo userFullInfo) {
        w7.a(this, j10, userFullInfo);
    }
}
