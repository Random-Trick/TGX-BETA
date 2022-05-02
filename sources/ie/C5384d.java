package ie;

import java.util.ArrayList;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import p156kd.C6238b;
import p350yd.HandlerC10770jj;
import td.AbstractC9323v4;

public class C5384d {
    public final String f17708a;
    public final AbstractC5411l0[] f17709b;

    public C5384d(String str, AbstractC5411l0[] l0VarArr) {
        this.f17708a = str;
        this.f17709b = l0VarArr;
    }

    public static C5384d m23012a(AbstractC9323v4<?> v4Var, TdApi.RichText richText, HandlerC10770jj.C10788q qVar) {
        C5417o0[] o0VarArr = null;
        if (richText == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        m23011b(v4Var, richText, sb2, arrayList, new int[1], 0, 0, null, 0, null, false, null, null, qVar);
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            C5417o0[] o0VarArr2 = new C5417o0[size];
            arrayList.toArray(o0VarArr2);
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C5417o0 o0Var = o0VarArr2[i];
                int i3 = o0Var.m22786i();
                int e = o0Var.m22787e();
                if (i3 < i2 || e < i3) {
                    throw new RuntimeException("Bug in parser");
                }
                i++;
                i2 = e;
            }
            o0VarArr = o0VarArr2;
        }
        return new C5384d(sb2.toString(), o0VarArr);
    }

    public static void m23011b(AbstractC9323v4<?> v4Var, TdApi.RichText richText, StringBuilder sb2, ArrayList<C5417o0> arrayList, int[] iArr, int i, int i2, int[] iArr2, int i3, String str, boolean z, String str2, String str3, HandlerC10770jj.C10788q qVar) {
        switch (richText.getConstructor()) {
            case TdApi.RichTextAnchorLink.CONSTRUCTOR:
                TdApi.RichTextAnchorLink richTextAnchorLink = (TdApi.RichTextAnchorLink) richText;
                m23011b(v4Var, richTextAnchorLink.text, sb2, arrayList, iArr, i | Log.TAG_CAMERA, i2, new int[1], 4, richTextAnchorLink.anchorName, false, str2, richTextAnchorLink.url, qVar);
                return;
            case TdApi.RichTextIcon.CONSTRUCTOR:
                C5417o0 N = new C5417o0(v4Var, v4Var.mo4348c(), "", iArr[0], iArr[0], i, z ? new HandlerC10770jj.C10788q(qVar).m3322i() : qVar).m22759P(str2).m22763L(str3).m22761N((TdApi.RichTextIcon) richText);
                if (i3 != 0) {
                    N.m22760O(i2, iArr2, i3, str, z);
                }
                arrayList.add(N);
                return;
            case TdApi.RichTextMarked.CONSTRUCTOR:
                m23011b(v4Var, ((TdApi.RichTextMarked) richText).text, sb2, arrayList, iArr, i | Log.TAG_YOUTUBE, i2, iArr2, i3, str, z, str2, str3, qVar);
                return;
            case TdApi.RichTextFixed.CONSTRUCTOR:
                m23011b(v4Var, ((TdApi.RichTextFixed) richText).text, sb2, arrayList, iArr, i | 8, i2, iArr2, i3, str, z, str2, str3, qVar);
                return;
            case TdApi.RichTextReference.CONSTRUCTOR:
                TdApi.RichTextReference richTextReference = (TdApi.RichTextReference) richText;
                m23011b(v4Var, richTextReference.text, sb2, arrayList, iArr, i | Log.TAG_CAMERA, i2, new int[1], 5, null, false, richTextReference.anchorName, richTextReference.url, qVar);
                return;
            case TdApi.RichTextSubscript.CONSTRUCTOR:
                m23011b(v4Var, ((TdApi.RichTextSubscript) richText).text, sb2, arrayList, iArr, i | 32, i2, iArr2, i3, str, z, str2, str3, qVar);
                return;
            case TdApi.RichTextUnderline.CONSTRUCTOR:
                m23011b(v4Var, ((TdApi.RichTextUnderline) richText).text, sb2, arrayList, iArr, i | 4, i2, iArr2, i3, str, z, str2, str3, qVar);
                return;
            case TdApi.RichTextSuperscript.CONSTRUCTOR:
                m23011b(v4Var, ((TdApi.RichTextSuperscript) richText).text, sb2, arrayList, iArr, i | 64, i2, iArr2, i3, str, z, str2, str3, qVar);
                return;
            case TdApi.RichTextEmailAddress.CONSTRUCTOR:
                TdApi.RichTextEmailAddress richTextEmailAddress = (TdApi.RichTextEmailAddress) richText;
                m23011b(v4Var, richTextEmailAddress.text, sb2, arrayList, iArr, i | Log.TAG_CAMERA, i2, new int[1], 1, richTextEmailAddress.emailAddress, z, str2, null, qVar);
                return;
            case TdApi.RichTextUrl.CONSTRUCTOR:
                TdApi.RichTextUrl richTextUrl = (TdApi.RichTextUrl) richText;
                m23011b(v4Var, richTextUrl.text, sb2, arrayList, iArr, i | Log.TAG_CAMERA, i2, new int[1], 2, richTextUrl.url, richTextUrl.isCached, str2, null, qVar);
                return;
            case TdApi.RichTextPhoneNumber.CONSTRUCTOR:
                TdApi.RichTextPhoneNumber richTextPhoneNumber = (TdApi.RichTextPhoneNumber) richText;
                m23011b(v4Var, richTextPhoneNumber.text, sb2, arrayList, iArr, i | Log.TAG_CAMERA, i2, new int[1], 3, richTextPhoneNumber.phoneNumber, z, str2, null, qVar);
                return;
            case TdApi.RichTextPlain.CONSTRUCTOR:
                String str4 = ((TdApi.RichTextPlain) richText).text;
                sb2.append(str4);
                if (i != 0) {
                    C5417o0 L = new C5417o0(v4Var, v4Var.mo4348c(), str4, iArr[0], iArr[0] + str4.length(), i, z ? new HandlerC10770jj.C10788q(qVar).m3322i() : qVar).m22759P(str2).m22763L(str3);
                    if (i3 != 0) {
                        L.m22760O(i2, iArr2, i3, str, z);
                        iArr2[0] = iArr2[0] + str4.length();
                    }
                    arrayList.add(L);
                }
                iArr[0] = iArr[0] + str4.length();
                return;
            case TdApi.RichTextStrikethrough.CONSTRUCTOR:
                m23011b(v4Var, ((TdApi.RichTextStrikethrough) richText).text, sb2, arrayList, iArr, i | 16, i2, iArr2, i3, str, z, str2, str3, qVar);
                return;
            case TdApi.RichTextAnchor.CONSTRUCTOR:
                arrayList.add(new C5417o0(v4Var, v4Var.mo4348c(), "", iArr[0], iArr[0], Log.TAG_VOICE, null).m22764K(((TdApi.RichTextAnchor) richText).name));
                return;
            case TdApi.RichTexts.CONSTRUCTOR:
                TdApi.RichText[] richTextArr = ((TdApi.RichTexts) richText).texts;
                int length = richTextArr.length;
                for (int i4 = 0; i4 < length; i4++) {
                    TdApi.RichText richText2 = richTextArr[i4];
                    length = length;
                    richTextArr = richTextArr;
                    m23011b(v4Var, richText2, sb2, arrayList, iArr, i, i2, iArr2, i3, str, z, str2, str3, qVar);
                }
                return;
            case TdApi.RichTextBold.CONSTRUCTOR:
                m23011b(v4Var, ((TdApi.RichTextBold) richText).text, sb2, arrayList, iArr, i | 1, i2, iArr2, i3, str, z, str2, str3, qVar);
                return;
            case TdApi.RichTextItalic.CONSTRUCTOR:
                m23011b(v4Var, ((TdApi.RichTextItalic) richText).text, sb2, arrayList, iArr, i | 2, i2, iArr2, i3, str, z, str2, str3, qVar);
                return;
            default:
                return;
        }
    }

    public static int m23010c(AbstractC5411l0[] l0VarArr, C6238b bVar, int i) {
        int i2 = 0;
        boolean z = i == -1;
        if (z) {
            i = 0;
        }
        if (l0VarArr != null) {
            int length = l0VarArr.length;
            int i3 = 0;
            while (i2 < length) {
                AbstractC5411l0 l0Var = l0VarArr[i2];
                if (l0Var.mo22736r()) {
                    l0Var.mo22757f().m22716e(i + i3, bVar);
                    i3++;
                }
                i2++;
            }
            i2 = i3;
        }
        if (z) {
            if (i2 > 0) {
                bVar.m20997g(i + i2);
            } else {
                bVar.m21000d();
            }
        }
        return i2;
    }
}
