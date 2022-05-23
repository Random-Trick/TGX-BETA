package zd;

import android.os.Build;
import android.os.SystemClock;
import ce.c0;
import hd.b;
import hd.t2;
import he.i;
import ib.c;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import ld.h;
import me.vkryl.leveldb.LevelDB;
import oc.v0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.drinkmore.Tracer;
import org.thunderdog.challegram.Log;

public class w6 implements Comparable<w6>, tb {
    public long M;
    public long N;
    public int O;
    public o6 P;
    public final Object Q;
    public long R;
    public final AtomicBoolean S;
    public h T;
    public h U;
    public a V;
    public final Map<String, z8> W;
    public final x6 X;
    public final ya f28607a;
    public final int f28608b;
    public int f28609c;

    public w6(ya yaVar, int i10, boolean z10) {
        this.Q = new Object();
        this.S = new AtomicBoolean(false);
        this.W = new HashMap();
        this.X = new x6();
        this.f28607a = yaVar;
        this.f28608b = i10;
        this.O = -1;
        this.N = System.currentTimeMillis();
        this.f28609c = 1;
        if (z10) {
            this.f28609c = 1 | 2;
            i.c2().d4(i10, true);
        }
    }

    public boolean A() {
        return !c.b(this.f28609c, 64);
    }

    public boolean B(boolean z10) {
        boolean z11;
        synchronized (this.Q) {
            o6 o6Var = this.P;
            z11 = o6Var != null && (!z10 || !o6Var.f7());
        }
        return z11;
    }

    public boolean C() {
        return c.b(this.f28609c, 8);
    }

    public boolean D() {
        return (y() == null && p() == null) ? false : true;
    }

    public final boolean E() {
        a aVar;
        if (this.M == 0 || (aVar = this.V) == null || aVar.f28611b != this.M) {
            LevelDB n32 = i.c2().n3();
            if (n32.getLong(i.j(this.f28608b) + "", 0L) != this.M) {
                return false;
            }
        }
        return true;
    }

    public boolean F() {
        return !c.b(this.f28609c, Log.TAG_CRASH);
    }

    public boolean G() {
        return c.b(this.f28609c, 2) && i.c2().u(this.f28608b);
    }

    public boolean H() {
        return c.b(this.f28609c, 16);
    }

    public boolean I() {
        return c.b(this.f28609c, 32);
    }

    public boolean J(w6 w6Var) {
        return this.f28608b == w6Var.f28608b;
    }

    public boolean K() {
        return c.b(this.f28609c, 1);
    }

    public boolean L() {
        if (I()) {
            return true;
        }
        if (K()) {
            return false;
        }
        return !c.b(this.f28609c, 4) || C() || !E();
    }

    public long M() {
        if (this == this.f28607a.k0()) {
            return Long.MAX_VALUE;
        }
        return this.R;
    }

    public boolean N(boolean z10) {
        if (!z10 && !L()) {
            return false;
        }
        c();
        return true;
    }

    public void O() {
        this.R = SystemClock.uptimeMillis();
        this.f28607a.m1(this);
    }

    public boolean P(Client client) {
        synchronized (this.Q) {
            o6 o6Var = this.P;
            if (o6Var == null) {
                return false;
            }
            return o6Var.Fa(client);
        }
    }

    public final void Q(RandomAccessFile randomAccessFile, int i10) {
        this.f28609c = randomAccessFile.readByte();
        this.M = i10 == 2 ? randomAccessFile.readLong() : randomAccessFile.readInt();
        this.N = randomAccessFile.readLong();
        this.O = randomAccessFile.readInt();
        Log.i((int) Log.TAG_ACCOUNTS, "restored accountId:%d flags:%d userId:%d time:%d order:%d", Integer.valueOf(this.f28608b), Integer.valueOf(this.f28609c), Long.valueOf(this.M), Long.valueOf(this.N), Integer.valueOf(this.O));
    }

    public void R(RandomAccessFile randomAccessFile) {
        randomAccessFile.write(this.f28609c);
        randomAccessFile.writeLong(this.M);
        randomAccessFile.writeLong(this.N);
        randomAccessFile.writeInt(this.O);
    }

    public int S(RandomAccessFile randomAccessFile, int i10) {
        randomAccessFile.seek(i10);
        randomAccessFile.write(this.f28609c);
        return i10 + 21;
    }

    public int T(RandomAccessFile randomAccessFile, int i10) {
        randomAccessFile.seek(i10 + 17);
        randomAccessFile.writeInt(this.O);
        return i10 + 21;
    }

    public boolean U(boolean z10) {
        return e(16, z10);
    }

    public final boolean V(int i10) {
        if (this.f28609c == i10) {
            return false;
        }
        this.f28609c = i10;
        return true;
    }

    public boolean W(boolean z10) {
        return e(Log.TAG_YOUTUBE, !z10);
    }

