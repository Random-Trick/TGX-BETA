package ce;

import ae.j;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import gd.w;
import ib.d;
import org.thunderdog.challegram.R;
import ra.k;

public final class z {
    public static Paint A;
    public static Paint B;
    public static Paint C;
    public static Paint D;
    public static Paint E;
    public static Paint F;
    public static Paint G;
    public static Paint H;
    public static Paint I;
    public static Paint J;
    public static Paint K;
    public static Paint L;
    public static Paint M;
    public static Paint N;
    public static Paint O;
    public static Paint f5401a;
    public static Paint f5402b;
    public static Paint f5403c;
    public static Paint f5404d;
    public static Paint f5405e;
    public static Paint f5406f;
    public static Paint f5407g;
    public static Paint f5408h;
    public static Paint f5409i;
    public static Paint f5410j;
    public static Paint f5411k;
    public static Paint f5412l;
    public static Paint f5413m;
    public static Paint f5414n;
    public static Paint f5415o;
    public static Paint f5416p;
    public static Paint f5417q;
    public static Paint f5418r;
    public static Paint f5419s;
    public static Paint f5420t;
    public static Paint f5421u;
    public static Paint f5422v;
    public static Paint f5423w;
    public static Paint f5424x;
    public static Paint f5425y;
    public static Paint f5426z;

    public static final Paint a(Paint paint, int i10) {
        if (paint != null && paint.getColor() == i10) {
            return paint;
        }
        if (paint == null) {
            paint = new Paint(7);
        }
        paint.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        paint.setColor(i10);
        return paint;
    }

    public static final Paint b(int i10) {
        return d(i10, 0.0f, 2, null);
    }

