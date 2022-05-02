package p082fd;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import be.C1357a0;
import be.C1379j0;
import gd.C4812v2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p143k0.C6035e;
import p156kd.C6246h;
import p156kd.C6253l;

public class C4356b0 {
    public static final String f14431b;
    public static C4356b0 f14432c;
    public C4361c0 f14433a = new C4361c0();

    public static class C4357a {
        public final ArrayList<C4358b> f14434a;
        public final C4358b f14435b;
        public final C4358b f14436c;

        public C4357a(ArrayList<C6246h> arrayList, ArrayList<C6246h> arrayList2, C6035e<C4358b> eVar) {
            this.f14434a = new ArrayList<>(eVar.m21497p());
            C4358b bVar = new C4358b(Long.MIN_VALUE, arrayList, R.string.AllMedia);
            this.f14435b = bVar;
            bVar.m28166p(5);
            C4358b bVar2 = new C4358b(-9223372036854775807L, arrayList2, R.string.AllVideos);
            this.f14436c = bVar2;
            bVar2.m28166p(4);
            int p = eVar.m21497p();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (int i = 0; i < p; i++) {
                C4358b q = eVar.m21496q(i);
                this.f14434a.add(q);
                if (!z && q.m28169m()) {
                    q.m28166p(3);
                    z = true;
                } else if (!z2 && q.m28168n()) {
                    q.m28166p(1);
                    z2 = true;
                } else if (!z3 && q.m28167o()) {
                    q.m28166p(2);
                    z3 = true;
                }
            }
            if (!arrayList.isEmpty()) {
                this.f14434a.add(this.f14435b);
                if (!arrayList2.isEmpty() && arrayList2.size() < arrayList.size()) {
                    this.f14434a.add(this.f14436c);
                }
                Collections.sort(this.f14434a, C4354a0.f14429a);
            }
        }

        public static int m28182j(C4358b bVar, C4358b bVar2) {
            int j = bVar.m28172j();
            int j2 = bVar2.m28172j();
            return j != j2 ? Integer.compare(j2, j) : Long.compare(bVar.m28178d(), bVar2.m28178d());
        }

        public ArrayList<C6246h> m28190b() {
            return this.f14435b.f14439c;
        }

        public C4358b m28189c() {
            return this.f14435b;
        }

        public int m28188d() {
            return this.f14434a.size();
        }

        public C4358b m28187e(int i) {
            return this.f14434a.get(i);
        }

        public ArrayList<C4358b> m28186f() {
            return this.f14434a;
        }

        public C4358b m28185g() {
            return this.f14435b;
        }

        public int m28184h(long j) {
            if (this.f14434a.isEmpty()) {
                return -1;
            }
            int i = 0;
            Iterator<C4358b> it = this.f14434a.iterator();
            while (it.hasNext()) {
                if (it.next().m28178d() == j) {
                    return i;
                }
                i++;
            }
            return -1;
        }

        public boolean m28183i() {
            return this.f14435b.f14439c.isEmpty();
        }
    }

    public interface AbstractC4359c {
        void mo11234U1(Cursor cursor, boolean z);
    }

    static {
        f14431b = Build.VERSION.SDK_INT >= 29 ? "date_modified" : "datetaken";
    }

