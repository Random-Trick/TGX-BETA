package p350yd;

import android.os.Build;
import android.os.SystemClock;
import be.C1363c0;
import gd.C4587b;
import gd.C4779t2;
import ge.C4868i;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import me.vkryl.leveldb.LevelDB;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.drinkmore.Tracer;
import org.thunderdog.challegram.Log;
import p108hb.C5063c;
import p108hb.C5070i;
import p156kd.C6246h;
import p156kd.C6250i;
import vc.C9903a;

public class C11131y6 implements Comparable<C11131y6>, AbstractC11073vb {
    public long f35695M;
    public long f35696N;
    public int f35697O;
    public C10930q6 f35698P;
    public final Object f35699Q;
    public long f35700R;
    public final AtomicBoolean f35701S;
    public C6246h f35702T;
    public C6246h f35703U;
    public C11132a f35704V;
    public final Map<String, C10562b9> f35705W;
    public final C11164z6 f35706X;
    public final C10536ab f35707a;
    public final int f35708b;
    public int f35709c;

    public C11131y6(C10536ab abVar, int i, boolean z) {
        this.f35699Q = new Object();
        this.f35701S = new AtomicBoolean(false);
        this.f35705W = new HashMap();
        this.f35706X = new C11164z6();
        this.f35707a = abVar;
        this.f35708b = i;
        this.f35697O = -1;
        this.f35696N = System.currentTimeMillis();
        this.f35709c = 1;
        if (z) {
            this.f35709c = 1 | 2;
            C4868i.m24727c2().m24717d4(i, true);
        }
    }

    public boolean m1510A() {
        return !C5063c.m24145b(this.f35709c, 64);
    }

    public boolean m1509B(boolean z) {
        boolean z2;
        synchronized (this.f35699Q) {
            C10930q6 q6Var = this.f35698P;
            z2 = q6Var != null && (!z || !q6Var.m2522b7());
        }
        return z2;
    }

    public boolean m1508C() {
        return C5063c.m24145b(this.f35709c, 8);
    }

    public boolean m1507D() {
        return (m1451y() == null && m1460p() == null) ? false : true;
    }

    public final boolean m1506E() {
        C11132a aVar;
        if (this.f35695M == 0 || (aVar = this.f35704V) == null || aVar.f35711b != this.f35695M) {
            LevelDB n3 = C4868i.m24727c2().m24638n3();
            if (n3.getLong(C4868i.m24674j(this.f35708b) + "", 0L) != this.f35695M) {
                return false;
            }
        }
        return true;
    }

    public boolean m1505F() {
        return !C5063c.m24145b(this.f35709c, Log.TAG_CRASH);
    }

    public boolean m1504G() {
        return C5063c.m24145b(this.f35709c, 2) && C4868i.m24727c2().m24586u(this.f35708b);
    }

    public boolean m1503H() {
        return C5063c.m24145b(this.f35709c, 16);
    }

    public boolean m1502I() {
        return C5063c.m24145b(this.f35709c, 32);
    }

    public boolean m1501J(C11131y6 y6Var) {
        return this.f35708b == y6Var.f35708b;
    }

    public boolean m1500K() {
        return C5063c.m24145b(this.f35709c, 1);
    }

    public boolean m1499L() {
        if (m1502I()) {
            return true;
        }
        if (m1500K()) {
            return false;
        }
        return !C5063c.m24145b(this.f35709c, 4) || m1508C() || !m1506E();
    }

    public long m1498M() {
        if (this == this.f35707a.m4681k0()) {
            return Long.MAX_VALUE;
        }
        return this.f35700R;
    }

    public boolean m1497N(boolean z) {
        if (!z && !m1499L()) {
            return false;
        }
        mo1480c();
        return true;
    }

    public void m1496O() {
        this.f35700R = SystemClock.uptimeMillis();
        this.f35707a.m4673m1(this);
    }

    public boolean m1495P(Client client) {
        synchronized (this.f35699Q) {
            C10930q6 q6Var = this.f35698P;
            if (q6Var == null) {
                return false;
            }
            return q6Var.m2924Ba(client);
        }
    }

    public final void m1494Q(RandomAccessFile randomAccessFile, int i) {
        this.f35709c = randomAccessFile.readByte();
        this.f35695M = i == 2 ? randomAccessFile.readLong() : randomAccessFile.readInt();
        this.f35696N = randomAccessFile.readLong();
        this.f35697O = randomAccessFile.readInt();
        Log.m14721i((int) Log.TAG_ACCOUNTS, "restored accountId:%d flags:%d userId:%d time:%d order:%d", Integer.valueOf(this.f35708b), Integer.valueOf(this.f35709c), Long.valueOf(this.f35695M), Long.valueOf(this.f35696N), Integer.valueOf(this.f35697O));
    }

