package org.thunderdog.challegram;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import ib.i;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.drinkmore.Tracer;
import org.xmlpull.v1.XmlPullParserException;
import zd.ya;

public class FileProvider extends ContentProvider {
    public a f19985a;
    public static final String[] f19983b = {"_display_name", "_size"};
    public static final File f19984c = new File("/");
    public static HashMap<String, a> M = new HashMap<>();

    public interface a {
        File a(Uri uri);

        Uri b(File file);
    }

    public static class b<K, V> implements Map.Entry<K, V> {
        public final K f19986a;
        public V f19987b;

        public b(K k10, V v10) {
            this.f19986a = k10;
            this.f19987b = v10;
        }

        @Override
        public K getKey() {
            return this.f19986a;
        }

        @Override
        public V getValue() {
            return this.f19987b;
        }

        @Override
        public V setValue(V v10) {
            this.f19987b = v10;
            return v10;
        }
    }

    public static class c implements a {
        public final String f19988a;
        public final HashMap<String, File> f19989b = new HashMap<>();

        public c(String str) {
            this.f19988a = str;
        }

        public static String d(int i10, boolean z10) {
            String U0 = ya.U0(i10, z10, false);
            if (i.i(U0)) {
                return null;
            }
            try {
                return new File(U0).getCanonicalPath();
            } catch (IOException e10) {
                Log.e(Log.LOG_TAG, "Unable to get canonical TDLib path", e10);
                return null;
            }
        }

        @Override
        public File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f19989b.get(decode);
            if (file == null) {
                file = f(decode);
            }
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                }
            } else {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
        }

        @Override
        public Uri b(File file) {
            String str;
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f19989b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    entry = e(file, canonicalPath);
                }
                if (entry != null) {
                    String path2 = entry.getValue().getPath();
                    if (path2.endsWith("/")) {
                        str = canonicalPath.substring(path2.length());
                    } else {
                        str = canonicalPath.substring(path2.length() + 1);
                    }
                    return new Uri.Builder().scheme("content").authority(this.f19988a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(str, "/")).build();
                }
                throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        public void c(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f19989b.put(str, file.getCanonicalFile());
                } catch (IOException e10) {
                    RuntimeException runtimeException = new RuntimeException("Failed to resolve canonical path " + str + " for " + file + ": " + e10.getMessage());
                    runtimeException.setStackTrace(e10.getStackTrace());
                    Log.e(Log.LOG_TAG, runtimeException.getMessage(), runtimeException);
                    if (!"miui".equals(str)) {
                        Tracer.h(runtimeException);
                        throw runtimeException;
                    }
                }
            } else {
                throw new IllegalArgumentException("Name must not be empty");
            }
        }

        public final java.util.Map.Entry<java.lang.String, java.io.File> e(java.io.File r10, java.lang.String r11) {
            throw new UnsupportedOperationException("Method not decompiled: org.thunderdog.challegram.FileProvider.c.e(java.io.File, java.lang.String):java.util.Map$Entry");
        }

        public final File f(String str) {
            boolean z10;
            int i10;
            if (i.i(str)) {
                return null;
            }
            String str2 = "external_";
            if (str.startsWith(str2)) {
                z10 = false;
            } else if (!str.startsWith("internal_")) {
                return null;
            } else {
                z10 = true;
            }
            if (z10) {
                str2 = "internal_";
            }
            String substring = str.substring(str2.length());
            if (i.i(substring)) {
                return null;
            }
            if (i.l(substring.charAt(0))) {
                int indexOf = substring.indexOf(95);
                if (indexOf == -1) {
                    return null;
                }
                i10 = i.s(substring.substring(0, indexOf));
                substring = substring.substring(indexOf + 1);
            } else {
                i10 = 0;
            }
            if (i.i(substring)) {
                return null;
            }
            if (z10) {
                if (!ya.J0(false).contains(substring) && !ya.J0(true).contains(substring)) {
                    return null;
                }
            } else if (!ya.J0(false).contains(substring)) {
                return null;
            }
            String d10 = d(i10, !z10);
            if (d10 == null) {
                return null;
            }
            return new File(d10, substring);
        }
    }

    public static File a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    public static Object[] b(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[i10];
        System.arraycopy(objArr, 0, objArr2, 0, i10);
        return objArr2;
    }

    public static String[] c(String[] strArr, int i10) {
        String[] strArr2 = new String[i10];
        System.arraycopy(strArr, 0, strArr2, 0, i10);
        return strArr2;
    }

    public static a d(Context context, String str) {
        a aVar;
        synchronized (M) {
            aVar = M.get(str);
            if (aVar == null) {
                try {
                    aVar = g(context, str);
                    M.put(str, aVar);
                } catch (IOException e10) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e10);
                } catch (XmlPullParserException e11) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e11);
                }
            }
        }
        return aVar;
    }

    public static Uri e(Context context, String str, File file) {
        return d(context, str).b(file);
    }

    public static int f(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    public static a g(Context context, String str) {
        c cVar = new c(str);
        XmlResourceParser loadXmlMetaData = context.getPackageManager().resolveContentProvider(str, Log.TAG_YOUTUBE).loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData != null) {
            while (true) {
                int next = loadXmlMetaData.next();
                if (next == 1) {
                    return cVar;
                }
                if (next == 2) {
                    String name = loadXmlMetaData.getName();
                    File file = null;
                    String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                    String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                    if ("root-path".equals(name)) {
                        file = f19984c;
                    } else if ("files-path".equals(name)) {
                        file = context.getFilesDir();
                    } else if ("cache-path".equals(name)) {
                        file = context.getCacheDir();
                    } else if ("external-path".equals(name)) {
                        file = Environment.getExternalStorageDirectory();
                    } else if ("external-files-path".equals(name)) {
                        File[] f10 = q0.a.f(context, null);
                        if (f10.length > 0) {
                            file = f10[0];
                        }
                    } else if ("external-cache-path".equals(name)) {
                        File[] e10 = q0.a.e(context);
                        if (e10.length > 0) {
                            file = e10[0];
                        }
                    } else if ("external-media-path".equals(name)) {
                        File[] externalMediaDirs = context.getExternalMediaDirs();
                        if (externalMediaDirs.length > 0) {
                            file = externalMediaDirs[0];
                        }
                    }
                    if (file != null) {
                        cVar.c(attributeValue, a(file, attributeValue2));
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
    }

    @Override
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            this.f19985a = d(context, providerInfo.authority);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    @Override
    public int delete(Uri uri, String str, String[] strArr) {
        return this.f19985a.a(uri).delete() ? 1 : 0;
    }

    @Override
    public String getType(Uri uri) {
        File a10 = this.f19985a.a(uri);
        int lastIndexOf = a10.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a10.getName().substring(lastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override
    public boolean onCreate() {
        return true;
    }

    @Override
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(this.f19985a.a(uri), f(str));
    }

    @Override
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i10;
        File a10 = this.f19985a.a(uri);
        if (strArr == null) {
            strArr = f19983b;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i11 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i11] = "_display_name";
                i10 = i11 + 1;
                objArr[i11] = a10.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i11] = "_size";
                i10 = i11 + 1;
                objArr[i11] = Long.valueOf(a10.length());
            }
            i11 = i10;
        }
        String[] c10 = c(strArr3, i11);
        Object[] b10 = b(objArr, i11);
        MatrixCursor matrixCursor = new MatrixCursor(c10, 1);
        matrixCursor.addRow(b10);
        return matrixCursor;
    }

    @Override
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
