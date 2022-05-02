package p291uc;

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
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import cd.C2104l;
import gd.AbstractC4718o;
import gd.C4737p7;
import gd.C4747r;
import gd.C4776t;
import gd.C4779t2;
import gd.C4809v;
import gd.C4828x;
import ge.C4868i;
import id.C5335c;
import ie.RunnableC5390g;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import me.C6831a2;
import me.C7012r1;
import me.View$OnFocusChangeListenerC7069y1;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p038ce.View$OnClickListenerC2971rh;
import p056e1.C4109b;
import p056e1.C4113c;
import p082fd.C4383l;
import p082fd.C4403w;
import p108hb.C5070i;
import p110hd.AbstractC5090k;
import p110hd.C5078d;
import p110hd.C5088i;
import p110hd.C5089j;
import p139jb.AbstractC5911c;
import p141jd.C5976u;
import p193nb.C7316a;
import p193nb.C7321e;
import p291uc.View$OnClickListenerC9694y;
import p350yd.C10930q6;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p350yd.HandlerC10770jj;
import p364zd.C11524j;
import td.AbstractC9165c2;
import td.AbstractC9323v4;
import td.C9186f1;

public class RunnableC9558i0 extends C6831a2 implements C5976u.AbstractC5985i, Runnable, View$OnClickListenerC9694y.AbstractC9704j, Comparator<Object>, C5078d.AbstractC5080b, AbstractC9165c2, C11052v1.AbstractC11053a, AbstractC5911c {
    public View$OnClickListenerC2971rh f30980P;
    public boolean f30981Q;
    public TextPaint f30982R;
    public String f30983S = "";
    public String f30984T = "";
    public String f30985U = "";
    public int f30986V;
    public int f30987W;
    public int f30988a0;
    public final int f30989b0;
    public final C10930q6 f30990c0;
    public final C5976u f30991d0;
    public AbstractC9563e f30992e0;
    public boolean f30993f0;
    public AbstractC9564f f30994g0;
    public CharSequence f30995h0;
    public boolean f30996i0;
    public boolean f30997j0;
    public Spannable f30998k0;
    public int f30999l0;
    public Object[] f31000m0;
    public CharSequence f31001n0;
    public float f31002o0;
    public int f31003p0;
    public InputConnection f31004q0;
    public AlertDialog f31005r0;
    public boolean f31006s0;
    public String f31007t0;
    public boolean f31008u0;
    public boolean f31009v0;
    public boolean f31010w0;
    public boolean f31011x0;

    public class C9559a implements TextWatcher {
        public C9559a() {
        }

        public final void m8242a(Spannable spannable, int i, int i2) {
            boolean z;
            int i3 = i2 - i;
            if (i3 > 0) {
                boolean z2 = false;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z = true;
                        break;
                    }
                    int codePointAt = Character.codePointAt(spannable, i + i4);
                    if (!Character.isLetterOrDigit(codePointAt) && !Character.isWhitespace(codePointAt) && !RunnableC5390g.m22974R0(codePointAt)) {
                        z = false;
                        break;
                    }
                    i4 += Character.charCount(codePointAt);
                }
                if (z) {
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(i, i3 + i, CharacterStyle.class);
                    if (characterStyleArr != null && characterStyleArr.length > 0) {
                        int length = characterStyleArr.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                break;
                            } else if (RunnableC9558i0.m8314B0(spannable, characterStyleArr[i5])) {
                                z2 = true;
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    if (!z2) {
                        return;
                    }
                }
                spannable.setSpan(new C9562d(), i, i2, 33);
            }
        }

        @Override
        public void afterTextChanged(Editable editable) {
            if (!RunnableC9558i0.this.f30997j0 && !RunnableC9558i0.this.f31006s0) {
                if (RunnableC9558i0.this.f30981Q) {
                    RunnableC9558i0.this.f30997j0 = true;
                    m8241b(editable);
                    RunnableC9558i0.this.f30997j0 = false;
                    RunnableC9558i0.this.f30981Q = false;
                } else if (editable.length() > 0) {
                    RunnableC9558i0.this.f30997j0 = true;
                    RunnableC9558i0.this.f30998k0 = editable;
                    m8241b(editable);
                    if (RunnableC9558i0.this.f30980P != null) {
                        RunnableC9558i0.this.f30980P.m32744Fr(editable, true);
                    }
                    if (RunnableC9558i0.this.m8261o0()) {
                        RunnableC9558i0 i0Var = RunnableC9558i0.this;
                        i0Var.post(i0Var);
                    }
                    RunnableC9558i0.this.f30997j0 = false;
                } else if (RunnableC9558i0.this.f30980P != null) {
                    RunnableC9558i0.this.f30980P.m32744Fr("", true);
                }
            }
        }

