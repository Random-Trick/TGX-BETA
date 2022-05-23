package gd;

import android.content.Context;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.NumberFormat;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import ce.c0;
import ce.j0;
import com.googlecode.mp4parser.boxes.microsoft.XtraBox;
import d.j;
import hd.s4;
import hd.t2;
import ib.h;
import ib.i;
import ie.o;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import je.g;
import je.l0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.v4;
import zd.d9;
import zd.o6;
import zd.w6;
import zd.ya;

public class w {
    public static int f12340a;
    public static String f12341b;
    public static Object f12342c;
    public static Locale f12343d;
    public static Set<String> f12344e;
    public static boolean f12345f;
    public static boolean f12346g;
    public static boolean f12347h;
    public static Locale f12348i;
    public static lb.d<a> f12349j;
    public static Map<String, TdApi.LanguagePackStringValue> f12350k;
    public static TdApi.LanguagePackStringValueDeleted f12351l;

    public interface a {
        void Q5(int i10, int i11);
    }

    public static class b {
        public final TdApi.LanguagePackInfo f12352a;
        public final e f12353b;
        public final e f12354c;
        public final List<c> f12355d;
        public Pattern f12356e;

        public b(TdApi.LanguagePackInfo languagePackInfo, e eVar, e eVar2, List<c> list) {
            this.f12352a = languagePackInfo;
            this.f12353b = eVar;
            this.f12354c = eVar2;
            this.f12355d = list;
        }

        public static int c(int i10) {
            switch (i10) {
                case 1:
                    return R.string.ToolsStringSectionMain;
                case 2:
                    return R.string.ToolsStringSectionUrl;
                case 3:
                    return R.string.ToolsStringSectionJson;
                case 4:
                    return R.string.ToolsStringSectionFormat;
                case 5:
                    return R.string.ToolsStringSectionRelativeDate;
                case 6:
                    return R.string.ToolsStringSectionPlural;
                case 7:
                    return R.string.ToolsStringSectionSimpleFormatted;
                case 8:
                    return R.string.ToolsStringSectionSimple;
                default:
                    throw new IllegalArgumentException("section == " + i10);
            }
        }

        public static int d(TdApi.LanguagePackString languagePackString) {
            String str = languagePackString.key;
            if (str.startsWith("language_")) {
                return 1;
            }
            if (str.startsWith("url_")) {
                return 2;
            }
            if (str.startsWith("format_")) {
                return 4;
            }
            if (str.startsWith("json_")) {
                return 3;
            }
            String[] strArr = {"now", "minutes", "hours", "today", "yesterday", "weekday", "date"};
            for (int i10 = 0; i10 < 7; i10++) {
                String str2 = strArr[i10];
                if (str.endsWith("_" + str2)) {
                    return 5;
                }
            }
            TdApi.LanguagePackStringValue languagePackStringValue = languagePackString.value;
            if (languagePackStringValue instanceof TdApi.LanguagePackStringValuePluralized) {
                return 6;
            }
            return (!(languagePackStringValue instanceof TdApi.LanguagePackStringValueOrdinary) || !i.f(((TdApi.LanguagePackStringValueOrdinary) languagePackStringValue).value)) ? 8 : 7;
        }

        public c a(c cVar) {
            int indexOf = cVar != null ? this.f12355d.indexOf(cVar) : -1;
            int i10 = 0;
            if (indexOf == -1) {
                indexOf = 0;
            }
            if (indexOf == 0) {
                for (c cVar2 : this.f12355d) {
                    if (!(cVar2 == cVar || cVar2.f12358b)) {
                        return cVar2;
                    }
                }
                return null;
            }
            int size = this.f12355d.size();
            for (int i11 = indexOf + 1; i11 < size; i11++) {
                c cVar3 = this.f12355d.get(i11);
                if (!(cVar3 == cVar || cVar3.f12358b)) {
                    return cVar3;
                }
            }
            for (c cVar4 : this.f12355d) {
                if (cVar4 == cVar || cVar4.f12358b) {
                    i10++;
                    if (i10 == indexOf) {
                        break;
                    }
                } else {
                    return cVar4;
                }
            }
            return null;
        }

        public Pattern b() {
            if (this.f12356e == null) {
                this.f12356e = Pattern.compile("(%%|%\\d+\\$(?:\\d+)?\\w)");
            }
            return this.f12356e;
        }

        public int e() {
            int i10 = 0;
            for (c cVar : this.f12355d) {
                if (!cVar.f12358b) {
                    i10++;
                }
            }
            return i10;
        }

        public void f(c cVar, SpannableStringBuilder spannableStringBuilder, boolean z10) {
            String str;
            int constructor = cVar.f12357a.value.getConstructor();
            if (constructor == -249256352) {
                g(((TdApi.LanguagePackStringValueOrdinary) cVar.f12357a.value).value, spannableStringBuilder, z10, -1);
            } else if (constructor == 1906840261) {
                TdApi.LanguagePackStringValuePluralized languagePackStringValuePluralized = (TdApi.LanguagePackStringValuePluralized) cVar.f12357a.value;
                for (d dVar : (cVar.f12358b ? this.f12353b : this.f12354c).f12363b) {
                    int i10 = dVar.f12360a;
                    if (i10 == 0) {
                        str = languagePackStringValuePluralized.zeroValue;
                    } else if (i10 == 1) {
                        str = languagePackStringValuePluralized.oneValue;
                    } else if (i10 == 2) {
                        str = languagePackStringValuePluralized.twoValue;
                    } else if (i10 == 3) {
                        str = languagePackStringValuePluralized.fewValue;
                    } else if (i10 == 4) {
                        str = languagePackStringValuePluralized.manyValue;
                    } else if (i10 == 5) {
                        str = languagePackStringValuePluralized.otherValue;
                    }
                    if (!i.i(str)) {
                        int[] iArr = dVar.f12361b;
                        if (iArr.length > 0) {
                            g(str, spannableStringBuilder, z10, iArr[0]);
                        }
                    }
                }
            }
        }

