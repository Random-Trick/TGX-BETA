package ie;

import android.view.View;
import be.C1363c0;
import be.C1379j0;
import be.C1405v;
import gd.C4779t2;
import ie.RunnableC5390g;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p038ce.C2912q9;
import p038ce.C2963r9;
import p108hb.C5063c;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5146u0;
import p124ib.C5320c;
import p193nb.C7316a;
import p193nb.C7321e;
import p350yd.C10534a9;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import td.AbstractC9323v4;

public class C5424r0 extends AbstractC5411l0 {
    public final int f17836g;
    public final TdApi.TextEntity f17837h;
    public final TdApi.TextEntity f17838i;
    public C5410l f17839j;

    public class C5425a extends C5410l {
        public C5425a(AbstractC5408k kVar) {
            super(kVar);
        }

        @Override
        public int mo7852o0(boolean z) {
            return z ? super.mo7852o0(true) : mo7855c();
        }
    }

    public C5424r0(p350yd.C10930q6 r9, java.lang.String r10, org.drinkless.p210td.libcore.telegram.TdApi.TextEntity r11, p350yd.HandlerC10770jj.C10788q r12) {
        throw new UnsupportedOperationException("Method not decompiled: ie.C5424r0.<init>(yd.q6, java.lang.String, org.drinkless.td.libcore.telegram.TdApi$TextEntity, yd.jj$q):void");
    }

    public static int m22752I(TdApi.TextEntityType textEntityType) {
        int i = m22749L(textEntityType) ? 2 : 0;
        if (m22747N(textEntityType)) {
            i |= 4;
        }
        if (m22748M(textEntityType)) {
            i |= Log.TAG_YOUTUBE;
        }
        switch (textEntityType.getConstructor()) {
            case TdApi.TextEntityTypeBold.CONSTRUCTOR:
                return i | 8;
            case TdApi.TextEntityTypeItalic.CONSTRUCTOR:
                return i | 16;
            case TdApi.TextEntityTypeUnderline.CONSTRUCTOR:
                return i | 32;
            case TdApi.TextEntityTypeStrikethrough.CONSTRUCTOR:
                return i | 64;
            default:
                return i;
        }
    }

