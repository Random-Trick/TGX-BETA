package p352z0;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p256s0.C8606e;
import p352z0.C11216f;

public class C11207c {
    public static final Comparator<byte[]> f35902a = new C11208a();

    public class C11208a implements Comparator<byte[]> {
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            if (bArr.length != bArr2.length) {
                i = bArr.length;
                i2 = bArr2.length;
            } else {
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    if (bArr[i3] != bArr2[i3]) {
                        i = bArr[i3];
                        i2 = bArr2[i3];
                    }
                }
                return 0;
            }
            return i - i2;
        }
    }

    public static List<byte[]> m1230a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static boolean m1229b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static List<List<byte[]>> m1228c(C11209d dVar, Resources resources) {
        if (dVar.m1222b() != null) {
            return dVar.m1222b();
        }
        return C8606e.m11945c(resources, dVar.m1221c());
    }

    public static C11216f.C11217a m1227d(Context context, C11209d dVar, CancellationSignal cancellationSignal) {
        ProviderInfo e = m1226e(context.getPackageManager(), dVar, context.getResources());
        if (e == null) {
            return C11216f.C11217a.m1204a(1, null);
        }
        return C11216f.C11217a.m1204a(0, m1225f(context, dVar, e.authority, cancellationSignal));
    }

    public static ProviderInfo m1226e(PackageManager packageManager, C11209d dVar, Resources resources) {
        String e = dVar.m1219e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + e);
        } else if (resolveContentProvider.packageName.equals(dVar.m1218f())) {
            List<byte[]> a = m1230a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a, f35902a);
            List<List<byte[]>> c = m1228c(dVar, resources);
            for (int i = 0; i < c.size(); i++) {
                ArrayList arrayList = new ArrayList(c.get(i));
                Collections.sort(arrayList, f35902a);
                if (m1229b(a, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + e + ", but package was not " + dVar.m1218f());
        }
    }

    public static C11216f.C11218b[] m1225f(Context context, C11209d dVar, String str, CancellationSignal cancellationSignal) {
        int i;
        Uri uri;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            if (Build.VERSION.SDK_INT > 16) {
                cursor = context.getContentResolver().query(build, strArr, "query = ?", new String[]{dVar.m1217g()}, null, cancellationSignal);
            } else {
                cursor = context.getContentResolver().query(build, strArr, "query = ?", new String[]{dVar.m1217g()}, null);
            }
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i2 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i3 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        i = i2;
                        uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        i = i2;
                        uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    arrayList2.add(C11216f.C11218b.m1201a(uri, i3, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                }
                arrayList = arrayList2;
            }
            return (C11216f.C11218b[]) arrayList.toArray(new C11216f.C11218b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
