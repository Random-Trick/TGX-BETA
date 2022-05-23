package w1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class a {
    public static final Map<String, Lock> f25689e = new HashMap();
    public final File f25690a;
    public final Lock f25691b;
    public final boolean f25692c;
    public FileChannel f25693d;

    public a(String str, File file, boolean z10) {
        File file2 = new File(file, str + ".lck");
        this.f25690a = file2;
        this.f25691b = a(file2.getAbsolutePath());
        this.f25692c = z10;
    }

    public static Lock a(String str) {
        Lock lock;
        Map<String, Lock> map = f25689e;
        synchronized (map) {
            lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }

    public void b() {
        this.f25691b.lock();
        if (this.f25692c) {
            try {
                FileChannel channel = new FileOutputStream(this.f25690a).getChannel();
                this.f25693d = channel;
                channel.lock();
            } catch (IOException e10) {
                throw new IllegalStateException("Unable to grab copy lock.", e10);
            }
        }
    }

    public void c() {
        FileChannel fileChannel = this.f25693d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f25691b.unlock();
    }
}
