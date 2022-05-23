package hd;

import ae.j;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.c;
import ce.c0;
import ce.y;
import eb.k;
import gd.w;
import hd.b;
import ib.d;
import ib.h;
import ib.i;
import java.io.File;
import java.util.concurrent.TimeUnit;
import je.e;
import je.g;
import je.t;
import ne.g1;
import ne.i3;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import tc.f0;
import vc.n0;
import vd.o0;
import zd.o6;

public class s extends o<TdApi.InlineQueryResult> implements g1.c, k.b {
    public final String f13392a0;
    public String f13393b0;
    public b f13394c0;
    public g1 f13395d0;
    public boolean f13396e0;
    public TdApi.File f13397f0;
    public TdApi.Audio f13398g0;
    public float f13399h0;
    public boolean f13400i0;
    public k f13401j0;
    public String f13402k0;
    public float f13403l0;
    public boolean f13404m0;
    public TdApi.VoiceNote f13405n0;
    public boolean f13406o0;
    public int f13407p0;
    public Drawable f13408q0;
    public boolean f13409r0;
    public Object f13410s0;
    public g f13411t0;
    public g f13412u0;
    public int f13413v0;

    public s(a aVar, o6 o6Var, TdApi.InlineQueryResultVideo inlineQueryResultVideo) {
        super(aVar, o6Var, 1, inlineQueryResultVideo.f19929id, inlineQueryResultVideo);
        String str = inlineQueryResultVideo.title.isEmpty() ? inlineQueryResultVideo.video.fileName : inlineQueryResultVideo.title;
        this.f13392a0 = str;
        StringBuilder sb2 = new StringBuilder(5);
        c0.i(inlineQueryResultVideo.video.duration, TimeUnit.SECONDS, false, sb2);
        if (!inlineQueryResultVideo.description.isEmpty()) {
            sb2.append(", ");
            sb2.append(inlineQueryResultVideo.description);
        }
        this.f13393b0 = sb2.toString();
        R(n0.s(o6Var, inlineQueryResultVideo.video, a0.i(50.0f), a0.i(3.0f)));
        if (q() == null) {
            this.f13394c0 = new b(25.0f, new b.a(t2.X0(inlineQueryResultVideo.video.fileName.isEmpty() ? inlineQueryResultVideo.f19929id : inlineQueryResultVideo.video.fileName), t2.B1(str)), null);
        }
    }

    @Override
    public void E(int i10) {
        this.f13413v0 = ((i10 - (a0.i(11.0f) * 2)) - a0.i(50.0f)) - a0.i(15.0f);
        if (g0()) {
            this.f13413v0 -= (a0.i(16.0f) + a0.i(23.0f)) + a0.i(9.0f);
        }
        g gVar = null;
        this.f13411t0 = !i.i(this.f13392a0) ? new g.b(this.f13392a0, this.f13413v0, y.q0(), t.d.C).v().b().f() : null;
        if (!i.i(this.f13393b0)) {
            gVar = new g.b(this.f13393b0, this.f13413v0, y.g0(), t.d.D).v().f();
        }
        this.f13412u0 = gVar;
    }

    @Override
    public void G(Canvas canvas, ld.b bVar, int i10, int i11, float f10, float f11, float f12, String str, i3 i3Var) {
        double radians = Math.toRadians(45.0d);
        int i12 = a0.i(11.0f) + (a0.i(50.0f) / 2) + ((int) ((a0.i(50.0f) / 2.0f) * Math.sin(radians)));
        int Z = Z() + (a0.i(50.0f) / 2) + ((int) ((a0.i(50.0f) / 2.0f) * Math.cos(radians)));
        i3.c(canvas, i12, Z, f12, str, i3Var);
        RectF a02 = y.a0();
        int i13 = a0.i(11.0f);
        a02.set(i12 - i13, Z - i13, i12 + i13, Z + i13);
        canvas.drawArc(a02, 135.0f, 170.0f * f12, false, y.R(d.c(j.u(), j.i())));
    }

    @Override
    public void H(View view, boolean z10) {
        g1 g1Var = this.f13395d0;
        if (g1Var != null) {
            g1Var.R();
        }
    }

    @Override
    public boolean I(View view, MotionEvent motionEvent) {
        g1 g1Var;
        return !this.f13396e0 && (g1Var = this.f13395d0) != null && g1Var.S(view, motionEvent);
    }

