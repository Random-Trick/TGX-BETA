package p168ld;

import android.content.SharedPreferences;
import android.os.SystemClock;
import gd.C4779t2;
import ge.C4868i;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import me.vkryl.leveldb.LevelDB;
import org.thunderdog.challegram.Log;
import p082fd.C4384m;
import p108hb.C5068g;
import p108hb.C5070i;

public class C6522y {
    public static C6522y f20322e;
    public long f20325c;
    public final C4384m f20323a = new C4384m("LottieGenerationThread");
    public final C4384m f20324b = new C4384m("LottieGenerationThread2");
    public Runnable f20326d = new Runnable() {
        @Override
        public final void run() {
            C6522y.this.m20168i();
        }
    };

    public static class C6523a implements Comparable<C6523a> {
        public final String f20327M;
        public final String f20328N;
        public final String f20329a;
        public final long f20330b;
        public final int f20331c;

        public C6523a(String str, long j) {
            this.f20329a = str;
            this.f20330b = j;
            String[] split = str.substring(7).split("/", 3);
            if (split.length == 3) {
                int t = C5070i.m24050t(split[0], -1);
                this.f20331c = t;
                if (t != -1) {
                    String str2 = split[1];
                    this.f20327M = str2;
                    String str3 = split[2];
                    this.f20328N = str3;
                    if (C5070i.m24061i(str2) || C5070i.m24061i(str3)) {
                        throw new IllegalArgumentException(str);
                    }
                    return;
                }
                throw new IllegalArgumentException(str);
            }
            throw new IllegalArgumentException(str);
        }

        public static boolean m20153c(String str) {
            String[] split = str.substring(7).split("/", 3);
            if (split.length != 3 || C5070i.m24050t(split[0], -1) == -1) {
                return false;
            }
            return !C5070i.m24061i(split[1]) && !C5070i.m24061i(split[2]);
        }

        public int compareTo(C6523a aVar) {
            return Long.compare(this.f20330b, aVar.f20330b);
        }

        public File m20154b(File file) {
            return new File(new File(new File(file, Integer.toString(this.f20331c)), this.f20327M), this.f20328N);
        }
    }

    public static void m20169h(File file, C6523a aVar, SharedPreferences.Editor editor) {
        File b = aVar.m20154b(file);
        if (!b.exists() || b.delete()) {
            editor.remove(aVar.f20329a);
        }
    }

    public static File m20167j() {
        return new File(C4779t2.m25667J0(true), "tgs");
    }

    public static File m20166k(int i, int i2, boolean z, String str) {
        String str2;
        File j = m20167j();
        if (!j.exists() && !j.mkdir()) {
            return null;
        }
        File file = new File(j, Integer.toString(i));
        if (!file.exists() && !file.mkdir()) {
            return null;
        }
        if (z) {
            str2 = "thumbs" + i2;
        } else {
            str2 = Integer.toString(i2);
        }
        if (!C5070i.m24061i(str)) {
            str2 = str2 + "_" + str;
        }
        File file2 = new File(file, str2);
        if (file2.exists() || file2.mkdir()) {
            return file2;
        }
        return null;
    }

    public static File m20165l(C6503j jVar, boolean z, int i, int i2, long j, int i3) {
        if (z) {
            j = 0;
        }
        String num = i2 != 0 ? Integer.toString(i2) : null;
        int w6 = jVar.m20292N().m2188w6();
        File k = m20166k(w6, i, z, num);
        if (k == null) {
            return null;
        }
        File file = new File(jVar.m20285f());
        if (j > 0) {
            String m = m20164m(w6, z, i, num, file.getName());
            C4868i.m24726c2().m24637n3().putLong(m, System.currentTimeMillis() + j);
            m20163n().m20158s(i3, m);
            m20163n().m20157t(j, false);
        }
        return new File(k, file.getName());
    }

