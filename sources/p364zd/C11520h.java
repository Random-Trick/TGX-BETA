package p364zd;

import android.content.SharedPreferences;
import android.graphics.Color;
import be.C1357a0;
import be.C1363c0;
import gd.C4779t2;
import ge.C4868i;
import java.util.HashMap;
import java.util.Map;
import me.vkryl.leveldb.LevelDB;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p039d.C3563j;
import p108hb.C5064d;
import p108hb.C5070i;
import p156kd.C6240c;
import p156kd.C6246h;
import p156kd.C6250i;
import p156kd.C6251j;
import p193nb.C7321e;
import p350yd.AbstractC11073vb;
import p350yd.C10930q6;
import p364zd.C11520h;

public class C11520h {
    public static Map<String, Integer> f36573l;
    public final int f36574a;
    public final String f36575b;
    public TdApi.BackgroundType f36576c;
    public final String f36577d;
    public final boolean f36578e;
    public int f36579f;
    public String f36580g;
    public C6246h f36581h;
    public C6246h f36582i;
    public C6246h f36583j;
    public Integer f36584k;

    public class C11521a extends C6251j {
        public final String f36585e0;
        public final String f36586f0;

        public C11521a(AbstractC11073vb vbVar, TdApi.Function function, String str, String str2, String str3) {
            super(vbVar, function, str);
            this.f36585e0 = str2;
            this.f36586f0 = str3;
        }

        public static void m261K0(Client.AbstractC7865g gVar, TdApi.Object object) {
            if (object.getConstructor() == -429971172) {
                TdApi.Document document = ((TdApi.Background) object).document;
                gVar.mo255t2(document != null ? document.document : new TdApi.Error(-1, "Document is inaccessible"));
                return;
            }
            gVar.mo255t2(object);
        }

