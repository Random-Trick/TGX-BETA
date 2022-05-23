package vb;

import ab.e;
import ab.n;
import ab.o;
import cc.c;
import hc.a0;
import hc.f;
import hc.g;
import hc.h;
import hc.r;
import j$.util.DesugarTimeZone;
import ja.d0;
import ja.h0;
import ja.i;
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
import ra.k;
import ub.c0;
import ub.e0;
import ub.t;
import ub.v;
import ub.w;
import ub.z;
import xa.l;

public final class b {
    public static final byte[] f24809a;
    public static final e0 f24811c;
    public static final c0 f24812d;
    public static final r f24813e;
    public static final TimeZone f24814f;
    public static final String f24817i;
    public static final v f24810b = v.f23936b.g(new String[0]);
    public static final e f24815g = new e("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    public static final boolean f24816h = false;

    public static final class a implements t.c {
        public final t f24818a;

        public a(t tVar) {
            this.f24818a = tVar;
        }

        @Override
        public final t a(ub.e eVar) {
            k.e(eVar, "it");
            return this.f24818a;
        }
    }

    public static final class ThreadFactoryC0231b implements ThreadFactory {
        public final String f24819a;
        public final boolean f24820b;

        public ThreadFactoryC0231b(String str, boolean z10) {
            this.f24819a = str;
            this.f24820b = z10;
        }

        @Override
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f24819a);
            thread.setDaemon(this.f24820b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f24809a = bArr;
        f24811c = e0.a.c(e0.f23793a, bArr, null, 1, null);
        f24812d = c0.a.b(c0.f23748a, bArr, null, 0, 0, 7, null);
        r.a aVar = r.M;
        h.a aVar2 = h.N;
        f24813e = aVar.d(aVar2.a("efbbbf"), aVar2.a("feff"), aVar2.a("fffe"), aVar2.a("0000ffff"), aVar2.a("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        k.c(timeZone);
        f24814f = timeZone;
        String name = z.class.getName();
        k.d(name, "OkHttpClient::class.java.name");
        f24817i = o.c0(o.b0(name, "okhttp3."), "Client");
    }

    public static final int A(String str, int i10) {
        k.e(str, "$this$indexOfNonWhitespace");
        int length = str.length();
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt != ' ' && charAt != '\t') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static final String[] B(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        k.e(strArr, "$this$intersect");
        k.e(strArr2, "other");
        k.e(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i10++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    public static final boolean C(Socket socket, g gVar) {
        k.e(socket, "$this$isHealthy");
        k.e(gVar, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z10 = !gVar.C();
                socket.setSoTimeout(soTimeout);
                return z10;
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

    public static final boolean D(String str) {
        k.e(str, "name");
        return n.l(str, "Authorization", true) || n.l(str, "Cookie", true) || n.l(str, "Proxy-Authorization", true) || n.l(str, "Set-Cookie", true);
    }

    public static final int E(char c10) {
        if ('0' <= c10 && '9' >= c10) {
            return c10 - '0';
        }
        char c11 = 'a';
        if ('a' > c10 || 'f' < c10) {
            c11 = 'A';
            if ('A' > c10 || 'F' < c10) {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static final int F(g gVar) {
        k.e(gVar, "$this$readMedium");
        return b(gVar.readByte(), 255) | (b(gVar.readByte(), 255) << 16) | (b(gVar.readByte(), 255) << 8);
    }

    public static final int G(hc.e eVar, byte b10) {
        k.e(eVar, "$this$skipAll");
        int i10 = 0;
        while (!eVar.C() && eVar.D0(0L) == b10) {
            i10++;
            eVar.readByte();
        }
        return i10;
    }

    public static final boolean H(hc.a0 r11, int r12, java.util.concurrent.TimeUnit r13) {
        throw new UnsupportedOperationException("Method not decompiled: vb.b.H(hc.a0, int, java.util.concurrent.TimeUnit):boolean");
    }

    public static final ThreadFactory I(String str, boolean z10) {
        k.e(str, "name");
        return new ThreadFactoryC0231b(str, z10);
    }

    public static final List<c> J(v vVar) {
        k.e(vVar, "$this$toHeaderList");
        xa.g j10 = l.j(0, vVar.size());
        ArrayList arrayList = new ArrayList(ja.o.o(j10, 10));
        Iterator<Integer> it = j10.iterator();
        while (it.hasNext()) {
            int d10 = ((d0) it).d();
            arrayList.add(new c(vVar.g(d10), vVar.r(d10)));
        }
        return arrayList;
    }

    public static final v K(List<c> list) {
        k.e(list, "$this$toHeaders");
        v.a aVar = new v.a();
        for (c cVar : list) {
            aVar.c(cVar.a().u(), cVar.b().u());
        }
        return aVar.d();
    }

    public static final String L(w wVar, boolean z10) {
        String str;
        k.e(wVar, "$this$toHostHeader");
        if (o.C(wVar.h(), ":", false, 2, null)) {
            str = '[' + wVar.h() + ']';
        } else {
            str = wVar.h();
        }
        if (!z10 && wVar.l() == w.f23940l.c(wVar.p())) {
            return str;
        }
        return str + ':' + wVar.l();
    }

    public static String M(w wVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return L(wVar, z10);
    }

    public static final <T> List<T> N(List<? extends T> list) {
        k.e(list, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(ja.v.V(list));
        k.d(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final <K, V> Map<K, V> O(Map<K, ? extends V> map) {
        k.e(map, "$this$toImmutableMap");
        if (map.isEmpty()) {
            return h0.d();
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        k.d(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return unmodifiableMap;
    }

    public static final long P(String str, long j10) {
        k.e(str, "$this$toLongOrDefault");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int Q(String str, int i10) {
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
        return i10;
    }

    public static final String R(String str, int i10, int i11) {
        k.e(str, "$this$trimSubstring");
        int w10 = w(str, i10, i11);
        String substring = str.substring(w10, y(str, w10, i11));
        k.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static String S(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return R(str, i10, i11);
    }

    public static final Throwable T(Exception exc, List<? extends Exception> list) {
        k.e(exc, "$this$withSuppressed");
        k.e(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        for (Exception exc2 : list) {
            ia.a.a(exc, exc2);
        }
        return exc;
    }

    public static final void U(f fVar, int i10) {
        k.e(fVar, "$this$writeMedium");
        fVar.D((i10 >>> 16) & 255);
        fVar.D((i10 >>> 8) & 255);
        fVar.D(i10 & 255);
    }

    public static final <E> void a(List<E> list, E e10) {
        k.e(list, "$this$addIfAbsent");
        if (!list.contains(e10)) {
            list.add(e10);
        }
    }

    public static final int b(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int c(short s10, int i10) {
        return s10 & i10;
    }

    public static final long d(int i10, long j10) {
        return i10 & j10;
    }

    public static final t.c e(t tVar) {
        k.e(tVar, "$this$asFactory");
        return new a(tVar);
    }

    public static final boolean f(String str) {
        k.e(str, "$this$canParseAsIpAddress");
        return f24815g.a(str);
    }

    public static final boolean g(w wVar, w wVar2) {
        k.e(wVar, "$this$canReuseConnectionFor");
        k.e(wVar2, "other");
        return k.b(wVar.h(), wVar2.h()) && wVar.l() == wVar2.l() && k.b(wVar.p(), wVar2.p());
    }

    public static final int h(String str, long j10, TimeUnit timeUnit) {
        k.e(str, "name");
        boolean z10 = true;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j10);
                if (millis <= ((long) Integer.MAX_VALUE)) {
                    if (millis == 0 && i10 > 0) {
                        z10 = false;
                    }
                    if (z10) {
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

    public static final void i(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void j(Closeable closeable) {
        k.e(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void k(Socket socket) {
        k.e(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!k.b(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] l(String[] strArr, String str) {
        k.e(strArr, "$this$concat");
        k.e(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        k.d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[i.s(strArr2)] = str;
        return strArr2;
    }

    public static final int m(String str, char c10, int i10, int i11) {
        k.e(str, "$this$delimiterOffset");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int n(String str, String str2, int i10, int i11) {
        k.e(str, "$this$delimiterOffset");
        k.e(str2, "delimiters");
        while (i10 < i11) {
            if (o.B(str2, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int o(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return m(str, c10, i10, i11);
    }

    public static final boolean p(a0 a0Var, int i10, TimeUnit timeUnit) {
        k.e(a0Var, "$this$discard");
        k.e(timeUnit, "timeUnit");
        try {
            return H(a0Var, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String q(String str, Object... objArr) {
        k.e(str, "format");
        k.e(objArr, "args");
        ra.v vVar = ra.v.f21821a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        k.d(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final boolean r(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        k.e(strArr, "$this$hasIntersection");
        k.e(comparator, "comparator");
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

    public static final long s(ub.d0 d0Var) {
        k.e(d0Var, "$this$headersContentLength");
        String f10 = d0Var.F0().f("Content-Length");
        if (f10 != null) {
            return P(f10, -1L);
        }
        return -1L;
    }

    @SafeVarargs
    public static final <T> List<T> t(T... tArr) {
        k.e(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(ja.n.h(Arrays.copyOf(objArr, objArr.length)));
        k.d(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int u(String[] strArr, String str, Comparator<String> comparator) {
        k.e(strArr, "$this$indexOf");
        k.e(str, "value");
        k.e(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], str) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int v(String str) {
        k.e(str, "$this$indexOfControlOrNonAscii");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (k.f(charAt, 31) <= 0 || k.f(charAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int w(String str, int i10, int i11) {
        k.e(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int x(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return w(str, i10, i11);
    }

    public static final int y(String str, int i10, int i11) {
        k.e(str, "$this$indexOfLastNonAsciiWhitespace");
        int i12 = i11 - 1;
        if (i12 >= i10) {
            while (true) {
                char charAt = str.charAt(i12);
                if (charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ') {
                    if (i12 == i10) {
                        break;
                    }
                    i12--;
                } else {
                    return i12 + 1;
                }
            }
        }
        return i10;
    }

    public static int z(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return y(str, i10, i11);
    }
}
