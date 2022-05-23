package je;

import android.view.View;
import ce.c0;
import ce.j0;
import ce.v;
import de.q9;
import de.r9;
import hd.t2;
import ib.i;
import ie.g0;
import ie.h0;
import ie.u0;
import java.util.List;
import jb.c;
import je.g;
import ob.e;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.v4;
import zd.hj;
import zd.o6;
import zd.y8;

public class r0 extends l0 {
    public final int f15456g;
    public final TdApi.TextEntity f15457h;
    public final TdApi.TextEntity f15458i;
    public l f15459j;

    public class a extends l {
        public a(k kVar) {
            super(kVar);
        }

        @Override
        public int o0(boolean z10) {
            return z10 ? super.o0(true) : c();
        }
    }

    public r0(zd.o6 r9, java.lang.String r10, org.drinkless.td.libcore.telegram.TdApi.TextEntity r11, zd.hj.q r12) {
        throw new UnsupportedOperationException("Method not decompiled: je.r0.<init>(zd.o6, java.lang.String, org.drinkless.td.libcore.telegram.TdApi$TextEntity, zd.hj$q):void");
    }

    public static int I(TdApi.TextEntityType textEntityType) {
        int i10 = L(textEntityType) ? 2 : 0;
        if (N(textEntityType)) {
            i10 |= 4;
        }
        if (M(textEntityType)) {
            i10 |= Log.TAG_YOUTUBE;
        }
        switch (textEntityType.getConstructor()) {
            case TdApi.TextEntityTypeBold.CONSTRUCTOR:
                return i10 | 8;
            case TdApi.TextEntityTypeItalic.CONSTRUCTOR:
                return i10 | 16;
            case TdApi.TextEntityTypeUnderline.CONSTRUCTOR:
                return i10 | 32;
            case TdApi.TextEntityTypeStrikethrough.CONSTRUCTOR:
                return i10 | 64;
            default:
                return i10;
        }
    }

