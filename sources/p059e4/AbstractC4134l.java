package p059e4;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import p174m3.C6600g1;
import p216p3.C8020c;

public interface AbstractC4134l {

    public static final class C4135a {
        public final C4139n f13943a;
        public final MediaFormat f13944b;
        public final C6600g1 f13945c;
        public final Surface f13946d;
        public final MediaCrypto f13947e;
        public final int f13948f;
        public final boolean f13949g;

        public C4135a(C4139n nVar, MediaFormat mediaFormat, C6600g1 g1Var, Surface surface, MediaCrypto mediaCrypto, int i, boolean z) {
            this.f13943a = nVar;
            this.f13944b = mediaFormat;
            this.f13945c = g1Var;
            this.f13946d = surface;
            this.f13947e = mediaCrypto;
            this.f13948f = i;
            this.f13949g = z;
        }

        public static C4135a m28814a(C4139n nVar, MediaFormat mediaFormat, C6600g1 g1Var, MediaCrypto mediaCrypto) {
            return new C4135a(nVar, mediaFormat, g1Var, null, mediaCrypto, 0, false);
        }

        public static C4135a m28813b(C4139n nVar, MediaFormat mediaFormat, C6600g1 g1Var, Surface surface, MediaCrypto mediaCrypto) {
            return new C4135a(nVar, mediaFormat, g1Var, surface, mediaCrypto, 0, false);
        }
    }

    public interface AbstractC4136b {
        AbstractC4134l mo28649a(C4135a aVar);
    }

    public interface AbstractC4137c {
        void mo28812a(AbstractC4134l lVar, long j, long j2);
    }

    void mo28668a();

    boolean mo28667b();

    MediaFormat mo28666c();

    void mo28665d(Bundle bundle);

    void mo28664e(int i, long j);

    int mo28663f();

    void flush();

    int mo28662g(MediaCodec.BufferInfo bufferInfo);

    void mo28661h(int i, boolean z);

    void mo28660i(int i);

    void mo28659j(int i, int i2, C8020c cVar, long j, int i3);

    ByteBuffer mo28658k(int i);

    void mo28657l(Surface surface);

    void mo28656m(int i, int i2, int i3, long j, int i4);

    ByteBuffer mo28655n(int i);

    void mo28654o(AbstractC4137c cVar, Handler handler);
}
