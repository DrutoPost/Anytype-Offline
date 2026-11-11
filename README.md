# Anytype (Offline Edition)

This is an offline-first, completely standalone build of Anytype for Android.

## Features & Changes

- **100% Offline**: All online and remote server-dependent features (including server sync, remote telemetry/crash reporting via Amplitude and Sentry, and "Publish to Web") have been removed or disabled.
- **Chat Feature Removed**: All chat functionality and the chat feature module have been removed from the application.
- **Local Profile Creation**: No signup or login requirements. On first launch, create a profile locally with just your name and profile picture.
- **Optimized Size**: Junk assets (such as unused videos) and unused sample code have been pruned to reduce APK size.
- **Automated Release Workflow**: Merges to the repository automatically build signed release APKs and publish them to GitHub Releases.

## Keystore & Credentials

The release signing configuration uses the following credentials:
- **Keystore Location**: `app/drutopost-demo.jks`
- **Keystore Password**: `drutopost123`
- **Key Alias**: `drutopost`
- **Key Password**: `drutopost123`

## Building the Project

### Prerequisites

- JDK 17
- Android SDK with Build Tools 36 and NDK 28

### Build Signed Release APK

```bash
./gradlew :app:assembleRelease
```

The output signed release APK will be located in:
`app/build/outputs/apk/release/`

## License

Licensed under [Any Source Available License 1.0](./LICENSE.md).