    public static boolean J(List<TdApi.TextEntity> list, int i10) {
        if (list == null) {
            return false;
        }
        for (TdApi.TextEntity textEntity : list) {
            if (textEntity.type.getConstructor() == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean K(TdApi.TextEntityType textEntityType) {
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

    public static boolean L(TdApi.TextEntityType textEntityType) {
        int constructor = textEntityType.getConstructor();
        return (constructor == -1312762756 || constructor == 934535013) ? false : true;
    }

    public static boolean M(TdApi.TextEntityType textEntityType) {
        int constructor = textEntityType.getConstructor();
        return constructor == -945325397 || constructor == 1648958606;
    }

    public static boolean N(TdApi.TextEntityType textEntityType) {
        int constructor = textEntityType.getConstructor();
        return constructor == -974534326 || constructor == -945325397 || constructor == 1648958606;
    }

    public static boolean O(char c10) {
        return c10 == ' ';
    }

    public boolean P(String str, String str2, int[] iArr, v4 v4Var, g gVar, v0 v0Var, g.c cVar, View view, int i10) {
        int i11 = R.string.CopiedLink;
        switch (i10) {
            case R.id.btn_copyLink:
                if (str == null) {
                    str = str2;
                }
                j0.i(str, R.string.CopiedLink);
                break;
            case R.id.btn_copyText:
                switch (this.f15457h.type.getConstructor()) {
                    case TdApi.TextEntityTypeHashtag.CONSTRUCTOR:
                        i11 = R.string.CopiedHashtag;
                        break;
                    case TdApi.TextEntityTypeCode.CONSTRUCTOR:
                    case TdApi.TextEntityTypePreCode.CONSTRUCTOR:
                    case TdApi.TextEntityTypePre.CONSTRUCTOR:
                        i11 = R.string.CopiedText;
                        break;
                    case TdApi.TextEntityTypeMention.CONSTRUCTOR:
                        i11 = R.string.CopiedUsername;
                        break;
                    case TdApi.TextEntityTypeCashtag.CONSTRUCTOR:
                        i11 = R.string.CopiedCashtag;
                        break;
                }
                j0.i(str2, i11);
                break;
            case R.id.btn_openLink:
                z(view, gVar, v0Var, cVar);
                break;
            case R.id.btn_shareLink:
                if (iArr[0] == 0) {
                    iArr[0] = 1;
                    t2.j5(new y8(v4Var.t(), this.f15423a), str2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override
    public boolean A(View view, final g gVar, final v0 v0Var, boolean z10, final g.c cVar) {
        String str;
        String str2;
        final v4<?> c10 = c(view);
        if (c10 == null) {
            Log.v("performLongPress ignored, because ancestor not found", new Object[0]);
            return false;
        } else if (this.f15457h.type.getConstructor() == -1150997581) {
            return cVar != null && cVar.D3(view, gVar, v0Var, e.u1(gVar.a(), this.f15457h), true);
        } else {
            if (this.f15457h.type.getConstructor() != 445719651) {
                str = e.u1(gVar.a(), this.f15457h);
            } else {
                str = ((TdApi.TextEntityTypeTextUrl) this.f15457h.type).url;
            }
            final String str3 = str;
            boolean z11 = this.f15457h.type.getConstructor() == -1312762756 || this.f15457h.type.getConstructor() == 445719651;
            int i10 = z11 ? 3 : 2;
            c cVar2 = new c(i10);
            u0 u0Var = new u0(i10);
            c cVar3 = new c(i10);
            switch (this.f15457h.type.getConstructor()) {
                case TdApi.TextEntityTypeMentionName.CONSTRUCTOR:
                case TdApi.TextEntityTypeUrl.CONSTRUCTOR:
                case TdApi.TextEntityTypeHashtag.CONSTRUCTOR:
                case TdApi.TextEntityTypeBankCardNumber.CONSTRUCTOR:
                case TdApi.TextEntityTypeTextUrl.CONSTRUCTOR:
                case TdApi.TextEntityTypeMention.CONSTRUCTOR:
                case TdApi.TextEntityTypeCashtag.CONSTRUCTOR:
                    cVar2.a(R.id.btn_openLink);
                    u0Var.a(this.f15457h.type.getConstructor() == 105986320 ? R.string.OpenInExternalApp : R.string.Open);
                    cVar3.a(R.drawable.baseline_open_in_browser_24);
                    break;
                case TdApi.TextEntityTypePhoneNumber.CONSTRUCTOR:
                case TdApi.TextEntityTypeCode.CONSTRUCTOR:
                case TdApi.TextEntityTypePreCode.CONSTRUCTOR:
                case TdApi.TextEntityTypeEmailAddress.CONSTRUCTOR:
                case TdApi.TextEntityTypePre.CONSTRUCTOR:
                    break;
                default:
                    Log.i("Long press is unsupported for entity: %s", this.f15457h);
                    return false;
            }
            if (this.f15457h.type.getConstructor() != -1570974289) {
                cVar2.a(R.id.btn_copyText);
                u0Var.a(this.f15457h.type.getConstructor() == 934535013 ? R.string.CopyUsername : R.string.Copy);
                cVar3.a(R.drawable.baseline_content_copy_24);
            }
            if (this.f15457h.type.getConstructor() != 934535013 || str3 == null) {
                str2 = null;
            } else {
                cVar2.a(R.id.btn_copyLink);
                u0Var.a(R.string.CopyLink);
                cVar3.a(R.drawable.baseline_link_24);
                str2 = t2.F1(str3.substring(1));
            }
            if (z11 && z10) {
                cVar2.a(R.id.btn_shareLink);
                u0Var.a(R.string.Share);
                cVar3.a(R.drawable.baseline_forward_24);
            }
            final int[] iArr = {0};
            int[] e10 = cVar2.e();
            final String str4 = str2;
            c10.fe(str3, e10, u0Var.d(), null, cVar3.e(), new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i11) {
                    return g0.b(this, i11);
                }

                @Override
                public final boolean r3(View view2, int i11) {
                    boolean P;
                    P = r0.this.P(str4, str3, iArr, c10, gVar, v0Var, cVar, view2, i11);
                    return P;
                }
            }, cVar != null ? cVar.O1(view, gVar) : null);
            return true;
        }
    }

    @Override
    public boolean a(l0 l0Var, int i10, String str) {
        TdApi.TextEntity textEntity;
        r0 r0Var = (r0) l0Var;
        if (i10 == 0) {
            return this.f15456g == r0Var.f15456g;
        }
        if (i10 == 1) {
            return e.h0(this.f15457h, r0Var.f15457h);
        }
        if (i10 != 2) {
            throw new UnsupportedOperationException(Integer.toString(i10));
        } else if (e.h0(this.f15458i, r0Var.f15458i)) {
            return true;
        } else {
            TdApi.TextEntity textEntity2 = this.f15458i;
            if (!(textEntity2 == null || (textEntity = r0Var.f15458i) == null)) {
                int i11 = textEntity2.offset;
                int i12 = textEntity.offset;
                if (!(i11 == textEntity.length + i12 || i12 == i11 + textEntity2.length)) {
                    if (!i.i(str)) {
                        p0 p0Var = p0.f15450a;
                        TdApi.TextEntity textEntity3 = this.f15458i;
                        int i13 = textEntity3.offset;
                        TdApi.TextEntity textEntity4 = r0Var.f15458i;
                        int i14 = textEntity4.offset;
                        int i15 = textEntity4.length;
                        if (i13 <= i14 + i15) {
                            int i16 = textEntity3.length;
                            if (i14 <= i13 + i16 || i14 - (i13 + i16) != c0.s(str, i13 + i16, i14, p0Var)) {
                            }
                        } else if (i13 - (i14 + i15) == c0.s(str, i14 + i15, i13, p0Var)) {
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
    public k g(k kVar) {
        if (!t()) {
            return null;
        }
        l lVar = this.f15459j;
        if (lVar == null || lVar.a() != kVar) {
            this.f15459j = new a(kVar);
        }
        return this.f15459j;
    }

    @Override
    public TdApi.TextEntity h() {
        return this.f15458i;
    }

    @Override
    public int l() {
        return 0;
    }

    @Override
    public boolean m(String str) {
        return false;
    }

    @Override
    public boolean n() {
        return ib.c.b(this.f15456g, 8);
    }

    @Override
    public boolean o() {
        return (this.f15456g & 1) != 0;
    }

    @Override
    public boolean p() {
        return (this.f15456g & 2) != 0;
    }

    @Override
    public boolean q() {
        return ib.c.b(this.f15456g, Log.TAG_YOUTUBE);
    }

    @Override
    public boolean r() {
        return false;
    }

    @Override
    public boolean s() {
        return ib.c.b(this.f15456g, 16);
    }

    @Override
    public boolean t() {
        return (this.f15456g & 4) != 0;
    }

    @Override
    public boolean u() {
        return false;
    }

    @Override
    public boolean v() {
        return ib.c.b(this.f15456g, 64);
    }

    @Override
    public boolean w() {
        return ib.c.b(this.f15456g, 32);
    }

    @Override
    public void z(View view, g gVar, v0 v0Var, g.c cVar) {
        o6 o6Var;
        o6 o6Var2;
        o6 o6Var3;
        o6 o6Var4;
        v4<?> c10 = c(view);
        boolean z10 = false;
        if (c10 == null) {
            Log.v("performClick ignored, because ancestor not found", new Object[0]);
            return;
        }
        switch (this.f15457h.type.getConstructor()) {
            case TdApi.TextEntityTypeMentionName.CONSTRUCTOR:
                TdApi.TextEntityTypeMentionName textEntityTypeMentionName = (TdApi.TextEntityTypeMentionName) this.f15457h.type;
                if ((cVar == null || !cVar.H3(textEntityTypeMentionName.userId)) && (o6Var = this.f15423a) != null) {
                    o6Var.hd().v7(c10, textEntityTypeMentionName.userId, y(view, gVar, v0Var));
                    return;
                }
                return;
            case TdApi.TextEntityTypeUrl.CONSTRUCTOR:
                String u12 = e.u1(gVar.a(), this.f15457h);
                hj.q y10 = y(view, gVar, v0Var);
                if ((cVar == null || !cVar.d5(view, u12, false, y10)) && (o6Var2 = this.f15423a) != null) {
                    o6Var2.hd().E7(c10, u12, x(y10, cVar, u12));
                    return;
                }
                return;
            case TdApi.TextEntityTypePhoneNumber.CONSTRUCTOR:
                String u13 = e.u1(gVar.a(), this.f15457h);
                if (cVar == null || !cVar.A(u13)) {
                    v.B(u13);
                    return;
                }
                return;
            case TdApi.TextEntityTypeBotCommand.CONSTRUCTOR:
                String u14 = e.u1(gVar.a(), this.f15457h);
                if (cVar != null && !cVar.D3(view, gVar, v0Var, u14, false)) {
                    Log.w("Unhandled bot command...", new Object[0]);
                    return;
                }
                return;
            case TdApi.TextEntityTypeHashtag.CONSTRUCTOR:
            case TdApi.TextEntityTypeCashtag.CONSTRUCTOR:
                if (this.f15423a != null) {
                    String u15 = e.u1(gVar.a(), this.f15457h);
                    if (cVar == null || !cVar.z3(u15)) {
                        long C9 = c10.C9();
                        v4<?> Z9 = c10.Z9();
                        if (Z9 instanceof q9) {
                            q9.b x92 = ((q9) Z9).x9();
                            if (x92.f9142b == C9 && u15.equals(x92.f9143c) && x92.f9144d == null) {
                                z10 = true;
                            }
                        } else if (C9 == 0 && (Z9 instanceof r9)) {
                            z10 = u15.equals(((r9) Z9).x9());
                        }
                        if (!z10) {
                            if (C9 == 0 || (ob.a.l(C9) && !this.f15423a.k7(C9))) {
                                r9 r9Var = new r9(c10.t(), this.f15423a);
                                r9Var.Ad(u15);
                                c10.t().Q1().h0(r9Var);
                                return;
                            }
                            q9 q9Var = new q9(c10.t(), this.f15423a);
                            q9Var.Ad(new q9.b(null, C9, u15, null, false));
                            c10.t().Q1().h0(q9Var);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case TdApi.TextEntityTypeBankCardNumber.CONSTRUCTOR:
                String u16 = e.u1(gVar.a(), this.f15457h);
                if ((cVar == null || !cVar.a5(u16)) && (o6Var3 = this.f15423a) != null) {
                    o6Var3.hd().f7(c10, u16);
                    return;
                }
                return;
            case TdApi.TextEntityTypeTextUrl.CONSTRUCTOR:
                String str = ((TdApi.TextEntityTypeTextUrl) this.f15457h.type).url;
                hj.q y11 = y(view, gVar, v0Var);
                if (cVar == null || !cVar.d5(view, str, true, y11)) {
                    c10.Qc(str, x(y11, cVar, str));
                    return;
                }
                return;
            case TdApi.TextEntityTypeMention.CONSTRUCTOR:
                String u17 = e.u1(gVar.a(), this.f15457h);
                if ((cVar == null || !cVar.C5(u17)) && (o6Var4 = this.f15423a) != null) {
                    o6Var4.hd().y7(c10, u17, y(view, gVar, v0Var));
                    return;
                }
                return;
            case TdApi.TextEntityTypeEmailAddress.CONSTRUCTOR:
                String u18 = e.u1(gVar.a(), this.f15457h);
                if (cVar == null || !cVar.O4(u18)) {
                    v.J(u18);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public r0(o6 o6Var, String str, int i10, int i11, TdApi.TextEntity textEntity, List<TdApi.TextEntity> list, hj.q qVar) {
        super(o6Var, i10, i11, (textEntity.type.getConstructor() == -1128210000 || J(list, TdApi.TextEntityTypeBold.CONSTRUCTOR)) && g.N0(str, i10, i11), qVar);
        TdApi.TextEntity textEntity2 = null;
        TdApi.TextEntity textEntity3 = K(textEntity.type) ? textEntity : null;
        textEntity2 = textEntity.type.getConstructor() == 544019899 ? textEntity : textEntity2;
        int I = I(textEntity.type);
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                TdApi.TextEntity textEntity4 = list.get(size);
                I |= I(textEntity4.type);
                if (textEntity3 == null && K(textEntity4.type)) {
                    textEntity3 = textEntity4;
                } else if (textEntity2 == null && textEntity4.type.getConstructor() == 544019899) {
                    textEntity2 = textEntity4;
                }
            }
        }
        this.f15457h = textEntity3;
        I = textEntity3 != null ? I | 1 : I;
        this.f15458i = textEntity2;
        this.f15456g = textEntity2 != null ? I | Log.TAG_CRASH : I;
    }
}