        public final void m8241b(Editable editable) {
            CharacterStyle[] characterStyleArr;
            Object[] objArr = (C9562d[]) editable.getSpans(0, editable.length(), C9562d.class);
            if (!(objArr == null || objArr.length == 0)) {
                RunnableC9558i0.this.f30998k0 = editable;
                ArrayList arrayList = null;
                for (Object obj : objArr) {
                    int spanStart = editable.getSpanStart(obj);
                    int spanEnd = editable.getSpanEnd(obj);
                    editable.removeSpan(obj);
                    if (!(spanStart == -1 || spanEnd == -1)) {
                        CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) editable.getSpans(spanStart, spanEnd, CharacterStyle.class);
                        if (characterStyleArr2 != null && characterStyleArr2.length > 0) {
                            int length = characterStyleArr2.length;
                            int i = 0;
                            while (i < length) {
                                CharacterStyle characterStyle = characterStyleArr2[i];
                                if (characterStyle instanceof ImageSpan) {
                                    int spanStart2 = editable.getSpanStart(characterStyle);
                                    int spanEnd2 = editable.getSpanEnd(characterStyle);
                                    characterStyleArr = characterStyleArr2;
                                    AbstractC5090k E = C5078d.m23987z().m24029E(RunnableC9558i0.m8258q0(((ImageSpan) characterStyle).getSource()), null);
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
                                    i++;
                                    characterStyleArr2 = characterStyleArr;
                                } else {
                                    characterStyleArr = characterStyleArr2;
                                }
                                if (RunnableC9558i0.m8314B0(editable, characterStyle)) {
                                    editable.removeSpan(characterStyle);
                                }
                                i++;
                                characterStyleArr2 = characterStyleArr;
                            }
                        }
                        ArrayList arrayList2 = arrayList;
                        C5078d.m23987z().m24023K(editable, spanStart, spanEnd, null, RunnableC9558i0.this);
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            Collections.sort(arrayList2, RunnableC9558i0.this);
                            int selectionStart = RunnableC9558i0.this.getSelectionStart();
                            int selectionEnd = RunnableC9558i0.this.getSelectionEnd();
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                Object obj2 = arrayList2.get(size);
                                int spanStart3 = editable.getSpanStart(obj2);
                                int spanEnd3 = editable.getSpanEnd(obj2);
                                if (!(spanStart3 == -1 || spanEnd3 == -1)) {
                                    int i2 = spanEnd3 - spanStart3;
                                    if (obj2 instanceof AbstractC5090k) {
                                        String charSequence = ((AbstractC5090k) obj2).mo23969a().toString();
                                        editable.replace(spanStart3, spanEnd3, charSequence);
                                        int length2 = charSequence.length();
                                        if (length2 != i2) {
                                            int i3 = length2 - i2;
                                            if (selectionStart >= spanStart3) {
                                                selectionStart += i3;
                                            }
                                            if (selectionEnd >= spanStart3) {
                                                selectionEnd += i3;
                                            }
                                        }
                                    } else {
                                        editable.delete(spanStart3, spanEnd3);
                                        if (selectionStart >= spanStart3) {
                                            selectionStart -= i2;
                                        }
                                        if (selectionEnd >= spanStart3) {
                                            selectionEnd -= i2;
                                        }
                                    }
                                }
                            }
                            if (!(selectionStart == -1 || selectionEnd == -1)) {
                                int length3 = editable.length();
                                if (selectionStart >= selectionEnd) {
                                    C1399s0.m37172m0(RunnableC9558i0.this, Math.min(selectionStart, length3));
                                } else {
                                    C1399s0.m37170n0(RunnableC9558i0.this, Math.min(selectionStart, length3), Math.max(selectionEnd, length3));
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
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (RunnableC9558i0.this.f31006s0) {
                RunnableC9558i0.this.f30995h0 = charSequence;
                return;
            }
            RunnableC9558i0.this.m8256r0(charSequence);
            if (i3 > 0 && (charSequence instanceof Spannable)) {
                Spannable spannable = (Spannable) charSequence;
                int i4 = i3 + i;
                AbstractC5090k[] kVarArr = (AbstractC5090k[]) spannable.getSpans(i, i4, AbstractC5090k.class);
                if (kVarArr != null && kVarArr.length > 0) {
                    int length = kVarArr.length;
                    int i5 = 0;
                    while (i5 < length) {
                        AbstractC5090k kVar = kVarArr[i5];
                        int spanStart = spannable.getSpanStart(kVar);
                        int spanEnd = spannable.getSpanEnd(kVar);
                        if (i < spanStart) {
                            m8242a(spannable, i, spanStart);
                        }
                        i5++;
                        i = spanEnd;
                    }
                }
                if (i < i4) {
                    m8242a(spannable, i, i4);
                }
            }
        }
    }

    public class ActionMode$CallbackC9560b implements ActionMode.Callback {
        public ActionMode$CallbackC9560b() {
        }

        @Override
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return RunnableC9558i0.this.m8243z0(menuItem.getItemId());
        }

        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            TdApi.TextEntityType textEntityType;
            int i;
            MenuInflater menuInflater = actionMode.getMenuInflater();
            if (menuInflater == null) {
                return true;
            }
            menuInflater.inflate(R.menu.text, menu);
            for (int i2 = 0; i2 < menu.size(); i2++) {
                try {
                    MenuItem item = menu.getItem(i2);
                    switch (item.getItemId()) {
                        case R.id.btn_bold:
                            i = R.string.TextFormatBold;
                            textEntityType = new TdApi.TextEntityTypeBold();
                            break;
                        case R.id.btn_italic:
                            i = R.string.TextFormatItalic;
                            textEntityType = new TdApi.TextEntityTypeItalic();
                            break;
                        case R.id.btn_link:
                            i = R.string.TextFormatLink;
                            textEntityType = null;
                            break;
                        case R.id.btn_monospace:
                            i = R.string.TextFormatMonospace;
                            textEntityType = new TdApi.TextEntityTypeCode();
                            break;
                        case R.id.btn_spoiler:
                            i = R.string.TextFormatSpoiler;
                            textEntityType = new TdApi.TextEntityTypeSpoiler();
                            break;
                        case R.id.btn_strikethrough:
                            i = R.string.TextFormatStrikethrough;
                            textEntityType = new TdApi.TextEntityTypeStrikethrough();
                            break;
                        case R.id.btn_underline:
                            i = R.string.TextFormatUnderline;
                            textEntityType = new TdApi.TextEntityTypeUnderline();
                            break;
                        default:
                            continue;
                    }
                    item.setTitle(textEntityType != null ? C4403w.m27890d3(C4403w.m27871i1(i), C4403w.m27969L(textEntityType)) : C4403w.m27871i1(i));
                } catch (Throwable unused) {
                }
            }
            if (RunnableC5390g.m22980O0(RunnableC9558i0.this.getText().toString(), RunnableC9558i0.this.getSelectionStart(), RunnableC9558i0.this.getSelectionEnd())) {
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

    public class C9561c implements C9186f1.AbstractC9187a {
        public C9561c() {
        }

        @Override
        public void mo8240a(int i) {
            if (RunnableC9558i0.this.f30999l0 != 0) {
                RunnableC9558i0 i0Var = RunnableC9558i0.this;
                i0Var.m8247w0(i0Var.f30999l0, RunnableC9558i0.this.f31000m0);
            }
        }

        @Override
        public int mo8239b() {
            return RunnableC9558i0.this.f30999l0;
        }
    }

    public static class C9562d implements NoCopySpan {
        public C9562d() {
        }
    }

    public interface AbstractC9563e {
        void mo8238D4(RunnableC9558i0 i0Var, String str);

        long mo8237D5(RunnableC9558i0 i0Var);

        void mo8236W5(RunnableC9558i0 i0Var, ArrayList<AbstractC4718o<?>> arrayList);

        TdApi.Chat mo8235h7(RunnableC9558i0 i0Var);

        boolean mo8234o3(RunnableC9558i0 i0Var);

        void mo8233r0(RunnableC9558i0 i0Var, ArrayList<AbstractC4718o<?>> arrayList, boolean z);

        long mo8232z(RunnableC9558i0 i0Var);
    }

    public interface AbstractC9564f {
        void mo8231a(RunnableC9558i0 i0Var);
    }

    public RunnableC9558i0(Context context, C10930q6 q6Var) {
        super(context);
        this.f30990c0 = q6Var;
        this.f30991d0 = new C5976u(C1379j0.m37310r(context), q6Var, this);
        TextPaint textPaint = new TextPaint(5);
        this.f30982R = textPaint;
        textPaint.setColor(C11524j.m207X0());
        this.f30982R.setTypeface(C1389o.m37261k());
        this.f30982R.setTextSize(C1357a0.m37555C(18.0f));
        setGravity(C4403w.m27991F1() | 48);
        setTypeface(C1389o.m37261k());
        setTextSize(2, 18.0f);
        int i = C1357a0.m37544i(12.0f);
        this.f30989b0 = i;
        int i2 = C1357a0.m37544i(60.0f);
        this.f30988a0 = i2;
        setPadding(i2, i, C1357a0.m37544i(55.0f), i);
        setImeOptions(268435456);
        setInputType(getInputType() | Log.TAG_VIDEO | Log.TAG_CONTACT);
        setSingleLine(false);
        setMaxLines(8);
        setMinimumHeight(C1357a0.m37544i(49.0f));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        C1399s0.m37169o(this);
        addTextChangedListener(new C9559a());
        setCustomSelectionActionModeCallback(new ActionMode$CallbackC9560b());
        C11052v1.m1768b().m1769a(this);
    }

    public static boolean m8314B0(Spanned spanned, CharacterStyle characterStyle) {
        return !m8280e0(spanned, characterStyle) && !(characterStyle instanceof SuggestionSpan) && (spanned.getSpanFlags(characterStyle) & Log.TAG_CRASH) == 0;
    }

    public static String m8285b0(String str, int i) {
        int length = i - (str.length() % i);
        if (length == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + length);
        for (int i2 = 0; i2 < length; i2++) {
            sb2.append('0');
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static boolean m8280e0(Spanned spanned, CharacterStyle characterStyle) {
        if ((characterStyle instanceof NoCopySpan) || (characterStyle instanceof AbstractC5090k) || (characterStyle instanceof UnderlineSpan)) {
            return true;
        }
        if (!C4779t2.m25669J(characterStyle)) {
            return false;
        }
        if (characterStyle instanceof URLSpan) {
            String charSequence = spanned.subSequence(spanned.getSpanStart(characterStyle), spanned.getSpanEnd(characterStyle)).toString();
            String url = ((URLSpan) characterStyle).getURL();
            if (charSequence.equals(url)) {
                return false;
            }
            return !C1363c0.m37460Q(charSequence) || C1363c0.m37466K(url, charSequence);
        }
        return true;
    }

    public void m8278f0(long j, long j2, long j3, boolean z, TdApi.InputMessageContent inputMessageContent, boolean z2, TdApi.MessageSchedulingState messageSchedulingState, boolean z3) {
        TdApi.MessageSchedulingState messageSchedulingState2;
        boolean z4;
        C10930q6 q6Var = this.f30990c0;
        if (z2 || z) {
            z4 = true;
            messageSchedulingState2 = messageSchedulingState;
        } else {
            messageSchedulingState2 = messageSchedulingState;
            z4 = false;
        }
        q6Var.m2247sb(j, j2, j3, new TdApi.MessageSendOptions(z4, false, false, messageSchedulingState2), inputMessageContent, null);
    }

    public void m8276g0(final long j, final long j2, final long j3, final boolean z, final TdApi.InputMessageContent inputMessageContent) {
        this.f30990c0.m2485dd().m3787L8(this.f30980P, j, false, new HandlerC10770jj.AbstractC10786o() {
            @Override
            public final void mo3333a(boolean z2, TdApi.MessageSchedulingState messageSchedulingState, boolean z3) {
                RunnableC9558i0.this.m8278f0(j, j2, j3, z, inputMessageContent, z2, messageSchedulingState, z3);
            }
        }, null);
    }

    public void m8274h0(Uri uri, int i, final long j, long j2, boolean z, final long j3, final long j4, final boolean z2) {
        boolean z3;
        TdApi.InputMessageContent inputMessageContent;
        try {
            InputStream openInputStream = C1379j0.m37312q().getContentResolver().openInputStream(uri);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(openInputStream, null, options);
            int i2 = options.outWidth;
            int i3 = options.outHeight;
            if (openInputStream != null) {
                openInputStream.close();
            }
            if (i2 == 0 || i3 == 0) {
                Log.m14724e("Unknown image bounds, aborting", new Object[0]);
                return;
            }
            String uri2 = uri.toString();
            if (i == 3) {
                try {
                    InputStream openInputStream2 = C1379j0.m37312q().getContentResolver().openInputStream(uri);
                    z3 = C7389v0.m16640e1(openInputStream2);
                    if (openInputStream2 != null) {
                        openInputStream2.close();
                    }
                } catch (Throwable th) {
                    Log.m14725e("Unable to read GIF", th, new Object[0]);
                    z3 = false;
                }
            } else {
                z3 = true;
            }
            boolean j5 = C7316a.m17051j(j);
            if (i == 3 && z3) {
                inputMessageContent = this.f30990c0.m2429h5().m23152B(new TdApi.InputMessageAnimation(C4779t2.m25671I4(null, uri2, 0, j2), null, null, 0, i2, i3, null), j5);
            } else if (i == 4 || (i != 1 && !uri2.contains("sticker") && Math.max(i2, i3) > 512)) {
                inputMessageContent = this.f30990c0.m2429h5().m23152B(new TdApi.InputMessagePhoto(C5335c.m23206x(uri2, 0, j2, false, 0), null, null, i2, i3, null, 0), j5);
            } else {
                inputMessageContent = this.f30990c0.m2429h5().m23152B(new TdApi.InputMessageSticker(C5335c.m23206x(uri2, 0, j2, true, Log.TAG_GIF_LOADER), null, i2, i3, null), j5);
            }
            final TdApi.InputMessageContent inputMessageContent2 = inputMessageContent;
            if (z) {
                this.f30990c0.m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        RunnableC9558i0.this.m8276g0(j, j3, j4, z2, inputMessageContent2);
                    }
                });
            } else {
                this.f30990c0.m2231tb(j, j3, j4, z2, false, inputMessageContent2);
            }
        } catch (Throwable th2) {
            Log.m14725e("Unable to read image", th2, new Object[0]);
        }
    }

    public boolean m8272i0(C4113c cVar, int i, Bundle bundle) {
        final int i2;
        View$OnClickListenerC2971rh rhVar = this.f30980P;
        if (rhVar != null && rhVar.m32764Ek()) {
            ClipDescription b = cVar.m28899b();
            if (b.hasMimeType("image/webp")) {
                i2 = 1;
            } else if (b.hasMimeType("image/png")) {
                i2 = 2;
            } else if (b.hasMimeType("image/gif")) {
                i2 = 3;
            } else if (b.hasMimeType("image/jpeg")) {
                i2 = 4;
            }
            if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
                try {
                    cVar.m28898c();
                } catch (Throwable unused) {
                    return false;
                }
            }
            final Uri a = cVar.m28900a();
            final long currentTimeMillis = System.currentTimeMillis();
            final long C9 = this.f30980P.mo9464C9();
            final long qk = this.f30980P.m32269qk();
            final long ko = this.f30980P.m32344ko();
            final boolean lo = this.f30980P.m32331lo();
            final boolean ui = this.f30980P.m32219ui();
            C4383l.m28061a().m28060b(new Runnable() {
                @Override
                public final void run() {
                    RunnableC9558i0.this.m8274h0(a, i2, C9, currentTimeMillis, ui, qk, ko, lo);
                }
            });
            return true;
        }
        return false;
    }

    public boolean m8270j0(URLSpan uRLSpan, int i, int i2, View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        if (C5070i.m24062i(str)) {
            if (uRLSpan != null) {
                getText().removeSpan(uRLSpan);
                this.f30991d0.m21687V();
            }
            return true;
        } else if (!C1363c0.m37460Q(str)) {
            return false;
        } else {
            m8245y0(i, i2, new TdApi.TextEntityTypeTextUrl(str));
            return true;
        }
    }

    public void m8268k0(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        this.f30980P.m32680Kp(true, z, messageSchedulingState);
    }

    public void m8266l0(DialogInterface dialogInterface, int i) {
        this.f31005r0 = null;
        C4868i.m24727c2().m24583u2(2L);
        C4868i.m24727c2().m24831N5(true);
        this.f30991d0.m21687V();
    }

    public void m8264m0(DialogInterface dialogInterface, int i) {
        this.f31005r0 = null;
        C4868i.m24727c2().m24583u2(2L);
        C4868i.m24727c2().m24831N5(false);
        this.f30991d0.m21687V();
    }

    public static String m8258q0(String str) {
        String str2;
        if (C5070i.m24062i(str)) {
            return null;
        }
        int i = -1;
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
            return C5078d.m24027G(m8285b0(str2, 8), "UTF-32BE");
        }
        int indexOf = str.indexOf("vk.com/images/emoji/");
        if (indexOf != -1) {
            int i2 = indexOf + 20;
            int length = str.length();
            if (str.endsWith("_2x.png")) {
                i = length - 7;
            } else if (str.endsWith(".png")) {
                i = length - 4;
            }
            if (i2 < i) {
                return C5078d.m24027G(m8285b0(str.substring(i2, i), 8), "UTF-16");
            }
        }
        return null;
    }

