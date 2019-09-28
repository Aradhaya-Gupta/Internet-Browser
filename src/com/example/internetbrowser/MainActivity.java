package com.example.internetbrowser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity
{
	Button btn1,btn2,btn3,btn4,btn5;
	EditText ed1;
	WebView wv1;
	String url="https://www.google.com";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		btn1=(Button)findViewById(R.id.button1);
		btn2=(Button)findViewById(R.id.button2);
		btn3=(Button)findViewById(R.id.button3);
		btn4=(Button)findViewById(R.id.button4);
		btn5=(Button)findViewById(R.id.button5);
		ed1=(EditText)findViewById(R.id.editText1);
		wv1=(WebView)findViewById(R.id.webView1);
		wv1.getSettings().setJavaScriptEnabled(true);
		wv1.setWebViewClient(new Browse());
		ed1.setText(url);
		wv1.loadUrl(url);
		btn1.setOnClickListener(new View.OnClickListener() 
		{
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(wv1.canGoBack())
				{
					wv1.goBack();
				}
			}
		});
		btn2.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(wv1.canGoForward())
				{
					wv1.goForward();
				}
				
			}
		});
		btn3.setOnClickListener(new View.OnClickListener() {
			
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				wv1.reload();
			}
		});
		btn4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				wv1.clearHistory();
			}
		});
		btn5.setOnClickListener(new View.OnClickListener() {
			
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				url=ed1.getText().toString();
				wv1.loadUrl(url);
				
			}
		});
	}
}