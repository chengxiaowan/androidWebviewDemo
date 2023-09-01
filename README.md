## ANDROID WebView测试项目

用于测试网页在webwiew下的兼容性apk壳子，推荐使用工具AndroidStudio运行。

# 使用说明
- `app/src/main/java/com/example/testapp/MainActivity.java`中定义并开启了Webview，默认已开启JavaScript支持和DOM缓存，可根据需要自行修改。
- `String url`为打开的指定网页，可自行修改。
- 调试工具推荐使用chrmme的`chrome://inspect`，具体使用方法请自行搜索。
- `app/src/main/AndroidManifest.xml`为AndroidManifest文件，可自行修改以满足测试需求。