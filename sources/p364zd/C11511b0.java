package p364zd;

import java.util.Map;
import org.thunderdog.challegram.R;
import p107ha.C5048h;
import p123ia.C5295h0;
import qa.C8294g;
import qa.C8298k;

public final class C11511b0 {
    public static final C11512a f36532y = new C11512a(null);
    public Float f36533a;
    public Float f36534b;
    public Float f36535c;
    public Float f36536d;
    public Float f36537e;
    public Float f36538f;
    public Float f36539g;
    public Float f36540h;
    public Float f36541i;
    public Float f36542j;
    public Float f36543k;
    public Float f36544l;
    public Float f36545m;
    public Float f36546n;
    public Float f36547o;
    public Float f36548p;
    public Float f36549q;
    public Float f36550r;
    public Float f36551s;
    public Float f36552t;
    public Float f36553u;
    public Float f36554v;
    public Float f36555w;
    public Float f36556x;

    public static final class C11512a {
        public C11512a() {
        }

        public C11512a(C8294g gVar) {
            this();
        }

        public final Map<String, Integer> m352a() {
            return C5295h0.m23423e(new C5048h("parentTheme", Integer.valueOf((int) R.id.theme_property_parentTheme)), new C5048h("wallpaperId", Integer.valueOf((int) R.id.theme_property_wallpaperId)), new C5048h("dark", Integer.valueOf((int) R.id.theme_property_dark)), new C5048h("imageCorner", Integer.valueOf((int) R.id.theme_property_imageCorner)), new C5048h("replaceShadowsWithSeparators", Integer.valueOf((int) R.id.theme_property_replaceShadowsWithSeparators)), new C5048h("bubbleCornerMerged", Integer.valueOf((int) R.id.theme_property_bubbleCornerMerged)), new C5048h("bubbleCorner", Integer.valueOf((int) R.id.theme_property_bubbleCorner)), new C5048h("bubbleCornerLegacy", Integer.valueOf((int) R.id.theme_property_bubbleCornerLegacy)), new C5048h("bubbleOuterMargin", Integer.valueOf((int) R.id.theme_property_bubbleOuterMargin)), new C5048h("bubbleOutline", Integer.valueOf((int) R.id.theme_property_bubbleOutline)), new C5048h("bubbleOutlineSize", Integer.valueOf((int) R.id.theme_property_bubbleOutlineSize)), new C5048h("bubbleUnreadShadow", Integer.valueOf((int) R.id.theme_property_bubbleUnreadShadow)), new C5048h("bubbleDateCorner", Integer.valueOf((int) R.id.theme_property_bubbleDateCorner)), new C5048h("dateCorner", Integer.valueOf((int) R.id.theme_property_dateCorner)), new C5048h("wallpaperUsageId", Integer.valueOf((int) R.id.theme_property_wallpaperUsageId)), new C5048h("shadowDepth", Integer.valueOf((int) R.id.theme_property_shadowDepth)), new C5048h("subtitleAlpha", Integer.valueOf((int) R.id.theme_property_subtitleAlpha)), new C5048h("lightStatusBar", Integer.valueOf((int) R.id.theme_property_lightStatusBar)), new C5048h("wallpaperOverrideDate", Integer.valueOf((int) R.id.theme_property_wallpaperOverrideDate)), new C5048h("wallpaperOverrideUnread", Integer.valueOf((int) R.id.theme_property_wallpaperOverrideUnread)), new C5048h("wallpaperOverrideMediaReply", Integer.valueOf((int) R.id.theme_property_wallpaperOverrideMediaReply)), new C5048h("wallpaperOverrideTime", Integer.valueOf((int) R.id.theme_property_wallpaperOverrideTime)), new C5048h("wallpaperOverrideButton", Integer.valueOf((int) R.id.theme_property_wallpaperOverrideButton)), new C5048h("wallpaperOverrideOverlay", Integer.valueOf((int) R.id.theme_property_wallpaperOverrideOverlay)));
        }

