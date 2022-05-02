package p132j4;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p073f4.AbstractC4270h;
import p073f4.C4260a;
import p073f4.C4267e;
import p343y6.C10422b;
import p343y6.C10428d;

public final class C5845a extends AbstractC4270h {
    public static final Pattern f18709c = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder f18710a = C10428d.f33498c.newDecoder();
    public final CharsetDecoder f18711b = C10428d.f33497b.newDecoder();

    @Override
    public C4260a mo19175b(C4267e eVar, ByteBuffer byteBuffer) {
        String c = m21943c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (c == null) {
            return new C4260a(new C5848c(bArr, null, null));
        }
        Matcher matcher = f18709c.matcher(c);
        String str2 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String c2 = C10422b.m5149c(group);
                c2.hashCode();
                if (c2.equals("streamurl")) {
                    str2 = group2;
                } else if (c2.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new C4260a(new C5848c(bArr, str, str2));
    }

    public final String m21943c(ByteBuffer byteBuffer) {
        try {
            return this.f18710a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                return this.f18711b.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.f18711b.reset();
                byteBuffer.rewind();
            }
        } finally {
            this.f18710a.reset();
            byteBuffer.rewind();
        }
    }
}