    public static boolean m22751J(List<TdApi.TextEntity> list, int i) {
        if (list == null) {
            return false;
        }
        for (TdApi.TextEntity textEntity : list) {
            if (textEntity.type.getConstructor() == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean m22750K(TdApi.TextEntityType textEntityType) {
        switch (textEntityType.getConstructor()) {
            case TdApi.TextEntityTypeMentionName.CONSTRUCTOR:
            case TdApi.TextEntityTypeUrl.CONSTRUCTOR:
            case TdApi.TextEntityTypePhoneNumber.CONSTRUCTOR:
            case TdApi.TextEntityTypeBotCommand.CONSTRUCTOR:
            case TdApi.TextEntityTypeHashtag.CONSTRUCTOR:
            case TdApi.TextEntityTypeCode.CONSTRUCTOR:
            case TdApi.TextEntityTypePreCode.CONSTRUCTOR:
            case TdApi.TextEntityTypeBankCardNumber.CONSTRUCTOR:
            case TdApi.TextEntityTypeTextUrl.CONSTRUCTOR:
            case TdApi.TextEntityTypeMention.CONSTRUCTOR:
            case TdApi.TextEntityTypeCashtag.CONSTRUCTOR:
            case TdApi.TextEntityTypeEmailAddress.CONSTRUCTOR:
            case TdApi.TextEntityTypePre.CONSTRUCTOR:
                return true;
            default:
                return false;
        }
    }

    public static boolean m22749L(TdApi.TextEntityType textEntityType) {
        int constructor = textEntityType.getConstructor();
        return (constructor == -1312762756 || constructor == 934535013) ? false : true;
    }

    public static boolean m22748M(TdApi.TextEntityType textEntityType) {
        int constructor = textEntityType.getConstructor();
        return constructor == -945325397 || constructor == 1648958606;
    }

    public static boolean m22747N(TdApi.TextEntityType textEntityType) {
        int constructor = textEntityType.getConstructor();
        return constructor == -974534326 || constructor == -945325397 || constructor == 1648958606;
    }

    public static boolean m22746O(char c) {
        return c == ' ';
    }

    public boolean m22745P(String str, String str2, int[] iArr, AbstractC9323v4 v4Var, RunnableC5390g gVar, C5455v0 v0Var, RunnableC5390g.AbstractC5393c cVar, View view, int i) {
        int i2 = R.string.CopiedLink;
        switch (i) {
            case R.id.btn_copyLink:
                if (str == null) {
                    str = str2;
                }
                C1379j0.m37325i(str, R.string.CopiedLink);
                break;
            case R.id.btn_copyText:
                switch (this.f17837h.type.getConstructor()) {
                    case TdApi.TextEntityTypeHashtag.CONSTRUCTOR:
                        i2 = R.string.CopiedHashtag;
                        break;
                    case TdApi.TextEntityTypeCode.CONSTRUCTOR:
                    case TdApi.TextEntityTypePreCode.CONSTRUCTOR:
                    case TdApi.TextEntityTypePre.CONSTRUCTOR:
                        i2 = R.string.CopiedText;
                        break;
                    case TdApi.TextEntityTypeMention.CONSTRUCTOR:
                        i2 = R.string.CopiedUsername;
                        break;
                    case TdApi.TextEntityTypeCashtag.CONSTRUCTOR:
                        i2 = R.string.CopiedCashtag;
                        break;
                }
                C1379j0.m37325i(str2, i2);
                break;
            case R.id.btn_openLink:
                mo22729z(view, gVar, v0Var, cVar);
                break;
            case R.id.btn_shareLink:
                if (iArr[0] == 0) {
                    iArr[0] = 1;
                    C4779t2.m25490j5(new C10534a9(v4Var.mo4347s(), this.f17793a), str2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override
    public boolean mo22755A(View view, final RunnableC5390g gVar, final C5455v0 v0Var, boolean z, final RunnableC5390g.AbstractC5393c cVar) {
        String str;
        String str2;
        final AbstractC9323v4<?> c = m22787c(view);
        if (c == null) {
            Log.m14714v("performLongPress ignored, because ancestor not found", new Object[0]);
            return false;
        } else if (this.f17837h.type.getConstructor() == -1150997581) {
            return cVar != null && cVar.mo18242M(view, gVar, v0Var, C7321e.m16911s1(gVar.mo22956a(), this.f17837h), true);
        } else {
            if (this.f17837h.type.getConstructor() != 445719651) {
                str = C7321e.m16911s1(gVar.mo22956a(), this.f17837h);
            } else {
                str = ((TdApi.TextEntityTypeTextUrl) this.f17837h.type).url;
            }
            final String str3 = str;
            boolean z2 = this.f17837h.type.getConstructor() == -1312762756 || this.f17837h.type.getConstructor() == 445719651;
            int i = z2 ? 3 : 2;
            C5320c cVar2 = new C5320c(i);
            C5146u0 u0Var = new C5146u0(i);
            C5320c cVar3 = new C5320c(i);
            switch (this.f17837h.type.getConstructor()) {
                case TdApi.TextEntityTypeMentionName.CONSTRUCTOR:
                case TdApi.TextEntityTypeUrl.CONSTRUCTOR:
                case TdApi.TextEntityTypeHashtag.CONSTRUCTOR:
                case TdApi.TextEntityTypeBankCardNumber.CONSTRUCTOR:
                case TdApi.TextEntityTypeTextUrl.CONSTRUCTOR:
                case TdApi.TextEntityTypeMention.CONSTRUCTOR:
                case TdApi.TextEntityTypeCashtag.CONSTRUCTOR:
                    cVar2.m23284a(R.id.btn_openLink);
                    u0Var.m23816a(this.f17837h.type.getConstructor() == 105986320 ? R.string.OpenInExternalApp : R.string.Open);
                    cVar3.m23284a(R.drawable.baseline_open_in_browser_24);
                    break;
                case TdApi.TextEntityTypePhoneNumber.CONSTRUCTOR:
                case TdApi.TextEntityTypeCode.CONSTRUCTOR:
                case TdApi.TextEntityTypePreCode.CONSTRUCTOR:
                case TdApi.TextEntityTypeEmailAddress.CONSTRUCTOR:
                case TdApi.TextEntityTypePre.CONSTRUCTOR:
                    break;
                default:
                    Log.m14719i("Long press is unsupported for entity: %s", this.f17837h);
                    return false;
            }
            if (this.f17837h.type.getConstructor() != -1570974289) {
                cVar2.m23284a(R.id.btn_copyText);
                u0Var.m23816a(this.f17837h.type.getConstructor() == 934535013 ? R.string.CopyUsername : R.string.Copy);
                cVar3.m23284a(R.drawable.baseline_content_copy_24);
            }
            if (this.f17837h.type.getConstructor() != 934535013 || str3 == null) {
                str2 = null;
            } else {
                cVar2.m23284a(R.id.btn_copyLink);
                u0Var.m23816a(R.string.CopyLink);
                cVar3.m23284a(R.drawable.baseline_link_24);
                str2 = C4779t2.m25694F1(str3.substring(1));
            }
            if (z2 && z) {
                cVar2.m23284a(R.id.btn_shareLink);
                u0Var.m23816a(R.string.Share);
                cVar3.m23284a(R.drawable.baseline_forward_24);
            }
            final int[] iArr = {0};
            int[] e = cVar2.m23280e();
            final String str4 = str2;
            c.m9254fe(str3, e, u0Var.m23813d(), null, cVar3.m23280e(), new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view2, int i2) {
                    boolean P;
                    P = C5424r0.this.m22745P(str4, str3, iArr, c, gVar, v0Var, cVar, view2, i2);
                    return P;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23935a(this);
                }

                @Override
                public Object mo491b2(int i2) {
                    return C5115g0.m23934b(this, i2);
                }
            }, cVar != null ? cVar.mo18237W4(view, gVar) : null);
            return true;
        }
    }

    @Override
    public boolean mo22744a(AbstractC5411l0 l0Var, int i, String str) {
        TdApi.TextEntity textEntity;
        C5424r0 r0Var = (C5424r0) l0Var;
        if (i == 0) {
            return this.f17836g == r0Var.f17836g;
        }
        if (i == 1) {
            return C7321e.m16951f0(this.f17837h, r0Var.f17837h);
        }
        if (i != 2) {
            throw new UnsupportedOperationException(Integer.toString(i));
        } else if (C7321e.m16951f0(this.f17838i, r0Var.f17838i)) {
            return true;
        } else {
            TdApi.TextEntity textEntity2 = this.f17838i;
            if (!(textEntity2 == null || (textEntity = r0Var.f17838i) == null)) {
                int i2 = textEntity2.offset;
                int i3 = textEntity.offset;
                if (!(i2 == textEntity.length + i3 || i3 == i2 + textEntity2.length)) {
                    if (!C5070i.m24061i(str)) {
                        C5420p0 p0Var = C5420p0.f17825a;
                        TdApi.TextEntity textEntity3 = this.f17838i;
                        int i4 = textEntity3.offset;
                        TdApi.TextEntity textEntity4 = r0Var.f17838i;
                        int i5 = textEntity4.offset;
                        int i6 = textEntity4.length;
                        if (i4 <= i5 + i6) {
                            int i7 = textEntity3.length;
                            if (i5 <= i4 + i7 || i5 - (i4 + i7) != C1363c0.m37414s(str, i4 + i7, i5, p0Var)) {
                            }
                        } else if (i4 - (i5 + i6) == C1363c0.m37414s(str, i5 + i6, i4, p0Var)) {
                            return true;
                        }
                    }
                }
                return true;
            }
            return false;
        }
    }

    @Override
    public AbstractC5408k mo22743g(AbstractC5408k kVar) {
        if (!mo22733t()) {
            return null;
        }
        C5410l lVar = this.f17839j;
        if (lVar == null || lVar.m22794a() != kVar) {
            this.f17839j = new C5425a(kVar);
        }
        return this.f17839j;
    }

    @Override
    public TdApi.TextEntity mo22742h() {
        return this.f17838i;
    }

    @Override
    public int mo22741l() {
        return 0;
    }

    @Override
    public boolean mo22740m(String str) {
        return false;
    }

    @Override
    public boolean mo22739n() {
        return C5063c.m24144b(this.f17836g, 8);
    }

    @Override
    public boolean mo22738o() {
        return (this.f17836g & 1) != 0;
    }

    @Override
    public boolean mo22737p() {
        return (this.f17836g & 2) != 0;
    }

    @Override
    public boolean mo22736q() {
        return C5063c.m24144b(this.f17836g, Log.TAG_YOUTUBE);
    }

    @Override
    public boolean mo22735r() {
        return false;
    }

    @Override
    public boolean mo22734s() {
        return C5063c.m24144b(this.f17836g, 16);
    }

    @Override
    public boolean mo22733t() {
        return (this.f17836g & 4) != 0;
    }

    @Override
    public boolean mo22732u() {
        return false;
    }

    @Override
    public boolean mo22731v() {
        return C5063c.m24144b(this.f17836g, 64);
    }

    @Override
    public boolean mo22730w() {
        return C5063c.m24144b(this.f17836g, 32);
    }

    @Override
    public void mo22729z(View view, RunnableC5390g gVar, C5455v0 v0Var, RunnableC5390g.AbstractC5393c cVar) {
        C10930q6 q6Var;
        C10930q6 q6Var2;
        C10930q6 q6Var3;
        C10930q6 q6Var4;
        AbstractC9323v4<?> c = m22787c(view);
        boolean z = false;
        if (c == null) {
            Log.m14714v("performClick ignored, because ancestor not found", new Object[0]);
            return;
        }
        switch (this.f17837h.type.getConstructor()) {
            case TdApi.TextEntityTypeMentionName.CONSTRUCTOR:
                TdApi.TextEntityTypeMentionName textEntityTypeMentionName = (TdApi.TextEntityTypeMentionName) this.f17837h.type;
                if ((cVar == null || !cVar.mo18241P3(textEntityTypeMentionName.userId)) && (q6Var = this.f17793a) != null) {
                    q6Var.m2485dd().m3429v7(c, textEntityTypeMentionName.userId, m22781y(view, gVar, v0Var));
                    return;
                }
                return;
            case TdApi.TextEntityTypeUrl.CONSTRUCTOR:
                String s1 = C7321e.m16911s1(gVar.mo22956a(), this.f17837h);
                HandlerC10770jj.C10788q y = m22781y(view, gVar, v0Var);
                if ((cVar == null || !cVar.mo18235g0(view, s1, false, y)) && (q6Var2 = this.f17793a) != null) {
                    q6Var2.m2485dd().m3858E7(c, s1, m22782x(y, cVar, s1));
                    return;
                }
                return;
            case TdApi.TextEntityTypePhoneNumber.CONSTRUCTOR:
                String s12 = C7321e.m16911s1(gVar.mo22956a(), this.f17837h);
                if (cVar == null || !cVar.mo18245A(s12)) {
                    C1405v.m37141B(s12);
                    return;
                }
                return;
            case TdApi.TextEntityTypeBotCommand.CONSTRUCTOR:
                String s13 = C7321e.m16911s1(gVar.mo22956a(), this.f17837h);
                if (cVar != null && !cVar.mo18242M(view, gVar, v0Var, s13, false)) {
                    Log.m14709w("Unhandled bot command...", new Object[0]);
                    return;
                }
                return;
            case TdApi.TextEntityTypeHashtag.CONSTRUCTOR:
            case TdApi.TextEntityTypeCashtag.CONSTRUCTOR:
                if (this.f17793a != null) {
                    String s14 = C7321e.m16911s1(gVar.mo22956a(), this.f17837h);
                    if (cVar == null || !cVar.mo18243I3(s14)) {
                        long C9 = c.mo9464C9();
                        AbstractC9323v4<?> Z9 = c.m9300Z9();
                        if (Z9 instanceof C2912q9) {
                            C2912q9.C2914b x9 = ((C2912q9) Z9).m9131x9();
                            if (x9.f9721b == C9 && s14.equals(x9.f9722c) && x9.f9723d == null) {
                                z = true;
                            }
                        } else if (C9 == 0 && (Z9 instanceof C2963r9)) {
                            z = s14.equals(((C2963r9) Z9).m9131x9());
                        }
                        if (!z) {
                            if (C9 == 0 || (C7316a.m17049l(C9) && !this.f17793a.m2443g7(C9))) {
                                C2963r9 r9Var = new C2963r9(c.mo4347s(), this.f17793a);
                                r9Var.m9476Ad(s14);
                                c.mo4347s().m14552P1().m9719h0(r9Var);
                                return;
                            }
                            C2912q9 q9Var = new C2912q9(c.mo4347s(), this.f17793a);
                            q9Var.m9476Ad(new C2912q9.C2914b(null, C9, s14, null, false));
                            c.mo4347s().m14552P1().m9719h0(q9Var);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case TdApi.TextEntityTypeBankCardNumber.CONSTRUCTOR:
                String s15 = C7321e.m16911s1(gVar.mo22956a(), this.f17837h);
                if ((cVar == null || !cVar.mo18236f5(s15)) && (q6Var3 = this.f17793a) != null) {
                    q6Var3.m2485dd().m3589f7(c, s15);
                    return;
                }
                return;
            case TdApi.TextEntityTypeTextUrl.CONSTRUCTOR:
                String str = ((TdApi.TextEntityTypeTextUrl) this.f17837h.type).url;
                HandlerC10770jj.C10788q y2 = m22781y(view, gVar, v0Var);
                if (cVar == null || !cVar.mo18235g0(view, str, true, y2)) {
                    c.m9357Qc(str, m22782x(y2, cVar, str));
                    return;
                }
                return;
            case TdApi.TextEntityTypeMention.CONSTRUCTOR:
                String s16 = C7321e.m16911s1(gVar.mo22956a(), this.f17837h);
                if ((cVar == null || !cVar.mo18244H5(s16)) && (q6Var4 = this.f17793a) != null) {
                    q6Var4.m2485dd().m3399y7(c, s16, m22781y(view, gVar, v0Var));
                    return;
                }
                return;
            case TdApi.TextEntityTypeEmailAddress.CONSTRUCTOR:
                String s17 = C7321e.m16911s1(gVar.mo22956a(), this.f17837h);
                if (cVar == null || !cVar.mo18238V4(s17)) {
                    C1405v.m37132K(s17);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public C5424r0(C10930q6 q6Var, String str, int i, int i2, TdApi.TextEntity textEntity, List<TdApi.TextEntity> list, HandlerC10770jj.C10788q qVar) {
        super(q6Var, i, i2, (textEntity.type.getConstructor() == -1128210000 || m22751J(list, TdApi.TextEntityTypeBold.CONSTRUCTOR)) && RunnableC5390g.m22981N0(str, i, i2), qVar);
        TdApi.TextEntity textEntity2 = null;
        TdApi.TextEntity textEntity3 = m22750K(textEntity.type) ? textEntity : null;
        textEntity2 = textEntity.type.getConstructor() == 544019899 ? textEntity : textEntity2;
        int I = m22752I(textEntity.type);
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                TdApi.TextEntity textEntity4 = list.get(size);
                I |= m22752I(textEntity4.type);
                if (textEntity3 == null && m22750K(textEntity4.type)) {
                    textEntity3 = textEntity4;
                } else if (textEntity2 == null && textEntity4.type.getConstructor() == 544019899) {
                    textEntity2 = textEntity4;
                }
            }
        }
        this.f17837h = textEntity3;
        I = textEntity3 != null ? I | 1 : I;
        this.f17838i = textEntity2;
        this.f17836g = textEntity2 != null ? I | Log.TAG_CRASH : I;
    }
}
