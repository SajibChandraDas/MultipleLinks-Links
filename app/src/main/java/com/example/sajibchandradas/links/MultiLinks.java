package com.example.sajibchandradas.links;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MultiLinks extends ActionBarActivity implements View.OnClickListener{

    Button bGoogle,bGmail,bFacebook,bTwitter,bYahoo,bYoutube,
           bBdNewspaper,bEnglishNewspaper,bBBC,bEducationBoardResult,bLearnEnglish, bCricBuzz,bEspnSoccer,
            bGoogleTranslator,bFusionBD,bBossmobi,bMoneyConverter,bNationalEInfo,bInfoPedia;
    String link;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_links);

        bGoogle=(Button)findViewById(R.id.bGoogle);
        bGmail=(Button)findViewById(R.id.bGmail);
        bFacebook=(Button)findViewById(R.id.bFacebook);
        bTwitter=(Button)findViewById(R.id.bTwitter);
        bYahoo=(Button)findViewById(R.id.bYahoo);
        bYoutube=(Button)findViewById(R.id.bYoutube);
        bBdNewspaper=(Button)findViewById(R.id.bBanglaNewespaper);
        bEnglishNewspaper=(Button)findViewById(R.id.bEnglishNewspaper);
        bBBC=(Button)findViewById(R.id.bBBCNewspaper);
        bEducationBoardResult=(Button)findViewById(R.id.bEducationBoardResult);
        bLearnEnglish=(Button)findViewById(R.id.bLearningEnglish);
        bEspnSoccer=(Button)findViewById(R.id.bEspnSoccer);
        bCricBuzz=(Button)findViewById(R.id.bCricBuzz);
        bGoogleTranslator=(Button)findViewById(R.id.bGoogleTranslator);
        bFusionBD=(Button)findViewById(R.id.bFusionBD);
        bBossmobi=(Button)findViewById(R.id.bBossMobi);
        bMoneyConverter=(Button)findViewById(R.id.bMoneyConverter);
        bNationalEInfo=(Button)findViewById(R.id.bNationalEInfo);
        bInfoPedia=(Button)findViewById(R.id.bInfoPedia);

        bGoogle.setOnClickListener(this);
        bGmail.setOnClickListener(this);
        bFacebook.setOnClickListener(this);
        bTwitter.setOnClickListener(this);
        bYahoo.setOnClickListener(this);
        bYoutube.setOnClickListener(this);
        bBdNewspaper.setOnClickListener(this);
        bEnglishNewspaper.setOnClickListener(this);
        bBBC.setOnClickListener(this);
        bEducationBoardResult.setOnClickListener(this);
        bLearnEnglish.setOnClickListener(this);
        bEspnSoccer.setOnClickListener(this);
        bCricBuzz.setOnClickListener(this);
        bGoogleTranslator.setOnClickListener(this);
        bFusionBD.setOnClickListener(this);
        bBossmobi.setOnClickListener(this);
        bMoneyConverter.setOnClickListener(this);
        bNationalEInfo.setOnClickListener(this);
        bInfoPedia.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.bGoogle:

                link="https://www.google.com";
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);
                Toast.makeText(this,"You have selected Google",Toast.LENGTH_LONG).show();
                break;

            case R.id.bGmail:
                link="https://www.gmail.com/intl/en/mail/help/about.html";
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);
                Toast.makeText(this,"You have selected Gmail",Toast.LENGTH_LONG).show();
                break;

            case R.id.bFacebook:
                 link="https://m.facebook.com/";
                 intent=new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);
                Toast.makeText(this,"You have selected Facebook",Toast.LENGTH_LONG).show();
                break;

            case R.id.bTwitter:
                 link="https://twitter.com/";
                 intent=new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);
                Toast.makeText(this,"You have selected Twitter",Toast.LENGTH_LONG).show();
                break;

            case R.id.bYahoo:
                 link="https://www.yahoo.com/";
                 intent=new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);
                Toast.makeText(this,"You have selected Yahoo",Toast.LENGTH_LONG).show();
                break;

            case R.id.bYoutube:
                 link="https://www.youtube.com";
                 intent=new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);
                Toast.makeText(this,"You have selected Youtube",Toast.LENGTH_LONG).show();
                break;

            case R.id.bBanglaNewespaper:
                link="http://m.prothom-alo.com/";
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);
                Toast.makeText(this,"You have selected Prothom Alo",Toast.LENGTH_LONG).show();
                break;

            case R.id.bEnglishNewspaper:
                link="http://m.bdnews24.com/";
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);
                Toast.makeText(this,"You have selected BDNews24.com",Toast.LENGTH_LONG).show();
                break;

            case R.id.bBBCNewspaper:
                link="http://http://www.bbc.co.uk/bengali";
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);
                Toast.makeText(this,"You have selected BBC",Toast.LENGTH_LONG).show();
                break;

            case R.id.bEducationBoardResult:
                link="http://www.educationboardresults.gov.bd/regular/index.php";
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);
                Toast.makeText(this,"You have selected Education Board Result",Toast.LENGTH_LONG).show();
                break;

            case R.id.bLearningEnglish:
                link="http://www.english-at-home.com/";
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);
                Toast.makeText(this,"You have selected Learn English (English at Home)",Toast.LENGTH_LONG).show();
                break;

            case R.id.bGoogleTranslator:
                link="https://translate.google.com/";
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);
                Toast.makeText(this,"You have selected Google Translator",Toast.LENGTH_LONG).show();
                break;

            case R.id.bCricBuzz:
                link="http://m.cricbuzz.com/";
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);
                Toast.makeText(this,"You have selected Cric Buzz",Toast.LENGTH_LONG).show();
                break;

            case R.id.bEspnSoccer:
                link="http://www.espnfc.com/scores";
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);
                Toast.makeText(this,"You have selected ESPN SOCCER",Toast.LENGTH_LONG).show();
                break;

            case R.id.bFusionBD:
                link="http://fusionbd.com/";
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);
                Toast.makeText(this,"You have selected Fusionbd.com",Toast.LENGTH_LONG).show();
                break;

            case R.id.bBossMobi:
                link="http://www.bossmobi.com/";
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);
                Toast.makeText(this,"You have selected BossMobi.com",Toast.LENGTH_LONG).show();
                break;

            case R.id.bMoneyConverter:
                link="http://themoneyconverter.com/";
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);
                Toast.makeText(this,"You have selected Money Converter",Toast.LENGTH_LONG).show();
                break;

            case R.id.bNationalEInfo:
                link="http://www.infokosh.gov.bd/";
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);
                Toast.makeText(this,"You have selected National E-Info",Toast.LENGTH_LONG).show();
                break;
            case R.id.bInfoPedia:
                link="http://infopedia.com.bd/";
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);
                Toast.makeText(this,"You have selected InfoPedia.com.bd",Toast.LENGTH_LONG).show();
                break;
        }

    }
}