        public void m260L0(String str, final Client.AbstractC7865g gVar) {
            m20953B0().m2270r4().m14783o(new TdApi.SearchBackground(str), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C11520h.C11521a.m261K0(Client.AbstractC7865g.this, object);
                }
            });
        }

        public void m259M0(Client.AbstractC7865g gVar, String str, Runnable runnable, TdApi.Object object) {
            if (object.getConstructor() != 766337656 || !C4779t2.m25587V2((TdApi.File) object)) {
                C4868i.m24727c2().m24889F3(str);
                C11520h.this.f36580g = null;
                runnable.run();
                return;
            }
            gVar.mo255t2(object);
        }

        @Override
        public void mo258D0(final Client.AbstractC7865g gVar) {
            final String str = this.f36585e0;
            final Runnable eVar = new Runnable() {
                @Override
                public final void run() {
                    C11520h.C11521a.this.m260L0(str, gVar);
                }
            };
            if (!C5070i.m24062i(C11520h.this.f36580g)) {
                Client r4 = m20953B0().m2270r4();
                TdApi.GetRemoteFile getRemoteFile = new TdApi.GetRemoteFile(C11520h.this.f36580g, new TdApi.FileTypeWallpaper());
                final String str2 = this.f36586f0;
                r4.m14783o(getRemoteFile, new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        C11520h.C11521a.this.m259M0(gVar, str2, eVar, object);
                    }
                });
                return;
            }
            eVar.run();
        }
    }

    public class C11522b extends C6251j {
        public final String f36588e0;

        public C11522b(AbstractC11073vb vbVar, TdApi.Function function, String str, String str2) {
            super(vbVar, function, str);
            this.f36588e0 = str2;
        }

        public static void m256I0(Client.AbstractC7865g gVar, TdApi.Object object) {
            TdApi.Thumbnail thumbnail;
            if (object.getConstructor() == -429971172) {
                TdApi.Document document = ((TdApi.Background) object).document;
                gVar.mo255t2((document == null || (thumbnail = document.thumbnail) == null) ? new TdApi.Error(-1, "Document preview is inaccessible") : thumbnail.file);
                return;
            }
            gVar.mo255t2(object);
        }

        @Override
        public void mo258D0(final Client.AbstractC7865g gVar) {
            m20953B0().m2270r4().m14783o(new TdApi.SearchBackground(this.f36588e0), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C11520h.C11522b.m256I0(Client.AbstractC7865g.this, object);
                }
            });
        }
    }

    public C11520h(C10930q6 q6Var, String str) {
        this.f36574a = q6Var.m2188w6();
        this.f36575b = null;
        this.f36576c = null;
        this.f36579f = 0;
        this.f36577d = str;
        this.f36578e = false;
        if (!C5070i.m24062i(str)) {
            m271t0(new C6250i(str), false);
            C6250i iVar = new C6250i(str);
            iVar.mo20768t0(C1357a0.m37544i(105.0f));
            m273s0(iVar);
        }
    }

    public static String m336A(TdApi.BackgroundFill backgroundFill) {
        int constructor = backgroundFill.getConstructor();
        if (constructor == -1839206017) {
            TdApi.BackgroundFillGradient backgroundFillGradient = (TdApi.BackgroundFillGradient) backgroundFill;
            return m266y(backgroundFillGradient.topColor, backgroundFillGradient.bottomColor, backgroundFillGradient.rotationAngle);
        } else if (constructor == -1145469255) {
            return m265z(((TdApi.BackgroundFillFreeformGradient) backgroundFill).colors);
        } else {
            if (constructor == 1010678813) {
                return m267x(((TdApi.BackgroundFillSolid) backgroundFill).color);
            }
            throw new UnsupportedOperationException(backgroundFill.toString());
        }
    }

    public static int m334C(int i) {
        float[] e = m302e(Color.red(i), Color.green(i), Color.blue(i));
        if (e[1] > 0.0f || (e[2] < 1.0f && e[2] > 0.0f)) {
            e[1] = Math.min(1.0f, e[1] + 0.05f + ((1.0f - e[1]) * 0.1f));
        }
        if (e[2] > 0.5f) {
            e[2] = Math.max(0.0f, e[2] * 0.65f);
        } else {
            e[2] = Math.max(0.0f, Math.min(1.0f, 1.0f - (e[2] * 0.65f)));
        }
        return m304d(e[0], e[1], e[2]) & 1728053247;
    }

    public static int m333D(TdApi.BackgroundFill backgroundFill) {
        int constructor = backgroundFill.getConstructor();
        if (constructor == -1839206017) {
            TdApi.BackgroundFillGradient backgroundFillGradient = (TdApi.BackgroundFillGradient) backgroundFill;
            return m334C(m284n(C5064d.m24131b(255, backgroundFillGradient.topColor), C5064d.m24131b(255, backgroundFillGradient.bottomColor)));
        } else if (constructor == -1145469255) {
            return m332E((TdApi.BackgroundFillFreeformGradient) backgroundFill);
        } else {
            if (constructor == 1010678813) {
                return m334C(((TdApi.BackgroundFillSolid) backgroundFill).color);
            }
            throw new UnsupportedOperationException(backgroundFill.toString());
        }
    }

    public static int m332E(TdApi.BackgroundFillFreeformGradient backgroundFillFreeformGradient) {
        int o = m282o(backgroundFillFreeformGradient);
        if (m302e(Color.red(o), Color.green(o), Color.blue(o))[2] < 0.3f) {
            return m334C(o);
        }
        return (m334C(o) & 16777215) | 1677721600;
    }

    public static int m328I(int i, boolean z) {
        if (z) {
            if (i != 5) {
                if (i == 104) {
                    return 3;
                }
                if (i == 107) {
                    return 2;
                }
                if (i != 112) {
                    if (i == 10) {
                        return 2;
                    }
                    if (i != 11) {
                        return 0;
                    }
                }
            }
            return 1;
        } else if (i != 114) {
            return i != 1000001 ? 0 : 1;
        } else {
            return -2;
        }
    }

    public static boolean m324M(TdApi.BackgroundType backgroundType) {
        return backgroundType != null && backgroundType.getConstructor() == 1972128891 && ((TdApi.BackgroundTypeWallpaper) backgroundType).isBlurred;
    }

    public static boolean m321P(int i) {
        return i == 32 || i == 33 || i == 35 || i == 36 || i == 1000001;
    }

    public static void m307b0(C10930q6 q6Var, TdApi.Object object) {
        if (object instanceof TdApi.File) {
            q6Var.m2270r4().m14783o(new TdApi.DownloadFile(((TdApi.File) object).f25376id, 32, 0, 0, false), q6Var.m2392ja());
        }
    }

    public static int m304d(float f, float f2, float f3) {
        int i;
        int i2;
        int i3 = 0;
        if (f2 == 0.0f) {
            i3 = (int) ((f3 * 255.0f) + 0.5f);
            i2 = i3;
            i = i2;
        } else {
            float floor = (f - ((float) Math.floor(f))) * 6.0f;
            float floor2 = floor - ((float) Math.floor(floor));
            float f4 = (1.0f - f2) * f3;
            float f5 = (1.0f - (f2 * floor2)) * f3;
            float f6 = (1.0f - (f2 * (1.0f - floor2))) * f3;
            int i4 = (int) floor;
            if (i4 == 0) {
                i3 = (int) ((f3 * 255.0f) + 0.5f);
                i2 = (int) ((f6 * 255.0f) + 0.5f);
            } else if (i4 == 1) {
                i3 = (int) ((f5 * 255.0f) + 0.5f);
                i2 = (int) ((f3 * 255.0f) + 0.5f);
            } else if (i4 != 2) {
                if (i4 == 3) {
                    i3 = (int) ((f4 * 255.0f) + 0.5f);
                    i2 = (int) ((f5 * 255.0f) + 0.5f);
                } else if (i4 == 4) {
                    i3 = (int) ((f6 * 255.0f) + 0.5f);
                    i2 = (int) ((f4 * 255.0f) + 0.5f);
                } else if (i4 != 5) {
                    i2 = 0;
                    i = 0;
                } else {
                    i3 = (int) ((f3 * 255.0f) + 0.5f);
                    i2 = (int) ((f4 * 255.0f) + 0.5f);
                    i = (int) ((f5 * 255.0f) + 0.5f);
                }
                i = (int) ((f3 * 255.0f) + 0.5f);
            } else {
                i3 = (int) ((f4 * 255.0f) + 0.5f);
                i2 = (int) ((f3 * 255.0f) + 0.5f);
                i = (int) ((f6 * 255.0f) + 0.5f);
            }
            i = (int) ((f4 * 255.0f) + 0.5f);
        }
        return ((i2 & 255) << 8) | (-16777216) | ((i3 & 255) << 16) | (i & 255);
    }

    public static TdApi.BackgroundType m303d0(TdApi.BackgroundType backgroundType, boolean z) {
        return (backgroundType == null || backgroundType.getConstructor() != 1972128891) ? backgroundType : new TdApi.BackgroundTypeWallpaper(z, ((TdApi.BackgroundTypeWallpaper) backgroundType).isMoving);
    }

    public static float[] m302e(int i, int i2, int i3) {
        float[] fArr = new float[3];
        int i4 = i > i2 ? i : i2;
        if (i3 > i4) {
            i4 = i3;
        }
        int i5 = i < i2 ? i : i2;
        if (i3 < i5) {
            i5 = i3;
        }
        float f = i4;
        float f2 = f / 255.0f;
        float f3 = 0.0f;
        float f4 = i4 != 0 ? (i4 - i5) / f : 0.0f;
        if (f4 != 0.0f) {
            float f5 = i4 - i5;
            float f6 = (i4 - i) / f5;
            float f7 = (i4 - i2) / f5;
            float f8 = (i4 - i3) / f5;
            float f9 = (i == i4 ? f8 - f7 : i2 == i4 ? (f6 + 2.0f) - f8 : (f7 + 4.0f) - f6) / 6.0f;
            f3 = f9 < 0.0f ? f9 + 1.0f : f9;
        }
        fArr[0] = f3;
        fArr[1] = f4;
        fArr[2] = f2;
        return fArr;
    }

    public static void m301e0(SharedPreferences.Editor editor, String str, int i, int i2, String str2) {
        String l = m288l(i);
        if (!C5070i.m24062i(l)) {
            editor.putString(str + "_name", l);
            editor.putInt(str + "_type", 2);
            if (!C5070i.m24062i(str2)) {
                editor.putString(str + "_remote_id", str2);
            }
        } else if (i == 1000000) {
            editor.putInt(str + "_type", 1);
            editor.putInt(str + "_fill", 1);
            editor.putInt(str + "_color", m272t(i));
        } else if (i == -1 && i2 != 0) {
            editor.putInt(str + "_type", 1);
            editor.putInt(str + "_fill", 1);
            editor.putInt(str + "_color", i2);
        }
    }

    public static String m300f(int i) {
        return C1363c0.m37474C(C5064d.m24131b(255, i), false).substring(1).toLowerCase();
    }

    public static C11520h m299f0(C10930q6 q6Var, C11520h hVar, boolean z) {
        if (hVar == null) {
            return m297g0(q6Var);
        }
        return hVar.m320Q() ? hVar : new C11520h(q6Var, hVar.f36575b, m303d0(hVar.f36576c, z), hVar.f36578e, hVar.f36579f, hVar.f36580g);
    }

    public static boolean m298g(C11520h hVar, C11520h hVar2) {
        return m296h(hVar, hVar2, true);
    }

    public static C11520h m297g0(C10930q6 q6Var) {
        return new C11520h(q6Var, (String) null);
    }

    public static boolean m296h(C11520h hVar, C11520h hVar2, boolean z) {
        if ((hVar == null || hVar.m319R()) && (hVar2 == null || hVar2.m319R())) {
            return true;
        }
        if (hVar == null || hVar2 == null || hVar.m319R() != hVar2.m319R() || hVar.m320Q() != hVar2.m320Q() || !C7321e.m16893z(hVar.f36576c, hVar2.f36576c, true)) {
            return false;
        }
        if (!z && m324M(hVar.f36576c) != m324M(hVar2.f36576c)) {
            return false;
        }
        if (hVar.m320Q()) {
            return C5070i.m24068c(hVar.m280p(), hVar2.m280p());
        }
        return C5070i.m24068c(hVar.m268w(), hVar2.m268w());
    }

    public static C11520h m295h0(C10930q6 q6Var, int i) {
        if (i == 1000000) {
            return new C11520h(q6Var, 14083311, i);
        }
        String l = m288l(i);
        if (l == null) {
            return null;
        }
        return new C11520h(q6Var, l, new TdApi.BackgroundTypeWallpaper(false, false), false, i);
    }

    public static C11520h m293i0(C10930q6 q6Var, String str) {
        int m0 = m285m0(str, null);
        if (m0 != 0) {
            return m295h0(q6Var, m0);
        }
        return new C11520h(q6Var, str, null, false, 0);
    }

    public static void m291j0(SharedPreferences.Editor editor, String str, TdApi.BackgroundFill backgroundFill) {
        int constructor = backgroundFill.getConstructor();
        if (constructor == -1839206017) {
            editor.putInt(str + "_fill", 2);
            TdApi.BackgroundFillGradient backgroundFillGradient = (TdApi.BackgroundFillGradient) backgroundFill;
            editor.putInt(str + "_color_top", backgroundFillGradient.topColor);
            editor.putInt(str + "_color_bottom", backgroundFillGradient.bottomColor);
            editor.putInt(str + "_rotation_angle", backgroundFillGradient.rotationAngle);
            SharedPreferences.Editor remove = editor.remove(str + "_color");
            remove.remove(str + "_colors");
        } else if (constructor == -1145469255) {
            editor.putInt(str + "_fill", 3);
            ((LevelDB) editor).m17996H(str + "_colors", ((TdApi.BackgroundFillFreeformGradient) backgroundFill).colors);
            SharedPreferences.Editor remove2 = editor.remove(str + "_color");
            SharedPreferences.Editor remove3 = remove2.remove(str + "_color_top");
            SharedPreferences.Editor remove4 = remove3.remove(str + "_color_bottom");
            remove4.remove(str + "_rotation_angle");
        } else if (constructor == 1010678813) {
            editor.putInt(str + "_fill", 1);
            editor.putInt(str + "_color", ((TdApi.BackgroundFillSolid) backgroundFill).color);
            SharedPreferences.Editor remove5 = editor.remove(str + "_color_top");
            SharedPreferences.Editor remove6 = remove5.remove(str + "_color_bottom");
            SharedPreferences.Editor remove7 = remove6.remove(str + "_colors");
            remove7.remove(str + "_rotation_angle");
        } else {
            throw new UnsupportedOperationException(backgroundFill.toString());
        }
    }

    public static int m290k(TdApi.BackgroundFill backgroundFill, int i) {
        int constructor = backgroundFill.getConstructor();
        if (constructor == -1839206017) {
            TdApi.BackgroundFillGradient backgroundFillGradient = (TdApi.BackgroundFillGradient) backgroundFill;
            return C5064d.m24129d(C5064d.m24131b(255, backgroundFillGradient.topColor), C5064d.m24131b(255, backgroundFillGradient.bottomColor), 0.5f);
        } else if (constructor != -1145469255) {
            return constructor != 1010678813 ? i : C5064d.m24131b(255, ((TdApi.BackgroundFillSolid) backgroundFill).color);
        } else {
            int[] iArr = ((TdApi.BackgroundFillFreeformGradient) backgroundFill).colors;
            return C5064d.m24131b(255, iArr.length >= 3 ? iArr[2] : iArr[1]);
        }
    }

    public static String m288l(int i) {
        if (i == 1) {
            return "zLuqruxGEVEBAAAAHmhS93uFDlI";
        }
        if (i == 2) {
            return "YRZSyB-VgVIBAAAAsaNJPdNxxpM";
        }
        if (i == 4) {
            return "6goyzlSsEVEDAAAAW-mw5A6C42Q";
        }
        if (i == 5) {
            return "axDtyTPwEVECAAAARm9eM8a3QLI";
        }
        if (i == 6) {
            return "051BDerTGFECAAAAvsFaINUzGrE";
        }
        if (i == 7) {
            return "fm91uT9iEFEBAAAAY7IRPuCvJNs";
        }
        if (i == 19) {
            return "ENXuz6t_EFEEAAAASyyprFX01MI";
        }
        if (i == 21) {
            return "SJTGO1MxgVIBAAAA-AChMYdDH58";
        }
        if (i == 114) {
            return "d8H77nPOGFECAAAArdOApK8bYj4";
        }
        if (i == 1000001) {
            return "Z86jxWuHGVECAAAA9XUiUlLRgY0";
        }
        if (i == 32) {
            return "r9rsZJd4GVEBAAAAhO9TCoJvZuI";
        }
        if (i == 33) {
            return "4GxoHR-KEVEBAAAApJ2vw7X40ng";
        }
        if (i == 35) {
            return "RoIieAeGGFEBAAAATN-bGmJbmIo";
        }
        if (i == 36) {
            return "7_Fl55MMGFECAAAAx_nwn_5oOZ8";
        }
        switch (i) {
            case 10:
                return "cfI-qxRrEVECAAAA_o1jhbsHa14";
            case 11:
                return "fUJ1tAoXEVEBAAAARV_-KCYufFw";
            case 12:
                return "TFZYLbcDEVEBAAAAzrIWPPqFgRs";
            case 13:
                return "vG0wx9kyiVIBAAAAkhlpL_sW9dg";
            case 14:
                return "VWHGDTX6GVECAAAAY2jkcp5eC5g";
            case 15:
                return "gvnMKHV4GVECAAAAUXErPvdsu_M";
            case 16:
                return "VDopCxj6EFEDAAAAsX0JZu28bgw";
            case 17:
                return "RB5LhCkREFECAAAA5KTABa4Zrmc";
            default:
                switch (i) {
                    case 103:
                        return "VDfKfArxEFEBAAAAWkmjzkSYtK0";
                    case 104:
                        return "7F-AWfPJgVIBAAAA5NdzN7l5zWM";
                    case 105:
                        return "Qe9IiLLfiVIBAAAAn_BDUKSYaCs";
                    case 106:
                        return "8vCBxkOtEVEBAAAA5hiHfYHN_8A";
                    case 107:
                        return "_18_b7s2GVEDAAAAxtY3yyRnLmk";
                    default:
                        switch (i) {
                            case 109:
                                return "ZFubnSx4GFEBAAAAJcREqDYeZc8";
                            case 110:
                                return "gAAMuM3xEFEDAAAAChFy8V6dHCE";
                            case 111:
                                return "DNHJ7mmeGVEBAAAAeSmU7YZuDQI";
                            case 112:
                                return "m3N0O6nVGFEBAAAApdOEjJV8_WE";
                            default:
                                return null;
                        }
                }
        }
    }

    public static int m287l0(int i) {
        return (i & 16777215) == 14083311 ? 1000000 : 0;
    }

    public static int m285m0(String str, TdApi.BackgroundType backgroundType) {
        if (backgroundType != null) {
            int constructor = backgroundType.getConstructor();
            if (constructor == 993008684) {
                TdApi.BackgroundFill backgroundFill = ((TdApi.BackgroundTypeFill) backgroundType).fill;
                if (backgroundFill.getConstructor() == 1010678813) {
                    return m287l0(((TdApi.BackgroundFillSolid) backgroundFill).color);
                }
                return 0;
            } else if (constructor == 1290213117) {
                return 0;
            }
        }
        if (C5070i.m24062i(str)) {
            return 0;
        }
        if (f36573l == null) {
            int[] v = m269v();
            f36573l = new HashMap(v.length);
            for (int i : v) {
                String l = m288l(i);
                if (l != null) {
                    f36573l.put(l, Integer.valueOf(i));
                }
            }
        }
        Integer num = f36573l.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static int m284n(int i, int i2) {
        return C5064d.m24129d(i, i2, 0.5f);
    }

    public static C11520h m283n0(C10930q6 q6Var, int i) {
        String str;
        TdApi.BackgroundTypePattern backgroundTypePattern;
        String str2;
        int a = q6Var.mo1484a();
        StringBuilder sb2 = new StringBuilder();
        if (a != 0) {
            str = "wallpaper_" + a;
        } else {
            str = "wallpaper";
        }
        sb2.append(str);
        sb2.append(C4868i.m24800S1(i));
        String sb3 = sb2.toString();
        LevelDB n3 = C4868i.m24727c2().m24638n3();
        if (n3.getBoolean(sb3 + "_empty", false)) {
            return m297g0(q6Var);
        }
        if (n3.getBoolean(sb3 + "_custom", false)) {
            return new C11520h(q6Var, n3.getString(sb3 + "_path", null));
        }
        String string = n3.getString(sb3 + "_name", null);
        boolean z = n3.getBoolean(sb3 + "_vector", false);
        int i2 = n3.getInt(sb3 + "_type", 0);
        boolean z2 = true;
        if (i2 == 1) {
            TdApi.BackgroundFill o0 = m281o0(n3, sb3);
            TdApi.BackgroundTypeFill backgroundTypeFill = new TdApi.BackgroundTypeFill(o0);
            if (C5070i.m24062i(string)) {
                string = m336A(o0);
            }
            str2 = string;
            backgroundTypePattern = backgroundTypeFill;
        } else if (i2 == 2) {
            str2 = string;
            backgroundTypePattern = new TdApi.BackgroundTypeWallpaper(n3.getBoolean(sb3 + "_blurred", false), n3.getBoolean(sb3 + "_moving", false));
        } else if (i2 != 3) {
            return null;
        } else {
            int i3 = n3.getInt(sb3 + "_intensity", 0);
            if (i3 >= 0) {
                if (!n3.getBoolean(sb3 + "_inverted", false)) {
                    z2 = false;
                }
            }
            str2 = string;
            backgroundTypePattern = new TdApi.BackgroundTypePattern(m281o0(n3, sb3), Math.abs(i3), z2, n3.getBoolean(sb3 + "_moving", false));
        }
        return new C11520h(q6Var, str2, backgroundTypePattern, z, m285m0(str2, backgroundTypePattern), sb3 + "_legacy_id");
    }

    public static int m282o(TdApi.BackgroundFillFreeformGradient backgroundFillFreeformGradient) {
        int n = m284n(C5064d.m24131b(255, backgroundFillFreeformGradient.colors[0]), C5064d.m24131b(255, backgroundFillFreeformGradient.colors[1]));
        int i = 2;
        if (backgroundFillFreeformGradient.colors.length >= 2) {
            while (true) {
                int[] iArr = backgroundFillFreeformGradient.colors;
                if (i >= iArr.length) {
                    break;
                }
                n = m284n(n, C5064d.m24131b(255, iArr[i]));
                i++;
            }
        }
        return n;
    }

    public static TdApi.BackgroundFill m281o0(SharedPreferences sharedPreferences, String str) {
        int i = sharedPreferences.getInt(str + "_fill", 1);
        if (i == 2) {
            int i2 = sharedPreferences.getInt(str + "_color_top", 0);
            int i3 = sharedPreferences.getInt(str + "_color_bottom", 0);
            return new TdApi.BackgroundFillGradient(i2, i3, sharedPreferences.getInt(str + "_rotation_angle", 0));
        } else if (i != 3) {
            return new TdApi.BackgroundFillSolid(sharedPreferences.getInt(str + "_color", 0));
        } else {
            return new TdApi.BackgroundFillFreeformGradient(((LevelDB) sharedPreferences).m17965p(str + "_colors"));
        }
    }

    public static int m278q(int i) {
        switch (i) {
            case 1:
            case 4:
            case 9:
            case 11:
                return 1000001;
            case 2:
            case 3:
            case 10:
                return 0;
            case 5:
            case 6:
                return 32;
            case 7:
                return 35;
            case 8:
                return 36;
            default:
                throw C11524j.m247D0(i, "themeId");
        }
    }

    public static int m274s(int i, int i2) {
        if (i == 32) {
            return C11524j.m224P(R.id.theme_color_wp_catsBeige);
        }
        if (i == 33) {
            return C11524j.m224P(R.id.theme_color_wp_catsOrange);
        }
        if (i == 35) {
            return C11524j.m224P(R.id.theme_color_wp_catsGreen);
        }
        if (i == 36) {
            return C11524j.m224P(R.id.theme_color_wp_catsPink);
        }
        if (i == 114) {
            return C11524j.m224P(R.id.theme_color_wp_circlesBlue);
        }
        switch (i) {
            case 1000000:
            case 1000001:
                return C11524j.m224P(R.id.theme_color_wp_cats);
            default:
                int t = m272t(i);
                return (16777215 & t) != 0 ? C5064d.m24131b(51, t) : i2;
        }
    }

    public static int m272t(int i) {
        if (i == 19) {
            return 4206595;
        }
        if (i == 103) {
            return 799321;
        }
        if (i == 109) {
            return 4206595;
        }
        switch (i) {
            case 1000000:
                return 14083311;
            case 1000001:
                return 799321;
            default:
                return 0;
        }
    }

    public static int[] m269v() {
        return new int[]{1000001, 1000000, 106, 103, 105, 107, 109, 111, 110, 112, 32, 15, 14, 5, 11, 33, 16, 12, 10, 7, C3563j.f11927F0, 4, 19, 1, 17, 6, 35, 36};
    }

    public static String m267x(int i) {
        return m300f(i);
    }

    public static String m266y(int i, int i2, int i3) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m300f(i));
        sb2.append("-");
        sb2.append(m300f(i2));
        if (i3 != 0) {
            str = "?rotation=" + i3;
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static String m265z(int[] iArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < iArr.length; i++) {
            sb2.append(m300f(iArr[i]));
            if (i != iArr.length - 1) {
                sb2.append("~");
            }
        }
        return sb2.toString();
    }

    public int m335B() {
        if (!m313X()) {
            return 0;
        }
        if (this.f36584k == null) {
            this.f36584k = Integer.valueOf(m333D(((TdApi.BackgroundTypePattern) this.f36576c).fill));
        }
        return this.f36584k.intValue();
    }

    public float m331F() {
        if (m313X()) {
            return Math.abs(((TdApi.BackgroundTypePattern) this.f36576c).intensity) / 100.0f;
        }
        return 1.0f;
    }

    public C6246h m330G(boolean z) {
        if (z) {
            return this.f36583j;
        }
        C6246h hVar = this.f36582i;
        return hVar != null ? hVar : this.f36581h;
    }

    public int m329H() {
        if (m316U()) {
            return ((TdApi.BackgroundFillGradient) ((TdApi.BackgroundTypeFill) this.f36576c).fill).rotationAngle;
        }
        if (m311Z()) {
            return ((TdApi.BackgroundFillGradient) ((TdApi.BackgroundTypePattern) this.f36576c).fill).rotationAngle;
        }
        return 0;
    }

    public int m327J() {
        if (!m318S()) {
            return 0;
        }
        if (this.f36584k == null) {
            this.f36584k = Integer.valueOf(m333D(((TdApi.BackgroundTypeFill) this.f36576c).fill));
        }
        return this.f36584k.intValue();
    }

    public int m326K() {
        if (m316U()) {
            return ((TdApi.BackgroundFillGradient) ((TdApi.BackgroundTypeFill) this.f36576c).fill).topColor;
        }
        if (m311Z()) {
            return ((TdApi.BackgroundFillGradient) ((TdApi.BackgroundTypePattern) this.f36576c).fill).topColor;
        }
        if (m317T()) {
            return ((TdApi.BackgroundFillFreeformGradient) ((TdApi.BackgroundTypeFill) this.f36576c).fill).colors[0];
        }
        if (m312Y()) {
            return ((TdApi.BackgroundFillFreeformGradient) ((TdApi.BackgroundTypePattern) this.f36576c).fill).colors[0];
        }
        return 0;
    }

    public boolean m325L() {
        return m324M(this.f36576c);
    }

    public boolean m323N() {
        return this.f36579f == 1000001;
    }

    public boolean m322O() {
        int i = this.f36579f;
        return i != 0 && m321P(i);
    }

    public boolean m320Q() {
        return !C5070i.m24062i(this.f36577d);
    }

    public boolean m319R() {
        return C5070i.m24062i(this.f36575b) && C5070i.m24062i(this.f36577d);
    }

    public boolean m318S() {
        TdApi.BackgroundType backgroundType = this.f36576c;
        return backgroundType != null && backgroundType.getConstructor() == 993008684;
    }

    public boolean m317T() {
        return m318S() && ((TdApi.BackgroundTypeFill) this.f36576c).fill.getConstructor() == -1145469255;
    }

    public boolean m316U() {
        return m318S() && ((TdApi.BackgroundTypeFill) this.f36576c).fill.getConstructor() == -1839206017;
    }

    public boolean m315V() {
        return m318S() && ((TdApi.BackgroundTypeFill) this.f36576c).fill.getConstructor() == 1010678813;
    }

    public boolean m314W() {
        return this.f36579f != 0;
    }

    public boolean m313X() {
        TdApi.BackgroundType backgroundType = this.f36576c;
        return backgroundType != null && backgroundType.getConstructor() == 1290213117;
    }

    public boolean m312Y() {
        return m313X() && ((TdApi.BackgroundTypePattern) this.f36576c).fill.getConstructor() == -1145469255;
    }

    public boolean m311Z() {
        return m313X() && ((TdApi.BackgroundTypePattern) this.f36576c).fill.getConstructor() == -1839206017;
    }

    public boolean m309a0() {
        TdApi.BackgroundType backgroundType = this.f36576c;
        return backgroundType != null && backgroundType.getConstructor() == 1972128891;
    }

    public void m305c0(final C10930q6 q6Var) {
        C6246h hVar = this.f36581h;
        if (hVar instanceof C6251j) {
            ((C6251j) hVar).mo258D0(new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C11520h.m307b0(C10930q6.this, object);
                }
            });
        }
    }

    public int m294i() {
        return m292j(0);
    }

    public int m292j(int i) {
        TdApi.BackgroundType backgroundType = this.f36576c;
        if (backgroundType == null) {
            return i;
        }
        int constructor = backgroundType.getConstructor();
        if (constructor != 993008684) {
            return constructor != 1290213117 ? i : m290k(((TdApi.BackgroundTypePattern) this.f36576c).fill, i);
        }
        return m290k(((TdApi.BackgroundTypeFill) this.f36576c).fill, i);
    }

    public void m289k0(C6240c cVar, boolean z) {
        C6246h hVar = this.f36581h;
        C6246h hVar2 = null;
        if (hVar != null) {
            if (z) {
                hVar2 = this.f36582i;
            }
            cVar.m20978j(hVar2, hVar);
            return;
        }
        cVar.m20978j(null, null);
    }

    public int m286m() {
        if (m316U()) {
            return ((TdApi.BackgroundFillGradient) ((TdApi.BackgroundTypeFill) this.f36576c).fill).bottomColor;
        }
        if (m311Z()) {
            return ((TdApi.BackgroundFillGradient) ((TdApi.BackgroundTypePattern) this.f36576c).fill).bottomColor;
        }
        if (m317T()) {
            int[] iArr = ((TdApi.BackgroundFillFreeformGradient) ((TdApi.BackgroundTypeFill) this.f36576c).fill).colors;
            return iArr[iArr.length - 1];
        } else if (!m312Y()) {
            return 0;
        } else {
            int[] iArr2 = ((TdApi.BackgroundFillFreeformGradient) ((TdApi.BackgroundTypePattern) this.f36576c).fill).colors;
            return iArr2[iArr2.length - 1];
        }
    }

    public String m280p() {
        return this.f36577d;
    }

    public void m279p0(int i) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f36574a != 0) {
            str = "wallpaper_" + this.f36574a;
        } else {
            str = "wallpaper";
        }
        sb2.append(str);
        sb2.append(C4868i.m24800S1(i));
        String sb3 = sb2.toString();
        LevelDB W = C4868i.m24727c2().m24774W();
        if (C5070i.m24062i(this.f36580g)) {
            W.remove(sb3 + "_remote_id");
        } else {
            W.putString(sb3 + "_remote_id", this.f36580g);
        }
        if (m319R()) {
            W.putBoolean(sb3 + "_empty", true);
        } else {
            W.remove(sb3 + "_empty");
        }
        if (m320Q()) {
            W.putBoolean(sb3 + "_custom", true).putString(sb3 + "_path", this.f36577d);
        } else {
            W.remove(sb3 + "_custom").remove(sb3 + "_path");
        }
        if (C5070i.m24062i(this.f36575b) || (m318S() && this.f36575b.equals(m267x(m294i())))) {
            W.remove(sb3 + "_name");
        } else {
            W.putString(sb3 + "_name", this.f36575b);
        }
        if (this.f36578e) {
            W.putBoolean(sb3 + "_vector", true);
        } else {
            W.remove(sb3 + "_vector");
        }
        TdApi.BackgroundType backgroundType = this.f36576c;
        if (backgroundType != null) {
            int constructor = backgroundType.getConstructor();
            if (constructor == 993008684) {
                W.putInt(sb3 + "_type", 1).remove(sb3 + "_intensity").remove(sb3 + "_moving").remove(sb3 + "_blurred");
                m291j0(W, sb3, ((TdApi.BackgroundTypeFill) this.f36576c).fill);
            } else if (constructor == 1290213117) {
                TdApi.BackgroundTypePattern backgroundTypePattern = (TdApi.BackgroundTypePattern) this.f36576c;
                if (backgroundTypePattern.intensity >= 0) {
                    W.putInt(sb3 + "_type", 3).putInt(sb3 + "_intensity", backgroundTypePattern.intensity).putBoolean(sb3 + "_moving", backgroundTypePattern.isMoving).putBoolean(sb3 + "_inverted", backgroundTypePattern.isInverted).remove(sb3 + "_blurred");
                    m291j0(W, sb3, backgroundTypePattern.fill);
                } else {
                    throw new IllegalArgumentException();
                }
            } else if (constructor == 1972128891) {
                TdApi.BackgroundTypeWallpaper backgroundTypeWallpaper = (TdApi.BackgroundTypeWallpaper) this.f36576c;
                W.putInt(sb3 + "_type", 2).putBoolean(sb3 + "_moving", backgroundTypeWallpaper.isMoving).putBoolean(sb3 + "_blurred", backgroundTypeWallpaper.isBlurred).remove(sb3 + "_color").remove(sb3 + "_intensity").remove(sb3 + "_inverted");
            } else {
                throw new UnsupportedOperationException(this.f36576c.toString());
            }
        } else {
            W.remove(sb3 + "_type").remove(sb3 + "_color").remove(sb3 + "_intensity").remove(sb3 + "_inverted").remove(sb3 + "_moving").remove(sb3 + "_blurred").remove(sb3 + "_fill").remove(sb3 + "_color_top").remove(sb3 + "_color_bottom").remove(sb3 + "_colors").remove(sb3 + "_rotation_angle");
        }
        W.apply();
    }

    public void m277q0(int i) {
        this.f36579f = i;
    }

    public int[] m276r() {
        if (m317T()) {
            return ((TdApi.BackgroundFillFreeformGradient) ((TdApi.BackgroundTypeFill) this.f36576c).fill).colors;
        }
        return m312Y() ? ((TdApi.BackgroundFillFreeformGradient) ((TdApi.BackgroundTypePattern) this.f36576c).fill).colors : new int[0];
    }

    public final void m275r0(C6246h hVar) {
        this.f36583j = hVar;
        if (hVar != null) {
            hVar.m20898s0(2);
        }
    }

    public final void m273s0(C6246h hVar) {
        this.f36582i = hVar;
        if (hVar != null) {
            hVar.m20912j0(true);
            hVar.m20898s0(2);
        }
    }

    public final void m271t0(C6246h hVar, boolean z) {
        this.f36581h = hVar;
        if (hVar != null) {
            hVar.m20912j0(true);
            hVar.m20927b0();
            if (this.f36578e) {
                hVar.m20922e0();
            }
            if (m313X()) {
                hVar.m20898s0(3);
                hVar.mo20768t0(C1357a0.m37554D());
                return;
            }
            hVar.m20898s0(2);
            if (z) {
                hVar.mo20768t0(160);
                hVar.m20920f0();
                return;
            }
            hVar.mo20768t0(Math.min(1480, C1357a0.m37554D()));
            hVar.m20910k0();
        }
    }

    public int m270u() {
        return this.f36579f;
    }

    public String m268w() {
        return this.f36575b;
    }

    public C11520h(C10930q6 q6Var, String str, TdApi.BackgroundType backgroundType, boolean z, int i) {
        this(q6Var, str, backgroundType, z, i, null);
    }

    public C11520h(p350yd.C10930q6 r13, java.lang.String r14, org.drinkless.p210td.libcore.telegram.TdApi.BackgroundType r15, boolean r16, int r17, java.lang.String r18) {
        throw new UnsupportedOperationException("Method not decompiled: p364zd.C11520h.<init>(yd.q6, java.lang.String, org.drinkless.td.libcore.telegram.TdApi$BackgroundType, boolean, int, java.lang.String):void");
    }

    public C11520h(C10930q6 q6Var, int i) {
        this(q6Var, i, m287l0(i));
    }

    public C11520h(C10930q6 q6Var, int i, int i2) {
        this(q6Var, m267x(i), new TdApi.BackgroundTypeFill(new TdApi.BackgroundFillSolid(i)), false, i2);
    }

    public C11520h(C10930q6 q6Var, TdApi.Background background) {
        this(q6Var, background, m324M(background.type));
    }

    public C11520h(C10930q6 q6Var, TdApi.Background background, boolean z) {
        TdApi.Document document;
        this.f36574a = q6Var.m2188w6();
        this.f36575b = background.name;
        this.f36576c = background.type;
        this.f36577d = null;
        TdApi.Document document2 = background.document;
        this.f36578e = document2 != null && "application/x-tgwallpattern".equals(document2.mimeType);
        this.f36579f = m285m0(background.name, background.type);
        int constructor = this.f36576c.getConstructor();
        if ((constructor == 1290213117 || constructor == 1972128891) && (document = background.document) != null) {
            m271t0(new C6246h(q6Var, document.document), z);
            TdApi.Thumbnail thumbnail = background.document.thumbnail;
            if (thumbnail != null) {
                m273s0(C4779t2.m25705D5(q6Var, thumbnail));
            }
            if (background.document.minithumbnail != null) {
                m275r0(new C6250i(background.document.minithumbnail));
            }
        }
    }
}
