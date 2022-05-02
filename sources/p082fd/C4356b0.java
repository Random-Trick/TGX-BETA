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
            this.f14434a = new ArrayList<>(eVar.m21496p());
            C4358b bVar = new C4358b(Long.MIN_VALUE, arrayList, R.string.AllMedia);
            this.f14435b = bVar;
            bVar.m28164p(5);
            C4358b bVar2 = new C4358b(-9223372036854775807L, arrayList2, R.string.AllVideos);
            this.f14436c = bVar2;
            bVar2.m28164p(4);
            int p = eVar.m21496p();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (int i = 0; i < p; i++) {
                C4358b q = eVar.m21495q(i);
                this.f14434a.add(q);
                if (!z && q.m28167m()) {
                    q.m28164p(3);
                    z = true;
                } else if (!z2 && q.m28166n()) {
                    q.m28164p(1);
                    z2 = true;
                } else if (!z3 && q.m28165o()) {
                    q.m28164p(2);
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

        public static int m28180j(C4358b bVar, C4358b bVar2) {
            int j = bVar.m28170j();
            int j2 = bVar2.m28170j();
            return j != j2 ? Integer.compare(j2, j) : Long.compare(bVar.m28176d(), bVar2.m28176d());
        }

        public ArrayList<C6246h> m28188b() {
            return this.f14435b.f14439c;
        }

        public C4358b m28187c() {
            return this.f14435b;
        }

        public int m28186d() {
            return this.f14434a.size();
        }

        public C4358b m28185e(int i) {
            return this.f14434a.get(i);
        }

        public ArrayList<C4358b> m28184f() {
            return this.f14434a;
        }

        public C4358b m28183g() {
            return this.f14435b;
        }

        public int m28182h(long j) {
            if (this.f14434a.isEmpty()) {
                return -1;
            }
            int i = 0;
            Iterator<C4358b> it = this.f14434a.iterator();
            while (it.hasNext()) {
                if (it.next().m28176d() == j) {
                    return i;
                }
                i++;
            }
            return -1;
        }

        public boolean m28181i() {
            return this.f14435b.f14439c.isEmpty();
        }
    }

    public interface AbstractC4359c {
        void mo11235U1(Cursor cursor, boolean z);
    }

    static {
        f14431b = Build.VERSION.SDK_INT >= 29 ? "date_modified" : "datetaken";
    }

    public static void m28209c(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static String[] m28204h(boolean z) {
        if (Build.VERSION.SDK_INT < 29) {
            return z ? new String[]{"media_type", "mime_type", "_id", "_data", f14431b, "orientation", "bucket_id", "bucket_display_name", "width", "height", "duration", "resolution"} : new String[]{"_id", "_data", f14431b, "orientation", "bucket_id", "bucket_display_name", "width", "height"};
        } else if (z) {
            return new String[]{"media_type", "mime_type", "_id", "_data", "date_modified", "datetaken", "orientation", "bucket_id", "bucket_display_name", "width", "height", "duration"};
        } else {
            return new String[]{"_id", "_data", "date_modified", "datetaken", "orientation", "bucket_id", "bucket_display_name", "width", "height"};
        }
    }

    public static String m28202j() {
        return "media_type=1 OR media_type=3";
    }

    public static C4356b0 m28201k() {
        if (f14432c == null) {
            f14432c = new C4356b0();
        }
        return f14432c;
    }

    public static int m28200l(C6246h hVar, C6246h hVar2) {
        return ((C6253l) hVar).compareTo((C6253l) hVar2);
    }

    public void m28210b(boolean z) {
        Thread currentThread = Thread.currentThread();
        C4361c0 c0Var = this.f14433a;
        if (currentThread != c0Var) {
            c0Var.m28162i(z);
        } else {
            C4378j.m28109B().m28066x(z);
        }
    }

    public C4357a m28208d() {
        Cursor e = m28207e(0L, true);
        if (e == null) {
            return null;
        }
        C4357a m = m28199m(e, true, 2);
        m28209c(e);
        return m;
    }

    public Cursor m28207e(long j, boolean z) {
        return m28206f(j, z, 0);
    }

    public Cursor m28206f(long j, boolean z, int i) {
        String str;
        AbstractView$OnTouchListenerC7889a E;
        if (Build.VERSION.SDK_INT >= 23 && ((E = C1379j0.m37366E()) == null || E.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0)) {
            return null;
        }
        try {
            ContentResolver contentResolver = C1379j0.m37315n().getContentResolver();
            Uri contentUri = z ? MediaStore.Files.getContentUri("external") : MediaStore.Images.Media.getContentUri("external");
            StringBuilder sb2 = new StringBuilder();
            if (z) {
                sb2.append(m28202j());
            }
            if (j != 0) {
                if (sb2.length() > 0) {
                    sb2.append(" AND ");
                }
                sb2.append(f14431b);
                sb2.append(" > ");
                sb2.append(j);
            }
            String[] h = m28204h(z);
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

    public void m28205g(long j, AbstractC4359c cVar, boolean z) {
        Thread currentThread = Thread.currentThread();
        C4361c0 c0Var = this.f14433a;
        if (currentThread != c0Var) {
            c0Var.m28161j(j, cVar, z);
            return;
        }
        Cursor e = m28207e(j, z);
        if (e != null) {
            cVar.mo11235U1(e, true);
        } else {
            cVar.mo11235U1(null, false);
        }
        m28209c(e);
    }

    public C6246h m28203i() {
        ArrayList<C6246h> b;
        C6246h hVar = null;
        try {
            Cursor f = m28201k().m28206f(0L, false, 1);
            if (f != null) {
                C4357a m = m28201k().m28199m(f, true, 2);
                if (!(m == null || (b = m.m28188b()) == null || b.isEmpty())) {
                    hVar = b.get(0);
                }
                f.close();
            }
        } catch (Throwable unused) {
        }
        return hVar;
    }

    public C4357a m28199m(Cursor cursor, boolean z, int i) {
        return m28198n(cursor, z, i, C1357a0.m37540j(86.0f, 2.5f), C1357a0.m37540j(112.0f, 2.5f));
    }

    public p082fd.C4356b0.C4357a m28198n(android.database.Cursor r48, boolean r49, int r50, int r51, int r52) {
        throw new UnsupportedOperationException("Method not decompiled: p082fd.C4356b0.m28198n(android.database.Cursor, boolean, int, int, int):fd.b0$a");
    }

    public void m28197o(C4812v2 v2Var) {
        Thread currentThread = Thread.currentThread();
        C4361c0 c0Var = this.f14433a;
        if (currentThread != c0Var) {
            c0Var.m28160k(v2Var);
        } else {
            C4378j.m28109B().m28100K(v2Var);
        }
    }

    public void m28196p(C4812v2 v2Var) {
        Thread currentThread = Thread.currentThread();
        C4361c0 c0Var = this.f14433a;
        if (currentThread != c0Var) {
            c0Var.m28159l(v2Var);
        } else {
            C4378j.m28109B().m28099L(v2Var);
        }
    }

    public void m28195q(Runnable runnable) {
        this.f14433a.m28052e(runnable, 0L);
    }

    public void m28194r(Runnable runnable, int i) {
        this.f14433a.m28052e(runnable, i);
    }

    public void m28193s(C4812v2 v2Var, float f) {
        if (Thread.currentThread() != this.f14433a) {
            C4378j.m28109B().m28091T();
            this.f14433a.m28158m(v2Var, f);
            return;
        }
        C4378j.m28109B().m28095P(v2Var, f);
    }

    public void m28192t(C4812v2 v2Var, boolean z) {
        Thread currentThread = Thread.currentThread();
        C4361c0 c0Var = this.f14433a;
        if (currentThread != c0Var) {
            c0Var.m28157n(v2Var, z);
        } else {
            C4378j.m28109B().m28094Q(v2Var, z);
        }
    }

    public void m28191u() {
        Thread currentThread = Thread.currentThread();
        C4361c0 c0Var = this.f14433a;
        if (currentThread != c0Var) {
            c0Var.m28156o();
        } else {
            C4378j.m28109B().m28092S();
        }
    }

    public void m28190v() {
        Thread currentThread = Thread.currentThread();
        C4361c0 c0Var = this.f14433a;
        if (currentThread != c0Var) {
            c0Var.m28155p();
        } else {
            C4378j.m28109B().m28090U();
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

        public static ArrayList m28179a(C4358b bVar) {
            return bVar.f14439c;
        }

        public static String m28178b(C4358b bVar) {
            return bVar.f14438b;
        }

        public void m28177c(C6253l lVar) {
            this.f14439c.add(lVar);
            if (lVar.m20843e1()) {
                this.f14442f++;
            } else {
                this.f14441e++;
            }
        }

        public long m28176d() {
            return this.f14437a;
        }

        public ArrayList<C6246h> m28175e() {
            return this.f14439c;
        }

        public long m28174f() {
            ArrayList<C6246h> arrayList = this.f14439c;
            if (arrayList == null || arrayList.isEmpty()) {
                return 0L;
            }
            C6246h hVar = this.f14439c.get(0);
            if (hVar instanceof C6253l) {
                return ((C6253l) hVar).m20866I0();
            }
            return 0L;
        }

        public String m28173g() {
            return this.f14438b;
        }

        public int m28172h() {
            return this.f14441e;
        }

        public C6246h m28171i() {
            if (this.f14439c.isEmpty()) {
                return null;
            }
            return this.f14439c.get(0);
        }

        public int m28170j() {
            return this.f14440d;
        }

        public int m28169k() {
            return this.f14442f;
        }

        public boolean m28168l() {
            return this.f14437a == Long.MIN_VALUE;
        }

        public boolean m28167m() {
            String str = this.f14438b;
            return str != null && (str.toLowerCase().contains("camera") || this.f14438b.toLowerCase().contains("dcim"));
        }

        public boolean m28166n() {
            String str = this.f14438b;
            return str != null && str.toLowerCase().contains("download");
        }

        public boolean m28165o() {
            String str = this.f14438b;
            return str != null && str.toLowerCase().contains("screenshot");
        }

        public void m28164p(int i) {
            this.f14440d = i;
        }

        public int m28163q() {
            return this.f14439c.size();
        }

        public C4358b(long j, ArrayList<C6246h> arrayList, int i) {
            this.f14437a = j;
            this.f14438b = C4403w.m27869i1(i);
            this.f14439c = arrayList;
            if (arrayList != null) {
                Iterator<C6246h> it = arrayList.iterator();
                while (it.hasNext()) {
                    C6246h next = it.next();
                    if (!(next instanceof C6253l)) {
                        this.f14441e++;
                    } else if (((C6253l) next).m20843e1()) {
                        this.f14442f++;
                    } else {
                        this.f14441e++;
                    }
                }
            }
        }
    }
}
