package s3;

import android.os.Handler;
import android.view.Surface;
import c5.j0;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer;
import com.google.android.exoplayer2.ext.vp9.VpxDecoder;
import com.google.android.exoplayer2.ext.vp9.VpxLibrary;
import d5.d;
import d5.z;
import m3.c3;
import m3.q1;
import p3.h;

public class a extends d {
    public final int F0;
    public final int G0;
    public final int H0;
    public VpxDecoder I0;

    public a(long j10, Handler handler, z zVar, int i10) {
        this(j10, handler, zVar, i10, Runtime.getRuntime().availableProcessors(), 4, 4);
    }

    public VpxDecoder W(q1 q1Var, CryptoConfig cryptoConfig) {
        j0.a("createVpxDecoder");
        int i10 = q1Var.V;
        VpxDecoder vpxDecoder = new VpxDecoder(this.F0, this.G0, i10 != -1 ? i10 : 786432, cryptoConfig, this.H0);
        this.I0 = vpxDecoder;
        j0.c();
        return vpxDecoder;
    }

    @Override
    public h T(String str, q1 q1Var, q1 q1Var2) {
        return new h(str, q1Var, q1Var2, 3, 0);
    }

    @Override
    public final int a(q1 q1Var) {
        if (!VpxLibrary.b() || !"video/x-vnd.on2.vp9".equalsIgnoreCase(q1Var.U)) {
            return c3.a(0);
        }
        if (!VpxLibrary.d(q1Var.f16914n0)) {
            return c3.a(2);
        }
        return c3.b(4, 16, 0);
    }

    @Override
    public String b() {
        return "LibvpxVideoRenderer";
    }

    @Override
    public void u0(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) {
        VpxDecoder vpxDecoder = this.I0;
        if (vpxDecoder != null) {
            vpxDecoder.B(videoDecoderOutputBuffer, surface);
            videoDecoderOutputBuffer.release();
            return;
        }
        throw new c("Failed to render output buffer to surface: decoder is not initialized.");
    }

    @Override
    public void w0(int i10) {
        VpxDecoder vpxDecoder = this.I0;
        if (vpxDecoder != null) {
            vpxDecoder.C(i10);
        }
    }

    public a(long j10, Handler handler, z zVar, int i10, int i11, int i12, int i13) {
        super(j10, handler, zVar, i10);
        this.H0 = i11;
        this.F0 = i12;
        this.G0 = i13;
    }
}
