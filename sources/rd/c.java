package rd;

import ae.j;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Message;
import ce.j0;
import gd.m;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import oc.v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.N;

public class c {
    public int A;
    public int B;
    public int C;
    public boolean C0;
    public int D;
    public boolean D0;
    public int E;
    public int E0;
    public int F;
    public int F0;
    public int G;
    public volatile int G0;
    public int H;
    public volatile int H0;
    public int I;
    public FloatBuffer I0;
    public int J;
    public FloatBuffer J0;
    public int K;
    public FloatBuffer K0;
    public int L;
    public boolean L0;
    public int M;
    public qd.a M0;
    public int N;
    public final m N0;
    public int O;
    public boolean O0;
    public int P;
    public boolean P0;
    public int Q;
    public boolean Q0;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public GL f21871a;
    public int f21872a0;
    public EGL10 f21873b;
    public int f21874b0;
    public EGLDisplay f21875c;
    public int f21876c0;
    public EGLConfig f21877d;
    public int f21878d0;
    public EGLContext f21879e;
    public int f21880e0;
    public EGLSurface f21881f;
    public int f21882f0;
    public long f21883g;
    public int f21884g0;
    public SurfaceTexture f21885h;
    public int f21886h0;
    public Bitmap f21887i;
    public int f21888i0;
    public int f21889j;
    public int f21890j0;
    public int f21891k;
    public int f21892k0;
    public int f21893l;
    public int f21894l0;
    public int f21895m;
    public int f21896m0;
    public int f21897n;
    public int f21898n0;
    public int f21899o;
    public int f21900o0;
    public int f21901p;
    public int f21902p0;
    public int f21903q;
    public int f21904q0;
    public int f21905r;
    public int f21906r0;
    public int f21907s;
    public int f21908s0;
    public int f21909t;
    public int f21910t0;
    public int f21911u;
    public int f21912u0;
    public int f21913v;
    public int f21914v0;
    public int f21915w;
    public int f21916w0;
    public int f21917x;
    public int f21918x0;
    public int f21919y;
    public int f21921z;
    public int[] f21920y0 = new int[2];
    public int[] f21922z0 = new int[3];
    public int[] A0 = new int[3];
    public int[] B0 = new int[1];

    public class a extends m {
        public a(String str) {
            super(str);
        }

        @Override
        public void f(Message message) {
            int i10 = message.what;
            boolean z10 = true;
            if (i10 == 0) {
                c.this.o();
                g(true);
            } else if (i10 == 1) {
                c cVar = c.this;
                cVar.L0 = cVar.I();
            } else if (i10 == 2) {
                c cVar2 = c.this;
                boolean z11 = message.arg1 == 1;
                if (message.arg2 != 1) {
                    z10 = false;
                }
                cVar2.R(z11, z10);
            } else if (i10 == 3) {
                Object[] objArr = (Object[]) message.obj;
                c.this.T((Bitmap) objArr[0], (qd.a) objArr[1]);
            } else if (i10 == 4) {
                c.this.N();
            } else if (i10 == 5) {
                c.this.q((rd.a) message.obj);
            }
        }
    }

    public c(SurfaceTexture surfaceTexture, Bitmap bitmap, qd.a aVar, int i10, int i11) {
        a aVar2 = new a("EGLEditorQueue");
        this.N0 = aVar2;
        this.f21887i = bitmap;
        this.f21885h = surfaceTexture;
        this.G0 = i10;
        this.H0 = i11;
        this.M0 = aVar;
        aVar2.h(Message.obtain(aVar2.d(), 1), 0L);
    }

    public final float A() {
        float v10 = v(4);
        if (v10 > 0.0f) {
            v10 *= 1.05f;
        }
        return v10 + 1.0f;
    }

    public final float B() {
        return ((F(10) * 0.55f) + 100.0f) / 100.0f;
    }

    public final float C() {
        return (v(8) * 0.6f) + 0.11f;
    }

    public final float D() {
        return this.M0.j(13) == 0 ? 0.0f : 0.5f;
    }

    public final float E() {
        return this.M0.j(11) == 0 ? 0.0f : 0.5f;
    }

    public final float F(int i10) {
        return this.M0.j(i10);
    }

    public final float G() {
        return v(6);
    }

    public final float H() {
        return v(3);
    }

