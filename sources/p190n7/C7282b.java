package p190n7;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class C7282b {
    public final FileChannel f23135a;
    public final FileLock f23136b;

    public C7282b(FileChannel fileChannel, FileLock fileLock) {
        this.f23135a = fileChannel;
        this.f23136b = fileLock;
    }

    public static p190n7.C7282b m17163a(android.content.Context r4, java.lang.String r5) {
        throw new UnsupportedOperationException("Method not decompiled: p190n7.C7282b.m17163a(android.content.Context, java.lang.String):n7.b");
    }

    public void m17162b() {
        try {
            this.f23136b.release();
            this.f23135a.close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }
}
