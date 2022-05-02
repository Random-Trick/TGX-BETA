package be;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p108hb.C5064d;
import p364zd.C11524j;
import qa.C8298k;

public final class C1411z {
    public static Paint f5178A;
    public static Paint f5179B;
    public static Paint f5180C;
    public static Paint f5181D;
    public static Paint f5182E;
    public static Paint f5183F;
    public static Paint f5184G;
    public static Paint f5185H;
    public static Paint f5186I;
    public static Paint f5187J;
    public static Paint f5188K;
    public static Paint f5189L;
    public static Paint f5190M;
    public static Paint f5191N;
    public static Paint f5192O;
    public static Paint f5193a;
    public static Paint f5194b;
    public static Paint f5195c;
    public static Paint f5196d;
    public static Paint f5197e;
    public static Paint f5198f;
    public static Paint f5199g;
    public static Paint f5200h;
    public static Paint f5201i;
    public static Paint f5202j;
    public static Paint f5203k;
    public static Paint f5204l;
    public static Paint f5205m;
    public static Paint f5206n;
    public static Paint f5207o;
    public static Paint f5208p;
    public static Paint f5209q;
    public static Paint f5210r;
    public static Paint f5211s;
    public static Paint f5212t;
    public static Paint f5213u;
    public static Paint f5214v;
    public static Paint f5215w;
    public static Paint f5216x;
    public static Paint f5217y;
    public static Paint f5218z;

    public static final Paint m37002a(Paint paint, int i) {
        if (paint != null && paint.getColor() == i) {
            return paint;
        }
        if (paint == null) {
            paint = new Paint(7);
        }
        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        paint.setColor(i);
        return paint;
    }

    public static final Paint m37001b(int i) {
        return m36999d(i, 0.0f, 2, null);
    }

