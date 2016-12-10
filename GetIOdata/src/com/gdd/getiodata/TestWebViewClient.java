package com.gdd.getiodata;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TestWebViewClient extends WebViewClient {
    private String TAG="TestWebViewClient";
	@Override
	public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
		
		
		
		return super.shouldInterceptRequest(view, url);
	}

	@SuppressLint("NewApi")
	@Override
	public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
		// TODO Auto-generated method stub
		return super.shouldInterceptRequest(view, request);
	}

	@Override
	public void onPageFinished(WebView view, String url) {
		
		Log.i(TAG, "onPageFinished++++++++++++++++");
		super.onPageFinished(view, url);
	}

	@Override
	public void onPageStarted(WebView view, String url, Bitmap favicon) {
		// TODO Auto-generated method stub
		Log.i(TAG, "onPageStarted++++++++++++++++");

		super.onPageStarted(view, url, favicon);
	}
	
	
	
	

}
