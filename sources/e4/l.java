package e4;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import m3.q1;

public interface l {

    public static final class a {
        public final n f10503a;
        public final MediaFormat f10504b;
        public final q1 f10505c;
        public final Surface f10506d;
        public final MediaCrypto f10507e;
        public final int f10508f;

        public a(n nVar, MediaFormat mediaFormat, q1 q1Var, Surface surface, MediaCrypto mediaCrypto, int i10) {
            this.f10503a = nVar;
            this.f10504b = mediaFormat;
            this.f10505c = q1Var;
            this.f10506d = surface;
            this.f10507e = mediaCrypto;
            this.f10508f = i10;
        }

        public static a a(n nVar, MediaFormat mediaFormat, q1 q1Var, MediaCrypto mediaCrypto) {
            return new a(nVar, mediaFormat, q1Var, null, mediaCrypto, 0);
        }

        public static a b(n nVar, MediaFormat mediaFormat, q1 q1Var, Surface surface, MediaCrypto mediaCrypto) {
            return new a(nVar, mediaFormat, q1Var, surface, mediaCrypto, 0);
        }
    }

    public interface b {
        l a(a aVar);
    }

    public interface c {
        void a(l lVar, long j10, long j11);
    }

    void a();

    boolean b();

    MediaFormat c();

    void d(Bundle bundle);

    void e(int i10, long j10);

    int f();

    void flush();

    int g(MediaCodec.BufferInfo bufferInfo);

    void h(int i10, boolean z10);

    void i(int i10);

    void j(int i10, int i11, p3.c cVar, long j10, int i12);

    ByteBuffer k(int i10);

    void l(Surface surface);

    void m(int i10, int i11, int i12, long j10, int i13);

    ByteBuffer n(int i10);

    void o(c cVar, Handler handler);
}
