package be;

import org.thunderdog.challegram.R;

public final class h extends e {
    public h() {
        super(10);
    }

    @Override
    public float d(int i10) {
        switch (i10) {
            case R.id.theme_property_dark:
            case R.id.theme_property_parentTheme:
            case R.id.theme_property_shadowDepth:
            case R.id.theme_property_wallpaperUsageId:
                return 1.0f;
            default:
                return super.d(i10);
        }
    }

    @Override
    public int e(int r1) {
        throw new UnsupportedOperationException("Method not decompiled: be.h.e(int):int");
    }
}
