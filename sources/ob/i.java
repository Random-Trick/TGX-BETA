package ob;

import java.util.Objects;
import org.drinkless.td.libcore.telegram.TdApi;
import ra.k;

public final class i {
    public static final boolean a(TdApi.DraftMessage draftMessage) {
        if (draftMessage != null) {
            if (draftMessage.replyToMessageId == 0) {
                TdApi.InputMessageContent inputMessageContent = draftMessage.inputMessageText;
                Objects.requireNonNull(inputMessageContent, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.InputMessageText");
                if (e.c1(((TdApi.InputMessageText) inputMessageContent).text)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean b(TdApi.FormattedText formattedText) {
        if (formattedText != null) {
            String str = formattedText.text;
            if (!(str == null || str.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean c(TdApi.RichText richText) {
        if (richText == null) {
            return true;
        }
        switch (richText.getConstructor()) {
            case TdApi.RichTextAnchorLink.CONSTRUCTOR:
                return e.d1(((TdApi.RichTextAnchorLink) richText).text);
            case TdApi.RichTextIcon.CONSTRUCTOR:
            case TdApi.RichTextAnchor.CONSTRUCTOR:
                break;
            case TdApi.RichTextMarked.CONSTRUCTOR:
                return e.d1(((TdApi.RichTextMarked) richText).text);
            case TdApi.RichTextFixed.CONSTRUCTOR:
                return e.d1(((TdApi.RichTextFixed) richText).text);
            case TdApi.RichTextReference.CONSTRUCTOR:
                return e.d1(((TdApi.RichTextReference) richText).text);
            case TdApi.RichTextSubscript.CONSTRUCTOR:
                return e.d1(((TdApi.RichTextSubscript) richText).text);
            case TdApi.RichTextUnderline.CONSTRUCTOR:
                return e.d1(((TdApi.RichTextUnderline) richText).text);
            case TdApi.RichTextSuperscript.CONSTRUCTOR:
                return e.d1(((TdApi.RichTextSuperscript) richText).text);
            case TdApi.RichTextEmailAddress.CONSTRUCTOR:
                return e.d1(((TdApi.RichTextEmailAddress) richText).text);
            case TdApi.RichTextUrl.CONSTRUCTOR:
                return e.d1(((TdApi.RichTextUrl) richText).text);
            case TdApi.RichTextPhoneNumber.CONSTRUCTOR:
                return e.d1(((TdApi.RichTextPhoneNumber) richText).text);
            case TdApi.RichTextPlain.CONSTRUCTOR:
                String str = ((TdApi.RichTextPlain) richText).text;
                if (str == null || str.length() == 0) {
                    return true;
                }
                break;
            case TdApi.RichTextStrikethrough.CONSTRUCTOR:
                return e.d1(((TdApi.RichTextStrikethrough) richText).text);
            case TdApi.RichTexts.CONSTRUCTOR:
                TdApi.RichText[] richTextArr = ((TdApi.RichTexts) richText).texts;
                k.d(richTextArr, "this as RichTexts).texts");
                for (TdApi.RichText richText2 : richTextArr) {
                    if (!e.d1(richText2)) {
                        return false;
                    }
                }
                return true;
            case TdApi.RichTextBold.CONSTRUCTOR:
                return e.d1(((TdApi.RichTextBold) richText).text);
            case TdApi.RichTextItalic.CONSTRUCTOR:
                return e.d1(((TdApi.RichTextItalic) richText).text);
            default:
                String object = richText.toString();
                k.d(object, "this.toString()");
                throw new IllegalStateException(object.toString());
        }
        return false;
    }

    public static final boolean d(TdApi.StatisticalValue statisticalValue) {
        if (statisticalValue != null) {
            double d10 = statisticalValue.value;
            if (!(d10 == statisticalValue.previousValue)) {
                return false;
            }
            if (!(d10 == 0.0d)) {
                return false;
            }
        }
        return true;
    }
}
