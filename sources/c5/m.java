package c5;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;

public final class m {
    public static boolean f4856a = false;
    public static final int[] f4857b = {12344};
    public static final int[] f4858c = {12445, 13120, 12344};
    public static final int[] f4859d = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] f4860e = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    public static final class a {
        public final String f4861a;
        public final int f4862b;
        public final int f4863c;

        public a(String str, int i10, int i11) {
            this.f4861a = str;
            this.f4862b = i10;
            this.f4863c = i11;
        }

        public static a a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35722, iArr, 0);
            byte[] bArr = new byte[iArr[0]];
            GLES20.glGetActiveAttrib(i10, i11, iArr[0], new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, m.o(bArr));
            return new a(str, i11, m.k(i10, str));
        }
    }

    public static final class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }

    public static final class c {
        public final int f4864a;
        public final a[] f4865b;
        public final d[] f4866c;
        public final Map<String, a> f4867d;
        public final Map<String, d> f4868e;

        public c(String str, String str2) {
            int glCreateProgram = GLES20.glCreateProgram();
            this.f4864a = glCreateProgram;
            m.g();
            m.f(glCreateProgram, 35633, str);
            m.f(glCreateProgram, 35632, str2);
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = {0};
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                String valueOf = String.valueOf(GLES20.glGetProgramInfoLog(glCreateProgram));
                m.p(valueOf.length() != 0 ? "Unable to link shader program: \n".concat(valueOf) : new String("Unable to link shader program: \n"));
            }
            GLES20.glUseProgram(glCreateProgram);
            this.f4867d = new HashMap();
            int[] iArr2 = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
            this.f4865b = new a[iArr2[0]];
            for (int i10 = 0; i10 < iArr2[0]; i10++) {
                a a10 = a.a(this.f4864a, i10);
                this.f4865b[i10] = a10;
                this.f4867d.put(a10.f4861a, a10);
            }
            this.f4868e = new HashMap();
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(this.f4864a, 35718, iArr3, 0);
            this.f4866c = new d[iArr3[0]];
            for (int i11 = 0; i11 < iArr3[0]; i11++) {
                d a11 = d.a(this.f4864a, i11);
                this.f4866c[i11] = a11;
                this.f4868e.put(a11.f4869a, a11);
            }
            m.g();
        }

        public int a(String str) {
            int b10 = b(str);
            GLES20.glEnableVertexAttribArray(b10);
            m.g();
            return b10;
        }

        public final int b(String str) {
            return m.k(this.f4864a, str);
        }

        public int c(String str) {
            return m.l(this.f4864a, str);
        }
    }

    public static final class d {
        public final String f4869a;
        public final int f4870b;
        public final int f4871c;
        public final float[] f4872d = new float[16];

        public d(String str, int i10, int i11) {
            this.f4869a = str;
            this.f4870b = i10;
            this.f4871c = i11;
        }

        public static d a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            byte[] bArr = new byte[iArr[0]];
            GLES20.glGetActiveUniform(i10, i11, iArr[0], new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, m.o(bArr));
            return new d(str, m.l(i10, str), iArr2[0]);
        }
    }

    public static void f(int i10, int i11, String str) {
        int glCreateShader = GLES20.glCreateShader(i11);
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
            p(sb2.toString());
        }
        GLES20.glAttachShader(i10, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        g();
    }

    public static void g() {
        int i10 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
            s.c("GlUtil", valueOf.length() != 0 ? "glError: ".concat(valueOf) : new String("glError: "));
            i10 = glGetError;
        }
        if (i10 != 0) {
            String valueOf2 = String.valueOf(GLU.gluErrorString(i10));
            p(valueOf2.length() != 0 ? "glError: ".concat(valueOf2) : new String("glError: "));
        }
    }

    public static FloatBuffer h(int i10) {
        return ByteBuffer.allocateDirect(i10 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static FloatBuffer i(float[] fArr) {
        return (FloatBuffer) h(fArr.length).put(fArr).flip();
    }

    public static int j() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        g();
        return iArr[0];
    }

    public static int k(int i10, String str) {
        return GLES20.glGetAttribLocation(i10, str);
    }

    public static int l(int i10, String str) {
        return GLES20.glGetUniformLocation(i10, str);
    }

    public static boolean m(Context context) {
        String eglQueryString;
        int i10 = l0.f4841a;
        if (i10 < 24) {
            return false;
        }
        if (i10 >= 26 || (!"samsung".equals(l0.f4843c) && !"XT1650".equals(l0.f4844d))) {
            return (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean n() {
        String eglQueryString;
        return l0.f4841a >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    public static int o(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] == 0) {
                return i10;
            }
        }
        return bArr.length;
    }

    public static void p(String str) {
        s.c("GlUtil", str);
        if (f4856a) {
            throw new b(str);
        }
    }
}
