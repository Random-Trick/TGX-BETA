package p290ub;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p025bc.C1309c;
import p095gc.AbstractC4537a0;
import p095gc.AbstractC4550f;
import p095gc.AbstractC4551g;
import p095gc.C4549e;
import p095gc.C4552h;
import p095gc.C4563r;
import p107ha.C5040a;
import p123ia.AbstractC5286d0;
import p123ia.C5295h0;
import p123ia.C5296i;
import p123ia.C5304n;
import p123ia.C5305o;
import p123ia.C5312v;
import p126j$.util.DesugarTimeZone;
import p278tb.AbstractC9072c0;
import p278tb.AbstractC9080e;
import p278tb.AbstractC9081e0;
import p278tb.AbstractC9114t;
import p278tb.C9078d0;
import p278tb.C9122v;
import p278tb.C9125w;
import p278tb.C9132z;
import p317wa.C10022g;
import p317wa.C10030l;
import qa.C8298k;
import qa.C8309v;
import za.C11439e;
import za.C11451n;
import za.C11452o;

public final class C9489b {
    public static final byte[] f30719a;
    public static final AbstractC9081e0 f30721c;
    public static final AbstractC9072c0 f30722d;
    public static final C4563r f30723e;
    public static final TimeZone f30724f;
    public static final String f30727i;
    public static final C9122v f30720b = C9122v.f29332b.m10355g(new String[0]);
    public static final C11439e f30725g = new C11439e("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    public static final boolean f30726h = false;

    public static final class C9490a implements AbstractC9114t.AbstractC9117c {
        public final AbstractC9114t f30728a;

        public C9490a(AbstractC9114t tVar) {
            this.f30728a = tVar;
        }

        @Override
        public final AbstractC9114t mo8497a(AbstractC9080e eVar) {
            C8298k.m12934e(eVar, "it");
            return this.f30728a;
        }
    }

    public static final class ThreadFactoryC9491b implements ThreadFactory {
        public final String f30729a;
        public final boolean f30730b;

        public ThreadFactoryC9491b(String str, boolean z) {
            this.f30729a = str;
            this.f30730b = z;
        }

        @Override
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f30729a);
            thread.setDaemon(this.f30730b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f30719a = bArr;
        f30721c = AbstractC9081e0.C9082a.m10488c(AbstractC9081e0.f29130a, bArr, null, 1, null);
        f30722d = AbstractC9072c0.C9073a.m10548b(AbstractC9072c0.f29074a, bArr, null, 0, 0, 7, null);
        C4563r.C4564a aVar = C4563r.f14992M;
        C4552h.C4553a aVar2 = C4552h.f14973N;
        f30723e = aVar.m27350d(aVar2.m27401a("efbbbf"), aVar2.m27401a("feff"), aVar2.m27401a("fffe"), aVar2.m27401a("0000ffff"), aVar2.m27401a("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        C8298k.m12936c(timeZone);
        f30724f = timeZone;
        String name = C9132z.class.getName();
        C8298k.m12935d(name, "OkHttpClient::class.java.name");
        f30727i = C11452o.m592c0(C11452o.m593b0(name, "okhttp3."), "Client");
    }

    public static final int m8544A(String str, int i) {
        C8298k.m12934e(str, "$this$indexOfNonWhitespace");
        int length = str.length();
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\t') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static final String[] m8543B(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C8298k.m12934e(strArr, "$this$intersect");
        C8298k.m12934e(strArr2, "other");
        C8298k.m12934e(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    public static final boolean m8542C(Socket socket, AbstractC4551g gVar) {
        C8298k.m12934e(socket, "$this$isHealthy");
        C8298k.m12934e(gVar, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z = !gVar.mo27339B();
                socket.setSoTimeout(soTimeout);
                return z;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean m8541D(String str) {
        C8298k.m12934e(str, "name");
        return C11451n.m633l(str, "Authorization", true) || C11451n.m633l(str, "Cookie", true) || C11451n.m633l(str, "Proxy-Authorization", true) || C11451n.m633l(str, "Set-Cookie", true);
    }

    public static final int m8540E(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    public static final int m8539F(AbstractC4551g gVar) {
        C8298k.m12934e(gVar, "$this$readMedium");
        return m8522b(gVar.readByte(), 255) | (m8522b(gVar.readByte(), 255) << 16) | (m8522b(gVar.readByte(), 255) << 8);
    }

    public static final int m8538G(C4549e eVar, byte b) {
        C8298k.m12934e(eVar, "$this$skipAll");
        int i = 0;
        while (!eVar.mo27339B() && eVar.m27444D0(0L) == b) {
            i++;
            eVar.readByte();
        }
        return i;
    }

    public static final boolean m8537H(p095gc.AbstractC4537a0 r11, int r12, java.util.concurrent.TimeUnit r13) {
        throw new UnsupportedOperationException("Method not decompiled: p290ub.C9489b.m8537H(gc.a0, int, java.util.concurrent.TimeUnit):boolean");
    }

    public static final ThreadFactory m8536I(String str, boolean z) {
        C8298k.m12934e(str, "name");
        return new ThreadFactoryC9491b(str, z);
    }

    public static final List<C1309c> m8535J(C9122v vVar) {
        C8298k.m12934e(vVar, "$this$toHeaderList");
        C10022g j = C10030l.m6187j(0, vVar.size());
        ArrayList arrayList = new ArrayList(C5305o.m23357o(j, 10));
        Iterator<Integer> it = j.iterator();
        while (it.hasNext()) {
            int e = ((AbstractC5286d0) it).mo6206e();
            arrayList.add(new C1309c(vVar.m10372i(e), vVar.m10370r(e)));
        }
        return arrayList;
    }

    public static final C9122v m8534K(List<C1309c> list) {
        C8298k.m12934e(list, "$this$toHeaders");
        C9122v.C9123a aVar = new C9122v.C9123a();
        for (C1309c cVar : list) {
            aVar.m10366c(cVar.m37778a().m27402u(), cVar.m37777b().m27402u());
        }
        return aVar.m10365d();
    }

    public static final String m8533L(C9125w wVar, boolean z) {
        String str;
        C8298k.m12934e(wVar, "$this$toHostHeader");
        if (C11452o.m618C(wVar.m10347h(), ":", false, 2, null)) {
            str = '[' + wVar.m10347h() + ']';
        } else {
            str = wVar.m10347h();
        }
        if (!z && wVar.m10343l() == C9125w.f29336l.m10304c(wVar.m10339p())) {
            return str;
        }
        return str + ':' + wVar.m10343l();
    }

    public static String m8532M(C9125w wVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m8533L(wVar, z);
    }

    public static final <T> List<T> m8531N(List<? extends T> list) {
        C8298k.m12934e(list, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(C5312v.m23326V(list));
        C8298k.m12935d(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final <K, V> Map<K, V> m8530O(Map<K, ? extends V> map) {
        C8298k.m12934e(map, "$this$toImmutableMap");
        if (map.isEmpty()) {
            return C5295h0.m23423d();
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        C8298k.m12935d(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return unmodifiableMap;
    }

    public static final long m8529P(String str, long j) {
        C8298k.m12934e(str, "$this$toLongOrDefault");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int m8528Q(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final String m8527R(String str, int i, int i2) {
        C8298k.m12934e(str, "$this$trimSubstring");
        int w = m8501w(str, i, i2);
        String substring = str.substring(w, m8499y(str, w, i2));
        C8298k.m12935d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static String m8526S(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m8527R(str, i, i2);
    }

    public static final Throwable m8525T(Exception exc, List<? extends Exception> list) {
        C8298k.m12934e(exc, "$this$withSuppressed");
        C8298k.m12934e(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        for (Exception exc2 : list) {
            C5040a.m24201a(exc, exc2);
        }
        return exc;
    }

    public static final void m8524U(AbstractC4550f fVar, int i) {
        C8298k.m12934e(fVar, "$this$writeMedium");
        fVar.mo27349C((i >>> 16) & 255);
        fVar.mo27349C((i >>> 8) & 255);
        fVar.mo27349C(i & 255);
    }

    public static final <E> void m8523a(List<E> list, E e) {
        C8298k.m12934e(list, "$this$addIfAbsent");
        if (!list.contains(e)) {
            list.add(e);
        }
    }

    public static final int m8522b(byte b, int i) {
        return b & i;
    }

    public static final int m8521c(short s, int i) {
        return s & i;
    }

    public static final long m8520d(int i, long j) {
        return i & j;
    }

    public static final AbstractC9114t.AbstractC9117c m8519e(AbstractC9114t tVar) {
        C8298k.m12934e(tVar, "$this$asFactory");
        return new C9490a(tVar);
    }

    public static final boolean m8518f(String str) {
        C8298k.m12934e(str, "$this$canParseAsIpAddress");
        return f30725g.m648a(str);
    }

    public static final boolean m8517g(C9125w wVar, C9125w wVar2) {
        C8298k.m12934e(wVar, "$this$canReuseConnectionFor");
        C8298k.m12934e(wVar2, "other");
        return C8298k.m12937b(wVar.m10347h(), wVar2.m10347h()) && wVar.m10343l() == wVar2.m10343l() && C8298k.m12937b(wVar.m10339p(), wVar2.m10339p());
    }

    public static final int m8516h(String str, long j, TimeUnit timeUnit) {
        C8298k.m12934e(str, "name");
        boolean z = true;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis <= ((long) Integer.MAX_VALUE)) {
                    if (millis == 0 && i > 0) {
                        z = false;
                    }
                    if (z) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException((str + " too small.").toString());
                }
                throw new IllegalArgumentException((str + " too large.").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException((str + " < 0").toString());
    }

    public static final void m8515i(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void m8514j(Closeable closeable) {
        C8298k.m12934e(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void m8513k(Socket socket) {
        C8298k.m12934e(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!C8298k.m12937b(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] m8512l(String[] strArr, String str) {
        C8298k.m12934e(strArr, "$this$concat");
        C8298k.m12934e(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        C8298k.m12935d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[C5296i.m23388s(strArr2)] = str;
        return strArr2;
    }

    public static final int m8511m(String str, char c, int i, int i2) {
        C8298k.m12934e(str, "$this$delimiterOffset");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int m8510n(String str, String str2, int i, int i2) {
        C8298k.m12934e(str, "$this$delimiterOffset");
        C8298k.m12934e(str2, "delimiters");
        while (i < i2) {
            if (C11452o.m619B(str2, str.charAt(i), false, 2, null)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int m8509o(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return m8511m(str, c, i, i2);
    }

    public static final boolean m8508p(AbstractC4537a0 a0Var, int i, TimeUnit timeUnit) {
        C8298k.m12934e(a0Var, "$this$discard");
        C8298k.m12934e(timeUnit, "timeUnit");
        try {
            return m8537H(a0Var, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String m8507q(String str, Object... objArr) {
        C8298k.m12934e(str, "format");
        C8298k.m12934e(objArr, "args");
        C8309v vVar = C8309v.f26791a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        C8298k.m12935d(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final boolean m8506r(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C8298k.m12934e(strArr, "$this$hasIntersection");
        C8298k.m12934e(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long m8505s(C9078d0 d0Var) {
        C8298k.m12934e(d0Var, "$this$headersContentLength");
        String h = d0Var.m10523F0().m10373h("Content-Length");
        if (h != null) {
            return m8529P(h, -1L);
        }
        return -1L;
    }

    @SafeVarargs
    public static final <T> List<T> m8504t(T... tArr) {
        C8298k.m12934e(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(C5304n.m23364h(Arrays.copyOf(objArr, objArr.length)));
        C8298k.m12935d(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int m8503u(String[] strArr, String str, Comparator<String> comparator) {
        C8298k.m12934e(strArr, "$this$indexOf");
        C8298k.m12934e(str, "value");
        C8298k.m12934e(comparator, "comparator");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int m8502v(String str) {
        C8298k.m12934e(str, "$this$indexOfControlOrNonAscii");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (C8298k.m12933f(charAt, 31) <= 0 || C8298k.m12933f(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int m8501w(String str, int i, int i2) {
        C8298k.m12934e(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int m8500x(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m8501w(str, i, i2);
    }

    public static final int m8499y(String str, int i, int i2) {
        C8298k.m12934e(str, "$this$indexOfLastNonAsciiWhitespace");
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ') {
                    if (i3 == i) {
                        break;
                    }
                    i3--;
                } else {
                    return i3 + 1;
                }
            }
        }
        return i;
    }

    public static int m8498z(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m8499y(str, i, i2);
    }
}
