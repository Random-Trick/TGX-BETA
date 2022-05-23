package hd;

import ae.j;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.c0;
import ce.y;
import de.rh;
import de.yb;
import gd.w;
import ib.e;
import ib.i;
import id.d;
import ie.o;
import java.util.concurrent.TimeUnit;
import je.g;
import ld.h;
import ld.p;
import ld.v;
import od.l1;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import vc.g1;
import vc.v2;
import zd.fc;
import zd.hj;
import zd.o6;

public class a5 extends s4 implements Client.g {
    public static int A3;
    public static int B3;
    public static int C3;
    public static int f12722x3;
    public static int f12723y3;
    public static int f12724z3;
    public int U2;
    public String V2;
    public TdApi.User W2;
    public TdApi.User X2;
    public fc Y2;
    public long[] Z2;
    public TdApi.ChatPhoto f12725a3;
    public h f12726b3;
    public boolean f12727c3;
    public long f12728d3;
    public String f12729e3;
    public TdApi.Location f12730f3;
    public TdApi.ChatInviteLink f12731g3;
    public String f12732h3;
    public Layout f12733i3;
    public int f12734j3;
    public int f12735k3;
    public TdApi.Game f12736l3;
    public TdApi.Message f12737m3;
    public CharSequence f12738n3;
    public boolean f12739o3;
    public int f12740p3;
    public int f12741q3;
    public float f12742r3;
    public float f12743s3;
    public o f12744t3;
    public boolean f12745u3;
    public Path f12746v3;
    public RectF f12747w3;

    public a5(v2 v2Var, TdApi.Message message, int i10) {
        super(v2Var, message);
        this.U2 = i10;
    }

    public boolean na(a aVar, View view, o oVar) {
        long j10;
        int i10 = this.U2;
        if (i10 == 10 || i10 == 13 || i10 == 30) {
            if (i10 == 10) {
                j10 = ((TdApi.MessageGameScore) this.f13449a.content).gameMessageId;
            } else if (i10 != 13) {
                j10 = i10 != 30 ? 0L : this.f13449a.replyToMessageId;
            } else {
                j10 = ((TdApi.MessagePinMessage) this.f13449a.content).messageId;
            }
            if (j10 == 0) {
                return true;
            }
            k5(j10);
            return true;
        }
        aVar.h(this);
        return true;
    }

    public boolean oa(a aVar, View view, o oVar) {
        int i10 = this.U2;
        if ((i10 == 6 || i10 == 100) && this.f12731g3 != null) {
            this.O0.hd().B8(Q0(), this.f12731g3, I2(), true, null, null);
            return true;
        } else if (i10 != 101 || this.f12731g3 == null) {
            aVar.h(this);
            return true;
        } else {
            this.O0.hd().A8(Q0(), this.f12731g3, I2(), true, true, null, null);
            return true;
        }
    }

    public Object pa(boolean z10, a[] aVarArr, boolean z11, CharSequence charSequence, int i10, int i11, int i12, boolean z12) {
        int P1;
        int i13 = 0;
        if (z10) {
            if (i12 == 0) {
                o oVar = new o(z12 ? ce.o.k() : ce.o.g(), 0);
                oVar.k(z12);
                return oVar;
            }
            i12--;
        }
        if (aVarArr == null || i12 >= aVarArr.length) {
            return null;
        }
        final a aVar = aVarArr[i12];
        if (aVar.f12755h != null) {
            return new o(null, 0).s(aVar);
        }
        boolean g10 = aVar.g();
        Typeface k10 = z12 ? ce.o.k() : (R9() || !g10) ? ce.o.g() : ce.o.i();
        boolean R9 = R9();
        int i14 = R.id.theme_color_messageAuthor;
        if (!R9 && g10) {
            i13 = R.id.theme_color_messageAuthor;
        }
        o oVar2 = new o(k10, i13);
        oVar2.k(z12);
        if (g10) {
            if (aVar.f12753f) {
                oVar2.q(new o.a() {
                    @Override
                    public final boolean a(View view, o oVar3) {
                        boolean na2;
                        na2 = a5.this.na(aVar, view, oVar3);
                        return na2;
                    }
                });
            } else {
                if (z11 && !(aVar.f12750c == null && aVar.f12751d == null && aVar.f12757j == 0)) {
                    if (aVar.f12751d != null) {
                        P1 = aVar.f12751d.f();
                    } else {
                        P1 = t2.P1(aVar.f12750c != null ? t2.H0(aVar.f12750c.f19979id, this.O0.fa()) : this.O0.e3(aVar.f12757j));
                    }
                    i14 = P1;
                }
                oVar2.u(i14, this.N0.r0().Lr());
                if (!R9()) {
                    oVar2.i(i14);
                }
                oVar2.q(new o.a() {
                    @Override
                    public final boolean a(View view, o oVar3) {
                        boolean oa2;
                        oa2 = a5.this.oa(aVar, view, oVar3);
                        return oa2;
                    }
                });
            }
        }
        return oVar2;
    }

