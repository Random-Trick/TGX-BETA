package sc;

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
import be.C1357a0;
import be.C1379j0;
import gd.AbstractC4718o;
import gd.C4756s;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p038ce.C2546iq;
import p038ce.C2964ra;
import p082fd.C4356b0;
import p082fd.C4383l;
import p082fd.C4403w;
import p108hb.C5067f;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p139jb.AbstractC5918j;
import p156kd.C6246h;
import p156kd.C6253l;
import p292ud.C9773p0;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import sc.View$OnClickListenerC8750f0;
import td.AbstractC9142a;
import td.AbstractC9201h1;
import td.View$OnClickListenerC9170d1;

public class View$OnClickListenerC8750f0 extends AbstractC8809o<Void> implements View.OnClickListener, AbstractC9201h1, View.OnLongClickListener, Comparator<File>, C9773p0.AbstractC9776c {
    public C2546iq f28228I0;
    public int f28229J0;
    public AbstractRunnableC8757g f28230K0;
    public ArrayList<AbstractC4718o<?>> f28231L0;
    public boolean f28232M0;
    public ArrayList<C8760i> f28233N0 = new ArrayList<>();

    public class C8751a extends AbstractRunnableC8757g {
        public C8751a(View$OnClickListenerC8750f0 f0Var) {
            super(f0Var);
        }

        @Override
        public AbstractRunnableC8757g.C8758a mo11506b() {
            boolean z;
            C4356b0.C4357a d = C4356b0.m28203k().m28210d();
            if (d == null) {
                View$OnClickListenerC8750f0.this.m11570Ih(this, R.string.AppName, R.string.AccessError);
                return null;
            } else if (d.m28183i()) {
                View$OnClickListenerC8750f0.this.m11570Ih(this, R.string.AppName, R.string.NothingFound);
                return null;
            } else {
                ArrayList arrayList = new ArrayList((d.m28188d() - 1) + d.m28189c().m28165q());
                arrayList.add(View$OnClickListenerC8750f0.m11536mh(View$OnClickListenerC8750f0.m11532qh(View$OnClickListenerC8750f0.this.f30168a, View$OnClickListenerC8750f0.this.f30170b, "..", R.drawable.baseline_image_24, "..", C4403w.m27871i1(R.string.AttachFolderHome)), R.id.btn_folder_upper));
                ArrayList<C4356b0.C4358b> f = d.m28186f();
                C4356b0.C4358b c = d.m28189c();
                if (c == null || c.m28165q() <= 0) {
                    z = false;
                } else {
                    Iterator<C6246h> it = c.m28177e().iterator();
                    boolean z2 = true;
                    int i = 0;
                    z = false;
                    while (it.hasNext()) {
                        C6246h next = it.next();
                        if (next instanceof C6253l) {
                            C6253l lVar = (C6253l) next;
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            if (!C5067f.m24108m(lVar.m20867I0() / 1000, timeUnit) && !C5067f.m24105p(lVar.m20867I0() / 1000, timeUnit)) {
                                break;
                            }
                            if (z2) {
                                arrayList.add(new C2964ra(8, 0, 0, R.string.Recent));
                                z2 = false;
                            }
                            arrayList.add(new C2964ra(41, R.id.btn_file).m32866N(lVar.m20864K0()).m32873G(View$OnClickListenerC8750f0.m11531rh(View$OnClickListenerC8750f0.this.f30168a, View$OnClickListenerC8750f0.this.f30170b, lVar)));
                            i++;
                            z = true;
                            if (i == 10) {
                                break;
                            }
                        }
                    }
                }
                if (z) {
                    arrayList.add(new C2964ra(8, 0, 0, R.string.Folders));
                }
                Iterator<C4356b0.C4358b> it2 = f.iterator();
                while (it2.hasNext()) {
                    C4356b0.C4358b next2 = it2.next();
                    if (next2 != c) {
                        arrayList.add(new C2964ra(41, R.id.btn_bucket).m32866N(next2.m28178d()).m32873G(View$OnClickListenerC8750f0.m11535nh(View$OnClickListenerC8750f0.this.f30168a, View$OnClickListenerC8750f0.this.f30170b, next2)));
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new AbstractRunnableC8757g.C8758a(arrayList, true);
                }
                return null;
            }
        }
    }

    public class C8752b extends AbstractRunnableC8757g {
        public final C4756s f28235N;

        public C8752b(View$OnClickListenerC8750f0 f0Var, C4756s sVar) {
            super(f0Var);
            this.f28235N = sVar;
        }

