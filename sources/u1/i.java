package u1;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import w1.a;
import w1.d;
import x1.b;
import x1.c;

public class i implements c {
    public final int M;
    public final c N;
    public a O;
    public boolean P;
    public final Context f23523a;
    public final String f23524b;
    public final File f23525c;

    public i(Context context, String str, File file, int i10, c cVar) {
        this.f23523a = context;
        this.f23524b = str;
        this.f23525c = file;
        this.M = i10;
        this.N = cVar;
    }

    @Override
    public synchronized b R() {
        if (!this.P) {
            y0();
            this.P = true;
        }
        return this.N.R();
    }

    @Override
    public synchronized void close() {
        this.N.close();
        this.P = false;
    }

    @Override
    public String getDatabaseName() {
        return this.N.getDatabaseName();
    }

    public final void m(File file) {
        ReadableByteChannel readableByteChannel;
        if (this.f23524b != null) {
            readableByteChannel = Channels.newChannel(this.f23523a.getAssets().open(this.f23524b));
        } else if (this.f23525c != null) {
            readableByteChannel = new FileInputStream(this.f23525c).getChannel();
        } else {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f23523a.getCacheDir());
        createTempFile.deleteOnExit();
        d.a(readableByteChannel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        } else if (!createTempFile.renameTo(file)) {
            throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        }
    }

    public void s(a aVar) {
        this.O = aVar;
    }

    @Override
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.N.setWriteAheadLoggingEnabled(z10);
    }

    public final void y0() {
        String databaseName = getDatabaseName();
        File databasePath = this.f23523a.getDatabasePath(databaseName);
        a aVar = this.O;
        a aVar2 = new a(databaseName, this.f23523a.getFilesDir(), aVar == null || aVar.f23473j);
        try {
            aVar2.b();
            if (!databasePath.exists()) {
                try {
                    m(databasePath);
                    aVar2.c();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            } else if (this.O == null) {
                aVar2.c();
                return;
            } else {
                try {
                    int c10 = w1.c.c(databasePath);
                    int i10 = this.M;
                    if (c10 == i10) {
                        aVar2.c();
                        return;
                    } else if (this.O.a(c10, i10)) {
                        aVar2.c();
                        return;
                    } else {
                        if (this.f23523a.deleteDatabase(databaseName)) {
                            try {
                                m(databasePath);
                            } catch (IOException e11) {
                                Log.w("ROOM", "Unable to copy database file.", e11);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        aVar2.c();
                        return;
                    }
                } catch (IOException e12) {
                    Log.w("ROOM", "Unable to read database version.", e12);
                    aVar2.c();
                    return;
                }
            }
        } catch (Throwable th) {
            aVar2.c();
            throw th;
        }
        aVar2.c();
        throw th;
    }
}
