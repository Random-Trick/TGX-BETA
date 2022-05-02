package p082fd;

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
import be.C1363c0;
import be.C1379j0;
import be.C1389o;
import com.googlecode.mp4parser.boxes.microsoft.XtraBox;
import gd.AbstractC4761s4;
import gd.C4779t2;
import ge.C4868i;
import ie.AbstractC5411l0;
import ie.RunnableC5390g;
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
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p039d.C3563j;
import p108hb.C5062b;
import p108hb.C5067f;
import p108hb.C5069h;
import p108hb.C5070i;
import p110hd.C5078d;
import p111he.C5132o;
import p126j$.util.concurrent.ConcurrentHashMap;
import p154kb.C6227d;
import p193nb.C7316a;
import p350yd.AbstractC10664f9;
import p350yd.C10536ab;
import p350yd.C10930q6;
import p350yd.C11131y6;
import td.AbstractC9323v4;

public class C4403w {
    public static int f14575a;
    public static String f14576b;
    public static Object f14577c;
    public static Locale f14578d;
    public static Set<String> f14579e;
    public static boolean f14580f;
    public static boolean f14581g;
    public static boolean f14582h;
    public static Locale f14583i;
    public static C6227d<AbstractC4404a> f14584j;
    public static Map<String, TdApi.LanguagePackStringValue> f14585k;
    public static TdApi.LanguagePackStringValueDeleted f14586l;

    public interface AbstractC4404a {
        void mo9343T5(int i, int i2);
    }

    public static class C4405b {
        public final TdApi.LanguagePackInfo f14587a;
        public final C4408e f14588b;
        public final C4408e f14589c;
        public final List<C4406c> f14590d;
        public Pattern f14591e;

        public C4405b(TdApi.LanguagePackInfo languagePackInfo, C4408e eVar, C4408e eVar2, List<C4406c> list) {
            this.f14587a = languagePackInfo;
            this.f14588b = eVar;
            this.f14589c = eVar2;
            this.f14590d = list;
        }

        public static int m27797c(int i) {
            switch (i) {
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
                    throw new IllegalArgumentException("section == " + i);
            }
        }

        public static int m27796d(TdApi.LanguagePackString languagePackString) {
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
            for (int i = 0; i < 7; i++) {
                String str2 = strArr[i];
                if (str.endsWith("_" + str2)) {
                    return 5;
                }
            }
            TdApi.LanguagePackStringValue languagePackStringValue = languagePackString.value;
            if (languagePackStringValue instanceof TdApi.LanguagePackStringValuePluralized) {
                return 6;
            }
            return (!(languagePackStringValue instanceof TdApi.LanguagePackStringValueOrdinary) || !C5070i.m24064f(((TdApi.LanguagePackStringValueOrdinary) languagePackStringValue).value)) ? 8 : 7;
        }

        public C4406c m27799a(C4406c cVar) {
            int indexOf = cVar != null ? this.f14590d.indexOf(cVar) : -1;
            int i = 0;
            if (indexOf == -1) {
                indexOf = 0;
            }
            if (indexOf == 0) {
                for (C4406c cVar2 : this.f14590d) {
                    if (!(cVar2 == cVar || cVar2.f14593b)) {
                        return cVar2;
                    }
                }
                return null;
            }
            int size = this.f14590d.size();
            for (int i2 = indexOf + 1; i2 < size; i2++) {
                C4406c cVar3 = this.f14590d.get(i2);
                if (!(cVar3 == cVar || cVar3.f14593b)) {
                    return cVar3;
                }
            }
            for (C4406c cVar4 : this.f14590d) {
                if (cVar4 == cVar || cVar4.f14593b) {
                    i++;
                    if (i == indexOf) {
                        break;
                    }
                } else {
                    return cVar4;
                }
            }
            return null;
        }

        public Pattern m27798b() {
            if (this.f14591e == null) {
                this.f14591e = Pattern.compile("(%%|%\\d+\\$(?:\\d+)?\\w)");
            }
            return this.f14591e;
        }

        public int m27795e() {
            int i = 0;
            for (C4406c cVar : this.f14590d) {
                if (!cVar.f14593b) {
                    i++;
                }
            }
            return i;
        }

        public void m27794f(C4406c cVar, SpannableStringBuilder spannableStringBuilder, boolean z) {
            String str;
            int constructor = cVar.f14592a.value.getConstructor();
            if (constructor == -249256352) {
                m27793g(((TdApi.LanguagePackStringValueOrdinary) cVar.f14592a.value).value, spannableStringBuilder, z, -1);
            } else if (constructor == 1906840261) {
                TdApi.LanguagePackStringValuePluralized languagePackStringValuePluralized = (TdApi.LanguagePackStringValuePluralized) cVar.f14592a.value;
                for (C4407d dVar : (cVar.f14593b ? this.f14588b : this.f14589c).f14598b) {
                    int i = dVar.f14595a;
                    if (i == 0) {
                        str = languagePackStringValuePluralized.zeroValue;
                    } else if (i == 1) {
                        str = languagePackStringValuePluralized.oneValue;
                    } else if (i == 2) {
                        str = languagePackStringValuePluralized.twoValue;
                    } else if (i == 3) {
                        str = languagePackStringValuePluralized.fewValue;
                    } else if (i == 4) {
                        str = languagePackStringValuePluralized.manyValue;
                    } else if (i == 5) {
                        str = languagePackStringValuePluralized.otherValue;
                    }
                    if (!C5070i.m24061i(str)) {
                        int[] iArr = dVar.f14596b;
                        if (iArr.length > 0) {
                            m27793g(str, spannableStringBuilder, z, iArr[0]);
                        }
                    }
                }
            }
        }