    public boolean X(boolean z10) {
        return e(8, z10);
    }

    public boolean Y(boolean z10) {
        return e(Log.TAG_CRASH, !z10);
    }

    public boolean Z(boolean z10) {
        if (!e(2, z10)) {
            return false;
        }
        i.c2().d4(this.f28608b, z10);
        if (!B(false)) {
            return true;
        }
        this.P.bc(G());
        return true;
    }

    @Override
    public int a() {
        return this.f28608b;
    }

    public boolean a0(boolean z10) {
        return e(4, !z10);
    }

    public boolean b() {
        if (I()) {
            return false;
        }
        if (i.c2().F(8)) {
            return this.f28607a.x2() == a();
        }
        if (i.c2().F(16)) {
            return l();
        }
        return true;
    }

    public boolean b0(long j10) {
        if (this.M == j10) {
            return false;
        }
        this.M = j10;
        return true;
    }

    @Override
    public o6 c() {
        boolean z10 = true;
        boolean z11 = this.P != null;
        if (!z11) {
            synchronized (this.Q) {
                if (this.P == null) {
                    j();
                    z10 = z11;
                }
            }
            z11 = z10;
        }
        if (z11) {
            this.P.Te();
        }
        return this.P;
    }

    public boolean c0(boolean z10) {
        return e(32, z10);
    }

    public boolean d() {
        return B(true);
    }

    public boolean d0(int i10) {
        if (this.O == i10) {
            return false;
        }
        this.O = i10;
        return true;
    }

    public final boolean e(int i10, boolean z10) {
        return V(c.h(this.f28609c, i10, z10));
    }

    public boolean e0(boolean z10, long j10) {
        boolean z11 = true;
        boolean e10 = e(1, z10);
        if (e10) {
            this.N = System.currentTimeMillis();
        }
        if (z10) {
            boolean z12 = b0(0L) || e10;
            if (!d0(-1) && !z12) {
                z11 = false;
            }
            k();
            return z11;
        }
        return e(64, false) || (b0(j10) || e10);
    }

    public void f(Runnable runnable) {
        synchronized (this.Q) {
            o6 o6Var = this.P;
            if (o6Var == null || o6Var.f7()) {
                v0.D2(runnable);
            } else {
                this.P.Ga(runnable);
            }
        }
    }

    public void f0(TdApi.ChatList chatList, z8 z8Var, boolean z10) {
        String str;
        String o42 = t2.o4(chatList);
        z8 z8Var2 = this.W.get(o42);
        if (z8Var2 == null) {
            z8Var2 = new z8(z8Var);
            this.W.put(o42, z8Var2);
        } else {
            z8Var2.b(z8Var);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i.j(this.f28608b));
        sb2.append("counter_");
        if (chatList instanceof TdApi.ChatListMain) {
            str = "";
        } else {
            str = o42 + "_";
        }
        sb2.append(str);
        z8Var2.d(sb2.toString(), z10);
    }

    public boolean g(String str) {
        return ib.i.c(v(), str);
    }

    public void g0(TdApi.User user) {
        this.U = null;
        this.T = null;
        if (user == null || user.f19979id != this.M) {
            k();
            this.W.clear();
            return;
        }
        String j10 = i.j(this.f28608b);
        this.V = new a(j10, this.f28608b, user, i.c2().e1(j10, 0L) == user.f19979id);
    }

    public final int compareTo(w6 w6Var) {
        int i10 = this.O;
        int i11 = w6Var.O;
        if (i10 != i11) {
            if (i10 == -1) {
                i10 = Integer.MAX_VALUE;
            }
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            return Integer.compare(i10, i11);
        }
        long j10 = this.N;
        long j11 = w6Var.N;
        if (j10 != j11) {
            return Long.compare(j10, j11);
        }
        return Integer.compare(this.f28608b, w6Var.f28608b);
    }

    public void h0(boolean z10, String str) {
        a aVar = this.V;
        if (aVar != null) {
            aVar.k(z10, str);
        } else {
            a.j(this.f28608b, z10, str);
        }
    }

    public ya i() {
        return this.f28607a;
    }

    public o6 i0() {
        synchronized (this.Q) {
            if (this.P == null) {
                j();
            }
        }
        return this.P;
    }

