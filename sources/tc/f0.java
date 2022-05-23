package tc;

import android.annotation.TargetApi;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.provider.MediaStore;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import ce.a0;
import ce.j0;
import de.iq;
import de.ra;
import gd.b0;
import gd.w;
import hd.o;
import hd.s;
import ie.g0;
import ie.h0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kb.j;
import ld.l;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import tc.f0;
import ud.d1;
import ud.h1;
import vd.o0;
import zd.hj;
import zd.o6;

public class f0 extends o<Void> implements View.OnClickListener, h1, View.OnLongClickListener, Comparator<File>, o0.c {
    public iq I0;
    public int J0;
    public g K0;
    public ArrayList<o<?>> L0;
    public boolean M0;
    public ArrayList<i> N0 = new ArrayList<>();

    public class a extends g {
        public a(f0 f0Var) {
            super(f0Var);
        }

        @Override
        public g.a b() {
            boolean z10;
            b0.a d10 = b0.k().d();
            if (d10 == null) {
                f0.this.Ih(this, R.string.AppName, R.string.AccessError);
                return null;
            } else if (d10.i()) {
                f0.this.Ih(this, R.string.AppName, R.string.NothingFound);
                return null;
            } else {
                ArrayList arrayList = new ArrayList((d10.d() - 1) + d10.c().q());
                arrayList.add(f0.mh(f0.qh(f0.this.f24493a, f0.this.f24495b, "..", R.drawable.baseline_image_24, "..", w.i1(R.string.AttachFolderHome)), R.id.btn_folder_upper));
                ArrayList<b0.b> f10 = d10.f();
                b0.b c10 = d10.c();
                if (c10 == null || c10.q() <= 0) {
                    z10 = false;
                } else {
                    Iterator<ld.h> it = c10.e().iterator();
                    boolean z11 = true;
                    int i10 = 0;
                    z10 = false;
                    while (it.hasNext()) {
                        ld.h next = it.next();
                        if (next instanceof l) {
                            l lVar = (l) next;
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            if (!ib.f.m(lVar.I0() / 1000, timeUnit) && !ib.f.p(lVar.I0() / 1000, timeUnit)) {
                                break;
                            }
                            if (z11) {
                                arrayList.add(new ra(8, 0, 0, R.string.Recent));
                                z11 = false;
                            }
                            arrayList.add(new ra(41, R.id.btn_file).N(lVar.K0()).G(f0.rh(f0.this.f24493a, f0.this.f24495b, lVar)));
                            i10++;
                            z10 = true;
                            if (i10 == 10) {
                                break;
                            }
                        }
                    }
                }
                if (z10) {
                    arrayList.add(new ra(8, 0, 0, R.string.Folders));
                }
                Iterator<b0.b> it2 = f10.iterator();
                while (it2.hasNext()) {
                    b0.b next2 = it2.next();
                    if (next2 != c10) {
                        arrayList.add(new ra(41, R.id.btn_bucket).N(next2.d()).G(f0.nh(f0.this.f24493a, f0.this.f24495b, next2)));
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new g.a(arrayList, true);
                }
                return null;
            }
        }
    }

    public class b extends g {
        public final s N;

        public b(f0 f0Var, s sVar) {
            super(f0Var);
            this.N = sVar;
        }

        @Override
        public g.a b() {
            b0.b bVar = (b0.b) this.N.b0();
            if (bVar == null || bVar.q() == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(bVar.q() + 1);
            arrayList.add(f0.mh(f0.qh(f0.this.f24493a, f0.this.f24495b, "..", R.drawable.baseline_image_24, "..", w.i1(R.string.Gallery)), R.id.btn_folder_upper));
            Iterator<ld.h> it = bVar.e().iterator();
            while (it.hasNext()) {
                ld.h next = it.next();
                if (next instanceof l) {
                    l lVar = (l) next;
                    arrayList.add(new ra(41, R.id.btn_file).N(lVar.K0()).G(f0.rh(f0.this.f24493a, f0.this.f24495b, lVar)));
                }
            }
            return new g.a(arrayList, true);
        }
    }

