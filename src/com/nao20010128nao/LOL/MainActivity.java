package com.nao20010128nao.LOL;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.io.*;
import java.util.*;
import android.text.*;

public class MainActivity extends Activity
{
	EditText result,length;
	Button start;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		start=(Button)findViewById(R.id.start);
		result=(EditText)findViewById(R.id.result);
		length=(EditText)findViewById(R.id.length);
		start.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				result.setText("");
				new Thread(){
					public void run(){
						int len=Integer.parseInt(length.getText().toString());
						final char[] buf=new char[len];
						Arrays.fill(buf,'\n');
						runOnUiThread(new Runnable(){
							public void run(){
								//result.setText(buf,0,buf.length);
								((ClipboardManager)getSystemService(CLIPBOARD_SERVICE)).setText(new String(buf));
								Toast.makeText(MainActivity.this,"Complete",Toast.LENGTH_LONG).show();
							}
						});
					}
				};
			}
		});
    }
}
