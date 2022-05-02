package p350yd;

import android.content.SharedPreferences;
import android.os.Build;
import android.util.SparseIntArray;
import be.C1363c0;
import gd.C4779t2;
import ge.C4868i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import lb.EnumC6459p;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p111he.C5146u0;
import p139jb.AbstractC5918j;
import p143k0.C6038h;
import p154kb.C6226c;
import p154kb.C6227d;
import p193nb.C7321e;

public class C10756j9 implements AbstractC11083w0 {
    public static final int[] f34402d0 = {1, 2, 3, 4, 5, 6, 0};
    public int f34410T;
    public int f34411U;
    public int f34412V;
    public int f34413W;
    public int f34414X;
    public int f34415Y;
    public int f34416Z;
    public final C10930q6 f34417a;
    public int f34418a0;
    public int f34420b0;
    public int f34422c0;
    public final Client.AbstractC7865g f34409S = new C10758b();
    public final C6226c<AbstractC10759c> f34419b = new C6226c<>(true);
    public final C6226c<AbstractC10760d> f34421c = new C6226c<>(true);
    public final C6227d<AbstractC10759c> f34403M = new C6227d<>(true);
    public final SparseIntArray f34404N = new SparseIntArray();
    public final HashMap<Integer, TdApi.File> f34405O = new HashMap<>();
    public final C6038h<List<AbstractC10985s0>> f34406P = new C6038h<>();
    public final SparseIntArray f34407Q = new SparseIntArray();
    public final HashSet<Integer> f34408R = new HashSet<>();

    public class C10757a implements AbstractC10985s0 {
        public final TdApi.File f34423M;
        public final CountDownLatch f34424N;
        public final int[] f34426a;
        public final AbstractC5918j f34427b;
        public final AbstractC5918j f34428c;

        public C10757a(int[] iArr, AbstractC5918j jVar, AbstractC5918j jVar2, TdApi.File file, CountDownLatch countDownLatch) {
            this.f34426a = iArr;
            this.f34427b = jVar;
            this.f34428c = jVar2;
            this.f34423M = file;
            this.f34424N = countDownLatch;
        }

        @Override
        public void mo2039h2(TdApi.UpdateFile updateFile) {
            AbstractC5918j jVar;
            synchronized (this.f34426a) {
                int[] iArr = this.f34426a;
                if (iArr[0] != 3) {
                    if (iArr[0] == 2) {
                        AbstractC5918j jVar2 = this.f34427b;
                        if (jVar2 != null) {
                            TdApi.File file = updateFile.file;
                            if (file.local.isDownloadingCompleted) {
                                jVar2.mo1330a(file);
                                return;
                            }
                        }
                        AbstractC5918j jVar3 = this.f34428c;
                        if (jVar3 != null) {
                            jVar3.mo1330a(updateFile.file);
                        }
                        return;
                    }
                    C7321e.m16907u(updateFile.file, this.f34423M);
                    TdApi.File file2 = updateFile.file;
                    if (file2.local.isDownloadingCompleted) {
                        this.f34426a[0] = 1;
                        CountDownLatch countDownLatch = this.f34424N;
                        if (countDownLatch != null) {
                            countDownLatch.countDown();
                        }
                        C10756j9.this.m3986j0(this.f34423M, this);
                        C10756j9.this.f34417a.m2781K9().m1901U(this.f34423M.f25373id, this);
                        if (this.f34424N == null && (jVar = this.f34427b) != null) {
                            jVar.mo1330a(this.f34423M);
                        }
                    } else {
                        AbstractC5918j jVar4 = this.f34428c;
                        if (jVar4 != null) {
                            jVar4.mo1330a(file2);
                        }
                    }
                }
            }
        }
    }

    public class C10758b implements Client.AbstractC7865g {
        public C10758b() {
        }

        @Override
        public void mo255t2(TdApi.Object object) {
            List list;
            if (object.getConstructor() == 766337656) {
                TdApi.File file = (TdApi.File) object;
                synchronized (C10756j9.this.f34406P) {
                    if (C10756j9.this.f34407Q.get(file.f25373id) == 1 && (list = (List) C10756j9.this.f34406P.m21471e(file.f25373id)) != null) {
                        for (int size = list.size() - 1; size >= 0; size--) {
                            ((AbstractC10985s0) list.get(size)).mo2039h2(new TdApi.UpdateFile(C7321e.m16931m(file)));
                        }
                    }
                }
                TdApi.LocalFile localFile = file.local;
                if (localFile.isDownloadingCompleted) {
                    C10756j9.this.m3994f0(new TdApi.UpdateFile(file));
                } else {
                    boolean z = localFile.isDownloadingActive;
                }
            }
        }
    }

