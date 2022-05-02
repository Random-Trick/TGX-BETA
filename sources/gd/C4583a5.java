package gd;

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
import be.C1357a0;
import be.C1363c0;
import be.C1389o;
import be.C1410y;
import ie.RunnableC5390g;
import java.util.concurrent.TimeUnit;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p038ce.AbstractView$OnClickListenerC3344yb;
import p038ce.View$OnClickListenerC2971rh;
import p082fd.C4403w;
import p108hb.C5065e;
import p108hb.C5070i;
import p110hd.C5078d;
import p111he.C5132o;
import p156kd.AbstractC6264v;
import p156kd.C6246h;
import p156kd.C6257p;
import p194nd.C7462l1;
import p291uc.C9552h1;
import p291uc.C9678w2;
import p350yd.C10712hc;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import p364zd.C11524j;
import vc.C9903a;

public class C4583a5 extends AbstractC4761s4 implements Client.AbstractC7865g {
    public static int f15069A3;
    public static int f15070B3;
    public static int f15071C3;
    public static int f15072x3;
    public static int f15073y3;
    public static int f15074z3;
    public int f15075U2;
    public String f15076V2;
    public TdApi.User f15077W2;
    public TdApi.User f15078X2;
    public C10712hc f15079Y2;
    public long[] f15080Z2;
    public TdApi.ChatPhoto f15081a3;
    public C6246h f15082b3;
    public boolean f15083c3;
    public long f15084d3;
    public String f15085e3;
    public TdApi.Location f15086f3;
    public TdApi.ChatInviteLink f15087g3;
    public String f15088h3;
    public Layout f15089i3;
    public int f15090j3;
    public int f15091k3;
    public TdApi.Game f15092l3;
    public TdApi.Message f15093m3;
    public CharSequence f15094n3;
    public boolean f15095o3;
    public int f15096p3;
    public int f15097q3;
    public float f15098r3;
    public float f15099s3;
    public C5132o f15100t3;
    public boolean f15101u3;
    public Path f15102v3;
    public RectF f15103w3;

    public C4583a5(C9678w2 w2Var, TdApi.Message message, int i) {
        super(w2Var, message);
        this.f15075U2 = i;
    }

    public boolean m27239na(C4584a aVar, View view, C5132o oVar) {
        long j;
        int i = this.f15075U2;
        if (i == 10 || i == 13 || i == 30) {
            if (i == 10) {
                j = ((TdApi.MessageGameScore) this.f16122a.content).gameMessageId;
            } else if (i != 13) {
                j = i != 30 ? 0L : this.f16122a.replyToMessageId;
            } else {
                j = ((TdApi.MessagePinMessage) this.f16122a.content).messageId;
            }
            if (j == 0) {
                return true;
            }
            m25882l5(j);
            return true;
        }
        aVar.m27218h(this);
        return true;
    }

    public boolean m27238oa(C4584a aVar, View view, C5132o oVar) {
        int i = this.f15075U2;
        if ((i == 6 || i == 100) && this.f15087g3 != null) {
            this.f16099O0.m2485dd().m3887B8(m26096P0(), this.f15087g3, m26145K2(), true, null, null);
            return true;
        } else if (i != 101 || this.f15087g3 == null) {
            aVar.m27218h(this);
            return true;
        } else {
            this.f16099O0.m2485dd().m3897A8(m26096P0(), this.f15087g3, m26145K2(), true, true, null, null);
            return true;
        }
    }