    private void setAllowsAnyGravity(boolean z) {
        if (this.f30996i0 != z) {
            this.f30996i0 = z;
            int i = 48;
            if (!z) {
                i = 48 | C4403w.m27991F1();
            }
            setGravity(i);
        }
    }

    public final void m8316A0(String str, String str2) {
        if (!this.f30983S.equals(str2) || !this.f30984T.equals(str)) {
            this.f30983S = str2;
            this.f30984T = str;
            int i = 0;
            this.f30986V = str.length() > 0 ? (int) C7389v0.m16680T1(this.f30984T, this.f30982R) : 0;
            if (str2.length() > 0) {
                i = (int) C7389v0.m16680T1(this.f30983S, this.f30982R);
            }
            this.f30987W = i;
            m8263n0();
            invalidate();
        }
    }

    public boolean m8312C0() {
        return this.f31008u0;
    }

    public void m8310D0(TdApi.Chat chat, C4737p7 p7Var, boolean z) {
        int i;
        int i2;
        int i3 = R.string.Message;
        if (chat == null) {
            m8247w0(R.string.Message, new Object[0]);
            return;
        }
        Object[] objArr = null;
        TdApi.ChatMemberStatus K3 = this.f30990c0.m2787K3(chat.f25370id);
        if (this.f30990c0.m2784K6(chat.f25370id)) {
            i = z ? R.string.ChannelSilentBroadcast : R.string.ChannelBroadcast;
        } else if (!this.f30990c0.m2568Y6(chat) || !C7321e.m16974W0(K3)) {
            TdApi.MessageSender messageSender = chat.messageSenderId;
            if (messageSender == null || this.f30990c0.m2395j7(messageSender)) {
                if (p7Var != null) {
                    i3 = p7Var.m26301a() ? R.string.Comment : R.string.MessageReply;
                }
                i = i3;
            } else {
                if (p7Var != null) {
                    i2 = p7Var.m26301a() ? R.string.CommentAsX : R.string.MessageReplyAsX;
                } else {
                    i2 = R.string.MessageAsX;
                }
                objArr = new Object[]{this.f30990c0.m2151yb(chat.messageSenderId)};
                i = i2;
            }
        } else if (p7Var != null) {
            i = p7Var.m26301a() ? R.string.CommentAnonymously : R.string.MessageReplyAnonymously;
        } else {
            i = R.string.MessageAnonymously;
        }
        m8247w0(i, objArr);
    }