    public static String m20164m(int i, boolean z, int i2, String str, String str2) {
        Object obj;
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("lottie_");
        sb2.append(i);
        sb2.append("/");
        if (z) {
            obj = "thumbs" + i2;
        } else {
            obj = Integer.valueOf(i2);
        }
        sb2.append(obj);
        if (!C5070i.m24061i(str)) {
            str3 = "_" + str;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append("/");
        sb2.append(str2);
        String sb3 = sb2.toString();
        if (C6523a.m20153c(sb3)) {
            return sb3;
        }
        throw new IllegalArgumentException(sb3);
    }

    public static C6522y m20163n() {
        if (f20322e == null) {
            synchronized (C6522y.class) {
                if (f20322e == null) {
                    f20322e = new C6522y();
                }
            }
        }
        return f20322e;
    }

    public void m20162o(boolean z, File file, int i, C6503j jVar, int i2) {
        if (z) {
            file.delete();
            return;
        }
        String m = m20164m(jVar.f20249a.mo1484a(), z, i2, i != 0 ? Integer.toString(i) : null, new File(jVar.m20285f()).getName());
        long e1 = C4868i.m24726c2().m24711e1(m, 0L);
        if (e1 == 0 || System.currentTimeMillis() >= e1) {
            file.delete();
            C4868i.m24726c2().m24888F3(m);
            m20168i();
        }
    }

    public static boolean m20161p(File file, String str) {
        return "0".equals(str) || str.startsWith("thumbs");
    }

    public void m20160q() {
        File j = m20167j();
        File[] listFiles = j.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                File[] listFiles2 = file.listFiles(C6517t.f20311a);
                if (listFiles2 != null) {
                    for (File file2 : listFiles2) {
                        C5068g.m24101b(file2, true);
                    }
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        LevelDB n3 = C4868i.m24726c2().m24637n3();
        LevelDB levelDB = null;
        ArrayList arrayList = null;
        long j2 = -1;
        for (LevelDB.C7052a aVar : n3.m17974g("lottie_")) {
            try {
                C6523a aVar2 = new C6523a(aVar.m17943l(), aVar.m17946i());
                long j3 = aVar2.f20330b;
                if (currentTimeMillis >= j3) {
                    if (levelDB == null) {
                        levelDB = n3.edit();
                    }
                    m20169h(j, aVar2, levelDB);
                } else {
                    if (j2 != -1) {
                        j3 = Math.min(j2, j3);
                    }
                    j2 = j3;
                }
            } catch (IllegalArgumentException e) {
                Log.m14725e("Bad lottie cache key: %s", e, new Object[0]);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(aVar.m17943l());
            }
        }
        if (levelDB != null) {
            levelDB.apply();
        }
        if (j2 != -1) {
            m20157t(j2 - currentTimeMillis, true);
        } else {
            m20172e();
        }
    }

    public static void m20159r(int i, String str) {
        int i2;
        LevelDB n3 = C4868i.m24726c2().m24637n3();
        File j = m20167j();
        ArrayList arrayList = new ArrayList();
        Iterator<LevelDB.C7052a> it = n3.m17974g("lottie_").iterator();
        LevelDB levelDB = null;
        ArrayList<String> arrayList2 = null;
        while (true) {
            i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            LevelDB.C7052a next = it.next();
            try {
                arrayList.add(new C6523a(next.m17943l(), next.m17946i()));
            } catch (IllegalArgumentException e) {
                Log.m14725e("Bad lottie cache key: %s", e, new Object[0]);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(next.m17943l());
            }
        }
        if (arrayList2 != null) {
            n3.edit();
            for (String str2 : arrayList2) {
                n3.remove(str2);
            }
            n3.apply();
        }
        Collections.sort(arrayList);
        int size = arrayList.size() - i;
        while (size > 0 && i2 < arrayList.size()) {
            i2++;
            C6523a aVar = (C6523a) arrayList.get(i2);
            if (!aVar.f20329a.equals(str)) {
                if (levelDB == null) {
                    levelDB = n3.edit();
                }
                m20169h(j, aVar, levelDB);
                size--;
            }
        }
        if (levelDB != null) {
            levelDB.apply();
        }
    }

    public final void m20172e() {
        if (this.f20325c != 0) {
            this.f20323a.m28053d().removeCallbacks(this.f20326d);
            this.f20325c = 0L;
        }
    }

    public void m20171f(final C6503j jVar, final File file, final boolean z, final int i, final int i2) {
        this.f20323a.m28052e(new Runnable() {
            @Override
            public final void run() {
                C6522y.this.m20162o(z, file, i2, jVar, i);
            }
        }, 0L);
    }

    public boolean m20170g() {
        if (!C5068g.m24101b(m20167j(), true)) {
            return false;
        }
        C4868i.m24726c2().m24637n3().m17990N("lottie_");
        m20172e();
        return true;
    }

    public void m20168i() {
        this.f20323a.m28052e(new Runnable() {
            @Override
            public final void run() {
                C6522y.this.m20160q();
            }
        }, 0L);
    }

    public final void m20158s(final int i, final String str) {
        this.f20323a.m28052e(new Runnable() {
            @Override
            public final void run() {
                C6522y.m20159r(i, str);
            }
        }, 0L);
    }

    public final void m20157t(long j, boolean z) {
        if (this.f20325c == 0 || SystemClock.uptimeMillis() + j < this.f20325c || z) {
            m20172e();
            this.f20325c = SystemClock.uptimeMillis() + j;
            this.f20323a.m28052e(this.f20326d, j);
        }
    }

    public C4384m m20156u(boolean z) {
        return z ? this.f20323a : this.f20324b;
    }
}