    public boolean qa(long j10, View view, o oVar) {
        this.O0.hd().v7(Q0(), j10, h8());
        return true;
    }

    public void ra(TdApi.Message message) {
        if (!U5()) {
            this.f12737m3 = message;
            if (this.U2 == 10 && message.content.getConstructor() == -69441162) {
                this.f12736l3 = ((TdApi.MessageGame) message.content).game;
            }
            y8();
        }
    }

    public static void s5() {
        f12722x3 = a0.i(38.0f);
        int i10 = a0.i(12.0f);
        f12724z3 = i10;
        f12723y3 = i10 * 2;
        int i11 = a0.i(28.0f);
        B3 = i11;
        A3 = i11 * 2;
        C3 = a0.i(4.0f);
    }

    public static String za(String str) {
        return c0.o0(str);
    }

    @Override
    public void J8(p pVar) {
        pVar.G(this.f12726b3);
    }

    @Override
    public boolean L9(TdApi.Message message, TdApi.MessageContent messageContent, boolean z10) {
        this.f13449a.content = messageContent;
        y8();
        return true;
    }

    @Override
    public final int O3(boolean z10) {
        return B3;
    }

    @Override
    public boolean S0() {
        return true;
    }

    @Override
    public boolean S7(g1 g1Var, rh rhVar) {
        if (this.U2 != 27 || this.f12728d3 == 0) {
            return false;
        }
        this.O0.hd().M8(Q0(), this.f12728d3);
        return true;
    }

    @Override
    public l1 U3(long j10, View view, int i10, int i11, int i12) {
        l1 l1Var = new l1();
        l1Var.n();
        l1Var.p(O3(false));
        int i13 = this.f12741q3 + i10;
        int i14 = B3 * 2;
        int measuredHeight = view.getMeasuredHeight();
        int i15 = this.f12741q3;
        int i16 = (measuredHeight - (i15 + i14)) + i11;
        int i17 = this.f12740p3;
        l1Var.i(i17, i15 + i12, i17 + i14, i15 + i14 + i12);
        l1Var.l(0, i13 < 0 ? -i13 : 0, 0, i16 < 0 ? -i16 : 0);
        l1Var.m(R6().x3() ? R.id.theme_color_placeholder : R.id.theme_color_chatBackground);
        return l1Var;
    }

    @Override
    public int W2() {
        return this.f12733i3.getHeight() + a0.i(R9() ? 0.5f : 6.5f) + (this.f12726b3 != null ? C3 + A3 : 0);
    }

    @Override
    public void b0(int i10) {
        if (f12722x3 == 0.0f) {
            s5();
        }
        this.f12734j3 = this.N - f12723y3;
        xa();
        sa();
    }