        public final String m351b(int i) {
            switch (i) {
                case R.id.theme_property_bubbleCorner:
                    return "bubbleCorner";
                case R.id.theme_property_bubbleCornerLegacy:
                    return "bubbleCornerLegacy";
                case R.id.theme_property_bubbleCornerMerged:
                    return "bubbleCornerMerged";
                case R.id.theme_property_bubbleDateCorner:
                    return "bubbleDateCorner";
                case R.id.theme_property_bubbleOuterMargin:
                    return "bubbleOuterMargin";
                case R.id.theme_property_bubbleOutline:
                    return "bubbleOutline";
                case R.id.theme_property_bubbleOutlineSize:
                    return "bubbleOutlineSize";
                case R.id.theme_property_bubbleUnreadShadow:
                    return "bubbleUnreadShadow";
                case R.id.theme_property_dark:
                    return "dark";
                case R.id.theme_property_dateCorner:
                    return "dateCorner";
                case R.id.theme_property_imageCorner:
                    return "imageCorner";
                case R.id.theme_property_lightStatusBar:
                    return "lightStatusBar";
                case R.id.theme_property_parentTheme:
                    return "parentTheme";
                case R.id.theme_property_replaceShadowsWithSeparators:
                    return "replaceShadowsWithSeparators";
                case R.id.theme_property_shadowDepth:
                    return "shadowDepth";
                case R.id.theme_property_subtitleAlpha:
                    return "subtitleAlpha";
                case R.id.theme_property_wallpaperId:
                    return "wallpaperId";
                case R.id.theme_property_wallpaperOverrideButton:
                    return "wallpaperOverrideButton";
                case R.id.theme_property_wallpaperOverrideDate:
                    return "wallpaperOverrideDate";
                case R.id.theme_property_wallpaperOverrideMediaReply:
                    return "wallpaperOverrideMediaReply";
                case R.id.theme_property_wallpaperOverrideOverlay:
                    return "wallpaperOverrideOverlay";
                case R.id.theme_property_wallpaperOverrideTime:
                    return "wallpaperOverrideTime";
                case R.id.theme_property_wallpaperOverrideUnread:
                    return "wallpaperOverrideUnread";
                case R.id.theme_property_wallpaperUsageId:
                    return "wallpaperUsageId";
                default:
                    RuntimeException D0 = C11524j.m247D0(i, "propertyId");
                    C8298k.m12934d(D0, "newError(propertyId, \"propertyId\")");
                    throw D0;
            }
        }
    }

    public C11511b0() {
    }

    public static final Map<String, Integer> m355b() {
        return f36532y.m352a();
    }

    public static final String m354c(int i) {
        return f36532y.m351b(i);
    }

    public final Float m356a(int i) {
        switch (i) {
            case R.id.theme_property_bubbleCorner:
                return this.f36539g;
            case R.id.theme_property_bubbleCornerLegacy:
                return this.f36540h;
            case R.id.theme_property_bubbleCornerMerged:
                return this.f36538f;
            case R.id.theme_property_bubbleDateCorner:
                return this.f36545m;
            case R.id.theme_property_bubbleOuterMargin:
                return this.f36541i;
            case R.id.theme_property_bubbleOutline:
                return this.f36542j;
            case R.id.theme_property_bubbleOutlineSize:
                return this.f36543k;
            case R.id.theme_property_bubbleUnreadShadow:
                return this.f36544l;
            case R.id.theme_property_dark:
                return this.f36535c;
            case R.id.theme_property_dateCorner:
                return this.f36546n;
            case R.id.theme_property_imageCorner:
                return this.f36536d;
            case R.id.theme_property_lightStatusBar:
                return this.f36550r;
            case R.id.theme_property_parentTheme:
                return this.f36533a;
            case R.id.theme_property_replaceShadowsWithSeparators:
                return this.f36537e;
            case R.id.theme_property_shadowDepth:
                return this.f36548p;
            case R.id.theme_property_subtitleAlpha:
                return this.f36549q;
            case R.id.theme_property_wallpaperId:
                return this.f36534b;
            case R.id.theme_property_wallpaperOverrideButton:
                return this.f36555w;
            case R.id.theme_property_wallpaperOverrideDate:
                return this.f36551s;
            case R.id.theme_property_wallpaperOverrideMediaReply:
                return this.f36553u;
            case R.id.theme_property_wallpaperOverrideOverlay:
                return this.f36556x;
            case R.id.theme_property_wallpaperOverrideTime:
                return this.f36554v;
            case R.id.theme_property_wallpaperOverrideUnread:
                return this.f36552t;
            case R.id.theme_property_wallpaperUsageId:
                return this.f36547o;
            default:
                RuntimeException D0 = C11524j.m247D0(i, "propertyId");
                C8298k.m12934d(D0, "newError(propertyId, \"propertyId\")");
                throw D0;
        }
    }

