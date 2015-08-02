package com.nao20010128nao.LOL;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.io.*;
import java.util.*;

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
				int len=Integer.parseInt(length.getText().toString());
				char[] buf=new char[len];
				Arrays.fill(buf,'\n');
				result.setText(buf,0,buf.length);
			}
		});
    }
}
