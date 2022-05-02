package p259s3;

import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer;
import com.google.android.exoplayer2.ext.vp9.VpxDecoder;
import com.google.android.exoplayer2.ext.vp9.VpxLibrary;
import p020b5.C1210j0;
import p032c5.AbstractC1609d;
import p032c5.AbstractC1642z;
import p174m3.C6600g1;
import p174m3.C6701t2;
import p216p3.C8028h;

public class C8638a extends AbstractC1609d {
    public final int f27956E0;
    public final int f27957F0;
    public final int f27958G0;
    public VpxDecoder f27959H0;

    public C8638a(long j, Handler handler, AbstractC1642z zVar, int i) {
        this(j, handler, zVar, i, Runtime.getRuntime().availableProcessors(), 4, 4);
    }

    public VpxDecoder mo11839U(C6600g1 g1Var, CryptoConfig cryptoConfig) {
        C1210j0.m38038a("createVpxDecoder");
        int i = g1Var.f20576V;
        VpxDecoder vpxDecoder = new VpxDecoder(this.f27956E0, this.f27957F0, i != -1 ? i : 786432, cryptoConfig, this.f27958G0);
        this.f27959H0 = vpxDecoder;
        C1210j0.m38036c();
        return vpxDecoder;
    }

    @Override
    public C8028h mo11840R(String str, C6600g1 g1Var, C6600g1 g1Var2) {
        return new C8028h(str, g1Var, g1Var2, 3, 0);
    }

    @Override
    public final int mo11838a(C6600g1 g1Var) {
        if (!VpxLibrary.m30508b() || !"video/x-vnd.on2.vp9".equalsIgnoreCase(g1Var.f20575U)) {
            return C6701t2.m19438a(0);
        }
        if (!VpxLibrary.m30506d(g1Var.f20597n0)) {
            return C6701t2.m19438a(2);
        }
        return C6701t2.m19437b(4, 16, 0);
    }

    @Override
    public String mo11837b() {
        return "LibvpxVideoRenderer";
    }

    @Override
    public void mo11836s0(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) {
        VpxDecoder vpxDecoder = this.f27959H0;
        if (vpxDecoder != null) {
            vpxDecoder.m30514B(videoDecoderOutputBuffer, surface);
            videoDecoderOutputBuffer.release();
            return;
        }
        throw new C8640c("Failed to render output buffer to surface: decoder is not initialized.");
    }

    @Override
    public void mo11835u0(int i) {
        VpxDecoder vpxDecoder = this.f27959H0;
        if (vpxDecoder != null) {
            vpxDecoder.m30513C(i);
        }
    }

    public C8638a(long j, Handler handler, AbstractC1642z zVar, int i, int i2, int i3, int i4) {
        super(j, handler, zVar, i);
        this.f27958G0 = i2;
        this.f27956E0 = i3;
        this.f27957F0 = i4;
    }
}