    public static final Paint m37000c(int i, float f) {
        int i2;
        if (!(f == 1.0f)) {
            i2 = C5064d.m24132a(f, C11524j.m228N(i));
        } else {
            i2 = C11524j.m228N(i);
        }
        switch (i) {
            case R.id.theme_color_avatar_content:
                Paint paint = f5203k;
                if (paint != null) {
                    return m37002a(paint, i2);
                }
                Paint a = m37002a(paint, i2);
                f5203k = a;
                C8298k.m12935c(a);
                return a;
            case R.id.theme_color_background_icon:
                Paint paint2 = f5195c;
                if (paint2 != null) {
                    return m37002a(paint2, i2);
                }
                Paint a2 = m37002a(paint2, i2);
                f5195c = a2;
                C8298k.m12935c(a2);
                return a2;
            case R.id.theme_color_badgeFailedText:
                Paint paint3 = f5214v;
                if (paint3 != null) {
                    return m37002a(paint3, i2);
                }
                Paint a3 = m37002a(paint3, i2);
                f5214v = a3;
                C8298k.m12935c(a3);
                return a3;
            case R.id.theme_color_badgeMuted:
                Paint paint4 = f5215w;
                if (paint4 != null) {
                    return m37002a(paint4, i2);
                }
                Paint a4 = m37002a(paint4, i2);
                f5215w = a4;
                C8298k.m12935c(a4);
                return a4;
            case R.id.theme_color_badgeMutedText:
                Paint paint5 = f5216x;
                if (paint5 != null) {
                    return m37002a(paint5, i2);
                }
                Paint a5 = m37002a(paint5, i2);
                f5216x = a5;
                C8298k.m12935c(a5);
                return a5;
            case R.id.theme_color_badgeText:
                Paint paint6 = f5213u;
                if (paint6 != null) {
                    return m37002a(paint6, i2);
                }
                Paint a6 = m37002a(paint6, i2);
                f5213u = a6;
                C8298k.m12935c(a6);
                return a6;
            case R.id.theme_color_bubbleIn_time:
                Paint paint7 = f5181D;
                if (paint7 != null) {
                    return m37002a(paint7, i2);
                }
                Paint a7 = m37002a(paint7, i2);
                f5181D = a7;
                C8298k.m12935c(a7);
                return a7;
            case R.id.theme_color_bubbleOut_file:
                Paint paint8 = f5185H;
                if (paint8 != null) {
                    return m37002a(paint8, i2);
                }
                Paint a8 = m37002a(paint8, i2);
                f5185H = a8;
                C8298k.m12935c(a8);
                return a8;
            case R.id.theme_color_bubbleOut_inlineIcon:
                Paint paint9 = f5183F;
                if (paint9 != null) {
                    return m37002a(paint9, i2);
                }
                Paint a9 = m37002a(paint9, i2);
                f5183F = a9;
                C8298k.m12935c(a9);
                return a9;
            case R.id.theme_color_bubbleOut_messageAuthor:
                Paint paint10 = f5188K;
                if (paint10 != null) {
                    return m37002a(paint10, i2);
                }
                Paint a10 = m37002a(paint10, i2);
                f5188K = a10;
                C8298k.m12935c(a10);
                return a10;
            case R.id.theme_color_bubbleOut_ticks:
                Paint paint11 = f5186I;
                if (paint11 != null) {
                    return m37002a(paint11, i2);
                }
                Paint a11 = m37002a(paint11, i2);
                f5186I = a11;
                C8298k.m12935c(a11);
                return a11;
            case R.id.theme_color_bubbleOut_ticksRead:
                Paint paint12 = f5187J;
                if (paint12 != null) {
                    return m37002a(paint12, i2);
                }
                Paint a12 = m37002a(paint12, i2);
                f5187J = a12;
                C8298k.m12935c(a12);
                return a12;
            case R.id.theme_color_bubbleOut_time:
                Paint paint13 = f5182E;
                if (paint13 != null) {
                    return m37002a(paint13, i2);
                }
                Paint a13 = m37002a(paint13, i2);
                f5182E = a13;
                C8298k.m12935c(a13);
                return a13;
            case R.id.theme_color_bubbleOut_waveformActive:
                Paint paint14 = f5184G;
                if (paint14 != null) {
                    return m37002a(paint14, i2);
                }
                Paint a14 = m37002a(paint14, i2);
                f5184G = a14;
                C8298k.m12935c(a14);
                return a14;
            case R.id.theme_color_bubble_mediaOverlayText:
                Paint paint15 = f5180C;
                if (paint15 != null) {
                    return m37002a(paint15, i2);
                }
                Paint a15 = m37002a(paint15, i2);
                f5180C = a15;
                C8298k.m12935c(a15);
                return a15;
            case R.id.theme_color_bubble_mediaTimeText:
                Paint paint16 = f5178A;
                if (paint16 != null) {
                    return m37002a(paint16, i2);
                }
                Paint a16 = m37002a(paint16, i2);
                f5178A = a16;
                C8298k.m12935c(a16);
                return a16;
            case R.id.theme_color_bubble_mediaTimeText_noWallpaper:
                Paint paint17 = f5179B;
                if (paint17 != null) {
                    return m37002a(paint17, i2);
                }
                Paint a17 = m37002a(paint17, i2);
                f5179B = a17;
                C8298k.m12935c(a17);
                return a17;
            case R.id.theme_color_chatListIcon:
                Paint paint18 = f5211s;
                if (paint18 != null) {
                    return m37002a(paint18, i2);
                }
                Paint a18 = m37002a(paint18, i2);
                f5211s = a18;
                C8298k.m12935c(a18);
                return a18;
            case R.id.theme_color_chatListMute:
                Paint paint19 = f5210r;
                if (paint19 != null) {
                    return m37002a(paint19, i2);
                }
                Paint a19 = m37002a(paint19, i2);
                f5210r = a19;
                C8298k.m12935c(a19);
                return a19;
            case R.id.theme_color_chatListVerify:
                Paint paint20 = f5212t;
                if (paint20 != null) {
                    return m37002a(paint20, i2);
                }
                Paint a20 = m37002a(paint20, i2);
                f5212t = a20;
                C8298k.m12935c(a20);
                return a20;
            case R.id.theme_color_chatSendButton:
                Paint paint21 = f5217y;
                if (paint21 != null) {
                    return m37002a(paint21, i2);
                }
                Paint a21 = m37002a(paint21, i2);
                f5217y = a21;
                C8298k.m12935c(a21);
                return a21;
            case R.id.theme_color_file:
                Paint paint22 = f5189L;
                if (paint22 != null) {
                    return m37002a(paint22, i2);
                }
                Paint a22 = m37002a(paint22, i2);
                f5189L = a22;
                C8298k.m12935c(a22);
                return a22;
            case R.id.theme_color_headerButtonIcon:
                Paint paint23 = f5206n;
                if (paint23 != null) {
                    return m37002a(paint23, i2);
                }
                Paint a23 = m37002a(paint23, i2);
                f5206n = a23;
                C8298k.m12935c(a23);
                return a23;
            case R.id.theme_color_headerIcon:
                Paint paint24 = f5205m;
                if (paint24 != null) {
                    return m37002a(paint24, i2);
                }
                Paint a24 = m37002a(paint24, i2);
                f5205m = a24;
                C8298k.m12935c(a24);
                return a24;
            case R.id.theme_color_headerText:
                Paint paint25 = f5204l;
                if (paint25 != null) {
                    return m37002a(paint25, i2);
                }
                Paint a25 = m37002a(paint25, i2);
                f5204l = a25;
                C8298k.m12935c(a25);
                return a25;
            case R.id.theme_color_icon:
                Paint paint26 = f5196d;
                if (paint26 != null) {
                    return m37002a(paint26, i2);
                }
                Paint a26 = m37002a(paint26, i2);
                f5196d = a26;
                C8298k.m12935c(a26);
                return a26;
            case R.id.theme_color_iconActive:
                Paint paint27 = f5197e;
                if (paint27 != null) {
                    return m37002a(paint27, i2);
                }
                Paint a27 = m37002a(paint27, i2);
                f5197e = a27;
                C8298k.m12935c(a27);
                return a27;
            case R.id.theme_color_iconLight:
                Paint paint28 = f5198f;
                if (paint28 != null) {
                    return m37002a(paint28, i2);
                }
                Paint a28 = m37002a(paint28, i2);
                f5198f = a28;
                C8298k.m12935c(a28);
                return a28;
            case R.id.theme_color_iconNegative:
                Paint paint29 = f5200h;
                if (paint29 != null) {
                    return m37002a(paint29, i2);
                }
                Paint a29 = m37002a(paint29, i2);
                f5200h = a29;
                C8298k.m12935c(a29);
                return a29;
            case R.id.theme_color_iconPositive:
                Paint paint30 = f5199g;
                if (paint30 != null) {
                    return m37002a(paint30, i2);
                }
                Paint a30 = m37002a(paint30, i2);
                f5199g = a30;
                C8298k.m12935c(a30);
                return a30;
            case R.id.theme_color_inlineIcon:
                Paint paint31 = f5201i;
                if (paint31 != null) {
                    return m37002a(paint31, i2);
                }
                Paint a31 = m37002a(paint31, i2);
                f5201i = a31;
                C8298k.m12935c(a31);
                return a31;
            case R.id.theme_color_messageAuthor:
                Paint paint32 = f5218z;
                if (paint32 != null) {
                    return m37002a(paint32, i2);
                }
                Paint a32 = m37002a(paint32, i2);
                f5218z = a32;
                C8298k.m12935c(a32);
                return a32;
            case R.id.theme_color_passcodeIcon:
                Paint paint33 = f5207o;
                if (paint33 != null) {
                    return m37002a(paint33, i2);
                }
                Paint a33 = m37002a(paint33, i2);
                f5207o = a33;
                C8298k.m12935c(a33);
                return a33;
            case R.id.theme_color_playerCoverIcon:
                Paint paint34 = f5202j;
                if (paint34 != null) {
                    return m37002a(paint34, i2);
                }
                Paint a34 = m37002a(paint34, i2);
                f5202j = a34;
                C8298k.m12935c(a34);
                return a34;
            case R.id.theme_color_textLight:
                Paint paint35 = f5193a;
                if (paint35 != null) {
                    return m37002a(paint35, i2);
                }
                Paint a35 = m37002a(paint35, i2);
                f5193a = a35;
                C8298k.m12935c(a35);
                return a35;
            case R.id.theme_color_textSecure:
                Paint paint36 = f5194b;
                if (paint36 != null) {
                    return m37002a(paint36, i2);
                }
                Paint a36 = m37002a(paint36, i2);
                f5194b = a36;
                C8298k.m12935c(a36);
                return a36;
            case R.id.theme_color_ticks:
                Paint paint37 = f5208p;
                if (paint37 != null) {
                    return m37002a(paint37, i2);
                }
                Paint a37 = m37002a(paint37, i2);
                f5208p = a37;
                C8298k.m12935c(a37);
                return a37;
            case R.id.theme_color_ticksRead:
                Paint paint38 = f5209q;
                if (paint38 != null) {
                    return m37002a(paint38, i2);
                }
                Paint a38 = m37002a(paint38, i2);
                f5209q = a38;
                C8298k.m12935c(a38);
                return a38;
            case R.id.theme_color_waveformActive:
                Paint paint39 = f5190M;
                if (paint39 != null) {
                    return m37002a(paint39, i2);
                }
                Paint a39 = m37002a(paint39, i2);
                f5190M = a39;
                C8298k.m12935c(a39);
                return a39;
            case R.id.theme_color_waveformInactive:
                Paint paint40 = f5191N;
                if (paint40 != null) {
                    return m37002a(paint40, i2);
                }
                Paint a40 = m37002a(paint40, i2);
                f5191N = a40;
                C8298k.m12935c(a40);
                return a40;
            case R.id.theme_color_white:
                Paint paint41 = f5192O;
                if (paint41 != null) {
                    return m37002a(paint41, i2);
                }
                Paint a41 = m37002a(paint41, i2);
                f5192O = a41;
                C8298k.m12935c(a41);
                return a41;
            default:
                throw new IllegalArgumentException(C4403w.m27887e1(i));
        }
    }

    public static Paint m36999d(int i, float f, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 1.0f;
        }
        return m37000c(i, f);
    }
}
