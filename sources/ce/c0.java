package ce;

import android.graphics.Color;
import android.net.Uri;
import android.telephony.PhoneNumberUtils;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.Patterns;
import android.view.View;
import gd.w;
import hd.t2;
import ib.i;
import ie.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import je.g;
import mb.p;
import ob.e;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import zd.d9;

public class c0 {
    public static String f5242a = " • ";
    public static String f5243b = "…";
    public static final char[] f5244c = {' ', '\n'};

    public class a extends ClickableSpan {
        public final URLSpan f5245a;

        public a(URLSpan uRLSpan) {
            this.f5245a = uRLSpan;
        }

        @Override
        public void onClick(View view) {
            v.x(this.f5245a.getURL());
        }
    }

    public interface b {
        boolean a(char c10);
    }

    public static int A(int i10) {
        byte directionality = Character.getDirectionality(i10);
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
            return R(i10) ? 0 : 2;
        }
        return 1;
    }

    public static String B(int i10, float f10, float f11, float f12, int i11, boolean z10) {
        int alpha = Color.alpha(i11);
        StringBuilder sb2 = new StringBuilder();
        if (i10 == 0) {
            j(i11, true, sb2);
        } else if (i10 == 1) {
            sb2.append(alpha != 255 ? "rgba(" : "rgb(");
            int red = Color.red(i11);
            int green = Color.green(i11);
            int blue = Color.blue(i11);
            e(sb2, red).append(", ");
            e(sb2, green).append(", ");
            e(sb2, blue);
            if (alpha != 255) {
                sb2.append(", ");
                sb2.append(v0.e0(alpha / 255.0f, z10));
            }
            sb2.append(")");
        } else if (i10 == 2) {
            sb2.append(alpha != 255 ? "hsla(" : "hsl(");
            d(sb2, f10);
            sb2.append(", ");
            d(sb2, f11 * 100.0f);
            String str = "%, ";
            sb2.append(str);
            d(sb2, f12 * 100.0f);
            if (alpha == 255) {
                str = "%)";
            }
            sb2.append(str);
            if (alpha != 255) {
                sb2.append(v0.e0(alpha / 255.0f, z10));
                sb2.append(")");
            }
        }
        return sb2.toString();
    }

    public static String C(int i10, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        j(i10, z10, sb2);
        return sb2.toString();
    }

    public static String D(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt >= '0' && charAt <= '9') {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }

    public static int E(String str) {
        int i10 = 0;
        if (i.i(str)) {
            return 0;
        }
        int i11 = 0;
        while (i10 < str.length()) {
            int codePointAt = str.codePointAt(i10);
            int charCount = Character.charCount(codePointAt);
            if (charCount == 1 && codePointAt >= 48 && codePointAt <= 57) {
                i11++;
            }
            i10 += charCount;
        }
        return i11;
    }

    public static int F(CharSequence charSequence) {
        if (charSequence != null) {
            return G(charSequence, 0, charSequence.length());
        }
        return 0;
    }

    public static int G(CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            int codePointAt = Character.codePointAt(charSequence, i10);
            int A = A(codePointAt);
            int i12 = 1;
            if (A != 1) {
                i12 = 2;
                if (A != 2) {
                    i10 += Character.charCount(codePointAt);
                }
            }
            return i12;
        }
        return 0;
    }

    public static CharSequence H(CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "\n\n").append(charSequence2);
        append.setSpan(w.p().a(append, 0, charSequence.length(), 0, g.M0(charSequence)), 0, charSequence.length(), 33);
        return append;
    }

    public static CharSequence I(String str, String str2, int i10, char[] cArr) {
        return J(str, str2, i10, cArr, 0);
    }

    public static CharSequence J(String str, String str2, int i10, char[] cArr, int i11) {
        String str3;
        if (i.i(str) || i.i(str2)) {
            return str;
        }
        int length = str.length();
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        int v02 = g.v0(str2, i10, cArr);
        int i12 = 0;
        ArrayList arrayList = null;
        while (true) {
            if (v02 == -1 && (arrayList == null || i12 >= str2.length())) {
                break;
            } else if (v02 == -1) {
                arrayList.add(lowerCase2.substring(i12));
                break;
            } else {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                String substring = lowerCase2.substring(i12, v02);
                if (!i.i(substring)) {
                    arrayList.add(substring);
                }
                i12 = v02 + 1;
                v02 = g.t0(str2, i12);
            }
        }
        if (arrayList != null) {
            Collections.sort(arrayList, b0.f5238a);
        }
        Spannable spannable = null;
        while (i10 < length) {
            boolean startsWith = lowerCase.startsWith(lowerCase2, i10);
            if (!startsWith && arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    str3 = (String) it.next();
                    if (lowerCase.startsWith(str3, i10)) {
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
                spannable.setSpan(new o(null, R.id.theme_color_textSearchQueryHighlight).l(i11), i10, str3.length() + i10, 33);
            }
            int v03 = g.v0(str, i10, cArr);
            i10 = v03 != -1 ? v03 + 1 : length;
        }
        return spannable != null ? spannable : str;
    }

    public static boolean K(String str, String str2) {
        Uri l02;
        if (i.i(str) || i.i(str2)) {
            return false;
        }
        try {
            Uri l03 = l0(str);
            if (l03 == null || (l02 = l0(str2)) == null) {
                return false;
            }
            String i02 = i0(l03.getHost());
            String i03 = i0(l02.getHost());
            if (!i02.equals(i03) && !i02.endsWith(i03)) {
                if (!i03.endsWith(i02)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int L(String str, int i10, char[] cArr) {
        int length = str.length();
        while (i10 < length) {
            char charAt = str.charAt(i10);
            for (char c10 : cArr) {
                if (charAt == c10) {
                    return i10;
                }
            }
            i10++;
        }
        return -1;
    }

    public static int M(String str) {
        if (str == null) {
            return -1;
        }
        int i10 = 0;
        int length = str.length();
        while (i10 < length) {
            int codePointAt = str.codePointAt(i10);
            int charCount = Character.charCount(codePointAt);
            if (charCount == 1 && i.l((char) codePointAt)) {
                return i10;
            }
            i10 += charCount;
        }
        return -1;
    }

    public static boolean N(char c10) {
        return i.l(c10) || (c10 >= 'a' && c10 <= 'f') || (c10 >= 'A' && c10 <= 'F');
    }

    public static boolean O(char c10) {
        return c10 == '\n' || c10 == ' ' || c10 == '.';
    }

    public static boolean P(String str) {
        if (i.i(str)) {
            return false;
        }
        TdApi.TextEntity[] E0 = e.E0(str);
        if (E0 != null && E0.length == 1 && E0[0].offset == 0 && E0[0].length == str.length() && E0[0].type.getConstructor() == 1425545249) {
            return true;
        }
        try {
            return Patterns.EMAIL_ADDRESS.matcher(str).matches();
        } catch (Throwable th) {
            Log.w("Cannot find email address", th, new Object[0]);
            return false;
        }
    }

    public static boolean Q(String str) {
        TdApi.TextEntity[] E0;
        return !i.i(str) && (E0 = e.E0(str)) != null && E0.length == 1 && E0[0].offset == 0 && E0[0].length == str.length() && E0[0].type.getConstructor() == -1312762756;
    }

    public static boolean R(int i10) {
        switch (i10) {
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

    public static boolean S(char c10) {
        return c10 == ' ' || c10 == '\n';
    }

    public static String T(CharSequence charSequence, Iterable<?> iterable) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<?> it = iterable.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            Object next = it.next();
            if (z10) {
                z10 = false;
            } else {
                sb2.append(charSequence);
            }
            sb2.append(next == null ? "null" : next.toString());
        }
        return sb2.toString();
    }

    public static String U(CharSequence charSequence, Object... objArr) {
        StringBuilder sb2 = new StringBuilder();
        int length = objArr.length;
        boolean z10 = true;
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = objArr[i10];
            if (z10) {
                z10 = false;
            } else {
                sb2.append(charSequence);
            }
            sb2.append(obj == null ? "null" : obj.toString());
        }
        return sb2.toString();
    }

    public static int V(String str, String str2) {
        return Integer.compare(str2.length(), str.length());
    }

    public static int W(long j10) {
        if (j10 < 0) {
            long j11 = -j10;
            if (j11 < 100000) {
                if (j11 < 100) {
                    return j11 < 10 ? 2 : 3;
                }
                if (j11 < 1000) {
                    return 4;
                }
                return j11 < 10000 ? 5 : 6;
            } else if (j11 < 10000000) {
                return j11 < 1000000 ? 7 : 8;
            } else {
                if (j11 < 100000000) {
                    return 9;
                }
                return j11 < 1000000000 ? 10 : 11;
            }
        } else if (j10 < 100000) {
            if (j10 < 100) {
                return j10 < 10 ? 1 : 2;
            }
            if (j10 < 1000) {
                return 3;
            }
            return j10 < 10000 ? 4 : 5;
        } else if (j10 < 10000000) {
            return j10 < 1000000 ? 6 : 7;
        } else {
            if (j10 < 100000000) {
                return 8;
            }
            return j10 < 1000000000 ? 9 : 10;
        }
    }

    public static String X(String str, int i10) {
        int length = str.length();
        if (length <= i10) {
            return str;
        }
        int i11 = 0;
        do {
            i11 += Character.charCount(str.codePointAt(i11));
            i10--;
            if (i11 >= length) {
                break;
            }
        } while (i10 > 0);
        if (i11 >= length) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str, 0, i11);
        sb2.append((char) 8230);
        return sb2.toString();
    }

    public static CharSequence Y(String str) {
        return Z(str, 0);
    }

    public static CharSequence Z(String str, int i10) {
        int indexOf;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int i11 = 0;
        do {
            int indexOf2 = spannableStringBuilder.toString().indexOf("**") + 2;
            indexOf = spannableStringBuilder.toString().indexOf("**", indexOf2);
            if (indexOf2 > -1 && indexOf > -1) {
                boolean N0 = g.N0(spannableStringBuilder, indexOf2, indexOf);
                spannableStringBuilder.setSpan(new o(N0 ? o.k() : o.i(), i10).k(N0), indexOf2, indexOf, 33);
                spannableStringBuilder.delete(indexOf, indexOf + 2);
                spannableStringBuilder.delete(indexOf2 - 2, indexOf2);
                i11++;
            }
            if (indexOf2 <= -1) {
                break;
            }
        } while (indexOf > -1);
        return i11 > 0 ? spannableStringBuilder : str;
    }

    public static String a0(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int codePointAt = str.codePointAt(i10);
            int charCount = Character.charCount(codePointAt);
            if (charCount != 1) {
                sb2.appendCodePoint(codePointAt);
            } else if (codePointAt == 10) {
                if (i11 != 12) {
                    sb2.append(' ');
                }
                i11 = 0;
            } else {
                i11 = Character.getType(codePointAt);
                sb2.append((char) codePointAt);
            }
            i10 += charCount;
        }
        return sb2.toString();
    }

    public static String b(String... strArr) {
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

    public static String b0(String str) {
        if (i.i(str)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        int indexOf = sb2.indexOf(" ");
        int i10 = 0;
        if (indexOf == -1) {
            indexOf = 0;
        }
        while (indexOf < sb2.length()) {
            if (i.l(sb2.charAt(indexOf))) {
                i10++;
                if (i10 == 10) {
                    i10 = 1;
                }
                sb2.setCharAt(indexOf, Character.forDigit(i10, 10));
            }
            indexOf++;
        }
        return sb2.toString();
    }

    public static boolean c(String str, String str2, int[] iArr) {
        if (str.startsWith(str2)) {
            if (iArr != null) {
                iArr[0] = 0;
            }
            return true;
        }
        int i10 = 0;
        int i11 = 0;
        do {
            int L = L(str, i10, f5244c);
            if (L == -1) {
                return false;
            }
            i10 = L + 1;
            i11++;
        } while (!str.startsWith(str2, i10));
        if (iArr != null) {
            iArr[0] = i11;
        }
        return true;
    }

    public static CharSequence c0(CharSequence charSequence, int i10) {
        if (charSequence instanceof Spannable) {
            o[] oVarArr = (o[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), o.class);
            if (oVarArr != null && oVarArr.length > 0) {
                for (o oVar : oVarArr) {
                    oVar.i(i10);
                }
            }
        }
        return charSequence;
    }

    public static void d(StringBuilder sb2, float f10) {
        sb2.append(v0.e0(f10, false));
    }

    public static String d0(String str) {
        String str2;
        try {
            str2 = PhoneNumberUtils.formatNumber(str, "US");
        } catch (Throwable th) {
            Log.e("Couldn't format the phone number", th, new Object[0]);
            str2 = null;
        }
        return (i.i(str2) || D(str2).length() < D(str).length()) ? str : str2;
    }

    public static StringBuilder e(StringBuilder sb2, int i10) {
        sb2.append(i10);
        return sb2;
    }

    public static char e0(char c10) {
        char lowerCase = Character.toLowerCase(c10);
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

    public static String f(long j10) {
        if (!he.i.c2().a0()) {
            return w.S(j10);
        }
        StringBuilder sb2 = new StringBuilder(W(j10));
        g(j10, w.x1(), sb2);
        return sb2.toString();
    }

    public static String f0(String str) {
        return g0(str, 0);
    }

    public static void g(long j10, String str, StringBuilder sb2) {
        sb2.ensureCapacity(sb2.length() + W(j10));
        boolean z10 = j10 < 0;
        if (z10) {
            j10 = -j10;
        }
        if (j10 < 1000) {
            if (z10) {
                j10 = -j10;
            }
            sb2.append(j10);
            return;
        }
        int length = sb2.length();
        while (j10 != 0) {
            long j11 = j10 % 1000;
            j10 /= 1000;
            sb2.insert(length, j11);
            if (j10 != 0) {
                if (j11 != 0) {
                    while (true) {
                        j11 *= 10;
                        if (j11 >= 1000) {
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
        if (z10) {
            sb2.insert(0, '-');
        }
    }

    public static String g0(String str, int i10) {
        boolean z10;
        if (i.i(str)) {
            return str;
        }
        int length = str.length();
        int indexOf = str.indexOf(10);
        if (indexOf == -1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append((CharSequence) str, 0, indexOf);
        if (i10 > 0) {
            i10--;
            sb2.append('\n');
            z10 = true;
        } else {
            sb2.append(' ');
            z10 = false;
        }
        int i11 = indexOf + 1;
        do {
            int indexOf2 = str.indexOf(10, i11);
            if (indexOf2 != -1) {
                sb2.append((CharSequence) str, i11, indexOf2);
                if (i10 > 0) {
                    i10--;
                    sb2.append('\n');
                    z10 = true;
                } else if (!z10 || indexOf2 > i11) {
                    sb2.append(' ');
                    z10 = false;
                }
                i11 = indexOf2 + 1;
                continue;
            } else {
                sb2.append((CharSequence) str, i11, length);
                i11 = length;
                continue;
            }
        } while (i11 < length);
        return sb2.toString();
    }

    public static String h(long j10) {
        StringBuilder sb2 = new StringBuilder(4);
        i(j10, TimeUnit.SECONDS, false, sb2);
        return sb2.toString();
    }

    public static String h0(String str, String str2) {
        if (i.i(str2)) {
            return str2;
        }
        StringBuilder sb2 = new StringBuilder(str2);
        int i10 = 0;
        if (sb2.length() >= 2) {
            int length = sb2.length();
            if (sb2.charAt(0) == '\"') {
                int i11 = length - 1;
                if (sb2.charAt(i11) == '\"') {
                    sb2.delete(i11, length);
                    sb2.delete(0, 1);
                }
            }
        }
        while (true) {
            String str3 = "\\";
            int indexOf = sb2.indexOf(str3, i10);
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
                i10 = indexOf + str3.length();
            } else {
                throw new IllegalArgumentException("Illegal character escape at the end of the string, key: " + str + ", value: " + str2);
            }
        }
    }

    public static StringBuilder i(long j10, TimeUnit timeUnit, boolean z10, StringBuilder sb2) {
        int i10;
        int seconds = (int) timeUnit.toSeconds(j10);
        int i11 = seconds / 60;
        if (i11 > 60) {
            i10 = i11 / 60;
            i11 %= 60;
        } else {
            i10 = 0;
        }
        int i12 = seconds % 60;
        if (i10 > 0) {
            sb2.append(i10);
            sb2.append(':');
            if (i11 < 10) {
                sb2.append('0');
            }
        }
        sb2.append(i11);
        sb2.append(':');
        if (i12 < 10) {
            sb2.append('0');
        }
        sb2.append(i12);
        if (z10) {
            sb2.append(w.s0());
            sb2.append((timeUnit.toMillis(j10) % 1000) / 100);
        }
        return sb2;
    }

    public static String i0(String str) {
        return (!i.i(str) && str.startsWith("www.")) ? str.substring(4) : str;
    }

    public static void j(int i10, boolean z10, StringBuilder sb2) {
        sb2.append('#');
        int alpha = Color.alpha(i10);
        String c12 = alpha < 255 ? v0.c1(alpha) : null;
        String c13 = v0.c1(Color.red(i10));
        String c14 = v0.c1(Color.green(i10));
        String c15 = v0.c1(Color.blue(i10));
        if (z10 && c13.charAt(0) == c13.charAt(1) && c14.charAt(0) == c14.charAt(1) && c15.charAt(0) == c15.charAt(1) && (c12 == null || c12.charAt(0) == c12.charAt(1))) {
            sb2.append(c13.charAt(0));
            sb2.append(c14.charAt(0));
            sb2.append(c15.charAt(0));
            if (c12 != null) {
                sb2.append(c12.charAt(0));
                return;
            }
            return;
        }
        sb2.append(c13);
        sb2.append(c14);
        sb2.append(c15);
        if (c12 != null) {
            sb2.append(c12);
        }
    }

    public static String j0(String str) {
        if (i.i(str)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        int i10 = 0;
        while (i10 < str.length()) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt == 10) {
                sb2.append("\\n");
            } else if (codePointAt == 44 || codePointAt == 59 || codePointAt == 92) {
                sb2.append('\\');
                sb2.appendCodePoint(codePointAt);
            } else {
                sb2.appendCodePoint(codePointAt);
            }
            i10 += Character.charCount(codePointAt);
        }
        return sb2.toString();
    }

    public static SpannableStringBuilder k(String str) {
        URLSpan[] uRLSpanArr;
        Spanned fromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, fromHtml.length(), URLSpan.class)) {
            spannableStringBuilder.setSpan(new a(uRLSpan), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
            spannableStringBuilder.removeSpan(uRLSpan);
        }
        return spannableStringBuilder;
    }

    public static String k0(String str, boolean z10) {
        String replace = str == null ? "" : str.replace("\n", "\\n").replace("'", "\\'").replace("\"", "\\\"");
        if (!z10 && !replace.startsWith(" ") && !replace.endsWith(" ")) {
            return replace;
        }
        return "\"" + replace + "\"";
    }

    public static CharSequence l(d9 d9Var, CharSequence charSequence, o.a aVar) {
        if (charSequence == null) {
            return null;
        }
        TdApi.FormattedText A5 = t2.A5(charSequence, false);
        if (t2.P4(A5)) {
            TdApi.TextEntity[] textEntityArr = A5.entities;
            if (textEntityArr.length > 0) {
                return t2.x0(d9Var, A5.text, textEntityArr, null, aVar);
            }
        }
        return charSequence;
    }

    public static Uri l0(String str) {
        if (i.i(str)) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            if (!i.i(scheme)) {
                return !scheme.toLowerCase().equals(scheme) ? parse.buildUpon().scheme(scheme.toLowerCase()).build() : parse;
            }
            return Uri.parse("https://" + str);
        } catch (Throwable th) {
            Log.e("Unable to parse uri: %s", th, str);
            return null;
        }
    }

    public static String m(long j10) {
        return n(j10, true);
    }

    public static String m0(String str) {
        if (str == null) {
            return null;
        }
        if (!o.n() && !o.o()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (o.n()) {
            sb2.append("\u200f");
        }
        sb2.append(str);
        if (o.o()) {
            sb2.append("\u2069");
        }
        return sb2.toString();
    }

    public static String n(long j10, boolean z10) {
        return o(j10, z10, he.i.c2().k1(64L));
    }

    public static String n0(String str) {
        if (str == null) {
            return null;
        }
        if (!o.m() && !o.o()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (o.m()) {
            sb2.append("\u200e");
        }
        sb2.append(str);
        if (o.o()) {
            sb2.append("\u2069");
        }
        return sb2.toString();
    }

    public static String o(long j10, boolean z10, boolean z11) {
        int i10;
        double d10;
        if (z11) {
            if (j10 < p.P.b(1.0d)) {
                return w.o2(R.string.xBytes, (int) j10);
            }
            if (j10 < p.Q.b(1.0d)) {
                i10 = R.string.fileSize_KB;
                d10 = p.f17343a.e(j10);
            } else if (j10 < p.R.b(1.0d)) {
                i10 = R.string.fileSize_MB;
                d10 = p.f17343a.g(j10);
            } else {
                i10 = R.string.fileSize_GB;
                d10 = p.f17343a.c(j10);
            }
        } else if (j10 < p.f17345b.b(1.0d)) {
            return w.o2(R.string.xBytes, (int) j10);
        } else {
            if (j10 < p.f17347c.b(1.0d)) {
                i10 = R.string.fileSize_KiB;
                d10 = p.f17343a.f(j10);
            } else if (j10 < p.M.b(1.0d)) {
                i10 = R.string.fileSize_MiB;
                d10 = p.f17343a.h(j10);
            } else {
                i10 = R.string.fileSize_GiB;
                d10 = p.f17343a.d(j10);
            }
        }
        Object[] objArr = new Object[1];
        objArr[0] = z10 ? w.R(d10) : f((long) d10);
        return w.j1(i10, objArr);
    }

    public static String o0(String str) {
        return w.G2() ? m0(str) : n0(str);
    }

    public static String p(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if ((charAt < '!' || charAt > '/') && ((charAt < ':' || charAt > '?') && ((charAt < '[' || charAt > '`') && (charAt < '{' || charAt > '~')))) {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }

    public static CharSequence q(CharSequence charSequence, CharSequence... charSequenceArr) {
        boolean z10;
        int length = charSequence.length();
        int length2 = charSequenceArr.length;
        int i10 = 0;
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            z10 = true;
            if (i10 >= length2) {
                break;
            }
            CharSequence charSequence2 = charSequenceArr[i10];
            if (i11 > 0) {
                i11 += length;
                if (charSequence instanceof Spanned) {
                    z11 = true;
                }
            }
            i11 += charSequence2 != null ? charSequence2.length() : 0;
            if (charSequence2 instanceof Spanned) {
                z11 = true;
            }
            i10++;
        }
        CharSequence spannableStringBuilder = z11 ? new SpannableStringBuilder() : new StringBuilder(i11);
        for (CharSequence charSequence3 : charSequenceArr) {
            if (!i.i(charSequence3)) {
                if (z10) {
                    z10 = false;
                } else if (z11) {
                    ((SpannableStringBuilder) spannableStringBuilder).append(charSequence);
                } else {
                    ((StringBuilder) spannableStringBuilder).append(charSequence);
                }
                if (z11) {
                    ((SpannableStringBuilder) spannableStringBuilder).append(charSequence3);
                } else {
                    ((StringBuilder) spannableStringBuilder).append(charSequence3);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static CharSequence r(CharSequence charSequence, CharSequence charSequence2) {
        return q(" – ", charSequence, charSequence2);
    }

    public static int s(String str, int i10, int i11, b bVar) {
        int i12 = 0;
        while (i10 < i11) {
            if (bVar.a(str.charAt(i10))) {
                i12++;
            }
            i10++;
        }
        return i12;
    }

    public static boolean t(String str, String str2) {
        return I(str, str2, 0, null) != str;
    }

    public static void u(CharSequence charSequence, int i10) {
        o[] oVarArr = charSequence instanceof Spannable ? (o[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), o.class) : null;
        if (oVarArr != null) {
            for (o oVar : oVarArr) {
                if (oVar != null) {
                    oVar.l(i10);
                }
            }
        }
    }

    public static String v(String str, String str2) {
        char charAt;
        if (!(str.length() == 0 || str2.length() == 0)) {
            int i10 = 0;
            String x10 = x(str + str2, false);
            if (x10 == null) {
                return str2;
            }
            int length = str.length();
            while (length > 0 && i10 < x10.length()) {
                if (Character.isDigit(x10.charAt(i10))) {
                    length--;
                }
                i10++;
            }
            while (i10 < x10.length() && ((charAt = x10.charAt(i10)) == ')' || charAt == ' ')) {
                i10++;
            }
            if (i10 >= str.length() && i10 != x10.length()) {
                return x10.substring(i10);
            }
        }
        return str2;
    }

    public static String w(String str) {
        return y(str, true, true);
    }

    public static String x(String str, boolean z10) {
        return y(str, true, z10);
    }

    public static String y(String str, boolean z10, boolean z11) {
        String D;
        int length;
        if (i.i(str) || (length = (D = D(str)).length()) == 0) {
            return str;
        }
        String a10 = f0.a(D, z11);
        int i10 = 0;
        while (a10 == null && i10 < length) {
            i10++;
            a10 = f0.a(D.substring(0, length - i10), z11);
        }
        if (a10 != null) {
            return a10;
        }
        if (z10) {
            D = '+' + D;
        }
        return d0(D);
    }

    public static String z(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        if (str.length() >= 3) {
            sb2.append(str.charAt(0));
            int length = str.length() - 2;
            for (int i10 = 0; i10 < length; i10++) {
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