    public final boolean I() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f21873b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f21875c = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            Log.e("eglGetDisplay failed: %s", v0.s0(this.f21873b.eglGetError()));
            o();
            return false;
        } else if (!this.f21873b.eglInitialize(eglGetDisplay, new int[2])) {
            Log.e("eglInitialize failed: %s", v0.s0(this.f21873b.eglGetError()));
            o();
            return false;
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f21873b.eglChooseConfig(this.f21875c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                Log.e("eglChooseConfig failed: %s", v0.s0(this.f21873b.eglGetError()));
                o();
                return false;
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f21877d = eGLConfig;
                EGLContext eglCreateContext = this.f21873b.eglCreateContext(this.f21875c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.f21879e = eglCreateContext;
                if (eglCreateContext == null) {
                    Log.e("eglCreateContext failed: %s", v0.s0(this.f21873b.eglGetError()));
                    o();
                    return false;
                }
                SurfaceTexture surfaceTexture = this.f21885h;
                if (surfaceTexture != null) {
                    EGLSurface eglCreateWindowSurface = this.f21873b.eglCreateWindowSurface(this.f21875c, this.f21877d, surfaceTexture, null);
                    this.f21881f = eglCreateWindowSurface;
                    if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                        Log.e("createWindowSurface failed: %s", v0.s0(this.f21873b.eglGetError()));
                        o();
                        return false;
                    } else if (!this.f21873b.eglMakeCurrent(this.f21875c, eglCreateWindowSurface, eglCreateWindowSurface, this.f21879e)) {
                        Log.e("eglMakeCurrent failed: %s", v0.s0(this.f21873b.eglGetError()));
                        o();
                        return false;
                    } else {
                        this.f21871a = this.f21879e.getGL();
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
                        allocateDirect.order(ByteOrder.nativeOrder());
                        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
                        this.I0 = asFloatBuffer;
                        asFloatBuffer.put(new float[]{-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f});
                        this.I0.position(0);
                        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
                        allocateDirect2.order(ByteOrder.nativeOrder());
                        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
                        this.K0 = asFloatBuffer2;
                        asFloatBuffer2.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
                        this.K0.position(0);
                        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
                        allocateDirect3.order(ByteOrder.nativeOrder());
                        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
                        this.J0 = asFloatBuffer3;
                        asFloatBuffer3.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
                        this.J0.position(0);
                        GLES20.glGenTextures(1, this.B0, 0);
                        GLES20.glGenTextures(2, this.f21920y0, 0);
                        int K = K(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
                        int K2 = K(35632, "varying highp vec2 texCoord;uniform sampler2D sourceImage;uniform highp float width;uniform highp float height;uniform sampler2D curvesImage;uniform lowp float skipTone;uniform lowp float shadows;const mediump vec3 hsLuminanceWeighting = vec3(0.3, 0.3, 0.3);uniform lowp float highlights;uniform lowp float contrast;uniform lowp float fadeAmount;const mediump vec3 satLuminanceWeighting = vec3(0.2126, 0.7152, 0.0722);uniform lowp float saturation;uniform lowp float shadowsTintIntensity;uniform lowp float highlightsTintIntensity;uniform lowp vec3 shadowsTintColor;uniform lowp vec3 highlightsTintColor;uniform lowp float exposure;uniform lowp float warmth;uniform lowp float grain;const lowp float permTexUnit = 1.0 / 256.0;const lowp float permTexUnitHalf = 0.5 / 256.0;const lowp float grainsize = 2.3;uniform lowp float vignette;highp float getLuma(highp vec3 rgbP) {return (0.299 * rgbP.r) + (0.587 * rgbP.g) + (0.114 * rgbP.b);}lowp vec3 rgbToHsv(lowp vec3 c) {highp vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);highp vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);highp vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);highp float d = q.x - min(q.w, q.y);highp float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}lowp vec3 hsvToRgb(lowp vec3 c) {highp vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);highp vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);}highp vec3 rgbToHsl(highp vec3 color) {highp vec3 hsl;highp float fmin = min(min(color.r, color.g), color.b);highp float fmax = max(max(color.r, color.g), color.b);highp float delta = fmax - fmin;hsl.z = (fmax + fmin) / 2.0;if (delta == 0.0) {hsl.x = 0.0;hsl.y = 0.0;} else {if (hsl.z < 0.5) {hsl.y = delta / (fmax + fmin);} else {hsl.y = delta / (2.0 - fmax - fmin);}highp float deltaR = (((fmax - color.r) / 6.0) + (delta / 2.0)) / delta;highp float deltaG = (((fmax - color.g) / 6.0) + (delta / 2.0)) / delta;highp float deltaB = (((fmax - color.b) / 6.0) + (delta / 2.0)) / delta;if (color.r == fmax) {hsl.x = deltaB - deltaG;} else if (color.g == fmax) {hsl.x = (1.0 / 3.0) + deltaR - deltaB;} else if (color.b == fmax) {hsl.x = (2.0 / 3.0) + deltaG - deltaR;}if (hsl.x < 0.0) {hsl.x += 1.0;} else if (hsl.x > 1.0) {hsl.x -= 1.0;}}return hsl;}highp float hueToRgb(highp float f1, highp float f2, highp float hue) {if (hue < 0.0) {hue += 1.0;} else if (hue > 1.0) {hue -= 1.0;}highp float res;if ((6.0 * hue) < 1.0) {res = f1 + (f2 - f1) * 6.0 * hue;} else if ((2.0 * hue) < 1.0) {res = f2;} else if ((3.0 * hue) < 2.0) {res = f1 + (f2 - f1) * ((2.0 / 3.0) - hue) * 6.0;} else {res = f1;} return res;}highp vec3 hslToRgb(highp vec3 hsl) {if (hsl.y == 0.0) {return vec3(hsl.z);} else {highp float f2;if (hsl.z < 0.5) {f2 = hsl.z * (1.0 + hsl.y);} else {f2 = (hsl.z + hsl.y) - (hsl.y * hsl.z);}highp float f1 = 2.0 * hsl.z - f2;return vec3(hueToRgb(f1, f2, hsl.x + (1.0/3.0)), hueToRgb(f1, f2, hsl.x), hueToRgb(f1, f2, hsl.x - (1.0/3.0)));}}highp vec3 rgbToYuv(highp vec3 inP) {highp float luma = getLuma(inP);return vec3(luma, (1.0 / 1.772) * (inP.b - luma), (1.0 / 1.402) * (inP.r - luma));}lowp vec3 yuvToRgb(highp vec3 inP) {return vec3(1.402 * inP.b + inP.r, (inP.r - (0.299 * 1.402 / 0.587) * inP.b - (0.114 * 1.772 / 0.587) * inP.g), 1.772 * inP.g + inP.r);}lowp float easeInOutSigmoid(lowp float value, lowp float strength) {if (value > 0.5) {return 1.0 - pow(2.0 - 2.0 * value, 1.0 / (1.0 - strength)) * 0.5;} else {return pow(2.0 * value, 1.0 / (1.0 - strength)) * 0.5;}}lowp vec3 applyLuminanceCurve(lowp vec3 pixel) {highp float index = floor(clamp(pixel.z / (1.0 / 200.0), 0.0, 199.0));pixel.y = mix(0.0, pixel.y, smoothstep(0.0, 0.1, pixel.z) * (1.0 - smoothstep(0.8, 1.0, pixel.z)));pixel.z = texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).a;return pixel;}lowp vec3 applyRGBCurve(lowp vec3 pixel) {highp float index = floor(clamp(pixel.r / (1.0 / 200.0), 0.0, 199.0));pixel.r = texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).r;index = floor(clamp(pixel.g / (1.0 / 200.0), 0.0, 199.0));pixel.g = clamp(texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).g, 0.0, 1.0);index = floor(clamp(pixel.b / (1.0 / 200.0), 0.0, 199.0));pixel.b = clamp(texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).b, 0.0, 1.0);return pixel;}highp vec3 fadeAdjust(highp vec3 color, highp float fadeVal) {return (color * (1.0 - fadeVal)) + ((color + (vec3(-0.9772) * pow(vec3(color), vec3(3.0)) + vec3(1.708) * pow(vec3(color), vec3(2.0)) + vec3(-0.1603) * vec3(color) + vec3(0.2878) - color * vec3(0.9))) * fadeVal);}lowp vec3 tintRaiseShadowsCurve(lowp vec3 color) {return vec3(-0.003671) * pow(color, vec3(3.0)) + vec3(0.3842) * pow(color, vec3(2.0)) + vec3(0.3764) * color + vec3(0.2515);}lowp vec3 tintShadows(lowp vec3 texel, lowp vec3 tintColor, lowp float tintAmount) {return clamp(mix(texel, mix(texel, tintRaiseShadowsCurve(texel), tintColor), tintAmount), 0.0, 1.0);} lowp vec3 tintHighlights(lowp vec3 texel, lowp vec3 tintColor, lowp float tintAmount) {return clamp(mix(texel, mix(texel, vec3(1.0) - tintRaiseShadowsCurve(vec3(1.0) - texel), (vec3(1.0) - tintColor)), tintAmount), 0.0, 1.0);}highp vec4 rnm(in highp vec2 tc) {highp float noise = sin(dot(tc, vec2(12.9898, 78.233))) * 43758.5453;return vec4(fract(noise), fract(noise * 1.2154), fract(noise * 1.3453), fract(noise * 1.3647)) * 2.0 - 1.0;}highp float fade(in highp float t) {return t * t * t * (t * (t * 6.0 - 15.0) + 10.0);}highp float pnoise3D(in highp vec3 p) {highp vec3 pi = permTexUnit * floor(p) + permTexUnitHalf;highp vec3 pf = fract(p);highp float perm = rnm(pi.xy).a;highp float n000 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf);highp float n001 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(0.0, 0.0, 1.0));perm = rnm(pi.xy + vec2(0.0, permTexUnit)).a;highp float n010 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(0.0, 1.0, 0.0));highp float n011 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(0.0, 1.0, 1.0));perm = rnm(pi.xy + vec2(permTexUnit, 0.0)).a;highp float n100 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(1.0, 0.0, 0.0));highp float n101 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(1.0, 0.0, 1.0));perm = rnm(pi.xy + vec2(permTexUnit, permTexUnit)).a;highp float n110 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(1.0, 1.0, 0.0));highp float n111 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(1.0, 1.0, 1.0));highp vec4 n_x = mix(vec4(n000, n001, n010, n011), vec4(n100, n101, n110, n111), fade(pf.x));highp vec2 n_xy = mix(n_x.xy, n_x.zw, fade(pf.y));return mix(n_xy.x, n_xy.y, fade(pf.z));}lowp vec2 coordRot(in lowp vec2 tc, in lowp float angle) {return vec2(((tc.x * 2.0 - 1.0) * cos(angle) - (tc.y * 2.0 - 1.0) * sin(angle)) * 0.5 + 0.5, ((tc.y * 2.0 - 1.0) * cos(angle) + (tc.x * 2.0 - 1.0) * sin(angle)) * 0.5 + 0.5);}void main() {lowp vec4 source = texture2D(sourceImage, texCoord);lowp vec4 result = source;const lowp float toolEpsilon = 0.005;if (skipTone < toolEpsilon) {result = vec4(applyRGBCurve(hslToRgb(applyLuminanceCurve(rgbToHsl(result.rgb)))), result.a);}mediump float hsLuminance = dot(result.rgb, hsLuminanceWeighting);mediump float shadow = clamp((pow(hsLuminance, 1.0 / shadows) + (-0.76) * pow(hsLuminance, 2.0 / shadows)) - hsLuminance, 0.0, 1.0);mediump float highlight = clamp((1.0 - (pow(1.0 - hsLuminance, 1.0 / (2.0 - highlights)) + (-0.8) * pow(1.0 - hsLuminance, 2.0 / (2.0 - highlights)))) - hsLuminance, -1.0, 0.0);lowp vec3 hsresult = vec3(0.0, 0.0, 0.0) + ((hsLuminance + shadow + highlight) - 0.0) * ((result.rgb - vec3(0.0, 0.0, 0.0)) / (hsLuminance - 0.0));mediump float contrastedLuminance = ((hsLuminance - 0.5) * 1.5) + 0.5;mediump float whiteInterp = contrastedLuminance * contrastedLuminance * contrastedLuminance;mediump float whiteTarget = clamp(highlights, 1.0, 2.0) - 1.0;hsresult = mix(hsresult, vec3(1.0), whiteInterp * whiteTarget);mediump float invContrastedLuminance = 1.0 - contrastedLuminance;mediump float blackInterp = invContrastedLuminance * invContrastedLuminance * invContrastedLuminance;mediump float blackTarget = 1.0 - clamp(shadows, 0.0, 1.0);hsresult = mix(hsresult, vec3(0.0), blackInterp * blackTarget);result = vec4(hsresult.rgb, result.a);result = vec4(clamp(((result.rgb - vec3(0.5)) * contrast + vec3(0.5)), 0.0, 1.0), result.a);if (abs(fadeAmount) > toolEpsilon) {result.rgb = fadeAdjust(result.rgb, fadeAmount);}lowp float satLuminance = dot(result.rgb, satLuminanceWeighting);lowp vec3 greyScaleColor = vec3(satLuminance);result = vec4(clamp(mix(greyScaleColor, result.rgb, saturation), 0.0, 1.0), result.a);if (abs(shadowsTintIntensity) > toolEpsilon) {result.rgb = tintShadows(result.rgb, shadowsTintColor, shadowsTintIntensity * 2.0);}if (abs(highlightsTintIntensity) > toolEpsilon) {result.rgb = tintHighlights(result.rgb, highlightsTintColor, highlightsTintIntensity * 2.0);}if (abs(exposure) > toolEpsilon) {mediump float mag = exposure * 1.045;mediump float exppower = 1.0 + abs(mag);if (mag < 0.0) {exppower = 1.0 / exppower;}result.r = 1.0 - pow((1.0 - result.r), exppower);result.g = 1.0 - pow((1.0 - result.g), exppower);result.b = 1.0 - pow((1.0 - result.b), exppower);}if (abs(warmth) > toolEpsilon) {highp vec3 yuvVec;if (warmth > 0.0 ) {yuvVec = vec3(0.1765, -0.1255, 0.0902);} else {yuvVec = -vec3(0.0588, 0.1569, -0.1255);}highp vec3 yuvColor = rgbToYuv(result.rgb);highp float luma = yuvColor.r;highp float curveScale = sin(luma * 3.14159);yuvColor += 0.375 * warmth * curveScale * yuvVec;result.rgb = yuvToRgb(yuvColor);}if (abs(grain) > toolEpsilon) {highp vec3 rotOffset = vec3(1.425, 3.892, 5.835);highp vec2 rotCoordsR = coordRot(texCoord, rotOffset.x);highp vec3 noise = vec3(pnoise3D(vec3(rotCoordsR * vec2(width / grainsize, height / grainsize),0.0)));lowp vec3 lumcoeff = vec3(0.299,0.587,0.114);lowp float luminance = dot(result.rgb, lumcoeff);lowp float lum = smoothstep(0.2, 0.0, luminance);lum += luminance;noise = mix(noise,vec3(0.0),pow(lum,4.0));result.rgb = result.rgb + noise * grain;}if (abs(vignette) > toolEpsilon) {const lowp float midpoint = 0.7;const lowp float fuzziness = 0.62;lowp float radDist = length(texCoord - 0.5) / sqrt(0.5);lowp float mag = easeInOutSigmoid(radDist * midpoint, fuzziness) * vignette * 0.645;result.rgb = mix(pow(result.rgb, vec3(1.0 / (1.0 - mag))), vec3(0.0), mag * mag);}gl_FragColor = result;}");
                        if (K == 0 || K2 == 0) {
                            o();
                            return false;
                        }
                        int glCreateProgram = GLES20.glCreateProgram();
                        this.f21909t = glCreateProgram;
                        GLES20.glAttachShader(glCreateProgram, K);
                        GLES20.glAttachShader(this.f21909t, K2);
                        GLES20.glBindAttribLocation(this.f21909t, 0, "position");
                        GLES20.glBindAttribLocation(this.f21909t, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f21909t);
                        int[] iArr2 = new int[1];
                        GLES20.glGetProgramiv(this.f21909t, 35714, iArr2, 0);
                        if (iArr2[0] == 0) {
                            GLES20.glDeleteProgram(this.f21909t);
                            this.f21909t = 0;
                        } else {
                            this.f21911u = GLES20.glGetAttribLocation(this.f21909t, "position");
                            this.f21913v = GLES20.glGetAttribLocation(this.f21909t, "inputTexCoord");
                            this.f21915w = GLES20.glGetUniformLocation(this.f21909t, "sourceImage");
                            this.f21917x = GLES20.glGetUniformLocation(this.f21909t, "shadows");
                            this.f21919y = GLES20.glGetUniformLocation(this.f21909t, "highlights");
                            this.f21921z = GLES20.glGetUniformLocation(this.f21909t, "exposure");
                            this.A = GLES20.glGetUniformLocation(this.f21909t, "contrast");
                            this.B = GLES20.glGetUniformLocation(this.f21909t, "saturation");
                            this.C = GLES20.glGetUniformLocation(this.f21909t, "warmth");
                            this.D = GLES20.glGetUniformLocation(this.f21909t, "vignette");
                            this.E = GLES20.glGetUniformLocation(this.f21909t, "grain");
                            this.F = GLES20.glGetUniformLocation(this.f21909t, "width");
                            this.G = GLES20.glGetUniformLocation(this.f21909t, "height");
                            this.H = GLES20.glGetUniformLocation(this.f21909t, "curvesImage");
                            this.I = GLES20.glGetUniformLocation(this.f21909t, "skipTone");
                            this.J = GLES20.glGetUniformLocation(this.f21909t, "fadeAmount");
                            this.K = GLES20.glGetUniformLocation(this.f21909t, "shadowsTintIntensity");
                            this.L = GLES20.glGetUniformLocation(this.f21909t, "highlightsTintIntensity");
                            this.M = GLES20.glGetUniformLocation(this.f21909t, "shadowsTintColor");
                            this.N = GLES20.glGetUniformLocation(this.f21909t, "highlightsTintColor");
                        }
                        int K3 = K(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;uniform highp float inputWidth;uniform highp float inputHeight;varying vec2 leftTexCoord;varying vec2 rightTexCoord;varying vec2 topTexCoord;varying vec2 bottomTexCoord;void main() {gl_Position = position;texCoord = inputTexCoord;highp vec2 widthStep = vec2(1.0 / inputWidth, 0.0);highp vec2 heightStep = vec2(0.0, 1.0 / inputHeight);leftTexCoord = inputTexCoord - widthStep;rightTexCoord = inputTexCoord + widthStep;topTexCoord = inputTexCoord + heightStep;bottomTexCoord = inputTexCoord - heightStep;}");
                        int K4 = K(35632, "precision highp float;varying vec2 texCoord;varying vec2 leftTexCoord;varying vec2 rightTexCoord;varying vec2 topTexCoord;varying vec2 bottomTexCoord;uniform sampler2D sourceImage;uniform float sharpen;void main() {vec4 result = texture2D(sourceImage, texCoord);vec3 leftTextureColor = texture2D(sourceImage, leftTexCoord).rgb;vec3 rightTextureColor = texture2D(sourceImage, rightTexCoord).rgb;vec3 topTextureColor = texture2D(sourceImage, topTexCoord).rgb;vec3 bottomTextureColor = texture2D(sourceImage, bottomTexCoord).rgb;result.rgb = result.rgb * (1.0 + 4.0 * sharpen) - (leftTextureColor + rightTextureColor + topTextureColor + bottomTextureColor) * sharpen;gl_FragColor = result;}");
                        if (K3 == 0 || K4 == 0) {
                            o();
                            return false;
                        }
                        int glCreateProgram2 = GLES20.glCreateProgram();
                        this.f21898n0 = glCreateProgram2;
                        GLES20.glAttachShader(glCreateProgram2, K3);
                        GLES20.glAttachShader(this.f21898n0, K4);
                        GLES20.glBindAttribLocation(this.f21898n0, 0, "position");
                        GLES20.glBindAttribLocation(this.f21898n0, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f21898n0);
                        int[] iArr3 = new int[1];
                        GLES20.glGetProgramiv(this.f21898n0, 35714, iArr3, 0);
                        if (iArr3[0] == 0) {
                            GLES20.glDeleteProgram(this.f21898n0);
                            this.f21898n0 = 0;
                        } else {
                            this.f21906r0 = GLES20.glGetAttribLocation(this.f21898n0, "position");
                            this.f21908s0 = GLES20.glGetAttribLocation(this.f21898n0, "inputTexCoord");
                            this.f21910t0 = GLES20.glGetUniformLocation(this.f21898n0, "sourceImage");
                            this.f21902p0 = GLES20.glGetUniformLocation(this.f21898n0, "inputWidth");
                            this.f21904q0 = GLES20.glGetUniformLocation(this.f21898n0, "inputHeight");
                            this.f21900o0 = GLES20.glGetUniformLocation(this.f21898n0, "sharpen");
                        }
                        int K5 = K(35633, "attribute vec4 position;attribute vec4 inputTexCoord;uniform highp float texelWidthOffset;uniform highp float texelHeightOffset;varying vec2 blurCoordinates[9];void main() {gl_Position = position;vec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);blurCoordinates[0] = inputTexCoord.xy;blurCoordinates[1] = inputTexCoord.xy + singleStepOffset * 1.458430;blurCoordinates[2] = inputTexCoord.xy - singleStepOffset * 1.458430;blurCoordinates[3] = inputTexCoord.xy + singleStepOffset * 3.403985;blurCoordinates[4] = inputTexCoord.xy - singleStepOffset * 3.403985;blurCoordinates[5] = inputTexCoord.xy + singleStepOffset * 5.351806;blurCoordinates[6] = inputTexCoord.xy - singleStepOffset * 5.351806;blurCoordinates[7] = inputTexCoord.xy + singleStepOffset * 7.302940;blurCoordinates[8] = inputTexCoord.xy - singleStepOffset * 7.302940;}");
                        int K6 = K(35632, "uniform sampler2D sourceImage;varying highp vec2 blurCoordinates[9];void main() {lowp vec4 sum = vec4(0.0);sum += texture2D(sourceImage, blurCoordinates[0]) * 0.133571;sum += texture2D(sourceImage, blurCoordinates[1]) * 0.233308;sum += texture2D(sourceImage, blurCoordinates[2]) * 0.233308;sum += texture2D(sourceImage, blurCoordinates[3]) * 0.135928;sum += texture2D(sourceImage, blurCoordinates[4]) * 0.135928;sum += texture2D(sourceImage, blurCoordinates[5]) * 0.051383;sum += texture2D(sourceImage, blurCoordinates[6]) * 0.051383;sum += texture2D(sourceImage, blurCoordinates[7]) * 0.012595;sum += texture2D(sourceImage, blurCoordinates[8]) * 0.012595;gl_FragColor = sum;}");
                        if (K5 == 0 || K6 == 0) {
                            o();
                            return false;
                        }
                        int glCreateProgram3 = GLES20.glCreateProgram();
                        this.O = glCreateProgram3;
                        GLES20.glAttachShader(glCreateProgram3, K5);
                        GLES20.glAttachShader(this.O, K6);
                        GLES20.glBindAttribLocation(this.O, 0, "position");
                        GLES20.glBindAttribLocation(this.O, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.O);
                        int[] iArr4 = new int[1];
                        GLES20.glGetProgramiv(this.O, 35714, iArr4, 0);
                        if (iArr4[0] == 0) {
                            GLES20.glDeleteProgram(this.O);
                            this.O = 0;
                        } else {
                            this.P = GLES20.glGetAttribLocation(this.O, "position");
                            this.Q = GLES20.glGetAttribLocation(this.O, "inputTexCoord");
                            this.R = GLES20.glGetUniformLocation(this.O, "sourceImage");
                            this.S = GLES20.glGetUniformLocation(this.O, "texelWidthOffset");
                            this.T = GLES20.glGetUniformLocation(this.O, "texelHeightOffset");
                        }
                        int K7 = K(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
                        int K8 = K(35632, "varying highp vec2 texCoord;uniform sampler2D sourceImage;uniform sampler2D inputImageTexture2;uniform lowp float excludeSize;uniform lowp vec2 excludePoint;uniform lowp float excludeBlurSize;uniform highp float angle;uniform highp float aspectRatio;void main() {lowp vec4 sharpImageColor = texture2D(sourceImage, texCoord);lowp vec4 blurredImageColor = texture2D(inputImageTexture2, texCoord);highp vec2 texCoordToUse = vec2(texCoord.x, (texCoord.y * aspectRatio + 0.5 - 0.5 * aspectRatio));highp float distanceFromCenter = abs((texCoordToUse.x - excludePoint.x) * aspectRatio * cos(angle) + (texCoordToUse.y - excludePoint.y) * sin(angle));gl_FragColor = mix(sharpImageColor, blurredImageColor, smoothstep(excludeSize - excludeBlurSize, excludeSize, distanceFromCenter));}");
                        if (K7 == 0 || K8 == 0) {
                            o();
                            return false;
                        }
                        int glCreateProgram4 = GLES20.glCreateProgram();
                        this.U = glCreateProgram4;
                        GLES20.glAttachShader(glCreateProgram4, K7);
                        GLES20.glAttachShader(this.U, K8);
                        GLES20.glBindAttribLocation(this.U, 0, "position");
                        GLES20.glBindAttribLocation(this.U, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.U);
                        int[] iArr5 = new int[1];
                        GLES20.glGetProgramiv(this.U, 35714, iArr5, 0);
                        if (iArr5[0] == 0) {
                            GLES20.glDeleteProgram(this.U);
                            this.U = 0;
                        } else {
                            this.V = GLES20.glGetAttribLocation(this.U, "position");
                            this.W = GLES20.glGetAttribLocation(this.U, "inputTexCoord");
                            this.X = GLES20.glGetUniformLocation(this.U, "sourceImage");
                            this.Y = GLES20.glGetUniformLocation(this.U, "inputImageTexture2");
                            this.Z = GLES20.glGetUniformLocation(this.U, "excludeSize");
                            this.f21872a0 = GLES20.glGetUniformLocation(this.U, "excludePoint");
                            this.f21874b0 = GLES20.glGetUniformLocation(this.U, "excludeBlurSize");
                            this.f21876c0 = GLES20.glGetUniformLocation(this.U, "angle");
                            this.f21878d0 = GLES20.glGetUniformLocation(this.U, "aspectRatio");
                        }
                        int K9 = K(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
                        int K10 = K(35632, "varying highp vec2 texCoord;uniform sampler2D sourceImage;uniform sampler2D inputImageTexture2;uniform lowp float excludeSize;uniform lowp vec2 excludePoint;uniform lowp float excludeBlurSize;uniform highp float aspectRatio;void main() {lowp vec4 sharpImageColor = texture2D(sourceImage, texCoord);lowp vec4 blurredImageColor = texture2D(inputImageTexture2, texCoord);highp vec2 texCoordToUse = vec2(texCoord.x, (texCoord.y * aspectRatio + 0.5 - 0.5 * aspectRatio));highp float distanceFromCenter = distance(excludePoint, texCoordToUse);gl_FragColor = mix(sharpImageColor, blurredImageColor, smoothstep(excludeSize - excludeBlurSize, excludeSize, distanceFromCenter));}");
                        if (K9 == 0 || K10 == 0) {
                            o();
                            return false;
                        }
                        int glCreateProgram5 = GLES20.glCreateProgram();
                        this.f21880e0 = glCreateProgram5;
                        GLES20.glAttachShader(glCreateProgram5, K9);
                        GLES20.glAttachShader(this.f21880e0, K10);
                        GLES20.glBindAttribLocation(this.f21880e0, 0, "position");
                        GLES20.glBindAttribLocation(this.f21880e0, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f21880e0);
                        int[] iArr6 = new int[1];
                        GLES20.glGetProgramiv(this.f21880e0, 35714, iArr6, 0);
                        if (iArr6[0] == 0) {
                            GLES20.glDeleteProgram(this.f21880e0);
                            this.f21880e0 = 0;
                        } else {
                            this.f21882f0 = GLES20.glGetAttribLocation(this.f21880e0, "position");
                            this.f21884g0 = GLES20.glGetAttribLocation(this.f21880e0, "inputTexCoord");
                            this.f21886h0 = GLES20.glGetUniformLocation(this.f21880e0, "sourceImage");
                            this.f21888i0 = GLES20.glGetUniformLocation(this.f21880e0, "inputImageTexture2");
                            this.f21890j0 = GLES20.glGetUniformLocation(this.f21880e0, "excludeSize");
                            this.f21892k0 = GLES20.glGetUniformLocation(this.f21880e0, "excludePoint");
                            this.f21894l0 = GLES20.glGetUniformLocation(this.f21880e0, "excludeBlurSize");
                            this.f21896m0 = GLES20.glGetUniformLocation(this.f21880e0, "aspectRatio");
                        }
                        int K11 = K(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
                        int K12 = K(35632, "precision highp float;varying vec2 texCoord;uniform sampler2D sourceImage;vec3 rgb_to_hsv(vec3 c) {vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);float d = q.x - min(q.w, q.y);float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}void main() {vec4 texel = texture2D(sourceImage, texCoord);gl_FragColor = vec4(rgb_to_hsv(texel.rgb), texel.a);}");
                        if (K11 == 0 || K12 == 0) {
                            o();
                            return false;
                        }
                        int glCreateProgram6 = GLES20.glCreateProgram();
                        this.f21889j = glCreateProgram6;
                        GLES20.glAttachShader(glCreateProgram6, K11);
                        GLES20.glAttachShader(this.f21889j, K12);
                        GLES20.glBindAttribLocation(this.f21889j, 0, "position");
                        GLES20.glBindAttribLocation(this.f21889j, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f21889j);
                        int[] iArr7 = new int[1];
                        GLES20.glGetProgramiv(this.f21889j, 35714, iArr7, 0);
                        if (iArr7[0] == 0) {
                            GLES20.glDeleteProgram(this.f21889j);
                            this.f21889j = 0;
                        } else {
                            this.f21891k = GLES20.glGetAttribLocation(this.f21889j, "position");
                            this.f21893l = GLES20.glGetAttribLocation(this.f21889j, "inputTexCoord");
                            this.f21895m = GLES20.glGetUniformLocation(this.f21889j, "sourceImage");
                        }
                        int K13 = K(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
                        int K14 = K(35632, "precision highp float;varying vec2 texCoord;uniform sampler2D sourceImage;uniform sampler2D inputImageTexture2;uniform float intensity;float enhance(float value) {const vec2 offset = vec2(0.001953125, 0.03125);value = value + offset.x;vec2 coord = (clamp(texCoord, 0.125, 1.0 - 0.125001) - 0.125) * 4.0;vec2 frac = fract(coord);coord = floor(coord);float p00 = float(coord.y * 4.0 + coord.x) * 0.0625 + offset.y;float p01 = float(coord.y * 4.0 + coord.x + 1.0) * 0.0625 + offset.y;float p10 = float((coord.y + 1.0) * 4.0 + coord.x) * 0.0625 + offset.y;float p11 = float((coord.y + 1.0) * 4.0 + coord.x + 1.0) * 0.0625 + offset.y;vec3 c00 = texture2D(inputImageTexture2, vec2(value, p00)).rgb;vec3 c01 = texture2D(inputImageTexture2, vec2(value, p01)).rgb;vec3 c10 = texture2D(inputImageTexture2, vec2(value, p10)).rgb;vec3 c11 = texture2D(inputImageTexture2, vec2(value, p11)).rgb;float c1 = ((c00.r - c00.g) / (c00.b - c00.g));float c2 = ((c01.r - c01.g) / (c01.b - c01.g));float c3 = ((c10.r - c10.g) / (c10.b - c10.g));float c4 = ((c11.r - c11.g) / (c11.b - c11.g));float c1_2 = mix(c1, c2, frac.x);float c3_4 = mix(c3, c4, frac.x);return mix(c1_2, c3_4, frac.y);}vec3 hsv_to_rgb(vec3 c) {vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);}void main() {vec4 texel = texture2D(sourceImage, texCoord);vec4 hsv = texel;hsv.y = min(1.0, hsv.y * 1.2);hsv.z = min(1.0, enhance(hsv.z) * 1.1);gl_FragColor = vec4(hsv_to_rgb(mix(texel.xyz, hsv.xyz, intensity)), texel.w);}");
                        if (K13 == 0 || K14 == 0) {
                            o();
                            return false;
                        }
                        int glCreateProgram7 = GLES20.glCreateProgram();
                        this.f21897n = glCreateProgram7;
                        GLES20.glAttachShader(glCreateProgram7, K13);
                        GLES20.glAttachShader(this.f21897n, K14);
                        GLES20.glBindAttribLocation(this.f21897n, 0, "position");
                        GLES20.glBindAttribLocation(this.f21897n, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f21897n);
                        int[] iArr8 = new int[1];
                        GLES20.glGetProgramiv(this.f21897n, 35714, iArr8, 0);
                        if (iArr8[0] == 0) {
                            GLES20.glDeleteProgram(this.f21897n);
                            this.f21897n = 0;
                        } else {
                            this.f21899o = GLES20.glGetAttribLocation(this.f21897n, "position");
                            this.f21901p = GLES20.glGetAttribLocation(this.f21897n, "inputTexCoord");
                            this.f21903q = GLES20.glGetUniformLocation(this.f21897n, "sourceImage");
                            this.f21905r = GLES20.glGetUniformLocation(this.f21897n, "intensity");
                            this.f21907s = GLES20.glGetUniformLocation(this.f21897n, "inputImageTexture2");
                        }
                        int K15 = K(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
                        int K16 = K(35632, "varying highp vec2 texCoord;uniform sampler2D sourceImage;void main() {gl_FragColor = texture2D(sourceImage, texCoord);}");
                        if (K15 == 0 || K16 == 0) {
                            o();
                            return false;
                        }
                        int glCreateProgram8 = GLES20.glCreateProgram();
                        this.f21912u0 = glCreateProgram8;
                        GLES20.glAttachShader(glCreateProgram8, K15);
                        GLES20.glAttachShader(this.f21912u0, K16);
                        GLES20.glBindAttribLocation(this.f21912u0, 0, "position");
                        GLES20.glBindAttribLocation(this.f21912u0, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f21912u0);
                        int[] iArr9 = new int[1];
                        GLES20.glGetProgramiv(this.f21912u0, 35714, iArr9, 0);
                        if (iArr9[0] == 0) {
                            GLES20.glDeleteProgram(this.f21912u0);
                            this.f21912u0 = 0;
                        } else {
                            this.f21914v0 = GLES20.glGetAttribLocation(this.f21912u0, "position");
                            this.f21916w0 = GLES20.glGetAttribLocation(this.f21912u0, "inputTexCoord");
                            this.f21918x0 = GLES20.glGetUniformLocation(this.f21912u0, "sourceImage");
                        }
                        Bitmap bitmap = this.f21887i;
                        if (bitmap != null) {
                            L(bitmap);
                        }
                        return true;
                    }
                } else {
                    o();
                    return false;
                }
            } else {
                Log.e("eglConfig not initialized", new Object[0]);
                o();
                return false;
            }
        }
    }

    public final int K(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Log.e(GLES20.glGetShaderInfoLog(glCreateShader), new Object[0]);
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public final void L(Bitmap bitmap) {
        this.E0 = bitmap.getWidth();
        this.F0 = bitmap.getHeight();
        GLES20.glGenFramebuffers(3, this.A0, 0);
        GLES20.glGenTextures(3, this.f21922z0, 0);
        GLES20.glBindTexture(3553, this.f21922z0[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, this.E0, this.F0, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, this.f21922z0[1]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, this.f21887i, 0);
        GLES20.glBindTexture(3553, this.f21922z0[2]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, this.E0, this.F0, 0, 6408, 5121, null);
    }

    public void M() {
        m mVar = this.N0;
        mVar.h(Message.obtain(mVar.d(), 4), 0L);
    }

    public final void N() {
        if (!this.O0) {
            this.O0 = true;
        }
    }

    public final void O() {
        if (this.L0 && !this.O0) {
            if (!this.f21879e.equals(this.f21873b.eglGetCurrentContext()) || !this.f21881f.equals(this.f21873b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.f21873b;
                EGLDisplay eGLDisplay = this.f21875c;
                EGLSurface eGLSurface = this.f21881f;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f21879e)) {
                    Log.e("eglMakeCurrent failed %s", v0.s0(this.f21873b.eglGetError()));
                    return;
                }
            }
            GLES20.glViewport(0, 0, this.E0, this.F0);
            l();
            m();
            k();
            this.Q0 = j();
            GLES20.glViewport(0, 0, this.G0, this.H0);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClear(0);
            GLES20.glUseProgram(this.f21912u0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f21922z0[1 ^ (this.Q0 ? 1 : 0)]);
            GLES20.glUniform1i(this.f21918x0, 0);
            GLES20.glEnableVertexAttribArray(this.f21916w0);
            GLES20.glVertexAttribPointer(this.f21916w0, 2, 5126, false, 8, (Buffer) this.J0);
            GLES20.glEnableVertexAttribArray(this.f21914v0);
            GLES20.glVertexAttribPointer(this.f21914v0, 2, 5126, false, 8, (Buffer) this.I0);
            GLES20.glDrawArrays(5, 0, 4);
            this.f21873b.eglSwapBuffers(this.f21875c, this.f21881f);
        }
    }

    public void P(boolean z10) {
        Q(z10, false);
    }

    public void Q(boolean z10, boolean z11) {
        m mVar = this.N0;
        mVar.h(Message.obtain(mVar.d(), 2, z10 ? 1 : 0, z11 ? 1 : 0), 0L);
    }

    public final void R(boolean z10, boolean z11) {
        if (!this.P0) {
            this.P0 = z10;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (z11 || currentTimeMillis - this.f21883g > 30) {
            this.f21883g = currentTimeMillis;
            O();
        }
    }

    public void S(Bitmap bitmap, qd.a aVar) {
        m mVar = this.N0;
        mVar.h(Message.obtain(mVar.d(), 3, new Object[]{bitmap, aVar}), 0L);
    }

    public final void T(Bitmap bitmap, qd.a aVar) {
        this.f21887i = bitmap;
        this.M0 = aVar;
        L(bitmap);
        this.O0 = false;
        R(true, true);
    }

    public void U(int i10, int i11) {
        this.G0 = i10;
        this.H0 = i11;
    }

    public final boolean V() {
        return true;
    }

    public void i() {
        m mVar = this.N0;
        mVar.h(Message.obtain(mVar.d(), 0), 0L);
    }

    public final boolean j() {
        int j10 = this.M0.j(14);
        if (this.D0 || j10 == 0) {
            return false;
        }
        if (this.P0) {
            GLES20.glUseProgram(this.O);
            GLES20.glUniform1i(this.R, 0);
            GLES20.glEnableVertexAttribArray(this.Q);
            GLES20.glVertexAttribPointer(this.Q, 2, 5126, false, 8, (Buffer) this.J0);
            GLES20.glEnableVertexAttribArray(this.P);
            GLES20.glVertexAttribPointer(this.P, 2, 5126, false, 8, (Buffer) this.K0);
            GLES20.glBindFramebuffer(36160, this.A0[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f21922z0[0], 0);
            GLES20.glClear(0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f21922z0[1]);
            GLES20.glUniform1f(this.S, 0.0f);
            GLES20.glUniform1f(this.T, 1.0f / this.F0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.A0[2]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f21922z0[2], 0);
            GLES20.glClear(0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f21922z0[0]);
            GLES20.glUniform1f(this.S, 1.0f / this.E0);
            GLES20.glUniform1f(this.T, 0.0f);
            GLES20.glDrawArrays(5, 0, 4);
            this.P0 = false;
        }
        float e10 = this.M0.e();
        float d10 = this.M0.d();
        float f10 = this.M0.f();
        float g10 = this.M0.g();
        GLES20.glBindFramebuffer(36160, this.A0[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f21922z0[0], 0);
        GLES20.glClear(0);
        if (j10 == 1) {
            GLES20.glUseProgram(this.f21880e0);
            GLES20.glUniform1i(this.f21886h0, 0);
            GLES20.glUniform1i(this.f21888i0, 1);
            GLES20.glUniform1f(this.f21890j0, e10);
            GLES20.glUniform1f(this.f21894l0, d10);
            GLES20.glUniform2f(this.f21892k0, f10, g10);
            GLES20.glUniform1f(this.f21896m0, this.F0 / this.E0);
            GLES20.glEnableVertexAttribArray(this.f21884g0);
            GLES20.glVertexAttribPointer(this.f21884g0, 2, 5126, false, 8, (Buffer) this.J0);
            GLES20.glEnableVertexAttribArray(this.f21882f0);
            GLES20.glVertexAttribPointer(this.f21882f0, 2, 5126, false, 8, (Buffer) this.K0);
        } else if (j10 == 2) {
            GLES20.glUseProgram(this.U);
            GLES20.glUniform1i(this.X, 0);
            GLES20.glUniform1i(this.Y, 1);
            GLES20.glUniform1f(this.Z, e10);
            GLES20.glUniform1f(this.f21874b0, d10);
            GLES20.glUniform1f(this.f21876c0, this.M0.c());
            GLES20.glUniform2f(this.f21872a0, f10, g10);
            GLES20.glUniform1f(this.f21878d0, this.F0 / this.E0);
            GLES20.glEnableVertexAttribArray(this.W);
            GLES20.glVertexAttribPointer(this.W, 2, 5126, false, 8, (Buffer) this.J0);
            GLES20.glEnableVertexAttribArray(this.V);
            GLES20.glVertexAttribPointer(this.V, 2, 5126, false, 8, (Buffer) this.K0);
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f21922z0[1]);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.f21922z0[2]);
        GLES20.glDrawArrays(5, 0, 4);
        return true;
    }

    public final void k() {
        GLES20.glBindFramebuffer(36160, this.A0[1]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f21922z0[1], 0);
        GLES20.glClear(0);
        GLES20.glUseProgram(this.f21909t);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f21922z0[0]);
        GLES20.glUniform1i(this.f21915w, 0);
        float f10 = 1.0f;
        if (this.D0) {
            GLES20.glUniform1f(this.f21917x, 1.0f);
            GLES20.glUniform1f(this.f21919y, 1.0f);
            GLES20.glUniform1f(this.f21921z, 0.0f);
            GLES20.glUniform1f(this.A, 1.0f);
            GLES20.glUniform1f(this.B, 1.0f);
            GLES20.glUniform1f(this.C, 0.0f);
            GLES20.glUniform1f(this.D, 0.0f);
            GLES20.glUniform1f(this.E, 0.0f);
            GLES20.glUniform1f(this.J, 0.0f);
            GLES20.glUniform3f(this.N, 0.0f, 0.0f, 0.0f);
            GLES20.glUniform1f(this.L, 0.0f);
            GLES20.glUniform3f(this.M, 0.0f, 0.0f, 0.0f);
            GLES20.glUniform1f(this.K, 0.0f);
            GLES20.glUniform1f(this.I, 1.0f);
        } else {
            int j10 = this.M0.j(13);
            int j11 = this.M0.j(11);
            int L = j10 != 0 ? j.L(j10) : 0;
            int L2 = j11 != 0 ? j.L(j11) : 0;
            GLES20.glUniform1f(this.f21917x, B());
            GLES20.glUniform1f(this.f21919y, y());
            GLES20.glUniform1f(this.f21921z, u());
            GLES20.glUniform1f(this.A, r());
            GLES20.glUniform1f(this.B, A());
            GLES20.glUniform1f(this.C, H());
            GLES20.glUniform1f(this.D, G());
            GLES20.glUniform1f(this.E, x());
            GLES20.glUniform1f(this.J, w());
            GLES20.glUniform3f(this.N, ((L >> 16) & 255) / 255.0f, ((L >> 8) & 255) / 255.0f, (L & 255) / 255.0f);
            GLES20.glUniform1f(this.L, D());
            GLES20.glUniform3f(this.M, ((L2 >> 16) & 255) / 255.0f, ((L2 >> 8) & 255) / 255.0f, (L2 & 255) / 255.0f);
            GLES20.glUniform1f(this.K, E());
            boolean V = V();
            int i10 = this.I;
            if (!V) {
                f10 = 0.0f;
            }
            GLES20.glUniform1f(i10, f10);
            if (!V) {
                n();
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, this.B0[0]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                GLES20.glTexImage2D(3553, 0, 6408, 200, 1, 0, 6408, 5121, s());
                GLES20.glUniform1i(this.H, 1);
            }
        }
        GLES20.glUniform1f(this.F, this.E0);
        GLES20.glUniform1f(this.G, this.F0);
        GLES20.glEnableVertexAttribArray(this.f21913v);
        GLES20.glVertexAttribPointer(this.f21913v, 2, 5126, false, 8, (Buffer) this.J0);
        GLES20.glEnableVertexAttribArray(this.f21911u);
        GLES20.glVertexAttribPointer(this.f21911u, 2, 5126, false, 8, (Buffer) this.K0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void l() {
        if (!this.C0) {
            GLES20.glBindFramebuffer(36160, this.A0[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f21922z0[0], 0);
            GLES20.glClear(0);
            GLES20.glUseProgram(this.f21889j);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f21922z0[1]);
            GLES20.glUniform1i(this.f21895m, 0);
            GLES20.glEnableVertexAttribArray(this.f21893l);
            GLES20.glVertexAttribPointer(this.f21893l, 2, 5126, false, 8, (Buffer) this.J0);
            GLES20.glEnableVertexAttribArray(this.f21891k);
            GLES20.glVertexAttribPointer(this.f21891k, 2, 5126, false, 8, (Buffer) this.I0);
            GLES20.glDrawArrays(5, 0, 4);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.E0 * this.F0 * 4);
            GLES20.glReadPixels(0, 0, this.E0, this.F0, 6408, 5121, allocateDirect);
            GLES20.glBindTexture(3553, this.f21920y0[0]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glTexImage2D(3553, 0, 6408, this.E0, this.F0, 0, 6408, 5121, allocateDirect);
            ByteBuffer byteBuffer = null;
            try {
                byteBuffer = ByteBuffer.allocateDirect(Log.TAG_VIDEO);
                N.calcCDT(allocateDirect, this.E0, this.F0, byteBuffer);
            } catch (Throwable th) {
                Log.e("Cannot allocate buffer for CDT", th, new Object[0]);
            }
            GLES20.glBindTexture(3553, this.f21920y0[1]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glTexImage2D(3553, 0, 6408, Log.TAG_CRASH, 16, 0, 6408, 5121, byteBuffer);
            this.C0 = true;
        }
        GLES20.glBindFramebuffer(36160, this.A0[1]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f21922z0[1], 0);
        GLES20.glClear(0);
        GLES20.glUseProgram(this.f21897n);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f21920y0[0]);
        GLES20.glUniform1i(this.f21903q, 0);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.f21920y0[1]);
        GLES20.glUniform1i(this.f21907s, 1);
        if (this.D0) {
            GLES20.glUniform1f(this.f21905r, 0.0f);
        } else {
            GLES20.glUniform1f(this.f21905r, t());
        }
        GLES20.glEnableVertexAttribArray(this.f21901p);
        GLES20.glVertexAttribPointer(this.f21901p, 2, 5126, false, 8, (Buffer) this.J0);
        GLES20.glEnableVertexAttribArray(this.f21899o);
        GLES20.glVertexAttribPointer(this.f21899o, 2, 5126, false, 8, (Buffer) this.I0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void m() {
        GLES20.glBindFramebuffer(36160, this.A0[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f21922z0[0], 0);
        GLES20.glClear(0);
        GLES20.glUseProgram(this.f21898n0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f21922z0[1]);
        GLES20.glUniform1i(this.f21910t0, 0);
        if (this.D0) {
            GLES20.glUniform1f(this.f21900o0, 0.0f);
        } else {
            GLES20.glUniform1f(this.f21900o0, C());
        }
        GLES20.glUniform1f(this.f21902p0, this.E0);
        GLES20.glUniform1f(this.f21904q0, this.F0);
        GLES20.glEnableVertexAttribArray(this.f21908s0);
        GLES20.glVertexAttribPointer(this.f21908s0, 2, 5126, false, 8, (Buffer) this.J0);
        GLES20.glEnableVertexAttribArray(this.f21906r0);
        GLES20.glVertexAttribPointer(this.f21906r0, 2, 5126, false, 8, (Buffer) this.K0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void n() {
    }

    public final void o() {
        if (this.f21881f != null) {
            EGL10 egl10 = this.f21873b;
            EGLDisplay eGLDisplay = this.f21875c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f21873b.eglDestroySurface(this.f21875c, this.f21881f);
            this.f21881f = null;
        }
        EGLContext eGLContext = this.f21879e;
        if (eGLContext != null) {
            this.f21873b.eglDestroyContext(this.f21875c, eGLContext);
            this.f21879e = null;
        }
        EGLDisplay eGLDisplay2 = this.f21875c;
        if (eGLDisplay2 != null) {
            this.f21873b.eglTerminate(eGLDisplay2);
            this.f21875c = null;
        }
    }

    public void p(rd.a aVar) {
        m mVar = this.N0;
        mVar.h(Message.obtain(mVar.d(), 5, aVar), 0L);
    }

    public final void q(final rd.a aVar) {
        GLES20.glBindFramebuffer(36160, this.A0[1]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f21922z0[1 ^ (this.Q0 ? 1 : 0)], 0);
        GLES20.glClear(0);
        final Bitmap z10 = z();
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glClear(0);
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                a.this.a(z10);
            }
        });
    }

    public final float r() {
        return (v(2) * 0.3f) + 1.0f;
    }

    public final ByteBuffer s() {
        return null;
    }

    public final float t() {
        return v(0);
    }

    public final float u() {
        return v(1);
    }

    public final float v(int i10) {
        return this.M0.h(i10);
    }

    public final float w() {
        return this.M0.h(5);
    }

    public final float x() {
        return v(7) * 0.04f;
    }

    public final float y() {
        return ((F(12) * 0.75f) + 100.0f) / 100.0f;
    }

    public final Bitmap z() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.E0 * this.F0 * 4);
        GLES20.glReadPixels(0, 0, this.E0, this.F0, 6408, 5121, allocateDirect);
        Bitmap createBitmap = Bitmap.createBitmap(this.E0, this.F0, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        return createBitmap;
    }
}