        public void g(String str, SpannableStringBuilder spannableStringBuilder, boolean z10, int i10) {
            int indexOf;
            int i11;
            int i12;
            int g10;
            if (!i.i(str)) {
                String str2 = "\n";
                int i13 = 0;
                if (str.indexOf(str2) != -1) {
                    if (!z10) {
                        str = str.substring(0, indexOf) + "…";
                    } else if (i10 >= 0 && spannableStringBuilder.length() > 0) {
                        str = str2 + str;
                    }
                }
                if (spannableStringBuilder.length() > 0) {
                    if (!z10) {
                        str2 = ", ";
                    }
                    spannableStringBuilder.append((CharSequence) str2);
                }
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) str);
                Matcher matcher = b().matcher(str);
                while (matcher.find()) {
                    int start = matcher.start();
                    int end = matcher.end();
                    spannableStringBuilder.setSpan(new o(ce.o.i(), R.id.theme_color_textNeutral).j(new TdApi.TextEntityTypeBold()).k(g.N0(str, start, end)), start + length, end + length, 33);
                }
                if (i10 >= 0 && (g10 = i.g(spannableStringBuilder, "%1$s", length)) != -1) {
                    int i14 = g10 + 4;
                    Object[] objArr = (o[]) spannableStringBuilder.getSpans(g10, i14, o.class);
                    if (objArr != null && objArr.length == 1) {
                        spannableStringBuilder.removeSpan(objArr[0]);
                        String S = w.S(i10);
                        objArr[0].k(g.M0(S));
                        spannableStringBuilder.replace(g10, i14, (CharSequence) S);
                        spannableStringBuilder.setSpan(objArr[0], g10, S.length() + g10, 33);
                    }
                }
                int length2 = spannableStringBuilder.length();
                if (length != length2) {
                    int i15 = 0;
                    while (true) {
                        i11 = length + i15;
                        if (i11 >= length2 || !c0.S(spannableStringBuilder.charAt(i11))) {
                            break;
                        }
                        i15++;
                    }
                    while (true) {
                        i12 = length2 - i13;
                        int i16 = i12 - 1;
                        if (i16 <= length || !c0.S(spannableStringBuilder.charAt(i16))) {
                            break;
                        }
                        i13++;
                    }
                    if (i15 > 0) {
                        spannableStringBuilder.setSpan(new BackgroundColorSpan(-1426128896), length, i11, 33);
                    }
                    if (i13 > 0) {
                        spannableStringBuilder.setSpan(new BackgroundColorSpan(-1426128896), i12, length2, 33);
                    }
                }
            }
        }

        public void h() {
            for (c cVar : this.f12355d) {
                cVar.e(this);
            }
        }
    }

    public static class c {
        public final TdApi.LanguagePackString f12357a;
        public boolean f12358b;
        public TdApi.LanguagePackStringValue f12359c;

        public c(TdApi.LanguagePackString languagePackString, boolean z10) {
            this.f12357a = languagePackString;
            this.f12358b = z10;
        }

        public TdApi.LanguagePackStringValuePluralized a(List<d> list) {
            TdApi.LanguagePackStringValue languagePackStringValue = this.f12359c;
            if (languagePackStringValue != null) {
                return (TdApi.LanguagePackStringValuePluralized) languagePackStringValue;
            }
            TdApi.LanguagePackStringValuePluralized d02 = w.d0(c(), list);
            this.f12359c = d02;
            return d02;
        }

        public TdApi.LanguagePackStringValueOrdinary b() {
            TdApi.LanguagePackStringValue languagePackStringValue = this.f12359c;
            if (languagePackStringValue != null) {
                return (TdApi.LanguagePackStringValueOrdinary) languagePackStringValue;
            }
            TdApi.LanguagePackStringValueOrdinary e02 = w.e0(c());
            this.f12359c = e02;
            return e02;
        }

        public String c() {
            return this.f12357a.key;
        }

        public int d() {
            return b.d(this.f12357a);
        }

        public void e(b bVar) {
            int constructor = this.f12357a.value.getConstructor();
            boolean z10 = true;
            if (constructor == -249256352) {
                TdApi.LanguagePackString languagePackString = this.f12357a;
                TdApi.LanguagePackStringValueOrdinary languagePackStringValueOrdinary = (TdApi.LanguagePackStringValueOrdinary) languagePackString.value;
                TdApi.LanguagePackStringValueOrdinary E2 = w.E2(languagePackString.key, bVar.f12352a.f19945id);
                if (E2 == null) {
                    z10 = false;
                }
                this.f12358b = z10;
                if (!z10) {
                    E2 = b();
                }
                languagePackStringValueOrdinary.value = E2.value;
            } else if (constructor == 1906840261) {
                TdApi.LanguagePackString languagePackString2 = this.f12357a;
                TdApi.LanguagePackStringValuePluralized languagePackStringValuePluralized = (TdApi.LanguagePackStringValuePluralized) languagePackString2.value;
                TdApi.LanguagePackStringValuePluralized D2 = w.D2(languagePackString2.key, bVar.f12352a.f19945id);
                if (D2 == null) {
                    z10 = false;
                }
                this.f12358b = z10;
                if (D2 == null) {
                    D2 = w.d0(this.f12357a.key, bVar.f12354c.f12363b);
                }
                languagePackStringValuePluralized.zeroValue = D2.zeroValue;
                languagePackStringValuePluralized.oneValue = D2.oneValue;
                languagePackStringValuePluralized.twoValue = D2.twoValue;
                languagePackStringValuePluralized.fewValue = D2.fewValue;
                languagePackStringValuePluralized.manyValue = D2.manyValue;
                languagePackStringValuePluralized.otherValue = D2.otherValue;
            }
        }
    }

    public static class d {
        public final int f12360a;
        public final int[] f12361b;

        public d(int i10, int... iArr) {
            this.f12360a = i10;
            this.f12361b = iArr;
        }

        public static String b(TdApi.LanguagePackStringValuePluralized languagePackStringValuePluralized, int i10) {
            if (i10 == 0) {
                return languagePackStringValuePluralized.zeroValue;
            }
            if (i10 == 1) {
                return languagePackStringValuePluralized.oneValue;
            }
            if (i10 == 2) {
                return languagePackStringValuePluralized.twoValue;
            }
            if (i10 == 3) {
                return languagePackStringValuePluralized.fewValue;
            }
            if (i10 == 4) {
                return languagePackStringValuePluralized.manyValue;
            }
            if (i10 == 5) {
                return languagePackStringValuePluralized.otherValue;
            }
            throw new IllegalArgumentException("form == " + i10);
        }

        public String a(TdApi.LanguagePackStringValuePluralized languagePackStringValuePluralized) {
            return b(languagePackStringValuePluralized, this.f12360a);
        }
    }

    public static class e {
        public final int f12362a;
        public final List<d> f12363b = new ArrayList();

        public e(int i10) {
            this.f12362a = i10;
        }

        public e a(int i10, int... iArr) {
            this.f12363b.add(new d(i10, iArr));
            return this;
        }
    }

    public interface f {
        Object a(CharSequence charSequence, int i10, int i11, int i12, boolean z10);
    }

    public static String A(int i10, int i11) {
        if (i11 < 1000) {
            return String.valueOf(i11);
        }
        return c0.f(i11);
    }

    public static String[] A0(int[] iArr) {
        String[] strArr = new String[iArr.length];
        int i10 = 0;
        for (int i11 : iArr) {
            strArr[i10] = e1(i11);
            i10++;
        }
        return strArr;
    }

    public static CharSequence A1(v4<?> v4Var, TdApi.ChatSource chatSource) {
        int constructor = chatSource.getConstructor();
        if (constructor == -328571244) {
            return U0(v4Var, ((TdApi.ChatSourcePublicServiceAnnouncement) chatSource).type, true);
        }
        if (constructor == 394074115) {
            return H0(v4Var, R.string.ProxySponsorAlert, new Object[0]);
        }
        throw new UnsupportedOperationException(chatSource.toString());
    }

    public static boolean A2(int i10) {
        return (((i10 / 60) / 60) / 24) / 7 > 2 || i10 <= 0;
    }

    public static String B(String str, long j10) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return new SimpleDateFormat(str, C()).format(ib.f.b(j10));
            } catch (ExceptionInInitializerError e10) {
                Log.e("Vendor i18n implementation bug in SimpleDateFormat", e10, new Object[0]);
            }
        }
        return new java.text.SimpleDateFormat(str, C()).format(ib.f.b(j10));
    }

    public static int B0() {
        return 0;
    }

    public static String B1(int i10, int i11) {
        return i11 <= 1 ? o2(R.string.xNewMessages, i10) : j1(R.string.format_newMessagesFromChats, o2(R.string.xNewMessages, i10), o2(R.string.FromXChats, i11));
    }

    public static void B2(String str, TdApi.LanguagePackStringValue languagePackStringValue) {
        if (languagePackStringValue == null) {
            languagePackStringValue = g();
        }
        r().put(str, languagePackStringValue);
    }

    public static Locale C() {
        if (!f12345f) {
            v(false);
        }
        Locale locale = Locale.getDefault();
        Locale locale2 = f12348i;
        return (locale2 == null || locale2.getLanguage().equals(locale.getLanguage())) ? locale : f12348i;
    }

    public static int C0(String str) {
        return 0;
    }

    public static String C1(long j10, TimeUnit timeUnit) {
        if (ib.f.m(j10, timeUnit)) {
            return T2(j10, timeUnit);
        }
        return ib.f.n(j10, timeUnit) ? j1(R.string.format_tomorrow, T2(j10, timeUnit)) : ib.f.l(j10, timeUnit) ? j1(R.string.format_dateTime, D(j10, timeUnit), T2(j10, timeUnit)) : j1(R.string.format_dateTime, G(j10, timeUnit), T2(j10, timeUnit));
    }

    public static void C2(String str, TdApi.LanguagePackString[] languagePackStringArr) {
        if (!r().isEmpty()) {
            for (TdApi.LanguagePackString languagePackString : languagePackStringArr) {
                String b22 = b2(str, languagePackString.key);
                if (f12350k.containsKey(b22)) {
                    if (languagePackString.value.getConstructor() == 1834792698) {
                        f12350k.put(b22, g());
                    } else {
                        f12350k.put(b22, languagePackString.value);
                    }
                }
            }
        }
    }

    public static String D(long j10, TimeUnit timeUnit) {
        return R2(timeUnit.toMillis(j10), 1, "d MMMM");
    }

    public static String D0() {
        String n10 = id.d.n(i1(R.string.language_emoji));
        return n10 != null ? n10 : Z();
    }

    public static String D1(o6 o6Var, TdApi.UserStatus userStatus, boolean z10) {
        switch (userStatus.getConstructor()) {
            case TdApi.UserStatusOnline.CONSTRUCTOR:
                return i1(R.string.status_Online);
            case TdApi.UserStatusOffline.CONSTRUCTOR:
                int i10 = ((TdApi.UserStatusOffline) userStatus).wasOnline;
                if (i10 > 0) {
                    return F0(o6Var, i10, TimeUnit.SECONDS, z10);
                }
                return i1(R.string.status_LastSeenUnknown);
            case TdApi.UserStatusRecently.CONSTRUCTOR:
                return i1(R.string.status_LastSeenRecently);
            case TdApi.UserStatusLastWeek.CONSTRUCTOR:
                return i1(R.string.status_LastSeenWithinWeek);
            case TdApi.UserStatusEmpty.CONSTRUCTOR:
                return i1(R.string.status_LastSeenUnknown);
            case TdApi.UserStatusLastMonth.CONSTRUCTOR:
                return i1(R.string.status_LastSeenWithinMonth);
            default:
                throw new IllegalArgumentException("status == " + userStatus);
        }
    }

    public static TdApi.LanguagePackStringValuePluralized D2(String str, String str2) {
        ya o12 = ya.o1();
        if (str2 == null) {
            str2 = k2();
        }
        return o12.N0(str, str2);
    }

    public static String E(Calendar calendar) {
        if (calendar.get(1) == ib.f.e().get(1)) {
            return F(calendar);
        }
        return H(calendar);
    }

    public static b E0(TdApi.LanguagePackInfo languagePackInfo) {
        String[] strArr;
        boolean z10;
        String[][] a10 = y.a();
        ArrayList arrayList = new ArrayList();
        e S0 = S0(a2(q1(null, R.string.language_code, false)));
        TdApi.LanguagePackStringValueOrdinary E2 = E2("language_code", languagePackInfo.f19945id);
        e S02 = E2 != null ? S0(a2(E2.value)) : S0;
        String[] strArr2 = a10[0];
        int length = strArr2.length;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= length) {
                break;
            }
            String str = strArr2[i10];
            TdApi.LanguagePackStringValueOrdinary E22 = E2(str, languagePackInfo.f19945id);
            if (E22 == null && !i.i(languagePackInfo.baseLanguagePackId)) {
                E22 = E2(str, languagePackInfo.baseLanguagePackId);
                z11 = false;
            }
            if (E22 != null) {
                arrayList.add(new c(new TdApi.LanguagePackString(str, E22), z11));
            } else {
                arrayList.add(new c(new TdApi.LanguagePackString(str, e0(str)), false));
            }
            i10++;
        }
        for (String str2 : a10[1]) {
            TdApi.LanguagePackStringValuePluralized D2 = D2(str2, languagePackInfo.f19945id);
            if (D2 != null || i.i(languagePackInfo.baseLanguagePackId)) {
                z10 = true;
            } else {
                D2 = D2(str2, languagePackInfo.baseLanguagePackId);
                z10 = false;
            }
            if (D2 != null) {
                arrayList.add(new c(new TdApi.LanguagePackString(str2, D2), z10));
            } else {
                arrayList.add(new c(new TdApi.LanguagePackString(str2, d0(str2, S0.f12363b)), false));
            }
        }
        Collections.sort(arrayList, v.f12339a);
        return new b(languagePackInfo, S02, S0, arrayList);
    }

    public static String E1(int i10, int i11) {
        return j1(R.string.XofY, A(R.string.XofY, i10), A(R.string.XofY, i11));
    }

    public static TdApi.LanguagePackStringValueOrdinary E2(String str, String str2) {
        ya o12 = ya.o1();
        if (str2 == null) {
            str2 = k2();
        }
        return o12.O0(str, str2);
    }

    public static String F(Calendar calendar) {
        return R2(calendar.getTimeInMillis(), 2, "d MMM");
    }

    public static String F0(o6 o6Var, long j10, TimeUnit timeUnit, boolean z10) {
        return X0(j10, timeUnit, o6Var.H4(), TimeUnit.MILLISECONDS, z10, 60, R.string.status_LastSeen, false);
    }

    public static int F1() {
        return G2() ? 5 : 3;
    }

    public static void F2(a aVar) {
        if (f12349j == null) {
            synchronized (w.class) {
                if (f12349j == null) {
                    return;
                }
            }
        }
        f12349j.remove(aVar);
    }

    public static String G(long j10, TimeUnit timeUnit) {
        return O2(timeUnit.toMillis(j10), 1, "d MMMM yyyy");
    }

    public static CharSequence G0(d9 d9Var, int i10, f fVar, Object... objArr) {
        return c0.l(d9Var, h1(i10, fVar, objArr), null);
    }

    public static int G1(int i10) {
        return i10 | F1();
    }

    public static boolean G2() {
        if (!f12345f) {
            v(false);
        }
        return f12347h;
    }

    public static String H(Calendar calendar) {
        return O2(calendar.getTimeInMillis(), 2, "d MMM ''yy");
    }

    public static CharSequence H0(d9 d9Var, int i10, Object... objArr) {
        return c0.l(d9Var, j1(i10, objArr), null);
    }

    public static boolean H1(int i10, int i11) {
        return (i10 == 0 && i11 == 1) || i10 == 1;
    }

    public static void H2(int i10, int i11) {
        s4.v8(i10, i11);
        if (f12349j == null) {
            synchronized (w.class) {
                if (f12349j == null) {
                    return;
                }
            }
        }
        Iterator<a> it = f12349j.iterator();
        while (it.hasNext()) {
            it.next().Q5(i10, i11);
        }
    }

    public static String I(long j10, TimeUnit timeUnit) {
        return P2(timeUnit.toMillis(j10), 2, 3, j0.X() ? "d MMM ''yy h:mm a" : "d MMM ''yy H:mm");
    }

    public static CharSequence I0(d9 d9Var, int i10, Object... objArr) {
        return c0.l(d9Var, u1(i10, objArr), null);
    }

    public static boolean I1() {
        if (f12349j == null) {
            synchronized (w.class) {
                if (f12349j == null) {
                    return false;
                }
            }
        }
        return !f12349j.isEmpty();
    }

    public static void I2(Locale locale, boolean z10) {
        Locale locale2 = f12348i;
        if ((locale2 == null && locale != null) || ((locale2 != null && locale == null) || (locale != null && !locale.equals(locale2)))) {
            f12348i = locale;
            if (z10) {
                H2(3, 0);
            }
        }
    }

    public static void J() {
        boolean z10 = f12347h;
        x();
        v(false);
        H2(0, f12347h != z10 ? 1 : 0);
    }

    public static String J0(long j10, TimeUnit timeUnit) {
        return Z0(j10, timeUnit);
    }

    public static boolean J1(Object[] objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj instanceof Spanned) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void J2(boolean z10, boolean z11) {
        if (f12346g != z10) {
            f12346g = z10;
        }
    }

    public static void K(String str, TdApi.LanguagePackString[] languagePackStringArr, String str2) {
        if (str2 != null) {
            str = str2;
        }
        C2(str, languagePackStringArr);
        v(true);
        if (I1()) {
            for (TdApi.LanguagePackString languagePackString : languagePackStringArr) {
                int s12 = s1(languagePackString.key);
                if (s12 != 0) {
                    H2(2, s12);
                }
            }
            return;
        }
        H2(2, 0);
    }

    public static String K0(long j10, TimeUnit timeUnit) {
        return X0(j10, timeUnit, System.currentTimeMillis(), TimeUnit.MILLISECONDS, true, 30, R.string.modified, false);
    }

    public static String K1(long j10, TimeUnit timeUnit) {
        return B(j0.X() ? "hh a" : "HH", timeUnit.toMillis(j10));
    }

    public static void K2(boolean z10, boolean z11) {
        if (f12347h != z10) {
            f12347h = z10;
            if (z11) {
                H2(1, z10 ? 1 : 0);
            }
        }
    }

    public static f L(final TdApi.TextEntityType textEntityType) {
        return new f() {
            @Override
            public final Object a(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
                Object I5;
                I5 = t2.I5(TdApi.TextEntityType.this);
                return I5;
            }
        };
    }

    public static long L0(long j10, TimeUnit timeUnit, long j11, TimeUnit timeUnit2, boolean z10, int i10) {
        long j12;
        long millis = timeUnit2.toMillis(j11);
        long millis2 = timeUnit.toMillis(j10);
        if (z10) {
            long j13 = millis - millis2;
            long seconds = TimeUnit.MILLISECONDS.toSeconds(j13);
            if (seconds >= -300) {
                long j14 = i10;
                if (seconds < j14) {
                    return TimeUnit.SECONDS.toMillis(j14) - j13;
                }
                if (seconds < 60) {
                    return 1000 - (j13 % 1000);
                }
                long j15 = seconds / 60;
                if (j15 < 60) {
                    j12 = j15 + 1;
                } else {
                    long j16 = j15 / 60;
                    if (j16 < 4) {
                        j12 = (j16 + 1) * 60;
                    }
                }
                return (j12 * 60000) - j13;
            }
        }
        Calendar a10 = ib.f.a(millis2);
        ib.f.q(a10);
        long timeInMillis = a10.getTimeInMillis();
        Calendar a11 = ib.f.a(millis);
        ib.f.q(a11);
        int days = (int) TimeUnit.MILLISECONDS.toDays(a11.getTimeInMillis() - timeInMillis);
        if (days != 0 && days != 1) {
            return -1L;
        }
        a11.add(5, 1);
        ib.f.q(a11);
        return Math.max(-1L, a11.getTimeInMillis() - millis);
    }

    public static boolean L1(String str) {
        return a0().equals(str);
    }

    public static String L2(float f10) {
        return M2(f10, R.string.location_Nearby, R.string.location_AwayMeters, R.string.location_AwayKilometers);
    }

    public static int M() {
        String q12 = q1(null, R.string.language_code, false);
        if (f12340a == 0 || !q12.equals(f12341b)) {
            f12340a = a2(q12);
            f12341b = q12;
        }
        return f12340a;
    }

    public static long M0(long j10, TimeUnit timeUnit, long j11, TimeUnit timeUnit2, boolean z10, int i10) {
        long j12;
        long millis = timeUnit2.toMillis(j11);
        long millis2 = timeUnit.toMillis(j10);
        if (z10) {
            long j13 = millis2 - millis;
            long seconds = TimeUnit.MILLISECONDS.toSeconds(j13);
            if (seconds >= -300) {
                long j14 = i10;
                if (seconds < j14) {
                    return TimeUnit.SECONDS.toMillis(j14) - j13;
                }
                if (seconds < 60) {
                    return 1000 - (j13 % 1000);
                }
                long j15 = seconds / 60;
                if (j15 < 60) {
                    j12 = j15 + 1;
                } else {
                    long j16 = j15 / 60;
                    if (j16 < 4) {
                        j12 = (j16 + 1) * 60;
                    }
                }
                return (j12 * 60000) - j13;
            }
        }
        Calendar a10 = ib.f.a(millis2);
        ib.f.q(a10);
        long timeInMillis = a10.getTimeInMillis();
        Calendar a11 = ib.f.a(millis);
        ib.f.q(a11);
        int days = (int) TimeUnit.MILLISECONDS.toDays(timeInMillis - a11.getTimeInMillis());
        if (days != 0 && days != 1) {
            return -1L;
        }
        a11.add(5, 1);
        ib.f.q(a11);
        return Math.max(-1L, a11.getTimeInMillis() - millis);
    }

    public static boolean M1(char c10) {
        return c10 == 'd' || c10 == 'D';
    }

    public static String M2(float f10, int i10, int i11, int i12) {
        if (f10 < 10.0f) {
            return i1(i10);
        }
        float round = Math.round(f10);
        float f11 = round - (round % 10.0f);
        if (f11 < 1000.0f) {
            return j1(i11, String.valueOf((int) f11));
        }
        int floor = (int) Math.floor(f11 / 1000.0f);
        int i13 = ((int) (f11 - (floor * 1000.0f))) / 100;
        StringBuilder sb2 = new StringBuilder(c0.f(floor));
        if (i13 != 0 && floor < 1000) {
            sb2.append(s0());
            sb2.append(i13);
        }
        return j1(i12, sb2.toString());
    }

    public static boolean N(String str, TdApi.LanguagePackInfo languagePackInfo) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3109:
                if (str.equals("af")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3116:
                if (str.equals("am")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3121:
                if (str.equals("ar")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3122:
                if (str.equals("as")) {
                    c10 = 3;
                    break;
                }
                break;
            case 3129:
                if (str.equals("az")) {
                    c10 = 4;
                    break;
                }
                break;
            case 3139:
                if (str.equals("be")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3141:
                if (str.equals("bg")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3148:
                if (str.equals("bn")) {
                    c10 = 7;
                    break;
                }
                break;
            case 3152:
                if (str.equals("br")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 3153:
                if (str.equals("bs")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 3166:
                if (str.equals("ca")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 3167:
                if (str.equals("cb")) {
                    c10 = 11;
                    break;
                }
                break;
            case 3180:
                if (str.equals("co")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 3184:
                if (str.equals("cs")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 3189:
                if (str.equals("cx")) {
                    c10 = 14;
                    break;
                }
                break;
            case 3190:
                if (str.equals("cy")) {
                    c10 = 15;
                    break;
                }
                break;
            case 3197:
                if (str.equals("da")) {
                    c10 = 16;
                    break;
                }
                break;
            case 3201:
                if (str.equals("de")) {
                    c10 = 17;
                    break;
                }
                break;
            case 3239:
                if (str.equals("el")) {
                    c10 = 18;
                    break;
                }
                break;
            case 3241:
                if (str.equals("en")) {
                    c10 = 19;
                    break;
                }
                break;
            case 3246:
                if (str.equals("es")) {
                    c10 = 20;
                    break;
                }
                break;
            case 3247:
                if (str.equals("et")) {
                    c10 = 21;
                    break;
                }
                break;
            case 3248:
                if (str.equals("eu")) {
                    c10 = 22;
                    break;
                }
                break;
            case 3259:
                if (str.equals("fa")) {
                    c10 = 23;
                    break;
                }
                break;
            case 3264:
                if (str.equals("ff")) {
                    c10 = 24;
                    break;
                }
                break;
            case 3267:
                if (str.equals("fi")) {
                    c10 = 25;
                    break;
                }
                break;
            case 3273:
                if (str.equals("fo")) {
                    c10 = 26;
                    break;
                }
                break;
            case 3276:
                if (str.equals("fr")) {
                    c10 = 27;
                    break;
                }
                break;
            case 3283:
                if (str.equals("fy")) {
                    c10 = 28;
                    break;
                }
                break;
            case 3290:
                if (str.equals("ga")) {
                    c10 = 29;
                    break;
                }
                break;
            case 3301:
                if (str.equals("gl")) {
                    c10 = 30;
                    break;
                }
                break;
            case 3303:
                if (str.equals("gn")) {
                    c10 = 31;
                    break;
                }
                break;
            case 3310:
                if (str.equals("gu")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 3321:
                if (str.equals("ha")) {
                    c10 = '!';
                    break;
                }
                break;
            case 3325:
                if (str.equals("he")) {
                    c10 = '\"';
                    break;
                }
                break;
            case 3329:
                if (str.equals("hi")) {
                    c10 = '#';
                    break;
                }
                break;
            case 3338:
                if (str.equals("hr")) {
                    c10 = '$';
                    break;
                }
                break;
            case 3340:
                if (str.equals("ht")) {
                    c10 = '%';
                    break;
                }
                break;
            case 3341:
                if (str.equals("hu")) {
                    c10 = '&';
                    break;
                }
                break;
            case 3345:
                if (str.equals("hy")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 3355:
                if (str.equals("id")) {
                    c10 = '(';
                    break;
                }
                break;
            case 3370:
                if (str.equals("is")) {
                    c10 = ')';
                    break;
                }
                break;
            case 3371:
                if (str.equals("it")) {
                    c10 = '*';
                    break;
                }
                break;
            case 3383:
                if (str.equals("ja")) {
                    c10 = '+';
                    break;
                }
                break;
            case 3404:
                if (str.equals("jv")) {
                    c10 = ',';
                    break;
                }
                break;
            case 3414:
                if (str.equals("ka")) {
                    c10 = '-';
                    break;
                }
                break;
            case 3424:
                if (str.equals("kk")) {
                    c10 = '.';
                    break;
                }
                break;
            case 3426:
                if (str.equals("km")) {
                    c10 = '/';
                    break;
                }
                break;
            case 3427:
                if (str.equals("kn")) {
                    c10 = '0';
                    break;
                }
                break;
            case 3428:
                if (str.equals("ko")) {
                    c10 = '1';
                    break;
                }
                break;
            case 3434:
                if (str.equals("ku")) {
                    c10 = '2';
                    break;
                }
                break;
            case 3438:
                if (str.equals("ky")) {
                    c10 = '3';
                    break;
                }
                break;
            case 3459:
                if (str.equals("lo")) {
                    c10 = '4';
                    break;
                }
                break;
            case 3464:
                if (str.equals("lt")) {
                    c10 = '5';
                    break;
                }
                break;
            case 3466:
                if (str.equals("lv")) {
                    c10 = '6';
                    break;
                }
                break;
            case 3482:
                if (str.equals("mg")) {
                    c10 = '7';
                    break;
                }
                break;
            case 3486:
                if (str.equals("mk")) {
                    c10 = '8';
                    break;
                }
                break;
            case 3487:
                if (str.equals("ml")) {
                    c10 = '9';
                    break;
                }
                break;
            case 3489:
                if (str.equals("mn")) {
                    c10 = ':';
                    break;
                }
                break;
            case 3493:
                if (str.equals("mr")) {
                    c10 = ';';
                    break;
                }
                break;
            case 3494:
                if (str.equals("ms")) {
                    c10 = '<';
                    break;
                }
                break;
            case 3495:
                if (str.equals("mt")) {
                    c10 = '=';
                    break;
                }
                break;
            case 3500:
                if (str.equals("my")) {
                    c10 = '>';
                    break;
                }
                break;
            case 3508:
                if (str.equals("nb")) {
                    c10 = '?';
                    break;
                }
                break;
            case 3511:
                if (str.equals("ne")) {
                    c10 = '@';
                    break;
                }
                break;
            case 3518:
                if (str.equals("nl")) {
                    c10 = 'A';
                    break;
                }
                break;
            case 3520:
                if (str.equals("nn")) {
                    c10 = 'B';
                    break;
                }
                break;
            case 3555:
                if (str.equals("or")) {
                    c10 = 'C';
                    break;
                }
                break;
            case 3569:
                if (str.equals("pa")) {
                    c10 = 'D';
                    break;
                }
                break;
            case 3580:
                if (str.equals("pl")) {
                    c10 = 'E';
                    break;
                }
                break;
            case 3587:
                if (str.equals("ps")) {
                    c10 = 'F';
                    break;
                }
                break;
            case 3588:
                if (str.equals("pt")) {
                    c10 = 'G';
                    break;
                }
                break;
            case 3645:
                if (str.equals("ro")) {
                    c10 = 'H';
                    break;
                }
                break;
            case 3651:
                if (str.equals("ru")) {
                    c10 = 'I';
                    break;
                }
                break;
            case 3653:
                if (str.equals("rw")) {
                    c10 = 'J';
                    break;
                }
                break;
            case 3664:
                if (str.equals("sc")) {
                    c10 = 'K';
                    break;
                }
                break;
            case 3670:
                if (str.equals("si")) {
                    c10 = 'L';
                    break;
                }
                break;
            case 3672:
                if (str.equals("sk")) {
                    c10 = 'M';
                    break;
                }
                break;
            case 3673:
                if (str.equals("sl")) {
                    c10 = 'N';
                    break;
                }
                break;
            case 3675:
                if (str.equals("sn")) {
                    c10 = 'O';
                    break;
                }
                break;
            case 3676:
                if (str.equals("so")) {
                    c10 = 'P';
                    break;
                }
                break;
            case 3678:
                if (str.equals("sq")) {
                    c10 = 'Q';
                    break;
                }
                break;
            case 3679:
                if (str.equals("sr")) {
                    c10 = 'R';
                    break;
                }
                break;
            case 3683:
                if (str.equals("sv")) {
                    c10 = 'S';
                    break;
                }
                break;
            case 3684:
                if (str.equals("sw")) {
                    c10 = 'T';
                    break;
                }
                break;
            case 3687:
                if (str.equals("sz")) {
                    c10 = 'U';
                    break;
                }
                break;
            case 3693:
                if (str.equals("ta")) {
                    c10 = 'V';
                    break;
                }
                break;
            case 3697:
                if (str.equals("te")) {
                    c10 = 'W';
                    break;
                }
                break;
            case 3699:
                if (str.equals("tg")) {
                    c10 = 'X';
                    break;
                }
                break;
            case 3700:
                if (str.equals("th")) {
                    c10 = 'Y';
                    break;
                }
                break;
            case 3704:
                if (str.equals("tl")) {
                    c10 = 'Z';
                    break;
                }
                break;
            case 3710:
                if (str.equals("tr")) {
                    c10 = '[';
                    break;
                }
                break;
            case 3718:
                if (str.equals("tz")) {
                    c10 = '\\';
                    break;
                }
                break;
            case 3734:
                if (str.equals("uk")) {
                    c10 = ']';
                    break;
                }
                break;
            case 3741:
                if (str.equals("ur")) {
                    c10 = '^';
                    break;
                }
                break;
            case 3749:
                if (str.equals("uz")) {
                    c10 = '_';
                    break;
                }
                break;
            case 3763:
                if (str.equals("vi")) {
                    c10 = '`';
                    break;
                }
                break;
            case 3886:
                if (str.equals("zh")) {
                    c10 = 'a';
                    break;
                }
                break;
            case 3904:
                if (str.equals("zz")) {
                    c10 = 'b';
                    break;
                }
                break;
            case 92666319:
                if (str.equals("af-ZA")) {
                    c10 = 'c';
                    break;
                }
                break;
            case 92874224:
                if (str.equals("am-ET")) {
                    c10 = 'd';
                    break;
                }
                break;
            case 93023053:
                if (str.equals("ar-AR")) {
                    c10 = 'e';
                    break;
                }
                break;
            case 93053088:
                if (str.equals("as-IN")) {
                    c10 = 'f';
                    break;
                }
                break;
            case 93261389:
                if (str.equals("az-AZ")) {
                    c10 = 'g';
                    break;
                }
                break;
            case 93559329:
                if (str.equals("be-BY")) {
                    c10 = 'h';
                    break;
                }
                break;
            case 93618893:
                if (str.equals("bg-BG")) {
                    c10 = 'i';
                    break;
                }
                break;
            case 93827654:
                if (str.equals("bn-IN")) {
                    c10 = 'j';
                    break;
                }
                break;
            case 93946729:
                if (str.equals("br-FR")) {
                    c10 = 'k';
                    break;
                }
                break;
            case 93976379:
                if (str.equals("bs-BA")) {
                    c10 = 'l';
                    break;
                }
                break;
            case 94363773:
                if (str.equals("ca-ES")) {
                    c10 = 'm';
                    break;
                }
                break;
            case 94393686:
                if (str.equals("cb-IQ")) {
                    c10 = 'n';
                    break;
                }
                break;
            case 94780877:
                if (str.equals("co-FR")) {
                    c10 = 'o';
                    break;
                }
                break;
            case 94899956:
                if (str.equals("cs-CZ")) {
                    c10 = 'p';
                    break;
                }
                break;
            case 95049296:
                if (str.equals("cx-PH")) {
                    c10 = 'q';
                    break;
                }
                break;
            case 95078802:
                if (str.equals("cy-GB")) {
                    c10 = 'r';
                    break;
                }
                break;
            case 95287255:
                if (str.equals("da-DK")) {
                    c10 = 's';
                    break;
                }
                break;
            case 95406413:
                if (str.equals("de-DE")) {
                    c10 = 't';
                    break;
                }
                break;
            case 96538577:
                if (str.equals("el-GR")) {
                    c10 = 'u';
                    break;
                }
                break;
            case 96598143:
                if (str.equals("en-GB")) {
                    c10 = 'v';
                    break;
                }
                break;
            case 96598594:
                if (str.equals("en-US")) {
                    c10 = 'w';
                    break;
                }
                break;
            case 96747053:
                if (str.equals("es-ES")) {
                    c10 = 'x';
                    break;
                }
                break;
            case 96747252:
                if (str.equals("es-LA")) {
                    c10 = 'y';
                    break;
                }
                break;
            case 96776830:
                if (str.equals("et-EE")) {
                    c10 = 'z';
                    break;
                }
                break;
            case 96806635:
                if (str.equals("eu-ES")) {
                    c10 = '{';
                    break;
                }
                break;
            case 97134459:
                if (str.equals("fa-IR")) {
                    c10 = '|';
                    break;
                }
                break;
            case 97283558:
                if (str.equals("ff-NG")) {
                    c10 = '}';
                    break;
                }
                break;
            case 97372685:
                if (str.equals("fi-FI")) {
                    c10 = '~';
                    break;
                }
                break;
            case 97551437:
                if (str.equals("fo-FO")) {
                    c10 = 127;
                    break;
                }
                break;
            case 97640703:
                if (str.equals("fr-CA")) {
                    c10 = 128;
                    break;
                }
                break;
            case 97640813:
                if (str.equals("fr-FR")) {
                    c10 = 129;
                    break;
                }
                break;
            case 97849592:
                if (str.equals("fy-NL")) {
                    c10 = 130;
                    break;
                }
                break;
            case 98057967:
                if (str.equals("ga-IE")) {
                    c10 = 131;
                    break;
                }
                break;
            case 98385558:
                if (str.equals("gl-ES")) {
                    c10 = 132;
                    break;
                }
                break;
            case 98445487:
                if (str.equals("gn-PY")) {
                    c10 = 133;
                    break;
                }
                break;
            case 98653796:
                if (str.equals("gu-IN")) {
                    c10 = 134;
                    break;
                }
                break;
            case 98981645:
                if (str.equals("ha-NG")) {
                    c10 = 135;
                    break;
                }
                break;
            case 99100659:
                if (str.equals("he-IL")) {
                    c10 = 136;
                    break;
                }
                break;
            case 99219825:
                if (str.equals("hi-IN")) {
                    c10 = 137;
                    break;
                }
                break;
            case 99487917:
                if (str.equals("hr-HR")) {
                    c10 = 138;
                    break;
                }
                break;
            case 99547501:
                if (str.equals("ht-HT")) {
                    c10 = 139;
                    break;
                }
                break;
            case 99577293:
                if (str.equals("hu-HU")) {
                    c10 = 140;
                    break;
                }
                break;
            case 99696232:
                if (str.equals("hy-AM")) {
                    c10 = 141;
                    break;
                }
                break;
            case 99994381:
                if (str.equals("id-ID")) {
                    c10 = 142;
                    break;
                }
                break;
            case 100441261:
                if (str.equals("is-IS")) {
                    c10 = 143;
                    break;
                }
                break;
            case 100471053:
                if (str.equals("it-IT")) {
                    c10 = 144;
                    break;
                }
                break;
            case 100828572:
                if (str.equals("ja-JP")) {
                    c10 = 145;
                    break;
                }
                break;
            case 100828606:
                if (str.equals("ja-KS")) {
                    c10 = 146;
                    break;
                }
                break;
            case 101454140:
                if (str.equals("jv-ID")) {
                    c10 = 147;
                    break;
                }
                break;
            case 101751989:
                if (str.equals("ka-GE")) {
                    c10 = 148;
                    break;
                }
                break;
            case 102050044:
                if (str.equals("kk-KZ")) {
                    c10 = 149;
                    break;
                }
                break;
            case 102109608:
                if (str.equals("km-KH")) {
                    c10 = 150;
                    break;
                }
                break;
            case 102139343:
                if (str.equals("kn-IN")) {
                    c10 = 151;
                    break;
                }
                break;
            case 102169200:
                if (str.equals("ko-KR")) {
                    c10 = 152;
                    break;
                }
                break;
            case 102348225:
                if (str.equals("ku-TR")) {
                    c10 = 153;
                    break;
                }
                break;
            case 102467099:
                if (str.equals("ky-KG")) {
                    c10 = 154;
                    break;
                }
                break;
            case 103092735:
                if (str.equals("lo-LA")) {
                    c10 = 155;
                    break;
                }
                break;
            case 103241709:
                if (str.equals("lt-LT")) {
                    c10 = 156;
                    break;
                }
                break;
            case 103301293:
                if (str.equals("lv-LV")) {
                    c10 = 157;
                    break;
                }
                break;
            case 103777965:
                if (str.equals("mg-MG")) {
                    c10 = 158;
                    break;
                }
                break;
            case 103897133:
                if (str.equals("mk-MK")) {
                    c10 = 159;
                    break;
                }
                break;
            case 103926803:
                if (str.equals("ml-IN")) {
                    c10 = 160;
                    break;
                }
                break;
            case 103986509:
                if (str.equals("mn-MN")) {
                    c10 = 161;
                    break;
                }
                break;
            case 104105549:
                if (str.equals("mr-IN")) {
                    c10 = 162;
                    break;
                }
                break;
            case 104135475:
                if (str.equals("ms-MY")) {
                    c10 = 163;
                    break;
                }
                break;
            case 104165261:
                if (str.equals("mt-MT")) {
                    c10 = 164;
                    break;
                }
                break;
            case 104314209:
                if (str.equals("my-MM")) {
                    c10 = 165;
                    break;
                }
                break;
            case 104552570:
                if (str.equals("nb-NO")) {
                    c10 = 166;
                    break;
                }
                break;
            case 104641944:
                if (str.equals("ne-NP")) {
                    c10 = 167;
                    break;
                }
                break;
            case 104850098:
                if (str.equals("nl-BE")) {
                    c10 = 168;
                    break;
                }
                break;
            case 104850477:
                if (str.equals("nl-NL")) {
                    c10 = 169;
                    break;
                }
                break;
            case 104910062:
                if (str.equals("nn-NO")) {
                    c10 = 170;
                    break;
                }
                break;
            case 105952591:
                if (str.equals("or-IN")) {
                    c10 = 171;
                    break;
                }
                break;
            case 106369665:
                if (str.equals("pa-IN")) {
                    c10 = 172;
                    break;
                }
                break;
            case 106697581:
                if (str.equals("pl-PL")) {
                    c10 = 173;
                    break;
                }
                break;
            case 106905647:
                if (str.equals("ps-AF")) {
                    c10 = 174;
                    break;
                }
                break;
            case 106935481:
                if (str.equals("pt-BR")) {
                    c10 = 175;
                    break;
                }
                break;
            case 106935917:
                if (str.equals("pt-PT")) {
                    c10 = 176;
                    break;
                }
                break;
            case 108634061:
                if (str.equals("ro-RO")) {
                    c10 = 177;
                    break;
                }
                break;
            case 108812813:
                if (str.equals("ru-RU")) {
                    c10 = 178;
                    break;
                }
                break;
            case 108872397:
                if (str.equals("rw-RW")) {
                    c10 = 179;
                    break;
                }
                break;
            case 109199816:
                if (str.equals("sc-IT")) {
                    c10 = 180;
                    break;
                }
                break;
            case 109378646:
                if (str.equals("si-LK")) {
                    c10 = 181;
                    break;
                }
                break;
            case 109438445:
                if (str.equals("sk-SK")) {
                    c10 = 182;
                    break;
                }
                break;
            case 109468234:
                if (str.equals("sl-SI")) {
                    c10 = 183;
                    break;
                }
                break;
            case 109528047:
                if (str.equals("sn-ZW")) {
                    c10 = 184;
                    break;
                }
                break;
            case 109557613:
                if (str.equals("so-SO")) {
                    c10 = 185;
                    break;
                }
                break;
            case 109616634:
                if (str.equals("sq-AL")) {
                    c10 = 186;
                    break;
                }
                break;
            case 109646959:
                if (str.equals("sr-RS")) {
                    c10 = 187;
                    break;
                }
                break;
            case 109766140:
                if (str.equals("sv-SE")) {
                    c10 = 188;
                    break;
                }
                break;
            case 109795683:
                if (str.equals("sw-KE")) {
                    c10 = 189;
                    break;
                }
                break;
            case 109885218:
                if (str.equals("sz-PL")) {
                    c10 = 190;
                    break;
                }
                break;
            case 110063749:
                if (str.equals("ta-IN")) {
                    c10 = 191;
                    break;
                }
                break;
            case 110182913:
                if (str.equals("te-IN")) {
                    c10 = 192;
                    break;
                }
                break;
            case 110242832:
                if (str.equals("tg-TJ")) {
                    c10 = 193;
                    break;
                }
                break;
            case 110272621:
                if (str.equals("th-TH")) {
                    c10 = 194;
                    break;
                }
                break;
            case 110391661:
                if (str.equals("tl-PH")) {
                    c10 = 195;
                    break;
                }
                break;
            case 110570541:
                if (str.equals("tr-TR")) {
                    c10 = 196;
                    break;
                }
                break;
            case 110808635:
                if (str.equals("tz-MA")) {
                    c10 = 197;
                    break;
                }
                break;
            case 111285539:
                if (str.equals("uk-UA")) {
                    c10 = 198;
                    break;
                }
                break;
            case 111493931:
                if (str.equals("ur-PK")) {
                    c10 = 199;
                    break;
                }
                break;
            case 111732429:
                if (str.equals("uz-UZ")) {
                    c10 = 200;
                    break;
                }
                break;
            case 112149522:
                if (str.equals("vi-VN")) {
                    c10 = 201;
                    break;
                }
                break;
            case 115813226:
                if (str.equals("zh-CN")) {
                    c10 = 202;
                    break;
                }
                break;
            case 115813378:
                if (str.equals("zh-HK")) {
                    c10 = 203;
                    break;
                }
                break;
            case 115813762:
                if (str.equals("zh-TW")) {
                    c10 = 204;
                    break;
                }
                break;
            case 116349995:
                if (str.equals("zz-TR")) {
                    c10 = 205;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 'c':
                languagePackInfo.name = "Afrikaans";
                languagePackInfo.nativeName = "Afrikaans";
                return true;
            case 1:
            case 'd':
                languagePackInfo.name = "Amharic";
                languagePackInfo.nativeName = "አማርኛ";
                return true;
            case 2:
            case 'e':
                languagePackInfo.name = "Arabic";
                languagePackInfo.nativeName = "العربية";
                return true;
            case 3:
            case 'f':
                languagePackInfo.name = "Assamese";
                languagePackInfo.nativeName = "অসমীয়া";
                return true;
            case 4:
            case 'g':
                languagePackInfo.name = "Azerbaijani";
                languagePackInfo.nativeName = "Azərbaycan dili";
                return true;
            case 5:
            case 'h':
                languagePackInfo.name = "Belarusian";
                languagePackInfo.nativeName = "Беларуская";
                return true;
            case 6:
            case 'i':
                languagePackInfo.name = "Bulgarian";
                languagePackInfo.nativeName = "Български";
                return true;
            case 7:
            case 'j':
                languagePackInfo.name = "Bengali";
                languagePackInfo.nativeName = "বাংলা";
                return true;
            case '\b':
            case 'k':
                languagePackInfo.name = "Breton";
                languagePackInfo.nativeName = "Brezhoneg";
                return true;
            case '\t':
            case 'l':
                languagePackInfo.name = "Bosnian";
                languagePackInfo.nativeName = "Bosanski";
                return true;
            case '\n':
            case 'm':
                languagePackInfo.name = "Catalan";
                languagePackInfo.nativeName = "Català";
                return true;
            case 11:
            case 'n':
                languagePackInfo.name = "Sorani Kurdish";
                languagePackInfo.nativeName = "کوردیی ناوەندی";
                return true;
            case '\f':
            case 'o':
                languagePackInfo.name = "Corsican";
                languagePackInfo.nativeName = "Corsu";
                return true;
            case '\r':
            case 'p':
                languagePackInfo.name = "Czech";
                languagePackInfo.nativeName = "Čeština";
                return true;
            case 14:
            case 'q':
                languagePackInfo.name = "Cebuano";
                languagePackInfo.nativeName = "Bisaya";
                return true;
            case 15:
            case j.F0:
                languagePackInfo.name = "Welsh";
                languagePackInfo.nativeName = "Cymraeg";
                return true;
            case 16:
            case j.G0:
                languagePackInfo.name = "Danish";
                languagePackInfo.nativeName = "Dansk";
                return true;
            case 17:
            case j.H0:
                languagePackInfo.name = "German";
                languagePackInfo.nativeName = "Deutsch";
                return true;
            case 18:
            case j.I0:
                languagePackInfo.name = "Greek";
                languagePackInfo.nativeName = "Ελληνικά";
                return true;
            case 19:
                languagePackInfo.name = "English";
                languagePackInfo.nativeName = "English";
                return true;
            case 20:
            case j.M0:
                languagePackInfo.name = "Spanish";
                languagePackInfo.nativeName = "Español";
                return true;
            case 21:
            case j.N0:
                languagePackInfo.name = "Estonian";
                languagePackInfo.nativeName = "Eesti";
                return true;
            case 22:
            case j.O0:
                languagePackInfo.name = "Basque";
                languagePackInfo.nativeName = "Euskara";
                return true;
            case 23:
            case j.P0:
                languagePackInfo.name = "Persian";
                languagePackInfo.nativeName = "فارسی";
                return true;
            case j.K3:
            case '}':
                languagePackInfo.name = "Fula";
                languagePackInfo.nativeName = "Fula";
                return true;
            case 25:
            case '~':
                languagePackInfo.name = "Finnish";
                languagePackInfo.nativeName = "Suomi";
                return true;
            case 26:
            case 127:
                languagePackInfo.name = "Faroese";
                languagePackInfo.nativeName = "Føroyskt";
                return true;
            case 27:
                languagePackInfo.name = "French";
                languagePackInfo.nativeName = "Français";
                return true;
            case 28:
            case 130:
                languagePackInfo.name = "Frisian";
                languagePackInfo.nativeName = "Frysk";
                return true;
            case j.P3:
            case 131:
                languagePackInfo.name = "Irish";
                languagePackInfo.nativeName = "Gaeilge";
                return true;
            case 30:
            case 132:
                languagePackInfo.name = "Galician";
                languagePackInfo.nativeName = "Galego";
                return true;
            case 31:
            case 133:
                languagePackInfo.name = "Guarani";
                languagePackInfo.nativeName = "Guarani";
                return true;
            case Log.TAG_IMAGE_LOADER:
            case 134:
                languagePackInfo.name = "Gujarati";
                languagePackInfo.nativeName = "ગુજરાતી";
                return true;
            case '!':
            case 135:
                languagePackInfo.name = "Hausa";
                languagePackInfo.nativeName = "Hausa";
                return true;
            case '\"':
            case 136:
                languagePackInfo.name = "Hebrew";
                languagePackInfo.nativeName = "עברית";
                return true;
            case '#':
            case 137:
                languagePackInfo.name = "Hindi";
                languagePackInfo.nativeName = "हिन्दी";
                return true;
            case '$':
            case 138:
                languagePackInfo.name = "Croatian";
                languagePackInfo.nativeName = "Hrvatski";
                return true;
            case '%':
            case 139:
                languagePackInfo.name = "Haitian Creole";
                languagePackInfo.nativeName = "Kreyòl Ayisyen";
                return true;
            case '&':
            case 140:
                languagePackInfo.name = "Hungarian";
                languagePackInfo.nativeName = "Magyar";
                return true;
            case '\'':
            case 141:
                languagePackInfo.name = "Armenian";
                languagePackInfo.nativeName = "Հայերեն";
                return true;
            case '(':
            case 142:
                languagePackInfo.name = "Indonesian";
                languagePackInfo.nativeName = "Bahasa Indonesia";
                return true;
            case ')':
            case 143:
                languagePackInfo.name = "Icelandic";
                languagePackInfo.nativeName = "Íslenska";
                return true;
            case '*':
            case 144:
                languagePackInfo.name = "Italian";
                languagePackInfo.nativeName = "Italiano";
                return true;
            case '+':
            case 145:
                languagePackInfo.name = "Japanese";
                languagePackInfo.nativeName = "日本語";
                return true;
            case ',':
            case 147:
                languagePackInfo.name = "Javanese";
                languagePackInfo.nativeName = "Basa Jawa";
                return true;
            case '-':
            case 148:
                languagePackInfo.name = "Georgian";
                languagePackInfo.nativeName = "ქართული";
                return true;
            case '.':
            case 149:
                languagePackInfo.name = "Kazakh";
                languagePackInfo.nativeName = "Қазақша";
                return true;
            case '/':
            case 150:
                languagePackInfo.name = "Khmer";
                languagePackInfo.nativeName = "ភាសាខ្មែរ";
                return true;
            case '0':
            case 151:
                languagePackInfo.name = "Kannada";
                languagePackInfo.nativeName = "ಕನ್ನಡ";
                return true;
            case '1':
            case 152:
                languagePackInfo.name = "Korean";
                languagePackInfo.nativeName = "한국어";
                return true;
            case '2':
            case 153:
                languagePackInfo.name = "Kurdish (Kurmanji)";
                languagePackInfo.nativeName = "Kurdî (Kurmancî)";
                return true;
            case '3':
            case 154:
                languagePackInfo.name = "Kyrgyz";
                languagePackInfo.nativeName = "кыргызча";
                return true;
            case '4':
            case 155:
                languagePackInfo.name = "Lao";
                languagePackInfo.nativeName = "ພາສາລາວ";
                return true;
            case '5':
            case 156:
                languagePackInfo.name = "Lithuanian";
                languagePackInfo.nativeName = "Lietuvių";
                return true;
            case '6':
            case 157:
                languagePackInfo.name = "Latvian";
                languagePackInfo.nativeName = "Latviešu";
                return true;
            case '7':
            case 158:
                languagePackInfo.name = "Malagasy";
                languagePackInfo.nativeName = "Malagasy";
                return true;
            case '8':
            case 159:
                languagePackInfo.name = "Macedonian";
                languagePackInfo.nativeName = "Македонски";
                return true;
            case '9':
            case 160:
                languagePackInfo.name = "Malayalam";
                languagePackInfo.nativeName = "മലയാളം";
                return true;
            case ':':
            case 161:
                languagePackInfo.name = "Mongolian";
                languagePackInfo.nativeName = "Монгол";
                return true;
            case ';':
            case 162:
                languagePackInfo.name = "Marathi";
                languagePackInfo.nativeName = "मराठी";
                return true;
            case '<':
            case 163:
                languagePackInfo.name = "Malay";
                languagePackInfo.nativeName = "Bahasa Melayu";
                return true;
            case '=':
            case 164:
                languagePackInfo.name = "Maltese";
                languagePackInfo.nativeName = "Malti";
                return true;
            case '>':
            case 165:
                languagePackInfo.name = "Burmese";
                languagePackInfo.nativeName = "မြန်မာဘာသာ";
                return true;
            case '?':
            case 166:
                languagePackInfo.name = "Norwegian (bokmal)";
                languagePackInfo.nativeName = "Norsk (bokmål)";
                return true;
            case Log.TAG_SPEED_TEXT:
            case 167:
                languagePackInfo.name = "Nepali";
                languagePackInfo.nativeName = "नेपाली";
                return true;
            case 'A':
            case 169:
                languagePackInfo.name = "Dutch";
                languagePackInfo.nativeName = "Nederlands";
                return true;
            case 'B':
            case 170:
                languagePackInfo.name = "Norwegian (nynorsk)";
                languagePackInfo.nativeName = "Norsk (nynorsk)";
                return true;
            case 'C':
            case 171:
                languagePackInfo.name = "Oriya";
                languagePackInfo.nativeName = "ଓଡ଼ିଆ";
                return true;
            case 'D':
            case 172:
                languagePackInfo.name = "Punjabi";
                languagePackInfo.nativeName = "ਪੰਜਾਬੀ";
                return true;
            case 'E':
            case 173:
                languagePackInfo.name = "Polish";
                languagePackInfo.nativeName = "Polski";
                return true;
            case 'F':
            case 174:
                languagePackInfo.name = "Pashto";
                languagePackInfo.nativeName = "پښتو";
                return true;
            case 'G':
                languagePackInfo.name = "Portuguese";
                languagePackInfo.nativeName = "Português";
                return true;
            case XtraBox.MP4_XTRA_BT_GUID:
            case 177:
                languagePackInfo.name = "Romanian";
                languagePackInfo.nativeName = "Română";
                return true;
            case 'I':
            case 178:
                languagePackInfo.name = "Russian";
                languagePackInfo.nativeName = "Русский";
                return true;
            case 'J':
            case 179:
                languagePackInfo.name = "Kinyarwanda";
                languagePackInfo.nativeName = "Ikinyarwanda";
                return true;
            case 'K':
            case 180:
                languagePackInfo.name = "Sardinian";
                languagePackInfo.nativeName = "Sardu";
                return true;
            case 'L':
            case 181:
                languagePackInfo.name = "Sinhala";
                languagePackInfo.nativeName = "සිංහල";
                return true;
            case 'M':
            case 182:
                languagePackInfo.name = "Slovak";
                languagePackInfo.nativeName = "Slovenčina";
                return true;
            case 'N':
            case 183:
                languagePackInfo.name = "Slovenian";
                languagePackInfo.nativeName = "Slovenščina";
                return true;
            case 'O':
            case 184:
                languagePackInfo.name = "Shona";
                languagePackInfo.nativeName = "Shona";
                return true;
            case 'P':
            case 185:
                languagePackInfo.name = "Somali";
                languagePackInfo.nativeName = "Af-Soomaali";
                return true;
            case 'Q':
            case 186:
                languagePackInfo.name = "Albanian";
                languagePackInfo.nativeName = "Shqip";
                return true;
            case 'R':
            case 187:
                languagePackInfo.name = "Serbian";
                languagePackInfo.nativeName = "Српски";
                return true;
            case 'S':
            case 188:
                languagePackInfo.name = "Swedish";
                languagePackInfo.nativeName = "Svenska";
                return true;
            case j.E0:
            case 189:
                languagePackInfo.name = "Swahili";
                languagePackInfo.nativeName = "Kiswahili";
                return true;
            case 'U':
            case 190:
                languagePackInfo.name = "Silesian";
                languagePackInfo.nativeName = "ślōnskŏ gŏdka";
                return true;
            case 'V':
            case 191:
                languagePackInfo.name = "Tamil";
                languagePackInfo.nativeName = "தமிழ்";
                return true;
            case 'W':
            case 192:
                languagePackInfo.name = "Telugu";
                languagePackInfo.nativeName = "తెలుగు";
                return true;
            case 'X':
            case 193:
                languagePackInfo.name = "Tajik";
                languagePackInfo.nativeName = "Тоҷикӣ";
                return true;
            case 'Y':
            case 194:
                languagePackInfo.name = "Thai";
                languagePackInfo.nativeName = "ภาษาไทย";
                return true;
            case 'Z':
            case 195:
                languagePackInfo.name = "Filipino";
                languagePackInfo.nativeName = "Filipino";
                return true;
            case '[':
            case 196:
                languagePackInfo.name = "Turkish";
                languagePackInfo.nativeName = "Türkçe";
                return true;
            case '\\':
            case 197:
                languagePackInfo.name = "Tamazight";
                languagePackInfo.nativeName = "ⵜⴰⵎⴰⵣⵉⵖⵜ";
                return true;
            case ']':
            case 198:
                languagePackInfo.name = "Ukrainian";
                languagePackInfo.nativeName = "Українська";
                return true;
            case '^':
            case 199:
                languagePackInfo.name = "Urdu";
                languagePackInfo.nativeName = "اردو";
                return true;
            case '_':
            case 200:
                languagePackInfo.name = "Uzbek";
                languagePackInfo.nativeName = "O'zbek";
                return true;
            case '`':
            case 201:
                languagePackInfo.name = "Vietnamese";
                languagePackInfo.nativeName = "Tiếng Việt";
                return true;
            case 'a':
                languagePackInfo.name = "Simplified Chinese";
                languagePackInfo.nativeName = "中文";
                return true;
            case 'b':
            case 205:
                languagePackInfo.name = "Zaza";
                languagePackInfo.nativeName = "Zaza";
                return true;
            case j.J0:
                languagePackInfo.name = "English (UK)";
                languagePackInfo.nativeName = "English (UK)";
                return true;
            case j.K0:
                languagePackInfo.name = "English (US)";
                languagePackInfo.nativeName = "English (US)";
                return true;
            case j.L0:
                languagePackInfo.name = "Spanish (Spain)";
                languagePackInfo.nativeName = "Español (España)";
                return true;
            case Log.TAG_YOUTUBE:
                languagePackInfo.name = "French (Canada)";
                languagePackInfo.nativeName = "Français (Canada)";
                return true;
            case 129:
                languagePackInfo.name = "French (France)";
                languagePackInfo.nativeName = "Français (France)";
                return true;
            case 146:
                languagePackInfo.name = "Japanese (Kansai)";
                languagePackInfo.nativeName = "日本語(関西)";
                return true;
            case 168:
                languagePackInfo.name = "Dutch (België)";
                languagePackInfo.nativeName = "Nederlands (België)";
                return true;
            case 175:
                languagePackInfo.name = "Portuguese (Brazil)";
                languagePackInfo.nativeName = "Português (Brasil)";
                return true;
            case 176:
                languagePackInfo.name = "Portuguese (Portugal)";
                languagePackInfo.nativeName = "Português (Portugal)";
                return true;
            case 202:
                languagePackInfo.name = "Simplified Chinese (China)";
                languagePackInfo.nativeName = "中文(简体)";
                return true;
            case 203:
                languagePackInfo.name = "Traditional Chinese (Hong Kong)";
                languagePackInfo.nativeName = "中文(香港)";
                return true;
            case 204:
                languagePackInfo.name = "Traditional Chinese (Taiwan)";
                languagePackInfo.nativeName = "中文(台灣)";
                return true;
            default:
                return false;
        }
    }

    public static String N0(int i10) {
        if (i10 == 1) {
            return i1(R.string.CategoryPrivate);
        }
        if (i10 == 2) {
            return i1(R.string.CategoryGroup);
        }
        if (i10 == 3) {
            return i1(R.string.CategoryChannels);
        }
        if (i10 == 4) {
            return i1(R.string.CategorySecret);
        }
        throw new IllegalArgumentException("category == " + i10);
    }

    public static boolean N1() {
        return t2() == 25971;
    }

    public static String N2(float f10) {
        return M2(f10, R.string.location_personNearby, R.string.location_personAwayMeters, R.string.location_personAwayKilometers);
    }

    public static String O(String str) {
        if (!N1()) {
            return str;
        }
        String replace = str.replace('.', ' ');
        int length = replace.length();
        int i10 = 0;
        int i11 = 0;
        int i12 = -1;
        for (int i13 = 0; i13 < length; i13++) {
            char charAt = replace.charAt(i13);
            if (!i.l(charAt)) {
                if (charAt != ' ' || (i11 = i11 + 1) > 1) {
                    break;
                }
                i12 = i13;
            } else {
                i10++;
            }
        }
        if (!(i10 == 4 && i11 == 1 && i12 != -1)) {
            return replace;
        }
        return replace.substring(0, i12) + replace.substring(i12 + 1);
    }

    public static CharSequence O0(long j10, String str, int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        CharSequence charSequence;
        CharSequence k02;
        if (z13 && z14) {
            k02 = k0(R.string.format_notificationTitlePinned, str);
        } else if (i10 > 1 || z13) {
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[1] = o2(z13 ? R.string.mentionCount : R.string.messagesCount, i10);
            k02 = k0(R.string.format_notificationTitleShort, objArr);
        } else if (i.i(str)) {
            k02 = ob.a.o(j10);
        } else {
            charSequence = str;
            return g1(charSequence, true, z10, z11, z12, z15, z16);
        }
        charSequence = k02;
        return g1(charSequence, true, z10, z11, z12, z15, z16);
    }

    public static boolean O1(char c10) {
        return (c10 >= 'a' && c10 <= 'z') || (c10 >= 'A' && c10 <= 'Z');
    }

    public static String O2(long j10, int i10, String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return DateFormat.getDateInstance(Y2(i10, true), C()).format(ib.f.b(j10));
            } catch (Throwable unused) {
            }
        }
        try {
            return java.text.DateFormat.getDateInstance(Y2(i10, false), C()).format(ib.f.b(j10));
        } catch (Throwable unused2) {
            return B(str, j10);
        }
    }

    public static String P(int i10, int... iArr) {
        if (iArr == null || iArr.length == 0) {
            return i1(i10);
        }
        Object[] objArr = new Object[iArr.length];
        int i11 = 0;
        for (int i12 : iArr) {
            i11++;
            objArr[i11] = A(i10, i12);
        }
        return j1(i10, objArr);
    }

    public static String P0() {
        return i1(R.string.OK);
    }

    public static boolean P1() {
        return !k2().startsWith("X");
    }

    public static String P2(long j10, int i10, int i11, String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return DateFormat.getDateTimeInstance(Y2(i10, true), Y2(i11, true), C()).format(ib.f.b(j10));
            } catch (Throwable unused) {
            }
        }
        try {
            return java.text.DateFormat.getDateTimeInstance(Y2(i10, false), Y2(i11, false), C()).format(ib.f.b(j10));
        } catch (Throwable unused2) {
            return B(str, j10);
        }
    }

    public static String Q(double d10) {
        Locale C = he.i.c2().a0() ? Locale.US : C();
        synchronized (w.class) {
            if (Build.VERSION.SDK_INT >= 24) {
                DecimalFormat decimalFormat = (DecimalFormat) f12342c;
                if (decimalFormat == null || f12343d != C) {
                    f12343d = C;
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(C);
                    if (N1()) {
                        decimalFormatSymbols.setDecimalSeparator(',');
                        decimalFormatSymbols.setGroupingSeparator(' ');
                    }
                    if (decimalFormat != null) {
                        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
                    } else {
                        decimalFormat = new DecimalFormat("###,###.00", decimalFormatSymbols);
                        f12342c = decimalFormat;
                    }
                }
                return decimalFormat.format(d10);
            }
            java.text.DecimalFormat decimalFormat2 = (java.text.DecimalFormat) f12342c;
            if (decimalFormat2 == null || f12343d != C) {
                f12343d = C;
                java.text.DecimalFormatSymbols decimalFormatSymbols2 = new java.text.DecimalFormatSymbols(C);
                if (N1()) {
                    decimalFormatSymbols2.setDecimalSeparator(',');
                    decimalFormatSymbols2.setGroupingSeparator(' ');
                }
                if (decimalFormat2 != null) {
                    decimalFormat2.setDecimalFormatSymbols(decimalFormatSymbols2);
                } else {
                    decimalFormat2 = new java.text.DecimalFormat("###,###.00", decimalFormatSymbols2);
                    f12342c = decimalFormat2;
                }
            }
            return decimalFormat2.format(d10);
        }
    }

    public static String Q0(o6 o6Var, TdApi.MessageSender messageSender, TdApi.Message message, boolean z10) {
        String Cb = messageSender != null ? o6Var.Cb(messageSender) : null;
        if (message != null) {
            String j22 = t2.j2(message);
            if (!z10) {
                if (i.i(j22)) {
                    j22 = Z1(t2.C(o6Var, message, true));
                }
                return j1(R.string.format_pinned, j22);
            } else if (Cb == null) {
                if (i.i(j22)) {
                    j22 = Z1(t2.C(o6Var, message, true));
                }
                return j1(R.string.NewPinnedMessage, j22);
            } else if (!i.i(j22)) {
                return j1(R.string.ActionPinnedText, Cb, j22);
            } else {
                int i10 = R.string.ActionPinnedNoText;
                switch (message.content.getConstructor()) {
                    case TdApi.MessageVenue.CONSTRUCTOR:
                        i10 = R.string.ActionPinnedGeo;
                        break;
                    case TdApi.MessagePhoto.CONSTRUCTOR:
                    case TdApi.MessageExpiredPhoto.CONSTRUCTOR:
                        i10 = R.string.ActionPinnedPhoto;
                        break;
                    case TdApi.MessageExpiredVideo.CONSTRUCTOR:
                    case TdApi.MessageVideo.CONSTRUCTOR:
                        i10 = R.string.ActionPinnedVideo;
                        break;
                    case TdApi.MessagePoll.CONSTRUCTOR:
                        if (((TdApi.MessagePoll) message.content).poll.type.getConstructor() != 657013913) {
                            i10 = R.string.ActionPinnedPoll;
                            break;
                        } else {
                            i10 = R.string.ActionPinnedQuiz;
                            break;
                        }
                    case TdApi.MessageContact.CONSTRUCTOR:
                        i10 = R.string.ActionPinnedContact;
                        break;
                    case TdApi.MessageGame.CONSTRUCTOR:
                        String w12 = t2.w1(((TdApi.MessageGame) message.content).game, true);
                        if (i.i(w12)) {
                            i10 = R.string.ActionPinnedGameNoName;
                            break;
                        } else {
                            return j1(R.string.ActionPinnedGame, Cb, w12);
                        }
                    case TdApi.MessageAudio.CONSTRUCTOR:
                        i10 = R.string.ActionPinnedMusic;
                        break;
                    case TdApi.MessageLocation.CONSTRUCTOR:
                        if (((TdApi.MessageLocation) message.content).livePeriod > 0) {
                            i10 = R.string.ActionPinnedGeoLive;
                            break;
                        }
                        i10 = R.string.ActionPinnedGeo;
                        break;
                    case TdApi.MessageVoiceNote.CONSTRUCTOR:
                        i10 = R.string.ActionPinnedVoice;
                        break;
                    case TdApi.MessageDocument.CONSTRUCTOR:
                        i10 = R.string.ActionPinnedFile;
                        break;
                    case TdApi.MessageVideoNote.CONSTRUCTOR:
                        i10 = R.string.ActionPinnedRound;
                        break;
                    case TdApi.MessageAnimation.CONSTRUCTOR:
                        i10 = R.string.ActionPinnedGif;
                        break;
                    case TdApi.MessageSticker.CONSTRUCTOR:
                        i10 = R.string.ActionPinnedSticker;
                        break;
                }
                String i12 = i1(i10);
                int indexOf = i12.indexOf("**");
                int indexOf2 = indexOf != -1 ? i12.indexOf("**", indexOf + 2) : -1;
                if (indexOf == -1 || indexOf2 == -1) {
                    return j1(i10, Cb);
                }
                String substring = i12.substring(indexOf + 2, indexOf2);
                return T(i12.substring(0, indexOf) + "%2$s" + i12.substring(indexOf2 + 2), null, Cb, substring).toString();
            }
        } else if (Cb != null) {
            return j1(R.string.NotificationActionPinnedNoTextChannel, Cb);
        } else {
            return i1(R.string.PinnedMessageChanged);
        }
    }

    public static boolean Q1(char c10) {
        return c10 == 'y' || c10 == 'Y';
    }

    public static String Q2(long j10, int i10, String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return B(l2(((SimpleDateFormat) DateFormat.getDateInstance(Y2(i10, true), C())).toPattern()), j10);
            } catch (Throwable unused) {
            }
        }
        try {
            return B(l2(((java.text.SimpleDateFormat) java.text.DateFormat.getDateInstance(Y2(i10, false), C())).toPattern()), j10);
        } catch (Throwable unused2) {
            return B(str, j10);
        }
    }

    public static String R(double d10) {
        if (d10 % 1.0d == 0.0d) {
            return S((long) d10);
        }
        return Q(d10);
    }

    public static String R0(TdApi.LanguagePackStringValuePluralized languagePackStringValuePluralized, int i10) {
        if (i10 == 0) {
            return languagePackStringValuePluralized.zeroValue;
        }
        if (i10 == 1) {
            return languagePackStringValuePluralized.oneValue;
        }
        if (i10 == 2) {
            return languagePackStringValuePluralized.twoValue;
        }
        if (i10 == 3) {
            return languagePackStringValuePluralized.fewValue;
        }
        if (i10 == 4) {
            return languagePackStringValuePluralized.manyValue;
        }
        if (i10 == 5) {
            return languagePackStringValuePluralized.otherValue;
        }
        throw new UnsupportedOperationException("form == " + i10);
    }

    public static f R1() {
        return t.f12336a;
    }

    public static String R2(long j10, int i10, String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return B(m2(((SimpleDateFormat) DateFormat.getDateInstance(Y2(i10, true), C())).toPattern()), j10);
            } catch (Throwable unused) {
            }
        }
        try {
            return B(m2(((java.text.SimpleDateFormat) java.text.DateFormat.getDateInstance(Y2(i10, false), C())).toPattern()), j10);
        } catch (Throwable unused2) {
            return B(str, j10);
        }
    }

    public static String S(long j10) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return O(NumberFormat.getInstance(C()).format(j10));
            } catch (Throwable unused) {
            }
        }
        return O(java.text.NumberFormat.getInstance(C()).format(j10));
    }

    public static e S0(int i10) {
        switch (i10) {
            case 24934:
            case 25191:
            case 25198:
            case 25441:
            case 25697:
            case 25701:
            case 25718:
            case 25957:
            case 25964:
            case 25966:
            case 25967:
            case 25971:
            case 25972:
            case 25973:
            case 26217:
            case 26223:
            case 26233:
            case 26476:
            case 26485:
            case 26721:
            case 26995:
            case 26996:
            case 27499:
            case 27500:
            case 27507:
            case 27509:
            case 27513:
            case 27746:
            case 27751:
            case 28012:
            case 28014:
            case 28018:
            case 28258:
            case 28260:
            case 28261:
            case 28268:
            case 28270:
            case 28271:
            case 28274:
            case 28281:
            case 28525:
            case 28530:
            case 28531:
            case 28769:
            case 28787:
            case 28788:
            case 29293:
            case 29550:
            case 29551:
            case 29553:
            case 29555:
            case 29556:
            case 29558:
            case 29559:
            case 29793:
            case 29797:
            case 29803:
            case 29806:
            case 29811:
            case 30066:
            case 30309:
            case 30319:
            case 30824:
            case 31349:
            case 6386529:
            case 6386548:
            case 6448493:
            case 6448506:
            case 6451832:
            case 6514535:
            case 6514802:
            case 6515554:
            case 6714738:
            case 6779767:
            case 6840695:
            case 6973295:
            case 6974819:
            case 7037290:
            case 7037799:
            case 7039850:
            case 7041890:
            case 7168371:
            case 7169903:
            case 7233896:
            case 7237224:
            case 7240046:
            case 7364976:
            case 7499622:
            case 7501675:
            case 7561585:
            case 7562600:
            case 7566201:
            case 7567730:
            case 7628143:
            case 7629159:
            case 7763310:
            case 7823717:
            case 7892839:
                return new e(i10).a(1, 1).a(5, 0, 10, 100, 1000);
            case 24939:
            case 24941:
            case 25192:
            case 26729:
            case 27758:
            case 28007:
            case 29801:
            case 29804:
            case 30561:
            case 6711660:
            case 6780279:
            case 7238511:
                return new e(i10).a(1, 0, 1).a(5, 2, 100, 1000);
            case 24946:
                return new e(i10).a(0, 0).a(1, 1).a(2, 2).a(3, 3, 103, 1003).a(4, 11, 111, 1011).a(5, 100, 202, 1000);
            case 25189:
            case 25203:
            case 26738:
            case 29301:
            case 29544:
            case 29554:
            case 30059:
                return new e(i10).a(1, 1, 21, 101, 1001).a(3, 2, 22, 102, 1002).a(4, 0, 5, 100, 1000).a(5, new int[0]);
            case 25202:
                return new e(i10).a(4, 1000000).a(1, 1, 21, 101, 1001).a(2, 2, 22, 102, 1002).a(3, 3, 24, 103, 1003).a(5, 0, 10, 100, 1000);
            case 25459:
            case 29547:
                return new e(i10).a(1, 1).a(3, 2, 3, 4).a(5, 0, 10, 100);
            case 25465:
                return new e(i10).a(2, 2).a(3, 3).a(0, 0).a(1, 1).a(4, 6).a(5, 10);
            case 26214:
            case 26226:
            case 7037282:
                return new e(i10).a(1, 0, 1).a(5, 2, 17, 100, 1000);
            case 26465:
                return new e(i10).a(1, 1).a(2, 2).a(3, 3, 6).a(4, 7, 10).a(5, 0, 11, 100, 1000);
            case 26468:
                return new e(i10).a(1, 1, 11).a(2, 2, 12).a(3, 3, 13, 19).a(5, 0, 24, 100, 1000);
            case 26486:
                return new e(i10).a(1, 1, 11, 101, 1001).a(5, 5, 55, 155);
            case 26725:
                return new e(i10).a(2, 2).a(1, 1).a(4, 20, 100, 1000).a(5, 0, 17, 10001);
            case 26997:
            case 27511:
            case 29541:
            case 7233905:
            case 7564641:
            case 7564649:
            case 7564650:
            case 7564654:
            case 7564659:
                return new e(i10).a(1, 1).a(2, 2).a(5, 0, 3, 100, 1000);
            case 27764:
                return new e(i10).a(1, 1, 21, 101, 1001).a(3, 2, 22, 102, 1002).a(5, 0, 10, 100, 1000);
            case 27766:
                return new e(i10).a(0, 0, 20, 100, 1000).a(1, 1, 21, 101, 1001).a(5, 2, 22, 102, 1002);
            case 28011:
                return new e(i10).a(1, 1, 21, 31).a(5, 11, 105, 1008);
            case 28015:
            case 29295:
                return new e(i10).a(1, 1).a(3, 0, 2, 16).a(5, 20, 100, 1000);
            case 28020:
                return new e(i10).a(1, 1).a(3, 0, 10, 102, 1002).a(4, 11, 111, 1011).a(5, 20, 100, 1000);
            case 28780:
                return new e(i10).a(1, 1).a(3, 2, 102, 1002).a(4, 0, 5, 100, 1000).a(5, new int[0]);
            case 29548:
                return new e(i10).a(1, 1, 101, 1001).a(2, 2, 102, 1002).a(3, 3, 103, 1003).a(5, 0, 5, 100, 1000);
            case 7041896:
                return new e(i10).a(0, 0).a(1, 1).a(5, 10, 100);
            case 7102823:
                return new e(i10).a(0, 0).a(1, 1).a(5, 2, 17, 100, 1000);
            case 7563369:
                return new e(i10).a(3, 2, 10).a(1, 0, 1).a(5, 11, 100);
            case 7633517:
                return new e(i10).a(1, 0, 1, 11).a(5, 2, 24, 100);
            default:
                return new e(i10).a(5, 1, 5, 100);
        }
    }

    public static String S2(long j10, int i10, String str) {
        try {
            String language = C().getLanguage();
            if (language.equals(Locale.getDefault().getLanguage())) {
                return DateUtils.formatDateRange(j0.n(), new Formatter(new StringBuilder(50), C()), j10, j10, 1).toString();
            } else if (language.equals("en")) {
                return B(str, j10);
            } else {
                if (Build.VERSION.SDK_INT >= 24) {
                    try {
                        return DateFormat.getTimeInstance(Y2(i10, true), C()).format(ib.f.b(j10));
                    } catch (Throwable unused) {
                    }
                }
                return java.text.DateFormat.getTimeInstance(Y2(i10, false), C()).format(ib.f.b(j10));
            }
        } catch (Throwable unused2) {
            return B(str, j10);
        }
    }

    public static CharSequence T(String str, f fVar, Object... objArr) {
        return U(str, J1(objArr), fVar, objArr);
    }

    public static CharSequence T0(TdApi.ChatSourcePublicServiceAnnouncement chatSourcePublicServiceAnnouncement, String str) {
        return w1(R.string.PsaHideConfirm, chatSourcePublicServiceAnnouncement.type, str);
    }

    public static String T2(long j10, TimeUnit timeUnit) {
        return S2(timeUnit.toMillis(j10), 3, j0.X() ? "h:mm a" : "H:mm");
    }

    public static CharSequence U(String str, boolean z10, f fVar, Object... objArr) {
        Object obj;
        int i10;
        int i11;
        int i12;
        String str2;
        int i13;
        if (fVar == null && !z10) {
            return String.format(Y1(), str, objArr);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int g10 = i.g(spannableStringBuilder, "%", i14);
            if (g10 == -1) {
                return i16 > 0 ? spannableStringBuilder : spannableStringBuilder.toString();
            }
            int length = spannableStringBuilder.length();
            int i17 = g10 + 1;
            if (i17 != length) {
                char charAt = spannableStringBuilder.charAt(i17);
                if (charAt != '%') {
                    if (charAt == 'd' || charAt == 'f' || charAt == 's') {
                        i10 = i15 + 1;
                        Object obj2 = objArr[i15];
                        l(charAt, obj2);
                        String valueOf = String.valueOf(obj2);
                        spannableStringBuilder.replace(g10, g10 + 2, (CharSequence) valueOf);
                        i11 = valueOf.length() + g10;
                        i12 = i15;
                        str2 = valueOf;
                        obj = obj2;
                    } else {
                        int i18 = i17;
                        int i19 = 0;
                        while (true) {
                            if (i18 >= length) {
                                break;
                            }
                            int i20 = i18 + 1;
                            char charAt2 = spannableStringBuilder.charAt(i18);
                            if (!i.l(charAt2)) {
                                i18 = i20;
                                charAt = charAt2;
                                break;
                            }
                            i19++;
                            i18 = i20;
                            charAt = charAt2;
                        }
                        if (i19 == 0) {
                            throw new IllegalArgumentException();
                        } else if (charAt != '$') {
                            throw new IllegalArgumentException();
                        } else if (i18 != length) {
                            int i21 = i18 + 1;
                            char charAt3 = spannableStringBuilder.charAt(i18);
                            int i22 = i19 + i17;
                            int parseInt = Integer.parseInt(spannableStringBuilder.subSequence(i17, i22).toString()) - 1;
                            Object obj3 = objArr[parseInt];
                            String valueOf2 = String.valueOf(obj3);
                            if (charAt3 == '0') {
                                int i23 = i21;
                                int i24 = 0;
                                while (i23 < length) {
                                    i23++;
                                    charAt3 = spannableStringBuilder.charAt(i23);
                                    if (!i.l(charAt3)) {
                                        break;
                                    }
                                    i24++;
                                }
                                if (i24 != 0) {
                                    l(charAt3, obj3);
                                    int parseInt2 = Integer.parseInt(spannableStringBuilder.subSequence(i21, i21 + i24).toString());
                                    int length2 = parseInt2 - valueOf2.length();
                                    if (length2 > 0) {
                                        StringBuilder sb2 = new StringBuilder(parseInt2);
                                        do {
                                            sb2.append('0');
                                            length2--;
                                        } while (length2 > 0);
                                        sb2.append(valueOf2);
                                        valueOf2 = sb2.toString();
                                    }
                                    i13 = 1 + i24 + 1;
                                    str2 = valueOf2;
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else if (charAt3 == 'd' || charAt3 == 'f' || charAt3 == 's') {
                                l(charAt3, obj3);
                                str2 = valueOf2;
                                i13 = 1;
                            } else {
                                throw new IllegalArgumentException();
                            }
                            spannableStringBuilder.replace(g10, i22 + 1 + i13, (CharSequence) str2);
                            i11 = str2.length() + g10;
                            i10 = i15;
                            i12 = parseInt;
                            obj = obj3;
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                    if (fVar != null) {
                        int length3 = g10 + str2.length();
                        Object a10 = fVar.a(spannableStringBuilder, g10, length3, i12, g.M0(str2));
                        if (a10 != null) {
                            spannableStringBuilder.setSpan(a10, g10, length3, 33);
                            i16++;
                            i14 = i11;
                            i15 = i10;
                        }
                    }
                    if (obj instanceof Spanned) {
                        Spanned spanned = (Spanned) obj;
                        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
                        if (spans != null && spans.length > 0) {
                            for (Object obj4 : spans) {
                                spannableStringBuilder.setSpan(obj4, spanned.getSpanStart(obj4) + g10, spanned.getSpanEnd(obj4) + g10, 33);
                                i16++;
                            }
                        }
                    }
                    i14 = i11;
                    i15 = i10;
                } else {
                    spannableStringBuilder.delete(g10, i17);
                    i14 = i17;
                }
            } else {
                throw new IllegalArgumentException("Invalid specifier format: %");
            }
        }
    }

    public static CharSequence U0(d9 d9Var, String str, boolean z10) {
        return c0.l(d9Var, w1(z10 ? R.string.PsaChatInfo : R.string.PsaInfo, str, new Object[0]).toString(), null);
    }

    public static String U2(Calendar calendar) {
        return T2(calendar.getTimeInMillis(), TimeUnit.MILLISECONDS);
    }

    public static String V(int i10) {
        return j0.n().getResources().getString(i10);
    }

    public static CharSequence V0(d9 d9Var, String str) {
        return c0.l(d9Var, w1(R.string.PsaForward, str, new Object[0]).toString(), null);
    }

    public static int V1(c cVar, c cVar2) {
        int d10 = b.d(cVar.f12357a);
        int d11 = b.d(cVar2.f12357a);
        if (d10 != d11) {
            return Integer.compare(d10, d11);
        }
        return cVar.f12357a.key.compareTo(cVar2.f12357a.key);
    }

    public static String V2(long j10, TimeUnit timeUnit) {
        return W2(ib.f.a(timeUnit.toMillis(j10)));
    }

    public static String W(int i10, Object... objArr) {
        return j0.n().getResources().getString(i10, objArr);
    }

    public static String W0(TdApi.ChatSourcePublicServiceAnnouncement chatSourcePublicServiceAnnouncement) {
        return w1(R.string.PsaType, chatSourcePublicServiceAnnouncement.type, new Object[0]).toString();
    }

    public static String W2(Calendar calendar) {
        int i10 = calendar.get(6);
        int i11 = calendar.get(1);
        Calendar e10 = ib.f.e();
        if (e10.get(6) == i10 && e10.get(1) == i11) {
            return U2(calendar);
        }
        int days = (int) TimeUnit.MILLISECONDS.toDays(ib.f.f(e10) - ib.f.f(calendar));
        if (days <= 0 || days > 7) {
            return E(calendar);
        }
        return c3(calendar);
    }

    public static String X(o6 o6Var) {
        String j12 = j1(R.string.AppNameAndVersion, "0.24.8.1519-arm64-v8a");
        if (o6Var == null || !o6Var.Y6()) {
            return j12;
        }
        return j12 + " (emulator)";
    }

    public static String X0(long j10, TimeUnit timeUnit, long j11, TimeUnit timeUnit2, boolean z10, int i10, int i11, boolean z11) {
        String str;
        if (z10) {
            long seconds = timeUnit2.toSeconds(j11) - timeUnit.toSeconds(j10);
            if (seconds >= -300) {
                if (seconds < i10) {
                    return i1(y.d(i11, 0));
                }
                if (seconds < 60) {
                    return o2(y.d(i11, 1), (int) seconds);
                }
                long j12 = seconds / 60;
                if (j12 < 60) {
                    return o2(y.d(i11, 2), (int) j12);
                }
                long j13 = j12 / 60;
                if (j13 < 4) {
                    return o2(y.d(i11, 3), (int) j13);
                }
            }
        }
        Calendar a10 = ib.f.a(timeUnit2.toMillis(j11));
        int i12 = a10.get(1);
        int i13 = a10.get(2);
        ib.f.q(a10);
        long timeInMillis = a10.getTimeInMillis();
        Calendar a11 = ib.f.a(timeUnit.toMillis(j10));
        int i14 = a11.get(1);
        int i15 = a11.get(2);
        long f10 = ib.f.f(a11);
        String T2 = T2(j10, timeUnit);
        int days = (int) TimeUnit.MILLISECONDS.toDays(timeInMillis - f10);
        if (days == 0) {
            return j1(y.d(i11, 4), T2);
        }
        if (days == 1) {
            return j1(y.d(i11, 5), T2);
        }
        if (z11) {
            if (days < 14) {
                return o2(y.d(i11, 21), days);
            }
            if (days < 30) {
                return o2(y.d(i11, 22), days / 7);
            }
            int i16 = ((i12 - i14) * 12) + (i13 - i15);
            if (i16 < 12) {
                return o2(y.d(i11, 23), i16);
            }
            return o2(y.d(i11, 24), i16 / 12);
        } else if (days < 7) {
            return j1(y.d(i11, 10), c3(a11), T2);
        } else {
            if (i12 == i14) {
                str = F(a11);
            } else {
                str = H(a11);
            }
            return j1(y.d(i11, 11), str, T2);
        }
    }

    public static boolean X1(d9 d9Var, long j10, View view, o oVar) {
        d9Var.c().hd().v7(d9Var, j10, null);
        return true;
    }

    public static l0[] X2(CharSequence charSequence) {
        l0[] l0VarArr;
        if (!(charSequence instanceof Spanned) || (l0VarArr = (l0[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), l0.class)) == null || l0VarArr.length <= 0) {
            return null;
        }
        return l0VarArr;
    }

    public static TdApi.LanguagePackInfo Y() {
        String a02 = a0();
        return g2(a02, null, w(a02), b0());
    }

    public static String Y0(long j10, TimeUnit timeUnit, boolean z10) {
        int seconds = (int) timeUnit.toSeconds(j10);
        if (z10 && ib.f.h(seconds)) {
            return i1(R.string.PastWeek);
        }
        if (ib.f.o(seconds)) {
            long j11 = seconds;
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            if (ib.f.m(j11, timeUnit2)) {
                return i1(R.string.Today);
            }
            if (ib.f.p(j11, timeUnit2)) {
                return i1(R.string.Yesterday);
            }
            return b3(ib.f.a(timeUnit2.toMillis(j11)));
        } else if (z10) {
            return c2(j10, timeUnit);
        } else {
            if (ib.f.l(j10, timeUnit)) {
                return D(j10, timeUnit);
            }
            return G(j10, timeUnit);
        }
    }

    public static Locale Y1() {
        return he.i.c2().Y0().f13859c;
    }

    public static int Y2(int i10, boolean z10) {
        if (Build.VERSION.SDK_INT < 24 || !z10) {
            if (i10 == 1) {
                return 1;
            }
            if (i10 == 2) {
                return 2;
            }
            if (i10 == 3) {
                return 3;
            }
        } else if (i10 == 1) {
            return 1;
        } else {
            if (i10 == 2) {
                return 2;
            }
            if (i10 == 3) {
                return 3;
            }
        }
        throw new IllegalArgumentException("style == " + i10);
    }

    public static String Z() {
        String n10 = id.d.n(c0(R.string.language_emoji));
        return n10 != null ? n10 : "🇧";
    }

    public static String Z0(long j10, TimeUnit timeUnit) {
        return b1(j10, timeUnit, false, 0);
    }

    public static String Z1(String str) {
        return j() ? str.toLowerCase() : str;
    }

    public static void Z2(TdApi.UpdateLanguagePackStrings updateLanguagePackStrings) {
        boolean z10;
        String k22 = k2();
        boolean equals = updateLanguagePackStrings.languagePackId.equals(k22);
        if (equals || !updateLanguagePackStrings.languagePackId.equals(m())) {
            z10 = false;
        } else {
            equals = true;
            z10 = true;
        }
        if (equals) {
            Object[] objArr = new Object[1];
            TdApi.LanguagePackString[] languagePackStringArr = updateLanguagePackStrings.strings;
            objArr[0] = Integer.valueOf(languagePackStringArr != null ? languagePackStringArr.length : 0);
            Log.i("received updateLanguagePack, stringCount:%d", objArr);
            TdApi.LanguagePackString[] languagePackStringArr2 = updateLanguagePackStrings.strings;
            if (languagePackStringArr2 == null || languagePackStringArr2.length == 0 || languagePackStringArr2.length > 25) {
                J();
                return;
            }
            String str = updateLanguagePackStrings.languagePackId;
            if (!z10) {
                k22 = null;
            }
            K(str, languagePackStringArr2, k22);
        }
    }

    public static String a0() {
        return c0(R.string.language_code);
    }

    public static String a1(long j10, TimeUnit timeUnit, long j11, TimeUnit timeUnit2, boolean z10, int i10) {
        return X0(j10, timeUnit, j11, timeUnit2, z10, i10, R.string.timestamp, false);
    }

    public static int a2(String str) {
        String w10 = w(str);
        int length = w10.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            i10 = (i10 << 8) + w10.charAt(i11);
        }
        return i10;
    }

    public static void a3(boolean z10, int i10, int i11) {
        String str = (z10 ? 1 : 0) + "_" + i10 + "_" + i11;
        Set<String> set = f12344e;
        if (set == null) {
            HashSet hashSet = new HashSet();
            f12344e = hashSet;
            hashSet.add(str);
        } else if (!set.contains(str)) {
            f12344e.add(str);
        } else {
            return;
        }
        Log.e("Langpack fix required. languageCode: %s, entry: %s", Integer.toString(i10, 16), e1(i11));
    }

    public static boolean b0() {
        return C0(c0(R.string.language_rtl)) == 1;
    }

    public static String b1(long j10, TimeUnit timeUnit, boolean z10, int i10) {
        return a1(j10, timeUnit, System.currentTimeMillis(), TimeUnit.MILLISECONDS, z10, i10);
    }

    public static String b2(String str, String str2) {
        return str + "|" + str2;
    }

    public static String b3(Calendar calendar) {
        return i.E(B("cccc", calendar.getTimeInMillis()), C());
    }

    public static String c0(int i10) {
        return q1(null, i10, false);
    }

    public static String c1(long j10, TimeUnit timeUnit) {
        return X0(j10, timeUnit, System.currentTimeMillis(), TimeUnit.MILLISECONDS, false, 0, R.string.timestampShort, false);
    }

    public static String c2(long j10, TimeUnit timeUnit) {
        return i.E(Q2(timeUnit.toMillis(j10), 1, "LLLL yyyy"), C());
    }

    public static String c3(Calendar calendar) {
        return B("ccc", calendar.getTimeInMillis());
    }

    public static TdApi.LanguagePackStringValuePluralized d0(String str, List<d> list) {
        TdApi.LanguagePackStringValuePluralized languagePackStringValuePluralized = new TdApi.LanguagePackStringValuePluralized("", "", "", "", "", "");
        for (d dVar : list) {
            int i10 = dVar.f12360a;
            if (i10 == 0) {
                languagePackStringValuePluralized.zeroValue = q1(null, s1(str + "_zero"), false);
            } else if (i10 == 1) {
                languagePackStringValuePluralized.oneValue = q1(null, s1(str + "_one"), false);
            } else if (i10 == 2) {
                languagePackStringValuePluralized.twoValue = q1(null, s1(str + "_two"), false);
            } else if (i10 == 3) {
                languagePackStringValuePluralized.fewValue = q1(null, s1(str + "_few"), false);
            } else if (i10 == 4) {
                languagePackStringValuePluralized.manyValue = q1(null, s1(str + "_many"), false);
            } else if (i10 == 5) {
                languagePackStringValuePluralized.otherValue = q1(null, s1(str + "_other"), false);
            } else {
                throw new IllegalArgumentException("form == " + dVar);
            }
        }
        return languagePackStringValuePluralized;
    }

    public static int[] d1() {
        return new int[]{R.string.language_code, R.string.language_emoji, R.string.language_name, R.string.language_nameInEnglish, R.string.language_dateFormatLocale, R.string.language_continueInLanguage, R.string.language_continueInLanguagePopupText};
    }

    public static Object d2(boolean z10) {
        return t2.w5(new TdApi.TextEntityTypeBold(), null, z10);
    }

    public static CharSequence d3(CharSequence charSequence, f fVar) {
        return fVar != null ? T("%s", fVar, charSequence) : charSequence;
    }

    public static TdApi.LanguagePackStringValueOrdinary e0(String str) {
        return new TdApi.LanguagePackStringValueOrdinary(q1(null, s1(str), false));
    }

    public static String e1(int i10) {
        try {
            return j0.n().getResources().getResourceEntryName(i10);
        } catch (Throwable unused) {
            Log.e("Unable to find resource entry name (shitty modified APK?)", new Object[0]);
            return "";
        }
    }

    public static Object e2(boolean z10) {
        return t2.w5(new TdApi.TextEntityTypeCode(), null, z10);
    }

    public static TdApi.LanguagePackInfo f0() {
        String g02 = g0();
        if (i.i(g02) || g02.equals(a0())) {
            return Y();
        }
        String c02 = c0(R.string.suggested_language_code_base);
        if (i.i(c02)) {
            c02 = null;
        }
        String c03 = c0(R.string.suggested_language_code_plural);
        if (i.i(c03)) {
            c03 = w(g02);
        }
        return g2(g02, c02, c03, h0());
    }

    public static CharSequence f1(long j10, TimeUnit timeUnit, long j11, TimeUnit timeUnit2, boolean z10, int i10, int i11, boolean z11) {
        String str;
        if (z10) {
            long seconds = timeUnit.toSeconds(j10) - timeUnit2.toSeconds(j11);
            if (seconds >= -300) {
                if (seconds < i10) {
                    return m1(y.d(i11, 0), new Object[0]);
                }
                if (seconds < 60) {
                    return q2(y.d(i11, 1), (int) seconds);
                }
                long j12 = seconds / 60;
                if (j12 < 60) {
                    return q2(y.d(i11, 2), (int) j12);
                }
                long j13 = j12 / 60;
                if (j13 < 4) {
                    return q2(y.d(i11, 3), (int) j13);
                }
            }
        }
        Calendar a10 = ib.f.a(timeUnit2.toMillis(j11));
        int i12 = a10.get(1);
        int i13 = a10.get(2);
        ib.f.q(a10);
        long timeInMillis = a10.getTimeInMillis();
        Calendar a11 = ib.f.a(timeUnit.toMillis(j10));
        int i14 = a11.get(1);
        int i15 = a11.get(2);
        long f10 = ib.f.f(a11);
        String T2 = T2(j10, timeUnit);
        int days = (int) TimeUnit.MILLISECONDS.toDays(f10 - timeInMillis);
        if (days == 0) {
            return m1(y.d(i11, 4), T2);
        }
        if (days == 1) {
            return m1(y.d(i11, 6), T2);
        }
        if (z11) {
            if (days < 14) {
                return q2(y.d(i11, 21), days);
            }
            if (days < 30) {
                return q2(y.d(i11, 22), days / 7);
            }
            int i16 = ((i14 - i12) * 12) + (i15 - i13);
            if (i16 < 12) {
                return q2(y.d(i11, 23), i16);
            }
            return q2(y.d(i11, 24), i16 / 12);
        } else if (days < 7) {
            return j1(y.d(i11, 10), c3(a11), T2);
        } else {
            if (i12 == i14) {
                str = F(a11);
            } else {
                str = H(a11);
            }
            return m1(y.d(i11, 11), str, T2);
        }
    }

    public static Object f2(boolean z10) {
        return t2.w5(new TdApi.TextEntityTypeItalic(), null, z10);
    }

    public static TdApi.LanguagePackStringValueDeleted g() {
        if (f12351l == null) {
            synchronized (w.class) {
                if (f12351l == null) {
                    f12351l = new TdApi.LanguagePackStringValueDeleted();
                }
            }
        }
        return f12351l;
    }

    public static String g0() {
        String c02 = c0(R.string.suggested_language_code);
        return i.i(c02) ? a0() : c02;
    }

    public static CharSequence g1(CharSequence charSequence, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        if (z11 && z10) {
            charSequence = i1(R.string.Reminder);
        }
        if (z14 && !z11) {
            charSequence = k0(z10 ? z13 ? R.string.format_notificationScheduledChannel : z12 ? R.string.format_notificationScheduledGroup : R.string.format_notificationScheduledPrivate : R.string.format_notificationScheduledText, charSequence);
        }
        if (!z15) {
            return charSequence;
        }
        return k0(z10 ? R.string.format_notificationSilentTitle : R.string.format_notificationSilentText, charSequence);
    }

    public static TdApi.LanguagePackInfo g2(String str, String str2, String str3, boolean z10) {
        return new TdApi.LanguagePackInfo(str, str2, null, null, str3, false, z10, false, false, 0, 0, 0, null);
    }

    public static void h(a aVar) {
        if (f12349j == null) {
            synchronized (w.class) {
                if (f12349j == null) {
                    f12349j = new lb.d<>(true);
                }
            }
        }
        f12349j.add(aVar);
    }

    public static boolean h0() {
        String c02 = c0(R.string.suggested_language_rtl);
        return i.i(c02) ? b0() : C0(c02) == 1;
    }

    public static CharSequence h1(int i10, f fVar, Object... objArr) {
        return p1(null, i10, true, 0, fVar, objArr);
    }

    public static o h2(final d9 d9Var, final long j10) {
        return t2.v5(new TdApi.TextEntityTypeMentionName(j10)).q(new o.a() {
            @Override
            public final boolean a(View view, o oVar) {
                boolean X1;
                X1 = w.X1(d9.this, j10, view, oVar);
                return X1;
            }
        });
    }

    public static int i() {
        return G2() ? 11 : 9;
    }

    public static TdApi.LanguagePackStringValue i0(String str) {
        return r().get(str);
    }

    public static String i1(int i10) {
        return q1(null, i10, true);
    }

    public static String i2(String str) {
        if (str.startsWith("X")) {
            TdApi.LanguagePackStringValue M0 = ya.M0(ya.D0(), "language_code", str);
            if (M0 instanceof TdApi.LanguagePackStringValueOrdinary) {
                str = ((TdApi.LanguagePackStringValueOrdinary) M0).value;
            }
        }
        return w(str);
    }

    public static boolean j() {
        if (!f12345f) {
            v(false);
        }
        return f12346g;
    }

    public static String j0(int i10) {
        if (i10 < 60) {
            return o2(R.string.xSec, i10);
        }
        int i11 = i10 / 60;
        if (i11 >= 60) {
            return c0.h(i10);
        }
        int i12 = i10 % 60;
        return i12 == 0 ? o2(R.string.xMin, i11) : j1(R.string.format_minutesAndSeconds, o2(R.string.xMin, i11), o2(R.string.xSec, i12));
    }

    public static String j1(int i10, Object... objArr) {
        return k0(i10, objArr).toString();
    }

    public static int j2(int i10, long j10) {
        int i11;
        int i12;
        switch (i10) {
            case 24934:
            case 25191:
            case 25198:
            case 25441:
            case 25697:
            case 25701:
            case 25718:
            case 25957:
            case 25964:
            case 25966:
            case 25967:
            case 25971:
            case 25972:
            case 25973:
            case 26217:
            case 26223:
            case 26233:
            case 26476:
            case 26485:
            case 26721:
            case 26995:
            case 26996:
            case 27499:
            case 27500:
            case 27507:
            case 27509:
            case 27513:
            case 27746:
            case 27751:
            case 28012:
            case 28014:
            case 28018:
            case 28258:
            case 28260:
            case 28261:
            case 28268:
            case 28270:
            case 28271:
            case 28274:
            case 28281:
            case 28525:
            case 28530:
            case 28531:
            case 28769:
            case 28787:
            case 28788:
            case 29293:
            case 29550:
            case 29551:
            case 29553:
            case 29555:
            case 29556:
            case 29558:
            case 29559:
            case 29793:
            case 29797:
            case 29803:
            case 29806:
            case 29811:
            case 30066:
            case 30309:
            case 30319:
            case 30824:
            case 31349:
            case 6386529:
            case 6386548:
            case 6448493:
            case 6448506:
            case 6451832:
            case 6514535:
            case 6514802:
            case 6515554:
            case 6714738:
            case 6779767:
            case 6840695:
            case 6973295:
            case 6974819:
            case 7037290:
            case 7037799:
            case 7039850:
            case 7041890:
            case 7168371:
            case 7169903:
            case 7233896:
            case 7237224:
            case 7240046:
            case 7364976:
            case 7499622:
            case 7501675:
            case 7561585:
            case 7562600:
            case 7566201:
            case 7567730:
            case 7628143:
            case 7629159:
            case 7763310:
            case 7823717:
            case 7892839:
                return j10 == 1 ? 1 : 5;
            case 24939:
            case 24941:
            case 25192:
            case 26729:
            case 27758:
            case 28007:
            case 29801:
            case 29804:
            case 30561:
            case 6711660:
            case 6780279:
            case 7238511:
                return (j10 < 0 || j10 > 1) ? 5 : 1;
            case 24946:
                if (j10 == 2) {
                    return 2;
                }
                if (j10 == 1) {
                    return 1;
                }
                if (j10 == 0) {
                    return 0;
                }
                long j11 = j10 % 100;
                if (j11 < 3 || j11 > 10) {
                    return (j11 < 11 || j11 > 99) ? 5 : 4;
                }
                return 3;
            case 25189:
            case 25203:
            case 26738:
            case 29301:
            case 29544:
            case 29554:
            case 30059:
                long j12 = j10 % 10;
                if (j12 == 1 && j10 % 100 != 11) {
                    return 1;
                }
                if (j12 >= 2 && j12 <= 4) {
                    long j13 = j10 % 100;
                    if (j13 < 12 || j13 > 14) {
                        return 3;
                    }
                }
                if (j12 != 0 && (j12 < 5 || j12 > 9)) {
                    long j14 = j10 % 100;
                    if (j14 < 11 || j14 > 14) {
                        return 5;
                    }
                }
                return 4;
            case 25202:
                if (j10 != 0 && j10 % 1000000 == 0) {
                    return 4;
                }
                long j15 = j10 % 10;
                if (j15 == 1) {
                    long j16 = j10 % 100;
                    if (!(j16 == 11 || j16 == 71 || j16 == 91)) {
                        return 1;
                    }
                }
                if (j15 == 2) {
                    long j17 = j10 % 100;
                    if (!(j17 == 12 || j17 == 72 || j17 == 92)) {
                        return 2;
                    }
                }
                if ((j15 < 3 || j15 > 4) && j15 != 9) {
                    return 5;
                }
                long j18 = j10 % 100;
                if (j18 >= 10 && j18 <= 19) {
                    return 5;
                }
                if (j18 < 70 || j18 > 79) {
                    return (j18 < 90 || j18 > 99) ? 3 : 5;
                }
                return 5;
            case 25459:
            case 29547:
                if (j10 == 1) {
                    return 1;
                }
                return (j10 < 2 || j10 > 4) ? 5 : 3;
            case 25465:
                if (j10 == 2) {
                    return 2;
                }
                if (j10 == 3) {
                    return 3;
                }
                if (j10 == 0) {
                    return 0;
                }
                if (j10 == 1) {
                    return 1;
                }
                return j10 == 6 ? 4 : 5;
            case 26214:
            case 26226:
            case 7037282:
                return (j10 < 0 || j10 > 2 || i11 == 0) ? 5 : 1;
            case 26465:
                if (j10 == 2) {
                    return 2;
                }
                if (j10 == 1) {
                    return 1;
                }
                if (j10 < 3 || j10 > 6) {
                    return (j10 < 7 || j10 > 10) ? 5 : 4;
                }
                return 3;
            case 26468:
                if (j10 == 2 || j10 == 12) {
                    return 2;
                }
                if (j10 == 1 || j10 == 11) {
                    return 1;
                }
                return ((j10 < 3 || j10 > 10) && (j10 < 13 || j10 > 19)) ? 5 : 3;
            case 26486:
                long j19 = j10 % 10;
                return ((j19 < 1 || j19 > 2) && j10 % 20 != 0) ? 5 : 1;
            case 26725:
                if (j10 == 2) {
                    return 2;
                }
                if (j10 == 1) {
                    return 1;
                }
                return (j10 == 0 || j10 % 10 != 0) ? 5 : 4;
            case 26997:
            case 27511:
            case 29541:
            case 7233905:
            case 7564641:
            case 7564649:
            case 7564650:
            case 7564654:
            case 7564659:
                if (j10 == 2) {
                    return 2;
                }
                return j10 == 1 ? 1 : 5;
            case 27764:
                long j20 = j10 % 10;
                if (j20 == 1) {
                    long j21 = j10 % 100;
                    if (j21 < 11 || j21 > 19) {
                        return 1;
                    }
                }
                if (j20 < 2 || j20 > 9) {
                    return 5;
                }
                long j22 = j10 % 100;
                return (j22 < 11 || j22 > 19) ? 3 : 5;
            case 27766:
                if (j10 == 0) {
                    return 0;
                }
                return (j10 % 10 != 1 || j10 % 100 == 11) ? 5 : 1;
            case 28011:
                return (j10 % 10 != 1 || j10 == 11) ? 5 : 1;
            case 28015:
            case 29295:
                int i13 = (j10 > 1L ? 1 : (j10 == 1L ? 0 : -1));
                if (i13 == 0) {
                    return 1;
                }
                if (j10 != 0) {
                    if (i13 == 0) {
                        return 5;
                    }
                    long j23 = j10 % 100;
                    if (j23 < 1 || j23 > 19) {
                        return 5;
                    }
                }
                return 3;
            case 28020:
                if (j10 == 1) {
                    return 1;
                }
                long j24 = j10 % 100;
                if (j24 < 11 || j24 > 19) {
                    return (j10 == 0 || (j24 >= 2 && j24 <= 10)) ? 3 : 5;
                }
                return 4;
            case 28780:
                int i14 = (j10 > 1L ? 1 : (j10 == 1L ? 0 : -1));
                if (i14 == 0) {
                    return 1;
                }
                long j25 = j10 % 10;
                if (j25 >= 2 && j25 <= 4) {
                    long j26 = j10 % 100;
                    if (j26 < 12 || j26 > 14) {
                        return 3;
                    }
                }
                if ((i14 == 0 || j25 < 0 || j25 > 1) && (j25 < 5 || j25 > 9)) {
                    long j27 = j10 % 100;
                    if (j27 < 12 || j27 > 14) {
                        return 5;
                    }
                }
                return 4;
            case 29548:
                long j28 = j10 % 100;
                if (j28 == 2) {
                    return 2;
                }
                if (j28 == 1) {
                    return 1;
                }
                return (j28 < 3 || j28 > 4) ? 5 : 3;
            case 7041896:
                if (j10 == 0) {
                    return 0;
                }
                return j10 == 1 ? 1 : 5;
            case 7102823:
                int i15 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i15 == 0) {
                    return 0;
                }
                return (i15 < 0 || j10 > 2 || i15 == 0 || i12 == 0) ? 5 : 1;
            case 7563369:
                if (j10 < 2 || j10 > 10) {
                    return (j10 < 0 || j10 > 1) ? 5 : 1;
                }
                return 3;
            case 7633517:
                return ((j10 < 0 || j10 > 1) && (j10 < 11 || j10 > 99)) ? 5 : 1;
            default:
                return 5;
        }
    }

    public static String k(String str, int i10) {
        return (i10 == 0 || (i10 & 1) == 0) ? str : Z1(str);
    }

    public static CharSequence k0(int i10, Object... objArr) {
        return p1(null, i10, true, 0, null, objArr);
    }

    public static String k1(TdApi.LanguagePackInfo languagePackInfo, int i10) {
        return q1(languagePackInfo, i10, true);
    }

    public static String k2() {
        return he.i.c2().Z0().f19945id;
    }

    public static void l(char c10, Object obj) {
        boolean z10 = false;
        if (c10 == 'd' ? (obj instanceof Integer) || (obj instanceof Long) : c10 == 'f' ? (obj instanceof Float) || (obj instanceof Double) : c10 == 's') {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException(obj.getClass() + " != %" + c10);
        }
    }

    public static String l0(String str) {
        TdApi.LanguagePackStringValueOrdinary v12 = v1(str, he.i.c2().Z0());
        if (v12 != null) {
            return v12.value;
        }
        return null;
    }

    public static String l1(TdApi.LanguagePackInfo languagePackInfo, int i10, Object... objArr) {
        return p1(languagePackInfo, i10, true, 0, null, objArr).toString();
    }

    public static String l2(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        int length = str.length() - 1;
        boolean z10 = false;
        while (length >= 0) {
            char charAt = str.charAt(length);
            if (charAt == '\'') {
                z10 = !z10;
            } else if (!z10 && O1(charAt) && M1(charAt)) {
                int i10 = length + 1;
                boolean z11 = false;
                while (i10 < sb2.length()) {
                    char charAt2 = sb2.charAt(i10);
                    if (charAt2 != '\'') {
                        if (!z11 && O1(charAt2) && !M1(charAt2)) {
                            break;
                        }
                    } else {
                        z11 = !z11;
                    }
                    i10++;
                }
                int i11 = length;
                boolean z12 = false;
                while (length > 0) {
                    char charAt3 = str.charAt(length - 1);
                    if (charAt3 != '\'') {
                        if (!(z12 || charAt3 == '.' || charAt3 == '`')) {
                            break;
                        }
                    } else {
                        z12 = !z12;
                    }
                    length--;
                    i11--;
                }
                sb2.delete(i11, i10);
            } else if (!z10 && charAt == 'M') {
                sb2.setCharAt(length, 'L');
            }
            length--;
        }
        return sb2.toString();
    }

    public static String m() {
        return he.i.c2().Z0().baseLanguagePackId;
    }

    public static String m0() {
        return i1(R.string.format_concatSeparator);
    }

    public static CharSequence m1(int i10, Object... objArr) {
        return p1(null, i10, true, 0, p(), objArr);
    }

    public static String m2(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        int length = str.length() - 1;
        boolean z10 = false;
        while (length >= 0) {
            char charAt = str.charAt(length);
            if (charAt == '\'') {
                z10 = !z10;
            } else if (!z10 && O1(charAt) && Q1(charAt)) {
                int i10 = length + 1;
                boolean z11 = false;
                while (i10 < sb2.length()) {
                    char charAt2 = sb2.charAt(i10);
                    if (charAt2 != '\'') {
                        if (!z11 && O1(charAt2) && !Q1(charAt2)) {
                            break;
                        }
                    } else {
                        z11 = !z11;
                    }
                    i10++;
                }
                int i11 = length;
                boolean z12 = false;
                while (length > 0) {
                    char charAt3 = str.charAt(length - 1);
                    if (charAt3 != '\'') {
                        if (!z12 && O1(charAt3) && !Q1(charAt3)) {
                            break;
                        }
                    } else {
                        z12 = !z12;
                    }
                    length--;
                    i11--;
                }
                sb2.delete(i11, i10);
            }
            length--;
        }
        return sb2.toString();
    }

    public static String n(double d10, double d11) {
        return String.format(Locale.US, "%f, %f", Double.valueOf(h.o(d10)), Double.valueOf(h.o(d11)));
    }

    public static String n0(boolean z10) {
        return i1(z10 ? R.string.format_concatSeparatorLastPerson : R.string.format_concatSeparatorLast);
    }

    public static CharSequence n1(int i10, Object... objArr) {
        return p1(null, i10, true, 1, p(), objArr);
    }

    public static CharSequence n2(int i10, long j10, f fVar, Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return v2(i10, j10, 0, fVar, c0.f(j10));
        }
        Object[] objArr2 = new Object[objArr.length + 1];
        objArr2[0] = c0.f(j10);
        System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
        return v2(i10, j10, 0, fVar, objArr2);
    }

    public static String o(double d10) {
        long j10 = (long) d10;
        return d10 == ((double) j10) ? Long.toString(j10) : String.format(Locale.US, "%.2f", Double.valueOf(d10));
    }

    public static String o0(long j10, TimeUnit timeUnit) {
        if (ib.f.l(j10, timeUnit)) {
            return D(j10, timeUnit);
        }
        return G(j10, timeUnit);
    }

    public static String o1(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt < '0' || charAt > '9') && charAt != '_'))) {
                return null;
            }
        }
        int s12 = s1(str);
        if (s12 == 0 || ib.b.t(y.b(), str) >= 0) {
            return null;
        }
        return i1(s12);
    }

    public static String o2(int i10, long j10) {
        return v2(i10, j10, 0, null, c0.f(j10)).toString();
    }

    public static f p() {
        return s.f12335a;
    }

    public static String p0(long j10, long j11, TimeUnit timeUnit, boolean z10) {
        return DateUtils.formatDateRange(j0.n(), new Formatter(new StringBuilder(50), Y1()), timeUnit.toMillis(j10), timeUnit.toMillis(j11), z10 ? 524289 : Log.TAG_PLAYER).toString();
    }

    public static CharSequence p1(TdApi.LanguagePackInfo languagePackInfo, int i10, boolean z10, int i11, f fVar, Object... objArr) {
        if (i10 == 0) {
            throw new Resources.NotFoundException("resId == 0");
        } else if (objArr == null || objArr.length == 0) {
            return q1(null, i10, z10);
        } else {
            boolean J1 = J1(objArr);
            if (z10) {
                if (languagePackInfo == null) {
                    languagePackInfo = he.i.c2().Z0();
                }
                TdApi.LanguagePackStringValueOrdinary v12 = v1(e1(i10), languagePackInfo);
                if (v12 != null) {
                    try {
                        return U(k(v12.value, i11), J1, fVar, objArr);
                    } catch (Throwable unused) {
                        a3(true, t2(), i10);
                    }
                }
            }
            try {
                if (fVar == null && i11 == 0 && !J1) {
                    return W(i10, objArr);
                }
                return U(k(V(i10), i11), J1, fVar, objArr);
            } catch (Resources.NotFoundException unused2) {
                Log.e("Resource not found (shitty modified lang pack?): %d %s", Integer.valueOf(i10), e1(i10));
                return "";
            } catch (Throwable th) {
                String V = V(i10);
                Log.e("Resource format is broken (shitty modified lang pack?): %s, format: %s", th, e1(i10), V);
                return V;
            }
        }
    }

    public static String p2(int i10, long j10, Object... objArr) {
        return n2(i10, j10, null, objArr).toString();
    }

    public static CharSequence q(CharSequence charSequence) {
        return d3(charSequence, p());
    }

    public static String q0(long j10, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j10);
        if (!he.i.c2().a0()) {
            return O2(millis, 3, "dd.MM.yyyy");
        }
        Calendar a10 = ib.f.a(millis);
        return j1(R.string.format_datestamp, Integer.valueOf(a10.get(5)), Integer.valueOf(a10.get(2) + 1), Integer.valueOf(a10.get(1) % 100));
    }

    public static String q1(TdApi.LanguagePackInfo languagePackInfo, int i10, boolean z10) {
        if (i10 != 0) {
            if (z10) {
                if (languagePackInfo == null) {
                    languagePackInfo = he.i.c2().Z0();
                }
                TdApi.LanguagePackStringValueOrdinary v12 = v1(e1(i10), languagePackInfo);
                if (v12 != null) {
                    return v12.value;
                }
            }
            try {
                return V(i10);
            } catch (Resources.NotFoundException unused) {
                Log.e("Resource not found (shitty modified lang pack?): %d %s", Integer.valueOf(i10), e1(i10));
                return "";
            }
        } else {
            throw new Resources.NotFoundException("resId == 0");
        }
    }

    public static CharSequence q2(int i10, long j10) {
        return n2(i10, j10, p(), new Object[0]);
    }

    public static Map<String, TdApi.LanguagePackStringValue> r() {
        if (f12350k == null) {
            synchronized (w.class) {
                if (f12350k == null) {
                    f12350k = new ConcurrentHashMap();
                }
            }
        }
        return f12350k;
    }

    public static String r0(String str, boolean z10) {
        if (!z10) {
            return str;
        }
        return "[DEBUG] " + str;
    }

    public static TdApi.LanguagePackStringValuePluralized r1(String str, TdApi.LanguagePackInfo languagePackInfo) {
        String b22 = k2().equals(languagePackInfo.f19945id) ? b2(languagePackInfo.f19945id, str) : null;
        if (b22 != null) {
            TdApi.LanguagePackStringValue i02 = i0(b22);
            if (i02 instanceof TdApi.LanguagePackStringValuePluralized) {
                return (TdApi.LanguagePackStringValuePluralized) i02;
            }
            if (i02 instanceof TdApi.LanguagePackStringValueDeleted) {
                return null;
            }
        }
        TdApi.LanguagePackStringValuePluralized D2 = D2(str, languagePackInfo.f19945id);
        if (D2 == null && !i.i(languagePackInfo.baseLanguagePackId)) {
            D2 = D2(str, languagePackInfo.baseLanguagePackId);
        }
        if (b22 != null) {
            B2(b22, D2);
        }
        return D2;
    }

    public static CharSequence r2(int i10, long j10, Object... objArr) {
        return n2(i10, j10, p(), objArr);
    }

    public static void s(TdApi.LanguagePackInfo languagePackInfo) {
        he.i.c2().R4(languagePackInfo);
        Iterator<w6> it = ya.o1().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            w6 next = it.next();
            if (next.B(true)) {
                next.c().ec(languagePackInfo);
                z10 = true;
            }
        }
        if (!z10) {
            ya.o1().j0().ec(languagePackInfo);
        }
        J();
    }

    public static String s0() {
        return i1(R.string.format_decimalSeparator);
    }

    public static int s1(String str) {
        try {
            Context n10 = j0.n();
            return n10.getResources().getIdentifier(str, "string", n10.getPackageName());
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String s2(List<String> list, int i10) {
        String join = TextUtils.join(m0(), list);
        return i10 == 0 ? join : j1(R.string.format_chatTitlesAndOthers, join, o2(R.string.xOtherChatTitles, i10));
    }

    public static void t() {
        TdApi.LanguagePackInfo Z0 = he.i.c2().Z0();
        Iterator<w6> it = ya.o1().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            w6 next = it.next();
            if (next.B(true) && next.c().ec(Z0)) {
                z10 = true;
            }
        }
        if (z10) {
            J();
        }
    }

    public static String t0(long j10, long j11, boolean z10) {
        int i10 = j11 != 0 ? (int) ((j10 / j11) * 100.0d) : 0;
        int i11 = z10 ? R.string.Downloading : R.string.DownloadingOf;
        return j1(i11, i10 + "%", c0.m(j11));
    }

    public static CharSequence t1(int i10, f fVar, Object... objArr) {
        if (P1()) {
            return h1(i10, fVar, objArr);
        }
        return p1(null, i10, false, 0, fVar, objArr).toString();
    }

    public static int t2() {
        return he.i.c2().a1();
    }

    public static void u() {
        v(true);
    }

    public static String u0(TdApi.File file, int i10, boolean z10) {
        if (file == null || (!z10 && t2.T2(file))) {
            return i1(i10);
        }
        TdApi.LocalFile localFile = file.local;
        return localFile.isDownloadingActive ? t0(localFile.downloadedSize, file.size, true) : j1(R.string.CloudDownload, c0.m(file.size));
    }

    public static String u1(int i10, Object... objArr) {
        if (P1()) {
            return j1(i10, objArr);
        }
        return p1(null, i10, false, 0, null, objArr).toString();
    }

    public static CharSequence u2(long j10, TimeUnit timeUnit, int i10, int i11, int i12, int i13, int i14, int i15, Object... objArr) {
        long days = timeUnit.toDays(j10);
        long j11 = days / 30;
        long j12 = days / 7;
        long hours = timeUnit.toHours(j10);
        long minutes = timeUnit.toMinutes(j10);
        long seconds = timeUnit.toSeconds(j10);
        if (i15 != 0 && j11 > 0) {
            return r2(i15, j11, objArr);
        }
        if (i14 != 0 && j12 > 0) {
            return r2(i14, j12, objArr);
        }
        if (i13 != 0 && days > 0) {
            return r2(i13, days, objArr);
        }
        if (i12 != 0 && hours > 0) {
            return r2(i12, hours, objArr);
        }
        if (i11 != 0 && minutes > 0) {
            return r2(i11, minutes, objArr);
        }
        if (i10 != 0) {
            return r2(i10, seconds, objArr);
        }
        throw new IllegalArgumentException();
    }

    public static void v(boolean z10) {
        J2(!"1".equals(i1(R.string.language_disable_lowercase)), z10);
        K2(he.i.c2().Q2(k2(), B0() == 1), z10);
        Locale locale = null;
        String i12 = i1(R.string.language_dateFormatLocale);
        if (!i.i(i12) && !"0".equals(i12)) {
            try {
                String w10 = w(i12);
                if (w10.length() == i12.length()) {
                    locale = new Locale(w10);
                } else {
                    locale = new Locale(w10, w(i12.substring(w10.length() + 1)));
                }
            } catch (Throwable unused) {
            }
        }
        I2(locale, z10);
        f12345f = true;
    }

    public static String v0(int i10) {
        return w0(i10, 0, 0, false);
    }

    public static TdApi.LanguagePackStringValueOrdinary v1(String str, TdApi.LanguagePackInfo languagePackInfo) {
        String b22 = k2().equals(languagePackInfo.f19945id) ? b2(languagePackInfo.f19945id, str) : null;
        if (b22 != null) {
            TdApi.LanguagePackStringValue i02 = i0(b22);
            if (i02 instanceof TdApi.LanguagePackStringValueOrdinary) {
                return (TdApi.LanguagePackStringValueOrdinary) i02;
            }
            if (i02 instanceof TdApi.LanguagePackStringValueDeleted) {
                return null;
            }
        }
        TdApi.LanguagePackStringValueOrdinary E2 = E2(str, languagePackInfo.f19945id);
        if (E2 == null && !i.i(languagePackInfo.baseLanguagePackId)) {
            E2 = E2(str, languagePackInfo.baseLanguagePackId);
        }
        if (b22 != null) {
            B2(b22, E2);
        }
        return E2;
    }

    public static CharSequence v2(int i10, long j10, int i11, f fVar, Object... objArr) {
        Object[] objArr2;
        f fVar2;
        if (i10 != 0) {
            TdApi.LanguagePackStringValuePluralized r12 = r1(e1(i10), he.i.c2().Z0());
            if (r12 != null) {
                int t22 = t2();
                int j22 = j2(t22, j10);
                String R0 = R0(r12, j22);
                if (!i.i(R0) || j22 == 5) {
                    fVar2 = fVar;
                    objArr2 = objArr;
                } else {
                    R0 = r12.otherValue;
                    fVar2 = fVar;
                    objArr2 = objArr;
                    j22 = 5;
                }
                try {
                    return T(R0, fVar2, objArr2);
                } catch (Throwable unused) {
                    a3(true, t22, y.c(i10, j22));
                }
            }
            int M = M();
            int z22 = z2(M, i10, j10);
            try {
                return p1(null, z22, false, i11, fVar, objArr);
            } catch (Throwable th) {
                if (M != 25966) {
                    a3(false, M, z22);
                    return p1(null, z2(25966, i10, j10), false, i11, fVar, objArr);
                }
                throw new IllegalStateException("Broken plural: " + e1(i10), th);
            }
        } else {
            throw new Resources.NotFoundException("resId == 0");
        }
    }

    public static String w(String str) {
        if (i.i(str)) {
            return str;
        }
        if (str.charAt(0) == 'X') {
            int indexOf = str.indexOf(88, 1);
            str = indexOf != -1 ? str.substring(1, indexOf) : str.substring(1);
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '-' || charAt == '_') {
                return str.substring(0, i10).toLowerCase();
            }
        }
        return str.toLowerCase();
    }

    public static String w0(int i10, int i11, int i12, boolean z10) {
        if (!A2(i10) || (i11 == 0 && i12 == 0)) {
            if (i10 < 60) {
                return o2(R.string.xSeconds, i10);
            }
            int i13 = i10 / 60;
            if (i13 < 60) {
                return o2(R.string.xMinutes, i13);
            }
            int i14 = i13 / 60;
            if (z10) {
                return c0.h(i10);
            }
            if (i14 < 24) {
                return o2(R.string.xHours, i14);
            }
            int i15 = i14 / 24;
            if (i15 < 7) {
                return o2(R.string.xDays, i15);
            }
            int i16 = i15 / 7;
            if (i16 < 4) {
                return o2(R.string.xWeeks, i16);
            }
            int i17 = i15 / 30;
            if (i17 < 12) {
                return o2(R.string.xMonths, i17);
            }
            return o2(R.string.xYears, Math.max(1, i15 / 365));
        } else if (i12 != 0) {
            return i11 != 0 ? j1(i11, o0(i12, TimeUnit.SECONDS)) : o0(i12, TimeUnit.SECONDS);
        } else {
            if (i11 != 0) {
                return i1(i11);
            }
            return null;
        }
    }

    public static CharSequence w1(int i10, String str, Object... objArr) {
        if (!i.i(str) && str.matches("^[A-Za-z0-9_]+$")) {
            String str2 = e1(i10) + i.E(str.toLowerCase(), C());
            int s12 = s1(str2);
            if (s12 != 0) {
                return m1(s12, objArr);
            }
            String l02 = l0(str2);
            if (l02 != null) {
                if (objArr == null || objArr.length <= 0) {
                    return l02;
                }
                try {
                    return U(l02, J1(objArr), p(), objArr);
                } catch (Throwable unused) {
                    a3(true, t2(), i10);
                }
            }
        }
        if (i10 != 0) {
            return m1(i10, objArr);
        }
        return null;
    }

    public static CharSequence w2(int i10, int i11, boolean z10) {
        int i12 = R.string.xSubscribers;
        if (i11 > 0) {
            if (!z10) {
                i12 = R.string.xMembers;
            }
            return k0(R.string.format_membersAndOnline, n2(i12, i10, p(), new Object[0]), n2(R.string.xOnline, i11, p(), new Object[0]));
        }
        if (!z10) {
            i12 = R.string.xMembers;
        }
        return n2(i12, i10, p(), new Object[0]);
    }

    public static void x() {
        r().clear();
    }

    public static String x0(int i10) {
        return w0(i10, 0, 0, true);
    }

    public static String x1() {
        return i1(R.string.format_thousandsSeparator);
    }

    public static String x2(List<String> list, int i10) {
        String join = TextUtils.join(m0(), list);
        return i10 == 0 ? join : j1(R.string.format_peopleNamesAndOthers, join, o2(R.string.xOtherPeopleNames, i10));
    }

    public static f y() {
        return r.f12334a;
    }

    public static String y0(String str) {
        String str2 = "error_" + str;
        int s12 = s1(str2);
        if (s12 != 0) {
            return i1(s12);
        }
        String l02 = l0(str2);
        if (l02 != null) {
            return l02;
        }
        return null;
    }

    public static String y1(long j10, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j10);
        if (!he.i.c2().a0()) {
            return P2(millis, 3, 3, j0.X() ? "dd.MM.yyyy h:mm a" : "dd.MM.yyyy H:mm");
        }
        Calendar a10 = ib.f.a(millis);
        return j1(R.string.format_timestamp, Integer.valueOf(a10.get(5)), Integer.valueOf(a10.get(2) + 1), Integer.valueOf(a10.get(1) % 100), U2(a10));
    }

    public static CharSequence y2(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            return k0(R.string.format_photosAndVideos, q2(R.string.xPhotos, i10), q2(R.string.xVideos, i11));
        }
        if (i11 > 0) {
            return q2(R.string.xVideos, i11);
        }
        if (i10 > 0) {
            return q2(R.string.xPhotos, i10);
        }
        return i1(R.string.NoMediaYet);
    }

    public static CharSequence z(CharSequence charSequence) {
        return d3(charSequence, y());
    }

    public static String z0(long j10, TimeUnit timeUnit, long j11) {
        return j10 <= 0 ? c0.m(j11) : j1(R.string.format_fileSizeAndModifiedDate, c0.m(j11), Z0(j10, timeUnit));
    }

    public static String z1(int i10) {
        if (i10 < 120) {
            return o2(R.string.TryAgainSeconds, i10);
        }
        int i11 = i10 / 60;
        if (i11 < 60) {
            return o2(R.string.TryAgainMinutes, i11);
        }
        return o2(R.string.TryAgainHours, i11 / 60);
    }

    public static int z2(int i10, int i11, long j10) {
        return y.c(i11, j2(i10, j10));
    }
}
