package com.example.dharmik;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
public class MainActivity2 extends AppCompatActivity {

    ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView=findViewById(R.id.img1);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url="https://code.whitehatjr.com/coding/trial/register?utm_source=Google_IND_SearchNB&utm_content=Coding_Exact&utm_campaign=IND_SOK_ACQ_Whitehat_Search_NonBrand_Completed_CodingAndCourses_Desktop&utm_medium=130726057610&utm_term=coding%20training%20courses&gclid=Cj0KCQjwpImTBhCmARIsAKr58czTwDzCpw-vyFg_v_PoOBKSMKAwJbxAjSt8MNPALHqqde23m1DDa68aAm7oEALw_wcB";
                Intent i =new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);


            }
        });

    }
    @Override
    public void onBackPressed()
    {

        AlertDialog.Builder alert =new AlertDialog.Builder(MainActivity2.this);
        alert.setTitle("Are you sure you want to exit?");
        alert.setPositiveButton("YES", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                finishAffinity();
            }
        });

        alert.setNegativeButton("NO", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                dialogInterface.cancel();
            }
        });

        alert.show();

    }
}