    public class c extends g {
        public c(f0 f0Var) {
            super(f0Var);
        }

        @Override
        public g.a b() {
            if (Build.VERSION.SDK_INT < 30) {
                return null;
            }
            try {
                Cursor query = j0.n().getContentResolver().query(MediaStore.Downloads.EXTERNAL_CONTENT_URI, new String[]{"_id", "_display_name", "_size", "_data", "relative_path", "mime_type", "date_added", "date_modified", "is_pending"}, "is_pending != 1", null, "date_modified desc, date_added desc");
                if (query == null) {
                    f0.this.Ih(this, R.string.AppName, R.string.AccessError);
                    if (query != null) {
                        query.close();
                    }
                    return null;
                }
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    long j10 = query.getLong(0);
                    String string = query.getString(1);
                    long j11 = query.getLong(2);
                    String string2 = query.getString(3);
                    query.getString(4);
                    String string3 = query.getString(5);
                    long j12 = query.getLong(6);
                    long j13 = query.getLong(7);
                    if (!ib.i.i(string2)) {
                        arrayList.add(new f(MediaStore.Downloads.getContentUri("external", j10), j10, string, j11, string2, string3, j12, j13));
                    }
                }
                if (arrayList.isEmpty()) {
                    f0.this.Ih(this, R.string.AppName, R.string.NoDownloadFilesFound);
                    query.close();
                    return null;
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
                arrayList2.add(f0.mh(f0.qh(f0.this.f24493a, f0.this.f24495b, "..", R.drawable.baseline_folder_24, "..", w.i1(R.string.AttachFolderHome)), R.id.btn_folder_upper));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    arrayList2.add(f0.mh(new s(f0.this.f24493a, f0.this.f24495b, new File(fVar.a()), fVar.d(), w.z0(Math.max(fVar.c(), fVar.b()), TimeUnit.SECONDS, fVar.e()), (Object) fVar, false), R.id.btn_file));
                }
                g.a aVar = new g.a(arrayList2, true);
                query.close();
                return aVar;
            } catch (Throwable th) {
                Log.e("Cannot build downloads", th, new Object[0]);
                f0.this.Ih(this, R.string.AppName, R.string.AccessError);
                return null;
            }
        }
    }

    public class d extends g {
        public d(f0 f0Var) {
            super(f0Var);
        }

        public static int h(h hVar, h hVar2) {
            int compareToIgnoreCase = hVar.f23146b.compareToIgnoreCase(hVar2.f23146b);
            return compareToIgnoreCase != 0 ? compareToIgnoreCase : hVar.f23147c.compareTo(hVar2.f23147c);
        }

