package com.example_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity
{
    
    public final static String EXTRA_MESSAGE = "com.example_1.MESSAGE";
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        
        // text field
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
                
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
