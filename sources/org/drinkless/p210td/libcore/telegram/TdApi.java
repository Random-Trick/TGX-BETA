package org.drinkless.p210td.libcore.telegram;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class TdApi {

    public static class AcceptCall extends Function {
        public static final int CONSTRUCTOR = -646618416;
        public int callId;
        public CallProtocol protocol;

        public AcceptCall() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AcceptCall(int i, CallProtocol callProtocol) {
            this.callId = i;
            this.protocol = callProtocol;
        }
    }

    public static class AcceptTermsOfService extends Function {
        public static final int CONSTRUCTOR = 2130576356;
        public String termsOfServiceId;

        public AcceptTermsOfService() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AcceptTermsOfService(String str) {
            this.termsOfServiceId = str;
        }
    }

    public static class AccountTtl extends Object {
        public static final int CONSTRUCTOR = 1324495492;
        public int days;

        public AccountTtl() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AccountTtl(int i) {
            this.days = i;
        }
    }

    public static class AddChatMember extends Function {
        public static final int CONSTRUCTOR = 499426810;
        public long chatId;
        public int forwardLimit;
        public long userId;

        public AddChatMember() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AddChatMember(long j, long j2, int i) {
            this.chatId = j;
            this.userId = j2;
            this.forwardLimit = i;
        }
    }

    public static class AddChatMembers extends Function {
        public static final int CONSTRUCTOR = -519951226;
        public long chatId;
        public long[] userIds;

        public AddChatMembers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AddChatMembers(long j, long[] jArr) {
            this.chatId = j;
            this.userIds = jArr;
        }
    }

    public static class AddChatToList extends Function {
        public static final int CONSTRUCTOR = -80523595;
        public long chatId;
        public ChatList chatList;

        public AddChatToList() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AddChatToList(long j, ChatList chatList) {
            this.chatId = j;
            this.chatList = chatList;
        }
    }

    public static class AddContact extends Function {
        public static final int CONSTRUCTOR = 1869640000;
        public Contact contact;
        public boolean sharePhoneNumber;

        public AddContact() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AddContact(Contact contact, boolean z) {
            this.contact = contact;
            this.sharePhoneNumber = z;
        }
    }

    public static class AddCustomServerLanguagePack extends Function {
        public static final int CONSTRUCTOR = 4492771;
        public String languagePackId;

        public AddCustomServerLanguagePack() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AddCustomServerLanguagePack(String str) {
            this.languagePackId = str;
        }
    }

    public static class AddFavoriteSticker extends Function {
        public static final int CONSTRUCTOR = 324504799;
        public InputFile sticker;

        public AddFavoriteSticker() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AddFavoriteSticker(InputFile inputFile) {
            this.sticker = inputFile;
        }
    }

    public static class AddFileToDownloads extends Function {
        public static final int CONSTRUCTOR = 867533751;
        public long chatId;
        public int fileId;
        public long messageId;
        public int priority;

        public AddFileToDownloads() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AddFileToDownloads(int i, long j, long j2, int i2) {
            this.fileId = i;
            this.chatId = j;
            this.messageId = j2;
            this.priority = i2;
        }
    }

    public static class AddLocalMessage extends Function {
        public static final int CONSTRUCTOR = -1998878725;
        public long chatId;
        public boolean disableNotification;
        public InputMessageContent inputMessageContent;
        public long replyToMessageId;
        public MessageSender senderId;

        public AddLocalMessage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AddLocalMessage(long j, MessageSender messageSender, long j2, boolean z, InputMessageContent inputMessageContent) {
            this.chatId = j;
            this.senderId = messageSender;
            this.replyToMessageId = j2;
            this.disableNotification = z;
            this.inputMessageContent = inputMessageContent;
        }
    }

    public static class AddLogMessage extends Function {
        public static final int CONSTRUCTOR = 1597427692;
        public String text;
        public int verbosityLevel;

        public AddLogMessage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AddLogMessage(int i, String str) {
            this.verbosityLevel = i;
            this.text = str;
        }
    }

    public static class AddNetworkStatistics extends Function {
        public static final int CONSTRUCTOR = 1264825305;
        public NetworkStatisticsEntry entry;

        public AddNetworkStatistics() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AddNetworkStatistics(NetworkStatisticsEntry networkStatisticsEntry) {
            this.entry = networkStatisticsEntry;
        }
    }

    public static class AddProxy extends Function {
        public static final int CONSTRUCTOR = 331529432;
        public boolean enable;
        public int port;
        public String server;
        public ProxyType type;

        public AddProxy() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AddProxy(String str, int i, boolean z, ProxyType proxyType) {
            this.server = str;
            this.port = i;
            this.enable = z;
            this.type = proxyType;
        }
    }

    public static class AddRecentSticker extends Function {
        public static final int CONSTRUCTOR = -1478109026;
        public boolean isAttached;
        public InputFile sticker;

        public AddRecentSticker() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AddRecentSticker(boolean z, InputFile inputFile) {
            this.isAttached = z;
            this.sticker = inputFile;
        }
    }

    public static class AddRecentlyFoundChat extends Function {
        public static final int CONSTRUCTOR = -1746396787;
        public long chatId;

        public AddRecentlyFoundChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AddRecentlyFoundChat(long j) {
            this.chatId = j;
        }
    }

    public static class AddSavedAnimation extends Function {
        public static final int CONSTRUCTOR = -1538525088;
        public InputFile animation;

        public AddSavedAnimation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AddSavedAnimation(InputFile inputFile) {
            this.animation = inputFile;
        }
    }

    public static class AddStickerToSet extends Function {
        public static final int CONSTRUCTOR = -1340783267;
        public String name;
        public InputSticker sticker;
        public long userId;

        public AddStickerToSet() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AddStickerToSet(long j, String str, InputSticker inputSticker) {
            this.userId = j;
            this.name = str;
            this.sticker = inputSticker;
        }
    }

    public static class AddedReaction extends Object {
        public static final int CONSTRUCTOR = 454543036;
        public String reaction;
        public MessageSender senderId;

        public AddedReaction() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AddedReaction(String str, MessageSender messageSender) {
            this.reaction = str;
            this.senderId = messageSender;
        }
    }

    public static class AddedReactions extends Object {
        public static final int CONSTRUCTOR = 226352304;
        public String nextOffset;
        public AddedReaction[] reactions;
        public int totalCount;

        public AddedReactions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AddedReactions(int i, AddedReaction[] addedReactionArr, String str) {
            this.totalCount = i;
            this.reactions = addedReactionArr;
            this.nextOffset = str;
        }
    }

    public static class Address extends Object {
        public static final int CONSTRUCTOR = -2043654342;
        public String city;
        public String countryCode;
        public String postalCode;
        public String state;
        public String streetLine1;
        public String streetLine2;

        public Address() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Address(String str, String str2, String str3, String str4, String str5, String str6) {
            this.countryCode = str;
            this.state = str2;
            this.city = str3;
            this.streetLine1 = str4;
            this.streetLine2 = str5;
            this.postalCode = str6;
        }
    }

    public static class AnimatedChatPhoto extends Object {
        public static final int CONSTRUCTOR = 191994926;
        public File file;
        public int length;
        public double mainFrameTimestamp;

        public AnimatedChatPhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AnimatedChatPhoto(int i, File file, double d) {
            this.length = i;
            this.file = file;
            this.mainFrameTimestamp = d;
        }
    }

    public static class AnimatedEmoji extends Object {
        public static final int CONSTRUCTOR = -1816658231;
        public int fitzpatrickType;
        public File sound;
        public Sticker sticker;

        public AnimatedEmoji() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AnimatedEmoji(Sticker sticker, int i, File file) {
            this.sticker = sticker;
            this.fitzpatrickType = i;
            this.sound = file;
        }
    }

    public static class Animation extends Object {
        public static final int CONSTRUCTOR = -872359106;
        public File animation;
        public int duration;
        public String fileName;
        public boolean hasStickers;
        public int height;
        public String mimeType;
        public Minithumbnail minithumbnail;
        public Thumbnail thumbnail;
        public int width;

        public Animation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Animation(int i, int i2, int i3, String str, String str2, boolean z, Minithumbnail minithumbnail, Thumbnail thumbnail, File file) {
            this.duration = i;
            this.width = i2;
            this.height = i3;
            this.fileName = str;
            this.mimeType = str2;
            this.hasStickers = z;
            this.minithumbnail = minithumbnail;
            this.thumbnail = thumbnail;
            this.animation = file;
        }
    }

    public static class Animations extends Object {
        public static final int CONSTRUCTOR = 344216945;
        public Animation[] animations;

        public Animations() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Animations(Animation[] animationArr) {
            this.animations = animationArr;
        }
    }

    public static class AnswerCallbackQuery extends Function {
        public static final int CONSTRUCTOR = -1153028490;
        public int cacheTime;
        public long callbackQueryId;
        public boolean showAlert;
        public String text;
        public String url;

        public AnswerCallbackQuery() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AnswerCallbackQuery(long j, String str, boolean z, String str2, int i) {
            this.callbackQueryId = j;
            this.text = str;
            this.showAlert = z;
            this.url = str2;
            this.cacheTime = i;
        }
    }

    public static class AnswerCustomQuery extends Function {
        public static final int CONSTRUCTOR = -1293603521;
        public long customQueryId;
        public String data;

        public AnswerCustomQuery() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AnswerCustomQuery(long j, String str) {
            this.customQueryId = j;
            this.data = str;
        }
    }

    public static class AnswerInlineQuery extends Function {
        public static final int CONSTRUCTOR = 485879477;
        public int cacheTime;
        public long inlineQueryId;
        public boolean isPersonal;
        public String nextOffset;
        public InputInlineQueryResult[] results;
        public String switchPmParameter;
        public String switchPmText;

        public AnswerInlineQuery() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AnswerInlineQuery(long j, boolean z, InputInlineQueryResult[] inputInlineQueryResultArr, int i, String str, String str2, String str3) {
            this.inlineQueryId = j;
            this.isPersonal = z;
            this.results = inputInlineQueryResultArr;
            this.cacheTime = i;
            this.nextOffset = str;
            this.switchPmText = str2;
            this.switchPmParameter = str3;
        }
    }

    public static class AnswerPreCheckoutQuery extends Function {
        public static final int CONSTRUCTOR = -1486789653;
        public String errorMessage;
        public long preCheckoutQueryId;

        public AnswerPreCheckoutQuery() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AnswerPreCheckoutQuery(long j, String str) {
            this.preCheckoutQueryId = j;
            this.errorMessage = str;
        }
    }

    public static class AnswerShippingQuery extends Function {
        public static final int CONSTRUCTOR = -434601324;
        public String errorMessage;
        public ShippingOption[] shippingOptions;
        public long shippingQueryId;

        public AnswerShippingQuery() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AnswerShippingQuery(long j, ShippingOption[] shippingOptionArr, String str) {
            this.shippingQueryId = j;
            this.shippingOptions = shippingOptionArr;
            this.errorMessage = str;
        }
    }

    public static class Audio extends Object {
        public static final int CONSTRUCTOR = -1179334690;
        public Minithumbnail albumCoverMinithumbnail;
        public Thumbnail albumCoverThumbnail;
        public File audio;
        public int duration;
        public String fileName;
        public String mimeType;
        public String performer;
        public String title;

        public Audio() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Audio(int i, String str, String str2, String str3, String str4, Minithumbnail minithumbnail, Thumbnail thumbnail, File file) {
            this.duration = i;
            this.title = str;
            this.performer = str2;
            this.fileName = str3;
            this.mimeType = str4;
            this.albumCoverMinithumbnail = minithumbnail;
            this.albumCoverThumbnail = thumbnail;
            this.audio = file;
        }
    }

    public static class AuthenticationCodeInfo extends Object {
        public static final int CONSTRUCTOR = -860345416;
        public AuthenticationCodeType nextType;
        public String phoneNumber;
        public int timeout;
        public AuthenticationCodeType type;

        public AuthenticationCodeInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AuthenticationCodeInfo(String str, AuthenticationCodeType authenticationCodeType, AuthenticationCodeType authenticationCodeType2, int i) {
            this.phoneNumber = str;
            this.type = authenticationCodeType;
            this.nextType = authenticationCodeType2;
            this.timeout = i;
        }
    }

    public static abstract class AuthenticationCodeType extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class AuthenticationCodeTypeCall extends AuthenticationCodeType {
        public static final int CONSTRUCTOR = 1636265063;
        public int length;

        public AuthenticationCodeTypeCall() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AuthenticationCodeTypeCall(int i) {
            this.length = i;
        }
    }

    public static class AuthenticationCodeTypeFlashCall extends AuthenticationCodeType {
        public static final int CONSTRUCTOR = 1395882402;
        public String pattern;

        public AuthenticationCodeTypeFlashCall() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AuthenticationCodeTypeFlashCall(String str) {
            this.pattern = str;
        }
    }

    public static class AuthenticationCodeTypeMissedCall extends AuthenticationCodeType {
        public static final int CONSTRUCTOR = 700123783;
        public int length;
        public String phoneNumberPrefix;

        public AuthenticationCodeTypeMissedCall() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AuthenticationCodeTypeMissedCall(String str, int i) {
            this.phoneNumberPrefix = str;
            this.length = i;
        }
    }

    public static class AuthenticationCodeTypeSms extends AuthenticationCodeType {
        public static final int CONSTRUCTOR = 962650760;
        public int length;

        public AuthenticationCodeTypeSms() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AuthenticationCodeTypeSms(int i) {
            this.length = i;
        }
    }

    public static class AuthenticationCodeTypeTelegramMessage extends AuthenticationCodeType {
        public static final int CONSTRUCTOR = 2079628074;
        public int length;

        public AuthenticationCodeTypeTelegramMessage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AuthenticationCodeTypeTelegramMessage(int i) {
            this.length = i;
        }
    }

    public static abstract class AuthorizationState extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class AuthorizationStateClosed extends AuthorizationState {
        public static final int CONSTRUCTOR = 1526047584;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AuthorizationStateClosing extends AuthorizationState {
        public static final int CONSTRUCTOR = 445855311;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AuthorizationStateLoggingOut extends AuthorizationState {
        public static final int CONSTRUCTOR = 154449270;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AuthorizationStateReady extends AuthorizationState {
        public static final int CONSTRUCTOR = -1834871737;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AuthorizationStateWaitCode extends AuthorizationState {
        public static final int CONSTRUCTOR = 52643073;
        public AuthenticationCodeInfo codeInfo;

        public AuthorizationStateWaitCode() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AuthorizationStateWaitCode(AuthenticationCodeInfo authenticationCodeInfo) {
            this.codeInfo = authenticationCodeInfo;
        }
    }

    public static class AuthorizationStateWaitEncryptionKey extends AuthorizationState {
        public static final int CONSTRUCTOR = 612103496;
        public boolean isEncrypted;

        public AuthorizationStateWaitEncryptionKey() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AuthorizationStateWaitEncryptionKey(boolean z) {
            this.isEncrypted = z;
        }
    }

    public static class AuthorizationStateWaitOtherDeviceConfirmation extends AuthorizationState {
        public static final int CONSTRUCTOR = 860166378;
        public String link;

        public AuthorizationStateWaitOtherDeviceConfirmation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AuthorizationStateWaitOtherDeviceConfirmation(String str) {
            this.link = str;
        }
    }

    public static class AuthorizationStateWaitPassword extends AuthorizationState {
        public static final int CONSTRUCTOR = 187548796;
        public boolean hasRecoveryEmailAddress;
        public String passwordHint;
        public String recoveryEmailAddressPattern;

        public AuthorizationStateWaitPassword() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AuthorizationStateWaitPassword(String str, boolean z, String str2) {
            this.passwordHint = str;
            this.hasRecoveryEmailAddress = z;
            this.recoveryEmailAddressPattern = str2;
        }
    }

    public static class AuthorizationStateWaitPhoneNumber extends AuthorizationState {
        public static final int CONSTRUCTOR = 306402531;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AuthorizationStateWaitRegistration extends AuthorizationState {
        public static final int CONSTRUCTOR = 550350511;
        public TermsOfService termsOfService;

        public AuthorizationStateWaitRegistration() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AuthorizationStateWaitRegistration(TermsOfService termsOfService) {
            this.termsOfService = termsOfService;
        }
    }

    public static class AuthorizationStateWaitTdlibParameters extends AuthorizationState {
        public static final int CONSTRUCTOR = 904720988;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AutoDownloadSettings extends Object {
        public static final int CONSTRUCTOR = -2144418333;
        public boolean isAutoDownloadEnabled;
        public int maxOtherFileSize;
        public int maxPhotoFileSize;
        public int maxVideoFileSize;
        public boolean preloadLargeVideos;
        public boolean preloadNextAudio;
        public boolean useLessDataForCalls;
        public int videoUploadBitrate;

        public AutoDownloadSettings() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AutoDownloadSettings(boolean z, int i, int i2, int i3, int i4, boolean z2, boolean z3, boolean z4) {
            this.isAutoDownloadEnabled = z;
            this.maxPhotoFileSize = i;
            this.maxVideoFileSize = i2;
            this.maxOtherFileSize = i3;
            this.videoUploadBitrate = i4;
            this.preloadLargeVideos = z2;
            this.preloadNextAudio = z3;
            this.useLessDataForCalls = z4;
        }
    }

    public static class AutoDownloadSettingsPresets extends Object {
        public static final int CONSTRUCTOR = -782099166;
        public AutoDownloadSettings high;
        public AutoDownloadSettings low;
        public AutoDownloadSettings medium;

        public AutoDownloadSettingsPresets() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AutoDownloadSettingsPresets(AutoDownloadSettings autoDownloadSettings, AutoDownloadSettings autoDownloadSettings2, AutoDownloadSettings autoDownloadSettings3) {
            this.low = autoDownloadSettings;
            this.medium = autoDownloadSettings2;
            this.high = autoDownloadSettings3;
        }
    }

    public static class AvailableReactions extends Object {
        public static final int CONSTRUCTOR = -656871316;
        public String[] reactions;

        public AvailableReactions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public AvailableReactions(String[] strArr) {
            this.reactions = strArr;
        }
    }

    public static class Background extends Object {
        public static final int CONSTRUCTOR = -429971172;
        public Document document;
        public long f25362id;
        public boolean isDark;
        public boolean isDefault;
        public String name;
        public BackgroundType type;

        public Background() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Background(long j, boolean z, boolean z2, String str, Document document, BackgroundType backgroundType) {
            this.f25362id = j;
            this.isDefault = z;
            this.isDark = z2;
            this.name = str;
            this.document = document;
            this.type = backgroundType;
        }
    }

    public static abstract class BackgroundFill extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class BackgroundFillFreeformGradient extends BackgroundFill {
        public static final int CONSTRUCTOR = -1145469255;
        public int[] colors;

        public BackgroundFillFreeformGradient() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public BackgroundFillFreeformGradient(int[] iArr) {
            this.colors = iArr;
        }
    }

    public static class BackgroundFillGradient extends BackgroundFill {
        public static final int CONSTRUCTOR = -1839206017;
        public int bottomColor;
        public int rotationAngle;
        public int topColor;

        public BackgroundFillGradient() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public BackgroundFillGradient(int i, int i2, int i3) {
            this.topColor = i;
            this.bottomColor = i2;
            this.rotationAngle = i3;
        }
    }

    public static class BackgroundFillSolid extends BackgroundFill {
        public static final int CONSTRUCTOR = 1010678813;
        public int color;

        public BackgroundFillSolid() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public BackgroundFillSolid(int i) {
            this.color = i;
        }
    }

    public static abstract class BackgroundType extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class BackgroundTypeFill extends BackgroundType {
        public static final int CONSTRUCTOR = 993008684;
        public BackgroundFill fill;

        public BackgroundTypeFill() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public BackgroundTypeFill(BackgroundFill backgroundFill) {
            this.fill = backgroundFill;
        }
    }

    public static class BackgroundTypePattern extends BackgroundType {
        public static final int CONSTRUCTOR = 1290213117;
        public BackgroundFill fill;
        public int intensity;
        public boolean isInverted;
        public boolean isMoving;

        public BackgroundTypePattern() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public BackgroundTypePattern(BackgroundFill backgroundFill, int i, boolean z, boolean z2) {
            this.fill = backgroundFill;
            this.intensity = i;
            this.isInverted = z;
            this.isMoving = z2;
        }
    }

    public static class BackgroundTypeWallpaper extends BackgroundType {
        public static final int CONSTRUCTOR = 1972128891;
        public boolean isBlurred;
        public boolean isMoving;

        public BackgroundTypeWallpaper() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public BackgroundTypeWallpaper(boolean z, boolean z2) {
            this.isBlurred = z;
            this.isMoving = z2;
        }
    }

    public static class Backgrounds extends Object {
        public static final int CONSTRUCTOR = 724728704;
        public Background[] backgrounds;

        public Backgrounds() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Backgrounds(Background[] backgroundArr) {
            this.backgrounds = backgroundArr;
        }
    }

    public static class BanChatMember extends Function {
        public static final int CONSTRUCTOR = -888111748;
        public int bannedUntilDate;
        public long chatId;
        public MessageSender memberId;
        public boolean revokeMessages;

        public BanChatMember() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public BanChatMember(long j, MessageSender messageSender, int i, boolean z) {
            this.chatId = j;
            this.memberId = messageSender;
            this.bannedUntilDate = i;
            this.revokeMessages = z;
        }
    }

    public static class BankCardActionOpenUrl extends Object {
        public static final int CONSTRUCTOR = -196454267;
        public String text;
        public String url;

        public BankCardActionOpenUrl() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public BankCardActionOpenUrl(String str, String str2) {
            this.text = str;
            this.url = str2;
        }
    }

    public static class BankCardInfo extends Object {
        public static final int CONSTRUCTOR = -2116647730;
        public BankCardActionOpenUrl[] actions;
        public String title;

        public BankCardInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public BankCardInfo(String str, BankCardActionOpenUrl[] bankCardActionOpenUrlArr) {
            this.title = str;
            this.actions = bankCardActionOpenUrlArr;
        }
    }

    public static class BasicGroup extends Object {
        public static final int CONSTRUCTOR = -194767217;
        public long f25363id;
        public boolean isActive;
        public int memberCount;
        public ChatMemberStatus status;
        public long upgradedToSupergroupId;

        public BasicGroup() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public BasicGroup(long j, int i, ChatMemberStatus chatMemberStatus, boolean z, long j2) {
            this.f25363id = j;
            this.memberCount = i;
            this.status = chatMemberStatus;
            this.isActive = z;
            this.upgradedToSupergroupId = j2;
        }
    }

    public static class BasicGroupFullInfo extends Object {
        public static final int CONSTRUCTOR = 2022233397;
        public BotCommands[] botCommands;
        public long creatorUserId;
        public String description;
        public ChatInviteLink inviteLink;
        public ChatMember[] members;
        public ChatPhoto photo;

        public BasicGroupFullInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public BasicGroupFullInfo(ChatPhoto chatPhoto, String str, long j, ChatMember[] chatMemberArr, ChatInviteLink chatInviteLink, BotCommands[] botCommandsArr) {
            this.photo = chatPhoto;
            this.description = str;
            this.creatorUserId = j;
            this.members = chatMemberArr;
            this.inviteLink = chatInviteLink;
            this.botCommands = botCommandsArr;
        }
    }

    public static class BlockMessageSenderFromReplies extends Function {
        public static final int CONSTRUCTOR = -1214384757;
        public boolean deleteAllMessages;
        public boolean deleteMessage;
        public long messageId;
        public boolean reportSpam;

        public BlockMessageSenderFromReplies() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public BlockMessageSenderFromReplies(long j, boolean z, boolean z2, boolean z3) {
            this.messageId = j;
            this.deleteMessage = z;
            this.deleteAllMessages = z2;
            this.reportSpam = z3;
        }
    }

    public static class BotCommand extends Object {
        public static final int CONSTRUCTOR = -1032140601;
        public String command;
        public String description;

        public BotCommand() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public BotCommand(String str, String str2) {
            this.command = str;
            this.description = str2;
        }
    }

    public static abstract class BotCommandScope extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class BotCommandScopeAllChatAdministrators extends BotCommandScope {
        public static final int CONSTRUCTOR = 1998329169;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BotCommandScopeAllGroupChats extends BotCommandScope {
        public static final int CONSTRUCTOR = -981088162;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BotCommandScopeAllPrivateChats extends BotCommandScope {
        public static final int CONSTRUCTOR = -344889543;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BotCommandScopeChat extends BotCommandScope {
        public static final int CONSTRUCTOR = -430234971;
        public long chatId;

        public BotCommandScopeChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public BotCommandScopeChat(long j) {
            this.chatId = j;
        }
    }

    public static class BotCommandScopeChatAdministrators extends BotCommandScope {
        public static final int CONSTRUCTOR = 1119682126;
        public long chatId;

        public BotCommandScopeChatAdministrators() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public BotCommandScopeChatAdministrators(long j) {
            this.chatId = j;
        }
    }

    public static class BotCommandScopeChatMember extends BotCommandScope {
        public static final int CONSTRUCTOR = -211380494;
        public long chatId;
        public long userId;

        public BotCommandScopeChatMember() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public BotCommandScopeChatMember(long j, long j2) {
            this.chatId = j;
            this.userId = j2;
        }
    }

    public static class BotCommandScopeDefault extends BotCommandScope {
        public static final int CONSTRUCTOR = 795652779;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BotCommands extends Object {
        public static final int CONSTRUCTOR = 1741364468;
        public long botUserId;
        public BotCommand[] commands;

        public BotCommands() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public BotCommands(long j, BotCommand[] botCommandArr) {
            this.botUserId = j;
            this.commands = botCommandArr;
        }
    }

    public static class Call extends Object {
        public static final int CONSTRUCTOR = 920360804;
        public int f25364id;
        public boolean isOutgoing;
        public boolean isVideo;
        public CallState state;
        public long userId;

        public Call() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Call(int i, long j, boolean z, boolean z2, CallState callState) {
            this.f25364id = i;
            this.userId = j;
            this.isOutgoing = z;
            this.isVideo = z2;
            this.state = callState;
        }
    }

    public static abstract class CallDiscardReason extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class CallDiscardReasonDeclined extends CallDiscardReason {
        public static final int CONSTRUCTOR = -1729926094;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallDiscardReasonDisconnected extends CallDiscardReason {
        public static final int CONSTRUCTOR = -1342872670;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallDiscardReasonEmpty extends CallDiscardReason {
        public static final int CONSTRUCTOR = -1258917949;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallDiscardReasonHungUp extends CallDiscardReason {
        public static final int CONSTRUCTOR = 438216166;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallDiscardReasonMissed extends CallDiscardReason {
        public static final int CONSTRUCTOR = 1680358012;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallId extends Object {
        public static final int CONSTRUCTOR = 65717769;
        public int f25365id;

        public CallId() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CallId(int i) {
            this.f25365id = i;
        }
    }

    public static abstract class CallProblem extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class CallProblemDistortedSpeech extends CallProblem {
        public static final int CONSTRUCTOR = 379960581;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallProblemDistortedVideo extends CallProblem {
        public static final int CONSTRUCTOR = 385245706;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallProblemDropped extends CallProblem {
        public static final int CONSTRUCTOR = -1207311487;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallProblemEcho extends CallProblem {
        public static final int CONSTRUCTOR = 801116548;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallProblemInterruptions extends CallProblem {
        public static final int CONSTRUCTOR = 1119493218;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallProblemNoise extends CallProblem {
        public static final int CONSTRUCTOR = 1053065359;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallProblemPixelatedVideo extends CallProblem {
        public static final int CONSTRUCTOR = 2115315411;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallProblemSilentLocal extends CallProblem {
        public static final int CONSTRUCTOR = 253652790;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallProblemSilentRemote extends CallProblem {
        public static final int CONSTRUCTOR = 573634714;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallProtocol extends Object {
        public static final int CONSTRUCTOR = -1075562897;
        public String[] libraryVersions;
        public int maxLayer;
        public int minLayer;
        public boolean udpP2p;
        public boolean udpReflector;

        public CallProtocol() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CallProtocol(boolean z, boolean z2, int i, int i2, String[] strArr) {
            this.udpP2p = z;
            this.udpReflector = z2;
            this.minLayer = i;
            this.maxLayer = i2;
            this.libraryVersions = strArr;
        }
    }

    public static class CallServer extends Object {
        public static final int CONSTRUCTOR = 1865932695;
        public long f25366id;
        public String ipAddress;
        public String ipv6Address;
        public int port;
        public CallServerType type;

        public CallServer() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CallServer(long j, String str, String str2, int i, CallServerType callServerType) {
            this.f25366id = j;
            this.ipAddress = str;
            this.ipv6Address = str2;
            this.port = i;
            this.type = callServerType;
        }
    }

    public static abstract class CallServerType extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class CallServerTypeTelegramReflector extends CallServerType {
        public static final int CONSTRUCTOR = -1507850700;
        public byte[] peerTag;

        public CallServerTypeTelegramReflector() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CallServerTypeTelegramReflector(byte[] bArr) {
            this.peerTag = bArr;
        }
    }

    public static class CallServerTypeWebrtc extends CallServerType {
        public static final int CONSTRUCTOR = 1250622821;
        public String password;
        public boolean supportsStun;
        public boolean supportsTurn;
        public String username;

        public CallServerTypeWebrtc() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CallServerTypeWebrtc(String str, String str2, boolean z, boolean z2) {
            this.username = str;
            this.password = str2;
            this.supportsTurn = z;
            this.supportsStun = z2;
        }
    }

    public static abstract class CallState extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class CallStateDiscarded extends CallState {
        public static final int CONSTRUCTOR = -190853167;
        public boolean needDebugInformation;
        public boolean needRating;
        public CallDiscardReason reason;

        public CallStateDiscarded() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CallStateDiscarded(CallDiscardReason callDiscardReason, boolean z, boolean z2) {
            this.reason = callDiscardReason;
            this.needRating = z;
            this.needDebugInformation = z2;
        }
    }

    public static class CallStateError extends CallState {
        public static final int CONSTRUCTOR = -975215467;
        public Error error;

        public CallStateError() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CallStateError(Error error) {
            this.error = error;
        }
    }

    public static class CallStateExchangingKeys extends CallState {
        public static final int CONSTRUCTOR = -1848149403;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallStateHangingUp extends CallState {
        public static final int CONSTRUCTOR = -2133790038;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallStatePending extends CallState {
        public static final int CONSTRUCTOR = 1073048620;
        public boolean isCreated;
        public boolean isReceived;

        public CallStatePending() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CallStatePending(boolean z, boolean z2) {
            this.isCreated = z;
            this.isReceived = z2;
        }
    }

    public static class CallStateReady extends CallState {
        public static final int CONSTRUCTOR = -2000107571;
        public boolean allowP2p;
        public String config;
        public String[] emojis;
        public byte[] encryptionKey;
        public CallProtocol protocol;
        public CallServer[] servers;

        public CallStateReady() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CallStateReady(CallProtocol callProtocol, CallServer[] callServerArr, String str, byte[] bArr, String[] strArr, boolean z) {
            this.protocol = callProtocol;
            this.servers = callServerArr;
            this.config = str;
            this.encryptionKey = bArr;
            this.emojis = strArr;
            this.allowP2p = z;
        }
    }

    public static class CallbackQueryAnswer extends Object {
        public static final int CONSTRUCTOR = 360867933;
        public boolean showAlert;
        public String text;
        public String url;

        public CallbackQueryAnswer() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CallbackQueryAnswer(String str, boolean z, String str2) {
            this.text = str;
            this.showAlert = z;
            this.url = str2;
        }
    }

    public static abstract class CallbackQueryPayload extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class CallbackQueryPayloadData extends CallbackQueryPayload {
        public static final int CONSTRUCTOR = -1977729946;
        public byte[] data;

        public CallbackQueryPayloadData() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CallbackQueryPayloadData(byte[] bArr) {
            this.data = bArr;
        }
    }

    public static class CallbackQueryPayloadDataWithPassword extends CallbackQueryPayload {
        public static final int CONSTRUCTOR = 1340266738;
        public byte[] data;
        public String password;

        public CallbackQueryPayloadDataWithPassword() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CallbackQueryPayloadDataWithPassword(String str, byte[] bArr) {
            this.password = str;
            this.data = bArr;
        }
    }

    public static class CallbackQueryPayloadGame extends CallbackQueryPayload {
        public static final int CONSTRUCTOR = 1303571512;
        public String gameShortName;

        public CallbackQueryPayloadGame() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CallbackQueryPayloadGame(String str) {
            this.gameShortName = str;
        }
    }

    public static class CanTransferOwnership extends Function {
        public static final int CONSTRUCTOR = 634602508;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static abstract class CanTransferOwnershipResult extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class CanTransferOwnershipResultOk extends CanTransferOwnershipResult {
        public static final int CONSTRUCTOR = -89881021;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CanTransferOwnershipResultPasswordNeeded extends CanTransferOwnershipResult {
        public static final int CONSTRUCTOR = 1548372703;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CanTransferOwnershipResultPasswordTooFresh extends CanTransferOwnershipResult {
        public static final int CONSTRUCTOR = 811440913;
        public int retryAfter;

        public CanTransferOwnershipResultPasswordTooFresh() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CanTransferOwnershipResultPasswordTooFresh(int i) {
            this.retryAfter = i;
        }
    }

    public static class CanTransferOwnershipResultSessionTooFresh extends CanTransferOwnershipResult {
        public static final int CONSTRUCTOR = 984664289;
        public int retryAfter;

        public CanTransferOwnershipResultSessionTooFresh() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CanTransferOwnershipResultSessionTooFresh(int i) {
            this.retryAfter = i;
        }
    }

    public static class CancelDownloadFile extends Function {
        public static final int CONSTRUCTOR = -1954524450;
        public int fileId;
        public boolean onlyIfPending;

        public CancelDownloadFile() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CancelDownloadFile(int i, boolean z) {
            this.fileId = i;
            this.onlyIfPending = z;
        }
    }

    public static class CancelPasswordReset extends Function {
        public static final int CONSTRUCTOR = 940733538;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CancelUploadFile extends Function {
        public static final int CONSTRUCTOR = 1623539600;
        public int fileId;

        public CancelUploadFile() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CancelUploadFile(int i) {
            this.fileId = i;
        }
    }

    public static class ChangeImportedContacts extends Function {
        public static final int CONSTRUCTOR = 1968207955;
        public Contact[] contacts;

        public ChangeImportedContacts() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChangeImportedContacts(Contact[] contactArr) {
            this.contacts = contactArr;
        }
    }

    public static class ChangePhoneNumber extends Function {
        public static final int CONSTRUCTOR = -124666973;
        public String phoneNumber;
        public PhoneNumberAuthenticationSettings settings;

        public ChangePhoneNumber() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChangePhoneNumber(String str, PhoneNumberAuthenticationSettings phoneNumberAuthenticationSettings) {
            this.phoneNumber = str;
            this.settings = phoneNumberAuthenticationSettings;
        }
    }

    public static class ChangeStickerSet extends Function {
        public static final int CONSTRUCTOR = 449357293;
        public boolean isArchived;
        public boolean isInstalled;
        public long setId;

        public ChangeStickerSet() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChangeStickerSet(long j, boolean z, boolean z2) {
            this.setId = j;
            this.isInstalled = z;
            this.isArchived = z2;
        }
    }

    public static class Chat extends Object {
        public static final int CONSTRUCTOR = -1601123095;
        public ChatActionBar actionBar;
        public String[] availableReactions;
        public boolean canBeDeletedForAllUsers;
        public boolean canBeDeletedOnlyForSelf;
        public boolean canBeReported;
        public String clientData;
        public boolean defaultDisableNotification;
        public DraftMessage draftMessage;
        public boolean hasProtectedContent;
        public boolean hasScheduledMessages;
        public long f25367id;
        public boolean isBlocked;
        public boolean isMarkedAsUnread;
        public Message lastMessage;
        public long lastReadInboxMessageId;
        public long lastReadOutboxMessageId;
        public MessageSender messageSenderId;
        public int messageTtl;
        public ChatNotificationSettings notificationSettings;
        public ChatJoinRequestsInfo pendingJoinRequests;
        public ChatPermissions permissions;
        public ChatPhotoInfo photo;
        public ChatPosition[] positions;
        public long replyMarkupMessageId;
        public String themeName;
        public String title;
        public ChatType type;
        public int unreadCount;
        public int unreadMentionCount;
        public int unreadReactionCount;
        public VideoChat videoChat;

        public Chat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Chat(long j, ChatType chatType, String str, ChatPhotoInfo chatPhotoInfo, ChatPermissions chatPermissions, Message message, ChatPosition[] chatPositionArr, MessageSender messageSender, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, long j2, long j3, int i2, int i3, ChatNotificationSettings chatNotificationSettings, String[] strArr, int i4, String str2, ChatActionBar chatActionBar, VideoChat videoChat, ChatJoinRequestsInfo chatJoinRequestsInfo, long j4, DraftMessage draftMessage, String str3) {
            this.f25367id = j;
            this.type = chatType;
            this.title = str;
            this.photo = chatPhotoInfo;
            this.permissions = chatPermissions;
            this.lastMessage = message;
            this.positions = chatPositionArr;
            this.messageSenderId = messageSender;
            this.hasProtectedContent = z;
            this.isMarkedAsUnread = z2;
            this.isBlocked = z3;
            this.hasScheduledMessages = z4;
            this.canBeDeletedOnlyForSelf = z5;
            this.canBeDeletedForAllUsers = z6;
            this.canBeReported = z7;
            this.defaultDisableNotification = z8;
            this.unreadCount = i;
            this.lastReadInboxMessageId = j2;
            this.lastReadOutboxMessageId = j3;
            this.unreadMentionCount = i2;
            this.unreadReactionCount = i3;
            this.notificationSettings = chatNotificationSettings;
            this.availableReactions = strArr;
            this.messageTtl = i4;
            this.themeName = str2;
            this.actionBar = chatActionBar;
            this.videoChat = videoChat;
            this.pendingJoinRequests = chatJoinRequestsInfo;
            this.replyMarkupMessageId = j4;
            this.draftMessage = draftMessage;
            this.clientData = str3;
        }
    }

    public static abstract class ChatAction extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static abstract class ChatActionBar extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class ChatActionBarAddContact extends ChatActionBar {
        public static final int CONSTRUCTOR = -733325295;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionBarInviteMembers extends ChatActionBar {
        public static final int CONSTRUCTOR = 1985313904;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionBarJoinRequest extends ChatActionBar {
        public static final int CONSTRUCTOR = 1037140744;
        public boolean isChannel;
        public int requestDate;
        public String title;

        public ChatActionBarJoinRequest() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatActionBarJoinRequest(String str, boolean z, int i) {
            this.title = str;
            this.isChannel = z;
            this.requestDate = i;
        }
    }

    public static class ChatActionBarReportAddBlock extends ChatActionBar {
        public static final int CONSTRUCTOR = -914150419;
        public boolean canUnarchive;
        public int distance;

        public ChatActionBarReportAddBlock() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatActionBarReportAddBlock(boolean z, int i) {
            this.canUnarchive = z;
            this.distance = i;
        }
    }

    public static class ChatActionBarReportSpam extends ChatActionBar {
        public static final int CONSTRUCTOR = -1312758246;
        public boolean canUnarchive;

        public ChatActionBarReportSpam() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatActionBarReportSpam(boolean z) {
            this.canUnarchive = z;
        }
    }

    public static class ChatActionBarReportUnrelatedLocation extends ChatActionBar {
        public static final int CONSTRUCTOR = 758175489;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionBarSharePhoneNumber extends ChatActionBar {
        public static final int CONSTRUCTOR = 35188697;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionCancel extends ChatAction {
        public static final int CONSTRUCTOR = 1160523958;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionChoosingContact extends ChatAction {
        public static final int CONSTRUCTOR = -1222507496;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionChoosingLocation extends ChatAction {
        public static final int CONSTRUCTOR = -2017893596;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionChoosingSticker extends ChatAction {
        public static final int CONSTRUCTOR = 372753697;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionRecordingVideo extends ChatAction {
        public static final int CONSTRUCTOR = 216553362;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionRecordingVideoNote extends ChatAction {
        public static final int CONSTRUCTOR = 16523393;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionRecordingVoiceNote extends ChatAction {
        public static final int CONSTRUCTOR = -808850058;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionStartPlayingGame extends ChatAction {
        public static final int CONSTRUCTOR = -865884164;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionTyping extends ChatAction {
        public static final int CONSTRUCTOR = 380122167;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionUploadingDocument extends ChatAction {
        public static final int CONSTRUCTOR = 167884362;
        public int progress;

        public ChatActionUploadingDocument() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatActionUploadingDocument(int i) {
            this.progress = i;
        }
    }

    public static class ChatActionUploadingPhoto extends ChatAction {
        public static final int CONSTRUCTOR = 654240583;
        public int progress;

        public ChatActionUploadingPhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatActionUploadingPhoto(int i) {
            this.progress = i;
        }
    }

    public static class ChatActionUploadingVideo extends ChatAction {
        public static final int CONSTRUCTOR = 1234185270;
        public int progress;

        public ChatActionUploadingVideo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatActionUploadingVideo(int i) {
            this.progress = i;
        }
    }

    public static class ChatActionUploadingVideoNote extends ChatAction {
        public static final int CONSTRUCTOR = 1172364918;
        public int progress;

        public ChatActionUploadingVideoNote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatActionUploadingVideoNote(int i) {
            this.progress = i;
        }
    }

    public static class ChatActionUploadingVoiceNote extends ChatAction {
        public static final int CONSTRUCTOR = -613643666;
        public int progress;

        public ChatActionUploadingVoiceNote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatActionUploadingVoiceNote(int i) {
            this.progress = i;
        }
    }

    public static class ChatActionWatchingAnimations extends ChatAction {
        public static final int CONSTRUCTOR = 2052990641;
        public String emoji;

        public ChatActionWatchingAnimations() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatActionWatchingAnimations(String str) {
            this.emoji = str;
        }
    }

    public static class ChatAdministrator extends Object {
        public static final int CONSTRUCTOR = 1920449836;
        public String customTitle;
        public boolean isOwner;
        public long userId;

        public ChatAdministrator() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatAdministrator(long j, String str, boolean z) {
            this.userId = j;
            this.customTitle = str;
            this.isOwner = z;
        }
    }

    public static class ChatAdministrators extends Object {
        public static final int CONSTRUCTOR = -2126186435;
        public ChatAdministrator[] administrators;

        public ChatAdministrators() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatAdministrators(ChatAdministrator[] chatAdministratorArr) {
            this.administrators = chatAdministratorArr;
        }
    }

    public static class ChatEvent extends Object {
        public static final int CONSTRUCTOR = -652102704;
        public ChatEventAction action;
        public int date;
        public long f25368id;
        public MessageSender memberId;

        public ChatEvent() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEvent(long j, int i, MessageSender messageSender, ChatEventAction chatEventAction) {
            this.f25368id = j;
            this.date = i;
            this.memberId = messageSender;
            this.action = chatEventAction;
        }
    }

    public static abstract class ChatEventAction extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class ChatEventAvailableReactionsChanged extends ChatEventAction {
        public static final int CONSTRUCTOR = 1401674536;
        public String[] newAvailableReactions;
        public String[] oldAvailableReactions;

        public ChatEventAvailableReactionsChanged() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventAvailableReactionsChanged(String[] strArr, String[] strArr2) {
            this.oldAvailableReactions = strArr;
            this.newAvailableReactions = strArr2;
        }
    }

    public static class ChatEventDescriptionChanged extends ChatEventAction {
        public static final int CONSTRUCTOR = 39112478;
        public String newDescription;
        public String oldDescription;

        public ChatEventDescriptionChanged() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventDescriptionChanged(String str, String str2) {
            this.oldDescription = str;
            this.newDescription = str2;
        }
    }

    public static class ChatEventHasProtectedContentToggled extends ChatEventAction {
        public static final int CONSTRUCTOR = -184270335;
        public boolean hasProtectedContent;

        public ChatEventHasProtectedContentToggled() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventHasProtectedContentToggled(boolean z) {
            this.hasProtectedContent = z;
        }
    }

    public static class ChatEventInviteLinkDeleted extends ChatEventAction {
        public static final int CONSTRUCTOR = -1394974361;
        public ChatInviteLink inviteLink;

        public ChatEventInviteLinkDeleted() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventInviteLinkDeleted(ChatInviteLink chatInviteLink) {
            this.inviteLink = chatInviteLink;
        }
    }

    public static class ChatEventInviteLinkEdited extends ChatEventAction {
        public static final int CONSTRUCTOR = -460190366;
        public ChatInviteLink newInviteLink;
        public ChatInviteLink oldInviteLink;

        public ChatEventInviteLinkEdited() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventInviteLinkEdited(ChatInviteLink chatInviteLink, ChatInviteLink chatInviteLink2) {
            this.oldInviteLink = chatInviteLink;
            this.newInviteLink = chatInviteLink2;
        }
    }

    public static class ChatEventInviteLinkRevoked extends ChatEventAction {
        public static final int CONSTRUCTOR = -1579417629;
        public ChatInviteLink inviteLink;

        public ChatEventInviteLinkRevoked() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventInviteLinkRevoked(ChatInviteLink chatInviteLink) {
            this.inviteLink = chatInviteLink;
        }
    }

    public static class ChatEventInvitesToggled extends ChatEventAction {
        public static final int CONSTRUCTOR = -62548373;
        public boolean canInviteUsers;

        public ChatEventInvitesToggled() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventInvitesToggled(boolean z) {
            this.canInviteUsers = z;
        }
    }

    public static class ChatEventIsAllHistoryAvailableToggled extends ChatEventAction {
        public static final int CONSTRUCTOR = -1599063019;
        public boolean isAllHistoryAvailable;

        public ChatEventIsAllHistoryAvailableToggled() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventIsAllHistoryAvailableToggled(boolean z) {
            this.isAllHistoryAvailable = z;
        }
    }

    public static class ChatEventLinkedChatChanged extends ChatEventAction {
        public static final int CONSTRUCTOR = 1797419439;
        public long newLinkedChatId;
        public long oldLinkedChatId;

        public ChatEventLinkedChatChanged() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventLinkedChatChanged(long j, long j2) {
            this.oldLinkedChatId = j;
            this.newLinkedChatId = j2;
        }
    }

    public static class ChatEventLocationChanged extends ChatEventAction {
        public static final int CONSTRUCTOR = -405930674;
        public ChatLocation newLocation;
        public ChatLocation oldLocation;

        public ChatEventLocationChanged() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventLocationChanged(ChatLocation chatLocation, ChatLocation chatLocation2) {
            this.oldLocation = chatLocation;
            this.newLocation = chatLocation2;
        }
    }

    public static class ChatEventLogFilters extends Object {
        public static final int CONSTRUCTOR = 1251197299;
        public boolean infoChanges;
        public boolean inviteLinkChanges;
        public boolean memberInvites;
        public boolean memberJoins;
        public boolean memberLeaves;
        public boolean memberPromotions;
        public boolean memberRestrictions;
        public boolean messageDeletions;
        public boolean messageEdits;
        public boolean messagePins;
        public boolean settingChanges;
        public boolean videoChatChanges;

        public ChatEventLogFilters() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventLogFilters(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
            this.messageEdits = z;
            this.messageDeletions = z2;
            this.messagePins = z3;
            this.memberJoins = z4;
            this.memberLeaves = z5;
            this.memberInvites = z6;
            this.memberPromotions = z7;
            this.memberRestrictions = z8;
            this.infoChanges = z9;
            this.settingChanges = z10;
            this.inviteLinkChanges = z11;
            this.videoChatChanges = z12;
        }
    }

    public static class ChatEventMemberInvited extends ChatEventAction {
        public static final int CONSTRUCTOR = 953663433;
        public ChatMemberStatus status;
        public long userId;

        public ChatEventMemberInvited() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventMemberInvited(long j, ChatMemberStatus chatMemberStatus) {
            this.userId = j;
            this.status = chatMemberStatus;
        }
    }

    public static class ChatEventMemberJoined extends ChatEventAction {
        public static final int CONSTRUCTOR = -235468508;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventMemberJoinedByInviteLink extends ChatEventAction {
        public static final int CONSTRUCTOR = -253307459;
        public ChatInviteLink inviteLink;

        public ChatEventMemberJoinedByInviteLink() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventMemberJoinedByInviteLink(ChatInviteLink chatInviteLink) {
            this.inviteLink = chatInviteLink;
        }
    }

    public static class ChatEventMemberJoinedByRequest extends ChatEventAction {
        public static final int CONSTRUCTOR = -1647804865;
        public long approverUserId;
        public ChatInviteLink inviteLink;

        public ChatEventMemberJoinedByRequest() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventMemberJoinedByRequest(long j, ChatInviteLink chatInviteLink) {
            this.approverUserId = j;
            this.inviteLink = chatInviteLink;
        }
    }

    public static class ChatEventMemberLeft extends ChatEventAction {
        public static final int CONSTRUCTOR = -948420593;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventMemberPromoted extends ChatEventAction {
        public static final int CONSTRUCTOR = 525297761;
        public ChatMemberStatus newStatus;
        public ChatMemberStatus oldStatus;
        public long userId;

        public ChatEventMemberPromoted() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventMemberPromoted(long j, ChatMemberStatus chatMemberStatus, ChatMemberStatus chatMemberStatus2) {
            this.userId = j;
            this.oldStatus = chatMemberStatus;
            this.newStatus = chatMemberStatus2;
        }
    }

    public static class ChatEventMemberRestricted extends ChatEventAction {
        public static final int CONSTRUCTOR = 1603608069;
        public MessageSender memberId;
        public ChatMemberStatus newStatus;
        public ChatMemberStatus oldStatus;

        public ChatEventMemberRestricted() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventMemberRestricted(MessageSender messageSender, ChatMemberStatus chatMemberStatus, ChatMemberStatus chatMemberStatus2) {
            this.memberId = messageSender;
            this.oldStatus = chatMemberStatus;
            this.newStatus = chatMemberStatus2;
        }
    }

    public static class ChatEventMessageDeleted extends ChatEventAction {
        public static final int CONSTRUCTOR = -892974601;
        public Message message;

        public ChatEventMessageDeleted() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventMessageDeleted(Message message) {
            this.message = message;
        }
    }

    public static class ChatEventMessageEdited extends ChatEventAction {
        public static final int CONSTRUCTOR = -430967304;
        public Message newMessage;
        public Message oldMessage;

        public ChatEventMessageEdited() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventMessageEdited(Message message, Message message2) {
            this.oldMessage = message;
            this.newMessage = message2;
        }
    }

    public static class ChatEventMessagePinned extends ChatEventAction {
        public static final int CONSTRUCTOR = 438742298;
        public Message message;

        public ChatEventMessagePinned() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventMessagePinned(Message message) {
            this.message = message;
        }
    }

    public static class ChatEventMessageTtlChanged extends ChatEventAction {
        public static final int CONSTRUCTOR = 776386995;
        public int newMessageTtl;
        public int oldMessageTtl;

        public ChatEventMessageTtlChanged() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventMessageTtlChanged(int i, int i2) {
            this.oldMessageTtl = i;
            this.newMessageTtl = i2;
        }
    }

    public static class ChatEventMessageUnpinned extends ChatEventAction {
        public static final int CONSTRUCTOR = -376161513;
        public Message message;

        public ChatEventMessageUnpinned() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventMessageUnpinned(Message message) {
            this.message = message;
        }
    }

    public static class ChatEventPermissionsChanged extends ChatEventAction {
        public static final int CONSTRUCTOR = -1311557720;
        public ChatPermissions newPermissions;
        public ChatPermissions oldPermissions;

        public ChatEventPermissionsChanged() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventPermissionsChanged(ChatPermissions chatPermissions, ChatPermissions chatPermissions2) {
            this.oldPermissions = chatPermissions;
            this.newPermissions = chatPermissions2;
        }
    }

    public static class ChatEventPhotoChanged extends ChatEventAction {
        public static final int CONSTRUCTOR = -811572541;
        public ChatPhoto newPhoto;
        public ChatPhoto oldPhoto;

        public ChatEventPhotoChanged() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventPhotoChanged(ChatPhoto chatPhoto, ChatPhoto chatPhoto2) {
            this.oldPhoto = chatPhoto;
            this.newPhoto = chatPhoto2;
        }
    }

    public static class ChatEventPollStopped extends ChatEventAction {
        public static final int CONSTRUCTOR = 2009893861;
        public Message message;

        public ChatEventPollStopped() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventPollStopped(Message message) {
            this.message = message;
        }
    }

    public static class ChatEventSignMessagesToggled extends ChatEventAction {
        public static final int CONSTRUCTOR = -1313265634;
        public boolean signMessages;

        public ChatEventSignMessagesToggled() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventSignMessagesToggled(boolean z) {
            this.signMessages = z;
        }
    }

    public static class ChatEventSlowModeDelayChanged extends ChatEventAction {
        public static final int CONSTRUCTOR = -1653195765;
        public int newSlowModeDelay;
        public int oldSlowModeDelay;

        public ChatEventSlowModeDelayChanged() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventSlowModeDelayChanged(int i, int i2) {
            this.oldSlowModeDelay = i;
            this.newSlowModeDelay = i2;
        }
    }

    public static class ChatEventStickerSetChanged extends ChatEventAction {
        public static final int CONSTRUCTOR = -1243130481;
        public long newStickerSetId;
        public long oldStickerSetId;

        public ChatEventStickerSetChanged() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventStickerSetChanged(long j, long j2) {
            this.oldStickerSetId = j;
            this.newStickerSetId = j2;
        }
    }

    public static class ChatEventTitleChanged extends ChatEventAction {
        public static final int CONSTRUCTOR = 1134103250;
        public String newTitle;
        public String oldTitle;

        public ChatEventTitleChanged() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventTitleChanged(String str, String str2) {
            this.oldTitle = str;
            this.newTitle = str2;
        }
    }

    public static class ChatEventUsernameChanged extends ChatEventAction {
        public static final int CONSTRUCTOR = 1728558443;
        public String newUsername;
        public String oldUsername;

        public ChatEventUsernameChanged() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventUsernameChanged(String str, String str2) {
            this.oldUsername = str;
            this.newUsername = str2;
        }
    }

    public static class ChatEventVideoChatCreated extends ChatEventAction {
        public static final int CONSTRUCTOR = 1822853755;
        public int groupCallId;

        public ChatEventVideoChatCreated() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventVideoChatCreated(int i) {
            this.groupCallId = i;
        }
    }

    public static class ChatEventVideoChatEnded extends ChatEventAction {
        public static final int CONSTRUCTOR = 1630039112;
        public int groupCallId;

        public ChatEventVideoChatEnded() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventVideoChatEnded(int i) {
            this.groupCallId = i;
        }
    }

    public static class ChatEventVideoChatMuteNewParticipantsToggled extends ChatEventAction {
        public static final int CONSTRUCTOR = -126547970;
        public boolean muteNewParticipants;

        public ChatEventVideoChatMuteNewParticipantsToggled() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventVideoChatMuteNewParticipantsToggled(boolean z) {
            this.muteNewParticipants = z;
        }
    }

    public static class ChatEventVideoChatParticipantIsMutedToggled extends ChatEventAction {
        public static final int CONSTRUCTOR = 521165047;
        public boolean isMuted;
        public MessageSender participantId;

        public ChatEventVideoChatParticipantIsMutedToggled() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventVideoChatParticipantIsMutedToggled(MessageSender messageSender, boolean z) {
            this.participantId = messageSender;
            this.isMuted = z;
        }
    }

    public static class ChatEventVideoChatParticipantVolumeLevelChanged extends ChatEventAction {
        public static final int CONSTRUCTOR = 1131385534;
        public MessageSender participantId;
        public int volumeLevel;

        public ChatEventVideoChatParticipantVolumeLevelChanged() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEventVideoChatParticipantVolumeLevelChanged(MessageSender messageSender, int i) {
            this.participantId = messageSender;
            this.volumeLevel = i;
        }
    }

    public static class ChatEvents extends Object {
        public static final int CONSTRUCTOR = -585329664;
        public ChatEvent[] events;

        public ChatEvents() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatEvents(ChatEvent[] chatEventArr) {
            this.events = chatEventArr;
        }
    }

    public static class ChatFilter extends Object {
        public static final int CONSTRUCTOR = -664815123;
        public boolean excludeArchived;
        public boolean excludeMuted;
        public boolean excludeRead;
        public long[] excludedChatIds;
        public String iconName;
        public boolean includeBots;
        public boolean includeChannels;
        public boolean includeContacts;
        public boolean includeGroups;
        public boolean includeNonContacts;
        public long[] includedChatIds;
        public long[] pinnedChatIds;
        public String title;

        public ChatFilter() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatFilter(String str, String str2, long[] jArr, long[] jArr2, long[] jArr3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
            this.title = str;
            this.iconName = str2;
            this.pinnedChatIds = jArr;
            this.includedChatIds = jArr2;
            this.excludedChatIds = jArr3;
            this.excludeMuted = z;
            this.excludeRead = z2;
            this.excludeArchived = z3;
            this.includeContacts = z4;
            this.includeNonContacts = z5;
            this.includeBots = z6;
            this.includeGroups = z7;
            this.includeChannels = z8;
        }
    }

    public static class ChatFilterInfo extends Object {
        public static final int CONSTRUCTOR = -943721165;
        public String iconName;
        public int f25369id;
        public String title;

        public ChatFilterInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatFilterInfo(int i, String str, String str2) {
            this.f25369id = i;
            this.title = str;
            this.iconName = str2;
        }
    }

    public static class ChatInviteLink extends Object {
        public static final int CONSTRUCTOR = -205812476;
        public boolean createsJoinRequest;
        public long creatorUserId;
        public int date;
        public int editDate;
        public int expirationDate;
        public String inviteLink;
        public boolean isPrimary;
        public boolean isRevoked;
        public int memberCount;
        public int memberLimit;
        public String name;
        public int pendingJoinRequestCount;

        public ChatInviteLink() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatInviteLink(String str, String str2, long j, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3) {
            this.inviteLink = str;
            this.name = str2;
            this.creatorUserId = j;
            this.date = i;
            this.editDate = i2;
            this.expirationDate = i3;
            this.memberLimit = i4;
            this.memberCount = i5;
            this.pendingJoinRequestCount = i6;
            this.createsJoinRequest = z;
            this.isPrimary = z2;
            this.isRevoked = z3;
        }
    }

    public static class ChatInviteLinkCount extends Object {
        public static final int CONSTRUCTOR = -1021999210;
        public int inviteLinkCount;
        public int revokedInviteLinkCount;
        public long userId;

        public ChatInviteLinkCount() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatInviteLinkCount(long j, int i, int i2) {
            this.userId = j;
            this.inviteLinkCount = i;
            this.revokedInviteLinkCount = i2;
        }
    }

    public static class ChatInviteLinkCounts extends Object {
        public static final int CONSTRUCTOR = 920326637;
        public ChatInviteLinkCount[] inviteLinkCounts;

        public ChatInviteLinkCounts() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatInviteLinkCounts(ChatInviteLinkCount[] chatInviteLinkCountArr) {
            this.inviteLinkCounts = chatInviteLinkCountArr;
        }
    }

    public static class ChatInviteLinkInfo extends Object {
        public static final int CONSTRUCTOR = 546234276;
        public int accessibleFor;
        public long chatId;
        public boolean createsJoinRequest;
        public String description;
        public boolean isPublic;
        public int memberCount;
        public long[] memberUserIds;
        public ChatPhotoInfo photo;
        public String title;
        public ChatType type;

        public ChatInviteLinkInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatInviteLinkInfo(long j, int i, ChatType chatType, String str, ChatPhotoInfo chatPhotoInfo, String str2, int i2, long[] jArr, boolean z, boolean z2) {
            this.chatId = j;
            this.accessibleFor = i;
            this.type = chatType;
            this.title = str;
            this.photo = chatPhotoInfo;
            this.description = str2;
            this.memberCount = i2;
            this.memberUserIds = jArr;
            this.createsJoinRequest = z;
            this.isPublic = z2;
        }
    }

    public static class ChatInviteLinkMember extends Object {
        public static final int CONSTRUCTOR = -1409060582;
        public long approverUserId;
        public int joinedChatDate;
        public long userId;

        public ChatInviteLinkMember() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatInviteLinkMember(long j, int i, long j2) {
            this.userId = j;
            this.joinedChatDate = i;
            this.approverUserId = j2;
        }
    }

    public static class ChatInviteLinkMembers extends Object {
        public static final int CONSTRUCTOR = 315635051;
        public ChatInviteLinkMember[] members;
        public int totalCount;

        public ChatInviteLinkMembers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatInviteLinkMembers(int i, ChatInviteLinkMember[] chatInviteLinkMemberArr) {
            this.totalCount = i;
            this.members = chatInviteLinkMemberArr;
        }
    }

    public static class ChatInviteLinks extends Object {
        public static final int CONSTRUCTOR = 112891427;
        public ChatInviteLink[] inviteLinks;
        public int totalCount;

        public ChatInviteLinks() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatInviteLinks(int i, ChatInviteLink[] chatInviteLinkArr) {
            this.totalCount = i;
            this.inviteLinks = chatInviteLinkArr;
        }
    }

    public static class ChatJoinRequest extends Object {
        public static final int CONSTRUCTOR = 59341416;
        public String bio;
        public int date;
        public long userId;

        public ChatJoinRequest() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatJoinRequest(long j, int i, String str) {
            this.userId = j;
            this.date = i;
            this.bio = str;
        }
    }

    public static class ChatJoinRequests extends Object {
        public static final int CONSTRUCTOR = 1291680519;
        public ChatJoinRequest[] requests;
        public int totalCount;

        public ChatJoinRequests() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatJoinRequests(int i, ChatJoinRequest[] chatJoinRequestArr) {
            this.totalCount = i;
            this.requests = chatJoinRequestArr;
        }
    }

    public static class ChatJoinRequestsInfo extends Object {
        public static final int CONSTRUCTOR = 888534463;
        public int totalCount;
        public long[] userIds;

        public ChatJoinRequestsInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatJoinRequestsInfo(int i, long[] jArr) {
            this.totalCount = i;
            this.userIds = jArr;
        }
    }

    public static abstract class ChatList extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class ChatListArchive extends ChatList {
        public static final int CONSTRUCTOR = 362770115;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatListFilter extends ChatList {
        public static final int CONSTRUCTOR = -2022707655;
        public int chatFilterId;

        public ChatListFilter() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatListFilter(int i) {
            this.chatFilterId = i;
        }
    }

    public static class ChatListMain extends ChatList {
        public static final int CONSTRUCTOR = -400991316;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatLists extends Object {
        public static final int CONSTRUCTOR = -258292771;
        public ChatList[] chatLists;

        public ChatLists() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatLists(ChatList[] chatListArr) {
            this.chatLists = chatListArr;
        }
    }

    public static class ChatLocation extends Object {
        public static final int CONSTRUCTOR = -1566863583;
        public String address;
        public Location location;

        public ChatLocation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatLocation(Location location, String str) {
            this.location = location;
            this.address = str;
        }
    }

    public static class ChatMember extends Object {
        public static final int CONSTRUCTOR = 1829953909;
        public long inviterUserId;
        public int joinedChatDate;
        public MessageSender memberId;
        public ChatMemberStatus status;

        public ChatMember() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatMember(MessageSender messageSender, long j, int i, ChatMemberStatus chatMemberStatus) {
            this.memberId = messageSender;
            this.inviterUserId = j;
            this.joinedChatDate = i;
            this.status = chatMemberStatus;
        }
    }

    public static abstract class ChatMemberStatus extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class ChatMemberStatusAdministrator extends ChatMemberStatus {
        public static final int CONSTRUCTOR = 82243562;
        public boolean canBeEdited;
        public boolean canChangeInfo;
        public boolean canDeleteMessages;
        public boolean canEditMessages;
        public boolean canInviteUsers;
        public boolean canManageChat;
        public boolean canManageVideoChats;
        public boolean canPinMessages;
        public boolean canPostMessages;
        public boolean canPromoteMembers;
        public boolean canRestrictMembers;
        public String customTitle;
        public boolean isAnonymous;

        public ChatMemberStatusAdministrator() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatMemberStatusAdministrator(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
            this.customTitle = str;
            this.canBeEdited = z;
            this.canManageChat = z2;
            this.canChangeInfo = z3;
            this.canPostMessages = z4;
            this.canEditMessages = z5;
            this.canDeleteMessages = z6;
            this.canInviteUsers = z7;
            this.canRestrictMembers = z8;
            this.canPinMessages = z9;
            this.canPromoteMembers = z10;
            this.canManageVideoChats = z11;
            this.isAnonymous = z12;
        }
    }

    public static class ChatMemberStatusBanned extends ChatMemberStatus {
        public static final int CONSTRUCTOR = -1653518666;
        public int bannedUntilDate;

        public ChatMemberStatusBanned() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatMemberStatusBanned(int i) {
            this.bannedUntilDate = i;
        }
    }

    public static class ChatMemberStatusCreator extends ChatMemberStatus {
        public static final int CONSTRUCTOR = -160019714;
        public String customTitle;
        public boolean isAnonymous;
        public boolean isMember;

        public ChatMemberStatusCreator() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatMemberStatusCreator(String str, boolean z, boolean z2) {
            this.customTitle = str;
            this.isAnonymous = z;
            this.isMember = z2;
        }
    }

    public static class ChatMemberStatusLeft extends ChatMemberStatus {
        public static final int CONSTRUCTOR = -5815259;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatMemberStatusMember extends ChatMemberStatus {
        public static final int CONSTRUCTOR = 844723285;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatMemberStatusRestricted extends ChatMemberStatus {
        public static final int CONSTRUCTOR = 1661432998;
        public boolean isMember;
        public ChatPermissions permissions;
        public int restrictedUntilDate;

        public ChatMemberStatusRestricted() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatMemberStatusRestricted(boolean z, int i, ChatPermissions chatPermissions) {
            this.isMember = z;
            this.restrictedUntilDate = i;
            this.permissions = chatPermissions;
        }
    }

    public static class ChatMembers extends Object {
        public static final int CONSTRUCTOR = -497558622;
        public ChatMember[] members;
        public int totalCount;

        public ChatMembers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatMembers(int i, ChatMember[] chatMemberArr) {
            this.totalCount = i;
            this.members = chatMemberArr;
        }
    }

    public static abstract class ChatMembersFilter extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class ChatMembersFilterAdministrators extends ChatMembersFilter {
        public static final int CONSTRUCTOR = -1266893796;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatMembersFilterBanned extends ChatMembersFilter {
        public static final int CONSTRUCTOR = -1863102648;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatMembersFilterBots extends ChatMembersFilter {
        public static final int CONSTRUCTOR = -1422567288;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatMembersFilterContacts extends ChatMembersFilter {
        public static final int CONSTRUCTOR = 1774485671;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatMembersFilterMembers extends ChatMembersFilter {
        public static final int CONSTRUCTOR = 670504342;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatMembersFilterMention extends ChatMembersFilter {
        public static final int CONSTRUCTOR = 856419831;
        public long messageThreadId;

        public ChatMembersFilterMention() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatMembersFilterMention(long j) {
            this.messageThreadId = j;
        }
    }

    public static class ChatMembersFilterRestricted extends ChatMembersFilter {
        public static final int CONSTRUCTOR = 1256282813;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatNearby extends Object {
        public static final int CONSTRUCTOR = 48120405;
        public long chatId;
        public int distance;

        public ChatNearby() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatNearby(long j, int i) {
            this.chatId = j;
            this.distance = i;
        }
    }

    public static class ChatNotificationSettings extends Object {
        public static final int CONSTRUCTOR = 1503183218;
        public boolean disableMentionNotifications;
        public boolean disablePinnedMessageNotifications;
        public int muteFor;
        public boolean showPreview;
        public String sound;
        public boolean useDefaultDisableMentionNotifications;
        public boolean useDefaultDisablePinnedMessageNotifications;
        public boolean useDefaultMuteFor;
        public boolean useDefaultShowPreview;
        public boolean useDefaultSound;

        public ChatNotificationSettings() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatNotificationSettings(boolean z, int i, boolean z2, String str, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
            this.useDefaultMuteFor = z;
            this.muteFor = i;
            this.useDefaultSound = z2;
            this.sound = str;
            this.useDefaultShowPreview = z3;
            this.showPreview = z4;
            this.useDefaultDisablePinnedMessageNotifications = z5;
            this.disablePinnedMessageNotifications = z6;
            this.useDefaultDisableMentionNotifications = z7;
            this.disableMentionNotifications = z8;
        }
    }

    public static class ChatPermissions extends Object {
        public static final int CONSTRUCTOR = 1584650463;
        public boolean canAddWebPagePreviews;
        public boolean canChangeInfo;
        public boolean canInviteUsers;
        public boolean canPinMessages;
        public boolean canSendMediaMessages;
        public boolean canSendMessages;
        public boolean canSendOtherMessages;
        public boolean canSendPolls;

        public ChatPermissions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatPermissions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
            this.canSendMessages = z;
            this.canSendMediaMessages = z2;
            this.canSendPolls = z3;
            this.canSendOtherMessages = z4;
            this.canAddWebPagePreviews = z5;
            this.canChangeInfo = z6;
            this.canInviteUsers = z7;
            this.canPinMessages = z8;
        }
    }

    public static class ChatPhoto extends Object {
        public static final int CONSTRUCTOR = -113003577;
        public int addedDate;
        public AnimatedChatPhoto animation;
        public long f25370id;
        public Minithumbnail minithumbnail;
        public PhotoSize[] sizes;

        public ChatPhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatPhoto(long j, int i, Minithumbnail minithumbnail, PhotoSize[] photoSizeArr, AnimatedChatPhoto animatedChatPhoto) {
            this.f25370id = j;
            this.addedDate = i;
            this.minithumbnail = minithumbnail;
            this.sizes = photoSizeArr;
            this.animation = animatedChatPhoto;
        }
    }

    public static class ChatPhotoInfo extends Object {
        public static final int CONSTRUCTOR = 167058358;
        public File big;
        public boolean hasAnimation;
        public Minithumbnail minithumbnail;
        public File small;

        public ChatPhotoInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatPhotoInfo(File file, File file2, Minithumbnail minithumbnail, boolean z) {
            this.small = file;
            this.big = file2;
            this.minithumbnail = minithumbnail;
            this.hasAnimation = z;
        }
    }

    public static class ChatPhotos extends Object {
        public static final int CONSTRUCTOR = -1510699180;
        public ChatPhoto[] photos;
        public int totalCount;

        public ChatPhotos() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatPhotos(int i, ChatPhoto[] chatPhotoArr) {
            this.totalCount = i;
            this.photos = chatPhotoArr;
        }
    }

    public static class ChatPosition extends Object {
        public static final int CONSTRUCTOR = -622557355;
        public boolean isPinned;
        public ChatList list;
        public long order;
        public ChatSource source;

        public ChatPosition() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatPosition(ChatList chatList, long j, boolean z, ChatSource chatSource) {
            this.list = chatList;
            this.order = j;
            this.isPinned = z;
            this.source = chatSource;
        }
    }

    public static abstract class ChatReportReason extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class ChatReportReasonChildAbuse extends ChatReportReason {
        public static final int CONSTRUCTOR = -1070686531;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatReportReasonCopyright extends ChatReportReason {
        public static final int CONSTRUCTOR = 986898080;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatReportReasonCustom extends ChatReportReason {
        public static final int CONSTRUCTOR = 1288925974;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatReportReasonFake extends ChatReportReason {
        public static final int CONSTRUCTOR = -1713230446;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatReportReasonIllegalDrugs extends ChatReportReason {
        public static final int CONSTRUCTOR = -844539307;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatReportReasonPersonalDetails extends ChatReportReason {
        public static final int CONSTRUCTOR = 1121159029;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatReportReasonPornography extends ChatReportReason {
        public static final int CONSTRUCTOR = 722614385;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatReportReasonSpam extends ChatReportReason {
        public static final int CONSTRUCTOR = -510848863;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatReportReasonUnrelatedLocation extends ChatReportReason {
        public static final int CONSTRUCTOR = 2632403;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatReportReasonViolence extends ChatReportReason {
        public static final int CONSTRUCTOR = -1330235395;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static abstract class ChatSource extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class ChatSourceMtprotoProxy extends ChatSource {
        public static final int CONSTRUCTOR = 394074115;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatSourcePublicServiceAnnouncement extends ChatSource {
        public static final int CONSTRUCTOR = -328571244;
        public String text;
        public String type;

        public ChatSourcePublicServiceAnnouncement() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatSourcePublicServiceAnnouncement(String str, String str2) {
            this.type = str;
            this.text = str2;
        }
    }

    public static abstract class ChatStatistics extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class ChatStatisticsAdministratorActionsInfo extends Object {
        public static final int CONSTRUCTOR = -406467202;
        public int bannedUserCount;
        public int deletedMessageCount;
        public int restrictedUserCount;
        public long userId;

        public ChatStatisticsAdministratorActionsInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatStatisticsAdministratorActionsInfo(long j, int i, int i2, int i3) {
            this.userId = j;
            this.deletedMessageCount = i;
            this.bannedUserCount = i2;
            this.restrictedUserCount = i3;
        }
    }

    public static class ChatStatisticsChannel extends ChatStatistics {
        public static final int CONSTRUCTOR = -825434183;
        public double enabledNotificationsPercentage;
        public StatisticalGraph instantViewInteractionGraph;
        public StatisticalGraph joinBySourceGraph;
        public StatisticalGraph joinGraph;
        public StatisticalGraph languageGraph;
        public StatisticalValue meanShareCount;
        public StatisticalValue meanViewCount;
        public StatisticalValue memberCount;
        public StatisticalGraph memberCountGraph;
        public StatisticalGraph messageInteractionGraph;
        public StatisticalGraph muteGraph;
        public DateRange period;
        public ChatStatisticsMessageInteractionInfo[] recentMessageInteractions;
        public StatisticalGraph viewCountByHourGraph;
        public StatisticalGraph viewCountBySourceGraph;

        public ChatStatisticsChannel() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatStatisticsChannel(DateRange dateRange, StatisticalValue statisticalValue, StatisticalValue statisticalValue2, StatisticalValue statisticalValue3, double d, StatisticalGraph statisticalGraph, StatisticalGraph statisticalGraph2, StatisticalGraph statisticalGraph3, StatisticalGraph statisticalGraph4, StatisticalGraph statisticalGraph5, StatisticalGraph statisticalGraph6, StatisticalGraph statisticalGraph7, StatisticalGraph statisticalGraph8, StatisticalGraph statisticalGraph9, ChatStatisticsMessageInteractionInfo[] chatStatisticsMessageInteractionInfoArr) {
            this.period = dateRange;
            this.memberCount = statisticalValue;
            this.meanViewCount = statisticalValue2;
            this.meanShareCount = statisticalValue3;
            this.enabledNotificationsPercentage = d;
            this.memberCountGraph = statisticalGraph;
            this.joinGraph = statisticalGraph2;
            this.muteGraph = statisticalGraph3;
            this.viewCountByHourGraph = statisticalGraph4;
            this.viewCountBySourceGraph = statisticalGraph5;
            this.joinBySourceGraph = statisticalGraph6;
            this.languageGraph = statisticalGraph7;
            this.messageInteractionGraph = statisticalGraph8;
            this.instantViewInteractionGraph = statisticalGraph9;
            this.recentMessageInteractions = chatStatisticsMessageInteractionInfoArr;
        }
    }

    public static class ChatStatisticsInviterInfo extends Object {
        public static final int CONSTRUCTOR = 629396619;
        public int addedMemberCount;
        public long userId;

        public ChatStatisticsInviterInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatStatisticsInviterInfo(long j, int i) {
            this.userId = j;
            this.addedMemberCount = i;
        }
    }

    public static class ChatStatisticsMessageInteractionInfo extends Object {
        public static final int CONSTRUCTOR = -765580756;
        public int forwardCount;
        public long messageId;
        public int viewCount;

        public ChatStatisticsMessageInteractionInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatStatisticsMessageInteractionInfo(long j, int i, int i2) {
            this.messageId = j;
            this.viewCount = i;
            this.forwardCount = i2;
        }
    }

    public static class ChatStatisticsMessageSenderInfo extends Object {
        public static final int CONSTRUCTOR = 1762295371;
        public int averageCharacterCount;
        public int sentMessageCount;
        public long userId;

        public ChatStatisticsMessageSenderInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatStatisticsMessageSenderInfo(long j, int i, int i2) {
            this.userId = j;
            this.sentMessageCount = i;
            this.averageCharacterCount = i2;
        }
    }

    public static class ChatStatisticsSupergroup extends ChatStatistics {
        public static final int CONSTRUCTOR = -17244633;
        public StatisticalGraph actionGraph;
        public StatisticalGraph dayGraph;
        public StatisticalGraph joinBySourceGraph;
        public StatisticalGraph joinGraph;
        public StatisticalGraph languageGraph;
        public StatisticalValue memberCount;
        public StatisticalGraph memberCountGraph;
        public StatisticalGraph messageContentGraph;
        public StatisticalValue messageCount;
        public DateRange period;
        public StatisticalValue senderCount;
        public ChatStatisticsAdministratorActionsInfo[] topAdministrators;
        public ChatStatisticsInviterInfo[] topInviters;
        public ChatStatisticsMessageSenderInfo[] topSenders;
        public StatisticalValue viewerCount;
        public StatisticalGraph weekGraph;

        public ChatStatisticsSupergroup() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatStatisticsSupergroup(DateRange dateRange, StatisticalValue statisticalValue, StatisticalValue statisticalValue2, StatisticalValue statisticalValue3, StatisticalValue statisticalValue4, StatisticalGraph statisticalGraph, StatisticalGraph statisticalGraph2, StatisticalGraph statisticalGraph3, StatisticalGraph statisticalGraph4, StatisticalGraph statisticalGraph5, StatisticalGraph statisticalGraph6, StatisticalGraph statisticalGraph7, StatisticalGraph statisticalGraph8, ChatStatisticsMessageSenderInfo[] chatStatisticsMessageSenderInfoArr, ChatStatisticsAdministratorActionsInfo[] chatStatisticsAdministratorActionsInfoArr, ChatStatisticsInviterInfo[] chatStatisticsInviterInfoArr) {
            this.period = dateRange;
            this.memberCount = statisticalValue;
            this.messageCount = statisticalValue2;
            this.viewerCount = statisticalValue3;
            this.senderCount = statisticalValue4;
            this.memberCountGraph = statisticalGraph;
            this.joinGraph = statisticalGraph2;
            this.joinBySourceGraph = statisticalGraph3;
            this.languageGraph = statisticalGraph4;
            this.messageContentGraph = statisticalGraph5;
            this.actionGraph = statisticalGraph6;
            this.dayGraph = statisticalGraph7;
            this.weekGraph = statisticalGraph8;
            this.topSenders = chatStatisticsMessageSenderInfoArr;
            this.topAdministrators = chatStatisticsAdministratorActionsInfoArr;
            this.topInviters = chatStatisticsInviterInfoArr;
        }
    }

    public static class ChatTheme extends Object {
        public static final int CONSTRUCTOR = -113218503;
        public ThemeSettings darkSettings;
        public ThemeSettings lightSettings;
        public String name;

        public ChatTheme() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatTheme(String str, ThemeSettings themeSettings, ThemeSettings themeSettings2) {
            this.name = str;
            this.lightSettings = themeSettings;
            this.darkSettings = themeSettings2;
        }
    }

    public static abstract class ChatType extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class ChatTypeBasicGroup extends ChatType {
        public static final int CONSTRUCTOR = 973884508;
        public long basicGroupId;

        public ChatTypeBasicGroup() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatTypeBasicGroup(long j) {
            this.basicGroupId = j;
        }
    }

    public static class ChatTypePrivate extends ChatType {
        public static final int CONSTRUCTOR = 1579049844;
        public long userId;

        public ChatTypePrivate() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatTypePrivate(long j) {
            this.userId = j;
        }
    }

    public static class ChatTypeSecret extends ChatType {
        public static final int CONSTRUCTOR = 862366513;
        public int secretChatId;
        public long userId;

        public ChatTypeSecret() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatTypeSecret(int i, long j) {
            this.secretChatId = i;
            this.userId = j;
        }
    }

    public static class ChatTypeSupergroup extends ChatType {
        public static final int CONSTRUCTOR = -1472570774;
        public boolean isChannel;
        public long supergroupId;

        public ChatTypeSupergroup() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatTypeSupergroup(long j, boolean z) {
            this.supergroupId = j;
            this.isChannel = z;
        }
    }

    public static class Chats extends Object {
        public static final int CONSTRUCTOR = 1809654812;
        public long[] chatIds;
        public int totalCount;

        public Chats() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Chats(int i, long[] jArr) {
            this.totalCount = i;
            this.chatIds = jArr;
        }
    }

    public static class ChatsNearby extends Object {
        public static final int CONSTRUCTOR = 187746081;
        public ChatNearby[] supergroupsNearby;
        public ChatNearby[] usersNearby;

        public ChatsNearby() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ChatsNearby(ChatNearby[] chatNearbyArr, ChatNearby[] chatNearbyArr2) {
            this.usersNearby = chatNearbyArr;
            this.supergroupsNearby = chatNearbyArr2;
        }
    }

    public static class CheckAuthenticationBotToken extends Function {
        public static final int CONSTRUCTOR = 639321206;
        public String token;

        public CheckAuthenticationBotToken() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CheckAuthenticationBotToken(String str) {
            this.token = str;
        }
    }

    public static class CheckAuthenticationCode extends Function {
        public static final int CONSTRUCTOR = -302103382;
        public String code;

        public CheckAuthenticationCode() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CheckAuthenticationCode(String str) {
            this.code = str;
        }
    }

    public static class CheckAuthenticationPassword extends Function {
        public static final int CONSTRUCTOR = -2025698400;
        public String password;

        public CheckAuthenticationPassword() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CheckAuthenticationPassword(String str) {
            this.password = str;
        }
    }

    public static class CheckAuthenticationPasswordRecoveryCode extends Function {
        public static final int CONSTRUCTOR = -603309083;
        public String recoveryCode;

        public CheckAuthenticationPasswordRecoveryCode() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CheckAuthenticationPasswordRecoveryCode(String str) {
            this.recoveryCode = str;
        }
    }

    public static class CheckChangePhoneNumberCode extends Function {
        public static final int CONSTRUCTOR = -1720278429;
        public String code;

        public CheckChangePhoneNumberCode() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CheckChangePhoneNumberCode(String str) {
            this.code = str;
        }
    }

    public static class CheckChatInviteLink extends Function {
        public static final int CONSTRUCTOR = -496940997;
        public String inviteLink;

        public CheckChatInviteLink() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CheckChatInviteLink(String str) {
            this.inviteLink = str;
        }
    }

    public static class CheckChatUsername extends Function {
        public static final int CONSTRUCTOR = -119119344;
        public long chatId;
        public String username;

        public CheckChatUsername() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CheckChatUsername(long j, String str) {
            this.chatId = j;
            this.username = str;
        }
    }

    public static abstract class CheckChatUsernameResult extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class CheckChatUsernameResultOk extends CheckChatUsernameResult {
        public static final int CONSTRUCTOR = -1498956964;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckChatUsernameResultPublicChatsTooMuch extends CheckChatUsernameResult {
        public static final int CONSTRUCTOR = 858247741;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckChatUsernameResultPublicGroupsUnavailable extends CheckChatUsernameResult {
        public static final int CONSTRUCTOR = -51833641;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckChatUsernameResultUsernameInvalid extends CheckChatUsernameResult {
        public static final int CONSTRUCTOR = -636979370;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckChatUsernameResultUsernameOccupied extends CheckChatUsernameResult {
        public static final int CONSTRUCTOR = 1320892201;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckCreatedPublicChatsLimit extends Function {
        public static final int CONSTRUCTOR = -445546591;
        public PublicChatType type;

        public CheckCreatedPublicChatsLimit() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CheckCreatedPublicChatsLimit(PublicChatType publicChatType) {
            this.type = publicChatType;
        }
    }

    public static class CheckDatabaseEncryptionKey extends Function {
        public static final int CONSTRUCTOR = 1018769307;
        public byte[] encryptionKey;

        public CheckDatabaseEncryptionKey() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CheckDatabaseEncryptionKey(byte[] bArr) {
            this.encryptionKey = bArr;
        }
    }

    public static class CheckEmailAddressVerificationCode extends Function {
        public static final int CONSTRUCTOR = -426386685;
        public String code;

        public CheckEmailAddressVerificationCode() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CheckEmailAddressVerificationCode(String str) {
            this.code = str;
        }
    }

    public static class CheckPasswordRecoveryCode extends Function {
        public static final int CONSTRUCTOR = -200794600;
        public String recoveryCode;

        public CheckPasswordRecoveryCode() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CheckPasswordRecoveryCode(String str) {
            this.recoveryCode = str;
        }
    }

    public static class CheckPhoneNumberConfirmationCode extends Function {
        public static final int CONSTRUCTOR = -1348060966;
        public String code;

        public CheckPhoneNumberConfirmationCode() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CheckPhoneNumberConfirmationCode(String str) {
            this.code = str;
        }
    }

    public static class CheckPhoneNumberVerificationCode extends Function {
        public static final int CONSTRUCTOR = 1497462718;
        public String code;

        public CheckPhoneNumberVerificationCode() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CheckPhoneNumberVerificationCode(String str) {
            this.code = str;
        }
    }

    public static class CheckRecoveryEmailAddressCode extends Function {
        public static final int CONSTRUCTOR = -1997039589;
        public String code;

        public CheckRecoveryEmailAddressCode() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CheckRecoveryEmailAddressCode(String str) {
            this.code = str;
        }
    }

    public static class CheckStickerSetName extends Function {
        public static final int CONSTRUCTOR = -1789392642;
        public String name;

        public CheckStickerSetName() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CheckStickerSetName(String str) {
            this.name = str;
        }
    }

    public static abstract class CheckStickerSetNameResult extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class CheckStickerSetNameResultNameInvalid extends CheckStickerSetNameResult {
        public static final int CONSTRUCTOR = 177992244;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckStickerSetNameResultNameOccupied extends CheckStickerSetNameResult {
        public static final int CONSTRUCTOR = 1012980872;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckStickerSetNameResultOk extends CheckStickerSetNameResult {
        public static final int CONSTRUCTOR = -1404308904;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CleanFileName extends Function {
        public static final int CONSTRUCTOR = 967964667;
        public String fileName;

        public CleanFileName() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CleanFileName(String str) {
            this.fileName = str;
        }
    }

    public static class ClearAllDraftMessages extends Function {
        public static final int CONSTRUCTOR = -46369573;
        public boolean excludeSecretChats;

        public ClearAllDraftMessages() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ClearAllDraftMessages(boolean z) {
            this.excludeSecretChats = z;
        }
    }

    public static class ClearImportedContacts extends Function {
        public static final int CONSTRUCTOR = 869503298;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ClearRecentStickers extends Function {
        public static final int CONSTRUCTOR = -321242684;
        public boolean isAttached;

        public ClearRecentStickers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ClearRecentStickers(boolean z) {
            this.isAttached = z;
        }
    }

    public static class ClearRecentlyFoundChats extends Function {
        public static final int CONSTRUCTOR = -285582542;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ClickAnimatedEmojiMessage extends Function {
        public static final int CONSTRUCTOR = 196179554;
        public long chatId;
        public long messageId;

        public ClickAnimatedEmojiMessage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ClickAnimatedEmojiMessage(long j, long j2) {
            this.chatId = j;
            this.messageId = j2;
        }
    }

    public static class Close extends Function {
        public static final int CONSTRUCTOR = -1187782273;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CloseChat extends Function {
        public static final int CONSTRUCTOR = 39749353;
        public long chatId;

        public CloseChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CloseChat(long j) {
            this.chatId = j;
        }
    }

    public static class CloseSecretChat extends Function {
        public static final int CONSTRUCTOR = -471006133;
        public int secretChatId;

        public CloseSecretChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CloseSecretChat(int i) {
            this.secretChatId = i;
        }
    }

    public static class ClosedVectorPath extends Object {
        public static final int CONSTRUCTOR = 589951657;
        public VectorPathCommand[] commands;

        public ClosedVectorPath() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ClosedVectorPath(VectorPathCommand[] vectorPathCommandArr) {
            this.commands = vectorPathCommandArr;
        }
    }

    public static class ConfirmQrCodeAuthentication extends Function {
        public static final int CONSTRUCTOR = -376199379;
        public String link;

        public ConfirmQrCodeAuthentication() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ConfirmQrCodeAuthentication(String str) {
            this.link = str;
        }
    }

    public static class ConnectedWebsite extends Object {
        public static final int CONSTRUCTOR = 844014445;
        public long botUserId;
        public String browser;
        public String domainName;
        public long f25371id;
        public String f25372ip;
        public int lastActiveDate;
        public String location;
        public int logInDate;
        public String platform;

        public ConnectedWebsite() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ConnectedWebsite(long j, String str, long j2, String str2, String str3, int i, int i2, String str4, String str5) {
            this.f25371id = j;
            this.domainName = str;
            this.botUserId = j2;
            this.browser = str2;
            this.platform = str3;
            this.logInDate = i;
            this.lastActiveDate = i2;
            this.f25372ip = str4;
            this.location = str5;
        }
    }

    public static class ConnectedWebsites extends Object {
        public static final int CONSTRUCTOR = -1727949694;
        public ConnectedWebsite[] websites;

        public ConnectedWebsites() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ConnectedWebsites(ConnectedWebsite[] connectedWebsiteArr) {
            this.websites = connectedWebsiteArr;
        }
    }

    public static abstract class ConnectionState extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class ConnectionStateConnecting extends ConnectionState {
        public static final int CONSTRUCTOR = -1298400670;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ConnectionStateConnectingToProxy extends ConnectionState {
        public static final int CONSTRUCTOR = -93187239;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ConnectionStateReady extends ConnectionState {
        public static final int CONSTRUCTOR = 48608492;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ConnectionStateUpdating extends ConnectionState {
        public static final int CONSTRUCTOR = -188104009;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ConnectionStateWaitingForNetwork extends ConnectionState {
        public static final int CONSTRUCTOR = 1695405912;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Contact extends Object {
        public static final int CONSTRUCTOR = -1993844876;
        public String firstName;
        public String lastName;
        public String phoneNumber;
        public long userId;
        public String vcard;

        public Contact() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Contact(String str, String str2, String str3, String str4, long j) {
            this.phoneNumber = str;
            this.firstName = str2;
            this.lastName = str3;
            this.vcard = str4;
            this.userId = j;
        }
    }

    public static class Count extends Object {
        public static final int CONSTRUCTOR = 1295577348;
        public int count;

        public Count() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Count(int i) {
            this.count = i;
        }
    }

    public static class Countries extends Object {
        public static final int CONSTRUCTOR = 1854211813;
        public CountryInfo[] countries;

        public Countries() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Countries(CountryInfo[] countryInfoArr) {
            this.countries = countryInfoArr;
        }
    }

    public static class CountryInfo extends Object {
        public static final int CONSTRUCTOR = 1617195722;
        public String[] callingCodes;
        public String countryCode;
        public String englishName;
        public boolean isHidden;
        public String name;

        public CountryInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CountryInfo(String str, String str2, String str3, boolean z, String[] strArr) {
            this.countryCode = str;
            this.name = str2;
            this.englishName = str3;
            this.isHidden = z;
            this.callingCodes = strArr;
        }
    }

    public static class CreateBasicGroupChat extends Function {
        public static final int CONSTRUCTOR = 1972024548;
        public long basicGroupId;
        public boolean force;

        public CreateBasicGroupChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CreateBasicGroupChat(long j, boolean z) {
            this.basicGroupId = j;
            this.force = z;
        }
    }

    public static class CreateCall extends Function {
        public static final int CONSTRUCTOR = -1104663024;
        public boolean isVideo;
        public CallProtocol protocol;
        public long userId;

        public CreateCall() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CreateCall(long j, CallProtocol callProtocol, boolean z) {
            this.userId = j;
            this.protocol = callProtocol;
            this.isVideo = z;
        }
    }

    public static class CreateChatFilter extends Function {
        public static final int CONSTRUCTOR = 49065126;
        public ChatFilter filter;

        public CreateChatFilter() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CreateChatFilter(ChatFilter chatFilter) {
            this.filter = chatFilter;
        }
    }

    public static class CreateChatInviteLink extends Function {
        public static final int CONSTRUCTOR = 287744833;
        public long chatId;
        public boolean createsJoinRequest;
        public int expirationDate;
        public int memberLimit;
        public String name;

        public CreateChatInviteLink() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CreateChatInviteLink(long j, String str, int i, int i2, boolean z) {
            this.chatId = j;
            this.name = str;
            this.expirationDate = i;
            this.memberLimit = i2;
            this.createsJoinRequest = z;
        }
    }

    public static class CreateNewBasicGroupChat extends Function {
        public static final int CONSTRUCTOR = -2104438789;
        public String title;
        public long[] userIds;

        public CreateNewBasicGroupChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CreateNewBasicGroupChat(long[] jArr, String str) {
            this.userIds = jArr;
            this.title = str;
        }
    }

    public static class CreateNewSecretChat extends Function {
        public static final int CONSTRUCTOR = -620682651;
        public long userId;

        public CreateNewSecretChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CreateNewSecretChat(long j) {
            this.userId = j;
        }
    }

    public static class CreateNewStickerSet extends Function {
        public static final int CONSTRUCTOR = -1682292738;
        public String name;
        public String source;
        public InputSticker[] stickers;
        public String title;
        public long userId;

        public CreateNewStickerSet() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CreateNewStickerSet(long j, String str, String str2, InputSticker[] inputStickerArr, String str3) {
            this.userId = j;
            this.title = str;
            this.name = str2;
            this.stickers = inputStickerArr;
            this.source = str3;
        }
    }

    public static class CreateNewSupergroupChat extends Function {
        public static final int CONSTRUCTOR = -830232895;
        public String description;
        public boolean forImport;
        public boolean isChannel;
        public ChatLocation location;
        public String title;

        public CreateNewSupergroupChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CreateNewSupergroupChat(String str, boolean z, String str2, ChatLocation chatLocation, boolean z2) {
            this.title = str;
            this.isChannel = z;
            this.description = str2;
            this.location = chatLocation;
            this.forImport = z2;
        }
    }

    public static class CreatePrivateChat extends Function {
        public static final int CONSTRUCTOR = -947758327;
        public boolean force;
        public long userId;

        public CreatePrivateChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CreatePrivateChat(long j, boolean z) {
            this.userId = j;
            this.force = z;
        }
    }

    public static class CreateSecretChat extends Function {
        public static final int CONSTRUCTOR = 1930285615;
        public int secretChatId;

        public CreateSecretChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CreateSecretChat(int i) {
            this.secretChatId = i;
        }
    }

    public static class CreateSupergroupChat extends Function {
        public static final int CONSTRUCTOR = 1187475691;
        public boolean force;
        public long supergroupId;

        public CreateSupergroupChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CreateSupergroupChat(long j, boolean z) {
            this.supergroupId = j;
            this.force = z;
        }
    }

    public static class CreateTemporaryPassword extends Function {
        public static final int CONSTRUCTOR = -1626509434;
        public String password;
        public int validFor;

        public CreateTemporaryPassword() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CreateTemporaryPassword(String str, int i) {
            this.password = str;
            this.validFor = i;
        }
    }

    public static class CreateVideoChat extends Function {
        public static final int CONSTRUCTOR = 2124715405;
        public long chatId;
        public boolean isRtmpStream;
        public int startDate;
        public String title;

        public CreateVideoChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CreateVideoChat(long j, String str, int i, boolean z) {
            this.chatId = j;
            this.title = str;
            this.startDate = i;
            this.isRtmpStream = z;
        }
    }

    public static class CustomRequestResult extends Object {
        public static final int CONSTRUCTOR = -2009960452;
        public String result;

        public CustomRequestResult() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public CustomRequestResult(String str) {
            this.result = str;
        }
    }

    public static class DatabaseStatistics extends Object {
        public static final int CONSTRUCTOR = -1123912880;
        public String statistics;

        public DatabaseStatistics() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DatabaseStatistics(String str) {
            this.statistics = str;
        }
    }

    public static class Date extends Object {
        public static final int CONSTRUCTOR = -277956960;
        public int day;
        public int month;
        public int year;

        public Date() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Date(int i, int i2, int i3) {
            this.day = i;
            this.month = i2;
            this.year = i3;
        }
    }

    public static class DateRange extends Object {
        public static final int CONSTRUCTOR = 1360333926;
        public int endDate;
        public int startDate;

        public DateRange() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DateRange(int i, int i2) {
            this.startDate = i;
            this.endDate = i2;
        }
    }

    public static class DatedFile extends Object {
        public static final int CONSTRUCTOR = -1840795491;
        public int date;
        public File file;

        public DatedFile() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DatedFile(File file, int i) {
            this.file = file;
            this.date = i;
        }
    }

    public static class DeepLinkInfo extends Object {
        public static final int CONSTRUCTOR = 1864081662;
        public boolean needUpdateApplication;
        public FormattedText text;

        public DeepLinkInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeepLinkInfo(FormattedText formattedText, boolean z) {
            this.text = formattedText;
            this.needUpdateApplication = z;
        }
    }

    public static class DeleteAccount extends Function {
        public static final int CONSTRUCTOR = -1203056508;
        public String reason;

        public DeleteAccount() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeleteAccount(String str) {
            this.reason = str;
        }
    }

    public static class DeleteAllCallMessages extends Function {
        public static final int CONSTRUCTOR = -1466445325;
        public boolean revoke;

        public DeleteAllCallMessages() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeleteAllCallMessages(boolean z) {
            this.revoke = z;
        }
    }

    public static class DeleteAllRevokedChatInviteLinks extends Function {
        public static final int CONSTRUCTOR = 1112020698;
        public long chatId;
        public long creatorUserId;

        public DeleteAllRevokedChatInviteLinks() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeleteAllRevokedChatInviteLinks(long j, long j2) {
            this.chatId = j;
            this.creatorUserId = j2;
        }
    }

    public static class DeleteChat extends Function {
        public static final int CONSTRUCTOR = -171253666;
        public long chatId;

        public DeleteChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeleteChat(long j) {
            this.chatId = j;
        }
    }

    public static class DeleteChatFilter extends Function {
        public static final int CONSTRUCTOR = -523220877;
        public int chatFilterId;

        public DeleteChatFilter() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeleteChatFilter(int i) {
            this.chatFilterId = i;
        }
    }

    public static class DeleteChatHistory extends Function {
        public static final int CONSTRUCTOR = -1472081761;
        public long chatId;
        public boolean removeFromChatList;
        public boolean revoke;

        public DeleteChatHistory() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeleteChatHistory(long j, boolean z, boolean z2) {
            this.chatId = j;
            this.removeFromChatList = z;
            this.revoke = z2;
        }
    }

    public static class DeleteChatMessagesByDate extends Function {
        public static final int CONSTRUCTOR = -1639653185;
        public long chatId;
        public int maxDate;
        public int minDate;
        public boolean revoke;

        public DeleteChatMessagesByDate() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeleteChatMessagesByDate(long j, int i, int i2, boolean z) {
            this.chatId = j;
            this.minDate = i;
            this.maxDate = i2;
            this.revoke = z;
        }
    }

    public static class DeleteChatMessagesBySender extends Function {
        public static final int CONSTRUCTOR = -1164235161;
        public long chatId;
        public MessageSender senderId;

        public DeleteChatMessagesBySender() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeleteChatMessagesBySender(long j, MessageSender messageSender) {
            this.chatId = j;
            this.senderId = messageSender;
        }
    }

    public static class DeleteChatReplyMarkup extends Function {
        public static final int CONSTRUCTOR = 100637531;
        public long chatId;
        public long messageId;

        public DeleteChatReplyMarkup() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeleteChatReplyMarkup(long j, long j2) {
            this.chatId = j;
            this.messageId = j2;
        }
    }

    public static class DeleteCommands extends Function {
        public static final int CONSTRUCTOR = 1002732586;
        public String languageCode;
        public BotCommandScope scope;

        public DeleteCommands() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeleteCommands(BotCommandScope botCommandScope, String str) {
            this.scope = botCommandScope;
            this.languageCode = str;
        }
    }

    public static class DeleteFile extends Function {
        public static final int CONSTRUCTOR = 1807653676;
        public int fileId;

        public DeleteFile() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeleteFile(int i) {
            this.fileId = i;
        }
    }

    public static class DeleteLanguagePack extends Function {
        public static final int CONSTRUCTOR = -2108761026;
        public String languagePackId;

        public DeleteLanguagePack() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeleteLanguagePack(String str) {
            this.languagePackId = str;
        }
    }

    public static class DeleteMessages extends Function {
        public static final int CONSTRUCTOR = 1130090173;
        public long chatId;
        public long[] messageIds;
        public boolean revoke;

        public DeleteMessages() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeleteMessages(long j, long[] jArr, boolean z) {
            this.chatId = j;
            this.messageIds = jArr;
            this.revoke = z;
        }
    }

    public static class DeletePassportElement extends Function {
        public static final int CONSTRUCTOR = -1719555468;
        public PassportElementType type;

        public DeletePassportElement() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeletePassportElement(PassportElementType passportElementType) {
            this.type = passportElementType;
        }
    }

    public static class DeleteProfilePhoto extends Function {
        public static final int CONSTRUCTOR = 1319794625;
        public long profilePhotoId;

        public DeleteProfilePhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeleteProfilePhoto(long j) {
            this.profilePhotoId = j;
        }
    }

    public static class DeleteRevokedChatInviteLink extends Function {
        public static final int CONSTRUCTOR = -1859711873;
        public long chatId;
        public String inviteLink;

        public DeleteRevokedChatInviteLink() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeleteRevokedChatInviteLink(long j, String str) {
            this.chatId = j;
            this.inviteLink = str;
        }
    }

    public static class DeleteSavedCredentials extends Function {
        public static final int CONSTRUCTOR = 826300114;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeleteSavedOrderInfo extends Function {
        public static final int CONSTRUCTOR = 1629058164;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Destroy extends Function {
        public static final int CONSTRUCTOR = 685331274;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static abstract class DeviceToken extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class DeviceTokenApplePush extends DeviceToken {
        public static final int CONSTRUCTOR = 387541955;
        public String deviceToken;
        public boolean isAppSandbox;

        public DeviceTokenApplePush() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeviceTokenApplePush(String str, boolean z) {
            this.deviceToken = str;
            this.isAppSandbox = z;
        }
    }

    public static class DeviceTokenApplePushVoIP extends DeviceToken {
        public static final int CONSTRUCTOR = 804275689;
        public String deviceToken;
        public boolean encrypt;
        public boolean isAppSandbox;

        public DeviceTokenApplePushVoIP() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeviceTokenApplePushVoIP(String str, boolean z, boolean z2) {
            this.deviceToken = str;
            this.isAppSandbox = z;
            this.encrypt = z2;
        }
    }

    public static class DeviceTokenBlackBerryPush extends DeviceToken {
        public static final int CONSTRUCTOR = 1559167234;
        public String token;

        public DeviceTokenBlackBerryPush() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeviceTokenBlackBerryPush(String str) {
            this.token = str;
        }
    }

    public static class DeviceTokenFirebaseCloudMessaging extends DeviceToken {
        public static final int CONSTRUCTOR = -797881849;
        public boolean encrypt;
        public String token;

        public DeviceTokenFirebaseCloudMessaging() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeviceTokenFirebaseCloudMessaging(String str, boolean z) {
            this.token = str;
            this.encrypt = z;
        }
    }

    public static class DeviceTokenMicrosoftPush extends DeviceToken {
        public static final int CONSTRUCTOR = 1224269900;
        public String channelUri;

        public DeviceTokenMicrosoftPush() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeviceTokenMicrosoftPush(String str) {
            this.channelUri = str;
        }
    }

    public static class DeviceTokenMicrosoftPushVoIP extends DeviceToken {
        public static final int CONSTRUCTOR = -785603759;
        public String channelUri;

        public DeviceTokenMicrosoftPushVoIP() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeviceTokenMicrosoftPushVoIP(String str) {
            this.channelUri = str;
        }
    }

    public static class DeviceTokenSimplePush extends DeviceToken {
        public static final int CONSTRUCTOR = 49584736;
        public String endpoint;

        public DeviceTokenSimplePush() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeviceTokenSimplePush(String str) {
            this.endpoint = str;
        }
    }

    public static class DeviceTokenTizenPush extends DeviceToken {
        public static final int CONSTRUCTOR = -1359947213;
        public String regId;

        public DeviceTokenTizenPush() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeviceTokenTizenPush(String str) {
            this.regId = str;
        }
    }

    public static class DeviceTokenUbuntuPush extends DeviceToken {
        public static final int CONSTRUCTOR = 1782320422;
        public String token;

        public DeviceTokenUbuntuPush() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeviceTokenUbuntuPush(String str) {
            this.token = str;
        }
    }

    public static class DeviceTokenWebPush extends DeviceToken {
        public static final int CONSTRUCTOR = -1694507273;
        public String authBase64url;
        public String endpoint;
        public String p256dhBase64url;

        public DeviceTokenWebPush() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeviceTokenWebPush(String str, String str2, String str3) {
            this.endpoint = str;
            this.p256dhBase64url = str2;
            this.authBase64url = str3;
        }
    }

    public static class DeviceTokenWindowsPush extends DeviceToken {
        public static final int CONSTRUCTOR = -1410514289;
        public String accessToken;

        public DeviceTokenWindowsPush() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DeviceTokenWindowsPush(String str) {
            this.accessToken = str;
        }
    }

    public static abstract class DiceStickers extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class DiceStickersRegular extends DiceStickers {
        public static final int CONSTRUCTOR = -740299570;
        public Sticker sticker;

        public DiceStickersRegular() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DiceStickersRegular(Sticker sticker) {
            this.sticker = sticker;
        }
    }

    public static class DiceStickersSlotMachine extends DiceStickers {
        public static final int CONSTRUCTOR = -375223124;
        public Sticker background;
        public Sticker centerReel;
        public Sticker leftReel;
        public Sticker lever;
        public Sticker rightReel;

        public DiceStickersSlotMachine() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DiceStickersSlotMachine(Sticker sticker, Sticker sticker2, Sticker sticker3, Sticker sticker4, Sticker sticker5) {
            this.background = sticker;
            this.lever = sticker2;
            this.leftReel = sticker3;
            this.centerReel = sticker4;
            this.rightReel = sticker5;
        }
    }

    public static class DisableProxy extends Function {
        public static final int CONSTRUCTOR = -2100095102;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DiscardCall extends Function {
        public static final int CONSTRUCTOR = -1784044162;
        public int callId;
        public long connectionId;
        public int duration;
        public boolean isDisconnected;
        public boolean isVideo;

        public DiscardCall() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DiscardCall(int i, boolean z, int i2, boolean z2, long j) {
            this.callId = i;
            this.isDisconnected = z;
            this.duration = i2;
            this.isVideo = z2;
            this.connectionId = j;
        }
    }

    public static class DisconnectAllWebsites extends Function {
        public static final int CONSTRUCTOR = -1082985981;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DisconnectWebsite extends Function {
        public static final int CONSTRUCTOR = -778767395;
        public long websiteId;

        public DisconnectWebsite() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DisconnectWebsite(long j) {
            this.websiteId = j;
        }
    }

    public static class Document extends Object {
        public static final int CONSTRUCTOR = -1357271080;
        public File document;
        public String fileName;
        public String mimeType;
        public Minithumbnail minithumbnail;
        public Thumbnail thumbnail;

        public Document() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Document(String str, String str2, Minithumbnail minithumbnail, Thumbnail thumbnail, File file) {
            this.fileName = str;
            this.mimeType = str2;
            this.minithumbnail = minithumbnail;
            this.thumbnail = thumbnail;
            this.document = file;
        }
    }

    public static class DownloadFile extends Function {
        public static final int CONSTRUCTOR = -1102026662;
        public int fileId;
        public int limit;
        public int offset;
        public int priority;
        public boolean synchronous;

        public DownloadFile() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DownloadFile(int i, int i2, int i3, int i4, boolean z) {
            this.fileId = i;
            this.priority = i2;
            this.offset = i3;
            this.limit = i4;
            this.synchronous = z;
        }
    }

    public static class DownloadedFileCounts extends Object {
        public static final int CONSTRUCTOR = -1973999550;
        public int activeCount;
        public int completedCount;
        public int pausedCount;

        public DownloadedFileCounts() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DownloadedFileCounts(int i, int i2, int i3) {
            this.activeCount = i;
            this.pausedCount = i2;
            this.completedCount = i3;
        }
    }

    public static class DraftMessage extends Object {
        public static final int CONSTRUCTOR = 1373050112;
        public int date;
        public InputMessageContent inputMessageText;
        public long replyToMessageId;

        public DraftMessage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public DraftMessage(long j, int i, InputMessageContent inputMessageContent) {
            this.replyToMessageId = j;
            this.date = i;
            this.inputMessageText = inputMessageContent;
        }
    }

    public static class EditChatFilter extends Function {
        public static final int CONSTRUCTOR = -1674793086;
        public int chatFilterId;
        public ChatFilter filter;

        public EditChatFilter() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public EditChatFilter(int i, ChatFilter chatFilter) {
            this.chatFilterId = i;
            this.filter = chatFilter;
        }
    }

    public static class EditChatInviteLink extends Function {
        public static final int CONSTRUCTOR = 1320303996;
        public long chatId;
        public boolean createsJoinRequest;
        public int expirationDate;
        public String inviteLink;
        public int memberLimit;
        public String name;

        public EditChatInviteLink() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public EditChatInviteLink(long j, String str, String str2, int i, int i2, boolean z) {
            this.chatId = j;
            this.inviteLink = str;
            this.name = str2;
            this.expirationDate = i;
            this.memberLimit = i2;
            this.createsJoinRequest = z;
        }
    }

    public static class EditCustomLanguagePackInfo extends Function {
        public static final int CONSTRUCTOR = 1320751257;
        public LanguagePackInfo info;

        public EditCustomLanguagePackInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public EditCustomLanguagePackInfo(LanguagePackInfo languagePackInfo) {
            this.info = languagePackInfo;
        }
    }

    public static class EditInlineMessageCaption extends Function {
        public static final int CONSTRUCTOR = -760985929;
        public FormattedText caption;
        public String inlineMessageId;
        public ReplyMarkup replyMarkup;

        public EditInlineMessageCaption() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public EditInlineMessageCaption(String str, ReplyMarkup replyMarkup, FormattedText formattedText) {
            this.inlineMessageId = str;
            this.replyMarkup = replyMarkup;
            this.caption = formattedText;
        }
    }

    public static class EditInlineMessageLiveLocation extends Function {
        public static final int CONSTRUCTOR = -156902912;
        public int heading;
        public String inlineMessageId;
        public Location location;
        public int proximityAlertRadius;
        public ReplyMarkup replyMarkup;

        public EditInlineMessageLiveLocation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public EditInlineMessageLiveLocation(String str, ReplyMarkup replyMarkup, Location location, int i, int i2) {
            this.inlineMessageId = str;
            this.replyMarkup = replyMarkup;
            this.location = location;
            this.heading = i;
            this.proximityAlertRadius = i2;
        }
    }

    public static class EditInlineMessageMedia extends Function {
        public static final int CONSTRUCTOR = 23553921;
        public String inlineMessageId;
        public InputMessageContent inputMessageContent;
        public ReplyMarkup replyMarkup;

        public EditInlineMessageMedia() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public EditInlineMessageMedia(String str, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.inlineMessageId = str;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }
    }

    public static class EditInlineMessageReplyMarkup extends Function {
        public static final int CONSTRUCTOR = -67565858;
        public String inlineMessageId;
        public ReplyMarkup replyMarkup;

        public EditInlineMessageReplyMarkup() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public EditInlineMessageReplyMarkup(String str, ReplyMarkup replyMarkup) {
            this.inlineMessageId = str;
            this.replyMarkup = replyMarkup;
        }
    }

    public static class EditInlineMessageText extends Function {
        public static final int CONSTRUCTOR = -855457307;
        public String inlineMessageId;
        public InputMessageContent inputMessageContent;
        public ReplyMarkup replyMarkup;

        public EditInlineMessageText() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public EditInlineMessageText(String str, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.inlineMessageId = str;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }
    }

    public static class EditMessageCaption extends Function {
        public static final int CONSTRUCTOR = 1154677038;
        public FormattedText caption;
        public long chatId;
        public long messageId;
        public ReplyMarkup replyMarkup;

        public EditMessageCaption() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public EditMessageCaption(long j, long j2, ReplyMarkup replyMarkup, FormattedText formattedText) {
            this.chatId = j;
            this.messageId = j2;
            this.replyMarkup = replyMarkup;
            this.caption = formattedText;
        }
    }

    public static class EditMessageLiveLocation extends Function {
        public static final int CONSTRUCTOR = -14047982;
        public long chatId;
        public int heading;
        public Location location;
        public long messageId;
        public int proximityAlertRadius;
        public ReplyMarkup replyMarkup;

        public EditMessageLiveLocation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public EditMessageLiveLocation(long j, long j2, ReplyMarkup replyMarkup, Location location, int i, int i2) {
            this.chatId = j;
            this.messageId = j2;
            this.replyMarkup = replyMarkup;
            this.location = location;
            this.heading = i;
            this.proximityAlertRadius = i2;
        }
    }

    public static class EditMessageMedia extends Function {
        public static final int CONSTRUCTOR = -1152678125;
        public long chatId;
        public InputMessageContent inputMessageContent;
        public long messageId;
        public ReplyMarkup replyMarkup;

        public EditMessageMedia() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public EditMessageMedia(long j, long j2, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.chatId = j;
            this.messageId = j2;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }
    }

    public static class EditMessageReplyMarkup extends Function {
        public static final int CONSTRUCTOR = 332127881;
        public long chatId;
        public long messageId;
        public ReplyMarkup replyMarkup;

        public EditMessageReplyMarkup() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public EditMessageReplyMarkup(long j, long j2, ReplyMarkup replyMarkup) {
            this.chatId = j;
            this.messageId = j2;
            this.replyMarkup = replyMarkup;
        }
    }

    public static class EditMessageSchedulingState extends Function {
        public static final int CONSTRUCTOR = -1372976192;
        public long chatId;
        public long messageId;
        public MessageSchedulingState schedulingState;

        public EditMessageSchedulingState() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public EditMessageSchedulingState(long j, long j2, MessageSchedulingState messageSchedulingState) {
            this.chatId = j;
            this.messageId = j2;
            this.schedulingState = messageSchedulingState;
        }
    }

    public static class EditMessageText extends Function {
        public static final int CONSTRUCTOR = 196272567;
        public long chatId;
        public InputMessageContent inputMessageContent;
        public long messageId;
        public ReplyMarkup replyMarkup;

        public EditMessageText() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public EditMessageText(long j, long j2, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.chatId = j;
            this.messageId = j2;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }
    }

    public static class EditProxy extends Function {
        public static final int CONSTRUCTOR = -1605883821;
        public boolean enable;
        public int port;
        public int proxyId;
        public String server;
        public ProxyType type;

        public EditProxy() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public EditProxy(int i, String str, int i2, boolean z, ProxyType proxyType) {
            this.proxyId = i;
            this.server = str;
            this.port = i2;
            this.enable = z;
            this.type = proxyType;
        }
    }

    public static class EmailAddressAuthenticationCodeInfo extends Object {
        public static final int CONSTRUCTOR = 1151066659;
        public String emailAddressPattern;
        public int length;

        public EmailAddressAuthenticationCodeInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public EmailAddressAuthenticationCodeInfo(String str, int i) {
            this.emailAddressPattern = str;
            this.length = i;
        }
    }

    public static class Emojis extends Object {
        public static final int CONSTRUCTOR = 950339552;
        public String[] emojis;

        public Emojis() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Emojis(String[] strArr) {
            this.emojis = strArr;
        }
    }

    public static class EnableProxy extends Function {
        public static final int CONSTRUCTOR = 1494450838;
        public int proxyId;

        public EnableProxy() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public EnableProxy(int i) {
            this.proxyId = i;
        }
    }

    public static class EncryptedCredentials extends Object {
        public static final int CONSTRUCTOR = 1331106766;
        public byte[] data;
        public byte[] hash;
        public byte[] secret;

        public EncryptedCredentials() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public EncryptedCredentials(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            this.data = bArr;
            this.hash = bArr2;
            this.secret = bArr3;
        }
    }

    public static class EncryptedPassportElement extends Object {
        public static final int CONSTRUCTOR = 2002386193;
        public byte[] data;
        public DatedFile[] files;
        public DatedFile frontSide;
        public String hash;
        public DatedFile reverseSide;
        public DatedFile selfie;
        public DatedFile[] translation;
        public PassportElementType type;
        public String value;

        public EncryptedPassportElement() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public EncryptedPassportElement(PassportElementType passportElementType, byte[] bArr, DatedFile datedFile, DatedFile datedFile2, DatedFile datedFile3, DatedFile[] datedFileArr, DatedFile[] datedFileArr2, String str, String str2) {
            this.type = passportElementType;
            this.data = bArr;
            this.frontSide = datedFile;
            this.reverseSide = datedFile2;
            this.selfie = datedFile3;
            this.translation = datedFileArr;
            this.files = datedFileArr2;
            this.value = str;
            this.hash = str2;
        }
    }

    public static class EndGroupCall extends Function {
        public static final int CONSTRUCTOR = 573131959;
        public int groupCallId;

        public EndGroupCall() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public EndGroupCall(int i) {
            this.groupCallId = i;
        }
    }

    public static class EndGroupCallRecording extends Function {
        public static final int CONSTRUCTOR = -75799927;
        public int groupCallId;

        public EndGroupCallRecording() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public EndGroupCallRecording(int i) {
            this.groupCallId = i;
        }
    }

    public static class EndGroupCallScreenSharing extends Function {
        public static final int CONSTRUCTOR = -2047599540;
        public int groupCallId;

        public EndGroupCallScreenSharing() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public EndGroupCallScreenSharing(int i) {
            this.groupCallId = i;
        }
    }

    public static class Error extends Object {
        public static final int CONSTRUCTOR = -1679978726;
        public int code;
        public String message;

        public Error() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Error(int i, String str) {
            this.code = i;
            this.message = str;
        }
    }

    public static class File extends Object {
        public static final int CONSTRUCTOR = 766337656;
        public int expectedSize;
        public int f25373id;
        public LocalFile local;
        public RemoteFile remote;
        public int size;

        public File() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public File(int i, int i2, int i3, LocalFile localFile, RemoteFile remoteFile) {
            this.f25373id = i;
            this.size = i2;
            this.expectedSize = i3;
            this.local = localFile;
            this.remote = remoteFile;
        }
    }

    public static class FileDownload extends Object {
        public static final int CONSTRUCTOR = -2092100780;
        public int addDate;
        public int completeDate;
        public int fileId;
        public boolean isPaused;
        public Message message;

        public FileDownload() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public FileDownload(int i, Message message, int i2, int i3, boolean z) {
            this.fileId = i;
            this.message = message;
            this.addDate = i2;
            this.completeDate = i3;
            this.isPaused = z;
        }
    }

    public static class FilePart extends Object {
        public static final int CONSTRUCTOR = 911821878;
        public byte[] data;

        public FilePart() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public FilePart(byte[] bArr) {
            this.data = bArr;
        }
    }

    public static abstract class FileType extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class FileTypeAnimation extends FileType {
        public static final int CONSTRUCTOR = -290816582;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeAudio extends FileType {
        public static final int CONSTRUCTOR = -709112160;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeDocument extends FileType {
        public static final int CONSTRUCTOR = -564722929;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeNone extends FileType {
        public static final int CONSTRUCTOR = 2003009189;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypePhoto extends FileType {
        public static final int CONSTRUCTOR = -1718914651;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeProfilePhoto extends FileType {
        public static final int CONSTRUCTOR = 1795089315;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeSecret extends FileType {
        public static final int CONSTRUCTOR = -1871899401;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeSecretThumbnail extends FileType {
        public static final int CONSTRUCTOR = -1401326026;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeSecure extends FileType {
        public static final int CONSTRUCTOR = -1419133146;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeSticker extends FileType {
        public static final int CONSTRUCTOR = 475233385;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeThumbnail extends FileType {
        public static final int CONSTRUCTOR = -12443298;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeUnknown extends FileType {
        public static final int CONSTRUCTOR = -2011566768;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeVideo extends FileType {
        public static final int CONSTRUCTOR = 1430816539;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeVideoNote extends FileType {
        public static final int CONSTRUCTOR = -518412385;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeVoiceNote extends FileType {
        public static final int CONSTRUCTOR = -588681661;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeWallpaper extends FileType {
        public static final int CONSTRUCTOR = 1854930076;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FinishFileGeneration extends Function {
        public static final int CONSTRUCTOR = -1055060835;
        public Error error;
        public long generationId;

        public FinishFileGeneration() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public FinishFileGeneration(long j, Error error) {
            this.generationId = j;
            this.error = error;
        }
    }

    public static class FormattedText extends Object {
        public static final int CONSTRUCTOR = -252624564;
        public TextEntity[] entities;
        public String text;

        public FormattedText() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public FormattedText(String str, TextEntity[] textEntityArr) {
            this.text = str;
            this.entities = textEntityArr;
        }
    }

    public static class ForwardMessages extends Function {
        public static final int CONSTRUCTOR = -798726491;
        public long chatId;
        public long fromChatId;
        public long[] messageIds;
        public boolean onlyPreview;
        public MessageSendOptions options;
        public boolean removeCaption;
        public boolean sendCopy;

        public ForwardMessages() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ForwardMessages(long j, long j2, long[] jArr, MessageSendOptions messageSendOptions, boolean z, boolean z2, boolean z3) {
            this.chatId = j;
            this.fromChatId = j2;
            this.messageIds = jArr;
            this.options = messageSendOptions;
            this.sendCopy = z;
            this.removeCaption = z2;
            this.onlyPreview = z3;
        }
    }

    public static class FoundFileDownloads extends Object {
        public static final int CONSTRUCTOR = 1395890392;
        public FileDownload[] files;
        public String nextOffset;
        public DownloadedFileCounts totalCounts;

        public FoundFileDownloads() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public FoundFileDownloads(DownloadedFileCounts downloadedFileCounts, FileDownload[] fileDownloadArr, String str) {
            this.totalCounts = downloadedFileCounts;
            this.files = fileDownloadArr;
            this.nextOffset = str;
        }
    }

    public static class FoundMessages extends Object {
        public static final int CONSTRUCTOR = -529809608;
        public Message[] messages;
        public String nextOffset;
        public int totalCount;

        public FoundMessages() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public FoundMessages(int i, Message[] messageArr, String str) {
            this.totalCount = i;
            this.messages = messageArr;
            this.nextOffset = str;
        }
    }

    public static abstract class Function extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();

        @Override
        public native String toString();
    }

    public static class Game extends Object {
        public static final int CONSTRUCTOR = -1565597752;
        public Animation animation;
        public String description;
        public long f25374id;
        public Photo photo;
        public String shortName;
        public FormattedText text;
        public String title;

        public Game() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Game(long j, String str, String str2, FormattedText formattedText, String str3, Photo photo, Animation animation) {
            this.f25374id = j;
            this.shortName = str;
            this.title = str2;
            this.text = formattedText;
            this.description = str3;
            this.photo = photo;
            this.animation = animation;
        }
    }

    public static class GameHighScore extends Object {
        public static final int CONSTRUCTOR = 342871838;
        public int position;
        public int score;
        public long userId;

        public GameHighScore() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GameHighScore(int i, long j, int i2) {
            this.position = i;
            this.userId = j;
            this.score = i2;
        }
    }

    public static class GameHighScores extends Object {
        public static final int CONSTRUCTOR = -725770727;
        public GameHighScore[] scores;

        public GameHighScores() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GameHighScores(GameHighScore[] gameHighScoreArr) {
            this.scores = gameHighScoreArr;
        }
    }

    public static class GetAccountTtl extends Function {
        public static final int CONSTRUCTOR = -443905161;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetActiveLiveLocationMessages extends Function {
        public static final int CONSTRUCTOR = -1425459567;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetActiveSessions extends Function {
        public static final int CONSTRUCTOR = 1119710526;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetAllPassportElements extends Function {
        public static final int CONSTRUCTOR = -2038945045;
        public String password;

        public GetAllPassportElements() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetAllPassportElements(String str) {
            this.password = str;
        }
    }

    public static class GetAnimatedEmoji extends Function {
        public static final int CONSTRUCTOR = 1065635702;
        public String emoji;

        public GetAnimatedEmoji() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetAnimatedEmoji(String str) {
            this.emoji = str;
        }
    }

    public static class GetApplicationConfig extends Function {
        public static final int CONSTRUCTOR = -1823144318;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetApplicationDownloadLink extends Function {
        public static final int CONSTRUCTOR = 112013252;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetArchivedStickerSets extends Function {
        public static final int CONSTRUCTOR = 1996943238;
        public boolean isMasks;
        public int limit;
        public long offsetStickerSetId;

        public GetArchivedStickerSets() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetArchivedStickerSets(boolean z, long j, int i) {
            this.isMasks = z;
            this.offsetStickerSetId = j;
            this.limit = i;
        }
    }

    public static class GetAttachedStickerSets extends Function {
        public static final int CONSTRUCTOR = 1302172429;
        public int fileId;

        public GetAttachedStickerSets() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetAttachedStickerSets(int i) {
            this.fileId = i;
        }
    }

    public static class GetAuthorizationState extends Function {
        public static final int CONSTRUCTOR = 1949154877;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetAutoDownloadSettingsPresets extends Function {
        public static final int CONSTRUCTOR = -1721088201;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetBackgroundUrl extends Function {
        public static final int CONSTRUCTOR = 733769682;
        public String name;
        public BackgroundType type;

        public GetBackgroundUrl() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetBackgroundUrl(String str, BackgroundType backgroundType) {
            this.name = str;
            this.type = backgroundType;
        }
    }

    public static class GetBackgrounds extends Function {
        public static final int CONSTRUCTOR = 249072633;
        public boolean forDarkTheme;

        public GetBackgrounds() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetBackgrounds(boolean z) {
            this.forDarkTheme = z;
        }
    }

    public static class GetBankCardInfo extends Function {
        public static final int CONSTRUCTOR = -1310515792;
        public String bankCardNumber;

        public GetBankCardInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetBankCardInfo(String str) {
            this.bankCardNumber = str;
        }
    }

    public static class GetBasicGroup extends Function {
        public static final int CONSTRUCTOR = -1635174828;
        public long basicGroupId;

        public GetBasicGroup() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetBasicGroup(long j) {
            this.basicGroupId = j;
        }
    }

    public static class GetBasicGroupFullInfo extends Function {
        public static final int CONSTRUCTOR = -1822039253;
        public long basicGroupId;

        public GetBasicGroupFullInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetBasicGroupFullInfo(long j) {
            this.basicGroupId = j;
        }
    }

    public static class GetBlockedMessageSenders extends Function {
        public static final int CONSTRUCTOR = 1947079776;
        public int limit;
        public int offset;

        public GetBlockedMessageSenders() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetBlockedMessageSenders(int i, int i2) {
            this.offset = i;
            this.limit = i2;
        }
    }

    public static class GetCallbackQueryAnswer extends Function {
        public static final int CONSTRUCTOR = 116357727;
        public long chatId;
        public long messageId;
        public CallbackQueryPayload payload;

        public GetCallbackQueryAnswer() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetCallbackQueryAnswer(long j, long j2, CallbackQueryPayload callbackQueryPayload) {
            this.chatId = j;
            this.messageId = j2;
            this.payload = callbackQueryPayload;
        }
    }

    public static class GetCallbackQueryMessage extends Function {
        public static final int CONSTRUCTOR = -1121939086;
        public long callbackQueryId;
        public long chatId;
        public long messageId;

        public GetCallbackQueryMessage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetCallbackQueryMessage(long j, long j2, long j3) {
            this.chatId = j;
            this.messageId = j2;
            this.callbackQueryId = j3;
        }
    }

    public static class GetChat extends Function {
        public static final int CONSTRUCTOR = 1866601536;
        public long chatId;

        public GetChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetChat(long j) {
            this.chatId = j;
        }
    }

    public static class GetChatAdministrators extends Function {
        public static final int CONSTRUCTOR = 1544468155;
        public long chatId;

        public GetChatAdministrators() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetChatAdministrators(long j) {
            this.chatId = j;
        }
    }

    public static class GetChatAvailableMessageSenders extends Function {
        public static final int CONSTRUCTOR = -1541571496;
        public long chatId;

        public GetChatAvailableMessageSenders() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetChatAvailableMessageSenders(long j) {
            this.chatId = j;
        }
    }

    public static class GetChatEventLog extends Function {
        public static final int CONSTRUCTOR = -1281344669;
        public long chatId;
        public ChatEventLogFilters filters;
        public long fromEventId;
        public int limit;
        public String query;
        public long[] userIds;

        public GetChatEventLog() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetChatEventLog(long j, String str, long j2, int i, ChatEventLogFilters chatEventLogFilters, long[] jArr) {
            this.chatId = j;
            this.query = str;
            this.fromEventId = j2;
            this.limit = i;
            this.filters = chatEventLogFilters;
            this.userIds = jArr;
        }
    }

    public static class GetChatFilter extends Function {
        public static final int CONSTRUCTOR = 1826317803;
        public int chatFilterId;

        public GetChatFilter() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetChatFilter(int i) {
            this.chatFilterId = i;
        }
    }

    public static class GetChatFilterDefaultIconName extends Function {
        public static final int CONSTRUCTOR = -1339828680;
        public ChatFilter filter;

        public GetChatFilterDefaultIconName() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetChatFilterDefaultIconName(ChatFilter chatFilter) {
            this.filter = chatFilter;
        }
    }

    public static class GetChatHistory extends Function {
        public static final int CONSTRUCTOR = -799960451;
        public long chatId;
        public long fromMessageId;
        public int limit;
        public int offset;
        public boolean onlyLocal;

        public GetChatHistory() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetChatHistory(long j, long j2, int i, int i2, boolean z) {
            this.chatId = j;
            this.fromMessageId = j2;
            this.offset = i;
            this.limit = i2;
            this.onlyLocal = z;
        }
    }

    public static class GetChatInviteLink extends Function {
        public static final int CONSTRUCTOR = -479575555;
        public long chatId;
        public String inviteLink;

        public GetChatInviteLink() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetChatInviteLink(long j, String str) {
            this.chatId = j;
            this.inviteLink = str;
        }
    }

    public static class GetChatInviteLinkCounts extends Function {
        public static final int CONSTRUCTOR = 890299025;
        public long chatId;

        public GetChatInviteLinkCounts() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetChatInviteLinkCounts(long j) {
            this.chatId = j;
        }
    }

    public static class GetChatInviteLinkMembers extends Function {
        public static final int CONSTRUCTOR = -977921638;
        public long chatId;
        public String inviteLink;
        public int limit;
        public ChatInviteLinkMember offsetMember;

        public GetChatInviteLinkMembers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetChatInviteLinkMembers(long j, String str, ChatInviteLinkMember chatInviteLinkMember, int i) {
            this.chatId = j;
            this.inviteLink = str;
            this.offsetMember = chatInviteLinkMember;
            this.limit = i;
        }
    }

    public static class GetChatInviteLinks extends Function {
        public static final int CONSTRUCTOR = 883252396;
        public long chatId;
        public long creatorUserId;
        public boolean isRevoked;
        public int limit;
        public int offsetDate;
        public String offsetInviteLink;

        public GetChatInviteLinks() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetChatInviteLinks(long j, long j2, boolean z, int i, String str, int i2) {
            this.chatId = j;
            this.creatorUserId = j2;
            this.isRevoked = z;
            this.offsetDate = i;
            this.offsetInviteLink = str;
            this.limit = i2;
        }
    }

    public static class GetChatJoinRequests extends Function {
        public static final int CONSTRUCTOR = -388428126;
        public long chatId;
        public String inviteLink;
        public int limit;
        public ChatJoinRequest offsetRequest;
        public String query;

        public GetChatJoinRequests() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetChatJoinRequests(long j, String str, String str2, ChatJoinRequest chatJoinRequest, int i) {
            this.chatId = j;
            this.inviteLink = str;
            this.query = str2;
            this.offsetRequest = chatJoinRequest;
            this.limit = i;
        }
    }

    public static class GetChatListsToAddChat extends Function {
        public static final int CONSTRUCTOR = 654956193;
        public long chatId;

        public GetChatListsToAddChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetChatListsToAddChat(long j) {
            this.chatId = j;
        }
    }

    public static class GetChatMember extends Function {
        public static final int CONSTRUCTOR = -792636814;
        public long chatId;
        public MessageSender memberId;

        public GetChatMember() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetChatMember(long j, MessageSender messageSender) {
            this.chatId = j;
            this.memberId = messageSender;
        }
    }

    public static class GetChatMessageByDate extends Function {
        public static final int CONSTRUCTOR = 1062564150;
        public long chatId;
        public int date;

        public GetChatMessageByDate() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetChatMessageByDate(long j, int i) {
            this.chatId = j;
            this.date = i;
        }
    }

    public static class GetChatMessageCalendar extends Function {
        public static final int CONSTRUCTOR = -326164204;
        public long chatId;
        public SearchMessagesFilter filter;
        public long fromMessageId;

        public GetChatMessageCalendar() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetChatMessageCalendar(long j, SearchMessagesFilter searchMessagesFilter, long j2) {
            this.chatId = j;
            this.filter = searchMessagesFilter;
            this.fromMessageId = j2;
        }
    }

    public static class GetChatMessageCount extends Function {
        public static final int CONSTRUCTOR = 205435308;
        public long chatId;
        public SearchMessagesFilter filter;
        public boolean returnLocal;

        public GetChatMessageCount() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetChatMessageCount(long j, SearchMessagesFilter searchMessagesFilter, boolean z) {
            this.chatId = j;
            this.filter = searchMessagesFilter;
            this.returnLocal = z;
        }
    }

    public static class GetChatNotificationSettingsExceptions extends Function {
        public static final int CONSTRUCTOR = 201199121;
        public boolean compareSound;
        public NotificationSettingsScope scope;

        public GetChatNotificationSettingsExceptions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetChatNotificationSettingsExceptions(NotificationSettingsScope notificationSettingsScope, boolean z) {
            this.scope = notificationSettingsScope;
            this.compareSound = z;
        }
    }

    public static class GetChatPinnedMessage extends Function {
        public static final int CONSTRUCTOR = 359865008;
        public long chatId;

        public GetChatPinnedMessage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetChatPinnedMessage(long j) {
            this.chatId = j;
        }
    }

    public static class GetChatScheduledMessages extends Function {
        public static final int CONSTRUCTOR = -549638149;
        public long chatId;

        public GetChatScheduledMessages() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetChatScheduledMessages(long j) {
            this.chatId = j;
        }
    }

    public static class GetChatSparseMessagePositions extends Function {
        public static final int CONSTRUCTOR = -462227580;
        public long chatId;
        public SearchMessagesFilter filter;
        public long fromMessageId;
        public int limit;

        public GetChatSparseMessagePositions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetChatSparseMessagePositions(long j, SearchMessagesFilter searchMessagesFilter, long j2, int i) {
            this.chatId = j;
            this.filter = searchMessagesFilter;
            this.fromMessageId = j2;
            this.limit = i;
        }
    }

    public static class GetChatSponsoredMessage extends Function {
        public static final int CONSTRUCTOR = 7520523;
        public long chatId;

        public GetChatSponsoredMessage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetChatSponsoredMessage(long j) {
            this.chatId = j;
        }
    }

    public static class GetChatStatistics extends Function {
        public static final int CONSTRUCTOR = 327057816;
        public long chatId;
        public boolean isDark;

        public GetChatStatistics() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetChatStatistics(long j, boolean z) {
            this.chatId = j;
            this.isDark = z;
        }
    }

    public static class GetChats extends Function {
        public static final int CONSTRUCTOR = -972768574;
        public ChatList chatList;
        public int limit;

        public GetChats() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetChats(ChatList chatList, int i) {
            this.chatList = chatList;
            this.limit = i;
        }
    }

    public static class GetCommands extends Function {
        public static final int CONSTRUCTOR = 1488621559;
        public String languageCode;
        public BotCommandScope scope;

        public GetCommands() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetCommands(BotCommandScope botCommandScope, String str) {
            this.scope = botCommandScope;
            this.languageCode = str;
        }
    }

    public static class GetConnectedWebsites extends Function {
        public static final int CONSTRUCTOR = -170536110;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetContacts extends Function {
        public static final int CONSTRUCTOR = -1417722768;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetCountries extends Function {
        public static final int CONSTRUCTOR = -51902050;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetCountryCode extends Function {
        public static final int CONSTRUCTOR = 1540593906;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetCreatedPublicChats extends Function {
        public static final int CONSTRUCTOR = 710354415;
        public PublicChatType type;

        public GetCreatedPublicChats() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetCreatedPublicChats(PublicChatType publicChatType) {
            this.type = publicChatType;
        }
    }

    public static class GetCurrentState extends Function {
        public static final int CONSTRUCTOR = -1191417719;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetDatabaseStatistics extends Function {
        public static final int CONSTRUCTOR = -1942760263;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetDeepLinkInfo extends Function {
        public static final int CONSTRUCTOR = 680673150;
        public String link;

        public GetDeepLinkInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetDeepLinkInfo(String str) {
            this.link = str;
        }
    }

    public static class GetEmojiSuggestionsUrl extends Function {
        public static final int CONSTRUCTOR = -1404101841;
        public String languageCode;

        public GetEmojiSuggestionsUrl() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetEmojiSuggestionsUrl(String str) {
            this.languageCode = str;
        }
    }

    public static class GetExternalLink extends Function {
        public static final int CONSTRUCTOR = 1586688235;
        public boolean allowWriteAccess;
        public String link;

        public GetExternalLink() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetExternalLink(String str, boolean z) {
            this.link = str;
            this.allowWriteAccess = z;
        }
    }

    public static class GetExternalLinkInfo extends Function {
        public static final int CONSTRUCTOR = 1175288383;
        public String link;

        public GetExternalLinkInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetExternalLinkInfo(String str) {
            this.link = str;
        }
    }

    public static class GetFavoriteStickers extends Function {
        public static final int CONSTRUCTOR = -338964672;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetFile extends Function {
        public static final int CONSTRUCTOR = 1553923406;
        public int fileId;

        public GetFile() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetFile(int i) {
            this.fileId = i;
        }
    }

    public static class GetFileDownloadedPrefixSize extends Function {
        public static final int CONSTRUCTOR = -1668864864;
        public int fileId;
        public int offset;

        public GetFileDownloadedPrefixSize() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetFileDownloadedPrefixSize(int i, int i2) {
            this.fileId = i;
            this.offset = i2;
        }
    }

    public static class GetFileExtension extends Function {
        public static final int CONSTRUCTOR = -106055372;
        public String mimeType;

        public GetFileExtension() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetFileExtension(String str) {
            this.mimeType = str;
        }
    }

    public static class GetFileMimeType extends Function {
        public static final int CONSTRUCTOR = -2073879671;
        public String fileName;

        public GetFileMimeType() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetFileMimeType(String str) {
            this.fileName = str;
        }
    }

    public static class GetGameHighScores extends Function {
        public static final int CONSTRUCTOR = 15746459;
        public long chatId;
        public long messageId;
        public long userId;

        public GetGameHighScores() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetGameHighScores(long j, long j2, long j3) {
            this.chatId = j;
            this.messageId = j2;
            this.userId = j3;
        }
    }

    public static class GetGroupCall extends Function {
        public static final int CONSTRUCTOR = 1468491406;
        public int groupCallId;

        public GetGroupCall() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetGroupCall(int i) {
            this.groupCallId = i;
        }
    }

    public static class GetGroupCallInviteLink extends Function {
        public static final int CONSTRUCTOR = 719407396;
        public boolean canSelfUnmute;
        public int groupCallId;

        public GetGroupCallInviteLink() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetGroupCallInviteLink(int i, boolean z) {
            this.groupCallId = i;
            this.canSelfUnmute = z;
        }
    }

    public static class GetGroupCallStreamSegment extends Function {
        public static final int CONSTRUCTOR = -2077959515;
        public int channelId;
        public int groupCallId;
        public int scale;
        public long timeOffset;
        public GroupCallVideoQuality videoQuality;

        public GetGroupCallStreamSegment() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetGroupCallStreamSegment(int i, long j, int i2, int i3, GroupCallVideoQuality groupCallVideoQuality) {
            this.groupCallId = i;
            this.timeOffset = j;
            this.scale = i2;
            this.channelId = i3;
            this.videoQuality = groupCallVideoQuality;
        }
    }

    public static class GetGroupCallStreams extends Function {
        public static final int CONSTRUCTOR = -1619226268;
        public int groupCallId;

        public GetGroupCallStreams() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetGroupCallStreams(int i) {
            this.groupCallId = i;
        }
    }

    public static class GetGroupsInCommon extends Function {
        public static final int CONSTRUCTOR = 381539178;
        public int limit;
        public long offsetChatId;
        public long userId;

        public GetGroupsInCommon() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetGroupsInCommon(long j, long j2, int i) {
            this.userId = j;
            this.offsetChatId = j2;
            this.limit = i;
        }
    }

    public static class GetImportedContactCount extends Function {
        public static final int CONSTRUCTOR = -656336346;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetInactiveSupergroupChats extends Function {
        public static final int CONSTRUCTOR = -657720907;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetInlineGameHighScores extends Function {
        public static final int CONSTRUCTOR = -533107798;
        public String inlineMessageId;
        public long userId;

        public GetInlineGameHighScores() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetInlineGameHighScores(String str, long j) {
            this.inlineMessageId = str;
            this.userId = j;
        }
    }

    public static class GetInlineQueryResults extends Function {
        public static final int CONSTRUCTOR = 2044524652;
        public long botUserId;
        public long chatId;
        public String offset;
        public String query;
        public Location userLocation;

        public GetInlineQueryResults() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetInlineQueryResults(long j, long j2, Location location, String str, String str2) {
            this.botUserId = j;
            this.chatId = j2;
            this.userLocation = location;
            this.query = str;
            this.offset = str2;
        }
    }

    public static class GetInstalledStickerSets extends Function {
        public static final int CONSTRUCTOR = 1214523749;
        public boolean isMasks;

        public GetInstalledStickerSets() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetInstalledStickerSets(boolean z) {
            this.isMasks = z;
        }
    }

    public static class GetInternalLinkType extends Function {
        public static final int CONSTRUCTOR = -1948428535;
        public String link;

        public GetInternalLinkType() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetInternalLinkType(String str) {
            this.link = str;
        }
    }

    public static class GetJsonString extends Function {
        public static final int CONSTRUCTOR = 663458849;
        public JsonValue jsonValue;

        public GetJsonString() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetJsonString(JsonValue jsonValue) {
            this.jsonValue = jsonValue;
        }
    }

    public static class GetJsonValue extends Function {
        public static final int CONSTRUCTOR = -1829086715;
        public String json;

        public GetJsonValue() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetJsonValue(String str) {
            this.json = str;
        }
    }

    public static class GetLanguagePackInfo extends Function {
        public static final int CONSTRUCTOR = 2077809320;
        public String languagePackId;

        public GetLanguagePackInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetLanguagePackInfo(String str) {
            this.languagePackId = str;
        }
    }

    public static class GetLanguagePackString extends Function {
        public static final int CONSTRUCTOR = 150789747;
        public String key;
        public String languagePackDatabasePath;
        public String languagePackId;
        public String localizationTarget;

        public GetLanguagePackString() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetLanguagePackString(String str, String str2, String str3, String str4) {
            this.languagePackDatabasePath = str;
            this.localizationTarget = str2;
            this.languagePackId = str3;
            this.key = str4;
        }
    }

    public static class GetLanguagePackStrings extends Function {
        public static final int CONSTRUCTOR = 1246259088;
        public String[] keys;
        public String languagePackId;

        public GetLanguagePackStrings() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetLanguagePackStrings(String str, String[] strArr) {
            this.languagePackId = str;
            this.keys = strArr;
        }
    }

    public static class GetLocalizationTargetInfo extends Function {
        public static final int CONSTRUCTOR = 1849499526;
        public boolean onlyLocal;

        public GetLocalizationTargetInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetLocalizationTargetInfo(boolean z) {
            this.onlyLocal = z;
        }
    }

    public static class GetLogStream extends Function {
        public static final int CONSTRUCTOR = 1167608667;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetLogTagVerbosityLevel extends Function {
        public static final int CONSTRUCTOR = 951004547;
        public String tag;

        public GetLogTagVerbosityLevel() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetLogTagVerbosityLevel(String str) {
            this.tag = str;
        }
    }

    public static class GetLogTags extends Function {
        public static final int CONSTRUCTOR = -254449190;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetLogVerbosityLevel extends Function {
        public static final int CONSTRUCTOR = 594057956;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetLoginUrl extends Function {
        public static final int CONSTRUCTOR = 791844305;
        public boolean allowWriteAccess;
        public long buttonId;
        public long chatId;
        public long messageId;

        public GetLoginUrl() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetLoginUrl(long j, long j2, long j3, boolean z) {
            this.chatId = j;
            this.messageId = j2;
            this.buttonId = j3;
            this.allowWriteAccess = z;
        }
    }

    public static class GetLoginUrlInfo extends Function {
        public static final int CONSTRUCTOR = -859202125;
        public long buttonId;
        public long chatId;
        public long messageId;

        public GetLoginUrlInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetLoginUrlInfo(long j, long j2, long j3) {
            this.chatId = j;
            this.messageId = j2;
            this.buttonId = j3;
        }
    }

    public static class GetMapThumbnailFile extends Function {
        public static final int CONSTRUCTOR = -152660070;
        public long chatId;
        public int height;
        public Location location;
        public int scale;
        public int width;
        public int zoom;

        public GetMapThumbnailFile() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetMapThumbnailFile(Location location, int i, int i2, int i3, int i4, long j) {
            this.location = location;
            this.zoom = i;
            this.width = i2;
            this.height = i3;
            this.scale = i4;
            this.chatId = j;
        }
    }

    public static class GetMarkdownText extends Function {
        public static final int CONSTRUCTOR = 164524584;
        public FormattedText text;

        public GetMarkdownText() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetMarkdownText(FormattedText formattedText) {
            this.text = formattedText;
        }
    }

    public static class GetMe extends Function {
        public static final int CONSTRUCTOR = -191516033;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetMessage extends Function {
        public static final int CONSTRUCTOR = -1821196160;
        public long chatId;
        public long messageId;

        public GetMessage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetMessage(long j, long j2) {
            this.chatId = j;
            this.messageId = j2;
        }
    }

    public static class GetMessageAddedReactions extends Function {
        public static final int CONSTRUCTOR = -1430014415;
        public long chatId;
        public int limit;
        public long messageId;
        public String offset;
        public String reaction;

        public GetMessageAddedReactions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetMessageAddedReactions(long j, long j2, String str, String str2, int i) {
            this.chatId = j;
            this.messageId = j2;
            this.reaction = str;
            this.offset = str2;
            this.limit = i;
        }
    }

    public static class GetMessageAvailableReactions extends Function {
        public static final int CONSTRUCTOR = 205497679;
        public long chatId;
        public long messageId;

        public GetMessageAvailableReactions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetMessageAvailableReactions(long j, long j2) {
            this.chatId = j;
            this.messageId = j2;
        }
    }

    public static class GetMessageEmbeddingCode extends Function {
        public static final int CONSTRUCTOR = 1654967561;
        public long chatId;
        public boolean forAlbum;
        public long messageId;

        public GetMessageEmbeddingCode() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetMessageEmbeddingCode(long j, long j2, boolean z) {
            this.chatId = j;
            this.messageId = j2;
            this.forAlbum = z;
        }
    }

    public static class GetMessageFileType extends Function {
        public static final int CONSTRUCTOR = -490270764;
        public String messageFileHead;

        public GetMessageFileType() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetMessageFileType(String str) {
            this.messageFileHead = str;
        }
    }

    public static class GetMessageImportConfirmationText extends Function {
        public static final int CONSTRUCTOR = 390627752;
        public long chatId;

        public GetMessageImportConfirmationText() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetMessageImportConfirmationText(long j) {
            this.chatId = j;
        }
    }

    public static class GetMessageLink extends Function {
        public static final int CONSTRUCTOR = -1607389329;
        public long chatId;
        public boolean forAlbum;
        public boolean forComment;
        public int mediaTimestamp;
        public long messageId;

        public GetMessageLink() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetMessageLink(long j, long j2, int i, boolean z, boolean z2) {
            this.chatId = j;
            this.messageId = j2;
            this.mediaTimestamp = i;
            this.forAlbum = z;
            this.forComment = z2;
        }
    }

    public static class GetMessageLinkInfo extends Function {
        public static final int CONSTRUCTOR = -700533672;
        public String url;

        public GetMessageLinkInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetMessageLinkInfo(String str) {
            this.url = str;
        }
    }

    public static class GetMessageLocally extends Function {
        public static final int CONSTRUCTOR = -603575444;
        public long chatId;
        public long messageId;

        public GetMessageLocally() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetMessageLocally(long j, long j2) {
            this.chatId = j;
            this.messageId = j2;
        }
    }

    public static class GetMessagePublicForwards extends Function {
        public static final int CONSTRUCTOR = 1611049289;
        public long chatId;
        public int limit;
        public long messageId;
        public String offset;

        public GetMessagePublicForwards() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetMessagePublicForwards(long j, long j2, String str, int i) {
            this.chatId = j;
            this.messageId = j2;
            this.offset = str;
            this.limit = i;
        }
    }

    public static class GetMessageStatistics extends Function {
        public static final int CONSTRUCTOR = 1270194648;
        public long chatId;
        public boolean isDark;
        public long messageId;

        public GetMessageStatistics() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetMessageStatistics(long j, long j2, boolean z) {
            this.chatId = j;
            this.messageId = j2;
            this.isDark = z;
        }
    }

    public static class GetMessageThread extends Function {
        public static final int CONSTRUCTOR = 2062695998;
        public long chatId;
        public long messageId;

        public GetMessageThread() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetMessageThread(long j, long j2) {
            this.chatId = j;
            this.messageId = j2;
        }
    }

    public static class GetMessageThreadHistory extends Function {
        public static final int CONSTRUCTOR = -1808411608;
        public long chatId;
        public long fromMessageId;
        public int limit;
        public long messageId;
        public int offset;

        public GetMessageThreadHistory() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetMessageThreadHistory(long j, long j2, long j3, int i, int i2) {
            this.chatId = j;
            this.messageId = j2;
            this.fromMessageId = j3;
            this.offset = i;
            this.limit = i2;
        }
    }

    public static class GetMessageViewers extends Function {
        public static final int CONSTRUCTOR = -1879496099;
        public long chatId;
        public long messageId;

        public GetMessageViewers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetMessageViewers(long j, long j2) {
            this.chatId = j;
            this.messageId = j2;
        }
    }

    public static class GetMessages extends Function {
        public static final int CONSTRUCTOR = 425299338;
        public long chatId;
        public long[] messageIds;

        public GetMessages() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetMessages(long j, long[] jArr) {
            this.chatId = j;
            this.messageIds = jArr;
        }
    }

    public static class GetNetworkStatistics extends Function {
        public static final int CONSTRUCTOR = -986228706;
        public boolean onlyCurrent;

        public GetNetworkStatistics() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetNetworkStatistics(boolean z) {
            this.onlyCurrent = z;
        }
    }

    public static class GetOption extends Function {
        public static final int CONSTRUCTOR = -1572495746;
        public String name;

        public GetOption() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetOption(String str) {
            this.name = str;
        }
    }

    public static class GetPassportAuthorizationForm extends Function {
        public static final int CONSTRUCTOR = 1636107398;
        public long botUserId;
        public String nonce;
        public String publicKey;
        public String scope;

        public GetPassportAuthorizationForm() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetPassportAuthorizationForm(long j, String str, String str2, String str3) {
            this.botUserId = j;
            this.scope = str;
            this.publicKey = str2;
            this.nonce = str3;
        }
    }

    public static class GetPassportAuthorizationFormAvailableElements extends Function {
        public static final int CONSTRUCTOR = 1738134754;
        public int autorizationFormId;
        public String password;

        public GetPassportAuthorizationFormAvailableElements() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetPassportAuthorizationFormAvailableElements(int i, String str) {
            this.autorizationFormId = i;
            this.password = str;
        }
    }

    public static class GetPassportElement extends Function {
        public static final int CONSTRUCTOR = -1882398342;
        public String password;
        public PassportElementType type;

        public GetPassportElement() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetPassportElement(PassportElementType passportElementType, String str) {
            this.type = passportElementType;
            this.password = str;
        }
    }

    public static class GetPasswordState extends Function {
        public static final int CONSTRUCTOR = -174752904;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetPaymentForm extends Function {
        public static final int CONSTRUCTOR = 158229273;
        public long chatId;
        public long messageId;
        public PaymentFormTheme theme;

        public GetPaymentForm() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetPaymentForm(long j, long j2, PaymentFormTheme paymentFormTheme) {
            this.chatId = j;
            this.messageId = j2;
            this.theme = paymentFormTheme;
        }
    }

    public static class GetPaymentReceipt extends Function {
        public static final int CONSTRUCTOR = 1013758294;
        public long chatId;
        public long messageId;

        public GetPaymentReceipt() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetPaymentReceipt(long j, long j2) {
            this.chatId = j;
            this.messageId = j2;
        }
    }

    public static class GetPhoneNumberInfo extends Function {
        public static final int CONSTRUCTOR = -1608344583;
        public String phoneNumberPrefix;

        public GetPhoneNumberInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetPhoneNumberInfo(String str) {
            this.phoneNumberPrefix = str;
        }
    }

    public static class GetPhoneNumberInfoSync extends Function {
        public static final int CONSTRUCTOR = 547061048;
        public String languageCode;
        public String phoneNumberPrefix;

        public GetPhoneNumberInfoSync() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetPhoneNumberInfoSync(String str, String str2) {
            this.languageCode = str;
            this.phoneNumberPrefix = str2;
        }
    }

    public static class GetPollVoters extends Function {
        public static final int CONSTRUCTOR = 2075288734;
        public long chatId;
        public int limit;
        public long messageId;
        public int offset;
        public int optionId;

        public GetPollVoters() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetPollVoters(long j, long j2, int i, int i2, int i3) {
            this.chatId = j;
            this.messageId = j2;
            this.optionId = i;
            this.offset = i2;
            this.limit = i3;
        }
    }

    public static class GetPreferredCountryLanguage extends Function {
        public static final int CONSTRUCTOR = -933049386;
        public String countryCode;

        public GetPreferredCountryLanguage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetPreferredCountryLanguage(String str) {
            this.countryCode = str;
        }
    }

    public static class GetProxies extends Function {
        public static final int CONSTRUCTOR = -95026381;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetProxyLink extends Function {
        public static final int CONSTRUCTOR = -1054495112;
        public int proxyId;

        public GetProxyLink() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetProxyLink(int i) {
            this.proxyId = i;
        }
    }

    public static class GetPushReceiverId extends Function {
        public static final int CONSTRUCTOR = -286505294;
        public String payload;

        public GetPushReceiverId() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetPushReceiverId(String str) {
            this.payload = str;
        }
    }

    public static class GetRecentInlineBots extends Function {
        public static final int CONSTRUCTOR = 1437823548;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetRecentStickers extends Function {
        public static final int CONSTRUCTOR = -579622241;
        public boolean isAttached;

        public GetRecentStickers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetRecentStickers(boolean z) {
            this.isAttached = z;
        }
    }

    public static class GetRecentlyOpenedChats extends Function {
        public static final int CONSTRUCTOR = -1924156893;
        public int limit;

        public GetRecentlyOpenedChats() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetRecentlyOpenedChats(int i) {
            this.limit = i;
        }
    }

    public static class GetRecentlyVisitedTMeUrls extends Function {
        public static final int CONSTRUCTOR = 806754961;
        public String referrer;

        public GetRecentlyVisitedTMeUrls() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetRecentlyVisitedTMeUrls(String str) {
            this.referrer = str;
        }
    }

    public static class GetRecommendedChatFilters extends Function {
        public static final int CONSTRUCTOR = -779390746;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetRecoveryEmailAddress extends Function {
        public static final int CONSTRUCTOR = -1594770947;
        public String password;

        public GetRecoveryEmailAddress() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetRecoveryEmailAddress(String str) {
            this.password = str;
        }
    }

    public static class GetRemoteFile extends Function {
        public static final int CONSTRUCTOR = 2137204530;
        public FileType fileType;
        public String remoteFileId;

        public GetRemoteFile() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetRemoteFile(String str, FileType fileType) {
            this.remoteFileId = str;
            this.fileType = fileType;
        }
    }

    public static class GetRepliedMessage extends Function {
        public static final int CONSTRUCTOR = -641918531;
        public long chatId;
        public long messageId;

        public GetRepliedMessage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetRepliedMessage(long j, long j2) {
            this.chatId = j;
            this.messageId = j2;
        }
    }

    public static class GetSavedAnimations extends Function {
        public static final int CONSTRUCTOR = 7051032;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetSavedOrderInfo extends Function {
        public static final int CONSTRUCTOR = -1152016675;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetScopeNotificationSettings extends Function {
        public static final int CONSTRUCTOR = -995613361;
        public NotificationSettingsScope scope;

        public GetScopeNotificationSettings() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetScopeNotificationSettings(NotificationSettingsScope notificationSettingsScope) {
            this.scope = notificationSettingsScope;
        }
    }

    public static class GetSecretChat extends Function {
        public static final int CONSTRUCTOR = 40599169;
        public int secretChatId;

        public GetSecretChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetSecretChat(int i) {
            this.secretChatId = i;
        }
    }

    public static class GetStatisticalGraph extends Function {
        public static final int CONSTRUCTOR = 1100975515;
        public long chatId;
        public String token;
        public long f25375x;

        public GetStatisticalGraph() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetStatisticalGraph(long j, String str, long j2) {
            this.chatId = j;
            this.token = str;
            this.f25375x = j2;
        }
    }

    public static class GetStickerEmojis extends Function {
        public static final int CONSTRUCTOR = -1895508665;
        public InputFile sticker;

        public GetStickerEmojis() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetStickerEmojis(InputFile inputFile) {
            this.sticker = inputFile;
        }
    }

    public static class GetStickerSet extends Function {
        public static final int CONSTRUCTOR = 1052318659;
        public long setId;

        public GetStickerSet() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetStickerSet(long j) {
            this.setId = j;
        }
    }

    public static class GetStickers extends Function {
        public static final int CONSTRUCTOR = -1594919556;
        public String emoji;
        public int limit;

        public GetStickers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetStickers(String str, int i) {
            this.emoji = str;
            this.limit = i;
        }
    }

    public static class GetStorageStatistics extends Function {
        public static final int CONSTRUCTOR = -853193929;
        public int chatLimit;

        public GetStorageStatistics() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetStorageStatistics(int i) {
            this.chatLimit = i;
        }
    }

    public static class GetStorageStatisticsFast extends Function {
        public static final int CONSTRUCTOR = 61368066;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetSuggestedFileName extends Function {
        public static final int CONSTRUCTOR = -2049399674;
        public String directory;
        public int fileId;

        public GetSuggestedFileName() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetSuggestedFileName(int i, String str) {
            this.fileId = i;
            this.directory = str;
        }
    }

    public static class GetSuggestedStickerSetName extends Function {
        public static final int CONSTRUCTOR = -1340995520;
        public String title;

        public GetSuggestedStickerSetName() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetSuggestedStickerSetName(String str) {
            this.title = str;
        }
    }

    public static class GetSuitableDiscussionChats extends Function {
        public static final int CONSTRUCTOR = 49044982;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetSupergroup extends Function {
        public static final int CONSTRUCTOR = 989663458;
        public long supergroupId;

        public GetSupergroup() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetSupergroup(long j) {
            this.supergroupId = j;
        }
    }

    public static class GetSupergroupFullInfo extends Function {
        public static final int CONSTRUCTOR = 1099776056;
        public long supergroupId;

        public GetSupergroupFullInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetSupergroupFullInfo(long j) {
            this.supergroupId = j;
        }
    }

    public static class GetSupergroupMembers extends Function {
        public static final int CONSTRUCTOR = -570940984;
        public SupergroupMembersFilter filter;
        public int limit;
        public int offset;
        public long supergroupId;

        public GetSupergroupMembers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetSupergroupMembers(long j, SupergroupMembersFilter supergroupMembersFilter, int i, int i2) {
            this.supergroupId = j;
            this.filter = supergroupMembersFilter;
            this.offset = i;
            this.limit = i2;
        }
    }

    public static class GetSupportUser extends Function {
        public static final int CONSTRUCTOR = -1733497700;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetTemporaryPasswordState extends Function {
        public static final int CONSTRUCTOR = -12670830;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetTextEntities extends Function {
        public static final int CONSTRUCTOR = -341490693;
        public String text;

        public GetTextEntities() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetTextEntities(String str) {
            this.text = str;
        }
    }

    public static class GetTopChats extends Function {
        public static final int CONSTRUCTOR = -388410847;
        public TopChatCategory category;
        public int limit;

        public GetTopChats() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetTopChats(TopChatCategory topChatCategory, int i) {
            this.category = topChatCategory;
            this.limit = i;
        }
    }

    public static class GetTrendingStickerSets extends Function {
        public static final int CONSTRUCTOR = -1494581948;
        public int limit;
        public int offset;

        public GetTrendingStickerSets() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetTrendingStickerSets(int i, int i2) {
            this.offset = i;
            this.limit = i2;
        }
    }

    public static class GetUser extends Function {
        public static final int CONSTRUCTOR = 1117363211;
        public long userId;

        public GetUser() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetUser(long j) {
            this.userId = j;
        }
    }

    public static class GetUserFullInfo extends Function {
        public static final int CONSTRUCTOR = -776823720;
        public long userId;

        public GetUserFullInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetUserFullInfo(long j) {
            this.userId = j;
        }
    }

    public static class GetUserPrivacySettingRules extends Function {
        public static final int CONSTRUCTOR = -2077223311;
        public UserPrivacySetting setting;

        public GetUserPrivacySettingRules() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetUserPrivacySettingRules(UserPrivacySetting userPrivacySetting) {
            this.setting = userPrivacySetting;
        }
    }

    public static class GetUserProfilePhotos extends Function {
        public static final int CONSTRUCTOR = -908132798;
        public int limit;
        public int offset;
        public long userId;

        public GetUserProfilePhotos() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetUserProfilePhotos(long j, int i, int i2) {
            this.userId = j;
            this.offset = i;
            this.limit = i2;
        }
    }

    public static class GetVideoChatAvailableParticipants extends Function {
        public static final int CONSTRUCTOR = -1000496379;
        public long chatId;

        public GetVideoChatAvailableParticipants() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetVideoChatAvailableParticipants(long j) {
            this.chatId = j;
        }
    }

    public static class GetVideoChatRtmpUrl extends Function {
        public static final int CONSTRUCTOR = 1210784543;
        public long chatId;

        public GetVideoChatRtmpUrl() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetVideoChatRtmpUrl(long j) {
            this.chatId = j;
        }
    }

    public static class GetWebPageInstantView extends Function {
        public static final int CONSTRUCTOR = -1962649975;
        public boolean forceFull;
        public String url;

        public GetWebPageInstantView() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetWebPageInstantView(String str, boolean z) {
            this.url = str;
            this.forceFull = z;
        }
    }

    public static class GetWebPagePreview extends Function {
        public static final int CONSTRUCTOR = 573441580;
        public FormattedText text;

        public GetWebPagePreview() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GetWebPagePreview(FormattedText formattedText) {
            this.text = formattedText;
        }
    }

    public static class GroupCall extends Object {
        public static final int CONSTRUCTOR = -123443355;
        public boolean canBeManaged;
        public boolean canEnableVideo;
        public boolean canToggleMuteNewParticipants;
        public int duration;
        public boolean enabledStartNotification;
        public boolean hasHiddenListeners;
        public int f25376id;
        public boolean isActive;
        public boolean isJoined;
        public boolean isMyVideoEnabled;
        public boolean isMyVideoPaused;
        public boolean isRtmpStream;
        public boolean isVideoRecorded;
        public boolean loadedAllParticipants;
        public boolean muteNewParticipants;
        public boolean needRejoin;
        public int participantCount;
        public GroupCallRecentSpeaker[] recentSpeakers;
        public int recordDuration;
        public int scheduledStartDate;
        public String title;

        public GroupCall() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GroupCall(int i, String str, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i3, boolean z7, boolean z8, GroupCallRecentSpeaker[] groupCallRecentSpeakerArr, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i4, boolean z14, int i5) {
            this.f25376id = i;
            this.title = str;
            this.scheduledStartDate = i2;
            this.enabledStartNotification = z;
            this.isActive = z2;
            this.isRtmpStream = z3;
            this.isJoined = z4;
            this.needRejoin = z5;
            this.canBeManaged = z6;
            this.participantCount = i3;
            this.hasHiddenListeners = z7;
            this.loadedAllParticipants = z8;
            this.recentSpeakers = groupCallRecentSpeakerArr;
            this.isMyVideoEnabled = z9;
            this.isMyVideoPaused = z10;
            this.canEnableVideo = z11;
            this.muteNewParticipants = z12;
            this.canToggleMuteNewParticipants = z13;
            this.recordDuration = i4;
            this.isVideoRecorded = z14;
            this.duration = i5;
        }
    }

    public static class GroupCallId extends Object {
        public static final int CONSTRUCTOR = 350534469;
        public int f25377id;

        public GroupCallId() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GroupCallId(int i) {
            this.f25377id = i;
        }
    }

    public static class GroupCallParticipant extends Object {
        public static final int CONSTRUCTOR = 2059182571;
        public int audioSourceId;
        public String bio;
        public boolean canBeMutedForAllUsers;
        public boolean canBeMutedForCurrentUser;
        public boolean canBeUnmutedForAllUsers;
        public boolean canBeUnmutedForCurrentUser;
        public boolean canUnmuteSelf;
        public boolean isCurrentUser;
        public boolean isHandRaised;
        public boolean isMutedForAllUsers;
        public boolean isMutedForCurrentUser;
        public boolean isSpeaking;
        public String order;
        public MessageSender participantId;
        public int screenSharingAudioSourceId;
        public GroupCallParticipantVideoInfo screenSharingVideoInfo;
        public GroupCallParticipantVideoInfo videoInfo;
        public int volumeLevel;

        public GroupCallParticipant() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GroupCallParticipant(MessageSender messageSender, int i, int i2, GroupCallParticipantVideoInfo groupCallParticipantVideoInfo, GroupCallParticipantVideoInfo groupCallParticipantVideoInfo2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i3, String str2) {
            this.participantId = messageSender;
            this.audioSourceId = i;
            this.screenSharingAudioSourceId = i2;
            this.videoInfo = groupCallParticipantVideoInfo;
            this.screenSharingVideoInfo = groupCallParticipantVideoInfo2;
            this.bio = str;
            this.isCurrentUser = z;
            this.isSpeaking = z2;
            this.isHandRaised = z3;
            this.canBeMutedForAllUsers = z4;
            this.canBeUnmutedForAllUsers = z5;
            this.canBeMutedForCurrentUser = z6;
            this.canBeUnmutedForCurrentUser = z7;
            this.isMutedForAllUsers = z8;
            this.isMutedForCurrentUser = z9;
            this.canUnmuteSelf = z10;
            this.volumeLevel = i3;
            this.order = str2;
        }
    }

    public static class GroupCallParticipantVideoInfo extends Object {
        public static final int CONSTRUCTOR = -14294645;
        public String endpointId;
        public boolean isPaused;
        public GroupCallVideoSourceGroup[] sourceGroups;

        public GroupCallParticipantVideoInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GroupCallParticipantVideoInfo(GroupCallVideoSourceGroup[] groupCallVideoSourceGroupArr, String str, boolean z) {
            this.sourceGroups = groupCallVideoSourceGroupArr;
            this.endpointId = str;
            this.isPaused = z;
        }
    }

    public static class GroupCallRecentSpeaker extends Object {
        public static final int CONSTRUCTOR = 1819519436;
        public boolean isSpeaking;
        public MessageSender participantId;

        public GroupCallRecentSpeaker() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GroupCallRecentSpeaker(MessageSender messageSender, boolean z) {
            this.participantId = messageSender;
            this.isSpeaking = z;
        }
    }

    public static class GroupCallStream extends Object {
        public static final int CONSTRUCTOR = -264564795;
        public int channelId;
        public int scale;
        public long timeOffset;

        public GroupCallStream() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GroupCallStream(int i, int i2, long j) {
            this.channelId = i;
            this.scale = i2;
            this.timeOffset = j;
        }
    }

    public static class GroupCallStreams extends Object {
        public static final int CONSTRUCTOR = -1032959578;
        public GroupCallStream[] streams;

        public GroupCallStreams() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GroupCallStreams(GroupCallStream[] groupCallStreamArr) {
            this.streams = groupCallStreamArr;
        }
    }

    public static abstract class GroupCallVideoQuality extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class GroupCallVideoQualityFull extends GroupCallVideoQuality {
        public static final int CONSTRUCTOR = -2125916617;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GroupCallVideoQualityMedium extends GroupCallVideoQuality {
        public static final int CONSTRUCTOR = 394968234;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GroupCallVideoQualityThumbnail extends GroupCallVideoQuality {
        public static final int CONSTRUCTOR = -379186304;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GroupCallVideoSourceGroup extends Object {
        public static final int CONSTRUCTOR = -1190900785;
        public String semantics;
        public int[] sourceIds;

        public GroupCallVideoSourceGroup() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public GroupCallVideoSourceGroup(String str, int[] iArr) {
            this.semantics = str;
            this.sourceIds = iArr;
        }
    }

    public static class Hashtags extends Object {
        public static final int CONSTRUCTOR = 676798885;
        public String[] hashtags;

        public Hashtags() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Hashtags(String[] strArr) {
            this.hashtags = strArr;
        }
    }

    public static class HideSuggestedAction extends Function {
        public static final int CONSTRUCTOR = -1561384065;
        public SuggestedAction action;

        public HideSuggestedAction() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public HideSuggestedAction(SuggestedAction suggestedAction) {
            this.action = suggestedAction;
        }
    }

    public static class HttpUrl extends Object {
        public static final int CONSTRUCTOR = -2018019930;
        public String url;

        public HttpUrl() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public HttpUrl(String str) {
            this.url = str;
        }
    }

    public static class IdentityDocument extends Object {
        public static final int CONSTRUCTOR = 445952972;
        public Date expiryDate;
        public DatedFile frontSide;
        public String number;
        public DatedFile reverseSide;
        public DatedFile selfie;
        public DatedFile[] translation;

        public IdentityDocument() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public IdentityDocument(String str, Date date, DatedFile datedFile, DatedFile datedFile2, DatedFile datedFile3, DatedFile[] datedFileArr) {
            this.number = str;
            this.expiryDate = date;
            this.frontSide = datedFile;
            this.reverseSide = datedFile2;
            this.selfie = datedFile3;
            this.translation = datedFileArr;
        }
    }

    public static class ImportContacts extends Function {
        public static final int CONSTRUCTOR = -215132767;
        public Contact[] contacts;

        public ImportContacts() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ImportContacts(Contact[] contactArr) {
            this.contacts = contactArr;
        }
    }

    public static class ImportMessages extends Function {
        public static final int CONSTRUCTOR = -1864116784;
        public InputFile[] attachedFiles;
        public long chatId;
        public InputFile messageFile;

        public ImportMessages() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ImportMessages(long j, InputFile inputFile, InputFile[] inputFileArr) {
            this.chatId = j;
            this.messageFile = inputFile;
            this.attachedFiles = inputFileArr;
        }
    }

    public static class ImportedContacts extends Object {
        public static final int CONSTRUCTOR = 2068432290;
        public int[] importerCount;
        public long[] userIds;

        public ImportedContacts() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ImportedContacts(long[] jArr, int[] iArr) {
            this.userIds = jArr;
            this.importerCount = iArr;
        }
    }

    public static class InlineKeyboardButton extends Object {
        public static final int CONSTRUCTOR = -372105704;
        public String text;
        public InlineKeyboardButtonType type;

        public InlineKeyboardButton() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InlineKeyboardButton(String str, InlineKeyboardButtonType inlineKeyboardButtonType) {
            this.text = str;
            this.type = inlineKeyboardButtonType;
        }
    }

    public static abstract class InlineKeyboardButtonType extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class InlineKeyboardButtonTypeBuy extends InlineKeyboardButtonType {
        public static final int CONSTRUCTOR = 1360739440;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InlineKeyboardButtonTypeCallback extends InlineKeyboardButtonType {
        public static final int CONSTRUCTOR = -1127515139;
        public byte[] data;

        public InlineKeyboardButtonTypeCallback() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InlineKeyboardButtonTypeCallback(byte[] bArr) {
            this.data = bArr;
        }
    }

    public static class InlineKeyboardButtonTypeCallbackGame extends InlineKeyboardButtonType {
        public static final int CONSTRUCTOR = -383429528;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InlineKeyboardButtonTypeCallbackWithPassword extends InlineKeyboardButtonType {
        public static final int CONSTRUCTOR = 908018248;
        public byte[] data;

        public InlineKeyboardButtonTypeCallbackWithPassword() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InlineKeyboardButtonTypeCallbackWithPassword(byte[] bArr) {
            this.data = bArr;
        }
    }

    public static class InlineKeyboardButtonTypeLoginUrl extends InlineKeyboardButtonType {
        public static final int CONSTRUCTOR = -1203413081;
        public String forwardText;
        public long f25378id;
        public String url;

        public InlineKeyboardButtonTypeLoginUrl() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InlineKeyboardButtonTypeLoginUrl(String str, long j, String str2) {
            this.url = str;
            this.f25378id = j;
            this.forwardText = str2;
        }
    }

    public static class InlineKeyboardButtonTypeSwitchInline extends InlineKeyboardButtonType {
        public static final int CONSTRUCTOR = -2035563307;
        public boolean inCurrentChat;
        public String query;

        public InlineKeyboardButtonTypeSwitchInline() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InlineKeyboardButtonTypeSwitchInline(String str, boolean z) {
            this.query = str;
            this.inCurrentChat = z;
        }
    }

    public static class InlineKeyboardButtonTypeUrl extends InlineKeyboardButtonType {
        public static final int CONSTRUCTOR = 1130741420;
        public String url;

        public InlineKeyboardButtonTypeUrl() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InlineKeyboardButtonTypeUrl(String str) {
            this.url = str;
        }
    }

    public static class InlineKeyboardButtonTypeUser extends InlineKeyboardButtonType {
        public static final int CONSTRUCTOR = 1836574114;
        public long userId;

        public InlineKeyboardButtonTypeUser() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InlineKeyboardButtonTypeUser(long j) {
            this.userId = j;
        }
    }

    public static abstract class InlineQueryResult extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class InlineQueryResultAnimation extends InlineQueryResult {
        public static final int CONSTRUCTOR = 2009984267;
        public Animation animation;
        public String f25379id;
        public String title;

        public InlineQueryResultAnimation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InlineQueryResultAnimation(String str, Animation animation, String str2) {
            this.f25379id = str;
            this.animation = animation;
            this.title = str2;
        }
    }

    public static class InlineQueryResultArticle extends InlineQueryResult {
        public static final int CONSTRUCTOR = 206340825;
        public String description;
        public boolean hideUrl;
        public String f25380id;
        public Thumbnail thumbnail;
        public String title;
        public String url;

        public InlineQueryResultArticle() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InlineQueryResultArticle(String str, String str2, boolean z, String str3, String str4, Thumbnail thumbnail) {
            this.f25380id = str;
            this.url = str2;
            this.hideUrl = z;
            this.title = str3;
            this.description = str4;
            this.thumbnail = thumbnail;
        }
    }

    public static class InlineQueryResultAudio extends InlineQueryResult {
        public static final int CONSTRUCTOR = 842650360;
        public Audio audio;
        public String f25381id;

        public InlineQueryResultAudio() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InlineQueryResultAudio(String str, Audio audio) {
            this.f25381id = str;
            this.audio = audio;
        }
    }

    public static class InlineQueryResultContact extends InlineQueryResult {
        public static final int CONSTRUCTOR = -181960174;
        public Contact contact;
        public String f25382id;
        public Thumbnail thumbnail;

        public InlineQueryResultContact() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InlineQueryResultContact(String str, Contact contact, Thumbnail thumbnail) {
            this.f25382id = str;
            this.contact = contact;
            this.thumbnail = thumbnail;
        }
    }

    public static class InlineQueryResultDocument extends InlineQueryResult {
        public static final int CONSTRUCTOR = -1491268539;
        public String description;
        public Document document;
        public String f25383id;
        public String title;

        public InlineQueryResultDocument() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InlineQueryResultDocument(String str, Document document, String str2, String str3) {
            this.f25383id = str;
            this.document = document;
            this.title = str2;
            this.description = str3;
        }
    }

    public static class InlineQueryResultGame extends InlineQueryResult {
        public static final int CONSTRUCTOR = 1706916987;
        public Game game;
        public String f25384id;

        public InlineQueryResultGame() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InlineQueryResultGame(String str, Game game) {
            this.f25384id = str;
            this.game = game;
        }
    }

    public static class InlineQueryResultLocation extends InlineQueryResult {
        public static final int CONSTRUCTOR = 466004752;
        public String f25385id;
        public Location location;
        public Thumbnail thumbnail;
        public String title;

        public InlineQueryResultLocation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InlineQueryResultLocation(String str, Location location, String str2, Thumbnail thumbnail) {
            this.f25385id = str;
            this.location = location;
            this.title = str2;
            this.thumbnail = thumbnail;
        }
    }

    public static class InlineQueryResultPhoto extends InlineQueryResult {
        public static final int CONSTRUCTOR = 1848319440;
        public String description;
        public String f25386id;
        public Photo photo;
        public String title;

        public InlineQueryResultPhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InlineQueryResultPhoto(String str, Photo photo, String str2, String str3) {
            this.f25386id = str;
            this.photo = photo;
            this.title = str2;
            this.description = str3;
        }
    }

    public static class InlineQueryResultSticker extends InlineQueryResult {
        public static final int CONSTRUCTOR = -1848224245;
        public String f25387id;
        public Sticker sticker;

        public InlineQueryResultSticker() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InlineQueryResultSticker(String str, Sticker sticker) {
            this.f25387id = str;
            this.sticker = sticker;
        }
    }

    public static class InlineQueryResultVenue extends InlineQueryResult {
        public static final int CONSTRUCTOR = 1281036382;
        public String f25388id;
        public Thumbnail thumbnail;
        public Venue venue;

        public InlineQueryResultVenue() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InlineQueryResultVenue(String str, Venue venue, Thumbnail thumbnail) {
            this.f25388id = str;
            this.venue = venue;
            this.thumbnail = thumbnail;
        }
    }

    public static class InlineQueryResultVideo extends InlineQueryResult {
        public static final int CONSTRUCTOR = -1373158683;
        public String description;
        public String f25389id;
        public String title;
        public Video video;

        public InlineQueryResultVideo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InlineQueryResultVideo(String str, Video video, String str2, String str3) {
            this.f25389id = str;
            this.video = video;
            this.title = str2;
            this.description = str3;
        }
    }

    public static class InlineQueryResultVoiceNote extends InlineQueryResult {
        public static final int CONSTRUCTOR = -1897393105;
        public String f25390id;
        public String title;
        public VoiceNote voiceNote;

        public InlineQueryResultVoiceNote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InlineQueryResultVoiceNote(String str, VoiceNote voiceNote, String str2) {
            this.f25390id = str;
            this.voiceNote = voiceNote;
            this.title = str2;
        }
    }

    public static class InlineQueryResults extends Object {
        public static final int CONSTRUCTOR = 1000709656;
        public long inlineQueryId;
        public String nextOffset;
        public InlineQueryResult[] results;
        public String switchPmParameter;
        public String switchPmText;

        public InlineQueryResults() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InlineQueryResults(long j, String str, InlineQueryResult[] inlineQueryResultArr, String str2, String str3) {
            this.inlineQueryId = j;
            this.nextOffset = str;
            this.results = inlineQueryResultArr;
            this.switchPmText = str2;
            this.switchPmParameter = str3;
        }
    }

    public static abstract class InputBackground extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class InputBackgroundLocal extends InputBackground {
        public static final int CONSTRUCTOR = -1747094364;
        public InputFile background;

        public InputBackgroundLocal() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputBackgroundLocal(InputFile inputFile) {
            this.background = inputFile;
        }
    }

    public static class InputBackgroundRemote extends InputBackground {
        public static final int CONSTRUCTOR = -274976231;
        public long backgroundId;

        public InputBackgroundRemote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputBackgroundRemote(long j) {
            this.backgroundId = j;
        }
    }

    public static abstract class InputChatPhoto extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class InputChatPhotoAnimation extends InputChatPhoto {
        public static final int CONSTRUCTOR = 90846242;
        public InputFile animation;
        public double mainFrameTimestamp;

        public InputChatPhotoAnimation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputChatPhotoAnimation(InputFile inputFile, double d) {
            this.animation = inputFile;
            this.mainFrameTimestamp = d;
        }
    }

    public static class InputChatPhotoPrevious extends InputChatPhoto {
        public static final int CONSTRUCTOR = 23128529;
        public long chatPhotoId;

        public InputChatPhotoPrevious() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputChatPhotoPrevious(long j) {
            this.chatPhotoId = j;
        }
    }

    public static class InputChatPhotoStatic extends InputChatPhoto {
        public static final int CONSTRUCTOR = 1979179699;
        public InputFile photo;

        public InputChatPhotoStatic() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputChatPhotoStatic(InputFile inputFile) {
            this.photo = inputFile;
        }
    }

    public static abstract class InputCredentials extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class InputCredentialsApplePay extends InputCredentials {
        public static final int CONSTRUCTOR = -1246570799;
        public String data;

        public InputCredentialsApplePay() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputCredentialsApplePay(String str) {
            this.data = str;
        }
    }

    public static class InputCredentialsGooglePay extends InputCredentials {
        public static final int CONSTRUCTOR = 844384100;
        public String data;

        public InputCredentialsGooglePay() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputCredentialsGooglePay(String str) {
            this.data = str;
        }
    }

    public static class InputCredentialsNew extends InputCredentials {
        public static final int CONSTRUCTOR = -829689558;
        public boolean allowSave;
        public String data;

        public InputCredentialsNew() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputCredentialsNew(String str, boolean z) {
            this.data = str;
            this.allowSave = z;
        }
    }

    public static class InputCredentialsSaved extends InputCredentials {
        public static final int CONSTRUCTOR = -2034385364;
        public String savedCredentialsId;

        public InputCredentialsSaved() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputCredentialsSaved(String str) {
            this.savedCredentialsId = str;
        }
    }

    public static abstract class InputFile extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class InputFileGenerated extends InputFile {
        public static final int CONSTRUCTOR = -1781351885;
        public String conversion;
        public int expectedSize;
        public String originalPath;

        public InputFileGenerated() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputFileGenerated(String str, String str2, int i) {
            this.originalPath = str;
            this.conversion = str2;
            this.expectedSize = i;
        }
    }

    public static class InputFileId extends InputFile {
        public static final int CONSTRUCTOR = 1788906253;
        public int f25391id;

        public InputFileId() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputFileId(int i) {
            this.f25391id = i;
        }
    }

    public static class InputFileLocal extends InputFile {
        public static final int CONSTRUCTOR = 2056030919;
        public String path;

        public InputFileLocal() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputFileLocal(String str) {
            this.path = str;
        }
    }

    public static class InputFileRemote extends InputFile {
        public static final int CONSTRUCTOR = -107574466;
        public String f25392id;

        public InputFileRemote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputFileRemote(String str) {
            this.f25392id = str;
        }
    }

    public static class InputIdentityDocument extends Object {
        public static final int CONSTRUCTOR = -381776063;
        public Date expiryDate;
        public InputFile frontSide;
        public String number;
        public InputFile reverseSide;
        public InputFile selfie;
        public InputFile[] translation;

        public InputIdentityDocument() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputIdentityDocument(String str, Date date, InputFile inputFile, InputFile inputFile2, InputFile inputFile3, InputFile[] inputFileArr) {
            this.number = str;
            this.expiryDate = date;
            this.frontSide = inputFile;
            this.reverseSide = inputFile2;
            this.selfie = inputFile3;
            this.translation = inputFileArr;
        }
    }

    public static abstract class InputInlineQueryResult extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class InputInlineQueryResultAnimation extends InputInlineQueryResult {
        public static final int CONSTRUCTOR = -1489808874;
        public String f25393id;
        public InputMessageContent inputMessageContent;
        public ReplyMarkup replyMarkup;
        public String thumbnailMimeType;
        public String thumbnailUrl;
        public String title;
        public int videoDuration;
        public int videoHeight;
        public String videoMimeType;
        public String videoUrl;
        public int videoWidth;

        public InputInlineQueryResultAnimation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputInlineQueryResultAnimation(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.f25393id = str;
            this.title = str2;
            this.thumbnailUrl = str3;
            this.thumbnailMimeType = str4;
            this.videoUrl = str5;
            this.videoMimeType = str6;
            this.videoDuration = i;
            this.videoWidth = i2;
            this.videoHeight = i3;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }
    }

    public static class InputInlineQueryResultArticle extends InputInlineQueryResult {
        public static final int CONSTRUCTOR = 1973670156;
        public String description;
        public boolean hideUrl;
        public String f25394id;
        public InputMessageContent inputMessageContent;
        public ReplyMarkup replyMarkup;
        public int thumbnailHeight;
        public String thumbnailUrl;
        public int thumbnailWidth;
        public String title;
        public String url;

        public InputInlineQueryResultArticle() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputInlineQueryResultArticle(String str, String str2, boolean z, String str3, String str4, String str5, int i, int i2, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.f25394id = str;
            this.url = str2;
            this.hideUrl = z;
            this.title = str3;
            this.description = str4;
            this.thumbnailUrl = str5;
            this.thumbnailWidth = i;
            this.thumbnailHeight = i2;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }
    }

    public static class InputInlineQueryResultAudio extends InputInlineQueryResult {
        public static final int CONSTRUCTOR = 1260139988;
        public int audioDuration;
        public String audioUrl;
        public String f25395id;
        public InputMessageContent inputMessageContent;
        public String performer;
        public ReplyMarkup replyMarkup;
        public String title;

        public InputInlineQueryResultAudio() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputInlineQueryResultAudio(String str, String str2, String str3, String str4, int i, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.f25395id = str;
            this.title = str2;
            this.performer = str3;
            this.audioUrl = str4;
            this.audioDuration = i;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }
    }

    public static class InputInlineQueryResultContact extends InputInlineQueryResult {
        public static final int CONSTRUCTOR = 1846064594;
        public Contact contact;
        public String f25396id;
        public InputMessageContent inputMessageContent;
        public ReplyMarkup replyMarkup;
        public int thumbnailHeight;
        public String thumbnailUrl;
        public int thumbnailWidth;

        public InputInlineQueryResultContact() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputInlineQueryResultContact(String str, Contact contact, String str2, int i, int i2, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.f25396id = str;
            this.contact = contact;
            this.thumbnailUrl = str2;
            this.thumbnailWidth = i;
            this.thumbnailHeight = i2;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }
    }

    public static class InputInlineQueryResultDocument extends InputInlineQueryResult {
        public static final int CONSTRUCTOR = 578801869;
        public String description;
        public String documentUrl;
        public String f25397id;
        public InputMessageContent inputMessageContent;
        public String mimeType;
        public ReplyMarkup replyMarkup;
        public int thumbnailHeight;
        public String thumbnailUrl;
        public int thumbnailWidth;
        public String title;

        public InputInlineQueryResultDocument() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputInlineQueryResultDocument(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.f25397id = str;
            this.title = str2;
            this.description = str3;
            this.documentUrl = str4;
            this.mimeType = str5;
            this.thumbnailUrl = str6;
            this.thumbnailWidth = i;
            this.thumbnailHeight = i2;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }
    }

    public static class InputInlineQueryResultGame extends InputInlineQueryResult {
        public static final int CONSTRUCTOR = 966074327;
        public String gameShortName;
        public String f25398id;
        public ReplyMarkup replyMarkup;

        public InputInlineQueryResultGame() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputInlineQueryResultGame(String str, String str2, ReplyMarkup replyMarkup) {
            this.f25398id = str;
            this.gameShortName = str2;
            this.replyMarkup = replyMarkup;
        }
    }

    public static class InputInlineQueryResultLocation extends InputInlineQueryResult {
        public static final int CONSTRUCTOR = -1887650218;
        public String f25399id;
        public InputMessageContent inputMessageContent;
        public int livePeriod;
        public Location location;
        public ReplyMarkup replyMarkup;
        public int thumbnailHeight;
        public String thumbnailUrl;
        public int thumbnailWidth;
        public String title;

        public InputInlineQueryResultLocation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputInlineQueryResultLocation(String str, Location location, int i, String str2, String str3, int i2, int i3, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.f25399id = str;
            this.location = location;
            this.livePeriod = i;
            this.title = str2;
            this.thumbnailUrl = str3;
            this.thumbnailWidth = i2;
            this.thumbnailHeight = i3;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }
    }

    public static class InputInlineQueryResultPhoto extends InputInlineQueryResult {
        public static final int CONSTRUCTOR = -1123338721;
        public String description;
        public String f25400id;
        public InputMessageContent inputMessageContent;
        public int photoHeight;
        public String photoUrl;
        public int photoWidth;
        public ReplyMarkup replyMarkup;
        public String thumbnailUrl;
        public String title;

        public InputInlineQueryResultPhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputInlineQueryResultPhoto(String str, String str2, String str3, String str4, String str5, int i, int i2, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.f25400id = str;
            this.title = str2;
            this.description = str3;
            this.thumbnailUrl = str4;
            this.photoUrl = str5;
            this.photoWidth = i;
            this.photoHeight = i2;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }
    }

    public static class InputInlineQueryResultSticker extends InputInlineQueryResult {
        public static final int CONSTRUCTOR = 274007129;
        public String f25401id;
        public InputMessageContent inputMessageContent;
        public ReplyMarkup replyMarkup;
        public int stickerHeight;
        public String stickerUrl;
        public int stickerWidth;
        public String thumbnailUrl;

        public InputInlineQueryResultSticker() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputInlineQueryResultSticker(String str, String str2, String str3, int i, int i2, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.f25401id = str;
            this.thumbnailUrl = str2;
            this.stickerUrl = str3;
            this.stickerWidth = i;
            this.stickerHeight = i2;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }
    }

    public static class InputInlineQueryResultVenue extends InputInlineQueryResult {
        public static final int CONSTRUCTOR = 541704509;
        public String f25402id;
        public InputMessageContent inputMessageContent;
        public ReplyMarkup replyMarkup;
        public int thumbnailHeight;
        public String thumbnailUrl;
        public int thumbnailWidth;
        public Venue venue;

        public InputInlineQueryResultVenue() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputInlineQueryResultVenue(String str, Venue venue, String str2, int i, int i2, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.f25402id = str;
            this.venue = venue;
            this.thumbnailUrl = str2;
            this.thumbnailWidth = i;
            this.thumbnailHeight = i2;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }
    }

    public static class InputInlineQueryResultVideo extends InputInlineQueryResult {
        public static final int CONSTRUCTOR = 1724073191;
        public String description;
        public String f25403id;
        public InputMessageContent inputMessageContent;
        public String mimeType;
        public ReplyMarkup replyMarkup;
        public String thumbnailUrl;
        public String title;
        public int videoDuration;
        public int videoHeight;
        public String videoUrl;
        public int videoWidth;

        public InputInlineQueryResultVideo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputInlineQueryResultVideo(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.f25403id = str;
            this.title = str2;
            this.description = str3;
            this.thumbnailUrl = str4;
            this.videoUrl = str5;
            this.mimeType = str6;
            this.videoWidth = i;
            this.videoHeight = i2;
            this.videoDuration = i3;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }
    }

    public static class InputInlineQueryResultVoiceNote extends InputInlineQueryResult {
        public static final int CONSTRUCTOR = -1790072503;
        public String f25404id;
        public InputMessageContent inputMessageContent;
        public ReplyMarkup replyMarkup;
        public String title;
        public int voiceNoteDuration;
        public String voiceNoteUrl;

        public InputInlineQueryResultVoiceNote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputInlineQueryResultVoiceNote(String str, String str2, String str3, int i, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.f25404id = str;
            this.title = str2;
            this.voiceNoteUrl = str3;
            this.voiceNoteDuration = i;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }
    }

    public static class InputMessageAnimation extends InputMessageContent {
        public static final int CONSTRUCTOR = 1208433535;
        public int[] addedStickerFileIds;
        public InputFile animation;
        public FormattedText caption;
        public int duration;
        public int height;
        public InputThumbnail thumbnail;
        public int width;

        public InputMessageAnimation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputMessageAnimation(InputFile inputFile, InputThumbnail inputThumbnail, int[] iArr, int i, int i2, int i3, FormattedText formattedText) {
            this.animation = inputFile;
            this.thumbnail = inputThumbnail;
            this.addedStickerFileIds = iArr;
            this.duration = i;
            this.width = i2;
            this.height = i3;
            this.caption = formattedText;
        }
    }

    public static class InputMessageAudio extends InputMessageContent {
        public static final int CONSTRUCTOR = -626786126;
        public InputThumbnail albumCoverThumbnail;
        public InputFile audio;
        public FormattedText caption;
        public int duration;
        public String performer;
        public String title;

        public InputMessageAudio() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputMessageAudio(InputFile inputFile, InputThumbnail inputThumbnail, int i, String str, String str2, FormattedText formattedText) {
            this.audio = inputFile;
            this.albumCoverThumbnail = inputThumbnail;
            this.duration = i;
            this.title = str;
            this.performer = str2;
            this.caption = formattedText;
        }
    }

    public static class InputMessageContact extends InputMessageContent {
        public static final int CONSTRUCTOR = -982446849;
        public Contact contact;

        public InputMessageContact() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputMessageContact(Contact contact) {
            this.contact = contact;
        }
    }

    public static abstract class InputMessageContent extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class InputMessageDice extends InputMessageContent {
        public static final int CONSTRUCTOR = 841574313;
        public boolean clearDraft;
        public String emoji;

        public InputMessageDice() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputMessageDice(String str, boolean z) {
            this.emoji = str;
            this.clearDraft = z;
        }
    }

    public static class InputMessageDocument extends InputMessageContent {
        public static final int CONSTRUCTOR = 1633383097;
        public FormattedText caption;
        public boolean disableContentTypeDetection;
        public InputFile document;
        public InputThumbnail thumbnail;

        public InputMessageDocument() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputMessageDocument(InputFile inputFile, InputThumbnail inputThumbnail, boolean z, FormattedText formattedText) {
            this.document = inputFile;
            this.thumbnail = inputThumbnail;
            this.disableContentTypeDetection = z;
            this.caption = formattedText;
        }
    }

    public static class InputMessageForwarded extends InputMessageContent {
        public static final int CONSTRUCTOR = 1696232440;
        public MessageCopyOptions copyOptions;
        public long fromChatId;
        public boolean inGameShare;
        public long messageId;

        public InputMessageForwarded() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputMessageForwarded(long j, long j2, boolean z, MessageCopyOptions messageCopyOptions) {
            this.fromChatId = j;
            this.messageId = j2;
            this.inGameShare = z;
            this.copyOptions = messageCopyOptions;
        }
    }

    public static class InputMessageGame extends InputMessageContent {
        public static final int CONSTRUCTOR = 1252944610;
        public long botUserId;
        public String gameShortName;

        public InputMessageGame() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputMessageGame(long j, String str) {
            this.botUserId = j;
            this.gameShortName = str;
        }
    }

    public static class InputMessageInvoice extends InputMessageContent {
        public static final int CONSTRUCTOR = 1038812175;
        public String description;
        public Invoice invoice;
        public byte[] payload;
        public int photoHeight;
        public int photoSize;
        public String photoUrl;
        public int photoWidth;
        public String providerData;
        public String providerToken;
        public String startParameter;
        public String title;

        public InputMessageInvoice() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputMessageInvoice(Invoice invoice, String str, String str2, String str3, int i, int i2, int i3, byte[] bArr, String str4, String str5, String str6) {
            this.invoice = invoice;
            this.title = str;
            this.description = str2;
            this.photoUrl = str3;
            this.photoSize = i;
            this.photoWidth = i2;
            this.photoHeight = i3;
            this.payload = bArr;
            this.providerToken = str4;
            this.providerData = str5;
            this.startParameter = str6;
        }
    }

    public static class InputMessageLocation extends InputMessageContent {
        public static final int CONSTRUCTOR = 648735088;
        public int heading;
        public int livePeriod;
        public Location location;
        public int proximityAlertRadius;

        public InputMessageLocation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputMessageLocation(Location location, int i, int i2, int i3) {
            this.location = location;
            this.livePeriod = i;
            this.heading = i2;
            this.proximityAlertRadius = i3;
        }
    }

    public static class InputMessagePhoto extends InputMessageContent {
        public static final int CONSTRUCTOR = 1648801584;
        public int[] addedStickerFileIds;
        public FormattedText caption;
        public int height;
        public InputFile photo;
        public InputThumbnail thumbnail;
        public int ttl;
        public int width;

        public InputMessagePhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputMessagePhoto(InputFile inputFile, InputThumbnail inputThumbnail, int[] iArr, int i, int i2, FormattedText formattedText, int i3) {
            this.photo = inputFile;
            this.thumbnail = inputThumbnail;
            this.addedStickerFileIds = iArr;
            this.width = i;
            this.height = i2;
            this.caption = formattedText;
            this.ttl = i3;
        }
    }

    public static class InputMessagePoll extends InputMessageContent {
        public static final int CONSTRUCTOR = 2054629900;
        public int closeDate;
        public boolean isAnonymous;
        public boolean isClosed;
        public int openPeriod;
        public String[] options;
        public String question;
        public PollType type;

        public InputMessagePoll() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputMessagePoll(String str, String[] strArr, boolean z, PollType pollType, int i, int i2, boolean z2) {
            this.question = str;
            this.options = strArr;
            this.isAnonymous = z;
            this.type = pollType;
            this.openPeriod = i;
            this.closeDate = i2;
            this.isClosed = z2;
        }
    }

    public static class InputMessageSticker extends InputMessageContent {
        public static final int CONSTRUCTOR = 1072805625;
        public String emoji;
        public int height;
        public InputFile sticker;
        public InputThumbnail thumbnail;
        public int width;

        public InputMessageSticker() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputMessageSticker(InputFile inputFile, InputThumbnail inputThumbnail, int i, int i2, String str) {
            this.sticker = inputFile;
            this.thumbnail = inputThumbnail;
            this.width = i;
            this.height = i2;
            this.emoji = str;
        }
    }

    public static class InputMessageText extends InputMessageContent {
        public static final int CONSTRUCTOR = 247050392;
        public boolean clearDraft;
        public boolean disableWebPagePreview;
        public FormattedText text;

        public InputMessageText() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputMessageText(FormattedText formattedText, boolean z, boolean z2) {
            this.text = formattedText;
            this.disableWebPagePreview = z;
            this.clearDraft = z2;
        }
    }

    public static class InputMessageVenue extends InputMessageContent {
        public static final int CONSTRUCTOR = 1447926269;
        public Venue venue;

        public InputMessageVenue() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputMessageVenue(Venue venue) {
            this.venue = venue;
        }
    }

    public static class InputMessageVideo extends InputMessageContent {
        public static final int CONSTRUCTOR = -2108486755;
        public int[] addedStickerFileIds;
        public FormattedText caption;
        public int duration;
        public int height;
        public boolean supportsStreaming;
        public InputThumbnail thumbnail;
        public int ttl;
        public InputFile video;
        public int width;

        public InputMessageVideo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputMessageVideo(InputFile inputFile, InputThumbnail inputThumbnail, int[] iArr, int i, int i2, int i3, boolean z, FormattedText formattedText, int i4) {
            this.video = inputFile;
            this.thumbnail = inputThumbnail;
            this.addedStickerFileIds = iArr;
            this.duration = i;
            this.width = i2;
            this.height = i3;
            this.supportsStreaming = z;
            this.caption = formattedText;
            this.ttl = i4;
        }
    }

    public static class InputMessageVideoNote extends InputMessageContent {
        public static final int CONSTRUCTOR = 279108859;
        public int duration;
        public int length;
        public InputThumbnail thumbnail;
        public InputFile videoNote;

        public InputMessageVideoNote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputMessageVideoNote(InputFile inputFile, InputThumbnail inputThumbnail, int i, int i2) {
            this.videoNote = inputFile;
            this.thumbnail = inputThumbnail;
            this.duration = i;
            this.length = i2;
        }
    }

    public static class InputMessageVoiceNote extends InputMessageContent {
        public static final int CONSTRUCTOR = 2136519657;
        public FormattedText caption;
        public int duration;
        public InputFile voiceNote;
        public byte[] waveform;

        public InputMessageVoiceNote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputMessageVoiceNote(InputFile inputFile, int i, byte[] bArr, FormattedText formattedText) {
            this.voiceNote = inputFile;
            this.duration = i;
            this.waveform = bArr;
            this.caption = formattedText;
        }
    }

    public static abstract class InputPassportElement extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class InputPassportElementAddress extends InputPassportElement {
        public static final int CONSTRUCTOR = 461630480;
        public Address address;

        public InputPassportElementAddress() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputPassportElementAddress(Address address) {
            this.address = address;
        }
    }

    public static class InputPassportElementBankStatement extends InputPassportElement {
        public static final int CONSTRUCTOR = -26585208;
        public InputPersonalDocument bankStatement;

        public InputPassportElementBankStatement() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputPassportElementBankStatement(InputPersonalDocument inputPersonalDocument) {
            this.bankStatement = inputPersonalDocument;
        }
    }

    public static class InputPassportElementDriverLicense extends InputPassportElement {
        public static final int CONSTRUCTOR = 304813264;
        public InputIdentityDocument driverLicense;

        public InputPassportElementDriverLicense() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputPassportElementDriverLicense(InputIdentityDocument inputIdentityDocument) {
            this.driverLicense = inputIdentityDocument;
        }
    }

    public static class InputPassportElementEmailAddress extends InputPassportElement {
        public static final int CONSTRUCTOR = -248605659;
        public String emailAddress;

        public InputPassportElementEmailAddress() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputPassportElementEmailAddress(String str) {
            this.emailAddress = str;
        }
    }

    public static class InputPassportElementError extends Object {
        public static final int CONSTRUCTOR = 285756898;
        public String message;
        public InputPassportElementErrorSource source;
        public PassportElementType type;

        public InputPassportElementError() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputPassportElementError(PassportElementType passportElementType, String str, InputPassportElementErrorSource inputPassportElementErrorSource) {
            this.type = passportElementType;
            this.message = str;
            this.source = inputPassportElementErrorSource;
        }
    }

    public static abstract class InputPassportElementErrorSource extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class InputPassportElementErrorSourceDataField extends InputPassportElementErrorSource {
        public static final int CONSTRUCTOR = -426795002;
        public byte[] dataHash;
        public String fieldName;

        public InputPassportElementErrorSourceDataField() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputPassportElementErrorSourceDataField(String str, byte[] bArr) {
            this.fieldName = str;
            this.dataHash = bArr;
        }
    }

    public static class InputPassportElementErrorSourceFile extends InputPassportElementErrorSource {
        public static final int CONSTRUCTOR = -298492469;
        public byte[] fileHash;

        public InputPassportElementErrorSourceFile() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputPassportElementErrorSourceFile(byte[] bArr) {
            this.fileHash = bArr;
        }
    }

    public static class InputPassportElementErrorSourceFiles extends InputPassportElementErrorSource {
        public static final int CONSTRUCTOR = -2008541640;
        public byte[][] fileHashes;

        public InputPassportElementErrorSourceFiles() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputPassportElementErrorSourceFiles(byte[][] bArr) {
            this.fileHashes = bArr;
        }
    }

    public static class InputPassportElementErrorSourceFrontSide extends InputPassportElementErrorSource {
        public static final int CONSTRUCTOR = 588023741;
        public byte[] fileHash;

        public InputPassportElementErrorSourceFrontSide() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputPassportElementErrorSourceFrontSide(byte[] bArr) {
            this.fileHash = bArr;
        }
    }

    public static class InputPassportElementErrorSourceReverseSide extends InputPassportElementErrorSource {
        public static final int CONSTRUCTOR = 413072891;
        public byte[] fileHash;

        public InputPassportElementErrorSourceReverseSide() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputPassportElementErrorSourceReverseSide(byte[] bArr) {
            this.fileHash = bArr;
        }
    }

    public static class InputPassportElementErrorSourceSelfie extends InputPassportElementErrorSource {
        public static final int CONSTRUCTOR = -773575528;
        public byte[] fileHash;

        public InputPassportElementErrorSourceSelfie() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputPassportElementErrorSourceSelfie(byte[] bArr) {
            this.fileHash = bArr;
        }
    }

    public static class InputPassportElementErrorSourceTranslationFile extends InputPassportElementErrorSource {
        public static final int CONSTRUCTOR = 505842299;
        public byte[] fileHash;

        public InputPassportElementErrorSourceTranslationFile() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputPassportElementErrorSourceTranslationFile(byte[] bArr) {
            this.fileHash = bArr;
        }
    }

    public static class InputPassportElementErrorSourceTranslationFiles extends InputPassportElementErrorSource {
        public static final int CONSTRUCTOR = -527254048;
        public byte[][] fileHashes;

        public InputPassportElementErrorSourceTranslationFiles() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputPassportElementErrorSourceTranslationFiles(byte[][] bArr) {
            this.fileHashes = bArr;
        }
    }

    public static class InputPassportElementErrorSourceUnspecified extends InputPassportElementErrorSource {
        public static final int CONSTRUCTOR = 267230319;
        public byte[] elementHash;

        public InputPassportElementErrorSourceUnspecified() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputPassportElementErrorSourceUnspecified(byte[] bArr) {
            this.elementHash = bArr;
        }
    }

    public static class InputPassportElementIdentityCard extends InputPassportElement {
        public static final int CONSTRUCTOR = -9963390;
        public InputIdentityDocument identityCard;

        public InputPassportElementIdentityCard() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputPassportElementIdentityCard(InputIdentityDocument inputIdentityDocument) {
            this.identityCard = inputIdentityDocument;
        }
    }

    public static class InputPassportElementInternalPassport extends InputPassportElement {
        public static final int CONSTRUCTOR = 715360043;
        public InputIdentityDocument internalPassport;

        public InputPassportElementInternalPassport() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputPassportElementInternalPassport(InputIdentityDocument inputIdentityDocument) {
            this.internalPassport = inputIdentityDocument;
        }
    }

    public static class InputPassportElementPassport extends InputPassportElement {
        public static final int CONSTRUCTOR = -497011356;
        public InputIdentityDocument passport;

        public InputPassportElementPassport() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputPassportElementPassport(InputIdentityDocument inputIdentityDocument) {
            this.passport = inputIdentityDocument;
        }
    }

    public static class InputPassportElementPassportRegistration extends InputPassportElement {
        public static final int CONSTRUCTOR = 1314562128;
        public InputPersonalDocument passportRegistration;

        public InputPassportElementPassportRegistration() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputPassportElementPassportRegistration(InputPersonalDocument inputPersonalDocument) {
            this.passportRegistration = inputPersonalDocument;
        }
    }

    public static class InputPassportElementPersonalDetails extends InputPassportElement {
        public static final int CONSTRUCTOR = 164791359;
        public PersonalDetails personalDetails;

        public InputPassportElementPersonalDetails() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputPassportElementPersonalDetails(PersonalDetails personalDetails) {
            this.personalDetails = personalDetails;
        }
    }

    public static class InputPassportElementPhoneNumber extends InputPassportElement {
        public static final int CONSTRUCTOR = 1319357497;
        public String phoneNumber;

        public InputPassportElementPhoneNumber() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputPassportElementPhoneNumber(String str) {
            this.phoneNumber = str;
        }
    }

    public static class InputPassportElementRentalAgreement extends InputPassportElement {
        public static final int CONSTRUCTOR = 1736154155;
        public InputPersonalDocument rentalAgreement;

        public InputPassportElementRentalAgreement() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputPassportElementRentalAgreement(InputPersonalDocument inputPersonalDocument) {
            this.rentalAgreement = inputPersonalDocument;
        }
    }

    public static class InputPassportElementTemporaryRegistration extends InputPassportElement {
        public static final int CONSTRUCTOR = -1913238047;
        public InputPersonalDocument temporaryRegistration;

        public InputPassportElementTemporaryRegistration() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputPassportElementTemporaryRegistration(InputPersonalDocument inputPersonalDocument) {
            this.temporaryRegistration = inputPersonalDocument;
        }
    }

    public static class InputPassportElementUtilityBill extends InputPassportElement {
        public static final int CONSTRUCTOR = 1389203841;
        public InputPersonalDocument utilityBill;

        public InputPassportElementUtilityBill() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputPassportElementUtilityBill(InputPersonalDocument inputPersonalDocument) {
            this.utilityBill = inputPersonalDocument;
        }
    }

    public static class InputPersonalDocument extends Object {
        public static final int CONSTRUCTOR = 1676966826;
        public InputFile[] files;
        public InputFile[] translation;

        public InputPersonalDocument() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputPersonalDocument(InputFile[] inputFileArr, InputFile[] inputFileArr2) {
            this.files = inputFileArr;
            this.translation = inputFileArr2;
        }
    }

    public static class InputSticker extends Object {
        public static final int CONSTRUCTOR = 878376494;
        public String emojis;
        public InputFile sticker;
        public StickerType type;

        public InputSticker() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputSticker(InputFile inputFile, String str, StickerType stickerType) {
            this.sticker = inputFile;
            this.emojis = str;
            this.type = stickerType;
        }
    }

    public static class InputThumbnail extends Object {
        public static final int CONSTRUCTOR = 1582387236;
        public int height;
        public InputFile thumbnail;
        public int width;

        public InputThumbnail() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InputThumbnail(InputFile inputFile, int i, int i2) {
            this.thumbnail = inputFile;
            this.width = i;
            this.height = i2;
        }
    }

    public static abstract class InternalLinkType extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class InternalLinkTypeActiveSessions extends InternalLinkType {
        public static final int CONSTRUCTOR = 1886108589;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeAuthenticationCode extends InternalLinkType {
        public static final int CONSTRUCTOR = -209235982;
        public String code;

        public InternalLinkTypeAuthenticationCode() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InternalLinkTypeAuthenticationCode(String str) {
            this.code = str;
        }
    }

    public static class InternalLinkTypeBackground extends InternalLinkType {
        public static final int CONSTRUCTOR = 185411848;
        public String backgroundName;

        public InternalLinkTypeBackground() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InternalLinkTypeBackground(String str) {
            this.backgroundName = str;
        }
    }

    public static class InternalLinkTypeBotStart extends InternalLinkType {
        public static final int CONSTRUCTOR = -1206724291;
        public String botUsername;
        public String startParameter;

        public InternalLinkTypeBotStart() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InternalLinkTypeBotStart(String str, String str2) {
            this.botUsername = str;
            this.startParameter = str2;
        }
    }

    public static class InternalLinkTypeBotStartInGroup extends InternalLinkType {
        public static final int CONSTRUCTOR = -1040096100;
        public String botUsername;
        public String startParameter;

        public InternalLinkTypeBotStartInGroup() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InternalLinkTypeBotStartInGroup(String str, String str2) {
            this.botUsername = str;
            this.startParameter = str2;
        }
    }

    public static class InternalLinkTypeChangePhoneNumber extends InternalLinkType {
        public static final int CONSTRUCTOR = -265856255;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeChatInvite extends InternalLinkType {
        public static final int CONSTRUCTOR = 428621017;
        public String inviteLink;

        public InternalLinkTypeChatInvite() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InternalLinkTypeChatInvite(String str) {
            this.inviteLink = str;
        }
    }

    public static class InternalLinkTypeFilterSettings extends InternalLinkType {
        public static final int CONSTRUCTOR = 1501632411;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeGame extends InternalLinkType {
        public static final int CONSTRUCTOR = -260788787;
        public String botUsername;
        public String gameShortName;

        public InternalLinkTypeGame() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InternalLinkTypeGame(String str, String str2) {
            this.botUsername = str;
            this.gameShortName = str2;
        }
    }

    public static class InternalLinkTypeLanguagePack extends InternalLinkType {
        public static final int CONSTRUCTOR = -1450766996;
        public String languagePackId;

        public InternalLinkTypeLanguagePack() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InternalLinkTypeLanguagePack(String str) {
            this.languagePackId = str;
        }
    }

    public static class InternalLinkTypeMessage extends InternalLinkType {
        public static final int CONSTRUCTOR = 978541650;
        public String url;

        public InternalLinkTypeMessage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InternalLinkTypeMessage(String str) {
            this.url = str;
        }
    }

    public static class InternalLinkTypeMessageDraft extends InternalLinkType {
        public static final int CONSTRUCTOR = 661633749;
        public boolean containsLink;
        public FormattedText text;

        public InternalLinkTypeMessageDraft() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InternalLinkTypeMessageDraft(FormattedText formattedText, boolean z) {
            this.text = formattedText;
            this.containsLink = z;
        }
    }

    public static class InternalLinkTypePassportDataRequest extends InternalLinkType {
        public static final int CONSTRUCTOR = -988819839;
        public long botUserId;
        public String callbackUrl;
        public String nonce;
        public String publicKey;
        public String scope;

        public InternalLinkTypePassportDataRequest() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InternalLinkTypePassportDataRequest(long j, String str, String str2, String str3, String str4) {
            this.botUserId = j;
            this.scope = str;
            this.publicKey = str2;
            this.nonce = str3;
            this.callbackUrl = str4;
        }
    }

    public static class InternalLinkTypePhoneNumberConfirmation extends InternalLinkType {
        public static final int CONSTRUCTOR = 1757375254;
        public String hash;
        public String phoneNumber;

        public InternalLinkTypePhoneNumberConfirmation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InternalLinkTypePhoneNumberConfirmation(String str, String str2) {
            this.hash = str;
            this.phoneNumber = str2;
        }
    }

    public static class InternalLinkTypeProxy extends InternalLinkType {
        public static final int CONSTRUCTOR = -1313788694;
        public int port;
        public String server;
        public ProxyType type;

        public InternalLinkTypeProxy() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InternalLinkTypeProxy(String str, int i, ProxyType proxyType) {
            this.server = str;
            this.port = i;
            this.type = proxyType;
        }
    }

    public static class InternalLinkTypePublicChat extends InternalLinkType {
        public static final int CONSTRUCTOR = -1485547717;
        public String chatUsername;

        public InternalLinkTypePublicChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InternalLinkTypePublicChat(String str) {
            this.chatUsername = str;
        }
    }

    public static class InternalLinkTypeQrCodeAuthentication extends InternalLinkType {
        public static final int CONSTRUCTOR = -1089332956;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeSettings extends InternalLinkType {
        public static final int CONSTRUCTOR = 393561524;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeStickerSet extends InternalLinkType {
        public static final int CONSTRUCTOR = -529639751;
        public String stickerSetName;

        public InternalLinkTypeStickerSet() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InternalLinkTypeStickerSet(String str) {
            this.stickerSetName = str;
        }
    }

    public static class InternalLinkTypeTheme extends InternalLinkType {
        public static final int CONSTRUCTOR = -200935417;
        public String themeName;

        public InternalLinkTypeTheme() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InternalLinkTypeTheme(String str) {
            this.themeName = str;
        }
    }

    public static class InternalLinkTypeThemeSettings extends InternalLinkType {
        public static final int CONSTRUCTOR = -1051903722;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeUnknownDeepLink extends InternalLinkType {
        public static final int CONSTRUCTOR = 625596379;
        public String link;

        public InternalLinkTypeUnknownDeepLink() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InternalLinkTypeUnknownDeepLink(String str) {
            this.link = str;
        }
    }

    public static class InternalLinkTypeUnsupportedProxy extends InternalLinkType {
        public static final int CONSTRUCTOR = -566649079;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeUserPhoneNumber extends InternalLinkType {
        public static final int CONSTRUCTOR = -1955751319;
        public String phoneNumber;

        public InternalLinkTypeUserPhoneNumber() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InternalLinkTypeUserPhoneNumber(String str) {
            this.phoneNumber = str;
        }
    }

    public static class InternalLinkTypeVideoChat extends InternalLinkType {
        public static final int CONSTRUCTOR = -2020149068;
        public String chatUsername;
        public String inviteHash;
        public boolean isLiveStream;

        public InternalLinkTypeVideoChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InternalLinkTypeVideoChat(String str, String str2, boolean z) {
            this.chatUsername = str;
            this.inviteHash = str2;
            this.isLiveStream = z;
        }
    }

    public static class InviteGroupCallParticipants extends Function {
        public static final int CONSTRUCTOR = 1867097679;
        public int groupCallId;
        public long[] userIds;

        public InviteGroupCallParticipants() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public InviteGroupCallParticipants(int i, long[] jArr) {
            this.groupCallId = i;
            this.userIds = jArr;
        }
    }

    public static class Invoice extends Object {
        public static final int CONSTRUCTOR = 1479250728;
        public String currency;
        public boolean isFlexible;
        public boolean isTest;
        public long maxTipAmount;
        public boolean needEmailAddress;
        public boolean needName;
        public boolean needPhoneNumber;
        public boolean needShippingAddress;
        public LabeledPricePart[] priceParts;
        public boolean sendEmailAddressToProvider;
        public boolean sendPhoneNumberToProvider;
        public long[] suggestedTipAmounts;

        public Invoice() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Invoice(String str, LabeledPricePart[] labeledPricePartArr, long j, long[] jArr, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
            this.currency = str;
            this.priceParts = labeledPricePartArr;
            this.maxTipAmount = j;
            this.suggestedTipAmounts = jArr;
            this.isTest = z;
            this.needName = z2;
            this.needPhoneNumber = z3;
            this.needEmailAddress = z4;
            this.needShippingAddress = z5;
            this.sendPhoneNumberToProvider = z6;
            this.sendEmailAddressToProvider = z7;
            this.isFlexible = z8;
        }
    }

    public static class JoinChat extends Function {
        public static final int CONSTRUCTOR = 326769313;
        public long chatId;

        public JoinChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public JoinChat(long j) {
            this.chatId = j;
        }
    }

    public static class JoinChatByInviteLink extends Function {
        public static final int CONSTRUCTOR = -1049973882;
        public String inviteLink;

        public JoinChatByInviteLink() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public JoinChatByInviteLink(String str) {
            this.inviteLink = str;
        }
    }

    public static class JoinGroupCall extends Function {
        public static final int CONSTRUCTOR = -1043773467;
        public int audioSourceId;
        public int groupCallId;
        public String inviteHash;
        public boolean isMuted;
        public boolean isMyVideoEnabled;
        public MessageSender participantId;
        public String payload;

        public JoinGroupCall() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public JoinGroupCall(int i, MessageSender messageSender, int i2, String str, boolean z, boolean z2, String str2) {
            this.groupCallId = i;
            this.participantId = messageSender;
            this.audioSourceId = i2;
            this.payload = str;
            this.isMuted = z;
            this.isMyVideoEnabled = z2;
            this.inviteHash = str2;
        }
    }

    public static class JsonObjectMember extends Object {
        public static final int CONSTRUCTOR = -1803309418;
        public String key;
        public JsonValue value;

        public JsonObjectMember() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public JsonObjectMember(String str, JsonValue jsonValue) {
            this.key = str;
            this.value = jsonValue;
        }
    }

    public static abstract class JsonValue extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class JsonValueArray extends JsonValue {
        public static final int CONSTRUCTOR = -183913546;
        public JsonValue[] values;

        public JsonValueArray() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public JsonValueArray(JsonValue[] jsonValueArr) {
            this.values = jsonValueArr;
        }
    }

    public static class JsonValueBoolean extends JsonValue {
        public static final int CONSTRUCTOR = -2142186576;
        public boolean value;

        public JsonValueBoolean() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public JsonValueBoolean(boolean z) {
            this.value = z;
        }
    }

    public static class JsonValueNull extends JsonValue {
        public static final int CONSTRUCTOR = -92872499;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class JsonValueNumber extends JsonValue {
        public static final int CONSTRUCTOR = -1010822033;
        public double value;

        public JsonValueNumber() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public JsonValueNumber(double d) {
            this.value = d;
        }
    }

    public static class JsonValueObject extends JsonValue {
        public static final int CONSTRUCTOR = 520252026;
        public JsonObjectMember[] members;

        public JsonValueObject() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public JsonValueObject(JsonObjectMember[] jsonObjectMemberArr) {
            this.members = jsonObjectMemberArr;
        }
    }

    public static class JsonValueString extends JsonValue {
        public static final int CONSTRUCTOR = 1597947313;
        public String value;

        public JsonValueString() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public JsonValueString(String str) {
            this.value = str;
        }
    }

    public static class KeyboardButton extends Object {
        public static final int CONSTRUCTOR = -2069836172;
        public String text;
        public KeyboardButtonType type;

        public KeyboardButton() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public KeyboardButton(String str, KeyboardButtonType keyboardButtonType) {
            this.text = str;
            this.type = keyboardButtonType;
        }
    }

    public static abstract class KeyboardButtonType extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class KeyboardButtonTypeRequestLocation extends KeyboardButtonType {
        public static final int CONSTRUCTOR = -125661955;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class KeyboardButtonTypeRequestPhoneNumber extends KeyboardButtonType {
        public static final int CONSTRUCTOR = -1529235527;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class KeyboardButtonTypeRequestPoll extends KeyboardButtonType {
        public static final int CONSTRUCTOR = 1902435512;
        public boolean forceQuiz;
        public boolean forceRegular;

        public KeyboardButtonTypeRequestPoll() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public KeyboardButtonTypeRequestPoll(boolean z, boolean z2) {
            this.forceRegular = z;
            this.forceQuiz = z2;
        }
    }

    public static class KeyboardButtonTypeText extends KeyboardButtonType {
        public static final int CONSTRUCTOR = -1773037256;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LabeledPricePart extends Object {
        public static final int CONSTRUCTOR = 552789798;
        public long amount;
        public String label;

        public LabeledPricePart() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public LabeledPricePart(String str, long j) {
            this.label = str;
            this.amount = j;
        }
    }

    public static class LanguagePackInfo extends Object {
        public static final int CONSTRUCTOR = 542199642;
        public String baseLanguagePackId;
        public String f25405id;
        public boolean isBeta;
        public boolean isInstalled;
        public boolean isOfficial;
        public boolean isRtl;
        public int localStringCount;
        public String name;
        public String nativeName;
        public String pluralCode;
        public int totalStringCount;
        public int translatedStringCount;
        public String translationUrl;

        public LanguagePackInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public LanguagePackInfo(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, int i3, String str6) {
            this.f25405id = str;
            this.baseLanguagePackId = str2;
            this.name = str3;
            this.nativeName = str4;
            this.pluralCode = str5;
            this.isOfficial = z;
            this.isRtl = z2;
            this.isBeta = z3;
            this.isInstalled = z4;
            this.totalStringCount = i;
            this.translatedStringCount = i2;
            this.localStringCount = i3;
            this.translationUrl = str6;
        }
    }

    public static class LanguagePackString extends Object {
        public static final int CONSTRUCTOR = 1307632736;
        public String key;
        public LanguagePackStringValue value;

        public LanguagePackString() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public LanguagePackString(String str, LanguagePackStringValue languagePackStringValue) {
            this.key = str;
            this.value = languagePackStringValue;
        }
    }

    public static abstract class LanguagePackStringValue extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class LanguagePackStringValueDeleted extends LanguagePackStringValue {
        public static final int CONSTRUCTOR = 1834792698;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LanguagePackStringValueOrdinary extends LanguagePackStringValue {
        public static final int CONSTRUCTOR = -249256352;
        public String value;

        public LanguagePackStringValueOrdinary() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public LanguagePackStringValueOrdinary(String str) {
            this.value = str;
        }
    }

    public static class LanguagePackStringValuePluralized extends LanguagePackStringValue {
        public static final int CONSTRUCTOR = 1906840261;
        public String fewValue;
        public String manyValue;
        public String oneValue;
        public String otherValue;
        public String twoValue;
        public String zeroValue;

        public LanguagePackStringValuePluralized() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public LanguagePackStringValuePluralized(String str, String str2, String str3, String str4, String str5, String str6) {
            this.zeroValue = str;
            this.oneValue = str2;
            this.twoValue = str3;
            this.fewValue = str4;
            this.manyValue = str5;
            this.otherValue = str6;
        }
    }

    public static class LanguagePackStrings extends Object {
        public static final int CONSTRUCTOR = 1172082922;
        public LanguagePackString[] strings;

        public LanguagePackStrings() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public LanguagePackStrings(LanguagePackString[] languagePackStringArr) {
            this.strings = languagePackStringArr;
        }
    }

    public static class LeaveChat extends Function {
        public static final int CONSTRUCTOR = -1825080735;
        public long chatId;

        public LeaveChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public LeaveChat(long j) {
            this.chatId = j;
        }
    }

    public static class LeaveGroupCall extends Function {
        public static final int CONSTRUCTOR = 980152233;
        public int groupCallId;

        public LeaveGroupCall() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public LeaveGroupCall(int i) {
            this.groupCallId = i;
        }
    }

    public static class LoadChats extends Function {
        public static final int CONSTRUCTOR = -1885635205;
        public ChatList chatList;
        public int limit;

        public LoadChats() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public LoadChats(ChatList chatList, int i) {
            this.chatList = chatList;
            this.limit = i;
        }
    }

    public static class LoadGroupCallParticipants extends Function {
        public static final int CONSTRUCTOR = 938720974;
        public int groupCallId;
        public int limit;

        public LoadGroupCallParticipants() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public LoadGroupCallParticipants(int i, int i2) {
            this.groupCallId = i;
            this.limit = i2;
        }
    }

    public static class LocalFile extends Object {
        public static final int CONSTRUCTOR = -1166400317;
        public boolean canBeDeleted;
        public boolean canBeDownloaded;
        public int downloadOffset;
        public int downloadedPrefixSize;
        public int downloadedSize;
        public boolean isDownloadingActive;
        public boolean isDownloadingCompleted;
        public String path;

        public LocalFile() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public LocalFile(String str, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, int i3) {
            this.path = str;
            this.canBeDownloaded = z;
            this.canBeDeleted = z2;
            this.isDownloadingActive = z3;
            this.isDownloadingCompleted = z4;
            this.downloadOffset = i;
            this.downloadedPrefixSize = i2;
            this.downloadedSize = i3;
        }
    }

    public static class LocalizationTargetInfo extends Object {
        public static final int CONSTRUCTOR = -2048670809;
        public LanguagePackInfo[] languagePacks;

        public LocalizationTargetInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public LocalizationTargetInfo(LanguagePackInfo[] languagePackInfoArr) {
            this.languagePacks = languagePackInfoArr;
        }
    }

    public static class Location extends Object {
        public static final int CONSTRUCTOR = -443392141;
        public double horizontalAccuracy;
        public double latitude;
        public double longitude;

        public Location() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Location(double d, double d2, double d3) {
            this.latitude = d;
            this.longitude = d2;
            this.horizontalAccuracy = d3;
        }
    }

    public static class LogOut extends Function {
        public static final int CONSTRUCTOR = -1581923301;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static abstract class LogStream extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class LogStreamDefault extends LogStream {
        public static final int CONSTRUCTOR = 1390581436;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LogStreamEmpty extends LogStream {
        public static final int CONSTRUCTOR = -499912244;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LogStreamFile extends LogStream {
        public static final int CONSTRUCTOR = 1532136933;
        public long maxFileSize;
        public String path;
        public boolean redirectStderr;

        public LogStreamFile() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public LogStreamFile(String str, long j, boolean z) {
            this.path = str;
            this.maxFileSize = j;
            this.redirectStderr = z;
        }
    }

    public static class LogTags extends Object {
        public static final int CONSTRUCTOR = -1604930601;
        public String[] tags;

        public LogTags() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public LogTags(String[] strArr) {
            this.tags = strArr;
        }
    }

    public static class LogVerbosityLevel extends Object {
        public static final int CONSTRUCTOR = 1734624234;
        public int verbosityLevel;

        public LogVerbosityLevel() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public LogVerbosityLevel(int i) {
            this.verbosityLevel = i;
        }
    }

    public static abstract class LoginUrlInfo extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class LoginUrlInfoOpen extends LoginUrlInfo {
        public static final int CONSTRUCTOR = -1079045420;
        public boolean skipConfirm;
        public String url;

        public LoginUrlInfoOpen() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public LoginUrlInfoOpen(String str, boolean z) {
            this.url = str;
            this.skipConfirm = z;
        }
    }

    public static class LoginUrlInfoRequestConfirmation extends LoginUrlInfo {
        public static final int CONSTRUCTOR = 2128290863;
        public long botUserId;
        public String domain;
        public boolean requestWriteAccess;
        public String url;

        public LoginUrlInfoRequestConfirmation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public LoginUrlInfoRequestConfirmation(String str, String str2, long j, boolean z) {
            this.url = str;
            this.domain = str2;
            this.botUserId = j;
            this.requestWriteAccess = z;
        }
    }

    public static abstract class MaskPoint extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class MaskPointChin extends MaskPoint {
        public static final int CONSTRUCTOR = 534995335;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MaskPointEyes extends MaskPoint {
        public static final int CONSTRUCTOR = 1748310861;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MaskPointForehead extends MaskPoint {
        public static final int CONSTRUCTOR = 1027512005;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MaskPointMouth extends MaskPoint {
        public static final int CONSTRUCTOR = 411773406;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MaskPosition extends Object {
        public static final int CONSTRUCTOR = -2097433026;
        public MaskPoint point;
        public double scale;
        public double xShift;
        public double yShift;

        public MaskPosition() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MaskPosition(MaskPoint maskPoint, double d, double d2, double d3) {
            this.point = maskPoint;
            this.xShift = d;
            this.yShift = d2;
            this.scale = d3;
        }
    }

    public static class Message extends Object {
        public static final int CONSTRUCTOR = 1435961258;
        public String authorSignature;
        public boolean canBeDeletedForAllUsers;
        public boolean canBeDeletedOnlyForSelf;
        public boolean canBeEdited;
        public boolean canBeForwarded;
        public boolean canBeSaved;
        public boolean canGetAddedReactions;
        public boolean canGetMediaTimestampLinks;
        public boolean canGetMessageThread;
        public boolean canGetStatistics;
        public boolean canGetViewers;
        public long chatId;
        public boolean containsUnreadMention;
        public MessageContent content;
        public int date;
        public int editDate;
        public MessageForwardInfo forwardInfo;
        public boolean hasTimestampedMedia;
        public long f25406id;
        public MessageInteractionInfo interactionInfo;
        public boolean isChannelPost;
        public boolean isOutgoing;
        public boolean isPinned;
        public long mediaAlbumId;
        public long messageThreadId;
        public long replyInChatId;
        public ReplyMarkup replyMarkup;
        public long replyToMessageId;
        public String restrictionReason;
        public MessageSchedulingState schedulingState;
        public MessageSender senderId;
        public MessageSendingState sendingState;
        public int ttl;
        public double ttlExpiresIn;
        public UnreadReaction[] unreadReactions;
        public long viaBotUserId;

        public Message() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Message(long j, MessageSender messageSender, long j2, MessageSendingState messageSendingState, MessageSchedulingState messageSchedulingState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i, int i2, MessageForwardInfo messageForwardInfo, MessageInteractionInfo messageInteractionInfo, UnreadReaction[] unreadReactionArr, long j3, long j4, long j5, int i3, double d, long j6, String str, long j7, String str2, MessageContent messageContent, ReplyMarkup replyMarkup) {
            this.f25406id = j;
            this.senderId = messageSender;
            this.chatId = j2;
            this.sendingState = messageSendingState;
            this.schedulingState = messageSchedulingState;
            this.isOutgoing = z;
            this.isPinned = z2;
            this.canBeEdited = z3;
            this.canBeForwarded = z4;
            this.canBeSaved = z5;
            this.canBeDeletedOnlyForSelf = z6;
            this.canBeDeletedForAllUsers = z7;
            this.canGetAddedReactions = z8;
            this.canGetStatistics = z9;
            this.canGetMessageThread = z10;
            this.canGetViewers = z11;
            this.canGetMediaTimestampLinks = z12;
            this.hasTimestampedMedia = z13;
            this.isChannelPost = z14;
            this.containsUnreadMention = z15;
            this.date = i;
            this.editDate = i2;
            this.forwardInfo = messageForwardInfo;
            this.interactionInfo = messageInteractionInfo;
            this.unreadReactions = unreadReactionArr;
            this.replyInChatId = j3;
            this.replyToMessageId = j4;
            this.messageThreadId = j5;
            this.ttl = i3;
            this.ttlExpiresIn = d;
            this.viaBotUserId = j6;
            this.authorSignature = str;
            this.mediaAlbumId = j7;
            this.restrictionReason = str2;
            this.content = messageContent;
            this.replyMarkup = replyMarkup;
        }
    }

    public static class MessageAnimatedEmoji extends MessageContent {
        public static final int CONSTRUCTOR = 908195298;
        public AnimatedEmoji animatedEmoji;
        public String emoji;

        public MessageAnimatedEmoji() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageAnimatedEmoji(AnimatedEmoji animatedEmoji, String str) {
            this.animatedEmoji = animatedEmoji;
            this.emoji = str;
        }
    }

    public static class MessageAnimation extends MessageContent {
        public static final int CONSTRUCTOR = 1306939396;
        public Animation animation;
        public FormattedText caption;
        public boolean isSecret;

        public MessageAnimation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageAnimation(Animation animation, FormattedText formattedText, boolean z) {
            this.animation = animation;
            this.caption = formattedText;
            this.isSecret = z;
        }
    }

    public static class MessageAudio extends MessageContent {
        public static final int CONSTRUCTOR = 276722716;
        public Audio audio;
        public FormattedText caption;

        public MessageAudio() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageAudio(Audio audio, FormattedText formattedText) {
            this.audio = audio;
            this.caption = formattedText;
        }
    }

    public static class MessageBasicGroupChatCreate extends MessageContent {
        public static final int CONSTRUCTOR = 795404060;
        public long[] memberUserIds;
        public String title;

        public MessageBasicGroupChatCreate() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageBasicGroupChatCreate(String str, long[] jArr) {
            this.title = str;
            this.memberUserIds = jArr;
        }
    }

    public static class MessageCalendar extends Object {
        public static final int CONSTRUCTOR = -1682890519;
        public MessageCalendarDay[] days;
        public int totalCount;

        public MessageCalendar() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageCalendar(int i, MessageCalendarDay[] messageCalendarDayArr) {
            this.totalCount = i;
            this.days = messageCalendarDayArr;
        }
    }

    public static class MessageCalendarDay extends Object {
        public static final int CONSTRUCTOR = -376467614;
        public Message message;
        public int totalCount;

        public MessageCalendarDay() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageCalendarDay(int i, Message message) {
            this.totalCount = i;
            this.message = message;
        }
    }

    public static class MessageCall extends MessageContent {
        public static final int CONSTRUCTOR = 538893824;
        public CallDiscardReason discardReason;
        public int duration;
        public boolean isVideo;

        public MessageCall() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageCall(boolean z, CallDiscardReason callDiscardReason, int i) {
            this.isVideo = z;
            this.discardReason = callDiscardReason;
            this.duration = i;
        }
    }

    public static class MessageChatAddMembers extends MessageContent {
        public static final int CONSTRUCTOR = 1701117908;
        public long[] memberUserIds;

        public MessageChatAddMembers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageChatAddMembers(long[] jArr) {
            this.memberUserIds = jArr;
        }
    }

    public static class MessageChatChangePhoto extends MessageContent {
        public static final int CONSTRUCTOR = -813415093;
        public ChatPhoto photo;

        public MessageChatChangePhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageChatChangePhoto(ChatPhoto chatPhoto) {
            this.photo = chatPhoto;
        }
    }

    public static class MessageChatChangeTitle extends MessageContent {
        public static final int CONSTRUCTOR = 748272449;
        public String title;

        public MessageChatChangeTitle() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageChatChangeTitle(String str) {
            this.title = str;
        }
    }

    public static class MessageChatDeleteMember extends MessageContent {
        public static final int CONSTRUCTOR = 938029481;
        public long userId;

        public MessageChatDeleteMember() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageChatDeleteMember(long j) {
            this.userId = j;
        }
    }

    public static class MessageChatDeletePhoto extends MessageContent {
        public static final int CONSTRUCTOR = -184374809;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageChatJoinByLink extends MessageContent {
        public static final int CONSTRUCTOR = 1846493311;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageChatJoinByRequest extends MessageContent {
        public static final int CONSTRUCTOR = 1195428732;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageChatSetTheme extends MessageContent {
        public static final int CONSTRUCTOR = -1716612088;
        public String themeName;

        public MessageChatSetTheme() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageChatSetTheme(String str) {
            this.themeName = str;
        }
    }

    public static class MessageChatSetTtl extends MessageContent {
        public static final int CONSTRUCTOR = 1810060209;
        public int ttl;

        public MessageChatSetTtl() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageChatSetTtl(int i) {
            this.ttl = i;
        }
    }

    public static class MessageChatUpgradeFrom extends MessageContent {
        public static final int CONSTRUCTOR = 325954268;
        public long basicGroupId;
        public String title;

        public MessageChatUpgradeFrom() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageChatUpgradeFrom(String str, long j) {
            this.title = str;
            this.basicGroupId = j;
        }
    }

    public static class MessageChatUpgradeTo extends MessageContent {
        public static final int CONSTRUCTOR = 104813723;
        public long supergroupId;

        public MessageChatUpgradeTo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageChatUpgradeTo(long j) {
            this.supergroupId = j;
        }
    }

    public static class MessageContact extends MessageContent {
        public static final int CONSTRUCTOR = -512684966;
        public Contact contact;

        public MessageContact() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageContact(Contact contact) {
            this.contact = contact;
        }
    }

    public static class MessageContactRegistered extends MessageContent {
        public static final int CONSTRUCTOR = -1502020353;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static abstract class MessageContent extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class MessageCopyOptions extends Object {
        public static final int CONSTRUCTOR = 1208442937;
        public FormattedText newCaption;
        public boolean replaceCaption;
        public boolean sendCopy;

        public MessageCopyOptions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageCopyOptions(boolean z, boolean z2, FormattedText formattedText) {
            this.sendCopy = z;
            this.replaceCaption = z2;
            this.newCaption = formattedText;
        }
    }

    public static class MessageCustomServiceAction extends MessageContent {
        public static final int CONSTRUCTOR = 1435879282;
        public String text;

        public MessageCustomServiceAction() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageCustomServiceAction(String str) {
            this.text = str;
        }
    }

    public static class MessageDice extends MessageContent {
        public static final int CONSTRUCTOR = 1115779641;
        public String emoji;
        public DiceStickers finalState;
        public DiceStickers initialState;
        public int successAnimationFrameNumber;
        public int value;

        public MessageDice() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageDice(DiceStickers diceStickers, DiceStickers diceStickers2, String str, int i, int i2) {
            this.initialState = diceStickers;
            this.finalState = diceStickers2;
            this.emoji = str;
            this.value = i;
            this.successAnimationFrameNumber = i2;
        }
    }

    public static class MessageDocument extends MessageContent {
        public static final int CONSTRUCTOR = 596945783;
        public FormattedText caption;
        public Document document;

        public MessageDocument() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageDocument(Document document, FormattedText formattedText) {
            this.document = document;
            this.caption = formattedText;
        }
    }

    public static class MessageExpiredPhoto extends MessageContent {
        public static final int CONSTRUCTOR = -1404641801;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageExpiredVideo extends MessageContent {
        public static final int CONSTRUCTOR = -1212209981;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static abstract class MessageFileType extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class MessageFileTypeGroup extends MessageFileType {
        public static final int CONSTRUCTOR = -219836568;
        public String title;

        public MessageFileTypeGroup() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageFileTypeGroup(String str) {
            this.title = str;
        }
    }

    public static class MessageFileTypePrivate extends MessageFileType {
        public static final int CONSTRUCTOR = -521908524;
        public String name;

        public MessageFileTypePrivate() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageFileTypePrivate(String str) {
            this.name = str;
        }
    }

    public static class MessageFileTypeUnknown extends MessageFileType {
        public static final int CONSTRUCTOR = 1176353458;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageForwardInfo extends Object {
        public static final int CONSTRUCTOR = -327300408;
        public int date;
        public long fromChatId;
        public long fromMessageId;
        public MessageForwardOrigin origin;
        public String publicServiceAnnouncementType;

        public MessageForwardInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageForwardInfo(MessageForwardOrigin messageForwardOrigin, int i, String str, long j, long j2) {
            this.origin = messageForwardOrigin;
            this.date = i;
            this.publicServiceAnnouncementType = str;
            this.fromChatId = j;
            this.fromMessageId = j2;
        }
    }

    public static abstract class MessageForwardOrigin extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class MessageForwardOriginChannel extends MessageForwardOrigin {
        public static final int CONSTRUCTOR = 1490730723;
        public String authorSignature;
        public long chatId;
        public long messageId;

        public MessageForwardOriginChannel() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageForwardOriginChannel(long j, long j2, String str) {
            this.chatId = j;
            this.messageId = j2;
            this.authorSignature = str;
        }
    }

    public static class MessageForwardOriginChat extends MessageForwardOrigin {
        public static final int CONSTRUCTOR = 1526010724;
        public String authorSignature;
        public long senderChatId;

        public MessageForwardOriginChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageForwardOriginChat(long j, String str) {
            this.senderChatId = j;
            this.authorSignature = str;
        }
    }

    public static class MessageForwardOriginHiddenUser extends MessageForwardOrigin {
        public static final int CONSTRUCTOR = -271257885;
        public String senderName;

        public MessageForwardOriginHiddenUser() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageForwardOriginHiddenUser(String str) {
            this.senderName = str;
        }
    }

    public static class MessageForwardOriginMessageImport extends MessageForwardOrigin {
        public static final int CONSTRUCTOR = -739561951;
        public String senderName;

        public MessageForwardOriginMessageImport() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageForwardOriginMessageImport(String str) {
            this.senderName = str;
        }
    }

    public static class MessageForwardOriginUser extends MessageForwardOrigin {
        public static final int CONSTRUCTOR = -355174191;
        public long senderUserId;

        public MessageForwardOriginUser() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageForwardOriginUser(long j) {
            this.senderUserId = j;
        }
    }

    public static class MessageGame extends MessageContent {
        public static final int CONSTRUCTOR = -69441162;
        public Game game;

        public MessageGame() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageGame(Game game) {
            this.game = game;
        }
    }

    public static class MessageGameScore extends MessageContent {
        public static final int CONSTRUCTOR = 1344904575;
        public long gameId;
        public long gameMessageId;
        public int score;

        public MessageGameScore() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageGameScore(long j, long j2, int i) {
            this.gameMessageId = j;
            this.gameId = j2;
            this.score = i;
        }
    }

    public static class MessageInteractionInfo extends Object {
        public static final int CONSTRUCTOR = -574858485;
        public int forwardCount;
        public MessageReaction[] reactions;
        public MessageReplyInfo replyInfo;
        public int viewCount;

        public MessageInteractionInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageInteractionInfo(int i, int i2, MessageReplyInfo messageReplyInfo, MessageReaction[] messageReactionArr) {
            this.viewCount = i;
            this.forwardCount = i2;
            this.replyInfo = messageReplyInfo;
            this.reactions = messageReactionArr;
        }
    }

    public static class MessageInviteVideoChatParticipants extends MessageContent {
        public static final int CONSTRUCTOR = -1459065585;
        public int groupCallId;
        public long[] userIds;

        public MessageInviteVideoChatParticipants() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageInviteVideoChatParticipants(int i, long[] jArr) {
            this.groupCallId = i;
            this.userIds = jArr;
        }
    }

    public static class MessageInvoice extends MessageContent {
        public static final int CONSTRUCTOR = -1916671476;
        public String currency;
        public String description;
        public boolean isTest;
        public boolean needShippingAddress;
        public Photo photo;
        public long receiptMessageId;
        public String startParameter;
        public String title;
        public long totalAmount;

        public MessageInvoice() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageInvoice(String str, String str2, Photo photo, String str3, long j, String str4, boolean z, boolean z2, long j2) {
            this.title = str;
            this.description = str2;
            this.photo = photo;
            this.currency = str3;
            this.totalAmount = j;
            this.startParameter = str4;
            this.isTest = z;
            this.needShippingAddress = z2;
            this.receiptMessageId = j2;
        }
    }

    public static class MessageLink extends Object {
        public static final int CONSTRUCTOR = -1354089818;
        public boolean isPublic;
        public String link;

        public MessageLink() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageLink(String str, boolean z) {
            this.link = str;
            this.isPublic = z;
        }
    }

    public static class MessageLinkInfo extends Object {
        public static final int CONSTRUCTOR = -981646294;
        public long chatId;
        public boolean forAlbum;
        public boolean forComment;
        public boolean isPublic;
        public int mediaTimestamp;
        public Message message;

        public MessageLinkInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageLinkInfo(boolean z, long j, Message message, int i, boolean z2, boolean z3) {
            this.isPublic = z;
            this.chatId = j;
            this.message = message;
            this.mediaTimestamp = i;
            this.forAlbum = z2;
            this.forComment = z3;
        }
    }

    public static class MessageLocation extends MessageContent {
        public static final int CONSTRUCTOR = 303973492;
        public int expiresIn;
        public int heading;
        public int livePeriod;
        public Location location;
        public int proximityAlertRadius;

        public MessageLocation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageLocation(Location location, int i, int i2, int i3, int i4) {
            this.location = location;
            this.livePeriod = i;
            this.expiresIn = i2;
            this.heading = i3;
            this.proximityAlertRadius = i4;
        }
    }

    public static class MessagePassportDataReceived extends MessageContent {
        public static final int CONSTRUCTOR = -1367863624;
        public EncryptedCredentials credentials;
        public EncryptedPassportElement[] elements;

        public MessagePassportDataReceived() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessagePassportDataReceived(EncryptedPassportElement[] encryptedPassportElementArr, EncryptedCredentials encryptedCredentials) {
            this.elements = encryptedPassportElementArr;
            this.credentials = encryptedCredentials;
        }
    }

    public static class MessagePassportDataSent extends MessageContent {
        public static final int CONSTRUCTOR = 1017405171;
        public PassportElementType[] types;

        public MessagePassportDataSent() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessagePassportDataSent(PassportElementType[] passportElementTypeArr) {
            this.types = passportElementTypeArr;
        }
    }

    public static class MessagePaymentSuccessful extends MessageContent {
        public static final int CONSTRUCTOR = 1442934098;
        public String currency;
        public long invoiceChatId;
        public long invoiceMessageId;
        public long totalAmount;

        public MessagePaymentSuccessful() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessagePaymentSuccessful(long j, long j2, String str, long j3) {
            this.invoiceChatId = j;
            this.invoiceMessageId = j2;
            this.currency = str;
            this.totalAmount = j3;
        }
    }

    public static class MessagePaymentSuccessfulBot extends MessageContent {
        public static final int CONSTRUCTOR = -438430050;
        public String currency;
        public byte[] invoicePayload;
        public OrderInfo orderInfo;
        public String providerPaymentChargeId;
        public String shippingOptionId;
        public String telegramPaymentChargeId;
        public long totalAmount;

        public MessagePaymentSuccessfulBot() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessagePaymentSuccessfulBot(String str, long j, byte[] bArr, String str2, OrderInfo orderInfo, String str3, String str4) {
            this.currency = str;
            this.totalAmount = j;
            this.invoicePayload = bArr;
            this.shippingOptionId = str2;
            this.orderInfo = orderInfo;
            this.telegramPaymentChargeId = str3;
            this.providerPaymentChargeId = str4;
        }
    }

    public static class MessagePhoto extends MessageContent {
        public static final int CONSTRUCTOR = -1851395174;
        public FormattedText caption;
        public boolean isSecret;
        public Photo photo;

        public MessagePhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessagePhoto(Photo photo, FormattedText formattedText, boolean z) {
            this.photo = photo;
            this.caption = formattedText;
            this.isSecret = z;
        }
    }

    public static class MessagePinMessage extends MessageContent {
        public static final int CONSTRUCTOR = 953503801;
        public long messageId;

        public MessagePinMessage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessagePinMessage(long j) {
            this.messageId = j;
        }
    }

    public static class MessagePoll extends MessageContent {
        public static final int CONSTRUCTOR = -662130099;
        public Poll poll;

        public MessagePoll() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessagePoll(Poll poll) {
            this.poll = poll;
        }
    }

    public static class MessagePosition extends Object {
        public static final int CONSTRUCTOR = 1292189935;
        public int date;
        public long messageId;
        public int position;

        public MessagePosition() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessagePosition(int i, long j, int i2) {
            this.position = i;
            this.messageId = j;
            this.date = i2;
        }
    }

    public static class MessagePositions extends Object {
        public static final int CONSTRUCTOR = -1930466649;
        public MessagePosition[] positions;
        public int totalCount;

        public MessagePositions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessagePositions(int i, MessagePosition[] messagePositionArr) {
            this.totalCount = i;
            this.positions = messagePositionArr;
        }
    }

    public static class MessageProximityAlertTriggered extends MessageContent {
        public static final int CONSTRUCTOR = 67761875;
        public int distance;
        public MessageSender travelerId;
        public MessageSender watcherId;

        public MessageProximityAlertTriggered() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageProximityAlertTriggered(MessageSender messageSender, MessageSender messageSender2, int i) {
            this.travelerId = messageSender;
            this.watcherId = messageSender2;
            this.distance = i;
        }
    }

    public static class MessageReaction extends Object {
        public static final int CONSTRUCTOR = -1168486082;
        public boolean isChosen;
        public String reaction;
        public MessageSender[] recentSenderIds;
        public int totalCount;

        public MessageReaction() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageReaction(String str, int i, boolean z, MessageSender[] messageSenderArr) {
            this.reaction = str;
            this.totalCount = i;
            this.isChosen = z;
            this.recentSenderIds = messageSenderArr;
        }
    }

    public static class MessageReplyInfo extends Object {
        public static final int CONSTRUCTOR = -2093702263;
        public long lastMessageId;
        public long lastReadInboxMessageId;
        public long lastReadOutboxMessageId;
        public MessageSender[] recentReplierIds;
        public int replyCount;

        public MessageReplyInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageReplyInfo(int i, MessageSender[] messageSenderArr, long j, long j2, long j3) {
            this.replyCount = i;
            this.recentReplierIds = messageSenderArr;
            this.lastReadInboxMessageId = j;
            this.lastReadOutboxMessageId = j2;
            this.lastMessageId = j3;
        }
    }

    public static abstract class MessageSchedulingState extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class MessageSchedulingStateSendAtDate extends MessageSchedulingState {
        public static final int CONSTRUCTOR = -1485570073;
        public int sendDate;

        public MessageSchedulingStateSendAtDate() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageSchedulingStateSendAtDate(int i) {
            this.sendDate = i;
        }
    }

    public static class MessageSchedulingStateSendWhenOnline extends MessageSchedulingState {
        public static final int CONSTRUCTOR = 2092947464;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageScreenshotTaken extends MessageContent {
        public static final int CONSTRUCTOR = -1564971605;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageSendOptions extends Object {
        public static final int CONSTRUCTOR = -871066572;
        public boolean disableNotification;
        public boolean fromBackground;
        public boolean protectContent;
        public MessageSchedulingState schedulingState;

        public MessageSendOptions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageSendOptions(boolean z, boolean z2, boolean z3, MessageSchedulingState messageSchedulingState) {
            this.disableNotification = z;
            this.fromBackground = z2;
            this.protectContent = z3;
            this.schedulingState = messageSchedulingState;
        }
    }

    public static abstract class MessageSender extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class MessageSenderChat extends MessageSender {
        public static final int CONSTRUCTOR = -239660751;
        public long chatId;

        public MessageSenderChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageSenderChat(long j) {
            this.chatId = j;
        }
    }

    public static class MessageSenderUser extends MessageSender {
        public static final int CONSTRUCTOR = -336109341;
        public long userId;

        public MessageSenderUser() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageSenderUser(long j) {
            this.userId = j;
        }
    }

    public static class MessageSenders extends Object {
        public static final int CONSTRUCTOR = -690158467;
        public MessageSender[] senders;
        public int totalCount;

        public MessageSenders() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageSenders(int i, MessageSender[] messageSenderArr) {
            this.totalCount = i;
            this.senders = messageSenderArr;
        }
    }

    public static abstract class MessageSendingState extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class MessageSendingStateFailed extends MessageSendingState {
        public static final int CONSTRUCTOR = -1741887228;
        public boolean canRetry;
        public int errorCode;
        public String errorMessage;
        public boolean needAnotherSender;
        public double retryAfter;

        public MessageSendingStateFailed() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageSendingStateFailed(int i, String str, boolean z, boolean z2, double d) {
            this.errorCode = i;
            this.errorMessage = str;
            this.canRetry = z;
            this.needAnotherSender = z2;
            this.retryAfter = d;
        }
    }

    public static class MessageSendingStatePending extends MessageSendingState {
        public static final int CONSTRUCTOR = -1381803582;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageStatistics extends Object {
        public static final int CONSTRUCTOR = -1011383888;
        public StatisticalGraph messageInteractionGraph;

        public MessageStatistics() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageStatistics(StatisticalGraph statisticalGraph) {
            this.messageInteractionGraph = statisticalGraph;
        }
    }

    public static class MessageSticker extends MessageContent {
        public static final int CONSTRUCTOR = 1779022878;
        public Sticker sticker;

        public MessageSticker() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageSticker(Sticker sticker) {
            this.sticker = sticker;
        }
    }

    public static class MessageSupergroupChatCreate extends MessageContent {
        public static final int CONSTRUCTOR = -434325733;
        public String title;

        public MessageSupergroupChatCreate() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageSupergroupChatCreate(String str) {
            this.title = str;
        }
    }

    public static class MessageText extends MessageContent {
        public static final int CONSTRUCTOR = 1989037971;
        public FormattedText text;
        public WebPage webPage;

        public MessageText() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageText(FormattedText formattedText, WebPage webPage) {
            this.text = formattedText;
            this.webPage = webPage;
        }
    }

    public static class MessageThreadInfo extends Object {
        public static final int CONSTRUCTOR = -248536056;
        public long chatId;
        public DraftMessage draftMessage;
        public long messageThreadId;
        public Message[] messages;
        public MessageReplyInfo replyInfo;
        public int unreadMessageCount;

        public MessageThreadInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageThreadInfo(long j, long j2, MessageReplyInfo messageReplyInfo, int i, Message[] messageArr, DraftMessage draftMessage) {
            this.chatId = j;
            this.messageThreadId = j2;
            this.replyInfo = messageReplyInfo;
            this.unreadMessageCount = i;
            this.messages = messageArr;
            this.draftMessage = draftMessage;
        }
    }

    public static class MessageUnsupported extends MessageContent {
        public static final int CONSTRUCTOR = -1816726139;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageVenue extends MessageContent {
        public static final int CONSTRUCTOR = -2146492043;
        public Venue venue;

        public MessageVenue() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageVenue(Venue venue) {
            this.venue = venue;
        }
    }

    public static class MessageVideo extends MessageContent {
        public static final int CONSTRUCTOR = 2021281344;
        public FormattedText caption;
        public boolean isSecret;
        public Video video;

        public MessageVideo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageVideo(Video video, FormattedText formattedText, boolean z) {
            this.video = video;
            this.caption = formattedText;
            this.isSecret = z;
        }
    }

    public static class MessageVideoChatEnded extends MessageContent {
        public static final int CONSTRUCTOR = 2032544855;
        public int duration;

        public MessageVideoChatEnded() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageVideoChatEnded(int i) {
            this.duration = i;
        }
    }

    public static class MessageVideoChatScheduled extends MessageContent {
        public static final int CONSTRUCTOR = -1855185481;
        public int groupCallId;
        public int startDate;

        public MessageVideoChatScheduled() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageVideoChatScheduled(int i, int i2) {
            this.groupCallId = i;
            this.startDate = i2;
        }
    }

    public static class MessageVideoChatStarted extends MessageContent {
        public static final int CONSTRUCTOR = 521225561;
        public int groupCallId;

        public MessageVideoChatStarted() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageVideoChatStarted(int i) {
            this.groupCallId = i;
        }
    }

    public static class MessageVideoNote extends MessageContent {
        public static final int CONSTRUCTOR = 963323014;
        public boolean isSecret;
        public boolean isViewed;
        public VideoNote videoNote;

        public MessageVideoNote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageVideoNote(VideoNote videoNote, boolean z, boolean z2) {
            this.videoNote = videoNote;
            this.isViewed = z;
            this.isSecret = z2;
        }
    }

    public static class MessageVoiceNote extends MessageContent {
        public static final int CONSTRUCTOR = 527777781;
        public FormattedText caption;
        public boolean isListened;
        public VoiceNote voiceNote;

        public MessageVoiceNote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageVoiceNote(VoiceNote voiceNote, FormattedText formattedText, boolean z) {
            this.voiceNote = voiceNote;
            this.caption = formattedText;
            this.isListened = z;
        }
    }

    public static class MessageWebsiteConnected extends MessageContent {
        public static final int CONSTRUCTOR = -1074551800;
        public String domainName;

        public MessageWebsiteConnected() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public MessageWebsiteConnected(String str) {
            this.domainName = str;
        }
    }

    public static class Messages extends Object {
        public static final int CONSTRUCTOR = -16498159;
        public Message[] messages;
        public int totalCount;

        public Messages() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Messages(int i, Message[] messageArr) {
            this.totalCount = i;
            this.messages = messageArr;
        }
    }

    public static class Minithumbnail extends Object {
        public static final int CONSTRUCTOR = -328540758;
        public byte[] data;
        public int height;
        public int width;

        public Minithumbnail() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Minithumbnail(int i, int i2, byte[] bArr) {
            this.width = i;
            this.height = i2;
            this.data = bArr;
        }
    }

    public static class NetworkStatistics extends Object {
        public static final int CONSTRUCTOR = 1615554212;
        public NetworkStatisticsEntry[] entries;
        public int sinceDate;

        public NetworkStatistics() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public NetworkStatistics(int i, NetworkStatisticsEntry[] networkStatisticsEntryArr) {
            this.sinceDate = i;
            this.entries = networkStatisticsEntryArr;
        }
    }

    public static abstract class NetworkStatisticsEntry extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class NetworkStatisticsEntryCall extends NetworkStatisticsEntry {
        public static final int CONSTRUCTOR = 737000365;
        public double duration;
        public NetworkType networkType;
        public long receivedBytes;
        public long sentBytes;

        public NetworkStatisticsEntryCall() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public NetworkStatisticsEntryCall(NetworkType networkType, long j, long j2, double d) {
            this.networkType = networkType;
            this.sentBytes = j;
            this.receivedBytes = j2;
            this.duration = d;
        }
    }

    public static class NetworkStatisticsEntryFile extends NetworkStatisticsEntry {
        public static final int CONSTRUCTOR = 188452706;
        public FileType fileType;
        public NetworkType networkType;
        public long receivedBytes;
        public long sentBytes;

        public NetworkStatisticsEntryFile() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public NetworkStatisticsEntryFile(FileType fileType, NetworkType networkType, long j, long j2) {
            this.fileType = fileType;
            this.networkType = networkType;
            this.sentBytes = j;
            this.receivedBytes = j2;
        }
    }

    public static abstract class NetworkType extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class NetworkTypeMobile extends NetworkType {
        public static final int CONSTRUCTOR = 819228239;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NetworkTypeMobileRoaming extends NetworkType {
        public static final int CONSTRUCTOR = -1435199760;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NetworkTypeNone extends NetworkType {
        public static final int CONSTRUCTOR = -1971691759;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NetworkTypeOther extends NetworkType {
        public static final int CONSTRUCTOR = 1942128539;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NetworkTypeWiFi extends NetworkType {
        public static final int CONSTRUCTOR = -633872070;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Notification extends Object {
        public static final int CONSTRUCTOR = 788743120;
        public int date;
        public int f25407id;
        public boolean isSilent;
        public NotificationType type;

        public Notification() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Notification(int i, int i2, boolean z, NotificationType notificationType) {
            this.f25407id = i;
            this.date = i2;
            this.isSilent = z;
            this.type = notificationType;
        }
    }

    public static class NotificationGroup extends Object {
        public static final int CONSTRUCTOR = 780691541;
        public long chatId;
        public int f25408id;
        public Notification[] notifications;
        public int totalCount;
        public NotificationGroupType type;

        public NotificationGroup() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public NotificationGroup(int i, NotificationGroupType notificationGroupType, long j, int i2, Notification[] notificationArr) {
            this.f25408id = i;
            this.type = notificationGroupType;
            this.chatId = j;
            this.totalCount = i2;
            this.notifications = notificationArr;
        }
    }

    public static abstract class NotificationGroupType extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class NotificationGroupTypeCalls extends NotificationGroupType {
        public static final int CONSTRUCTOR = 1379123538;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NotificationGroupTypeMentions extends NotificationGroupType {
        public static final int CONSTRUCTOR = -2050324051;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NotificationGroupTypeMessages extends NotificationGroupType {
        public static final int CONSTRUCTOR = -1702481123;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NotificationGroupTypeSecretChat extends NotificationGroupType {
        public static final int CONSTRUCTOR = 1390759476;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static abstract class NotificationSettingsScope extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class NotificationSettingsScopeChannelChats extends NotificationSettingsScope {
        public static final int CONSTRUCTOR = 548013448;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NotificationSettingsScopeGroupChats extends NotificationSettingsScope {
        public static final int CONSTRUCTOR = 1212142067;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NotificationSettingsScopePrivateChats extends NotificationSettingsScope {
        public static final int CONSTRUCTOR = 937446759;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static abstract class NotificationType extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class NotificationTypeNewCall extends NotificationType {
        public static final int CONSTRUCTOR = 1712734585;
        public int callId;

        public NotificationTypeNewCall() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public NotificationTypeNewCall(int i) {
            this.callId = i;
        }
    }

    public static class NotificationTypeNewMessage extends NotificationType {
        public static final int CONSTRUCTOR = 1885935159;
        public Message message;

        public NotificationTypeNewMessage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public NotificationTypeNewMessage(Message message) {
            this.message = message;
        }
    }

    public static class NotificationTypeNewPushMessage extends NotificationType {
        public static final int CONSTRUCTOR = -711680462;
        public PushMessageContent content;
        public boolean isOutgoing;
        public long messageId;
        public MessageSender senderId;
        public String senderName;

        public NotificationTypeNewPushMessage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public NotificationTypeNewPushMessage(long j, MessageSender messageSender, String str, boolean z, PushMessageContent pushMessageContent) {
            this.messageId = j;
            this.senderId = messageSender;
            this.senderName = str;
            this.isOutgoing = z;
            this.content = pushMessageContent;
        }
    }

    public static class NotificationTypeNewSecretChat extends NotificationType {
        public static final int CONSTRUCTOR = 1198638768;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static abstract class Object {
        public abstract int getConstructor();

        public native String toString();
    }

    public static class C7866Ok extends Object {
        public static final int CONSTRUCTOR = -722616727;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class OpenChat extends Function {
        public static final int CONSTRUCTOR = -323371509;
        public long chatId;

        public OpenChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public OpenChat(long j) {
            this.chatId = j;
        }
    }

    public static class OpenMessageContent extends Function {
        public static final int CONSTRUCTOR = -739088005;
        public long chatId;
        public long messageId;

        public OpenMessageContent() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public OpenMessageContent(long j, long j2) {
            this.chatId = j;
            this.messageId = j2;
        }
    }

    public static class OptimizeStorage extends Function {
        public static final int CONSTRUCTOR = 853186759;
        public long[] chatIds;
        public int chatLimit;
        public int count;
        public long[] excludeChatIds;
        public FileType[] fileTypes;
        public int immunityDelay;
        public boolean returnDeletedFileStatistics;
        public long size;
        public int ttl;

        public OptimizeStorage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public OptimizeStorage(long j, int i, int i2, int i3, FileType[] fileTypeArr, long[] jArr, long[] jArr2, boolean z, int i4) {
            this.size = j;
            this.ttl = i;
            this.count = i2;
            this.immunityDelay = i3;
            this.fileTypes = fileTypeArr;
            this.chatIds = jArr;
            this.excludeChatIds = jArr2;
            this.returnDeletedFileStatistics = z;
            this.chatLimit = i4;
        }
    }

    public static abstract class OptionValue extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class OptionValueBoolean extends OptionValue {
        public static final int CONSTRUCTOR = 63135518;
        public boolean value;

        public OptionValueBoolean() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public OptionValueBoolean(boolean z) {
            this.value = z;
        }
    }

    public static class OptionValueEmpty extends OptionValue {
        public static final int CONSTRUCTOR = 918955155;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class OptionValueInteger extends OptionValue {
        public static final int CONSTRUCTOR = -186858780;
        public long value;

        public OptionValueInteger() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public OptionValueInteger(long j) {
            this.value = j;
        }
    }

    public static class OptionValueString extends OptionValue {
        public static final int CONSTRUCTOR = 756248212;
        public String value;

        public OptionValueString() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public OptionValueString(String str) {
            this.value = str;
        }
    }

    public static class OrderInfo extends Object {
        public static final int CONSTRUCTOR = 783997294;
        public String emailAddress;
        public String name;
        public String phoneNumber;
        public Address shippingAddress;

        public OrderInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public OrderInfo(String str, String str2, String str3, Address address) {
            this.name = str;
            this.phoneNumber = str2;
            this.emailAddress = str3;
            this.shippingAddress = address;
        }
    }

    public static abstract class PageBlock extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class PageBlockAnchor extends PageBlock {
        public static final int CONSTRUCTOR = -837994576;
        public String name;

        public PageBlockAnchor() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockAnchor(String str) {
            this.name = str;
        }
    }

    public static class PageBlockAnimation extends PageBlock {
        public static final int CONSTRUCTOR = 1355669513;
        public Animation animation;
        public PageBlockCaption caption;
        public boolean needAutoplay;

        public PageBlockAnimation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockAnimation(Animation animation, PageBlockCaption pageBlockCaption, boolean z) {
            this.animation = animation;
            this.caption = pageBlockCaption;
            this.needAutoplay = z;
        }
    }

    public static class PageBlockAudio extends PageBlock {
        public static final int CONSTRUCTOR = -63371245;
        public Audio audio;
        public PageBlockCaption caption;

        public PageBlockAudio() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockAudio(Audio audio, PageBlockCaption pageBlockCaption) {
            this.audio = audio;
            this.caption = pageBlockCaption;
        }
    }

    public static class PageBlockAuthorDate extends PageBlock {
        public static final int CONSTRUCTOR = 1300231184;
        public RichText author;
        public int publishDate;

        public PageBlockAuthorDate() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockAuthorDate(RichText richText, int i) {
            this.author = richText;
            this.publishDate = i;
        }
    }

    public static class PageBlockBlockQuote extends PageBlock {
        public static final int CONSTRUCTOR = 1657834142;
        public RichText credit;
        public RichText text;

        public PageBlockBlockQuote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockBlockQuote(RichText richText, RichText richText2) {
            this.text = richText;
            this.credit = richText2;
        }
    }

    public static class PageBlockCaption extends Object {
        public static final int CONSTRUCTOR = -1180064650;
        public RichText credit;
        public RichText text;

        public PageBlockCaption() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockCaption(RichText richText, RichText richText2) {
            this.text = richText;
            this.credit = richText2;
        }
    }

    public static class PageBlockChatLink extends PageBlock {
        public static final int CONSTRUCTOR = -202091253;
        public ChatPhotoInfo photo;
        public String title;
        public String username;

        public PageBlockChatLink() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockChatLink(String str, ChatPhotoInfo chatPhotoInfo, String str2) {
            this.title = str;
            this.photo = chatPhotoInfo;
            this.username = str2;
        }
    }

    public static class PageBlockCollage extends PageBlock {
        public static final int CONSTRUCTOR = 1163760110;
        public PageBlockCaption caption;
        public PageBlock[] pageBlocks;

        public PageBlockCollage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockCollage(PageBlock[] pageBlockArr, PageBlockCaption pageBlockCaption) {
            this.pageBlocks = pageBlockArr;
            this.caption = pageBlockCaption;
        }
    }

    public static class PageBlockCover extends PageBlock {
        public static final int CONSTRUCTOR = 972174080;
        public PageBlock cover;

        public PageBlockCover() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockCover(PageBlock pageBlock) {
            this.cover = pageBlock;
        }
    }

    public static class PageBlockDetails extends PageBlock {
        public static final int CONSTRUCTOR = -1599869809;
        public RichText header;
        public boolean isOpen;
        public PageBlock[] pageBlocks;

        public PageBlockDetails() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockDetails(RichText richText, PageBlock[] pageBlockArr, boolean z) {
            this.header = richText;
            this.pageBlocks = pageBlockArr;
            this.isOpen = z;
        }
    }

    public static class PageBlockDivider extends PageBlock {
        public static final int CONSTRUCTOR = -618614392;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockEmbedded extends PageBlock {
        public static final int CONSTRUCTOR = -1942577763;
        public boolean allowScrolling;
        public PageBlockCaption caption;
        public int height;
        public String html;
        public boolean isFullWidth;
        public Photo posterPhoto;
        public String url;
        public int width;

        public PageBlockEmbedded() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockEmbedded(String str, String str2, Photo photo, int i, int i2, PageBlockCaption pageBlockCaption, boolean z, boolean z2) {
            this.url = str;
            this.html = str2;
            this.posterPhoto = photo;
            this.width = i;
            this.height = i2;
            this.caption = pageBlockCaption;
            this.isFullWidth = z;
            this.allowScrolling = z2;
        }
    }

    public static class PageBlockEmbeddedPost extends PageBlock {
        public static final int CONSTRUCTOR = 397600949;
        public String author;
        public Photo authorPhoto;
        public PageBlockCaption caption;
        public int date;
        public PageBlock[] pageBlocks;
        public String url;

        public PageBlockEmbeddedPost() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockEmbeddedPost(String str, String str2, Photo photo, int i, PageBlock[] pageBlockArr, PageBlockCaption pageBlockCaption) {
            this.url = str;
            this.author = str2;
            this.authorPhoto = photo;
            this.date = i;
            this.pageBlocks = pageBlockArr;
            this.caption = pageBlockCaption;
        }
    }

    public static class PageBlockFooter extends PageBlock {
        public static final int CONSTRUCTOR = 886429480;
        public RichText footer;

        public PageBlockFooter() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockFooter(RichText richText) {
            this.footer = richText;
        }
    }

    public static class PageBlockHeader extends PageBlock {
        public static final int CONSTRUCTOR = 1402854811;
        public RichText header;

        public PageBlockHeader() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockHeader(RichText richText) {
            this.header = richText;
        }
    }

    public static abstract class PageBlockHorizontalAlignment extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class PageBlockHorizontalAlignmentCenter extends PageBlockHorizontalAlignment {
        public static final int CONSTRUCTOR = -1009203990;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockHorizontalAlignmentLeft extends PageBlockHorizontalAlignment {
        public static final int CONSTRUCTOR = 848701417;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockHorizontalAlignmentRight extends PageBlockHorizontalAlignment {
        public static final int CONSTRUCTOR = 1371369214;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockKicker extends PageBlock {
        public static final int CONSTRUCTOR = 1361282635;
        public RichText kicker;

        public PageBlockKicker() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockKicker(RichText richText) {
            this.kicker = richText;
        }
    }

    public static class PageBlockList extends PageBlock {
        public static final int CONSTRUCTOR = -1037074852;
        public PageBlockListItem[] items;

        public PageBlockList() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockList(PageBlockListItem[] pageBlockListItemArr) {
            this.items = pageBlockListItemArr;
        }
    }

    public static class PageBlockListItem extends Object {
        public static final int CONSTRUCTOR = 323186259;
        public String label;
        public PageBlock[] pageBlocks;

        public PageBlockListItem() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockListItem(String str, PageBlock[] pageBlockArr) {
            this.label = str;
            this.pageBlocks = pageBlockArr;
        }
    }

    public static class PageBlockMap extends PageBlock {
        public static final int CONSTRUCTOR = 1510961171;
        public PageBlockCaption caption;
        public int height;
        public Location location;
        public int width;
        public int zoom;

        public PageBlockMap() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockMap(Location location, int i, int i2, int i3, PageBlockCaption pageBlockCaption) {
            this.location = location;
            this.zoom = i;
            this.width = i2;
            this.height = i3;
            this.caption = pageBlockCaption;
        }
    }

    public static class PageBlockParagraph extends PageBlock {
        public static final int CONSTRUCTOR = 1182402406;
        public RichText text;

        public PageBlockParagraph() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockParagraph(RichText richText) {
            this.text = richText;
        }
    }

    public static class PageBlockPhoto extends PageBlock {
        public static final int CONSTRUCTOR = 417601156;
        public PageBlockCaption caption;
        public Photo photo;
        public String url;

        public PageBlockPhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockPhoto(Photo photo, PageBlockCaption pageBlockCaption, String str) {
            this.photo = photo;
            this.caption = pageBlockCaption;
            this.url = str;
        }
    }

    public static class PageBlockPreformatted extends PageBlock {
        public static final int CONSTRUCTOR = -1066346178;
        public String language;
        public RichText text;

        public PageBlockPreformatted() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockPreformatted(RichText richText, String str) {
            this.text = richText;
            this.language = str;
        }
    }

    public static class PageBlockPullQuote extends PageBlock {
        public static final int CONSTRUCTOR = 490242317;
        public RichText credit;
        public RichText text;

        public PageBlockPullQuote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockPullQuote(RichText richText, RichText richText2) {
            this.text = richText;
            this.credit = richText2;
        }
    }

    public static class PageBlockRelatedArticle extends Object {
        public static final int CONSTRUCTOR = 481199251;
        public String author;
        public String description;
        public Photo photo;
        public int publishDate;
        public String title;
        public String url;

        public PageBlockRelatedArticle() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockRelatedArticle(String str, String str2, String str3, Photo photo, String str4, int i) {
            this.url = str;
            this.title = str2;
            this.description = str3;
            this.photo = photo;
            this.author = str4;
            this.publishDate = i;
        }
    }

    public static class PageBlockRelatedArticles extends PageBlock {
        public static final int CONSTRUCTOR = -1807324374;
        public PageBlockRelatedArticle[] articles;
        public RichText header;

        public PageBlockRelatedArticles() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockRelatedArticles(RichText richText, PageBlockRelatedArticle[] pageBlockRelatedArticleArr) {
            this.header = richText;
            this.articles = pageBlockRelatedArticleArr;
        }
    }

    public static class PageBlockSlideshow extends PageBlock {
        public static final int CONSTRUCTOR = 539217375;
        public PageBlockCaption caption;
        public PageBlock[] pageBlocks;

        public PageBlockSlideshow() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockSlideshow(PageBlock[] pageBlockArr, PageBlockCaption pageBlockCaption) {
            this.pageBlocks = pageBlockArr;
            this.caption = pageBlockCaption;
        }
    }

    public static class PageBlockSubheader extends PageBlock {
        public static final int CONSTRUCTOR = 1263956774;
        public RichText subheader;

        public PageBlockSubheader() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockSubheader(RichText richText) {
            this.subheader = richText;
        }
    }

    public static class PageBlockSubtitle extends PageBlock {
        public static final int CONSTRUCTOR = 264524263;
        public RichText subtitle;

        public PageBlockSubtitle() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockSubtitle(RichText richText) {
            this.subtitle = richText;
        }
    }

    public static class PageBlockTable extends PageBlock {
        public static final int CONSTRUCTOR = -942649288;
        public RichText caption;
        public PageBlockTableCell[][] cells;
        public boolean isBordered;
        public boolean isStriped;

        public PageBlockTable() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockTable(RichText richText, PageBlockTableCell[][] pageBlockTableCellArr, boolean z, boolean z2) {
            this.caption = richText;
            this.cells = pageBlockTableCellArr;
            this.isBordered = z;
            this.isStriped = z2;
        }
    }

    public static class PageBlockTableCell extends Object {
        public static final int CONSTRUCTOR = 1417658214;
        public PageBlockHorizontalAlignment align;
        public int colspan;
        public boolean isHeader;
        public int rowspan;
        public RichText text;
        public PageBlockVerticalAlignment valign;

        public PageBlockTableCell() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockTableCell(RichText richText, boolean z, int i, int i2, PageBlockHorizontalAlignment pageBlockHorizontalAlignment, PageBlockVerticalAlignment pageBlockVerticalAlignment) {
            this.text = richText;
            this.isHeader = z;
            this.colspan = i;
            this.rowspan = i2;
            this.align = pageBlockHorizontalAlignment;
            this.valign = pageBlockVerticalAlignment;
        }
    }

    public static class PageBlockTitle extends PageBlock {
        public static final int CONSTRUCTOR = 1629664784;
        public RichText title;

        public PageBlockTitle() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockTitle(RichText richText) {
            this.title = richText;
        }
    }

    public static abstract class PageBlockVerticalAlignment extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class PageBlockVerticalAlignmentBottom extends PageBlockVerticalAlignment {
        public static final int CONSTRUCTOR = 2092531158;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockVerticalAlignmentMiddle extends PageBlockVerticalAlignment {
        public static final int CONSTRUCTOR = -2123096587;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockVerticalAlignmentTop extends PageBlockVerticalAlignment {
        public static final int CONSTRUCTOR = 195500454;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockVideo extends PageBlock {
        public static final int CONSTRUCTOR = 510041394;
        public PageBlockCaption caption;
        public boolean isLooped;
        public boolean needAutoplay;
        public Video video;

        public PageBlockVideo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockVideo(Video video, PageBlockCaption pageBlockCaption, boolean z, boolean z2) {
            this.video = video;
            this.caption = pageBlockCaption;
            this.needAutoplay = z;
            this.isLooped = z2;
        }
    }

    public static class PageBlockVoiceNote extends PageBlock {
        public static final int CONSTRUCTOR = 1823310463;
        public PageBlockCaption caption;
        public VoiceNote voiceNote;

        public PageBlockVoiceNote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PageBlockVoiceNote(VoiceNote voiceNote, PageBlockCaption pageBlockCaption) {
            this.voiceNote = voiceNote;
            this.caption = pageBlockCaption;
        }
    }

    public static class ParseMarkdown extends Function {
        public static final int CONSTRUCTOR = 756366063;
        public FormattedText text;

        public ParseMarkdown() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ParseMarkdown(FormattedText formattedText) {
            this.text = formattedText;
        }
    }

    public static class ParseTextEntities extends Function {
        public static final int CONSTRUCTOR = -1709194593;
        public TextParseMode parseMode;
        public String text;

        public ParseTextEntities() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ParseTextEntities(String str, TextParseMode textParseMode) {
            this.text = str;
            this.parseMode = textParseMode;
        }
    }

    public static class PassportAuthorizationForm extends Object {
        public static final int CONSTRUCTOR = -1070673218;
        public int f25409id;
        public String privacyPolicyUrl;
        public PassportRequiredElement[] requiredElements;

        public PassportAuthorizationForm() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PassportAuthorizationForm(int i, PassportRequiredElement[] passportRequiredElementArr, String str) {
            this.f25409id = i;
            this.requiredElements = passportRequiredElementArr;
            this.privacyPolicyUrl = str;
        }
    }

    public static abstract class PassportElement extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class PassportElementAddress extends PassportElement {
        public static final int CONSTRUCTOR = -782625232;
        public Address address;

        public PassportElementAddress() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PassportElementAddress(Address address) {
            this.address = address;
        }
    }

    public static class PassportElementBankStatement extends PassportElement {
        public static final int CONSTRUCTOR = -366464408;
        public PersonalDocument bankStatement;

        public PassportElementBankStatement() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PassportElementBankStatement(PersonalDocument personalDocument) {
            this.bankStatement = personalDocument;
        }
    }

    public static class PassportElementDriverLicense extends PassportElement {
        public static final int CONSTRUCTOR = 1643580589;
        public IdentityDocument driverLicense;

        public PassportElementDriverLicense() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PassportElementDriverLicense(IdentityDocument identityDocument) {
            this.driverLicense = identityDocument;
        }
    }

    public static class PassportElementEmailAddress extends PassportElement {
        public static final int CONSTRUCTOR = -1528129531;
        public String emailAddress;

        public PassportElementEmailAddress() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PassportElementEmailAddress(String str) {
            this.emailAddress = str;
        }
    }

    public static class PassportElementError extends Object {
        public static final int CONSTRUCTOR = -1861902395;
        public String message;
        public PassportElementErrorSource source;
        public PassportElementType type;

        public PassportElementError() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PassportElementError(PassportElementType passportElementType, String str, PassportElementErrorSource passportElementErrorSource) {
            this.type = passportElementType;
            this.message = str;
            this.source = passportElementErrorSource;
        }
    }

    public static abstract class PassportElementErrorSource extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class PassportElementErrorSourceDataField extends PassportElementErrorSource {
        public static final int CONSTRUCTOR = -308650776;
        public String fieldName;

        public PassportElementErrorSourceDataField() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PassportElementErrorSourceDataField(String str) {
            this.fieldName = str;
        }
    }

    public static class PassportElementErrorSourceFile extends PassportElementErrorSource {
        public static final int CONSTRUCTOR = 2020358960;
        public int fileIndex;

        public PassportElementErrorSourceFile() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PassportElementErrorSourceFile(int i) {
            this.fileIndex = i;
        }
    }

    public static class PassportElementErrorSourceFiles extends PassportElementErrorSource {
        public static final int CONSTRUCTOR = 1894164178;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementErrorSourceFrontSide extends PassportElementErrorSource {
        public static final int CONSTRUCTOR = 1895658292;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementErrorSourceReverseSide extends PassportElementErrorSource {
        public static final int CONSTRUCTOR = 1918630391;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementErrorSourceSelfie extends PassportElementErrorSource {
        public static final int CONSTRUCTOR = -797043672;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementErrorSourceTranslationFile extends PassportElementErrorSource {
        public static final int CONSTRUCTOR = -689621228;
        public int fileIndex;

        public PassportElementErrorSourceTranslationFile() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PassportElementErrorSourceTranslationFile(int i) {
            this.fileIndex = i;
        }
    }

    public static class PassportElementErrorSourceTranslationFiles extends PassportElementErrorSource {
        public static final int CONSTRUCTOR = 581280796;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementErrorSourceUnspecified extends PassportElementErrorSource {
        public static final int CONSTRUCTOR = -378320830;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementIdentityCard extends PassportElement {
        public static final int CONSTRUCTOR = 2083775797;
        public IdentityDocument identityCard;

        public PassportElementIdentityCard() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PassportElementIdentityCard(IdentityDocument identityDocument) {
            this.identityCard = identityDocument;
        }
    }

    public static class PassportElementInternalPassport extends PassportElement {
        public static final int CONSTRUCTOR = 36220295;
        public IdentityDocument internalPassport;

        public PassportElementInternalPassport() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PassportElementInternalPassport(IdentityDocument identityDocument) {
            this.internalPassport = identityDocument;
        }
    }

    public static class PassportElementPassport extends PassportElement {
        public static final int CONSTRUCTOR = -263985373;
        public IdentityDocument passport;

        public PassportElementPassport() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PassportElementPassport(IdentityDocument identityDocument) {
            this.passport = identityDocument;
        }
    }

    public static class PassportElementPassportRegistration extends PassportElement {
        public static final int CONSTRUCTOR = 618323071;
        public PersonalDocument passportRegistration;

        public PassportElementPassportRegistration() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PassportElementPassportRegistration(PersonalDocument personalDocument) {
            this.passportRegistration = personalDocument;
        }
    }

    public static class PassportElementPersonalDetails extends PassportElement {
        public static final int CONSTRUCTOR = 1217724035;
        public PersonalDetails personalDetails;

        public PassportElementPersonalDetails() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PassportElementPersonalDetails(PersonalDetails personalDetails) {
            this.personalDetails = personalDetails;
        }
    }

    public static class PassportElementPhoneNumber extends PassportElement {
        public static final int CONSTRUCTOR = -1320118375;
        public String phoneNumber;

        public PassportElementPhoneNumber() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PassportElementPhoneNumber(String str) {
            this.phoneNumber = str;
        }
    }

    public static class PassportElementRentalAgreement extends PassportElement {
        public static final int CONSTRUCTOR = -290141400;
        public PersonalDocument rentalAgreement;

        public PassportElementRentalAgreement() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PassportElementRentalAgreement(PersonalDocument personalDocument) {
            this.rentalAgreement = personalDocument;
        }
    }

    public static class PassportElementTemporaryRegistration extends PassportElement {
        public static final int CONSTRUCTOR = 1237626864;
        public PersonalDocument temporaryRegistration;

        public PassportElementTemporaryRegistration() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PassportElementTemporaryRegistration(PersonalDocument personalDocument) {
            this.temporaryRegistration = personalDocument;
        }
    }

    public static abstract class PassportElementType extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class PassportElementTypeAddress extends PassportElementType {
        public static final int CONSTRUCTOR = 496327874;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTypeBankStatement extends PassportElementType {
        public static final int CONSTRUCTOR = 574095667;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTypeDriverLicense extends PassportElementType {
        public static final int CONSTRUCTOR = 1827298379;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTypeEmailAddress extends PassportElementType {
        public static final int CONSTRUCTOR = -79321405;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTypeIdentityCard extends PassportElementType {
        public static final int CONSTRUCTOR = -502356132;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTypeInternalPassport extends PassportElementType {
        public static final int CONSTRUCTOR = -793781959;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTypePassport extends PassportElementType {
        public static final int CONSTRUCTOR = -436360376;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTypePassportRegistration extends PassportElementType {
        public static final int CONSTRUCTOR = -159478209;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTypePersonalDetails extends PassportElementType {
        public static final int CONSTRUCTOR = -1032136365;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTypePhoneNumber extends PassportElementType {
        public static final int CONSTRUCTOR = -995361172;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTypeRentalAgreement extends PassportElementType {
        public static final int CONSTRUCTOR = -2060583280;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTypeTemporaryRegistration extends PassportElementType {
        public static final int CONSTRUCTOR = 1092498527;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTypeUtilityBill extends PassportElementType {
        public static final int CONSTRUCTOR = 627084906;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementUtilityBill extends PassportElement {
        public static final int CONSTRUCTOR = -234611246;
        public PersonalDocument utilityBill;

        public PassportElementUtilityBill() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PassportElementUtilityBill(PersonalDocument personalDocument) {
            this.utilityBill = personalDocument;
        }
    }

    public static class PassportElements extends Object {
        public static final int CONSTRUCTOR = 1264617556;
        public PassportElement[] elements;

        public PassportElements() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PassportElements(PassportElement[] passportElementArr) {
            this.elements = passportElementArr;
        }
    }

    public static class PassportElementsWithErrors extends Object {
        public static final int CONSTRUCTOR = 1308923044;
        public PassportElement[] elements;
        public PassportElementError[] errors;

        public PassportElementsWithErrors() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PassportElementsWithErrors(PassportElement[] passportElementArr, PassportElementError[] passportElementErrorArr) {
            this.elements = passportElementArr;
            this.errors = passportElementErrorArr;
        }
    }

    public static class PassportRequiredElement extends Object {
        public static final int CONSTRUCTOR = -1983641651;
        public PassportSuitableElement[] suitableElements;

        public PassportRequiredElement() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PassportRequiredElement(PassportSuitableElement[] passportSuitableElementArr) {
            this.suitableElements = passportSuitableElementArr;
        }
    }

    public static class PassportSuitableElement extends Object {
        public static final int CONSTRUCTOR = -789019876;
        public boolean isNativeNameRequired;
        public boolean isSelfieRequired;
        public boolean isTranslationRequired;
        public PassportElementType type;

        public PassportSuitableElement() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PassportSuitableElement(PassportElementType passportElementType, boolean z, boolean z2, boolean z3) {
            this.type = passportElementType;
            this.isSelfieRequired = z;
            this.isTranslationRequired = z2;
            this.isNativeNameRequired = z3;
        }
    }

    public static class PasswordState extends Object {
        public static final int CONSTRUCTOR = -2001619202;
        public boolean hasPassportData;
        public boolean hasPassword;
        public boolean hasRecoveryEmailAddress;
        public String passwordHint;
        public int pendingResetDate;
        public EmailAddressAuthenticationCodeInfo recoveryEmailAddressCodeInfo;

        public PasswordState() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PasswordState(boolean z, String str, boolean z2, boolean z3, EmailAddressAuthenticationCodeInfo emailAddressAuthenticationCodeInfo, int i) {
            this.hasPassword = z;
            this.passwordHint = str;
            this.hasRecoveryEmailAddress = z2;
            this.hasPassportData = z3;
            this.recoveryEmailAddressCodeInfo = emailAddressAuthenticationCodeInfo;
            this.pendingResetDate = i;
        }
    }

    public static class PaymentForm extends Object {
        public static final int CONSTRUCTOR = 1462608358;
        public boolean canSaveCredentials;
        public long f25410id;
        public Invoice invoice;
        public boolean needPassword;
        public PaymentsProviderStripe paymentsProvider;
        public long paymentsProviderUserId;
        public SavedCredentials savedCredentials;
        public OrderInfo savedOrderInfo;
        public long sellerBotUserId;
        public String url;

        public PaymentForm() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PaymentForm(long j, Invoice invoice, String str, long j2, long j3, PaymentsProviderStripe paymentsProviderStripe, OrderInfo orderInfo, SavedCredentials savedCredentials, boolean z, boolean z2) {
            this.f25410id = j;
            this.invoice = invoice;
            this.url = str;
            this.sellerBotUserId = j2;
            this.paymentsProviderUserId = j3;
            this.paymentsProvider = paymentsProviderStripe;
            this.savedOrderInfo = orderInfo;
            this.savedCredentials = savedCredentials;
            this.canSaveCredentials = z;
            this.needPassword = z2;
        }
    }

    public static class PaymentFormTheme extends Object {
        public static final int CONSTRUCTOR = -1760030833;
        public int backgroundColor;
        public int buttonColor;
        public int buttonTextColor;
        public int hintColor;
        public int linkColor;
        public int textColor;

        public PaymentFormTheme() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PaymentFormTheme(int i, int i2, int i3, int i4, int i5, int i6) {
            this.backgroundColor = i;
            this.textColor = i2;
            this.hintColor = i3;
            this.linkColor = i4;
            this.buttonColor = i5;
            this.buttonTextColor = i6;
        }
    }

    public static class PaymentReceipt extends Object {
        public static final int CONSTRUCTOR = -401796169;
        public String credentialsTitle;
        public int date;
        public String description;
        public Invoice invoice;
        public OrderInfo orderInfo;
        public long paymentsProviderUserId;
        public Photo photo;
        public long sellerBotUserId;
        public ShippingOption shippingOption;
        public long tipAmount;
        public String title;

        public PaymentReceipt() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PaymentReceipt(String str, String str2, Photo photo, int i, long j, long j2, Invoice invoice, OrderInfo orderInfo, ShippingOption shippingOption, String str3, long j3) {
            this.title = str;
            this.description = str2;
            this.photo = photo;
            this.date = i;
            this.sellerBotUserId = j;
            this.paymentsProviderUserId = j2;
            this.invoice = invoice;
            this.orderInfo = orderInfo;
            this.shippingOption = shippingOption;
            this.credentialsTitle = str3;
            this.tipAmount = j3;
        }
    }

    public static class PaymentResult extends Object {
        public static final int CONSTRUCTOR = -804263843;
        public boolean success;
        public String verificationUrl;

        public PaymentResult() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PaymentResult(boolean z, String str) {
            this.success = z;
            this.verificationUrl = str;
        }
    }

    public static class PaymentsProviderStripe extends Object {
        public static final int CONSTRUCTOR = 1090791032;
        public boolean needCardholderName;
        public boolean needCountry;
        public boolean needPostalCode;
        public String publishableKey;

        public PaymentsProviderStripe() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PaymentsProviderStripe(String str, boolean z, boolean z2, boolean z3) {
            this.publishableKey = str;
            this.needCountry = z;
            this.needPostalCode = z2;
            this.needCardholderName = z3;
        }
    }

    public static class PersonalDetails extends Object {
        public static final int CONSTRUCTOR = -1061656137;
        public Date birthdate;
        public String countryCode;
        public String firstName;
        public String gender;
        public String lastName;
        public String middleName;
        public String nativeFirstName;
        public String nativeLastName;
        public String nativeMiddleName;
        public String residenceCountryCode;

        public PersonalDetails() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PersonalDetails(String str, String str2, String str3, String str4, String str5, String str6, Date date, String str7, String str8, String str9) {
            this.firstName = str;
            this.middleName = str2;
            this.lastName = str3;
            this.nativeFirstName = str4;
            this.nativeMiddleName = str5;
            this.nativeLastName = str6;
            this.birthdate = date;
            this.gender = str7;
            this.countryCode = str8;
            this.residenceCountryCode = str9;
        }
    }

    public static class PersonalDocument extends Object {
        public static final int CONSTRUCTOR = -1011634661;
        public DatedFile[] files;
        public DatedFile[] translation;

        public PersonalDocument() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PersonalDocument(DatedFile[] datedFileArr, DatedFile[] datedFileArr2) {
            this.files = datedFileArr;
            this.translation = datedFileArr2;
        }
    }

    public static class PhoneNumberAuthenticationSettings extends Object {
        public static final int CONSTRUCTOR = -421219756;
        public boolean allowFlashCall;
        public boolean allowMissedCall;
        public boolean allowSmsRetrieverApi;
        public String[] authenticationTokens;
        public boolean isCurrentPhoneNumber;

        public PhoneNumberAuthenticationSettings() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PhoneNumberAuthenticationSettings(boolean z, boolean z2, boolean z3, boolean z4, String[] strArr) {
            this.allowFlashCall = z;
            this.allowMissedCall = z2;
            this.isCurrentPhoneNumber = z3;
            this.allowSmsRetrieverApi = z4;
            this.authenticationTokens = strArr;
        }
    }

    public static class PhoneNumberInfo extends Object {
        public static final int CONSTRUCTOR = 560180961;
        public CountryInfo country;
        public String countryCallingCode;
        public String formattedPhoneNumber;

        public PhoneNumberInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PhoneNumberInfo(CountryInfo countryInfo, String str, String str2) {
            this.country = countryInfo;
            this.countryCallingCode = str;
            this.formattedPhoneNumber = str2;
        }
    }

    public static class Photo extends Object {
        public static final int CONSTRUCTOR = -2022871583;
        public boolean hasStickers;
        public Minithumbnail minithumbnail;
        public PhotoSize[] sizes;

        public Photo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Photo(boolean z, Minithumbnail minithumbnail, PhotoSize[] photoSizeArr) {
            this.hasStickers = z;
            this.minithumbnail = minithumbnail;
            this.sizes = photoSizeArr;
        }
    }

    public static class PhotoSize extends Object {
        public static final int CONSTRUCTOR = 1609182352;
        public int height;
        public File photo;
        public int[] progressiveSizes;
        public String type;
        public int width;

        public PhotoSize() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PhotoSize(String str, File file, int i, int i2, int[] iArr) {
            this.type = str;
            this.photo = file;
            this.width = i;
            this.height = i2;
            this.progressiveSizes = iArr;
        }
    }

    public static class PinChatMessage extends Function {
        public static final int CONSTRUCTOR = 2034719663;
        public long chatId;
        public boolean disableNotification;
        public long messageId;
        public boolean onlyForSelf;

        public PinChatMessage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PinChatMessage(long j, long j2, boolean z, boolean z2) {
            this.chatId = j;
            this.messageId = j2;
            this.disableNotification = z;
            this.onlyForSelf = z2;
        }
    }

    public static class PingProxy extends Function {
        public static final int CONSTRUCTOR = -979681103;
        public int proxyId;

        public PingProxy() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PingProxy(int i) {
            this.proxyId = i;
        }
    }

    public static class Point extends Object {
        public static final int CONSTRUCTOR = 437515705;
        public double f25411x;
        public double f25412y;

        public Point() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Point(double d, double d2) {
            this.f25411x = d;
            this.f25412y = d2;
        }
    }

    public static class Poll extends Object {
        public static final int CONSTRUCTOR = 116940085;
        public int closeDate;
        public long f25413id;
        public boolean isAnonymous;
        public boolean isClosed;
        public int openPeriod;
        public PollOption[] options;
        public String question;
        public long[] recentVoterUserIds;
        public int totalVoterCount;
        public PollType type;

        public Poll() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Poll(long j, String str, PollOption[] pollOptionArr, int i, long[] jArr, boolean z, PollType pollType, int i2, int i3, boolean z2) {
            this.f25413id = j;
            this.question = str;
            this.options = pollOptionArr;
            this.totalVoterCount = i;
            this.recentVoterUserIds = jArr;
            this.isAnonymous = z;
            this.type = pollType;
            this.openPeriod = i2;
            this.closeDate = i3;
            this.isClosed = z2;
        }
    }

    public static class PollOption extends Object {
        public static final int CONSTRUCTOR = 1473893797;
        public boolean isBeingChosen;
        public boolean isChosen;
        public String text;
        public int votePercentage;
        public int voterCount;

        public PollOption() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PollOption(String str, int i, int i2, boolean z, boolean z2) {
            this.text = str;
            this.voterCount = i;
            this.votePercentage = i2;
            this.isChosen = z;
            this.isBeingChosen = z2;
        }
    }

    public static abstract class PollType extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class PollTypeQuiz extends PollType {
        public static final int CONSTRUCTOR = 657013913;
        public int correctOptionId;
        public FormattedText explanation;

        public PollTypeQuiz() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PollTypeQuiz(int i, FormattedText formattedText) {
            this.correctOptionId = i;
            this.explanation = formattedText;
        }
    }

    public static class PollTypeRegular extends PollType {
        public static final int CONSTRUCTOR = 641265698;
        public boolean allowMultipleAnswers;

        public PollTypeRegular() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PollTypeRegular(boolean z) {
            this.allowMultipleAnswers = z;
        }
    }

    public static class ProcessChatJoinRequest extends Function {
        public static final int CONSTRUCTOR = 1004876963;
        public boolean approve;
        public long chatId;
        public long userId;

        public ProcessChatJoinRequest() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ProcessChatJoinRequest(long j, long j2, boolean z) {
            this.chatId = j;
            this.userId = j2;
            this.approve = z;
        }
    }

    public static class ProcessChatJoinRequests extends Function {
        public static final int CONSTRUCTOR = 1048722894;
        public boolean approve;
        public long chatId;
        public String inviteLink;

        public ProcessChatJoinRequests() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ProcessChatJoinRequests(long j, String str, boolean z) {
            this.chatId = j;
            this.inviteLink = str;
            this.approve = z;
        }
    }

    public static class ProcessPushNotification extends Function {
        public static final int CONSTRUCTOR = 786679952;
        public String payload;

        public ProcessPushNotification() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ProcessPushNotification(String str) {
            this.payload = str;
        }
    }

    public static class ProfilePhoto extends Object {
        public static final int CONSTRUCTOR = -131097523;
        public File big;
        public boolean hasAnimation;
        public long f25414id;
        public Minithumbnail minithumbnail;
        public File small;

        public ProfilePhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ProfilePhoto(long j, File file, File file2, Minithumbnail minithumbnail, boolean z) {
            this.f25414id = j;
            this.small = file;
            this.big = file2;
            this.minithumbnail = minithumbnail;
            this.hasAnimation = z;
        }
    }

    public static class Proxies extends Object {
        public static final int CONSTRUCTOR = 1200447205;
        public Proxy[] proxies;

        public Proxies() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Proxies(Proxy[] proxyArr) {
            this.proxies = proxyArr;
        }
    }

    public static class Proxy extends Object {
        public static final int CONSTRUCTOR = 196049779;
        public int f25415id;
        public boolean isEnabled;
        public int lastUsedDate;
        public int port;
        public String server;
        public ProxyType type;

        public Proxy() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Proxy(int i, String str, int i2, int i3, boolean z, ProxyType proxyType) {
            this.f25415id = i;
            this.server = str;
            this.port = i2;
            this.lastUsedDate = i3;
            this.isEnabled = z;
            this.type = proxyType;
        }
    }

    public static abstract class ProxyType extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class ProxyTypeHttp extends ProxyType {
        public static final int CONSTRUCTOR = -1547188361;
        public boolean httpOnly;
        public String password;
        public String username;

        public ProxyTypeHttp() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ProxyTypeHttp(String str, String str2, boolean z) {
            this.username = str;
            this.password = str2;
            this.httpOnly = z;
        }
    }

    public static class ProxyTypeMtproto extends ProxyType {
        public static final int CONSTRUCTOR = -1964826627;
        public String secret;

        public ProxyTypeMtproto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ProxyTypeMtproto(String str) {
            this.secret = str;
        }
    }

    public static class ProxyTypeSocks5 extends ProxyType {
        public static final int CONSTRUCTOR = -890027341;
        public String password;
        public String username;

        public ProxyTypeSocks5() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ProxyTypeSocks5(String str, String str2) {
            this.username = str;
            this.password = str2;
        }
    }

    public static abstract class PublicChatType extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class PublicChatTypeHasUsername extends PublicChatType {
        public static final int CONSTRUCTOR = 350789758;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PublicChatTypeIsLocationBased extends PublicChatType {
        public static final int CONSTRUCTOR = 1183735952;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static abstract class PushMessageContent extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class PushMessageContentAnimation extends PushMessageContent {
        public static final int CONSTRUCTOR = 1034215396;
        public Animation animation;
        public String caption;
        public boolean isPinned;

        public PushMessageContentAnimation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PushMessageContentAnimation(Animation animation, String str, boolean z) {
            this.animation = animation;
            this.caption = str;
            this.isPinned = z;
        }
    }

    public static class PushMessageContentAudio extends PushMessageContent {
        public static final int CONSTRUCTOR = 381581426;
        public Audio audio;
        public boolean isPinned;

        public PushMessageContentAudio() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PushMessageContentAudio(Audio audio, boolean z) {
            this.audio = audio;
            this.isPinned = z;
        }
    }

    public static class PushMessageContentBasicGroupChatCreate extends PushMessageContent {
        public static final int CONSTRUCTOR = -2114855172;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentChatAddMembers extends PushMessageContent {
        public static final int CONSTRUCTOR = -1087145158;
        public boolean isCurrentUser;
        public boolean isReturned;
        public String memberName;

        public PushMessageContentChatAddMembers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PushMessageContentChatAddMembers(String str, boolean z, boolean z2) {
            this.memberName = str;
            this.isCurrentUser = z;
            this.isReturned = z2;
        }
    }

    public static class PushMessageContentChatChangePhoto extends PushMessageContent {
        public static final int CONSTRUCTOR = -1114222051;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentChatChangeTitle extends PushMessageContent {
        public static final int CONSTRUCTOR = -1964902749;
        public String title;

        public PushMessageContentChatChangeTitle() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PushMessageContentChatChangeTitle(String str) {
            this.title = str;
        }
    }

    public static class PushMessageContentChatDeleteMember extends PushMessageContent {
        public static final int CONSTRUCTOR = 598714783;
        public boolean isCurrentUser;
        public boolean isLeft;
        public String memberName;

        public PushMessageContentChatDeleteMember() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PushMessageContentChatDeleteMember(String str, boolean z, boolean z2) {
            this.memberName = str;
            this.isCurrentUser = z;
            this.isLeft = z2;
        }
    }

    public static class PushMessageContentChatJoinByLink extends PushMessageContent {
        public static final int CONSTRUCTOR = 1553719113;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentChatJoinByRequest extends PushMessageContent {
        public static final int CONSTRUCTOR = -205823627;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentChatSetTheme extends PushMessageContent {
        public static final int CONSTRUCTOR = 173882216;
        public String themeName;

        public PushMessageContentChatSetTheme() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PushMessageContentChatSetTheme(String str) {
            this.themeName = str;
        }
    }

    public static class PushMessageContentContact extends PushMessageContent {
        public static final int CONSTRUCTOR = -12219820;
        public boolean isPinned;
        public String name;

        public PushMessageContentContact() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PushMessageContentContact(String str, boolean z) {
            this.name = str;
            this.isPinned = z;
        }
    }

    public static class PushMessageContentContactRegistered extends PushMessageContent {
        public static final int CONSTRUCTOR = -303962720;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentDocument extends PushMessageContent {
        public static final int CONSTRUCTOR = -458379775;
        public Document document;
        public boolean isPinned;

        public PushMessageContentDocument() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PushMessageContentDocument(Document document, boolean z) {
            this.document = document;
            this.isPinned = z;
        }
    }

    public static class PushMessageContentGame extends PushMessageContent {
        public static final int CONSTRUCTOR = -515131109;
        public boolean isPinned;
        public String title;

        public PushMessageContentGame() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PushMessageContentGame(String str, boolean z) {
            this.title = str;
            this.isPinned = z;
        }
    }

    public static class PushMessageContentGameScore extends PushMessageContent {
        public static final int CONSTRUCTOR = 901303688;
        public boolean isPinned;
        public int score;
        public String title;

        public PushMessageContentGameScore() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PushMessageContentGameScore(String str, int i, boolean z) {
            this.title = str;
            this.score = i;
            this.isPinned = z;
        }
    }

    public static class PushMessageContentHidden extends PushMessageContent {
        public static final int CONSTRUCTOR = -316950436;
        public boolean isPinned;

        public PushMessageContentHidden() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PushMessageContentHidden(boolean z) {
            this.isPinned = z;
        }
    }

    public static class PushMessageContentInvoice extends PushMessageContent {
        public static final int CONSTRUCTOR = -1731687492;
        public boolean isPinned;
        public String price;

        public PushMessageContentInvoice() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PushMessageContentInvoice(String str, boolean z) {
            this.price = str;
            this.isPinned = z;
        }
    }

    public static class PushMessageContentLocation extends PushMessageContent {
        public static final int CONSTRUCTOR = -1288005709;
        public boolean isLive;
        public boolean isPinned;

        public PushMessageContentLocation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PushMessageContentLocation(boolean z, boolean z2) {
            this.isLive = z;
            this.isPinned = z2;
        }
    }

    public static class PushMessageContentMediaAlbum extends PushMessageContent {
        public static final int CONSTRUCTOR = -748426897;
        public boolean hasAudios;
        public boolean hasDocuments;
        public boolean hasPhotos;
        public boolean hasVideos;
        public int totalCount;

        public PushMessageContentMediaAlbum() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PushMessageContentMediaAlbum(int i, boolean z, boolean z2, boolean z3, boolean z4) {
            this.totalCount = i;
            this.hasPhotos = z;
            this.hasVideos = z2;
            this.hasAudios = z3;
            this.hasDocuments = z4;
        }
    }

    public static class PushMessageContentMessageForwards extends PushMessageContent {
        public static final int CONSTRUCTOR = -1913083876;
        public int totalCount;

        public PushMessageContentMessageForwards() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PushMessageContentMessageForwards(int i) {
            this.totalCount = i;
        }
    }

    public static class PushMessageContentPhoto extends PushMessageContent {
        public static final int CONSTRUCTOR = 140631122;
        public String caption;
        public boolean isPinned;
        public boolean isSecret;
        public Photo photo;

        public PushMessageContentPhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PushMessageContentPhoto(Photo photo, String str, boolean z, boolean z2) {
            this.photo = photo;
            this.caption = str;
            this.isSecret = z;
            this.isPinned = z2;
        }
    }

    public static class PushMessageContentPoll extends PushMessageContent {
        public static final int CONSTRUCTOR = -44403654;
        public boolean isPinned;
        public boolean isRegular;
        public String question;

        public PushMessageContentPoll() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PushMessageContentPoll(String str, boolean z, boolean z2) {
            this.question = str;
            this.isRegular = z;
            this.isPinned = z2;
        }
    }

    public static class PushMessageContentScreenshotTaken extends PushMessageContent {
        public static final int CONSTRUCTOR = 214245369;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentSticker extends PushMessageContent {
        public static final int CONSTRUCTOR = 1553513939;
        public String emoji;
        public boolean isPinned;
        public Sticker sticker;

        public PushMessageContentSticker() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PushMessageContentSticker(Sticker sticker, String str, boolean z) {
            this.sticker = sticker;
            this.emoji = str;
            this.isPinned = z;
        }
    }

    public static class PushMessageContentText extends PushMessageContent {
        public static final int CONSTRUCTOR = 274587305;
        public boolean isPinned;
        public String text;

        public PushMessageContentText() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PushMessageContentText(String str, boolean z) {
            this.text = str;
            this.isPinned = z;
        }
    }

    public static class PushMessageContentVideo extends PushMessageContent {
        public static final int CONSTRUCTOR = 310038831;
        public String caption;
        public boolean isPinned;
        public boolean isSecret;
        public Video video;

        public PushMessageContentVideo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PushMessageContentVideo(Video video, String str, boolean z, boolean z2) {
            this.video = video;
            this.caption = str;
            this.isSecret = z;
            this.isPinned = z2;
        }
    }

    public static class PushMessageContentVideoNote extends PushMessageContent {
        public static final int CONSTRUCTOR = -1122764417;
        public boolean isPinned;
        public VideoNote videoNote;

        public PushMessageContentVideoNote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PushMessageContentVideoNote(VideoNote videoNote, boolean z) {
            this.videoNote = videoNote;
            this.isPinned = z;
        }
    }

    public static class PushMessageContentVoiceNote extends PushMessageContent {
        public static final int CONSTRUCTOR = 88910987;
        public boolean isPinned;
        public VoiceNote voiceNote;

        public PushMessageContentVoiceNote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PushMessageContentVoiceNote(VoiceNote voiceNote, boolean z) {
            this.voiceNote = voiceNote;
            this.isPinned = z;
        }
    }

    public static class PushReceiverId extends Object {
        public static final int CONSTRUCTOR = 371056428;
        public long f25416id;

        public PushReceiverId() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public PushReceiverId(long j) {
            this.f25416id = j;
        }
    }

    public static class Reaction extends Object {
        public static final int CONSTRUCTOR = -9677071;
        public Sticker activateAnimation;
        public Sticker appearAnimation;
        public Sticker aroundAnimation;
        public Sticker centerAnimation;
        public Sticker effectAnimation;
        public boolean isActive;
        public String reaction;
        public Sticker selectAnimation;
        public Sticker staticIcon;
        public String title;

        public Reaction() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Reaction(String str, String str2, boolean z, Sticker sticker, Sticker sticker2, Sticker sticker3, Sticker sticker4, Sticker sticker5, Sticker sticker6, Sticker sticker7) {
            this.reaction = str;
            this.title = str2;
            this.isActive = z;
            this.staticIcon = sticker;
            this.appearAnimation = sticker2;
            this.selectAnimation = sticker3;
            this.activateAnimation = sticker4;
            this.effectAnimation = sticker5;
            this.aroundAnimation = sticker6;
            this.centerAnimation = sticker7;
        }
    }

    public static class ReadAllChatMentions extends Function {
        public static final int CONSTRUCTOR = 1357558453;
        public long chatId;

        public ReadAllChatMentions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ReadAllChatMentions(long j) {
            this.chatId = j;
        }
    }

    public static class ReadAllChatReactions extends Function {
        public static final int CONSTRUCTOR = 1421973357;
        public long chatId;

        public ReadAllChatReactions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ReadAllChatReactions(long j) {
            this.chatId = j;
        }
    }

    public static class ReadFilePart extends Function {
        public static final int CONSTRUCTOR = -407749314;
        public int count;
        public int fileId;
        public int offset;

        public ReadFilePart() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ReadFilePart(int i, int i2, int i3) {
            this.fileId = i;
            this.offset = i2;
            this.count = i3;
        }
    }

    public static class RecommendedChatFilter extends Object {
        public static final int CONSTRUCTOR = 36048610;
        public String description;
        public ChatFilter filter;

        public RecommendedChatFilter() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RecommendedChatFilter(ChatFilter chatFilter, String str) {
            this.filter = chatFilter;
            this.description = str;
        }
    }

    public static class RecommendedChatFilters extends Object {
        public static final int CONSTRUCTOR = -263416880;
        public RecommendedChatFilter[] chatFilters;

        public RecommendedChatFilters() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RecommendedChatFilters(RecommendedChatFilter[] recommendedChatFilterArr) {
            this.chatFilters = recommendedChatFilterArr;
        }
    }

    public static class RecoverAuthenticationPassword extends Function {
        public static final int CONSTRUCTOR = -131001053;
        public String newHint;
        public String newPassword;
        public String recoveryCode;

        public RecoverAuthenticationPassword() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RecoverAuthenticationPassword(String str, String str2, String str3) {
            this.recoveryCode = str;
            this.newPassword = str2;
            this.newHint = str3;
        }
    }

    public static class RecoverPassword extends Function {
        public static final int CONSTRUCTOR = -1524262541;
        public String newHint;
        public String newPassword;
        public String recoveryCode;

        public RecoverPassword() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RecoverPassword(String str, String str2, String str3) {
            this.recoveryCode = str;
            this.newPassword = str2;
            this.newHint = str3;
        }
    }

    public static class RecoveryEmailAddress extends Object {
        public static final int CONSTRUCTOR = 1290526187;
        public String recoveryEmailAddress;

        public RecoveryEmailAddress() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RecoveryEmailAddress(String str) {
            this.recoveryEmailAddress = str;
        }
    }

    public static class RegisterDevice extends Function {
        public static final int CONSTRUCTOR = 366088823;
        public DeviceToken deviceToken;
        public long[] otherUserIds;

        public RegisterDevice() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RegisterDevice(DeviceToken deviceToken, long[] jArr) {
            this.deviceToken = deviceToken;
            this.otherUserIds = jArr;
        }
    }

    public static class RegisterUser extends Function {
        public static final int CONSTRUCTOR = -109994467;
        public String firstName;
        public String lastName;

        public RegisterUser() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RegisterUser(String str, String str2) {
            this.firstName = str;
            this.lastName = str2;
        }
    }

    public static class RemoteFile extends Object {
        public static final int CONSTRUCTOR = -1822143022;
        public String f25417id;
        public boolean isUploadingActive;
        public boolean isUploadingCompleted;
        public String uniqueId;
        public int uploadedSize;

        public RemoteFile() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RemoteFile(String str, String str2, boolean z, boolean z2, int i) {
            this.f25417id = str;
            this.uniqueId = str2;
            this.isUploadingActive = z;
            this.isUploadingCompleted = z2;
            this.uploadedSize = i;
        }
    }

    public static class RemoveAllFilesFromDownloads extends Function {
        public static final int CONSTRUCTOR = -1186433402;
        public boolean deleteFromCache;
        public boolean onlyActive;
        public boolean onlyCompleted;

        public RemoveAllFilesFromDownloads() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RemoveAllFilesFromDownloads(boolean z, boolean z2, boolean z3) {
            this.onlyActive = z;
            this.onlyCompleted = z2;
            this.deleteFromCache = z3;
        }
    }

    public static class RemoveBackground extends Function {
        public static final int CONSTRUCTOR = -1484545642;
        public long backgroundId;

        public RemoveBackground() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RemoveBackground(long j) {
            this.backgroundId = j;
        }
    }

    public static class RemoveChatActionBar extends Function {
        public static final int CONSTRUCTOR = -1650968070;
        public long chatId;

        public RemoveChatActionBar() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RemoveChatActionBar(long j) {
            this.chatId = j;
        }
    }

    public static class RemoveContacts extends Function {
        public static final int CONSTRUCTOR = 1943858054;
        public long[] userIds;

        public RemoveContacts() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RemoveContacts(long[] jArr) {
            this.userIds = jArr;
        }
    }

    public static class RemoveFavoriteSticker extends Function {
        public static final int CONSTRUCTOR = 1152945264;
        public InputFile sticker;

        public RemoveFavoriteSticker() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RemoveFavoriteSticker(InputFile inputFile) {
            this.sticker = inputFile;
        }
    }

    public static class RemoveFileFromDownloads extends Function {
        public static final int CONSTRUCTOR = 1460060142;
        public boolean deleteFromCache;
        public int fileId;

        public RemoveFileFromDownloads() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RemoveFileFromDownloads(int i, boolean z) {
            this.fileId = i;
            this.deleteFromCache = z;
        }
    }

    public static class RemoveNotification extends Function {
        public static final int CONSTRUCTOR = 862630734;
        public int notificationGroupId;
        public int notificationId;

        public RemoveNotification() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RemoveNotification(int i, int i2) {
            this.notificationGroupId = i;
            this.notificationId = i2;
        }
    }

    public static class RemoveNotificationGroup extends Function {
        public static final int CONSTRUCTOR = 1713005454;
        public int maxNotificationId;
        public int notificationGroupId;

        public RemoveNotificationGroup() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RemoveNotificationGroup(int i, int i2) {
            this.notificationGroupId = i;
            this.maxNotificationId = i2;
        }
    }

    public static class RemoveProxy extends Function {
        public static final int CONSTRUCTOR = 1369219847;
        public int proxyId;

        public RemoveProxy() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RemoveProxy(int i) {
            this.proxyId = i;
        }
    }

    public static class RemoveRecentHashtag extends Function {
        public static final int CONSTRUCTOR = -1013735260;
        public String hashtag;

        public RemoveRecentHashtag() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RemoveRecentHashtag(String str) {
            this.hashtag = str;
        }
    }

    public static class RemoveRecentSticker extends Function {
        public static final int CONSTRUCTOR = 1246577677;
        public boolean isAttached;
        public InputFile sticker;

        public RemoveRecentSticker() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RemoveRecentSticker(boolean z, InputFile inputFile) {
            this.isAttached = z;
            this.sticker = inputFile;
        }
    }

    public static class RemoveRecentlyFoundChat extends Function {
        public static final int CONSTRUCTOR = 717340444;
        public long chatId;

        public RemoveRecentlyFoundChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RemoveRecentlyFoundChat(long j) {
            this.chatId = j;
        }
    }

    public static class RemoveSavedAnimation extends Function {
        public static final int CONSTRUCTOR = -495605479;
        public InputFile animation;

        public RemoveSavedAnimation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RemoveSavedAnimation(InputFile inputFile) {
            this.animation = inputFile;
        }
    }

    public static class RemoveStickerFromSet extends Function {
        public static final int CONSTRUCTOR = 1642196644;
        public InputFile sticker;

        public RemoveStickerFromSet() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RemoveStickerFromSet(InputFile inputFile) {
            this.sticker = inputFile;
        }
    }

    public static class RemoveTopChat extends Function {
        public static final int CONSTRUCTOR = -1907876267;
        public TopChatCategory category;
        public long chatId;

        public RemoveTopChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RemoveTopChat(TopChatCategory topChatCategory, long j) {
            this.category = topChatCategory;
            this.chatId = j;
        }
    }

    public static class ReorderChatFilters extends Function {
        public static final int CONSTRUCTOR = -1258111097;
        public int[] chatFilterIds;

        public ReorderChatFilters() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ReorderChatFilters(int[] iArr) {
            this.chatFilterIds = iArr;
        }
    }

    public static class ReorderInstalledStickerSets extends Function {
        public static final int CONSTRUCTOR = 1114537563;
        public boolean isMasks;
        public long[] stickerSetIds;

        public ReorderInstalledStickerSets() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ReorderInstalledStickerSets(boolean z, long[] jArr) {
            this.isMasks = z;
            this.stickerSetIds = jArr;
        }
    }

    public static class ReplacePrimaryChatInviteLink extends Function {
        public static final int CONSTRUCTOR = 1067350941;
        public long chatId;

        public ReplacePrimaryChatInviteLink() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ReplacePrimaryChatInviteLink(long j) {
            this.chatId = j;
        }
    }

    public static class ReplaceVideoChatRtmpUrl extends Function {
        public static final int CONSTRUCTOR = 558862304;
        public long chatId;

        public ReplaceVideoChatRtmpUrl() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ReplaceVideoChatRtmpUrl(long j) {
            this.chatId = j;
        }
    }

    public static abstract class ReplyMarkup extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class ReplyMarkupForceReply extends ReplyMarkup {
        public static final int CONSTRUCTOR = 1101461919;
        public String inputFieldPlaceholder;
        public boolean isPersonal;

        public ReplyMarkupForceReply() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ReplyMarkupForceReply(boolean z, String str) {
            this.isPersonal = z;
            this.inputFieldPlaceholder = str;
        }
    }

    public static class ReplyMarkupInlineKeyboard extends ReplyMarkup {
        public static final int CONSTRUCTOR = -619317658;
        public InlineKeyboardButton[][] rows;

        public ReplyMarkupInlineKeyboard() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ReplyMarkupInlineKeyboard(InlineKeyboardButton[][] inlineKeyboardButtonArr) {
            this.rows = inlineKeyboardButtonArr;
        }
    }

    public static class ReplyMarkupRemoveKeyboard extends ReplyMarkup {
        public static final int CONSTRUCTOR = -691252879;
        public boolean isPersonal;

        public ReplyMarkupRemoveKeyboard() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ReplyMarkupRemoveKeyboard(boolean z) {
            this.isPersonal = z;
        }
    }

    public static class ReplyMarkupShowKeyboard extends ReplyMarkup {
        public static final int CONSTRUCTOR = -64985802;
        public String inputFieldPlaceholder;
        public boolean isPersonal;
        public boolean oneTime;
        public boolean resizeKeyboard;
        public KeyboardButton[][] rows;

        public ReplyMarkupShowKeyboard() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ReplyMarkupShowKeyboard(KeyboardButton[][] keyboardButtonArr, boolean z, boolean z2, boolean z3, String str) {
            this.rows = keyboardButtonArr;
            this.resizeKeyboard = z;
            this.oneTime = z2;
            this.isPersonal = z3;
            this.inputFieldPlaceholder = str;
        }
    }

    public static class ReportChat extends Function {
        public static final int CONSTRUCTOR = -964543587;
        public long chatId;
        public long[] messageIds;
        public ChatReportReason reason;
        public String text;

        public ReportChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ReportChat(long j, long[] jArr, ChatReportReason chatReportReason, String str) {
            this.chatId = j;
            this.messageIds = jArr;
            this.reason = chatReportReason;
            this.text = str;
        }
    }

    public static class ReportChatPhoto extends Function {
        public static final int CONSTRUCTOR = 734652708;
        public long chatId;
        public int fileId;
        public ChatReportReason reason;
        public String text;

        public ReportChatPhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ReportChatPhoto(long j, int i, ChatReportReason chatReportReason, String str) {
            this.chatId = j;
            this.fileId = i;
            this.reason = chatReportReason;
            this.text = str;
        }
    }

    public static class ReportSupergroupSpam extends Function {
        public static final int CONSTRUCTOR = -94825000;
        public long[] messageIds;
        public long supergroupId;

        public ReportSupergroupSpam() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ReportSupergroupSpam(long j, long[] jArr) {
            this.supergroupId = j;
            this.messageIds = jArr;
        }
    }

    public static class RequestAuthenticationPasswordRecovery extends Function {
        public static final int CONSTRUCTOR = 1393896118;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RequestPasswordRecovery extends Function {
        public static final int CONSTRUCTOR = -13777582;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RequestQrCodeAuthentication extends Function {
        public static final int CONSTRUCTOR = 1363496527;
        public long[] otherUserIds;

        public RequestQrCodeAuthentication() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RequestQrCodeAuthentication(long[] jArr) {
            this.otherUserIds = jArr;
        }
    }

    public static class ResendAuthenticationCode extends Function {
        public static final int CONSTRUCTOR = -814377191;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ResendChangePhoneNumberCode extends Function {
        public static final int CONSTRUCTOR = -786772060;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ResendEmailAddressVerificationCode extends Function {
        public static final int CONSTRUCTOR = -1872416732;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ResendMessages extends Function {
        public static final int CONSTRUCTOR = -940655817;
        public long chatId;
        public long[] messageIds;

        public ResendMessages() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ResendMessages(long j, long[] jArr) {
            this.chatId = j;
            this.messageIds = jArr;
        }
    }

    public static class ResendPhoneNumberConfirmationCode extends Function {
        public static final int CONSTRUCTOR = 2069068522;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ResendPhoneNumberVerificationCode extends Function {
        public static final int CONSTRUCTOR = 1367629820;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ResendRecoveryEmailAddressCode extends Function {
        public static final int CONSTRUCTOR = 433483548;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ResetAllNotificationSettings extends Function {
        public static final int CONSTRUCTOR = -174020359;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ResetBackgrounds extends Function {
        public static final int CONSTRUCTOR = 204852088;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ResetNetworkStatistics extends Function {
        public static final int CONSTRUCTOR = 1646452102;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ResetPassword extends Function {
        public static final int CONSTRUCTOR = -593589091;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static abstract class ResetPasswordResult extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class ResetPasswordResultDeclined extends ResetPasswordResult {
        public static final int CONSTRUCTOR = -1202200373;
        public int retryDate;

        public ResetPasswordResultDeclined() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ResetPasswordResultDeclined(int i) {
            this.retryDate = i;
        }
    }

    public static class ResetPasswordResultOk extends ResetPasswordResult {
        public static final int CONSTRUCTOR = -1397267463;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ResetPasswordResultPending extends ResetPasswordResult {
        public static final int CONSTRUCTOR = 1193925721;
        public int pendingResetDate;

        public ResetPasswordResultPending() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ResetPasswordResultPending(int i) {
            this.pendingResetDate = i;
        }
    }

    public static class RevokeChatInviteLink extends Function {
        public static final int CONSTRUCTOR = -776514135;
        public long chatId;
        public String inviteLink;

        public RevokeChatInviteLink() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RevokeChatInviteLink(long j, String str) {
            this.chatId = j;
            this.inviteLink = str;
        }
    }

    public static class RevokeGroupCallInviteLink extends Function {
        public static final int CONSTRUCTOR = 501589140;
        public int groupCallId;

        public RevokeGroupCallInviteLink() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RevokeGroupCallInviteLink(int i) {
            this.groupCallId = i;
        }
    }

    public static abstract class RichText extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class RichTextAnchor extends RichText {
        public static final int CONSTRUCTOR = 1316950068;
        public String name;

        public RichTextAnchor() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RichTextAnchor(String str) {
            this.name = str;
        }
    }

    public static class RichTextAnchorLink extends RichText {
        public static final int CONSTRUCTOR = -1541418282;
        public String anchorName;
        public RichText text;
        public String url;

        public RichTextAnchorLink() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RichTextAnchorLink(RichText richText, String str, String str2) {
            this.text = richText;
            this.anchorName = str;
            this.url = str2;
        }
    }

    public static class RichTextBold extends RichText {
        public static final int CONSTRUCTOR = 1670844268;
        public RichText text;

        public RichTextBold() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RichTextBold(RichText richText) {
            this.text = richText;
        }
    }

    public static class RichTextEmailAddress extends RichText {
        public static final int CONSTRUCTOR = 40018679;
        public String emailAddress;
        public RichText text;

        public RichTextEmailAddress() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RichTextEmailAddress(RichText richText, String str) {
            this.text = richText;
            this.emailAddress = str;
        }
    }

    public static class RichTextFixed extends RichText {
        public static final int CONSTRUCTOR = -1271496249;
        public RichText text;

        public RichTextFixed() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RichTextFixed(RichText richText) {
            this.text = richText;
        }
    }

    public static class RichTextIcon extends RichText {
        public static final int CONSTRUCTOR = -1480316158;
        public Document document;
        public int height;
        public int width;

        public RichTextIcon() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RichTextIcon(Document document, int i, int i2) {
            this.document = document;
            this.width = i;
            this.height = i2;
        }
    }

    public static class RichTextItalic extends RichText {
        public static final int CONSTRUCTOR = 1853354047;
        public RichText text;

        public RichTextItalic() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RichTextItalic(RichText richText) {
            this.text = richText;
        }
    }

    public static class RichTextMarked extends RichText {
        public static final int CONSTRUCTOR = -1271999614;
        public RichText text;

        public RichTextMarked() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RichTextMarked(RichText richText) {
            this.text = richText;
        }
    }

    public static class RichTextPhoneNumber extends RichText {
        public static final int CONSTRUCTOR = 128521539;
        public String phoneNumber;
        public RichText text;

        public RichTextPhoneNumber() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RichTextPhoneNumber(RichText richText, String str) {
            this.text = richText;
            this.phoneNumber = str;
        }
    }

    public static class RichTextPlain extends RichText {
        public static final int CONSTRUCTOR = 482617702;
        public String text;

        public RichTextPlain() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RichTextPlain(String str) {
            this.text = str;
        }
    }

    public static class RichTextReference extends RichText {
        public static final int CONSTRUCTOR = -1147530634;
        public String anchorName;
        public RichText text;
        public String url;

        public RichTextReference() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RichTextReference(RichText richText, String str, String str2) {
            this.text = richText;
            this.anchorName = str;
            this.url = str2;
        }
    }

    public static class RichTextStrikethrough extends RichText {
        public static final int CONSTRUCTOR = 723413585;
        public RichText text;

        public RichTextStrikethrough() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RichTextStrikethrough(RichText richText) {
            this.text = richText;
        }
    }

    public static class RichTextSubscript extends RichText {
        public static final int CONSTRUCTOR = -868197812;
        public RichText text;

        public RichTextSubscript() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RichTextSubscript(RichText richText) {
            this.text = richText;
        }
    }

    public static class RichTextSuperscript extends RichText {
        public static final int CONSTRUCTOR = -382241437;
        public RichText text;

        public RichTextSuperscript() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RichTextSuperscript(RichText richText) {
            this.text = richText;
        }
    }

    public static class RichTextUnderline extends RichText {
        public static final int CONSTRUCTOR = -536019572;
        public RichText text;

        public RichTextUnderline() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RichTextUnderline(RichText richText) {
            this.text = richText;
        }
    }

    public static class RichTextUrl extends RichText {
        public static final int CONSTRUCTOR = 83939092;
        public boolean isCached;
        public RichText text;
        public String url;

        public RichTextUrl() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RichTextUrl(RichText richText, String str, boolean z) {
            this.text = richText;
            this.url = str;
            this.isCached = z;
        }
    }

    public static class RichTexts extends RichText {
        public static final int CONSTRUCTOR = 1647457821;
        public RichText[] texts;

        public RichTexts() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RichTexts(RichText[] richTextArr) {
            this.texts = richTextArr;
        }
    }

    public static class RtmpUrl extends Object {
        public static final int CONSTRUCTOR = 1009302613;
        public String streamKey;
        public String url;

        public RtmpUrl() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public RtmpUrl(String str, String str2) {
            this.url = str;
            this.streamKey = str2;
        }
    }

    public static class SaveApplicationLogEvent extends Function {
        public static final int CONSTRUCTOR = -811154930;
        public long chatId;
        public JsonValue data;
        public String type;

        public SaveApplicationLogEvent() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SaveApplicationLogEvent(String str, long j, JsonValue jsonValue) {
            this.type = str;
            this.chatId = j;
            this.data = jsonValue;
        }
    }

    public static class SavedCredentials extends Object {
        public static final int CONSTRUCTOR = -370273060;
        public String f25418id;
        public String title;

        public SavedCredentials() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SavedCredentials(String str, String str2) {
            this.f25418id = str;
            this.title = str2;
        }
    }

    public static class ScopeNotificationSettings extends Object {
        public static final int CONSTRUCTOR = -426103745;
        public boolean disableMentionNotifications;
        public boolean disablePinnedMessageNotifications;
        public int muteFor;
        public boolean showPreview;
        public String sound;

        public ScopeNotificationSettings() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ScopeNotificationSettings(int i, String str, boolean z, boolean z2, boolean z3) {
            this.muteFor = i;
            this.sound = str;
            this.showPreview = z;
            this.disablePinnedMessageNotifications = z2;
            this.disableMentionNotifications = z3;
        }
    }

    public static class SearchBackground extends Function {
        public static final int CONSTRUCTOR = -2130996959;
        public String name;

        public SearchBackground() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SearchBackground(String str) {
            this.name = str;
        }
    }

    public static class SearchCallMessages extends Function {
        public static final int CONSTRUCTOR = -1077230820;
        public long fromMessageId;
        public int limit;
        public boolean onlyMissed;

        public SearchCallMessages() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SearchCallMessages(long j, int i, boolean z) {
            this.fromMessageId = j;
            this.limit = i;
            this.onlyMissed = z;
        }
    }

    public static class SearchChatMembers extends Function {
        public static final int CONSTRUCTOR = -445823291;
        public long chatId;
        public ChatMembersFilter filter;
        public int limit;
        public String query;

        public SearchChatMembers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SearchChatMembers(long j, String str, int i, ChatMembersFilter chatMembersFilter) {
            this.chatId = j;
            this.query = str;
            this.limit = i;
            this.filter = chatMembersFilter;
        }
    }

    public static class SearchChatMessages extends Function {
        public static final int CONSTRUCTOR = -162154976;
        public long chatId;
        public SearchMessagesFilter filter;
        public long fromMessageId;
        public int limit;
        public long messageThreadId;
        public int offset;
        public String query;
        public MessageSender senderId;

        public SearchChatMessages() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SearchChatMessages(long j, String str, MessageSender messageSender, long j2, int i, int i2, SearchMessagesFilter searchMessagesFilter, long j3) {
            this.chatId = j;
            this.query = str;
            this.senderId = messageSender;
            this.fromMessageId = j2;
            this.offset = i;
            this.limit = i2;
            this.filter = searchMessagesFilter;
            this.messageThreadId = j3;
        }
    }

    public static class SearchChatRecentLocationMessages extends Function {
        public static final int CONSTRUCTOR = 950238950;
        public long chatId;
        public int limit;

        public SearchChatRecentLocationMessages() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SearchChatRecentLocationMessages(long j, int i) {
            this.chatId = j;
            this.limit = i;
        }
    }

    public static class SearchChats extends Function {
        public static final int CONSTRUCTOR = -1879787060;
        public int limit;
        public String query;

        public SearchChats() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SearchChats(String str, int i) {
            this.query = str;
            this.limit = i;
        }
    }

    public static class SearchChatsNearby extends Function {
        public static final int CONSTRUCTOR = -196753377;
        public Location location;

        public SearchChatsNearby() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SearchChatsNearby(Location location) {
            this.location = location;
        }
    }

    public static class SearchChatsOnServer extends Function {
        public static final int CONSTRUCTOR = -1158402188;
        public int limit;
        public String query;

        public SearchChatsOnServer() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SearchChatsOnServer(String str, int i) {
            this.query = str;
            this.limit = i;
        }
    }

    public static class SearchContacts extends Function {
        public static final int CONSTRUCTOR = -1794690715;
        public int limit;
        public String query;

        public SearchContacts() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SearchContacts(String str, int i) {
            this.query = str;
            this.limit = i;
        }
    }

    public static class SearchEmojis extends Function {
        public static final int CONSTRUCTOR = 398837927;
        public boolean exactMatch;
        public String[] inputLanguageCodes;
        public String text;

        public SearchEmojis() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SearchEmojis(String str, boolean z, String[] strArr) {
            this.text = str;
            this.exactMatch = z;
            this.inputLanguageCodes = strArr;
        }
    }

    public static class SearchFileDownloads extends Function {
        public static final int CONSTRUCTOR = 706611286;
        public int limit;
        public String offset;
        public boolean onlyActive;
        public boolean onlyCompleted;
        public String query;

        public SearchFileDownloads() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SearchFileDownloads(String str, boolean z, boolean z2, String str2, int i) {
            this.query = str;
            this.onlyActive = z;
            this.onlyCompleted = z2;
            this.offset = str2;
            this.limit = i;
        }
    }

    public static class SearchHashtags extends Function {
        public static final int CONSTRUCTOR = 1043637617;
        public int limit;
        public String prefix;

        public SearchHashtags() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SearchHashtags(String str, int i) {
            this.prefix = str;
            this.limit = i;
        }
    }

    public static class SearchInstalledStickerSets extends Function {
        public static final int CONSTRUCTOR = 681171344;
        public boolean isMasks;
        public int limit;
        public String query;

        public SearchInstalledStickerSets() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SearchInstalledStickerSets(boolean z, String str, int i) {
            this.isMasks = z;
            this.query = str;
            this.limit = i;
        }
    }

    public static class SearchMessages extends Function {
        public static final int CONSTRUCTOR = -225214062;
        public ChatList chatList;
        public SearchMessagesFilter filter;
        public int limit;
        public int maxDate;
        public int minDate;
        public long offsetChatId;
        public int offsetDate;
        public long offsetMessageId;
        public String query;

        public SearchMessages() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SearchMessages(ChatList chatList, String str, int i, long j, long j2, int i2, SearchMessagesFilter searchMessagesFilter, int i3, int i4) {
            this.chatList = chatList;
            this.query = str;
            this.offsetDate = i;
            this.offsetChatId = j;
            this.offsetMessageId = j2;
            this.limit = i2;
            this.filter = searchMessagesFilter;
            this.minDate = i3;
            this.maxDate = i4;
        }
    }

    public static abstract class SearchMessagesFilter extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class SearchMessagesFilterAnimation extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = -155713339;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterAudio extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = 867505275;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterChatPhoto extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = -1247751329;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterDocument extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = 1526331215;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterEmpty extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = -869395657;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterFailedToSend extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = -596322564;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterMention extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = 2001258652;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterPhoto extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = 925932293;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterPhotoAndVideo extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = 1352130963;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterPinned extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = 371805512;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterUnreadMention extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = -95769149;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterUnreadReaction extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = -1379651328;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterUrl extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = -1828724341;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterVideo extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = 115538222;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterVideoNote extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = 564323321;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterVoiceAndVideoNote extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = 664174819;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterVoiceNote extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = 1841439357;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchOutgoingDocumentMessages extends Function {
        public static final int CONSTRUCTOR = -1071397762;
        public int limit;
        public String query;

        public SearchOutgoingDocumentMessages() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SearchOutgoingDocumentMessages(String str, int i) {
            this.query = str;
            this.limit = i;
        }
    }

    public static class SearchPublicChat extends Function {
        public static final int CONSTRUCTOR = 857135533;
        public String username;

        public SearchPublicChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SearchPublicChat(String str) {
            this.username = str;
        }
    }

    public static class SearchPublicChats extends Function {
        public static final int CONSTRUCTOR = 970385337;
        public String query;

        public SearchPublicChats() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SearchPublicChats(String str) {
            this.query = str;
        }
    }

    public static class SearchSecretMessages extends Function {
        public static final int CONSTRUCTOR = -852865892;
        public long chatId;
        public SearchMessagesFilter filter;
        public int limit;
        public String offset;
        public String query;

        public SearchSecretMessages() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SearchSecretMessages(long j, String str, String str2, int i, SearchMessagesFilter searchMessagesFilter) {
            this.chatId = j;
            this.query = str;
            this.offset = str2;
            this.limit = i;
            this.filter = searchMessagesFilter;
        }
    }

    public static class SearchStickerSet extends Function {
        public static final int CONSTRUCTOR = 1157930222;
        public String name;

        public SearchStickerSet() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SearchStickerSet(String str) {
            this.name = str;
        }
    }

    public static class SearchStickerSets extends Function {
        public static final int CONSTRUCTOR = -1082314629;
        public String query;

        public SearchStickerSets() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SearchStickerSets(String str) {
            this.query = str;
        }
    }

    public static class SearchStickers extends Function {
        public static final int CONSTRUCTOR = 1555771203;
        public String emoji;
        public int limit;

        public SearchStickers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SearchStickers(String str, int i) {
            this.emoji = str;
            this.limit = i;
        }
    }

    public static class SearchUserByPhoneNumber extends Function {
        public static final int CONSTRUCTOR = -1562236142;
        public String phoneNumber;

        public SearchUserByPhoneNumber() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SearchUserByPhoneNumber(String str) {
            this.phoneNumber = str;
        }
    }

    public static class Seconds extends Object {
        public static final int CONSTRUCTOR = 959899022;
        public double seconds;

        public Seconds() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Seconds(double d) {
            this.seconds = d;
        }
    }

    public static class SecretChat extends Object {
        public static final int CONSTRUCTOR = -676918325;
        public int f25419id;
        public boolean isOutbound;
        public byte[] keyHash;
        public int layer;
        public SecretChatState state;
        public long userId;

        public SecretChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SecretChat(int i, long j, SecretChatState secretChatState, boolean z, byte[] bArr, int i2) {
            this.f25419id = i;
            this.userId = j;
            this.state = secretChatState;
            this.isOutbound = z;
            this.keyHash = bArr;
            this.layer = i2;
        }
    }

    public static abstract class SecretChatState extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class SecretChatStateClosed extends SecretChatState {
        public static final int CONSTRUCTOR = -1945106707;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SecretChatStatePending extends SecretChatState {
        public static final int CONSTRUCTOR = -1637050756;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SecretChatStateReady extends SecretChatState {
        public static final int CONSTRUCTOR = -1611352087;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SendBotStartMessage extends Function {
        public static final int CONSTRUCTOR = -1435877650;
        public long botUserId;
        public long chatId;
        public String parameter;

        public SendBotStartMessage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SendBotStartMessage(long j, long j2, String str) {
            this.botUserId = j;
            this.chatId = j2;
            this.parameter = str;
        }
    }

    public static class SendCallDebugInformation extends Function {
        public static final int CONSTRUCTOR = 2019243839;
        public int callId;
        public String debugInformation;

        public SendCallDebugInformation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SendCallDebugInformation(int i, String str) {
            this.callId = i;
            this.debugInformation = str;
        }
    }

    public static class SendCallRating extends Function {
        public static final int CONSTRUCTOR = -1402719502;
        public int callId;
        public String comment;
        public CallProblem[] problems;
        public int rating;

        public SendCallRating() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SendCallRating(int i, int i2, String str, CallProblem[] callProblemArr) {
            this.callId = i;
            this.rating = i2;
            this.comment = str;
            this.problems = callProblemArr;
        }
    }

    public static class SendCallSignalingData extends Function {
        public static final int CONSTRUCTOR = 1412280732;
        public int callId;
        public byte[] data;

        public SendCallSignalingData() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SendCallSignalingData(int i, byte[] bArr) {
            this.callId = i;
            this.data = bArr;
        }
    }

    public static class SendChatAction extends Function {
        public static final int CONSTRUCTOR = 2096947540;
        public ChatAction action;
        public long chatId;
        public long messageThreadId;

        public SendChatAction() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SendChatAction(long j, long j2, ChatAction chatAction) {
            this.chatId = j;
            this.messageThreadId = j2;
            this.action = chatAction;
        }
    }

    public static class SendChatScreenshotTakenNotification extends Function {
        public static final int CONSTRUCTOR = 448399457;
        public long chatId;

        public SendChatScreenshotTakenNotification() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SendChatScreenshotTakenNotification(long j) {
            this.chatId = j;
        }
    }

    public static class SendCustomRequest extends Function {
        public static final int CONSTRUCTOR = 285045153;
        public String method;
        public String parameters;

        public SendCustomRequest() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SendCustomRequest(String str, String str2) {
            this.method = str;
            this.parameters = str2;
        }
    }

    public static class SendEmailAddressVerificationCode extends Function {
        public static final int CONSTRUCTOR = -221621379;
        public String emailAddress;

        public SendEmailAddressVerificationCode() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SendEmailAddressVerificationCode(String str) {
            this.emailAddress = str;
        }
    }

    public static class SendInlineQueryResultMessage extends Function {
        public static final int CONSTRUCTOR = -948639588;
        public long chatId;
        public boolean hideViaBot;
        public long messageThreadId;
        public MessageSendOptions options;
        public long queryId;
        public long replyToMessageId;
        public String resultId;

        public SendInlineQueryResultMessage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SendInlineQueryResultMessage(long j, long j2, long j3, MessageSendOptions messageSendOptions, long j4, String str, boolean z) {
            this.chatId = j;
            this.messageThreadId = j2;
            this.replyToMessageId = j3;
            this.options = messageSendOptions;
            this.queryId = j4;
            this.resultId = str;
            this.hideViaBot = z;
        }
    }

    public static class SendMessage extends Function {
        public static final int CONSTRUCTOR = 960453021;
        public long chatId;
        public InputMessageContent inputMessageContent;
        public long messageThreadId;
        public MessageSendOptions options;
        public ReplyMarkup replyMarkup;
        public long replyToMessageId;

        public SendMessage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SendMessage(long j, long j2, long j3, MessageSendOptions messageSendOptions, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.chatId = j;
            this.messageThreadId = j2;
            this.replyToMessageId = j3;
            this.options = messageSendOptions;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }
    }

    public static class SendMessageAlbum extends Function {
        public static final int CONSTRUCTOR = -1639797862;
        public long chatId;
        public InputMessageContent[] inputMessageContents;
        public long messageThreadId;
        public boolean onlyPreview;
        public MessageSendOptions options;
        public long replyToMessageId;

        public SendMessageAlbum() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SendMessageAlbum(long j, long j2, long j3, MessageSendOptions messageSendOptions, InputMessageContent[] inputMessageContentArr, boolean z) {
            this.chatId = j;
            this.messageThreadId = j2;
            this.replyToMessageId = j3;
            this.options = messageSendOptions;
            this.inputMessageContents = inputMessageContentArr;
            this.onlyPreview = z;
        }
    }

    public static class SendPassportAuthorizationForm extends Function {
        public static final int CONSTRUCTOR = -602402218;
        public int autorizationFormId;
        public PassportElementType[] types;

        public SendPassportAuthorizationForm() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SendPassportAuthorizationForm(int i, PassportElementType[] passportElementTypeArr) {
            this.autorizationFormId = i;
            this.types = passportElementTypeArr;
        }
    }

    public static class SendPaymentForm extends Function {
        public static final int CONSTRUCTOR = 1536242687;
        public long chatId;
        public InputCredentials credentials;
        public long messageId;
        public String orderInfoId;
        public long paymentFormId;
        public String shippingOptionId;
        public long tipAmount;

        public SendPaymentForm() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SendPaymentForm(long j, long j2, long j3, String str, String str2, InputCredentials inputCredentials, long j4) {
            this.chatId = j;
            this.messageId = j2;
            this.paymentFormId = j3;
            this.orderInfoId = str;
            this.shippingOptionId = str2;
            this.credentials = inputCredentials;
            this.tipAmount = j4;
        }
    }

    public static class SendPhoneNumberConfirmationCode extends Function {
        public static final int CONSTRUCTOR = -1901171495;
        public String hash;
        public String phoneNumber;
        public PhoneNumberAuthenticationSettings settings;

        public SendPhoneNumberConfirmationCode() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SendPhoneNumberConfirmationCode(String str, String str2, PhoneNumberAuthenticationSettings phoneNumberAuthenticationSettings) {
            this.hash = str;
            this.phoneNumber = str2;
            this.settings = phoneNumberAuthenticationSettings;
        }
    }

    public static class SendPhoneNumberVerificationCode extends Function {
        public static final int CONSTRUCTOR = 2081689035;
        public String phoneNumber;
        public PhoneNumberAuthenticationSettings settings;

        public SendPhoneNumberVerificationCode() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SendPhoneNumberVerificationCode(String str, PhoneNumberAuthenticationSettings phoneNumberAuthenticationSettings) {
            this.phoneNumber = str;
            this.settings = phoneNumberAuthenticationSettings;
        }
    }

    public static class Session extends Object {
        public static final int CONSTRUCTOR = 1068672887;
        public int apiId;
        public String applicationName;
        public String applicationVersion;
        public boolean canAcceptCalls;
        public boolean canAcceptSecretChats;
        public String country;
        public String deviceModel;
        public long f25420id;
        public String f25421ip;
        public boolean isCurrent;
        public boolean isOfficialApplication;
        public boolean isPasswordPending;
        public int lastActiveDate;
        public int logInDate;
        public String platform;
        public String region;
        public String systemVersion;

        public Session() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Session(long j, boolean z, boolean z2, boolean z3, boolean z4, int i, String str, String str2, boolean z5, String str3, String str4, String str5, int i2, int i3, String str6, String str7, String str8) {
            this.f25420id = j;
            this.isCurrent = z;
            this.isPasswordPending = z2;
            this.canAcceptSecretChats = z3;
            this.canAcceptCalls = z4;
            this.apiId = i;
            this.applicationName = str;
            this.applicationVersion = str2;
            this.isOfficialApplication = z5;
            this.deviceModel = str3;
            this.platform = str4;
            this.systemVersion = str5;
            this.logInDate = i2;
            this.lastActiveDate = i3;
            this.f25421ip = str6;
            this.country = str7;
            this.region = str8;
        }
    }

    public static class Sessions extends Object {
        public static final int CONSTRUCTOR = 842912274;
        public int inactiveSessionTtlDays;
        public Session[] sessions;

        public Sessions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Sessions(Session[] sessionArr, int i) {
            this.sessions = sessionArr;
            this.inactiveSessionTtlDays = i;
        }
    }

    public static class SetAccountTtl extends Function {
        public static final int CONSTRUCTOR = 701389032;
        public AccountTtl ttl;

        public SetAccountTtl() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetAccountTtl(AccountTtl accountTtl) {
            this.ttl = accountTtl;
        }
    }

    public static class SetAlarm extends Function {
        public static final int CONSTRUCTOR = -873497067;
        public double seconds;

        public SetAlarm() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetAlarm(double d) {
            this.seconds = d;
        }
    }

    public static class SetAuthenticationPhoneNumber extends Function {
        public static final int CONSTRUCTOR = 868276259;
        public String phoneNumber;
        public PhoneNumberAuthenticationSettings settings;

        public SetAuthenticationPhoneNumber() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetAuthenticationPhoneNumber(String str, PhoneNumberAuthenticationSettings phoneNumberAuthenticationSettings) {
            this.phoneNumber = str;
            this.settings = phoneNumberAuthenticationSettings;
        }
    }

    public static class SetAutoDownloadSettings extends Function {
        public static final int CONSTRUCTOR = -353671948;
        public AutoDownloadSettings settings;
        public NetworkType type;

        public SetAutoDownloadSettings() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetAutoDownloadSettings(AutoDownloadSettings autoDownloadSettings, NetworkType networkType) {
            this.settings = autoDownloadSettings;
            this.type = networkType;
        }
    }

    public static class SetBackground extends Function {
        public static final int CONSTRUCTOR = -1035439225;
        public InputBackground background;
        public boolean forDarkTheme;
        public BackgroundType type;

        public SetBackground() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetBackground(InputBackground inputBackground, BackgroundType backgroundType, boolean z) {
            this.background = inputBackground;
            this.type = backgroundType;
            this.forDarkTheme = z;
        }
    }

    public static class SetBio extends Function {
        public static final int CONSTRUCTOR = -1619582124;
        public String bio;

        public SetBio() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetBio(String str) {
            this.bio = str;
        }
    }

    public static class SetBotUpdatesStatus extends Function {
        public static final int CONSTRUCTOR = -1154926191;
        public String errorMessage;
        public int pendingUpdateCount;

        public SetBotUpdatesStatus() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetBotUpdatesStatus(int i, String str) {
            this.pendingUpdateCount = i;
            this.errorMessage = str;
        }
    }

    public static class SetChatAvailableReactions extends Function {
        public static final int CONSTRUCTOR = 1497463414;
        public String[] availableReactions;
        public long chatId;

        public SetChatAvailableReactions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetChatAvailableReactions(long j, String[] strArr) {
            this.chatId = j;
            this.availableReactions = strArr;
        }
    }

    public static class SetChatClientData extends Function {
        public static final int CONSTRUCTOR = -827119811;
        public long chatId;
        public String clientData;

        public SetChatClientData() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetChatClientData(long j, String str) {
            this.chatId = j;
            this.clientData = str;
        }
    }

    public static class SetChatDescription extends Function {
        public static final int CONSTRUCTOR = 1957213277;
        public long chatId;
        public String description;

        public SetChatDescription() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetChatDescription(long j, String str) {
            this.chatId = j;
            this.description = str;
        }
    }

    public static class SetChatDiscussionGroup extends Function {
        public static final int CONSTRUCTOR = -918801736;
        public long chatId;
        public long discussionChatId;

        public SetChatDiscussionGroup() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetChatDiscussionGroup(long j, long j2) {
            this.chatId = j;
            this.discussionChatId = j2;
        }
    }

    public static class SetChatDraftMessage extends Function {
        public static final int CONSTRUCTOR = 1683889946;
        public long chatId;
        public DraftMessage draftMessage;
        public long messageThreadId;

        public SetChatDraftMessage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetChatDraftMessage(long j, long j2, DraftMessage draftMessage) {
            this.chatId = j;
            this.messageThreadId = j2;
            this.draftMessage = draftMessage;
        }
    }

    public static class SetChatLocation extends Function {
        public static final int CONSTRUCTOR = -767091286;
        public long chatId;
        public ChatLocation location;

        public SetChatLocation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetChatLocation(long j, ChatLocation chatLocation) {
            this.chatId = j;
            this.location = chatLocation;
        }
    }

    public static class SetChatMemberStatus extends Function {
        public static final int CONSTRUCTOR = 81794847;
        public long chatId;
        public MessageSender memberId;
        public ChatMemberStatus status;

        public SetChatMemberStatus() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetChatMemberStatus(long j, MessageSender messageSender, ChatMemberStatus chatMemberStatus) {
            this.chatId = j;
            this.memberId = messageSender;
            this.status = chatMemberStatus;
        }
    }

    public static class SetChatMessageSender extends Function {
        public static final int CONSTRUCTOR = -1421513858;
        public long chatId;
        public MessageSender messageSenderId;

        public SetChatMessageSender() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetChatMessageSender(long j, MessageSender messageSender) {
            this.chatId = j;
            this.messageSenderId = messageSender;
        }
    }

    public static class SetChatMessageTtl extends Function {
        public static final int CONSTRUCTOR = -1578406279;
        public long chatId;
        public int ttl;

        public SetChatMessageTtl() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetChatMessageTtl(long j, int i) {
            this.chatId = j;
            this.ttl = i;
        }
    }

    public static class SetChatNotificationSettings extends Function {
        public static final int CONSTRUCTOR = 777199614;
        public long chatId;
        public ChatNotificationSettings notificationSettings;

        public SetChatNotificationSettings() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetChatNotificationSettings(long j, ChatNotificationSettings chatNotificationSettings) {
            this.chatId = j;
            this.notificationSettings = chatNotificationSettings;
        }
    }

    public static class SetChatPermissions extends Function {
        public static final int CONSTRUCTOR = 2138507006;
        public long chatId;
        public ChatPermissions permissions;

        public SetChatPermissions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetChatPermissions(long j, ChatPermissions chatPermissions) {
            this.chatId = j;
            this.permissions = chatPermissions;
        }
    }

    public static class SetChatPhoto extends Function {
        public static final int CONSTRUCTOR = -377778941;
        public long chatId;
        public InputChatPhoto photo;

        public SetChatPhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetChatPhoto(long j, InputChatPhoto inputChatPhoto) {
            this.chatId = j;
            this.photo = inputChatPhoto;
        }
    }

    public static class SetChatSlowModeDelay extends Function {
        public static final int CONSTRUCTOR = -540350914;
        public long chatId;
        public int slowModeDelay;

        public SetChatSlowModeDelay() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetChatSlowModeDelay(long j, int i) {
            this.chatId = j;
            this.slowModeDelay = i;
        }
    }

    public static class SetChatTheme extends Function {
        public static final int CONSTRUCTOR = -1895234925;
        public long chatId;
        public String themeName;

        public SetChatTheme() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetChatTheme(long j, String str) {
            this.chatId = j;
            this.themeName = str;
        }
    }

    public static class SetChatTitle extends Function {
        public static final int CONSTRUCTOR = 164282047;
        public long chatId;
        public String title;

        public SetChatTitle() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetChatTitle(long j, String str) {
            this.chatId = j;
            this.title = str;
        }
    }

    public static class SetCommands extends Function {
        public static final int CONSTRUCTOR = -907165606;
        public BotCommand[] commands;
        public String languageCode;
        public BotCommandScope scope;

        public SetCommands() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetCommands(BotCommandScope botCommandScope, String str, BotCommand[] botCommandArr) {
            this.scope = botCommandScope;
            this.languageCode = str;
            this.commands = botCommandArr;
        }
    }

    public static class SetCustomLanguagePack extends Function {
        public static final int CONSTRUCTOR = -296742819;
        public LanguagePackInfo info;
        public LanguagePackString[] strings;

        public SetCustomLanguagePack() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetCustomLanguagePack(LanguagePackInfo languagePackInfo, LanguagePackString[] languagePackStringArr) {
            this.info = languagePackInfo;
            this.strings = languagePackStringArr;
        }
    }

    public static class SetCustomLanguagePackString extends Function {
        public static final int CONSTRUCTOR = 1316365592;
        public String languagePackId;
        public LanguagePackString newString;

        public SetCustomLanguagePackString() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetCustomLanguagePackString(String str, LanguagePackString languagePackString) {
            this.languagePackId = str;
            this.newString = languagePackString;
        }
    }

    public static class SetDatabaseEncryptionKey extends Function {
        public static final int CONSTRUCTOR = -1204599371;
        public byte[] newEncryptionKey;

        public SetDatabaseEncryptionKey() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetDatabaseEncryptionKey(byte[] bArr) {
            this.newEncryptionKey = bArr;
        }
    }

    public static class SetFileGenerationProgress extends Function {
        public static final int CONSTRUCTOR = -540459953;
        public int expectedSize;
        public long generationId;
        public int localPrefixSize;

        public SetFileGenerationProgress() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetFileGenerationProgress(long j, int i, int i2) {
            this.generationId = j;
            this.expectedSize = i;
            this.localPrefixSize = i2;
        }
    }

    public static class SetGameScore extends Function {
        public static final int CONSTRUCTOR = 2127359430;
        public long chatId;
        public boolean editMessage;
        public boolean force;
        public long messageId;
        public int score;
        public long userId;

        public SetGameScore() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetGameScore(long j, long j2, boolean z, long j3, int i, boolean z2) {
            this.chatId = j;
            this.messageId = j2;
            this.editMessage = z;
            this.userId = j3;
            this.score = i;
            this.force = z2;
        }
    }

    public static class SetGroupCallParticipantIsSpeaking extends Function {
        public static final int CONSTRUCTOR = 927506917;
        public int audioSource;
        public int groupCallId;
        public boolean isSpeaking;

        public SetGroupCallParticipantIsSpeaking() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetGroupCallParticipantIsSpeaking(int i, int i2, boolean z) {
            this.groupCallId = i;
            this.audioSource = i2;
            this.isSpeaking = z;
        }
    }

    public static class SetGroupCallParticipantVolumeLevel extends Function {
        public static final int CONSTRUCTOR = -1753769944;
        public int groupCallId;
        public MessageSender participantId;
        public int volumeLevel;

        public SetGroupCallParticipantVolumeLevel() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetGroupCallParticipantVolumeLevel(int i, MessageSender messageSender, int i2) {
            this.groupCallId = i;
            this.participantId = messageSender;
            this.volumeLevel = i2;
        }
    }

    public static class SetGroupCallTitle extends Function {
        public static final int CONSTRUCTOR = -1228825139;
        public int groupCallId;
        public String title;

        public SetGroupCallTitle() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetGroupCallTitle(int i, String str) {
            this.groupCallId = i;
            this.title = str;
        }
    }

    public static class SetInactiveSessionTtl extends Function {
        public static final int CONSTRUCTOR = 1570548048;
        public int inactiveSessionTtlDays;

        public SetInactiveSessionTtl() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetInactiveSessionTtl(int i) {
            this.inactiveSessionTtlDays = i;
        }
    }

    public static class SetInlineGameScore extends Function {
        public static final int CONSTRUCTOR = -948871797;
        public boolean editMessage;
        public boolean force;
        public String inlineMessageId;
        public int score;
        public long userId;

        public SetInlineGameScore() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetInlineGameScore(String str, boolean z, long j, int i, boolean z2) {
            this.inlineMessageId = str;
            this.editMessage = z;
            this.userId = j;
            this.score = i;
            this.force = z2;
        }
    }

    public static class SetLocation extends Function {
        public static final int CONSTRUCTOR = 93926257;
        public Location location;

        public SetLocation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetLocation(Location location) {
            this.location = location;
        }
    }

    public static class SetLogStream extends Function {
        public static final int CONSTRUCTOR = -1364199535;
        public LogStream logStream;

        public SetLogStream() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetLogStream(LogStream logStream) {
            this.logStream = logStream;
        }
    }

    public static class SetLogTagVerbosityLevel extends Function {
        public static final int CONSTRUCTOR = -2095589738;
        public int newVerbosityLevel;
        public String tag;

        public SetLogTagVerbosityLevel() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetLogTagVerbosityLevel(String str, int i) {
            this.tag = str;
            this.newVerbosityLevel = i;
        }
    }

    public static class SetLogVerbosityLevel extends Function {
        public static final int CONSTRUCTOR = -303429678;
        public int newVerbosityLevel;

        public SetLogVerbosityLevel() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetLogVerbosityLevel(int i) {
            this.newVerbosityLevel = i;
        }
    }

    public static class SetMessageReaction extends Function {
        public static final int CONSTRUCTOR = -2024821960;
        public long chatId;
        public boolean isBig;
        public long messageId;
        public String reaction;

        public SetMessageReaction() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetMessageReaction(long j, long j2, String str, boolean z) {
            this.chatId = j;
            this.messageId = j2;
            this.reaction = str;
            this.isBig = z;
        }
    }

    public static class SetName extends Function {
        public static final int CONSTRUCTOR = 1711693584;
        public String firstName;
        public String lastName;

        public SetName() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetName(String str, String str2) {
            this.firstName = str;
            this.lastName = str2;
        }
    }

    public static class SetNetworkType extends Function {
        public static final int CONSTRUCTOR = -701635234;
        public NetworkType type;

        public SetNetworkType() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetNetworkType(NetworkType networkType) {
            this.type = networkType;
        }
    }

    public static class SetOption extends Function {
        public static final int CONSTRUCTOR = 2114670322;
        public String name;
        public OptionValue value;

        public SetOption() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetOption(String str, OptionValue optionValue) {
            this.name = str;
            this.value = optionValue;
        }
    }

    public static class SetPassportElement extends Function {
        public static final int CONSTRUCTOR = 2068173212;
        public InputPassportElement element;
        public String password;

        public SetPassportElement() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetPassportElement(InputPassportElement inputPassportElement, String str) {
            this.element = inputPassportElement;
            this.password = str;
        }
    }

    public static class SetPassportElementErrors extends Function {
        public static final int CONSTRUCTOR = -2056754881;
        public InputPassportElementError[] errors;
        public long userId;

        public SetPassportElementErrors() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetPassportElementErrors(long j, InputPassportElementError[] inputPassportElementErrorArr) {
            this.userId = j;
            this.errors = inputPassportElementErrorArr;
        }
    }

    public static class SetPassword extends Function {
        public static final int CONSTRUCTOR = -1193589027;
        public String newHint;
        public String newPassword;
        public String newRecoveryEmailAddress;
        public String oldPassword;
        public boolean setRecoveryEmailAddress;

        public SetPassword() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetPassword(String str, String str2, String str3, boolean z, String str4) {
            this.oldPassword = str;
            this.newPassword = str2;
            this.newHint = str3;
            this.setRecoveryEmailAddress = z;
            this.newRecoveryEmailAddress = str4;
        }
    }

    public static class SetPinnedChats extends Function {
        public static final int CONSTRUCTOR = -695640000;
        public long[] chatIds;
        public ChatList chatList;

        public SetPinnedChats() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetPinnedChats(ChatList chatList, long[] jArr) {
            this.chatList = chatList;
            this.chatIds = jArr;
        }
    }

    public static class SetPollAnswer extends Function {
        public static final int CONSTRUCTOR = -1399388792;
        public long chatId;
        public long messageId;
        public int[] optionIds;

        public SetPollAnswer() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetPollAnswer(long j, long j2, int[] iArr) {
            this.chatId = j;
            this.messageId = j2;
            this.optionIds = iArr;
        }
    }

    public static class SetProfilePhoto extends Function {
        public static final int CONSTRUCTOR = -2069678882;
        public InputChatPhoto photo;

        public SetProfilePhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SetProfilePhoto(InputChatPhoto inputChatPhoto) {
            this.photo = inputChatPhoto;
        }
    }

    public static class SetRecoveryEmailAddress extends Function {
        public static final int CONSTRUCTOR = -1981836385;
        public String newRecoveryEmailAddress;
        public String password;

        public SetRecoveryEmailAddress() {
        }

        public SetRecoveryEmailAddress(String str, String str2) {
            this.password = str;
            this.newRecoveryEmailAddress = str2;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetScopeNotificationSettings extends Function {
        public static final int CONSTRUCTOR = -2049984966;
        public ScopeNotificationSettings notificationSettings;
        public NotificationSettingsScope scope;

        public SetScopeNotificationSettings() {
        }

        public SetScopeNotificationSettings(NotificationSettingsScope notificationSettingsScope, ScopeNotificationSettings scopeNotificationSettings) {
            this.scope = notificationSettingsScope;
            this.notificationSettings = scopeNotificationSettings;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetStickerPositionInSet extends Function {
        public static final int CONSTRUCTOR = 2075281185;
        public int position;
        public InputFile sticker;

        public SetStickerPositionInSet() {
        }

        public SetStickerPositionInSet(InputFile inputFile, int i) {
            this.sticker = inputFile;
            this.position = i;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetStickerSetThumbnail extends Function {
        public static final int CONSTRUCTOR = 1230174856;
        public String name;
        public InputFile thumbnail;
        public long userId;

        public SetStickerSetThumbnail() {
        }

        public SetStickerSetThumbnail(long j, String str, InputFile inputFile) {
            this.userId = j;
            this.name = str;
            this.thumbnail = inputFile;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetSupergroupStickerSet extends Function {
        public static final int CONSTRUCTOR = -2056344215;
        public long stickerSetId;
        public long supergroupId;

        public SetSupergroupStickerSet() {
        }

        public SetSupergroupStickerSet(long j, long j2) {
            this.supergroupId = j;
            this.stickerSetId = j2;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetSupergroupUsername extends Function {
        public static final int CONSTRUCTOR = 1346325252;
        public long supergroupId;
        public String username;

        public SetSupergroupUsername() {
        }

        public SetSupergroupUsername(long j, String str) {
            this.supergroupId = j;
            this.username = str;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetTdlibParameters extends Function {
        public static final int CONSTRUCTOR = -1912557997;
        public TdlibParameters parameters;

        public SetTdlibParameters() {
        }

        public SetTdlibParameters(TdlibParameters tdlibParameters) {
            this.parameters = tdlibParameters;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetUserPrivacySettingRules extends Function {
        public static final int CONSTRUCTOR = -473812741;
        public UserPrivacySettingRules rules;
        public UserPrivacySetting setting;

        public SetUserPrivacySettingRules() {
        }

        public SetUserPrivacySettingRules(UserPrivacySetting userPrivacySetting, UserPrivacySettingRules userPrivacySettingRules) {
            this.setting = userPrivacySetting;
            this.rules = userPrivacySettingRules;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetUsername extends Function {
        public static final int CONSTRUCTOR = 439901214;
        public String username;

        public SetUsername() {
        }

        public SetUsername(String str) {
            this.username = str;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetVideoChatDefaultParticipant extends Function {
        public static final int CONSTRUCTOR = -240749901;
        public long chatId;
        public MessageSender defaultParticipantId;

        public SetVideoChatDefaultParticipant() {
        }

        public SetVideoChatDefaultParticipant(long j, MessageSender messageSender) {
            this.chatId = j;
            this.defaultParticipantId = messageSender;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SharePhoneNumber extends Function {
        public static final int CONSTRUCTOR = 1097130069;
        public long userId;

        public SharePhoneNumber() {
        }

        public SharePhoneNumber(long j) {
            this.userId = j;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ShippingOption extends Object {
        public static final int CONSTRUCTOR = 1425690001;
        public String f25422id;
        public LabeledPricePart[] priceParts;
        public String title;

        public ShippingOption() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ShippingOption(String str, String str2, LabeledPricePart[] labeledPricePartArr) {
            this.f25422id = str;
            this.title = str2;
            this.priceParts = labeledPricePartArr;
        }
    }

    public static class SponsoredMessage extends Object {
        public static final int CONSTRUCTOR = -1384343080;
        public MessageContent content;
        public InternalLinkType link;
        public long messageId;
        public long sponsorChatId;
        public ChatInviteLinkInfo sponsorChatInfo;

        public SponsoredMessage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SponsoredMessage(long j, long j2, ChatInviteLinkInfo chatInviteLinkInfo, InternalLinkType internalLinkType, MessageContent messageContent) {
            this.messageId = j;
            this.sponsorChatId = j2;
            this.sponsorChatInfo = chatInviteLinkInfo;
            this.link = internalLinkType;
            this.content = messageContent;
        }
    }

    public static class StartGroupCallRecording extends Function {
        public static final int CONSTRUCTOR = 1757774971;
        public int groupCallId;
        public boolean recordVideo;
        public String title;
        public boolean usePortraitOrientation;

        public StartGroupCallRecording() {
        }

        public StartGroupCallRecording(int i, String str, boolean z, boolean z2) {
            this.groupCallId = i;
            this.title = str;
            this.recordVideo = z;
            this.usePortraitOrientation = z2;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class StartGroupCallScreenSharing extends Function {
        public static final int CONSTRUCTOR = -884068051;
        public int audioSourceId;
        public int groupCallId;
        public String payload;

        public StartGroupCallScreenSharing() {
        }

        public StartGroupCallScreenSharing(int i, int i2, String str) {
            this.groupCallId = i;
            this.audioSourceId = i2;
            this.payload = str;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class StartScheduledGroupCall extends Function {
        public static final int CONSTRUCTOR = 1519938838;
        public int groupCallId;

        public StartScheduledGroupCall() {
        }

        public StartScheduledGroupCall(int i) {
            this.groupCallId = i;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static abstract class StatisticalGraph extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class StatisticalGraphAsync extends StatisticalGraph {
        public static final int CONSTRUCTOR = 435891103;
        public String token;

        public StatisticalGraphAsync() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public StatisticalGraphAsync(String str) {
            this.token = str;
        }
    }

    public static class StatisticalGraphData extends StatisticalGraph {
        public static final int CONSTRUCTOR = -1988940244;
        public String jsonData;
        public String zoomToken;

        public StatisticalGraphData() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public StatisticalGraphData(String str, String str2) {
            this.jsonData = str;
            this.zoomToken = str2;
        }
    }

    public static class StatisticalGraphError extends StatisticalGraph {
        public static final int CONSTRUCTOR = -1006788526;
        public String errorMessage;

        public StatisticalGraphError() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public StatisticalGraphError(String str) {
            this.errorMessage = str;
        }
    }

    public static class StatisticalValue extends Object {
        public static final int CONSTRUCTOR = 1651337846;
        public double growthRatePercentage;
        public double previousValue;
        public double value;

        public StatisticalValue() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public StatisticalValue(double d, double d2, double d3) {
            this.value = d;
            this.previousValue = d2;
            this.growthRatePercentage = d3;
        }
    }

    public static class Sticker extends Object {
        public static final int CONSTRUCTOR = -1504840173;
        public String emoji;
        public int height;
        public ClosedVectorPath[] outline;
        public long setId;
        public File sticker;
        public Thumbnail thumbnail;
        public StickerType type;
        public int width;

        public Sticker() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Sticker(long j, int i, int i2, String str, StickerType stickerType, ClosedVectorPath[] closedVectorPathArr, Thumbnail thumbnail, File file) {
            this.setId = j;
            this.width = i;
            this.height = i2;
            this.emoji = str;
            this.type = stickerType;
            this.outline = closedVectorPathArr;
            this.thumbnail = thumbnail;
            this.sticker = file;
        }
    }

    public static class StickerSet extends Object {
        public static final int CONSTRUCTOR = -1816236758;
        public Emojis[] emojis;
        public long f25423id;
        public boolean isArchived;
        public boolean isInstalled;
        public boolean isOfficial;
        public boolean isViewed;
        public String name;
        public StickerType stickerType;
        public Sticker[] stickers;
        public Thumbnail thumbnail;
        public ClosedVectorPath[] thumbnailOutline;
        public String title;

        public StickerSet() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public StickerSet(long j, String str, String str2, Thumbnail thumbnail, ClosedVectorPath[] closedVectorPathArr, boolean z, boolean z2, boolean z3, StickerType stickerType, boolean z4, Sticker[] stickerArr, Emojis[] emojisArr) {
            this.f25423id = j;
            this.title = str;
            this.name = str2;
            this.thumbnail = thumbnail;
            this.thumbnailOutline = closedVectorPathArr;
            this.isInstalled = z;
            this.isArchived = z2;
            this.isOfficial = z3;
            this.stickerType = stickerType;
            this.isViewed = z4;
            this.stickers = stickerArr;
            this.emojis = emojisArr;
        }
    }

    public static class StickerSetInfo extends Object {
        public static final int CONSTRUCTOR = 1207538697;
        public Sticker[] covers;
        public long f25424id;
        public boolean isArchived;
        public boolean isInstalled;
        public boolean isOfficial;
        public boolean isViewed;
        public String name;
        public int size;
        public StickerType stickerType;
        public Thumbnail thumbnail;
        public ClosedVectorPath[] thumbnailOutline;
        public String title;

        public StickerSetInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public StickerSetInfo(long j, String str, String str2, Thumbnail thumbnail, ClosedVectorPath[] closedVectorPathArr, boolean z, boolean z2, boolean z3, StickerType stickerType, boolean z4, int i, Sticker[] stickerArr) {
            this.f25424id = j;
            this.title = str;
            this.name = str2;
            this.thumbnail = thumbnail;
            this.thumbnailOutline = closedVectorPathArr;
            this.isInstalled = z;
            this.isArchived = z2;
            this.isOfficial = z3;
            this.stickerType = stickerType;
            this.isViewed = z4;
            this.size = i;
            this.covers = stickerArr;
        }
    }

    public static class StickerSets extends Object {
        public static final int CONSTRUCTOR = -1883828812;
        public StickerSetInfo[] sets;
        public int totalCount;

        public StickerSets() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public StickerSets(int i, StickerSetInfo[] stickerSetInfoArr) {
            this.totalCount = i;
            this.sets = stickerSetInfoArr;
        }
    }

    public static abstract class StickerType extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class StickerTypeAnimated extends StickerType {
        public static final int CONSTRUCTOR = 1763255981;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class StickerTypeMask extends StickerType {
        public static final int CONSTRUCTOR = -839756573;
        public MaskPosition maskPosition;

        public StickerTypeMask() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public StickerTypeMask(MaskPosition maskPosition) {
            this.maskPosition = maskPosition;
        }
    }

    public static class StickerTypeStatic extends StickerType {
        public static final int CONSTRUCTOR = 1804483793;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class StickerTypeVideo extends StickerType {
        public static final int CONSTRUCTOR = 522366836;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Stickers extends Object {
        public static final int CONSTRUCTOR = 1974859260;
        public Sticker[] stickers;

        public Stickers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Stickers(Sticker[] stickerArr) {
            this.stickers = stickerArr;
        }
    }

    public static class StopPoll extends Function {
        public static final int CONSTRUCTOR = 1659374253;
        public long chatId;
        public long messageId;
        public ReplyMarkup replyMarkup;

        public StopPoll() {
        }

        public StopPoll(long j, long j2, ReplyMarkup replyMarkup) {
            this.chatId = j;
            this.messageId = j2;
            this.replyMarkup = replyMarkup;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class StorageStatistics extends Object {
        public static final int CONSTRUCTOR = 217237013;
        public StorageStatisticsByChat[] byChat;
        public int count;
        public long size;

        public StorageStatistics() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public StorageStatistics(long j, int i, StorageStatisticsByChat[] storageStatisticsByChatArr) {
            this.size = j;
            this.count = i;
            this.byChat = storageStatisticsByChatArr;
        }
    }

    public static class StorageStatisticsByChat extends Object {
        public static final int CONSTRUCTOR = 635434531;
        public StorageStatisticsByFileType[] byFileType;
        public long chatId;
        public int count;
        public long size;

        public StorageStatisticsByChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public StorageStatisticsByChat(long j, long j2, int i, StorageStatisticsByFileType[] storageStatisticsByFileTypeArr) {
            this.chatId = j;
            this.size = j2;
            this.count = i;
            this.byFileType = storageStatisticsByFileTypeArr;
        }
    }

    public static class StorageStatisticsByFileType extends Object {
        public static final int CONSTRUCTOR = 714012840;
        public int count;
        public FileType fileType;
        public long size;

        public StorageStatisticsByFileType() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public StorageStatisticsByFileType(FileType fileType, long j, int i) {
            this.fileType = fileType;
            this.size = j;
            this.count = i;
        }
    }

    public static class StorageStatisticsFast extends Object {
        public static final int CONSTRUCTOR = -884922271;
        public long databaseSize;
        public int fileCount;
        public long filesSize;
        public long languagePackDatabaseSize;
        public long logSize;

        public StorageStatisticsFast() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public StorageStatisticsFast(long j, int i, long j2, long j3, long j4) {
            this.filesSize = j;
            this.fileCount = i;
            this.databaseSize = j2;
            this.languagePackDatabaseSize = j3;
            this.logSize = j4;
        }
    }

    public static abstract class SuggestedAction extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class SuggestedActionCheckPassword extends SuggestedAction {
        public static final int CONSTRUCTOR = 1910534839;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SuggestedActionCheckPhoneNumber extends SuggestedAction {
        public static final int CONSTRUCTOR = 648771563;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SuggestedActionConvertToBroadcastGroup extends SuggestedAction {
        public static final int CONSTRUCTOR = -965071304;
        public long supergroupId;

        public SuggestedActionConvertToBroadcastGroup() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SuggestedActionConvertToBroadcastGroup(long j) {
            this.supergroupId = j;
        }
    }

    public static class SuggestedActionEnableArchiveAndMuteNewChats extends SuggestedAction {
        public static final int CONSTRUCTOR = 2017586255;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SuggestedActionSetPassword extends SuggestedAction {
        public static final int CONSTRUCTOR = 1863613848;
        public int authorizationDelay;

        public SuggestedActionSetPassword() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SuggestedActionSetPassword(int i) {
            this.authorizationDelay = i;
        }
    }

    public static class SuggestedActionViewChecksHint extends SuggestedAction {
        public static final int CONSTRUCTOR = 891303239;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Supergroup extends Object {
        public static final int CONSTRUCTOR = -722213067;
        public int date;
        public boolean hasLinkedChat;
        public boolean hasLocation;
        public long f25425id;
        public boolean isBroadcastGroup;
        public boolean isChannel;
        public boolean isFake;
        public boolean isScam;
        public boolean isSlowModeEnabled;
        public boolean isVerified;
        public int memberCount;
        public String restrictionReason;
        public boolean signMessages;
        public ChatMemberStatus status;
        public String username;

        public Supergroup() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Supergroup(long j, String str, int i, ChatMemberStatus chatMemberStatus, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str2, boolean z8, boolean z9) {
            this.f25425id = j;
            this.username = str;
            this.date = i;
            this.status = chatMemberStatus;
            this.memberCount = i2;
            this.hasLinkedChat = z;
            this.hasLocation = z2;
            this.signMessages = z3;
            this.isSlowModeEnabled = z4;
            this.isChannel = z5;
            this.isBroadcastGroup = z6;
            this.isVerified = z7;
            this.restrictionReason = str2;
            this.isScam = z8;
            this.isFake = z9;
        }
    }

    public static class SupergroupFullInfo extends Object {
        public static final int CONSTRUCTOR = -1035719349;
        public int administratorCount;
        public int bannedCount;
        public BotCommands[] botCommands;
        public boolean canGetMembers;
        public boolean canGetStatistics;
        public boolean canSetLocation;
        public boolean canSetStickerSet;
        public boolean canSetUsername;
        public String description;
        public ChatInviteLink inviteLink;
        public boolean isAllHistoryAvailable;
        public long linkedChatId;
        public ChatLocation location;
        public int memberCount;
        public ChatPhoto photo;
        public int restrictedCount;
        public int slowModeDelay;
        public double slowModeDelayExpiresIn;
        public long stickerSetId;
        public long upgradedFromBasicGroupId;
        public long upgradedFromMaxMessageId;

        public SupergroupFullInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SupergroupFullInfo(ChatPhoto chatPhoto, String str, int i, int i2, int i3, int i4, long j, int i5, double d, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, long j2, ChatLocation chatLocation, ChatInviteLink chatInviteLink, BotCommands[] botCommandsArr, long j3, long j4) {
            this.photo = chatPhoto;
            this.description = str;
            this.memberCount = i;
            this.administratorCount = i2;
            this.restrictedCount = i3;
            this.bannedCount = i4;
            this.linkedChatId = j;
            this.slowModeDelay = i5;
            this.slowModeDelayExpiresIn = d;
            this.canGetMembers = z;
            this.canSetUsername = z2;
            this.canSetStickerSet = z3;
            this.canSetLocation = z4;
            this.canGetStatistics = z5;
            this.isAllHistoryAvailable = z6;
            this.stickerSetId = j2;
            this.location = chatLocation;
            this.inviteLink = chatInviteLink;
            this.botCommands = botCommandsArr;
            this.upgradedFromBasicGroupId = j3;
            this.upgradedFromMaxMessageId = j4;
        }
    }

    public static abstract class SupergroupMembersFilter extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class SupergroupMembersFilterAdministrators extends SupergroupMembersFilter {
        public static final int CONSTRUCTOR = -2097380265;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SupergroupMembersFilterBanned extends SupergroupMembersFilter {
        public static final int CONSTRUCTOR = -1210621683;
        public String query;

        public SupergroupMembersFilterBanned() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SupergroupMembersFilterBanned(String str) {
            this.query = str;
        }
    }

    public static class SupergroupMembersFilterBots extends SupergroupMembersFilter {
        public static final int CONSTRUCTOR = 492138918;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SupergroupMembersFilterContacts extends SupergroupMembersFilter {
        public static final int CONSTRUCTOR = -1282910856;
        public String query;

        public SupergroupMembersFilterContacts() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SupergroupMembersFilterContacts(String str) {
            this.query = str;
        }
    }

    public static class SupergroupMembersFilterMention extends SupergroupMembersFilter {
        public static final int CONSTRUCTOR = 947915036;
        public long messageThreadId;
        public String query;

        public SupergroupMembersFilterMention() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SupergroupMembersFilterMention(String str, long j) {
            this.query = str;
            this.messageThreadId = j;
        }
    }

    public static class SupergroupMembersFilterRecent extends SupergroupMembersFilter {
        public static final int CONSTRUCTOR = 1178199509;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SupergroupMembersFilterRestricted extends SupergroupMembersFilter {
        public static final int CONSTRUCTOR = -1107800034;
        public String query;

        public SupergroupMembersFilterRestricted() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SupergroupMembersFilterRestricted(String str) {
            this.query = str;
        }
    }

    public static class SupergroupMembersFilterSearch extends SupergroupMembersFilter {
        public static final int CONSTRUCTOR = -1696358469;
        public String query;

        public SupergroupMembersFilterSearch() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public SupergroupMembersFilterSearch(String str) {
            this.query = str;
        }
    }

    public static class SynchronizeLanguagePack extends Function {
        public static final int CONSTRUCTOR = -2065307858;
        public String languagePackId;

        public SynchronizeLanguagePack() {
        }

        public SynchronizeLanguagePack(String str) {
            this.languagePackId = str;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TMeUrl extends Object {
        public static final int CONSTRUCTOR = -1140786622;
        public TMeUrlType type;
        public String url;

        public TMeUrl() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public TMeUrl(String str, TMeUrlType tMeUrlType) {
            this.url = str;
            this.type = tMeUrlType;
        }
    }

    public static abstract class TMeUrlType extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class TMeUrlTypeChatInvite extends TMeUrlType {
        public static final int CONSTRUCTOR = 313907785;
        public ChatInviteLinkInfo info;

        public TMeUrlTypeChatInvite() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public TMeUrlTypeChatInvite(ChatInviteLinkInfo chatInviteLinkInfo) {
            this.info = chatInviteLinkInfo;
        }
    }

    public static class TMeUrlTypeStickerSet extends TMeUrlType {
        public static final int CONSTRUCTOR = 1602473196;
        public long stickerSetId;

        public TMeUrlTypeStickerSet() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public TMeUrlTypeStickerSet(long j) {
            this.stickerSetId = j;
        }
    }

    public static class TMeUrlTypeSupergroup extends TMeUrlType {
        public static final int CONSTRUCTOR = -1353369944;
        public long supergroupId;

        public TMeUrlTypeSupergroup() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public TMeUrlTypeSupergroup(long j) {
            this.supergroupId = j;
        }
    }

    public static class TMeUrlTypeUser extends TMeUrlType {
        public static final int CONSTRUCTOR = 125336602;
        public long userId;

        public TMeUrlTypeUser() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public TMeUrlTypeUser(long j) {
            this.userId = j;
        }
    }

    public static class TMeUrls extends Object {
        public static final int CONSTRUCTOR = -1130595098;
        public TMeUrl[] urls;

        public TMeUrls() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public TMeUrls(TMeUrl[] tMeUrlArr) {
            this.urls = tMeUrlArr;
        }
    }

    public static class TdlibParameters extends Object {
        public static final int CONSTRUCTOR = -761520773;
        public String apiHash;
        public int apiId;
        public String applicationVersion;
        public String databaseDirectory;
        public String deviceModel;
        public boolean enableStorageOptimizer;
        public String filesDirectory;
        public boolean ignoreFileNames;
        public String systemLanguageCode;
        public String systemVersion;
        public boolean useChatInfoDatabase;
        public boolean useFileDatabase;
        public boolean useMessageDatabase;
        public boolean useSecretChats;
        public boolean useTestDc;

        public TdlibParameters() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public TdlibParameters(boolean z, String str, String str2, boolean z2, boolean z3, boolean z4, boolean z5, int i, String str3, String str4, String str5, String str6, String str7, boolean z6, boolean z7) {
            this.useTestDc = z;
            this.databaseDirectory = str;
            this.filesDirectory = str2;
            this.useFileDatabase = z2;
            this.useChatInfoDatabase = z3;
            this.useMessageDatabase = z4;
            this.useSecretChats = z5;
            this.apiId = i;
            this.apiHash = str3;
            this.systemLanguageCode = str4;
            this.deviceModel = str5;
            this.systemVersion = str6;
            this.applicationVersion = str7;
            this.enableStorageOptimizer = z6;
            this.ignoreFileNames = z7;
        }
    }

    public static class TemporaryPasswordState extends Object {
        public static final int CONSTRUCTOR = 939837410;
        public boolean hasPassword;
        public int validFor;

        public TemporaryPasswordState() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public TemporaryPasswordState(boolean z, int i) {
            this.hasPassword = z;
            this.validFor = i;
        }
    }

    public static class TerminateAllOtherSessions extends Function {
        public static final int CONSTRUCTOR = 1874485523;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TerminateSession extends Function {
        public static final int CONSTRUCTOR = -407385812;
        public long sessionId;

        public TerminateSession() {
        }

        public TerminateSession(long j) {
            this.sessionId = j;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TermsOfService extends Object {
        public static final int CONSTRUCTOR = 739422597;
        public int minUserAge;
        public boolean showPopup;
        public FormattedText text;

        public TermsOfService() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public TermsOfService(FormattedText formattedText, int i, boolean z) {
            this.text = formattedText;
            this.minUserAge = i;
            this.showPopup = z;
        }
    }

    public static class TestBytes extends Object {
        public static final int CONSTRUCTOR = -1541225250;
        public byte[] value;

        public TestBytes() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public TestBytes(byte[] bArr) {
            this.value = bArr;
        }
    }

    public static class TestCallBytes extends Function {
        public static final int CONSTRUCTOR = -736011607;
        public byte[] f25426x;

        public TestCallBytes() {
        }

        public TestCallBytes(byte[] bArr) {
            this.f25426x = bArr;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestCallEmpty extends Function {
        public static final int CONSTRUCTOR = -627291626;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestCallString extends Function {
        public static final int CONSTRUCTOR = -1732818385;
        public String f25427x;

        public TestCallString() {
        }

        public TestCallString(String str) {
            this.f25427x = str;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestCallVectorInt extends Function {
        public static final int CONSTRUCTOR = -2137277793;
        public int[] f25428x;

        public TestCallVectorInt() {
        }

        public TestCallVectorInt(int[] iArr) {
            this.f25428x = iArr;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestCallVectorIntObject extends Function {
        public static final int CONSTRUCTOR = 1825428218;
        public TestInt[] f25429x;

        public TestCallVectorIntObject() {
        }

        public TestCallVectorIntObject(TestInt[] testIntArr) {
            this.f25429x = testIntArr;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestCallVectorString extends Function {
        public static final int CONSTRUCTOR = -408600900;
        public String[] f25430x;

        public TestCallVectorString() {
        }

        public TestCallVectorString(String[] strArr) {
            this.f25430x = strArr;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestCallVectorStringObject extends Function {
        public static final int CONSTRUCTOR = 1527666429;
        public TestString[] f25431x;

        public TestCallVectorStringObject() {
        }

        public TestCallVectorStringObject(TestString[] testStringArr) {
            this.f25431x = testStringArr;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestGetDifference extends Function {
        public static final int CONSTRUCTOR = 1747084069;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestInt extends Object {
        public static final int CONSTRUCTOR = -574804983;
        public int value;

        public TestInt() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public TestInt(int i) {
            this.value = i;
        }
    }

    public static class TestNetwork extends Function {
        public static final int CONSTRUCTOR = -1343998901;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestProxy extends Function {
        public static final int CONSTRUCTOR = -1197366626;
        public int dcId;
        public int port;
        public String server;
        public double timeout;
        public ProxyType type;

        public TestProxy() {
        }

        public TestProxy(String str, int i, ProxyType proxyType, int i2, double d) {
            this.server = str;
            this.port = i;
            this.type = proxyType;
            this.dcId = i2;
            this.timeout = d;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestReturnError extends Function {
        public static final int CONSTRUCTOR = 455179506;
        public Error error;

        public TestReturnError() {
        }

        public TestReturnError(Error error) {
            this.error = error;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestSquareInt extends Function {
        public static final int CONSTRUCTOR = -60135024;
        public int f25432x;

        public TestSquareInt() {
        }

        public TestSquareInt(int i) {
            this.f25432x = i;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestString extends Object {
        public static final int CONSTRUCTOR = -27891572;
        public String value;

        public TestString() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public TestString(String str) {
            this.value = str;
        }
    }

    public static class TestUseUpdate extends Function {
        public static final int CONSTRUCTOR = 717094686;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestVectorInt extends Object {
        public static final int CONSTRUCTOR = 593682027;
        public int[] value;

        public TestVectorInt() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public TestVectorInt(int[] iArr) {
            this.value = iArr;
        }
    }

    public static class TestVectorIntObject extends Object {
        public static final int CONSTRUCTOR = 125891546;
        public TestInt[] value;

        public TestVectorIntObject() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public TestVectorIntObject(TestInt[] testIntArr) {
            this.value = testIntArr;
        }
    }

    public static class TestVectorString extends Object {
        public static final int CONSTRUCTOR = 79339995;
        public String[] value;

        public TestVectorString() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public TestVectorString(String[] strArr) {
            this.value = strArr;
        }
    }

    public static class TestVectorStringObject extends Object {
        public static final int CONSTRUCTOR = 80780537;
        public TestString[] value;

        public TestVectorStringObject() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public TestVectorStringObject(TestString[] testStringArr) {
            this.value = testStringArr;
        }
    }

    public static class Text extends Object {
        public static final int CONSTRUCTOR = 578181272;
        public String text;

        public Text() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Text(String str) {
            this.text = str;
        }
    }

    public static class TextEntities extends Object {
        public static final int CONSTRUCTOR = -933199172;
        public TextEntity[] entities;

        public TextEntities() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public TextEntities(TextEntity[] textEntityArr) {
            this.entities = textEntityArr;
        }
    }

    public static class TextEntity extends Object {
        public static final int CONSTRUCTOR = -1951688280;
        public int length;
        public int offset;
        public TextEntityType type;

        public TextEntity() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public TextEntity(int i, int i2, TextEntityType textEntityType) {
            this.offset = i;
            this.length = i2;
            this.type = textEntityType;
        }
    }

    public static abstract class TextEntityType extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class TextEntityTypeBankCardNumber extends TextEntityType {
        public static final int CONSTRUCTOR = 105986320;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeBold extends TextEntityType {
        public static final int CONSTRUCTOR = -1128210000;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeBotCommand extends TextEntityType {
        public static final int CONSTRUCTOR = -1150997581;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeCashtag extends TextEntityType {
        public static final int CONSTRUCTOR = 1222915915;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeCode extends TextEntityType {
        public static final int CONSTRUCTOR = -974534326;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeEmailAddress extends TextEntityType {
        public static final int CONSTRUCTOR = 1425545249;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeHashtag extends TextEntityType {
        public static final int CONSTRUCTOR = -1023958307;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeItalic extends TextEntityType {
        public static final int CONSTRUCTOR = -118253987;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeMediaTimestamp extends TextEntityType {
        public static final int CONSTRUCTOR = -1841898992;
        public int mediaTimestamp;

        public TextEntityTypeMediaTimestamp() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public TextEntityTypeMediaTimestamp(int i) {
            this.mediaTimestamp = i;
        }
    }

    public static class TextEntityTypeMention extends TextEntityType {
        public static final int CONSTRUCTOR = 934535013;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeMentionName extends TextEntityType {
        public static final int CONSTRUCTOR = -1570974289;
        public long userId;

        public TextEntityTypeMentionName() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public TextEntityTypeMentionName(long j) {
            this.userId = j;
        }
    }

    public static class TextEntityTypePhoneNumber extends TextEntityType {
        public static final int CONSTRUCTOR = -1160140246;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypePre extends TextEntityType {
        public static final int CONSTRUCTOR = 1648958606;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypePreCode extends TextEntityType {
        public static final int CONSTRUCTOR = -945325397;
        public String language;

        public TextEntityTypePreCode() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public TextEntityTypePreCode(String str) {
            this.language = str;
        }
    }

    public static class TextEntityTypeSpoiler extends TextEntityType {
        public static final int CONSTRUCTOR = 544019899;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeStrikethrough extends TextEntityType {
        public static final int CONSTRUCTOR = 961529082;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeTextUrl extends TextEntityType {
        public static final int CONSTRUCTOR = 445719651;
        public String url;

        public TextEntityTypeTextUrl() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public TextEntityTypeTextUrl(String str) {
            this.url = str;
        }
    }

    public static class TextEntityTypeUnderline extends TextEntityType {
        public static final int CONSTRUCTOR = 792317842;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeUrl extends TextEntityType {
        public static final int CONSTRUCTOR = -1312762756;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static abstract class TextParseMode extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class TextParseModeHTML extends TextParseMode {
        public static final int CONSTRUCTOR = 1660208627;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextParseModeMarkdown extends TextParseMode {
        public static final int CONSTRUCTOR = 360073407;
        public int version;

        public TextParseModeMarkdown() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public TextParseModeMarkdown(int i) {
            this.version = i;
        }
    }

    public static class ThemeSettings extends Object {
        public static final int CONSTRUCTOR = -62120942;
        public int accentColor;
        public boolean animateOutgoingMessageFill;
        public Background background;
        public int outgoingMessageAccentColor;
        public BackgroundFill outgoingMessageFill;

        public ThemeSettings() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ThemeSettings(int i, Background background, BackgroundFill backgroundFill, boolean z, int i2) {
            this.accentColor = i;
            this.background = background;
            this.outgoingMessageFill = backgroundFill;
            this.animateOutgoingMessageFill = z;
            this.outgoingMessageAccentColor = i2;
        }
    }

    public static class Thumbnail extends Object {
        public static final int CONSTRUCTOR = 1243275371;
        public File file;
        public ThumbnailFormat format;
        public int height;
        public int width;

        public Thumbnail() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Thumbnail(ThumbnailFormat thumbnailFormat, int i, int i2, File file) {
            this.format = thumbnailFormat;
            this.width = i;
            this.height = i2;
            this.file = file;
        }
    }

    public static abstract class ThumbnailFormat extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class ThumbnailFormatGif extends ThumbnailFormat {
        public static final int CONSTRUCTOR = 1252205962;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ThumbnailFormatJpeg extends ThumbnailFormat {
        public static final int CONSTRUCTOR = -653503352;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ThumbnailFormatMpeg4 extends ThumbnailFormat {
        public static final int CONSTRUCTOR = 278616062;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ThumbnailFormatPng extends ThumbnailFormat {
        public static final int CONSTRUCTOR = 1577490421;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ThumbnailFormatTgs extends ThumbnailFormat {
        public static final int CONSTRUCTOR = 1315522642;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ThumbnailFormatWebm extends ThumbnailFormat {
        public static final int CONSTRUCTOR = -660084953;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ThumbnailFormatWebp extends ThumbnailFormat {
        public static final int CONSTRUCTOR = -53588974;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleAllDownloadsArePaused extends Function {
        public static final int CONSTRUCTOR = 1251512322;
        public boolean arePaused;

        public ToggleAllDownloadsArePaused() {
        }

        public ToggleAllDownloadsArePaused(boolean z) {
            this.arePaused = z;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleChatDefaultDisableNotification extends Function {
        public static final int CONSTRUCTOR = 314794002;
        public long chatId;
        public boolean defaultDisableNotification;

        public ToggleChatDefaultDisableNotification() {
        }

        public ToggleChatDefaultDisableNotification(long j, boolean z) {
            this.chatId = j;
            this.defaultDisableNotification = z;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleChatHasProtectedContent extends Function {
        public static final int CONSTRUCTOR = 975231309;
        public long chatId;
        public boolean hasProtectedContent;

        public ToggleChatHasProtectedContent() {
        }

        public ToggleChatHasProtectedContent(long j, boolean z) {
            this.chatId = j;
            this.hasProtectedContent = z;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleChatIsMarkedAsUnread extends Function {
        public static final int CONSTRUCTOR = -986129697;
        public long chatId;
        public boolean isMarkedAsUnread;

        public ToggleChatIsMarkedAsUnread() {
        }

        public ToggleChatIsMarkedAsUnread(long j, boolean z) {
            this.chatId = j;
            this.isMarkedAsUnread = z;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleChatIsPinned extends Function {
        public static final int CONSTRUCTOR = -1485429186;
        public long chatId;
        public ChatList chatList;
        public boolean isPinned;

        public ToggleChatIsPinned() {
        }

        public ToggleChatIsPinned(ChatList chatList, long j, boolean z) {
            this.chatList = chatList;
            this.chatId = j;
            this.isPinned = z;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleDownloadIsPaused extends Function {
        public static final int CONSTRUCTOR = -947493099;
        public int fileId;
        public boolean isPaused;

        public ToggleDownloadIsPaused() {
        }

        public ToggleDownloadIsPaused(int i, boolean z) {
            this.fileId = i;
            this.isPaused = z;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleGroupCallEnabledStartNotification extends Function {
        public static final int CONSTRUCTOR = 707839826;
        public boolean enabledStartNotification;
        public int groupCallId;

        public ToggleGroupCallEnabledStartNotification() {
        }

        public ToggleGroupCallEnabledStartNotification(int i, boolean z) {
            this.groupCallId = i;
            this.enabledStartNotification = z;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleGroupCallIsMyVideoEnabled extends Function {
        public static final int CONSTRUCTOR = -1624289030;
        public int groupCallId;
        public boolean isMyVideoEnabled;

        public ToggleGroupCallIsMyVideoEnabled() {
        }

        public ToggleGroupCallIsMyVideoEnabled(int i, boolean z) {
            this.groupCallId = i;
            this.isMyVideoEnabled = z;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleGroupCallIsMyVideoPaused extends Function {
        public static final int CONSTRUCTOR = -478875239;
        public int groupCallId;
        public boolean isMyVideoPaused;

        public ToggleGroupCallIsMyVideoPaused() {
        }

        public ToggleGroupCallIsMyVideoPaused(int i, boolean z) {
            this.groupCallId = i;
            this.isMyVideoPaused = z;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleGroupCallMuteNewParticipants extends Function {
        public static final int CONSTRUCTOR = 284082626;
        public int groupCallId;
        public boolean muteNewParticipants;

        public ToggleGroupCallMuteNewParticipants() {
        }

        public ToggleGroupCallMuteNewParticipants(int i, boolean z) {
            this.groupCallId = i;
            this.muteNewParticipants = z;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleGroupCallParticipantIsHandRaised extends Function {
        public static final int CONSTRUCTOR = -1896127519;
        public int groupCallId;
        public boolean isHandRaised;
        public MessageSender participantId;

        public ToggleGroupCallParticipantIsHandRaised() {
        }

        public ToggleGroupCallParticipantIsHandRaised(int i, MessageSender messageSender, boolean z) {
            this.groupCallId = i;
            this.participantId = messageSender;
            this.isHandRaised = z;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleGroupCallParticipantIsMuted extends Function {
        public static final int CONSTRUCTOR = -1308093433;
        public int groupCallId;
        public boolean isMuted;
        public MessageSender participantId;

        public ToggleGroupCallParticipantIsMuted() {
        }

        public ToggleGroupCallParticipantIsMuted(int i, MessageSender messageSender, boolean z) {
            this.groupCallId = i;
            this.participantId = messageSender;
            this.isMuted = z;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleGroupCallScreenSharingIsPaused extends Function {
        public static final int CONSTRUCTOR = -1602530464;
        public int groupCallId;
        public boolean isPaused;

        public ToggleGroupCallScreenSharingIsPaused() {
        }

        public ToggleGroupCallScreenSharingIsPaused(int i, boolean z) {
            this.groupCallId = i;
            this.isPaused = z;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleMessageSenderIsBlocked extends Function {
        public static final int CONSTRUCTOR = -2008084779;
        public boolean isBlocked;
        public MessageSender senderId;

        public ToggleMessageSenderIsBlocked() {
        }

        public ToggleMessageSenderIsBlocked(MessageSender messageSender, boolean z) {
            this.senderId = messageSender;
            this.isBlocked = z;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleSessionCanAcceptCalls extends Function {
        public static final int CONSTRUCTOR = 1819027208;
        public boolean canAcceptCalls;
        public long sessionId;

        public ToggleSessionCanAcceptCalls() {
        }

        public ToggleSessionCanAcceptCalls(long j, boolean z) {
            this.sessionId = j;
            this.canAcceptCalls = z;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleSessionCanAcceptSecretChats extends Function {
        public static final int CONSTRUCTOR = 1000843390;
        public boolean canAcceptSecretChats;
        public long sessionId;

        public ToggleSessionCanAcceptSecretChats() {
        }

        public ToggleSessionCanAcceptSecretChats(long j, boolean z) {
            this.sessionId = j;
            this.canAcceptSecretChats = z;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleSupergroupIsAllHistoryAvailable extends Function {
        public static final int CONSTRUCTOR = 1155110478;
        public boolean isAllHistoryAvailable;
        public long supergroupId;

        public ToggleSupergroupIsAllHistoryAvailable() {
        }

        public ToggleSupergroupIsAllHistoryAvailable(long j, boolean z) {
            this.supergroupId = j;
            this.isAllHistoryAvailable = z;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleSupergroupIsBroadcastGroup extends Function {
        public static final int CONSTRUCTOR = 884089365;
        public long supergroupId;

        public ToggleSupergroupIsBroadcastGroup() {
        }

        public ToggleSupergroupIsBroadcastGroup(long j) {
            this.supergroupId = j;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleSupergroupSignMessages extends Function {
        public static final int CONSTRUCTOR = 1156568356;
        public boolean signMessages;
        public long supergroupId;

        public ToggleSupergroupSignMessages() {
        }

        public ToggleSupergroupSignMessages(long j, boolean z) {
            this.supergroupId = j;
            this.signMessages = z;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static abstract class TopChatCategory extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class TopChatCategoryBots extends TopChatCategory {
        public static final int CONSTRUCTOR = -1577129195;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TopChatCategoryCalls extends TopChatCategory {
        public static final int CONSTRUCTOR = 356208861;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TopChatCategoryChannels extends TopChatCategory {
        public static final int CONSTRUCTOR = -500825885;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TopChatCategoryForwardChats extends TopChatCategory {
        public static final int CONSTRUCTOR = 1695922133;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TopChatCategoryGroups extends TopChatCategory {
        public static final int CONSTRUCTOR = 1530056846;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TopChatCategoryInlineBots extends TopChatCategory {
        public static final int CONSTRUCTOR = 377023356;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TopChatCategoryUsers extends TopChatCategory {
        public static final int CONSTRUCTOR = 1026706816;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TransferChatOwnership extends Function {
        public static final int CONSTRUCTOR = 2006977043;
        public long chatId;
        public String password;
        public long userId;

        public TransferChatOwnership() {
        }

        public TransferChatOwnership(long j, long j2, String str) {
            this.chatId = j;
            this.userId = j2;
            this.password = str;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TranslateText extends Function {
        public static final int CONSTRUCTOR = -1619686803;
        public String fromLanguageCode;
        public String text;
        public String toLanguageCode;

        public TranslateText() {
        }

        public TranslateText(String str, String str2, String str3) {
            this.text = str;
            this.fromLanguageCode = str2;
            this.toLanguageCode = str3;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UnpinAllChatMessages extends Function {
        public static final int CONSTRUCTOR = -1437805385;
        public long chatId;

        public UnpinAllChatMessages() {
        }

        public UnpinAllChatMessages(long j) {
            this.chatId = j;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UnpinChatMessage extends Function {
        public static final int CONSTRUCTOR = 2065448670;
        public long chatId;
        public long messageId;

        public UnpinChatMessage() {
        }

        public UnpinChatMessage(long j, long j2) {
            this.chatId = j;
            this.messageId = j2;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UnreadReaction extends Object {
        public static final int CONSTRUCTOR = 88800067;
        public boolean isBig;
        public String reaction;
        public MessageSender senderId;

        public UnreadReaction() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UnreadReaction(String str, MessageSender messageSender, boolean z) {
            this.reaction = str;
            this.senderId = messageSender;
            this.isBig = z;
        }
    }

    public static abstract class Update extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class UpdateActiveNotifications extends Update {
        public static final int CONSTRUCTOR = -1306672221;
        public NotificationGroup[] groups;

        public UpdateActiveNotifications() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateActiveNotifications(NotificationGroup[] notificationGroupArr) {
            this.groups = notificationGroupArr;
        }
    }

    public static class UpdateAnimatedEmojiMessageClicked extends Update {
        public static final int CONSTRUCTOR = -1558809595;
        public long chatId;
        public long messageId;
        public Sticker sticker;

        public UpdateAnimatedEmojiMessageClicked() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateAnimatedEmojiMessageClicked(long j, long j2, Sticker sticker) {
            this.chatId = j;
            this.messageId = j2;
            this.sticker = sticker;
        }
    }

    public static class UpdateAnimationSearchParameters extends Update {
        public static final int CONSTRUCTOR = -1144983202;
        public String[] emojis;
        public String provider;

        public UpdateAnimationSearchParameters() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateAnimationSearchParameters(String str, String[] strArr) {
            this.provider = str;
            this.emojis = strArr;
        }
    }

    public static class UpdateAuthorizationState extends Update {
        public static final int CONSTRUCTOR = 1622347490;
        public AuthorizationState authorizationState;

        public UpdateAuthorizationState() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateAuthorizationState(AuthorizationState authorizationState) {
            this.authorizationState = authorizationState;
        }
    }

    public static class UpdateBasicGroup extends Update {
        public static final int CONSTRUCTOR = -1003239581;
        public BasicGroup basicGroup;

        public UpdateBasicGroup() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateBasicGroup(BasicGroup basicGroup) {
            this.basicGroup = basicGroup;
        }
    }

    public static class UpdateBasicGroupFullInfo extends Update {
        public static final int CONSTRUCTOR = 1391881151;
        public BasicGroupFullInfo basicGroupFullInfo;
        public long basicGroupId;

        public UpdateBasicGroupFullInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateBasicGroupFullInfo(long j, BasicGroupFullInfo basicGroupFullInfo) {
            this.basicGroupId = j;
            this.basicGroupFullInfo = basicGroupFullInfo;
        }
    }

    public static class UpdateCall extends Update {
        public static final int CONSTRUCTOR = 1337184477;
        public Call call;

        public UpdateCall() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateCall(Call call) {
            this.call = call;
        }
    }

    public static class UpdateChatAction extends Update {
        public static final int CONSTRUCTOR = -1698703832;
        public ChatAction action;
        public long chatId;
        public long messageThreadId;
        public MessageSender senderId;

        public UpdateChatAction() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatAction(long j, long j2, MessageSender messageSender, ChatAction chatAction) {
            this.chatId = j;
            this.messageThreadId = j2;
            this.senderId = messageSender;
            this.action = chatAction;
        }
    }

    public static class UpdateChatActionBar extends Update {
        public static final int CONSTRUCTOR = -643671870;
        public ChatActionBar actionBar;
        public long chatId;

        public UpdateChatActionBar() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatActionBar(long j, ChatActionBar chatActionBar) {
            this.chatId = j;
            this.actionBar = chatActionBar;
        }
    }

    public static class UpdateChatAvailableReactions extends Update {
        public static final int CONSTRUCTOR = 1461776531;
        public String[] availableReactions;
        public long chatId;

        public UpdateChatAvailableReactions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatAvailableReactions(long j, String[] strArr) {
            this.chatId = j;
            this.availableReactions = strArr;
        }
    }

    public static class UpdateChatDefaultDisableNotification extends Update {
        public static final int CONSTRUCTOR = 464087707;
        public long chatId;
        public boolean defaultDisableNotification;

        public UpdateChatDefaultDisableNotification() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatDefaultDisableNotification(long j, boolean z) {
            this.chatId = j;
            this.defaultDisableNotification = z;
        }
    }

    public static class UpdateChatDraftMessage extends Update {
        public static final int CONSTRUCTOR = 1455190380;
        public long chatId;
        public DraftMessage draftMessage;
        public ChatPosition[] positions;

        public UpdateChatDraftMessage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatDraftMessage(long j, DraftMessage draftMessage, ChatPosition[] chatPositionArr) {
            this.chatId = j;
            this.draftMessage = draftMessage;
            this.positions = chatPositionArr;
        }
    }

    public static class UpdateChatFilters extends Update {
        public static final int CONSTRUCTOR = -961518713;
        public ChatFilterInfo[] chatFilters;

        public UpdateChatFilters() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatFilters(ChatFilterInfo[] chatFilterInfoArr) {
            this.chatFilters = chatFilterInfoArr;
        }
    }

    public static class UpdateChatHasProtectedContent extends Update {
        public static final int CONSTRUCTOR = 1800406811;
        public long chatId;
        public boolean hasProtectedContent;

        public UpdateChatHasProtectedContent() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatHasProtectedContent(long j, boolean z) {
            this.chatId = j;
            this.hasProtectedContent = z;
        }
    }

    public static class UpdateChatHasScheduledMessages extends Update {
        public static final int CONSTRUCTOR = 2064958167;
        public long chatId;
        public boolean hasScheduledMessages;

        public UpdateChatHasScheduledMessages() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatHasScheduledMessages(long j, boolean z) {
            this.chatId = j;
            this.hasScheduledMessages = z;
        }
    }

    public static class UpdateChatIsBlocked extends Update {
        public static final int CONSTRUCTOR = -1998946752;
        public long chatId;
        public boolean isBlocked;

        public UpdateChatIsBlocked() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatIsBlocked(long j, boolean z) {
            this.chatId = j;
            this.isBlocked = z;
        }
    }

    public static class UpdateChatIsMarkedAsUnread extends Update {
        public static final int CONSTRUCTOR = 1468347188;
        public long chatId;
        public boolean isMarkedAsUnread;

        public UpdateChatIsMarkedAsUnread() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatIsMarkedAsUnread(long j, boolean z) {
            this.chatId = j;
            this.isMarkedAsUnread = z;
        }
    }

    public static class UpdateChatLastMessage extends Update {
        public static final int CONSTRUCTOR = -923244537;
        public long chatId;
        public Message lastMessage;
        public ChatPosition[] positions;

        public UpdateChatLastMessage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatLastMessage(long j, Message message, ChatPosition[] chatPositionArr) {
            this.chatId = j;
            this.lastMessage = message;
            this.positions = chatPositionArr;
        }
    }

    public static class UpdateChatMember extends Update {
        public static final int CONSTRUCTOR = -2027989165;
        public long actorUserId;
        public long chatId;
        public int date;
        public ChatInviteLink inviteLink;
        public ChatMember newChatMember;
        public ChatMember oldChatMember;

        public UpdateChatMember() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatMember(long j, long j2, int i, ChatInviteLink chatInviteLink, ChatMember chatMember, ChatMember chatMember2) {
            this.chatId = j;
            this.actorUserId = j2;
            this.date = i;
            this.inviteLink = chatInviteLink;
            this.oldChatMember = chatMember;
            this.newChatMember = chatMember2;
        }
    }

    public static class UpdateChatMessageSender extends Update {
        public static final int CONSTRUCTOR = 2003849793;
        public long chatId;
        public MessageSender messageSenderId;

        public UpdateChatMessageSender() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatMessageSender(long j, MessageSender messageSender) {
            this.chatId = j;
            this.messageSenderId = messageSender;
        }
    }

    public static class UpdateChatMessageTtl extends Update {
        public static final int CONSTRUCTOR = -572479112;
        public long chatId;
        public int messageTtl;

        public UpdateChatMessageTtl() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatMessageTtl(long j, int i) {
            this.chatId = j;
            this.messageTtl = i;
        }
    }

    public static class UpdateChatNotificationSettings extends Update {
        public static final int CONSTRUCTOR = -803163050;
        public long chatId;
        public ChatNotificationSettings notificationSettings;

        public UpdateChatNotificationSettings() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatNotificationSettings(long j, ChatNotificationSettings chatNotificationSettings) {
            this.chatId = j;
            this.notificationSettings = chatNotificationSettings;
        }
    }

    public static class UpdateChatOnlineMemberCount extends Update {
        public static final int CONSTRUCTOR = 487369373;
        public long chatId;
        public int onlineMemberCount;

        public UpdateChatOnlineMemberCount() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatOnlineMemberCount(long j, int i) {
            this.chatId = j;
            this.onlineMemberCount = i;
        }
    }

    public static class UpdateChatPendingJoinRequests extends Update {
        public static final int CONSTRUCTOR = 348578785;
        public long chatId;
        public ChatJoinRequestsInfo pendingJoinRequests;

        public UpdateChatPendingJoinRequests() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatPendingJoinRequests(long j, ChatJoinRequestsInfo chatJoinRequestsInfo) {
            this.chatId = j;
            this.pendingJoinRequests = chatJoinRequestsInfo;
        }
    }

    public static class UpdateChatPermissions extends Update {
        public static final int CONSTRUCTOR = -1622010003;
        public long chatId;
        public ChatPermissions permissions;

        public UpdateChatPermissions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatPermissions(long j, ChatPermissions chatPermissions) {
            this.chatId = j;
            this.permissions = chatPermissions;
        }
    }

    public static class UpdateChatPhoto extends Update {
        public static final int CONSTRUCTOR = -324713921;
        public long chatId;
        public ChatPhotoInfo photo;

        public UpdateChatPhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatPhoto(long j, ChatPhotoInfo chatPhotoInfo) {
            this.chatId = j;
            this.photo = chatPhotoInfo;
        }
    }

    public static class UpdateChatPosition extends Update {
        public static final int CONSTRUCTOR = -8979849;
        public long chatId;
        public ChatPosition position;

        public UpdateChatPosition() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatPosition(long j, ChatPosition chatPosition) {
            this.chatId = j;
            this.position = chatPosition;
        }
    }

    public static class UpdateChatReadInbox extends Update {
        public static final int CONSTRUCTOR = -797952281;
        public long chatId;
        public long lastReadInboxMessageId;
        public int unreadCount;

        public UpdateChatReadInbox() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatReadInbox(long j, long j2, int i) {
            this.chatId = j;
            this.lastReadInboxMessageId = j2;
            this.unreadCount = i;
        }
    }

    public static class UpdateChatReadOutbox extends Update {
        public static final int CONSTRUCTOR = 708334213;
        public long chatId;
        public long lastReadOutboxMessageId;

        public UpdateChatReadOutbox() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatReadOutbox(long j, long j2) {
            this.chatId = j;
            this.lastReadOutboxMessageId = j2;
        }
    }

    public static class UpdateChatReplyMarkup extends Update {
        public static final int CONSTRUCTOR = 1309386144;
        public long chatId;
        public long replyMarkupMessageId;

        public UpdateChatReplyMarkup() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatReplyMarkup(long j, long j2) {
            this.chatId = j;
            this.replyMarkupMessageId = j2;
        }
    }

    public static class UpdateChatTheme extends Update {
        public static final int CONSTRUCTOR = 838063205;
        public long chatId;
        public String themeName;

        public UpdateChatTheme() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatTheme(long j, String str) {
            this.chatId = j;
            this.themeName = str;
        }
    }

    public static class UpdateChatThemes extends Update {
        public static final int CONSTRUCTOR = -1588098376;
        public ChatTheme[] chatThemes;

        public UpdateChatThemes() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatThemes(ChatTheme[] chatThemeArr) {
            this.chatThemes = chatThemeArr;
        }
    }

    public static class UpdateChatTitle extends Update {
        public static final int CONSTRUCTOR = -175405660;
        public long chatId;
        public String title;

        public UpdateChatTitle() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatTitle(long j, String str) {
            this.chatId = j;
            this.title = str;
        }
    }

    public static class UpdateChatUnreadMentionCount extends Update {
        public static final int CONSTRUCTOR = -2131461348;
        public long chatId;
        public int unreadMentionCount;

        public UpdateChatUnreadMentionCount() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatUnreadMentionCount(long j, int i) {
            this.chatId = j;
            this.unreadMentionCount = i;
        }
    }

    public static class UpdateChatUnreadReactionCount extends Update {
        public static final int CONSTRUCTOR = -2124399395;
        public long chatId;
        public int unreadReactionCount;

        public UpdateChatUnreadReactionCount() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatUnreadReactionCount(long j, int i) {
            this.chatId = j;
            this.unreadReactionCount = i;
        }
    }

    public static class UpdateChatVideoChat extends Update {
        public static final int CONSTRUCTOR = 637226150;
        public long chatId;
        public VideoChat videoChat;

        public UpdateChatVideoChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateChatVideoChat(long j, VideoChat videoChat) {
            this.chatId = j;
            this.videoChat = videoChat;
        }
    }

    public static class UpdateConnectionState extends Update {
        public static final int CONSTRUCTOR = 1469292078;
        public ConnectionState state;

        public UpdateConnectionState() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateConnectionState(ConnectionState connectionState) {
            this.state = connectionState;
        }
    }

    public static class UpdateDeleteMessages extends Update {
        public static final int CONSTRUCTOR = 1669252686;
        public long chatId;
        public boolean fromCache;
        public boolean isPermanent;
        public long[] messageIds;

        public UpdateDeleteMessages() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateDeleteMessages(long j, long[] jArr, boolean z, boolean z2) {
            this.chatId = j;
            this.messageIds = jArr;
            this.isPermanent = z;
            this.fromCache = z2;
        }
    }

    public static class UpdateDiceEmojis extends Update {
        public static final int CONSTRUCTOR = -1069066940;
        public String[] emojis;

        public UpdateDiceEmojis() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateDiceEmojis(String[] strArr) {
            this.emojis = strArr;
        }
    }

    public static class UpdateFavoriteStickers extends Update {
        public static final int CONSTRUCTOR = 1662240999;
        public int[] stickerIds;

        public UpdateFavoriteStickers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateFavoriteStickers(int[] iArr) {
            this.stickerIds = iArr;
        }
    }

    public static class UpdateFile extends Update {
        public static final int CONSTRUCTOR = 114132831;
        public File file;

        public UpdateFile() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateFile(File file) {
            this.file = file;
        }
    }

    public static class UpdateFileAddedToDownloads extends Update {
        public static final int CONSTRUCTOR = 1609929242;
        public DownloadedFileCounts counts;
        public FileDownload fileDownload;

        public UpdateFileAddedToDownloads() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateFileAddedToDownloads(FileDownload fileDownload, DownloadedFileCounts downloadedFileCounts) {
            this.fileDownload = fileDownload;
            this.counts = downloadedFileCounts;
        }
    }

    public static class UpdateFileDownload extends Update {
        public static final int CONSTRUCTOR = 875529162;
        public int completeDate;
        public DownloadedFileCounts counts;
        public int fileId;
        public boolean isPaused;

        public UpdateFileDownload() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateFileDownload(int i, int i2, boolean z, DownloadedFileCounts downloadedFileCounts) {
            this.fileId = i;
            this.completeDate = i2;
            this.isPaused = z;
            this.counts = downloadedFileCounts;
        }
    }

    public static class UpdateFileDownloads extends Update {
        public static final int CONSTRUCTOR = -389213497;
        public long downloadedSize;
        public int totalCount;
        public long totalSize;

        public UpdateFileDownloads() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateFileDownloads(long j, int i, long j2) {
            this.totalSize = j;
            this.totalCount = i;
            this.downloadedSize = j2;
        }
    }

    public static class UpdateFileGenerationStart extends Update {
        public static final int CONSTRUCTOR = 216817388;
        public String conversion;
        public String destinationPath;
        public long generationId;
        public String originalPath;

        public UpdateFileGenerationStart() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateFileGenerationStart(long j, String str, String str2, String str3) {
            this.generationId = j;
            this.originalPath = str;
            this.destinationPath = str2;
            this.conversion = str3;
        }
    }

    public static class UpdateFileGenerationStop extends Update {
        public static final int CONSTRUCTOR = -1894449685;
        public long generationId;

        public UpdateFileGenerationStop() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateFileGenerationStop(long j) {
            this.generationId = j;
        }
    }

    public static class UpdateFileRemovedFromDownloads extends Update {
        public static final int CONSTRUCTOR = 1853625576;
        public DownloadedFileCounts counts;
        public int fileId;

        public UpdateFileRemovedFromDownloads() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateFileRemovedFromDownloads(int i, DownloadedFileCounts downloadedFileCounts) {
            this.fileId = i;
            this.counts = downloadedFileCounts;
        }
    }

    public static class UpdateGroupCall extends Update {
        public static final int CONSTRUCTOR = 808603136;
        public GroupCall groupCall;

        public UpdateGroupCall() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateGroupCall(GroupCall groupCall) {
            this.groupCall = groupCall;
        }
    }

    public static class UpdateGroupCallParticipant extends Update {
        public static final int CONSTRUCTOR = -803128071;
        public int groupCallId;
        public GroupCallParticipant participant;

        public UpdateGroupCallParticipant() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateGroupCallParticipant(int i, GroupCallParticipant groupCallParticipant) {
            this.groupCallId = i;
            this.participant = groupCallParticipant;
        }
    }

    public static class UpdateHavePendingNotifications extends Update {
        public static final int CONSTRUCTOR = 179233243;
        public boolean haveDelayedNotifications;
        public boolean haveUnreceivedNotifications;

        public UpdateHavePendingNotifications() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateHavePendingNotifications(boolean z, boolean z2) {
            this.haveDelayedNotifications = z;
            this.haveUnreceivedNotifications = z2;
        }
    }

    public static class UpdateInstalledStickerSets extends Update {
        public static final int CONSTRUCTOR = 1125575977;
        public boolean isMasks;
        public long[] stickerSetIds;

        public UpdateInstalledStickerSets() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateInstalledStickerSets(boolean z, long[] jArr) {
            this.isMasks = z;
            this.stickerSetIds = jArr;
        }
    }

    public static class UpdateLanguagePackStrings extends Update {
        public static final int CONSTRUCTOR = -1056319886;
        public String languagePackId;
        public String localizationTarget;
        public LanguagePackString[] strings;

        public UpdateLanguagePackStrings() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateLanguagePackStrings(String str, String str2, LanguagePackString[] languagePackStringArr) {
            this.localizationTarget = str;
            this.languagePackId = str2;
            this.strings = languagePackStringArr;
        }
    }

    public static class UpdateMessageContent extends Update {
        public static final int CONSTRUCTOR = 506903332;
        public long chatId;
        public long messageId;
        public MessageContent newContent;

        public UpdateMessageContent() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateMessageContent(long j, long j2, MessageContent messageContent) {
            this.chatId = j;
            this.messageId = j2;
            this.newContent = messageContent;
        }
    }

    public static class UpdateMessageContentOpened extends Update {
        public static final int CONSTRUCTOR = -1520523131;
        public long chatId;
        public long messageId;

        public UpdateMessageContentOpened() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateMessageContentOpened(long j, long j2) {
            this.chatId = j;
            this.messageId = j2;
        }
    }

    public static class UpdateMessageEdited extends Update {
        public static final int CONSTRUCTOR = -559545626;
        public long chatId;
        public int editDate;
        public long messageId;
        public ReplyMarkup replyMarkup;

        public UpdateMessageEdited() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateMessageEdited(long j, long j2, int i, ReplyMarkup replyMarkup) {
            this.chatId = j;
            this.messageId = j2;
            this.editDate = i;
            this.replyMarkup = replyMarkup;
        }
    }

    public static class UpdateMessageInteractionInfo extends Update {
        public static final int CONSTRUCTOR = -1417659394;
        public long chatId;
        public MessageInteractionInfo interactionInfo;
        public long messageId;

        public UpdateMessageInteractionInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateMessageInteractionInfo(long j, long j2, MessageInteractionInfo messageInteractionInfo) {
            this.chatId = j;
            this.messageId = j2;
            this.interactionInfo = messageInteractionInfo;
        }
    }

    public static class UpdateMessageIsPinned extends Update {
        public static final int CONSTRUCTOR = 1102848829;
        public long chatId;
        public boolean isPinned;
        public long messageId;

        public UpdateMessageIsPinned() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateMessageIsPinned(long j, long j2, boolean z) {
            this.chatId = j;
            this.messageId = j2;
            this.isPinned = z;
        }
    }

    public static class UpdateMessageLiveLocationViewed extends Update {
        public static final int CONSTRUCTOR = -1308260971;
        public long chatId;
        public long messageId;

        public UpdateMessageLiveLocationViewed() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateMessageLiveLocationViewed(long j, long j2) {
            this.chatId = j;
            this.messageId = j2;
        }
    }

    public static class UpdateMessageMentionRead extends Update {
        public static final int CONSTRUCTOR = -252228282;
        public long chatId;
        public long messageId;
        public int unreadMentionCount;

        public UpdateMessageMentionRead() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateMessageMentionRead(long j, long j2, int i) {
            this.chatId = j;
            this.messageId = j2;
            this.unreadMentionCount = i;
        }
    }

    public static class UpdateMessageSendAcknowledged extends Update {
        public static final int CONSTRUCTOR = 1302843961;
        public long chatId;
        public long messageId;

        public UpdateMessageSendAcknowledged() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateMessageSendAcknowledged(long j, long j2) {
            this.chatId = j;
            this.messageId = j2;
        }
    }

    public static class UpdateMessageSendFailed extends Update {
        public static final int CONSTRUCTOR = -1032335779;
        public int errorCode;
        public String errorMessage;
        public Message message;
        public long oldMessageId;

        public UpdateMessageSendFailed() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateMessageSendFailed(Message message, long j, int i, String str) {
            this.message = message;
            this.oldMessageId = j;
            this.errorCode = i;
            this.errorMessage = str;
        }
    }

    public static class UpdateMessageSendSucceeded extends Update {
        public static final int CONSTRUCTOR = 1815715197;
        public Message message;
        public long oldMessageId;

        public UpdateMessageSendSucceeded() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateMessageSendSucceeded(Message message, long j) {
            this.message = message;
            this.oldMessageId = j;
        }
    }

    public static class UpdateMessageUnreadReactions extends Update {
        public static final int CONSTRUCTOR = 942840008;
        public long chatId;
        public long messageId;
        public int unreadReactionCount;
        public UnreadReaction[] unreadReactions;

        public UpdateMessageUnreadReactions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateMessageUnreadReactions(long j, long j2, UnreadReaction[] unreadReactionArr, int i) {
            this.chatId = j;
            this.messageId = j2;
            this.unreadReactions = unreadReactionArr;
            this.unreadReactionCount = i;
        }
    }

    public static class UpdateNewCallSignalingData extends Update {
        public static final int CONSTRUCTOR = 583634317;
        public int callId;
        public byte[] data;

        public UpdateNewCallSignalingData() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateNewCallSignalingData(int i, byte[] bArr) {
            this.callId = i;
            this.data = bArr;
        }
    }

    public static class UpdateNewCallbackQuery extends Update {
        public static final int CONSTRUCTOR = -1989881762;
        public long chatId;
        public long chatInstance;
        public long f25433id;
        public long messageId;
        public CallbackQueryPayload payload;
        public long senderUserId;

        public UpdateNewCallbackQuery() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateNewCallbackQuery(long j, long j2, long j3, long j4, long j5, CallbackQueryPayload callbackQueryPayload) {
            this.f25433id = j;
            this.senderUserId = j2;
            this.chatId = j3;
            this.messageId = j4;
            this.chatInstance = j5;
            this.payload = callbackQueryPayload;
        }
    }

    public static class UpdateNewChat extends Update {
        public static final int CONSTRUCTOR = 2075757773;
        public Chat chat;

        public UpdateNewChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateNewChat(Chat chat) {
            this.chat = chat;
        }
    }

    public static class UpdateNewChatJoinRequest extends Update {
        public static final int CONSTRUCTOR = 175285905;
        public long chatId;
        public ChatInviteLink inviteLink;
        public ChatJoinRequest request;

        public UpdateNewChatJoinRequest() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateNewChatJoinRequest(long j, ChatJoinRequest chatJoinRequest, ChatInviteLink chatInviteLink) {
            this.chatId = j;
            this.request = chatJoinRequest;
            this.inviteLink = chatInviteLink;
        }
    }

    public static class UpdateNewChosenInlineResult extends Update {
        public static final int CONSTRUCTOR = -884191395;
        public String inlineMessageId;
        public String query;
        public String resultId;
        public long senderUserId;
        public Location userLocation;

        public UpdateNewChosenInlineResult() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateNewChosenInlineResult(long j, Location location, String str, String str2, String str3) {
            this.senderUserId = j;
            this.userLocation = location;
            this.query = str;
            this.resultId = str2;
            this.inlineMessageId = str3;
        }
    }

    public static class UpdateNewCustomEvent extends Update {
        public static final int CONSTRUCTOR = 1994222092;
        public String event;

        public UpdateNewCustomEvent() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateNewCustomEvent(String str) {
            this.event = str;
        }
    }

    public static class UpdateNewCustomQuery extends Update {
        public static final int CONSTRUCTOR = -687670874;
        public String data;
        public long f25434id;
        public int timeout;

        public UpdateNewCustomQuery() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateNewCustomQuery(long j, String str, int i) {
            this.f25434id = j;
            this.data = str;
            this.timeout = i;
        }
    }

    public static class UpdateNewInlineCallbackQuery extends Update {
        public static final int CONSTRUCTOR = -319212358;
        public long chatInstance;
        public long f25435id;
        public String inlineMessageId;
        public CallbackQueryPayload payload;
        public long senderUserId;

        public UpdateNewInlineCallbackQuery() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateNewInlineCallbackQuery(long j, long j2, String str, long j3, CallbackQueryPayload callbackQueryPayload) {
            this.f25435id = j;
            this.senderUserId = j2;
            this.inlineMessageId = str;
            this.chatInstance = j3;
            this.payload = callbackQueryPayload;
        }
    }

    public static class UpdateNewInlineQuery extends Update {
        public static final int CONSTRUCTOR = 1903279924;
        public ChatType chatType;
        public long f25436id;
        public String offset;
        public String query;
        public long senderUserId;
        public Location userLocation;

        public UpdateNewInlineQuery() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateNewInlineQuery(long j, long j2, Location location, ChatType chatType, String str, String str2) {
            this.f25436id = j;
            this.senderUserId = j2;
            this.userLocation = location;
            this.chatType = chatType;
            this.query = str;
            this.offset = str2;
        }
    }

    public static class UpdateNewMessage extends Update {
        public static final int CONSTRUCTOR = -563105266;
        public Message message;

        public UpdateNewMessage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateNewMessage(Message message) {
            this.message = message;
        }
    }

    public static class UpdateNewPreCheckoutQuery extends Update {
        public static final int CONSTRUCTOR = 708342217;
        public String currency;
        public long f25437id;
        public byte[] invoicePayload;
        public OrderInfo orderInfo;
        public long senderUserId;
        public String shippingOptionId;
        public long totalAmount;

        public UpdateNewPreCheckoutQuery() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateNewPreCheckoutQuery(long j, long j2, String str, long j3, byte[] bArr, String str2, OrderInfo orderInfo) {
            this.f25437id = j;
            this.senderUserId = j2;
            this.currency = str;
            this.totalAmount = j3;
            this.invoicePayload = bArr;
            this.shippingOptionId = str2;
            this.orderInfo = orderInfo;
        }
    }

    public static class UpdateNewShippingQuery extends Update {
        public static final int CONSTRUCTOR = 693651058;
        public long f25438id;
        public String invoicePayload;
        public long senderUserId;
        public Address shippingAddress;

        public UpdateNewShippingQuery() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateNewShippingQuery(long j, long j2, String str, Address address) {
            this.f25438id = j;
            this.senderUserId = j2;
            this.invoicePayload = str;
            this.shippingAddress = address;
        }
    }

    public static class UpdateNotification extends Update {
        public static final int CONSTRUCTOR = -1897496876;
        public Notification notification;
        public int notificationGroupId;

        public UpdateNotification() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateNotification(int i, Notification notification) {
            this.notificationGroupId = i;
            this.notification = notification;
        }
    }

    public static class UpdateNotificationGroup extends Update {
        public static final int CONSTRUCTOR = -2049005665;
        public Notification[] addedNotifications;
        public long chatId;
        public boolean isSilent;
        public int notificationGroupId;
        public long notificationSettingsChatId;
        public int[] removedNotificationIds;
        public int totalCount;
        public NotificationGroupType type;

        public UpdateNotificationGroup() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateNotificationGroup(int i, NotificationGroupType notificationGroupType, long j, long j2, boolean z, int i2, Notification[] notificationArr, int[] iArr) {
            this.notificationGroupId = i;
            this.type = notificationGroupType;
            this.chatId = j;
            this.notificationSettingsChatId = j2;
            this.isSilent = z;
            this.totalCount = i2;
            this.addedNotifications = notificationArr;
            this.removedNotificationIds = iArr;
        }
    }

    public static class UpdateOption extends Update {
        public static final int CONSTRUCTOR = 900822020;
        public String name;
        public OptionValue value;

        public UpdateOption() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateOption(String str, OptionValue optionValue) {
            this.name = str;
            this.value = optionValue;
        }
    }

    public static class UpdatePoll extends Update {
        public static final int CONSTRUCTOR = -1771342902;
        public Poll poll;

        public UpdatePoll() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdatePoll(Poll poll) {
            this.poll = poll;
        }
    }

    public static class UpdatePollAnswer extends Update {
        public static final int CONSTRUCTOR = -1209100651;
        public int[] optionIds;
        public long pollId;
        public long userId;

        public UpdatePollAnswer() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdatePollAnswer(long j, long j2, int[] iArr) {
            this.pollId = j;
            this.userId = j2;
            this.optionIds = iArr;
        }
    }

    public static class UpdateReactions extends Update {
        public static final int CONSTRUCTOR = -1086911093;
        public Reaction[] reactions;

        public UpdateReactions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateReactions(Reaction[] reactionArr) {
            this.reactions = reactionArr;
        }
    }

    public static class UpdateRecentStickers extends Update {
        public static final int CONSTRUCTOR = 1906403540;
        public boolean isAttached;
        public int[] stickerIds;

        public UpdateRecentStickers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateRecentStickers(boolean z, int[] iArr) {
            this.isAttached = z;
            this.stickerIds = iArr;
        }
    }

    public static class UpdateSavedAnimations extends Update {
        public static final int CONSTRUCTOR = 65563814;
        public int[] animationIds;

        public UpdateSavedAnimations() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateSavedAnimations(int[] iArr) {
            this.animationIds = iArr;
        }
    }

    public static class UpdateScopeNotificationSettings extends Update {
        public static final int CONSTRUCTOR = -1203975309;
        public ScopeNotificationSettings notificationSettings;
        public NotificationSettingsScope scope;

        public UpdateScopeNotificationSettings() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateScopeNotificationSettings(NotificationSettingsScope notificationSettingsScope, ScopeNotificationSettings scopeNotificationSettings) {
            this.scope = notificationSettingsScope;
            this.notificationSettings = scopeNotificationSettings;
        }
    }

    public static class UpdateSecretChat extends Update {
        public static final int CONSTRUCTOR = -1666903253;
        public SecretChat secretChat;

        public UpdateSecretChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateSecretChat(SecretChat secretChat) {
            this.secretChat = secretChat;
        }
    }

    public static class UpdateSelectedBackground extends Update {
        public static final int CONSTRUCTOR = -1715658659;
        public Background background;
        public boolean forDarkTheme;

        public UpdateSelectedBackground() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateSelectedBackground(boolean z, Background background) {
            this.forDarkTheme = z;
            this.background = background;
        }
    }

    public static class UpdateServiceNotification extends Update {
        public static final int CONSTRUCTOR = 1318622637;
        public MessageContent content;
        public String type;

        public UpdateServiceNotification() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateServiceNotification(String str, MessageContent messageContent) {
            this.type = str;
            this.content = messageContent;
        }
    }

    public static class UpdateStickerSet extends Update {
        public static final int CONSTRUCTOR = 1879268812;
        public StickerSet stickerSet;

        public UpdateStickerSet() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateStickerSet(StickerSet stickerSet) {
            this.stickerSet = stickerSet;
        }
    }

    public static class UpdateSuggestedActions extends Update {
        public static final int CONSTRUCTOR = 1459452346;
        public SuggestedAction[] addedActions;
        public SuggestedAction[] removedActions;

        public UpdateSuggestedActions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateSuggestedActions(SuggestedAction[] suggestedActionArr, SuggestedAction[] suggestedActionArr2) {
            this.addedActions = suggestedActionArr;
            this.removedActions = suggestedActionArr2;
        }
    }

    public static class UpdateSupergroup extends Update {
        public static final int CONSTRUCTOR = -76782300;
        public Supergroup supergroup;

        public UpdateSupergroup() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateSupergroup(Supergroup supergroup) {
            this.supergroup = supergroup;
        }
    }

    public static class UpdateSupergroupFullInfo extends Update {
        public static final int CONSTRUCTOR = 435539214;
        public SupergroupFullInfo supergroupFullInfo;
        public long supergroupId;

        public UpdateSupergroupFullInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateSupergroupFullInfo(long j, SupergroupFullInfo supergroupFullInfo) {
            this.supergroupId = j;
            this.supergroupFullInfo = supergroupFullInfo;
        }
    }

    public static class UpdateTermsOfService extends Update {
        public static final int CONSTRUCTOR = -1304640162;
        public TermsOfService termsOfService;
        public String termsOfServiceId;

        public UpdateTermsOfService() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateTermsOfService(String str, TermsOfService termsOfService) {
            this.termsOfServiceId = str;
            this.termsOfService = termsOfService;
        }
    }

    public static class UpdateTrendingStickerSets extends Update {
        public static final int CONSTRUCTOR = 450714593;
        public StickerSets stickerSets;

        public UpdateTrendingStickerSets() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateTrendingStickerSets(StickerSets stickerSets) {
            this.stickerSets = stickerSets;
        }
    }

    public static class UpdateUnreadChatCount extends Update {
        public static final int CONSTRUCTOR = 1994494530;
        public ChatList chatList;
        public int markedAsUnreadCount;
        public int markedAsUnreadUnmutedCount;
        public int totalCount;
        public int unreadCount;
        public int unreadUnmutedCount;

        public UpdateUnreadChatCount() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateUnreadChatCount(ChatList chatList, int i, int i2, int i3, int i4, int i5) {
            this.chatList = chatList;
            this.totalCount = i;
            this.unreadCount = i2;
            this.unreadUnmutedCount = i3;
            this.markedAsUnreadCount = i4;
            this.markedAsUnreadUnmutedCount = i5;
        }
    }

    public static class UpdateUnreadMessageCount extends Update {
        public static final int CONSTRUCTOR = 78987721;
        public ChatList chatList;
        public int unreadCount;
        public int unreadUnmutedCount;

        public UpdateUnreadMessageCount() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateUnreadMessageCount(ChatList chatList, int i, int i2) {
            this.chatList = chatList;
            this.unreadCount = i;
            this.unreadUnmutedCount = i2;
        }
    }

    public static class UpdateUser extends Update {
        public static final int CONSTRUCTOR = 1183394041;
        public User user;

        public UpdateUser() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateUser(User user) {
            this.user = user;
        }
    }

    public static class UpdateUserFullInfo extends Update {
        public static final int CONSTRUCTOR = -51197161;
        public UserFullInfo userFullInfo;
        public long userId;

        public UpdateUserFullInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateUserFullInfo(long j, UserFullInfo userFullInfo) {
            this.userId = j;
            this.userFullInfo = userFullInfo;
        }
    }

    public static class UpdateUserPrivacySettingRules extends Update {
        public static final int CONSTRUCTOR = -912960778;
        public UserPrivacySettingRules rules;
        public UserPrivacySetting setting;

        public UpdateUserPrivacySettingRules() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateUserPrivacySettingRules(UserPrivacySetting userPrivacySetting, UserPrivacySettingRules userPrivacySettingRules) {
            this.setting = userPrivacySetting;
            this.rules = userPrivacySettingRules;
        }
    }

    public static class UpdateUserStatus extends Update {
        public static final int CONSTRUCTOR = 958468625;
        public UserStatus status;
        public long userId;

        public UpdateUserStatus() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateUserStatus(long j, UserStatus userStatus) {
            this.userId = j;
            this.status = userStatus;
        }
    }

    public static class UpdateUsersNearby extends Update {
        public static final int CONSTRUCTOR = -1517109163;
        public ChatNearby[] usersNearby;

        public UpdateUsersNearby() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UpdateUsersNearby(ChatNearby[] chatNearbyArr) {
            this.usersNearby = chatNearbyArr;
        }
    }

    public static class Updates extends Object {
        public static final int CONSTRUCTOR = 475842347;
        public Update[] updates;

        public Updates() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Updates(Update[] updateArr) {
            this.updates = updateArr;
        }
    }

    public static class UpgradeBasicGroupChatToSupergroupChat extends Function {
        public static final int CONSTRUCTOR = 300488122;
        public long chatId;

        public UpgradeBasicGroupChatToSupergroupChat() {
        }

        public UpgradeBasicGroupChatToSupergroupChat(long j) {
            this.chatId = j;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UploadFile extends Function {
        public static final int CONSTRUCTOR = -745597786;
        public InputFile file;
        public FileType fileType;
        public int priority;

        public UploadFile() {
        }

        public UploadFile(InputFile inputFile, FileType fileType, int i) {
            this.file = inputFile;
            this.fileType = fileType;
            this.priority = i;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UploadStickerFile extends Function {
        public static final int CONSTRUCTOR = 86279066;
        public InputSticker sticker;
        public long userId;

        public UploadStickerFile() {
        }

        public UploadStickerFile(long j, InputSticker inputSticker) {
            this.userId = j;
            this.sticker = inputSticker;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class User extends Object {
        public static final int CONSTRUCTOR = -537797015;
        public String firstName;
        public boolean haveAccess;
        public long f25439id;
        public boolean isContact;
        public boolean isFake;
        public boolean isMutualContact;
        public boolean isScam;
        public boolean isSupport;
        public boolean isVerified;
        public String languageCode;
        public String lastName;
        public String phoneNumber;
        public ProfilePhoto profilePhoto;
        public String restrictionReason;
        public UserStatus status;
        public UserType type;
        public String username;

        public User() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public User(long j, String str, String str2, String str3, String str4, UserStatus userStatus, ProfilePhoto profilePhoto, boolean z, boolean z2, boolean z3, boolean z4, String str5, boolean z5, boolean z6, boolean z7, UserType userType, String str6) {
            this.f25439id = j;
            this.firstName = str;
            this.lastName = str2;
            this.username = str3;
            this.phoneNumber = str4;
            this.status = userStatus;
            this.profilePhoto = profilePhoto;
            this.isContact = z;
            this.isMutualContact = z2;
            this.isVerified = z3;
            this.isSupport = z4;
            this.restrictionReason = str5;
            this.isScam = z5;
            this.isFake = z6;
            this.haveAccess = z7;
            this.type = userType;
            this.languageCode = str6;
        }
    }

    public static class UserFullInfo extends Object {
        public static final int CONSTRUCTOR = 2138747126;
        public String bio;
        public boolean canBeCalled;
        public BotCommand[] commands;
        public String description;
        public int groupInCommonCount;
        public boolean hasPrivateCalls;
        public boolean hasPrivateForwards;
        public boolean isBlocked;
        public boolean needPhoneNumberPrivacyException;
        public ChatPhoto photo;
        public String shareText;
        public boolean supportsVideoCalls;

        public UserFullInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UserFullInfo(ChatPhoto chatPhoto, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, String str2, String str3, int i, BotCommand[] botCommandArr) {
            this.photo = chatPhoto;
            this.isBlocked = z;
            this.canBeCalled = z2;
            this.supportsVideoCalls = z3;
            this.hasPrivateCalls = z4;
            this.hasPrivateForwards = z5;
            this.needPhoneNumberPrivacyException = z6;
            this.bio = str;
            this.shareText = str2;
            this.description = str3;
            this.groupInCommonCount = i;
            this.commands = botCommandArr;
        }
    }

    public static abstract class UserPrivacySetting extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class UserPrivacySettingAllowCalls extends UserPrivacySetting {
        public static final int CONSTRUCTOR = -906967291;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingAllowChatInvites extends UserPrivacySetting {
        public static final int CONSTRUCTOR = 1271668007;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingAllowFindingByPhoneNumber extends UserPrivacySetting {
        public static final int CONSTRUCTOR = -1846645423;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingAllowPeerToPeerCalls extends UserPrivacySetting {
        public static final int CONSTRUCTOR = 352500032;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static abstract class UserPrivacySettingRule extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class UserPrivacySettingRuleAllowAll extends UserPrivacySettingRule {
        public static final int CONSTRUCTOR = -1967186881;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingRuleAllowChatMembers extends UserPrivacySettingRule {
        public static final int CONSTRUCTOR = -2048749863;
        public long[] chatIds;

        public UserPrivacySettingRuleAllowChatMembers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UserPrivacySettingRuleAllowChatMembers(long[] jArr) {
            this.chatIds = jArr;
        }
    }

    public static class UserPrivacySettingRuleAllowContacts extends UserPrivacySettingRule {
        public static final int CONSTRUCTOR = -1892733680;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingRuleAllowUsers extends UserPrivacySettingRule {
        public static final int CONSTRUCTOR = 1110988334;
        public long[] userIds;

        public UserPrivacySettingRuleAllowUsers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UserPrivacySettingRuleAllowUsers(long[] jArr) {
            this.userIds = jArr;
        }
    }

    public static class UserPrivacySettingRuleRestrictAll extends UserPrivacySettingRule {
        public static final int CONSTRUCTOR = -1406495408;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingRuleRestrictChatMembers extends UserPrivacySettingRule {
        public static final int CONSTRUCTOR = 392530897;
        public long[] chatIds;

        public UserPrivacySettingRuleRestrictChatMembers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UserPrivacySettingRuleRestrictChatMembers(long[] jArr) {
            this.chatIds = jArr;
        }
    }

    public static class UserPrivacySettingRuleRestrictContacts extends UserPrivacySettingRule {
        public static final int CONSTRUCTOR = 1008389378;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingRuleRestrictUsers extends UserPrivacySettingRule {
        public static final int CONSTRUCTOR = 622796522;
        public long[] userIds;

        public UserPrivacySettingRuleRestrictUsers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UserPrivacySettingRuleRestrictUsers(long[] jArr) {
            this.userIds = jArr;
        }
    }

    public static class UserPrivacySettingRules extends Object {
        public static final int CONSTRUCTOR = 322477541;
        public UserPrivacySettingRule[] rules;

        public UserPrivacySettingRules() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UserPrivacySettingRules(UserPrivacySettingRule[] userPrivacySettingRuleArr) {
            this.rules = userPrivacySettingRuleArr;
        }
    }

    public static class UserPrivacySettingShowLinkInForwardedMessages extends UserPrivacySetting {
        public static final int CONSTRUCTOR = 592688870;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingShowPhoneNumber extends UserPrivacySetting {
        public static final int CONSTRUCTOR = -791567831;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingShowProfilePhoto extends UserPrivacySetting {
        public static final int CONSTRUCTOR = 1408485877;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingShowStatus extends UserPrivacySetting {
        public static final int CONSTRUCTOR = 1862829310;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static abstract class UserStatus extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class UserStatusEmpty extends UserStatus {
        public static final int CONSTRUCTOR = 164646985;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserStatusLastMonth extends UserStatus {
        public static final int CONSTRUCTOR = 2011940674;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserStatusLastWeek extends UserStatus {
        public static final int CONSTRUCTOR = 129960444;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserStatusOffline extends UserStatus {
        public static final int CONSTRUCTOR = -759984891;
        public int wasOnline;

        public UserStatusOffline() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UserStatusOffline(int i) {
            this.wasOnline = i;
        }
    }

    public static class UserStatusOnline extends UserStatus {
        public static final int CONSTRUCTOR = -1529460876;
        public int expires;

        public UserStatusOnline() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UserStatusOnline(int i) {
            this.expires = i;
        }
    }

    public static class UserStatusRecently extends UserStatus {
        public static final int CONSTRUCTOR = -496024847;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static abstract class UserType extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class UserTypeBot extends UserType {
        public static final int CONSTRUCTOR = 1262387765;
        public boolean canJoinGroups;
        public boolean canReadAllGroupMessages;
        public String inlineQueryPlaceholder;
        public boolean isInline;
        public boolean needLocation;

        public UserTypeBot() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public UserTypeBot(boolean z, boolean z2, boolean z3, String str, boolean z4) {
            this.canJoinGroups = z;
            this.canReadAllGroupMessages = z2;
            this.isInline = z3;
            this.inlineQueryPlaceholder = str;
            this.needLocation = z4;
        }
    }

    public static class UserTypeDeleted extends UserType {
        public static final int CONSTRUCTOR = -1807729372;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserTypeRegular extends UserType {
        public static final int CONSTRUCTOR = -598644325;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserTypeUnknown extends UserType {
        public static final int CONSTRUCTOR = -724541123;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Users extends Object {
        public static final int CONSTRUCTOR = 171203420;
        public int totalCount;
        public long[] userIds;

        public Users() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Users(int i, long[] jArr) {
            this.totalCount = i;
            this.userIds = jArr;
        }
    }

    public static class ValidateOrderInfo extends Function {
        public static final int CONSTRUCTOR = 9480644;
        public boolean allowSave;
        public long chatId;
        public long messageId;
        public OrderInfo orderInfo;

        public ValidateOrderInfo() {
        }

        public ValidateOrderInfo(long j, long j2, OrderInfo orderInfo, boolean z) {
            this.chatId = j;
            this.messageId = j2;
            this.orderInfo = orderInfo;
            this.allowSave = z;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ValidatedOrderInfo extends Object {
        public static final int CONSTRUCTOR = 1511451484;
        public String orderInfoId;
        public ShippingOption[] shippingOptions;

        public ValidatedOrderInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public ValidatedOrderInfo(String str, ShippingOption[] shippingOptionArr) {
            this.orderInfoId = str;
            this.shippingOptions = shippingOptionArr;
        }
    }

    public static abstract class VectorPathCommand extends Object {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Constructors {
        }

        @Override
        public abstract int getConstructor();
    }

    public static class VectorPathCommandCubicBezierCurve extends VectorPathCommand {
        public static final int CONSTRUCTOR = 1229733434;
        public Point endControlPoint;
        public Point endPoint;
        public Point startControlPoint;

        public VectorPathCommandCubicBezierCurve() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public VectorPathCommandCubicBezierCurve(Point point, Point point2, Point point3) {
            this.startControlPoint = point;
            this.endControlPoint = point2;
            this.endPoint = point3;
        }
    }

    public static class VectorPathCommandLine extends VectorPathCommand {
        public static final int CONSTRUCTOR = -614056822;
        public Point endPoint;

        public VectorPathCommandLine() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public VectorPathCommandLine(Point point) {
            this.endPoint = point;
        }
    }

    public static class Venue extends Object {
        public static final int CONSTRUCTOR = 1070406393;
        public String address;
        public String f25440id;
        public Location location;
        public String provider;
        public String title;
        public String type;

        public Venue() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Venue(Location location, String str, String str2, String str3, String str4, String str5) {
            this.location = location;
            this.title = str;
            this.address = str2;
            this.provider = str3;
            this.f25440id = str4;
            this.type = str5;
        }
    }

    public static class Video extends Object {
        public static final int CONSTRUCTOR = 832856268;
        public int duration;
        public String fileName;
        public boolean hasStickers;
        public int height;
        public String mimeType;
        public Minithumbnail minithumbnail;
        public boolean supportsStreaming;
        public Thumbnail thumbnail;
        public File video;
        public int width;

        public Video() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public Video(int i, int i2, int i3, String str, String str2, boolean z, boolean z2, Minithumbnail minithumbnail, Thumbnail thumbnail, File file) {
            this.duration = i;
            this.width = i2;
            this.height = i3;
            this.fileName = str;
            this.mimeType = str2;
            this.hasStickers = z;
            this.supportsStreaming = z2;
            this.minithumbnail = minithumbnail;
            this.thumbnail = thumbnail;
            this.video = file;
        }
    }

    public static class VideoChat extends Object {
        public static final int CONSTRUCTOR = -1374319320;
        public MessageSender defaultParticipantId;
        public int groupCallId;
        public boolean hasParticipants;

        public VideoChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public VideoChat(int i, boolean z, MessageSender messageSender) {
            this.groupCallId = i;
            this.hasParticipants = z;
            this.defaultParticipantId = messageSender;
        }
    }

    public static class VideoNote extends Object {
        public static final int CONSTRUCTOR = -71734726;
        public int duration;
        public int length;
        public Minithumbnail minithumbnail;
        public Thumbnail thumbnail;
        public File video;

        public VideoNote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public VideoNote(int i, int i2, Minithumbnail minithumbnail, Thumbnail thumbnail, File file) {
            this.duration = i;
            this.length = i2;
            this.minithumbnail = minithumbnail;
            this.thumbnail = thumbnail;
            this.video = file;
        }
    }

    public static class ViewMessages extends Function {
        public static final int CONSTRUCTOR = -1155961496;
        public long chatId;
        public boolean forceRead;
        public long[] messageIds;
        public long messageThreadId;

        public ViewMessages() {
        }

        public ViewMessages(long j, long j2, long[] jArr, boolean z) {
            this.chatId = j;
            this.messageThreadId = j2;
            this.messageIds = jArr;
            this.forceRead = z;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ViewTrendingStickerSets extends Function {
        public static final int CONSTRUCTOR = -952416520;
        public long[] stickerSetIds;

        public ViewTrendingStickerSets() {
        }

        public ViewTrendingStickerSets(long[] jArr) {
            this.stickerSetIds = jArr;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class VoiceNote extends Object {
        public static final int CONSTRUCTOR = -2066012058;
        public int duration;
        public String mimeType;
        public File voice;
        public byte[] waveform;

        public VoiceNote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public VoiceNote(int i, byte[] bArr, String str, File file) {
            this.duration = i;
            this.waveform = bArr;
            this.mimeType = str;
            this.voice = file;
        }
    }

    public static class WebPage extends Object {
        public static final int CONSTRUCTOR = -577333714;
        public Animation animation;
        public Audio audio;
        public String author;
        public FormattedText description;
        public String displayUrl;
        public Document document;
        public int duration;
        public int embedHeight;
        public String embedType;
        public String embedUrl;
        public int embedWidth;
        public int instantViewVersion;
        public Photo photo;
        public String siteName;
        public Sticker sticker;
        public String title;
        public String type;
        public String url;
        public Video video;
        public VideoNote videoNote;
        public VoiceNote voiceNote;

        public WebPage() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public WebPage(String str, String str2, String str3, String str4, String str5, FormattedText formattedText, Photo photo, String str6, String str7, int i, int i2, int i3, String str8, Animation animation, Audio audio, Document document, Sticker sticker, Video video, VideoNote videoNote, VoiceNote voiceNote, int i4) {
            this.url = str;
            this.displayUrl = str2;
            this.type = str3;
            this.siteName = str4;
            this.title = str5;
            this.description = formattedText;
            this.photo = photo;
            this.embedUrl = str6;
            this.embedType = str7;
            this.embedWidth = i;
            this.embedHeight = i2;
            this.duration = i3;
            this.author = str8;
            this.animation = animation;
            this.audio = audio;
            this.document = document;
            this.sticker = sticker;
            this.video = video;
            this.videoNote = videoNote;
            this.voiceNote = voiceNote;
            this.instantViewVersion = i4;
        }
    }

    public static class WebPageInstantView extends Object {
        public static final int CONSTRUCTOR = 778202453;
        public InternalLinkType feedbackLink;
        public boolean isFull;
        public boolean isRtl;
        public PageBlock[] pageBlocks;
        public int version;
        public int viewCount;

        public WebPageInstantView() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }

        public WebPageInstantView(PageBlock[] pageBlockArr, int i, int i2, boolean z, boolean z2, InternalLinkType internalLinkType) {
            this.pageBlocks = pageBlockArr;
            this.viewCount = i;
            this.version = i2;
            this.isRtl = z;
            this.isFull = z2;
            this.feedbackLink = internalLinkType;
        }
    }

    public static class WriteGeneratedFilePart extends Function {
        public static final int CONSTRUCTOR = -2062358189;
        public byte[] data;
        public long generationId;
        public int offset;

        public WriteGeneratedFilePart() {
        }

        public WriteGeneratedFilePart(long j, int i, byte[] bArr) {
            this.generationId = j;
            this.offset = i;
            this.data = bArr;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }
}
