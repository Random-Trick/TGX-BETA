package p193nb;

import java.util.Objects;
import org.drinkless.p210td.libcore.telegram.TdApi;
import qa.C8298k;

public final class C7325i {
    public static final boolean m16876a(TdApi.DraftMessage draftMessage) {
        if (draftMessage != null) {
            if (draftMessage.replyToMessageId == 0) {
                TdApi.InputMessageContent inputMessageContent = draftMessage.inputMessageText;
                Objects.requireNonNull(inputMessageContent, "null cannot be cast to non-null type org.drinkless.td.libcore.telegram.TdApi.InputMessageText");
                if (C7321e.m16965a1(((TdApi.InputMessageText) inputMessageContent).text)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean m16875b(TdApi.FormattedText formattedText) {
        if (formattedText != null) {
            String str = formattedText.text;
            if (!(str == null || str.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean m16874c(TdApi.RichText richText) {
        if (richText == null) {
            return true;
        }
        switch (richText.getConstructor()) {
            case TdApi.RichTextAnchorLink.CONSTRUCTOR:
                return C7321e.m16962b1(((TdApi.RichTextAnchorLink) richText).text);
            case TdApi.RichTextIcon.CONSTRUCTOR:
            case TdApi.RichTextAnchor.CONSTRUCTOR:
                break;
            case TdApi.RichTextMarked.CONSTRUCTOR:
                return C7321e.m16962b1(((TdApi.RichTextMarked) richText).text);
            case TdApi.RichTextFixed.CONSTRUCTOR:
                return C7321e.m16962b1(((TdApi.RichTextFixed) richText).text);
            case TdApi.RichTextReference.CONSTRUCTOR:
                return C7321e.m16962b1(((TdApi.RichTextReference) richText).text);
            case TdApi.RichTextSubscript.CONSTRUCTOR:
                return C7321e.m16962b1(((TdApi.RichTextSubscript) richText).text);
            case TdApi.RichTextUnderline.CONSTRUCTOR:
                return C7321e.m16962b1(((TdApi.RichTextUnderline) richText).text);
            case TdApi.RichTextSuperscript.CONSTRUCTOR:
                return C7321e.m16962b1(((TdApi.RichTextSuperscript) richText).text);
            case TdApi.RichTextEmailAddress.CONSTRUCTOR:
                return C7321e.m16962b1(((TdApi.RichTextEmailAddress) richText).text);
            case TdApi.RichTextUrl.CONSTRUCTOR:
                return C7321e.m16962b1(((TdApi.RichTextUrl) richText).text);
            case TdApi.RichTextPhoneNumber.CONSTRUCTOR:
                return C7321e.m16962b1(((TdApi.RichTextPhoneNumber) richText).text);
            case TdApi.RichTextPlain.CONSTRUCTOR:
                String str = ((TdApi.RichTextPlain) richText).text;
                if (str == null || str.length() == 0) {
                    return true;
                }
                break;
            case TdApi.RichTextStrikethrough.CONSTRUCTOR:
                return C7321e.m16962b1(((TdApi.RichTextStrikethrough) richText).text);
            case TdApi.RichTexts.CONSTRUCTOR:
                TdApi.RichText[] richTextArr = ((TdApi.RichTexts) richText).texts;
                C8298k.m12935d(richTextArr, "this as RichTexts).texts");
                int length = richTextArr.length;
                int i = 0;
                while (i < length) {
                    TdApi.RichText richText2 = richTextArr[i];
                    i++;
                    if (!C7321e.m16962b1(richText2)) {
                        return false;
                    }
                }
                return true;
            case TdApi.RichTextBold.CONSTRUCTOR:
                return C7321e.m16962b1(((TdApi.RichTextBold) richText).text);
            case TdApi.RichTextItalic.CONSTRUCTOR:
                return C7321e.m16962b1(((TdApi.RichTextItalic) richText).text);
            default:
                String object = richText.toString();
                C8298k.m12935d(object, "this.toString()");
                throw new IllegalStateException(object.toString());
        }
        return false;
    }

    public static final boolean m16873d(TdApi.StatisticalValue statisticalValue) {
        if (statisticalValue != null) {
            double d = statisticalValue.value;
            if (!(d == statisticalValue.previousValue)) {
                return false;
            }
            if (!(d == 0.0d)) {
                return false;
            }
        }
        return true;
    }
}