    public interface AbstractC10759c {
        void mo3954R2(C10930q6 q6Var, int i, int i2, TdApi.File file);

        void mo3953V0(TdApi.File file);
    }

    public interface AbstractC10760d {
        void mo3952i(TdApi.File file);
    }

    public C10756j9(C10930q6 q6Var) {
        this.f34417a = q6Var;
        m4006Z();
        q6Var.m2930B4().m4716b1().m1552c(this);
    }

    public static long m4035B(int i) {
        switch (i) {
            case 0:
                return 2147483647L;
            case 1:
                return EnumC6459p.f20158c.mo20395b(1.0d);
            case 2:
                return EnumC6459p.f20158c.mo20395b(5.0d);
            case 3:
                return EnumC6459p.f20158c.mo20395b(15.0d);
            case 4:
                return EnumC6459p.f20158c.mo20395b(50.0d);
            case 5:
                return EnumC6459p.f20158c.mo20395b(100.0d);
            case 6:
                return EnumC6459p.f20158c.mo20395b(500.0d);
            default:
                return -1L;
        }
    }

    @Deprecated
    public static void m4026F0(SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        int i = sharedPreferences.getInt("settings_autodownload", 1667457792);
        int i2 = (i >> 8) & 255;
        int i3 = (i >> 16) & 255;
        int i4 = (i >> 24) & 255;
        if ((i2 & 2) != 0) {
            i2 |= 64;
        }
        if ((i3 & 2) != 0) {
            i3 |= 64;
        }
        if ((i4 & 2) != 0) {
            i4 |= 64;
        }
        int i5 = (i2 << 8) | (i3 << 16) | (i4 << 24);
        if (i != i5) {
            editor.putInt("settings_autodownload", i5);
        }
    }

    public static String m4023I(int i) {
        return m4021K(i, C4403w.m27865j1(R.string.fileSize_GB, "∞"));
    }

