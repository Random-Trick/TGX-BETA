package ae;

import org.thunderdog.challegram.R;
import p364zd.AbstractC11531p;
import p364zd.C11514c0;
import qa.C8298k;

public class C0285b extends C0288e {
    public final AbstractC11531p f913b;

    public C0285b(int i, int i2) {
        super(i);
        AbstractC11531p a = C11514c0.m348a(i2);
        C8298k.m12934d(a, "getBuiltinTheme(bubbleThemeId)");
        this.f913b = a;
    }

    @Override
    public int mo92e(int i) {
        switch (i) {
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
                return this.f913b.mo92e(i);
            default:
                return super.mo92e(i);
        }
    }
}
