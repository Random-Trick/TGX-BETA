package gd;

import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1369e0;
import be.C1410y;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import me.C6918i3;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3950k;
import p080fb.C4341g;
import p082fd.C4403w;
import p108hb.C5064d;
import p110hd.C5078d;
import p111he.AbstractC5113f0;
import p156kd.C6238b;
import p291uc.AbstractC9622o0;
import p292ud.C9773p0;
import p334xc.C10185a;
import p350yd.C10930q6;
import p364zd.C11524j;

public abstract class AbstractC4718o<T> implements AbstractC5113f0, C4341g.AbstractC4342a {
    public final T f15886M;
    public final String f15887N;
    public long f15888O;
    public int f15889P;
    public boolean f15890Q;
    public int f15891R = -1;
    public int f15892S = -1;
    public final C4341g f15893T;
    public TdApi.Message f15894U;
    public ArrayList<AbstractC4718o<?>> f15895V;
    public boolean f15896W;
    public int f15897X;
    public AbstractC9622o0 f15898Y;
    public C3950k f15899Z;
    public final AbstractView$OnTouchListenerC7889a f15900a;
    public final C10930q6 f15901b;
    public final int f15902c;

    public class C4719a implements C3950k.AbstractC3952b {
        public C4719a() {
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            AbstractC4718o.this.m26326z();
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
        }
    }

    public AbstractC4718o(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, int i, String str, T t) {
        this.f15900a = aVar;
        this.f15901b = q6Var;
        this.f15902c = i;
        this.f15887N = str;
        this.f15886M = t;
        C4341g gVar = new C4341g();
        this.f15893T = gVar;
        gVar.m28233r(this);
    }

    public static boolean m26359A(int i) {
        return i == 10 || i == 6;
    }

    public static boolean m26358B(int i) {
        return i == 11;
    }

