package w2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
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
import w2.c;

public class a implements c.a {

    public static class C0235a {
        public ZipFile f25717a;
        public ZipEntry f25718b;

        public C0235a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f25717a = zipFile;
            this.f25718b = zipEntry;
        }
    }

    @Override
    @SuppressLint({"SetWorldReadable"})
    public void a(Context context, String[] strArr, String str, File file, d dVar) {
        Throwable th;
        C0235a d10;
        String[] strArr2;
        InputStream inputStream;
        Closeable closeable;
        Throwable th2;
        long c10;
        C0235a aVar = null;
        Closeable closeable2 = null;
        try {
            d10 = d(context, strArr, str, dVar);
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            if (d10 != null) {
                int i10 = 0;
                while (true) {
                    i10++;
                    if (i10 < 5) {
                        dVar.k("Found %s! Extracting...", str);
                        try {
                            if (file.exists() || file.createNewFile()) {
                                try {
                                    inputStream = d10.f25717a.getInputStream(d10.f25718b);
                                    try {
                                        closeable = new FileOutputStream(file);
                                        try {
                                            c10 = c(inputStream, closeable);
                                            closeable.getFD().sync();
                                        } catch (FileNotFoundException unused) {
                                            b(inputStream);
                                            b(closeable);
                                        } catch (IOException unused2) {
                                            b(inputStream);
                                            b(closeable);
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                            closeable2 = inputStream;
                                            b(closeable2);
                                            b(closeable);
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
                                if (c10 != file.length()) {
                                    b(inputStream);
                                    b(closeable);
                                } else {
                                    b(inputStream);
                                    b(closeable);
                                    file.setReadable(true, false);
                                    file.setExecutable(true, false);
                                    file.setWritable(true);
                                    try {
                                        ZipFile zipFile = d10.f25717a;
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
                        dVar.j("FATAL! Couldn't extract the library from the APK!");
                        try {
                            ZipFile zipFile2 = d10.f25717a;
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
                    strArr2 = e(context, str);
                } catch (Exception e10) {
                    strArr2 = new String[]{e10.toString()};
                }
                throw new b(str, strArr, strArr2);
            }
        } catch (Throwable th7) {
            th = th7;
            aVar = d10;
            if (aVar != null) {
                try {
                    ZipFile zipFile3 = aVar.f25717a;
                    if (zipFile3 != null) {
                        zipFile3.close();
                    }
                } catch (IOException unused10) {
                }
            }
            throw th;
        }
    }

    public final void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final long c(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[Log.TAG_EMOJI];
        long j10 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return j10;
            }
            outputStream.write(bArr, 0, read);
            j10 += read;
        }
    }

    public final C0235a d(Context context, String[] strArr, String str, d dVar) {
        String[] f10 = f(context);
        int length = f10.length;
        char c10 = 0;
        int i10 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i10 >= length) {
                return null;
            }
            String str2 = f10[i10];
            int i11 = 0;
            while (true) {
                i11++;
                if (i11 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                }
            }
            if (zipFile != null) {
                int i12 = 0;
                while (true) {
                    i12++;
                    if (i12 < 5) {
                        int length2 = strArr.length;
                        int i13 = 0;
                        while (i13 < length2) {
                            String str3 = "lib" + File.separatorChar + strArr[i13] + File.separatorChar + str;
                            Object[] objArr = new Object[2];
                            objArr[c10] = str3;
                            objArr[1] = str2;
                            dVar.k("Looking for %s in APK %s...", objArr);
                            ZipEntry entry = zipFile.getEntry(str3);
                            if (entry != null) {
                                return new C0235a(zipFile, entry);
                            }
                            i13++;
                            c10 = 0;
                        }
                        c10 = 0;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i10++;
            c10 = 0;
        }
    }

    public final String[] e(Context context, String str) {
        Pattern compile = Pattern.compile("lib" + File.separatorChar + "([^\\" + File.separatorChar + "]*)" + File.separatorChar + str);
        HashSet hashSet = new HashSet();
        for (String str2 : f(context)) {
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

    public final String[] f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }
}
