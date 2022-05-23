package ca;

import android.media.MediaFormat;
import ca.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.thunderdog.challegram.Log;
import q9.d;

public class a implements b {
    public static final int f4992f = d.c(Log.TAG_VOICE, 2);
    public final long f4993a;
    public ByteBuffer f4994b;
    public MediaFormat f4995c;
    public long f4996d = 0;
    public boolean f4997e = false;

    public a(long j10) {
        this.f4993a = j10;
    }

    @Override
    public long c(long j10) {
        this.f4996d = j10;
        return j10;
    }

    @Override
    public long d() {
        return this.f4993a;
    }

    @Override
    public void e() {
        int i10 = f4992f;
        this.f4994b = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        MediaFormat mediaFormat = new MediaFormat();
        this.f4995c = mediaFormat;
        mediaFormat.setString("mime", "audio/raw");
        this.f4995c.setInteger("bitrate", d.a(44100, 2));
        this.f4995c.setInteger("channel-count", 2);
        this.f4995c.setInteger("max-input-size", i10);
        this.f4995c.setInteger("sample-rate", 44100);
        this.f4997e = true;
    }

    @Override
    public void f(o9.d dVar) {
    }

    @Override
    public long g() {
        return this.f4996d;
    }

    @Override
    public void h(b.a aVar) {
        int position = aVar.f4998a.position();
        int min = Math.min(aVar.f4998a.remaining(), f4992f);
        this.f4994b.clear();
        this.f4994b.limit(min);
        aVar.f4998a.put(this.f4994b);
        aVar.f4998a.position(position);
        aVar.f4998a.limit(position + min);
        aVar.f4999b = true;
        long j10 = this.f4996d;
        aVar.f5000c = j10;
        aVar.f5001d = true;
        this.f4996d = j10 + d.b(min, 44100, 2);
    }

    @Override
    public boolean i(o9.d dVar) {
        return dVar == o9.d.AUDIO;
    }

    @Override
    public int j() {
        return 0;
    }

    @Override
    public MediaFormat k(o9.d dVar) {
        if (dVar == o9.d.AUDIO) {
            return this.f4995c;
        }
        return null;
    }

    @Override
    public boolean l() {
        return this.f4996d >= d();
    }

    @Override
    public void m() {
        this.f4996d = 0L;
        this.f4997e = false;
    }

    @Override
    public void n(o9.d dVar) {
    }

    @Override
    public double[] o() {
        return null;
    }

    @Override
    public boolean p() {
        return this.f4997e;
    }
}
