package vc;

import ae.j;
import android.app.AlertDialog;
import android.content.ClipDescription;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.NoCopySpan;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.ImageSpan;
import android.text.style.SuggestionSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.LinearLayout;
import ce.a0;
import ce.c0;
import ce.j0;
import ce.p0;
import de.rh;
import e1.b;
import e1.c;
import gd.l;
import gd.w;
import hd.o;
import hd.p7;
import hd.r;
import hd.t;
import hd.t2;
import hd.v;
import ib.i;
import id.d;
import id.k;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import je.g;
import kd.u;
import ne.a2;
import ne.r1;
import ne.y1;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.c2;
import ud.f1;
import ud.v4;
import vc.x;
import zd.hj;
import zd.o6;
import zd.s1;
import zd.t1;

public class h0 extends a2 implements u.i, Runnable, x.j, Comparator<Object>, d.b, c2, t1.a, kb.c {
    public rh P;
    public boolean Q;
    public TextPaint R;
    public String S = "";
    public String T = "";
    public String U = "";
    public int V;
    public int W;
    public int f24965a0;
    public final int f24966b0;
    public final o6 f24967c0;
    public final u f24968d0;
    public e f24969e0;
    public boolean f24970f0;
    public f f24971g0;
    public CharSequence f24972h0;
    public boolean f24973i0;
    public boolean f24974j0;
    public Spannable f24975k0;
    public int f24976l0;
    public Object[] f24977m0;
    public CharSequence f24978n0;
    public float f24979o0;
    public int f24980p0;
    public InputConnection f24981q0;
    public AlertDialog f24982r0;
    public boolean f24983s0;
    public String f24984t0;
    public boolean f24985u0;
    public boolean f24986v0;
    public boolean f24987w0;
    public boolean f24988x0;

    public class a implements TextWatcher {
        public a() {
        }

