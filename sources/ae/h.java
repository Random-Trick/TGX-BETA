package ae;

import ae.h;
import android.content.SharedPreferences;
import android.graphics.Color;
import ce.a0;
import ce.c0;
import hd.t2;
import he.i;
import ib.d;
import java.util.HashMap;
import java.util.Map;
import ld.c;
import ld.j;
import me.vkryl.leveldb.LevelDB;
import ob.e;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import zd.o6;
import zd.tb;

public class h {
    public static Map<String, Integer> f838l;
    public final int f839a;
    public final String f840b;
    public TdApi.BackgroundType f841c;
    public final String f842d;
    public final boolean f843e;
    public int f844f;
    public String f845g;
    public ld.h f846h;
    public ld.h f847i;
    public ld.h f848j;
    public Integer f849k;

    public class a extends j {
        public final String f850e0;
        public final String f851f0;

        public a(tb tbVar, TdApi.Function function, String str, String str2, String str3) {
            super(tbVar, function, str);
            this.f850e0 = str2;
            this.f851f0 = str3;
        }

        public static void K0(Client.g gVar, TdApi.Object object) {
            if (object.getConstructor() == -429971172) {
                TdApi.Document document = ((TdApi.Background) object).document;
                gVar.r2(document != null ? document.document : new TdApi.Error(-1, "Document is inaccessible"));
                return;
            }
            gVar.r2(object);
        }

