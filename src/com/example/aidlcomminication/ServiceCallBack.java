package com.example.aidlcomminication;

import java.lang.ref.WeakReference;

import com.example.aidlcomminication.IRemoteCallBack.Stub;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class ServiceCallBack extends Service {

	private final IBinder mBinder = new ServiceStub(this);

	// Two way we can pass service object
	// 1. with binder constuctor
	// 2. direct we can acess Service instace by call "ServiceCallBack.this"

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return mBinder;
	}

	@Override
	public void onCreate() {

	}

	/** The service is starting, due to a call to startService() */
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		return 1;
	}

	// Avoid using non-static inner classes in an activity if instances of the
	// inner
	// class could outlive the activity's lifecycle. Instead,
	// prefer static inner classes and hold a weak reference to the activity
	// inside.

	static public class ServiceStub extends IRemote.Stub {
		WeakReference<ServiceCallBack> serviceweakref;
		private IRemoteCallBack callback;

		public ServiceStub(ServiceCallBack serviceCallBack) {
			// TODO Auto-generated constructor stub
			serviceweakref = new WeakReference<ServiceCallBack>(serviceCallBack);
		}

		public boolean getStatus() throws RemoteException {
			// TODO Auto-generated method stub
			return serviceweakref.get().getStatus();
		}

		public int getPrecent() throws RemoteException {
			// TODO Auto-generated method stub
			return serviceweakref.get().getPrecent();
		}

		@Override
		public void registerServiceCallBack(IRemoteCallBack cb)
				throws RemoteException {
			// TODO Auto-generated method stub
			callback = cb;
			callback.isDownloadCompleted();

		}

	}

	private boolean getStatus() {
		System.out.println("AJAY getStatus ");
		return true;

	}

	private int getPrecent() {
		System.out.println("AJAY getPrecent ");
		return 1;

	}

}
