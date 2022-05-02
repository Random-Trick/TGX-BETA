package p174m3;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import p020b5.C1186a;
import p020b5.C1216l0;
import p020b5.C1230s;
import p174m3.C6581d;
import p199o3.C7602e;

public final class C6581d {
    public final AudioManager f20503a;
    public final C6582a f20504b;
    public AbstractC6583b f20505c;
    public C7602e f20506d;
    public int f20508f;
    public AudioFocusRequest f20510h;
    public boolean f20511i;
    public float f20509g = 1.0f;
    public int f20507e = 0;

    public class C6582a implements AudioManager.OnAudioFocusChangeListener {
        public final Handler f20512a;

        public C6582a(Handler handler) {
            this.f20512a = handler;
        }

        public void m19947b(int i) {
            C6581d.this.m19958h(i);
        }

        @Override
        public void onAudioFocusChange(final int i) {
            this.f20512a.post(new Runnable() {
                @Override
                public final void run() {
                    C6581d.C6582a.this.m19947b(i);
                }
            });
        }
    }

    public interface AbstractC6583b {
        void mo19335D(int i);

        void mo19325y(float f);
    }

    public C6581d(Context context, Handler handler, AbstractC6583b bVar) {
        this.f20503a = (AudioManager) C1186a.m38188e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f20505c = bVar;
        this.f20504b = new C6582a(handler);
    }

    public static int m19961e(C7602e eVar) {
        if (eVar == null) {
            return 0;
        }
        int i = eVar.f24335c;
        switch (i) {
            case 0:
                C1230s.m37884i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (eVar.f24333a == 1) {
                    return 2;
                }
                break;
            case 15:
            default:
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Unidentified audio usage: ");
                sb2.append(i);
                C1230s.m37884i("AudioFocusManager", sb2.toString());
                return 0;
            case 16:
                return C1216l0.f4526a >= 19 ? 4 : 2;
        }
        return 3;
    }

    public final void m19965a() {
        this.f20503a.abandonAudioFocus(this.f20504b);
    }

    public final void m19964b() {
        if (this.f20507e != 0) {
            if (C1216l0.f4526a >= 26) {
                m19963c();
            } else {
                m19965a();
            }
            m19952n(0);
        }
    }

    public final void m19963c() {
        AudioFocusRequest audioFocusRequest = this.f20510h;
        if (audioFocusRequest != null) {
            this.f20503a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    public final void m19960f(int i) {
        AbstractC6583b bVar = this.f20505c;
        if (bVar != null) {
            bVar.mo19335D(i);
        }
    }

    public float m19959g() {
        return this.f20509g;
    }

    public final void m19958h(int i) {
        if (i == -3 || i == -2) {
            if (i == -2 || m19949q()) {
                m19960f(0);
                m19952n(2);
                return;
            }
            m19952n(3);
        } else if (i == -1) {
            m19960f(-1);
            m19964b();
        } else if (i != 1) {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Unknown focus change type: ");
            sb2.append(i);
            C1230s.m37884i("AudioFocusManager", sb2.toString());
        } else {
            m19952n(1);
            m19960f(1);
        }
    }

    public void m19957i() {
        this.f20505c = null;
        m19964b();
    }

    public final int m19956j() {
        if (this.f20507e == 1) {
            return 1;
        }
        if ((C1216l0.f4526a >= 26 ? m19954l() : m19955k()) == 1) {
            m19952n(1);
            return 1;
        }
        m19952n(0);
        return -1;
    }

    public final int m19955k() {
        return this.f20503a.requestAudioFocus(this.f20504b, C1216l0.m37991Y(((C7602e) C1186a.m38188e(this.f20506d)).f24335c), this.f20508f);
    }

    public final int m19954l() {
        AudioFocusRequest.Builder builder;
        AudioFocusRequest audioFocusRequest = this.f20510h;
        if (audioFocusRequest == null || this.f20511i) {
            if (audioFocusRequest == null) {
                builder = new AudioFocusRequest.Builder(this.f20508f);
            } else {
                builder = new AudioFocusRequest.Builder(this.f20510h);
            }
            this.f20510h = builder.setAudioAttributes(((C7602e) C1186a.m38188e(this.f20506d)).m15535b()).setWillPauseWhenDucked(m19949q()).setOnAudioFocusChangeListener(this.f20504b).build();
            this.f20511i = false;
        }
        return this.f20503a.requestAudioFocus(this.f20510h);
    }

    public void m19953m(C7602e eVar) {
        if (!C1216l0.m37985c(this.f20506d, eVar)) {
            this.f20506d = eVar;
            int e = m19961e(eVar);
            this.f20508f = e;
            boolean z = true;
            if (!(e == 1 || e == 0)) {
                z = false;
            }
            C1186a.m38191b(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }

    public final void m19952n(int i) {
        if (this.f20507e != i) {
            this.f20507e = i;
            float f = i == 3 ? 0.2f : 1.0f;
            if (this.f20509g != f) {
                this.f20509g = f;
                AbstractC6583b bVar = this.f20505c;
                if (bVar != null) {
                    bVar.mo19325y(f);
                }
            }
        }
    }

    public final boolean m19951o(int i) {
        return i == 1 || this.f20508f != 1;
    }

    public int m19950p(boolean z, int i) {
        if (m19951o(i)) {
            m19964b();
            return z ? 1 : -1;
        } else if (z) {
            return m19956j();
        } else {
            return -1;
        }
    }

    public final boolean m19949q() {
        C7602e eVar = this.f20506d;
        return eVar != null && eVar.f24333a == 1;
    }
}
