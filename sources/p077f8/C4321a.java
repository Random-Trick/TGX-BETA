package p077f8;

import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import p063e8.C4164a;
import p163l5.C6352j;
import p163l5.C6378r;

public class C4321a {
    public static final C6352j f14388c = new C6352j("StreamingFormatChecker", "");
    public final LinkedList<Long> f14389a = new LinkedList<>();
    public long f14390b = -1;

    public void m28285a(@RecentlyNonNull C4164a aVar) {
        if (aVar.m28643e() == -1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f14389a.add(Long.valueOf(elapsedRealtime));
            if (this.f14389a.size() > 5) {
                this.f14389a.removeFirst();
            }
            if (this.f14389a.size() == 5 && elapsedRealtime - ((Long) C6378r.m20507k(this.f14389a.peekFirst())).longValue() < 5000) {
                long j = this.f14390b;
                if (j == -1 || elapsedRealtime - j >= TimeUnit.SECONDS.toMillis(5L)) {
                    this.f14390b = elapsedRealtime;
                    f14388c.m20568f("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
                }
            }
        }
    }
}
