package p239qd;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Message;
import be.C1379j0;
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
import nc.C7389v0;
import org.thunderdog.challegram.C7888N;
import org.thunderdog.challegram.Log;
import p082fd.C4384m;
import p225pd.C8111a;
import p364zd.C11524j;

public class C8325c {
    public int f26860A;
    public int f26862B;
    public int f26864C;
    public boolean f26865C0;
    public int f26866D;
    public boolean f26867D0;
    public int f26868E;
    public int f26869E0;
    public int f26870F;
    public int f26871F0;
    public int f26872G;
    public volatile int f26873G0;
    public int f26874H;
    public volatile int f26875H0;
    public int f26876I;
    public FloatBuffer f26877I0;
    public int f26878J;
    public FloatBuffer f26879J0;
    public int f26880K;
    public FloatBuffer f26881K0;
    public int f26882L;
    public boolean f26883L0;
    public int f26884M;
    public C8111a f26885M0;
    public int f26886N;
    public final C4384m f26887N0;
    public int f26888O;
    public boolean f26889O0;
    public int f26890P;
    public boolean f26891P0;
    public int f26892Q;
    public boolean f26893Q0;
    public int f26894R;
    public int f26895S;
    public int f26896T;
    public int f26897U;
    public int f26898V;
    public int f26899W;
    public int f26900X;
    public int f26901Y;
    public int f26902Z;
    public GL f26903a;
    public int f26904a0;
    public EGL10 f26905b;
    public int f26906b0;
    public EGLDisplay f26907c;
    public int f26908c0;
    public EGLConfig f26909d;
    public int f26910d0;
    public EGLContext f26911e;
    public int f26912e0;
    public EGLSurface f26913f;
    public int f26914f0;
    public long f26915g;
    public int f26916g0;
    public SurfaceTexture f26917h;
    public int f26918h0;
    public Bitmap f26919i;
    public int f26920i0;
    public int f26921j;
    public int f26922j0;
    public int f26923k;
    public int f26924k0;
    public int f26925l;
    public int f26926l0;
    public int f26927m;
    public int f26928m0;
    public int f26929n;
    public int f26930n0;
    public int f26931o;
    public int f26932o0;
    public int f26933p;
    public int f26934p0;
    public int f26935q;
    public int f26936q0;
    public int f26937r;
    public int f26938r0;
    public int f26939s;
    public int f26940s0;
    public int f26941t;
    public int f26942t0;
    public int f26943u;
    public int f26944u0;
    public int f26945v;
    public int f26946v0;
    public int f26947w;
    public int f26948w0;
    public int f26949x;
    public int f26950x0;
    public int f26951y;
    public int f26953z;
    public int[] f26952y0 = new int[2];
    public int[] f26954z0 = new int[3];
    public int[] f26861A0 = new int[3];
    public int[] f26863B0 = new int[1];

    public class C8326a extends C4384m {
        public C8326a(String str) {
            super(str);
        }

        @Override
        public void mo3052f(Message message) {
            int i = message.what;
            boolean z = true;
            if (i == 0) {
                C8325c.this.m12844o();
                m28053g(true);
            } else if (i == 1) {
                C8325c cVar = C8325c.this;
                cVar.f26883L0 = cVar.m12872I();
            } else if (i == 2) {
                C8325c cVar2 = C8325c.this;
                boolean z2 = message.arg1 == 1;
                if (message.arg2 != 1) {
                    z = false;
                }
                cVar2.m12863R(z2, z);
            } else if (i == 3) {
                Object[] objArr = (Object[]) message.obj;
                C8325c.this.m12861T((Bitmap) objArr[0], (C8111a) objArr[1]);
            } else if (i == 4) {
                C8325c.this.m12867N();
            } else if (i == 5) {
                C8325c.this.m12842q((AbstractC8323a) message.obj);
            }
        }
    }

    public C8325c(SurfaceTexture surfaceTexture, Bitmap bitmap, C8111a aVar, int i, int i2) {
        C8326a aVar2 = new C8326a("EGLEditorQueue");
        this.f26887N0 = aVar2;
        this.f26919i = bitmap;
        this.f26917h = surfaceTexture;
        this.f26873G0 = i;
        this.f26875H0 = i2;
        this.f26885M0 = aVar;
        aVar2.m28052h(Message.obtain(aVar2.m28055d(), 1), 0L);
    }

    public final float m12880A() {
        float v = m12837v(4);
        if (v > 0.0f) {
            v *= 1.05f;
        }
        return v + 1.0f;
    }

    public final float m12879B() {
        return ((m12875F(10) * 0.55f) + 100.0f) / 100.0f;
    }

    public final float m12878C() {
        return (m12837v(8) * 0.6f) + 0.11f;
    }

    public final float m12877D() {
        return this.f26885M0.m13575j(13) == 0 ? 0.0f : 0.5f;
    }

    public final float m12876E() {
        return this.f26885M0.m13575j(11) == 0 ? 0.0f : 0.5f;
    }

    public final float m12875F(int i) {
        return this.f26885M0.m13575j(i);
    }

    public final float m12874G() {
        return m12837v(6);
    }

    public final float m12873H() {
        return m12837v(3);
    }