    public void m1493R(RandomAccessFile randomAccessFile) {
        randomAccessFile.write(this.f35709c);
        randomAccessFile.writeLong(this.f35695M);
        randomAccessFile.writeLong(this.f35696N);
        randomAccessFile.writeInt(this.f35697O);
    }

    public int m1492S(RandomAccessFile randomAccessFile, int i) {
        randomAccessFile.seek(i);
        randomAccessFile.write(this.f35709c);
        return i + 21;
    }

    public int m1491T(RandomAccessFile randomAccessFile, int i) {
        randomAccessFile.seek(i + 17);
        randomAccessFile.writeInt(this.f35697O);
        return i + 21;
    }

    public boolean m1490U(boolean z) {
        return m1476e(16, z);
    }

    public final boolean m1489V(int i) {
        if (this.f35709c == i) {
            return false;
        }
        this.f35709c = i;
        return true;
    }

    public boolean m1488W(boolean z) {
        return m1476e(Log.TAG_YOUTUBE, !z);
    }

    public boolean m1487X(boolean z) {
        return m1476e(8, z);
    }

    public boolean m1486Y(boolean z) {
        return m1476e(Log.TAG_CRASH, !z);
    }

    public boolean m1485Z(boolean z) {
        if (!m1476e(2, z)) {
            return false;
        }
        C4868i.m24727c2().m24717d4(this.f35708b, z);
        if (!m1509B(false)) {
            return true;
        }
        this.f35698P.m2578Xb(m1504G());
        return true;
    }

    @Override
    public int mo1484a() {
        return this.f35708b;
    }

    public boolean m1483a0(boolean z) {
        return m1476e(4, !z);
    }

    public boolean m1482b() {
        if (m1502I()) {
            return false;
        }
        if (C4868i.m24727c2().m24893F(8)) {
            return this.f35707a.m4632x2() == mo1484a();
        }
        if (C4868i.m24727c2().m24893F(16)) {
            return m1464l();
        }
        return true;
    }

    public boolean m1481b0(long j) {
        if (this.f35695M == j) {
            return false;
        }
        this.f35695M = j;
        return true;
    }

    @Override
    public C10930q6 mo1480c() {
        boolean z = true;
        boolean z2 = this.f35698P != null;
        if (!z2) {
            synchronized (this.f35699Q) {
                if (this.f35698P == null) {
                    m1466j();
                    z = z2;
                }
            }
            z2 = z;
        }
        if (z2) {
            this.f35698P.m2728Ne();
        }
        return this.f35698P;
    }

    public boolean m1479c0(boolean z) {
        return m1476e(32, z);
    }

    public boolean m1478d() {
        return m1509B(true);
    }

    public boolean m1477d0(int i) {
        if (this.f35697O == i) {
            return false;
        }
        this.f35697O = i;
        return true;
    }

    public final boolean m1476e(int i, boolean z) {
        return m1489V(C5063c.m24139h(this.f35709c, i, z));
    }

    public boolean m1475e0(boolean z, long j) {
        boolean z2 = true;
        boolean e = m1476e(1, z);
        if (e) {
            this.f35696N = System.currentTimeMillis();
        }
        if (z) {
            boolean z3 = m1481b0(0L) || e;
            if (!m1477d0(-1) && !z3) {
                z2 = false;
            }
            m1465k();
            return z2;
        }
        return m1476e(64, false) || (m1481b0(j) || e);
    }

    public void m1474f(Runnable runnable) {
        synchronized (this.f35699Q) {
            C10930q6 q6Var = this.f35698P;
            if (q6Var == null || q6Var.m2522b7()) {
                C7389v0.m16743D2(runnable);
            } else {
                this.f35698P.m2908Ca(runnable);
            }
        }
    }

    public void m1473f0(TdApi.ChatList chatList, C10562b9 b9Var, boolean z) {
        String str;
        String o4 = C4779t2.m25457o4(chatList);
        C10562b9 b9Var2 = this.f35705W.get(o4);
        if (b9Var2 == null) {
            b9Var2 = new C10562b9(b9Var);
            this.f35705W.put(o4, b9Var2);
        } else {
            b9Var2.m4534b(b9Var);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C4868i.m24674j(this.f35708b));
        sb2.append("counter_");
        if (chatList instanceof TdApi.ChatListMain) {
            str = "";
        } else {
            str = o4 + "_";
        }
        sb2.append(str);
        b9Var2.m4532d(sb2.toString(), z);
    }