    public boolean m8292V() {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        return selectionStart >= 0 && selectionEnd > selectionStart && selectionEnd <= getText().length();
    }

    public void m8291W() {
        int max;
        if (this.f30999l0 != 0 && this.f30980P != null && this.f31003p0 != (max = Math.max(0, (getMeasuredWidth() - this.f30980P.m32361jk()) - getPaddingLeft()))) {
            this.f31003p0 = max;
            float f = max;
            if (this.f31002o0 <= f) {
                setHint(this.f31001n0);
            } else {
                setHint(TextUtils.ellipsize(this.f31001n0, getPaint(), f, TextUtils.TruncateAt.END));
            }
        }
    }

    public final void m8290X(String str) {
        int i = 0;
        String substring = str.substring(0, this.f30984T.length());
        if (!substring.equals(this.f30984T)) {
            this.f30984T = substring;
            if (substring.length() > 0) {
                i = (int) C7389v0.m16680T1(this.f30984T, this.f30982R);
            }
            this.f30986V = i;
            m8263n0();
        }
    }

    public final InputConnection m8289Y(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (m8283c0()) {
            return onCreateInputConnection;
        }
        C7012r1.m18098b(editorInfo, new String[]{"image/webp", "image/png", "image/gif", "image/jpeg", "image/*"});
        if (onCreateInputConnection == null) {
            return null;
        }
        return C7012r1.m18099a(onCreateInputConnection, editorInfo, new C4109b.AbstractC4112c() {
            @Override
            public final boolean mo8459a(C4113c cVar, int i, Bundle bundle) {
                boolean i0;
                i0 = RunnableC9558i0.this.m8272i0(cVar, i, bundle);
                return i0;
            }
        });
    }

