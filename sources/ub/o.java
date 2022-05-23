package ub;

import ab.e;
import ab.n;
import ac.c;
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
import ra.g;
import ra.k;
import vb.b;

public final class o {
    public final String f23906a;
    public final String f23907b;
    public final long f23908c;
    public final String f23909d;
    public final String f23910e;
    public final boolean f23911f;
    public final boolean f23912g;
    public final boolean f23913h;
    public final boolean f23914i;
    public static final a f23905n = new a(null);
    public static final Pattern f23901j = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern f23902k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern f23903l = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern f23904m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final int a(String str, int i10, int i11, boolean z10) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        public final boolean b(String str, String str2) {
            if (k.b(str, str2)) {
                return true;
            }
            return n.k(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !b.f(str);
        }

        public final o c(w wVar, String str) {
            k.e(wVar, "url");
            k.e(str, "setCookie");
            return d(System.currentTimeMillis(), wVar, str);
        }

        public final ub.o d(long r26, ub.w r28, java.lang.String r29) {
            throw new UnsupportedOperationException("Method not decompiled: ub.o.a.d(long, ub.w, java.lang.String):ub.o");
        }

        public final List<o> e(w wVar, v vVar) {
            k.e(wVar, "url");
            k.e(vVar, "headers");
            List<String> s10 = vVar.s("Set-Cookie");
            int size = s10.size();
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                o c10 = c(wVar, s10.get(i10));
                if (c10 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c10);
                }
            }
            if (arrayList == null) {
                return ja.n.f();
            }
            List<o> unmodifiableList = Collections.unmodifiableList(arrayList);
            k.d(unmodifiableList, "Collections.unmodifiableList(cookies)");
            return unmodifiableList;
        }

        public final String f(String str) {
            if (!n.k(str, ".", false, 2, null)) {
                String e10 = vb.a.e(ab.o.b0(str, "."));
                if (e10 != null) {
                    return e10;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final long g(String str, int i10, int i11) {
            int a10 = a(str, i10, i11, false);
            Matcher matcher = o.f23904m.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            while (a10 < i11) {
                int a11 = a(str, a10 + 1, i11, true);
                matcher.region(a10, a11);
                if (i13 == -1 && matcher.usePattern(o.f23904m).matches()) {
                    String group = matcher.group(1);
                    k.d(group, "matcher.group(1)");
                    i13 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    k.d(group2, "matcher.group(2)");
                    i16 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    k.d(group3, "matcher.group(3)");
                    i17 = Integer.parseInt(group3);
                } else if (i14 == -1 && matcher.usePattern(o.f23903l).matches()) {
                    String group4 = matcher.group(1);
                    k.d(group4, "matcher.group(1)");
                    i14 = Integer.parseInt(group4);
                } else if (i15 == -1 && matcher.usePattern(o.f23902k).matches()) {
                    String group5 = matcher.group(1);
                    k.d(group5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    k.d(locale, "Locale.US");
                    Objects.requireNonNull(group5, "null cannot be cast to non-null type java.lang.String");
                    String lowerCase = group5.toLowerCase(locale);
                    k.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    String pattern = o.f23902k.pattern();
                    k.d(pattern, "MONTH_PATTERN.pattern()");
                    i15 = ab.o.N(pattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i12 == -1 && matcher.usePattern(o.f23901j).matches()) {
                    String group6 = matcher.group(1);
                    k.d(group6, "matcher.group(1)");
                    i12 = Integer.parseInt(group6);
                }
                a10 = a(str, a11 + 1, i11, false);
            }
            if (70 <= i12 && 99 >= i12) {
                i12 += 1900;
            }
            if (i12 >= 0 && 69 >= i12) {
                i12 += 2000;
            }
            if (i12 >= 1601) {
                if (i15 != -1) {
                    if (1 <= i14 && 31 >= i14) {
                        if (i13 >= 0 && 23 >= i13) {
                            if (i16 >= 0 && 59 >= i16) {
                                if (i17 >= 0 && 59 >= i17) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(b.f24814f);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i12);
                                    gregorianCalendar.set(2, i15 - 1);
                                    gregorianCalendar.set(5, i14);
                                    gregorianCalendar.set(11, i13);
                                    gregorianCalendar.set(12, i16);
                                    gregorianCalendar.set(13, i17);
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

        public final long h(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e10) {
                if (new e("-?\\d+").a(str)) {
                    return n.x(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }
    }

    public o(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f23906a = str;
        this.f23907b = str2;
        this.f23908c = j10;
        this.f23909d = str3;
        this.f23910e = str4;
        this.f23911f = z10;
        this.f23912g = z11;
        this.f23913h = z12;
        this.f23914i = z13;
    }

    public final String e() {
        return this.f23906a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (k.b(oVar.f23906a, this.f23906a) && k.b(oVar.f23907b, this.f23907b) && oVar.f23908c == this.f23908c && k.b(oVar.f23909d, this.f23909d) && k.b(oVar.f23910e, this.f23910e) && oVar.f23911f == this.f23911f && oVar.f23912g == this.f23912g && oVar.f23913h == this.f23913h && oVar.f23914i == this.f23914i) {
                return true;
            }
        }
        return false;
    }

    public final String f(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f23906a);
        sb2.append('=');
        sb2.append(this.f23907b);
        if (this.f23913h) {
            if (this.f23908c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(c.b(new Date(this.f23908c)));
            }
        }
        if (!this.f23914i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(this.f23909d);
        }
        sb2.append("; path=");
        sb2.append(this.f23910e);
        if (this.f23911f) {
            sb2.append("; secure");
        }
        if (this.f23912g) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        k.d(sb3, "toString()");
        return sb3;
    }

    public final String g() {
        return this.f23907b;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.f23906a.hashCode()) * 31) + this.f23907b.hashCode()) * 31) + m.a(this.f23908c)) * 31) + this.f23909d.hashCode()) * 31) + this.f23910e.hashCode()) * 31) + n.a(this.f23911f)) * 31) + n.a(this.f23912g)) * 31) + n.a(this.f23913h)) * 31) + n.a(this.f23914i);
    }

    public String toString() {
        return f(false);
    }

    public o(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, g gVar) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13);
    }
}
