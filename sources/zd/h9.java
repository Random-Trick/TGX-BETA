package zd;

import android.content.SharedPreferences;
import android.os.Build;
import android.util.SparseIntArray;
import ce.c0;
import gd.w;
import hd.t2;
import he.i;
import ie.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import k0.h;
import kb.j;
import mb.p;
import ob.e;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;

public class h9 implements u0 {
    public static final int[] f27612d0 = {1, 2, 3, 4, 5, 6, 0};
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public final o6 f27613a;
    public int f27614a0;
    public int f27616b0;
    public int f27618c0;
    public final Client.g S = new b();
    public final lb.c<c> f27615b = new lb.c<>(true);
    public final lb.c<d> f27617c = new lb.c<>(true);
    public final lb.d<c> M = new lb.d<>(true);
    public final SparseIntArray N = new SparseIntArray();
    public final HashMap<Integer, TdApi.File> O = new HashMap<>();
    public final h<List<q0>> P = new h<>();
    public final SparseIntArray Q = new SparseIntArray();
    public final HashSet<Integer> R = new HashSet<>();

    public class a implements q0 {
        public final TdApi.File M;
        public final CountDownLatch N;
        public final int[] f27619a;
        public final j f27620b;
        public final j f27621c;

        public a(int[] iArr, j jVar, j jVar2, TdApi.File file, CountDownLatch countDownLatch) {
            this.f27619a = iArr;
            this.f27620b = jVar;
            this.f27621c = jVar2;
            this.M = file;
            this.N = countDownLatch;
        }

        @Override
        public void h2(TdApi.UpdateFile updateFile) {
            j jVar;
            synchronized (this.f27619a) {
                int[] iArr = this.f27619a;
                if (iArr[0] != 3) {
                    if (iArr[0] == 2) {
                        j jVar2 = this.f27620b;
                        if (jVar2 != null) {
                            TdApi.File file = updateFile.file;
                            if (file.local.isDownloadingCompleted) {
                                jVar2.a(file);
                                return;
                            }
                        }
                        j jVar3 = this.f27621c;
                        if (jVar3 != null) {
                            jVar3.a(updateFile.file);
                        }
                        return;
                    }
                    e.v(updateFile.file, this.M);
                    TdApi.File file2 = updateFile.file;
                    if (file2.local.isDownloadingCompleted) {
                        this.f27619a[0] = 1;
                        CountDownLatch countDownLatch = this.N;
                        if (countDownLatch != null) {
                            countDownLatch.countDown();
                        }
                        h9.this.j0(this.M, this);
                        h9.this.f27613a.O9().U(this.M.f19913id, this);
                        if (this.N == null && (jVar = this.f27620b) != null) {
                            jVar.a(this.M);
                        }
                    } else {
                        j jVar4 = this.f27621c;
                        if (jVar4 != null) {
                            jVar4.a(file2);
                        }
                    }
                }
            }
        }
    }

    public class b implements Client.g {
        public b() {
        }

        @Override
        public void r2(TdApi.Object object) {
            List list;
            if (object.getConstructor() == 766337656) {
                TdApi.File file = (TdApi.File) object;
                synchronized (h9.this.P) {
                    if (h9.this.Q.get(file.f19913id) == 1 && (list = (List) h9.this.P.e(file.f19913id)) != null) {
                        for (int size = list.size() - 1; size >= 0; size--) {
                            ((q0) list.get(size)).h2(new TdApi.UpdateFile(e.n(file)));
                        }
                    }
                }
                TdApi.LocalFile localFile = file.local;
                if (localFile.isDownloadingCompleted) {
                    h9.this.f0(new TdApi.UpdateFile(file));
                } else {
                    boolean z10 = localFile.isDownloadingActive;
                }
            }
        }
    }

    public interface c {
        void K0(o6 o6Var, int i10, int i11, TdApi.File file);

        void U0(TdApi.File file);
    }

    public interface d {
        void h(TdApi.File file);
    }

    public h9(o6 o6Var) {
        this.f27613a = o6Var;
        Z();
        o6Var.F4().b1().c(this);
    }

    public static long B(int i10) {
        switch (i10) {
            case 0:
                return 2147483647L;
            case 1:
                return p.f17347c.b(1.0d);
            case 2:
                return p.f17347c.b(5.0d);
            case 3:
                return p.f17347c.b(15.0d);
            case 4:
                return p.f17347c.b(50.0d);
            case 5:
                return p.f17347c.b(100.0d);
            case 6:
                return p.f17347c.b(500.0d);
            default:
                return -1L;
        }
    }