    public final boolean m12872I() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f26905b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f26907c = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            Log.m14724e("eglGetDisplay failed: %s", C7389v0.m16585s0(this.f26905b.eglGetError()));
            m12844o();
            return false;
        } else if (!this.f26905b.eglInitialize(eglGetDisplay, new int[2])) {
            Log.m14724e("eglInitialize failed: %s", C7389v0.m16585s0(this.f26905b.eglGetError()));
            m12844o();
            return false;
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f26905b.eglChooseConfig(this.f26907c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                Log.m14724e("eglChooseConfig failed: %s", C7389v0.m16585s0(this.f26905b.eglGetError()));
                m12844o();
                return false;
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f26909d = eGLConfig;
                EGLContext eglCreateContext = this.f26905b.eglCreateContext(this.f26907c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.f26911e = eglCreateContext;
                if (eglCreateContext == null) {
                    Log.m14724e("eglCreateContext failed: %s", C7389v0.m16585s0(this.f26905b.eglGetError()));
                    m12844o();
                    return false;
                }
                SurfaceTexture surfaceTexture = this.f26917h;
                if (surfaceTexture != null) {
                    EGLSurface eglCreateWindowSurface = this.f26905b.eglCreateWindowSurface(this.f26907c, this.f26909d, surfaceTexture, null);
                    this.f26913f = eglCreateWindowSurface;
                    if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                        Log.m14724e("createWindowSurface failed: %s", C7389v0.m16585s0(this.f26905b.eglGetError()));
                        m12844o();
                        return false;
                    } else if (!this.f26905b.eglMakeCurrent(this.f26907c, eglCreateWindowSurface, eglCreateWindowSurface, this.f26911e)) {
                        Log.m14724e("eglMakeCurrent failed: %s", C7389v0.m16585s0(this.f26905b.eglGetError()));
                        m12844o();
                        return false;
                    } else {
                        this.f26903a = this.f26911e.getGL();
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
                        allocateDirect.order(ByteOrder.nativeOrder());
                        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
                        this.f26877I0 = asFloatBuffer;
                        asFloatBuffer.put(new float[]{-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f});
                        this.f26877I0.position(0);
                        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
                        allocateDirect2.order(ByteOrder.nativeOrder());
                        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
                        this.f26881K0 = asFloatBuffer2;
                        asFloatBuffer2.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
                        this.f26881K0.position(0);
                        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
                        allocateDirect3.order(ByteOrder.nativeOrder());
                        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
                        this.f26879J0 = asFloatBuffer3;
                        asFloatBuffer3.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
                        this.f26879J0.position(0);
                        GLES20.glGenTextures(1, this.f26863B0, 0);
                        GLES20.glGenTextures(2, this.f26952y0, 0);
                        int K = m12870K(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
                        int K2 = m12870K(35632, "varying highp vec2 texCoord;uniform sampler2D sourceImage;uniform highp float width;uniform highp float height;uniform sampler2D curvesImage;uniform lowp float skipTone;uniform lowp float shadows;const mediump vec3 hsLuminanceWeighting = vec3(0.3, 0.3, 0.3);uniform lowp float highlights;uniform lowp float contrast;uniform lowp float fadeAmount;const mediump vec3 satLuminanceWeighting = vec3(0.2126, 0.7152, 0.0722);uniform lowp float saturation;uniform lowp float shadowsTintIntensity;uniform lowp float highlightsTintIntensity;uniform lowp vec3 shadowsTintColor;uniform lowp vec3 highlightsTintColor;uniform lowp float exposure;uniform lowp float warmth;uniform lowp float grain;const lowp float permTexUnit = 1.0 / 256.0;const lowp float permTexUnitHalf = 0.5 / 256.0;const lowp float grainsize = 2.3;uniform lowp float vignette;highp float getLuma(highp vec3 rgbP) {return (0.299 * rgbP.r) + (0.587 * rgbP.g) + (0.114 * rgbP.b);}lowp vec3 rgbToHsv(lowp vec3 c) {highp vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);highp vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);highp vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);highp float d = q.x - min(q.w, q.y);highp float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}lowp vec3 hsvToRgb(lowp vec3 c) {highp vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);highp vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);}highp vec3 rgbToHsl(highp vec3 color) {highp vec3 hsl;highp float fmin = min(min(color.r, color.g), color.b);highp float fmax = max(max(color.r, color.g), color.b);highp float delta = fmax - fmin;hsl.z = (fmax + fmin) / 2.0;if (delta == 0.0) {hsl.x = 0.0;hsl.y = 0.0;} else {if (hsl.z < 0.5) {hsl.y = delta / (fmax + fmin);} else {hsl.y = delta / (2.0 - fmax - fmin);}highp float deltaR = (((fmax - color.r) / 6.0) + (delta / 2.0)) / delta;highp float deltaG = (((fmax - color.g) / 6.0) + (delta / 2.0)) / delta;highp float deltaB = (((fmax - color.b) / 6.0) + (delta / 2.0)) / delta;if (color.r == fmax) {hsl.x = deltaB - deltaG;} else if (color.g == fmax) {hsl.x = (1.0 / 3.0) + deltaR - deltaB;} else if (color.b == fmax) {hsl.x = (2.0 / 3.0) + deltaG - deltaR;}if (hsl.x < 0.0) {hsl.x += 1.0;} else if (hsl.x > 1.0) {hsl.x -= 1.0;}}return hsl;}highp float hueToRgb(highp float f1, highp float f2, highp float hue) {if (hue < 0.0) {hue += 1.0;} else if (hue > 1.0) {hue -= 1.0;}highp float res;if ((6.0 * hue) < 1.0) {res = f1 + (f2 - f1) * 6.0 * hue;} else if ((2.0 * hue) < 1.0) {res = f2;} else if ((3.0 * hue) < 2.0) {res = f1 + (f2 - f1) * ((2.0 / 3.0) - hue) * 6.0;} else {res = f1;} return res;}highp vec3 hslToRgb(highp vec3 hsl) {if (hsl.y == 0.0) {return vec3(hsl.z);} else {highp float f2;if (hsl.z < 0.5) {f2 = hsl.z * (1.0 + hsl.y);} else {f2 = (hsl.z + hsl.y) - (hsl.y * hsl.z);}highp float f1 = 2.0 * hsl.z - f2;return vec3(hueToRgb(f1, f2, hsl.x + (1.0/3.0)), hueToRgb(f1, f2, hsl.x), hueToRgb(f1, f2, hsl.x - (1.0/3.0)));}}highp vec3 rgbToYuv(highp vec3 inP) {highp float luma = getLuma(inP);return vec3(luma, (1.0 / 1.772) * (inP.b - luma), (1.0 / 1.402) * (inP.r - luma));}lowp vec3 yuvToRgb(highp vec3 inP) {return vec3(1.402 * inP.b + inP.r, (inP.r - (0.299 * 1.402 / 0.587) * inP.b - (0.114 * 1.772 / 0.587) * inP.g), 1.772 * inP.g + inP.r);}lowp float easeInOutSigmoid(lowp float value, lowp float strength) {if (value > 0.5) {return 1.0 - pow(2.0 - 2.0 * value, 1.0 / (1.0 - strength)) * 0.5;} else {return pow(2.0 * value, 1.0 / (1.0 - strength)) * 0.5;}}lowp vec3 applyLuminanceCurve(lowp vec3 pixel) {highp float index = floor(clamp(pixel.z / (1.0 / 200.0), 0.0, 199.0));pixel.y = mix(0.0, pixel.y, smoothstep(0.0, 0.1, pixel.z) * (1.0 - smoothstep(0.8, 1.0, pixel.z)));pixel.z = texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).a;return pixel;}lowp vec3 applyRGBCurve(lowp vec3 pixel) {highp float index = floor(clamp(pixel.r / (1.0 / 200.0), 0.0, 199.0));pixel.r = texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).r;index = floor(clamp(pixel.g / (1.0 / 200.0), 0.0, 199.0));pixel.g = clamp(texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).g, 0.0, 1.0);index = floor(clamp(pixel.b / (1.0 / 200.0), 0.0, 199.0));pixel.b = clamp(texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).b, 0.0, 1.0);return pixel;}highp vec3 fadeAdjust(highp vec3 color, highp float fadeVal) {return (color * (1.0 - fadeVal)) + ((color + (vec3(-0.9772) * pow(vec3(color), vec3(3.0)) + vec3(1.708) * pow(vec3(color), vec3(2.0)) + vec3(-0.1603) * vec3(color) + vec3(0.2878) - color * vec3(0.9))) * fadeVal);}lowp vec3 tintRaiseShadowsCurve(lowp vec3 color) {return vec3(-0.003671) * pow(color, vec3(3.0)) + vec3(0.3842) * pow(color, vec3(2.0)) + vec3(0.3764) * color + vec3(0.2515);}lowp vec3 tintShadows(lowp vec3 texel, lowp vec3 tintColor, lowp float tintAmount) {return clamp(mix(texel, mix(texel, tintRaiseShadowsCurve(texel), tintColor), tintAmount), 0.0, 1.0);} lowp vec3 tintHighlights(lowp vec3 texel, lowp vec3 tintColor, lowp float tintAmount) {return clamp(mix(texel, mix(texel, vec3(1.0) - tintRaiseShadowsCurve(vec3(1.0) - texel), (vec3(1.0) - tintColor)), tintAmount), 0.0, 1.0);}highp vec4 rnm(in highp vec2 tc) {highp float noise = sin(dot(tc, vec2(12.9898, 78.233))) * 43758.5453;return vec4(fract(noise), fract(noise * 1.2154), fract(noise * 1.3453), fract(noise * 1.3647)) * 2.0 - 1.0;}highp float fade(in highp float t) {return t * t * t * (t * (t * 6.0 - 15.0) + 10.0);}highp float pnoise3D(in highp vec3 p) {highp vec3 pi = permTexUnit * floor(p) + permTexUnitHalf;highp vec3 pf = fract(p);highp float perm = rnm(pi.xy).a;highp float n000 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf);highp float n001 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(0.0, 0.0, 1.0));perm = rnm(pi.xy + vec2(0.0, permTexUnit)).a;highp float n010 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(0.0, 1.0, 0.0));highp float n011 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(0.0, 1.0, 1.0));perm = rnm(pi.xy + vec2(permTexUnit, 0.0)).a;highp float n100 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(1.0, 0.0, 0.0));highp float n101 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(1.0, 0.0, 1.0));perm = rnm(pi.xy + vec2(permTexUnit, permTexUnit)).a;highp float n110 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(1.0, 1.0, 0.0));highp float n111 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(1.0, 1.0, 1.0));highp vec4 n_x = mix(vec4(n000, n001, n010, n011), vec4(n100, n101, n110, n111), fade(pf.x));highp vec2 n_xy = mix(n_x.xy, n_x.zw, fade(pf.y));return mix(n_xy.x, n_xy.y, fade(pf.z));}lowp vec2 coordRot(in lowp vec2 tc, in lowp float angle) {return vec2(((tc.x * 2.0 - 1.0) * cos(angle) - (tc.y * 2.0 - 1.0) * sin(angle)) * 0.5 + 0.5, ((tc.y * 2.0 - 1.0) * cos(angle) + (tc.x * 2.0 - 1.0) * sin(angle)) * 0.5 + 0.5);}void main() {lowp vec4 source = texture2D(sourceImage, texCoord);lowp vec4 result = source;const lowp float toolEpsilon = 0.005;if (skipTone < toolEpsilon) {result = vec4(applyRGBCurve(hslToRgb(applyLuminanceCurve(rgbToHsl(result.rgb)))), result.a);}mediump float hsLuminance = dot(result.rgb, hsLuminanceWeighting);mediump float shadow = clamp((pow(hsLuminance, 1.0 / shadows) + (-0.76) * pow(hsLuminance, 2.0 / shadows)) - hsLuminance, 0.0, 1.0);mediump float highlight = clamp((1.0 - (pow(1.0 - hsLuminance, 1.0 / (2.0 - highlights)) + (-0.8) * pow(1.0 - hsLuminance, 2.0 / (2.0 - highlights)))) - hsLuminance, -1.0, 0.0);lowp vec3 hsresult = vec3(0.0, 0.0, 0.0) + ((hsLuminance + shadow + highlight) - 0.0) * ((result.rgb - vec3(0.0, 0.0, 0.0)) / (hsLuminance - 0.0));mediump float contrastedLuminance = ((hsLuminance - 0.5) * 1.5) + 0.5;mediump float whiteInterp = contrastedLuminance * contrastedLuminance * contrastedLuminance;mediump float whiteTarget = clamp(highlights, 1.0, 2.0) - 1.0;hsresult = mix(hsresult, vec3(1.0), whiteInterp * whiteTarget);mediump float invContrastedLuminance = 1.0 - contrastedLuminance;mediump float blackInterp = invContrastedLuminance * invContrastedLuminance * invContrastedLuminance;mediump float blackTarget = 1.0 - clamp(shadows, 0.0, 1.0);hsresult = mix(hsresult, vec3(0.0), blackInterp * blackTarget);result = vec4(hsresult.rgb, result.a);result = vec4(clamp(((result.rgb - vec3(0.5)) * contrast + vec3(0.5)), 0.0, 1.0), result.a);if (abs(fadeAmount) > toolEpsilon) {result.rgb = fadeAdjust(result.rgb, fadeAmount);}lowp float satLuminance = dot(result.rgb, satLuminanceWeighting);lowp vec3 greyScaleColor = vec3(satLuminance);result = vec4(clamp(mix(greyScaleColor, result.rgb, saturation), 0.0, 1.0), result.a);if (abs(shadowsTintIntensity) > toolEpsilon) {result.rgb = tintShadows(result.rgb, shadowsTintColor, shadowsTintIntensity * 2.0);}if (abs(highlightsTintIntensity) > toolEpsilon) {result.rgb = tintHighlights(result.rgb, highlightsTintColor, highlightsTintIntensity * 2.0);}if (abs(exposure) > toolEpsilon) {mediump float mag = exposure * 1.045;mediump float exppower = 1.0 + abs(mag);if (mag < 0.0) {exppower = 1.0 / exppower;}result.r = 1.0 - pow((1.0 - result.r), exppower);result.g = 1.0 - pow((1.0 - result.g), exppower);result.b = 1.0 - pow((1.0 - result.b), exppower);}if (abs(warmth) > toolEpsilon) {highp vec3 yuvVec;if (warmth > 0.0 ) {yuvVec = vec3(0.1765, -0.1255, 0.0902);} else {yuvVec = -vec3(0.0588, 0.1569, -0.1255);}highp vec3 yuvColor = rgbToYuv(result.rgb);highp float luma = yuvColor.r;highp float curveScale = sin(luma * 3.14159);yuvColor += 0.375 * warmth * curveScale * yuvVec;result.rgb = yuvToRgb(yuvColor);}if (abs(grain) > toolEpsilon) {highp vec3 rotOffset = vec3(1.425, 3.892, 5.835);highp vec2 rotCoordsR = coordRot(texCoord, rotOffset.x);highp vec3 noise = vec3(pnoise3D(vec3(rotCoordsR * vec2(width / grainsize, height / grainsize),0.0)));lowp vec3 lumcoeff = vec3(0.299,0.587,0.114);lowp float luminance = dot(result.rgb, lumcoeff);lowp float lum = smoothstep(0.2, 0.0, luminance);lum += luminance;noise = mix(noise,vec3(0.0),pow(lum,4.0));result.rgb = result.rgb + noise * grain;}if (abs(vignette) > toolEpsilon) {const lowp float midpoint = 0.7;const lowp float fuzziness = 0.62;lowp float radDist = length(texCoord - 0.5) / sqrt(0.5);lowp float mag = easeInOutSigmoid(radDist * midpoint, fuzziness) * vignette * 0.645;result.rgb = mix(pow(result.rgb, vec3(1.0 / (1.0 - mag))), vec3(0.0), mag * mag);}gl_FragColor = result;}");
                        if (K == 0 || K2 == 0) {
                            m12844o();
                            return false;
                        }
                        int glCreateProgram = GLES20.glCreateProgram();
                        this.f26941t = glCreateProgram;
                        GLES20.glAttachShader(glCreateProgram, K);
                        GLES20.glAttachShader(this.f26941t, K2);
                        GLES20.glBindAttribLocation(this.f26941t, 0, "position");
                        GLES20.glBindAttribLocation(this.f26941t, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f26941t);
                        int[] iArr2 = new int[1];
                        GLES20.glGetProgramiv(this.f26941t, 35714, iArr2, 0);
                        if (iArr2[0] == 0) {
                            GLES20.glDeleteProgram(this.f26941t);
                            this.f26941t = 0;
                        } else {
                            this.f26943u = GLES20.glGetAttribLocation(this.f26941t, "position");
                            this.f26945v = GLES20.glGetAttribLocation(this.f26941t, "inputTexCoord");
                            this.f26947w = GLES20.glGetUniformLocation(this.f26941t, "sourceImage");
                            this.f26949x = GLES20.glGetUniformLocation(this.f26941t, "shadows");
                            this.f26951y = GLES20.glGetUniformLocation(this.f26941t, "highlights");
                            this.f26953z = GLES20.glGetUniformLocation(this.f26941t, "exposure");
                            this.f26860A = GLES20.glGetUniformLocation(this.f26941t, "contrast");
                            this.f26862B = GLES20.glGetUniformLocation(this.f26941t, "saturation");
                            this.f26864C = GLES20.glGetUniformLocation(this.f26941t, "warmth");
                            this.f26866D = GLES20.glGetUniformLocation(this.f26941t, "vignette");
                            this.f26868E = GLES20.glGetUniformLocation(this.f26941t, "grain");
                            this.f26870F = GLES20.glGetUniformLocation(this.f26941t, "width");
                            this.f26872G = GLES20.glGetUniformLocation(this.f26941t, "height");
                            this.f26874H = GLES20.glGetUniformLocation(this.f26941t, "curvesImage");
                            this.f26876I = GLES20.glGetUniformLocation(this.f26941t, "skipTone");
                            this.f26878J = GLES20.glGetUniformLocation(this.f26941t, "fadeAmount");
                            this.f26880K = GLES20.glGetUniformLocation(this.f26941t, "shadowsTintIntensity");
                            this.f26882L = GLES20.glGetUniformLocation(this.f26941t, "highlightsTintIntensity");
                            this.f26884M = GLES20.glGetUniformLocation(this.f26941t, "shadowsTintColor");
                            this.f26886N = GLES20.glGetUniformLocation(this.f26941t, "highlightsTintColor");
                        }
                        int K3 = m12870K(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;uniform highp float inputWidth;uniform highp float inputHeight;varying vec2 leftTexCoord;varying vec2 rightTexCoord;varying vec2 topTexCoord;varying vec2 bottomTexCoord;void main() {gl_Position = position;texCoord = inputTexCoord;highp vec2 widthStep = vec2(1.0 / inputWidth, 0.0);highp vec2 heightStep = vec2(0.0, 1.0 / inputHeight);leftTexCoord = inputTexCoord - widthStep;rightTexCoord = inputTexCoord + widthStep;topTexCoord = inputTexCoord + heightStep;bottomTexCoord = inputTexCoord - heightStep;}");
                        int K4 = m12870K(35632, "precision highp float;varying vec2 texCoord;varying vec2 leftTexCoord;varying vec2 rightTexCoord;varying vec2 topTexCoord;varying vec2 bottomTexCoord;uniform sampler2D sourceImage;uniform float sharpen;void main() {vec4 result = texture2D(sourceImage, texCoord);vec3 leftTextureColor = texture2D(sourceImage, leftTexCoord).rgb;vec3 rightTextureColor = texture2D(sourceImage, rightTexCoord).rgb;vec3 topTextureColor = texture2D(sourceImage, topTexCoord).rgb;vec3 bottomTextureColor = texture2D(sourceImage, bottomTexCoord).rgb;result.rgb = result.rgb * (1.0 + 4.0 * sharpen) - (leftTextureColor + rightTextureColor + topTextureColor + bottomTextureColor) * sharpen;gl_FragColor = result;}");
                        if (K3 == 0 || K4 == 0) {
                            m12844o();
                            return false;
                        }
                        int glCreateProgram2 = GLES20.glCreateProgram();
                        this.f26930n0 = glCreateProgram2;
                        GLES20.glAttachShader(glCreateProgram2, K3);
                        GLES20.glAttachShader(this.f26930n0, K4);
                        GLES20.glBindAttribLocation(this.f26930n0, 0, "position");
                        GLES20.glBindAttribLocation(this.f26930n0, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f26930n0);
                        int[] iArr3 = new int[1];
                        GLES20.glGetProgramiv(this.f26930n0, 35714, iArr3, 0);
                        if (iArr3[0] == 0) {
                            GLES20.glDeleteProgram(this.f26930n0);
                            this.f26930n0 = 0;
                        } else {
                            this.f26938r0 = GLES20.glGetAttribLocation(this.f26930n0, "position");
                            this.f26940s0 = GLES20.glGetAttribLocation(this.f26930n0, "inputTexCoord");
                            this.f26942t0 = GLES20.glGetUniformLocation(this.f26930n0, "sourceImage");
                            this.f26934p0 = GLES20.glGetUniformLocation(this.f26930n0, "inputWidth");
                            this.f26936q0 = GLES20.glGetUniformLocation(this.f26930n0, "inputHeight");
                            this.f26932o0 = GLES20.glGetUniformLocation(this.f26930n0, "sharpen");
                        }
                        int K5 = m12870K(35633, "attribute vec4 position;attribute vec4 inputTexCoord;uniform highp float texelWidthOffset;uniform highp float texelHeightOffset;varying vec2 blurCoordinates[9];void main() {gl_Position = position;vec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);blurCoordinates[0] = inputTexCoord.xy;blurCoordinates[1] = inputTexCoord.xy + singleStepOffset * 1.458430;blurCoordinates[2] = inputTexCoord.xy - singleStepOffset * 1.458430;blurCoordinates[3] = inputTexCoord.xy + singleStepOffset * 3.403985;blurCoordinates[4] = inputTexCoord.xy - singleStepOffset * 3.403985;blurCoordinates[5] = inputTexCoord.xy + singleStepOffset * 5.351806;blurCoordinates[6] = inputTexCoord.xy - singleStepOffset * 5.351806;blurCoordinates[7] = inputTexCoord.xy + singleStepOffset * 7.302940;blurCoordinates[8] = inputTexCoord.xy - singleStepOffset * 7.302940;}");
                        int K6 = m12870K(35632, "uniform sampler2D sourceImage;varying highp vec2 blurCoordinates[9];void main() {lowp vec4 sum = vec4(0.0);sum += texture2D(sourceImage, blurCoordinates[0]) * 0.133571;sum += texture2D(sourceImage, blurCoordinates[1]) * 0.233308;sum += texture2D(sourceImage, blurCoordinates[2]) * 0.233308;sum += texture2D(sourceImage, blurCoordinates[3]) * 0.135928;sum += texture2D(sourceImage, blurCoordinates[4]) * 0.135928;sum += texture2D(sourceImage, blurCoordinates[5]) * 0.051383;sum += texture2D(sourceImage, blurCoordinates[6]) * 0.051383;sum += texture2D(sourceImage, blurCoordinates[7]) * 0.012595;sum += texture2D(sourceImage, blurCoordinates[8]) * 0.012595;gl_FragColor = sum;}");
                        if (K5 == 0 || K6 == 0) {
                            m12844o();
                            return false;
                        }
                        int glCreateProgram3 = GLES20.glCreateProgram();
                        this.f26888O = glCreateProgram3;
                        GLES20.glAttachShader(glCreateProgram3, K5);
                        GLES20.glAttachShader(this.f26888O, K6);
                        GLES20.glBindAttribLocation(this.f26888O, 0, "position");
                        GLES20.glBindAttribLocation(this.f26888O, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f26888O);
                        int[] iArr4 = new int[1];
                        GLES20.glGetProgramiv(this.f26888O, 35714, iArr4, 0);
                        if (iArr4[0] == 0) {
                            GLES20.glDeleteProgram(this.f26888O);
                            this.f26888O = 0;
                        } else {
                            this.f26890P = GLES20.glGetAttribLocation(this.f26888O, "position");
                            this.f26892Q = GLES20.glGetAttribLocation(this.f26888O, "inputTexCoord");
                            this.f26894R = GLES20.glGetUniformLocation(this.f26888O, "sourceImage");
                            this.f26895S = GLES20.glGetUniformLocation(this.f26888O, "texelWidthOffset");
                            this.f26896T = GLES20.glGetUniformLocation(this.f26888O, "texelHeightOffset");
                        }
                        int K7 = m12870K(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
                        int K8 = m12870K(35632, "varying highp vec2 texCoord;uniform sampler2D sourceImage;uniform sampler2D inputImageTexture2;uniform lowp float excludeSize;uniform lowp vec2 excludePoint;uniform lowp float excludeBlurSize;uniform highp float angle;uniform highp float aspectRatio;void main() {lowp vec4 sharpImageColor = texture2D(sourceImage, texCoord);lowp vec4 blurredImageColor = texture2D(inputImageTexture2, texCoord);highp vec2 texCoordToUse = vec2(texCoord.x, (texCoord.y * aspectRatio + 0.5 - 0.5 * aspectRatio));highp float distanceFromCenter = abs((texCoordToUse.x - excludePoint.x) * aspectRatio * cos(angle) + (texCoordToUse.y - excludePoint.y) * sin(angle));gl_FragColor = mix(sharpImageColor, blurredImageColor, smoothstep(excludeSize - excludeBlurSize, excludeSize, distanceFromCenter));}");
                        if (K7 == 0 || K8 == 0) {
                            m12844o();
                            return false;
                        }
                        int glCreateProgram4 = GLES20.glCreateProgram();
                        this.f26897U = glCreateProgram4;
                        GLES20.glAttachShader(glCreateProgram4, K7);
                        GLES20.glAttachShader(this.f26897U, K8);
                        GLES20.glBindAttribLocation(this.f26897U, 0, "position");
                        GLES20.glBindAttribLocation(this.f26897U, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f26897U);
                        int[] iArr5 = new int[1];
                        GLES20.glGetProgramiv(this.f26897U, 35714, iArr5, 0);
                        if (iArr5[0] == 0) {
                            GLES20.glDeleteProgram(this.f26897U);
                            this.f26897U = 0;
                        } else {
                            this.f26898V = GLES20.glGetAttribLocation(this.f26897U, "position");
                            this.f26899W = GLES20.glGetAttribLocation(this.f26897U, "inputTexCoord");
                            this.f26900X = GLES20.glGetUniformLocation(this.f26897U, "sourceImage");
                            this.f26901Y = GLES20.glGetUniformLocation(this.f26897U, "inputImageTexture2");
                            this.f26902Z = GLES20.glGetUniformLocation(this.f26897U, "excludeSize");
                            this.f26904a0 = GLES20.glGetUniformLocation(this.f26897U, "excludePoint");
                            this.f26906b0 = GLES20.glGetUniformLocation(this.f26897U, "excludeBlurSize");
                            this.f26908c0 = GLES20.glGetUniformLocation(this.f26897U, "angle");
                            this.f26910d0 = GLES20.glGetUniformLocation(this.f26897U, "aspectRatio");
                        }
                        int K9 = m12870K(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
                        int K10 = m12870K(35632, "varying highp vec2 texCoord;uniform sampler2D sourceImage;uniform sampler2D inputImageTexture2;uniform lowp float excludeSize;uniform lowp vec2 excludePoint;uniform lowp float excludeBlurSize;uniform highp float aspectRatio;void main() {lowp vec4 sharpImageColor = texture2D(sourceImage, texCoord);lowp vec4 blurredImageColor = texture2D(inputImageTexture2, texCoord);highp vec2 texCoordToUse = vec2(texCoord.x, (texCoord.y * aspectRatio + 0.5 - 0.5 * aspectRatio));highp float distanceFromCenter = distance(excludePoint, texCoordToUse);gl_FragColor = mix(sharpImageColor, blurredImageColor, smoothstep(excludeSize - excludeBlurSize, excludeSize, distanceFromCenter));}");
                        if (K9 == 0 || K10 == 0) {
                            m12844o();
                            return false;
                        }
                        int glCreateProgram5 = GLES20.glCreateProgram();
                        this.f26912e0 = glCreateProgram5;
                        GLES20.glAttachShader(glCreateProgram5, K9);
                        GLES20.glAttachShader(this.f26912e0, K10);
                        GLES20.glBindAttribLocation(this.f26912e0, 0, "position");
                        GLES20.glBindAttribLocation(this.f26912e0, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f26912e0);
                        int[] iArr6 = new int[1];
                        GLES20.glGetProgramiv(this.f26912e0, 35714, iArr6, 0);
                        if (iArr6[0] == 0) {
                            GLES20.glDeleteProgram(this.f26912e0);
                            this.f26912e0 = 0;
                        } else {
                            this.f26914f0 = GLES20.glGetAttribLocation(this.f26912e0, "position");
                            this.f26916g0 = GLES20.glGetAttribLocation(this.f26912e0, "inputTexCoord");
                            this.f26918h0 = GLES20.glGetUniformLocation(this.f26912e0, "sourceImage");
                            this.f26920i0 = GLES20.glGetUniformLocation(this.f26912e0, "inputImageTexture2");
                            this.f26922j0 = GLES20.glGetUniformLocation(this.f26912e0, "excludeSize");
                            this.f26924k0 = GLES20.glGetUniformLocation(this.f26912e0, "excludePoint");
                            this.f26926l0 = GLES20.glGetUniformLocation(this.f26912e0, "excludeBlurSize");
                            this.f26928m0 = GLES20.glGetUniformLocation(this.f26912e0, "aspectRatio");
                        }
                        int K11 = m12870K(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
                        int K12 = m12870K(35632, "precision highp float;varying vec2 texCoord;uniform sampler2D sourceImage;vec3 rgb_to_hsv(vec3 c) {vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);float d = q.x - min(q.w, q.y);float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}void main() {vec4 texel = texture2D(sourceImage, texCoord);gl_FragColor = vec4(rgb_to_hsv(texel.rgb), texel.a);}");
                        if (K11 == 0 || K12 == 0) {
                            m12844o();
                            return false;
                        }
                        int glCreateProgram6 = GLES20.glCreateProgram();
                        this.f26921j = glCreateProgram6;
                        GLES20.glAttachShader(glCreateProgram6, K11);
                        GLES20.glAttachShader(this.f26921j, K12);
                        GLES20.glBindAttribLocation(this.f26921j, 0, "position");
                        GLES20.glBindAttribLocation(this.f26921j, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f26921j);
                        int[] iArr7 = new int[1];
                        GLES20.glGetProgramiv(this.f26921j, 35714, iArr7, 0);
                        if (iArr7[0] == 0) {
                            GLES20.glDeleteProgram(this.f26921j);
                            this.f26921j = 0;
                        } else {
                            this.f26923k = GLES20.glGetAttribLocation(this.f26921j, "position");
                            this.f26925l = GLES20.glGetAttribLocation(this.f26921j, "inputTexCoord");
                            this.f26927m = GLES20.glGetUniformLocation(this.f26921j, "sourceImage");
                        }
                        int K13 = m12870K(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
                        int K14 = m12870K(35632, "precision highp float;varying vec2 texCoord;uniform sampler2D sourceImage;uniform sampler2D inputImageTexture2;uniform float intensity;float enhance(float value) {const vec2 offset = vec2(0.001953125, 0.03125);value = value + offset.x;vec2 coord = (clamp(texCoord, 0.125, 1.0 - 0.125001) - 0.125) * 4.0;vec2 frac = fract(coord);coord = floor(coord);float p00 = float(coord.y * 4.0 + coord.x) * 0.0625 + offset.y;float p01 = float(coord.y * 4.0 + coord.x + 1.0) * 0.0625 + offset.y;float p10 = float((coord.y + 1.0) * 4.0 + coord.x) * 0.0625 + offset.y;float p11 = float((coord.y + 1.0) * 4.0 + coord.x + 1.0) * 0.0625 + offset.y;vec3 c00 = texture2D(inputImageTexture2, vec2(value, p00)).rgb;vec3 c01 = texture2D(inputImageTexture2, vec2(value, p01)).rgb;vec3 c10 = texture2D(inputImageTexture2, vec2(value, p10)).rgb;vec3 c11 = texture2D(inputImageTexture2, vec2(value, p11)).rgb;float c1 = ((c00.r - c00.g) / (c00.b - c00.g));float c2 = ((c01.r - c01.g) / (c01.b - c01.g));float c3 = ((c10.r - c10.g) / (c10.b - c10.g));float c4 = ((c11.r - c11.g) / (c11.b - c11.g));float c1_2 = mix(c1, c2, frac.x);float c3_4 = mix(c3, c4, frac.x);return mix(c1_2, c3_4, frac.y);}vec3 hsv_to_rgb(vec3 c) {vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);}void main() {vec4 texel = texture2D(sourceImage, texCoord);vec4 hsv = texel;hsv.y = min(1.0, hsv.y * 1.2);hsv.z = min(1.0, enhance(hsv.z) * 1.1);gl_FragColor = vec4(hsv_to_rgb(mix(texel.xyz, hsv.xyz, intensity)), texel.w);}");
                        if (K13 == 0 || K14 == 0) {
                            m12844o();
                            return false;
                        }
                        int glCreateProgram7 = GLES20.glCreateProgram();
                        this.f26929n = glCreateProgram7;
                        GLES20.glAttachShader(glCreateProgram7, K13);
                        GLES20.glAttachShader(this.f26929n, K14);
                        GLES20.glBindAttribLocation(this.f26929n, 0, "position");
                        GLES20.glBindAttribLocation(this.f26929n, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f26929n);
                        int[] iArr8 = new int[1];
                        GLES20.glGetProgramiv(this.f26929n, 35714, iArr8, 0);
                        if (iArr8[0] == 0) {
                            GLES20.glDeleteProgram(this.f26929n);
                            this.f26929n = 0;
                        } else {
                            this.f26931o = GLES20.glGetAttribLocation(this.f26929n, "position");
                            this.f26933p = GLES20.glGetAttribLocation(this.f26929n, "inputTexCoord");
                            this.f26935q = GLES20.glGetUniformLocation(this.f26929n, "sourceImage");
                            this.f26937r = GLES20.glGetUniformLocation(this.f26929n, "intensity");
                            this.f26939s = GLES20.glGetUniformLocation(this.f26929n, "inputImageTexture2");
                        }
                        int K15 = m12870K(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
                        int K16 = m12870K(35632, "varying highp vec2 texCoord;uniform sampler2D sourceImage;void main() {gl_FragColor = texture2D(sourceImage, texCoord);}");
                        if (K15 == 0 || K16 == 0) {
                            m12844o();
                            return false;
                        }
                        int glCreateProgram8 = GLES20.glCreateProgram();
                        this.f26944u0 = glCreateProgram8;
                        GLES20.glAttachShader(glCreateProgram8, K15);
                        GLES20.glAttachShader(this.f26944u0, K16);
                        GLES20.glBindAttribLocation(this.f26944u0, 0, "position");
                        GLES20.glBindAttribLocation(this.f26944u0, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f26944u0);
                        int[] iArr9 = new int[1];
                        GLES20.glGetProgramiv(this.f26944u0, 35714, iArr9, 0);
                        if (iArr9[0] == 0) {
                            GLES20.glDeleteProgram(this.f26944u0);
                            this.f26944u0 = 0;
                        } else {
                            this.f26946v0 = GLES20.glGetAttribLocation(this.f26944u0, "position");
                            this.f26948w0 = GLES20.glGetAttribLocation(this.f26944u0, "inputTexCoord");
                            this.f26950x0 = GLES20.glGetUniformLocation(this.f26944u0, "sourceImage");
                        }
                        Bitmap bitmap = this.f26919i;
                        if (bitmap != null) {
                            m12869L(bitmap);
                        }
                        return true;
                    }
                } else {
                    m12844o();
                    return false;
                }
            } else {
                Log.m14724e("eglConfig not initialized", new Object[0]);
                m12844o();
                return false;
            }
        }
    }

    public final int m12870K(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Log.m14724e(GLES20.glGetShaderInfoLog(glCreateShader), new Object[0]);
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public final void m12869L(Bitmap bitmap) {
        this.f26869E0 = bitmap.getWidth();
        this.f26871F0 = bitmap.getHeight();
        GLES20.glGenFramebuffers(3, this.f26861A0, 0);
        GLES20.glGenTextures(3, this.f26954z0, 0);
        GLES20.glBindTexture(3553, this.f26954z0[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, this.f26869E0, this.f26871F0, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, this.f26954z0[1]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, this.f26919i, 0);
        GLES20.glBindTexture(3553, this.f26954z0[2]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, this.f26869E0, this.f26871F0, 0, 6408, 5121, null);
    }

    public void m12868M() {
        C4384m mVar = this.f26887N0;
        mVar.m28052h(Message.obtain(mVar.m28055d(), 4), 0L);
    }

    public final void m12867N() {
        if (!this.f26889O0) {
            this.f26889O0 = true;
        }
    }

    public final void m12866O() {
        if (this.f26883L0 && !this.f26889O0) {
            if (!this.f26911e.equals(this.f26905b.eglGetCurrentContext()) || !this.f26913f.equals(this.f26905b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.f26905b;
                EGLDisplay eGLDisplay = this.f26907c;
                EGLSurface eGLSurface = this.f26913f;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f26911e)) {
                    Log.m14724e("eglMakeCurrent failed %s", C7389v0.m16585s0(this.f26905b.eglGetError()));
                    return;
                }
            }
            GLES20.glViewport(0, 0, this.f26869E0, this.f26871F0);
            m12847l();
            m12846m();
            m12848k();
            this.f26893Q0 = m12849j();
            GLES20.glViewport(0, 0, this.f26873G0, this.f26875H0);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClear(0);
            GLES20.glUseProgram(this.f26944u0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f26954z0[1 ^ (this.f26893Q0 ? 1 : 0)]);
            GLES20.glUniform1i(this.f26950x0, 0);
            GLES20.glEnableVertexAttribArray(this.f26948w0);
            GLES20.glVertexAttribPointer(this.f26948w0, 2, 5126, false, 8, (Buffer) this.f26879J0);
            GLES20.glEnableVertexAttribArray(this.f26946v0);
            GLES20.glVertexAttribPointer(this.f26946v0, 2, 5126, false, 8, (Buffer) this.f26877I0);
            GLES20.glDrawArrays(5, 0, 4);
            this.f26905b.eglSwapBuffers(this.f26907c, this.f26913f);
        }
    }

    public void m12865P(boolean z) {
        m12864Q(z, false);
    }

    public void m12864Q(boolean z, boolean z2) {
        C4384m mVar = this.f26887N0;
        mVar.m28052h(Message.obtain(mVar.m28055d(), 2, z ? 1 : 0, z2 ? 1 : 0), 0L);
    }

    public final void m12863R(boolean z, boolean z2) {
        if (!this.f26891P0) {
            this.f26891P0 = z;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (z2 || currentTimeMillis - this.f26915g > 30) {
            this.f26915g = currentTimeMillis;
            m12866O();
        }
    }

    public void m12862S(Bitmap bitmap, C8111a aVar) {
        C4384m mVar = this.f26887N0;
        mVar.m28052h(Message.obtain(mVar.m28055d(), 3, new Object[]{bitmap, aVar}), 0L);
    }

    public final void m12861T(Bitmap bitmap, C8111a aVar) {
        this.f26919i = bitmap;
        this.f26885M0 = aVar;
        m12869L(bitmap);
        this.f26889O0 = false;
        m12863R(true, true);
    }

    public void m12860U(int i, int i2) {
        this.f26873G0 = i;
        this.f26875H0 = i2;
    }

    public final boolean m12859V() {
        return true;
    }

    public void m12850i() {
        C4384m mVar = this.f26887N0;
        mVar.m28052h(Message.obtain(mVar.m28055d(), 0), 0L);
    }

    public final boolean m12849j() {
        int j = this.f26885M0.m13575j(14);
        if (this.f26867D0 || j == 0) {
            return false;
        }
        if (this.f26891P0) {
            GLES20.glUseProgram(this.f26888O);
            GLES20.glUniform1i(this.f26894R, 0);
            GLES20.glEnableVertexAttribArray(this.f26892Q);
            GLES20.glVertexAttribPointer(this.f26892Q, 2, 5126, false, 8, (Buffer) this.f26879J0);
            GLES20.glEnableVertexAttribArray(this.f26890P);
            GLES20.glVertexAttribPointer(this.f26890P, 2, 5126, false, 8, (Buffer) this.f26881K0);
            GLES20.glBindFramebuffer(36160, this.f26861A0[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f26954z0[0], 0);
            GLES20.glClear(0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f26954z0[1]);
            GLES20.glUniform1f(this.f26895S, 0.0f);
            GLES20.glUniform1f(this.f26896T, 1.0f / this.f26871F0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.f26861A0[2]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f26954z0[2], 0);
            GLES20.glClear(0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f26954z0[0]);
            GLES20.glUniform1f(this.f26895S, 1.0f / this.f26869E0);
            GLES20.glUniform1f(this.f26896T, 0.0f);
            GLES20.glDrawArrays(5, 0, 4);
            this.f26891P0 = false;
        }
        float e = this.f26885M0.m13580e();
        float d = this.f26885M0.m13581d();
        float f = this.f26885M0.m13579f();
        float g = this.f26885M0.m13578g();
        GLES20.glBindFramebuffer(36160, this.f26861A0[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f26954z0[0], 0);
        GLES20.glClear(0);
        if (j == 1) {
            GLES20.glUseProgram(this.f26912e0);
            GLES20.glUniform1i(this.f26918h0, 0);
            GLES20.glUniform1i(this.f26920i0, 1);
            GLES20.glUniform1f(this.f26922j0, e);
            GLES20.glUniform1f(this.f26926l0, d);
            GLES20.glUniform2f(this.f26924k0, f, g);
            GLES20.glUniform1f(this.f26928m0, this.f26871F0 / this.f26869E0);
            GLES20.glEnableVertexAttribArray(this.f26916g0);
            GLES20.glVertexAttribPointer(this.f26916g0, 2, 5126, false, 8, (Buffer) this.f26879J0);
            GLES20.glEnableVertexAttribArray(this.f26914f0);
            GLES20.glVertexAttribPointer(this.f26914f0, 2, 5126, false, 8, (Buffer) this.f26881K0);
        } else if (j == 2) {
            GLES20.glUseProgram(this.f26897U);
            GLES20.glUniform1i(this.f26900X, 0);
            GLES20.glUniform1i(this.f26901Y, 1);
            GLES20.glUniform1f(this.f26902Z, e);
            GLES20.glUniform1f(this.f26906b0, d);
            GLES20.glUniform1f(this.f26908c0, this.f26885M0.m13582c());
            GLES20.glUniform2f(this.f26904a0, f, g);
            GLES20.glUniform1f(this.f26910d0, this.f26871F0 / this.f26869E0);
            GLES20.glEnableVertexAttribArray(this.f26899W);
            GLES20.glVertexAttribPointer(this.f26899W, 2, 5126, false, 8, (Buffer) this.f26879J0);
            GLES20.glEnableVertexAttribArray(this.f26898V);
            GLES20.glVertexAttribPointer(this.f26898V, 2, 5126, false, 8, (Buffer) this.f26881K0);
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f26954z0[1]);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.f26954z0[2]);
        GLES20.glDrawArrays(5, 0, 4);
        return true;
    }

    public final void m12848k() {
        GLES20.glBindFramebuffer(36160, this.f26861A0[1]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f26954z0[1], 0);
        GLES20.glClear(0);
        GLES20.glUseProgram(this.f26941t);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f26954z0[0]);
        GLES20.glUniform1i(this.f26947w, 0);
        float f = 1.0f;
        if (this.f26867D0) {
            GLES20.glUniform1f(this.f26949x, 1.0f);
            GLES20.glUniform1f(this.f26951y, 1.0f);
            GLES20.glUniform1f(this.f26953z, 0.0f);
            GLES20.glUniform1f(this.f26860A, 1.0f);
            GLES20.glUniform1f(this.f26862B, 1.0f);
            GLES20.glUniform1f(this.f26864C, 0.0f);
            GLES20.glUniform1f(this.f26866D, 0.0f);
            GLES20.glUniform1f(this.f26868E, 0.0f);
            GLES20.glUniform1f(this.f26878J, 0.0f);
            GLES20.glUniform3f(this.f26886N, 0.0f, 0.0f, 0.0f);
            GLES20.glUniform1f(this.f26882L, 0.0f);
            GLES20.glUniform3f(this.f26884M, 0.0f, 0.0f, 0.0f);
            GLES20.glUniform1f(this.f26880K, 0.0f);
            GLES20.glUniform1f(this.f26876I, 1.0f);
        } else {
            int j = this.f26885M0.m13575j(13);
            int j2 = this.f26885M0.m13575j(11);
            int N = j != 0 ? C11524j.m228N(j) : 0;
            int N2 = j2 != 0 ? C11524j.m228N(j2) : 0;
            GLES20.glUniform1f(this.f26949x, m12879B());
            GLES20.glUniform1f(this.f26951y, m12834y());
            GLES20.glUniform1f(this.f26953z, m12838u());
            GLES20.glUniform1f(this.f26860A, m12841r());
            GLES20.glUniform1f(this.f26862B, m12880A());
            GLES20.glUniform1f(this.f26864C, m12873H());
            GLES20.glUniform1f(this.f26866D, m12874G());
            GLES20.glUniform1f(this.f26868E, m12835x());
            GLES20.glUniform1f(this.f26878J, m12836w());
            GLES20.glUniform3f(this.f26886N, ((N >> 16) & 255) / 255.0f, ((N >> 8) & 255) / 255.0f, (N & 255) / 255.0f);
            GLES20.glUniform1f(this.f26882L, m12877D());
            GLES20.glUniform3f(this.f26884M, ((N2 >> 16) & 255) / 255.0f, ((N2 >> 8) & 255) / 255.0f, (N2 & 255) / 255.0f);
            GLES20.glUniform1f(this.f26880K, m12876E());
            boolean V = m12859V();
            int i = this.f26876I;
            if (!V) {
                f = 0.0f;
            }
            GLES20.glUniform1f(i, f);
            if (!V) {
                m12845n();
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, this.f26863B0[0]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                GLES20.glTexImage2D(3553, 0, 6408, 200, 1, 0, 6408, 5121, m12840s());
                GLES20.glUniform1i(this.f26874H, 1);
            }
        }
        GLES20.glUniform1f(this.f26870F, this.f26869E0);
        GLES20.glUniform1f(this.f26872G, this.f26871F0);
        GLES20.glEnableVertexAttribArray(this.f26945v);
        GLES20.glVertexAttribPointer(this.f26945v, 2, 5126, false, 8, (Buffer) this.f26879J0);
        GLES20.glEnableVertexAttribArray(this.f26943u);
        GLES20.glVertexAttribPointer(this.f26943u, 2, 5126, false, 8, (Buffer) this.f26881K0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void m12847l() {
        if (!this.f26865C0) {
            GLES20.glBindFramebuffer(36160, this.f26861A0[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f26954z0[0], 0);
            GLES20.glClear(0);
            GLES20.glUseProgram(this.f26921j);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f26954z0[1]);
            GLES20.glUniform1i(this.f26927m, 0);
            GLES20.glEnableVertexAttribArray(this.f26925l);
            GLES20.glVertexAttribPointer(this.f26925l, 2, 5126, false, 8, (Buffer) this.f26879J0);
            GLES20.glEnableVertexAttribArray(this.f26923k);
            GLES20.glVertexAttribPointer(this.f26923k, 2, 5126, false, 8, (Buffer) this.f26877I0);
            GLES20.glDrawArrays(5, 0, 4);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f26869E0 * this.f26871F0 * 4);
            GLES20.glReadPixels(0, 0, this.f26869E0, this.f26871F0, 6408, 5121, allocateDirect);
            GLES20.glBindTexture(3553, this.f26952y0[0]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glTexImage2D(3553, 0, 6408, this.f26869E0, this.f26871F0, 0, 6408, 5121, allocateDirect);
            ByteBuffer byteBuffer = null;
            try {
                byteBuffer = ByteBuffer.allocateDirect(Log.TAG_VIDEO);
                C7888N.calcCDT(allocateDirect, this.f26869E0, this.f26871F0, byteBuffer);
            } catch (Throwable th) {
                Log.m14725e("Cannot allocate buffer for CDT", th, new Object[0]);
            }
            GLES20.glBindTexture(3553, this.f26952y0[1]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glTexImage2D(3553, 0, 6408, Log.TAG_CRASH, 16, 0, 6408, 5121, byteBuffer);
            this.f26865C0 = true;
        }
        GLES20.glBindFramebuffer(36160, this.f26861A0[1]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f26954z0[1], 0);
        GLES20.glClear(0);
        GLES20.glUseProgram(this.f26929n);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f26952y0[0]);
        GLES20.glUniform1i(this.f26935q, 0);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.f26952y0[1]);
        GLES20.glUniform1i(this.f26939s, 1);
        if (this.f26867D0) {
            GLES20.glUniform1f(this.f26937r, 0.0f);
        } else {
            GLES20.glUniform1f(this.f26937r, m12839t());
        }
        GLES20.glEnableVertexAttribArray(this.f26933p);
        GLES20.glVertexAttribPointer(this.f26933p, 2, 5126, false, 8, (Buffer) this.f26879J0);
        GLES20.glEnableVertexAttribArray(this.f26931o);
        GLES20.glVertexAttribPointer(this.f26931o, 2, 5126, false, 8, (Buffer) this.f26877I0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void m12846m() {
        GLES20.glBindFramebuffer(36160, this.f26861A0[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f26954z0[0], 0);
        GLES20.glClear(0);
        GLES20.glUseProgram(this.f26930n0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f26954z0[1]);
        GLES20.glUniform1i(this.f26942t0, 0);
        if (this.f26867D0) {
            GLES20.glUniform1f(this.f26932o0, 0.0f);
        } else {
            GLES20.glUniform1f(this.f26932o0, m12878C());
        }
        GLES20.glUniform1f(this.f26934p0, this.f26869E0);
        GLES20.glUniform1f(this.f26936q0, this.f26871F0);
        GLES20.glEnableVertexAttribArray(this.f26940s0);
        GLES20.glVertexAttribPointer(this.f26940s0, 2, 5126, false, 8, (Buffer) this.f26879J0);
        GLES20.glEnableVertexAttribArray(this.f26938r0);
        GLES20.glVertexAttribPointer(this.f26938r0, 2, 5126, false, 8, (Buffer) this.f26881K0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void m12845n() {
    }

    public final void m12844o() {
        if (this.f26913f != null) {
            EGL10 egl10 = this.f26905b;
            EGLDisplay eGLDisplay = this.f26907c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f26905b.eglDestroySurface(this.f26907c, this.f26913f);
            this.f26913f = null;
        }
        EGLContext eGLContext = this.f26911e;
        if (eGLContext != null) {
            this.f26905b.eglDestroyContext(this.f26907c, eGLContext);
            this.f26911e = null;
        }
        EGLDisplay eGLDisplay2 = this.f26907c;
        if (eGLDisplay2 != null) {
            this.f26905b.eglTerminate(eGLDisplay2);
            this.f26907c = null;
        }
    }

    public void m12843p(AbstractC8323a aVar) {
        C4384m mVar = this.f26887N0;
        mVar.m28052h(Message.obtain(mVar.m28055d(), 5, aVar), 0L);
    }

    public final void m12842q(final AbstractC8323a aVar) {
        GLES20.glBindFramebuffer(36160, this.f26861A0[1]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f26954z0[1 ^ (this.f26893Q0 ? 1 : 0)], 0);
        GLES20.glClear(0);
        final Bitmap z = m12833z();
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glClear(0);
        C1379j0.m37337d0(new Runnable() {
            @Override
            public final void run() {
                AbstractC8323a.this.mo12881a(z);
            }
        });
    }

    public final float m12841r() {
        return (m12837v(2) * 0.3f) + 1.0f;
    }

    public final ByteBuffer m12840s() {
        return null;
    }

    public final float m12839t() {
        return m12837v(0);
    }

    public final float m12838u() {
        return m12837v(1);
    }

    public final float m12837v(int i) {
        return this.f26885M0.m13577h(i);
    }

    public final float m12836w() {
        return this.f26885M0.m13577h(5);
    }

    public final float m12835x() {
        return m12837v(7) * 0.04f;
    }

    public final float m12834y() {
        return ((m12875F(12) * 0.75f) + 100.0f) / 100.0f;
    }

    public final Bitmap m12833z() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f26869E0 * this.f26871F0 * 4);
        GLES20.glReadPixels(0, 0, this.f26869E0, this.f26871F0, 6408, 5121, allocateDirect);
        Bitmap createBitmap = Bitmap.createBitmap(this.f26869E0, this.f26871F0, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        return createBitmap;
    }
}
