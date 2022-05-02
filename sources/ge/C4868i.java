package ge;

import android.content.SharedPreferences;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import gd.C4779t2;
import ge.C4868i;
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
import lb.EnumC6435c;
import lb.EnumC6459p;
import me.vkryl.leveldb.LevelDB;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.drinkmore.Tracer;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p067ed.C4183a;
import p067ed.C4184b;
import p082fd.C4383l;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5063c;
import p108hb.C5067f;
import p108hb.C5070i;
import p110hd.C5078d;
import p110hd.C5094n;
import p110hd.C5095o;
import p111he.C5132o;
import p139jb.AbstractC5917i;
import p139jb.AbstractC5918j;
import p139jb.AbstractRunnableC5910b;
import p154kb.C6227d;
import p154kb.C6235i;
import p156kd.C6246h;
import p181mb.AbstractC6811b;
import p181mb.C6810a;
import p193nb.C7316a;
import p193nb.C7319d;
import p193nb.C7321e;
import p350yd.AbstractC11073vb;
import p350yd.C10536ab;
import p350yd.C10756j9;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import p364zd.AbstractC11531p;
import p364zd.C11511b0;
import p364zd.C11514c0;
import p364zd.C11520h;
import p364zd.C11524j;
import p364zd.C11527m;
import p364zd.C11529n;
import p364zd.C11533r;
import p364zd.C11541z;

public class C4868i {
    public static final AtomicBoolean f16611O = new AtomicBoolean(false);
    public static volatile C4868i f16612P;
    public static final int f16613Q;
    public static final long f16614R;
    public static final float[] f16615S;
    public static final float f16616T;
    public static final float f16617U;
    public List<C4889t> f16618A;
    public C6227d<AbstractC4879k> f16622E;
    public HashMap<String, AbstractRunnableC5910b> f16623F;
    public C4877i f16624G;
    public Long f16626I;
    public List<String> f16627J;
    public C4874f f16629L;
    public C4874f f16630M;
    public C4876h f16631N;
    public Integer f16632a;
    public Long f16633b;
    public Integer f16634c;
    public Float f16635d;
    public Long f16636e;
    public C4889t f16637f;
    public Integer f16638g;
    public Integer f16639h;
    public Integer f16640i;
    public Long f16641j;
    public Integer f16642k;
    public Integer f16643l;
    public Float f16645n;
    public Integer f16646o;
    public Integer f16647p;
    public Integer f16648q;
    public Integer f16650s;
    public C6227d<AbstractC4871c> f16651t;
    public C6227d<AbstractC4886q> f16652u;
    public final LevelDB f16653v;
    public boolean f16654w;
    public long f16655x;
    public Boolean f16656y;
    public final C4887r f16644m = new C4887r("settings_tdlib_other", "settings_tdlib_log_size", "settings_tdlib_verbosity");
    public final HandlerC4885p f16649r = new HandlerC4885p(this);
    public final List<Reference<AbstractC4890u>> f16657z = new ArrayList();
    public final List<Reference<AbstractC4875g>> f16619B = new ArrayList();
    public final C6227d<AbstractC4881m> f16620C = new C6227d<>();
    public C6227d<AbstractC4882n> f16621D = new C6227d<>();
    public int f16625H = -1;
    public long f16628K = SystemClock.uptimeMillis();

    public class C4869a implements LevelDB.AbstractC7053b {
        public C4869a() {
        }

        @Override
        public boolean mo17940a(LevelDB levelDB, Throwable th) {
            Tracer.m14776d(th);
            return true;
        }

        @Override
        public void mo17939b(LevelDB levelDB, String str, Throwable th) {
            Log.e(org.thunderdog.challegram.Log.LOG_TAG, str, th);
        }
    }

    public class C4870b extends AbstractRunnableC5910b {
        public final String f16659M;

        public C4870b(String str) {
            this.f16659M = str;
        }

        public void m24542h(String str) {
            C4868i.this.m24655l2(str);
        }

        @Override
        public void mo1364b() {
            if (C4868i.this.m24715d6(this.f16659M)) {
                C4383l.m28061a().m28059c(this, 1000);
            } else {
                C4868i.this.f16623F.remove(this.f16659M);
            }
            final String str = this.f16659M;
            C1379j0.m37337d0(new Runnable() {
                @Override
                public final void run() {
                    C4868i.C4870b.this.m24542h(str);
                }
            });
        }
    }

    public interface AbstractC4871c {
        void mo24541l5(int i);
    }

    public static class C4873e {
        public final long f16668a;
        public final String f16669b;
        public final long f16670c;
        public final long f16671d;
        public final int f16672e;
        public final int f16673f;
        public int f16674g;

        public C4873e(long j, String str, long j2, long j3, int i, int i2, int i3) {
            this.f16668a = j;
            this.f16669b = str;
            this.f16670c = j2;
            this.f16671d = j3;
            this.f16674g = i;
            this.f16672e = i2;
            this.f16673f = i3;
        }

        public int m24532c() {
            int i = this.f16674g;
            if ((i & 4) == 0) {
                return ((i & 8) == 0 && (i & 16) == 0) ? 0 : 3;
            }
            if (Client.m14788j(this.f16669b)) {
                return 2;
            }
            if (Client.m14789i(this.f16669b)) {
                return 4;
            }
            return Client.m14787k(this.f16669b) ? 3 : 1;
        }
    }

    public static class C4874f extends AbstractC4872d {
        public C4874f() {
            super("apple", 4, C4403w.m27871i1(R.string.EmojiBuiltIn), 0);
        }

        @Override
        public int mo24531d(boolean z) {
            return C4868i.m24727c2().m24822P0(this, z);
        }

        @Override
        public boolean equals(Object obj) {
            return (obj instanceof C4874f) && super.equals(obj);
        }

        @Override
        public void mo24530f(AbstractC5917i iVar) {
            C5078d.m23987z().m23989x(this, iVar);
        }

        @Override
        public boolean mo24529g() {
            return this.f16665a.equals("apple");
        }

        public C4874f(String str) {
            super(str);
        }

        public C4874f(TdApi.Message message) {
            super(message, "#emoji", R.string.EmojiBuiltIn);
        }
    }

    public interface AbstractC4875g {
        void mo22668a(float f);
    }

    public static class C4876h extends AbstractC4872d {
        public C4876h() {
            super("material-baseline", 1, C4403w.m27871i1(R.string.IconsBuiltIn), 0);
        }

        @Override
        public int mo24531d(boolean z) {
            return 0;
        }

        @Override
        public boolean equals(Object obj) {
            return (obj instanceof C4876h) && super.equals(obj);
        }

        @Override
        public void mo24530f(AbstractC5917i iVar) {
            iVar.mo1322a(false);
        }

        @Override
        public boolean mo24529g() {
            return "material-baseline".equals(this.f16665a);
        }

        public C4876h(TdApi.Message message) {
            super(message, "#icons", R.string.IconsBuiltIn);
        }
    }

    public static class C4877i {
        public final TdApi.LanguagePackInfo f16675a;
        public final int f16676b;
        public final Locale f16677c;

        public C4877i(TdApi.LanguagePackInfo languagePackInfo) {
            this.f16675a = languagePackInfo;
            this.f16676b = C4403w.m27906a2(languagePackInfo.pluralCode);
            this.f16677c = new Locale(C4403w.m27870i2(!C5070i.m24062i(languagePackInfo.baseLanguagePackId) ? languagePackInfo.pluralCode : languagePackInfo.f25408id));
        }
    }

    public static class C4878j implements AbstractC6811b {
        public double f16678a;
        public double f16679b;
        public float f16680c;

        public C4878j(double d, double d2, float f) {
            this.f16678a = d;
            this.f16679b = d2;
            this.f16680c = f;
        }

        @Override
        public void mo18913a(C6810a aVar) {
            this.f16678a = aVar.m18931i();
            this.f16679b = aVar.m18931i();
            this.f16680c = aVar.m18929k();
        }

        @Override
        public int mo18912b() {
            return 20;
        }

        @Override
        public void mo18911c(C6810a aVar) {
            aVar.m18950D(this.f16678a);
            aVar.m18950D(this.f16679b);
            aVar.m18948F(this.f16680c);
        }
    }

    public interface AbstractC4879k {
        void mo24528g6(String str);
    }

    public static class C4880l implements Comparable<C4880l> {
        public TdApi.ProxyType f16681M;
        public String f16683O;
        public int f16684P;
        public TdApi.Error f16686R;
        public int f16687S;
        public int f16688T;
        public final int f16689a;
        public String f16690b;
        public int f16691c;
        public int f16682N = -1;
        public long f16685Q = -1;

        public C4880l(int i, String str, int i2, TdApi.ProxyType proxyType, String str2) {
            this.f16689a = i;
            this.f16690b = str;
            this.f16691c = i2;
            this.f16681M = proxyType;
            this.f16683O = str2;
        }

        public static boolean m24525c(TdApi.ProxyType proxyType) {
            return proxyType != null && proxyType.getConstructor() == -890027341;
        }

        public static Object m24522f(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return new C5132o(null, R.id.theme_color_textLight);
        }

        public boolean m24526b() {
            return m24525c(this.f16681M);
        }

        public int compareTo(C4880l lVar) {
            int i = this.f16682N;
            int i2 = lVar.f16682N;
            if (i != i2) {
                return Integer.compare(i, i2);
            }
            return Integer.compare(lVar.f16689a, this.f16689a);
        }

        public CharSequence m24523e() {
            String str;
            int i;
            if (this.f16681M == null) {
                return null;
            }
            if (C5070i.m24062i(this.f16683O)) {
                str = this.f16690b + ":" + this.f16691c;
            } else {
                str = this.f16683O;
            }
            int constructor = this.f16681M.getConstructor();
            if (constructor == -1964826627) {
                i = R.string.ProxyMtproto;
            } else if (constructor == -1547188361) {
                i = R.string.ProxyHttp;
            } else if (constructor == -890027341) {
                TdApi.ProxyTypeSocks5 proxyTypeSocks5 = (TdApi.ProxyTypeSocks5) this.f16681M;
                i = (this.f16691c != 9050 || !C5070i.m24062i(proxyTypeSocks5.username) || !C5070i.m24062i(proxyTypeSocks5.password) || !C7389v0.m16592q1(this.f16690b.toLowerCase())) ? R.string.ProxySocks5 : R.string.ProxyTorNetwork;
            } else {
                throw new IllegalStateException();
            }
            return C4403w.m27875h1(i, C4894l.f16723a, str);
        }

        public String toString() {
            CharSequence e = m24523e();
            return e != null ? e.toString() : super.toString();
        }
    }

    public interface AbstractC4881m {
        void mo4623P4(C4880l lVar, boolean z);

        void mo4622g7(boolean z);

        void mo4621k3(int i, String str, int i2, TdApi.ProxyType proxyType, String str2, boolean z, boolean z2);
    }

    public interface AbstractC4882n {
        void mo7316a(boolean z, int i);
    }

    public static class C4883o {
        public final C7319d f16692a;
        public final int f16693b;
        public final long[] f16694c;
        public final boolean f16695d;
        public final long f16696e;

        public static class C4884a {
            public long f16697a;
            public long f16698b;
            public long f16699c;
            public long[] f16700d;
            public int f16701e;
            public long[] f16702f;
            public boolean f16703g;

            public C4884a(long j) {
                this.f16697a = j;
            }

            public C4883o m24513i() {
                return new C4883o(new C7319d(this.f16697a, this.f16698b, this.f16700d), this.f16701e, this.f16702f, this.f16703g, this.f16699c);
            }
        }

        public C4883o(C7319d dVar, int i, long[] jArr, boolean z, long j) {
            this.f16692a = dVar;
            this.f16693b = i;
            this.f16694c = jArr;
            this.f16695d = z;
            this.f16696e = j;
        }
    }

    public static class HandlerC4885p extends Handler {
        public final C4868i f16704a;

        public HandlerC4885p(C4868i iVar) {
            super(Looper.getMainLooper());
            this.f16704a = iVar;
        }

        @Override
        public void handleMessage(Message message) {
            this.f16704a.m24793T1(message);
        }
    }

    public interface AbstractC4886q {
        void mo2412i6(long j, long j2);
    }

    public class C4887r {
        public final String f16705a;
        public final String f16706b;
        public final String f16707c;
        public Integer f16708d;
        public Map<String, int[]> f16709e;

        public C4887r(String str, String str2, String str3) {
            this.f16705a = str;
            this.f16706b = str2;
            this.f16707c = str3;
        }

        public void m24512a() {
            TdApi.LogStream logStream;
            if (C1379j0.f5013g != 1) {
                if (this.f16709e == null) {
                    this.f16709e = new HashMap();
                }
                int i = 0;
                for (LevelDB.C7052a aVar : C4868i.this.f16653v.m17974g(this.f16707c)) {
                    String l = aVar.m17943l();
                    int max = Math.max(1, aVar.m17947h());
                    if (this.f16707c.length() == l.length()) {
                        i = max;
                    } else if (l.length() > this.f16707c.length() + 1) {
                        String substring = l.substring(this.f16707c.length() + 1);
                        int[] iArr = this.f16709e.get(substring);
                        int k = iArr != null ? iArr[1] : m24502k(substring);
                        if (m24499n(substring, max)) {
                            if (iArr != null) {
                                iArr[0] = max;
                            } else {
                                this.f16709e.put(substring, new int[]{max, k});
                            }
                        }
                    }
                }
                m24498o(i);
                if (m24503j()) {
                    logStream = new TdApi.LogStreamDefault();
                } else {
                    logStream = new TdApi.LogStreamFile(C10536ab.m4796H0(false), m24508e(), true);
                }
                TdApi.Object e = Client.m14793e(new TdApi.SetLogStream(logStream));
                if (e.getConstructor() == -1679978726) {
                    Tracer.m14771i(-1, TdApi.SetLogStream.class, (TdApi.Error) e, new RuntimeException().getStackTrace());
                }
            }
        }

        public final boolean m24511b(int i) {
            return C5063c.m24145b(m24506g(), i);
        }

        public void m24510c() {
            m24495r(null, 0);
        }

        public int m24509d(String str) {
            Map<String, int[]> map = this.f16709e;
            int[] iArr = map != null ? map.get(str) : null;
            if (iArr != null) {
                return iArr[1];
            }
            int k = m24502k(str);
            this.f16709e.put(str, new int[]{k, k});
            return k;
        }

        public long m24508e() {
            return C4868i.this.m24712e1(this.f16706b, C4868i.f16614R);
        }

        public List<String> m24507f() {
            ArrayList arrayList;
            TdApi.Object e = Client.m14793e(new TdApi.GetLogTags());
            int i = 0;
            if (e instanceof TdApi.LogTags) {
                String[] strArr = ((TdApi.LogTags) e).tags;
                int length = strArr.length;
                Map<String, int[]> map = this.f16709e;
                if (map != null) {
                    i = map.size();
                }
                arrayList = new ArrayList(length + i);
                Collections.addAll(arrayList, strArr);
            } else {
                Map<String, int[]> map2 = this.f16709e;
                if (map2 != null) {
                    i = map2.size();
                }
                arrayList = new ArrayList(i);
            }
            Map<String, int[]> map3 = this.f16709e;
            if (map3 != null) {
                for (String str : map3.keySet()) {
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                }
            }
            return arrayList;
        }

        public final int m24506g() {
            if (this.f16708d == null) {
                this.f16708d = Integer.valueOf(C4868i.this.f16653v.getInt(this.f16705a, 0));
            }
            return this.f16708d.intValue();
        }

        public int m24505h(String str) {
            if (C5070i.m24062i(str)) {
                return m24502k(str);
            }
            Map<String, int[]> map = this.f16709e;
            int[] iArr = map != null ? map.get(str) : null;
            if (iArr != null) {
                return iArr[0];
            }
            int k = m24502k(str);
            this.f16709e.put(str, new int[]{k, k});
            return k;
        }

        public boolean m24504i() {
            return m24505h(null) > 0;
        }

        public boolean m24503j() {
            return m24511b(2);
        }

        public final int m24502k(String str) {
            TdApi.Object e = Client.m14793e(C5070i.m24062i(str) ? new TdApi.GetLogVerbosityLevel() : new TdApi.GetLogTagVerbosityLevel(str));
            if (e instanceof TdApi.LogVerbosityLevel) {
                return ((TdApi.LogVerbosityLevel) e).verbosityLevel;
            }
            return -1;
        }

        public void m24501l() {
            C4868i.this.f16653v.edit();
            m24495r(null, 0);
            Map<String, int[]> map = this.f16709e;
            if (map != null) {
                for (Map.Entry<String, int[]> entry : map.entrySet()) {
                    m24495r(entry.getKey(), entry.getValue()[1]);
                }
            }
            m24497p(C4868i.f16614R);
            C4868i.this.f16653v.apply();
        }

