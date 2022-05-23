package ib;

import ab.n;
import ia.q;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import oa.a;
import org.thunderdog.challegram.Log;
import ra.k;

public final class g {
    public static final boolean a(File file, File file2) {
        k.e(file, "src");
        k.e(file2, "dst");
        try {
            FileOutputStream fileInputStream = new FileInputStream(file).getChannel();
            try {
                fileInputStream = new FileOutputStream(file2);
                FileChannel channel = fileInputStream.getChannel();
                fileInputStream.transferTo(0L, fileInputStream.size(), channel);
                fileInputStream.flush();
                th = null;
                a.a(channel, th);
                a.a(fileInputStream, th);
                return true;
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static final boolean b(File file, boolean z10) {
        boolean z11;
        k.e(file, "file");
        if (file.exists()) {
            if (file.isDirectory()) {
                if (!z10) {
                    return true;
                }
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    z11 = false;
                    for (File file2 : listFiles) {
                        k.d(file2, "child");
                        if (!b(file2, true)) {
                            z11 = true;
                        }
                    }
                    if (file.delete() || z11) {
                    }
                }
            }
            z11 = false;
            return file.delete() ? false : false;
        }
        return true;
    }

    public static final boolean c(java.io.File[] r3, boolean r4) {
        throw new UnsupportedOperationException("Method not decompiled: ib.g.c(java.io.File[], boolean):boolean");
    }

    public static final boolean d(File file) {
        k.e(file, "file");
        try {
            if (file.exists()) {
                if (!file.delete()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final boolean e(String str) {
        k.e(str, "path");
        return d(new File(str));
    }

    public static final void f(File file, List<File> list) {
        File[] listFiles;
        if (file.exists()) {
            list.add(file);
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    k.d(file2, "file");
                    f(file2, list);
                }
            }
        }
    }

    public static final File[] g(File file) {
        k.e(file, "dir");
        ArrayList arrayList = new ArrayList();
        f(file, arrayList);
        Object[] array = arrayList.toArray(new File[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (File[]) array;
    }

    public static final long h(File file) {
        k.e(file, "file");
        long j10 = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        boolean z10 = true;
        if (listFiles != null) {
            if (!(listFiles.length == 0)) {
                z10 = false;
            }
        }
        if (z10) {
            return 0L;
        }
        k.d(listFiles, "files");
        for (File file2 : listFiles) {
            k.d(file2, "nested");
            j10 += h(file2);
        }
        return j10;
    }

    public static final long i(java.io.File[] r5) {
        throw new UnsupportedOperationException("Method not decompiled: ib.g.i(java.io.File[]):long");
    }

    public static final void j(File file, File file2) {
        k.e(file, "zipFile");
        k.e(file2, "targetDirectory");
        FileOutputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
        try {
            byte[] bArr = new byte[Log.TAG_LUX];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                th = null;
                if (nextEntry == null) {
                    q qVar = q.f14159a;
                    return;
                }
                File file3 = new File(file2, nextEntry.getName());
                String canonicalPath = file3.getCanonicalPath();
                k.d(canonicalPath, "file.canonicalPath");
                String canonicalPath2 = file2.getCanonicalPath();
                k.d(canonicalPath2, "targetDirectory.canonicalPath");
                if (n.x(canonicalPath, canonicalPath2, false, 2, th)) {
                    File parentFile = nextEntry.isDirectory() ? file3 : file3.getParentFile();
                    if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
                        String absolutePath = parentFile.getAbsolutePath();
                        throw new FileNotFoundException("Failed to ensure directory: " + absolutePath);
                    }
                    if (!nextEntry.isDirectory()) {
                        zipInputStream = new FileOutputStream(file3);
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            zipInputStream.write(bArr, 0, read);
                        }
                        q qVar2 = q.f14159a;
                    }
                } else {
                    throw new SecurityException();
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
