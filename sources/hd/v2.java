package hd;

import ce.j0;
import ob.e;
import org.drinkless.td.libcore.telegram.TdApi;
import zd.o6;

@Deprecated
public class v2 {
    public final o6 f13657a;
    public final TdApi.Message f13658b;
    public TdApi.VoiceNote f13659c;
    public TdApi.Audio f13660d;
    public TdApi.VideoNote f13661e;
    public float f13662f;
    public int f13663g;
    public a f13664h;

    @Deprecated
    public interface a {
        void A(v2 v2Var, int i10, boolean z10);

        void C(v2 v2Var, int i10, float f10);
    }

    public v2(o6 o6Var, TdApi.Message message, TdApi.VoiceNote voiceNote) {
        this.f13657a = o6Var;
        this.f13658b = message;
        this.f13659c = voiceNote;
    }

    public boolean a(v2 v2Var) {
        return v2Var != null && b() == v2Var.b() && this.f13657a.A6() == v2Var.f13657a.A6();
    }

    public int b() {
        TdApi.VideoNote videoNote = this.f13661e;
        if (videoNote != null) {
            return e.N0(videoNote.video);
        }
        TdApi.VoiceNote voiceNote = this.f13659c;
        if (voiceNote != null) {
            return e.N0(voiceNote.voice);
        }
        TdApi.Audio audio = this.f13660d;
        if (audio == null) {
            return 0;
        }
        return e.N0(audio.audio);
    }

    public a c() {
        return this.f13664h;
    }

    public String d() {
        TdApi.VideoNote videoNote = this.f13661e;
        if (videoNote != null) {
            return t2.q1(videoNote.video);
        }
        TdApi.VoiceNote voiceNote = this.f13659c;
        if (voiceNote != null) {
            return t2.q1(voiceNote.voice);
        }
        TdApi.Audio audio = this.f13660d;
        if (audio == null) {
            return null;
        }
        return t2.q1(audio.audio);
    }

    public float e() {
        return this.f13662f;
    }

    public boolean f() {
        return this.f13659c != null;
    }

    public void g(a aVar) {
        this.f13664h = aVar;
    }

    public void h(boolean z10) {
        if (this.f13664h != null) {
            j0.j0(this, z10);
        }
    }

    public void i(float f10, int i10) {
        if (this.f13662f != f10 || this.f13663g != i10) {
            this.f13662f = f10;
            this.f13663g = i10;
            if (this.f13664h != null) {
                j0.k0(this, f10, i10);
            }
        }
    }

    public void j(byte[] bArr) {
        TdApi.VoiceNote voiceNote = this.f13659c;
        if (voiceNote != null) {
            voiceNote.waveform = bArr;
        }
    }

    public o6 k() {
        return this.f13657a;
    }

    public v2(o6 o6Var, TdApi.Message message, TdApi.Audio audio) {
        this.f13657a = o6Var;
        this.f13658b = message;
        this.f13660d = audio;
    }

    public v2(o6 o6Var, l6 l6Var) {
        this.f13657a = o6Var;
        this.f13658b = null;
        this.f13659c = new TdApi.VoiceNote(l6Var.c(), null, "audio/ogg", t2.H4(l6Var.d()));
    }
}
