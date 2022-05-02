package p364zd;

import java.util.Map;
import org.thunderdog.challegram.R;
import p107ha.C5048h;
import p123ia.C5295h0;
import qa.C8294g;
import qa.C8298k;

public final class C11511b0 {
    public static final C11512a f36530y = new C11512a(null);
    public Float f36531a;
    public Float f36532b;
    public Float f36533c;
    public Float f36534d;
    public Float f36535e;
    public Float f36536f;
    public Float f36537g;
    public Float f36538h;
    public Float f36539i;
    public Float f36540j;
    public Float f36541k;
    public Float f36542l;
    public Float f36543m;
    public Float f36544n;
    public Float f36545o;
    public Float f36546p;
    public Float f36547q;
    public Float f36548r;
    public Float f36549s;
    public Float f36550t;
    public Float f36551u;
    public Float f36552v;
    public Float f36553w;
    public Float f36554x;

    public static final class C11512a {
        public C11512a() {
        }

        public C11512a(C8294g gVar) {
            this();
        }

        public final Map<String, Integer> m352a() {
            return C5295h0.m23422e(new C5048h("parentTheme", Integer.valueOf((int) R.id.theme_property_parentTheme)), new C5048h("wallpaperId", Integer.valueOf((int) R.id.theme_property_wallpaperId)), new C5048h("dark", Integer.valueOf((int) R.id.theme_property_dark)), new C5048h("imageCorner", Integer.valueOf((int) R.id.theme_property_imageCorner)), new C5048h("replaceShadowsWithSeparators", Integer.valueOf((int) R.id.theme_property_replaceShadowsWithSeparators)), new C5048h("bubbleCornerMerged", Integer.valueOf((int) R.id.theme_property_bubbleCornerMerged)), new C5048h("bubbleCorner", Integer.valueOf((int) R.id.theme_property_bubbleCorner)), new C5048h("bubbleCornerLegacy", Integer.valueOf((int) R.id.theme_property_bubbleCornerLegacy)), new C5048h("bubbleOuterMargin", Integer.valueOf((int) R.id.theme_property_bubbleOuterMargin)), new C5048h("bubbleOutline", Integer.valueOf((int) R.id.theme_property_bubbleOutline)), new C5048h("bubbleOutlineSize", Integer.valueOf((int) R.id.theme_property_bubbleOutlineSize)), new C5048h("bubbleUnreadShadow", Integer.valueOf((int) R.id.theme_property_bubbleUnreadShadow)), new C5048h("bubbleDateCorner", Integer.valueOf((int) R.id.theme_property_bubbleDateCorner)), new C5048h("dateCorner", Integer.valueOf((int) R.id.theme_property_dateCorner)), new C5048h("wallpaperUsageId", Integer.valueOf((int) R.id.theme_property_wallpaperUsageId)), new C5048h("shadowDepth", Integer.valueOf((int) R.id.theme_property_shadowDepth)), new C5048h("subtitleAlpha", Integer.valueOf((int) R.id.theme_property_subtitleAlpha)), new C5048h("lightStatusBar", Integer.valueOf((int) R.id.theme_property_lightStatusBar)), new C5048h("wallpaperOverrideDate", Integer.valueOf((int) R.id.theme_property_wallpaperOverrideDate)), new C5048h("wallpaperOverrideUnread", Integer.valueOf((int) R.id.theme_property_wallpaperOverrideUnread)), new C5048h("wallpaperOverrideMediaReply", Integer.valueOf((int) R.id.theme_property_wallpaperOverrideMediaReply)), new C5048h("wallpaperOverrideTime", Integer.valueOf((int) R.id.theme_property_wallpaperOverrideTime)), new C5048h("wallpaperOverrideButton", Integer.valueOf((int) R.id.theme_property_wallpaperOverrideButton)), new C5048h("wallpaperOverrideOverlay", Integer.valueOf((int) R.id.theme_property_wallpaperOverrideOverlay)));
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
                    C8298k.m12935d(D0, "newError(propertyId, \"propertyId\")");
                    throw D0;
            }
        }
    }

    public C11511b0() {
    }

    public static final Map<String, Integer> m355b() {
        return f36530y.m352a();
    }

    public static final String m354c(int i) {
        return f36530y.m351b(i);
    }

    public final Float m356a(int i) {
        switch (i) {
            case R.id.theme_property_bubbleCorner:
                return this.f36537g;
            case R.id.theme_property_bubbleCornerLegacy:
                return this.f36538h;
            case R.id.theme_property_bubbleCornerMerged:
                return this.f36536f;
            case R.id.theme_property_bubbleDateCorner:
                return this.f36543m;
            case R.id.theme_property_bubbleOuterMargin:
                return this.f36539i;
            case R.id.theme_property_bubbleOutline:
                return this.f36540j;
            case R.id.theme_property_bubbleOutlineSize:
                return this.f36541k;
            case R.id.theme_property_bubbleUnreadShadow:
                return this.f36542l;
            case R.id.theme_property_dark:
                return this.f36533c;
            case R.id.theme_property_dateCorner:
                return this.f36544n;
            case R.id.theme_property_imageCorner:
                return this.f36534d;
            case R.id.theme_property_lightStatusBar:
                return this.f36548r;
            case R.id.theme_property_parentTheme:
                return this.f36531a;
            case R.id.theme_property_replaceShadowsWithSeparators:
                return this.f36535e;
            case R.id.theme_property_shadowDepth:
                return this.f36546p;
            case R.id.theme_property_subtitleAlpha:
                return this.f36547q;
            case R.id.theme_property_wallpaperId:
                return this.f36532b;
            case R.id.theme_property_wallpaperOverrideButton:
                return this.f36553w;
            case R.id.theme_property_wallpaperOverrideDate:
                return this.f36549s;
            case R.id.theme_property_wallpaperOverrideMediaReply:
                return this.f36551u;
            case R.id.theme_property_wallpaperOverrideOverlay:
                return this.f36554x;
            case R.id.theme_property_wallpaperOverrideTime:
                return this.f36552v;
            case R.id.theme_property_wallpaperOverrideUnread:
                return this.f36550t;
            case R.id.theme_property_wallpaperUsageId:
                return this.f36545o;
            default:
                RuntimeException D0 = C11524j.m247D0(i, "propertyId");
                C8298k.m12935d(D0, "newError(propertyId, \"propertyId\")");
                throw D0;
        }
    }

    public final void m353d(int i, Float f) {
        switch (i) {
            case R.id.theme_property_bubbleCorner:
                this.f36537g = f;
                return;
            case R.id.theme_property_bubbleCornerLegacy:
                this.f36538h = f;
                return;
            case R.id.theme_property_bubbleCornerMerged:
                this.f36536f = f;
                return;
            case R.id.theme_property_bubbleDateCorner:
                this.f36543m = f;
                return;
            case R.id.theme_property_bubbleOuterMargin:
                this.f36539i = f;
                return;
            case R.id.theme_property_bubbleOutline:
                this.f36540j = f;
                return;
            case R.id.theme_property_bubbleOutlineSize:
                this.f36541k = f;
                return;
            case R.id.theme_property_bubbleUnreadShadow:
                this.f36542l = f;
                return;
            case R.id.theme_property_dark:
                this.f36533c = f;
                return;
            case R.id.theme_property_dateCorner:
                this.f36544n = f;
                return;
            case R.id.theme_property_imageCorner:
                this.f36534d = f;
                return;
            case R.id.theme_property_lightStatusBar:
                this.f36548r = f;
                return;
            case R.id.theme_property_parentTheme:
                this.f36531a = f;
                return;
            case R.id.theme_property_replaceShadowsWithSeparators:
                this.f36535e = f;
                return;
            case R.id.theme_property_shadowDepth:
                this.f36546p = f;
                return;
            case R.id.theme_property_subtitleAlpha:
                this.f36547q = f;
                return;
            case R.id.theme_property_wallpaperId:
                this.f36532b = f;
                return;
            case R.id.theme_property_wallpaperOverrideButton:
                this.f36553w = f;
                return;
            case R.id.theme_property_wallpaperOverrideDate:
                this.f36549s = f;
                return;
            case R.id.theme_property_wallpaperOverrideMediaReply:
                this.f36551u = f;
                return;
            case R.id.theme_property_wallpaperOverrideOverlay:
                this.f36554x = f;
                return;
            case R.id.theme_property_wallpaperOverrideTime:
                this.f36552v = f;
                return;
            case R.id.theme_property_wallpaperOverrideUnread:
                this.f36550t = f;
                return;
            case R.id.theme_property_wallpaperUsageId:
                this.f36545o = f;
                return;
            default:
                RuntimeException D0 = C11524j.m247D0(i, "propertyId");
                C8298k.m12935d(D0, "newError(propertyId, \"propertyId\")");
                throw D0;
        }
    }

    public C11511b0(C11511b0 b0Var) {
        C8298k.m12934e(b0Var, "copy");
        this.f36531a = b0Var.f36531a;
        this.f36532b = b0Var.f36532b;
        this.f36533c = b0Var.f36533c;
        this.f36534d = b0Var.f36534d;
        this.f36535e = b0Var.f36535e;
        this.f36536f = b0Var.f36536f;
        this.f36537g = b0Var.f36537g;
        this.f36538h = b0Var.f36538h;
        this.f36539i = b0Var.f36539i;
        this.f36540j = b0Var.f36540j;
        this.f36541k = b0Var.f36541k;
        this.f36542l = b0Var.f36542l;
        this.f36543m = b0Var.f36543m;
        this.f36544n = b0Var.f36544n;
        this.f36545o = b0Var.f36545o;
        this.f36546p = b0Var.f36546p;
        this.f36547q = b0Var.f36547q;
        this.f36548r = b0Var.f36548r;
        this.f36549s = b0Var.f36549s;
        this.f36550t = b0Var.f36550t;
        this.f36551u = b0Var.f36551u;
        this.f36552v = b0Var.f36552v;
        this.f36553w = b0Var.f36553w;
        this.f36554x = b0Var.f36554x;
    }
}
