package p6;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import r6.b;
import t6.a;
import t6.t;
import t6.y;
import w6.e;
import w6.g;
import w6.p;

public final class h2 implements d4 {
    public static final a f20637i = new a("FakeAssetPackService");
    public static final AtomicInteger f20638j = new AtomicInteger(1);
    public final String f20639a;
    public final z f20640b;
    public final k1 f20641c;
    public final Context f20642d;
    public final w2 f20643e;
    public final y f20644f;
    public final u2 f20645g;
    public final Handler f20646h = new Handler(Looper.getMainLooper());

    public h2(File file, z zVar, k1 k1Var, Context context, w2 w2Var, y yVar, u2 u2Var) {
        this.f20639a = file.getAbsolutePath();
        this.f20640b = zVar;
        this.f20641c = k1Var;
        this.f20642d = context;
        this.f20643e = w2Var;
        this.f20644f = yVar;
        this.f20645g = u2Var;
    }

    public static long g(int i10, long j10) {
        if (i10 == 2) {
            return j10 / 2;
        }
        if (i10 == 3 || i10 == 4) {
            return j10;
        }
        return 0L;
    }

    public static String l(File file) {
        try {
            return j2.a(Arrays.asList(file));
        } catch (IOException e10) {
            throw new b(String.format("Could not digest file: %s.", file), e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new b("SHA256 algorithm not supported.", e11);
        }
    }

    @Override
    public final void a(final int i10, final String str) {
        f20637i.d("notifyModuleCompleted", new Object[0]);
        ((Executor) this.f20644f.zza()).execute(new Runnable() {
            @Override
            public final void run() {
                h2.this.i(i10, str);
            }
        });
    }

    @Override
    public final e b(int i10, String str, String str2, int i11) {
        File[] m10;
        int i12;
        f20637i.d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i10), str, str2, Integer.valueOf(i11));
        p pVar = new p();
        try {
        } catch (FileNotFoundException e10) {
            f20637i.e("getChunkFileDescriptor failed", e10);
            pVar.b(new b("Asset Slice file not found.", e10));
        } catch (b e11) {
            f20637i.e("getChunkFileDescriptor failed", e11);
            pVar.b(e11);
        }
        for (File file : m(str)) {
            if (t.a(file).equals(str2)) {
                pVar.c(ParcelFileDescriptor.open(file, 268435456));
                return pVar.a();
            }
        }
        throw new b(String.format("Local testing slice for '%s' not found.", str2));
    }

    @Override
    public final void c(int i10, String str, String str2, int i11) {
        f20637i.d("notifyChunkTransferred", new Object[0]);
    }

    @Override
    public final void d(int i10) {
        f20637i.d("notifySessionFailed", new Object[0]);
    }

    @Override
    public final e e(Map map) {
        f20637i.d("syncPacks()", new Object[0]);
        return g.c(new ArrayList());
    }

    @Override
    public final void f(List list) {
        f20637i.d("cancelDownload(%s)", list);
    }

    public final void h(Intent intent) {
        this.f20640b.a(this.f20642d, intent);
    }

    public final void i(int i10, String str) {
        try {
            j(i10, str, 4);
        } catch (b e10) {
            f20637i.e("notifyModuleCompleted failed", e10);
        }
    }

    public final Bundle j(int i10, String str, int i11) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f20643e.a());
        bundle.putInt("session_id", i10);
        File[] m10 = m(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long j10 = 0;
        for (File file : m10) {
            j10 += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i11 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String a10 = t.a(file);
            bundle.putParcelableArrayList(q6.b.b("chunk_intents", str, a10), arrayList2);
            bundle.putString(q6.b.b("uncompressed_hash_sha256", str, a10), l(file));
            bundle.putLong(q6.b.b("uncompressed_size", str, a10), file.length());
            arrayList.add(a10);
        }
        bundle.putStringArrayList(q6.b.a("slice_ids", str), arrayList);
        bundle.putLong(q6.b.a("pack_version", str), this.f20643e.a());
        bundle.putInt(q6.b.a("status", str), i11);
        bundle.putInt(q6.b.a("error_code", str), 0);
        bundle.putLong(q6.b.a("bytes_downloaded", str), g(i11, j10));
        bundle.putLong(q6.b.a("total_bytes_to_download", str), j10);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", g(i11, j10));
        bundle.putLong("total_bytes_to_download", j10);
        final Intent putExtra = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        this.f20646h.post(new Runnable() {
            @Override
            public final void run() {
                h2.this.h(putExtra);
            }
        });
        return bundle;
    }

    @Override
    public final void k() {
        f20637i.d("keepAlive", new Object[0]);
    }

    public final File[] m(final String str) {
        File file = new File(this.f20639a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new FilenameFilter() {
                @Override
                public final boolean accept(File file2, String str2) {
                    return str2.startsWith(String.valueOf(str).concat("-")) && str2.endsWith(".apk");
                }
            });
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (t.a(file2).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new b(String.format("No main slice available for pack '%s'.", str));
                }
                throw new b(String.format("No APKs available for pack '%s'.", str));
            }
            throw new b(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        throw new b(String.format("Local testing directory '%s' not found.", file));
    }
}
