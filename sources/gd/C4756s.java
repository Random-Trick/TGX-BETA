package gd;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1362c;
import be.C1363c0;
import be.C1410y;
import gd.C4587b;
import ie.C5386e;
import ie.C5428t;
import ie.RunnableC5390g;
import java.io.File;
import java.util.concurrent.TimeUnit;
import me.C6883g1;
import me.C6918i3;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3950k;
import p082fd.C4403w;
import p108hb.C5064d;
import p108hb.C5069h;
import p108hb.C5070i;
import p156kd.C6238b;
import p156kd.C6250i;
import p291uc.AbstractC9622o0;
import p291uc.C9629p0;
import p292ud.C9773p0;
import p350yd.C10930q6;
import p364zd.C11524j;
import sc.View$OnClickListenerC8750f0;

public class C4756s extends AbstractC4718o<TdApi.InlineQueryResult> implements C6883g1.AbstractC6886c, C3950k.AbstractC3952b {
    public final String f15979a0;
    public String f15980b0;
    public C4587b f15981c0;
    public C6883g1 f15982d0;
    public boolean f15983e0;
    public TdApi.File f15984f0;
    public TdApi.Audio f15985g0;
    public float f15986h0;
    public boolean f15987i0;
    public C3950k f15988j0;
    public String f15989k0;
    public float f15990l0;
    public boolean f15991m0;
    public TdApi.VoiceNote f15992n0;
    public boolean f15993o0;
    public int f15994p0;
    public Drawable f15995q0;
    public boolean f15996r0;
    public Object f15997s0;
    public RunnableC5390g f15998t0;
    public RunnableC5390g f15999u0;
    public int f16000v0;

    public C4756s(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.InlineQueryResultVideo inlineQueryResultVideo) {
        super(aVar, q6Var, 1, inlineQueryResultVideo.f25389id, inlineQueryResultVideo);
        String str = inlineQueryResultVideo.title.isEmpty() ? inlineQueryResultVideo.video.fileName : inlineQueryResultVideo.title;
        this.f15979a0 = str;
        StringBuilder sb2 = new StringBuilder(5);
        C1363c0.m37431i(inlineQueryResultVideo.video.duration, TimeUnit.SECONDS, false, sb2);
        if (!inlineQueryResultVideo.description.isEmpty()) {
            sb2.append(", ");
            sb2.append(inlineQueryResultVideo.description);
        }
        this.f15980b0 = sb2.toString();
        m26348R(AbstractC9622o0.m7978s(q6Var, inlineQueryResultVideo.video, C1357a0.m37541i(50.0f), C1357a0.m37541i(3.0f)));
        if (m26335q() == null) {
            this.f15981c0 = new C4587b(25.0f, new C4587b.C4588a(C4779t2.m25576X0(inlineQueryResultVideo.video.fileName.isEmpty() ? inlineQueryResultVideo.f25389id : inlineQueryResultVideo.video.fileName), C4779t2.m25722B1(str)), null);
        }
    }

    @Override
    public void mo25116E(int i) {
        this.f16000v0 = ((i - (C1357a0.m37541i(11.0f) * 2)) - C1357a0.m37541i(50.0f)) - C1357a0.m37541i(15.0f);
        if (m26260g0()) {
            this.f16000v0 -= (C1357a0.m37541i(16.0f) + C1357a0.m37541i(23.0f)) + C1357a0.m37541i(9.0f);
        }
        RunnableC5390g gVar = null;
        this.f15998t0 = !C5070i.m24061i(this.f15979a0) ? new RunnableC5390g.C5392b(this.f15979a0, this.f16000v0, C1410y.m37018q0(), C5428t.AbstractC5441d.f17872C).m22868v().m22888b().m22884f() : null;
        if (!C5070i.m24061i(this.f15980b0)) {
            gVar = new RunnableC5390g.C5392b(this.f15980b0, this.f16000v0, C1410y.m37038g0(), C5428t.AbstractC5441d.f17873D).m22868v().m22884f();
        }
        this.f15999u0 = gVar;
    }

