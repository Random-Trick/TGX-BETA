package p020b5;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public final class C1217m {
    public static boolean f4541a = false;

    public static final class C1218a extends RuntimeException {
        public C1218a(String str) {
            super(str);
        }
    }

    public static void m37933b() {
        int i = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
            C1230s.m37887c("GlUtil", valueOf.length() != 0 ? "glError ".concat(valueOf) : new String("glError "));
            i = glGetError;
        }
        if (i != 0) {
            String valueOf2 = String.valueOf(GLU.gluErrorString(i));
            m37927h(valueOf2.length() != 0 ? "glError ".concat(valueOf2) : new String("glError "));
        }
    }

    public static FloatBuffer m37932c(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static FloatBuffer m37931d(float[] fArr) {
        return (FloatBuffer) m37932c(fArr.length).put(fArr).flip();
    }

    public static int m37930e() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m37933b();
        return iArr[0];
    }

    public static boolean m37929f(Context context) {
        String eglQueryString;
        int i = C1216l0.f4526a;
        if (i < 24) {
            return false;
        }
        if (i >= 26 || (!"samsung".equals(C1216l0.f4528c) && !"XT1650".equals(C1216l0.f4529d))) {
            return (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean m37928g() {
        String eglQueryString;
        return C1216l0.f4526a >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    public static void m37927h(String str) {
        C1230s.m37887c("GlUtil", str);
        if (f4541a) {
            throw new C1218a(str);
        }
    }

    public static final class C1219b {
        public final int f4542a;

        public C1219b(String str, String str2) {
            this.f4542a = GLES20.glCreateProgram();
            C1217m.m37933b();
            m37926a(35633, str);
            m37926a(35632, str2);
        }

        public final void m37926a(int i, String str) {
            int glCreateShader = GLES20.glCreateShader(i);
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = {0};
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] != 1) {
                String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
                StringBuilder sb2 = new StringBuilder(String.valueOf(glGetShaderInfoLog).length() + 10 + String.valueOf(str).length());
                sb2.append(glGetShaderInfoLog);
                sb2.append(", source: ");
                sb2.append(str);
                C1217m.m37927h(sb2.toString());
            }
            GLES20.glAttachShader(this.f4542a, glCreateShader);
            GLES20.glDeleteShader(glCreateShader);
            C1217m.m37933b();
        }

        public int m37925b(String str) {
            return GLES20.glGetAttribLocation(this.f4542a, str);
        }

        public int m37924c(String str) {
            return GLES20.glGetUniformLocation(this.f4542a, str);
        }

        public void m37923d() {
            GLES20.glLinkProgram(this.f4542a);
            int[] iArr = {0};
            GLES20.glGetProgramiv(this.f4542a, 35714, iArr, 0);
            if (iArr[0] != 1) {
                String valueOf = String.valueOf(GLES20.glGetProgramInfoLog(this.f4542a));
                C1217m.m37927h(valueOf.length() != 0 ? "Unable to link shader program: \n".concat(valueOf) : new String("Unable to link shader program: \n"));
            }
            C1217m.m37933b();
            GLES20.glUseProgram(this.f4542a);
        }

        public C1219b(String[] strArr, String[] strArr2) {
            this(TextUtils.join("\n", strArr), TextUtils.join("\n", strArr2));
        }
    }
}
