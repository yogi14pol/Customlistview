package com.clicks.yogi.custom_listview;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

class AppUtility {

    private String [ ] names;
    private String[ ] lastnames;
    private String [ ] Team;

    private Context context;

    private List<Hello> hello;

    private static AppUtility appUtility;

    private AppUtility(Context context){

        this.context=context;
        names=context.getResources().getStringArray(R.array.Name);
        lastnames = context.getResources().getStringArray(R.array.Lastname);
        Team = context.getResources().getStringArray(R.array.Team);

        hello=new ArrayList<Hello>();

        for(int i=0;i<names.length;i++){
            Hello person=new Hello(names[i],lastnames[i],Team[i]);
            hello.add(person);
        }
    }

    static AppUtility getAppUtility(Context context){
        if(appUtility==null){
            appUtility=new AppUtility(context);
        }
        return appUtility;
    }

    List<Hello> getHello(){
        return this.hello;
    }

}
