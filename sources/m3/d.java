package m3;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import c5.l0;
import c5.s;
import m3.d;
import o3.e;

public final class d {
    public final AudioManager f16600a;
    public final a f16601b;
    public b f16602c;
    public e f16603d;
    public int f16605f;
    public AudioFocusRequest f16607h;
    public boolean f16608i;
    public float f16606g = 1.0f;
    public int f16604e = 0;

    public class a implements AudioManager.OnAudioFocusChangeListener {
        public final Handler f16609a;

        public a(Handler handler) {
            this.f16609a = handler;
        }

        public void b(int i10) {
            d.this.h(i10);
        }

        @Override
        public void onAudioFocusChange(final int i10) {
            this.f16609a.post(new Runnable() {
                @Override
                public final void run() {
                    d.a.this.b(i10);
                }
            });
        }
    }

    public interface b {
        void A(float f10);

        void B(int i10);
    }

    public d(Context context, Handler handler, b bVar) {
        this.f16600a = (AudioManager) c5.a.e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f16602c = bVar;
        this.f16601b = new a(handler);
    }

    public static int e(e eVar) {
        if (eVar == null) {
            return 0;
        }
        int i10 = eVar.f18766c;
        switch (i10) {
            case 0:
                s.i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
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
                if (eVar.f18764a == 1) {
                    return 2;
                }
                break;
            case 15:
            default:
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Unidentified audio usage: ");
                sb2.append(i10);
                s.i("AudioFocusManager", sb2.toString());
                return 0;
            case 16:
                return l0.f4841a >= 19 ? 4 : 2;
        }
        return 3;
    }

    public final void a() {
        this.f16600a.abandonAudioFocus(this.f16601b);
    }

    public final void b() {
        if (this.f16604e != 0) {
            if (l0.f4841a >= 26) {
                c();
            } else {
                a();
            }
            n(0);
        }
    }

    public final void c() {
        AudioFocusRequest audioFocusRequest = this.f16607h;
        if (audioFocusRequest != null) {
            this.f16600a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    public final void f(int i10) {
        b bVar = this.f16602c;
        if (bVar != null) {
            bVar.B(i10);
        }
    }

    public float g() {
        return this.f16606g;
    }

    public final void h(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 == -2 || q()) {
                f(0);
                n(2);
                return;
            }
            n(3);
        } else if (i10 == -1) {
            f(-1);
            b();
        } else if (i10 != 1) {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Unknown focus change type: ");
            sb2.append(i10);
            s.i("AudioFocusManager", sb2.toString());
        } else {
            n(1);
            f(1);
        }
    }

    public void i() {
        this.f16602c = null;
        b();
    }

    public final int j() {
        if (this.f16604e == 1) {
            return 1;
        }
        if ((l0.f4841a >= 26 ? l() : k()) == 1) {
            n(1);
            return 1;
        }
        n(0);
        return -1;
    }

    public final int k() {
        return this.f16600a.requestAudioFocus(this.f16601b, l0.Z(((e) c5.a.e(this.f16603d)).f18766c), this.f16605f);
    }

    public final int l() {
        AudioFocusRequest.Builder builder;
        AudioFocusRequest audioFocusRequest = this.f16607h;
        if (audioFocusRequest == null || this.f16608i) {
            if (audioFocusRequest == null) {
                builder = new AudioFocusRequest.Builder(this.f16605f);
            } else {
                builder = new AudioFocusRequest.Builder(this.f16607h);
            }
            this.f16607h = builder.setAudioAttributes(((e) c5.a.e(this.f16603d)).b()).setWillPauseWhenDucked(q()).setOnAudioFocusChangeListener(this.f16601b).build();
            this.f16608i = false;
        }
        return this.f16600a.requestAudioFocus(this.f16607h);
    }

    public void m(e eVar) {
        if (!l0.c(this.f16603d, eVar)) {
            this.f16603d = eVar;
            int e10 = e(eVar);
            this.f16605f = e10;
            boolean z10 = true;
            if (!(e10 == 1 || e10 == 0)) {
                z10 = false;
            }
            c5.a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }

    public final void n(int i10) {
        if (this.f16604e != i10) {
            this.f16604e = i10;
            float f10 = i10 == 3 ? 0.2f : 1.0f;
            if (this.f16606g != f10) {
                this.f16606g = f10;
                b bVar = this.f16602c;
                if (bVar != null) {
                    bVar.A(f10);
                }
            }
        }
    }

    public final boolean o(int i10) {
        return i10 == 1 || this.f16605f != 1;
    }

    public int p(boolean z10, int i10) {
        if (o(i10)) {
            b();
            return z10 ? 1 : -1;
        } else if (z10) {
            return j();
        } else {
            return -1;
        }
    }

    public final boolean q() {
        e eVar = this.f16603d;
        return eVar != null && eVar.f18764a == 1;
    }
}
