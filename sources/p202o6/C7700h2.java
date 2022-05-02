package p202o6;

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
import p219p6.C8054b;
import p233q6.C8258b;
import p262s6.AbstractC8689y;
import p262s6.C8646a;
import p262s6.C8684t;
import p300v6.AbstractC9854e;
import p300v6.C9856g;
import p300v6.C9865p;

public final class C7700h2 implements AbstractC7680d4 {
    public static final C8646a f24674i = new C8646a("FakeAssetPackService");
    public static final AtomicInteger f24675j = new AtomicInteger(1);
    public final String f24676a;
    public final C7787z f24677b;
    public final C7714k1 f24678c;
    public final Context f24679d;
    public final C7775w2 f24680e;
    public final AbstractC8689y f24681f;
    public final C7765u2 f24682g;
    public final Handler f24683h = new Handler(Looper.getMainLooper());

    public C7700h2(File file, C7787z zVar, C7714k1 k1Var, Context context, C7775w2 w2Var, AbstractC8689y yVar, C7765u2 u2Var) {
        this.f24676a = file.getAbsolutePath();
        this.f24677b = zVar;
        this.f24678c = k1Var;
        this.f24679d = context;
        this.f24680e = w2Var;
        this.f24681f = yVar;
        this.f24682g = u2Var;
    }

    public static long m15208g(int i, long j) {
        if (i == 2) {
            return j / 2;
        }
        if (i == 3 || i == 4) {
            return j;
        }
        return 0L;
    }

    public static String m15204l(File file) {
        try {
            return C7710j2.m15196a(Arrays.asList(file));
        } catch (IOException e) {
            throw new C8258b(String.format("Could not digest file: %s.", file), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new C8258b("SHA256 algorithm not supported.", e2);
        }
    }

    @Override
    public final void mo15141a(final int i, final String str) {
        f24674i.m11814d("notifyModuleCompleted", new Object[0]);
        ((Executor) this.f24681f.zza()).execute(new Runnable() {
            @Override
            public final void run() {
                C7700h2.this.m15206i(i, str);
            }
        });
    }

    @Override
    public final AbstractC9854e mo15140b(int i, String str, String str2, int i2) {
        File[] m;
        int i3;
        f24674i.m11814d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i), str, str2, Integer.valueOf(i2));
        C9865p pVar = new C9865p();
        try {
        } catch (FileNotFoundException e) {
            f24674i.m11813e("getChunkFileDescriptor failed", e);
            pVar.m6734b(new C8258b("Asset Slice file not found.", e));
        } catch (C8258b e2) {
            f24674i.m11813e("getChunkFileDescriptor failed", e2);
            pVar.m6734b(e2);
        }
        for (File file : m15203m(str)) {
            if (C8684t.m11738a(file).equals(str2)) {
                pVar.m6733c(ParcelFileDescriptor.open(file, 268435456));
                return pVar.m6735a();
            }
        }
        throw new C8258b(String.format("Local testing slice for '%s' not found.", str2));
    }

    @Override
    public final void mo15139c(int i, String str, String str2, int i2) {
        f24674i.m11814d("notifyChunkTransferred", new Object[0]);
    }

    @Override
    public final void mo15138d(int i) {
        f24674i.m11814d("notifySessionFailed", new Object[0]);
    }

    @Override
    public final AbstractC9854e mo15137e(Map map) {
        f24674i.m11814d("syncPacks()", new Object[0]);
        return C9856g.m6747c(new ArrayList());
    }

    @Override
    public final void mo15136f(List list) {
        f24674i.m11814d("cancelDownload(%s)", list);
    }

    public final void m15207h(Intent intent) {
        this.f24677b.mo10755a(this.f24679d, intent);
    }

    public final void m15206i(int i, String str) {
        try {
            m15205j(i, str, 4);
        } catch (C8258b e) {
            f24674i.m11813e("notifyModuleCompleted failed", e);
        }
    }

    public final Bundle m15205j(int i, String str, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f24680e.m15109a());
        bundle.putInt("session_id", i);
        File[] m = m15203m(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long j = 0;
        for (File file : m) {
            j += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i2 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String a = C8684t.m11738a(file);
            bundle.putParcelableArrayList(C8054b.m13689b("chunk_intents", str, a), arrayList2);
            bundle.putString(C8054b.m13689b("uncompressed_hash_sha256", str, a), m15204l(file));
            bundle.putLong(C8054b.m13689b("uncompressed_size", str, a), file.length());
            arrayList.add(a);
        }
        bundle.putStringArrayList(C8054b.m13690a("slice_ids", str), arrayList);
        bundle.putLong(C8054b.m13690a("pack_version", str), this.f24680e.m15109a());
        bundle.putInt(C8054b.m13690a("status", str), i2);
        bundle.putInt(C8054b.m13690a("error_code", str), 0);
        bundle.putLong(C8054b.m13690a("bytes_downloaded", str), m15208g(i2, j));
        bundle.putLong(C8054b.m13690a("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", m15208g(i2, j));
        bundle.putLong("total_bytes_to_download", j);
        final Intent putExtra = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        this.f24683h.post(new Runnable() {
            @Override
            public final void run() {
                C7700h2.this.m15207h(putExtra);
            }
        });
        return bundle;
    }

    @Override
    public final void mo15131k() {
        f24674i.m11814d("keepAlive", new Object[0]);
    }

    public final File[] m15203m(final String str) {
        File file = new File(this.f24676a);
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
                        if (C8684t.m11738a(file2).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new C8258b(String.format("No main slice available for pack '%s'.", str));
                }
                throw new C8258b(String.format("No APKs available for pack '%s'.", str));
            }
            throw new C8258b(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        throw new C8258b(String.format("Local testing directory '%s' not found.", file));
    }
}