    public boolean m1472g(String str) {
        return C5070i.m24068c(m1454v(), str);
    }

    public void m1471g0(TdApi.User user) {
        this.f35703U = null;
        this.f35702T = null;
        if (user == null || user.f25442id != this.f35695M) {
            m1465k();
            this.f35705W.clear();
            return;
        }
        String j = C4868i.m24674j(this.f35708b);
        this.f35704V = new C11132a(j, this.f35708b, user, C4868i.m24727c2().m24712e1(j, 0L) == user.f25442id);
    }

    public final int compareTo(C11131y6 y6Var) {
        int i = this.f35697O;
        int i2 = y6Var.f35697O;
        if (i != i2) {
            if (i == -1) {
                i = Integer.MAX_VALUE;
            }
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            return Integer.compare(i, i2);
        }
        long j = this.f35696N;
        long j2 = y6Var.f35696N;
        if (j != j2) {
            return Long.compare(j, j2);
        }
        return Integer.compare(this.f35708b, y6Var.f35708b);
    }

    public void m1469h0(boolean z, String str) {
        C11132a aVar = this.f35704V;
        if (aVar != null) {
            aVar.m1439k(z, str);
        } else {
            C11132a.m1440j(this.f35708b, z, str);
        }
    }

    public C10536ab m1468i() {
        return this.f35707a;
    }

    public C10930q6 m1467i0() {
        synchronized (this.f35699Q) {
            if (this.f35698P == null) {
                m1466j();
            }
        }
        return this.f35698P;
    }