    @Override
    public void c1(g1 g1Var, Canvas canvas, int i10, int i11, int i12, v vVar, v vVar2) {
        int i13;
        if (this.f12733i3 != null) {
            canvas.save();
            canvas.translate(f12724z3, la());
            if (R9()) {
                int lineCount = this.f12733i3.getLineCount();
                i13 = a2();
                int Z1 = Z1();
                RectF a02 = y.a0();
                int i14 = a0.i(8.0f);
                int i15 = a0.i(5.0f);
                int i16 = a0.i(26.0f);
                int i17 = a0.i(j.E());
                if (lineCount == 1) {
                    float f10 = i14;
                    a02.set(this.f12733i3.getLineLeft(0) - f10, this.f12733i3.getLineTop(0) - i15, this.f12733i3.getLineRight(0) + f10, (this.f12733i3.getLineTop(0) + i16) - i15);
                    float f11 = i17;
                    canvas.drawRoundRect(a02, f11, f11, y.g(Z1));
                } else {
                    a02.set(0.0f, 0.0f, 0.0f, 0.0f);
                    for (int i18 = 0; i18 < lineCount; i18++) {
                        float lineLeft = this.f12733i3.getLineLeft(i18);
                        float lineRight = this.f12733i3.getLineRight(i18);
                        float f12 = a02.left;
                        if (f12 == 0.0f || f12 > lineLeft) {
                            a02.left = lineLeft;
                        }
                        float f13 = a02.right;
                        if (f13 == 0.0f || f13 < lineRight) {
                            a02.right = lineRight;
                        }
                    }
                    float f14 = i14;
                    a02.left -= f14;
                    a02.right += f14;
                    a02.top = this.f12733i3.getLineTop(0) - i15;
                    a02.bottom = (this.f12733i3.getLineTop(lineCount - 1) - i15) + i16;
                    float f15 = i17;
                    canvas.drawRoundRect(a02, f15, f15, y.g(Z1));
                }
            } else {
                i13 = j.P0();
            }
            this.f12733i3.getPaint().setColor(i13);
            this.f12733i3.draw(canvas);
            canvas.restore();
            if (this.f12726b3 != null) {
                int measuredWidth = g1Var.getMeasuredWidth() / 2;
                int height = i11 + this.f12733i3.getHeight() + a0.i(14.0f) + B3;
                if (vVar2.e0()) {
                    canvas.drawCircle(measuredWidth, height, B3, y.U());
                }
                int i19 = B3;
                int i20 = measuredWidth - i19;
                this.f12740p3 = i20;
                int i21 = height - i19;
                this.f12741q3 = i21;
                vVar2.K0(i20, i21, measuredWidth + i19, height + i19);
                vVar2.draw(canvas);
            }
        }
    }

    @Override
    public boolean f8(vc.g1 r8, android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: hd.a5.f8(vc.g1, android.view.MotionEvent):boolean");
    }

    @Override
    public boolean i5() {
        return true;
    }

