package gd;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import ce.a0;
import ce.j0;
import hd.v2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import k0.e;
import ld.h;
import ld.l;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;

public class b0 {
    public static final String f12200b;
    public static b0 f12201c;
    public c0 f12202a = new c0();

    public static class a {
        public final ArrayList<b> f12203a;
        public final b f12204b;
        public final b f12205c;

        public a(ArrayList<h> arrayList, ArrayList<h> arrayList2, e<b> eVar) {
            this.f12203a = new ArrayList<>(eVar.p());
            b bVar = new b(Long.MIN_VALUE, arrayList, R.string.AllMedia);
            this.f12204b = bVar;
            bVar.p(5);
            b bVar2 = new b(-9223372036854775807L, arrayList2, R.string.AllVideos);
            this.f12205c = bVar2;
            bVar2.p(4);
            int p10 = eVar.p();
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            for (int i10 = 0; i10 < p10; i10++) {
                b q10 = eVar.q(i10);
                this.f12203a.add(q10);
                if (!z10 && q10.m()) {
                    q10.p(3);
                    z10 = true;
                } else if (!z11 && q10.n()) {
                    q10.p(1);
                    z11 = true;
                } else if (!z12 && q10.o()) {
                    q10.p(2);
                    z12 = true;
                }
            }
            if (!arrayList.isEmpty()) {
                this.f12203a.add(this.f12204b);
                if (!arrayList2.isEmpty() && arrayList2.size() < arrayList.size()) {
                    this.f12203a.add(this.f12205c);
                }
                Collections.sort(this.f12203a, a0.f12198a);
            }
        }

        public static int j(b bVar, b bVar2) {
            int j10 = bVar.j();
            int j11 = bVar2.j();
            return j10 != j11 ? Integer.compare(j11, j10) : Long.compare(bVar.d(), bVar2.d());
        }

        public ArrayList<h> b() {
            return this.f12204b.f12208c;
        }

        public b c() {
            return this.f12204b;
        }

        public int d() {
            return this.f12203a.size();
        }

        public b e(int i10) {
            return this.f12203a.get(i10);
        }

        public ArrayList<b> f() {
            return this.f12203a;
        }

        public b g() {
            return this.f12204b;
        }

        public int h(long j10) {
            if (this.f12203a.isEmpty()) {
                return -1;
            }
            int i10 = 0;
            Iterator<b> it = this.f12203a.iterator();
            while (it.hasNext()) {
                if (it.next().d() == j10) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }

        public boolean i() {
            return this.f12204b.f12208c.isEmpty();
        }
    }

    public interface c {
        void R1(Cursor cursor, boolean z10);
    }

    static {
        f12200b = Build.VERSION.SDK_INT >= 29 ? "date_modified" : "datetaken";
    }

    public static void c(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static String[] h(boolean z10) {
        if (Build.VERSION.SDK_INT < 29) {
            return z10 ? new String[]{"media_type", "mime_type", "_id", "_data", f12200b, "orientation", "bucket_id", "bucket_display_name", "width", "height", "duration", "resolution"} : new String[]{"_id", "_data", f12200b, "orientation", "bucket_id", "bucket_display_name", "width", "height"};
        } else if (z10) {
            return new String[]{"media_type", "mime_type", "_id", "_data", "date_modified", "datetaken", "orientation", "bucket_id", "bucket_display_name", "width", "height", "duration"};
        } else {
            return new String[]{"_id", "_data", "date_modified", "datetaken", "orientation", "bucket_id", "bucket_display_name", "width", "height"};
        }
    }

    public static String j() {
        return "media_type=1 OR media_type=3";
    }

    public static b0 k() {
        if (f12201c == null) {
            f12201c = new b0();
        }
        return f12201c;
    }

    public static int l(h hVar, h hVar2) {
        return ((l) hVar).compareTo((l) hVar2);
    }

    public void b(boolean z10) {
        Thread currentThread = Thread.currentThread();
        c0 c0Var = this.f12202a;
        if (currentThread != c0Var) {
            c0Var.i(z10);
        } else {
            j.B().x(z10);
        }
    }

    public a d() {
        Cursor e10 = e(0L, true);
        if (e10 == null) {
            return null;
        }
        a m10 = m(e10, true, 2);
        c(e10);
        return m10;
    }

    public Cursor e(long j10, boolean z10) {
        return f(j10, z10, 0);
    }

    public Cursor f(long j10, boolean z10, int i10) {
        String str;
        org.thunderdog.challegram.a E;
        if (Build.VERSION.SDK_INT >= 23 && ((E = j0.E()) == null || E.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0)) {
            return null;
        }
        try {
            ContentResolver contentResolver = j0.n().getContentResolver();
            Uri contentUri = z10 ? MediaStore.Files.getContentUri("external") : MediaStore.Images.Media.getContentUri("external");
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                sb2.append(j());
            }
            if (j10 != 0) {
                if (sb2.length() > 0) {
                    sb2.append(" AND ");
                }
                sb2.append(f12200b);
                sb2.append(" > ");
                sb2.append(j10);
            }
            String[] h10 = h(z10);
            String sb3 = sb2.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(f12200b);
            sb4.append(" DESC");
            if (i10 != 0) {
                str = " LIMIT " + i10;
            } else {
                str = "";
            }
            sb4.append(str);
            return contentResolver.query(contentUri, h10, sb3, null, sb4.toString());
        } catch (Throwable th) {
            Log.w("Cannot get gallery photos", th, new Object[0]);
            return null;
        }
    }