    public void m8288Z(final URLSpan uRLSpan, final int i, final int i2) {
        if (i >= 0 && i2 >= 0 && i <= getText().length() && i2 <= getText().length()) {
            AbstractC9323v4 v4Var = this.f30980P;
            if (v4Var == null) {
                AbstractC9563e eVar = this.f30992e0;
                if (eVar instanceof AbstractC9323v4) {
                    v4Var = (AbstractC9323v4) eVar;
                }
            }
            AbstractC9323v4 v4Var2 = v4Var;
            if (v4Var2 != null) {
                v4Var2.m9364Pc(C4403w.m27871i1(R.string.CreateLink), C4403w.m27871i1(R.string.URL), R.string.CreateLinkDone, R.string.CreateLinkCancel, uRLSpan != null ? uRLSpan.getURL() : null, new AbstractC9323v4.AbstractC9336m() {
                    @Override
                    public final boolean mo4197a(View$OnFocusChangeListenerC7069y1 y1Var, String str) {
                        boolean j0;
                        j0 = RunnableC9558i0.this.m8270j0(uRLSpan, i, i2, y1Var, str);
                        return j0;
                    }
                }, false);
            }
        }
    }

    @Override
    public TdApi.WebPage mo8287a(TdApi.FormattedText formattedText) {
        View$OnClickListenerC2971rh rhVar = this.f30980P;
        if (rhVar != null) {
            return rhVar.m32413fk(formattedText);
        }
        return null;
    }

    public final void m8286a0() {
        if (this.f31011x0) {
            try {
                super.setEnabled(false);
            } catch (Throwable th) {
                Log.m14708w(th);
            }
            try {
                super.setEnabled(this.f31011x0);
            } catch (Throwable th2) {
                Log.m14708w(th2);
            }
        }
    }

    @Override
    public void mo4501a3() {
        C11052v1.m1768b().m1766d(this);
    }

