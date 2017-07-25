package com.example.robertkaczmarek.bmicalculator;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ShareActionProvider;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class result1 extends AppCompatActivity {
    protected static final String WEIGHT = "weight";
    protected static final String HEIGHT = "height";
    String fit;
  //  String min;
//    String max;
    Intent b;
    String rr;
    dbhepl dbh;
    Calendar c = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
    String strDate = sdf.format(c.getTime());
    private ShareActionProvider shareActionProvider;
    String w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result1);
        dbh = new dbhepl(this);

        Intent take = getIntent();
         w = take.getStringExtra(WEIGHT);
        String h = take.getStringExtra(HEIGHT);
        Double ww = Double.parseDouble(w);
        Double hh = Double.parseDouble(h);

        Double r = ww / (hh * hh / 10000);
        Double maxR = (hh * hh / 10000) * 24.99;

        Double minR = (hh * hh / 10000) * 18;

        if (r < 15) {
            rr = String.format("%.2f", r);
            TextView wyn = (TextView) findViewById(R.id.result10);
            wyn.setText(rr);
           // wyn.setTextColor(Color.parseColor("#7ED321")); // tak można ustawiać kolor tekstu
            RelativeLayout new1 = (RelativeLayout) findViewById(R.id.activity_result1);
            new1.setBackgroundColor(ContextCompat.getColor(this, R.color.backgrA));
            ImageView obraz = (ImageView) findViewById(R.id.obrazek);
            obraz.setImageResource(R.drawable.person);
            fit = getString(R.string.fitA);
            TextView comment = (TextView) findViewById(R.id.comment);
            comment.setText(fit);
        /*    String sug = getString(R.string.suggestion);
            String and = getString(R.string.aa);
            String kg = getString(R.string.kg);
            min = String.format("%.2f", minR);
            max = String.format("%.2f", maxR);
            TextView interpretation = (TextView) findViewById(R.id.interpretation1);
            interpretation.setText(sug + " \n" + min + " " + and + " " + max + " " + kg); */
        } else if (r >= 15 && r < 17) {
            rr = String.format("%.2f", r);
            TextView wyn = (TextView) findViewById(R.id.result10);
            wyn.setText(rr);
          //  wyn.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary); // tak można ustawiać kolor
            RelativeLayout new1 = (RelativeLayout) findViewById(R.id.activity_result1);
            new1.setBackgroundColor(ContextCompat.getColor(this, R.color.backgrA));
            ImageView obraz = (ImageView) findViewById(R.id.obrazek);
            obraz.setImageResource(R.drawable.person);
            fit = getString(R.string.fitB);
            TextView comment = (TextView) findViewById(R.id.comment);
            comment.setText(fit);
         /*   String sug = getString(R.string.suggestion);
            String and = getString(R.string.aa);
            String kg = getString(R.string.kg);
            min = String.format("%.2f", minR);
            max = String.format("%.2f", maxR);
            TextView interpretation = (TextView) findViewById(R.id.interpretation1);
            interpretation.setText(sug + " \n" + min + " " + and + " " + max + " " + kg); */
        } else if (r >= 17 && r < 18) {
            rr = String.format("%.2f", r);
            TextView wyn = (TextView) findViewById(R.id.result10);
            wyn.setText(rr);
            RelativeLayout new1 = (RelativeLayout) findViewById(R.id.activity_result1);
            new1.setBackgroundColor(ContextCompat.getColor(this, R.color.backgrA));
            ImageView obraz = (ImageView) findViewById(R.id.obrazek);
            obraz.setImageResource(R.drawable.person);
            fit = getString(R.string.fitC);
            TextView comment = (TextView) findViewById(R.id.comment);
            comment.setText(fit);
          /*  String sug = getString(R.string.suggestion);
            String and = getString(R.string.aa);
            String kg = getString(R.string.kg);
            min = String.format("%.2f", minR);
            max = String.format("%.2f", maxR);
            TextView interpretation = (TextView) findViewById(R.id.interpretation1);
            interpretation.setText(sug + " \n" + min + " " + and + " " + max + " " + kg);
            setTheme(R.style.resultCommentN);*/
        } else if (r >= 18 && r < 25) {
            rr = String.format("%.2f", r);
            TextView wyn = (TextView) findViewById(R.id.result10);
            wyn.setText(rr);
            wyn.setTextColor(Color.parseColor("#D0011B"));
            RelativeLayout new1 = (RelativeLayout) findViewById(R.id.activity_result1);
            new1.setBackgroundColor(ContextCompat.getColor(this, R.color.backgrB));
            ImageView obraz = (ImageView) findViewById(R.id.obrazek);
            obraz.setImageResource(R.drawable.person);
            fit = getString(R.string.fitD);
            TextView comment = (TextView) findViewById(R.id.comment);
            comment.setText(fit);
            comment.setTextColor(Color.parseColor("#D0011B"));
          /*  String sug = getString(R.string.suggestion);
            String and = getString(R.string.aa);
            String kg = getString(R.string.kg);
            min = String.format("%.2f", minR);
            max = String.format("%.2f", maxR);
            TextView interpretation = (TextView) findViewById(R.id.interpretation1);
            interpretation.setText(sug + " \n" + min + " " + and + " " + max + " " + kg);
            setTheme(R.style.resultCommentF);*/
        } else if (r >= 25 && r < 30) {
            rr = String.format("%.2f", r);
            TextView wyn = (TextView) findViewById(R.id.result10);
            wyn.setText(rr);
            wyn.setTextColor(Color.parseColor("#FFFFFF"));
            RelativeLayout new1 = (RelativeLayout) findViewById(R.id.activity_result1);
            new1.setBackgroundColor(ContextCompat.getColor(this, R.color.backgrG));
            ImageView obraz = (ImageView) findViewById(R.id.obrazek);
            obraz.setImageResource(R.drawable.person);
            fit = getString(R.string.fatE);
            TextView comment = (TextView) findViewById(R.id.comment);
            comment.setText(fit);
            comment.setTextColor(Color.parseColor("#FFFFFF"));
           /* String sug = getString(R.string.suggestion);
            String and = getString(R.string.aa);
            String kg = getString(R.string.kg);
            min = String.format("%.2f", minR);
            max = String.format("%.2f", maxR);
            TextView interpretation = (TextView) findViewById(R.id.interpretation1);
            interpretation.setText(sug + " \n" + min + " " + and + " " + max + " " + kg);*/
        } else if (r >= 30 && r < 35) {
            rr = String.format("%.2f", r);
            TextView wyn = (TextView) findViewById(R.id.result10);
            wyn.setText(rr);
            wyn.setTextColor(Color.parseColor("#FFFFFF"));
            RelativeLayout new1 = (RelativeLayout) findViewById(R.id.activity_result1);
            new1.setBackgroundColor(ContextCompat.getColor(this, R.color.backgrG));
            ImageView obraz = (ImageView) findViewById(R.id.obrazek);
            obraz.setImageResource(R.drawable.person);
            fit = getString(R.string.fatF);
            TextView comment = (TextView) findViewById(R.id.comment);
            comment.setText(fit);
            comment.setTextColor(Color.parseColor("#FFFFFF"));
           /* String sug = getString(R.string.suggestion);
            String and = getString(R.string.aa);
            String kg = getString(R.string.kg);
            min = String.format("%.2f", minR);
            max = String.format("%.2f", maxR);
            TextView interpretation = (TextView) findViewById(R.id.interpretation1);
            interpretation.setText(sug + " \n" + min + " " + and + " " + max + " " + kg);*/
        } else if (r >= 35 && r < 40) {
            rr = String.format("%.2f", r);
            TextView wyn = (TextView) findViewById(R.id.result10);
            wyn.setText(rr);
            wyn.setTextColor(Color.parseColor("#FFFFFF"));
            RelativeLayout new1 = (RelativeLayout) findViewById(R.id.activity_result1);
            new1.setBackgroundColor(ContextCompat.getColor(this, R.color.backgrG));
            ImageView obraz = (ImageView) findViewById(R.id.obrazek);
            obraz.setImageResource(R.drawable.person);
            fit = getString(R.string.fatG);
            TextView comment = (TextView) findViewById(R.id.comment);
            comment.setText(fit);
            comment.setTextColor(Color.parseColor("#FFFFFF"));
           /* String sug = getString(R.string.suggestion);
            String and = getString(R.string.aa);
            String kg = getString(R.string.kg);
            min = String.format("%.2f", minR);
            max = String.format("%.2f", maxR);
            TextView interpretation = (TextView) findViewById(R.id.interpretation1);
            interpretation.setText(sug + " \n" + min + " " + and + " " + max + " " + kg);*/
        } else if (r > 40) {
            rr = String.format("%.2f", r);
            TextView wyn = (TextView) findViewById(R.id.result10);
            wyn.setText(rr);
            wyn.setTextColor(Color.parseColor("#FFFFFF"));
            RelativeLayout new1 = (RelativeLayout) findViewById(R.id.activity_result1);
            new1.setBackgroundColor(ContextCompat.getColor(this, R.color.backgrG));
            ImageView obraz = (ImageView) findViewById(R.id.obrazek);
            obraz.setImageResource(R.drawable.person);
            fit = getString(R.string.fatH);
            TextView comment = (TextView) findViewById(R.id.comment);
            comment.setText(fit);
            comment.setTextColor(Color.parseColor("#FFFFFF"));
           /* String sug = getString(R.string.suggestion);
            String and = getString(R.string.aa);
            String kg = getString(R.string.kg);
            min = String.format("%.2f", minR);
            max = String.format("%.2f", maxR);
            TextView interpretation = (TextView) findViewById(R.id.interpretation1);
            interpretation.setText(sug + " \n" + min + " " + and + " " + max + " " + kg);
            setTheme(R.style.resultCommentS);*/
        }
        TextView back = (TextView) findViewById(R.id.back);
        if ( r >=  25 ){
            back.setTextColor(Color.parseColor("#FFFFFF"));
        }
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b = new Intent(result1.this, BMI.class);
                startActivity(b);
                finish();
            }

        });

    TextView yourBMI = (TextView) findViewById(R.id.BMI);
        if (r >= 25){
            yourBMI.setTextColor(Color.parseColor("#FFFFFF"));
        }
    }
    public boolean onCreateOptionsMenu(Menu menu) {


        MenuInflater findMenuItems = getMenuInflater();
        findMenuItems.inflate(R.menu.share, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
    String myBMI =getString(R.string.myBMI);
        int id = item.getItemId();

     /*   if (id == R.id.action_Menu) {

            return true;
        } */
         if ( id == R.id.share){

             Intent send = new Intent(Intent.ACTION_SEND);
             send.setType("text/plain");
             send.putExtra(Intent.EXTRA_TEXT, myBMI+" "+ rr);
             startActivity(send);
        }


     /*   else if (id == R.id.udostępnianie){

            return true;
        } */
        else if ( id == R.id.history){
             Cursor cu = dbh.show();
             if (cu.getCount()>0){
                 StringBuilder bul = new StringBuilder();
                 while (cu.moveToNext()){
                     String date2 = cu.getString(0);
                     String weight2 = cu.getString(1);
                     String bmi2 = cu.getString(2);

                     bul.append(date2);
                     bul.append(" - weight " + " " + weight2 + " kg");
                     bul.append("     BMI "+ bmi2 +"\n");
                 }
                 Intent hisRes = new Intent(result1.this, History.class);
                 hisRes.putExtra(History.history, bul.toString());
                 startActivity(hisRes);
             }
         }

         else {
             if (id == R.id.save) {
                 boolean udalo;
                 String Y = getString(R.string.ToastY);
                 String NY = getString(R.string.ToastN);
                 udalo = dbh.insertDate(w.toString(), rr.toString(), strDate.toString());
                 if (udalo) {
                     Toast.makeText(result1.this, Y, Toast.LENGTH_LONG).show();
                 } else {
                     Toast.makeText(result1.this, NY, Toast.LENGTH_LONG).show();
                 }
             }
         }

        return super.onOptionsItemSelected(item);
    }


    }
