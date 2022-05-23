package md;

import android.content.SharedPreferences;
import android.os.SystemClock;
import gd.m;
import hd.t2;
import ib.g;
import ib.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import me.vkryl.leveldb.LevelDB;
import org.thunderdog.challegram.Log;

public class y {
    public static y f17479e;
    public long f17482c;
    public final m f17480a = new m("LottieGenerationThread");
    public final m f17481b = new m("LottieGenerationThread2");
    public Runnable f17483d = new Runnable() {
        @Override
        public final void run() {
            y.this.i();
        }
    };

    public static class a implements Comparable<a> {
        public final String M;
        public final String N;
        public final String f17484a;
        public final long f17485b;
        public final int f17486c;

        public a(String str, long j10) {
            this.f17484a = str;
            this.f17485b = j10;
            String[] split = str.substring(7).split("/", 3);
            if (split.length == 3) {
                int t10 = i.t(split[0], -1);
                this.f17486c = t10;
                if (t10 != -1) {
                    String str2 = split[1];
                    this.M = str2;
                    String str3 = split[2];
                    this.N = str3;
                    if (i.i(str2) || i.i(str3)) {
                        throw new IllegalArgumentException(str);
                    }
                    return;
                }
                throw new IllegalArgumentException(str);
            }
            throw new IllegalArgumentException(str);
        }

        public static boolean c(String str) {
            String[] split = str.substring(7).split("/", 3);
            if (split.length != 3 || i.t(split[0], -1) == -1) {
                return false;
            }
            return !i.i(split[1]) && !i.i(split[2]);
        }

        public int compareTo(a aVar) {
            return Long.compare(this.f17485b, aVar.f17485b);
        }

        public File b(File file) {
            return new File(new File(new File(file, Integer.toString(this.f17486c)), this.M), this.N);
        }
    }

    public static void h(File file, a aVar, SharedPreferences.Editor editor) {
        File b10 = aVar.b(file);
        if (!b10.exists() || b10.delete()) {
            editor.remove(aVar.f17484a);
        }
    }

    public static File j() {
        return new File(t2.J0(true), "tgs");
    }

    public static File k(int i10, int i11, boolean z10, String str) {
        String str2;
        File j10 = j();
        if (!j10.exists() && !j10.mkdir()) {
            return null;
        }
        File file = new File(j10, Integer.toString(i10));
        if (!file.exists() && !file.mkdir()) {
            return null;
        }
        if (z10) {
            str2 = "thumbs" + i11;
        } else {
            str2 = Integer.toString(i11);
        }
        if (!i.i(str)) {
            str2 = str2 + "_" + str;
        }
        File file2 = new File(file, str2);
        if (file2.exists() || file2.mkdir()) {
            return file2;
        }
        return null;
    }

    public static File l(j jVar, boolean z10, int i10, int i11, long j10, int i12) {
        if (z10) {
            j10 = 0;
        }
        String num = i11 != 0 ? Integer.toString(i11) : null;
        int A6 = jVar.N().A6();
        File k10 = k(A6, i10, z10, num);
        if (k10 == null) {
            return null;
        }
        File file = new File(jVar.f());
        if (j10 > 0) {
            String m10 = m(A6, z10, i10, num, file.getName());
            he.i.c2().n3().putLong(m10, System.currentTimeMillis() + j10);
            n().s(i12, m10);
            n().t(j10, false);
        }
        return new File(k10, file.getName());
    }