        public void L0(String str, final Client.g gVar) {
            B0().v4().o(new TdApi.SearchBackground(str), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    h.a.K0(Client.g.this, object);
                }
            });
        }

        public void M0(Client.g gVar, String str, Runnable runnable, TdApi.Object object) {
            if (object.getConstructor() != 766337656 || !t2.V2((TdApi.File) object)) {
                i.c2().F3(str);
                h.this.f845g = null;
                runnable.run();
                return;
            }
            gVar.r2(object);
        }

        @Override
        public void D0(final Client.g gVar) {
            final String str = this.f850e0;
            final Runnable eVar = new Runnable() {
                @Override
                public final void run() {
                    h.a.this.L0(str, gVar);
                }
            };
            if (!ib.i.i(h.this.f845g)) {
                Client v42 = B0().v4();
                TdApi.GetRemoteFile getRemoteFile = new TdApi.GetRemoteFile(h.this.f845g, new TdApi.FileTypeWallpaper());
                final String str2 = this.f851f0;
                v42.o(getRemoteFile, new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        h.a.this.M0(gVar, str2, eVar, object);
                    }
                });
                return;
            }
            eVar.run();
        }
    }

    public class b extends j {
        public final String f853e0;

        public b(tb tbVar, TdApi.Function function, String str, String str2) {
            super(tbVar, function, str);
            this.f853e0 = str2;
        }

        public static void I0(Client.g gVar, TdApi.Object object) {
            TdApi.Thumbnail thumbnail;
            if (object.getConstructor() == -429971172) {
                TdApi.Document document = ((TdApi.Background) object).document;
                gVar.r2((document == null || (thumbnail = document.thumbnail) == null) ? new TdApi.Error(-1, "Document preview is inaccessible") : thumbnail.file);
                return;
            }
            gVar.r2(object);
        }

        @Override
        public void D0(final Client.g gVar) {
            B0().v4().o(new TdApi.SearchBackground(this.f853e0), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    h.b.I0(Client.g.this, object);
                }
            });
        }
    }

    public h(o6 o6Var, String str) {
        this.f839a = o6Var.A6();
        this.f840b = null;
        this.f841c = null;
        this.f844f = 0;
        this.f842d = str;
        this.f843e = false;
        if (!ib.i.i(str)) {
            t0(new ld.i(str), false);
            ld.i iVar = new ld.i(str);
            iVar.t0(a0.i(105.0f));
            s0(iVar);
        }
    }

    public static String A(TdApi.BackgroundFill backgroundFill) {
        int constructor = backgroundFill.getConstructor();
        if (constructor == -1839206017) {
            TdApi.BackgroundFillGradient backgroundFillGradient = (TdApi.BackgroundFillGradient) backgroundFill;
            return y(backgroundFillGradient.topColor, backgroundFillGradient.bottomColor, backgroundFillGradient.rotationAngle);
        } else if (constructor == -1145469255) {
            return z(((TdApi.BackgroundFillFreeformGradient) backgroundFill).colors);
        } else {
            if (constructor == 1010678813) {
                return x(((TdApi.BackgroundFillSolid) backgroundFill).color);
            }
            throw new UnsupportedOperationException(backgroundFill.toString());
        }
    }

    public static int C(int i10) {
        float[] e10 = e(Color.red(i10), Color.green(i10), Color.blue(i10));
        if (e10[1] > 0.0f || (e10[2] < 1.0f && e10[2] > 0.0f)) {
            e10[1] = Math.min(1.0f, e10[1] + 0.05f + ((1.0f - e10[1]) * 0.1f));
        }
        if (e10[2] > 0.5f) {
            e10[2] = Math.max(0.0f, e10[2] * 0.65f);
        } else {
            e10[2] = Math.max(0.0f, Math.min(1.0f, 1.0f - (e10[2] * 0.65f)));
        }
        return d(e10[0], e10[1], e10[2]) & 1728053247;
    }

    public static int D(TdApi.BackgroundFill backgroundFill) {
        int constructor = backgroundFill.getConstructor();
        if (constructor == -1839206017) {
            TdApi.BackgroundFillGradient backgroundFillGradient = (TdApi.BackgroundFillGradient) backgroundFill;
            return C(n(d.b(255, backgroundFillGradient.topColor), d.b(255, backgroundFillGradient.bottomColor)));
        } else if (constructor == -1145469255) {
            return E((TdApi.BackgroundFillFreeformGradient) backgroundFill);
        } else {
            if (constructor == 1010678813) {
                return C(((TdApi.BackgroundFillSolid) backgroundFill).color);
            }
            throw new UnsupportedOperationException(backgroundFill.toString());
        }
    }

    public static int E(TdApi.BackgroundFillFreeformGradient backgroundFillFreeformGradient) {
        int o10 = o(backgroundFillFreeformGradient);
        if (e(Color.red(o10), Color.green(o10), Color.blue(o10))[2] < 0.3f) {
            return C(o10);
        }
        return (C(o10) & 16777215) | 1677721600;
    }

    public static int I(int i10, boolean z10) {
        if (z10) {
            if (i10 != 5) {
                if (i10 == 104) {
                    return 3;
                }
                if (i10 == 107) {
                    return 2;
                }
                if (i10 != 112) {
                    if (i10 == 10) {
                        return 2;
                    }
                    if (i10 != 11) {
                        return 0;
                    }
                }
            }
            return 1;
        } else if (i10 != 114) {
            return i10 != 1000001 ? 0 : 1;
        } else {
            return -2;
        }
    }

    public static boolean M(TdApi.BackgroundType backgroundType) {
        return backgroundType != null && backgroundType.getConstructor() == 1972128891 && ((TdApi.BackgroundTypeWallpaper) backgroundType).isBlurred;
    }

    public static boolean P(int i10) {
        return i10 == 32 || i10 == 33 || i10 == 35 || i10 == 36 || i10 == 1000001;
    }

    public static void b0(o6 o6Var, TdApi.Object object) {
        if (object instanceof TdApi.File) {
            o6Var.v4().o(new TdApi.DownloadFile(((TdApi.File) object).f19913id, 32, 0, 0, false), o6Var.na());
        }
    }

    public static int d(float f10, float f11, float f12) {
        int i10;
        int i11;
        int i12 = 0;
        if (f11 == 0.0f) {
            i12 = (int) ((f12 * 255.0f) + 0.5f);
            i11 = i12;
            i10 = i11;
        } else {
            float floor = (f10 - ((float) Math.floor(f10))) * 6.0f;
            float floor2 = floor - ((float) Math.floor(floor));
            float f13 = (1.0f - f11) * f12;
            float f14 = (1.0f - (f11 * floor2)) * f12;
            float f15 = (1.0f - (f11 * (1.0f - floor2))) * f12;
            int i13 = (int) floor;
            if (i13 == 0) {
                i12 = (int) ((f12 * 255.0f) + 0.5f);
                i11 = (int) ((f15 * 255.0f) + 0.5f);
            } else if (i13 == 1) {
                i12 = (int) ((f14 * 255.0f) + 0.5f);
                i11 = (int) ((f12 * 255.0f) + 0.5f);
            } else if (i13 != 2) {
                if (i13 == 3) {
                    i12 = (int) ((f13 * 255.0f) + 0.5f);
                    i11 = (int) ((f14 * 255.0f) + 0.5f);
                } else if (i13 == 4) {
                    i12 = (int) ((f15 * 255.0f) + 0.5f);
                    i11 = (int) ((f13 * 255.0f) + 0.5f);
                } else if (i13 != 5) {
                    i11 = 0;
                    i10 = 0;
                } else {
                    i12 = (int) ((f12 * 255.0f) + 0.5f);
                    i11 = (int) ((f13 * 255.0f) + 0.5f);
                    i10 = (int) ((f14 * 255.0f) + 0.5f);
                }
                i10 = (int) ((f12 * 255.0f) + 0.5f);
            } else {
                i12 = (int) ((f13 * 255.0f) + 0.5f);
                i11 = (int) ((f12 * 255.0f) + 0.5f);
                i10 = (int) ((f15 * 255.0f) + 0.5f);
            }
            i10 = (int) ((f13 * 255.0f) + 0.5f);
        }
        return ((i11 & 255) << 8) | (-16777216) | ((i12 & 255) << 16) | (i10 & 255);
    }

    public static TdApi.BackgroundType d0(TdApi.BackgroundType backgroundType, boolean z10) {
        return (backgroundType == null || backgroundType.getConstructor() != 1972128891) ? backgroundType : new TdApi.BackgroundTypeWallpaper(z10, ((TdApi.BackgroundTypeWallpaper) backgroundType).isMoving);
    }

    public static float[] e(int i10, int i11, int i12) {
        float[] fArr = new float[3];
        int i13 = i10 > i11 ? i10 : i11;
        if (i12 > i13) {
            i13 = i12;
        }
        int i14 = i10 < i11 ? i10 : i11;
        if (i12 < i14) {
            i14 = i12;
        }
        float f10 = i13;
        float f11 = f10 / 255.0f;
        float f12 = 0.0f;
        float f13 = i13 != 0 ? (i13 - i14) / f10 : 0.0f;
        if (f13 != 0.0f) {
            float f14 = i13 - i14;
            float f15 = (i13 - i10) / f14;
            float f16 = (i13 - i11) / f14;
            float f17 = (i13 - i12) / f14;
            float f18 = (i10 == i13 ? f17 - f16 : i11 == i13 ? (f15 + 2.0f) - f17 : (f16 + 4.0f) - f15) / 6.0f;
            f12 = f18 < 0.0f ? f18 + 1.0f : f18;
        }
        fArr[0] = f12;
        fArr[1] = f13;
        fArr[2] = f11;
        return fArr;
    }

    public static void e0(SharedPreferences.Editor editor, String str, int i10, int i11, String str2) {
        String l10 = l(i10);
        if (!ib.i.i(l10)) {
            editor.putString(str + "_name", l10);
            editor.putInt(str + "_type", 2);
            if (!ib.i.i(str2)) {
                editor.putString(str + "_remote_id", str2);
            }
        } else if (i10 == 1000000) {
            editor.putInt(str + "_type", 1);
            editor.putInt(str + "_fill", 1);
            editor.putInt(str + "_color", t(i10));
        } else if (i10 == -1 && i11 != 0) {
            editor.putInt(str + "_type", 1);
            editor.putInt(str + "_fill", 1);
            editor.putInt(str + "_color", i11);
        }
    }

    public static String f(int i10) {
        return c0.C(d.b(255, i10), false).substring(1).toLowerCase();
    }

    public static h f0(o6 o6Var, h hVar, boolean z10) {
        if (hVar == null) {
            return g0(o6Var);
        }
        return hVar.Q() ? hVar : new h(o6Var, hVar.f840b, d0(hVar.f841c, z10), hVar.f843e, hVar.f844f, hVar.f845g);
    }

    public static boolean g(h hVar, h hVar2) {
        return h(hVar, hVar2, true);
    }

    public static h g0(o6 o6Var) {
        return new h(o6Var, (String) null);
    }

    public static boolean h(h hVar, h hVar2, boolean z10) {
        if ((hVar == null || hVar.R()) && (hVar2 == null || hVar2.R())) {
            return true;
        }
        if (hVar == null || hVar2 == null || hVar.R() != hVar2.R() || hVar.Q() != hVar2.Q() || !e.A(hVar.f841c, hVar2.f841c, true)) {
            return false;
        }
        if (!z10 && M(hVar.f841c) != M(hVar2.f841c)) {
            return false;
        }
        if (hVar.Q()) {
            return ib.i.c(hVar.p(), hVar2.p());
        }
        return ib.i.c(hVar.w(), hVar2.w());
    }

    public static h h0(o6 o6Var, int i10) {
        if (i10 == 1000000) {
            return new h(o6Var, 14083311, i10);
        }
        String l10 = l(i10);
        if (l10 == null) {
            return null;
        }
        return new h(o6Var, l10, new TdApi.BackgroundTypeWallpaper(false, false), false, i10);
    }

    public static h i0(o6 o6Var, String str) {
        int m02 = m0(str, null);
        if (m02 != 0) {
            return h0(o6Var, m02);
        }
        return new h(o6Var, str, null, false, 0);
    }

    public static void j0(SharedPreferences.Editor editor, String str, TdApi.BackgroundFill backgroundFill) {
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
            ((LevelDB) editor).H(str + "_colors", ((TdApi.BackgroundFillFreeformGradient) backgroundFill).colors);
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

    public static int k(TdApi.BackgroundFill backgroundFill, int i10) {
        int constructor = backgroundFill.getConstructor();
        if (constructor == -1839206017) {
            TdApi.BackgroundFillGradient backgroundFillGradient = (TdApi.BackgroundFillGradient) backgroundFill;
            return d.d(d.b(255, backgroundFillGradient.topColor), d.b(255, backgroundFillGradient.bottomColor), 0.5f);
        } else if (constructor != -1145469255) {
            return constructor != 1010678813 ? i10 : d.b(255, ((TdApi.BackgroundFillSolid) backgroundFill).color);
        } else {
            int[] iArr = ((TdApi.BackgroundFillFreeformGradient) backgroundFill).colors;
            return d.b(255, iArr.length >= 3 ? iArr[2] : iArr[1]);
        }
    }

    public static String l(int i10) {
        if (i10 == 1) {
            return "zLuqruxGEVEBAAAAHmhS93uFDlI";
        }
        if (i10 == 2) {
            return "YRZSyB-VgVIBAAAAsaNJPdNxxpM";
        }
        if (i10 == 4) {
            return "6goyzlSsEVEDAAAAW-mw5A6C42Q";
        }
        if (i10 == 5) {
            return "axDtyTPwEVECAAAARm9eM8a3QLI";
        }
        if (i10 == 6) {
            return "051BDerTGFECAAAAvsFaINUzGrE";
        }
        if (i10 == 7) {
            return "fm91uT9iEFEBAAAAY7IRPuCvJNs";
        }
        if (i10 == 19) {
            return "ENXuz6t_EFEEAAAASyyprFX01MI";
        }
        if (i10 == 21) {
            return "SJTGO1MxgVIBAAAA-AChMYdDH58";
        }
        if (i10 == 114) {
            return "d8H77nPOGFECAAAArdOApK8bYj4";
        }
        if (i10 == 1000001) {
            return "Z86jxWuHGVECAAAA9XUiUlLRgY0";
        }
        if (i10 == 32) {
            return "r9rsZJd4GVEBAAAAhO9TCoJvZuI";
        }
        if (i10 == 33) {
            return "4GxoHR-KEVEBAAAApJ2vw7X40ng";
        }
        if (i10 == 35) {
            return "RoIieAeGGFEBAAAATN-bGmJbmIo";
        }
        if (i10 == 36) {
            return "7_Fl55MMGFECAAAAx_nwn_5oOZ8";
        }
        switch (i10) {
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
                switch (i10) {
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
                        switch (i10) {
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

    public static int l0(int i10) {
        return (i10 & 16777215) == 14083311 ? 1000000 : 0;
    }

    public static int m0(String str, TdApi.BackgroundType backgroundType) {
        if (backgroundType != null) {
            int constructor = backgroundType.getConstructor();
            if (constructor == 993008684) {
                TdApi.BackgroundFill backgroundFill = ((TdApi.BackgroundTypeFill) backgroundType).fill;
                if (backgroundFill.getConstructor() == 1010678813) {
                    return l0(((TdApi.BackgroundFillSolid) backgroundFill).color);
                }
                return 0;
            } else if (constructor == 1290213117) {
                return 0;
            }
        }
        if (ib.i.i(str)) {
            return 0;
        }
        if (f838l == null) {
            int[] v10 = v();
            f838l = new HashMap(v10.length);
            for (int i10 : v10) {
                String l10 = l(i10);
                if (l10 != null) {
                    f838l.put(l10, Integer.valueOf(i10));
                }
            }
        }
        Integer num = f838l.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static int n(int i10, int i11) {
        return d.d(i10, i11, 0.5f);
    }

    public static h n0(o6 o6Var, int i10) {
        String str;
        TdApi.BackgroundTypePattern backgroundTypePattern;
        String str2;
        int a10 = o6Var.a();
        StringBuilder sb2 = new StringBuilder();
        if (a10 != 0) {
            str = "wallpaper_" + a10;
        } else {
            str = "wallpaper";
        }
        sb2.append(str);
        sb2.append(i.S1(i10));
        String sb3 = sb2.toString();
        LevelDB n32 = i.c2().n3();
        if (n32.getBoolean(sb3 + "_empty", false)) {
            return g0(o6Var);
        }
        if (n32.getBoolean(sb3 + "_custom", false)) {
            return new h(o6Var, n32.getString(sb3 + "_path", null));
        }
        String string = n32.getString(sb3 + "_name", null);
        boolean z10 = n32.getBoolean(sb3 + "_vector", false);
        int i11 = n32.getInt(sb3 + "_type", 0);
        boolean z11 = true;
        if (i11 == 1) {
            TdApi.BackgroundFill o02 = o0(n32, sb3);
            TdApi.BackgroundTypeFill backgroundTypeFill = new TdApi.BackgroundTypeFill(o02);
            if (ib.i.i(string)) {
                string = A(o02);
            }
            str2 = string;
            backgroundTypePattern = backgroundTypeFill;
        } else if (i11 == 2) {
            str2 = string;
            backgroundTypePattern = new TdApi.BackgroundTypeWallpaper(n32.getBoolean(sb3 + "_blurred", false), n32.getBoolean(sb3 + "_moving", false));
        } else if (i11 != 3) {
            return null;
        } else {
            int i12 = n32.getInt(sb3 + "_intensity", 0);
            if (i12 >= 0) {
                if (!n32.getBoolean(sb3 + "_inverted", false)) {
                    z11 = false;
                }
            }
            str2 = string;
            backgroundTypePattern = new TdApi.BackgroundTypePattern(o0(n32, sb3), Math.abs(i12), z11, n32.getBoolean(sb3 + "_moving", false));
        }
        return new h(o6Var, str2, backgroundTypePattern, z10, m0(str2, backgroundTypePattern), sb3 + "_legacy_id");
    }

    public static int o(TdApi.BackgroundFillFreeformGradient backgroundFillFreeformGradient) {
        int n10 = n(d.b(255, backgroundFillFreeformGradient.colors[0]), d.b(255, backgroundFillFreeformGradient.colors[1]));
        int i10 = 2;
        if (backgroundFillFreeformGradient.colors.length >= 2) {
            while (true) {
                int[] iArr = backgroundFillFreeformGradient.colors;
                if (i10 >= iArr.length) {
                    break;
                }
                n10 = n(n10, d.b(255, iArr[i10]));
                i10++;
            }
        }
        return n10;
    }

    public static TdApi.BackgroundFill o0(SharedPreferences sharedPreferences, String str) {
        int i10 = sharedPreferences.getInt(str + "_fill", 1);
        if (i10 == 2) {
            int i11 = sharedPreferences.getInt(str + "_color_top", 0);
            int i12 = sharedPreferences.getInt(str + "_color_bottom", 0);
            return new TdApi.BackgroundFillGradient(i11, i12, sharedPreferences.getInt(str + "_rotation_angle", 0));
        } else if (i10 != 3) {
            return new TdApi.BackgroundFillSolid(sharedPreferences.getInt(str + "_color", 0));
        } else {
            return new TdApi.BackgroundFillFreeformGradient(((LevelDB) sharedPreferences).p(str + "_colors"));
        }
    }

    public static int q(int i10) {
        switch (i10) {
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
                throw j.B0(i10, "themeId");
        }
    }

    public static int s(int i10, int i11) {
        if (i10 == 32) {
            return j.N(R.id.theme_color_wp_catsBeige);
        }
        if (i10 == 33) {
            return j.N(R.id.theme_color_wp_catsOrange);
        }
        if (i10 == 35) {
            return j.N(R.id.theme_color_wp_catsGreen);
        }
        if (i10 == 36) {
            return j.N(R.id.theme_color_wp_catsPink);
        }
        if (i10 == 114) {
            return j.N(R.id.theme_color_wp_circlesBlue);
        }
        switch (i10) {
            case 1000000:
            case 1000001:
                return j.N(R.id.theme_color_wp_cats);
            default:
                int t10 = t(i10);
                return (16777215 & t10) != 0 ? d.b(51, t10) : i11;
        }
    }

    public static int t(int i10) {
        if (i10 == 19) {
            return 4206595;
        }
        if (i10 == 103) {
            return 799321;
        }
        if (i10 == 109) {
            return 4206595;
        }
        switch (i10) {
            case 1000000:
                return 14083311;
            case 1000001:
                return 799321;
            default:
                return 0;
        }
    }

    public static int[] v() {
        return new int[]{1000001, 1000000, 106, 103, 105, 107, 109, 111, 110, 112, 32, 15, 14, 5, 11, 33, 16, 12, 10, 7, d.j.F0, 4, 19, 1, 17, 6, 35, 36};
    }

    public static String x(int i10) {
        return f(i10);
    }

    public static String y(int i10, int i11, int i12) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f(i10));
        sb2.append("-");
        sb2.append(f(i11));
        if (i12 != 0) {
            str = "?rotation=" + i12;
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static String z(int[] iArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            sb2.append(f(iArr[i10]));
            if (i10 != iArr.length - 1) {
                sb2.append("~");
            }
        }
        return sb2.toString();
    }

    public int B() {
        if (!X()) {
            return 0;
        }
        if (this.f849k == null) {
            this.f849k = Integer.valueOf(D(((TdApi.BackgroundTypePattern) this.f841c).fill));
        }
        return this.f849k.intValue();
    }

    public float F() {
        if (X()) {
            return Math.abs(((TdApi.BackgroundTypePattern) this.f841c).intensity) / 100.0f;
        }
        return 1.0f;
    }

    public ld.h G(boolean z10) {
        if (z10) {
            return this.f848j;
        }
        ld.h hVar = this.f847i;
        return hVar != null ? hVar : this.f846h;
    }

    public int H() {
        if (U()) {
            return ((TdApi.BackgroundFillGradient) ((TdApi.BackgroundTypeFill) this.f841c).fill).rotationAngle;
        }
        if (Z()) {
            return ((TdApi.BackgroundFillGradient) ((TdApi.BackgroundTypePattern) this.f841c).fill).rotationAngle;
        }
        return 0;
    }

    public int J() {
        if (!S()) {
            return 0;
        }
        if (this.f849k == null) {
            this.f849k = Integer.valueOf(D(((TdApi.BackgroundTypeFill) this.f841c).fill));
        }
        return this.f849k.intValue();
    }

    public int K() {
        if (U()) {
            return ((TdApi.BackgroundFillGradient) ((TdApi.BackgroundTypeFill) this.f841c).fill).topColor;
        }
        if (Z()) {
            return ((TdApi.BackgroundFillGradient) ((TdApi.BackgroundTypePattern) this.f841c).fill).topColor;
        }
        if (T()) {
            return ((TdApi.BackgroundFillFreeformGradient) ((TdApi.BackgroundTypeFill) this.f841c).fill).colors[0];
        }
        if (Y()) {
            return ((TdApi.BackgroundFillFreeformGradient) ((TdApi.BackgroundTypePattern) this.f841c).fill).colors[0];
        }
        return 0;
    }

    public boolean L() {
        return M(this.f841c);
    }

    public boolean N() {
        return this.f844f == 1000001;
    }

    public boolean O() {
        int i10 = this.f844f;
        return i10 != 0 && P(i10);
    }

    public boolean Q() {
        return !ib.i.i(this.f842d);
    }

    public boolean R() {
        return ib.i.i(this.f840b) && ib.i.i(this.f842d);
    }

    public boolean S() {
        TdApi.BackgroundType backgroundType = this.f841c;
        return backgroundType != null && backgroundType.getConstructor() == 993008684;
    }

    public boolean T() {
        return S() && ((TdApi.BackgroundTypeFill) this.f841c).fill.getConstructor() == -1145469255;
    }

    public boolean U() {
        return S() && ((TdApi.BackgroundTypeFill) this.f841c).fill.getConstructor() == -1839206017;
    }

    public boolean V() {
        return S() && ((TdApi.BackgroundTypeFill) this.f841c).fill.getConstructor() == 1010678813;
    }

    public boolean W() {
        return this.f844f != 0;
    }

    public boolean X() {
        TdApi.BackgroundType backgroundType = this.f841c;
        return backgroundType != null && backgroundType.getConstructor() == 1290213117;
    }

    public boolean Y() {
        return X() && ((TdApi.BackgroundTypePattern) this.f841c).fill.getConstructor() == -1145469255;
    }

    public boolean Z() {
        return X() && ((TdApi.BackgroundTypePattern) this.f841c).fill.getConstructor() == -1839206017;
    }

    public boolean a0() {
        TdApi.BackgroundType backgroundType = this.f841c;
        return backgroundType != null && backgroundType.getConstructor() == 1972128891;
    }

    public void c0(final o6 o6Var) {
        ld.h hVar = this.f846h;
        if (hVar instanceof j) {
            ((j) hVar).D0(new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    h.b0(o6.this, object);
                }
            });
        }
    }

    public int i() {
        return j(0);
    }

    public int j(int i10) {
        TdApi.BackgroundType backgroundType = this.f841c;
        if (backgroundType == null) {
            return i10;
        }
        int constructor = backgroundType.getConstructor();
        if (constructor != 993008684) {
            return constructor != 1290213117 ? i10 : k(((TdApi.BackgroundTypePattern) this.f841c).fill, i10);
        }
        return k(((TdApi.BackgroundTypeFill) this.f841c).fill, i10);
    }

    public void k0(c cVar, boolean z10) {
        ld.h hVar = this.f846h;
        ld.h hVar2 = null;
        if (hVar != null) {
            if (z10) {
                hVar2 = this.f847i;
            }
            cVar.j(hVar2, hVar);
            return;
        }
        cVar.j(null, null);
    }

    public int m() {
        if (U()) {
            return ((TdApi.BackgroundFillGradient) ((TdApi.BackgroundTypeFill) this.f841c).fill).bottomColor;
        }
        if (Z()) {
            return ((TdApi.BackgroundFillGradient) ((TdApi.BackgroundTypePattern) this.f841c).fill).bottomColor;
        }
        if (T()) {
            int[] iArr = ((TdApi.BackgroundFillFreeformGradient) ((TdApi.BackgroundTypeFill) this.f841c).fill).colors;
            return iArr[iArr.length - 1];
        } else if (!Y()) {
            return 0;
        } else {
            int[] iArr2 = ((TdApi.BackgroundFillFreeformGradient) ((TdApi.BackgroundTypePattern) this.f841c).fill).colors;
            return iArr2[iArr2.length - 1];
        }
    }

    public String p() {
        return this.f842d;
    }

    public void p0(int i10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f839a != 0) {
            str = "wallpaper_" + this.f839a;
        } else {
            str = "wallpaper";
        }
        sb2.append(str);
        sb2.append(i.S1(i10));
        String sb3 = sb2.toString();
        LevelDB W = i.c2().W();
        if (ib.i.i(this.f845g)) {
            W.remove(sb3 + "_remote_id");
        } else {
            W.putString(sb3 + "_remote_id", this.f845g);
        }
        if (R()) {
            W.putBoolean(sb3 + "_empty", true);
        } else {
            W.remove(sb3 + "_empty");
        }
        if (Q()) {
            W.putBoolean(sb3 + "_custom", true).putString(sb3 + "_path", this.f842d);
        } else {
            W.remove(sb3 + "_custom").remove(sb3 + "_path");
        }
        if (ib.i.i(this.f840b) || (S() && this.f840b.equals(x(i())))) {
            W.remove(sb3 + "_name");
        } else {
            W.putString(sb3 + "_name", this.f840b);
        }
        if (this.f843e) {
            W.putBoolean(sb3 + "_vector", true);
        } else {
            W.remove(sb3 + "_vector");
        }
        TdApi.BackgroundType backgroundType = this.f841c;
        if (backgroundType != null) {
            int constructor = backgroundType.getConstructor();
            if (constructor == 993008684) {
                W.putInt(sb3 + "_type", 1).remove(sb3 + "_intensity").remove(sb3 + "_moving").remove(sb3 + "_blurred");
                j0(W, sb3, ((TdApi.BackgroundTypeFill) this.f841c).fill);
            } else if (constructor == 1290213117) {
                TdApi.BackgroundTypePattern backgroundTypePattern = (TdApi.BackgroundTypePattern) this.f841c;
                if (backgroundTypePattern.intensity >= 0) {
                    W.putInt(sb3 + "_type", 3).putInt(sb3 + "_intensity", backgroundTypePattern.intensity).putBoolean(sb3 + "_moving", backgroundTypePattern.isMoving).putBoolean(sb3 + "_inverted", backgroundTypePattern.isInverted).remove(sb3 + "_blurred");
                    j0(W, sb3, backgroundTypePattern.fill);
                } else {
                    throw new IllegalArgumentException();
                }
            } else if (constructor == 1972128891) {
                TdApi.BackgroundTypeWallpaper backgroundTypeWallpaper = (TdApi.BackgroundTypeWallpaper) this.f841c;
                W.putInt(sb3 + "_type", 2).putBoolean(sb3 + "_moving", backgroundTypeWallpaper.isMoving).putBoolean(sb3 + "_blurred", backgroundTypeWallpaper.isBlurred).remove(sb3 + "_color").remove(sb3 + "_intensity").remove(sb3 + "_inverted");
            } else {
                throw new UnsupportedOperationException(this.f841c.toString());
            }
        } else {
            W.remove(sb3 + "_type").remove(sb3 + "_color").remove(sb3 + "_intensity").remove(sb3 + "_inverted").remove(sb3 + "_moving").remove(sb3 + "_blurred").remove(sb3 + "_fill").remove(sb3 + "_color_top").remove(sb3 + "_color_bottom").remove(sb3 + "_colors").remove(sb3 + "_rotation_angle");
        }
        W.apply();
    }

    public void q0(int i10) {
        this.f844f = i10;
    }

    public int[] r() {
        if (T()) {
            return ((TdApi.BackgroundFillFreeformGradient) ((TdApi.BackgroundTypeFill) this.f841c).fill).colors;
        }
        return Y() ? ((TdApi.BackgroundFillFreeformGradient) ((TdApi.BackgroundTypePattern) this.f841c).fill).colors : new int[0];
    }

    public final void r0(ld.h hVar) {
        this.f848j = hVar;
        if (hVar != null) {
            hVar.s0(2);
        }
    }

    public final void s0(ld.h hVar) {
        this.f847i = hVar;
        if (hVar != null) {
            hVar.j0(true);
            hVar.s0(2);
        }
    }

    public final void t0(ld.h hVar, boolean z10) {
        this.f846h = hVar;
        if (hVar != null) {
            hVar.j0(true);
            hVar.b0();
            if (this.f843e) {
                hVar.e0();
            }
            if (X()) {
                hVar.s0(3);
                hVar.t0(a0.D());
                return;
            }
            hVar.s0(2);
            if (z10) {
                hVar.t0(160);
                hVar.f0();
                return;
            }
            hVar.t0(Math.min(1480, a0.D()));
            hVar.k0();
        }
    }

    public int u() {
        return this.f844f;
    }

    public String w() {
        return this.f840b;
    }

    public h(o6 o6Var, String str, TdApi.BackgroundType backgroundType, boolean z10, int i10) {
        this(o6Var, str, backgroundType, z10, i10, null);
    }

    public h(zd.o6 r13, java.lang.String r14, org.drinkless.td.libcore.telegram.TdApi.BackgroundType r15, boolean r16, int r17, java.lang.String r18) {
        throw new UnsupportedOperationException("Method not decompiled: ae.h.<init>(zd.o6, java.lang.String, org.drinkless.td.libcore.telegram.TdApi$BackgroundType, boolean, int, java.lang.String):void");
    }

    public h(o6 o6Var, int i10) {
        this(o6Var, i10, l0(i10));
    }

    public h(o6 o6Var, int i10, int i11) {
        this(o6Var, x(i10), new TdApi.BackgroundTypeFill(new TdApi.BackgroundFillSolid(i10)), false, i11);
    }

    public h(o6 o6Var, TdApi.Background background) {
        this(o6Var, background, M(background.type));
    }

    public h(o6 o6Var, TdApi.Background background, boolean z10) {
        TdApi.Document document;
        this.f839a = o6Var.A6();
        this.f840b = background.name;
        this.f841c = background.type;
        this.f842d = null;
        TdApi.Document document2 = background.document;
        this.f843e = document2 != null && "application/x-tgwallpattern".equals(document2.mimeType);
        this.f844f = m0(background.name, background.type);
        int constructor = this.f841c.getConstructor();
        if ((constructor == 1290213117 || constructor == 1972128891) && (document = background.document) != null) {
            t0(new ld.h(o6Var, document.document), z10);
            TdApi.Thumbnail thumbnail = background.document.thumbnail;
            if (thumbnail != null) {
                s0(t2.D5(o6Var, thumbnail));
            }
            if (background.document.minithumbnail != null) {
                r0(new ld.i(background.document.minithumbnail));
            }
        }
    }
}
