package p190n7;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class C7282b {
    public final FileChannel f23138a;
    public final FileLock f23139b;

    public C7282b(FileChannel fileChannel, FileLock fileLock) {
        this.f23138a = fileChannel;
        this.f23139b = fileLock;
    }

    public static p190n7.C7282b m17163a(android.content.Context r4, java.lang.String r5) {
        throw new UnsupportedOperationException("Method not decompiled: p190n7.C7282b.m17163a(android.content.Context, java.lang.String):n7.b");
    }

    public void m17162b() {
        try {
            this.f23139b.release();
            this.f23138a.close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }
}
