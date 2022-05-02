package p281u1;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import p308w1.C9938a;
import p308w1.C9940c;
import p308w1.C9941d;
import p323x1.AbstractC10066b;
import p323x1.AbstractC10067c;

public class C9431i implements AbstractC10067c {
    public final int f30542M;
    public final AbstractC10067c f30543N;
    public C9417a f30544O;
    public boolean f30545P;
    public final Context f30546a;
    public final String f30547b;
    public final File f30548c;

    public C9431i(Context context, String str, File file, int i, AbstractC10067c cVar) {
        this.f30546a = context;
        this.f30547b = str;
        this.f30548c = file;
        this.f30542M = i;
        this.f30543N = cVar;
    }

    @Override
    public synchronized AbstractC10066b mo5382Q() {
        if (!this.f30545P) {
            m8678y0();
            this.f30545P = true;
        }
        return this.f30543N.mo5382Q();
    }

    @Override
    public synchronized void close() {
        this.f30543N.close();
        this.f30545P = false;
    }

    @Override
    public String getDatabaseName() {
        return this.f30543N.getDatabaseName();
    }

    public final void m8680m(File file) {
        ReadableByteChannel readableByteChannel;
        if (this.f30547b != null) {
            readableByteChannel = Channels.newChannel(this.f30546a.getAssets().open(this.f30547b));
        } else if (this.f30548c != null) {
            readableByteChannel = new FileInputStream(this.f30548c).getChannel();
        } else {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f30546a.getCacheDir());
        createTempFile.deleteOnExit();
        C9941d.m6452a(readableByteChannel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        } else if (!createTempFile.renameTo(file)) {
            throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        }
    }

    @Override
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f30543N.setWriteAheadLoggingEnabled(z);
    }

    public void m8679t(C9417a aVar) {
        this.f30544O = aVar;
    }

    public final void m8678y0() {
        String databaseName = getDatabaseName();
        File databasePath = this.f30546a.getDatabasePath(databaseName);
        C9417a aVar = this.f30544O;
        C9938a aVar2 = new C9938a(databaseName, this.f30546a.getFilesDir(), aVar == null || aVar.f30485j);
        try {
            aVar2.m6460b();
            if (!databasePath.exists()) {
                try {
                    m8680m(databasePath);
                    aVar2.m6459c();
                    return;
                } catch (IOException e) {
                    throw new RuntimeException("Unable to copy database file.", e);
                }
            } else if (this.f30544O == null) {
                aVar2.m6459c();
                return;
            } else {
                try {
                    int c = C9940c.m6453c(databasePath);
                    int i = this.f30542M;
                    if (c == i) {
                        aVar2.m6459c();
                        return;
                    } else if (this.f30544O.m8742a(c, i)) {
                        aVar2.m6459c();
                        return;
                    } else {
                        if (this.f30546a.deleteDatabase(databaseName)) {
                            try {
                                m8680m(databasePath);
                            } catch (IOException e2) {
                                Log.w("ROOM", "Unable to copy database file.", e2);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        aVar2.m6459c();
                        return;
                    }
                } catch (IOException e3) {
                    Log.w("ROOM", "Unable to read database version.", e3);
                    aVar2.m6459c();
                    return;
                }
            }
        } catch (Throwable th) {
            aVar2.m6459c();
            throw th;
        }
        aVar2.m6459c();
        throw th;
    }
}