    public Object m27237pa(boolean z, C4584a[] aVarArr, boolean z2, CharSequence charSequence, int i, int i2, int i3, boolean z3) {
        int P1;
        int i4 = 0;
        if (z) {
            if (i3 == 0) {
                C5132o oVar = new C5132o(z3 ? C1389o.m37258k() : C1389o.m37262g(), 0);
                oVar.m23851k(z3);
                return oVar;
            }
            i3--;
        }
        if (aVarArr == null || i3 >= aVarArr.length) {
            return null;
        }
        final C4584a aVar = aVarArr[i3];
        if (aVar.f15111h != null) {
            return new C5132o(null, 0).m23843s(aVar);
        }
        boolean g = aVar.m27219g();
        Typeface k = z3 ? C1389o.m37258k() : (m26068R9() || !g) ? C1389o.m37262g() : C1389o.m37260i();
        boolean R9 = m26068R9();
        int i5 = R.id.theme_color_messageAuthor;
        if (!R9 && g) {
            i4 = R.id.theme_color_messageAuthor;
        }
        C5132o oVar2 = new C5132o(k, i4);
        oVar2.m23851k(z3);
        if (g) {
            if (aVar.f15109f) {
                oVar2.m23845q(new C5132o.AbstractC5133a() {
                    @Override
                    public final boolean mo490a(View view, C5132o oVar3) {
                        boolean na2;
                        na2 = C4583a5.this.m27239na(aVar, view, oVar3);
                        return na2;
                    }
                });
            } else {
                if (z2 && !(aVar.f15106c == null && aVar.f15107d == null && aVar.f15113j == 0)) {
                    if (aVar.f15107d != null) {
                        P1 = aVar.f15107d.m4210f();
                    } else {
                        P1 = C4779t2.m25624P1(aVar.f15106c != null ? C4779t2.m25681H0(aVar.f15106c.f25439id, this.f16099O0.m2519ba()) : this.f16099O0.m2511c3(aVar.f15113j));
                    }
                    i5 = P1;
                }
                oVar2.m23841u(i5, this.f16097N0.m7645r0().m32662Lr());
                if (!m26068R9()) {
                    oVar2.m23853i(i5);
                }
                oVar2.m23845q(new C5132o.AbstractC5133a() {
                    @Override
                    public final boolean mo490a(View view, C5132o oVar3) {
                        boolean oa;
                        oa = C4583a5.this.m27238oa(aVar, view, oVar3);
                        return oa;
                    }
                });
            }
        }
        return oVar2;
    }

    public boolean m27236qa(long j, View view, C5132o oVar) {
        this.f16099O0.m2485dd().m3429v7(m26096P0(), j, m25916h8());
        return true;
    }

    public void m27235ra(TdApi.Message message) {
        if (!m26030V5()) {
            this.f15093m3 = message;
            if (this.f15075U2 == 10 && message.content.getConstructor() == -69441162) {
                this.f15092l3 = ((TdApi.MessageGame) message.content).game;
            }
            m25748y8();
        }
    }

    public static void m27234s5() {
        f15072x3 = C1357a0.m37541i(38.0f);
        int i = C1357a0.m37541i(12.0f);
        f15074z3 = i;
        f15073y3 = i * 2;
        int i2 = C1357a0.m37541i(28.0f);
        f15070B3 = i2;
        f15069A3 = i2 * 2;
        f15071C3 = C1357a0.m37541i(4.0f);
    }

    public static String m27226za(String str) {
        return C1363c0.m37418o0(str);
    }

    @Override
    public void mo26150J8(C6257p pVar) {
        pVar.m20819G(this.f15082b3);
    }

    @Override
    public boolean mo25333L9(TdApi.Message message, TdApi.MessageContent messageContent, boolean z) {
        this.f16122a.content = messageContent;
        m25748y8();
        return true;
    }

    @Override
    public final int mo26074R3(boolean z) {
        return f15070B3;
    }

    @Override
    public boolean mo26066S0() {
        return true;
    }

    @Override
    public boolean mo26059S7(C9552h1 h1Var, View$OnClickListenerC2971rh rhVar) {
        if (this.f15075U2 != 27 || this.f15084d3 == 0) {
            return false;
        }
        this.f16099O0.m2485dd().m3777M8(m26096P0(), this.f15084d3);
        return true;
    }

    @Override
    public C7462l1 mo26022W3(long j, View view, int i, int i2, int i3) {
        C7462l1 l1Var = new C7462l1();
        l1Var.m15986n();
        l1Var.m15984p(mo26074R3(false));
        int i4 = this.f15097q3 + i;
        int i5 = f15070B3 * 2;
        int measuredHeight = view.getMeasuredHeight();
        int i6 = this.f15097q3;
        int i7 = (measuredHeight - (i6 + i5)) + i2;
        int i8 = this.f15096p3;
        l1Var.m15991i(i8, i6 + i3, i8 + i5, i6 + i5 + i3);
        l1Var.m15988l(0, i4 < 0 ? -i4 : 0, 0, i7 < 0 ? -i7 : 0);
        l1Var.m15987m(m26071R6().m7615x3() ? R.id.theme_color_placeholder : R.id.theme_color_chatBackground);
        return l1Var;
    }

