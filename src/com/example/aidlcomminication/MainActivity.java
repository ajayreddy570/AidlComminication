package com.example.aidlcomminication;

import java.util.HashMap;

import com.example.aidlcomminication.ServiceCallBack.ServiceStub;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		bindservice();

	}

	private HashMap<Context, ServiceBinder> sConnectionMap = new HashMap<Context, ServiceBinder>();

	private void bindservice() {
		// TODO Auto-generated method stub
		Intent i = new Intent(getApplicationContext(), ServiceCallBack.class);
		startService(i);
		ServiceBinder sc = new ServiceBinder(MainActivity.this);
		sConnectionMap.put(getApplicationContext(), sc);
		bindService(i, sc, 0);

	}

	public class ServiceBinder implements ServiceConnection {

		private ServiceStub mBinder;

		public ServiceBinder(MainActivity mainActivity) {
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			// TODO Auto-generated method stub
			mBinder = (ServiceStub) service;
			try {
				mBinder.getPrecent();
				mBinder.getStatus();
				ServiceCallBack callback = new ServiceCallBack();
				mBinder.registerServiceCallBack(callback);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		@Override
		public void onServiceDisconnected(ComponentName name) {
			// TODO Auto-generated method stub

		}

		private class ServiceCallBack extends IRemoteCallBack.Stub {

			@Override
			public boolean isDownloadCompleted() throws RemoteException {
				// TODO Auto-generated method stub
				System.out.println("AJAY callback.isDownloadCompleted();");
				return false;
			}

		}

	}

}
