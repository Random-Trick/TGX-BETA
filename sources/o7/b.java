package o7;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class b {
    public final FileChannel f19273a;
    public final FileLock f19274b;

    public b(FileChannel fileChannel, FileLock fileLock) {
        this.f19273a = fileChannel;
        this.f19274b = fileLock;
    }

    public static o7.b a(android.content.Context r4, java.lang.String r5) {
        throw new UnsupportedOperationException("Method not decompiled: o7.b.a(android.content.Context, java.lang.String):o7.b");
    }

    public void b() {
        try {
            this.f19274b.release();
            this.f19273a.close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }
}