        public final boolean m24500m(int i, boolean z) {
            int g = m24506g();
            int h = C5063c.m24139h(g, i, z);
            if (g == h) {
                return false;
            }
            this.f16708d = Integer.valueOf(h);
            C4868i.this.f16653v.putInt(this.f16705a, h);
            m24512a();
            return true;
        }

        public final boolean m24499n(String str, int i) {
            return Client.m14793e(new TdApi.SetLogTagVerbosityLevel(str, i)) instanceof TdApi.C7866Ok;
        }

        public final boolean m24498o(int i) {
            return Client.m14793e(new TdApi.SetLogVerbosityLevel(i)) instanceof TdApi.C7866Ok;
        }

        public void m24497p(long j) {
            if (j == C4868i.f16614R) {
                C4868i.this.f16653v.remove(this.f16706b);
            } else {
                C4868i.this.f16653v.putLong(this.f16706b, j);
            }
            m24512a();
        }

        public void m24496q(boolean z) {
            m24500m(2, z);
        }

        public void m24495r(String str, int i) {
            if (C5070i.m24062i(str)) {
                C4868i.this.m24582u3(this.f16707c, i);
                m24498o(i);
                return;
            }
            if (this.f16709e == null) {
                this.f16709e = new HashMap();
            }
            int[] iArr = this.f16709e.get(str);
            int k = iArr != null ? iArr[1] : m24502k(str);
            if (i != (iArr != null ? iArr[0] : k) && (Client.m14793e(new TdApi.SetLogTagVerbosityLevel(str, i)) instanceof TdApi.C7866Ok)) {
                if (iArr != null) {
                    iArr[0] = i;
                } else {
                    int[] iArr2 = {i, k};
                    this.f16709e.put(str, iArr2);
                    iArr = iArr2;
                }
                if (iArr[0] == iArr[1]) {
                    C4868i iVar = C4868i.this;
                    iVar.m24889F3(this.f16707c + "_" + str);
                    return;
                }
                C4868i iVar2 = C4868i.this;
                iVar2.m24582u3(this.f16707c + "_" + str, i);
            }
        }
    }

    public static class C4888s {
        public final String f16711a;
        public final String f16712b;
        public final Map<Integer, List<String>> f16713c = new HashMap();
        public final Map<Float, List<String>> f16714d = new HashMap();
        public int f16715e = 0;

        public C4888s(String str, String str2) {
            this.f16711a = str;
            this.f16712b = str2;
        }

        public void m24494a(String str, int i) {
            Integer valueOf = Integer.valueOf(i);
            List<String> list = this.f16713c.get(valueOf);
            if (list == null) {
                list = new ArrayList<>();
                this.f16713c.put(valueOf, list);
            }
            list.add(str);
        }

        public void m24493b(String str, float f) {
            Float valueOf = Float.valueOf(f);
            List<String> list = this.f16714d.get(valueOf);
            if (list == null) {
                list = new ArrayList<>();
                this.f16714d.put(valueOf, list);
            }
            list.add(str);
        }
    }

    public static class C4889t {
        public final C4891v f16716a;
        public final int f16717b;
        public final long f16718c;

        public C4889t(C4891v vVar) {
            this(vVar, 29);
        }

        public C4889t m24492a(C4891v vVar) {
            return new C4889t(vVar, this.f16717b, this.f16718c);
        }

        public long m24491b(C4891v vVar, int i, long j) {
            return Math.round(vVar.f16719a * vVar.f16720b * i * 0.089d);
        }

        public int m24490c(int i) {
            int i2 = this.f16717b;
            if (i2 > 0) {
                return Math.min(i, i2);
            }
            return 29;
        }

        public C4891v m24489d(int i, int i2) {
            int max = Math.max(i, i2);
            int min = Math.min(i, i2);
            C4891v vVar = this.f16716a;
            float f = max;
            float f2 = min;
            float min2 = Math.min(vVar.f16719a / f, vVar.f16720b / f2);
            if (min2 > 1.0f) {
                return null;
            }
            int i3 = (int) (f * min2);
            int i4 = (int) (f2 * min2);
            if (i3 % 2 == 1) {
                i3--;
            }
            if (i4 % 2 == 1) {
                i4--;
            }
            return new C4891v(i3, i4);
        }

        public boolean m24488e() {
            return this.f16716a.m24486a() && this.f16717b == 29 && this.f16718c == Long.MIN_VALUE;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C4889t tVar = (C4889t) obj;
            return this.f16717b == tVar.f16717b && this.f16718c == tVar.f16718c && this.f16716a.equals(tVar.f16716a);
        }

        public int[] m24487f() {
            int i;
            if (m24488e()) {
                return null;
            }
            int i2 = this.f16717b;
            if (i2 != 29) {
                i = 3;
            } else {
                C4891v vVar = this.f16716a;
                int i3 = vVar.f16719a;
                i = i3 != vVar.f16720b ? 2 : i3 != 0 ? 1 : 0;
            }
            if (i == 0) {
                return null;
            }
            int[] iArr = new int[i];
            C4891v vVar2 = this.f16716a;
            iArr[0] = vVar2.f16719a;
            if (i > 1) {
                iArr[1] = vVar2.f16720b;
            }
            if (i > 2) {
                iArr[2] = i2;
            }
            if (i > 3) {
                iArr[3] = (int) Math.round(EnumC6435c.f20132a.m20405c(this.f16718c));
            }
            return iArr;
        }

        public int hashCode() {
            return Objects.hash(this.f16716a, Integer.valueOf(this.f16717b), Long.valueOf(this.f16718c));
        }

        public C4889t(C4891v vVar, int i) {
            this(vVar, i, Long.MIN_VALUE);
        }

        public C4889t(C4891v vVar, int i, long j) {
            this.f16716a = vVar;
            this.f16717b = i;
            this.f16718c = j;
        }

        public C4889t() {
            this((int[]) null);
        }

        public C4889t(C4889t tVar) {
            this.f16716a = tVar.f16716a;
            this.f16717b = tVar.f16717b;
            this.f16718c = tVar.f16718c;
        }

        public C4889t(int[] iArr) {
            long j = Long.MIN_VALUE;
            int i = 29;
            if (iArr == null || iArr.length <= 0) {
                this.f16716a = new C4891v(854);
                this.f16717b = 29;
                this.f16718c = Long.MIN_VALUE;
                return;
            }
            this.f16716a = new C4891v(iArr[0], iArr.length > 1 ? iArr[1] : iArr[0]);
            this.f16717b = iArr.length > 2 ? iArr[2] : i;
            this.f16718c = iArr.length > 3 ? (long) EnumC6435c.f20121P.mo20404b(iArr[3]) : j;
        }
    }

    public interface AbstractC4890u {
        void mo6954G4(boolean z);

        void mo6863r1(boolean z);
    }

    static {
        f16613Q = Build.VERSION.SDK_INT >= 29 ? 3 : 0;
        f16614R = EnumC6459p.f20158c.mo20396b(50.0d);
        float[] fArr = {12.0f, 13.0f, 14.0f, 15.0f, 16.0f, 18.0f, 20.0f, 22.0f, 24.0f, 26.0f};
        f16615S = fArr;
        f16616T = fArr[0];
        f16617U = fArr[fArr.length - 1];
    }