    @Override
    public void mo25115G(Canvas canvas, C6238b bVar, int i, int i2, float f, float f2, float f3, String str, C6918i3 i3Var) {
        double radians = Math.toRadians(45.0d);
        int i3 = C1357a0.m37541i(11.0f) + (C1357a0.m37541i(50.0f) / 2) + ((int) ((C1357a0.m37541i(50.0f) / 2.0f) * Math.sin(radians)));
        int Z = m26267Z() + (C1357a0.m37541i(50.0f) / 2) + ((int) ((C1357a0.m37541i(50.0f) / 2.0f) * Math.cos(radians)));
        C6918i3.m18465c(canvas, i3, Z, f3, str, i3Var);
        RectF a0 = C1410y.m37050a0();
        int i4 = C1357a0.m37541i(11.0f);
        a0.set(i3 - i4, Z - i4, i3 + i4, Z + i4);
        canvas.drawArc(a0, 135.0f, 170.0f * f3, false, C1410y.m37060R(C5064d.m24129c(C11524j.m148w(), C11524j.m178i())));
    }

    @Override
    public void mo26269H(View view, boolean z) {
        C6883g1 g1Var = this.f15982d0;
        if (g1Var != null) {
            g1Var.m18654P();
        }
    }

    @Override
    public boolean mo25114I(View view, MotionEvent motionEvent) {
        C6883g1 g1Var;
        return !this.f15983e0 && (g1Var = this.f15982d0) != null && g1Var.m18652Q(view, motionEvent);
    }

    @Override
    public void mo25113L(C6238b bVar, boolean z) {
        if (m26335q() != null) {
            m26335q().mo7955f(bVar, z);
        } else {
            bVar.m20999d();
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            m26254m0(f);
        }
    }