    public static String m4022J(int i, int i2) {
        StringBuilder sb2 = new StringBuilder();
        String K = m4021K(i, null);
        if (i2 == 127) {
            sb2.append(C4403w.m27869i1(R.string.AnyMedia));
        } else if (K != null) {
            sb2.append(C4403w.m27865j1(R.string.MediaExceedingX, K));
        } else if (i2 == 0) {
            sb2.append(C4403w.m27869i1(R.string.NoRestrictions));
        }
        if (!(i2 == 0 || i2 == 127)) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(m3987j(i2));
        }
        return sb2.toString();
    }

    public static String m4021K(int i, String str) {
        if (i == 0) {
            return str;
        }
        long B = m4035B(i);
        if (B == 2147483647L) {
            return C4403w.m27865j1(R.string.fileSize_GB, "∞");
        }
        return C1363c0.m37423m(B);
    }

    public void m4009W(Client.AbstractC7865g gVar, TdApi.Object object) {
        this.f34409S.mo255t2(object);
        gVar.mo255t2(object);
    }

    public void m4008X(int[] iArr, TdApi.File file, AbstractC10985s0 s0Var) {
        synchronized (iArr) {
            if (iArr[0] == 0) {
                iArr[0] = 3;
                m3986j0(file, s0Var);
                this.f34417a.m2781K9().m1901U(file.f25373id, s0Var);
            }
        }
    }

    public static void m4007Y(boolean[] zArr, TdApi.File file, CountDownLatch countDownLatch, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14709w("getFile error: %s", C4779t2.m25378z5(object));
        } else if (constructor == 766337656) {
            synchronized (zArr) {
                if (!zArr[0]) {
                    zArr[0] = true;
                    C7321e.m16907u((TdApi.File) object, file);
                }
            }
        }
        countDownLatch.countDown();
    }

    public static String m4004a0(String str, int i) {
        if (i == 0) {
            return str;
        }
        return str + "_" + i;
    }

    public static void m4002b0(Iterator<AbstractC10759c> it, TdApi.File file) {
        while (it.hasNext()) {
            it.next().mo3953V0(file);
        }
    }

    public static void m3996e0(Iterator<AbstractC10759c> it, C10930q6 q6Var, int i, int i2, TdApi.File file) {
        while (it.hasNext()) {
            it.next().mo3954R2(q6Var, i, i2, file);
        }
    }

    public static String m3987j(int i) {
        C5146u0 u0Var = new C5146u0(6);
        if ((i & 1) != 0) {
            u0Var.m23816a(R.string.Photos);
        }
        if ((i & 2) != 0) {
            u0Var.m23816a(R.string.Voice);
        }
        if ((i & 64) != 0) {
            u0Var.m23816a(R.string.VideoMessages);
        }
        if ((i & 4) != 0) {
            u0Var.m23816a(R.string.Videos);
        }
        if ((i & 8) != 0) {
            u0Var.m23816a(R.string.Files);
        }
        if ((i & 16) != 0) {
            u0Var.m23816a(R.string.Music);
        }
        if ((i & 32) != 0) {
            u0Var.m23816a(R.string.GIFs);
        }
        return u0Var.m23811f() ? C4403w.m27869i1(R.string.Nothing) : u0Var.m23810g(C4403w.m27854m0(), C4403w.m27850n0(false));
    }

    public String m4037A() {
        return m3987j(this.f34418a0);
    }

    public void m4036A0(int i, AbstractC10760d dVar) {
        this.f34421c.m21021b(Integer.valueOf(i), dVar);
    }

    public void m4034B0(TdApi.File file, AbstractC10759c cVar) {
        synchronized (this) {
            m3989i(file, cVar);
        }
    }

    public int m4033C() {
        return this.f34413W;
    }

    public void m4032C0(final TdApi.File file, TdApi.FileType fileType, long j) {
        TdApi.Function function;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (fileType != null) {
            function = new TdApi.GetRemoteFile(file.remote.f25417id, fileType);
        } else {
            function = new TdApi.GetFile(file.f25373id);
        }
        final boolean[] zArr = new boolean[1];
        this.f34417a.m2270r4().m14783o(function, new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10756j9.m4007Y(zArr, file, countDownLatch, object);
            }
        });
        try {
            if (j > 0) {
                countDownLatch.await(j, TimeUnit.MILLISECONDS);
            } else {
                countDownLatch.await();
            }
        } catch (InterruptedException e) {
            Log.m14718i(e);
        }
        if (!zArr[0]) {
            synchronized (zArr) {
                zArr[0] = true;
            }
        }
    }

    public String m4031D() {
        return m4022J(this.f34413W, this.f34414X);
    }

    public void m4030D0(int i, AbstractC10759c cVar) {
        synchronized (this) {
            m3984k0(i, cVar);
        }
    }

    public int m4029E() {
        return this.f34415Y;
    }

    public void m4028E0(int i, AbstractC10760d dVar) {
        this.f34421c.m21016g(Integer.valueOf(i), dVar);
    }

    public String m4027F() {
        return m4022J(this.f34415Y, this.f34416Z);
    }

    public String m4025G() {
        return m4022J(this.f34411U, this.f34412V);
    }

    public int m4024H() {
        return this.f34411U;
    }

    public int m4020L() {
        return this.f34414X;
    }

    public int m4019M() {
        return this.f34416Z;
    }

    public int m4018N() {
        return this.f34412V;
    }

    public int m4017O() {
        int i = this.f34410T;
        if ((i & 16) != 0) {
            return 2;
        }
        if ((i & 8) != 0) {
            return 1;
        }
        return (i & 32) != 0 ? 3 : 0;
    }

    public boolean m4016P(int i) {
        boolean z;
        synchronized (this) {
            z = this.f34404N.indexOfKey(i) >= 0;
        }
        return z;
    }

    public boolean m4015Q() {
        return m4014R() || m4011U();
    }

    public boolean m4014R() {
        return (this.f34410T & 1) != 0;
    }

    public boolean m4013S() {
        return (this.f34410T & 2) != 0;
    }

    public boolean m4012T() {
        return (this.f34410T & 4) != 0;
    }

    public boolean m4011U() {
        return m4010V(this.f34417a.m2930B4().m4694g3().m28148e());
    }

    public final boolean m4010V(int i) {
        if (Build.VERSION.SDK_INT < 24 || !this.f34417a.m2930B4().m4694g3().m28141l()) {
            return i != 0 ? i == 2 && (this.f34410T & 4) != 0 : (this.f34410T & 2) != 0;
        }
        return true;
    }

    public final void m4006Z() {
        C4868i c2 = C4868i.m24726c2();
        int w6 = this.f34417a.m2188w6();
        this.f34410T = c2.m24779V0(m4004a0("settings_datasaver", w6), 4);
        int V0 = c2.m24779V0(m4004a0("settings_autodownload", w6), 1667457792);
        this.f34418a0 = (V0 >> 8) & 255;
        this.f34420b0 = (V0 >> 16) & 255;
        this.f34422c0 = (V0 >> 24) & 255;
        int V02 = c2.m24779V0(m4004a0("settings_limit_wifi", w6), 4);
        this.f34412V = (V02 >> 24) & 255;
        this.f34411U = V02 & 16777215;
        int V03 = c2.m24779V0(m4004a0("settings_limit_mobile", w6), 3);
        this.f34414X = (V03 >> 24) & 255;
        this.f34413W = V03 & 16777215;
        int V04 = c2.m24779V0(m4004a0("settings_limit_roaming", w6), 2);
        this.f34416Z = (V04 >> 24) & 255;
        this.f34415Y = V04 & 16777215;
    }

    public final void m4000c0(TdApi.File file) {
        m4002b0(this.f34403M.iterator(), file);
        Iterator<AbstractC10759c> d = this.f34419b.m21019d(Integer.valueOf(file.f25373id));
        if (d != null) {
            m4002b0(d, file);
        }
    }

    public final void m3998d0(int i, int i2, TdApi.File file) {
        m3996e0(this.f34403M.iterator(), this.f34417a, i, i2, file);
        Iterator<AbstractC10759c> d = this.f34419b.m21019d(Integer.valueOf(i));
        if (d != null) {
            m3996e0(d, this.f34417a, i, i2, file);
        }
    }

    public void m3994f0(TdApi.UpdateFile updateFile) {
        synchronized (this) {
            int i = updateFile.file.f25373id;
            int i2 = this.f34404N.get(i);
            this.f34408R.remove(Integer.valueOf(i));
            if (i2 == 0) {
                m3998d0(i, 2, updateFile.file);
            } else if (C4779t2.m25586V2(updateFile.file)) {
                m3982l0(i);
                m3998d0(i, 2, updateFile.file);
            } else {
                m3998d0(i, 1, updateFile.file);
            }
        }
    }

    public void m3993g(TdApi.File file, int i, AbstractC10985s0 s0Var, boolean z, boolean z2) {
        synchronized (this.f34406P) {
            List<AbstractC10985s0> e = this.f34406P.m21471e(file.f25373id);
            if (e != null) {
                if (!z && e.contains(s0Var)) {
                    throw new IllegalStateException();
                }
                e.add(s0Var);
                if (z2) {
                    m3974p0(file, i, 0);
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(s0Var);
            this.f34406P.m21466j(file.f25373id, arrayList);
            if (!file.local.isDownloadingActive) {
                synchronized (this) {
                    if (this.f34404N.get(file.f25373id) == 0) {
                        this.f34407Q.put(file.f25373id, 1);
                        m3971r(file.f25373id, 3, i);
                    }
                }
            } else if (z2) {
                m3974p0(file, i, 0);
            }
        }
    }

    public void m3992g0(TdApi.UpdateFile updateFile) {
        synchronized (this) {
            if (C4779t2.m25431s1(updateFile.file) > 0.0f) {
                this.f34405O.put(Integer.valueOf(updateFile.file.f25373id), updateFile.file);
            }
            m4000c0(updateFile.file);
        }
    }

    public void m3991h(TdApi.File file, AbstractC10985s0 s0Var, boolean z) {
        m3993g(file, 0, s0Var, z, false);
    }

    public void m3990h0(TdApi.UpdateFile updateFile) {
        synchronized (this) {
            if (this.f34404N.get(updateFile.file.f25373id) != 0) {
                TdApi.File file = updateFile.file;
                TdApi.RemoteFile remoteFile = file.remote;
                if (!remoteFile.isUploadingActive) {
                    TdApi.LocalFile localFile = file.local;
                    if (!localFile.isDownloadingActive && !remoteFile.isUploadingCompleted && !localFile.isDownloadingCompleted) {
                        m3982l0(file.f25373id);
                        m3998d0(updateFile.file.f25373id, 0, null);
                    }
                }
            }
            Iterator<AbstractC10760d> d = this.f34421c.m21019d(Integer.valueOf(updateFile.file.f25373id));
            if (d != null) {
                while (d.hasNext()) {
                    d.next().mo3952i(updateFile.file);
                }
            }
        }
    }

    @Override
    public void mo1528h5(C10930q6 q6Var, int i, boolean z) {
    }

    public final boolean m3989i(TdApi.File file, AbstractC10759c cVar) {
        if (!this.f34419b.m21021b(Integer.valueOf(file.f25373id), cVar) || this.f34404N.get(file.f25373id) == 0) {
            return true;
        }
        cVar.mo3954R2(this.f34417a, file.f25373id, 1, null);
        TdApi.File file2 = this.f34405O.get(Integer.valueOf(file.f25373id));
        if (file2 == null) {
            return false;
        }
        C7321e.m16907u(file2, file);
        if (C4779t2.m25431s1(file) <= 0.0f) {
            return false;
        }
        cVar.mo3953V0(file);
        return false;
    }

    public void m3988i0(TdApi.UpdateFile updateFile) {
        synchronized (this) {
            int i = updateFile.file.f25373id;
            if (this.f34404N.get(i) != 0) {
                m3982l0(i);
            }
            m3998d0(i, 0, updateFile.file);
        }
    }

    public void m3986j0(TdApi.File file, AbstractC10985s0 s0Var) {
        synchronized (this.f34406P) {
            int g = this.f34406P.m21469g(file.f25373id);
            if (g >= 0) {
                List<AbstractC10985s0> o = this.f34406P.m21462o(g);
                if (o != null) {
                    if (o.remove(s0Var)) {
                        if (o.isEmpty()) {
                            this.f34406P.m21464l(g);
                            synchronized (this) {
                                int indexOfKey = this.f34407Q.indexOfKey(file.f25373id);
                                boolean z = indexOfKey >= 0;
                                if (z) {
                                    this.f34407Q.removeAt(indexOfKey);
                                }
                                if (this.f34404N.get(file.f25373id) != 0 && z) {
                                    this.f34417a.m2270r4().m14783o(new TdApi.CancelDownloadFile(file.f25373id, false), this.f34409S);
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

    public boolean m3985k(TdApi.File file, int i, TdApi.ChatType chatType) {
        int i2;
        int i3;
        int i4;
        if (m4015Q() || file.remote.isUploadingActive) {
            return false;
        }
        int e = this.f34417a.m2930B4().m4694g3().m28148e();
        if (e == 1) {
            i3 = this.f34411U;
            i2 = this.f34412V;
        } else if (e != 2) {
            i3 = this.f34413W;
            i2 = this.f34414X;
        } else {
            i3 = this.f34415Y;
            i2 = this.f34416Z;
        }
        if (file.size > m4035B(i3) || (i2 & i) != 0) {
            return false;
        }
        if (chatType == null) {
            i4 = 99;
        } else {
            switch (chatType.getConstructor()) {
                case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                    if (!C4779t2.m25699E3(chatType)) {
                        i4 = this.f34422c0;
                        break;
                    } else {
                        i4 = this.f34420b0;
                        break;
                    }
                case TdApi.ChatTypeSecret.CONSTRUCTOR:
                case TdApi.ChatTypePrivate.CONSTRUCTOR:
                    i4 = this.f34418a0;
                    break;
                case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                    i4 = this.f34420b0;
                    break;
                default:
                    return false;
            }
        }
        if ((i & i4) == 0) {
            return false;
        }
        return !this.f34408R.contains(Integer.valueOf(file.f25373id));
    }

    public final void m3984k0(int i, AbstractC10759c cVar) {
        this.f34419b.m21016g(Integer.valueOf(i), cVar);
    }

    public void m3983l() {
        synchronized (this) {
            for (int size = this.f34404N.size() - 1; size >= 0; size--) {
                int valueAt = this.f34404N.valueAt(size);
                if (valueAt == 1) {
                    m3979n(this.f34404N.keyAt(size), valueAt, false);
                }
            }
        }
    }

    public final void m3982l0(int i) {
        this.f34404N.delete(i);
        this.f34405O.remove(Integer.valueOf(i));
    }

    public boolean m3981m(int i, boolean z, boolean z2) {
        synchronized (this) {
            int i2 = this.f34404N.get(i);
            if (i2 == 0) {
                return false;
            }
            if (z2) {
                this.f34408R.add(Integer.valueOf(i));
            }
            m3979n(i, i2, z);
            this.f34417a.m2930B4().m4636w2().m7058e1(i);
            return true;
        }
    }

    public final void m3980m0() {
        C4868i.m24726c2().m24581u3(m4004a0("settings_autodownload", this.f34417a.m2188w6()), (this.f34418a0 << 8) | (this.f34420b0 << 16) | (this.f34422c0 << 24));
    }

    public final void m3979n(int i, int i2, boolean z) {
        if (i2 == 1) {
            if (Log.isEnabled(Log.TAG_TDLIB_FILES)) {
                Log.m14721i((int) Log.TAG_TDLIB_FILES, "cancelDownloadFile id=%d", Integer.valueOf(i));
            }
            this.f34417a.m2270r4().m14783o(new TdApi.CancelDownloadFile(i, z), this.f34409S);
        }
    }

    public final void m3978n0() {
        C4868i.m24726c2().m24581u3(m4004a0("settings_datasaver", this.f34417a.m2188w6()), this.f34410T);
    }

    public boolean m3977o(TdApi.File file, TdApi.ChatType chatType, int i, boolean z) {
        synchronized (this) {
            if (!m3985k(file, i, chatType) || (C4779t2.m25598T2(file) && !z)) {
                return false;
            }
            m3975p(file);
            return true;
        }
    }

    public void m3976o0(TdApi.File file, AbstractC10985s0 s0Var, int i) {
        synchronized (this.f34406P) {
            if (!C4779t2.m25620P5(file, i)) {
                List<AbstractC10985s0> e = this.f34406P.m21471e(file.f25373id);
                if (e != null && e.contains(s0Var)) {
                    m3974p0(file, i, 0);
                }
            }
        }
    }

    public void m3975p(TdApi.File file) {
        m3973q(file, 1, 0, 0, null);
    }

    public final void m3974p0(TdApi.File file, int i, int i2) {
        if (!C4779t2.m25620P5(file, i) && this.f34404N.get(file.f25373id) == 1) {
            Log.m14719i("FILES: downloadFile %d offset=%d", Integer.valueOf(file.f25373id), Integer.valueOf(i));
            this.f34417a.m2270r4().m14783o(new TdApi.DownloadFile(file.f25373id, 3, i, i2, false), this.f34409S);
        }
    }

    public void m3973q(TdApi.File file, int i, int i2, int i3, Client.AbstractC7865g gVar) {
        synchronized (this) {
            this.f34408R.remove(Integer.valueOf(file.f25373id));
            if (!C4779t2.m25598T2(file)) {
                m3969s(file.f25373id, i, i2, 0, gVar);
            } else if (gVar != null) {
                this.f34417a.m2270r4().m14783o(new TdApi.DownloadFile(file.f25373id, i, i2, i3, false), gVar);
            }
        }
    }

    public boolean m3972q0(boolean z) {
        int i = this.f34410T;
        if (((i & 1) != 0) == z) {
            return false;
        }
        this.f34410T = i ^ 1;
        if (z) {
            m3983l();
        }
        m3978n0();
        return true;
    }

    public final void m3971r(int i, int i2, int i3) {
        m3969s(i, i2, i3, 0, null);
    }

    public boolean m3970r0(int i) {
        int i2 = this.f34410T;
        if ((i2 & 1) != 0) {
            i |= 1;
        }
        if (i2 == i) {
            return false;
        }
        boolean Q = m4015Q();
        this.f34410T = i;
        if (m4015Q() && !Q) {
            m3983l();
        }
        m3978n0();
        return true;
    }

    public final void m3969s(int i, int i2, int i3, int i4, final Client.AbstractC7865g gVar) {
        if (this.f34404N.get(i) == 0) {
            this.f34404N.put(i, 1);
            m3998d0(i, 1, null);
            if (Log.isEnabled(Log.TAG_TDLIB_FILES)) {
                Log.m14721i((int) Log.TAG_TDLIB_FILES, "downloadFileInternal id=%d priority=%d offset=%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
            if (gVar != null) {
                this.f34417a.m2270r4().m14783o(new TdApi.DownloadFile(i, i2, i3, i4, false), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        C10756j9.this.m4009W(gVar, object);
                    }
                });
            } else {
                this.f34417a.m2270r4().m14783o(new TdApi.DownloadFile(i, i2, i3, i4, false), this.f34409S);
            }
        }
    }

    public boolean m3968s0(boolean z, boolean z2) {
        int i = this.f34410T & (-3) & (-5);
        if (z) {
            i |= 2;
        }
        if (z2) {
            i |= 4;
        }
        return m3970r0(i);
    }

    public Runnable m3967t(final TdApi.File file, long j, AbstractC5918j<TdApi.File> jVar, AbstractC5918j<TdApi.File> jVar2) {
        if (C4779t2.m25598T2(file)) {
            return null;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        CountDownLatch countDownLatch = i >= 0 ? new CountDownLatch(1) : null;
        final int[] iArr = new int[1];
        final C10757a aVar = new C10757a(iArr, jVar, jVar2, file, countDownLatch);
        this.f34417a.m2781K9().m1835m(file.f25373id, aVar);
        m3991h(file, aVar, false);
        if (countDownLatch == null) {
            return new Runnable() {
                @Override
                public final void run() {
                    C10756j9.this.m4008X(iArr, file, aVar);
                }
            };
        }
        try {
            if (i > 0) {
                countDownLatch.await(j, TimeUnit.MILLISECONDS);
            } else {
                countDownLatch.await();
            }
        } catch (InterruptedException e) {
            Log.m14718i(e);
        }
        synchronized (iArr) {
            if (iArr[0] == 0) {
                if (jVar == null) {
                    iArr[0] = 3;
                    m3986j0(file, aVar);
                    this.f34417a.m2781K9().m1901U(file.f25373id, aVar);
                } else {
                    iArr[0] = 2;
                }
            }
        }
        return null;
    }

    public boolean m3966t0(int i) {
        if (this.f34422c0 == i) {
            return false;
        }
        this.f34422c0 = i;
        m3980m0();
        return true;
    }

    @Override
    public void mo1527u(boolean z) {
        if (z) {
            m3983l();
        }
    }

    public boolean m3965u0(int i) {
        if (this.f34420b0 == i) {
            return false;
        }
        this.f34420b0 = i;
        m3980m0();
        return true;
    }

    public int m3964v() {
        return this.f34422c0;
    }

    public boolean m3963v0(int i) {
        if (this.f34418a0 == i) {
            return false;
        }
        this.f34418a0 = i;
        m3980m0();
        return true;
    }

    @Override
    public void mo1526v6(int i, int i2) {
        if (!m4010V(i) && m4010V(i2)) {
            m3983l();
        }
    }

    public String m3962w() {
        return m3987j(this.f34422c0);
    }

    public boolean m3961w0(int i, int i2) {
        if (this.f34414X == i && this.f34413W == i2) {
            return false;
        }
        this.f34414X = i;
        this.f34413W = i2;
        C4868i.m24726c2().m24581u3(m4004a0("settings_limit_mobile", this.f34417a.m2188w6()), (this.f34414X << 24) | (this.f34413W & 16777215));
        return true;
    }

    public int m3960x() {
        return this.f34420b0;
    }

    public boolean m3959x0(int i, int i2) {
        if (this.f34416Z == i && this.f34415Y == i2) {
            return false;
        }
        this.f34416Z = i;
        this.f34415Y = i2;
        C4868i.m24726c2().m24581u3(m4004a0("settings_limit_roaming", this.f34417a.m2188w6()), (this.f34416Z << 24) | (this.f34415Y & 16777215));
        return true;
    }

    public String m3958y() {
        return m3987j(this.f34420b0);
    }

    public boolean m3957y0(int i, int i2) {
        if (this.f34412V == i && this.f34411U == i2) {
            return false;
        }
        this.f34412V = i;
        this.f34411U = i2;
        C4868i.m24726c2().m24581u3(m4004a0("settings_limit_wifi", this.f34417a.m2188w6()), (this.f34412V << 24) | (this.f34411U & 16777215));
        return true;
    }

    public int m3956z() {
        return this.f34418a0;
    }

    public boolean m3955z0(int i) {
        int i2 = this.f34410T;
        int i3 = (i == 2 ? 16 : i == 1 ? 8 : i == 3 ? 32 : 0) | (i2 & (-9) & (-17) & (-33));
        if (i2 == i3) {
            return false;
        }
        this.f34410T = i3;
        m3978n0();
        return true;
    }
}
