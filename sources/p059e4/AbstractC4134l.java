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

        public static C4135a m28812a(C4139n nVar, MediaFormat mediaFormat, C6600g1 g1Var, MediaCrypto mediaCrypto) {
            return new C4135a(nVar, mediaFormat, g1Var, null, mediaCrypto, 0, false);
        }

        public static C4135a m28811b(C4139n nVar, MediaFormat mediaFormat, C6600g1 g1Var, Surface surface, MediaCrypto mediaCrypto) {
            return new C4135a(nVar, mediaFormat, g1Var, surface, mediaCrypto, 0, false);
        }
    }

    public interface AbstractC4136b {
        AbstractC4134l mo28647a(C4135a aVar);
    }

    public interface AbstractC4137c {
        void mo28810a(AbstractC4134l lVar, long j, long j2);
    }

    void mo28666a();

    boolean mo28665b();

    MediaFormat mo28664c();

    void mo28663d(Bundle bundle);

    void mo28662e(int i, long j);

    int mo28661f();

    void flush();

    int mo28660g(MediaCodec.BufferInfo bufferInfo);

    void mo28659h(int i, boolean z);

    void mo28658i(int i);

    void mo28657j(int i, int i2, C8020c cVar, long j, int i3);

    ByteBuffer mo28656k(int i);

    void mo28655l(Surface surface);

    void mo28654m(int i, int i2, int i3, long j, int i4);

    ByteBuffer mo28653n(int i);

    void mo28652o(AbstractC4137c cVar, Handler handler);
}
