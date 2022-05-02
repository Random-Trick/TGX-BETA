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
    public final String f29302a;
    public final String f29303b;
    public final long f29304c;
    public final String f29305d;
    public final String f29306e;
    public final boolean f29307f;
    public final boolean f29308g;
    public final boolean f29309h;
    public final boolean f29310i;
    public static final C9105a f29301n = new C9105a(null);
    public static final Pattern f29297j = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern f29298k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern f29299l = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern f29300m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public static final class C9105a {
        public C9105a() {
        }

        public final int m10429a(String str, int i, int i2, boolean z) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        public final boolean m10428b(String str, String str2) {
            if (C8298k.m12937b(str, str2)) {
                return true;
            }
            return C11451n.m634k(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !C9489b.m8518f(str);
        }

        public final C9104o m10427c(C9125w wVar, String str) {
            C8298k.m12934e(wVar, "url");
            C8298k.m12934e(str, "setCookie");
            return m10426d(System.currentTimeMillis(), wVar, str);
        }

        public final p278tb.C9104o m10426d(long r26, p278tb.C9125w r28, java.lang.String r29) {
            throw new UnsupportedOperationException("Method not decompiled: p278tb.C9104o.C9105a.m10426d(long, tb.w, java.lang.String):tb.o");
        }

        public final List<C9104o> m10425e(C9125w wVar, C9122v vVar) {
            C8298k.m12934e(wVar, "url");
            C8298k.m12934e(vVar, "headers");
            List<String> s = vVar.m10369s("Set-Cookie");
            int size = s.size();
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                C9104o c = m10427c(wVar, s.get(i));
                if (c != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c);
                }
            }
            if (arrayList == null) {
                return C5304n.m23366f();
            }
            List<C9104o> unmodifiableList = Collections.unmodifiableList(arrayList);
            C8298k.m12935d(unmodifiableList, "Collections.unmodifiableList(cookies)");
            return unmodifiableList;
        }

        public final String m10424f(String str) {
            if (!C11451n.m634k(str, ".", false, 2, null)) {
                String e = C9488a.m8545e(C11452o.m593b0(str, "."));
                if (e != null) {
                    return e;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final long m10423g(String str, int i, int i2) {
            int a = m10429a(str, i, i2, false);
            Matcher matcher = C9104o.f29300m.matcher(str);
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            while (a < i2) {
                int a2 = m10429a(str, a + 1, i2, true);
                matcher.region(a, a2);
                if (i4 == -1 && matcher.usePattern(C9104o.f29300m).matches()) {
                    String group = matcher.group(1);
                    C8298k.m12935d(group, "matcher.group(1)");
                    i4 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    C8298k.m12935d(group2, "matcher.group(2)");
                    i7 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    C8298k.m12935d(group3, "matcher.group(3)");
                    i8 = Integer.parseInt(group3);
                } else if (i5 == -1 && matcher.usePattern(C9104o.f29299l).matches()) {
                    String group4 = matcher.group(1);
                    C8298k.m12935d(group4, "matcher.group(1)");
                    i5 = Integer.parseInt(group4);
                } else if (i6 == -1 && matcher.usePattern(C9104o.f29298k).matches()) {
                    String group5 = matcher.group(1);
                    C8298k.m12935d(group5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    C8298k.m12935d(locale, "Locale.US");
                    Objects.requireNonNull(group5, "null cannot be cast to non-null type java.lang.String");
                    String lowerCase = group5.toLowerCase(locale);
                    C8298k.m12935d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    String pattern = C9104o.f29298k.pattern();
                    C8298k.m12935d(pattern, "MONTH_PATTERN.pattern()");
                    i6 = C11452o.m607N(pattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i3 == -1 && matcher.usePattern(C9104o.f29297j).matches()) {
                    String group6 = matcher.group(1);
                    C8298k.m12935d(group6, "matcher.group(1)");
                    i3 = Integer.parseInt(group6);
                }
                a = m10429a(str, a2 + 1, i2, false);
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
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(C9489b.f30724f);
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

        public final long m10422h(String str) {
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
        this.f29302a = str;
        this.f29303b = str2;
        this.f29304c = j;
        this.f29305d = str3;
        this.f29306e = str4;
        this.f29307f = z;
        this.f29308g = z2;
        this.f29309h = z3;
        this.f29310i = z4;
    }

    public final String m10432e() {
        return this.f29302a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9104o) {
            C9104o oVar = (C9104o) obj;
            if (C8298k.m12937b(oVar.f29302a, this.f29302a) && C8298k.m12937b(oVar.f29303b, this.f29303b) && oVar.f29304c == this.f29304c && C8298k.m12937b(oVar.f29305d, this.f29305d) && C8298k.m12937b(oVar.f29306e, this.f29306e) && oVar.f29307f == this.f29307f && oVar.f29308g == this.f29308g && oVar.f29309h == this.f29309h && oVar.f29310i == this.f29310i) {
                return true;
            }
        }
        return false;
    }

    public final String m10431f(boolean z) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f29302a);
        sb2.append('=');
        sb2.append(this.f29303b);
        if (this.f29309h) {
            if (this.f29304c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(C11461c.m561b(new Date(this.f29304c)));
            }
        }
        if (!this.f29310i) {
            sb2.append("; domain=");
            if (z) {
                sb2.append(".");
            }
            sb2.append(this.f29305d);
        }
        sb2.append("; path=");
        sb2.append(this.f29306e);
        if (this.f29307f) {
            sb2.append("; secure");
        }
        if (this.f29308g) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        C8298k.m12935d(sb3, "toString()");
        return sb3;
    }

    public final String m10430g() {
        return this.f29303b;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.f29302a.hashCode()) * 31) + this.f29303b.hashCode()) * 31) + C9102m.m10438a(this.f29304c)) * 31) + this.f29305d.hashCode()) * 31) + this.f29306e.hashCode()) * 31) + C9103n.m10437a(this.f29307f)) * 31) + C9103n.m10437a(this.f29308g)) * 31) + C9103n.m10437a(this.f29309h)) * 31) + C9103n.m10437a(this.f29310i);
    }

    public String toString() {
        return m10431f(false);
    }

    public C9104o(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, C8294g gVar) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }
}