    public final void j() {
        if (!this.S.getAndSet(true)) {
            Throwable th = null;
            try {
                this.P = new o6(this, G());
            } finally {
                th = th;
                try {
                    throw th;
                } finally {
                }
            }
            if (th != null) {
                Tracer.f(th);
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    public final void k() {
        i.c2().H3(i.j(this.f28608b), null);
        this.V = null;
    }

    public boolean l() {
        return !c.b(this.f28609c, Log.TAG_YOUTUBE);
    }

    public h m(boolean z10) {
        a p10 = p();
        h hVar = null;
        String f10 = p10 != null ? p10.f(z10) : null;
        if (!ib.i.i(f10)) {
            hVar = z10 ? this.U : this.T;
            if (!(hVar instanceof ld.i) || !ib.i.c(((ld.i) hVar).D0(), f10)) {
                hVar = new ld.i(f10);
                if (!z10) {
                    hVar.t0(wc.a.getDefaultAvatarCacheSize());
                }
                if (z10) {
                    this.U = hVar;
                } else {
                    this.T = hVar;
                }
            }
        }
        return hVar;
    }

    public b.a n() {
        TdApi.User y10 = y();
        if (y10 != null) {
            return this.P.e2().O2(y10, false);
        }
        a p10 = p();
        if (p10 != null) {
            long j10 = this.M;
            return new b.a(t2.H0(j10, j10), t2.C1(p10.c(), p10.d()));
        }
        long j11 = this.M;
        if (j11 != 0) {
            return new b.a(t2.H0(j11, j11));
        }
        return null;
    }

    public z8 o(TdApi.ChatList chatList) {
        String str;
        String o42 = t2.o4(chatList);
        z8 z8Var = this.W.get(o42);
        if (z8Var == null) {
            z8Var = new z8();
            this.W.put(o42, z8Var);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i.j(this.f28608b));
            sb2.append("counter_");
            if (chatList instanceof TdApi.ChatListMain) {
                str = "";
            } else {
                str = o42 + "_";
            }
            sb2.append(str);
            z8Var.c(sb2.toString());
        }
        return z8Var;
    }

    public a p() {
        if (this.M == 0) {
            return null;
        }
        a aVar = this.V;
        if (aVar != null && aVar.f28611b == this.M) {
            return this.V;
        }
        a b10 = a.b(i.j(this.f28608b), this.M);
        this.V = b10;
        return b10;
    }

    public String q() {
        TdApi.User y10 = y();
        if (y10 != null) {
            return y10.firstName;
        }
        a p10 = p();
        return p10 != null ? p10.c() : "User";
    }

    public long r() {
        return this.M;
    }

    public String s() {
        TdApi.User y10 = y();
        if (y10 != null) {
            return y10.lastName;
        }
        a p10 = p();
        if (p10 != null) {
            return p10.d();
        }
        return "#" + this.M;
    }

    public String t() {
        String str;
        String str2;
        String str3;
        String str4;
        TdApi.User y10 = y();
        if (y10 != null) {
            str3 = y10.firstName;
            str2 = y10.lastName;
            str = y10.username;
            str4 = y10.phoneNumber;
        } else {
            a p10 = p();
            if (p10 == null) {
                return null;
            }
            str3 = p10.c();
            str2 = p10.d();
            str = p10.h();
            str4 = p10.e();
        }
        String q22 = t2.q2(str3, str2);
        if (this.f28607a.f1(str3, str2, this.f28608b) == -1) {
            return q22;
        }
        if (!ib.i.i(str)) {
            return q22 + " (@" + str + ")";
        }
        return q22 + " (" + c0.w(str4) + ")";
    }

    public String u() {
        TdApi.User y10 = y();
        if (y10 != null) {
            return t2.r2(y10);
        }
        a p10 = p();
        if (p10 != null) {
            return t2.q2(p10.c(), p10.d());
        }
        return "User #" + this.M;
    }

    public String v() {
        TdApi.User y10 = y();
        if (y10 != null) {
            return y10.phoneNumber;
        }
        a p10 = p();
        return p10 != null ? p10.e() : "…";
    }

    public String w() {
        String str;
        String str2;
        String str3;
        String str4;
        TdApi.User da2 = c().da();
        if (da2 != null) {
            str3 = da2.username;
            str2 = da2.firstName;
            str = da2.lastName;
            str4 = da2.phoneNumber;
        } else {
            a p10 = p();
            if (p10 == null) {
                return null;
            }
            str3 = p10.h();
            str2 = p10.c();
            str = p10.d();
            str4 = p10.e();
        }
        if (!ib.i.i(str3)) {
            return "@" + str3;
        } else if (this.f28607a.e1(str2, this.f28608b) == -1) {
            return (Build.VERSION.SDK_INT < 24 || str2.length() >= 12 || ib.i.i(str)) ? str2 : t2.q2(str2, str);
        } else {
            if (!ib.i.i(str)) {
                return t2.q2(str2, str);
            }
            return str2 + " " + c0.w(str4);
        }
    }

    public x6 x() {
        this.X.e(this);
        return this.X;
    }

    public TdApi.User y() {
        if (d()) {
            return c().da();
        }
        return null;
    }

    public boolean z() {
        if (!B(true) || c().da() == null) {
            return E();
        }
        return true;
    }

    public static class a {
        public final String f28610a;
        public long f28611b;
        public String f28612c;
        public String f28613d;
        public String f28614e;
        public String f28615f;
        public String f28616g;
        public String f28617h;

        public a(String str) {
            this.f28610a = str;
        }

        public static a b(String str, long j10) {
            a aVar = null;
            for (LevelDB.a aVar2 : i.c2().n3().g(str)) {
                if (aVar == null) {
                    aVar = new a(str);
                }
                String substring = aVar2.l().substring(str.length());
                substring.hashCode();
                char c10 = 65535;
                switch (substring.hashCode()) {
                    case -507990916:
                        if (substring.equals("photo_full")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 0:
                        if (substring.equals("")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 104584966:
                        if (substring.equals("name1")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 104584967:
                        if (substring.equals("name2")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 106642798:
                        if (substring.equals("phone")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 106642994:
                        if (substring.equals("photo")) {
                            c10 = 5;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        aVar.f28617h = aVar2.k();
                        break;
                    case 1:
                        long i10 = aVar2.i();
                        aVar.f28611b = i10;
                        if (i10 == j10) {
                            break;
                        } else {
                            return null;
                        }
                    case 2:
                        aVar.f28612c = aVar2.k();
                        break;
                    case 3:
                        aVar.f28613d = aVar2.k();
                        break;
                    case 4:
                        aVar.f28615f = aVar2.k();
                        break;
                    case 5:
                        aVar.f28616g = aVar2.k();
                        break;
                }
            }
            if (aVar == null || aVar.f28611b != j10) {
                return null;
            }
            return aVar;
        }

        public static String g(int i10, boolean z10) {
            String str;
            if (z10) {
                str = i.j(i10) + "photo_full";
            } else {
                str = i.j(i10) + "photo";
            }
            return i.c2().L1(str, null);
        }

        public static void j(int i10, boolean z10, String str) {
            String str2;
            if (z10) {
                str2 = i.j(i10) + "photo_full";
            } else {
                str2 = i.j(i10) + "photo";
            }
            if (ib.i.i(str)) {
                i.c2().F3(str2);
            } else {
                i.c2().z3(str2, str);
            }
        }

        public String c() {
            return this.f28612c;
        }

        public String d() {
            return this.f28613d;
        }

        public String e() {
            return this.f28615f;
        }

        public String f(boolean z10) {
            return z10 ? this.f28617h : this.f28616g;
        }

        public String h() {
            return this.f28614e;
        }

        public final void i() {
            LevelDB W = i.c2().W();
            W.putLong(this.f28610a + "", this.f28611b);
            W.putString(this.f28610a + "name1", this.f28612c);
            W.putString(this.f28610a + "name2", this.f28613d);
            W.putString(this.f28610a + "username", this.f28614e);
            W.putString(this.f28610a + "phone", this.f28615f);
            if (!ib.i.i(this.f28616g)) {
                W.putString(this.f28610a + "photo", this.f28616g);
            } else {
                W.remove(this.f28610a + "photo");
            }
            if (!ib.i.i(this.f28617h)) {
                W.putString(this.f28610a + "photo_full", this.f28617h);
            } else {
                W.remove(this.f28610a + "photo_full");
            }
            W.apply();
        }

        public void k(boolean z10, String str) {
            String str2;
            if (z10) {
                this.f28617h = str;
                str2 = this.f28610a + "photo_full";
            } else {
                this.f28616g = str;
                str2 = this.f28610a + "photo";
            }
            if (ib.i.i(str)) {
                i.c2().F3(str2);
            } else {
                i.c2().z3(str2, str);
            }
        }

        public a(String str, int i10, TdApi.User user, boolean z10) {
            this.f28610a = str;
            this.f28611b = user.f19979id;
            this.f28612c = user.firstName;
            this.f28613d = user.lastName;
            this.f28614e = user.username;
            this.f28615f = user.phoneNumber;
            TdApi.ProfilePhoto profilePhoto = user.profilePhoto;
            String str2 = null;
            if (profilePhoto != null) {
                this.f28616g = t2.T2(profilePhoto.small) ? user.profilePhoto.small.local.path : z10 ? g(i10, false) : null;
                if (t2.T2(user.profilePhoto.big)) {
                    str2 = user.profilePhoto.big.local.path;
                } else if (z10) {
                    str2 = g(i10, true);
                }
                this.f28617h = str2;
            } else {
                this.f28617h = null;
                this.f28616g = null;
            }
            i();
        }
    }

    public w6(ya yaVar, int i10, RandomAccessFile randomAccessFile, int i11) {
        this.Q = new Object();
        this.S = new AtomicBoolean(false);
        this.W = new HashMap();
        this.X = new x6();
        this.f28607a = yaVar;
        this.f28608b = i10;
        Q(randomAccessFile, i11);
    }
}
