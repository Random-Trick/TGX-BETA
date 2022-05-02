package ae;

import org.thunderdog.challegram.R;

public final class C0291h extends C0288e {
    public C0291h() {
        super(10);
    }

    @Override
    public float mo93d(int i) {
        switch (i) {
            case R.id.theme_property_dark:
            case R.id.theme_property_parentTheme:
            case R.id.theme_property_shadowDepth:
            case R.id.theme_property_wallpaperUsageId:
                return 1.0f;
            default:
                return super.mo93d(i);
        }
    }

    @Override
    public int mo92e(int r1) {
        throw new UnsupportedOperationException("Method not decompiled: ae.C0291h.mo92e(int):int");
    }
}