        public final void a(Spannable spannable, int i10, int i11) {
            boolean z10;
            int i12 = i11 - i10;
            if (i12 > 0) {
                boolean z11 = false;
                int i13 = 0;
                while (true) {
                    if (i13 >= i12) {
                        z10 = true;
                        break;
                    }
                    int codePointAt = Character.codePointAt(spannable, i10 + i13);
                    if (!Character.isLetterOrDigit(codePointAt) && !Character.isWhitespace(codePointAt) && !g.R0(codePointAt)) {
                        z10 = false;
                        break;
                    }
                    i13 += Character.charCount(codePointAt);
                }
                if (z10) {
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(i10, i12 + i10, CharacterStyle.class);
                    if (characterStyleArr != null && characterStyleArr.length > 0) {
                        int length = characterStyleArr.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length) {
                                break;
                            } else if (h0.B0(spannable, characterStyleArr[i14])) {
                                z11 = true;
                                break;
                            } else {
                                i14++;
                            }
                        }
                    }
                    if (!z11) {
                        return;
                    }
                }
                spannable.setSpan(new d(), i10, i11, 33);
            }
        }

        @Override
        public void afterTextChanged(Editable editable) {
            if (!h0.this.f24974j0 && !h0.this.f24983s0) {
                if (h0.this.Q) {
                    h0.this.f24974j0 = true;
                    b(editable);
                    h0.this.f24974j0 = false;
                    h0.this.Q = false;
                } else if (editable.length() > 0) {
                    h0.this.f24974j0 = true;
                    h0.this.f24975k0 = editable;
                    b(editable);
                    if (h0.this.P != null) {
                        h0.this.P.Fr(editable, true);
                    }
                    if (h0.this.o0()) {
                        h0 h0Var = h0.this;
                        h0Var.post(h0Var);
                    }
                    h0.this.f24974j0 = false;
                } else if (h0.this.P != null) {
                    h0.this.P.Fr("", true);
                }
            }
        }

        public final void b(Editable editable) {
            CharacterStyle[] characterStyleArr;
            Object[] objArr = (d[]) editable.getSpans(0, editable.length(), d.class);
            if (!(objArr == null || objArr.length == 0)) {
                h0.this.f24975k0 = editable;
                ArrayList arrayList = null;
                for (Object obj : objArr) {
                    int spanStart = editable.getSpanStart(obj);
                    int spanEnd = editable.getSpanEnd(obj);
                    editable.removeSpan(obj);
                    if (!(spanStart == -1 || spanEnd == -1)) {
                        CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) editable.getSpans(spanStart, spanEnd, CharacterStyle.class);
                        if (characterStyleArr2 != null && characterStyleArr2.length > 0) {
                            int length = characterStyleArr2.length;
                            int i10 = 0;
                            while (i10 < length) {
                                CharacterStyle characterStyle = characterStyleArr2[i10];
                                if (characterStyle instanceof ImageSpan) {
                                    int spanStart2 = editable.getSpanStart(characterStyle);
                                    int spanEnd2 = editable.getSpanEnd(characterStyle);
                                    characterStyleArr = characterStyleArr2;
                                    k E = id.d.z().E(h0.q0(((ImageSpan) characterStyle).getSource()), null);
                                    if (E != null) {
                                        editable.removeSpan(characterStyle);
                                        editable.setSpan(E, spanStart2, spanEnd2, 33);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(E);
                                    } else if (spanEnd2 > spanStart2) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(characterStyle);
                                    }
                                    i10++;
                                    characterStyleArr2 = characterStyleArr;
                                } else {
                                    characterStyleArr = characterStyleArr2;
                                }
                                if (h0.B0(editable, characterStyle)) {
                                    editable.removeSpan(characterStyle);
                                }
                                i10++;
                                characterStyleArr2 = characterStyleArr;
                            }
                        }
                        ArrayList arrayList2 = arrayList;
                        id.d.z().K(editable, spanStart, spanEnd, null, h0.this);
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            Collections.sort(arrayList2, h0.this);
                            int selectionStart = h0.this.getSelectionStart();
                            int selectionEnd = h0.this.getSelectionEnd();
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                Object obj2 = arrayList2.get(size);
                                int spanStart3 = editable.getSpanStart(obj2);
                                int spanEnd3 = editable.getSpanEnd(obj2);
                                if (!(spanStart3 == -1 || spanEnd3 == -1)) {
                                    int i11 = spanEnd3 - spanStart3;
                                    if (obj2 instanceof k) {
                                        String charSequence = ((k) obj2).a().toString();
                                        editable.replace(spanStart3, spanEnd3, charSequence);
                                        int length2 = charSequence.length();
                                        if (length2 != i11) {
                                            int i12 = length2 - i11;
                                            if (selectionStart >= spanStart3) {
                                                selectionStart += i12;
                                            }
                                            if (selectionEnd >= spanStart3) {
                                                selectionEnd += i12;
                                            }
                                        }
                                    } else {
                                        editable.delete(spanStart3, spanEnd3);
                                        if (selectionStart >= spanStart3) {
                                            selectionStart -= i11;
                                        }
                                        if (selectionEnd >= spanStart3) {
                                            selectionEnd -= i11;
                                        }
                                    }
                                }
                            }
                            if (!(selectionStart == -1 || selectionEnd == -1)) {
                                int length3 = editable.length();
                                if (selectionStart >= selectionEnd) {
                                    p0.f0(h0.this, Math.min(selectionStart, length3));
                                } else {
                                    p0.g0(h0.this, Math.min(selectionStart, length3), Math.max(selectionEnd, length3));
                                }
                            }
                            arrayList2.clear();
                        }
                        arrayList = arrayList2;
                    }
                }
            }
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (h0.this.f24983s0) {
                h0.this.f24972h0 = charSequence;
                return;
            }
            h0.this.r0(charSequence);
            if (i12 > 0 && (charSequence instanceof Spannable)) {
                Spannable spannable = (Spannable) charSequence;
                int i13 = i12 + i10;
                k[] kVarArr = (k[]) spannable.getSpans(i10, i13, k.class);
                if (kVarArr != null && kVarArr.length > 0) {
                    int length = kVarArr.length;
                    int i14 = 0;
                    while (i14 < length) {
                        k kVar = kVarArr[i14];
                        int spanStart = spannable.getSpanStart(kVar);
                        int spanEnd = spannable.getSpanEnd(kVar);
                        if (i10 < spanStart) {
                            a(spannable, i10, spanStart);
                        }
                        i14++;
                        i10 = spanEnd;
                    }
                }
                if (i10 < i13) {
                    a(spannable, i10, i13);
                }
            }
        }
    }

    public class b implements ActionMode.Callback {
        public b() {
        }

        @Override
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return h0.this.z0(menuItem.getItemId());
        }

        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            TdApi.TextEntityType textEntityType;
            int i10;
            MenuInflater menuInflater = actionMode.getMenuInflater();
            if (menuInflater == null) {
                return true;
            }
            menuInflater.inflate(R.menu.text, menu);
            for (int i11 = 0; i11 < menu.size(); i11++) {
                try {
                    MenuItem item = menu.getItem(i11);
                    switch (item.getItemId()) {
                        case R.id.btn_bold:
                            i10 = R.string.TextFormatBold;
                            textEntityType = new TdApi.TextEntityTypeBold();
                            break;
                        case R.id.btn_italic:
                            i10 = R.string.TextFormatItalic;
                            textEntityType = new TdApi.TextEntityTypeItalic();
                            break;
                        case R.id.btn_link:
                            i10 = R.string.TextFormatLink;
                            textEntityType = null;
                            break;
                        case R.id.btn_monospace:
                            i10 = R.string.TextFormatMonospace;
                            textEntityType = new TdApi.TextEntityTypeCode();
                            break;
                        case R.id.btn_spoiler:
                            i10 = R.string.TextFormatSpoiler;
                            textEntityType = new TdApi.TextEntityTypeSpoiler();
                            break;
                        case R.id.btn_strikethrough:
                            i10 = R.string.TextFormatStrikethrough;
                            textEntityType = new TdApi.TextEntityTypeStrikethrough();
                            break;
                        case R.id.btn_underline:
                            i10 = R.string.TextFormatUnderline;
                            textEntityType = new TdApi.TextEntityTypeUnderline();
                            break;
                        default:
                            continue;
                    }
                    item.setTitle(textEntityType != null ? w.d3(w.i1(i10), w.L(textEntityType)) : w.i1(i10));
                } catch (Throwable unused) {
                }
            }
            if (g.O0(h0.this.getText().toString(), h0.this.getSelectionStart(), h0.this.getSelectionEnd())) {
                menu.removeItem(R.id.btn_monospace);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                menu.removeItem(16908341);
            }
            return true;
        }

        @Override
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    public class c implements f1.a {
        public c() {
        }

        @Override
        public void a(int i10) {
            if (h0.this.f24976l0 != 0) {
                h0 h0Var = h0.this;
                h0Var.w0(h0Var.f24976l0, h0.this.f24977m0);
            }
        }

        @Override
        public int b() {
            return h0.this.f24976l0;
        }
    }

    public static class d implements NoCopySpan {
        public d() {
        }
    }

    public interface e {
        void T(h0 h0Var, ArrayList<o<?>> arrayList, boolean z10);

        void W6(h0 h0Var, ArrayList<o<?>> arrayList);

        void X5(h0 h0Var, String str);

        TdApi.Chat b0(h0 h0Var);

        boolean b1(h0 h0Var);

        long w5(h0 h0Var);

        long y(h0 h0Var);
    }

    public interface f {
        void a(h0 h0Var);
    }

    public h0(Context context, o6 o6Var) {
        super(context);
        this.f24967c0 = o6Var;
        this.f24968d0 = new u(j0.r(context), o6Var, this);
        TextPaint textPaint = new TextPaint(5);
        this.R = textPaint;
        textPaint.setColor(j.U0());
        this.R.setTypeface(ce.o.k());
        this.R.setTextSize(a0.C(18.0f));
        setGravity(w.F1() | 48);
        setTypeface(ce.o.k());
        setTextSize(2, 18.0f);
        int i10 = a0.i(12.0f);
        this.f24966b0 = i10;
        int i11 = a0.i(60.0f);
        this.f24965a0 = i11;
        setPadding(i11, i10, a0.i(55.0f), i10);
        setImeOptions(268435456);
        setInputType(getInputType() | Log.TAG_VIDEO | Log.TAG_CONTACT);
        setSingleLine(false);
        setMaxLines(8);
        setMinimumHeight(a0.i(49.0f));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        p0.l(this);
        addTextChangedListener(new a());
        setCustomSelectionActionModeCallback(new b());
        t1.b().a(this);
    }

    public static boolean B0(Spanned spanned, CharacterStyle characterStyle) {
        return !e0(spanned, characterStyle) && !(characterStyle instanceof SuggestionSpan) && (spanned.getSpanFlags(characterStyle) & Log.TAG_CRASH) == 0;
    }

    public static String b0(String str, int i10) {
        int length = i10 - (str.length() % i10);
        if (length == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + length);
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append('0');
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static boolean e0(Spanned spanned, CharacterStyle characterStyle) {
        if ((characterStyle instanceof NoCopySpan) || (characterStyle instanceof k) || (characterStyle instanceof UnderlineSpan)) {
            return true;
        }
        if (!t2.J(characterStyle)) {
            return false;
        }
        if (characterStyle instanceof URLSpan) {
            String charSequence = spanned.subSequence(spanned.getSpanStart(characterStyle), spanned.getSpanEnd(characterStyle)).toString();
            String url = ((URLSpan) characterStyle).getURL();
            if (charSequence.equals(url)) {
                return false;
            }
            return !c0.Q(charSequence) || c0.K(url, charSequence);
        }
        return true;
    }

    public void f0(long j10, long j11, long j12, boolean z10, TdApi.InputMessageContent inputMessageContent, boolean z11, TdApi.MessageSchedulingState messageSchedulingState, boolean z12) {
        TdApi.MessageSchedulingState messageSchedulingState2;
        boolean z13;
        o6 o6Var = this.f24967c0;
        if (z11 || z10) {
            z13 = true;
            messageSchedulingState2 = messageSchedulingState;
        } else {
            messageSchedulingState2 = messageSchedulingState;
            z13 = false;
        }
        o6Var.wb(j10, j11, j12, new TdApi.MessageSendOptions(z13, false, false, messageSchedulingState2), inputMessageContent, null);
    }

    public void g0(final long j10, final long j11, final long j12, final boolean z10, final TdApi.InputMessageContent inputMessageContent) {
        this.f24967c0.hd().L8(this.P, j10, false, new hj.o() {
            @Override
            public final void a(boolean z11, TdApi.MessageSchedulingState messageSchedulingState, boolean z12) {
                h0.this.f0(j10, j11, j12, z10, inputMessageContent, z11, messageSchedulingState, z12);
            }
        }, null);
    }

    public void h0(Uri uri, int i10, final long j10, long j11, boolean z10, final long j12, final long j13, final boolean z11) {
        boolean z12;
        TdApi.InputMessageContent inputMessageContent;
        try {
            InputStream openInputStream = j0.q().getContentResolver().openInputStream(uri);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(openInputStream, null, options);
            int i11 = options.outWidth;
            int i12 = options.outHeight;
            if (openInputStream != null) {
                openInputStream.close();
            }
            if (i11 == 0 || i12 == 0) {
                Log.e("Unknown image bounds, aborting", new Object[0]);
                return;
            }
            String uri2 = uri.toString();
            if (i10 == 3) {
                try {
                    InputStream openInputStream2 = j0.q().getContentResolver().openInputStream(uri);
                    z12 = v0.e1(openInputStream2);
                    if (openInputStream2 != null) {
                        openInputStream2.close();
                    }
                } catch (Throwable th) {
                    Log.e("Unable to read GIF", th, new Object[0]);
                    z12 = false;
                }
            } else {
                z12 = true;
            }
            boolean j14 = ob.a.j(j10);
            if (i10 == 3 && z12) {
                inputMessageContent = this.f24967c0.l5().B(new TdApi.InputMessageAnimation(t2.I4(null, uri2, 0, j11), null, null, 0, i11, i12, null), j14);
            } else if (i10 == 4 || (i10 != 1 && !uri2.contains("sticker") && Math.max(i11, i12) > 512)) {
                inputMessageContent = this.f24967c0.l5().B(new TdApi.InputMessagePhoto(jd.c.x(uri2, 0, j11, false, 0), null, null, i11, i12, null, 0), j14);
            } else {
                inputMessageContent = this.f24967c0.l5().B(new TdApi.InputMessageSticker(jd.c.x(uri2, 0, j11, true, Log.TAG_GIF_LOADER), null, i11, i12, null), j14);
            }
            final TdApi.InputMessageContent inputMessageContent2 = inputMessageContent;
            if (z10) {
                this.f24967c0.hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        h0.this.g0(j10, j12, j13, z11, inputMessageContent2);
                    }
                });
            } else {
                this.f24967c0.xb(j10, j12, j13, z11, false, inputMessageContent2);
            }
        } catch (Throwable th2) {
            Log.e("Unable to read image", th2, new Object[0]);
        }
    }

    public boolean i0(e1.c cVar, int i10, Bundle bundle) {
        final int i11;
        rh rhVar = this.P;
        if (rhVar != null && rhVar.Ek()) {
            ClipDescription b10 = cVar.b();
            if (b10.hasMimeType("image/webp")) {
                i11 = 1;
            } else if (b10.hasMimeType("image/png")) {
                i11 = 2;
            } else if (b10.hasMimeType("image/gif")) {
                i11 = 3;
            } else if (b10.hasMimeType("image/jpeg")) {
                i11 = 4;
            }
            if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
                try {
                    cVar.c();
                } catch (Throwable unused) {
                    return false;
                }
            }
            final Uri a10 = cVar.a();
            final long currentTimeMillis = System.currentTimeMillis();
            final long C9 = this.P.C9();
            final long qk = this.P.qk();
            final long ko = this.P.ko();
            final boolean lo = this.P.lo();
            final boolean ui = this.P.ui();
            l.a().b(new Runnable() {
                @Override
                public final void run() {
                    h0.this.h0(a10, i11, C9, currentTimeMillis, ui, qk, ko, lo);
                }
            });
            return true;
        }
        return false;
    }

    public boolean j0(URLSpan uRLSpan, int i10, int i11, y1 y1Var, String str) {
        if (i.i(str)) {
            if (uRLSpan != null) {
                getText().removeSpan(uRLSpan);
                this.f24968d0.V();
            }
            return true;
        } else if (!c0.Q(str)) {
            return false;
        } else {
            y0(i10, i11, new TdApi.TextEntityTypeTextUrl(str));
            return true;
        }
    }

    public void k0(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
        this.P.Kp(true, z10, messageSchedulingState);
    }

    public void l0(DialogInterface dialogInterface, int i10) {
        this.f24982r0 = null;
        he.i.c2().u2(2L);
        he.i.c2().N5(true);
        this.f24968d0.V();
    }

    public void m0(DialogInterface dialogInterface, int i10) {
        this.f24982r0 = null;
        he.i.c2().u2(2L);
        he.i.c2().N5(false);
        this.f24968d0.V();
    }

    public static String q0(String str) {
        String str2;
        if (i.i(str)) {
            return null;
        }
        int i10 = -1;
        if (str.indexOf("twimg.com/emoji/v2/") != -1) {
            int lastIndexOf = str.lastIndexOf(47);
            int lastIndexOf2 = str.lastIndexOf(46);
            if (lastIndexOf2 <= lastIndexOf) {
                lastIndexOf2 = -1;
            }
            if (lastIndexOf2 != -1) {
                str2 = str.substring(lastIndexOf + 1, lastIndexOf2);
            } else {
                str2 = str.substring(lastIndexOf + 1);
            }
            return id.d.G(b0(str2, 8), "UTF-32BE");
        }
        int indexOf = str.indexOf("vk.com/images/emoji/");
        if (indexOf != -1) {
            int i11 = indexOf + 20;
            int length = str.length();
            if (str.endsWith("_2x.png")) {
                i10 = length - 7;
            } else if (str.endsWith(".png")) {
                i10 = length - 4;
            }
            if (i11 < i10) {
                return id.d.G(b0(str.substring(i11, i10), 8), "UTF-16");
            }
        }
        return null;
    }

    private void setAllowsAnyGravity(boolean z10) {
        if (this.f24973i0 != z10) {
            this.f24973i0 = z10;
            int i10 = 48;
            if (!z10) {
                i10 = 48 | w.F1();
            }
            setGravity(i10);
        }
    }

    public final void A0(String str, String str2) {
        if (!this.S.equals(str2) || !this.T.equals(str)) {
            this.S = str2;
            this.T = str;
            int i10 = 0;
            this.V = str.length() > 0 ? (int) v0.T1(this.T, this.R) : 0;
            if (str2.length() > 0) {
                i10 = (int) v0.T1(this.S, this.R);
            }
            this.W = i10;
            n0();
            invalidate();
        }
    }

    public boolean C0() {
        return this.f24985u0;
    }

    public void D0(TdApi.Chat chat, p7 p7Var, boolean z10) {
        int i10;
        int i11;
        int i12 = R.string.Message;
        if (chat == null) {
            w0(R.string.Message, new Object[0]);
            return;
        }
        Object[] objArr = null;
        TdApi.ChatMemberStatus O3 = this.f24967c0.O3(chat.f19908id);
        if (this.f24967c0.O6(chat.f19908id)) {
            i10 = z10 ? R.string.ChannelSilentBroadcast : R.string.ChannelBroadcast;
        } else if (!this.f24967c0.c7(chat) || !ob.e.Y0(O3)) {
            TdApi.MessageSender messageSender = chat.messageSenderId;
            if (messageSender == null || this.f24967c0.n7(messageSender)) {
                if (p7Var != null) {
                    i12 = p7Var.a() ? R.string.Comment : R.string.MessageReply;
                }
                i10 = i12;
            } else {
                if (p7Var != null) {
                    i11 = p7Var.a() ? R.string.CommentAsX : R.string.MessageReplyAsX;
                } else {
                    i11 = R.string.MessageAsX;
                }
                objArr = new Object[]{this.f24967c0.Cb(chat.messageSenderId)};
                i10 = i11;
            }
        } else if (p7Var != null) {
            i10 = p7Var.a() ? R.string.CommentAnonymously : R.string.MessageReplyAnonymously;
        } else {
            i10 = R.string.MessageAnonymously;
        }
        w0(i10, objArr);
    }

    @Override
    public void Q2() {
        t1.b().d(this);
    }

    public boolean V() {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        return selectionStart >= 0 && selectionEnd > selectionStart && selectionEnd <= getText().length();
    }

    public void W() {
        int max;
        if (this.f24976l0 != 0 && this.P != null && this.f24980p0 != (max = Math.max(0, (getMeasuredWidth() - this.P.jk()) - getPaddingLeft()))) {
            this.f24980p0 = max;
            float f10 = max;
            if (this.f24979o0 <= f10) {
                setHint(this.f24978n0);
            } else {
                setHint(TextUtils.ellipsize(this.f24978n0, getPaint(), f10, TextUtils.TruncateAt.END));
            }
        }
    }

    public final void X(String str) {
        int i10 = 0;
        String substring = str.substring(0, this.T.length());
        if (!substring.equals(this.T)) {
            this.T = substring;
            if (substring.length() > 0) {
                i10 = (int) v0.T1(this.T, this.R);
            }
            this.V = i10;
            n0();
        }
    }

    public final InputConnection Y(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (c0()) {
            return onCreateInputConnection;
        }
        r1.b(editorInfo, new String[]{"image/webp", "image/png", "image/gif", "image/jpeg", "image/*"});
        if (onCreateInputConnection == null) {
            return null;
        }
        return r1.a(onCreateInputConnection, editorInfo, new b.c() {
            @Override
            public final boolean a(c cVar, int i10, Bundle bundle) {
                boolean i02;
                i02 = h0.this.i0(cVar, i10, bundle);
                return i02;
            }
        });
    }

    public void Z(final URLSpan uRLSpan, final int i10, final int i11) {
        if (i10 >= 0 && i11 >= 0 && i10 <= getText().length() && i11 <= getText().length()) {
            v4 v4Var = this.P;
            if (v4Var == null) {
                e eVar = this.f24969e0;
                if (eVar instanceof v4) {
                    v4Var = (v4) eVar;
                }
            }
            v4 v4Var2 = v4Var;
            if (v4Var2 != null) {
                v4Var2.Pc(w.i1(R.string.CreateLink), w.i1(R.string.URL), R.string.CreateLinkDone, R.string.CreateLinkCancel, uRLSpan != null ? uRLSpan.getURL() : null, new v4.m() {
                    @Override
                    public final boolean a(y1 y1Var, String str) {
                        boolean j02;
                        j02 = h0.this.j0(uRLSpan, i10, i11, y1Var, str);
                        return j02;
                    }
                }, false);
            }
        }
    }

    @Override
    public TdApi.WebPage a(TdApi.FormattedText formattedText) {
        rh rhVar = this.P;
        if (rhVar != null) {
            return rhVar.fk(formattedText);
        }
        return null;
    }

    public final void a0() {
        if (this.f24988x0) {
            try {
                super.setEnabled(false);
            } catch (Throwable th) {
                Log.w(th);
            }
            try {
                super.setEnabled(this.f24988x0);
            } catch (Throwable th2) {
                Log.w(th2);
            }
        }
    }

    @Override
    public void b(ArrayList<o<?>> arrayList, boolean z10) {
        e eVar = this.f24969e0;
        if (eVar == null || !eVar.b1(this)) {
            ((org.thunderdog.challegram.a) getContext()).z3(this.P, this.f24967c0, arrayList, z10, this.f24968d0);
        } else {
            this.f24969e0.T(this, arrayList, z10);
        }
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    @Override
    public boolean c() {
        return !c0() && this.f24967c0.k2(this.P.Wj());
    }

    public final boolean c0() {
        rh rhVar = this.P;
        return rhVar == null || rhVar.bl();
    }

    @Override
    public int compare(Object obj, Object obj2) {
        return Integer.compare(this.f24975k0.getSpanStart(obj), this.f24975k0.getSpanStart(obj2));
    }

    @Override
    public final TdApi.FormattedText d(boolean z10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        BaseInputConnection.removeComposingSpans(spannableStringBuilder);
        TdApi.FormattedText formattedText = new TdApi.FormattedText(spannableStringBuilder.toString(), t2.x5(spannableStringBuilder, false));
        if (z10) {
            ob.e.m1(formattedText);
        }
        return formattedText;
    }

    public boolean d0() {
        return getInput().trim().isEmpty();
    }

    @Override
    public long e() {
        rh rhVar = this.P;
        if (rhVar != null) {
            return rhVar.Xj();
        }
        e eVar = this.f24969e0;
        if (eVar == null || !eVar.b1(this)) {
            return 0L;
        }
        return this.f24969e0.w5(this);
    }

    @Override
    public void e2() {
        Editable text = getText();
        if (!(text == null || text.length() == 0)) {
            k[] kVarArr = (k[]) text.getSpans(0, text.length(), k.class);
            if (!(kVarArr == null || kVarArr.length == 0)) {
                for (k kVar : kVarArr) {
                    if (kVar.c()) {
                        int spanStart = text.getSpanStart(kVar);
                        int spanEnd = text.getSpanEnd(kVar);
                        text.removeSpan(kVar);
                        text.setSpan(kVar, spanStart, spanEnd, 33);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public boolean f(CharSequence charSequence, CharSequence charSequence2, id.i iVar, int i10, int i11) {
        k E = id.d.z().E(charSequence2, iVar);
        if (E == null) {
            return true;
        }
        this.f24975k0.setSpan(E, i10, i11 + i10, 33);
        return true;
    }

    @Override
    public void g(boolean z10, boolean z11) {
        rh rhVar = this.P;
        if (rhVar != null) {
            rhVar.zk().g(z10, z11);
        }
    }

    public u getInlineSearchContext() {
        return this.f24968d0;
    }

    public String getInput() {
        String obj = getText().toString();
        return (this.S.length() == 0 || this.T.length() == 0 || !obj.endsWith(this.S)) ? obj : obj.substring(0, obj.lastIndexOf(this.S));
    }

    public Paint getPlaceholderPaint() {
        return this.R;
    }

    @Override
    public void h(ArrayList<o<?>> arrayList) {
        e eVar = this.f24969e0;
        if (eVar == null || !eVar.b1(this)) {
            ((org.thunderdog.challegram.a) getContext()).U(this.P, arrayList, this.f24968d0);
        } else {
            this.f24969e0.W6(this, arrayList);
        }
    }

    @Override
    public void i(r rVar, boolean z10) {
        String str;
        StringBuilder sb2;
        rh rhVar = this.P;
        if (rhVar != null) {
            TdApi.Chat Wj = rhVar.Wj();
            if (z10) {
                if ((Wj == null || !ob.a.l(ob.a.q(Wj.f19908id))) && rVar.b0() != null) {
                    sb2 = new StringBuilder();
                    sb2.append(rVar.a0());
                    sb2.append('@');
                    str = rVar.b0();
                } else {
                    sb2 = new StringBuilder();
                    str = rVar.a0();
                }
                sb2.append(str);
                sb2.append(' ');
                v0(sb2.toString(), true);
                return;
            }
            this.P.rp(rVar);
        }
    }

    @Override
    public void invalidate() {
        super.invalidate();
    }

    @Override
    public boolean j() {
        return !c0() && this.f24967c0.L2(this.P.Wj());
    }

    @Override
    public void k(t tVar) {
        String Z = tVar.Z();
        if (Z != null && tVar.x()) {
            Editable text = getText();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
            if (!(text.length() == tVar.t() && tVar.u() == 0)) {
                Z = Z + " ";
            }
            try {
                text.replace(tVar.u(), tVar.t(), Z);
            } catch (Throwable unused) {
            }
            try {
                v0(tVar.K(spannableStringBuilder, Z), false);
                p0.f0(this, tVar.u() + Z.length());
            } catch (Throwable unused2) {
            }
        }
    }

    @Override
    public void l(hd.x xVar, String str) {
        String str2;
        boolean z10 = !i.i(str) || xVar.f0();
        if (i.i(str)) {
            str = xVar.b0(false);
        }
        if (str != null && xVar.t() != -1 && xVar.u() != -1) {
            Editable text = getText();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
            if (z10) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str + " ");
                spannableStringBuilder2.setSpan(t2.I5(new TdApi.TextEntityTypeMentionName(xVar.c0().f19979id)), 0, str.length(), 33);
                str2 = spannableStringBuilder2;
            } else {
                str2 = str + " ";
            }
            try {
                text.replace(xVar.u(), Math.min(text.length(), xVar.t()), str2);
            } catch (Throwable unused) {
            }
            try {
                v0(xVar.K(spannableStringBuilder, str2), false);
                p0.f0(this, xVar.u() + str2.length());
            } catch (Throwable unused2) {
            }
        }
    }

    @Override
    public TdApi.Chat m() {
        rh rhVar = this.P;
        if (rhVar != null) {
            return rhVar.Wj();
        }
        e eVar = this.f24969e0;
        if (eVar == null || !eVar.b1(this)) {
            return null;
        }
        return this.f24969e0.b0(this);
    }

    @Override
    public void n() {
        rh rhVar = this.P;
        if (rhVar != null) {
            rhVar.Nk();
        }
        e eVar = this.f24969e0;
        if (eVar == null || !eVar.b1(this)) {
            ((org.thunderdog.challegram.a) getContext()).z3(this.P, this.f24967c0, null, false, null);
        } else {
            this.f24969e0.T(this, null, false);
        }
    }

    public final void n0() {
        int measuredWidth;
        this.U = this.S;
        if (this.W > 0 && this.W > (measuredWidth = (getMeasuredWidth() - this.V) - a0.i(110.0f))) {
            this.U = (String) TextUtils.ellipsize(this.S, this.R, measuredWidth, TextUtils.TruncateAt.END);
        }
    }

    @Override
    public long o() {
        rh rhVar = this.P;
        if (rhVar != null) {
            return rhVar.C9();
        }
        e eVar = this.f24969e0;
        if (eVar == null || !eVar.b1(this)) {
            return 0L;
        }
        return this.f24969e0.y(this);
    }

    public final boolean o0() {
        rh rhVar;
        return he.i.c2().T2() && !this.f24987w0 && (rhVar = this.P) != null && rhVar.Vk();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a0();
    }

    @Override
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection Y = Y(editorInfo);
        if (Y == null || (Y instanceof id.j)) {
            this.f24981q0 = Y;
            return Y;
        }
        id.j jVar = new id.j(this, Y);
        this.f24981q0 = jVar;
        return jVar;
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.U.length() > 0 && this.T.length() > 0 && getLineCount() == 1) {
            String obj = getText().toString();
            if (obj.toLowerCase().equals(this.T.toLowerCase())) {
                X(obj);
                canvas.drawText(this.U, this.f24965a0 + this.V, getBaseline(), this.R);
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        W();
        n0();
    }

    @Override
    public void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        u uVar = this.f24968d0;
        if (uVar != null) {
            if (i10 != i11) {
                i10 = -1;
            }
            uVar.m0(i10);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            Log.e("System bug", th, new Object[0]);
            return false;
        }
    }

    @Override
    public void p(o<?> oVar) {
        rh rhVar = this.P;
        if (rhVar != null) {
            rhVar.zp(oVar.r(), oVar.p(), true, true, false, null);
        }
    }

    public void p0(String str) {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        int length = str.length() + selectionStart;
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(id.d.z().E(str, null), 0, spannableString.length(), 33);
        if (selectionStart == selectionEnd) {
            getText().insert(selectionStart, spannableString);
        } else {
            getText().replace(selectionStart, selectionEnd, spannableString);
        }
        p0.f0(this, length);
    }

    @Override
    public void q(v vVar) {
        String c10 = vVar.c();
        if (c10 != null && vVar.x()) {
            Editable text = getText();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
            String str = c10 + " ";
            try {
                text.replace(vVar.u(), vVar.t(), str);
            } catch (Throwable unused) {
            }
            try {
                v0(vVar.K(spannableStringBuilder, str), false);
                p0.f0(this, vVar.u() + str.length());
            } catch (Throwable unused2) {
            }
        }
    }

    @Override
    public void r(String str, String str2) {
        if (!str.isEmpty()) {
            str = "@" + str + " ";
        }
        A0(str, str2);
    }

    public final void r0(CharSequence charSequence) {
        rh rhVar;
        String str;
        this.f24972h0 = null;
        String charSequence2 = charSequence.toString();
        boolean z10 = false;
        if (charSequence2.isEmpty()) {
            this.f24985u0 = false;
        }
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (this.P != null) {
            u uVar = this.f24968d0;
            if (selectionStart != selectionEnd) {
                selectionStart = -1;
            }
            uVar.o0(charSequence, charSequence2, selectionStart);
            this.P.so(charSequence);
        } else {
            e eVar = this.f24969e0;
            if (eVar != null) {
                if (eVar.b1(this)) {
                    u uVar2 = this.f24968d0;
                    if (selectionStart != selectionEnd) {
                        selectionStart = -1;
                    }
                    uVar2.o0(charSequence, charSequence2, selectionStart);
                }
                this.f24969e0.X5(this, charSequence2);
            }
        }
        if (!this.f24987w0 && (str = this.f24984t0) != null && !str.equals(charSequence2)) {
            v0(this.f24984t0, true);
        }
        if (!this.Q && (rhVar = this.P) != null) {
            rhVar.sq(charSequence.length() > 0);
            if (!this.P.cl()) {
                this.f24985u0 = true;
            }
        }
        if (charSequence2.length() > 0) {
            z10 = true;
        }
        setAllowsAnyGravity(z10);
    }

    @Override
    public void run() {
        Editable text = getText();
        if (o0() && this.P != null && !i.j(text) && text.charAt(text.length() - 1) == '\n') {
            text.delete(text.length() - 1, text.length());
            this.P.Lo(false, null, new hj.o() {
                @Override
                public final void a(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
                    h0.this.k0(z10, messageSchedulingState, z11);
                }
            });
        }
    }

    @Override
    public void s() {
        if (!this.f24973i0) {
            setGravity(w.F1() | 48);
        }
    }

    public void s0() {
        this.f24968d0.J0(false, false);
    }

    public void setCommandListProvider(u.j jVar) {
        this.f24968d0.H0(jVar);
    }

    public void setDraft(TdApi.InputMessageContent inputMessageContent) {
        CharSequence charSequence;
        if (inputMessageContent == null || inputMessageContent.getConstructor() != 247050392) {
            this.f24986v0 = false;
            charSequence = "";
        } else {
            TdApi.InputMessageText inputMessageText = (TdApi.InputMessageText) inputMessageContent;
            charSequence = t2.q5(inputMessageText.text);
            this.f24986v0 = inputMessageText.disableWebPagePreview;
        }
        String trim = getInput().trim();
        boolean z10 = true;
        this.P.Xp(true, trim.length() > 0);
        if (!charSequence.equals(trim)) {
            this.Q = true;
            if (charSequence.length() <= 0) {
                z10 = false;
            }
            v0(charSequence, z10);
            this.P.Fr(charSequence.toString(), false);
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        this.f24988x0 = z10;
        try {
            super.setEnabled(z10);
        } catch (Throwable th) {
            Log.w(th);
        }
    }

    public void setIgnoreAnyChanges(boolean z10) {
        if (this.f24983s0 != z10) {
            this.f24983s0 = z10;
            if (z10) {
                this.f24972h0 = null;
                return;
            }
            CharSequence charSequence = this.f24972h0;
            if (charSequence != null) {
                r0(charSequence);
            }
        }
    }

    public void setInputBlocked(boolean z10) {
        this.f24984t0 = z10 ? getInput() : null;
    }

    public void setInputListener(e eVar) {
        this.f24969e0 = eVar;
    }

    public void setIsSecret(boolean z10) {
        if (this.f24970f0 != z10) {
            this.f24970f0 = z10;
            int i10 = 268435456;
            if (z10) {
                i10 = 285212672;
            }
            setImeOptions(i10);
        }
    }

    public void setSpanChangeListener(f fVar) {
        this.f24971g0 = fVar;
    }

    public void setTextChangedSinceChatOpened(boolean z10) {
        if (this.P.cl()) {
            return;
        }
        if (!d0() || z10) {
            this.f24985u0 = true;
        }
    }

    public void setTextSilently(String str) {
        boolean z10 = this.Q;
        this.Q = true;
        setText(str);
        this.Q = z10;
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            a0();
        }
    }

    @Override
    public void t(ArrayList<dd.l> arrayList, boolean z10) {
        rh rhVar = this.P;
        if (rhVar != null) {
            rhVar.fr(arrayList, z10);
        }
    }

    public void t0(TdApi.Chat chat, p7 p7Var, boolean z10) {
        this.f24985u0 = false;
        D0(chat, p7Var, z10);
        TdApi.InputMessageContent inputMessageContent = null;
        if (this.f24967c0.y6(chat)) {
            if (p7Var != null) {
                inputMessageContent = p7Var.d();
            } else {
                TdApi.DraftMessage draftMessage = chat.draftMessage;
                if (draftMessage != null) {
                    inputMessageContent = draftMessage.inputMessageText;
                }
            }
        }
        setDraft(inputMessageContent);
    }

    @Override
    public boolean u(String str, TdApi.WebPage webPage) {
        rh rhVar = this.P;
        if (rhVar == null) {
            return false;
        }
        if (this.f24986v0) {
            this.f24986v0 = false;
            rhVar.Sk(str, webPage);
            return false;
        }
        rhVar.Xq(str, webPage);
        return true;
    }

    public f1 u0(rh rhVar) {
        this.P = rhVar;
        return new f1(this, new c());
    }

    @Override
    public boolean v() {
        return this.f24969e0 == null && ((org.thunderdog.challegram.a) getContext()).e0();
    }

    public void v0(CharSequence charSequence, boolean z10) {
        this.f24987w0 = true;
        setText(charSequence);
        if (z10) {
            p0.f0(this, charSequence != null ? charSequence.length() : 0);
        }
        this.f24987w0 = false;
    }

    @Override
    public int w(int i10, String str) {
        rh rhVar = this.P;
        if (rhVar == null || !rhVar.gl()) {
            return 0;
        }
        if (!he.i.c2().X2(2L)) {
            return he.i.c2().S2() ? 0 : 2;
        }
        AlertDialog alertDialog = this.f24982r0;
        if (alertDialog != null && alertDialog.isShowing()) {
            return 1;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.P.t(), j.t());
        builder.setTitle(w.i1(R.string.AppName));
        builder.setMessage(w.i1(R.string.SecretLinkPreviewAlert));
        builder.setPositiveButton(w.i1(R.string.SecretLinkPreviewEnable), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i11) {
                h0.this.l0(dialogInterface, i11);
            }
        });
        builder.setNegativeButton(w.i1(R.string.SecretLinkPreviewDisable), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i11) {
                h0.this.m0(dialogInterface, i11);
            }
        });
        builder.setCancelable(false);
        this.f24982r0 = this.P.Sd(builder);
        return 1;
    }

    public void w0(int i10, Object... objArr) {
        String j12 = w.j1(i10, objArr);
        this.f24976l0 = i10;
        this.f24977m0 = objArr;
        if (!i.c(j12, this.f24978n0)) {
            this.f24978n0 = j12;
            if (this.P == null) {
                setHint(j12);
                return;
            }
            this.f24979o0 = v0.T1(j12, getPaint());
            this.f24980p0 = 0;
            W();
        }
    }

    public void x0(boolean z10, String str) {
        this.f24968d0.J0(z10, getText().toString().equals(str));
    }

    public final void y0(int r19, int r20, org.drinkless.td.libcore.telegram.TdApi.TextEntityType r21) {
        throw new UnsupportedOperationException("Method not decompiled: vc.h0.y0(int, int, org.drinkless.td.libcore.telegram.TdApi$TextEntityType):void");
    }

    public boolean z0(int i10) {
        TdApi.TextEntityType textEntityType;
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart == selectionEnd) {
            return false;
        }
        switch (i10) {
            case R.id.btn_bold:
                textEntityType = new TdApi.TextEntityTypeBold();
                break;
            case R.id.btn_italic:
                textEntityType = new TdApi.TextEntityTypeItalic();
                break;
            case R.id.btn_link:
                URLSpan[] uRLSpanArr = (URLSpan[]) getText().getSpans(selectionStart, selectionEnd, URLSpan.class);
                Z((uRLSpanArr == null || uRLSpanArr.length <= 0) ? null : uRLSpanArr[0], selectionStart, selectionEnd);
                return true;
            case R.id.btn_monospace:
                textEntityType = new TdApi.TextEntityTypeCode();
                break;
            case R.id.btn_spoiler:
                textEntityType = new TdApi.TextEntityTypeSpoiler();
                break;
            case R.id.btn_strikethrough:
                textEntityType = new TdApi.TextEntityTypeStrikethrough();
                break;
            case R.id.btn_underline:
                textEntityType = new TdApi.TextEntityTypeUnderline();
                break;
            default:
                return false;
        }
        y0(selectionStart, selectionEnd, textEntityType);
        return true;
    }
}