    public final void m353d(int i, Float f) {
        switch (i) {
            case R.id.theme_property_bubbleCorner:
                this.f36539g = f;
                return;
            case R.id.theme_property_bubbleCornerLegacy:
                this.f36540h = f;
                return;
            case R.id.theme_property_bubbleCornerMerged:
                this.f36538f = f;
                return;
            case R.id.theme_property_bubbleDateCorner:
                this.f36545m = f;
                return;
            case R.id.theme_property_bubbleOuterMargin:
                this.f36541i = f;
                return;
            case R.id.theme_property_bubbleOutline:
                this.f36542j = f;
                return;
            case R.id.theme_property_bubbleOutlineSize:
                this.f36543k = f;
                return;
            case R.id.theme_property_bubbleUnreadShadow:
                this.f36544l = f;
                return;
            case R.id.theme_property_dark:
                this.f36535c = f;
                return;
            case R.id.theme_property_dateCorner:
                this.f36546n = f;
                return;
            case R.id.theme_property_imageCorner:
                this.f36536d = f;
                return;
            case R.id.theme_property_lightStatusBar:
                this.f36550r = f;
                return;
            case R.id.theme_property_parentTheme:
                this.f36533a = f;
                return;
            case R.id.theme_property_replaceShadowsWithSeparators:
                this.f36537e = f;
                return;
            case R.id.theme_property_shadowDepth:
                this.f36548p = f;
                return;
            case R.id.theme_property_subtitleAlpha:
                this.f36549q = f;
                return;
            case R.id.theme_property_wallpaperId:
                this.f36534b = f;
                return;
            case R.id.theme_property_wallpaperOverrideButton:
                this.f36555w = f;
                return;
            case R.id.theme_property_wallpaperOverrideDate:
                this.f36551s = f;
                return;
            case R.id.theme_property_wallpaperOverrideMediaReply:
                this.f36553u = f;
                return;
            case R.id.theme_property_wallpaperOverrideOverlay:
                this.f36556x = f;
                return;
            case R.id.theme_property_wallpaperOverrideTime:
                this.f36554v = f;
                return;
            case R.id.theme_property_wallpaperOverrideUnread:
                this.f36552t = f;
                return;
            case R.id.theme_property_wallpaperUsageId:
                this.f36547o = f;
                return;
            default:
                RuntimeException D0 = C11524j.m247D0(i, "propertyId");
                C8298k.m12934d(D0, "newError(propertyId, \"propertyId\")");
                throw D0;
        }
    }

    public C11511b0(C11511b0 b0Var) {
        C8298k.m12933e(b0Var, "copy");
        this.f36533a = b0Var.f36533a;
        this.f36534b = b0Var.f36534b;
        this.f36535c = b0Var.f36535c;
        this.f36536d = b0Var.f36536d;
        this.f36537e = b0Var.f36537e;
        this.f36538f = b0Var.f36538f;
        this.f36539g = b0Var.f36539g;
        this.f36540h = b0Var.f36540h;
        this.f36541i = b0Var.f36541i;
        this.f36542j = b0Var.f36542j;
        this.f36543k = b0Var.f36543k;
        this.f36544l = b0Var.f36544l;
        this.f36545m = b0Var.f36545m;
        this.f36546n = b0Var.f36546n;
        this.f36547o = b0Var.f36547o;
        this.f36548p = b0Var.f36548p;
        this.f36549q = b0Var.f36549q;
        this.f36550r = b0Var.f36550r;
        this.f36551s = b0Var.f36551s;
        this.f36552t = b0Var.f36552t;
        this.f36553u = b0Var.f36553u;
        this.f36554v = b0Var.f36554v;
        this.f36555w = b0Var.f36555w;
        this.f36556x = b0Var.f36556x;
    }
}