    public C4868i() {
        int i;
        File file = new File(C1379j0.m37318n().getFilesDir(), "pmc");
        if (file.exists() || file.mkdir()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            LevelDB levelDB = new LevelDB(new File(file, "db").getPath(), true, new C4869a());
            this.f16653v = levelDB;
            org.thunderdog.challegram.Log.load(levelDB);
            try {
                i = Math.max(0, levelDB.m17983U("version"));
            } catch (FileNotFoundException unused) {
                m24561x2();
                i = 0;
            }
            if (i > 38) {
                org.thunderdog.challegram.Log.m14724e("Downgrading database version: %d -> %d", Integer.valueOf(i), 38);
                this.f16653v.putInt("version", 38);
            }
            for (int i2 = i + 1; i2 <= 38; i2++) {
                LevelDB f = this.f16653v.edit();
                m24643m6(this.f16653v, f, i2);
                f.putInt("version", i2);
                f.apply();
            }
            org.thunderdog.challegram.Log.m14719i("Opened database in %dms", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            m24886G();
            return;
        }
        throw new IllegalStateException("Unable to create working directory");
    }

    @Deprecated
    public static File m24919B1() {
        return new File(C1379j0.m37318n().getFilesDir(), "tdlib_proxy.bin");
    }

    public static TdApi.LanguagePackInfo m24917B3(LevelDB levelDB, String str, boolean z) {
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z2 = false;
        for (LevelDB.C7052a aVar : levelDB.m17974g(str)) {
            String l = aVar.m17943l();
            if (l.length() == str.length()) {
                str2 = aVar.m17944k();
            } else {
                String substring = l.substring(str.length());
                substring.hashCode();
                char c = 65535;
                switch (substring.hashCode()) {
                    case -985163900:
                        if (substring.equals("plural")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 113258:
                        if (substring.equals("rtl")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3016401:
                        if (substring.equals("base")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        str4 = aVar.m17944k();
                        continue;
                    case 1:
                        z2 = aVar.m17951d();
                        continue;
                    case 2:
                        str3 = aVar.m17944k();
                        continue;
                }
            }
        }
        if (!C5070i.m24062i(str2)) {
            if (C5070i.m24062i(str3) && C4779t2.m25514g3(str2)) {
                str3 = C4403w.m27908a0();
            }
            if (C5070i.m24062i(str4)) {
                str4 = C4403w.m27870i2(str3 != null ? str3 : str2);
            }
            return C4403w.m27878g2(str2, str3, str4, z2);
        } else if (z) {
            return C4403w.m27917Y();
        } else {
            return null;
        }
    }

    public static int m24912C1(TdApi.ProxyType proxyType) {
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

    public static C4880l m24910C3(int i, byte[] bArr, C6810a aVar) {
        TdApi.ProxyTypeSocks5 proxyTypeSocks5;
        if (!(bArr == null || bArr.length == 0)) {
            try {
                if (aVar == null) {
                    aVar = new C6810a(bArr);
                } else {
                    aVar.m18919u(bArr);
                }
                String q = aVar.m18923q();
                int m = aVar.m18927m();
                byte e = aVar.m18935e();
                boolean z = true;
                if (e == 1) {
                    TdApi.ProxyTypeSocks5 proxyTypeSocks52 = new TdApi.ProxyTypeSocks5("", "");
                    byte e2 = aVar.m18935e();
                    if ((e2 & 1) != 0) {
                        proxyTypeSocks52.username = aVar.m18923q();
                    }
                    proxyTypeSocks5 = proxyTypeSocks52;
                    if ((2 & e2) != 0) {
                        proxyTypeSocks52.password = aVar.m18923q();
                        proxyTypeSocks5 = proxyTypeSocks52;
                    }
                } else if (e == 2) {
                    proxyTypeSocks5 = new TdApi.ProxyTypeMtproto(aVar.m18923q());
                } else if (e == 3) {
                    ?? proxyTypeHttp = new TdApi.ProxyTypeHttp("", "", false);
                    byte e3 = aVar.m18935e();
                    if ((e3 & 1) != 0) {
                        proxyTypeHttp.username = aVar.m18923q();
                    }
                    if ((2 & e3) != 0) {
                        proxyTypeHttp.password = aVar.m18923q();
                    }
                    if (aVar.m18935e() != 1) {
                        z = false;
                    }
                    proxyTypeHttp.httpOnly = z;
                    proxyTypeSocks5 = proxyTypeHttp;
                } else {
                    throw new IllegalArgumentException("typeId == " + ((int) e));
                }
                return new C4880l(i, q, m, proxyTypeSocks5, null);
            } catch (Throwable th) {
                org.thunderdog.challegram.Log.m14710w("Unable to read proxy configuration", th, new Object[0]);
            }
        }
        return null;
    }

    @Deprecated
    public static TdApi.Proxy m24903D3(RandomAccessFile randomAccessFile) {
        if (C6810a.m18920t(randomAccessFile) != 1456461592) {
            return null;
        }
        String r = C6810a.m18922r(randomAccessFile);
        int t = C6810a.m18920t(randomAccessFile);
        byte f = C6810a.m18934f(randomAccessFile);
        String str = "";
        String r2 = (f & 1) != 0 ? C6810a.m18922r(randomAccessFile) : str;
        if ((f & 2) != 0) {
            str = C6810a.m18922r(randomAccessFile);
        }
        return new TdApi.Proxy(0, r, t, 0, false, new TdApi.ProxyTypeSocks5(r2, str));
    }

    public static String m24898E1(TdApi.ProxyType proxyType) {
        int constructor = proxyType.getConstructor();
        if (constructor == -1547188361) {
            return ((TdApi.ProxyTypeHttp) proxyType).password;
        }
        if (constructor != -890027341) {
            return null;
        }
        return ((TdApi.ProxyTypeSocks5) proxyType).password;
    }

    public static int m24884G1(TdApi.ProxyType proxyType) {
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

    public static String m24877H1(TdApi.ProxyType proxyType) {
        int constructor = proxyType.getConstructor();
        if (constructor == -1547188361) {
            return ((TdApi.ProxyTypeHttp) proxyType).username;
        }
        if (constructor != -890027341) {
            return null;
        }
        return ((TdApi.ProxyTypeSocks5) proxyType).username;
    }

    public static String m24800S1(int i) {
        if (i == 0) {
            return "";
        }
        if (i == 1) {
            return "_dark";
        }
        return "_other" + i;
    }

    public static void m24756Y3(LevelDB levelDB, String str, TdApi.LanguagePackInfo languagePackInfo) {
        if (languagePackInfo == null || C4403w.m27967L1(languagePackInfo.f25408id)) {
            SharedPreferences.Editor remove = levelDB.edit().remove(str);
            SharedPreferences.Editor remove2 = remove.remove(str + "base");
            SharedPreferences.Editor remove3 = remove2.remove(str + "plural");
            remove3.remove(str + "rtl").apply();
            return;
        }
        LevelDB f = levelDB.edit();
        f.putString(str, languagePackInfo.f25408id);
        if (C5070i.m24062i(languagePackInfo.baseLanguagePackId) || C4779t2.m25514g3(languagePackInfo.f25408id)) {
            f.remove(str + "base");
        } else {
            f.putString(str + "base", languagePackInfo.baseLanguagePackId);
        }
        if (C5070i.m24062i(languagePackInfo.pluralCode) || languagePackInfo.pluralCode.equals(languagePackInfo.f25408id)) {
            f.remove(str + "plural");
        } else {
            f.putString(str + "plural", languagePackInfo.pluralCode);
        }
        if (languagePackInfo.isRtl) {
            f.putBoolean(str + "rtl", true);
        } else {
            f.remove(str + "rtl");
        }
        f.apply();
    }

    public static String m24754Y5(int i, int i2) {
        return "theme_history" + i + "_" + C11524j.m222Q(i2);
    }

    public static String m24747Z5(int i, int i2) {
        return m24739a6(i, C11524j.m222Q(i2));
    }

    public static String m24739a6(int i, String str) {
        return "theme" + i + "_c_" + str;
    }

    public static byte[] m24733b4(java.lang.String r8, int r9, org.drinkless.p210td.libcore.telegram.TdApi.ProxyType r10) {
        throw new UnsupportedOperationException("Method not decompiled: ge.C4868i.m24733b4(java.lang.String, int, org.drinkless.td.libcore.telegram.TdApi$ProxyType):byte[]");
    }

    public static String m24731b6(int i, int i2) {
        return m24723c6(i, C11524j.m192d0(i2));
    }

    public static C4868i m24727c2() {
        if (f16612P == null) {
            synchronized (C4868i.class) {
                if (f16612P == null) {
                    if (!f16611O.getAndSet(true)) {
                        f16612P = new C4868i();
                    } else {
                        throw new AssertionError();
                    }
                }
            }
        }
        return f16612P;
    }

    public static String m24723c6(int i, String str) {
        return "theme" + i + "_p_" + str;
    }

    public static void m24718d3(List<Reference<AbstractC4875g>> list, float f) {
        for (int size = list.size() - 1; size >= 0; size--) {
            AbstractC4875g gVar = list.get(size).get();
            if (gVar != null) {
                gVar.mo22668a(f);
            } else {
                list.remove(size);
            }
        }
    }

    public static boolean m24703f2(float f) {
        return f >= f16616T && f <= f16617U;
    }

    public static String m24679i2(String str, int i) {
        if (i == 0) {
            return str;
        }
        return i + "_" + str;
    }

    @Deprecated
    public static void m24678i3(Map<String, String> map, String str) {
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

    public static String m24674j(int i) {
        return "account" + i + "_";
    }

    public static void m24671j2(Runnable runnable, Log.C7879b bVar) {
        C10536ab.m4674m0();
        if (runnable != null) {
            runnable.run();
        }
    }

    @Deprecated
    public static void m24670j3(Map<String, C5095o> map, String str) {
        if (str != null) {
            for (String str2 : str.split(",")) {
                String[] split = str2.split(":");
                if (split.length == 3 && C5070i.m24058m(split[1]) && C5070i.m24058m(split[2])) {
                    map.put(split[0], new C5095o(C5070i.m24052s(split[1]), C5070i.m24052s(split[2])));
                }
            }
        }
    }

    public static void m24663k2(final Runnable runnable) {
        org.thunderdog.challegram.Log.deleteAll(org.thunderdog.challegram.Log.getLogFiles(), new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C4868i.m24671j2(runnable, (Log.C7879b) obj);
            }
        }, null);
    }

    @Deprecated
    public static void m24662k3(Map<String, C5095o> map, List<C5094n> list, String str) {
        String[] split;
        if (str != null) {
            for (String str2 : str.split(",")) {
                C5095o oVar = map.get(str2);
                if (oVar != null) {
                    list.add(new C5094n(str2, oVar));
                }
            }
        }
    }

    @Deprecated
    public static C4878j m24654l3(String str, String str2) {
        if (C5070i.m24062i(str)) {
            return null;
        }
        String[] split = str.split(str2);
        try {
            return new C4878j(Double.parseDouble(split[0]), Double.parseDouble(split[1]), split.length > 2 ? Float.parseFloat(split[2]) : 0.0f);
        } catch (Throwable th) {
            org.thunderdog.challegram.Log.m14725e("Cannot read location", th, new Object[0]);
            return null;
        }
    }

    public static C4878j m24646m3(byte[] bArr) {
        if (bArr == null || bArr.length != 20) {
            return null;
        }
        return new C4878j(C6810a.m18930j(bArr, 0), C6810a.m18930j(bArr, 8), C6810a.m18928l(bArr, 16));
    }

    public static String m24639n2(long j) {
        return "settings_tdlib_crash" + j + "_";
    }

    public static int m24623p2() {
        return (C4183a.f14098p ? 33555457 : 1025) | org.thunderdog.challegram.Log.TAG_COMPRESS | org.thunderdog.challegram.Log.TAG_NDK;
    }

    public static String m24615q2(String str, int i, long j, long j2) {
        StringBuilder sb2 = new StringBuilder("scroll_chat");
        sb2.append(j);
        sb2.append(str);
        if (j2 != 0) {
            sb2.append("_thread");
            sb2.append(j2);
        }
        return m24679i2(sb2.toString(), i);
    }

    public static void m24614q3(LevelDB.C7052a aVar, int i, C4888s sVar, Map<String, Integer> map, Map<String, Integer> map2) {
        String l = aVar.m17943l();
        char charAt = l.charAt(i);
        String substring = l.substring(i + 2);
        if (charAt == 'c') {
            sVar.m24494a(substring, aVar.m17947h());
            if (map != null) {
                map.remove(substring);
            }
        } else if (charAt != 'p') {
            org.thunderdog.challegram.Log.m14709w("Unknown theme key: %s", l);
        } else {
            float g = aVar.m17948g();
            sVar.m24493b(substring, g);
            if (sVar.f16715e == 0 && C11511b0.m354c(R.id.theme_property_parentTheme).equals(substring)) {
                sVar.f16715e = (int) g;
            }
            if (map2 != null) {
                map2.remove(substring);
            }
        }
    }

    public static void m24606r3(LevelDB.C7052a aVar, int i, C11529n nVar, Map<String, Integer> map, Map<String, Integer> map2) {
        String l = aVar.m17943l();
        char charAt = l.charAt(i);
        String substring = l.substring(i + 2);
        if (charAt == 'c') {
            Integer num = map.get(substring);
            if (num != null) {
                nVar.m121j(num.intValue(), Integer.valueOf(aVar.m17947h()));
            } else {
                org.thunderdog.challegram.Log.m14709w("Unknown theme color: %s", substring);
            }
        } else if (charAt != 'p') {
            org.thunderdog.challegram.Log.m14709w("Unknown theme key: %s", l);
        } else {
            Integer num2 = map2.get(substring);
            if (num2 != null) {
                nVar.m118m(num2.intValue(), Float.valueOf(aVar.m17948g()));
            } else {
                org.thunderdog.challegram.Log.m14709w("Unknown theme property: %s", substring);
            }
        }
    }

    public static void m24579u6(C6810a aVar, String str, String str2) {
        int i = !C5070i.m24062i(str) ? 1 : 0;
        if (!C5070i.m24062i(str2)) {
            i |= 2;
        }
        aVar.m18952B((byte) i);
        if ((i & 1) != 0) {
            aVar.m18942L(str);
        }
        if ((i & 2) != 0) {
            aVar.m18942L(str2);
        }
    }

    public static int m24557y(String str, String str2) {
        return C6810a.m18916x(str, false) + 1 + C6810a.m18916x(str2, false);
    }

    public static SharedPreferences.Editor m24554y2(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, SharedPreferences.Editor editor, String str) {
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
                    org.thunderdog.challegram.Log.m14724e("Unknown value type, key:%s value:%b", key, value);
                }
            }
        }
        return editor;
    }

    public boolean m24928A() {
        return m24593t0() != 15.0f || m24925A2();
    }

    public String m24927A0(int i) {
        LevelDB levelDB = this.f16653v;
        return levelDB.getString("theme_name" + i, null);
    }

    public C4880l m24926A1(int i) {
        C4880l lVar = null;
        if (i != 0) {
            LevelDB levelDB = this.f16653v;
            lVar = m24910C3(i, levelDB.m17968m("proxy_item_config_" + i), null);
            if (lVar == null) {
                org.thunderdog.challegram.Log.m14724e("Configuration unavailable, proxyId:%d", Integer.valueOf(i));
            }
        }
        return lVar;
    }

    public boolean m24925A2() {
        return m24872I(64);
    }

    public void m24924A3(String str) {
        this.f16653v.m17993K(str);
    }

    public void m24923A4(boolean z, int i) {
        if (m24892F0(z) != i) {
            m24582u3(z ? "settings_earpiece_video_mode" : "settings_earpiece_mode", i);
            Iterator<AbstractC4882n> it = this.f16621D.iterator();
            while (it.hasNext()) {
                it.next().mo7316a(z, i);
            }
        }
    }

    public void m24922A5(boolean z) {
        m24894E5(org.thunderdog.challegram.Log.TAG_YOUTUBE, z);
    }

    public void m24921B() {
        this.f16649r.removeMessages(0);
    }

    public float m24920B0(int i, int i2) {
        try {
            return this.f16653v.m17984T(m24731b6(i, i2));
        } catch (FileNotFoundException unused) {
            if (i2 == R.id.theme_property_parentTheme) {
                return 1.0f;
            }
            return C11514c0.m343f((int) m24920B0(i, R.id.theme_property_parentTheme), i2);
        }
    }

    public boolean m24918B2() {
        return m24907D(org.thunderdog.challegram.Log.TAG_VOICE);
    }

    public void m24916B4(Map<String, String> map, SharedPreferences.Editor editor) {
        boolean z;
        int i = 0;
        if (editor == null) {
            editor = m24774W();
            z = true;
        } else {
            z = false;
        }
        int size = map.size();
        if (size > 0) {
            String[] strArr = new String[size * 2];
            for (Map.Entry<String, String> entry : map.entrySet()) {
                int i2 = i + 1;
                strArr[i] = entry.getKey();
                i = i2 + 1;
                strArr[i2] = entry.getValue();
            }
            this.f16653v.m17994J("emoji_colors", strArr);
        } else {
            editor.remove("emoji_colors");
        }
        if (z) {
            editor.apply();
        }
    }

    public void m24915B5(boolean z) {
        this.f16656y = Boolean.valueOf(z);
        if (z) {
            this.f16653v.remove("settings_restrict_content");
        } else {
            this.f16653v.putBoolean("settings_restrict_content", false);
        }
    }

    public final void m24914C(LevelDB levelDB, SharedPreferences.Editor editor, int i, boolean z) {
        try {
            int U = levelDB.m17983U("settings_other");
            int h = C5063c.m24139h(U, i, z);
            if (U != h) {
                editor.putInt("settings_other", h);
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public String m24913C0(int i) {
        LevelDB levelDB = this.f16653v;
        return levelDB.getString("theme_wallpaper" + i, null);
    }

    public boolean m24911C2() {
        return m24907D(org.thunderdog.challegram.Log.TAG_CAMERA);
    }

    public void m24909C4(Map<String, C5095o> map) {
        m24763X3("emoji_counters", map);
    }

    public void m24908C5(boolean z) {
        m24894E5(2, z);
    }

    public final boolean m24907D(int i) {
        return !m24872I(i);
    }

    public List<C11533r> m24906D0() {
        C11533r rVar;
        Throwable th;
        ArrayList arrayList = new ArrayList();
        C11533r rVar2 = null;
        for (LevelDB.C7052a aVar : this.f16653v.m17974g("theme_name")) {
            try {
                rVar = m24622p3(aVar, rVar2);
            } catch (Throwable th2) {
                th = th2;
                rVar = rVar2;
            }
            if (rVar2 != rVar) {
                try {
                    arrayList.add(rVar);
                } catch (Throwable th3) {
                    th = th3;
                    org.thunderdog.challegram.Log.m14725e("Cannot parse theme entry, key: %s", th, aVar.m17943l());
                    rVar2 = rVar;
                }
                rVar2 = rVar;
            }
        }
        return arrayList;
    }

    public String m24905D1(int i) {
        C4880l A1 = m24926A1(i);
        if (A1 != null) {
            return A1.m24523e().toString();
        }
        return null;
    }

    public boolean m24904D2() {
        return m24865J(64);
    }

    public void m24902D4(String str, Map<String, String> map) {
        if (map.size() > 0) {
            LevelDB W = m24774W();
            if (C5070i.m24062i(str)) {
                W.remove("emoji_default");
            } else {
                W.putString("emoji_default", str);
            }
            map.clear();
            m24916B4(map, W);
            W.apply();
        } else if (C5070i.m24062i(str)) {
            m24889F3("emoji_default");
        } else {
            m24546z3("emoji_default", str);
        }
    }

    public void m24901D5(int i, long j, long j2, C4883o oVar) {
        String q2 = m24615q2("_message", i, j, j2);
        String q22 = m24615q2("_chat", i, j, j2);
        String q23 = m24615q2("_stack", i, j, j2);
        String q24 = m24615q2("_aliases", i, j, j2);
        String q25 = m24615q2("_offset", i, j, j2);
        String q26 = m24615q2("_read", i, j, j2);
        String q27 = m24615q2("_top", i, j, j2);
        LevelDB W = m24774W();
        if (oVar == null) {
            W.remove(q2).remove(q22).remove(q23).remove(q25).remove(q24).remove(q26).remove(q27);
        } else {
            W.putLong(q2, oVar.f16692a.m17026d());
            if (oVar.f16692a.m17027c() != j) {
                W.putLong(q22, oVar.f16692a.m17027c());
            } else {
                W.remove(q22);
            }
            if (oVar.f16692a.m17025e() == null || oVar.f16692a.m17025e().length <= 0) {
                W.remove(q24);
            } else {
                W.m17995I(q24, oVar.f16692a.m17025e());
            }
            int i2 = oVar.f16693b;
            if (i2 != 0) {
                W.putInt(q25, i2);
            } else {
                W.remove(q25);
            }
            long[] jArr = oVar.f16694c;
            if (jArr == null || jArr.length <= 0) {
                W.remove(q23);
            } else {
                W.m17995I(q23, jArr);
            }
            if (oVar.f16695d) {
                W.putBoolean(q26, true);
            } else {
                W.remove(q26);
            }
            long j3 = oVar.f16696e;
            if (j3 != 0) {
                W.putLong(q27, j3);
            } else {
                W.remove(q27);
            }
        }
        W.apply();
    }

    public void m24900E(boolean z) {
        if (z) {
            m24921B();
        }
        if (m24648m1() == 2) {
            long n1 = m24640n1();
            int m = C5063c.m24134m(n1);
            int n = C5063c.m24133n(n1);
            if (m == n) {
                C11541z.m7t().m30b0(false, true);
                if (z) {
                    m24921B();
                    return;
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            Calendar a = C5067f.m24120a(currentTimeMillis);
            int g = C5063c.m24140g(a.get(11), a.get(12), a.get(13));
            boolean a2 = C5063c.m24146a(g, m, n);
            C11541z.m7t().m30b0(a2, true);
            int i = a2 ? n : m;
            if (g > i) {
                a.add(5, 1);
            }
            a.set(11, C5063c.m24137j(i));
            a.set(12, C5063c.m24136k(i));
            a.set(13, C5063c.m24135l(i));
            long timeInMillis = a.getTimeInMillis();
            if (timeInMillis >= currentTimeMillis) {
                m24741a4(timeInMillis - currentTimeMillis);
                return;
            }
            throw new RuntimeException("Theme schedule failed [time: " + C7389v0.m16695P2(g) + ", startTime: " + C7389v0.m16695P2(m) + ", endTime: " + C7389v0.m16695P2(n) + "]");
        }
    }

    public String m24899E0() {
        return this.f16653v.getString("push_device_token", null);
    }

    public boolean m24897E2() {
        return m24865J(org.thunderdog.challegram.Log.TAG_YOUTUBE);
    }

    public boolean m24896E3() {
        return m24872I(org.thunderdog.challegram.Log.TAG_YOUTUBE);
    }

    public void m24895E4(int i) {
        m24582u3("emoji_vp_mediasection", i);
    }

    public final boolean m24894E5(int i, boolean z) {
        return m24887F5(C5063c.m24139h(m24863J1(), i, z));
    }

    public boolean m24893F(int i) {
        return C5063c.m24145b(m24616q1(), i);
    }

    public int m24892F0(boolean z) {
        int i;
        if (z) {
            i = m24780V0("settings_earpiece_video_mode", 0);
        } else {
            i = m24780V0("settings_earpiece_mode", 1);
        }
        if (i == 0 || i == 1) {
            return i;
        }
        if (i == 2 && !z) {
            return i;
        }
        return 0;
    }

    public int m24891F1() {
        return this.f16653v.m17969l("proxy_settings", (byte) 0);
    }

    public boolean m24890F2() {
        return m24872I(org.thunderdog.challegram.Log.TAG_COMPRESS);
    }

    public void m24889F3(String str) {
        this.f16653v.remove(str);
    }

    public void m24888F4(Map<String, String[]> map, SharedPreferences.Editor editor) {
        boolean z;
        int i = 0;
        if (editor == null) {
            editor = m24774W();
            z = true;
        } else {
            z = false;
        }
        int size = map.size();
        if (size > 0) {
            String[] strArr = new String[size * 2];
            for (Map.Entry<String, String[]> entry : map.entrySet()) {
                int i2 = i + 1;
                strArr[i] = entry.getKey();
                i = i2 + 1;
                strArr[i2] = C1363c0.m37456U(",", entry.getValue());
            }
            this.f16653v.m17994J("emoji_other_colors", strArr);
        } else {
            editor.remove("emoji_other_colors");
        }
        if (z) {
            editor.apply();
        }
    }

    public final boolean m24887F5(int i) {
        if (m24863J1() == i) {
            return false;
        }
        this.f16632a = Integer.valueOf(i);
        this.f16653v.putInt("settings_other", i);
        return true;
    }

    public final void m24886G() {
        for (LevelDB.C7052a aVar : this.f16653v.m17974g("brut_force_seconds")) {
            m24789T5(aVar.m17943l().substring(18));
        }
    }

    public int m24885G0() {
        int F1 = m24891F1();
        if ((F1 & 1) == 0 || (F1 & 2) == 0) {
            return 0;
        }
        return m24657l0();
    }

    public boolean m24883G2() {
        return m24872I(org.thunderdog.challegram.Log.TAG_LUX);
    }

    public void m24882G3(String[] strArr, SharedPreferences.Editor editor) {
        this.f16653v.m17991M(strArr);
    }

    public void m24881G4(C4874f fVar) {
        if (fVar.f16666b == 4) {
            this.f16629L = fVar;
            this.f16630M = null;
            if (fVar.f16665a.equals("apple")) {
                this.f16653v.m17990N("settings_emoji_pack");
            } else {
                this.f16653v.edit().putString("settings_emoji_pack", fVar.f16665a).putString("settings_emoji_pack_name", fVar.f16661M).putInt("settings_emoji_pack_date", fVar.f16667c).putInt("settings_emoji_pack_version", fVar.f16666b).apply();
            }
        } else {
            throw new IllegalArgumentException("emojiPack.version == " + fVar.f16666b);
        }
    }

    public void m24880G5(boolean z) {
        m24683h6(org.thunderdog.challegram.Log.TAG_CRASH, z);
    }

    public boolean m24879H(int i) {
        return (i & m24891F1()) != 0;
    }

    public int m24878H0() {
        if ((m24891F1() & 1) != 0) {
            return m24657l0();
        }
        return 0;
    }

    public boolean m24876H2() {
        return m24865J(1);
    }

    public void m24875H3(String str, SharedPreferences.Editor editor) {
        this.f16653v.m17990N(str);
    }

    public void m24874H4(int i) {
        m24582u3("emoji_vp_position", i);
    }

    public void m24873H5(boolean z) {
        m24894E5(268435456, z);
    }

    public final boolean m24872I(int i) {
        return C5063c.m24145b(m24863J1(), i);
    }

    public void m24871I0(Map<String, String> map) {
        String[] v = this.f16653v.m17959v("emoji_colors");
        if (v != null && v.length > 0) {
            String str = null;
            for (String str2 : v) {
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

    public C4883o m24870I1(int i, long j, long j2) {
        String i2 = m24679i2("scroll_chat" + j, i);
        C4883o.C4884a aVar = null;
        for (LevelDB.C7052a aVar2 : this.f16653v.m17974g(i2)) {
            if (j2 == C5070i.m24048w(aVar2.m17943l().replaceAll("^.+_thread(\\d+)$", "$1"))) {
                if (aVar == null) {
                    aVar = new C4883o.C4884a(j);
                }
                String replaceAll = aVar2.m17943l().substring(i2.length()).replaceAll("_thread[\\d]+$", "");
                replaceAll.hashCode();
                char c = 65535;
                switch (replaceAll.hashCode()) {
                    case -1465440887:
                        if (replaceAll.equals("_stack")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -981817656:
                        if (replaceAll.equals("_message")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 2945174:
                        if (replaceAll.equals("_top")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 90786871:
                        if (replaceAll.equals("_chat")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 91230837:
                        if (replaceAll.equals("_read")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1443689919:
                        if (replaceAll.equals("_aliases")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1688691122:
                        if (replaceAll.equals("_offset")) {
                            c = 6;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        aVar.f16702f = aVar2.m17945j();
                        continue;
                    case 1:
                        aVar.f16698b = aVar2.m17946i();
                        continue;
                    case 2:
                        aVar.f16699c = aVar2.m17946i();
                        continue;
                    case 3:
                        aVar.f16697a = aVar2.m17946i();
                        continue;
                    case 4:
                        aVar.f16703g = aVar2.m17951d();
                        continue;
                    case 5:
                        aVar.f16700d = aVar2.m17945j();
                        continue;
                    case 6:
                        aVar.f16701e = aVar2.m17947h();
                        continue;
                }
            }
        }
        if (!(aVar == null || aVar.f16697a == j)) {
            aVar.f16698b = 0L;
        }
        if (aVar != null) {
            return aVar.m24513i();
        }
        return null;
    }

    public boolean m24869I2() {
        return m24872I(8);
    }

    public void m24868I3(AbstractC4871c cVar) {
        C6227d<AbstractC4871c> dVar = this.f16651t;
        if (dVar != null) {
            dVar.remove(cVar);
        }
    }

    public void m24867I4(List<C5094n> list) {
        String[] strArr = new String[list.size()];
        int i = 0;
        for (C5094n nVar : list) {
            i++;
            strArr[i] = nVar.f17129a;
        }
        this.f16653v.m17994J("emoji_recents", strArr);
    }

    public void m24866I5(int i) {
        this.f16638g = Integer.valueOf(i);
        if (i == 0) {
            m24889F3("settings_sticker");
        } else {
            m24582u3("settings_sticker", i);
        }
    }

    public boolean m24865J(int i) {
        return C5063c.m24145b(m24814Q1(), i);
    }

    public void m24864J0(Map<String, C5095o> map) {
        m24641n0("emoji_counters", map, C5095o.class);
    }

    public final int m24863J1() {
        if (this.f16632a == null) {
            this.f16632a = Integer.valueOf(this.f16653v.getInt("settings_other", m24623p2()));
        }
        return this.f16632a.intValue();
    }

    public boolean m24862J2() {
        return C4184b.f14121n || m24872I(67108864);
    }

    public void m24861J3(int i) {
        ArrayList<String> arrayList = null;
        if ((m24549z0(i) & 1) != 0) {
            for (LevelDB.C7052a aVar : this.f16653v.m17974g("theme_installation_")) {
                if (aVar.m17947h() == i) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(aVar.m17943l());
                }
            }
        }
        this.f16653v.edit();
        LevelDB levelDB = this.f16653v;
        levelDB.remove("theme_name" + i);
        LevelDB levelDB2 = this.f16653v;
        levelDB2.remove("theme_author" + i);
        LevelDB levelDB3 = this.f16653v;
        levelDB3.remove("theme_wallpaper" + i);
        LevelDB levelDB4 = this.f16653v;
        levelDB4.remove("theme_flags" + i);
        LevelDB levelDB5 = this.f16653v;
        levelDB5.m17991M("theme" + i + "_", "theme_history" + i + "_");
        if (arrayList != null) {
            for (String str : arrayList) {
                this.f16653v.remove(str);
            }
        }
        this.f16653v.apply();
    }

    public void m24860J4(boolean z) {
        m24683h6(4, z);
    }

    public final void m24859J5(long j) {
        this.f16641j = Long.valueOf(j);
        if (j == 0) {
            m24889F3("settings_tutorial");
        } else {
            m24567w3("settings_tutorial", j);
        }
    }

    public void m24858K() {
        this.f16653v.edit().remove("emoji_counters").remove("emoji_recents").apply();
    }

    public String m24857K0() {
        return m24849L1("emoji_default", null);
    }

    public int m24856K1() {
        if (this.f16638g == null) {
            this.f16638g = Integer.valueOf(this.f16653v.getInt("settings_sticker", 0));
        }
        return this.f16638g.intValue();
    }

    public boolean m24855K2(int i) {
        String str = i + "_notifications_version";
        if (m24780V0(str, 0) == 1507020) {
            return false;
        }
        m24582u3(str, 1507020);
        return true;
    }

    public void m24854K3(AbstractC4886q qVar) {
        C6227d<AbstractC4886q> dVar = this.f16652u;
        if (dVar != null) {
            dVar.remove(qVar);
        }
    }

    public void m24853K4(boolean z) {
        m24683h6(8, z);
    }

    public void m24852K5(boolean z) {
        m24684h5(org.thunderdog.challegram.Log.TAG_TDLIB_FILES, z);
    }

    public boolean m24851L(String str) {
        return this.f16653v.contains(str);
    }

    public int m24850L0() {
        return m24780V0("emoji_vp_mediasection", 0);
    }

    public String m24849L1(String str, String str2) {
        return this.f16653v.getString(str, str2);
    }

    public boolean m24848L2() {
        return m24872I(org.thunderdog.challegram.Log.TAG_ACCOUNTS);
    }

    public void m24847L3(AbstractC4879k kVar) {
        C6227d<AbstractC4879k> dVar = this.f16622E;
        if (dVar != null) {
            dVar.remove(kVar);
        }
    }

    public void m24846L4(boolean z) {
        m24683h6(org.thunderdog.challegram.Log.TAG_YOUTUBE, z);
    }

    public void m24845L5(boolean z) {
        m24684h5(4194304, z);
    }

    public void m24844M(final Runnable runnable) {
        C4383l.m28061a().m28060b(new Runnable() {
            @Override
            public final void run() {
                C4868i.m24663k2(runnable);
            }
        });
    }

    public void m24843M0(Map<String, String[]> map) {
        String[] v = this.f16653v.m17959v("emoji_other_colors");
        if (v != null && v.length > 0) {
            String str = null;
            for (String str2 : v) {
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

    public C4887r m24842M1() {
        return this.f16644m;
    }

    public boolean m24841M2() {
        return m24907D(org.thunderdog.challegram.Log.TAG_ROUND);
    }

    public boolean m24840M3(int i) {
        int lastIndexOf;
        if (i > 0) {
            int l0 = m24657l0();
            int F1 = m24891F1();
            if (l0 == i && (F1 & 1) != 0) {
                return false;
            }
            this.f16653v.edit();
            LevelDB levelDB = this.f16653v;
            levelDB.remove("proxy_item_config_" + i);
            LevelDB levelDB2 = this.f16653v;
            levelDB2.m17990N("proxy_item_time_" + i);
            this.f16653v.apply();
            if (l0 == i) {
                String j = this.f16653v.m17971j("proxy_item_config_");
                int s = (j == null || (lastIndexOf = j.lastIndexOf(95)) == -1) ? 0 : C5070i.m24052s(j.substring(lastIndexOf + 1));
                this.f16653v.putInt("proxy_current", s);
                if (s == 0) {
                    m24795T(false);
                }
            }
            return true;
        }
        throw new IllegalArgumentException();
    }

    public void m24839M4(boolean z) {
        m24683h6(1, z);
    }

    public void m24838M5(boolean z) {
        m24684h5(org.thunderdog.challegram.Log.TAG_CONTACT, z);
    }

    public void m24837N(int i, SharedPreferences.Editor editor, int i2) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (i != 0) {
            str = "wallpaper_" + i;
        } else {
            str = "wallpaper";
        }
        sb2.append(str);
        sb2.append(m24800S1(i2));
        String sb3 = sb2.toString();
        editor.remove(sb3).remove(sb3 + "_empty").remove(sb3 + "_custom").remove(sb3 + "_path").remove(sb3 + "_id");
    }

    public C4874f m24836N0() {
        if (this.f16629L == null) {
            C4874f fVar = null;
            for (LevelDB.C7052a aVar : this.f16653v.m17974g("settings_emoji_pack")) {
                if (aVar.m17943l().length() == 19) {
                    fVar = new C4874f(aVar.m17944k());
                } else if (fVar != null) {
                    String substring = aVar.m17943l().substring(19);
                    substring.hashCode();
                    char c = 65535;
                    switch (substring.hashCode()) {
                        case -1585134695:
                            if (substring.equals("_version")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 90810509:
                            if (substring.equals("_date")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 91108202:
                            if (substring.equals("_name")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            fVar.f16666b = aVar.m17947h();
                            continue;
                        case 1:
                            fVar.f16667c = aVar.m17947h();
                            continue;
                        case 2:
                            fVar.f16661M = aVar.m17944k();
                            continue;
                    }
                }
            }
            if (fVar == null) {
                this.f16629L = new C4874f();
            } else if (fVar.f16666b != 4) {
                this.f16630M = fVar;
                this.f16629L = new C4874f();
            } else {
                this.f16629L = fVar;
            }
        }
        return this.f16629L;
    }

    public String m24835N1(int i) {
        LevelDB levelDB = this.f16653v;
        return levelDB.getString("theme_author" + i, null);
    }

    public boolean m24834N2() {
        if (!this.f16654w) {
            return false;
        }
        this.f16654w = false;
        return true;
    }

    public void m24833N3(AbstractC4881m mVar) {
        this.f16620C.remove(mVar);
    }

    public void m24832N4(int i) {
        this.f16640i = Integer.valueOf(i);
        if (i == 1) {
            m24889F3("settings_incognito");
        } else {
            m24582u3("settings_incognito", i);
        }
    }

    public void m24831N5(boolean z) {
        if (m24684h5(org.thunderdog.challegram.Log.TAG_TDLIB_OPTIONS, z)) {
            m24583u2(2L);
        }
    }

    public void m24830O(C10930q6 q6Var, SharedPreferences.Editor editor, int i) {
        m24837N(q6Var.m2188w6(), editor, i);
    }

    public String m24829O0() {
        return m24836N0().f16665a;
    }

    public float m24828O1(int i, int i2, float f) {
        return this.f16653v.getFloat(m24731b6(i, i2), f);
    }

    public boolean m24827O2() {
        return m24872I(16);
    }

    public void m24826O3(AbstractC4882n nVar) {
        this.f16621D.remove(nVar);
    }

    public void m24825O4(int i) {
        if (i == 1) {
            m24889F3("settings_iv_mode");
        } else {
            m24582u3("settings_iv_mode", i);
        }
    }

    public void m24824O5(boolean z) {
        m24894E5(org.thunderdog.challegram.Log.TAG_CRASH, z);
    }

    public void m24823P(C10930q6 q6Var, SharedPreferences.Editor editor) {
        String str;
        int w6 = q6Var.m2188w6();
        m24830O(q6Var, editor, 0);
        m24830O(q6Var, editor, 1);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "wallpaper";
        if (w6 != 0) {
            str = "wallpaper_" + w6;
        } else {
            str = str2;
        }
        sb2.append(str);
        sb2.append("_other");
        this.f16653v.m17990N(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        if (w6 != 0) {
            str2 = "wallpaper_" + w6;
        }
        sb3.append(str2);
        sb3.append("_chat");
        this.f16653v.m17990N(sb3.toString());
    }

    public int m24822P0(AbstractC4872d dVar, boolean z) {
        if ("apple".equals(dVar.f16665a)) {
            return 1;
        }
        LevelDB levelDB = this.f16653v;
        int i = levelDB.getInt("settings_emoji_installed_" + dVar.f16665a, 0);
        if (i > 0 && (z || new File(C5078d.m23994s(), dVar.f16665a).exists())) {
            return i == dVar.f16667c ? 1 : 2;
        }
        return 0;
    }

    public final long m24821P1() {
        if (this.f16641j == null) {
            this.f16641j = Long.valueOf(this.f16653v.getLong("settings_tutorial", 0L));
        }
        return this.f16641j.longValue();
    }

    public boolean m24820P2() {
        Boolean bool = this.f16656y;
        if (bool == null) {
            bool = Boolean.valueOf(this.f16653v.getBoolean("settings_restrict_content", true));
            this.f16656y = bool;
        }
        return bool.booleanValue();
    }

    public void m24819P3(int i, SharedPreferences.Editor editor) {
        m24875H3(m24679i2("scroll_chat", i), editor);
    }

    public void m24818P4(boolean z) {
        if (z) {
            m24598s3("intro_attempt", true);
        } else {
            m24889F3("intro_attempt");
        }
    }

    public void m24817P5(boolean z) {
        m24894E5(134217728, z);
    }

    public void m24816Q() {
        this.f16644m.m24510c();
        org.thunderdog.challegram.Log.setLogLevel(0);
    }

    public int m24815Q0() {
        return m24780V0("emoji_vp_position", 0);
    }

    public final int m24814Q1() {
        return this.f16653v.getInt("debug_features", 0);
    }

    public boolean m24813Q2(String str, boolean z) {
        return m24633o0("settings_rtl" + C4403w.m27817w(str), z);
    }

    public void m24812Q3(AbstractC4890u uVar) {
        C6235i.m21012e(this.f16657z, uVar);
    }

    public void m24811Q4(int i, int i2) {
        m24582u3("keyboard_size" + i, i2);
    }

    public final void m24810Q5(int i) {
        if (i == 0) {
            this.f16653v.remove("debug_features");
        } else {
            this.f16653v.putInt("debug_features", i);
        }
    }

    public void m24809R() {
        int F1 = m24891F1();
        if ((F1 & 1) != 0) {
            m24558x5(F1, 1, false);
        }
    }

    public void m24808R0(Map<String, C5095o> map, List<C5094n> list) {
        String[] v = this.f16653v.m17959v("emoji_recents");
        if (v != null && v.length > 0) {
            for (String str : v) {
                C5095o oVar = map.get(str);
                if (oVar != null) {
                    list.add(new C5094n(str, oVar));
                }
            }
        }
    }

    public C4878j m24807R1() {
        return m24646m3(this.f16653v.m17968m("last_view_location"));
    }

    public boolean m24806R2() {
        return m24872I(2);
    }

    public boolean m24805R3() {
        return m24677i4(0);
    }

    public void m24804R4(TdApi.LanguagePackInfo languagePackInfo) {
        m24756Y3(this.f16653v, "settings_language_code", languagePackInfo);
        m24797S4(languagePackInfo);
    }

    public void m24803R5(double d, double d2, float f) {
        byte[] bArr = new byte[20];
        C6810a.m18949E(bArr, 0, d);
        C6810a.m18949E(bArr, 8, d2);
        C6810a.m18947G(bArr, 16, f);
        this.f16653v.m18000D("last_view_location", bArr);
    }

    public final void m24802S(C4880l lVar, boolean z) {
        Iterator<AbstractC4881m> it = this.f16620C.iterator();
        while (it.hasNext()) {
            it.next().mo4623P4(lVar, z);
        }
    }

    public C4876h m24801S0() {
        if (this.f16631N == null) {
            this.f16631N = new C4876h();
        }
        return this.f16631N;
    }

    public boolean m24799S2() {
        return m24907D(org.thunderdog.challegram.Log.TAG_TDLIB_OPTIONS);
    }

    public void m24798S3() {
        m24769W4(false);
        m24645m4(15.0f);
    }

    public final void m24797S4(TdApi.LanguagePackInfo languagePackInfo) {
        this.f16624G = new C4877i(languagePackInfo);
    }

    public boolean m24796S5(int i, long j, long j2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("hide_bot_keyboard_");
        sb2.append(j);
        return m24712e1(m24679i2(sb2.toString(), i), 0L) == j2;
    }

    public final void m24795T(boolean z) {
        Iterator<AbstractC4881m> it = this.f16620C.iterator();
        while (it.hasNext()) {
            it.next().mo4622g7(z);
        }
    }

    public final int m24794T0() {
        if (this.f16640i == null) {
            this.f16640i = Integer.valueOf(this.f16653v.getInt("settings_incognito", 1));
        }
        return this.f16640i.intValue();
    }

    public final void m24793T1(Message message) {
        if (message.what == 0) {
            m24900E(false);
        }
    }

    public boolean m24792T2() {
        return m24872I(org.thunderdog.challegram.Log.TAG_EMOJI);
    }

    public boolean m24791T3() {
        return m24628o5(1);
    }

    public void m24790T4(int i, boolean z) {
        if (z) {
            this.f16648q = Integer.valueOf(i);
            m24582u3("settings_map_provider_cloud", i);
            return;
        }
        this.f16647p = Integer.valueOf(i);
        m24582u3("settings_map_provider", i);
    }

    public final void m24789T5(final String str) {
        HashMap<String, AbstractRunnableC5910b> hashMap = this.f16623F;
        if (hashMap == null) {
            this.f16623F = new HashMap<>();
        } else if (hashMap.containsKey(str)) {
            return;
        }
        C4870b bVar = new C4870b(str);
        bVar.m21856e(C1379j0.m37316o());
        this.f16623F.put(str, bVar);
        C4383l.m28061a().m28059c(bVar, 1000);
        C1379j0.m37337d0(new Runnable() {
            @Override
            public final void run() {
                C4868i.this.m24655l2(str);
            }
        });
    }

    public final void m24788U(int i, String str, int i2, TdApi.ProxyType proxyType, String str2, boolean z, boolean z2) {
        Iterator<AbstractC4881m> it = this.f16620C.iterator();
        while (it.hasNext()) {
            it.next().mo4621k3(i, str, i2, proxyType, str2, z, z2);
        }
    }

    public int m24787U0() {
        return m24780V0("settings_iv_mode", 1);
    }

    public boolean m24786U1(int i, int i2) {
        return this.f16653v.contains(m24754Y5(i, i2));
    }

    public boolean m24785U2() {
        return m24872I(org.thunderdog.challegram.Log.TAG_PAINT);
    }

    public void m24784U3() {
        m24859J5(0L);
    }

    public void m24783U4(int i) {
        if (i == -1) {
            m24889F3("map_type");
        } else {
            m24582u3("map_type", i);
        }
    }

    public boolean m24782U5() {
        return m24872I(268435456);
    }

    public boolean m24781V() {
        return false;
    }

    public int m24780V0(String str, int i) {
        return this.f16653v.getInt(str, i);
    }

    public boolean m24779V1(int i) {
        return i > 0 && this.f16653v.contains(m24731b6(i, R.id.theme_property_parentTheme));
    }

    public boolean m24778V2() {
        return m24865J(org.thunderdog.challegram.Log.TAG_CRASH);
    }

    public void m24777V3() {
        this.f16628K = SystemClock.uptimeMillis();
    }

    public void m24776V4(int i) {
        if (i == 21) {
            m24889F3("settings_theme_position");
        } else {
            m24582u3("settings_theme_position", i);
        }
    }

    public void m24775V5(int i, String str, int i2) {
        long uptimeMillis = SystemClock.uptimeMillis() - this.f16628K;
        long j = this.f16653v.getLong("settings_tdlib_crash", 0L);
        String n2 = m24639n2(j);
        this.f16653v.edit();
        this.f16653v.putLong("settings_tdlib_crash", j + 1);
        LevelDB levelDB = this.f16653v;
        levelDB.putInt(n2 + "app", 1507020);
        LevelDB levelDB2 = this.f16653v;
        levelDB2.putInt(n2 + "flags", i2);
        LevelDB levelDB3 = this.f16653v;
        levelDB3.putInt(n2 + "id", i);
        LevelDB levelDB4 = this.f16653v;
        levelDB4.putLong(n2 + "uptime", uptimeMillis);
        LevelDB levelDB5 = this.f16653v;
        levelDB5.putLong(n2 + "time", System.currentTimeMillis());
        LevelDB levelDB6 = this.f16653v;
        levelDB6.putString(n2 + "rip", str);
        this.f16653v.apply();
        this.f16653v.m17970k();
    }

    public LevelDB m24774W() {
        return this.f16653v.edit();
    }

    public int m24773W0(int i, int i2) {
        int V0 = m24780V0("keyboard_size" + i, 0);
        if (V0 > 0) {
            i2 = V0;
        }
        return Math.max(i2, C1357a0.m37544i(75.0f));
    }

    public boolean m24772W1() {
        return this.f16644m.m24504i() || org.thunderdog.challegram.Log.getLogLevel() > 0;
    }

    public boolean m24771W2() {
        return m24872I(org.thunderdog.challegram.Log.TAG_NDK);
    }

    public void m24770W3() {
        m24881G4(this.f16629L);
    }

    public void m24769W4(boolean z) {
        if (m24894E5(64, z)) {
            m24718d3(this.f16619B, m24593t0());
        }
    }

    public void m24768W5(int i, String str) {
        m24777V3();
        m24775V5(i, str, 4);
    }

    public C4888s m24767X(int i, boolean z) {
        Map<String, Integer> map;
        Map<String, Integer> map2;
        C4888s sVar;
        int T = C11541z.m41T(i);
        if (z || T == 0) {
            map2 = C11527m.m130c();
            map = C11511b0.m355b();
        } else {
            map2 = null;
            map = null;
        }
        int i2 = 0;
        if (T != 0) {
            String str = "theme" + T + "_";
            sVar = new C4888s(m24927A0(T), m24913C0(T));
            int length = str.length();
            for (LevelDB.C7052a aVar : this.f16653v.m17974g(str)) {
                try {
                    m24614q3(aVar, length, sVar, map2, map);
                } catch (Throwable th) {
                    org.thunderdog.challegram.Log.m14725e("Cannot parse theme entry, key: %s", th, aVar.m17943l());
                }
            }
        } else {
            sVar = new C4888s(C4403w.m27871i1(C11541z.m14o(i)), null);
            AbstractC11531p a = C11514c0.m348a(i);
            int d = (int) a.mo93d(R.id.theme_property_parentTheme);
            sVar.f16715e = d;
            if (d != 0) {
                AbstractC11531p a2 = C11514c0.m348a(d);
                for (Map.Entry<String, Integer> entry : map2.entrySet()) {
                    int intValue = entry.getValue().intValue();
                    if (a2.mo92e(intValue) != a.mo92e(intValue)) {
                        sVar.m24494a(entry.getKey(), a.mo92e(intValue));
                    }
                }
                for (Map.Entry<String, Integer> entry2 : map.entrySet()) {
                    int intValue2 = entry2.getValue().intValue();
                    if (entry2.getValue().intValue() != R.id.theme_property_wallpaperId || a.mo93d(intValue2) != C11520h.m278q(i)) {
                        if (a2.mo93d(intValue2) != a.mo93d(intValue2)) {
                            sVar.m24493b(entry2.getKey(), a.mo93d(intValue2));
                        }
                    }
                }
            }
        }
        int i3 = sVar.f16715e;
        if (i3 != 0) {
            i2 = i3;
        } else if (!C11541z.m1y(i)) {
            i2 = i;
        }
        if (z && i2 != 0) {
            for (Map.Entry<String, Integer> entry3 : map2.entrySet()) {
                sVar.m24494a(entry3.getKey(), C11524j.m226O(entry3.getValue().intValue(), i2));
            }
            for (Map.Entry<String, Integer> entry4 : map.entrySet()) {
                float b0 = C11524j.m198b0(entry4.getValue().intValue(), i2);
                if (C11541z.m1y(i) || entry4.getValue().intValue() != R.id.theme_property_wallpaperId || b0 != C11520h.m278q(i)) {
                    sVar.m24493b(entry4.getKey(), b0);
                }
            }
        }
        return sVar;
    }

    public long m24766X0(String str, long j, long j2) {
        LevelDB levelDB = this.f16653v;
        long[] r = levelDB.m17963r("known_size_for_" + str);
        if (r != null && r.length >= 3 && r[0] == j && r[1] == j2) {
            return r[2];
        }
        throw new FileNotFoundException();
    }

    public boolean m24765X1() {
        return m24665k0() > 0;
    }

    public boolean m24764X2(long j) {
        return !C5063c.m24144c(m24821P1(), j) && !C5063c.m24144c(this.f16655x, j);
    }

    public final void m24763X3(String str, Map<String, ? extends AbstractC6811b> map) {
        int size = map.size();
        int w = C6810a.m18917w(size);
        for (Map.Entry<String, ? extends AbstractC6811b> entry : map.entrySet()) {
            w += entry.getKey().length() + entry.getValue().mo18912b();
        }
        C6810a aVar = new C6810a(w);
        aVar.m18941M(size);
        for (Map.Entry<String, ? extends AbstractC6811b> entry2 : map.entrySet()) {
            aVar.m18942L(entry2.getKey());
            entry2.getValue().mo18911c(aVar);
        }
        this.f16653v.m18000D(str, aVar.m18915y());
    }

    public void m24762X4(boolean z) {
        m24894E5(org.thunderdog.challegram.Log.TAG_COMPRESS, z);
    }

    public TdApi.LanguagePackInfo m24761X5(String str, C10930q6 q6Var) {
        if (C5070i.m24062i(str) || str.equals(m24752Z0().f25408id) || str.equals(m24728c1())) {
            return null;
        }
        return q6Var.m2874Ec();
    }

    public int m24760Y(long j) {
        return m24780V0("receiver_" + j, -1);
    }

    public C4877i m24759Y0() {
        if (this.f16624G == null) {
            m24797S4(m24917B3(this.f16653v, "settings_language_code", true));
        }
        return this.f16624G;
    }

    public boolean m24758Y1(int i) {
        int z0 = m24549z0(i);
        return (z0 & 1) == 0 || (z0 & 2) != 0;
    }

    public boolean m24757Y2(TdApi.ChatSource chatSource) {
        int constructor = chatSource.getConstructor();
        if (constructor == -328571244) {
            String str = ((TdApi.ChatSourcePublicServiceAnnouncement) chatSource).type;
            LevelDB levelDB = this.f16653v;
            String str2 = "settings_tutorial_psa";
            if (!C5070i.m24062i(str)) {
                str2 = str2 + str;
            }
            return !levelDB.contains(str2);
        } else if (constructor == 394074115) {
            return m24764X2(65536L);
        } else {
            throw new UnsupportedOperationException(chatSource.toString());
        }
    }

    public void m24755Y4(boolean z) {
        m24894E5(org.thunderdog.challegram.Log.TAG_LUX, z);
    }

    public C4873e m24753Z() {
        return m24563x0(this.f16653v.getLong("settings_tdlib_crash", 0L) - 1, true);
    }

    public TdApi.LanguagePackInfo m24752Z0() {
        return m24759Y0().f16675a;
    }

    public boolean m24751Z1() {
        return !m24764X2(16L);
    }

    public boolean m24750Z2() {
        return m24794T0() == 1;
    }

    public void m24749Z3(double d, double d2, float f) {
        byte[] bArr = new byte[20];
        C6810a.m18949E(bArr, 0, d);
        C6810a.m18949E(bArr, 8, d2);
        C6810a.m18947G(bArr, 16, f);
        this.f16653v.m18000D("last_inline_location", bArr);
    }

    public boolean m24748Z4(boolean z) {
        return m24894E5(8, z);
    }

    public boolean m24745a0() {
        return m24872I(32);
    }

    public int m24744a1() {
        return m24759Y0().f16676b;
    }

    public boolean m24743a2() {
        long n1;
        int m;
        int n;
        if (m24648m1() != 2 || (m = C5063c.m24134m((n1 = m24640n1()))) == (n = C5063c.m24133n(n1))) {
            return false;
        }
        Calendar e = C5067f.m24116e();
        return C5063c.m24146a(C5063c.m24140g(e.get(11), e.get(12), e.get(13)), m, n);
    }

    public boolean m24742a3(TdApi.Chat chat) {
        return m24794T0() == 1 && chat != null && C7316a.m17051j(chat.f25370id);
    }

    public void m24741a4(long j) {
        HandlerC4885p pVar = this.f16649r;
        pVar.sendMessageDelayed(Message.obtain(pVar, 0), j);
    }

    public void m24740a5(boolean z) {
        m24894E5(67108864, z);
    }

    public boolean m24737b0() {
        return m24865J(16);
    }

    public C4878j m24736b1() {
        return m24646m3(this.f16653v.m17968m("last_inline_location"));
    }

    public int m24735b2(HandlerC10770jj.C10783m mVar) {
        try {
            return m24642n(mVar.f34522a, mVar.f34526e, 0, mVar);
        } catch (Throwable th) {
            org.thunderdog.challegram.Log.m14725e("Cannot install theme", th, new Object[0]);
            return 0;
        }
    }

    public synchronized long m24734b3() {
        long longValue;
        if (this.f16626I == null) {
            this.f16626I = Long.valueOf(m24712e1("notifications_count", 0L));
        }
        Long valueOf = Long.valueOf(this.f16626I.longValue() + 1);
        this.f16626I = valueOf;
        longValue = valueOf.longValue();
        m24567w3("notifications_count", longValue);
        return longValue;
    }

    public void m24732b5(boolean z) {
        m24894E5(org.thunderdog.challegram.Log.TAG_ACCOUNTS, z);
    }

    public boolean m24729c0() {
        return m24865J(4);
    }

    public String m24728c1() {
        return m24849L1("settings_language_code_suggested", null);
    }

    public final int m24726c3() {
        return m24780V0("settings_theme_count", 0) + 1;
    }

    public void m24725c4(boolean z) {
        m24894E5(4, z);
    }

    public void m24724c5(boolean z) {
        m24684h5(org.thunderdog.challegram.Log.TAG_ROUND, z);
    }

    public boolean m24721d0() {
        return m24865J(8);
    }

    public C4887r m24720d1() {
        return this.f16644m;
    }

    public boolean m24719d2() {
        return m24872I(4);
    }

    public void m24717d4(int i, boolean z) {
        String str = "settings_tdlib_allow_debug" + i;
        if (z) {
            this.f16653v.m17993K(str);
        } else {
            this.f16653v.remove(str);
        }
    }

    public void m24716d5(String str, boolean z) {
        m24598s3("settings_rtl" + C4403w.m27817w(str), z);
        C4403w.m27825u();
    }

    public final boolean m24715d6(String str) {
        String str2 = "brut_force_seconds";
        if (str != null) {
            str2 = str2 + str;
        }
        int i = this.f16653v.getInt(str2, 0) - 1;
        if (i > 0) {
            this.f16653v.putInt(str2, i);
            return true;
        }
        this.f16653v.remove(str2);
        return false;
    }

    public void m24713e0(String str) {
        LevelDB levelDB = this.f16653v;
        levelDB.remove("known_size_for_" + str);
    }

    public long m24712e1(String str, long j) {
        return this.f16653v.getLong(str, j);
    }

    public boolean m24711e2() {
        return this.f16653v.getBoolean("is_emulator", false);
    }

    public void m24710e3() {
        boolean o3 = m24630o3();
        for (int size = this.f16657z.size() - 1; size >= 0; size--) {
            AbstractC4890u uVar = this.f16657z.get(size).get();
            if (uVar != null) {
                uVar.mo6954G4(o3);
            } else {
                this.f16657z.remove(size);
            }
        }
    }

    public void m24709e4(long j) {
        m24598s3("allow_location_" + j, true);
    }

    public void m24708e5(boolean z) {
        m24894E5(org.thunderdog.challegram.Log.TAG_EMOJI, z);
    }

    public void m24707e6() {
        m24769W4(!m24925A2());
    }

    public void m24705f0(int i, String str) {
        String str2;
        if (str != null) {
            str2 = "brut_force_errors" + str;
        } else {
            str2 = "global_brut_force_errors";
        }
        this.f16653v.m17990N(str2);
    }

    public long[] m24704f1(String str) {
        return this.f16653v.m17963r(str);
    }

    public final void m24702f3(boolean z) {
        for (int size = this.f16657z.size() - 1; size >= 0; size--) {
            AbstractC4890u uVar = this.f16657z.get(size).get();
            if (uVar != null) {
                uVar.mo6863r1(z);
            } else {
                this.f16657z.remove(size);
            }
        }
    }

    public void m24701f4(int i) {
        int m1 = m24648m1();
        if (m1 != i) {
            this.f16634c = Integer.valueOf(i);
            if (i == f16613Q) {
                m24889F3("settings_night_mode");
            } else {
                m24582u3("settings_night_mode", i);
            }
            C11541z.m7t().m55H(i);
            if (i == 2 || m1 == 2) {
                m24900E(true);
            }
        }
    }

    public void m24700f5(boolean z) {
        m24894E5(org.thunderdog.challegram.Log.TAG_PAINT, z);
    }

    public boolean m24699f6(int i) {
        int F1 = m24891F1();
        return m24558x5(F1, i, (F1 & i) == 0);
    }

    public String[] m24697g0() {
        return (String[]) m24689h0().toArray(new String[0]);
    }

    public int m24696g1(boolean z) {
        if (z) {
            if (this.f16648q == null) {
                this.f16648q = Integer.valueOf(this.f16653v.getInt("settings_map_provider_cloud", 1));
            }
            return this.f16648q.intValue();
        }
        if (this.f16647p == null) {
            this.f16647p = Integer.valueOf(this.f16653v.getInt("settings_map_provider", -1));
        }
        return this.f16647p.intValue();
    }

    public boolean m24695g2() {
        return m24633o0("intro_attempt", false);
    }

    public final void m24655l2(String str) {
        C6227d<AbstractC4879k> dVar = this.f16622E;
        if (dVar != null) {
            Iterator<AbstractC4879k> it = dVar.iterator();
            while (it.hasNext()) {
                it.next().mo24528g6(str);
            }
        }
    }

    public void m24693g4(int i) {
        this.f16639h = Integer.valueOf(i);
        if (i == 0) {
            m24889F3("settings_auto_update");
        } else {
            m24582u3("settings_auto_update", i);
        }
    }

    public boolean m24692g5(boolean z) {
        return m24894E5(org.thunderdog.challegram.Log.TAG_NDK, z);
    }

    public void m24691g6() {
        m24544z5(!m24827O2());
    }

    public List<String> m24689h0() {
        if (this.f16627J == null) {
            this.f16627J = new ArrayList();
            String[] v = this.f16653v.m17959v("settings_authentication_token");
            if (v != null) {
                Collections.addAll(this.f16627J, v);
            }
        }
        return this.f16627J;
    }

    public int m24688h1() {
        return m24780V0("map_type", -1);
    }

    public boolean m24687h2(int i, String str) {
        LevelDB levelDB = this.f16653v;
        String str2 = "brut_force_seconds";
        if (str != null) {
            str2 = str2 + str;
        }
        return levelDB.contains(str2);
    }

    public void m24686h3(int i, long j, long j2, boolean z) {
        if (z) {
            m24567w3(m24679i2("hide_bot_keyboard_" + j, i), j2);
            return;
        }
        m24889F3(m24679i2("hide_bot_keyboard_" + j, i));
    }

    public void m24685h4(boolean z) {
        m24894E5(1, z);
    }

    public final boolean m24684h5(int i, boolean z) {
        return m24894E5(i, !z);
    }

    public final void m24683h6(int i, boolean z) {
        int Q1 = m24814Q1();
        int h = C5063c.m24139h(Q1, i, z);
        if (Q1 != h) {
            m24810Q5(h);
        }
    }

    public int m24681i0() {
        if (this.f16639h == null) {
            this.f16639h = Integer.valueOf(this.f16653v.getInt("settings_auto_update", 0));
        }
        return this.f16639h.intValue();
    }

    public float m24680i1() {
        if (this.f16635d == null) {
            this.f16635d = Float.valueOf(this.f16653v.getFloat("night_lux_max", 1.5f));
        }
        return this.f16635d.floatValue();
    }

    public boolean m24677i4(int i) {
        if (m24649m0() == i) {
            return false;
        }
        this.f16642k = Integer.valueOf(i);
        if (i == 0) {
            m24889F3("settings_badge_flags");
            return true;
        }
        m24582u3("settings_badge_flags", i);
        return true;
    }

    public boolean m24676i5(long j, boolean z) {
        return m24668j5(C5063c.m24138i(m24656l1(), j, z));
    }

    public void m24675i6(int i, String str, String str2) {
        int i2 = i != 1 ? i != 2 ? 5 : 7 : 4;
        String str3 = str2 != null ? "brut_force_errors" + str2 : "global_brut_force_errors";
        int i3 = 0;
        String u = str != null ? C4862d.m24937u(str) : null;
        for (LevelDB.C7052a aVar : this.f16653v.m17974g(str3)) {
            if (u == null || !C5070i.m24068c(u, aVar.m17944k())) {
                i3++;
            } else {
                aVar.m17942m();
                return;
            }
        }
        this.f16653v.putString(str3 + "_" + i3, str != null ? C4862d.m24937u(str) : "");
        int i4 = i3 + 1;
        if (i4 % i2 == 0) {
            m24564x(i, i4 / i2, str2);
        }
    }

    public List<C4880l> m24673j0() {
        ArrayList arrayList = new ArrayList();
        int[] p = this.f16653v.m17965p("proxy_order");
        C6810a aVar = null;
        for (LevelDB.C7052a aVar2 : this.f16653v.m17974g("proxy_item_")) {
            String l = aVar2.m17943l();
            int lastIndexOf = l.lastIndexOf(95);
            int i = -1;
            if (lastIndexOf != -1) {
                int s = C5070i.m24052s(l.substring(lastIndexOf + 1));
                if (s < 0) {
                    org.thunderdog.challegram.Log.m14709w("Unknown proxy id entry:%d", Integer.valueOf(s));
                } else if (s != 0) {
                    if (l.startsWith("proxy_item_config_")) {
                        byte[] e = aVar2.m17950e();
                        if (aVar == null) {
                            aVar = new C6810a();
                        }
                        C4880l C3 = m24910C3(s, e, aVar);
                        if (C3 != null) {
                            if (p != null) {
                                i = C5062b.m24155r(p, s);
                            }
                            C3.f16682N = i;
                            arrayList.add(C3);
                        } else {
                            org.thunderdog.challegram.Log.m14709w("Removing proxy configuration, because it cannot be read, proxyId:%d", Integer.valueOf(s));
                            m24840M3(s);
                        }
                    } else if (!arrayList.isEmpty()) {
                        C4880l lVar = (C4880l) arrayList.get(arrayList.size() - 1);
                        if (lVar.f16689a == s) {
                            try {
                                if (l.startsWith("proxy_item_desc_")) {
                                    lVar.f16683O = aVar2.m17944k();
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

    public int m24672j1() {
        return m24780V0("settings_theme_position", 21);
    }

    public void m24669j4(int i) {
        if (i == 0) {
            this.f16653v.remove("settings_camera_ratio");
        } else {
            this.f16653v.putInt("settings_camera_ratio", i);
        }
    }

    public final boolean m24668j5(long j) {
        long l1 = m24656l1();
        if (l1 == j) {
            return false;
        }
        this.f16633b = Long.valueOf(j);
        this.f16653v.putLong("settings_other2", j);
        C6227d<AbstractC4886q> dVar = this.f16652u;
        if (dVar == null) {
            return true;
        }
        Iterator<AbstractC4886q> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().mo2412i6(j, l1);
        }
        return true;
    }

    public void m24667j6(String str) {
        List<String> h0 = m24689h0();
        if (!h0.contains(str)) {
            h0.add(str);
            while (h0.size() > 20) {
                h0.remove(0);
            }
            this.f16653v.m17994J("settings_authentication_token", (String[]) h0.toArray(new String[0]));
        }
    }

    public void m24666k(AbstractC4875g gVar) {
        C6235i.m21016a(this.f16619B, gVar);
    }

    public int m24665k0() {
        return (int) this.f16653v.m17960u("proxy_item_config_");
    }

    public boolean m24664k1(long j) {
        return C5063c.m24144c(m24656l1(), j);
    }

    public void m24661k4(int i) {
        if (i == 0) {
            this.f16653v.remove("settings_camera_type");
        } else {
            this.f16653v.putInt("settings_camera_type", i);
        }
    }

    public boolean m24660k5(float f, boolean z) {
        boolean z2 = m24680i1() != f;
        this.f16635d = Float.valueOf(f);
        if (z) {
            m24590t3("night_lux_max", f);
        }
        return z2;
    }

    public void m24659k6(String str) {
        LevelDB levelDB = null;
        for (LevelDB.C7052a aVar : this.f16653v.m17974g("settings_emoji_installed_")) {
            if (str == null || !aVar.m17943l().substring(25).equals(str)) {
                if (levelDB == null) {
                    levelDB = m24774W();
                }
                levelDB.remove(aVar.m17943l());
            }
        }
        if (levelDB != null) {
            levelDB.apply();
        }
    }

    public void m24658l(AbstractC4871c cVar) {
        if (this.f16651t == null) {
            this.f16651t = new C6227d<>();
        }
        this.f16651t.add(cVar);
    }

    public int m24657l0() {
        return this.f16653v.getInt("proxy_current", 0);
    }

    public final long m24656l1() {
        if (this.f16633b == null) {
            this.f16633b = Long.valueOf(this.f16653v.getLong("settings_other2", m24631o2()));
        }
        return this.f16633b.longValue();
    }

    public void m24653l4(int i) {
        if (i == 0) {
            this.f16653v.remove("settings_camera_control");
        } else {
            this.f16653v.putInt("settings_camera_control", i);
        }
    }

    public void m24652l5(int i, boolean z) {
        long n1 = m24640n1();
        int m = z ? i : C5063c.m24134m(n1);
        if (z) {
            i = C5063c.m24133n(n1);
        }
        m24644m5(C5063c.m24141f(m, i));
    }

    public void m24651l6(int i, long j, long j2, long j3) {
        char c;
        String i2 = m24679i2("scroll_chat" + j, i);
        LevelDB levelDB = null;
        for (LevelDB.C7052a aVar : this.f16653v.m17974g(i2)) {
            String replaceAll = aVar.m17943l().substring(i2.length()).replaceAll("_thread[\\d]+$", "");
            replaceAll.hashCode();
            int i3 = -1;
            switch (replaceAll.hashCode()) {
                case -1465440887:
                    if (replaceAll.equals("_stack")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -981817656:
                    if (replaceAll.equals("_message")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1443689919:
                    if (replaceAll.equals("_aliases")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 2:
                    long[] j4 = aVar.m17945j();
                    if (j4 != null) {
                        i3 = C5062b.m24154s(j4, j2);
                    }
                    if (i3 >= 0) {
                        j4[i3] = j3;
                        Arrays.sort(j4);
                        if (levelDB == null) {
                            levelDB = m24774W();
                        }
                        levelDB.m17995I(aVar.m17943l(), j4);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (aVar.m17946i() != j2) {
                        break;
                    } else {
                        if (levelDB == null) {
                            levelDB = m24774W();
                        }
                        levelDB.putLong(aVar.m17943l(), j3);
                        break;
                    }
            }
        }
        if (levelDB != null) {
            levelDB.apply();
        }
    }

    public void m24650m(AbstractC4886q qVar) {
        if (this.f16652u == null) {
            this.f16652u = new C6227d<>();
        }
        this.f16652u.add(qVar);
    }

    public int m24649m0() {
        if (this.f16642k == null) {
            this.f16642k = Integer.valueOf(this.f16653v.getInt("settings_badge_flags", 0));
        }
        return this.f16642k.intValue();
    }

    public int m24648m1() {
        Throwable th;
        if (this.f16634c == null) {
            LevelDB levelDB = this.f16653v;
            int i = f16613Q;
            int i2 = levelDB.getInt("settings_night_mode", i);
            if (i2 == 1) {
                try {
                    SensorManager sensorManager = (SensorManager) C1379j0.m37318n().getSystemService("sensor");
                    if (sensorManager == null || sensorManager.getDefaultSensor(5) != null) {
                        i = i2;
                    } else {
                        org.thunderdog.challegram.Log.m14724e("Disabling night mode, because light sensor is unavailable", new Object[0]);
                        try {
                            m24889F3("settings_night_mode");
                        } catch (Throwable th2) {
                            th = th2;
                            org.thunderdog.challegram.Log.m14708w(th);
                            i2 = i;
                            this.f16634c = Integer.valueOf(i2);
                            return this.f16634c.intValue();
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i = i2;
                }
                i2 = i;
            }
            this.f16634c = Integer.valueOf(i2);
        }
        return this.f16634c.intValue();
    }

    public C11529n m24647m2(int i) {
        String str = "theme" + i + "_";
        C11529n nVar = new C11529n(C11541z.m32a0(i));
        int length = str.length();
        Map<String, Integer> c = C11527m.m130c();
        Map<String, Integer> b = C11511b0.m355b();
        int i2 = 0;
        for (LevelDB.C7052a aVar : this.f16653v.m17974g(str)) {
            try {
                m24606r3(aVar, length, nVar, c, b);
                i2++;
            } catch (Throwable th) {
                org.thunderdog.challegram.Log.m14725e("Cannot parse theme entry, key: %s", th, aVar.m17943l());
            }
        }
        if (i2 <= 0) {
            return null;
        }
        nVar.m117n(m24913C0(i));
        return nVar;
    }

    public boolean m24645m4(float f) {
        if (!m24703f2(f) || m24593t0() == f) {
            return false;
        }
        this.f16645n = Float.valueOf(f);
        m24590t3("settings_font_size", f);
        m24718d3(this.f16619B, f);
        return true;
    }

    public boolean m24644m5(long j) {
        if (m24640n1() == j) {
            return false;
        }
        this.f16636e = Long.valueOf(j);
        m24567w3("settings_night_mode_schedule", j);
        if (m24648m1() == 2) {
            m24900E(true);
        }
        return true;
    }

    public final void m24643m6(me.vkryl.leveldb.LevelDB r30, android.content.SharedPreferences.Editor r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: ge.C4868i.m24643m6(me.vkryl.leveldb.LevelDB, android.content.SharedPreferences$Editor, int):void");
    }

    public int m24642n(String str, int i, int i2, HandlerC10770jj.C10783m mVar) {
        String str2;
        Throwable th;
        String l;
        StringBuilder sb2;
        int c3 = m24726c3();
        int i3 = 0;
        if (mVar != null) {
            StringBuilder sb3 = new StringBuilder("theme_installation_");
            mVar.f34531j = new C11529n(C11541z.m32a0(c3));
            if (!C5070i.m24062i(mVar.f34525d)) {
                mVar.f34531j.m117n(mVar.f34525d);
                sb3.append('w');
                sb3.append(mVar.f34525d);
            }
            if (!mVar.f34530i.isEmpty()) {
                sb3.append('c');
            }
            for (HandlerC10770jj.C10783m.C10784a aVar : mVar.f34530i) {
                mVar.f34531j.m121j(aVar.f34534b, Integer.valueOf(aVar.f34535c));
                sb3.append(',');
                sb3.append(aVar.f34533a);
                sb3.append(":");
                sb3.append(aVar.f34535c);
            }
            if (!mVar.f34529h.isEmpty()) {
                sb3.append('p');
            }
            for (HandlerC10770jj.C10783m.C10784a aVar2 : mVar.f34529h) {
                mVar.f34531j.m118m(aVar2.f34534b, Float.valueOf(aVar2.f34532M));
                sb3.append(',');
                sb3.append(aVar2.f34533a);
                sb3.append(":");
                sb3.append(C7389v0.m16641e0(aVar2.f34532M, true));
            }
            str2 = sb3.toString();
            int i4 = this.f16653v.getInt(str2, 0);
            if (m24779V1(i4)) {
                mVar.f34531j.m120k(C11541z.m32a0(i4));
                return i4;
            } else if (i4 > 0) {
                this.f16653v.remove(str2);
            }
        } else {
            str2 = null;
        }
        this.f16653v.edit();
        m24582u3("settings_theme_count", c3);
        m24546z3("theme_name" + c3, str);
        if (i2 > 0) {
            String str3 = "theme" + i2 + "_";
            for (LevelDB.C7052a aVar3 : this.f16653v.m17974g(str3)) {
                try {
                    l = aVar3.m17943l();
                    sb2 = new StringBuilder();
                    sb2.append("theme");
                    sb2.append(c3);
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    sb2.append(l.substring(str3.length() - 1));
                    String sb4 = sb2.toString();
                    char charAt = l.charAt(str3.length());
                    if (charAt == 'c') {
                        this.f16653v.putInt(sb4, aVar3.m17947h());
                    } else if (charAt != 'p') {
                        org.thunderdog.challegram.Log.m14724e("Unknown theme key: %s", l);
                    } else {
                        this.f16653v.putFloat(sb4, aVar3.m17948g());
                    }
                    i3 = 0;
                } catch (Throwable th3) {
                    th = th3;
                    i3 = 0;
                    org.thunderdog.challegram.Log.m14725e("Error while copying", th, new Object[i3]);
                }
            }
            int z0 = m24549z0(i2);
            if ((z0 & 1) != 0) {
                this.f16653v.m18001C("theme_flags" + c3, (byte) (z0 | 2));
                String string = this.f16653v.getString("theme_author" + i2, null);
                if (!C5070i.m24062i(string)) {
                    this.f16653v.putString("theme_author" + c3, string);
                }
                String string2 = this.f16653v.getString("theme_wallpaper" + i2, null);
                if (!C5070i.m24062i(string2)) {
                    this.f16653v.putString("theme_wallpaper" + c3, string2);
                }
            }
        } else if (mVar != null) {
            for (HandlerC10770jj.C10783m.C10784a aVar4 : mVar.f34530i) {
                m24582u3(m24739a6(c3, aVar4.f34533a), aVar4.f34535c);
            }
            for (HandlerC10770jj.C10783m.C10784a aVar5 : mVar.f34529h) {
                m24590t3(m24723c6(c3, aVar5.f34533a), aVar5.f34532M);
                if (aVar5.f34534b == R.id.theme_property_parentTheme) {
                    i3 = 1;
                }
            }
            if (!C5070i.m24062i(mVar.f34524c)) {
                this.f16653v.putString("theme_author" + c3, mVar.f34524c);
            }
            if (!C5070i.m24062i(mVar.f34525d)) {
                this.f16653v.putString("theme_wallpaper" + c3, mVar.f34525d);
            }
            this.f16653v.m18001C("theme_flags" + c3, (byte) 1);
            if (!C5070i.m24062i(str2)) {
                this.f16653v.putInt(str2, c3);
            }
        }
        if (i3 == 0) {
            m24590t3(m24731b6(c3, R.id.theme_property_parentTheme), i);
        }
        this.f16653v.apply();
        return c3;
    }

    public final <T extends AbstractC6811b> void m24641n0(String str, Map<String, T> map, Class<T> cls) {
        byte[] m = this.f16653v.m17968m(str);
        if (m != null && m.length != 0) {
            try {
                C6810a aVar = new C6810a(m);
                int s = aVar.m18921s();
                for (int i = 0; i < s; i++) {
                    String q = aVar.m18923q();
                    T newInstance = cls.newInstance();
                    newInstance.mo18913a(aVar);
                    map.put(q, newInstance);
                }
            } catch (Throwable th) {
                org.thunderdog.challegram.Log.m14725e("Unable to get binary map", th, new Object[0]);
            }
        }
    }

    public final long m24640n1() {
        if (this.f16636e == null) {
            this.f16636e = Long.valueOf(this.f16653v.getLong("settings_night_mode_schedule", C5063c.m24141f(C5063c.m24140g(22, 0, 0), C5063c.m24140g(7, 0, 0))));
        }
        return this.f16636e.longValue();
    }

    public LevelDB m24638n3() {
        return this.f16653v;
    }

    public void m24637n4(int i) {
        if (m24585u0() != i) {
            LevelDB levelDB = this.f16653v;
            Integer valueOf = Integer.valueOf(i);
            this.f16650s = valueOf;
            levelDB.putInt("settings_chat_list_mode", valueOf.intValue());
            C6227d<AbstractC4871c> dVar = this.f16651t;
            if (dVar != null) {
                Iterator<AbstractC4871c> it = dVar.iterator();
                while (it.hasNext()) {
                    it.next().mo24541l5(i);
                }
            }
        }
    }

    public boolean m24636n5(int i, boolean z) {
        int q1 = m24616q1();
        if (z) {
            if (i == 8) {
                q1 = C5063c.m24139h(q1, 16, false);
            } else if (i == 16) {
                q1 = C5063c.m24139h(q1, 8, false);
            }
        }
        return m24628o5(C5063c.m24139h(q1, i, z));
    }

    @Deprecated
    public final void m24635n6(SharedPreferences sharedPreferences, SharedPreferences.Editor editor, int i) {
        switch (i) {
            case 1:
                C10756j9.m4026F0(sharedPreferences, editor);
                return;
            case 2:
            default:
                return;
            case 3:
            case 6:
                int i2 = sharedPreferences.getInt("settings_other", -1);
                if (i2 != -1 && (i2 & org.thunderdog.challegram.Log.TAG_CAMERA) == 0) {
                    sharedPreferences.edit().putInt("settings_other", i2 | org.thunderdog.challegram.Log.TAG_CAMERA).apply();
                    return;
                }
                return;
            case 4:
                float f = sharedPreferences.getFloat("night_lux_max", 1.5f) * Math.max(0.5f, Math.min(20.0f, sharedPreferences.getFloat("night_lux_max_multiply", 1.0f)));
                if (f != 1.5f) {
                    editor.putFloat("night_lux_max", f);
                }
                editor.remove("night_lux_max_multiply");
                if (sharedPreferences.contains("settings_other")) {
                    int i3 = sharedPreferences.getInt("settings_other", 0);
                    if ((262144 & i3) != 0) {
                        editor.putInt("settings_night_mode", 1);
                    }
                    int i4 = i3 & (-5) & (-9) & (-33) & (-65) & (-129) & (-65537) & (-262145) & (-8388609) & (-134217729) & (-536870913) & (-524289) & (-16385);
                    if (i4 != i3) {
                        editor.putInt("settings_other", i4);
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
                int i5 = sharedPreferences.getInt("push_user_id", 0);
                String string = sharedPreferences.getString("push_user_ids", null);
                if (i5 != 0) {
                    editor.remove("push_user_id");
                    if (C5070i.m24062i(string)) {
                        editor.putString("push_user_ids", String.valueOf(i5));
                        return;
                    }
                    return;
                }
                return;
            case 9:
                if (sharedPreferences.contains("settings_other")) {
                    int i6 = sharedPreferences.getInt("settings_other", 0);
                    if ((1048576 & i6) != 0) {
                        editor.putInt("settings_other", i6 & (-1048577));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public int m24634o(String str, int i, TdApi.ProxyType proxyType, String str2, boolean z) {
        return m24626p(str, i, proxyType, str2, z, 0);
    }

    public boolean m24633o0(String str, boolean z) {
        return this.f16653v.getBoolean(str, z);
    }

    public int m24632o1() {
        return C5063c.m24133n(m24640n1());
    }

    public final long m24631o2() {
        return 0L;
    }

    public boolean m24630o3() {
        return C4183a.f14098p && m24872I(33554432);
    }

    public boolean m24629o4(int i) {
        if (m24577v0() == i) {
            return false;
        }
        if (i == 0) {
            this.f16653v.remove("settings_color_format");
        } else {
            this.f16653v.m18001C("settings_color_format", (byte) i);
        }
        this.f16625H = i;
        return true;
    }

    public final boolean m24628o5(int i) {
        if (m24616q1() == i) {
            return false;
        }
        this.f16643l = Integer.valueOf(i);
        if (i == 1) {
            m24889F3("settings_notification_flags");
        } else {
            m24582u3("settings_notification_flags", i);
        }
        return true;
    }

    public boolean m24627o6() {
        return m24907D(org.thunderdog.challegram.Log.TAG_TDLIB_FILES);
    }

    public int m24626p(String str, int i, TdApi.ProxyType proxyType, String str2, boolean z, int i2) {
        boolean z2;
        int i3;
        boolean z3;
        byte[] b4 = m24733b4(str, i, proxyType);
        String trim = str2 != null ? str2.trim() : str2;
        long l0 = m24657l0();
        int F1 = m24891F1();
        LevelDB f = this.f16653v.edit();
        boolean z4 = false;
        if (i2 != 0) {
            f.m18000D("proxy_item_config_" + i2, b4);
            i3 = i2;
            z3 = false;
            z2 = false;
        } else {
            String i4 = this.f16653v.m17972i("proxy_item_config_", b4);
            if (i4 != null) {
                int s = C5070i.m24052s(i4.substring(18));
                z2 = false;
                z3 = l0 == ((long) s) && (F1 & 1) != 0;
                i3 = s;
            } else {
                int V0 = m24780V0("proxy_id", 0) + 1;
                f.putInt("proxy_id", V0);
                f.m18000D("proxy_item_config_" + V0, b4);
                f.m17990N("proxy_item_time_" + V0);
                i3 = V0;
                z3 = false;
                z2 = true;
            }
        }
        if (!C5070i.m24062i(trim)) {
            f.putString("proxy_item_desc_" + i3, trim);
        } else {
            f.remove("proxy_item_desc_" + i3);
        }
        if (z3) {
            f.apply();
            return i3;
        }
        if (z) {
            if ((F1 & 1) == 0) {
                F1 |= 1;
                f.m18001C("proxy_settings", (byte) F1);
            }
            if (i3 != l0) {
                f.putInt("proxy_current", i3);
            }
        } else if (l0 == 0) {
            if ((F1 & 1) != 0) {
                F1 &= -2;
                f.m18001C("proxy_settings", (byte) F1);
            }
            f.putInt("proxy_current", i3);
        }
        f.apply();
        if (z2) {
            m24802S(new C4880l(i3, str, i, proxyType, trim), z);
        }
        if (z || (l0 == i3 && (F1 & 1) != 0)) {
            z4 = true;
        }
        int i5 = i3;
        m24788U(i3, str, i, proxyType, trim, z4, z2);
        if (l0 == 0) {
            m24795T(true);
        }
        return i5;
    }

    public float m24625p0() {
        int q0 = m24617q0();
        if (q0 == 1) {
            return 1.3333334f;
        }
        if (q0 != 2) {
            return q0 != 3 ? 1.7777778f : 0.0f;
        }
        return 1.0f;
    }

    public int m24624p1() {
        return C5063c.m24134m(m24640n1());
    }

    public final C11533r m24622p3(LevelDB.C7052a aVar, C11533r rVar) {
        int parseInt = Integer.parseInt(aVar.m17943l().substring(10));
        if (parseInt <= 0) {
            return rVar;
        }
        int a0 = C11541z.m32a0(parseInt);
        if (rVar != null && rVar.m110c() == a0) {
            return rVar;
        }
        return new C11533r(a0, aVar.m17944k(), m24913C0(parseInt), (int) m24828O1(parseInt, R.id.theme_property_parentTheme, 1.0f), m24549z0(parseInt));
    }

    public void m24621p4(int i, int i2, int[] iArr) {
        String Y5 = m24754Y5(i, i2);
        if (iArr == null || iArr.length == 0) {
            this.f16653v.remove(Y5);
        } else {
            this.f16653v.m17996H(Y5, iArr);
        }
    }

    public void m24620p5(int i) {
        m24582u3("paint_id", i);
    }

    public boolean m24619p6() {
        return m24907D(4194304);
    }

    public void m24618q(AbstractC4879k kVar) {
        if (this.f16622E == null) {
            this.f16622E = new C6227d<>();
        }
        this.f16622E.add(kVar);
    }

    public int m24617q0() {
        return this.f16653v.getInt("settings_camera_ratio", 0);
    }

    public final int m24616q1() {
        if (this.f16643l == null) {
            int i = this.f16653v.getInt("settings_notification_flags", 1);
            if (C5063c.m24145b(i, 8) && C5063c.m24145b(i, 16)) {
                i = C5063c.m24139h(C5063c.m24139h(i, 8, false), 16, false);
            }
            this.f16643l = Integer.valueOf(i);
        }
        return this.f16643l.intValue();
    }

    public boolean m24613q4(C4873e eVar, int i, boolean z) {
        int h = C5063c.m24139h(eVar.f16674g, i, z);
        if (eVar.f16674g == h) {
            return false;
        }
        LevelDB levelDB = this.f16653v;
        levelDB.putInt(m24639n2(eVar.f16668a) + "flags", h);
        eVar.f16674g = h;
        return true;
    }

    public void m24612q5(int i) {
        if (i == 53) {
            m24889F3("pip_gravity");
        } else {
            m24582u3("pip_gravity", i);
        }
    }

    public boolean m24611q6() {
        return m24907D(org.thunderdog.challegram.Log.TAG_CONTACT);
    }

    public void m24610r(AbstractC4881m mVar) {
        this.f16620C.add(mVar);
    }

    public int m24609r0() {
        if (!C4183a.f14092j) {
            return 2;
        }
        int i = this.f16653v.getInt("settings_camera_type", 0);
        if (i != 1 || C4183a.f14093k) {
            return i;
        }
        return 0;
    }

    public C4874f m24608r1() {
        return this.f16630M;
    }

    public void m24607r2() {
        if (!m24711e2()) {
            m24598s3("is_emulator", true);
            C10536ab.m4667o1().m4734W2(true);
        }
    }

    public void m24605r4(int i, int i2, Integer num) {
        if (num == null) {
            this.f16653v.remove(m24747Z5(i, i2));
        } else {
            this.f16653v.putInt(m24747Z5(i, i2), num.intValue());
        }
    }

    public void m24604r5(float f, float f2) {
        m24567w3("pip", C5063c.m24141f((int) Math.signum(f), (int) Math.signum(f2)));
    }

    public boolean m24603r6() {
        return false;
    }

    public void m24602s(AbstractC4882n nVar) {
        this.f16621D.add(nVar);
    }

    public int m24601s0() {
        return this.f16653v.getInt("settings_camera_control", 0);
    }

    public int m24600s1() {
        return m24780V0("paint_id", 0);
    }

    public void m24599s2(C4873e eVar) {
        if (m24613q4(eVar, 1, true)) {
            m24777V3();
        }
    }

    public void m24598s3(String str, boolean z) {
        this.f16653v.putBoolean(str, z);
    }

    public void m24597s4(int i, String str) {
        LevelDB levelDB = this.f16653v;
        levelDB.putString("theme_name" + i, str);
    }

    public void m24596s5(int i) {
        m24582u3("player_flags", i);
    }

    public boolean m24595s6() {
        return m24872I(134217728);
    }

    public void m24594t(AbstractC4890u uVar) {
        C6235i.m21016a(this.f16657z, uVar);
    }

    public float m24593t0() {
        if (this.f16645n == null) {
            float f = 15.0f;
            float f2 = this.f16653v.getFloat("settings_font_size", 15.0f);
            if (m24703f2(f2)) {
                f = f2;
            }
            this.f16645n = Float.valueOf(f);
        }
        return this.f16645n.floatValue();
    }

    public int m24592t1(String str) {
        String str2 = "brut_force_seconds";
        if (str != null) {
            str2 = str2 + str;
        }
        return this.f16653v.getInt(str2, 0);
    }

    public void m24591t2(C4874f fVar) {
        LevelDB levelDB = this.f16653v;
        levelDB.putInt("settings_emoji_installed_" + fVar.f16665a, fVar.f16667c);
    }

    public void m24590t3(String str, float f) {
        this.f16653v.putFloat(str, f).apply();
    }

    public void m24589t4(int i, int i2, Float f) {
        if (f == null) {
            this.f16653v.remove(m24731b6(i, i2));
        } else {
            this.f16653v.putFloat(m24731b6(i, i2), f.floatValue());
        }
    }

    public void m24588t5(boolean z) {
        boolean z2 = C4183a.f14098p && z;
        if (m24894E5(33554432, z2)) {
            m24702f3(z2);
        }
    }

    public List<C4889t> m24587t6() {
        List<C4889t> list = this.f16618A;
        if (list != null) {
            return list;
        }
        int K0 = C7389v0.m16717K0();
        int i = 0;
        C4889t[] tVarArr = {new C4889t(new C4891v(org.thunderdog.challegram.Log.TAG_CRASH, 144)), new C4889t(new C4891v(480, 360)), new C4889t(new C4891v(854, 480)), new C4889t(new C4891v(org.thunderdog.challegram.Log.TAG_CAMERA, 640)), new C4889t(new C4891v(1280, 720), 60), new C4889t(new C4891v(1920, 1080), 60), new C4889t(new C4891v(3840, 2160), 60), new C4889t(new C4891v(7680, 4320), 60)};
        if (K0 <= 0) {
            return Arrays.asList(tVarArr);
        }
        ArrayList arrayList = new ArrayList(8);
        while (true) {
            if (i >= 8) {
                break;
            }
            C4889t tVar = tVarArr[i];
            C4891v vVar = tVar.f16716a;
            int i2 = vVar.f16719a;
            if (i2 > K0) {
                float f = K0 / i2;
                int i3 = (int) (i2 * f);
                int i4 = (int) (vVar.f16720b * f);
                int i5 = i3 - (i3 % 2);
                int i6 = i4 - (i4 % 2);
                if (arrayList.isEmpty() || ((C4889t) arrayList.get(arrayList.size() - 1)).f16716a.f16719a < i5) {
                    arrayList.add(tVar.m24492a(new C4891v(i5, i6)));
                }
            } else {
                arrayList.add(tVar);
                i++;
            }
        }
        this.f16618A = arrayList;
        return arrayList;
    }

    public boolean m24586u(int i) {
        LevelDB levelDB = this.f16653v;
        return levelDB.contains("settings_tdlib_allow_debug" + i);
    }

    public int m24585u0() {
        if (this.f16650s == null) {
            this.f16650s = Integer.valueOf(this.f16653v.getInt("settings_chat_list_mode", 2));
        }
        return this.f16650s.intValue();
    }

    public long m24584u1() {
        long j;
        TimeUnit timeUnit;
        if (Build.VERSION.SDK_INT >= 24) {
            timeUnit = TimeUnit.MINUTES;
            j = 30;
        } else {
            timeUnit = TimeUnit.HOURS;
            j = 1;
        }
        return timeUnit.toSeconds(j);
    }

    public void m24583u2(long j) {
        m24859J5(j | m24821P1());
    }

    public void m24582u3(String str, int i) {
        this.f16653v.putInt(str, i);
    }

    public void m24581u4(int i, String str) {
        if (C5070i.m24062i(str)) {
            LevelDB levelDB = this.f16653v;
            levelDB.remove("theme_wallpaper" + i);
            return;
        }
        LevelDB levelDB2 = this.f16653v;
        levelDB2.putString("theme_wallpaper" + i, str);
    }

    public void m24580u5(C4889t tVar) {
        int[] f = tVar != null ? tVar.m24487f() : null;
        this.f16637f = tVar;
        if (f != null) {
            this.f16653v.m17996H("settings_video_limit", f);
        } else {
            this.f16653v.remove("settings_video_limit");
        }
    }

    public boolean m24578v(long j) {
        return m24633o0("allow_location_" + j, false);
    }

    public int m24577v0() {
        if (this.f16625H == -1) {
            byte l = this.f16653v.m17969l("settings_color_format", (byte) 0);
            this.f16625H = l;
            if (l < 0 || l > 2) {
                this.f16625H = 0;
            }
        }
        return this.f16625H;
    }

    public int m24576v1() {
        return m24780V0("pip_gravity", 53);
    }

    public void m24575v2(TdApi.ChatSource chatSource) {
        int constructor = chatSource.getConstructor();
        if (constructor == -328571244) {
            String str = ((TdApi.ChatSourcePublicServiceAnnouncement) chatSource).type;
            LevelDB levelDB = this.f16653v;
            String str2 = "settings_tutorial_psa";
            if (!C5070i.m24062i(str)) {
                str2 = str2 + str;
            }
            levelDB.m17993K(str2);
        } else if (constructor == 394074115) {
            m24583u2(65536L);
        }
    }

    public void m24574v3(String str, long j, long j2, int i, int i2) {
        LevelDB levelDB = this.f16653v;
        levelDB.m17995I("known_size_for_" + str, new long[]{j, j2, C5063c.m24141f(i, i2)});
    }

    public void m24573v4(String str) {
        if (C5070i.m24062i(str)) {
            this.f16653v.remove("push_device_token");
        } else {
            this.f16653v.putString("push_device_token", str);
        }
    }

    public void m24572v5(int[] iArr) {
        if (iArr != null) {
            this.f16653v.m17996H("proxy_order", iArr);
        } else {
            this.f16653v.remove("proxy_order");
        }
    }

    public void m24571w() {
        this.f16644m.m24512a();
    }

    public int[] m24570w0(int i, int i2) {
        return this.f16653v.m17965p(m24754Y5(i, i2));
    }

    public long m24569w1() {
        return m24712e1("pip", C5063c.m24141f(C4403w.m27986G2() ? -1 : 1, -1));
    }

    public void m24568w2(long j) {
        this.f16655x = j | this.f16655x;
    }

    public void m24567w3(String str, long j) {
        this.f16653v.putLong(str, j);
    }

    public void m24566w4(boolean z, boolean z2) {
        m24887F5(C5063c.m24139h(C5063c.m24139h(m24863J1(), org.thunderdog.challegram.Log.TAG_CAMERA, z), org.thunderdog.challegram.Log.TAG_VOICE, z2));
    }

    public void m24565w5(int i, boolean z) {
        m24558x5(m24891F1(), i, z);
    }

    public final void m24564x(int i, int i2, String str) {
        int i3 = 30;
        if (i2 > 1) {
            i3 = Math.min((int) TimeUnit.MINUTES.toSeconds(5L), ((i2 - 1) * 15) + 30);
        }
        String str2 = "brut_force_seconds";
        if (str != null) {
            str2 = str2 + str;
        }
        this.f16653v.putInt(str2, i3);
        if (str == null) {
            str = "";
        }
        m24789T5(str);
    }

    public C4873e m24563x0(long j, boolean z) {
        char c;
        String str;
        C4873e eVar;
        C4873e eVar2 = null;
        if (j < 0) {
            return null;
        }
        String n2 = m24639n2(j);
        long j2 = 0;
        long j3 = 0;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        boolean z2 = z;
        for (LevelDB.C7052a aVar : this.f16653v.m17974g(n2)) {
            String substring = aVar.m17943l().substring(n2.length());
            substring.hashCode();
            switch (substring.hashCode()) {
                case -838362136:
                    if (substring.equals("uptime")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (substring.equals("id")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 96801:
                    if (substring.equals("app")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 112921:
                    if (substring.equals("rip")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3560141:
                    if (substring.equals("time")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 97513095:
                    if (substring.equals("flags")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    str = n2;
                    long i4 = aVar.m17946i();
                    if (!z2 || i4 <= TimeUnit.MINUTES.toMillis(1L)) {
                        eVar = null;
                        j3 = i4;
                        break;
                    } else {
                        aVar.m17942m();
                        return null;
                    }
                case 1:
                    str = n2;
                    i3 = aVar.m17947h();
                    eVar = null;
                    break;
                case 2:
                    str = n2;
                    i2 = aVar.m17947h();
                    if (z2 && i2 != 1507020) {
                        aVar.m17942m();
                        return eVar2;
                    }
                    eVar = null;
                    break;
                case 3:
                    str = n2;
                    str2 = aVar.m17944k();
                    if (!C5070i.m24062i(str2)) {
                        eVar = eVar2;
                        break;
                    } else {
                        aVar.m17942m();
                        return eVar2;
                    }
                case 4:
                    long i5 = aVar.m17946i();
                    if (z2) {
                        str = n2;
                        if (TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - i5) > 15) {
                            aVar.m17942m();
                            return null;
                        }
                        eVar2 = null;
                    } else {
                        str = n2;
                    }
                    eVar = eVar2;
                    j2 = i5;
                    break;
                case 5:
                    i = aVar.m17947h();
                    if (z2) {
                        if ((i & 1) == 0) {
                            if ((i & 2) != 0) {
                                eVar = eVar2;
                                str = n2;
                                z2 = false;
                                break;
                            }
                        } else {
                            aVar.m17942m();
                            return eVar2;
                        }
                    }
                default:
                    eVar = eVar2;
                    str = n2;
                    break;
            }
            eVar2 = eVar;
            n2 = str;
        }
        C4873e eVar3 = eVar2;
        C4873e eVar4 = new C4873e(j, str2, j2, j3, i, i2, i3);
        return (!z2 || eVar4.m24532c() != 0) ? eVar4 : eVar3;
    }

    public int m24562x1() {
        return m24780V0("player_flags", 2);
    }

    public final void m24561x2() {
        throw new UnsupportedOperationException("Method not decompiled: ge.C4868i.m24561x2():void");
    }

    public void m24560x3(String str, long[] jArr) {
        this.f16653v.m17995I(str, jArr);
    }

    public void m24559x4(boolean z) {
        m24683h6(16, z);
    }

    public final boolean m24558x5(int i, int i2, boolean z) {
        C4880l lVar;
        int i3 = 0;
        if (z == ((i & i2) != 0)) {
            return z;
        }
        int i4 = z ? i | i2 : (~i2) & i;
        if (i2 == 1) {
            if (z) {
                int l0 = m24657l0();
                if (l0 <= 0 || (lVar = m24926A1(l0)) == null) {
                    return false;
                }
                i3 = l0;
            } else {
                lVar = null;
            }
            this.f16653v.m18001C("proxy_settings", (byte) i4);
            if (lVar != null) {
                m24788U(i3, lVar.f16690b, lVar.f16691c, lVar.f16681M, lVar.f16683O, true, false);
            } else {
                m24788U(0, null, 0, null, null, true, false);
            }
        } else {
            this.f16653v.m18001C("proxy_settings", (byte) i4);
        }
        return z;
    }

    public int m24556y0(int i, int i2) {
        try {
            return this.f16653v.m17983U(m24747Z5(i, i2));
        } catch (FileNotFoundException unused) {
            return C11514c0.m347b((int) m24920B0(i, R.id.theme_property_parentTheme), i2);
        }
    }

    public int m24555y1() {
        if (this.f16646o == null) {
            this.f16646o = Integer.valueOf(this.f16653v.getInt("preferred_audio_mode", 0));
        }
        return this.f16646o.intValue();
    }

    public void m24553y3(long j, int i) {
        m24582u3("receiver_" + j, i);
    }

    public void m24552y4(boolean z) {
        m24683h6(64, z);
    }

    public void m24551y5(String str) {
        if (C5070i.m24062i(str)) {
            this.f16653v.remove("settings_language_code_suggested");
        } else {
            this.f16653v.putString("settings_language_code_suggested", str);
        }
    }

    public boolean m24550z(int i) {
        return (m24549z0(i) & 1) == 0;
    }

    public int m24549z0(int i) {
        LevelDB levelDB = this.f16653v;
        return levelDB.m17969l("theme_flags" + i, (byte) 0);
    }

    public C4889t m24548z1() {
        if (this.f16637f == null) {
            this.f16637f = new C4889t(this.f16653v.m17965p("settings_video_limit"));
        }
        return this.f16637f;
    }

    public boolean m24547z2() {
        return m24872I(1);
    }

    public void m24546z3(String str, String str2) {
        this.f16653v.putString(str, str2);
    }

    public void m24545z4(boolean z) {
        if (z) {
            z = false;
        }
        m24894E5(org.thunderdog.challegram.Log.TAG_GIF_LOADER, z);
    }

    public void m24544z5(boolean z) {
        m24894E5(16, z);
    }

    public static class C4891v {
        public final int f16719a;
        public final int f16720b;

        public C4891v(int i, int i2) {
            this.f16719a = Math.max(i, i2);
            this.f16720b = Math.min(i2, i);
        }

        public boolean m24486a() {
            int i = this.f16719a;
            return i == this.f16720b && i == 854;
        }

        public boolean m24485b() {
            int i = this.f16719a;
            return i == this.f16720b && i == -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C4891v vVar = (C4891v) obj;
            return this.f16719a == vVar.f16719a && this.f16720b == vVar.f16720b;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f16719a), Integer.valueOf(this.f16720b));
        }

        public C4891v(int i) {
            this(i, i);
        }
    }

    public static abstract class AbstractC4872d implements Comparable<AbstractC4872d> {
        public String f16661M;
        public int f16662N;
        public TdApi.File f16663O;
        public C6246h f16664P;
        public final String f16665a;
        public int f16666b;
        public int f16667c;

        public AbstractC4872d(String str, int i, String str2, int i2) {
            this.f16662N = -1;
            this.f16665a = str;
            this.f16666b = i;
            this.f16661M = str2;
            this.f16662N = i2;
        }

        public final int compareTo(AbstractC4872d dVar) {
            boolean z = false;
            if (C5070i.m24068c(this.f16665a, dVar.f16665a)) {
                return 0;
            }
            int i = this.f16662N;
            boolean z2 = i != -1;
            int i2 = dVar.f16662N;
            if (i2 != -1) {
                z = true;
            }
            if (z2 != z) {
                return Boolean.compare(z, z2);
            }
            if (z2 && i != i2) {
                return Integer.compare(i, i2);
            }
            if (!C5070i.m24068c(this.f16661M, dVar.f16661M)) {
                return this.f16661M.compareTo(dVar.f16661M);
            }
            return this.f16665a.compareTo(dVar.f16665a);
        }

        public final String m24539b() {
            return this.f16661M;
        }

        public final TdApi.File m24538c() {
            return this.f16663O;
        }

        public abstract int mo24531d(boolean z);

        public final C6246h m24537e() {
            return this.f16664P;
        }

        public boolean equals(Object obj) {
            return (obj instanceof AbstractC4872d) && ((AbstractC4872d) obj).f16665a.equals(this.f16665a);
        }

        public abstract void mo24530f(AbstractC5917i iVar);

        public abstract boolean mo24529g();

        public final boolean m24536h() {
            return mo24529g() || mo24531d(false) == 1;
        }

        public int hashCode() {
            return this.f16665a.hashCode();
        }

        public final void m24535i(AbstractC11073vb vbVar, TdApi.File file) {
            if (file != null) {
                int i = C1357a0.m37544i(64.0f);
                C6246h hVar = new C6246h(vbVar, file);
                this.f16664P = hVar;
                hVar.m20898s0(1);
                this.f16664P.mo20768t0(i);
                return;
            }
            this.f16664P = null;
        }

        public AbstractC4872d(String str) {
            this.f16662N = -1;
            this.f16665a = C7389v0.m16681T0(str);
        }

        public AbstractC4872d(TdApi.Message message, String str, int i) {
            boolean z;
            TdApi.TextEntity[] textEntityArr;
            this.f16662N = -1;
            TdApi.MessageDocument messageDocument = (TdApi.MessageDocument) message.content;
            this.f16665a = C7389v0.m16681T0(messageDocument.document.fileName);
            this.f16667c = Math.max(message.date, message.editDate);
            TdApi.FormattedText formattedText = messageDocument.caption;
            boolean z2 = false;
            if (formattedText == null || (textEntityArr = formattedText.entities) == null || textEntityArr.length <= 0) {
                z = false;
            } else {
                boolean z3 = false;
                z = false;
                for (TdApi.TextEntity textEntity : textEntityArr) {
                    boolean z4 = true;
                    switch (textEntity.type.getConstructor()) {
                        case TdApi.TextEntityTypeHashtag.CONSTRUCTOR:
                            String s1 = C7321e.m16911s1(messageDocument.caption.text, textEntity);
                            if (s1.equals(str)) {
                                z3 = true;
                                break;
                            } else if (!s1.equals("#hide")) {
                                if (!s1.equals("#noname")) {
                                    if (!s1.startsWith("#v")) {
                                        if (s1.startsWith("#p")) {
                                            this.f16662N = C5070i.m24051t(s1.substring(2), -1);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        this.f16666b = C5070i.m24051t(s1.substring(2), -1);
                                        break;
                                    }
                                } else {
                                    z = true;
                                    break;
                                }
                            } else if ((C4184b.f14108a != 1 || !this.f16665a.equals("samsung")) ? false : z4) {
                                break;
                            } else {
                                throw new IllegalArgumentException();
                            }
                            break;
                        case TdApi.TextEntityTypeCode.CONSTRUCTOR:
                        case TdApi.TextEntityTypePreCode.CONSTRUCTOR:
                        case TdApi.TextEntityTypePre.CONSTRUCTOR:
                            this.f16661M = C7321e.m16911s1(messageDocument.caption.text, textEntity);
                            break;
                    }
                }
                z2 = z3;
            }
            if (!z2 || this.f16666b != 4 || this.f16661M == null) {
                throw new IllegalArgumentException();
            }
            this.f16663O = messageDocument.document.document;
            if (mo24529g()) {
                if (z) {
                    this.f16661M = C4403w.m27871i1(i);
                }
                this.f16663O = null;
            }
        }
    }
}
