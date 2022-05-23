package be;

import ae.c0;
import ae.p;
import org.thunderdog.challegram.R;
import ra.k;

public class b extends e {
    public final p f4192b;

    public b(int i10, int i11) {
        super(i10);
        p a10 = c0.a(i11);
        k.d(a10, "getBuiltinTheme(bubbleThemeId)");
        this.f4192b = a10;
    }

    @Override
    public int e(int i10) {
        switch (i10) {
            case R.id.theme_color_bubbleOut_background:
            case R.id.theme_color_bubbleOut_chatCorrectChosenFilling:
            case R.id.theme_color_bubbleOut_chatCorrectChosenFillingContent:
            case R.id.theme_color_bubbleOut_chatCorrectFilling:
            case R.id.theme_color_bubbleOut_chatCorrectFillingContent:
            case R.id.theme_color_bubbleOut_chatNegativeFilling:
            case R.id.theme_color_bubbleOut_chatNegativeFillingContent:
            case R.id.theme_color_bubbleOut_chatNeutralFillingContent:
            case R.id.theme_color_bubbleOut_chatVerticalLine:
            case R.id.theme_color_bubbleOut_file:
            case R.id.theme_color_bubbleOut_inlineIcon:
            case R.id.theme_color_bubbleOut_inlineOutline:
            case R.id.theme_color_bubbleOut_inlineText:
            case R.id.theme_color_bubbleOut_messageAuthor:
            case R.id.theme_color_bubbleOut_messageAuthorPsa:
            case R.id.theme_color_bubbleOut_outline:
            case R.id.theme_color_bubbleOut_pressed:
            case R.id.theme_color_bubbleOut_progress:
            case R.id.theme_color_bubbleOut_separator:
            case R.id.theme_color_bubbleOut_text:
            case R.id.theme_color_bubbleOut_textLink:
            case R.id.theme_color_bubbleOut_textLinkPressHighlight:
            case R.id.theme_color_bubbleOut_ticks:
            case R.id.theme_color_bubbleOut_ticksRead:
            case R.id.theme_color_bubbleOut_time:
            case R.id.theme_color_bubbleOut_waveformActive:
            case R.id.theme_color_bubbleOut_waveformInactive:
                return this.f4192b.e(i10);
            default:
                return super.e(i10);
        }
    }
}
