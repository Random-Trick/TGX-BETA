package gd;

import be.C1379j0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p193nb.C7321e;
import p350yd.C10930q6;

@Deprecated
public class C4812v2 {
    public final C10930q6 f16399a;
    public final TdApi.Message f16400b;
    public TdApi.VoiceNote f16401c;
    public TdApi.Audio f16402d;
    public TdApi.VideoNote f16403e;
    public float f16404f;
    public int f16405g;
    public AbstractC4813a f16406h;

    @Deprecated
    public interface AbstractC4813a {
        void mo7394f(C4812v2 v2Var, int i, float f);

        void mo7391i(C4812v2 v2Var, int i, boolean z);
    }

    public C4812v2(C10930q6 q6Var, TdApi.Message message, TdApi.VoiceNote voiceNote) {
        this.f16399a = q6Var;
        this.f16400b = message;
        this.f16401c = voiceNote;
    }

    public boolean m25205a(C4812v2 v2Var) {
        return v2Var != null && m25204b() == v2Var.m25204b() && this.f16399a.m2188w6() == v2Var.f16399a.m2188w6();
    }

    public int m25204b() {
        TdApi.VideoNote videoNote = this.f16403e;
        if (videoNote != null) {
            return C7321e.m16996L0(videoNote.video);
        }
        TdApi.VoiceNote voiceNote = this.f16401c;
        if (voiceNote != null) {
            return C7321e.m16996L0(voiceNote.voice);
        }
        TdApi.Audio audio = this.f16402d;
        if (audio == null) {
            return 0;
        }
        return C7321e.m16996L0(audio.audio);
    }

    public AbstractC4813a m25203c() {
        return this.f16406h;
    }

    public String m25202d() {
        TdApi.VideoNote videoNote = this.f16403e;
        if (videoNote != null) {
            return C4779t2.m25445q1(videoNote.video);
        }
        TdApi.VoiceNote voiceNote = this.f16401c;
        if (voiceNote != null) {
            return C4779t2.m25445q1(voiceNote.voice);
        }
        TdApi.Audio audio = this.f16402d;
        if (audio == null) {
            return null;
        }
        return C4779t2.m25445q1(audio.audio);
    }

    public float m25201e() {
        return this.f16404f;
    }

    public boolean m25200f() {
        return this.f16401c != null;
    }

    public void m25199g(AbstractC4813a aVar) {
        this.f16406h = aVar;
    }

    public void m25198h(boolean z) {
        if (this.f16406h != null) {
            C1379j0.m37322j0(this, z);
        }
    }

    public void m25197i(float f, int i) {
        if (this.f16404f != f || this.f16405g != i) {
            this.f16404f = f;
            this.f16405g = i;
            if (this.f16406h != null) {
                C1379j0.m37320k0(this, f, i);
            }
        }
    }

    public void m25196j(byte[] bArr) {
        TdApi.VoiceNote voiceNote = this.f16401c;
        if (voiceNote != null) {
            voiceNote.waveform = bArr;
        }
    }

    public C10930q6 m25195k() {
        return this.f16399a;
    }

    public C4812v2(C10930q6 q6Var, TdApi.Message message, TdApi.Audio audio) {
        this.f16399a = q6Var;
        this.f16400b = message;
        this.f16402d = audio;
    }

    public C4812v2(C10930q6 q6Var, C4695l6 l6Var) {
        this.f16399a = q6Var;
        this.f16400b = null;
        this.f16401c = new TdApi.VoiceNote(l6Var.m26472c(), null, "audio/ogg", C4779t2.m25677H4(l6Var.m26471d()));
    }
}