    @Override
    public int mo25222X2() {
        return this.f15089i3.getHeight() + C1357a0.m37541i(m26068R9() ? 0.5f : 6.5f) + (this.f15082b3 != null ? f15071C3 + f15069A3 : 0);
    }

    @Override
    public void mo25221a0(int i) {
        if (f15072x3 == 0.0f) {
            m27234s5();
        }
        this.f15090j3 = this.f16096N - f15073y3;
        m27228xa();
        m27233sa();
    }

    @Override
    public void mo25961d1(C9552h1 h1Var, Canvas canvas, int i, int i2, int i3, AbstractC6264v vVar, AbstractC6264v vVar2) {
        int i4;
        if (this.f15089i3 != null) {
            canvas.save();
            canvas.translate(f15074z3, m27241la());
            if (m26068R9()) {
                int lineCount = this.f15089i3.getLineCount();
                i4 = m25960d2();
                int c2 = m25969c2();
                RectF a0 = C1410y.m37050a0();
                int i5 = C1357a0.m37541i(8.0f);
                int i6 = C1357a0.m37541i(5.0f);
                int i7 = C1357a0.m37541i(26.0f);
                int i8 = C1357a0.m37541i(C11524j.m242G());
                if (lineCount == 1) {
                    float f = i5;
                    a0.set(this.f15089i3.getLineLeft(0) - f, this.f15089i3.getLineTop(0) - i6, this.f15089i3.getLineRight(0) + f, (this.f15089i3.getLineTop(0) + i7) - i6);
                    float f2 = i8;
                    canvas.drawRoundRect(a0, f2, f2, C1410y.m37039g(c2));
                } else {
                    a0.set(0.0f, 0.0f, 0.0f, 0.0f);
                    for (int i9 = 0; i9 < lineCount; i9++) {
                        float lineLeft = this.f15089i3.getLineLeft(i9);
                        float lineRight = this.f15089i3.getLineRight(i9);
                        float f3 = a0.left;
                        if (f3 == 0.0f || f3 > lineLeft) {
                            a0.left = lineLeft;
                        }
                        float f4 = a0.right;
                        if (f4 == 0.0f || f4 < lineRight) {
                            a0.right = lineRight;
                        }
                    }
                    float f5 = i5;
                    a0.left -= f5;
                    a0.right += f5;
                    a0.top = this.f15089i3.getLineTop(0) - i6;
                    a0.bottom = (this.f15089i3.getLineTop(lineCount - 1) - i6) + i7;
                    float f6 = i8;
                    canvas.drawRoundRect(a0, f6, f6, C1410y.m37039g(c2));
                }
            } else {
                i4 = C11524j.m217S0();
            }
            this.f15089i3.getPaint().setColor(i4);
            this.f15089i3.draw(canvas);
            canvas.restore();
            if (this.f15082b3 != null) {
                int measuredWidth = h1Var.getMeasuredWidth() / 2;
                int height = i2 + this.f15089i3.getHeight() + C1357a0.m37541i(14.0f) + f15070B3;
                if (vVar2.mo20246c0()) {
                    canvas.drawCircle(measuredWidth, height, f15070B3, C1410y.m37057U());
                }
                int i10 = f15070B3;
                int i11 = measuredWidth - i10;
                this.f15096p3 = i11;
                int i12 = height - i10;
                this.f15097q3 = i12;
                vVar2.mo20256K0(i11, i12, measuredWidth + i10, height + i10);
                vVar2.draw(canvas);
            }
        }
    }

    @Override
    public boolean mo25217f8(p291uc.C9552h1 r8, android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4583a5.mo25217f8(uc.h1, android.view.MotionEvent):boolean");
    }

