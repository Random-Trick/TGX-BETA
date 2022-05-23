package q1;

import android.content.Context;
import android.content.SharedPreferences;
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

public final class c implements Closeable {
    public final RandomAccessFile M;
    public final FileChannel N;
    public final FileLock O;
    public final File f21202a;
    public final long f21203b;
    public final File f21204c;

    public class a implements FileFilter {
        public a() {
        }

        @Override
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    public static class b extends File {
        public long f21206a = -1;

        public b(File file, String str) {
            super(file, str);
        }
    }

    public c(File file, File file2) {
        Throwable e10;
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f21202a = file;
        this.f21204c = file2;
        this.f21203b = B0(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.M = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.N = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.O = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e11) {
                e10 = e11;
                s(this.N);
                throw e10;
            } catch (Error e12) {
                e10 = e12;
                s(this.N);
                throw e10;
            } catch (RuntimeException e13) {
                e10 = e13;
                s(this.N);
                throw e10;
            }
        } catch (IOException | Error | RuntimeException e14) {
            s(this.M);
            throw e14;
        }
    }

    public static long A0(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    public static long B0(File file) {
        long c10 = d.c(file);
        return c10 == -1 ? c10 - 1 : c10;
    }

    public static boolean C0(Context context, File file, long j10, String str) {
        SharedPreferences z02 = z0(context);
        if (z02.getLong(str + "timestamp", -1L) == A0(file)) {
            if (z02.getLong(str + "crc", -1L) == j10) {
                return false;
            }
        }
        return true;
    }

    public static void G0(Context context, String str, long j10, long j11, List<b> list) {
        SharedPreferences.Editor edit = z0(context).edit();
        edit.putLong(str + "timestamp", j10);
        edit.putLong(str + "crc", j11);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i10 = 2;
        for (b bVar : list) {
            edit.putLong(str + "dex.crc." + i10, bVar.f21206a);
            edit.putLong(str + "dex.time." + i10, bVar.lastModified());
            i10++;
        }
        edit.commit();
    }

    public static void s(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e10) {
            Log.w("MultiDex", "Failed to close resource", e10);
        }
    }

    public static void y0(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
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
            s(inputStream);
            createTempFile.delete();
        }
    }

    public static SharedPreferences z0(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    public List<? extends File> D0(Context context, String str, boolean z10) {
        List<b> list;
        List<b> list2;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f21202a.getPath() + ", " + z10 + ", " + str + ")");
        if (this.O.isValid()) {
            if (z10 || C0(context, this.f21202a, this.f21203b, str)) {
                if (z10) {
                    Log.i("MultiDex", "Forced extraction must be performed.");
                } else {
                    Log.i("MultiDex", "Detected that extraction must be performed.");
                }
                list2 = F0();
                G0(context, str, A0(this.f21202a), this.f21203b, list2);
            } else {
                try {
                    list = E0(context, str);
                } catch (IOException e10) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e10);
                    list2 = F0();
                    G0(context, str, A0(this.f21202a), this.f21203b, list2);
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

    public final List<b> E0(Context context, String str) {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f21202a.getName() + ".classes";
        SharedPreferences z02 = z0(context);
        int i10 = z02.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i10 + (-1));
        for (int i11 = 2; i11 <= i10; i11++) {
            b bVar = new b(this.f21204c, str2 + i11 + ".zip");
            if (bVar.isFile()) {
                bVar.f21206a = B0(bVar);
                long j10 = z02.getLong(str + "dex.crc." + i11, -1L);
                long j11 = z02.getLong(str + "dex.time." + i11, -1L);
                long lastModified = bVar.lastModified();
                if (j11 == lastModified) {
                    str2 = str2;
                    z02 = z02;
                    if (j10 == bVar.f21206a) {
                        arrayList.add(bVar);
                    }
                }
                throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str + "\"), expected modification time: " + j11 + ", modification time: " + lastModified + ", expected crc: " + j10 + ", file crc: " + bVar.f21206a);
            }
            throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
        }
        return arrayList;
    }

    public final List<b> F0() {
        boolean z10;
        String str = this.f21202a.getName() + ".classes";
        m();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f21202a);
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i10 = 2;
            while (entry != null) {
                b bVar = new b(this.f21204c, str + i10 + ".zip");
                arrayList.add(bVar);
                Log.i("MultiDex", "Extraction is needed for file " + bVar);
                int i11 = 0;
                boolean z11 = false;
                while (i11 < 3 && !z11) {
                    i11++;
                    y0(zipFile, entry, bVar, str);
                    try {
                        bVar.f21206a = B0(bVar);
                        z10 = true;
                    } catch (IOException e10) {
                        Log.w("MultiDex", "Failed to read crc from " + bVar.getAbsolutePath(), e10);
                        z10 = false;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Extraction ");
                    sb2.append(z10 ? "succeeded" : "failed");
                    sb2.append(" '");
                    sb2.append(bVar.getAbsolutePath());
                    sb2.append("': length ");
                    sb2.append(bVar.length());
                    sb2.append(" - crc: ");
                    sb2.append(bVar.f21206a);
                    Log.i("MultiDex", sb2.toString());
                    if (!z10) {
                        bVar.delete();
                        if (bVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + bVar.getPath() + "'");
                        }
                    }
                    z11 = z10;
                }
                if (z11) {
                    i10++;
                    entry = zipFile.getEntry("classes" + i10 + ".dex");
                } else {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i10 + ")");
                }
            }
            try {
                zipFile.close();
            } catch (IOException e11) {
                Log.w("MultiDex", "Failed to close resource", e11);
            }
            return arrayList;
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (IOException e12) {
                Log.w("MultiDex", "Failed to close resource", e12);
            }
            throw th;
        }
    }

    @Override
    public void close() {
        this.O.release();
        this.N.close();
        this.M.close();
    }

    public final void m() {
        File[] listFiles = this.f21204c.listFiles(new a());
        if (listFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f21204c.getPath() + ").");
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
