package sg.edu.rp.c346.id19020620.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView tv;
ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
      tv = (TextView) this.findViewById(R.id.textView) ;
      iv = (ImageView) this.findViewById(R.id.imageView);
        Intent intent = getIntent();
        Boolean isStar = intent.getBooleanExtra("isStar",false);
        if(isStar == false){
            tv.setText("Is not star");
            iv.setImageResource(R.drawable.nostar);
        }
        else{
            tv.setText("Is star");
            iv.setImageResource(R.drawable.star);
        }


    }
}