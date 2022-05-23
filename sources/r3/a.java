package r3;

import android.os.Handler;
import c5.j0;
import c5.l0;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.ext.opus.OpusDecoder;
import com.google.android.exoplayer2.ext.opus.OpusLibrary;
import m3.q1;
import o3.a0;
import o3.g;
import o3.s;
import o3.t;

public class a extends a0<OpusDecoder> {
    public a() {
        this((Handler) null, (s) null, new g[0]);
    }

    @Override
    public String b() {
        return "LibopusAudioRenderer";
    }

    @Override
    public int k0(q1 q1Var) {
        boolean d10 = OpusLibrary.d(q1Var.f16914n0);
        if (!OpusLibrary.b() || !"audio/opus".equalsIgnoreCase(q1Var.U)) {
            return 0;
        }
        if (!j0(l0.W(2, q1Var.f16908h0, q1Var.f16909i0))) {
            return 1;
        }
        return !d10 ? 2 : 4;
    }

    public OpusDecoder V(q1 q1Var, CryptoConfig cryptoConfig) {
        j0.a("createOpusDecoder");
        boolean z10 = a0(l0.W(4, q1Var.f16908h0, q1Var.f16909i0)) == 2;
        int i10 = q1Var.V;
        OpusDecoder opusDecoder = new OpusDecoder(16, 16, i10 != -1 ? i10 : 5760, q1Var.W, cryptoConfig, z10);
        j0.c();
        return opusDecoder;
    }

    public q1 Z(OpusDecoder opusDecoder) {
        return l0.W(opusDecoder.f5520n ? 4 : 2, opusDecoder.f5521o, 48000);
    }

    public a(Handler handler, s sVar, g... gVarArr) {
        super(handler, sVar, gVarArr);
    }

    public a(Handler handler, s sVar, t tVar) {
        super(handler, sVar, tVar);
    }
}
