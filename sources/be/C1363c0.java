package be;

import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.telephony.PhoneNumberUtils;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.Patterns;
import android.view.View;
import gd.C4779t2;
import ge.C4868i;
import ie.RunnableC5390g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import lb.EnumC6459p;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.C5132o;
import p193nb.C7321e;
import p350yd.AbstractC10664f9;

public class C1363c0 {
    public static String f4975a = " • ";
    public static String f4976b = "…";
    public static final char[] f4977c = {' ', '\n'};

    public class C1364a extends ClickableSpan {
        public final URLSpan f4978a;

        public C1364a(URLSpan uRLSpan) {
            this.f4978a = uRLSpan;
        }

        @Override
        public void onClick(View view) {
            C1405v.m37097x(this.f4978a.getURL());
        }
    }

    public interface AbstractC1365b {
        boolean mo22712a(char c);
    }

    public static int m37473A(int i) {
        byte directionality = Character.getDirectionality(i);
        if (directionality != 0) {
            if (!(directionality == 1 || directionality == 2)) {
                switch (directionality) {
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                        break;
                    default:
                        return 0;
                }
            }
            return m37456R(i) ? 0 : 2;
        }
        return 1;
    }

    public static String m37472B(int i, float f, float f2, float f3, int i2, boolean z) {
        int alpha = Color.alpha(i2);
        StringBuilder sb2 = new StringBuilder();
        if (i == 0) {
            m37429j(i2, true, sb2);
        } else if (i == 1) {
            sb2.append(alpha != 255 ? "rgba(" : "rgb(");
            int red = Color.red(i2);
            int green = Color.green(i2);
            int blue = Color.blue(i2);
            m37439e(sb2, red).append(", ");
            m37439e(sb2, green).append(", ");
            m37439e(sb2, blue);
            if (alpha != 255) {
                sb2.append(", ");
                sb2.append(C7389v0.m16641e0(alpha / 255.0f, z));
            }
            sb2.append(")");
        } else if (i == 2) {
            sb2.append(alpha != 255 ? "hsla(" : "hsl(");
            m37441d(sb2, f);
            sb2.append(", ");
            m37441d(sb2, f2 * 100.0f);
            String str = "%, ";
            sb2.append(str);
            m37441d(sb2, f3 * 100.0f);
            if (alpha == 255) {
                str = "%)";
            }
            sb2.append(str);
            if (alpha != 255) {
                sb2.append(C7389v0.m16641e0(alpha / 255.0f, z));
                sb2.append(")");
            }
        }
        return sb2.toString();
    }

    public static String m37471C(int i, boolean z) {
        StringBuilder sb2 = new StringBuilder();
        m37429j(i, z, sb2);
        return sb2.toString();
    }

    public static String m37470D(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }

