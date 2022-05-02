package p278tb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p123ia.C5304n;
import p290ub.C9488a;
import p290ub.C9489b;
import p362zb.C11461c;
import qa.C8294g;
import qa.C8298k;
import za.C11439e;
import za.C11451n;
import za.C11452o;

public final class C9104o {
    public final String f29305a;
    public final String f29306b;
    public final long f29307c;
    public final String f29308d;
    public final String f29309e;
    public final boolean f29310f;
    public final boolean f29311g;
    public final boolean f29312h;
    public final boolean f29313i;
    public static final C9105a f29304n = new C9105a(null);
    public static final Pattern f29300j = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern f29301k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern f29302l = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern f29303m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public static final class C9105a {
        public C9105a() {
        }

        public final int m10428a(String str, int i, int i2, boolean z) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        public final boolean m10427b(String str, String str2) {
            if (C8298k.m12936b(str, str2)) {
                return true;
            }
            return C11451n.m634k(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !C9489b.m8518f(str);
        }

        public final C9104o m10426c(C9125w wVar, String str) {
            C8298k.m12933e(wVar, "url");
            C8298k.m12933e(str, "setCookie");
            return m10425d(System.currentTimeMillis(), wVar, str);
        }

        public final p278tb.C9104o m10425d(long r26, p278tb.C9125w r28, java.lang.String r29) {
            throw new UnsupportedOperationException("Method not decompiled: p278tb.C9104o.C9105a.m10425d(long, tb.w, java.lang.String):tb.o");
        }

        public final List<C9104o> m10424e(C9125w wVar, C9122v vVar) {
            C8298k.m12933e(wVar, "url");
            C8298k.m12933e(vVar, "headers");
            List<String> s = vVar.m10368s("Set-Cookie");
            int size = s.size();
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                C9104o c = m10426c(wVar, s.get(i));
                if (c != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c);
                }
            }
            if (arrayList == null) {
                return C5304n.m23367f();
            }
            List<C9104o> unmodifiableList = Collections.unmodifiableList(arrayList);
            C8298k.m12934d(unmodifiableList, "Collections.unmodifiableList(cookies)");
            return unmodifiableList;
        }

        public final String m10423f(String str) {
            if (!C11451n.m634k(str, ".", false, 2, null)) {
                String e = C9488a.m8545e(C11452o.m593b0(str, "."));
                if (e != null) {
                    return e;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final long m10422g(String str, int i, int i2) {
            int a = m10428a(str, i, i2, false);
            Matcher matcher = C9104o.f29303m.matcher(str);
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            while (a < i2) {
                int a2 = m10428a(str, a + 1, i2, true);
                matcher.region(a, a2);
                if (i4 == -1 && matcher.usePattern(C9104o.f29303m).matches()) {
                    String group = matcher.group(1);
                    C8298k.m12934d(group, "matcher.group(1)");
                    i4 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    C8298k.m12934d(group2, "matcher.group(2)");
                    i7 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    C8298k.m12934d(group3, "matcher.group(3)");
                    i8 = Integer.parseInt(group3);
                } else if (i5 == -1 && matcher.usePattern(C9104o.f29302l).matches()) {
                    String group4 = matcher.group(1);
                    C8298k.m12934d(group4, "matcher.group(1)");
                    i5 = Integer.parseInt(group4);
                } else if (i6 == -1 && matcher.usePattern(C9104o.f29301k).matches()) {
                    String group5 = matcher.group(1);
                    C8298k.m12934d(group5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    C8298k.m12934d(locale, "Locale.US");
                    Objects.requireNonNull(group5, "null cannot be cast to non-null type java.lang.String");
                    String lowerCase = group5.toLowerCase(locale);
                    C8298k.m12934d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    String pattern = C9104o.f29301k.pattern();
                    C8298k.m12934d(pattern, "MONTH_PATTERN.pattern()");
                    i6 = C11452o.m607N(pattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i3 == -1 && matcher.usePattern(C9104o.f29300j).matches()) {
                    String group6 = matcher.group(1);
                    C8298k.m12934d(group6, "matcher.group(1)");
                    i3 = Integer.parseInt(group6);
                }
                a = m10428a(str, a2 + 1, i2, false);
            }
            if (70 <= i3 && 99 >= i3) {
                i3 += 1900;
            }
            if (i3 >= 0 && 69 >= i3) {
                i3 += 2000;
            }
            if (i3 >= 1601) {
                if (i6 != -1) {
                    if (1 <= i5 && 31 >= i5) {
                        if (i4 >= 0 && 23 >= i4) {
                            if (i7 >= 0 && 59 >= i7) {
                                if (i8 >= 0 && 59 >= i8) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(C9489b.f30727f);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i3);
                                    gregorianCalendar.set(2, i6 - 1);
                                    gregorianCalendar.set(5, i5);
                                    gregorianCalendar.set(11, i4);
                                    gregorianCalendar.set(12, i7);
                                    gregorianCalendar.set(13, i8);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final long m10421h(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e) {
                if (new C11439e("-?\\d+").m648a(str)) {
                    return C11451n.m621x(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e;
            }
        }

        public C9105a(C8294g gVar) {
            this();
        }
    }

    public C9104o(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f29305a = str;
        this.f29306b = str2;
        this.f29307c = j;
        this.f29308d = str3;
        this.f29309e = str4;
        this.f29310f = z;
        this.f29311g = z2;
        this.f29312h = z3;
        this.f29313i = z4;
    }

    public final String m10431e() {
        return this.f29305a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9104o) {
            C9104o oVar = (C9104o) obj;
            if (C8298k.m12936b(oVar.f29305a, this.f29305a) && C8298k.m12936b(oVar.f29306b, this.f29306b) && oVar.f29307c == this.f29307c && C8298k.m12936b(oVar.f29308d, this.f29308d) && C8298k.m12936b(oVar.f29309e, this.f29309e) && oVar.f29310f == this.f29310f && oVar.f29311g == this.f29311g && oVar.f29312h == this.f29312h && oVar.f29313i == this.f29313i) {
                return true;
            }
        }
        return false;
    }

    public final String m10430f(boolean z) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f29305a);
        sb2.append('=');
        sb2.append(this.f29306b);
        if (this.f29312h) {
            if (this.f29307c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(C11461c.m561b(new Date(this.f29307c)));
            }
        }
        if (!this.f29313i) {
            sb2.append("; domain=");
            if (z) {
                sb2.append(".");
            }
            sb2.append(this.f29308d);
        }
        sb2.append("; path=");
        sb2.append(this.f29309e);
        if (this.f29310f) {
            sb2.append("; secure");
        }
        if (this.f29311g) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        C8298k.m12934d(sb3, "toString()");
        return sb3;
    }

    public final String m10429g() {
        return this.f29306b;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.f29305a.hashCode()) * 31) + this.f29306b.hashCode()) * 31) + C9102m.m10437a(this.f29307c)) * 31) + this.f29308d.hashCode()) * 31) + this.f29309e.hashCode()) * 31) + C9103n.m10436a(this.f29310f)) * 31) + C9103n.m10436a(this.f29311g)) * 31) + C9103n.m10436a(this.f29312h)) * 31) + C9103n.m10436a(this.f29313i);
    }

    public String toString() {
        return m10430f(false);
    }

    public C9104o(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, C8294g gVar) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }
}