    @Override
    public void mo7521b(C4828x xVar, String str) {
        String str2;
        boolean z = !C5070i.m24062i(str) || xVar.m25121f0();
        if (C5070i.m24062i(str)) {
            str = xVar.m25125b0(false);
        }
        if (str != null && xVar.m26333t() != -1 && xVar.m26332u() != -1) {
            Editable text = getText();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
            if (z) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str + " ");
                spannableStringBuilder2.setSpan(C4779t2.m25670I5(new TdApi.TextEntityTypeMentionName(xVar.m25124c0().f25442id)), 0, str.length(), 33);
                str2 = spannableStringBuilder2;
            } else {
                str2 = str + " ";
            }
            try {
                text.replace(xVar.m26332u(), Math.min(text.length(), xVar.m26333t()), str2);
            } catch (Throwable unused) {
            }
            try {
                m8249v0(xVar.m26354K(spannableStringBuilder, str2), false);
                C1399s0.m37172m0(this, xVar.m26332u() + str2.length());
            } catch (Throwable unused2) {
            }
        }
    }

    @Override
    public void mo8284c(ArrayList<AbstractC4718o<?>> arrayList, boolean z) {
        AbstractC9563e eVar = this.f30992e0;
        if (eVar == null || !eVar.mo8234o3(this)) {
            ((AbstractView$OnTouchListenerC7889a) getContext()).m14411y3(this.f30980P, this.f30990c0, arrayList, z, this.f30991d0);
        } else {
            this.f30992e0.mo8233r0(this, arrayList, z);
        }
    }

    public final boolean m8283c0() {
        View$OnClickListenerC2971rh rhVar = this.f30980P;
        return rhVar == null || rhVar.m32464bl();
    }

    @Override
    public int compare(Object obj, Object obj2) {
        return Integer.compare(this.f30998k0.getSpanStart(obj), this.f30998k0.getSpanStart(obj2));
    }

    @Override
    public boolean mo8282d() {
        return !m8283c0() && this.f30990c0.m2384k2(this.f30980P.m32531Wj());
    }

    public boolean m8281d0() {
        return getInput().trim().isEmpty();
    }

    @Override
    public void mo7520e(C4809v vVar) {
        String h = vVar.m26341h();
        if (h != null && vVar.m26329x()) {
            Editable text = getText();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
            String str = h + " ";
            try {
                text.replace(vVar.m26332u(), vVar.m26333t(), str);
            } catch (Throwable unused) {
            }
            try {
                m8249v0(vVar.m26354K(spannableStringBuilder, str), false);
                C1399s0.m37172m0(this, vVar.m26332u() + str.length());
            } catch (Throwable unused2) {
            }
        }
    }

    @Override
    public final TdApi.FormattedText mo8279f(boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        BaseInputConnection.removeComposingSpans(spannableStringBuilder);
        TdApi.FormattedText formattedText = new TdApi.FormattedText(spannableStringBuilder.toString(), C4779t2.m25393x5(spannableStringBuilder, false));
        if (z) {
            C7321e.m16935k1(formattedText);
        }
        return formattedText;
    }

    @Override
    public long mo8277g() {
        View$OnClickListenerC2971rh rhVar = this.f30980P;
        if (rhVar != null) {
            return rhVar.m32518Xj();
        }
        AbstractC9563e eVar = this.f30992e0;
        if (eVar == null || !eVar.mo8234o3(this)) {
            return 0L;
        }
        return this.f30992e0.mo8232z(this);
    }

    @Override
    public void mo452g2() {
        Editable text = getText();
        if (!(text == null || text.length() == 0)) {
            AbstractC5090k[] kVarArr = (AbstractC5090k[]) text.getSpans(0, text.length(), AbstractC5090k.class);
            if (!(kVarArr == null || kVarArr.length == 0)) {
                for (AbstractC5090k kVar : kVarArr) {
                    if (kVar.mo23967c()) {
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

    public C5976u getInlineSearchContext() {
        return this.f30991d0;
    }

    public String getInput() {
        String obj = getText().toString();
        return (this.f30983S.length() == 0 || this.f30984T.length() == 0 || !obj.endsWith(this.f30983S)) ? obj : obj.substring(0, obj.lastIndexOf(this.f30983S));
    }

    public Paint getPlaceholderPaint() {
        return this.f30982R;
    }

    @Override
    public void mo8275h(boolean z, boolean z2) {
        View$OnClickListenerC2971rh rhVar = this.f30980P;
        if (rhVar != null) {
            rhVar.m32152zk().m18761g(z, z2);
        }
    }

    @Override
    public void mo8273i(ArrayList<AbstractC4718o<?>> arrayList) {
        AbstractC9563e eVar = this.f30992e0;
        if (eVar == null || !eVar.mo8234o3(this)) {
            ((AbstractView$OnTouchListenerC7889a) getContext()).m14541S(this.f30980P, arrayList, this.f30991d0);
        } else {
            this.f30992e0.mo8236W5(this, arrayList);
        }
    }

    @Override
    public void invalidate() {
        super.invalidate();
    }

    @Override
    public boolean mo8271j() {
        return !m8283c0() && this.f30990c0.m2804J2(this.f30980P.m32531Wj());
    }

    @Override
    public boolean mo8269k(CharSequence charSequence, CharSequence charSequence2, C5088i iVar, int i, int i2) {
        AbstractC5090k E = C5078d.m23987z().m24029E(charSequence2, iVar);
        if (E == null) {
            return true;
        }
        this.f30998k0.setSpan(E, i, i2 + i, 33);
        return true;
    }

    @Override
    public TdApi.Chat mo8267l() {
        View$OnClickListenerC2971rh rhVar = this.f30980P;
        if (rhVar != null) {
            return rhVar.m32531Wj();
        }
        AbstractC9563e eVar = this.f30992e0;
        if (eVar == null || !eVar.mo8234o3(this)) {
            return null;
        }
        return this.f30992e0.mo8235h7(this);
    }

    @Override
    public void mo8265m() {
        View$OnClickListenerC2971rh rhVar = this.f30980P;
        if (rhVar != null) {
            rhVar.m32647Nk();
        }
        AbstractC9563e eVar = this.f30992e0;
        if (eVar == null || !eVar.mo8234o3(this)) {
            ((AbstractView$OnTouchListenerC7889a) getContext()).m14411y3(this.f30980P, this.f30990c0, null, false, null);
        } else {
            this.f30992e0.mo8233r0(this, null, false);
        }
    }

    @Override
    public void mo7519n(AbstractC4718o<?> oVar) {
        View$OnClickListenerC2971rh rhVar = this.f30980P;
        if (rhVar != null) {
            rhVar.m32147zp(oVar.m26335r(), oVar.m26337p(), true, true, false, null);
        }
    }

    public final void m8263n0() {
        int measuredWidth;
        this.f30985U = this.f30983S;
        if (this.f30987W > 0 && this.f30987W > (measuredWidth = (getMeasuredWidth() - this.f30986V) - C1357a0.m37544i(110.0f))) {
            this.f30985U = (String) TextUtils.ellipsize(this.f30983S, this.f30982R, measuredWidth, TextUtils.TruncateAt.END);
        }
    }

    @Override
    public long mo8262o() {
        View$OnClickListenerC2971rh rhVar = this.f30980P;
        if (rhVar != null) {
            return rhVar.mo9464C9();
        }
        AbstractC9563e eVar = this.f30992e0;
        if (eVar == null || !eVar.mo8234o3(this)) {
            return 0L;
        }
        return this.f30992e0.mo8237D5(this);
    }

    public final boolean m8261o0() {
        View$OnClickListenerC2971rh rhVar;
        return C4868i.m24727c2().m24792T2() && !this.f31010w0 && (rhVar = this.f30980P) != null && rhVar.m32543Vk();
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m8286a0();
    }

    @Override
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection Y = m8289Y(editorInfo);
        if (Y == null || Build.VERSION.SDK_INT < 19 || (Y instanceof C5089j)) {
            this.f31004q0 = Y;
            return Y;
        }
        C5089j jVar = new C5089j(this, Y);
        this.f31004q0 = jVar;
        return jVar;
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f30985U.length() > 0 && this.f30984T.length() > 0 && getLineCount() == 1) {
            String obj = getText().toString();
            if (obj.toLowerCase().equals(this.f30984T.toLowerCase())) {
                m8290X(obj);
                canvas.drawText(this.f30985U, this.f30988a0 + this.f30986V, getBaseline(), this.f30982R);
            }
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m8291W();
        m8263n0();
    }

    @Override
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        C5976u uVar = this.f30991d0;
        if (uVar != null) {
            if (i != i2) {
                i = -1;
            }
            uVar.m21658m0(i);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            Log.m14725e("System bug", th, new Object[0]);
            return false;
        }
    }

    @Override
    public void mo7518p(C4776t tVar) {
        String Z = tVar.m25733Z();
        if (Z != null && tVar.m26329x()) {
            Editable text = getText();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
            if (!(text.length() == tVar.m26333t() && tVar.m26332u() == 0)) {
                Z = Z + " ";
            }
            try {
                text.replace(tVar.m26332u(), tVar.m26333t(), Z);
            } catch (Throwable unused) {
            }
            try {
                m8249v0(tVar.m26354K(spannableStringBuilder, Z), false);
                C1399s0.m37172m0(this, tVar.m26332u() + Z.length());
            } catch (Throwable unused2) {
            }
        }
    }

    public void m8260p0(String str) {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        int length = str.length() + selectionStart;
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(C5078d.m23987z().m24029E(str, null), 0, spannableString.length(), 33);
        if (selectionStart == selectionEnd) {
            getText().insert(selectionStart, spannableString);
        } else {
            getText().replace(selectionStart, selectionEnd, spannableString);
        }
        C1399s0.m37172m0(this, length);
    }

    @Override
    public void mo8259q(String str, String str2) {
        if (!str.isEmpty()) {
            str = "@" + str + " ";
        }
        m8316A0(str, str2);
    }

    @Override
    public void mo8257r(ArrayList<C2104l> arrayList, boolean z) {
        View$OnClickListenerC2971rh rhVar = this.f30980P;
        if (rhVar != null) {
            rhVar.m32406fr(arrayList, z);
        }
    }

    public final void m8256r0(CharSequence charSequence) {
        View$OnClickListenerC2971rh rhVar;
        String str;
        this.f30995h0 = null;
        String charSequence2 = charSequence.toString();
        boolean z = false;
        if (charSequence2.isEmpty()) {
            this.f31008u0 = false;
        }
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (this.f30980P != null) {
            C5976u uVar = this.f30991d0;
            if (selectionStart != selectionEnd) {
                selectionStart = -1;
            }
            uVar.m21654o0(charSequence, charSequence2, selectionStart);
            this.f30980P.m32239so(charSequence);
        } else {
            AbstractC9563e eVar = this.f30992e0;
            if (eVar != null) {
                if (eVar.mo8234o3(this)) {
                    C5976u uVar2 = this.f30991d0;
                    if (selectionStart != selectionEnd) {
                        selectionStart = -1;
                    }
                    uVar2.m21654o0(charSequence, charSequence2, selectionStart);
                }
                this.f30992e0.mo8238D4(this, charSequence2);
            }
        }
        if (!this.f31010w0 && (str = this.f31007t0) != null && !str.equals(charSequence2)) {
            m8249v0(this.f31007t0, true);
        }
        if (!this.f30981Q && (rhVar = this.f30980P) != null) {
            rhVar.m32237sq(charSequence.length() > 0);
            if (!this.f30980P.m32451cl()) {
                this.f31008u0 = true;
            }
        }
        if (charSequence2.length() > 0) {
            z = true;
        }
        setAllowsAnyGravity(z);
    }

    @Override
    public void run() {
        Editable text = getText();
        if (m8261o0() && this.f30980P != null && !C5070i.m24061j(text) && text.charAt(text.length() - 1) == '\n') {
            text.delete(text.length() - 1, text.length());
            this.f30980P.m32668Lo(false, null, new HandlerC10770jj.AbstractC10786o() {
                @Override
                public final void mo3333a(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
                    RunnableC9558i0.this.m8268k0(z, messageSchedulingState, z2);
                }
            });
        }
    }

    @Override
    public void mo8255s() {
        if (!this.f30996i0) {
            setGravity(C4403w.m27991F1() | 48);
        }
    }

    public void m8254s0() {
        this.f30991d0.m21707J0(false, false);
    }

    public void setCommandListProvider(C5976u.AbstractC5986j jVar) {
        this.f30991d0.m21711H0(jVar);
    }

    public void setDraft(TdApi.InputMessageContent inputMessageContent) {
        CharSequence charSequence;
        if (inputMessageContent == null || inputMessageContent.getConstructor() != 247050392) {
            this.f31009v0 = false;
            charSequence = "";
        } else {
            TdApi.InputMessageText inputMessageText = (TdApi.InputMessageText) inputMessageContent;
            charSequence = C4779t2.m25442q5(inputMessageText.text);
            this.f31009v0 = inputMessageText.disableWebPagePreview;
        }
        String trim = getInput().trim();
        boolean z = true;
        this.f30980P.m32512Xp(true, trim.length() > 0);
        if (!charSequence.equals(trim)) {
            this.f30981Q = true;
            if (charSequence.length() <= 0) {
                z = false;
            }
            m8249v0(charSequence, z);
            this.f30980P.m32744Fr(charSequence.toString(), false);
        }
    }

    @Override
    public void setEnabled(boolean z) {
        this.f31011x0 = z;
        try {
            super.setEnabled(z);
        } catch (Throwable th) {
            Log.m14708w(th);
        }
    }

    public void setIgnoreAnyChanges(boolean z) {
        if (this.f31006s0 != z) {
            this.f31006s0 = z;
            if (z) {
                this.f30995h0 = null;
                return;
            }
            CharSequence charSequence = this.f30995h0;
            if (charSequence != null) {
                m8256r0(charSequence);
            }
        }
    }

    public void setInputBlocked(boolean z) {
        this.f31007t0 = z ? getInput() : null;
    }

    public void setInputListener(AbstractC9563e eVar) {
        this.f30992e0 = eVar;
    }

    public void setIsSecret(boolean z) {
        if (this.f30993f0 != z) {
            this.f30993f0 = z;
            int i = 268435456;
            if (z) {
                i = 285212672;
            }
            setImeOptions(i);
        }
    }

    public void setSpanChangeListener(AbstractC9564f fVar) {
        this.f30994g0 = fVar;
    }

    public void setTextChangedSinceChatOpened(boolean z) {
        if (this.f30980P.m32451cl()) {
            return;
        }
        if (!m8281d0() || z) {
            this.f31008u0 = true;
        }
    }

    public void setTextSilently(String str) {
        boolean z = this.f30981Q;
        this.f30981Q = true;
        setText(str);
        this.f30981Q = z;
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            m8286a0();
        }
    }

    @Override
    public void mo7517t(C4747r rVar, boolean z) {
        String str;
        StringBuilder sb2;
        View$OnClickListenerC2971rh rhVar = this.f30980P;
        if (rhVar != null) {
            TdApi.Chat Wj = rhVar.m32531Wj();
            if (z) {
                if ((Wj == null || !C7316a.m17049l(C7316a.m17044q(Wj.f25370id))) && rVar.m26273b0() != null) {
                    sb2 = new StringBuilder();
                    sb2.append(rVar.m26274a0());
                    sb2.append('@');
                    str = rVar.m26273b0();
                } else {
                    sb2 = new StringBuilder();
                    str = rVar.m26274a0();
                }
                sb2.append(str);
                sb2.append(' ');
                m8249v0(sb2.toString(), true);
                return;
            }
            this.f30980P.m32251rp(rVar);
        }
    }

    public void m8253t0(TdApi.Chat chat, C4737p7 p7Var, boolean z) {
        this.f31008u0 = false;
        m8310D0(chat, p7Var, z);
        TdApi.InputMessageContent inputMessageContent = null;
        if (this.f30990c0.m2220u6(chat)) {
            if (p7Var != null) {
                inputMessageContent = p7Var.m26298d();
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
    public boolean mo8252u(String str, TdApi.WebPage webPage) {
        View$OnClickListenerC2971rh rhVar = this.f30980P;
        if (rhVar == null) {
            return false;
        }
        if (this.f31009v0) {
            this.f31009v0 = false;
            rhVar.m32583Sk(str, webPage);
            return false;
        }
        rhVar.m32511Xq(str, webPage);
        return true;
    }

    public C9186f1 m8251u0(View$OnClickListenerC2971rh rhVar) {
        this.f30980P = rhVar;
        return new C9186f1(this, new C9561c());
    }

    @Override
    public boolean mo8250v() {
        return this.f30992e0 == null && ((AbstractView$OnTouchListenerC7889a) getContext()).m14502d0();
    }

    public void m8249v0(CharSequence charSequence, boolean z) {
        this.f31010w0 = true;
        setText(charSequence);
        if (z) {
            C1399s0.m37172m0(this, charSequence != null ? charSequence.length() : 0);
        }
        this.f31010w0 = false;
    }

    @Override
    public int mo8248w(int i, String str) {
        View$OnClickListenerC2971rh rhVar = this.f30980P;
        if (rhVar == null || !rhVar.m32399gl()) {
            return 0;
        }
        if (!C4868i.m24727c2().m24764X2(2L)) {
            return C4868i.m24727c2().m24799S2() ? 0 : 2;
        }
        AlertDialog alertDialog = this.f31005r0;
        if (alertDialog != null && alertDialog.isShowing()) {
            return 1;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f30980P.mo4347s(), C11524j.m150v());
        builder.setTitle(C4403w.m27871i1(R.string.AppName));
        builder.setMessage(C4403w.m27871i1(R.string.SecretLinkPreviewAlert));
        builder.setPositiveButton(C4403w.m27871i1(R.string.SecretLinkPreviewEnable), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                RunnableC9558i0.this.m8266l0(dialogInterface, i2);
            }
        });
        builder.setNegativeButton(C4403w.m27871i1(R.string.SecretLinkPreviewDisable), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                RunnableC9558i0.this.m8264m0(dialogInterface, i2);
            }
        });
        builder.setCancelable(false);
        this.f31005r0 = this.f30980P.m9344Sd(builder);
        return 1;
    }

    public void m8247w0(int i, Object... objArr) {
        String j1 = C4403w.m27867j1(i, objArr);
        this.f30999l0 = i;
        this.f31000m0 = objArr;
        if (!C5070i.m24068c(j1, this.f31001n0)) {
            this.f31001n0 = j1;
            if (this.f30980P == null) {
                setHint(j1);
                return;
            }
            this.f31002o0 = C7389v0.m16680T1(j1, getPaint());
            this.f31003p0 = 0;
            m8291W();
        }
    }

    public void m8246x0(boolean z, String str) {
        this.f30991d0.m21707J0(z, getText().toString().equals(str));
    }

    public final void m8245y0(int r19, int r20, org.drinkless.p210td.libcore.telegram.TdApi.TextEntityType r21) {
        throw new UnsupportedOperationException("Method not decompiled: p291uc.RunnableC9558i0.m8245y0(int, int, org.drinkless.td.libcore.telegram.TdApi$TextEntityType):void");
    }

    public boolean m8243z0(int i) {
        TdApi.TextEntityType textEntityType;
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart == selectionEnd) {
            return false;
        }
        switch (i) {
            case R.id.btn_bold:
                textEntityType = new TdApi.TextEntityTypeBold();
                break;
            case R.id.btn_italic:
                textEntityType = new TdApi.TextEntityTypeItalic();
                break;
            case R.id.btn_link:
                URLSpan[] uRLSpanArr = (URLSpan[]) getText().getSpans(selectionStart, selectionEnd, URLSpan.class);
                m8288Z((uRLSpanArr == null || uRLSpanArr.length <= 0) ? null : uRLSpanArr[0], selectionStart, selectionEnd);
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
        m8245y0(selectionStart, selectionEnd, textEntityType);
        return true;
    }
}
