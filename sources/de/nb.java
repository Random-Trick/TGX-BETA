package de;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.c0;
import ce.e0;
import ce.j0;
import ce.o;
import ce.p0;
import de.o4;
import de.y00;
import de.ys;
import gd.w;
import hd.t2;
import he.i;
import ie.g0;
import ie.h0;
import ie.j;
import ie.u0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ne.j2;
import ne.k2;
import ne.o3;
import ne.p;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import org.thunderdog.challegram.sync.SyncAdapter;
import org.thunderdog.challegram.widget.ViewPager;
import ud.b5;
import ud.d1;
import ud.e2;
import ud.f2;
import ud.q1;
import ud.v4;
import ud.w1;
import ud.x4;
import ud.y1;
import ud.z1;
import ud.z4;
import zd.d0;
import zd.m0;
import zd.n0;
import zd.o6;
import zd.rb;
import zd.sb;

public class nb extends x4<Void> implements w1.b, sb, j.a, n0 {
    public long B0;
    public p C0;
    public int D0;
    public boolean E0;
    public View F0;
    public o4 H0;
    public o3 I0;
    public TdApi.LanguagePackInfo J0;
    public o6 K0;
    public String L0;
    public Intent M0;
    public e2 N0;
    public boolean O0;
    public FrameLayoutFix f8859x0;
    public w1 f8860y0;
    public int f8861z0 = 0;
    public int A0 = -1;
    public int G0 = -1;

    public class a implements b5.d {
        public a() {
        }

        @Override
        public void a(View view, MotionEvent motionEvent, int i10, boolean z10) {
            if (!z10 || nb.this.A0 == -1) {
                nb.this.Ph(-1, motionEvent, view.getMeasuredHeight(), false);
            } else {
                nb nbVar = nb.this;
                nbVar.Mh(nbVar.A0);
                nb.this.Ph(-1, motionEvent, view.getMeasuredHeight(), true);
            }
            nb.this.Nh(view, false);
        }

        @Override
        public void b(View view, MotionEvent motionEvent, int i10) {
            int i11;
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float measuredWidth = x10 + ((nb.this.C0.getMeasuredWidth() - view.getMeasuredWidth()) / 2);
            float measuredHeight = y10 - (view.getMeasuredHeight() + nb.this.f8859x0.getTranslationY());
            if (measuredWidth >= 0.0f && measuredWidth < nb.this.C0.getMeasuredWidth()) {
                if (measuredHeight > nb.this.C0.getTop() + nb.this.C0.getChildAt(0).getBottom()) {
                    if (measuredHeight < nb.this.C0.getHeight()) {
                        i11 = 1;
                        while (i11 < nb.this.C0.getChildCount()) {
                            View childAt = nb.this.C0.getChildAt(i11);
                            if (measuredHeight >= childAt.getTop() && measuredHeight < childAt.getBottom() && childAt.getVisibility() != 8) {
                                break;
                            }
                            i11++;
                        }
                    }
                } else {
                    i11 = 0;
                }
                nb.this.Ph(i11, motionEvent, view.getMeasuredHeight(), false);
            }
            i11 = -1;
            nb.this.Ph(i11, motionEvent, view.getMeasuredHeight(), false);
        }

        @Override
        public void c(View view, MotionEvent motionEvent, int i10) {
            nb.this.Nh(view, true);
        }

        @Override
        public boolean d(View view, MotionEvent motionEvent, int i10) {
            return i10 == 0 && nb.this.bi();
        }
    }

    public class b extends p {
        public b(Context context, v4 v4Var, boolean z10) {
            super(context, v4Var, z10);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (nb.this.F0 != null) {
                nb nbVar = nb.this;
                nbVar.Gh(nbVar.F0);
            }
        }
    }

    public class c implements o3.b {
        public c() {
        }

        @Override
        public void a(o3 o3Var, float f10) {
            nb.this.f8860y0.setTranslationY((-o3Var.getMeasuredHeight()) * f10);
        }

        @Override
        public void b(o3 o3Var) {
            if (nb.this.I0 == o3Var) {
                nb.this.f8859x0.removeView(nb.this.I0);
                nb.this.I0.j(nb.this);
                nb.this.I0 = null;
            }
        }
    }

    public class d extends RecyclerView.t {
        public float f8864a;
        public float f8865b;
        public final int f8866c;

        public d(int i10) {
            this.f8866c = i10;
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            float f10 = this.f8864a + i11;
            this.f8864a = f10;
            if (i11 < 0 && this.f8865b - f10 >= a0.p()) {
                nb.this.Xh(this.f8866c, true);
                this.f8865b = this.f8864a;
            } else if (this.f8864a - this.f8865b > a0.q()) {
                nb.this.Xh(this.f8866c, false);
                this.f8865b = this.f8864a;
            }
            if (Math.abs(this.f8864a - this.f8865b) > a0.q()) {
                this.f8864a = 0.0f;
                this.f8865b = 0.0f;
            }
        }
    }

    public class e implements a.k {
        public final org.thunderdog.challegram.a f8868a;

        public e(org.thunderdog.challegram.a aVar) {
            this.f8868a = aVar;
        }

        @Override
        public void e(org.thunderdog.challegram.a aVar, boolean z10) {
            if (z10) {
                this.f8868a.z2(this);
                nb.this.Sh();
            }
        }
    }

    public class f extends kb.b {
        public f() {
        }

        @Override
        public void b() {
            j0.y0(R.string.ProcessingFileWait, 0);
        }
    }

    public class g implements y00.q {
        public final ArrayList f8870a;
        public final o6 f8871b;
        public final boolean f8872c;

        public g(ArrayList arrayList, o6 o6Var, boolean z10) {
            this.f8870a = arrayList;
            this.f8871b = o6Var;
            this.f8872c = z10;
        }