        public void m27793g(String str, SpannableStringBuilder spannableStringBuilder, boolean z, int i) {
            int indexOf;
            int i2;
            int i3;
            int g;
            if (!C5070i.m24061i(str)) {
                String str2 = "\n";
                int i4 = 0;
                if (str.indexOf(str2) != -1) {
                    if (!z) {
                        str = str.substring(0, indexOf) + "…";
                    } else if (i >= 0 && spannableStringBuilder.length() > 0) {
                        str = str2 + str;
                    }
                }
                if (spannableStringBuilder.length() > 0) {
                    if (!z) {
                        str2 = ", ";
                    }
                    spannableStringBuilder.append((CharSequence) str2);
                }
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) str);
                Matcher matcher = m27798b().matcher(str);
                while (matcher.find()) {
                    int start = matcher.start();
                    int end = matcher.end();
                    spannableStringBuilder.setSpan(new C5132o(C1389o.m37260i(), R.id.theme_color_textNeutral).m23852j(new TdApi.TextEntityTypeBold()).m23851k(RunnableC5390g.m22981N0(str, start, end)), start + length, end + length, 33);
                }
                if (i >= 0 && (g = C5070i.m24063g(spannableStringBuilder, "%1$s", length)) != -1) {
                    int i5 = g + 4;
                    Object[] objArr = (C5132o[]) spannableStringBuilder.getSpans(g, i5, C5132o.class);
                    if (objArr != null && objArr.length == 1) {
                        spannableStringBuilder.removeSpan(objArr[0]);
                        String S = C4403w.m27939S(i);
                        objArr[0].m23851k(RunnableC5390g.m22983M0(S));
                        spannableStringBuilder.replace(g, i5, (CharSequence) S);
                        spannableStringBuilder.setSpan(objArr[0], g, S.length() + g, 33);
                    }
                }
                int length2 = spannableStringBuilder.length();
                if (length != length2) {
                    int i6 = 0;
                    while (true) {
                        i2 = length + i6;
                        if (i2 >= length2 || !C1363c0.m37455S(spannableStringBuilder.charAt(i2))) {
                            break;
                        }
                        i6++;
                    }
                    while (true) {
                        i3 = length2 - i4;
                        int i7 = i3 - 1;
                        if (i7 <= length || !C1363c0.m37455S(spannableStringBuilder.charAt(i7))) {
                            break;
                        }
                        i4++;
                    }
                    if (i6 > 0) {
                        spannableStringBuilder.setSpan(new BackgroundColorSpan(-1426128896), length, i2, 33);
                    }
                    if (i4 > 0) {
                        spannableStringBuilder.setSpan(new BackgroundColorSpan(-1426128896), i3, length2, 33);
                    }
                }
            }
        }

        public void m27792h() {
            for (C4406c cVar : this.f14590d) {
                cVar.m27787e(this);
            }
        }
    }

    public static class C4406c {
        public final TdApi.LanguagePackString f14592a;
        public boolean f14593b;
        public TdApi.LanguagePackStringValue f14594c;

        public C4406c(TdApi.LanguagePackString languagePackString, boolean z) {
            this.f14592a = languagePackString;
            this.f14593b = z;
        }

        public TdApi.LanguagePackStringValuePluralized m27791a(List<C4407d> list) {
            TdApi.LanguagePackStringValue languagePackStringValue = this.f14594c;
            if (languagePackStringValue != null) {
                return (TdApi.LanguagePackStringValuePluralized) languagePackStringValue;
            }
            TdApi.LanguagePackStringValuePluralized d0 = C4403w.m27891d0(m27789c(), list);
            this.f14594c = d0;
            return d0;
        }

        public TdApi.LanguagePackStringValueOrdinary m27790b() {
            TdApi.LanguagePackStringValue languagePackStringValue = this.f14594c;
            if (languagePackStringValue != null) {
                return (TdApi.LanguagePackStringValueOrdinary) languagePackStringValue;
            }
            TdApi.LanguagePackStringValueOrdinary e0 = C4403w.m27886e0(m27789c());
            this.f14594c = e0;
            return e0;
        }

        public String m27789c() {
            return this.f14592a.key;
        }

        public int m27788d() {
            return C4405b.m27796d(this.f14592a);
        }

        public void m27787e(C4405b bVar) {
            int constructor = this.f14592a.value.getConstructor();
            boolean z = true;
            if (constructor == -249256352) {
                TdApi.LanguagePackString languagePackString = this.f14592a;
                TdApi.LanguagePackStringValueOrdinary languagePackStringValueOrdinary = (TdApi.LanguagePackStringValueOrdinary) languagePackString.value;
                TdApi.LanguagePackStringValueOrdinary E2 = C4403w.m27992E2(languagePackString.key, bVar.f14587a.f25405id);
                if (E2 == null) {
                    z = false;
                }
                this.f14593b = z;
                if (!z) {
                    E2 = m27790b();
                }
                languagePackStringValueOrdinary.value = E2.value;
            } else if (constructor == 1906840261) {
                TdApi.LanguagePackString languagePackString2 = this.f14592a;
                TdApi.LanguagePackStringValuePluralized languagePackStringValuePluralized = (TdApi.LanguagePackStringValuePluralized) languagePackString2.value;
                TdApi.LanguagePackStringValuePluralized D2 = C4403w.m27996D2(languagePackString2.key, bVar.f14587a.f25405id);
                if (D2 == null) {
                    z = false;
                }
                this.f14593b = z;
                if (D2 == null) {
                    D2 = C4403w.m27891d0(this.f14592a.key, bVar.f14589c.f14598b);
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

    public static class C4407d {
        public final int f14595a;
        public final int[] f14596b;

        public C4407d(int i, int... iArr) {
            this.f14595a = i;
            this.f14596b = iArr;
        }

        public static String m27785b(TdApi.LanguagePackStringValuePluralized languagePackStringValuePluralized, int i) {
            if (i == 0) {
                return languagePackStringValuePluralized.zeroValue;
            }
            if (i == 1) {
                return languagePackStringValuePluralized.oneValue;
            }
            if (i == 2) {
                return languagePackStringValuePluralized.twoValue;
            }
            if (i == 3) {
                return languagePackStringValuePluralized.fewValue;
            }
            if (i == 4) {
                return languagePackStringValuePluralized.manyValue;
            }
            if (i == 5) {
                return languagePackStringValuePluralized.otherValue;
            }
            throw new IllegalArgumentException("form == " + i);
        }

        public String m27786a(TdApi.LanguagePackStringValuePluralized languagePackStringValuePluralized) {
            return m27785b(languagePackStringValuePluralized, this.f14595a);
        }
    }

    public static class C4408e {
        public final int f14597a;
        public final List<C4407d> f14598b = new ArrayList();

        public C4408e(int i) {
            this.f14597a = i;
        }

        public C4408e m27784a(int i, int... iArr) {
            this.f14598b.add(new C4407d(i, iArr));
            return this;
        }
    }

    public interface AbstractC4409f {
        Object mo379a(CharSequence charSequence, int i, int i2, int i3, boolean z);
    }

    public static String m28011A(int i, int i2) {
        if (i2 < 1000) {
            return String.valueOf(i2);
        }
        return C1363c0.m37437f(i2);
    }

    public static String[] m28010A0(int[] iArr) {
        String[] strArr = new String[iArr.length];
        int i = 0;
        for (int i2 : iArr) {
            strArr[i] = m27885e1(i2);
            i++;
        }
        return strArr;
    }

    public static CharSequence m28009A1(AbstractC9323v4<?> v4Var, TdApi.ChatSource chatSource) {
        int constructor = chatSource.getConstructor();
        if (constructor == -328571244) {
            return m27930U0(v4Var, ((TdApi.ChatSourcePublicServiceAnnouncement) chatSource).type, true);
        }
        if (constructor == 394074115) {
            return m27982H0(v4Var, R.string.ProxySponsorAlert, new Object[0]);
        }
        throw new UnsupportedOperationException(chatSource.toString());
    }

    public static boolean m28008A2(int i) {
        return (((i / 60) / 60) / 24) / 7 > 2 || i <= 0;
    }

    public static String m28007B(String str, long j) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return new SimpleDateFormat(str, m28003C()).format(C5067f.m24118b(j));
            } catch (ExceptionInInitializerError e) {
                Log.m14725e("Vendor i18n implementation bug in SimpleDateFormat", e, new Object[0]);
            }
        }
        return new java.text.SimpleDateFormat(str, m28003C()).format(C5067f.m24118b(j));
    }

    public static int m28006B0() {
        return 0;
    }

    public static String m28005B1(int i, int i2) {
        return i2 <= 1 ? m27844o2(R.string.xNewMessages, i) : m27865j1(R.string.format_newMessagesFromChats, m27844o2(R.string.xNewMessages, i), m27844o2(R.string.FromXChats, i2));
    }

    public static void m28004B2(String str, TdApi.LanguagePackStringValue languagePackStringValue) {
        if (languagePackStringValue == null) {
            languagePackStringValue = m27879g();
        }
        m27835r().put(str, languagePackStringValue);
    }

    public static Locale m28003C() {
        if (!f14580f) {
            m27819v(false);
        }
        Locale locale = Locale.getDefault();
        Locale locale2 = f14583i;
        return (locale2 == null || locale2.getLanguage().equals(locale.getLanguage())) ? locale : f14583i;
    }

    public static int m28002C0(String str) {
        return 0;
    }

    public static String m28001C1(long j, TimeUnit timeUnit) {
        if (C5067f.m24107m(j, timeUnit)) {
            return m27932T2(j, timeUnit);
        }
        return C5067f.m24106n(j, timeUnit) ? m27865j1(R.string.format_tomorrow, m27932T2(j, timeUnit)) : C5067f.m24108l(j, timeUnit) ? m27865j1(R.string.format_dateTime, m27999D(j, timeUnit), m27932T2(j, timeUnit)) : m27865j1(R.string.format_dateTime, m27987G(j, timeUnit), m27932T2(j, timeUnit));
    }

    public static void m28000C2(String str, TdApi.LanguagePackString[] languagePackStringArr) {
        if (!m27835r().isEmpty()) {
            for (TdApi.LanguagePackString languagePackString : languagePackStringArr) {
                String b2 = m27899b2(str, languagePackString.key);
                if (f14585k.containsKey(b2)) {
                    if (languagePackString.value.getConstructor() == 1834792698) {
                        f14585k.put(b2, m27879g());
                    } else {
                        f14585k.put(b2, languagePackString.value);
                    }
                }
            }
        }
    }

    public static String m27999D(long j, TimeUnit timeUnit) {
        return m27940R2(timeUnit.toMillis(j), 1, "d MMMM");
    }

    public static String m27998D0() {
        String n = C5078d.m23998n(m27869i1(R.string.language_emoji));
        return n != null ? n : m27911Z();
    }

    public static String m27997D1(C10930q6 q6Var, TdApi.UserStatus userStatus, boolean z) {
        switch (userStatus.getConstructor()) {
            case TdApi.UserStatusOnline.CONSTRUCTOR:
                return m27869i1(R.string.status_Online);
            case TdApi.UserStatusOffline.CONSTRUCTOR:
                int i = ((TdApi.UserStatusOffline) userStatus).wasOnline;
                if (i > 0) {
                    return m27990F0(q6Var, i, TimeUnit.SECONDS, z);
                }
                return m27869i1(R.string.status_LastSeenUnknown);
            case TdApi.UserStatusRecently.CONSTRUCTOR:
                return m27869i1(R.string.status_LastSeenRecently);
            case TdApi.UserStatusLastWeek.CONSTRUCTOR:
                return m27869i1(R.string.status_LastSeenWithinWeek);
            case TdApi.UserStatusEmpty.CONSTRUCTOR:
                return m27869i1(R.string.status_LastSeenUnknown);
            case TdApi.UserStatusLastMonth.CONSTRUCTOR:
                return m27869i1(R.string.status_LastSeenWithinMonth);
            default:
                throw new IllegalArgumentException("status == " + userStatus);
        }
    }

    public static TdApi.LanguagePackStringValuePluralized m27996D2(String str, String str2) {
        C10536ab o1 = C10536ab.m4667o1();
        if (str2 == null) {
            str2 = m27860k2();
        }
        return o1.m4772N0(str, str2);
    }

    public static String m27995E(Calendar calendar) {
        if (calendar.get(1) == C5067f.m24115e().get(1)) {
            return m27991F(calendar);
        }
        return m27983H(calendar);
    }

    public static C4405b m27994E0(TdApi.LanguagePackInfo languagePackInfo) {
        String[] strArr;
        boolean z;
        String[][] a = C4411y.m27783a();
        ArrayList arrayList = new ArrayList();
        C4408e S0 = m27938S0(m27904a2(m27837q1(null, R.string.language_code, false)));
        TdApi.LanguagePackStringValueOrdinary E2 = m27992E2("language_code", languagePackInfo.f25405id);
        C4408e S02 = E2 != null ? m27938S0(m27904a2(E2.value)) : S0;
        String[] strArr2 = a[0];
        int length = strArr2.length;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= length) {
                break;
            }
            String str = strArr2[i];
            TdApi.LanguagePackStringValueOrdinary E22 = m27992E2(str, languagePackInfo.f25405id);
            if (E22 == null && !C5070i.m24061i(languagePackInfo.baseLanguagePackId)) {
                E22 = m27992E2(str, languagePackInfo.baseLanguagePackId);
                z2 = false;
            }
            if (E22 != null) {
                arrayList.add(new C4406c(new TdApi.LanguagePackString(str, E22), z2));
            } else {
                arrayList.add(new C4406c(new TdApi.LanguagePackString(str, m27886e0(str)), false));
            }
            i++;
        }
        for (String str2 : a[1]) {
            TdApi.LanguagePackStringValuePluralized D2 = m27996D2(str2, languagePackInfo.f25405id);
            if (D2 != null || C5070i.m24061i(languagePackInfo.baseLanguagePackId)) {
                z = true;
            } else {
                D2 = m27996D2(str2, languagePackInfo.baseLanguagePackId);
                z = false;
            }
            if (D2 != null) {
                arrayList.add(new C4406c(new TdApi.LanguagePackString(str2, D2), z));
            } else {
                arrayList.add(new C4406c(new TdApi.LanguagePackString(str2, m27891d0(str2, S0.f14598b)), false));
            }
        }
        Collections.sort(arrayList, C4402v.f14574a);
        return new C4405b(languagePackInfo, S02, S0, arrayList);
    }

    public static String m27993E1(int i, int i2) {
        return m27865j1(R.string.XofY, m28011A(R.string.XofY, i), m28011A(R.string.XofY, i2));
    }

    public static TdApi.LanguagePackStringValueOrdinary m27992E2(String str, String str2) {
        C10536ab o1 = C10536ab.m4667o1();
        if (str2 == null) {
            str2 = m27860k2();
        }
        return o1.m4768O0(str, str2);
    }

    public static String m27991F(Calendar calendar) {
        return m27940R2(calendar.getTimeInMillis(), 2, "d MMM");
    }

    public static String m27990F0(C10930q6 q6Var, long j, TimeUnit timeUnit, boolean z) {
        return m27918X0(j, timeUnit, q6Var.m2898D4(), TimeUnit.MILLISECONDS, z, 60, R.string.status_LastSeen, false);
    }

    public static int m27989F1() {
        return m27984G2() ? 5 : 3;
    }

    public static void m27988F2(AbstractC4404a aVar) {
        if (f14584j == null) {
            synchronized (C4403w.class) {
                if (f14584j == null) {
                    return;
                }
            }
        }
        f14584j.remove(aVar);
    }

    public static String m27987G(long j, TimeUnit timeUnit) {
        return m27952O2(timeUnit.toMillis(j), 1, "d MMMM yyyy");
    }

    public static CharSequence m27986G0(AbstractC10664f9 f9Var, int i, AbstractC4409f fVar, Object... objArr) {
        return C1363c0.m37425l(f9Var, m27873h1(i, fVar, objArr), null);
    }

    public static int m27985G1(int i) {
        return i | m27989F1();
    }

    public static boolean m27984G2() {
        if (!f14580f) {
            m27819v(false);
        }
        return f14582h;
    }

    public static String m27983H(Calendar calendar) {
        return m27952O2(calendar.getTimeInMillis(), 2, "d MMM ''yy");
    }

    public static CharSequence m27982H0(AbstractC10664f9 f9Var, int i, Object... objArr) {
        return C1363c0.m37425l(f9Var, m27865j1(i, objArr), null);
    }

    public static boolean m27981H1(int i, int i2) {
        return (i == 0 && i2 == 1) || i == 1;
    }

    public static void m27980H2(int i, int i2) {
        AbstractC4761s4.m25778v8(i, i2);
        if (f14584j == null) {
            synchronized (C4403w.class) {
                if (f14584j == null) {
                    return;
                }
            }
        }
        Iterator<AbstractC4404a> it = f14584j.iterator();
        while (it.hasNext()) {
            it.next().mo9343T5(i, i2);
        }
    }

    public static String m27979I(long j, TimeUnit timeUnit) {
        return m27948P2(timeUnit.toMillis(j), 2, 3, C1379j0.m37344X() ? "d MMM ''yy h:mm a" : "d MMM ''yy H:mm");
    }

    public static CharSequence m27978I0(AbstractC10664f9 f9Var, int i, Object... objArr) {
        return C1363c0.m37425l(f9Var, m27821u1(i, objArr), null);
    }

    public static boolean m27977I1() {
        if (f14584j == null) {
            synchronized (C4403w.class) {
                if (f14584j == null) {
                    return false;
                }
            }
        }
        return !f14584j.isEmpty();
    }

    public static void m27976I2(Locale locale, boolean z) {
        Locale locale2 = f14583i;
        if ((locale2 == null && locale != null) || ((locale2 != null && locale == null) || (locale != null && !locale.equals(locale2)))) {
            f14583i = locale;
            if (z) {
                m27980H2(3, 0);
            }
        }
    }

    public static void m27975J() {
        boolean z = f14582h;
        m27811x();
        m27819v(false);
        m27980H2(0, f14582h != z ? 1 : 0);
    }

    public static String m27974J0(long j, TimeUnit timeUnit) {
        return m27910Z0(j, timeUnit);
    }

    public static boolean m27973J1(Object[] objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj instanceof Spanned) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void m27972J2(boolean z, boolean z2) {
        if (f14581g != z) {
            f14581g = z;
        }
    }

    public static void m27971K(String str, TdApi.LanguagePackString[] languagePackStringArr, String str2) {
        if (str2 != null) {
            str = str2;
        }
        m28000C2(str, languagePackStringArr);
        m27819v(true);
        if (m27977I1()) {
            for (TdApi.LanguagePackString languagePackString : languagePackStringArr) {
                int s1 = m27829s1(languagePackString.key);
                if (s1 != 0) {
                    m27980H2(2, s1);
                }
            }
            return;
        }
        m27980H2(2, 0);
    }

    public static String m27970K0(long j, TimeUnit timeUnit) {
        return m27918X0(j, timeUnit, System.currentTimeMillis(), TimeUnit.MILLISECONDS, true, 30, R.string.modified, false);
    }

    public static String m27969K1(long j, TimeUnit timeUnit) {
        return m28007B(C1379j0.m37344X() ? "hh a" : "HH", timeUnit.toMillis(j));
    }

    public static void m27968K2(boolean z, boolean z2) {
        if (f14582h != z) {
            f14582h = z;
            if (z2) {
                m27980H2(1, z ? 1 : 0);
            }
        }
    }

    public static AbstractC4409f m27967L(final TdApi.TextEntityType textEntityType) {
        return new AbstractC4409f() {
            @Override
            public final Object mo379a(CharSequence charSequence, int i, int i2, int i3, boolean z) {
                Object I5;
                I5 = C4779t2.m25669I5(TdApi.TextEntityType.this);
                return I5;
            }
        };
    }

    public static long m27966L0(long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2, boolean z, int i) {
        long j3;
        long millis = timeUnit2.toMillis(j2);
        long millis2 = timeUnit.toMillis(j);
        if (z) {
            long j4 = millis - millis2;
            long seconds = TimeUnit.MILLISECONDS.toSeconds(j4);
            if (seconds >= -300) {
                long j5 = i;
                if (seconds < j5) {
                    return TimeUnit.SECONDS.toMillis(j5) - j4;
                }
                if (seconds < 60) {
                    return 1000 - (j4 % 1000);
                }
                long j6 = seconds / 60;
                if (j6 < 60) {
                    j3 = j6 + 1;
                } else {
                    long j7 = j6 / 60;
                    if (j7 < 4) {
                        j3 = (j7 + 1) * 60;
                    }
                }
                return (j3 * 60000) - j4;
            }
        }
        Calendar a = C5067f.m24119a(millis2);
        C5067f.m24103q(a);
        long timeInMillis = a.getTimeInMillis();
        Calendar a2 = C5067f.m24119a(millis);
        C5067f.m24103q(a2);
        int days = (int) TimeUnit.MILLISECONDS.toDays(a2.getTimeInMillis() - timeInMillis);
        if (days != 0 && days != 1) {
            return -1L;
        }
        a2.add(5, 1);
        C5067f.m24103q(a2);
        return Math.max(-1L, a2.getTimeInMillis() - millis);
    }

    public static boolean m27965L1(String str) {
        return m27906a0().equals(str);
    }

    public static String m27964L2(float f) {
        return m27960M2(f, R.string.location_Nearby, R.string.location_AwayMeters, R.string.location_AwayKilometers);
    }

    public static int m27963M() {
        String q1 = m27837q1(null, R.string.language_code, false);
        if (f14575a == 0 || !q1.equals(f14576b)) {
            f14575a = m27904a2(q1);
            f14576b = q1;
        }
        return f14575a;
    }

    public static long m27962M0(long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2, boolean z, int i) {
        long j3;
        long millis = timeUnit2.toMillis(j2);
        long millis2 = timeUnit.toMillis(j);
        if (z) {
            long j4 = millis2 - millis;
            long seconds = TimeUnit.MILLISECONDS.toSeconds(j4);
            if (seconds >= -300) {
                long j5 = i;
                if (seconds < j5) {
                    return TimeUnit.SECONDS.toMillis(j5) - j4;
                }
                if (seconds < 60) {
                    return 1000 - (j4 % 1000);
                }
                long j6 = seconds / 60;
                if (j6 < 60) {
                    j3 = j6 + 1;
                } else {
                    long j7 = j6 / 60;
                    if (j7 < 4) {
                        j3 = (j7 + 1) * 60;
                    }
                }
                return (j3 * 60000) - j4;
            }
        }
        Calendar a = C5067f.m24119a(millis2);
        C5067f.m24103q(a);
        long timeInMillis = a.getTimeInMillis();
        Calendar a2 = C5067f.m24119a(millis);
        C5067f.m24103q(a2);
        int days = (int) TimeUnit.MILLISECONDS.toDays(timeInMillis - a2.getTimeInMillis());
        if (days != 0 && days != 1) {
            return -1L;
        }
        a2.add(5, 1);
        C5067f.m24103q(a2);
        return Math.max(-1L, a2.getTimeInMillis() - millis);
    }

    public static boolean m27961M1(char c) {
        return c == 'd' || c == 'D';
    }

    public static String m27960M2(float f, int i, int i2, int i3) {
        if (f < 10.0f) {
            return m27869i1(i);
        }
        float round = Math.round(f);
        float f2 = round - (round % 10.0f);
        if (f2 < 1000.0f) {
            return m27865j1(i2, String.valueOf((int) f2));
        }
        int floor = (int) Math.floor(f2 / 1000.0f);
        int i4 = ((int) (f2 - (floor * 1000.0f))) / 100;
        StringBuilder sb2 = new StringBuilder(C1363c0.m37437f(floor));
        if (i4 != 0 && floor < 1000) {
            sb2.append(m27830s0());
            sb2.append(i4);
        }
        return m27865j1(i3, sb2.toString());
    }

    public static boolean m27959N(String str, TdApi.LanguagePackInfo languagePackInfo) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 3109:
                if (str.equals("af")) {
                    c = 0;
                    break;
                }
                break;
            case 3116:
                if (str.equals("am")) {
                    c = 1;
                    break;
                }
                break;
            case 3121:
                if (str.equals("ar")) {
                    c = 2;
                    break;
                }
                break;
            case 3122:
                if (str.equals("as")) {
                    c = 3;
                    break;
                }
                break;
            case 3129:
                if (str.equals("az")) {
                    c = 4;
                    break;
                }
                break;
            case 3139:
                if (str.equals("be")) {
                    c = 5;
                    break;
                }
                break;
            case 3141:
                if (str.equals("bg")) {
                    c = 6;
                    break;
                }
                break;
            case 3148:
                if (str.equals("bn")) {
                    c = 7;
                    break;
                }
                break;
            case 3152:
                if (str.equals("br")) {
                    c = '\b';
                    break;
                }
                break;
            case 3153:
                if (str.equals("bs")) {
                    c = '\t';
                    break;
                }
                break;
            case 3166:
                if (str.equals("ca")) {
                    c = '\n';
                    break;
                }
                break;
            case 3167:
                if (str.equals("cb")) {
                    c = 11;
                    break;
                }
                break;
            case 3180:
                if (str.equals("co")) {
                    c = '\f';
                    break;
                }
                break;
            case 3184:
                if (str.equals("cs")) {
                    c = '\r';
                    break;
                }
                break;
            case 3189:
                if (str.equals("cx")) {
                    c = 14;
                    break;
                }
                break;
            case 3190:
                if (str.equals("cy")) {
                    c = 15;
                    break;
                }
                break;
            case 3197:
                if (str.equals("da")) {
                    c = 16;
                    break;
                }
                break;
            case 3201:
                if (str.equals("de")) {
                    c = 17;
                    break;
                }
                break;
            case 3239:
                if (str.equals("el")) {
                    c = 18;
                    break;
                }
                break;
            case 3241:
                if (str.equals("en")) {
                    c = 19;
                    break;
                }
                break;
            case 3246:
                if (str.equals("es")) {
                    c = 20;
                    break;
                }
                break;
            case 3247:
                if (str.equals("et")) {
                    c = 21;
                    break;
                }
                break;
            case 3248:
                if (str.equals("eu")) {
                    c = 22;
                    break;
                }
                break;
            case 3259:
                if (str.equals("fa")) {
                    c = 23;
                    break;
                }
                break;
            case 3264:
                if (str.equals("ff")) {
                    c = 24;
                    break;
                }
                break;
            case 3267:
                if (str.equals("fi")) {
                    c = 25;
                    break;
                }
                break;
            case 3273:
                if (str.equals("fo")) {
                    c = 26;
                    break;
                }
                break;
            case 3276:
                if (str.equals("fr")) {
                    c = 27;
                    break;
                }
                break;
            case 3283:
                if (str.equals("fy")) {
                    c = 28;
                    break;
                }
                break;
            case 3290:
                if (str.equals("ga")) {
                    c = 29;
                    break;
                }
                break;
            case 3301:
                if (str.equals("gl")) {
                    c = 30;
                    break;
                }
                break;
            case 3303:
                if (str.equals("gn")) {
                    c = 31;
                    break;
                }
                break;
            case 3310:
                if (str.equals("gu")) {
                    c = ' ';
                    break;
                }
                break;
            case 3321:
                if (str.equals("ha")) {
                    c = '!';
                    break;
                }
                break;
            case 3325:
                if (str.equals("he")) {
                    c = '\"';
                    break;
                }
                break;
            case 3329:
                if (str.equals("hi")) {
                    c = '#';
                    break;
                }
                break;
            case 3338:
                if (str.equals("hr")) {
                    c = '$';
                    break;
                }
                break;
            case 3340:
                if (str.equals("ht")) {
                    c = '%';
                    break;
                }
                break;
            case 3341:
                if (str.equals("hu")) {
                    c = '&';
                    break;
                }
                break;
            case 3345:
                if (str.equals("hy")) {
                    c = '\'';
                    break;
                }
                break;
            case 3355:
                if (str.equals("id")) {
                    c = '(';
                    break;
                }
                break;
            case 3370:
                if (str.equals("is")) {
                    c = ')';
                    break;
                }
                break;
            case 3371:
                if (str.equals("it")) {
                    c = '*';
                    break;
                }
                break;
            case 3383:
                if (str.equals("ja")) {
                    c = '+';
                    break;
                }
                break;
            case 3404:
                if (str.equals("jv")) {
                    c = ',';
                    break;
                }
                break;
            case 3414:
                if (str.equals("ka")) {
                    c = '-';
                    break;
                }
                break;
            case 3424:
                if (str.equals("kk")) {
                    c = '.';
                    break;
                }
                break;
            case 3426:
                if (str.equals("km")) {
                    c = '/';
                    break;
                }
                break;
            case 3427:
                if (str.equals("kn")) {
                    c = '0';
                    break;
                }
                break;
            case 3428:
                if (str.equals("ko")) {
                    c = '1';
                    break;
                }
                break;
            case 3434:
                if (str.equals("ku")) {
                    c = '2';
                    break;
                }
                break;
            case 3438:
                if (str.equals("ky")) {
                    c = '3';
                    break;
                }
                break;
            case 3459:
                if (str.equals("lo")) {
                    c = '4';
                    break;
                }
                break;
            case 3464:
                if (str.equals("lt")) {
                    c = '5';
                    break;
                }
                break;
            case 3466:
                if (str.equals("lv")) {
                    c = '6';
                    break;
                }
                break;
            case 3482:
                if (str.equals("mg")) {
                    c = '7';
                    break;
                }
                break;
            case 3486:
                if (str.equals("mk")) {
                    c = '8';
                    break;
                }
                break;
            case 3487:
                if (str.equals("ml")) {
                    c = '9';
                    break;
                }
                break;
            case 3489:
                if (str.equals("mn")) {
                    c = ':';
                    break;
                }
                break;
            case 3493:
                if (str.equals("mr")) {
                    c = ';';
                    break;
                }
                break;
            case 3494:
                if (str.equals("ms")) {
                    c = '<';
                    break;
                }
                break;
            case 3495:
                if (str.equals("mt")) {
                    c = '=';
                    break;
                }
                break;
            case 3500:
                if (str.equals("my")) {
                    c = '>';
                    break;
                }
                break;
            case 3508:
                if (str.equals("nb")) {
                    c = '?';
                    break;
                }
                break;
            case 3511:
                if (str.equals("ne")) {
                    c = '@';
                    break;
                }
                break;
            case 3518:
                if (str.equals("nl")) {
                    c = 'A';
                    break;
                }
                break;
            case 3520:
                if (str.equals("nn")) {
                    c = 'B';
                    break;
                }
                break;
            case 3555:
                if (str.equals("or")) {
                    c = 'C';
                    break;
                }
                break;
            case 3569:
                if (str.equals("pa")) {
                    c = 'D';
                    break;
                }
                break;
            case 3580:
                if (str.equals("pl")) {
                    c = 'E';
                    break;
                }
                break;
            case 3587:
                if (str.equals("ps")) {
                    c = 'F';
                    break;
                }
                break;
            case 3588:
                if (str.equals("pt")) {
                    c = 'G';
                    break;
                }
                break;
            case 3645:
                if (str.equals("ro")) {
                    c = 'H';
                    break;
                }
                break;
            case 3651:
                if (str.equals("ru")) {
                    c = 'I';
                    break;
                }
                break;
            case 3653:
                if (str.equals("rw")) {
                    c = 'J';
                    break;
                }
                break;
            case 3664:
                if (str.equals("sc")) {
                    c = 'K';
                    break;
                }
                break;
            case 3670:
                if (str.equals("si")) {
                    c = 'L';
                    break;
                }
                break;
            case 3672:
                if (str.equals("sk")) {
                    c = 'M';
                    break;
                }
                break;
            case 3673:
                if (str.equals("sl")) {
                    c = 'N';
                    break;
                }
                break;
            case 3675:
                if (str.equals("sn")) {
                    c = 'O';
                    break;
                }
                break;
            case 3676:
                if (str.equals("so")) {
                    c = 'P';
                    break;
                }
                break;
            case 3678:
                if (str.equals("sq")) {
                    c = 'Q';
                    break;
                }
                break;
            case 3679:
                if (str.equals("sr")) {
                    c = 'R';
                    break;
                }
                break;
            case 3683:
                if (str.equals("sv")) {
                    c = 'S';
                    break;
                }
                break;
            case 3684:
                if (str.equals("sw")) {
                    c = 'T';
                    break;
                }
                break;
            case 3687:
                if (str.equals("sz")) {
                    c = 'U';
                    break;
                }
                break;
            case 3693:
                if (str.equals("ta")) {
                    c = 'V';
                    break;
                }
                break;
            case 3697:
                if (str.equals("te")) {
                    c = 'W';
                    break;
                }
                break;
            case 3699:
                if (str.equals("tg")) {
                    c = 'X';
                    break;
                }
                break;
            case 3700:
                if (str.equals("th")) {
                    c = 'Y';
                    break;
                }
                break;
            case 3704:
                if (str.equals("tl")) {
                    c = 'Z';
                    break;
                }
                break;
            case 3710:
                if (str.equals("tr")) {
                    c = '[';
                    break;
                }
                break;
            case 3718:
                if (str.equals("tz")) {
                    c = '\\';
                    break;
                }
                break;
            case 3734:
                if (str.equals("uk")) {
                    c = ']';
                    break;
                }
                break;
            case 3741:
                if (str.equals("ur")) {
                    c = '^';
                    break;
                }
                break;
            case 3749:
                if (str.equals("uz")) {
                    c = '_';
                    break;
                }
                break;
            case 3763:
                if (str.equals("vi")) {
                    c = '`';
                    break;
                }
                break;
            case 3886:
                if (str.equals("zh")) {
                    c = 'a';
                    break;
                }
                break;
            case 3904:
                if (str.equals("zz")) {
                    c = 'b';
                    break;
                }
                break;
            case 92666319:
                if (str.equals("af-ZA")) {
                    c = 'c';
                    break;
                }
                break;
            case 92874224:
                if (str.equals("am-ET")) {
                    c = 'd';
                    break;
                }
                break;
            case 93023053:
                if (str.equals("ar-AR")) {
                    c = 'e';
                    break;
                }
                break;
            case 93053088:
                if (str.equals("as-IN")) {
                    c = 'f';
                    break;
                }
                break;
            case 93261389:
                if (str.equals("az-AZ")) {
                    c = 'g';
                    break;
                }
                break;
            case 93559329:
                if (str.equals("be-BY")) {
                    c = 'h';
                    break;
                }
                break;
            case 93618893:
                if (str.equals("bg-BG")) {
                    c = 'i';
                    break;
                }
                break;
            case 93827654:
                if (str.equals("bn-IN")) {
                    c = 'j';
                    break;
                }
                break;
            case 93946729:
                if (str.equals("br-FR")) {
                    c = 'k';
                    break;
                }
                break;
            case 93976379:
                if (str.equals("bs-BA")) {
                    c = 'l';
                    break;
                }
                break;
            case 94363773:
                if (str.equals("ca-ES")) {
                    c = 'm';
                    break;
                }
                break;
            case 94393686:
                if (str.equals("cb-IQ")) {
                    c = 'n';
                    break;
                }
                break;
            case 94780877:
                if (str.equals("co-FR")) {
                    c = 'o';
                    break;
                }
                break;
            case 94899956:
                if (str.equals("cs-CZ")) {
                    c = 'p';
                    break;
                }
                break;
            case 95049296:
                if (str.equals("cx-PH")) {
                    c = 'q';
                    break;
                }
                break;
            case 95078802:
                if (str.equals("cy-GB")) {
                    c = 'r';
                    break;
                }
                break;
            case 95287255:
                if (str.equals("da-DK")) {
                    c = 's';
                    break;
                }
                break;
            case 95406413:
                if (str.equals("de-DE")) {
                    c = 't';
                    break;
                }
                break;
            case 96538577:
                if (str.equals("el-GR")) {
                    c = 'u';
                    break;
                }
                break;
            case 96598143:
                if (str.equals("en-GB")) {
                    c = 'v';
                    break;
                }
                break;
            case 96598594:
                if (str.equals("en-US")) {
                    c = 'w';
                    break;
                }
                break;
            case 96747053:
                if (str.equals("es-ES")) {
                    c = 'x';
                    break;
                }
                break;
            case 96747252:
                if (str.equals("es-LA")) {
                    c = 'y';
                    break;
                }
                break;
            case 96776830:
                if (str.equals("et-EE")) {
                    c = 'z';
                    break;
                }
                break;
            case 96806635:
                if (str.equals("eu-ES")) {
                    c = '{';
                    break;
                }
                break;
            case 97134459:
                if (str.equals("fa-IR")) {
                    c = '|';
                    break;
                }
                break;
            case 97283558:
                if (str.equals("ff-NG")) {
                    c = '}';
                    break;
                }
                break;
            case 97372685:
                if (str.equals("fi-FI")) {
                    c = '~';
                    break;
                }
                break;
            case 97551437:
                if (str.equals("fo-FO")) {
                    c = 127;
                    break;
                }
                break;
            case 97640703:
                if (str.equals("fr-CA")) {
                    c = 128;
                    break;
                }
                break;
            case 97640813:
                if (str.equals("fr-FR")) {
                    c = 129;
                    break;
                }
                break;
            case 97849592:
                if (str.equals("fy-NL")) {
                    c = 130;
                    break;
                }
                break;
            case 98057967:
                if (str.equals("ga-IE")) {
                    c = 131;
                    break;
                }
                break;
            case 98385558:
                if (str.equals("gl-ES")) {
                    c = 132;
                    break;
                }
                break;
            case 98445487:
                if (str.equals("gn-PY")) {
                    c = 133;
                    break;
                }
                break;
            case 98653796:
                if (str.equals("gu-IN")) {
                    c = 134;
                    break;
                }
                break;
            case 98981645:
                if (str.equals("ha-NG")) {
                    c = 135;
                    break;
                }
                break;
            case 99100659:
                if (str.equals("he-IL")) {
                    c = 136;
                    break;
                }
                break;
            case 99219825:
                if (str.equals("hi-IN")) {
                    c = 137;
                    break;
                }
                break;
            case 99487917:
                if (str.equals("hr-HR")) {
                    c = 138;
                    break;
                }
                break;
            case 99547501:
                if (str.equals("ht-HT")) {
                    c = 139;
                    break;
                }
                break;
            case 99577293:
                if (str.equals("hu-HU")) {
                    c = 140;
                    break;
                }
                break;
            case 99696232:
                if (str.equals("hy-AM")) {
                    c = 141;
                    break;
                }
                break;
            case 99994381:
                if (str.equals("id-ID")) {
                    c = 142;
                    break;
                }
                break;
            case 100441261:
                if (str.equals("is-IS")) {
                    c = 143;
                    break;
                }
                break;
            case 100471053:
                if (str.equals("it-IT")) {
                    c = 144;
                    break;
                }
                break;
            case 100828572:
                if (str.equals("ja-JP")) {
                    c = 145;
                    break;
                }
                break;
            case 100828606:
                if (str.equals("ja-KS")) {
                    c = 146;
                    break;
                }
                break;
            case 101454140:
                if (str.equals("jv-ID")) {
                    c = 147;
                    break;
                }
                break;
            case 101751989:
                if (str.equals("ka-GE")) {
                    c = 148;
                    break;
                }
                break;
            case 102050044:
                if (str.equals("kk-KZ")) {
                    c = 149;
                    break;
                }
                break;
            case 102109608:
                if (str.equals("km-KH")) {
                    c = 150;
                    break;
                }
                break;
            case 102139343:
                if (str.equals("kn-IN")) {
                    c = 151;
                    break;
                }
                break;
            case 102169200:
                if (str.equals("ko-KR")) {
                    c = 152;
                    break;
                }
                break;
            case 102348225:
                if (str.equals("ku-TR")) {
                    c = 153;
                    break;
                }
                break;
            case 102467099:
                if (str.equals("ky-KG")) {
                    c = 154;
                    break;
                }
                break;
            case 103092735:
                if (str.equals("lo-LA")) {
                    c = 155;
                    break;
                }
                break;
            case 103241709:
                if (str.equals("lt-LT")) {
                    c = 156;
                    break;
                }
                break;
            case 103301293:
                if (str.equals("lv-LV")) {
                    c = 157;
                    break;
                }
                break;
            case 103777965:
                if (str.equals("mg-MG")) {
                    c = 158;
                    break;
                }
                break;
            case 103897133:
                if (str.equals("mk-MK")) {
                    c = 159;
                    break;
                }
                break;
            case 103926803:
                if (str.equals("ml-IN")) {
                    c = 160;
                    break;
                }
                break;
            case 103986509:
                if (str.equals("mn-MN")) {
                    c = 161;
                    break;
                }
                break;
            case 104105549:
                if (str.equals("mr-IN")) {
                    c = 162;
                    break;
                }
                break;
            case 104135475:
                if (str.equals("ms-MY")) {
                    c = 163;
                    break;
                }
                break;
            case 104165261:
                if (str.equals("mt-MT")) {
                    c = 164;
                    break;
                }
                break;
            case 104314209:
                if (str.equals("my-MM")) {
                    c = 165;
                    break;
                }
                break;
            case 104552570:
                if (str.equals("nb-NO")) {
                    c = 166;
                    break;
                }
                break;
            case 104641944:
                if (str.equals("ne-NP")) {
                    c = 167;
                    break;
                }
                break;
            case 104850098:
                if (str.equals("nl-BE")) {
                    c = 168;
                    break;
                }
                break;
            case 104850477:
                if (str.equals("nl-NL")) {
                    c = 169;
                    break;
                }
                break;
            case 104910062:
                if (str.equals("nn-NO")) {
                    c = 170;
                    break;
                }
                break;
            case 105952591:
                if (str.equals("or-IN")) {
                    c = 171;
                    break;
                }
                break;
            case 106369665:
                if (str.equals("pa-IN")) {
                    c = 172;
                    break;
                }
                break;
            case 106697581:
                if (str.equals("pl-PL")) {
                    c = 173;
                    break;
                }
                break;
            case 106905647:
                if (str.equals("ps-AF")) {
                    c = 174;
                    break;
                }
                break;
            case 106935481:
                if (str.equals("pt-BR")) {
                    c = 175;
                    break;
                }
                break;
            case 106935917:
                if (str.equals("pt-PT")) {
                    c = 176;
                    break;
                }
                break;
            case 108634061:
                if (str.equals("ro-RO")) {
                    c = 177;
                    break;
                }
                break;
            case 108812813:
                if (str.equals("ru-RU")) {
                    c = 178;
                    break;
                }
                break;
            case 108872397:
                if (str.equals("rw-RW")) {
                    c = 179;
                    break;
                }
                break;
            case 109199816:
                if (str.equals("sc-IT")) {
                    c = 180;
                    break;
                }
                break;
            case 109378646:
                if (str.equals("si-LK")) {
                    c = 181;
                    break;
                }
                break;
            case 109438445:
                if (str.equals("sk-SK")) {
                    c = 182;
                    break;
                }
                break;
            case 109468234:
                if (str.equals("sl-SI")) {
                    c = 183;
                    break;
                }
                break;
            case 109528047:
                if (str.equals("sn-ZW")) {
                    c = 184;
                    break;
                }
                break;
            case 109557613:
                if (str.equals("so-SO")) {
                    c = 185;
                    break;
                }
                break;
            case 109616634:
                if (str.equals("sq-AL")) {
                    c = 186;
                    break;
                }
                break;
            case 109646959:
                if (str.equals("sr-RS")) {
                    c = 187;
                    break;
                }
                break;
            case 109766140:
                if (str.equals("sv-SE")) {
                    c = 188;
                    break;
                }
                break;
            case 109795683:
                if (str.equals("sw-KE")) {
                    c = 189;
                    break;
                }
                break;
            case 109885218:
                if (str.equals("sz-PL")) {
                    c = 190;
                    break;
                }
                break;
            case 110063749:
                if (str.equals("ta-IN")) {
                    c = 191;
                    break;
                }
                break;
            case 110182913:
                if (str.equals("te-IN")) {
                    c = 192;
                    break;
                }
                break;
            case 110242832:
                if (str.equals("tg-TJ")) {
                    c = 193;
                    break;
                }
                break;
            case 110272621:
                if (str.equals("th-TH")) {
                    c = 194;
                    break;
                }
                break;
            case 110391661:
                if (str.equals("tl-PH")) {
                    c = 195;
                    break;
                }
                break;
            case 110570541:
                if (str.equals("tr-TR")) {
                    c = 196;
                    break;
                }
                break;
            case 110808635:
                if (str.equals("tz-MA")) {
                    c = 197;
                    break;
                }
                break;
            case 111285539:
                if (str.equals("uk-UA")) {
                    c = 198;
                    break;
                }
                break;
            case 111493931:
                if (str.equals("ur-PK")) {
                    c = 199;
                    break;
                }
                break;
            case 111732429:
                if (str.equals("uz-UZ")) {
                    c = 200;
                    break;
                }
                break;
            case 112149522:
                if (str.equals("vi-VN")) {
                    c = 201;
                    break;
                }
                break;
            case 115813226:
                if (str.equals("zh-CN")) {
                    c = 202;
                    break;
                }
                break;
            case 115813378:
                if (str.equals("zh-HK")) {
                    c = 203;
                    break;
                }
                break;
            case 115813762:
                if (str.equals("zh-TW")) {
                    c = 204;
                    break;
                }
                break;
            case 116349995:
                if (str.equals("zz-TR")) {
                    c = 205;
                    break;
                }
                break;
        }
        switch (c) {
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
            case C3563j.f11927F0:
                languagePackInfo.name = "Welsh";
                languagePackInfo.nativeName = "Cymraeg";
                return true;
            case 16:
            case C3563j.f11932G0:
                languagePackInfo.name = "Danish";
                languagePackInfo.nativeName = "Dansk";
                return true;
            case 17:
            case C3563j.f11937H0:
                languagePackInfo.name = "German";
                languagePackInfo.nativeName = "Deutsch";
                return true;
            case 18:
            case C3563j.f11942I0:
                languagePackInfo.name = "Greek";
                languagePackInfo.nativeName = "Ελληνικά";
                return true;
            case 19:
                languagePackInfo.name = "English";
                languagePackInfo.nativeName = "English";
                return true;
            case 20:
            case C3563j.f11962M0:
                languagePackInfo.name = "Spanish";
                languagePackInfo.nativeName = "Español";
                return true;
            case 21:
            case C3563j.f11967N0:
                languagePackInfo.name = "Estonian";
                languagePackInfo.nativeName = "Eesti";
                return true;
            case 22:
            case C3563j.f11972O0:
                languagePackInfo.name = "Basque";
                languagePackInfo.nativeName = "Euskara";
                return true;
            case 23:
            case C3563j.f11977P0:
                languagePackInfo.name = "Persian";
                languagePackInfo.nativeName = "فارسی";
                return true;
            case C3563j.f11955K3:
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
            case C3563j.f11980P3:
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
            case C3563j.f11922E0:
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
            case C3563j.f11947J0:
                languagePackInfo.name = "English (UK)";
                languagePackInfo.nativeName = "English (UK)";
                return true;
            case C3563j.f11952K0:
                languagePackInfo.name = "English (US)";
                languagePackInfo.nativeName = "English (US)";
                return true;
            case C3563j.f11957L0:
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

    public static String m27958N0(int i) {
        if (i == 1) {
            return m27869i1(R.string.CategoryPrivate);
        }
        if (i == 2) {
            return m27869i1(R.string.CategoryGroup);
        }
        if (i == 3) {
            return m27869i1(R.string.CategoryChannels);
        }
        if (i == 4) {
            return m27869i1(R.string.CategorySecret);
        }
        throw new IllegalArgumentException("category == " + i);
    }

    public static boolean m27957N1() {
        return m27824t2() == 25971;
    }

    public static String m27956N2(float f) {
        return m27960M2(f, R.string.location_personNearby, R.string.location_personAwayMeters, R.string.location_personAwayKilometers);
    }

    public static String m27955O(String str) {
        if (!m27957N1()) {
            return str;
        }
        String replace = str.replace('.', ' ');
        int length = replace.length();
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = replace.charAt(i4);
            if (!C5070i.m24058l(charAt)) {
                if (charAt != ' ' || (i2 = i2 + 1) > 1) {
                    break;
                }
                i3 = i4;
            } else {
                i++;
            }
        }
        if (!(i == 4 && i2 == 1 && i3 != -1)) {
            return replace;
        }
        return replace.substring(0, i3) + replace.substring(i3 + 1);
    }

    public static CharSequence m27954O0(long j, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        CharSequence charSequence;
        CharSequence k0;
        if (z4 && z5) {
            k0 = m27862k0(R.string.format_notificationTitlePinned, str);
        } else if (i > 1 || z4) {
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[1] = m27844o2(z4 ? R.string.mentionCount : R.string.messagesCount, i);
            k0 = m27862k0(R.string.format_notificationTitleShort, objArr);
        } else if (C5070i.m24061i(str)) {
            k0 = C7316a.m17046o(j);
        } else {
            charSequence = str;
            return m27877g1(charSequence, true, z, z2, z3, z6, z7);
        }
        charSequence = k0;
        return m27877g1(charSequence, true, z, z2, z3, z6, z7);
    }

    public static boolean m27953O1(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public static String m27952O2(long j, int i, String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return DateFormat.getDateInstance(m27912Y2(i, true), m28003C()).format(C5067f.m24118b(j));
            } catch (Throwable unused) {
            }
        }
        try {
            return java.text.DateFormat.getDateInstance(m27912Y2(i, false), m28003C()).format(C5067f.m24118b(j));
        } catch (Throwable unused2) {
            return m28007B(str, j);
        }
    }

    public static String m27951P(int i, int... iArr) {
        if (iArr == null || iArr.length == 0) {
            return m27869i1(i);
        }
        Object[] objArr = new Object[iArr.length];
        int i2 = 0;
        for (int i3 : iArr) {
            i2++;
            objArr[i2] = m28011A(i, i3);
        }
        return m27865j1(i, objArr);
    }

    public static String m27950P0() {
        return m27869i1(R.string.OK);
    }

    public static boolean m27949P1() {
        return !m27860k2().startsWith("X");
    }

    public static String m27948P2(long j, int i, int i2, String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return DateFormat.getDateTimeInstance(m27912Y2(i, true), m27912Y2(i2, true), m28003C()).format(C5067f.m24118b(j));
            } catch (Throwable unused) {
            }
        }
        try {
            return java.text.DateFormat.getDateTimeInstance(m27912Y2(i, false), m27912Y2(i2, false), m28003C()).format(C5067f.m24118b(j));
        } catch (Throwable unused2) {
            return m28007B(str, j);
        }
    }

    public static String m27947Q(double d) {
        Locale C = C4868i.m24726c2().m24744a0() ? Locale.US : m28003C();
        synchronized (C4403w.class) {
            if (Build.VERSION.SDK_INT >= 24) {
                DecimalFormat decimalFormat = (DecimalFormat) f14577c;
                if (decimalFormat == null || f14578d != C) {
                    f14578d = C;
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(C);
                    if (m27957N1()) {
                        decimalFormatSymbols.setDecimalSeparator(',');
                        decimalFormatSymbols.setGroupingSeparator(' ');
                    }
                    if (decimalFormat != null) {
                        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
                    } else {
                        decimalFormat = new DecimalFormat("###,###.00", decimalFormatSymbols);
                        f14577c = decimalFormat;
                    }
                }
                return decimalFormat.format(d);
            }
            java.text.DecimalFormat decimalFormat2 = (java.text.DecimalFormat) f14577c;
            if (decimalFormat2 == null || f14578d != C) {
                f14578d = C;
                java.text.DecimalFormatSymbols decimalFormatSymbols2 = new java.text.DecimalFormatSymbols(C);
                if (m27957N1()) {
                    decimalFormatSymbols2.setDecimalSeparator(',');
                    decimalFormatSymbols2.setGroupingSeparator(' ');
                }
                if (decimalFormat2 != null) {
                    decimalFormat2.setDecimalFormatSymbols(decimalFormatSymbols2);
                } else {
                    decimalFormat2 = new java.text.DecimalFormat("###,###.00", decimalFormatSymbols2);
                    f14577c = decimalFormat2;
                }
            }
            return decimalFormat2.format(d);
        }
    }

    public static String m27946Q0(C10930q6 q6Var, TdApi.MessageSender messageSender, TdApi.Message message, boolean z) {
        String yb = messageSender != null ? q6Var.m2151yb(messageSender) : null;
        if (message != null) {
            String j2 = C4779t2.m25493j2(message);
            if (!z) {
                if (C5070i.m24061i(j2)) {
                    j2 = m27909Z1(C4779t2.m25717C(q6Var, message, true));
                }
                return m27865j1(R.string.format_pinned, j2);
            } else if (yb == null) {
                if (C5070i.m24061i(j2)) {
                    j2 = m27909Z1(C4779t2.m25717C(q6Var, message, true));
                }
                return m27865j1(R.string.NewPinnedMessage, j2);
            } else if (!C5070i.m24061i(j2)) {
                return m27865j1(R.string.ActionPinnedText, yb, j2);
            } else {
                int i = R.string.ActionPinnedNoText;
                switch (message.content.getConstructor()) {
                    case TdApi.MessageVenue.CONSTRUCTOR:
                        i = R.string.ActionPinnedGeo;
                        break;
                    case TdApi.MessagePhoto.CONSTRUCTOR:
                    case TdApi.MessageExpiredPhoto.CONSTRUCTOR:
                        i = R.string.ActionPinnedPhoto;
                        break;
                    case TdApi.MessageExpiredVideo.CONSTRUCTOR:
                    case TdApi.MessageVideo.CONSTRUCTOR:
                        i = R.string.ActionPinnedVideo;
                        break;
                    case TdApi.MessagePoll.CONSTRUCTOR:
                        if (((TdApi.MessagePoll) message.content).poll.type.getConstructor() != 657013913) {
                            i = R.string.ActionPinnedPoll;
                            break;
                        } else {
                            i = R.string.ActionPinnedQuiz;
                            break;
                        }
                    case TdApi.MessageContact.CONSTRUCTOR:
                        i = R.string.ActionPinnedContact;
                        break;
                    case TdApi.MessageGame.CONSTRUCTOR:
                        String w1 = C4779t2.m25403w1(((TdApi.MessageGame) message.content).game, true);
                        if (C5070i.m24061i(w1)) {
                            i = R.string.ActionPinnedGameNoName;
                            break;
                        } else {
                            return m27865j1(R.string.ActionPinnedGame, yb, w1);
                        }
                    case TdApi.MessageAudio.CONSTRUCTOR:
                        i = R.string.ActionPinnedMusic;
                        break;
                    case TdApi.MessageLocation.CONSTRUCTOR:
                        if (((TdApi.MessageLocation) message.content).livePeriod > 0) {
                            i = R.string.ActionPinnedGeoLive;
                            break;
                        }
                        i = R.string.ActionPinnedGeo;
                        break;
                    case TdApi.MessageVoiceNote.CONSTRUCTOR:
                        i = R.string.ActionPinnedVoice;
                        break;
                    case TdApi.MessageDocument.CONSTRUCTOR:
                        i = R.string.ActionPinnedFile;
                        break;
                    case TdApi.MessageVideoNote.CONSTRUCTOR:
                        i = R.string.ActionPinnedRound;
                        break;
                    case TdApi.MessageAnimation.CONSTRUCTOR:
                        i = R.string.ActionPinnedGif;
                        break;
                    case TdApi.MessageSticker.CONSTRUCTOR:
                        i = R.string.ActionPinnedSticker;
                        break;
                }
                String i1 = m27869i1(i);
                int indexOf = i1.indexOf("**");
                int indexOf2 = indexOf != -1 ? i1.indexOf("**", indexOf + 2) : -1;
                if (indexOf == -1 || indexOf2 == -1) {
                    return m27865j1(i, yb);
                }
                String substring = i1.substring(indexOf + 2, indexOf2);
                return m27935T(i1.substring(0, indexOf) + "%2$s" + i1.substring(indexOf2 + 2), null, yb, substring).toString();
            }
        } else if (yb != null) {
            return m27865j1(R.string.NotificationActionPinnedNoTextChannel, yb);
        } else {
            return m27869i1(R.string.PinnedMessageChanged);
        }
    }

    public static boolean m27945Q1(char c) {
        return c == 'y' || c == 'Y';
    }

    public static String m27944Q2(long j, int i, String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return m28007B(m27856l2(((SimpleDateFormat) DateFormat.getDateInstance(m27912Y2(i, true), m28003C())).toPattern()), j);
            } catch (Throwable unused) {
            }
        }
        try {
            return m28007B(m27856l2(((java.text.SimpleDateFormat) java.text.DateFormat.getDateInstance(m27912Y2(i, false), m28003C())).toPattern()), j);
        } catch (Throwable unused2) {
            return m28007B(str, j);
        }
    }

    public static String m27943R(double d) {
        if (d % 1.0d == 0.0d) {
            return m27939S((long) d);
        }
        return m27947Q(d);
    }

    public static String m27942R0(TdApi.LanguagePackStringValuePluralized languagePackStringValuePluralized, int i) {
        if (i == 0) {
            return languagePackStringValuePluralized.zeroValue;
        }
        if (i == 1) {
            return languagePackStringValuePluralized.oneValue;
        }
        if (i == 2) {
            return languagePackStringValuePluralized.twoValue;
        }
        if (i == 3) {
            return languagePackStringValuePluralized.fewValue;
        }
        if (i == 4) {
            return languagePackStringValuePluralized.manyValue;
        }
        if (i == 5) {
            return languagePackStringValuePluralized.otherValue;
        }
        throw new UnsupportedOperationException("form == " + i);
    }

    public static AbstractC4409f m27941R1() {
        return C4400t.f14571a;
    }

    public static String m27940R2(long j, int i, String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return m28007B(m27852m2(((SimpleDateFormat) DateFormat.getDateInstance(m27912Y2(i, true), m28003C())).toPattern()), j);
            } catch (Throwable unused) {
            }
        }
        try {
            return m28007B(m27852m2(((java.text.SimpleDateFormat) java.text.DateFormat.getDateInstance(m27912Y2(i, false), m28003C())).toPattern()), j);
        } catch (Throwable unused2) {
            return m28007B(str, j);
        }
    }

    public static String m27939S(long j) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return m27955O(NumberFormat.getInstance(m28003C()).format(j));
            } catch (Throwable unused) {
            }
        }
        return m27955O(java.text.NumberFormat.getInstance(m28003C()).format(j));
    }

    public static C4408e m27938S0(int i) {
        switch (i) {
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
                return new C4408e(i).m27784a(1, 1).m27784a(5, 0, 10, 100, 1000);
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
                return new C4408e(i).m27784a(1, 0, 1).m27784a(5, 2, 100, 1000);
            case 24946:
                return new C4408e(i).m27784a(0, 0).m27784a(1, 1).m27784a(2, 2).m27784a(3, 3, 103, 1003).m27784a(4, 11, 111, 1011).m27784a(5, 100, 202, 1000);
            case 25189:
            case 25203:
            case 26738:
            case 29301:
            case 29544:
            case 29554:
            case 30059:
                return new C4408e(i).m27784a(1, 1, 21, 101, 1001).m27784a(3, 2, 22, 102, 1002).m27784a(4, 0, 5, 100, 1000).m27784a(5, new int[0]);
            case 25202:
                return new C4408e(i).m27784a(4, 1000000).m27784a(1, 1, 21, 101, 1001).m27784a(2, 2, 22, 102, 1002).m27784a(3, 3, 24, 103, 1003).m27784a(5, 0, 10, 100, 1000);
            case 25459:
            case 29547:
                return new C4408e(i).m27784a(1, 1).m27784a(3, 2, 3, 4).m27784a(5, 0, 10, 100);
            case 25465:
                return new C4408e(i).m27784a(2, 2).m27784a(3, 3).m27784a(0, 0).m27784a(1, 1).m27784a(4, 6).m27784a(5, 10);
            case 26214:
            case 26226:
            case 7037282:
                return new C4408e(i).m27784a(1, 0, 1).m27784a(5, 2, 17, 100, 1000);
            case 26465:
                return new C4408e(i).m27784a(1, 1).m27784a(2, 2).m27784a(3, 3, 6).m27784a(4, 7, 10).m27784a(5, 0, 11, 100, 1000);
            case 26468:
                return new C4408e(i).m27784a(1, 1, 11).m27784a(2, 2, 12).m27784a(3, 3, 13, 19).m27784a(5, 0, 24, 100, 1000);
            case 26486:
                return new C4408e(i).m27784a(1, 1, 11, 101, 1001).m27784a(5, 5, 55, 155);
            case 26725:
                return new C4408e(i).m27784a(2, 2).m27784a(1, 1).m27784a(4, 20, 100, 1000).m27784a(5, 0, 17, 10001);
            case 26997:
            case 27511:
            case 29541:
            case 7233905:
            case 7564641:
            case 7564649:
            case 7564650:
            case 7564654:
            case 7564659:
                return new C4408e(i).m27784a(1, 1).m27784a(2, 2).m27784a(5, 0, 3, 100, 1000);
            case 27764:
                return new C4408e(i).m27784a(1, 1, 21, 101, 1001).m27784a(3, 2, 22, 102, 1002).m27784a(5, 0, 10, 100, 1000);
            case 27766:
                return new C4408e(i).m27784a(0, 0, 20, 100, 1000).m27784a(1, 1, 21, 101, 1001).m27784a(5, 2, 22, 102, 1002);
            case 28011:
                return new C4408e(i).m27784a(1, 1, 21, 31).m27784a(5, 11, 105, 1008);
            case 28015:
            case 29295:
                return new C4408e(i).m27784a(1, 1).m27784a(3, 0, 2, 16).m27784a(5, 20, 100, 1000);
            case 28020:
                return new C4408e(i).m27784a(1, 1).m27784a(3, 0, 10, 102, 1002).m27784a(4, 11, 111, 1011).m27784a(5, 20, 100, 1000);
            case 28780:
                return new C4408e(i).m27784a(1, 1).m27784a(3, 2, 102, 1002).m27784a(4, 0, 5, 100, 1000).m27784a(5, new int[0]);
            case 29548:
                return new C4408e(i).m27784a(1, 1, 101, 1001).m27784a(2, 2, 102, 1002).m27784a(3, 3, 103, 1003).m27784a(5, 0, 5, 100, 1000);
            case 7041896:
                return new C4408e(i).m27784a(0, 0).m27784a(1, 1).m27784a(5, 10, 100);
            case 7102823:
                return new C4408e(i).m27784a(0, 0).m27784a(1, 1).m27784a(5, 2, 17, 100, 1000);
            case 7563369:
                return new C4408e(i).m27784a(3, 2, 10).m27784a(1, 0, 1).m27784a(5, 11, 100);
            case 7633517:
                return new C4408e(i).m27784a(1, 0, 1, 11).m27784a(5, 2, 24, 100);
            default:
                return new C4408e(i).m27784a(5, 1, 5, 100);
        }
    }

    public static String m27936S2(long j, int i, String str) {
        try {
            String language = m28003C().getLanguage();
            if (language.equals(Locale.getDefault().getLanguage())) {
                return DateUtils.formatDateRange(C1379j0.m37315n(), new Formatter(new StringBuilder(50), m28003C()), j, j, 1).toString();
            } else if (language.equals("en")) {
                return m28007B(str, j);
            } else {
                if (Build.VERSION.SDK_INT >= 24) {
                    try {
                        return DateFormat.getTimeInstance(m27912Y2(i, true), m28003C()).format(C5067f.m24118b(j));
                    } catch (Throwable unused) {
                    }
                }
                return java.text.DateFormat.getTimeInstance(m27912Y2(i, false), m28003C()).format(C5067f.m24118b(j));
            }
        } catch (Throwable unused2) {
            return m28007B(str, j);
        }
    }

    public static CharSequence m27935T(String str, AbstractC4409f fVar, Object... objArr) {
        return m27931U(str, m27973J1(objArr), fVar, objArr);
    }

    public static CharSequence m27934T0(TdApi.ChatSourcePublicServiceAnnouncement chatSourcePublicServiceAnnouncement, String str) {
        return m27813w1(R.string.PsaHideConfirm, chatSourcePublicServiceAnnouncement.type, str);
    }

    public static String m27932T2(long j, TimeUnit timeUnit) {
        return m27936S2(timeUnit.toMillis(j), 3, C1379j0.m37344X() ? "h:mm a" : "H:mm");
    }

    public static CharSequence m27931U(String str, boolean z, AbstractC4409f fVar, Object... objArr) {
        Object obj;
        int i;
        int i2;
        int i3;
        String str2;
        int i4;
        if (fVar == null && !z) {
            return String.format(m27913Y1(), str, objArr);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int g = C5070i.m24063g(spannableStringBuilder, "%", i5);
            if (g == -1) {
                return i7 > 0 ? spannableStringBuilder : spannableStringBuilder.toString();
            }
            int length = spannableStringBuilder.length();
            int i8 = g + 1;
            if (i8 != length) {
                char charAt = spannableStringBuilder.charAt(i8);
                if (charAt != '%') {
                    if (charAt == 'd' || charAt == 'f' || charAt == 's') {
                        i = i6 + 1;
                        Object obj2 = objArr[i6];
                        m27859l(charAt, obj2);
                        String valueOf = String.valueOf(obj2);
                        spannableStringBuilder.replace(g, g + 2, (CharSequence) valueOf);
                        i2 = valueOf.length() + g;
                        i3 = i6;
                        str2 = valueOf;
                        obj = obj2;
                    } else {
                        int i9 = i8;
                        int i10 = 0;
                        while (true) {
                            if (i9 >= length) {
                                break;
                            }
                            int i11 = i9 + 1;
                            char charAt2 = spannableStringBuilder.charAt(i9);
                            if (!C5070i.m24058l(charAt2)) {
                                i9 = i11;
                                charAt = charAt2;
                                break;
                            }
                            i10++;
                            i9 = i11;
                            charAt = charAt2;
                        }
                        if (i10 == 0) {
                            throw new IllegalArgumentException();
                        } else if (charAt != '$') {
                            throw new IllegalArgumentException();
                        } else if (i9 != length) {
                            int i12 = i9 + 1;
                            char charAt3 = spannableStringBuilder.charAt(i9);
                            int i13 = i10 + i8;
                            int parseInt = Integer.parseInt(spannableStringBuilder.subSequence(i8, i13).toString()) - 1;
                            Object obj3 = objArr[parseInt];
                            String valueOf2 = String.valueOf(obj3);
                            if (charAt3 == '0') {
                                int i14 = i12;
                                int i15 = 0;
                                while (i14 < length) {
                                    i14++;
                                    charAt3 = spannableStringBuilder.charAt(i14);
                                    if (!C5070i.m24058l(charAt3)) {
                                        break;
                                    }
                                    i15++;
                                }
                                if (i15 != 0) {
                                    m27859l(charAt3, obj3);
                                    int parseInt2 = Integer.parseInt(spannableStringBuilder.subSequence(i12, i12 + i15).toString());
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
                                    i4 = 1 + i15 + 1;
                                    str2 = valueOf2;
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else if (charAt3 == 'd' || charAt3 == 'f' || charAt3 == 's') {
                                m27859l(charAt3, obj3);
                                str2 = valueOf2;
                                i4 = 1;
                            } else {
                                throw new IllegalArgumentException();
                            }
                            spannableStringBuilder.replace(g, i13 + 1 + i4, (CharSequence) str2);
                            i2 = str2.length() + g;
                            i = i6;
                            i3 = parseInt;
                            obj = obj3;
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                    if (fVar != null) {
                        int length3 = g + str2.length();
                        Object a = fVar.mo379a(spannableStringBuilder, g, length3, i3, RunnableC5390g.m22983M0(str2));
                        if (a != null) {
                            spannableStringBuilder.setSpan(a, g, length3, 33);
                            i7++;
                            i5 = i2;
                            i6 = i;
                        }
                    }
                    if (obj instanceof Spanned) {
                        Spanned spanned = (Spanned) obj;
                        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
                        if (spans != null && spans.length > 0) {
                            for (Object obj4 : spans) {
                                spannableStringBuilder.setSpan(obj4, spanned.getSpanStart(obj4) + g, spanned.getSpanEnd(obj4) + g, 33);
                                i7++;
                            }
                        }
                    }
                    i5 = i2;
                    i6 = i;
                } else {
                    spannableStringBuilder.delete(g, i8);
                    i5 = i8;
                }
            } else {
                throw new IllegalArgumentException("Invalid specifier format: %");
            }
        }
    }

    public static CharSequence m27930U0(AbstractC10664f9 f9Var, String str, boolean z) {
        return C1363c0.m37425l(f9Var, m27813w1(z ? R.string.PsaChatInfo : R.string.PsaInfo, str, new Object[0]).toString(), null);
    }

    public static String m27928U2(Calendar calendar) {
        return m27932T2(calendar.getTimeInMillis(), TimeUnit.MILLISECONDS);
    }

    public static String m27927V(int i) {
        return C1379j0.m37315n().getResources().getString(i);
    }

    public static CharSequence m27926V0(AbstractC10664f9 f9Var, String str) {
        return C1363c0.m37425l(f9Var, m27813w1(R.string.PsaForward, str, new Object[0]).toString(), null);
    }

    public static int m27925V1(C4406c cVar, C4406c cVar2) {
        int d = C4405b.m27796d(cVar.f14592a);
        int d2 = C4405b.m27796d(cVar2.f14592a);
        if (d != d2) {
            return Integer.compare(d, d2);
        }
        return cVar.f14592a.key.compareTo(cVar2.f14592a.key);
    }

    public static String m27924V2(long j, TimeUnit timeUnit) {
        return m27920W2(C5067f.m24119a(timeUnit.toMillis(j)));
    }

    public static String m27923W(int i, Object... objArr) {
        return C1379j0.m37315n().getResources().getString(i, objArr);
    }

    public static String m27922W0(TdApi.ChatSourcePublicServiceAnnouncement chatSourcePublicServiceAnnouncement) {
        return m27813w1(R.string.PsaType, chatSourcePublicServiceAnnouncement.type, new Object[0]).toString();
    }

    public static String m27920W2(Calendar calendar) {
        int i = calendar.get(6);
        int i2 = calendar.get(1);
        Calendar e = C5067f.m24115e();
        if (e.get(6) == i && e.get(1) == i2) {
            return m27928U2(calendar);
        }
        int days = (int) TimeUnit.MILLISECONDS.toDays(C5067f.m24114f(e) - C5067f.m24114f(calendar));
        if (days <= 0 || days > 7) {
            return m27995E(calendar);
        }
        return m27893c3(calendar);
    }

    public static String m27919X(C10930q6 q6Var) {
        String j1 = m27865j1(R.string.AppNameAndVersion, "0.24.6.1506-arm64-v8a");
        if (q6Var == null || !q6Var.m2628U6()) {
            return j1;
        }
        return j1 + " (emulator)";
    }

    public static String m27918X0(long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2, boolean z, int i, int i2, boolean z2) {
        String str;
        if (z) {
            long seconds = timeUnit2.toSeconds(j2) - timeUnit.toSeconds(j);
            if (seconds >= -300) {
                if (seconds < i) {
                    return m27869i1(C4411y.m27780d(i2, 0));
                }
                if (seconds < 60) {
                    return m27844o2(C4411y.m27780d(i2, 1), (int) seconds);
                }
                long j3 = seconds / 60;
                if (j3 < 60) {
                    return m27844o2(C4411y.m27780d(i2, 2), (int) j3);
                }
                long j4 = j3 / 60;
                if (j4 < 4) {
                    return m27844o2(C4411y.m27780d(i2, 3), (int) j4);
                }
            }
        }
        Calendar a = C5067f.m24119a(timeUnit2.toMillis(j2));
        int i3 = a.get(1);
        int i4 = a.get(2);
        C5067f.m24103q(a);
        long timeInMillis = a.getTimeInMillis();
        Calendar a2 = C5067f.m24119a(timeUnit.toMillis(j));
        int i5 = a2.get(1);
        int i6 = a2.get(2);
        long f = C5067f.m24114f(a2);
        String T2 = m27932T2(j, timeUnit);
        int days = (int) TimeUnit.MILLISECONDS.toDays(timeInMillis - f);
        if (days == 0) {
            return m27865j1(C4411y.m27780d(i2, 4), T2);
        }
        if (days == 1) {
            return m27865j1(C4411y.m27780d(i2, 5), T2);
        }
        if (z2) {
            if (days < 14) {
                return m27844o2(C4411y.m27780d(i2, 21), days);
            }
            if (days < 30) {
                return m27844o2(C4411y.m27780d(i2, 22), days / 7);
            }
            int i7 = ((i3 - i5) * 12) + (i4 - i6);
            if (i7 < 12) {
                return m27844o2(C4411y.m27780d(i2, 23), i7);
            }
            return m27844o2(C4411y.m27780d(i2, 24), i7 / 12);
        } else if (days < 7) {
            return m27865j1(C4411y.m27780d(i2, 10), m27893c3(a2), T2);
        } else {
            if (i3 == i5) {
                str = m27991F(a2);
            } else {
                str = m27983H(a2);
            }
            return m27865j1(C4411y.m27780d(i2, 11), str, T2);
        }
    }

    public static boolean m27917X1(AbstractC10664f9 f9Var, long j, View view, C5132o oVar) {
        f9Var.mo4348c().m2485dd().m3429v7(f9Var, j, null);
        return true;
    }

    public static AbstractC5411l0[] m27916X2(CharSequence charSequence) {
        AbstractC5411l0[] l0VarArr;
        if (!(charSequence instanceof Spanned) || (l0VarArr = (AbstractC5411l0[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), AbstractC5411l0.class)) == null || l0VarArr.length <= 0) {
            return null;
        }
        return l0VarArr;
    }

    public static TdApi.LanguagePackInfo m27915Y() {
        String a0 = m27906a0();
        return m27876g2(a0, null, m27815w(a0), m27901b0());
    }

    public static String m27914Y0(long j, TimeUnit timeUnit, boolean z) {
        int seconds = (int) timeUnit.toSeconds(j);
        if (z && C5067f.m24112h(seconds)) {
            return m27869i1(R.string.PastWeek);
        }
        if (C5067f.m24105o(seconds)) {
            long j2 = seconds;
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            if (C5067f.m24107m(j2, timeUnit2)) {
                return m27869i1(R.string.Today);
            }
            if (C5067f.m24104p(j2, timeUnit2)) {
                return m27869i1(R.string.Yesterday);
            }
            return m27898b3(C5067f.m24119a(timeUnit2.toMillis(j2)));
        } else if (z) {
            return m27894c2(j, timeUnit);
        } else {
            if (C5067f.m24108l(j, timeUnit)) {
                return m27999D(j, timeUnit);
            }
            return m27987G(j, timeUnit);
        }
    }

    public static Locale m27913Y1() {
        return C4868i.m24726c2().m24758Y0().f16677c;
    }

    public static int m27912Y2(int i, boolean z) {
        if (Build.VERSION.SDK_INT < 24 || !z) {
            if (i == 1) {
                return 1;
            }
            if (i == 2) {
                return 2;
            }
            if (i == 3) {
                return 3;
            }
        } else if (i == 1) {
            return 1;
        } else {
            if (i == 2) {
                return 2;
            }
            if (i == 3) {
                return 3;
            }
        }
        throw new IllegalArgumentException("style == " + i);
    }

    public static String m27911Z() {
        String n = C5078d.m23998n(m27896c0(R.string.language_emoji));
        return n != null ? n : "🇧";
    }

    public static String m27910Z0(long j, TimeUnit timeUnit) {
        return m27900b1(j, timeUnit, false, 0);
    }

    public static String m27909Z1(String str) {
        return m27867j() ? str.toLowerCase() : str;
    }

    public static void m27908Z2(TdApi.UpdateLanguagePackStrings updateLanguagePackStrings) {
        boolean z;
        String k2 = m27860k2();
        boolean equals = updateLanguagePackStrings.languagePackId.equals(k2);
        if (equals || !updateLanguagePackStrings.languagePackId.equals(m27855m())) {
            z = false;
        } else {
            equals = true;
            z = true;
        }
        if (equals) {
            Object[] objArr = new Object[1];
            TdApi.LanguagePackString[] languagePackStringArr = updateLanguagePackStrings.strings;
            objArr[0] = Integer.valueOf(languagePackStringArr != null ? languagePackStringArr.length : 0);
            Log.m14719i("received updateLanguagePack, stringCount:%d", objArr);
            TdApi.LanguagePackString[] languagePackStringArr2 = updateLanguagePackStrings.strings;
            if (languagePackStringArr2 == null || languagePackStringArr2.length == 0 || languagePackStringArr2.length > 25) {
                m27975J();
                return;
            }
            String str = updateLanguagePackStrings.languagePackId;
            if (!z) {
                k2 = null;
            }
            m27971K(str, languagePackStringArr2, k2);
        }
    }

    public static String m27906a0() {
        return m27896c0(R.string.language_code);
    }

    public static String m27905a1(long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2, boolean z, int i) {
        return m27918X0(j, timeUnit, j2, timeUnit2, z, i, R.string.timestamp, false);
    }

    public static int m27904a2(String str) {
        String w = m27815w(str);
        int length = w.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i << 8) + w.charAt(i2);
        }
        return i;
    }

    public static void m27903a3(boolean z, int i, int i2) {
        String str = (z ? 1 : 0) + "_" + i + "_" + i2;
        Set<String> set = f14579e;
        if (set == null) {
            HashSet hashSet = new HashSet();
            f14579e = hashSet;
            hashSet.add(str);
        } else if (!set.contains(str)) {
            f14579e.add(str);
        } else {
            return;
        }
        Log.m14724e("Langpack fix required. languageCode: %s, entry: %s", Integer.toString(i, 16), m27885e1(i2));
    }

    public static boolean m27901b0() {
        return m28002C0(m27896c0(R.string.language_rtl)) == 1;
    }

    public static String m27900b1(long j, TimeUnit timeUnit, boolean z, int i) {
        return m27905a1(j, timeUnit, System.currentTimeMillis(), TimeUnit.MILLISECONDS, z, i);
    }

    public static String m27899b2(String str, String str2) {
        return str + "|" + str2;
    }

    public static String m27898b3(Calendar calendar) {
        return C5070i.m24073E(m28007B("cccc", calendar.getTimeInMillis()), m28003C());
    }

    public static String m27896c0(int i) {
        return m27837q1(null, i, false);
    }

    public static String m27895c1(long j, TimeUnit timeUnit) {
        return m27918X0(j, timeUnit, System.currentTimeMillis(), TimeUnit.MILLISECONDS, false, 0, R.string.timestampShort, false);
    }

    public static String m27894c2(long j, TimeUnit timeUnit) {
        return C5070i.m24073E(m27944Q2(timeUnit.toMillis(j), 1, "LLLL yyyy"), m28003C());
    }

    public static String m27893c3(Calendar calendar) {
        return m28007B("ccc", calendar.getTimeInMillis());
    }

    public static TdApi.LanguagePackStringValuePluralized m27891d0(String str, List<C4407d> list) {
        TdApi.LanguagePackStringValuePluralized languagePackStringValuePluralized = new TdApi.LanguagePackStringValuePluralized("", "", "", "", "", "");
        for (C4407d dVar : list) {
            int i = dVar.f14595a;
            if (i == 0) {
                languagePackStringValuePluralized.zeroValue = m27837q1(null, m27829s1(str + "_zero"), false);
            } else if (i == 1) {
                languagePackStringValuePluralized.oneValue = m27837q1(null, m27829s1(str + "_one"), false);
            } else if (i == 2) {
                languagePackStringValuePluralized.twoValue = m27837q1(null, m27829s1(str + "_two"), false);
            } else if (i == 3) {
                languagePackStringValuePluralized.fewValue = m27837q1(null, m27829s1(str + "_few"), false);
            } else if (i == 4) {
                languagePackStringValuePluralized.manyValue = m27837q1(null, m27829s1(str + "_many"), false);
            } else if (i == 5) {
                languagePackStringValuePluralized.otherValue = m27837q1(null, m27829s1(str + "_other"), false);
            } else {
                throw new IllegalArgumentException("form == " + dVar);
            }
        }
        return languagePackStringValuePluralized;
    }

    public static int[] m27890d1() {
        return new int[]{R.string.language_code, R.string.language_emoji, R.string.language_name, R.string.language_nameInEnglish, R.string.language_dateFormatLocale, R.string.language_continueInLanguage, R.string.language_continueInLanguagePopupText};
    }

    public static Object m27889d2(boolean z) {
        return C4779t2.m25399w5(new TdApi.TextEntityTypeBold(), null, z);
    }

    public static CharSequence m27888d3(CharSequence charSequence, AbstractC4409f fVar) {
        return fVar != null ? m27935T("%s", fVar, charSequence) : charSequence;
    }

    public static TdApi.LanguagePackStringValueOrdinary m27886e0(String str) {
        return new TdApi.LanguagePackStringValueOrdinary(m27837q1(null, m27829s1(str), false));
    }

    public static String m27885e1(int i) {
        try {
            return C1379j0.m37315n().getResources().getResourceEntryName(i);
        } catch (Throwable unused) {
            Log.m14724e("Unable to find resource entry name (shitty modified APK?)", new Object[0]);
            return "";
        }
    }

    public static Object m27884e2(boolean z) {
        return C4779t2.m25399w5(new TdApi.TextEntityTypeCode(), null, z);
    }

    public static TdApi.LanguagePackInfo m27882f0() {
        String g0 = m27878g0();
        if (C5070i.m24061i(g0) || g0.equals(m27906a0())) {
            return m27915Y();
        }
        String c0 = m27896c0(R.string.suggested_language_code_base);
        if (C5070i.m24061i(c0)) {
            c0 = null;
        }
        String c02 = m27896c0(R.string.suggested_language_code_plural);
        if (C5070i.m24061i(c02)) {
            c02 = m27815w(g0);
        }
        return m27876g2(g0, c0, c02, m27874h0());
    }

    public static CharSequence m27881f1(long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2, boolean z, int i, int i2, boolean z2) {
        String str;
        if (z) {
            long seconds = timeUnit.toSeconds(j) - timeUnit2.toSeconds(j2);
            if (seconds >= -300) {
                if (seconds < i) {
                    return m27853m1(C4411y.m27780d(i2, 0), new Object[0]);
                }
                if (seconds < 60) {
                    return m27836q2(C4411y.m27780d(i2, 1), (int) seconds);
                }
                long j3 = seconds / 60;
                if (j3 < 60) {
                    return m27836q2(C4411y.m27780d(i2, 2), (int) j3);
                }
                long j4 = j3 / 60;
                if (j4 < 4) {
                    return m27836q2(C4411y.m27780d(i2, 3), (int) j4);
                }
            }
        }
        Calendar a = C5067f.m24119a(timeUnit2.toMillis(j2));
        int i3 = a.get(1);
        int i4 = a.get(2);
        C5067f.m24103q(a);
        long timeInMillis = a.getTimeInMillis();
        Calendar a2 = C5067f.m24119a(timeUnit.toMillis(j));
        int i5 = a2.get(1);
        int i6 = a2.get(2);
        long f = C5067f.m24114f(a2);
        String T2 = m27932T2(j, timeUnit);
        int days = (int) TimeUnit.MILLISECONDS.toDays(f - timeInMillis);
        if (days == 0) {
            return m27853m1(C4411y.m27780d(i2, 4), T2);
        }
        if (days == 1) {
            return m27853m1(C4411y.m27780d(i2, 6), T2);
        }
        if (z2) {
            if (days < 14) {
                return m27836q2(C4411y.m27780d(i2, 21), days);
            }
            if (days < 30) {
                return m27836q2(C4411y.m27780d(i2, 22), days / 7);
            }
            int i7 = ((i5 - i3) * 12) + (i6 - i4);
            if (i7 < 12) {
                return m27836q2(C4411y.m27780d(i2, 23), i7);
            }
            return m27836q2(C4411y.m27780d(i2, 24), i7 / 12);
        } else if (days < 7) {
            return m27865j1(C4411y.m27780d(i2, 10), m27893c3(a2), T2);
        } else {
            if (i3 == i5) {
                str = m27991F(a2);
            } else {
                str = m27983H(a2);
            }
            return m27853m1(C4411y.m27780d(i2, 11), str, T2);
        }
    }

    public static Object m27880f2(boolean z) {
        return C4779t2.m25399w5(new TdApi.TextEntityTypeItalic(), null, z);
    }

    public static TdApi.LanguagePackStringValueDeleted m27879g() {
        if (f14586l == null) {
            synchronized (C4403w.class) {
                if (f14586l == null) {
                    f14586l = new TdApi.LanguagePackStringValueDeleted();
                }
            }
        }
        return f14586l;
    }

    public static String m27878g0() {
        String c0 = m27896c0(R.string.suggested_language_code);
        return C5070i.m24061i(c0) ? m27906a0() : c0;
    }

    public static CharSequence m27877g1(CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        if (z2 && z) {
            charSequence = m27869i1(R.string.Reminder);
        }
        if (z5 && !z2) {
            charSequence = m27862k0(z ? z4 ? R.string.format_notificationScheduledChannel : z3 ? R.string.format_notificationScheduledGroup : R.string.format_notificationScheduledPrivate : R.string.format_notificationScheduledText, charSequence);
        }
        if (!z6) {
            return charSequence;
        }
        return m27862k0(z ? R.string.format_notificationSilentTitle : R.string.format_notificationSilentText, charSequence);
    }

    public static TdApi.LanguagePackInfo m27876g2(String str, String str2, String str3, boolean z) {
        return new TdApi.LanguagePackInfo(str, str2, null, null, str3, false, z, false, false, 0, 0, 0, null);
    }

    public static void m27875h(AbstractC4404a aVar) {
        if (f14584j == null) {
            synchronized (C4403w.class) {
                if (f14584j == null) {
                    f14584j = new C6227d<>(true);
                }
            }
        }
        f14584j.add(aVar);
    }

    public static boolean m27874h0() {
        String c0 = m27896c0(R.string.suggested_language_rtl);
        return C5070i.m24061i(c0) ? m27901b0() : m28002C0(c0) == 1;
    }

    public static CharSequence m27873h1(int i, AbstractC4409f fVar, Object... objArr) {
        return m27841p1(null, i, true, 0, fVar, objArr);
    }

    public static C5132o m27872h2(final AbstractC10664f9 f9Var, final long j) {
        return C4779t2.m25406v5(new TdApi.TextEntityTypeMentionName(j)).m23845q(new C5132o.AbstractC5133a() {
            @Override
            public final boolean mo490a(View view, C5132o oVar) {
                boolean X1;
                X1 = C4403w.m27917X1(AbstractC10664f9.this, j, view, oVar);
                return X1;
            }
        });
    }

    public static int m27871i() {
        return m27984G2() ? 11 : 9;
    }

    public static TdApi.LanguagePackStringValue m27870i0(String str) {
        return m27835r().get(str);
    }

    public static String m27869i1(int i) {
        return m27837q1(null, i, true);
    }

    public static String m27868i2(String str) {
        if (str.startsWith("X")) {
            TdApi.LanguagePackStringValue M0 = C10536ab.m4776M0(C10536ab.m4812D0(), "language_code", str);
            if (M0 instanceof TdApi.LanguagePackStringValueOrdinary) {
                str = ((TdApi.LanguagePackStringValueOrdinary) M0).value;
            }
        }
        return m27815w(str);
    }

    public static boolean m27867j() {
        if (!f14580f) {
            m27819v(false);
        }
        return f14581g;
    }

    public static String m27866j0(int i) {
        if (i < 60) {
            return m27844o2(R.string.xSec, i);
        }
        int i2 = i / 60;
        if (i2 >= 60) {
            return C1363c0.m37433h(i);
        }
        int i3 = i % 60;
        return i3 == 0 ? m27844o2(R.string.xMin, i2) : m27865j1(R.string.format_minutesAndSeconds, m27844o2(R.string.xMin, i2), m27844o2(R.string.xSec, i3));
    }

    public static String m27865j1(int i, Object... objArr) {
        return m27862k0(i, objArr).toString();
    }

    public static int m27864j2(int i, long j) {
        int i2;
        int i3;
        switch (i) {
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
                return j == 1 ? 1 : 5;
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
                return (j < 0 || j > 1) ? 5 : 1;
            case 24946:
                if (j == 2) {
                    return 2;
                }
                if (j == 1) {
                    return 1;
                }
                if (j == 0) {
                    return 0;
                }
                long j2 = j % 100;
                if (j2 < 3 || j2 > 10) {
                    return (j2 < 11 || j2 > 99) ? 5 : 4;
                }
                return 3;
            case 25189:
            case 25203:
            case 26738:
            case 29301:
            case 29544:
            case 29554:
            case 30059:
                long j3 = j % 10;
                if (j3 == 1 && j % 100 != 11) {
                    return 1;
                }
                if (j3 >= 2 && j3 <= 4) {
                    long j4 = j % 100;
                    if (j4 < 12 || j4 > 14) {
                        return 3;
                    }
                }
                if (j3 != 0 && (j3 < 5 || j3 > 9)) {
                    long j5 = j % 100;
                    if (j5 < 11 || j5 > 14) {
                        return 5;
                    }
                }
                return 4;
            case 25202:
                if (j != 0 && j % 1000000 == 0) {
                    return 4;
                }
                long j6 = j % 10;
                if (j6 == 1) {
                    long j7 = j % 100;
                    if (!(j7 == 11 || j7 == 71 || j7 == 91)) {
                        return 1;
                    }
                }
                if (j6 == 2) {
                    long j8 = j % 100;
                    if (!(j8 == 12 || j8 == 72 || j8 == 92)) {
                        return 2;
                    }
                }
                if ((j6 < 3 || j6 > 4) && j6 != 9) {
                    return 5;
                }
                long j9 = j % 100;
                if (j9 >= 10 && j9 <= 19) {
                    return 5;
                }
                if (j9 < 70 || j9 > 79) {
                    return (j9 < 90 || j9 > 99) ? 3 : 5;
                }
                return 5;
            case 25459:
            case 29547:
                if (j == 1) {
                    return 1;
                }
                return (j < 2 || j > 4) ? 5 : 3;
            case 25465:
                if (j == 2) {
                    return 2;
                }
                if (j == 3) {
                    return 3;
                }
                if (j == 0) {
                    return 0;
                }
                if (j == 1) {
                    return 1;
                }
                return j == 6 ? 4 : 5;
            case 26214:
            case 26226:
            case 7037282:
                return (j < 0 || j > 2 || i2 == 0) ? 5 : 1;
            case 26465:
                if (j == 2) {
                    return 2;
                }
                if (j == 1) {
                    return 1;
                }
                if (j < 3 || j > 6) {
                    return (j < 7 || j > 10) ? 5 : 4;
                }
                return 3;
            case 26468:
                if (j == 2 || j == 12) {
                    return 2;
                }
                if (j == 1 || j == 11) {
                    return 1;
                }
                return ((j < 3 || j > 10) && (j < 13 || j > 19)) ? 5 : 3;
            case 26486:
                long j10 = j % 10;
                return ((j10 < 1 || j10 > 2) && j % 20 != 0) ? 5 : 1;
            case 26725:
                if (j == 2) {
                    return 2;
                }
                if (j == 1) {
                    return 1;
                }
                return (j == 0 || j % 10 != 0) ? 5 : 4;
            case 26997:
            case 27511:
            case 29541:
            case 7233905:
            case 7564641:
            case 7564649:
            case 7564650:
            case 7564654:
            case 7564659:
                if (j == 2) {
                    return 2;
                }
                return j == 1 ? 1 : 5;
            case 27764:
                long j11 = j % 10;
                if (j11 == 1) {
                    long j12 = j % 100;
                    if (j12 < 11 || j12 > 19) {
                        return 1;
                    }
                }
                if (j11 < 2 || j11 > 9) {
                    return 5;
                }
                long j13 = j % 100;
                return (j13 < 11 || j13 > 19) ? 3 : 5;
            case 27766:
                if (j == 0) {
                    return 0;
                }
                return (j % 10 != 1 || j % 100 == 11) ? 5 : 1;
            case 28011:
                return (j % 10 != 1 || j == 11) ? 5 : 1;
            case 28015:
            case 29295:
                int i4 = (j > 1L ? 1 : (j == 1L ? 0 : -1));
                if (i4 == 0) {
                    return 1;
                }
                if (j != 0) {
                    if (i4 == 0) {
                        return 5;
                    }
                    long j14 = j % 100;
                    if (j14 < 1 || j14 > 19) {
                        return 5;
                    }
                }
                return 3;
            case 28020:
                if (j == 1) {
                    return 1;
                }
                long j15 = j % 100;
                if (j15 < 11 || j15 > 19) {
                    return (j == 0 || (j15 >= 2 && j15 <= 10)) ? 3 : 5;
                }
                return 4;
            case 28780:
                int i5 = (j > 1L ? 1 : (j == 1L ? 0 : -1));
                if (i5 == 0) {
                    return 1;
                }
                long j16 = j % 10;
                if (j16 >= 2 && j16 <= 4) {
                    long j17 = j % 100;
                    if (j17 < 12 || j17 > 14) {
                        return 3;
                    }
                }
                if ((i5 == 0 || j16 < 0 || j16 > 1) && (j16 < 5 || j16 > 9)) {
                    long j18 = j % 100;
                    if (j18 < 12 || j18 > 14) {
                        return 5;
                    }
                }
                return 4;
            case 29548:
                long j19 = j % 100;
                if (j19 == 2) {
                    return 2;
                }
                if (j19 == 1) {
                    return 1;
                }
                return (j19 < 3 || j19 > 4) ? 5 : 3;
            case 7041896:
                if (j == 0) {
                    return 0;
                }
                return j == 1 ? 1 : 5;
            case 7102823:
                int i6 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i6 == 0) {
                    return 0;
                }
                return (i6 < 0 || j > 2 || i6 == 0 || i3 == 0) ? 5 : 1;
            case 7563369:
                if (j < 2 || j > 10) {
                    return (j < 0 || j > 1) ? 5 : 1;
                }
                return 3;
            case 7633517:
                return ((j < 0 || j > 1) && (j < 11 || j > 99)) ? 5 : 1;
            default:
                return 5;
        }
    }

    public static String m27863k(String str, int i) {
        return (i == 0 || (i & 1) == 0) ? str : m27909Z1(str);
    }

    public static CharSequence m27862k0(int i, Object... objArr) {
        return m27841p1(null, i, true, 0, null, objArr);
    }

    public static String m27861k1(TdApi.LanguagePackInfo languagePackInfo, int i) {
        return m27837q1(languagePackInfo, i, true);
    }

    public static String m27860k2() {
        return C4868i.m24726c2().m24751Z0().f25405id;
    }

    public static void m27859l(char c, Object obj) {
        boolean z = false;
        if (c == 'd' ? (obj instanceof Integer) || (obj instanceof Long) : c == 'f' ? (obj instanceof Float) || (obj instanceof Double) : c == 's') {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(obj.getClass() + " != %" + c);
        }
    }

    public static String m27858l0(String str) {
        TdApi.LanguagePackStringValueOrdinary v1 = m27817v1(str, C4868i.m24726c2().m24751Z0());
        if (v1 != null) {
            return v1.value;
        }
        return null;
    }

    public static String m27857l1(TdApi.LanguagePackInfo languagePackInfo, int i, Object... objArr) {
        return m27841p1(languagePackInfo, i, true, 0, null, objArr).toString();
    }

    public static String m27856l2(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        int length = str.length() - 1;
        boolean z = false;
        while (length >= 0) {
            char charAt = str.charAt(length);
            if (charAt == '\'') {
                z = !z;
            } else if (!z && m27953O1(charAt) && m27961M1(charAt)) {
                int i = length + 1;
                boolean z2 = false;
                while (i < sb2.length()) {
                    char charAt2 = sb2.charAt(i);
                    if (charAt2 != '\'') {
                        if (!z2 && m27953O1(charAt2) && !m27961M1(charAt2)) {
                            break;
                        }
                    } else {
                        z2 = !z2;
                    }
                    i++;
                }
                int i2 = length;
                boolean z3 = false;
                while (length > 0) {
                    char charAt3 = str.charAt(length - 1);
                    if (charAt3 != '\'') {
                        if (!(z3 || charAt3 == '.' || charAt3 == '`')) {
                            break;
                        }
                    } else {
                        z3 = !z3;
                    }
                    length--;
                    i2--;
                }
                sb2.delete(i2, i);
            } else if (!z && charAt == 'M') {
                sb2.setCharAt(length, 'L');
            }
            length--;
        }
        return sb2.toString();
    }

    public static String m27855m() {
        return C4868i.m24726c2().m24751Z0().baseLanguagePackId;
    }

    public static String m27854m0() {
        return m27869i1(R.string.format_concatSeparator);
    }

    public static CharSequence m27853m1(int i, Object... objArr) {
        return m27841p1(null, i, true, 0, m27843p(), objArr);
    }

    public static String m27852m2(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        int length = str.length() - 1;
        boolean z = false;
        while (length >= 0) {
            char charAt = str.charAt(length);
            if (charAt == '\'') {
                z = !z;
            } else if (!z && m27953O1(charAt) && m27945Q1(charAt)) {
                int i = length + 1;
                boolean z2 = false;
                while (i < sb2.length()) {
                    char charAt2 = sb2.charAt(i);
                    if (charAt2 != '\'') {
                        if (!z2 && m27953O1(charAt2) && !m27945Q1(charAt2)) {
                            break;
                        }
                    } else {
                        z2 = !z2;
                    }
                    i++;
                }
                int i2 = length;
                boolean z3 = false;
                while (length > 0) {
                    char charAt3 = str.charAt(length - 1);
                    if (charAt3 != '\'') {
                        if (!z3 && m27953O1(charAt3) && !m27945Q1(charAt3)) {
                            break;
                        }
                    } else {
                        z3 = !z3;
                    }
                    length--;
                    i2--;
                }
                sb2.delete(i2, i);
            }
            length--;
        }
        return sb2.toString();
    }

    public static String m27851n(double d, double d2) {
        return String.format(Locale.US, "%f, %f", Double.valueOf(C5069h.m24078o(d)), Double.valueOf(C5069h.m24078o(d2)));
    }

    public static String m27850n0(boolean z) {
        return m27869i1(z ? R.string.format_concatSeparatorLastPerson : R.string.format_concatSeparatorLast);
    }

    public static CharSequence m27849n1(int i, Object... objArr) {
        return m27841p1(null, i, true, 1, m27843p(), objArr);
    }

    public static CharSequence m27848n2(int i, long j, AbstractC4409f fVar, Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return m27816v2(i, j, 0, fVar, C1363c0.m37437f(j));
        }
        Object[] objArr2 = new Object[objArr.length + 1];
        objArr2[0] = C1363c0.m37437f(j);
        System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
        return m27816v2(i, j, 0, fVar, objArr2);
    }

    public static String m27847o(double d) {
        long j = (long) d;
        return d == ((double) j) ? Long.toString(j) : String.format(Locale.US, "%.2f", Double.valueOf(d));
    }

    public static String m27846o0(long j, TimeUnit timeUnit) {
        if (C5067f.m24108l(j, timeUnit)) {
            return m27999D(j, timeUnit);
        }
        return m27987G(j, timeUnit);
    }

    public static String m27845o1(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt < '0' || charAt > '9') && charAt != '_'))) {
                return null;
            }
        }
        int s1 = m27829s1(str);
        if (s1 == 0 || C5062b.m24152t(C4411y.m27782b(), str) >= 0) {
            return null;
        }
        return m27869i1(s1);
    }

    public static String m27844o2(int i, long j) {
        return m27816v2(i, j, 0, null, C1363c0.m37437f(j)).toString();
    }

    public static AbstractC4409f m27843p() {
        return C4399s.f14570a;
    }

    public static String m27842p0(long j, long j2, TimeUnit timeUnit, boolean z) {
        return DateUtils.formatDateRange(C1379j0.m37315n(), new Formatter(new StringBuilder(50), m27913Y1()), timeUnit.toMillis(j), timeUnit.toMillis(j2), z ? 524289 : Log.TAG_PLAYER).toString();
    }

    public static CharSequence m27841p1(TdApi.LanguagePackInfo languagePackInfo, int i, boolean z, int i2, AbstractC4409f fVar, Object... objArr) {
        if (i == 0) {
            throw new Resources.NotFoundException("resId == 0");
        } else if (objArr == null || objArr.length == 0) {
            return m27837q1(null, i, z);
        } else {
            boolean J1 = m27973J1(objArr);
            if (z) {
                if (languagePackInfo == null) {
                    languagePackInfo = C4868i.m24726c2().m24751Z0();
                }
                TdApi.LanguagePackStringValueOrdinary v1 = m27817v1(m27885e1(i), languagePackInfo);
                if (v1 != null) {
                    try {
                        return m27931U(m27863k(v1.value, i2), J1, fVar, objArr);
                    } catch (Throwable unused) {
                        m27903a3(true, m27824t2(), i);
                    }
                }
            }
            try {
                if (fVar == null && i2 == 0 && !J1) {
                    return m27923W(i, objArr);
                }
                return m27931U(m27863k(m27927V(i), i2), J1, fVar, objArr);
            } catch (Resources.NotFoundException unused2) {
                Log.m14724e("Resource not found (shitty modified lang pack?): %d %s", Integer.valueOf(i), m27885e1(i));
                return "";
            } catch (Throwable th) {
                String V = m27927V(i);
                Log.m14725e("Resource format is broken (shitty modified lang pack?): %s, format: %s", th, m27885e1(i), V);
                return V;
            }
        }
    }

    public static String m27840p2(int i, long j, Object... objArr) {
        return m27848n2(i, j, null, objArr).toString();
    }

    public static CharSequence m27839q(CharSequence charSequence) {
        return m27888d3(charSequence, m27843p());
    }

    public static String m27838q0(long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j);
        if (!C4868i.m24726c2().m24744a0()) {
            return m27952O2(millis, 3, "dd.MM.yyyy");
        }
        Calendar a = C5067f.m24119a(millis);
        return m27865j1(R.string.format_datestamp, Integer.valueOf(a.get(5)), Integer.valueOf(a.get(2) + 1), Integer.valueOf(a.get(1) % 100));
    }

    public static String m27837q1(TdApi.LanguagePackInfo languagePackInfo, int i, boolean z) {
        if (i != 0) {
            if (z) {
                if (languagePackInfo == null) {
                    languagePackInfo = C4868i.m24726c2().m24751Z0();
                }
                TdApi.LanguagePackStringValueOrdinary v1 = m27817v1(m27885e1(i), languagePackInfo);
                if (v1 != null) {
                    return v1.value;
                }
            }
            try {
                return m27927V(i);
            } catch (Resources.NotFoundException unused) {
                Log.m14724e("Resource not found (shitty modified lang pack?): %d %s", Integer.valueOf(i), m27885e1(i));
                return "";
            }
        } else {
            throw new Resources.NotFoundException("resId == 0");
        }
    }

    public static CharSequence m27836q2(int i, long j) {
        return m27848n2(i, j, m27843p(), new Object[0]);
    }

    public static Map<String, TdApi.LanguagePackStringValue> m27835r() {
        if (f14585k == null) {
            synchronized (C4403w.class) {
                if (f14585k == null) {
                    f14585k = new ConcurrentHashMap();
                }
            }
        }
        return f14585k;
    }

    public static String m27834r0(String str, boolean z) {
        if (!z) {
            return str;
        }
        return "[DEBUG] " + str;
    }

    public static TdApi.LanguagePackStringValuePluralized m27833r1(String str, TdApi.LanguagePackInfo languagePackInfo) {
        String b2 = m27860k2().equals(languagePackInfo.f25405id) ? m27899b2(languagePackInfo.f25405id, str) : null;
        if (b2 != null) {
            TdApi.LanguagePackStringValue i0 = m27870i0(b2);
            if (i0 instanceof TdApi.LanguagePackStringValuePluralized) {
                return (TdApi.LanguagePackStringValuePluralized) i0;
            }
            if (i0 instanceof TdApi.LanguagePackStringValueDeleted) {
                return null;
            }
        }
        TdApi.LanguagePackStringValuePluralized D2 = m27996D2(str, languagePackInfo.f25405id);
        if (D2 == null && !C5070i.m24061i(languagePackInfo.baseLanguagePackId)) {
            D2 = m27996D2(str, languagePackInfo.baseLanguagePackId);
        }
        if (b2 != null) {
            m28004B2(b2, D2);
        }
        return D2;
    }

    public static CharSequence m27832r2(int i, long j, Object... objArr) {
        return m27848n2(i, j, m27843p(), objArr);
    }

    public static void m27831s(TdApi.LanguagePackInfo languagePackInfo) {
        C4868i.m24726c2().m24803R4(languagePackInfo);
        Iterator<C11131y6> it = C10536ab.m4667o1().iterator();
        boolean z = false;
        while (it.hasNext()) {
            C11131y6 next = it.next();
            if (next.m1509B(true)) {
                next.mo1480c().m2533ac(languagePackInfo);
                z = true;
            }
        }
        if (!z) {
            C10536ab.m4667o1().m4684j0().m2533ac(languagePackInfo);
        }
        m27975J();
    }

    public static String m27830s0() {
        return m27869i1(R.string.format_decimalSeparator);
    }

    public static int m27829s1(String str) {
        try {
            Context n = C1379j0.m37315n();
            return n.getResources().getIdentifier(str, "string", n.getPackageName());
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String m27828s2(List<String> list, int i) {
        String join = TextUtils.join(m27854m0(), list);
        return i == 0 ? join : m27865j1(R.string.format_chatTitlesAndOthers, join, m27844o2(R.string.xOtherChatTitles, i));
    }

    public static void m27827t() {
        TdApi.LanguagePackInfo Z0 = C4868i.m24726c2().m24751Z0();
        Iterator<C11131y6> it = C10536ab.m4667o1().iterator();
        boolean z = false;
        while (it.hasNext()) {
            C11131y6 next = it.next();
            if (next.m1509B(true) && next.mo1480c().m2533ac(Z0)) {
                z = true;
            }
        }
        if (z) {
            m27975J();
        }
    }

    public static String m27826t0(long j, long j2, boolean z) {
        int i = j2 != 0 ? (int) ((j / j2) * 100.0d) : 0;
        int i2 = z ? R.string.Downloading : R.string.DownloadingOf;
        return m27865j1(i2, i + "%", C1363c0.m37423m(j2));
    }

    public static CharSequence m27825t1(int i, AbstractC4409f fVar, Object... objArr) {
        if (m27949P1()) {
            return m27873h1(i, fVar, objArr);
        }
        return m27841p1(null, i, false, 0, fVar, objArr).toString();
    }

    public static int m27824t2() {
        return C4868i.m24726c2().m24743a1();
    }

    public static void m27823u() {
        m27819v(true);
    }

    public static String m27822u0(TdApi.File file, int i, boolean z) {
        if (file == null || (!z && C4779t2.m25598T2(file))) {
            return m27869i1(i);
        }
        TdApi.LocalFile localFile = file.local;
        return localFile.isDownloadingActive ? m27826t0(localFile.downloadedSize, file.size, true) : m27865j1(R.string.CloudDownload, C1363c0.m37423m(file.size));
    }

    public static String m27821u1(int i, Object... objArr) {
        if (m27949P1()) {
            return m27865j1(i, objArr);
        }
        return m27841p1(null, i, false, 0, null, objArr).toString();
    }

    public static CharSequence m27820u2(long j, TimeUnit timeUnit, int i, int i2, int i3, int i4, int i5, int i6, Object... objArr) {
        long days = timeUnit.toDays(j);
        long j2 = days / 30;
        long j3 = days / 7;
        long hours = timeUnit.toHours(j);
        long minutes = timeUnit.toMinutes(j);
        long seconds = timeUnit.toSeconds(j);
        if (i6 != 0 && j2 > 0) {
            return m27832r2(i6, j2, objArr);
        }
        if (i5 != 0 && j3 > 0) {
            return m27832r2(i5, j3, objArr);
        }
        if (i4 != 0 && days > 0) {
            return m27832r2(i4, days, objArr);
        }
        if (i3 != 0 && hours > 0) {
            return m27832r2(i3, hours, objArr);
        }
        if (i2 != 0 && minutes > 0) {
            return m27832r2(i2, minutes, objArr);
        }
        if (i != 0) {
            return m27832r2(i, seconds, objArr);
        }
        throw new IllegalArgumentException();
    }

    public static void m27819v(boolean z) {
        m27972J2(!"1".equals(m27869i1(R.string.language_disable_lowercase)), z);
        m27968K2(C4868i.m24726c2().m24812Q2(m27860k2(), m28006B0() == 1), z);
        Locale locale = null;
        String i1 = m27869i1(R.string.language_dateFormatLocale);
        if (!C5070i.m24061i(i1) && !"0".equals(i1)) {
            try {
                String w = m27815w(i1);
                if (w.length() == i1.length()) {
                    locale = new Locale(w);
                } else {
                    locale = new Locale(w, m27815w(i1.substring(w.length() + 1)));
                }
            } catch (Throwable unused) {
            }
        }
        m27976I2(locale, z);
        f14580f = true;
    }

    public static String m27818v0(int i) {
        return m27814w0(i, 0, 0, false);
    }

    public static TdApi.LanguagePackStringValueOrdinary m27817v1(String str, TdApi.LanguagePackInfo languagePackInfo) {
        String b2 = m27860k2().equals(languagePackInfo.f25405id) ? m27899b2(languagePackInfo.f25405id, str) : null;
        if (b2 != null) {
            TdApi.LanguagePackStringValue i0 = m27870i0(b2);
            if (i0 instanceof TdApi.LanguagePackStringValueOrdinary) {
                return (TdApi.LanguagePackStringValueOrdinary) i0;
            }
            if (i0 instanceof TdApi.LanguagePackStringValueDeleted) {
                return null;
            }
        }
        TdApi.LanguagePackStringValueOrdinary E2 = m27992E2(str, languagePackInfo.f25405id);
        if (E2 == null && !C5070i.m24061i(languagePackInfo.baseLanguagePackId)) {
            E2 = m27992E2(str, languagePackInfo.baseLanguagePackId);
        }
        if (b2 != null) {
            m28004B2(b2, E2);
        }
        return E2;
    }

    public static CharSequence m27816v2(int i, long j, int i2, AbstractC4409f fVar, Object... objArr) {
        Object[] objArr2;
        AbstractC4409f fVar2;
        if (i != 0) {
            TdApi.LanguagePackStringValuePluralized r1 = m27833r1(m27885e1(i), C4868i.m24726c2().m24751Z0());
            if (r1 != null) {
                int t2 = m27824t2();
                int j2 = m27864j2(t2, j);
                String R0 = m27942R0(r1, j2);
                if (!C5070i.m24061i(R0) || j2 == 5) {
                    fVar2 = fVar;
                    objArr2 = objArr;
                } else {
                    R0 = r1.otherValue;
                    fVar2 = fVar;
                    objArr2 = objArr;
                    j2 = 5;
                }
                try {
                    return m27935T(R0, fVar2, objArr2);
                } catch (Throwable unused) {
                    m27903a3(true, t2, C4411y.m27781c(i, j2));
                }
            }
            int M = m27963M();
            int z2 = m27800z2(M, i, j);
            try {
                return m27841p1(null, z2, false, i2, fVar, objArr);
            } catch (Throwable th) {
                if (M != 25966) {
                    m27903a3(false, M, z2);
                    return m27841p1(null, m27800z2(25966, i, j), false, i2, fVar, objArr);
                }
                throw new IllegalStateException("Broken plural: " + m27885e1(i), th);
            }
        } else {
            throw new Resources.NotFoundException("resId == 0");
        }
    }

    public static String m27815w(String str) {
        if (C5070i.m24061i(str)) {
            return str;
        }
        if (str.charAt(0) == 'X') {
            int indexOf = str.indexOf(88, 1);
            str = indexOf != -1 ? str.substring(1, indexOf) : str.substring(1);
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '-' || charAt == '_') {
                return str.substring(0, i).toLowerCase();
            }
        }
        return str.toLowerCase();
    }

    public static String m27814w0(int i, int i2, int i3, boolean z) {
        if (!m28008A2(i) || (i2 == 0 && i3 == 0)) {
            if (i < 60) {
                return m27844o2(R.string.xSeconds, i);
            }
            int i4 = i / 60;
            if (i4 < 60) {
                return m27844o2(R.string.xMinutes, i4);
            }
            int i5 = i4 / 60;
            if (z) {
                return C1363c0.m37433h(i);
            }
            if (i5 < 24) {
                return m27844o2(R.string.xHours, i5);
            }
            int i6 = i5 / 24;
            if (i6 < 7) {
                return m27844o2(R.string.xDays, i6);
            }
            int i7 = i6 / 7;
            if (i7 < 4) {
                return m27844o2(R.string.xWeeks, i7);
            }
            int i8 = i6 / 30;
            if (i8 < 12) {
                return m27844o2(R.string.xMonths, i8);
            }
            return m27844o2(R.string.xYears, Math.max(1, i6 / 365));
        } else if (i3 != 0) {
            return i2 != 0 ? m27865j1(i2, m27846o0(i3, TimeUnit.SECONDS)) : m27846o0(i3, TimeUnit.SECONDS);
        } else {
            if (i2 != 0) {
                return m27869i1(i2);
            }
            return null;
        }
    }

    public static CharSequence m27813w1(int i, String str, Object... objArr) {
        if (!C5070i.m24061i(str) && str.matches("^[A-Za-z0-9_]+$")) {
            String str2 = m27885e1(i) + C5070i.m24073E(str.toLowerCase(), m28003C());
            int s1 = m27829s1(str2);
            if (s1 != 0) {
                return m27853m1(s1, objArr);
            }
            String l0 = m27858l0(str2);
            if (l0 != null) {
                if (objArr == null || objArr.length <= 0) {
                    return l0;
                }
                try {
                    return m27931U(l0, m27973J1(objArr), m27843p(), objArr);
                } catch (Throwable unused) {
                    m27903a3(true, m27824t2(), i);
                }
            }
        }
        if (i != 0) {
            return m27853m1(i, objArr);
        }
        return null;
    }

    public static CharSequence m27812w2(int i, int i2, boolean z) {
        int i3 = R.string.xSubscribers;
        if (i2 > 0) {
            if (!z) {
                i3 = R.string.xMembers;
            }
            return m27862k0(R.string.format_membersAndOnline, m27848n2(i3, i, m27843p(), new Object[0]), m27848n2(R.string.xOnline, i2, m27843p(), new Object[0]));
        }
        if (!z) {
            i3 = R.string.xMembers;
        }
        return m27848n2(i3, i, m27843p(), new Object[0]);
    }

    public static void m27811x() {
        m27835r().clear();
    }

    public static String m27810x0(int i) {
        return m27814w0(i, 0, 0, true);
    }

    public static String m27809x1() {
        return m27869i1(R.string.format_thousandsSeparator);
    }

    public static String m27808x2(List<String> list, int i) {
        String join = TextUtils.join(m27854m0(), list);
        return i == 0 ? join : m27865j1(R.string.format_peopleNamesAndOthers, join, m27844o2(R.string.xOtherPeopleNames, i));
    }

    public static AbstractC4409f m27807y() {
        return C4398r.f14569a;
    }

    public static String m27806y0(String str) {
        String str2 = "error_" + str;
        int s1 = m27829s1(str2);
        if (s1 != 0) {
            return m27869i1(s1);
        }
        String l0 = m27858l0(str2);
        if (l0 != null) {
            return l0;
        }
        return null;
    }

    public static String m27805y1(long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j);
        if (!C4868i.m24726c2().m24744a0()) {
            return m27948P2(millis, 3, 3, C1379j0.m37344X() ? "dd.MM.yyyy h:mm a" : "dd.MM.yyyy H:mm");
        }
        Calendar a = C5067f.m24119a(millis);
        return m27865j1(R.string.format_timestamp, Integer.valueOf(a.get(5)), Integer.valueOf(a.get(2) + 1), Integer.valueOf(a.get(1) % 100), m27928U2(a));
    }

    public static CharSequence m27804y2(int i, int i2) {
        if (i > 0 && i2 > 0) {
            return m27862k0(R.string.format_photosAndVideos, m27836q2(R.string.xPhotos, i), m27836q2(R.string.xVideos, i2));
        }
        if (i2 > 0) {
            return m27836q2(R.string.xVideos, i2);
        }
        if (i > 0) {
            return m27836q2(R.string.xPhotos, i);
        }
        return m27869i1(R.string.NoMediaYet);
    }

    public static CharSequence m27803z(CharSequence charSequence) {
        return m27888d3(charSequence, m27807y());
    }

    public static String m27802z0(long j, TimeUnit timeUnit, long j2) {
        return j <= 0 ? C1363c0.m37423m(j2) : m27865j1(R.string.format_fileSizeAndModifiedDate, C1363c0.m37423m(j2), m27910Z0(j, timeUnit));
    }

    public static String m27801z1(int i) {
        if (i < 120) {
            return m27844o2(R.string.TryAgainSeconds, i);
        }
        int i2 = i / 60;
        if (i2 < 60) {
            return m27844o2(R.string.TryAgainMinutes, i2);
        }
        return m27844o2(R.string.TryAgainHours, i2 / 60);
    }

    public static int m27800z2(int i, int i2, long j) {
        return C4411y.m27781c(i2, m27864j2(i, j));
    }
}