    public o ia(MotionEvent motionEvent) {
        CharSequence charSequence = this.f12738n3;
        if (!(charSequence instanceof Spannable)) {
            return null;
        }
        Spannable spannable = (Spannable) charSequence;
        o[] oVarArr = (o[]) spannable.getSpans(0, charSequence.length(), o.class);
        if (oVarArr.length == 0) {
            return null;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (this.f12746v3 == null) {
            this.f12746v3 = new Path();
            this.f12747w3 = new RectF();
        }
        for (o oVar : oVarArr) {
            if (oVar.c() != null) {
                this.f12733i3.getSelectionPath(spannable.getSpanStart(oVar), spannable.getSpanEnd(oVar), this.f12746v3);
                this.f12746v3.computeBounds(this.f12747w3, true);
                this.f12747w3.offset(f12724z3, la());
                if (this.f12747w3.contains(x10, y10)) {
                    return oVar;
                }
            }
        }
        return null;
    }

    public final void ja() {
        this.f12742r3 = 0.0f;
        this.f12743s3 = 0.0f;
        this.f12745u3 = false;
        this.f12744t3 = null;
    }

    public final TextPaint ka(boolean z10, boolean z11) {
        return z11 ? R9() ? y.l(z10, -1) : y.p(z10, j.P0()) : R9() ? y.k(z10) : y.o(z10);
    }

    public final int la() {
        return c3() + (R9() ? 0 : a0.i(3.0f));
    }

    public final boolean ma() {
        int i10 = this.U2;
        return i10 == 15 || i10 == 16;
    }

    @Override
    public boolean q7() {
        return true;
    }

    @Override
    public void r2(TdApi.Object object) {
        if (object.getConstructor() == 1435961258) {
            final TdApi.Message message = (TdApi.Message) object;
            this.O0.hd().post(new Runnable() {
                @Override
                public final void run() {
                    a5.this.ra(message);
                }
            });
        }
    }

    public final void sa() {
        if (this.f12738n3 != null) {
            TextPaint ka2 = ka(this.f12739o3, false);
            BoringLayout.Metrics isBoring = BoringLayout.isBoring(this.f12738n3, ka2);
            if (isBoring == null || isBoring.width > this.f12734j3) {
                CharSequence charSequence = this.f12738n3;
                this.f12733i3 = new StaticLayout(charSequence, 0, charSequence.length(), ka2, this.f12734j3, Layout.Alignment.ALIGN_CENTER, 1.0f, a0.i(4.0f), false);
                return;
            }
            this.f12733i3 = new BoringLayout(this.f12738n3, ka2, this.f12734j3, Layout.Alignment.ALIGN_CENTER, 1.0f, a0.i(4.0f), isBoring, false);
            return;
        }
        this.f12733i3 = null;
    }

    public final void ta(int i10, long j10, a... aVarArr) {
        wa(i10, true, j10, aVarArr);
    }

    @Override
    public boolean u0() {
        return !ma() && super.u0();
    }

    public final void ua(int i10, int i11, int i12, int i13, int i14, int i15, long j10, TimeUnit timeUnit, a... aVarArr) {
        long days = timeUnit.toDays(j10);
        long j11 = days / 30;
        long j12 = days / 7;
        long hours = timeUnit.toHours(j10);
        long minutes = timeUnit.toMinutes(j10);
        long seconds = timeUnit.toSeconds(j10);
        if (i15 != 0 && j11 > 0) {
            ta(i15, j11, aVarArr);
        } else if (i14 != 0 && j12 > 0) {
            ta(i14, j12, aVarArr);
        } else if (i13 != 0 && days > 0) {
            ta(i13, days, aVarArr);
        } else if (i12 != 0 && hours > 0) {
            ta(i12, hours, aVarArr);
        } else if (i11 != 0 && minutes > 0) {
            ta(i11, minutes, aVarArr);
        } else if (i10 != 0) {
            ta(i10, seconds, aVarArr);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void va(int i10, a... aVarArr) {
        wa(i10, false, 0L, aVarArr);
    }

    public final void wa(int i10, final boolean z10, long j10, final a... aVarArr) {
        boolean z11;
        o[] oVarArr;
        String str;
        a aVar;
        boolean z12;
        int i11;
        int i12;
        String str2;
        if ((aVarArr == null || aVarArr.length == 0) && !z10) {
            if (i10 != 0) {
                str2 = w.i1(i10);
            } else {
                str2 = this.f12732h3;
            }
            ya(str2);
            return;
        }
        final boolean i72 = i7();
        w.f v4Var = new w.f() {
            @Override
            public final Object a(CharSequence charSequence, int i13, int i14, int i15, boolean z13) {
                Object pa2;
                pa2 = a5.this.pa(z10, aVarArr, i72, charSequence, i13, i14, i15, z13);
                return pa2;
            }
        };
        boolean z13 = true;
        if (i10 == 0) {
            String str3 = this.f12732h3;
            if (str3 != null) {
                try {
                    ya(w.T(str3, v4Var, aVarArr));
                } catch (Throwable th) {
                    Log.e("Broken string format: %s", th, this.f12732h3);
                    ya(this.f12732h3);
                }
            }
        } else if (z10) {
            ya(w.n2(i10, j10, v4Var, aVarArr));
        } else {
            ya(w.h1(i10, v4Var, aVarArr));
        }
        CharSequence charSequence = this.f12738n3;
        if ((charSequence instanceof SpannableStringBuilder) && aVarArr != null && aVarArr.length > 0) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            int length = aVarArr.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    z11 = false;
                    break;
                } else if (aVarArr[i13].f12755h != null) {
                    z11 = true;
                    break;
                } else {
                    i13++;
                }
            }
            if (z11 && (oVarArr = (o[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), o.class)) != null && oVarArr.length > 0) {
                int length2 = oVarArr.length;
                int i14 = 0;
                while (i14 < length2) {
                    o oVar = oVarArr[i14];
                    a aVar2 = (a) oVar.d();
                    if (!(aVar2 == null || aVar2.f12755h == null)) {
                        int spanStart = spannableStringBuilder.getSpanStart(oVar);
                        int spanEnd = spannableStringBuilder.getSpanEnd(oVar);
                        spannableStringBuilder.removeSpan(oVar);
                        if (spanStart >= 0 && spanEnd >= 0) {
                            spannableStringBuilder.delete(spanStart, spanEnd);
                            String m02 = w.m0();
                            String n02 = w.n0(z13);
                            long[] jArr = aVar2.f12755h;
                            int length3 = jArr.length;
                            int i15 = 0;
                            int i16 = 0;
                            while (i15 < length3) {
                                final long j11 = jArr[i15];
                                oVarArr = oVarArr;
                                if (i16 > 0) {
                                    if (i16 == aVar2.f12755h.length - 1) {
                                        spannableStringBuilder.insert(spanStart, (CharSequence) n02);
                                        i12 = n02.length();
                                    } else {
                                        spannableStringBuilder.insert(spanStart, (CharSequence) m02);
                                        i12 = m02.length();
                                    }
                                    spanStart += i12;
                                }
                                String str4 = aVar2.f12756i[i16];
                                length2 = length2;
                                boolean M0 = g.M0(str4);
                                if (i72) {
                                    z12 = i72;
                                    str = m02;
                                    aVar = aVar2;
                                    i11 = t2.P1(t2.H0(j11, this.O0.fa()));
                                } else {
                                    z12 = i72;
                                    str = m02;
                                    aVar = aVar2;
                                    i11 = R.id.theme_color_messageAuthor;
                                }
                                spannableStringBuilder.insert(spanStart, (CharSequence) str4);
                                n02 = n02;
                                o u10 = new o(M0 ? ce.o.k() : R9() ? ce.o.g() : ce.o.i(), R9() ? 0 : i11).u(i11, this.N0.r0().Lr());
                                u10.k(M0);
                                u10.q(new o.a() {
                                    @Override
                                    public final boolean a(View view, o oVar2) {
                                        boolean qa2;
                                        qa2 = a5.this.qa(j11, view, oVar2);
                                        return qa2;
                                    }
                                });
                                spannableStringBuilder.setSpan(u10, spanStart, str4.length() + spanStart, 33);
                                spanStart += str4.length();
                                i16++;
                                i15++;
                                aVar2 = aVar;
                                m02 = str;
                                i72 = z12;
                            }
                        }
                    }
                    oVarArr = oVarArr;
                    length2 = length2;
                    i72 = i72;
                    i14++;
                    z13 = true;
                }
            }
        }
        if (!i.i(this.f12738n3)) {
            this.f12738n3 = d.z().I(this.f12738n3);
        }
    }

