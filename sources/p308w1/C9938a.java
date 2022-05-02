package p308w1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class C9938a {
    public static final Map<String, Lock> f32314e = new HashMap();
    public final File f32315a;
    public final Lock f32316b;
    public final boolean f32317c;
    public FileChannel f32318d;

    public C9938a(String str, File file, boolean z) {
        File file2 = new File(file, str + ".lck");
        this.f32315a = file2;
        this.f32316b = m6461a(file2.getAbsolutePath());
        this.f32317c = z;
    }

    public static Lock m6461a(String str) {
        Lock lock;
        Map<String, Lock> map = f32314e;
        synchronized (map) {
            lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }

    public void m6460b() {
        this.f32316b.lock();
        if (this.f32317c) {
            try {
                FileChannel channel = new FileOutputStream(this.f32315a).getChannel();
                this.f32318d = channel;
                channel.lock();
            } catch (IOException e) {
                throw new IllegalStateException("Unable to grab copy lock.", e);
            }
        }
    }

    public void m6459c() {
        FileChannel fileChannel = this.f32318d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f32316b.unlock();
    }
}