    public static String m(int i10, boolean z10, int i11, String str, String str2) {
        Object obj;
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("lottie_");
        sb2.append(i10);
        sb2.append("/");
        if (z10) {
            obj = "thumbs" + i11;
        } else {
            obj = Integer.valueOf(i11);
        }
        sb2.append(obj);
        if (!i.i(str)) {
            str3 = "_" + str;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append("/");
        sb2.append(str2);
        String sb3 = sb2.toString();
        if (a.c(sb3)) {
            return sb3;
        }
        throw new IllegalArgumentException(sb3);
    }

    public static y n() {
        if (f17479e == null) {
            synchronized (y.class) {
                if (f17479e == null) {
                    f17479e = new y();
                }
            }
        }
        return f17479e;
    }

    public void o(boolean z10, File file, int i10, j jVar, int i11) {
        if (z10) {
            file.delete();
            return;
        }
        String m10 = m(jVar.f17423a.a(), z10, i11, i10 != 0 ? Integer.toString(i10) : null, new File(jVar.f()).getName());
        long e12 = he.i.c2().e1(m10, 0L);
        if (e12 == 0 || System.currentTimeMillis() >= e12) {
            file.delete();
            he.i.c2().F3(m10);
            i();
        }
    }

    public static boolean p(File file, String str) {
        return "0".equals(str) || str.startsWith("thumbs");
    }

    public void q() {
        File j10 = j();
        File[] listFiles = j10.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                File[] listFiles2 = file.listFiles(t.f17471a);
                if (listFiles2 != null) {
                    for (File file2 : listFiles2) {
                        g.b(file2, true);
                    }
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        LevelDB n32 = he.i.c2().n3();
        LevelDB levelDB = null;
        ArrayList arrayList = null;
        long j11 = -1;
        for (LevelDB.a aVar : n32.g("lottie_")) {
            try {
                a aVar2 = new a(aVar.l(), aVar.i());
                long j12 = aVar2.f17485b;
                if (currentTimeMillis >= j12) {
                    if (levelDB == null) {
                        levelDB = n32.edit();
                    }
                    h(j10, aVar2, levelDB);
                } else {
                    if (j11 != -1) {
                        j12 = Math.min(j11, j12);
                    }
                    j11 = j12;
                }
            } catch (IllegalArgumentException e10) {
                Log.e("Bad lottie cache key: %s", e10, new Object[0]);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(aVar.l());
            }
        }
        if (levelDB != null) {
            levelDB.apply();
        }
        if (j11 != -1) {
            t(j11 - currentTimeMillis, true);
        } else {
            e();
        }
    }

    public static void r(int i10, String str) {
        int i11;
        LevelDB n32 = he.i.c2().n3();
        File j10 = j();
        ArrayList arrayList = new ArrayList();
        Iterator<LevelDB.a> it = n32.g("lottie_").iterator();
        LevelDB levelDB = null;
        ArrayList<String> arrayList2 = null;
        while (true) {
            i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            LevelDB.a next = it.next();
            try {
                arrayList.add(new a(next.l(), next.i()));
            } catch (IllegalArgumentException e10) {
                Log.e("Bad lottie cache key: %s", e10, new Object[0]);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(next.l());
            }
        }
        if (arrayList2 != null) {
            n32.edit();
            for (String str2 : arrayList2) {
                n32.remove(str2);
            }
            n32.apply();
        }
        Collections.sort(arrayList);
        int size = arrayList.size() - i10;
        while (size > 0 && i11 < arrayList.size()) {
            i11++;
            a aVar = (a) arrayList.get(i11);
            if (!aVar.f17484a.equals(str)) {
                if (levelDB == null) {
                    levelDB = n32.edit();
                }
                h(j10, aVar, levelDB);
                size--;
            }
        }
        if (levelDB != null) {
            levelDB.apply();
        }
    }

    public final void e() {
        if (this.f17482c != 0) {
            this.f17480a.d().removeCallbacks(this.f17483d);
            this.f17482c = 0L;
        }
    }

    public void f(final j jVar, final File file, final boolean z10, final int i10, final int i11) {
        this.f17480a.e(new Runnable() {
            @Override
            public final void run() {
                y.this.o(z10, file, i11, jVar, i10);
            }
        }, 0L);
    }

    public boolean g() {
        if (!g.b(j(), true)) {
            return false;
        }
        he.i.c2().n3().N("lottie_");
        e();
        return true;
    }

    public void i() {
        this.f17480a.e(new Runnable() {
            @Override
            public final void run() {
                y.this.q();
            }
        }, 0L);
    }

    public final void s(final int i10, final String str) {
        this.f17480a.e(new Runnable() {
            @Override
            public final void run() {
                y.r(i10, str);
            }
        }, 0L);
    }

    public final void t(long j10, boolean z10) {
        if (this.f17482c == 0 || SystemClock.uptimeMillis() + j10 < this.f17482c || z10) {
            e();
            this.f17482c = SystemClock.uptimeMillis() + j10;
            this.f17480a.e(this.f17483d, j10);
        }
    }

    public m u(boolean z10) {
        return z10 ? this.f17480a : this.f17481b;
    }
}