        @Override
        public AbstractRunnableC8757g.C8758a mo11506b() {
            C4356b0.C4358b bVar = (C4356b0.C4358b) this.f28235N.m26266b0();
            if (bVar == null || bVar.m28165q() == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(bVar.m28165q() + 1);
            arrayList.add(View$OnClickListenerC8750f0.m11536mh(View$OnClickListenerC8750f0.m11532qh(View$OnClickListenerC8750f0.this.f30168a, View$OnClickListenerC8750f0.this.f30170b, "..", R.drawable.baseline_image_24, "..", C4403w.m27871i1(R.string.Gallery)), R.id.btn_folder_upper));
            Iterator<C6246h> it = bVar.m28177e().iterator();
            while (it.hasNext()) {
                C6246h next = it.next();
                if (next instanceof C6253l) {
                    C6253l lVar = (C6253l) next;
                    arrayList.add(new C2964ra(41, R.id.btn_file).m32866N(lVar.m20864K0()).m32873G(View$OnClickListenerC8750f0.m11531rh(View$OnClickListenerC8750f0.this.f30168a, View$OnClickListenerC8750f0.this.f30170b, lVar)));
                }
            }
            return new AbstractRunnableC8757g.C8758a(arrayList, true);
        }
    }

    public class C8753c extends AbstractRunnableC8757g {
        public C8753c(View$OnClickListenerC8750f0 f0Var) {
            super(f0Var);
        }

        @Override
        public AbstractRunnableC8757g.C8758a mo11506b() {
            if (Build.VERSION.SDK_INT < 30) {
                return null;
            }
            try {
                Cursor query = C1379j0.m37318n().getContentResolver().query(MediaStore.Downloads.EXTERNAL_CONTENT_URI, new String[]{"_id", "_display_name", "_size", "_data", "relative_path", "mime_type", "date_added", "date_modified", "is_pending"}, "is_pending != 1", null, "date_modified desc, date_added desc");
                if (query == null) {
                    View$OnClickListenerC8750f0.this.m11570Ih(this, R.string.AppName, R.string.AccessError);
                    if (query != null) {
                        query.close();
                    }
                    return null;
                }
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    long j = query.getLong(0);
                    String string = query.getString(1);
                    long j2 = query.getLong(2);
                    String string2 = query.getString(3);
                    query.getString(4);
                    String string3 = query.getString(5);
                    long j3 = query.getLong(6);
                    long j4 = query.getLong(7);
                    if (!C5070i.m24062i(string2)) {
                        arrayList.add(new C8756f(MediaStore.Downloads.getContentUri("external", j), j, string, j2, string2, string3, j3, j4));
                    }
                }
                if (arrayList.isEmpty()) {
                    View$OnClickListenerC8750f0.this.m11570Ih(this, R.string.AppName, R.string.NoDownloadFilesFound);
                    query.close();
                    return null;
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
                arrayList2.add(View$OnClickListenerC8750f0.m11536mh(View$OnClickListenerC8750f0.m11532qh(View$OnClickListenerC8750f0.this.f30168a, View$OnClickListenerC8750f0.this.f30170b, "..", R.drawable.baseline_folder_24, "..", C4403w.m27871i1(R.string.AttachFolderHome)), R.id.btn_folder_upper));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C8756f fVar = (C8756f) it.next();
                    arrayList2.add(View$OnClickListenerC8750f0.m11536mh(new C4756s(View$OnClickListenerC8750f0.this.f30168a, View$OnClickListenerC8750f0.this.f30170b, new File(fVar.m11512a()), fVar.m11509d(), C4403w.m27804z0(Math.max(fVar.m11510c(), fVar.m11511b()), TimeUnit.SECONDS, fVar.m11508e()), (Object) fVar, false), R.id.btn_file));
                }
                AbstractRunnableC8757g.C8758a aVar = new AbstractRunnableC8757g.C8758a(arrayList2, true);
                query.close();
                return aVar;
            } catch (Throwable th) {
                Log.m14725e("Cannot build downloads", th, new Object[0]);
                View$OnClickListenerC8750f0.this.m11570Ih(this, R.string.AppName, R.string.AccessError);
                return null;
            }
        }
    }

    public class C8754d extends AbstractRunnableC8757g {
        public C8754d(View$OnClickListenerC8750f0 f0Var) {
            super(f0Var);
        }

        public static int m11513h(C8759h hVar, C8759h hVar2) {
            int compareToIgnoreCase = hVar.f28257b.compareToIgnoreCase(hVar2.f28257b);
            return compareToIgnoreCase != 0 ? compareToIgnoreCase : hVar.f28258c.compareTo(hVar2.f28258c);
        }