    @Override
    public AbstractC4718o<TdApi.InlineQueryResult> mo26268S(TdApi.Message message) {
        super.mo26268S(message);
        m26253n0();
        return this;
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public final int m26267Z() {
        return C1357a0.m37541i((!m26260g0() || !this.f15991m0) ? 11.0f : 7.5f);
    }

    public TdApi.Message m26266a0() {
        C6883g1 g1Var = this.f15982d0;
        if (g1Var != null) {
            return g1Var.m18599v();
        }
        return null;
    }

    @Override
    public void mo15929b(TdApi.File file, int i) {
        if (!this.f15996r0) {
            m26253n0();
        }
    }

    public Object m26265b0() {
        return this.f15997s0;
    }

    public TdApi.Audio m26264c0() {
        return this.f15985g0;
    }

    public TdApi.File m26263d0() {
        return this.f15984f0;
    }

    @Override
    public boolean mo15925e(C6883g1 g1Var, View view, TdApi.File file, long j) {
        return false;
    }

    public String m26262e0() {
        return C4779t2.m25521f2(this.f15985g0);
    }

    @Override
    public void mo15923f(TdApi.File file, float f) {
        m26253n0();
    }

    public String m26261f0() {
        return this.f15979a0;
    }

    public final boolean m26260g0() {
        C6883g1 g1Var = this.f15982d0;
        return g1Var != null && g1Var.m18666J();
    }

    public boolean m26259h0(View view) {
        C6883g1 g1Var = this.f15982d0;
        return g1Var != null && g1Var.m18647U(view);
    }

    public final void m26258i0(String str) {
        if (!this.f15996r0) {
            String str2 = this.f15980b0;
            if (str2 == null || !str2.equals(str)) {
                this.f15980b0 = str;
                int i = this.f16000v0;
                if (i > 0) {
                    this.f15999u0 = new RunnableC5390g.C5392b(str, i, C1410y.m37038g0(), C5428t.AbstractC5441d.f17873D).m22868v().m22884f();
                    m26326z();
                }
            }
        }
    }

    public void m26257j0(boolean z) {
        this.f15991m0 = z;
        this.f15982d0.m18598v0(z);
        if (m26335q() != null) {
            m26335q().m7989h(z ? C1357a0.m37541i(4.0f) : C1357a0.m37541i(50.0f) / 2);
        }
        this.f15982d0.m18636c0(R.id.theme_color_file);
        String h = C1363c0.m37433h(this.f15985g0.duration);
        this.f15989k0 = h;
        this.f15990l0 = C7389v0.m16680T1(h, C1410y.m37048b0(11.0f));
    }

    @Override
    public void mo25112k(p334xc.C10185a r24, android.graphics.Canvas r25, p156kd.C6238b r26, int r27, int r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4756s.mo25112k(xc.a, android.graphics.Canvas, kd.b, int, int, int):void");
    }

    public void m26256k0(boolean z) {
        boolean w = m26329w();
        if (this.f15987i0 != z || !w) {
            this.f15987i0 = z;
            this.f15982d0.m18596w0(z);
            float f = z ? 1.0f : 0.0f;
            if (w) {
                if (this.f15988j0 == null) {
                    this.f15988j0 = new C3950k(0, this, C2057b.f7280b, 180L, this.f15986h0);
                }
                this.f15988j0.m29544i(f);
                return;
            }
            C3950k kVar = this.f15988j0;
            if (kVar != null) {
                kVar.m29541l(f);
            }
            m26254m0(f);
        }
    }

    public void m26255l0(boolean z) {
        if (this.f15987i0 || !this.f15991m0) {
            this.f15982d0.m18600u0(z, this.f15986h0 == 1.0f);
        }
    }

    public final void m26254m0(float f) {
        if (this.f15986h0 != f) {
            this.f15986h0 = f;
            m26326z();
        }
    }

    @Override
    public int mo25111n() {
        return C1357a0.m37541i((!m26260g0() || !this.f15991m0) ? 72.0f : 65.0f);
    }

    public final void m26253n0() {
        int v = m26330v();
        boolean z = true;
        if (v == 7) {
            TdApi.File file = this.f15985g0.audio;
            C6883g1 g1Var = this.f15982d0;
            if (g1Var == null || !g1Var.m18670H()) {
                z = false;
            }
            String v2 = C4707n.m26390v(file, z, false);
            if (v2 == null) {
                v2 = C4779t2.m25521f2(this.f15985g0);
            }
            m26258i0(v2);
        } else if (v == 8) {
            String h = C1363c0.m37433h(this.f15992n0.duration);
            if (getMessage() != null) {
                m26258i0(C4403w.m27865j1(R.string.format_fileSizeAndModifiedDate, h, C4403w.m27974J0(getMessage().date, TimeUnit.SECONDS)));
            } else {
                m26258i0(h);
            }
        } else if (v == 9) {
            TdApi.File file2 = this.f15984f0;
            C6883g1 g1Var2 = this.f15982d0;
            String v3 = C4707n.m26390v(file2, g1Var2 != null && g1Var2.m18670H(), false);
            if (v3 == null) {
                v3 = C1363c0.m37423m(this.f15984f0.expectedSize);
            }
            if (getMessage() != null) {
                m26258i0(C4403w.m27865j1(R.string.format_fileSizeAndModifiedDate, v3, C4403w.m27974J0(getMessage().date, TimeUnit.SECONDS)));
                return;
            }
            T t = this.f15886M;
            if (!(t instanceof TdApi.InlineQueryResultDocument) || ((TdApi.InlineQueryResultDocument) t).description.isEmpty()) {
                m26258i0(v3);
            } else {
                m26258i0(C4403w.m27865j1(R.string.format_fileSizeAndDescription, v3, ((TdApi.InlineQueryResultDocument) this.f15886M).description));
            }
        }
    }

    public C4756s(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.InlineQueryResultVenue inlineQueryResultVenue) {
        super(aVar, q6Var, 4, inlineQueryResultVenue.f25388id, inlineQueryResultVenue);
        TdApi.Venue venue = inlineQueryResultVenue.venue;
        this.f15979a0 = venue.title;
        this.f15980b0 = venue.address;
        m26348R(AbstractC9622o0.m7983n(q6Var, venue.location, inlineQueryResultVenue.thumbnail, C1357a0.m37541i(50.0f), C1357a0.m37541i(3.0f)));
    }

    public C4756s(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.InlineQueryResultLocation inlineQueryResultLocation) {
        super(aVar, q6Var, 3, inlineQueryResultLocation.f25385id, inlineQueryResultLocation);
        this.f15979a0 = inlineQueryResultLocation.title.isEmpty() ? C4403w.m27869i1(R.string.Location) : inlineQueryResultLocation.title;
        this.f15980b0 = C5069h.m24078o(inlineQueryResultLocation.location.latitude) + ", " + C5069h.m24078o(inlineQueryResultLocation.location.longitude);
        m26348R(AbstractC9622o0.m7983n(q6Var, inlineQueryResultLocation.location, null, C1357a0.m37541i(50.0f), C1357a0.m37541i(3.0f)));
    }

    public C4756s(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.InlineQueryResultContact inlineQueryResultContact) {
        super(aVar, q6Var, 2, inlineQueryResultContact.f25382id, inlineQueryResultContact);
        TdApi.Contact contact = inlineQueryResultContact.contact;
        this.f15979a0 = C4779t2.m25444q2(contact.firstName, contact.lastName);
        this.f15980b0 = C1363c0.m37410w(inlineQueryResultContact.contact.phoneNumber);
        TdApi.User v2 = inlineQueryResultContact.contact.userId != 0 ? q6Var.m2480e2().m1583v2(inlineQueryResultContact.contact.userId) : null;
        m26348R(AbstractC9622o0.m7981p(q6Var, v2 != null ? v2.profilePhoto : null, inlineQueryResultContact.thumbnail, C1357a0.m37541i(50.0f), C1357a0.m37541i(50.0f) / 2));
        if (m26335q() == null) {
            TdApi.Contact contact2 = inlineQueryResultContact.contact;
            C5386e C1 = C4779t2.m25715C1(contact2.firstName, contact2.lastName);
            long j = inlineQueryResultContact.contact.userId;
            this.f15981c0 = new C4587b(25.0f, new C4587b.C4588a(j != 0 ? C4779t2.m25681H0(j, q6Var.m2519ba()) : R.id.theme_color_avatarInactive, C1), null);
        }
    }

    public C4756s(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.InlineQueryResultAudio inlineQueryResultAudio, C9773p0.AbstractC9776c cVar) {
        this(aVar, q6Var, inlineQueryResultAudio.f25381id, (TdApi.Message) null, inlineQueryResultAudio.audio, cVar);
    }

    public C4756s(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.PageBlockAudio pageBlockAudio, C9773p0.AbstractC9776c cVar) {
        this(aVar, q6Var, (String) null, (TdApi.Message) null, pageBlockAudio.audio, cVar);
    }

    public C4756s(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.PageBlockVoiceNote pageBlockVoiceNote, String str) {
        this(aVar, q6Var, (String) null, (TdApi.Message) null, str, pageBlockVoiceNote.voiceNote);
    }

    public C4756s(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.Message message, TdApi.MessageAudio messageAudio, C9773p0.AbstractC9776c cVar) {
        this(aVar, q6Var, (String) null, message, messageAudio.audio, cVar);
    }

    public C4756s(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, String str, TdApi.Message message, TdApi.Audio audio, C9773p0.AbstractC9776c cVar) {
        super(aVar, q6Var, 7, str, null);
        this.f15979a0 = C4779t2.m25472m2(audio);
        this.f15980b0 = C4779t2.m25521f2(audio);
        this.f15985g0 = audio;
        this.f15984f0 = audio.audio;
        m26348R(AbstractC9622o0.m7987j(q6Var, audio, C1357a0.m37541i(50.0f), C1357a0.m37541i(50.0f) / 2));
        if (m26335q() == null && message != null) {
            m26348R(AbstractC9622o0.m7982o(q6Var, message, null, C1357a0.m37541i(50.0f), C1357a0.m37541i(50.0f) / 2));
        }
        C6883g1 g1Var = new C6883g1(aVar, q6Var, 16, m26335q() != null, message != null ? message.chatId : 0L, message != null ? message.f25406id : 0L);
        this.f15982d0 = g1Var;
        g1Var.m18659M0(this.f15893T);
        if (message == null) {
            this.f15982d0.m18590z0(R.drawable.baseline_play_arrow_36_white);
        }
        this.f15982d0.m18669H0(this);
        this.f15982d0.m18624i0(R.drawable.baseline_play_arrow_36_white);
        if (m26335q() != null) {
            this.f15982d0.m18638b0(1140850688);
        } else {
            this.f15982d0.m18636c0(R.id.theme_color_file);
        }
        if (message != null) {
            this.f15982d0.m18679C0(message, cVar);
        } else {
            this.f15982d0.m18679C0(C4779t2.m25705D4(audio), cVar);
        }
    }

    public C4756s(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.InlineQueryResultVoiceNote inlineQueryResultVoiceNote) {
        this(aVar, q6Var, inlineQueryResultVoiceNote.f25390id, (TdApi.Message) null, inlineQueryResultVoiceNote.title, inlineQueryResultVoiceNote.voiceNote);
    }

    public C4756s(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.Message message, TdApi.VoiceNote voiceNote) {
        this(aVar, q6Var, (String) null, message, q6Var.m2670R9(message), voiceNote);
    }

    public C4756s(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, String str, TdApi.Message message, String str2, TdApi.VoiceNote voiceNote) {
        super(aVar, q6Var, 8, str, null);
        this.f15992n0 = voiceNote;
        this.f15979a0 = str2;
        int i = voiceNote.duration;
        this.f15980b0 = i != 0 ? C1363c0.m37433h(i) : C1363c0.m37423m(voiceNote.voice.size);
        C6883g1 g1Var = new C6883g1(aVar, q6Var, 2, false, message != null ? message.chatId : 0L, message != null ? message.f25406id : 0L);
        this.f15982d0 = g1Var;
        g1Var.m18659M0(this.f15893T);
        this.f15982d0.m18624i0(R.drawable.baseline_play_arrow_36_white);
        this.f15982d0.m18636c0(R.id.theme_color_file);
        this.f15982d0.m18679C0(message == null ? C4779t2.m25698E4(voiceNote) : message, null);
    }

    public C4756s(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, String str, int i, int i2, String str2, String str3) {
        super(aVar, q6Var, 9, str, null);
        this.f15979a0 = str2;
        this.f15980b0 = str3;
        this.f15993o0 = true;
        this.f15995q0 = C1362c.m37482g(aVar.getResources(), i2);
        this.f15994p0 = i;
    }

    public C4756s(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, File file, String str, String str2, Object obj, boolean z) {
        super(aVar, q6Var, 9, file.getPath(), null);
        this.f15979a0 = str;
        this.f15980b0 = str2;
        this.f15997s0 = obj;
        this.f15996r0 = true;
        this.f15984f0 = C4779t2.m25677H4(file);
        String z2 = C7389v0.m16555z2(file.getPath());
        m26348R(AbstractC9622o0.m7988i(q6Var, file, z2, C1357a0.m37541i(50.0f), C1357a0.m37541i(50.0f) / 2));
        C6883g1 g1Var = new C6883g1(aVar, q6Var, 8, false, 0L, 0L);
        this.f15982d0 = g1Var;
        g1Var.m18659M0(this.f15893T);
        this.f15982d0.m18669H0(this);
        AbstractC9622o0 q = m26335q();
        int i = R.drawable.baseline_folder_24;
        if (q == null) {
            this.f15982d0.m18624i0(!z ? R.drawable.baseline_insert_drive_file_24 : i);
            this.f15982d0.m18636c0(C4779t2.m25473m1(file.getName(), z2, false));
        } else if (z) {
            this.f15982d0.m18638b0(1711276032);
            this.f15982d0.m18624i0(R.drawable.baseline_folder_24);
        } else {
            this.f15982d0.m18638b0(1140850688);
        }
        this.f15982d0.m18602t0();
        this.f15982d0.m18616m0(this.f15984f0);
        this.f15982d0.m18594x0(z2);
    }

    public C4756s(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, View$OnClickListenerC8750f0.C8759h hVar, C9773p0.AbstractC9776c cVar) {
        super(aVar, q6Var, 7, Long.toString(hVar.m11495g()), null);
        File file = new File(hVar.m11493i());
        this.f15997s0 = hVar;
        this.f15979a0 = C5070i.m24061i(hVar.m11492j()) ? C4403w.m27869i1(R.string.UnknownTrack) : hVar.m11492j();
        this.f15980b0 = C5070i.m24061i(hVar.m11498d()) ? C4403w.m27869i1(R.string.AudioUnknownArtist) : hVar.m11498d();
        this.f15996r0 = true;
        this.f15984f0 = C4779t2.m25684G4(-1, Long.toString(hVar.m11495g()), file.getPath(), (int) file.length());
        if (hVar.m11491k()) {
            C6250i iVar = new C6250i(hVar.m11497e().toString());
            iVar.m20924c0();
            m26348R(new C9629p0(C1357a0.m37541i(50.0f), C1357a0.m37541i(50.0f) / 2, iVar));
        } else {
            m26348R(null);
        }
        C6883g1 g1Var = new C6883g1(aVar, q6Var, 16, false, 0L, 0L);
        this.f15982d0 = g1Var;
        g1Var.m18659M0(this.f15893T);
        this.f15982d0.m18669H0(this);
        this.f15982d0.m18602t0();
        this.f15982d0.m18624i0(R.drawable.baseline_play_arrow_36_white);
        if (m26335q() != null) {
            this.f15982d0.m18638b0(0);
        } else {
            this.f15982d0.m18636c0(R.id.theme_color_file);
        }
        String x0 = C7389v0.m16565x0(hVar.m11493i());
        TdApi.Message D4 = C4779t2.m25705D4(new TdApi.Audio((int) (hVar.m11496f() / 1000), hVar.m11492j(), hVar.m11498d(), x0, C7389v0.m16555z2(C7389v0.m16573v0(x0)), null, null, this.f15984f0));
        D4.f25406id = hVar.m11495g();
        this.f15982d0.m18679C0(D4, cVar);
    }

    public C4756s(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.Message message, TdApi.Document document) {
        super(aVar, q6Var, 9, null, null);
        this.f15979a0 = C5070i.m24061i(document.fileName) ? C5070i.m24061i(document.mimeType) ? C4403w.m27869i1(R.string.File) : "image/gif".equals(document.mimeType) ? "GIF File" : document.mimeType : document.fileName;
        this.f15980b0 = C1363c0.m37423m(document.document.size);
        this.f15984f0 = document.document;
        m26348R(AbstractC9622o0.m7982o(q6Var, message, null, C1357a0.m37541i(50.0f), C1357a0.m37541i(50.0f) / 2));
        C6883g1 g1Var = new C6883g1(aVar, q6Var, 8, m26335q() != null, message.chatId, message.f25406id);
        this.f15982d0 = g1Var;
        g1Var.m18659M0(this.f15893T);
        this.f15982d0.m18669H0(this);
        if (m26335q() == null) {
            this.f15982d0.m18620k0(document);
            this.f15982d0.m18636c0(C4779t2.m25466n1(document, false));
        } else {
            this.f15982d0.m18638b0(1140850688);
        }
        this.f15982d0.m18616m0(document.document);
        this.f15982d0.m18594x0(document.mimeType);
    }

    public C4756s(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.InlineQueryResultDocument inlineQueryResultDocument) {
        super(aVar, q6Var, 9, inlineQueryResultDocument.f25383id, inlineQueryResultDocument);
        this.f15979a0 = inlineQueryResultDocument.title.isEmpty() ? inlineQueryResultDocument.document.fileName : inlineQueryResultDocument.title;
        this.f15980b0 = inlineQueryResultDocument.description.isEmpty() ? C1363c0.m37423m(inlineQueryResultDocument.document.document.size) : C4403w.m27865j1(R.string.format_fileSizeAndDescription, C1363c0.m37423m(inlineQueryResultDocument.document.document.size), inlineQueryResultDocument.description);
        TdApi.Document document = inlineQueryResultDocument.document;
        this.f15984f0 = document.document;
        m26348R(AbstractC9622o0.m7985l(q6Var, document, C1357a0.m37541i(50.0f), C1357a0.m37541i(50.0f) / 2));
        C6883g1 g1Var = new C6883g1(this.f15900a, q6Var, 8, false, 0L, 0L);
        this.f15982d0 = g1Var;
        g1Var.m18659M0(this.f15893T);
        if (this.f15984f0 != null) {
            this.f15982d0.m18669H0(this);
        }
        this.f15982d0.m18590z0(R.drawable.baseline_insert_drive_file_24);
        if (m26335q() == null) {
            this.f15982d0.m18620k0(inlineQueryResultDocument.document);
            this.f15982d0.m18636c0(C4779t2.m25466n1(inlineQueryResultDocument.document, false));
        } else {
            this.f15982d0.m18638b0(1140850688);
        }
        this.f15982d0.m18616m0(inlineQueryResultDocument.document.document);
        this.f15982d0.m18594x0(inlineQueryResultDocument.document.mimeType);
    }
}