    @Override
    public void L(ld.b bVar, boolean z10) {
        if (q() != null) {
            q().f(bVar, z10);
        } else {
            bVar.d();
        }
    }

    @Override
    public o<TdApi.InlineQueryResult> S(TdApi.Message message) {
        super.S(message);
        n0();
        return this;
    }

    public final int Z() {
        return a0.i((!g0() || !this.f13404m0) ? 11.0f : 7.5f);
    }

    public TdApi.Message a0() {
        g1 g1Var = this.f13395d0;
        if (g1Var != null) {
            return g1Var.w();
        }
        return null;
    }

    public Object b0() {
        return this.f13410s0;
    }

    public TdApi.Audio c0() {
        return this.f13398g0;
    }

    public TdApi.File d0() {
        return this.f13397f0;
    }

    @Override
    public void e(TdApi.File file, int i10) {
        if (!this.f13409r0) {
            n0();
        }
    }

    public String e0() {
        return t2.f2(this.f13398g0);
    }

    public String f0() {
        return this.f13392a0;
    }

    @Override
    public void g(TdApi.File file, float f10) {
        n0();
    }

    public final boolean g0() {
        g1 g1Var = this.f13395d0;
        return g1Var != null && g1Var.K();
    }

    public boolean h0(View view) {
        g1 g1Var = this.f13395d0;
        return g1Var != null && g1Var.W(view);
    }

    public final void i0(String str) {
        if (!this.f13409r0) {
            String str2 = this.f13393b0;
            if (str2 == null || !str2.equals(str)) {
                this.f13393b0 = str;
                int i10 = this.f13413v0;
                if (i10 > 0) {
                    this.f13412u0 = new g.b(str, i10, y.g0(), t.d.D).v().f();
                    z();
                }
            }
        }
    }

    @Override
    public void j(yc.a r24, android.graphics.Canvas r25, ld.b r26, int r27, int r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: hd.s.j(yc.a, android.graphics.Canvas, ld.b, int, int, int):void");
    }

    public void j0(boolean z10) {
        this.f13404m0 = z10;
        this.f13395d0.x0(z10);
        if (q() != null) {
            q().h(z10 ? a0.i(4.0f) : a0.i(50.0f) / 2);
        }
        this.f13395d0.e0(R.id.theme_color_file);
        String h10 = c0.h(this.f13398g0.duration);
        this.f13402k0 = h10;
        this.f13403l0 = v0.T1(h10, y.b0(11.0f));
    }

    @Override
    public boolean k(g1 g1Var, View view, TdApi.File file, long j10) {
        return false;
    }

    public void k0(boolean z10) {
        boolean w10 = w();
        if (this.f13400i0 != z10 || !w10) {
            this.f13400i0 = z10;
            this.f13395d0.y0(z10);
            float f10 = z10 ? 1.0f : 0.0f;
            if (w10) {
                if (this.f13401j0 == null) {
                    this.f13401j0 = new k(0, this, db.b.f7287b, 180L, this.f13399h0);
                }
                this.f13401j0.i(f10);
                return;
            }
            k kVar = this.f13401j0;
            if (kVar != null) {
                kVar.l(f10);
            }
            m0(f10);
        }
    }

    public void l0(boolean z10) {
        if (this.f13400i0 || !this.f13404m0) {
            this.f13395d0.w0(z10, this.f13399h0 == 1.0f);
        }
    }

    public final void m0(float f10) {
        if (this.f13399h0 != f10) {
            this.f13399h0 = f10;
            z();
        }
    }

    @Override
    public int n() {
        return a0.i((!g0() || !this.f13404m0) ? 72.0f : 65.0f);
    }

