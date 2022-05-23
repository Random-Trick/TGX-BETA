package be;

import ae.s;
import org.thunderdog.challegram.R;

public final class a extends s {
    public a() {
        super(3, 2);
    }

    @Override
    public float d(int i10) {
        switch (i10) {
            case R.id.theme_property_bubbleOutline:
            case R.id.theme_property_replaceShadowsWithSeparators:
                return 1.0f;
            case R.id.theme_property_parentTheme:
                return 2.0f;
            default:
                return super.d(i10);
        }
    }

    @Override
    public int e(int i10) {
        switch (i10) {
            case R.id.theme_color_badgeFailed:
                return -9408352;
            case R.id.theme_color_badgeMuted:
            case R.id.theme_color_togglerInactiveBackground:
                return -9408400;
            case R.id.theme_color_bubbleIn_outline:
            case R.id.theme_color_bubbleIn_separator:
            case R.id.theme_color_bubbleOut_outline:
            case R.id.theme_color_bubble_chatSeparator:
            case R.id.theme_color_chatSeparator:
            case R.id.theme_color_inputInactive:
            case R.id.theme_color_separator:
            case R.id.theme_color_shareSeparator:
                return -14211289;
            case R.id.theme_color_bubbleIn_textLink:
            case R.id.theme_color_bubbleOut_textLink:
            case R.id.theme_color_iv_textLink:
            case R.id.theme_color_iv_textMarkedLink:
            case R.id.theme_color_textLink:
                return -6250336;
            case R.id.theme_color_bubbleIn_textLinkPressHighlight:
            case R.id.theme_color_iv_textLinkPressHighlight:
            case R.id.theme_color_textLinkPressHighlight:
                return 2007015584;
            case R.id.theme_color_bubbleOut_waveformActive:
            case R.id.theme_color_messageAuthor:
            case R.id.theme_color_notification:
            case R.id.theme_color_notificationPlayer:
            case R.id.theme_color_waveformActive:
                return -1;
            case R.id.theme_color_chatListIcon:
            case R.id.theme_color_chatListMute:
                return -8947849;
            case R.id.theme_color_circleButtonNewChannel:
            case R.id.theme_color_circleButtonNewChat:
            case R.id.theme_color_circleButtonNewGroup:
            case R.id.theme_color_circleButtonNewSecret:
                return -14803426;
            case R.id.theme_color_file:
            case R.id.theme_color_fileGreen:
            case R.id.theme_color_fileRed:
            case R.id.theme_color_fileYellow:
                return -14013910;
            case R.id.theme_color_filling:
            case R.id.theme_color_headerLightBackground:
                return -16777216;
            case R.id.theme_color_headerBackground:
            case R.id.theme_color_passcode:
                return -15724528;
            case R.id.theme_color_iconLight:
                return -10790053;
            case R.id.theme_color_messageSelection:
                return 452984831;
            case R.id.theme_color_togglerActiveBackground:
                return -4539718;
            case R.id.theme_color_togglerInactive:
                return -7303024;
            default:
                return super.e(i10);
        }
    }
}