    public static void m28211c(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static String[] m28206h(boolean z) {
        if (Build.VERSION.SDK_INT < 29) {
            return z ? new String[]{"media_type", "mime_type", "_id", "_data", f14431b, "orientation", "bucket_id", "bucket_display_name", "width", "height", "duration", "resolution"} : new String[]{"_id", "_data", f14431b, "orientation", "bucket_id", "bucket_display_name", "width", "height"};
        } else if (z) {
            return new String[]{"media_type", "mime_type", "_id", "_data", "date_modified", "datetaken", "orientation", "bucket_id", "bucket_display_name", "width", "height", "duration"};
        } else {
            return new String[]{"_id", "_data", "date_modified", "datetaken", "orientation", "bucket_id", "bucket_display_name", "width", "height"};
        }
    }

    public static String m28204j() {
        return "media_type=1 OR media_type=3";
    }

    public static C4356b0 m28203k() {
        if (f14432c == null) {
            f14432c = new C4356b0();
        }
        return f14432c;
    }

    public static int m28202l(C6246h hVar, C6246h hVar2) {
        return ((C6253l) hVar).compareTo((C6253l) hVar2);
    }

    public void m28212b(boolean z) {
        Thread currentThread = Thread.currentThread();
        C4361c0 c0Var = this.f14433a;
        if (currentThread != c0Var) {
            c0Var.m28164i(z);
        } else {
            C4378j.m28111B().m28068x(z);
        }
    }

    public C4357a m28210d() {
        Cursor e = m28209e(0L, true);
        if (e == null) {
            return null;
        }
        C4357a m = m28201m(e, true, 2);
        m28211c(e);
        return m;
    }

    public Cursor m28209e(long j, boolean z) {
        return m28208f(j, z, 0);
    }

    public Cursor m28208f(long j, boolean z, int i) {
        String str;
        AbstractView$OnTouchListenerC7889a E;
        if (Build.VERSION.SDK_INT >= 23 && ((E = C1379j0.m37369E()) == null || E.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0)) {
            return null;
        }
        try {
            ContentResolver contentResolver = C1379j0.m37318n().getContentResolver();
            Uri contentUri = z ? MediaStore.Files.getContentUri("external") : MediaStore.Images.Media.getContentUri("external");
            StringBuilder sb2 = new StringBuilder();
            if (z) {
                sb2.append(m28204j());
            }
            if (j != 0) {
                if (sb2.length() > 0) {
                    sb2.append(" AND ");
                }
                sb2.append(f14431b);
                sb2.append(" > ");
                sb2.append(j);
            }
            String[] h = m28206h(z);
            String sb3 = sb2.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(f14431b);
            sb4.append(" DESC");
            if (i != 0) {
                str = " LIMIT " + i;
            } else {
                str = "";
            }
            sb4.append(str);
            return contentResolver.query(contentUri, h, sb3, null, sb4.toString());
        } catch (Throwable th) {
            Log.m14710w("Cannot get gallery photos", th, new Object[0]);
            return null;
        }
    }

    public void m28207g(long j, AbstractC4359c cVar, boolean z) {
        Thread currentThread = Thread.currentThread();
        C4361c0 c0Var = this.f14433a;
        if (currentThread != c0Var) {
            c0Var.m28163j(j, cVar, z);
            return;
        }
        Cursor e = m28209e(j, z);
        if (e != null) {
            cVar.mo11234U1(e, true);
        } else {
            cVar.mo11234U1(null, false);
        }
        m28211c(e);
    }

    public C6246h m28205i() {
        ArrayList<C6246h> b;
        C6246h hVar = null;
        try {
            Cursor f = m28203k().m28208f(0L, false, 1);
            if (f != null) {
                C4357a m = m28203k().m28201m(f, true, 2);
                if (!(m == null || (b = m.m28190b()) == null || b.isEmpty())) {
                    hVar = b.get(0);
                }
                f.close();
            }
        } catch (Throwable unused) {
        }
        return hVar;
    }

    public C4357a m28201m(Cursor cursor, boolean z, int i) {
        return m28200n(cursor, z, i, C1357a0.m37543j(86.0f, 2.5f), C1357a0.m37543j(112.0f, 2.5f));
    }

    public p082fd.C4356b0.C4357a m28200n(android.database.Cursor r48, boolean r49, int r50, int r51, int r52) {
        throw new UnsupportedOperationException("Method not decompiled: p082fd.C4356b0.m28200n(android.database.Cursor, boolean, int, int, int):fd.b0$a");
    }

    public void m28199o(C4812v2 v2Var) {
        Thread currentThread = Thread.currentThread();
        C4361c0 c0Var = this.f14433a;
        if (currentThread != c0Var) {
            c0Var.m28162k(v2Var);
        } else {
            C4378j.m28111B().m28102K(v2Var);
        }
    }

    public void m28198p(C4812v2 v2Var) {
        Thread currentThread = Thread.currentThread();
        C4361c0 c0Var = this.f14433a;
        if (currentThread != c0Var) {
            c0Var.m28161l(v2Var);
        } else {
            C4378j.m28111B().m28101L(v2Var);
        }
    }

    public void m28197q(Runnable runnable) {
        this.f14433a.m28054e(runnable, 0L);
    }

    public void m28196r(Runnable runnable, int i) {
        this.f14433a.m28054e(runnable, i);
    }

    public void m28195s(C4812v2 v2Var, float f) {
        if (Thread.currentThread() != this.f14433a) {
            C4378j.m28111B().m28093T();
            this.f14433a.m28160m(v2Var, f);
            return;
        }
        C4378j.m28111B().m28097P(v2Var, f);
    }

    public void m28194t(C4812v2 v2Var, boolean z) {
        Thread currentThread = Thread.currentThread();
        C4361c0 c0Var = this.f14433a;
        if (currentThread != c0Var) {
            c0Var.m28159n(v2Var, z);
        } else {
            C4378j.m28111B().m28096Q(v2Var, z);
        }
    }

    public void m28193u() {
        Thread currentThread = Thread.currentThread();
        C4361c0 c0Var = this.f14433a;
        if (currentThread != c0Var) {
            c0Var.m28158o();
        } else {
            C4378j.m28111B().m28094S();
        }
    }

    public void m28192v() {
        Thread currentThread = Thread.currentThread();
        C4361c0 c0Var = this.f14433a;
        if (currentThread != c0Var) {
            c0Var.m28157p();
        } else {
            C4378j.m28111B().m28092U();
        }
    }

    public static class C4358b {
        public final long f14437a;
        public final String f14438b;
        public final ArrayList<C6246h> f14439c;
        public int f14440d;
        public int f14441e;
        public int f14442f;

        public C4358b(long j, String str) {
            this.f14437a = j;
            this.f14438b = str;
            this.f14439c = new ArrayList<>();
        }

        public static ArrayList m28181a(C4358b bVar) {
            return bVar.f14439c;
        }

        public static String m28180b(C4358b bVar) {
            return bVar.f14438b;
        }

        public void m28179c(C6253l lVar) {
            this.f14439c.add(lVar);
            if (lVar.m20844e1()) {
                this.f14442f++;
            } else {
                this.f14441e++;
            }
        }

        public long m28178d() {
            return this.f14437a;
        }

        public ArrayList<C6246h> m28177e() {
            return this.f14439c;
        }

        public long m28176f() {
            ArrayList<C6246h> arrayList = this.f14439c;
            if (arrayList == null || arrayList.isEmpty()) {
                return 0L;
            }
            C6246h hVar = this.f14439c.get(0);
            if (hVar instanceof C6253l) {
                return ((C6253l) hVar).m20867I0();
            }
            return 0L;
        }

        public String m28175g() {
            return this.f14438b;
        }

        public int m28174h() {
            return this.f14441e;
        }

        public C6246h m28173i() {
            if (this.f14439c.isEmpty()) {
                return null;
            }
            return this.f14439c.get(0);
        }

        public int m28172j() {
            return this.f14440d;
        }

        public int m28171k() {
            return this.f14442f;
        }

        public boolean m28170l() {
            return this.f14437a == Long.MIN_VALUE;
        }

        public boolean m28169m() {
            String str = this.f14438b;
            return str != null && (str.toLowerCase().contains("camera") || this.f14438b.toLowerCase().contains("dcim"));
        }

        public boolean m28168n() {
            String str = this.f14438b;
            return str != null && str.toLowerCase().contains("download");
        }

        public boolean m28167o() {
            String str = this.f14438b;
            return str != null && str.toLowerCase().contains("screenshot");
        }

        public void m28166p(int i) {
            this.f14440d = i;
        }

        public int m28165q() {
            return this.f14439c.size();
        }

        public C4358b(long j, ArrayList<C6246h> arrayList, int i) {
            this.f14437a = j;
            this.f14438b = C4403w.m27871i1(i);
            this.f14439c = arrayList;
            if (arrayList != null) {
                Iterator<C6246h> it = arrayList.iterator();
                while (it.hasNext()) {
                    C6246h next = it.next();
                    if (!(next instanceof C6253l)) {
                        this.f14441e++;
                    } else if (((C6253l) next).m20844e1()) {
                        this.f14442f++;
                    } else {
                        this.f14441e++;
                    }
                }
            }
        }
    }
}
