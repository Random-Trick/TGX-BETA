package hd;

import android.net.Uri;
import bd.c;
import ce.j0;
import de.rh;
import java.util.regex.Pattern;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import ud.v4;

public class i {
    public static final Pattern f13066h = Pattern.compile("^(?:.+\\.)?(?:youtube\\.com|youtu\\.be)$");
    public static final Pattern f13067i = Pattern.compile("^(?:.+\\.)?(?:vimeo\\.com)$");
    public static final Pattern f13068j = Pattern.compile("^(?:.+\\.)?(?:dailymotion\\.com)$");
    public static final Pattern f13069k = Pattern.compile("^(?:.+\\.)?(?:coub\\.com)$");
    public static final Pattern f13070l = Pattern.compile("^(?:.+\\.)?(?:soundcloud\\.com)$");
    public final int f13071a;
    public final String f13072b;
    public final String f13073c;
    public final String f13074d;
    public final int f13075e;
    public final int f13076f;
    public final TdApi.Photo f13077g;

    public i(int i10, String str, int i11, int i12, TdApi.Photo photo, String str2, String str3) {
        this.f13071a = i10;
        this.f13072b = str;
        this.f13075e = i11;
        this.f13076f = i12;
        this.f13077g = photo;
        this.f13073c = str2;
        this.f13074d = str3;
    }

    public static boolean e(String str) {
        if (ib.i.i(str)) {
            return false;
        }
        try {
            if (!str.startsWith("https://") && !str.startsWith("http://")) {
                str = "https://" + str;
            }
            return Uri.parse(str).getHost().matches("^(?:www\\.|m\\.)?(?:youtube\\.com|youtu\\.be)$");
        } catch (Throwable th) {
            Log.e("Unable to parse embedded service", th, new Object[0]);
            return false;
        }
    }

    public static hd.i g(java.lang.String r15, int r16, int r17, org.drinkless.td.libcore.telegram.TdApi.Photo r18, java.lang.String r19) {
        throw new UnsupportedOperationException("Method not decompiled: hd.i.g(java.lang.String, int, int, org.drinkless.td.libcore.telegram.TdApi$Photo, java.lang.String):hd.i");
    }

    public static i h(TdApi.PageBlockEmbedded pageBlockEmbedded) {
        return g(pageBlockEmbedded.url, pageBlockEmbedded.width, pageBlockEmbedded.height, pageBlockEmbedded.posterPhoto, null);
    }

    public static i i(TdApi.WebPage webPage) {
        i g10 = g(webPage.url, webPage.embedWidth, webPage.embedHeight, webPage.photo, webPage.embedUrl);
        if (g10 != null) {
            return g10;
        }
        if (!"iframe".equals(webPage.embedType) || ib.i.i(webPage.embedUrl)) {
            return null;
        }
        if ((("gif".equals(webPage.type) && webPage.animation != null) || (("video".equals(webPage.type) && webPage.photo != null && webPage.animation == null) || ("photo".equals(webPage.type) && webPage.photo != null && webPage.animation == null))) && webPage.video == null && webPage.videoNote == null && webPage.document == null && webPage.audio == null) {
            return new i(k(ib.i.b(webPage.url)), webPage.url, webPage.embedWidth, webPage.embedHeight, webPage.photo, webPage.embedUrl, webPage.embedType);
        }
        return null;
    }

    public static i j(String str) {
        return g(str, 0, 0, null, null);
    }

    public static int k(String str) {
        if (!ib.i.i(str)) {
            if (str.startsWith("www.")) {
                str = str.substring(3);
            } else if (str.startsWith("m.")) {
                str = str.substring(2);
            }
            Pattern[] patternArr = {f13066h, f13067i, f13068j, f13069k, f13070l};
            int i10 = 0;
            for (int i11 = 0; i11 < 5; i11++) {
                i10++;
                if (patternArr[i11].matcher(str).matches()) {
                    return i10;
                }
            }
        }
        return 0;
    }

    public int a() {
        int i10 = this.f13071a;
        if (i10 == 1) {
            return R.drawable.logo_youtube;
        }
        if (i10 == 2) {
            return R.drawable.logo_vimeo;
        }
        if (i10 != 3) {
            return 0;
        }
        return R.drawable.logo_dailymotion;
    }

    public float b() {
        int i10 = this.f13071a;
        if (i10 == 1) {
            return 1.0f;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0.0f : 4.0f;
        }
        return 6.0f;
    }

    public float c() {
        int i10 = this.f13071a;
        if (i10 == 1) {
            return 1.0f;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0.0f : 4.0f;
        }
        return 5.0f;
    }

    public float d() {
        int i10 = this.f13071a;
        if (i10 == 1) {
            return 1.0f;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0.0f : 4.0f;
        }
        return 5.0f;
    }

    public void f(a aVar) {
        v4<?> F = aVar.Q1().F();
        boolean z10 = (F instanceof rh) && ((rh) F).gl();
        if (F == null || !c.L1(F, this, z10)) {
            j0.c0(this.f13072b);
        }
    }
}
