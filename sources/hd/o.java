package hd;

import ae.j;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.e0;
import ce.y;
import eb.k;
import gb.g;
import gd.w;
import id.d;
import ie.f0;
import java.util.ArrayList;
import java.util.Iterator;
import ld.b;
import ne.i3;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import vc.n0;
import vd.o0;
import zd.o6;

public abstract class o<T> implements f0, g.a {
    public final T M;
    public final String N;
    public long O;
    public int P;
    public boolean Q;
    public int R = -1;
    public int S = -1;
    public final g T;
    public TdApi.Message U;
    public ArrayList<o<?>> V;
    public boolean W;
    public int X;
    public n0 Y;
    public k Z;
    public final org.thunderdog.challegram.a f13322a;
    public final o6 f13323b;
    public final int f13324c;

    public class a implements k.b {
        public a() {
        }

        @Override
        public void n4(int i10, float f10, float f11, k kVar) {
            o.this.z();
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
        }
    }

    public o(org.thunderdog.challegram.a aVar, o6 o6Var, int i10, String str, T t10) {
        this.f13322a = aVar;
        this.f13323b = o6Var;
        this.f13324c = i10;
        this.N = str;
        this.M = t10;
        g gVar = new g();
        this.T = gVar;
        gVar.r(this);
    }

    public static boolean A(int i10) {
        return i10 == 10 || i10 == 6;
    }

    public static boolean B(int i10) {
        return i10 == 11;
    }

