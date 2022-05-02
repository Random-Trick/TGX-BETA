package p309w2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.thunderdog.challegram.Log;
import p309w2.C9951c;

public class C9948a implements C9951c.AbstractC9952a {

    public static class C9949a {
        public ZipFile f32343a;
        public ZipEntry f32344b;

        public C9949a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f32343a = zipFile;
            this.f32344b = zipEntry;
        }
    }

    @Override
    @SuppressLint({"SetWorldReadable"})
    public void mo6434a(Context context, String[] strArr, String str, File file, C9956d dVar) {
        Throwable th;
        C9949a d;
        String[] strArr2;
        InputStream inputStream;
        Closeable closeable;
        Throwable th2;
        long c;
        C9949a aVar = null;
        Closeable closeable2 = null;
        try {
            d = m6438d(context, strArr, str, dVar);
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            if (d != null) {
                int i = 0;
                while (true) {
                    i++;
                    if (i < 5) {
                        dVar.m6420k("Found %s! Extracting...", str);
                        try {
                            if (file.exists() || file.createNewFile()) {
                                try {
                                    inputStream = d.f32343a.getInputStream(d.f32344b);
                                    try {
                                        closeable = new FileOutputStream(file);
                                        try {
                                            c = m6439c(inputStream, closeable);
                                            closeable.getFD().sync();
                                        } catch (FileNotFoundException unused) {
                                            m6440b(inputStream);
                                            m6440b(closeable);
                                        } catch (IOException unused2) {
                                            m6440b(inputStream);
                                            m6440b(closeable);
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                            closeable2 = inputStream;
                                            m6440b(closeable2);
                                            m6440b(closeable);
                                            throw th2;
                                        }
                                    } catch (FileNotFoundException unused3) {
                                        closeable = null;
                                    } catch (IOException unused4) {
                                        closeable = null;
                                    } catch (Throwable th5) {
                                        th2 = th5;
                                        closeable = null;
                                    }
                                } catch (FileNotFoundException unused5) {
                                    inputStream = null;
                                    closeable = null;
                                } catch (IOException unused6) {
                                    inputStream = null;
                                    closeable = null;
                                } catch (Throwable th6) {
                                    th2 = th6;
                                    closeable = null;
                                }
                                if (c != file.length()) {
                                    m6440b(inputStream);
                                    m6440b(closeable);
                                } else {
                                    m6440b(inputStream);
                                    m6440b(closeable);
                                    file.setReadable(true, false);
                                    file.setExecutable(true, false);
                                    file.setWritable(true);
                                    try {
                                        ZipFile zipFile = d.f32343a;
                                        if (zipFile != null) {
                                            zipFile.close();
                                            return;
                                        }
                                        return;
                                    } catch (IOException unused7) {
                                        return;
                                    }
                                }
                            }
                        } catch (IOException unused8) {
                        }
                    } else {
                        dVar.m6421j("FATAL! Couldn't extract the library from the APK!");
                        try {
                            ZipFile zipFile2 = d.f32343a;
                            if (zipFile2 != null) {
                                zipFile2.close();
                                return;
                            }
                            return;
                        } catch (IOException unused9) {
                            return;
                        }
                    }
                }
            } else {
                try {
                    strArr2 = m6437e(context, str);
                } catch (Exception e) {
                    strArr2 = new String[]{e.toString()};
                }
                throw new C9950b(str, strArr, strArr2);
            }
        } catch (Throwable th7) {
            th = th7;
            aVar = d;
            if (aVar != null) {
                try {
                    ZipFile zipFile3 = aVar.f32343a;
                    if (zipFile3 != null) {
                        zipFile3.close();
                    }
                } catch (IOException unused10) {
                }
            }
            throw th;
        }
    }

    public final void m6440b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final long m6439c(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[Log.TAG_EMOJI];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    public final C9949a m6438d(Context context, String[] strArr, String str, C9956d dVar) {
        String[] f = m6436f(context);
        int length = f.length;
        char c = 0;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str2 = f[i];
            int i2 = 0;
            while (true) {
                i2++;
                if (i2 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                }
            }
            if (zipFile != null) {
                int i3 = 0;
                while (true) {
                    i3++;
                    if (i3 < 5) {
                        int length2 = strArr.length;
                        int i4 = 0;
                        while (i4 < length2) {
                            String str3 = "lib" + File.separatorChar + strArr[i4] + File.separatorChar + str;
                            Object[] objArr = new Object[2];
                            objArr[c] = str3;
                            objArr[1] = str2;
                            dVar.m6420k("Looking for %s in APK %s...", objArr);
                            ZipEntry entry = zipFile.getEntry(str3);
                            if (entry != null) {
                                return new C9949a(zipFile, entry);
                            }
                            i4++;
                            c = 0;
                        }
                        c = 0;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i++;
            c = 0;
        }
    }

    public final String[] m6437e(Context context, String str) {
        Pattern compile = Pattern.compile("lib" + File.separatorChar + "([^\\" + File.separatorChar + "]*)" + File.separatorChar + str);
        HashSet hashSet = new HashSet();
        for (String str2 : m6436f(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public final String[] m6436f(Context context) {
        String[] strArr;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (Build.VERSION.SDK_INT < 21 || (strArr = applicationInfo.splitSourceDirs) == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }
}