    public C5132o m27244ia(MotionEvent motionEvent) {
        CharSequence charSequence = this.f15094n3;
        if (!(charSequence instanceof Spannable)) {
            return null;
        }
        Spannable spannable = (Spannable) charSequence;
        C5132o[] oVarArr = (C5132o[]) spannable.getSpans(0, charSequence.length(), C5132o.class);
        if (oVarArr.length == 0) {
            return null;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (this.f15102v3 == null) {
            this.f15102v3 = new Path();
            this.f15103w3 = new RectF();
        }
        for (C5132o oVar : oVarArr) {
            if (oVar.m23859c() != null) {
                this.f15089i3.getSelectionPath(spannable.getSpanStart(oVar), spannable.getSpanEnd(oVar), this.f15102v3);
                this.f15102v3.computeBounds(this.f15103w3, true);
                this.f15103w3.offset(f15074z3, m27241la());
                if (this.f15103w3.contains(x, y)) {
                    return oVar;
                }
            }
        }
        return null;
    }

    @Override
    public boolean mo25351j5() {
        return true;
    }

    public final void m27243ja() {
        this.f15098r3 = 0.0f;
        this.f15099s3 = 0.0f;
        this.f15101u3 = false;
        this.f15100t3 = null;
    }

    public final TextPaint m27242ka(boolean z, boolean z2) {
        return z2 ? m26068R9() ? C1410y.m37029l(z, -1) : C1410y.m37021p(z, C11524j.m217S0()) : m26068R9() ? C1410y.m37031k(z) : C1410y.m37023o(z);
    }

    public final int m27241la() {
        return m25949e3() + (m26068R9() ? 0 : C1357a0.m37541i(3.0f));
    }

    public final boolean m27240ma() {
        int i = this.f15075U2;
        return i == 15 || i == 16;
    }

    @Override
    public boolean mo25829q7() {
        return true;
    }

    public final void m27233sa() {
        if (this.f15094n3 != null) {
            TextPaint ka = m27242ka(this.f15095o3, false);
            BoringLayout.Metrics isBoring = BoringLayout.isBoring(this.f15094n3, ka);
            if (isBoring == null || isBoring.width > this.f15090j3) {
                CharSequence charSequence = this.f15094n3;
                this.f15089i3 = new StaticLayout(charSequence, 0, charSequence.length(), ka, this.f15090j3, Layout.Alignment.ALIGN_CENTER, 1.0f, C1357a0.m37541i(4.0f), false);
                return;
            }
            this.f15089i3 = new BoringLayout(this.f15094n3, ka, this.f15090j3, Layout.Alignment.ALIGN_CENTER, 1.0f, C1357a0.m37541i(4.0f), isBoring, false);
            return;
        }
        this.f15089i3 = null;
    }

    @Override
    public boolean mo25806t0() {
        return !m27240ma() && super.mo25806t0();
    }

    @Override
    public void mo255t2(TdApi.Object object) {
        if (object.getConstructor() == 1435961258) {
            final TdApi.Message message = (TdApi.Message) object;
            this.f16099O0.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C4583a5.this.m27235ra(message);
                }
            });
        }
    }

    public final void m27232ta(int i, long j, C4584a... aVarArr) {
        m27229wa(i, true, j, aVarArr);
    }

    public final void m27231ua(int i, int i2, int i3, int i4, int i5, int i6, long j, TimeUnit timeUnit, C4584a... aVarArr) {
        long days = timeUnit.toDays(j);
        long j2 = days / 30;
        long j3 = days / 7;
        long hours = timeUnit.toHours(j);
        long minutes = timeUnit.toMinutes(j);
        long seconds = timeUnit.toSeconds(j);
        if (i6 != 0 && j2 > 0) {
            m27232ta(i6, j2, aVarArr);
        } else if (i5 != 0 && j3 > 0) {
            m27232ta(i5, j3, aVarArr);
        } else if (i4 != 0 && days > 0) {
            m27232ta(i4, days, aVarArr);
        } else if (i3 != 0 && hours > 0) {
            m27232ta(i3, hours, aVarArr);
        } else if (i2 != 0 && minutes > 0) {
            m27232ta(i2, minutes, aVarArr);
        } else if (i != 0) {
            m27232ta(i, seconds, aVarArr);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void m27230va(int i, C4584a... aVarArr) {
        m27229wa(i, false, 0L, aVarArr);
    }

    public final void m27229wa(int i, final boolean z, long j, final C4584a... aVarArr) {
        boolean z2;
        C5132o[] oVarArr;
        String str;
        C4584a aVar;
        boolean z3;
        int i2;
        int i3;
        String str2;
        if ((aVarArr == null || aVarArr.length == 0) && !z) {
            if (i != 0) {
                str2 = C4403w.m27869i1(i);
            } else {
                str2 = this.f15088h3;
            }
            m27227ya(str2);
            return;
        }
        final boolean i7 = m25907i7();
        C4403w.AbstractC4409f v4Var = new C4403w.AbstractC4409f() {
            @Override
            public final Object mo379a(CharSequence charSequence, int i4, int i5, int i6, boolean z4) {
                Object pa2;
                pa2 = C4583a5.this.m27237pa(z, aVarArr, i7, charSequence, i4, i5, i6, z4);
                return pa2;
            }
        };
        boolean z4 = true;
        if (i == 0) {
            String str3 = this.f15088h3;
            if (str3 != null) {
                try {
                    m27227ya(C4403w.m27935T(str3, v4Var, aVarArr));
                } catch (Throwable th) {
                    Log.m14725e("Broken string format: %s", th, this.f15088h3);
                    m27227ya(this.f15088h3);
                }
            }
        } else if (z) {
            m27227ya(C4403w.m27848n2(i, j, v4Var, aVarArr));
        } else {
            m27227ya(C4403w.m27873h1(i, v4Var, aVarArr));
        }
        CharSequence charSequence = this.f15094n3;
        if ((charSequence instanceof SpannableStringBuilder) && aVarArr != null && aVarArr.length > 0) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            int length = aVarArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    z2 = false;
                    break;
                } else if (aVarArr[i4].f15111h != null) {
                    z2 = true;
                    break;
                } else {
                    i4++;
                }
            }
            if (z2 && (oVarArr = (C5132o[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C5132o.class)) != null && oVarArr.length > 0) {
                int length2 = oVarArr.length;
                int i5 = 0;
                while (i5 < length2) {
                    C5132o oVar = oVarArr[i5];
                    C4584a aVar2 = (C4584a) oVar.m23858d();
                    if (!(aVar2 == null || aVar2.f15111h == null)) {
                        int spanStart = spannableStringBuilder.getSpanStart(oVar);
                        int spanEnd = spannableStringBuilder.getSpanEnd(oVar);
                        spannableStringBuilder.removeSpan(oVar);
                        if (spanStart >= 0 && spanEnd >= 0) {
                            spannableStringBuilder.delete(spanStart, spanEnd);
                            String m0 = C4403w.m27854m0();
                            String n0 = C4403w.m27850n0(z4);
                            long[] jArr = aVar2.f15111h;
                            int length3 = jArr.length;
                            int i6 = 0;
                            int i8 = 0;
                            while (i6 < length3) {
                                final long j2 = jArr[i6];
                                oVarArr = oVarArr;
                                if (i8 > 0) {
                                    if (i8 == aVar2.f15111h.length - 1) {
                                        spannableStringBuilder.insert(spanStart, (CharSequence) n0);
                                        i3 = n0.length();
                                    } else {
                                        spannableStringBuilder.insert(spanStart, (CharSequence) m0);
                                        i3 = m0.length();
                                    }
                                    spanStart += i3;
                                }
                                String str4 = aVar2.f15112i[i8];
                                length2 = length2;
                                boolean M0 = RunnableC5390g.m22983M0(str4);
                                if (i7) {
                                    z3 = i7;
                                    str = m0;
                                    aVar = aVar2;
                                    i2 = C4779t2.m25624P1(C4779t2.m25681H0(j2, this.f16099O0.m2519ba()));
                                } else {
                                    z3 = i7;
                                    str = m0;
                                    aVar = aVar2;
                                    i2 = R.id.theme_color_messageAuthor;
                                }
                                spannableStringBuilder.insert(spanStart, (CharSequence) str4);
                                n0 = n0;
                                C5132o u = new C5132o(M0 ? C1389o.m37258k() : m26068R9() ? C1389o.m37262g() : C1389o.m37260i(), m26068R9() ? 0 : i2).m23841u(i2, this.f16097N0.m7645r0().m32662Lr());
                                u.m23851k(M0);
                                u.m23845q(new C5132o.AbstractC5133a() {
                                    @Override
                                    public final boolean mo490a(View view, C5132o oVar2) {
                                        boolean qa2;
                                        qa2 = C4583a5.this.m27236qa(j2, view, oVar2);
                                        return qa2;
                                    }
                                });
                                spannableStringBuilder.setSpan(u, spanStart, str4.length() + spanStart, 33);
                                spanStart += str4.length();
                                i8++;
                                i6++;
                                aVar2 = aVar;
                                m0 = str;
                                i7 = z3;
                            }
                        }
                    }
                    oVarArr = oVarArr;
                    length2 = length2;
                    i7 = i7;
                    i5++;
                    z4 = true;
                }
            }
        }
        if (!C5070i.m24061i(this.f15094n3)) {
            this.f15094n3 = C5078d.m23986z().m24024I(this.f15094n3);
        }
    }

    public final void m27228xa() {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4583a5.m27228xa():void");
    }

    public final void m27227ya(CharSequence charSequence) {
        this.f15094n3 = charSequence;
        this.f15095o3 = RunnableC5390g.m22983M0(charSequence);
    }

    public C4583a5(C9678w2 w2Var, TdApi.Message message, TdApi.MessageBasicGroupChatCreate messageBasicGroupChatCreate) {
        super(w2Var, message);
        this.f15075U2 = 0;
        this.f15076V2 = messageBasicGroupChatCreate.title;
    }

    public static class C4584a {
        public String f15104a;
        public String f15105b;
        public TdApi.User f15106c;
        public C10712hc f15107d;
        public TdApi.Location f15108e;
        public boolean f15109f;
        public boolean f15110g;
        public long[] f15111h;
        public String[] f15112i;
        public long f15113j;

        public C4584a(AbstractC4761s4 s4Var, long[] jArr) {
            this.f15111h = jArr;
            this.f15112i = new String[jArr.length];
            int i = 0;
            for (long j : jArr) {
                this.f15112i[i] = C4583a5.m27226za(C4779t2.m25451p2(j, s4Var.m26027V9(j)));
                i++;
            }
        }

        public boolean m27219g() {
            return (this.f15106c == null && this.f15107d == null && this.f15113j == 0 && this.f15108e == null && !this.f15110g && !this.f15109f) ? false : true;
        }

        public void m27218h(AbstractC4761s4 s4Var) {
            if (this.f15106c != null) {
                s4Var.f16099O0.m2485dd().m3429v7(s4Var.m26096P0(), this.f15106c.f25439id, s4Var.m25916h8());
                return;
            }
            C10712hc hcVar = this.f15107d;
            if (hcVar != null) {
                if (hcVar.m4199q()) {
                    s4Var.f16099O0.m2485dd().m3429v7(s4Var.m26096P0(), this.f15107d.m4207i(), s4Var.m25916h8());
                } else if (this.f15107d.m4202n()) {
                    s4Var.f16099O0.m2485dd().m3529l7(s4Var.m26096P0(), this.f15107d.m4213c(), null, s4Var.m25916h8());
                }
            } else if (this.f15113j != 0) {
                s4Var.f16099O0.m2485dd().m3569h7(s4Var.m26096P0(), this.f15113j, new HandlerC10770jj.C10780j().m3368h().m3362n());
            } else if (this.f15108e != null) {
                HandlerC10770jj dd = s4Var.f16099O0.m2485dd();
                TdApi.Location location = this.f15108e;
                dd.m3479q7(s4Var, new AbstractView$OnClickListenerC3344yb.C3351f(location.latitude, location.longitude).m30702a(s4Var.f16122a.chatId, s4Var.m25981a7().m32266qk()).m30701b(s4Var.f16122a.chatId));
            } else if (this.f15110g) {
                s4Var.f16099O0.m2485dd().m3838G7(s4Var.m26096P0(), this.f15105b, s4Var.m25916h8());
            }
        }

        public C4584a m27217i(boolean z) {
            this.f15109f = z;
            return this;
        }

        public C4584a m27216j(boolean z) {
            this.f15110g = z;
            if (z) {
                this.f15104a = C5070i.m24071G(this.f15105b);
            }
            return this;
        }

        public final String toString() {
            String[] strArr = this.f15112i;
            return (strArr == null || strArr.length <= 0) ? this.f15104a : " ";
        }

        public C4584a(String str) {
            this.f15105b = str;
            this.f15104a = C4583a5.m27226za(str);
        }

        public C4584a(TdApi.User user) {
            this(user, false);
        }

        public C4584a(C10712hc hcVar) {
            this(hcVar, false);
        }

        public C4584a(C10712hc hcVar, boolean z) {
            this.f15104a = z ? hcVar.m4209g() : hcVar.m4211e();
            this.f15107d = hcVar;
        }

        public C4584a(String str, TdApi.Location location) {
            this.f15104a = str;
            this.f15108e = location;
        }

        public C4584a(C10930q6 q6Var, long j) {
            this.f15104a = q6Var.m2691Q3(j);
            this.f15113j = j;
        }

        public C4584a(TdApi.User user, boolean z) {
            String str;
            if (user != null) {
                str = (!z || C4779t2.m25671I3(user)) ? C4779t2.m25437r2(user) : user.firstName;
            } else {
                str = C4403w.m27869i1(R.string.Somebody);
            }
            this.f15104a = str;
            this.f15106c = user;
        }

        public C4584a(String str, TdApi.User user) {
            this.f15104a = C4583a5.m27226za(str);
            this.f15106c = user;
        }
    }

    public C4583a5(C9678w2 w2Var, TdApi.Message message, TdApi.MessageChatChangeTitle messageChatChangeTitle) {
        super(w2Var, message);
        this.f15075U2 = 1;
        this.f15076V2 = messageChatChangeTitle.title;
    }

    public C4583a5(C9678w2 w2Var, TdApi.Message message, TdApi.MessageChatJoinByLink messageChatJoinByLink) {
        super(w2Var, message);
        this.f15075U2 = 6;
    }

    public C4583a5(C9678w2 w2Var, TdApi.Message message, TdApi.MessageChatJoinByRequest messageChatJoinByRequest) {
        super(w2Var, message);
        this.f15075U2 = 7;
    }

    public C4583a5(C9678w2 w2Var, TdApi.Message message, TdApi.MessageContactRegistered messageContactRegistered) {
        super(w2Var, message);
        this.f15075U2 = 14;
    }

    public C4583a5(C9678w2 w2Var, TdApi.Message message, TdApi.MessageChatChangePhoto messageChatChangePhoto) {
        super(w2Var, message);
        TdApi.PhotoSize[] photoSizeArr;
        if (!m26002Y5() || message.content.getConstructor() != 0) {
            this.f15075U2 = 2;
        } else {
            TdApi.ChatEventAction chatEventAction = ((C4728o7) message.content).f15918a.action;
            if (chatEventAction.getConstructor() == -811572541 && ((TdApi.ChatEventPhotoChanged) chatEventAction).newPhoto == null) {
                this.f15075U2 = 3;
            } else {
                this.f15075U2 = 2;
            }
        }
        TdApi.ChatPhoto chatPhoto = messageChatChangePhoto.photo;
        this.f15081a3 = chatPhoto;
        if (chatPhoto != null) {
            TdApi.PhotoSize photoSize = null;
            int i = 0;
            int i2 = 0;
            for (TdApi.PhotoSize photoSize2 : chatPhoto.sizes) {
                if (i == 0 || i2 == 0 || photoSize2.width < i || photoSize2.height < i2) {
                    int i3 = photoSize2.width;
                    i2 = photoSize2.height;
                    i = i3;
                    photoSize = photoSize2;
                }
            }
            if (photoSize != null) {
                C6246h hVar = new C6246h(this.f16099O0, photoSize.photo);
                this.f15082b3 = hVar;
                hVar.mo20767t0(C9903a.getDefaultAvatarCacheSize());
            }
        }
    }

    public C4583a5(C9678w2 w2Var, TdApi.Message message, TdApi.MessageChatAddMembers messageChatAddMembers) {
        super(w2Var, message);
        this.f15075U2 = 4;
        this.f15080Z2 = messageChatAddMembers.memberUserIds;
    }

    public C4583a5(C9678w2 w2Var, TdApi.Message message, TdApi.MessageChatDeleteMember messageChatDeleteMember) {
        super(w2Var, message);
        this.f15075U2 = 5;
        this.f15077W2 = m26027V9(messageChatDeleteMember.userId);
    }

    public C4583a5(C9678w2 w2Var, TdApi.Message message, TdApi.MessageSupergroupChatCreate messageSupergroupChatCreate) {
        super(w2Var, message);
        this.f15075U2 = 0;
        this.f15076V2 = messageSupergroupChatCreate.title;
    }

    public C4583a5(C9678w2 w2Var, TdApi.Message message, TdApi.MessageChatUpgradeTo messageChatUpgradeTo) {
        super(w2Var, message);
        this.f15075U2 = 8;
        this.f15084d3 = messageChatUpgradeTo.supergroupId;
    }

    public C4583a5(C9678w2 w2Var, TdApi.Message message, TdApi.MessageChatUpgradeFrom messageChatUpgradeFrom) {
        super(w2Var, message);
        this.f15075U2 = 9;
        this.f15084d3 = messageChatUpgradeFrom.basicGroupId;
    }

    public C4583a5(C9678w2 w2Var, TdApi.Message message, TdApi.MessageScreenshotTaken messageScreenshotTaken) {
        super(w2Var, message);
        this.f15075U2 = 11;
    }

    public C4583a5(C9678w2 w2Var, TdApi.Message message, TdApi.MessagePinMessage messagePinMessage) {
        super(w2Var, message);
        this.f15075U2 = 13;
        if (messagePinMessage.messageId != 0) {
            this.f16099O0.m2270r4().m14783o(new TdApi.GetMessage(message.chatId, messagePinMessage.messageId), this);
        }
    }

    public C4583a5(C9678w2 w2Var, TdApi.Message message, TdApi.MessageWebsiteConnected messageWebsiteConnected) {
        super(w2Var, message);
        this.f15075U2 = 31;
        this.f15085e3 = messageWebsiteConnected.domainName;
    }

    public C4583a5(C9678w2 w2Var, TdApi.Message message, TdApi.MessageChatSetTtl messageChatSetTtl) {
        super(w2Var, message);
        this.f15075U2 = 12;
        this.f15091k3 = messageChatSetTtl.ttl;
    }

    public C4583a5(C9678w2 w2Var, TdApi.Message message, TdApi.MessageExpiredPhoto messageExpiredPhoto) {
        super(w2Var, message);
        this.f15075U2 = 15;
    }

    public C4583a5(C9678w2 w2Var, TdApi.Message message, TdApi.MessageExpiredVideo messageExpiredVideo) {
        super(w2Var, message);
        this.f15075U2 = 16;
    }

    public C4583a5(C9678w2 w2Var, TdApi.Message message, TdApi.MessageGameScore messageGameScore) {
        super(w2Var, message);
        this.f15075U2 = 10;
        if (messageGameScore.gameMessageId != 0) {
            this.f16099O0.m2270r4().m14783o(new TdApi.GetMessage(message.chatId, messageGameScore.gameMessageId), this);
        }
    }

    public C4583a5(C9678w2 w2Var, TdApi.Message message, TdApi.MessageVideoChatStarted messageVideoChatStarted) {
        super(w2Var, message);
        this.f15075U2 = 90;
    }

    public C4583a5(C9678w2 w2Var, TdApi.Message message, TdApi.MessageVideoChatEnded messageVideoChatEnded) {
        super(w2Var, message);
        this.f15075U2 = 91;
        this.f15084d3 = messageVideoChatEnded.duration;
    }

    public C4583a5(C9678w2 w2Var, TdApi.Message message, TdApi.MessageInviteVideoChatParticipants messageInviteVideoChatParticipants) {
        super(w2Var, message);
        this.f15075U2 = 92;
        this.f15080Z2 = messageInviteVideoChatParticipants.userIds;
    }

    public C4583a5(C9678w2 w2Var, TdApi.Message message, TdApi.MessageProximityAlertTriggered messageProximityAlertTriggered) {
        super(w2Var, message);
        this.f15075U2 = 93;
        this.f15084d3 = messageProximityAlertTriggered.distance;
    }

    public C4583a5(p291uc.C9678w2 r6, org.drinkless.p210td.libcore.telegram.TdApi.Message r7, org.drinkless.p210td.libcore.telegram.TdApi.ChatEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4583a5.<init>(uc.w2, org.drinkless.td.libcore.telegram.TdApi$Message, org.drinkless.td.libcore.telegram.TdApi$ChatEvent):void");
    }

    public C4583a5(C9678w2 w2Var, TdApi.Message message, TdApi.MessagePaymentSuccessful messagePaymentSuccessful) {
        super(w2Var, message);
        this.f15075U2 = 30;
        this.f15085e3 = C5065e.m24123a(messagePaymentSuccessful.currency, messagePaymentSuccessful.totalAmount);
        if (messagePaymentSuccessful.invoiceMessageId != 0) {
            this.f16099O0.m2270r4().m14783o(new TdApi.GetMessage(message.chatId, messagePaymentSuccessful.invoiceMessageId), this);
        }
    }

    public C4583a5(C9678w2 w2Var, TdApi.Message message, TdApi.MessageCustomServiceAction messageCustomServiceAction) {
        super(w2Var, message);
        this.f15075U2 = 32;
        this.f15088h3 = messageCustomServiceAction.text;
    }
}
