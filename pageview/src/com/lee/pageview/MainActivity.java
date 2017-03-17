package com.lee.pageview;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import java.util.*;
import android.graphics.*;
import android.support.v4.view.*;

public class MainActivity extends Activity implements OnPageChangeListener
{
	ViewPager v;
	List<View> list;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
		v=(ViewPager)findViewById(R.id.mainViewPager1);
		v.setOnPageChangeListener(this);
		list=new ArrayList<View>();
		LayoutInflater in=LayoutInflater.from(MainActivity.this);
		
		View v1=in.inflate(R.layout.view,null);
		View v2=in.inflate(R.layout.view,null);
		v1.setBackgroundColor(Color.WHITE);
		v2.setBackgroundColor(Color.BLUE);
		list.add(v1);
		list.add(v2);
	   PagerAdapter ad=new PagerAdapter()
	   {
		   @Override
		   public boolean isViewFromObject(View view,Object object)
		   {
			   return view==object;
		   }
			@Override
		  public int getCount()
		  {
			  return list.size();
		  }
			@Override
		  public void destroyItem(ViewGroup c,int p,Object o)
		  {
			 c.removeView(list.get(p));
		  }
		     @Override
	public	Object  instantiateItem(ViewGroup c,int p)
	{
		c.addView(list.get(p));
		return list.get(p);
	}
		  
	
	   };
	   
	   
	   
	   v.setAdapter(ad);
	   
    }

	@Override
	public void onPageScrolled(int p1, float p2, int p3)
	{
		// TODO: Implement this method
	}

	@Override
	public void onPageSelected(int p1)
	{
		// TODO: Implement this method
	}

	@Override
	public void onPageScrollStateChanged(int p1)
	{
		// TODO: Implement this method
	}



	
	
	
}