        @Override
        public AbstractRunnableC8757g.C8758a mo11506b() {
            try {
                Cursor query = C1379j0.m37318n().getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "artist", "title", "_data", "duration", "date_added", "mime_type", "album_id"}, "is_music != 0", null, "date_added desc");
                if (query == null) {
                    View$OnClickListenerC8750f0.this.m11570Ih(this, R.string.AppName, R.string.AccessError);
                    return null;
                }
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    long j = query.getLong(0);
                    String string = query.getString(1);
                    String string2 = query.getString(2);
                    String string3 = query.getString(3);
                    long j2 = query.getInt(4);
                    String string4 = query.getString(6);
                    long j3 = query.getLong(7);
                    if (!C5070i.m24062i(string3)) {
                        if (string == null) {
                            string = "";
                        }
                        if (string2 == null) {
                            string2 = "";
                        }
                        arrayList.add(new C8759h(j, string, string2, string3, j2, string4, j3));
                    }
                }
                C7389v0.m16738F(query);
                if (arrayList.isEmpty()) {
                    View$OnClickListenerC8750f0.this.m11570Ih(this, R.string.AppName, R.string.NoMusicFilesFound);
                    return null;
                }
                Collections.sort(arrayList, C8764g0.f28269a);
                ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
                arrayList2.add(View$OnClickListenerC8750f0.m11536mh(View$OnClickListenerC8750f0.m11532qh(View$OnClickListenerC8750f0.this.f30168a, View$OnClickListenerC8750f0.this.f30170b, "..", R.drawable.baseline_folder_24, "..", C4403w.m27871i1(R.string.AttachFolderHome)), R.id.btn_folder_upper));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C2964ra(41, R.id.btn_file).m32873G(new C4756s(View$OnClickListenerC8750f0.this.f30168a, View$OnClickListenerC8750f0.this.f30170b, (C8759h) it.next(), View$OnClickListenerC8750f0.this)));
                }
                return new AbstractRunnableC8757g.C8758a(arrayList2, true);
            } catch (Throwable th) {
                Log.m14725e("Cannot build music", th, new Object[0]);
                View$OnClickListenerC8750f0.this.m11570Ih(this, R.string.AppName, R.string.AccessError);
                return null;
            }
        }
    }

    public class C8755e extends AbstractRunnableC8757g {
        public final String f28239N;
        public final String f28240O;

        public C8755e(View$OnClickListenerC8750f0 f0Var, String str, String str2) {
            super(f0Var);
            this.f28239N = str;
            this.f28240O = str2;
        }

        @Override
        public AbstractRunnableC8757g.C8758a mo11506b() {
            try {
                File file = new File(this.f28239N);
                if (file.exists() && file.isDirectory()) {
                    if (!file.canRead()) {
                        View$OnClickListenerC8750f0.this.m11570Ih(this, R.string.AppName, R.string.AccessError);
                        return null;
                    }
                    File[] listFiles = file.listFiles();
                    if (!(listFiles == null || listFiles.length == 0)) {
                        ArrayList arrayList = new ArrayList(listFiles.length);
                        Collections.addAll(arrayList, listFiles);
                        Collections.sort(arrayList, View$OnClickListenerC8750f0.this);
                        ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
                        arrayList2.add(View$OnClickListenerC8750f0.m11536mh(View$OnClickListenerC8750f0.m11532qh(View$OnClickListenerC8750f0.this.f30168a, View$OnClickListenerC8750f0.this.f30170b, "..", R.drawable.baseline_folder_24, "..", C5070i.m24062i(this.f28240O) ? C4403w.m27871i1(R.string.AttachFolderHome) : this.f28240O), R.id.btn_folder_upper));
                        if ("/".equals(this.f28239N)) {
                            View$OnClickListenerC8750f0.this.m11545dh(arrayList2);
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            File file2 = (File) it.next();
                            arrayList2.add(View$OnClickListenerC8750f0.m11536mh(View$OnClickListenerC8750f0.m11534oh(View$OnClickListenerC8750f0.this.f30168a, View$OnClickListenerC8750f0.this.f30170b, file2, null), file2.isDirectory() ? R.id.btn_folder : R.id.btn_file));
                        }
                        return new AbstractRunnableC8757g.C8758a(arrayList2, true);
                    }
                    View$OnClickListenerC8750f0.this.m11570Ih(this, R.string.AppName, R.string.FolderEmpty);
                    return null;
                }
                View$OnClickListenerC8750f0.this.m11570Ih(this, R.string.AppName, R.string.FolderDoesNotExist);
                return null;
            } catch (Throwable th) {
                Log.m14725e("Cannot build folder", th, new Object[0]);
                View$OnClickListenerC8750f0.this.m11570Ih(this, R.string.AppName, R.string.AccessError);
                return null;
            }
        }
    }

    public static class C8756f {
        public final Uri f28242a;
        public final long f28243b;
        public final String f28244c;
        public final long f28245d;
        public final String f28246e;
        public final String f28247f;
        public final long f28248g;
        public final long f28249h;

        public C8756f(Uri uri, long j, String str, long j2, String str2, String str3, long j3, long j4) {
            this.f28242a = uri;
            this.f28243b = j;
            this.f28244c = str;
            this.f28245d = j2;
            this.f28246e = str2;
            this.f28247f = str3;
            this.f28248g = j3;
            this.f28249h = j4;
        }

        public String m11512a() {
            return this.f28246e;
        }

        public long m11511b() {
            return this.f28248g;
        }

        public long m11510c() {
            return this.f28249h;
        }

        public String m11509d() {
            return this.f28244c;
        }

        public long m11508e() {
            return this.f28245d;
        }
    }

    public static abstract class AbstractRunnableC8757g implements Runnable {
        public Runnable f28250M;
        public final View$OnClickListenerC8750f0 f28251a;
        public volatile boolean f28252b;
        public Runnable f28253c;

        public static class C8758a {
            public ArrayList<C2964ra> f28254a;
            public boolean f28255b;

            public C8758a(ArrayList<C2964ra> arrayList, boolean z) {
                this.f28254a = arrayList;
                this.f28255b = z;
            }

            public boolean m11501a() {
                ArrayList<C2964ra> arrayList = this.f28254a;
                return arrayList == null || arrayList.isEmpty();
            }
        }

        public AbstractRunnableC8757g(View$OnClickListenerC8750f0 f0Var) {
            this.f28251a = f0Var;
        }

        public void m11503e(C8758a aVar, Runnable runnable) {
            if (!this.f28251a.m9347Sa() && this.f28251a.f28230K0 == this && !m11504d()) {
                if (aVar != null && !aVar.m11501a()) {
                    this.f28251a.m11586Ah(this, aVar.f28254a, aVar.f28255b);
                }
                runnable.run();
            }
        }

        public abstract C8758a mo11506b();

        public void m11505c() {
            synchronized (this) {
                this.f28252b = true;
            }
        }

        public boolean m11504d() {
            boolean z;
            synchronized (this) {
                z = this.f28252b;
            }
            return z;
        }

        public void m11502f(Runnable runnable, Runnable runnable2) {
            this.f28253c = runnable;
            this.f28250M = runnable2;
        }

        @Override
        public void run() {
            synchronized (this) {
                if (!this.f28252b) {
                    final C8758a b = mo11506b();
                    final Runnable runnable = (b == null || b.m11501a()) ? this.f28250M : this.f28253c;
                    if (runnable != null) {
                        C1379j0.m37337d0(new Runnable() {
                            @Override
                            public final void run() {
                                View$OnClickListenerC8750f0.AbstractRunnableC8757g.this.m11503e(b, runnable);
                            }
                        });
                    }
                }
            }
        }
    }

    public static class C8759h {
        public final long f28256a;
        public final String f28257b;
        public final String f28258c;
        public final String f28259d;
        public final long f28260e;
        public final String f28261f;
        public final long f28262g;

        public C8759h(long j, String str, String str2, String str3, long j2, String str4, long j3) {
            this.f28256a = j;
            this.f28257b = str;
            this.f28258c = str2;
            this.f28259d = str3;
            this.f28260e = j2;
            this.f28261f = str4;
            this.f28262g = j3;
        }

        public long m11498c() {
            return this.f28262g;
        }

        public String m11497d() {
            return this.f28257b;
        }

        public Uri m11496e() {
            return ContentUris.withAppendedId(Uri.parse("content://media/external/audio/albumart"), m11498c());
        }

        public long m11495f() {
            return this.f28260e;
        }

        public long m11494g() {
            return this.f28256a;
        }

        public String m11493h() {
            return this.f28261f;
        }

        public String m11492i() {
            return this.f28259d;
        }

        public String m11491j() {
            return this.f28258c;
        }

        public boolean m11490k() {
            return m11498c() != 0;
        }
    }

    public static class C8760i {
        public final String f28263a;
        public final int f28264b;
        public final int f28265c;

        public C8760i(String str, int i, int i2) {
            this.f28263a = str;
            this.f28264b = i;
            this.f28265c = i2;
        }
    }

    public View$OnClickListenerC8750f0(View$OnClickListenerC8851y1 y1Var) {
        super(y1Var, (int) R.string.File);
    }

    public void m11584Bh(List list, boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        this.f28443n0.m11128k3(list, null, new TdApi.MessageSendOptions(z, false, false, messageSchedulingState), false);
    }

    public void m11582Ch(Set set) {
        if (set != null && !set.isEmpty()) {
            final ArrayList arrayList = new ArrayList(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                String U2 = C7389v0.m16675U2(uri);
                if (C5070i.m24062i(U2) || !C7389v0.m16750C(U2)) {
                    arrayList.add(uri.toString());
                } else {
                    arrayList.add(U2);
                }
            }
            this.f28443n0.m11143b3(new HandlerC10770jj.AbstractC10786o() {
                @Override
                public final void mo3333a(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
                    View$OnClickListenerC8750f0.this.m11584Bh(arrayList, z, messageSchedulingState, z2);
                }
            });
        }
    }

    public static void m11580Dh(AbstractC5918j jVar, int i, int i2, Intent intent) {
        if (i2 == -1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                    Uri uri = clipData.getItemAt(i3).getUri();
                    if (uri != null) {
                        linkedHashSet.add(uri);
                    }
                }
            }
            if (!linkedHashSet.isEmpty()) {
                jVar.mo1330a(linkedHashSet);
            }
        }
    }

    public static String m11572Hh(String str) {
        int i;
        if (str.startsWith("dir://")) {
            i = 6;
        } else if (!str.startsWith("file://")) {
            return str;
        } else {
            i = 7;
        }
        return str.substring(i);
    }

    public static C2964ra m11536mh(AbstractC4718o<?> oVar, int i) {
        return new C2964ra(41, i).m32873G(oVar);
    }

    public static C4756s m11535nh(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, C4356b0.C4358b bVar) {
        File file = new File(bVar.m28173i().mo20876q());
        String charSequence = C4403w.m27806y2(bVar.m28174h(), bVar.m28171k()).toString();
        long f = bVar.m28176f();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (C5067f.m24108m(f, timeUnit)) {
            charSequence = C4403w.m27867j1(R.string.format_contentAndModifyDate2, charSequence, C4403w.m27972K0(bVar.m28176f(), timeUnit));
        }
        return m11533ph(aVar, q6Var, file, bVar, bVar.m28175g(), 0L, charSequence, true);
    }

    public static C4756s m11534oh(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, File file, Object obj) {
        return m11533ph(aVar, q6Var, file, obj, null, file.lastModified(), null, false);
    }

    public static C4756s m11533ph(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, File file, Object obj, String str, long j, String str2, boolean z) {
        if (file.isDirectory()) {
            return new C4756s(aVar, q6Var, "dir://" + file.getPath(), (int) R.id.theme_color_fileAttach, (int) R.drawable.baseline_folder_24, file.getName(), C4403w.m27871i1(R.string.Folder));
        }
        return new C4756s(aVar, q6Var, file, str != null ? str : file.getName(), str2 == null ? C4403w.m27804z0(j, TimeUnit.MILLISECONDS, file.length()) : str2, obj, z);
    }

    public static C4756s m11532qh(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, String str, int i, String str2, String str3) {
        return new C4756s(aVar, q6Var, str, (int) R.id.theme_color_fileAttach, i, str2, str3);
    }

    public static C4756s m11531rh(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, C6253l lVar) {
        return m11533ph(aVar, q6Var, new File(lVar.mo20876q()), lVar, null, lVar.m20867I0(), null, false);
    }

    public void m11525uh(String str, int i, int i2, LinearLayoutManager linearLayoutManager) {
        ArrayList<C8760i> arrayList = this.f28233N0;
        if (i == -1) {
            i = 0;
        }
        arrayList.add(new C8760i(str, i, i2));
        linearLayoutManager.m39525z2(0, 0);
    }

    public static boolean m11523vh(Runnable runnable, View view, int i) {
        if (i != R.id.btn_done) {
            return true;
        }
        runnable.run();
        return true;
    }

    public void m11521wh(final Runnable runnable) {
        m9261ee(C4403w.m27984H0(this, R.string.ApplicationFolderWarning, new Object[0]), new int[]{R.id.btn_done, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.ApplicationFolderWarningConfirm), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_warning_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean vh;
                vh = View$OnClickListenerC8750f0.m11523vh(runnable, view, i);
                return vh;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23936a(this);
            }

            @Override
            public Object mo491b2(int i) {
                return C5115g0.m23935b(this, i);
            }
        });
    }

    public static void m11519xh(AbstractRunnableC8757g gVar) {
        C4383l.m28061a().m28060b(gVar);
    }

    public void m11517yh(C8760i iVar) {
        ((LinearLayoutManager) this.f28453x0.getLayoutManager()).m39525z2(iVar.f28264b, iVar.f28265c);
    }

    public void m11515zh(AbstractRunnableC8757g gVar, int i, int i2) {
        if (!m9347Sa() && this.f28230K0 == gVar && !gVar.m11504d()) {
            m9425Hc(i, i2);
        }
    }

    @Override
    public int mo11334Af() {
        return C1357a0.m37544i(101.0f);
    }

    public final void m11578Eh(final String str, C4756s sVar) {
        if (this.f28232M0) {
            this.f28443n0.m11144b2();
        }
        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f28453x0.getLayoutManager();
        final int X1 = linearLayoutManager.m39552X1();
        View C = X1 != -1 ? linearLayoutManager.mo39265C(X1) : null;
        final int top = C != null ? C.getTop() : 0;
        m11576Fh(str, m11529sh(1), false, sVar, new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC8750f0.this.m11525uh(str, X1, top, linearLayoutManager);
            }
        }, null);
    }

    public final void m11576Fh(java.lang.String r24, java.lang.String r25, boolean r26, gd.C4756s r27, java.lang.Runnable r28, java.lang.Runnable r29) {
        throw new UnsupportedOperationException("Method not decompiled: sc.View$OnClickListenerC8750f0.m11576Fh(java.lang.String, java.lang.String, boolean, gd.s, java.lang.Runnable, java.lang.Runnable):void");
    }

    public final void m11574Gh() {
        if (!this.f28233N0.isEmpty()) {
            if (this.f28232M0) {
                this.f28443n0.m11144b2();
            }
            ArrayList<C8760i> arrayList = this.f28233N0;
            final C8760i remove = arrayList.remove(arrayList.size() - 1);
            if (this.f28233N0.isEmpty()) {
                m11543fh();
                m11294gf();
                return;
            }
            ArrayList<C8760i> arrayList2 = this.f28233N0;
            m11576Fh(arrayList2.get(arrayList2.size() - 1).f28263a, m11529sh(2), true, null, new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC8750f0.this.m11517yh(remove);
                }
            }, new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC8750f0.this.m11574Gh();
                }
            });
        }
    }

    public final void m11570Ih(final AbstractRunnableC8757g gVar, final int i, final int i2) {
        C1379j0.m37337d0(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC8750f0.this.m11515zh(gVar, i, i2);
            }
        });
    }

    @Override
    public void mo419J(int i, View view) {
        if (i == R.id.menu_btn_more) {
            m11562Mh();
        }
    }

    public final void m11568Jh(C2964ra raVar, AbstractC4718o<?> oVar) {
        int i;
        boolean z;
        ArrayList<AbstractC4718o<?>> arrayList = this.f28231L0;
        if (arrayList == null) {
            this.f28231L0 = new ArrayList<>();
            i = -1;
        } else {
            i = arrayList.indexOf(oVar);
        }
        int i2 = 0;
        if (i != -1) {
            this.f28231L0.remove(i);
            raVar.m32860T(false, i);
            int size = this.f28231L0.size();
            for (int i3 = i; i3 < size; i3++) {
                int L0 = this.f28228I0.m34231L0(this.f28231L0.get(i3));
                if (L0 != -1) {
                    this.f28228I0.m34126v2(L0, true, this.f28228I0.m34243F0().get(L0).m32853a());
                } else {
                    throw new IllegalStateException();
                }
            }
            z = false;
        } else {
            i = this.f28231L0.size();
            this.f28231L0.add(oVar);
            raVar.m32860T(true, i);
            z = true;
        }
        Iterator<C2964ra> it = this.f28228I0.m34243F0().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C2964ra next = it.next();
            if (next.m32838j() == raVar.m32838j() && next.m32847d() == raVar.m32847d()) {
                this.f28228I0.m34126v2(i2, z, i);
                break;
            }
            i2++;
        }
        m11564Lh(!this.f28231L0.isEmpty());
        this.f28443n0.setCounter(this.f28231L0.size());
    }

    public final void m11586Ah(final AbstractRunnableC8757g gVar, final ArrayList<C2964ra> arrayList, final boolean z) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C1379j0.m37337d0(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC8750f0.this.m11586Ah(gVar, arrayList, z);
                }
            });
        } else if (gVar == null || (this.f28230K0 == gVar && !gVar.m11504d() && !m9347Sa())) {
            this.f28228I0.m34119x2(arrayList, false);
            if (z && !m11324Lf()) {
                m11287kf();
            }
        }
    }

    public final void m11564Lh(boolean z) {
        if (this.f28232M0 != z) {
            this.f28232M0 = z;
            this.f28228I0.m34134s2(z, false, null);
            if (!z && !this.f28231L0.isEmpty()) {
                this.f28231L0.clear();
                this.f28228I0.m34121x0();
            }
        }
    }

    @TargetApi(18)
    public final void m11562Mh() {
        final AbstractC5918j d0Var = new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                View$OnClickListenerC8750f0.this.m11582Ch((Set) obj);
            }
        };
        Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType("*/*").putExtra("android.intent.extra.ALLOW_MULTIPLE", true).putExtra("android.content.extra.SHOW_ADVANCED", true);
        this.f30168a.m14452p2(105, new AbstractC9142a() {
            @Override
            public final void mo10181t(int i, int i2, Intent intent) {
                View$OnClickListenerC8750f0.m11580Dh(AbstractC5918j.this, i, i2, intent);
            }
        });
        try {
            this.f30168a.startActivityForResult(putExtra, 105);
        } catch (ActivityNotFoundException e) {
            C1379j0.m37295y0(R.string.NoFilePicker, 0);
            Log.m14718i(e);
        }
    }

    @Override
    public int mo407R9() {
        return R.id.controller_media_files;
    }

    @Override
    public int mo418W9() {
        return R.id.menu_more;
    }

    @Override
    public void mo11231Wf() {
        if (this.f28231L0 != null) {
            m11564Lh(false);
        }
    }

    @Override
    public void mo11225Yf(TdApi.MessageSendOptions messageSendOptions, boolean z) {
        ArrayList<AbstractC4718o<?>> arrayList = this.f28231L0;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList<C8759h> arrayList2 = new ArrayList<>();
            ArrayList arrayList3 = new ArrayList();
            Iterator<AbstractC4718o<?>> it = this.f28231L0.iterator();
            while (it.hasNext()) {
                AbstractC4718o<?> next = it.next();
                int v = next.m26331v();
                if (v == 7) {
                    arrayList2.add((C8759h) ((C4756s) next).m26266b0());
                } else if (v == 9) {
                    arrayList3.add(next.m26337p());
                }
            }
            if (!arrayList2.isEmpty() || !arrayList3.isEmpty()) {
                this.f28443n0.m11128k3(arrayList3, arrayList2, messageSendOptions, true);
            }
        }
    }

    public final void m11545dh(List<C2964ra> list) {
        try {
            String path = C1379j0.m37312q().getFilesDir().getPath();
            String str = null;
            File externalFilesDir = C1379j0.m37312q().getExternalFilesDir(null);
            if (externalFilesDir != null) {
                str = externalFilesDir.getPath();
            }
            String str2 = str;
            if (externalFilesDir != null && !C5070i.m24068c(str2, path)) {
                AbstractView$OnTouchListenerC7889a aVar = this.f30168a;
                C10930q6 q6Var = this.f30170b;
                list.add(m11536mh(m11532qh(aVar, q6Var, "dir://" + str2, R.drawable.baseline_settings_24, C4403w.m27871i1(R.string.ApplicationFolderExternal), str2), R.id.btn_folder));
            }
            AbstractView$OnTouchListenerC7889a aVar2 = this.f30168a;
            C10930q6 q6Var2 = this.f30170b;
            list.add(m11536mh(m11532qh(aVar2, q6Var2, "dir://" + path, R.drawable.baseline_settings_24, C4403w.m27871i1(R.string.ApplicationFolder), path), R.id.btn_folder));
        } catch (Throwable th) {
            Log.m14723e(th);
        }
    }

    @Override
    public boolean mo11297ef() {
        return super.mo11297ef() && this.f28233N0.isEmpty();
    }

    public final AbstractRunnableC8757g m11544eh(C4756s sVar) {
        return new C8752b(this, sVar);
    }

    public final void m11543fh() {
        m11576Fh(null, null, false, null, null, null);
    }

    public final AbstractRunnableC8757g m11542gh() {
        return new C8753c(this);
    }

    public final AbstractRunnableC8757g m11541hh(String str, String str2) {
        return new C8755e(this, str, str2);
    }

    public final AbstractRunnableC8757g m11540ih() {
        return new C8751a(this);
    }

    @Override
    public boolean mo404jc(boolean z) {
        if (super.mo404jc(z)) {
            return true;
        }
        if (this.f28232M0) {
            this.f28443n0.m11144b2();
            return true;
        } else if (this.f28233N0.isEmpty()) {
            return false;
        } else {
            m11574Gh();
            return true;
        }
    }

    public final AbstractRunnableC8757g m11539jh() {
        return new C8754d(this);
    }

    public final void m11538kh() {
        AbstractRunnableC8757g gVar = this.f28230K0;
        if (gVar != null) {
            gVar.m11505c();
            this.f28230K0 = null;
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
        String v0 = C7389v0.m16573v0(name);
        String v02 = C7389v0.m16573v0(name2);
        if (v0 == null && v02 == null) {
            return name.compareTo(name2);
        }
        if (v0 == null) {
            return -1;
        }
        if (v02 == null) {
            return 1;
        }
        String lowerCase = v0.toLowerCase();
        String lowerCase2 = v02.toLowerCase();
        return lowerCase.equals(lowerCase2) ? name.compareTo(name2) : lowerCase.compareTo(lowerCase2);
    }

    @Override
    public View mo403oc(Context context) {
        m11300bf(false);
        m11527th();
        m11288jg(new LinearLayoutManager(context, 1, false));
        m11292hg(this.f28228I0);
        return this.f28451v0;
    }

    @Override
    public boolean mo11202og() {
        return true;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_folder_upper) {
            m11574Gh();
            return;
        }
        Object tag = view.getTag();
        if (tag != null && (tag instanceof C2964ra)) {
            C2964ra raVar = (C2964ra) tag;
            if (raVar.m32879A() == 41) {
                C4756s sVar = (C4756s) raVar.m32847d();
                int j = raVar.m32838j();
                if (j == R.id.btn_bucket) {
                    m11578Eh("bucket", sVar);
                } else if (j == R.id.btn_file || j == R.id.btn_music) {
                    if (this.f28232M0) {
                        m11568Jh(raVar, sVar);
                        return;
                    }
                    int v = sVar.m26331v();
                    if (v == 7) {
                        this.f28443n0.m11121n3((C8759h) sVar.m26266b0());
                    } else if (v == 9) {
                        this.f28443n0.m11130j3(sVar.m26337p());
                    }
                } else if (view.getId() != R.id.btn_internalStorage || C7389v0.m16558z()) {
                    String p = sVar.m26337p();
                    if (p == null) {
                        return;
                    }
                    if ("gallery".equals(p) || "music".equals(p) || "downloads".equals(p) || "bucket".equals(p) || p.startsWith("dir://")) {
                        m11578Eh(p, sVar);
                    } else if ("..".equals(p)) {
                        m11574Gh();
                    }
                } else {
                    m11562Mh();
                }
            }
        }
    }

    @Override
    public boolean onLongClick(View view) {
        AbstractC4718o<?> oVar;
        Object tag = view.getTag();
        if (tag == null || !(tag instanceof C2964ra)) {
            return false;
        }
        C2964ra raVar = (C2964ra) tag;
        if (raVar.m32879A() != 41) {
            return false;
        }
        if ((raVar.m32838j() != R.id.btn_file && raVar.m32838j() != R.id.btn_music) || (oVar = (AbstractC4718o) raVar.m32847d()) == null) {
            return false;
        }
        m11568Jh(raVar, oVar);
        return true;
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        if (i == R.id.menu_more) {
            d1Var.m10068b2(linearLayout, this);
        }
    }

    @Override
    public boolean mo6987q7(TdApi.Message message, boolean z, boolean z2, List<TdApi.Message> list, long j) {
        return false;
    }

    @Override
    public C9773p0.C9775b mo6986s5(TdApi.Message message) {
        TdApi.Message a0;
        ArrayList arrayList = null;
        int i = -1;
        for (C2964ra raVar : this.f28228I0.m34243F0()) {
            if (raVar.m32838j() == R.id.btn_file && raVar.m32879A() == 41 && (raVar.m32847d() instanceof C4756s)) {
                C4756s sVar = (C4756s) raVar.m32847d();
                if (sVar.m26331v() == 7 && (a0 = sVar.m26267a0()) != null) {
                    if (i == -1 && C9773p0.m7114D(a0, message)) {
                        i = arrayList != null ? arrayList.size() : 0;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(a0);
                }
            }
        }
        if (arrayList == null || i == -1) {
            return null;
        }
        return new C9773p0.C9775b(arrayList, i).m6990s(true, true);
    }

    public final String m11529sh(int i) {
        if (this.f28233N0.size() < i) {
            return null;
        }
        ArrayList<C8760i> arrayList = this.f28233N0;
        return m11572Hh(arrayList.get(arrayList.size() - i).f28263a);
    }

    @Override
    public int mo401tf() {
        m11527th();
        int i = C1357a0.m37544i(72.0f);
        int i2 = this.f28229J0;
        if (i2 == 0) {
            i2 = (!C7389v0.m16620j1() || Environment.isExternalStorageEmulated()) ? 4 : 5;
        }
        return i * i2;
    }

    public final void m11527th() {
        if (this.f28228I0 == null) {
            C2546iq iqVar = new C2546iq(this);
            this.f28228I0 = iqVar;
            iqVar.m34241F2(this);
            m11543fh();
        }
    }
}
