package org.erwthmatologio.ptyxiakh;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.app.AlertDialog;



   public class MainActivity extends Activity 
   {
	   
	   String[][] questions = new String[20][6];
	   static int j=0;
	   static int i=0;
	   @Override
          public void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);
          questions[0][0]="Alternate Question";
          questions[0][1]="Correct 1";
          questions[0][2]="Correct 2";
          questions[0][3]="Correct 3";
          questions[0][4]="Correct 4";
          questions[0][5]="4";
          retrieveQuestion();   
   }
    
	  
   public void retrieveQuestion()
   {
	   TextView question = (TextView)findViewById(R.id.textView1);
	   RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioGroup1);

	   for (i = 0; i < radioGroup.getChildCount(); i++)
	            ((RadioButton) radioGroup.getChildAt(i)).setText(questions[j][i+1]);
	   
	   question.setText(questions[j][0]);
	   j++;
	   
	    	
   }
   

   
   public void onRadioButtonClicked(View view)
   {
	   AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
	   dlgAlert.setMessage("This is an alert with no consequence");
	   dlgAlert.setTitle("App Title");
	   dlgAlert.setPositiveButton("OK", null);
	   dlgAlert.setCancelable(false);
	   dlgAlert.create();
	   RadioButton button = (RadioButton) view;
	   RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioGroup1);
	   int k=Integer.parseInt(questions[j-1][i+1]);
	   boolean checked = ((RadioButton) radioGroup.getChildAt(k-1)).isChecked();
	   
	   if (checked)
	   {
                   button.setChecked(false);
		           dlgAlert.setMessage("Correct!");
		           dlgAlert.show();
	   }
	   else
	   {
           button.setChecked(false);
           dlgAlert.setMessage("False!!!!!!");
           dlgAlert.show();
	   }
   }
   
   protected void onPause() {
       super.onPause();
       j=0;
   }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) 
    {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    
}