        @Override
        public g.a b() {
            try {
                Cursor query = j0.n().getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "artist", "title", "_data", "duration", "date_added", "mime_type", "album_id"}, "is_music != 0", null, "date_added desc");
                if (query == null) {
                    f0.this.Ih(this, R.string.AppName, R.string.AccessError);
                    return null;
                }
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    long j10 = query.getLong(0);
                    String string = query.getString(1);
                    String string2 = query.getString(2);
                    String string3 = query.getString(3);
                    long j11 = query.getInt(4);
                    String string4 = query.getString(6);
                    long j12 = query.getLong(7);
                    if (!ib.i.i(string3)) {
                        if (string == null) {
                            string = "";
                        }
                        if (string2 == null) {
                            string2 = "";
                        }
                        arrayList.add(new h(j10, string, string2, string3, j11, string4, j12));
                    }
                }
                v0.F(query);
                if (arrayList.isEmpty()) {
                    f0.this.Ih(this, R.string.AppName, R.string.NoMusicFilesFound);
                    return null;
                }
                Collections.sort(arrayList, g0.f23157a);
                ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
                arrayList2.add(f0.mh(f0.qh(f0.this.f24493a, f0.this.f24495b, "..", R.drawable.baseline_folder_24, "..", w.i1(R.string.AttachFolderHome)), R.id.btn_folder_upper));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new ra(41, R.id.btn_file).G(new s(f0.this.f24493a, f0.this.f24495b, (h) it.next(), f0.this)));
                }
                return new g.a(arrayList2, true);
            } catch (Throwable th) {
                Log.e("Cannot build music", th, new Object[0]);
                f0.this.Ih(this, R.string.AppName, R.string.AccessError);
                return null;
            }
        }
    }

    public class e extends g {
        public final String N;
        public final String O;

        public e(f0 f0Var, String str, String str2) {
            super(f0Var);
            this.N = str;
            this.O = str2;
        }

        @Override
        public g.a b() {
            try {
                File file = new File(this.N);
                if (file.exists() && file.isDirectory()) {
                    if (!file.canRead()) {
                        f0.this.Ih(this, R.string.AppName, R.string.AccessError);
                        return null;
                    }
                    File[] listFiles = file.listFiles();
                    if (!(listFiles == null || listFiles.length == 0)) {
                        ArrayList arrayList = new ArrayList(listFiles.length);
                        Collections.addAll(arrayList, listFiles);
                        Collections.sort(arrayList, f0.this);
                        ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
                        arrayList2.add(f0.mh(f0.qh(f0.this.f24493a, f0.this.f24495b, "..", R.drawable.baseline_folder_24, "..", ib.i.i(this.O) ? w.i1(R.string.AttachFolderHome) : this.O), R.id.btn_folder_upper));
                        if ("/".equals(this.N)) {
                            f0.this.dh(arrayList2);
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            File file2 = (File) it.next();
                            arrayList2.add(f0.mh(f0.oh(f0.this.f24493a, f0.this.f24495b, file2, null), file2.isDirectory() ? R.id.btn_folder : R.id.btn_file));
                        }
                        return new g.a(arrayList2, true);
                    }
                    f0.this.Ih(this, R.string.AppName, R.string.FolderEmpty);
                    return null;
                }
                f0.this.Ih(this, R.string.AppName, R.string.FolderDoesNotExist);
                return null;
            } catch (Throwable th) {
                Log.e("Cannot build folder", th, new Object[0]);
                f0.this.Ih(this, R.string.AppName, R.string.AccessError);
                return null;
            }
        }
    }

    public static class f {
        public final Uri f23132a;
        public final long f23133b;
        public final String f23134c;
        public final long f23135d;
        public final String f23136e;
        public final String f23137f;
        public final long f23138g;
        public final long f23139h;

        public f(Uri uri, long j10, String str, long j11, String str2, String str3, long j12, long j13) {
            this.f23132a = uri;
            this.f23133b = j10;
            this.f23134c = str;
            this.f23135d = j11;
            this.f23136e = str2;
            this.f23137f = str3;
            this.f23138g = j12;
            this.f23139h = j13;
        }

        public String a() {
            return this.f23136e;
        }

        public long b() {
            return this.f23138g;
        }

        public long c() {
            return this.f23139h;
        }

        public String d() {
            return this.f23134c;
        }

        public long e() {
            return this.f23135d;
        }
    }

    public static abstract class g implements Runnable {
        public Runnable M;
        public final f0 f23140a;
        public volatile boolean f23141b;
        public Runnable f23142c;

        public static class a {
            public ArrayList<ra> f23143a;
            public boolean f23144b;

            public a(ArrayList<ra> arrayList, boolean z10) {
                this.f23143a = arrayList;
                this.f23144b = z10;
            }

            public boolean a() {
                ArrayList<ra> arrayList = this.f23143a;
                return arrayList == null || arrayList.isEmpty();
            }
        }

        public g(f0 f0Var) {
            this.f23140a = f0Var;
        }

        public void e(a aVar, Runnable runnable) {
            if (!this.f23140a.Sa() && this.f23140a.K0 == this && !d()) {
                if (aVar != null && !aVar.a()) {
                    this.f23140a.Ah(this, aVar.f23143a, aVar.f23144b);
                }
                runnable.run();
            }
        }

        public abstract a b();

        public void c() {
            synchronized (this) {
                this.f23141b = true;
            }
        }

        public boolean d() {
            boolean z10;
            synchronized (this) {
                z10 = this.f23141b;
            }
            return z10;
        }

        public void f(Runnable runnable, Runnable runnable2) {
            this.f23142c = runnable;
            this.M = runnable2;
        }

        @Override
        public void run() {
            synchronized (this) {
                if (!this.f23141b) {
                    final a b10 = b();
                    final Runnable runnable = (b10 == null || b10.a()) ? this.M : this.f23142c;
                    if (runnable != null) {
                        j0.d0(new Runnable() {
                            @Override
                            public final void run() {
                                f0.g.this.e(b10, runnable);
                            }
                        });
                    }
                }
            }
        }
    }

    public static class h {
        public final long f23145a;
        public final String f23146b;
        public final String f23147c;
        public final String f23148d;
        public final long f23149e;
        public final String f23150f;
        public final long f23151g;

        public h(long j10, String str, String str2, String str3, long j11, String str4, long j12) {
            this.f23145a = j10;
            this.f23146b = str;
            this.f23147c = str2;
            this.f23148d = str3;
            this.f23149e = j11;
            this.f23150f = str4;
            this.f23151g = j12;
        }

        public long c() {
            return this.f23151g;
        }

        public String d() {
            return this.f23146b;
        }

        public Uri e() {
            return ContentUris.withAppendedId(Uri.parse("content://media/external/audio/albumart"), c());
        }

        public long f() {
            return this.f23149e;
        }

        public long g() {
            return this.f23145a;
        }

        public String h() {
            return this.f23150f;
        }

        public String i() {
            return this.f23148d;
        }

        public String j() {
            return this.f23147c;
        }

        public boolean k() {
            return c() != 0;
        }
    }

    public static class i {
        public final String f23152a;
        public final int f23153b;
        public final int f23154c;

        public i(String str, int i10, int i11) {
            this.f23152a = str;
            this.f23153b = i10;
            this.f23154c = i11;
        }
    }

    public f0(y1 y1Var) {
        super(y1Var, (int) R.string.File);
    }

    public void Bh(List list, boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
        this.f23267n0.l3(list, null, new TdApi.MessageSendOptions(z10, false, false, messageSchedulingState), false);
    }

    public void Ch(Set set) {
        if (set != null && !set.isEmpty()) {
            final ArrayList arrayList = new ArrayList(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                String U2 = v0.U2(uri);
                if (ib.i.i(U2) || !v0.C(U2)) {
                    arrayList.add(uri.toString());
                } else {
                    arrayList.add(U2);
                }
            }
            this.f23267n0.Z2(new hj.o() {
                @Override
                public final void a(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
                    f0.this.Bh(arrayList, z10, messageSchedulingState, z11);
                }
            });
        }
    }

    public static void Dh(j jVar, int i10, int i11, Intent intent) {
        if (i11 == -1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                    Uri uri = clipData.getItemAt(i12).getUri();
                    if (uri != null) {
                        linkedHashSet.add(uri);
                    }
                }
            }
            if (!linkedHashSet.isEmpty()) {
                jVar.a(linkedHashSet);
            }
        }
    }

    public static String Hh(String str) {
        int i10;
        if (str.startsWith("dir://")) {
            i10 = 6;
        } else if (!str.startsWith("file://")) {
            return str;
        } else {
            i10 = 7;
        }
        return str.substring(i10);
    }

    public static ra mh(o<?> oVar, int i10) {
        return new ra(41, i10).G(oVar);
    }

    public static s nh(org.thunderdog.challegram.a aVar, o6 o6Var, b0.b bVar) {
        File file = new File(bVar.i().q());
        String charSequence = w.y2(bVar.h(), bVar.k()).toString();
        long f10 = bVar.f();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (ib.f.m(f10, timeUnit)) {
            charSequence = w.j1(R.string.format_contentAndModifyDate2, charSequence, w.K0(bVar.f(), timeUnit));
        }
        return ph(aVar, o6Var, file, bVar, bVar.g(), 0L, charSequence, true);
    }

    public static s oh(org.thunderdog.challegram.a aVar, o6 o6Var, File file, Object obj) {
        return ph(aVar, o6Var, file, obj, null, file.lastModified(), null, false);
    }

    public static s ph(org.thunderdog.challegram.a aVar, o6 o6Var, File file, Object obj, String str, long j10, String str2, boolean z10) {
        if (file.isDirectory()) {
            return new s(aVar, o6Var, "dir://" + file.getPath(), (int) R.id.theme_color_fileAttach, (int) R.drawable.baseline_folder_24, file.getName(), w.i1(R.string.Folder));
        }
        return new s(aVar, o6Var, file, str != null ? str : file.getName(), str2 == null ? w.z0(j10, TimeUnit.MILLISECONDS, file.length()) : str2, obj, z10);
    }

    public static s qh(org.thunderdog.challegram.a aVar, o6 o6Var, String str, int i10, String str2, String str3) {
        return new s(aVar, o6Var, str, (int) R.id.theme_color_fileAttach, i10, str2, str3);
    }

    public static s rh(org.thunderdog.challegram.a aVar, o6 o6Var, l lVar) {
        return ph(aVar, o6Var, new File(lVar.q()), lVar, null, lVar.I0(), null, false);
    }

    public void uh(String str, int i10, int i11, LinearLayoutManager linearLayoutManager) {
        ArrayList<i> arrayList = this.N0;
        if (i10 == -1) {
            i10 = 0;
        }
        arrayList.add(new i(str, i10, i11));
        linearLayoutManager.z2(0, 0);
    }

    public static boolean vh(Runnable runnable, View view, int i10) {
        if (i10 != R.id.btn_done) {
            return true;
        }
        runnable.run();
        return true;
    }

    public void wh(final Runnable runnable) {
        ee(w.H0(this, R.string.ApplicationFolderWarning, new Object[0]), new int[]{R.id.btn_done, R.id.btn_cancel}, new String[]{w.i1(R.string.ApplicationFolderWarningConfirm), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_warning_24, R.drawable.baseline_cancel_24}, new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean vh;
                vh = f0.vh(runnable, view, i10);
                return vh;
            }
        });
    }

    public static void xh(g gVar) {
        gd.l.a().b(gVar);
    }

    public void yh(i iVar) {
        ((LinearLayoutManager) this.f23277x0.getLayoutManager()).z2(iVar.f23153b, iVar.f23154c);
    }

    public void zh(g gVar, int i10, int i11) {
        if (!Sa() && this.K0 == gVar && !gVar.d()) {
            Hc(i10, i11);
        }
    }

    @Override
    public int Af() {
        return a0.i(101.0f);
    }

    public final void Eh(final String str, s sVar) {
        if (this.M0) {
            this.f23267n0.a2();
        }
        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f23277x0.getLayoutManager();
        final int X1 = linearLayoutManager.X1();
        View C = X1 != -1 ? linearLayoutManager.C(X1) : null;
        final int top = C != null ? C.getTop() : 0;
        Fh(str, sh(1), false, sVar, new Runnable() {
            @Override
            public final void run() {
                f0.this.uh(str, X1, top, linearLayoutManager);
            }
        }, null);
    }

    public final void Fh(java.lang.String r24, java.lang.String r25, boolean r26, hd.s r27, java.lang.Runnable r28, java.lang.Runnable r29) {
        throw new UnsupportedOperationException("Method not decompiled: tc.f0.Fh(java.lang.String, java.lang.String, boolean, hd.s, java.lang.Runnable, java.lang.Runnable):void");
    }

    public final void Gh() {
        if (!this.N0.isEmpty()) {
            if (this.M0) {
                this.f23267n0.a2();
            }
            ArrayList<i> arrayList = this.N0;
            final i remove = arrayList.remove(arrayList.size() - 1);
            if (this.N0.isEmpty()) {
                fh();
                gf();
                return;
            }
            ArrayList<i> arrayList2 = this.N0;
            Fh(arrayList2.get(arrayList2.size() - 1).f23152a, sh(2), true, null, new Runnable() {
                @Override
                public final void run() {
                    f0.this.yh(remove);
                }
            }, new Runnable() {
                @Override
                public final void run() {
                    f0.this.Gh();
                }
            });
        }
    }

    public final void Ih(final g gVar, final int i10, final int i11) {
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                f0.this.zh(gVar, i10, i11);
            }
        });
    }

    @Override
    public void J(int i10, View view) {
        if (i10 == R.id.menu_btn_more) {
            Mh();
        }
    }

    public final void Jh(ra raVar, o<?> oVar) {
        int i10;
        boolean z10;
        ArrayList<o<?>> arrayList = this.L0;
        if (arrayList == null) {
            this.L0 = new ArrayList<>();
            i10 = -1;
        } else {
            i10 = arrayList.indexOf(oVar);
        }
        int i11 = 0;
        if (i10 != -1) {
            this.L0.remove(i10);
            raVar.T(false, i10);
            int size = this.L0.size();
            for (int i12 = i10; i12 < size; i12++) {
                int J0 = this.I0.J0(this.L0.get(i12));
                if (J0 != -1) {
                    this.I0.q2(J0, true, this.I0.D0().get(J0).a());
                } else {
                    throw new IllegalStateException();
                }
            }
            z10 = false;
        } else {
            i10 = this.L0.size();
            this.L0.add(oVar);
            raVar.T(true, i10);
            z10 = true;
        }
        Iterator<ra> it = this.I0.D0().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ra next = it.next();
            if (next.j() == raVar.j() && next.d() == raVar.d()) {
                this.I0.q2(i11, z10, i10);
                break;
            }
            i11++;
        }
        Lh(!this.L0.isEmpty());
        this.f23267n0.setCounter(this.L0.size());
    }

    public final void Ah(final g gVar, final ArrayList<ra> arrayList, final boolean z10) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    f0.this.Ah(gVar, arrayList, z10);
                }
            });
        } else if (gVar == null || (this.K0 == gVar && !gVar.d() && !Sa())) {
            this.I0.s2(arrayList, false);
            if (z10 && !Lf()) {
                kf();
            }
        }
    }

    public final void Lh(boolean z10) {
        if (this.M0 != z10) {
            this.M0 = z10;
            this.I0.n2(z10, false, null);
            if (!z10 && !this.L0.isEmpty()) {
                this.L0.clear();
                this.I0.v0();
            }
        }
    }

    @TargetApi(18)
    public final void Mh() {
        final j d0Var = new j() {
            @Override
            public final void a(Object obj) {
                f0.this.Ch((Set) obj);
            }
        };
        Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType("*/*").putExtra("android.intent.extra.ALLOW_MULTIPLE", true).putExtra("android.content.extra.SHOW_ADVANCED", true);
        this.f24493a.q2(105, new ud.a() {
            @Override
            public final void u(int i10, int i11, Intent intent) {
                f0.Dh(j.this, i10, i11, intent);
            }
        });
        try {
            this.f24493a.startActivityForResult(putExtra, 105);
        } catch (ActivityNotFoundException e10) {
            j0.y0(R.string.NoFilePicker, 0);
            Log.i(e10);
        }
    }

    @Override
    public int R9() {
        return R.id.controller_media_files;
    }

    @Override
    public int W9() {
        return R.id.menu_more;
    }

    @Override
    public void Wf() {
        if (this.L0 != null) {
            Lh(false);
        }
    }

    @Override
    public void Yf(TdApi.MessageSendOptions messageSendOptions, boolean z10) {
        ArrayList<o<?>> arrayList = this.L0;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList<h> arrayList2 = new ArrayList<>();
            ArrayList arrayList3 = new ArrayList();
            Iterator<o<?>> it = this.L0.iterator();
            while (it.hasNext()) {
                o<?> next = it.next();
                int v10 = next.v();
                if (v10 == 7) {
                    arrayList2.add((h) ((s) next).b0());
                } else if (v10 == 9) {
                    arrayList3.add(next.p());
                }
            }
            if (!arrayList2.isEmpty() || !arrayList3.isEmpty()) {
                this.f23267n0.l3(arrayList3, arrayList2, messageSendOptions, true);
            }
        }
    }

    public final void dh(List<ra> list) {
        try {
            String path = j0.q().getFilesDir().getPath();
            String str = null;
            File externalFilesDir = j0.q().getExternalFilesDir(null);
            if (externalFilesDir != null) {
                str = externalFilesDir.getPath();
            }
            String str2 = str;
            if (externalFilesDir != null && !ib.i.c(str2, path)) {
                org.thunderdog.challegram.a aVar = this.f24493a;
                o6 o6Var = this.f24495b;
                list.add(mh(qh(aVar, o6Var, "dir://" + str2, R.drawable.baseline_settings_24, w.i1(R.string.ApplicationFolderExternal), str2), R.id.btn_folder));
            }
            org.thunderdog.challegram.a aVar2 = this.f24493a;
            o6 o6Var2 = this.f24495b;
            list.add(mh(qh(aVar2, o6Var2, "dir://" + path, R.drawable.baseline_settings_24, w.i1(R.string.ApplicationFolder), path), R.id.btn_folder));
        } catch (Throwable th) {
            Log.e(th);
        }
    }

    @Override
    public boolean ef() {
        return super.ef() && this.N0.isEmpty();
    }

    public final g eh(s sVar) {
        return new b(this, sVar);
    }

    public final void fh() {
        Fh(null, null, false, null, null, null);
    }

    public final g gh() {
        return new c(this);
    }

    public final g hh(String str, String str2) {
        return new e(this, str, str2);
    }

    public final g ih() {
        return new a(this);
    }

    @Override
    public boolean jc(boolean z10) {
        if (super.jc(z10)) {
            return true;
        }
        if (this.M0) {
            this.f23267n0.a2();
            return true;
        } else if (this.N0.isEmpty()) {
            return false;
        } else {
            Gh();
            return true;
        }
    }

    public final g jh() {
        return new d(this);
    }

    public final void kh() {
        g gVar = this.K0;
        if (gVar != null) {
            gVar.c();
            this.K0 = null;
        }
    }

    public int compare(File file, File file2) {
        boolean isDirectory = file.isDirectory();
        if (isDirectory != file2.isDirectory()) {
            return isDirectory ? -1 : 1;
        }
        if (isDirectory) {
            return file.compareTo(file2);
        }
        long lastModified = file.lastModified();
        long lastModified2 = file2.lastModified();
        if (lastModified > 0 && lastModified2 > 0 && lastModified != lastModified2) {
            return Long.compare(lastModified2, lastModified);
        }
        String name = file.getName();
        String name2 = file2.getName();
        String v02 = v0.v0(name);
        String v03 = v0.v0(name2);
        if (v02 == null && v03 == null) {
            return name.compareTo(name2);
        }
        if (v02 == null) {
            return -1;
        }
        if (v03 == null) {
            return 1;
        }
        String lowerCase = v02.toLowerCase();
        String lowerCase2 = v03.toLowerCase();
        return lowerCase.equals(lowerCase2) ? name.compareTo(name2) : lowerCase.compareTo(lowerCase2);
    }

    @Override
    public o0.b m5(TdApi.Message message) {
        TdApi.Message a02;
        ArrayList arrayList = null;
        int i10 = -1;
        for (ra raVar : this.I0.D0()) {
            if (raVar.j() == R.id.btn_file && raVar.A() == 41 && (raVar.d() instanceof s)) {
                s sVar = (s) raVar.d();
                if (sVar.v() == 7 && (a02 = sVar.a0()) != null) {
                    if (i10 == -1 && o0.D(a02, message)) {
                        i10 = arrayList != null ? arrayList.size() : 0;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(a02);
                }
            }
        }
        if (arrayList == null || i10 == -1) {
            return null;
        }
        return new o0.b(arrayList, i10).s(true, true);
    }

    @Override
    public View oc(Context context) {
        bf(false);
        th();
        jg(new LinearLayoutManager(context, 1, false));
        hg(this.I0);
        return this.f23275v0;
    }

    @Override
    public boolean og() {
        return true;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_folder_upper) {
            Gh();
            return;
        }
        Object tag = view.getTag();
        if (tag != null && (tag instanceof ra)) {
            ra raVar = (ra) tag;
            if (raVar.A() == 41) {
                s sVar = (s) raVar.d();
                int j10 = raVar.j();
                if (j10 == R.id.btn_bucket) {
                    Eh("bucket", sVar);
                } else if (j10 == R.id.btn_file || j10 == R.id.btn_music) {
                    if (this.M0) {
                        Jh(raVar, sVar);
                        return;
                    }
                    int v10 = sVar.v();
                    if (v10 == 7) {
                        this.f23267n0.o3((h) sVar.b0());
                    } else if (v10 == 9) {
                        this.f23267n0.j3(sVar.p());
                    }
                } else if (view.getId() != R.id.btn_internalStorage || v0.z()) {
                    String p10 = sVar.p();
                    if (p10 == null) {
                        return;
                    }
                    if ("gallery".equals(p10) || "music".equals(p10) || "downloads".equals(p10) || "bucket".equals(p10) || p10.startsWith("dir://")) {
                        Eh(p10, sVar);
                    } else if ("..".equals(p10)) {
                        Gh();
                    }
                } else {
                    Mh();
                }
            }
        }
    }

    @Override
    public boolean onLongClick(View view) {
        o<?> oVar;
        Object tag = view.getTag();
        if (tag == null || !(tag instanceof ra)) {
            return false;
        }
        ra raVar = (ra) tag;
        if (raVar.A() != 41) {
            return false;
        }
        if ((raVar.j() != R.id.btn_file && raVar.j() != R.id.btn_music) || (oVar = (o) raVar.d()) == null) {
            return false;
        }
        Jh(raVar, oVar);
        return true;
    }

    @Override
    public boolean p7(TdApi.Message message, boolean z10, boolean z11, List<TdApi.Message> list, long j10) {
        return false;
    }

    public final String sh(int i10) {
        if (this.N0.size() < i10) {
            return null;
        }
        ArrayList<i> arrayList = this.N0;
        return Hh(arrayList.get(arrayList.size() - i10).f23152a);
    }

    @Override
    public int tf() {
        th();
        int i10 = a0.i(72.0f);
        int i11 = this.J0;
        if (i11 == 0) {
            i11 = (!v0.j1() || Environment.isExternalStorageEmulated()) ? 4 : 5;
        }
        return i10 * i11;
    }

    public final void th() {
        if (this.I0 == null) {
            iq iqVar = new iq(this);
            this.I0 = iqVar;
            iqVar.B2(this);
            fh();
        }
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        if (i10 == R.id.menu_more) {
            d1Var.a2(linearLayout, this);
        }
    }
}
