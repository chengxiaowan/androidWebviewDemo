package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.createWebView();
    }

    /* 创建 WebView 实例 */
    @SuppressLint("SetJavaScriptEnabled")
    private void createWebView() {
        // 创建 WebView 实例并通过 id 绑定我们刚在布局中创建的 WebView 标签
        // 这里的 R.id.web-view 就是 activity_main.xml 中的 WebView 标签的 id
        final WebView webView = findViewById(R.id.webview);


        // 设置 WebView 允许执行 JavaScript 脚本
        webView.getSettings().setJavaScriptEnabled(true);

        //设置WebView允许DOM缓存
        webView.getSettings().setDomStorageEnabled(true);

        // 确保跳转到另一个网页时仍然在当前 WebView 中显示
        // 而不是调用浏览器打开
        webView.setWebViewClient(new WebViewClient());



        // 加载指定网页
//        String url = "http://192.168.30.84:4200/vrtour/index";
        String url = "https://www.baidu.com";
        webView.loadUrl(url);
    }
}

