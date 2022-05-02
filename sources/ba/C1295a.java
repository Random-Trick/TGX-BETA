package ba;

import android.media.MediaFormat;
import ba.AbstractC1296b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.thunderdog.challegram.Log;
import p192n9.EnumC7313d;
import p222p9.C8075d;

public class C1295a implements AbstractC1296b {
    public static final int f4669f = C8075d.m13610c(Log.TAG_VOICE, 2);
    public final long f4670a;
    public ByteBuffer f4671b;
    public MediaFormat f4672c;
    public long f4673d = 0;
    public boolean f4674e = false;

    public C1295a(long j) {
        this.f4670a = j;
    }

    @Override
    public long mo6292c(long j) {
        this.f4673d = j;
        return j;
    }

    @Override
    public long mo6291d() {
        return this.f4670a;
    }

    @Override
    public void mo6290e() {
        int i = f4669f;
        this.f4671b = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        MediaFormat mediaFormat = new MediaFormat();
        this.f4672c = mediaFormat;
        mediaFormat.setString("mime", "audio/raw");
        this.f4672c.setInteger("bitrate", C8075d.m13612a(44100, 2));
        this.f4672c.setInteger("channel-count", 2);
        this.f4672c.setInteger("max-input-size", i);
        this.f4672c.setInteger("sample-rate", 44100);
        this.f4674e = true;
    }

    @Override
    public void mo6289f(AbstractC1296b.C1297a aVar) {
        int position = aVar.f4675a.position();
        int min = Math.min(aVar.f4675a.remaining(), f4669f);
        this.f4671b.clear();
        this.f4671b.limit(min);
        aVar.f4675a.put(this.f4671b);
        aVar.f4675a.position(position);
        aVar.f4675a.limit(position + min);
        aVar.f4676b = true;
        long j = this.f4673d;
        aVar.f4677c = j;
        aVar.f4678d = true;
        this.f4673d = j + C8075d.m13611b(min, 44100, 2);
    }

    @Override
    public long mo6288g() {
        return this.f4673d;
    }

    @Override
    public void mo6287h(EnumC7313d dVar) {
    }

    @Override
    public int mo6286i() {
        return 0;
    }

    @Override
    public boolean mo6285j() {
        return this.f4673d >= mo6291d();
    }

    @Override
    public boolean mo6284k(EnumC7313d dVar) {
        return dVar == EnumC7313d.AUDIO;
    }

    @Override
    public void mo6283l(EnumC7313d dVar) {
    }

    @Override
    public void mo6282m() {
        this.f4673d = 0L;
        this.f4674e = false;
    }

    @Override
    public MediaFormat mo6281n(EnumC7313d dVar) {
        if (dVar == EnumC7313d.AUDIO) {
            return this.f4672c;
        }
        return null;
    }

    @Override
    public double[] mo6280o() {
        return null;
    }

    @Override
    public boolean mo6279p() {
        return this.f4674e;
    }
}