    @Deprecated
    public static void F0(SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        int i10 = sharedPreferences.getInt("settings_autodownload", 1667457792);
        int i11 = (i10 >> 8) & 255;
        int i12 = (i10 >> 16) & 255;
        int i13 = (i10 >> 24) & 255;
        if ((i11 & 2) != 0) {
            i11 |= 64;
        }
        if ((i12 & 2) != 0) {
            i12 |= 64;
        }
        if ((i13 & 2) != 0) {
            i13 |= 64;
        }
        int i14 = (i11 << 8) | (i12 << 16) | (i13 << 24);
        if (i10 != i14) {
            editor.putInt("settings_autodownload", i14);
        }
    }

    public static String I(int i10) {
        return K(i10, w.j1(R.string.fileSize_GB, "∞"));
    }

    public static String J(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        String K = K(i10, null);
        if (i11 == 127) {
            sb2.append(w.i1(R.string.AnyMedia));
        } else if (K != null) {
            sb2.append(w.j1(R.string.MediaExceedingX, K));
        } else if (i11 == 0) {
            sb2.append(w.i1(R.string.NoRestrictions));
        }
        if (!(i11 == 0 || i11 == 127)) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(j(i11));
        }
        return sb2.toString();
    }

    public static String K(int i10, String str) {
        if (i10 == 0) {
            return str;
        }
        long B = B(i10);
        if (B == 2147483647L) {
            return w.j1(R.string.fileSize_GB, "∞");
        }
        return c0.m(B);
    }

    public void W(Client.g gVar, TdApi.Object object) {
        this.S.r2(object);
        gVar.r2(object);
    }

    public void X(int[] iArr, TdApi.File file, q0 q0Var) {
        synchronized (iArr) {
            if (iArr[0] == 0) {
                iArr[0] = 3;
                j0(file, q0Var);
                this.f27613a.O9().U(file.f19913id, q0Var);
            }
        }
    }

    public static void Y(boolean[] zArr, TdApi.File file, CountDownLatch countDownLatch, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.w("getFile error: %s", t2.z5(object));
        } else if (constructor == 766337656) {
            synchronized (zArr) {
                if (!zArr[0]) {
                    zArr[0] = true;
                    e.v((TdApi.File) object, file);
                }
            }
        }
        countDownLatch.countDown();
    }

    public static String a0(String str, int i10) {
        if (i10 == 0) {
            return str;
        }
        return str + "_" + i10;
    }

    public static void b0(Iterator<c> it, TdApi.File file) {
        while (it.hasNext()) {
            it.next().U0(file);
        }
    }

    public static void e0(Iterator<c> it, o6 o6Var, int i10, int i11, TdApi.File file) {
        while (it.hasNext()) {
            it.next().K0(o6Var, i10, i11, file);
        }
    }

    public static String j(int i10) {
        u0 u0Var = new u0(6);
        if ((i10 & 1) != 0) {
            u0Var.a(R.string.Photos);
        }
        if ((i10 & 2) != 0) {
            u0Var.a(R.string.Voice);
        }
        if ((i10 & 64) != 0) {
            u0Var.a(R.string.VideoMessages);
        }
        if ((i10 & 4) != 0) {
            u0Var.a(R.string.Videos);
        }
        if ((i10 & 8) != 0) {
            u0Var.a(R.string.Files);
        }
        if ((i10 & 16) != 0) {
            u0Var.a(R.string.Music);
        }
        if ((i10 & 32) != 0) {
            u0Var.a(R.string.GIFs);
        }
        return u0Var.f() ? w.i1(R.string.Nothing) : u0Var.g(w.m0(), w.n0(false));
    }

    public String A() {
        return j(this.f27614a0);
    }

    public void A0(int i10, d dVar) {
        this.f27617c.b(Integer.valueOf(i10), dVar);
    }

    public void B0(TdApi.File file, c cVar) {
        synchronized (this) {
            i(file, cVar);
        }
    }

    public int C() {
        return this.W;
    }

    public void C0(final TdApi.File file, TdApi.FileType fileType, long j10) {
        TdApi.Function function;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (fileType != null) {
            function = new TdApi.GetRemoteFile(file.remote.f19958id, fileType);
        } else {
            function = new TdApi.GetFile(file.f19913id);
        }
        final boolean[] zArr = new boolean[1];
        this.f27613a.v4().o(function, new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                h9.Y(zArr, file, countDownLatch, object);
            }
        });
        try {
            if (j10 > 0) {
                countDownLatch.await(j10, TimeUnit.MILLISECONDS);
            } else {
                countDownLatch.await();
            }
        } catch (InterruptedException e10) {
            Log.i(e10);
        }
        if (!zArr[0]) {
            synchronized (zArr) {
                zArr[0] = true;
            }
        }
    }

    public String D() {
        return J(this.W, this.X);
    }

    public void D0(int i10, c cVar) {
        synchronized (this) {
            k0(i10, cVar);
        }
    }

    public int E() {
        return this.Y;
    }

    public void E0(int i10, d dVar) {
        this.f27617c.g(Integer.valueOf(i10), dVar);
    }

    public String F() {
        return J(this.Y, this.Z);
    }

    public String G() {
        return J(this.U, this.V);
    }

    public int H() {
        return this.U;
    }

    public int L() {
        return this.X;
    }

    public int M() {
        return this.Z;
    }

    public int N() {
        return this.V;
    }

    public int O() {
        int i10 = this.T;
        if ((i10 & 16) != 0) {
            return 2;
        }
        if ((i10 & 8) != 0) {
            return 1;
        }
        return (i10 & 32) != 0 ? 3 : 0;
    }

    public boolean P(int i10) {
        boolean z10;
        synchronized (this) {
            z10 = this.N.indexOfKey(i10) >= 0;
        }
        return z10;
    }

    public boolean Q() {
        return R() || U();
    }

    public boolean R() {
        return (this.T & 1) != 0;
    }

    public boolean S() {
        return (this.T & 2) != 0;
    }

    public boolean T() {
        return (this.T & 4) != 0;
    }

    public boolean U() {
        return V(this.f27613a.F4().g3().e());
    }

    public final boolean V(int i10) {
        if (Build.VERSION.SDK_INT < 24 || !this.f27613a.F4().g3().l()) {
            return i10 != 0 ? i10 == 2 && (this.T & 4) != 0 : (this.T & 2) != 0;
        }
        return true;
    }

    public final void Z() {
        i c22 = i.c2();
        int A6 = this.f27613a.A6();
        this.T = c22.V0(a0("settings_datasaver", A6), 4);
        int V0 = c22.V0(a0("settings_autodownload", A6), 1667457792);
        this.f27614a0 = (V0 >> 8) & 255;
        this.f27616b0 = (V0 >> 16) & 255;
        this.f27618c0 = (V0 >> 24) & 255;
        int V02 = c22.V0(a0("settings_limit_wifi", A6), 4);
        this.V = (V02 >> 24) & 255;
        this.U = V02 & 16777215;
        int V03 = c22.V0(a0("settings_limit_mobile", A6), 3);
        this.X = (V03 >> 24) & 255;
        this.W = V03 & 16777215;
        int V04 = c22.V0(a0("settings_limit_roaming", A6), 2);
        this.Z = (V04 >> 24) & 255;
        this.Y = V04 & 16777215;
    }

    public final void c0(TdApi.File file) {
        b0(this.M.iterator(), file);
        Iterator<c> d10 = this.f27615b.d(Integer.valueOf(file.f19913id));
        if (d10 != null) {
            b0(d10, file);
        }
    }

    @Override
    public void c3(o6 o6Var, int i10, boolean z10) {
    }

    public final void d0(int i10, int i11, TdApi.File file) {
        e0(this.M.iterator(), this.f27613a, i10, i11, file);
        Iterator<c> d10 = this.f27615b.d(Integer.valueOf(i10));
        if (d10 != null) {
            e0(d10, this.f27613a, i10, i11, file);
        }
    }

    public void f0(TdApi.UpdateFile updateFile) {
        synchronized (this) {
            int i10 = updateFile.file.f19913id;
            int i11 = this.N.get(i10);
            this.R.remove(Integer.valueOf(i10));
            if (i11 == 0) {
                d0(i10, 2, updateFile.file);
            } else if (t2.V2(updateFile.file)) {
                l0(i10);
                d0(i10, 2, updateFile.file);
            } else {
                d0(i10, 1, updateFile.file);
            }
        }
    }

    public void g(TdApi.File file, int i10, q0 q0Var, boolean z10, boolean z11) {
        synchronized (this.P) {
            List<q0> e10 = this.P.e(file.f19913id);
            if (e10 != null) {
                if (!z10 && e10.contains(q0Var)) {
                    throw new IllegalStateException();
                }
                e10.add(q0Var);
                if (z11) {
                    p0(file, i10, 0);
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(q0Var);
            this.P.j(file.f19913id, arrayList);
            if (!file.local.isDownloadingActive) {
                synchronized (this) {
                    if (this.N.get(file.f19913id) == 0) {
                        this.Q.put(file.f19913id, 1);
                        r(file.f19913id, 3, i10);
                    }
                }
            } else if (z11) {
                p0(file, i10, 0);
            }
        }
    }

    public void g0(TdApi.UpdateFile updateFile) {
        synchronized (this) {
            if (t2.s1(updateFile.file) > 0.0f) {
                this.O.put(Integer.valueOf(updateFile.file.f19913id), updateFile.file);
            }
            c0(updateFile.file);
        }
    }

    public void h(TdApi.File file, q0 q0Var, boolean z10) {
        g(file, 0, q0Var, z10, false);
    }

    public void h0(TdApi.UpdateFile updateFile) {
        synchronized (this) {
            if (this.N.get(updateFile.file.f19913id) != 0) {
                TdApi.File file = updateFile.file;
                TdApi.RemoteFile remoteFile = file.remote;
                if (!remoteFile.isUploadingActive) {
                    TdApi.LocalFile localFile = file.local;
                    if (!localFile.isDownloadingActive && !remoteFile.isUploadingCompleted && !localFile.isDownloadingCompleted) {
                        l0(file.f19913id);
                        d0(updateFile.file.f19913id, 0, null);
                    }
                }
            }
            Iterator<d> d10 = this.f27617c.d(Integer.valueOf(updateFile.file.f19913id));
            if (d10 != null) {
                while (d10.hasNext()) {
                    d10.next().h(updateFile.file);
                }
            }
        }
    }

    public final boolean i(TdApi.File file, c cVar) {
        if (!this.f27615b.b(Integer.valueOf(file.f19913id), cVar) || this.N.get(file.f19913id) == 0) {
            return true;
        }
        cVar.K0(this.f27613a, file.f19913id, 1, null);
        TdApi.File file2 = this.O.get(Integer.valueOf(file.f19913id));
        if (file2 == null) {
            return false;
        }
        e.v(file2, file);
        if (t2.s1(file) <= 0.0f) {
            return false;
        }
        cVar.U0(file);
        return false;
    }

    public void i0(TdApi.UpdateFile updateFile) {
        synchronized (this) {
            int i10 = updateFile.file.f19913id;
            if (this.N.get(i10) != 0) {
                l0(i10);
            }
            d0(i10, 0, updateFile.file);
        }
    }

    public void j0(TdApi.File file, q0 q0Var) {
        synchronized (this.P) {
            int g10 = this.P.g(file.f19913id);
            if (g10 >= 0) {
                List<q0> o10 = this.P.o(g10);
                if (o10 != null) {
                    if (o10.remove(q0Var)) {
                        if (o10.isEmpty()) {
                            this.P.l(g10);
                            synchronized (this) {
                                int indexOfKey = this.Q.indexOfKey(file.f19913id);
                                boolean z10 = indexOfKey >= 0;
                                if (z10) {
                                    this.Q.removeAt(indexOfKey);
                                }
                                if (this.N.get(file.f19913id) != 0 && z10) {
                                    this.f27613a.v4().o(new TdApi.CancelDownloadFile(file.f19913id, false), this.S);
                                }
                            }
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
            }
        }
    }

    public boolean k(TdApi.File file, int i10, TdApi.ChatType chatType) {
        int i11;
        int i12;
        int i13;
        if (Q() || file.remote.isUploadingActive) {
            return false;
        }
        int e10 = this.f27613a.F4().g3().e();
        if (e10 == 1) {
            i12 = this.U;
            i11 = this.V;
        } else if (e10 != 2) {
            i12 = this.W;
            i11 = this.X;
        } else {
            i12 = this.Y;
            i11 = this.Z;
        }
        if (file.size > B(i12) || (i11 & i10) != 0) {
            return false;
        }
        if (chatType == null) {
            i13 = 99;
        } else {
            switch (chatType.getConstructor()) {
                case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                    if (!t2.E3(chatType)) {
                        i13 = this.f27618c0;
                        break;
                    } else {
                        i13 = this.f27616b0;
                        break;
                    }
                case TdApi.ChatTypeSecret.CONSTRUCTOR:
                case TdApi.ChatTypePrivate.CONSTRUCTOR:
                    i13 = this.f27614a0;
                    break;
                case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                    i13 = this.f27616b0;
                    break;
                default:
                    return false;
            }
        }
        if ((i10 & i13) == 0) {
            return false;
        }
        return !this.R.contains(Integer.valueOf(file.f19913id));
    }

    public final void k0(int i10, c cVar) {
        this.f27615b.g(Integer.valueOf(i10), cVar);
    }

    public void l() {
        synchronized (this) {
            for (int size = this.N.size() - 1; size >= 0; size--) {
                int valueAt = this.N.valueAt(size);
                if (valueAt == 1) {
                    n(this.N.keyAt(size), valueAt, false);
                }
            }
        }
    }

    public final void l0(int i10) {
        this.N.delete(i10);
        this.O.remove(Integer.valueOf(i10));
    }

    public boolean m(int i10, boolean z10, boolean z11) {
        synchronized (this) {
            int i11 = this.N.get(i10);
            if (i11 == 0) {
                return false;
            }
            if (z11) {
                this.R.add(Integer.valueOf(i10));
            }
            n(i10, i11, z10);
            this.f27613a.F4().w2().e1(i10);
            return true;
        }
    }

    public final void m0() {
        i.c2().u3(a0("settings_autodownload", this.f27613a.A6()), (this.f27614a0 << 8) | (this.f27616b0 << 16) | (this.f27618c0 << 24));
    }

    public final void n(int i10, int i11, boolean z10) {
        if (i11 == 1) {
            if (Log.isEnabled(Log.TAG_TDLIB_FILES)) {
                Log.i((int) Log.TAG_TDLIB_FILES, "cancelDownloadFile id=%d", Integer.valueOf(i10));
            }
            this.f27613a.v4().o(new TdApi.CancelDownloadFile(i10, z10), this.S);
        }
    }

    public final void n0() {
        i.c2().u3(a0("settings_datasaver", this.f27613a.A6()), this.T);
    }

    public boolean o(TdApi.File file, TdApi.ChatType chatType, int i10, boolean z10) {
        synchronized (this) {
            if (!k(file, i10, chatType) || (t2.T2(file) && !z10)) {
                return false;
            }
            p(file);
            return true;
        }
    }

    public void o0(TdApi.File file, q0 q0Var, int i10) {
        synchronized (this.P) {
            if (!t2.P5(file, i10)) {
                List<q0> e10 = this.P.e(file.f19913id);
                if (e10 != null && e10.contains(q0Var)) {
                    p0(file, i10, 0);
                }
            }
        }
    }

    public void p(TdApi.File file) {
        q(file, 1, 0, 0, null);
    }

    public final void p0(TdApi.File file, int i10, int i11) {
        if (!t2.P5(file, i10) && this.N.get(file.f19913id) == 1) {
            Log.i("FILES: downloadFile %d offset=%d", Integer.valueOf(file.f19913id), Integer.valueOf(i10));
            this.f27613a.v4().o(new TdApi.DownloadFile(file.f19913id, 3, i10, i11, false), this.S);
        }
    }

    public void q(TdApi.File file, int i10, int i11, int i12, Client.g gVar) {
        synchronized (this) {
            this.R.remove(Integer.valueOf(file.f19913id));
            if (!t2.T2(file)) {
                s(file.f19913id, i10, i11, 0, gVar);
            } else if (gVar != null) {
                this.f27613a.v4().o(new TdApi.DownloadFile(file.f19913id, i10, i11, i12, false), gVar);
            }
        }
    }

    public boolean q0(boolean z10) {
        int i10 = this.T;
        if (((i10 & 1) != 0) == z10) {
            return false;
        }
        this.T = i10 ^ 1;
        if (z10) {
            l();
        }
        n0();
        return true;
    }

    public final void r(int i10, int i11, int i12) {
        s(i10, i11, i12, 0, null);
    }

    public boolean r0(int i10) {
        int i11 = this.T;
        if ((i11 & 1) != 0) {
            i10 |= 1;
        }
        if (i11 == i10) {
            return false;
        }
        boolean Q = Q();
        this.T = i10;
        if (Q() && !Q) {
            l();
        }
        n0();
        return true;
    }

    public final void s(int i10, int i11, int i12, int i13, final Client.g gVar) {
        if (this.N.get(i10) == 0) {
            this.N.put(i10, 1);
            d0(i10, 1, null);
            if (Log.isEnabled(Log.TAG_TDLIB_FILES)) {
                Log.i((int) Log.TAG_TDLIB_FILES, "downloadFileInternal id=%d priority=%d offset=%d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
            }
            if (gVar != null) {
                this.f27613a.v4().o(new TdApi.DownloadFile(i10, i11, i12, i13, false), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        h9.this.W(gVar, object);
                    }
                });
            } else {
                this.f27613a.v4().o(new TdApi.DownloadFile(i10, i11, i12, i13, false), this.S);
            }
        }
    }

    public boolean s0(boolean z10, boolean z11) {
        int i10 = this.T & (-3) & (-5);
        if (z10) {
            i10 |= 2;
        }
        if (z11) {
            i10 |= 4;
        }
        return r0(i10);
    }

    public Runnable t(final TdApi.File file, long j10, j<TdApi.File> jVar, j<TdApi.File> jVar2) {
        if (t2.T2(file)) {
            return null;
        }
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        CountDownLatch countDownLatch = i10 >= 0 ? new CountDownLatch(1) : null;
        final int[] iArr = new int[1];
        final a aVar = new a(iArr, jVar, jVar2, file, countDownLatch);
        this.f27613a.O9().m(file.f19913id, aVar);
        h(file, aVar, false);
        if (countDownLatch == null) {
            return new Runnable() {
                @Override
                public final void run() {
                    h9.this.X(iArr, file, aVar);
                }
            };
        }
        try {
            if (i10 > 0) {
                countDownLatch.await(j10, TimeUnit.MILLISECONDS);
            } else {
                countDownLatch.await();
            }
        } catch (InterruptedException e10) {
            Log.i(e10);
        }
        synchronized (iArr) {
            if (iArr[0] == 0) {
                if (jVar == null) {
                    iArr[0] = 3;
                    j0(file, aVar);
                    this.f27613a.O9().U(file.f19913id, aVar);
                } else {
                    iArr[0] = 2;
                }
            }
        }
        return null;
    }

    public boolean t0(int i10) {
        if (this.f27618c0 == i10) {
            return false;
        }
        this.f27618c0 = i10;
        m0();
        return true;
    }

    public int u() {
        return this.f27618c0;
    }

    public boolean u0(int i10) {
        if (this.f27616b0 == i10) {
            return false;
        }
        this.f27616b0 = i10;
        m0();
        return true;
    }

    @Override
    public void v(boolean z10) {
        if (z10) {
            l();
        }
    }

    public boolean v0(int i10) {
        if (this.f27614a0 == i10) {
            return false;
        }
        this.f27614a0 = i10;
        m0();
        return true;
    }

    @Override
    public void v6(int i10, int i11) {
        if (!V(i10) && V(i11)) {
            l();
        }
    }

    public String w() {
        return j(this.f27618c0);
    }

    public boolean w0(int i10, int i11) {
        if (this.X == i10 && this.W == i11) {
            return false;
        }
        this.X = i10;
        this.W = i11;
        i.c2().u3(a0("settings_limit_mobile", this.f27613a.A6()), (this.X << 24) | (this.W & 16777215));
        return true;
    }

    public int x() {
        return this.f27616b0;
    }

    public boolean x0(int i10, int i11) {
        if (this.Z == i10 && this.Y == i11) {
            return false;
        }
        this.Z = i10;
        this.Y = i11;
        i.c2().u3(a0("settings_limit_roaming", this.f27613a.A6()), (this.Z << 24) | (this.Y & 16777215));
        return true;
    }

    public String y() {
        return j(this.f27616b0);
    }

    public boolean y0(int i10, int i11) {
        if (this.V == i10 && this.U == i11) {
            return false;
        }
        this.V = i10;
        this.U = i11;
        i.c2().u3(a0("settings_limit_wifi", this.f27613a.A6()), (this.V << 24) | (this.U & 16777215));
        return true;
    }

    public int z() {
        return this.f27614a0;
    }

    public boolean z0(int i10) {
        int i11 = this.T;
        int i12 = (i10 == 2 ? 16 : i10 == 1 ? 8 : i10 == 3 ? 32 : 0) | (i11 & (-9) & (-17) & (-33));
        if (i11 == i12) {
            return false;
        }
        this.T = i12;
        n0();
        return true;
    }
}
