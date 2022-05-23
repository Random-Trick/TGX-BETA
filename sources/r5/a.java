package r5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import t5.b;

public class a {
    @RecentlyNullable
    @Deprecated
    public static byte[] a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        MessageDigest b10;
        PackageInfo d10 = b.a(context).d(str, 64);
        Signature[] signatureArr = d10.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b10 = b("SHA1")) == null) {
            return null;
        }
        return b10.digest(d10.signatures[0].toByteArray());
    }

    @RecentlyNullable
    public static MessageDigest b(@RecentlyNonNull String str) {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