    public final void xa() {
        throw new UnsupportedOperationException("Method not decompiled: hd.a5.xa():void");
    }

    public final void ya(CharSequence charSequence) {
        this.f12738n3 = charSequence;
        this.f12739o3 = g.M0(charSequence);
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessageBasicGroupChatCreate messageBasicGroupChatCreate) {
        super(v2Var, message);
        this.U2 = 0;
        this.V2 = messageBasicGroupChatCreate.title;
    }

    public static class a {
        public String f12748a;
        public String f12749b;
        public TdApi.User f12750c;
        public fc f12751d;
        public TdApi.Location f12752e;
        public boolean f12753f;
        public boolean f12754g;
        public long[] f12755h;
        public String[] f12756i;
        public long f12757j;

        public a(s4 s4Var, long[] jArr) {
            this.f12755h = jArr;
            this.f12756i = new String[jArr.length];
            int i10 = 0;
            for (long j10 : jArr) {
                this.f12756i[i10] = a5.za(t2.p2(j10, s4Var.V9(j10)));
                i10++;
            }
        }

        public boolean g() {
            return (this.f12750c == null && this.f12751d == null && this.f12757j == 0 && this.f12752e == null && !this.f12754g && !this.f12753f) ? false : true;
        }

        public void h(s4 s4Var) {
            if (this.f12750c != null) {
                s4Var.O0.hd().v7(s4Var.Q0(), this.f12750c.f19979id, s4Var.h8());
                return;
            }
            fc fcVar = this.f12751d;
            if (fcVar != null) {
                if (fcVar.q()) {
                    s4Var.O0.hd().v7(s4Var.Q0(), this.f12751d.i(), s4Var.h8());
                } else if (this.f12751d.n()) {
                    s4Var.O0.hd().l7(s4Var.Q0(), this.f12751d.c(), null, s4Var.h8());
                }
            } else if (this.f12757j != 0) {
                s4Var.O0.hd().h7(s4Var.Q0(), this.f12757j, new hj.j().h().n());
            } else if (this.f12752e != null) {
                hj hd2 = s4Var.O0.hd();
                TdApi.Location location = this.f12752e;
                hd2.q7(s4Var, new yb.f(location.latitude, location.longitude).a(s4Var.f13449a.chatId, s4Var.a7().qk()).b(s4Var.f13449a.chatId));
            } else if (this.f12754g) {
                s4Var.O0.hd().G7(s4Var.Q0(), this.f12749b, s4Var.h8());
            }
        }