    public static boolean C(int i10) {
        switch (i10) {
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

    private boolean F() {
        if (!C(this.f13324c)) {
            return false;
        }
        ArrayList<o<?>> arrayList = this.V;
        if (arrayList == null || arrayList.isEmpty()) {
            return this.W;
        }
        o<?> oVar = this.V.get(0);
        if (oVar.equals(this)) {
            return false;
        }
        if (oVar.v() == 15) {
            return this.V.size() > 1 && !this.V.get(1).equals(this);
        }
        return true;
    }

    public static o<?> W(org.thunderdog.challegram.a aVar, o6 o6Var, String str, TdApi.InlineQueryResult inlineQueryResult, o0.c cVar) {
        switch (inlineQueryResult.getConstructor()) {
            case TdApi.InlineQueryResultVoiceNote.CONSTRUCTOR:
                return new s(aVar, o6Var, (TdApi.InlineQueryResultVoiceNote) inlineQueryResult);
            case TdApi.InlineQueryResultSticker.CONSTRUCTOR:
                if (!d.z().A(str)) {
                    str = null;
                }
                return new a0(aVar, o6Var, str, (TdApi.InlineQueryResultSticker) inlineQueryResult);
            case TdApi.InlineQueryResultDocument.CONSTRUCTOR:
                TdApi.InlineQueryResultDocument inlineQueryResultDocument = (TdApi.InlineQueryResultDocument) inlineQueryResult;
                if (!e0.b(inlineQueryResultDocument.document.mimeType)) {
                    return new s(aVar, o6Var, inlineQueryResultDocument);
                }
                String str2 = inlineQueryResultDocument.f19923id;
                String str3 = inlineQueryResultDocument.title;
                String str4 = inlineQueryResultDocument.description;
                TdApi.Document document = inlineQueryResultDocument.document;
                return new s(aVar, o6Var, new TdApi.InlineQueryResultAudio(str2, new TdApi.Audio(0, str3, str4, document.fileName, document.mimeType, document.minithumbnail, document.thumbnail, document.document)), cVar);
            case TdApi.InlineQueryResultVideo.CONSTRUCTOR:
                return new s(aVar, o6Var, (TdApi.InlineQueryResultVideo) inlineQueryResult);
            case TdApi.InlineQueryResultContact.CONSTRUCTOR:
                return new s(aVar, o6Var, (TdApi.InlineQueryResultContact) inlineQueryResult);
            case TdApi.InlineQueryResultArticle.CONSTRUCTOR:
                return new y(aVar, o6Var, (TdApi.InlineQueryResultArticle) inlineQueryResult);
            case TdApi.InlineQueryResultLocation.CONSTRUCTOR:
                return new s(aVar, o6Var, (TdApi.InlineQueryResultLocation) inlineQueryResult);
            case TdApi.InlineQueryResultAudio.CONSTRUCTOR:
                return new s(aVar, o6Var, (TdApi.InlineQueryResultAudio) inlineQueryResult, cVar);
            case TdApi.InlineQueryResultVenue.CONSTRUCTOR:
                return new s(aVar, o6Var, (TdApi.InlineQueryResultVenue) inlineQueryResult);
            case TdApi.InlineQueryResultGame.CONSTRUCTOR:
                return new y(aVar, o6Var, (TdApi.InlineQueryResultGame) inlineQueryResult);
            case TdApi.InlineQueryResultPhoto.CONSTRUCTOR:
                return new z(aVar, o6Var, (TdApi.InlineQueryResultPhoto) inlineQueryResult);
            case TdApi.InlineQueryResultAnimation.CONSTRUCTOR:
                return new u(aVar, o6Var, (TdApi.InlineQueryResultAnimation) inlineQueryResult);
            default:
                return null;
        }
    }

    public static o<?> X(org.thunderdog.challegram.a aVar, o6 o6Var, TdApi.Message message) {
        int constructor = message.content.getConstructor();
        if (constructor == 276722716) {
            return new s(aVar, o6Var, message, (TdApi.MessageAudio) message.content, null).S(message);
        }
        if (constructor == 527777781) {
            return new s(aVar, o6Var, message, ((TdApi.MessageVoiceNote) message.content).voiceNote).S(message);
        }
        if (constructor != 596945783) {
            return null;
        }
        return new s(aVar, o6Var, message, ((TdApi.MessageDocument) message.content).document).S(message);
    }

    public static o<?> Y(org.thunderdog.challegram.a aVar, o6 o6Var, TdApi.PageBlock pageBlock, o0.c cVar) {
        int constructor = pageBlock.getConstructor();
        if (constructor == -63371245) {
            return new s(aVar, o6Var, (TdApi.PageBlockAudio) pageBlock, cVar);
        }
        if (constructor != 1823310463) {
            return null;
        }
        return new s(aVar, o6Var, (TdApi.PageBlockVoiceNote) pageBlock, w.i1(R.string.Audio));
    }

    public final void D(int i10, b bVar) {
        if (i10 > 0 && i10 != this.X) {
            this.X = i10;
            E(i10);
        }
    }

    public void E(int i10) {
    }

    public void G(Canvas canvas, b bVar, int i10, int i11, float f10, float f11, float f12, String str, i3 i3Var) {
    }

    public void H(View view, boolean z10) {
    }

    public boolean I(View view, MotionEvent motionEvent) {
        return false;
    }

    public final void J(int i10) {
        if (this.X == 0) {
            this.X = i10;
            E(i10);
        }
    }

    public CharSequence K(CharSequence charSequence, CharSequence charSequence2) {
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i10 = this.R;
            if (i10 > 0) {
                spannableStringBuilder.append(charSequence, 0, i10);
            }
            spannableStringBuilder.append(charSequence2);
            if (this.S < charSequence.length()) {
                spannableStringBuilder.append(charSequence, this.S, charSequence.length());
            }
            return spannableStringBuilder;
        }
        StringBuilder sb2 = new StringBuilder(charSequence2.length() + charSequence.length());
        int i11 = this.R;
        if (i11 > 0) {
            sb2.append(charSequence, 0, i11);
        }
        sb2.append(charSequence2);
        if (this.S < charSequence.length()) {
            sb2.append(charSequence, this.S, charSequence.length());
        }
        return sb2.toString();
    }

    public void L(b bVar, boolean z10) {
        bVar.d();
    }

    public final void M(b bVar) {
        L(bVar, false);
    }

    public final void N(ArrayList<o<?>> arrayList) {
        this.V = arrayList;
    }

    public final void O(int i10) {
        this.P = i10;
    }

    public void P(boolean z10) {
        this.Q = z10;
    }

    public void Q(boolean z10) {
        this.W = z10;
    }

    public final void R(n0 n0Var) {
        this.Y = n0Var;
    }

    public o<T> S(TdApi.Message message) {
        this.U = message;
        return this;
    }

    public final void T(long j10) {
        this.O = j10;
    }

    public o<T> U(int i10, int i11) {
        this.R = i10;
        this.S = i11;
        return this;
    }

    public o6 V() {
        return this.f13323b;
    }

    @Override
    public void a() {
        Iterator<View> it = this.T.n().iterator();
        while (it.hasNext()) {
            View next = it.next();
            if (next instanceof yc.a) {
                ((yc.a) next).x(this);
            } else if (next instanceof g.a) {
                ((g.a) next).a();
            }
        }
    }

    public final void b(View view) {
        if (this.T.j(view) && view != null) {
            if (view.getMeasuredHeight() != o()) {
                view.requestLayout();
            }
            H(view, true);
        }
    }

    public final T c() {
        return this.M;
    }

    @Override
    public final long d() {
        return this.O;
    }

    @Override
    public int f() {
        return this.P;
    }

    @Override
    public TdApi.Message getMessage() {
        return this.U;
    }

    public final void h(View view) {
        if (this.T.l(view) && view != null) {
            H(view, false);
        }
    }

    public final void i(yc.a aVar, Canvas canvas, b bVar, int i10, int i11, float f10, float f11, float f12, int i12, i3 i3Var) {
        int i13;
        if (F()) {
            int i14 = a0.i(72.0f);
            int max = Math.max(a0.i(0.5f), 1);
            float f13 = i14;
            float f14 = max;
            canvas.drawRect(0.0f, 0.0f, f13, f14, y.g(ib.d.d(j.u(), ib.d.c(j.u(), j.i()), f12)));
            canvas.drawRect(f13, 0.0f, i10, f14, y.g(j.M0()));
            i13 = max + 0;
        } else {
            i13 = 0;
        }
        k kVar = this.Z;
        if (kVar != null) {
            float o10 = kVar.o();
            if (o10 > 0.0f) {
                if (o10 == 1.0f && !this.Z.v()) {
                    this.Z.i(0.0f);
                }
                canvas.drawRect(0.0f, i13, i10, i11, y.g(ib.d.a(o10, 681615520)));
            }
        }
        int i15 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        if (i15 != 0) {
            canvas.drawRect(0.0f, i13, i10, i11, y.g(ib.d.a(f12, j.i())));
        }
        j(aVar, canvas, bVar, i10, i11, i13);
        if (i15 != 0) {
            G(canvas, bVar, i10, i11, f10, f11, f12, i12 != -1 ? Integer.toString(i12 + 1) : null, i3Var);
        }
    }

    public void j(yc.a aVar, Canvas canvas, b bVar, int i10, int i11, int i12) {
    }

    public int l() {
        return 100;
    }

    public int m() {
        return 100;
    }

    public int n() {
        return 0;
    }

    public final int o() {
        return s() + n();
    }

    public final String p() {
        return this.N;
    }

    public n0 q() {
        return this.Y;
    }

    public final long r() {
        return this.O;
    }

    public final int s() {
        if (F()) {
            return Math.max(1, a0.i(0.5f));
        }
        return 0;
    }

    public int t() {
        return this.S;
    }

    public int u() {
        return this.R;
    }

    public final int v() {
        return this.f13324c;
    }

    public final boolean w() {
        return this.T.g();
    }

    public boolean x() {
        return (this.R == -1 || this.S == -1) ? false : true;
    }

    public void y() {
        k kVar = this.Z;
        if (kVar == null) {
            k kVar2 = new k(0, new a(), db.b.f7287b, 400L, 1.0f);
            this.Z = kVar2;
            kVar2.F(2000L);
        } else {
            kVar.l(1.0f);
        }
        z();
    }

    public final void z() {
        this.T.invalidate();
    }
}