    public static final Paint c(int i10, float f10) {
        int i11;
        if (!(f10 == 1.0f)) {
            i11 = d.a(f10, j.L(i10));
        } else {
            i11 = j.L(i10);
        }
        switch (i10) {
            case R.id.theme_color_avatar_content:
                Paint paint = f5411k;
                if (paint != null) {
                    return a(paint, i11);
                }
                Paint a10 = a(paint, i11);
                f5411k = a10;
                k.c(a10);
                return a10;
            case R.id.theme_color_background_icon:
                Paint paint2 = f5403c;
                if (paint2 != null) {
                    return a(paint2, i11);
                }
                Paint a11 = a(paint2, i11);
                f5403c = a11;
                k.c(a11);
                return a11;
            case R.id.theme_color_badgeFailedText:
                Paint paint3 = f5422v;
                if (paint3 != null) {
                    return a(paint3, i11);
                }
                Paint a12 = a(paint3, i11);
                f5422v = a12;
                k.c(a12);
                return a12;
            case R.id.theme_color_badgeMuted:
                Paint paint4 = f5423w;
                if (paint4 != null) {
                    return a(paint4, i11);
                }
                Paint a13 = a(paint4, i11);
                f5423w = a13;
                k.c(a13);
                return a13;
            case R.id.theme_color_badgeMutedText:
                Paint paint5 = f5424x;
                if (paint5 != null) {
                    return a(paint5, i11);
                }
                Paint a14 = a(paint5, i11);
                f5424x = a14;
                k.c(a14);
                return a14;
            case R.id.theme_color_badgeText:
                Paint paint6 = f5421u;
                if (paint6 != null) {
                    return a(paint6, i11);
                }
                Paint a15 = a(paint6, i11);
                f5421u = a15;
                k.c(a15);
                return a15;
            case R.id.theme_color_bubbleIn_time:
                Paint paint7 = D;
                if (paint7 != null) {
                    return a(paint7, i11);
                }
                Paint a16 = a(paint7, i11);
                D = a16;
                k.c(a16);
                return a16;
            case R.id.theme_color_bubbleOut_file:
                Paint paint8 = H;
                if (paint8 != null) {
                    return a(paint8, i11);
                }
                Paint a17 = a(paint8, i11);
                H = a17;
                k.c(a17);
                return a17;
            case R.id.theme_color_bubbleOut_inlineIcon:
                Paint paint9 = F;
                if (paint9 != null) {
                    return a(paint9, i11);
                }
                Paint a18 = a(paint9, i11);
                F = a18;
                k.c(a18);
                return a18;
            case R.id.theme_color_bubbleOut_messageAuthor:
                Paint paint10 = K;
                if (paint10 != null) {
                    return a(paint10, i11);
                }
                Paint a19 = a(paint10, i11);
                K = a19;
                k.c(a19);
                return a19;
            case R.id.theme_color_bubbleOut_ticks:
                Paint paint11 = I;
                if (paint11 != null) {
                    return a(paint11, i11);
                }
                Paint a20 = a(paint11, i11);
                I = a20;
                k.c(a20);
                return a20;
            case R.id.theme_color_bubbleOut_ticksRead:
                Paint paint12 = J;
                if (paint12 != null) {
                    return a(paint12, i11);
                }
                Paint a21 = a(paint12, i11);
                J = a21;
                k.c(a21);
                return a21;
            case R.id.theme_color_bubbleOut_time:
                Paint paint13 = E;
                if (paint13 != null) {
                    return a(paint13, i11);
                }
                Paint a22 = a(paint13, i11);
                E = a22;
                k.c(a22);
                return a22;
            case R.id.theme_color_bubbleOut_waveformActive:
                Paint paint14 = G;
                if (paint14 != null) {
                    return a(paint14, i11);
                }
                Paint a23 = a(paint14, i11);
                G = a23;
                k.c(a23);
                return a23;
            case R.id.theme_color_bubble_mediaOverlayText:
                Paint paint15 = C;
                if (paint15 != null) {
                    return a(paint15, i11);
                }
                Paint a24 = a(paint15, i11);
                C = a24;
                k.c(a24);
                return a24;
            case R.id.theme_color_bubble_mediaTimeText:
                Paint paint16 = A;
                if (paint16 != null) {
                    return a(paint16, i11);
                }
                Paint a25 = a(paint16, i11);
                A = a25;
                k.c(a25);
                return a25;
            case R.id.theme_color_bubble_mediaTimeText_noWallpaper:
                Paint paint17 = B;
                if (paint17 != null) {
                    return a(paint17, i11);
                }
                Paint a26 = a(paint17, i11);
                B = a26;
                k.c(a26);
                return a26;
            case R.id.theme_color_chatListIcon:
                Paint paint18 = f5419s;
                if (paint18 != null) {
                    return a(paint18, i11);
                }
                Paint a27 = a(paint18, i11);
                f5419s = a27;
                k.c(a27);
                return a27;
            case R.id.theme_color_chatListMute:
                Paint paint19 = f5418r;
                if (paint19 != null) {
                    return a(paint19, i11);
                }
                Paint a28 = a(paint19, i11);
                f5418r = a28;
                k.c(a28);
                return a28;
            case R.id.theme_color_chatListVerify:
                Paint paint20 = f5420t;
                if (paint20 != null) {
                    return a(paint20, i11);
                }
                Paint a29 = a(paint20, i11);
                f5420t = a29;
                k.c(a29);
                return a29;
            case R.id.theme_color_chatSendButton:
                Paint paint21 = f5425y;
                if (paint21 != null) {
                    return a(paint21, i11);
                }
                Paint a30 = a(paint21, i11);
                f5425y = a30;
                k.c(a30);
                return a30;
            case R.id.theme_color_file:
                Paint paint22 = L;
                if (paint22 != null) {
                    return a(paint22, i11);
                }
                Paint a31 = a(paint22, i11);
                L = a31;
                k.c(a31);
                return a31;
            case R.id.theme_color_headerButtonIcon:
                Paint paint23 = f5414n;
                if (paint23 != null) {
                    return a(paint23, i11);
                }
                Paint a32 = a(paint23, i11);
                f5414n = a32;
                k.c(a32);
                return a32;
            case R.id.theme_color_headerIcon:
                Paint paint24 = f5413m;
                if (paint24 != null) {
                    return a(paint24, i11);
                }
                Paint a33 = a(paint24, i11);
                f5413m = a33;
                k.c(a33);
                return a33;
            case R.id.theme_color_headerText:
                Paint paint25 = f5412l;
                if (paint25 != null) {
                    return a(paint25, i11);
                }
                Paint a34 = a(paint25, i11);
                f5412l = a34;
                k.c(a34);
                return a34;
            case R.id.theme_color_icon:
                Paint paint26 = f5404d;
                if (paint26 != null) {
                    return a(paint26, i11);
                }
                Paint a35 = a(paint26, i11);
                f5404d = a35;
                k.c(a35);
                return a35;
            case R.id.theme_color_iconActive:
                Paint paint27 = f5405e;
                if (paint27 != null) {
                    return a(paint27, i11);
                }
                Paint a36 = a(paint27, i11);
                f5405e = a36;
                k.c(a36);
                return a36;
            case R.id.theme_color_iconLight:
                Paint paint28 = f5406f;
                if (paint28 != null) {
                    return a(paint28, i11);
                }
                Paint a37 = a(paint28, i11);
                f5406f = a37;
                k.c(a37);
                return a37;
            case R.id.theme_color_iconNegative:
                Paint paint29 = f5408h;
                if (paint29 != null) {
                    return a(paint29, i11);
                }
                Paint a38 = a(paint29, i11);
                f5408h = a38;
                k.c(a38);
                return a38;
            case R.id.theme_color_iconPositive:
                Paint paint30 = f5407g;
                if (paint30 != null) {
                    return a(paint30, i11);
                }
                Paint a39 = a(paint30, i11);
                f5407g = a39;
                k.c(a39);
                return a39;
            case R.id.theme_color_inlineIcon:
                Paint paint31 = f5409i;
                if (paint31 != null) {
                    return a(paint31, i11);
                }
                Paint a40 = a(paint31, i11);
                f5409i = a40;
                k.c(a40);
                return a40;
            case R.id.theme_color_messageAuthor:
                Paint paint32 = f5426z;
                if (paint32 != null) {
                    return a(paint32, i11);
                }
                Paint a41 = a(paint32, i11);
                f5426z = a41;
                k.c(a41);
                return a41;
            case R.id.theme_color_passcodeIcon:
                Paint paint33 = f5415o;
                if (paint33 != null) {
                    return a(paint33, i11);
                }
                Paint a42 = a(paint33, i11);
                f5415o = a42;
                k.c(a42);
                return a42;
            case R.id.theme_color_playerCoverIcon:
                Paint paint34 = f5410j;
                if (paint34 != null) {
                    return a(paint34, i11);
                }
                Paint a43 = a(paint34, i11);
                f5410j = a43;
                k.c(a43);
                return a43;
            case R.id.theme_color_textLight:
                Paint paint35 = f5401a;
                if (paint35 != null) {
                    return a(paint35, i11);
                }
                Paint a44 = a(paint35, i11);
                f5401a = a44;
                k.c(a44);
                return a44;
            case R.id.theme_color_textSecure:
                Paint paint36 = f5402b;
                if (paint36 != null) {
                    return a(paint36, i11);
                }
                Paint a45 = a(paint36, i11);
                f5402b = a45;
                k.c(a45);
                return a45;
            case R.id.theme_color_ticks:
                Paint paint37 = f5416p;
                if (paint37 != null) {
                    return a(paint37, i11);
                }
                Paint a46 = a(paint37, i11);
                f5416p = a46;
                k.c(a46);
                return a46;
            case R.id.theme_color_ticksRead:
                Paint paint38 = f5417q;
                if (paint38 != null) {
                    return a(paint38, i11);
                }
                Paint a47 = a(paint38, i11);
                f5417q = a47;
                k.c(a47);
                return a47;
            case R.id.theme_color_waveformActive:
                Paint paint39 = M;
                if (paint39 != null) {
                    return a(paint39, i11);
                }
                Paint a48 = a(paint39, i11);
                M = a48;
                k.c(a48);
                return a48;
            case R.id.theme_color_waveformInactive:
                Paint paint40 = N;
                if (paint40 != null) {
                    return a(paint40, i11);
                }
                Paint a49 = a(paint40, i11);
                N = a49;
                k.c(a49);
                return a49;
            case R.id.theme_color_white:
                Paint paint41 = O;
                if (paint41 != null) {
                    return a(paint41, i11);
                }
                Paint a50 = a(paint41, i11);
                O = a50;
                k.c(a50);
                return a50;
            default:
                throw new IllegalArgumentException(w.e1(i10));
        }
    }

    public static Paint d(int i10, float f10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f10 = 1.0f;
        }
        return c(i10, f10);
    }
}
