package q4;

import java.nio.ByteBuffer;
import org.thunderdog.challegram.Log;
import p3.i;

public abstract class e extends i<j, k, h> implements g {
    public final String f21407n;

    public class a extends k {
        public a() {
        }

        @Override
        public void release() {
            e.this.t(this);
        }
    }

    public e(String str) {
        super(new j[2], new k[2]);
        this.f21407n = str;
        w(Log.TAG_CAMERA);
    }

    public final h k(Throwable th) {
        return new h("Unexpected decode error", th);
    }

    public abstract f B(byte[] bArr, int i10, boolean z10);

    public final h l(j jVar, k kVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) c5.a.e(jVar.f20488c);
            kVar.e(jVar.N, B(byteBuffer.array(), byteBuffer.limit(), z10), jVar.R);
            kVar.clearFlag(Integer.MIN_VALUE);
            return null;
        } catch (h e10) {
            return e10;
        }
    }

    @Override
    public final String b() {
        return this.f21407n;
    }

    @Override
    public void c(long j10) {
    }

    public final j i() {
        return new j();
    }

    public final k j() {
        return new a();
    }
}
