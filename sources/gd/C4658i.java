package gd;

import ad.AbstractView$OnClickListenerC0259c;
import android.net.Uri;
import be.C1379j0;
import java.util.regex.Pattern;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p038ce.View$OnClickListenerC2971rh;
import p108hb.C5070i;
import td.AbstractC9323v4;

public class C4658i {
    public static final Pattern f15543h = Pattern.compile("^(?:.+\\.)?(?:youtube\\.com|youtu\\.be)$");
    public static final Pattern f15544i = Pattern.compile("^(?:.+\\.)?(?:vimeo\\.com)$");
    public static final Pattern f15545j = Pattern.compile("^(?:.+\\.)?(?:dailymotion\\.com)$");
    public static final Pattern f15546k = Pattern.compile("^(?:.+\\.)?(?:coub\\.com)$");
    public static final Pattern f15547l = Pattern.compile("^(?:.+\\.)?(?:soundcloud\\.com)$");
    public final int f15548a;
    public final String f15549b;
    public final String f15550c;
    public final String f15551d;
    public final int f15552e;
    public final int f15553f;
    public final TdApi.Photo f15554g;

    public C4658i(int i, String str, int i2, int i3, TdApi.Photo photo, String str2, String str3) {
        this.f15548a = i;
        this.f15549b = str;
        this.f15552e = i2;
        this.f15553f = i3;
        this.f15554g = photo;
        this.f15550c = str2;
        this.f15551d = str3;
    }

    public static boolean m26608e(String str) {
        if (C5070i.m24062i(str)) {
            return false;
        }
        try {
            if (!str.startsWith("https://") && !str.startsWith("http://")) {
                str = "https://" + str;
            }
            return Uri.parse(str).getHost().matches("^(?:www\\.|m\\.)?(?:youtube\\.com|youtu\\.be)$");
        } catch (Throwable th) {
            Log.m14725e("Unable to parse embedded service", th, new Object[0]);
            return false;
        }
    }

    public static gd.C4658i m26606g(java.lang.String r15, int r16, int r17, org.drinkless.p210td.libcore.telegram.TdApi.Photo r18, java.lang.String r19) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4658i.m26606g(java.lang.String, int, int, org.drinkless.td.libcore.telegram.TdApi$Photo, java.lang.String):gd.i");
    }

    public static C4658i m26605h(TdApi.PageBlockEmbedded pageBlockEmbedded) {
        return m26606g(pageBlockEmbedded.url, pageBlockEmbedded.width, pageBlockEmbedded.height, pageBlockEmbedded.posterPhoto, null);
    }

    public static C4658i m26604i(TdApi.WebPage webPage) {
        C4658i g = m26606g(webPage.url, webPage.embedWidth, webPage.embedHeight, webPage.photo, webPage.embedUrl);
        if (g != null) {
            return g;
        }
        if (!"iframe".equals(webPage.embedType) || C5070i.m24062i(webPage.embedUrl)) {
            return null;
        }
        if ((("gif".equals(webPage.type) && webPage.animation != null) || (("video".equals(webPage.type) && webPage.photo != null && webPage.animation == null) || ("photo".equals(webPage.type) && webPage.photo != null && webPage.animation == null))) && webPage.video == null && webPage.videoNote == null && webPage.document == null && webPage.audio == null) {
            return new C4658i(m26602k(C5070i.m24069b(webPage.url)), webPage.url, webPage.embedWidth, webPage.embedHeight, webPage.photo, webPage.embedUrl, webPage.embedType);
        }
        return null;
    }

    public static C4658i m26603j(String str) {
        return m26606g(str, 0, 0, null, null);
    }

    public static int m26602k(String str) {
        if (!C5070i.m24062i(str)) {
            if (str.startsWith("www.")) {
                str = str.substring(3);
            } else if (str.startsWith("m.")) {
                str = str.substring(2);
            }
            Pattern[] patternArr = {f15543h, f15544i, f15545j, f15546k, f15547l};
            int i = 0;
            for (int i2 = 0; i2 < 5; i2++) {
                i++;
                if (patternArr[i2].matcher(str).matches()) {
                    return i;
                }
            }
        }
        return 0;
    }

    public int m26612a() {
        int i = this.f15548a;
        if (i == 1) {
            return R.drawable.logo_youtube;
        }
        if (i == 2) {
            return R.drawable.logo_vimeo;
        }
        if (i != 3) {
            return 0;
        }
        return R.drawable.logo_dailymotion;
    }

    public float m26611b() {
        int i = this.f15548a;
        if (i == 1) {
            return 1.0f;
        }
        if (i != 2) {
            return i != 3 ? 0.0f : 4.0f;
        }
        return 6.0f;
    }

    public float m26610c() {
        int i = this.f15548a;
        if (i == 1) {
            return 1.0f;
        }
        if (i != 2) {
            return i != 3 ? 0.0f : 4.0f;
        }
        return 5.0f;
    }

    public float m26609d() {
        int i = this.f15548a;
        if (i == 1) {
            return 1.0f;
        }
        if (i != 2) {
            return i != 3 ? 0.0f : 4.0f;
        }
        return 5.0f;
    }

    public void m26607f(AbstractView$OnTouchListenerC7889a aVar) {
        AbstractC9323v4<?> F = aVar.m14551P1().m9762F();
        boolean z = (F instanceof View$OnClickListenerC2971rh) && ((View$OnClickListenerC2971rh) F).m32399gl();
        if (F == null || !AbstractView$OnClickListenerC0259c.m41992O1(F, this, z)) {
            C1379j0.m37339c0(this.f15549b);
        }
    }
}
