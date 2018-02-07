package com.tudelft.samjanssen.example1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Smart Phone Sensing Example 1. Working with buttons and text.
 */
public class MainActivity extends Activity implements OnClickListener {

    /**
     * The button that can be pressed.
     */
    private Button button;
    /**
     * The image view.
     */
    private ImageView imageView;
    /**
     * The text view.
     */
    private TextView textView;
    /**
     * The edit text box.
     */
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // this happens when the main activity is created
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // we create each of our elements
        button = (Button) findViewById(R.id.button1);
        imageView = (ImageView) findViewById(R.id.imageView1);
        textView = (TextView) findViewById(R.id.textView1);
        editText = (EditText) findViewById(R.id.editText1);

        // we set a click listener for our button, which is the current object.
        // This is possible because our class implements a 'OnClickListener'
        button.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        // This method is called when our button is clicked.
        textView.setText(editText.getText());
    }
}