    public static boolean m26357C(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
                return true;
            case 6:
            default:
                return false;
        }
    }

    private boolean m26355F() {
        if (!m26357C(this.f15902c)) {
            return false;
        }
        ArrayList<AbstractC4718o<?>> arrayList = this.f15895V;
        if (arrayList == null || arrayList.isEmpty()) {
            return this.f15896W;
        }
        AbstractC4718o<?> oVar = this.f15895V.get(0);
        if (oVar.equals(this)) {
            return false;
        }
        if (oVar.m26330v() == 15) {
            return this.f15895V.size() > 1 && !this.f15895V.get(1).equals(this);
        }
        return true;
    }

    public static AbstractC4718o<?> m26344W(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, String str, TdApi.InlineQueryResult inlineQueryResult, C9773p0.AbstractC9776c cVar) {
        switch (inlineQueryResult.getConstructor()) {
            case TdApi.InlineQueryResultVoiceNote.CONSTRUCTOR:
                return new C4756s(aVar, q6Var, (TdApi.InlineQueryResultVoiceNote) inlineQueryResult);
            case TdApi.InlineQueryResultSticker.CONSTRUCTOR:
                if (!C5078d.m23986z().m24032A(str)) {
                    str = null;
                }
                return new C4575a0(aVar, q6Var, str, (TdApi.InlineQueryResultSticker) inlineQueryResult);
            case TdApi.InlineQueryResultDocument.CONSTRUCTOR:
                TdApi.InlineQueryResultDocument inlineQueryResultDocument = (TdApi.InlineQueryResultDocument) inlineQueryResult;
                if (!C1369e0.m37397b(inlineQueryResultDocument.document.mimeType)) {
                    return new C4756s(aVar, q6Var, inlineQueryResultDocument);
                }
                String str2 = inlineQueryResultDocument.f25383id;
                String str3 = inlineQueryResultDocument.title;
                String str4 = inlineQueryResultDocument.description;
                TdApi.Document document = inlineQueryResultDocument.document;
                return new C4756s(aVar, q6Var, new TdApi.InlineQueryResultAudio(str2, new TdApi.Audio(0, str3, str4, document.fileName, document.mimeType, document.minithumbnail, document.thumbnail, document.document)), cVar);
            case TdApi.InlineQueryResultVideo.CONSTRUCTOR:
                return new C4756s(aVar, q6Var, (TdApi.InlineQueryResultVideo) inlineQueryResult);
            case TdApi.InlineQueryResultContact.CONSTRUCTOR:
                return new C4756s(aVar, q6Var, (TdApi.InlineQueryResultContact) inlineQueryResult);
            case TdApi.InlineQueryResultArticle.CONSTRUCTOR:
                return new C4836y(aVar, q6Var, (TdApi.InlineQueryResultArticle) inlineQueryResult);
            case TdApi.InlineQueryResultLocation.CONSTRUCTOR:
                return new C4756s(aVar, q6Var, (TdApi.InlineQueryResultLocation) inlineQueryResult);
            case TdApi.InlineQueryResultAudio.CONSTRUCTOR:
                return new C4756s(aVar, q6Var, (TdApi.InlineQueryResultAudio) inlineQueryResult, cVar);
            case TdApi.InlineQueryResultVenue.CONSTRUCTOR:
                return new C4756s(aVar, q6Var, (TdApi.InlineQueryResultVenue) inlineQueryResult);
            case TdApi.InlineQueryResultGame.CONSTRUCTOR:
                return new C4836y(aVar, q6Var, (TdApi.InlineQueryResultGame) inlineQueryResult);
            case TdApi.InlineQueryResultPhoto.CONSTRUCTOR:
                return new C4847z(aVar, q6Var, (TdApi.InlineQueryResultPhoto) inlineQueryResult);
            case TdApi.InlineQueryResultAnimation.CONSTRUCTOR:
                return new C4801u(aVar, q6Var, (TdApi.InlineQueryResultAnimation) inlineQueryResult);
            default:
                return null;
        }
    }

    public static AbstractC4718o<?> m26343X(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.Message message) {
        int constructor = message.content.getConstructor();
        if (constructor == 276722716) {
            return new C4756s(aVar, q6Var, message, (TdApi.MessageAudio) message.content, null).mo26268S(message);
        }
        if (constructor == 527777781) {
            return new C4756s(aVar, q6Var, message, ((TdApi.MessageVoiceNote) message.content).voiceNote).mo26268S(message);
        }
        if (constructor != 596945783) {
            return null;
        }
        return new C4756s(aVar, q6Var, message, ((TdApi.MessageDocument) message.content).document).mo26268S(message);
    }

    public static AbstractC4718o<?> m26342Y(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.PageBlock pageBlock, C9773p0.AbstractC9776c cVar) {
        int constructor = pageBlock.getConstructor();
        if (constructor == -63371245) {
            return new C4756s(aVar, q6Var, (TdApi.PageBlockAudio) pageBlock, cVar);
        }
        if (constructor != 1823310463) {
            return null;
        }
        return new C4756s(aVar, q6Var, (TdApi.PageBlockVoiceNote) pageBlock, C4403w.m27869i1(R.string.Audio));
    }

    public final void m26356D(int i, C6238b bVar) {
        if (i > 0 && i != this.f15897X) {
            this.f15897X = i;
            mo25116E(i);
        }
    }

    public void mo25116E(int i) {
    }

    public void mo25115G(Canvas canvas, C6238b bVar, int i, int i2, float f, float f2, float f3, String str, C6918i3 i3Var) {
    }

    public void mo26269H(View view, boolean z) {
    }

    public boolean mo25114I(View view, MotionEvent motionEvent) {
        return false;
    }

    public final void m26354J(int i) {
        if (this.f15897X == 0) {
            this.f15897X = i;
            mo25116E(i);
        }
    }

    public CharSequence m26353K(CharSequence charSequence, CharSequence charSequence2) {
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i = this.f15891R;
            if (i > 0) {
                spannableStringBuilder.append(charSequence, 0, i);
            }
            spannableStringBuilder.append(charSequence2);
            if (this.f15892S < charSequence.length()) {
                spannableStringBuilder.append(charSequence, this.f15892S, charSequence.length());
            }
            return spannableStringBuilder;
        }
        StringBuilder sb2 = new StringBuilder(charSequence2.length() + charSequence.length());
        int i2 = this.f15891R;
        if (i2 > 0) {
            sb2.append(charSequence, 0, i2);
        }
        sb2.append(charSequence2);
        if (this.f15892S < charSequence.length()) {
            sb2.append(charSequence, this.f15892S, charSequence.length());
        }
        return sb2.toString();
    }

    public void mo25113L(C6238b bVar, boolean z) {
        bVar.m20999d();
    }

    public final void m26352M(C6238b bVar) {
        mo25113L(bVar, false);
    }

    public final void m26351N(ArrayList<AbstractC4718o<?>> arrayList) {
        this.f15895V = arrayList;
    }

    public final void m26350O(int i) {
        this.f15889P = i;
    }

    public void mo25206P(boolean z) {
        this.f15890Q = z;
    }

    public void m26349Q(boolean z) {
        this.f15896W = z;
    }

    public final void m26348R(AbstractC9622o0 o0Var) {
        this.f15898Y = o0Var;
    }

    public AbstractC4718o<T> mo26268S(TdApi.Message message) {
        this.f15894U = message;
        return this;
    }

    public final void m26347T(long j) {
        this.f15888O = j;
    }

    public AbstractC4718o<T> m26346U(int i, int i2) {
        this.f15891R = i;
        this.f15892S = i2;
        return this;
    }

    public C10930q6 m26345V() {
        return this.f15901b;
    }

    @Override
    public void mo13519a() {
        List<Reference<View>> n = this.f15893T.m28237n();
        if (n != null) {
            for (Reference<View> reference : n) {
                View view = reference.get();
                if (view != null) {
                    if (view instanceof C10185a) {
                        ((C10185a) view).m5806v(this);
                    } else if (view instanceof C4341g.AbstractC4342a) {
                        ((C4341g.AbstractC4342a) view).mo13519a();
                    }
                }
            }
        }
    }

    public final void m26341c(View view) {
        if (this.f15893T.m28241j(view) && view != null) {
            if (view.getMeasuredHeight() != m26337o()) {
                view.requestLayout();
            }
            mo26269H(view, true);
        }
    }

    @Override
    public final long mo13513d() {
        return this.f15888O;
    }

    @Override
    public int mo13507g() {
        return this.f15889P;
    }

    @Override
    public TdApi.Message getMessage() {
        return this.f15894U;
    }

    public final T m26340h() {
        return this.f15886M;
    }

    public final void m26339i(View view) {
        if (this.f15893T.m28239l(view) && view != null) {
            mo26269H(view, false);
        }
    }

    public final void m26338j(C10185a aVar, Canvas canvas, C6238b bVar, int i, int i2, float f, float f2, float f3, int i3, C6918i3 i3Var) {
        int i4;
        if (m26355F()) {
            int i5 = C1357a0.m37541i(72.0f);
            int max = Math.max(C1357a0.m37541i(0.5f), 1);
            float f4 = i5;
            float f5 = max;
            canvas.drawRect(0.0f, 0.0f, f4, f5, C1410y.m37039g(C5064d.m24128d(C11524j.m148w(), C5064d.m24129c(C11524j.m148w(), C11524j.m178i()), f3)));
            canvas.drawRect(f4, 0.0f, i, f5, C1410y.m37039g(C11524j.m223P0()));
            i4 = max + 0;
        } else {
            i4 = 0;
        }
        C3950k kVar = this.f15899Z;
        if (kVar != null) {
            float o = kVar.m29538o();
            if (o > 0.0f) {
                if (o == 1.0f && !this.f15899Z.m29531v()) {
                    this.f15899Z.m29544i(0.0f);
                }
                canvas.drawRect(0.0f, i4, i, i2, C1410y.m37039g(C5064d.m24131a(o, 681615520)));
            }
        }
        int i6 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        if (i6 != 0) {
            canvas.drawRect(0.0f, i4, i, i2, C1410y.m37039g(C5064d.m24131a(f3, C11524j.m178i())));
        }
        mo25112k(aVar, canvas, bVar, i, i2, i4);
        if (i6 != 0) {
            mo25115G(canvas, bVar, i, i2, f, f2, f3, i3 != -1 ? Integer.toString(i3 + 1) : null, i3Var);
        }
    }

    public void mo25112k(C10185a aVar, Canvas canvas, C6238b bVar, int i, int i2, int i3) {
    }

    public int mo25048l() {
        return 100;
    }

    public int mo25047m() {
        return 100;
    }

    public int mo25111n() {
        return 0;
    }

    public final int m26337o() {
        return m26333s() + mo25111n();
    }

    public final String m26336p() {
        return this.f15887N;
    }

    public AbstractC9622o0 m26335q() {
        return this.f15898Y;
    }

    public final long m26334r() {
        return this.f15888O;
    }

    public final int m26333s() {
        if (m26355F()) {
            return Math.max(1, C1357a0.m37541i(0.5f));
        }
        return 0;
    }

    public int m26332t() {
        return this.f15892S;
    }

    public int m26331u() {
        return this.f15891R;
    }

    public final int m26330v() {
        return this.f15902c;
    }

    public final boolean m26329w() {
        return this.f15893T.mo28225g();
    }

    public boolean m26328x() {
        return (this.f15891R == -1 || this.f15892S == -1) ? false : true;
    }

    public void m26327y() {
        C3950k kVar = this.f15899Z;
        if (kVar == null) {
            C3950k kVar2 = new C3950k(0, new C4719a(), C2057b.f7280b, 400L, 1.0f);
            this.f15899Z = kVar2;
            kVar2.m29553F(2000L);
        } else {
            kVar.m29541l(1.0f);
        }
        m26326z();
    }

    public final void m26326z() {
        this.f15893T.invalidate();
    }
}