        @Override
        public void a(long j10, TdApi.Chat chat, TdApi.MessageSendOptions messageSendOptions, ArrayList<TdApi.Function> arrayList) {
            Iterator it = this.f8870a.iterator();
            ArrayList arrayList2 = null;
            while (it.hasNext()) {
                TdApi.InputMessageContent B = this.f8871b.l5().B((TdApi.InputMessageContent) it.next(), ob.a.j(j10));
                if (!this.f8872c) {
                    t2.S4(this.f8871b, j10, messageSendOptions, arrayList, B);
                } else if (t2.Z0(B) == 1) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(B);
                    if (arrayList2.size() == 10) {
                        t2.R4(this.f8871b, j10, messageSendOptions, arrayList, arrayList2);
                    }
                } else {
                    t2.R4(this.f8871b, j10, messageSendOptions, arrayList, arrayList2);
                    t2.S4(this.f8871b, j10, messageSendOptions, arrayList, B);
                }
            }
            if (this.f8872c) {
                t2.R4(this.f8871b, j10, messageSendOptions, arrayList, arrayList2);
            }
        }

        @Override
        public CharSequence b(long j10) {
            Iterator it = this.f8870a.iterator();
            while (it.hasNext()) {
                o6 o6Var = this.f8871b;
                CharSequence a62 = o6Var.a6(o6Var.P3(j10), (TdApi.InputMessageContent) it.next());
                if (a62 != null) {
                    return a62;
                }
            }
            return null;
        }
    }

    public nb(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public boolean Ah(TdApi.LanguagePackInfo languagePackInfo, final String str, View view, int i10) {
        if (i10 == R.id.btn_cancel) {
            i.c2().y5(str);
        } else if (i10 == R.id.btn_done) {
            this.f24495b.M1(languagePackInfo, new kb.i() {
                @Override
                public final void a(boolean z10) {
                    nb.zh(str, z10);
                }
            }, true);
        } else if (i10 == R.id.btn_languageSettings) {
            i.c2().y5(str);
            ac(new fv(this.f24493a, this.f24495b));
        }
        return true;
    }

    public void Bh(final TdApi.LanguagePackInfo languagePackInfo, Map map, final String str) {
        TdApi.LanguagePackInfo languagePackInfo2;
        if (!Sa() && (languagePackInfo2 = this.J0) != null && languagePackInfo.f19945id.equals(languagePackInfo2.f19945id)) {
            jb.c cVar = new jb.c(3);
            u0 u0Var = new u0(3);
            jb.c cVar2 = new jb.c(3);
            jb.c cVar3 = new jb.c(3);
            cVar.a(R.id.btn_done);
            u0Var.b(t2.p0(map, w.e1(R.string.language_continueInLanguage), xa.f10007a));
            cVar2.a(3);
            cVar3.a(R.drawable.baseline_check_24);
            cVar.a(R.id.btn_cancel);
            cVar3.a(R.drawable.baseline_cancel_24);
            cVar2.a(1);
            u0Var.a(R.string.Cancel);
            cVar.a(R.id.btn_languageSettings);
            u0Var.a(R.string.MoreLanguages);
            cVar2.a(1);
            cVar3.a(R.drawable.baseline_language_24);
            j2 ee2 = ee(c0.l(this, t2.p0(map, w.e1(R.string.language_continueInLanguagePopupText), ya.f10160a), null), cVar.e(), u0Var.d(), cVar2.e(), cVar3.e(), new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i10) {
                    return g0.b(this, i10);
                }

                @Override
                public final boolean r3(View view, int i10) {
                    boolean Ah;
                    Ah = nb.this.Ah(languagePackInfo, str, view, i10);
                    return Ah;
                }
            });
            if (ee2 != null) {
                ee2.setDisableCancelOnTouchDown(true);
            }
            this.J0 = null;
        }
    }

    public void Ch(String[] strArr, final TdApi.LanguagePackInfo languagePackInfo, final String str, final Map map) {
        if (map == null || map.size() < strArr.length) {
            Log.w("Suggested language is bad, ignoring. languagePackId:%s", languagePackInfo.f19945id);
            TdApi.LanguagePackInfo languagePackInfo2 = this.J0;
            if (languagePackInfo2 != null && languagePackInfo.f19945id.equals(languagePackInfo2.f19945id)) {
                this.J0 = null;
                return;
            }
            return;
        }
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                nb.this.Bh(languagePackInfo, map, str);
            }
        });
    }

    public void Dh(int i10, SparseIntArray sparseIntArray) {
        SyncAdapter.e(this.f24493a, this.f24495b, true);
    }

    public void Eh(j2 j2Var) {
        this.N0 = null;
    }

    public static boolean Fh(e2 e2Var, View view, boolean z10) {
        int L0;
        if (!z10 || (L0 = e2Var.f24134a.L0(R.id.btn_neverAllow)) == -1 || !e2Var.f24134a.D0().get(L0).D()) {
            return false;
        }
        i.c2().u2(128L);
        return false;
    }

    public static String Kh(Intent intent) {
        CharSequence charSequenceExtra;
        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
        if (stringExtra == null && (charSequenceExtra = intent.getCharSequenceExtra("android.intent.extra.TEXT")) != null) {
            stringExtra = charSequenceExtra.toString();
        }
        return lh(intent.getStringExtra("android.intent.extra.SUBJECT"), stringExtra);
    }

    public static boolean eh(o6 o6Var, ArrayList<TdApi.InputMessageContent> arrayList, String str, Uri uri, String str2) {
        int i10;
        int i11;
        TdApi.InputFile inputFile;
        String v02;
        if (uri == null) {
            return false;
        }
        String U2 = v0.U2(uri);
        if (!ib.i.i(U2)) {
            String g10 = (!str.isEmpty() || (v02 = v0.v0(U2)) == null) ? str : e0.g(v02);
            if (!v0.C(U2)) {
                U2 = uri.toString();
                if (!v0.B(uri)) {
                    return false;
                }
            }
            int length = str2 != null ? str2.trim().length() : 0;
            TdApi.FormattedText formattedText = length > 0 ? new TdApi.FormattedText(str2, null) : null;
            TdApi.FormattedText formattedText2 = (formattedText == null || length > o6Var.T9()) ? null : formattedText;
            TdApi.InputMessageText inputMessageText = formattedText != null ? new TdApi.InputMessageText(formattedText, false, false) : null;
            if (!ib.i.i(g10)) {
                if (g10.equals("image/webp")) {
                    BitmapFactory.Options j10 = org.thunderdog.challegram.loader.b.j(U2);
                    arrayList.add(new TdApi.InputMessageSticker(t2.d0(U2), null, j10.outWidth, j10.outHeight, null));
                    if (inputMessageText != null) {
                        arrayList.add(inputMessageText);
                    }
                    return false;
                } else if (g10.equals("image/gif")) {
                    BitmapFactory.Options h10 = org.thunderdog.challegram.loader.b.h(U2);
                    arrayList.add(new TdApi.InputMessageAnimation(t2.d0(U2), null, null, 0, h10.outWidth, h10.outHeight, formattedText2));
                    if (formattedText2 == null && inputMessageText != null) {
                        arrayList.add(inputMessageText);
                    }
                    return true;
                } else if (g10.startsWith("image/")) {
                    BitmapFactory.Options h11 = org.thunderdog.challegram.loader.b.h(U2);
                    int R0 = v0.R0(U2);
                    int b10 = org.thunderdog.challegram.loader.b.b(h11, 1280, 1280);
                    arrayList.add(new TdApi.InputMessagePhoto(jd.c.w(U2, R0), null, null, ((R0 == 90 || R0 == 270) ? h11.outHeight : h11.outWidth) / b10, ((R0 == 90 || R0 == 270) ? h11.outWidth : h11.outHeight) / b10, formattedText2, 0));
                    if (formattedText2 == null && inputMessageText != null) {
                        arrayList.add(inputMessageText);
                    }
                    return true;
                } else if (g10.startsWith("video/")) {
                    MediaMetadataRetriever p22 = v0.p2(U2);
                    if (p22 != null) {
                        String extractMetadata = p22.extractMetadata(9);
                        int parseLong = ib.i.m(extractMetadata) ? (int) (Long.parseLong(extractMetadata) / 1000) : 0;
                        String extractMetadata2 = p22.extractMetadata(18);
                        int s10 = ib.i.m(extractMetadata2) ? ib.i.s(extractMetadata2) : 0;
                        String extractMetadata3 = p22.extractMetadata(19);
                        int s11 = ib.i.m(extractMetadata3) ? ib.i.s(extractMetadata3) : 0;
                        String extractMetadata4 = p22.extractMetadata(24);
                        int s12 = ib.i.m(extractMetadata4) ? ib.i.s(extractMetadata4) : 0;
                        if (s12 == 90 || s12 == 270) {
                            i10 = s10;
                            i11 = s11;
                        } else {
                            i11 = s10;
                            i10 = s11;
                        }
                        if (fd.a.f11885g) {
                            inputFile = jd.g0.x(U2, null, false);
                        } else {
                            inputFile = t2.d0(U2);
                        }
                        TdApi.InputFile inputFile2 = inputFile;
                        v0.H(p22);
                        arrayList.add(new TdApi.InputMessageVideo(inputFile2, null, null, parseLong, i11, i10, v0.D(inputFile2), formattedText2, 0));
                        if (formattedText2 == null && inputMessageText != null) {
                            arrayList.add(inputMessageText);
                        }
                    }
                    return true;
                }
            }
            t2.g gVar = new t2.g();
            arrayList.add(t2.G5(U2, t2.f0(U2, g10, gVar), gVar, formattedText2));
            if (formattedText2 == null && inputMessageText != null) {
                arrayList.add(inputMessageText);
            }
            return true;
        }
        throw new IllegalArgumentException("filePath cannot be resolved for type " + str + ", uri: " + uri);
    }

    public static String lh(String str, String str2) {
        if (ib.i.i(str2) && ib.i.i(str)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(ib.i.p(str2) + 1 + ib.i.p(str));
        if (!ib.i.i(str) && (ib.i.i(str2) || str2.startsWith("https://") || str2.startsWith("http://"))) {
            sb2.append(str);
        }
        if (!ib.i.i(str2)) {
            if (sb2.length() > 0) {
                sb2.append('\n');
            }
            sb2.append(str2);
        }
        String trim = sb2.toString().trim();
        if (trim.isEmpty()) {
            return null;
        }
        return trim;
    }

    public void nh() {
        p pVar;
        if (!Sa() && (pVar = this.C0) != null) {
            pVar.getChildAt(1).setVisibility(this.f24495b.q6() ? 0 : 8);
        }
    }

    public void oh(int i10, o4 o4Var) {
        if (this.G0 == i10 && this.H0 == o4Var) {
            fh(i10);
            ug(0, true);
        }
    }

    public static void ph(View view) {
    }

    public void qh(o6 o6Var, ArrayList arrayList, boolean z10) {
        y00 y00Var = new y00(this.f24493a, o6Var);
        y00Var.Vi(new y00.m(new g(arrayList, o6Var, z10)).D(true));
        y00Var.ej();
    }

    public void rh(final o6 o6Var, final ArrayList arrayList, final boolean z10) {
        o6Var.hd().post(new Runnable() {
            @Override
            public final void run() {
                nb.this.qh(o6Var, arrayList, z10);
            }
        });
    }

    public void sh(final o6 o6Var, final ArrayList arrayList, final boolean z10) {
        o6Var.Y1(new Runnable() {
            @Override
            public final void run() {
                nb.this.rh(o6Var, arrayList, z10);
            }
        });
    }

    public void th(int i10, boolean z10) {
        if (z10) {
            Sh();
        } else {
            j0.y0(R.string.NoStorageAccess, 0);
        }
    }

    public void uh(java.lang.String r7, zd.o6 r8, android.content.Intent r9) {
        throw new UnsupportedOperationException("Method not decompiled: de.nb.uh(java.lang.String, zd.o6, android.content.Intent):void");
    }

    public void vh(final i.f fVar) {
        if (Ta() && !Sa() && !this.f24493a.z1()) {
            ee(w.m1(R.string.EmojiSetUpdated, fVar.M), new int[]{R.id.btn_downloadFile, R.id.btn_cancel}, new String[]{w.i1(R.string.EmojiSetUpdate), w.i1(R.string.Cancel)}, new int[]{3, 1}, new int[]{R.drawable.baseline_sync_24, R.drawable.baseline_cancel_24}, new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i10) {
                    return g0.b(this, i10);
                }

                @Override
                public final boolean r3(View view, int i10) {
                    boolean wh;
                    wh = nb.this.wh(fVar, view, i10);
                    return wh;
                }
            });
        }
    }

    public boolean wh(i.f fVar, View view, int i10) {
        if (i10 == R.id.btn_cancel) {
            i.c2().W3();
            return true;
        } else if (i10 != R.id.btn_downloadFile) {
            return true;
        } else {
            zs zsVar = new zs(this.f24493a, this.f24495b);
            zsVar.Ad(new ys.c(fVar));
            ac(zsVar);
            return true;
        }
    }

    public static void zh(String str, boolean z10) {
        if (z10) {
            j0.y0(R.string.language_appliedLanguage, 0);
            i.c2().y5(str);
        }
    }

    @Override
    public int A9() {
        return 2;
    }

    @Override
    public void Ac() {
        super.Ac();
        d1 d1Var = this.R;
        if (d1Var != null) {
            d1Var.j4(W9());
        }
        hh();
    }

    @Override
    public void E6(int i10, int i11, boolean z10) {
        if (i10 == 4) {
            Lh(z10, false);
            return;
        }
        o3 o3Var = this.I0;
        if (o3Var != null) {
            o3Var.g(Ta());
        }
    }

    @Override
    public void F0(long j10, long j11) {
        ie.i.a(this, j10, j11);
    }

    @Override
    public void G0(boolean z10) {
        rb.a(this, z10);
    }

    @Override
    public void G2(TdApi.SuggestedAction[] suggestedActionArr, TdApi.SuggestedAction[] suggestedActionArr2) {
        rb.d(this, suggestedActionArr, suggestedActionArr2);
    }

    @Override
    public View Ga() {
        return this.f8859x0;
    }

    @Override
    public boolean Ge() {
        return true;
    }

    public final void Gh(View view) {
        if (this.C0 != null) {
            this.F0 = view;
            int left = view.getLeft();
            View view2 = view;
            do {
                view2 = (View) view2.getParent();
                if (view2 == null) {
                    break;
                }
                left += view2.getLeft();
            } while (view2 != this.f24645v0);
            this.C0.setTranslationX(Math.max(-a0.i(14.0f), (left - (this.C0.getMeasuredWidth() / 2)) + (view.getMeasuredWidth() / 2)));
        }
    }

    public final void Hh() {
        this.f24495b.F4().g0();
        this.f24495b.E4().u0(t(), false, null);
    }

    @Override
    public void Ia() {
        super.Ia();
        w1 w1Var = this.f8860y0;
        if (w1Var != null) {
            w1Var.W1();
        }
        hh();
    }

    public final void Ih(v4<?> v4Var, int i10) {
        if (v4Var instanceof z1) {
            v4Var.get();
            ((z1) v4Var).m2().k(new d(i10));
        }
    }

    @Override
    public void J(int i10, View view) {
        if (i10 == R.id.menu_btn_clear) {
            T8();
        } else if (i10 != R.id.menu_btn_search) {
            super.J(i10, view);
        } else {
            Yc();
        }
    }

    public final o4 Jh(int i10, boolean z10) {
        d0 d0Var;
        o4 kk = new o4(this.f24493a, this.f24495b).kk(this);
        TdApi.ChatListArchive chatListArchive = null;
        if (i10 == 2) {
            d0Var = zd.c0.k(this.f24495b);
        } else if (i10 == 3) {
            d0Var = zd.c0.h(this.f24495b);
        } else if (i10 == 4) {
            d0Var = zd.c0.f(this.f24495b);
        } else if (i10 != 5) {
            d0Var = i10 != 6 ? null : zd.c0.l(this.f24495b);
        } else {
            d0Var = zd.c0.e(this.f24495b);
        }
        if (d0Var != null) {
            o4.h hVar = new o4.h(d0Var);
            if (z10) {
                chatListArchive = ob.b.f19339b;
            }
            kk.hk(hVar.a(chatListArchive).b(true));
        } else if (z10) {
            kk.hk(new o4.h(ob.b.f19339b).b(true));
        }
        return kk;
    }

    public final void Lh(boolean z10, boolean z11) {
        if (this.I0 == null) {
            o3 o3Var = new o3(this.f24493a);
            this.I0 = o3Var;
            o3Var.l(new c());
            this.I0.f(this);
            this.I0.m(w.i1(R.string.AppUpdateReady));
            this.f8859x0.addView(this.I0);
        }
        o3 o3Var2 = this.I0;
        String i12 = w.i1(z10 ? R.string.AppUpdateInstall : R.string.AppUpdateRestart);
        final j c02 = t().c0();
        Objects.requireNonNull(c02);
        Runnable waVar = new Runnable() {
            @Override
            public final void run() {
                j.this.q();
            }
        };
        boolean z12 = true;
        o3Var2.k(i12, waVar, !z10);
        o3 o3Var3 = this.I0;
        if (z11 || !Ta()) {
            z12 = false;
        }
        o3Var3.n(z12);
    }

    public final void Mh(final int i10) {
        int i11 = this.D0;
        if ((i11 == i10 && (i10 != 0 || !this.E0)) || (this.E0 && i11 == 0 && i10 == 1)) {
            gh();
            ug(0, true);
        } else if (this.G0 != i10) {
            gh();
            if (i10 == 0) {
                Oh(false);
            } else {
                if (i10 == 1) {
                    if (this.D0 != 0) {
                        Oh(true);
                    } else {
                        Oh(!this.E0);
                        i10 = this.D0;
                    }
                }
                final o4 Jh = Jh(i10, this.E0);
                this.H0 = Jh;
                this.G0 = i10;
                Jh.fd(new Runnable() {
                    @Override
                    public final void run() {
                        nb.this.oh(i10, Jh);
                    }
                });
                Ih(Jh, 0);
            }
            i10 = 0;
            final o4 Jh2 = Jh(i10, this.E0);
            this.H0 = Jh2;
            this.G0 = i10;
            Jh2.fd(new Runnable() {
                @Override
                public final void run() {
                    nb.this.oh(i10, Jh2);
                }
            });
            Ih(Jh2, 0);
        }
    }

    public final void Nh(View view, boolean z10) {
        if (z10 || this.C0 != null) {
            FrameLayoutFix frameLayoutFix = null;
            int i10 = 0;
            boolean z11 = true;
            if (this.C0 == null) {
                b bVar = new b(this.f24493a, this, true);
                this.C0 = bVar;
                int i11 = -2;
                bVar.setLayoutParams(FrameLayoutFix.q1(-2, -2));
                int i12 = 7;
                int[] iArr = {R.string.CategoryMain, R.string.CategoryArchive, R.string.CategoryPrivate, R.string.CategoryGroup, R.string.CategoryChannels, R.string.CategoryBots, R.string.CategoryUnread};
                p pVar = this.C0;
                pVar.setPadding(pVar.getPaddingLeft(), this.C0.getPaddingTop() + a0.i(14.0f), this.C0.getPaddingRight(), this.C0.getPaddingBottom() + a0.i(13.0f));
                this.C0.setMinimumWidth(a0.i(112.0f));
                int i13 = 0;
                int i14 = 0;
                while (i13 < i12) {
                    int i15 = iArr[i13];
                    TextView b2Var = new b2(this.f24493a);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, i11);
                    layoutParams.gravity = 1;
                    b2Var.setId(R.id.btn_send);
                    b2Var.setLayoutParams(layoutParams);
                    b2Var.setTextSize(1, 15.0f);
                    int i16 = this.D0 == i14 ? R.id.theme_color_textNeutral : R.id.theme_color_textLight;
                    b2Var.setTextColor(ae.j.L(i16));
                    b2Var.setGravity(17);
                    b2Var.setPadding(a0.i(18.0f), a0.i(13.0f), a0.i(18.0f), a0.i(14.0f));
                    z8(b2Var, i16);
                    b2Var.setTypeface(o.i());
                    b2Var.setTag(Integer.valueOf(i14));
                    b2Var.setOnClickListener(sa.f9477a);
                    p0.c0(b2Var, w.i1(P8(i15, b2Var, false, true)));
                    yd.d.i(b2Var);
                    this.C0.addView(b2Var);
                    i14++;
                    i13++;
                    i12 = 7;
                    i11 = -2;
                }
                this.f8859x0.addView(this.C0, 1);
                frameLayoutFix = this.f8859x0;
                this.f24495b.O9().p(this);
            }
            if (z10) {
                this.C0.getChildAt(1).setVisibility(this.f24495b.q6() ? 0 : 8);
                if (this.f24495b.H5().f28794b <= 0 && this.D0 != 6) {
                    z11 = false;
                }
                View childAt = this.C0.getChildAt(6);
                if (!z11) {
                    i10 = 8;
                }
                childAt.setVisibility(i10);
                Gh(view);
            }
            this.C0.f(z10, frameLayoutFix);
        }
    }

    public final void Oh(boolean z10) {
        if (this.E0 != z10) {
            this.E0 = z10;
        }
    }

    public final void Ph(int i10, MotionEvent motionEvent, float f10, boolean z10) {
        int i11 = this.A0;
        if (i11 != i10) {
            if (i11 != -1) {
                View childAt = this.C0.getChildAt(i11);
                childAt.dispatchTouchEvent(MotionEvent.obtain(this.B0, motionEvent.getEventTime(), z10 ? 1 : 3, motionEvent.getX(), (motionEvent.getY() - f10) - childAt.getTop(), motionEvent.getMetaState()));
            }
            this.A0 = i10;
            if (i10 != -1) {
                View childAt2 = this.C0.getChildAt(i10);
                long uptimeMillis = SystemClock.uptimeMillis();
                this.B0 = uptimeMillis;
                childAt2.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, motionEvent.getEventTime(), 0, motionEvent.getX(), (motionEvent.getY() - f10) - childAt2.getTop(), motionEvent.getMetaState()));
            }
        } else if (i10 != -1) {
            View childAt3 = this.C0.getChildAt(i11);
            childAt3.dispatchTouchEvent(MotionEvent.obtain(this.B0, motionEvent.getEventTime(), 2, motionEvent.getX(), (motionEvent.getY() - f10) - childAt3.getTop(), motionEvent.getMetaState()));
        }
    }

    public final void Qh(final o6 o6Var, String str, final ArrayList<TdApi.InputMessageContent> arrayList, final boolean z10) {
        if (!arrayList.isEmpty()) {
            o6Var.hd().post(new Runnable() {
                @Override
                public final void run() {
                    nb.this.sh(o6Var, arrayList, z10);
                }
            });
            return;
        }
        throw new IllegalArgumentException("Unsupported content type: " + str);
    }

    @Override
    public void R(TdApi.ChatList chatList, int i10, int i11) {
        m0.b(this, chatList, i10, i11);
    }

    @Override
    public int R9() {
        return R.id.controller_main;
    }

    public void Rh(o6 o6Var, String str, Intent intent) {
        this.K0 = o6Var;
        this.L0 = str;
        this.M0 = intent;
        Sh();
    }

    @Override
    public boolean S3(int i10, View view) {
        w1 w1Var;
        if (i10 != R.id.user) {
            switch (i10) {
                case R.id.btn_float_addContact:
                    ac(new fk(this.f24493a, this.f24495b).vg(2));
                    return true;
                case R.id.btn_float_call:
                    f5 f5Var = new f5(this.f24493a, this.f24495b);
                    f5Var.zg(8);
                    ac(f5Var);
                    return true;
                case R.id.btn_float_compose:
                    q1 q1Var = this.T;
                    if (q1Var == null || this.R == null || q1Var.S() || this.R.p3() || (w1Var = this.f8860y0) == null) {
                        return false;
                    }
                    w1Var.V1();
                    return false;
                case R.id.btn_float_newChannel:
                    ac(new i5(this.f24493a, this.f24495b));
                    return true;
                case R.id.btn_float_newChat:
                    f5 f5Var2 = new f5(this.f24493a, this.f24495b);
                    f5Var2.zg(4);
                    ac(f5Var2);
                    return true;
                case R.id.btn_float_newGroup:
                    f5 f5Var3 = new f5(this.f24493a, this.f24495b);
                    f5Var3.zg(3);
                    ac(f5Var3);
                    return true;
                case R.id.btn_float_newSecretChat:
                    f5 f5Var4 = new f5(this.f24493a, this.f24495b);
                    f5Var4.zg(6);
                    ac(f5Var4);
                    return true;
                default:
                    return true;
            }
        } else {
            TdApi.User user = (TdApi.User) view.getTag();
            if (user == null) {
                return true;
            }
            this.f24495b.hd().u7(this, user.f19979id, null);
            return true;
        }
    }

    @Override
    public boolean S8(q1 q1Var, float f10, float f11) {
        if (!super.S8(q1Var, f10, f11)) {
            return false;
        }
        if (this.f24645v0 == null || f11 >= d1.a3(true) || f11 < d1.getTopOffset() || f10 >= ((View) this.f24645v0).getMeasuredWidth()) {
            return true;
        }
        return !((z4) this.f24645v0).A1();
    }

    public final void Sh() {
        final o6 o6Var = this.K0;
        final Intent intent = this.M0;
        final String str = this.L0;
        if (intent != null) {
            org.thunderdog.challegram.a t10 = t();
            if (t10.z1()) {
                t10.X(new e(t10));
            } else if (Build.VERSION.SDK_INT < 23 || t().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                this.K0 = null;
                this.M0 = null;
                this.L0 = null;
                new Thread(new Runnable() {
                    @Override
                    public final void run() {
                        nb.this.uh(str, o6Var, intent);
                    }
                }).start();
            } else {
                t().K2(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, new ie.a() {
                    @Override
                    public final void l1(int i10, boolean z10) {
                        nb.this.th(i10, z10);
                    }
                });
            }
        }
    }

    public final void Th(o6 o6Var, Intent intent) {
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        ArrayList<TdApi.InputMessageContent> arrayList = new ArrayList<>(parcelableArrayListExtra.size());
        String type = intent.getType();
        String Kh = Kh(intent);
        Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            Parcelable parcelable = (Parcelable) it.next();
            Uri Y0 = v0.Y0(parcelable);
            if (Y0 == null) {
                throw new IllegalArgumentException("Unknown parcelable type: " + parcelable);
            } else if (eh(o6Var, arrayList, type, Y0, Kh)) {
                Kh = null;
            }
        }
        if (!ib.i.i(Kh)) {
            arrayList.add(0, new TdApi.InputMessageText(new TdApi.FormattedText(Kh, null), false, false));
        }
        Qh(o6Var, type, arrayList, true);
    }

    public final void Uh(o6 o6Var, Intent intent) {
        String type = intent.getType();
        ArrayList<TdApi.InputMessageContent> arrayList = new ArrayList<>();
        if (ib.i.i(type) || !"text/x-vcard".equals(type)) {
            String Kh = Kh(intent);
            Uri Y0 = v0.Y0(intent.getParcelableExtra("android.intent.extra.STREAM"));
            if (Y0 != null) {
                if (v0.p1(Y0)) {
                    throw new IllegalArgumentException("Tried to share internal file: " + Y0.toString());
                } else if (eh(o6Var, arrayList, type, Y0, Kh)) {
                    Kh = null;
                }
            }
            if (!ib.i.i(Kh)) {
                arrayList.add(0, new TdApi.InputMessageText(new TdApi.FormattedText(Kh, null), false, false));
            }
        } else {
            Uri uri = (Uri) intent.getExtras().get("android.intent.extra.STREAM");
            if (uri != null) {
                InputStream openInputStream = j0.q().getContentResolver().openInputStream(uri);
                try {
                    if (openInputStream != null) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openInputStream, ib.i.f14176a));
                        boolean z10 = false;
                        String str = null;
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            String[] split = readLine.split(":");
                            int i10 = 2;
                            if (split.length == 2) {
                                boolean z11 = true;
                                if (split[0].equals("BEGIN") && split[1].equals("VCARD")) {
                                    z10 = true;
                                    str = null;
                                } else if (split[0].equals("END") && split[1].equals("VCARD")) {
                                    z10 = false;
                                }
                                if (z10) {
                                    if (!split[0].startsWith("FN") && (!split[0].startsWith("ORG") || !ib.i.i(str))) {
                                        if (split[0].startsWith("TEL")) {
                                            String D = c0.D(split[1]);
                                            if (!D.isEmpty()) {
                                                if (!arrayList.isEmpty()) {
                                                    Iterator<TdApi.InputMessageContent> it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        TdApi.InputMessageContent next = it.next();
                                                        if ((next instanceof TdApi.InputMessageContact) && ib.i.c(((TdApi.InputMessageContact) next).contact.phoneNumber, D)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                z11 = false;
                                                if (!z11) {
                                                    arrayList.add(new TdApi.InputMessageContact(new TdApi.Contact(D, str, null, null, 0L)));
                                                }
                                            }
                                        }
                                    }
                                    String str2 = "UTF-8";
                                    String[] split2 = split[0].split(";");
                                    int length = split2.length;
                                    int i11 = 0;
                                    String str3 = null;
                                    while (i11 < length) {
                                        String[] split3 = split2[i11].split("=");
                                        if (split3.length == i10) {
                                            if (split3[0].equals("CHARSET")) {
                                                str2 = split3[1];
                                            } else if (split3[0].equals("ENCODING")) {
                                                str3 = split3[1];
                                            }
                                        }
                                        i11++;
                                        i10 = 2;
                                    }
                                    String str4 = split[1];
                                    if (str3 != null && str3.equalsIgnoreCase("QUOTED-PRINTABLE")) {
                                        while (str4.endsWith("=")) {
                                            str4 = str4.substring(0, str4.length() - 1);
                                            String readLine2 = bufferedReader.readLine();
                                            if (readLine2 == null) {
                                                break;
                                            }
                                            str4 = str4 + readLine2;
                                        }
                                        byte[] S = v0.S(str4.getBytes());
                                        if (!(S == null || S.length == 0)) {
                                            str4 = new String(S, str2);
                                        }
                                    }
                                    str = str4;
                                }
                            }
                        }
                        bufferedReader.close();
                        if (arrayList.isEmpty()) {
                            j0.z0("No phone number available to share", 0);
                            openInputStream.close();
                            return;
                        }
                        openInputStream.close();
                    } else {
                        throw new IllegalArgumentException("stream == null (vcard)");
                    }
                } catch (Throwable th) {
                    if (openInputStream != null) {
                        try {
                            openInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("uri == null");
            }
        }
        Qh(o6Var, type, arrayList, false);
    }

    @Override
    public boolean Va() {
        w1 w1Var = this.f8860y0;
        return w1Var != null && w1Var.O1();
    }

    public boolean Vh(v4<?> v4Var) {
        if (Na()) {
            return false;
        }
        if (v4Var != null && cg() != v4Var) {
            return false;
        }
        this.f8860y0.S1();
        return true;
    }

    @Override
    public int W9() {
        return R.id.menu_main;
    }

    public final boolean Wh() {
        final i.f r12 = i.c2().r1();
        if (r12 == null) {
            return false;
        }
        this.f24495b.hd().postDelayed(new Runnable() {
            @Override
            public final void run() {
                nb.this.vh(r12);
            }
        }, 100L);
        return true;
    }

    public final boolean Xh(int i10, boolean z10) {
        o4 jh;
        if (dg() != i10) {
            return false;
        }
        if (z10) {
            return Vh(null);
        }
        if (dg() == 0 && (jh = jh()) != null && jh.ti()) {
            return false;
        }
        this.f8860y0.H1();
        return true;
    }

    public final boolean Yh() {
        final String Hc = this.f24495b.Hc();
        final TdApi.LanguagePackInfo X5 = i.c2().X5(Hc, this.f24495b);
        if (X5 == null) {
            this.J0 = null;
            return false;
        }
        TdApi.LanguagePackInfo languagePackInfo = this.J0;
        if (languagePackInfo != null && languagePackInfo.f19945id.equals(X5.f19945id)) {
            return true;
        }
        this.J0 = X5;
        final String[] A0 = w.A0(new int[]{R.string.language_continueInLanguage, R.string.language_continueInLanguagePopupText, R.string.language_appliedLanguage});
        this.f24495b.g6(X5, A0, new kb.j() {
            @Override
            public final void a(Object obj) {
                nb.this.Ch(A0, X5, Hc, (Map) obj);
            }
        });
        return true;
    }

    @Override
    public void Z8() {
        super.Z8();
        this.f24495b.O9().V(this);
        t().c0().K(this);
        this.f24495b.O9().X(this);
    }

    public final void Zh() {
        if (!Yh()) {
            Wh();
        }
    }

    @Override
    public void a4(TdApi.ChatList chatList, boolean z10, int i10, int i11, int i12) {
        if ((chatList instanceof TdApi.ChatListArchive) && z10) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    nb.this.nh();
                }
            });
        }
    }

    public final void ai() {
        j2 j2Var;
        if (!this.O0) {
            e2 e2Var = this.N0;
            if ((e2Var == null || (j2Var = e2Var.f24138e) == null || j2Var.u2()) && i.c2().X2(128L)) {
                e2 me2 = me(new f2(R.id.btn_notificationSettings).j(new v4.r() {
                    @Override
                    public final void l6(int i10, SparseIntArray sparseIntArray) {
                        nb.this.Dh(i10, sparseIntArray);
                    }
                }).g(new j2.f() {
                    @Override
                    public final void h3(j2 j2Var2) {
                        nb.this.Eh(j2Var2);
                    }

                    @Override
                    public void w(j2 j2Var2) {
                        k2.a(this, j2Var2);
                    }
                }).m(cb.f7638a).d(R.string.NotificationSyncDecline).r(R.string.NotificationSyncAccept).c(false).p(new ra[]{new ra(12, (int) R.id.btn_neverAllow, 0, (int) R.string.NeverShowAgain, false)}).b(w.H0(this, R.string.NotificationSyncOffWarn, new Object[0])));
                this.N0 = me2;
                if (me2 != null) {
                    this.O0 = true;
                }
            }
        }
    }

    public final boolean bi() {
        return true;
    }

    @Override
    public boolean dc() {
        v4<?> bg = bg(0);
        return bg == null || bg.dc();
    }

    @Override
    public void e(String str, TdApi.LanguagePackInfo languagePackInfo) {
        if (Ta()) {
            Zh();
        }
    }

    @Override
    public void f3(boolean z10) {
        rb.b(this, z10);
    }

    @Override
    public int fg() {
        int i10 = a0.i(56.0f);
        return he.d.w().x() ? i10 + a0.i(28.0f) : i10;
    }

    public final void fh(int i10) {
        if (this.G0 == i10) {
            this.G0 = -1;
            v4<?> v4Var = this.H0;
            this.H0 = null;
            ((TextView) this.C0.getChildAt(1)).setTextColor(this.E0 ? ae.j.L(R.id.theme_color_textNeutral) : ae.j.R0());
            TextView textView = (TextView) this.C0.getChildAt(this.D0);
            textView.setTextColor(ae.j.R0());
            qd(textView);
            A8(textView);
            this.D0 = i10;
            TextView textView2 = (TextView) this.C0.getChildAt(i10);
            textView2.setTextColor((this.D0 != 0 || !this.E0) ? ae.j.L(R.id.theme_color_textNeutral) : ae.j.R0());
            qd(textView2);
            z8(textView2, R.id.theme_color_textNeutral);
            this.f24645v0.getTopView().W1(0, w.i1(kh()).toUpperCase());
            sg(0, v4Var);
            if (dg() == 0) {
                Vh(null);
            }
        }
    }

    @Override
    public int gg() {
        return 2;
    }

    public final void gh() {
        o4 o4Var = this.H0;
        if (o4Var != null) {
            o4Var.Z8();
            this.H0 = null;
        }
        this.G0 = -1;
    }

    @Override
    public String[] hg() {
        return new String[]{w.i1(kh()).toUpperCase(), w.i1(R.string.Calls).toUpperCase()};
    }

    public final void hh() {
        int i10;
        y1 y1Var = this.f24645v0;
        if (y1Var != null) {
            RecyclerView recyclerView = ((z4) y1Var).getRecyclerView();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) recyclerView.getLayoutParams();
            int fg = fg();
            if (w.G2()) {
                i10 = fg;
                fg = a0.i(56.0f);
            } else {
                i10 = a0.i(56.0f);
            }
            if (layoutParams.rightMargin != fg || layoutParams.leftMargin != i10) {
                layoutParams.leftMargin = i10;
                layoutParams.rightMargin = fg;
                recyclerView.setLayoutParams(layoutParams);
            }
        }
    }

    public final void ih() {
        if (this.f24495b.ka().p1()) {
            ai();
        } else {
            mh();
        }
    }

    @Override
    public boolean jc(boolean z10) {
        w1 w1Var = this.f8860y0;
        if (w1Var == null || !w1Var.O1()) {
            return tg();
        }
        this.f8860y0.E1();
        return true;
    }

    public final o4 jh() {
        return (o4) bg(0);
    }

    @Override
    public void k4(boolean z10) {
        rb.c(this, z10);
    }

    @Override
    public void kc() {
        super.kc();
        w1 w1Var = this.f8860y0;
        if (w1Var != null) {
            w1Var.E1();
        }
    }

    public final int kh() {
        if (this.E0) {
            int i10 = this.D0;
            return i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? R.string.CategoryArchive : R.string.CategoryArchiveUnread : R.string.CategoryArchiveBots : R.string.CategoryArchiveChannels : R.string.CategoryArchiveGroup : R.string.CategoryArchivePrivate;
        }
        int i11 = this.D0;
        return i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? i11 != 6 ? R.string.Chats : R.string.CategoryUnread : R.string.CategoryBots : R.string.CategoryChannels : R.string.CategoryGroup : R.string.CategoryPrivate;
    }

    @Override
    public int la() {
        return R.id.menu_clear;
    }

    @Override
    public boolean lf(TdApi.Chat chat) {
        o4 jh = jh();
        d0 fi = jh != null ? jh.fi() : null;
        return (fi == null || !fi.k6()) ? super.lf(chat) : fi.a(chat);
    }

    @Override
    public v4<?> mg(Context context, int i10) {
        v4<?> v4Var;
        if (i10 == 0) {
            v4Var = Jh(this.D0, this.E0);
        } else if (i10 == 1) {
            v4Var = new p(this.f24493a, this.f24495b);
        } else if (i10 == 2) {
            v4Var = new qj(this.f24493a, this.f24495b);
        } else {
            throw new IllegalArgumentException("position == " + i10);
        }
        Ih(v4Var, i10);
        return v4Var;
    }

    public final void mh() {
        e2 e2Var = this.N0;
        if (e2Var != null) {
            j2 j2Var = e2Var.f24138e;
            if (j2Var != null) {
                j2Var.s2(true);
            }
            this.N0 = null;
            this.O0 = false;
        }
    }

    @Override
    public void ng(Context context, FrameLayoutFix frameLayoutFix, ViewPager viewPager) {
        FrameLayoutFix frameLayoutFix2 = new FrameLayoutFix(context);
        this.f8859x0 = frameLayoutFix2;
        frameLayoutFix2.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        this.f8859x0.addView(viewPager);
        qf(this.f8859x0);
        frameLayoutFix.addView(this.f8859x0);
        j0.l0(j0.r(context), 18);
        w1 w1Var = new w1(context);
        this.f8860y0 = w1Var;
        w1Var.K1(this, R.id.theme_color_circleButtonActive, R.id.theme_color_circleButtonActiveIcon, new int[]{R.id.btn_float_compose, R.id.btn_float_newSecretChat, R.id.btn_float_newChannel, R.id.btn_float_newGroup, R.id.btn_float_newChat}, new int[]{R.drawable.baseline_create_24, R.drawable.baseline_lock_24, R.drawable.baseline_bullhorn_24, R.drawable.baseline_group_24, R.drawable.baseline_person_24}, new int[]{R.id.theme_color_circleButtonRegular, R.id.theme_color_circleButtonNewSecret, R.id.theme_color_circleButtonNewChannel, R.id.theme_color_circleButtonNewGroup, R.id.theme_color_circleButtonNewChat}, new int[]{R.id.theme_color_circleButtonRegularIcon, R.id.theme_color_circleButtonNewSecretIcon, R.id.theme_color_circleButtonNewChannelIcon, R.id.theme_color_circleButtonNewGroupIcon, R.id.theme_color_circleButtonNewChatIcon}, new int[]{R.string.NewSecretChat, R.string.NewChannel, R.string.NewGroup, R.string.NewChat}, false);
        this.f8860y0.setCallback(this);
        frameLayoutFix.addView(this.f8860y0);
        Hh();
        if (this.M0 != null) {
            Sh();
        }
        this.f24495b.Ue().g();
        this.f24495b.O9().n(this);
        boolean z10 = false;
        rg(0, new Runnable() {
            @Override
            public final void run() {
                nb.this.n9();
            }
        });
        y1 y1Var = this.f24645v0;
        if (y1Var != null) {
            y1Var.getTopView().setOnSlideOffListener(new a());
        }
        t().c0().i(this);
        if (t().c0().M() == 4) {
            if (t().c0().p() == 1) {
                z10 = true;
            }
            Lh(z10, true);
        }
    }

    @Override
    public void o6() {
        super.o6();
        j0.C0();
        ih();
    }

    @Override
    public void pc() {
        super.pc();
        this.f8860y0.G1();
    }

    @Override
    public void pg(int i10, int i11) {
        if (!Na()) {
            this.f8860y0.S1();
        }
        if (i10 == 0) {
            this.f8860y0.R1(R.id.btn_float_compose, R.drawable.baseline_create_24);
        } else if (i10 == 1) {
            this.f8860y0.R1(R.id.btn_float_call, R.drawable.baseline_phone_24);
        } else if (i10 == 2) {
            this.f8860y0.R1(R.id.btn_float_addContact, R.drawable.baseline_person_add_24);
        }
    }

    @Override
    public void q7(boolean z10) {
        rb.f(this, z10);
    }

    @Override
    public boolean qg() {
        return true;
    }

    @Override
    public void sc() {
        super.sc();
        this.f24495b.F4().d0(this.f24495b.A6(), 1);
        if (j0.f5280g == 2) {
            j0.f5280g = 0;
        }
        Zh();
        ih();
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        if (i10 == R.id.menu_clear) {
            d1Var.O1(linearLayout, ia(), ea());
        } else if (i10 != R.id.menu_main) {
            super.u1(i10, d1Var, linearLayout);
        } else {
            d1Var.Z1(linearLayout);
            d1Var.g2(linearLayout, this);
        }
    }

    @Override
    public TdApi.ChatList uf() {
        if (this.E0) {
            return ob.b.f19339b;
        }
        return null;
    }

    @Override
    public int vf() {
        o4 jh = jh();
        d0 fi = jh != null ? jh.fi() : null;
        boolean z10 = jh != null && jh.Wh().getConstructor() == 362770115;
        if (fi == null || !fi.k6()) {
            return z10 ? R.string.MessagesArchive : super.vf();
        }
        return fi.M(z10);
    }

    @Override
    public int wf() {
        return 7;
    }

    @Override
    public boolean wg() {
        return true;
    }

    @Override
    public void xc() {
        super.xc();
        this.f8860y0.T1();
    }

    @Override
    public View zf() {
        return kg();
    }
}