    public static int m37469E(String str) {
        int i = 0;
        if (C5070i.m24061i(str)) {
            return 0;
        }
        int i2 = 0;
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            int charCount = Character.charCount(codePointAt);
            if (charCount == 1 && codePointAt >= 48 && codePointAt <= 57) {
                i2++;
            }
            i += charCount;
        }
        return i2;
    }

    public static int m37468F(CharSequence charSequence) {
        if (charSequence != null) {
            return m37467G(charSequence, 0, charSequence.length());
        }
        return 0;
    }

    public static int m37467G(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            int codePointAt = Character.codePointAt(charSequence, i);
            int A = m37473A(codePointAt);
            int i3 = 1;
            if (A != 1) {
                i3 = 2;
                if (A != 2) {
                    i += Character.charCount(codePointAt);
                }
            }
            return i3;
        }
        return 0;
    }

    public static CharSequence m37466H(CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "\n\n").append(charSequence2);
        append.setSpan(C4403w.m27843p().mo379a(append, 0, charSequence.length(), 0, RunnableC5390g.m22983M0(charSequence)), 0, charSequence.length(), 33);
        return append;
    }

    public static CharSequence m37465I(String str, String str2, int i, char[] cArr) {
        return m37464J(str, str2, i, cArr, 0);
    }

    public static CharSequence m37464J(String str, String str2, int i, char[] cArr, int i2) {
        String str3;
        if (C5070i.m24061i(str) || C5070i.m24061i(str2)) {
            return str;
        }
        int length = str.length();
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        int v0 = RunnableC5390g.m22898v0(str2, i, cArr);
        int i3 = 0;
        ArrayList arrayList = null;
        while (true) {
            if (v0 == -1 && (arrayList == null || i3 >= str2.length())) {
                break;
            } else if (v0 == -1) {
                arrayList.add(lowerCase2.substring(i3));
                break;
            } else {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                String substring = lowerCase2.substring(i3, v0);
                if (!C5070i.m24061i(substring)) {
                    arrayList.add(substring);
                }
                i3 = v0 + 1;
                v0 = RunnableC5390g.m22902t0(str2, i3);
            }
        }
        if (arrayList != null) {
            Collections.sort(arrayList, C1361b0.f4971a);
        }
        Spannable spannable = null;
        while (i < length) {
            boolean startsWith = lowerCase.startsWith(lowerCase2, i);
            if (!startsWith && arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    str3 = (String) it.next();
                    if (lowerCase.startsWith(str3, i)) {
                        startsWith = true;
                        break;
                    }
                }
            }
            str3 = lowerCase2;
            if (startsWith) {
                if (spannable == null) {
                    spannable = Spannable.Factory.getInstance().newSpannable(str);
                }
                spannable.setSpan(new C5132o(null, R.id.theme_color_textSearchQueryHighlight).m23850l(i2), i, str3.length() + i, 33);
            }
            int v02 = RunnableC5390g.m22898v0(str, i, cArr);
            i = v02 != -1 ? v02 + 1 : length;
        }
        return spannable != null ? spannable : str;
    }

    public static boolean m37463K(String str, String str2) {
        Uri l0;
        if (C5070i.m24061i(str) || C5070i.m24061i(str2)) {
            return false;
        }
        try {
            Uri l02 = m37424l0(str);
            if (l02 == null || (l0 = m37424l0(str2)) == null) {
                return false;
            }
            String i0 = m37430i0(l02.getHost());
            String i02 = m37430i0(l0.getHost());
            if (!i0.equals(i02) && !i0.endsWith(i02)) {
                if (!i02.endsWith(i0)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int m37462L(String str, int i, char[] cArr) {
        int length = str.length();
        while (i < length) {
            char charAt = str.charAt(i);
            for (char c : cArr) {
                if (charAt == c) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    public static int m37461M(String str) {
        if (str == null) {
            return -1;
        }
        int i = 0;
        int length = str.length();
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            int charCount = Character.charCount(codePointAt);
            if (charCount == 1 && C5070i.m24058l((char) codePointAt)) {
                return i;
            }
            i += charCount;
        }
        return -1;
    }

    public static boolean m37460N(char c) {
        return C5070i.m24058l(c) || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F');
    }

    public static boolean m37459O(char c) {
        return c == '\n' || c == ' ' || c == '.';
    }

    public static boolean m37458P(String str) {
        if (C5070i.m24061i(str)) {
            return false;
        }
        TdApi.TextEntity[] C0 = C7321e.m17014C0(str);
        if (C0 != null && C0.length == 1 && C0[0].offset == 0 && C0[0].length == str.length() && C0[0].type.getConstructor() == 1425545249) {
            return true;
        }
        try {
            return Patterns.EMAIL_ADDRESS.matcher(str).matches();
        } catch (Throwable th) {
            Log.m14710w("Cannot find email address", th, new Object[0]);
            return false;
        }
    }

    public static boolean m37457Q(String str) {
        TdApi.TextEntity[] C0;
        return !C5070i.m24061i(str) && (C0 = C7321e.m17014C0(str)) != null && C0.length == 1 && C0[0].offset == 0 && C0[0].length == str.length() && C0[0].type.getConstructor() == -1312762756;
    }

    public static boolean m37456R(int i) {
        switch (i) {
            case 1489:
            case 1496:
            case 1499:
            case 1500:
            case 1501:
            case 1502:
            case 1505:
            case 1514:
            case 1571:
            case 1576:
            case 1581:
            case 1602:
            case 1697:
            case 1706:
            case 1731:
            case 64305:
            case 64312:
            case 64316:
            case 64318:
            case 64321:
            case 64330:
            case 64396:
            case 65169:
            case 65173:
            case 65185:
            case 65191:
            case 65192:
            case 65194:
                return true;
            default:
                return false;
        }
    }

    public static boolean m37455S(char c) {
        return c == ' ' || c == '\n';
    }

    public static String m37454T(CharSequence charSequence, Iterable<?> iterable) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<?> it = iterable.iterator();
        boolean z = true;
        while (it.hasNext()) {
            Object next = it.next();
            if (z) {
                z = false;
            } else {
                sb2.append(charSequence);
            }
            sb2.append(next == null ? "null" : next.toString());
        }
        return sb2.toString();
    }

    public static String m37453U(CharSequence charSequence, Object... objArr) {
        StringBuilder sb2 = new StringBuilder();
        int length = objArr.length;
        boolean z = true;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (z) {
                z = false;
            } else {
                sb2.append(charSequence);
            }
            sb2.append(obj == null ? "null" : obj.toString());
        }
        return sb2.toString();
    }

    public static int m37452V(String str, String str2) {
        return Integer.compare(str2.length(), str.length());
    }

    public static int m37451W(long j) {
        if (j < 0) {
            long j2 = -j;
            if (j2 < 100000) {
                if (j2 < 100) {
                    return j2 < 10 ? 2 : 3;
                }
                if (j2 < 1000) {
                    return 4;
                }
                return j2 < 10000 ? 5 : 6;
            } else if (j2 < 10000000) {
                return j2 < 1000000 ? 7 : 8;
            } else {
                if (j2 < 100000000) {
                    return 9;
                }
                return j2 < 1000000000 ? 10 : 11;
            }
        } else if (j < 100000) {
            if (j < 100) {
                return j < 10 ? 1 : 2;
            }
            if (j < 1000) {
                return 3;
            }
            return j < 10000 ? 4 : 5;
        } else if (j < 10000000) {
            return j < 1000000 ? 6 : 7;
        } else {
            if (j < 100000000) {
                return 8;
            }
            return j < 1000000000 ? 9 : 10;
        }
    }

    public static String m37450X(String str, int i) {
        int length = str.length();
        if (length <= i) {
            return str;
        }
        int i2 = 0;
        do {
            i2 += Character.charCount(str.codePointAt(i2));
            i--;
            if (i2 >= length) {
                break;
            }
        } while (i > 0);
        if (i2 >= length) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str, 0, i2);
        sb2.append((char) 8230);
        return sb2.toString();
    }

    public static CharSequence m37449Y(String str) {
        return m37448Z(str, 0);
    }

    public static CharSequence m37448Z(String str, int i) {
        int indexOf;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int i2 = 0;
        do {
            int indexOf2 = spannableStringBuilder.toString().indexOf("**") + 2;
            indexOf = spannableStringBuilder.toString().indexOf("**", indexOf2);
            if (indexOf2 > -1 && indexOf > -1) {
                boolean N0 = RunnableC5390g.m22981N0(spannableStringBuilder, indexOf2, indexOf);
                spannableStringBuilder.setSpan(new C5132o(N0 ? C1389o.m37258k() : C1389o.m37260i(), i).m23851k(N0), indexOf2, indexOf, 33);
                spannableStringBuilder.delete(indexOf, indexOf + 2);
                spannableStringBuilder.delete(indexOf2 - 2, indexOf2);
                i2++;
            }
            if (indexOf2 <= -1) {
                break;
            }
        } while (indexOf > -1);
        return i2 > 0 ? spannableStringBuilder : str;
    }

    public static String m37446a0(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            int charCount = Character.charCount(codePointAt);
            if (charCount != 1) {
                sb2.appendCodePoint(codePointAt);
            } else if (codePointAt == 10) {
                if (i2 != 12) {
                    sb2.append(' ');
                }
                i2 = 0;
            } else {
                i2 = Character.getType(codePointAt);
                sb2.append((char) codePointAt);
            }
            i += charCount;
        }
        return sb2.toString();
    }

    public static String m37445b(String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                String trim = str.trim();
                if (!trim.isEmpty()) {
                    return trim;
                }
            }
        }
        return "";
    }

    public static String m37444b0(String str) {
        if (C5070i.m24061i(str)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        int indexOf = sb2.indexOf(" ");
        int i = 0;
        if (indexOf == -1) {
            indexOf = 0;
        }
        while (indexOf < sb2.length()) {
            if (C5070i.m24058l(sb2.charAt(indexOf))) {
                i++;
                if (i == 10) {
                    i = 1;
                }
                sb2.setCharAt(indexOf, Character.forDigit(i, 10));
            }
            indexOf++;
        }
        return sb2.toString();
    }

    public static boolean m37443c(String str, String str2, int[] iArr) {
        if (str.startsWith(str2)) {
            if (iArr != null) {
                iArr[0] = 0;
            }
            return true;
        }
        int i = 0;
        int i2 = 0;
        do {
            int L = m37462L(str, i, f4977c);
            if (L == -1) {
                return false;
            }
            i = L + 1;
            i2++;
        } while (!str.startsWith(str2, i));
        if (iArr != null) {
            iArr[0] = i2;
        }
        return true;
    }

    public static CharSequence m37442c0(CharSequence charSequence, int i) {
        if (charSequence instanceof Spannable) {
            C5132o[] oVarArr = (C5132o[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), C5132o.class);
            if (oVarArr != null && oVarArr.length > 0) {
                for (C5132o oVar : oVarArr) {
                    oVar.m23853i(i);
                }
            }
        }
        return charSequence;
    }

    public static void m37441d(StringBuilder sb2, float f) {
        sb2.append(C7389v0.m16641e0(f, false));
    }

    public static String m37440d0(String str) {
        String str2;
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                str2 = PhoneNumberUtils.formatNumber(str, "US");
            } else {
                str2 = PhoneNumberUtils.formatNumber(str);
            }
        } catch (Throwable th) {
            Log.m14725e("Couldn't format the phone number", th, new Object[0]);
            str2 = null;
        }
        return (C5070i.m24061i(str2) || m37470D(str2).length() < m37470D(str).length()) ? str : str2;
    }

    public static StringBuilder m37439e(StringBuilder sb2, int i) {
        sb2.append(i);
        return sb2;
    }

    public static char m37438e0(char c) {
        char lowerCase = Character.toLowerCase(c);
        if (lowerCase >= 'a' && lowerCase <= 'c') {
            return '2';
        }
        if (lowerCase >= 'd' && lowerCase <= 'f') {
            return '3';
        }
        if (lowerCase >= 'g' && lowerCase <= 'i') {
            return '4';
        }
        if (lowerCase >= 'j' && lowerCase <= 'l') {
            return '5';
        }
        if (lowerCase >= 'm' && lowerCase <= 'o') {
            return '6';
        }
        if (lowerCase >= 'p' && lowerCase <= 's') {
            return '7';
        }
        if (lowerCase >= 't' && lowerCase <= 'v') {
            return '8';
        }
        if (lowerCase >= 'w' && lowerCase <= 'z') {
            return '9';
        }
        throw new IllegalArgumentException();
    }

    public static String m37437f(long j) {
        if (!C4868i.m24726c2().m24744a0()) {
            return C4403w.m27939S(j);
        }
        StringBuilder sb2 = new StringBuilder(m37451W(j));
        m37435g(j, C4403w.m27809x1(), sb2);
        return sb2.toString();
    }

    public static String m37436f0(String str) {
        return m37434g0(str, 0);
    }

    public static void m37435g(long j, String str, StringBuilder sb2) {
        sb2.ensureCapacity(sb2.length() + m37451W(j));
        boolean z = j < 0;
        if (z) {
            j = -j;
        }
        if (j < 1000) {
            if (z) {
                j = -j;
            }
            sb2.append(j);
            return;
        }
        int length = sb2.length();
        while (j != 0) {
            long j2 = j % 1000;
            j /= 1000;
            sb2.insert(length, j2);
            if (j != 0) {
                if (j2 != 0) {
                    while (true) {
                        j2 *= 10;
                        if (j2 >= 1000) {
                            break;
                        }
                        sb2.insert(length, '0');
                    }
                } else {
                    sb2.insert(length, "00");
                }
                sb2.insert(length, str);
            }
        }
        if (z) {
            sb2.insert(0, '-');
        }
    }

    public static String m37434g0(String str, int i) {
        boolean z;
        if (C5070i.m24061i(str)) {
            return str;
        }
        int length = str.length();
        int indexOf = str.indexOf(10);
        if (indexOf == -1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append((CharSequence) str, 0, indexOf);
        if (i > 0) {
            i--;
            sb2.append('\n');
            z = true;
        } else {
            sb2.append(' ');
            z = false;
        }
        int i2 = indexOf + 1;
        do {
            int indexOf2 = str.indexOf(10, i2);
            if (indexOf2 != -1) {
                sb2.append((CharSequence) str, i2, indexOf2);
                if (i > 0) {
                    i--;
                    sb2.append('\n');
                    z = true;
                } else if (!z || indexOf2 > i2) {
                    sb2.append(' ');
                    z = false;
                }
                i2 = indexOf2 + 1;
                continue;
            } else {
                sb2.append((CharSequence) str, i2, length);
                i2 = length;
                continue;
            }
        } while (i2 < length);
        return sb2.toString();
    }

    public static String m37433h(long j) {
        StringBuilder sb2 = new StringBuilder(4);
        m37431i(j, TimeUnit.SECONDS, false, sb2);
        return sb2.toString();
    }

    public static String m37432h0(String str, String str2) {
        if (C5070i.m24061i(str2)) {
            return str2;
        }
        StringBuilder sb2 = new StringBuilder(str2);
        int i = 0;
        if (sb2.length() >= 2) {
            int length = sb2.length();
            if (sb2.charAt(0) == '\"') {
                int i2 = length - 1;
                if (sb2.charAt(i2) == '\"') {
                    sb2.delete(i2, length);
                    sb2.delete(0, 1);
                }
            }
        }
        while (true) {
            String str3 = "\\";
            int indexOf = sb2.indexOf(str3, i);
            if (indexOf == -1) {
                return sb2.toString();
            }
            if (indexOf != sb2.length() - 1) {
                char charAt = sb2.charAt(indexOf + 1);
                if (charAt == '\"') {
                    str3 = "\"";
                } else if (charAt == '\'') {
                    str3 = "'";
                } else if (charAt == '\\') {
                    continue;
                } else if (charAt == 'n') {
                    str3 = "\n";
                } else {
                    throw new IllegalArgumentException("Illegal character escape: \\" + charAt + ", key: " + str + ", value: " + str2);
                }
                sb2.replace(indexOf, indexOf + 2, str3);
                i = indexOf + str3.length();
            } else {
                throw new IllegalArgumentException("Illegal character escape at the end of the string, key: " + str + ", value: " + str2);
            }
        }
    }

    public static StringBuilder m37431i(long j, TimeUnit timeUnit, boolean z, StringBuilder sb2) {
        int i;
        int seconds = (int) timeUnit.toSeconds(j);
        int i2 = seconds / 60;
        if (i2 > 60) {
            i = i2 / 60;
            i2 %= 60;
        } else {
            i = 0;
        }
        int i3 = seconds % 60;
        if (i > 0) {
            sb2.append(i);
            sb2.append(':');
            if (i2 < 10) {
                sb2.append('0');
            }
        }
        sb2.append(i2);
        sb2.append(':');
        if (i3 < 10) {
            sb2.append('0');
        }
        sb2.append(i3);
        if (z) {
            sb2.append(C4403w.m27830s0());
            sb2.append((timeUnit.toMillis(j) % 1000) / 100);
        }
        return sb2;
    }

    public static String m37430i0(String str) {
        return (!C5070i.m24061i(str) && str.startsWith("www.")) ? str.substring(4) : str;
    }

    public static void m37429j(int i, boolean z, StringBuilder sb2) {
        sb2.append('#');
        int alpha = Color.alpha(i);
        String c1 = alpha < 255 ? C7389v0.m16648c1(alpha) : null;
        String c12 = C7389v0.m16648c1(Color.red(i));
        String c13 = C7389v0.m16648c1(Color.green(i));
        String c14 = C7389v0.m16648c1(Color.blue(i));
        if (z && c12.charAt(0) == c12.charAt(1) && c13.charAt(0) == c13.charAt(1) && c14.charAt(0) == c14.charAt(1) && (c1 == null || c1.charAt(0) == c1.charAt(1))) {
            sb2.append(c12.charAt(0));
            sb2.append(c13.charAt(0));
            sb2.append(c14.charAt(0));
            if (c1 != null) {
                sb2.append(c1.charAt(0));
                return;
            }
            return;
        }
        sb2.append(c12);
        sb2.append(c13);
        sb2.append(c14);
        if (c1 != null) {
            sb2.append(c1);
        }
    }

    public static String m37428j0(String str) {
        if (C5070i.m24061i(str)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        int i = 0;
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 10) {
                sb2.append("\\n");
            } else if (codePointAt == 44 || codePointAt == 59 || codePointAt == 92) {
                sb2.append('\\');
                sb2.appendCodePoint(codePointAt);
            } else {
                sb2.appendCodePoint(codePointAt);
            }
            i += Character.charCount(codePointAt);
        }
        return sb2.toString();
    }

    public static SpannableStringBuilder m37427k(String str) {
        URLSpan[] uRLSpanArr;
        Spanned fromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, fromHtml.length(), URLSpan.class)) {
            spannableStringBuilder.setSpan(new C1364a(uRLSpan), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
            spannableStringBuilder.removeSpan(uRLSpan);
        }
        return spannableStringBuilder;
    }

    public static String m37426k0(String str, boolean z) {
        String replace = str == null ? "" : str.replace("\n", "\\n").replace("'", "\\'").replace("\"", "\\\"");
        if (!z && !replace.startsWith(" ") && !replace.endsWith(" ")) {
            return replace;
        }
        return "\"" + replace + "\"";
    }

    public static CharSequence m37425l(AbstractC10664f9 f9Var, CharSequence charSequence, C5132o.AbstractC5133a aVar) {
        if (charSequence == null) {
            return null;
        }
        TdApi.FormattedText A5 = C4779t2.m25725A5(charSequence, false);
        if (C4779t2.m25621P4(A5)) {
            TdApi.TextEntity[] textEntityArr = A5.entities;
            if (textEntityArr.length > 0) {
                return C4779t2.m25397x0(f9Var, A5.text, textEntityArr, null, aVar);
            }
        }
        return charSequence;
    }

    public static Uri m37424l0(String str) {
        if (C5070i.m24061i(str)) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            if (!C5070i.m24061i(scheme)) {
                return !scheme.toLowerCase().equals(scheme) ? parse.buildUpon().scheme(scheme.toLowerCase()).build() : parse;
            }
            return Uri.parse("https://" + str);
        } catch (Throwable th) {
            Log.m14725e("Unable to parse uri: %s", th, str);
            return null;
        }
    }

    public static String m37423m(long j) {
        return m37421n(j, true);
    }

    public static String m37422m0(String str) {
        if (str == null) {
            return null;
        }
        if (!C1389o.m37255n() && !C1389o.m37254o()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (C1389o.m37255n()) {
            sb2.append("\u200f");
        }
        sb2.append(str);
        if (C1389o.m37254o()) {
            sb2.append("\u2069");
        }
        return sb2.toString();
    }

    public static String m37421n(long j, boolean z) {
        return m37419o(j, z, C4868i.m24726c2().m24663k1(64L));
    }

    public static String m37420n0(String str) {
        if (str == null) {
            return null;
        }
        if (!C1389o.m37256m() && !C1389o.m37254o()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (C1389o.m37256m()) {
            sb2.append("\u200e");
        }
        sb2.append(str);
        if (C1389o.m37254o()) {
            sb2.append("\u2069");
        }
        return sb2.toString();
    }

    public static String m37419o(long j, boolean z, boolean z2) {
        int i;
        double d;
        if (z2) {
            if (j < EnumC6459p.f20143P.mo20395b(1.0d)) {
                return C4403w.m27844o2(R.string.xBytes, (int) j);
            }
            if (j < EnumC6459p.f20144Q.mo20395b(1.0d)) {
                i = R.string.fileSize_KB;
                d = EnumC6459p.f20154a.m20399e(j);
            } else if (j < EnumC6459p.f20145R.mo20395b(1.0d)) {
                i = R.string.fileSize_MB;
                d = EnumC6459p.f20154a.m20397g(j);
            } else {
                i = R.string.fileSize_GB;
                d = EnumC6459p.f20154a.m20401c(j);
            }
        } else if (j < EnumC6459p.f20156b.mo20395b(1.0d)) {
            return C4403w.m27844o2(R.string.xBytes, (int) j);
        } else {
            if (j < EnumC6459p.f20158c.mo20395b(1.0d)) {
                i = R.string.fileSize_KiB;
                d = EnumC6459p.f20154a.m20398f(j);
            } else if (j < EnumC6459p.f20140M.mo20395b(1.0d)) {
                i = R.string.fileSize_MiB;
                d = EnumC6459p.f20154a.m20396h(j);
            } else {
                i = R.string.fileSize_GiB;
                d = EnumC6459p.f20154a.m20400d(j);
            }
        }
        Object[] objArr = new Object[1];
        objArr[0] = z ? C4403w.m27943R(d) : m37437f((long) d);
        return C4403w.m27865j1(i, objArr);
    }

    public static String m37418o0(String str) {
        return C4403w.m27984G2() ? m37422m0(str) : m37420n0(str);
    }

    public static String m37417p(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < '!' || charAt > '/') && ((charAt < ':' || charAt > '?') && ((charAt < '[' || charAt > '`') && (charAt < '{' || charAt > '~')))) {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }

    public static CharSequence m37416q(CharSequence charSequence, CharSequence... charSequenceArr) {
        boolean z;
        int length = charSequence.length();
        int length2 = charSequenceArr.length;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            z = true;
            if (i >= length2) {
                break;
            }
            CharSequence charSequence2 = charSequenceArr[i];
            if (i2 > 0) {
                i2 += length;
                if (charSequence instanceof Spanned) {
                    z2 = true;
                }
            }
            i2 += charSequence2 != null ? charSequence2.length() : 0;
            if (charSequence2 instanceof Spanned) {
                z2 = true;
            }
            i++;
        }
        CharSequence spannableStringBuilder = z2 ? new SpannableStringBuilder() : new StringBuilder(i2);
        for (CharSequence charSequence3 : charSequenceArr) {
            if (!C5070i.m24061i(charSequence3)) {
                if (z) {
                    z = false;
                } else if (z2) {
                    ((SpannableStringBuilder) spannableStringBuilder).append(charSequence);
                } else {
                    ((StringBuilder) spannableStringBuilder).append(charSequence);
                }
                if (z2) {
                    ((SpannableStringBuilder) spannableStringBuilder).append(charSequence3);
                } else {
                    ((StringBuilder) spannableStringBuilder).append(charSequence3);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static CharSequence m37415r(CharSequence charSequence, CharSequence charSequence2) {
        return m37416q(" – ", charSequence, charSequence2);
    }

    public static int m37414s(String str, int i, int i2, AbstractC1365b bVar) {
        int i3 = 0;
        while (i < i2) {
            if (bVar.mo22712a(str.charAt(i))) {
                i3++;
            }
            i++;
        }
        return i3;
    }

    public static boolean m37413t(String str, String str2) {
        return m37465I(str, str2, 0, null) != str;
    }

    public static void m37412u(CharSequence charSequence, int i) {
        C5132o[] oVarArr = charSequence instanceof Spannable ? (C5132o[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), C5132o.class) : null;
        if (oVarArr != null) {
            for (C5132o oVar : oVarArr) {
                if (oVar != null) {
                    oVar.m23850l(i);
                }
            }
        }
    }

    public static String m37411v(String str, String str2) {
        char charAt;
        if (!(str.length() == 0 || str2.length() == 0)) {
            int i = 0;
            String x = m37409x(str + str2, false);
            if (x == null) {
                return str2;
            }
            int length = str.length();
            while (length > 0 && i < x.length()) {
                if (Character.isDigit(x.charAt(i))) {
                    length--;
                }
                i++;
            }
            while (i < x.length() && ((charAt = x.charAt(i)) == ')' || charAt == ' ')) {
                i++;
            }
            if (i >= str.length() && i != x.length()) {
                return x.substring(i);
            }
        }
        return str2;
    }

    public static String m37410w(String str) {
        return m37408y(str, true, true);
    }

    public static String m37409x(String str, boolean z) {
        return m37408y(str, true, z);
    }

    public static String m37408y(String str, boolean z, boolean z2) {
        String D;
        int length;
        if (C5070i.m24061i(str) || (length = (D = m37470D(str)).length()) == 0) {
            return str;
        }
        String a = C1371f0.m37391a(D, z2);
        int i = 0;
        while (a == null && i < length) {
            i++;
            a = C1371f0.m37391a(D.substring(0, length - i), z2);
        }
        if (a != null) {
            return a;
        }
        if (z) {
            D = '+' + D;
        }
        return m37440d0(D);
    }

    public static String m37407z(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        if (str.length() >= 3) {
            sb2.append(str.charAt(0));
            int length = str.length() - 2;
            for (int i = 0; i < length; i++) {
                sb2.append((char) 8226);
            }
            sb2.append(str.charAt(str.length() - 1));
        } else if (str.length() != 2) {
            return "";
        } else {
            sb2.append(str.charAt(0));
        }
        return sb2.toString();
    }
}