    public void g(long j10, c cVar, boolean z10) {
        Thread currentThread = Thread.currentThread();
        c0 c0Var = this.f12202a;
        if (currentThread != c0Var) {
            c0Var.j(j10, cVar, z10);
            return;
        }
        Cursor e10 = e(j10, z10);
        if (e10 != null) {
            cVar.R1(e10, true);
        } else {
            cVar.R1(null, false);
        }
        c(e10);
    }

    public h i() {
        ArrayList<h> b10;
        h hVar = null;
        try {
            Cursor f10 = k().f(0L, false, 1);
            if (f10 != null) {
                a m10 = k().m(f10, true, 2);
                if (!(m10 == null || (b10 = m10.b()) == null || b10.isEmpty())) {
                    hVar = b10.get(0);
                }
                f10.close();
            }
        } catch (Throwable unused) {
        }
        return hVar;
    }

    public a m(Cursor cursor, boolean z10, int i10) {
        return n(cursor, z10, i10, a0.j(86.0f, 2.5f), a0.j(112.0f, 2.5f));
    }

    public gd.b0.a n(android.database.Cursor r48, boolean r49, int r50, int r51, int r52) {
        throw new UnsupportedOperationException("Method not decompiled: gd.b0.n(android.database.Cursor, boolean, int, int, int):gd.b0$a");
    }

    public void o(v2 v2Var) {
        Thread currentThread = Thread.currentThread();
        c0 c0Var = this.f12202a;
        if (currentThread != c0Var) {
            c0Var.k(v2Var);
        } else {
            j.B().K(v2Var);
        }
    }

    public void p(v2 v2Var) {
        Thread currentThread = Thread.currentThread();
        c0 c0Var = this.f12202a;
        if (currentThread != c0Var) {
            c0Var.l(v2Var);
        } else {
            j.B().L(v2Var);
        }
    }

    public void q(Runnable runnable) {
        this.f12202a.e(runnable, 0L);
    }

    public void r(Runnable runnable, int i10) {
        this.f12202a.e(runnable, i10);
    }

    public void s(v2 v2Var, float f10) {
        if (Thread.currentThread() != this.f12202a) {
            j.B().T();
            this.f12202a.m(v2Var, f10);
            return;
        }
        j.B().P(v2Var, f10);
    }

    public void t(v2 v2Var, boolean z10) {
        Thread currentThread = Thread.currentThread();
        c0 c0Var = this.f12202a;
        if (currentThread != c0Var) {
            c0Var.n(v2Var, z10);
        } else {
            j.B().Q(v2Var, z10);
        }
    }

    public void u() {
        Thread currentThread = Thread.currentThread();
        c0 c0Var = this.f12202a;
        if (currentThread != c0Var) {
            c0Var.o();
        } else {
            j.B().S();
        }
    }

    public void v() {
        Thread currentThread = Thread.currentThread();
        c0 c0Var = this.f12202a;
        if (currentThread != c0Var) {
            c0Var.p();
        } else {
            j.B().U();
        }
    }

    public static class b {
        public final long f12206a;
        public final String f12207b;
        public final ArrayList<h> f12208c;
        public int f12209d;
        public int f12210e;
        public int f12211f;

        public b(long j10, String str) {
            this.f12206a = j10;
            this.f12207b = str;
            this.f12208c = new ArrayList<>();
        }

        public static ArrayList a(b bVar) {
            return bVar.f12208c;
        }

        public static String b(b bVar) {
            return bVar.f12207b;
        }

        public void c(l lVar) {
            this.f12208c.add(lVar);
            if (lVar.e1()) {
                this.f12211f++;
            } else {
                this.f12210e++;
            }
        }

        public long d() {
            return this.f12206a;
        }

        public ArrayList<h> e() {
            return this.f12208c;
        }

        public long f() {
            ArrayList<h> arrayList = this.f12208c;
            if (arrayList == null || arrayList.isEmpty()) {
                return 0L;
            }
            h hVar = this.f12208c.get(0);
            if (hVar instanceof l) {
                return ((l) hVar).I0();
            }
            return 0L;
        }

        public String g() {
            return this.f12207b;
        }

        public int h() {
            return this.f12210e;
        }

        public h i() {
            if (this.f12208c.isEmpty()) {
                return null;
            }
            return this.f12208c.get(0);
        }

        public int j() {
            return this.f12209d;
        }

        public int k() {
            return this.f12211f;
        }

        public boolean l() {
            return this.f12206a == Long.MIN_VALUE;
        }

        public boolean m() {
            String str = this.f12207b;
            return str != null && (str.toLowerCase().contains("camera") || this.f12207b.toLowerCase().contains("dcim"));
        }

        public boolean n() {
            String str = this.f12207b;
            return str != null && str.toLowerCase().contains("download");
        }

        public boolean o() {
            String str = this.f12207b;
            return str != null && str.toLowerCase().contains("screenshot");
        }

        public void p(int i10) {
            this.f12209d = i10;
        }

        public int q() {
            return this.f12208c.size();
        }

        public b(long j10, ArrayList<h> arrayList, int i10) {
            this.f12206a = j10;
            this.f12207b = w.i1(i10);
            this.f12208c = arrayList;
            if (arrayList != null) {
                Iterator<h> it = arrayList.iterator();
                while (it.hasNext()) {
                    h next = it.next();
                    if (!(next instanceof l)) {
                        this.f12210e++;
                    } else if (((l) next).e1()) {
                        this.f12211f++;
                    } else {
                        this.f12210e++;
                    }
                }
            }
        }
    }
}
