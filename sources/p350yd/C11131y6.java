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
    public long f35692M;
    public long f35693N;
    public int f35694O;
    public C10930q6 f35695P;
    public final Object f35696Q;
    public long f35697R;
    public final AtomicBoolean f35698S;
    public C6246h f35699T;
    public C6246h f35700U;
    public C11132a f35701V;
    public final Map<String, C10562b9> f35702W;
    public final C11164z6 f35703X;
    public final C10536ab f35704a;
    public final int f35705b;
    public int f35706c;

    public C11131y6(C10536ab abVar, int i, boolean z) {
        this.f35696Q = new Object();
        this.f35698S = new AtomicBoolean(false);
        this.f35702W = new HashMap();
        this.f35703X = new C11164z6();
        this.f35704a = abVar;
        this.f35705b = i;
        this.f35694O = -1;
        this.f35693N = System.currentTimeMillis();
        this.f35706c = 1;
        if (z) {
            this.f35706c = 1 | 2;
            C4868i.m24726c2().m24716d4(i, true);
        }
    }

    public boolean m1510A() {
        return !C5063c.m24144b(this.f35706c, 64);
    }

    public boolean m1509B(boolean z) {
        boolean z2;
        synchronized (this.f35696Q) {
            C10930q6 q6Var = this.f35695P;
            z2 = q6Var != null && (!z || !q6Var.m2522b7());
        }
        return z2;
    }

    public boolean m1508C() {
        return C5063c.m24144b(this.f35706c, 8);
    }

    public boolean m1507D() {
        return (m1451y() == null && m1460p() == null) ? false : true;
    }

    public final boolean m1506E() {
        C11132a aVar;
        if (this.f35692M == 0 || (aVar = this.f35701V) == null || aVar.f35708b != this.f35692M) {
            LevelDB n3 = C4868i.m24726c2().m24637n3();
            if (n3.getLong(C4868i.m24673j(this.f35705b) + "", 0L) != this.f35692M) {
                return false;
            }
        }
        return true;
    }

    public boolean m1505F() {
        return !C5063c.m24144b(this.f35706c, Log.TAG_CRASH);
    }

    public boolean m1504G() {
        return C5063c.m24144b(this.f35706c, 2) && C4868i.m24726c2().m24585u(this.f35705b);
    }

    public boolean m1503H() {
        return C5063c.m24144b(this.f35706c, 16);
    }

    public boolean m1502I() {
        return C5063c.m24144b(this.f35706c, 32);
    }

    public boolean m1501J(C11131y6 y6Var) {
        return this.f35705b == y6Var.f35705b;
    }

    public boolean m1500K() {
        return C5063c.m24144b(this.f35706c, 1);
    }

    public boolean m1499L() {
        if (m1502I()) {
            return true;
        }
        if (m1500K()) {
            return false;
        }
        return !C5063c.m24144b(this.f35706c, 4) || m1508C() || !m1506E();
    }

    public long m1498M() {
        if (this == this.f35704a.m4681k0()) {
            return Long.MAX_VALUE;
        }
        return this.f35697R;
    }

    public boolean m1497N(boolean z) {
        if (!z && !m1499L()) {
            return false;
        }
        mo1480c();
        return true;
    }

    public void m1496O() {
        this.f35697R = SystemClock.uptimeMillis();
        this.f35704a.m4673m1(this);
    }

    public boolean m1495P(Client client) {
        synchronized (this.f35696Q) {
            C10930q6 q6Var = this.f35695P;
            if (q6Var == null) {
                return false;
            }
            return q6Var.m2924Ba(client);
        }
    }

    public final void m1494Q(RandomAccessFile randomAccessFile, int i) {
        this.f35706c = randomAccessFile.readByte();
        this.f35692M = i == 2 ? randomAccessFile.readLong() : randomAccessFile.readInt();
        this.f35693N = randomAccessFile.readLong();
        this.f35694O = randomAccessFile.readInt();
        Log.m14721i((int) Log.TAG_ACCOUNTS, "restored accountId:%d flags:%d userId:%d time:%d order:%d", Integer.valueOf(this.f35705b), Integer.valueOf(this.f35706c), Long.valueOf(this.f35692M), Long.valueOf(this.f35693N), Integer.valueOf(this.f35694O));
    }

    public void m1493R(RandomAccessFile randomAccessFile) {
        randomAccessFile.write(this.f35706c);
        randomAccessFile.writeLong(this.f35692M);
        randomAccessFile.writeLong(this.f35693N);
        randomAccessFile.writeInt(this.f35694O);
    }

    public int m1492S(RandomAccessFile randomAccessFile, int i) {
        randomAccessFile.seek(i);
        randomAccessFile.write(this.f35706c);
        return i + 21;
    }

    public int m1491T(RandomAccessFile randomAccessFile, int i) {
        randomAccessFile.seek(i + 17);
        randomAccessFile.writeInt(this.f35694O);
        return i + 21;
    }

    public boolean m1490U(boolean z) {
        return m1476e(16, z);
    }

    public final boolean m1489V(int i) {
        if (this.f35706c == i) {
            return false;
        }
        this.f35706c = i;
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
        C4868i.m24726c2().m24716d4(this.f35705b, z);
        if (!m1509B(false)) {
            return true;
        }
        this.f35695P.m2578Xb(m1504G());
        return true;
    }

    @Override
    public int mo1484a() {
        return this.f35705b;
    }

    public boolean m1483a0(boolean z) {
        return m1476e(4, !z);
    }

    public boolean m1482b() {
        if (m1502I()) {
            return false;
        }
        if (C4868i.m24726c2().m24892F(8)) {
            return this.f35704a.m4632x2() == mo1484a();
        }
        if (C4868i.m24726c2().m24892F(16)) {
            return m1464l();
        }
        return true;
    }

    public boolean m1481b0(long j) {
        if (this.f35692M == j) {
            return false;
        }
        this.f35692M = j;
        return true;
    }

    @Override
    public C10930q6 mo1480c() {
        boolean z = true;
        boolean z2 = this.f35695P != null;
        if (!z2) {
            synchronized (this.f35696Q) {
                if (this.f35695P == null) {
                    m1466j();
                    z = z2;
                }
            }
            z2 = z;
        }
        if (z2) {
            this.f35695P.m2728Ne();
        }
        return this.f35695P;
    }

    public boolean m1479c0(boolean z) {
        return m1476e(32, z);
    }

    public boolean m1478d() {
        return m1509B(true);
    }

    public boolean m1477d0(int i) {
        if (this.f35694O == i) {
            return false;
        }
        this.f35694O = i;
        return true;
    }

    public final boolean m1476e(int i, boolean z) {
        return m1489V(C5063c.m24138h(this.f35706c, i, z));
    }

    public boolean m1475e0(boolean z, long j) {
        boolean z2 = true;
        boolean e = m1476e(1, z);
        if (e) {
            this.f35693N = System.currentTimeMillis();
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
        synchronized (this.f35696Q) {
            C10930q6 q6Var = this.f35695P;
            if (q6Var == null || q6Var.m2522b7()) {
                C7389v0.m16743D2(runnable);
            } else {
                this.f35695P.m2908Ca(runnable);
            }
        }
    }

    public void m1473f0(TdApi.ChatList chatList, C10562b9 b9Var, boolean z) {
        String str;
        String o4 = C4779t2.m25456o4(chatList);
        C10562b9 b9Var2 = this.f35702W.get(o4);
        if (b9Var2 == null) {
            b9Var2 = new C10562b9(b9Var);
            this.f35702W.put(o4, b9Var2);
        } else {
            b9Var2.m4534b(b9Var);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C4868i.m24673j(this.f35705b));
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
        return C5070i.m24067c(m1454v(), str);
    }

    public void m1471g0(TdApi.User user) {
        this.f35700U = null;
        this.f35699T = null;
        if (user == null || user.f25439id != this.f35692M) {
            m1465k();
            this.f35702W.clear();
            return;
        }
        String j = C4868i.m24673j(this.f35705b);
        this.f35701V = new C11132a(j, this.f35705b, user, C4868i.m24726c2().m24711e1(j, 0L) == user.f25439id);
    }

    public final int compareTo(C11131y6 y6Var) {
        int i = this.f35694O;
        int i2 = y6Var.f35694O;
        if (i != i2) {
            if (i == -1) {
                i = Integer.MAX_VALUE;
            }
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            return Integer.compare(i, i2);
        }
        long j = this.f35693N;
        long j2 = y6Var.f35693N;
        if (j != j2) {
            return Long.compare(j, j2);
        }
        return Integer.compare(this.f35705b, y6Var.f35705b);
    }

    public void m1469h0(boolean z, String str) {
        C11132a aVar = this.f35701V;
        if (aVar != null) {
            aVar.m1439k(z, str);
        } else {
            C11132a.m1440j(this.f35705b, z, str);
        }
    }

    public C10536ab m1468i() {
        return this.f35704a;
    }

    public C10930q6 m1467i0() {
        synchronized (this.f35696Q) {
            if (this.f35695P == null) {
                m1466j();
            }
        }
        return this.f35695P;
    }

    public final void m1466j() {
        if (!this.f35698S.getAndSet(true)) {
            Throwable th = null;
            try {
                this.f35695P = new C10930q6(this, m1504G());
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
        C4868i.m24726c2().m24874H3(C4868i.m24673j(this.f35705b), null);
        this.f35701V = null;
    }

    public boolean m1464l() {
        return !C5063c.m24144b(this.f35706c, Log.TAG_YOUTUBE);
    }

    public C6246h m1463m(boolean z) {
        C11132a p = m1460p();
        C6246h hVar = null;
        String f = p != null ? p.m1444f(z) : null;
        if (!C5070i.m24061i(f)) {
            hVar = z ? this.f35700U : this.f35699T;
            if (!(hVar instanceof C6250i) || !C5070i.m24067c(((C6250i) hVar).m20884D0(), f)) {
                hVar = new C6250i(f);
                if (!z) {
                    hVar.mo20767t0(C9903a.getDefaultAvatarCacheSize());
                }
                if (z) {
                    this.f35700U = hVar;
                } else {
                    this.f35699T = hVar;
                }
            }
        }
        return hVar;
    }

    public C4587b.C4588a m1462n() {
        TdApi.User y = m1451y();
        if (y != null) {
            return this.f35695P.m2480e2().m1701P2(y, false);
        }
        C11132a p = m1460p();
        if (p != null) {
            long j = this.f35692M;
            return new C4587b.C4588a(C4779t2.m25681H0(j, j), C4779t2.m25715C1(p.m1447c(), p.m1446d()));
        }
        long j2 = this.f35692M;
        if (j2 != 0) {
            return new C4587b.C4588a(C4779t2.m25681H0(j2, j2));
        }
        return null;
    }

    public C10562b9 m1461o(TdApi.ChatList chatList) {
        String str;
        String o4 = C4779t2.m25456o4(chatList);
        C10562b9 b9Var = this.f35702W.get(o4);
        if (b9Var == null) {
            b9Var = new C10562b9();
            this.f35702W.put(o4, b9Var);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C4868i.m24673j(this.f35705b));
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
        if (this.f35692M == 0) {
            return null;
        }
        C11132a aVar = this.f35701V;
        if (aVar != null && aVar.f35708b == this.f35692M) {
            return this.f35701V;
        }
        C11132a b = C11132a.m1448b(C4868i.m24673j(this.f35705b), this.f35692M);
        this.f35701V = b;
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
        return this.f35692M;
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
        return "#" + this.f35692M;
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
        String q2 = C4779t2.m25444q2(str3, str2);
        if (this.f35704a.m4700f1(str3, str2, this.f35705b) == -1) {
            return q2;
        }
        if (!C5070i.m24061i(str)) {
            return q2 + " (@" + str + ")";
        }
        return q2 + " (" + C1363c0.m37410w(str4) + ")";
    }

    public String m1455u() {
        TdApi.User y = m1451y();
        if (y != null) {
            return C4779t2.m25437r2(y);
        }
        C11132a p = m1460p();
        if (p != null) {
            return C4779t2.m25444q2(p.m1447c(), p.m1446d());
        }
        return "User #" + this.f35692M;
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
        if (!C5070i.m24061i(str3)) {
            return "@" + str3;
        } else if (this.f35704a.m4704e1(str2, this.f35705b) == -1) {
            return (Build.VERSION.SDK_INT < 24 || str2.length() >= 12 || C5070i.m24061i(str)) ? str2 : C4779t2.m25444q2(str2, str);
        } else {
            if (!C5070i.m24061i(str)) {
                return C4779t2.m25444q2(str2, str);
            }
            return str2 + " " + C1363c0.m37410w(str4);
        }
    }

    public C11164z6 m1452x() {
        this.f35703X.m1325e(this);
        return this.f35703X;
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
        public final String f35707a;
        public long f35708b;
        public String f35709c;
        public String f35710d;
        public String f35711e;
        public String f35712f;
        public String f35713g;
        public String f35714h;

        public C11132a(String str) {
            this.f35707a = str;
        }

        public static C11132a m1448b(String str, long j) {
            C11132a aVar = null;
            for (LevelDB.C7052a aVar2 : C4868i.m24726c2().m24637n3().m17974g(str)) {
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
                        aVar.f35714h = aVar2.m17944k();
                        break;
                    case 1:
                        long i = aVar2.m17946i();
                        aVar.f35708b = i;
                        if (i == j) {
                            break;
                        } else {
                            return null;
                        }
                    case 2:
                        aVar.f35709c = aVar2.m17944k();
                        break;
                    case 3:
                        aVar.f35710d = aVar2.m17944k();
                        break;
                    case 4:
                        aVar.f35712f = aVar2.m17944k();
                        break;
                    case 5:
                        aVar.f35713g = aVar2.m17944k();
                        break;
                }
            }
            if (aVar == null || aVar.f35708b != j) {
                return null;
            }
            return aVar;
        }

        public static String m1443g(int i, boolean z) {
            String str;
            if (z) {
                str = C4868i.m24673j(i) + "photo_full";
            } else {
                str = C4868i.m24673j(i) + "photo";
            }
            return C4868i.m24726c2().m24848L1(str, null);
        }

        public static void m1440j(int i, boolean z, String str) {
            String str2;
            if (z) {
                str2 = C4868i.m24673j(i) + "photo_full";
            } else {
                str2 = C4868i.m24673j(i) + "photo";
            }
            if (C5070i.m24061i(str)) {
                C4868i.m24726c2().m24888F3(str2);
            } else {
                C4868i.m24726c2().m24545z3(str2, str);
            }
        }

        public String m1447c() {
            return this.f35709c;
        }

        public String m1446d() {
            return this.f35710d;
        }

        public String m1445e() {
            return this.f35712f;
        }

        public String m1444f(boolean z) {
            return z ? this.f35714h : this.f35713g;
        }

        public String m1442h() {
            return this.f35711e;
        }

        public final void m1441i() {
            LevelDB W = C4868i.m24726c2().m24773W();
            W.putLong(this.f35707a + "", this.f35708b);
            W.putString(this.f35707a + "name1", this.f35709c);
            W.putString(this.f35707a + "name2", this.f35710d);
            W.putString(this.f35707a + "username", this.f35711e);
            W.putString(this.f35707a + "phone", this.f35712f);
            if (!C5070i.m24061i(this.f35713g)) {
                W.putString(this.f35707a + "photo", this.f35713g);
            } else {
                W.remove(this.f35707a + "photo");
            }
            if (!C5070i.m24061i(this.f35714h)) {
                W.putString(this.f35707a + "photo_full", this.f35714h);
            } else {
                W.remove(this.f35707a + "photo_full");
            }
            W.apply();
        }

        public void m1439k(boolean z, String str) {
            String str2;
            if (z) {
                this.f35714h = str;
                str2 = this.f35707a + "photo_full";
            } else {
                this.f35713g = str;
                str2 = this.f35707a + "photo";
            }
            if (C5070i.m24061i(str)) {
                C4868i.m24726c2().m24888F3(str2);
            } else {
                C4868i.m24726c2().m24545z3(str2, str);
            }
        }

        public C11132a(String str, int i, TdApi.User user, boolean z) {
            this.f35707a = str;
            this.f35708b = user.f25439id;
            this.f35709c = user.firstName;
            this.f35710d = user.lastName;
            this.f35711e = user.username;
            this.f35712f = user.phoneNumber;
            TdApi.ProfilePhoto profilePhoto = user.profilePhoto;
            String str2 = null;
            if (profilePhoto != null) {
                this.f35713g = C4779t2.m25598T2(profilePhoto.small) ? user.profilePhoto.small.local.path : z ? m1443g(i, false) : null;
                if (C4779t2.m25598T2(user.profilePhoto.big)) {
                    str2 = user.profilePhoto.big.local.path;
                } else if (z) {
                    str2 = m1443g(i, true);
                }
                this.f35714h = str2;
            } else {
                this.f35714h = null;
                this.f35713g = null;
            }
            m1441i();
        }
    }

    public C11131y6(C10536ab abVar, int i, RandomAccessFile randomAccessFile, int i2) {
        this.f35696Q = new Object();
        this.f35698S = new AtomicBoolean(false);
        this.f35702W = new HashMap();
        this.f35703X = new C11164z6();
        this.f35704a = abVar;
        this.f35705b = i;
        m1494Q(randomAccessFile, i2);
    }
}