        public a i(boolean z10) {
            this.f12753f = z10;
            return this;
        }

        public a j(boolean z10) {
            this.f12754g = z10;
            if (z10) {
                this.f12748a = i.G(this.f12749b);
            }
            return this;
        }

        public final String toString() {
            String[] strArr = this.f12756i;
            return (strArr == null || strArr.length <= 0) ? this.f12748a : " ";
        }

        public a(String str) {
            this.f12749b = str;
            this.f12748a = a5.za(str);
        }

        public a(TdApi.User user) {
            this(user, false);
        }

        public a(fc fcVar) {
            this(fcVar, false);
        }

        public a(fc fcVar, boolean z10) {
            this.f12748a = z10 ? fcVar.g() : fcVar.e();
            this.f12751d = fcVar;
        }

        public a(String str, TdApi.Location location) {
            this.f12748a = str;
            this.f12752e = location;
        }

        public a(o6 o6Var, long j10) {
            this.f12748a = o6Var.U3(j10);
            this.f12757j = j10;
        }

        public a(TdApi.User user, boolean z10) {
            String str;
            if (user != null) {
                str = (!z10 || t2.I3(user)) ? t2.r2(user) : user.firstName;
            } else {
                str = w.i1(R.string.Somebody);
            }
            this.f12748a = str;
            this.f12750c = user;
        }

