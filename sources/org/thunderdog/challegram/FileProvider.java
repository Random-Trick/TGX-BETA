package org.thunderdog.challegram;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.drinkmore.Tracer;
import org.xmlpull.v1.XmlPullParserException;
import p108hb.C5070i;
import p227q0.C8117a;
import p350yd.C10536ab;

public class FileProvider extends ContentProvider {
    public AbstractC7875a f25449a;
    public static final String[] f25447b = {"_display_name", "_size"};
    public static final File f25448c = new File("/");
    public static HashMap<String, AbstractC7875a> f25446M = new HashMap<>();

    public interface AbstractC7875a {
        File mo14747a(Uri uri);

        Uri mo14746b(File file);
    }

    public static class C7876b<K, V> implements Map.Entry<K, V> {
        public final K f25450a;
        public V f25451b;

        public C7876b(K k, V v) {
            this.f25450a = k;
            this.f25451b = v;
        }

        @Override
        public K getKey() {
            return this.f25450a;
        }

        @Override
        public V getValue() {
            return this.f25451b;
        }

        @Override
        public V setValue(V v) {
            this.f25451b = v;
            return v;
        }
    }

    public static class C7877c implements AbstractC7875a {
        public final String f25452a;
        public final HashMap<String, File> f25453b = new HashMap<>();

        public C7877c(String str) {
            this.f25452a = str;
        }

        public static String m14744d(int i, boolean z) {
            String U0 = C10536ab.m4744U0(i, z, false);
            if (C5070i.m24062i(U0)) {
                return null;
            }
            try {
                return new File(U0).getCanonicalPath();
            } catch (IOException e) {
                Log.e(Log.LOG_TAG, "Unable to get canonical TDLib path", e);
                return null;
            }
        }

        @Override
        public File mo14747a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f25453b.get(decode);
            if (file == null) {
                file = m14742f(decode);
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
        public Uri mo14746b(File file) {
            String str;
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f25453b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    entry = m14743e(file, canonicalPath);
                }
                if (entry != null) {
                    String path2 = entry.getValue().getPath();
                    if (path2.endsWith("/")) {
                        str = canonicalPath.substring(path2.length());
                    } else {
                        str = canonicalPath.substring(path2.length() + 1);
                    }
                    return new Uri.Builder().scheme("content").authority(this.f25452a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(str, "/")).build();
                }
                throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        public void m14745c(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f25453b.put(str, file.getCanonicalFile());
                } catch (IOException e) {
                    RuntimeException runtimeException = new RuntimeException("Failed to resolve canonical path " + str + " for " + file + ": " + e.getMessage());
                    runtimeException.setStackTrace(e.getStackTrace());
                    Log.e(Log.LOG_TAG, runtimeException.getMessage(), runtimeException);
                    if (!"miui".equals(str)) {
                        Tracer.m14772h(runtimeException);
                        throw runtimeException;
                    }
                }
            } else {
                throw new IllegalArgumentException("Name must not be empty");
            }
        }

        public final java.util.Map.Entry<java.lang.String, java.io.File> m14743e(java.io.File r10, java.lang.String r11) {
            throw new UnsupportedOperationException("Method not decompiled: org.thunderdog.challegram.FileProvider.C7877c.m14743e(java.io.File, java.lang.String):java.util.Map$Entry");
        }

        public final File m14742f(String str) {
            boolean z;
            int i;
            if (C5070i.m24062i(str)) {
                return null;
            }
            String str2 = "external_";
            if (str.startsWith(str2)) {
                z = false;
            } else if (!str.startsWith("internal_")) {
                return null;
            } else {
                z = true;
            }
            if (z) {
                str2 = "internal_";
            }
            String substring = str.substring(str2.length());
            if (C5070i.m24062i(substring)) {
                return null;
            }
            if (C5070i.m24059l(substring.charAt(0))) {
                int indexOf = substring.indexOf(95);
                if (indexOf == -1) {
                    return null;
                }
                i = C5070i.m24052s(substring.substring(0, indexOf));
                substring = substring.substring(indexOf + 1);
            } else {
                i = 0;
            }
            if (C5070i.m24062i(substring)) {
                return null;
            }
            if (z) {
                if (!C10536ab.m4788J0(false).contains(substring) && !C10536ab.m4788J0(true).contains(substring)) {
                    return null;
                }
            } else if (!C10536ab.m4788J0(false).contains(substring)) {
                return null;
            }
            String d = m14744d(i, !z);
            if (d == null) {
                return null;
            }
            return new File(d, substring);
        }
    }

    public static File m14754a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    public static Object[] m14753b(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    public static String[] m14752c(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    public static AbstractC7875a m14751d(Context context, String str) {
        AbstractC7875a aVar;
        synchronized (f25446M) {
            aVar = f25446M.get(str);
            if (aVar == null) {
                try {
                    aVar = m14748g(context, str);
                    f25446M.put(str, aVar);
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return aVar;
    }

    public static Uri m14750e(Context context, String str, File file) {
        return m14751d(context, str).mo14746b(file);
    }

    public static int m14749f(String str) {
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

    public static AbstractC7875a m14748g(Context context, String str) {
        C7877c cVar = new C7877c(str);
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
                        file = f25448c;
                    } else if ("files-path".equals(name)) {
                        file = context.getFilesDir();
                    } else if ("cache-path".equals(name)) {
                        file = context.getCacheDir();
                    } else if ("external-path".equals(name)) {
                        file = Environment.getExternalStorageDirectory();
                    } else if ("external-files-path".equals(name)) {
                        File[] h = C8117a.m13435h(context, null);
                        if (h.length > 0) {
                            file = h[0];
                        }
                    } else if ("external-cache-path".equals(name)) {
                        File[] g = C8117a.m13436g(context);
                        if (g.length > 0) {
                            file = g[0];
                        }
                    } else if (Build.VERSION.SDK_INT >= 21 && "external-media-path".equals(name)) {
                        File[] externalMediaDirs = context.getExternalMediaDirs();
                        if (externalMediaDirs.length > 0) {
                            file = externalMediaDirs[0];
                        }
                    }
                    if (file != null) {
                        cVar.m14745c(attributeValue, m14754a(file, attributeValue2));
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
            this.f25449a = m14751d(context, providerInfo.authority);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    @Override
    public int delete(Uri uri, String str, String[] strArr) {
        return this.f25449a.mo14747a(uri).delete() ? 1 : 0;
    }

    @Override
    public String getType(Uri uri) {
        File a = this.f25449a.mo14747a(uri);
        int lastIndexOf = a.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a.getName().substring(lastIndexOf + 1));
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
        return ParcelFileDescriptor.open(this.f25449a.mo14747a(uri), m14749f(str));
    }

    @Override
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File a = this.f25449a.mo14747a(uri);
        if (strArr == null) {
            strArr = f25447b;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = a.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(a.length());
            }
            i2 = i;
        }
        String[] c = m14752c(strArr3, i2);
        Object[] b = m14753b(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(c, 1);
        matrixCursor.addRow(b);
        return matrixCursor;
    }

    @Override
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
