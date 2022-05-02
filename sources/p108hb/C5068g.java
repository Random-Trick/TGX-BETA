package p108hb;

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
import na.C7315a;
import org.thunderdog.challegram.Log;
import p107ha.C5060q;
import qa.C8298k;
import za.C11451n;

public final class C5068g {
    public static final boolean m24103a(File file, File file2) {
        C8298k.m12933e(file, "src");
        C8298k.m12933e(file2, "dst");
        try {
            FileOutputStream fileInputStream = new FileInputStream(file).getChannel();
            try {
                fileInputStream = new FileOutputStream(file2);
                FileChannel channel = fileInputStream.getChannel();
                fileInputStream.transferTo(0L, fileInputStream.size(), channel);
                fileInputStream.flush();
                th = null;
                C7315a.m17061a(channel, th);
                C7315a.m17061a(fileInputStream, th);
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

    public static final boolean m24102b(File file, boolean z) {
        boolean z2;
        C8298k.m12933e(file, "file");
        if (file.exists()) {
            if (file.isDirectory()) {
                if (!z) {
                    return true;
                }
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i = 0;
                    z2 = false;
                    while (i < length) {
                        File file2 = listFiles[i];
                        i++;
                        C8298k.m12934d(file2, "child");
                        if (!m24102b(file2, true)) {
                            z2 = true;
                        }
                    }
                    if (file.delete() || z2) {
                    }
                }
            }
            z2 = false;
            return file.delete() ? false : false;
        }
        return true;
    }

    public static final boolean m24101c(java.io.File[] r3, boolean r4) {
        throw new UnsupportedOperationException("Method not decompiled: p108hb.C5068g.m24101c(java.io.File[], boolean):boolean");
    }

    public static final boolean m24100d(File file) {
        C8298k.m12933e(file, "file");
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

    public static final boolean m24099e(String str) {
        C8298k.m12933e(str, "path");
        return m24100d(new File(str));
    }

    public static final void m24098f(File file, List<File> list) {
        File[] listFiles;
        if (file.exists()) {
            list.add(file);
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                int i = 0;
                int length = listFiles.length;
                while (i < length) {
                    File file2 = listFiles[i];
                    i++;
                    C8298k.m12934d(file2, "file");
                    m24098f(file2, list);
                }
            }
        }
    }

    public static final File[] m24097g(File file) {
        C8298k.m12933e(file, "dir");
        ArrayList arrayList = new ArrayList();
        m24098f(file, arrayList);
        Object[] array = arrayList.toArray(new File[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (File[]) array;
    }

    public static final long m24096h(File file) {
        C8298k.m12933e(file, "file");
        long j = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        int i = 0;
        boolean z = true;
        if (listFiles != null) {
            if (!(listFiles.length == 0)) {
                z = false;
            }
        }
        if (z) {
            return 0L;
        }
        C8298k.m12934d(listFiles, "files");
        int length = listFiles.length;
        while (i < length) {
            File file2 = listFiles[i];
            i++;
            C8298k.m12934d(file2, "nested");
            j += m24096h(file2);
        }
        return j;
    }

    public static final long m24095i(java.io.File[] r5) {
        throw new UnsupportedOperationException("Method not decompiled: p108hb.C5068g.m24095i(java.io.File[]):long");
    }

    public static final void m24094j(File file, File file2) {
        C8298k.m12933e(file, "zipFile");
        C8298k.m12933e(file2, "targetDirectory");
        FileOutputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
        try {
            byte[] bArr = new byte[Log.TAG_LUX];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                th = null;
                if (nextEntry == null) {
                    C5060q qVar = C5060q.f17066a;
                    return;
                }
                File file3 = new File(file2, nextEntry.getName());
                String canonicalPath = file3.getCanonicalPath();
                C8298k.m12934d(canonicalPath, "file.canonicalPath");
                String canonicalPath2 = file2.getCanonicalPath();
                C8298k.m12934d(canonicalPath2, "targetDirectory.canonicalPath");
                if (C11451n.m621x(canonicalPath, canonicalPath2, false, 2, th)) {
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
                        C5060q qVar2 = C5060q.f17066a;
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
