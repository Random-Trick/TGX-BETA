package p232q5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p261s5.C8645b;

public class C8241a {
    @RecentlyNullable
    @Deprecated
    public static byte[] m13058a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        MessageDigest b;
        PackageInfo d = C8645b.m11820a(context).m11821d(str, 64);
        Signature[] signatureArr = d.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b = m13057b("SHA1")) == null) {
            return null;
        }
        return b.digest(d.signatures[0].toByteArray());
    }

    @RecentlyNullable
    public static MessageDigest m13057b(@RecentlyNonNull String str) {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
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
