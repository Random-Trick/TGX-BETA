package he;

import ae.b0;
import ae.c0;
import ae.z;
import android.content.SharedPreferences;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import ce.a0;
import ce.j0;
import gd.w;
import hd.t2;
import he.i;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import me.vkryl.leveldb.LevelDB;
import oc.v0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.drinkmore.Tracer;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import zd.h9;
import zd.hj;
import zd.o6;
import zd.tb;
import zd.ya;

public class i {
    public static final AtomicBoolean O = new AtomicBoolean(false);
    public static volatile i P;
    public static final int Q;
    public static final long R;
    public static final float[] S;
    public static final float T;
    public static final float U;
    public List<t> A;
    public lb.d<k> E;
    public HashMap<String, kb.b> F;
    public C0119i G;
    public Long I;
    public List<String> J;
    public f L;
    public f M;
    public h N;
    public Integer f13820a;
    public Long f13821b;
    public Integer f13822c;
    public Float f13823d;
    public Long f13824e;
    public t f13825f;
    public Integer f13826g;
    public Integer f13827h;
    public Integer f13828i;
    public Long f13829j;
    public Integer f13830k;
    public Integer f13831l;
    public Float f13833n;
    public Integer f13834o;
    public Integer f13835p;
    public Integer f13836q;
    public Integer f13838s;
    public lb.d<c> f13839t;
    public lb.d<q> f13840u;
    public final LevelDB f13841v;
    public boolean f13842w;
    public long f13843x;
    public Boolean f13844y;
    public final r f13832m = new r("settings_tdlib_other", "settings_tdlib_log_size", "settings_tdlib_verbosity");
    public final p f13837r = new p(this);
    public final List<Reference<u>> f13845z = new ArrayList();
    public final List<Reference<g>> B = new ArrayList();
    public final lb.d<m> C = new lb.d<>();
    public lb.d<n> D = new lb.d<>();
    public int H = -1;
    public long K = SystemClock.uptimeMillis();

    public class a implements LevelDB.b {
        public a() {
        }

        @Override
        public boolean a(LevelDB levelDB, Throwable th) {
            Tracer.d(th);
            return true;
        }

        @Override
        public void b(LevelDB levelDB, String str, Throwable th) {
            Log.e(org.thunderdog.challegram.Log.LOG_TAG, str, th);
        }
    }

    public class b extends kb.b {
        public final String M;

        public b(String str) {
            this.M = str;
        }

        public void h(String str) {
            i.this.l2(str);
        }

