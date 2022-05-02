package p244r3;

import android.os.Handler;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.ext.opus.OpusDecoder;
import com.google.android.exoplayer2.ext.opus.OpusLibrary;
import p020b5.C1210j0;
import p020b5.C1216l0;
import p174m3.C6600g1;
import p199o3.AbstractC7579a0;
import p199o3.AbstractC7611g;
import p199o3.AbstractC7634s;
import p199o3.AbstractC7636t;

public class C8357a extends AbstractC7579a0<OpusDecoder> {
    public C8357a() {
        this((Handler) null, (AbstractC7634s) null, new AbstractC7611g[0]);
    }

    @Override
    public String mo11838b() {
        return "LibopusAudioRenderer";
    }

    @Override
    public int mo12677i0(C6600g1 g1Var) {
        boolean d = OpusLibrary.m30514d(g1Var.f20597n0);
        if (!OpusLibrary.m30516b() || !"audio/opus".equalsIgnoreCase(g1Var.f20575U)) {
            return 0;
        }
        if (!m15633h0(C1216l0.m37991V(2, g1Var.f20591h0, g1Var.f20592i0))) {
            return 1;
        }
        return !d ? 2 : 4;
    }

    public OpusDecoder mo12679T(C6600g1 g1Var, CryptoConfig cryptoConfig) {
        C1210j0.m38035a("createOpusDecoder");
        boolean z = m15642Y(C1216l0.m37991V(4, g1Var.f20591h0, g1Var.f20592i0)) == 2;
        int i = g1Var.f20576V;
        OpusDecoder opusDecoder = new OpusDecoder(16, 16, i != -1 ? i : 5760, g1Var.f20577W, cryptoConfig, z);
        C1210j0.m38033c();
        return opusDecoder;
    }

    public C6600g1 mo12678X(OpusDecoder opusDecoder) {
        return C1216l0.m37991V(opusDecoder.f11409n ? 4 : 2, opusDecoder.f11410o, 48000);
    }

    public C8357a(Handler handler, AbstractC7634s sVar, AbstractC7611g... gVarArr) {
        super(handler, sVar, gVarArr);
    }

    public C8357a(Handler handler, AbstractC7634s sVar, AbstractC7636t tVar) {
        super(handler, sVar, tVar);
    }
}
