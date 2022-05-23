package je;

import java.util.ArrayList;
import ld.b;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import ud.v4;
import zd.hj;

public class d {
    public final String f15360a;
    public final l0[] f15361b;

    public d(String str, l0[] l0VarArr) {
        this.f15360a = str;
        this.f15361b = l0VarArr;
    }

    public static d a(v4<?> v4Var, TdApi.RichText richText, hj.q qVar) {
        o0[] o0VarArr = null;
        if (richText == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        b(v4Var, richText, sb2, arrayList, new int[1], 0, 0, null, 0, null, false, null, null, qVar);
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            o0[] o0VarArr2 = new o0[size];
            arrayList.toArray(o0VarArr2);
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                o0 o0Var = o0VarArr2[i10];
                int i12 = o0Var.i();
                int e10 = o0Var.e();
                if (i12 < i11 || e10 < i12) {
                    throw new RuntimeException("Bug in parser");
                }
                i10++;
                i11 = e10;
            }
            o0VarArr = o0VarArr2;
        }
        return new d(sb2.toString(), o0VarArr);
    }

    public static void b(v4<?> v4Var, TdApi.RichText richText, StringBuilder sb2, ArrayList<o0> arrayList, int[] iArr, int i10, int i11, int[] iArr2, int i12, String str, boolean z10, String str2, String str3, hj.q qVar) {
        switch (richText.getConstructor()) {
            case TdApi.RichTextAnchorLink.CONSTRUCTOR:
                TdApi.RichTextAnchorLink richTextAnchorLink = (TdApi.RichTextAnchorLink) richText;
                b(v4Var, richTextAnchorLink.text, sb2, arrayList, iArr, i10 | Log.TAG_CAMERA, i11, new int[1], 4, richTextAnchorLink.anchorName, false, str2, richTextAnchorLink.url, qVar);
                return;
            case TdApi.RichTextIcon.CONSTRUCTOR:
                o0 N = new o0(v4Var, v4Var.c(), "", iArr[0], iArr[0], i10, z10 ? new hj.q(qVar).i() : qVar).P(str2).L(str3).N((TdApi.RichTextIcon) richText);
                if (i12 != 0) {
                    N.O(i11, iArr2, i12, str, z10);
                }
                arrayList.add(N);
                return;
            case TdApi.RichTextMarked.CONSTRUCTOR:
                b(v4Var, ((TdApi.RichTextMarked) richText).text, sb2, arrayList, iArr, i10 | Log.TAG_YOUTUBE, i11, iArr2, i12, str, z10, str2, str3, qVar);
                return;
            case TdApi.RichTextFixed.CONSTRUCTOR:
                b(v4Var, ((TdApi.RichTextFixed) richText).text, sb2, arrayList, iArr, i10 | 8, i11, iArr2, i12, str, z10, str2, str3, qVar);
                return;
            case TdApi.RichTextReference.CONSTRUCTOR:
                TdApi.RichTextReference richTextReference = (TdApi.RichTextReference) richText;
                b(v4Var, richTextReference.text, sb2, arrayList, iArr, i10 | Log.TAG_CAMERA, i11, new int[1], 5, null, false, richTextReference.anchorName, richTextReference.url, qVar);
                return;
            case TdApi.RichTextSubscript.CONSTRUCTOR:
                b(v4Var, ((TdApi.RichTextSubscript) richText).text, sb2, arrayList, iArr, i10 | 32, i11, iArr2, i12, str, z10, str2, str3, qVar);
                return;
            case TdApi.RichTextUnderline.CONSTRUCTOR:
                b(v4Var, ((TdApi.RichTextUnderline) richText).text, sb2, arrayList, iArr, i10 | 4, i11, iArr2, i12, str, z10, str2, str3, qVar);
                return;
            case TdApi.RichTextSuperscript.CONSTRUCTOR:
                b(v4Var, ((TdApi.RichTextSuperscript) richText).text, sb2, arrayList, iArr, i10 | 64, i11, iArr2, i12, str, z10, str2, str3, qVar);
                return;
            case TdApi.RichTextEmailAddress.CONSTRUCTOR:
                TdApi.RichTextEmailAddress richTextEmailAddress = (TdApi.RichTextEmailAddress) richText;
                b(v4Var, richTextEmailAddress.text, sb2, arrayList, iArr, i10 | Log.TAG_CAMERA, i11, new int[1], 1, richTextEmailAddress.emailAddress, z10, str2, null, qVar);
                return;
            case TdApi.RichTextUrl.CONSTRUCTOR:
                TdApi.RichTextUrl richTextUrl = (TdApi.RichTextUrl) richText;
                b(v4Var, richTextUrl.text, sb2, arrayList, iArr, i10 | Log.TAG_CAMERA, i11, new int[1], 2, richTextUrl.url, richTextUrl.isCached, str2, null, qVar);
                return;
            case TdApi.RichTextPhoneNumber.CONSTRUCTOR:
                TdApi.RichTextPhoneNumber richTextPhoneNumber = (TdApi.RichTextPhoneNumber) richText;
                b(v4Var, richTextPhoneNumber.text, sb2, arrayList, iArr, i10 | Log.TAG_CAMERA, i11, new int[1], 3, richTextPhoneNumber.phoneNumber, z10, str2, null, qVar);
                return;
            case TdApi.RichTextPlain.CONSTRUCTOR:
                String str4 = ((TdApi.RichTextPlain) richText).text;
                sb2.append(str4);
                if (i10 != 0) {
                    o0 L = new o0(v4Var, v4Var.c(), str4, iArr[0], iArr[0] + str4.length(), i10, z10 ? new hj.q(qVar).i() : qVar).P(str2).L(str3);
                    if (i12 != 0) {
                        L.O(i11, iArr2, i12, str, z10);
                        iArr2[0] = iArr2[0] + str4.length();
                    }
                    arrayList.add(L);
                }
                iArr[0] = iArr[0] + str4.length();
                return;
            case TdApi.RichTextStrikethrough.CONSTRUCTOR:
                b(v4Var, ((TdApi.RichTextStrikethrough) richText).text, sb2, arrayList, iArr, i10 | 16, i11, iArr2, i12, str, z10, str2, str3, qVar);
                return;
            case TdApi.RichTextAnchor.CONSTRUCTOR:
                arrayList.add(new o0(v4Var, v4Var.c(), "", iArr[0], iArr[0], Log.TAG_VOICE, null).K(((TdApi.RichTextAnchor) richText).name));
                return;
            case TdApi.RichTexts.CONSTRUCTOR:
                TdApi.RichText[] richTextArr = ((TdApi.RichTexts) richText).texts;
                int length = richTextArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    TdApi.RichText richText2 = richTextArr[i13];
                    length = length;
                    richTextArr = richTextArr;
                    b(v4Var, richText2, sb2, arrayList, iArr, i10, i11, iArr2, i12, str, z10, str2, str3, qVar);
                }
                return;
            case TdApi.RichTextBold.CONSTRUCTOR:
                b(v4Var, ((TdApi.RichTextBold) richText).text, sb2, arrayList, iArr, i10 | 1, i11, iArr2, i12, str, z10, str2, str3, qVar);
                return;
            case TdApi.RichTextItalic.CONSTRUCTOR:
                b(v4Var, ((TdApi.RichTextItalic) richText).text, sb2, arrayList, iArr, i10 | 2, i11, iArr2, i12, str, z10, str2, str3, qVar);
                return;
            default:
                return;
        }
    }

    public static int c(l0[] l0VarArr, b bVar, int i10) {
        int i11 = 0;
        boolean z10 = i10 == -1;
        if (z10) {
            i10 = 0;
        }
        if (l0VarArr != null) {
            int length = l0VarArr.length;
            int i12 = 0;
            while (i11 < length) {
                l0 l0Var = l0VarArr[i11];
                if (l0Var.r()) {
                    l0Var.f().e(i10 + i12, bVar);
                    i12++;
                }
                i11++;
            }
            i11 = i12;
        }
        if (z10) {
            if (i11 > 0) {
                bVar.g(i10 + i11);
            } else {
                bVar.d();
            }
        }
        return i11;
    }
}
