package com.gdd.getiodata;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends Activity {
	private WebView webview = null;
	private Button btn = null;
	private ProgressBar progressbar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		/*
		 * webview=(WebView) findViewById(R.id.localwebview);
		 * webview.getSettings().setJavaScriptEnabled(true);
		 * webview.setWebViewClient(new TestWebViewClient());
		 * webview.loadUrl("http://10.118.60.159:9092/pmclient/app/15/lucky.jsp"
		 * );
		 */

		progressbar = (ProgressBar) findViewById(R.id.progressBar1);
		btn=(Button) findViewById(R.id.btn);
		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				showProgress();
			}
		});

	}

	protected void showProgress() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				int maxBar = progressbar.getMax();
				try {
					while (maxBar != progressbar.getProgress()) {
						int stepProgress = maxBar / 10;
						int currentProgress = progressbar.getProgress() + stepProgress;
						progressbar.setProgress(currentProgress);
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}).start();

	}

}