    public final void m1466j() {
        if (!this.f35701S.getAndSet(true)) {
            Throwable th = null;
            try {
                this.f35698P = new C10930q6(this, m1504G());
            } finally {
                th = th;
                try {
                    throw th;
                } finally {
                }
            }
            if (th != null) {
                Tracer.m14774f(th);
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    public final void m1465k() {
        C4868i.m24727c2().m24875H3(C4868i.m24674j(this.f35708b), null);
        this.f35704V = null;
    }

    public boolean m1464l() {
        return !C5063c.m24145b(this.f35709c, Log.TAG_YOUTUBE);
    }

    public C6246h m1463m(boolean z) {
        C11132a p = m1460p();
        C6246h hVar = null;
        String f = p != null ? p.m1444f(z) : null;
        if (!C5070i.m24062i(f)) {
            hVar = z ? this.f35703U : this.f35702T;
            if (!(hVar instanceof C6250i) || !C5070i.m24068c(((C6250i) hVar).m20885D0(), f)) {
                hVar = new C6250i(f);
                if (!z) {
                    hVar.mo20768t0(C9903a.getDefaultAvatarCacheSize());
                }
                if (z) {
                    this.f35703U = hVar;
                } else {
                    this.f35702T = hVar;
                }
            }
        }
        return hVar;
    }

    public C4587b.C4588a m1462n() {
        TdApi.User y = m1451y();
        if (y != null) {
            return this.f35698P.m2480e2().m1701P2(y, false);
        }
        C11132a p = m1460p();
        if (p != null) {
            long j = this.f35695M;
            return new C4587b.C4588a(C4779t2.m25682H0(j, j), C4779t2.m25716C1(p.m1447c(), p.m1446d()));
        }
        long j2 = this.f35695M;
        if (j2 != 0) {
            return new C4587b.C4588a(C4779t2.m25682H0(j2, j2));
        }
        return null;
    }

    public C10562b9 m1461o(TdApi.ChatList chatList) {
        String str;
        String o4 = C4779t2.m25457o4(chatList);
        C10562b9 b9Var = this.f35705W.get(o4);
        if (b9Var == null) {
            b9Var = new C10562b9();
            this.f35705W.put(o4, b9Var);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C4868i.m24674j(this.f35708b));
            sb2.append("counter_");
            if (chatList instanceof TdApi.ChatListMain) {
                str = "";
            } else {
                str = o4 + "_";
            }
            sb2.append(str);
            b9Var.m4533c(sb2.toString());
        }
        return b9Var;
    }

    public C11132a m1460p() {
        if (this.f35695M == 0) {
            return null;
        }
        C11132a aVar = this.f35704V;
        if (aVar != null && aVar.f35711b == this.f35695M) {
            return this.f35704V;
        }
        C11132a b = C11132a.m1448b(C4868i.m24674j(this.f35708b), this.f35695M);
        this.f35704V = b;
        return b;
    }

    public String m1459q() {
        TdApi.User y = m1451y();
        if (y != null) {
            return y.firstName;
        }
        C11132a p = m1460p();
        return p != null ? p.m1447c() : "User";
    }

    public long m1458r() {
        return this.f35695M;
    }

    public String m1457s() {
        TdApi.User y = m1451y();
        if (y != null) {
            return y.lastName;
        }
        C11132a p = m1460p();
        if (p != null) {
            return p.m1446d();
        }
        return "#" + this.f35695M;
    }

    public String m1456t() {
        String str;
        String str2;
        String str3;
        String str4;
        TdApi.User y = m1451y();
        if (y != null) {
            str3 = y.firstName;
            str2 = y.lastName;
            str = y.username;
            str4 = y.phoneNumber;
        } else {
            C11132a p = m1460p();
            if (p == null) {
                return null;
            }
            str3 = p.m1447c();
            str2 = p.m1446d();
            str = p.m1442h();
            str4 = p.m1445e();
        }
        String q2 = C4779t2.m25445q2(str3, str2);
        if (this.f35707a.m4700f1(str3, str2, this.f35708b) == -1) {
            return q2;
        }
        if (!C5070i.m24062i(str)) {
            return q2 + " (@" + str + ")";
        }
        return q2 + " (" + C1363c0.m37413w(str4) + ")";
    }

    public String m1455u() {
        TdApi.User y = m1451y();
        if (y != null) {
            return C4779t2.m25438r2(y);
        }
        C11132a p = m1460p();
        if (p != null) {
            return C4779t2.m25445q2(p.m1447c(), p.m1446d());
        }
        return "User #" + this.f35695M;
    }

    public String m1454v() {
        TdApi.User y = m1451y();
        if (y != null) {
            return y.phoneNumber;
        }
        C11132a p = m1460p();
        return p != null ? p.m1445e() : "…";
    }

    public String m1453w() {
        String str;
        String str2;
        String str3;
        String str4;
        TdApi.User Z9 = mo1480c().m2550Z9();
        if (Z9 != null) {
            str3 = Z9.username;
            str2 = Z9.firstName;
            str = Z9.lastName;
            str4 = Z9.phoneNumber;
        } else {
            C11132a p = m1460p();
            if (p == null) {
                return null;
            }
            str3 = p.m1442h();
            str2 = p.m1447c();
            str = p.m1446d();
            str4 = p.m1445e();
        }
        if (!C5070i.m24062i(str3)) {
            return "@" + str3;
        } else if (this.f35707a.m4704e1(str2, this.f35708b) == -1) {
            return (Build.VERSION.SDK_INT < 24 || str2.length() >= 12 || C5070i.m24062i(str)) ? str2 : C4779t2.m25445q2(str2, str);
        } else {
            if (!C5070i.m24062i(str)) {
                return C4779t2.m25445q2(str2, str);
            }
            return str2 + " " + C1363c0.m37413w(str4);
        }
    }

    public C11164z6 m1452x() {
        this.f35706X.m1325e(this);
        return this.f35706X;
    }

    public TdApi.User m1451y() {
        if (m1478d()) {
            return mo1480c().m2550Z9();
        }
        return null;
    }

    public boolean m1450z() {
        if (!m1509B(true) || mo1480c().m2550Z9() == null) {
            return m1506E();
        }
        return true;
    }

    public static class C11132a {
        public final String f35710a;
        public long f35711b;
        public String f35712c;
        public String f35713d;
        public String f35714e;
        public String f35715f;
        public String f35716g;
        public String f35717h;

        public C11132a(String str) {
            this.f35710a = str;
        }

        public static C11132a m1448b(String str, long j) {
            C11132a aVar = null;
            for (LevelDB.C7052a aVar2 : C4868i.m24727c2().m24638n3().m17974g(str)) {
                if (aVar == null) {
                    aVar = new C11132a(str);
                }
                String substring = aVar2.m17943l().substring(str.length());
                substring.hashCode();
                char c = 65535;
                switch (substring.hashCode()) {
                    case -507990916:
                        if (substring.equals("photo_full")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 0:
                        if (substring.equals("")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 104584966:
                        if (substring.equals("name1")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 104584967:
                        if (substring.equals("name2")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 106642798:
                        if (substring.equals("phone")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 106642994:
                        if (substring.equals("photo")) {
                            c = 5;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        aVar.f35717h = aVar2.m17944k();
                        break;
                    case 1:
                        long i = aVar2.m17946i();
                        aVar.f35711b = i;
                        if (i == j) {
                            break;
                        } else {
                            return null;
                        }
                    case 2:
                        aVar.f35712c = aVar2.m17944k();
                        break;
                    case 3:
                        aVar.f35713d = aVar2.m17944k();
                        break;
                    case 4:
                        aVar.f35715f = aVar2.m17944k();
                        break;
                    case 5:
                        aVar.f35716g = aVar2.m17944k();
                        break;
                }
            }
            if (aVar == null || aVar.f35711b != j) {
                return null;
            }
            return aVar;
        }

        public static String m1443g(int i, boolean z) {
            String str;
            if (z) {
                str = C4868i.m24674j(i) + "photo_full";
            } else {
                str = C4868i.m24674j(i) + "photo";
            }
            return C4868i.m24727c2().m24849L1(str, null);
        }

        public static void m1440j(int i, boolean z, String str) {
            String str2;
            if (z) {
                str2 = C4868i.m24674j(i) + "photo_full";
            } else {
                str2 = C4868i.m24674j(i) + "photo";
            }
            if (C5070i.m24062i(str)) {
                C4868i.m24727c2().m24889F3(str2);
            } else {
                C4868i.m24727c2().m24546z3(str2, str);
            }
        }

        public String m1447c() {
            return this.f35712c;
        }

        public String m1446d() {
            return this.f35713d;
        }

        public String m1445e() {
            return this.f35715f;
        }

        public String m1444f(boolean z) {
            return z ? this.f35717h : this.f35716g;
        }

        public String m1442h() {
            return this.f35714e;
        }

        public final void m1441i() {
            LevelDB W = C4868i.m24727c2().m24774W();
            W.putLong(this.f35710a + "", this.f35711b);
            W.putString(this.f35710a + "name1", this.f35712c);
            W.putString(this.f35710a + "name2", this.f35713d);
            W.putString(this.f35710a + "username", this.f35714e);
            W.putString(this.f35710a + "phone", this.f35715f);
            if (!C5070i.m24062i(this.f35716g)) {
                W.putString(this.f35710a + "photo", this.f35716g);
            } else {
                W.remove(this.f35710a + "photo");
            }
            if (!C5070i.m24062i(this.f35717h)) {
                W.putString(this.f35710a + "photo_full", this.f35717h);
            } else {
                W.remove(this.f35710a + "photo_full");
            }
            W.apply();
        }

        public void m1439k(boolean z, String str) {
            String str2;
            if (z) {
                this.f35717h = str;
                str2 = this.f35710a + "photo_full";
            } else {
                this.f35716g = str;
                str2 = this.f35710a + "photo";
            }
            if (C5070i.m24062i(str)) {
                C4868i.m24727c2().m24889F3(str2);
            } else {
                C4868i.m24727c2().m24546z3(str2, str);
            }
        }

        public C11132a(String str, int i, TdApi.User user, boolean z) {
            this.f35710a = str;
            this.f35711b = user.f25442id;
            this.f35712c = user.firstName;
            this.f35713d = user.lastName;
            this.f35714e = user.username;
            this.f35715f = user.phoneNumber;
            TdApi.ProfilePhoto profilePhoto = user.profilePhoto;
            String str2 = null;
            if (profilePhoto != null) {
                this.f35716g = C4779t2.m25599T2(profilePhoto.small) ? user.profilePhoto.small.local.path : z ? m1443g(i, false) : null;
                if (C4779t2.m25599T2(user.profilePhoto.big)) {
                    str2 = user.profilePhoto.big.local.path;
                } else if (z) {
                    str2 = m1443g(i, true);
                }
                this.f35717h = str2;
            } else {
                this.f35717h = null;
                this.f35716g = null;
            }
            m1441i();
        }
    }

    public C11131y6(C10536ab abVar, int i, RandomAccessFile randomAccessFile, int i2) {
        this.f35699Q = new Object();
        this.f35701S = new AtomicBoolean(false);
        this.f35705W = new HashMap();
        this.f35706X = new C11164z6();
        this.f35707a = abVar;
        this.f35708b = i;
        m1494Q(randomAccessFile, i2);
    }
}
