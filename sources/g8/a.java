package g8;

import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import m5.j;
import m5.r;

public class a {
    public static final j f12157c = new j("StreamingFormatChecker", "");
    public final LinkedList<Long> f12158a = new LinkedList<>();
    public long f12159b = -1;

    public void a(@RecentlyNonNull f8.a aVar) {
        if (aVar.e() == -1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f12158a.add(Long.valueOf(elapsedRealtime));
            if (this.f12158a.size() > 5) {
                this.f12158a.removeFirst();
            }
            if (this.f12158a.size() == 5 && elapsedRealtime - ((Long) r.k(this.f12158a.peekFirst())).longValue() < 5000) {
                long j10 = this.f12159b;
                if (j10 == -1 || elapsedRealtime - j10 >= TimeUnit.SECONDS.toMillis(5L)) {
                    this.f12159b = elapsedRealtime;
                    f12157c.f("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
                }
            }
        }
    }
}