    public final void n0() {
        int v10 = v();
        boolean z10 = true;
        if (v10 == 7) {
            TdApi.File file = this.f13398g0.audio;
            g1 g1Var = this.f13395d0;
            if (g1Var == null || !g1Var.I()) {
                z10 = false;
            }
            String w10 = n.w(file, z10, false);
            if (w10 == null) {
                w10 = t2.f2(this.f13398g0);
            }
            i0(w10);
        } else if (v10 == 8) {
            String h10 = c0.h(this.f13405n0.duration);
            if (getMessage() != null) {
                i0(w.j1(R.string.format_fileSizeAndModifiedDate, h10, w.J0(getMessage().date, TimeUnit.SECONDS)));
            } else {
                i0(h10);
            }
        } else if (v10 == 9) {
            TdApi.File file2 = this.f13397f0;
            g1 g1Var2 = this.f13395d0;
            String w11 = n.w(file2, g1Var2 != null && g1Var2.I(), false);
            if (w11 == null) {
                w11 = c0.m(this.f13397f0.expectedSize);
            }
            if (getMessage() != null) {
                i0(w.j1(R.string.format_fileSizeAndModifiedDate, w11, w.J0(getMessage().date, TimeUnit.SECONDS)));
                return;
            }
            T t10 = this.M;
            if (!(t10 instanceof TdApi.InlineQueryResultDocument) || ((TdApi.InlineQueryResultDocument) t10).description.isEmpty()) {
                i0(w11);
            } else {
                i0(w.j1(R.string.format_fileSizeAndDescription, w11, ((TdApi.InlineQueryResultDocument) this.M).description));
            }
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            m0(f10);
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    public s(a aVar, o6 o6Var, TdApi.InlineQueryResultVenue inlineQueryResultVenue) {
        super(aVar, o6Var, 4, inlineQueryResultVenue.f19928id, inlineQueryResultVenue);
        TdApi.Venue venue = inlineQueryResultVenue.venue;
        this.f13392a0 = venue.title;
        this.f13393b0 = venue.address;
        R(n0.n(o6Var, venue.location, inlineQueryResultVenue.thumbnail, a0.i(50.0f), a0.i(3.0f)));
    }

    public s(a aVar, o6 o6Var, TdApi.InlineQueryResultLocation inlineQueryResultLocation) {
        super(aVar, o6Var, 3, inlineQueryResultLocation.f19925id, inlineQueryResultLocation);
        this.f13392a0 = inlineQueryResultLocation.title.isEmpty() ? w.i1(R.string.Location) : inlineQueryResultLocation.title;
        this.f13393b0 = h.o(inlineQueryResultLocation.location.latitude) + ", " + h.o(inlineQueryResultLocation.location.longitude);
        R(n0.n(o6Var, inlineQueryResultLocation.location, null, a0.i(50.0f), a0.i(3.0f)));
    }

    public s(a aVar, o6 o6Var, TdApi.InlineQueryResultContact inlineQueryResultContact) {
        super(aVar, o6Var, 2, inlineQueryResultContact.f19922id, inlineQueryResultContact);
        TdApi.Contact contact = inlineQueryResultContact.contact;
        this.f13392a0 = t2.q2(contact.firstName, contact.lastName);
        this.f13393b0 = c0.w(inlineQueryResultContact.contact.phoneNumber);
        TdApi.User u22 = inlineQueryResultContact.contact.userId != 0 ? o6Var.e2().u2(inlineQueryResultContact.contact.userId) : null;
        R(n0.p(o6Var, u22 != null ? u22.profilePhoto : null, inlineQueryResultContact.thumbnail, a0.i(50.0f), a0.i(50.0f) / 2));
        if (q() == null) {
            TdApi.Contact contact2 = inlineQueryResultContact.contact;
            e C1 = t2.C1(contact2.firstName, contact2.lastName);
            long j10 = inlineQueryResultContact.contact.userId;
            this.f13394c0 = new b(25.0f, new b.a(j10 != 0 ? t2.H0(j10, o6Var.fa()) : R.id.theme_color_avatarInactive, C1), null);
        }
    }

    public s(a aVar, o6 o6Var, TdApi.InlineQueryResultAudio inlineQueryResultAudio, o0.c cVar) {
        this(aVar, o6Var, inlineQueryResultAudio.f19921id, (TdApi.Message) null, inlineQueryResultAudio.audio, cVar);
    }

    public s(a aVar, o6 o6Var, TdApi.PageBlockAudio pageBlockAudio, o0.c cVar) {
        this(aVar, o6Var, (String) null, (TdApi.Message) null, pageBlockAudio.audio, cVar);
    }

    public s(a aVar, o6 o6Var, TdApi.PageBlockVoiceNote pageBlockVoiceNote, String str) {
        this(aVar, o6Var, (String) null, (TdApi.Message) null, str, pageBlockVoiceNote.voiceNote);
    }

    public s(a aVar, o6 o6Var, TdApi.Message message, TdApi.MessageAudio messageAudio, o0.c cVar) {
        this(aVar, o6Var, (String) null, message, messageAudio.audio, cVar);
    }

    public s(a aVar, o6 o6Var, String str, TdApi.Message message, TdApi.Audio audio, o0.c cVar) {
        super(aVar, o6Var, 7, str, null);
        this.f13392a0 = t2.m2(audio);
        this.f13393b0 = t2.f2(audio);
        this.f13398g0 = audio;
        this.f13397f0 = audio.audio;
        R(n0.j(o6Var, audio, a0.i(50.0f), a0.i(50.0f) / 2));
        if (q() == null && message != null) {
            R(n0.o(o6Var, message, null, a0.i(50.0f), a0.i(50.0f) / 2));
        }
        g1 g1Var = new g1(aVar, o6Var, 16, q() != null, message != null ? message.chatId : 0L, message != null ? message.f19946id : 0L);
        this.f13395d0 = g1Var;
        g1Var.R0(this.T);
        if (message == null) {
            this.f13395d0.C0(R.drawable.baseline_play_arrow_36_white);
        }
        this.f13395d0.L0(this);
        this.f13395d0.k0(R.drawable.baseline_play_arrow_36_white);
        if (q() != null) {
            this.f13395d0.d0(1140850688);
        } else {
            this.f13395d0.e0(R.id.theme_color_file);
        }
        if (message != null) {
            this.f13395d0.F0(message, cVar);
        } else {
            this.f13395d0.F0(t2.D4(audio), cVar);
        }
    }

    public s(a aVar, o6 o6Var, TdApi.InlineQueryResultVoiceNote inlineQueryResultVoiceNote) {
        this(aVar, o6Var, inlineQueryResultVoiceNote.f19930id, (TdApi.Message) null, inlineQueryResultVoiceNote.title, inlineQueryResultVoiceNote.voiceNote);
    }

    public s(a aVar, o6 o6Var, TdApi.Message message, TdApi.VoiceNote voiceNote) {
        this(aVar, o6Var, (String) null, message, o6Var.V9(message), voiceNote);
    }

    public s(a aVar, o6 o6Var, String str, TdApi.Message message, String str2, TdApi.VoiceNote voiceNote) {
        super(aVar, o6Var, 8, str, null);
        this.f13405n0 = voiceNote;
        this.f13392a0 = str2;
        int i10 = voiceNote.duration;
        this.f13393b0 = i10 != 0 ? c0.h(i10) : c0.m(voiceNote.voice.size);
        g1 g1Var = new g1(aVar, o6Var, 2, false, message != null ? message.chatId : 0L, message != null ? message.f19946id : 0L);
        this.f13395d0 = g1Var;
        g1Var.R0(this.T);
        this.f13395d0.k0(R.drawable.baseline_play_arrow_36_white);
        this.f13395d0.e0(R.id.theme_color_file);
        this.f13395d0.F0(message == null ? t2.E4(voiceNote) : message, null);
    }

    public s(a aVar, o6 o6Var, String str, int i10, int i11, String str2, String str3) {
        super(aVar, o6Var, 9, str, null);
        this.f13392a0 = str2;
        this.f13393b0 = str3;
        this.f13406o0 = true;
        this.f13408q0 = c.g(aVar.getResources(), i11);
        this.f13407p0 = i10;
    }

    public s(a aVar, o6 o6Var, File file, String str, String str2, Object obj, boolean z10) {
        super(aVar, o6Var, 9, file.getPath(), null);
        this.f13392a0 = str;
        this.f13393b0 = str2;
        this.f13410s0 = obj;
        this.f13409r0 = true;
        this.f13397f0 = t2.H4(file);
        String z22 = v0.z2(file.getPath());
        R(n0.i(o6Var, file, z22, a0.i(50.0f), a0.i(50.0f) / 2));
        g1 g1Var = new g1(aVar, o6Var, 8, false, 0L, 0L);
        this.f13395d0 = g1Var;
        g1Var.R0(this.T);
        this.f13395d0.L0(this);
        n0 q10 = q();
        int i10 = R.drawable.baseline_folder_24;
        if (q10 == null) {
            this.f13395d0.k0(!z10 ? R.drawable.baseline_insert_drive_file_24 : i10);
            this.f13395d0.e0(t2.m1(file.getName(), z22, false));
        } else if (z10) {
            this.f13395d0.d0(1711276032);
            this.f13395d0.k0(R.drawable.baseline_folder_24);
        } else {
            this.f13395d0.d0(1140850688);
        }
        this.f13395d0.v0();
        this.f13395d0.o0(this.f13397f0);
        this.f13395d0.z0(z22);
    }

    public s(a aVar, o6 o6Var, f0.h hVar, o0.c cVar) {
        super(aVar, o6Var, 7, Long.toString(hVar.g()), null);
        File file = new File(hVar.i());
        this.f13410s0 = hVar;
        this.f13392a0 = i.i(hVar.j()) ? w.i1(R.string.UnknownTrack) : hVar.j();
        this.f13393b0 = i.i(hVar.d()) ? w.i1(R.string.AudioUnknownArtist) : hVar.d();
        this.f13409r0 = true;
        this.f13397f0 = t2.G4(-1, Long.toString(hVar.g()), file.getPath(), (int) file.length());
        if (hVar.k()) {
            ld.i iVar = new ld.i(hVar.e().toString());
            iVar.c0();
            R(new vc.o0(a0.i(50.0f), a0.i(50.0f) / 2, iVar));
        } else {
            R(null);
        }
        g1 g1Var = new g1(aVar, o6Var, 16, false, 0L, 0L);
        this.f13395d0 = g1Var;
        g1Var.R0(this.T);
        this.f13395d0.L0(this);
        this.f13395d0.v0();
        this.f13395d0.k0(R.drawable.baseline_play_arrow_36_white);
        if (q() != null) {
            this.f13395d0.d0(0);
        } else {
            this.f13395d0.e0(R.id.theme_color_file);
        }
        String x02 = v0.x0(hVar.i());
        TdApi.Message D4 = t2.D4(new TdApi.Audio((int) (hVar.f() / 1000), hVar.j(), hVar.d(), x02, v0.z2(v0.v0(x02)), null, null, this.f13397f0));
        D4.f19946id = hVar.g();
        this.f13395d0.F0(D4, cVar);
    }

    public s(a aVar, o6 o6Var, TdApi.Message message, TdApi.Document document) {
        super(aVar, o6Var, 9, null, null);
        this.f13392a0 = i.i(document.fileName) ? i.i(document.mimeType) ? w.i1(R.string.File) : "image/gif".equals(document.mimeType) ? "GIF File" : document.mimeType : document.fileName;
        this.f13393b0 = c0.m(document.document.size);
        this.f13397f0 = document.document;
        R(n0.o(o6Var, message, null, a0.i(50.0f), a0.i(50.0f) / 2));
        g1 g1Var = new g1(aVar, o6Var, 8, q() != null, message.chatId, message.f19946id);
        this.f13395d0 = g1Var;
        g1Var.R0(this.T);
        this.f13395d0.L0(this);
        if (q() == null) {
            this.f13395d0.m0(document);
            this.f13395d0.e0(t2.n1(document, false));
        } else {
            this.f13395d0.d0(1140850688);
        }
        this.f13395d0.o0(document.document);
        this.f13395d0.z0(document.mimeType);
    }

    public s(a aVar, o6 o6Var, TdApi.InlineQueryResultDocument inlineQueryResultDocument) {
        super(aVar, o6Var, 9, inlineQueryResultDocument.f19923id, inlineQueryResultDocument);
        this.f13392a0 = inlineQueryResultDocument.title.isEmpty() ? inlineQueryResultDocument.document.fileName : inlineQueryResultDocument.title;
        this.f13393b0 = inlineQueryResultDocument.description.isEmpty() ? c0.m(inlineQueryResultDocument.document.document.size) : w.j1(R.string.format_fileSizeAndDescription, c0.m(inlineQueryResultDocument.document.document.size), inlineQueryResultDocument.description);
        TdApi.Document document = inlineQueryResultDocument.document;
        this.f13397f0 = document.document;
        R(n0.l(o6Var, document, a0.i(50.0f), a0.i(50.0f) / 2));
        g1 g1Var = new g1(this.f13322a, o6Var, 8, false, 0L, 0L);
        this.f13395d0 = g1Var;
        g1Var.R0(this.T);
        if (this.f13397f0 != null) {
            this.f13395d0.L0(this);
        }
        this.f13395d0.C0(R.drawable.baseline_insert_drive_file_24);
        if (q() == null) {
            this.f13395d0.m0(inlineQueryResultDocument.document);
            this.f13395d0.e0(t2.n1(inlineQueryResultDocument.document, false));
        } else {
            this.f13395d0.d0(1140850688);
        }
        this.f13395d0.o0(inlineQueryResultDocument.document.document);
        this.f13395d0.z0(inlineQueryResultDocument.document.mimeType);
    }
}
