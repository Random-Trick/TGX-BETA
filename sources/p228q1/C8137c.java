package p228q1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public final class C8137c implements Closeable {
    public final RandomAccessFile f26415M;
    public final FileChannel f26416N;
    public final FileLock f26417O;
    public final File f26418a;
    public final long f26419b;
    public final File f26420c;

    public class C8138a implements FileFilter {
        public C8138a() {
        }

        @Override
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    public static class C8139b extends File {
        public long f26422a = -1;

        public C8139b(File file, String str) {
            super(file, str);
        }
    }

    public C8137c(File file, File file2) {
        Throwable e;
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f26418a = file;
        this.f26420c = file2;
        this.f26419b = m13384B0(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f26415M = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f26416N = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f26417O = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e2) {
                e = e2;
                m13377t(this.f26416N);
                throw e;
            } catch (Error e3) {
                e = e3;
                m13377t(this.f26416N);
                throw e;
            } catch (RuntimeException e4) {
                e = e4;
                m13377t(this.f26416N);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e5) {
            m13377t(this.f26415M);
            throw e5;
        }
    }

    public static long m13385A0(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    public static long m13384B0(File file) {
        long c = C8140d.m13372c(file);
        return c == -1 ? c - 1 : c;
    }

    public static boolean m13383C0(Context context, File file, long j, String str) {
        SharedPreferences z0 = m13375z0(context);
        if (z0.getLong(str + "timestamp", -1L) == m13385A0(file)) {
            if (z0.getLong(str + "crc", -1L) == j) {
                return false;
            }
        }
        return true;
    }

    public static void m13379G0(Context context, String str, long j, long j2, List<C8139b> list) {
        SharedPreferences.Editor edit = m13375z0(context).edit();
        edit.putLong(str + "timestamp", j);
        edit.putLong(str + "crc", j2);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i = 2;
        for (C8139b bVar : list) {
            edit.putLong(str + "dex.crc." + i, bVar.f26422a);
            edit.putLong(str + "dex.time." + i, bVar.lastModified());
            i++;
        }
        edit.commit();
    }

    public static void m13377t(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    public static void m13376y0(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + createTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[org.thunderdog.challegram.Log.TAG_VIDEO];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (!createTempFile.renameTo(file)) {
                    throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
                }
                return;
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } finally {
            m13377t(inputStream);
            createTempFile.delete();
        }
    }

    public static SharedPreferences m13375z0(Context context) {
        return context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    public List<? extends File> m13382D0(Context context, String str, boolean z) {
        List<C8139b> list;
        List<C8139b> list2;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f26418a.getPath() + ", " + z + ", " + str + ")");
        if (this.f26417O.isValid()) {
            if (z || m13383C0(context, this.f26418a, this.f26419b, str)) {
                if (z) {
                    Log.i("MultiDex", "Forced extraction must be performed.");
                } else {
                    Log.i("MultiDex", "Detected that extraction must be performed.");
                }
                list2 = m13380F0();
                m13379G0(context, str, m13385A0(this.f26418a), this.f26419b, list2);
            } else {
                try {
                    list = m13381E0(context, str);
                } catch (IOException e) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                    list2 = m13380F0();
                    m13379G0(context, str, m13385A0(this.f26418a), this.f26419b, list2);
                }
                Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
                return list;
            }
            list = list2;
            Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    public final List<C8139b> m13381E0(Context context, String str) {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f26418a.getName() + ".classes";
        SharedPreferences z0 = m13375z0(context);
        int i = z0.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i + (-1));
        for (int i2 = 2; i2 <= i; i2++) {
            C8139b bVar = new C8139b(this.f26420c, str2 + i2 + ".zip");
            if (bVar.isFile()) {
                bVar.f26422a = m13384B0(bVar);
                long j = z0.getLong(str + "dex.crc." + i2, -1L);
                long j2 = z0.getLong(str + "dex.time." + i2, -1L);
                long lastModified = bVar.lastModified();
                if (j2 == lastModified) {
                    str2 = str2;
                    z0 = z0;
                    if (j == bVar.f26422a) {
                        arrayList.add(bVar);
                    }
                }
                throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + bVar.f26422a);
            }
            throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
        }
        return arrayList;
    }

    public final List<C8139b> m13380F0() {
        boolean z;
        String str = this.f26418a.getName() + ".classes";
        m13378m();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f26418a);
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i = 2;
            while (entry != null) {
                C8139b bVar = new C8139b(this.f26420c, str + i + ".zip");
                arrayList.add(bVar);
                Log.i("MultiDex", "Extraction is needed for file " + bVar);
                int i2 = 0;
                boolean z2 = false;
                while (i2 < 3 && !z2) {
                    i2++;
                    m13376y0(zipFile, entry, bVar, str);
                    try {
                        bVar.f26422a = m13384B0(bVar);
                        z = true;
                    } catch (IOException e) {
                        Log.w("MultiDex", "Failed to read crc from " + bVar.getAbsolutePath(), e);
                        z = false;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Extraction ");
                    sb2.append(z ? "succeeded" : "failed");
                    sb2.append(" '");
                    sb2.append(bVar.getAbsolutePath());
                    sb2.append("': length ");
                    sb2.append(bVar.length());
                    sb2.append(" - crc: ");
                    sb2.append(bVar.f26422a);
                    Log.i("MultiDex", sb2.toString());
                    if (!z) {
                        bVar.delete();
                        if (bVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + bVar.getPath() + "'");
                        }
                    }
                    z2 = z;
                }
                if (z2) {
                    i++;
                    entry = zipFile.getEntry("classes" + i + ".dex");
                } else {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
            }
            try {
                zipFile.close();
            } catch (IOException e2) {
                Log.w("MultiDex", "Failed to close resource", e2);
            }
            return arrayList;
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
            }
            throw th;
        }
    }

    @Override
    public void close() {
        this.f26417O.release();
        this.f26416N.close();
        this.f26415M.close();
    }

    public final void m13378m() {
        File[] listFiles = this.f26420c.listFiles(new C8138a());
        if (listFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f26420c.getPath() + ").");
            return;
        }
        for (File file : listFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (!file.delete()) {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            } else {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            }
        }
    }
}