        @Override
        public void b() {
            if (i.this.d6(this.M)) {
                gd.l.a().c(this, 1000);
            } else {
                i.this.F.remove(this.M);
            }
            final String str = this.M;
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    i.b.this.h(str);
                }
            });
        }
    }

    public interface c {
        void h5(int i10);
    }

    public static class e {
        public final long f13850a;
        public final String f13851b;
        public final long f13852c;
        public final long f13853d;
        public final int f13854e;
        public final int f13855f;
        public int f13856g;

        public e(long j10, String str, long j11, long j12, int i10, int i11, int i12) {
            this.f13850a = j10;
            this.f13851b = str;
            this.f13852c = j11;
            this.f13853d = j12;
            this.f13856g = i10;
            this.f13854e = i11;
            this.f13855f = i12;
        }

        public int c() {
            int i10 = this.f13856g;
            if ((i10 & 4) == 0) {
                return ((i10 & 8) == 0 && (i10 & 16) == 0) ? 0 : 3;
            }
            if (Client.j(this.f13851b)) {
                return 2;
            }
            if (Client.i(this.f13851b)) {
                return 4;
            }
            return Client.k(this.f13851b) ? 3 : 1;
        }
    }

    public static class f extends d {
        public f() {
            super("apple", 5, w.i1(R.string.EmojiBuiltIn), 0);
        }

        @Override
        public int d(boolean z10) {
            return i.c2().P0(this, z10);
        }

        @Override
        public boolean equals(Object obj) {
            return (obj instanceof f) && super.equals(obj);
        }

        @Override
        public void f(kb.i iVar) {
            id.d.z().x(this, iVar);
        }

        @Override
        public boolean g() {
            return this.f13847a.equals("apple");
        }

        public f(String str) {
            super(str);
        }

        public f(TdApi.Message message) {
            super(message, "#emoji", R.string.EmojiBuiltIn);
        }
    }

    public interface g {
        void a(float f10);
    }

    public static class h extends d {
        public h() {
            super("material-baseline", 1, w.i1(R.string.IconsBuiltIn), 0);
        }

        @Override
        public int d(boolean z10) {
            return 0;
        }

        @Override
        public boolean equals(Object obj) {
            return (obj instanceof h) && super.equals(obj);
        }

        @Override
        public void f(kb.i iVar) {
            iVar.a(false);
        }

        @Override
        public boolean g() {
            return "material-baseline".equals(this.f13847a);
        }

        public h(TdApi.Message message) {
            super(message, "#icons", R.string.IconsBuiltIn);
        }
    }

    public static class C0119i {
        public final TdApi.LanguagePackInfo f13857a;
        public final int f13858b;
        public final Locale f13859c;

        public C0119i(TdApi.LanguagePackInfo languagePackInfo) {
            this.f13857a = languagePackInfo;
            this.f13858b = w.a2(languagePackInfo.pluralCode);
            this.f13859c = new Locale(w.i2(!ib.i.i(languagePackInfo.baseLanguagePackId) ? languagePackInfo.pluralCode : languagePackInfo.f19945id));
        }
    }

    public static class j implements nb.b {
        public double f13860a;
        public double f13861b;
        public float f13862c;

        public j(double d10, double d11, float f10) {
            this.f13860a = d10;
            this.f13861b = d11;
            this.f13862c = f10;
        }

        @Override
        public void a(nb.a aVar) {
            this.f13860a = aVar.i();
            this.f13861b = aVar.i();
            this.f13862c = aVar.k();
        }

        @Override
        public int b() {
            return 20;
        }

        @Override
        public void c(nb.a aVar) {
            aVar.D(this.f13860a);
            aVar.D(this.f13861b);
            aVar.F(this.f13862c);
        }
    }

    public interface k {
        void f6(String str);
    }

    public static class l implements Comparable<l> {
        public TdApi.ProxyType M;
        public String O;
        public int P;
        public TdApi.Error R;
        public int S;
        public int T;
        public final int f13863a;
        public String f13864b;
        public int f13865c;
        public int N = -1;
        public long Q = -1;

        public l(int i10, String str, int i11, TdApi.ProxyType proxyType, String str2) {
            this.f13863a = i10;
            this.f13864b = str;
            this.f13865c = i11;
            this.M = proxyType;
            this.O = str2;
        }

        public static boolean c(TdApi.ProxyType proxyType) {
            return proxyType != null && proxyType.getConstructor() == -890027341;
        }

        public static Object f(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return new ie.o(null, R.id.theme_color_textLight);
        }

        public boolean b() {
            return c(this.M);
        }

        public int compareTo(l lVar) {
            int i10 = this.N;
            int i11 = lVar.N;
            if (i10 != i11) {
                return Integer.compare(i10, i11);
            }
            return Integer.compare(lVar.f13863a, this.f13863a);
        }

        public CharSequence e() {
            String str;
            int i10;
            if (this.M == null) {
                return null;
            }
            if (ib.i.i(this.O)) {
                str = this.f13864b + ":" + this.f13865c;
            } else {
                str = this.O;
            }
            int constructor = this.M.getConstructor();
            if (constructor == -1964826627) {
                i10 = R.string.ProxyMtproto;
            } else if (constructor == -1547188361) {
                i10 = R.string.ProxyHttp;
            } else if (constructor == -890027341) {
                TdApi.ProxyTypeSocks5 proxyTypeSocks5 = (TdApi.ProxyTypeSocks5) this.M;
                i10 = (this.f13865c != 9050 || !ib.i.i(proxyTypeSocks5.username) || !ib.i.i(proxyTypeSocks5.password) || !v0.q1(this.f13864b.toLowerCase())) ? R.string.ProxySocks5 : R.string.ProxyTorNetwork;
            } else {
                throw new IllegalStateException();
            }
            return w.h1(i10, he.l.f13897a, str);
        }

        public String toString() {
            CharSequence e10 = e();
            return e10 != null ? e10.toString() : super.toString();
        }
    }

    public interface m {
        void X0(l lVar, boolean z10);

        void a3(int i10, String str, int i11, TdApi.ProxyType proxyType, String str2, boolean z10, boolean z11);

        void g7(boolean z10);
    }

    public interface n {
        void a(boolean z10, int i10);
    }

    public static class o {
        public final ob.d f13866a;
        public final int f13867b;
        public final long[] f13868c;
        public final boolean f13869d;
        public final long f13870e;

        public static class a {
            public long f13871a;
            public long f13872b;
            public long f13873c;
            public long[] f13874d;
            public int f13875e;
            public long[] f13876f;
            public boolean f13877g;

            public a(long j10) {
                this.f13871a = j10;
            }

            public o i() {
                return new o(new ob.d(this.f13871a, this.f13872b, this.f13874d), this.f13875e, this.f13876f, this.f13877g, this.f13873c);
            }
        }

        public o(ob.d dVar, int i10, long[] jArr, boolean z10, long j10) {
            this.f13866a = dVar;
            this.f13867b = i10;
            this.f13868c = jArr;
            this.f13869d = z10;
            this.f13870e = j10;
        }
    }

    public static class p extends Handler {
        public final i f13878a;

        public p(i iVar) {
            super(Looper.getMainLooper());
            this.f13878a = iVar;
        }

        @Override
        public void handleMessage(Message message) {
            this.f13878a.T1(message);
        }
    }

    public interface q {
        void h6(long j10, long j11);
    }

    public class r {
        public final String f13879a;
        public final String f13880b;
        public final String f13881c;
        public Integer f13882d;
        public Map<String, int[]> f13883e;

        public r(String str, String str2, String str3) {
            this.f13879a = str;
            this.f13880b = str2;
            this.f13881c = str3;
        }

        public void a() {
            TdApi.LogStream logStream;
            if (j0.f5280g != 1) {
                if (this.f13883e == null) {
                    this.f13883e = new HashMap();
                }
                int i10 = 0;
                for (LevelDB.a aVar : i.this.f13841v.g(this.f13881c)) {
                    String l10 = aVar.l();
                    int max = Math.max(1, aVar.h());
                    if (this.f13881c.length() == l10.length()) {
                        i10 = max;
                    } else if (l10.length() > this.f13881c.length() + 1) {
                        String substring = l10.substring(this.f13881c.length() + 1);
                        int[] iArr = this.f13883e.get(substring);
                        int k10 = iArr != null ? iArr[1] : k(substring);
                        if (n(substring, max)) {
                            if (iArr != null) {
                                iArr[0] = max;
                            } else {
                                this.f13883e.put(substring, new int[]{max, k10});
                            }
                        }
                    }
                }
                o(i10);
                if (j()) {
                    logStream = new TdApi.LogStreamDefault();
                } else {
                    logStream = new TdApi.LogStreamFile(ya.H0(false), e(), true);
                }
                TdApi.Object e10 = Client.e(new TdApi.SetLogStream(logStream));
                if (e10.getConstructor() == -1679978726) {
                    Tracer.i(-1, TdApi.SetLogStream.class, (TdApi.Error) e10, new RuntimeException().getStackTrace());
                }
            }
        }

        public final boolean b(int i10) {
            return ib.c.b(g(), i10);
        }

        public void c() {
            r(null, 0);
        }

        public int d(String str) {
            Map<String, int[]> map = this.f13883e;
            int[] iArr = map != null ? map.get(str) : null;
            if (iArr != null) {
                return iArr[1];
            }
            int k10 = k(str);
            this.f13883e.put(str, new int[]{k10, k10});
            return k10;
        }

        public long e() {
            return i.this.e1(this.f13880b, i.R);
        }

        public List<String> f() {
            ArrayList arrayList;
            TdApi.Object e10 = Client.e(new TdApi.GetLogTags());
            int i10 = 0;
            if (e10 instanceof TdApi.LogTags) {
                String[] strArr = ((TdApi.LogTags) e10).tags;
                int length = strArr.length;
                Map<String, int[]> map = this.f13883e;
                if (map != null) {
                    i10 = map.size();
                }
                arrayList = new ArrayList(length + i10);
                Collections.addAll(arrayList, strArr);
            } else {
                Map<String, int[]> map2 = this.f13883e;
                if (map2 != null) {
                    i10 = map2.size();
                }
                arrayList = new ArrayList(i10);
            }
            Map<String, int[]> map3 = this.f13883e;
            if (map3 != null) {
                for (String str : map3.keySet()) {
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                }
            }
            return arrayList;
        }

        public final int g() {
            if (this.f13882d == null) {
                this.f13882d = Integer.valueOf(i.this.f13841v.getInt(this.f13879a, 0));
            }
            return this.f13882d.intValue();
        }

        public int h(String str) {
            if (ib.i.i(str)) {
                return k(str);
            }
            Map<String, int[]> map = this.f13883e;
            int[] iArr = map != null ? map.get(str) : null;
            if (iArr != null) {
                return iArr[0];
            }
            int k10 = k(str);
            this.f13883e.put(str, new int[]{k10, k10});
            return k10;
        }

        public boolean i() {
            return h(null) > 0;
        }

        public boolean j() {
            return b(2);
        }

        public final int k(String str) {
            TdApi.Object e10 = Client.e(ib.i.i(str) ? new TdApi.GetLogVerbosityLevel() : new TdApi.GetLogTagVerbosityLevel(str));
            if (e10 instanceof TdApi.LogVerbosityLevel) {
                return ((TdApi.LogVerbosityLevel) e10).verbosityLevel;
            }
            return -1;
        }

        public void l() {
            i.this.f13841v.edit();
            r(null, 0);
            Map<String, int[]> map = this.f13883e;
            if (map != null) {
                for (Map.Entry<String, int[]> entry : map.entrySet()) {
                    r(entry.getKey(), entry.getValue()[1]);
                }
            }
            p(i.R);
            i.this.f13841v.apply();
        }

        public final boolean m(int i10, boolean z10) {
            int g10 = g();
            int h10 = ib.c.h(g10, i10, z10);
            if (g10 == h10) {
                return false;
            }
            this.f13882d = Integer.valueOf(h10);
            i.this.f13841v.putInt(this.f13879a, h10);
            a();
            return true;
        }

        public final boolean n(String str, int i10) {
            return Client.e(new TdApi.SetLogTagVerbosityLevel(str, i10)) instanceof TdApi.Ok;
        }

        public final boolean o(int i10) {
            return Client.e(new TdApi.SetLogVerbosityLevel(i10)) instanceof TdApi.Ok;
        }

        public void p(long j10) {
            if (j10 == i.R) {
                i.this.f13841v.remove(this.f13880b);
            } else {
                i.this.f13841v.putLong(this.f13880b, j10);
            }
            a();
        }

        public void q(boolean z10) {
            m(2, z10);
        }

        public void r(String str, int i10) {
            if (ib.i.i(str)) {
                i.this.u3(this.f13881c, i10);
                o(i10);
                return;
            }
            if (this.f13883e == null) {
                this.f13883e = new HashMap();
            }
            int[] iArr = this.f13883e.get(str);
            int k10 = iArr != null ? iArr[1] : k(str);
            if (i10 != (iArr != null ? iArr[0] : k10) && (Client.e(new TdApi.SetLogTagVerbosityLevel(str, i10)) instanceof TdApi.Ok)) {
                if (iArr != null) {
                    iArr[0] = i10;
                } else {
                    int[] iArr2 = {i10, k10};
                    this.f13883e.put(str, iArr2);
                    iArr = iArr2;
                }
                if (iArr[0] == iArr[1]) {
                    i iVar = i.this;
                    iVar.F3(this.f13881c + "_" + str);
                    return;
                }
                i iVar2 = i.this;
                iVar2.u3(this.f13881c + "_" + str, i10);
            }
        }
    }

    public static class s {
        public final String f13885a;
        public final String f13886b;
        public final Map<Integer, List<String>> f13887c = new HashMap();
        public final Map<Float, List<String>> f13888d = new HashMap();
        public int f13889e = 0;

        public s(String str, String str2) {
            this.f13885a = str;
            this.f13886b = str2;
        }

        public void a(String str, int i10) {
            Integer valueOf = Integer.valueOf(i10);
            List<String> list = this.f13887c.get(valueOf);
            if (list == null) {
                list = new ArrayList<>();
                this.f13887c.put(valueOf, list);
            }
            list.add(str);
        }

        public void b(String str, float f10) {
            Float valueOf = Float.valueOf(f10);
            List<String> list = this.f13888d.get(valueOf);
            if (list == null) {
                list = new ArrayList<>();
                this.f13888d.put(valueOf, list);
            }
            list.add(str);
        }
    }

    public static class t {
        public final v f13890a;
        public final int f13891b;
        public final long f13892c;

        public t(v vVar) {
            this(vVar, 29);
        }

        public t a(v vVar) {
            return new t(vVar, this.f13891b, this.f13892c);
        }

        public long b(v vVar, int i10, long j10) {
            return Math.round(vVar.f13893a * vVar.f13894b * i10 * 0.089d);
        }

        public int c(int i10) {
            int i11 = this.f13891b;
            if (i11 > 0) {
                return Math.min(i10, i11);
            }
            return 29;
        }

        public v d(int i10, int i11) {
            int max = Math.max(i10, i11);
            int min = Math.min(i10, i11);
            v vVar = this.f13890a;
            float f10 = max;
            float f11 = min;
            float min2 = Math.min(vVar.f13893a / f10, vVar.f13894b / f11);
            if (min2 > 1.0f) {
                return null;
            }
            int i12 = (int) (f10 * min2);
            int i13 = (int) (f11 * min2);
            if (i12 % 2 == 1) {
                i12--;
            }
            if (i13 % 2 == 1) {
                i13--;
            }
            return new v(i12, i13);
        }

        public boolean e() {
            return this.f13890a.a() && this.f13891b == 29 && this.f13892c == Long.MIN_VALUE;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            t tVar = (t) obj;
            return this.f13891b == tVar.f13891b && this.f13892c == tVar.f13892c && this.f13890a.equals(tVar.f13890a);
        }

        public int[] f() {
            int i10;
            if (e()) {
                return null;
            }
            int i11 = this.f13891b;
            if (i11 != 29) {
                i10 = 3;
            } else {
                v vVar = this.f13890a;
                int i12 = vVar.f13893a;
                i10 = i12 != vVar.f13894b ? 2 : i12 != 0 ? 1 : 0;
            }
            if (i10 == 0) {
                return null;
            }
            int[] iArr = new int[i10];
            v vVar2 = this.f13890a;
            iArr[0] = vVar2.f13893a;
            if (i10 > 1) {
                iArr[1] = vVar2.f13894b;
            }
            if (i10 > 2) {
                iArr[2] = i11;
            }
            if (i10 > 3) {
                iArr[3] = (int) Math.round(mb.c.f17335a.c(this.f13892c));
            }
            return iArr;
        }

        public int hashCode() {
            return Objects.hash(this.f13890a, Integer.valueOf(this.f13891b), Long.valueOf(this.f13892c));
        }

        public t(v vVar, int i10) {
            this(vVar, i10, Long.MIN_VALUE);
        }

        public t(v vVar, int i10, long j10) {
            this.f13890a = vVar;
            this.f13891b = i10;
            this.f13892c = j10;
        }

        public t() {
            this((int[]) null);
        }

        public t(t tVar) {
            this.f13890a = tVar.f13890a;
            this.f13891b = tVar.f13891b;
            this.f13892c = tVar.f13892c;
        }

        public t(int[] iArr) {
            long j10 = Long.MIN_VALUE;
            int i10 = 29;
            if (iArr == null || iArr.length <= 0) {
                this.f13890a = new v(854);
                this.f13891b = 29;
                this.f13892c = Long.MIN_VALUE;
                return;
            }
            this.f13890a = new v(iArr[0], iArr.length > 1 ? iArr[1] : iArr[0]);
            this.f13891b = iArr.length > 2 ? iArr[2] : i10;
            this.f13892c = iArr.length > 3 ? (long) mb.c.P.b(iArr[3]) : j10;
        }
    }

    public interface u {
        void p1(boolean z10);

        void y4(boolean z10);
    }

    static {
        Q = Build.VERSION.SDK_INT >= 29 ? 3 : 0;
        R = mb.p.f17347c.b(50.0d);
        float[] fArr = {12.0f, 13.0f, 14.0f, 15.0f, 16.0f, 18.0f, 20.0f, 22.0f, 24.0f, 26.0f};
        S = fArr;
        T = fArr[0];
        U = fArr[fArr.length - 1];
    }

    public i() {
        int i10;
        File file = new File(j0.n().getFilesDir(), "pmc");
        if (file.exists() || file.mkdir()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            LevelDB levelDB = new LevelDB(new File(file, "db").getPath(), true, new a());
            this.f13841v = levelDB;
            org.thunderdog.challegram.Log.load(levelDB);
            try {
                i10 = Math.max(0, levelDB.U("version"));
            } catch (FileNotFoundException unused) {
                x2();
                i10 = 0;
            }
            if (i10 > 38) {
                org.thunderdog.challegram.Log.e("Downgrading database version: %d -> %d", Integer.valueOf(i10), 38);
                this.f13841v.putInt("version", 38);
            }
            for (int i11 = i10 + 1; i11 <= 38; i11++) {
                LevelDB f10 = this.f13841v.edit();
                m6(this.f13841v, f10, i11);
                f10.putInt("version", i11);
                f10.apply();
            }
            org.thunderdog.challegram.Log.i("Opened database in %dms", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            G();
            return;
        }
        throw new IllegalStateException("Unable to create working directory");
    }

    @Deprecated
    public static File B1() {
        return new File(j0.n().getFilesDir(), "tdlib_proxy.bin");
    }

    public static TdApi.LanguagePackInfo B3(LevelDB levelDB, String str, boolean z10) {
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z11 = false;
        for (LevelDB.a aVar : levelDB.g(str)) {
            String l10 = aVar.l();
            if (l10.length() == str.length()) {
                str2 = aVar.k();
            } else {
                String substring = l10.substring(str.length());
                substring.hashCode();
                char c10 = 65535;
                switch (substring.hashCode()) {
                    case -985163900:
                        if (substring.equals("plural")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 113258:
                        if (substring.equals("rtl")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 3016401:
                        if (substring.equals("base")) {
                            c10 = 2;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        str4 = aVar.k();
                        continue;
                    case 1:
                        z11 = aVar.d();
                        continue;
                    case 2:
                        str3 = aVar.k();
                        continue;
                }
            }
        }
        if (!ib.i.i(str2)) {
            if (ib.i.i(str3) && t2.g3(str2)) {
                str3 = w.a0();
            }
            if (ib.i.i(str4)) {
                str4 = w.i2(str3 != null ? str3 : str2);
            }
            return w.g2(str2, str3, str4, z11);
        } else if (z10) {
            return w.Y();
        } else {
            return null;
        }
    }

    public static int C1(TdApi.ProxyType proxyType) {
        int constructor = proxyType.getConstructor();
        if (constructor == -1964826627) {
            return 1;
        }
        if (constructor == -1547188361) {
            return 3;
        }
        if (constructor == -890027341) {
            return 2;
        }
        throw new UnsupportedOperationException();
    }

    public static l C3(int i10, byte[] bArr, nb.a aVar) {
        TdApi.ProxyTypeSocks5 proxyTypeSocks5;
        if (!(bArr == null || bArr.length == 0)) {
            try {
                if (aVar == null) {
                    aVar = new nb.a(bArr);
                } else {
                    aVar.u(bArr);
                }
                String q10 = aVar.q();
                int m10 = aVar.m();
                byte e10 = aVar.e();
                boolean z10 = true;
                if (e10 == 1) {
                    TdApi.ProxyTypeSocks5 proxyTypeSocks52 = new TdApi.ProxyTypeSocks5("", "");
                    byte e11 = aVar.e();
                    if ((e11 & 1) != 0) {
                        proxyTypeSocks52.username = aVar.q();
                    }
                    proxyTypeSocks5 = proxyTypeSocks52;
                    if ((2 & e11) != 0) {
                        proxyTypeSocks52.password = aVar.q();
                        proxyTypeSocks5 = proxyTypeSocks52;
                    }
                } else if (e10 == 2) {
                    proxyTypeSocks5 = new TdApi.ProxyTypeMtproto(aVar.q());
                } else if (e10 == 3) {
                    ?? proxyTypeHttp = new TdApi.ProxyTypeHttp("", "", false);
                    byte e12 = aVar.e();
                    if ((e12 & 1) != 0) {
                        proxyTypeHttp.username = aVar.q();
                    }
                    if ((2 & e12) != 0) {
                        proxyTypeHttp.password = aVar.q();
                    }
                    if (aVar.e() != 1) {
                        z10 = false;
                    }
                    proxyTypeHttp.httpOnly = z10;
                    proxyTypeSocks5 = proxyTypeHttp;
                } else {
                    throw new IllegalArgumentException("typeId == " + ((int) e10));
                }
                return new l(i10, q10, m10, proxyTypeSocks5, null);
            } catch (Throwable th) {
                org.thunderdog.challegram.Log.w("Unable to read proxy configuration", th, new Object[0]);
            }
        }
        return null;
    }

    @Deprecated
    public static TdApi.Proxy D3(RandomAccessFile randomAccessFile) {
        if (nb.a.t(randomAccessFile) != 1456461592) {
            return null;
        }
        String r10 = nb.a.r(randomAccessFile);
        int t10 = nb.a.t(randomAccessFile);
        byte f10 = nb.a.f(randomAccessFile);
        String str = "";
        String r11 = (f10 & 1) != 0 ? nb.a.r(randomAccessFile) : str;
        if ((f10 & 2) != 0) {
            str = nb.a.r(randomAccessFile);
        }
        return new TdApi.Proxy(0, r10, t10, 0, false, new TdApi.ProxyTypeSocks5(r11, str));
    }

    public static String E1(TdApi.ProxyType proxyType) {
        int constructor = proxyType.getConstructor();
        if (constructor == -1547188361) {
            return ((TdApi.ProxyTypeHttp) proxyType).password;
        }
        if (constructor != -890027341) {
            return null;
        }
        return ((TdApi.ProxyTypeSocks5) proxyType).password;
    }

    public static int G1(TdApi.ProxyType proxyType) {
        int constructor = proxyType.getConstructor();
        if (constructor == -1964826627) {
            return 2;
        }
        if (constructor == -1547188361) {
            return 3;
        }
        if (constructor == -890027341) {
            return 1;
        }
        throw new UnsupportedOperationException();
    }

    public static String H1(TdApi.ProxyType proxyType) {
        int constructor = proxyType.getConstructor();
        if (constructor == -1547188361) {
            return ((TdApi.ProxyTypeHttp) proxyType).username;
        }
        if (constructor != -890027341) {
            return null;
        }
        return ((TdApi.ProxyTypeSocks5) proxyType).username;
    }

    public static String S1(int i10) {
        if (i10 == 0) {
            return "";
        }
        if (i10 == 1) {
            return "_dark";
        }
        return "_other" + i10;
    }

    public static void Y3(LevelDB levelDB, String str, TdApi.LanguagePackInfo languagePackInfo) {
        if (languagePackInfo == null || w.L1(languagePackInfo.f19945id)) {
            SharedPreferences.Editor remove = levelDB.edit().remove(str);
            SharedPreferences.Editor remove2 = remove.remove(str + "base");
            SharedPreferences.Editor remove3 = remove2.remove(str + "plural");
            remove3.remove(str + "rtl").apply();
            return;
        }
        LevelDB f10 = levelDB.edit();
        f10.putString(str, languagePackInfo.f19945id);
        if (ib.i.i(languagePackInfo.baseLanguagePackId) || t2.g3(languagePackInfo.f19945id)) {
            f10.remove(str + "base");
        } else {
            f10.putString(str + "base", languagePackInfo.baseLanguagePackId);
        }
        if (ib.i.i(languagePackInfo.pluralCode) || languagePackInfo.pluralCode.equals(languagePackInfo.f19945id)) {
            f10.remove(str + "plural");
        } else {
            f10.putString(str + "plural", languagePackInfo.pluralCode);
        }
        if (languagePackInfo.isRtl) {
            f10.putBoolean(str + "rtl", true);
        } else {
            f10.remove(str + "rtl");
        }
        f10.apply();
    }

    public static String Y5(int i10, int i11) {
        return "theme_history" + i10 + "_" + ae.j.O(i11);
    }

    public static String Z5(int i10, int i11) {
        return a6(i10, ae.j.O(i11));
    }

    public static String a6(int i10, String str) {
        return "theme" + i10 + "_c_" + str;
    }

    public static byte[] b4(java.lang.String r8, int r9, org.drinkless.td.libcore.telegram.TdApi.ProxyType r10) {
        throw new UnsupportedOperationException("Method not decompiled: he.i.b4(java.lang.String, int, org.drinkless.td.libcore.telegram.TdApi$ProxyType):byte[]");
    }

    public static String b6(int i10, int i11) {
        return c6(i10, ae.j.b0(i11));
    }

    public static i c2() {
        if (P == null) {
            synchronized (i.class) {
                if (P == null) {
                    if (!O.getAndSet(true)) {
                        P = new i();
                    } else {
                        throw new AssertionError();
                    }
                }
            }
        }
        return P;
    }

    public static String c6(int i10, String str) {
        return "theme" + i10 + "_p_" + str;
    }

    public static void d3(List<Reference<g>> list, float f10) {
        for (int size = list.size() - 1; size >= 0; size--) {
            g gVar = list.get(size).get();
            if (gVar != null) {
                gVar.a(f10);
            } else {
                list.remove(size);
            }
        }
    }

    public static boolean f2(float f10) {
        return f10 >= T && f10 <= U;
    }

    public static String i2(String str, int i10) {
        if (i10 == 0) {
            return str;
        }
        return i10 + "_" + str;
    }

    @Deprecated
    public static void i3(Map<String, String> map, String str) {
        if (str != null) {
            for (String str2 : str.split(",")) {
                String[] split = str2.split(":");
                if (split.length == 2) {
                    map.put(split[0], split[1]);
                } else if (split.length == 1) {
                    map.put(split[0], "");
                }
            }
        }
    }

    public static String j(int i10) {
        return "account" + i10 + "_";
    }

    public static void j2(Runnable runnable, Log.b bVar) {
        ya.m0();
        if (runnable != null) {
            runnable.run();
        }
    }

    @Deprecated
    public static void j3(Map<String, id.o> map, String str) {
        if (str != null) {
            for (String str2 : str.split(",")) {
                String[] split = str2.split(":");
                if (split.length == 3 && ib.i.m(split[1]) && ib.i.m(split[2])) {
                    map.put(split[0], new id.o(ib.i.s(split[1]), ib.i.s(split[2])));
                }
            }
        }
    }

    public static void k2(final Runnable runnable) {
        org.thunderdog.challegram.Log.deleteAll(org.thunderdog.challegram.Log.getLogFiles(), new kb.j() {
            @Override
            public final void a(Object obj) {
                i.j2(runnable, (Log.b) obj);
            }
        }, null);
    }

    @Deprecated
    public static void k3(Map<String, id.o> map, List<id.n> list, String str) {
        String[] split;
        if (str != null) {
            for (String str2 : str.split(",")) {
                id.o oVar = map.get(str2);
                if (oVar != null) {
                    list.add(new id.n(str2, oVar));
                }
            }
        }
    }

    @Deprecated
    public static j l3(String str, String str2) {
        if (ib.i.i(str)) {
            return null;
        }
        String[] split = str.split(str2);
        try {
            return new j(Double.parseDouble(split[0]), Double.parseDouble(split[1]), split.length > 2 ? Float.parseFloat(split[2]) : 0.0f);
        } catch (Throwable th) {
            org.thunderdog.challegram.Log.e("Cannot read location", th, new Object[0]);
            return null;
        }
    }

    public static j m3(byte[] bArr) {
        if (bArr == null || bArr.length != 20) {
            return null;
        }
        return new j(nb.a.j(bArr, 0), nb.a.j(bArr, 8), nb.a.l(bArr, 16));
    }

    public static String n2(long j10) {
        return "settings_tdlib_crash" + j10 + "_";
    }

    public static int p2() {
        return (fd.a.f11894p ? 33555457 : 1025) | org.thunderdog.challegram.Log.TAG_COMPRESS | org.thunderdog.challegram.Log.TAG_NDK;
    }

    public static String q2(String str, int i10, long j10, long j11) {
        StringBuilder sb2 = new StringBuilder("scroll_chat");
        sb2.append(j10);
        sb2.append(str);
        if (j11 != 0) {
            sb2.append("_thread");
            sb2.append(j11);
        }
        return i2(sb2.toString(), i10);
    }

    public static void q3(LevelDB.a aVar, int i10, ae.n nVar, Map<String, Integer> map, Map<String, Integer> map2) {
        String l10 = aVar.l();
        char charAt = l10.charAt(i10);
        String substring = l10.substring(i10 + 2);
        if (charAt == 'c') {
            Integer num = map.get(substring);
            if (num != null) {
                nVar.j(num.intValue(), Integer.valueOf(aVar.h()));
            } else {
                org.thunderdog.challegram.Log.w("Unknown theme color: %s", substring);
            }
        } else if (charAt != 'p') {
            org.thunderdog.challegram.Log.w("Unknown theme key: %s", l10);
        } else {
            Integer num2 = map2.get(substring);
            if (num2 != null) {
                nVar.m(num2.intValue(), Float.valueOf(aVar.g()));
            } else {
                org.thunderdog.challegram.Log.w("Unknown theme property: %s", substring);
            }
        }
    }

    public static void r3(LevelDB.a aVar, int i10, s sVar, Map<String, Integer> map, Map<String, Integer> map2) {
        String l10 = aVar.l();
        char charAt = l10.charAt(i10);
        String substring = l10.substring(i10 + 2);
        if (charAt == 'c') {
            sVar.a(substring, aVar.h());
            if (map != null) {
                map.remove(substring);
            }
        } else if (charAt != 'p') {
            org.thunderdog.challegram.Log.w("Unknown theme key: %s", l10);
        } else {
            float g10 = aVar.g();
            sVar.b(substring, g10);
            if (sVar.f13889e == 0 && b0.c(R.id.theme_property_parentTheme).equals(substring)) {
                sVar.f13889e = (int) g10;
            }
            if (map2 != null) {
                map2.remove(substring);
            }
        }
    }

    public static void u6(nb.a aVar, String str, String str2) {
        int i10 = !ib.i.i(str) ? 1 : 0;
        if (!ib.i.i(str2)) {
            i10 |= 2;
        }
        aVar.B((byte) i10);
        if ((i10 & 1) != 0) {
            aVar.L(str);
        }
        if ((i10 & 2) != 0) {
            aVar.L(str2);
        }
    }

    public static int y(String str, String str2) {
        return nb.a.x(str, false) + 1 + nb.a.x(str2, false);
    }

    public static SharedPreferences.Editor y2(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, SharedPreferences.Editor editor, String str) {
        if (sharedPreferences == null) {
            return editor;
        }
        Map<String, ?> all = sharedPreferences.getAll();
        if (all != null && !all.isEmpty()) {
            if (editor == null) {
                editor = sharedPreferences2.edit();
            }
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                if (str != null) {
                    key = str + key;
                }
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    editor.putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    editor.putInt(key, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    editor.putLong(key, ((Long) value).longValue());
                } else if (value instanceof String) {
                    editor.putString(key, (String) value);
                } else if (value instanceof Float) {
                    editor.putFloat(key, ((Float) value).floatValue());
                } else {
                    org.thunderdog.challegram.Log.e("Unknown value type, key:%s value:%b", key, value);
                }
            }
        }
        return editor;
    }

    public boolean A() {
        return t0() != 15.0f || A2();
    }

    public String A0(int i10) {
        LevelDB levelDB = this.f13841v;
        return levelDB.getString("theme_name" + i10, null);
    }

    public l A1(int i10) {
        l lVar = null;
        if (i10 != 0) {
            LevelDB levelDB = this.f13841v;
            lVar = C3(i10, levelDB.m("proxy_item_config_" + i10), null);
            if (lVar == null) {
                org.thunderdog.challegram.Log.e("Configuration unavailable, proxyId:%d", Integer.valueOf(i10));
            }
        }
        return lVar;
    }

    public boolean A2() {
        return I(64);
    }

    public void A3(String str) {
        this.f13841v.K(str);
    }

    public void A4(boolean z10, int i10) {
        if (F0(z10) != i10) {
            u3(z10 ? "settings_earpiece_video_mode" : "settings_earpiece_mode", i10);
            Iterator<n> it = this.D.iterator();
            while (it.hasNext()) {
                it.next().a(z10, i10);
            }
        }
    }

    public void A5(boolean z10) {
        E5(org.thunderdog.challegram.Log.TAG_YOUTUBE, z10);
    }

    public void B() {
        this.f13837r.removeMessages(0);
    }

    public float B0(int i10, int i11) {
        try {
            return this.f13841v.T(b6(i10, i11));
        } catch (FileNotFoundException unused) {
            if (i11 == R.id.theme_property_parentTheme) {
                return 1.0f;
            }
            return c0.f((int) B0(i10, R.id.theme_property_parentTheme), i11);
        }
    }

    public boolean B2() {
        return D(org.thunderdog.challegram.Log.TAG_VOICE);
    }

    public void B4(Map<String, String> map, SharedPreferences.Editor editor) {
        boolean z10;
        int i10 = 0;
        if (editor == null) {
            editor = W();
            z10 = true;
        } else {
            z10 = false;
        }
        int size = map.size();
        if (size > 0) {
            String[] strArr = new String[size * 2];
            for (Map.Entry<String, String> entry : map.entrySet()) {
                int i11 = i10 + 1;
                strArr[i10] = entry.getKey();
                i10 = i11 + 1;
                strArr[i11] = entry.getValue();
            }
            this.f13841v.J("emoji_colors", strArr);
        } else {
            editor.remove("emoji_colors");
        }
        if (z10) {
            editor.apply();
        }
    }

    public void B5(boolean z10) {
        this.f13844y = Boolean.valueOf(z10);
        if (z10) {
            this.f13841v.remove("settings_restrict_content");
        } else {
            this.f13841v.putBoolean("settings_restrict_content", false);
        }
    }

    public final void C(LevelDB levelDB, SharedPreferences.Editor editor, int i10, boolean z10) {
        try {
            int U2 = levelDB.U("settings_other");
            int h10 = ib.c.h(U2, i10, z10);
            if (U2 != h10) {
                editor.putInt("settings_other", h10);
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public String C0(int i10) {
        LevelDB levelDB = this.f13841v;
        return levelDB.getString("theme_wallpaper" + i10, null);
    }

    public boolean C2() {
        return D(org.thunderdog.challegram.Log.TAG_CAMERA);
    }

    public void C4(Map<String, id.o> map) {
        X3("emoji_counters", map);
    }

    public void C5(boolean z10) {
        E5(2, z10);
    }

    public final boolean D(int i10) {
        return !I(i10);
    }

    public List<ae.r> D0() {
        ae.r rVar;
        Throwable th;
        ArrayList arrayList = new ArrayList();
        ae.r rVar2 = null;
        for (LevelDB.a aVar : this.f13841v.g("theme_name")) {
            try {
                rVar = p3(aVar, rVar2);
            } catch (Throwable th2) {
                th = th2;
                rVar = rVar2;
            }
            if (rVar2 != rVar) {
                try {
                    arrayList.add(rVar);
                } catch (Throwable th3) {
                    th = th3;
                    org.thunderdog.challegram.Log.e("Cannot parse theme entry, key: %s", th, aVar.l());
                    rVar2 = rVar;
                }
                rVar2 = rVar;
            }
        }
        return arrayList;
    }

    public String D1(int i10) {
        l A1 = A1(i10);
        if (A1 != null) {
            return A1.e().toString();
        }
        return null;
    }

    public boolean D2() {
        return J(64);
    }

    public void D4(String str, Map<String, String> map) {
        if (map.size() > 0) {
            LevelDB W = W();
            if (ib.i.i(str)) {
                W.remove("emoji_default");
            } else {
                W.putString("emoji_default", str);
            }
            map.clear();
            B4(map, W);
            W.apply();
        } else if (ib.i.i(str)) {
            F3("emoji_default");
        } else {
            z3("emoji_default", str);
        }
    }

    public void D5(int i10, long j10, long j11, o oVar) {
        String q22 = q2("_message", i10, j10, j11);
        String q23 = q2("_chat", i10, j10, j11);
        String q24 = q2("_stack", i10, j10, j11);
        String q25 = q2("_aliases", i10, j10, j11);
        String q26 = q2("_offset", i10, j10, j11);
        String q27 = q2("_read", i10, j10, j11);
        String q28 = q2("_top", i10, j10, j11);
        LevelDB W = W();
        if (oVar == null) {
            W.remove(q22).remove(q23).remove(q24).remove(q26).remove(q25).remove(q27).remove(q28);
        } else {
            W.putLong(q22, oVar.f13866a.d());
            if (oVar.f13866a.c() != j10) {
                W.putLong(q23, oVar.f13866a.c());
            } else {
                W.remove(q23);
            }
            if (oVar.f13866a.e() == null || oVar.f13866a.e().length <= 0) {
                W.remove(q25);
            } else {
                W.I(q25, oVar.f13866a.e());
            }
            int i11 = oVar.f13867b;
            if (i11 != 0) {
                W.putInt(q26, i11);
            } else {
                W.remove(q26);
            }
            long[] jArr = oVar.f13868c;
            if (jArr == null || jArr.length <= 0) {
                W.remove(q24);
            } else {
                W.I(q24, jArr);
            }
            if (oVar.f13869d) {
                W.putBoolean(q27, true);
            } else {
                W.remove(q27);
            }
            long j12 = oVar.f13870e;
            if (j12 != 0) {
                W.putLong(q28, j12);
            } else {
                W.remove(q28);
            }
        }
        W.apply();
    }

    public void E(boolean z10) {
        if (z10) {
            B();
        }
        if (m1() == 2) {
            long n12 = n1();
            int m10 = ib.c.m(n12);
            int n10 = ib.c.n(n12);
            if (m10 == n10) {
                z.u().d0(false, true);
                if (z10) {
                    B();
                    return;
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            Calendar a10 = ib.f.a(currentTimeMillis);
            int g10 = ib.c.g(a10.get(11), a10.get(12), a10.get(13));
            boolean a11 = ib.c.a(g10, m10, n10);
            z.u().d0(a11, true);
            int i10 = a11 ? n10 : m10;
            if (g10 > i10) {
                a10.add(5, 1);
            }
            a10.set(11, ib.c.j(i10));
            a10.set(12, ib.c.k(i10));
            a10.set(13, ib.c.l(i10));
            long timeInMillis = a10.getTimeInMillis();
            if (timeInMillis >= currentTimeMillis) {
                a4(timeInMillis - currentTimeMillis);
                return;
            }
            throw new RuntimeException("Theme schedule failed [time: " + v0.P2(g10) + ", startTime: " + v0.P2(m10) + ", endTime: " + v0.P2(n10) + "]");
        }
    }

    public String E0() {
        return this.f13841v.getString("push_device_token", null);
    }

    public boolean E2() {
        return J(org.thunderdog.challegram.Log.TAG_YOUTUBE);
    }

    public boolean E3() {
        return I(org.thunderdog.challegram.Log.TAG_YOUTUBE);
    }

    public void E4(int i10) {
        u3("emoji_vp_mediasection", i10);
    }

    public final boolean E5(int i10, boolean z10) {
        return F5(ib.c.h(J1(), i10, z10));
    }

    public boolean F(int i10) {
        return ib.c.b(q1(), i10);
    }

    public int F0(boolean z10) {
        int i10;
        if (z10) {
            i10 = V0("settings_earpiece_video_mode", 0);
        } else {
            i10 = V0("settings_earpiece_mode", 1);
        }
        if (i10 == 0 || i10 == 1) {
            return i10;
        }
        if (i10 == 2 && !z10) {
            return i10;
        }
        return 0;
    }

    public int F1() {
        return this.f13841v.l("proxy_settings", (byte) 0);
    }

    public boolean F2() {
        return I(org.thunderdog.challegram.Log.TAG_COMPRESS);
    }

    public void F3(String str) {
        this.f13841v.remove(str);
    }

    public void F4(Map<String, String[]> map, SharedPreferences.Editor editor) {
        boolean z10;
        int i10 = 0;
        if (editor == null) {
            editor = W();
            z10 = true;
        } else {
            z10 = false;
        }
        int size = map.size();
        if (size > 0) {
            String[] strArr = new String[size * 2];
            for (Map.Entry<String, String[]> entry : map.entrySet()) {
                int i11 = i10 + 1;
                strArr[i10] = entry.getKey();
                i10 = i11 + 1;
                strArr[i11] = ce.c0.U(",", entry.getValue());
            }
            this.f13841v.J("emoji_other_colors", strArr);
        } else {
            editor.remove("emoji_other_colors");
        }
        if (z10) {
            editor.apply();
        }
    }

    public final boolean F5(int i10) {
        if (J1() == i10) {
            return false;
        }
        this.f13820a = Integer.valueOf(i10);
        this.f13841v.putInt("settings_other", i10);
        return true;
    }

    public final void G() {
        for (LevelDB.a aVar : this.f13841v.g("brut_force_seconds")) {
            T5(aVar.l().substring(18));
        }
    }

    public int G0() {
        int F1 = F1();
        if ((F1 & 1) == 0 || (F1 & 2) == 0) {
            return 0;
        }
        return l0();
    }

    public boolean G2() {
        return I(org.thunderdog.challegram.Log.TAG_LUX);
    }

    public void G3(String[] strArr, SharedPreferences.Editor editor) {
        this.f13841v.M(strArr);
    }

    public void G4(f fVar) {
        if (fVar.f13848b == 5) {
            this.L = fVar;
            this.M = null;
            if (fVar.f13847a.equals("apple")) {
                this.f13841v.N("settings_emoji_pack");
            } else {
                this.f13841v.edit().putString("settings_emoji_pack", fVar.f13847a).putString("settings_emoji_pack_name", fVar.M).putInt("settings_emoji_pack_date", fVar.f13849c).putInt("settings_emoji_pack_version", fVar.f13848b).apply();
            }
        } else {
            throw new IllegalArgumentException("emojiPack.version == " + fVar.f13848b);
        }
    }

    public void G5(boolean z10) {
        h6(org.thunderdog.challegram.Log.TAG_CRASH, z10);
    }

    public boolean H(int i10) {
        return (i10 & F1()) != 0;
    }

    public int H0() {
        if ((F1() & 1) != 0) {
            return l0();
        }
        return 0;
    }

    public boolean H2() {
        return J(1);
    }

    public void H3(String str, SharedPreferences.Editor editor) {
        this.f13841v.N(str);
    }

    public void H4(int i10) {
        u3("emoji_vp_position", i10);
    }

    public void H5(boolean z10) {
        E5(268435456, z10);
    }

    public final boolean I(int i10) {
        return ib.c.b(J1(), i10);
    }

    public void I0(Map<String, String> map) {
        String[] v10 = this.f13841v.v("emoji_colors");
        if (v10 != null && v10.length > 0) {
            String str = null;
            for (String str2 : v10) {
                if (str == null) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    str = str2;
                } else {
                    map.put(str, str2);
                    str = null;
                }
            }
        }
    }

    public o I1(int i10, long j10, long j11) {
        String i22 = i2("scroll_chat" + j10, i10);
        o.a aVar = null;
        for (LevelDB.a aVar2 : this.f13841v.g(i22)) {
            if (j11 == ib.i.w(aVar2.l().replaceAll("^.+_thread(\\d+)$", "$1"))) {
                if (aVar == null) {
                    aVar = new o.a(j10);
                }
                String replaceAll = aVar2.l().substring(i22.length()).replaceAll("_thread[\\d]+$", "");
                replaceAll.hashCode();
                char c10 = 65535;
                switch (replaceAll.hashCode()) {
                    case -1465440887:
                        if (replaceAll.equals("_stack")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -981817656:
                        if (replaceAll.equals("_message")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 2945174:
                        if (replaceAll.equals("_top")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 90786871:
                        if (replaceAll.equals("_chat")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 91230837:
                        if (replaceAll.equals("_read")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 1443689919:
                        if (replaceAll.equals("_aliases")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 1688691122:
                        if (replaceAll.equals("_offset")) {
                            c10 = 6;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        aVar.f13876f = aVar2.j();
                        continue;
                    case 1:
                        aVar.f13872b = aVar2.i();
                        continue;
                    case 2:
                        aVar.f13873c = aVar2.i();
                        continue;
                    case 3:
                        aVar.f13871a = aVar2.i();
                        continue;
                    case 4:
                        aVar.f13877g = aVar2.d();
                        continue;
                    case 5:
                        aVar.f13874d = aVar2.j();
                        continue;
                    case 6:
                        aVar.f13875e = aVar2.h();
                        continue;
                }
            }
        }
        if (!(aVar == null || aVar.f13871a == j10)) {
            aVar.f13872b = 0L;
        }
        if (aVar != null) {
            return aVar.i();
        }
        return null;
    }

    public boolean I2() {
        return I(8);
    }

    public void I3(c cVar) {
        lb.d<c> dVar = this.f13839t;
        if (dVar != null) {
            dVar.remove(cVar);
        }
    }

    public void I4(List<id.n> list) {
        String[] strArr = new String[list.size()];
        int i10 = 0;
        for (id.n nVar : list) {
            i10++;
            strArr[i10] = nVar.f14219a;
        }
        this.f13841v.J("emoji_recents", strArr);
    }

    public void I5(int i10) {
        this.f13826g = Integer.valueOf(i10);
        if (i10 == 0) {
            F3("settings_sticker");
        } else {
            u3("settings_sticker", i10);
        }
    }

    public boolean J(int i10) {
        return ib.c.b(Q1(), i10);
    }

    public void J0(Map<String, id.o> map) {
        n0("emoji_counters", map, id.o.class);
    }

    public final int J1() {
        if (this.f13820a == null) {
            this.f13820a = Integer.valueOf(this.f13841v.getInt("settings_other", p2()));
        }
        return this.f13820a.intValue();
    }

    public boolean J2() {
        return fd.b.f11917n || I(67108864);
    }

    public void J3(int i10) {
        ArrayList<String> arrayList = null;
        if ((z0(i10) & 1) != 0) {
            for (LevelDB.a aVar : this.f13841v.g("theme_installation_")) {
                if (aVar.h() == i10) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(aVar.l());
                }
            }
        }
        this.f13841v.edit();
        LevelDB levelDB = this.f13841v;
        levelDB.remove("theme_name" + i10);
        LevelDB levelDB2 = this.f13841v;
        levelDB2.remove("theme_author" + i10);
        LevelDB levelDB3 = this.f13841v;
        levelDB3.remove("theme_wallpaper" + i10);
        LevelDB levelDB4 = this.f13841v;
        levelDB4.remove("theme_flags" + i10);
        LevelDB levelDB5 = this.f13841v;
        levelDB5.M("theme" + i10 + "_", "theme_history" + i10 + "_");
        if (arrayList != null) {
            for (String str : arrayList) {
                this.f13841v.remove(str);
            }
        }
        this.f13841v.apply();
    }

    public void J4(boolean z10) {
        h6(4, z10);
    }

    public final void J5(long j10) {
        this.f13829j = Long.valueOf(j10);
        if (j10 == 0) {
            F3("settings_tutorial");
        } else {
            w3("settings_tutorial", j10);
        }
    }

    public void K() {
        this.f13841v.edit().remove("emoji_counters").remove("emoji_recents").apply();
    }

    public String K0() {
        return L1("emoji_default", null);
    }

    public int K1() {
        if (this.f13826g == null) {
            this.f13826g = Integer.valueOf(this.f13841v.getInt("settings_sticker", 0));
        }
        return this.f13826g.intValue();
    }

    public boolean K2(int i10) {
        String str = i10 + "_notifications_version";
        if (V0(str, 0) == 1519020) {
            return false;
        }
        u3(str, 1519020);
        return true;
    }

    public void K3(q qVar) {
        lb.d<q> dVar = this.f13840u;
        if (dVar != null) {
            dVar.remove(qVar);
        }
    }

    public void K4(boolean z10) {
        h6(8, z10);
    }

    public void K5(boolean z10) {
        h5(org.thunderdog.challegram.Log.TAG_TDLIB_FILES, z10);
    }

    public boolean L(String str) {
        return this.f13841v.contains(str);
    }

    public int L0() {
        return V0("emoji_vp_mediasection", 0);
    }

    public String L1(String str, String str2) {
        return this.f13841v.getString(str, str2);
    }

    public boolean L2() {
        return I(org.thunderdog.challegram.Log.TAG_ACCOUNTS);
    }

    public void L3(k kVar) {
        lb.d<k> dVar = this.E;
        if (dVar != null) {
            dVar.remove(kVar);
        }
    }

    public void L4(boolean z10) {
        h6(org.thunderdog.challegram.Log.TAG_YOUTUBE, z10);
    }

    public void L5(boolean z10) {
        h5(4194304, z10);
    }

    public void M(final Runnable runnable) {
        gd.l.a().b(new Runnable() {
            @Override
            public final void run() {
                i.k2(runnable);
            }
        });
    }

    public void M0(Map<String, String[]> map) {
        String[] v10 = this.f13841v.v("emoji_other_colors");
        if (v10 != null && v10.length > 0) {
            String str = null;
            for (String str2 : v10) {
                if (str == null) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    str = str2;
                } else {
                    map.put(str, str2.split(","));
                    str = null;
                }
            }
        }
    }

    public r M1() {
        return this.f13832m;
    }

    public boolean M2() {
        return D(org.thunderdog.challegram.Log.TAG_ROUND);
    }

    public boolean M3(int i10) {
        int lastIndexOf;
        if (i10 > 0) {
            int l02 = l0();
            int F1 = F1();
            if (l02 == i10 && (F1 & 1) != 0) {
                return false;
            }
            this.f13841v.edit();
            LevelDB levelDB = this.f13841v;
            levelDB.remove("proxy_item_config_" + i10);
            LevelDB levelDB2 = this.f13841v;
            levelDB2.N("proxy_item_time_" + i10);
            this.f13841v.apply();
            if (l02 == i10) {
                String j10 = this.f13841v.j("proxy_item_config_");
                int s10 = (j10 == null || (lastIndexOf = j10.lastIndexOf(95)) == -1) ? 0 : ib.i.s(j10.substring(lastIndexOf + 1));
                this.f13841v.putInt("proxy_current", s10);
                if (s10 == 0) {
                    T(false);
                }
            }
            return true;
        }
        throw new IllegalArgumentException();
    }

    public void M4(boolean z10) {
        h6(1, z10);
    }

    public void M5(boolean z10) {
        h5(org.thunderdog.challegram.Log.TAG_CONTACT, z10);
    }

    public void N(int i10, SharedPreferences.Editor editor, int i11) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (i10 != 0) {
            str = "wallpaper_" + i10;
        } else {
            str = "wallpaper";
        }
        sb2.append(str);
        sb2.append(S1(i11));
        String sb3 = sb2.toString();
        editor.remove(sb3).remove(sb3 + "_empty").remove(sb3 + "_custom").remove(sb3 + "_path").remove(sb3 + "_id");
    }

    public f N0() {
        if (this.L == null) {
            f fVar = null;
            for (LevelDB.a aVar : this.f13841v.g("settings_emoji_pack")) {
                if (aVar.l().length() == 19) {
                    fVar = new f(aVar.k());
                } else if (fVar != null) {
                    String substring = aVar.l().substring(19);
                    substring.hashCode();
                    char c10 = 65535;
                    switch (substring.hashCode()) {
                        case -1585134695:
                            if (substring.equals("_version")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 90810509:
                            if (substring.equals("_date")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 91108202:
                            if (substring.equals("_name")) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            fVar.f13848b = aVar.h();
                            continue;
                        case 1:
                            fVar.f13849c = aVar.h();
                            continue;
                        case 2:
                            fVar.M = aVar.k();
                            continue;
                    }
                }
            }
            if (fVar == null) {
                this.L = new f();
            } else if (fVar.f13848b != 5) {
                this.M = fVar;
                this.L = new f();
            } else {
                this.L = fVar;
            }
        }
        return this.L;
    }

    public String N1(int i10) {
        LevelDB levelDB = this.f13841v;
        return levelDB.getString("theme_author" + i10, null);
    }

    public boolean N2() {
        if (!this.f13842w) {
            return false;
        }
        this.f13842w = false;
        return true;
    }

    public void N3(m mVar) {
        this.C.remove(mVar);
    }

    public void N4(int i10) {
        this.f13828i = Integer.valueOf(i10);
        if (i10 == 1) {
            F3("settings_incognito");
        } else {
            u3("settings_incognito", i10);
        }
    }

    public void N5(boolean z10) {
        if (h5(org.thunderdog.challegram.Log.TAG_TDLIB_OPTIONS, z10)) {
            u2(2L);
        }
    }

    public void O(o6 o6Var, SharedPreferences.Editor editor, int i10) {
        N(o6Var.A6(), editor, i10);
    }

    public String O0() {
        return N0().f13847a;
    }

    public float O1(int i10, int i11, float f10) {
        return this.f13841v.getFloat(b6(i10, i11), f10);
    }

    public boolean O2() {
        return I(16);
    }

    public void O3(n nVar) {
        this.D.remove(nVar);
    }

    public void O4(int i10) {
        if (i10 == 1) {
            F3("settings_iv_mode");
        } else {
            u3("settings_iv_mode", i10);
        }
    }

    public void O5(boolean z10) {
        E5(org.thunderdog.challegram.Log.TAG_CRASH, z10);
    }

    public void P(o6 o6Var, SharedPreferences.Editor editor) {
        String str;
        int A6 = o6Var.A6();
        O(o6Var, editor, 0);
        O(o6Var, editor, 1);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "wallpaper";
        if (A6 != 0) {
            str = "wallpaper_" + A6;
        } else {
            str = str2;
        }
        sb2.append(str);
        sb2.append("_other");
        this.f13841v.N(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        if (A6 != 0) {
            str2 = "wallpaper_" + A6;
        }
        sb3.append(str2);
        sb3.append("_chat");
        this.f13841v.N(sb3.toString());
    }

    public int P0(d dVar, boolean z10) {
        if ("apple".equals(dVar.f13847a)) {
            return 1;
        }
        LevelDB levelDB = this.f13841v;
        int i10 = levelDB.getInt("settings_emoji_installed_" + dVar.f13847a, 0);
        if (i10 > 0 && (z10 || new File(id.d.s(), dVar.f13847a).exists())) {
            return i10 == dVar.f13849c ? 1 : 2;
        }
        return 0;
    }

    public final long P1() {
        if (this.f13829j == null) {
            this.f13829j = Long.valueOf(this.f13841v.getLong("settings_tutorial", 0L));
        }
        return this.f13829j.longValue();
    }

    public boolean P2() {
        Boolean bool = this.f13844y;
        if (bool == null) {
            bool = Boolean.valueOf(this.f13841v.getBoolean("settings_restrict_content", true));
            this.f13844y = bool;
        }
        return bool.booleanValue();
    }

    public void P3(int i10, SharedPreferences.Editor editor) {
        H3(i2("scroll_chat", i10), editor);
    }

    public void P4(boolean z10) {
        if (z10) {
            s3("intro_attempt", true);
        } else {
            F3("intro_attempt");
        }
    }

    public void P5(boolean z10) {
        E5(134217728, z10);
    }

    public void Q() {
        this.f13832m.c();
        org.thunderdog.challegram.Log.setLogLevel(0);
    }

    public int Q0() {
        return V0("emoji_vp_position", 0);
    }

    public final int Q1() {
        return this.f13841v.getInt("debug_features", 0);
    }

    public boolean Q2(String str, boolean z10) {
        return o0("settings_rtl" + w.w(str), z10);
    }

    public void Q3(u uVar) {
        lb.i.e(this.f13845z, uVar);
    }

    public void Q4(int i10, int i11) {
        u3("keyboard_size" + i10, i11);
    }

    public final void Q5(int i10) {
        if (i10 == 0) {
            this.f13841v.remove("debug_features");
        } else {
            this.f13841v.putInt("debug_features", i10);
        }
    }

    public void R() {
        int F1 = F1();
        if ((F1 & 1) != 0) {
            x5(F1, 1, false);
        }
    }

    public void R0(Map<String, id.o> map, List<id.n> list) {
        String[] v10 = this.f13841v.v("emoji_recents");
        if (v10 != null && v10.length > 0) {
            for (String str : v10) {
                id.o oVar = map.get(str);
                if (oVar != null) {
                    list.add(new id.n(str, oVar));
                }
            }
        }
    }

    public j R1() {
        return m3(this.f13841v.m("last_view_location"));
    }

    public boolean R2() {
        return I(2);
    }

    public boolean R3() {
        return i4(0);
    }

    public void R4(TdApi.LanguagePackInfo languagePackInfo) {
        Y3(this.f13841v, "settings_language_code", languagePackInfo);
        S4(languagePackInfo);
    }

    public void R5(double d10, double d11, float f10) {
        byte[] bArr = new byte[20];
        nb.a.E(bArr, 0, d10);
        nb.a.E(bArr, 8, d11);
        nb.a.G(bArr, 16, f10);
        this.f13841v.D("last_view_location", bArr);
    }

    public final void S(l lVar, boolean z10) {
        Iterator<m> it = this.C.iterator();
        while (it.hasNext()) {
            it.next().X0(lVar, z10);
        }
    }

    public h S0() {
        if (this.N == null) {
            this.N = new h();
        }
        return this.N;
    }

    public boolean S2() {
        return D(org.thunderdog.challegram.Log.TAG_TDLIB_OPTIONS);
    }

    public void S3() {
        W4(false);
        m4(15.0f);
    }

    public final void S4(TdApi.LanguagePackInfo languagePackInfo) {
        this.G = new C0119i(languagePackInfo);
    }

    public boolean S5(int i10, long j10, long j11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("hide_bot_keyboard_");
        sb2.append(j10);
        return e1(i2(sb2.toString(), i10), 0L) == j11;
    }

    public final void T(boolean z10) {
        Iterator<m> it = this.C.iterator();
        while (it.hasNext()) {
            it.next().g7(z10);
        }
    }

    public final int T0() {
        if (this.f13828i == null) {
            this.f13828i = Integer.valueOf(this.f13841v.getInt("settings_incognito", 1));
        }
        return this.f13828i.intValue();
    }

    public final void T1(Message message) {
        if (message.what == 0) {
            E(false);
        }
    }

    public boolean T2() {
        return I(org.thunderdog.challegram.Log.TAG_EMOJI);
    }

    public boolean T3() {
        return o5(1);
    }

    public void T4(int i10, boolean z10) {
        if (z10) {
            this.f13836q = Integer.valueOf(i10);
            u3("settings_map_provider_cloud", i10);
            return;
        }
        this.f13835p = Integer.valueOf(i10);
        u3("settings_map_provider", i10);
    }

    public final void T5(final String str) {
        HashMap<String, kb.b> hashMap = this.F;
        if (hashMap == null) {
            this.F = new HashMap<>();
        } else if (hashMap.containsKey(str)) {
            return;
        }
        b bVar = new b(str);
        bVar.e(j0.o());
        this.F.put(str, bVar);
        gd.l.a().c(bVar, 1000);
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                i.this.l2(str);
            }
        });
    }

    public final void U(int i10, String str, int i11, TdApi.ProxyType proxyType, String str2, boolean z10, boolean z11) {
        Iterator<m> it = this.C.iterator();
        while (it.hasNext()) {
            it.next().a3(i10, str, i11, proxyType, str2, z10, z11);
        }
    }

    public int U0() {
        return V0("settings_iv_mode", 1);
    }

    public boolean U1(int i10, int i11) {
        return this.f13841v.contains(Y5(i10, i11));
    }

    public boolean U2() {
        return I(org.thunderdog.challegram.Log.TAG_PAINT);
    }

    public void U3() {
        J5(0L);
    }

    public void U4(int i10) {
        if (i10 == -1) {
            F3("map_type");
        } else {
            u3("map_type", i10);
        }
    }

    public boolean U5() {
        return I(268435456);
    }

    public boolean V() {
        return false;
    }

    public int V0(String str, int i10) {
        return this.f13841v.getInt(str, i10);
    }

    public boolean V1(int i10) {
        return i10 > 0 && this.f13841v.contains(b6(i10, R.id.theme_property_parentTheme));
    }

    public boolean V2() {
        return J(org.thunderdog.challegram.Log.TAG_CRASH);
    }

    public void V3() {
        this.K = SystemClock.uptimeMillis();
    }

    public void V4(int i10) {
        if (i10 == 21) {
            F3("settings_theme_position");
        } else {
            u3("settings_theme_position", i10);
        }
    }

    public void V5(int i10, String str, int i11) {
        long uptimeMillis = SystemClock.uptimeMillis() - this.K;
        long j10 = this.f13841v.getLong("settings_tdlib_crash", 0L);
        String n22 = n2(j10);
        this.f13841v.edit();
        this.f13841v.putLong("settings_tdlib_crash", j10 + 1);
        LevelDB levelDB = this.f13841v;
        levelDB.putInt(n22 + "app", 1519020);
        LevelDB levelDB2 = this.f13841v;
        levelDB2.putInt(n22 + "flags", i11);
        LevelDB levelDB3 = this.f13841v;
        levelDB3.putInt(n22 + "id", i10);
        LevelDB levelDB4 = this.f13841v;
        levelDB4.putLong(n22 + "uptime", uptimeMillis);
        LevelDB levelDB5 = this.f13841v;
        levelDB5.putLong(n22 + "time", System.currentTimeMillis());
        LevelDB levelDB6 = this.f13841v;
        levelDB6.putString(n22 + "rip", str);
        this.f13841v.apply();
        this.f13841v.k();
    }

    public LevelDB W() {
        return this.f13841v.edit();
    }

    public int W0(int i10, int i11) {
        int V0 = V0("keyboard_size" + i10, 0);
        if (V0 > 0) {
            i11 = V0;
        }
        return Math.max(i11, a0.i(75.0f));
    }

    public boolean W1() {
        return this.f13832m.i() || org.thunderdog.challegram.Log.getLogLevel() > 0;
    }

    public boolean W2() {
        return I(org.thunderdog.challegram.Log.TAG_NDK);
    }

    public void W3() {
        G4(this.L);
    }

    public void W4(boolean z10) {
        if (E5(64, z10)) {
            d3(this.B, t0());
        }
    }

    public void W5(int i10, String str) {
        V3();
        V5(i10, str, 4);
    }

    public s X(int i10, boolean z10) {
        Map<String, Integer> map;
        Map<String, Integer> map2;
        s sVar;
        int V = z.V(i10);
        if (z10 || V == 0) {
            map2 = ae.m.c();
            map = b0.b();
        } else {
            map2 = null;
            map = null;
        }
        int i11 = 0;
        if (V != 0) {
            String str = "theme" + V + "_";
            sVar = new s(A0(V), C0(V));
            int length = str.length();
            for (LevelDB.a aVar : this.f13841v.g(str)) {
                try {
                    r3(aVar, length, sVar, map2, map);
                } catch (Throwable th) {
                    org.thunderdog.challegram.Log.e("Cannot parse theme entry, key: %s", th, aVar.l());
                }
            }
        } else {
            sVar = new s(w.i1(z.p(i10)), null);
            ae.p a10 = c0.a(i10);
            int d10 = (int) a10.d(R.id.theme_property_parentTheme);
            sVar.f13889e = d10;
            if (d10 != 0) {
                ae.p a11 = c0.a(d10);
                for (Map.Entry<String, Integer> entry : map2.entrySet()) {
                    int intValue = entry.getValue().intValue();
                    if (a11.e(intValue) != a10.e(intValue)) {
                        sVar.a(entry.getKey(), a10.e(intValue));
                    }
                }
                for (Map.Entry<String, Integer> entry2 : map.entrySet()) {
                    int intValue2 = entry2.getValue().intValue();
                    if (entry2.getValue().intValue() != R.id.theme_property_wallpaperId || a10.d(intValue2) != ae.h.q(i10)) {
                        if (a11.d(intValue2) != a10.d(intValue2)) {
                            sVar.b(entry2.getKey(), a10.d(intValue2));
                        }
                    }
                }
            }
        }
        int i12 = sVar.f13889e;
        if (i12 != 0) {
            i11 = i12;
        } else if (!z.A(i10)) {
            i11 = i10;
        }
        if (z10 && i11 != 0) {
            for (Map.Entry<String, Integer> entry3 : map2.entrySet()) {
                sVar.a(entry3.getKey(), ae.j.M(entry3.getValue().intValue(), i11));
            }
            for (Map.Entry<String, Integer> entry4 : map.entrySet()) {
                float Z = ae.j.Z(entry4.getValue().intValue(), i11);
                if (z.A(i10) || entry4.getValue().intValue() != R.id.theme_property_wallpaperId || Z != ae.h.q(i10)) {
                    sVar.b(entry4.getKey(), Z);
                }
            }
        }
        return sVar;
    }

    public long X0(String str, long j10, long j11) {
        LevelDB levelDB = this.f13841v;
        long[] r10 = levelDB.r("known_size_for_" + str);
        if (r10 != null && r10.length >= 3 && r10[0] == j10 && r10[1] == j11) {
            return r10[2];
        }
        throw new FileNotFoundException();
    }

    public boolean X1() {
        return k0() > 0;
    }

    public boolean X2(long j10) {
        return !ib.c.c(P1(), j10) && !ib.c.c(this.f13843x, j10);
    }

    public final void X3(String str, Map<String, ? extends nb.b> map) {
        int size = map.size();
        int w10 = nb.a.w(size);
        for (Map.Entry<String, ? extends nb.b> entry : map.entrySet()) {
            w10 += entry.getKey().length() + entry.getValue().b();
        }
        nb.a aVar = new nb.a(w10);
        aVar.M(size);
        for (Map.Entry<String, ? extends nb.b> entry2 : map.entrySet()) {
            aVar.L(entry2.getKey());
            entry2.getValue().c(aVar);
        }
        this.f13841v.D(str, aVar.y());
    }

    public void X4(boolean z10) {
        E5(org.thunderdog.challegram.Log.TAG_COMPRESS, z10);
    }

    public TdApi.LanguagePackInfo X5(String str, o6 o6Var) {
        if (ib.i.i(str) || str.equals(Z0().f19945id) || str.equals(c1())) {
            return null;
        }
        return o6Var.Ic();
    }

    public int Y(long j10) {
        return V0("receiver_" + j10, -1);
    }

    public C0119i Y0() {
        if (this.G == null) {
            S4(B3(this.f13841v, "settings_language_code", true));
        }
        return this.G;
    }

    public boolean Y1(int i10) {
        int z02 = z0(i10);
        return (z02 & 1) == 0 || (z02 & 2) != 0;
    }

    public boolean Y2(TdApi.ChatSource chatSource) {
        int constructor = chatSource.getConstructor();
        if (constructor == -328571244) {
            String str = ((TdApi.ChatSourcePublicServiceAnnouncement) chatSource).type;
            LevelDB levelDB = this.f13841v;
            String str2 = "settings_tutorial_psa";
            if (!ib.i.i(str)) {
                str2 = str2 + str;
            }
            return !levelDB.contains(str2);
        } else if (constructor == 394074115) {
            return X2(65536L);
        } else {
            throw new UnsupportedOperationException(chatSource.toString());
        }
    }

    public void Y4(boolean z10) {
        E5(org.thunderdog.challegram.Log.TAG_LUX, z10);
    }

    public e Z() {
        return x0(this.f13841v.getLong("settings_tdlib_crash", 0L) - 1, true);
    }

    public TdApi.LanguagePackInfo Z0() {
        return Y0().f13857a;
    }

    public boolean Z1() {
        return !X2(16L);
    }

    public boolean Z2() {
        return T0() == 1;
    }

    public void Z3(double d10, double d11, float f10) {
        byte[] bArr = new byte[20];
        nb.a.E(bArr, 0, d10);
        nb.a.E(bArr, 8, d11);
        nb.a.G(bArr, 16, f10);
        this.f13841v.D("last_inline_location", bArr);
    }

    public boolean Z4(boolean z10) {
        return E5(8, z10);
    }

    public boolean a0() {
        return I(32);
    }

    public int a1() {
        return Y0().f13858b;
    }

    public boolean a2() {
        long n12;
        int m10;
        int n10;
        if (m1() != 2 || (m10 = ib.c.m((n12 = n1()))) == (n10 = ib.c.n(n12))) {
            return false;
        }
        Calendar e10 = ib.f.e();
        return ib.c.a(ib.c.g(e10.get(11), e10.get(12), e10.get(13)), m10, n10);
    }

    public boolean a3(TdApi.Chat chat) {
        return T0() == 1 && chat != null && ob.a.j(chat.f19908id);
    }

    public void a4(long j10) {
        p pVar = this.f13837r;
        pVar.sendMessageDelayed(Message.obtain(pVar, 0), j10);
    }

    public void a5(boolean z10) {
        E5(67108864, z10);
    }

    public boolean b0() {
        return J(16);
    }

    public j b1() {
        return m3(this.f13841v.m("last_inline_location"));
    }

    public int b2(hj.m mVar) {
        try {
            return n(mVar.f27686a, mVar.f27690e, 0, mVar);
        } catch (Throwable th) {
            org.thunderdog.challegram.Log.e("Cannot install theme", th, new Object[0]);
            return 0;
        }
    }

    public synchronized long b3() {
        long longValue;
        if (this.I == null) {
            this.I = Long.valueOf(e1("notifications_count", 0L));
        }
        Long valueOf = Long.valueOf(this.I.longValue() + 1);
        this.I = valueOf;
        longValue = valueOf.longValue();
        w3("notifications_count", longValue);
        return longValue;
    }

    public void b5(boolean z10) {
        E5(org.thunderdog.challegram.Log.TAG_ACCOUNTS, z10);
    }

    public boolean c0() {
        return J(4);
    }

    public String c1() {
        return L1("settings_language_code_suggested", null);
    }

    public final int c3() {
        return V0("settings_theme_count", 0) + 1;
    }

    public void c4(boolean z10) {
        E5(4, z10);
    }

    public void c5(boolean z10) {
        h5(org.thunderdog.challegram.Log.TAG_ROUND, z10);
    }

    public boolean d0() {
        return J(8);
    }

    public r d1() {
        return this.f13832m;
    }

    public boolean d2() {
        return I(4);
    }

    public void d4(int i10, boolean z10) {
        String str = "settings_tdlib_allow_debug" + i10;
        if (z10) {
            this.f13841v.K(str);
        } else {
            this.f13841v.remove(str);
        }
    }

    public void d5(String str, boolean z10) {
        s3("settings_rtl" + w.w(str), z10);
        w.u();
    }

    public final boolean d6(String str) {
        String str2 = "brut_force_seconds";
        if (str != null) {
            str2 = str2 + str;
        }
        int i10 = this.f13841v.getInt(str2, 0) - 1;
        if (i10 > 0) {
            this.f13841v.putInt(str2, i10);
            return true;
        }
        this.f13841v.remove(str2);
        return false;
    }

    public void e0(String str) {
        LevelDB levelDB = this.f13841v;
        levelDB.remove("known_size_for_" + str);
    }

    public long e1(String str, long j10) {
        return this.f13841v.getLong(str, j10);
    }

    public boolean e2() {
        return this.f13841v.getBoolean("is_emulator", false);
    }

    public void e3() {
        boolean o32 = o3();
        for (int size = this.f13845z.size() - 1; size >= 0; size--) {
            u uVar = this.f13845z.get(size).get();
            if (uVar != null) {
                uVar.y4(o32);
            } else {
                this.f13845z.remove(size);
            }
        }
    }

    public void e4(long j10) {
        s3("allow_location_" + j10, true);
    }

    public void e5(boolean z10) {
        E5(org.thunderdog.challegram.Log.TAG_EMOJI, z10);
    }

    public void e6() {
        W4(!A2());
    }

    public void f0(int i10, String str) {
        String str2;
        if (str != null) {
            str2 = "brut_force_errors" + str;
        } else {
            str2 = "global_brut_force_errors";
        }
        this.f13841v.N(str2);
    }

    public long[] f1(String str) {
        return this.f13841v.r(str);
    }

    public final void f3(boolean z10) {
        for (int size = this.f13845z.size() - 1; size >= 0; size--) {
            u uVar = this.f13845z.get(size).get();
            if (uVar != null) {
                uVar.p1(z10);
            } else {
                this.f13845z.remove(size);
            }
        }
    }

    public void f4(int i10) {
        int m12 = m1();
        if (m12 != i10) {
            this.f13822c = Integer.valueOf(i10);
            if (i10 == Q) {
                F3("settings_night_mode");
            } else {
                u3("settings_night_mode", i10);
            }
            z.u().J(i10);
            if (i10 == 2 || m12 == 2) {
                E(true);
            }
        }
    }

    public void f5(boolean z10) {
        E5(org.thunderdog.challegram.Log.TAG_PAINT, z10);
    }

    public boolean f6(int i10) {
        int F1 = F1();
        return x5(F1, i10, (F1 & i10) == 0);
    }

    public String[] g0() {
        return (String[]) h0().toArray(new String[0]);
    }

    public int g1(boolean z10) {
        if (z10) {
            if (this.f13836q == null) {
                this.f13836q = Integer.valueOf(this.f13841v.getInt("settings_map_provider_cloud", 1));
            }
            return this.f13836q.intValue();
        }
        if (this.f13835p == null) {
            this.f13835p = Integer.valueOf(this.f13841v.getInt("settings_map_provider", -1));
        }
        return this.f13835p.intValue();
    }

    public boolean g2() {
        return o0("intro_attempt", false);
    }

    public final void l2(String str) {
        lb.d<k> dVar = this.E;
        if (dVar != null) {
            Iterator<k> it = dVar.iterator();
            while (it.hasNext()) {
                it.next().f6(str);
            }
        }
    }

    public void g4(int i10) {
        this.f13827h = Integer.valueOf(i10);
        if (i10 == 0) {
            F3("settings_auto_update");
        } else {
            u3("settings_auto_update", i10);
        }
    }

    public boolean g5(boolean z10) {
        return E5(org.thunderdog.challegram.Log.TAG_NDK, z10);
    }

    public void g6() {
        z5(!O2());
    }

    public List<String> h0() {
        if (this.J == null) {
            this.J = new ArrayList();
            String[] v10 = this.f13841v.v("settings_authentication_token");
            if (v10 != null) {
                Collections.addAll(this.J, v10);
            }
        }
        return this.J;
    }

    public int h1() {
        return V0("map_type", -1);
    }

    public boolean h2(int i10, String str) {
        LevelDB levelDB = this.f13841v;
        String str2 = "brut_force_seconds";
        if (str != null) {
            str2 = str2 + str;
        }
        return levelDB.contains(str2);
    }

    public void h3(int i10, long j10, long j11, boolean z10) {
        if (z10) {
            w3(i2("hide_bot_keyboard_" + j10, i10), j11);
            return;
        }
        F3(i2("hide_bot_keyboard_" + j10, i10));
    }

    public void h4(boolean z10) {
        E5(1, z10);
    }

    public final boolean h5(int i10, boolean z10) {
        return E5(i10, !z10);
    }

    public final void h6(int i10, boolean z10) {
        int Q1 = Q1();
        int h10 = ib.c.h(Q1, i10, z10);
        if (Q1 != h10) {
            Q5(h10);
        }
    }

    public int i0() {
        if (this.f13827h == null) {
            this.f13827h = Integer.valueOf(this.f13841v.getInt("settings_auto_update", 0));
        }
        return this.f13827h.intValue();
    }

    public float i1() {
        if (this.f13823d == null) {
            this.f13823d = Float.valueOf(this.f13841v.getFloat("night_lux_max", 1.5f));
        }
        return this.f13823d.floatValue();
    }

    public boolean i4(int i10) {
        if (m0() == i10) {
            return false;
        }
        this.f13830k = Integer.valueOf(i10);
        if (i10 == 0) {
            F3("settings_badge_flags");
            return true;
        }
        u3("settings_badge_flags", i10);
        return true;
    }

    public boolean i5(long j10, boolean z10) {
        return j5(ib.c.i(l1(), j10, z10));
    }

    public void i6(int i10, String str, String str2) {
        int i11 = i10 != 1 ? i10 != 2 ? 5 : 7 : 4;
        String str3 = str2 != null ? "brut_force_errors" + str2 : "global_brut_force_errors";
        int i12 = 0;
        String u10 = str != null ? he.d.u(str) : null;
        for (LevelDB.a aVar : this.f13841v.g(str3)) {
            if (u10 == null || !ib.i.c(u10, aVar.k())) {
                i12++;
            } else {
                aVar.m();
                return;
            }
        }
        this.f13841v.putString(str3 + "_" + i12, str != null ? he.d.u(str) : "");
        int i13 = i12 + 1;
        if (i13 % i11 == 0) {
            x(i10, i13 / i11, str2);
        }
    }

    public List<l> j0() {
        ArrayList arrayList = new ArrayList();
        int[] p10 = this.f13841v.p("proxy_order");
        nb.a aVar = null;
        for (LevelDB.a aVar2 : this.f13841v.g("proxy_item_")) {
            String l10 = aVar2.l();
            int lastIndexOf = l10.lastIndexOf(95);
            int i10 = -1;
            if (lastIndexOf != -1) {
                int s10 = ib.i.s(l10.substring(lastIndexOf + 1));
                if (s10 < 0) {
                    org.thunderdog.challegram.Log.w("Unknown proxy id entry:%d", Integer.valueOf(s10));
                } else if (s10 != 0) {
                    if (l10.startsWith("proxy_item_config_")) {
                        byte[] e10 = aVar2.e();
                        if (aVar == null) {
                            aVar = new nb.a();
                        }
                        l C3 = C3(s10, e10, aVar);
                        if (C3 != null) {
                            if (p10 != null) {
                                i10 = ib.b.r(p10, s10);
                            }
                            C3.N = i10;
                            arrayList.add(C3);
                        } else {
                            org.thunderdog.challegram.Log.w("Removing proxy configuration, because it cannot be read, proxyId:%d", Integer.valueOf(s10));
                            M3(s10);
                        }
                    } else if (!arrayList.isEmpty()) {
                        l lVar = (l) arrayList.get(arrayList.size() - 1);
                        if (lVar.f13863a == s10) {
                            try {
                                if (l10.startsWith("proxy_item_desc_")) {
                                    lVar.O = aVar2.k();
                                }
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public int j1() {
        return V0("settings_theme_position", 21);
    }

    public void j4(int i10) {
        if (i10 == 0) {
            this.f13841v.remove("settings_camera_ratio");
        } else {
            this.f13841v.putInt("settings_camera_ratio", i10);
        }
    }

    public final boolean j5(long j10) {
        long l12 = l1();
        if (l12 == j10) {
            return false;
        }
        this.f13821b = Long.valueOf(j10);
        this.f13841v.putLong("settings_other2", j10);
        lb.d<q> dVar = this.f13840u;
        if (dVar == null) {
            return true;
        }
        Iterator<q> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().h6(j10, l12);
        }
        return true;
    }

    public void j6(String str) {
        List<String> h02 = h0();
        if (!h02.contains(str)) {
            h02.add(str);
            while (h02.size() > 20) {
                h02.remove(0);
            }
            this.f13841v.J("settings_authentication_token", (String[]) h02.toArray(new String[0]));
        }
    }

    public void k(g gVar) {
        lb.i.a(this.B, gVar);
    }

    public int k0() {
        return (int) this.f13841v.u("proxy_item_config_");
    }

    public boolean k1(long j10) {
        return ib.c.c(l1(), j10);
    }

    public void k4(int i10) {
        if (i10 == 0) {
            this.f13841v.remove("settings_camera_type");
        } else {
            this.f13841v.putInt("settings_camera_type", i10);
        }
    }

    public boolean k5(float f10, boolean z10) {
        boolean z11 = i1() != f10;
        this.f13823d = Float.valueOf(f10);
        if (z10) {
            t3("night_lux_max", f10);
        }
        return z11;
    }

    public void k6(String str) {
        LevelDB levelDB = null;
        for (LevelDB.a aVar : this.f13841v.g("settings_emoji_installed_")) {
            if (str == null || !aVar.l().substring(25).equals(str)) {
                if (levelDB == null) {
                    levelDB = W();
                }
                levelDB.remove(aVar.l());
            }
        }
        if (levelDB != null) {
            levelDB.apply();
        }
    }

    public void l(c cVar) {
        if (this.f13839t == null) {
            this.f13839t = new lb.d<>();
        }
        this.f13839t.add(cVar);
    }

    public int l0() {
        return this.f13841v.getInt("proxy_current", 0);
    }

    public final long l1() {
        if (this.f13821b == null) {
            this.f13821b = Long.valueOf(this.f13841v.getLong("settings_other2", o2()));
        }
        return this.f13821b.longValue();
    }

    public void l4(int i10) {
        if (i10 == 0) {
            this.f13841v.remove("settings_camera_control");
        } else {
            this.f13841v.putInt("settings_camera_control", i10);
        }
    }

    public void l5(int i10, boolean z10) {
        long n12 = n1();
        int m10 = z10 ? i10 : ib.c.m(n12);
        if (z10) {
            i10 = ib.c.n(n12);
        }
        m5(ib.c.f(m10, i10));
    }

    public void l6(int i10, long j10, long j11, long j12) {
        char c10;
        String i22 = i2("scroll_chat" + j10, i10);
        LevelDB levelDB = null;
        for (LevelDB.a aVar : this.f13841v.g(i22)) {
            String replaceAll = aVar.l().substring(i22.length()).replaceAll("_thread[\\d]+$", "");
            replaceAll.hashCode();
            int i11 = -1;
            switch (replaceAll.hashCode()) {
                case -1465440887:
                    if (replaceAll.equals("_stack")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -981817656:
                    if (replaceAll.equals("_message")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1443689919:
                    if (replaceAll.equals("_aliases")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                case 2:
                    long[] j13 = aVar.j();
                    if (j13 != null) {
                        i11 = ib.b.s(j13, j11);
                    }
                    if (i11 >= 0) {
                        j13[i11] = j12;
                        Arrays.sort(j13);
                        if (levelDB == null) {
                            levelDB = W();
                        }
                        levelDB.I(aVar.l(), j13);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (aVar.i() != j11) {
                        break;
                    } else {
                        if (levelDB == null) {
                            levelDB = W();
                        }
                        levelDB.putLong(aVar.l(), j12);
                        break;
                    }
            }
        }
        if (levelDB != null) {
            levelDB.apply();
        }
    }

    public void m(q qVar) {
        if (this.f13840u == null) {
            this.f13840u = new lb.d<>();
        }
        this.f13840u.add(qVar);
    }

    public int m0() {
        if (this.f13830k == null) {
            this.f13830k = Integer.valueOf(this.f13841v.getInt("settings_badge_flags", 0));
        }
        return this.f13830k.intValue();
    }

    public int m1() {
        Throwable th;
        if (this.f13822c == null) {
            LevelDB levelDB = this.f13841v;
            int i10 = Q;
            int i11 = levelDB.getInt("settings_night_mode", i10);
            if (i11 == 1) {
                try {
                    SensorManager sensorManager = (SensorManager) j0.n().getSystemService("sensor");
                    if (sensorManager == null || sensorManager.getDefaultSensor(5) != null) {
                        i10 = i11;
                    } else {
                        org.thunderdog.challegram.Log.e("Disabling night mode, because light sensor is unavailable", new Object[0]);
                        try {
                            F3("settings_night_mode");
                        } catch (Throwable th2) {
                            th = th2;
                            org.thunderdog.challegram.Log.w(th);
                            i11 = i10;
                            this.f13822c = Integer.valueOf(i11);
                            return this.f13822c.intValue();
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i10 = i11;
                }
                i11 = i10;
            }
            this.f13822c = Integer.valueOf(i11);
        }
        return this.f13822c.intValue();
    }

    public ae.n m2(int i10) {
        String str = "theme" + i10 + "_";
        ae.n nVar = new ae.n(z.c0(i10));
        int length = str.length();
        Map<String, Integer> c10 = ae.m.c();
        Map<String, Integer> b10 = b0.b();
        int i11 = 0;
        for (LevelDB.a aVar : this.f13841v.g(str)) {
            try {
                q3(aVar, length, nVar, c10, b10);
                i11++;
            } catch (Throwable th) {
                org.thunderdog.challegram.Log.e("Cannot parse theme entry, key: %s", th, aVar.l());
            }
        }
        if (i11 <= 0) {
            return null;
        }
        nVar.n(C0(i10));
        return nVar;
    }

    public boolean m4(float f10) {
        if (!f2(f10) || t0() == f10) {
            return false;
        }
        this.f13833n = Float.valueOf(f10);
        t3("settings_font_size", f10);
        d3(this.B, f10);
        return true;
    }

    public boolean m5(long j10) {
        if (n1() == j10) {
            return false;
        }
        this.f13824e = Long.valueOf(j10);
        w3("settings_night_mode_schedule", j10);
        if (m1() == 2) {
            E(true);
        }
        return true;
    }

    public final void m6(me.vkryl.leveldb.LevelDB r30, android.content.SharedPreferences.Editor r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: he.i.m6(me.vkryl.leveldb.LevelDB, android.content.SharedPreferences$Editor, int):void");
    }

    public int n(String str, int i10, int i11, hj.m mVar) {
        String str2;
        Throwable th;
        String l10;
        StringBuilder sb2;
        int c32 = c3();
        int i12 = 0;
        if (mVar != null) {
            StringBuilder sb3 = new StringBuilder("theme_installation_");
            mVar.f27695j = new ae.n(z.c0(c32));
            if (!ib.i.i(mVar.f27689d)) {
                mVar.f27695j.n(mVar.f27689d);
                sb3.append('w');
                sb3.append(mVar.f27689d);
            }
            if (!mVar.f27694i.isEmpty()) {
                sb3.append('c');
            }
            for (hj.m.a aVar : mVar.f27694i) {
                mVar.f27695j.j(aVar.f27697b, Integer.valueOf(aVar.f27698c));
                sb3.append(',');
                sb3.append(aVar.f27696a);
                sb3.append(":");
                sb3.append(aVar.f27698c);
            }
            if (!mVar.f27693h.isEmpty()) {
                sb3.append('p');
            }
            for (hj.m.a aVar2 : mVar.f27693h) {
                mVar.f27695j.m(aVar2.f27697b, Float.valueOf(aVar2.M));
                sb3.append(',');
                sb3.append(aVar2.f27696a);
                sb3.append(":");
                sb3.append(v0.e0(aVar2.M, true));
            }
            str2 = sb3.toString();
            int i13 = this.f13841v.getInt(str2, 0);
            if (V1(i13)) {
                mVar.f27695j.k(z.c0(i13));
                return i13;
            } else if (i13 > 0) {
                this.f13841v.remove(str2);
            }
        } else {
            str2 = null;
        }
        this.f13841v.edit();
        u3("settings_theme_count", c32);
        z3("theme_name" + c32, str);
        if (i11 > 0) {
            String str3 = "theme" + i11 + "_";
            for (LevelDB.a aVar3 : this.f13841v.g(str3)) {
                try {
                    l10 = aVar3.l();
                    sb2 = new StringBuilder();
                    sb2.append("theme");
                    sb2.append(c32);
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    sb2.append(l10.substring(str3.length() - 1));
                    String sb4 = sb2.toString();
                    char charAt = l10.charAt(str3.length());
                    if (charAt == 'c') {
                        this.f13841v.putInt(sb4, aVar3.h());
                    } else if (charAt != 'p') {
                        org.thunderdog.challegram.Log.e("Unknown theme key: %s", l10);
                    } else {
                        this.f13841v.putFloat(sb4, aVar3.g());
                    }
                    i12 = 0;
                } catch (Throwable th3) {
                    th = th3;
                    i12 = 0;
                    org.thunderdog.challegram.Log.e("Error while copying", th, new Object[i12]);
                }
            }
            int z02 = z0(i11);
            if ((z02 & 1) != 0) {
                this.f13841v.C("theme_flags" + c32, (byte) (z02 | 2));
                String string = this.f13841v.getString("theme_author" + i11, null);
                if (!ib.i.i(string)) {
                    this.f13841v.putString("theme_author" + c32, string);
                }
                String string2 = this.f13841v.getString("theme_wallpaper" + i11, null);
                if (!ib.i.i(string2)) {
                    this.f13841v.putString("theme_wallpaper" + c32, string2);
                }
            }
        } else if (mVar != null) {
            for (hj.m.a aVar4 : mVar.f27694i) {
                u3(a6(c32, aVar4.f27696a), aVar4.f27698c);
            }
            for (hj.m.a aVar5 : mVar.f27693h) {
                t3(c6(c32, aVar5.f27696a), aVar5.M);
                if (aVar5.f27697b == R.id.theme_property_parentTheme) {
                    i12 = 1;
                }
            }
            if (!ib.i.i(mVar.f27688c)) {
                this.f13841v.putString("theme_author" + c32, mVar.f27688c);
            }
            if (!ib.i.i(mVar.f27689d)) {
                this.f13841v.putString("theme_wallpaper" + c32, mVar.f27689d);
            }
            this.f13841v.C("theme_flags" + c32, (byte) 1);
            if (!ib.i.i(str2)) {
                this.f13841v.putInt(str2, c32);
            }
        }
        if (i12 == 0) {
            t3(b6(c32, R.id.theme_property_parentTheme), i10);
        }
        this.f13841v.apply();
        return c32;
    }

    public final <T extends nb.b> void n0(String str, Map<String, T> map, Class<T> cls) {
        byte[] m10 = this.f13841v.m(str);
        if (m10 != null && m10.length != 0) {
            try {
                nb.a aVar = new nb.a(m10);
                int s10 = aVar.s();
                for (int i10 = 0; i10 < s10; i10++) {
                    String q10 = aVar.q();
                    T newInstance = cls.newInstance();
                    newInstance.a(aVar);
                    map.put(q10, newInstance);
                }
            } catch (Throwable th) {
                org.thunderdog.challegram.Log.e("Unable to get binary map", th, new Object[0]);
            }
        }
    }

    public final long n1() {
        if (this.f13824e == null) {
            this.f13824e = Long.valueOf(this.f13841v.getLong("settings_night_mode_schedule", ib.c.f(ib.c.g(22, 0, 0), ib.c.g(7, 0, 0))));
        }
        return this.f13824e.longValue();
    }

    public LevelDB n3() {
        return this.f13841v;
    }

    public void n4(int i10) {
        if (u0() != i10) {
            LevelDB levelDB = this.f13841v;
            Integer valueOf = Integer.valueOf(i10);
            this.f13838s = valueOf;
            levelDB.putInt("settings_chat_list_mode", valueOf.intValue());
            lb.d<c> dVar = this.f13839t;
            if (dVar != null) {
                Iterator<c> it = dVar.iterator();
                while (it.hasNext()) {
                    it.next().h5(i10);
                }
            }
        }
    }

    public boolean n5(int i10, boolean z10) {
        int q12 = q1();
        if (z10) {
            if (i10 == 8) {
                q12 = ib.c.h(q12, 16, false);
            } else if (i10 == 16) {
                q12 = ib.c.h(q12, 8, false);
            }
        }
        return o5(ib.c.h(q12, i10, z10));
    }

    @Deprecated
    public final void n6(SharedPreferences sharedPreferences, SharedPreferences.Editor editor, int i10) {
        switch (i10) {
            case 1:
                h9.F0(sharedPreferences, editor);
                return;
            case 2:
            default:
                return;
            case 3:
            case 6:
                int i11 = sharedPreferences.getInt("settings_other", -1);
                if (i11 != -1 && (i11 & org.thunderdog.challegram.Log.TAG_CAMERA) == 0) {
                    sharedPreferences.edit().putInt("settings_other", i11 | org.thunderdog.challegram.Log.TAG_CAMERA).apply();
                    return;
                }
                return;
            case 4:
                float f10 = sharedPreferences.getFloat("night_lux_max", 1.5f) * Math.max(0.5f, Math.min(20.0f, sharedPreferences.getFloat("night_lux_max_multiply", 1.0f)));
                if (f10 != 1.5f) {
                    editor.putFloat("night_lux_max", f10);
                }
                editor.remove("night_lux_max_multiply");
                if (sharedPreferences.contains("settings_other")) {
                    int i12 = sharedPreferences.getInt("settings_other", 0);
                    if ((262144 & i12) != 0) {
                        editor.putInt("settings_night_mode", 1);
                    }
                    int i13 = i12 & (-5) & (-9) & (-33) & (-65) & (-129) & (-65537) & (-262145) & (-8388609) & (-134217729) & (-536870913) & (-524289) & (-16385);
                    if (i13 != i12) {
                        editor.putInt("settings_other", i13);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                editor.remove("record_id");
                return;
            case 7:
                editor.remove("settings_oreo_fix");
                return;
            case 8:
                int i14 = sharedPreferences.getInt("push_user_id", 0);
                String string = sharedPreferences.getString("push_user_ids", null);
                if (i14 != 0) {
                    editor.remove("push_user_id");
                    if (ib.i.i(string)) {
                        editor.putString("push_user_ids", String.valueOf(i14));
                        return;
                    }
                    return;
                }
                return;
            case 9:
                if (sharedPreferences.contains("settings_other")) {
                    int i15 = sharedPreferences.getInt("settings_other", 0);
                    if ((1048576 & i15) != 0) {
                        editor.putInt("settings_other", i15 & (-1048577));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public int o(String str, int i10, TdApi.ProxyType proxyType, String str2, boolean z10) {
        return p(str, i10, proxyType, str2, z10, 0);
    }

    public boolean o0(String str, boolean z10) {
        return this.f13841v.getBoolean(str, z10);
    }

    public int o1() {
        return ib.c.n(n1());
    }

    public final long o2() {
        return 0L;
    }

    public boolean o3() {
        return fd.a.f11894p && I(33554432);
    }

    public boolean o4(int i10) {
        if (v0() == i10) {
            return false;
        }
        if (i10 == 0) {
            this.f13841v.remove("settings_color_format");
        } else {
            this.f13841v.C("settings_color_format", (byte) i10);
        }
        this.H = i10;
        return true;
    }

    public final boolean o5(int i10) {
        if (q1() == i10) {
            return false;
        }
        this.f13831l = Integer.valueOf(i10);
        if (i10 == 1) {
            F3("settings_notification_flags");
        } else {
            u3("settings_notification_flags", i10);
        }
        return true;
    }

    public boolean o6() {
        return D(org.thunderdog.challegram.Log.TAG_TDLIB_FILES);
    }

    public int p(String str, int i10, TdApi.ProxyType proxyType, String str2, boolean z10, int i11) {
        boolean z11;
        int i12;
        boolean z12;
        byte[] b42 = b4(str, i10, proxyType);
        String trim = str2 != null ? str2.trim() : str2;
        long l02 = l0();
        int F1 = F1();
        LevelDB f10 = this.f13841v.edit();
        boolean z13 = false;
        if (i11 != 0) {
            f10.D("proxy_item_config_" + i11, b42);
            i12 = i11;
            z12 = false;
            z11 = false;
        } else {
            String i13 = this.f13841v.i("proxy_item_config_", b42);
            if (i13 != null) {
                int s10 = ib.i.s(i13.substring(18));
                z11 = false;
                z12 = l02 == ((long) s10) && (F1 & 1) != 0;
                i12 = s10;
            } else {
                int V0 = V0("proxy_id", 0) + 1;
                f10.putInt("proxy_id", V0);
                f10.D("proxy_item_config_" + V0, b42);
                f10.N("proxy_item_time_" + V0);
                i12 = V0;
                z12 = false;
                z11 = true;
            }
        }
        if (!ib.i.i(trim)) {
            f10.putString("proxy_item_desc_" + i12, trim);
        } else {
            f10.remove("proxy_item_desc_" + i12);
        }
        if (z12) {
            f10.apply();
            return i12;
        }
        if (z10) {
            if ((F1 & 1) == 0) {
                F1 |= 1;
                f10.C("proxy_settings", (byte) F1);
            }
            if (i12 != l02) {
                f10.putInt("proxy_current", i12);
            }
        } else if (l02 == 0) {
            if ((F1 & 1) != 0) {
                F1 &= -2;
                f10.C("proxy_settings", (byte) F1);
            }
            f10.putInt("proxy_current", i12);
        }
        f10.apply();
        if (z11) {
            S(new l(i12, str, i10, proxyType, trim), z10);
        }
        if (z10 || (l02 == i12 && (F1 & 1) != 0)) {
            z13 = true;
        }
        int i14 = i12;
        U(i12, str, i10, proxyType, trim, z13, z11);
        if (l02 == 0) {
            T(true);
        }
        return i14;
    }

    public float p0() {
        int q02 = q0();
        if (q02 == 1) {
            return 1.3333334f;
        }
        if (q02 != 2) {
            return q02 != 3 ? 1.7777778f : 0.0f;
        }
        return 1.0f;
    }

    public int p1() {
        return ib.c.m(n1());
    }

    public final ae.r p3(LevelDB.a aVar, ae.r rVar) {
        int parseInt = Integer.parseInt(aVar.l().substring(10));
        if (parseInt <= 0) {
            return rVar;
        }
        int c02 = z.c0(parseInt);
        if (rVar != null && rVar.c() == c02) {
            return rVar;
        }
        return new ae.r(c02, aVar.k(), C0(parseInt), (int) O1(parseInt, R.id.theme_property_parentTheme, 1.0f), z0(parseInt));
    }

    public void p4(int i10, int i11, int[] iArr) {
        String Y5 = Y5(i10, i11);
        if (iArr == null || iArr.length == 0) {
            this.f13841v.remove(Y5);
        } else {
            this.f13841v.H(Y5, iArr);
        }
    }

    public void p5(int i10) {
        u3("paint_id", i10);
    }

    public boolean p6() {
        return D(4194304);
    }

    public void q(k kVar) {
        if (this.E == null) {
            this.E = new lb.d<>();
        }
        this.E.add(kVar);
    }

    public int q0() {
        return this.f13841v.getInt("settings_camera_ratio", 0);
    }

    public final int q1() {
        if (this.f13831l == null) {
            int i10 = this.f13841v.getInt("settings_notification_flags", 1);
            if (ib.c.b(i10, 8) && ib.c.b(i10, 16)) {
                i10 = ib.c.h(ib.c.h(i10, 8, false), 16, false);
            }
            this.f13831l = Integer.valueOf(i10);
        }
        return this.f13831l.intValue();
    }

    public boolean q4(e eVar, int i10, boolean z10) {
        int h10 = ib.c.h(eVar.f13856g, i10, z10);
        if (eVar.f13856g == h10) {
            return false;
        }
        LevelDB levelDB = this.f13841v;
        levelDB.putInt(n2(eVar.f13850a) + "flags", h10);
        eVar.f13856g = h10;
        return true;
    }

    public void q5(int i10) {
        if (i10 == 53) {
            F3("pip_gravity");
        } else {
            u3("pip_gravity", i10);
        }
    }

    public boolean q6() {
        return D(org.thunderdog.challegram.Log.TAG_CONTACT);
    }

    public void r(m mVar) {
        this.C.add(mVar);
    }

    public int r0() {
        if (!fd.a.f11888j) {
            return 2;
        }
        int i10 = this.f13841v.getInt("settings_camera_type", 0);
        if (i10 != 1 || fd.a.f11889k) {
            return i10;
        }
        return 0;
    }

    public f r1() {
        return this.M;
    }

    public void r2() {
        if (!e2()) {
            s3("is_emulator", true);
            ya.o1().W2(true);
        }
    }

    public void r4(int i10, int i11, Integer num) {
        if (num == null) {
            this.f13841v.remove(Z5(i10, i11));
        } else {
            this.f13841v.putInt(Z5(i10, i11), num.intValue());
        }
    }

    public void r5(float f10, float f11) {
        w3("pip", ib.c.f((int) Math.signum(f10), (int) Math.signum(f11)));
    }

    public boolean r6() {
        return false;
    }

    public void s(n nVar) {
        this.D.add(nVar);
    }

    public int s0() {
        return this.f13841v.getInt("settings_camera_control", 0);
    }

    public int s1() {
        return V0("paint_id", 0);
    }

    public void s2(e eVar) {
        if (q4(eVar, 1, true)) {
            V3();
        }
    }

    public void s3(String str, boolean z10) {
        this.f13841v.putBoolean(str, z10);
    }

    public void s4(int i10, String str) {
        LevelDB levelDB = this.f13841v;
        levelDB.putString("theme_name" + i10, str);
    }

    public void s5(int i10) {
        u3("player_flags", i10);
    }

    public boolean s6() {
        return I(134217728);
    }

    public void t(u uVar) {
        lb.i.a(this.f13845z, uVar);
    }

    public float t0() {
        if (this.f13833n == null) {
            float f10 = 15.0f;
            float f11 = this.f13841v.getFloat("settings_font_size", 15.0f);
            if (f2(f11)) {
                f10 = f11;
            }
            this.f13833n = Float.valueOf(f10);
        }
        return this.f13833n.floatValue();
    }

    public int t1(String str) {
        String str2 = "brut_force_seconds";
        if (str != null) {
            str2 = str2 + str;
        }
        return this.f13841v.getInt(str2, 0);
    }

    public void t2(f fVar) {
        LevelDB levelDB = this.f13841v;
        levelDB.putInt("settings_emoji_installed_" + fVar.f13847a, fVar.f13849c);
    }

    public void t3(String str, float f10) {
        this.f13841v.putFloat(str, f10).apply();
    }

    public void t4(int i10, int i11, Float f10) {
        if (f10 == null) {
            this.f13841v.remove(b6(i10, i11));
        } else {
            this.f13841v.putFloat(b6(i10, i11), f10.floatValue());
        }
    }

    public void t5(boolean z10) {
        boolean z11 = fd.a.f11894p && z10;
        if (E5(33554432, z11)) {
            f3(z11);
        }
    }

    public List<t> t6() {
        List<t> list = this.A;
        if (list != null) {
            return list;
        }
        int K0 = v0.K0();
        int i10 = 0;
        t[] tVarArr = {new t(new v(org.thunderdog.challegram.Log.TAG_CRASH, 144)), new t(new v(480, 360)), new t(new v(854, 480)), new t(new v(org.thunderdog.challegram.Log.TAG_CAMERA, 640)), new t(new v(1280, 720), 60), new t(new v(1920, 1080), 60), new t(new v(3840, 2160), 60), new t(new v(7680, 4320), 60)};
        if (K0 <= 0) {
            return Arrays.asList(tVarArr);
        }
        ArrayList arrayList = new ArrayList(8);
        while (true) {
            if (i10 >= 8) {
                break;
            }
            t tVar = tVarArr[i10];
            v vVar = tVar.f13890a;
            int i11 = vVar.f13893a;
            if (i11 > K0) {
                float f10 = K0 / i11;
                int i12 = (int) (i11 * f10);
                int i13 = (int) (vVar.f13894b * f10);
                int i14 = i12 - (i12 % 2);
                int i15 = i13 - (i13 % 2);
                if (arrayList.isEmpty() || ((t) arrayList.get(arrayList.size() - 1)).f13890a.f13893a < i14) {
                    arrayList.add(tVar.a(new v(i14, i15)));
                }
            } else {
                arrayList.add(tVar);
                i10++;
            }
        }
        this.A = arrayList;
        return arrayList;
    }

    public boolean u(int i10) {
        LevelDB levelDB = this.f13841v;
        return levelDB.contains("settings_tdlib_allow_debug" + i10);
    }

    public int u0() {
        if (this.f13838s == null) {
            this.f13838s = Integer.valueOf(this.f13841v.getInt("settings_chat_list_mode", 2));
        }
        return this.f13838s.intValue();
    }

    public long u1() {
        long j10;
        TimeUnit timeUnit;
        if (Build.VERSION.SDK_INT >= 24) {
            timeUnit = TimeUnit.MINUTES;
            j10 = 30;
        } else {
            timeUnit = TimeUnit.HOURS;
            j10 = 1;
        }
        return timeUnit.toSeconds(j10);
    }

    public void u2(long j10) {
        J5(j10 | P1());
    }

    public void u3(String str, int i10) {
        this.f13841v.putInt(str, i10);
    }

    public void u4(int i10, String str) {
        if (ib.i.i(str)) {
            LevelDB levelDB = this.f13841v;
            levelDB.remove("theme_wallpaper" + i10);
            return;
        }
        LevelDB levelDB2 = this.f13841v;
        levelDB2.putString("theme_wallpaper" + i10, str);
    }

    public void u5(t tVar) {
        int[] f10 = tVar != null ? tVar.f() : null;
        this.f13825f = tVar;
        if (f10 != null) {
            this.f13841v.H("settings_video_limit", f10);
        } else {
            this.f13841v.remove("settings_video_limit");
        }
    }

    public boolean v(long j10) {
        return o0("allow_location_" + j10, false);
    }

    public int v0() {
        if (this.H == -1) {
            byte l10 = this.f13841v.l("settings_color_format", (byte) 0);
            this.H = l10;
            if (l10 < 0 || l10 > 2) {
                this.H = 0;
            }
        }
        return this.H;
    }

    public int v1() {
        return V0("pip_gravity", 53);
    }

    public void v2(TdApi.ChatSource chatSource) {
        int constructor = chatSource.getConstructor();
        if (constructor == -328571244) {
            String str = ((TdApi.ChatSourcePublicServiceAnnouncement) chatSource).type;
            LevelDB levelDB = this.f13841v;
            String str2 = "settings_tutorial_psa";
            if (!ib.i.i(str)) {
                str2 = str2 + str;
            }
            levelDB.K(str2);
        } else if (constructor == 394074115) {
            u2(65536L);
        }
    }

    public void v3(String str, long j10, long j11, int i10, int i11) {
        LevelDB levelDB = this.f13841v;
        levelDB.I("known_size_for_" + str, new long[]{j10, j11, ib.c.f(i10, i11)});
    }

    public void v4(String str) {
        if (ib.i.i(str)) {
            this.f13841v.remove("push_device_token");
        } else {
            this.f13841v.putString("push_device_token", str);
        }
    }

    public void v5(int[] iArr) {
        if (iArr != null) {
            this.f13841v.H("proxy_order", iArr);
        } else {
            this.f13841v.remove("proxy_order");
        }
    }

    public void w() {
        this.f13832m.a();
    }

    public int[] w0(int i10, int i11) {
        return this.f13841v.p(Y5(i10, i11));
    }

    public long w1() {
        return e1("pip", ib.c.f(w.G2() ? -1 : 1, -1));
    }

    public void w2(long j10) {
        this.f13843x = j10 | this.f13843x;
    }

    public void w3(String str, long j10) {
        this.f13841v.putLong(str, j10);
    }

    public void w4(boolean z10, boolean z11) {
        F5(ib.c.h(ib.c.h(J1(), org.thunderdog.challegram.Log.TAG_CAMERA, z10), org.thunderdog.challegram.Log.TAG_VOICE, z11));
    }

    public void w5(int i10, boolean z10) {
        x5(F1(), i10, z10);
    }

    public final void x(int i10, int i11, String str) {
        int i12 = 30;
        if (i11 > 1) {
            i12 = Math.min((int) TimeUnit.MINUTES.toSeconds(5L), ((i11 - 1) * 15) + 30);
        }
        String str2 = "brut_force_seconds";
        if (str != null) {
            str2 = str2 + str;
        }
        this.f13841v.putInt(str2, i12);
        if (str == null) {
            str = "";
        }
        T5(str);
    }

    public e x0(long j10, boolean z10) {
        char c10;
        String str;
        e eVar;
        e eVar2 = null;
        if (j10 < 0) {
            return null;
        }
        String n22 = n2(j10);
        long j11 = 0;
        long j12 = 0;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1;
        boolean z11 = z10;
        for (LevelDB.a aVar : this.f13841v.g(n22)) {
            String substring = aVar.l().substring(n22.length());
            substring.hashCode();
            switch (substring.hashCode()) {
                case -838362136:
                    if (substring.equals("uptime")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3355:
                    if (substring.equals("id")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 96801:
                    if (substring.equals("app")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 112921:
                    if (substring.equals("rip")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3560141:
                    if (substring.equals("time")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 97513095:
                    if (substring.equals("flags")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    str = n22;
                    long i13 = aVar.i();
                    if (!z11 || i13 <= TimeUnit.MINUTES.toMillis(1L)) {
                        eVar = null;
                        j12 = i13;
                        break;
                    } else {
                        aVar.m();
                        return null;
                    }
                case 1:
                    str = n22;
                    i12 = aVar.h();
                    eVar = null;
                    break;
                case 2:
                    str = n22;
                    i11 = aVar.h();
                    if (z11 && i11 != 1519020) {
                        aVar.m();
                        return eVar2;
                    }
                    eVar = null;
                    break;
                case 3:
                    str = n22;
                    str2 = aVar.k();
                    if (!ib.i.i(str2)) {
                        eVar = eVar2;
                        break;
                    } else {
                        aVar.m();
                        return eVar2;
                    }
                case 4:
                    long i14 = aVar.i();
                    if (z11) {
                        str = n22;
                        if (TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - i14) > 15) {
                            aVar.m();
                            return null;
                        }
                        eVar2 = null;
                    } else {
                        str = n22;
                    }
                    eVar = eVar2;
                    j11 = i14;
                    break;
                case 5:
                    i10 = aVar.h();
                    if (z11) {
                        if ((i10 & 1) == 0) {
                            if ((i10 & 2) != 0) {
                                eVar = eVar2;
                                str = n22;
                                z11 = false;
                                break;
                            }
                        } else {
                            aVar.m();
                            return eVar2;
                        }
                    }
                default:
                    eVar = eVar2;
                    str = n22;
                    break;
            }
            eVar2 = eVar;
            n22 = str;
        }
        e eVar3 = eVar2;
        e eVar4 = new e(j10, str2, j11, j12, i10, i11, i12);
        return (!z11 || eVar4.c() != 0) ? eVar4 : eVar3;
    }

    public int x1() {
        return V0("player_flags", 2);
    }

    public final void x2() {
        throw new UnsupportedOperationException("Method not decompiled: he.i.x2():void");
    }

    public void x3(String str, long[] jArr) {
        this.f13841v.I(str, jArr);
    }

    public void x4(boolean z10) {
        h6(16, z10);
    }

    public final boolean x5(int i10, int i11, boolean z10) {
        l lVar;
        int i12 = 0;
        if (z10 == ((i10 & i11) != 0)) {
            return z10;
        }
        int i13 = z10 ? i10 | i11 : (~i11) & i10;
        if (i11 == 1) {
            if (z10) {
                int l02 = l0();
                if (l02 <= 0 || (lVar = A1(l02)) == null) {
                    return false;
                }
                i12 = l02;
            } else {
                lVar = null;
            }
            this.f13841v.C("proxy_settings", (byte) i13);
            if (lVar != null) {
                U(i12, lVar.f13864b, lVar.f13865c, lVar.M, lVar.O, true, false);
            } else {
                U(0, null, 0, null, null, true, false);
            }
        } else {
            this.f13841v.C("proxy_settings", (byte) i13);
        }
        return z10;
    }

    public int y0(int i10, int i11) {
        try {
            return this.f13841v.U(Z5(i10, i11));
        } catch (FileNotFoundException unused) {
            return c0.b((int) B0(i10, R.id.theme_property_parentTheme), i11);
        }
    }

    public int y1() {
        if (this.f13834o == null) {
            this.f13834o = Integer.valueOf(this.f13841v.getInt("preferred_audio_mode", 0));
        }
        return this.f13834o.intValue();
    }

    public void y3(long j10, int i10) {
        u3("receiver_" + j10, i10);
    }

    public void y4(boolean z10) {
        h6(64, z10);
    }

    public void y5(String str) {
        if (ib.i.i(str)) {
            this.f13841v.remove("settings_language_code_suggested");
        } else {
            this.f13841v.putString("settings_language_code_suggested", str);
        }
    }

    public boolean z(int i10) {
        return (z0(i10) & 1) == 0;
    }

    public int z0(int i10) {
        LevelDB levelDB = this.f13841v;
        return levelDB.l("theme_flags" + i10, (byte) 0);
    }

    public t z1() {
        if (this.f13825f == null) {
            this.f13825f = new t(this.f13841v.p("settings_video_limit"));
        }
        return this.f13825f;
    }

    public boolean z2() {
        return I(1);
    }

    public void z3(String str, String str2) {
        this.f13841v.putString(str, str2);
    }

    public void z4(boolean z10) {
        if (z10) {
            z10 = false;
        }
        E5(org.thunderdog.challegram.Log.TAG_GIF_LOADER, z10);
    }

    public void z5(boolean z10) {
        E5(16, z10);
    }

    public static class v {
        public final int f13893a;
        public final int f13894b;

        public v(int i10, int i11) {
            this.f13893a = Math.max(i10, i11);
            this.f13894b = Math.min(i11, i10);
        }

        public boolean a() {
            int i10 = this.f13893a;
            return i10 == this.f13894b && i10 == 854;
        }

        public boolean b() {
            int i10 = this.f13893a;
            return i10 == this.f13894b && i10 == -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            v vVar = (v) obj;
            return this.f13893a == vVar.f13893a && this.f13894b == vVar.f13894b;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f13893a), Integer.valueOf(this.f13894b));
        }

        public v(int i10) {
            this(i10, i10);
        }
    }

    public static abstract class d implements Comparable<d> {
        public String M;
        public int N;
        public TdApi.File O;
        public ld.h P;
        public final String f13847a;
        public int f13848b;
        public int f13849c;

        public d(String str, int i10, String str2, int i11) {
            this.f13847a = str;
            this.f13848b = i10;
            this.M = str2;
            this.N = i11;
        }

        public final int compareTo(d dVar) {
            boolean z10 = false;
            if (ib.i.c(this.f13847a, dVar.f13847a)) {
                return 0;
            }
            int i10 = this.N;
            boolean z11 = i10 != -1;
            int i11 = dVar.N;
            if (i11 != -1) {
                z10 = true;
            }
            if (z11 != z10) {
                return Boolean.compare(z10, z11);
            }
            if (z11 && i10 != i11) {
                return Integer.compare(i10, i11);
            }
            if (!ib.i.c(this.M, dVar.M)) {
                return this.M.compareTo(dVar.M);
            }
            return this.f13847a.compareTo(dVar.f13847a);
        }

        public final String b() {
            return this.M;
        }

        public final TdApi.File c() {
            return this.O;
        }

        public abstract int d(boolean z10);

        public final ld.h e() {
            return this.P;
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && ((d) obj).f13847a.equals(this.f13847a);
        }

        public abstract void f(kb.i iVar);

        public abstract boolean g();

        public final boolean h() {
            return g() || d(false) == 1;
        }

        public int hashCode() {
            return this.f13847a.hashCode();
        }

        public final void i(tb tbVar, TdApi.File file) {
            if (file != null) {
                int i10 = a0.i(64.0f);
                ld.h hVar = new ld.h(tbVar, file);
                this.P = hVar;
                hVar.s0(1);
                this.P.t0(i10);
                return;
            }
            this.P = null;
        }

        public d(String str) {
            this.N = -1;
            this.f13847a = v0.T0(str);
        }

        public d(TdApi.Message message, String str, int i10) {
            boolean z10;
            TdApi.TextEntity[] textEntityArr;
            this.N = -1;
            TdApi.MessageDocument messageDocument = (TdApi.MessageDocument) message.content;
            this.f13847a = v0.T0(messageDocument.document.fileName);
            this.f13849c = Math.max(message.date, message.editDate);
            TdApi.FormattedText formattedText = messageDocument.caption;
            boolean z11 = false;
            if (formattedText == null || (textEntityArr = formattedText.entities) == null || textEntityArr.length <= 0) {
                z10 = false;
            } else {
                boolean z12 = false;
                z10 = false;
                for (TdApi.TextEntity textEntity : textEntityArr) {
                    boolean z13 = true;
                    switch (textEntity.type.getConstructor()) {
                        case TdApi.TextEntityTypeHashtag.CONSTRUCTOR:
                            String u12 = ob.e.u1(messageDocument.caption.text, textEntity);
                            if (u12.equals(str)) {
                                z12 = true;
                                break;
                            } else if (!u12.equals("#hide")) {
                                if (!u12.equals("#noname")) {
                                    if (!u12.startsWith("#v")) {
                                        if (u12.startsWith("#p")) {
                                            this.N = ib.i.t(u12.substring(2), -1);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        this.f13848b = ib.i.t(u12.substring(2), -1);
                                        break;
                                    }
                                } else {
                                    z10 = true;
                                    break;
                                }
                            } else if ((fd.b.f11904a != 1 || !this.f13847a.equals("samsung")) ? false : z13) {
                                break;
                            } else {
                                throw new IllegalArgumentException();
                            }
                            break;
                        case TdApi.TextEntityTypeCode.CONSTRUCTOR:
                        case TdApi.TextEntityTypePreCode.CONSTRUCTOR:
                        case TdApi.TextEntityTypePre.CONSTRUCTOR:
                            this.M = ob.e.u1(messageDocument.caption.text, textEntity);
                            break;
                    }
                }
                z11 = z12;
            }
            if (!z11 || this.f13848b != 5 || this.M == null) {
                throw new IllegalArgumentException();
            }
            this.O = messageDocument.document.document;
            if (g()) {
                if (z10) {
                    this.M = w.i1(i10);
                }
                this.O = null;
            }
        }
    }
}