        public a(String str, TdApi.User user) {
            this.f12748a = a5.za(str);
            this.f12750c = user;
        }
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessageChatChangeTitle messageChatChangeTitle) {
        super(v2Var, message);
        this.U2 = 1;
        this.V2 = messageChatChangeTitle.title;
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessageChatJoinByLink messageChatJoinByLink) {
        super(v2Var, message);
        this.U2 = 6;
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessageChatJoinByRequest messageChatJoinByRequest) {
        super(v2Var, message);
        this.U2 = 7;
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessageContactRegistered messageContactRegistered) {
        super(v2Var, message);
        this.U2 = 14;
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessageChatChangePhoto messageChatChangePhoto) {
        super(v2Var, message);
        TdApi.PhotoSize[] photoSizeArr;
        if (!X5() || message.content.getConstructor() != 0) {
            this.U2 = 2;
        } else {
            TdApi.ChatEventAction chatEventAction = ((o7) message.content).f13336a.action;
            if (chatEventAction.getConstructor() == -811572541 && ((TdApi.ChatEventPhotoChanged) chatEventAction).newPhoto == null) {
                this.U2 = 3;
            } else {
                this.U2 = 2;
            }
        }
        TdApi.ChatPhoto chatPhoto = messageChatChangePhoto.photo;
        this.f12725a3 = chatPhoto;
        if (chatPhoto != null) {
            TdApi.PhotoSize photoSize = null;
            int i10 = 0;
            int i11 = 0;
            for (TdApi.PhotoSize photoSize2 : chatPhoto.sizes) {
                if (i10 == 0 || i11 == 0 || photoSize2.width < i10 || photoSize2.height < i11) {
                    int i12 = photoSize2.width;
                    i11 = photoSize2.height;
                    i10 = i12;
                    photoSize = photoSize2;
                }
            }
            if (photoSize != null) {
                h hVar = new h(this.O0, photoSize.photo);
                this.f12726b3 = hVar;
                hVar.t0(wc.a.getDefaultAvatarCacheSize());
            }
        }
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessageChatAddMembers messageChatAddMembers) {
        super(v2Var, message);
        this.U2 = 4;
        this.Z2 = messageChatAddMembers.memberUserIds;
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessageChatDeleteMember messageChatDeleteMember) {
        super(v2Var, message);
        this.U2 = 5;
        this.W2 = V9(messageChatDeleteMember.userId);
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessageSupergroupChatCreate messageSupergroupChatCreate) {
        super(v2Var, message);
        this.U2 = 0;
        this.V2 = messageSupergroupChatCreate.title;
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessageChatUpgradeTo messageChatUpgradeTo) {
        super(v2Var, message);
        this.U2 = 8;
        this.f12728d3 = messageChatUpgradeTo.supergroupId;
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessageChatUpgradeFrom messageChatUpgradeFrom) {
        super(v2Var, message);
        this.U2 = 9;
        this.f12728d3 = messageChatUpgradeFrom.basicGroupId;
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessageScreenshotTaken messageScreenshotTaken) {
        super(v2Var, message);
        this.U2 = 11;
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessagePinMessage messagePinMessage) {
        super(v2Var, message);
        this.U2 = 13;
        if (messagePinMessage.messageId != 0) {
            this.O0.v4().o(new TdApi.GetMessage(message.chatId, messagePinMessage.messageId), this);
        }
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessageWebsiteConnected messageWebsiteConnected) {
        super(v2Var, message);
        this.U2 = 31;
        this.f12729e3 = messageWebsiteConnected.domainName;
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessageChatSetTtl messageChatSetTtl) {
        super(v2Var, message);
        this.U2 = 12;
        this.f12735k3 = messageChatSetTtl.ttl;
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessageExpiredPhoto messageExpiredPhoto) {
        super(v2Var, message);
        this.U2 = 15;
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessageExpiredVideo messageExpiredVideo) {
        super(v2Var, message);
        this.U2 = 16;
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessageGameScore messageGameScore) {
        super(v2Var, message);
        this.U2 = 10;
        if (messageGameScore.gameMessageId != 0) {
            this.O0.v4().o(new TdApi.GetMessage(message.chatId, messageGameScore.gameMessageId), this);
        }
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessageVideoChatStarted messageVideoChatStarted) {
        super(v2Var, message);
        this.U2 = 90;
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessageVideoChatScheduled messageVideoChatScheduled) {
        super(v2Var, message);
        this.U2 = 94;
        this.f12728d3 = messageVideoChatScheduled.startDate;
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessageVideoChatEnded messageVideoChatEnded) {
        super(v2Var, message);
        this.U2 = 91;
        this.f12728d3 = messageVideoChatEnded.duration;
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessageInviteVideoChatParticipants messageInviteVideoChatParticipants) {
        super(v2Var, message);
        this.U2 = 92;
        this.Z2 = messageInviteVideoChatParticipants.userIds;
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessageProximityAlertTriggered messageProximityAlertTriggered) {
        super(v2Var, message);
        this.U2 = 93;
        this.f12728d3 = messageProximityAlertTriggered.distance;
    }

    public a5(vc.v2 r6, org.drinkless.td.libcore.telegram.TdApi.Message r7, org.drinkless.td.libcore.telegram.TdApi.ChatEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: hd.a5.<init>(vc.v2, org.drinkless.td.libcore.telegram.TdApi$Message, org.drinkless.td.libcore.telegram.TdApi$ChatEvent):void");
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessagePaymentSuccessful messagePaymentSuccessful) {
        super(v2Var, message);
        this.U2 = 30;
        this.f12729e3 = e.a(messagePaymentSuccessful.currency, messagePaymentSuccessful.totalAmount);
        if (messagePaymentSuccessful.invoiceMessageId != 0) {
            this.O0.v4().o(new TdApi.GetMessage(message.chatId, messagePaymentSuccessful.invoiceMessageId), this);
        }
    }

    public a5(v2 v2Var, TdApi.Message message, TdApi.MessageCustomServiceAction messageCustomServiceAction) {
        super(v2Var, message);
        this.U2 = 32;
        this.f12732h3 = messageCustomServiceAction.text;
    }
}
